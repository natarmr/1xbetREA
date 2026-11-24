.class public final Lcom/appsflyer/internal/AFe1nSDK;
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
.field private final afWarnLog:Lcom/appsflyer/internal/AFc1iSDK;

.field private final force:Lcom/appsflyer/internal/AFj1bSDK;

.field private final v:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;Lcom/appsflyer/internal/AFj1bSDK;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFd1bSDK;

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    new-array v1, v1, [Lcom/appsflyer/internal/AFe1zSDK;

    .line 11
    .line 12
    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    aput-object v2, v1, v3

    .line 16
    .line 17
    sget-object v2, Lcom/appsflyer/internal/AFd1bSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFd1bSDK;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    aput-object v2, v1, v3

    .line 21
    .line 22
    invoke-direct {p0, v0, v1, p1, p2}, Lcom/appsflyer/internal/AFe1kSDK;-><init>(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lcom/appsflyer/internal/AFe1nSDK;->v:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p3, p0, Lcom/appsflyer/internal/AFe1nSDK;->force:Lcom/appsflyer/internal/AFj1bSDK;

    .line 28
    .line 29
    invoke-interface {p1}, Lcom/appsflyer/internal/AFc1bSDK;->AFLogger()Lcom/appsflyer/internal/AFc1iSDK;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/appsflyer/internal/AFe1nSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1iSDK;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final AFLogger(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;
    .locals 2
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
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFe1kSDK;->afDebugLog()Lcom/appsflyer/internal/AFd1sSDK;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1nSDK;->afWarnLog:Lcom/appsflyer/internal/AFc1iSDK;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1nSDK;->v:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v1, "advertising_id"

    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    :goto_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1nSDK;->v:Ljava/lang/String;

    .line 52
    .line 53
    :goto_1
    invoke-virtual {p1, p0}, Lcom/appsflyer/internal/AFd1sSDK;->d(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    return-object p0
.end method

.method public final AFLogger()Z
    .locals 0

    .line 61
    const/4 p0, 0x0

    return p0
.end method

.method public final afWarnLog()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;
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
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/appsflyer/internal/AFe1kSDK;->force()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFe1kSDK;->i:Lcom/appsflyer/internal/AFd1fSDK;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_0

    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0xc8

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eq v1, v2, :cond_3

    .line 18
    .line 19
    const/16 v2, 0x12d

    .line 20
    .line 21
    if-eq v1, v2, :cond_1

    .line 22
    .line 23
    const/16 v2, 0x12e

    .line 24
    .line 25
    if-eq v1, v2, :cond_1

    .line 26
    .line 27
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1nSDK;->v:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFd1fSDK;->getStatusCode()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "call to "

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, " failed: "

    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 56
    .line 57
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->CROSS_PROMOTION:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    invoke-virtual {v0, v1, p0, v2}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    iget-object v1, p0, Lcom/appsflyer/internal/AFe1nSDK;->v:Ljava/lang/String;

    .line 65
    .line 66
    const-string v2, "Cross promotion redirection success: "

    .line 67
    .line 68
    invoke-static {v2, v1}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 73
    .line 74
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->CROSS_PROMOTION:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 75
    .line 76
    invoke-virtual {v2, v4, v1, v3}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v1, "Location"

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Lcom/appsflyer/internal/AFd1fSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1nSDK;->force:Lcom/appsflyer/internal/AFj1bSDK;

    .line 88
    .line 89
    if-eqz p0, :cond_2

    .line 90
    .line 91
    iput-object v0, p0, Lcom/appsflyer/internal/AFj1bSDK;->unregisterClient:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1bSDK;->AFKeystoreWrapper:Ljava/lang/ref/WeakReference;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Landroid/content/Context;

    .line 100
    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1bSDK;->unregisterClient:Ljava/lang/String;

    .line 104
    .line 105
    if-eqz v1, :cond_2

    .line 106
    .line 107
    new-instance v1, Landroid/content/Intent;

    .line 108
    .line 109
    const-string v2, "android.intent.action.VIEW"

    .line 110
    .line 111
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1bSDK;->unregisterClient:Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-direct {v1, v2, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 118
    .line 119
    .line 120
    const/high16 p0, 0x10000000

    .line 121
    .line 122
    invoke-virtual {v1, p0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {v0, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :catch_0
    move-exception p0

    .line 131
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 132
    .line 133
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->CROSS_PROMOTION:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 134
    .line 135
    const-string v2, "Failed to open cross promotion URL; is a browser app installed?"

    .line 136
    .line 137
    invoke-virtual {v0, v1, v2, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    :cond_2
    :goto_0
    return-void

    .line 141
    :cond_3
    iget-object p0, p0, Lcom/appsflyer/internal/AFe1nSDK;->v:Ljava/lang/String;

    .line 142
    .line 143
    const-string v0, "Cross promotion impressions success: "

    .line 144
    .line 145
    invoke-static {v0, p0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 150
    .line 151
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->CROSS_PROMOTION:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 152
    .line 153
    invoke-virtual {v0, v1, p0, v3}, Lcom/appsflyer/AFLogger;->i(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Z)V

    .line 154
    .line 155
    .line 156
    return-void
.end method
