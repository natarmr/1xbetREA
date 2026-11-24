.class public final La/tl70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ul70;


# direct methods
.method public synthetic constructor <init>(La/ul70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/tl70;->i:B

    iput-object p1, p0, La/tl70;->k:La/ul70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tl70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/tl70;->k:La/ul70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/tl70;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/tl70;-><init>(La/ul70;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/tl70;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/tl70;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/tl70;-><init>(La/ul70;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/tl70;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/tl70;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/xl70;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/tl70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/tl70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/tl70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/im70;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/tl70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/tl70;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/tl70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tl70;->i:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, La/tl70;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/xl70;

    .line 14
    .line 15
    sget-object v4, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    instance-of v4, v1, La/wl70;

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    check-cast v1, La/wl70;

    .line 25
    .line 26
    iget-boolean v1, v1, La/wl70;->a:Z

    .line 27
    .line 28
    sget-object v4, La/ul70;->Q1:La/rl70;

    .line 29
    .line 30
    iget-object v0, v0, La/tl70;->k:La/ul70;

    .line 31
    .line 32
    invoke-virtual {v0}, La/ul70;->G0()La/m0r;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    iget-object v4, v4, La/m0r;->l:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 37
    .line 38
    invoke-virtual {v4}, Lcom/facebook/shimmer/ShimmerFrameLayout;->c()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, La/ul70;->G0()La/m0r;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iget-object v4, v4, La/m0r;->h:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 46
    .line 47
    invoke-virtual {v4}, Lcom/facebook/shimmer/ShimmerFrameLayout;->c()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, La/ul70;->G0()La/m0r;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget-object v4, v4, La/m0r;->l:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 55
    .line 56
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, La/ul70;->G0()La/m0r;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    iget-object v4, v4, La/m0r;->h:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 64
    .line 65
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    invoke-virtual {v0, v2}, La/ul70;->I0(Z)V

    .line 71
    .line 72
    .line 73
    :cond_0
    invoke-virtual {v0}, La/ul70;->H0()La/nm70;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v1}, La/nm70;->F()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, La/nm70;->E()V

    .line 81
    .line 82
    .line 83
    new-instance v2, La/yl70;

    .line 84
    .line 85
    iget-object v3, v1, La/nm70;->j:La/nqt;

    .line 86
    .line 87
    invoke-virtual {v3}, La/nqt;->a()La/w05;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-direct {v2, v3}, La/yl70;-><init>(La/w05;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v2}, La/nm70;->B(La/im70;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, La/nm70;->D()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, La/ul70;->H0()La/nm70;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sget-object v1, La/vl70;->a:La/vl70;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, La/nm70;->A(La/xl70;)V

    .line 107
    .line 108
    .line 109
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object v0

    .line 112
    :pswitch_0
    iget-object v1, v0, La/tl70;->j:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, La/im70;

    .line 115
    .line 116
    sget-object v4, La/wne;->a:La/wne;

    .line 117
    .line 118
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    if-eqz v1, :cond_18

    .line 123
    .line 124
    instance-of v5, v1, La/yl70;

    .line 125
    .line 126
    const/4 v6, 0x0

    .line 127
    iget-object v9, v0, La/tl70;->k:La/ul70;

    .line 128
    .line 129
    if-eqz v5, :cond_7

    .line 130
    .line 131
    check-cast v1, La/yl70;

    .line 132
    .line 133
    iget-object v0, v1, La/yl70;->a:La/w05;

    .line 134
    .line 135
    sget-object v1, La/ul70;->Q1:La/rl70;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    if-eq v0, v2, :cond_5

    .line 144
    .line 145
    const/4 v1, 0x2

    .line 146
    if-eq v0, v1, :cond_4

    .line 147
    .line 148
    const/4 v1, 0x3

    .line 149
    if-eq v0, v1, :cond_3

    .line 150
    .line 151
    const/4 v1, 0x4

    .line 152
    if-ne v0, v1, :cond_2

    .line 153
    .line 154
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iget-object v0, v0, La/m0r;->c:Landroid/widget/ImageView;

    .line 159
    .line 160
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iget-object v0, v0, La/m0r;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 168
    .line 169
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget-object v0, v0, La/m0r;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 177
    .line 178
    const-string v1, "50"

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_3

    .line 184
    .line 185
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_4

    .line 189
    .line 190
    :cond_3
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iget-object v0, v0, La/m0r;->c:Landroid/widget/ImageView;

    .line 195
    .line 196
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget-object v0, v0, La/m0r;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 204
    .line 205
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    iget-object v0, v0, La/m0r;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 213
    .line 214
    const-string v1, "25"

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_3

    .line 220
    .line 221
    :cond_4
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    iget-object v0, v0, La/m0r;->c:Landroid/widget/ImageView;

    .line 226
    .line 227
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    iget-object v0, v0, La/m0r;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 235
    .line 236
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    iget-object v0, v0, La/m0r;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 244
    .line 245
    const-string v1, "10"

    .line 246
    .line 247
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 248
    .line 249
    .line 250
    goto/16 :goto_3

    .line 251
    .line 252
    :cond_5
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    iget-object v0, v0, La/m0r;->c:Landroid/widget/ImageView;

    .line 257
    .line 258
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    iget-object v0, v0, La/m0r;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 266
    .line 267
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    iget-object v0, v0, La/m0r;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 275
    .line 276
    const-string v1, "5"

    .line 277
    .line 278
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 279
    .line 280
    .line 281
    goto/16 :goto_3

    .line 282
    .line 283
    :cond_6
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    iget-object v0, v0, La/m0r;->c:Landroid/widget/ImageView;

    .line 288
    .line 289
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    iget-object v0, v0, La/m0r;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 297
    .line 298
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 299
    .line 300
    .line 301
    goto/16 :goto_3

    .line 302
    .line 303
    :cond_7
    instance-of v0, v1, La/zl70;

    .line 304
    .line 305
    const v5, 0x7f0606da

    .line 306
    .line 307
    .line 308
    const v7, 0x7f040afc

    .line 309
    .line 310
    .line 311
    if-eqz v0, :cond_a

    .line 312
    .line 313
    check-cast v1, La/zl70;

    .line 314
    .line 315
    iget-boolean v0, v1, La/zl70;->a:Z

    .line 316
    .line 317
    sget-object v1, La/ul70;->Q1:La/rl70;

    .line 318
    .line 319
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    if-eqz v1, :cond_17

    .line 324
    .line 325
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    iget-object v2, v2, La/m0r;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 330
    .line 331
    if-eqz v0, :cond_8

    .line 332
    .line 333
    const v3, 0x7f130941

    .line 334
    .line 335
    .line 336
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    goto :goto_0

    .line 341
    :cond_8
    const v3, 0x7f130940

    .line 342
    .line 343
    .line 344
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    :goto_0
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 349
    .line 350
    .line 351
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 352
    .line 353
    invoke-static {v1, v7, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    invoke-virtual {v1, v5}, Landroid/content/Context;->getColor(I)I

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    if-eqz v0, :cond_9

    .line 362
    .line 363
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    iget-object v0, v0, La/m0r;->b:Landroid/widget/LinearLayout;

    .line 368
    .line 369
    const v4, 0x7f080251

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1, v4}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    iget-object v0, v0, La/m0r;->c:Landroid/widget/ImageView;

    .line 384
    .line 385
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    iget-object v0, v0, La/m0r;->f:Landroid/widget/FrameLayout;

    .line 397
    .line 398
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    iget-object v0, v0, La/m0r;->c:Landroid/widget/ImageView;

    .line 410
    .line 411
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    iget-object v0, v0, La/m0r;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 423
    .line 424
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 425
    .line 426
    .line 427
    goto/16 :goto_3

    .line 428
    .line 429
    :cond_9
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    iget-object v0, v0, La/m0r;->b:Landroid/widget/LinearLayout;

    .line 434
    .line 435
    const v4, 0x7f080253

    .line 436
    .line 437
    .line 438
    invoke-virtual {v1, v4}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    iget-object v0, v0, La/m0r;->c:Landroid/widget/ImageView;

    .line 450
    .line 451
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    iget-object v0, v0, La/m0r;->f:Landroid/widget/FrameLayout;

    .line 463
    .line 464
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    iget-object v0, v0, La/m0r;->c:Landroid/widget/ImageView;

    .line 476
    .line 477
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    iget-object v0, v0, La/m0r;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 489
    .line 490
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 491
    .line 492
    .line 493
    goto/16 :goto_3

    .line 494
    .line 495
    :cond_a
    instance-of v0, v1, La/am70;

    .line 496
    .line 497
    if-eqz v0, :cond_b

    .line 498
    .line 499
    check-cast v1, La/am70;

    .line 500
    .line 501
    iget-boolean v0, v1, La/am70;->a:Z

    .line 502
    .line 503
    sget-object v1, La/ul70;->Q1:La/rl70;

    .line 504
    .line 505
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    iget-object v1, v1, La/m0r;->b:Landroid/widget/LinearLayout;

    .line 510
    .line 511
    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    iget-object v1, v1, La/m0r;->g:Landroid/widget/LinearLayout;

    .line 519
    .line 520
    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    iget-object v1, v1, La/m0r;->k:Landroid/widget/LinearLayout;

    .line 528
    .line 529
    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 530
    .line 531
    .line 532
    goto/16 :goto_3

    .line 533
    .line 534
    :cond_b
    instance-of v0, v1, La/bm70;

    .line 535
    .line 536
    if-eqz v0, :cond_c

    .line 537
    .line 538
    sget-object v0, La/ul70;->Q1:La/rl70;

    .line 539
    .line 540
    invoke-virtual {v9, v6}, La/ul70;->I0(Z)V

    .line 541
    .line 542
    .line 543
    goto/16 :goto_3

    .line 544
    .line 545
    :cond_c
    instance-of v0, v1, La/cm70;

    .line 546
    .line 547
    if-eqz v0, :cond_d

    .line 548
    .line 549
    check-cast v1, La/cm70;

    .line 550
    .line 551
    iget v0, v1, La/cm70;->a:I

    .line 552
    .line 553
    sget-object v1, La/ul70;->Q1:La/rl70;

    .line 554
    .line 555
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    iget-object v1, v1, La/m0r;->d:Landroidx/appcompat/widget/AppCompatTextView;

    .line 560
    .line 561
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 566
    .line 567
    .line 568
    goto/16 :goto_3

    .line 569
    .line 570
    :cond_d
    instance-of v0, v1, La/dm70;

    .line 571
    .line 572
    if-eqz v0, :cond_10

    .line 573
    .line 574
    check-cast v1, La/dm70;

    .line 575
    .line 576
    iget-boolean v0, v1, La/dm70;->a:Z

    .line 577
    .line 578
    sget-object v1, La/ul70;->Q1:La/rl70;

    .line 579
    .line 580
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    iget-object v1, v1, La/m0r;->b:Landroid/widget/LinearLayout;

    .line 585
    .line 586
    if-eqz v0, :cond_e

    .line 587
    .line 588
    move v2, v6

    .line 589
    goto :goto_1

    .line 590
    :cond_e
    move v2, v3

    .line 591
    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    iget-object v1, v1, La/m0r;->j:Landroid/view/View;

    .line 599
    .line 600
    if-nez v0, :cond_f

    .line 601
    .line 602
    move v3, v6

    .line 603
    :cond_f
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 604
    .line 605
    .line 606
    goto/16 :goto_3

    .line 607
    .line 608
    :cond_10
    instance-of v0, v1, La/em70;

    .line 609
    .line 610
    if-eqz v0, :cond_13

    .line 611
    .line 612
    check-cast v1, La/em70;

    .line 613
    .line 614
    iget-boolean v0, v1, La/em70;->a:Z

    .line 615
    .line 616
    sget-object v1, La/ul70;->Q1:La/rl70;

    .line 617
    .line 618
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    if-eqz v1, :cond_17

    .line 623
    .line 624
    if-eqz v0, :cond_11

    .line 625
    .line 626
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 627
    .line 628
    invoke-static {v1, v7, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    goto :goto_2

    .line 633
    :cond_11
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 634
    .line 635
    invoke-virtual {v1, v5}, Landroid/content/Context;->getColor(I)I

    .line 636
    .line 637
    .line 638
    move-result v0

    .line 639
    :goto_2
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    iget-object v1, v1, La/m0r;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 644
    .line 645
    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 650
    .line 651
    .line 652
    invoke-static {v6, v1}, La/tx3;->G(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 657
    .line 658
    if-eqz v1, :cond_12

    .line 659
    .line 660
    sget-object v2, La/b4d;->a:La/b4d;

    .line 661
    .line 662
    invoke-static {v1, v0}, La/vcc;->b0(Landroid/graphics/drawable/Drawable;I)V

    .line 663
    .line 664
    .line 665
    :cond_12
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    iget-object v1, v1, La/m0r;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 670
    .line 671
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 672
    .line 673
    .line 674
    goto :goto_3

    .line 675
    :cond_13
    instance-of v0, v1, La/gm70;

    .line 676
    .line 677
    if-eqz v0, :cond_14

    .line 678
    .line 679
    sget-object v0, La/ul70;->Q1:La/rl70;

    .line 680
    .line 681
    invoke-virtual {v9, v2}, La/ul70;->I0(Z)V

    .line 682
    .line 683
    .line 684
    goto :goto_3

    .line 685
    :cond_14
    instance-of v0, v1, La/hm70;

    .line 686
    .line 687
    if-eqz v0, :cond_16

    .line 688
    .line 689
    sget-object v0, La/ul70;->Q1:La/rl70;

    .line 690
    .line 691
    iget-object v7, v9, La/ul70;->L1:La/wdk0;

    .line 692
    .line 693
    if-eqz v7, :cond_15

    .line 694
    .line 695
    new-instance v8, La/xdk0;

    .line 696
    .line 697
    sget-object v11, La/pek0;->a:La/pek0;

    .line 698
    .line 699
    const v0, 0x7f1317da

    .line 700
    .line 701
    .line 702
    invoke-virtual {v9, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v12

    .line 706
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    const/16 v16, 0x0

    .line 710
    .line 711
    const/16 v17, 0x7c

    .line 712
    .line 713
    const/4 v13, 0x0

    .line 714
    const/4 v14, 0x0

    .line 715
    const/4 v15, 0x0

    .line 716
    move-object v10, v8

    .line 717
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 718
    .line 719
    .line 720
    const/16 v14, 0x3fc

    .line 721
    .line 722
    const/4 v10, 0x0

    .line 723
    const/4 v11, 0x0

    .line 724
    const/4 v12, 0x0

    .line 725
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 726
    .line 727
    .line 728
    goto :goto_3

    .line 729
    :cond_15
    const-string v0, "snackbarManager"

    .line 730
    .line 731
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 732
    .line 733
    .line 734
    throw v4

    .line 735
    :cond_16
    instance-of v0, v1, La/fm70;

    .line 736
    .line 737
    if-eqz v0, :cond_18

    .line 738
    .line 739
    sget-object v0, La/ul70;->Q1:La/rl70;

    .line 740
    .line 741
    invoke-virtual {v9}, La/ul70;->G0()La/m0r;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    iget-object v0, v0, La/m0r;->g:Landroid/widget/LinearLayout;

    .line 746
    .line 747
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 748
    .line 749
    .line 750
    :cond_17
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 751
    .line 752
    goto :goto_4

    .line 753
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 754
    .line 755
    .line 756
    :goto_4
    return-object v4

    .line 757
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
