.class public final synthetic La/xol;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ngk0;

.field public final synthetic c:La/bpl;

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/ngk0;La/bpl;Landroid/content/Context;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/xol;->a:B

    iput-object p1, p0, La/xol;->b:La/ngk0;

    iput-object p2, p0, La/xol;->c:La/bpl;

    iput-object p3, p0, La/xol;->d:Landroid/content/Context;

    iput-object p4, p0, La/xol;->e:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/xol;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    iget-object v3, p0, La/xol;->e:La/pz40;

    .line 6
    .line 7
    iget-object v4, p0, La/xol;->d:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v5, p0, La/xol;->c:La/bpl;

    .line 10
    .line 11
    iget-object p0, p0, La/xol;->b:La/ngk0;

    .line 12
    .line 13
    check-cast p1, La/kz3;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, v5, La/bpl;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, La/ngk0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/y3d;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-interface {v3, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget-object p1, p1, La/kz3;->b:La/hhn0;

    .line 38
    .line 39
    iget-object p1, p1, La/hhn0;->a:La/dyw;

    .line 40
    .line 41
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v0}, La/c3x;->q(La/dyw;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-object p1, v1

    .line 60
    :goto_0
    if-eqz p1, :cond_2

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    invoke-static {p1}, La/vzb;->s0(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :cond_2
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    div-int/2addr p1, v2

    .line 79
    invoke-virtual {v1, v2, p1}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    invoke-static {p1}, La/fbc;->d(I)J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    iget-object p1, v5, La/bpl;->c:Ljava/lang/String;

    .line 88
    .line 89
    new-instance v2, La/y3d;

    .line 90
    .line 91
    invoke-direct {v2, v0, v1}, La/y3d;-><init>(J)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, p1, v2}, La/ngk0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    new-instance p0, La/y3d;

    .line 98
    .line 99
    invoke-direct {p0, v0, v1}, La/y3d;-><init>(J)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v3, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    :goto_1
    return-object p0

    .line 108
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-object v0, v5, La/bpl;->c:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {p0, v0}, La/ngk0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, La/y3d;

    .line 118
    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    invoke-interface {v3, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    iget-object p1, p1, La/kz3;->b:La/hhn0;

    .line 128
    .line 129
    iget-object p1, p1, La/hhn0;->a:La/dyw;

    .line 130
    .line 131
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-static {p1, v0}, La/c3x;->q(La/dyw;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 143
    .line 144
    if-eqz v0, :cond_5

    .line 145
    .line 146
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_5
    move-object p1, v1

    .line 150
    :goto_2
    if-eqz p1, :cond_6

    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    if-eqz p1, :cond_6

    .line 157
    .line 158
    invoke-static {p1}, La/vzb;->s0(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    :cond_6
    if-eqz v1, :cond_7

    .line 163
    .line 164
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    div-int/2addr p1, v2

    .line 169
    invoke-virtual {v1, v2, p1}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    invoke-static {p1}, La/fbc;->d(I)J

    .line 174
    .line 175
    .line 176
    move-result-wide v0

    .line 177
    iget-object p1, v5, La/bpl;->c:Ljava/lang/String;

    .line 178
    .line 179
    new-instance v2, La/y3d;

    .line 180
    .line 181
    invoke-direct {v2, v0, v1}, La/y3d;-><init>(J)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, p1, v2}, La/ngk0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    new-instance p0, La/y3d;

    .line 188
    .line 189
    invoke-direct {p0, v0, v1}, La/y3d;-><init>(J)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v3, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    :goto_3
    return-object p0

    .line 198
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object v0, v5, La/bpl;->c:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {p0, v0}, La/ngk0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, La/y3d;

    .line 208
    .line 209
    if-eqz v0, :cond_8

    .line 210
    .line 211
    invoke-interface {v3, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_8
    iget-object p1, p1, La/kz3;->b:La/hhn0;

    .line 218
    .line 219
    iget-object p1, p1, La/hhn0;->a:La/dyw;

    .line 220
    .line 221
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-static {p1, v0}, La/c3x;->q(La/dyw;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 233
    .line 234
    if-eqz v0, :cond_9

    .line 235
    .line 236
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_9
    move-object p1, v1

    .line 240
    :goto_4
    if-eqz p1, :cond_a

    .line 241
    .line 242
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    if-eqz p1, :cond_a

    .line 247
    .line 248
    invoke-static {p1}, La/vzb;->s0(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    :cond_a
    if-eqz v1, :cond_b

    .line 253
    .line 254
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    div-int/2addr p1, v2

    .line 259
    invoke-virtual {v1, v2, p1}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    invoke-static {p1}, La/fbc;->d(I)J

    .line 264
    .line 265
    .line 266
    move-result-wide v0

    .line 267
    iget-object p1, v5, La/bpl;->c:Ljava/lang/String;

    .line 268
    .line 269
    new-instance v2, La/y3d;

    .line 270
    .line 271
    invoke-direct {v2, v0, v1}, La/y3d;-><init>(J)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0, p1, v2}, La/ngk0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    new-instance p0, La/y3d;

    .line 278
    .line 279
    invoke-direct {p0, v0, v1}, La/y3d;-><init>(J)V

    .line 280
    .line 281
    .line 282
    invoke-interface {v3, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    :goto_5
    return-object p0

    .line 288
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    iget-object v0, v5, La/bpl;->c:Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {p0, v0}, La/ngk0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    check-cast v0, La/y3d;

    .line 298
    .line 299
    if-eqz v0, :cond_c

    .line 300
    .line 301
    invoke-interface {v3, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_c
    iget-object p1, p1, La/kz3;->b:La/hhn0;

    .line 308
    .line 309
    iget-object p1, p1, La/hhn0;->a:La/dyw;

    .line 310
    .line 311
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    invoke-static {p1, v0}, La/c3x;->q(La/dyw;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 323
    .line 324
    if-eqz v0, :cond_d

    .line 325
    .line 326
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :cond_d
    move-object p1, v1

    .line 330
    :goto_6
    if-eqz p1, :cond_e

    .line 331
    .line 332
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    if-eqz p1, :cond_e

    .line 337
    .line 338
    invoke-static {p1}, La/vzb;->s0(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    :cond_e
    if-eqz v1, :cond_f

    .line 343
    .line 344
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 345
    .line 346
    .line 347
    move-result p1

    .line 348
    div-int/2addr p1, v2

    .line 349
    invoke-virtual {v1, v2, p1}, Landroid/graphics/Bitmap;->getPixel(II)I

    .line 350
    .line 351
    .line 352
    move-result p1

    .line 353
    invoke-static {p1}, La/fbc;->d(I)J

    .line 354
    .line 355
    .line 356
    move-result-wide v0

    .line 357
    iget-object p1, v5, La/bpl;->c:Ljava/lang/String;

    .line 358
    .line 359
    new-instance v2, La/y3d;

    .line 360
    .line 361
    invoke-direct {v2, v0, v1}, La/y3d;-><init>(J)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {p0, p1, v2}, La/ngk0;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    new-instance p0, La/y3d;

    .line 368
    .line 369
    invoke-direct {p0, v0, v1}, La/y3d;-><init>(J)V

    .line 370
    .line 371
    .line 372
    invoke-interface {v3, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    :cond_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 376
    .line 377
    :goto_7
    return-object p0

    .line 378
    nop

    .line 379
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
