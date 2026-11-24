.class public abstract Lcom/appsflyer/internal/AFe1lSDK;
.super Lcom/appsflyer/internal/AFe1kSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1kSDK<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final AFLoggerLogLevel:Lcom/appsflyer/internal/AFf1eSDK;

.field private final afDebugLog:Lcom/appsflyer/internal/AFc1eSDK;

.field private final afInfoLog:Lcom/appsflyer/internal/AFg1rSDK;

.field private final afWarnLog:Lcom/appsflyer/internal/AFc1iSDK;

.field private final force:Lcom/appsflyer/internal/AFe1zSDK;

.field private final v:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/internal/AFe1zSDK;",
            "[",
            "Lcom/appsflyer/internal/AFe1zSDK;",
            "Lcom/appsflyer/internal/AFc1bSDK;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

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
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 p4, 0x0

    .line 14
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/appsflyer/internal/AFe1kSDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1lSDK;->force:Lcom/appsflyer/internal/AFe1zSDK;

    .line 18
    .line 19
    iput-object p5, p0, Lcom/appsflyer/internal/AFe1lSDK;->v:Ljava/util/Map;

    .line 20
    .line 21
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1lSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1iSDK;

    .line 29
    .line 30
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->force()Lcom/appsflyer/internal/AFg1rSDK;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1lSDK;->afInfoLog:Lcom/appsflyer/internal/AFg1rSDK;

    .line 38
    .line 39
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->setOaidData()Lcom/appsflyer/internal/AFf1eSDK;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1lSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFf1eSDK;

    .line 47
    .line 48
    invoke-interface {p3}, Lcom/appsflyer/internal/AFc1bSDK;->setAndroidIdData()Lcom/appsflyer/internal/AFc1eSDK;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1lSDK;->afDebugLog:Lcom/appsflyer/internal/AFc1eSDK;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public AFKeystoreWrapper(Ljava/util/Map;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final AFLogger(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
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

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1lSDK;->v:Ljava/util/Map;

    .line 5
    .line 6
    invoke-static {v0}, La/xp20;->p(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFe1lSDK;->registerClient(Ljava/util/Map;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFe1lSDK;->AFKeystoreWrapper(Ljava/util/Map;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-direct {v3, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v3, v1}, Lcom/appsflyer/internal/AFe1lSDK;->registerClient(Ljava/util/Map;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1lSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1iSDK;

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string v4, "advertising_id"

    .line 47
    .line 48
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1lSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1iSDK;

    .line 52
    .line 53
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 54
    .line 55
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 56
    .line 57
    invoke-static {v1}, Lcom/appsflyer/internal/AFb1iSDK;->unregisterClient(Landroid/content/Context;)Lcom/appsflyer/internal/AFb1lSDK;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const/4 v4, 0x0

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    iget-object v1, v1, Lcom/appsflyer/internal/AFb1lSDK;->d:Ljava/lang/String;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    move-object v1, v4

    .line 68
    :goto_1
    if-eqz v1, :cond_4

    .line 69
    .line 70
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    const-string v5, "oaid"

    .line 78
    .line 79
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_4
    :goto_2
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1lSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1iSDK;

    .line 83
    .line 84
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 85
    .line 86
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 87
    .line 88
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v1}, Lcom/appsflyer/internal/AFb1iSDK;->h_(Landroid/content/ContentResolver;)Lcom/appsflyer/internal/AFb1lSDK;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    if-eqz v1, :cond_5

    .line 97
    .line 98
    iget-object v1, v1, Lcom/appsflyer/internal/AFb1lSDK;->d:Ljava/lang/String;

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    move-object v1, v4

    .line 102
    :goto_3
    if-eqz v1, :cond_7

    .line 103
    .line 104
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-eqz v5, :cond_6

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_6
    const-string v5, "amazon_aid"

    .line 112
    .line 113
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_7
    :goto_4
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1lSDK;->afDebugLog:Lcom/appsflyer/internal/AFc1eSDK;

    .line 117
    .line 118
    iget-boolean v5, v1, Lcom/appsflyer/internal/AFc1eSDK;->afInfoLog:Z

    .line 119
    .line 120
    if-nez v5, :cond_9

    .line 121
    .line 122
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1eSDK;->AFLoggerLogLevel:Ljava/lang/String;

    .line 123
    .line 124
    if-eqz v1, :cond_a

    .line 125
    .line 126
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eqz v5, :cond_8

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_8
    const-string v5, "imei"

    .line 134
    .line 135
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_9
    const-string v1, "deviceTrackingDisabled"

    .line 140
    .line 141
    const-string v5, "true"

    .line 142
    .line 143
    invoke-interface {v3, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    :cond_a
    :goto_5
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1lSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1iSDK;

    .line 147
    .line 148
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    .line 149
    .line 150
    invoke-static {v1}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    if-nez v1, :cond_b

    .line 155
    .line 156
    const-string v1, ""

    .line 157
    .line 158
    :cond_b
    const-string v5, "appsflyer_id"

    .line 159
    .line 160
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 164
    .line 165
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    const-string v5, "os_version"

    .line 170
    .line 171
    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    const-string v1, "sdk_version"

    .line 175
    .line 176
    const-string v5, "7.0.1"

    .line 177
    .line 178
    invoke-interface {v0, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    if-eqz v2, :cond_d

    .line 182
    .line 183
    invoke-static {v2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_c

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_c
    const-string v1, "sdk_connector_version"

    .line 191
    .line 192
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    :cond_d
    :goto_6
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1lSDK;->afInfoLog:Lcom/appsflyer/internal/AFg1rSDK;

    .line 196
    .line 197
    iget-object v2, p0, Lcom/appsflyer/internal/AFe1lSDK;->force:Lcom/appsflyer/internal/AFe1zSDK;

    .line 198
    .line 199
    invoke-interface {v1, v0, v2}, Lcom/appsflyer/internal/AFg1rSDK;->unregisterClient(Ljava/util/Map;Lcom/appsflyer/internal/AFe1zSDK;)V

    .line 200
    .line 201
    .line 202
    const-string v1, "device_data"

    .line 203
    .line 204
    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1lSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFf1eSDK;

    .line 208
    .line 209
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1lSDK;->force:Lcom/appsflyer/internal/AFe1zSDK;

    .line 210
    .line 211
    invoke-interface {v0, v3, v1}, Lcom/appsflyer/internal/AFf1eSDK;->d(Ljava/util/Map;Lcom/appsflyer/internal/AFe1zSDK;)V

    .line 212
    .line 213
    .line 214
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1lSDK;->afInfoLog:Lcom/appsflyer/internal/AFg1rSDK;

    .line 215
    .line 216
    invoke-interface {v0, v3}, Lcom/appsflyer/internal/AFg1rSDK;->unregisterClient(Ljava/util/Map;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0, v3, p1}, Lcom/appsflyer/internal/AFe1lSDK;->d(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    if-eqz p1, :cond_e

    .line 224
    .line 225
    iget-object v0, p1, Lcom/appsflyer/internal/AFd1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1oSDK;

    .line 226
    .line 227
    if-eqz v0, :cond_e

    .line 228
    .line 229
    iget-object v4, v0, Lcom/appsflyer/internal/AFd1oSDK;->d:Ljava/lang/String;

    .line 230
    .line 231
    :cond_e
    if-eqz v4, :cond_f

    .line 232
    .line 233
    new-instance v0, Lorg/json/JSONObject;

    .line 234
    .line 235
    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 236
    .line 237
    .line 238
    new-instance v1, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    const-string v2, ": preparing data: "

    .line 247
    .line 248
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-static {v1, v0}, Lcom/appsflyer/internal/AFg1bSDK;->registerClient(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afErrorLog()Lcom/appsflyer/internal/AFd1uSDK;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-interface {p0, v4, v0}, Lcom/appsflyer/internal/AFd1uSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    :cond_f
    return-object p1
.end method

.method public AFLoggerLogLevel()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final afWarnLog()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public abstract d(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
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
.end method

.method public registerClient(Ljava/util/Map;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public registerClient(Ljava/util/Map;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1lSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1iSDK;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "app_id"

    .line 15
    .line 16
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1lSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1iSDK;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1iSDK;->registerClient:Lcom/appsflyer/internal/AFc1eSDK;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1eSDK;->valueOf:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const-string v1, "cuid"

    .line 28
    .line 29
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1lSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1iSDK;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1iSDK;->r_()Landroid/content/pm/PackageInfo;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 39
    .line 40
    const-string v1, "app_version_name"

    .line 41
    .line 42
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1lSDK;->AFLoggerLogLevel()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1lSDK;->afInfoLog:Lcom/appsflyer/internal/AFg1rSDK;

    .line 52
    .line 53
    invoke-interface {p0}, Lcom/appsflyer/internal/AFg1rSDK;->unregisterClient()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string v0, "event_timestamp"

    .line 62
    .line 63
    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_1
    if-eqz p2, :cond_2

    .line 67
    .line 68
    const-string p0, "billing_lib_version"

    .line 69
    .line 70
    invoke-interface {p1, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_2
    return-void
.end method
