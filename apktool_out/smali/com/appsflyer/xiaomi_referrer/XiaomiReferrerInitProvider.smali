.class public final Lcom/appsflyer/xiaomi_referrer/XiaomiReferrerInitProvider;
.super Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/sdk_base/referrer/BaseReferrerInitProvider;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getCreator()Lcom/appsflyer/sdk_base/referrer/ReferrerCreator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/appsflyer/sdk_base/referrer/ReferrerCreator<",
            "Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p0, La/buw;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p0, v0}, La/buw;-><init>(B)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method
