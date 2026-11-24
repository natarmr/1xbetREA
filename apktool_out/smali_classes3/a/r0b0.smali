.class public final La/r0b0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/f1b0;


# direct methods
.method public synthetic constructor <init>(La/f1b0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r0b0;->i:B

    iput-object p1, p0, La/r0b0;->k:La/f1b0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r0b0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/r0b0;->k:La/f1b0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/r0b0;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/r0b0;-><init>(La/f1b0;La/yje;B)V

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
    iput-boolean p0, v0, La/r0b0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/r0b0;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/r0b0;-><init>(La/f1b0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/r0b0;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/r0b0;-><init>(La/f1b0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/r0b0;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/r0b0;-><init>(La/f1b0;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/r0b0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/r0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/r0b0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/r0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/r0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/r0b0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/r0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/r0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/r0b0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/r0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, La/vne;

    .line 61
    .line 62
    check-cast p2, La/yje;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, La/r0b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/r0b0;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/r0b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/r0b0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v6, v0, La/r0b0;->k:La/f1b0;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-boolean v14, v0, La/r0b0;->j:Z

    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, La/d0b0;

    .line 27
    .line 28
    iget-boolean v0, v0, La/d0b0;->h:Z

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    if-eqz v14, :cond_0

    .line 33
    .line 34
    invoke-virtual {v6}, La/f1b0;->X()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v6, v2}, La/f1b0;->R(Z)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 41
    .line 42
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 43
    .line 44
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-object v7, v0

    .line 52
    check-cast v7, La/d0b0;

    .line 53
    .line 54
    const/16 v18, 0x0

    .line 55
    .line 56
    const/16 v19, 0xf7f

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v10, 0x0

    .line 61
    const/4 v11, 0x0

    .line 62
    const/4 v12, 0x0

    .line 63
    const/4 v13, 0x0

    .line 64
    const/4 v15, 0x0

    .line 65
    const/16 v16, 0x0

    .line 66
    .line 67
    const/16 v17, 0x0

    .line 68
    .line 69
    invoke-static/range {v7 .. v19}, La/d0b0;->a(La/d0b0;La/xza0;La/zza0;La/yza0;La/b0b0;Ljava/util/Set;ZZZZLa/a0b0;ZI)La/d0b0;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_1

    .line 78
    .line 79
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 83
    .line 84
    iget-boolean v2, v0, La/r0b0;->j:Z

    .line 85
    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    if-ne v2, v4, :cond_2

    .line 89
    .line 90
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v2, v6, La/f1b0;->M:La/n660;

    .line 102
    .line 103
    iput-boolean v4, v0, La/r0b0;->j:Z

    .line 104
    .line 105
    invoke-virtual {v2, v0}, La/n660;->z(La/zje;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-ne v0, v1, :cond_4

    .line 110
    .line 111
    move-object v5, v1

    .line 112
    goto :goto_1

    .line 113
    :cond_4
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    :goto_1
    return-object v5

    .line 116
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 117
    .line 118
    iget-boolean v7, v0, La/r0b0;->j:Z

    .line 119
    .line 120
    if-eqz v7, :cond_6

    .line 121
    .line 122
    if-ne v7, v4, :cond_5

    .line 123
    .line 124
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iget-object v3, v6, La/f1b0;->d0:La/ytt;

    .line 136
    .line 137
    sget-object v5, La/aue0;->d:La/aue0;

    .line 138
    .line 139
    iput-boolean v4, v0, La/r0b0;->j:Z

    .line 140
    .line 141
    invoke-virtual {v3, v5, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-ne v0, v1, :cond_7

    .line 146
    .line 147
    move-object v5, v1

    .line 148
    goto :goto_4

    .line 149
    :cond_7
    :goto_2
    iget-object v0, v6, La/f1b0;->o:La/i1w0;

    .line 150
    .line 151
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iget-object v3, v6, La/f1b0;->z:La/peg0;

    .line 156
    .line 157
    new-instance v4, La/hr1;

    .line 158
    .line 159
    const-wide/16 v5, 0x0

    .line 160
    .line 161
    const/4 v7, 0x3

    .line 162
    invoke-direct {v4, v5, v6, v7}, La/hr1;-><init>(JI)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v4}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 170
    .line 171
    .line 172
    iget-object v1, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 173
    .line 174
    invoke-static {v0, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    :goto_3
    move-object v2, v1

    .line 179
    check-cast v2, La/paw;

    .line 180
    .line 181
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_8

    .line 186
    .line 187
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    check-cast v2, La/oe50;

    .line 192
    .line 193
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_8
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    :goto_4
    return-object v5

    .line 200
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 201
    .line 202
    iget-boolean v2, v0, La/r0b0;->j:Z

    .line 203
    .line 204
    if-eqz v2, :cond_a

    .line 205
    .line 206
    if-ne v2, v4, :cond_9

    .line 207
    .line 208
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    iget-object v2, v6, La/f1b0;->r0:La/bby;

    .line 220
    .line 221
    if-eqz v2, :cond_b

    .line 222
    .line 223
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-eqz v3, :cond_b

    .line 228
    .line 229
    :try_start_1
    iput-boolean v4, v0, La/r0b0;->j:Z

    .line 230
    .line 231
    invoke-interface {v2, v0}, La/bby;->join(La/yje;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 235
    if-ne v0, v1, :cond_b

    .line 236
    .line 237
    move-object v5, v1

    .line 238
    goto :goto_6

    .line 239
    :catch_0
    :cond_b
    :goto_5
    iget-object v0, v6, La/f1b0;->q0:La/bby;

    .line 240
    .line 241
    if-eqz v0, :cond_c

    .line 242
    .line 243
    invoke-interface {v0, v5}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 244
    .line 245
    .line 246
    :cond_c
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    :goto_6
    return-object v5

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
