.class final Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;
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
    name = "KnownLengthSink"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;",
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
    iput-object p1, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;->c:Lokhttp3/internal/http1/Http1ExchangeCodec;

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
    iput-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;->a:La/qwq;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final F0(La/f99;J)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-wide v1, p1, La/f99;->b:J

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    move-wide v5, p2

    .line 10
    invoke-static/range {v1 .. v6}, Lokhttp3/internal/_UtilCommonKt;->a(JJJ)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;->c:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 14
    .line 15
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 16
    .line 17
    invoke-interface {p0}, Lokhttp3/internal/connection/BufferedSocket;->a()La/t99;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0, p1, v5, v6}, La/s5k0;->F0(La/f99;J)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string p0, "closed"

    .line 26
    .line 27
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;->b:Z

    .line 8
    .line 9
    iget-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;->c:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 10
    .line 11
    iget-object v1, v0, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 12
    .line 13
    invoke-interface {v1}, Lokhttp3/internal/connection/BufferedSocket;->a()La/t99;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, La/t99;->flush()V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;->a:La/qwq;

    .line 21
    .line 22
    iget-object v1, p0, La/qwq;->e:La/fmq0;

    .line 23
    .line 24
    sget-object v2, La/fmq0;->d:La/dmq0;

    .line 25
    .line 26
    iput-object v2, p0, La/qwq;->e:La/fmq0;

    .line 27
    .line 28
    invoke-virtual {v1}, La/fmq0;->a()La/fmq0;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, La/fmq0;->b()La/fmq0;

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x3

    .line 35
    iput-byte p0, v0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 36
    .line 37
    return-void
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;->c:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 7
    .line 8
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 9
    .line 10
    invoke-interface {p0}, Lokhttp3/internal/connection/BufferedSocket;->a()La/t99;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, La/t99;->flush()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final h()La/fmq0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;->a:La/qwq;

    .line 2
    .line 3
    return-object p0
.end method
