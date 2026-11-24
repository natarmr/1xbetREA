.class public final Lcom/appsflyer/internal/AFd1wSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFd1uSDK;


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AFLoggerLogLevel:[I = null

.field private static afInfoLog:I = 0x1

.field private static afWarnLog:I

.field private static final d:I


# instance fields
.field private AFKeystoreWrapper:I

.field private AFLogger:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/appsflyer/internal/AFc1bSDK;

.field private force:Ljava/security/SecureRandom;

.field private i:Z

.field private final registerClient:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private unregisterClient:Z

.field private v:Z

.field private w:Lcom/appsflyer/AppsFlyerProperties;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/AFd1wSDK;->force()V

    .line 2
    .line 3
    .line 4
    const v0, 0x17f76

    .line 5
    .line 6
    .line 7
    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->d:I

    .line 8
    .line 9
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x2b

    .line 12
    .line 13
    rem-int/lit16 v1, v0, 0x80

    .line 14
    .line 15
    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    throw v0
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient:Z

    .line 13
    .line 14
    new-instance v1, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 20
    .line 21
    new-instance v1, Ljava/security/SecureRandom;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->force:Ljava/security/SecureRandom;

    .line 27
    .line 28
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->registerClient()Lcom/appsflyer/AppsFlyerProperties;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->w:Lcom/appsflyer/AppsFlyerProperties;

    .line 33
    .line 34
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "AF_DISABLE_REMOTE_DEBUGGER"

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v2, 0x0

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v1, v2

    .line 53
    :goto_0
    xor-int/2addr v0, v1

    .line 54
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->v:Z

    .line 55
    .line 56
    iput v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    .line 57
    .line 58
    iput-boolean v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z

    .line 59
    .line 60
    iput-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 61
    .line 62
    return-void
.end method

.method private static AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1aSDK;)Lcom/appsflyer/internal/AFh1cSDK;
    .locals 4

    .line 194
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v1, v0, 0x5d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v1, v1, 0x2

    const/4 v3, 0x0

    if-nez v1, :cond_0

    const/16 v1, 0x14

    .line 195
    div-int/lit8 v1, v1, 0x0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_2

    .line 196
    :goto_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1aSDK;->registerClient:Lcom/appsflyer/internal/AFh1gSDK;

    if-eqz p0, :cond_2

    .line 197
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1gSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1cSDK;

    add-int/lit8 v2, v2, 0x33

    .line 198
    rem-int/lit16 v0, v2, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_1

    return-object p0

    :cond_1
    throw v3

    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 199
    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    return-object v3
.end method

