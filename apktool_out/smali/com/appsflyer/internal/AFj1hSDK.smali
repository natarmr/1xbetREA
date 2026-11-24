.class public final Lcom/appsflyer/internal/AFj1hSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFj1hSDK$AFa1tSDK;
    }
.end annotation


# instance fields
.field private final registerClient:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;",
            "Lcom/appsflyer/internal/AFj1gSDK;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/appsflyer/internal/AFj1hSDK;->registerClient:Ljava/util/Map;

    .line 10
    .line 11
    return-void
.end method

.method private static AFLogger(Ljava/lang/String;)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :catch_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method


# virtual methods
.method public final isOptionalFeaturePresent(Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1hSDK;->registerClient:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/appsflyer/internal/AFj1gSDK;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/appsflyer/internal/AFj1gSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFj1gSDK;

    .line 15
    .line 16
    :cond_0
    sget-object v1, Lcom/appsflyer/internal/AFj1hSDK$AFa1tSDK;->AFLogger:[I

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    aget v0, v1, v0

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v2, 0x1

    .line 26
    if-eq v0, v2, :cond_3

    .line 27
    .line 28
    const/4 p0, 0x2

    .line 29
    if-eq v0, p0, :cond_2

    .line 30
    .line 31
    const/4 p0, 0x3

    .line 32
    if-ne v0, p0, :cond_1

    .line 33
    .line 34
    return v1

    .line 35
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 36
    .line 37
    .line 38
    return v1

    .line 39
    :cond_2
    return v2

    .line 40
    :cond_3
    sget-object v0, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->Companion:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;

    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;->getRegisteredFeatures()Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_4

    .line 51
    .line 52
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1hSDK;->registerClient:Ljava/util/Map;

    .line 53
    .line 54
    sget-object v0, Lcom/appsflyer/internal/AFj1gSDK;->registerClient:Lcom/appsflyer/internal/AFj1gSDK;

    .line 55
    .line 56
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return v1

    .line 60
    :cond_4
    invoke-virtual {p1}, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->getClassName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Lcom/appsflyer/internal/AFj1hSDK;->AFLogger(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1hSDK;->registerClient:Ljava/util/Map;

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    sget-object v1, Lcom/appsflyer/internal/AFj1gSDK;->AFLogger:Lcom/appsflyer/internal/AFj1gSDK;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    sget-object v1, Lcom/appsflyer/internal/AFj1gSDK;->registerClient:Lcom/appsflyer/internal/AFj1gSDK;

    .line 76
    .line 77
    :goto_0
    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    return v0
.end method
