.class public final synthetic La/lf2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/lf2;->a:B

    iput-object p1, p0, La/lf2;->c:Ljava/lang/Object;

    iput-object p2, p0, La/lf2;->d:Ljava/lang/Object;

    iput-boolean p3, p0, La/lf2;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/lf2;->a:B

    iput-object p1, p0, La/lf2;->c:Ljava/lang/Object;

    iput-boolean p2, p0, La/lf2;->b:Z

    iput-object p3, p0, La/lf2;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p4, p0, La/lf2;->a:B

    iput-boolean p1, p0, La/lf2;->b:Z

    iput-object p2, p0, La/lf2;->c:Ljava/lang/Object;

    iput-object p3, p0, La/lf2;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lf2;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    const/16 v4, 0x213

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v13, v0, La/lf2;->b:Z

    .line 15
    .line 16
    iget-object v1, v0, La/lf2;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, La/bzt;

    .line 19
    .line 20
    iget-object v0, v0, La/lf2;->d:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v15, v0

    .line 23
    check-cast v15, Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v13, :cond_0

    .line 26
    .line 27
    sget-object v0, La/bm5;->e:La/bm5;

    .line 28
    .line 29
    :goto_0
    move-object v8, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    sget-object v0, La/bm5;->a:La/bm5;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :goto_1
    sget-object v9, La/hts0;->a:La/hts0;

    .line 35
    .line 36
    iget-object v0, v1, La/bzt;->a:La/fsd;

    .line 37
    .line 38
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget v0, v0, La/v8d;->r:I

    .line 43
    .line 44
    new-instance v7, La/fts0;

    .line 45
    .line 46
    const/4 v12, 0x0

    .line 47
    const-string v14, ""

    .line 48
    .line 49
    const-wide/16 v10, 0x0

    .line 50
    .line 51
    move/from16 v16, v0

    .line 52
    .line 53
    invoke-direct/range {v7 .. v16}, La/fts0;-><init>(La/bm5;La/its0;JZZLjava/lang/String;Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    return-object v7

    .line 57
    :pswitch_0
    iget-boolean v1, v0, La/lf2;->b:Z

    .line 58
    .line 59
    iget-object v2, v0, La/lf2;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, La/o890;

    .line 62
    .line 63
    iget-object v0, v0, La/lf2;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Landroid/webkit/PermissionRequest;

    .line 66
    .line 67
    sget-object v3, La/o890;->f2:La/jh70;

    .line 68
    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 76
    .line 77
    invoke-static {v1}, La/hne;->j(Ljava/lang/String;)Landroid/content/Intent;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const-string v2, "package"

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-static {v2, v3, v6}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1, v4}, La/agd;->startActivityForResult(Landroid/content/Intent;I)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_1
    invoke-virtual {v2, v0}, La/o890;->H0(Landroid/webkit/PermissionRequest;)V

    .line 99
    .line 100
    .line 101
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_1
    iget-boolean v1, v0, La/lf2;->b:Z

    .line 105
    .line 106
    iget-object v2, v0, La/lf2;->c:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, La/r790;

    .line 109
    .line 110
    iget-object v0, v0, La/lf2;->d:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Landroid/webkit/PermissionRequest;

    .line 113
    .line 114
    sget-object v3, La/r790;->Z1:La/xi70;

    .line 115
    .line 116
    if-eqz v1, :cond_2

    .line 117
    .line 118
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 123
    .line 124
    invoke-static {v1}, La/hne;->j(Ljava/lang/String;)Landroid/content/Intent;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const-string v2, "package"

    .line 129
    .line 130
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-static {v2, v3, v6}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v1, v4}, La/agd;->startActivityForResult(Landroid/content/Intent;I)V

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_2
    iget-object v1, v2, La/r790;->R1:La/a8z;

    .line 146
    .line 147
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, La/qog0;

    .line 152
    .line 153
    if-eqz v1, :cond_3

    .line 154
    .line 155
    new-instance v3, La/p790;

    .line 156
    .line 157
    invoke-direct {v3, v1, v0, v2, v5}, La/p790;-><init>(La/qog0;Landroid/webkit/PermissionRequest;La/yx5;B)V

    .line 158
    .line 159
    .line 160
    iget-object v0, v1, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 161
    .line 162
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, La/qog0;->a()V

    .line 166
    .line 167
    .line 168
    :cond_3
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object v0

    .line 171
    :pswitch_2
    iget-object v1, v0, La/lf2;->c:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 174
    .line 175
    iget-boolean v2, v0, La/lf2;->b:Z

    .line 176
    .line 177
    iget-object v0, v0, La/lf2;->d:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, La/l7m0;

    .line 180
    .line 181
    if-eqz v2, :cond_4

    .line 182
    .line 183
    sget-object v0, La/mq70;->a:La/mq70;

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_4
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, La/iu70;

    .line 191
    .line 192
    iget-boolean v0, v0, La/iu70;->g:Z

    .line 193
    .line 194
    if-nez v0, :cond_5

    .line 195
    .line 196
    sget-object v0, La/eq70;->a:La/eq70;

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_5
    sget-object v0, La/oq70;->a:La/oq70;

    .line 200
    .line 201
    :goto_4
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_3
    iget-object v1, v0, La/lf2;->c:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v1, La/cc70;

    .line 210
    .line 211
    iget-object v2, v0, La/lf2;->d:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v2, Landroid/app/Activity;

    .line 214
    .line 215
    iget-boolean v0, v0, La/lf2;->b:Z

    .line 216
    .line 217
    iget-wide v4, v1, La/cc70;->a:J

    .line 218
    .line 219
    invoke-static {v4, v5}, La/fbc;->U(J)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    iget-wide v7, v1, La/cc70;->a:J

    .line 224
    .line 225
    invoke-static {v7, v8}, La/fbc;->U(J)I

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    new-instance v5, La/jno;

    .line 230
    .line 231
    invoke-direct {v5, v3, v0}, La/jno;-><init>(BZ)V

    .line 232
    .line 233
    .line 234
    new-instance v0, La/c9o0;

    .line 235
    .line 236
    invoke-direct {v0, v4, v1, v5}, La/c9o0;-><init>(IILkotlin/jvm/functions/Function1;)V

    .line 237
    .line 238
    .line 239
    instance-of v1, v2, La/agd;

    .line 240
    .line 241
    if-eqz v1, :cond_6

    .line 242
    .line 243
    move-object v6, v2

    .line 244
    check-cast v6, La/agd;

    .line 245
    .line 246
    :cond_6
    if-eqz v6, :cond_7

    .line 247
    .line 248
    invoke-static {v6, v0, v0}, La/mjn;->a(La/agd;La/c9o0;La/c9o0;)V

    .line 249
    .line 250
    .line 251
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object v0

    .line 254
    :pswitch_4
    iget-object v1, v0, La/lf2;->c:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v1, La/egk0;

    .line 257
    .line 258
    iget-boolean v2, v0, La/lf2;->b:Z

    .line 259
    .line 260
    iget-object v0, v0, La/lf2;->d:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v0, La/l7m0;

    .line 263
    .line 264
    invoke-virtual {v1}, La/egk0;->l()J

    .line 265
    .line 266
    .line 267
    move-result-wide v3

    .line 268
    const-wide/32 v5, 0xea60

    .line 269
    .line 270
    .line 271
    div-long/2addr v3, v5

    .line 272
    if-eqz v2, :cond_8

    .line 273
    .line 274
    const-wide/16 v1, 0x3c

    .line 275
    .line 276
    rem-long/2addr v3, v1

    .line 277
    :cond_8
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    check-cast v0, Ljava/lang/Boolean;

    .line 282
    .line 283
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-eqz v0, :cond_9

    .line 288
    .line 289
    const-wide/16 v0, 0x3e7

    .line 290
    .line 291
    cmp-long v2, v3, v0

    .line 292
    .line 293
    if-lez v2, :cond_a

    .line 294
    .line 295
    :goto_5
    move-wide v3, v0

    .line 296
    goto :goto_6

    .line 297
    :cond_9
    const-wide/16 v0, 0x63

    .line 298
    .line 299
    cmp-long v2, v3, v0

    .line 300
    .line 301
    if-lez v2, :cond_a

    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_a
    :goto_6
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    return-object v0

    .line 309
    :pswitch_5
    iget-boolean v1, v0, La/lf2;->b:Z

    .line 310
    .line 311
    iget-object v2, v0, La/lf2;->c:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v2, La/kd30;

    .line 314
    .line 315
    iget-object v0, v0, La/lf2;->d:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v0, Ljava/lang/String;

    .line 318
    .line 319
    if-eqz v1, :cond_b

    .line 320
    .line 321
    iget-object v1, v2, La/kd30;->a:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v1, La/h0h0;

    .line 324
    .line 325
    iget-object v2, v1, La/h0h0;->c:La/y2m0;

    .line 326
    .line 327
    monitor-enter v2

    .line 328
    :try_start_0
    iget-object v1, v1, La/h0h0;->d:La/hz40;

    .line 329
    .line 330
    invoke-virtual {v1, v0}, La/hz40;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    check-cast v0, La/g0h0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 335
    .line 336
    monitor-exit v2

    .line 337
    goto :goto_7

    .line 338
    :catchall_0
    move-exception v0

    .line 339
    monitor-exit v2

    .line 340
    throw v0

    .line 341
    :cond_b
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    return-object v0

    .line 344
    :pswitch_6
    iget-boolean v1, v0, La/lf2;->b:Z

    .line 345
    .line 346
    iget-object v2, v0, La/lf2;->c:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v2, La/ulq0;

    .line 349
    .line 350
    iget-object v0, v0, La/lf2;->d:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, La/pz40;

    .line 353
    .line 354
    if-eqz v1, :cond_d

    .line 355
    .line 356
    sget-object v1, La/ulq0;->b:La/ulq0;

    .line 357
    .line 358
    if-ne v2, v1, :cond_c

    .line 359
    .line 360
    goto :goto_8

    .line 361
    :cond_c
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    check-cast v0, La/ifj;

    .line 366
    .line 367
    goto :goto_9

    .line 368
    :cond_d
    :goto_8
    sget-object v0, La/ifj;->a:La/ifj;

    .line 369
    .line 370
    :goto_9
    return-object v0

    .line 371
    :pswitch_7
    iget-object v1, v0, La/lf2;->c:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 374
    .line 375
    iget-object v2, v0, La/lf2;->d:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v2, La/grh;

    .line 378
    .line 379
    iget-boolean v0, v0, La/lf2;->b:Z

    .line 380
    .line 381
    new-instance v3, La/wdm;

    .line 382
    .line 383
    invoke-interface {v2}, La/grh;->a()J

    .line 384
    .line 385
    .line 386
    move-result-wide v4

    .line 387
    invoke-direct {v3, v0, v4, v5}, La/wdm;-><init>(ZJ)V

    .line 388
    .line 389
    .line 390
    invoke-interface {v1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 394
    .line 395
    return-object v0

    .line 396
    :pswitch_8
    iget-object v1, v0, La/lf2;->c:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v1, La/qss;

    .line 399
    .line 400
    iget-boolean v2, v0, La/lf2;->b:Z

    .line 401
    .line 402
    iget-object v0, v0, La/lf2;->d:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v0, La/l7m0;

    .line 405
    .line 406
    check-cast v1, La/pss;

    .line 407
    .line 408
    iget-object v1, v1, La/pss;->a:La/l7m0;

    .line 409
    .line 410
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    check-cast v1, La/a4x;

    .line 415
    .line 416
    invoke-static {v0}, La/mrv;->y(La/l7m0;)Z

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    if-nez v0, :cond_11

    .line 421
    .line 422
    invoke-static {v1, v2}, La/p7x;->D(La/a4x;Z)Z

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    if-eqz v0, :cond_e

    .line 427
    .line 428
    goto :goto_b

    .line 429
    :cond_e
    new-instance v0, Ljava/util/ArrayList;

    .line 430
    .line 431
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 432
    .line 433
    .line 434
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    :cond_f
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 439
    .line 440
    .line 441
    move-result v2

    .line 442
    if-eqz v2, :cond_10

    .line 443
    .line 444
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    move-object v3, v2

    .line 449
    check-cast v3, La/p6t0;

    .line 450
    .line 451
    instance-of v3, v3, La/kxs;

    .line 452
    .line 453
    if-nez v3, :cond_f

    .line 454
    .line 455
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    goto :goto_a

    .line 459
    :cond_10
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    :cond_11
    :goto_b
    return-object v1

    .line 464
    :pswitch_9
    iget-object v1, v0, La/lf2;->c:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v1, La/z1e;

    .line 467
    .line 468
    iget-boolean v2, v0, La/lf2;->b:Z

    .line 469
    .line 470
    iget-object v0, v0, La/lf2;->d:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    .line 473
    .line 474
    if-eqz v2, :cond_12

    .line 475
    .line 476
    const-string v2, "reader"

    .line 477
    .line 478
    goto :goto_c

    .line 479
    :cond_12
    const-string v2, "writer"

    .line 480
    .line 481
    :goto_c
    new-instance v3, Ljava/lang/StringBuilder;

    .line 482
    .line 483
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 484
    .line 485
    .line 486
    new-instance v4, Ljava/lang/StringBuilder;

    .line 487
    .line 488
    const-string v5, "Timed out attempting to acquire a "

    .line 489
    .line 490
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    const-string v2, " connection."

    .line 497
    .line 498
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    const-string v2, "\n\n"

    .line 509
    .line 510
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    .line 513
    new-instance v2, Ljava/lang/StringBuilder;

    .line 514
    .line 515
    const-string v4, "Request coroutine: "

    .line 516
    .line 517
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    const-string v0, "\n\nWriter pool:\n"

    .line 531
    .line 532
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    iget-object v0, v1, La/z1e;->b:La/gva0;

    .line 536
    .line 537
    invoke-virtual {v0, v3}, La/gva0;->d(Ljava/lang/StringBuilder;)V

    .line 538
    .line 539
    .line 540
    const-string v0, "Reader pool:"

    .line 541
    .line 542
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    const/16 v0, 0xa

    .line 546
    .line 547
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    iget-object v0, v1, La/z1e;->a:La/gva0;

    .line 551
    .line 552
    invoke-virtual {v0, v3}, La/gva0;->d(Ljava/lang/StringBuilder;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    const/4 v1, 0x5

    .line 560
    :try_start_1
    invoke-static {v1, v0}, La/m2x;->J(ILjava/lang/String;)V

    .line 561
    .line 562
    .line 563
    throw v6
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0

    .line 564
    :catch_0
    move-exception v0

    .line 565
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 566
    .line 567
    .line 568
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 569
    .line 570
    return-object v0

    .line 571
    :pswitch_a
    iget-object v1, v0, La/lf2;->c:Ljava/lang/Object;

    .line 572
    .line 573
    check-cast v1, Landroid/view/Window;

    .line 574
    .line 575
    iget-boolean v3, v0, La/lf2;->b:Z

    .line 576
    .line 577
    iget-object v0, v0, La/lf2;->d:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast v0, La/l7m0;

    .line 580
    .line 581
    if-eqz v1, :cond_17

    .line 582
    .line 583
    if-nez v3, :cond_13

    .line 584
    .line 585
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    check-cast v0, Ljava/lang/Number;

    .line 590
    .line 591
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    const/high16 v3, 0x3f000000    # 0.5f

    .line 596
    .line 597
    cmpl-float v0, v0, v3

    .line 598
    .line 599
    if-lez v0, :cond_13

    .line 600
    .line 601
    goto :goto_d

    .line 602
    :cond_13
    move v2, v5

    .line 603
    :goto_d
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    new-instance v3, La/ani0;

    .line 608
    .line 609
    invoke-direct {v3, v0}, La/ani0;-><init>(Landroid/view/View;)V

    .line 610
    .line 611
    .line 612
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 613
    .line 614
    const/16 v4, 0x23

    .line 615
    .line 616
    if-lt v0, v4, :cond_14

    .line 617
    .line 618
    new-instance v0, La/bjv0;

    .line 619
    .line 620
    invoke-direct {v0, v1, v3}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 621
    .line 622
    .line 623
    goto :goto_e

    .line 624
    :cond_14
    const/16 v4, 0x1e

    .line 625
    .line 626
    if-lt v0, v4, :cond_15

    .line 627
    .line 628
    new-instance v0, La/ajv0;

    .line 629
    .line 630
    invoke-direct {v0, v1, v3}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 631
    .line 632
    .line 633
    goto :goto_e

    .line 634
    :cond_15
    const/16 v4, 0x1a

    .line 635
    .line 636
    if-lt v0, v4, :cond_16

    .line 637
    .line 638
    new-instance v0, La/ziv0;

    .line 639
    .line 640
    invoke-direct {v0, v1, v3}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 641
    .line 642
    .line 643
    goto :goto_e

    .line 644
    :cond_16
    new-instance v0, La/yiv0;

    .line 645
    .line 646
    invoke-direct {v0, v1, v3}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 647
    .line 648
    .line 649
    :goto_e
    invoke-virtual {v0, v2}, La/ycm0;->w(Z)V

    .line 650
    .line 651
    .line 652
    :cond_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 653
    .line 654
    return-object v0

    .line 655
    :pswitch_b
    iget-object v1, v0, La/lf2;->c:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v1, La/jf2;

    .line 658
    .line 659
    iget-boolean v4, v0, La/lf2;->b:Z

    .line 660
    .line 661
    iget-object v0, v0, La/lf2;->d:Ljava/lang/Object;

    .line 662
    .line 663
    check-cast v0, La/ctf0;

    .line 664
    .line 665
    iget-object v7, v1, La/jf2;->a:La/b9g0;

    .line 666
    .line 667
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 668
    .line 669
    .line 670
    move-result v7

    .line 671
    const/16 v8, 0x3c

    .line 672
    .line 673
    const v9, 0x7f13118d

    .line 674
    .line 675
    .line 676
    if-eqz v7, :cond_1a

    .line 677
    .line 678
    if-eq v7, v2, :cond_19

    .line 679
    .line 680
    if-ne v7, v3, :cond_18

    .line 681
    .line 682
    new-array v1, v5, [Ljava/lang/Object;

    .line 683
    .line 684
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 685
    .line 686
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    const v2, 0x7f1311c0

    .line 691
    .line 692
    .line 693
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    move-result-object v6

    .line 697
    goto :goto_f

    .line 698
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 699
    .line 700
    .line 701
    goto :goto_f

    .line 702
    :cond_19
    sget-object v1, La/rdj;->a:La/rdj;

    .line 703
    .line 704
    new-instance v3, Ljava/util/Date;

    .line 705
    .line 706
    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    .line 707
    .line 708
    .line 709
    sget-object v4, La/sdj;->b:La/sdj;

    .line 710
    .line 711
    invoke-static {v1, v4, v3, v6, v8}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 720
    .line 721
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    invoke-virtual {v0, v9, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v6

    .line 729
    goto :goto_f

    .line 730
    :cond_1a
    iget-object v1, v1, La/jf2;->h:Ljava/util/Calendar;

    .line 731
    .line 732
    if-eqz v1, :cond_1b

    .line 733
    .line 734
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    if-nez v1, :cond_1c

    .line 739
    .line 740
    :cond_1b
    new-instance v1, Ljava/util/Date;

    .line 741
    .line 742
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 743
    .line 744
    .line 745
    :cond_1c
    if-eqz v4, :cond_1d

    .line 746
    .line 747
    new-array v1, v5, [Ljava/lang/Object;

    .line 748
    .line 749
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 750
    .line 751
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    const v2, 0x7f1308f0

    .line 756
    .line 757
    .line 758
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v6

    .line 762
    goto :goto_f

    .line 763
    :cond_1d
    sget-object v3, La/rdj;->a:La/rdj;

    .line 764
    .line 765
    sget-object v4, La/sdj;->b:La/sdj;

    .line 766
    .line 767
    invoke-static {v3, v4, v1, v6, v8}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v1

    .line 775
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 776
    .line 777
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v1

    .line 781
    invoke-virtual {v0, v9, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v6

    .line 785
    :goto_f
    return-object v6

    .line 786
    nop

    .line 787
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
.end method
