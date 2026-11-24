.class public Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/core/net/SecurityManagerProvider;


# static fields
.field private static final logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private keyManagerFactory:Ljavax/net/ssl/KeyManagerFactory;

.field private trustManagerFactory:Ljavax/net/ssl/TrustManagerFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getKeyManagers(Z)[Ljavax/net/ssl/KeyManager;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;->keyManagerFactory:Ljavax/net/ssl/KeyManagerFactory;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljavax/net/ssl/KeyManagerFactory;->getKeyManagers()[Ljavax/net/ssl/KeyManager;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getTrustManagers(Z)[Ljavax/net/ssl/TrustManager;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;->trustManagerFactory:Ljavax/net/ssl/TrustManagerFactory;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public init(Ljava/util/Properties;)V
    .locals 11

    .line 1
    const-string v0, "javax.net.ssl.keyStore"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "javax.net.ssl.keyStorePassword"

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "javax.net.ssl.keyStoreType"

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sget-object v3, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;->logger:Landroid/gov/nist/core/StackLogger;

    .line 26
    .line 27
    new-instance v4, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v5, "Using default keystore type "

    .line 30
    .line 31
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-interface {v3, v4}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    const-string v3, "***"

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    :cond_1
    sget-object v5, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;->logger:Landroid/gov/nist/core/StackLogger;

    .line 52
    .line 53
    const-string v6, " javax.net.ssl.keyStore="

    .line 54
    .line 55
    const-string v7, " javax.net.ssl.keyStorePassword="

    .line 56
    .line 57
    const-string v8, "TLS server settings will be inactive - TLS key store will use JVM defaults keyStoreType="

    .line 58
    .line 59
    invoke-static {v8, v2, v6, v0, v7}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    if-nez v1, :cond_2

    .line 64
    .line 65
    move-object v7, v4

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move-object v7, v3

    .line 68
    :goto_0
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-interface {v5, v6}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_3
    const-string v5, "javax.net.ssl.trustStore"

    .line 79
    .line 80
    invoke-virtual {p1, v5}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    const-string v6, "javax.net.ssl.trustStorePassword"

    .line 85
    .line 86
    invoke-virtual {p1, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    if-nez v6, :cond_4

    .line 91
    .line 92
    sget-object v6, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;->logger:Landroid/gov/nist/core/StackLogger;

    .line 93
    .line 94
    const-string v7, "javax.net.ssl.trustStorePassword is null, using the password passed through javax.net.ssl.keyStorePassword"

    .line 95
    .line 96
    invoke-interface {v6, v7}, Landroid/gov/nist/core/StackLogger;->logInfo(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    move-object v6, v1

    .line 100
    :cond_4
    const-string v7, "javax.net.ssl.trustStoreType"

    .line 101
    .line 102
    invoke-virtual {p1, v7}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-nez p1, :cond_5

    .line 107
    .line 108
    invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    sget-object v7, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;->logger:Landroid/gov/nist/core/StackLogger;

    .line 113
    .line 114
    new-instance v8, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string v9, "Using default truststore type "

    .line 117
    .line 118
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    invoke-interface {v7, v8}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :cond_5
    if-eqz v5, :cond_6

    .line 132
    .line 133
    if-nez v6, :cond_8

    .line 134
    .line 135
    :cond_6
    sget-object v7, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;->logger:Landroid/gov/nist/core/StackLogger;

    .line 136
    .line 137
    const-string v8, " javax.net.ssl.trustStore="

    .line 138
    .line 139
    const-string v9, " javax.net.ssl.trustStorePassword="

    .line 140
    .line 141
    const-string v10, "TLS trust settings will be inactive - TLS trust store will use JVM defaults. trustStoreType="

    .line 142
    .line 143
    invoke-static {v10, p1, v8, v5, v9}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    if-nez v6, :cond_7

    .line 148
    .line 149
    move-object v3, v4

    .line 150
    :cond_7
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-interface {v7, v3}, Landroid/gov/nist/core/StackLogger;->logWarning(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :cond_8
    const-string v3, "ssl.KeyManagerFactory.algorithm"

    .line 161
    .line 162
    invoke-static {v3}, Ljava/security/Security;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    if-nez v3, :cond_9

    .line 167
    .line 168
    const-string v3, "SunX509"

    .line 169
    .line 170
    :cond_9
    sget-object v7, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;->logger:Landroid/gov/nist/core/StackLogger;

    .line 171
    .line 172
    const/16 v8, 0x20

    .line 173
    .line 174
    invoke-interface {v7, v8}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    if-eqz v9, :cond_a

    .line 179
    .line 180
    new-instance v9, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v10, "SecurityManagerProvider "

    .line 183
    .line 184
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    invoke-virtual {v10}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v10, " will use algorithm "

    .line 199
    .line 200
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    invoke-interface {v7, v9}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :cond_a
    invoke-static {v3}, Ljavax/net/ssl/KeyManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/KeyManagerFactory;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    iput-object v9, p0, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;->keyManagerFactory:Ljavax/net/ssl/KeyManagerFactory;

    .line 218
    .line 219
    if-eqz v0, :cond_b

    .line 220
    .line 221
    invoke-static {v2}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    new-instance v9, Ljava/io/FileInputStream;

    .line 226
    .line 227
    new-instance v10, Ljava/io/File;

    .line 228
    .line 229
    invoke-direct {v10, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-direct {v9, v10}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v2, v9, v0}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 240
    .line 241
    .line 242
    iget-object v0, p0, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;->keyManagerFactory:Ljavax/net/ssl/KeyManagerFactory;

    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v0, v2, v1}, Ljavax/net/ssl/KeyManagerFactory;->init(Ljava/security/KeyStore;[C)V

    .line 249
    .line 250
    .line 251
    goto :goto_1

    .line 252
    :cond_b
    invoke-virtual {v9, v4, v4}, Ljavax/net/ssl/KeyManagerFactory;->init(Ljava/security/KeyStore;[C)V

    .line 253
    .line 254
    .line 255
    :goto_1
    invoke-static {v3}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    iput-object v0, p0, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;->trustManagerFactory:Ljavax/net/ssl/TrustManagerFactory;

    .line 260
    .line 261
    if-eqz v5, :cond_c

    .line 262
    .line 263
    invoke-static {p1}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    new-instance v0, Ljava/io/FileInputStream;

    .line 268
    .line 269
    new-instance v1, Ljava/io/File;

    .line 270
    .line 271
    invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v6}, Ljava/lang/String;->toCharArray()[C

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-virtual {p1, v0, v1}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V

    .line 282
    .line 283
    .line 284
    iget-object v0, p0, Landroid/gov/nist/core/net/DefaultSecurityManagerProvider;->trustManagerFactory:Ljavax/net/ssl/TrustManagerFactory;

    .line 285
    .line 286
    invoke-virtual {v0, p1}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 287
    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_c
    invoke-virtual {v0, v4}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 291
    .line 292
    .line 293
    :goto_2
    invoke-interface {v7, v8}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    if-eqz p1, :cond_d

    .line 298
    .line 299
    new-instance p1, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    const-string v0, "TLS settings OK. SecurityManagerProvider "

    .line 302
    .line 303
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    const-string p0, " initialized."

    .line 318
    .line 319
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    invoke-interface {v7, p0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    :cond_d
    return-void
.end method
