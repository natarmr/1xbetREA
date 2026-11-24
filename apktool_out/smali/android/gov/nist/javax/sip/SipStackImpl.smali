.class public Landroid/gov/nist/javax/sip/SipStackImpl;
.super Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/SipStack;
.implements Landroid/gov/nist/javax/sip/SipStackExt;


# static fields
.field public static final DEFAULT_CIPHERS:[Ljava/lang/String;

.field public static final MAX_DATAGRAM_SIZE:Ljava/lang/Integer;

.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private cipherSuites:[Ljava/lang/String;

.field private configurationProperties:Ljava/util/Properties;

.field private enabledProtocols:[Ljava/lang/String;

.field private eventScanner:Landroid/gov/nist/javax/sip/EventScanner;

.field protected listeningPoints:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Landroid/gov/nist/javax/sip/ListeningPointImpl;",
            ">;"
        }
    .end annotation
.end field

.field private reEntrantListener:Z

.field sipListener:Landroid/javax/sip/SipListener;

.field protected sipProviders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/gov/nist/javax/sip/SipProviderImpl;",
            ">;"
        }
    .end annotation
.end field

.field private stackSemaphore:Ljava/util/concurrent/Semaphore;

.field tlsSecurityPolicy:Landroid/gov/nist/javax/sip/TlsSecurityPolicy;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/SipStackImpl;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    const/high16 v0, 0x10000

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->MAX_DATAGRAM_SIZE:Ljava/lang/Integer;

    .line 16
    .line 17
    const-string v0, "TLS_DH_anon_WITH_AES_128_CBC_SHA"

    .line 18
    .line 19
    const-string v1, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"

    .line 20
    .line 21
    const-string v2, "TLS_RSA_WITH_AES_128_CBC_SHA"

    .line 22
    .line 23
    const-string v3, "SSL_RSA_WITH_3DES_EDE_CBC_SHA"

    .line 24
    .line 25
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->DEFAULT_CIPHERS:[Ljava/lang/String;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 2617
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;-><init>()V

    .line 2618
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->stackSemaphore:Ljava/util/concurrent/Semaphore;

    .line 2619
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->DEFAULT_CIPHERS:[Ljava/lang/String;

    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->cipherSuites:[Ljava/lang/String;

    .line 2620
    const-string v0, "TLSv1.1"

    const-string v1, "TLSv1"

    const-string v2, "TLSv1.2"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->enabledProtocols:[Ljava/lang/String;

    .line 2621
    new-instance v0, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;

    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/NistSipMessageFactoryImpl;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;)V

    .line 2622
    invoke-super {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setMessageFactory(Landroid/gov/nist/javax/sip/stack/StackMessageFactory;)V

    .line 2623
    new-instance v0, Landroid/gov/nist/javax/sip/EventScanner;

    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/EventScanner;-><init>(Landroid/gov/nist/javax/sip/SipStackImpl;)V

    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->eventScanner:Landroid/gov/nist/javax/sip/EventScanner;

    .line 2624
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->listeningPoints:Ljava/util/Hashtable;

    .line 2625
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->sipProviders:Ljava/util/List;

    .line 2626
    :try_start_0
    const-string p0, "UTF-8"

    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p0

    if-eqz p0, :cond_0

    return-void

    .line 2627
    :cond_0
    new-instance p0, Ljava/nio/charset/UnsupportedCharsetException;

    const-string v0, "Unsupported charset UTF-8"

    invoke-direct {p0, v0}, Ljava/nio/charset/UnsupportedCharsetException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 2628
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "UTF-8 charset cannot be used this system. This will lead to unpredictable behavior when parsing SIP messages: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Properties;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "Cound not instantiate stack logger "

    .line 4
    .line 5
    const-string v3, "Cound not instantiate server logger "

    .line 6
    .line 7
    const-string v8, "Cound not instantiate TLS security policy "

    .line 8
    .line 9
    const-string v9, "Cannot initialize security manager provider"

    .line 10
    .line 11
    const-string v10, "- check that it is present on the classpath and that there is a no-args constructor defined"

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/SipStackImpl;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v11, Landroid/gov/nist/javax/sip/MergedSystemProperties;

    .line 17
    .line 18
    move-object/from16 v0, p1

    .line 19
    .line 20
    invoke-direct {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;-><init>(Ljava/util/Properties;)V

    .line 21
    .line 22
    .line 23
    iput-object v11, v1, Landroid/gov/nist/javax/sip/SipStackImpl;->configurationProperties:Ljava/util/Properties;

    .line 24
    .line 25
    const-string v0, "android.javax.sip.IP_ADDRESS"

    .line 26
    .line 27
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    :try_start_0
    invoke-super {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setHostAddress(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catch_0
    new-instance v1, Landroid/javax/sip/PeerUnavailableException;

    .line 38
    .line 39
    const-string v2, "bad address "

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-direct {v1, v0}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :cond_0
    :goto_0
    const-string v0, "android.javax.sip.STACK_NAME"

    .line 50
    .line 51
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_3c

    .line 56
    .line 57
    invoke-super {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setStackName(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string v0, "android.gov.nist.javax.sip.STACK_LOGGER"

    .line 61
    .line 62
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    const-string v0, "android.gov.nist.core.LogWriter"

    .line 69
    .line 70
    :cond_1
    move-object v4, v0

    .line 71
    const/4 v12, 0x0

    .line 72
    :try_start_1
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Landroid/gov/nist/core/StackLogger;

    .line 85
    .line 86
    sput-object v0, Landroid/gov/nist/core/CommonLogger;->legacyLogger:Landroid/gov/nist/core/StackLogger;

    .line 87
    .line 88
    invoke-interface {v0, v11}, Landroid/gov/nist/core/StackLogger;->setStackProperties(Ljava/util/Properties;)V
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_21
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_20

    .line 89
    .line 90
    .line 91
    const-string v0, "android.gov.nist.javax.sip.SERVER_LOGGER"

    .line 92
    .line 93
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-nez v0, :cond_2

    .line 98
    .line 99
    const-string v0, "android.gov.nist.javax.sip.stack.ServerLog"

    .line 100
    .line 101
    :cond_2
    :try_start_2
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Landroid/gov/nist/core/ServerLogger;

    .line 114
    .line 115
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverLogger:Landroid/gov/nist/core/ServerLogger;

    .line 116
    .line 117
    invoke-interface {v0, v1}, Landroid/gov/nist/core/ServerLogger;->setSipStack(Landroid/javax/sip/SipStack;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverLogger:Landroid/gov/nist/core/ServerLogger;

    .line 121
    .line 122
    invoke-interface {v0, v11}, Landroid/gov/nist/core/ServerLogger;->setStackProperties(Ljava/util/Properties;)V
    :try_end_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_1f
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1e

    .line 123
    .line 124
    .line 125
    const-string v0, "android.gov.nist.javax.sip.RELIABLE_CONNECTION_KEEP_ALIVE_TIMEOUT"

    .line 126
    .line 127
    const-string v13, "-1"

    .line 128
    .line 129
    invoke-virtual {v11, v0, v13}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    mul-int/lit16 v0, v0, 0x3e8

    .line 138
    .line 139
    invoke-super {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setReliableConnectionKeepAliveTimeout(I)V

    .line 140
    .line 141
    .line 142
    const-string v0, "android.gov.nist.javax.sip.SSL_HANDSHAKE_TIMEOUT"

    .line 143
    .line 144
    invoke-virtual {v11, v0, v13}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 149
    .line 150
    .line 151
    move-result-wide v2

    .line 152
    invoke-super {v1, v2, v3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setSslHandshakeTimeout(J)V

    .line 153
    .line 154
    .line 155
    const-string v0, "android.gov.nist.javax.sip.THREAD_PRIORITY"

    .line 156
    .line 157
    const-string v2, "10"

    .line 158
    .line 159
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    invoke-super {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setThreadPriority(I)V

    .line 168
    .line 169
    .line 170
    const-string v0, "android.javax.sip.OUTBOUND_PROXY"

    .line 171
    .line 172
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->outboundProxy:Ljava/lang/String;

    .line 177
    .line 178
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->getInstance()Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    const-string v3, "android.gov.nist.javax.sip.stack.USE_DIRECT_BUFFERS"

    .line 189
    .line 190
    invoke-virtual {v11, v3, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    invoke-virtual {v0, v2}, Landroid/gov/nist/javax/sip/stack/ByteBufferFactory;->setUseDirect(Z)V

    .line 203
    .line 204
    .line 205
    new-instance v0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;

    .line 206
    .line 207
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->outboundProxy:Ljava/lang/String;

    .line 208
    .line 209
    invoke-direct {v0, v1, v2}, Landroid/gov/nist/javax/sip/stack/DefaultRouter;-><init>(Landroid/javax/sip/SipStack;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->defaultRouter:Landroid/gov/nist/javax/sip/stack/DefaultRouter;

    .line 213
    .line 214
    const-string v0, "android.javax.sip.ROUTER_PATH"

    .line 215
    .line 216
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-nez v0, :cond_3

    .line 221
    .line 222
    const-string v0, "android.gov.nist.javax.sip.stack.DefaultRouter"

    .line 223
    .line 224
    :cond_3
    :try_start_3
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    const-class v2, Landroid/javax/sip/SipStack;

    .line 229
    .line 230
    const-class v3, Ljava/lang/String;

    .line 231
    .line 232
    filled-new-array {v2, v3}, [Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    iget-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->outboundProxy:Ljava/lang/String;

    .line 241
    .line 242
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, Landroid/javax/sip/address/Router;

    .line 251
    .line 252
    invoke-super {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setRouter(Landroid/javax/sip/address/Router;)V
    :try_end_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_1d
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1c

    .line 253
    .line 254
    .line 255
    const-string v0, "android.javax.sip.USE_ROUTER_FOR_ALL_URIS"

    .line 256
    .line 257
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    const/4 v14, 0x1

    .line 262
    iput-boolean v14, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->useRouterForAll:Z

    .line 263
    .line 264
    const-string v15, "true"

    .line 265
    .line 266
    if-eqz v0, :cond_4

    .line 267
    .line 268
    invoke-virtual {v15, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    iput-boolean v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->useRouterForAll:Z

    .line 273
    .line 274
    :cond_4
    const-string v0, "android.javax.sip.EXTENSION_METHODS"

    .line 275
    .line 276
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    if-eqz v0, :cond_6

    .line 281
    .line 282
    new-instance v2, Ljava/util/StringTokenizer;

    .line 283
    .line 284
    invoke-direct {v2, v0}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    :goto_1
    invoke-virtual {v2}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-eqz v0, :cond_6

    .line 292
    .line 293
    const-string v0, ":"

    .line 294
    .line 295
    invoke-virtual {v2, v0}, Ljava/util/StringTokenizer;->nextToken(Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    const-string v3, "BYE"

    .line 300
    .line 301
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    if-nez v3, :cond_5

    .line 306
    .line 307
    const-string v3, "INVITE"

    .line 308
    .line 309
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    if-nez v3, :cond_5

    .line 314
    .line 315
    const-string v3, "SUBSCRIBE"

    .line 316
    .line 317
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    if-nez v3, :cond_5

    .line 322
    .line 323
    const-string v3, "NOTIFY"

    .line 324
    .line 325
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-nez v3, :cond_5

    .line 330
    .line 331
    const-string v3, "ACK"

    .line 332
    .line 333
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    if-nez v3, :cond_5

    .line 338
    .line 339
    const-string v3, "OPTIONS"

    .line 340
    .line 341
    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    if-nez v3, :cond_5

    .line 346
    .line 347
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addExtensionMethod(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    goto :goto_1

    .line 351
    :cond_5
    new-instance v1, Landroid/javax/sip/PeerUnavailableException;

    .line 352
    .line 353
    const-string v2, "Bad extension method "

    .line 354
    .line 355
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-direct {v1, v0}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw v1

    .line 363
    :cond_6
    const-string v0, "android.gov.nist.javax.sip.TLS_CLIENT_AUTH_TYPE"

    .line 364
    .line 365
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    if-eqz v0, :cond_7

    .line 370
    .line 371
    invoke-static {v0}, Landroid/gov/nist/javax/sip/stack/ClientAuthType;->valueOf(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    iput-object v2, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientAuth:Landroid/gov/nist/javax/sip/stack/ClientAuthType;

    .line 376
    .line 377
    sget-object v2, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 378
    .line 379
    new-instance v3, Ljava/lang/StringBuilder;

    .line 380
    .line 381
    const-string v4, "using "

    .line 382
    .line 383
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    const-string v0, " tls auth policy"

    .line 390
    .line 391
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-interface {v2, v0}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    :cond_7
    const-string v0, "javax.net.ssl.keyStore"

    .line 402
    .line 403
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    const-string v0, "javax.net.ssl.trustStore"

    .line 408
    .line 409
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    if-eqz v3, :cond_c

    .line 414
    .line 415
    if-nez v0, :cond_8

    .line 416
    .line 417
    move-object v2, v3

    .line 418
    goto :goto_2

    .line 419
    :cond_8
    move-object v2, v0

    .line 420
    :goto_2
    const-string v0, "javax.net.ssl.keyStorePassword"

    .line 421
    .line 422
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    const-string v4, "javax.net.ssl.trustStorePassword"

    .line 427
    .line 428
    invoke-virtual {v11, v4, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    const-string v5, "javax.net.ssl.keyStoreType"

    .line 433
    .line 434
    invoke-virtual {v11, v5}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v6

    .line 438
    const-string v5, "javax.net.ssl.trustStoreType"

    .line 439
    .line 440
    invoke-virtual {v11, v5}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    if-nez v5, :cond_9

    .line 445
    .line 446
    move-object v7, v6

    .line 447
    :goto_3
    move-object v5, v0

    .line 448
    goto :goto_4

    .line 449
    :cond_9
    move-object v7, v5

    .line 450
    goto :goto_3

    .line 451
    :goto_4
    :try_start_4
    new-instance v0, Landroid/gov/nist/core/net/SslNetworkLayer;

    .line 452
    .line 453
    if-eqz v5, :cond_a

    .line 454
    .line 455
    invoke-virtual {v5}, Ljava/lang/String;->toCharArray()[C

    .line 456
    .line 457
    .line 458
    move-result-object v5

    .line 459
    goto :goto_5

    .line 460
    :catch_1
    move-exception v0

    .line 461
    goto :goto_7

    .line 462
    :cond_a
    move-object v5, v12

    .line 463
    :goto_5
    if-eqz v4, :cond_b

    .line 464
    .line 465
    invoke-virtual {v4}, Ljava/lang/String;->toCharArray()[C

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    move-object/from16 v16, v5

    .line 470
    .line 471
    move-object v5, v4

    .line 472
    move-object/from16 v4, v16

    .line 473
    .line 474
    goto :goto_6

    .line 475
    :cond_b
    move-object v4, v5

    .line 476
    move-object v5, v12

    .line 477
    :goto_6
    invoke-direct/range {v0 .. v7}, Landroid/gov/nist/core/net/SslNetworkLayer;-><init>(Landroid/gov/nist/javax/sip/SipStackImpl;Ljava/lang/String;Ljava/lang/String;[C[CLjava/lang/String;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->networkLayer:Landroid/gov/nist/core/net/NetworkLayer;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 481
    .line 482
    goto :goto_8

    .line 483
    :goto_7
    sget-object v2, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 484
    .line 485
    const-string v3, "could not instantiate SSL networking"

    .line 486
    .line 487
    invoke-interface {v2, v3, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 488
    .line 489
    .line 490
    :cond_c
    :goto_8
    const-string v0, "android.javax.sip.AUTOMATIC_DIALOG_SUPPORT"

    .line 491
    .line 492
    const-string v2, "on"

    .line 493
    .line 494
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    iput-boolean v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAutomaticDialogSupportEnabled:Z

    .line 503
    .line 504
    const-string v0, "android.gov.nist.javax.sip.AUTOMATIC_DIALOG_ERROR_HANDLING"

    .line 505
    .line 506
    invoke-virtual {v11, v0, v15}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 511
    .line 512
    invoke-virtual {v2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v2

    .line 516
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    iput-boolean v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAutomaticDialogErrorHandlingEnabled:Z

    .line 521
    .line 522
    iget-boolean v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAutomaticDialogSupportEnabled:Z

    .line 523
    .line 524
    if-eqz v0, :cond_d

    .line 525
    .line 526
    iput-boolean v14, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAutomaticDialogErrorHandlingEnabled:Z

    .line 527
    .line 528
    :cond_d
    const-string v0, "android.gov.nist.javax.sip.MAX_LISTENER_RESPONSE_TIME"

    .line 529
    .line 530
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    const/4 v3, -0x1

    .line 535
    if-eqz v2, :cond_f

    .line 536
    .line 537
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    iput v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxListenerResponseTime:I

    .line 546
    .line 547
    if-lez v0, :cond_e

    .line 548
    .line 549
    goto :goto_9

    .line 550
    :cond_e
    new-instance v0, Landroid/javax/sip/PeerUnavailableException;

    .line 551
    .line 552
    const-string v1, "Bad configuration parameter android.gov.nist.javax.sip.MAX_LISTENER_RESPONSE_TIME : should be positive"

    .line 553
    .line 554
    invoke-direct {v0, v1}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    throw v0

    .line 558
    :cond_f
    iput v3, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxListenerResponseTime:I

    .line 559
    .line 560
    :goto_9
    const-string v0, "android.gov.nist.javax.sip.MAX_TX_LIFETIME_INVITE"

    .line 561
    .line 562
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    if-eqz v2, :cond_11

    .line 567
    .line 568
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 573
    .line 574
    .line 575
    move-result v0

    .line 576
    iput v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxTxLifetimeInvite:I

    .line 577
    .line 578
    invoke-super {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxTxLifetimeInvite()I

    .line 579
    .line 580
    .line 581
    move-result v0

    .line 582
    if-lez v0, :cond_10

    .line 583
    .line 584
    goto :goto_a

    .line 585
    :cond_10
    new-instance v0, Landroid/javax/sip/PeerUnavailableException;

    .line 586
    .line 587
    const-string v1, "Bad configuration parameter android.gov.nist.javax.sip.MAX_TX_LIFETIME_INVITE : should be positive"

    .line 588
    .line 589
    invoke-direct {v0, v1}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    throw v0

    .line 593
    :cond_11
    iput v3, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxTxLifetimeInvite:I

    .line 594
    .line 595
    :goto_a
    const-string v0, "android.gov.nist.javax.sip.MAX_TX_LIFETIME_NON_INVITE"

    .line 596
    .line 597
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    if-eqz v2, :cond_13

    .line 602
    .line 603
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    iput v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxTxLifetimeNonInvite:I

    .line 612
    .line 613
    invoke-super {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getMaxTxLifetimeNonInvite()I

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    if-lez v0, :cond_12

    .line 618
    .line 619
    goto :goto_b

    .line 620
    :cond_12
    new-instance v0, Landroid/javax/sip/PeerUnavailableException;

    .line 621
    .line 622
    const-string v1, "Bad configuration parameter android.gov.nist.javax.sip.MAX_TX_LIFETIME_NON_INVITE : should be positive"

    .line 623
    .line 624
    invoke-direct {v0, v1}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;)V

    .line 625
    .line 626
    .line 627
    throw v0

    .line 628
    :cond_13
    iput v3, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxTxLifetimeNonInvite:I

    .line 629
    .line 630
    :goto_b
    const-string v0, "android.gov.nist.javax.sip.DELIVER_TERMINATED_EVENT_FOR_ACK"

    .line 631
    .line 632
    const-string v2, "false"

    .line 633
    .line 634
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-virtual {v0, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setDeliverTerminatedEventForAck(Z)V

    .line 643
    .line 644
    .line 645
    const-string v0, "android.gov.nist.javax.sip.DELIVER_UNSOLICITED_NOTIFY"

    .line 646
    .line 647
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    invoke-super {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setDeliverUnsolicitedNotify(Z)V

    .line 656
    .line 657
    .line 658
    const-string v0, "android.javax.sip.FORKABLE_EVENTS"

    .line 659
    .line 660
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    if-eqz v0, :cond_14

    .line 665
    .line 666
    new-instance v3, Ljava/util/StringTokenizer;

    .line 667
    .line 668
    invoke-direct {v3, v0}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    :goto_c
    invoke-virtual {v3}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    if-eqz v0, :cond_14

    .line 676
    .line 677
    invoke-virtual {v3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    iget-object v4, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->forkedEvents:Ljava/util/HashSet;

    .line 682
    .line 683
    invoke-virtual {v4, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    goto :goto_c

    .line 687
    :cond_14
    const-string v0, "android.gov.nist.javax.sip.TLS_SECURITY_POLICY"

    .line 688
    .line 689
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    if-nez v0, :cond_15

    .line 694
    .line 695
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 696
    .line 697
    const-string v3, "using default tls security policy"

    .line 698
    .line 699
    invoke-interface {v0, v3}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    const-string v0, "android.gov.nist.javax.sip.stack.DefaultTlsSecurityPolicy"

    .line 703
    .line 704
    :cond_15
    move-object v3, v0

    .line 705
    :try_start_5
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    invoke-virtual {v0, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-virtual {v0, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    check-cast v0, Landroid/gov/nist/javax/sip/TlsSecurityPolicy;

    .line 718
    .line 719
    iput-object v0, v1, Landroid/gov/nist/javax/sip/SipStackImpl;->tlsSecurityPolicy:Landroid/gov/nist/javax/sip/TlsSecurityPolicy;
    :try_end_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_5 .. :try_end_5} :catch_1b
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1a

    .line 720
    .line 721
    const-string v0, "android.gov.nist.javax.sip.NETWORK_LAYER"

    .line 722
    .line 723
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->containsKey(Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    move-result v3

    .line 727
    if-eqz v3, :cond_16

    .line 728
    .line 729
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v3

    .line 733
    :try_start_6
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    invoke-virtual {v0, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    invoke-virtual {v0, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    check-cast v0, Landroid/gov/nist/core/net/NetworkLayer;

    .line 746
    .line 747
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->networkLayer:Landroid/gov/nist/core/net/NetworkLayer;

    .line 748
    .line 749
    invoke-interface {v0, v1}, Landroid/gov/nist/core/net/NetworkLayer;->setSipStack(Landroid/gov/nist/javax/sip/SipStackImpl;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 750
    .line 751
    .line 752
    goto :goto_d

    .line 753
    :catch_2
    move-exception v0

    .line 754
    new-instance v1, Landroid/javax/sip/PeerUnavailableException;

    .line 755
    .line 756
    const-string v2, "can\'t find or instantiate NetworkLayer implementation: "

    .line 757
    .line 758
    invoke-static {v2, v3}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v2

    .line 762
    invoke-direct {v1, v2, v0}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 763
    .line 764
    .line 765
    throw v1

    .line 766
    :cond_16
    :goto_d
    const-string v0, "android.gov.nist.javax.sip.ADDRESS_RESOLVER"

    .line 767
    .line 768
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->containsKey(Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    move-result v3

    .line 772
    if-eqz v3, :cond_17

    .line 773
    .line 774
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    :try_start_7
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-virtual {v0, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    invoke-virtual {v0, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    check-cast v0, Landroid/gov/nist/core/net/AddressResolver;

    .line 791
    .line 792
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->addressResolver:Landroid/gov/nist/core/net/AddressResolver;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 793
    .line 794
    goto :goto_e

    .line 795
    :catch_3
    move-exception v0

    .line 796
    new-instance v1, Landroid/javax/sip/PeerUnavailableException;

    .line 797
    .line 798
    const-string v2, "can\'t find or instantiate AddressResolver implementation: "

    .line 799
    .line 800
    invoke-static {v2, v3}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v2

    .line 804
    invoke-direct {v1, v2, v0}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 805
    .line 806
    .line 807
    throw v1

    .line 808
    :cond_17
    :goto_e
    const-string v0, "android.gov.nist.javax.sip.MAX_CONNECTIONS"

    .line 809
    .line 810
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    if-eqz v0, :cond_18

    .line 815
    .line 816
    :try_start_8
    new-instance v3, Ljava/lang/Integer;

    .line 817
    .line 818
    invoke-direct {v3, v0}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 822
    .line 823
    .line 824
    move-result v0

    .line 825
    iput v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxConnections:I
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_4

    .line 826
    .line 827
    goto :goto_f

    .line 828
    :catch_4
    move-exception v0

    .line 829
    sget-object v3, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 830
    .line 831
    invoke-interface {v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 832
    .line 833
    .line 834
    move-result v3

    .line 835
    if-eqz v3, :cond_18

    .line 836
    .line 837
    sget-object v3, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 838
    .line 839
    new-instance v4, Ljava/lang/StringBuilder;

    .line 840
    .line 841
    const-string v5, "max connections - bad value "

    .line 842
    .line 843
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 851
    .line 852
    .line 853
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    invoke-interface {v3, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    :cond_18
    :goto_f
    const-string v0, "android.gov.nist.javax.sip.THREAD_POOL_SIZE"

    .line 861
    .line 862
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    if-eqz v0, :cond_19

    .line 867
    .line 868
    :try_start_9
    new-instance v3, Ljava/lang/Integer;

    .line 869
    .line 870
    invoke-direct {v3, v0}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 874
    .line 875
    .line 876
    move-result v0

    .line 877
    iput v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadPoolSize:I
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_5

    .line 878
    .line 879
    goto :goto_10

    .line 880
    :catch_5
    move-exception v0

    .line 881
    sget-object v3, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 882
    .line 883
    invoke-interface {v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 884
    .line 885
    .line 886
    move-result v3

    .line 887
    if-eqz v3, :cond_19

    .line 888
    .line 889
    sget-object v3, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 890
    .line 891
    new-instance v4, Ljava/lang/StringBuilder;

    .line 892
    .line 893
    const-string v5, "thread pool size - bad value "

    .line 894
    .line 895
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 903
    .line 904
    .line 905
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    invoke-interface {v3, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 910
    .line 911
    .line 912
    :cond_19
    :goto_10
    const-string v0, "android.gov.nist.javax.sip.CONGESTION_CONTROL_TIMEOUT"

    .line 913
    .line 914
    const-string v3, "8000"

    .line 915
    .line 916
    invoke-virtual {v11, v0, v3}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 921
    .line 922
    .line 923
    move-result v0

    .line 924
    invoke-super {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setStackCongestionControlTimeout(I)V

    .line 925
    .line 926
    .line 927
    const-string v3, "android.gov.nist.javax.sip.TCP_POST_PARSING_THREAD_POOL_SIZE"

    .line 928
    .line 929
    invoke-virtual {v11, v3}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 930
    .line 931
    .line 932
    move-result-object v3

    .line 933
    if-eqz v3, :cond_1a

    .line 934
    .line 935
    :try_start_a
    new-instance v4, Ljava/lang/Integer;

    .line 936
    .line 937
    invoke-direct {v4, v3}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 941
    .line 942
    .line 943
    move-result v4

    .line 944
    invoke-super {v1, v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setTcpPostParsingThreadPoolSize(I)V

    .line 945
    .line 946
    .line 947
    invoke-static {v1, v4, v0}, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->setPostParseExcutorSize(Landroid/gov/nist/javax/sip/SipStackImpl;II)V
    :try_end_a
    .catch Ljava/lang/NumberFormatException; {:try_start_a .. :try_end_a} :catch_6

    .line 948
    .line 949
    .line 950
    goto :goto_11

    .line 951
    :catch_6
    move-exception v0

    .line 952
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 953
    .line 954
    invoke-interface {v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 955
    .line 956
    .line 957
    move-result v4

    .line 958
    if-eqz v4, :cond_1a

    .line 959
    .line 960
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 961
    .line 962
    const-string v5, "TCP post-parse thread pool size - bad value "

    .line 963
    .line 964
    const-string v6, " : "

    .line 965
    .line 966
    invoke-static {v5, v3, v6}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 967
    .line 968
    .line 969
    move-result-object v3

    .line 970
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 975
    .line 976
    .line 977
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    invoke-interface {v4, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 982
    .line 983
    .line 984
    :cond_1a
    :goto_11
    const-string v0, "android.gov.nist.javax.sip.MAX_SERVER_TRANSACTIONS"

    .line 985
    .line 986
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    const-string v3, "transaction table size - bad value "

    .line 991
    .line 992
    const/16 v4, 0x64

    .line 993
    .line 994
    if-eqz v0, :cond_1b

    .line 995
    .line 996
    :try_start_b
    new-instance v5, Ljava/lang/Integer;

    .line 997
    .line 998
    invoke-direct {v5, v0}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1002
    .line 1003
    .line 1004
    move-result v0

    .line 1005
    iput v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTableHighwaterMark:I

    .line 1006
    .line 1007
    mul-int/lit8 v0, v0, 0x50

    .line 1008
    .line 1009
    div-int/2addr v0, v4

    .line 1010
    iput v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->serverTransactionTableLowaterMark:I
    :try_end_b
    .catch Ljava/lang/NumberFormatException; {:try_start_b .. :try_end_b} :catch_7

    .line 1011
    .line 1012
    goto :goto_12

    .line 1013
    :catch_7
    move-exception v0

    .line 1014
    sget-object v5, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1015
    .line 1016
    invoke-interface {v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 1017
    .line 1018
    .line 1019
    move-result v5

    .line 1020
    if-eqz v5, :cond_1c

    .line 1021
    .line 1022
    sget-object v5, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1023
    .line 1024
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1025
    .line 1026
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    invoke-interface {v5, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 1041
    .line 1042
    .line 1043
    goto :goto_12

    .line 1044
    :cond_1b
    iput-boolean v14, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->unlimitedServerTransactionTableSize:Z

    .line 1045
    .line 1046
    :cond_1c
    :goto_12
    const-string v0, "android.gov.nist.javax.sip.MAX_CLIENT_TRANSACTIONS"

    .line 1047
    .line 1048
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0

    .line 1052
    if-eqz v0, :cond_1d

    .line 1053
    .line 1054
    :try_start_c
    new-instance v5, Ljava/lang/Integer;

    .line 1055
    .line 1056
    invoke-direct {v5, v0}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1060
    .line 1061
    .line 1062
    move-result v0

    .line 1063
    iput v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTableHiwaterMark:I

    .line 1064
    .line 1065
    iget v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTableLowaterMark:I

    .line 1066
    .line 1067
    mul-int/lit8 v0, v0, 0x50

    .line 1068
    .line 1069
    div-int/2addr v0, v4

    .line 1070
    iput v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->clientTransactionTableLowaterMark:I
    :try_end_c
    .catch Ljava/lang/NumberFormatException; {:try_start_c .. :try_end_c} :catch_8

    .line 1071
    .line 1072
    goto :goto_13

    .line 1073
    :catch_8
    move-exception v0

    .line 1074
    sget-object v5, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1075
    .line 1076
    invoke-interface {v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 1077
    .line 1078
    .line 1079
    move-result v5

    .line 1080
    if-eqz v5, :cond_1e

    .line 1081
    .line 1082
    sget-object v5, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1083
    .line 1084
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1085
    .line 1086
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v0

    .line 1100
    invoke-interface {v5, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 1101
    .line 1102
    .line 1103
    goto :goto_13

    .line 1104
    :cond_1d
    iput-boolean v14, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->unlimitedClientTransactionTableSize:Z

    .line 1105
    .line 1106
    :cond_1e
    :goto_13
    const-string v0, "android.gov.nist.javax.sip.SECURITY_MANAGER_PROVIDER"

    .line 1107
    .line 1108
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->containsKey(Ljava/lang/Object;)Z

    .line 1109
    .line 1110
    .line 1111
    move-result v3

    .line 1112
    if-eqz v3, :cond_1f

    .line 1113
    .line 1114
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v3

    .line 1118
    :try_start_d
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v0

    .line 1122
    invoke-virtual {v0, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    invoke-virtual {v0, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v0

    .line 1130
    check-cast v0, Landroid/gov/nist/core/net/SecurityManagerProvider;

    .line 1131
    .line 1132
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->securityManagerProvider:Landroid/gov/nist/core/net/SecurityManagerProvider;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_9

    .line 1133
    .line 1134
    goto :goto_14

    .line 1135
    :catch_9
    move-exception v0

    .line 1136
    new-instance v1, Landroid/javax/sip/PeerUnavailableException;

    .line 1137
    .line 1138
    const-string v2, "can\'t find or instantiate SecurityManagerProvider implementation: "

    .line 1139
    .line 1140
    invoke-static {v2, v3}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v2

    .line 1144
    invoke-direct {v1, v2, v0}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1145
    .line 1146
    .line 1147
    throw v1

    .line 1148
    :cond_1f
    new-instance v0, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;

    .line 1149
    .line 1150
    invoke-direct {v0}, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;-><init>()V

    .line 1151
    .line 1152
    .line 1153
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->securityManagerProvider:Landroid/gov/nist/core/net/SecurityManagerProvider;

    .line 1154
    .line 1155
    :goto_14
    :try_start_e
    invoke-interface {v0, v11}, Landroid/gov/nist/core/net/SecurityManagerProvider;->init(Ljava/util/Properties;)V
    :try_end_e
    .catch Ljava/security/GeneralSecurityException; {:try_start_e .. :try_end_e} :catch_19
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_18

    .line 1156
    .line 1157
    .line 1158
    iput-boolean v14, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cacheServerConnections:Z

    .line 1159
    .line 1160
    const-string v0, "android.gov.nist.javax.sip.CACHE_SERVER_CONNECTIONS"

    .line 1161
    .line 1162
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v0

    .line 1166
    const/4 v3, 0x0

    .line 1167
    if-eqz v0, :cond_20

    .line 1168
    .line 1169
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1174
    .line 1175
    .line 1176
    move-result v0

    .line 1177
    if-eqz v0, :cond_20

    .line 1178
    .line 1179
    iput-boolean v3, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cacheServerConnections:Z

    .line 1180
    .line 1181
    :cond_20
    iput-boolean v14, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cacheClientConnections:Z

    .line 1182
    .line 1183
    const-string v0, "android.gov.nist.javax.sip.CACHE_CLIENT_CONNECTIONS"

    .line 1184
    .line 1185
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v0

    .line 1189
    if-eqz v0, :cond_21

    .line 1190
    .line 1191
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1196
    .line 1197
    .line 1198
    move-result v0

    .line 1199
    if-eqz v0, :cond_21

    .line 1200
    .line 1201
    iput-boolean v3, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cacheClientConnections:Z

    .line 1202
    .line 1203
    :cond_21
    const-string v0, "android.gov.nist.javax.sip.READ_TIMEOUT"

    .line 1204
    .line 1205
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    const-string v5, "Value too low "

    .line 1210
    .line 1211
    if-eqz v0, :cond_23

    .line 1212
    .line 1213
    :try_start_f
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1214
    .line 1215
    .line 1216
    move-result v6

    .line 1217
    if-lt v6, v4, :cond_22

    .line 1218
    .line 1219
    iput v6, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->readTimeout:I

    .line 1220
    .line 1221
    goto :goto_15

    .line 1222
    :cond_22
    sget-object v6, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 1223
    .line 1224
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1225
    .line 1226
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v7

    .line 1239
    invoke-virtual {v6, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_f
    .catch Ljava/lang/NumberFormatException; {:try_start_f .. :try_end_f} :catch_a

    .line 1240
    .line 1241
    .line 1242
    goto :goto_15

    .line 1243
    :catch_a
    sget-object v6, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1244
    .line 1245
    invoke-interface {v6}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 1246
    .line 1247
    .line 1248
    move-result v6

    .line 1249
    if-eqz v6, :cond_23

    .line 1250
    .line 1251
    sget-object v6, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1252
    .line 1253
    const-string v7, "Bad read timeout "

    .line 1254
    .line 1255
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v7

    .line 1259
    invoke-interface {v6, v7}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 1260
    .line 1261
    .line 1262
    :cond_23
    :goto_15
    const-string v6, "android.gov.nist.javax.sip.CONNECTION_TIMEOUT"

    .line 1263
    .line 1264
    invoke-virtual {v11, v6}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v6

    .line 1268
    if-eqz v6, :cond_25

    .line 1269
    .line 1270
    :try_start_10
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1271
    .line 1272
    .line 1273
    move-result v6

    .line 1274
    if-lt v6, v4, :cond_24

    .line 1275
    .line 1276
    iput v6, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->connTimeout:I

    .line 1277
    .line 1278
    goto :goto_16

    .line 1279
    :cond_24
    sget-object v4, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 1280
    .line 1281
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1282
    .line 1283
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1284
    .line 1285
    .line 1286
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1287
    .line 1288
    .line 1289
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v5

    .line 1296
    invoke-virtual {v4, v5}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_10
    .catch Ljava/lang/NumberFormatException; {:try_start_10 .. :try_end_10} :catch_b

    .line 1297
    .line 1298
    .line 1299
    goto :goto_16

    .line 1300
    :catch_b
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1301
    .line 1302
    invoke-interface {v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 1303
    .line 1304
    .line 1305
    move-result v4

    .line 1306
    if-eqz v4, :cond_25

    .line 1307
    .line 1308
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1309
    .line 1310
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1311
    .line 1312
    const-string v6, "Bad conn timeout "

    .line 1313
    .line 1314
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1315
    .line 1316
    .line 1317
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v0

    .line 1324
    invoke-interface {v4, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 1325
    .line 1326
    .line 1327
    :cond_25
    :goto_16
    const-string v0, "android.gov.nist.javax.sip.STUN_SERVER"

    .line 1328
    .line 1329
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v0

    .line 1333
    if-eqz v0, :cond_26

    .line 1334
    .line 1335
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1336
    .line 1337
    const-string v4, "Ignoring obsolete property android.gov.nist.javax.sip.STUN_SERVER"

    .line 1338
    .line 1339
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 1340
    .line 1341
    .line 1342
    :cond_26
    const-string v0, "android.gov.nist.javax.sip.MAX_MESSAGE_SIZE"

    .line 1343
    .line 1344
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v0

    .line 1348
    if-eqz v0, :cond_27

    .line 1349
    .line 1350
    :try_start_11
    new-instance v4, Ljava/lang/Integer;

    .line 1351
    .line 1352
    invoke-direct {v4, v0}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1356
    .line 1357
    .line 1358
    move-result v0

    .line 1359
    iput v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxMessageSize:I

    .line 1360
    .line 1361
    const/16 v4, 0x1000

    .line 1362
    .line 1363
    if-ge v0, v4, :cond_28

    .line 1364
    .line 1365
    iput v4, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxMessageSize:I

    .line 1366
    .line 1367
    goto :goto_18

    .line 1368
    :catch_c
    move-exception v0

    .line 1369
    goto :goto_17

    .line 1370
    :cond_27
    iput v3, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxMessageSize:I
    :try_end_11
    .catch Ljava/lang/NumberFormatException; {:try_start_11 .. :try_end_11} :catch_c

    .line 1371
    .line 1372
    goto :goto_18

    .line 1373
    :goto_17
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1374
    .line 1375
    invoke-interface {v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 1376
    .line 1377
    .line 1378
    move-result v4

    .line 1379
    if-eqz v4, :cond_28

    .line 1380
    .line 1381
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1382
    .line 1383
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1384
    .line 1385
    const-string v6, "maxMessageSize - bad value "

    .line 1386
    .line 1387
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1388
    .line 1389
    .line 1390
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v0

    .line 1394
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0

    .line 1401
    invoke-interface {v4, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 1402
    .line 1403
    .line 1404
    :cond_28
    :goto_18
    const-string v0, "android.gov.nist.javax.sip.REENTRANT_LISTENER"

    .line 1405
    .line 1406
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v0

    .line 1410
    if-eqz v0, :cond_29

    .line 1411
    .line 1412
    invoke-virtual {v15, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1413
    .line 1414
    .line 1415
    move-result v0

    .line 1416
    if-eqz v0, :cond_29

    .line 1417
    .line 1418
    goto :goto_19

    .line 1419
    :cond_29
    move v14, v3

    .line 1420
    :goto_19
    iput-boolean v14, v1, Landroid/gov/nist/javax/sip/SipStackImpl;->reEntrantListener:Z

    .line 1421
    .line 1422
    const-string v0, "android.gov.nist.javax.sip.THREAD_AUDIT_INTERVAL_IN_MILLISECS"

    .line 1423
    .line 1424
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v4

    .line 1428
    if-eqz v4, :cond_2a

    .line 1429
    .line 1430
    :try_start_12
    new-instance v0, Landroid/gov/nist/core/ThreadAuditor;

    .line 1431
    .line 1432
    invoke-direct {v0}, Landroid/gov/nist/core/ThreadAuditor;-><init>()V

    .line 1433
    .line 1434
    .line 1435
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->threadAuditor:Landroid/gov/nist/core/ThreadAuditor;

    .line 1436
    .line 1437
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v0

    .line 1441
    invoke-static {v4}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v5

    .line 1445
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 1446
    .line 1447
    .line 1448
    move-result-wide v5

    .line 1449
    const-wide/16 v7, 0x2

    .line 1450
    .line 1451
    div-long/2addr v5, v7

    .line 1452
    invoke-virtual {v0, v5, v6}, Landroid/gov/nist/core/ThreadAuditor;->setPingIntervalInMillisecs(J)V
    :try_end_12
    .catch Ljava/lang/NumberFormatException; {:try_start_12 .. :try_end_12} :catch_d

    .line 1453
    .line 1454
    .line 1455
    goto :goto_1a

    .line 1456
    :catch_d
    move-exception v0

    .line 1457
    sget-object v5, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1458
    .line 1459
    invoke-interface {v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 1460
    .line 1461
    .line 1462
    move-result v5

    .line 1463
    if-eqz v5, :cond_2a

    .line 1464
    .line 1465
    sget-object v5, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1466
    .line 1467
    const-string v6, "THREAD_AUDIT_INTERVAL_IN_MILLISECS - bad value ["

    .line 1468
    .line 1469
    const-string v7, "] "

    .line 1470
    .line 1471
    invoke-static {v6, v4, v7}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v4

    .line 1475
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v0

    .line 1479
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1480
    .line 1481
    .line 1482
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v0

    .line 1486
    invoke-interface {v5, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 1487
    .line 1488
    .line 1489
    :cond_2a
    :goto_1a
    const-string v0, "android.gov.nist.javax.sip.PASS_INVITE_NON_2XX_ACK_TO_LISTENER"

    .line 1490
    .line 1491
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v0

    .line 1495
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v0

    .line 1499
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1500
    .line 1501
    .line 1502
    move-result v0

    .line 1503
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setNon2XXAckPassedToListener(Z)V

    .line 1504
    .line 1505
    .line 1506
    const-string v0, "android.gov.nist.javax.sip.AUTO_GENERATE_TIMESTAMP"

    .line 1507
    .line 1508
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v0

    .line 1512
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v0

    .line 1516
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1517
    .line 1518
    .line 1519
    move-result v0

    .line 1520
    iput-boolean v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->generateTimeStampHeader:Z

    .line 1521
    .line 1522
    const-string v0, "android.gov.nist.javax.sip.LOG_FACTORY"

    .line 1523
    .line 1524
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    if-eqz v0, :cond_2c

    .line 1529
    .line 1530
    :try_start_13
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v0

    .line 1534
    invoke-virtual {v0, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v0

    .line 1538
    invoke-virtual {v0, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v0

    .line 1542
    check-cast v0, Landroid/gov/nist/javax/sip/LogRecordFactory;

    .line 1543
    .line 1544
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logRecordFactory:Landroid/gov/nist/javax/sip/LogRecordFactory;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_e

    .line 1545
    .line 1546
    goto :goto_1b

    .line 1547
    :catch_e
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1548
    .line 1549
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 1550
    .line 1551
    .line 1552
    move-result v0

    .line 1553
    if-eqz v0, :cond_2b

    .line 1554
    .line 1555
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1556
    .line 1557
    const-string v4, "Bad configuration value for LOG_FACTORY -- using default logger"

    .line 1558
    .line 1559
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 1560
    .line 1561
    .line 1562
    :cond_2b
    new-instance v0, Landroid/gov/nist/javax/sip/stack/DefaultMessageLogFactory;

    .line 1563
    .line 1564
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/DefaultMessageLogFactory;-><init>()V

    .line 1565
    .line 1566
    .line 1567
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logRecordFactory:Landroid/gov/nist/javax/sip/LogRecordFactory;

    .line 1568
    .line 1569
    goto :goto_1b

    .line 1570
    :cond_2c
    new-instance v0, Landroid/gov/nist/javax/sip/stack/DefaultMessageLogFactory;

    .line 1571
    .line 1572
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/stack/DefaultMessageLogFactory;-><init>()V

    .line 1573
    .line 1574
    .line 1575
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logRecordFactory:Landroid/gov/nist/javax/sip/LogRecordFactory;

    .line 1576
    .line 1577
    :goto_1b
    const-string v0, "android.gov.nist.javax.sip.COMPUTE_CONTENT_LENGTH_FROM_MESSAGE_BODY"

    .line 1578
    .line 1579
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v0

    .line 1583
    invoke-virtual {v0, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1584
    .line 1585
    .line 1586
    move-result v0

    .line 1587
    invoke-static {v0}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->setComputeContentLengthFromMessage(Z)V

    .line 1588
    .line 1589
    .line 1590
    const-string v0, "android.gov.nist.javax.sip.TLS_CLIENT_PROTOCOLS"

    .line 1591
    .line 1592
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v0

    .line 1596
    const-string v4, "\" ,"

    .line 1597
    .line 1598
    const/16 v5, 0x20

    .line 1599
    .line 1600
    if-eqz v0, :cond_30

    .line 1601
    .line 1602
    new-instance v6, Ljava/util/StringTokenizer;

    .line 1603
    .line 1604
    invoke-direct {v6, v0, v4}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1605
    .line 1606
    .line 1607
    invoke-virtual {v6}, Ljava/util/StringTokenizer;->countTokens()I

    .line 1608
    .line 1609
    .line 1610
    move-result v0

    .line 1611
    new-array v0, v0, [Ljava/lang/String;

    .line 1612
    .line 1613
    sget-object v7, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1614
    .line 1615
    invoke-interface {v7, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 1616
    .line 1617
    .line 1618
    move-result v7

    .line 1619
    if-eqz v7, :cond_2d

    .line 1620
    .line 1621
    sget-object v7, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1622
    .line 1623
    const-string v8, "TLS Client Protocols = "

    .line 1624
    .line 1625
    invoke-interface {v7, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 1626
    .line 1627
    .line 1628
    :cond_2d
    move v7, v3

    .line 1629
    :goto_1c
    invoke-virtual {v6}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 1630
    .line 1631
    .line 1632
    move-result v8

    .line 1633
    if-eqz v8, :cond_2f

    .line 1634
    .line 1635
    invoke-virtual {v6}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v8

    .line 1639
    aput-object v8, v0, v7

    .line 1640
    .line 1641
    sget-object v8, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1642
    .line 1643
    invoke-interface {v8, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 1644
    .line 1645
    .line 1646
    move-result v8

    .line 1647
    if-eqz v8, :cond_2e

    .line 1648
    .line 1649
    sget-object v8, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1650
    .line 1651
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1652
    .line 1653
    const-string v10, "TLS Client Protocol = "

    .line 1654
    .line 1655
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1656
    .line 1657
    .line 1658
    aget-object v10, v0, v7

    .line 1659
    .line 1660
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v9

    .line 1667
    invoke-interface {v8, v9}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 1668
    .line 1669
    .line 1670
    :cond_2e
    add-int/lit8 v7, v7, 0x1

    .line 1671
    .line 1672
    goto :goto_1c

    .line 1673
    :cond_2f
    iput-object v0, v1, Landroid/gov/nist/javax/sip/SipStackImpl;->enabledProtocols:[Ljava/lang/String;

    .line 1674
    .line 1675
    :cond_30
    const-string v0, "android.gov.nist.javax.sip.ENABLED_CIPHER_SUITES"

    .line 1676
    .line 1677
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0

    .line 1681
    if-eqz v0, :cond_34

    .line 1682
    .line 1683
    new-instance v6, Ljava/util/StringTokenizer;

    .line 1684
    .line 1685
    invoke-direct {v6, v0, v4}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1686
    .line 1687
    .line 1688
    invoke-virtual {v6}, Ljava/util/StringTokenizer;->countTokens()I

    .line 1689
    .line 1690
    .line 1691
    move-result v0

    .line 1692
    new-array v0, v0, [Ljava/lang/String;

    .line 1693
    .line 1694
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1695
    .line 1696
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 1697
    .line 1698
    .line 1699
    move-result v4

    .line 1700
    if-eqz v4, :cond_31

    .line 1701
    .line 1702
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1703
    .line 1704
    const-string v7, "Cipher Suites = "

    .line 1705
    .line 1706
    invoke-interface {v4, v7}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 1707
    .line 1708
    .line 1709
    :cond_31
    move v4, v3

    .line 1710
    :goto_1d
    invoke-virtual {v6}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    .line 1711
    .line 1712
    .line 1713
    move-result v7

    .line 1714
    if-eqz v7, :cond_33

    .line 1715
    .line 1716
    invoke-virtual {v6}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v7

    .line 1720
    aput-object v7, v0, v4

    .line 1721
    .line 1722
    sget-object v7, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1723
    .line 1724
    invoke-interface {v7, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 1725
    .line 1726
    .line 1727
    move-result v7

    .line 1728
    if-eqz v7, :cond_32

    .line 1729
    .line 1730
    sget-object v7, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1731
    .line 1732
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1733
    .line 1734
    const-string v9, "Cipher Suite = "

    .line 1735
    .line 1736
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1737
    .line 1738
    .line 1739
    aget-object v9, v0, v4

    .line 1740
    .line 1741
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1742
    .line 1743
    .line 1744
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v8

    .line 1748
    invoke-interface {v7, v8}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 1749
    .line 1750
    .line 1751
    :cond_32
    add-int/lit8 v4, v4, 0x1

    .line 1752
    .line 1753
    goto :goto_1d

    .line 1754
    :cond_33
    iput-object v0, v1, Landroid/gov/nist/javax/sip/SipStackImpl;->cipherSuites:[Ljava/lang/String;

    .line 1755
    .line 1756
    :cond_34
    const-string v0, "android.gov.nist.javax.sip.RFC_2543_SUPPORT_ENABLED"

    .line 1757
    .line 1758
    invoke-virtual {v11, v0, v15}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v0

    .line 1762
    invoke-virtual {v0, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1763
    .line 1764
    .line 1765
    move-result v0

    .line 1766
    iput-boolean v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->rfc2543Supported:Z

    .line 1767
    .line 1768
    const-string v0, "android.gov.nist.javax.sip.PATCH_SIP_WEBSOCKETS_HEADERS"

    .line 1769
    .line 1770
    invoke-virtual {v11, v0, v15}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v0

    .line 1774
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1775
    .line 1776
    .line 1777
    move-result v0

    .line 1778
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v0

    .line 1782
    invoke-super {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setPatchWebSocketHeaders(Ljava/lang/Boolean;)V

    .line 1783
    .line 1784
    .line 1785
    const-string v0, "android.gov.nist.javax.sip.ALWAYS_ADD_RPORT"

    .line 1786
    .line 1787
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v0

    .line 1791
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1792
    .line 1793
    .line 1794
    move-result v0

    .line 1795
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v0

    .line 1799
    invoke-super {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setPatchRport(Ljava/lang/Boolean;)V

    .line 1800
    .line 1801
    .line 1802
    const-string v0, "android.gov.nist.javax.sip.NEVER_ADD_RECEIVED_RPORT"

    .line 1803
    .line 1804
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v0

    .line 1808
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1809
    .line 1810
    .line 1811
    move-result v0

    .line 1812
    invoke-super {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setPatchReceivedRport(Z)V

    .line 1813
    .line 1814
    .line 1815
    const-string v0, "android.gov.nist.javax.sip.CANCEL_CLIENT_TRANSACTION_CHECKED"

    .line 1816
    .line 1817
    invoke-virtual {v11, v0, v15}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v0

    .line 1821
    invoke-virtual {v0, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1822
    .line 1823
    .line 1824
    move-result v0

    .line 1825
    iput-boolean v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->cancelClientTransactionChecked:Z

    .line 1826
    .line 1827
    const-string v0, "android.gov.nist.javax.sip.LOG_STACK_TRACE_ON_MESSAGE_SEND"

    .line 1828
    .line 1829
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v0

    .line 1833
    invoke-virtual {v0, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1834
    .line 1835
    .line 1836
    move-result v0

    .line 1837
    iput-boolean v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logStackTraceOnMessageSend:Z

    .line 1838
    .line 1839
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1840
    .line 1841
    invoke-interface {v0, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 1842
    .line 1843
    .line 1844
    move-result v0

    .line 1845
    if-eqz v0, :cond_35

    .line 1846
    .line 1847
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1848
    .line 1849
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1850
    .line 1851
    const-string v6, "created Sip stack. Properties = "

    .line 1852
    .line 1853
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1854
    .line 1855
    .line 1856
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1857
    .line 1858
    .line 1859
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v4

    .line 1863
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 1864
    .line 1865
    .line 1866
    :cond_35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v0

    .line 1870
    const-string v4, "/TIMESTAMP"

    .line 1871
    .line 1872
    invoke-virtual {v0, v4}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v0

    .line 1876
    if-eqz v0, :cond_36

    .line 1877
    .line 1878
    new-instance v4, Ljava/io/BufferedReader;

    .line 1879
    .line 1880
    new-instance v6, Ljava/io/InputStreamReader;

    .line 1881
    .line 1882
    invoke-direct {v6, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 1883
    .line 1884
    .line 1885
    invoke-direct {v4, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 1886
    .line 1887
    .line 1888
    :try_start_14
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v4

    .line 1892
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 1893
    .line 1894
    .line 1895
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1896
    .line 1897
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->setBuildTimeStamp(Ljava/lang/String;)V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_f

    .line 1898
    .line 1899
    .line 1900
    goto :goto_1e

    .line 1901
    :catch_f
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 1902
    .line 1903
    const-string v4, "Could not open build timestamp."

    .line 1904
    .line 1905
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 1906
    .line 1907
    .line 1908
    :cond_36
    :goto_1e
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->MAX_DATAGRAM_SIZE:Ljava/lang/Integer;

    .line 1909
    .line 1910
    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 1911
    .line 1912
    .line 1913
    move-result-object v4

    .line 1914
    const-string v6, "android.gov.nist.javax.sip.RECEIVE_UDP_BUFFER_SIZE"

    .line 1915
    .line 1916
    invoke-virtual {v11, v6, v4}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v4

    .line 1920
    new-instance v6, Ljava/lang/Integer;

    .line 1921
    .line 1922
    invoke-direct {v6, v4}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    .line 1923
    .line 1924
    .line 1925
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1926
    .line 1927
    .line 1928
    move-result v4

    .line 1929
    invoke-super {v1, v4}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setReceiveUdpBufferSize(I)V

    .line 1930
    .line 1931
    .line 1932
    const-string v4, "android.gov.nist.javax.sip.SEND_UDP_BUFFER_SIZE"

    .line 1933
    .line 1934
    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v0

    .line 1938
    invoke-virtual {v11, v4, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v0

    .line 1942
    new-instance v4, Ljava/lang/Integer;

    .line 1943
    .line 1944
    invoke-direct {v4, v0}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    .line 1945
    .line 1946
    .line 1947
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1948
    .line 1949
    .line 1950
    move-result v0

    .line 1951
    invoke-super {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setSendUdpBufferSize(I)V

    .line 1952
    .line 1953
    .line 1954
    const-string v0, "android.gov.nist.javax.sip.LINGER_TIMER"

    .line 1955
    .line 1956
    const-string v4, "8"

    .line 1957
    .line 1958
    invoke-virtual {v11, v0, v4}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v0

    .line 1962
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1963
    .line 1964
    .line 1965
    move-result v0

    .line 1966
    invoke-super {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setConnectionLingerTimer(I)V

    .line 1967
    .line 1968
    .line 1969
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1970
    .line 1971
    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v4

    .line 1975
    const-string v6, "android.gov.nist.javax.sip.IS_BACK_TO_BACK_USER_AGENT"

    .line 1976
    .line 1977
    invoke-virtual {v11, v6, v4}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v4

    .line 1981
    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1982
    .line 1983
    .line 1984
    move-result v4

    .line 1985
    iput-boolean v4, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isBackToBackUserAgent:Z

    .line 1986
    .line 1987
    const-string v4, "android.gov.nist.javax.sip.REJECT_STRAY_RESPONSES"

    .line 1988
    .line 1989
    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v6

    .line 1993
    invoke-virtual {v11, v4, v6}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1994
    .line 1995
    .line 1996
    move-result-object v4

    .line 1997
    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 1998
    .line 1999
    .line 2000
    move-result v4

    .line 2001
    iput-boolean v4, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->checkBranchId:Z

    .line 2002
    .line 2003
    const-string v4, "android.gov.nist.javax.sip.DELIVER_TERMINATED_EVENT_FOR_NULL_DIALOG"

    .line 2004
    .line 2005
    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v0

    .line 2009
    invoke-virtual {v11, v4, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v0

    .line 2013
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 2014
    .line 2015
    .line 2016
    move-result v0

    .line 2017
    iput-boolean v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isDialogTerminatedEventDeliveredForNullDialog:Z

    .line 2018
    .line 2019
    const-string v0, "android.gov.nist.javax.sip.MAX_FORK_TIME_SECONDS"

    .line 2020
    .line 2021
    const-string v4, "0"

    .line 2022
    .line 2023
    invoke-virtual {v11, v0, v4}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v0

    .line 2027
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2028
    .line 2029
    .line 2030
    move-result v0

    .line 2031
    iput v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->maxForkTime:I

    .line 2032
    .line 2033
    const-string v0, "android.gov.nist.javax.sip.EARLY_DIALOG_TIMEOUT_SECONDS"

    .line 2034
    .line 2035
    const-string v4, "180"

    .line 2036
    .line 2037
    invoke-virtual {v11, v0, v4}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v0

    .line 2041
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2042
    .line 2043
    .line 2044
    move-result v0

    .line 2045
    iput v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->earlyDialogTimeout:I

    .line 2046
    .line 2047
    const-string v0, "android.gov.nist.javax.sip.MIN_KEEPALIVE_TIME_SECONDS"

    .line 2048
    .line 2049
    invoke-virtual {v11, v0, v13}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2050
    .line 2051
    .line 2052
    move-result-object v0

    .line 2053
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2054
    .line 2055
    .line 2056
    move-result v0

    .line 2057
    int-to-long v6, v0

    .line 2058
    iput-wide v6, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->minKeepAliveInterval:J

    .line 2059
    .line 2060
    const-string v0, "android.gov.nist.javax.sip.DELIVER_RETRANSMITTED_ACK_TO_LISTENER"

    .line 2061
    .line 2062
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v0

    .line 2066
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 2067
    .line 2068
    .line 2069
    move-result v0

    .line 2070
    iput-boolean v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->deliverRetransmittedAckToListener:Z

    .line 2071
    .line 2072
    const-string v0, "android.gov.nist.javax.sip.DIALOG_TIMEOUT_FACTOR"

    .line 2073
    .line 2074
    const-string v2, "64"

    .line 2075
    .line 2076
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v0

    .line 2080
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 2081
    .line 2082
    .line 2083
    move-result v0

    .line 2084
    iput v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->dialogTimeoutFactor:I

    .line 2085
    .line 2086
    const-class v0, Landroid/gov/nist/javax/sip/parser/StringMsgParserFactory;

    .line 2087
    .line 2088
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v0

    .line 2092
    const-string v2, "android.gov.nist.javax.sip.MESSAGE_PARSER_FACTORY"

    .line 2093
    .line 2094
    invoke-virtual {v11, v2, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2095
    .line 2096
    .line 2097
    move-result-object v0

    .line 2098
    :try_start_15
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v0

    .line 2102
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v0

    .line 2106
    check-cast v0, Landroid/gov/nist/javax/sip/parser/MessageParserFactory;

    .line 2107
    .line 2108
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageParserFactory:Landroid/gov/nist/javax/sip/parser/MessageParserFactory;
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_10

    .line 2109
    .line 2110
    goto :goto_1f

    .line 2111
    :catch_10
    move-exception v0

    .line 2112
    sget-object v2, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2113
    .line 2114
    const-string v4, "Bad configuration value for android.gov.nist.javax.sip.MESSAGE_PARSER_FACTORY"

    .line 2115
    .line 2116
    invoke-interface {v2, v4, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2117
    .line 2118
    .line 2119
    :goto_1f
    const-class v0, Landroid/gov/nist/javax/sip/stack/OIOMessageProcessorFactory;

    .line 2120
    .line 2121
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v0

    .line 2125
    const-string v2, "android.gov.nist.javax.sip.MESSAGE_PROCESSOR_FACTORY"

    .line 2126
    .line 2127
    invoke-virtual {v11, v2, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2128
    .line 2129
    .line 2130
    move-result-object v0

    .line 2131
    :try_start_16
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v0

    .line 2135
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v0

    .line 2139
    check-cast v0, Landroid/gov/nist/javax/sip/stack/MessageProcessorFactory;

    .line 2140
    .line 2141
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->messageProcessorFactory:Landroid/gov/nist/javax/sip/stack/MessageProcessorFactory;
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_11

    .line 2142
    .line 2143
    goto :goto_20

    .line 2144
    :catch_11
    move-exception v0

    .line 2145
    sget-object v2, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2146
    .line 2147
    const-string v4, "Bad configuration value for android.gov.nist.javax.sip.MESSAGE_PROCESSOR_FACTORY"

    .line 2148
    .line 2149
    invoke-interface {v2, v4, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2150
    .line 2151
    .line 2152
    :goto_20
    const-string v0, "android.gov.nist.javax.sip.NIO_MAX_SOCKET_IDLE_TIME"

    .line 2153
    .line 2154
    const-string v2, "7200000"

    .line 2155
    .line 2156
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2157
    .line 2158
    .line 2159
    move-result-object v2

    .line 2160
    :try_start_17
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 2161
    .line 2162
    .line 2163
    move-result-wide v6

    .line 2164
    iput-wide v6, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->nioSocketMaxIdleTime:J
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_12

    .line 2165
    .line 2166
    goto :goto_21

    .line 2167
    :catch_12
    move-exception v0

    .line 2168
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2169
    .line 2170
    new-instance v6, Ljava/lang/StringBuilder;

    .line 2171
    .line 2172
    const-string v7, "Bad configuration value for android.gov.nist.javax.sip.NIO_MAX_SOCKET_IDLE_TIME="

    .line 2173
    .line 2174
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2175
    .line 2176
    .line 2177
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2178
    .line 2179
    .line 2180
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2181
    .line 2182
    .line 2183
    move-result-object v2

    .line 2184
    invoke-interface {v4, v2, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2185
    .line 2186
    .line 2187
    :goto_21
    const-string v0, "android.gov.nist.javax.sip.NIO_BLOCKING_MODE"

    .line 2188
    .line 2189
    const-string v2, "BLOCKING"

    .line 2190
    .line 2191
    invoke-virtual {v11, v0, v2}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v2

    .line 2195
    :try_start_18
    invoke-static {v2}, Landroid/gov/nist/javax/sip/stack/NIOMode;->valueOf(Ljava/lang/String;)Landroid/gov/nist/javax/sip/stack/NIOMode;

    .line 2196
    .line 2197
    .line 2198
    move-result-object v0

    .line 2199
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->nioMode:Landroid/gov/nist/javax/sip/stack/NIOMode;
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_13

    .line 2200
    .line 2201
    goto :goto_22

    .line 2202
    :catch_13
    move-exception v0

    .line 2203
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2204
    .line 2205
    new-instance v6, Ljava/lang/StringBuilder;

    .line 2206
    .line 2207
    const-string v7, "Bad configuration value for android.gov.nist.javax.sip.NIO_BLOCKING_MODE="

    .line 2208
    .line 2209
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2210
    .line 2211
    .line 2212
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2213
    .line 2214
    .line 2215
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2216
    .line 2217
    .line 2218
    move-result-object v2

    .line 2219
    invoke-interface {v4, v2, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2220
    .line 2221
    .line 2222
    :goto_22
    const-class v0, Landroid/gov/nist/javax/sip/stack/timers/DefaultSipTimer;

    .line 2223
    .line 2224
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2225
    .line 2226
    .line 2227
    move-result-object v0

    .line 2228
    const-string v2, "android.gov.nist.javax.sip.TIMER_CLASS_NAME"

    .line 2229
    .line 2230
    invoke-virtual {v11, v2, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2231
    .line 2232
    .line 2233
    move-result-object v0

    .line 2234
    :try_start_19
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2235
    .line 2236
    .line 2237
    move-result-object v0

    .line 2238
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 2239
    .line 2240
    .line 2241
    move-result-object v0

    .line 2242
    check-cast v0, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 2243
    .line 2244
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setTimer(Landroid/gov/nist/javax/sip/stack/timers/SipTimer;)V

    .line 2245
    .line 2246
    .line 2247
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 2248
    .line 2249
    .line 2250
    move-result-object v0

    .line 2251
    invoke-interface {v0, v1, v11}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->start(Landroid/gov/nist/javax/sip/SipStackImpl;Ljava/util/Properties;)V

    .line 2252
    .line 2253
    .line 2254
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 2255
    .line 2256
    .line 2257
    move-result-object v0

    .line 2258
    if-eqz v0, :cond_37

    .line 2259
    .line 2260
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 2261
    .line 2262
    .line 2263
    move-result-object v0

    .line 2264
    invoke-virtual {v0}, Landroid/gov/nist/core/ThreadAuditor;->isEnabled()Z

    .line 2265
    .line 2266
    .line 2267
    move-result v0

    .line 2268
    if-eqz v0, :cond_37

    .line 2269
    .line 2270
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 2271
    .line 2272
    .line 2273
    move-result-object v0

    .line 2274
    new-instance v2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;

    .line 2275
    .line 2276
    invoke-direct {v2, v1, v12}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;)V

    .line 2277
    .line 2278
    .line 2279
    const-wide/16 v6, 0x0

    .line 2280
    .line 2281
    invoke-interface {v0, v2, v6, v7}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_14

    .line 2282
    .line 2283
    .line 2284
    goto :goto_23

    .line 2285
    :catch_14
    move-exception v0

    .line 2286
    sget-object v2, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2287
    .line 2288
    const-string v4, "Bad configuration value for android.gov.nist.javax.sip.TIMER_CLASS_NAME"

    .line 2289
    .line 2290
    invoke-interface {v2, v4, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2291
    .line 2292
    .line 2293
    :cond_37
    :goto_23
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2294
    .line 2295
    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v0

    .line 2299
    const-string v2, "android.gov.nist.javax.sip.AGGRESSIVE_CLEANUP"

    .line 2300
    .line 2301
    invoke-virtual {v11, v2, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2302
    .line 2303
    .line 2304
    move-result-object v0

    .line 2305
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 2306
    .line 2307
    .line 2308
    move-result v0

    .line 2309
    if-eqz v0, :cond_38

    .line 2310
    .line 2311
    sget-object v0, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->Normal:Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 2312
    .line 2313
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setReleaseReferencesStrategy(Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;)V

    .line 2314
    .line 2315
    .line 2316
    :cond_38
    const-string v0, "android.gov.nist.javax.sip.RELEASE_REFERENCES_STRATEGY"

    .line 2317
    .line 2318
    invoke-virtual {v11, v0}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 2319
    .line 2320
    .line 2321
    move-result-object v0

    .line 2322
    if-eqz v0, :cond_39

    .line 2323
    .line 2324
    invoke-static {v0}, Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;->valueOf(Ljava/lang/String;)Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 2325
    .line 2326
    .line 2327
    move-result-object v0

    .line 2328
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setReleaseReferencesStrategy(Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;)V

    .line 2329
    .line 2330
    .line 2331
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2332
    .line 2333
    invoke-interface {v0, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 2334
    .line 2335
    .line 2336
    move-result v0

    .line 2337
    if-eqz v0, :cond_39

    .line 2338
    .line 2339
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2340
    .line 2341
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2342
    .line 2343
    const-string v4, "Using following release references strategy "

    .line 2344
    .line 2345
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2346
    .line 2347
    .line 2348
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getReleaseReferencesStrategy()Landroid/gov/nist/javax/sip/ReleaseReferencesStrategy;

    .line 2349
    .line 2350
    .line 2351
    move-result-object v4

    .line 2352
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2353
    .line 2354
    .line 2355
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2356
    .line 2357
    .line 2358
    move-result-object v2

    .line 2359
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 2360
    .line 2361
    .line 2362
    :cond_39
    const-string v0, "android.gov.nist.javax.sip.SIP_MESSAGE_VALVE"

    .line 2363
    .line 2364
    invoke-virtual {v11, v0, v12}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v0

    .line 2368
    const-string v2, ""

    .line 2369
    .line 2370
    if-eqz v0, :cond_3a

    .line 2371
    .line 2372
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2373
    .line 2374
    .line 2375
    move-result v4

    .line 2376
    if-nez v4, :cond_3a

    .line 2377
    .line 2378
    const-string v4, ","

    .line 2379
    .line 2380
    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 2381
    .line 2382
    .line 2383
    move-result-object v4

    .line 2384
    array-length v5, v4

    .line 2385
    :goto_24
    if-ge v3, v5, :cond_3a

    .line 2386
    .line 2387
    aget-object v0, v4, v3

    .line 2388
    .line 2389
    :try_start_1a
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2390
    .line 2391
    .line 2392
    move-result-object v0

    .line 2393
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 2394
    .line 2395
    .line 2396
    move-result-object v0

    .line 2397
    move-object v6, v0

    .line 2398
    check-cast v6, Landroid/gov/nist/javax/sip/stack/SIPMessageValve;
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_16

    .line 2399
    .line 2400
    const-wide/16 v7, 0x64

    .line 2401
    .line 2402
    :try_start_1b
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V

    .line 2403
    .line 2404
    .line 2405
    invoke-interface {v6, v1}, Landroid/gov/nist/javax/sip/stack/SIPMessageValve;->init(Landroid/javax/sip/SipStack;)V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_15

    .line 2406
    .line 2407
    .line 2408
    goto :goto_25

    .line 2409
    :catch_15
    move-exception v0

    .line 2410
    :try_start_1c
    sget-object v7, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2411
    .line 2412
    const-string v8, "Error intializing SIPMessageValve"

    .line 2413
    .line 2414
    invoke-interface {v7, v8, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2415
    .line 2416
    .line 2417
    :goto_25
    iget-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageValves:Ljava/util/List;

    .line 2418
    .line 2419
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_16

    .line 2420
    .line 2421
    .line 2422
    goto :goto_26

    .line 2423
    :catch_16
    move-exception v0

    .line 2424
    sget-object v6, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2425
    .line 2426
    const-string v7, "Bad configuration value for android.gov.nist.javax.sip.SIP_MESSAGE_VALVE"

    .line 2427
    .line 2428
    invoke-interface {v6, v7, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2429
    .line 2430
    .line 2431
    :goto_26
    add-int/lit8 v3, v3, 0x1

    .line 2432
    .line 2433
    goto :goto_24

    .line 2434
    :cond_3a
    const-string v0, "android.gov.nist.javax.sip.SIP_EVENT_INTERCEPTOR"

    .line 2435
    .line 2436
    invoke-virtual {v11, v0, v12}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2437
    .line 2438
    .line 2439
    move-result-object v0

    .line 2440
    if-eqz v0, :cond_3b

    .line 2441
    .line 2442
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2443
    .line 2444
    .line 2445
    move-result v2

    .line 2446
    if-nez v2, :cond_3b

    .line 2447
    .line 2448
    :try_start_1d
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2449
    .line 2450
    .line 2451
    move-result-object v0

    .line 2452
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 2453
    .line 2454
    .line 2455
    move-result-object v0

    .line 2456
    check-cast v0, Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 2457
    .line 2458
    iput-object v0, v1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 2459
    .line 2460
    new-instance v0, Landroid/gov/nist/javax/sip/SipStackImpl$1;

    .line 2461
    .line 2462
    invoke-direct {v0, v1, v1}, Landroid/gov/nist/javax/sip/SipStackImpl$1;-><init>(Landroid/gov/nist/javax/sip/SipStackImpl;Landroid/javax/sip/SipStack;)V

    .line 2463
    .line 2464
    .line 2465
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_17

    .line 2466
    .line 2467
    .line 2468
    goto :goto_27

    .line 2469
    :catch_17
    move-exception v0

    .line 2470
    sget-object v2, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2471
    .line 2472
    const-string v3, "Bad configuration value for android.gov.nist.javax.sip.SIP_EVENT_INTERCEPTOR"

    .line 2473
    .line 2474
    invoke-interface {v2, v3, v0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2475
    .line 2476
    .line 2477
    :cond_3b
    :goto_27
    const-string v0, "android.gov.nist.javax.sip.SSL_RENEGOTIATION_ENABLED"

    .line 2478
    .line 2479
    invoke-virtual {v11, v0, v15}, Landroid/gov/nist/javax/sip/MergedSystemProperties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2480
    .line 2481
    .line 2482
    move-result-object v0

    .line 2483
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 2484
    .line 2485
    .line 2486
    move-result v0

    .line 2487
    invoke-virtual {v1, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setSslRenegotiationEnabled(Z)V

    .line 2488
    .line 2489
    .line 2490
    return-void

    .line 2491
    :catch_18
    move-exception v0

    .line 2492
    new-instance v1, Landroid/javax/sip/PeerUnavailableException;

    .line 2493
    .line 2494
    invoke-direct {v1, v9, v0}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2495
    .line 2496
    .line 2497
    throw v1

    .line 2498
    :catch_19
    move-exception v0

    .line 2499
    new-instance v1, Landroid/javax/sip/PeerUnavailableException;

    .line 2500
    .line 2501
    invoke-direct {v1, v9, v0}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2502
    .line 2503
    .line 2504
    throw v1

    .line 2505
    :catch_1a
    move-exception v0

    .line 2506
    goto :goto_28

    .line 2507
    :catch_1b
    move-exception v0

    .line 2508
    goto :goto_29

    .line 2509
    :goto_28
    invoke-static {v8, v3, v10}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2510
    .line 2511
    .line 2512
    move-result-object v1

    .line 2513
    invoke-static {v1, v0}, La/e9d0;->t(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2514
    .line 2515
    .line 2516
    throw v12

    .line 2517
    :goto_29
    invoke-static {v8, v3, v10}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2518
    .line 2519
    .line 2520
    move-result-object v1

    .line 2521
    invoke-static {v1, v0}, La/e9d0;->t(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2522
    .line 2523
    .line 2524
    throw v12

    .line 2525
    :catch_1c
    move-exception v0

    .line 2526
    sget-object v1, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2527
    .line 2528
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2529
    .line 2530
    .line 2531
    move-result-object v2

    .line 2532
    check-cast v2, Ljava/lang/Exception;

    .line 2533
    .line 2534
    const-string v3, "could not instantiate router"

    .line 2535
    .line 2536
    invoke-interface {v1, v3, v2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2537
    .line 2538
    .line 2539
    new-instance v1, Landroid/javax/sip/PeerUnavailableException;

    .line 2540
    .line 2541
    const-string v2, "Could not instantiate router"

    .line 2542
    .line 2543
    invoke-direct {v1, v2, v0}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2544
    .line 2545
    .line 2546
    throw v1

    .line 2547
    :catch_1d
    move-exception v0

    .line 2548
    sget-object v1, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2549
    .line 2550
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 2551
    .line 2552
    .line 2553
    move-result-object v2

    .line 2554
    check-cast v2, Ljava/lang/Exception;

    .line 2555
    .line 2556
    const-string v3, "could not instantiate router -- invocation target problem"

    .line 2557
    .line 2558
    invoke-interface {v1, v3, v2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 2559
    .line 2560
    .line 2561
    new-instance v1, Landroid/javax/sip/PeerUnavailableException;

    .line 2562
    .line 2563
    const-string v2, "Cound not instantiate router - check constructor"

    .line 2564
    .line 2565
    invoke-direct {v1, v2, v0}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2566
    .line 2567
    .line 2568
    throw v1

    .line 2569
    :catch_1e
    move-exception v0

    .line 2570
    goto :goto_2a

    .line 2571
    :catch_1f
    move-exception v0

    .line 2572
    goto :goto_2b

    .line 2573
    :goto_2a
    invoke-static {v3, v4, v10}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2574
    .line 2575
    .line 2576
    move-result-object v1

    .line 2577
    invoke-static {v1, v0}, La/e9d0;->t(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2578
    .line 2579
    .line 2580
    throw v12

    .line 2581
    :goto_2b
    invoke-static {v3, v4, v10}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2582
    .line 2583
    .line 2584
    move-result-object v1

    .line 2585
    invoke-static {v1, v0}, La/e9d0;->t(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2586
    .line 2587
    .line 2588
    throw v12

    .line 2589
    :catch_20
    move-exception v0

    .line 2590
    goto :goto_2c

    .line 2591
    :catch_21
    move-exception v0

    .line 2592
    goto :goto_2d

    .line 2593
    :goto_2c
    invoke-static {v2, v4, v10}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2594
    .line 2595
    .line 2596
    move-result-object v1

    .line 2597
    invoke-static {v1, v0}, La/e9d0;->t(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2598
    .line 2599
    .line 2600
    throw v12

    .line 2601
    :goto_2d
    invoke-static {v2, v4, v10}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2602
    .line 2603
    .line 2604
    move-result-object v1

    .line 2605
    invoke-static {v1, v0}, La/e9d0;->t(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2606
    .line 2607
    .line 2608
    throw v12

    .line 2609
    :cond_3c
    new-instance v0, Landroid/javax/sip/PeerUnavailableException;

    .line 2610
    .line 2611
    const-string v1, "stack name is missing"

    .line 2612
    .line 2613
    invoke-direct {v0, v1}, Landroid/javax/sip/PeerUnavailableException;-><init>(Ljava/lang/String;)V

    .line 2614
    .line 2615
    .line 2616
    throw v0
.end method

.method public static synthetic access$000()Landroid/gov/nist/core/StackLogger;
    .locals 1

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    return-object v0
.end method

.method private reInitialize()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->reInit()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/gov/nist/javax/sip/EventScanner;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/EventScanner;-><init>(Landroid/gov/nist/javax/sip/SipStackImpl;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->eventScanner:Landroid/gov/nist/javax/sip/EventScanner;

    .line 10
    .line 11
    new-instance v0, Ljava/util/Hashtable;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->listeningPoints:Ljava/util/Hashtable;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->sipProviders:Ljava/util/List;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->sipListener:Landroid/javax/sip/SipListener;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v1}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->isStarted()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    iget-object v1, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->configurationProperties:Ljava/util/Properties;

    .line 39
    .line 40
    const-class v2, Landroid/gov/nist/javax/sip/stack/timers/DefaultSipTimer;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, "android.gov.nist.javax.sip.TIMER_CLASS_NAME"

    .line 47
    .line 48
    invoke-virtual {v1, v3, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :try_start_0
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->setTimer(Landroid/gov/nist/javax/sip/stack/timers/SipTimer;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v2, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->configurationProperties:Ljava/util/Properties;

    .line 70
    .line 71
    invoke-interface {v1, p0, v2}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->start(Landroid/gov/nist/javax/sip/SipStackImpl;Ljava/util/Properties;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-eqz v1, :cond_0

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getThreadAuditor()Landroid/gov/nist/core/ThreadAuditor;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1}, Landroid/gov/nist/core/ThreadAuditor;->isEnabled()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_0

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v2, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;

    .line 95
    .line 96
    invoke-direct {v2, p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack$PingTimer;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/core/ThreadAuditor$ThreadHandle;)V

    .line 97
    .line 98
    .line 99
    const-wide/16 v3, 0x0

    .line 100
    .line 101
    invoke-interface {v1, v2, v3, v4}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->schedule(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :catch_0
    move-exception p0

    .line 106
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 107
    .line 108
    const-string v1, "Bad configuration value for android.gov.nist.javax.sip.TIMER_CLASS_NAME"

    .line 109
    .line 110
    invoke-interface {v0, v1, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 111
    .line 112
    .line 113
    :cond_0
    return-void
.end method


# virtual methods
.method public acquireSem()Z
    .locals 3

    .line 1
    :try_start_0
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->stackSemaphore:Ljava/util/concurrent/Semaphore;

    .line 2
    .line 3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    const-wide/16 v1, 0xa

    .line 6
    .line 7
    invoke-virtual {p0, v1, v2, v0}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    .line 8
    .line 9
    .line 10
    move-result p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return p0

    .line 12
    :catch_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public addLogAppender(La/dp3;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object p0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    instance-of v0, p0, Landroid/gov/nist/core/LogWriter;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Landroid/gov/nist/core/LogWriter;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/gov/nist/core/LogWriter;->addAppender(La/dp3;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public createListeningPoint(ILjava/lang/String;)Landroid/javax/sip/ListeningPoint;
    .locals 1

    .line 299
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->stackAddress:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 300
    invoke-virtual {p0, v0, p1, p2}, Landroid/gov/nist/javax/sip/SipStackImpl;->createListeningPoint(Ljava/lang/String;ILjava/lang/String;)Landroid/javax/sip/ListeningPoint;

    move-result-object p0

    return-object p0

    .line 301
    :cond_0
    const-string p0, "Stack does not have a default IP Address!"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public declared-synchronized createListeningPoint(Ljava/lang/String;ILjava/lang/String;)Landroid/javax/sip/ListeningPoint;
    .locals 7

    .line 1
    const-string v0, "Invalid argument address = "

    .line 2
    .line 3
    const-string v1, "Created Message Processor: "

    .line 4
    .line 5
    const-string v2, "bad transport "

    .line 6
    .line 7
    const-string v3, "createListeningPoint : address = "

    .line 8
    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 11
    .line 12
    const/16 v5, 0x20

    .line 13
    .line 14
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 21
    .line 22
    new-instance v6, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v3, " port = "

    .line 31
    .line 32
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v3, " transport = "

    .line 39
    .line 40
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-interface {v4, v3}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_0
    :goto_0
    if-eqz p1, :cond_9

    .line 58
    .line 59
    if-eqz p3, :cond_8

    .line 60
    .line 61
    if-lez p2, :cond_7

    .line 62
    .line 63
    const-string v3, "UDP"

    .line 64
    .line 65
    invoke-virtual {p3, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_2

    .line 70
    .line 71
    const-string v3, "TLS"

    .line 72
    .line 73
    invoke-virtual {p3, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    const-string v3, "TCP"

    .line 80
    .line 81
    invoke-virtual {p3, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-nez v3, :cond_2

    .line 86
    .line 87
    const-string v3, "SCTP"

    .line 88
    .line 89
    invoke-virtual {p3, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-nez v3, :cond_2

    .line 94
    .line 95
    const-string v3, "WS"

    .line 96
    .line 97
    invoke-virtual {p3, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-nez v3, :cond_2

    .line 102
    .line 103
    const-string v3, "WSS"

    .line 104
    .line 105
    invoke-virtual {p3, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    new-instance p1, Landroid/javax/sip/TransportNotSupportedException;

    .line 113
    .line 114
    invoke-virtual {v2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-direct {p1, p2}, Landroid/javax/sip/TransportNotSupportedException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAlive()Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-nez v2, :cond_3

    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    iput-boolean v2, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->toExit:Z

    .line 130
    .line 131
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/SipStackImpl;->reInitialize()V

    .line 132
    .line 133
    .line 134
    :cond_3
    invoke-static {p1, p2, p3}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->makeKey(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    iget-object v3, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->listeningPoints:Ljava/util/Hashtable;

    .line 139
    .line 140
    invoke-virtual {v3, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    check-cast v3, Landroid/gov/nist/javax/sip/ListeningPointImpl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    .line 146
    if-eqz v3, :cond_4

    .line 147
    .line 148
    monitor-exit p0

    .line 149
    return-object v3

    .line 150
    :cond_4
    :try_start_1
    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-virtual {p0, v3, p2, p3}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->createMessageProcessor(Ljava/net/InetAddress;ILjava/lang/String;)Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 159
    .line 160
    invoke-interface {v4, v5}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_5

    .line 165
    .line 166
    sget-object v4, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 167
    .line 168
    new-instance v5, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v1, " port = "

    .line 177
    .line 178
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v1, " transport = "

    .line 185
    .line 186
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-interface {v4, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    goto :goto_2

    .line 200
    :catch_0
    move-exception v1

    .line 201
    goto :goto_3

    .line 202
    :cond_5
    :goto_2
    new-instance v1, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 203
    .line 204
    invoke-direct {v1, p0, p2, p3}, Landroid/gov/nist/javax/sip/ListeningPointImpl;-><init>(Landroid/javax/sip/SipStack;ILjava/lang/String;)V

    .line 205
    .line 206
    .line 207
    iput-object v3, v1, Landroid/gov/nist/javax/sip/ListeningPointImpl;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 208
    .line 209
    invoke-virtual {v3, v1}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->setListeningPoint(Landroid/gov/nist/javax/sip/ListeningPointImpl;)V

    .line 210
    .line 211
    .line 212
    iget-object v4, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->listeningPoints:Ljava/util/Hashtable;

    .line 213
    .line 214
    invoke-virtual {v4, v2, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/stack/MessageProcessor;->start()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 218
    .line 219
    .line 220
    monitor-exit p0

    .line 221
    return-object v1

    .line 222
    :goto_3
    :try_start_2
    sget-object v2, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 223
    .line 224
    invoke-interface {v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled()Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-eqz v2, :cond_6

    .line 229
    .line 230
    sget-object v2, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 231
    .line 232
    new-instance v3, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string p1, " port = "

    .line 241
    .line 242
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string p1, " transport = "

    .line 249
    .line 250
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-interface {v2, p1}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    :cond_6
    new-instance p1, Landroid/javax/sip/InvalidArgumentException;

    .line 264
    .line 265
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p2

    .line 269
    invoke-direct {p1, p2, v1}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    throw p1

    .line 273
    :cond_7
    new-instance p1, Landroid/javax/sip/InvalidArgumentException;

    .line 274
    .line 275
    const-string p2, "bad port"

    .line 276
    .line 277
    invoke-direct {p1, p2}, Landroid/javax/sip/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    throw p1

    .line 281
    :cond_8
    new-instance p1, Ljava/lang/NullPointerException;

    .line 282
    .line 283
    const-string p2, "null transport"

    .line 284
    .line 285
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw p1

    .line 289
    :cond_9
    new-instance p1, Ljava/lang/NullPointerException;

    .line 290
    .line 291
    const-string p2, "Address for listening point is null!"

    .line 292
    .line 293
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw p1

    .line 297
    :goto_4
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 298
    throw p1
.end method

.method public createSipProvider(Landroid/javax/sip/ListeningPoint;)Landroid/javax/sip/SipProvider;
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "createSipProvider: "

    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    check-cast p1, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 33
    .line 34
    iget-object v0, p1, Landroid/gov/nist/javax/sip/ListeningPointImpl;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    new-instance v0, Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/SipProviderImpl;-><init>(Landroid/gov/nist/javax/sip/SipStackImpl;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/SipProviderImpl;->setListeningPoint(Landroid/javax/sip/ListeningPoint;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p1, Landroid/gov/nist/javax/sip/ListeningPointImpl;->sipProvider:Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 47
    .line 48
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->sipProviders:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_1
    new-instance p0, Landroid/javax/sip/ObjectInUseException;

    .line 55
    .line 56
    const-string p1, "Provider already attached!"

    .line 57
    .line 58
    invoke-direct {p0, p1}, Landroid/javax/sip/ObjectInUseException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :cond_2
    const-string p0, "null listeningPoint"

    .line 63
    .line 64
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    return-object p0
.end method

.method public deleteListeningPoint(Landroid/javax/sip/ListeningPoint;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    check-cast p1, Landroid/gov/nist/javax/sip/ListeningPointImpl;

    .line 4
    .line 5
    iget-object v0, p1, Landroid/gov/nist/javax/sip/ListeningPointImpl;->messageProcessor:Landroid/gov/nist/javax/sip/stack/MessageProcessor;

    .line 6
    .line 7
    invoke-super {p0, v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->removeMessageProcessor(Landroid/gov/nist/javax/sip/stack/MessageProcessor;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/ListeningPointImpl;->getKey()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->listeningPoints:Ljava/util/Hashtable;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "null listeningPoint arg"

    .line 21
    .line 22
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public deleteSipProvider(Landroid/javax/sip/SipProvider;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    move-object v0, p1

    .line 4
    check-cast v0, Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->removeListeningPoints()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->stop()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->sipProviders:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->sipProviders:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->stopStack()V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :cond_1
    new-instance p0, Landroid/javax/sip/ObjectInUseException;

    .line 36
    .line 37
    const-string p1, "SipProvider still has an associated SipListener!"

    .line 38
    .line 39
    invoke-direct {p0, p1}, Landroid/javax/sip/ObjectInUseException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_2
    const-string p0, "null provider arg"

    .line 44
    .line 45
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->stopStack()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public getAuthenticationHelper(Landroid/gov/nist/javax/sip/clientauthutils/AccountManager;Landroid/javax/sip/header/HeaderFactory;)Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelper;
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/clientauthutils/AccountManager;Landroid/javax/sip/header/HeaderFactory;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getConfigurationProperties()Ljava/util/Properties;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->configurationProperties:Ljava/util/Properties;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEnabledCipherSuites()[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->cipherSuites:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEnabledProtocols()[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->enabledProtocols:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEventScanner()Landroid/gov/nist/javax/sip/EventScanner;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->eventScanner:Landroid/gov/nist/javax/sip/EventScanner;

    .line 2
    .line 3
    return-object p0
.end method

.method public getIPAddress()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getHostAddress()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getListeningPoints()Ljava/util/Iterator;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->listeningPoints:Ljava/util/Hashtable;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/Hashtable;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getLogRecordFactory()Landroid/gov/nist/javax/sip/LogRecordFactory;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->logRecordFactory:Landroid/gov/nist/javax/sip/LogRecordFactory;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLogger()La/yv00;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    sget-object p0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    instance-of v0, p0, Landroid/gov/nist/core/LogWriter;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Landroid/gov/nist/core/LogWriter;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/gov/nist/core/LogWriter;->getLogger()La/yv00;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public getSecureAuthenticationHelper(Landroid/gov/nist/javax/sip/clientauthutils/SecureAccountManager;Landroid/javax/sip/header/HeaderFactory;)Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelper;
    .locals 1

    .line 1
    new-instance v0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;-><init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/clientauthutils/SecureAccountManager;Landroid/javax/sip/header/HeaderFactory;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getSipListener()Landroid/javax/sip/SipListener;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->sipListener:Landroid/javax/sip/SipListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSipProviders()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Landroid/gov/nist/javax/sip/SipProviderImpl;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->sipProviders:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getStackName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->stackName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTlsSecurityPolicy()Landroid/gov/nist/javax/sip/TlsSecurityPolicy;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->tlsSecurityPolicy:Landroid/gov/nist/javax/sip/TlsSecurityPolicy;

    .line 2
    .line 3
    return-object p0
.end method

.method public isAutomaticDialogErrorHandlingEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAutomaticDialogErrorHandlingEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public isAutomaticDialogSupportEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isAutomaticDialogSupportEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public isBackToBackUserAgent()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isBackToBackUserAgent:Z

    .line 2
    .line 3
    return p0
.end method

.method public isReEntrantListener()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->reEntrantListener:Z

    .line 2
    .line 3
    return p0
.end method

.method public isRetransmissionFilterActive()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public releaseSem()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->stackSemaphore:Ljava/util/concurrent/Semaphore;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setEnabledCipherSuites([Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->cipherSuites:[Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setEnabledProtocols([Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->enabledProtocols:[Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setIsBackToBackUserAgent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->isBackToBackUserAgent:Z

    .line 2
    .line 3
    return-void
.end method

.method public setTlsSecurityPolicy(Landroid/gov/nist/javax/sip/TlsSecurityPolicy;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->tlsSecurityPolicy:Landroid/gov/nist/javax/sip/TlsSecurityPolicy;

    .line 2
    .line 3
    return-void
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->eventScanner:Landroid/gov/nist/javax/sip/EventScanner;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/gov/nist/javax/sip/EventScanner;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroid/gov/nist/javax/sip/EventScanner;-><init>(Landroid/gov/nist/javax/sip/SipStackImpl;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->eventScanner:Landroid/gov/nist/javax/sip/EventScanner;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public stop()V
    .locals 2

    .line 1
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 12
    .line 13
    const-string v1, "stopStack -- stoppping the stack"

    .line 14
    .line 15
    invoke-interface {v0, v1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Landroid/gov/nist/javax/sip/SipStackImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 19
    .line 20
    invoke-interface {v0}, Landroid/gov/nist/core/StackLogger;->logStackTrace()V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->stopStack()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageValves:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipMessageValves:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Landroid/gov/nist/javax/sip/stack/SIPMessageValve;

    .line 51
    .line 52
    invoke-interface {v1}, Landroid/gov/nist/javax/sip/stack/SIPMessageValve;->destroy()V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->sipEventInterceptor:Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-interface {v0}, Landroid/gov/nist/javax/sip/stack/SIPEventInterceptor;->destroy()V

    .line 61
    .line 62
    .line 63
    :cond_2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->sipProviders:Ljava/util/List;

    .line 69
    .line 70
    new-instance v0, Ljava/util/Hashtable;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->listeningPoints:Ljava/util/Hashtable;

    .line 76
    .line 77
    iget-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->eventScanner:Landroid/gov/nist/javax/sip/EventScanner;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/EventScanner;->forceStop()V

    .line 82
    .line 83
    .line 84
    :cond_3
    const/4 v0, 0x0

    .line 85
    iput-object v0, p0, Landroid/gov/nist/javax/sip/SipStackImpl;->eventScanner:Landroid/gov/nist/javax/sip/EventScanner;

    .line 86
    .line 87
    invoke-static {}, Landroid/gov/nist/javax/sip/parser/PostParseExecutorServices;->shutdownThreadpool()V

    .line 88
    .line 89
    .line 90
    return-void
.end method
