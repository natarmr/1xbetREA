.class public Landroid/gov/nist/core/net/SslNetworkLayer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/core/net/NetworkLayer;


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private sslServerSocketFactory:Ljavax/net/ssl/SSLServerSocketFactory;

.field private sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

.field trustAllCerts:[Ljavax/net/ssl/TrustManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/core/net/SslNetworkLayer;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/core/net/SslNetworkLayer;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/SipStackImpl;Ljava/lang/String;Ljava/lang/String;[C[CLjava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/gov/nist/core/net/SslNetworkLayer$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroid/gov/nist/core/net/SslNetworkLayer$1;-><init>(Landroid/gov/nist/core/net/SslNetworkLayer;)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    new-array v1, v1, [Ljavax/net/ssl/TrustManager;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aput-object v0, v1, v2

    .line 14
    .line 15
    iput-object v1, p0, Landroid/gov/nist/core/net/SslNetworkLayer;->trustAllCerts:[Ljavax/net/ssl/TrustManager;

    .line 16
    .line 17
    const-string v0, "TLS"

    .line 18
    .line 19
    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {}, Ljavax/net/ssl/KeyManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v1}, Ljavax/net/ssl/KeyManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/KeyManagerFactory;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v3, Ljava/security/SecureRandom;

    .line 36
    .line 37
    invoke-direct {v3}, Ljava/security/SecureRandom;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Ljava/util/Random;->nextInt()I

    .line 41
    .line 42
    .line 43
    if-eqz p6, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p6

    .line 50
    :goto_0
    invoke-static {p6}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    .line 51
    .line 52
    .line 53
    move-result-object p6

    .line 54
    if-eqz p7, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p7

    .line 61
    :goto_1
    invoke-static {p7}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    .line 62
    .line 63
    .line 64
    move-result-object p7

    .line 65
    new-instance v4, Ljava/io/FileInputStream;

    .line 66
    .line 67
    invoke-direct {v4, p3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p6, v4, p4}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 71
    .line 72
    .line 73
    new-instance p3, Ljava/io/FileInputStream;

    .line 74
    .line 75
    invoke-direct {p3, p2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p7, p3, p5}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, p7}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, p6, p4}, Ljavax/net/ssl/KeyManagerFactory;->init(Ljava/security/KeyStore;[C)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getClientAuth()Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    sget-object p3, Landroid/gov/nist/javax/sip/stack/ClientAuthType;->DisabledAll:Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 92
    .line 93
    const-string p4, "ClientAuth "

    .line 94
    .line 95
    const/16 p5, 0x20

    .line 96
    .line 97
    if-ne p2, p3, :cond_3

    .line 98
    .line 99
    sget-object p2, Landroid/gov/nist/core/net/SslNetworkLayer;->logger:Landroid/gov/nist/core/StackLogger;

    .line 100
    .line 101
    invoke-interface {p2, p5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-eqz p2, :cond_2

    .line 106
    .line 107
    sget-object p2, Landroid/gov/nist/core/net/SslNetworkLayer;->logger:Landroid/gov/nist/core/StackLogger;

    .line 108
    .line 109
    new-instance p3, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getClientAuth()Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p1, " bypassing all cert validations"

    .line 122
    .line 123
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-interface {p2, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_2
    const/4 p1, 0x0

    .line 134
    iget-object p2, p0, Landroid/gov/nist/core/net/SslNetworkLayer;->trustAllCerts:[Ljavax/net/ssl/TrustManager;

    .line 135
    .line 136
    invoke-virtual {v0, p1, p2, v3}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_3
    sget-object p2, Landroid/gov/nist/core/net/SslNetworkLayer;->logger:Landroid/gov/nist/core/StackLogger;

    .line 141
    .line 142
    invoke-interface {p2, p5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    if-eqz p2, :cond_4

    .line 147
    .line 148
    sget-object p2, Landroid/gov/nist/core/net/SslNetworkLayer;->logger:Landroid/gov/nist/core/StackLogger;

    .line 149
    .line 150
    new-instance p3, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getClientAuth()Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-interface {p2, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :cond_4
    invoke-virtual {v1}, Ljavax/net/ssl/KeyManagerFactory;->getKeyManagers()[Ljavax/net/ssl/KeyManager;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-virtual {v2}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-virtual {v0, p1, p2, v3}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 178
    .line 179
    .line 180
    :goto_2
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getServerSocketFactory()Ljavax/net/ssl/SSLServerSocketFactory;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iput-object p1, p0, Landroid/gov/nist/core/net/SslNetworkLayer;->sslServerSocketFactory:Ljavax/net/ssl/SSLServerSocketFactory;

    .line 185
    .line 186
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iput-object p1, p0, Landroid/gov/nist/core/net/SslNetworkLayer;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 191
    .line 192
    return-void
.end method

.method public static synthetic access$000()Landroid/gov/nist/core/StackLogger;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/core/net/SslNetworkLayer;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public createDatagramSocket()Ljava/net/DatagramSocket;
    .locals 0

    .line 1
    new-instance p0, Ljava/net/DatagramSocket;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/net/DatagramSocket;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createDatagramSocket(ILjava/net/InetAddress;)Ljava/net/DatagramSocket;
    .locals 0

    .line 7
    new-instance p0, Ljava/net/DatagramSocket;

    invoke-direct {p0, p1, p2}, Ljava/net/DatagramSocket;-><init>(ILjava/net/InetAddress;)V

    return-object p0
.end method

.method public createSSLServerSocket(IILjava/net/InetAddress;)Ljavax/net/ssl/SSLServerSocket;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/net/SslNetworkLayer;->sslServerSocketFactory:Ljavax/net/ssl/SSLServerSocketFactory;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Ljavax/net/ServerSocketFactory;->createServerSocket(IILjava/net/InetAddress;)Ljava/net/ServerSocket;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljavax/net/ssl/SSLServerSocket;

    .line 8
    .line 9
    return-object p0
.end method

.method public createSSLSocket(Ljava/net/InetAddress;I)Ljavax/net/ssl/SSLSocket;
    .locals 1

    const/4 v0, 0x0

    .line 36
    invoke-virtual {p0, p1, p2, v0}, Landroid/gov/nist/core/net/SslNetworkLayer;->createSSLSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;)Ljavax/net/ssl/SSLSocket;

    move-result-object p0

    return-object p0
.end method

.method public createSSLSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;)Ljavax/net/ssl/SSLSocket;
    .locals 2

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/net/SslNetworkLayer;->sslSocketFactory:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljavax/net/ssl/SSLSocket;

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/net/InetSocketAddress;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p3, v1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/net/Socket;->bind(Ljava/net/SocketAddress;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    :try_start_0
    new-instance p3, Ljava/net/InetSocketAddress;

    .line 21
    .line 22
    invoke-direct {p3, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x1f40

    .line 26
    .line 27
    invoke-virtual {p0, p3, v0}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :catch_0
    invoke-static {p2, p1}, La/v4i0;->i(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public createServerSocket(IILjava/net/InetAddress;)Ljava/net/ServerSocket;
    .locals 0

    .line 1
    new-instance p0, Ljava/net/ServerSocket;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Ljava/net/ServerSocket;-><init>(IILjava/net/InetAddress;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;
    .locals 0

    .line 68
    new-instance p0, Ljava/net/Socket;

    invoke-direct {p0, p1, p2}, Ljava/net/Socket;-><init>(Ljava/net/InetAddress;I)V

    return-object p0
.end method

.method public createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;)Ljava/net/Socket;
    .locals 4

    const/4 p0, 0x0

    const/16 v0, 0x1f40

    if-eqz p3, :cond_0

    .line 61
    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1}, Ljava/net/Socket;-><init>()V

    .line 62
    new-instance v2, Ljava/net/InetSocketAddress;

    const/4 v3, 0x0

    invoke-direct {v2, p3, v3}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v1, v2}, Ljava/net/Socket;->bind(Ljava/net/SocketAddress;)V

    .line 63
    :try_start_0
    new-instance p3, Ljava/net/InetSocketAddress;

    invoke-direct {p3, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v1, p3, v0}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 64
    :catch_0
    invoke-static {p2, p1}, La/v4i0;->i(ILjava/lang/Object;)V

    return-object p0

    .line 65
    :cond_0
    new-instance p3, Ljava/net/Socket;

    invoke-direct {p3}, Ljava/net/Socket;-><init>()V

    .line 66
    :try_start_1
    new-instance v1, Ljava/net/InetSocketAddress;

    invoke-direct {v1, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {p3, v1, v0}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p3

    .line 67
    :catch_1
    invoke-static {p2, p1}, La/v4i0;->i(ILjava/lang/Object;)V

    return-object p0
.end method

.method public createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;
    .locals 3

    .line 1
    const/4 p0, 0x0

    .line 2
    const/16 v0, 0x1f40

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    new-instance p4, Ljava/net/Socket;

    .line 7
    .line 8
    invoke-direct {p4}, Ljava/net/Socket;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/net/InetSocketAddress;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p3, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p4, v1}, Ljava/net/Socket;->bind(Ljava/net/SocketAddress;)V

    .line 18
    .line 19
    .line 20
    :try_start_0
    new-instance p3, Ljava/net/InetSocketAddress;

    .line 21
    .line 22
    invoke-direct {p3, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p4, p3, v0}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    return-object p4

    .line 29
    :catch_0
    invoke-static {p2, p1}, La/v4i0;->i(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    new-instance p3, Ljava/net/Socket;

    .line 34
    .line 35
    invoke-direct {p3}, Ljava/net/Socket;-><init>()V

    .line 36
    .line 37
    .line 38
    if-eqz p4, :cond_1

    .line 39
    .line 40
    new-instance p4, Ljava/net/InetSocketAddress;

    .line 41
    .line 42
    invoke-direct {p4, p2}, Ljava/net/InetSocketAddress;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3, p4}, Ljava/net/Socket;->bind(Ljava/net/SocketAddress;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    :try_start_1
    new-instance p4, Ljava/net/InetSocketAddress;

    .line 49
    .line 50
    invoke-direct {p4, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3, p4, v0}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
    :try_end_1
    .catch Ljava/net/SocketTimeoutException; {:try_start_1 .. :try_end_1} :catch_1

    .line 54
    .line 55
    .line 56
    return-object p3

    .line 57
    :catch_1
    invoke-static {p2, p1}, La/v4i0;->i(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    return-object p0
.end method

.method public setSipStack(Landroid/gov/nist/javax/sip/SipStackImpl;)V
    .locals 0

    return-void
.end method
