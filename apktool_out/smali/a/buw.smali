.class public final synthetic La/buw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/sdk_base/referrer/ReferrerCreator;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/buw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)Lcom/appsflyer/sdk_base/referrer/Referrer;
    .locals 0

    .line 1
    iget-byte p0, p0, La/buw;->a:B

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    invoke-direct {p0, p1}, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;-><init>(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    return-object p0

    :pswitch_0
    new-instance p0, Lcom/appsflyer/samsung_referrer/SamsungReferrer;

    invoke-direct {p0, p1}, Lcom/appsflyer/samsung_referrer/SamsungReferrer;-><init>(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    return-object p0

    :pswitch_1
    new-instance p0, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;

    invoke-direct {p0, p1}, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;-><init>(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
