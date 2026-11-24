.class public Lokhttp3/OkHttpClient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Call$Factory;
.implements Lokhttp3/WebSocket$Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/OkHttpClient$Builder;,
        Lokhttp3/OkHttpClient$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lokhttp3/OkHttpClient;",
        "Lokhttp3/Call$Factory;",
        "Lokhttp3/WebSocket$Factory;",
        "Builder",
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
.field public static final F:Ljava/util/List;

.field public static final G:Ljava/util/List;


# instance fields
.field public final A:C

.field public final B:S

.field public final C:Lokhttp3/internal/connection/RouteDatabase;

.field public final D:Lokhttp3/internal/concurrent/TaskRunner;

.field public final E:Lokhttp3/ConnectionPool;

.field public final a:Lokhttp3/Dispatcher;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:La/itt0;

.field public final e:Z

.field public final f:Z

.field public final g:Lokhttp3/Authenticator;

.field public final h:Z

.field public final i:Z

.field public final j:Lokhttp3/CookieJar;

.field public final k:Lokhttp3/Dns$Companion$SYSTEM$1;

.field public final l:Ljava/net/Proxy;

.field public final m:Ljava/net/ProxySelector;

.field public final n:Lokhttp3/Authenticator;

.field public final o:Ljavax/net/SocketFactory;

.field public final p:Ljavax/net/ssl/SSLSocketFactory;

.field public final q:Ljavax/net/ssl/X509TrustManager;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Ljavax/net/ssl/HostnameVerifier;

.field public final u:Lokhttp3/CertificatePinner;

