.class public final synthetic La/ast0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/daf;

.field public final synthetic c:La/zuc0;


# direct methods
.method public synthetic constructor <init>(La/daf;La/zuc0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ast0;->a:B

    iput-object p1, p0, La/ast0;->b:La/daf;

    iput-object p2, p0, La/ast0;->c:La/zuc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/ast0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ast0;->c:La/zuc0;

    .line 4
    .line 5
    iget-object p0, p0, La/ast0;->b:La/daf;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/k0w0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/daf;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/jh70;

    .line 18
    .line 19
    invoke-static {p0, v1}, La/jh70;->i(La/jh70;La/zuc0;)Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance v0, Lorg/xplatform/referral/impl/navigation/ReferralProgramScreenFactoryImpl$loadDataScreen$1;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    new-array v1, v1, [La/m7h0;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    aput-object p0, v1, v2

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    aput-object v0, v1, p0

    .line 36
    .line 37
    invoke-virtual {p1, v1}, La/k0w0;->i([La/m7h0;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    check-cast p1, La/i1w0;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v0, La/m8s0;

    .line 49
    .line 50
    const/4 v2, 0x3

    .line 51
    invoke-direct {v0, p0, p1, v1, v2}, La/m8s0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
