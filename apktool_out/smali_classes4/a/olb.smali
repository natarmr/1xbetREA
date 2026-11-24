.class public final La/olb;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public k:Z

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLa/yje;La/i3t0;Z)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/olb;->i:B

    iput-object p3, p0, La/olb;->l:Ljava/lang/Object;

    iput-boolean p4, p0, La/olb;->k:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/ltr0;La/yje;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, La/olb;->i:B

    .line 2
    iput-object p1, p0, La/olb;->l:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;La/yje;B)V
    .locals 0

    .line 3
    iput-byte p4, p0, La/olb;->i:B

    iput-boolean p1, p0, La/olb;->k:Z

    iput-object p2, p0, La/olb;->l:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/olb;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/olb;->l:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/olb;

    .line 9
    .line 10
    check-cast v1, La/ltr0;

    .line 11
    .line 12
    invoke-direct {p0, v1, p1}, La/olb;-><init>(La/ltr0;La/yje;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance v0, La/olb;

    .line 17
    .line 18
    iget-boolean p0, p0, La/olb;->k:Z

    .line 19
    .line 20
    check-cast v1, La/z220;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-direct {v0, p0, v1, p1, v2}, La/olb;-><init>(ZLjava/lang/Object;La/yje;B)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_1
    new-instance v0, La/olb;

    .line 28
    .line 29
    iget-boolean p0, p0, La/olb;->k:Z

    .line 30
    .line 31
    check-cast v1, La/oif0;

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    invoke-direct {v0, p0, v1, p1, v2}, La/olb;-><init>(ZLjava/lang/Object;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_2
    new-instance v0, La/olb;

    .line 39
    .line 40
    check-cast v1, La/tqo;

    .line 41
    .line 42
    iget-boolean p0, p0, La/olb;->k:Z

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    invoke-direct {v0, v2, p1, v1, p0}, La/olb;-><init>(BLa/yje;La/i3t0;Z)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_3
    new-instance v0, La/olb;

    .line 50
    .line 51
    check-cast v1, La/plb;

    .line 52
    .line 53
    iget-boolean p0, p0, La/olb;->k:Z

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-direct {v0, v2, p1, v1, p0}, La/olb;-><init>(BLa/yje;La/i3t0;Z)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/olb;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/olb;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/olb;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/olb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/olb;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/olb;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/olb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/olb;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/olb;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/olb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/olb;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/olb;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/olb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/olb;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/olb;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/olb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, La/olb;->i:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    iget-object v5, v1, La/olb;->l:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x2

    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v5, La/ltr0;

    .line 19
    .line 20
    sget-object v0, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-byte v9, v1, La/olb;->j:B

    .line 23
    .line 24
    if-eqz v9, :cond_2

    .line 25
    .line 26
    if-eq v9, v6, :cond_1

    .line 27
    .line 28
    if-ne v9, v7, :cond_0

    .line 29
    .line 30
    iget-boolean v0, v1, La/olb;->k:Z

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object/from16 v1, p1

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move-object/from16 v4, p1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v4, v5, La/ltr0;->C:La/mrt;

    .line 52
    .line 53
    iput-byte v6, v1, La/olb;->j:B

    .line 54
    .line 55
    invoke-virtual {v4, v1}, La/mrt;->a(La/zje;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-ne v4, v0, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    :goto_0
    check-cast v4, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    iget-object v6, v5, La/ltr0;->H:La/m1e;

    .line 69
    .line 70
    invoke-interface {v6}, La/m1e;->b()La/gmq;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    iput-boolean v4, v1, La/olb;->k:Z

    .line 75
    .line 76
    iput-byte v7, v1, La/olb;->j:B

    .line 77
    .line 78
    invoke-static {v6, v1}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-ne v1, v0, :cond_4

    .line 83
    .line 84
    :goto_1
    move-object v8, v0

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    move v0, v4

    .line 87
    :goto_2
    check-cast v1, Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    sget v1, La/ltr0;->Q:I

    .line 94
    .line 95
    iget-object v1, v5, La/i3t0;->i:La/ocj;

    .line 96
    .line 97
    iget-object v10, v1, La/ocj;->a:La/p7m0;

    .line 98
    .line 99
    :cond_5
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-object v11, v1

    .line 107
    check-cast v11, La/ftr0;

    .line 108
    .line 109
    new-instance v4, La/jur0;

    .line 110
    .line 111
    invoke-static {v2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-direct {v4, v0, v5, v9, v3}, La/jur0;-><init>(ZLa/pz40;ZZ)V

    .line 116
    .line 117
    .line 118
    const/16 v17, 0x7f

    .line 119
    .line 120
    const/4 v12, 0x0

    .line 121
    const/4 v13, 0x0

    .line 122
    const/4 v14, 0x0

    .line 123
    const/4 v15, 0x0

    .line 124
    move-object/from16 v16, v4

    .line 125
    .line 126
    invoke-static/range {v11 .. v17}, La/ftr0;->a(La/ftr0;La/vsr0;La/rm5;La/pur0;ZLa/jur0;I)La/ftr0;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v10, v1, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_5

    .line 135
    .line 136
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    :goto_3
    return-object v8

    .line 139
    :pswitch_0
    iget-boolean v0, v1, La/olb;->k:Z

    .line 140
    .line 141
    check-cast v5, La/z220;

    .line 142
    .line 143
    sget-object v9, La/wne;->a:La/wne;

    .line 144
    .line 145
    iget-byte v10, v1, La/olb;->j:B

    .line 146
    .line 147
    if-eqz v10, :cond_8

    .line 148
    .line 149
    if-eq v10, v6, :cond_7

    .line 150
    .line 151
    if-ne v10, v7, :cond_6

    .line 152
    .line 153
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    .line 155
    .line 156
    move-object/from16 v0, p1

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :catchall_0
    move-exception v0

    .line 160
    goto :goto_7

    .line 161
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_7
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 166
    .line 167
    .line 168
    move-object/from16 v2, p1

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    if-eqz v0, :cond_a

    .line 175
    .line 176
    :try_start_2
    iget-object v2, v5, La/z220;->c:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v2, La/rou;

    .line 179
    .line 180
    iput-byte v6, v1, La/olb;->j:B

    .line 181
    .line 182
    invoke-virtual {v2, v3, v1}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    if-ne v2, v9, :cond_9

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_9
    :goto_4
    check-cast v2, La/m2c0;

    .line 190
    .line 191
    iget-object v2, v2, La/m2c0;->C:Ljava/lang/String;

    .line 192
    .line 193
    :cond_a
    iget-object v3, v5, La/z220;->d:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v3, La/g45;

    .line 196
    .line 197
    iget-object v4, v5, La/z220;->e:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v4, La/nhf0;

    .line 200
    .line 201
    invoke-virtual {v4}, La/nhf0;->r()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    iput-byte v7, v1, La/olb;->j:B

    .line 206
    .line 207
    invoke-virtual {v3, v1, v4, v2, v0}, La/g45;->I(La/zje;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    if-ne v0, v9, :cond_b

    .line 212
    .line 213
    :goto_5
    move-object v8, v9

    .line 214
    goto :goto_8

    .line 215
    :cond_b
    :goto_6
    check-cast v0, La/aki0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 216
    .line 217
    move-object v8, v0

    .line 218
    goto :goto_8

    .line 219
    :goto_7
    iget-object v1, v5, La/z220;->d:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v1, La/g45;

    .line 222
    .line 223
    iget-object v1, v1, La/g45;->c:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v1, La/i7e;

    .line 226
    .line 227
    iget-object v1, v1, La/i7e;->f:La/p7m0;

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    sget-object v2, La/zji0;->a:La/zji0;

    .line 233
    .line 234
    invoke-virtual {v1, v8, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-nez v1, :cond_c

    .line 242
    .line 243
    :goto_8
    return-object v8

    .line 244
    :cond_c
    throw v0

    .line 245
    :pswitch_1
    check-cast v5, La/oif0;

    .line 246
    .line 247
    sget-object v0, La/wne;->a:La/wne;

    .line 248
    .line 249
    iget-byte v2, v1, La/olb;->j:B

    .line 250
    .line 251
    if-eqz v2, :cond_f

    .line 252
    .line 253
    if-eq v2, v6, :cond_e

    .line 254
    .line 255
    if-ne v2, v7, :cond_d

    .line 256
    .line 257
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    goto :goto_b

    .line 261
    :cond_d
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    goto :goto_c

    .line 265
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    goto :goto_9

    .line 269
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    iget-boolean v2, v1, La/olb;->k:Z

    .line 273
    .line 274
    if-eqz v2, :cond_10

    .line 275
    .line 276
    iget-object v2, v5, La/oif0;->b:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v2, La/y3v;

    .line 279
    .line 280
    iput-byte v6, v1, La/olb;->j:B

    .line 281
    .line 282
    invoke-virtual {v2, v1}, La/y3v;->y(La/zje;)Ljava/io/Serializable;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    if-ne v2, v0, :cond_10

    .line 287
    .line 288
    goto :goto_a

    .line 289
    :cond_10
    :goto_9
    iget-object v2, v5, La/oif0;->c:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v2, La/nvu;

    .line 292
    .line 293
    iput-byte v7, v1, La/olb;->j:B

    .line 294
    .line 295
    invoke-virtual {v2, v1}, La/nvu;->E(La/zje;)Ljava/io/Serializable;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    if-ne v1, v0, :cond_11

    .line 300
    .line 301
    :goto_a
    move-object v8, v0

    .line 302
    goto :goto_c

    .line 303
    :cond_11
    :goto_b
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 304
    .line 305
    :goto_c
    return-object v8

    .line 306
    :pswitch_2
    check-cast v5, La/tqo;

    .line 307
    .line 308
    sget-object v2, La/wne;->a:La/wne;

    .line 309
    .line 310
    iget-byte v0, v1, La/olb;->j:B

    .line 311
    .line 312
    if-eqz v0, :cond_14

    .line 313
    .line 314
    if-eq v0, v6, :cond_13

    .line 315
    .line 316
    if-ne v0, v7, :cond_12

    .line 317
    .line 318
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    goto/16 :goto_14

    .line 322
    .line 323
    :cond_12
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    goto/16 :goto_15

    .line 327
    .line 328
    :cond_13
    :try_start_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 329
    .line 330
    .line 331
    move-object/from16 v0, p1

    .line 332
    .line 333
    goto :goto_d

    .line 334
    :catchall_1
    move-exception v0

    .line 335
    goto :goto_f

    .line 336
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    :try_start_4
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 340
    .line 341
    iget-object v0, v5, La/tqo;->u:La/rou;

    .line 342
    .line 343
    iput-byte v6, v1, La/olb;->j:B

    .line 344
    .line 345
    invoke-virtual {v0, v3, v1}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    if-ne v0, v2, :cond_15

    .line 350
    .line 351
    goto/16 :goto_13

    .line 352
    .line 353
    :cond_15
    :goto_d
    check-cast v0, La/m2c0;

    .line 354
    .line 355
    iget-object v0, v0, La/m2c0;->c:Ljava/lang/String;

    .line 356
    .line 357
    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    if-eqz v0, :cond_16

    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    goto :goto_e

    .line 368
    :cond_16
    move v0, v3

    .line 369
    :goto_e
    new-instance v4, Ljava/lang/Integer;

    .line 370
    .line 371
    invoke-direct {v4, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 372
    .line 373
    .line 374
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 375
    .line 376
    goto :goto_10

    .line 377
    :goto_f
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 378
    .line 379
    new-instance v4, La/g0g0;

    .line 380
    .line 381
    invoke-direct {v4, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 382
    .line 383
    .line 384
    :goto_10
    new-instance v0, Ljava/lang/Integer;

    .line 385
    .line 386
    invoke-direct {v0, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 387
    .line 388
    .line 389
    instance-of v9, v4, La/g0g0;

    .line 390
    .line 391
    if-eqz v9, :cond_17

    .line 392
    .line 393
    move-object v4, v0

    .line 394
    :cond_17
    check-cast v4, Ljava/lang/Number;

    .line 395
    .line 396
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 397
    .line 398
    .line 399
    move-result v12

    .line 400
    iget-object v0, v5, La/tqo;->r:La/pru;

    .line 401
    .line 402
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    iget-object v10, v5, La/tqo;->s:La/nr;

    .line 407
    .line 408
    iget-boolean v11, v1, La/olb;->k:Z

    .line 409
    .line 410
    iget-boolean v13, v0, La/sff0;->J1:Z

    .line 411
    .line 412
    iget-object v4, v5, La/tqo;->t:La/yiu;

    .line 413
    .line 414
    invoke-virtual {v4}, La/yiu;->a()Z

    .line 415
    .line 416
    .line 417
    move-result v4

    .line 418
    if-nez v4, :cond_19

    .line 419
    .line 420
    iget-boolean v0, v0, La/sff0;->O1:Z

    .line 421
    .line 422
    if-eqz v0, :cond_18

    .line 423
    .line 424
    goto :goto_11

    .line 425
    :cond_18
    move v14, v3

    .line 426
    goto :goto_12

    .line 427
    :cond_19
    :goto_11
    move v14, v6

    .line 428
    :goto_12
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    new-instance v9, La/o4u;

    .line 432
    .line 433
    const/4 v15, 0x0

    .line 434
    invoke-direct/range {v9 .. v15}, La/o4u;-><init>(La/nr;ZIZZLa/yje;)V

    .line 435
    .line 436
    .line 437
    new-instance v0, La/vsg0;

    .line 438
    .line 439
    invoke-direct {v0, v9}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 440
    .line 441
    .line 442
    new-instance v3, La/cbq;

    .line 443
    .line 444
    invoke-direct {v3, v10, v11, v8}, La/cbq;-><init>(La/nr;ZLa/yje;)V

    .line 445
    .line 446
    .line 447
    const-wide v8, 0x7fffffffffffffffL

    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    invoke-static {v0, v8, v9, v3}, La/kpb;->k0(La/gmq;JLkotlin/jvm/functions/Function2;)La/a1g;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    new-instance v3, La/s1d;

    .line 457
    .line 458
    iget-boolean v4, v1, La/olb;->k:Z

    .line 459
    .line 460
    invoke-direct {v3, v4, v5}, La/s1d;-><init>(ZLa/tqo;)V

    .line 461
    .line 462
    .line 463
    iput-byte v7, v1, La/olb;->j:B

    .line 464
    .line 465
    invoke-virtual {v0, v3, v1}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    if-ne v0, v2, :cond_1a

    .line 470
    .line 471
    :goto_13
    move-object v8, v2

    .line 472
    goto :goto_15

    .line 473
    :cond_1a
    :goto_14
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    :goto_15
    return-object v8

    .line 476
    :pswitch_3
    check-cast v5, La/plb;

    .line 477
    .line 478
    sget-object v0, La/wne;->a:La/wne;

    .line 479
    .line 480
    iget-byte v2, v1, La/olb;->j:B

    .line 481
    .line 482
    if-eqz v2, :cond_1d

    .line 483
    .line 484
    if-eq v2, v6, :cond_1c

    .line 485
    .line 486
    if-ne v2, v7, :cond_1b

    .line 487
    .line 488
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    goto :goto_1a

    .line 492
    :cond_1b
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    goto :goto_1b

    .line 496
    :cond_1c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    move-object/from16 v2, p1

    .line 500
    .line 501
    goto :goto_16

    .line 502
    :cond_1d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 503
    .line 504
    .line 505
    iget-object v2, v5, La/plb;->p:La/xzp;

    .line 506
    .line 507
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    check-cast v3, La/alb;

    .line 512
    .line 513
    iget-object v3, v3, La/alb;->a:Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 514
    .line 515
    iget-wide v3, v3, Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;->a:J

    .line 516
    .line 517
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v9

    .line 521
    check-cast v9, La/alb;

    .line 522
    .line 523
    iget-object v9, v9, La/alb;->b:La/kgz;

    .line 524
    .line 525
    iput-byte v6, v1, La/olb;->j:B

    .line 526
    .line 527
    invoke-virtual {v2, v3, v4, v9, v1}, La/xzp;->M(JLa/kgz;La/zje;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    if-ne v2, v0, :cond_1e

    .line 532
    .line 533
    goto :goto_19

    .line 534
    :cond_1e
    :goto_16
    check-cast v2, La/gmq;

    .line 535
    .line 536
    new-instance v3, La/d09;

    .line 537
    .line 538
    iget-boolean v4, v1, La/olb;->k:Z

    .line 539
    .line 540
    invoke-direct {v3, v5, v4, v8}, La/d09;-><init>(La/plb;ZLa/yje;)V

    .line 541
    .line 542
    .line 543
    iput-byte v7, v1, La/olb;->j:B

    .line 544
    .line 545
    new-instance v4, La/vnq;

    .line 546
    .line 547
    sget-object v5, La/h660;->a:La/h660;

    .line 548
    .line 549
    invoke-direct {v4, v5, v3, v7}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 550
    .line 551
    .line 552
    invoke-interface {v2, v4, v1}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    if-ne v1, v0, :cond_1f

    .line 557
    .line 558
    goto :goto_17

    .line 559
    :cond_1f
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 560
    .line 561
    :goto_17
    if-ne v1, v0, :cond_20

    .line 562
    .line 563
    goto :goto_18

    .line 564
    :cond_20
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 565
    .line 566
    :goto_18
    if-ne v1, v0, :cond_21

    .line 567
    .line 568
    :goto_19
    move-object v8, v0

    .line 569
    goto :goto_1b

    .line 570
    :cond_21
    :goto_1a
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 571
    .line 572
    :goto_1b
    return-object v8

    .line 573
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
