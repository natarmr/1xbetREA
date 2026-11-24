.class public abstract Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;
.super Lcom/appsflyer/sdk_base/util/BaseInitProvider;
.source "SourceFile"


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
.method public abstract getCreator()Lcom/appsflyer/sdk_base/referrer/ReferrerCreator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/appsflyer/sdk_base/referrer/ReferrerCreator<",
            "+",
            "Lcom/appsflyer/sdk_base/referrer/Referrer;",
            ">;"
        }
    .end annotation
.end method

.method public onCreate()Z
    .locals 4

    .line 1
    const-string v0, "Registering external referrer: "

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
    goto :goto_0

    .line 11
    :cond_0
    :try_start_0
    invoke-static {v1}, Lcom/appsflyer/sdk_base/util/BaseInitProvider;->isMainProcess(Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    const-string v1, "Referrer_Init_Provider"

    .line 18
    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;->getCreator()Lcom/appsflyer/sdk_base/referrer/ReferrerCreator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    new-instance v0, Lkotlin/Pair;

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;->getCreator()Lcom/appsflyer/sdk_base/referrer/ReferrerCreator;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-direct {v0, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->addExternalReferrers(Lkotlin/Pair;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :catchall_0
    :cond_1
    :goto_0
    return v2
.end method
