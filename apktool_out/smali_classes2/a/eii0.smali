.class public final La/eii0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/zn00;

.field public final b:I

.field public final c:La/n0o0;


# direct methods
.method public constructor <init>(La/zn00;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/eii0;->a:La/zn00;

    .line 5
    .line 6
    iput p2, p0, La/eii0;->b:I

    .line 7
    .line 8
    new-instance p1, La/gei0;

    .line 9
    .line 10
    invoke-direct {p1, p0}, La/gei0;-><init>(La/eii0;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, La/eii0;->c:La/n0o0;

    .line 18
    .line 19
    return-void
.end method

.method public static b(Lokhttp3/OkHttpClient$Builder;La/e6d0;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/e6d0;->c:Ljava/lang/String;

    .line 5
    .line 6
    iget v1, p1, La/e6d0;->d:I

    .line 7
    .line 8
    new-instance v2, La/dtg0;

    .line 9
    .line 10
    invoke-direct {v2}, La/dtg0;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v3, p0, Lokhttp3/OkHttpClient$Builder;->n:Ljava/net/ProxySelector;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-eq v2, v3, :cond_0

    .line 17
    .line 18
    iput-object v4, p0, Lokhttp3/OkHttpClient$Builder;->D:Lokhttp3/internal/connection/RouteDatabase;

    .line 19
    .line 20
    :cond_0
    iput-object v2, p0, Lokhttp3/OkHttpClient$Builder;->n:Ljava/net/ProxySelector;

    .line 21
    .line 22
    iget-boolean v2, p1, La/e6d0;->a:Z

    .line 23
    .line 24
    if-eqz v2, :cond_d

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_4

    .line 31
    .line 32
    if-lez v1, :cond_4

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    :try_start_0
    new-instance v2, Lokhttp3/Dns$Request;

    .line 44
    .line 45
    const/4 v3, -0x1

    .line 46
    invoke-direct {v2, v0, v3}, Lokhttp3/Dns$Request;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catch_0
    :cond_2
    :goto_0
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    .line 51
    .line 52
    iget-object v0, p0, Lokhttp3/OkHttpClient$Builder;->m:Ljava/net/Proxy;

    .line 53
    .line 54
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    iput-object v4, p0, Lokhttp3/OkHttpClient$Builder;->D:Lokhttp3/internal/connection/RouteDatabase;

    .line 61
    .line 62
    :cond_3
    iput-object p1, p0, Lokhttp3/OkHttpClient$Builder;->m:Ljava/net/Proxy;

    .line 63
    .line 64
    return-void

    .line 65
    :cond_4
    :goto_1
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_7

    .line 70
    .line 71
    if-lez v1, :cond_7

    .line 72
    .line 73
    iget-object v2, p1, La/e6d0;->b:La/t6d0;

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_6

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    if-ne v2, v3, :cond_5

    .line 83
    .line 84
    sget-object v2, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_6
    sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 92
    .line 93
    :goto_2
    new-instance v3, Ljava/net/Proxy;

    .line 94
    .line 95
    invoke-static {v0, v1}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-direct {v3, v2, v0}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_7
    move-object v3, v4

    .line 104
    :goto_3
    iget-object v0, p1, La/e6d0;->e:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_9

    .line 111
    .line 112
    iget-object v0, p1, La/e6d0;->f:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_8

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_8
    move-object v0, v4

    .line 122
    goto :goto_5

    .line 123
    :cond_9
    :goto_4
    new-instance v0, La/ex60;

    .line 124
    .line 125
    const/16 v1, 0x1d

    .line 126
    .line 127
    invoke-direct {v0, p1, v1}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 128
    .line 129
    .line 130
    :goto_5
    if-eqz v0, :cond_b

    .line 131
    .line 132
    iget-object p1, p0, Lokhttp3/OkHttpClient$Builder;->o:Lokhttp3/Authenticator;

    .line 133
    .line 134
    if-eq v0, p1, :cond_a

    .line 135
    .line 136
    iput-object v4, p0, Lokhttp3/OkHttpClient$Builder;->D:Lokhttp3/internal/connection/RouteDatabase;

    .line 137
    .line 138
    :cond_a
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->o:Lokhttp3/Authenticator;

    .line 139
    .line 140
    :cond_b
    iget-object p1, p0, Lokhttp3/OkHttpClient$Builder;->m:Ljava/net/Proxy;

    .line 141
    .line 142
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-nez p1, :cond_c

    .line 147
    .line 148
    iput-object v4, p0, Lokhttp3/OkHttpClient$Builder;->D:Lokhttp3/internal/connection/RouteDatabase;

    .line 149
    .line 150
    :cond_c
    iput-object v3, p0, Lokhttp3/OkHttpClient$Builder;->m:Ljava/net/Proxy;

    .line 151
    .line 152
    :cond_d
    return-void
.end method


# virtual methods
.method public final a(Lokhttp3/OkHttpClient$Builder;)V
    .locals 6

    .line 1
    iget v0, p0, La/eii0;->b:I

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    if-gt v0, v1, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, La/eii0;->c:La/n0o0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lokhttp3/tls/HandshakeCertificates;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object v1, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 19
    .line 20
    sget-object v1, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 21
    .line 22
    invoke-virtual {v1}, Lokhttp3/internal/platform/Platform;->m()Ljavax/net/ssl/SSLContext;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, v0, Lokhttp3/tls/HandshakeCertificates;->a:Ljavax/net/ssl/X509KeyManager;

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    new-array v4, v3, [Ljavax/net/ssl/KeyManager;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    aput-object v2, v4, v5

    .line 33
    .line 34
    iget-object v0, v0, Lokhttp3/tls/HandshakeCertificates;->b:Ljavax/net/ssl/X509TrustManager;

    .line 35
    .line 36
    new-array v2, v3, [Ljavax/net/ssl/TrustManager;

    .line 37
    .line 38
    aput-object v0, v2, v5

    .line 39
    .line 40
    new-instance v0, Ljava/security/SecureRandom;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v4, v2, v0}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, La/eii0;->c:La/n0o0;

    .line 56
    .line 57
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Lokhttp3/tls/HandshakeCertificates;

    .line 62
    .line 63
    iget-object p0, p0, Lokhttp3/tls/HandshakeCertificates;->b:Ljavax/net/ssl/X509TrustManager;

    .line 64
    .line 65
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->r:Ljavax/net/ssl/X509TrustManager;

    .line 74
    .line 75
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_1

    .line 80
    .line 81
    :cond_0
    const/4 v1, 0x0

    .line 82
    iput-object v1, p1, Lokhttp3/OkHttpClient$Builder;->D:Lokhttp3/internal/connection/RouteDatabase;

    .line 83
    .line 84
    :cond_1
    iput-object v0, p1, Lokhttp3/OkHttpClient$Builder;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 85
    .line 86
    sget-object v0, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 87
    .line 88
    invoke-virtual {v0, p0}, Lokhttp3/internal/platform/Platform;->c(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p1, Lokhttp3/OkHttpClient$Builder;->w:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 93
    .line 94
    iput-object p0, p1, Lokhttp3/OkHttpClient$Builder;->r:Ljavax/net/ssl/X509TrustManager;

    .line 95
    .line 96
    :cond_2
    return-void
.end method
