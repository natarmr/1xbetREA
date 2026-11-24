.class public final synthetic La/qvk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pru;

.field public final synthetic c:La/bzt;

.field public final synthetic d:La/lbu;

.field public final synthetic e:La/svu;

.field public final synthetic f:La/r9u;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/lbu;La/pru;La/svu;La/wiu;La/bzt;La/y78;Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;La/vzg0;La/kuu;La/r9u;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/qvk0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qvk0;->d:La/lbu;

    iput-object p2, p0, La/qvk0;->b:La/pru;

    iput-object p3, p0, La/qvk0;->e:La/svu;

    iput-object p4, p0, La/qvk0;->g:Ljava/lang/Object;

    iput-object p5, p0, La/qvk0;->c:La/bzt;

    iput-object p6, p0, La/qvk0;->h:Ljava/lang/Object;

    iput-object p7, p0, La/qvk0;->i:Ljava/lang/Object;

    iput-object p8, p0, La/qvk0;->j:Ljava/lang/Object;

    iput-object p9, p0, La/qvk0;->k:Ljava/lang/Object;

    iput-object p10, p0, La/qvk0;->f:La/r9u;

    return-void
.end method

.method public synthetic constructor <init>(La/pru;La/bzt;La/lbu;La/rrc;La/svu;La/wyu;La/luu;La/qho;La/r9u;La/iqt;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/qvk0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qvk0;->b:La/pru;

    iput-object p2, p0, La/qvk0;->c:La/bzt;

    iput-object p3, p0, La/qvk0;->d:La/lbu;

    iput-object p4, p0, La/qvk0;->g:Ljava/lang/Object;

    iput-object p5, p0, La/qvk0;->e:La/svu;

    iput-object p6, p0, La/qvk0;->h:Ljava/lang/Object;

    iput-object p7, p0, La/qvk0;->i:Ljava/lang/Object;

    iput-object p8, p0, La/qvk0;->j:Ljava/lang/Object;

    iput-object p9, p0, La/qvk0;->f:La/r9u;

    iput-object p10, p0, La/qvk0;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 77

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qvk0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/qvk0;->k:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/qvk0;->f:La/r9u;

    .line 8
    .line 9
    iget-object v4, v0, La/qvk0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/qvk0;->i:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/qvk0;->h:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v7, v0, La/qvk0;->e:La/svu;

    .line 16
    .line 17
    iget-object v8, v0, La/qvk0;->g:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v9, v0, La/qvk0;->d:La/lbu;

    .line 20
    .line 21
    iget-object v10, v0, La/qvk0;->c:La/bzt;

    .line 22
    .line 23
    iget-object v0, v0, La/qvk0;->b:La/pru;

    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    check-cast v8, La/rrc;

    .line 30
    .line 31
    check-cast v6, La/wyu;

    .line 32
    .line 33
    check-cast v5, La/luu;

    .line 34
    .line 35
    check-cast v4, La/qho;

    .line 36
    .line 37
    check-cast v2, La/iqt;

    .line 38
    .line 39
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, v10, La/bzt;->a:La/fsd;

    .line 44
    .line 45
    invoke-virtual {v1}, La/fsd;->a()La/v8d;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget v1, v1, La/v8d;->r:I

    .line 50
    .line 51
    invoke-virtual {v9}, La/lbu;->j()Z

    .line 52
    .line 53
    .line 54
    move-result v21

    .line 55
    iget-object v8, v8, La/rrc;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v8, La/tgk;

    .line 58
    .line 59
    iget-object v8, v8, La/tgk;->i:La/n0o0;

    .line 60
    .line 61
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    check-cast v8, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result v19

    .line 71
    invoke-virtual {v7}, La/svu;->l()Z

    .line 72
    .line 73
    .line 74
    move-result v23

    .line 75
    sget-object v7, La/uaq0;->a:La/s9m0;

    .line 76
    .line 77
    invoke-static {v6, v7}, La/h97;->A(La/wyu;La/s9m0;)Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    const/4 v7, 0x1

    .line 82
    xor-int/lit8 v20, v6, 0x1

    .line 83
    .line 84
    iget-object v5, v5, La/luu;->a:La/nok0;

    .line 85
    .line 86
    invoke-virtual {v5}, La/nok0;->a()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v40

    .line 90
    invoke-virtual {v4}, La/qho;->a()V

    .line 91
    .line 92
    .line 93
    sget-object v4, La/ygp;->t:La/ygp;

    .line 94
    .line 95
    iget-object v3, v3, La/r9u;->a:La/j1q0;

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object v3, v3, La/j1q0;->a:La/m1q0;

    .line 101
    .line 102
    invoke-virtual {v3, v4}, La/m1q0;->d(La/ygp;)Z

    .line 103
    .line 104
    .line 105
    move-result v51

    .line 106
    iget-object v2, v2, La/iqt;->a:La/gst0;

    .line 107
    .line 108
    invoke-virtual {v2}, La/gst0;->a()Z

    .line 109
    .line 110
    .line 111
    move-result v76

    .line 112
    invoke-virtual/range {v40 .. v40}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    sget-object v2, La/iun;->a:La/iun;

    .line 116
    .line 117
    new-instance v3, La/ler0;

    .line 118
    .line 119
    sget-object v4, La/c2r0;->a:La/c2r0;

    .line 120
    .line 121
    sget-object v5, La/i1r0;->a:La/i1r0;

    .line 122
    .line 123
    invoke-direct {v3, v4, v5, v2}, La/ler0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 124
    .line 125
    .line 126
    new-instance v4, La/zyq0;

    .line 127
    .line 128
    sget-object v6, La/p1r0;->a:La/p1r0;

    .line 129
    .line 130
    invoke-direct {v4, v6, v5, v2}, La/zyq0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    new-instance v6, La/u8r0;

    .line 134
    .line 135
    sget-object v8, La/y1r0;->a:La/y1r0;

    .line 136
    .line 137
    invoke-direct {v6, v8, v5, v2}, La/u8r0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 138
    .line 139
    .line 140
    new-instance v8, La/c4r0;

    .line 141
    .line 142
    sget-object v9, La/d2r0;->a:La/d2r0;

    .line 143
    .line 144
    invoke-direct {v8, v9, v5, v2}, La/c4r0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 145
    .line 146
    .line 147
    new-instance v9, La/qer0;

    .line 148
    .line 149
    sget-object v10, La/b2r0;->a:La/b2r0;

    .line 150
    .line 151
    invoke-direct {v9, v10, v5, v2}, La/qer0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 152
    .line 153
    .line 154
    new-instance v10, La/per0;

    .line 155
    .line 156
    sget-object v12, La/a2r0;->a:La/a2r0;

    .line 157
    .line 158
    invoke-direct {v10, v12, v5, v2}, La/per0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 159
    .line 160
    .line 161
    new-instance v12, La/her0;

    .line 162
    .line 163
    sget-object v13, La/z1r0;->a:La/z1r0;

    .line 164
    .line 165
    sget-object v14, La/xun;->a:La/xun;

    .line 166
    .line 167
    invoke-direct {v12, v13, v5, v2, v14}, La/her0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;Ljava/util/Set;)V

    .line 168
    .line 169
    .line 170
    new-instance v13, La/hyq0;

    .line 171
    .line 172
    sget-object v14, La/n1r0;->a:La/n1r0;

    .line 173
    .line 174
    invoke-direct {v13, v14, v5, v2, v2}, La/hyq0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;Ljava/util/List;)V

    .line 175
    .line 176
    .line 177
    new-instance v14, La/s8r0;

    .line 178
    .line 179
    sget-object v15, La/w1r0;->a:La/w1r0;

    .line 180
    .line 181
    invoke-direct {v14, v15, v5, v2}, La/s8r0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 182
    .line 183
    .line 184
    new-instance v15, La/t8r0;

    .line 185
    .line 186
    sget-object v7, La/x1r0;->a:La/x1r0;

    .line 187
    .line 188
    invoke-direct {v15, v7, v5, v2}, La/t8r0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 189
    .line 190
    .line 191
    new-instance v7, La/zxq0;

    .line 192
    .line 193
    move-object/from16 v54, v3

    .line 194
    .line 195
    sget-object v3, La/l1r0;->a:La/l1r0;

    .line 196
    .line 197
    invoke-direct {v7, v3, v5, v11}, La/zxq0;-><init>(La/f2r0;La/j1r0;La/uhc0;)V

    .line 198
    .line 199
    .line 200
    new-instance v3, La/xxq0;

    .line 201
    .line 202
    sget-object v11, La/k1r0;->a:La/k1r0;

    .line 203
    .line 204
    invoke-direct {v3, v11, v5, v2}, La/xxq0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 205
    .line 206
    .line 207
    new-instance v11, La/iyq0;

    .line 208
    .line 209
    move-object/from16 v65, v3

    .line 210
    .line 211
    sget-object v3, La/o1r0;->a:La/o1r0;

    .line 212
    .line 213
    invoke-direct {v11, v3, v5, v2}, La/iyq0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 214
    .line 215
    .line 216
    new-instance v3, La/eyq0;

    .line 217
    .line 218
    move-object/from16 v55, v4

    .line 219
    .line 220
    sget-object v4, La/m1r0;->a:La/m1r0;

    .line 221
    .line 222
    move-object/from16 v56, v6

    .line 223
    .line 224
    const/4 v6, 0x0

    .line 225
    invoke-direct {v3, v4, v5, v6}, La/eyq0;-><init>(La/f2r0;La/j1r0;La/cic0;)V

    .line 226
    .line 227
    .line 228
    new-instance v4, La/pfr0;

    .line 229
    .line 230
    sget-object v6, La/e2r0;->a:La/e2r0;

    .line 231
    .line 232
    invoke-direct {v4, v6, v5, v2, v2}, La/pfr0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;Ljava/util/List;)V

    .line 233
    .line 234
    .line 235
    new-instance v6, La/n2r0;

    .line 236
    .line 237
    move-object/from16 v67, v3

    .line 238
    .line 239
    sget-object v3, La/t1r0;->a:La/t1r0;

    .line 240
    .line 241
    invoke-direct {v6, v3, v5, v2}, La/n2r0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 242
    .line 243
    .line 244
    new-instance v3, La/b3r0;

    .line 245
    .line 246
    move-object/from16 v68, v4

    .line 247
    .line 248
    sget-object v4, La/v1r0;->a:La/v1r0;

    .line 249
    .line 250
    invoke-direct {v3, v4, v5, v2}, La/b3r0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 251
    .line 252
    .line 253
    new-instance v4, La/a3r0;

    .line 254
    .line 255
    move-object/from16 v70, v3

    .line 256
    .line 257
    sget-object v3, La/u1r0;->a:La/u1r0;

    .line 258
    .line 259
    invoke-direct {v4, v3, v5, v2}, La/a3r0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 260
    .line 261
    .line 262
    new-instance v3, La/j2r0;

    .line 263
    .line 264
    move-object/from16 v71, v4

    .line 265
    .line 266
    sget-object v4, La/r1r0;->a:La/r1r0;

    .line 267
    .line 268
    invoke-direct {v3, v4, v5, v2}, La/j2r0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 269
    .line 270
    .line 271
    new-instance v4, La/h2r0;

    .line 272
    .line 273
    move-object/from16 v72, v3

    .line 274
    .line 275
    sget-object v3, La/q1r0;->a:La/q1r0;

    .line 276
    .line 277
    invoke-direct {v4, v3, v5, v2}, La/h2r0;-><init>(La/f2r0;La/j1r0;Ljava/util/List;)V

    .line 278
    .line 279
    .line 280
    new-instance v3, La/o8r0;

    .line 281
    .line 282
    sget-object v5, La/n8r0;->a:La/n8r0;

    .line 283
    .line 284
    invoke-direct {v3, v5, v1}, La/o8r0;-><init>(La/n8r0;I)V

    .line 285
    .line 286
    .line 287
    iget-object v1, v0, La/sff0;->L:La/rib0;

    .line 288
    .line 289
    iget-object v5, v0, La/sff0;->g:La/mum0;

    .line 290
    .line 291
    move-object/from16 v41, v2

    .line 292
    .line 293
    iget v2, v1, La/rib0;->c:I

    .line 294
    .line 295
    move/from16 v18, v2

    .line 296
    .line 297
    iget-boolean v2, v0, La/sff0;->J:Z

    .line 298
    .line 299
    iget-boolean v1, v1, La/rib0;->e:Z

    .line 300
    .line 301
    move/from16 v24, v1

    .line 302
    .line 303
    iget-object v1, v0, La/sff0;->d:La/q1w0;

    .line 304
    .line 305
    move/from16 v22, v2

    .line 306
    .line 307
    iget-boolean v2, v1, La/q1w0;->b:Z

    .line 308
    .line 309
    move/from16 v25, v2

    .line 310
    .line 311
    iget-boolean v2, v1, La/q1w0;->c:Z

    .line 312
    .line 313
    move/from16 v27, v2

    .line 314
    .line 315
    iget-object v2, v0, La/sff0;->c:La/ech;

    .line 316
    .line 317
    move-object/from16 v74, v3

    .line 318
    .line 319
    iget-boolean v3, v2, La/ech;->b:Z

    .line 320
    .line 321
    iget-object v1, v1, La/q1w0;->a:La/dyv0;

    .line 322
    .line 323
    iget-object v1, v1, La/dyv0;->b:Ljava/lang/String;

    .line 324
    .line 325
    iget-boolean v2, v2, La/ech;->f:Z

    .line 326
    .line 327
    move-object/from16 v35, v1

    .line 328
    .line 329
    iget-object v1, v0, La/sff0;->b:La/hl1;

    .line 330
    .line 331
    move/from16 v42, v2

    .line 332
    .line 333
    iget-object v2, v1, La/hl1;->a:La/f61;

    .line 334
    .line 335
    move/from16 v30, v3

    .line 336
    .line 337
    iget-boolean v3, v2, La/f61;->c:Z

    .line 338
    .line 339
    move/from16 v43, v3

    .line 340
    .line 341
    iget-object v3, v1, La/hl1;->e:La/hr10;

    .line 342
    .line 343
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    packed-switch v3, :pswitch_data_1

    .line 348
    .line 349
    .line 350
    invoke-static {}, La/t9f;->b()V

    .line 351
    .line 352
    .line 353
    :goto_0
    const/4 v11, 0x0

    .line 354
    goto/16 :goto_7

    .line 355
    .line 356
    :pswitch_0
    sget-object v3, La/cq5;->a:La/cq5;

    .line 357
    .line 358
    :goto_1
    move-object/from16 v32, v3

    .line 359
    .line 360
    goto :goto_2

    .line 361
    :pswitch_1
    sget-object v3, La/eq5;->a:La/eq5;

    .line 362
    .line 363
    goto :goto_1

    .line 364
    :pswitch_2
    sget-object v3, La/dq5;->a:La/dq5;

    .line 365
    .line 366
    goto :goto_1

    .line 367
    :pswitch_3
    sget-object v3, La/gq5;->a:La/gq5;

    .line 368
    .line 369
    goto :goto_1

    .line 370
    :pswitch_4
    sget-object v3, La/fq5;->a:La/fq5;

    .line 371
    .line 372
    goto :goto_1

    .line 373
    :pswitch_5
    sget-object v3, La/iq5;->a:La/iq5;

    .line 374
    .line 375
    goto :goto_1

    .line 376
    :pswitch_6
    sget-object v3, La/hq5;->a:La/hq5;

    .line 377
    .line 378
    goto :goto_1

    .line 379
    :pswitch_7
    sget-object v3, La/kq5;->a:La/kq5;

    .line 380
    .line 381
    goto :goto_1

    .line 382
    :pswitch_8
    new-instance v3, La/jq5;

    .line 383
    .line 384
    invoke-direct {v3}, La/jq5;-><init>()V

    .line 385
    .line 386
    .line 387
    goto :goto_1

    .line 388
    :goto_2
    iget-object v3, v5, La/mum0;->a:La/c4l0;

    .line 389
    .line 390
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    if-eqz v3, :cond_4

    .line 395
    .line 396
    move-object/from16 v73, v4

    .line 397
    .line 398
    const/4 v4, 0x1

    .line 399
    if-eq v3, v4, :cond_3

    .line 400
    .line 401
    const/4 v4, 0x2

    .line 402
    if-eq v3, v4, :cond_2

    .line 403
    .line 404
    const/4 v4, 0x3

    .line 405
    if-eq v3, v4, :cond_1

    .line 406
    .line 407
    const/4 v4, 0x4

    .line 408
    if-ne v3, v4, :cond_0

    .line 409
    .line 410
    sget-object v3, La/uql0;->b:La/uql0;

    .line 411
    .line 412
    :goto_3
    move-object/from16 v33, v3

    .line 413
    .line 414
    goto :goto_4

    .line 415
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 416
    .line 417
    .line 418
    goto :goto_0

    .line 419
    :cond_1
    sget-object v3, La/uql0;->e:La/uql0;

    .line 420
    .line 421
    goto :goto_3

    .line 422
    :cond_2
    sget-object v3, La/uql0;->d:La/uql0;

    .line 423
    .line 424
    goto :goto_3

    .line 425
    :cond_3
    sget-object v3, La/uql0;->a:La/uql0;

    .line 426
    .line 427
    goto :goto_3

    .line 428
    :cond_4
    move-object/from16 v73, v4

    .line 429
    .line 430
    sget-object v3, La/uql0;->c:La/uql0;

    .line 431
    .line 432
    goto :goto_3

    .line 433
    :goto_4
    iget-boolean v2, v2, La/f61;->k:Z

    .line 434
    .line 435
    iget-object v3, v5, La/mum0;->m:La/ohb0;

    .line 436
    .line 437
    iget-object v3, v3, La/ohb0;->a:Ljava/lang/String;

    .line 438
    .line 439
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 440
    .line 441
    .line 442
    move-result v4

    .line 443
    sget-object v16, La/d3v0;->a:La/d3v0;

    .line 444
    .line 445
    sparse-switch v4, :sswitch_data_0

    .line 446
    .line 447
    .line 448
    goto :goto_5

    .line 449
    :sswitch_0
    const-string v4, "smallSquaresNoHeader"

    .line 450
    .line 451
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    if-nez v3, :cond_5

    .line 456
    .line 457
    goto :goto_5

    .line 458
    :cond_5
    sget-object v16, La/e3v0;->a:La/e3v0;

    .line 459
    .line 460
    :cond_6
    :goto_5
    move-object/from16 v37, v16

    .line 461
    .line 462
    goto :goto_6

    .line 463
    :sswitch_1
    const-string v4, "smallCircles"

    .line 464
    .line 465
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    if-eqz v3, :cond_6

    .line 470
    .line 471
    sget-object v16, La/c3v0;->a:La/c3v0;

    .line 472
    .line 473
    goto :goto_5

    .line 474
    :sswitch_2
    const-string v4, "mediumRectangles"

    .line 475
    .line 476
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    if-nez v3, :cond_7

    .line 481
    .line 482
    goto :goto_5

    .line 483
    :cond_7
    sget-object v16, La/b3v0;->a:La/b3v0;

    .line 484
    .line 485
    goto :goto_5

    .line 486
    :sswitch_3
    const-string v4, "smallSquares"

    .line 487
    .line 488
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    goto :goto_5

    .line 493
    :goto_6
    iget-object v3, v1, La/hl1;->l:La/ot0;

    .line 494
    .line 495
    iget-object v4, v0, La/sff0;->o1:Ljava/util/List;

    .line 496
    .line 497
    move/from16 v26, v2

    .line 498
    .line 499
    iget-boolean v2, v1, La/hl1;->C:Z

    .line 500
    .line 501
    iget-boolean v1, v1, La/hl1;->b:Z

    .line 502
    .line 503
    move/from16 v29, v1

    .line 504
    .line 505
    iget-boolean v1, v0, La/sff0;->O0:Z

    .line 506
    .line 507
    iget-object v5, v5, La/mum0;->y:La/v5l0;

    .line 508
    .line 509
    iget-boolean v0, v0, La/sff0;->J1:Z

    .line 510
    .line 511
    new-instance v75, La/xdr0;

    .line 512
    .line 513
    const/16 v34, 0x0

    .line 514
    .line 515
    const-string v36, ""

    .line 516
    .line 517
    move-object/from16 v61, v13

    .line 518
    .line 519
    const/4 v13, 0x0

    .line 520
    move-object/from16 v63, v14

    .line 521
    .line 522
    const/4 v14, 0x0

    .line 523
    move-object/from16 v64, v15

    .line 524
    .line 525
    const/4 v15, 0x0

    .line 526
    const/16 v16, 0x0

    .line 527
    .line 528
    const/16 v17, 0x0

    .line 529
    .line 530
    const/16 v31, 0x0

    .line 531
    .line 532
    const/16 v44, 0x0

    .line 533
    .line 534
    move-object/from16 v38, v35

    .line 535
    .line 536
    move/from16 v46, v29

    .line 537
    .line 538
    move/from16 v47, v2

    .line 539
    .line 540
    move/from16 v50, v0

    .line 541
    .line 542
    move/from16 v48, v1

    .line 543
    .line 544
    move/from16 v28, v2

    .line 545
    .line 546
    move-object/from16 v39, v3

    .line 547
    .line 548
    move-object/from16 v45, v4

    .line 549
    .line 550
    move-object/from16 v49, v5

    .line 551
    .line 552
    move-object/from16 v60, v12

    .line 553
    .line 554
    move-object/from16 v12, v75

    .line 555
    .line 556
    invoke-direct/range {v12 .. v51}, La/xdr0;-><init>(ZZZZZIZZZZZZZZZZZZZLa/lq5;La/uql0;La/wcb;Ljava/lang/String;Ljava/lang/String;La/f3v0;Ljava/lang/String;La/ot0;Ljava/util/List;Ljava/util/List;ZZLjava/lang/Integer;Ljava/util/List;ZZZLa/v5l0;ZZ)V

    .line 557
    .line 558
    .line 559
    new-instance v52, La/ser0;

    .line 560
    .line 561
    move-object/from16 v69, v6

    .line 562
    .line 563
    move-object/from16 v62, v7

    .line 564
    .line 565
    move-object/from16 v57, v8

    .line 566
    .line 567
    move-object/from16 v58, v9

    .line 568
    .line 569
    move-object/from16 v59, v10

    .line 570
    .line 571
    move-object/from16 v66, v11

    .line 572
    .line 573
    move-object/from16 v53, v41

    .line 574
    .line 575
    invoke-direct/range {v52 .. v76}, La/ser0;-><init>(Ljava/util/List;La/ler0;La/zyq0;La/u8r0;La/c4r0;La/qer0;La/per0;La/her0;La/hyq0;La/zxq0;La/s8r0;La/t8r0;La/xxq0;La/iyq0;La/eyq0;La/pfr0;La/n2r0;La/b3r0;La/a3r0;La/j2r0;La/h2r0;La/o8r0;La/xdr0;Z)V

    .line 576
    .line 577
    .line 578
    move-object/from16 v11, v52

    .line 579
    .line 580
    :goto_7
    return-object v11

    .line 581
    :pswitch_9
    check-cast v8, La/wiu;

    .line 582
    .line 583
    move-object/from16 v32, v6

    .line 584
    .line 585
    check-cast v32, La/y78;

    .line 586
    .line 587
    check-cast v5, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 588
    .line 589
    check-cast v4, La/vzg0;

    .line 590
    .line 591
    check-cast v2, La/kuu;

    .line 592
    .line 593
    invoke-virtual {v9}, La/lbu;->j()Z

    .line 594
    .line 595
    .line 596
    move-result v29

    .line 597
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-virtual {v7}, La/svu;->l()Z

    .line 602
    .line 603
    .line 604
    move-result v34

    .line 605
    invoke-virtual {v8}, La/wiu;->a()Ljava/util/Locale;

    .line 606
    .line 607
    .line 608
    move-result-object v38

    .line 609
    iget-object v1, v10, La/bzt;->a:La/fsd;

    .line 610
    .line 611
    invoke-virtual {v1}, La/fsd;->a()La/v8d;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    iget v1, v1, La/v8d;->r:I

    .line 616
    .line 617
    iget v6, v5, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 618
    .line 619
    iget-object v7, v5, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->e:Ljava/util/List;

    .line 620
    .line 621
    iget-boolean v8, v5, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->d:Z

    .line 622
    .line 623
    const-string v9, "MAIN_EXPANDED_IDS_KEY"

    .line 624
    .line 625
    invoke-virtual {v4, v9}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v9

    .line 629
    check-cast v9, Ljava/util/Set;

    .line 630
    .line 631
    if-nez v9, :cond_8

    .line 632
    .line 633
    sget-object v9, La/xun;->a:La/xun;

    .line 634
    .line 635
    :cond_8
    move-object/from16 v23, v9

    .line 636
    .line 637
    const-string v9, "TEAM_EXPANDED_IDS_KEY"

    .line 638
    .line 639
    invoke-virtual {v4, v9}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    check-cast v4, Ljava/util/Set;

    .line 644
    .line 645
    if-nez v4, :cond_9

    .line 646
    .line 647
    sget-object v4, La/xun;->a:La/xun;

    .line 648
    .line 649
    :cond_9
    iget v5, v5, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 650
    .line 651
    invoke-virtual {v2, v5}, La/kuu;->a(I)La/lok0;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    sget-object v5, La/ygp;->t:La/ygp;

    .line 656
    .line 657
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    iget-object v3, v3, La/r9u;->a:La/j1q0;

    .line 661
    .line 662
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    iget-object v3, v3, La/j1q0;->a:La/m1q0;

    .line 666
    .line 667
    invoke-virtual {v3, v5}, La/m1q0;->d(La/ygp;)Z

    .line 668
    .line 669
    .line 670
    move-result v69

    .line 671
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 672
    .line 673
    .line 674
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    new-instance v3, La/xl9;

    .line 681
    .line 682
    sget-object v5, La/iun;->a:La/iun;

    .line 683
    .line 684
    const/4 v9, 0x0

    .line 685
    invoke-direct {v3, v9, v5}, La/xl9;-><init>(Ljava/util/Date;Ljava/util/List;)V

    .line 686
    .line 687
    .line 688
    new-instance v9, La/a9l0;

    .line 689
    .line 690
    const-wide/16 v10, -0x141

    .line 691
    .line 692
    invoke-direct {v9, v10, v11, v5}, La/a9l0;-><init>(JLjava/util/List;)V

    .line 693
    .line 694
    .line 695
    new-instance v17, La/sdt;

    .line 696
    .line 697
    const/16 v22, 0x0

    .line 698
    .line 699
    sget-object v18, La/atk0;->a:La/atk0;

    .line 700
    .line 701
    move-object/from16 v20, v5

    .line 702
    .line 703
    move-object/from16 v21, v5

    .line 704
    .line 705
    move-object/from16 v19, v5

    .line 706
    .line 707
    invoke-direct/range {v17 .. v23}, La/sdt;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Set;)V

    .line 708
    .line 709
    .line 710
    move-object/from16 v43, v17

    .line 711
    .line 712
    move-object/from16 v5, v18

    .line 713
    .line 714
    new-instance v10, Ljava/util/ArrayList;

    .line 715
    .line 716
    const/16 v11, 0xa

    .line 717
    .line 718
    invoke-static {v7, v11}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 719
    .line 720
    .line 721
    move-result v11

    .line 722
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 723
    .line 724
    .line 725
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 726
    .line 727
    .line 728
    move-result-object v11

    .line 729
    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 730
    .line 731
    .line 732
    move-result v12

    .line 733
    if-eqz v12, :cond_a

    .line 734
    .line 735
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v12

    .line 739
    check-cast v12, Ljava/lang/Number;

    .line 740
    .line 741
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 742
    .line 743
    .line 744
    move-result v12

    .line 745
    packed-switch v12, :pswitch_data_2

    .line 746
    .line 747
    .line 748
    sget-object v12, La/ruk0;->a:La/ruk0;

    .line 749
    .line 750
    goto :goto_9

    .line 751
    :pswitch_a
    sget-object v12, La/fuk0;->a:La/fuk0;

    .line 752
    .line 753
    goto :goto_9

    .line 754
    :pswitch_b
    sget-object v12, La/guk0;->a:La/guk0;

    .line 755
    .line 756
    goto :goto_9

    .line 757
    :pswitch_c
    sget-object v12, La/duk0;->a:La/duk0;

    .line 758
    .line 759
    goto :goto_9

    .line 760
    :pswitch_d
    sget-object v12, La/auk0;->a:La/auk0;

    .line 761
    .line 762
    goto :goto_9

    .line 763
    :pswitch_e
    sget-object v12, La/ytk0;->a:La/ytk0;

    .line 764
    .line 765
    goto :goto_9

    .line 766
    :pswitch_f
    sget-object v12, La/buk0;->a:La/buk0;

    .line 767
    .line 768
    goto :goto_9

    .line 769
    :pswitch_10
    sget-object v12, La/xtk0;->a:La/xtk0;

    .line 770
    .line 771
    goto :goto_9

    .line 772
    :pswitch_11
    sget-object v12, La/vtk0;->a:La/vtk0;

    .line 773
    .line 774
    goto :goto_9

    .line 775
    :pswitch_12
    sget-object v12, La/utk0;->a:La/utk0;

    .line 776
    .line 777
    goto :goto_9

    .line 778
    :pswitch_13
    sget-object v12, La/wtk0;->a:La/wtk0;

    .line 779
    .line 780
    goto :goto_9

    .line 781
    :pswitch_14
    sget-object v12, La/kuk0;->a:La/kuk0;

    .line 782
    .line 783
    goto :goto_9

    .line 784
    :pswitch_15
    sget-object v12, La/euk0;->a:La/euk0;

    .line 785
    .line 786
    goto :goto_9

    .line 787
    :pswitch_16
    sget-object v12, La/iuk0;->a:La/iuk0;

    .line 788
    .line 789
    goto :goto_9

    .line 790
    :pswitch_17
    sget-object v12, La/muk0;->a:La/muk0;

    .line 791
    .line 792
    goto :goto_9

    .line 793
    :pswitch_18
    sget-object v12, La/ztk0;->a:La/ztk0;

    .line 794
    .line 795
    goto :goto_9

    .line 796
    :pswitch_19
    sget-object v12, La/cuk0;->a:La/cuk0;

    .line 797
    .line 798
    goto :goto_9

    .line 799
    :pswitch_1a
    sget-object v12, La/huk0;->a:La/huk0;

    .line 800
    .line 801
    goto :goto_9

    .line 802
    :pswitch_1b
    sget-object v12, La/juk0;->a:La/juk0;

    .line 803
    .line 804
    goto :goto_9

    .line 805
    :pswitch_1c
    sget-object v12, La/ouk0;->a:La/ouk0;

    .line 806
    .line 807
    goto :goto_9

    .line 808
    :pswitch_1d
    sget-object v12, La/nuk0;->a:La/nuk0;

    .line 809
    .line 810
    :goto_9
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    goto :goto_8

    .line 814
    :cond_a
    new-instance v11, La/fvk0;

    .line 815
    .line 816
    sget-object v12, La/iun;->a:La/iun;

    .line 817
    .line 818
    invoke-direct {v11, v5, v12, v12, v12}, La/fvk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 819
    .line 820
    .line 821
    new-instance v13, La/bvk0;

    .line 822
    .line 823
    invoke-direct {v13, v5, v12, v12}, La/bvk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;)V

    .line 824
    .line 825
    .line 826
    new-instance v14, La/evk0;

    .line 827
    .line 828
    invoke-direct {v14, v5, v12}, La/evk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 829
    .line 830
    .line 831
    new-instance v15, La/lpp0;

    .line 832
    .line 833
    move/from16 v39, v1

    .line 834
    .line 835
    new-instance v1, La/wpp0;

    .line 836
    .line 837
    invoke-direct {v1, v5, v12}, La/wpp0;-><init>(La/btk0;Ljava/util/List;)V

    .line 838
    .line 839
    .line 840
    move-object/from16 v41, v3

    .line 841
    .line 842
    new-instance v3, La/vpp0;

    .line 843
    .line 844
    invoke-direct {v3, v5, v12}, La/vpp0;-><init>(La/btk0;Ljava/util/List;)V

    .line 845
    .line 846
    .line 847
    move/from16 v18, v6

    .line 848
    .line 849
    new-instance v6, La/opp0;

    .line 850
    .line 851
    invoke-direct {v6, v5, v12, v4}, La/opp0;-><init>(La/btk0;Ljava/util/List;Ljava/util/Set;)V

    .line 852
    .line 853
    .line 854
    invoke-direct {v15, v1, v3, v6}, La/lpp0;-><init>(La/wpp0;La/vpp0;La/opp0;)V

    .line 855
    .line 856
    .line 857
    new-instance v1, La/rtk0;

    .line 858
    .line 859
    invoke-direct {v1, v5, v12}, La/rtk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 860
    .line 861
    .line 862
    new-instance v3, La/pvk0;

    .line 863
    .line 864
    invoke-direct {v3, v5, v12, v12}, La/pvk0;-><init>(La/btk0;Ljava/util/List;Ljava/util/List;)V

    .line 865
    .line 866
    .line 867
    new-instance v4, La/otk0;

    .line 868
    .line 869
    invoke-direct {v4, v5, v12}, La/otk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 870
    .line 871
    .line 872
    new-instance v6, La/jwk0;

    .line 873
    .line 874
    move-object/from16 v51, v1

    .line 875
    .line 876
    const/4 v1, 0x0

    .line 877
    invoke-direct {v6, v5, v12, v1}, La/jwk0;-><init>(La/btk0;Ljava/util/List;I)V

    .line 878
    .line 879
    .line 880
    new-instance v1, La/gqk0;

    .line 881
    .line 882
    move-object/from16 v50, v3

    .line 883
    .line 884
    const/4 v3, 0x0

    .line 885
    invoke-direct {v1, v5, v3}, La/gqk0;-><init>(La/btk0;La/o0;)V

    .line 886
    .line 887
    .line 888
    new-instance v3, La/etk0;

    .line 889
    .line 890
    invoke-direct {v3, v5, v12}, La/etk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 891
    .line 892
    .line 893
    move-object/from16 v56, v1

    .line 894
    .line 895
    new-instance v1, La/qtk0;

    .line 896
    .line 897
    move-object/from16 v59, v3

    .line 898
    .line 899
    const/4 v3, 0x0

    .line 900
    invoke-direct {v1, v5, v3}, La/qtk0;-><init>(La/btk0;La/ixb0;)V

    .line 901
    .line 902
    .line 903
    new-instance v3, La/dtk0;

    .line 904
    .line 905
    invoke-direct {v3, v5, v12}, La/dtk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 906
    .line 907
    .line 908
    move-object/from16 v60, v1

    .line 909
    .line 910
    new-instance v1, La/gtk0;

    .line 911
    .line 912
    invoke-direct {v1, v5, v12}, La/gtk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 913
    .line 914
    .line 915
    move-object/from16 v57, v1

    .line 916
    .line 917
    new-instance v1, La/ltk0;

    .line 918
    .line 919
    invoke-direct {v1, v5, v12}, La/ltk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 920
    .line 921
    .line 922
    move-object/from16 v58, v1

    .line 923
    .line 924
    new-instance v1, La/ntk0;

    .line 925
    .line 926
    invoke-direct {v1, v5, v12}, La/ntk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 927
    .line 928
    .line 929
    move-object/from16 v61, v1

    .line 930
    .line 931
    new-instance v1, La/avk0;

    .line 932
    .line 933
    invoke-direct {v1, v5, v12}, La/avk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 934
    .line 935
    .line 936
    move-object/from16 v63, v1

    .line 937
    .line 938
    new-instance v1, La/ctk0;

    .line 939
    .line 940
    move-object/from16 v62, v3

    .line 941
    .line 942
    const/4 v3, 0x0

    .line 943
    invoke-direct {v1, v5, v12, v3}, La/ctk0;-><init>(La/btk0;Ljava/util/List;I)V

    .line 944
    .line 945
    .line 946
    new-instance v3, La/stk0;

    .line 947
    .line 948
    invoke-direct {v3, v5, v12}, La/stk0;-><init>(La/btk0;Ljava/util/List;)V

    .line 949
    .line 950
    .line 951
    sget-object v67, La/mtk0;->a:La/mtk0;

    .line 952
    .line 953
    iget v5, v2, La/lok0;->a:I

    .line 954
    .line 955
    move-object/from16 v65, v3

    .line 956
    .line 957
    move-object/from16 v54, v4

    .line 958
    .line 959
    iget-wide v3, v2, La/lok0;->f:J

    .line 960
    .line 961
    move-wide/from16 v21, v3

    .line 962
    .line 963
    iget-wide v3, v2, La/lok0;->g:J

    .line 964
    .line 965
    iget-boolean v12, v0, La/sff0;->J1:Z

    .line 966
    .line 967
    move-object/from16 v64, v1

    .line 968
    .line 969
    iget-boolean v1, v0, La/sff0;->J:Z

    .line 970
    .line 971
    move/from16 v31, v1

    .line 972
    .line 973
    iget-boolean v1, v2, La/lok0;->n:Z

    .line 974
    .line 975
    move/from16 v26, v1

    .line 976
    .line 977
    iget-boolean v1, v2, La/lok0;->p:Z

    .line 978
    .line 979
    move/from16 v27, v1

    .line 980
    .line 981
    iget-boolean v1, v2, La/lok0;->i:Z

    .line 982
    .line 983
    move/from16 v28, v1

    .line 984
    .line 985
    iget-object v1, v2, La/lok0;->e:La/oho;

    .line 986
    .line 987
    invoke-static {v1, v0}, La/xdx;->P(La/oho;La/sff0;)La/v5l0;

    .line 988
    .line 989
    .line 990
    move-result-object v33

    .line 991
    iget-boolean v0, v0, La/sff0;->O0:Z

    .line 992
    .line 993
    iget-object v1, v2, La/lok0;->u:Ljava/lang/String;

    .line 994
    .line 995
    iget-object v2, v2, La/lok0;->e:La/oho;

    .line 996
    .line 997
    new-instance v17, La/ttk0;

    .line 998
    .line 999
    move/from16 v35, v0

    .line 1000
    .line 1001
    move-object/from16 v36, v1

    .line 1002
    .line 1003
    move-object/from16 v37, v2

    .line 1004
    .line 1005
    move-wide/from16 v23, v3

    .line 1006
    .line 1007
    move/from16 v20, v5

    .line 1008
    .line 1009
    move-object/from16 v25, v7

    .line 1010
    .line 1011
    move/from16 v19, v8

    .line 1012
    .line 1013
    move/from16 v30, v12

    .line 1014
    .line 1015
    invoke-direct/range {v17 .. v39}, La/ttk0;-><init>(IZIJJLjava/util/List;ZZZZZZLa/y78;La/v5l0;ZZLjava/lang/String;La/oho;Ljava/util/Locale;I)V

    .line 1016
    .line 1017
    .line 1018
    new-instance v39, La/dvk0;

    .line 1019
    .line 1020
    const/16 v47, 0x0

    .line 1021
    .line 1022
    const/16 v66, 0x0

    .line 1023
    .line 1024
    const/16 v40, 0x0

    .line 1025
    .line 1026
    const/16 v45, 0x0

    .line 1027
    .line 1028
    const/16 v46, 0x0

    .line 1029
    .line 1030
    move-object/from16 v55, v6

    .line 1031
    .line 1032
    move-object/from16 v42, v9

    .line 1033
    .line 1034
    move-object/from16 v44, v10

    .line 1035
    .line 1036
    move-object/from16 v52, v11

    .line 1037
    .line 1038
    move-object/from16 v53, v13

    .line 1039
    .line 1040
    move-object/from16 v48, v14

    .line 1041
    .line 1042
    move-object/from16 v49, v15

    .line 1043
    .line 1044
    move-object/from16 v68, v17

    .line 1045
    .line 1046
    invoke-direct/range {v39 .. v69}, La/dvk0;-><init>(ZLa/xl9;La/a9l0;La/sdt;Ljava/util/List;La/ptk0;La/cvk0;La/gvk0;La/evk0;La/lpp0;La/pvk0;La/rtk0;La/fvk0;La/bvk0;La/otk0;La/jwk0;La/gqk0;La/gtk0;La/ltk0;La/etk0;La/qtk0;La/ntk0;La/dtk0;La/avk0;La/ctk0;La/stk0;La/wcb;La/mtk0;La/ttk0;Z)V

    .line 1047
    .line 1048
    .line 1049
    return-object v39

    .line 1050
    nop

    .line 1051
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
    .end packed-switch

    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    :sswitch_data_0
    .sparse-switch
        -0x48099811 -> :sswitch_3
        0x54f5e39 -> :sswitch_2
        0x5bc27a9c -> :sswitch_1
        0x6d8c34bd -> :sswitch_0
    .end sparse-switch

    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method
