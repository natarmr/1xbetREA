.class public final Lcom/appsflyer/internal/AFf1fSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static e:I = 0x1

.field private static force:I

.field private static v:[C


# instance fields
.field AFKeystoreWrapper:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final AFLogger:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

.field private d:J

.field private volatile i:Ljava/lang/String;

.field private final registerClient:Lcom/appsflyer/internal/AFd1zSDK;

.field private unregisterClient:Z

.field private volatile w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/appsflyer/internal/AFf1fSDK;->v:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        -0x7bds
        -0x7ecs
        -0x7e3s
        -0x7e5s
        -0x7f0s
        -0x7efs
        -0x7e6s
        -0x7e3s
        -0x7e8s
        -0x7e6s
        -0x7e1s
        -0x800s
    .end array-data
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->w:Z

    .line 8
    .line 9
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    .line 12
    .line 13
    return-void
.end method

.method private AFLogger(Lcom/appsflyer/internal/AFc1iSDK;)J
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1fSDK;->w()J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lcom/appsflyer/internal/AFj1nSDK;->unregisterClient(Ljava/lang/String;)[B

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lcom/appsflyer/internal/AFj1nSDK;->AFLogger([B)J

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x39

    .line 37
    .line 38
    rem-int/lit16 v0, v0, 0x80

    .line 39
    .line 40
    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    .line 41
    .line 42
    return-wide p0
.end method

.method private static synthetic AFLogger([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    aget-object p0, p0, v0

    check-cast p0, Lcom/appsflyer/internal/AFf1fSDK;

    .line 49
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/lit8 v0, v0, 0x11

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    iget-object p0, p0, Lcom/appsflyer/internal/AFf1fSDK;->i:Ljava/lang/String;

    if-nez v0, :cond_1

    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/lit8 v0, v0, 0x53

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    throw v1

    :cond_1
    throw v1
.end method

.method private static a([ILjava/lang/String;Z[Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    sget v1, Lcom/appsflyer/internal/AFf1fSDK;->$10:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x25

    .line 6
    .line 7
    rem-int/lit16 v3, v2, 0x80

    .line 8
    .line 9
    sput v3, Lcom/appsflyer/internal/AFf1fSDK;->$11:I

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    rem-int/2addr v2, v3

    .line 13
    if-eqz v2, :cond_c

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x33

    .line 18
    .line 19
    rem-int/lit16 v1, v1, 0x80

    .line 20
    .line 21
    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->$11:I

    .line 22
    .line 23
    const-string v1, "ISO-8859-1"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_0
    check-cast v0, [B

    .line 30
    .line 31
    new-instance v1, Lcom/appsflyer/internal/AFk1mSDK;

    .line 32
    .line 33
    invoke-direct {v1}, Lcom/appsflyer/internal/AFk1mSDK;-><init>()V

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    aget v4, p0, v2

    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    aget v6, p0, v5

    .line 41
    .line 42
    aget v7, p0, v3

    .line 43
    .line 44
    const/4 v8, 0x3

    .line 45
    aget v8, p0, v8

    .line 46
    .line 47
    sget-object v9, Lcom/appsflyer/internal/AFf1fSDK;->v:[C

    .line 48
    .line 49
    if-eqz v9, :cond_2

    .line 50
    .line 51
    array-length v10, v9

    .line 52
    new-array v11, v10, [C

    .line 53
    .line 54
    move v12, v2

    .line 55
    :goto_0
    if-ge v12, v10, :cond_1

    .line 56
    .line 57
    aget-char v13, v9, v12

    .line 58
    .line 59
    int-to-long v13, v13

    .line 60
    const-wide v15, -0x31235be88b2078dL    # -5.945620543029098E293

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    xor-long/2addr v13, v15

    .line 66
    long-to-int v13, v13

    .line 67
    int-to-char v13, v13

    .line 68
    aput-char v13, v11, v12

    .line 69
    .line 70
    add-int/lit8 v12, v12, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    move-object v9, v11

    .line 74
    :cond_2
    new-array v10, v6, [C

    .line 75
    .line 76
    invoke-static {v9, v4, v10, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 77
    .line 78
    .line 79
    if-eqz v0, :cond_6

    .line 80
    .line 81
    new-array v4, v6, [C

    .line 82
    .line 83
    iput v2, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    .line 84
    .line 85
    move v9, v2

    .line 86
    :goto_1
    iget v11, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    .line 87
    .line 88
    if-ge v11, v6, :cond_5

    .line 89
    .line 90
    aget-byte v12, v0, v11

    .line 91
    .line 92
    if-ne v12, v5, :cond_4

    .line 93
    .line 94
    sget v12, Lcom/appsflyer/internal/AFf1fSDK;->$11:I

    .line 95
    .line 96
    add-int/lit8 v12, v12, 0x51

    .line 97
    .line 98
    rem-int/lit16 v13, v12, 0x80

    .line 99
    .line 100
    sput v13, Lcom/appsflyer/internal/AFf1fSDK;->$10:I

    .line 101
    .line 102
    rem-int/2addr v12, v3

    .line 103
    if-eqz v12, :cond_3

    .line 104
    .line 105
    aget-char v12, v10, v11

    .line 106
    .line 107
    rem-int/2addr v12, v3

    .line 108
    sub-int/2addr v12, v9

    .line 109
    int-to-char v9, v12

    .line 110
    aput-char v9, v4, v11

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_3
    aget-char v12, v10, v11

    .line 114
    .line 115
    mul-int/2addr v12, v3

    .line 116
    add-int/2addr v12, v5

    .line 117
    sub-int/2addr v12, v9

    .line 118
    int-to-char v9, v12

    .line 119
    aput-char v9, v4, v11

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    aget-char v12, v10, v11

    .line 123
    .line 124
    mul-int/2addr v12, v3

    .line 125
    sub-int/2addr v12, v9

    .line 126
    int-to-char v9, v12

    .line 127
    aput-char v9, v4, v11

    .line 128
    .line 129
    :goto_2
    aget-char v9, v4, v11

    .line 130
    .line 131
    add-int/lit8 v11, v11, 0x1

    .line 132
    .line 133
    iput v11, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_5
    move-object v10, v4

    .line 137
    :cond_6
    if-lez v8, :cond_8

    .line 138
    .line 139
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->$10:I

    .line 140
    .line 141
    add-int/lit8 v0, v0, 0x9

    .line 142
    .line 143
    rem-int/lit16 v4, v0, 0x80

    .line 144
    .line 145
    sput v4, Lcom/appsflyer/internal/AFf1fSDK;->$11:I

    .line 146
    .line 147
    rem-int/2addr v0, v3

    .line 148
    if-nez v0, :cond_7

    .line 149
    .line 150
    new-array v0, v6, [C

    .line 151
    .line 152
    invoke-static {v10, v5, v0, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 153
    .line 154
    .line 155
    mul-int v4, v6, v8

    .line 156
    .line 157
    invoke-static {v0, v2, v10, v4, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 158
    .line 159
    .line 160
    ushr-int v4, v6, v8

    .line 161
    .line 162
    invoke-static {v0, v8, v10, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 163
    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_7
    new-array v0, v6, [C

    .line 167
    .line 168
    invoke-static {v10, v2, v0, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 169
    .line 170
    .line 171
    sub-int v4, v6, v8

    .line 172
    .line 173
    invoke-static {v0, v2, v10, v4, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 174
    .line 175
    .line 176
    invoke-static {v0, v8, v10, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 177
    .line 178
    .line 179
    :cond_8
    :goto_3
    if-eqz p2, :cond_a

    .line 180
    .line 181
    new-array v0, v6, [C

    .line 182
    .line 183
    iput v2, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    .line 184
    .line 185
    :goto_4
    iget v4, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    .line 186
    .line 187
    if-ge v4, v6, :cond_9

    .line 188
    .line 189
    sub-int v8, v6, v4

    .line 190
    .line 191
    sub-int/2addr v8, v5

    .line 192
    aget-char v8, v10, v8

    .line 193
    .line 194
    aput-char v8, v0, v4

    .line 195
    .line 196
    add-int/lit8 v4, v4, 0x1

    .line 197
    .line 198
    iput v4, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_9
    move-object v10, v0

    .line 202
    :cond_a
    if-lez v7, :cond_b

    .line 203
    .line 204
    iput v2, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    .line 205
    .line 206
    :goto_5
    iget v0, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    .line 207
    .line 208
    if-ge v0, v6, :cond_b

    .line 209
    .line 210
    aget-char v4, v10, v0

    .line 211
    .line 212
    aget v5, p0, v3

    .line 213
    .line 214
    sub-int/2addr v4, v5

    .line 215
    int-to-char v4, v4

    .line 216
    aput-char v4, v10, v0

    .line 217
    .line 218
    add-int/lit8 v0, v0, 0x1

    .line 219
    .line 220
    iput v0, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    .line 221
    .line 222
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->$10:I

    .line 223
    .line 224
    add-int/lit8 v0, v0, 0x67

    .line 225
    .line 226
    rem-int/lit16 v0, v0, 0x80

    .line 227
    .line 228
    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->$11:I

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_b
    new-instance v0, Ljava/lang/String;

    .line 232
    .line 233
    invoke-direct {v0, v10}, Ljava/lang/String;-><init>([C)V

    .line 234
    .line 235
    .line 236
    aput-object v0, p3, v2

    .line 237
    .line 238
    return-void

    .line 239
    :cond_c
    const/4 v0, 0x0

    .line 240
    throw v0
.end method

.method public static d(Lcom/appsflyer/internal/AFh1pSDK;Lcom/appsflyer/internal/AFc1iSDK;)Z
    .locals 7

    .line 1
    iget-object v0, p1, Lcom/appsflyer/internal/AFc1iSDK;->unregisterClient:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    sget v2, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    .line 7
    .line 8
    add-int/lit8 v2, v2, 0x63

    .line 9
    .line 10
    rem-int/lit16 v2, v2, 0x80

    .line 11
    .line 12
    sput v2, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p1, p1, Lcom/appsflyer/internal/AFc1iSDK;->unregisterClient:Ljava/lang/String;

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_1
    :goto_0
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x49

    .line 27
    .line 28
    rem-int/lit16 v0, v0, 0x80

    .line 29
    .line 30
    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    .line 31
    .line 32
    const-string v0, "com.appsflyer.security.uuid"

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const/16 v2, 0x8

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p1, Lcom/appsflyer/internal/AFc1iSDK;->unregisterClient:Ljava/lang/String;

    .line 54
    .line 55
    move-object p1, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 58
    :goto_2
    if-eqz p1, :cond_6

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_4
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 68
    .line 69
    const/16 v2, 0xc

    .line 70
    .line 71
    const/4 v3, 0x3

    .line 72
    filled-new-array {v1, v2, v1, v3}, [I

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const-string v3, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001"

    .line 77
    .line 78
    const/4 v4, 0x1

    .line 79
    new-array v5, v4, [Ljava/lang/Object;

    .line 80
    .line 81
    invoke-static {v2, v3, v1, v5}, Lcom/appsflyer/internal/AFf1fSDK;->a([ILjava/lang/String;Z[Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    aget-object v2, v5, v1

    .line 85
    .line 86
    check-cast v2, Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 101
    .line 102
    .line 103
    move-result-wide v2

    .line 104
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const-wide/16 v5, 0x5e

    .line 109
    .line 110
    rem-long/2addr v2, v5

    .line 111
    long-to-int v0, v2

    .line 112
    add-int/lit8 v0, v0, 0x21

    .line 113
    .line 114
    move v2, v1

    .line 115
    :goto_3
    array-length v3, p1

    .line 116
    if-ge v2, v3, :cond_5

    .line 117
    .line 118
    aget-char v3, p1, v2

    .line 119
    .line 120
    xor-int/2addr v3, v0

    .line 121
    int-to-char v3, v3

    .line 122
    aput-char v3, p1, v2

    .line 123
    .line 124
    add-int/lit8 v2, v2, 0x1

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :catch_0
    move-exception p0

    .line 128
    goto :goto_4

    .line 129
    :cond_5
    new-instance v0, Ljava/lang/String;

    .line 130
    .line 131
    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([C)V

    .line 132
    .line 133
    .line 134
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {v0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    const/4 v0, 0x2

    .line 143
    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    const-string v0, "af-sdk-sbid"

    .line 148
    .line 149
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1pSDK;->registerClient:Ljava/util/Map;

    .line 150
    .line 151
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    .line 153
    .line 154
    return v4

    .line 155
    :goto_4
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 156
    .line 157
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 158
    .line 159
    const-string v2, "Exception occurred while generating sbid "

    .line 160
    .line 161
    invoke-virtual {p1, v0, v2, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    return v1

    .line 165
    :cond_6
    :goto_5
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 166
    .line 167
    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY_SDK:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 168
    .line 169
    const-string v0, "the module is not detected"

    .line 170
    .line 171
    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return v1
.end method

.method private static e()Lcom/appsflyer/internal/AFf1cSDK;
    .locals 3

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFf1cSDK;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/appsflyer/internal/AFf1cSDK;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    .line 7
    .line 8
    add-int/lit8 v1, v1, 0x7b

    .line 9
    .line 10
    rem-int/lit16 v2, v1, 0x80

    .line 11
    .line 12
    sput v2, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    .line 13
    .line 14
    rem-int/lit8 v1, v1, 0x2

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    throw v0
.end method

.method private static synthetic registerClient([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    const v0, 0x5e17b8b9

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    aget-object v2, p0, v1

    .line 10
    .line 11
    check-cast v2, Lcom/appsflyer/internal/AFf1fSDK;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    aget-object p0, p0, v3

    .line 15
    .line 16
    check-cast p0, Ljava/util/Map;

    .line 17
    .line 18
    :try_start_0
    iget-object v2, v2, Lcom/appsflyer/internal/AFf1fSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 19
    .line 20
    iget-object v2, v2, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    :try_start_1
    new-array v5, v4, [Ljava/lang/Object;

    .line 24
    .line 25
    aput-object v2, v5, v3

    .line 26
    .line 27
    aput-object p0, v5, v1

    .line 28
    .line 29
    sget-object p0, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    shr-int/lit8 v1, v1, 0x10

    .line 43
    .line 44
    const v2, 0xf99f

    .line 45
    .line 46
    .line 47
    add-int/2addr v1, v2

    .line 48
    int-to-char v1, v1

    .line 49
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    shr-int/lit8 v2, v2, 0x10

    .line 54
    .line 55
    rsub-int/lit8 v2, v2, 0x7c

    .line 56
    .line 57
    const-string v3, ""

    .line 58
    .line 59
    invoke-static {v3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    rsub-int/lit8 v3, v3, 0x25

    .line 64
    .line 65
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Ljava/lang/Class;

    .line 70
    .line 71
    const-class v2, Ljava/util/Map;

    .line 72
    .line 73
    const-class v3, Landroid/content/Context;

    .line 74
    .line 75
    filled-new-array {v2, v3}, [Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    :goto_0
    check-cast v1, Ljava/lang/reflect/Constructor;

    .line 87
    .line 88
    invoke-virtual {v1, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    .line 93
    .line 94
    add-int/lit8 v0, v0, 0x3f

    .line 95
    .line 96
    rem-int/lit16 v1, v0, 0x80

    .line 97
    .line 98
    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    .line 99
    .line 100
    rem-int/2addr v0, v4

    .line 101
    if-nez v0, :cond_1

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_1
    const/4 p0, 0x0

    .line 105
    throw p0

    .line 106
    :catchall_0
    move-exception v0

    .line 107
    move-object p0, v0

    .line 108
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-eqz v0, :cond_2

    .line 113
    .line 114
    throw v0

    .line 115
    :cond_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 116
    :catchall_1
    move-exception v0

    .line 117
    move-object p0, v0

    .line 118
    move-object v3, p0

    .line 119
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 120
    .line 121
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->ANTI_FRAUD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 122
    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v5, 0x0

    .line 125
    const-string v2, "AFCksmV3: reflection init failed"

    .line 126
    .line 127
    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 128
    .line 129
    .line 130
    new-instance p0, Ljava/util/HashMap;

    .line 131
    .line 132
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 133
    .line 134
    .line 135
    return-object p0
.end method

.method public static registerClient(Lcom/appsflyer/internal/AFh1pSDK;[B)V
    .locals 6

    .line 136
    :try_start_0
    new-instance v0, Lcom/appsflyer/internal/AFb1sSDK;

    invoke-direct {v0, p0, p1}, Lcom/appsflyer/internal/AFb1sSDK;-><init>(Lcom/appsflyer/internal/AFh1pSDK;[B)V

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFb1sSDK;->afInfoLog()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 137
    sget p0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/lit8 p0, p0, 0x55

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 138
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v2, "native: reflection init failed"

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 139
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY_SDK:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "the module detected but malfunctioning"

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-void
.end method

.method public static synthetic unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 5

    .line 1
    mul-int/lit16 v0, p1, -0x233

    .line 2
    .line 3
    mul-int/lit16 v1, p2, 0x235

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    not-int v0, p1

    .line 7
    not-int v2, p2

    .line 8
    not-int v3, p3

    .line 9
    or-int/2addr v2, v3

    .line 10
    not-int v2, v2

    .line 11
    or-int/2addr v2, v0

    .line 12
    or-int v4, p2, p3

    .line 13
    .line 14
    not-int v4, v4

    .line 15
    or-int/2addr v2, v4

    .line 16
    mul-int/lit16 v2, v2, -0x234

    .line 17
    .line 18
    add-int/2addr v2, v1

    .line 19
    or-int v1, v0, p2

    .line 20
    .line 21
    or-int/2addr p3, v1

    .line 22
    not-int p3, p3

    .line 23
    mul-int/lit16 p3, p3, 0x468

    .line 24
    .line 25
    add-int/2addr p3, v2

    .line 26
    or-int/2addr v0, v3

    .line 27
    not-int v0, v0

    .line 28
    or-int/2addr p1, p2

    .line 29
    not-int p1, p1

    .line 30
    or-int/2addr p1, v0

    .line 31
    mul-int/lit16 p1, p1, 0x234

    .line 32
    .line 33
    add-int/2addr p1, p3

    .line 34
    const/4 p2, 0x1

    .line 35
    if-eq p1, p2, :cond_1

    .line 36
    .line 37
    const/4 p2, 0x2

    .line 38
    if-eq p1, p2, :cond_0

    .line 39
    .line 40
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1fSDK;->registerClient([Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_0
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger([Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_1
    const/4 p1, 0x0

    .line 51
    aget-object p1, p0, p1

    .line 52
    .line 53
    check-cast p1, Lcom/appsflyer/internal/AFf1fSDK;

    .line 54
    .line 55
    aget-object p0, p0, p2

    .line 56
    .line 57
    check-cast p0, Ljava/util/Map;

    .line 58
    .line 59
    new-instance p2, Lcom/appsflyer/internal/AFc1hSDK;

    .line 60
    .line 61
    iget-object p1, p1, Lcom/appsflyer/internal/AFf1fSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 62
    .line 63
    iget-object p1, p1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 64
    .line 65
    invoke-direct {p2, p0, p1}, Lcom/appsflyer/internal/AFc1hSDK;-><init>(Ljava/util/Map;Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    sget p0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    .line 69
    .line 70
    add-int/lit8 p0, p0, 0x49

    .line 71
    .line 72
    rem-int/lit16 p0, p0, 0x80

    .line 73
    .line 74
    sput p0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    .line 75
    .line 76
    return-object p2
.end method

.method private v()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget p0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    .line 12
    .line 13
    add-int/lit8 p0, p0, 0x35

    .line 14
    .line 15
    rem-int/lit16 p0, p0, 0x80

    .line 16
    .line 17
    sput p0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    sget p0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    .line 22
    .line 23
    add-int/lit8 p0, p0, 0x55

    .line 24
    .line 25
    rem-int/lit16 v0, p0, 0x80

    .line 26
    .line 27
    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    .line 28
    .line 29
    rem-int/lit8 p0, p0, 0x2

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    throw p0
.end method

.method private w()J
    .locals 4

    .line 1
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x6f

    .line 4
    .line 5
    rem-int/lit16 v2, v1, 0x80

    .line 6
    .line 7
    sput v2, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    .line 8
    .line 9
    rem-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    iget-wide v2, p0, Lcom/appsflyer/internal/AFf1fSDK;->d:J

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    div-int/2addr p0, p0

    .line 17
    :cond_0
    add-int/lit8 v0, v0, 0x4b

    .line 18
    .line 19
    rem-int/lit16 v0, v0, 0x80

    .line 20
    .line 21
    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    .line 22
    .line 23
    return-wide v2
.end method


# virtual methods
.method public final AFKeystoreWrapper()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1fSDK;->v()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const-string v2, "lvl"

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sget v1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x39

    .line 17
    .line 18
    rem-int/lit16 v1, v1, 0x80

    .line 19
    .line 20
    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    .line 21
    .line 22
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 23
    .line 24
    invoke-virtual {v0, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    sget p0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    .line 28
    .line 29
    add-int/lit8 p0, p0, 0x65

    .line 30
    .line 31
    rem-int/lit16 p0, p0, 0x80

    .line 32
    .line 33
    sput p0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    iget-boolean v1, p0, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient:Z

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    new-instance v1, Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v1, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1fSDK;->registerClient()V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 51
    .line 52
    const-string v3, "error"

    .line 53
    .line 54
    const-string v4, "pending LVL response"

    .line 55
    .line 56
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 60
    .line 61
    invoke-virtual {v0, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_1
    return-object v0
.end method

.method public final AFKeystoreWrapper(Ljava/util/Map;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 65
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, 0x17315fa3

    const v1, -0x17315fa3

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    return-object p0
.end method

.method public final AFLogger(Z)V
    .locals 2

    .line 44
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x1

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    .line 45
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->w:Z

    .line 46
    sget p0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 p0, p0, 0x1d

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    return-void

    .line 47
    :cond_0
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->w:Z

    const/4 p0, 0x0

    .line 48
    throw p0
.end method

.method public final AFLogger()Z
    .locals 2

    .line 43
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x53

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 v0, v0, 0x2

    iget-boolean p0, p0, Lcom/appsflyer/internal/AFf1fSDK;->w:Z

    if-eqz v0, :cond_0

    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x51

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    return p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public final d(Lcom/appsflyer/internal/AFc1iSDK;)V
    .locals 4

    .line 176
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x77

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 v0, v0, 0x2

    .line 177
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    if-nez v0, :cond_0

    sget-object v0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->LVL:Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    invoke-interface {v1, v0}, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->isOptionalFeaturePresent(Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;)Z

    move-result v0

    const/16 v1, 0x52

    .line 178
    div-int/lit8 v1, v1, 0x0

    if-nez v0, :cond_2

    goto :goto_0

    .line 179
    :cond_0
    sget-object v0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->LVL:Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    invoke-interface {v1, v0}, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->isOptionalFeaturePresent(Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 180
    :goto_0
    sget p0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 p0, p0, 0x3d

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_1

    const/16 p0, 0x56

    div-int/lit8 p0, p0, 0x0

    :cond_1
    return-void

    .line 181
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->d:J

    .line 182
    invoke-static {}, Lcom/appsflyer/internal/AFf1fSDK;->e()Lcom/appsflyer/internal/AFf1cSDK;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger(Lcom/appsflyer/internal/AFc1iSDK;)J

    move-result-wide v1

    iget-object p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 183
    iget-object p1, p1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 184
    new-instance v3, Lcom/appsflyer/internal/AFf1fSDK$3;

    invoke-direct {v3, p0}, Lcom/appsflyer/internal/AFf1fSDK$3;-><init>(Lcom/appsflyer/internal/AFf1fSDK;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/appsflyer/internal/AFf1cSDK;->AFLogger(JLandroid/content/Context;Lcom/appsflyer/internal/AFf1cSDK$AFa1zSDK;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient:Z

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    .line 185
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x55

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    .line 186
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->i:Ljava/lang/String;

    const/16 p0, 0x5c

    .line 187
    div-int/lit8 p0, p0, 0x0

    goto :goto_0

    .line 188
    :cond_0
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->i:Ljava/lang/String;

    .line 189
    :goto_0
    sget p0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 p0, p0, 0x5

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    return-void
.end method

.method public final d()Z
    .locals 3

    .line 175
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/lit8 v0, v0, 0x17

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    rem-int/lit8 v0, v0, 0x2

    iget-boolean v1, p0, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient:Z

    const/4 v2, 0x0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1fSDK;->v()Z

    move-result p0

    if-nez p0, :cond_0

    sget p0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/lit8 p0, p0, 0x3f

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    return v0

    :cond_0
    sget p0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/2addr p0, v0

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    throw v2

    :cond_2
    throw v2
.end method

.method public final registerClient()V
    .locals 7

    .line 140
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x59

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 v0, v0, 0x2

    const-string v1, "lvl_timestamp"

    const-string v2, "ttr"

    .line 141
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/appsflyer/internal/AFf1fSDK;->d:J

    sub-long/2addr v3, v5

    .line 142
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1fSDK;->w()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    sget p0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 p0, p0, 0x2b

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public final unregisterClient()Ljava/lang/String;
    .locals 3

    .line 78
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v1, -0x62ff1f55

    const v2, 0x62ff1f57

    invoke-static {v0, v1, v2, p0}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public final unregisterClient(Ljava/util/Map;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 77
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, 0x746b6f75

    const v1, -0x746b6f74

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    return-object p0
.end method
