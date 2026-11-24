.class public final Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;Ljava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;->j:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;->k:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance p1, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;

    .line 2
    .line 3
    iget-object v0, p0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;->j:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 4
    .line 5
    iget-object p0, p0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;->k:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;-><init>(Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;Ljava/lang/String;La/yje;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;->k:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v4, p0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;->j:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, v4, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->q:La/fuj0;

    .line 29
    .line 30
    iput-boolean v2, p0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/a;->i:Z

    .line 31
    .line 32
    invoke-virtual {p1, v3, p0}, La/fuj0;->y(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-ne p1, v0, :cond_2

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_2
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 40
    .line 41
    new-instance p0, La/mi60;

    .line 42
    .line 43
    invoke-direct {p0, v2, v3, p1}, La/mi60;-><init>(BLjava/lang/String;Ljava/util/List;)V

    .line 44
    .line 45
    .line 46
    sget p1, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->Q:I

    .line 47
    .line 48
    invoke-virtual {v4, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, v4, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->p:La/vzg0;

    .line 52
    .line 53
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, La/iac0;

    .line 58
    .line 59
    iget-object p1, p1, La/iac0;->b:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState;

    .line 60
    .line 61
    const-string v0, "CONTENT_STATE_KEY"

    .line 62
    .line 63
    invoke-virtual {p0, v0, p1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p0, v4, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->v:La/b4j;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, La/b4j;->a:La/kt2;

    .line 75
    .line 76
    const-string p1, "promocode_activate_done"

    .line 77
    .line 78
    const-string v0, "promocode"

    .line 79
    .line 80
    invoke-static {v0, v3, p0, p1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-object p0, v4, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->w:La/ix0;

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object p0, p0, La/ix0;->a:La/s1p;

    .line 89
    .line 90
    const-wide/16 v0, 0xc14

    .line 91
    .line 92
    invoke-static {v3, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 93
    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0
.end method
