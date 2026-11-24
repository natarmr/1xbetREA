.class public final synthetic La/axz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cxz;

.field public final synthetic c:La/xrz;


# direct methods
.method public synthetic constructor <init>(La/cxz;La/xrz;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/axz;->a:B

    iput-object p1, p0, La/axz;->b:La/cxz;

    iput-object p2, p0, La/axz;->c:La/xrz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/axz;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/axz;->c:La/xrz;

    .line 4
    .line 5
    iget-object p0, p0, La/axz;->b:La/cxz;

    .line 6
    .line 7
    check-cast p1, La/k0w0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/cxz;->t:La/atz;

    .line 16
    .line 17
    check-cast v1, La/q8k;

    .line 18
    .line 19
    iget-byte v0, v1, La/q8k;->a:B

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance p0, Lorg/xplatform/limits/ie/impl/navigation/internal/LimitsIeInternalScreens$DepositLimitFragmentScreen;

    .line 25
    .line 26
    invoke-direct {p0, v0}, Lorg/xplatform/limits/ie/impl/navigation/internal/LimitsIeInternalScreens$DepositLimitFragmentScreen;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/cxz;->t:La/atz;

    .line 39
    .line 40
    check-cast v1, La/xh7;

    .line 41
    .line 42
    iget-byte v0, v1, La/xh7;->a:B

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance p0, Lorg/xplatform/limits/ie/impl/navigation/internal/LimitsIeInternalScreens$BetLimitFragmentScreen;

    .line 48
    .line 49
    invoke-direct {p0, v0}, Lorg/xplatform/limits/ie/impl/navigation/internal/LimitsIeInternalScreens$BetLimitFragmentScreen;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
