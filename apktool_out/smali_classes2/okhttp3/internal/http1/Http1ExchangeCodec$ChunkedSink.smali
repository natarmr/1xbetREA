.class final Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s5k0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http1/Http1ExchangeCodec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ChunkedSink"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;",
        "La/s5k0;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:La/qwq;

.field public b:Z

.field public final synthetic c:Lokhttp3/internal/http1/Http1ExchangeCodec;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http1/Http1ExchangeCodec;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 5
    .line 6
    new-instance v0, La/qwq;

    .line 7
    .line 8
    iget-object p1, p1, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 9
    .line 10
    invoke-interface {p1}, Lokhttp3/internal/connection/BufferedSocket;->a()La/t99;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, La/s5k0;->h()La/fmq0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v0, p1}, La/qwq;-><init>(La/fmq0;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;->a:La/qwq;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final F0(La/f99;J)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v0, p2, v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 13
    .line 14
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 15
    .line 16
    invoke-interface {p0}, Lokhttp3/internal/connection/BufferedSocket;->a()La/t99;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0, p2, p3}, La/t99;->I0(J)La/t99;

    .line 21
    .line 22
    .line 23
    const-string v0, "\r\n"

    .line 24
    .line 25
    invoke-interface {p0, v0}, La/t99;->D(Ljava/lang/String;)La/t99;

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, p1, p2, p3}, La/s5k0;->F0(La/f99;J)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, v0}, La/t99;->D(Ljava/lang/String;)La/t99;

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    const-string p0, "closed"

    .line 36
    .line 37
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final declared-synchronized close()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;->b:Z

    .line 10
    .line 11
    iget-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 12
    .line 13
    iget-object v0, v0, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 14
    .line 15
    invoke-interface {v0}, Lokhttp3/internal/connection/BufferedSocket;->a()La/t99;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "0\r\n\r\n"

    .line 20
    .line 21
    invoke-interface {v0, v1}, La/t99;->D(Ljava/lang/String;)La/t99;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 25
    .line 26
    iget-object v0, v0, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 27
    .line 28
    invoke-interface {v0}, Lokhttp3/internal/connection/BufferedSocket;->a()La/t99;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, La/t99;->flush()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;->a:La/qwq;

    .line 36
    .line 37
    iget-object v1, v0, La/qwq;->e:La/fmq0;

    .line 38
    .line 39
    sget-object v2, La/fmq0;->d:La/dmq0;

    .line 40
    .line 41
    iput-object v2, v0, La/qwq;->e:La/fmq0;

    .line 42
    .line 43
    invoke-virtual {v1}, La/fmq0;->a()La/fmq0;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, La/fmq0;->b()La/fmq0;

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 50
    .line 51
    const/4 v1, 0x3

    .line 52
    iput-byte v1, v0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;->c:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 9
    .line 10
    iget-object v0, v0, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 11
    .line 12
    invoke-interface {v0}, Lokhttp3/internal/connection/BufferedSocket;->a()La/t99;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, La/t99;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    throw v0
.end method

.method public final h()La/fmq0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;->a:La/qwq;

    .line 2
    .line 3
    return-object p0
.end method
