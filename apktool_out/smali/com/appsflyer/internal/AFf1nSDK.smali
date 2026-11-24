.class public final Lcom/appsflyer/internal/AFf1nSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AFKeystoreWrapper:I = 0x0

.field private static AFLogger:[B = null

.field private static d:I = 0x0

.field private static force:I = 0x0

.field private static registerClient:I = 0x0

.field private static unregisterClient:[S = null

.field private static v:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/AFf1nSDK;->registerClient()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 8
    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    invoke-static {v0, v1}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 16
    .line 17
    .line 18
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 19
    .line 20
    .line 21
    sget v0, Lcom/appsflyer/internal/AFf1nSDK;->force:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x5f

    .line 24
    .line 25
    rem-int/lit16 v1, v0, 0x80

    .line 26
    .line 27
    sput v1, Lcom/appsflyer/internal/AFf1nSDK;->v:I

    .line 28
    .line 29
    rem-int/lit8 v0, v0, 0x2

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const/4 v0, 0x0

    .line 35
    throw v0
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

.method private static AFLogger(Lcom/appsflyer/internal/AFh1aSDK;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFi1uSDK;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    new-instance p1, Lcom/appsflyer/internal/AFi1uSDK;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1aSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1iSDK;

    .line 8
    .line 9
    sget-object p2, Lcom/appsflyer/internal/AFh1iSDK;->registerClient:Lcom/appsflyer/internal/AFh1iSDK;

    .line 10
    .line 11
    if-ne p0, p2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v1

    .line 15
    :goto_0
    sget-object p0, Lcom/appsflyer/internal/AFh1dSDK;->registerClient:Lcom/appsflyer/internal/AFh1dSDK;

    .line 16
    .line 17
    invoke-direct {p1, v0, p0}, Lcom/appsflyer/internal/AFi1uSDK;-><init>(ZLcom/appsflyer/internal/AFh1dSDK;)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_1
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    rsub-int/lit8 v3, v2, -0x4b

    .line 28
    .line 29
    const-string v2, ""

    .line 30
    .line 31
    invoke-static {v2}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    int-to-short v4, v4

    .line 36
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    shr-int/lit8 v5, v5, 0x8

    .line 41
    .line 42
    add-int/lit8 v5, v5, -0x24

    .line 43
    .line 44
    int-to-byte v5, v5

    .line 45
    const/16 v6, 0x30

    .line 46
    .line 47
    invoke-static {v2, v6, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    const v7, 0x776324f2

    .line 52
    .line 53
    .line 54
    sub-int v6, v7, v6

    .line 55
    .line 56
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    shr-int/lit8 v7, v7, 0x10

    .line 61
    .line 62
    const v8, -0x196fedad

    .line 63
    .line 64
    .line 65
    sub-int v7, v8, v7

    .line 66
    .line 67
    new-array v8, v0, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/internal/AFf1nSDK;->a(ISBII[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    aget-object v0, v8, v1

    .line 73
    .line 74
    check-cast v0, Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iget-object v1, p0, Lcom/appsflyer/internal/AFh1aSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1iSDK;

    .line 81
    .line 82
    sget-object v3, Lcom/appsflyer/internal/AFh1iSDK;->d:Lcom/appsflyer/internal/AFh1iSDK;

    .line 83
    .line 84
    if-ne v1, v3, :cond_2

    .line 85
    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    move-object p3, v0

    .line 101
    :goto_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1aSDK;->d:Ljava/lang/String;

    .line 102
    .line 103
    new-instance p2, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    const-string p3, "android"

    .line 117
    .line 118
    const-string v0, "v1"

    .line 119
    .line 120
    invoke-static {p2, p0, p3, v0, v2}, Lcom/appsflyer/internal/AFf1nSDK;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    new-instance p1, Lcom/appsflyer/internal/AFi1uSDK;

    .line 129
    .line 130
    if-eqz p0, :cond_3

    .line 131
    .line 132
    sget-object p2, Lcom/appsflyer/internal/AFh1dSDK;->d:Lcom/appsflyer/internal/AFh1dSDK;

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_3
    sget-object p2, Lcom/appsflyer/internal/AFh1dSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    .line 136
    .line 137
    :goto_2
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/internal/AFi1uSDK;-><init>(ZLcom/appsflyer/internal/AFh1dSDK;)V

    .line 138
    .line 139
    .line 140
    return-object p1
.end method

.method private static a(ISBII[Ljava/lang/Object;)V
    .locals 12

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFk1rSDK;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/appsflyer/internal/AFk1rSDK;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    sget v2, Lcom/appsflyer/internal/AFf1nSDK;->registerClient:I

    .line 12
    .line 13
    int-to-long v2, v2

    .line 14
    const-wide v4, -0x5f1571567e51948fL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    xor-long/2addr v2, v4

    .line 20
    long-to-int v2, v2

    .line 21
    add-int/2addr p0, v2

    .line 22
    const/4 v2, -0x1

    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v6, 0x1

    .line 25
    if-ne p0, v2, :cond_0

    .line 26
    .line 27
    move v2, v6

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v3

    .line 30
    :goto_0
    if-eqz v2, :cond_5

    .line 31
    .line 32
    sget p0, Lcom/appsflyer/internal/AFf1nSDK;->$11:I

    .line 33
    .line 34
    add-int/lit8 p0, p0, 0x5f

    .line 35
    .line 36
    rem-int/lit16 v7, p0, 0x80

    .line 37
    .line 38
    sput v7, Lcom/appsflyer/internal/AFf1nSDK;->$10:I

    .line 39
    .line 40
    rem-int/lit8 p0, p0, 0x2

    .line 41
    .line 42
    if-nez p0, :cond_4

    .line 43
    .line 44
    sget-object p0, Lcom/appsflyer/internal/AFf1nSDK;->AFLogger:[B

    .line 45
    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    array-length v7, p0

    .line 49
    new-array v8, v7, [B

    .line 50
    .line 51
    move v9, v3

    .line 52
    :goto_1
    if-ge v9, v7, :cond_1

    .line 53
    .line 54
    aget-byte v10, p0, v9

    .line 55
    .line 56
    int-to-long v10, v10

    .line 57
    xor-long/2addr v10, v4

    .line 58
    long-to-int v10, v10

    .line 59
    int-to-byte v10, v10

    .line 60
    aput-byte v10, v8, v9

    .line 61
    .line 62
    add-int/lit8 v9, v9, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move-object p0, v8

    .line 66
    :cond_2
    if-eqz p0, :cond_3

    .line 67
    .line 68
    sget-object p0, Lcom/appsflyer/internal/AFf1nSDK;->AFLogger:[B

    .line 69
    .line 70
    sget v7, Lcom/appsflyer/internal/AFf1nSDK;->d:I

    .line 71
    .line 72
    int-to-long v7, v7

    .line 73
    xor-long/2addr v7, v4

    .line 74
    long-to-int v7, v7

    .line 75
    add-int v7, p4, v7

    .line 76
    .line 77
    aget-byte p0, p0, v7

    .line 78
    .line 79
    int-to-long v7, p0

    .line 80
    xor-long/2addr v7, v4

    .line 81
    long-to-int p0, v7

    .line 82
    int-to-byte p0, p0

    .line 83
    sget v7, Lcom/appsflyer/internal/AFf1nSDK;->registerClient:I

    .line 84
    .line 85
    int-to-long v7, v7

    .line 86
    xor-long/2addr v7, v4

    .line 87
    long-to-int v7, v7

    .line 88
    add-int/2addr p0, v7

    .line 89
    int-to-byte p0, p0

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    sget-object p0, Lcom/appsflyer/internal/AFf1nSDK;->unregisterClient:[S

    .line 92
    .line 93
    sget v7, Lcom/appsflyer/internal/AFf1nSDK;->d:I

    .line 94
    .line 95
    int-to-long v7, v7

    .line 96
    xor-long/2addr v7, v4

    .line 97
    long-to-int v7, v7

    .line 98
    add-int v7, p4, v7

    .line 99
    .line 100
    aget-short p0, p0, v7

    .line 101
    .line 102
    int-to-long v7, p0

    .line 103
    xor-long/2addr v7, v4

    .line 104
    long-to-int p0, v7

    .line 105
    int-to-short p0, p0

    .line 106
    sget v7, Lcom/appsflyer/internal/AFf1nSDK;->registerClient:I

    .line 107
    .line 108
    int-to-long v7, v7

    .line 109
    xor-long/2addr v7, v4

    .line 110
    long-to-int v7, v7

    .line 111
    add-int/2addr p0, v7

    .line 112
    int-to-short p0, p0

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    const/4 p0, 0x0

    .line 115
    throw p0

    .line 116
    :cond_5
    :goto_2
    if-lez p0, :cond_d

    .line 117
    .line 118
    sget v7, Lcom/appsflyer/internal/AFf1nSDK;->$10:I

    .line 119
    .line 120
    add-int/lit8 v7, v7, 0x7b

    .line 121
    .line 122
    rem-int/lit16 v8, v7, 0x80

    .line 123
    .line 124
    sput v8, Lcom/appsflyer/internal/AFf1nSDK;->$11:I

    .line 125
    .line 126
    rem-int/lit8 v7, v7, 0x2

    .line 127
    .line 128
    if-nez v7, :cond_6

    .line 129
    .line 130
    ushr-int v7, p4, p0

    .line 131
    .line 132
    add-int/lit8 v7, v7, -0x5

    .line 133
    .line 134
    sget v8, Lcom/appsflyer/internal/AFf1nSDK;->d:I

    .line 135
    .line 136
    int-to-long v8, v8

    .line 137
    rem-long/2addr v8, v4

    .line 138
    long-to-int v8, v8

    .line 139
    add-int/2addr v7, v8

    .line 140
    if-eqz v2, :cond_7

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    add-int v7, p4, p0

    .line 144
    .line 145
    add-int/lit8 v7, v7, -0x2

    .line 146
    .line 147
    sget v8, Lcom/appsflyer/internal/AFf1nSDK;->d:I

    .line 148
    .line 149
    int-to-long v8, v8

    .line 150
    xor-long/2addr v8, v4

    .line 151
    long-to-int v8, v8

    .line 152
    add-int/2addr v7, v8

    .line 153
    if-eqz v2, :cond_7

    .line 154
    .line 155
    :goto_3
    move v2, v6

    .line 156
    goto :goto_4

    .line 157
    :cond_7
    move v2, v3

    .line 158
    :goto_4
    add-int/2addr v7, v2

    .line 159
    iput v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    .line 160
    .line 161
    sget v2, Lcom/appsflyer/internal/AFf1nSDK;->AFKeystoreWrapper:I

    .line 162
    .line 163
    int-to-long v7, v2

    .line 164
    xor-long/2addr v7, v4

    .line 165
    long-to-int v2, v7

    .line 166
    add-int/2addr v2, p3

    .line 167
    int-to-char v2, v2

    .line 168
    iput-char v2, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    .line 169
    .line 170
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    iget-char v2, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    .line 174
    .line 175
    iput-char v2, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    .line 176
    .line 177
    sget-object v2, Lcom/appsflyer/internal/AFf1nSDK;->AFLogger:[B

    .line 178
    .line 179
    if-eqz v2, :cond_9

    .line 180
    .line 181
    array-length v7, v2

    .line 182
    new-array v8, v7, [B

    .line 183
    .line 184
    move v9, v3

    .line 185
    :goto_5
    if-ge v9, v7, :cond_8

    .line 186
    .line 187
    aget-byte v10, v2, v9

    .line 188
    .line 189
    int-to-long v10, v10

    .line 190
    xor-long/2addr v10, v4

    .line 191
    long-to-int v10, v10

    .line 192
    int-to-byte v10, v10

    .line 193
    aput-byte v10, v8, v9

    .line 194
    .line 195
    add-int/lit8 v9, v9, 0x1

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_8
    move-object v2, v8

    .line 199
    :cond_9
    if-eqz v2, :cond_a

    .line 200
    .line 201
    sget v2, Lcom/appsflyer/internal/AFf1nSDK;->$10:I

    .line 202
    .line 203
    add-int/lit8 v2, v2, 0x2d

    .line 204
    .line 205
    rem-int/lit16 v7, v2, 0x80

    .line 206
    .line 207
    sput v7, Lcom/appsflyer/internal/AFf1nSDK;->$11:I

    .line 208
    .line 209
    rem-int/lit8 v2, v2, 0x2

    .line 210
    .line 211
    if-nez v2, :cond_b

    .line 212
    .line 213
    :cond_a
    move v2, v3

    .line 214
    goto :goto_6

    .line 215
    :cond_b
    move v2, v6

    .line 216
    :goto_6
    iput v6, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    .line 217
    .line 218
    :goto_7
    iget v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    .line 219
    .line 220
    if-ge v7, p0, :cond_d

    .line 221
    .line 222
    iget v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    .line 223
    .line 224
    if-eqz v2, :cond_c

    .line 225
    .line 226
    sget-object v8, Lcom/appsflyer/internal/AFf1nSDK;->AFLogger:[B

    .line 227
    .line 228
    add-int/lit8 v9, v7, -0x1

    .line 229
    .line 230
    iput v9, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    .line 231
    .line 232
    aget-byte v7, v8, v7

    .line 233
    .line 234
    int-to-long v7, v7

    .line 235
    xor-long/2addr v7, v4

    .line 236
    long-to-int v7, v7

    .line 237
    int-to-byte v7, v7

    .line 238
    iget-char v8, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    .line 239
    .line 240
    add-int/2addr v7, p1

    .line 241
    int-to-byte v7, v7

    .line 242
    xor-int/2addr v7, p2

    .line 243
    add-int/2addr v8, v7

    .line 244
    int-to-char v7, v8

    .line 245
    iput-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    .line 246
    .line 247
    goto :goto_8

    .line 248
    :cond_c
    sget-object v8, Lcom/appsflyer/internal/AFf1nSDK;->unregisterClient:[S

    .line 249
    .line 250
    add-int/lit8 v9, v7, -0x1

    .line 251
    .line 252
    iput v9, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    .line 253
    .line 254
    aget-short v7, v8, v7

    .line 255
    .line 256
    int-to-long v7, v7

    .line 257
    xor-long/2addr v7, v4

    .line 258
    long-to-int v7, v7

    .line 259
    int-to-short v7, v7

    .line 260
    iget-char v8, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    .line 261
    .line 262
    add-int/2addr v7, p1

    .line 263
    int-to-short v7, v7

    .line 264
    xor-int/2addr v7, p2

    .line 265
    add-int/2addr v8, v7

    .line 266
    int-to-char v7, v8

    .line 267
    iput-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    .line 268
    .line 269
    :goto_8
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    iget-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    .line 273
    .line 274
    iput-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    .line 275
    .line 276
    iget v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    .line 277
    .line 278
    add-int/2addr v7, v6

    .line 279
    iput v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_d
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    aput-object p0, p5, v3

    .line 287
    .line 288
    return-void
.end method

.method private static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    sget v0, Lcom/appsflyer/internal/AFf1nSDK;->v:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFf1nSDK;->force:I

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    rem-int/2addr v0, v1

    .line 11
    const/16 v2, 0xc

    .line 12
    .line 13
    const-string v3, "\u2063"

    .line 14
    .line 15
    const-string v4, ""

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x5

    .line 21
    new-array v6, v0, [Ljava/lang/String;

    .line 22
    .line 23
    aput-object p1, v6, v5

    .line 24
    .line 25
    aput-object p2, v6, v5

    .line 26
    .line 27
    aput-object p3, v6, v0

    .line 28
    .line 29
    const/4 p1, 0x4

    .line 30
    aput-object p4, v6, p1

    .line 31
    .line 32
    aput-object v4, v6, v1

    .line 33
    .line 34
    invoke-static {v3, v6}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1, p0}, Lcom/appsflyer/internal/AFj1nSDK;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const/16 p2, 0xe

    .line 47
    .line 48
    if-ge p1, p2, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    filled-new-array {p1, p2, p3, p4, v4}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {v3, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {p1, p0}, Lcom/appsflyer/internal/AFj1nSDK;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-ge p1, v2, :cond_2

    .line 68
    .line 69
    :goto_0
    sget p1, Lcom/appsflyer/internal/AFf1nSDK;->force:I

    .line 70
    .line 71
    add-int/lit8 p1, p1, 0x21

    .line 72
    .line 73
    rem-int/lit16 p2, p1, 0x80

    .line 74
    .line 75
    sput p2, Lcom/appsflyer/internal/AFf1nSDK;->v:I

    .line 76
    .line 77
    rem-int/2addr p1, v1

    .line 78
    if-nez p1, :cond_1

    .line 79
    .line 80
    const/16 p1, 0x38

    .line 81
    .line 82
    div-int/2addr p1, v5

    .line 83
    :cond_1
    return-object p0

    .line 84
    :cond_2
    invoke-virtual {p0, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method public static registerClient()V
    .locals 1

    .line 1
    const v0, -0x673e7924

    .line 2
    .line 3
    .line 4
    sput v0, Lcom/appsflyer/internal/AFf1nSDK;->d:I

    .line 5
    .line 6
    const v0, -0x7e5194c5

    .line 7
    .line 8
    .line 9
    sput v0, Lcom/appsflyer/internal/AFf1nSDK;->registerClient:I

    .line 10
    .line 11
    const v0, 0x932b031

    .line 12
    .line 13
    .line 14
    sput v0, Lcom/appsflyer/internal/AFf1nSDK;->AFKeystoreWrapper:I

    .line 15
    .line 16
    const/16 v0, 0x40

    .line 17
    .line 18
    new-array v0, v0, [B

    .line 19
    .line 20
    fill-array-data v0, :array_0

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/appsflyer/internal/AFf1nSDK;->AFLogger:[B

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :array_0
    .array-data 1
        -0x79t
        -0x5et
        0x52t
        0x52t
        0x52t
        -0x52t
        0x5ct
        -0x59t
        -0x55t
        0x52t
        0x56t
        -0x53t
        -0x53t
        -0x57t
        0x52t
        0x50t
        -0x52t
        -0x54t
        -0x51t
        0x57t
        0x5bt
        -0x5ft
        0x5dt
        -0x5et
        0x52t
        -0x51t
        0x59t
        -0x5at
        -0x51t
        0x52t
        0x52t
        -0x53t
        -0x58t
        0x51t
        -0x51t
        0x50t
        0x5ft
        -0x43t
        -0x57t
        0x51t
        0x51t
        -0x57t
        0x56t
        -0x56t
        0x50t
        -0x54t
        0x53t
        -0x57t
        -0x53t
        0x53t
        -0x53t
        -0x51t
        0x54t
        -0x51t
        0x53t
        -0x55t
        0x50t
        0x52t
        -0x54t
        -0x52t
        -0x53t
        0x51t
        -0x57t
        -0x53t
    .end array-data
.end method


# virtual methods
.method public final AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1aSDK;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFi1uSDK;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    sget p0, Lcom/appsflyer/internal/AFf1nSDK;->v:I

    .line 8
    .line 9
    add-int/lit8 p0, p0, 0x49

    .line 10
    .line 11
    rem-int/lit16 p0, p0, 0x80

    .line 12
    .line 13
    sput p0, Lcom/appsflyer/internal/AFf1nSDK;->force:I

    .line 14
    .line 15
    invoke-static {p1, p2, p3, p4}, Lcom/appsflyer/internal/AFf1nSDK;->AFLogger(Lcom/appsflyer/internal/AFh1aSDK;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFi1uSDK;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance p0, Lcom/appsflyer/internal/AFi1uSDK;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    sget-object p2, Lcom/appsflyer/internal/AFh1dSDK;->AFLogger:Lcom/appsflyer/internal/AFh1dSDK;

    .line 24
    .line 25
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFi1uSDK;-><init>(ZLcom/appsflyer/internal/AFh1dSDK;)V

    .line 26
    .line 27
    .line 28
    sget p1, Lcom/appsflyer/internal/AFf1nSDK;->v:I

    .line 29
    .line 30
    add-int/lit8 p1, p1, 0x21

    .line 31
    .line 32
    rem-int/lit16 p1, p1, 0x80

    .line 33
    .line 34
    sput p1, Lcom/appsflyer/internal/AFf1nSDK;->force:I

    .line 35
    .line 36
    return-object p0
.end method
