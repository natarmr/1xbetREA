.class public final Lorg/xplatform/uikit/components/text_field/DsTextField;
.super La/jrx;
.source "SourceFile"


# static fields
.field public static final synthetic m1:I


# instance fields
.field public final A:La/h5i;

.field public final B:Lorg/xplatform/uikit/components/text_field/middle/b;

.field public final a:Z

.field public b:Landroid/animation/AnimatorSet;

.field public final c:Landroid/view/animation/LinearInterpolator;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final f1:La/u4i;

.field public final g:I

.field public final g1:La/j5i;

.field public final h:I

.field public final h1:La/d5i;

.field public final i:I

.field public final i1:Landroid/view/View;

.field public final j:I

.field public final j1:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

.field public final k:I

.field public final k1:La/f5i;

.field public final l:I

.field public final l1:La/t4i;

.field public final m:I

.field public final n:I

.field public final o:I

.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:I

.field public final u:I

.field public final v:I

.field public final w:I

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1006
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1005
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0xc

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    const v2, 0x7f140860

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p2, p3, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x1

    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    move v3, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v3, p3

    .line 35
    :goto_0
    iput-boolean v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->a:Z

    .line 36
    .line 37
    new-instance v3, Landroid/view/animation/LinearInterpolator;

    .line 38
    .line 39
    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->c:Landroid/view/animation/LinearInterpolator;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const v5, 0x7f07064b

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    iput v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->d:I

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    const v6, 0x7f07063e

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    iput v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->e:I

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    iput v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f:I

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const v6, 0x7f070717

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    iput v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g:I

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    iput v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h:I

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    iput v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->i:I

    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    const v7, 0x7f070640

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    iput v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->j:I

    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const v7, 0x7f07072d

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    iput v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k:I

    .line 138
    .line 139
    sget-object v3, La/i5i;->a:La/kud;

    .line 140
    .line 141
    new-instance v3, La/t4i;

    .line 142
    .line 143
    invoke-direct {v3, p1}, La/t4i;-><init>(Landroid/content/Context;)V

    .line 144
    .line 145
    .line 146
    iput-object v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->l1:La/t4i;

    .line 147
    .line 148
    invoke-virtual {p0, v4}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 149
    .line 150
    .line 151
    sget-object v8, La/bqd0;->G:[I

    .line 152
    .line 153
    invoke-virtual {p1, p2, v8, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    sget-object p2, La/i5i;->a:La/kud;

    .line 158
    .line 159
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-static {p1}, La/kud;->c(Landroid/content/res/TypedArray;)La/i5i;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    const/16 v2, 0x21

    .line 167
    .line 168
    invoke-virtual {p1, v2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_2

    .line 173
    .line 174
    move v2, v4

    .line 175
    goto :goto_1

    .line 176
    :cond_2
    move v2, p3

    .line 177
    :goto_1
    const/16 v8, 0xe

    .line 178
    .line 179
    iget-boolean v9, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->x:Z

    .line 180
    .line 181
    invoke-virtual {p1, v8, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    iput-boolean v8, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->x:Z

    .line 186
    .line 187
    sget-object v8, La/i5i;->c:La/i5i;

    .line 188
    .line 189
    if-ne p2, v8, :cond_3

    .line 190
    .line 191
    const/16 v8, 0xc

    .line 192
    .line 193
    iget-boolean v9, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->z:Z

    .line 194
    .line 195
    invoke-virtual {p1, v8, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 196
    .line 197
    .line 198
    move-result v8

    .line 199
    iput-boolean v8, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->z:Z

    .line 200
    .line 201
    :cond_3
    if-eqz v2, :cond_4

    .line 202
    .line 203
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    invoke-virtual {v8, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 208
    .line 209
    .line 210
    move-result v8

    .line 211
    goto :goto_2

    .line 212
    :cond_4
    move v8, p3

    .line 213
    :goto_2
    iput v8, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->l:I

    .line 214
    .line 215
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 216
    .line 217
    .line 218
    move-result p2

    .line 219
    if-eqz p2, :cond_7

    .line 220
    .line 221
    if-ne p2, v4, :cond_6

    .line 222
    .line 223
    const p2, 0x7f0706ea

    .line 224
    .line 225
    .line 226
    if-eqz v2, :cond_5

    .line 227
    .line 228
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    goto :goto_3

    .line 237
    :cond_5
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    invoke-virtual {v6, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    :goto_3
    iput v6, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->m:I

    .line 246
    .line 247
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-virtual {v6, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    iput v6, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->n:I

    .line 256
    .line 257
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    iput v6, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->o:I

    .line 266
    .line 267
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 268
    .line 269
    .line 270
    move-result-object v6

    .line 271
    invoke-virtual {v6, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 272
    .line 273
    .line 274
    move-result v6

    .line 275
    iput v6, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->p:I

    .line 276
    .line 277
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    invoke-virtual {v6, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    iput v6, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->q:I

    .line 286
    .line 287
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    invoke-virtual {v6, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    invoke-virtual {v6, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    iput v6, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->r:I

    .line 303
    .line 304
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    invoke-virtual {v6, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 309
    .line 310
    .line 311
    move-result p2

    .line 312
    iput p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->s:I

    .line 313
    .line 314
    iput p3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->t:I

    .line 315
    .line 316
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 317
    .line 318
    .line 319
    move-result-object p2

    .line 320
    const v6, 0x7f0706f8

    .line 321
    .line 322
    .line 323
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 324
    .line 325
    .line 326
    move-result p2

    .line 327
    iput p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->u:I

    .line 328
    .line 329
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 330
    .line 331
    .line 332
    move-result-object p2

    .line 333
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 334
    .line 335
    .line 336
    move-result p2

    .line 337
    iput p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->v:I

    .line 338
    .line 339
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 340
    .line 341
    .line 342
    move-result-object p2

    .line 343
    invoke-virtual {p2, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 344
    .line 345
    .line 346
    move-result p2

    .line 347
    iput p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->w:I

    .line 348
    .line 349
    goto :goto_5

    .line 350
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 351
    .line 352
    .line 353
    throw v1

    .line 354
    :cond_7
    if-nez v2, :cond_8

    .line 355
    .line 356
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 357
    .line 358
    .line 359
    move-result-object p2

    .line 360
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 361
    .line 362
    .line 363
    move-result p2

    .line 364
    goto :goto_4

    .line 365
    :cond_8
    move p2, p3

    .line 366
    :goto_4
    iput p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->m:I

    .line 367
    .line 368
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 369
    .line 370
    .line 371
    move-result-object p2

    .line 372
    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 373
    .line 374
    .line 375
    move-result p2

    .line 376
    iput p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->n:I

    .line 377
    .line 378
    iput p3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->o:I

    .line 379
    .line 380
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 381
    .line 382
    .line 383
    move-result-object p2

    .line 384
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 385
    .line 386
    .line 387
    move-result p2

    .line 388
    iput p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->p:I

    .line 389
    .line 390
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 391
    .line 392
    .line 393
    move-result-object p2

    .line 394
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 395
    .line 396
    .line 397
    move-result p2

    .line 398
    iput p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->q:I

    .line 399
    .line 400
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 401
    .line 402
    .line 403
    move-result-object p2

    .line 404
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 405
    .line 406
    .line 407
    move-result p2

    .line 408
    iput p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->r:I

    .line 409
    .line 410
    iput p3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->s:I

    .line 411
    .line 412
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 413
    .line 414
    .line 415
    move-result-object p2

    .line 416
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 417
    .line 418
    .line 419
    move-result p2

    .line 420
    iput p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->t:I

    .line 421
    .line 422
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 423
    .line 424
    .line 425
    move-result-object p2

    .line 426
    const v5, 0x7f070705

    .line 427
    .line 428
    .line 429
    invoke-virtual {p2, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 430
    .line 431
    .line 432
    move-result p2

    .line 433
    iput p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->u:I

    .line 434
    .line 435
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 436
    .line 437
    .line 438
    move-result-object p2

    .line 439
    const v5, 0x7f0706e2

    .line 440
    .line 441
    .line 442
    invoke-virtual {p2, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 443
    .line 444
    .line 445
    move-result p2

    .line 446
    iput p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->v:I

    .line 447
    .line 448
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 449
    .line 450
    .line 451
    move-result-object p2

    .line 452
    const v5, 0x7f070660

    .line 453
    .line 454
    .line 455
    invoke-virtual {p2, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 456
    .line 457
    .line 458
    move-result p2

    .line 459
    iput p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->w:I

    .line 460
    .line 461
    :goto_5
    new-instance p2, La/d5i;

    .line 462
    .line 463
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 464
    .line 465
    .line 466
    move-result-object v5

    .line 467
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    invoke-direct {p2, v5, v1, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 471
    .line 472
    .line 473
    const v6, 0x7f040b77

    .line 474
    .line 475
    .line 476
    invoke-static {v6, v5}, La/m5d;->b(ILandroid/content/Context;)I

    .line 477
    .line 478
    .line 479
    move-result v7

    .line 480
    iput v7, p2, La/d5i;->j:I

    .line 481
    .line 482
    const v7, 0x7f040b0b

    .line 483
    .line 484
    .line 485
    invoke-static {v7, v5}, La/m5d;->b(ILandroid/content/Context;)I

    .line 486
    .line 487
    .line 488
    move-result v5

    .line 489
    iput v5, p2, La/d5i;->k:I

    .line 490
    .line 491
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {p2, p3}, Landroid/view/View;->setEnabled(Z)V

    .line 495
    .line 496
    .line 497
    iput-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h1:La/d5i;

    .line 498
    .line 499
    invoke-virtual {p2, p1}, La/d5i;->e(Landroid/content/res/TypedArray;)V

    .line 500
    .line 501
    .line 502
    iget-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h1:La/d5i;

    .line 503
    .line 504
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 505
    .line 506
    .line 507
    new-instance p2, Landroid/view/View;

    .line 508
    .line 509
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    invoke-direct {p2, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 514
    .line 515
    .line 516
    iput-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->i1:Landroid/view/View;

    .line 517
    .line 518
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    invoke-static {v7, v5}, La/m5d;->b(ILandroid/content/Context;)I

    .line 526
    .line 527
    .line 528
    move-result v5

    .line 529
    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    invoke-static {p2, v5}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 534
    .line 535
    .line 536
    iget-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->i1:Landroid/view/View;

    .line 537
    .line 538
    if-eqz p2, :cond_9

    .line 539
    .line 540
    const/16 v5, 0x12

    .line 541
    .line 542
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 543
    .line 544
    .line 545
    move-result-object v5

    .line 546
    invoke-virtual {p2, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 547
    .line 548
    .line 549
    :cond_9
    iget-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->i1:Landroid/view/View;

    .line 550
    .line 551
    if-eqz p2, :cond_a

    .line 552
    .line 553
    const-string v5, "VipBetTestTag"

    .line 554
    .line 555
    invoke-virtual {p2, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    :cond_a
    iget-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->i1:Landroid/view/View;

    .line 559
    .line 560
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 561
    .line 562
    .line 563
    iget-boolean p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->y:Z

    .line 564
    .line 565
    const/16 v5, 0x14

    .line 566
    .line 567
    invoke-virtual {p1, v5, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 568
    .line 569
    .line 570
    move-result p2

    .line 571
    iput-boolean p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->y:Z

    .line 572
    .line 573
    new-instance p2, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 574
    .line 575
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 576
    .line 577
    .line 578
    move-result-object v8

    .line 579
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    const/4 v9, 0x6

    .line 583
    invoke-direct {p2, v8, v1, v9}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 584
    .line 585
    .line 586
    const v8, 0x7f0705c4

    .line 587
    .line 588
    .line 589
    invoke-static {p2, v8}, La/jmu0;->i(Landroid/view/View;I)V

    .line 590
    .line 591
    .line 592
    iput-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->j1:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 593
    .line 594
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 595
    .line 596
    .line 597
    iget-boolean p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->y:Z

    .line 598
    .line 599
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->g(Z)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v3, p1}, La/t4i;->e(Landroid/content/res/TypedArray;)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 606
    .line 607
    .line 608
    if-eqz v2, :cond_b

    .line 609
    .line 610
    new-instance p2, La/h5i;

    .line 611
    .line 612
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 617
    .line 618
    .line 619
    invoke-direct {p2, v2}, La/h5i;-><init>(Landroid/content/Context;)V

    .line 620
    .line 621
    .line 622
    iput-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->A:La/h5i;

    .line 623
    .line 624
    invoke-virtual {p2, p1}, La/h5i;->e(Landroid/content/res/TypedArray;)V

    .line 625
    .line 626
    .line 627
    iget-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->A:La/h5i;

    .line 628
    .line 629
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 633
    .line 634
    .line 635
    :cond_b
    new-instance p2, Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 636
    .line 637
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 642
    .line 643
    .line 644
    invoke-direct {p2, v2}, Lorg/xplatform/uikit/components/text_field/middle/b;-><init>(Landroid/content/Context;)V

    .line 645
    .line 646
    .line 647
    iput-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 648
    .line 649
    invoke-virtual {p2, p1}, Lorg/xplatform/uikit/components/text_field/middle/b;->e(Landroid/content/res/TypedArray;)V

    .line 650
    .line 651
    .line 652
    iget-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 653
    .line 654
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 658
    .line 659
    .line 660
    sget-object p2, La/b5i;->a:La/std;

    .line 661
    .line 662
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    invoke-static {p1}, La/std;->f(Landroid/content/res/TypedArray;)La/b5i;

    .line 666
    .line 667
    .line 668
    move-result-object p2

    .line 669
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 670
    .line 671
    .line 672
    move-result p2

    .line 673
    if-eqz p2, :cond_12

    .line 674
    .line 675
    if-eq p2, v4, :cond_11

    .line 676
    .line 677
    if-eq p2, v0, :cond_10

    .line 678
    .line 679
    const/4 v0, 0x3

    .line 680
    if-eq p2, v0, :cond_f

    .line 681
    .line 682
    const/4 v0, 0x4

    .line 683
    if-eq p2, v0, :cond_d

    .line 684
    .line 685
    const/4 v0, 0x5

    .line 686
    if-ne p2, v0, :cond_c

    .line 687
    .line 688
    move-object p2, v1

    .line 689
    goto :goto_6

    .line 690
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 691
    .line 692
    .line 693
    throw v1

    .line 694
    :cond_d
    new-instance p2, Lorg/xplatform/uikit/components/text_field/end/c;

    .line 695
    .line 696
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 701
    .line 702
    .line 703
    invoke-direct {p2, v0}, Lorg/xplatform/uikit/components/text_field/end/c;-><init>(Landroid/content/Context;)V

    .line 704
    .line 705
    .line 706
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 707
    .line 708
    if-eqz v0, :cond_e

    .line 709
    .line 710
    iget-boolean v2, p2, Lorg/xplatform/uikit/components/text_field/end/c;->a:Z

    .line 711
    .line 712
    xor-int/2addr v2, v4

    .line 713
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/text_field/middle/b;->h(Z)V

    .line 714
    .line 715
    .line 716
    :cond_e
    new-instance v0, La/c7n;

    .line 717
    .line 718
    invoke-direct {v0, p0, p3}, La/c7n;-><init>(Lorg/xplatform/uikit/components/text_field/DsTextField;B)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {p2, v0}, Lorg/xplatform/uikit/components/text_field/end/c;->setOnCheckedChangeListener(Lkotlin/jvm/functions/Function1;)V

    .line 722
    .line 723
    .line 724
    goto :goto_6

    .line 725
    :cond_f
    new-instance p2, Lorg/xplatform/uikit/components/text_field/end/b;

    .line 726
    .line 727
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    invoke-direct {p2, v0}, Lorg/xplatform/uikit/components/text_field/end/b;-><init>(Landroid/content/Context;)V

    .line 735
    .line 736
    .line 737
    goto :goto_6

    .line 738
    :cond_10
    new-instance p2, La/a5i;

    .line 739
    .line 740
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    invoke-direct {p2, v0}, La/a5i;-><init>(Landroid/content/Context;)V

    .line 748
    .line 749
    .line 750
    goto :goto_6

    .line 751
    :cond_11
    new-instance p2, La/z4i;

    .line 752
    .line 753
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 758
    .line 759
    .line 760
    invoke-direct {p2, v0}, La/z4i;-><init>(Landroid/content/Context;)V

    .line 761
    .line 762
    .line 763
    goto :goto_6

    .line 764
    :cond_12
    new-instance p2, La/c5i;

    .line 765
    .line 766
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 771
    .line 772
    .line 773
    invoke-direct {p2, v0, v1, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 774
    .line 775
    .line 776
    const v2, 0x7f080839

    .line 777
    .line 778
    .line 779
    invoke-virtual {v0, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 780
    .line 781
    .line 782
    move-result-object v2

    .line 783
    iput-object v2, p2, La/c5i;->a:Landroid/graphics/drawable/Drawable;

    .line 784
    .line 785
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    .line 786
    .line 787
    invoke-static {v6, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 788
    .line 789
    .line 790
    move-result v0

    .line 791
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 792
    .line 793
    invoke-direct {v2, v0, v3}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 794
    .line 795
    .line 796
    iput-object v2, p2, La/c5i;->b:Landroid/graphics/PorterDuffColorFilter;

    .line 797
    .line 798
    const/16 v0, 0x8

    .line 799
    .line 800
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 801
    .line 802
    .line 803
    :goto_6
    iput-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 804
    .line 805
    if-eqz p2, :cond_13

    .line 806
    .line 807
    invoke-interface {p2, p1}, La/e5i;->e(Landroid/content/res/TypedArray;)V

    .line 808
    .line 809
    .line 810
    :cond_13
    iget-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 811
    .line 812
    if-eqz p2, :cond_14

    .line 813
    .line 814
    check-cast p2, Landroid/view/View;

    .line 815
    .line 816
    goto :goto_7

    .line 817
    :cond_14
    move-object p2, v1

    .line 818
    :goto_7
    if-eqz p2, :cond_15

    .line 819
    .line 820
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 821
    .line 822
    .line 823
    :cond_15
    new-instance p2, La/j5i;

    .line 824
    .line 825
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    invoke-direct {p2, v0, v1, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 833
    .line 834
    .line 835
    const-string v2, "DSTextFieldTrailingView"

    .line 836
    .line 837
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 838
    .line 839
    .line 840
    const/16 v2, 0x10

    .line 841
    .line 842
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {p2, v9}, Landroid/view/View;->setTextAlignment(I)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setHorizontallyScrolling(Z)V

    .line 852
    .line 853
    .line 854
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 855
    .line 856
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 857
    .line 858
    .line 859
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 860
    .line 861
    .line 862
    move-result-object v3

    .line 863
    const v8, 0x7f0706c7

    .line 864
    .line 865
    .line 866
    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 867
    .line 868
    .line 869
    move-result v3

    .line 870
    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 871
    .line 872
    .line 873
    const v3, 0x7f140438

    .line 874
    .line 875
    .line 876
    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 877
    .line 878
    .line 879
    const v3, 0x7f040aeb

    .line 880
    .line 881
    .line 882
    invoke-static {v3, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 883
    .line 884
    .line 885
    move-result v0

    .line 886
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 887
    .line 888
    .line 889
    iput-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g1:La/j5i;

    .line 890
    .line 891
    invoke-virtual {p2, p1}, La/j5i;->e(Landroid/content/res/TypedArray;)V

    .line 892
    .line 893
    .line 894
    iget-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g1:La/j5i;

    .line 895
    .line 896
    if-eqz p2, :cond_16

    .line 897
    .line 898
    new-instance v0, La/q10;

    .line 899
    .line 900
    invoke-direct {v0, p0, v5}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 904
    .line 905
    .line 906
    :cond_16
    iget-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g1:La/j5i;

    .line 907
    .line 908
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 909
    .line 910
    .line 911
    new-instance p2, La/f5i;

    .line 912
    .line 913
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 918
    .line 919
    .line 920
    invoke-direct {p2, v0, v1, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 921
    .line 922
    .line 923
    invoke-static {v6, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 924
    .line 925
    .line 926
    move-result v3

    .line 927
    iput v3, p2, La/f5i;->k:I

    .line 928
    .line 929
    invoke-static {v7, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 930
    .line 931
    .line 932
    move-result v3

    .line 933
    iput v3, p2, La/f5i;->l:I

    .line 934
    .line 935
    const v3, 0x7f040afc

    .line 936
    .line 937
    .line 938
    invoke-static {v3, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 939
    .line 940
    .line 941
    move-result v0

    .line 942
    iput v0, p2, La/f5i;->m:I

    .line 943
    .line 944
    const-string v0, "DSTextFieldLabelView"

    .line 945
    .line 946
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {p2, p3}, Landroid/view/View;->setEnabled(Z)V

    .line 953
    .line 954
    .line 955
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 956
    .line 957
    .line 958
    iput-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k1:La/f5i;

    .line 959
    .line 960
    invoke-virtual {p2, p1}, La/f5i;->e(Landroid/content/res/TypedArray;)V

    .line 961
    .line 962
    .line 963
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->e()V

    .line 964
    .line 965
    .line 966
    iget-object p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k1:La/f5i;

    .line 967
    .line 968
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 969
    .line 970
    .line 971
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 972
    .line 973
    .line 974
    new-instance p1, La/hie0;

    .line 975
    .line 976
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 977
    .line 978
    .line 979
    new-instance p2, La/iqi;

    .line 980
    .line 981
    invoke-direct {p2, p0, p1, v9}, La/iqi;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 982
    .line 983
    .line 984
    sget-object p1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 985
    .line 986
    invoke-static {p0, p2}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 987
    .line 988
    .line 989
    iget-object p1, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 990
    .line 991
    if-eqz p1, :cond_17

    .line 992
    .line 993
    move-object v1, p1

    .line 994
    :cond_17
    if-eqz v1, :cond_18

    .line 995
    .line 996
    new-instance p1, La/b7n;

    .line 997
    .line 998
    invoke-direct {p1, p0, p3}, La/b7n;-><init>(Lorg/xplatform/uikit/components/text_field/DsTextField;B)V

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v1, p1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 1002
    .line 1003
    .line 1004
    :cond_18
    return-void
.end method

.method private final getEndViewWidth()I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    invoke-interface {p0}, La/e5i;->getVisibility()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0}, La/e5i;->getMeasuredWidth()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    return v0
.end method

.method private final getHelperHeight()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->d:I

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h1:La/d5i;

    .line 9
    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    iget-boolean v1, v0, La/d5i;->i:Z

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v1, v0, La/d5i;->l:Ljava/lang/CharSequence;

    .line 17
    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v1, v0, La/d5i;->m:Ljava/lang/CharSequence;

    .line 28
    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :cond_3
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getHelperMinHeight()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_4
    :goto_0
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getHelperMinHeight()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0
.end method

.method private final getHelperMinHeight()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    iget p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f:I

    .line 8
    .line 9
    return p0
.end method

.method private final getLabelHeight()I
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k1:La/f5i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-eqz v1, :cond_3

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_2
    iget p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->w:I

    .line 28
    .line 29
    return p0

    .line 30
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method private final getTrailingReservedWidth()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g1:La/j5i;

    .line 3
    .line 4
    if-eqz v1, :cond_5

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, La/j5i;->j()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_4

    .line 23
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getEndViewWidth()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-lez v2, :cond_2

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move v2, v0

    .line 32
    :goto_1
    if-eqz v2, :cond_3

    .line 33
    .line 34
    iget v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k:I

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_3
    iget v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->o:I

    .line 38
    .line 39
    :goto_2
    if-eqz v2, :cond_4

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_4
    iget v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->p:I

    .line 43
    .line 44
    :goto_3
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    add-int/2addr p0, v3

    .line 49
    add-int/2addr p0, v0

    .line 50
    return p0

    .line 51
    :cond_5
    :goto_4
    return v0
.end method


# virtual methods
.method public final a(Landroid/text/TextWatcher;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    :goto_0
    iget-object v1, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g1:La/j5i;

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, La/j5i;->j()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->isFocusable()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final c(Landroid/text/TextWatcher;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k1:La/f5i;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 6
    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/middle/b;->f()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v2, 0x1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    const/4 v2, 0x0

    .line 35
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    invoke-virtual {v0, p0}, Landroid/view/View;->setTranslationX(F)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p0}, Landroid/view/View;->setTranslationY(F)V

    .line 50
    .line 51
    .line 52
    const/high16 p0, 0x3f800000    # 1.0f

    .line 53
    .line 54
    invoke-virtual {v0, p0}, Landroid/view/View;->setAlpha(F)V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void
.end method

.method public final e()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/text_field/middle/b;->f()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v2, v0

    .line 12
    :goto_0
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k1:La/f5i;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const/4 v3, 0x0

    .line 22
    :goto_1
    const/4 v4, 0x1

    .line 23
    if-eqz v3, :cond_3

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move v3, v0

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    :goto_2
    move v3, v4

    .line 35
    :goto_3
    if-eqz p0, :cond_8

    .line 36
    .line 37
    if-nez v3, :cond_5

    .line 38
    .line 39
    if-nez v2, :cond_6

    .line 40
    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/view/View;->isFocused()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_4

    .line 48
    :cond_4
    move v1, v0

    .line 49
    :goto_4
    if-eqz v1, :cond_5

    .line 50
    .line 51
    goto :goto_5

    .line 52
    :cond_5
    move v4, v0

    .line 53
    :cond_6
    :goto_5
    if-eqz v4, :cond_7

    .line 54
    .line 55
    goto :goto_6

    .line 56
    :cond_7
    const/16 v0, 0x8

    .line 57
    .line 58
    :goto_6
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    :cond_8
    return-void
.end method

.method public final f(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->x:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->x:Z

    .line 7
    .line 8
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iput-boolean p1, v0, Lorg/xplatform/uikit/components/text_field/middle/b;->m:Z

    .line 13
    .line 14
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/middle/b;->j()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h1:La/d5i;

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    iput-boolean p1, v0, La/d5i;->i:Z

    .line 22
    .line 23
    if-eqz p1, :cond_2

    .line 24
    .line 25
    iget v1, v0, La/d5i;->j:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    iget v1, v0, La/d5i;->k:I

    .line 29
    .line 30
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, La/d5i;->j()V

    .line 34
    .line 35
    .line 36
    :cond_3
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k1:La/f5i;

    .line 37
    .line 38
    if-eqz v0, :cond_6

    .line 39
    .line 40
    iput-boolean p1, v0, La/f5i;->i:Z

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    iget v1, v0, La/f5i;->k:I

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_4
    iget-boolean v1, v0, La/f5i;->j:Z

    .line 48
    .line 49
    if-eqz v1, :cond_5

    .line 50
    .line 51
    iget v1, v0, La/f5i;->m:I

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_5
    iget v1, v0, La/f5i;->l:I

    .line 55
    .line 56
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 57
    .line 58
    .line 59
    :cond_6
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->h()V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->l1:La/t4i;

    .line 63
    .line 64
    iput-boolean p1, p0, La/t4i;->a:Z

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final g(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->y:Z

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->j1:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 7
    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    move v3, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v3, v0

    .line 15
    :goto_0
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object v2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h1:La/d5i;

    .line 19
    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    move v3, v0

    .line 25
    goto :goto_1

    .line 26
    :cond_2
    move v3, v1

    .line 27
    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    :cond_3
    iget-object v2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->i1:Landroid/view/View;

    .line 31
    .line 32
    if-eqz v2, :cond_5

    .line 33
    .line 34
    if-eqz p1, :cond_4

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_4
    move v0, v1

    .line 38
    :goto_2
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    :cond_5
    if-eqz p1, :cond_6

    .line 42
    .line 43
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_6
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final getEndPasswordChecked()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v0, p0, Lorg/xplatform/uikit/components/text_field/end/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lorg/xplatform/uikit/components/text_field/end/c;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    const/4 v0, 0x0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-boolean p0, p0, Lorg/xplatform/uikit/components/text_field/end/c;->a:Z

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne p0, v1, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    return v0
.end method

.method public final getFilters()[Landroid/text/InputFilter;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getFilters()[Landroid/text/InputFilter;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p0

    .line 13
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 14
    new-array p0, p0, [Landroid/text/InputFilter;

    .line 15
    .line 16
    return-object p0
.end method

.method public final getPlaceholderOrEmpty()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/middle/b;->getPlaceHolderOrEmpty()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p0

    .line 13
    :cond_1
    :goto_0
    const-string p0, ""

    .line 14
    .line 15
    return-object p0
.end method

.method public final getSelectionStart()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getSelectionStart()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final getText()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final getTextView()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return-object p0
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v1, v0, La/c5i;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/c5i;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-nez v1, :cond_2

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->x:Z

    .line 17
    .line 18
    invoke-interface {v0, p0}, La/u4i;->a(Z)V

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void

    .line 22
    :cond_2
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->x:Z

    .line 23
    .line 24
    if-eqz v0, :cond_5

    .line 25
    .line 26
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g1:La/j5i;

    .line 27
    .line 28
    if-nez p0, :cond_3

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_4

    .line 36
    .line 37
    invoke-virtual {p0}, La/j5i;->j()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_4

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 45
    goto :goto_3

    .line 46
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 47
    :goto_3
    invoke-virtual {v1, p0}, La/c5i;->a(Z)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->t:I

    .line 6
    .line 7
    add-int v0, p1, p2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getLabelHeight()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    add-int/2addr p1, p2

    .line 18
    iget p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g:I

    .line 19
    .line 20
    add-int v1, p1, p2

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    add-int v2, p2, p1

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getHelperHeight()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    sub-int/2addr p1, p2

    .line 41
    iget p2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h:I

    .line 42
    .line 43
    sub-int v3, p1, p2

    .line 44
    .line 45
    iget-object v4, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->l1:La/t4i;

    .line 46
    .line 47
    move-object v5, p0

    .line 48
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 49
    .line 50
    .line 51
    move-object p5, v5

    .line 52
    iget-object p4, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->k1:La/f5i;

    .line 53
    .line 54
    if-eqz p4, :cond_0

    .line 55
    .line 56
    invoke-virtual {p5}, Landroid/view/View;->getPaddingStart()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    iget p1, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->r:I

    .line 61
    .line 62
    add-int/2addr p0, p1

    .line 63
    invoke-virtual {p5}, Landroid/view/View;->getPaddingTop()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    iget p3, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->s:I

    .line 72
    .line 73
    sub-int/2addr p2, p3

    .line 74
    invoke-virtual {p5}, Landroid/view/View;->getPaddingEnd()I

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    sub-int/2addr p2, p3

    .line 79
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 80
    .line 81
    .line 82
    move-result p3

    .line 83
    add-int/2addr p3, p1

    .line 84
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 85
    .line 86
    .line 87
    :cond_0
    iget v0, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->q:I

    .line 88
    .line 89
    iget v1, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->v:I

    .line 90
    .line 91
    iget v2, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->u:I

    .line 92
    .line 93
    iget-object v3, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    iget-object p4, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->h1:La/d5i;

    .line 97
    .line 98
    if-eqz p4, :cond_2

    .line 99
    .line 100
    invoke-direct {p5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getLabelHeight()I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-eqz v3, :cond_1

    .line 105
    .line 106
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    goto :goto_0

    .line 111
    :cond_1
    move p1, v4

    .line 112
    :goto_0
    add-int p2, v2, v1

    .line 113
    .line 114
    invoke-virtual {p5}, Landroid/view/View;->getPaddingStart()I

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    add-int/2addr p3, v0

    .line 119
    invoke-virtual {p5}, Landroid/view/View;->getPaddingTop()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    add-int/2addr v5, p0

    .line 124
    add-int/2addr v5, p1

    .line 125
    add-int p1, v5, p2

    .line 126
    .line 127
    invoke-virtual {p5}, Landroid/view/View;->getPaddingEnd()I

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    add-int/2addr p0, p3

    .line 132
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 133
    .line 134
    .line 135
    move-result p2

    .line 136
    add-int/2addr p2, p0

    .line 137
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    add-int/2addr p0, p1

    .line 142
    move v7, p3

    .line 143
    move p3, p0

    .line 144
    move p0, v7

    .line 145
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 146
    .line 147
    .line 148
    :cond_2
    const/4 v5, 0x0

    .line 149
    iget-object p4, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->i1:Landroid/view/View;

    .line 150
    .line 151
    if-eqz p4, :cond_7

    .line 152
    .line 153
    iget-object p0, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->h1:La/d5i;

    .line 154
    .line 155
    if-eqz p0, :cond_3

    .line 156
    .line 157
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    goto :goto_1

    .line 162
    :cond_3
    invoke-direct {p5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getHelperMinHeight()I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    :goto_1
    if-eqz p0, :cond_5

    .line 167
    .line 168
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    if-eqz p0, :cond_4

    .line 173
    .line 174
    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatTextView;->getText()Ljava/lang/CharSequence;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    if-eqz p3, :cond_4

    .line 179
    .line 180
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p3

    .line 184
    goto :goto_2

    .line 185
    :cond_4
    move-object p3, v5

    .line 186
    :goto_2
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 187
    .line 188
    .line 189
    move-result p2

    .line 190
    float-to-int p2, p2

    .line 191
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    invoke-static {p2, p0}, Ljava/lang/Integer;->min(II)I

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    goto :goto_3

    .line 200
    :cond_5
    move p0, v4

    .line 201
    :goto_3
    invoke-direct {p5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getLabelHeight()I

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    if-eqz v3, :cond_6

    .line 206
    .line 207
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 208
    .line 209
    .line 210
    move-result p3

    .line 211
    goto :goto_4

    .line 212
    :cond_6
    move p3, v4

    .line 213
    :goto_4
    add-int v6, v2, v1

    .line 214
    .line 215
    invoke-static {p2, p3, v6, p1}, La/hne;->D(IIII)I

    .line 216
    .line 217
    .line 218
    move-result p2

    .line 219
    div-int/lit8 p1, p1, 0x2

    .line 220
    .line 221
    sub-int/2addr p2, p1

    .line 222
    invoke-virtual {p5}, Landroid/view/View;->getPaddingStart()I

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    add-int/2addr p1, v0

    .line 227
    add-int/2addr p1, p0

    .line 228
    iget p0, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->i:I

    .line 229
    .line 230
    add-int/2addr p0, p1

    .line 231
    invoke-virtual {p5}, Landroid/view/View;->getPaddingTop()I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    add-int/2addr p1, p2

    .line 236
    iget p2, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->j:I

    .line 237
    .line 238
    div-int/lit8 p3, p2, 0x2

    .line 239
    .line 240
    sub-int/2addr p1, p3

    .line 241
    invoke-virtual {p5}, Landroid/view/View;->getPaddingEnd()I

    .line 242
    .line 243
    .line 244
    move-result p3

    .line 245
    add-int/2addr p3, p0

    .line 246
    add-int/2addr p3, p2

    .line 247
    add-int/2addr p2, p1

    .line 248
    move v7, p3

    .line 249
    move p3, p2

    .line 250
    move p2, v7

    .line 251
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 252
    .line 253
    .line 254
    :cond_7
    iget-object p4, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->j1:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 255
    .line 256
    if-eqz p4, :cond_9

    .line 257
    .line 258
    invoke-direct {p5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getLabelHeight()I

    .line 259
    .line 260
    .line 261
    move-result p0

    .line 262
    if-eqz v3, :cond_8

    .line 263
    .line 264
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    goto :goto_5

    .line 269
    :cond_8
    move p1, v4

    .line 270
    :goto_5
    add-int/2addr v1, v2

    .line 271
    invoke-virtual {p5}, Landroid/view/View;->getPaddingStart()I

    .line 272
    .line 273
    .line 274
    move-result p2

    .line 275
    add-int/2addr p2, v0

    .line 276
    invoke-virtual {p5}, Landroid/view/View;->getPaddingTop()I

    .line 277
    .line 278
    .line 279
    move-result p3

    .line 280
    add-int/2addr p3, p0

    .line 281
    add-int/2addr p3, p1

    .line 282
    add-int p1, p3, v1

    .line 283
    .line 284
    invoke-virtual {p5}, Landroid/view/View;->getPaddingEnd()I

    .line 285
    .line 286
    .line 287
    move-result p0

    .line 288
    add-int/2addr p0, p2

    .line 289
    iget p3, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->e:I

    .line 290
    .line 291
    add-int/2addr p0, p3

    .line 292
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 293
    .line 294
    .line 295
    move-result p3

    .line 296
    add-int/2addr p3, p1

    .line 297
    move v7, p2

    .line 298
    move p2, p0

    .line 299
    move p0, v7

    .line 300
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 301
    .line 302
    .line 303
    :cond_9
    iget-object v0, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->A:La/h5i;

    .line 304
    .line 305
    if-eqz v0, :cond_a

    .line 306
    .line 307
    move-object p4, v0

    .line 308
    goto :goto_6

    .line 309
    :cond_a
    move-object p4, v5

    .line 310
    :goto_6
    iget v1, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->l:I

    .line 311
    .line 312
    if-eqz p4, :cond_c

    .line 313
    .line 314
    invoke-direct {p5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getLabelHeight()I

    .line 315
    .line 316
    .line 317
    move-result p0

    .line 318
    add-int/2addr p0, v2

    .line 319
    if-eqz v3, :cond_b

    .line 320
    .line 321
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    goto :goto_7

    .line 326
    :cond_b
    move p1, v4

    .line 327
    :goto_7
    add-int/2addr p0, p1

    .line 328
    div-int/lit8 p1, p1, 0x2

    .line 329
    .line 330
    sub-int/2addr p0, p1

    .line 331
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 332
    .line 333
    .line 334
    move-result p1

    .line 335
    div-int/lit8 p2, p1, 0x2

    .line 336
    .line 337
    invoke-virtual {p5}, Landroid/view/View;->getPaddingStart()I

    .line 338
    .line 339
    .line 340
    move-result p3

    .line 341
    add-int/2addr p3, v1

    .line 342
    invoke-virtual {p5}, Landroid/view/View;->getPaddingTop()I

    .line 343
    .line 344
    .line 345
    move-result v6

    .line 346
    add-int/2addr v6, p0

    .line 347
    sub-int/2addr v6, p2

    .line 348
    invoke-virtual {p5}, Landroid/view/View;->getPaddingEnd()I

    .line 349
    .line 350
    .line 351
    move-result p0

    .line 352
    add-int/2addr p0, p3

    .line 353
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 354
    .line 355
    .line 356
    move-result p2

    .line 357
    add-int/2addr p2, p0

    .line 358
    add-int/2addr p1, v6

    .line 359
    move p0, p3

    .line 360
    move p3, p1

    .line 361
    move p1, v6

    .line 362
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 363
    .line 364
    .line 365
    :cond_c
    if-eqz v3, :cond_d

    .line 366
    .line 367
    move-object p4, v3

    .line 368
    goto :goto_8

    .line 369
    :cond_d
    move-object p4, v5

    .line 370
    :goto_8
    if-eqz p4, :cond_f

    .line 371
    .line 372
    invoke-direct {p5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getLabelHeight()I

    .line 373
    .line 374
    .line 375
    move-result p0

    .line 376
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 377
    .line 378
    .line 379
    move-result p1

    .line 380
    if-eqz v0, :cond_e

    .line 381
    .line 382
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 383
    .line 384
    .line 385
    move-result p2

    .line 386
    goto :goto_9

    .line 387
    :cond_e
    move p2, v4

    .line 388
    :goto_9
    invoke-direct {p5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getEndViewWidth()I

    .line 389
    .line 390
    .line 391
    move-result p3

    .line 392
    invoke-direct {p5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTrailingReservedWidth()I

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    iget v6, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->m:I

    .line 397
    .line 398
    add-int/2addr v6, v1

    .line 399
    invoke-virtual {p5}, Landroid/view/View;->getPaddingStart()I

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    add-int/2addr v1, p2

    .line 404
    add-int/2addr v1, v6

    .line 405
    invoke-virtual {p5}, Landroid/view/View;->getPaddingTop()I

    .line 406
    .line 407
    .line 408
    move-result p2

    .line 409
    add-int/2addr p2, p0

    .line 410
    add-int/2addr p2, v2

    .line 411
    invoke-virtual {p5}, Landroid/view/View;->getPaddingEnd()I

    .line 412
    .line 413
    .line 414
    move-result p0

    .line 415
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 416
    .line 417
    .line 418
    move-result v6

    .line 419
    add-int/2addr v6, p0

    .line 420
    sub-int/2addr v6, p3

    .line 421
    sub-int/2addr v6, v0

    .line 422
    iget p0, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->n:I

    .line 423
    .line 424
    sub-int/2addr v6, p0

    .line 425
    add-int p3, p2, p1

    .line 426
    .line 427
    move p1, p2

    .line 428
    move p0, v1

    .line 429
    move p2, v6

    .line 430
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 431
    .line 432
    .line 433
    :cond_f
    iget-object p0, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 434
    .line 435
    if-eqz p0, :cond_10

    .line 436
    .line 437
    move-object v5, p0

    .line 438
    check-cast v5, Landroid/view/View;

    .line 439
    .line 440
    :cond_10
    move-object p4, v5

    .line 441
    if-eqz p4, :cond_12

    .line 442
    .line 443
    invoke-direct {p5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getLabelHeight()I

    .line 444
    .line 445
    .line 446
    move-result p0

    .line 447
    if-eqz v3, :cond_11

    .line 448
    .line 449
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 450
    .line 451
    .line 452
    move-result p1

    .line 453
    goto :goto_a

    .line 454
    :cond_11
    move p1, v4

    .line 455
    :goto_a
    add-int/2addr p0, v2

    .line 456
    add-int/2addr p0, p1

    .line 457
    div-int/lit8 p1, p1, 0x2

    .line 458
    .line 459
    sub-int/2addr p0, p1

    .line 460
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 461
    .line 462
    .line 463
    move-result p1

    .line 464
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 465
    .line 466
    .line 467
    move-result p2

    .line 468
    sub-int/2addr p1, p2

    .line 469
    invoke-virtual {p5}, Landroid/view/View;->getPaddingEnd()I

    .line 470
    .line 471
    .line 472
    move-result p2

    .line 473
    sub-int/2addr p1, p2

    .line 474
    invoke-virtual {p5}, Landroid/view/View;->getPaddingTop()I

    .line 475
    .line 476
    .line 477
    move-result p2

    .line 478
    add-int/2addr p2, p0

    .line 479
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 480
    .line 481
    .line 482
    move-result p0

    .line 483
    div-int/lit8 p0, p0, 0x2

    .line 484
    .line 485
    sub-int/2addr p2, p0

    .line 486
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 487
    .line 488
    .line 489
    move-result p0

    .line 490
    add-int/2addr p0, p1

    .line 491
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 492
    .line 493
    .line 494
    move-result p3

    .line 495
    add-int/2addr p3, p2

    .line 496
    move v7, p2

    .line 497
    move p2, p0

    .line 498
    move p0, p1

    .line 499
    move p1, v7

    .line 500
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 501
    .line 502
    .line 503
    :cond_12
    iget-object p4, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->g1:La/j5i;

    .line 504
    .line 505
    if-nez p4, :cond_13

    .line 506
    .line 507
    goto :goto_b

    .line 508
    :cond_13
    invoke-direct {p5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTrailingReservedWidth()I

    .line 509
    .line 510
    .line 511
    move-result p0

    .line 512
    if-nez p0, :cond_14

    .line 513
    .line 514
    :goto_b
    return-void

    .line 515
    :cond_14
    invoke-direct {p5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getLabelHeight()I

    .line 516
    .line 517
    .line 518
    move-result p0

    .line 519
    if-eqz v3, :cond_15

    .line 520
    .line 521
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 522
    .line 523
    .line 524
    move-result v4

    .line 525
    :cond_15
    add-int/2addr p0, v2

    .line 526
    invoke-direct {p5}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getEndViewWidth()I

    .line 527
    .line 528
    .line 529
    move-result p1

    .line 530
    if-lez p1, :cond_16

    .line 531
    .line 532
    iget p2, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->k:I

    .line 533
    .line 534
    goto :goto_c

    .line 535
    :cond_16
    iget p2, p5, Lorg/xplatform/uikit/components/text_field/DsTextField;->p:I

    .line 536
    .line 537
    :goto_c
    div-int/lit8 v4, v4, 0x2

    .line 538
    .line 539
    add-int/2addr v4, p0

    .line 540
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 541
    .line 542
    .line 543
    move-result p0

    .line 544
    invoke-virtual {p5}, Landroid/view/View;->getPaddingEnd()I

    .line 545
    .line 546
    .line 547
    move-result p3

    .line 548
    sub-int/2addr p0, p3

    .line 549
    sub-int/2addr p0, p1

    .line 550
    sub-int p2, p0, p2

    .line 551
    .line 552
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 553
    .line 554
    .line 555
    move-result p0

    .line 556
    sub-int p0, p2, p0

    .line 557
    .line 558
    invoke-virtual {p5}, Landroid/view/View;->getPaddingTop()I

    .line 559
    .line 560
    .line 561
    move-result p1

    .line 562
    add-int/2addr p1, v4

    .line 563
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 564
    .line 565
    .line 566
    move-result p3

    .line 567
    div-int/lit8 p3, p3, 0x2

    .line 568
    .line 569
    sub-int/2addr p1, p3

    .line 570
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 571
    .line 572
    .line 573
    move-result p3

    .line 574
    add-int/2addr p3, p1

    .line 575
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 576
    .line 577
    .line 578
    return-void
.end method

.method public final onMeasure(II)V
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sub-int/2addr v0, v2

    .line 24
    const/high16 v3, 0x40000000    # 2.0f

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/high16 v5, -0x80000000

    .line 28
    .line 29
    iget-object v6, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k1:La/f5i;

    .line 30
    .line 31
    if-eqz v6, :cond_0

    .line 32
    .line 33
    iget v7, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->r:I

    .line 34
    .line 35
    sub-int v7, v0, v7

    .line 36
    .line 37
    iget v8, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->s:I

    .line 38
    .line 39
    sub-int/2addr v7, v8

    .line 40
    invoke-static {v7, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    invoke-virtual {v6, v8, v9}, Landroid/view/View;->measure(II)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    iget v9, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->w:I

    .line 56
    .line 57
    if-ge v8, v9, :cond_0

    .line 58
    .line 59
    invoke-static {v7, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    invoke-static {v9, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    invoke-virtual {v6, v7, v8}, Landroid/view/View;->measure(II)V

    .line 68
    .line 69
    .line 70
    :cond_0
    iget-object v6, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->A:La/h5i;

    .line 71
    .line 72
    if-eqz v6, :cond_1

    .line 73
    .line 74
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    invoke-virtual {v6, v7, v8}, Landroid/view/View;->measure(II)V

    .line 83
    .line 84
    .line 85
    :cond_1
    iget-object v7, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 86
    .line 87
    if-eqz v7, :cond_2

    .line 88
    .line 89
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    invoke-interface {v7, v8, v9}, La/e5i;->measure(II)V

    .line 98
    .line 99
    .line 100
    :cond_2
    iget-object v7, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g1:La/j5i;

    .line 101
    .line 102
    if-nez v7, :cond_3

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    const v9, 0x7f0706c7

    .line 110
    .line 111
    .line 112
    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    invoke-static {v8, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    invoke-virtual {v7, v8, v9}, Landroid/view/View;->measure(II)V

    .line 125
    .line 126
    .line 127
    :goto_0
    if-eqz v6, :cond_4

    .line 128
    .line 129
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    goto :goto_1

    .line 134
    :cond_4
    move v7, v4

    .line 135
    :goto_1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getEndViewWidth()I

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTrailingReservedWidth()I

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    iget v10, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->l:I

    .line 144
    .line 145
    iget v11, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->m:I

    .line 146
    .line 147
    add-int v12, v10, v11

    .line 148
    .line 149
    iget v13, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->n:I

    .line 150
    .line 151
    add-int/2addr v12, v13

    .line 152
    sub-int v7, v0, v7

    .line 153
    .line 154
    sub-int/2addr v7, v8

    .line 155
    sub-int/2addr v7, v9

    .line 156
    sub-int/2addr v7, v12

    .line 157
    iget-object v8, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 158
    .line 159
    if-eqz v8, :cond_5

    .line 160
    .line 161
    invoke-static {v7, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    invoke-virtual {v8, v5, v7}, Landroid/view/View;->measure(II)V

    .line 170
    .line 171
    .line 172
    :cond_5
    iget-object v5, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->i1:Landroid/view/View;

    .line 173
    .line 174
    if-eqz v5, :cond_6

    .line 175
    .line 176
    iget v7, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->j:I

    .line 177
    .line 178
    invoke-static {v7, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    invoke-static {v7, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    invoke-virtual {v5, v9, v7}, Landroid/view/View;->measure(II)V

    .line 187
    .line 188
    .line 189
    :cond_6
    iget-object v7, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h1:La/d5i;

    .line 190
    .line 191
    if-eqz v7, :cond_8

    .line 192
    .line 193
    if-eqz v5, :cond_7

    .line 194
    .line 195
    invoke-virtual {v5}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    if-eqz v9, :cond_7

    .line 200
    .line 201
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    iget v9, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->i:I

    .line 206
    .line 207
    add-int/2addr v5, v9

    .line 208
    goto :goto_2

    .line 209
    :cond_7
    move v5, v4

    .line 210
    :goto_2
    iget v9, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->q:I

    .line 211
    .line 212
    sub-int/2addr v0, v9

    .line 213
    sub-int/2addr v0, v5

    .line 214
    invoke-virtual {v7}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {v7, v5, v0}, La/cem0;->t(Landroid/widget/TextView;Landroid/text/TextPaint;I)Landroid/text/StaticLayout;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    invoke-virtual {v0}, Landroid/text/Layout;->getHeight()I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getHelperMinHeight()I

    .line 234
    .line 235
    .line 236
    move-result v9

    .line 237
    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    invoke-static {v5, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 242
    .line 243
    .line 244
    move-result v5

    .line 245
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    invoke-virtual {v7, v5, v0}, Landroid/view/View;->measure(II)V

    .line 250
    .line 251
    .line 252
    :cond_8
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->j1:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 253
    .line 254
    if-eqz v0, :cond_9

    .line 255
    .line 256
    iget v5, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->e:I

    .line 257
    .line 258
    invoke-static {v5, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    iget v7, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->d:I

    .line 263
    .line 264
    invoke-static {v7, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 265
    .line 266
    .line 267
    move-result v7

    .line 268
    invoke-virtual {v0, v5, v7}, Landroid/view/View;->measure(II)V

    .line 269
    .line 270
    .line 271
    :cond_9
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getLabelHeight()I

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v8, :cond_a

    .line 276
    .line 277
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    goto :goto_3

    .line 282
    :cond_a
    move v5, v4

    .line 283
    :goto_3
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getHelperHeight()I

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    iget v9, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->u:I

    .line 288
    .line 289
    iget v12, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->v:I

    .line 290
    .line 291
    add-int/2addr v9, v12

    .line 292
    add-int/2addr v9, v1

    .line 293
    if-eqz v6, :cond_b

    .line 294
    .line 295
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    goto :goto_4

    .line 300
    :cond_b
    move v1, v4

    .line 301
    :goto_4
    if-eqz v8, :cond_c

    .line 302
    .line 303
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    :cond_c
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getEndViewWidth()I

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTrailingReservedWidth()I

    .line 312
    .line 313
    .line 314
    move-result v8

    .line 315
    add-int/2addr v10, v11

    .line 316
    add-int/2addr v10, v13

    .line 317
    add-int/2addr v10, v2

    .line 318
    add-int/2addr v1, v4

    .line 319
    add-int/2addr v1, v6

    .line 320
    add-int/2addr v1, v8

    .line 321
    add-int/2addr v1, v10

    .line 322
    invoke-static {v1, p1}, Landroid/view/View;->resolveSize(II)I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    add-int/2addr v0, v5

    .line 327
    add-int/2addr v0, v7

    .line 328
    add-int/2addr v0, v9

    .line 329
    move/from16 v2, p2

    .line 330
    .line 331
    invoke-static {v0, v2}, Landroid/view/View;->resolveSize(II)I

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    sub-int/2addr v0, v1

    .line 347
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    sub-int/2addr v0, v1

    .line 352
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    sub-int/2addr v1, v2

    .line 361
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    sub-int/2addr v1, v2

    .line 366
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getLabelHeight()I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    invoke-direct {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getHelperHeight()I

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    iget v5, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g:I

    .line 375
    .line 376
    iget v6, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h:I

    .line 377
    .line 378
    add-int/2addr v5, v6

    .line 379
    sub-int/2addr v1, v2

    .line 380
    sub-int/2addr v1, v4

    .line 381
    sub-int/2addr v1, v5

    .line 382
    iget v2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->t:I

    .line 383
    .line 384
    sub-int/2addr v0, v2

    .line 385
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 390
    .line 391
    .line 392
    move-result v1

    .line 393
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->l1:La/t4i;

    .line 394
    .line 395
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->measure(II)V

    .line 396
    .line 397
    .line 398
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La/jrx;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->e()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->d()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    iget-object v3, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v3, v2

    .line 19
    :goto_0
    iget-object v4, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g1:La/j5i;

    .line 20
    .line 21
    if-eqz v4, :cond_8

    .line 22
    .line 23
    if-eqz v3, :cond_8

    .line 24
    .line 25
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-nez v5, :cond_8

    .line 30
    .line 31
    invoke-virtual {v4}, La/j5i;->j()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_8

    .line 36
    .line 37
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    int-to-float v4, v4

    .line 42
    cmpg-float v4, v1, v4

    .line 43
    .line 44
    if-ltz v4, :cond_8

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    int-to-float v4, v4

    .line 51
    cmpl-float v1, v1, v4

    .line 52
    .line 53
    if-lez v1, :cond_1

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_1
    iget-object v1, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    check-cast v1, Landroid/view/View;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move-object v1, v2

    .line 64
    :goto_1
    if-eqz v1, :cond_3

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-nez v4, :cond_3

    .line 71
    .line 72
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-lez v4, :cond_3

    .line 77
    .line 78
    move-object v2, v1

    .line 79
    :cond_3
    iget-boolean v1, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->a:Z

    .line 80
    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    goto :goto_3

    .line 94
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    sub-int/2addr v2, v3

    .line 103
    goto :goto_3

    .line 104
    :cond_5
    if-eqz v2, :cond_6

    .line 105
    .line 106
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    goto :goto_2

    .line 111
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    :goto_2
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    :goto_3
    int-to-float v1, v1

    .line 120
    cmpl-float v1, v0, v1

    .line 121
    .line 122
    if-ltz v1, :cond_8

    .line 123
    .line 124
    int-to-float v1, v2

    .line 125
    cmpg-float v0, v0, v1

    .line 126
    .line 127
    if-gtz v0, :cond_8

    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    const/4 v0, 0x1

    .line 134
    if-ne p1, v0, :cond_7

    .line 135
    .line 136
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->b()V

    .line 137
    .line 138
    .line 139
    :cond_7
    return v0

    .line 140
    :cond_8
    :goto_4
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    return p0
.end method

.method public final setCursorVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setCursorVisible(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setDynamicHelperHeight(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->z:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setEditable(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/middle/b;->setEditable(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setEnabled(Z)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/high16 v0, 0x3f000000    # 0.5f

    .line 10
    .line 11
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k1:La/f5i;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h1:La/d5i;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 34
    .line 35
    .line 36
    :cond_2
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g1:La/j5i;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 45
    .line 46
    .line 47
    :cond_3
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->A:La/h5i;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 56
    .line 57
    .line 58
    :cond_4
    iget-object v1, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 59
    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 67
    .line 68
    .line 69
    :cond_5
    iget-object v2, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 70
    .line 71
    if-eqz v2, :cond_6

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-interface {v2, v3}, La/e5i;->setAlpha(F)V

    .line 78
    .line 79
    .line 80
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->l1:La/t4i;

    .line 85
    .line 86
    invoke-virtual {p0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 87
    .line 88
    .line 89
    if-eqz v0, :cond_7

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 92
    .line 93
    .line 94
    :cond_7
    if-eqz v1, :cond_8

    .line 95
    .line 96
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 97
    .line 98
    .line 99
    :cond_8
    if-eqz v2, :cond_9

    .line 100
    .line 101
    invoke-interface {v2, p1}, La/e5i;->setEnabled(Z)V

    .line 102
    .line 103
    .line 104
    :cond_9
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final setEndChevronClickListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 5
    .line 6
    instance-of v0, p0, Lorg/xplatform/uikit/components/text_field/end/b;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lorg/xplatform/uikit/components/text_field/end/b;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    :goto_0
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/end/b;->setClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final setEndIconClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v0, p0, La/z4i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/z4i;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    new-instance v0, La/dpl;

    .line 14
    .line 15
    const/16 v1, 0x17

    .line 16
    .line 17
    invoke-direct {v0, p0, p1, v1}, La/dpl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method

.method public final setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v0, p0, La/z4i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/z4i;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/z4i;->setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setEndIconDrawableRes(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v0, p0, La/z4i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/z4i;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/z4i;->setEndIconDrawableRes(I)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setEndPasswordChecked(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v1, v0, Lorg/xplatform/uikit/components/text_field/end/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lorg/xplatform/uikit/components/text_field/end/c;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/text_field/end/c;->setChecked(Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 17
    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    xor-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/middle/b;->h(Z)V

    .line 23
    .line 24
    .line 25
    :cond_2
    return-void
.end method

.method public final setEndStepperMinusClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v0, p0, La/a5i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/a5i;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/a5i;->setMinusButtonClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setEndStepperPlusClickListener(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v0, p0, La/a5i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/a5i;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/a5i;->setPlusButtonClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setEndViewVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 p1, 0x8

    .line 10
    .line 11
    :goto_0
    invoke-interface {p0, p1}, La/e5i;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    :cond_1
    return-void
.end method

.method public final setErrorIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v0, p0, La/c5i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/c5i;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/c5i;->setErrorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setErrorIconDrawableRes(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v0, p0, La/c5i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/c5i;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/c5i;->setErrorDrawableRes(I)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setErrorText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h1:La/d5i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/d5i;->setErrorText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setFilters([Landroid/text/InputFilter;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setFocusable(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setHelperIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->i1:Landroid/view/View;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setHelperIconRes(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->i1:Landroid/view/View;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final setHelperText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h1:La/d5i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, La/d5i;->setValue(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setIgnoreTextSpaces(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/middle/b;->setIgnoreTextSpaces(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setImeOptions(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setInputType(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setInputType(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setKeyListener(Landroid/text/method/KeyListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatEditText;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setLabelText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k1:La/f5i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/text_field/middle/b;->setLabelText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->e()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final setLabelVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k1:La/f5i;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 p1, 0x8

    .line 10
    .line 11
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    :cond_1
    return-void
.end method

.method public final setMinusButtonEnabled(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v0, p0, La/a5i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/a5i;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/a5i;->setMinusButtonEnabled(Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setMinusButtonVisible(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v0, p0, La/a5i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/a5i;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_2

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/16 p1, 0x8

    .line 18
    .line 19
    :goto_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    :cond_2
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->A:La/h5i;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    invoke-interface {p0, p1}, La/u4i;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    .line 24
    .line 25
    :cond_2
    return-void
.end method

.method public final setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setOnTextCopy(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/middle/b;->setOnTextCopy(Lkotlin/jvm/functions/Function0;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setOnTextCut(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/middle/b;->setOnTextCut(Lkotlin/jvm/functions/Function0;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setOnTextPaste(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/middle/b;->setOnTextPaste(Lkotlin/jvm/functions/Function0;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setPasswordVisibleListener(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 5
    .line 6
    instance-of v0, p0, Lorg/xplatform/uikit/components/text_field/end/c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lorg/xplatform/uikit/components/text_field/end/c;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    :goto_0
    if-eqz p0, :cond_1

    .line 15
    .line 16
    new-instance v0, La/btm;

    .line 17
    .line 18
    const/4 v1, 0x6

    .line 19
    invoke-direct {v0, p1, v1}, La/btm;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/text_field/end/c;->setOnCheckedChangeListener(Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final setPlaceholderText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/middle/b;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setPlusButtonEnabled(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v0, p0, La/a5i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/a5i;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/a5i;->setPlusButtonEnabled(Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setPlusButtonVisible(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->f1:La/u4i;

    .line 2
    .line 3
    instance-of v0, p0, La/a5i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/a5i;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_2

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/16 p1, 0x8

    .line 18
    .line 19
    :goto_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    :cond_2
    return-void
.end method

.method public final setRawInputType(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setRawInputType(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setSelection(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/middle/b;->setSelection(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setSingleLine(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setStartIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->A:La/h5i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/h5i;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setStartIconDrawableRes(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->A:La/h5i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/h5i;->setDrawable(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setStartIconTint(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->A:La/h5i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/h5i;->setTint(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setStartIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->A:La/h5i;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/h5i;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final setStartIconVisibility(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->A:La/h5i;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 p1, 0x8

    .line 10
    .line 11
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    :cond_1
    return-void
.end method

.method public final setText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/text_field/middle/b;->setValue(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->e()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->d()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setTextAlignment(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setTextAlignment(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h1:La/d5i;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/View;->setTextAlignment(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k1:La/f5i;

    .line 16
    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/view/View;->setTextAlignment(I)V

    .line 20
    .line 21
    .line 22
    :cond_2
    return-void
.end method

.method public setTextDirection(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->B:Lorg/xplatform/uikit/components/text_field/middle/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setTextDirection(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->h1:La/d5i;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/view/View;->setTextDirection(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object p0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->k1:La/f5i;

    .line 16
    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/view/View;->setTextDirection(I)V

    .line 20
    .line 21
    .line 22
    :cond_2
    return-void
.end method

.method public final setTrailingText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g1:La/j5i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, La/j5i;->setValue(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->h()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setTrailingTextVisible(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/text_field/DsTextField;->g1:La/j5i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 p1, 0x8

    .line 10
    .line 11
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->h()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 18
    .line 19
    .line 20
    return-void
.end method
