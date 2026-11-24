.class public final Lcom/appsflyer/internal/AFg1mSDK;
.super Lcom/appsflyer/internal/AFe1kSDK;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/appsflyer/internal/AFe1kSDK<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final AFLoggerLogLevel:Lcom/appsflyer/share/AppsFlyerConversionListener;

.field private final afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

.field private afInfoLog:Ljava/lang/String;

.field private afWarnLog:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final force:Lcom/appsflyer/internal/AFc1iSDK;

.field private final v:Lcom/appsflyer/internal/AFc1kSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->afDebugLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    new-array v1, v1, [Lcom/appsflyer/internal/AFe1zSDK;

    .line 8
    .line 9
    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    aput-object v2, v1, v3

    .line 13
    .line 14
    const-string v2, "GCD-FETCH"

    .line 15
    .line 16
    invoke-direct {p0, v0, v1, p1, v2}, Lcom/appsflyer/internal/AFe1kSDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/appsflyer/internal/AFg1mSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    .line 27
    .line 28
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFKeystoreWrapper()Lcom/appsflyer/internal/AFc1kSDK;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/appsflyer/internal/AFg1mSDK;->v:Lcom/appsflyer/internal/AFc1kSDK;

    .line 36
    .line 37
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->e()Lcom/appsflyer/internal/AFh1xSDK;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/appsflyer/internal/AFg1mSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 45
    .line 46
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->setUserFirstName()Lcom/appsflyer/share/AppsFlyerConversionListener;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lcom/appsflyer/internal/AFg1mSDK;->AFLoggerLogLevel:Lcom/appsflyer/share/AppsFlyerConversionListener;

    .line 51
    .line 52
    sget-object p1, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1ySDK;->d:Ljava/util/Set;

    .line 58
    .line 59
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    sget-object p1, Lcom/appsflyer/internal/AFd1bSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1ySDK;->d:Ljava/util/Set;

    .line 68
    .line 69
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final AFLogger(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/appsflyer/internal/AFd1pSDK<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1mSDK;->v:Lcom/appsflyer/internal/AFc1kSDK;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1mSDK;->force:Lcom/appsflyer/internal/AFc1iSDK;

    .line 7
    .line 8
    const-string v2, "CHANNEL"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, ""

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    :cond_0
    invoke-static {v0, v1}, Lcom/appsflyer/internal/AFa1tSDK;->d(Lcom/appsflyer/internal/AFc1kSDK;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {}, Lcom/appsflyer/internal/AFg1jSDK;->d()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    const-string v1, "[GCD] AF detected using redundant Google-Play channel for attribution - "

    .line 61
    .line 62
    const-string v3, ". Using without channel postfix."

    .line 63
    .line 64
    invoke-static {v1, v0, v3}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 69
    .line 70
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 71
    .line 72
    const/4 v8, 0x4

    .line 73
    const/4 v9, 0x0

    .line 74
    const/4 v7, 0x0

    .line 75
    invoke-static/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    const-string v1, "-"

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afDebugLog()Lcom/appsflyer/internal/AFd1sSDK;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0, v2, p1}, Lcom/appsflyer/internal/AFd1sSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    iget-object p1, p0, Lcom/appsflyer/internal/AFd1pSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1oSDK;

    .line 94
    .line 95
    iget-object p1, p1, Lcom/appsflyer/internal/AFd1oSDK;->d:Ljava/lang/String;

    .line 96
    .line 97
    const-string v0, "[GCD-B01] URL: "

    .line 98
    .line 99
    invoke-static {v0, p1}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 104
    .line 105
    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 106
    .line 107
    const/4 v5, 0x4

    .line 108
    const/4 v6, 0x0

    .line 109
    const/4 v4, 0x0

    .line 110
    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    return-object p0
.end method

.method public final AFLogger()Z
    .locals 0

    .line 114
    const/4 p0, 0x0

    return p0
.end method

.method public final bridge synthetic afWarnLog()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public final e()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final force()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1kSDK;->force()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1mSDK;->afWarnLog:Ljava/util/Map;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1mSDK;->AFLoggerLogLevel:Lcom/appsflyer/share/AppsFlyerConversionListener;

    .line 9
    .line 10
    invoke-static {v0, p0}, Lcom/appsflyer/internal/AFg1kSDK;->d(Ljava/util/Map;Lcom/appsflyer/share/AppsFlyerConversionListener;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1mSDK;->afInfoLog:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    :cond_1
    const/4 v0, 0x0

    .line 25
    :cond_2
    if-nez v0, :cond_3

    .line 26
    .line 27
    const-string v0, "Unknown error"

    .line 28
    .line 29
    :cond_3
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1mSDK;->AFLoggerLogLevel:Lcom/appsflyer/share/AppsFlyerConversionListener;

    .line 30
    .line 31
    invoke-static {v0, p0}, Lcom/appsflyer/internal/AFg1kSDK;->registerClient(Ljava/lang/String;Lcom/appsflyer/share/AppsFlyerConversionListener;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final registerClient()Lcom/appsflyer/internal/AFd1cSDK;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "is_first_launch"

    .line 4
    .line 5
    const-string v3, "af_channel"

    .line 6
    .line 7
    const-string v4, "af_siteid"

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/appsflyer/internal/AFe1kSDK;->afInfoLog()Lcom/appsflyer/internal/AFf1fSDK;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_11

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    move v6, v5

    .line 21
    :goto_0
    const/4 v0, 0x3

    .line 22
    if-ge v6, v0, :cond_10

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    const/4 v7, 0x1

    .line 26
    if-ne v6, v0, :cond_0

    .line 27
    .line 28
    move v8, v7

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    move v8, v5

    .line 31
    :goto_1
    iget-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v9

    .line 37
    iput-wide v9, v0, Lcom/appsflyer/internal/AFh1xSDK;->afDebugLog:J

    .line 38
    .line 39
    :try_start_0
    invoke-super {v1}, Lcom/appsflyer/internal/AFe1kSDK;->registerClient()Lcom/appsflyer/internal/AFd1cSDK;

    .line 40
    .line 41
    .line 42
    iget-object v0, v1, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_1
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    const/16 v10, 0x193

    .line 52
    .line 53
    if-eq v9, v10, :cond_3

    .line 54
    .line 55
    const/16 v10, 0x1f4

    .line 56
    .line 57
    if-lt v9, v10, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move v10, v5

    .line 61
    goto :goto_3

    .line 62
    :cond_3
    :goto_2
    move v10, v7

    .line 63
    :goto_3
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->isSuccessful()Z

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    const/16 v12, 0x194

    .line 68
    .line 69
    if-nez v11, :cond_7

    .line 70
    .line 71
    if-ne v9, v12, :cond_4

    .line 72
    .line 73
    goto :goto_6

    .line 74
    :cond_4
    if-nez v8, :cond_6

    .line 75
    .line 76
    if-nez v10, :cond_5

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_5
    :goto_4
    const/4 v0, 0x0

    .line 80
    goto/16 :goto_9

    .line 81
    .line 82
    :cond_6
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v7, "Error connection to server: "

    .line 88
    .line 89
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iput-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->afInfoLog:Ljava/lang/String;

    .line 100
    .line 101
    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 102
    .line 103
    goto/16 :goto_9

    .line 104
    .line 105
    :catchall_0
    move-exception v0

    .line 106
    goto/16 :goto_d

    .line 107
    .line 108
    :catch_0
    move-exception v0

    .line 109
    move-object v12, v0

    .line 110
    goto/16 :goto_a

    .line 111
    .line 112
    :catch_1
    move-exception v0

    .line 113
    goto/16 :goto_c

    .line 114
    .line 115
    :cond_7
    :goto_6
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getBody()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-static {v9}, La/zys0;->c(Ljava/lang/Object;)Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-ne v0, v12, :cond_8

    .line 131
    .line 132
    const-string v0, "error_reason"

    .line 133
    .line 134
    invoke-interface {v9, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    const-string v0, "status_code"

    .line 138
    .line 139
    invoke-interface {v9, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    const-string v0, "af_status"

    .line 143
    .line 144
    const-string v10, "Organic"

    .line 145
    .line 146
    invoke-interface {v9, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    const-string v0, "af_message"

    .line 150
    .line 151
    const-string v10, "organic install"

    .line 152
    .line 153
    invoke-interface {v9, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    :cond_8
    const-string v0, "iscache"

    .line 157
    .line 158
    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_9

    .line 169
    .line 170
    iget-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->v:Lcom/appsflyer/internal/AFc1kSDK;

    .line 171
    .line 172
    const-string v11, "appsflyerConversionDataCacheExpiration"

    .line 173
    .line 174
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 175
    .line 176
    .line 177
    move-result-wide v12

    .line 178
    invoke-interface {v0, v11, v12, v13}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;J)V

    .line 179
    .line 180
    .line 181
    :cond_9
    invoke-interface {v9, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_b

    .line 186
    .line 187
    invoke-interface {v9, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_a

    .line 192
    .line 193
    invoke-interface {v9, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    new-instance v7, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    const-string v11, "[Invite] Detected App-Invite via channel: "

    .line 203
    .line 204
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    :goto_7
    move-object v13, v0

    .line 215
    goto :goto_8

    .line 216
    :cond_a
    const-string v0, "[CrossPromotion] App was installed via %s\'s Cross Promotion"

    .line 217
    .line 218
    invoke-interface {v9, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v11

    .line 226
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    invoke-static {v0, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    goto :goto_7

    .line 235
    :goto_8
    sget-object v11, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 236
    .line 237
    sget-object v12, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 238
    .line 239
    const/4 v15, 0x4

    .line 240
    const/16 v16, 0x0

    .line 241
    .line 242
    const/4 v14, 0x0

    .line 243
    invoke-static/range {v11 .. v16}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    :cond_b
    invoke-interface {v9, v2, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    iget-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->v:Lcom/appsflyer/internal/AFc1kSDK;

    .line 250
    .line 251
    const-string v7, "attributionId"

    .line 252
    .line 253
    new-instance v10, Lorg/json/JSONObject;

    .line 254
    .line 255
    invoke-direct {v10, v9}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v10

    .line 262
    invoke-interface {v0, v7, v10}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    iget-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->v:Lcom/appsflyer/internal/AFc1kSDK;

    .line 266
    .line 267
    const-string v7, "sixtyDayConversionData"

    .line 268
    .line 269
    invoke-interface {v0, v7}, Lcom/appsflyer/internal/AFc1kSDK;->AFKeystoreWrapper(Ljava/lang/String;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-nez v0, :cond_c

    .line 274
    .line 275
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 276
    .line 277
    invoke-interface {v9, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    :cond_c
    iput-object v9, v1, Lcom/appsflyer/internal/AFg1mSDK;->afWarnLog:Ljava/util/Map;

    .line 281
    .line 282
    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->d:Lcom/appsflyer/internal/AFd1cSDK;
    :try_end_0
    .catch Lcom/appsflyer/internal/AFe1uSDK; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 283
    .line 284
    :goto_9
    iget-object v7, v1, Lcom/appsflyer/internal/AFg1mSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 285
    .line 286
    if-nez v0, :cond_d

    .line 287
    .line 288
    invoke-virtual {v7, v6}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger(I)V

    .line 289
    .line 290
    .line 291
    sget-object v8, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 292
    .line 293
    sget-object v9, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 294
    .line 295
    const/4 v12, 0x4

    .line 296
    const/4 v13, 0x0

    .line 297
    const-string v10, "[GCD-A03] Server retrieving attempt finished"

    .line 298
    .line 299
    const/4 v11, 0x0

    .line 300
    invoke-static/range {v8 .. v13}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    goto :goto_b

    .line 304
    :cond_d
    invoke-virtual {v7, v6}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger(I)V

    .line 305
    .line 306
    .line 307
    sget-object v14, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 308
    .line 309
    sget-object v15, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 310
    .line 311
    const/16 v18, 0x4

    .line 312
    .line 313
    const/16 v19, 0x0

    .line 314
    .line 315
    const-string v16, "[GCD-A03] Server retrieving attempt finished"

    .line 316
    .line 317
    const/16 v17, 0x0

    .line 318
    .line 319
    invoke-static/range {v14 .. v19}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    return-object v0

    .line 323
    :goto_a
    :try_start_1
    sget-object v9, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 324
    .line 325
    sget-object v10, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 326
    .line 327
    invoke-virtual {v12}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    if-nez v0, :cond_e

    .line 332
    .line 333
    const-string v0, "unknown error during GCD fetch"

    .line 334
    .line 335
    :cond_e
    new-instance v7, Ljava/lang/StringBuilder;

    .line 336
    .line 337
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 338
    .line 339
    .line 340
    const-string v11, "[GCD] Error: "

    .line 341
    .line 342
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v11

    .line 352
    const/16 v17, 0x40

    .line 353
    .line 354
    const/16 v18, 0x0

    .line 355
    .line 356
    const/4 v13, 0x1

    .line 357
    const/4 v14, 0x0

    .line 358
    const/4 v15, 0x0

    .line 359
    const/16 v16, 0x0

    .line 360
    .line 361
    invoke-static/range {v9 .. v18}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 362
    .line 363
    .line 364
    if-nez v8, :cond_f

    .line 365
    .line 366
    iget-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 367
    .line 368
    invoke-virtual {v0, v6}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger(I)V

    .line 369
    .line 370
    .line 371
    const/16 v17, 0x4

    .line 372
    .line 373
    const/16 v18, 0x0

    .line 374
    .line 375
    const-string v15, "[GCD-A03] Server retrieving attempt finished"

    .line 376
    .line 377
    const/16 v16, 0x0

    .line 378
    .line 379
    move-object v13, v9

    .line 380
    move-object v14, v10

    .line 381
    invoke-static/range {v13 .. v18}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    :goto_b
    add-int/lit8 v6, v6, 0x1

    .line 385
    .line 386
    goto/16 :goto_0

    .line 387
    .line 388
    :cond_f
    :try_start_2
    invoke-virtual {v12}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    iput-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->afInfoLog:Ljava/lang/String;

    .line 393
    .line 394
    throw v12

    .line 395
    :goto_c
    const-string v9, "[GCD-E05] AppsFlyer dev key is missing"

    .line 396
    .line 397
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 398
    .line 399
    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 400
    .line 401
    const/4 v11, 0x4

    .line 402
    const/4 v12, 0x0

    .line 403
    const/4 v10, 0x0

    .line 404
    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    const-string v2, "AppsFlyer dev key is missing"

    .line 408
    .line 409
    iput-object v2, v1, Lcom/appsflyer/internal/AFg1mSDK;->afInfoLog:Ljava/lang/String;

    .line 410
    .line 411
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 412
    :goto_d
    iget-object v1, v1, Lcom/appsflyer/internal/AFg1mSDK;->afDebugLog:Lcom/appsflyer/internal/AFh1xSDK;

    .line 413
    .line 414
    invoke-virtual {v1, v6}, Lcom/appsflyer/internal/AFh1xSDK;->AFLogger(I)V

    .line 415
    .line 416
    .line 417
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 418
    .line 419
    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 420
    .line 421
    const/4 v11, 0x4

    .line 422
    const/4 v12, 0x0

    .line 423
    const-string v9, "[GCD-A03] Server retrieving attempt finished"

    .line 424
    .line 425
    const/4 v10, 0x0

    .line 426
    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    throw v0

    .line 430
    :cond_10
    sget-object v0, Lcom/appsflyer/internal/AFd1cSDK;->registerClient:Lcom/appsflyer/internal/AFd1cSDK;

    .line 431
    .line 432
    return-object v0

    .line 433
    :cond_11
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 434
    .line 435
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->GCD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 436
    .line 437
    const/4 v6, 0x4

    .line 438
    const/4 v7, 0x0

    .line 439
    const-string v4, "[GCD-E03] \'isStopTracking\' enabled"

    .line 440
    .line 441
    const/4 v5, 0x0

    .line 442
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    const-string v0, "\'isStopTracking\' enabled"

    .line 446
    .line 447
    iput-object v0, v1, Lcom/appsflyer/internal/AFg1mSDK;->afInfoLog:Ljava/lang/String;

    .line 448
    .line 449
    new-instance v0, Lcom/appsflyer/internal/AFe1qSDK;

    .line 450
    .line 451
    invoke-direct {v0}, Lcom/appsflyer/internal/AFe1qSDK;-><init>()V

    .line 452
    .line 453
    .line 454
    throw v0
.end method
