.class public final La/ix2;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/z29;
.implements La/qai0;
.implements La/lky;
.implements La/v6z;
.implements La/hps0;


# instance fields
.field public final o:La/m51;

.field public final synthetic p:Landroidx/compose/ui/platform/AndroidComposeView;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 1

    .line 1
    iput-object p1, p0, La/ix2;->p:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, La/m51;

    .line 7
    .line 8
    const/16 v0, 0x1a

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, La/m51;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/ix2;->o:La/m51;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a0(La/s460;La/gj4;La/zje;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, La/s460;->Y(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p2}, La/gj4;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, La/jge0;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, La/jge0;->m(J)La/jge0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-static {p1}, La/e9x;->V(La/jge0;)Landroid/graphics/Rect;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const/4 p2, 0x0

    .line 28
    iget-object p0, p0, La/ix2;->p:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;Z)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0
.end method

.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 6

    .line 1
    invoke-interface {p2, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget v1, p2, La/pu90;->a:I

    .line 6
    .line 7
    iget v2, p2, La/pu90;->b:I

    .line 8
    .line 9
    new-instance v5, La/y1;

    .line 10
    .line 11
    const/4 p3, 0x3

    .line 12
    invoke-direct {v5, p2, p3}, La/y1;-><init>(La/pu90;B)V

    .line 13
    .line 14
    .line 15
    sget-object v3, La/lun;->a:La/lun;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v4, p0, La/ix2;->o:La/m51;

    .line 21
    .line 22
    move-object v0, p1

    .line 23
    invoke-interface/range {v0 .. v5}, La/vj30;->D0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/uj30;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final c0(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final j()Ljava/lang/Object;
    .locals 0

    .line 1
    const-string p0, "androidx.compose.ui.layout.WindowInsetsRulers"

    .line 2
    .line 3
    return-object p0
.end method

.method public final l0(Landroid/view/KeyEvent;)Z
    .locals 11

    .line 1
    sget-object v0, La/spq;->a:[I

    .line 2
    .line 3
    invoke-static {p1}, La/n7x;->C(Landroid/view/KeyEvent;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sget-wide v2, La/qjy;->b:J

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, La/qjy;->a(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    new-instance v0, La/jpq;

    .line 19
    .line 20
    invoke-direct {v0, v5}, La/jpq;-><init>(I)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_5

    .line 24
    .line 25
    :cond_0
    sget-wide v6, La/qjy;->c:J

    .line 26
    .line 27
    invoke-static {v0, v1, v6, v7}, La/qjy;->a(JJ)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    new-instance v0, La/jpq;

    .line 34
    .line 35
    invoke-direct {v0, v4}, La/jpq;-><init>(I)V

    .line 36
    .line 37
    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_1
    sget-wide v6, La/qjy;->p:J

    .line 41
    .line 42
    invoke-static {v0, v1, v6, v7}, La/qjy;->a(JJ)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    move v0, v5

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v0, v4

    .line 57
    :goto_0
    new-instance v1, La/jpq;

    .line 58
    .line 59
    invoke-direct {v1, v0}, La/jpq;-><init>(I)V

    .line 60
    .line 61
    .line 62
    move-object v0, v1

    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :cond_3
    sget-wide v6, La/qjy;->g:J

    .line 66
    .line 67
    invoke-static {v0, v1, v6, v7}, La/qjy;->a(JJ)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    new-instance v0, La/jpq;

    .line 74
    .line 75
    const/4 v1, 0x4

    .line 76
    invoke-direct {v0, v1}, La/jpq;-><init>(I)V

    .line 77
    .line 78
    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :cond_4
    sget-wide v6, La/qjy;->f:J

    .line 82
    .line 83
    invoke-static {v0, v1, v6, v7}, La/qjy;->a(JJ)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_5

    .line 88
    .line 89
    new-instance v0, La/jpq;

    .line 90
    .line 91
    const/4 v1, 0x3

    .line 92
    invoke-direct {v0, v1}, La/jpq;-><init>(I)V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_5

    .line 96
    .line 97
    :cond_5
    sget-wide v6, La/qjy;->d:J

    .line 98
    .line 99
    invoke-static {v0, v1, v6, v7}, La/qjy;->a(JJ)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_d

    .line 104
    .line 105
    sget-wide v6, La/qjy;->C:J

    .line 106
    .line 107
    invoke-static {v0, v1, v6, v7}, La/qjy;->a(JJ)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_6

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_6
    sget-wide v6, La/qjy;->e:J

    .line 115
    .line 116
    invoke-static {v0, v1, v6, v7}, La/qjy;->a(JJ)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-nez v2, :cond_c

    .line 121
    .line 122
    sget-wide v6, La/qjy;->D:J

    .line 123
    .line 124
    invoke-static {v0, v1, v6, v7}, La/qjy;->a(JJ)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_7

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_7
    sget-wide v6, La/qjy;->h:J

    .line 132
    .line 133
    invoke-static {v0, v1, v6, v7}, La/qjy;->a(JJ)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-nez v2, :cond_b

    .line 138
    .line 139
    sget-wide v6, La/qjy;->r:J

    .line 140
    .line 141
    invoke-static {v0, v1, v6, v7}, La/qjy;->a(JJ)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-nez v2, :cond_b

    .line 146
    .line 147
    sget-wide v6, La/qjy;->E:J

    .line 148
    .line 149
    invoke-static {v0, v1, v6, v7}, La/qjy;->a(JJ)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_8

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_8
    sget-wide v6, La/qjy;->a:J

    .line 157
    .line 158
    invoke-static {v0, v1, v6, v7}, La/qjy;->a(JJ)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-nez v2, :cond_a

    .line 163
    .line 164
    sget-wide v6, La/qjy;->u:J

    .line 165
    .line 166
    invoke-static {v0, v1, v6, v7}, La/qjy;->a(JJ)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_9

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_9
    move-object v0, v3

    .line 174
    goto :goto_5

    .line 175
    :cond_a
    :goto_1
    new-instance v0, La/jpq;

    .line 176
    .line 177
    const/16 v1, 0x8

    .line 178
    .line 179
    invoke-direct {v0, v1}, La/jpq;-><init>(I)V

    .line 180
    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_b
    :goto_2
    new-instance v0, La/jpq;

    .line 184
    .line 185
    const/4 v1, 0x7

    .line 186
    invoke-direct {v0, v1}, La/jpq;-><init>(I)V

    .line 187
    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_c
    :goto_3
    new-instance v0, La/jpq;

    .line 191
    .line 192
    const/4 v1, 0x6

    .line 193
    invoke-direct {v0, v1}, La/jpq;-><init>(I)V

    .line 194
    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_d
    :goto_4
    new-instance v0, La/jpq;

    .line 198
    .line 199
    const/4 v1, 0x5

    .line 200
    invoke-direct {v0, v1}, La/jpq;-><init>(I)V

    .line 201
    .line 202
    .line 203
    :goto_5
    const/4 v1, 0x0

    .line 204
    if-eqz v0, :cond_23

    .line 205
    .line 206
    iget v2, v0, La/jpq;->a:I

    .line 207
    .line 208
    invoke-static {p1}, La/n7x;->H(Landroid/view/KeyEvent;)I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-ne v6, v5, :cond_23

    .line 213
    .line 214
    sget-boolean v6, La/ebc;->a:Z

    .line 215
    .line 216
    iget-object p0, p0, La/ix2;->p:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 217
    .line 218
    if-eqz v6, :cond_16

    .line 219
    .line 220
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    check-cast v3, La/ypq;

    .line 225
    .line 226
    invoke-virtual {v3}, La/ypq;->h()La/nqq;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    if-eqz v3, :cond_f

    .line 231
    .line 232
    iget-boolean v3, v3, La/nqq;->o:Z

    .line 233
    .line 234
    if-ne v3, v4, :cond_f

    .line 235
    .line 236
    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->u(I)Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    if-eqz v3, :cond_f

    .line 241
    .line 242
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getPlayNavigationSoundEffect$ui()Lkotlin/jvm/functions/Function2;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    if-lez p1, :cond_e

    .line 251
    .line 252
    move v1, v4

    .line 253
    :cond_e
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-interface {p0, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    return v4

    .line 261
    :cond_f
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getEmbeddedViewFocusRect()La/jge0;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    new-instance v7, La/hx2;

    .line 270
    .line 271
    invoke-direct {v7, v0, v1}, La/hx2;-><init>(La/jpq;B)V

    .line 272
    .line 273
    .line 274
    check-cast v6, La/ypq;

    .line 275
    .line 276
    invoke-virtual {v6, v2, v3, v7}, La/ypq;->g(ILa/jge0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    if-eqz v3, :cond_22

    .line 281
    .line 282
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    if-eqz v3, :cond_11

    .line 287
    .line 288
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getPlayNavigationSoundEffect$ui()Lkotlin/jvm/functions/Function2;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 293
    .line 294
    .line 295
    move-result p1

    .line 296
    if-lez p1, :cond_10

    .line 297
    .line 298
    move v1, v4

    .line 299
    :cond_10
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    invoke-interface {p0, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    return v4

    .line 307
    :cond_11
    if-ne v2, v4, :cond_12

    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_12
    if-ne v2, v5, :cond_15

    .line 311
    .line 312
    :goto_6
    invoke-static {v2}, La/spq;->c(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    if-eqz p1, :cond_13

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    :cond_13
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    check-cast v0, Landroid/view/ViewGroup;

    .line 334
    .line 335
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-virtual {p1, v0, v3, v5}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    if-eqz p1, :cond_14

    .line 344
    .line 345
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result p1

    .line 349
    if-eqz p1, :cond_23

    .line 350
    .line 351
    :cond_14
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    check-cast p0, La/ypq;

    .line 356
    .line 357
    invoke-virtual {p0, v2}, La/ypq;->j(I)Z

    .line 358
    .line 359
    .line 360
    move-result p0

    .line 361
    return p0

    .line 362
    :cond_15
    return v1

    .line 363
    :cond_16
    invoke-static {v2}, La/spq;->c(I)Ljava/lang/Integer;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getEmbeddedViewFocusRect()La/jge0;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 372
    .line 373
    .line 374
    move-result-object v8

    .line 375
    new-instance v9, La/hx2;

    .line 376
    .line 377
    invoke-direct {v9, v0, v4}, La/hx2;-><init>(La/jpq;B)V

    .line 378
    .line 379
    .line 380
    check-cast v8, La/ypq;

    .line 381
    .line 382
    invoke-virtual {v8, v2, v7, v9}, La/ypq;->g(ILa/jge0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 383
    .line 384
    .line 385
    move-result-object v8

    .line 386
    if-eqz v8, :cond_22

    .line 387
    .line 388
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 389
    .line 390
    .line 391
    move-result v8

    .line 392
    if-eqz v8, :cond_18

    .line 393
    .line 394
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getPlayNavigationSoundEffect$ui()Lkotlin/jvm/functions/Function2;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 399
    .line 400
    .line 401
    move-result p1

    .line 402
    if-lez p1, :cond_17

    .line 403
    .line 404
    move v1, v4

    .line 405
    :cond_17
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    invoke-interface {p0, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    return v4

    .line 413
    :cond_18
    if-ne v2, v4, :cond_19

    .line 414
    .line 415
    goto :goto_7

    .line 416
    :cond_19
    if-ne v2, v5, :cond_21

    .line 417
    .line 418
    :goto_7
    if-eqz v6, :cond_1f

    .line 419
    .line 420
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 421
    .line 422
    .line 423
    move-result p1

    .line 424
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 425
    .line 426
    .line 427
    move-result-object v8

    .line 428
    move-object v9, p0

    .line 429
    :cond_1a
    if-eqz v9, :cond_1b

    .line 430
    .line 431
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 432
    .line 433
    .line 434
    move-result-object v10

    .line 435
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    check-cast v10, Landroid/view/ViewGroup;

    .line 439
    .line 440
    invoke-virtual {v8, v10, v9, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 441
    .line 442
    .line 443
    move-result-object v9

    .line 444
    if-eqz v9, :cond_1a

    .line 445
    .line 446
    invoke-static {p0, v9}, La/cy2;->y(Landroid/view/View;Landroid/view/View;)Z

    .line 447
    .line 448
    .line 449
    move-result v10

    .line 450
    if-nez v10, :cond_1a

    .line 451
    .line 452
    goto :goto_8

    .line 453
    :cond_1b
    move-object v9, v3

    .line 454
    :goto_8
    invoke-static {v9, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result p1

    .line 458
    if-nez p1, :cond_1c

    .line 459
    .line 460
    goto :goto_9

    .line 461
    :cond_1c
    move-object v9, v3

    .line 462
    :goto_9
    if-eqz v9, :cond_1f

    .line 463
    .line 464
    if-eqz v7, :cond_1d

    .line 465
    .line 466
    invoke-static {v7}, La/e9x;->V(La/jge0;)Landroid/graphics/Rect;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    goto :goto_a

    .line 471
    :cond_1d
    move-object p1, v3

    .line 472
    :goto_a
    if-eqz p1, :cond_1e

    .line 473
    .line 474
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 475
    .line 476
    .line 477
    move-result-object v7

    .line 478
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    check-cast v7, Landroid/view/ViewGroup;

    .line 482
    .line 483
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    .line 484
    .line 485
    .line 486
    move-result-object v8

    .line 487
    invoke-virtual {v7, v8, p1}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v7, v9, p1}, Landroid/view/ViewGroup;->offsetRectIntoDescendantCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 491
    .line 492
    .line 493
    invoke-static {v9, v6, p1}, La/spq;->b(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z

    .line 494
    .line 495
    .line 496
    move-result p1

    .line 497
    if-eqz p1, :cond_1f

    .line 498
    .line 499
    goto :goto_b

    .line 500
    :cond_1e
    const-string p0, "Invalid rect"

    .line 501
    .line 502
    invoke-static {p0}, La/cs0;->g(Ljava/lang/String;)La/rsy;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    throw p0

    .line 507
    :cond_1f
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 508
    .line 509
    .line 510
    move-result-object p1

    .line 511
    check-cast p1, La/ypq;

    .line 512
    .line 513
    invoke-virtual {p1, v2, v1, v1}, La/ypq;->d(IZZ)Z

    .line 514
    .line 515
    .line 516
    move-result p1

    .line 517
    if-nez p1, :cond_20

    .line 518
    .line 519
    goto :goto_b

    .line 520
    :cond_20
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()La/wpq;

    .line 521
    .line 522
    .line 523
    move-result-object p0

    .line 524
    new-instance p1, La/hx2;

    .line 525
    .line 526
    invoke-direct {p1, v0, v5}, La/hx2;-><init>(La/jpq;B)V

    .line 527
    .line 528
    .line 529
    check-cast p0, La/ypq;

    .line 530
    .line 531
    invoke-virtual {p0, v2, v3, p1}, La/ypq;->g(ILa/jge0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 532
    .line 533
    .line 534
    move-result-object p0

    .line 535
    if-eqz p0, :cond_22

    .line 536
    .line 537
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 538
    .line 539
    .line 540
    move-result p0

    .line 541
    return p0

    .line 542
    :cond_21
    return v1

    .line 543
    :cond_22
    :goto_b
    return v4

    .line 544
    :cond_23
    return v1
.end method

.method public final x0(La/abi0;)V
    .locals 0

    .line 1
    return-void
.end method
