.class public final Lokhttp3/internal/http1/Http1ExchangeCodec;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/http/ExchangeCodec;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;,
        Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;,
        Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;,
        Lokhttp3/internal/http1/Http1ExchangeCodec$Companion;,
        Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;,
        Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;,
        Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lokhttp3/internal/http1/Http1ExchangeCodec;",
        "Lokhttp3/internal/http/ExchangeCodec;",
        "KnownLengthSink",
        "ChunkedSink",
        "AbstractSource",
        "FixedLengthSource",
        "ChunkedSource",
        "UnknownLengthSource",
        "Companion",
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


# static fields
.field public static final f:Lokhttp3/Headers;


# instance fields
.field public final a:Lokhttp3/OkHttpClient;

.field public final b:Lokhttp3/internal/http/ExchangeCodec$Carrier;

.field public final c:Lokhttp3/internal/connection/BufferedSocket;

.field public d:B

.field public final e:Lokhttp3/internal/http1/HeadersReader;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lokhttp3/Headers;->b:Lokhttp3/Headers;

    .line 2
    .line 3
    const-string v0, "OkHttp-Response-Body"

    .line 4
    .line 5
    const-string v1, "Truncated"

    .line 6
    .line 7
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lokhttp3/Headers$Companion;->a([Ljava/lang/String;)Lokhttp3/Headers;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lokhttp3/internal/http1/Http1ExchangeCodec;->f:Lokhttp3/Headers;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lokhttp3/OkHttpClient;Lokhttp3/internal/http/ExchangeCodec$Carrier;Lokhttp3/internal/connection/BufferedSocket;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->a:Lokhttp3/OkHttpClient;

    .line 8
    .line 9
    iput-object p2, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->b:Lokhttp3/internal/http/ExchangeCodec$Carrier;

    .line 10
    .line 11
    iput-object p3, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 12
    .line 13
    new-instance p1, Lokhttp3/internal/http1/HeadersReader;

    .line 14
    .line 15
    invoke-interface {p3}, Lokhttp3/internal/connection/BufferedSocket;->b()La/u99;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-direct {p1, p2}, Lokhttp3/internal/http1/HeadersReader;-><init>(La/u99;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->e:Lokhttp3/internal/http1/HeadersReader;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 2
    .line 3
    invoke-interface {p0}, Lokhttp3/internal/connection/BufferedSocket;->a()La/t99;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, La/t99;->flush()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final b(Lokhttp3/Response;)La/emk0;
    .locals 10

    .line 1
    invoke-static {p1}, Lokhttp3/internal/http/HttpHeaders;->a(Lokhttp3/Response;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p1, v1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    invoke-virtual {p0, p1, v0, v1}, Lokhttp3/internal/http1/Http1ExchangeCodec;->k(Lokhttp3/HttpUrl;J)La/emk0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string v0, "Transfer-Encoding"

    .line 19
    .line 20
    iget-object v2, p1, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 21
    .line 22
    invoke-virtual {v2, v0}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v2, 0x0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    move-object v0, v2

    .line 30
    :cond_1
    const-string v3, "chunked"

    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const-string v3, "state: "

    .line 37
    .line 38
    const/4 v4, 0x5

    .line 39
    const/4 v5, 0x4

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    iget-object p1, v1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 43
    .line 44
    iget-byte v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 45
    .line 46
    if-ne v0, v5, :cond_2

    .line 47
    .line 48
    iput-byte v4, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 49
    .line 50
    new-instance v0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;

    .line 51
    .line 52
    invoke-direct {v0, p0, p1}, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;-><init>(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    iget-byte p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 57
    .line 58
    invoke-static {p0, v3}, La/e9d0;->p(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :cond_3
    invoke-static {p1}, Lokhttp3/internal/_UtilJvmKt;->e(Lokhttp3/Response;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    const-wide/16 v8, -0x1

    .line 67
    .line 68
    cmp-long p1, v6, v8

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    iget-object p1, v1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 73
    .line 74
    invoke-virtual {p0, p1, v6, v7}, Lokhttp3/internal/http1/Http1ExchangeCodec;->k(Lokhttp3/HttpUrl;J)La/emk0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_4
    iget-object p1, v1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 80
    .line 81
    iget-byte v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 82
    .line 83
    if-ne v0, v5, :cond_5

    .line 84
    .line 85
    iput-byte v4, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 86
    .line 87
    iget-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->b:Lokhttp3/internal/http/ExchangeCodec$Carrier;

    .line 88
    .line 89
    invoke-interface {v0}, Lokhttp3/internal/http/ExchangeCodec$Carrier;->c()V

    .line 90
    .line 91
    .line 92
    new-instance v0, Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-direct {v0, p0, p1}, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;-><init>(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :cond_5
    iget-byte p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 102
    .line 103
    invoke-static {p0, v3}, La/e9d0;->p(ILjava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-object v2
.end method

.method public final c(Lokhttp3/Response;)J
    .locals 1

    .line 1
    invoke-static {p1}, Lokhttp3/internal/http/HttpHeaders;->a(Lokhttp3/Response;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    iget-object p0, p1, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 11
    .line 12
    const-string v0, "Transfer-Encoding"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    :cond_1
    const-string v0, "chunked"

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    const-wide/16 p0, -0x1

    .line 30
    .line 31
    return-wide p0

    .line 32
    :cond_2
    invoke-static {p1}, Lokhttp3/internal/_UtilJvmKt;->e(Lokhttp3/Response;)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    return-wide p0
.end method

.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->b:Lokhttp3/internal/http/ExchangeCodec$Carrier;

    .line 2
    .line 3
    invoke-interface {p0}, Lokhttp3/internal/http/ExchangeCodec$Carrier;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Lokhttp3/Request;J)La/s5k0;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Transfer-Encoding"

    .line 5
    .line 6
    iget-object p1, p1, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "chunked"

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 v0, 0x0

    .line 19
    const-string v1, "state: "

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    const/4 v3, 0x1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-byte p1, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 26
    .line 27
    if-ne p1, v3, :cond_0

    .line 28
    .line 29
    iput-byte v2, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 30
    .line 31
    new-instance p1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;-><init>(Lokhttp3/internal/http1/Http1ExchangeCodec;)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_0
    iget-byte p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 38
    .line 39
    invoke-static {p0, v1}, La/e9d0;->p(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_1
    const-wide/16 v4, -0x1

    .line 44
    .line 45
    cmp-long p1, p2, v4

    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    iget-byte p1, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 50
    .line 51
    if-ne p1, v3, :cond_2

    .line 52
    .line 53
    iput-byte v2, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 54
    .line 55
    new-instance p1, Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;

    .line 56
    .line 57
    invoke-direct {p1, p0}, Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;-><init>(Lokhttp3/internal/http1/Http1ExchangeCodec;)V

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_2
    iget-byte p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 62
    .line 63
    invoke-static {p0, v1}, La/e9d0;->p(ILjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_3
    const-string p0, "Cannot stream a request body without chunked encoding or a known content length!"

    .line 68
    .line 69
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method

.method public final e(Lokhttp3/Request;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->b:Lokhttp3/internal/http/ExchangeCodec$Carrier;

    .line 5
    .line 6
    invoke-interface {v0}, Lokhttp3/internal/http/ExchangeCodec$Carrier;->e()Lokhttp3/Route;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v2, p1, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const/16 v2, 0x20

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v2, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 35
    .line 36
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->f()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 43
    .line 44
    if-ne v0, v3, :cond_0

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->b()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->d()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-eqz v2, :cond_1

    .line 59
    .line 60
    new-instance v3, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/16 v0, 0x3f

    .line 66
    .line 67
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    :goto_0
    const-string v0, " HTTP/1.1"

    .line 81
    .line 82
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget-object p1, p1, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 90
    .line 91
    invoke-virtual {p0, p1, v0}, Lokhttp3/internal/http1/Http1ExchangeCodec;->m(Lokhttp3/Headers;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-byte p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public final g(Z)Lokhttp3/Response$Builder;
    .locals 14

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->e:Lokhttp3/internal/http1/HeadersReader;

    .line 2
    .line 3
    iget-object v1, v0, Lokhttp3/internal/http1/HeadersReader;->a:La/u99;

    .line 4
    .line 5
    iget-byte v2, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x3

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-eq v2, v4, :cond_1

    .line 13
    .line 14
    const/4 v6, 0x2

    .line 15
    if-eq v2, v6, :cond_1

    .line 16
    .line 17
    if-ne v2, v5, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p1, "state: "

    .line 21
    .line 22
    iget-byte p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 23
    .line 24
    invoke-static {p0, p1}, La/e9d0;->p(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_1
    :goto_0
    :try_start_0
    iget-wide v6, v0, Lokhttp3/internal/http1/HeadersReader;->b:J

    .line 29
    .line 30
    invoke-interface {v1, v6, v7}, La/u99;->A(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-wide v6, v0, Lokhttp3/internal/http1/HeadersReader;->b:J

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    int-to-long v8, v8

    .line 41
    sub-long/2addr v6, v8

    .line 42
    iput-wide v6, v0, Lokhttp3/internal/http1/HeadersReader;->b:J

    .line 43
    .line 44
    invoke-static {v2}, Lokhttp3/internal/http/StatusLine$Companion;->a(Ljava/lang/String;)Lokhttp3/internal/http/StatusLine;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget v6, v2, Lokhttp3/internal/http/StatusLine;->b:I

    .line 49
    .line 50
    new-instance v7, Lokhttp3/Response$Builder;

    .line 51
    .line 52
    invoke-direct {v7}, Lokhttp3/Response$Builder;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v8, v2, Lokhttp3/internal/http/StatusLine;->a:Lokhttp3/Protocol;

    .line 56
    .line 57
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iput-object v8, v7, Lokhttp3/Response$Builder;->b:Lokhttp3/Protocol;

    .line 61
    .line 62
    iput v6, v7, Lokhttp3/Response$Builder;->c:I

    .line 63
    .line 64
    iget-object v2, v2, Lokhttp3/internal/http/StatusLine;->c:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iput-object v2, v7, Lokhttp3/Response$Builder;->d:Ljava/lang/String;

    .line 70
    .line 71
    new-instance v2, Lokhttp3/Headers$Builder;

    .line 72
    .line 73
    invoke-direct {v2}, Lokhttp3/Headers$Builder;-><init>()V

    .line 74
    .line 75
    .line 76
    :goto_1
    iget-wide v8, v0, Lokhttp3/internal/http1/HeadersReader;->b:J

    .line 77
    .line 78
    invoke-interface {v1, v8, v9}, La/u99;->A(J)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    iget-wide v9, v0, Lokhttp3/internal/http1/HeadersReader;->b:J

    .line 83
    .line 84
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    int-to-long v11, v11

    .line 89
    sub-long/2addr v9, v11

    .line 90
    iput-wide v9, v0, Lokhttp3/internal/http1/HeadersReader;->b:J

    .line 91
    .line 92
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v9

    .line 96
    const/4 v10, 0x4

    .line 97
    if-nez v9, :cond_5

    .line 98
    .line 99
    invoke-static {v2}, Lokhttp3/internal/_HeadersCommonKt;->b(Lokhttp3/Headers$Builder;)Lokhttp3/Headers;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Lokhttp3/internal/_HeadersCommonKt;->d(Lokhttp3/Headers;)Lokhttp3/Headers$Builder;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, v7, Lokhttp3/Response$Builder;->f:Lokhttp3/Headers$Builder;

    .line 108
    .line 109
    const/16 v0, 0x64

    .line 110
    .line 111
    if-eqz p1, :cond_2

    .line 112
    .line 113
    if-ne v6, v0, :cond_2

    .line 114
    .line 115
    return-object v3

    .line 116
    :cond_2
    if-ne v6, v0, :cond_3

    .line 117
    .line 118
    iput-byte v5, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 119
    .line 120
    return-object v7

    .line 121
    :catch_0
    move-exception p1

    .line 122
    goto :goto_2

    .line 123
    :cond_3
    const/16 p1, 0x66

    .line 124
    .line 125
    if-gt p1, v6, :cond_4

    .line 126
    .line 127
    const/16 p1, 0xc8

    .line 128
    .line 129
    if-ge v6, p1, :cond_4

    .line 130
    .line 131
    iput-byte v5, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 132
    .line 133
    return-object v7

    .line 134
    :cond_4
    iput-byte v10, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 135
    .line 136
    return-object v7

    .line 137
    :cond_5
    const-string v9, ""

    .line 138
    .line 139
    const/16 v11, 0x3a

    .line 140
    .line 141
    invoke-static {v11, v4, v10, v8}, Lkotlin/text/StringsKt;->U(CIILjava/lang/CharSequence;)I

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    const/4 v12, -0x1

    .line 146
    const/4 v13, 0x0

    .line 147
    if-eq v10, v12, :cond_6

    .line 148
    .line 149
    invoke-virtual {v8, v13, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    add-int/lit8 v10, v10, 0x1

    .line 154
    .line 155
    invoke-virtual {v8, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-static {v2, v9, v8}, Lokhttp3/internal/_HeadersCommonKt;->a(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_6
    invoke-virtual {v8, v13}, Ljava/lang/String;->charAt(I)C

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    if-ne v10, v11, :cond_7

    .line 168
    .line 169
    invoke-virtual {v8, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-static {v2, v9, v8}, Lokhttp3/internal/_HeadersCommonKt;->a(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_7
    invoke-static {v2, v9, v8}, Lokhttp3/internal/_HeadersCommonKt;->a(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :goto_2
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->b:Lokhttp3/internal/http/ExchangeCodec$Carrier;

    .line 182
    .line 183
    invoke-interface {p0}, Lokhttp3/internal/http/ExchangeCodec$Carrier;->e()Lokhttp3/Route;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    iget-object p0, p0, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 188
    .line 189
    iget-object p0, p0, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 190
    .line 191
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->h()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    const-string v0, "unexpected end of stream on "

    .line 196
    .line 197
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-static {p0, p1}, La/csj;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    return-object v3
.end method

.method public final h()V
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 2
    .line 3
    invoke-interface {p0}, Lokhttp3/internal/connection/BufferedSocket;->a()La/t99;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, La/t99;->flush()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final i()La/njk0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j()Lokhttp3/internal/http/ExchangeCodec$Carrier;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->b:Lokhttp3/internal/http/ExchangeCodec$Carrier;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k(Lokhttp3/HttpUrl;J)La/emk0;
    .locals 2

    .line 1
    iget-byte v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput-byte v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 8
    .line 9
    new-instance v0, Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2, p3}, Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;-><init>(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;J)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string p1, "state: "

    .line 16
    .line 17
    iget-byte p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 18
    .line 19
    invoke-static {p0, p1}, La/e9d0;->p(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final l(Lokhttp3/Response;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lokhttp3/internal/_UtilJvmKt;->e(Lokhttp3/Response;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object p1, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 13
    .line 14
    iget-object p1, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0, v1}, Lokhttp3/internal/http1/Http1ExchangeCodec;->k(Lokhttp3/HttpUrl;J)La/emk0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const p1, 0x7fffffff

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p1}, Lokhttp3/internal/_UtilJvmKt;->g(La/emk0;I)Z

    .line 24
    .line 25
    .line 26
    check-cast p0, Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;

    .line 27
    .line 28
    invoke-virtual {p0}, Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;->close()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final m(Lokhttp3/Headers;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-byte v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lokhttp3/internal/connection/BufferedSocket;

    .line 6
    .line 7
    invoke-interface {v0}, Lokhttp3/internal/connection/BufferedSocket;->a()La/t99;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1, p2}, La/t99;->D(Ljava/lang/String;)La/t99;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string v1, "\r\n"

    .line 16
    .line 17
    invoke-interface {p2, v1}, La/t99;->D(Ljava/lang/String;)La/t99;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lokhttp3/Headers;->size()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const/4 v2, 0x0

    .line 25
    :goto_0
    if-ge v2, p2, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Lokhttp3/internal/connection/BufferedSocket;->a()La/t99;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {p1, v2}, Lokhttp3/internal/_HeadersCommonKt;->c(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-interface {v3, v4}, La/t99;->D(Ljava/lang/String;)La/t99;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const-string v4, ": "

    .line 40
    .line 41
    invoke-interface {v3, v4}, La/t99;->D(Ljava/lang/String;)La/t99;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {p1, v2}, Lokhttp3/internal/_HeadersCommonKt;->e(Lokhttp3/Headers;I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {v3, v4}, La/t99;->D(Ljava/lang/String;)La/t99;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v3, v1}, La/t99;->D(Ljava/lang/String;)La/t99;

    .line 54
    .line 55
    .line 56
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-interface {v0}, Lokhttp3/internal/connection/BufferedSocket;->a()La/t99;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {p1, v1}, La/t99;->D(Ljava/lang/String;)La/t99;

    .line 64
    .line 65
    .line 66
    const/4 p1, 0x1

    .line 67
    iput-byte p1, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    const-string p1, "state: "

    .line 71
    .line 72
    iget-byte p0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec;->d:B

    .line 73
    .line 74
    invoke-static {p0, p1}, La/e9d0;->p(ILjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method
