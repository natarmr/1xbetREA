.class public final synthetic La/wrj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zrj;

.field public final synthetic c:La/zuc0;


# direct methods
.method public synthetic constructor <init>(La/zrj;La/zuc0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wrj;->a:B

    iput-object p1, p0, La/wrj;->b:La/zrj;

    iput-object p2, p0, La/wrj;->c:La/zuc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/wrj;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/wrj;->c:La/zuc0;

    .line 5
    .line 6
    iget-object p0, p0, La/wrj;->b:La/zrj;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/k0w0;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/zrj;->n:La/jh70;

    .line 17
    .line 18
    invoke-static {p0, v2}, La/jh70;->i(La/jh70;La/zuc0;)Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance v0, Lorg/xplatform/promotions/loyalty/impl/navigation/PromotionsLoyaltyScreens$ChampionsClubFragmentScreen;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    const/4 v2, 0x2

    .line 28
    new-array v2, v2, [La/m7h0;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    aput-object p0, v2, v3

    .line 32
    .line 33
    aput-object v0, v2, v1

    .line 34
    .line 35
    invoke-virtual {p1, v2}, La/k0w0;->i([La/m7h0;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    check-cast p1, La/i1w0;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v0, La/wrj;

    .line 47
    .line 48
    invoke-direct {v0, p0, v2, v1}, La/wrj;-><init>(La/zrj;La/zuc0;B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
