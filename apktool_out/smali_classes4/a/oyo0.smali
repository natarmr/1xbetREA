.class public final La/oyo0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/pyo0;


# direct methods
.method public synthetic constructor <init>(La/pyo0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/oyo0;->i:B

    iput-object p1, p0, La/oyo0;->k:La/pyo0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/oyo0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/oyo0;->k:La/pyo0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/oyo0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/oyo0;-><init>(La/pyo0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/oyo0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/oyo0;-><init>(La/pyo0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/oyo0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/oyo0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/oyo0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/oyo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/oyo0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/oyo0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/oyo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/oyo0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/oyo0;->k:La/pyo0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/oyo0;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v1, La/pyo0;->r:La/fck0;

    .line 34
    .line 35
    iget-object v2, v1, La/pyo0;->p:Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 36
    .line 37
    iget-wide v7, v2, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->a:J

    .line 38
    .line 39
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/kyo0;

    .line 44
    .line 45
    iget-boolean v1, v1, La/kyo0;->f:Z

    .line 46
    .line 47
    iput-boolean v4, p0, La/oyo0;->j:Z

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    iget-object p1, p1, La/fck0;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, La/oif0;

    .line 54
    .line 55
    invoke-virtual {p1, v7, v8, v4, p0}, La/oif0;->x(JZLa/bnn0;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-ne p0, v0, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    iget-object p1, p1, La/fck0;->b:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v6, p1

    .line 68
    check-cast v6, La/cu;

    .line 69
    .line 70
    iget-object p1, v6, La/cu;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, La/m1e;

    .line 73
    .line 74
    invoke-interface {p1}, La/m1e;->c()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    new-instance v1, La/au;

    .line 84
    .line 85
    const/4 v10, 0x0

    .line 86
    const/4 v9, 0x0

    .line 87
    move-object v5, v1

    .line 88
    invoke-direct/range {v5 .. v10}, La/au;-><init>(La/cu;JLa/yje;B)V

    .line 89
    .line 90
    .line 91
    new-instance v2, La/au;

    .line 92
    .line 93
    const/4 v10, 0x1

    .line 94
    move-object v5, v2

    .line 95
    invoke-direct/range {v5 .. v10}, La/au;-><init>(La/cu;JLa/yje;B)V

    .line 96
    .line 97
    .line 98
    new-instance v3, La/bu;

    .line 99
    .line 100
    const/4 p1, 0x0

    .line 101
    invoke-direct {v3, v6, v9, p1}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 102
    .line 103
    .line 104
    new-instance v4, La/zt;

    .line 105
    .line 106
    invoke-direct {v4, v6, v7, v8, p1}, La/zt;-><init>(Ljava/lang/Object;JB)V

    .line 107
    .line 108
    .line 109
    new-instance v5, La/tr;

    .line 110
    .line 111
    invoke-direct/range {v5 .. v10}, La/tr;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 112
    .line 113
    .line 114
    const-class v6, La/cu;

    .line 115
    .line 116
    move-object v7, p0

    .line 117
    invoke-static/range {v1 .. v7}, La/ipm0;->v(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Ljava/lang/Class;La/zje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    if-ne p0, v0, :cond_5

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    :goto_0
    if-ne p0, v0, :cond_6

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    :goto_1
    if-ne p0, v0, :cond_7

    .line 132
    .line 133
    move-object v2, v0

    .line 134
    goto :goto_3

    .line 135
    :cond_7
    :goto_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    :goto_3
    return-object v2

    .line 138
    :pswitch_0
    move-object v7, p0

    .line 139
    iget-object p0, v1, La/pyo0;->p:Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 140
    .line 141
    sget-object v0, La/wne;->a:La/wne;

    .line 142
    .line 143
    iget-boolean v5, v7, La/oyo0;->j:Z

    .line 144
    .line 145
    if-eqz v5, :cond_9

    .line 146
    .line 147
    if-ne v5, v4, :cond_8

    .line 148
    .line 149
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_8
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-object v3, v1, La/pyo0;->s:La/hcp0;

    .line 161
    .line 162
    move p1, v4

    .line 163
    iget-wide v4, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->a:J

    .line 164
    .line 165
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    check-cast v1, La/kyo0;

    .line 170
    .line 171
    iget-boolean v6, v1, La/kyo0;->g:Z

    .line 172
    .line 173
    move-object v11, v7

    .line 174
    iget-wide v7, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->c:J

    .line 175
    .line 176
    iget-wide v9, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->d:J

    .line 177
    .line 178
    iput-boolean p1, v11, La/oyo0;->j:Z

    .line 179
    .line 180
    invoke-virtual/range {v3 .. v11}, La/hcp0;->p(JZJJLa/yje;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    if-ne p0, v0, :cond_a

    .line 185
    .line 186
    move-object v2, v0

    .line 187
    goto :goto_5

    .line 188
    :cond_a
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    :goto_5
    return-object v2

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
