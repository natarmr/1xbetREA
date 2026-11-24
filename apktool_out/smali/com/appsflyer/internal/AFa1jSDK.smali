.class public final Lcom/appsflyer/internal/AFa1jSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFd1iSDK;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/appsflyer/internal/AFd1iSDK<",
        "Lcom/appsflyer/internal/AFa1gSDK;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final synthetic registerClient(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 p0, 0x0

    .line 2
    const/4 v0, 0x0

    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    .line 13
    .line 14
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string p1, "found"

    .line 18
    .line 19
    invoke-virtual {v1, p1, p0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const-string p1, "is_second_ping"

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v1, p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    const-string p0, "click_event"

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    invoke-static {p0}, Lcom/appsflyer/share/deeplink/DeepLink;->parse(Lorg/json/JSONObject;)Lcom/appsflyer/share/deeplink/DeepLink;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0, v2}, Lcom/appsflyer/share/deeplink/DeepLink;->setDeferred(Z)Lcom/appsflyer/share/deeplink/DeepLink;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :cond_1
    new-instance p0, Lcom/appsflyer/internal/AFa1gSDK;

    .line 49
    .line 50
    invoke-direct {p0, p1, v0}, Lcom/appsflyer/internal/AFa1gSDK;-><init>(ZLcom/appsflyer/share/deeplink/DeepLink;)V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_2
    :goto_0
    new-instance p1, Lcom/appsflyer/internal/AFa1gSDK;

    .line 55
    .line 56
    const/4 v1, 0x3

    .line 57
    invoke-direct {p1, p0, v0, v1, v0}, Lcom/appsflyer/internal/AFa1gSDK;-><init>(ZLcom/appsflyer/share/deeplink/DeepLink;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 58
    .line 59
    .line 60
    return-object p1
.end method
