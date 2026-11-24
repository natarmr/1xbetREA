.class public final La/ydp;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/bep;


# direct methods
.method public synthetic constructor <init>(La/bep;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ydp;->i:B

    iput-object p1, p0, La/ydp;->k:La/bep;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ydp;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ydp;->k:La/bep;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ydp;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ydp;-><init>(La/bep;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/ydp;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/ydp;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/ydp;-><init>(La/bep;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ydp;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ydp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/ydp;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/ydp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/ydp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/ydp;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/ydp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ydp;->i:B

    .line 4
    .line 5
    iget-object v3, v0, La/ydp;->k:La/bep;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean v14, v0, La/ydp;->j:Z

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget v0, La/bep;->I:I

    .line 18
    .line 19
    iget-object v1, v3, La/i3t0;->i:La/ocj;

    .line 20
    .line 21
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-object v5, v4

    .line 31
    move-object v4, v5

    .line 32
    check-cast v4, La/e2p;

    .line 33
    .line 34
    const/4 v13, 0x0

    .line 35
    const/16 v15, 0x7fff

    .line 36
    .line 37
    move-object v6, v5

    .line 38
    const/4 v5, 0x0

    .line 39
    move-object v7, v6

    .line 40
    const/4 v6, 0x0

    .line 41
    move-object v8, v7

    .line 42
    const/4 v7, 0x0

    .line 43
    move-object v9, v8

    .line 44
    const/4 v8, 0x0

    .line 45
    move-object v10, v9

    .line 46
    const/4 v9, 0x0

    .line 47
    move-object v11, v10

    .line 48
    const/4 v10, 0x0

    .line 49
    move-object v12, v11

    .line 50
    const/4 v11, 0x0

    .line 51
    move-object/from16 v16, v12

    .line 52
    .line 53
    const/4 v12, 0x0

    .line 54
    move-object/from16 v2, v16

    .line 55
    .line 56
    invoke-static/range {v4 .. v15}, La/e2p;->a(La/e2p;ZZZZZZLjava/util/List;Ljava/util/List;La/ot0;ZI)La/e2p;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v0, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    if-eqz v14, :cond_2

    .line 67
    .line 68
    iget-object v0, v3, La/bep;->H:La/c4m0;

    .line 69
    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/4 v2, 0x1

    .line 77
    if-ne v0, v2, :cond_1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    invoke-virtual {v3}, La/bep;->N()V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    :goto_0
    if-nez v14, :cond_4

    .line 85
    .line 86
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, La/e2p;

    .line 91
    .line 92
    iget-boolean v0, v0, La/e2p;->c:Z

    .line 93
    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    iget-object v0, v1, La/ocj;->a:La/p7m0;

    .line 97
    .line 98
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-object v2, v1

    .line 106
    check-cast v2, La/e2p;

    .line 107
    .line 108
    const/4 v12, 0x0

    .line 109
    const v13, 0xffbb

    .line 110
    .line 111
    .line 112
    const/4 v3, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    const/4 v6, 0x1

    .line 116
    const/4 v7, 0x0

    .line 117
    const/4 v8, 0x0

    .line 118
    const/4 v9, 0x0

    .line 119
    const/4 v10, 0x0

    .line 120
    const/4 v11, 0x0

    .line 121
    invoke-static/range {v2 .. v13}, La/e2p;->a(La/e2p;ZZZZZZLjava/util/List;Ljava/util/List;La/ot0;ZI)La/e2p;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_3

    .line 130
    .line 131
    :cond_4
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 135
    .line 136
    iget-boolean v2, v0, La/ydp;->j:Z

    .line 137
    .line 138
    const/4 v4, 0x1

    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    if-ne v2, v4, :cond_5

    .line 142
    .line 143
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_5
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 148
    .line 149
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const/4 v1, 0x0

    .line 153
    goto :goto_3

    .line 154
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget-object v2, v3, La/bep;->q:La/peg0;

    .line 158
    .line 159
    sget-object v5, La/a7p;->a:La/a7p;

    .line 160
    .line 161
    iput-boolean v4, v0, La/ydp;->j:Z

    .line 162
    .line 163
    invoke-virtual {v2, v0}, La/peg0;->p(La/bnn0;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    if-ne v0, v1, :cond_7

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_7
    :goto_2
    sget v0, La/bep;->I:I

    .line 171
    .line 172
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 173
    .line 174
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 175
    .line 176
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-object v2, v1

    .line 184
    check-cast v2, La/e2p;

    .line 185
    .line 186
    const/4 v12, 0x0

    .line 187
    const v13, 0xffef

    .line 188
    .line 189
    .line 190
    const/4 v3, 0x0

    .line 191
    const/4 v4, 0x1

    .line 192
    const/4 v5, 0x0

    .line 193
    const/4 v6, 0x0

    .line 194
    const/4 v7, 0x0

    .line 195
    const/4 v8, 0x0

    .line 196
    const/4 v9, 0x0

    .line 197
    const/4 v10, 0x0

    .line 198
    const/4 v11, 0x0

    .line 199
    invoke-static/range {v2 .. v13}, La/e2p;->a(La/e2p;ZZZZZZLjava/util/List;Ljava/util/List;La/ot0;ZI)La/e2p;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_8

    .line 208
    .line 209
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    :goto_3
    return-object v1

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
