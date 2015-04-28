#!/bin/sh

if ! [ -x /usr/bin/blackbox-ci-controller ]; then
	exit 0
fi

case "$1" in
	start)
		/usr/bin/blackbox-ci-controller /dev/ci0 &
		;;
	stop)
		killall -9 blackbox-ci-controller
		;;
	restart|reload)
		$0 stop
		$0 start
		;;
	*)
		echo "Usage: $0 {start|stop|restart}"
		exit 1
		;;
esac

exit 0
