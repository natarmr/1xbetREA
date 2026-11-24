.class public final synthetic La/bod0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/bod0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/pzu;)V
    .locals 0

    .line 1
    const/16 p1, 0x1d

    iput-byte p1, p0, La/bod0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte p0, p0, La/bod0;->a:B

    .line 2
    .line 3
    const-wide v0, 0x3fc999999999999aL    # 0.2

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const v2, 0x7f07074a

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    const/4 v5, 0x0

    .line 14
    packed-switch p0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, La/k0w0;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance p0, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 23
    .line 24
    const-string v0, "referral_rules_01"

    .line 25
    .line 26
    const/16 v1, 0xe

    .line 27
    .line 28
    invoke-direct {p0, v0, v1, v3, v3}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;

    .line 32
    .line 33
    const v1, 0x7f1311a1

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, p0, v1, v5}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    check-cast p1, Landroid/content/Context;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance p0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 51
    .line 52
    invoke-direct {p0, p1, v3, v5}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 53
    .line 54
    .line 55
    new-instance p1, La/zle0;

    .line 56
    .line 57
    invoke-direct {p1, p0, v4, v2}, La/k5;-><init>(La/nmo0;ZI)V

    .line 58
    .line 59
    .line 60
    iput-object p0, p1, La/zle0;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->setAdapter(La/k5;)V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_1
    check-cast p1, Landroid/content/Context;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance p0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 72
    .line 73
    invoke-direct {p0, p1, v3, v5}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 74
    .line 75
    .line 76
    new-instance p1, La/jke0;

    .line 77
    .line 78
    invoke-direct {p1, p0, v4, v2}, La/k5;-><init>(La/nmo0;ZI)V

    .line 79
    .line 80
    .line 81
    iput-object p0, p1, La/jke0;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->setAdapter(La/k5;)V

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_2
    check-cast p1, La/hcz;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    :goto_0
    const/4 p0, 0x6

    .line 93
    if-ge v5, p0, :cond_0

    .line 94
    .line 95
    sget-object p0, La/f1t0;->d:La/ugd;

    .line 96
    .line 97
    const/4 v0, 0x3

    .line 98
    invoke-static {p1, v3, v3, p0, v0}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 99
    .line 100
    .line 101
    add-int/lit8 v5, v5, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_3
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    sget-object p0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 113
    .line 114
    invoke-static {p1}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-eqz p0, :cond_1

    .line 119
    .line 120
    const/16 v0, 0x8

    .line 121
    .line 122
    iget-object p0, p0, La/xiv0;->a:La/uiv0;

    .line 123
    .line 124
    invoke-virtual {p0, v0}, La/uiv0;->u(I)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-ne p0, v4, :cond_1

    .line 129
    .line 130
    invoke-static {p1}, La/j120;->X(Landroid/view/View;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 134
    .line 135
    .line 136
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_5
    check-cast p1, La/cp;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_6
    check-cast p1, La/ob0;

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    new-instance p0, La/jfe0;

    .line 161
    .line 162
    invoke-direct {p0, p1}, La/jfe0;-><init>(La/ob0;)V

    .line 163
    .line 164
    .line 165
    return-object p0

    .line 166
    :pswitch_7
    check-cast p1, Ljava/lang/Integer;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    new-instance v0, La/mdm;

    .line 173
    .line 174
    sget-object p1, La/pb10;->c:La/xuz;

    .line 175
    .line 176
    sget-object v1, La/pb10;->g:La/pb10;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    const-wide/16 v11, 0x0

    .line 186
    .line 187
    const/16 v13, 0x25e

    .line 188
    .line 189
    const/4 v2, 0x0

    .line 190
    const/4 v3, 0x0

    .line 191
    const/4 v4, 0x0

    .line 192
    const/4 v5, 0x0

    .line 193
    const v6, 0x7f1307c4

    .line 194
    .line 195
    .line 196
    const/4 v7, 0x0

    .line 197
    const v8, 0x7f131690

    .line 198
    .line 199
    .line 200
    const-wide/16 v9, 0x2710

    .line 201
    .line 202
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 203
    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    new-instance v0, La/mdm;

    .line 213
    .line 214
    sget-object p1, La/pb10;->c:La/xuz;

    .line 215
    .line 216
    sget-object v1, La/pb10;->g:La/pb10;

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    const-wide/16 v11, 0x0

    .line 226
    .line 227
    const/16 v13, 0x3de

    .line 228
    .line 229
    const/4 v2, 0x0

    .line 230
    const/4 v3, 0x0

    .line 231
    const/4 v4, 0x0

    .line 232
    const/4 v5, 0x0

    .line 233
    const v6, 0x7f130674

    .line 234
    .line 235
    .line 236
    const/4 v7, 0x0

    .line 237
    const/4 v8, 0x0

    .line 238
    const-wide/16 v9, 0x0

    .line 239
    .line 240
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 241
    .line 242
    .line 243
    return-object v0

    .line 244
    :pswitch_9
    check-cast p1, La/ot0;

    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-static {p1}, La/x4d0;->g0(La/ot0;)La/pt0;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    return-object p0

    .line 254
    :pswitch_a
    check-cast p1, La/kg;

    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-static {p1}, La/oja0;->b0(La/kg;)La/ijl;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    return-object p0

    .line 264
    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    .line 265
    .line 266
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 270
    .line 271
    .line 272
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object p0

    .line 275
    :pswitch_c
    check-cast p1, La/o7e0;

    .line 276
    .line 277
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    iget-object p0, p1, La/o7e0;->b:La/h7e0;

    .line 281
    .line 282
    iget-object p1, p1, La/o7e0;->a:La/sff0;

    .line 283
    .line 284
    invoke-static {p1}, La/ucx;->X(La/sff0;)La/dxh0;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    new-instance v0, La/i7e0;

    .line 289
    .line 290
    const/4 v1, 0x2

    .line 291
    new-array v1, v1, [La/h7e0;

    .line 292
    .line 293
    sget-object v2, La/f7e0;->c:La/f7e0;

    .line 294
    .line 295
    aput-object v2, v1, v5

    .line 296
    .line 297
    sget-object v2, La/g7e0;->c:La/g7e0;

    .line 298
    .line 299
    aput-object v2, v1, v4

    .line 300
    .line 301
    invoke-static {v1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-direct {v0, p0, v1, p1}, La/i7e0;-><init>(La/h7e0;La/i4;La/dxh0;)V

    .line 306
    .line 307
    .line 308
    return-object v0

    .line 309
    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    .line 310
    .line 311
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 312
    .line 313
    .line 314
    move-result p0

    .line 315
    int-to-double p0, p0

    .line 316
    mul-double/2addr p0, v0

    .line 317
    invoke-static {p0, p1}, La/si30;->a(D)I

    .line 318
    .line 319
    .line 320
    move-result p0

    .line 321
    neg-int p0, p0

    .line 322
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    return-object p0

    .line 327
    :pswitch_e
    check-cast p1, Ljava/lang/Integer;

    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 330
    .line 331
    .line 332
    move-result p0

    .line 333
    int-to-double p0, p0

    .line 334
    mul-double/2addr p0, v0

    .line 335
    invoke-static {p0, p1}, La/si30;->a(D)I

    .line 336
    .line 337
    .line 338
    move-result p0

    .line 339
    neg-int p0, p0

    .line 340
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    return-object p0

    .line 345
    :pswitch_f
    check-cast p1, La/e2e0;

    .line 346
    .line 347
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    iget-object p0, p1, La/e2e0;->a:Ljava/lang/String;

    .line 351
    .line 352
    return-object p0

    .line 353
    :pswitch_10
    check-cast p1, La/xa30;

    .line 354
    .line 355
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    new-instance p0, La/jxd0;

    .line 359
    .line 360
    invoke-direct {p0, p1}, La/jxd0;-><init>(La/xa30;)V

    .line 361
    .line 362
    .line 363
    return-object p0

    .line 364
    :pswitch_11
    check-cast p1, La/wus;

    .line 365
    .line 366
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    new-instance p0, La/kxd0;

    .line 370
    .line 371
    invoke-direct {p0, p1}, La/kxd0;-><init>(La/wus;)V

    .line 372
    .line 373
    .line 374
    return-object p0

    .line 375
    :pswitch_12
    check-cast p1, Ljava/lang/Throwable;

    .line 376
    .line 377
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 381
    .line 382
    .line 383
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 384
    .line 385
    return-object p0

    .line 386
    :pswitch_13
    check-cast p1, La/fee;

    .line 387
    .line 388
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p0

    .line 395
    check-cast p0, La/bqr;

    .line 396
    .line 397
    invoke-static {p0, v5}, La/kpb;->o0(La/bqr;Z)La/cqr;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    return-object p0

    .line 402
    :pswitch_14
    check-cast p1, La/mbp0;

    .line 403
    .line 404
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    iget-object p0, p1, La/mbp0;->h:La/fbp0;

    .line 408
    .line 409
    iget-object v0, p1, La/mbp0;->f:La/sff0;

    .line 410
    .line 411
    invoke-static {v0}, La/ucx;->X(La/sff0;)La/dxh0;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    iget-boolean v1, p1, La/mbp0;->a:Z

    .line 416
    .line 417
    iget-object v2, p1, La/mbp0;->l:La/obp0;

    .line 418
    .line 419
    iget-object p1, p1, La/mbp0;->k:La/e9p0;

    .line 420
    .line 421
    invoke-static {p0, v0, v1, p1, v2}, La/qim0;->k(La/fbp0;La/dxh0;ZLa/e9p0;La/obp0;)La/gbp0;

    .line 422
    .line 423
    .line 424
    move-result-object p0

    .line 425
    return-object p0

    .line 426
    :pswitch_15
    check-cast p1, La/mbp0;

    .line 427
    .line 428
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    iget-object v0, p1, La/mbp0;->c:La/o9p0;

    .line 432
    .line 433
    iget-object v1, p1, La/mbp0;->d:Ljava/util/Map;

    .line 434
    .line 435
    iget-object v2, p1, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 436
    .line 437
    iget-boolean v3, p1, La/mbp0;->e:Z

    .line 438
    .line 439
    iget-object v4, p1, La/mbp0;->g:La/v8d;

    .line 440
    .line 441
    iget-boolean v5, p1, La/mbp0;->a:Z

    .line 442
    .line 443
    invoke-static/range {v0 .. v5}, La/xnm0;->h(La/o9p0;Ljava/util/Map;Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;ZLa/v8d;Z)La/qbp0;

    .line 444
    .line 445
    .line 446
    move-result-object p0

    .line 447
    return-object p0

    .line 448
    :pswitch_16
    check-cast p1, La/pud0;

    .line 449
    .line 450
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    const-class p0, La/pud0;

    .line 454
    .line 455
    sget-object p1, La/sre0;->a:La/tre0;

    .line 456
    .line 457
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 458
    .line 459
    .line 460
    move-result-object p0

    .line 461
    return-object p0

    .line 462
    :pswitch_17
    check-cast p1, La/pud0;

    .line 463
    .line 464
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    iget-object p0, p1, La/pud0;->a:Ljava/lang/String;

    .line 468
    .line 469
    return-object p0

    .line 470
    :pswitch_18
    check-cast p1, Landroid/content/Context;

    .line 471
    .line 472
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    new-instance p0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 476
    .line 477
    invoke-direct {p0, p1, v3, v5}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 478
    .line 479
    .line 480
    new-instance p1, La/jsd0;

    .line 481
    .line 482
    invoke-direct {p1, p0, v4, v2}, La/k5;-><init>(La/nmo0;ZI)V

    .line 483
    .line 484
    .line 485
    iput-object p0, p1, La/jsd0;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 486
    .line 487
    invoke-virtual {p0, p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->setAdapter(La/k5;)V

    .line 488
    .line 489
    .line 490
    return-object p0

    .line 491
    :pswitch_19
    check-cast p1, Ljava/lang/Throwable;

    .line 492
    .line 493
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 497
    .line 498
    return-object p0

    .line 499
    :pswitch_1a
    check-cast p1, Ljava/lang/Throwable;

    .line 500
    .line 501
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 505
    .line 506
    return-object p0

    .line 507
    :pswitch_1b
    check-cast p1, Ljava/lang/Throwable;

    .line 508
    .line 509
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 513
    .line 514
    return-object p0

    .line 515
    :pswitch_1c
    check-cast p1, Ljava/lang/Throwable;

    .line 516
    .line 517
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 521
    .line 522
    return-object p0

    .line 523
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
