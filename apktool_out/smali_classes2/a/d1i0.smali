.class public final synthetic La/d1i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/d1i0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/d1i0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte p0, p0, La/d1i0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Landroid/view/LayoutInflater;

    .line 9
    .line 10
    check-cast p2, Landroid/view/ViewGroup;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p1, p2}, La/djj0;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/djj0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 24
    .line 25
    check-cast p2, Ljava/lang/String;

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 31
    .line 32
    check-cast p2, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_2
    check-cast p1, La/fet;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, La/x8x;->L(I)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-static {p0, p1}, La/i4w0;->x(ILa/fet;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_3
    check-cast p1, La/sgy;

    .line 61
    .line 62
    check-cast p2, Ljava/util/List;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sget-object p0, La/qhi0;->a:La/qaj;

    .line 71
    .line 72
    invoke-static {p0, p2, v1}, La/n6x;->e0(La/qaj;Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance v1, La/awj;

    .line 80
    .line 81
    const/4 v2, 0x4

    .line 82
    invoke-direct {v1, p2, v2}, La/awj;-><init>(Ljava/util/List;B)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1, p0, v1}, La/n6x;->J(La/sgy;Ljava/util/List;Lkotlin/jvm/functions/Function0;)La/jiy;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-eqz p0, :cond_0

    .line 90
    .line 91
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    :cond_0
    return-object v0

    .line 96
    :pswitch_4
    check-cast p1, La/sgy;

    .line 97
    .line 98
    check-cast p2, Ljava/util/List;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    sget-object p0, La/qhi0;->a:La/qaj;

    .line 107
    .line 108
    invoke-static {p0, p2, v1}, La/n6x;->e0(La/qaj;Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v0, La/awj;

    .line 116
    .line 117
    const/4 v1, 0x3

    .line 118
    invoke-direct {v0, p2, v1}, La/awj;-><init>(Ljava/util/List;B)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1, p0, v0}, La/n6x;->J(La/sgy;Ljava/util/List;Lkotlin/jvm/functions/Function0;)La/jiy;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0

    .line 126
    :pswitch_5
    check-cast p1, La/tai0;

    .line 127
    .line 128
    check-cast p2, La/tai0;

    .line 129
    .line 130
    const/4 p0, 0x0

    .line 131
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iget-object p1, p1, La/tai0;->d:La/nai0;

    .line 136
    .line 137
    sget-object v0, La/xai0;->u:La/zai0;

    .line 138
    .line 139
    iget-object p1, p1, La/nai0;->a:La/hz40;

    .line 140
    .line 141
    invoke-virtual {p1, v0}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-nez p1, :cond_1

    .line 146
    .line 147
    move-object p1, p0

    .line 148
    :cond_1
    check-cast p1, Ljava/lang/Number;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    iget-object p2, p2, La/tai0;->d:La/nai0;

    .line 155
    .line 156
    iget-object p2, p2, La/nai0;->a:La/hz40;

    .line 157
    .line 158
    invoke-virtual {p2, v0}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    if-nez p2, :cond_2

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_2
    move-object p0, p2

    .line 166
    :goto_0
    check-cast p0, Ljava/lang/Number;

    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    invoke-static {p1, p0}, Ljava/lang/Float;->compare(FF)I

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :pswitch_6
    if-nez p1, :cond_3

    .line 182
    .line 183
    move-object p1, p2

    .line 184
    :cond_3
    return-object p1

    .line 185
    :pswitch_7
    if-nez p1, :cond_4

    .line 186
    .line 187
    if-nez p2, :cond_4

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_4
    invoke-static {}, La/hny;->b()V

    .line 191
    .line 192
    .line 193
    :goto_1
    return-object v0

    .line 194
    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    .line 195
    .line 196
    check-cast p2, Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    return-object p1

    .line 202
    :pswitch_9
    check-cast p1, La/ez2;

    .line 203
    .line 204
    check-cast p2, La/ez2;

    .line 205
    .line 206
    return-object p1

    .line 207
    :pswitch_a
    check-cast p1, La/jy2;

    .line 208
    .line 209
    check-cast p2, La/jy2;

    .line 210
    .line 211
    return-object p1

    .line 212
    :pswitch_b
    check-cast p1, La/oie;

    .line 213
    .line 214
    check-cast p2, La/oie;

    .line 215
    .line 216
    return-object p1

    .line 217
    :pswitch_c
    check-cast p1, Ljava/lang/String;

    .line 218
    .line 219
    check-cast p2, Ljava/lang/String;

    .line 220
    .line 221
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 222
    .line 223
    const-string p1, "merge function called on unmergeable property PaneTitle."

    .line 224
    .line 225
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw p0

    .line 229
    :pswitch_d
    check-cast p1, La/yjj0;

    .line 230
    .line 231
    check-cast p2, La/yjj0;

    .line 232
    .line 233
    return-object p1

    .line 234
    :pswitch_e
    check-cast p1, Ljava/util/List;

    .line 235
    .line 236
    check-cast p2, Ljava/util/List;

    .line 237
    .line 238
    if-eqz p1, :cond_5

    .line 239
    .line 240
    new-instance p0, Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 246
    .line 247
    .line 248
    move-object p2, p0

    .line 249
    :cond_5
    return-object p2

    .line 250
    :pswitch_f
    check-cast p1, Lkotlin/Unit;

    .line 251
    .line 252
    check-cast p2, Lkotlin/Unit;

    .line 253
    .line 254
    return-object p1

    .line 255
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 256
    .line 257
    check-cast p2, Ljava/lang/String;

    .line 258
    .line 259
    return-object p1

    .line 260
    :pswitch_11
    check-cast p1, La/ucg0;

    .line 261
    .line 262
    check-cast p2, La/ucg0;

    .line 263
    .line 264
    return-object p1

    .line 265
    :pswitch_12
    check-cast p1, Lkotlin/Unit;

    .line 266
    .line 267
    check-cast p2, Lkotlin/Unit;

    .line 268
    .line 269
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 270
    .line 271
    const-string p1, "merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node."

    .line 272
    .line 273
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw p0

    .line 277
    :pswitch_13
    check-cast p1, Lkotlin/Unit;

    .line 278
    .line 279
    check-cast p2, Lkotlin/Unit;

    .line 280
    .line 281
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 282
    .line 283
    const-string p1, "merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node."

    .line 284
    .line 285
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw p0

    .line 289
    :pswitch_14
    check-cast p1, Ljava/lang/Float;

    .line 290
    .line 291
    check-cast p2, Ljava/lang/Float;

    .line 292
    .line 293
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    return-object p1

    .line 297
    :pswitch_15
    check-cast p1, Ljava/util/List;

    .line 298
    .line 299
    check-cast p2, Ljava/util/List;

    .line 300
    .line 301
    if-eqz p1, :cond_6

    .line 302
    .line 303
    new-instance p0, Ljava/util/ArrayList;

    .line 304
    .line 305
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 309
    .line 310
    .line 311
    move-object p2, p0

    .line 312
    :cond_6
    return-object p2

    .line 313
    :pswitch_16
    check-cast p1, Ljava/util/List;

    .line 314
    .line 315
    check-cast p2, Ljava/util/List;

    .line 316
    .line 317
    if-nez p1, :cond_7

    .line 318
    .line 319
    sget-object p1, La/iun;->a:La/iun;

    .line 320
    .line 321
    :cond_7
    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    return-object p0

    .line 326
    :pswitch_17
    check-cast p1, Ljava/lang/Throwable;

    .line 327
    .line 328
    check-cast p2, Ljava/lang/String;

    .line 329
    .line 330
    invoke-static {p2, p1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 331
    .line 332
    .line 333
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    return-object p0

    .line 336
    :pswitch_18
    check-cast p1, Ljava/lang/Throwable;

    .line 337
    .line 338
    check-cast p2, Ljava/lang/String;

    .line 339
    .line 340
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 347
    .line 348
    return-object p0

    .line 349
    :pswitch_19
    check-cast p1, La/fet;

    .line 350
    .line 351
    check-cast p2, Ljava/lang/Integer;

    .line 352
    .line 353
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-static {v1}, La/x8x;->L(I)I

    .line 357
    .line 358
    .line 359
    move-result p0

    .line 360
    invoke-static {p0, p1}, La/f1t0;->z(ILa/fet;)V

    .line 361
    .line 362
    .line 363
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    return-object p0

    .line 366
    :pswitch_1a
    check-cast p1, La/fet;

    .line 367
    .line 368
    check-cast p2, Ljava/lang/Integer;

    .line 369
    .line 370
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-static {v1}, La/x8x;->L(I)I

    .line 374
    .line 375
    .line 376
    move-result p0

    .line 377
    invoke-static {p0, p1}, La/cwr0;->t(ILa/fet;)V

    .line 378
    .line 379
    .line 380
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    return-object p0

    .line 383
    :pswitch_1b
    check-cast p1, Ljava/lang/Throwable;

    .line 384
    .line 385
    check-cast p2, Ljava/lang/String;

    .line 386
    .line 387
    invoke-static {p2, p1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 388
    .line 389
    .line 390
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 391
    .line 392
    return-object p0

    .line 393
    :pswitch_1c
    check-cast p1, Ljava/lang/Throwable;

    .line 394
    .line 395
    check-cast p2, Ljava/lang/String;

    .line 396
    .line 397
    invoke-static {p2, p1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 398
    .line 399
    .line 400
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 401
    .line 402
    return-object p0

    .line 403
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
