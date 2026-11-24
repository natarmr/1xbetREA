.class public final La/qkv;
.super La/fhe0;
.source "SourceFile"


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 15
    iput-byte p1, p0, La/qkv;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/datepicker/e;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-byte p1, p0, La/qkv;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    invoke-static {p0}, La/ett0;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, La/ett0;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/qkv;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :pswitch_0
    invoke-super {p0, p1, p2, p3, p4}, La/fhe0;->f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->W(Landroid/view/View;)La/xhe0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    instance-of p1, p0, La/cp;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    check-cast p0, La/cp;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object p0, v3

    .line 34
    :goto_0
    if-nez p0, :cond_1

    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    .line 38
    :cond_1
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 39
    .line 40
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    instance-of p1, p1, La/zz3;

    .line 45
    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :cond_2
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    check-cast p2, La/dzi0;

    .line 62
    .line 63
    iget-object p2, p2, La/zz3;->e:La/yz3;

    .line 64
    .line 65
    iget-object p2, p2, La/yz3;->f:Ljava/util/List;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    add-int/lit8 p4, p1, -0x1

    .line 71
    .line 72
    invoke-static {p4, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    instance-of p2, p2, La/ssv;

    .line 77
    .line 78
    if-nez p2, :cond_4

    .line 79
    .line 80
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    check-cast p2, La/dzi0;

    .line 88
    .line 89
    iget-object p2, p2, La/zz3;->e:La/yz3;

    .line 90
    .line 91
    iget-object p2, p2, La/yz3;->f:Ljava/util/List;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {p4, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    instance-of p2, p2, La/rrv;

    .line 101
    .line 102
    if-eqz p2, :cond_3

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    move p2, v2

    .line 106
    goto :goto_2

    .line 107
    :cond_4
    :goto_1
    move p2, v1

    .line 108
    :goto_2
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 109
    .line 110
    .line 111
    move-result-object p4

    .line 112
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    check-cast p4, La/dzi0;

    .line 116
    .line 117
    iget-object p4, p4, La/zz3;->e:La/yz3;

    .line 118
    .line 119
    iget-object p4, p4, La/yz3;->f:Ljava/util/List;

    .line 120
    .line 121
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    add-int/2addr p1, v1

    .line 125
    invoke-static {p1, p4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p4

    .line 129
    instance-of p4, p4, La/ssv;

    .line 130
    .line 131
    if-nez p4, :cond_6

    .line 132
    .line 133
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 134
    .line 135
    .line 136
    move-result-object p4

    .line 137
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    check-cast p4, La/dzi0;

    .line 141
    .line 142
    iget-object p4, p4, La/zz3;->e:La/yz3;

    .line 143
    .line 144
    iget-object p4, p4, La/yz3;->f:Ljava/util/List;

    .line 145
    .line 146
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-static {p1, p4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p4

    .line 153
    instance-of p4, p4, La/rrv;

    .line 154
    .line 155
    if-nez p4, :cond_6

    .line 156
    .line 157
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    if-eqz p3, :cond_5

    .line 162
    .line 163
    invoke-virtual {p3}, La/yge0;->d()I

    .line 164
    .line 165
    .line 166
    move-result p3

    .line 167
    if-ne p1, p3, :cond_5

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_5
    move p1, v2

    .line 171
    goto :goto_4

    .line 172
    :cond_6
    :goto_3
    move p1, v1

    .line 173
    :goto_4
    invoke-interface {p0}, La/yfu0;->getRoot()Landroid/view/View;

    .line 174
    .line 175
    .line 176
    move-result-object p3

    .line 177
    instance-of p4, p3, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 178
    .line 179
    if-eqz p4, :cond_7

    .line 180
    .line 181
    check-cast p3, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_7
    move-object p3, v3

    .line 185
    :goto_5
    if-nez p3, :cond_a

    .line 186
    .line 187
    invoke-interface {p0}, La/yfu0;->getRoot()Landroid/view/View;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    instance-of p3, p0, Lorg/xplatform/uikit/components/cells/DsShimmerCell;

    .line 192
    .line 193
    if-eqz p3, :cond_8

    .line 194
    .line 195
    move-object v3, p0

    .line 196
    check-cast v3, Lorg/xplatform/uikit/components/cells/DsShimmerCell;

    .line 197
    .line 198
    :cond_8
    if-nez v3, :cond_9

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_9
    move-object p3, v3

    .line 202
    :cond_a
    if-eqz p2, :cond_b

    .line 203
    .line 204
    if-eqz p1, :cond_b

    .line 205
    .line 206
    invoke-interface {p3, v1}, La/x8b;->setFirst(Z)V

    .line 207
    .line 208
    .line 209
    invoke-interface {p3, v1}, La/x8b;->setLast(Z)V

    .line 210
    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_b
    if-eqz p2, :cond_c

    .line 214
    .line 215
    invoke-interface {p3, v1}, La/x8b;->setFirst(Z)V

    .line 216
    .line 217
    .line 218
    invoke-interface {p3, v2}, La/x8b;->setLast(Z)V

    .line 219
    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_c
    if-eqz p1, :cond_d

    .line 223
    .line 224
    invoke-interface {p3, v2}, La/x8b;->setFirst(Z)V

    .line 225
    .line 226
    .line 227
    invoke-interface {p3, v1}, La/x8b;->setLast(Z)V

    .line 228
    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_d
    invoke-interface {p3, v2}, La/x8b;->setFirst(Z)V

    .line 232
    .line 233
    .line 234
    invoke-interface {p3, v2}, La/x8b;->setLast(Z)V

    .line 235
    .line 236
    .line 237
    :goto_6
    return-void

    .line 238
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->W(Landroid/view/View;)La/xhe0;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    instance-of p1, p0, La/cp;

    .line 252
    .line 253
    if-eqz p1, :cond_e

    .line 254
    .line 255
    check-cast p0, La/cp;

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_e
    move-object p0, v3

    .line 259
    :goto_7
    if-nez p0, :cond_f

    .line 260
    .line 261
    goto/16 :goto_a

    .line 262
    .line 263
    :cond_f
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    instance-of p1, p1, La/zz3;

    .line 268
    .line 269
    if-nez p1, :cond_10

    .line 270
    .line 271
    goto/16 :goto_a

    .line 272
    .line 273
    :cond_10
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    check-cast p2, La/hkv;

    .line 285
    .line 286
    iget-object p2, p2, La/zz3;->e:La/yz3;

    .line 287
    .line 288
    iget-object p2, p2, La/yz3;->f:Ljava/util/List;

    .line 289
    .line 290
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object p2

    .line 297
    :cond_11
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result p4

    .line 301
    if-eqz p4, :cond_12

    .line 302
    .line 303
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object p4

    .line 307
    move-object v0, p4

    .line 308
    check-cast v0, La/p6t0;

    .line 309
    .line 310
    instance-of v0, v0, La/vkv;

    .line 311
    .line 312
    if-eqz v0, :cond_11

    .line 313
    .line 314
    goto :goto_8

    .line 315
    :cond_12
    move-object p4, v3

    .line 316
    :goto_8
    check-cast p4, La/p6t0;

    .line 317
    .line 318
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 319
    .line 320
    .line 321
    move-result-object p2

    .line 322
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    check-cast p2, La/hkv;

    .line 326
    .line 327
    iget-object p2, p2, La/zz3;->e:La/yz3;

    .line 328
    .line 329
    iget-object p2, p2, La/yz3;->f:Ljava/util/List;

    .line 330
    .line 331
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p2

    .line 338
    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result p2

    .line 342
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 343
    .line 344
    .line 345
    move-result-object p3

    .line 346
    if-eqz p3, :cond_13

    .line 347
    .line 348
    add-int/2addr p1, v1

    .line 349
    invoke-virtual {p3}, La/yge0;->d()I

    .line 350
    .line 351
    .line 352
    move-result p3

    .line 353
    if-ne p1, p3, :cond_13

    .line 354
    .line 355
    move p1, v1

    .line 356
    goto :goto_9

    .line 357
    :cond_13
    move p1, v2

    .line 358
    :goto_9
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 359
    .line 360
    invoke-interface {p0}, La/yfu0;->getRoot()Landroid/view/View;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    instance-of p3, p0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 365
    .line 366
    if-eqz p3, :cond_14

    .line 367
    .line 368
    move-object v3, p0

    .line 369
    check-cast v3, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 370
    .line 371
    :cond_14
    if-nez v3, :cond_15

    .line 372
    .line 373
    goto :goto_a

    .line 374
    :cond_15
    if-eqz p2, :cond_16

    .line 375
    .line 376
    if-eqz p1, :cond_16

    .line 377
    .line 378
    invoke-virtual {v3, v1}, La/tw5;->setFirst(Z)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v3, v1}, La/tw5;->setLast(Z)V

    .line 382
    .line 383
    .line 384
    goto :goto_a

    .line 385
    :cond_16
    if-eqz p2, :cond_17

    .line 386
    .line 387
    invoke-virtual {v3, v1}, La/tw5;->setFirst(Z)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3, v2}, La/tw5;->setLast(Z)V

    .line 391
    .line 392
    .line 393
    goto :goto_a

    .line 394
    :cond_17
    if-eqz p1, :cond_18

    .line 395
    .line 396
    invoke-virtual {v3, v2}, La/tw5;->setFirst(Z)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v3, v1}, La/tw5;->setLast(Z)V

    .line 400
    .line 401
    .line 402
    goto :goto_a

    .line 403
    :cond_18
    invoke-virtual {v3, v2}, La/tw5;->setFirst(Z)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v3, v2}, La/tw5;->setLast(Z)V

    .line 407
    .line 408
    .line 409
    :goto_a
    return-void

    .line 410
    nop

    .line 411
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public g(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/qkv;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    instance-of p0, p0, Lcom/google/android/material/datepicker/j;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    instance-of p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lcom/google/android/material/datepicker/j;

    .line 29
    .line 30
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0

    .line 38
    :cond_1
    :goto_0
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
