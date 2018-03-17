FROM chun/ubuntu8888

ADD Blob /var/www/html/

CMD apachectl -D FOREGROUND

RUN rm var/www/html/index.html

