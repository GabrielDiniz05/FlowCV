# Run docker:  docker build -t dbpgsql .
FROM postgres:14.3

RUN localedef -i pt_BR -c -f UTF-8 -A /usr/share/locale/locale.alias pt_BR.UTF-8

ENV POSTGRES_PASSWORD=t4B3Bx5GwCYy
ENV LANG=pt_BR.utf8
ENV PGDATA=/var/lib/postgresql/data/pgdata

VOLUME [ "pgdata:/var/lib/postgresql/data/pgdata" ]

COPY ./schema.sql /docker-entrypoint-initdb.d/

EXPOSE 5432
