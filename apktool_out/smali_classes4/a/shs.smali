.class public final La/shs;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/uhs;


# direct methods
.method public synthetic constructor <init>(La/uhs;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/shs;->i:B

    iput-object p1, p0, La/shs;->k:La/uhs;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/shs;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/shs;->k:La/uhs;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/shs;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/shs;-><init>(La/uhs;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/shs;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/shs;-><init>(La/uhs;La/yje;B)V

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
    iget-byte v0, p0, La/shs;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/shs;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/shs;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/shs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/shs;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/shs;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/shs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 27

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-byte v0, v6, La/shs;->i:B

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v7, v6, La/shs;->k:La/uhs;

    .line 8
    .line 9
    const/4 v8, 0x2

    .line 10
    const/4 v9, 0x0

    .line 11
    const/4 v10, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, v7, La/uhs;->o:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;

    .line 16
    .line 17
    iget-object v2, v7, La/uhs;->C:La/n0o0;

    .line 18
    .line 19
    sget-object v3, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v4, v6, La/shs;->j:B

    .line 22
    .line 23
    if-eqz v4, :cond_2

    .line 24
    .line 25
    if-eq v4, v10, :cond_1

    .line 26
    .line 27
    if-ne v4, v8, :cond_0

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object/from16 v1, p1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, v7, La/uhs;->r:La/j3c;

    .line 49
    .line 50
    iput-byte v10, v6, La/shs;->j:B

    .line 51
    .line 52
    invoke-virtual {v1, v6}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-ne v1, v3, :cond_3

    .line 57
    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :cond_3
    :goto_0
    move-object v10, v1

    .line 61
    check-cast v10, La/wcb;

    .line 62
    .line 63
    iget-object v1, v7, La/uhs;->s:La/luu;

    .line 64
    .line 65
    iget-object v1, v1, La/luu;->a:La/nok0;

    .line 66
    .line 67
    invoke-virtual {v1}, La/nok0;->a()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v13

    .line 71
    iget-boolean v14, v7, La/uhs;->I:Z

    .line 72
    .line 73
    iget-object v1, v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;->f:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, La/sff0;

    .line 80
    .line 81
    iget-boolean v15, v4, La/sff0;->J:Z

    .line 82
    .line 83
    iget-object v4, v7, La/uhs;->y:La/svu;

    .line 84
    .line 85
    invoke-virtual {v4}, La/svu;->l()Z

    .line 86
    .line 87
    .line 88
    move-result v21

    .line 89
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, La/sff0;

    .line 94
    .line 95
    iget-object v4, v4, La/sff0;->g:La/mum0;

    .line 96
    .line 97
    iget-object v12, v4, La/mum0;->z:La/g8l0;

    .line 98
    .line 99
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, La/sff0;

    .line 104
    .line 105
    iget-object v2, v2, La/sff0;->g:La/mum0;

    .line 106
    .line 107
    iget-object v11, v2, La/mum0;->y:La/v5l0;

    .line 108
    .line 109
    iget-object v0, v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;->c:Ljava/util/Set;

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    new-instance v0, La/gs2;

    .line 118
    .line 119
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    new-instance v0, La/hs2;

    .line 124
    .line 125
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 126
    .line 127
    .line 128
    :goto_1
    iget-object v2, v7, La/uhs;->A:La/r9u;

    .line 129
    .line 130
    sget-object v4, La/ygp;->t:La/ygp;

    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget-object v2, v2, La/r9u;->a:La/j1q0;

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 141
    .line 142
    invoke-virtual {v2, v4}, La/m1q0;->d(La/ygp;)Z

    .line 143
    .line 144
    .line 145
    move-result v16

    .line 146
    iget-object v2, v7, La/i3t0;->i:La/ocj;

    .line 147
    .line 148
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 149
    .line 150
    :goto_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-object v5, v4

    .line 158
    check-cast v5, La/cis;

    .line 159
    .line 160
    new-instance v19, La/bis;

    .line 161
    .line 162
    move-object/from16 v9, v19

    .line 163
    .line 164
    invoke-direct/range {v9 .. v16}, La/bis;-><init>(La/wcb;La/v5l0;La/g8l0;Ljava/util/List;ZZZ)V

    .line 165
    .line 166
    .line 167
    move-object/from16 v24, v11

    .line 168
    .line 169
    move-object/from16 v23, v12

    .line 170
    .line 171
    move v12, v15

    .line 172
    move/from16 v25, v16

    .line 173
    .line 174
    move-object v11, v10

    .line 175
    const/16 v20, 0x0

    .line 176
    .line 177
    const/16 v22, 0x36

    .line 178
    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    const/16 v18, 0x0

    .line 182
    .line 183
    move-object/from16 v16, v1

    .line 184
    .line 185
    move-object v15, v5

    .line 186
    invoke-static/range {v15 .. v22}, La/cis;->a(La/cis;Ljava/lang/String;Ljava/util/List;La/ais;La/bis;ZZI)La/cis;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v2, v4, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-eqz v1, :cond_6

    .line 195
    .line 196
    iget-object v1, v7, La/uhs;->q:La/hjd;

    .line 197
    .line 198
    new-instance v2, La/cid;

    .line 199
    .line 200
    const-string v4, "sport_champ_games"

    .line 201
    .line 202
    invoke-direct {v2, v4, v0}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 203
    .line 204
    .line 205
    iput-byte v8, v6, La/shs;->j:B

    .line 206
    .line 207
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v2, v6}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-ne v0, v3, :cond_5

    .line 215
    .line 216
    :goto_3
    move-object v9, v3

    .line 217
    goto :goto_5

    .line 218
    :cond_5
    :goto_4
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    :goto_5
    return-object v9

    .line 221
    :cond_6
    move-object v10, v11

    .line 222
    move v15, v12

    .line 223
    move-object/from16 v1, v16

    .line 224
    .line 225
    move-object/from16 v12, v23

    .line 226
    .line 227
    move-object/from16 v11, v24

    .line 228
    .line 229
    move/from16 v16, v25

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :pswitch_0
    iget-object v0, v7, La/uhs;->o:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;

    .line 233
    .line 234
    sget-object v11, La/wne;->a:La/wne;

    .line 235
    .line 236
    iget-byte v2, v6, La/shs;->j:B

    .line 237
    .line 238
    if-eqz v2, :cond_9

    .line 239
    .line 240
    if-eq v2, v10, :cond_8

    .line 241
    .line 242
    if-ne v2, v8, :cond_7

    .line 243
    .line 244
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_8

    .line 248
    .line 249
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_9

    .line 253
    .line 254
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    move-object/from16 v0, p1

    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    iget-object v1, v7, La/uhs;->p:La/pzu;

    .line 264
    .line 265
    move-object v2, v1

    .line 266
    iget-object v1, v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;->b:La/j700;

    .line 267
    .line 268
    iget-object v3, v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;->a:Ljava/util/List;

    .line 269
    .line 270
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    move-object v4, v2

    .line 275
    move-object v2, v3

    .line 276
    iget-object v3, v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;->c:Ljava/util/Set;

    .line 277
    .line 278
    iget-boolean v0, v0, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;->d:Z

    .line 279
    .line 280
    iget-object v5, v7, La/uhs;->C:La/n0o0;

    .line 281
    .line 282
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    check-cast v5, La/sff0;

    .line 287
    .line 288
    iget-boolean v5, v5, La/sff0;->J1:Z

    .line 289
    .line 290
    iput-byte v10, v6, La/shs;->j:B

    .line 291
    .line 292
    move-object/from16 v26, v4

    .line 293
    .line 294
    move v4, v0

    .line 295
    move-object/from16 v0, v26

    .line 296
    .line 297
    invoke-virtual/range {v0 .. v6}, La/pzu;->e0(La/j700;Ljava/util/Set;Ljava/util/Set;ZZLa/zje;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    if-ne v0, v11, :cond_a

    .line 302
    .line 303
    goto :goto_7

    .line 304
    :cond_a
    :goto_6
    check-cast v0, La/gmq;

    .line 305
    .line 306
    new-instance v1, La/phs;

    .line 307
    .line 308
    const/4 v2, 0x0

    .line 309
    invoke-direct {v1, v7, v9, v2}, La/phs;-><init>(La/uhs;La/yje;B)V

    .line 310
    .line 311
    .line 312
    new-instance v2, La/fnq;

    .line 313
    .line 314
    const/4 v3, 0x4

    .line 315
    invoke-direct {v2, v0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 316
    .line 317
    .line 318
    iget-object v0, v7, La/uhs;->D:La/qz40;

    .line 319
    .line 320
    new-instance v1, La/wx4;

    .line 321
    .line 322
    const/16 v3, 0xb

    .line 323
    .line 324
    invoke-direct {v1, v7, v9, v3}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 325
    .line 326
    .line 327
    new-instance v3, La/p6d;

    .line 328
    .line 329
    invoke-direct {v3, v2, v0, v1, v10}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 330
    .line 331
    .line 332
    new-instance v0, La/xu3;

    .line 333
    .line 334
    invoke-direct {v0, v3, v10}, La/xu3;-><init>(La/p6d;B)V

    .line 335
    .line 336
    .line 337
    invoke-static {v0}, La/ulb;->H(La/gmq;)La/p5a;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    new-instance v1, La/jz6;

    .line 342
    .line 343
    const/4 v2, 0x3

    .line 344
    invoke-direct {v1, v7, v2}, La/jz6;-><init>(Ljava/lang/Object;B)V

    .line 345
    .line 346
    .line 347
    iput-byte v8, v6, La/shs;->j:B

    .line 348
    .line 349
    invoke-interface {v0, v1, v6}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    if-ne v0, v11, :cond_b

    .line 354
    .line 355
    :goto_7
    move-object v9, v11

    .line 356
    goto :goto_9

    .line 357
    :cond_b
    :goto_8
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 358
    .line 359
    :goto_9
    return-object v9

    .line 360
    nop

    .line 361
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
