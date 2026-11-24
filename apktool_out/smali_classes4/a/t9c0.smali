.class public final La/t9c0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/t9c0;->i:B

    iput-object p1, p0, La/t9c0;->j:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/t9c0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/t9c0;->j:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/t9c0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/t9c0;-><init>(Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/t9c0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/t9c0;-><init>(Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/t9c0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/t9c0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/t9c0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/t9c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/t9c0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/t9c0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/t9c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/t9c0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, La/wne;->a:La/wne;

    .line 7
    .line 8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget p1, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->Q:I

    .line 12
    .line 13
    iget-object v2, p0, La/t9c0;->j:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 14
    .line 15
    iget-object p0, v2, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->K:La/c4m0;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, La/pby;->isActive()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 p1, 0x1

    .line 24
    if-ne p0, p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object p0, v2, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->A:La/kc60;

    .line 28
    .line 29
    invoke-virtual {p0}, La/kc60;->a()La/p7m0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-object p1, v2, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->B:La/nmt;

    .line 34
    .line 35
    invoke-virtual {p1}, La/nmt;->a()La/p7m0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v0, v2, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->D:La/g4u;

    .line 40
    .line 41
    iget-object v0, v0, La/g4u;->a:La/kki;

    .line 42
    .line 43
    iget-object v0, v0, La/kki;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, La/o0j;

    .line 46
    .line 47
    iget-object v0, v0, La/o0j;->f:La/p7m0;

    .line 48
    .line 49
    new-instance v1, La/fl9;

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    const/16 v4, 0xb

    .line 53
    .line 54
    invoke-direct {v1, v2, v3, v4}, La/fl9;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, p1, v0, v1}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v0, La/p6b0;

    .line 66
    .line 67
    const/4 v6, 0x4

    .line 68
    const/16 v7, 0x1b

    .line 69
    .line 70
    const/4 v1, 0x2

    .line 71
    const-class v3, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 72
    .line 73
    const-string v4, "onError"

    .line 74
    .line 75
    const-string v5, "onError(Ljava/lang/Throwable;)V"

    .line 76
    .line 77
    invoke-direct/range {v0 .. v7}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, p1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    iput-object p0, v2, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->K:La/c4m0;

    .line 85
    .line 86
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 90
    .line 91
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget p1, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->Q:I

    .line 95
    .line 96
    iget-object p0, p0, La/t9c0;->j:Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 97
    .line 98
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 99
    .line 100
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 101
    .line 102
    :cond_1
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-object v1, v0

    .line 110
    check-cast v1, La/iac0;

    .line 111
    .line 112
    const/4 v10, 0x0

    .line 113
    const/16 v11, 0x1f7f

    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    const/4 v3, 0x0

    .line 117
    const/4 v4, 0x0

    .line 118
    const/4 v5, 0x0

    .line 119
    const/4 v6, 0x0

    .line 120
    const/4 v7, 0x0

    .line 121
    const/4 v8, 0x0

    .line 122
    const/4 v9, 0x0

    .line 123
    invoke-static/range {v1 .. v11}, La/iac0;->a(La/iac0;Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/PromoCodeCacheContentState;ZLjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZZZI)La/iac0;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_1

    .line 132
    .line 133
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, La/iac0;

    .line 138
    .line 139
    iget-boolean p1, p1, La/iac0;->i:Z

    .line 140
    .line 141
    if-eqz p1, :cond_2

    .line 142
    .line 143
    invoke-virtual {p0}, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;->O()V

    .line 144
    .line 145
    .line 146
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
