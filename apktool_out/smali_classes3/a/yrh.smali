.class public final La/yrh;
.super La/fhe0;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:I

.field public c:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/yrh;->a:B

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput p1, p0, La/yrh;->b:I

    return-void
.end method

.method public synthetic constructor <init>(IIB)V
    .locals 0

    .line 69
    iput-byte p3, p0, La/yrh;->a:B

    iput p1, p0, La/yrh;->b:I

    iput p2, p0, La/yrh;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;B)V
    .locals 2

    .line 1
    iput-byte p2, p0, La/yrh;->a:B

    .line 2
    .line 3
    const v0, 0x7f07072d

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    packed-switch p2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const v1, 0x7f0704be

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iput p2, p0, La/yrh;->b:I

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iput p1, p0, La/yrh;->c:I

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    iput p2, p0, La/yrh;->b:I

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const p2, 0x7f070717

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput p1, p0, La/yrh;->c:I

    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1

    const/4 v0, 0x4

    iput-byte v0, p0, La/yrh;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f0706f8

    .line 71
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, La/yrh;->b:I

    const v0, 0x7f07072d

    .line 72
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    iput p1, p0, La/yrh;->c:I

    return-void
.end method


# virtual methods
.method public final f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 6

    .line 1
    iget-byte v0, p0, La/yrh;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, -0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    iget v5, p0, La/yrh;->b:I

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
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
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->V(Landroid/view/View;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-nez p2, :cond_0

    .line 26
    .line 27
    iput v5, p1, Landroid/graphics/Rect;->top:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget p0, p0, La/yrh;->c:I

    .line 31
    .line 32
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    :goto_0
    return-void

    .line 35
    :pswitch_0
    iget p0, p0, La/yrh;->c:I

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 47
    .line 48
    .line 49
    move-result p4

    .line 50
    if-ne p4, v3, :cond_1

    .line 51
    .line 52
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->V(Landroid/view/View;)I

    .line 53
    .line 54
    .line 55
    move-result p4

    .line 56
    :cond_1
    if-ne p4, v3, :cond_2

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_2
    rem-int p2, p4, p0

    .line 60
    .line 61
    invoke-virtual {p3}, Landroid/view/View;->getLayoutDirection()I

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    if-nez p3, :cond_3

    .line 66
    .line 67
    move v1, v2

    .line 68
    :cond_3
    mul-int p3, p2, v5

    .line 69
    .line 70
    div-int/2addr p3, p0

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    iput p3, p1, Landroid/graphics/Rect;->left:I

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    iput p3, p1, Landroid/graphics/Rect;->right:I

    .line 77
    .line 78
    :goto_1
    add-int/2addr p2, v2

    .line 79
    mul-int/2addr p2, v5

    .line 80
    div-int/2addr p2, p0

    .line 81
    sub-int p2, v5, p2

    .line 82
    .line 83
    if-eqz v1, :cond_5

    .line 84
    .line 85
    iput p2, p1, Landroid/graphics/Rect;->right:I

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_5
    iput p2, p1, Landroid/graphics/Rect;->left:I

    .line 89
    .line 90
    :goto_2
    if-lt p4, p0, :cond_6

    .line 91
    .line 92
    iput v5, p1, Landroid/graphics/Rect;->top:I

    .line 93
    .line 94
    :cond_6
    :goto_3
    return-void

    .line 95
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 105
    .line 106
    .line 107
    move-result p4

    .line 108
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->W(Landroid/view/View;)La/xhe0;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    instance-of p3, p2, La/cp;

    .line 113
    .line 114
    if-eqz p3, :cond_7

    .line 115
    .line 116
    check-cast p2, La/cp;

    .line 117
    .line 118
    invoke-virtual {p2}, La/cp;->u()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    :cond_7
    instance-of p2, v4, La/zvi0;

    .line 123
    .line 124
    if-eqz p2, :cond_9

    .line 125
    .line 126
    if-nez p4, :cond_8

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_8
    iget v5, p0, La/yrh;->c:I

    .line 130
    .line 131
    :goto_4
    iput v5, p1, Landroid/graphics/Rect;->top:I

    .line 132
    .line 133
    :cond_9
    return-void

    .line 134
    :pswitch_2
    iget p0, p0, La/yrh;->c:I

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->W(Landroid/view/View;)La/xhe0;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    instance-of p4, p2, La/cp;

    .line 150
    .line 151
    if-eqz p4, :cond_a

    .line 152
    .line 153
    check-cast p2, La/cp;

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_a
    move-object p2, v4

    .line 157
    :goto_5
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    instance-of p4, p3, La/zz3;

    .line 162
    .line 163
    if-eqz p4, :cond_b

    .line 164
    .line 165
    move-object v4, p3

    .line 166
    check-cast v4, La/zz3;

    .line 167
    .line 168
    :cond_b
    if-eqz p2, :cond_e

    .line 169
    .line 170
    if-nez v4, :cond_c

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_c
    invoke-virtual {p2}, La/cp;->u()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    instance-of p2, p2, La/ghj;

    .line 178
    .line 179
    if-eqz p2, :cond_d

    .line 180
    .line 181
    iput v5, p1, Landroid/graphics/Rect;->left:I

    .line 182
    .line 183
    iput v5, p1, Landroid/graphics/Rect;->right:I

    .line 184
    .line 185
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 186
    .line 187
    iput v1, p1, Landroid/graphics/Rect;->bottom:I

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_d
    iput p0, p1, Landroid/graphics/Rect;->left:I

    .line 191
    .line 192
    iput p0, p1, Landroid/graphics/Rect;->right:I

    .line 193
    .line 194
    iput v1, p1, Landroid/graphics/Rect;->top:I

    .line 195
    .line 196
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 197
    .line 198
    :cond_e
    :goto_6
    return-void

    .line 199
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-ne v0, v3, :cond_f

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_f
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 216
    .line 217
    .line 218
    move-result-object p3

    .line 219
    instance-of v0, p3, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 220
    .line 221
    if-eqz v0, :cond_10

    .line 222
    .line 223
    move-object v4, p3

    .line 224
    check-cast v4, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 225
    .line 226
    :cond_10
    if-eqz v4, :cond_11

    .line 227
    .line 228
    iget v2, v4, Landroidx/recyclerview/widget/GridLayoutManager;->h1:I

    .line 229
    .line 230
    :cond_11
    invoke-virtual {p4}, La/the0;->b()I

    .line 231
    .line 232
    .line 233
    move-result p3

    .line 234
    sub-int/2addr p3, v2

    .line 235
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 236
    .line 237
    .line 238
    move-result p2

    .line 239
    if-lt p2, p3, :cond_12

    .line 240
    .line 241
    iget p0, p0, La/yrh;->c:I

    .line 242
    .line 243
    add-int/2addr v5, p0

    .line 244
    iput v5, p1, Landroid/graphics/Rect;->bottom:I

    .line 245
    .line 246
    :cond_12
    :goto_7
    return-void

    .line 247
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iput v5, p1, Landroid/graphics/Rect;->left:I

    .line 257
    .line 258
    iget p0, p0, La/yrh;->c:I

    .line 259
    .line 260
    iput p0, p1, Landroid/graphics/Rect;->right:I

    .line 261
    .line 262
    return-void

    .line 263
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->W(Landroid/view/View;)La/xhe0;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    instance-of p2, p1, La/cp;

    .line 277
    .line 278
    if-eqz p2, :cond_13

    .line 279
    .line 280
    move-object v4, p1

    .line 281
    check-cast v4, La/cp;

    .line 282
    .line 283
    :cond_13
    if-nez v4, :cond_14

    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_14
    invoke-virtual {v4}, La/xhe0;->d()I

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    if-eqz p1, :cond_16

    .line 291
    .line 292
    invoke-virtual {v4}, La/cp;->u()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    instance-of p2, p1, La/de7;

    .line 297
    .line 298
    if-eqz p2, :cond_15

    .line 299
    .line 300
    check-cast p1, La/de7;

    .line 301
    .line 302
    iget-object p1, p1, La/de7;->f:La/zq20;

    .line 303
    .line 304
    invoke-virtual {p0, v4, p1}, La/yrh;->i(La/cp;La/zq20;)V

    .line 305
    .line 306
    .line 307
    goto :goto_8

    .line 308
    :cond_15
    instance-of p2, p1, La/ah;

    .line 309
    .line 310
    if-eqz p2, :cond_16

    .line 311
    .line 312
    check-cast p1, La/ah;

    .line 313
    .line 314
    iget-object p1, p1, La/ah;->d:La/zq20;

    .line 315
    .line 316
    invoke-virtual {p0, v4, p1}, La/yrh;->i(La/cp;La/zq20;)V

    .line 317
    .line 318
    .line 319
    :cond_16
    :goto_8
    return-void

    .line 320
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->W(Landroid/view/View;)La/xhe0;

    .line 330
    .line 331
    .line 332
    move-result-object p2

    .line 333
    instance-of p4, p2, La/cp;

    .line 334
    .line 335
    if-eqz p4, :cond_17

    .line 336
    .line 337
    check-cast p2, La/cp;

    .line 338
    .line 339
    goto :goto_9

    .line 340
    :cond_17
    move-object p2, v4

    .line 341
    :goto_9
    if-nez p2, :cond_18

    .line 342
    .line 343
    goto :goto_c

    .line 344
    :cond_18
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 345
    .line 346
    .line 347
    move-result-object p3

    .line 348
    instance-of p4, p3, La/zz3;

    .line 349
    .line 350
    if-eqz p4, :cond_19

    .line 351
    .line 352
    check-cast p3, La/zz3;

    .line 353
    .line 354
    goto :goto_a

    .line 355
    :cond_19
    move-object p3, v4

    .line 356
    :goto_a
    invoke-virtual {p2}, La/xhe0;->d()I

    .line 357
    .line 358
    .line 359
    move-result p4

    .line 360
    if-nez p4, :cond_1a

    .line 361
    .line 362
    goto :goto_c

    .line 363
    :cond_1a
    if-eqz p3, :cond_1b

    .line 364
    .line 365
    invoke-virtual {p3}, La/zz3;->z()Ljava/util/List;

    .line 366
    .line 367
    .line 368
    move-result-object p3

    .line 369
    if-eqz p3, :cond_1b

    .line 370
    .line 371
    invoke-virtual {p2}, La/xhe0;->d()I

    .line 372
    .line 373
    .line 374
    move-result p4

    .line 375
    add-int/2addr p4, v3

    .line 376
    invoke-static {p4, p3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    :cond_1b
    invoke-virtual {p2}, La/cp;->u()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object p3

    .line 384
    instance-of p3, p3, La/n8s0;

    .line 385
    .line 386
    if-nez p3, :cond_1c

    .line 387
    .line 388
    invoke-virtual {p2}, La/cp;->u()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object p3

    .line 392
    instance-of p3, p3, La/wmh0;

    .line 393
    .line 394
    if-nez p3, :cond_1c

    .line 395
    .line 396
    iput v5, p1, Landroid/graphics/Rect;->left:I

    .line 397
    .line 398
    iput v5, p1, Landroid/graphics/Rect;->right:I

    .line 399
    .line 400
    :cond_1c
    invoke-virtual {p2}, La/cp;->u()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object p3

    .line 404
    instance-of p3, p3, La/o5s0;

    .line 405
    .line 406
    if-eqz p3, :cond_1d

    .line 407
    .line 408
    instance-of p3, v4, La/o5s0;

    .line 409
    .line 410
    if-eqz p3, :cond_1d

    .line 411
    .line 412
    goto :goto_b

    .line 413
    :cond_1d
    invoke-virtual {p2}, La/cp;->u()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object p3

    .line 417
    instance-of p3, p3, La/owr0;

    .line 418
    .line 419
    if-eqz p3, :cond_1e

    .line 420
    .line 421
    instance-of p3, v4, La/owr0;

    .line 422
    .line 423
    if-eqz p3, :cond_1e

    .line 424
    .line 425
    goto :goto_b

    .line 426
    :cond_1e
    invoke-virtual {p2}, La/cp;->u()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object p2

    .line 430
    instance-of p2, p2, La/wmh0;

    .line 431
    .line 432
    if-eqz p2, :cond_1f

    .line 433
    .line 434
    :goto_b
    iget p0, p0, La/yrh;->c:I

    .line 435
    .line 436
    iput p0, p1, Landroid/graphics/Rect;->top:I

    .line 437
    .line 438
    :cond_1f
    :goto_c
    return-void

    .line 439
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(La/cp;La/zq20;)V
    .locals 3

    .line 1
    iget-object p1, p1, La/xhe0;->a:Landroid/view/View;

    .line 2
    .line 3
    iget v0, p0, La/yrh;->c:I

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 v1, 0x0

    .line 10
    iget p0, p0, La/yrh;->b:I

    .line 11
    .line 12
    if-eqz p2, :cond_4

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq p2, v2, :cond_3

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-eq p2, v2, :cond_2

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    if-eq p2, v0, :cond_1

    .line 22
    .line 23
    const/4 p0, 0x4

    .line 24
    if-ne p2, p0, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-virtual {p1, p0, v1, p0, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    invoke-virtual {p1, v0, v1, p0, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_3
    invoke-virtual {p1, v0, v1, v0, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_4
    invoke-virtual {p1, p0, v1, v0, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
