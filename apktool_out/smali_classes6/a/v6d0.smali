.class public final synthetic La/v6d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/v6d0;->a:B

    iput-object p1, p0, La/v6d0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/v6d0;->a:B

    .line 6
    .line 7
    const v3, 0x7f13032f

    .line 8
    .line 9
    .line 10
    const v4, 0x7f1304e8

    .line 11
    .line 12
    .line 13
    const v5, 0x7f1304e7

    .line 14
    .line 15
    .line 16
    const v6, 0x7f1304e4

    .line 17
    .line 18
    .line 19
    const/16 v7, 0x1a

    .line 20
    .line 21
    const/16 v8, 0xa

    .line 22
    .line 23
    const/16 v9, 0x18

    .line 24
    .line 25
    const/16 v10, 0xb

    .line 26
    .line 27
    const v11, 0x2fd4df92

    .line 28
    .line 29
    .line 30
    const/4 v12, 0x0

    .line 31
    const/4 v13, 0x0

    .line 32
    const/4 v14, 0x1

    .line 33
    packed-switch v2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, La/ame0;

    .line 39
    .line 40
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getAdapter()La/k5;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    instance-of v3, v2, La/zle0;

    .line 50
    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    move-object v12, v2

    .line 54
    check-cast v12, La/zle0;

    .line 55
    .line 56
    :cond_0
    if-eqz v12, :cond_1

    .line 57
    .line 58
    iget-object v2, v0, La/ame0;->c:Ljava/util/ArrayList;

    .line 59
    .line 60
    iget-object v3, v0, La/ame0;->b:Ljava/util/ArrayList;

    .line 61
    .line 62
    iget-object v4, v0, La/ame0;->a:Ljava/util/List;

    .line 63
    .line 64
    iget-object v0, v0, La/ame0;->d:La/vke0;

    .line 65
    .line 66
    invoke-virtual {v12, v2, v3, v4, v0}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-virtual {v1, v13, v14}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->b(ZZ)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getColumnHeaderRecyclerView()La/y9b;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getRowHeaderRecyclerView()La/y9b;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getCellRecyclerView()La/y9b;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 91
    .line 92
    .line 93
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_0
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, La/qke0;

    .line 99
    .line 100
    check-cast v1, Ljava/lang/Throwable;

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-object v2, v0, La/qke0;->r:La/duj;

    .line 106
    .line 107
    new-instance v3, La/dke0;

    .line 108
    .line 109
    invoke-direct {v3, v0, v14}, La/dke0;-><init>(Ljava/lang/Object;B)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 113
    .line 114
    .line 115
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_1
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, La/kke0;

    .line 121
    .line 122
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getAdapter()La/k5;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    instance-of v3, v2, La/jke0;

    .line 132
    .line 133
    if-eqz v3, :cond_2

    .line 134
    .line 135
    move-object v12, v2

    .line 136
    check-cast v12, La/jke0;

    .line 137
    .line 138
    :cond_2
    if-eqz v12, :cond_3

    .line 139
    .line 140
    iget-object v2, v0, La/kke0;->b:La/a4x;

    .line 141
    .line 142
    iget-object v3, v0, La/kke0;->c:La/a4x;

    .line 143
    .line 144
    iget-object v4, v0, La/kke0;->a:La/a4x;

    .line 145
    .line 146
    iget-object v0, v0, La/kke0;->d:La/ake0;

    .line 147
    .line 148
    invoke-virtual {v12, v2, v3, v4, v0}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 149
    .line 150
    .line 151
    :cond_3
    invoke-virtual {v1, v13, v14}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->b(ZZ)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getColumnHeaderRecyclerView()La/y9b;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getRowHeaderRecyclerView()La/y9b;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getCellRecyclerView()La/y9b;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 173
    .line 174
    .line 175
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object v0

    .line 178
    :pswitch_2
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, La/kje0;

    .line 181
    .line 182
    check-cast v1, Ljava/lang/Throwable;

    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    iget-object v2, v0, La/kje0;->o:La/duj;

    .line 188
    .line 189
    new-instance v3, La/nrc0;

    .line 190
    .line 191
    const/16 v4, 0x1d

    .line 192
    .line 193
    invoke-direct {v3, v0, v4}, La/nrc0;-><init>(Ljava/lang/Object;B)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 197
    .line 198
    .line 199
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object v0

    .line 202
    :pswitch_3
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, La/fje0;

    .line 205
    .line 206
    check-cast v1, La/hcz;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    iget-object v2, v0, La/fje0;->a:La/a4x;

    .line 212
    .line 213
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    new-instance v4, La/d1c0;

    .line 218
    .line 219
    invoke-direct {v4, v2, v10}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 220
    .line 221
    .line 222
    new-instance v5, La/xe4;

    .line 223
    .line 224
    const/16 v6, 0xf

    .line 225
    .line 226
    invoke-direct {v5, v2, v0, v6}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 227
    .line 228
    .line 229
    new-instance v0, La/ugd;

    .line 230
    .line 231
    invoke-direct {v0, v11, v14, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v3, v12, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 235
    .line 236
    .line 237
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object v0

    .line 240
    :pswitch_4
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, La/hge0;

    .line 243
    .line 244
    check-cast v1, La/vjn;

    .line 245
    .line 246
    invoke-virtual {v0, v1}, La/hge0;->a(La/vjn;)V

    .line 247
    .line 248
    .line 249
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object v0

    .line 252
    :pswitch_5
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, La/fge0;

    .line 255
    .line 256
    check-cast v1, Ljava/lang/Throwable;

    .line 257
    .line 258
    const-string v2, "Recomposer effect job completed"

    .line 259
    .line 260
    invoke-static {v2, v1}, La/plc;->b(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    iget-object v3, v0, La/fge0;->c:Ljava/lang/Object;

    .line 265
    .line 266
    monitor-enter v3

    .line 267
    :try_start_0
    iget-object v4, v0, La/fge0;->d:La/bby;

    .line 268
    .line 269
    if-eqz v4, :cond_4

    .line 270
    .line 271
    iget-object v5, v0, La/fge0;->u:La/p7m0;

    .line 272
    .line 273
    sget-object v6, La/dge0;->b:La/dge0;

    .line 274
    .line 275
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v5, v12, v6}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    invoke-interface {v4, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 282
    .line 283
    .line 284
    iput-object v12, v0, La/fge0;->r:La/n5a;

    .line 285
    .line 286
    new-instance v2, La/oac0;

    .line 287
    .line 288
    invoke-direct {v2, v0, v1, v9}, La/oac0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 289
    .line 290
    .line 291
    invoke-interface {v4, v2}, La/bby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 292
    .line 293
    .line 294
    goto :goto_0

    .line 295
    :catchall_0
    move-exception v0

    .line 296
    goto :goto_1

    .line 297
    :cond_4
    iput-object v2, v0, La/fge0;->e:Ljava/lang/Throwable;

    .line 298
    .line 299
    iget-object v0, v0, La/fge0;->u:La/p7m0;

    .line 300
    .line 301
    sget-object v1, La/dge0;->a:La/dge0;

    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v12, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 307
    .line 308
    .line 309
    :goto_0
    monitor-exit v3

    .line 310
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    return-object v0

    .line 313
    :goto_1
    monitor-exit v3

    .line 314
    throw v0

    .line 315
    :pswitch_6
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v0, La/tld;

    .line 318
    .line 319
    invoke-virtual {v0, v1}, La/tld;->f(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    return-object v0

    .line 325
    :pswitch_7
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, La/c69;

    .line 328
    .line 329
    iget-object v2, v0, La/c69;->i:La/n0o0;

    .line 330
    .line 331
    check-cast v1, Ljava/lang/Boolean;

    .line 332
    .line 333
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    const-string v3, ""

    .line 338
    .line 339
    if-eqz v1, :cond_c

    .line 340
    .line 341
    iget-object v1, v0, La/c69;->g:La/n0o0;

    .line 342
    .line 343
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    check-cast v1, La/fee;

    .line 348
    .line 349
    iget-object v0, v0, La/c69;->n:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v0, La/ctf0;

    .line 352
    .line 353
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    check-cast v1, La/ql5;

    .line 358
    .line 359
    if-eqz v1, :cond_7

    .line 360
    .line 361
    iget-object v4, v1, La/ql5;->j:Ljava/lang/String;

    .line 362
    .line 363
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    check-cast v5, La/fee;

    .line 368
    .line 369
    invoke-virtual {v5}, La/fee;->c()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    check-cast v5, La/kg;

    .line 374
    .line 375
    sget-object v6, La/kg;->c:La/kg;

    .line 376
    .line 377
    if-ne v5, v6, :cond_5

    .line 378
    .line 379
    new-array v4, v13, [Ljava/lang/Object;

    .line 380
    .line 381
    iget-object v5, v0, La/ctf0;->b:La/lsm0;

    .line 382
    .line 383
    invoke-static {v4, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    const v6, 0x7f1300e5

    .line 388
    .line 389
    .line 390
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    goto :goto_2

    .line 395
    :cond_5
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 396
    .line 397
    .line 398
    move-result v5

    .line 399
    if-lez v5, :cond_6

    .line 400
    .line 401
    goto :goto_2

    .line 402
    :cond_6
    iget-object v4, v1, La/ql5;->k:Ljava/lang/String;

    .line 403
    .line 404
    :goto_2
    move-object v9, v4

    .line 405
    goto :goto_3

    .line 406
    :cond_7
    move-object v9, v3

    .line 407
    :goto_3
    if-eqz v1, :cond_8

    .line 408
    .line 409
    iget-wide v4, v1, La/ql5;->b:D

    .line 410
    .line 411
    sget-object v6, La/pn40;->a:La/pn40;

    .line 412
    .line 413
    sget-object v6, La/p3u0;->c:La/p3u0;

    .line 414
    .line 415
    invoke-static {v4, v5, v6}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    goto :goto_4

    .line 420
    :cond_8
    move-object v4, v12

    .line 421
    :goto_4
    if-nez v4, :cond_9

    .line 422
    .line 423
    move-object v6, v3

    .line 424
    goto :goto_5

    .line 425
    :cond_9
    move-object v6, v4

    .line 426
    :goto_5
    if-eqz v1, :cond_a

    .line 427
    .line 428
    iget-object v12, v1, La/ql5;->f:Ljava/lang/String;

    .line 429
    .line 430
    :cond_a
    if-nez v12, :cond_b

    .line 431
    .line 432
    move-object v7, v3

    .line 433
    goto :goto_6

    .line 434
    :cond_b
    move-object v7, v12

    .line 435
    :goto_6
    new-array v1, v13, [Ljava/lang/Object;

    .line 436
    .line 437
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 438
    .line 439
    invoke-static {v1, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    const v3, 0x7f1315e0

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v8

    .line 450
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 451
    .line 452
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 457
    .line 458
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 459
    .line 460
    .line 461
    move-result-wide v0

    .line 462
    new-instance v10, La/y3d;

    .line 463
    .line 464
    invoke-direct {v10, v0, v1}, La/y3d;-><init>(J)V

    .line 465
    .line 466
    .line 467
    new-instance v5, La/jjl;

    .line 468
    .line 469
    invoke-direct/range {v5 .. v10}, La/jjl;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/y3d;)V

    .line 470
    .line 471
    .line 472
    new-instance v0, La/qee0;

    .line 473
    .line 474
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    check-cast v1, La/fee;

    .line 479
    .line 480
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    check-cast v1, La/ijl;

    .line 485
    .line 486
    invoke-direct {v0, v1, v5}, La/qee0;-><init>(La/ijl;La/jjl;)V

    .line 487
    .line 488
    .line 489
    goto :goto_7

    .line 490
    :cond_c
    sget-object v0, La/ree0;->a:La/ree0;

    .line 491
    .line 492
    :goto_7
    return-object v0

    .line 493
    :pswitch_8
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v0, La/xbe0;

    .line 496
    .line 497
    check-cast v1, Landroid/view/View;

    .line 498
    .line 499
    sget-object v2, La/xbe0;->Q1:[La/iiy;

    .line 500
    .line 501
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    iget-object v1, v0, La/xbe0;->L1:La/ii;

    .line 505
    .line 506
    if-eqz v1, :cond_d

    .line 507
    .line 508
    new-instance v14, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 509
    .line 510
    const v2, 0x7f1303fb

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v15

    .line 517
    new-instance v2, Landroid/text/SpannableString;

    .line 518
    .line 519
    const v3, 0x7f1315b1

    .line 520
    .line 521
    .line 522
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-static {v3, v13}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    invoke-direct {v2, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 537
    .line 538
    .line 539
    const v3, 0x7f131843

    .line 540
    .line 541
    .line 542
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v17

    .line 546
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    const v3, 0x7f130e07

    .line 550
    .line 551
    .line 552
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v18

    .line 556
    const-string v20, "SET_LIMIT_REQUEST_KEY"

    .line 557
    .line 558
    sget-object v23, La/n12;->a:La/n12;

    .line 559
    .line 560
    const/16 v24, 0x0

    .line 561
    .line 562
    const/16 v25, 0x5d0

    .line 563
    .line 564
    const/16 v19, 0x0

    .line 565
    .line 566
    const/16 v21, 0x0

    .line 567
    .line 568
    const/16 v22, 0x0

    .line 569
    .line 570
    move-object/from16 v16, v2

    .line 571
    .line 572
    invoke-direct/range {v14 .. v25}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v1, v14, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 583
    .line 584
    .line 585
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 586
    .line 587
    return-object v0

    .line 588
    :cond_d
    const-string v0, "actionDialogManager"

    .line 589
    .line 590
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    throw v12

    .line 594
    :pswitch_9
    const-string v2, "ufcStatistic/v1/image/"

    .line 595
    .line 596
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v0, La/lea0;

    .line 599
    .line 600
    check-cast v1, Ljava/util/List;

    .line 601
    .line 602
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    iget-object v0, v0, La/lea0;->c:La/ctf0;

    .line 606
    .line 607
    const-string v3, "/"

    .line 608
    .line 609
    const-string v4, "https://"

    .line 610
    .line 611
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    new-instance v5, Ljava/util/ArrayList;

    .line 615
    .line 616
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 617
    .line 618
    .line 619
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    :cond_e
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 624
    .line 625
    .line 626
    move-result v6

    .line 627
    if-eqz v6, :cond_f

    .line 628
    .line 629
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v6

    .line 633
    move-object v7, v6

    .line 634
    check-cast v7, La/wlc;

    .line 635
    .line 636
    iget-object v9, v7, La/wlc;->a:La/f7v0;

    .line 637
    .line 638
    sget-object v10, La/f7v0;->a:La/f7v0;

    .line 639
    .line 640
    if-eq v9, v10, :cond_e

    .line 641
    .line 642
    iget-object v7, v7, La/wlc;->c:La/fwp;

    .line 643
    .line 644
    iget-object v7, v7, La/fwp;->c:Ljava/lang/String;

    .line 645
    .line 646
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 647
    .line 648
    .line 649
    move-result v7

    .line 650
    if-lez v7, :cond_e

    .line 651
    .line 652
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    goto :goto_8

    .line 656
    :cond_f
    new-instance v1, Ljava/util/ArrayList;

    .line 657
    .line 658
    invoke-static {v5, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 659
    .line 660
    .line 661
    move-result v6

    .line 662
    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 666
    .line 667
    .line 668
    move-result-object v5

    .line 669
    move v6, v13

    .line 670
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 671
    .line 672
    .line 673
    move-result v7

    .line 674
    if-eqz v7, :cond_1a

    .line 675
    .line 676
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v7

    .line 680
    add-int/lit8 v9, v6, 0x1

    .line 681
    .line 682
    if-ltz v6, :cond_19

    .line 683
    .line 684
    check-cast v7, La/wlc;

    .line 685
    .line 686
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v6

    .line 690
    new-instance v10, La/n0x;

    .line 691
    .line 692
    new-instance v11, Ljava/lang/StringBuilder;

    .line 693
    .line 694
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 695
    .line 696
    invoke-direct {v11, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    iget-object v15, v7, La/wlc;->c:La/fwp;

    .line 700
    .line 701
    move-object/from16 v24, v12

    .line 702
    .line 703
    iget-object v12, v7, La/wlc;->a:La/f7v0;

    .line 704
    .line 705
    iget-object v15, v15, La/fwp;->g:Ljava/lang/String;

    .line 706
    .line 707
    invoke-virtual {v2, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    move-result-object v15

    .line 711
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 712
    .line 713
    .line 714
    move-result v16

    .line 715
    const/16 v8, 0x2f

    .line 716
    .line 717
    if-nez v16, :cond_10

    .line 718
    .line 719
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 720
    .line 721
    .line 722
    move/from16 p0, v8

    .line 723
    .line 724
    goto :goto_b

    .line 725
    :cond_10
    sget-object v14, La/ujn;->h:Ljava/lang/String;

    .line 726
    .line 727
    invoke-static {v15, v14, v13}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 728
    .line 729
    .line 730
    move-result v14

    .line 731
    if-nez v14, :cond_11

    .line 732
    .line 733
    invoke-static {v15, v4, v13}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 734
    .line 735
    .line 736
    move-result v14

    .line 737
    if-eqz v14, :cond_12

    .line 738
    .line 739
    :cond_11
    move/from16 p0, v8

    .line 740
    .line 741
    goto :goto_a

    .line 742
    :cond_12
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    .line 743
    .line 744
    .line 745
    move-result v14

    .line 746
    if-lez v14, :cond_13

    .line 747
    .line 748
    invoke-static {v11, v3}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 749
    .line 750
    .line 751
    move-result v14

    .line 752
    if-nez v14, :cond_13

    .line 753
    .line 754
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 755
    .line 756
    .line 757
    :cond_13
    move/from16 p0, v8

    .line 758
    .line 759
    const/4 v14, 0x1

    .line 760
    new-array v8, v14, [C

    .line 761
    .line 762
    aput-char p0, v8, v13

    .line 763
    .line 764
    invoke-static {v15, v8}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v8

    .line 768
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 769
    .line 770
    .line 771
    goto :goto_b

    .line 772
    :goto_a
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 776
    .line 777
    .line 778
    :goto_b
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v8

    .line 782
    invoke-direct {v10, v8}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    invoke-static {v12, v0}, La/tnq0;->r(La/f7v0;La/ctf0;)Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v19

    .line 789
    iget-object v8, v7, La/wlc;->c:La/fwp;

    .line 790
    .line 791
    iget-object v8, v8, La/fwp;->c:Ljava/lang/String;

    .line 792
    .line 793
    new-array v11, v13, [Ljava/lang/Object;

    .line 794
    .line 795
    iget-object v14, v0, La/ctf0;->b:La/lsm0;

    .line 796
    .line 797
    invoke-static {v11, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v11

    .line 801
    const v15, 0x7f130400

    .line 802
    .line 803
    .line 804
    invoke-virtual {v14, v15, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v21

    .line 808
    iget-object v7, v7, La/wlc;->d:Ljava/util/List;

    .line 809
    .line 810
    new-instance v11, Ljava/util/ArrayList;

    .line 811
    .line 812
    const/16 v14, 0xa

    .line 813
    .line 814
    invoke-static {v7, v14}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 815
    .line 816
    .line 817
    move-result v15

    .line 818
    invoke-direct {v11, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 819
    .line 820
    .line 821
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 822
    .line 823
    .line 824
    move-result-object v7

    .line 825
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 826
    .line 827
    .line 828
    move-result v14

    .line 829
    if-eqz v14, :cond_18

    .line 830
    .line 831
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v14

    .line 835
    check-cast v14, La/fwp;

    .line 836
    .line 837
    new-instance v15, La/n0x;

    .line 838
    .line 839
    new-instance v13, Ljava/lang/StringBuilder;

    .line 840
    .line 841
    move-object/from16 p1, v0

    .line 842
    .line 843
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 844
    .line 845
    invoke-direct {v13, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 846
    .line 847
    .line 848
    iget-object v0, v14, La/fwp;->g:Ljava/lang/String;

    .line 849
    .line 850
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 855
    .line 856
    .line 857
    move-result v14

    .line 858
    if-nez v14, :cond_14

    .line 859
    .line 860
    const/4 v14, 0x0

    .line 861
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 862
    .line 863
    .line 864
    move-object/from16 v27, v2

    .line 865
    .line 866
    goto :goto_e

    .line 867
    :cond_14
    move-object/from16 v27, v2

    .line 868
    .line 869
    const/4 v14, 0x0

    .line 870
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 871
    .line 872
    invoke-static {v0, v2, v14}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 873
    .line 874
    .line 875
    move-result v2

    .line 876
    if-nez v2, :cond_17

    .line 877
    .line 878
    invoke-static {v0, v4, v14}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 879
    .line 880
    .line 881
    move-result v2

    .line 882
    if-eqz v2, :cond_15

    .line 883
    .line 884
    const/4 v14, 0x0

    .line 885
    goto :goto_d

    .line 886
    :cond_15
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 887
    .line 888
    .line 889
    move-result v2

    .line 890
    if-lez v2, :cond_16

    .line 891
    .line 892
    invoke-static {v13, v3}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 893
    .line 894
    .line 895
    move-result v2

    .line 896
    if-nez v2, :cond_16

    .line 897
    .line 898
    move/from16 v2, p0

    .line 899
    .line 900
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 901
    .line 902
    .line 903
    :cond_16
    const/4 v14, 0x1

    .line 904
    new-array v2, v14, [C

    .line 905
    .line 906
    const/4 v14, 0x0

    .line 907
    aput-char p0, v2, v14

    .line 908
    .line 909
    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 914
    .line 915
    .line 916
    goto :goto_e

    .line 917
    :cond_17
    :goto_d
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 918
    .line 919
    .line 920
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 921
    .line 922
    .line 923
    :goto_e
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    invoke-direct {v15, v0}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 931
    .line 932
    .line 933
    move-object/from16 v0, p1

    .line 934
    .line 935
    move-object/from16 v2, v27

    .line 936
    .line 937
    const/4 v13, 0x0

    .line 938
    goto :goto_c

    .line 939
    :cond_18
    move-object/from16 p1, v0

    .line 940
    .line 941
    move-object/from16 v27, v2

    .line 942
    .line 943
    invoke-static {v11}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 944
    .line 945
    .line 946
    move-result-object v22

    .line 947
    new-instance v15, La/eoh;

    .line 948
    .line 949
    const-wide/16 v16, 0x0

    .line 950
    .line 951
    move-object/from16 v20, v8

    .line 952
    .line 953
    move-object/from16 v18, v10

    .line 954
    .line 955
    move-object/from16 v23, v12

    .line 956
    .line 957
    invoke-direct/range {v15 .. v23}, La/eoh;-><init>(JLa/n0x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;La/f7v0;)V

    .line 958
    .line 959
    .line 960
    new-instance v0, La/goh;

    .line 961
    .line 962
    invoke-direct {v0, v15}, La/goh;-><init>(La/foh;)V

    .line 963
    .line 964
    .line 965
    new-instance v2, La/c6e0;

    .line 966
    .line 967
    invoke-direct {v2, v6, v0}, La/c6e0;-><init>(Ljava/lang/String;La/ioh;)V

    .line 968
    .line 969
    .line 970
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 971
    .line 972
    .line 973
    move-object/from16 v0, p1

    .line 974
    .line 975
    move v6, v9

    .line 976
    move-object/from16 v12, v24

    .line 977
    .line 978
    move-object/from16 v2, v27

    .line 979
    .line 980
    const/16 v8, 0xa

    .line 981
    .line 982
    const/4 v13, 0x0

    .line 983
    const/4 v14, 0x1

    .line 984
    goto/16 :goto_9

    .line 985
    .line 986
    :cond_19
    move-object/from16 v24, v12

    .line 987
    .line 988
    invoke-static {}, La/q3d;->p()V

    .line 989
    .line 990
    .line 991
    throw v24

    .line 992
    :cond_1a
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    return-object v0

    .line 997
    :pswitch_a
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 998
    .line 999
    move-object v2, v0

    .line 1000
    check-cast v2, La/x8e0;

    .line 1001
    .line 1002
    move-object v0, v1

    .line 1003
    check-cast v0, Ljava/lang/Throwable;

    .line 1004
    .line 1005
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1006
    .line 1007
    .line 1008
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 1009
    .line 1010
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 1011
    .line 1012
    :cond_1b
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    iget-object v1, v2, La/i3t0;->f:La/oyg0;

    .line 1020
    .line 1021
    move-object v4, v0

    .line 1022
    check-cast v4, La/l8e0;

    .line 1023
    .line 1024
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1025
    .line 1026
    .line 1027
    const/4 v13, 0x0

    .line 1028
    const/16 v14, 0x3ff

    .line 1029
    .line 1030
    const/4 v5, 0x0

    .line 1031
    const/4 v6, 0x0

    .line 1032
    const/4 v7, 0x0

    .line 1033
    const/4 v8, 0x0

    .line 1034
    const/4 v9, 0x0

    .line 1035
    const/4 v10, 0x0

    .line 1036
    const/4 v11, 0x0

    .line 1037
    const/4 v12, 0x0

    .line 1038
    invoke-static/range {v4 .. v14}, La/l8e0;->a(La/l8e0;ZZLa/zdm0;Ljava/util/HashMap;La/h8e0;La/j6i0;IZZI)La/l8e0;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v1

    .line 1042
    invoke-virtual {v3, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v0

    .line 1046
    if-eqz v0, :cond_1b

    .line 1047
    .line 1048
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1049
    .line 1050
    return-object v0

    .line 1051
    :pswitch_b
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 1052
    .line 1053
    check-cast v0, La/w4e0;

    .line 1054
    .line 1055
    check-cast v1, La/i3e0;

    .line 1056
    .line 1057
    sget-object v2, La/w4e0;->O1:La/rl70;

    .line 1058
    .line 1059
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1060
    .line 1061
    .line 1062
    iget-object v0, v0, La/w4e0;->M1:La/a8z;

    .line 1063
    .line 1064
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    check-cast v0, La/k3t0;

    .line 1069
    .line 1070
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1071
    .line 1072
    .line 1073
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1074
    .line 1075
    return-object v0

    .line 1076
    :pswitch_c
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 1077
    .line 1078
    check-cast v0, La/l4e0;

    .line 1079
    .line 1080
    check-cast v1, La/hcz;

    .line 1081
    .line 1082
    sget-object v2, La/l4e0;->n2:La/fl70;

    .line 1083
    .line 1084
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1085
    .line 1086
    .line 1087
    iget-object v2, v0, La/l4e0;->l2:La/lhf0;

    .line 1088
    .line 1089
    sget-object v3, La/l4e0;->o2:[La/iiy;

    .line 1090
    .line 1091
    const/16 v26, 0x1

    .line 1092
    .line 1093
    aget-object v3, v3, v26

    .line 1094
    .line 1095
    invoke-virtual {v2, v0, v3}, La/lhf0;->p(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    new-instance v3, La/ksc0;

    .line 1100
    .line 1101
    const/16 v4, 0x17

    .line 1102
    .line 1103
    invoke-direct {v3, v4}, La/ksc0;-><init>(B)V

    .line 1104
    .line 1105
    .line 1106
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1107
    .line 1108
    .line 1109
    move-result v4

    .line 1110
    new-instance v5, La/zu90;

    .line 1111
    .line 1112
    const/16 v6, 0x1b

    .line 1113
    .line 1114
    invoke-direct {v5, v6, v3, v2}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 1115
    .line 1116
    .line 1117
    new-instance v3, La/d1c0;

    .line 1118
    .line 1119
    const/16 v14, 0xa

    .line 1120
    .line 1121
    invoke-direct {v3, v2, v14}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 1122
    .line 1123
    .line 1124
    new-instance v6, La/xe4;

    .line 1125
    .line 1126
    const/16 v7, 0xe

    .line 1127
    .line 1128
    invoke-direct {v6, v2, v0, v7}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 1129
    .line 1130
    .line 1131
    new-instance v0, La/ugd;

    .line 1132
    .line 1133
    const v2, 0x799532c4

    .line 1134
    .line 1135
    .line 1136
    const/4 v14, 0x1

    .line 1137
    invoke-direct {v0, v2, v14, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v1, v4, v5, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1141
    .line 1142
    .line 1143
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1144
    .line 1145
    return-object v0

    .line 1146
    :pswitch_d
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 1147
    .line 1148
    move-object v2, v0

    .line 1149
    check-cast v2, La/d1e0;

    .line 1150
    .line 1151
    move-object v9, v1

    .line 1152
    check-cast v9, La/xus;

    .line 1153
    .line 1154
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1155
    .line 1156
    .line 1157
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 1158
    .line 1159
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 1160
    .line 1161
    :cond_1c
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v1

    .line 1165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1166
    .line 1167
    .line 1168
    iget-object v3, v2, La/i3t0;->f:La/oyg0;

    .line 1169
    .line 1170
    move-object v4, v3

    .line 1171
    move-object v3, v1

    .line 1172
    check-cast v3, La/qyd0;

    .line 1173
    .line 1174
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1175
    .line 1176
    .line 1177
    const/16 v19, 0x0

    .line 1178
    .line 1179
    const v20, 0x7ffffbf

    .line 1180
    .line 1181
    .line 1182
    const/4 v4, 0x0

    .line 1183
    const/4 v5, 0x0

    .line 1184
    const/4 v6, 0x0

    .line 1185
    const/4 v7, 0x0

    .line 1186
    const/4 v8, 0x0

    .line 1187
    const/4 v10, 0x0

    .line 1188
    const/4 v11, 0x0

    .line 1189
    const/4 v12, 0x0

    .line 1190
    const/4 v13, 0x0

    .line 1191
    const/4 v14, 0x0

    .line 1192
    const/4 v15, 0x0

    .line 1193
    const/16 v16, 0x0

    .line 1194
    .line 1195
    const/16 v17, 0x0

    .line 1196
    .line 1197
    const/16 v18, 0x0

    .line 1198
    .line 1199
    invoke-static/range {v3 .. v20}, La/qyd0;->a(La/qyd0;La/gps;La/jlr;La/vvd0;La/ypl0;La/bqr;La/xus;ZLa/ixd0;La/rud0;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;La/szj0;I)La/qyd0;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v3

    .line 1203
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1204
    .line 1205
    .line 1206
    move-result v1

    .line 1207
    if-eqz v1, :cond_1c

    .line 1208
    .line 1209
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1210
    .line 1211
    return-object v0

    .line 1212
    :pswitch_e
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 1213
    .line 1214
    check-cast v0, La/bvd0;

    .line 1215
    .line 1216
    check-cast v1, Ljava/lang/Long;

    .line 1217
    .line 1218
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 1219
    .line 1220
    .line 1221
    move-result-wide v1

    .line 1222
    sget-object v3, La/u0e0;->a:[La/u0e0;

    .line 1223
    .line 1224
    const-wide/16 v3, 0x6

    .line 1225
    .line 1226
    cmp-long v3, v1, v3

    .line 1227
    .line 1228
    if-nez v3, :cond_1e

    .line 1229
    .line 1230
    iget-object v0, v0, La/bvd0;->c:La/myd0;

    .line 1231
    .line 1232
    iget-object v0, v0, La/myd0;->c:Ljava/util/List;

    .line 1233
    .line 1234
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1235
    .line 1236
    .line 1237
    move-result v0

    .line 1238
    if-nez v0, :cond_1d

    .line 1239
    .line 1240
    :goto_f
    const/4 v13, 0x1

    .line 1241
    goto :goto_11

    .line 1242
    :cond_1d
    :goto_10
    const/4 v13, 0x0

    .line 1243
    goto :goto_11

    .line 1244
    :cond_1e
    const-wide/16 v3, 0x5

    .line 1245
    .line 1246
    cmp-long v1, v1, v3

    .line 1247
    .line 1248
    if-nez v1, :cond_1d

    .line 1249
    .line 1250
    iget-object v1, v0, La/bvd0;->a:La/ivd0;

    .line 1251
    .line 1252
    iget-object v1, v1, La/ivd0;->i:Ljava/util/List;

    .line 1253
    .line 1254
    if-eqz v1, :cond_1f

    .line 1255
    .line 1256
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1257
    .line 1258
    .line 1259
    move-result v2

    .line 1260
    if-eqz v2, :cond_1f

    .line 1261
    .line 1262
    goto :goto_10

    .line 1263
    :cond_1f
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v1

    .line 1267
    :cond_20
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1268
    .line 1269
    .line 1270
    move-result v2

    .line 1271
    if-eqz v2, :cond_1d

    .line 1272
    .line 1273
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v2

    .line 1277
    check-cast v2, La/wud0;

    .line 1278
    .line 1279
    iget v3, v2, La/wud0;->a:I

    .line 1280
    .line 1281
    const/4 v4, -0x1

    .line 1282
    if-eq v3, v4, :cond_20

    .line 1283
    .line 1284
    iget-object v2, v2, La/wud0;->b:Ljava/lang/String;

    .line 1285
    .line 1286
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1287
    .line 1288
    .line 1289
    move-result v2

    .line 1290
    if-lez v2, :cond_20

    .line 1291
    .line 1292
    iget-object v0, v0, La/bvd0;->b:La/ivd0;

    .line 1293
    .line 1294
    iget-object v0, v0, La/ivd0;->i:Ljava/util/List;

    .line 1295
    .line 1296
    if-eqz v0, :cond_21

    .line 1297
    .line 1298
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1299
    .line 1300
    .line 1301
    move-result v1

    .line 1302
    if-eqz v1, :cond_21

    .line 1303
    .line 1304
    goto :goto_10

    .line 1305
    :cond_21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    :cond_22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1310
    .line 1311
    .line 1312
    move-result v1

    .line 1313
    if-eqz v1, :cond_1d

    .line 1314
    .line 1315
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v1

    .line 1319
    check-cast v1, La/wud0;

    .line 1320
    .line 1321
    iget v2, v1, La/wud0;->a:I

    .line 1322
    .line 1323
    if-eq v2, v4, :cond_22

    .line 1324
    .line 1325
    iget-object v1, v1, La/wud0;->b:Ljava/lang/String;

    .line 1326
    .line 1327
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1328
    .line 1329
    .line 1330
    move-result v1

    .line 1331
    if-lez v1, :cond_22

    .line 1332
    .line 1333
    goto :goto_f

    .line 1334
    :goto_11
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v0

    .line 1338
    return-object v0

    .line 1339
    :pswitch_f
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 1340
    .line 1341
    check-cast v0, La/g0e0;

    .line 1342
    .line 1343
    check-cast v1, Ljava/lang/Long;

    .line 1344
    .line 1345
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 1346
    .line 1347
    .line 1348
    move-result-wide v1

    .line 1349
    sget-object v3, La/u0e0;->a:[La/u0e0;

    .line 1350
    .line 1351
    const-wide/16 v3, 0x2

    .line 1352
    .line 1353
    cmp-long v3, v1, v3

    .line 1354
    .line 1355
    if-nez v3, :cond_25

    .line 1356
    .line 1357
    iget-object v1, v0, La/g0e0;->g:La/syd0;

    .line 1358
    .line 1359
    iget-object v1, v1, La/syd0;->a:La/ezd0;

    .line 1360
    .line 1361
    iget-object v1, v1, La/ezd0;->f:Ljava/util/List;

    .line 1362
    .line 1363
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1364
    .line 1365
    .line 1366
    move-result v1

    .line 1367
    if-eqz v1, :cond_24

    .line 1368
    .line 1369
    iget-object v0, v0, La/g0e0;->g:La/syd0;

    .line 1370
    .line 1371
    iget-object v0, v0, La/syd0;->b:La/ezd0;

    .line 1372
    .line 1373
    iget-object v0, v0, La/ezd0;->f:Ljava/util/List;

    .line 1374
    .line 1375
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1376
    .line 1377
    .line 1378
    move-result v0

    .line 1379
    if-nez v0, :cond_23

    .line 1380
    .line 1381
    goto :goto_12

    .line 1382
    :cond_23
    const/4 v13, 0x0

    .line 1383
    goto :goto_13

    .line 1384
    :cond_24
    :goto_12
    const/4 v13, 0x1

    .line 1385
    goto :goto_13

    .line 1386
    :cond_25
    const-wide/16 v3, 0x1

    .line 1387
    .line 1388
    cmp-long v1, v1, v3

    .line 1389
    .line 1390
    if-nez v1, :cond_23

    .line 1391
    .line 1392
    iget-object v1, v0, La/g0e0;->g:La/syd0;

    .line 1393
    .line 1394
    iget-object v1, v1, La/syd0;->a:La/ezd0;

    .line 1395
    .line 1396
    iget-object v1, v1, La/ezd0;->e:Ljava/util/List;

    .line 1397
    .line 1398
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1399
    .line 1400
    .line 1401
    move-result v1

    .line 1402
    if-eqz v1, :cond_24

    .line 1403
    .line 1404
    iget-object v0, v0, La/g0e0;->g:La/syd0;

    .line 1405
    .line 1406
    iget-object v0, v0, La/syd0;->b:La/ezd0;

    .line 1407
    .line 1408
    iget-object v0, v0, La/ezd0;->e:Ljava/util/List;

    .line 1409
    .line 1410
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1411
    .line 1412
    .line 1413
    move-result v0

    .line 1414
    if-nez v0, :cond_23

    .line 1415
    .line 1416
    goto :goto_12

    .line 1417
    :goto_13
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v0

    .line 1421
    return-object v0

    .line 1422
    :pswitch_10
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 1423
    .line 1424
    check-cast v0, La/qud0;

    .line 1425
    .line 1426
    check-cast v1, La/hcz;

    .line 1427
    .line 1428
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1429
    .line 1430
    .line 1431
    iget-object v0, v0, La/qud0;->b:La/a4x;

    .line 1432
    .line 1433
    new-instance v2, La/bod0;

    .line 1434
    .line 1435
    const/4 v3, 0x5

    .line 1436
    invoke-direct {v2, v3}, La/bod0;-><init>(B)V

    .line 1437
    .line 1438
    .line 1439
    new-instance v3, La/bod0;

    .line 1440
    .line 1441
    const/4 v4, 0x6

    .line 1442
    invoke-direct {v3, v4}, La/bod0;-><init>(B)V

    .line 1443
    .line 1444
    .line 1445
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1446
    .line 1447
    .line 1448
    move-result v4

    .line 1449
    new-instance v5, La/zu90;

    .line 1450
    .line 1451
    const/16 v6, 0x19

    .line 1452
    .line 1453
    invoke-direct {v5, v6, v2, v0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 1454
    .line 1455
    .line 1456
    new-instance v2, La/zu90;

    .line 1457
    .line 1458
    invoke-direct {v2, v7, v3, v0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 1459
    .line 1460
    .line 1461
    new-instance v3, La/xy1;

    .line 1462
    .line 1463
    invoke-direct {v3, v0, v6}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 1464
    .line 1465
    .line 1466
    new-instance v0, La/ugd;

    .line 1467
    .line 1468
    const/4 v14, 0x1

    .line 1469
    invoke-direct {v0, v11, v14, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual {v1, v4, v5, v2, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1473
    .line 1474
    .line 1475
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1476
    .line 1477
    return-object v0

    .line 1478
    :pswitch_11
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 1479
    .line 1480
    check-cast v0, La/esd0;

    .line 1481
    .line 1482
    check-cast v1, Ljava/lang/Throwable;

    .line 1483
    .line 1484
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1485
    .line 1486
    .line 1487
    iget-object v2, v0, La/esd0;->p:La/duj;

    .line 1488
    .line 1489
    new-instance v3, La/nrc0;

    .line 1490
    .line 1491
    invoke-direct {v3, v0, v10}, La/nrc0;-><init>(Ljava/lang/Object;B)V

    .line 1492
    .line 1493
    .line 1494
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1495
    .line 1496
    .line 1497
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1498
    .line 1499
    return-object v0

    .line 1500
    :pswitch_12
    move-object/from16 v24, v12

    .line 1501
    .line 1502
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 1503
    .line 1504
    check-cast v0, La/qrd0;

    .line 1505
    .line 1506
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 1507
    .line 1508
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1509
    .line 1510
    .line 1511
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getAdapter()La/k5;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v2

    .line 1515
    instance-of v3, v2, La/jsd0;

    .line 1516
    .line 1517
    if-eqz v3, :cond_26

    .line 1518
    .line 1519
    move-object v12, v2

    .line 1520
    check-cast v12, La/jsd0;

    .line 1521
    .line 1522
    goto :goto_14

    .line 1523
    :cond_26
    move-object/from16 v12, v24

    .line 1524
    .line 1525
    :goto_14
    if-eqz v12, :cond_27

    .line 1526
    .line 1527
    iget-object v2, v0, La/qrd0;->b:La/a4x;

    .line 1528
    .line 1529
    iget-object v3, v0, La/qrd0;->c:La/a4x;

    .line 1530
    .line 1531
    iget-object v4, v0, La/qrd0;->a:La/a4x;

    .line 1532
    .line 1533
    iget-object v0, v0, La/qrd0;->d:La/hsd0;

    .line 1534
    .line 1535
    invoke-virtual {v12, v2, v3, v4, v0}, La/k5;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V

    .line 1536
    .line 1537
    .line 1538
    :cond_27
    const/4 v0, 0x1

    .line 1539
    const/4 v14, 0x0

    .line 1540
    invoke-virtual {v1, v14, v0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->b(ZZ)V

    .line 1541
    .line 1542
    .line 1543
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getColumnHeaderRecyclerView()La/y9b;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v0

    .line 1547
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 1548
    .line 1549
    .line 1550
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getRowHeaderRecyclerView()La/y9b;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v0

    .line 1554
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 1555
    .line 1556
    .line 1557
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getCellRecyclerView()La/y9b;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v0

    .line 1561
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 1562
    .line 1563
    .line 1564
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1565
    .line 1566
    return-object v0

    .line 1567
    :pswitch_13
    move-object/from16 v24, v12

    .line 1568
    .line 1569
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 1570
    .line 1571
    check-cast v0, La/snd0;

    .line 1572
    .line 1573
    check-cast v1, Landroid/text/Editable;

    .line 1574
    .line 1575
    sget-object v2, La/snd0;->n2:La/rl70;

    .line 1576
    .line 1577
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1578
    .line 1579
    .line 1580
    invoke-virtual {v0}, La/snd0;->V0()La/mhn0;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v2

    .line 1584
    iget-object v2, v2, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 1585
    .line 1586
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v1

    .line 1590
    invoke-static {v1}, La/wvb;->O(Ljava/lang/String;)D

    .line 1591
    .line 1592
    .line 1593
    move-result-wide v3

    .line 1594
    const-wide/16 v5, 0x0

    .line 1595
    .line 1596
    cmpg-double v3, v3, v5

    .line 1597
    .line 1598
    if-nez v3, :cond_28

    .line 1599
    .line 1600
    invoke-virtual {v2}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->getText()Ljava/lang/String;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v3

    .line 1604
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1605
    .line 1606
    .line 1607
    move-result v3

    .line 1608
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setSelection(I)V

    .line 1609
    .line 1610
    .line 1611
    :cond_28
    iget-object v0, v0, La/snd0;->m2:La/kiu0;

    .line 1612
    .line 1613
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v0

    .line 1617
    check-cast v0, La/qnd0;

    .line 1618
    .line 1619
    iget-object v2, v0, La/qnd0;->j:La/ctf0;

    .line 1620
    .line 1621
    const-string v3, ""

    .line 1622
    .line 1623
    iget-object v4, v0, La/qnd0;->m:La/p7m0;

    .line 1624
    .line 1625
    invoke-static {v1}, La/wvb;->O(Ljava/lang/String;)D

    .line 1626
    .line 1627
    .line 1628
    move-result-wide v7

    .line 1629
    iget-wide v9, v0, La/qnd0;->o:D

    .line 1630
    .line 1631
    cmpg-double v7, v7, v9

    .line 1632
    .line 1633
    iget-object v8, v0, La/qnd0;->n:La/ol60;

    .line 1634
    .line 1635
    if-gez v7, :cond_2b

    .line 1636
    .line 1637
    new-instance v7, La/jrn;

    .line 1638
    .line 1639
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v11

    .line 1643
    instance-of v12, v11, La/nrn;

    .line 1644
    .line 1645
    if-eqz v12, :cond_29

    .line 1646
    .line 1647
    check-cast v11, La/nrn;

    .line 1648
    .line 1649
    goto :goto_15

    .line 1650
    :cond_29
    move-object/from16 v11, v24

    .line 1651
    .line 1652
    :goto_15
    if-eqz v11, :cond_2a

    .line 1653
    .line 1654
    iget-object v11, v11, La/nrn;->g:Ljava/lang/String;

    .line 1655
    .line 1656
    if-eqz v11, :cond_2a

    .line 1657
    .line 1658
    goto :goto_16

    .line 1659
    :cond_2a
    move-object v11, v3

    .line 1660
    :goto_16
    invoke-static {v2, v9, v10, v11}, La/k9x;->E(La/ctf0;DLjava/lang/String;)Ljava/lang/String;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v2

    .line 1664
    invoke-direct {v7, v2}, La/jrn;-><init>(Ljava/lang/String;)V

    .line 1665
    .line 1666
    .line 1667
    invoke-virtual {v8, v7}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1668
    .line 1669
    .line 1670
    goto :goto_19

    .line 1671
    :cond_2b
    new-instance v7, La/krn;

    .line 1672
    .line 1673
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v11

    .line 1677
    instance-of v12, v11, La/nrn;

    .line 1678
    .line 1679
    if-eqz v12, :cond_2c

    .line 1680
    .line 1681
    check-cast v11, La/nrn;

    .line 1682
    .line 1683
    goto :goto_17

    .line 1684
    :cond_2c
    move-object/from16 v11, v24

    .line 1685
    .line 1686
    :goto_17
    if-eqz v11, :cond_2d

    .line 1687
    .line 1688
    iget-object v11, v11, La/nrn;->g:Ljava/lang/String;

    .line 1689
    .line 1690
    if-eqz v11, :cond_2d

    .line 1691
    .line 1692
    goto :goto_18

    .line 1693
    :cond_2d
    move-object v11, v3

    .line 1694
    :goto_18
    invoke-static {v2, v9, v10, v11}, La/k9x;->E(La/ctf0;DLjava/lang/String;)Ljava/lang/String;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v2

    .line 1698
    invoke-direct {v7, v2}, La/krn;-><init>(Ljava/lang/String;)V

    .line 1699
    .line 1700
    .line 1701
    invoke-virtual {v8, v7}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1702
    .line 1703
    .line 1704
    :goto_19
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v2

    .line 1708
    instance-of v7, v2, La/nrn;

    .line 1709
    .line 1710
    if-eqz v7, :cond_2e

    .line 1711
    .line 1712
    check-cast v2, La/nrn;

    .line 1713
    .line 1714
    goto :goto_1a

    .line 1715
    :cond_2e
    move-object/from16 v2, v24

    .line 1716
    .line 1717
    :goto_1a
    if-eqz v2, :cond_33

    .line 1718
    .line 1719
    invoke-static {v1}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 1720
    .line 1721
    .line 1722
    move-result-object v7

    .line 1723
    if-eqz v7, :cond_2f

    .line 1724
    .line 1725
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    .line 1726
    .line 1727
    .line 1728
    move-result-wide v5

    .line 1729
    :cond_2f
    iget-wide v7, v0, La/qnd0;->o:D

    .line 1730
    .line 1731
    cmpl-double v0, v5, v7

    .line 1732
    .line 1733
    if-ltz v0, :cond_31

    .line 1734
    .line 1735
    iget-wide v7, v2, La/nrn;->a:D

    .line 1736
    .line 1737
    cmpg-double v0, v5, v7

    .line 1738
    .line 1739
    if-nez v0, :cond_30

    .line 1740
    .line 1741
    goto :goto_1b

    .line 1742
    :cond_30
    const/4 v13, 0x1

    .line 1743
    goto :goto_1c

    .line 1744
    :cond_31
    :goto_1b
    const/4 v13, 0x0

    .line 1745
    :goto_1c
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1746
    .line 1747
    .line 1748
    move-result v0

    .line 1749
    if-nez v0, :cond_32

    .line 1750
    .line 1751
    goto :goto_1d

    .line 1752
    :cond_32
    sget-object v0, La/pn40;->a:La/pn40;

    .line 1753
    .line 1754
    sget-object v0, La/p3u0;->c:La/p3u0;

    .line 1755
    .line 1756
    invoke-static {v5, v6, v0}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v3

    .line 1760
    :goto_1d
    invoke-static {v2, v5, v6, v3, v13}, La/nrn;->a(La/nrn;DLjava/lang/String;Z)La/nrn;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v0

    .line 1764
    move-object/from16 v1, v24

    .line 1765
    .line 1766
    invoke-virtual {v4, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1767
    .line 1768
    .line 1769
    :cond_33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1770
    .line 1771
    return-object v0

    .line 1772
    :pswitch_14
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 1773
    .line 1774
    check-cast v0, La/sld0;

    .line 1775
    .line 1776
    check-cast v1, Ljava/lang/Throwable;

    .line 1777
    .line 1778
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1779
    .line 1780
    .line 1781
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1782
    .line 1783
    .line 1784
    iget-object v0, v0, La/sld0;->k:La/ol60;

    .line 1785
    .line 1786
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1787
    .line 1788
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1789
    .line 1790
    .line 1791
    return-object v1

    .line 1792
    :pswitch_15
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 1793
    .line 1794
    check-cast v0, La/jba;

    .line 1795
    .line 1796
    check-cast v1, La/hcz;

    .line 1797
    .line 1798
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1799
    .line 1800
    .line 1801
    iget-object v2, v0, La/jba;->a:La/a4x;

    .line 1802
    .line 1803
    new-instance v3, La/ljc0;

    .line 1804
    .line 1805
    invoke-direct {v3, v7}, La/ljc0;-><init>(B)V

    .line 1806
    .line 1807
    .line 1808
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1809
    .line 1810
    .line 1811
    move-result v4

    .line 1812
    new-instance v5, La/zu90;

    .line 1813
    .line 1814
    invoke-direct {v5, v9, v3, v2}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 1815
    .line 1816
    .line 1817
    new-instance v3, La/xe4;

    .line 1818
    .line 1819
    const/16 v6, 0xd

    .line 1820
    .line 1821
    invoke-direct {v3, v2, v0, v6}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 1822
    .line 1823
    .line 1824
    new-instance v0, La/ugd;

    .line 1825
    .line 1826
    const/4 v14, 0x1

    .line 1827
    invoke-direct {v0, v11, v14, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1828
    .line 1829
    .line 1830
    const/4 v2, 0x0

    .line 1831
    invoke-virtual {v1, v4, v2, v5, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1832
    .line 1833
    .line 1834
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1835
    .line 1836
    return-object v0

    .line 1837
    :pswitch_16
    move-object v2, v12

    .line 1838
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 1839
    .line 1840
    check-cast v0, La/jid0;

    .line 1841
    .line 1842
    check-cast v1, Ljava/lang/Throwable;

    .line 1843
    .line 1844
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1845
    .line 1846
    .line 1847
    iget-object v3, v0, La/jid0;->b:La/ctf0;

    .line 1848
    .line 1849
    new-instance v4, La/bid0;

    .line 1850
    .line 1851
    const/4 v14, 0x0

    .line 1852
    invoke-direct {v4, v14}, La/bid0;-><init>(Z)V

    .line 1853
    .line 1854
    .line 1855
    invoke-virtual {v0, v4}, La/jid0;->y(La/hid0;)V

    .line 1856
    .line 1857
    .line 1858
    instance-of v4, v1, La/bfd0;

    .line 1859
    .line 1860
    if-eqz v4, :cond_36

    .line 1861
    .line 1862
    check-cast v1, La/bfd0;

    .line 1863
    .line 1864
    iget-object v1, v1, La/bfd0;->g:Ljava/lang/String;

    .line 1865
    .line 1866
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1867
    .line 1868
    .line 1869
    move-result v4

    .line 1870
    if-lez v4, :cond_34

    .line 1871
    .line 1872
    move-object v12, v1

    .line 1873
    goto :goto_1e

    .line 1874
    :cond_34
    move-object v12, v2

    .line 1875
    :goto_1e
    if-nez v12, :cond_35

    .line 1876
    .line 1877
    new-array v1, v14, [Ljava/lang/Object;

    .line 1878
    .line 1879
    iget-object v2, v3, La/ctf0;->b:La/lsm0;

    .line 1880
    .line 1881
    invoke-static {v1, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v1

    .line 1885
    const v3, 0x7f131682

    .line 1886
    .line 1887
    .line 1888
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v12

    .line 1892
    :cond_35
    new-instance v1, La/gid0;

    .line 1893
    .line 1894
    invoke-direct {v1, v12}, La/gid0;-><init>(Ljava/lang/String;)V

    .line 1895
    .line 1896
    .line 1897
    invoke-virtual {v0, v1}, La/jid0;->y(La/hid0;)V

    .line 1898
    .line 1899
    .line 1900
    goto :goto_20

    .line 1901
    :cond_36
    instance-of v4, v1, La/afd0;

    .line 1902
    .line 1903
    if-eqz v4, :cond_39

    .line 1904
    .line 1905
    check-cast v1, La/afd0;

    .line 1906
    .line 1907
    iget-object v1, v1, La/afd0;->g:Ljava/lang/String;

    .line 1908
    .line 1909
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1910
    .line 1911
    .line 1912
    move-result v4

    .line 1913
    if-lez v4, :cond_37

    .line 1914
    .line 1915
    move-object v12, v1

    .line 1916
    goto :goto_1f

    .line 1917
    :cond_37
    move-object v12, v2

    .line 1918
    :goto_1f
    if-nez v12, :cond_38

    .line 1919
    .line 1920
    const/4 v14, 0x0

    .line 1921
    new-array v1, v14, [Ljava/lang/Object;

    .line 1922
    .line 1923
    iget-object v2, v3, La/ctf0;->b:La/lsm0;

    .line 1924
    .line 1925
    invoke-static {v1, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v1

    .line 1929
    const v3, 0x7f130839

    .line 1930
    .line 1931
    .line 1932
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v12

    .line 1936
    :cond_38
    new-instance v1, La/eid0;

    .line 1937
    .line 1938
    invoke-direct {v1, v12}, La/eid0;-><init>(Ljava/lang/String;)V

    .line 1939
    .line 1940
    .line 1941
    invoke-virtual {v0, v1}, La/jid0;->y(La/hid0;)V

    .line 1942
    .line 1943
    .line 1944
    goto :goto_20

    .line 1945
    :cond_39
    sget-object v1, La/cid0;->a:La/cid0;

    .line 1946
    .line 1947
    invoke-virtual {v0, v1}, La/jid0;->y(La/hid0;)V

    .line 1948
    .line 1949
    .line 1950
    :goto_20
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1951
    .line 1952
    return-object v0

    .line 1953
    :pswitch_17
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 1954
    .line 1955
    check-cast v0, La/jgd0;

    .line 1956
    .line 1957
    check-cast v1, Landroid/view/View;

    .line 1958
    .line 1959
    sget-object v2, La/jgd0;->V1:La/xi70;

    .line 1960
    .line 1961
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1962
    .line 1963
    .line 1964
    invoke-virtual {v0}, La/jgd0;->G0()La/ii;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v1

    .line 1968
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1969
    .line 1970
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v8

    .line 1974
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v9

    .line 1978
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v10

    .line 1982
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1983
    .line 1984
    .line 1985
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v11

    .line 1989
    const-string v13, "REQUEST_CONSULTANT_KEY"

    .line 1990
    .line 1991
    sget-object v16, La/n12;->a:La/n12;

    .line 1992
    .line 1993
    const/16 v17, 0x0

    .line 1994
    .line 1995
    const/16 v18, 0x5d0

    .line 1996
    .line 1997
    const/4 v12, 0x0

    .line 1998
    const/4 v14, 0x0

    .line 1999
    const/4 v15, 0x0

    .line 2000
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2001
    .line 2002
    .line 2003
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v0

    .line 2007
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2008
    .line 2009
    .line 2010
    invoke-virtual {v1, v7, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2011
    .line 2012
    .line 2013
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2014
    .line 2015
    return-object v0

    .line 2016
    :pswitch_18
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 2017
    .line 2018
    check-cast v0, La/gfd0;

    .line 2019
    .line 2020
    check-cast v1, Landroid/view/View;

    .line 2021
    .line 2022
    sget-object v2, La/gfd0;->S1:La/mi70;

    .line 2023
    .line 2024
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2025
    .line 2026
    .line 2027
    invoke-virtual {v0}, La/gfd0;->G0()La/ii;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v1

    .line 2031
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2032
    .line 2033
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v8

    .line 2037
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v9

    .line 2041
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v10

    .line 2045
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2046
    .line 2047
    .line 2048
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2049
    .line 2050
    .line 2051
    move-result-object v11

    .line 2052
    const-string v13, "REQUEST_CONSULTANT_KEY"

    .line 2053
    .line 2054
    sget-object v16, La/n12;->a:La/n12;

    .line 2055
    .line 2056
    const/16 v17, 0x0

    .line 2057
    .line 2058
    const/16 v18, 0x5d0

    .line 2059
    .line 2060
    const/4 v12, 0x0

    .line 2061
    const/4 v14, 0x0

    .line 2062
    const/4 v15, 0x0

    .line 2063
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2064
    .line 2065
    .line 2066
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v0

    .line 2070
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2071
    .line 2072
    .line 2073
    invoke-virtual {v1, v7, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2074
    .line 2075
    .line 2076
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2077
    .line 2078
    return-object v0

    .line 2079
    :pswitch_19
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 2080
    .line 2081
    check-cast v0, La/bed0;

    .line 2082
    .line 2083
    check-cast v1, Landroid/view/View;

    .line 2084
    .line 2085
    sget-object v2, La/bed0;->U1:La/fl70;

    .line 2086
    .line 2087
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2088
    .line 2089
    .line 2090
    invoke-virtual {v0}, La/bed0;->H0()La/ned0;

    .line 2091
    .line 2092
    .line 2093
    move-result-object v0

    .line 2094
    iget-object v1, v0, La/ned0;->x:La/i1w0;

    .line 2095
    .line 2096
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v2

    .line 2100
    new-instance v3, La/p7d0;

    .line 2101
    .line 2102
    const/4 v4, 0x3

    .line 2103
    invoke-direct {v3, v0, v4}, La/p7d0;-><init>(Ljava/lang/Object;B)V

    .line 2104
    .line 2105
    .line 2106
    new-instance v0, La/a1w0;

    .line 2107
    .line 2108
    invoke-direct {v0, v3}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 2109
    .line 2110
    .line 2111
    new-instance v3, La/c8d;

    .line 2112
    .line 2113
    sget-object v4, La/y7d;->a:La/v7d;

    .line 2114
    .line 2115
    invoke-direct {v3, v4, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2116
    .line 2117
    .line 2118
    const/4 v14, 0x0

    .line 2119
    invoke-static {v2, v3, v1, v2, v14}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v0

    .line 2123
    :goto_21
    move-object v2, v0

    .line 2124
    check-cast v2, La/paw;

    .line 2125
    .line 2126
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 2127
    .line 2128
    .line 2129
    move-result v3

    .line 2130
    if-eqz v3, :cond_3a

    .line 2131
    .line 2132
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v2

    .line 2136
    check-cast v2, La/oe50;

    .line 2137
    .line 2138
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 2139
    .line 2140
    .line 2141
    goto :goto_21

    .line 2142
    :cond_3a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2143
    .line 2144
    return-object v0

    .line 2145
    :pswitch_1a
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 2146
    .line 2147
    check-cast v0, La/ilq;

    .line 2148
    .line 2149
    check-cast v1, La/abi0;

    .line 2150
    .line 2151
    invoke-interface {v0}, La/ilq;->invoke()F

    .line 2152
    .line 2153
    .line 2154
    move-result v2

    .line 2155
    const/4 v3, 0x0

    .line 2156
    cmpl-float v2, v2, v3

    .line 2157
    .line 2158
    if-lez v2, :cond_3b

    .line 2159
    .line 2160
    new-instance v2, La/g3c0;

    .line 2161
    .line 2162
    invoke-interface {v0}, La/ilq;->invoke()F

    .line 2163
    .line 2164
    .line 2165
    move-result v0

    .line 2166
    new-instance v4, La/cvc;

    .line 2167
    .line 2168
    const/high16 v5, 0x3f800000    # 1.0f

    .line 2169
    .line 2170
    invoke-direct {v4, v3, v5}, La/cvc;-><init>(FF)V

    .line 2171
    .line 2172
    .line 2173
    invoke-direct {v2, v0, v4}, La/g3c0;-><init>(FLa/cvc;)V

    .line 2174
    .line 2175
    .line 2176
    invoke-static {v1, v2}, La/yai0;->d(La/abi0;La/g3c0;)V

    .line 2177
    .line 2178
    .line 2179
    :cond_3b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2180
    .line 2181
    return-object v0

    .line 2182
    :pswitch_1b
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 2183
    .line 2184
    check-cast v0, La/pzu;

    .line 2185
    .line 2186
    iget-object v0, v0, La/pzu;->f:Ljava/lang/Object;

    .line 2187
    .line 2188
    check-cast v0, La/xw3;

    .line 2189
    .line 2190
    invoke-virtual {v0, v1}, La/xw3;->addLast(Ljava/lang/Object;)V

    .line 2191
    .line 2192
    .line 2193
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2194
    .line 2195
    return-object v0

    .line 2196
    :pswitch_1c
    iget-object v0, v0, La/v6d0;->b:Ljava/lang/Object;

    .line 2197
    .line 2198
    check-cast v0, La/k7d0;

    .line 2199
    .line 2200
    check-cast v1, La/rl;

    .line 2201
    .line 2202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2203
    .line 2204
    .line 2205
    iget-object v0, v0, La/k7d0;->e:La/pzu;

    .line 2206
    .line 2207
    new-instance v2, La/fmf0;

    .line 2208
    .line 2209
    invoke-direct {v2, v1}, La/fmf0;-><init>(La/rl;)V

    .line 2210
    .line 2211
    .line 2212
    iget-object v0, v0, La/pzu;->e:Ljava/lang/Object;

    .line 2213
    .line 2214
    check-cast v0, La/q99;

    .line 2215
    .line 2216
    invoke-interface {v0, v2}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2217
    .line 2218
    .line 2219
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2220
    .line 2221
    return-object v0

    .line 2222
    nop

    .line 2223
    :pswitch_data_0
    .packed-switch 0x0
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
