.class public final synthetic La/qoh0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/iph0;


# direct methods
.method public synthetic constructor <init>(La/iph0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qoh0;->a:B

    iput-object p1, p0, La/qoh0;->b:La/iph0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qoh0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/qoh0;->b:La/iph0;

    .line 5
    .line 6
    check-cast p1, La/k0w0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/iph0;->y:La/svs0;

    .line 12
    .line 13
    invoke-static {p0}, La/svs0;->c(La/svs0;)Lorg/xplatform/security/impl/navigation/TwoFactorAuthenticationScreenFactoryImpl$getRemoveTwoFactoryAuthenticationScreen$1;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, La/c8d;

    .line 24
    .line 25
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 26
    .line 27
    new-instance v0, La/v7d;

    .line 28
    .line 29
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, La/iph0;->x:La/jh70;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance p0, Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoCodesScreen$1;

    .line 46
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/c8d;

    .line 57
    .line 58
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 59
    .line 60
    new-instance v0, La/v7d;

    .line 61
    .line 62
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
