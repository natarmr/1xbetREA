.class public final La/n0g;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/o0g;


# direct methods
.method public synthetic constructor <init>(La/o0g;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/n0g;->i:B

    iput-object p1, p0, La/n0g;->k:La/o0g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/n0g;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/n0g;->k:La/o0g;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/n0g;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/n0g;-><init>(La/o0g;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/n0g;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/n0g;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/n0g;-><init>(La/o0g;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/n0g;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/n0g;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/q0g;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/n0g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/n0g;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/n0g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/z9o;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/n0g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/n0g;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/n0g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/n0g;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/n0g;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/q0g;

    .line 9
    .line 10
    sget-object v1, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p1, La/o0g;->k2:La/usd;

    .line 16
    .line 17
    iget-object p0, p0, La/n0g;->k:La/o0g;

    .line 18
    .line 19
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p1, p1, La/xlg;->s:Landroid/widget/LinearLayout;

    .line 24
    .line 25
    iget-boolean v1, v0, La/q0g;->i:Z

    .line 26
    .line 27
    iget-boolean v2, v0, La/q0g;->j:Z

    .line 28
    .line 29
    iget-boolean v3, v0, La/q0g;->k:Z

    .line 30
    .line 31
    iget-boolean v4, v0, La/q0g;->p:Z

    .line 32
    .line 33
    iget-boolean v5, v0, La/q0g;->o:Z

    .line 34
    .line 35
    iget-boolean v6, v0, La/q0g;->n:Z

    .line 36
    .line 37
    const/16 v7, 0x8

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    move v1, v8

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v1, v7

    .line 45
    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object p1, p1, La/xlg;->q:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 53
    .line 54
    iget-boolean v1, v0, La/q0g;->i:Z

    .line 55
    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    move v1, v8

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move v1, v7

    .line 61
    :goto_1
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object p1, p1, La/xlg;->t:Landroid/widget/ImageView;

    .line 69
    .line 70
    iget v1, v0, La/q0g;->a:I

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p1, p1, La/xlg;->h:Landroid/widget/LinearLayout;

    .line 80
    .line 81
    if-eqz v6, :cond_2

    .line 82
    .line 83
    move v1, v8

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    move v1, v7

    .line 86
    :goto_2
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p1, p1, La/xlg;->m:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 94
    .line 95
    if-eqz v6, :cond_3

    .line 96
    .line 97
    move v1, v8

    .line 98
    goto :goto_3

    .line 99
    :cond_3
    move v1, v7

    .line 100
    :goto_3
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iget-object p1, p1, La/xlg;->i:Landroid/widget/LinearLayout;

    .line 108
    .line 109
    if-eqz v5, :cond_4

    .line 110
    .line 111
    move v1, v8

    .line 112
    goto :goto_4

    .line 113
    :cond_4
    move v1, v7

    .line 114
    :goto_4
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object p1, p1, La/xlg;->n:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 122
    .line 123
    if-eqz v5, :cond_5

    .line 124
    .line 125
    move v1, v8

    .line 126
    goto :goto_5

    .line 127
    :cond_5
    move v1, v7

    .line 128
    :goto_5
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iget-object p1, p1, La/xlg;->g:Landroid/widget/ImageView;

    .line 136
    .line 137
    iget v1, v0, La/q0g;->e:I

    .line 138
    .line 139
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    iget-object p1, p1, La/xlg;->f:Landroid/widget/ImageView;

    .line 147
    .line 148
    iget v1, v0, La/q0g;->d:I

    .line 149
    .line 150
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iget-object p1, p1, La/xlg;->w:Landroid/widget/TextView;

    .line 158
    .line 159
    iget v1, v0, La/q0g;->g:I

    .line 160
    .line 161
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iget-object p1, p1, La/xlg;->r:Landroid/widget/LinearLayout;

    .line 169
    .line 170
    if-eqz v4, :cond_6

    .line 171
    .line 172
    move v1, v8

    .line 173
    goto :goto_6

    .line 174
    :cond_6
    move v1, v7

    .line 175
    :goto_6
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    iget-object p1, p1, La/xlg;->p:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 183
    .line 184
    if-eqz v4, :cond_7

    .line 185
    .line 186
    move v1, v8

    .line 187
    goto :goto_7

    .line 188
    :cond_7
    move v1, v7

    .line 189
    :goto_7
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    iget-object p1, p1, La/xlg;->c:Landroid/widget/LinearLayout;

    .line 197
    .line 198
    if-eqz v3, :cond_8

    .line 199
    .line 200
    move v1, v8

    .line 201
    goto :goto_8

    .line 202
    :cond_8
    move v1, v7

    .line 203
    :goto_8
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    iget-object p1, p1, La/xlg;->l:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 211
    .line 212
    if-eqz v3, :cond_9

    .line 213
    .line 214
    move v1, v8

    .line 215
    goto :goto_9

    .line 216
    :cond_9
    move v1, v7

    .line 217
    :goto_9
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    iget-object p1, p1, La/xlg;->d:Landroid/widget/ImageView;

    .line 225
    .line 226
    iget v1, v0, La/q0g;->c:I

    .line 227
    .line 228
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    iget-object p1, p1, La/xlg;->e:Landroid/widget/TextView;

    .line 236
    .line 237
    iget v1, v0, La/q0g;->f:I

    .line 238
    .line 239
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    iget-object p1, p1, La/xlg;->j:Landroid/widget/LinearLayout;

    .line 247
    .line 248
    if-eqz v2, :cond_a

    .line 249
    .line 250
    move v1, v8

    .line 251
    goto :goto_a

    .line 252
    :cond_a
    move v1, v7

    .line 253
    :goto_a
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    iget-object p1, p1, La/xlg;->o:Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 261
    .line 262
    if-eqz v2, :cond_b

    .line 263
    .line 264
    move v1, v8

    .line 265
    goto :goto_b

    .line 266
    :cond_b
    move v1, v7

    .line 267
    :goto_b
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    iget-object p1, p1, La/xlg;->k:Landroid/widget/ImageView;

    .line 275
    .line 276
    iget v1, v0, La/q0g;->b:I

    .line 277
    .line 278
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    iget-object p1, p1, La/xlg;->v:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 286
    .line 287
    iget-boolean v1, v0, La/q0g;->h:Z

    .line 288
    .line 289
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    iget-object p1, p1, La/xlg;->v:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 297
    .line 298
    invoke-virtual {p1}, Landroidx/appcompat/widget/SwitchCompat;->jumpDrawablesToCurrentState()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0}, La/o0g;->T0()La/xlg;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    iget-object p0, p0, La/xlg;->u:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 306
    .line 307
    iget-boolean p1, v0, La/q0g;->m:Z

    .line 308
    .line 309
    if-eqz p1, :cond_c

    .line 310
    .line 311
    move v7, v8

    .line 312
    :cond_c
    invoke-virtual {p0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 313
    .line 314
    .line 315
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    return-object p0

    .line 318
    :pswitch_0
    iget-object v0, p0, La/n0g;->j:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v0, La/z9o;

    .line 321
    .line 322
    sget-object v1, La/wne;->a:La/wne;

    .line 323
    .line 324
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    const/4 p1, 0x0

    .line 328
    if-eqz v0, :cond_14

    .line 329
    .line 330
    instance-of v1, v0, La/x9o;

    .line 331
    .line 332
    iget-object v4, p0, La/n0g;->k:La/o0g;

    .line 333
    .line 334
    if-eqz v1, :cond_e

    .line 335
    .line 336
    invoke-virtual {v4}, La/yo8;->x0()V

    .line 337
    .line 338
    .line 339
    iget-object p0, v4, La/o0g;->g2:La/wsz;

    .line 340
    .line 341
    if-eqz p0, :cond_d

    .line 342
    .line 343
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    invoke-static {p0}, La/wsz;->i(Landroidx/fragment/app/e;)V

    .line 348
    .line 349
    .line 350
    goto/16 :goto_c

    .line 351
    .line 352
    :cond_d
    const-string p0, "marketsSettingsScreenFactory"

    .line 353
    .line 354
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    throw p1

    .line 358
    :cond_e
    instance-of p0, v0, La/u9o;

    .line 359
    .line 360
    const-string v1, "snackbarManager"

    .line 361
    .line 362
    if-eqz p0, :cond_10

    .line 363
    .line 364
    iget-object p0, v4, La/sik;->S1:Landroid/app/Dialog;

    .line 365
    .line 366
    if-eqz p0, :cond_13

    .line 367
    .line 368
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    if-eqz p0, :cond_13

    .line 373
    .line 374
    iget-object v2, v4, La/o0g;->h2:La/wdk0;

    .line 375
    .line 376
    if-eqz v2, :cond_f

    .line 377
    .line 378
    new-instance v3, La/xdk0;

    .line 379
    .line 380
    sget-object v6, La/rek0;->b:La/rek0;

    .line 381
    .line 382
    check-cast v0, La/u9o;

    .line 383
    .line 384
    iget p1, v0, La/u9o;->a:I

    .line 385
    .line 386
    invoke-virtual {v4, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v7

    .line 390
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    const/4 v11, 0x0

    .line 394
    const/16 v12, 0x7c

    .line 395
    .line 396
    const/4 v8, 0x0

    .line 397
    const/4 v9, 0x0

    .line 398
    const/4 v10, 0x0

    .line 399
    move-object v5, v3

    .line 400
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    const/16 v9, 0x3f4

    .line 408
    .line 409
    const/4 v5, 0x0

    .line 410
    const/4 v7, 0x0

    .line 411
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 412
    .line 413
    .line 414
    goto :goto_c

    .line 415
    :cond_f
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    throw p1

    .line 419
    :cond_10
    instance-of p0, v0, La/v9o;

    .line 420
    .line 421
    if-eqz p0, :cond_12

    .line 422
    .line 423
    iget-object p0, v4, La/sik;->S1:Landroid/app/Dialog;

    .line 424
    .line 425
    if-eqz p0, :cond_13

    .line 426
    .line 427
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 428
    .line 429
    .line 430
    move-result-object p0

    .line 431
    if-eqz p0, :cond_13

    .line 432
    .line 433
    iget-object v2, v4, La/o0g;->h2:La/wdk0;

    .line 434
    .line 435
    if-eqz v2, :cond_11

    .line 436
    .line 437
    new-instance v3, La/xdk0;

    .line 438
    .line 439
    sget-object v6, La/qek0;->a:La/qek0;

    .line 440
    .line 441
    const p1, 0x7f13086f

    .line 442
    .line 443
    .line 444
    invoke-virtual {v4, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v7

    .line 448
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    new-instance v11, Ljava/lang/Integer;

    .line 452
    .line 453
    const p1, 0x7f08090a

    .line 454
    .line 455
    .line 456
    invoke-direct {v11, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 457
    .line 458
    .line 459
    const/16 v12, 0x5c

    .line 460
    .line 461
    const/4 v8, 0x0

    .line 462
    const/4 v9, 0x0

    .line 463
    const/4 v10, 0x0

    .line 464
    move-object v5, v3

    .line 465
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    const/16 v9, 0x3f4

    .line 473
    .line 474
    const/4 v5, 0x0

    .line 475
    const/4 v7, 0x0

    .line 476
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 477
    .line 478
    .line 479
    goto :goto_c

    .line 480
    :cond_11
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    throw p1

    .line 484
    :cond_12
    instance-of p0, v0, La/q9o;

    .line 485
    .line 486
    if-eqz p0, :cond_14

    .line 487
    .line 488
    invoke-virtual {v4}, La/yo8;->x0()V

    .line 489
    .line 490
    .line 491
    :cond_13
    :goto_c
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 492
    .line 493
    goto :goto_d

    .line 494
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 495
    .line 496
    .line 497
    :goto_d
    return-object p1

    .line 498
    nop

    .line 499
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
