.class public final synthetic La/jq4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v8;


# direct methods
.method public synthetic constructor <init>(La/v8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jq4;->a:B

    iput-object p1, p0, La/jq4;->b:La/v8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/jq4;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    const/16 v3, 0x1a

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object p0, p0, La/jq4;->b:La/v8;

    .line 10
    .line 11
    check-cast p1, La/cp;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 20
    .line 21
    check-cast v0, La/zvx;

    .line 22
    .line 23
    iget-object v0, v0, La/zvx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v1, La/kq4;

    .line 29
    .line 30
    const/16 v2, 0xb

    .line 31
    .line 32
    invoke-direct {v1, p0, p1, v2}, La/kq4;-><init>(La/v8;La/cp;B)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 36
    .line 37
    .line 38
    new-instance p0, La/a8u0;

    .line 39
    .line 40
    invoke-direct {p0, p1, v4}, La/a8u0;-><init>(La/cp;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 53
    .line 54
    check-cast v0, La/zvx;

    .line 55
    .line 56
    iget-object v0, v0, La/zvx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v1, La/kq4;

    .line 62
    .line 63
    const/16 v2, 0xa

    .line 64
    .line 65
    invoke-direct {v1, p0, p1, v2}, La/kq4;-><init>(La/v8;La/cp;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 69
    .line 70
    .line 71
    new-instance p0, La/kzi0;

    .line 72
    .line 73
    invoke-direct {p0, p1, v3}, La/kzi0;-><init>(La/cp;B)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 86
    .line 87
    check-cast v0, La/zvx;

    .line 88
    .line 89
    iget-object v0, v0, La/zvx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    new-instance v1, La/kq4;

    .line 95
    .line 96
    const/16 v3, 0x9

    .line 97
    .line 98
    invoke-direct {v1, p0, p1, v3}, La/kq4;-><init>(La/v8;La/cp;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 102
    .line 103
    .line 104
    new-instance p0, La/ui80;

    .line 105
    .line 106
    invoke-direct {p0, p1, v2}, La/ui80;-><init>(La/cp;B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 110
    .line 111
    .line 112
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 119
    .line 120
    check-cast v0, La/zvx;

    .line 121
    .line 122
    iget-object v0, v0, La/zvx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v1, La/kq4;

    .line 128
    .line 129
    invoke-direct {v1, p0, p1, v2}, La/kq4;-><init>(La/v8;La/cp;B)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 133
    .line 134
    .line 135
    new-instance p0, La/b1w;

    .line 136
    .line 137
    const/16 v0, 0x14

    .line 138
    .line 139
    invoke-direct {p0, p1, v0}, La/b1w;-><init>(La/cp;B)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 143
    .line 144
    .line 145
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 152
    .line 153
    check-cast v0, La/zvx;

    .line 154
    .line 155
    iget-object v0, v0, La/zvx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    new-instance v1, La/kq4;

    .line 161
    .line 162
    const/4 v2, 0x7

    .line 163
    invoke-direct {v1, p0, p1, v2}, La/kq4;-><init>(La/v8;La/cp;B)V

    .line 164
    .line 165
    .line 166
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 167
    .line 168
    .line 169
    new-instance p0, La/b1w;

    .line 170
    .line 171
    const/16 v0, 0x13

    .line 172
    .line 173
    invoke-direct {p0, p1, v0}, La/b1w;-><init>(La/cp;B)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 177
    .line 178
    .line 179
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 186
    .line 187
    check-cast v0, La/awx;

    .line 188
    .line 189
    iget-object v1, v0, La/awx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    new-instance v2, La/kq4;

    .line 195
    .line 196
    const/4 v3, 0x6

    .line 197
    invoke-direct {v2, p0, p1, v3}, La/kq4;-><init>(La/v8;La/cp;B)V

    .line 198
    .line 199
    .line 200
    invoke-static {v1, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 201
    .line 202
    .line 203
    iget-object p0, v0, La/awx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 204
    .line 205
    iget-object v1, p1, La/cp;->w:Landroid/content/Context;

    .line 206
    .line 207
    const v2, 0x7f040b5f

    .line 208
    .line 209
    .line 210
    invoke-static {v2, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCounterColor(I)V

    .line 215
    .line 216
    .line 217
    iget-object p0, v0, La/awx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 218
    .line 219
    const v0, 0x7f040b55

    .line 220
    .line 221
    .line 222
    invoke-static {v0, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCounterBackgroundColor(Ljava/lang/Integer;)V

    .line 231
    .line 232
    .line 233
    new-instance p0, La/b1w;

    .line 234
    .line 235
    const/16 v0, 0x12

    .line 236
    .line 237
    invoke-direct {p0, p1, v0}, La/b1w;-><init>(La/cp;B)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 241
    .line 242
    .line 243
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 250
    .line 251
    check-cast v0, La/zvx;

    .line 252
    .line 253
    iget-object v0, v0, La/zvx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    new-instance v1, La/kq4;

    .line 259
    .line 260
    const/4 v2, 0x5

    .line 261
    invoke-direct {v1, p0, p1, v2}, La/kq4;-><init>(La/v8;La/cp;B)V

    .line 262
    .line 263
    .line 264
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 265
    .line 266
    .line 267
    new-instance p0, La/b1w;

    .line 268
    .line 269
    const/16 v0, 0x11

    .line 270
    .line 271
    invoke-direct {p0, p1, v0}, La/b1w;-><init>(La/cp;B)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 275
    .line 276
    .line 277
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object p0

    .line 280
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 284
    .line 285
    check-cast v0, La/zvx;

    .line 286
    .line 287
    iget-object v0, v0, La/zvx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    new-instance v1, La/kq4;

    .line 293
    .line 294
    const/4 v2, 0x4

    .line 295
    invoke-direct {v1, p0, p1, v2}, La/kq4;-><init>(La/v8;La/cp;B)V

    .line 296
    .line 297
    .line 298
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 299
    .line 300
    .line 301
    new-instance p0, La/kgh;

    .line 302
    .line 303
    const/16 v0, 0xd

    .line 304
    .line 305
    invoke-direct {p0, p1, v0}, La/kgh;-><init>(La/cp;B)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 309
    .line 310
    .line 311
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 312
    .line 313
    return-object p0

    .line 314
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 318
    .line 319
    check-cast v0, La/zvx;

    .line 320
    .line 321
    iget-object v0, v0, La/zvx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 322
    .line 323
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    new-instance v2, La/kq4;

    .line 327
    .line 328
    const/4 v3, 0x3

    .line 329
    invoke-direct {v2, p0, p1, v3}, La/kq4;-><init>(La/v8;La/cp;B)V

    .line 330
    .line 331
    .line 332
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 333
    .line 334
    .line 335
    new-instance p0, La/kgh;

    .line 336
    .line 337
    invoke-direct {p0, p1, v1}, La/kgh;-><init>(La/cp;B)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 341
    .line 342
    .line 343
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    return-object p0

    .line 346
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 350
    .line 351
    check-cast v0, La/zvx;

    .line 352
    .line 353
    iget-object v0, v0, La/zvx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    new-instance v2, La/kq4;

    .line 359
    .line 360
    invoke-direct {v2, p0, p1, v1}, La/kq4;-><init>(La/v8;La/cp;B)V

    .line 361
    .line 362
    .line 363
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 364
    .line 365
    .line 366
    new-instance p0, La/rn5;

    .line 367
    .line 368
    invoke-direct {p0, p1, v3}, La/rn5;-><init>(La/cp;B)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 372
    .line 373
    .line 374
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    return-object p0

    .line 377
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 381
    .line 382
    check-cast v0, La/csx;

    .line 383
    .line 384
    iget-object v0, v0, La/csx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    new-instance v1, La/kq4;

    .line 390
    .line 391
    invoke-direct {v1, p0, p1, v4}, La/kq4;-><init>(La/v8;La/cp;B)V

    .line 392
    .line 393
    .line 394
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 395
    .line 396
    .line 397
    new-instance p0, La/j9;

    .line 398
    .line 399
    const/16 v0, 0x1b

    .line 400
    .line 401
    invoke-direct {p0, p1, v0}, La/j9;-><init>(La/cp;B)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 405
    .line 406
    .line 407
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 408
    .line 409
    return-object p0

    .line 410
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 414
    .line 415
    check-cast v0, La/zvx;

    .line 416
    .line 417
    iget-object v0, v0, La/zvx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 418
    .line 419
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    new-instance v1, La/kq4;

    .line 423
    .line 424
    const/4 v2, 0x0

    .line 425
    invoke-direct {v1, p0, p1, v2}, La/kq4;-><init>(La/v8;La/cp;B)V

    .line 426
    .line 427
    .line 428
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 429
    .line 430
    .line 431
    new-instance p0, La/j9;

    .line 432
    .line 433
    const/16 v0, 0x19

    .line 434
    .line 435
    invoke-direct {p0, p1, v0}, La/j9;-><init>(La/cp;B)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 439
    .line 440
    .line 441
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 442
    .line 443
    return-object p0

    .line 444
    nop

    .line 445
    :pswitch_data_0
    .packed-switch 0x0
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
