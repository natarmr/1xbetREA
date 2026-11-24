.class public final synthetic La/oau0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/abu0;


# direct methods
.method public synthetic constructor <init>(La/abu0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/oau0;->a:B

    iput-object p1, p0, La/oau0;->b:La/abu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/oau0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/oau0;->b:La/abu0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, La/abu0;->C:La/ra10;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/abu0;->z(La/ra10;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, La/abu0;->C:La/ra10;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/abu0;->z(La/ra10;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, La/abu0;->k:La/r990;

    .line 40
    .line 41
    iget-object p0, p0, La/abu0;->m:La/v6k;

    .line 42
    .line 43
    iget-object p0, p0, La/v6k;->a:La/efi;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance p0, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    const-wide/16 v2, 0x0

    .line 52
    .line 53
    invoke-direct {p0, v0, v1, v2, v3}, Lorg/xplatform/feature/office/payment/impl/di/navigation/PaymentScreenFactoryImpl$getPaymentScreen$1;-><init>(La/r990;ZJ)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p0}, La/k0w0;->k(La/m7h0;)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
