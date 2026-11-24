.class public Lcom/appsflyer/share/deeplink/DeepLinkResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;,
        Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;
    }
.end annotation


# instance fields
.field private final deepLink:Lcom/appsflyer/share/deeplink/DeepLink;

.field private final error:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

.field private final status:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;


# direct methods
.method public constructor <init>(Lcom/appsflyer/share/deeplink/DeepLink;Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->deepLink:Lcom/appsflyer/share/deeplink/DeepLink;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->error:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    sget-object p1, Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;->ERROR:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->status:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    sget-object p1, Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;->FOUND:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->status:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    sget-object p1, Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;->NOT_FOUND:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    .line 23
    .line 24
    iput-object p1, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->status:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public getDeepLink()Lcom/appsflyer/share/deeplink/DeepLink;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->deepLink:Lcom/appsflyer/share/deeplink/DeepLink;

    .line 2
    .line 3
    return-object p0
.end method

.method public getError()Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->error:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    .line 2
    .line 3
    return-object p0
.end method

.method public getStatus()Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->status:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    .line 2
    .line 3
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v1, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v0, "deepLink"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->deepLink:Lcom/appsflyer/share/deeplink/DeepLink;

    .line 9
    .line 10
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v0, "error"

    .line 14
    .line 15
    iget-object v2, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->error:Lcom/appsflyer/share/deeplink/DeepLinkResult$Error;

    .line 16
    .line 17
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    const-string v0, "status"

    .line 21
    .line 22
    iget-object p0, p0, Lcom/appsflyer/share/deeplink/DeepLinkResult;->status:Lcom/appsflyer/share/deeplink/DeepLinkResult$Status;

    .line 23
    .line 24
    invoke-virtual {v1, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    move-object p0, v0

    .line 30
    move-object v5, p0

    .line 31
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 32
    .line 33
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->DDL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const-string v4, "Error while creating deeplink JSON"

    .line 38
    .line 39
    invoke-virtual/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method
