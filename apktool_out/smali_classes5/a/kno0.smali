.class public final La/kno0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/kwj;

.field public final synthetic l:I

.field public final synthetic m:La/pz40;

.field public final synthetic n:La/l7m0;

.field public final synthetic o:Lkotlin/jvm/functions/Function1;

.field public final synthetic p:La/zno0;

.field public final synthetic q:La/bch0;


# direct methods
.method public synthetic constructor <init>(La/kwj;ILa/pz40;La/zno0;La/l7m0;La/bch0;Lkotlin/jvm/functions/Function1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/kno0;->i:B

    iput-object p1, p0, La/kno0;->k:La/kwj;

    iput p2, p0, La/kno0;->l:I

    iput-object p3, p0, La/kno0;->m:La/pz40;

    iput-object p4, p0, La/kno0;->p:La/zno0;

    iput-object p5, p0, La/kno0;->n:La/l7m0;

    iput-object p6, p0, La/kno0;->q:La/bch0;

    iput-object p7, p0, La/kno0;->o:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 13

    .line 1
    iget-byte p1, p0, La/kno0;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/kno0;->q:La/bch0;

    .line 4
    .line 5
    iget-object v1, p0, La/kno0;->p:La/zno0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v2, La/kno0;

    .line 11
    .line 12
    move-object v6, v1

    .line 13
    check-cast v6, La/yno0;

    .line 14
    .line 15
    move-object v8, v0

    .line 16
    check-cast v8, La/xcz;

    .line 17
    .line 18
    iget-object v9, p0, La/kno0;->o:Lkotlin/jvm/functions/Function1;

    .line 19
    .line 20
    const/4 v11, 0x1

    .line 21
    iget-object v3, p0, La/kno0;->k:La/kwj;

    .line 22
    .line 23
    iget v4, p0, La/kno0;->l:I

    .line 24
    .line 25
    iget-object v5, p0, La/kno0;->m:La/pz40;

    .line 26
    .line 27
    iget-object v7, p0, La/kno0;->n:La/l7m0;

    .line 28
    .line 29
    move-object v10, p2

    .line 30
    invoke-direct/range {v2 .. v11}, La/kno0;-><init>(La/kwj;ILa/pz40;La/zno0;La/l7m0;La/bch0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 31
    .line 32
    .line 33
    return-object v2

    .line 34
    :pswitch_0
    move-object v10, p2

    .line 35
    new-instance v3, La/kno0;

    .line 36
    .line 37
    move-object v7, v1

    .line 38
    check-cast v7, La/xno0;

    .line 39
    .line 40
    move-object v9, v0

    .line 41
    check-cast v9, La/d9z;

    .line 42
    .line 43
    move-object v11, v10

    .line 44
    iget-object v10, p0, La/kno0;->o:Lkotlin/jvm/functions/Function1;

    .line 45
    .line 46
    const/4 v12, 0x0

    .line 47
    iget-object v4, p0, La/kno0;->k:La/kwj;

    .line 48
    .line 49
    iget v5, p0, La/kno0;->l:I

    .line 50
    .line 51
    iget-object v6, p0, La/kno0;->m:La/pz40;

    .line 52
    .line 53
    iget-object v8, p0, La/kno0;->n:La/l7m0;

    .line 54
    .line 55
    invoke-direct/range {v3 .. v12}, La/kno0;-><init>(La/kwj;ILa/pz40;La/zno0;La/l7m0;La/bch0;Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 56
    .line 57
    .line 58
    return-object v3

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kno0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/kno0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kno0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kno0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/kno0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/kno0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/kno0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kno0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/kno0;->q:La/bch0;

    .line 7
    .line 8
    iget-object v4, v0, La/kno0;->n:La/l7m0;

    .line 9
    .line 10
    iget v5, v0, La/kno0;->l:I

    .line 11
    .line 12
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    iget-object v8, v0, La/kno0;->p:La/zno0;

    .line 15
    .line 16
    iget-object v9, v0, La/kno0;->m:La/pz40;

    .line 17
    .line 18
    const/4 v10, 0x1

    .line 19
    const/4 v11, 0x2

    .line 20
    iget-object v12, v0, La/kno0;->k:La/kwj;

    .line 21
    .line 22
    iget-object v13, v0, La/kno0;->o:Lkotlin/jvm/functions/Function1;

    .line 23
    .line 24
    sget-object v14, La/wt30;->a:La/wt30;

    .line 25
    .line 26
    const/4 v15, 0x0

    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    check-cast v8, La/yno0;

    .line 31
    .line 32
    iget-boolean v1, v8, La/yno0;->c:Z

    .line 33
    .line 34
    sget-object v8, La/wne;->a:La/wne;

    .line 35
    .line 36
    iget-byte v6, v0, La/kno0;->j:B

    .line 37
    .line 38
    if-eqz v6, :cond_2

    .line 39
    .line 40
    if-eq v6, v10, :cond_0

    .line 41
    .line 42
    if-ne v6, v11, :cond_1

    .line 43
    .line 44
    :cond_0
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    goto :goto_4

    .line 55
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v12}, La/xk80;->q()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-ne v6, v5, :cond_8

    .line 63
    .line 64
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v5, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    if-eqz v1, :cond_4

    .line 78
    .line 79
    :try_start_1
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-nez v4, :cond_4

    .line 90
    .line 91
    check-cast v3, La/xcz;

    .line 92
    .line 93
    iput-byte v10, v0, La/kno0;->j:B

    .line 94
    .line 95
    sget-object v2, La/xcz;->y:La/v0h0;

    .line 96
    .line 97
    invoke-virtual {v3, v15, v15, v0}, La/xcz;->f(IILa/yje;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-ne v0, v8, :cond_6

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    if-eqz v1, :cond_6

    .line 105
    .line 106
    invoke-virtual {v12}, La/xk80;->q()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_6

    .line 111
    .line 112
    iput-byte v11, v0, La/kno0;->j:B

    .line 113
    .line 114
    invoke-virtual {v12, v15, v2, v0}, La/xk80;->v(IFLa/yje;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    if-ne v0, v8, :cond_6

    .line 119
    .line 120
    :goto_0
    move-object v6, v8

    .line 121
    goto :goto_4

    .line 122
    :goto_1
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-interface {v9, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    if-eqz v1, :cond_5

    .line 128
    .line 129
    invoke-interface {v13, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    :cond_5
    throw v0

    .line 133
    :cond_6
    :goto_2
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-interface {v9, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    if-eqz v1, :cond_7

    .line 139
    .line 140
    invoke-interface {v13, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_7
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_8
    :goto_3
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    :goto_4
    return-object v6

    .line 149
    :pswitch_0
    check-cast v8, La/xno0;

    .line 150
    .line 151
    iget-boolean v1, v8, La/xno0;->c:Z

    .line 152
    .line 153
    sget-object v6, La/wne;->a:La/wne;

    .line 154
    .line 155
    iget-byte v8, v0, La/kno0;->j:B

    .line 156
    .line 157
    if-eqz v8, :cond_b

    .line 158
    .line 159
    if-eq v8, v10, :cond_9

    .line 160
    .line 161
    if-ne v8, v11, :cond_a

    .line 162
    .line 163
    :cond_9
    :try_start_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 164
    .line 165
    .line 166
    goto :goto_6

    .line 167
    :catchall_1
    move-exception v0

    .line 168
    goto :goto_5

    .line 169
    :cond_a
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const/4 v6, 0x0

    .line 173
    goto :goto_8

    .line 174
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v12}, La/xk80;->q()I

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-ne v7, v5, :cond_11

    .line 182
    .line 183
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    check-cast v5, Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-eqz v5, :cond_c

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_c
    if-eqz v1, :cond_d

    .line 197
    .line 198
    :try_start_3
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    check-cast v4, Ljava/lang/Boolean;

    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-nez v4, :cond_d

    .line 209
    .line 210
    check-cast v3, La/d9z;

    .line 211
    .line 212
    iput-byte v10, v0, La/kno0;->j:B

    .line 213
    .line 214
    invoke-static {v3, v0}, La/d9z;->f(La/d9z;La/bnn0;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    if-ne v0, v6, :cond_f

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_d
    if-eqz v1, :cond_f

    .line 222
    .line 223
    invoke-virtual {v12}, La/xk80;->q()I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-eqz v3, :cond_f

    .line 228
    .line 229
    iput-byte v11, v0, La/kno0;->j:B

    .line 230
    .line 231
    invoke-virtual {v12, v15, v2, v0}, La/xk80;->v(IFLa/yje;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 235
    if-ne v0, v6, :cond_f

    .line 236
    .line 237
    goto :goto_8

    .line 238
    :goto_5
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 239
    .line 240
    invoke-interface {v9, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    if-eqz v1, :cond_e

    .line 244
    .line 245
    invoke-interface {v13, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    :cond_e
    throw v0

    .line 249
    :cond_f
    :goto_6
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 250
    .line 251
    invoke-interface {v9, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    if-eqz v1, :cond_10

    .line 255
    .line 256
    invoke-interface {v13, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    :cond_10
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    goto :goto_8

    .line 262
    :cond_11
    :goto_7
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    :goto_8
    return-object v6

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
