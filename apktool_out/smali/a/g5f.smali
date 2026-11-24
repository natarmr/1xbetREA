.class public final La/g5f;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/r7f;


# direct methods
.method public synthetic constructor <init>(La/r7f;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/g5f;->i:B

    iput-object p1, p0, La/g5f;->k:La/r7f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/g5f;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/g5f;->k:La/r7f;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/g5f;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/g5f;-><init>(La/r7f;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/g5f;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/g5f;-><init>(La/r7f;La/yje;B)V

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
    iget-byte v0, p0, La/g5f;->i:B

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
    invoke-virtual {p0, p1, p2}, La/g5f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/g5f;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/g5f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/g5f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/g5f;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/g5f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/g5f;->i:B

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v7, v0, La/g5f;->k:La/r7f;

    .line 12
    .line 13
    const/4 v8, 0x2

    .line 14
    const/4 v9, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v1, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-byte v10, v0, La/g5f;->j:B

    .line 21
    .line 22
    if-eqz v10, :cond_2

    .line 23
    .line 24
    if-eq v10, v6, :cond_1

    .line 25
    .line 26
    if-ne v10, v8, :cond_0

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_6

    .line 36
    .line 37
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object/from16 v5, p1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v5, v7, La/r7f;->f:La/h9c;

    .line 47
    .line 48
    iput-byte v6, v0, La/g5f;->j:B

    .line 49
    .line 50
    iget-object v5, v5, La/h9c;->a:La/chf0;

    .line 51
    .line 52
    invoke-virtual {v5, v0}, La/chf0;->D(La/yje;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-ne v5, v1, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    :goto_0
    check-cast v5, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v10

    .line 65
    const-wide/16 v12, 0x1

    .line 66
    .line 67
    cmp-long v5, v10, v12

    .line 68
    .line 69
    if-gtz v5, :cond_9

    .line 70
    .line 71
    invoke-virtual {v7}, La/r7f;->C()La/et7;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    iget-object v5, v5, La/et7;->b:La/k3p;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    move-object v5, v9

    .line 81
    :goto_1
    sget-object v10, La/lwf;->l:La/lwf;

    .line 82
    .line 83
    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-nez v5, :cond_5

    .line 88
    .line 89
    invoke-virtual {v7, v4, v10}, La/r7f;->o0(ZLa/k3p;)V

    .line 90
    .line 91
    .line 92
    :cond_5
    iput-byte v8, v0, La/g5f;->j:B

    .line 93
    .line 94
    invoke-virtual {v7, v6, v6, v0}, La/r7f;->l0(ZZLa/zje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-ne v0, v1, :cond_6

    .line 99
    .line 100
    :goto_2
    move-object v9, v1

    .line 101
    goto :goto_6

    .line 102
    :cond_6
    :goto_3
    iget-object v0, v7, La/r7f;->Y0:La/mne;

    .line 103
    .line 104
    iget-object v1, v7, La/r7f;->P1:La/bby;

    .line 105
    .line 106
    if-eqz v1, :cond_7

    .line 107
    .line 108
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-ne v1, v6, :cond_7

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_7
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    iget-object v13, v0, La/mne;->b:La/dvj;

    .line 120
    .line 121
    const/16 v1, 0x8

    .line 122
    .line 123
    sget-object v4, La/bfn;->e:La/bfn;

    .line 124
    .line 125
    invoke-static {v1, v4}, La/ibc;->v0(ILa/bfn;)J

    .line 126
    .line 127
    .line 128
    move-result-wide v11

    .line 129
    new-instance v14, La/t4f;

    .line 130
    .line 131
    invoke-direct {v14, v7, v3}, La/t4f;-><init>(La/r7f;B)V

    .line 132
    .line 133
    .line 134
    new-instance v15, La/d5f;

    .line 135
    .line 136
    const/4 v1, 0x7

    .line 137
    invoke-direct {v15, v7, v9, v1}, La/d5f;-><init>(La/r7f;La/yje;B)V

    .line 138
    .line 139
    .line 140
    invoke-static/range {v10 .. v15}, La/sac;->c0(La/bvc;JLkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/bby;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iput-object v1, v7, La/r7f;->P1:La/bby;

    .line 145
    .line 146
    :goto_4
    iget-object v1, v7, La/r7f;->Q1:La/bby;

    .line 147
    .line 148
    if-eqz v1, :cond_8

    .line 149
    .line 150
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-ne v1, v6, :cond_8

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_8
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    iget-object v13, v0, La/mne;->b:La/dvj;

    .line 162
    .line 163
    const/16 v0, 0x1e

    .line 164
    .line 165
    sget-object v1, La/bfn;->e:La/bfn;

    .line 166
    .line 167
    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    .line 168
    .line 169
    .line 170
    move-result-wide v11

    .line 171
    new-instance v14, La/t4f;

    .line 172
    .line 173
    invoke-direct {v14, v7, v2}, La/t4f;-><init>(La/r7f;B)V

    .line 174
    .line 175
    .line 176
    new-instance v15, La/d5f;

    .line 177
    .line 178
    const/4 v0, 0x6

    .line 179
    invoke-direct {v15, v7, v9, v0}, La/d5f;-><init>(La/r7f;La/yje;B)V

    .line 180
    .line 181
    .line 182
    invoke-static/range {v10 .. v15}, La/sac;->c0(La/bvc;JLkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/bby;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iput-object v0, v7, La/r7f;->Q1:La/bby;

    .line 187
    .line 188
    :cond_9
    :goto_5
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    :goto_6
    return-object v9

    .line 191
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 192
    .line 193
    iget-byte v10, v0, La/g5f;->j:B

    .line 194
    .line 195
    if-eqz v10, :cond_e

    .line 196
    .line 197
    if-eq v10, v6, :cond_d

    .line 198
    .line 199
    if-eq v10, v8, :cond_c

    .line 200
    .line 201
    if-eq v10, v3, :cond_b

    .line 202
    .line 203
    if-ne v10, v2, :cond_a

    .line 204
    .line 205
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    goto/16 :goto_b

    .line 209
    .line 210
    :cond_a
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    goto/16 :goto_c

    .line 214
    .line 215
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    goto :goto_9

    .line 219
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v7}, La/r7f;->g0()V

    .line 231
    .line 232
    .line 233
    iget-object v5, v7, La/r7f;->I0:La/qu;

    .line 234
    .line 235
    iget-object v5, v5, La/qu;->a:La/kt2;

    .line 236
    .line 237
    const-string v10, "coupon_clear_call"

    .line 238
    .line 239
    invoke-interface {v5, v10}, La/kt2;->c(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    iget-object v5, v7, La/r7f;->K0:La/x20;

    .line 243
    .line 244
    iget-object v5, v5, La/x20;->a:La/s1p;

    .line 245
    .line 246
    const-wide/16 v10, 0xc8a

    .line 247
    .line 248
    sget-object v12, La/xun;->a:La/xun;

    .line 249
    .line 250
    invoke-virtual {v5, v12, v10, v11}, La/s1p;->a(Ljava/util/Set;J)V

    .line 251
    .line 252
    .line 253
    sget-object v5, La/rue;->c:La/rue;

    .line 254
    .line 255
    iput-byte v6, v0, La/g5f;->j:B

    .line 256
    .line 257
    invoke-virtual {v7, v5, v0}, La/r7f;->T(La/rue;La/zje;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    if-ne v5, v1, :cond_f

    .line 262
    .line 263
    goto :goto_a

    .line 264
    :cond_f
    :goto_7
    iget-object v5, v7, La/r7f;->J:La/jtj;

    .line 265
    .line 266
    iput-byte v8, v0, La/g5f;->j:B

    .line 267
    .line 268
    invoke-virtual {v5, v0}, La/jtj;->k(La/zje;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    if-ne v5, v1, :cond_10

    .line 273
    .line 274
    goto :goto_a

    .line 275
    :cond_10
    :goto_8
    const-wide/16 v5, 0x0

    .line 276
    .line 277
    invoke-virtual {v7, v5, v6}, La/r7f;->x(J)V

    .line 278
    .line 279
    .line 280
    iget-object v5, v7, La/r7f;->r0:La/j9c;

    .line 281
    .line 282
    iget-object v5, v5, La/j9c;->a:La/g45;

    .line 283
    .line 284
    iget-object v5, v5, La/g45;->a:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v5, La/lye;

    .line 287
    .line 288
    iput-object v9, v5, La/lye;->g:Ljava/lang/Integer;

    .line 289
    .line 290
    iget-object v5, v7, La/r7f;->v:La/vit0;

    .line 291
    .line 292
    sget-object v6, La/q4f;->b:La/q4f;

    .line 293
    .line 294
    iput-byte v3, v0, La/g5f;->j:B

    .line 295
    .line 296
    invoke-virtual {v5, v6, v0}, La/vit0;->g(La/q4f;La/zje;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    if-ne v3, v1, :cond_11

    .line 301
    .line 302
    goto :goto_a

    .line 303
    :cond_11
    :goto_9
    iget-object v3, v7, La/r7f;->u:La/ipc;

    .line 304
    .line 305
    iput-byte v2, v0, La/g5f;->j:B

    .line 306
    .line 307
    invoke-virtual {v3, v0}, La/ipc;->b(La/zje;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    if-ne v0, v1, :cond_12

    .line 312
    .line 313
    :goto_a
    move-object v9, v1

    .line 314
    goto :goto_c

    .line 315
    :cond_12
    :goto_b
    iget-object v0, v7, La/r7f;->b0:La/ni9;

    .line 316
    .line 317
    invoke-virtual {v0}, La/ni9;->b()V

    .line 318
    .line 319
    .line 320
    new-instance v0, La/yld;

    .line 321
    .line 322
    const/16 v1, 0x1d

    .line 323
    .line 324
    invoke-direct {v0, v1}, La/yld;-><init>(B)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v7, v4, v4, v0}, La/r7f;->h0(ZZLkotlin/jvm/functions/Function0;)V

    .line 328
    .line 329
    .line 330
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 331
    .line 332
    :goto_c
    return-object v9

    .line 333
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
