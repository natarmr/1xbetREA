.class public final synthetic La/xzs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xzs;->a:B

    iput-object p1, p0, La/xzs;->b:Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xzs;->a:B

    .line 4
    .line 5
    const/16 v2, 0x11

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    iget-object v0, v0, La/xzs;->b:Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->k:I

    .line 16
    .line 17
    new-instance v2, Landroid/view/WindowManager$LayoutParams;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const v3, 0x7f07016c

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    float-to-int v3, v1

    .line 31
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const v1, 0x7f07016b

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    float-to-int v4, v0

    .line 43
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/16 v1, 0x1a

    .line 46
    .line 47
    if-lt v0, v1, :cond_0

    .line 48
    .line 49
    const/16 v0, 0x7f6

    .line 50
    .line 51
    :goto_0
    move v5, v0

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    const/16 v0, 0x7d3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :goto_1
    const v6, 0x40008

    .line 57
    .line 58
    .line 59
    const/4 v7, -0x3

    .line 60
    invoke-direct/range {v2 .. v7}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 61
    .line 62
    .line 63
    return-object v2

    .line 64
    :pswitch_0
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->k:I

    .line 65
    .line 66
    const-string v1, "window"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    check-cast v0, Landroid/view/WindowManager;

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_1
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->k:I

    .line 79
    .line 80
    new-instance v1, Landroid/widget/FrameLayout;

    .line 81
    .line 82
    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 86
    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    invoke-virtual {v1, v3}, Landroid/view/View;->setClickable(Z)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 93
    .line 94
    .line 95
    new-instance v3, Landroid/widget/TextView;

    .line 96
    .line 97
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 98
    .line 99
    .line 100
    const v4, 0x7f1307c4

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(I)V

    .line 104
    .line 105
    .line 106
    const v4, 0x7f0606da

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v4}, Landroid/content/Context;->getColor(I)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 114
    .line 115
    .line 116
    const v0, 0x7f140439

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 120
    .line 121
    .line 122
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 123
    .line 124
    const/4 v4, -0x2

    .line 125
    invoke-direct {v0, v4, v4, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 129
    .line 130
    .line 131
    return-object v1

    .line 132
    :pswitch_2
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->k:I

    .line 133
    .line 134
    new-instance v1, Landroid/widget/FrameLayout;

    .line 135
    .line 136
    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 140
    .line 141
    .line 142
    new-instance v3, La/q10;

    .line 143
    .line 144
    const/16 v4, 0x17

    .line 145
    .line 146
    invoke-direct {v3, v0, v4}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    .line 151
    .line 152
    new-instance v3, Landroid/widget/ImageView;

    .line 153
    .line 154
    invoke-direct {v3, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 155
    .line 156
    .line 157
    const v0, 0x7f08082e

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 161
    .line 162
    .line 163
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 164
    .line 165
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    const v5, 0x7f0706a9

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    invoke-direct {v0, v4, v5, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 188
    .line 189
    .line 190
    return-object v1

    .line 191
    :pswitch_3
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->k:I

    .line 192
    .line 193
    new-instance v1, Landroid/view/View;

    .line 194
    .line 195
    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 199
    .line 200
    .line 201
    const v2, 0x7f0606aa

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v2}, Landroid/content/Context;->getColor(I)I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 209
    .line 210
    .line 211
    return-object v1

    .line 212
    :pswitch_4
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->k:I

    .line 213
    .line 214
    new-instance v1, Landroid/widget/FrameLayout;

    .line 215
    .line 216
    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 217
    .line 218
    .line 219
    invoke-static {}, La/cy7;->c()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 224
    .line 225
    .line 226
    return-object v1

    .line 227
    :pswitch_5
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->k:I

    .line 228
    .line 229
    new-instance v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 230
    .line 231
    invoke-direct {v1, v0, v3}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 232
    .line 233
    .line 234
    return-object v1

    .line 235
    :pswitch_6
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->k:I

    .line 236
    .line 237
    invoke-virtual {v0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    instance-of v1, v0, La/af3;

    .line 245
    .line 246
    if-eqz v1, :cond_1

    .line 247
    .line 248
    check-cast v0, La/af3;

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_1
    move-object v0, v3

    .line 252
    :goto_2
    const-class v1, La/n69;

    .line 253
    .line 254
    if-eqz v0, :cond_4

    .line 255
    .line 256
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    check-cast v0, La/o5d0;

    .line 265
    .line 266
    if-eqz v0, :cond_2

    .line 267
    .line 268
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    check-cast v0, La/ze3;

    .line 273
    .line 274
    goto :goto_3

    .line 275
    :cond_2
    move-object v0, v3

    .line 276
    :goto_3
    instance-of v2, v0, La/n69;

    .line 277
    .line 278
    if-nez v2, :cond_3

    .line 279
    .line 280
    move-object v0, v3

    .line 281
    :cond_3
    check-cast v0, La/n69;

    .line 282
    .line 283
    if-eqz v0, :cond_4

    .line 284
    .line 285
    const-class v1, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;

    .line 286
    .line 287
    sget-object v2, La/sre0;->a:La/tre0;

    .line 288
    .line 289
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    invoke-interface {v1}, La/sgy;->J()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    iget-object v3, v0, La/n69;->a:La/us00;

    .line 297
    .line 298
    iget-object v4, v0, La/n69;->b:La/oeg0;

    .line 299
    .line 300
    iget-object v5, v0, La/n69;->c:La/nhv0;

    .line 301
    .line 302
    iget-object v6, v0, La/n69;->d:La/ysr;

    .line 303
    .line 304
    iget-object v9, v0, La/n69;->g:La/m49;

    .line 305
    .line 306
    iget-object v10, v0, La/n69;->h:La/n49;

    .line 307
    .line 308
    iget-object v11, v0, La/n69;->i:La/m1e;

    .line 309
    .line 310
    iget-object v12, v0, La/n69;->j:La/mne;

    .line 311
    .line 312
    iget-object v7, v0, La/n69;->e:La/atr;

    .line 313
    .line 314
    iget-object v8, v0, La/n69;->f:La/rsr;

    .line 315
    .line 316
    iget-object v13, v0, La/n69;->k:La/meu0;

    .line 317
    .line 318
    iget-object v14, v0, La/n69;->l:La/mi70;

    .line 319
    .line 320
    iget-object v15, v0, La/n69;->m:La/b3c0;

    .line 321
    .line 322
    iget-object v1, v0, La/n69;->n:La/gst0;

    .line 323
    .line 324
    iget-object v2, v0, La/n69;->o:La/ik4;

    .line 325
    .line 326
    move-object/from16 v16, v1

    .line 327
    .line 328
    iget-object v1, v0, La/n69;->p:La/vd1;

    .line 329
    .line 330
    move-object/from16 v18, v1

    .line 331
    .line 332
    iget-object v1, v0, La/n69;->q:La/pru;

    .line 333
    .line 334
    move-object/from16 v19, v1

    .line 335
    .line 336
    iget-object v1, v0, La/n69;->r:La/r9u;

    .line 337
    .line 338
    move-object/from16 v20, v1

    .line 339
    .line 340
    iget-object v1, v0, La/n69;->s:La/c49;

    .line 341
    .line 342
    iget-object v0, v0, La/n69;->t:La/viu;

    .line 343
    .line 344
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    move-object/from16 v17, v2

    .line 384
    .line 385
    new-instance v2, La/uai;

    .line 386
    .line 387
    move-object/from16 v22, v0

    .line 388
    .line 389
    move-object/from16 v21, v1

    .line 390
    .line 391
    invoke-direct/range {v2 .. v22}, La/uai;-><init>(La/us00;La/oeg0;La/nhv0;La/ysr;La/atr;La/rsr;La/m49;La/n49;La/m1e;La/mne;La/meu0;La/mi70;La/b3c0;La/gst0;La/ik4;La/vd1;La/pru;La/r9u;La/c49;La/viu;)V

    .line 392
    .line 393
    .line 394
    move-object v3, v2

    .line 395
    goto :goto_4

    .line 396
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 397
    .line 398
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    :goto_4
    return-object v3

    .line 406
    nop

    .line 407
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
