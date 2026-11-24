.class public final Lcom/appsflyer/internal/AFc1hSDK;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AFKeystoreWrapper:C = '\u0000'

.field private static e:I = 0x1

.field private static force:C

.field private static i:C

.field private static registerClient:C

.field private static unregisterClient:[C

.field private static v:I

.field private static w:C


# instance fields
.field private final AFLogger:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/AFc1hSDK;->registerClient()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 7
    .line 8
    .line 9
    const/16 v1, 0x30

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v0, v1, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 16
    .line 17
    .line 18
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 25
    .line 26
    .line 27
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 28
    .line 29
    .line 30
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 31
    .line 32
    .line 33
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 37
    .line 38
    .line 39
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v2}, Landroid/view/View;->getDefaultSize(II)I

    .line 43
    .line 44
    .line 45
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 46
    .line 47
    .line 48
    sget v0, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    .line 49
    .line 50
    add-int/lit8 v0, v0, 0x13

    .line 51
    .line 52
    rem-int/lit16 v1, v0, 0x80

    .line 53
    .line 54
    sput v1, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    .line 55
    .line 56
    rem-int/lit8 v0, v0, 0x2

    .line 57
    .line 58
    if-nez v0, :cond_0

    .line 59
    .line 60
    const/16 v0, 0x18

    .line 61
    .line 62
    div-int/2addr v0, v2

    .line 63
    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger:Ljava/util/Map;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/appsflyer/internal/AFc1hSDK;->d:Landroid/content/Context;

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1hSDK;->AFKeystoreWrapper()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private AFKeystoreWrapper()Ljava/lang/String;
    .locals 15

    .line 1
    const-string v1, ""

    .line 2
    .line 3
    const/16 v2, 0x30

    .line 4
    .line 5
    const/16 v3, 0x10

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger:Ljava/util/Map;

    .line 10
    .line 11
    const-string v6, ")!#\u0003\u0001+\r\u000c\u0005#)\u000f"

    .line 12
    .line 13
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    shr-int/lit8 v7, v7, 0x18

    .line 18
    .line 19
    rsub-int/lit8 v7, v7, 0xc

    .line 20
    .line 21
    invoke-static {v5, v5}, Landroid/view/View;->getDefaultSize(II)I

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    rsub-int/lit8 v8, v8, 0x33

    .line 26
    .line 27
    int-to-byte v8, v8

    .line 28
    new-array v9, v4, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {v6, v7, v8, v9}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    aget-object v6, v9, v5

    .line 34
    .line 35
    check-cast v6, Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v6, p0, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger:Ljava/util/Map;

    .line 50
    .line 51
    const-string v7, "\u6fc0\u87f0\u9d4f\u5abb\u1388\ua99d\u8cae\u305e\u4bc3\u2943\ue744\u90aa\ub1fd\u0ebc\uf74d\ub333"

    .line 52
    .line 53
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    shr-int/lit8 v8, v8, 0x16

    .line 58
    .line 59
    add-int/lit8 v8, v8, 0xf

    .line 60
    .line 61
    new-array v9, v4, [Ljava/lang/Object;

    .line 62
    .line 63
    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    aget-object v7, v9, v5

    .line 67
    .line 68
    check-cast v7, Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    const-string v7, "\u0f03\u865f\u131c\ue396\uec19\u27ba"

    .line 83
    .line 84
    invoke-static {v1, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    rsub-int/lit8 v8, v8, 0x4

    .line 89
    .line 90
    new-array v9, v4, [Ljava/lang/Object;

    .line 91
    .line 92
    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    aget-object v7, v9, v5

    .line 96
    .line 97
    check-cast v7, Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    const-string v8, "\u0013\u0019\u0006-\u362c"

    .line 104
    .line 105
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    shr-int/lit8 v9, v9, 0x8

    .line 110
    .line 111
    add-int/lit8 v9, v9, 0x5

    .line 112
    .line 113
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    rsub-int/lit8 v10, v10, 0x7c

    .line 118
    .line 119
    int-to-byte v10, v10

    .line 120
    new-array v11, v4, [Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v8, v9, v10, v11}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    aget-object v8, v11, v5

    .line 126
    .line 127
    check-cast v8, Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    invoke-virtual {v7, v8, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    new-instance v8, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static {v0}, Lcom/appsflyer/internal/AFj1nSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    :goto_0
    move-object v6, v0

    .line 164
    goto/16 :goto_1

    .line 165
    .line 166
    :catch_0
    move-exception v0

    .line 167
    move-object v9, v0

    .line 168
    sget-object v6, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 169
    .line 170
    sget-object v7, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 171
    .line 172
    invoke-static {v1, v1, v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    add-int/lit8 v0, v0, 0x2b

    .line 177
    .line 178
    invoke-static {v1, v2, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    add-int/lit8 v8, v8, 0x21

    .line 183
    .line 184
    int-to-byte v8, v8

    .line 185
    new-array v10, v4, [Ljava/lang/Object;

    .line 186
    .line 187
    const-string v11, "\u0013\n\u0002\u000e\u0002\u0013#\u0013\u0005\r0!$/\u0013\u0007!+\u0013\n\n\r!/\u0001*\n\u0010-\u0005!\n\u0000-\r\u0004(+/\'\u0014\u0000\u361f"

    .line 188
    .line 189
    invoke-static {v11, v0, v8, v10}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    aget-object v0, v10, v5

    .line 193
    .line 194
    check-cast v0, Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    const/4 v10, 0x0

    .line 201
    const/4 v11, 0x0

    .line 202
    invoke-virtual/range {v6 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 203
    .line 204
    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    shr-int/lit8 v8, v8, 0x16

    .line 215
    .line 216
    rsub-int/lit8 v8, v8, 0x31

    .line 217
    .line 218
    new-array v10, v4, [Ljava/lang/Object;

    .line 219
    .line 220
    const-string v11, "\u6200\uaff1\u3d0a\u322f\u26b9\ud62f\u595e\uf895\u6677\uf538\uc4cb\ubf88\ub1fd\u0ebc\ueaed\ufe15\u8175\u8e11\uee9f\u38e5\ua0ba\u9162\ubc21\u4695\u12fb\u864e\uc3fb\u8f1c\ub48f\u5b3c\u9b18\uef18\ua0d1\u4d60\u0e83\uf78a\ub636\u10ad\u4f83\u09f1\ufe72\u2e50\u5f46\u8279\ud613\u1aee\uadc9\uebc9\uc515\ub0cf"

    .line 221
    .line 222
    invoke-static {v11, v8, v10}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    aget-object v8, v10, v5

    .line 226
    .line 227
    check-cast v8, Ljava/lang/String;

    .line 228
    .line 229
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {v6, v7, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    new-instance v0, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    shr-int/2addr v6, v3

    .line 256
    add-int/lit8 v6, v6, 0x12

    .line 257
    .line 258
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    shr-int/2addr v7, v3

    .line 263
    int-to-byte v7, v7

    .line 264
    new-array v8, v4, [Ljava/lang/Object;

    .line 265
    .line 266
    const-string v9, "\u001a%\u001a\t/\u0013&\u000b #\u001e\u0001\r\u001d\u0004(\u000f\u0008"

    .line 267
    .line 268
    invoke-static {v9, v6, v7, v8}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    aget-object v6, v8, v5

    .line 272
    .line 273
    check-cast v6, Ljava/lang/String;

    .line 274
    .line 275
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    goto :goto_0

    .line 287
    :goto_1
    const-wide/16 v7, 0x0

    .line 288
    .line 289
    :try_start_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1hSDK;->d:Landroid/content/Context;

    .line 290
    .line 291
    new-instance v9, Landroid/content/IntentFilter;

    .line 292
    .line 293
    const-string v10, "\ua11c\u4cb6\uf29b\u8126\uc477\u2ce4\u3247\u4b6f\ueaed\ufe15\udd09\u1e2d\u087f\u94c6\u62b9\u7eec\u70af\ude12\ud613\u1aee\u119b\u7b87\u4694\u795b\u5f83\u8341\u6873\ua402\ua13a\u3bbd\uca03\u5133\ua0dd\u492b\uad4d\ueded\u335f\u302a"

    .line 294
    .line 295
    invoke-static {v5}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 296
    .line 297
    .line 298
    move-result v11

    .line 299
    rsub-int/lit8 v11, v11, 0x25

    .line 300
    .line 301
    new-array v12, v4, [Ljava/lang/Object;

    .line 302
    .line 303
    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    aget-object v10, v12, v5

    .line 307
    .line 308
    check-cast v10, Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v10

    .line 314
    invoke-direct {v9, v10}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    const/4 v10, 0x0

    .line 318
    invoke-virtual {v0, v10, v9}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    const/16 v9, -0xa8c

    .line 323
    .line 324
    const/4 v10, 0x0

    .line 325
    if-eqz v0, :cond_0

    .line 326
    .line 327
    const-string v11, "\udd09\u1e2d\u4d0c\uebb7\uc4cb\ubf88\ub1fd\u0ebc\uf3e3\uc2fa\uf74d\ub333"

    .line 328
    .line 329
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 330
    .line 331
    .line 332
    move-result v12

    .line 333
    cmpl-float v12, v12, v10

    .line 334
    .line 335
    rsub-int/lit8 v12, v12, 0xc

    .line 336
    .line 337
    new-array v13, v4, [Ljava/lang/Object;

    .line 338
    .line 339
    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    aget-object v11, v13, v5

    .line 343
    .line 344
    check-cast v11, Ljava/lang/String;

    .line 345
    .line 346
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v11

    .line 350
    invoke-virtual {v0, v11, v9}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 351
    .line 352
    .line 353
    move-result v9
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 354
    goto :goto_2

    .line 355
    :catch_1
    move-exception v0

    .line 356
    move-object p0, v0

    .line 357
    move-object v12, p0

    .line 358
    goto/16 :goto_6

    .line 359
    .line 360
    :cond_0
    sget v0, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    .line 361
    .line 362
    add-int/lit8 v0, v0, 0x61

    .line 363
    .line 364
    rem-int/lit16 v0, v0, 0x80

    .line 365
    .line 366
    sput v0, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    .line 367
    .line 368
    :goto_2
    :try_start_2
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1hSDK;->d:Landroid/content/Context;

    .line 369
    .line 370
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 375
    .line 376
    if-eqz v0, :cond_1

    .line 377
    .line 378
    sget v11, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    .line 379
    .line 380
    add-int/lit8 v11, v11, 0x6d

    .line 381
    .line 382
    rem-int/lit16 v11, v11, 0x80

    .line 383
    .line 384
    sput v11, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    .line 385
    .line 386
    :try_start_3
    const-string v11, "\uf9a7\ud46f\u1516\u8394"

    .line 387
    .line 388
    invoke-static {v5, v5, v5}, Landroid/graphics/Color;->rgb(III)I

    .line 389
    .line 390
    .line 391
    move-result v12

    .line 392
    const v13, 0x1000003

    .line 393
    .line 394
    .line 395
    add-int/2addr v12, v13

    .line 396
    new-array v13, v4, [Ljava/lang/Object;

    .line 397
    .line 398
    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    aget-object v11, v13, v5

    .line 402
    .line 403
    check-cast v11, Ljava/lang/String;

    .line 404
    .line 405
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v11

    .line 409
    invoke-virtual {v0, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 410
    .line 411
    .line 412
    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 413
    if-eqz v0, :cond_1

    .line 414
    .line 415
    sget v0, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    .line 416
    .line 417
    add-int/lit8 v0, v0, 0x6f

    .line 418
    .line 419
    rem-int/lit16 v0, v0, 0x80

    .line 420
    .line 421
    sput v0, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    .line 422
    .line 423
    move v0, v4

    .line 424
    goto :goto_3

    .line 425
    :cond_1
    move v0, v5

    .line 426
    :goto_3
    :try_start_4
    iget-object v11, p0, Lcom/appsflyer/internal/AFc1hSDK;->d:Landroid/content/Context;

    .line 427
    .line 428
    const-string v12, "\u000c\r\n\u000c\u0019\u001b"

    .line 429
    .line 430
    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 431
    .line 432
    .line 433
    move-result v13

    .line 434
    add-int/lit8 v13, v13, 0x6

    .line 435
    .line 436
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 437
    .line 438
    .line 439
    move-result v14

    .line 440
    shr-int/lit8 v3, v14, 0x10

    .line 441
    .line 442
    add-int/lit8 v3, v3, 0x46

    .line 443
    .line 444
    int-to-byte v3, v3

    .line 445
    new-array v14, v4, [Ljava/lang/Object;

    .line 446
    .line 447
    invoke-static {v12, v13, v3, v14}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    aget-object v3, v14, v5

    .line 451
    .line 452
    check-cast v3, Ljava/lang/String;

    .line 453
    .line 454
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v3

    .line 458
    invoke-virtual {v11, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    check-cast v3, Landroid/hardware/SensorManager;

    .line 463
    .line 464
    const/4 v11, -0x1

    .line 465
    invoke-virtual {v3, v11}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 470
    .line 471
    .line 472
    move-result v3

    .line 473
    new-instance v11, Ljava/lang/StringBuilder;

    .line 474
    .line 475
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 476
    .line 477
    .line 478
    const-string v12, "\u54d9\u9857"

    .line 479
    .line 480
    invoke-static {v1}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 481
    .line 482
    .line 483
    move-result v13

    .line 484
    add-int/2addr v13, v4

    .line 485
    new-array v14, v4, [Ljava/lang/Object;

    .line 486
    .line 487
    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    aget-object v12, v14, v5

    .line 491
    .line 492
    check-cast v12, Ljava/lang/String;

    .line 493
    .line 494
    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v12

    .line 498
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    const-string v9, "\u2ab9\u7548"

    .line 505
    .line 506
    invoke-static {v1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 507
    .line 508
    .line 509
    move-result v12

    .line 510
    rsub-int/lit8 v12, v12, 0x2

    .line 511
    .line 512
    new-array v13, v4, [Ljava/lang/Object;

    .line 513
    .line 514
    invoke-static {v9, v12, v13}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    aget-object v9, v13, v5

    .line 518
    .line 519
    check-cast v9, Ljava/lang/String;

    .line 520
    .line 521
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v9

    .line 525
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    const-string v0, "\u0008\u000c"

    .line 532
    .line 533
    invoke-static {v5, v10, v10}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 534
    .line 535
    .line 536
    move-result v9

    .line 537
    cmpl-float v9, v9, v10

    .line 538
    .line 539
    add-int/lit8 v9, v9, 0x2

    .line 540
    .line 541
    invoke-static {v1, v1, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 542
    .line 543
    .line 544
    move-result v10

    .line 545
    add-int/lit8 v10, v10, 0x25

    .line 546
    .line 547
    int-to-byte v10, v10

    .line 548
    new-array v12, v4, [Ljava/lang/Object;

    .line 549
    .line 550
    invoke-static {v0, v9, v10, v12}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    aget-object v0, v12, v5

    .line 554
    .line 555
    check-cast v0, Ljava/lang/String;

    .line 556
    .line 557
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 565
    .line 566
    .line 567
    const-string v0, "\r\u000e"

    .line 568
    .line 569
    invoke-static {v5, v5}, Landroid/view/View;->resolveSize(II)I

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    add-int/lit8 v3, v3, 0x2

    .line 574
    .line 575
    invoke-static {v1, v1, v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    add-int/lit8 v1, v1, 0x5f

    .line 580
    .line 581
    int-to-byte v1, v1

    .line 582
    new-array v9, v4, [Ljava/lang/Object;

    .line 583
    .line 584
    invoke-static {v0, v3, v1, v9}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    aget-object v0, v9, v5

    .line 588
    .line 589
    check-cast v0, Ljava/lang/String;

    .line 590
    .line 591
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger:Ljava/util/Map;

    .line 599
    .line 600
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 601
    .line 602
    .line 603
    move-result p0

    .line 604
    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object p0

    .line 611
    new-instance v0, Ljava/lang/StringBuilder;

    .line 612
    .line 613
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 624
    .line 625
    .line 626
    move-result-object p0

    .line 627
    move v1, v5

    .line 628
    :goto_4
    array-length v3, p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 629
    if-ge v1, v3, :cond_2

    .line 630
    .line 631
    sget v3, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    .line 632
    .line 633
    add-int/lit8 v3, v3, 0x31

    .line 634
    .line 635
    rem-int/lit16 v3, v3, 0x80

    .line 636
    .line 637
    sput v3, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    .line 638
    .line 639
    :try_start_5
    aget-byte v3, p0, v1

    .line 640
    .line 641
    rem-int/lit8 v9, v1, 0x2

    .line 642
    .line 643
    add-int/lit8 v9, v9, 0x2a

    .line 644
    .line 645
    xor-int/2addr v3, v9

    .line 646
    int-to-byte v3, v3

    .line 647
    aput-byte v3, p0, v1

    .line 648
    .line 649
    add-int/lit8 v1, v1, 0x1

    .line 650
    .line 651
    goto :goto_4

    .line 652
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 653
    .line 654
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 655
    .line 656
    .line 657
    array-length v3, p0

    .line 658
    move v9, v5

    .line 659
    :goto_5
    if-ge v9, v3, :cond_4

    .line 660
    .line 661
    aget-byte v10, p0, v9

    .line 662
    .line 663
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v10

    .line 667
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 668
    .line 669
    .line 670
    move-result v11

    .line 671
    if-ne v11, v4, :cond_3

    .line 672
    .line 673
    const-string v11, "0"

    .line 674
    .line 675
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v10

    .line 679
    :cond_3
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 680
    .line 681
    .line 682
    add-int/lit8 v9, v9, 0x1

    .line 683
    .line 684
    goto :goto_5

    .line 685
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object p0

    .line 689
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object p0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 696
    goto :goto_7

    .line 697
    :goto_6
    sget-object v9, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 698
    .line 699
    sget-object v10, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 700
    .line 701
    invoke-static {v5}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 702
    .line 703
    .line 704
    move-result p0

    .line 705
    add-int/2addr p0, v2

    .line 706
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 707
    .line 708
    .line 709
    move-result v0

    .line 710
    shr-int/lit8 v0, v0, 0x16

    .line 711
    .line 712
    rsub-int/lit8 v0, v0, 0x29

    .line 713
    .line 714
    int-to-byte v0, v0

    .line 715
    new-array v1, v4, [Ljava/lang/Object;

    .line 716
    .line 717
    const-string v2, "\u0013\n\u0002\u000e\u0002\u0013#\u0013\u0005\r\u0005\u0013\u3611\u3611\u0019\u001b0(\u001d-\u0013\u0007-\u0013\r\n\u0013!#\u0005,\u0008\u0013-\u0008(\u0000\u0014#\u0005\u0019\u001b0!\u0013#\u0012\n"

    .line 718
    .line 719
    invoke-static {v2, p0, v0, v1}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 720
    .line 721
    .line 722
    aget-object p0, v1, v5

    .line 723
    .line 724
    check-cast p0, Ljava/lang/String;

    .line 725
    .line 726
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v11

    .line 730
    const/4 v13, 0x0

    .line 731
    const/4 v14, 0x0

    .line 732
    invoke-virtual/range {v9 .. v14}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 733
    .line 734
    .line 735
    new-instance p0, Ljava/lang/StringBuilder;

    .line 736
    .line 737
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 738
    .line 739
    .line 740
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    .line 741
    .line 742
    .line 743
    move-result v0

    .line 744
    add-int/lit8 v0, v0, 0x31

    .line 745
    .line 746
    new-array v1, v4, [Ljava/lang/Object;

    .line 747
    .line 748
    const-string v2, "\u6200\uaff1\u3d0a\u322f\u26b9\ud62f\u595e\uf895\u6677\uf538\uc4cb\ubf88\ub1fd\u0ebc\ueaed\ufe15\u8175\u8e11\u6a3f\uc0e0\ub48b\u53c2\ub1fd\u0ebc\u43f3\ua98c\u6fbd\ue145\u746f\u2a6f\u7228\ue4a4\ua0d1\u4d60\u0e83\uf78a\ub636\u10ad\u4f83\u09f1\ufe72\u2e50\u5f46\u8279\ud613\u1aee\uadc9\uebc9\uc515\ub0cf"

    .line 749
    .line 750
    invoke-static {v2, v0, v1}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    aget-object v0, v1, v5

    .line 754
    .line 755
    check-cast v0, Ljava/lang/String;

    .line 756
    .line 757
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 762
    .line 763
    .line 764
    invoke-virtual {p0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 765
    .line 766
    .line 767
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object p0

    .line 771
    invoke-virtual {v9, v10, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    new-instance p0, Ljava/lang/StringBuilder;

    .line 775
    .line 776
    invoke-direct {p0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 777
    .line 778
    .line 779
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 780
    .line 781
    .line 782
    move-result-wide v0

    .line 783
    cmp-long v0, v0, v7

    .line 784
    .line 785
    add-int/lit8 v0, v0, 0xf

    .line 786
    .line 787
    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 788
    .line 789
    .line 790
    move-result v1

    .line 791
    rsub-int/lit8 v1, v1, 0x4

    .line 792
    .line 793
    int-to-byte v1, v1

    .line 794
    new-array v2, v4, [Ljava/lang/Object;

    .line 795
    .line 796
    const-string v3, " ) (\u001d\u000c\u000f\r\u0013\u0006\u0006\u0004\u001c\u0003)%"

    .line 797
    .line 798
    invoke-static {v3, v0, v1, v2}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 799
    .line 800
    .line 801
    aget-object v0, v2, v5

    .line 802
    .line 803
    check-cast v0, Ljava/lang/String;

    .line 804
    .line 805
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object p0

    .line 816
    :goto_7
    return-object p0
.end method

.method private static varargs AFKeystoreWrapper([Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 8

    .line 817
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 818
    array-length v1, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x3

    if-ge v2, v3, :cond_0

    .line 819
    sget v3, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    add-int/lit8 v3, v3, 0x61

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    .line 820
    aget-object v3, p0, v2

    .line 821
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 822
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 823
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 824
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move v4, v1

    :goto_1
    if-ge v4, v0, :cond_3

    .line 825
    sget v5, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    add-int/lit8 v5, v5, 0x53

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    const/4 v5, 0x0

    move v6, v1

    :goto_2
    if-ge v6, v3, :cond_2

    .line 826
    aget-object v7, p0, v6

    .line 827
    invoke-virtual {v7, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-nez v5, :cond_1

    goto :goto_3

    .line 828
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    xor-int/2addr v7, v5

    :goto_3
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    add-int/lit8 v6, v6, 0x1

    .line 829
    sget v7, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    add-int/lit8 v7, v7, 0xf

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    goto :goto_2

    .line 830
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    .line 831
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    .line 832
    sget v5, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    add-int/lit8 v5, v5, 0x47

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    goto :goto_1

    :cond_3
    return-object v2
.end method

.method private AFLogger()Ljava/lang/String;
    .locals 11

    .line 1
    const/4 v1, 0x1

    .line 2
    const/4 v2, 0x0

    .line 3
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v3, p0, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger:Ljava/util/Map;

    .line 10
    .line 11
    const-string v4, ")!#\u0003\u0001+\r\u000c\u0005#)\u000f"

    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    const-wide/16 v7, 0x0

    .line 18
    .line 19
    cmp-long v5, v5, v7

    .line 20
    .line 21
    add-int/lit8 v5, v5, 0xb

    .line 22
    .line 23
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    shr-int/lit8 v6, v6, 0x10

    .line 28
    .line 29
    add-int/lit8 v6, v6, 0x33

    .line 30
    .line 31
    int-to-byte v6, v6

    .line 32
    new-array v9, v1, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {v4, v5, v6, v9}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    aget-object v4, v9, v2

    .line 38
    .line 39
    check-cast v4, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger:Ljava/util/Map;

    .line 54
    .line 55
    const-string v4, "\u0018\u001b%\u000c\u3663"

    .line 56
    .line 57
    invoke-static {v2}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    const/4 v6, 0x4

    .line 62
    rsub-int/lit8 v5, v5, 0x4

    .line 63
    .line 64
    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    add-int/lit8 v9, v9, 0x65

    .line 69
    .line 70
    int-to-byte v9, v9

    .line 71
    new-array v10, v1, [Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {v4, v5, v9, v10}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    aget-object v4, v10, v2

    .line 77
    .line 78
    check-cast v4, Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    if-nez p0, :cond_0

    .line 93
    .line 94
    sget p0, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    .line 95
    .line 96
    add-int/lit8 p0, p0, 0x53

    .line 97
    .line 98
    rem-int/lit16 p0, p0, 0x80

    .line 99
    .line 100
    sput p0, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    .line 101
    .line 102
    :try_start_1
    const-string p0, "\u001f,$\u0018)\u0015 \u0017"

    .line 103
    .line 104
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    const/4 v5, 0x0

    .line 109
    cmpl-float v4, v4, v5

    .line 110
    .line 111
    add-int/lit8 v4, v4, 0x8

    .line 112
    .line 113
    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    rsub-int/lit8 v5, v5, 0x15

    .line 118
    .line 119
    int-to-byte v5, v5

    .line 120
    new-array v9, v1, [Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {p0, v4, v5, v9}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    aget-object p0, v9, v2

    .line 126
    .line 127
    check-cast p0, Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    goto :goto_0

    .line 134
    :catch_0
    move-exception v0

    .line 135
    move-object p0, v0

    .line 136
    move-object v6, p0

    .line 137
    goto :goto_3

    .line 138
    :cond_0
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    filled-new-array {v0, p0, v3}, [Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, Lcom/appsflyer/internal/AFc1hSDK;->AFKeystoreWrapper([Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-le v0, v6, :cond_1

    .line 163
    .line 164
    invoke-virtual {p0, v6, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_1
    :goto_1
    if-ge v0, v6, :cond_3

    .line 169
    .line 170
    sget v3, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    .line 171
    .line 172
    add-int/lit8 v3, v3, 0x49

    .line 173
    .line 174
    rem-int/lit16 v4, v3, 0x80

    .line 175
    .line 176
    sput v4, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    .line 177
    .line 178
    rem-int/lit8 v3, v3, 0x2

    .line 179
    .line 180
    if-nez v3, :cond_2

    .line 181
    .line 182
    add-int/lit8 v0, v0, 0x2d

    .line 183
    .line 184
    const/16 v3, 0x5c

    .line 185
    .line 186
    :try_start_2
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 191
    .line 192
    const/16 v3, 0x31

    .line 193
    .line 194
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_3
    :goto_2
    const-string v0, "/\u0007\u3648"

    .line 199
    .line 200
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    rsub-int/lit8 v3, v3, 0x3

    .line 205
    .line 206
    invoke-static {v2}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 207
    .line 208
    .line 209
    move-result-wide v4

    .line 210
    cmp-long v4, v4, v7

    .line 211
    .line 212
    add-int/lit8 v4, v4, 0x4c

    .line 213
    .line 214
    int-to-byte v4, v4

    .line 215
    new-array v5, v1, [Ljava/lang/Object;

    .line 216
    .line 217
    invoke-static {v0, v3, v4, v5}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    aget-object v0, v5, v2

    .line 221
    .line 222
    check-cast v0, Ljava/lang/String;

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {p0, v2, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 235
    return-object p0

    .line 236
    :goto_3
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 237
    .line 238
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 239
    .line 240
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 241
    .line 242
    .line 243
    move-result p0

    .line 244
    shr-int/lit8 p0, p0, 0x10

    .line 245
    .line 246
    add-int/lit8 p0, p0, 0x1e

    .line 247
    .line 248
    const-string v0, ""

    .line 249
    .line 250
    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    rsub-int/lit8 v5, v5, 0x6b

    .line 255
    .line 256
    int-to-byte v5, v5

    .line 257
    new-array v7, v1, [Ljava/lang/Object;

    .line 258
    .line 259
    const-string v8, "\u0013\n\u0002\u000e\u0001\u0013\u0013\u001a0!$/\u0013\u0007!+\u0013\n\n\r!/\u0001*\n\u00100+\u0013\u001a"

    .line 260
    .line 261
    invoke-static {v8, p0, v5, v7}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    aget-object p0, v7, v2

    .line 265
    .line 266
    check-cast p0, Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    const/4 v7, 0x0

    .line 273
    const/4 v8, 0x0

    .line 274
    invoke-virtual/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 275
    .line 276
    .line 277
    new-instance p0, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    rsub-int/lit8 v5, v5, 0x26

    .line 287
    .line 288
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    shr-int/lit8 v7, v7, 0x10

    .line 293
    .line 294
    rsub-int/lit8 v7, v7, 0x72

    .line 295
    .line 296
    int-to-byte v7, v7

    .line 297
    new-array v8, v1, [Ljava/lang/Object;

    .line 298
    .line 299
    const-string v9, "!)*\u000f\u0008!-\u0013\r\n\u0013!#\u0005,\u0008\u0013-/\u0007\u001a\u0005$0\u0003\u001c\u0005\u0013\n\u0006\r\u0013\u0001*\u0017\n-0"

    .line 300
    .line 301
    invoke-static {v9, v5, v7, v8}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    aget-object v5, v8, v2

    .line 305
    .line 306
    check-cast v5, Ljava/lang/String;

    .line 307
    .line 308
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v5

    .line 312
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    invoke-virtual {v3, v4, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    const/16 p0, 0x30

    .line 326
    .line 327
    invoke-static {v0, p0, v2, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 328
    .line 329
    .line 330
    move-result p0

    .line 331
    rsub-int/lit8 p0, p0, 0x6

    .line 332
    .line 333
    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    rsub-int/lit8 v0, v0, 0x17

    .line 338
    .line 339
    int-to-byte v0, v0

    .line 340
    new-array v1, v1, [Ljava/lang/Object;

    .line 341
    .line 342
    const-string v3, "/\u0007\u001e\u0006\u35ba\u35ba\u35ba"

    .line 343
    .line 344
    invoke-static {v3, p0, v0, v1}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    aget-object p0, v1, v2

    .line 348
    .line 349
    check-cast p0, Ljava/lang/String;

    .line 350
    .line 351
    invoke-virtual {p0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    return-object p0
.end method

.method private static a(Ljava/lang/String;IB[Ljava/lang/Object;)V
    .locals 12

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget v0, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x39

    .line 6
    .line 7
    rem-int/lit16 v0, v0, 0x80

    .line 8
    .line 9
    sput v0, Lcom/appsflyer/internal/AFc1hSDK;->$10:I

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    check-cast p0, [C

    .line 16
    .line 17
    new-instance v0, Lcom/appsflyer/internal/AFk1sSDK;

    .line 18
    .line 19
    invoke-direct {v0}, Lcom/appsflyer/internal/AFk1sSDK;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v1, Lcom/appsflyer/internal/AFc1hSDK;->unregisterClient:[C

    .line 23
    .line 24
    const-wide v2, -0x36e1765fc3cd03f5L    # -1.7025281608142096E44

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    sget v5, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    .line 33
    .line 34
    add-int/lit8 v5, v5, 0x6f

    .line 35
    .line 36
    rem-int/lit16 v5, v5, 0x80

    .line 37
    .line 38
    sput v5, Lcom/appsflyer/internal/AFc1hSDK;->$10:I

    .line 39
    .line 40
    array-length v5, v1

    .line 41
    new-array v6, v5, [C

    .line 42
    .line 43
    move v7, v4

    .line 44
    :goto_0
    if-ge v7, v5, :cond_1

    .line 45
    .line 46
    aget-char v8, v1, v7

    .line 47
    .line 48
    int-to-long v8, v8

    .line 49
    xor-long/2addr v8, v2

    .line 50
    long-to-int v8, v8

    .line 51
    int-to-char v8, v8

    .line 52
    aput-char v8, v6, v7

    .line 53
    .line 54
    add-int/lit8 v7, v7, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    sget v1, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    .line 58
    .line 59
    add-int/lit8 v1, v1, 0x35

    .line 60
    .line 61
    rem-int/lit16 v1, v1, 0x80

    .line 62
    .line 63
    sput v1, Lcom/appsflyer/internal/AFc1hSDK;->$10:I

    .line 64
    .line 65
    move-object v1, v6

    .line 66
    :cond_2
    sget-char v5, Lcom/appsflyer/internal/AFc1hSDK;->AFKeystoreWrapper:C

    .line 67
    .line 68
    int-to-long v5, v5

    .line 69
    xor-long/2addr v2, v5

    .line 70
    long-to-int v2, v2

    .line 71
    int-to-char v2, v2

    .line 72
    new-array v3, p1, [C

    .line 73
    .line 74
    rem-int/lit8 v5, p1, 0x2

    .line 75
    .line 76
    if-eqz v5, :cond_3

    .line 77
    .line 78
    add-int/lit8 v5, p1, -0x1

    .line 79
    .line 80
    aget-char v6, p0, v5

    .line 81
    .line 82
    sub-int/2addr v6, p2

    .line 83
    int-to-char v6, v6

    .line 84
    aput-char v6, v3, v5

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move v5, p1

    .line 88
    :goto_1
    const/4 v6, 0x1

    .line 89
    if-le v5, v6, :cond_7

    .line 90
    .line 91
    iput v4, v0, Lcom/appsflyer/internal/AFk1sSDK;->AFLogger:I

    .line 92
    .line 93
    :goto_2
    iget v7, v0, Lcom/appsflyer/internal/AFk1sSDK;->AFLogger:I

    .line 94
    .line 95
    if-ge v7, v5, :cond_7

    .line 96
    .line 97
    sget v8, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    .line 98
    .line 99
    add-int/lit8 v8, v8, 0x7

    .line 100
    .line 101
    rem-int/lit16 v8, v8, 0x80

    .line 102
    .line 103
    sput v8, Lcom/appsflyer/internal/AFc1hSDK;->$10:I

    .line 104
    .line 105
    aget-char v9, p0, v7

    .line 106
    .line 107
    iput-char v9, v0, Lcom/appsflyer/internal/AFk1sSDK;->d:C

    .line 108
    .line 109
    add-int/lit8 v10, v7, 0x1

    .line 110
    .line 111
    aget-char v10, p0, v10

    .line 112
    .line 113
    iput-char v10, v0, Lcom/appsflyer/internal/AFk1sSDK;->AFKeystoreWrapper:C

    .line 114
    .line 115
    if-ne v9, v10, :cond_4

    .line 116
    .line 117
    sub-int/2addr v9, p2

    .line 118
    int-to-char v9, v9

    .line 119
    aput-char v9, v3, v7

    .line 120
    .line 121
    add-int/lit8 v9, v7, 0x1

    .line 122
    .line 123
    sub-int/2addr v10, p2

    .line 124
    int-to-char v10, v10

    .line 125
    aput-char v10, v3, v9

    .line 126
    .line 127
    add-int/lit8 v8, v8, 0x57

    .line 128
    .line 129
    rem-int/lit16 v8, v8, 0x80

    .line 130
    .line 131
    sput v8, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_4
    div-int v8, v9, v2

    .line 135
    .line 136
    iput v8, v0, Lcom/appsflyer/internal/AFk1sSDK;->unregisterClient:I

    .line 137
    .line 138
    rem-int/2addr v9, v2

    .line 139
    iput v9, v0, Lcom/appsflyer/internal/AFk1sSDK;->e:I

    .line 140
    .line 141
    div-int v11, v10, v2

    .line 142
    .line 143
    iput v11, v0, Lcom/appsflyer/internal/AFk1sSDK;->registerClient:I

    .line 144
    .line 145
    rem-int/2addr v10, v2

    .line 146
    iput v10, v0, Lcom/appsflyer/internal/AFk1sSDK;->w:I

    .line 147
    .line 148
    if-ne v9, v10, :cond_5

    .line 149
    .line 150
    add-int/2addr v8, v2

    .line 151
    sub-int/2addr v8, v6

    .line 152
    rem-int/2addr v8, v2

    .line 153
    iput v8, v0, Lcom/appsflyer/internal/AFk1sSDK;->unregisterClient:I

    .line 154
    .line 155
    add-int/2addr v11, v2

    .line 156
    sub-int/2addr v11, v6

    .line 157
    rem-int/2addr v11, v2

    .line 158
    iput v11, v0, Lcom/appsflyer/internal/AFk1sSDK;->registerClient:I

    .line 159
    .line 160
    mul-int/2addr v8, v2

    .line 161
    add-int/2addr v8, v9

    .line 162
    mul-int/2addr v11, v2

    .line 163
    add-int/2addr v11, v10

    .line 164
    aget-char v8, v1, v8

    .line 165
    .line 166
    aput-char v8, v3, v7

    .line 167
    .line 168
    add-int/lit8 v8, v7, 0x1

    .line 169
    .line 170
    aget-char v9, v1, v11

    .line 171
    .line 172
    aput-char v9, v3, v8

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_5
    if-ne v8, v11, :cond_6

    .line 176
    .line 177
    add-int/2addr v9, v2

    .line 178
    sub-int/2addr v9, v6

    .line 179
    rem-int/2addr v9, v2

    .line 180
    iput v9, v0, Lcom/appsflyer/internal/AFk1sSDK;->e:I

    .line 181
    .line 182
    add-int/2addr v10, v2

    .line 183
    sub-int/2addr v10, v6

    .line 184
    rem-int/2addr v10, v2

    .line 185
    iput v10, v0, Lcom/appsflyer/internal/AFk1sSDK;->w:I

    .line 186
    .line 187
    mul-int/2addr v8, v2

    .line 188
    add-int/2addr v8, v9

    .line 189
    mul-int/2addr v11, v2

    .line 190
    add-int/2addr v11, v10

    .line 191
    aget-char v8, v1, v8

    .line 192
    .line 193
    aput-char v8, v3, v7

    .line 194
    .line 195
    add-int/lit8 v8, v7, 0x1

    .line 196
    .line 197
    aget-char v9, v1, v11

    .line 198
    .line 199
    aput-char v9, v3, v8

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_6
    mul-int/2addr v8, v2

    .line 203
    add-int/2addr v8, v10

    .line 204
    mul-int/2addr v11, v2

    .line 205
    add-int/2addr v11, v9

    .line 206
    aget-char v8, v1, v8

    .line 207
    .line 208
    aput-char v8, v3, v7

    .line 209
    .line 210
    add-int/lit8 v8, v7, 0x1

    .line 211
    .line 212
    aget-char v9, v1, v11

    .line 213
    .line 214
    aput-char v9, v3, v8

    .line 215
    .line 216
    :goto_3
    add-int/lit8 v7, v7, 0x2

    .line 217
    .line 218
    iput v7, v0, Lcom/appsflyer/internal/AFk1sSDK;->AFLogger:I

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_7
    move p0, v4

    .line 222
    :goto_4
    if-ge p0, p1, :cond_8

    .line 223
    .line 224
    aget-char p2, v3, p0

    .line 225
    .line 226
    xor-int/lit16 p2, p2, 0x359a

    .line 227
    .line 228
    int-to-char p2, p2

    .line 229
    aput-char p2, v3, p0

    .line 230
    .line 231
    add-int/lit8 p0, p0, 0x1

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_8
    new-instance p0, Ljava/lang/String;

    .line 235
    .line 236
    invoke-direct {p0, v3}, Ljava/lang/String;-><init>([C)V

    .line 237
    .line 238
    .line 239
    aput-object p0, p3, v4

    .line 240
    .line 241
    return-void
.end method

.method private static b(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 17

    .line 1
    const/4 v0, 0x2

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    sget v1, Lcom/appsflyer/internal/AFc1hSDK;->$10:I

    .line 5
    .line 6
    add-int/lit8 v1, v1, 0x27

    .line 7
    .line 8
    rem-int/lit16 v2, v1, 0x80

    .line 9
    .line 10
    sput v2, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    .line 11
    .line 12
    rem-int/2addr v1, v0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toCharArray()[C

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toCharArray()[C

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    throw v0

    .line 25
    :cond_1
    move-object/from16 v1, p0

    .line 26
    .line 27
    :goto_0
    check-cast v1, [C

    .line 28
    .line 29
    new-instance v2, Lcom/appsflyer/internal/AFk1uSDK;

    .line 30
    .line 31
    invoke-direct {v2}, Lcom/appsflyer/internal/AFk1uSDK;-><init>()V

    .line 32
    .line 33
    .line 34
    array-length v3, v1

    .line 35
    new-array v3, v3, [C

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    iput v4, v2, Lcom/appsflyer/internal/AFk1uSDK;->AFKeystoreWrapper:I

    .line 39
    .line 40
    new-array v5, v0, [C

    .line 41
    .line 42
    :goto_1
    iget v6, v2, Lcom/appsflyer/internal/AFk1uSDK;->AFKeystoreWrapper:I

    .line 43
    .line 44
    array-length v7, v1

    .line 45
    if-ge v6, v7, :cond_3

    .line 46
    .line 47
    aget-char v7, v1, v6

    .line 48
    .line 49
    aput-char v7, v5, v4

    .line 50
    .line 51
    add-int/lit8 v6, v6, 0x1

    .line 52
    .line 53
    aget-char v6, v1, v6

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    aput-char v6, v5, v7

    .line 57
    .line 58
    const v6, 0xe370

    .line 59
    .line 60
    .line 61
    move v8, v4

    .line 62
    :goto_2
    const/16 v9, 0x10

    .line 63
    .line 64
    if-ge v8, v9, :cond_2

    .line 65
    .line 66
    aget-char v9, v5, v7

    .line 67
    .line 68
    aget-char v10, v5, v4

    .line 69
    .line 70
    add-int v11, v10, v6

    .line 71
    .line 72
    shl-int/lit8 v12, v10, 0x4

    .line 73
    .line 74
    sget-char v13, Lcom/appsflyer/internal/AFc1hSDK;->i:C

    .line 75
    .line 76
    int-to-long v13, v13

    .line 77
    const-wide v15, -0x6fededfe9eddb959L    # -2.909842667540399E-231

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    xor-long/2addr v13, v15

    .line 83
    long-to-int v13, v13

    .line 84
    int-to-char v13, v13

    .line 85
    add-int/2addr v12, v13

    .line 86
    xor-int/2addr v11, v12

    .line 87
    ushr-int/lit8 v12, v10, 0x5

    .line 88
    .line 89
    sget-char v13, Lcom/appsflyer/internal/AFc1hSDK;->w:C

    .line 90
    .line 91
    int-to-long v13, v13

    .line 92
    xor-long/2addr v13, v15

    .line 93
    long-to-int v13, v13

    .line 94
    int-to-char v13, v13

    .line 95
    add-int/2addr v12, v13

    .line 96
    xor-int/2addr v11, v12

    .line 97
    sub-int/2addr v9, v11

    .line 98
    int-to-char v9, v9

    .line 99
    aput-char v9, v5, v7

    .line 100
    .line 101
    add-int v11, v9, v6

    .line 102
    .line 103
    shl-int/lit8 v12, v9, 0x4

    .line 104
    .line 105
    sget-char v13, Lcom/appsflyer/internal/AFc1hSDK;->registerClient:C

    .line 106
    .line 107
    int-to-long v13, v13

    .line 108
    xor-long/2addr v13, v15

    .line 109
    long-to-int v13, v13

    .line 110
    int-to-char v13, v13

    .line 111
    add-int/2addr v12, v13

    .line 112
    xor-int/2addr v11, v12

    .line 113
    ushr-int/lit8 v9, v9, 0x5

    .line 114
    .line 115
    sget-char v12, Lcom/appsflyer/internal/AFc1hSDK;->force:C

    .line 116
    .line 117
    int-to-long v12, v12

    .line 118
    xor-long/2addr v12, v15

    .line 119
    long-to-int v12, v12

    .line 120
    int-to-char v12, v12

    .line 121
    add-int/2addr v9, v12

    .line 122
    xor-int/2addr v9, v11

    .line 123
    sub-int/2addr v10, v9

    .line 124
    int-to-char v9, v10

    .line 125
    aput-char v9, v5, v4

    .line 126
    .line 127
    const v9, 0x9e37

    .line 128
    .line 129
    .line 130
    sub-int/2addr v6, v9

    .line 131
    add-int/lit8 v8, v8, 0x1

    .line 132
    .line 133
    sget v9, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    .line 134
    .line 135
    add-int/lit8 v9, v9, 0x5d

    .line 136
    .line 137
    rem-int/lit16 v9, v9, 0x80

    .line 138
    .line 139
    sput v9, Lcom/appsflyer/internal/AFc1hSDK;->$10:I

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_2
    iget v6, v2, Lcom/appsflyer/internal/AFk1uSDK;->AFKeystoreWrapper:I

    .line 143
    .line 144
    aget-char v8, v5, v4

    .line 145
    .line 146
    aput-char v8, v3, v6

    .line 147
    .line 148
    add-int/lit8 v8, v6, 0x1

    .line 149
    .line 150
    aget-char v7, v5, v7

    .line 151
    .line 152
    aput-char v7, v3, v8

    .line 153
    .line 154
    add-int/2addr v6, v0

    .line 155
    iput v6, v2, Lcom/appsflyer/internal/AFk1uSDK;->AFKeystoreWrapper:I

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_3
    new-instance v0, Ljava/lang/String;

    .line 159
    .line 160
    move/from16 v1, p1

    .line 161
    .line 162
    invoke-direct {v0, v3, v4, v1}, Ljava/lang/String;-><init>([CII)V

    .line 163
    .line 164
    .line 165
    aput-object v0, p2, v4

    .line 166
    .line 167
    return-void
.end method

.method public static registerClient()V
    .locals 1

    .line 1
    const/16 v0, 0x31

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/appsflyer/internal/AFc1hSDK;->unregisterClient:[C

    .line 9
    .line 10
    const v0, 0xfc0c

    .line 11
    .line 12
    .line 13
    sput-char v0, Lcom/appsflyer/internal/AFc1hSDK;->AFKeystoreWrapper:C

    .line 14
    .line 15
    const/16 v0, 0x4dd4

    .line 16
    .line 17
    sput-char v0, Lcom/appsflyer/internal/AFc1hSDK;->registerClient:C

    .line 18
    .line 19
    const v0, 0xf767

    .line 20
    .line 21
    .line 22
    sput-char v0, Lcom/appsflyer/internal/AFc1hSDK;->force:C

    .line 23
    .line 24
    const v0, 0xa8d5

    .line 25
    .line 26
    .line 27
    sput-char v0, Lcom/appsflyer/internal/AFc1hSDK;->i:C

    .line 28
    .line 29
    const v0, 0xa297

    .line 30
    .line 31
    .line 32
    sput-char v0, Lcom/appsflyer/internal/AFc1hSDK;->w:C

    .line 33
    .line 34
    return-void

    .line 35
    :array_0
    .array-data 2
        -0x361bs
        -0x3657s
        -0x3658s
        -0x360es
        -0x3645s
        -0x365ds
        -0x361cs
        -0x3649s
        -0x3660s
        -0x3601s
        -0x365cs
        -0x361es
        -0x360cs
        -0x3617s
        -0x3603s
        -0x3626s
        -0x3639s
        -0x360as
        -0x3644s
        -0x3618s
        -0x361fs
        -0x35f5s
        -0x362ds
        -0x360ds
        -0x3602s
        -0x362bs
        -0x361ds
        -0x3630s
        -0x365bs
        -0x360bs
        -0x3621s
        -0x3607s
        -0x3605s
        -0x3620s
        -0x3609s
        -0x363ds
        -0x3604s
        -0x360fs
        -0x3632s
        -0x365fs
        -0x3610s
        -0x361as
        -0x3606s
        -0x3608s
        -0x3655s
        -0x3622s
        -0x3619s
        -0x364fs
        -0x3641s
    .end array-data
.end method
