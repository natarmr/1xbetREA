.class public final La/dd70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:B

.field public o:Ljava/lang/Object;

.field public final synthetic p:La/diu0;


# direct methods
.method public synthetic constructor <init>(La/diu0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/dd70;->i:B

    iput-object p1, p0, La/dd70;->p:La/diu0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/dd70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/dd70;->p:La/diu0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/dd70;

    .line 9
    .line 10
    check-cast p0, La/doc0;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-direct {p1, p0, p2, v0}, La/dd70;-><init>(La/diu0;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/dd70;

    .line 18
    .line 19
    check-cast p0, La/xd70;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-direct {p1, p0, p2, v0}, La/dd70;-><init>(La/diu0;La/yje;B)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/dd70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/dd70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/dd70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/dd70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/dd70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/dd70;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/dd70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dd70;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v0, La/dd70;->p:La/diu0;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v3, La/doc0;

    .line 17
    .line 18
    iget-object v1, v3, La/doc0;->u:La/p7m0;

    .line 19
    .line 20
    sget-object v8, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-byte v9, v0, La/dd70;->n:B

    .line 23
    .line 24
    if-eqz v9, :cond_3

    .line 25
    .line 26
    if-eq v9, v4, :cond_2

    .line 27
    .line 28
    if-eq v9, v5, :cond_1

    .line 29
    .line 30
    if-ne v9, v6, :cond_0

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object/from16 v0, p1

    .line 36
    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :cond_1
    iget-boolean v2, v0, La/dd70;->m:Z

    .line 45
    .line 46
    iget-boolean v3, v0, La/dd70;->l:Z

    .line 47
    .line 48
    iget-boolean v4, v0, La/dd70;->k:Z

    .line 49
    .line 50
    iget-boolean v5, v0, La/dd70;->j:Z

    .line 51
    .line 52
    iget-object v9, v0, La/dd70;->o:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v9, La/kpu;

    .line 55
    .line 56
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object v10, v9

    .line 60
    move v9, v5

    .line 61
    move v5, v4

    .line 62
    move v4, v3

    .line 63
    move-object/from16 v3, p1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object/from16 v2, p1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object v2, La/dfe;->a:La/dfe;

    .line 79
    .line 80
    invoke-virtual {v1, v7, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    iget-object v2, v3, La/doc0;->f:La/epu;

    .line 84
    .line 85
    iput-byte v4, v0, La/dd70;->n:B

    .line 86
    .line 87
    invoke-virtual {v2, v0}, La/epu;->a(La/zje;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-ne v2, v8, :cond_4

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    :goto_0
    check-cast v2, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    iget-object v4, v3, La/doc0;->g:La/cpu;

    .line 101
    .line 102
    invoke-virtual {v4}, La/cpu;->a()Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    iget-object v9, v3, La/doc0;->d:La/kpu;

    .line 107
    .line 108
    iput-object v9, v0, La/dd70;->o:Ljava/lang/Object;

    .line 109
    .line 110
    iput-boolean v2, v0, La/dd70;->j:Z

    .line 111
    .line 112
    iput-boolean v4, v0, La/dd70;->k:Z

    .line 113
    .line 114
    iput-boolean v2, v0, La/dd70;->l:Z

    .line 115
    .line 116
    iput-boolean v4, v0, La/dd70;->m:Z

    .line 117
    .line 118
    iput-byte v5, v0, La/dd70;->n:B

    .line 119
    .line 120
    invoke-virtual {v3, v0}, La/doc0;->x(La/zje;)Ljava/io/Serializable;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-ne v3, v8, :cond_5

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    move v5, v4

    .line 128
    move-object v10, v9

    .line 129
    move v4, v2

    .line 130
    move v9, v4

    .line 131
    move v2, v5

    .line 132
    :goto_1
    check-cast v3, Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    iput-object v7, v0, La/dd70;->o:Ljava/lang/Object;

    .line 139
    .line 140
    iput-boolean v9, v0, La/dd70;->j:Z

    .line 141
    .line 142
    iput-boolean v5, v0, La/dd70;->k:Z

    .line 143
    .line 144
    iput-byte v6, v0, La/dd70;->n:B

    .line 145
    .line 146
    invoke-virtual {v10, v4, v2, v3, v0}, La/kpu;->b(ZZZLa/zje;)Ljava/io/Serializable;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-ne v0, v8, :cond_6

    .line 151
    .line 152
    :goto_2
    move-object v7, v8

    .line 153
    goto :goto_4

    .line 154
    :cond_6
    :goto_3
    check-cast v0, Ljava/util/List;

    .line 155
    .line 156
    new-instance v2, La/afe;

    .line 157
    .line 158
    invoke-direct {v2, v0}, La/afe;-><init>(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1, v7, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    :goto_4
    return-object v7

    .line 170
    :pswitch_0
    check-cast v3, La/xd70;

    .line 171
    .line 172
    iget-object v1, v3, La/xd70;->o:La/vzg0;

    .line 173
    .line 174
    iget-object v8, v3, La/xd70;->H:La/z7z;

    .line 175
    .line 176
    sget-object v9, La/wne;->a:La/wne;

    .line 177
    .line 178
    iget-byte v10, v0, La/dd70;->n:B

    .line 179
    .line 180
    const/4 v11, 0x0

    .line 181
    const/4 v12, 0x5

    .line 182
    const/4 v13, 0x4

    .line 183
    if-eqz v10, :cond_d

    .line 184
    .line 185
    if-eq v10, v4, :cond_c

    .line 186
    .line 187
    if-eq v10, v5, :cond_a

    .line 188
    .line 189
    if-eq v10, v6, :cond_9

    .line 190
    .line 191
    if-eq v10, v13, :cond_8

    .line 192
    .line 193
    if-ne v10, v12, :cond_7

    .line 194
    .line 195
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto/16 :goto_13

    .line 199
    .line 200
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_14

    .line 204
    .line 205
    :cond_8
    iget-boolean v1, v0, La/dd70;->m:Z

    .line 206
    .line 207
    iget-boolean v2, v0, La/dd70;->l:Z

    .line 208
    .line 209
    iget-boolean v4, v0, La/dd70;->k:Z

    .line 210
    .line 211
    iget-boolean v5, v0, La/dd70;->j:Z

    .line 212
    .line 213
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    goto/16 :goto_11

    .line 217
    .line 218
    :cond_9
    iget-boolean v2, v0, La/dd70;->l:Z

    .line 219
    .line 220
    iget-boolean v4, v0, La/dd70;->k:Z

    .line 221
    .line 222
    iget-boolean v5, v0, La/dd70;->j:Z

    .line 223
    .line 224
    iget-object v6, v0, La/dd70;->o:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v6, La/bm5;

    .line 227
    .line 228
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    move-object v8, v6

    .line 232
    move-object/from16 v6, p1

    .line 233
    .line 234
    goto/16 :goto_9

    .line 235
    .line 236
    :cond_a
    iget-boolean v2, v0, La/dd70;->j:Z

    .line 237
    .line 238
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    move-object/from16 v4, p1

    .line 242
    .line 243
    :cond_b
    move v5, v2

    .line 244
    goto :goto_6

    .line 245
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    move-object/from16 v2, p1

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    check-cast v2, La/xb70;

    .line 259
    .line 260
    iget-object v2, v2, La/xb70;->n:La/fa70;

    .line 261
    .line 262
    iget-boolean v2, v2, La/fa70;->f:Z

    .line 263
    .line 264
    if-eqz v2, :cond_f

    .line 265
    .line 266
    invoke-interface {v8}, La/z7z;->get()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    check-cast v2, La/ahu;

    .line 271
    .line 272
    sget-object v10, La/bm5;->g:La/bm5;

    .line 273
    .line 274
    iput-byte v4, v0, La/dd70;->n:B

    .line 275
    .line 276
    invoke-virtual {v2, v10, v0}, La/ahu;->b(La/bm5;La/yje;)Ljava/io/Serializable;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    if-ne v2, v9, :cond_e

    .line 281
    .line 282
    goto/16 :goto_12

    .line 283
    .line 284
    :cond_e
    :goto_5
    check-cast v2, La/ql5;

    .line 285
    .line 286
    iget-object v4, v3, La/xd70;->K:La/z7z;

    .line 287
    .line 288
    invoke-interface {v4}, La/z7z;->get()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    check-cast v4, La/jyg0;

    .line 293
    .line 294
    iget-wide v14, v2, La/ql5;->a:J

    .line 295
    .line 296
    sget-object v10, La/bm5;->h:La/bm5;

    .line 297
    .line 298
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    iget-object v4, v4, La/jyg0;->a:La/rrd;

    .line 302
    .line 303
    invoke-virtual {v4, v10, v14, v15}, La/rrd;->z(La/bm5;J)V

    .line 304
    .line 305
    .line 306
    iget-object v4, v3, La/xd70;->L:La/z7z;

    .line 307
    .line 308
    invoke-interface {v4}, La/z7z;->get()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    check-cast v4, La/ot;

    .line 313
    .line 314
    invoke-virtual {v4, v10, v2}, La/ot;->a(La/bm5;La/ql5;)V

    .line 315
    .line 316
    .line 317
    :cond_f
    iget-object v2, v3, La/xd70;->v:La/z7z;

    .line 318
    .line 319
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    check-cast v2, La/j1q0;

    .line 324
    .line 325
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 326
    .line 327
    iget-object v2, v2, La/m1q0;->a:La/q7d0;

    .line 328
    .line 329
    const-string v4, "WEBVIEW_ANIMATION_ENABLE"

    .line 330
    .line 331
    invoke-virtual {v2}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-interface {v2, v4, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    iget-object v4, v3, La/xd70;->R:La/z7z;

    .line 340
    .line 341
    invoke-interface {v4}, La/z7z;->get()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    check-cast v4, La/h6v;

    .line 346
    .line 347
    iput-boolean v2, v0, La/dd70;->j:Z

    .line 348
    .line 349
    iput-byte v5, v0, La/dd70;->n:B

    .line 350
    .line 351
    invoke-virtual {v4, v0}, La/h6v;->a(La/zje;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    if-ne v4, v9, :cond_b

    .line 356
    .line 357
    goto/16 :goto_12

    .line 358
    .line 359
    :goto_6
    check-cast v4, Ljava/lang/Boolean;

    .line 360
    .line 361
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    check-cast v2, La/xb70;

    .line 370
    .line 371
    iget-object v2, v2, La/xb70;->n:La/fa70;

    .line 372
    .line 373
    iget-boolean v2, v2, La/fa70;->f:Z

    .line 374
    .line 375
    if-eqz v2, :cond_10

    .line 376
    .line 377
    sget-object v2, La/bm5;->h:La/bm5;

    .line 378
    .line 379
    goto :goto_7

    .line 380
    :cond_10
    sget-object v2, La/bm5;->d:La/bm5;

    .line 381
    .line 382
    :goto_7
    iget-object v10, v3, La/xd70;->Z:La/z7z;

    .line 383
    .line 384
    invoke-interface {v10}, La/z7z;->get()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v10

    .line 388
    check-cast v10, La/k9c;

    .line 389
    .line 390
    invoke-virtual {v10}, La/k9c;->a()Z

    .line 391
    .line 392
    .line 393
    move-result v10

    .line 394
    if-eqz v10, :cond_14

    .line 395
    .line 396
    invoke-interface {v8}, La/z7z;->get()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v8

    .line 400
    check-cast v8, La/ahu;

    .line 401
    .line 402
    sget-object v14, La/bm5;->h:La/bm5;

    .line 403
    .line 404
    if-ne v2, v14, :cond_11

    .line 405
    .line 406
    move-object v15, v2

    .line 407
    goto :goto_8

    .line 408
    :cond_11
    iget-object v14, v3, La/xd70;->I:La/z7z;

    .line 409
    .line 410
    invoke-interface {v14}, La/z7z;->get()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v14

    .line 414
    check-cast v14, La/xru;

    .line 415
    .line 416
    sget-object v15, La/bm5;->d:La/bm5;

    .line 417
    .line 418
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    iget-object v14, v14, La/xru;->a:La/rrd;

    .line 422
    .line 423
    invoke-virtual {v14, v15}, La/rrd;->p(La/bm5;)J

    .line 424
    .line 425
    .line 426
    move-result-wide v16

    .line 427
    const-wide/16 v18, 0x0

    .line 428
    .line 429
    cmp-long v14, v16, v18

    .line 430
    .line 431
    if-gtz v14, :cond_12

    .line 432
    .line 433
    sget-object v15, La/bm5;->a:La/bm5;

    .line 434
    .line 435
    :cond_12
    :goto_8
    iput-object v2, v0, La/dd70;->o:Ljava/lang/Object;

    .line 436
    .line 437
    iput-boolean v5, v0, La/dd70;->j:Z

    .line 438
    .line 439
    iput-boolean v4, v0, La/dd70;->k:Z

    .line 440
    .line 441
    iput-boolean v10, v0, La/dd70;->l:Z

    .line 442
    .line 443
    iput-byte v6, v0, La/dd70;->n:B

    .line 444
    .line 445
    invoke-virtual {v8, v15, v0}, La/ahu;->b(La/bm5;La/yje;)Ljava/io/Serializable;

    .line 446
    .line 447
    .line 448
    move-result-object v6

    .line 449
    if-ne v6, v9, :cond_13

    .line 450
    .line 451
    goto/16 :goto_12

    .line 452
    .line 453
    :cond_13
    move-object v8, v2

    .line 454
    move v2, v10

    .line 455
    :goto_9
    check-cast v6, La/ql5;

    .line 456
    .line 457
    move v10, v2

    .line 458
    move-object v15, v8

    .line 459
    :goto_a
    move/from16 v16, v4

    .line 460
    .line 461
    move/from16 v18, v5

    .line 462
    .line 463
    move-object/from16 v19, v6

    .line 464
    .line 465
    goto :goto_b

    .line 466
    :cond_14
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    check-cast v6, La/xb70;

    .line 471
    .line 472
    iget-object v6, v6, La/xb70;->q:La/z870;

    .line 473
    .line 474
    iget-object v6, v6, La/z870;->e:La/ql5;

    .line 475
    .line 476
    move-object v15, v2

    .line 477
    goto :goto_a

    .line 478
    :goto_b
    iget-object v2, v3, La/xd70;->Y:La/z7z;

    .line 479
    .line 480
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    check-cast v2, La/bzt;

    .line 485
    .line 486
    iget-object v2, v2, La/bzt;->a:La/fsd;

    .line 487
    .line 488
    invoke-virtual {v2}, La/fsd;->a()La/v8d;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    iget-boolean v2, v2, La/v8d;->X:Z

    .line 493
    .line 494
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    check-cast v4, La/xb70;

    .line 499
    .line 500
    iget-object v4, v4, La/xb70;->o:La/f970;

    .line 501
    .line 502
    iget-boolean v4, v4, La/f970;->g:Z

    .line 503
    .line 504
    const-wide/16 v5, 0x0

    .line 505
    .line 506
    if-nez v4, :cond_15

    .line 507
    .line 508
    :goto_c
    move-object/from16 v17, v19

    .line 509
    .line 510
    goto :goto_e

    .line 511
    :cond_15
    const-string v4, "OneXGamesWebGame.BUNDLE_DEMO_BALANCE"

    .line 512
    .line 513
    invoke-virtual {v1, v4}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v4

    .line 517
    check-cast v4, Ljava/lang/Double;

    .line 518
    .line 519
    if-eqz v4, :cond_16

    .line 520
    .line 521
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 522
    .line 523
    .line 524
    move-result-wide v20

    .line 525
    goto :goto_d

    .line 526
    :cond_16
    move-wide/from16 v20, v5

    .line 527
    .line 528
    :goto_d
    iget-object v4, v3, La/xd70;->i0:La/ctf0;

    .line 529
    .line 530
    new-array v8, v11, [Ljava/lang/Object;

    .line 531
    .line 532
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 533
    .line 534
    invoke-static {v8, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v8

    .line 538
    const v11, 0x7f1307e3

    .line 539
    .line 540
    .line 541
    invoke-virtual {v4, v11, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v22

    .line 545
    const/16 v23, 0x0

    .line 546
    .line 547
    const/16 v24, 0x1f9c

    .line 548
    .line 549
    invoke-static/range {v19 .. v24}, La/ql5;->a(La/ql5;DLjava/lang/String;II)La/ql5;

    .line 550
    .line 551
    .line 552
    move-result-object v19

    .line 553
    goto :goto_c

    .line 554
    :goto_e
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    check-cast v4, La/xb70;

    .line 559
    .line 560
    iget-object v4, v4, La/xb70;->o:La/f970;

    .line 561
    .line 562
    iget-boolean v8, v4, La/f970;->g:Z

    .line 563
    .line 564
    if-nez v8, :cond_17

    .line 565
    .line 566
    :goto_f
    move-object/from16 v21, v4

    .line 567
    .line 568
    goto :goto_10

    .line 569
    :cond_17
    const-string v8, "OneXGamesWebGame.BUNDLE_DEMO_TOTAL_WIN_SUM"

    .line 570
    .line 571
    invoke-virtual {v1, v8}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    check-cast v1, Ljava/lang/Double;

    .line 576
    .line 577
    if-eqz v1, :cond_18

    .line 578
    .line 579
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 580
    .line 581
    .line 582
    move-result-wide v5

    .line 583
    :cond_18
    move-wide/from16 v23, v5

    .line 584
    .line 585
    const/16 v27, 0x0

    .line 586
    .line 587
    const/16 v28, 0x77

    .line 588
    .line 589
    const/16 v20, 0x0

    .line 590
    .line 591
    const/16 v21, 0x0

    .line 592
    .line 593
    const/16 v22, 0x0

    .line 594
    .line 595
    const/16 v25, 0x0

    .line 596
    .line 597
    const/16 v26, 0x0

    .line 598
    .line 599
    move-object/from16 v19, v4

    .line 600
    .line 601
    invoke-static/range {v19 .. v28}, La/f970;->a(La/f970;ZZZDZZZI)La/f970;

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    goto :goto_f

    .line 606
    :goto_10
    new-instance v14, La/cd70;

    .line 607
    .line 608
    move/from16 v20, v2

    .line 609
    .line 610
    move/from16 v19, v10

    .line 611
    .line 612
    invoke-direct/range {v14 .. v21}, La/cd70;-><init>(La/bm5;ZLa/ql5;ZZZLa/f970;)V

    .line 613
    .line 614
    .line 615
    move/from16 v4, v16

    .line 616
    .line 617
    move/from16 v5, v18

    .line 618
    .line 619
    move/from16 v2, v19

    .line 620
    .line 621
    move/from16 v1, v20

    .line 622
    .line 623
    invoke-virtual {v3, v14}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 624
    .line 625
    .line 626
    iput-object v7, v0, La/dd70;->o:Ljava/lang/Object;

    .line 627
    .line 628
    iput-boolean v5, v0, La/dd70;->j:Z

    .line 629
    .line 630
    iput-boolean v4, v0, La/dd70;->k:Z

    .line 631
    .line 632
    iput-boolean v2, v0, La/dd70;->l:Z

    .line 633
    .line 634
    iput-boolean v1, v0, La/dd70;->m:Z

    .line 635
    .line 636
    iput-byte v13, v0, La/dd70;->n:B

    .line 637
    .line 638
    invoke-virtual {v3, v0}, La/xd70;->O(La/zje;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v6

    .line 642
    if-ne v6, v9, :cond_19

    .line 643
    .line 644
    goto :goto_12

    .line 645
    :cond_19
    :goto_11
    iput-object v7, v0, La/dd70;->o:Ljava/lang/Object;

    .line 646
    .line 647
    iput-boolean v5, v0, La/dd70;->j:Z

    .line 648
    .line 649
    iput-boolean v4, v0, La/dd70;->k:Z

    .line 650
    .line 651
    iput-boolean v2, v0, La/dd70;->l:Z

    .line 652
    .line 653
    iput-boolean v1, v0, La/dd70;->m:Z

    .line 654
    .line 655
    iput-byte v12, v0, La/dd70;->n:B

    .line 656
    .line 657
    sget v1, La/xd70;->B0:I

    .line 658
    .line 659
    invoke-virtual {v3, v0}, La/xd70;->P(La/zje;)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    if-ne v0, v9, :cond_1a

    .line 664
    .line 665
    :goto_12
    move-object v7, v9

    .line 666
    goto :goto_14

    .line 667
    :cond_1a
    :goto_13
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 668
    .line 669
    :goto_14
    return-object v7

    .line 670
    nop

    .line 671
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
