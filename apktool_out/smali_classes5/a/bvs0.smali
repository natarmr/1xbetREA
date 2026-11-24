.class public final La/bvs0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/dvs0;


# direct methods
.method public synthetic constructor <init>(La/dvs0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bvs0;->i:B

    iput-object p1, p0, La/bvs0;->k:La/dvs0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/bvs0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/bvs0;->k:La/dvs0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/bvs0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/bvs0;-><init>(La/dvs0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/bvs0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/bvs0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/bvs0;-><init>(La/dvs0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/bvs0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/bvs0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/aws0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/bvs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/bvs0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/bvs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/bws0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/bvs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/bvs0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/bvs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bvs0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v6, v0, La/bvs0;->k:La/dvs0;

    .line 11
    .line 12
    iget-object v1, v6, La/dvs0;->P1:La/phf0;

    .line 13
    .line 14
    iget-object v4, v6, La/dvs0;->N1:La/a8z;

    .line 15
    .line 16
    iget-object v0, v0, La/bvs0;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/aws0;

    .line 19
    .line 20
    sget-object v5, La/wne;->a:La/wne;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object v5, La/vvs0;->a:La/vvs0;

    .line 26
    .line 27
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const-string v7, "com.google.android.apps.authenticator2"

    .line 32
    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    sget-object v0, La/dvs0;->Q1:La/g9m0;

    .line 36
    .line 37
    :try_start_0
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0, v7}, La/v3c;->T(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :catchall_0
    move-exception v0

    .line 47
    invoke-virtual {v6}, La/dvs0;->H0()La/dws0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v2, v1, La/dws0;->e:La/duj;

    .line 52
    .line 53
    new-instance v4, La/tvs0;

    .line 54
    .line 55
    invoke-direct {v4, v1, v3}, La/tvs0;-><init>(La/dws0;B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v0, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :cond_0
    sget-object v5, La/wvs0;->a:La/wvs0;

    .line 64
    .line 65
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_1

    .line 70
    .line 71
    sget-object v0, La/dvs0;->Q1:La/g9m0;

    .line 72
    .line 73
    :try_start_1
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0, v7}, La/v3c;->U(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    .line 79
    .line 80
    goto/16 :goto_1

    .line 81
    .line 82
    :catchall_1
    move-exception v0

    .line 83
    invoke-virtual {v6}, La/dvs0;->H0()La/dws0;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget-object v2, v1, La/dws0;->e:La/duj;

    .line 88
    .line 89
    new-instance v4, La/tvs0;

    .line 90
    .line 91
    invoke-direct {v4, v1, v3}, La/tvs0;-><init>(La/dws0;B)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2, v0, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_1

    .line 98
    .line 99
    :cond_1
    instance-of v5, v0, La/yvs0;

    .line 100
    .line 101
    if-eqz v5, :cond_2

    .line 102
    .line 103
    sget-object v1, La/dvs0;->Q1:La/g9m0;

    .line 104
    .line 105
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, La/kyi;

    .line 110
    .line 111
    iget-object v1, v1, La/kyi;->a:La/sd60;

    .line 112
    .line 113
    iget-object v1, v1, La/sd60;->h:Ljava/lang/Object;

    .line 114
    .line 115
    move-object v4, v1

    .line 116
    check-cast v4, La/wdk0;

    .line 117
    .line 118
    invoke-static {v4}, La/x1x;->y(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    new-instance v5, La/xdk0;

    .line 122
    .line 123
    sget-object v8, La/rek0;->b:La/rek0;

    .line 124
    .line 125
    check-cast v0, La/yvs0;

    .line 126
    .line 127
    iget-object v9, v0, La/yvs0;->a:Ljava/lang/String;

    .line 128
    .line 129
    const/4 v13, 0x0

    .line 130
    const/16 v14, 0x7c

    .line 131
    .line 132
    const/4 v10, 0x0

    .line 133
    const/4 v11, 0x0

    .line 134
    const/4 v12, 0x0

    .line 135
    move-object v7, v5

    .line 136
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 137
    .line 138
    .line 139
    const/16 v11, 0x3fc

    .line 140
    .line 141
    const/4 v7, 0x0

    .line 142
    const/4 v8, 0x0

    .line 143
    const/4 v9, 0x0

    .line 144
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 145
    .line 146
    .line 147
    goto/16 :goto_1

    .line 148
    .line 149
    :cond_2
    instance-of v5, v0, La/xvs0;

    .line 150
    .line 151
    if-eqz v5, :cond_3

    .line 152
    .line 153
    check-cast v0, La/xvs0;

    .line 154
    .line 155
    iget-object v0, v0, La/xvs0;->a:La/rvs0;

    .line 156
    .line 157
    sget-object v4, La/dvs0;->Q1:La/g9m0;

    .line 158
    .line 159
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v4}, La/kxq;->r()La/v1r;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    sget-object v5, La/dvs0;->R1:[La/iiy;

    .line 168
    .line 169
    aget-object v7, v5, v2

    .line 170
    .line 171
    invoke-virtual {v1, v6, v7}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    new-instance v8, Landroid/os/Bundle;

    .line 176
    .line 177
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 178
    .line 179
    .line 180
    aget-object v2, v5, v2

    .line 181
    .line 182
    invoke-virtual {v1, v6, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v8, v1, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v8, v7}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v6}, La/dvs0;->H0()La/dws0;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    iget-object v0, v0, La/dws0;->f:La/i1w0;

    .line 197
    .line 198
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    new-instance v2, La/c8d;

    .line 203
    .line 204
    sget-object v4, La/y7d;->a:La/v7d;

    .line 205
    .line 206
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 207
    .line 208
    invoke-direct {v2, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v1, v2, v0, v1, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    :goto_0
    move-object v2, v1

    .line 216
    check-cast v2, La/paw;

    .line 217
    .line 218
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-eqz v3, :cond_5

    .line 223
    .line 224
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    check-cast v2, La/oe50;

    .line 229
    .line 230
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 231
    .line 232
    .line 233
    goto :goto_0

    .line 234
    :cond_3
    instance-of v1, v0, La/zvs0;

    .line 235
    .line 236
    if-eqz v1, :cond_4

    .line 237
    .line 238
    sget-object v0, La/dvs0;->Q1:La/g9m0;

    .line 239
    .line 240
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, La/kyi;

    .line 245
    .line 246
    iget-object v0, v0, La/kyi;->a:La/sd60;

    .line 247
    .line 248
    iget-object v0, v0, La/sd60;->g:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, La/ii;

    .line 251
    .line 252
    invoke-static {v0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 256
    .line 257
    const v1, 0x7f1307bb

    .line 258
    .line 259
    .line 260
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v8

    .line 264
    const v1, 0x7f13115d

    .line 265
    .line 266
    .line 267
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    const v1, 0x7f130e5d

    .line 272
    .line 273
    .line 274
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    sget-object v16, La/n12;->b:La/n12;

    .line 282
    .line 283
    const/16 v17, 0x0

    .line 284
    .line 285
    const/16 v18, 0x5d8

    .line 286
    .line 287
    const/4 v11, 0x0

    .line 288
    const/4 v12, 0x0

    .line 289
    const-string v13, "REQUEST_REQUEST_ERROR_KEY"

    .line 290
    .line 291
    const/4 v14, 0x0

    .line 292
    const/4 v15, 0x0

    .line 293
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 304
    .line 305
    .line 306
    goto :goto_1

    .line 307
    :cond_4
    instance-of v0, v0, La/uvs0;

    .line 308
    .line 309
    if-eqz v0, :cond_6

    .line 310
    .line 311
    invoke-static {v6}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 312
    .line 313
    .line 314
    :cond_5
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 315
    .line 316
    goto :goto_2

    .line 317
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 318
    .line 319
    .line 320
    const/4 v0, 0x0

    .line 321
    :goto_2
    return-object v0

    .line 322
    :pswitch_0
    iget-object v1, v0, La/bvs0;->j:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v1, La/bws0;

    .line 325
    .line 326
    sget-object v4, La/wne;->a:La/wne;

    .line 327
    .line 328
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    sget-object v4, La/dvs0;->Q1:La/g9m0;

    .line 332
    .line 333
    iget-object v0, v0, La/bvs0;->k:La/dvs0;

    .line 334
    .line 335
    invoke-virtual {v0}, La/dvs0;->G0()La/izq;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    iget-object v4, v4, La/izq;->f:Landroid/widget/FrameLayout;

    .line 340
    .line 341
    iget-boolean v5, v1, La/bws0;->a:Z

    .line 342
    .line 343
    iget-object v6, v1, La/bws0;->d:Ljava/lang/String;

    .line 344
    .line 345
    if-eqz v5, :cond_7

    .line 346
    .line 347
    move v5, v3

    .line 348
    goto :goto_3

    .line 349
    :cond_7
    const/16 v5, 0x8

    .line 350
    .line 351
    :goto_3
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, La/dvs0;->G0()La/izq;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    iget-object v4, v4, La/izq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 359
    .line 360
    iget-object v5, v1, La/bws0;->b:Ljava/lang/String;

    .line 361
    .line 362
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonText(Ljava/lang/CharSequence;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0}, La/dvs0;->G0()La/izq;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    iget-object v4, v4, La/izq;->d:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 370
    .line 371
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    if-lez v5, :cond_8

    .line 376
    .line 377
    goto :goto_4

    .line 378
    :cond_8
    move v2, v3

    .line 379
    :goto_4
    invoke-virtual {v4, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0}, La/dvs0;->G0()La/izq;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    iget-object v2, v2, La/izq;->d:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 387
    .line 388
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, La/dvs0;->G0()La/izq;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    iget-object v0, v0, La/izq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 396
    .line 397
    iget-boolean v1, v1, La/bws0;->e:Z

    .line 398
    .line 399
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonEnabled(Z)V

    .line 400
    .line 401
    .line 402
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 403
    .line 404
    return-object v0

    .line 405
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
