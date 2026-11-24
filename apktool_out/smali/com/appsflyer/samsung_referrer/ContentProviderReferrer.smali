.class public abstract Lcom/appsflyer/samsung_referrer/ContentProviderReferrer;
.super Lcom/appsflyer/sdk_base/referrer/Referrer;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/appsflyer/sdk_base/referrer/Referrer;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public start(Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/sdk_base/util/ContentProviderFetcher<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->valid()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/appsflyer/sdk_base/util/ContentProviderFetcher;->start()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->start()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
