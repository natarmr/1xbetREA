.class public final La/t0v0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:La/u0v0;

.field public final synthetic j:Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;


# direct methods
.method public constructor <init>(La/u0v0;Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/t0v0;->i:La/u0v0;

    .line 2
    .line 3
    iput-object p2, p0, La/t0v0;->j:Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance v0, La/t0v0;

    .line 2
    .line 3
    iget-object v1, p0, La/t0v0;->i:La/u0v0;

    .line 4
    .line 5
    iget-object p0, p0, La/t0v0;->j:Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, La/t0v0;-><init>(La/u0v0;Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;La/yje;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/t0v0;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/t0v0;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/t0v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/t0v0;->i:La/u0v0;

    .line 9
    .line 10
    iget-object v2, v1, La/u0v0;->F:La/jyg0;

    .line 11
    .line 12
    iget-object v3, v1, La/u0v0;->u:La/i1w0;

    .line 13
    .line 14
    iget-object v4, v1, La/u0v0;->E:La/ot;

    .line 15
    .line 16
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    check-cast v5, La/j0v0;

    .line 21
    .line 22
    iget-object v5, v5, La/j0v0;->i:La/ql5;

    .line 23
    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    iget-wide v6, v5, La/ql5;->a:J

    .line 27
    .line 28
    iget-object v0, v0, La/t0v0;->j:Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;

    .line 29
    .line 30
    instance-of v8, v0, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel$Games;

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    if-eqz v8, :cond_0

    .line 34
    .line 35
    sget-object v0, La/bm5;->d:La/bm5;

    .line 36
    .line 37
    invoke-virtual {v4, v0, v5}, La/ot;->a(La/bm5;La/ql5;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v2, v2, La/jyg0;->a:La/rrd;

    .line 44
    .line 45
    invoke-virtual {v2, v0, v6, v7}, La/rrd;->z(La/bm5;J)V

    .line 46
    .line 47
    .line 48
    new-instance v0, La/o0v0;

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    invoke-direct {v0, v1, v2}, La/o0v0;-><init>(La/u0v0;B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 55
    .line 56
    .line 57
    new-instance v0, La/k0w0;

    .line 58
    .line 59
    invoke-direct {v0, v3}, La/k0w0;-><init>(La/i1w0;)V

    .line 60
    .line 61
    .line 62
    iget-object v10, v1, La/u0v0;->p:La/oct;

    .line 63
    .line 64
    const/16 v16, 0x0

    .line 65
    .line 66
    const/16 v17, 0x1b

    .line 67
    .line 68
    const-wide/16 v11, 0x0

    .line 69
    .line 70
    const/4 v13, 0x0

    .line 71
    const/4 v14, 0x0

    .line 72
    const/4 v15, 0x0

    .line 73
    invoke-static/range {v10 .. v17}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 78
    .line 79
    .line 80
    iget-object v0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 81
    .line 82
    invoke-static {v3, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :goto_0
    move-object v1, v0

    .line 87
    check-cast v1, La/paw;

    .line 88
    .line 89
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_2

    .line 94
    .line 95
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, La/oe50;

    .line 100
    .line 101
    invoke-virtual {v3, v1}, La/i1w0;->a(La/oe50;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    sget-object v8, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel$Slots;->a:Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel$Slots;

    .line 106
    .line 107
    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_1

    .line 112
    .line 113
    sget-object v0, La/bm5;->e:La/bm5;

    .line 114
    .line 115
    invoke-virtual {v4, v0, v5}, La/ot;->a(La/bm5;La/ql5;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget-object v2, v2, La/jyg0;->a:La/rrd;

    .line 122
    .line 123
    invoke-virtual {v2, v0, v6, v7}, La/rrd;->z(La/bm5;J)V

    .line 124
    .line 125
    .line 126
    new-instance v0, La/o0v0;

    .line 127
    .line 128
    const/4 v2, 0x2

    .line 129
    invoke-direct {v0, v1, v2}, La/o0v0;-><init>(La/u0v0;B)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 133
    .line 134
    .line 135
    new-instance v0, La/k0w0;

    .line 136
    .line 137
    invoke-direct {v0, v3}, La/k0w0;-><init>(La/i1w0;)V

    .line 138
    .line 139
    .line 140
    iget-object v1, v1, La/u0v0;->q:La/peg0;

    .line 141
    .line 142
    invoke-static {v1}, La/peg0;->r(La/peg0;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 147
    .line 148
    .line 149
    iget-object v0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 150
    .line 151
    invoke-static {v3, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    :goto_1
    move-object v1, v0

    .line 156
    check-cast v1, La/paw;

    .line 157
    .line 158
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_2

    .line 163
    .line 164
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, La/oe50;

    .line 169
    .line 170
    invoke-virtual {v3, v1}, La/i1w0;->a(La/oe50;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 175
    .line 176
    .line 177
    const/4 v0, 0x0

    .line 178
    return-object v0

    .line 179
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object v0
.end method
