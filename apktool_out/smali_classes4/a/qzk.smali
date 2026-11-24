.class public final La/qzk;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/szk;


# direct methods
.method public synthetic constructor <init>(La/szk;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qzk;->i:B

    iput-object p1, p0, La/qzk;->k:La/szk;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qzk;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qzk;->k:La/szk;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/qzk;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/qzk;-><init>(La/szk;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/qzk;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/qzk;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/qzk;-><init>(La/szk;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/qzk;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/qzk;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/b0l;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/qzk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qzk;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qzk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/tzk;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/qzk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/qzk;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/qzk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/qzk;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/qzk;->k:La/szk;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object p0, p0, La/qzk;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, La/b0l;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    if-eqz p0, :cond_17

    .line 21
    .line 22
    instance-of p1, p0, La/uzk;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    sget-object p0, La/szk;->Q1:[La/iiy;

    .line 27
    .line 28
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p0, p0, La/szq;->b:La/e0f;

    .line 33
    .line 34
    iget-object p0, p0, La/e0f;->f:Landroid/view/View;

    .line 35
    .line 36
    check-cast p0, Landroid/widget/Button;

    .line 37
    .line 38
    invoke-virtual {p0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_a

    .line 42
    .line 43
    :cond_0
    instance-of p1, p0, La/vzk;

    .line 44
    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    sget-object p0, La/szk;->Q1:[La/iiy;

    .line 48
    .line 49
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    iget-object p0, p0, La/szq;->b:La/e0f;

    .line 54
    .line 55
    iget-object p0, p0, La/e0f;->h:Landroid/view/View;

    .line 56
    .line 57
    check-cast p0, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 58
    .line 59
    iput v2, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->u:I

    .line 60
    .line 61
    iget-boolean p1, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->q:Z

    .line 62
    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    iget-object p1, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->c:Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iget-object p1, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->d:Landroid/graphics/drawable/Drawable;

    .line 69
    .line 70
    :goto_0
    iput-object p1, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->b:Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    goto/16 :goto_a

    .line 73
    .line 74
    :cond_2
    instance-of p1, p0, La/yzk;

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    check-cast p0, La/yzk;

    .line 79
    .line 80
    iget-object p0, p0, La/yzk;->a:La/n0l;

    .line 81
    .line 82
    sget-object p1, La/szk;->Q1:[La/iiy;

    .line 83
    .line 84
    invoke-virtual {v1, v3}, La/szk;->K0(Z)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget-object p1, p1, La/szq;->b:La/e0f;

    .line 92
    .line 93
    iget-object p1, p1, La/e0f;->h:Landroid/view/View;

    .line 94
    .line 95
    check-cast p1, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 96
    .line 97
    iput v2, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->u:I

    .line 98
    .line 99
    iget-boolean v0, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->q:Z

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    iget-object v0, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->c:Landroid/graphics/drawable/Drawable;

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    iget-object v0, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->d:Landroid/graphics/drawable/Drawable;

    .line 107
    .line 108
    :goto_1
    iput-object v0, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->b:Landroid/graphics/drawable/Drawable;

    .line 109
    .line 110
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object p1, p1, La/szq;->b:La/e0f;

    .line 115
    .line 116
    iget-object p1, p1, La/e0f;->h:Landroid/view/View;

    .line 117
    .line 118
    check-cast p1, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 119
    .line 120
    const/4 v0, 0x7

    .line 121
    invoke-virtual {p1, v0}, Lorg/xplatform/domino/presentation/views/DominoHandView;->setBones(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iget-object p1, p1, La/szq;->b:La/e0f;

    .line 129
    .line 130
    iget-object p1, p1, La/e0f;->n:Landroid/view/View;

    .line 131
    .line 132
    check-cast p1, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 133
    .line 134
    iget-object v0, p0, La/n0l;->d:Ljava/util/List;

    .line 135
    .line 136
    invoke-virtual {p1, v0}, Lorg/xplatform/domino/presentation/views/DominoHandView;->setBones(Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iget-object p1, p1, La/szq;->b:La/e0f;

    .line 144
    .line 145
    iget-object p1, p1, La/e0f;->k:Landroid/view/View;

    .line 146
    .line 147
    check-cast p1, Lorg/xplatform/domino/presentation/views/DominoTableView;

    .line 148
    .line 149
    invoke-virtual {p1, v4, v4}, Lorg/xplatform/domino/presentation/views/DominoTableView;->d(Ljava/util/List;Ljava/util/List;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1, p0}, La/szk;->G0(La/n0l;)V

    .line 153
    .line 154
    .line 155
    iget-object p1, p0, La/n0l;->l:Ljava/util/List;

    .line 156
    .line 157
    if-eqz p1, :cond_4

    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-nez p1, :cond_4

    .line 164
    .line 165
    invoke-virtual {v1}, La/szk;->J0()La/l0l;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    new-instance v0, La/ozk;

    .line 170
    .line 171
    const/4 v2, 0x2

    .line 172
    invoke-direct {v0, v1, p0, v2}, La/ozk;-><init>(La/szk;La/n0l;B)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, v0}, La/l0l;->z(Lkotlin/jvm/functions/Function0;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_a

    .line 179
    .line 180
    :cond_4
    invoke-virtual {v1, p0}, La/szk;->L0(La/n0l;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, p0}, La/szk;->G0(La/n0l;)V

    .line 184
    .line 185
    .line 186
    iput-object p0, v1, La/szk;->P1:La/n0l;

    .line 187
    .line 188
    goto/16 :goto_a

    .line 189
    .line 190
    :cond_5
    instance-of p1, p0, La/xzk;

    .line 191
    .line 192
    if-eqz p1, :cond_d

    .line 193
    .line 194
    check-cast p0, La/xzk;

    .line 195
    .line 196
    iget-object p0, p0, La/xzk;->a:La/n0l;

    .line 197
    .line 198
    iget p1, p0, La/n0l;->a:I

    .line 199
    .line 200
    iget v0, p0, La/n0l;->r:I

    .line 201
    .line 202
    sget-object v4, La/szk;->Q1:[La/iiy;

    .line 203
    .line 204
    iget-object v4, v1, La/szk;->P1:La/n0l;

    .line 205
    .line 206
    if-eqz v4, :cond_6

    .line 207
    .line 208
    iget v5, v4, La/n0l;->r:I

    .line 209
    .line 210
    sub-int/2addr v5, v0

    .line 211
    goto :goto_2

    .line 212
    :cond_6
    move v5, v2

    .line 213
    :goto_2
    if-eqz v4, :cond_7

    .line 214
    .line 215
    iget v6, v4, La/n0l;->a:I

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_7
    move v6, v2

    .line 219
    :goto_3
    add-int/2addr v5, v6

    .line 220
    sub-int/2addr v5, v3

    .line 221
    if-ne v5, p1, :cond_b

    .line 222
    .line 223
    if-eqz v4, :cond_8

    .line 224
    .line 225
    iget v5, v4, La/n0l;->r:I

    .line 226
    .line 227
    if-ne v5, v0, :cond_8

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_8
    if-eqz v4, :cond_9

    .line 231
    .line 232
    iget v0, v4, La/n0l;->a:I

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_9
    move v0, v2

    .line 236
    :goto_4
    sub-int/2addr p1, v0

    .line 237
    add-int/2addr p1, v3

    .line 238
    :goto_5
    if-ge v2, p1, :cond_a

    .line 239
    .line 240
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    iget-object v0, v0, La/szq;->b:La/e0f;

    .line 245
    .line 246
    iget-object v0, v0, La/e0f;->h:Landroid/view/View;

    .line 247
    .line 248
    check-cast v0, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 249
    .line 250
    invoke-virtual {v0}, Lorg/xplatform/domino/presentation/views/DominoHandView;->c()V

    .line 251
    .line 252
    .line 253
    add-int/lit8 v2, v2, 0x1

    .line 254
    .line 255
    goto :goto_5

    .line 256
    :cond_a
    :goto_6
    invoke-virtual {v1}, La/szk;->J0()La/l0l;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    new-instance v0, La/ozk;

    .line 261
    .line 262
    invoke-direct {v0, v1, p0, v3}, La/ozk;-><init>(La/szk;La/n0l;B)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, v0}, La/l0l;->z(Lkotlin/jvm/functions/Function0;)V

    .line 266
    .line 267
    .line 268
    goto/16 :goto_a

    .line 269
    .line 270
    :cond_b
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    iget-object v0, v0, La/szq;->b:La/e0f;

    .line 275
    .line 276
    iget-object v0, v0, La/e0f;->h:Landroid/view/View;

    .line 277
    .line 278
    check-cast v0, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 279
    .line 280
    iget-object v0, v0, Lorg/xplatform/domino/presentation/views/DominoHandView;->e:Ljava/util/ArrayList;

    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-le p1, v0, :cond_c

    .line 287
    .line 288
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    iget-object v0, v0, La/szq;->b:La/e0f;

    .line 293
    .line 294
    iget-object v0, v0, La/e0f;->h:Landroid/view/View;

    .line 295
    .line 296
    check-cast v0, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 297
    .line 298
    iget-object v0, v0, Lorg/xplatform/domino/presentation/views/DominoHandView;->e:Ljava/util/ArrayList;

    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    sub-int/2addr p1, v0

    .line 305
    :goto_7
    if-ge v2, p1, :cond_c

    .line 306
    .line 307
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    iget-object v0, v0, La/szq;->b:La/e0f;

    .line 312
    .line 313
    iget-object v0, v0, La/e0f;->h:Landroid/view/View;

    .line 314
    .line 315
    check-cast v0, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 316
    .line 317
    invoke-virtual {v0}, Lorg/xplatform/domino/presentation/views/DominoHandView;->c()V

    .line 318
    .line 319
    .line 320
    add-int/lit8 v2, v2, 0x1

    .line 321
    .line 322
    goto :goto_7

    .line 323
    :cond_c
    invoke-virtual {v1, p0}, La/szk;->L0(La/n0l;)V

    .line 324
    .line 325
    .line 326
    iput-object p0, v1, La/szk;->P1:La/n0l;

    .line 327
    .line 328
    goto/16 :goto_a

    .line 329
    .line 330
    :cond_d
    instance-of p1, p0, La/zzk;

    .line 331
    .line 332
    if-eqz p1, :cond_15

    .line 333
    .line 334
    check-cast p0, La/zzk;

    .line 335
    .line 336
    iget-object p0, p0, La/zzk;->a:La/n0l;

    .line 337
    .line 338
    sget-object p1, La/szk;->Q1:[La/iiy;

    .line 339
    .line 340
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    iget-object p1, p1, La/szq;->b:La/e0f;

    .line 345
    .line 346
    iget-object p1, p1, La/e0f;->n:Landroid/view/View;

    .line 347
    .line 348
    check-cast p1, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 349
    .line 350
    iget-object v0, p0, La/n0l;->d:Ljava/util/List;

    .line 351
    .line 352
    if-nez v0, :cond_e

    .line 353
    .line 354
    sget-object v0, La/iun;->a:La/iun;

    .line 355
    .line 356
    :cond_e
    iget-object v5, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->e:Ljava/util/ArrayList;

    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 366
    .line 367
    .line 368
    move-result v6

    .line 369
    if-eqz v6, :cond_14

    .line 370
    .line 371
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    check-cast v6, Ljava/util/List;

    .line 376
    .line 377
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    :cond_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v8

    .line 385
    if-eqz v8, :cond_11

    .line 386
    .line 387
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v8

    .line 391
    check-cast v8, La/qb8;

    .line 392
    .line 393
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v9

    .line 397
    check-cast v9, Ljava/lang/Number;

    .line 398
    .line 399
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 400
    .line 401
    .line 402
    move-result v9

    .line 403
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v10

    .line 407
    check-cast v10, Ljava/lang/Number;

    .line 408
    .line 409
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 410
    .line 411
    .line 412
    move-result v10

    .line 413
    iget v11, v8, La/qb8;->p:I

    .line 414
    .line 415
    if-ne v9, v11, :cond_10

    .line 416
    .line 417
    iget v12, v8, La/qb8;->q:I

    .line 418
    .line 419
    if-ne v10, v12, :cond_10

    .line 420
    .line 421
    goto :goto_8

    .line 422
    :cond_10
    iget v8, v8, La/qb8;->q:I

    .line 423
    .line 424
    if-ne v9, v8, :cond_f

    .line 425
    .line 426
    if-ne v10, v11, :cond_f

    .line 427
    .line 428
    goto :goto_8

    .line 429
    :cond_11
    new-instance v0, La/qb8;

    .line 430
    .line 431
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 432
    .line 433
    .line 434
    move-result-object v7

    .line 435
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    iget-object v8, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->c:Landroid/graphics/drawable/Drawable;

    .line 439
    .line 440
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v9

    .line 444
    check-cast v9, Ljava/lang/Number;

    .line 445
    .line 446
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 447
    .line 448
    .line 449
    move-result v9

    .line 450
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    check-cast v6, Ljava/lang/Number;

    .line 455
    .line 456
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 457
    .line 458
    .line 459
    move-result v6

    .line 460
    invoke-direct {v0, v7, v8, v9, v6}, La/qb8;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;II)V

    .line 461
    .line 462
    .line 463
    iget-boolean v6, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->q:Z

    .line 464
    .line 465
    iput-boolean v6, v0, La/qb8;->n:Z

    .line 466
    .line 467
    iget-object v6, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->k:Lorg/xplatform/domino/presentation/views/DominoTableView;

    .line 468
    .line 469
    const-string v7, "tableView"

    .line 470
    .line 471
    if-eqz v6, :cond_13

    .line 472
    .line 473
    invoke-virtual {v6}, Lorg/xplatform/domino/presentation/views/DominoTableView;->getHeadValue()I

    .line 474
    .line 475
    .line 476
    move-result v6

    .line 477
    iget-object v8, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->k:Lorg/xplatform/domino/presentation/views/DominoTableView;

    .line 478
    .line 479
    if-eqz v8, :cond_12

    .line 480
    .line 481
    invoke-virtual {v8}, Lorg/xplatform/domino/presentation/views/DominoTableView;->getTailValue()I

    .line 482
    .line 483
    .line 484
    move-result v4

    .line 485
    invoke-virtual {v0, v6, v4}, La/qb8;->b(II)Z

    .line 486
    .line 487
    .line 488
    move-result v4

    .line 489
    iput-boolean v4, v0, La/qb8;->s:Z

    .line 490
    .line 491
    iget v6, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->r:I

    .line 492
    .line 493
    add-int/2addr v6, v4

    .line 494
    iput v6, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->r:I

    .line 495
    .line 496
    iget v4, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->g:I

    .line 497
    .line 498
    shr-int/2addr v4, v3

    .line 499
    iget v6, p1, Lorg/xplatform/domino/presentation/views/DominoHandView;->h:I

    .line 500
    .line 501
    neg-int v6, v6

    .line 502
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 503
    .line 504
    .line 505
    move-result v7

    .line 506
    shr-int/2addr v7, v3

    .line 507
    sub-int/2addr v7, v4

    .line 508
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 509
    .line 510
    .line 511
    move-result v8

    .line 512
    shr-int/2addr v8, v3

    .line 513
    add-int/2addr v8, v4

    .line 514
    iget-object v4, v0, La/qb8;->a:Landroid/graphics/Rect;

    .line 515
    .line 516
    invoke-virtual {v4, v6, v7, v2, v8}, Landroid/graphics/Rect;->set(IIII)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    const/16 v0, 0x2bc

    .line 523
    .line 524
    invoke-virtual {p1, v0, v3}, Lorg/xplatform/domino/presentation/views/DominoHandView;->a(IZ)V

    .line 525
    .line 526
    .line 527
    goto :goto_9

    .line 528
    :cond_12
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    throw v4

    .line 532
    :cond_13
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    throw v4

    .line 536
    :cond_14
    :goto_9
    invoke-virtual {v1, p0}, La/szk;->L0(La/n0l;)V

    .line 537
    .line 538
    .line 539
    iput-object p0, v1, La/szk;->P1:La/n0l;

    .line 540
    .line 541
    goto :goto_a

    .line 542
    :cond_15
    instance-of p1, p0, La/a0l;

    .line 543
    .line 544
    if-eqz p1, :cond_16

    .line 545
    .line 546
    check-cast p0, La/a0l;

    .line 547
    .line 548
    iget-object p0, p0, La/a0l;->a:Ljava/util/List;

    .line 549
    .line 550
    sget-object p1, La/szk;->Q1:[La/iiy;

    .line 551
    .line 552
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 553
    .line 554
    .line 555
    move-result-object p1

    .line 556
    iget-object p1, p1, La/szq;->b:La/e0f;

    .line 557
    .line 558
    iget-object p1, p1, La/e0f;->h:Landroid/view/View;

    .line 559
    .line 560
    check-cast p1, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 561
    .line 562
    new-instance v0, Landroid/os/Handler;

    .line 563
    .line 564
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 565
    .line 566
    .line 567
    new-instance v1, La/a4e;

    .line 568
    .line 569
    invoke-direct {v1, p1, p0}, La/a4e;-><init>(Lorg/xplatform/domino/presentation/views/DominoHandView;Ljava/util/List;)V

    .line 570
    .line 571
    .line 572
    const-wide/16 p0, 0x3e8

    .line 573
    .line 574
    invoke-virtual {v0, v1, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 575
    .line 576
    .line 577
    goto :goto_a

    .line 578
    :cond_16
    instance-of p1, p0, La/wzk;

    .line 579
    .line 580
    if-eqz p1, :cond_17

    .line 581
    .line 582
    check-cast p0, La/wzk;

    .line 583
    .line 584
    iget-object p0, p0, La/wzk;->a:La/n0l;

    .line 585
    .line 586
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v1, v3}, La/szk;->K0(Z)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    iget-object p1, p1, La/szq;->b:La/e0f;

    .line 597
    .line 598
    iget-object p1, p1, La/e0f;->n:Landroid/view/View;

    .line 599
    .line 600
    check-cast p1, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 601
    .line 602
    iget-object v0, p0, La/n0l;->d:Ljava/util/List;

    .line 603
    .line 604
    invoke-virtual {p1, v0}, Lorg/xplatform/domino/presentation/views/DominoHandView;->setBones(Ljava/util/List;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    iget-object p1, p1, La/szq;->b:La/e0f;

    .line 612
    .line 613
    iget-object p1, p1, La/e0f;->h:Landroid/view/View;

    .line 614
    .line 615
    check-cast p1, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 616
    .line 617
    iget v0, p0, La/n0l;->a:I

    .line 618
    .line 619
    invoke-virtual {p1, v0}, Lorg/xplatform/domino/presentation/views/DominoHandView;->setBones(I)V

    .line 620
    .line 621
    .line 622
    invoke-virtual {v1}, La/szk;->I0()La/szq;

    .line 623
    .line 624
    .line 625
    move-result-object p1

    .line 626
    iget-object p1, p1, La/szq;->b:La/e0f;

    .line 627
    .line 628
    iget-object p1, p1, La/e0f;->k:Landroid/view/View;

    .line 629
    .line 630
    check-cast p1, Lorg/xplatform/domino/presentation/views/DominoTableView;

    .line 631
    .line 632
    iget-object v0, p0, La/n0l;->l:Ljava/util/List;

    .line 633
    .line 634
    iget-object v2, p0, La/n0l;->j:Ljava/util/List;

    .line 635
    .line 636
    invoke-virtual {p1, v0, v2}, Lorg/xplatform/domino/presentation/views/DominoTableView;->d(Ljava/util/List;Ljava/util/List;)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v1, p0}, La/szk;->L0(La/n0l;)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v1, p0}, La/szk;->G0(La/n0l;)V

    .line 643
    .line 644
    .line 645
    iput-object p0, v1, La/szk;->P1:La/n0l;

    .line 646
    .line 647
    :goto_a
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 648
    .line 649
    goto :goto_b

    .line 650
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 651
    .line 652
    .line 653
    :goto_b
    return-object v4

    .line 654
    :pswitch_0
    check-cast p0, La/tzk;

    .line 655
    .line 656
    sget-object v0, La/wne;->a:La/wne;

    .line 657
    .line 658
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    sget-object p1, La/tzk;->a:La/tzk;

    .line 662
    .line 663
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    move-result p1

    .line 667
    if-eqz p1, :cond_18

    .line 668
    .line 669
    sget-object p0, La/szk;->Q1:[La/iiy;

    .line 670
    .line 671
    invoke-virtual {v1, v2}, La/szk;->H0(Z)V

    .line 672
    .line 673
    .line 674
    goto :goto_c

    .line 675
    :cond_18
    sget-object p1, La/tzk;->c:La/tzk;

    .line 676
    .line 677
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    move-result p1

    .line 681
    if-eqz p1, :cond_19

    .line 682
    .line 683
    sget-object p0, La/szk;->Q1:[La/iiy;

    .line 684
    .line 685
    invoke-virtual {v1, v2}, La/szk;->K0(Z)V

    .line 686
    .line 687
    .line 688
    goto :goto_c

    .line 689
    :cond_19
    sget-object p1, La/tzk;->b:La/tzk;

    .line 690
    .line 691
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 692
    .line 693
    .line 694
    move-result p0

    .line 695
    if-eqz p0, :cond_1a

    .line 696
    .line 697
    sget-object p0, La/szk;->Q1:[La/iiy;

    .line 698
    .line 699
    invoke-virtual {v1, v3}, La/szk;->H0(Z)V

    .line 700
    .line 701
    .line 702
    :goto_c
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 703
    .line 704
    goto :goto_d

    .line 705
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 706
    .line 707
    .line 708
    :goto_d
    return-object v4

    .line 709
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
