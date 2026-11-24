.class public final synthetic La/urj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;ZB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/urj;->a:B

    iput-object p1, p0, La/urj;->b:Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;

    iput-boolean p2, p0, La/urj;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/urj;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-boolean v2, p0, La/urj;->c:Z

    .line 5
    .line 6
    iget-object p0, p0, La/urj;->b:Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;

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
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, La/c8d;

    .line 23
    .line 24
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 25
    .line 26
    new-instance v0, La/bjk;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct {v0, v4, v3, v3, v2}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 31
    .line 32
    .line 33
    new-instance v2, La/v7d;

    .line 34
    .line 35
    invoke-direct {v2, v1, p1, v0}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, La/c8d;->a:La/w7d;

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
    new-instance v0, La/urj;

    .line 49
    .line 50
    invoke-direct {v0, p0, v2, v1}, La/urj;-><init>(Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;ZB)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
