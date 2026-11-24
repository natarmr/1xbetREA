.class public abstract Lcom/appsflyer/sdk_base/util/BaseOptionalFeatureInitProvider;
.super Lcom/appsflyer/sdk_base/util/BaseInitProvider;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H$J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/appsflyer/sdk_base/util/BaseOptionalFeatureInitProvider;",
        "Lcom/appsflyer/sdk_base/util/BaseInitProvider;",
        "<init>",
        "()V",
        "getFeature",
        "Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;",
        "onCreate",
        "",
        "sdk_base_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/sdk_base/util/BaseInitProvider;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract getFeature()Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;
.end method

.method public onCreate()Z
    .locals 4

    .line 1
    const-string v0, "Registering optional feature: "

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    :try_start_0
    sget-object v3, Lcom/appsflyer/sdk_base/util/BaseInitProvider;->Companion:Lcom/appsflyer/sdk_base/util/BaseInitProvider$Companion;

    .line 12
    .line 13
    invoke-virtual {v3, v1}, Lcom/appsflyer/sdk_base/util/BaseInitProvider$Companion;->isMainProcess(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/util/BaseOptionalFeatureInitProvider;->getFeature()Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string v1, "Init_Provider"

    .line 24
    .line 25
    new-instance v3, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    sget-object v0, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->Companion:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator$Companion;->addOptionalFeature(Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    :catchall_0
    :cond_1
    return v2
.end method
