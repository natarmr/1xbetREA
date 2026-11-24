.class public final Lcom/appsflyer/internal/AFg1tSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFf1aSDK;


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AFLoggerLogLevel:I = -0x6899909c

.field private static AppsFlyerLib:I = 0x0

.field private static afDebugLog:[B = null

.field private static afErrorLog:I = -0x7e519483

.field private static afInfoLog:I = -0x37610d92

.field private static afWarnLog:[S = null

.field private static getLevel:I = 0x1


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

.field private final AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

.field private final d:Lcom/appsflyer/internal/AFa1aSDK;

.field private final e:Lcom/appsflyer/internal/AFf1fSDK;

.field private final force:Ljava/util/concurrent/ScheduledExecutorService;

.field private final i:Lcom/appsflyer/internal/AFg1rSDK;

.field private final registerClient:Lcom/appsflyer/internal/AFc1eSDK;

.field private final unregisterClient:Lcom/appsflyer/internal/AFi1aSDK;

.field private final v:Lcom/appsflyer/AppsFlyerProperties;

.field private final w:Lcom/appsflyer/internal/AFd1zSDK;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/appsflyer/internal/AFg1tSDK;->afDebugLog:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x72t
        0x7dt
        -0x64t
        0x70t
        0x7ft
        -0x77t
        0x75t
        -0x7ct
        0x64t
        -0x78t
        0x74t
        0x71t
    .end array-data
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFa1aSDK;Lcom/appsflyer/internal/AFi1aSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1eSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFg1rSDK;Lcom/appsflyer/internal/AFf1fSDK;Lcom/appsflyer/AppsFlyerProperties;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/appsflyer/internal/AFg1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/appsflyer/internal/AFg1tSDK;->d:Lcom/appsflyer/internal/AFa1aSDK;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/appsflyer/internal/AFg1tSDK;->unregisterClient:Lcom/appsflyer/internal/AFi1aSDK;

    .line 39
    .line 40
    iput-object p4, p0, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 43
    .line 44
    iput-object p6, p0, Lcom/appsflyer/internal/AFg1tSDK;->w:Lcom/appsflyer/internal/AFd1zSDK;

    .line 45
    .line 46
    iput-object p7, p0, Lcom/appsflyer/internal/AFg1tSDK;->i:Lcom/appsflyer/internal/AFg1rSDK;

    .line 47
    .line 48
    iput-object p8, p0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    .line 49
    .line 50
    iput-object p9, p0, Lcom/appsflyer/internal/AFg1tSDK;->v:Lcom/appsflyer/AppsFlyerProperties;

    .line 51
    .line 52
    iput-object p10, p0, Lcom/appsflyer/internal/AFg1tSDK;->force:Ljava/util/concurrent/ScheduledExecutorService;

    .line 53
    .line 54
    return-void
.end method

.method private AFKeystoreWrapper()Z
    .locals 12

    .line 1
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-wide v0, v1, Lcom/appsflyer/internal/AFc1eSDK;->getInstance:J

    .line 16
    .line 17
    const-wide/16 v2, 0x1

    .line 18
    .line 19
    cmp-long v0, v0, v2

    .line 20
    .line 21
    if-lez v0, :cond_3

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-wide v0, v1, Lcom/appsflyer/internal/AFc1eSDK;->getInstance:J

    .line 25
    .line 26
    const-wide/16 v2, 0x0

    .line 27
    .line 28
    cmp-long v0, v0, v2

    .line 29
    .line 30
    if-lez v0, :cond_3

    .line 31
    .line 32
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iget-object v2, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 37
    .line 38
    iget-wide v2, v2, Lcom/appsflyer/internal/AFc1eSDK;->getInstance:J

    .line 39
    .line 40
    sub-long/2addr v0, v2

    .line 41
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 42
    .line 43
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 44
    .line 45
    const-string v4, "yyyy/MM/dd HH:mm:ss.SSS Z"

    .line 46
    .line 47
    invoke-direct {v2, v4, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 48
    .line 49
    .line 50
    iget-object v4, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 51
    .line 52
    iget-wide v4, v4, Lcom/appsflyer/internal/AFc1eSDK;->getInstance:J

    .line 53
    .line 54
    const-string v6, "UTC"

    .line 55
    .line 56
    invoke-static {v6}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-virtual {v2, v7}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 61
    .line 62
    .line 63
    new-instance v7, Ljava/util/Date;

    .line 64
    .line 65
    invoke-direct {v7, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v7}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iget-object v5, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 73
    .line 74
    iget-wide v7, v5, Lcom/appsflyer/internal/AFc1eSDK;->onPause:J

    .line 75
    .line 76
    invoke-static {v6}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v2, v5}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 81
    .line 82
    .line 83
    new-instance v5, Ljava/util/Date;

    .line 84
    .line 85
    invoke-direct {v5, v7, v8}, Ljava/util/Date;-><init>(J)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iget-object v5, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 93
    .line 94
    iget-wide v5, v5, Lcom/appsflyer/internal/AFc1eSDK;->setDebugLog:J

    .line 95
    .line 96
    cmp-long v5, v0, v5

    .line 97
    .line 98
    if-gez v5, :cond_2

    .line 99
    .line 100
    sget v5, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 101
    .line 102
    add-int/lit8 v5, v5, 0x53

    .line 103
    .line 104
    rem-int/lit16 v6, v5, 0x80

    .line 105
    .line 106
    sput v6, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 107
    .line 108
    rem-int/lit8 v5, v5, 0x2

    .line 109
    .line 110
    iget-object v6, p0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    .line 111
    .line 112
    if-nez v5, :cond_1

    .line 113
    .line 114
    invoke-virtual {v6}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-nez v5, :cond_2

    .line 119
    .line 120
    sget-object v6, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 121
    .line 122
    sget-object v7, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 123
    .line 124
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 129
    .line 130
    iget-wide v8, p0, Lcom/appsflyer/internal/AFc1eSDK;->setDebugLog:J

    .line 131
    .line 132
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    filled-new-array {v4, v2, v0, p0}, [Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    const/4 v0, 0x4

    .line 141
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    const-string v0, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms"

    .line 146
    .line 147
    invoke-static {v3, v0, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    const/4 v10, 0x4

    .line 152
    const/4 v11, 0x0

    .line 153
    const/4 v9, 0x0

    .line 154
    invoke-static/range {v6 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    const/4 p0, 0x1

    .line 158
    return p0

    .line 159
    :cond_1
    invoke-virtual {v6}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    .line 160
    .line 161
    .line 162
    const/4 p0, 0x0

    .line 163
    throw p0

    .line 164
    :cond_2
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    .line 165
    .line 166
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    if-nez p0, :cond_4

    .line 171
    .line 172
    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 173
    .line 174
    add-int/lit8 p0, p0, 0x3b

    .line 175
    .line 176
    rem-int/lit16 p0, p0, 0x80

    .line 177
    .line 178
    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 179
    .line 180
    sget-object v5, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 181
    .line 182
    sget-object v6, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 183
    .line 184
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    filled-new-array {v4, v2, p0}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    const/4 v0, 0x3

    .line 193
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    const-string v0, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)"

    .line 198
    .line 199
    invoke-static {v3, v0, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    const/4 v9, 0x4

    .line 204
    const/4 v10, 0x0

    .line 205
    const/4 v8, 0x0

    .line 206
    invoke-static/range {v5 .. v10}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 210
    .line 211
    add-int/lit8 p0, p0, 0xd

    .line 212
    .line 213
    rem-int/lit16 p0, p0, 0x80

    .line 214
    .line 215
    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_3
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    .line 219
    .line 220
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    .line 221
    .line 222
    .line 223
    move-result p0

    .line 224
    if-nez p0, :cond_4

    .line 225
    .line 226
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 227
    .line 228
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 229
    .line 230
    const/4 v4, 0x4

    .line 231
    const/4 v5, 0x0

    .line 232
    const-string v2, "Sending first launch for this session!"

    .line 233
    .line 234
    const/4 v3, 0x0

    .line 235
    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 239
    return p0
.end method

.method private AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1pSDK;)Z
    .locals 10

    .line 240
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFh1pSDK;->AFLogger()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 242
    :cond_0
    iget-object v0, p1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    if-nez v0, :cond_5

    .line 243
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x3d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 244
    iget-object v2, p1, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    if-nez v2, :cond_5

    add-int/lit8 v0, v0, 0x63

    .line 245
    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 246
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    const-string v2, "AF_LAUNCH_PROTECT_ENABLED"

    .line 247
    invoke-virtual {v0, v2}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 248
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    if-eqz v0, :cond_3

    .line 249
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1tSDK;->AFKeystoreWrapper()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 250
    iget-object p0, p1, Lcom/appsflyer/internal/AFh1pSDK;->AFLogger:Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;

    if-eqz p0, :cond_2

    const/16 p1, 0xa

    .line 251
    const-string v0, "Event timeout. Check \'minTimeBetweenSessions\' param"

    invoke-interface {p0, p1, v0}, Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;->onError(ILjava/lang/String;)V

    .line 252
    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x27

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    :cond_2
    return v2

    .line 253
    :cond_3
    iget-object p1, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 254
    iget-wide v2, p1, Lcom/appsflyer/internal/AFc1eSDK;->setDebugLog:J

    const-wide/16 v4, 0x3e8

    .line 255
    div-long/2addr v2, v4

    .line 256
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 257
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->SDK_LIFECYCLE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 258
    const-string p1, "Allowing multiple launches within a "

    const-string v0, " second time window."

    .line 259
    invoke-static {v2, v3, p1, v0}, La/axq;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    .line 260
    invoke-static/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 261
    :cond_4
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 262
    iput-wide v2, p0, Lcom/appsflyer/internal/AFc1eSDK;->getInstance:J

    :cond_5
    return v1
.end method

.method public static synthetic AFLogger([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 0

    .line 200
    invoke-static {p0}, Lcom/appsflyer/internal/AFg1tSDK;->registerClient([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final AFLogger(Lcom/appsflyer/internal/AFg1tSDK;Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/Context;)V
    .locals 2

    .line 201
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x6b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    rem-int/lit8 v0, v0, 0x2

    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFg1tSDK;->d(Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/Context;)V

    if-eqz v0, :cond_0

    const/16 p0, 0x1c

    div-int/lit8 p0, p0, 0x0

    :cond_0
    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x45

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    return-void
.end method

.method private AFLogger(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v2, Lcom/appsflyer/internal/AFa1pSDK;

    .line 9
    .line 10
    iget-object v3, v0, Lcom/appsflyer/internal/AFg1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1bSDK;

    .line 11
    .line 12
    iget-object v4, v0, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    .line 13
    .line 14
    iget-object v4, v4, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 15
    .line 16
    const-string v5, "appsFlyerCount"

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    invoke-interface {v4, v5, v6}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {v1, v4}, Lcom/appsflyer/internal/AFh1pSDK;->unregisterClient(I)Lcom/appsflyer/internal/AFh1pSDK;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v5, v0, Lcom/appsflyer/internal/AFg1tSDK;->d:Lcom/appsflyer/internal/AFa1aSDK;

    .line 31
    .line 32
    invoke-interface {v5}, Lcom/appsflyer/internal/AFa1aSDK;->d()Ljava/util/Map;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-direct {v2, v3, v4, v5}, Lcom/appsflyer/internal/AFa1pSDK;-><init>(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFh1pSDK;Ljava/util/Map;)V

    .line 37
    .line 38
    .line 39
    iget-object v3, v1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 40
    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    if-nez v3, :cond_5

    .line 44
    .line 45
    iget-object v1, v1, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    .line 46
    .line 47
    if-nez v1, :cond_5

    .line 48
    .line 49
    iget-object v1, v0, Lcom/appsflyer/internal/AFg1tSDK;->unregisterClient:Lcom/appsflyer/internal/AFi1aSDK;

    .line 50
    .line 51
    iget-object v1, v1, Lcom/appsflyer/internal/AFi1aSDK;->unregisterClient:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 52
    .line 53
    new-array v3, v6, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 54
    .line 55
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, [Lcom/appsflyer/sdk_base/referrer/Referrer;

    .line 60
    .line 61
    array-length v3, v1

    .line 62
    :goto_0
    const-wide/16 v7, 0x1f4

    .line 63
    .line 64
    if-ge v6, v3, :cond_1

    .line 65
    .line 66
    sget v9, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 67
    .line 68
    add-int/lit8 v9, v9, 0x71

    .line 69
    .line 70
    rem-int/lit16 v9, v9, 0x80

    .line 71
    .line 72
    sput v9, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 73
    .line 74
    aget-object v9, v1, v6

    .line 75
    .line 76
    invoke-virtual {v9}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getState()Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    sget-object v11, Lcom/appsflyer/sdk_base/referrer/Referrer$State;->STARTED:Lcom/appsflyer/sdk_base/referrer/Referrer$State;

    .line 81
    .line 82
    if-ne v10, v11, :cond_0

    .line 83
    .line 84
    sget v4, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 85
    .line 86
    add-int/lit8 v4, v4, 0x5f

    .line 87
    .line 88
    rem-int/lit16 v4, v4, 0x80

    .line 89
    .line 90
    sput v4, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 91
    .line 92
    sget-object v10, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 93
    .line 94
    sget-object v11, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 95
    .line 96
    invoke-virtual {v9}, Lcom/appsflyer/sdk_base/referrer/Referrer;->getSource()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    const-string v5, "Failed to get "

    .line 101
    .line 102
    const-string v9, " referrer, wait ..."

    .line 103
    .line 104
    invoke-static {v5, v4, v9}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    const/4 v14, 0x4

    .line 109
    const/4 v15, 0x0

    .line 110
    const/4 v13, 0x0

    .line 111
    invoke-static/range {v10 .. v15}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    move-wide v4, v7

    .line 115
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_1
    iget-object v1, v0, Lcom/appsflyer/internal/AFg1tSDK;->d:Lcom/appsflyer/internal/AFa1aSDK;

    .line 119
    .line 120
    invoke-interface {v1}, Lcom/appsflyer/internal/AFa1aSDK;->registerClient()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_3

    .line 125
    .line 126
    sget v1, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 127
    .line 128
    add-int/lit8 v1, v1, 0xf

    .line 129
    .line 130
    rem-int/lit16 v3, v1, 0x80

    .line 131
    .line 132
    sput v3, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 133
    .line 134
    rem-int/lit8 v1, v1, 0x2

    .line 135
    .line 136
    if-eqz v1, :cond_2

    .line 137
    .line 138
    sget-object v9, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 139
    .line 140
    sget-object v10, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 141
    .line 142
    const/4 v13, 0x4

    .line 143
    const/4 v14, 0x0

    .line 144
    const-string v11, "fetching Facebook deferred AppLink data, wait ..."

    .line 145
    .line 146
    const/4 v12, 0x1

    .line 147
    invoke-static/range {v9 .. v14}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :goto_1
    move-wide v4, v7

    .line 151
    goto :goto_2

    .line 152
    :cond_2
    sget-object v15, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 153
    .line 154
    sget-object v16, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 155
    .line 156
    const/16 v19, 0x4

    .line 157
    .line 158
    const/16 v20, 0x0

    .line 159
    .line 160
    const-string v17, "fetching Facebook deferred AppLink data, wait ..."

    .line 161
    .line 162
    const/16 v18, 0x0

    .line 163
    .line 164
    invoke-static/range {v15 .. v20}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_3
    :goto_2
    iget-object v1, v0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    .line 169
    .line 170
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFf1fSDK;->d()Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_5

    .line 175
    .line 176
    sget v1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 177
    .line 178
    add-int/lit8 v1, v1, 0x5

    .line 179
    .line 180
    rem-int/lit16 v3, v1, 0x80

    .line 181
    .line 182
    sput v3, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 183
    .line 184
    rem-int/lit8 v1, v1, 0x2

    .line 185
    .line 186
    if-eqz v1, :cond_4

    .line 187
    .line 188
    move-wide v4, v7

    .line 189
    goto :goto_3

    .line 190
    :cond_4
    const/4 v0, 0x0

    .line 191
    throw v0

    .line 192
    :cond_5
    :goto_3
    iget-object v0, v0, Lcom/appsflyer/internal/AFg1tSDK;->force:Ljava/util/concurrent/ScheduledExecutorService;

    .line 193
    .line 194
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 195
    .line 196
    invoke-static {v0, v2, v4, v5, v1}, Lcom/appsflyer/internal/AFj1iSDK;->AFLogger(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V

    .line 197
    .line 198
    .line 199
    return-void
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
    sget v2, Lcom/appsflyer/internal/AFg1tSDK;->afErrorLog:I

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
    sget v2, Lcom/appsflyer/internal/AFg1tSDK;->$10:I

    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x15

    .line 30
    .line 31
    rem-int/lit16 v2, v2, 0x80

    .line 32
    .line 33
    sput v2, Lcom/appsflyer/internal/AFg1tSDK;->$11:I

    .line 34
    .line 35
    move v2, v6

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget v2, Lcom/appsflyer/internal/AFg1tSDK;->$11:I

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x17

    .line 40
    .line 41
    rem-int/lit16 v2, v2, 0x80

    .line 42
    .line 43
    sput v2, Lcom/appsflyer/internal/AFg1tSDK;->$10:I

    .line 44
    .line 45
    move v2, v3

    .line 46
    :goto_0
    if-eqz v2, :cond_5

    .line 47
    .line 48
    sget-object p0, Lcom/appsflyer/internal/AFg1tSDK;->afDebugLog:[B

    .line 49
    .line 50
    if-eqz p0, :cond_3

    .line 51
    .line 52
    array-length v7, p0

    .line 53
    new-array v8, v7, [B

    .line 54
    .line 55
    move v9, v3

    .line 56
    :goto_1
    if-ge v9, v7, :cond_2

    .line 57
    .line 58
    sget v10, Lcom/appsflyer/internal/AFg1tSDK;->$11:I

    .line 59
    .line 60
    add-int/lit8 v10, v10, 0x5d

    .line 61
    .line 62
    rem-int/lit16 v11, v10, 0x80

    .line 63
    .line 64
    sput v11, Lcom/appsflyer/internal/AFg1tSDK;->$10:I

    .line 65
    .line 66
    rem-int/lit8 v10, v10, 0x2

    .line 67
    .line 68
    if-eqz v10, :cond_1

    .line 69
    .line 70
    aget-byte v10, p0, v9

    .line 71
    .line 72
    int-to-long v10, v10

    .line 73
    mul-long/2addr v10, v4

    .line 74
    long-to-int v10, v10

    .line 75
    int-to-byte v10, v10

    .line 76
    aput-byte v10, v8, v9

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    aget-byte v10, p0, v9

    .line 80
    .line 81
    int-to-long v10, v10

    .line 82
    xor-long/2addr v10, v4

    .line 83
    long-to-int v10, v10

    .line 84
    int-to-byte v10, v10

    .line 85
    aput-byte v10, v8, v9

    .line 86
    .line 87
    add-int/lit8 v9, v9, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    move-object p0, v8

    .line 91
    :cond_3
    if-eqz p0, :cond_4

    .line 92
    .line 93
    sget-object p0, Lcom/appsflyer/internal/AFg1tSDK;->afDebugLog:[B

    .line 94
    .line 95
    sget v7, Lcom/appsflyer/internal/AFg1tSDK;->afInfoLog:I

    .line 96
    .line 97
    int-to-long v7, v7

    .line 98
    xor-long/2addr v7, v4

    .line 99
    long-to-int v7, v7

    .line 100
    add-int v7, p4, v7

    .line 101
    .line 102
    aget-byte p0, p0, v7

    .line 103
    .line 104
    int-to-long v7, p0

    .line 105
    xor-long/2addr v7, v4

    .line 106
    long-to-int p0, v7

    .line 107
    int-to-byte p0, p0

    .line 108
    sget v7, Lcom/appsflyer/internal/AFg1tSDK;->afErrorLog:I

    .line 109
    .line 110
    int-to-long v7, v7

    .line 111
    xor-long/2addr v7, v4

    .line 112
    long-to-int v7, v7

    .line 113
    add-int/2addr p0, v7

    .line 114
    int-to-byte p0, p0

    .line 115
    goto :goto_2

    .line 116
    :cond_4
    sget-object p0, Lcom/appsflyer/internal/AFg1tSDK;->afWarnLog:[S

    .line 117
    .line 118
    sget v7, Lcom/appsflyer/internal/AFg1tSDK;->afInfoLog:I

    .line 119
    .line 120
    int-to-long v7, v7

    .line 121
    xor-long/2addr v7, v4

    .line 122
    long-to-int v7, v7

    .line 123
    add-int v7, p4, v7

    .line 124
    .line 125
    aget-short p0, p0, v7

    .line 126
    .line 127
    int-to-long v7, p0

    .line 128
    xor-long/2addr v7, v4

    .line 129
    long-to-int p0, v7

    .line 130
    int-to-short p0, p0

    .line 131
    sget v7, Lcom/appsflyer/internal/AFg1tSDK;->afErrorLog:I

    .line 132
    .line 133
    int-to-long v7, v7

    .line 134
    xor-long/2addr v7, v4

    .line 135
    long-to-int v7, v7

    .line 136
    add-int/2addr p0, v7

    .line 137
    int-to-short p0, p0

    .line 138
    :cond_5
    :goto_2
    if-lez p0, :cond_a

    .line 139
    .line 140
    add-int v7, p4, p0

    .line 141
    .line 142
    add-int/lit8 v7, v7, -0x2

    .line 143
    .line 144
    sget v8, Lcom/appsflyer/internal/AFg1tSDK;->afInfoLog:I

    .line 145
    .line 146
    int-to-long v8, v8

    .line 147
    xor-long/2addr v8, v4

    .line 148
    long-to-int v8, v8

    .line 149
    add-int/2addr v7, v8

    .line 150
    add-int/2addr v7, v2

    .line 151
    iput v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    .line 152
    .line 153
    sget v2, Lcom/appsflyer/internal/AFg1tSDK;->AFLoggerLogLevel:I

    .line 154
    .line 155
    int-to-long v7, v2

    .line 156
    xor-long/2addr v7, v4

    .line 157
    long-to-int v2, v7

    .line 158
    add-int/2addr v2, p3

    .line 159
    int-to-char v2, v2

    .line 160
    iput-char v2, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    .line 161
    .line 162
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    iget-char v2, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    .line 166
    .line 167
    iput-char v2, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    .line 168
    .line 169
    sget-object v2, Lcom/appsflyer/internal/AFg1tSDK;->afDebugLog:[B

    .line 170
    .line 171
    if-eqz v2, :cond_7

    .line 172
    .line 173
    array-length v7, v2

    .line 174
    new-array v8, v7, [B

    .line 175
    .line 176
    sget v9, Lcom/appsflyer/internal/AFg1tSDK;->$10:I

    .line 177
    .line 178
    add-int/lit8 v9, v9, 0x7

    .line 179
    .line 180
    rem-int/lit16 v9, v9, 0x80

    .line 181
    .line 182
    sput v9, Lcom/appsflyer/internal/AFg1tSDK;->$11:I

    .line 183
    .line 184
    move v9, v3

    .line 185
    :goto_3
    if-ge v9, v7, :cond_6

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
    goto :goto_3

    .line 198
    :cond_6
    move-object v2, v8

    .line 199
    :cond_7
    if-eqz v2, :cond_8

    .line 200
    .line 201
    sget v2, Lcom/appsflyer/internal/AFg1tSDK;->$10:I

    .line 202
    .line 203
    add-int/lit8 v2, v2, 0x25

    .line 204
    .line 205
    rem-int/lit16 v2, v2, 0x80

    .line 206
    .line 207
    sput v2, Lcom/appsflyer/internal/AFg1tSDK;->$11:I

    .line 208
    .line 209
    move v2, v6

    .line 210
    goto :goto_4

    .line 211
    :cond_8
    move v2, v3

    .line 212
    :goto_4
    iput v6, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    .line 213
    .line 214
    :goto_5
    iget v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    .line 215
    .line 216
    if-ge v7, p0, :cond_a

    .line 217
    .line 218
    iget v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    .line 219
    .line 220
    if-eqz v2, :cond_9

    .line 221
    .line 222
    sget-object v8, Lcom/appsflyer/internal/AFg1tSDK;->afDebugLog:[B

    .line 223
    .line 224
    add-int/lit8 v9, v7, -0x1

    .line 225
    .line 226
    iput v9, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    .line 227
    .line 228
    aget-byte v7, v8, v7

    .line 229
    .line 230
    int-to-long v7, v7

    .line 231
    xor-long/2addr v7, v4

    .line 232
    long-to-int v7, v7

    .line 233
    int-to-byte v7, v7

    .line 234
    iget-char v8, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    .line 235
    .line 236
    add-int/2addr v7, p1

    .line 237
    int-to-byte v7, v7

    .line 238
    xor-int/2addr v7, p2

    .line 239
    add-int/2addr v8, v7

    .line 240
    int-to-char v7, v8

    .line 241
    iput-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_9
    sget-object v8, Lcom/appsflyer/internal/AFg1tSDK;->afWarnLog:[S

    .line 245
    .line 246
    add-int/lit8 v9, v7, -0x1

    .line 247
    .line 248
    iput v9, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    .line 249
    .line 250
    aget-short v7, v8, v7

    .line 251
    .line 252
    int-to-long v7, v7

    .line 253
    xor-long/2addr v7, v4

    .line 254
    long-to-int v7, v7

    .line 255
    int-to-short v7, v7

    .line 256
    iget-char v8, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    .line 257
    .line 258
    add-int/2addr v7, p1

    .line 259
    int-to-short v7, v7

    .line 260
    xor-int/2addr v7, p2

    .line 261
    add-int/2addr v8, v7

    .line 262
    int-to-char v7, v8

    .line 263
    iput-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    .line 264
    .line 265
    :goto_6
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    iget-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    .line 269
    .line 270
    iput-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    .line 271
    .line 272
    iget v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    .line 273
    .line 274
    add-int/2addr v7, v6

    .line 275
    iput v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_a
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    aput-object p0, p5, v3

    .line 283
    .line 284
    return-void
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFg1tSDK;Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/Context;)V
    .locals 0

    .line 285
    invoke-static {p0, p1, p2}, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger(Lcom/appsflyer/internal/AFg1tSDK;Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/Context;)V

    return-void
.end method

.method private d(Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/Context;)V
    .locals 4

    .line 161
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x2d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->v:Lcom/appsflyer/AppsFlyerProperties;

    invoke-interface {v0}, Lcom/appsflyer/AppsFlyerProperties;->saveProperties()V

    .line 164
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "sendTrackingWith with context: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 166
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0x45

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 167
    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/appsflyer/internal/AFg1tSDK;->unregisterClient(Landroid/content/Context;Lcom/appsflyer/internal/AFh1pSDK;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/appsflyer/internal/AFh1pSDK;->AFKeystoreWrapper(Ljava/util/Map;)Lcom/appsflyer/internal/AFh1pSDK;

    .line 168
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x47ce6783

    const v2, -0x47ce6783

    invoke-static {p2, v1, v2, v0}, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 169
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger(Lcom/appsflyer/internal/AFh1pSDK;)V

    .line 170
    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 p0, p0, 0x3d

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    return-void
.end method

.method private static synthetic registerClient([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    aget-object v0, p0, v0

    .line 3
    .line 4
    check-cast v0, Lcom/appsflyer/internal/AFg1tSDK;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    aget-object p0, p0, v1

    .line 8
    .line 9
    check-cast p0, Lcom/appsflyer/internal/AFh1pSDK;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 15
    .line 16
    iget-object v1, v0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 17
    .line 18
    iget-boolean v1, v1, Lcom/appsflyer/internal/AFc1eSDK;->afWarnLog:Z

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    sget v1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x9

    .line 26
    .line 27
    rem-int/lit16 v1, v1, 0x80

    .line 28
    .line 29
    sput v1, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 30
    .line 31
    const-string v1, "advertiserId"

    .line 32
    .line 33
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    :try_start_0
    iget-object v0, v0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 41
    .line 42
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->force:Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    move-object p0, v0

    .line 55
    move-object v6, p0

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    :goto_0
    const-string v0, "android_id"

    .line 58
    .line 59
    invoke-interface {p0, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    if-eqz p0, :cond_2

    .line 64
    .line 65
    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 66
    .line 67
    add-int/lit8 p0, p0, 0x63

    .line 68
    .line 69
    rem-int/lit16 p0, p0, 0x80

    .line 70
    .line 71
    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 72
    .line 73
    :try_start_1
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 74
    .line 75
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 76
    .line 77
    const-string v5, "validateGaidAndAndroidId :: removing: android_id"

    .line 78
    .line 79
    const/4 v7, 0x4

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 83
    .line 84
    .line 85
    return-object v2

    .line 86
    :goto_1
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 87
    .line 88
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 89
    .line 90
    const/16 v11, 0x78

    .line 91
    .line 92
    const/4 v12, 0x0

    .line 93
    const-string v5, "failed to remove AndroidID key from params; "

    .line 94
    .line 95
    const/4 v7, 0x0

    .line 96
    const/4 v8, 0x0

    .line 97
    const/4 v9, 0x0

    .line 98
    const/4 v10, 0x0

    .line 99
    invoke-static/range {v3 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    :goto_2
    return-object v2
.end method

.method private unregisterClient(Landroid/content/Context;Lcom/appsflyer/internal/AFh1pSDK;)Ljava/util/Map;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/appsflyer/internal/AFh1pSDK;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "appsFlyerInAppEventCount"

    .line 6
    .line 7
    const-string v3, "appsFlyerCount"

    .line 8
    .line 9
    const-string v4, "******* sendTrackingWithEvent: "

    .line 10
    .line 11
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v5, v1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    const/4 v7, 0x0

    .line 21
    if-nez v5, :cond_0

    .line 22
    .line 23
    iget-object v5, v1, Lcom/appsflyer/internal/AFh1pSDK;->w:Ljava/lang/String;

    .line 24
    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    move v5, v6

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v5, v7

    .line 30
    :goto_0
    iget-object v8, v1, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    .line 31
    .line 32
    new-instance v9, Ljava/util/Date;

    .line 33
    .line 34
    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    .line 38
    .line 39
    .line 40
    move-result-wide v9

    .line 41
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const-string v11, ""

    .line 45
    .line 46
    invoke-static {v11}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 47
    .line 48
    .line 49
    move-result v12

    .line 50
    invoke-static {v7}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 51
    .line 52
    .line 53
    move-result v13

    .line 54
    int-to-short v13, v13

    .line 55
    invoke-static {v7, v7}, Landroid/view/View;->resolveSize(II)I

    .line 56
    .line 57
    .line 58
    move-result v14

    .line 59
    int-to-byte v14, v14

    .line 60
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 61
    .line 62
    .line 63
    move-result v15

    .line 64
    shr-int/lit8 v15, v15, 0x10

    .line 65
    .line 66
    const v16, -0x16c803b4

    .line 67
    .line 68
    .line 69
    sub-int v15, v16, v15

    .line 70
    .line 71
    const v16, -0x4930991f

    .line 72
    .line 73
    .line 74
    invoke-static {v11, v11, v7, v7}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 75
    .line 76
    .line 77
    move-result v11

    .line 78
    sub-int v16, v16, v11

    .line 79
    .line 80
    new-array v11, v6, [Ljava/lang/Object;

    .line 81
    .line 82
    move-object/from16 v17, v11

    .line 83
    .line 84
    invoke-static/range {v12 .. v17}, Lcom/appsflyer/internal/AFg1tSDK;->a(ISBII[Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    aget-object v11, v17, v7

    .line 88
    .line 89
    check-cast v11, Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-interface {v8, v11, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :try_start_0
    iget-object v9, v0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    .line 103
    .line 104
    invoke-virtual {v9}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-eqz v9, :cond_1

    .line 109
    .line 110
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 111
    .line 112
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 113
    .line 114
    const-string v9, "AppsFlyer SDK Reporting has been stopped"

    .line 115
    .line 116
    invoke-virtual {v1, v4, v9, v6}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    move-object v12, v0

    .line 122
    goto :goto_3

    .line 123
    :cond_1
    if-eqz v5, :cond_2

    .line 124
    .line 125
    const-string v1, "Launch"

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    iget-object v1, v1, Lcom/appsflyer/internal/AFh1pSDK;->v:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    .line 130
    sget v9, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 131
    .line 132
    add-int/lit8 v9, v9, 0x9

    .line 133
    .line 134
    rem-int/lit16 v9, v9, 0x80

    .line 135
    .line 136
    sput v9, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 137
    .line 138
    :goto_1
    :try_start_1
    sget-object v9, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 139
    .line 140
    sget-object v10, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 141
    .line 142
    new-instance v11, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v11, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v9, v10, v1, v6}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 155
    .line 156
    .line 157
    :goto_2
    invoke-static/range {p1 .. p1}, Lcom/appsflyer/internal/AFg1tSDK;->unregisterClient(Landroid/content/Context;)V

    .line 158
    .line 159
    .line 160
    iget-object v1, v0, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    .line 161
    .line 162
    iget-object v4, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 163
    .line 164
    invoke-interface {v4, v3, v7}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v5, :cond_3

    .line 169
    .line 170
    add-int/lit8 v4, v4, 0x1

    .line 171
    .line 172
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 173
    .line 174
    invoke-interface {v1, v3, v4}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;I)V

    .line 175
    .line 176
    .line 177
    :cond_3
    iget-object v1, v0, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger:Lcom/appsflyer/internal/AFc1iSDK;

    .line 178
    .line 179
    iget-object v3, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 180
    .line 181
    invoke-interface {v3, v2, v7}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-nez v5, :cond_4

    .line 186
    .line 187
    add-int/lit8 v3, v3, 0x1

    .line 188
    .line 189
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 190
    .line 191
    invoke-interface {v1, v2, v3}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 192
    .line 193
    .line 194
    sget v1, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 195
    .line 196
    add-int/lit8 v1, v1, 0x6d

    .line 197
    .line 198
    rem-int/lit16 v1, v1, 0x80

    .line 199
    .line 200
    sput v1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 201
    .line 202
    :cond_4
    :try_start_2
    iget-object v0, v0, Lcom/appsflyer/internal/AFg1tSDK;->i:Lcom/appsflyer/internal/AFg1rSDK;

    .line 203
    .line 204
    invoke-interface {v0, v8, v4, v3}, Lcom/appsflyer/internal/AFg1rSDK;->unregisterClient(Ljava/util/Map;II)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :goto_3
    sget-object v9, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 209
    .line 210
    sget-object v10, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 211
    .line 212
    const/16 v17, 0x40

    .line 213
    .line 214
    const/16 v18, 0x0

    .line 215
    .line 216
    const-string v11, "Error while preparing to send event"

    .line 217
    .line 218
    const/4 v13, 0x1

    .line 219
    const/4 v14, 0x1

    .line 220
    const/4 v15, 0x1

    .line 221
    const/16 v16, 0x0

    .line 222
    .line 223
    invoke-static/range {v9 .. v18}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    :goto_4
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 227
    .line 228
    add-int/lit8 v0, v0, 0x5f

    .line 229
    .line 230
    rem-int/lit16 v1, v0, 0x80

    .line 231
    .line 232
    sput v1, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 233
    .line 234
    rem-int/lit8 v0, v0, 0x2

    .line 235
    .line 236
    if-nez v0, :cond_5

    .line 237
    .line 238
    const/16 v0, 0x4a

    .line 239
    .line 240
    div-int/2addr v0, v7

    .line 241
    :cond_5
    return-object v8
.end method

.method private static unregisterClient(Landroid/content/Context;)V
    .locals 10

    .line 242
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 v0, v0, 0xd

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    .line 243
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x6032

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 244
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz p0, :cond_1

    goto :goto_0

    .line 245
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v1, 0x1000

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 246
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz p0, :cond_1

    :goto_0
    invoke-static {p0}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    if-nez p0, :cond_2

    .line 247
    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    add-int/lit8 p0, p0, 0x11

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 248
    :try_start_1
    sget-object p0, La/iun;->a:La/iun;

    .line 249
    :cond_2
    const-string v0, "android.permission.INTERNET"

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 250
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 251
    :cond_3
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-nez v0, :cond_5

    .line 252
    sget v0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 v0, v0, 0x1f

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_4

    .line 253
    :try_start_2
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v4, 0x1

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_2

    :cond_4
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 254
    :cond_5
    :goto_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x20

    if-le v0, v1, :cond_6

    const-string v0, "com.google.android.gms.permission.AD_ID"

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    .line 255
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml"

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 256
    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    add-int/lit8 p0, p0, 0x1b

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_6

    const/16 p0, 0x59

    div-int/lit8 p0, p0, 0x0

    :cond_6
    return-void

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 257
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/16 v8, 0x78

    const/4 v9, 0x0

    const-string v2, "Exception while validation permissions. "

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    return-void
.end method

.method private unregisterClient(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 2

    .line 258
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, 0x47ce6783

    const v1, -0x47ce6783

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFg1tSDK;->AFLogger([Ljava/lang/Object;III)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Lcom/appsflyer/internal/AFh1pSDK;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFg1tSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1pSDK;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget p1, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 12
    .line 13
    add-int/lit8 p1, p1, 0x61

    .line 14
    .line 15
    rem-int/lit16 p1, p1, 0x80

    .line 16
    .line 17
    sput p1, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 18
    .line 19
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1tSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 20
    .line 21
    iget-wide p0, p0, Lcom/appsflyer/internal/AFc1eSDK;->setDebugLog:J

    .line 22
    .line 23
    const-wide/16 v2, 0x3e8

    .line 24
    .line 25
    div-long/2addr p0, v2

    .line 26
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 27
    .line 28
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 29
    .line 30
    const-string v3, "Blocking multiple consecutive Launch events within "

    .line 31
    .line 32
    const-string v4, " seconds time window"

    .line 33
    .line 34
    invoke-static {p0, p1, v3, v4}, La/axq;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v0, v2, p0, v1}, Lcom/appsflyer/AFLogger;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1tSDK;->w:Lcom/appsflyer/internal/AFd1zSDK;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 49
    .line 50
    add-int/lit8 p0, p0, 0x3b

    .line 51
    .line 52
    rem-int/lit16 p1, p0, 0x80

    .line 53
    .line 54
    sput p1, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 55
    .line 56
    rem-int/lit8 p0, p0, 0x2

    .line 57
    .line 58
    const-string p1, "sendWithEvent - got null context. skipping event/launch."

    .line 59
    .line 60
    if-nez p0, :cond_1

    .line 61
    .line 62
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 63
    .line 64
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->ATTRIBUTION:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-virtual {p0, v0, p1, v1}, Lcom/appsflyer/AFLogger;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 72
    .line 73
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->ATTRIBUTION:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 74
    .line 75
    invoke-virtual {p0, v0, p1, v1}, Lcom/appsflyer/AFLogger;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    iget-object v2, p0, Lcom/appsflyer/internal/AFg1tSDK;->e:Lcom/appsflyer/internal/AFf1fSDK;

    .line 80
    .line 81
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    const v4, -0x62ff1f55

    .line 90
    .line 91
    .line 92
    const v5, 0x62ff1f57

    .line 93
    .line 94
    .line 95
    invoke-static {v3, v4, v5, v2}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Ljava/lang/String;

    .line 100
    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_3

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    iget-object v2, p0, Lcom/appsflyer/internal/AFg1tSDK;->force:Ljava/util/concurrent/ScheduledExecutorService;

    .line 111
    .line 112
    new-instance v3, Lcom/appsflyer/internal/r;

    .line 113
    .line 114
    invoke-direct {v3, p0, p1, v0, v1}, Lcom/appsflyer/internal/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 115
    .line 116
    .line 117
    invoke-static {v2, v3}, Lcom/appsflyer/internal/AFj1iSDK;->AFKeystoreWrapper(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_4
    :goto_0
    sget p0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 122
    .line 123
    add-int/lit8 p0, p0, 0x3d

    .line 124
    .line 125
    rem-int/lit16 p0, p0, 0x80

    .line 126
    .line 127
    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->getLevel:I

    .line 128
    .line 129
    add-int/lit8 p0, p0, 0x6f

    .line 130
    .line 131
    rem-int/lit16 p0, p0, 0x80

    .line 132
    .line 133
    sput p0, Lcom/appsflyer/internal/AFg1tSDK;->AppsFlyerLib:I

    .line 134
    .line 135
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 136
    .line 137
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 138
    .line 139
    const-string v2, "AppsFlyer dev key is missing! AppsFlyer\'s SDK cannot send any events without providing the dev key."

    .line 140
    .line 141
    invoke-virtual {p0, v0, v2, v1}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 142
    .line 143
    .line 144
    const-string v2, "AppsFlyer will not track this event."

    .line 145
    .line 146
    invoke-virtual {p0, v0, v2, v1}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 147
    .line 148
    .line 149
    iget-object p0, p1, Lcom/appsflyer/internal/AFh1pSDK;->AFLogger:Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;

    .line 150
    .line 151
    if-eqz p0, :cond_5

    .line 152
    .line 153
    const/16 p1, 0x29

    .line 154
    .line 155
    const-string v0, "No dev key"

    .line 156
    .line 157
    invoke-interface {p0, p1, v0}, Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;->onError(ILjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :cond_5
    return-void
.end method
