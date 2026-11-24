.class public final synthetic La/g940;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m940;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(La/m940;JB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/g940;->a:B

    iput-object p1, p0, La/g940;->b:La/m940;

    iput-wide p2, p0, La/g940;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/g940;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-wide v2, p0, La/g940;->c:J

    .line 5
    .line 6
    iget-object p0, p0, La/g940;->b:La/m940;

    .line 7
    .line 8
    check-cast p1, La/k0w0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/m940;->L:La/r990;

    .line 14
    .line 15
    iget-object p0, p0, La/m940;->M:La/v6k;

    .line 16
    .line 17
    iget-object p0, p0, La/v6k;->a:La/efi;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance p0, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;

    .line 23
    .line 24
    invoke-direct {p0, v0, v1, v2, v3}, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;-><init>(La/r990;ZJ)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, La/m940;->O:La/s9m0;

    .line 37
    .line 38
    new-instance v0, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;

    .line 39
    .line 40
    sget-object v4, La/pjn0;->d:La/pjn0;

    .line 41
    .line 42
    new-instance v5, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams$CallbackParams;

    .line 43
    .line 44
    invoke-direct {v5, v2, v3}, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams$CallbackParams;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, v1, v4, v5}, Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;-><init>(ZLa/pjn0;Lorg/xplatform/support/api/navigation/SupportMenuScreenParams$AdditionalParams;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, La/s9m0;->f(Lorg/xplatform/support/api/navigation/SupportMenuScreenParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
