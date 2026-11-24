.class public final Lcom/appsflyer/internal/AFd1sSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static afErrorLog:I = 0x1

.field private static force:C = '\uf182'

.field private static i:I = -0xe015307

.field private static v:J = -0x5f2b2652cbc60e7eL

.field private static w:I


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/internal/AFj1mSDK;

.field private final AFLogger:Lcom/appsflyer/internal/AFd1xSDK;

.field private final d:Lcom/appsflyer/internal/AFj1cSDK;

.field private final e:Lcom/appsflyer/internal/AFf1fSDK;

.field private final registerClient:Lcom/appsflyer/internal/AFc1iSDK;

.field private final unregisterClient:Lcom/appsflyer/internal/AFd1jSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFd1xSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFd1jSDK;Lcom/appsflyer/internal/AFj1mSDK;Lcom/appsflyer/internal/AFj1cSDK;Lcom/appsflyer/internal/AFf1fSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/appsflyer/internal/AFd1sSDK;->AFLogger:Lcom/appsflyer/internal/AFd1xSDK;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/appsflyer/internal/AFd1sSDK;->registerClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/appsflyer/internal/AFd1sSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1jSDK;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/appsflyer/internal/AFd1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFj1mSDK;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/appsflyer/internal/AFd1sSDK;->d:Lcom/appsflyer/internal/AFj1cSDK;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/appsflyer/internal/AFd1sSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    .line 15
    .line 16
    return-void
.end method