.field public final v:Lokhttp3/internal/tls/CertificateChainCleaner;

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lokhttp3/Protocol;->f:Lokhttp3/Protocol;

    .line 2
    .line 3
    sget-object v1, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lokhttp3/Protocol;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lokhttp3/internal/_UtilJvmKt;->k([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lokhttp3/OkHttpClient;->F:Ljava/util/List;

    .line 14
    .line 15
    sget-object v0, Lokhttp3/ConnectionSpec;->g:Lokhttp3/ConnectionSpec;

    .line 16
    .line 17
    sget-object v1, Lokhttp3/ConnectionSpec;->h:Lokhttp3/ConnectionSpec;

    .line 18
    .line 19
    filled-new-array {v0, v1}, [Lokhttp3/ConnectionSpec;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lokhttp3/internal/_UtilJvmKt;->k([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lokhttp3/OkHttpClient;->G:Ljava/util/List;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 465
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    invoke-direct {p0, v0}, Lokhttp3/OkHttpClient;-><init>(Lokhttp3/OkHttpClient$Builder;)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/OkHttpClient$Builder;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->a:Lokhttp3/Dispatcher;

    .line 5
    .line 6
    iput-object v0, p0, Lokhttp3/OkHttpClient;->a:Lokhttp3/Dispatcher;

    .line 7
    .line 8
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {v0}, Lokhttp3/internal/_UtilJvmKt;->j(Ljava/util/List;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lokhttp3/OkHttpClient;->b:Ljava/util/List;

    .line 15
    .line 16
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->d:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-static {v0}, Lokhttp3/internal/_UtilJvmKt;->j(Ljava/util/List;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lokhttp3/OkHttpClient;->c:Ljava/util/List;

    .line 23
    .line 24
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->e:La/itt0;

    .line 25
    .line 26
    iput-object v0, p0, Lokhttp3/OkHttpClient;->d:La/itt0;

    .line 27
    .line 28
    iget-boolean v0, p1, Lokhttp3/OkHttpClient$Builder;->f:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Lokhttp3/OkHttpClient;->e:Z

    .line 31
    .line 32
    iget-boolean v0, p1, Lokhttp3/OkHttpClient$Builder;->g:Z

    .line 33
    .line 34
    iput-boolean v0, p0, Lokhttp3/OkHttpClient;->f:Z

    .line 35
    .line 36
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->h:Lokhttp3/Authenticator;

    .line 37
    .line 38
    iput-object v0, p0, Lokhttp3/OkHttpClient;->g:Lokhttp3/Authenticator;

    .line 39
    .line 40
    iget-boolean v0, p1, Lokhttp3/OkHttpClient$Builder;->i:Z

    .line 41
    .line 42
    iput-boolean v0, p0, Lokhttp3/OkHttpClient;->h:Z

    .line 43
    .line 44
    iget-boolean v0, p1, Lokhttp3/OkHttpClient$Builder;->j:Z

    .line 45
    .line 46
    iput-boolean v0, p0, Lokhttp3/OkHttpClient;->i:Z

    .line 47
    .line 48
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->k:Lokhttp3/CookieJar;

    .line 49
    .line 50
    iput-object v0, p0, Lokhttp3/OkHttpClient;->j:Lokhttp3/CookieJar;

    .line 51
    .line 52
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->l:Lokhttp3/Dns$Companion$SYSTEM$1;

    .line 53
    .line 54
    iput-object v0, p0, Lokhttp3/OkHttpClient;->k:Lokhttp3/Dns$Companion$SYSTEM$1;

    .line 55
    .line 56
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->m:Ljava/net/Proxy;

    .line 57
    .line 58
    iput-object v0, p0, Lokhttp3/OkHttpClient;->l:Ljava/net/Proxy;

    .line 59
    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    sget-object v0, Lokhttp3/internal/proxy/NullProxySelector;->a:Lokhttp3/internal/proxy/NullProxySelector;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->n:Ljava/net/ProxySelector;

    .line 66
    .line 67
    if-nez v0, :cond_1

    .line 68
    .line 69
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    sget-object v0, Lokhttp3/internal/proxy/NullProxySelector;->a:Lokhttp3/internal/proxy/NullProxySelector;

    .line 76
    .line 77
    :cond_1
    :goto_0
    iput-object v0, p0, Lokhttp3/OkHttpClient;->m:Ljava/net/ProxySelector;

    .line 78
    .line 79
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->o:Lokhttp3/Authenticator;

    .line 80
    .line 81
    iput-object v0, p0, Lokhttp3/OkHttpClient;->n:Lokhttp3/Authenticator;

    .line 82
    .line 83
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->p:Ljavax/net/SocketFactory;

    .line 84
    .line 85
    iput-object v0, p0, Lokhttp3/OkHttpClient;->o:Ljavax/net/SocketFactory;

    .line 86
    .line 87
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->s:Ljava/util/List;

    .line 88
    .line 89
    iput-object v0, p0, Lokhttp3/OkHttpClient;->r:Ljava/util/List;

    .line 90
    .line 91
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->t:Ljava/util/List;

    .line 92
    .line 93
    iput-object v1, p0, Lokhttp3/OkHttpClient;->s:Ljava/util/List;

    .line 94
    .line 95
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 96
    .line 97
    iput-object v1, p0, Lokhttp3/OkHttpClient;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 98
    .line 99
    iget v1, p1, Lokhttp3/OkHttpClient$Builder;->x:I

    .line 100
    .line 101
    iput v1, p0, Lokhttp3/OkHttpClient;->w:I

    .line 102
    .line 103
    iget v1, p1, Lokhttp3/OkHttpClient$Builder;->y:I

    .line 104
    .line 105
    iput v1, p0, Lokhttp3/OkHttpClient;->x:I

    .line 106
    .line 107
    iget v1, p1, Lokhttp3/OkHttpClient$Builder;->z:I

    .line 108
    .line 109
    iput v1, p0, Lokhttp3/OkHttpClient;->y:I

    .line 110
    .line 111
    iget v1, p1, Lokhttp3/OkHttpClient$Builder;->A:I

    .line 112
    .line 113
    iput v1, p0, Lokhttp3/OkHttpClient;->z:I

    .line 114
    .line 115
    iget-char v1, p1, Lokhttp3/OkHttpClient$Builder;->B:C

    .line 116
    .line 117
    iput-char v1, p0, Lokhttp3/OkHttpClient;->A:C

    .line 118
    .line 119
    iget-short v1, p1, Lokhttp3/OkHttpClient$Builder;->C:S

    .line 120
    .line 121
    int-to-long v1, v1

    .line 122
    long-to-int v1, v1

    .line 123
    iput-short v1, p0, Lokhttp3/OkHttpClient;->B:S

    .line 124
    .line 125
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->D:Lokhttp3/internal/connection/RouteDatabase;

    .line 126
    .line 127
    if-nez v1, :cond_2

    .line 128
    .line 129
    new-instance v1, Lokhttp3/internal/connection/RouteDatabase;

    .line 130
    .line 131
    invoke-direct {v1}, Lokhttp3/internal/connection/RouteDatabase;-><init>()V

    .line 132
    .line 133
    .line 134
    :cond_2
    iput-object v1, p0, Lokhttp3/OkHttpClient;->C:Lokhttp3/internal/connection/RouteDatabase;

    .line 135
    .line 136
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->E:Lokhttp3/internal/concurrent/TaskRunner;

    .line 137
    .line 138
    if-nez v1, :cond_3

    .line 139
    .line 140
    sget-object v1, Lokhttp3/internal/concurrent/TaskRunner;->INSTANCE:Lokhttp3/internal/concurrent/TaskRunner;

    .line 141
    .line 142
    :cond_3
    iput-object v1, p0, Lokhttp3/OkHttpClient;->D:Lokhttp3/internal/concurrent/TaskRunner;

    .line 143
    .line 144
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->b:Lokhttp3/ConnectionPool;

    .line 145
    .line 146
    if-nez v1, :cond_4

    .line 147
    .line 148
    new-instance v1, Lokhttp3/ConnectionPool;

    .line 149
    .line 150
    invoke-direct {v1}, Lokhttp3/ConnectionPool;-><init>()V

    .line 151
    .line 152
    .line 153
    iput-object v1, p1, Lokhttp3/OkHttpClient$Builder;->b:Lokhttp3/ConnectionPool;

    .line 154
    .line 155
    :cond_4
    iput-object v1, p0, Lokhttp3/OkHttpClient;->E:Lokhttp3/ConnectionPool;

    .line 156
    .line 157
    const/4 v1, 0x0

    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_5

    .line 165
    .line 166
    goto/16 :goto_3

    .line 167
    .line 168
    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_a

    .line 177
    .line 178
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    check-cast v2, Lokhttp3/ConnectionSpec;

    .line 183
    .line 184
    iget-boolean v2, v2, Lokhttp3/ConnectionSpec;->a:Z

    .line 185
    .line 186
    if-eqz v2, :cond_6

    .line 187
    .line 188
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 189
    .line 190
    if-eqz v0, :cond_8

    .line 191
    .line 192
    iput-object v0, p0, Lokhttp3/OkHttpClient;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 193
    .line 194
    iget-object v2, p1, Lokhttp3/OkHttpClient$Builder;->w:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    iput-object v2, p0, Lokhttp3/OkHttpClient;->v:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 200
    .line 201
    iget-object v3, p1, Lokhttp3/OkHttpClient$Builder;->r:Ljavax/net/ssl/X509TrustManager;

    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    iput-object v3, p0, Lokhttp3/OkHttpClient;->q:Ljavax/net/ssl/X509TrustManager;

    .line 207
    .line 208
    iget-object p1, p1, Lokhttp3/OkHttpClient$Builder;->v:Lokhttp3/CertificatePinner;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    iget-object v4, p1, Lokhttp3/CertificatePinner;->b:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 214
    .line 215
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-eqz v4, :cond_7

    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_7
    new-instance v4, Lokhttp3/CertificatePinner;

    .line 223
    .line 224
    iget-object p1, p1, Lokhttp3/CertificatePinner;->a:Ljava/util/Set;

    .line 225
    .line 226
    invoke-direct {v4, p1, v2}, Lokhttp3/CertificatePinner;-><init>(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V

    .line 227
    .line 228
    .line 229
    move-object p1, v4

    .line 230
    :goto_1
    iput-object p1, p0, Lokhttp3/OkHttpClient;->u:Lokhttp3/CertificatePinner;

    .line 231
    .line 232
    goto :goto_4

    .line 233
    :cond_8
    sget-object v0, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 234
    .line 235
    sget-object v0, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-static {}, Lokhttp3/internal/platform/Platform;->n()Ljavax/net/ssl/X509TrustManager;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    iput-object v3, p0, Lokhttp3/OkHttpClient;->q:Ljavax/net/ssl/X509TrustManager;

    .line 245
    .line 246
    sget-object v0, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    :try_start_0
    invoke-virtual {v0}, Lokhttp3/internal/platform/Platform;->m()Ljavax/net/ssl/SSLContext;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    const/4 v2, 0x1

    .line 256
    new-array v2, v2, [Ljavax/net/ssl/TrustManager;

    .line 257
    .line 258
    const/4 v4, 0x0

    .line 259
    aput-object v3, v2, v4

    .line 260
    .line 261
    invoke-virtual {v0, v1, v2, v1}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 269
    .line 270
    .line 271
    iput-object v0, p0, Lokhttp3/OkHttpClient;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 272
    .line 273
    sget-object v2, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 274
    .line 275
    invoke-virtual {v2, v3}, Lokhttp3/internal/platform/Platform;->c(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    iput-object v2, p0, Lokhttp3/OkHttpClient;->v:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 280
    .line 281
    iget-object p1, p1, Lokhttp3/OkHttpClient$Builder;->v:Lokhttp3/CertificatePinner;

    .line 282
    .line 283
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    iget-object v4, p1, Lokhttp3/CertificatePinner;->b:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 287
    .line 288
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-eqz v4, :cond_9

    .line 293
    .line 294
    goto :goto_2

    .line 295
    :cond_9
    new-instance v4, Lokhttp3/CertificatePinner;

    .line 296
    .line 297
    iget-object p1, p1, Lokhttp3/CertificatePinner;->a:Ljava/util/Set;

    .line 298
    .line 299
    invoke-direct {v4, p1, v2}, Lokhttp3/CertificatePinner;-><init>(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V

    .line 300
    .line 301
    .line 302
    move-object p1, v4

    .line 303
    :goto_2
    iput-object p1, p0, Lokhttp3/OkHttpClient;->u:Lokhttp3/CertificatePinner;

    .line 304
    .line 305
    goto :goto_4

    .line 306
    :catch_0
    move-exception p0

    .line 307
    new-instance p1, Ljava/lang/AssertionError;

    .line 308
    .line 309
    new-instance v0, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    const-string v1, "No System TLS: "

    .line 312
    .line 313
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-direct {p1, v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    throw p1

    .line 327
    :cond_a
    :goto_3
    iput-object v1, p0, Lokhttp3/OkHttpClient;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 328
    .line 329
    iput-object v1, p0, Lokhttp3/OkHttpClient;->v:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 330
    .line 331
    iput-object v1, p0, Lokhttp3/OkHttpClient;->q:Ljavax/net/ssl/X509TrustManager;

    .line 332
    .line 333
    sget-object p1, Lokhttp3/CertificatePinner;->c:Lokhttp3/CertificatePinner;

    .line 334
    .line 335
    iput-object p1, p0, Lokhttp3/OkHttpClient;->u:Lokhttp3/CertificatePinner;

    .line 336
    .line 337
    move-object v0, v1

    .line 338
    move-object v2, v0

    .line 339
    move-object v3, v2

    .line 340
    :goto_4
    iget-object p1, p0, Lokhttp3/OkHttpClient;->c:Ljava/util/List;

    .line 341
    .line 342
    iget-object v4, p0, Lokhttp3/OkHttpClient;->b:Ljava/util/List;

    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-interface {v4, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    if-nez v5, :cond_16

    .line 352
    .line 353
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v4

    .line 360
    if-nez v4, :cond_15

    .line 361
    .line 362
    iget-object p1, p0, Lokhttp3/OkHttpClient;->r:Ljava/util/List;

    .line 363
    .line 364
    if-eqz p1, :cond_b

    .line 365
    .line 366
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 367
    .line 368
    .line 369
    move-result v4

    .line 370
    if-eqz v4, :cond_b

    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_b
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    :cond_c
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    if-eqz v4, :cond_10

    .line 382
    .line 383
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    check-cast v4, Lokhttp3/ConnectionSpec;

    .line 388
    .line 389
    iget-boolean v4, v4, Lokhttp3/ConnectionSpec;->a:Z

    .line 390
    .line 391
    if-eqz v4, :cond_c

    .line 392
    .line 393
    if-eqz v0, :cond_f

    .line 394
    .line 395
    if-eqz v2, :cond_e

    .line 396
    .line 397
    if-eqz v3, :cond_d

    .line 398
    .line 399
    goto :goto_6

    .line 400
    :cond_d
    const-string p0, "x509TrustManager == null"

    .line 401
    .line 402
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    throw v1

    .line 406
    :cond_e
    const-string p0, "certificateChainCleaner == null"

    .line 407
    .line 408
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    throw v1

    .line 412
    :cond_f
    const-string p0, "sslSocketFactory == null"

    .line 413
    .line 414
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    throw v1

    .line 418
    :cond_10
    :goto_5
    const-string p1, "Check failed."

    .line 419
    .line 420
    if-nez v0, :cond_14

    .line 421
    .line 422
    if-nez v2, :cond_13

    .line 423
    .line 424
    if-nez v3, :cond_12

    .line 425
    .line 426
    iget-object p0, p0, Lokhttp3/OkHttpClient;->u:Lokhttp3/CertificatePinner;

    .line 427
    .line 428
    sget-object v0, Lokhttp3/CertificatePinner;->c:Lokhttp3/CertificatePinner;

    .line 429
    .line 430
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result p0

    .line 434
    if-eqz p0, :cond_11

    .line 435
    .line 436
    :goto_6
    return-void

    .line 437
    :cond_11
    invoke-static {p1}, La/jf4;->n(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    throw v1

    .line 441
    :cond_12
    invoke-static {p1}, La/jf4;->n(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    throw v1

    .line 445
    :cond_13
    invoke-static {p1}, La/jf4;->n(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    throw v1

    .line 449
    :cond_14
    invoke-static {p1}, La/jf4;->n(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    throw v1

    .line 453
    :cond_15
    const-string p0, "Null network interceptor: "

    .line 454
    .line 455
    invoke-static {p1, p0}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    throw v1

    .line 459
    :cond_16
    const-string p0, "Null interceptor: "

    .line 460
    .line 461
    invoke-static {v4, p0}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    throw v1
.end method


# virtual methods
.method public final a(Lokhttp3/Request;)Lokhttp3/internal/connection/RealCall;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lokhttp3/internal/connection/RealCall;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, p1, v1}, Lokhttp3/internal/connection/RealCall;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final b()Lokhttp3/OkHttpClient$Builder;
    .locals 3

    .line 1
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lokhttp3/OkHttpClient;->a:Lokhttp3/Dispatcher;

    .line 7
    .line 8
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->a:Lokhttp3/Dispatcher;

    .line 9
    .line 10
    iget-object v1, p0, Lokhttp3/OkHttpClient;->E:Lokhttp3/ConnectionPool;

    .line 11
    .line 12
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->b:Lokhttp3/ConnectionPool;

    .line 13
    .line 14
    iget-object v1, v0, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v2, p0, Lokhttp3/OkHttpClient;->b:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Lokhttp3/OkHttpClient$Builder;->d:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object v2, p0, Lokhttp3/OkHttpClient;->c:Ljava/util/List;

    .line 24
    .line 25
    invoke-static {v1, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lokhttp3/OkHttpClient;->d:La/itt0;

    .line 29
    .line 30
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->e:La/itt0;

    .line 31
    .line 32
    iget-boolean v1, p0, Lokhttp3/OkHttpClient;->e:Z

    .line 33
    .line 34
    iput-boolean v1, v0, Lokhttp3/OkHttpClient$Builder;->f:Z

    .line 35
    .line 36
    iget-boolean v1, p0, Lokhttp3/OkHttpClient;->f:Z

    .line 37
    .line 38
    iput-boolean v1, v0, Lokhttp3/OkHttpClient$Builder;->g:Z

    .line 39
    .line 40
    iget-object v1, p0, Lokhttp3/OkHttpClient;->g:Lokhttp3/Authenticator;

    .line 41
    .line 42
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->h:Lokhttp3/Authenticator;

    .line 43
    .line 44
    iget-boolean v1, p0, Lokhttp3/OkHttpClient;->h:Z

    .line 45
    .line 46
    iput-boolean v1, v0, Lokhttp3/OkHttpClient$Builder;->i:Z

    .line 47
    .line 48
    iget-boolean v1, p0, Lokhttp3/OkHttpClient;->i:Z

    .line 49
    .line 50
    iput-boolean v1, v0, Lokhttp3/OkHttpClient$Builder;->j:Z

    .line 51
    .line 52
    iget-object v1, p0, Lokhttp3/OkHttpClient;->j:Lokhttp3/CookieJar;

    .line 53
    .line 54
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->k:Lokhttp3/CookieJar;

    .line 55
    .line 56
    iget-object v1, p0, Lokhttp3/OkHttpClient;->k:Lokhttp3/Dns$Companion$SYSTEM$1;

    .line 57
    .line 58
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->l:Lokhttp3/Dns$Companion$SYSTEM$1;

    .line 59
    .line 60
    iget-object v1, p0, Lokhttp3/OkHttpClient;->l:Ljava/net/Proxy;

    .line 61
    .line 62
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->m:Ljava/net/Proxy;

    .line 63
    .line 64
    iget-object v1, p0, Lokhttp3/OkHttpClient;->m:Ljava/net/ProxySelector;

    .line 65
    .line 66
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->n:Ljava/net/ProxySelector;

    .line 67
    .line 68
    iget-object v1, p0, Lokhttp3/OkHttpClient;->n:Lokhttp3/Authenticator;

    .line 69
    .line 70
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->o:Lokhttp3/Authenticator;

    .line 71
    .line 72
    iget-object v1, p0, Lokhttp3/OkHttpClient;->o:Ljavax/net/SocketFactory;

    .line 73
    .line 74
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->p:Ljavax/net/SocketFactory;

    .line 75
    .line 76
    iget-object v1, p0, Lokhttp3/OkHttpClient;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 77
    .line 78
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 79
    .line 80
    iget-object v1, p0, Lokhttp3/OkHttpClient;->q:Ljavax/net/ssl/X509TrustManager;

    .line 81
    .line 82
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->r:Ljavax/net/ssl/X509TrustManager;

    .line 83
    .line 84
    iget-object v1, p0, Lokhttp3/OkHttpClient;->r:Ljava/util/List;

    .line 85
    .line 86
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->s:Ljava/util/List;

    .line 87
    .line 88
    iget-object v1, p0, Lokhttp3/OkHttpClient;->s:Ljava/util/List;

    .line 89
    .line 90
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->t:Ljava/util/List;

    .line 91
    .line 92
    iget-object v1, p0, Lokhttp3/OkHttpClient;->t:Ljavax/net/ssl/HostnameVerifier;

    .line 93
    .line 94
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 95
    .line 96
    iget-object v1, p0, Lokhttp3/OkHttpClient;->u:Lokhttp3/CertificatePinner;

    .line 97
    .line 98
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->v:Lokhttp3/CertificatePinner;

    .line 99
    .line 100
    iget-object v1, p0, Lokhttp3/OkHttpClient;->v:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 101
    .line 102
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->w:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 103
    .line 104
    iget v1, p0, Lokhttp3/OkHttpClient;->w:I

    .line 105
    .line 106
    iput v1, v0, Lokhttp3/OkHttpClient$Builder;->x:I

    .line 107
    .line 108
    iget v1, p0, Lokhttp3/OkHttpClient;->x:I

    .line 109
    .line 110
    iput v1, v0, Lokhttp3/OkHttpClient$Builder;->y:I

    .line 111
    .line 112
    iget v1, p0, Lokhttp3/OkHttpClient;->y:I

    .line 113
    .line 114
    iput v1, v0, Lokhttp3/OkHttpClient$Builder;->z:I

    .line 115
    .line 116
    iget v1, p0, Lokhttp3/OkHttpClient;->z:I

    .line 117
    .line 118
    iput v1, v0, Lokhttp3/OkHttpClient$Builder;->A:I

    .line 119
    .line 120
    iget-char v1, p0, Lokhttp3/OkHttpClient;->A:C

    .line 121
    .line 122
    iput-char v1, v0, Lokhttp3/OkHttpClient$Builder;->B:C

    .line 123
    .line 124
    iget-short v1, p0, Lokhttp3/OkHttpClient;->B:S

    .line 125
    .line 126
    int-to-long v1, v1

    .line 127
    long-to-int v1, v1

    .line 128
    iput-short v1, v0, Lokhttp3/OkHttpClient$Builder;->C:S

    .line 129
    .line 130
    iget-object v1, p0, Lokhttp3/OkHttpClient;->C:Lokhttp3/internal/connection/RouteDatabase;

    .line 131
    .line 132
    iput-object v1, v0, Lokhttp3/OkHttpClient$Builder;->D:Lokhttp3/internal/connection/RouteDatabase;

    .line 133
    .line 134
    iget-object p0, p0, Lokhttp3/OkHttpClient;->D:Lokhttp3/internal/concurrent/TaskRunner;

    .line 135
    .line 136
    iput-object p0, v0, Lokhttp3/OkHttpClient$Builder;->E:Lokhttp3/internal/concurrent/TaskRunner;

    .line 137
    .line 138
    return-object v0
.end method

.method public final c(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/internal/ws/RealWebSocket;
    .locals 11

    .line 1
    new-instance v0, Lokhttp3/internal/ws/RealWebSocket;

    .line 2
    .line 3
    new-instance v4, Ljava/util/Random;

    .line 4
    .line 5
    invoke-direct {v4}, Ljava/util/Random;-><init>()V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lokhttp3/OkHttpClient;->z:I

    .line 9
    .line 10
    int-to-long v5, v1

    .line 11
    iget-short v1, p0, Lokhttp3/OkHttpClient;->B:S

    .line 12
    .line 13
    int-to-long v7, v1

    .line 14
    iget-char v1, p0, Lokhttp3/OkHttpClient;->A:C

    .line 15
    .line 16
    int-to-long v9, v1

    .line 17
    iget-object v1, p0, Lokhttp3/OkHttpClient;->D:Lokhttp3/internal/concurrent/TaskRunner;

    .line 18
    .line 19
    move-object v2, p1

    .line 20
    move-object v3, p2

    .line 21
    invoke-direct/range {v0 .. v10}, Lokhttp3/internal/ws/RealWebSocket;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JJJ)V

    .line 22
    .line 23
    .line 24
    iget-object p1, v2, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 25
    .line 26
    const-string p2, "Sec-WebSocket-Extensions"

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    new-instance p0, Ljava/net/ProtocolException;

    .line 36
    .line 37
    const-string p1, "Request header not permitted: \'Sec-WebSocket-Extensions\'"

    .line 38
    .line 39
    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x6

    .line 43
    invoke-static {v0, p0, v1, p1}, Lokhttp3/internal/ws/RealWebSocket;->j(Lokhttp3/internal/ws/RealWebSocket;Ljava/lang/Exception;Lokhttp3/Response;I)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_0
    invoke-virtual {p0}, Lokhttp3/OkHttpClient;->b()Lokhttp3/OkHttpClient$Builder;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    new-instance p1, La/itt0;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lokhttp3/OkHttpClient$Builder;->e:La/itt0;

    .line 57
    .line 58
    sget-object p1, Lokhttp3/internal/ws/RealWebSocket;->x:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v3, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    sget-object p1, Lokhttp3/Protocol;->g:Lokhttp3/Protocol;

    .line 69
    .line 70
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-nez v4, :cond_2

    .line 75
    .line 76
    sget-object v4, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 77
    .line 78
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    const-string p0, "protocols must contain h2_prior_knowledge or http/1.1: "

    .line 86
    .line 87
    invoke-static {v3, p0}, La/hny;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_2
    :goto_0
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    const/4 v4, 0x1

    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-gt p1, v4, :cond_3

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    const-string p0, "protocols containing h2_prior_knowledge cannot use other protocols: "

    .line 106
    .line 107
    invoke-static {v3, p0}, La/hny;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object v1

    .line 111
    :cond_4
    :goto_1
    sget-object p1, Lokhttp3/Protocol;->c:Lokhttp3/Protocol;

    .line 112
    .line 113
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-nez p1, :cond_7

    .line 118
    .line 119
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-nez p1, :cond_6

    .line 124
    .line 125
    sget-object p1, Lokhttp3/Protocol;->e:Lokhttp3/Protocol;

    .line 126
    .line 127
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, Lokhttp3/OkHttpClient$Builder;->t:Ljava/util/List;

    .line 131
    .line 132
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-nez p1, :cond_5

    .line 137
    .line 138
    iput-object v1, p0, Lokhttp3/OkHttpClient$Builder;->D:Lokhttp3/internal/connection/RouteDatabase;

    .line 139
    .line 140
    :cond_5
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iput-object p1, p0, Lokhttp3/OkHttpClient$Builder;->t:Ljava/util/List;

    .line 148
    .line 149
    new-instance p1, Lokhttp3/OkHttpClient;

    .line 150
    .line 151
    invoke-direct {p1, p0}, Lokhttp3/OkHttpClient;-><init>(Lokhttp3/OkHttpClient$Builder;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Lokhttp3/Request;->a()Lokhttp3/Request$Builder;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    const-string v1, "websocket"

    .line 159
    .line 160
    const-string v2, "Upgrade"

    .line 161
    .line 162
    invoke-virtual {p0, v2, v1}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    const-string v1, "Connection"

    .line 166
    .line 167
    invoke-virtual {p0, v1, v2}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const-string v1, "Sec-WebSocket-Key"

    .line 171
    .line 172
    iget-object v2, v0, Lokhttp3/internal/ws/RealWebSocket;->g:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {p0, v1, v2}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const-string v1, "Sec-WebSocket-Version"

    .line 178
    .line 179
    const-string v2, "13"

    .line 180
    .line 181
    invoke-virtual {p0, v1, v2}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    const-string v1, "permessage-deflate"

    .line 185
    .line 186
    invoke-virtual {p0, p2, v1}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    new-instance p2, Lokhttp3/Request;

    .line 190
    .line 191
    invoke-direct {p2, p0}, Lokhttp3/Request;-><init>(Lokhttp3/Request$Builder;)V

    .line 192
    .line 193
    .line 194
    new-instance p0, Lokhttp3/internal/connection/RealCall;

    .line 195
    .line 196
    invoke-direct {p0, p1, p2, v4}, Lokhttp3/internal/connection/RealCall;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V

    .line 197
    .line 198
    .line 199
    iput-object p0, v0, Lokhttp3/internal/ws/RealWebSocket;->h:Lokhttp3/internal/connection/RealCall;

    .line 200
    .line 201
    new-instance p1, Lokhttp3/internal/ws/RealWebSocket$connect$1;

    .line 202
    .line 203
    invoke-direct {p1, v0, p2}, Lokhttp3/internal/ws/RealWebSocket$connect$1;-><init>(Lokhttp3/internal/ws/RealWebSocket;Lokhttp3/Request;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, p1}, Lokhttp3/internal/connection/RealCall;->s0(Lokhttp3/Callback;)V

    .line 207
    .line 208
    .line 209
    return-object v0

    .line 210
    :cond_6
    const-string p0, "protocols must not contain null"

    .line 211
    .line 212
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    return-object v1

    .line 216
    :cond_7
    const-string p0, "protocols must not contain http/1.0: "

    .line 217
    .line 218
    invoke-static {v3, p0}, La/hny;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    return-object v1
.end method