.method private declared-synchronized AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 3
    .line 4
    const v1, -0x3f0e94b7

    .line 5
    .line 6
    .line 7
    const v2, -0x166ce116

    .line 8
    .line 9
    .line 10
    const v3, 0x228cb56d

    .line 11
    .line 12
    .line 13
    const v4, 0x5179247d

    .line 14
    .line 15
    .line 16
    filled-new-array {v3, v4, v1, v2}, [I

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v2}, Landroid/telephony/cdma/CdmaCellLocation;->convertQuartSecToDecDegrees(I)D

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    const-wide/16 v5, 0x0

    .line 26
    .line 27
    cmpl-double v3, v3, v5

    .line 28
    .line 29
    rsub-int/lit8 v3, v3, 0x5

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    new-array v4, v4, [Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {v1, v3, v4}, Lcom/appsflyer/internal/AFd1wSDK;->a([II[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    aget-object v1, v4, v2

    .line 38
    .line 39
    check-cast v1, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v3, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 46
    .line 47
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 51
    .line 52
    const-string v1, "model"

    .line 53
    .line 54
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 55
    .line 56
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 60
    .line 61
    const-string v1, "platform"

    .line 62
    .line 63
    const-string v3, "Android"

    .line 64
    .line 65
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 69
    .line 70
    const-string v1, "platform_version"

    .line 71
    .line 72
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 73
    .line 74
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 75
    .line 76
    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    :try_start_1
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 80
    .line 81
    add-int/lit8 v0, v0, 0x79

    .line 82
    .line 83
    rem-int/lit16 v0, v0, 0x80

    .line 84
    .line 85
    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 91
    if-lez v0, :cond_1

    .line 92
    .line 93
    :try_start_3
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 94
    .line 95
    add-int/lit8 v0, v0, 0x77

    .line 96
    .line 97
    rem-int/lit16 v1, v0, 0x80

    .line 98
    .line 99
    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 100
    .line 101
    rem-int/lit8 v0, v0, 0x2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 102
    .line 103
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 104
    .line 105
    if-nez v0, :cond_0

    .line 106
    .line 107
    :try_start_4
    const-string v0, "advertiserId"

    .line 108
    .line 109
    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    const/16 p1, 0x39

    .line 113
    .line 114
    div-int/2addr p1, v2

    .line 115
    goto :goto_0

    .line 116
    :cond_0
    const-string v0, "advertiserId"

    .line 117
    .line 118
    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :catchall_0
    move-exception p1

    .line 123
    goto :goto_1

    .line 124
    :cond_1
    :goto_0
    if-eqz p2, :cond_3

    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 127
    .line 128
    .line 129
    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 130
    if-lez p1, :cond_3

    .line 131
    .line 132
    :try_start_5
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 133
    .line 134
    add-int/lit8 p1, p1, 0x25

    .line 135
    .line 136
    rem-int/lit16 v0, p1, 0x80

    .line 137
    .line 138
    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 139
    .line 140
    rem-int/lit8 p1, p1, 0x2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 141
    .line 142
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 143
    .line 144
    if-eqz p1, :cond_2

    .line 145
    .line 146
    :try_start_6
    const-string p1, "imei"

    .line 147
    .line 148
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_2
    const-string p1, "imei"

    .line 153
    .line 154
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    const/4 p1, 0x0

    .line 158
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 159
    :goto_1
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 160
    throw p1

    .line 161
    :cond_3
    :goto_2
    if-eqz p3, :cond_4

    .line 162
    .line 163
    :try_start_8
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-lez p1, :cond_4

    .line 168
    .line 169
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 170
    .line 171
    const-string p2, "android_id"

    .line 172
    .line 173
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 174
    .line 175
    .line 176
    :cond_4
    monitor-exit p0

    .line 177
    return-void

    .line 178
    :catchall_1
    monitor-exit p0

    .line 179
    return-void
.end method

.method private AFKeystoreWrapper(Ljava/lang/String;)Z
    .locals 1

    .line 189
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x5

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    if-eqz p1, :cond_1

    add-int/lit8 v0, v0, 0x19

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 190
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 191
    :cond_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object p0

    .line 192
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 193
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private declared-synchronized AFLogger(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    monitor-enter p0

    .line 217
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x75

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    :try_start_1
    const-string v0, "sdk_version"

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p2, :cond_1

    .line 219
    :try_start_2
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x77

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_0

    .line 220
    :try_start_3
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    .line 221
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v0, "devkey"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 222
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    if-eqz p3, :cond_3

    :try_start_4
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x51

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p1, :cond_2

    .line 223
    :try_start_5
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_3

    .line 224
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string p2, "originalAppsFlyerId"

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 225
    :cond_2
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_3
    :goto_1
    if-eqz p4, :cond_4

    :try_start_6
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x59

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 226
    :try_start_7
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_4

    .line 227
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string p2, "uid"

    invoke-interface {p1, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 228
    :cond_4
    monitor-exit p0

    return-void

    .line 229
    :cond_5
    :try_start_8
    const-string p2, "sdk_version"

    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 231
    :catchall_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    throw p1
.end method

.method private varargs declared-synchronized AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->afErrorLog()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x4f

    .line 11
    .line 12
    rem-int/lit16 v1, v0, 0x80

    .line 13
    .line 14
    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 15
    .line 16
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    iget v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    const v0, 0x18000

    .line 23
    .line 24
    .line 25
    if-lt v1, v0, :cond_0

    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    const-string v2, ", "

    .line 34
    .line 35
    invoke-static {v2, p3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, " "

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v0, " _/AppsFlyer_7.0.1 ["

    .line 66
    .line 67
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p1, "] "

    .line 74
    .line 75
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p1, " "

    .line 82
    .line 83
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    goto :goto_0

    .line 94
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v0, " "

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 112
    .line 113
    .line 114
    move-result-wide v0

    .line 115
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v0, " "

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string p2, "/AppsFlyer_7.0.1 "

    .line 127
    .line 128
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    :goto_0
    iget p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 141
    .line 142
    .line 143
    move-result p3

    .line 144
    const/4 v0, 0x1

    .line 145
    shl-int/2addr p3, v0

    .line 146
    add-int/2addr p2, p3

    .line 147
    sget p3, Lcom/appsflyer/internal/AFd1wSDK;->d:I

    .line 148
    .line 149
    const/4 v1, 0x0

    .line 150
    if-le p2, p3, :cond_2

    .line 151
    .line 152
    iget p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    .line 153
    .line 154
    sub-int/2addr p3, p2

    .line 155
    div-int/lit8 p3, p3, 0x2

    .line 156
    .line 157
    invoke-virtual {p1, v1, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    move v1, v0

    .line 162
    :cond_2
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    .line 163
    .line 164
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    iget p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    shl-int/2addr p1, v0

    .line 174
    add-int/2addr p2, p1

    .line 175
    iput p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 176
    .line 177
    if-eqz v1, :cond_3

    .line 178
    .line 179
    :try_start_2
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 180
    .line 181
    add-int/lit8 p1, p1, 0x31

    .line 182
    .line 183
    rem-int/lit16 p1, p1, 0x80

    .line 184
    .line 185
    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 186
    .line 187
    :try_start_3
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    .line 188
    .line 189
    const-string p2, "+~+~ The limit has been exceeded, and no more data is available. +~+~"

    .line 190
    .line 191
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    iget p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    .line 195
    .line 196
    add-int/lit16 p1, p1, 0x8a

    .line 197
    .line 198
    iput p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :catchall_0
    move-exception p1

    .line 202
    goto :goto_3

    .line 203
    :cond_3
    :goto_1
    monitor-exit p0

    .line 204
    return-void

    .line 205
    :catchall_1
    monitor-exit p0

    .line 206
    return-void

    .line 207
    :cond_4
    const/4 p1, 0x0

    .line 208
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 209
    :catchall_2
    move-exception p1

    .line 210
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 211
    :cond_5
    :goto_2
    monitor-exit p0

    .line 212
    return-void

    .line 213
    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 214
    throw p1
.end method

.method private AFLogger(Lcom/appsflyer/internal/AFh1cSDK;Lcom/appsflyer/internal/AFh1cSDK;)Z
    .locals 2

    .line 247
    invoke-virtual {p1, p2}, Lcom/appsflyer/internal/AFh1cSDK;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 248
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x4f

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 249
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog()Z

    move-result p0

    return p0

    .line 250
    :cond_0
    iget p1, p1, Lcom/appsflyer/internal/AFh1cSDK;->unregisterClient:F

    .line 251
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p2

    const v0, 0x317aee4a

    const v1, -0x317aee4a

    invoke-static {p1, v0, v1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 252
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient(Z)V

    .line 253
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p0, p0, 0x21

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    return p1
.end method

.method private declared-synchronized AFLoggerLogLevel()Ljava/util/Map;
    .locals 3
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
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x65

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_1
    const-string v0, "data"

    .line 17
    .line 18
    iget-object v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->afDebugLog()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 27
    .line 28
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x3b

    .line 31
    .line 32
    rem-int/lit16 v1, v1, 0x80

    .line 33
    .line 34
    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return-object v0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    :try_start_2
    const-string v0, "data"

    .line 41
    .line 42
    iget-object v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->afDebugLog()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 52
    :catchall_1
    move-exception v0

    .line 53
    :try_start_4
    throw v0

    .line 54
    :goto_0
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 55
    throw v0
.end method

.method private static a([II[Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lcom/appsflyer/internal/AFk1oSDK;

    .line 4
    .line 5
    invoke-direct {v1}, Lcom/appsflyer/internal/AFk1oSDK;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    new-array v2, v2, [C

    .line 10
    .line 11
    array-length v3, v0

    .line 12
    const/4 v4, 0x2

    .line 13
    mul-int/2addr v3, v4

    .line 14
    new-array v3, v3, [C

    .line 15
    .line 16
    sget-object v5, Lcom/appsflyer/internal/AFd1wSDK;->AFLoggerLogLevel:[I

    .line 17
    .line 18
    const-wide v6, 0x769c5e91f036dbc7L    # 2.2332975936769864E263

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    array-length v9, v5

    .line 27
    new-array v10, v9, [I

    .line 28
    .line 29
    :goto_0
    move v11, v8

    .line 30
    :goto_1
    if-ge v11, v9, :cond_1

    .line 31
    .line 32
    sget v12, Lcom/appsflyer/internal/AFd1wSDK;->$11:I

    .line 33
    .line 34
    add-int/lit8 v12, v12, 0x73

    .line 35
    .line 36
    rem-int/lit16 v13, v12, 0x80

    .line 37
    .line 38
    sput v13, Lcom/appsflyer/internal/AFd1wSDK;->$10:I

    .line 39
    .line 40
    rem-int/2addr v12, v4

    .line 41
    if-eqz v12, :cond_0

    .line 42
    .line 43
    aget v12, v5, v11

    .line 44
    .line 45
    int-to-long v12, v12

    .line 46
    mul-long/2addr v12, v6

    .line 47
    long-to-int v12, v12

    .line 48
    aput v12, v10, v11

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    aget v12, v5, v11

    .line 52
    .line 53
    int-to-long v12, v12

    .line 54
    xor-long/2addr v12, v6

    .line 55
    long-to-int v12, v12

    .line 56
    aput v12, v10, v11

    .line 57
    .line 58
    add-int/lit8 v11, v11, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move-object v5, v10

    .line 62
    :cond_2
    array-length v5, v5

    .line 63
    new-array v9, v5, [I

    .line 64
    .line 65
    sget-object v10, Lcom/appsflyer/internal/AFd1wSDK;->AFLoggerLogLevel:[I

    .line 66
    .line 67
    if-eqz v10, :cond_4

    .line 68
    .line 69
    array-length v11, v10

    .line 70
    new-array v12, v11, [I

    .line 71
    .line 72
    move v13, v8

    .line 73
    :goto_2
    if-ge v13, v11, :cond_3

    .line 74
    .line 75
    aget v14, v10, v13

    .line 76
    .line 77
    int-to-long v14, v14

    .line 78
    xor-long/2addr v14, v6

    .line 79
    long-to-int v14, v14

    .line 80
    aput v14, v12, v13

    .line 81
    .line 82
    add-int/lit8 v13, v13, 0x1

    .line 83
    .line 84
    sget v14, Lcom/appsflyer/internal/AFd1wSDK;->$10:I

    .line 85
    .line 86
    add-int/lit8 v14, v14, 0x33

    .line 87
    .line 88
    rem-int/lit16 v14, v14, 0x80

    .line 89
    .line 90
    sput v14, Lcom/appsflyer/internal/AFd1wSDK;->$11:I

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    move-object v10, v12

    .line 94
    :cond_4
    invoke-static {v10, v8, v9, v8, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    iput v8, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFKeystoreWrapper:I

    .line 98
    .line 99
    :goto_3
    iget v5, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFKeystoreWrapper:I

    .line 100
    .line 101
    array-length v6, v0

    .line 102
    if-ge v5, v6, :cond_6

    .line 103
    .line 104
    sget v6, Lcom/appsflyer/internal/AFd1wSDK;->$11:I

    .line 105
    .line 106
    const/4 v7, 0x3

    .line 107
    add-int/2addr v6, v7

    .line 108
    rem-int/lit16 v6, v6, 0x80

    .line 109
    .line 110
    sput v6, Lcom/appsflyer/internal/AFd1wSDK;->$10:I

    .line 111
    .line 112
    aget v6, v0, v5

    .line 113
    .line 114
    shr-int/lit8 v10, v6, 0x10

    .line 115
    .line 116
    int-to-char v10, v10

    .line 117
    aput-char v10, v2, v8

    .line 118
    .line 119
    int-to-char v6, v6

    .line 120
    const/4 v11, 0x1

    .line 121
    aput-char v6, v2, v11

    .line 122
    .line 123
    add-int/lit8 v12, v5, 0x1

    .line 124
    .line 125
    aget v12, v0, v12

    .line 126
    .line 127
    const/16 v13, 0x10

    .line 128
    .line 129
    shr-int/2addr v12, v13

    .line 130
    int-to-char v12, v12

    .line 131
    aput-char v12, v2, v4

    .line 132
    .line 133
    add-int/lit8 v5, v5, 0x1

    .line 134
    .line 135
    aget v5, v0, v5

    .line 136
    .line 137
    int-to-char v5, v5

    .line 138
    aput-char v5, v2, v7

    .line 139
    .line 140
    shl-int/2addr v10, v13

    .line 141
    add-int/2addr v10, v6

    .line 142
    iput v10, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    .line 143
    .line 144
    shl-int/lit8 v6, v12, 0x10

    .line 145
    .line 146
    add-int/2addr v6, v5

    .line 147
    iput v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->d:I

    .line 148
    .line 149
    invoke-static {v9}, Lcom/appsflyer/internal/AFk1oSDK;->unregisterClient([I)V

    .line 150
    .line 151
    .line 152
    move v5, v8

    .line 153
    :goto_4
    if-ge v5, v13, :cond_5

    .line 154
    .line 155
    sget v6, Lcom/appsflyer/internal/AFd1wSDK;->$10:I

    .line 156
    .line 157
    add-int/lit8 v6, v6, 0x21

    .line 158
    .line 159
    rem-int/lit16 v6, v6, 0x80

    .line 160
    .line 161
    sput v6, Lcom/appsflyer/internal/AFd1wSDK;->$11:I

    .line 162
    .line 163
    iget v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    .line 164
    .line 165
    aget v10, v9, v5

    .line 166
    .line 167
    xor-int/2addr v6, v10

    .line 168
    iput v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    .line 169
    .line 170
    invoke-static {v6}, Lcom/appsflyer/internal/AFk1oSDK;->d(I)I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    iget v10, v1, Lcom/appsflyer/internal/AFk1oSDK;->d:I

    .line 175
    .line 176
    xor-int/2addr v6, v10

    .line 177
    iget v10, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    .line 178
    .line 179
    iput v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    .line 180
    .line 181
    iput v10, v1, Lcom/appsflyer/internal/AFk1oSDK;->d:I

    .line 182
    .line 183
    add-int/lit8 v5, v5, 0x1

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_5
    iget v5, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    .line 187
    .line 188
    iget v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->d:I

    .line 189
    .line 190
    iput v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    .line 191
    .line 192
    iput v5, v1, Lcom/appsflyer/internal/AFk1oSDK;->d:I

    .line 193
    .line 194
    aget v10, v9, v13

    .line 195
    .line 196
    xor-int/2addr v5, v10

    .line 197
    iput v5, v1, Lcom/appsflyer/internal/AFk1oSDK;->d:I

    .line 198
    .line 199
    const/16 v10, 0x11

    .line 200
    .line 201
    aget v10, v9, v10

    .line 202
    .line 203
    xor-int/2addr v6, v10

    .line 204
    iput v6, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFLogger:I

    .line 205
    .line 206
    ushr-int/lit8 v10, v6, 0x10

    .line 207
    .line 208
    int-to-char v10, v10

    .line 209
    aput-char v10, v2, v8

    .line 210
    .line 211
    int-to-char v6, v6

    .line 212
    aput-char v6, v2, v11

    .line 213
    .line 214
    ushr-int/lit8 v6, v5, 0x10

    .line 215
    .line 216
    int-to-char v6, v6

    .line 217
    aput-char v6, v2, v4

    .line 218
    .line 219
    int-to-char v5, v5

    .line 220
    aput-char v5, v2, v7

    .line 221
    .line 222
    invoke-static {v9}, Lcom/appsflyer/internal/AFk1oSDK;->unregisterClient([I)V

    .line 223
    .line 224
    .line 225
    iget v5, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFKeystoreWrapper:I

    .line 226
    .line 227
    mul-int/lit8 v6, v5, 0x2

    .line 228
    .line 229
    aget-char v10, v2, v8

    .line 230
    .line 231
    aput-char v10, v3, v6

    .line 232
    .line 233
    mul-int/lit8 v6, v5, 0x2

    .line 234
    .line 235
    add-int/2addr v6, v11

    .line 236
    aget-char v10, v2, v11

    .line 237
    .line 238
    aput-char v10, v3, v6

    .line 239
    .line 240
    mul-int/lit8 v6, v5, 0x2

    .line 241
    .line 242
    add-int/2addr v6, v4

    .line 243
    aget-char v10, v2, v4

    .line 244
    .line 245
    aput-char v10, v3, v6

    .line 246
    .line 247
    mul-int/lit8 v6, v5, 0x2

    .line 248
    .line 249
    add-int/2addr v6, v7

    .line 250
    aget-char v7, v2, v7

    .line 251
    .line 252
    aput-char v7, v3, v6

    .line 253
    .line 254
    add-int/2addr v5, v4

    .line 255
    iput v5, v1, Lcom/appsflyer/internal/AFk1oSDK;->AFKeystoreWrapper:I

    .line 256
    .line 257
    goto/16 :goto_3

    .line 258
    .line 259
    :cond_6
    new-instance v0, Ljava/lang/String;

    .line 260
    .line 261
    move/from16 v1, p1

    .line 262
    .line 263
    invoke-direct {v0, v3, v8, v1}, Ljava/lang/String;-><init>([CII)V

    .line 264
    .line 265
    .line 266
    aput-object v0, p2, v8

    .line 267
    .line 268
    return-void
.end method

.method private declared-synchronized afDebugLog()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    .line 11
    .line 12
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x13

    .line 15
    .line 16
    rem-int/lit16 v1, v0, 0x80

    .line 17
    .line 18
    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 19
    .line 20
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    :try_start_2
    throw v0

    .line 30
    :catchall_1
    move-exception v0

    .line 31
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 32
    throw v0
.end method

.method private afErrorLog()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->v:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-boolean p0, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z

    .line 11
    .line 12
    if-eqz p0, :cond_2

    .line 13
    .line 14
    :cond_0
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 15
    .line 16
    add-int/lit8 p0, p0, 0xf

    .line 17
    .line 18
    rem-int/lit16 v0, p0, 0x80

    .line 19
    .line 20
    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 21
    .line 22
    rem-int/lit8 p0, p0, 0x2

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    const/16 p0, 0x2b

    .line 28
    .line 29
    div-int/2addr p0, v1

    .line 30
    :cond_1
    return v0

    .line 31
    :cond_2
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 32
    .line 33
    add-int/lit8 p0, p0, 0x5f

    .line 34
    .line 35
    rem-int/lit16 p0, p0, 0x80

    .line 36
    .line 37
    sput p0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 38
    .line 39
    return v1
.end method

.method private afInfoLog()Z
    .locals 2

    .line 1
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x51

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 8
    .line 9
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 10
    .line 11
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "participantInProxy"

    .line 16
    .line 17
    invoke-interface {p0, v0}, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x7d

    .line 24
    .line 25
    rem-int/lit16 v1, v0, 0x80

    .line 26
    .line 27
    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 28
    .line 29
    rem-int/lit8 v0, v0, 0x2

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const/16 v0, 0x31

    .line 34
    .line 35
    div-int/lit8 v0, v0, 0x0

    .line 36
    .line 37
    :cond_0
    return p0
.end method

.method private afWarnLog()V
    .locals 3

    .line 1
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    const v1, -0x30603f54

    .line 10
    .line 11
    .line 12
    const v2, 0x30603f56

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2, p0}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private static synthetic d([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    aget-object v0, p0, v0

    check-cast v0, Lcom/appsflyer/internal/AFd1wSDK;

    const/4 v1, 0x1

    aget-object p0, p0, v1

    check-cast p0, Ljava/lang/String;

    .line 255
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v1, v1, 0x5

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    .line 256
    iget-object v1, v0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/appsflyer/internal/AFd1wSDK;->d(Ljava/lang/String;Lcom/appsflyer/internal/AFc1eSDK;)V

    .line 257
    invoke-direct {v0}, Lcom/appsflyer/internal/AFd1wSDK;->AFLoggerLogLevel()Ljava/util/Map;

    move-result-object p0

    return-object p0

    .line 258
    :cond_0
    iget-object v1, v0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/appsflyer/internal/AFd1wSDK;->d(Ljava/lang/String;Lcom/appsflyer/internal/AFc1eSDK;)V

    .line 259
    invoke-direct {v0}, Lcom/appsflyer/internal/AFd1wSDK;->AFLoggerLogLevel()Ljava/util/Map;

    const/4 p0, 0x0

    throw p0
.end method

.method private declared-synchronized d(Ljava/lang/String;Lcom/appsflyer/internal/AFc1eSDK;)V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "remote_debug_static_data"

    .line 3
    .line 4
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->w:Lcom/appsflyer/AppsFlyerProperties;

    .line 5
    .line 6
    invoke-interface {v1, v0}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {v2}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    :try_start_1
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 18
    .line 19
    new-instance p2, Lorg/json/JSONObject;

    .line 20
    .line 21
    invoke-direct {p2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p2}, Lcom/appsflyer/internal/AFg1dSDK;->unregisterClient(Lorg/json/JSONObject;)Ljava/util/Map;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 29
    .line 30
    .line 31
    :try_start_2
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 32
    .line 33
    add-int/lit8 p1, p1, 0x79

    .line 34
    .line 35
    rem-int/lit16 p1, p1, 0x80

    .line 36
    .line 37
    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 45
    .line 46
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v2, p2, Lcom/appsflyer/internal/AFc1eSDK;->AFLoggerLogLevel:Ljava/lang/String;

    .line 55
    .line 56
    iget-object p2, p2, Lcom/appsflyer/internal/AFc1eSDK;->force:Ljava/lang/String;

    .line 57
    .line 58
    invoke-direct {p0, v1, v2, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance p2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v1, "7.0.1."

    .line 64
    .line 65
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    sget-object v1, Lcom/appsflyer/internal/AFa1tSDK;->unregisterClient:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 78
    .line 79
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    const v3, -0x62ff1f55

    .line 92
    .line 93
    .line 94
    const v4, 0x62ff1f57

    .line 95
    .line 96
    .line 97
    invoke-static {v2, v3, v4, v1}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, Ljava/lang/String;

    .line 102
    .line 103
    iget-object v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->w:Lcom/appsflyer/AppsFlyerProperties;

    .line 104
    .line 105
    const-string v3, "KSAppsFlyerId"

    .line 106
    .line 107
    invoke-interface {v2, v3}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    iget-object v3, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 112
    .line 113
    invoke-interface {v3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    iget-object v3, v3, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 118
    .line 119
    invoke-static {v3}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-direct {p0, p2, v1, v2, v3}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 124
    .line 125
    .line 126
    :try_start_3
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 127
    .line 128
    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-virtual {p2}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    iget p2, p2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 137
    .line 138
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 139
    .line 140
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    const-string v2, "CHANNEL"

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 150
    if-eqz v1, :cond_2

    .line 151
    .line 152
    :try_start_4
    sget v2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 153
    .line 154
    add-int/lit8 v2, v2, 0xf

    .line 155
    .line 156
    rem-int/lit16 v3, v2, 0x80

    .line 157
    .line 158
    sput v3, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 159
    .line 160
    rem-int/lit8 v2, v2, 0x2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 161
    .line 162
    const/4 v3, 0x0

    .line 163
    if-nez v2, :cond_1

    .line 164
    .line 165
    :try_start_5
    const-string v2, ""

    .line 166
    .line 167
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_2

    .line 172
    .line 173
    move-object v1, v3

    .line 174
    goto :goto_0

    .line 175
    :cond_1
    const-string p1, ""

    .line 176
    .line 177
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    throw v3

    .line 181
    :cond_2
    :goto_0
    iget-object v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->w:Lcom/appsflyer/AppsFlyerProperties;

    .line 182
    .line 183
    const-string v3, "preInstallName"

    .line 184
    .line 185
    invoke-interface {v2, v3}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-direct {p0, p1, p2, v1, v2}, Lcom/appsflyer/internal/AFd1wSDK;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 194
    .line 195
    .line 196
    :try_start_6
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 197
    .line 198
    add-int/lit8 p1, p1, 0x4d

    .line 199
    .line 200
    rem-int/lit16 p1, p1, 0x80

    .line 201
    .line 202
    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 203
    .line 204
    :catchall_1
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->w:Lcom/appsflyer/AppsFlyerProperties;

    .line 205
    .line 206
    new-instance p2, Lorg/json/JSONObject;

    .line 207
    .line 208
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 209
    .line 210
    invoke-direct {p2, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    invoke-interface {p1, v0, p2}, Lcom/appsflyer/AppsFlyerProperties;->set(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :catchall_2
    :goto_1
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 221
    .line 222
    const-string p2, "launch_counter"

    .line 223
    .line 224
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 225
    .line 226
    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 231
    .line 232
    const-string v1, "appsFlyerCount"

    .line 233
    .line 234
    const/4 v2, 0x0

    .line 235
    invoke-interface {v0, v1, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 244
    .line 245
    .line 246
    monitor-exit p0

    .line 247
    return-void

    .line 248
    :goto_2
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 249
    throw p1
.end method

.method private declared-synchronized d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 260
    :try_start_0
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v1, v1, 0x9

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v1, v1, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    .line 261
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-lez v1, :cond_1

    .line 262
    :try_start_2
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v1, v1, 0x3

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 263
    :try_start_3
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v2, "app_id"

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 264
    :try_start_4
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x1b

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :try_start_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_1
    :goto_0
    if-eqz p2, :cond_3

    :try_start_6
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x37

    rem-int/lit16 v1, p1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz p1, :cond_2

    .line 265
    :try_start_7
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_3

    .line 266
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string v1, "app_version"

    invoke-interface {p1, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 267
    :cond_2
    throw v0

    :cond_3
    :goto_1
    if-eqz p3, :cond_4

    .line 268
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_4

    .line 269
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string p2, "channel"

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 270
    :try_start_8
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x35

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    :cond_4
    if-eqz p4, :cond_6

    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x6b

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-eqz p1, :cond_5

    .line 271
    :try_start_9
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_6

    .line 272
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    const-string p2, "preInstall"

    invoke-interface {p1, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 273
    :cond_5
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :catchall_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    throw p1

    .line 274
    :cond_6
    :goto_3
    monitor-exit p0

    return-void
.end method

.method private d(F)Z
    .locals 2

    .line 310
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, 0x317aee4a

    const v1, -0x317aee4a

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private declared-synchronized d(Lcom/appsflyer/internal/AFh1cSDK;Lcom/appsflyer/internal/AFh1cSDK;)Z
    .locals 5

    monitor-enter p0

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 286
    :try_start_0
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p2

    const v1, -0x30603f54

    const v2, 0x30603f56

    invoke-static {p1, v1, v2, p2}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 287
    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 288
    :cond_0
    :try_start_1
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v2, p1, Lcom/appsflyer/internal/AFh1cSDK;->d:J

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v1

    invoke-static {}, Lcom/appsflyer/internal/AFh1cSDK;->registerClient()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-lez v1, :cond_6

    .line 289
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v1, v1, 0x5d

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 290
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    move-result-object v1

    .line 291
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    const-string v2, "appsFlyerCount"

    invoke-interface {v1, v2, v0}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    move-result v1

    .line 292
    iget v2, p1, Lcom/appsflyer/internal/AFh1cSDK;->AFKeystoreWrapper:I

    if-gt v1, v2, :cond_5

    .line 293
    invoke-direct {p0, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Lcom/appsflyer/internal/AFh1cSDK;Lcom/appsflyer/internal/AFh1cSDK;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 294
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p1, p1, 0x2d

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 295
    monitor-exit p0

    return v0

    .line 296
    :cond_1
    :try_start_2
    iget-object p2, p1, Lcom/appsflyer/internal/AFh1cSDK;->AFLogger:Ljava/lang/String;

    .line 297
    invoke-direct {p0, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p2, :cond_2

    .line 298
    monitor-exit p0

    return v0

    .line 299
    :cond_2
    :try_start_3
    iget-object p1, p1, Lcom/appsflyer/internal/AFh1cSDK;->force:Ljava/lang/String;

    .line 300
    invoke-static {p1}, Lcom/appsflyer/internal/AFd1wSDK;->d(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 301
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x39

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 302
    monitor-exit p0

    return v0

    .line 303
    :cond_3
    :try_start_4
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p1, p1, 0x49

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 p1, p1, 0x2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 p2, 0x1

    if-nez p1, :cond_4

    const/16 p1, 0x48

    :try_start_5
    div-int/2addr p1, v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    monitor-exit p0

    return p2

    :catchall_1
    move-exception p1

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_4
    monitor-exit p0

    return p2

    .line 304
    :cond_5
    monitor-exit p0

    return v0

    .line 305
    :cond_6
    monitor-exit p0

    return v0

    :goto_0
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1
.end method

.method private static d(Ljava/lang/String;)Z
    .locals 2

    .line 306
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x4b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x7

    .line 307
    div-int/lit8 v0, v0, 0x0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_2

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 308
    :cond_1
    new-instance v0, Lcom/appsflyer/internal/AFd1ySDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFd1ySDK;-><init>()V

    invoke-static {}, Lcom/appsflyer/internal/AFd1wSDK;->v()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/appsflyer/internal/AFd1ySDK;->registerClient(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0

    .line 309
    :cond_2
    :goto_1
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p0, p0, 0x29

    rem-int/lit16 v0, p0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 p0, p0, 0x2

    const/4 v0, 0x1

    if-eqz p0, :cond_3

    const/16 p0, 0x44

    div-int/lit8 p0, p0, 0x0

    :cond_3
    return v0
.end method

.method private static d(Ljava/lang/String;[Ljava/lang/StackTraceElement;)[Ljava/lang/String;
    .locals 2

    .line 311
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    long-to-int p1, v0

    const v0, -0x3c18d5b9

    const v1, 0x3c18d5bc

    invoke-static {p0, v0, v1, p1}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method private declared-synchronized e()V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0xb

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v0, 0x1

    .line 17
    :try_start_1
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    :try_start_2
    const-string v0, "r_debugging_on"

    .line 20
    .line 21
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 22
    .line 23
    const-string v2, "yyyy-MM-dd HH:mm:ssZ"

    .line 24
    .line 25
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 26
    .line 27
    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x0

    .line 43
    new-array v2, v2, [Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {p0, v0, v1, v2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 46
    .line 47
    .line 48
    :try_start_3
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 49
    .line 50
    add-int/lit8 v0, v0, 0xd

    .line 51
    .line 52
    rem-int/lit16 v0, v0, 0x80

    .line 53
    .line 54
    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto :goto_0

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    move-object v4, v0

    .line 62
    :try_start_4
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 63
    .line 64
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->PROXY:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 65
    .line 66
    const-string v3, "Error while starting remote debugger"

    .line 67
    .line 68
    const/4 v6, 0x1

    .line 69
    const/4 v7, 0x1

    .line 70
    const/4 v5, 0x1

    .line 71
    invoke-virtual/range {v1 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 72
    .line 73
    .line 74
    monitor-exit p0

    .line 75
    return-void

    .line 76
    :goto_0
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 77
    throw v0
.end method

.method public static force()V
    .locals 1

    .line 1
    const/16 v0, 0x12

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/appsflyer/internal/AFd1wSDK;->AFLoggerLogLevel:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        -0x21e0c15d
        0x64a1c383
        0x32ed4eed
        -0x28feb00a
        -0x6becd846
        0x5e69765e
        -0x77428a16
        -0x8c1f50d
        0x2a272167
        -0x7c9eb97e
        -0x21942169
        0x6bb25fda
        -0x505fe132
        0xa97ec3b
        -0x4890aa44
        -0x36455434    # -1529209.5f
        -0x69d30092
        0x44c9ddff
    .end array-data
.end method

.method public static synthetic registerClient([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 5

    .line 1
    mul-int/lit8 v0, p1, 0x32

    .line 2
    .line 3
    mul-int/lit8 v1, p2, -0x61

    .line 4
    .line 5
    add-int/2addr v1, v0

    .line 6
    not-int v0, p2

    .line 7
    not-int v2, p3

    .line 8
    or-int v3, v0, v2

    .line 9
    .line 10
    not-int v3, v3

    .line 11
    or-int v4, v0, p1

    .line 12
    .line 13
    not-int v4, v4

    .line 14
    or-int/2addr v3, v4

    .line 15
    mul-int/lit8 v3, v3, 0x62

    .line 16
    .line 17
    add-int/2addr v3, v1

    .line 18
    not-int v1, p1

    .line 19
    or-int/2addr v1, v2

    .line 20
    not-int v1, v1

    .line 21
    or-int/2addr v1, v0

    .line 22
    or-int v2, p1, p3

    .line 23
    .line 24
    not-int v2, v2

    .line 25
    or-int/2addr v1, v2

    .line 26
    mul-int/lit8 v1, v1, -0x31

    .line 27
    .line 28
    add-int/2addr v1, v3

    .line 29
    or-int/2addr p3, v0

    .line 30
    not-int p3, p3

    .line 31
    or-int/2addr p1, p2

    .line 32
    not-int p1, p1

    .line 33
    or-int/2addr p1, p3

    .line 34
    mul-int/lit8 p1, p1, 0x31

    .line 35
    .line 36
    add-int/2addr p1, v1

    .line 37
    const/4 p2, 0x1

    .line 38
    if-eq p1, p2, :cond_9

    .line 39
    .line 40
    const/4 p3, 0x2

    .line 41
    const/4 v0, 0x0

    .line 42
    if-eq p1, p3, :cond_8

    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    if-eq p1, v1, :cond_3

    .line 46
    .line 47
    aget-object p1, p0, v0

    .line 48
    .line 49
    check-cast p1, Lcom/appsflyer/internal/AFd1wSDK;

    .line 50
    .line 51
    aget-object p0, p0, p2

    .line 52
    .line 53
    check-cast p0, Ljava/lang/Number;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    sget p2, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 60
    .line 61
    add-int/lit8 p2, p2, 0x3d

    .line 62
    .line 63
    rem-int/lit16 p2, p2, 0x80

    .line 64
    .line 65
    sput p2, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 66
    .line 67
    float-to-double p2, p0

    .line 68
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 69
    .line 70
    cmpl-double v0, p2, v0

    .line 71
    .line 72
    if-ltz v0, :cond_0

    .line 73
    .line 74
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_0
    const-wide/16 v0, 0x0

    .line 78
    .line 79
    cmpg-double p2, p2, v0

    .line 80
    .line 81
    if-gtz p2, :cond_1

    .line 82
    .line 83
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_1
    invoke-direct {p1}, Lcom/appsflyer/internal/AFd1wSDK;->w()F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    cmpg-float p0, p1, p0

    .line 91
    .line 92
    if-gtz p0, :cond_2

    .line 93
    .line 94
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 95
    .line 96
    add-int/lit8 p0, p0, 0x73

    .line 97
    .line 98
    rem-int/lit16 p0, p0, 0x80

    .line 99
    .line 100
    sput p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 101
    .line 102
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 103
    .line 104
    return-object p0

    .line 105
    :cond_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 106
    .line 107
    return-object p0

    .line 108
    :cond_3
    aget-object p1, p0, v0

    .line 109
    .line 110
    check-cast p1, Ljava/lang/String;

    .line 111
    .line 112
    aget-object p0, p0, p2

    .line 113
    .line 114
    check-cast p0, [Ljava/lang/StackTraceElement;

    .line 115
    .line 116
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 117
    .line 118
    add-int/lit8 v1, v1, 0x7b

    .line 119
    .line 120
    rem-int/lit16 v1, v1, 0x80

    .line 121
    .line 122
    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 123
    .line 124
    if-nez p0, :cond_5

    .line 125
    .line 126
    add-int/lit8 v1, v1, 0x39

    .line 127
    .line 128
    rem-int/lit16 p0, v1, 0x80

    .line 129
    .line 130
    sput p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 131
    .line 132
    rem-int/2addr v1, p3

    .line 133
    if-nez v1, :cond_4

    .line 134
    .line 135
    new-array p0, v0, [Ljava/lang/String;

    .line 136
    .line 137
    aput-object p1, p0, p2

    .line 138
    .line 139
    return-object p0

    .line 140
    :cond_4
    new-array p0, p2, [Ljava/lang/String;

    .line 141
    .line 142
    aput-object p1, p0, v0

    .line 143
    .line 144
    return-object p0

    .line 145
    :cond_5
    array-length v1, p0

    .line 146
    add-int/2addr v1, p2

    .line 147
    new-array v1, v1, [Ljava/lang/String;

    .line 148
    .line 149
    aput-object p1, v1, v0

    .line 150
    .line 151
    :goto_0
    array-length p1, p0

    .line 152
    if-ge p2, p1, :cond_7

    .line 153
    .line 154
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 155
    .line 156
    add-int/lit8 p1, p1, 0x49

    .line 157
    .line 158
    rem-int/lit16 v0, p1, 0x80

    .line 159
    .line 160
    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 161
    .line 162
    rem-int/2addr p1, p3

    .line 163
    if-nez p1, :cond_6

    .line 164
    .line 165
    aget-object p1, p0, p2

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    aput-object p1, v1, p2

    .line 172
    .line 173
    add-int/lit8 p2, p2, 0x32

    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_6
    aget-object p1, p0, p2

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    aput-object p1, v1, p2

    .line 183
    .line 184
    add-int/lit8 p2, p2, 0x1

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_7
    return-object v1

    .line 188
    :cond_8
    aget-object p0, p0, v0

    .line 189
    .line 190
    check-cast p0, Lcom/appsflyer/internal/AFd1wSDK;

    .line 191
    .line 192
    sget p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 193
    .line 194
    add-int/lit8 p1, p1, 0x27

    .line 195
    .line 196
    rem-int/lit16 p1, p1, 0x80

    .line 197
    .line 198
    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 199
    .line 200
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 201
    .line 202
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    const-string p1, "participantInProxy"

    .line 207
    .line 208
    invoke-interface {p0, p1}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 212
    .line 213
    add-int/lit8 p0, p0, 0x3b

    .line 214
    .line 215
    rem-int/lit16 p0, p0, 0x80

    .line 216
    .line 217
    sput p0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 218
    .line 219
    const/4 p0, 0x0

    .line 220
    return-object p0

    .line 221
    :cond_9
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1wSDK;->d([Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0
.end method

.method private registerClient(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 241
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    const v0, 0x58727eef

    const v1, -0x58727eee    # -3.92753E-15f

    invoke-static {p1, v0, v1, p0}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    return-object p0
.end method

.method private unregisterClient(Z)V
    .locals 1

    .line 45
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x79

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 46
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    move-result-object p0

    const-string v0, "participantInProxy"

    invoke-interface {p0, v0, p1}, Lcom/appsflyer/internal/AFc1kSDK;->registerClient(Ljava/lang/String;Z)V

    .line 47
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p0, p0, 0x59

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_0

    const/16 p0, 0x1f

    div-int/lit8 p0, p0, 0x0

    :cond_0
    return-void
.end method

.method private static v()Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x39

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0xd

    .line 10
    .line 11
    rem-int/lit16 v1, v0, 0x80

    .line 12
    .line 13
    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 14
    .line 15
    rem-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-string v0, "7.0.1"

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    throw v0
.end method

.method private w()F
    .locals 2

    .line 1
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1wSDK;->force:Ljava/security/SecureRandom;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/Random;->nextFloat()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x48

    .line 20
    .line 21
    div-int/lit8 v0, v0, 0x0

    .line 22
    .line 23
    :cond_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x21

    .line 26
    .line 27
    rem-int/lit16 v1, v0, 0x80

    .line 28
    .line 29
    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 30
    .line 31
    rem-int/lit8 v0, v0, 0x2

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    return p0

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    throw p0
.end method


# virtual methods
.method public final AFKeystoreWrapper()V
    .locals 2

    .line 183
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x69

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    const/4 v1, 0x0

    .line 184
    iput-boolean v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->v:Z

    add-int/lit8 v0, v0, 0x47

    .line 185
    rem-int/lit16 p0, v0, 0x80

    sput p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public final AFKeystoreWrapper(Ljava/lang/String;ILjava/lang/String;)V
    .locals 3

    .line 180
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x7b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v0, v0, 0x2

    const-string v1, "server_response"

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    .line 181
    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v0, v2

    aput-object p3, v0, v2

    invoke-direct {p0, v1, p1, v0}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2, p3}, [Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v1, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 182
    :goto_0
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p0, p0, 0x77

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 p0, p0, 0x2

    if-eqz p0, :cond_1

    const/16 p0, 0x34

    div-int/2addr p0, v2

    :cond_1
    return-void
.end method

.method public final AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 186
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x73

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 187
    const-string v0, "server_request"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v0, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 188
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p0, p0, 0x33

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public final AFLogger(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 215
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x73

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 216
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v1, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void

    :cond_0
    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v1, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public final AFLogger()Z
    .locals 3

    .line 232
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x17

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 233
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v0}, Lcom/appsflyer/internal/AFc1bSDK;->i()Lcom/appsflyer/internal/AFf1hSDK;

    move-result-object v0

    .line 234
    iget-object v0, v0, Lcom/appsflyer/internal/AFf1hSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

    .line 235
    iget-object v0, v0, Lcom/appsflyer/internal/AFf1jSDK;->AFLogger:Lcom/appsflyer/internal/AFh1aSDK;

    .line 236
    invoke-static {v0}, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1aSDK;)Lcom/appsflyer/internal/AFh1cSDK;

    move-result-object v0

    .line 237
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->i()Lcom/appsflyer/internal/AFf1hSDK;

    move-result-object v1

    .line 238
    iget-object v1, v1, Lcom/appsflyer/internal/AFf1hSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1jSDK;

    .line 239
    iget-object v1, v1, Lcom/appsflyer/internal/AFf1jSDK;->d:Lcom/appsflyer/internal/AFh1aSDK;

    .line 240
    invoke-static {v1}, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1aSDK;)Lcom/appsflyer/internal/AFh1cSDK;

    move-result-object v1

    .line 241
    invoke-direct {p0, v0, v1}, Lcom/appsflyer/internal/AFd1wSDK;->d(Lcom/appsflyer/internal/AFh1cSDK;Lcom/appsflyer/internal/AFh1cSDK;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 242
    sget v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v1, v1, 0x31

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    .line 243
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->e()V

    return v0

    :cond_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->e()V

    const/4 p0, 0x0

    throw p0

    .line 244
    :cond_1
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient()V

    .line 245
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFd1wSDK;->d()V

    .line 246
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p0, p0, 0x19

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    return v0
.end method

.method public final declared-synchronized d()V
    .locals 8

    monitor-enter p0

    .line 275
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v1, v0, 0x51

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 276
    iget-boolean v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z

    const/4 v2, 0x0

    if-nez v1, :cond_2

    add-int/lit8 v1, v0, 0x7b

    .line 277
    rem-int/lit16 v3, v1, 0x80

    sput v3, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v1, v1, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 278
    iget-boolean v3, p0, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient:Z

    if-nez v1, :cond_0

    const/16 v1, 0x50

    .line 279
    :try_start_1
    div-int/2addr v1, v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_2

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_2
    throw v0

    :catchall_1
    move-exception v0

    goto :goto_1

    :cond_0
    if-nez v3, :cond_2

    :goto_0
    add-int/lit8 v0, v0, 0x11

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    const/4 v0, 0x0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 280
    :cond_2
    :try_start_4
    iput-boolean v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z

    .line 281
    iput-boolean v2, p0, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 282
    :try_start_5
    const-string v0, "r_debugging_off"

    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v3, "yyyy-MM-dd HH:mm:ssZ"

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v1, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/String;

    invoke-direct {p0, v0, v1, v2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 283
    :try_start_6
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x1f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    monitor-exit p0

    return-void

    :catchall_2
    move-exception v0

    move-object v4, v0

    .line 284
    :try_start_7
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->PROXY:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v3, "Error while stopping remote debugger"

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v5, 0x1

    invoke-virtual/range {v1 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 285
    monitor-exit p0

    return-void

    :goto_1
    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    throw v0
.end method

.method public final varargs d(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    .line 250
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x57

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    rem-int/lit8 v0, v0, 0x2

    const-string v1, "public_api_call"

    if-eqz v0, :cond_0

    .line 251
    invoke-direct {p0, v1, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 252
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 p0, p0, 0x61

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    return-void

    .line 253
    :cond_0
    invoke-direct {p0, v1, p1, p2}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    const/4 p0, 0x0

    .line 254
    throw p0
.end method

.method public final i()Z
    .locals 1

    .line 1
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x3d

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 8
    .line 9
    iget-boolean p0, p0, Lcom/appsflyer/internal/AFd1wSDK;->i:Z

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x3f

    .line 12
    .line 13
    rem-int/lit16 v0, v0, 0x80

    .line 14
    .line 15
    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 16
    .line 17
    return p0
.end method

.method public final declared-synchronized registerClient()V
    .locals 1

    monitor-enter p0

    .line 236
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    add-int/lit8 v0, v0, 0x33

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    const/4 v0, 0x0

    .line 237
    iput-boolean v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient:Z

    .line 238
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFd1wSDK;->unregisterClient()V

    .line 239
    invoke-direct {p0}, Lcom/appsflyer/internal/AFd1wSDK;->afDebugLog()V

    .line 240
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v0, v0, 0x3f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final registerClient(Ljava/lang/Throwable;)V
    .locals 5

    .line 226
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 227
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 228
    sget v3, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 v3, v3, 0x79

    rem-int/lit16 v4, v3, 0x80

    sput v4, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_0

    .line 229
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 230
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    throw v2

    .line 231
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    :goto_0
    if-nez v0, :cond_2

    .line 232
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    .line 233
    :goto_1
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    long-to-int v0, v3

    const v3, -0x3c18d5b9

    const v4, 0x3c18d5bc

    invoke-static {p1, v3, v4, v0}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    .line 234
    const-string v0, "exception"

    invoke-direct {p0, v0, v1, p1}, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 235
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    add-int/lit8 p0, p0, 0x11

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_3

    return-void

    :cond_3
    throw v2
.end method

.method public final declared-synchronized unregisterClient()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0xd

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->registerClient:Ljava/util/Map;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    :try_start_1
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFLogger:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iput v0, p0, Lcom/appsflyer/internal/AFd1wSDK;->AFKeystoreWrapper:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    :goto_0
    monitor-exit p0

    .line 42
    return-void

    .line 43
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    throw v0
.end method

.method public final v_(Ljava/lang/String;Landroid/content/pm/PackageManager;)V
    .locals 7

    .line 1
    sget p2, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 2
    .line 3
    add-int/lit8 p2, p2, 0x49

    .line 4
    .line 5
    rem-int/lit16 v0, p2, 0x80

    .line 6
    .line 7
    sput v0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    rem-int/2addr p2, v0

    .line 11
    const v1, 0x62ff1f57

    .line 12
    .line 13
    .line 14
    const v2, -0x62ff1f55

    .line 15
    .line 16
    .line 17
    const v3, -0x58727eee    # -3.92753E-15f

    .line 18
    .line 19
    .line 20
    const v4, 0x58727eef

    .line 21
    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    :try_start_0
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-static {p1, v4, v3, p2}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Ljava/util/Map;

    .line 38
    .line 39
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 40
    .line 41
    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    invoke-static {v3, v2, v1, p2}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, Ljava/lang/String;

    .line 58
    .line 59
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 60
    .line 61
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->unregisterClient()Lcom/appsflyer/internal/AFd1sSDK;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1, p1, p2}, Lcom/appsflyer/internal/AFd1sSDK;->d(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1vSDK;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const/16 p2, 0x28

    .line 70
    .line 71
    div-int/lit8 p2, p2, 0x0

    .line 72
    .line 73
    if-nez p1, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    invoke-static {p1, v4, v3, p2}, Lcom/appsflyer/internal/AFd1wSDK;->registerClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Ljava/util/Map;

    .line 89
    .line 90
    iget-object p2, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 91
    .line 92
    invoke-interface {p2}, Lcom/appsflyer/internal/AFc1bSDK;->AppsFlyerLib()Lcom/appsflyer/internal/AFf1fSDK;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    invoke-static {v3, v2, v1, p2}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    check-cast p2, Ljava/lang/String;

    .line 109
    .line 110
    iget-object v1, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 111
    .line 112
    invoke-interface {v1}, Lcom/appsflyer/internal/AFc1bSDK;->unregisterClient()Lcom/appsflyer/internal/AFd1sSDK;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1, p1, p2}, Lcom/appsflyer/internal/AFd1sSDK;->d(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1vSDK;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-nez p1, :cond_1

    .line 121
    .line 122
    :goto_0
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 123
    .line 124
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->PROXY:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 125
    .line 126
    const-string v3, "Could not send proxy data: request is null"

    .line 127
    .line 128
    new-instance v4, Ljava/lang/NullPointerException;

    .line 129
    .line 130
    const-string p0, "request was null"

    .line 131
    .line 132
    invoke-direct {v4, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/4 v5, 0x0

    .line 136
    const/4 v6, 0x0

    .line 137
    invoke-virtual/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1wSDK;->e:Lcom/appsflyer/internal/AFc1bSDK;

    .line 142
    .line 143
    invoke-interface {p0}, Lcom/appsflyer/internal/AFc1bSDK;->d()Ljava/util/concurrent/ExecutorService;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    new-instance p2, Lcom/appsflyer/internal/g;

    .line 148
    .line 149
    invoke-direct {p2, p1, v0}, Lcom/appsflyer/internal/g;-><init>(Ljava/lang/Object;B)V

    .line 150
    .line 151
    .line 152
    invoke-interface {p0, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    .line 155
    sget p0, Lcom/appsflyer/internal/AFd1wSDK;->afWarnLog:I

    .line 156
    .line 157
    add-int/lit8 p0, p0, 0x11

    .line 158
    .line 159
    rem-int/lit16 p0, p0, 0x80

    .line 160
    .line 161
    sput p0, Lcom/appsflyer/internal/AFd1wSDK;->afInfoLog:I

    .line 162
    .line 163
    return-void

    .line 164
    :catchall_0
    move-exception v0

    .line 165
    move-object p0, v0

    .line 166
    move-object v3, p0

    .line 167
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 168
    .line 169
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->PROXY:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 170
    .line 171
    const/4 v4, 0x0

    .line 172
    const/4 v5, 0x0

    .line 173
    const-string v2, "Could not send proxy data"

    .line 174
    .line 175
    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 176
    .line 177
    .line 178
    return-void
.end method