.method private static synthetic AFKeystoreWrapper([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const/4 v0, 0x0

    aget-object v0, p0, v0

    check-cast v0, Lcom/appsflyer/internal/AFd1sSDK;

    const/4 v1, 0x1

    aget-object p0, p0, v1

    check-cast p0, Lcom/appsflyer/internal/AFa1oSDK;

    .line 272
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 273
    invoke-static {v1}, Lcom/appsflyer/internal/AFg1dSDK;->d(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    .line 274
    new-instance v2, Lcom/appsflyer/internal/AFd1oSDK;

    .line 275
    iget-object v3, p0, Lcom/appsflyer/internal/AFh1pSDK;->i:Ljava/lang/String;

    .line 276
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    .line 277
    sget-object v6, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 278
    iget-boolean v7, p0, Lcom/appsflyer/internal/AFh1pSDK;->unregisterClient:Z

    .line 279
    const-string v5, "POST"

    invoke-direct/range {v2 .. v7}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 280
    new-instance p0, Lcom/appsflyer/internal/AFa1jSDK;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFa1jSDK;-><init>()V

    filled-new-array {v0, v2, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, -0x4347daf3

    const v2, 0x4347daf3

    invoke-static {p0, v1, v2, v0}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    sget v0, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 v0, v0, 0xb

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private static varargs AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 266
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 p2, 0x1

    .line 267
    const-string v1, "v2"

    invoke-virtual {v0, p2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 p2, 0x0

    .line 268
    new-array v2, p2, [Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 269
    const-string v2, "\u2063"

    invoke-static {v2, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 270
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 271
    invoke-static {v0, p0}, Lcom/appsflyer/internal/AFj1nSDK;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget p1, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    add-int/lit8 p1, p1, 0x6d

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_0

    const/16 p1, 0x52

    div-int/2addr p1, p2

    :cond_0
    return-object p0
.end method

.method private AFLogger(Lcom/appsflyer/internal/AFd1oSDK;Lcom/appsflyer/internal/AFd1iSDK;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/appsflyer/internal/AFd1oSDK;",
            "Lcom/appsflyer/internal/AFd1iSDK<",
            "TT;>;)",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "TT;>;"
        }
    .end annotation

    .line 325
    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const p2, -0x4347daf3

    const v0, 0x4347daf3

    invoke-static {p1, p2, v0, p0}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    return-object p0
.end method

.method private AFLogger(Lcom/appsflyer/internal/AFh1pSDK;[B)V
    .locals 4

    .line 310
    sget v0, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    add-int/lit8 v0, v0, 0x5f

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    rem-int/lit8 v0, v0, 0x2

    .line 311
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1sSDK;->registerClient:Lcom/appsflyer/internal/AFc1iSDK;

    const/4 v2, 0x0

    .line 312
    const-string v3, "com.appsflyer.security.enable"

    if-eqz v0, :cond_3

    .line 313
    invoke-virtual {v1, v3}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 314
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 315
    sget v1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 v1, v1, 0x55

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 316
    :goto_0
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1pSDK;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 317
    sget v0, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    add-int/lit8 v0, v0, 0x6d

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 318
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1sSDK;->registerClient:Lcom/appsflyer/internal/AFc1iSDK;

    invoke-static {p1, p0}, Lcom/appsflyer/internal/AFf1fSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;Lcom/appsflyer/internal/AFc1iSDK;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 319
    invoke-static {p1, p2}, Lcom/appsflyer/internal/AFf1fSDK;->registerClient(Lcom/appsflyer/internal/AFh1pSDK;[B)V

    .line 320
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY_SDK:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string p2, "the module works properly"

    invoke-virtual {p0, p1, p2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return-void

    .line 321
    :cond_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1sSDK;->registerClient:Lcom/appsflyer/internal/AFc1iSDK;

    invoke-static {p1, p0}, Lcom/appsflyer/internal/AFf1fSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;Lcom/appsflyer/internal/AFc1iSDK;)Z

    .line 322
    throw v2

    :cond_2
    return-void

    .line 323
    :cond_3
    invoke-virtual {v1, v3}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    throw v2
.end method

.method private AFLogger()Z
    .locals 3

    .line 305
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1sSDK;->registerClient:Lcom/appsflyer/internal/AFc1iSDK;

    const-string v0, "AF_ENABLE_HTTP_CACHE"

    .line 306
    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    .line 307
    sget v1, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    add-int/2addr v1, v0

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    .line 308
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p0

    goto :goto_0

    :cond_0
    move p0, v0

    :goto_0
    const/4 v1, 0x0

    if-nez p0, :cond_2

    .line 309
    sget p0, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 p0, p0, 0xf

    rem-int/lit16 v2, p0, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_1

    return v1

    :cond_1
    return v0

    :cond_2
    return v1
.end method

.method private static a(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 16

    .line 1
    sget v0, Lcom/appsflyer/internal/AFd1sSDK;->$10:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x45

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFd1sSDK;->$11:I

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    rem-int/2addr v0, v1

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    if-eqz p4, :cond_0

    .line 14
    .line 15
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->toCharArray()[C

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget v2, Lcom/appsflyer/internal/AFd1sSDK;->$10:I

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x45

    .line 22
    .line 23
    rem-int/lit16 v2, v2, 0x80

    .line 24
    .line 25
    sput v2, Lcom/appsflyer/internal/AFd1sSDK;->$11:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object/from16 v0, p4

    .line 29
    .line 30
    :goto_0
    check-cast v0, [C

    .line 31
    .line 32
    if-eqz p3, :cond_1

    .line 33
    .line 34
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->toCharArray()[C

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object/from16 v2, p3

    .line 40
    .line 41
    :goto_1
    check-cast v2, [C

    .line 42
    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toCharArray()[C

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object/from16 v3, p0

    .line 51
    .line 52
    :goto_2
    check-cast v3, [C

    .line 53
    .line 54
    new-instance v4, Lcom/appsflyer/internal/AFk1pSDK;

    .line 55
    .line 56
    invoke-direct {v4}, Lcom/appsflyer/internal/AFk1pSDK;-><init>()V

    .line 57
    .line 58
    .line 59
    array-length v5, v3

    .line 60
    new-array v6, v5, [C

    .line 61
    .line 62
    array-length v7, v2

    .line 63
    new-array v8, v7, [C

    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    invoke-static {v3, v9, v6, v9, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2, v9, v8, v9, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 70
    .line 71
    .line 72
    aget-char v2, v6, v9

    .line 73
    .line 74
    xor-int v2, v2, p1

    .line 75
    .line 76
    int-to-char v2, v2

    .line 77
    aput-char v2, v6, v9

    .line 78
    .line 79
    aget-char v2, v8, v1

    .line 80
    .line 81
    move/from16 v3, p2

    .line 82
    .line 83
    int-to-char v3, v3

    .line 84
    add-int/2addr v2, v3

    .line 85
    int-to-char v2, v2

    .line 86
    aput-char v2, v8, v1

    .line 87
    .line 88
    array-length v1, v0

    .line 89
    new-array v2, v1, [C

    .line 90
    .line 91
    iput v9, v4, Lcom/appsflyer/internal/AFk1pSDK;->AFKeystoreWrapper:I

    .line 92
    .line 93
    sget v3, Lcom/appsflyer/internal/AFd1sSDK;->$10:I

    .line 94
    .line 95
    add-int/lit8 v3, v3, 0x67

    .line 96
    .line 97
    rem-int/lit16 v3, v3, 0x80

    .line 98
    .line 99
    sput v3, Lcom/appsflyer/internal/AFd1sSDK;->$11:I

    .line 100
    .line 101
    :goto_3
    iget v3, v4, Lcom/appsflyer/internal/AFk1pSDK;->AFKeystoreWrapper:I

    .line 102
    .line 103
    if-ge v3, v1, :cond_3

    .line 104
    .line 105
    sget v5, Lcom/appsflyer/internal/AFd1sSDK;->$11:I

    .line 106
    .line 107
    add-int/lit8 v5, v5, 0x71

    .line 108
    .line 109
    rem-int/lit16 v5, v5, 0x80

    .line 110
    .line 111
    sput v5, Lcom/appsflyer/internal/AFd1sSDK;->$10:I

    .line 112
    .line 113
    add-int/lit8 v5, v3, 0x2

    .line 114
    .line 115
    rem-int/lit8 v5, v5, 0x4

    .line 116
    .line 117
    add-int/lit8 v7, v3, 0x3

    .line 118
    .line 119
    rem-int/lit8 v7, v7, 0x4

    .line 120
    .line 121
    rem-int/lit8 v10, v3, 0x4

    .line 122
    .line 123
    aget-char v10, v6, v10

    .line 124
    .line 125
    mul-int/lit16 v10, v10, 0x7fce

    .line 126
    .line 127
    aget-char v5, v8, v5

    .line 128
    .line 129
    add-int/2addr v10, v5

    .line 130
    const v11, 0xffff

    .line 131
    .line 132
    .line 133
    rem-int/2addr v10, v11

    .line 134
    int-to-char v10, v10

    .line 135
    iput-char v10, v4, Lcom/appsflyer/internal/AFk1pSDK;->AFLogger:C

    .line 136
    .line 137
    aget-char v12, v6, v7

    .line 138
    .line 139
    mul-int/lit16 v12, v12, 0x7fce

    .line 140
    .line 141
    add-int/2addr v12, v5

    .line 142
    div-int/2addr v12, v11

    .line 143
    int-to-char v5, v12

    .line 144
    aput-char v5, v8, v7

    .line 145
    .line 146
    aput-char v10, v6, v7

    .line 147
    .line 148
    aget-char v5, v0, v3

    .line 149
    .line 150
    xor-int/2addr v5, v10

    .line 151
    int-to-long v10, v5

    .line 152
    sget-wide v12, Lcom/appsflyer/internal/AFd1sSDK;->v:J

    .line 153
    .line 154
    const-wide v14, -0x5f2b2652cbc60e7eL

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    xor-long/2addr v12, v14

    .line 160
    xor-long/2addr v10, v12

    .line 161
    sget v5, Lcom/appsflyer/internal/AFd1sSDK;->i:I

    .line 162
    .line 163
    int-to-long v12, v5

    .line 164
    xor-long/2addr v12, v14

    .line 165
    long-to-int v5, v12

    .line 166
    int-to-long v12, v5

    .line 167
    xor-long/2addr v10, v12

    .line 168
    sget-char v5, Lcom/appsflyer/internal/AFd1sSDK;->force:C

    .line 169
    .line 170
    int-to-long v12, v5

    .line 171
    xor-long/2addr v12, v14

    .line 172
    long-to-int v5, v12

    .line 173
    int-to-char v5, v5

    .line 174
    int-to-long v12, v5

    .line 175
    xor-long/2addr v10, v12

    .line 176
    long-to-int v5, v10

    .line 177
    int-to-char v5, v5

    .line 178
    aput-char v5, v2, v3

    .line 179
    .line 180
    add-int/lit8 v3, v3, 0x1

    .line 181
    .line 182
    iput v3, v4, Lcom/appsflyer/internal/AFk1pSDK;->AFKeystoreWrapper:I

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_3
    new-instance v0, Ljava/lang/String;

    .line 186
    .line 187
    invoke-direct {v0, v2}, Ljava/lang/String;-><init>([C)V

    .line 188
    .line 189
    .line 190
    aput-object v0, p5, v9

    .line 191
    .line 192
    return-void

    .line 193
    :cond_4
    const/4 v0, 0x0

    .line 194
    throw v0
.end method

.method private d(Lcom/appsflyer/internal/AFd1oSDK;Lcom/appsflyer/internal/AFd1iSDK;Z)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/appsflyer/internal/AFd1oSDK;",
            "Lcom/appsflyer/internal/AFd1iSDK<",
            "TT;>;Z)",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "TT;>;"
        }
    .end annotation

    .line 211
    iput-boolean p3, p1, Lcom/appsflyer/internal/AFd1oSDK;->force:Z

    .line 212
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1sSDK;->AFLogger:Lcom/appsflyer/internal/AFd1xSDK;

    .line 213
    new-instance p3, Lcom/appsflyer/internal/AFd1pSDK;

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1xSDK;->d:Ljava/util/concurrent/ExecutorService;

    iget-object p0, p0, Lcom/appsflyer/internal/AFd1xSDK;->AFLogger:Lcom/appsflyer/internal/AFd1mSDK;

    invoke-direct {p3, p1, v0, p0, p2}, Lcom/appsflyer/internal/AFd1pSDK;-><init>(Lcom/appsflyer/internal/AFd1oSDK;Ljava/util/concurrent/ExecutorService;Lcom/appsflyer/internal/AFd1mSDK;Lcom/appsflyer/internal/AFd1iSDK;)V

    .line 214
    sget p0, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    add-int/lit8 p0, p0, 0xb

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    return-object p3
.end method

.method public static synthetic d([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 3

    mul-int/lit16 v0, p1, 0x212

    add-int/lit16 v0, v0, 0x422

    mul-int/lit16 v1, p2, 0x212

    add-int/2addr v1, v0

    not-int v0, p3

    or-int/2addr v0, p1

    not-int v0, v0

    or-int v2, p1, p2

    not-int v2, v2

    or-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x211

    add-int/2addr v0, v1

    not-int p2, p2

    or-int/2addr p1, p3

    not-int p1, p1

    or-int/2addr p1, p2

    mul-int/lit16 p1, p1, 0x211

    add-int/2addr p1, v0

    const/4 p2, 0x1

    if-eq p1, p2, :cond_1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    .line 198
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1sSDK;->registerClient([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1sSDK;->unregisterClient([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1sSDK;->AFKeystoreWrapper([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic registerClient([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    const/4 v0, 0x0

    aget-object v1, p0, v0

    check-cast v1, Lcom/appsflyer/internal/AFd1sSDK;

    const/4 v2, 0x1

    aget-object v2, p0, v2

    check-cast v2, Lcom/appsflyer/internal/AFd1oSDK;

    const/4 v3, 0x2

    aget-object p0, p0, v3

    check-cast p0, Lcom/appsflyer/internal/AFd1iSDK;

    .line 170
    sget v4, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 v4, v4, 0x21

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 171
    invoke-direct {v1}, Lcom/appsflyer/internal/AFd1sSDK;->AFLogger()Z

    move-result v4

    .line 172
    invoke-direct {v1, v2, p0, v4}, Lcom/appsflyer/internal/AFd1sSDK;->d(Lcom/appsflyer/internal/AFd1oSDK;Lcom/appsflyer/internal/AFd1iSDK;Z)Lcom/appsflyer/internal/AFd1pSDK;

    move-result-object p0

    sget v1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 v1, v1, 0x31

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    rem-int/2addr v1, v3

    if-eqz v1, :cond_0

    const/16 v1, 0x10

    div-int/2addr v1, v0

    :cond_0
    return-object p0
.end method

.method private registerClient()Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 173
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 174
    const-string v1, "build_number"

    const-string v2, "7.0.1"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1sSDK;->registerClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 176
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v2, "appsFlyerCount"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v1

    .line 177
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "counter"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    const-string v1, "model"

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    const-string v1, ""

    invoke-static {v1}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v1

    const v2, 0xee66

    sub-int/2addr v2, v1

    int-to-char v5, v2

    const v1, 0x3f86c450

    invoke-static {v3, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    add-int v6, v2, v1

    const/4 v1, 0x1

    new-array v9, v1, [Ljava/lang/Object;

    const-string v4, "\u506b\u86c4\u663f\ucfee"

    const-string v7, "\u0000\u0000\u0000\u0000"

    const-string v8, "\ud9b1\u05c6\u44ba\uc1a7\udbec"

    invoke-static/range {v4 .. v9}, Lcom/appsflyer/internal/AFd1sSDK;->a(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    aget-object v1, v9, v3

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sdk"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1sSDK;->registerClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 182
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 183
    const-string v2, "app_version_name"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1sSDK;->registerClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 185
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 186
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 187
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 188
    const-string v2, "app_id"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1sSDK;->d:Lcom/appsflyer/internal/AFj1cSDK;

    invoke-interface {p0}, Lcom/appsflyer/internal/AFj1cSDK;->unregisterClient()Ljava/lang/String;

    move-result-object p0

    const-string v1, "platformextension"

    invoke-virtual {v0, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    sget p0, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    add-int/lit8 p0, p0, 0x11

    rem-int/lit16 v1, p0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    return-object v0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method private static synthetic unregisterClient([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    const/4 v0, 0x0

    aget-object v0, p0, v0

    check-cast v0, Lcom/appsflyer/internal/AFd1sSDK;

    const/4 v1, 0x1

    aget-object v1, p0, v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x2

    aget-object v3, p0, v2

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v4, 0x3

    aget-object v5, p0, v4

    check-cast v5, Ljava/lang/String;

    const/4 v6, 0x4

    aget-object p0, p0, v6

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 172
    iget-object p0, v0, Lcom/appsflyer/internal/AFd1sSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1jSDK;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v7, 0x0

    if-eqz v1, :cond_1

    .line 173
    sget v1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 v1, v1, 0x71

    rem-int/lit16 v8, v1, 0x80

    sput v8, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    rem-int/2addr v1, v2

    if-nez v1, :cond_0

    .line 174
    sget-object v1, Lcom/appsflyer/internal/AFd1jSDK;->unregisterClient:Ljava/lang/String;

    goto :goto_0

    .line 175
    :cond_0
    sget-object p0, Lcom/appsflyer/internal/AFd1jSDK;->AFa1tSDK:Lcom/appsflyer/internal/AFd1jSDK$AFa1tSDK;

    throw v7

    .line 176
    :cond_1
    sget-object v1, Lcom/appsflyer/internal/AFd1jSDK;->AFLogger:Ljava/lang/String;

    .line 177
    :goto_0
    const-string v8, ""

    if-eqz v3, :cond_3

    .line 178
    sget v3, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    add-int/lit8 v3, v3, 0xd

    rem-int/lit16 v9, v3, 0x80

    sput v9, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    rem-int/2addr v3, v2

    if-eqz v3, :cond_2

    const-string v2, "stg"

    goto :goto_1

    :cond_2
    throw v7

    :cond_3
    sget v2, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    add-int/lit8 v2, v2, 0x4d

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    move-object v2, v8

    .line 179
    :goto_1
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 180
    invoke-static {}, Lcom/appsflyer/internal/AFd1jSDK;->AFKeystoreWrapper()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 181
    sget v7, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/2addr v7, v4

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 182
    iget-object v4, p0, Lcom/appsflyer/internal/AFd1jSDK;->AFKeystoreWrapper:La/a8z;

    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ljava/lang/String;

    .line 183
    :cond_4
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFd1jSDK;->d()Ljava/lang/String;

    move-result-object p0

    .line 184
    filled-new-array {v8, v2, p0, v5}, [Ljava/lang/Object;

    move-result-object p0

    .line 185
    invoke-static {p0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {v3, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 186
    new-instance v1, Lcom/appsflyer/internal/AFd1oSDK;

    const-string v2, "GET"

    invoke-direct {v1, p0, v2}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p0, 0x5dc

    .line 187
    iput p0, v1, Lcom/appsflyer/internal/AFd1oSDK;->v:I

    .line 188
    new-instance p0, Lcom/appsflyer/internal/AFd1lSDK;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1lSDK;-><init>()V

    filled-new-array {v0, v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, -0x4347daf3

    const v2, 0x4347daf3

    invoke-static {p0, v1, v2, v0}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    return-object p0
.end method


# virtual methods
.method public final AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 258
    sget v0, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 v0, v0, 0x7

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    iget-object v0, p0, Lcom/appsflyer/internal/AFd1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFj1mSDK;

    .line 259
    invoke-virtual {v0, p1}, Lcom/appsflyer/internal/AFj1mSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFd1sSDK;->registerClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 260
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 261
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 262
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 263
    iget-object v2, p0, Lcom/appsflyer/internal/AFd1sSDK;->registerClient:Lcom/appsflyer/internal/AFc1iSDK;

    .line 264
    iget-object v2, v2, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-static {v2}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    move-result-object v2

    .line 265
    invoke-static {v0, v1, v2, p1, p2}, Lcom/appsflyer/internal/AFd1qSDK;->unregisterClient(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1qSDK;

    move-result-object p1

    sget-object p2, Lcom/appsflyer/internal/AFd1rSDK;->INSTANCE:Lcom/appsflyer/internal/AFd1rSDK;

    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const p2, -0x4347daf3

    const v0, 0x4347daf3

    invoke-static {p1, p2, v0, p0}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    sget p1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 p1, p1, 0x39

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public final AFKeystoreWrapper(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const v1, 0x5114278a

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget v2, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x41

    .line 13
    .line 14
    rem-int/lit16 v3, v2, 0x80

    .line 15
    .line 16
    sput v3, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    rem-int/2addr v2, v3

    .line 20
    const-class v4, Ljava/lang/String;

    .line 21
    .line 22
    const-class v5, Ljava/util/Map;

    .line 23
    .line 24
    const-string v6, "unregisterClient"

    .line 25
    .line 26
    const/4 v7, 0x1

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    :try_start_0
    new-array v0, v3, [Ljava/lang/Object;

    .line 32
    .line 33
    aput-object p2, v0, v7

    .line 34
    .line 35
    aput-object p1, v0, v9

    .line 36
    .line 37
    sget-object v2, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 38
    .line 39
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {v9, v9}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    int-to-char v3, v3

    .line 51
    const-wide/16 v10, 0x0

    .line 52
    .line 53
    invoke-static {v10, v11}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    add-int/lit16 v7, v7, 0xc6

    .line 58
    .line 59
    invoke-static {v9}, Landroid/telephony/cdma/CdmaCellLocation;->convertQuartSecToDecDegrees(I)D

    .line 60
    .line 61
    .line 62
    move-result-wide v10

    .line 63
    const-wide/16 v12, 0x0

    .line 64
    .line 65
    cmpl-double v10, v10, v12

    .line 66
    .line 67
    rsub-int/lit8 v10, v10, 0x23

    .line 68
    .line 69
    invoke-static {v3, v7, v10}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Ljava/lang/Class;

    .line 74
    .line 75
    filled-new-array {v5, v4}, [Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v3, v6, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :goto_0
    check-cast v3, Ljava/lang/reflect/Method;

    .line 87
    .line 88
    invoke-virtual {v3, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 93
    .line 94
    const/16 v1, 0x4c

    .line 95
    .line 96
    :try_start_1
    div-int/2addr v1, v9

    .line 97
    :goto_1
    move-object v3, v0

    .line 98
    goto :goto_3

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    move-object p0, v0

    .line 101
    move-object v3, p0

    .line 102
    goto/16 :goto_4

    .line 103
    .line 104
    :catchall_1
    move-exception v0

    .line 105
    move-object p0, v0

    .line 106
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-eqz v0, :cond_1

    .line 111
    .line 112
    throw v0

    .line 113
    :cond_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    :cond_2
    :try_start_2
    new-array v2, v3, [Ljava/lang/Object;

    .line 115
    .line 116
    aput-object p2, v2, v7

    .line 117
    .line 118
    aput-object p1, v2, v9

    .line 119
    .line 120
    sget-object v3, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 121
    .line 122
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    if-eqz v7, :cond_3

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_3
    const/16 v7, 0x30

    .line 130
    .line 131
    invoke-static {v0, v7}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    rsub-int/lit8 v7, v7, -0x1

    .line 136
    .line 137
    int-to-char v7, v7

    .line 138
    invoke-static {v0}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    rsub-int v0, v0, 0xc5

    .line 143
    .line 144
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    shr-int/lit8 v9, v9, 0x8

    .line 149
    .line 150
    rsub-int/lit8 v9, v9, 0x23

    .line 151
    .line 152
    invoke-static {v7, v0, v9}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Ljava/lang/Class;

    .line 157
    .line 158
    filled-new-array {v5, v4}, [Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v0, v6, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    invoke-interface {v3, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    :goto_2
    check-cast v7, Ljava/lang/reflect/Method;

    .line 170
    .line 171
    invoke-virtual {v7, v8, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :goto_3
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFj1mSDK;

    .line 179
    .line 180
    invoke-static {}, Lcom/appsflyer/internal/AFj1mSDK;->i()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFj1mSDK;->unregisterClient(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFj1mSDK;->d(Lcom/appsflyer/internal/AFj1mSDK;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    new-instance v1, Lcom/appsflyer/internal/AFd1oSDK;

    .line 193
    .line 194
    sget-object v5, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 195
    .line 196
    const/4 v6, 0x1

    .line 197
    const-string v4, "POST"

    .line 198
    .line 199
    invoke-direct/range {v1 .. v6}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 200
    .line 201
    .line 202
    new-instance v0, Lcom/appsflyer/internal/AFd1kSDK;

    .line 203
    .line 204
    invoke-direct {v0}, Lcom/appsflyer/internal/AFd1kSDK;-><init>()V

    .line 205
    .line 206
    .line 207
    filled-new-array {p0, v1, v0}, [Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 212
    .line 213
    .line 214
    move-result p0

    .line 215
    const v1, -0x4347daf3

    .line 216
    .line 217
    .line 218
    const v2, 0x4347daf3

    .line 219
    .line 220
    .line 221
    invoke-static {v0, v1, v2, p0}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    .line 226
    .line 227
    sget v0, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 228
    .line 229
    add-int/lit8 v0, v0, 0x47

    .line 230
    .line 231
    rem-int/lit16 v0, v0, 0x80

    .line 232
    .line 233
    sput v0, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    .line 234
    .line 235
    return-object p0

    .line 236
    :catchall_2
    move-exception v0

    .line 237
    move-object p0, v0

    .line 238
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    if-eqz v0, :cond_4

    .line 243
    .line 244
    throw v0

    .line 245
    :cond_4
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 246
    :goto_4
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 247
    .line 248
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PURCHASE_VALIDATION:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 249
    .line 250
    const/4 v4, 0x0

    .line 251
    const/4 v5, 0x0

    .line 252
    const-string v2, "AFFinalizer: reflection init failed."

    .line 253
    .line 254
    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 255
    .line 256
    .line 257
    return-object v8
.end method

.method public final AFLogger(Lcom/appsflyer/internal/AFh1pSDK;Ljava/lang/String;Lcom/appsflyer/internal/AFd1zSDK;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFh1pSDK;",
            "Ljava/lang/String;",
            "Lcom/appsflyer/internal/AFd1zSDK;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const v0, 0x6f330f1a

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget v1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x6b

    .line 11
    .line 12
    rem-int/lit16 v1, v1, 0x80

    .line 13
    .line 14
    sput v1, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    const/4 v2, 0x0

    .line 18
    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    aput-object p3, v1, v3

    .line 22
    .line 23
    const/4 p3, 0x1

    .line 24
    aput-object p2, v1, p3

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    aput-object p1, v1, p2

    .line 28
    .line 29
    sget-object v4, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    shr-int/lit8 v5, v5, 0x10

    .line 43
    .line 44
    int-to-char v5, v5

    .line 45
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    add-int/lit16 v6, v6, 0xc6

    .line 50
    .line 51
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    int-to-byte v7, v7

    .line 56
    add-int/lit8 v7, v7, 0x24

    .line 57
    .line 58
    invoke-static {v5, v6, v7}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Ljava/lang/Class;

    .line 63
    .line 64
    const-string v6, "registerClient"

    .line 65
    .line 66
    const-class v7, Lcom/appsflyer/internal/AFh1pSDK;

    .line 67
    .line 68
    const-class v8, Ljava/lang/String;

    .line 69
    .line 70
    const-class v9, Lcom/appsflyer/internal/AFd1zSDK;

    .line 71
    .line 72
    filled-new-array {v7, v8, v9}, [Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    :goto_0
    check-cast v5, Ljava/lang/reflect/Method;

    .line 84
    .line 85
    invoke-virtual {v5, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    move-object v6, v0

    .line 90
    check-cast v6, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 91
    .line 92
    :try_start_1
    invoke-direct {p0, p1, v6}, Lcom/appsflyer/internal/AFd1sSDK;->AFLogger(Lcom/appsflyer/internal/AFh1pSDK;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    .line 94
    .line 95
    sget v0, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 96
    .line 97
    add-int/lit8 v0, v0, 0x5f

    .line 98
    .line 99
    rem-int/lit16 v1, v0, 0x80

    .line 100
    .line 101
    sput v1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    .line 102
    .line 103
    rem-int/2addr v0, v3

    .line 104
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFj1mSDK;

    .line 105
    .line 106
    if-nez v0, :cond_1

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 112
    .line 113
    const/16 v2, 0x51

    .line 114
    .line 115
    div-int/2addr v2, p2

    .line 116
    if-nez v0, :cond_2

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 123
    .line 124
    if-nez v0, :cond_2

    .line 125
    .line 126
    :goto_1
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    .line 127
    .line 128
    if-nez v0, :cond_2

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_2
    move p3, p2

    .line 132
    :goto_2
    instance-of v0, p1, Lcom/appsflyer/internal/AFh1lSDK;

    .line 133
    .line 134
    instance-of v2, p1, Lcom/appsflyer/internal/AFh1kSDK;

    .line 135
    .line 136
    instance-of v4, p1, Lcom/appsflyer/internal/AFg1uSDK;

    .line 137
    .line 138
    instance-of v5, p1, Lcom/appsflyer/internal/AFh1hSDK;

    .line 139
    .line 140
    if-eqz v5, :cond_3

    .line 141
    .line 142
    sget p3, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 143
    .line 144
    add-int/lit8 p3, p3, 0x75

    .line 145
    .line 146
    rem-int/lit16 p3, p3, 0x80

    .line 147
    .line 148
    sput p3, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    .line 149
    .line 150
    invoke-static {}, Lcom/appsflyer/internal/AFj1mSDK;->afInfoLog()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    goto :goto_3

    .line 155
    :cond_3
    if-eqz v2, :cond_4

    .line 156
    .line 157
    invoke-static {}, Lcom/appsflyer/internal/AFj1mSDK;->registerClient()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    goto :goto_3

    .line 162
    :cond_4
    if-eqz v0, :cond_5

    .line 163
    .line 164
    invoke-static {}, Lcom/appsflyer/internal/AFj1mSDK;->AFLogger()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p3

    .line 168
    sget v2, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 169
    .line 170
    add-int/lit8 v2, v2, 0x71

    .line 171
    .line 172
    rem-int/lit16 v2, v2, 0x80

    .line 173
    .line 174
    sput v2, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_5
    if-eqz v4, :cond_6

    .line 178
    .line 179
    invoke-static {}, Lcom/appsflyer/internal/AFj1mSDK;->w()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    goto :goto_3

    .line 184
    :cond_6
    if-eqz p3, :cond_8

    .line 185
    .line 186
    iget p3, p1, Lcom/appsflyer/internal/AFh1pSDK;->afWarnLog:I

    .line 187
    .line 188
    if-ge p3, v3, :cond_7

    .line 189
    .line 190
    invoke-static {}, Lcom/appsflyer/internal/AFj1mSDK;->unregisterClient()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p3

    .line 194
    goto :goto_3

    .line 195
    :cond_7
    invoke-static {}, Lcom/appsflyer/internal/AFj1mSDK;->AFKeystoreWrapper()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p3

    .line 199
    goto :goto_3

    .line 200
    :cond_8
    invoke-static {}, Lcom/appsflyer/internal/AFj1mSDK;->d()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    :goto_3
    invoke-virtual {v1, p3}, Lcom/appsflyer/internal/AFj1mSDK;->unregisterClient(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p3

    .line 208
    invoke-static {p3, v0}, Lcom/appsflyer/internal/AFj1mSDK;->AFKeystoreWrapper(Ljava/lang/String;Z)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p3

    .line 212
    invoke-virtual {v1, p3, v4}, Lcom/appsflyer/internal/AFj1mSDK;->d(Ljava/lang/String;Z)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    new-instance v4, Lcom/appsflyer/internal/AFd1oSDK;

    .line 217
    .line 218
    iget-object v8, p1, Lcom/appsflyer/internal/AFh1pSDK;->registerClient:Ljava/util/Map;

    .line 219
    .line 220
    iget-boolean v9, p1, Lcom/appsflyer/internal/AFh1pSDK;->unregisterClient:Z

    .line 221
    .line 222
    const-string v7, "POST"

    .line 223
    .line 224
    invoke-direct/range {v4 .. v9}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 225
    .line 226
    .line 227
    new-instance p1, Lcom/appsflyer/internal/AFd1kSDK;

    .line 228
    .line 229
    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1kSDK;-><init>()V

    .line 230
    .line 231
    .line 232
    filled-new-array {p0, v4, p1}, [Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 237
    .line 238
    .line 239
    move-result p0

    .line 240
    const p3, -0x4347daf3

    .line 241
    .line 242
    .line 243
    const v0, 0x4347daf3

    .line 244
    .line 245
    .line 246
    invoke-static {p1, p3, v0, p0}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    .line 251
    .line 252
    sget p1, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 253
    .line 254
    add-int/lit8 p1, p1, 0xd

    .line 255
    .line 256
    rem-int/lit16 p3, p1, 0x80

    .line 257
    .line 258
    sput p3, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    .line 259
    .line 260
    rem-int/2addr p1, v3

    .line 261
    if-nez p1, :cond_9

    .line 262
    .line 263
    const/16 p1, 0x41

    .line 264
    .line 265
    div-int/2addr p1, p2

    .line 266
    :cond_9
    return-object p0

    .line 267
    :catchall_0
    move-exception v0

    .line 268
    move-object p0, v0

    .line 269
    move-object v6, p0

    .line 270
    goto :goto_4

    .line 271
    :catchall_1
    move-exception v0

    .line 272
    move-object p0, v0

    .line 273
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    if-eqz p1, :cond_a

    .line 278
    .line 279
    throw p1

    .line 280
    :cond_a
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 281
    :goto_4
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 282
    .line 283
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 284
    .line 285
    const/4 v7, 0x0

    .line 286
    const/4 v8, 0x0

    .line 287
    const-string v5, "AFFinalizer: reflection init failed."

    .line 288
    .line 289
    invoke-virtual/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 290
    .line 291
    .line 292
    return-object v2
.end method

.method public final AFLogger(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const v0, 0x5114278a

    .line 293
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 294
    sget v1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 v1, v1, 0x4d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    const/4 v2, 0x2

    rem-int/2addr v1, v2

    const-class v3, Ljava/lang/String;

    const-class v4, Ljava/util/Map;

    const-string v5, "unregisterClient"

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v1, :cond_2

    .line 295
    :try_start_0
    new-array p0, v2, [Ljava/lang/Object;

    aput-object p2, p0, v6

    aput-object p1, p0, v8

    sget-object p1, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    int-to-char p2, p2

    const/4 v1, 0x0

    invoke-static {v8, v1, v1}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v2

    cmpl-float v1, v2, v1

    add-int/lit16 v1, v1, 0xc6

    invoke-static {v8, v8}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x23

    invoke-static {p2, v1, v2}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Class;

    filled-new-array {v4, v3}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2, v5, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    check-cast p2, Ljava/lang/reflect/Method;

    invoke-virtual {p2, v7, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 296
    :try_start_1
    throw v7

    :catchall_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    goto/16 :goto_2

    :catchall_1
    move-exception v0

    move-object p0, v0

    .line 297
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_1

    throw p1

    :cond_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    :try_start_2
    new-array v1, v2, [Ljava/lang/Object;

    aput-object p2, v1, v6

    aput-object p1, v1, v8

    sget-object p1, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v8}, Landroid/graphics/Color;->green(I)I

    move-result p2

    int-to-char p2, p2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    const-wide/16 v11, 0x0

    cmp-long v2, v9, v11

    rsub-int v2, v2, 0xc7

    const-string v6, ""

    invoke-static {v6, v8, v8}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    move-result v6

    add-int/lit8 v6, v6, 0x23

    invoke-static {p2, v2, v6}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Class;

    filled-new-array {v4, v3}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p2, v5, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    check-cast p2, Ljava/lang/reflect/Method;

    invoke-virtual {p2, v7, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 298
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFj1mSDK;

    .line 299
    invoke-static {}, Lcom/appsflyer/internal/AFj1mSDK;->force()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/appsflyer/internal/AFj1mSDK;->unregisterClient(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 300
    new-instance v0, Lcom/appsflyer/internal/AFd1oSDK;

    .line 301
    sget-object v4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const/4 v5, 0x1

    const-string v3, "POST"

    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 302
    new-instance p1, Lcom/appsflyer/internal/AFd1kSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1kSDK;-><init>()V

    filled-new-array {p0, v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const p2, -0x4347daf3

    const v0, 0x4347daf3

    invoke-static {p1, p2, v0, p0}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    return-object p0

    :catchall_2
    move-exception v0

    move-object p0, v0

    .line 303
    :try_start_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_4

    throw p1

    :cond_4
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 304
    :goto_2
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PURCHASE_VALIDATION:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v2, "AFFinalizer: reflection init failed."

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-object v7
.end method

.method public final d(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 199
    new-instance v0, Lcom/appsflyer/internal/AFd1oSDK;

    .line 200
    sget-object v4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const/4 v5, 0x0

    const/4 v2, 0x0

    const-string v3, "GET"

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    const/16 p1, 0x2710

    .line 201
    iput p1, v0, Lcom/appsflyer/internal/AFd1oSDK;->v:I

    const/4 p1, 0x0

    .line 202
    iput-boolean p1, v0, Lcom/appsflyer/internal/AFd1oSDK;->w:Z

    .line 203
    new-instance p1, Lcom/appsflyer/internal/AFd1kSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1kSDK;-><init>()V

    filled-new-array {p0, v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, -0x4347daf3

    const v1, 0x4347daf3

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    sget p1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 p1, p1, 0x2d

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    return-object p0
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/UUID;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1sSDK;->registerClient()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "build_number"

    .line 10
    .line 11
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v7, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v3, "Af-UUID"

    .line 25
    .line 26
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v7, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    const-string v3, "Af-Meta-Sdk-Ver"

    .line 34
    .line 35
    invoke-virtual {v7, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    const-string v3, "counter"

    .line 39
    .line 40
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const-string v4, "Af-Meta-Counter"

    .line 49
    .line 50
    invoke-virtual {v7, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    const-string v3, "model"

    .line 54
    .line 55
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    const-string v4, "Af-Meta-Model"

    .line 64
    .line 65
    invoke-virtual {v7, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    const-string v3, "platformextension"

    .line 69
    .line 70
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const-string v4, "Af-Meta-Platform"

    .line 79
    .line 80
    invoke-virtual {v7, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    const-string v3, "sdk"

    .line 84
    .line 85
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    const-string v3, "Af-Meta-System-Version"

    .line 94
    .line 95
    invoke-virtual {v7, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    shr-int/lit8 v1, v1, 0x10

    .line 103
    .line 104
    int-to-char v9, v1

    .line 105
    const/4 v1, 0x0

    .line 106
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    const/4 v3, 0x1

    .line 111
    new-array v13, v3, [Ljava/lang/Object;

    .line 112
    .line 113
    const-string v8, "\uf90f\u02d3\u9dd0\u1703"

    .line 114
    .line 115
    const-string v11, "\u0000\u0000\u0000\u0000"

    .line 116
    .line 117
    const-string v12, "\u0a53\ua2b2\ua5d6\uc7a2\u0353\u43af\uc0cc\u9f76\u808b\u7474\u2a42\u2483"

    .line 118
    .line 119
    invoke-static/range {v8 .. v13}, Lcom/appsflyer/internal/AFd1sSDK;->a(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    aget-object v1, v13, v1

    .line 123
    .line 124
    check-cast v1, Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    const-string v6, "GET"

    .line 131
    .line 132
    move-object/from16 v3, p2

    .line 133
    .line 134
    filled-new-array {v6, v0, p1, v3, v2}, [Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    move-object/from16 v4, p4

    .line 139
    .line 140
    invoke-static {v4, v0, v2}, Lcom/appsflyer/internal/AFd1sSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v7, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    new-instance v3, Lcom/appsflyer/internal/AFd1oSDK;

    .line 148
    .line 149
    invoke-static/range {p1 .. p2}, Lcom/appsflyer/internal/AFj1mSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    const/4 v5, 0x0

    .line 154
    const/4 v8, 0x0

    .line 155
    invoke-direct/range {v3 .. v8}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 156
    .line 157
    .line 158
    new-instance p1, Lcom/appsflyer/internal/AFd1hSDK;

    .line 159
    .line 160
    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1hSDK;-><init>()V

    .line 161
    .line 162
    .line 163
    filled-new-array {p0, v3, p1}, [Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    const v0, -0x4347daf3

    .line 172
    .line 173
    .line 174
    const v1, 0x4347daf3

    .line 175
    .line 176
    .line 177
    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    .line 182
    .line 183
    sget p1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    .line 184
    .line 185
    add-int/lit8 p1, p1, 0x39

    .line 186
    .line 187
    rem-int/lit16 v0, p1, 0x80

    .line 188
    .line 189
    sput v0, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 190
    .line 191
    rem-int/lit8 p1, p1, 0x2

    .line 192
    .line 193
    if-nez p1, :cond_0

    .line 194
    .line 195
    return-object p0

    .line 196
    :cond_0
    const/4 p0, 0x0

    .line 197
    throw p0
.end method

.method public final d(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1vSDK;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1vSDK;"
        }
    .end annotation

    const v0, 0x5114278a

    .line 204
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 205
    sget v1, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    add-int/lit8 v1, v1, 0x1f

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 206
    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x1

    aput-object p2, v1, v3

    const/4 p2, 0x0

    aput-object p1, v1, p2

    sget-object p1, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    int-to-char v3, v3

    invoke-static {p2, p2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result p2

    add-int/lit16 p2, p2, 0xc6

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    rsub-int/lit8 v4, v4, 0x23

    invoke-static {v3, p2, v4}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Class;

    const-string v3, "unregisterClient"

    const-class v4, Ljava/util/Map;

    const-class v5, Ljava/lang/String;

    filled-new-array {v4, v5}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {p2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    check-cast v3, Ljava/lang/reflect/Method;

    invoke-virtual {v3, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez p1, :cond_1

    .line 207
    :try_start_1
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v5, "AFFinalizer: failed to create bytes."

    new-instance v6, Ljava/lang/IllegalArgumentException;

    const-string p0, "Failed to create bytes from proxyData, bytes are null"

    invoke-direct {v6, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 208
    sget p0, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 p0, p0, 0x3d

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    return-object v2

    :catchall_0
    move-exception v0

    move-object p0, v0

    move-object v6, p0

    goto :goto_1

    :cond_1
    new-instance p2, Lcom/appsflyer/internal/AFd1vSDK;

    iget-object p0, p0, Lcom/appsflyer/internal/AFd1sSDK;->registerClient:Lcom/appsflyer/internal/AFc1iSDK;

    invoke-direct {p2, p0, p1}, Lcom/appsflyer/internal/AFd1vSDK;-><init>(Lcom/appsflyer/internal/AFc1iSDK;[B)V

    return-object p2

    :catchall_1
    move-exception v0

    move-object p0, v0

    .line 209
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_2

    throw p1

    :cond_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 210
    :goto_1
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v5, "AFFinalizer: reflection init failed."

    invoke-virtual/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-object v2
.end method

.method public final registerClient(Lcom/appsflyer/internal/AFa1oSDK;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFa1oSDK;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Lcom/appsflyer/internal/AFa1gSDK;",
            ">;"
        }
    .end annotation

    .line 191
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, 0xde1efcf

    const v1, -0xde1efce

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    return-object p0
.end method

.method public final registerClient(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const v0, 0x5114278a

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget v1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x49

    .line 11
    .line 12
    rem-int/lit16 v1, v1, 0x80

    .line 13
    .line 14
    sput v1, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x0

    .line 18
    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    aput-object p2, v1, v3

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    aput-object p1, v1, p2

    .line 25
    .line 26
    sget-object p1, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    const/4 v5, 0x0

    .line 40
    cmpl-float v4, v4, v5

    .line 41
    .line 42
    sub-int/2addr v3, v4

    .line 43
    int-to-char v3, v3

    .line 44
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    shr-int/lit8 v4, v4, 0x8

    .line 49
    .line 50
    add-int/lit16 v4, v4, 0xc6

    .line 51
    .line 52
    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    rsub-int/lit8 p2, p2, 0x23

    .line 57
    .line 58
    invoke-static {v3, v4, p2}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    check-cast p2, Ljava/lang/Class;

    .line 63
    .line 64
    const-string v3, "unregisterClient"

    .line 65
    .line 66
    const-class v4, Ljava/util/Map;

    .line 67
    .line 68
    const-class v5, Ljava/lang/String;

    .line 69
    .line 70
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {p2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-interface {p1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :goto_0
    check-cast v4, Ljava/lang/reflect/Method;

    .line 82
    .line 83
    invoke-virtual {v4, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    move-object v5, p1

    .line 88
    check-cast v5, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    sget p1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    .line 91
    .line 92
    add-int/lit8 p1, p1, 0x4f

    .line 93
    .line 94
    rem-int/lit16 p1, p1, 0x80

    .line 95
    .line 96
    sput p1, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 97
    .line 98
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFj1mSDK;

    .line 99
    .line 100
    invoke-static {}, Lcom/appsflyer/internal/AFj1mSDK;->e()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-virtual {p1, p2}, Lcom/appsflyer/internal/AFj1mSDK;->unregisterClient(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    new-instance v3, Lcom/appsflyer/internal/AFd1oSDK;

    .line 109
    .line 110
    sget-object v7, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 111
    .line 112
    const/4 v8, 0x1

    .line 113
    const-string v6, "POST"

    .line 114
    .line 115
    invoke-direct/range {v3 .. v8}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 116
    .line 117
    .line 118
    new-instance p1, Lcom/appsflyer/internal/AFd1kSDK;

    .line 119
    .line 120
    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1kSDK;-><init>()V

    .line 121
    .line 122
    .line 123
    filled-new-array {p0, v3, p1}, [Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    const p2, -0x4347daf3

    .line 132
    .line 133
    .line 134
    const v0, 0x4347daf3

    .line 135
    .line 136
    .line 137
    invoke-static {p1, p2, v0, p0}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    .line 142
    .line 143
    return-object p0

    .line 144
    :catchall_0
    move-exception v0

    .line 145
    move-object p0, v0

    .line 146
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-eqz p1, :cond_1

    .line 151
    .line 152
    throw p1

    .line 153
    :catchall_1
    move-exception v0

    .line 154
    move-object p0, v0

    .line 155
    move-object v6, p0

    .line 156
    goto :goto_1

    .line 157
    :cond_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 158
    :goto_1
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 159
    .line 160
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->PURCHASE_VALIDATION:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 161
    .line 162
    const/4 v7, 0x0

    .line 163
    const/4 v8, 0x0

    .line 164
    const-string v5, "AFFinalizer: reflection init failed."

    .line 165
    .line 166
    invoke-virtual/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 167
    .line 168
    .line 169
    return-object v2
.end method

.method public final registerClient(ZZLjava/lang/String;I)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/lang/String;",
            "I)",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Lcom/appsflyer/internal/AFh1aSDK;",
            ">;"
        }
    .end annotation

    .line 192
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p0, p1, p2, p3, v0}, [Ljava/lang/Object;

    move-result-object p0

    const p1, 0x70f95d4b

    const p2, -0x70f95d49

    invoke-static {p0, p1, p2, p4}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    return-object p0
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFh1nSDK;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFh1nSDK;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 205
    iget-object v2, p1, Lcom/appsflyer/internal/AFh1pSDK;->force:[B

    .line 206
    new-instance v0, Lcom/appsflyer/internal/AFd1oSDK;

    .line 207
    iget-object v1, p1, Lcom/appsflyer/internal/AFh1pSDK;->i:Ljava/lang/String;

    .line 208
    iget-object v4, p1, Lcom/appsflyer/internal/AFh1pSDK;->registerClient:Ljava/util/Map;

    const/4 v5, 0x1

    .line 209
    const-string v3, "POST"

    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 210
    new-instance p1, Lcom/appsflyer/internal/AFd1kSDK;

    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1kSDK;-><init>()V

    filled-new-array {p0, v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, -0x4347daf3

    const v1, 0x4347daf3

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    sget p1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 p1, p1, 0x6f

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    const/16 p1, 0x43

    div-int/lit8 p1, p1, 0x0

    :cond_0
    return-object p0
.end method

.method public final unregisterClient(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/UUID;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p3

    .line 189
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 190
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 191
    const-string v3, "ttl"

    const-string v4, "-1"

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    const-string v3, "uuid"

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    const-string v3, "data"

    move-object/from16 v4, p2

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    const-string v3, "meta"

    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1sSDK;->registerClient()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 195
    sget v3, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 v3, v3, 0x5

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 196
    const-string v3, "brand_domain"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    sget v0, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    add-int/lit8 v0, v0, 0x57

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 198
    :cond_0
    invoke-static {v2}, Lcom/appsflyer/internal/AFg1dSDK;->d(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 199
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 200
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    add-int/lit8 v2, v2, -0x1

    int-to-char v8, v2

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v2

    shr-int/lit8 v9, v2, 0x10

    const/4 v13, 0x1

    new-array v12, v13, [Ljava/lang/Object;

    const-string v7, "\uf90f\u02d3\u9dd0\u1703"

    const-string v10, "\u0000\u0000\u0000\u0000"

    const-string v11, "\u0a53\ua2b2\ua5d6\uc7a2\u0353\u43af\uc0cc\u9f76\u808b\u7474\u2a42\u2483"

    invoke-static/range {v7 .. v12}, Lcom/appsflyer/internal/AFd1sSDK;->a(Ljava/lang/String;CILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v2, 0x0

    aget-object v2, v12, v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    const-string v3, "POST"

    filled-new-array {v3, v0}, [Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p5

    invoke-static {v4, v1, v3}, Lcom/appsflyer/internal/AFd1sSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    new-instance v2, Lcom/appsflyer/internal/AFd1oSDK;

    iget-object v1, p0, Lcom/appsflyer/internal/AFd1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFj1mSDK;

    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, p1}, Lcom/appsflyer/internal/AFj1mSDK;->registerClient(Lcom/appsflyer/internal/AFj1mSDK;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 203
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    const-string v5, "POST"

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 204
    new-instance v0, Lcom/appsflyer/internal/AFd1kSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFd1kSDK;-><init>()V

    invoke-direct {p0, v2, v0, v13}, Lcom/appsflyer/internal/AFd1sSDK;->d(Lcom/appsflyer/internal/AFd1oSDK;Lcom/appsflyer/internal/AFd1iSDK;Z)Lcom/appsflyer/internal/AFd1pSDK;

    move-result-object p0

    return-object p0
.end method

.method public final unregisterClient(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const v1, 0x5114278a

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget v2, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x3d

    .line 13
    .line 14
    rem-int/lit16 v2, v2, 0x80

    .line 15
    .line 16
    sput v2, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    const/4 v3, 0x0

    .line 20
    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    aput-object p2, v2, v4

    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    aput-object p1, v2, p2

    .line 27
    .line 28
    sget-object p1, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-eqz v4, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    int-to-char p2, p2

    .line 42
    invoke-static {v0}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    add-int/lit16 v4, v4, 0xc6

    .line 47
    .line 48
    const/16 v5, 0x30

    .line 49
    .line 50
    invoke-static {v0, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    rsub-int/lit8 v0, v0, 0x22

    .line 55
    .line 56
    invoke-static {p2, v4, v0}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Ljava/lang/Class;

    .line 61
    .line 62
    const-string v0, "unregisterClient"

    .line 63
    .line 64
    const-class v4, Ljava/util/Map;

    .line 65
    .line 66
    const-class v5, Ljava/lang/String;

    .line 67
    .line 68
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {p2, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-interface {p1, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    :goto_0
    check-cast v4, Ljava/lang/reflect/Method;

    .line 80
    .line 81
    invoke-virtual {v4, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    move-object v6, p1

    .line 86
    check-cast v6, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    sget p1, Lcom/appsflyer/internal/AFd1sSDK;->w:I

    .line 89
    .line 90
    add-int/lit8 p1, p1, 0x5d

    .line 91
    .line 92
    rem-int/lit16 p1, p1, 0x80

    .line 93
    .line 94
    sput p1, Lcom/appsflyer/internal/AFd1sSDK;->afErrorLog:I

    .line 95
    .line 96
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1sSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFj1mSDK;

    .line 97
    .line 98
    invoke-static {}, Lcom/appsflyer/internal/AFj1mSDK;->v()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-virtual {p1, p2}, Lcom/appsflyer/internal/AFj1mSDK;->unregisterClient(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-static {p1, p2}, Lcom/appsflyer/internal/AFj1mSDK;->d(Lcom/appsflyer/internal/AFj1mSDK;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    new-instance v4, Lcom/appsflyer/internal/AFd1oSDK;

    .line 111
    .line 112
    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 113
    .line 114
    const/4 v9, 0x1

    .line 115
    const-string v7, "POST"

    .line 116
    .line 117
    invoke-direct/range {v4 .. v9}, Lcom/appsflyer/internal/AFd1oSDK;-><init>(Ljava/lang/String;[BLjava/lang/String;Ljava/util/Map;Z)V

    .line 118
    .line 119
    .line 120
    new-instance p1, Lcom/appsflyer/internal/AFd1kSDK;

    .line 121
    .line 122
    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1kSDK;-><init>()V

    .line 123
    .line 124
    .line 125
    filled-new-array {p0, v4, p1}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    const p2, -0x4347daf3

    .line 134
    .line 135
    .line 136
    const v0, 0x4347daf3

    .line 137
    .line 138
    .line 139
    invoke-static {p1, p2, v0, p0}, Lcom/appsflyer/internal/AFd1sSDK;->d([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    check-cast p0, Lcom/appsflyer/internal/AFd1pSDK;

    .line 144
    .line 145
    return-object p0

    .line 146
    :catchall_0
    move-exception v0

    .line 147
    move-object p0, v0

    .line 148
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-eqz p1, :cond_1

    .line 153
    .line 154
    throw p1

    .line 155
    :catchall_1
    move-exception v0

    .line 156
    move-object p0, v0

    .line 157
    move-object v7, p0

    .line 158
    goto :goto_1

    .line 159
    :cond_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 160
    :goto_1
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 161
    .line 162
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->ENGAGEMENT:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 163
    .line 164
    const/4 v8, 0x0

    .line 165
    const/4 v9, 0x0

    .line 166
    const-string v6, "AFFinalizer: reflection init failed."

    .line 167
    .line 168
    invoke-virtual/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 169
    .line 170
    .line 171
    return-object v3
.end method
