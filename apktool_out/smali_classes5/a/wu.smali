.class public final La/wu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/xu;


# direct methods
.method public synthetic constructor <init>(La/xu;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wu;->i:B

    iput-object p1, p0, La/wu;->k:La/xu;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wu;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wu;->k:La/xu;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/wu;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/wu;-><init>(La/xu;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/wu;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/wu;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/wu;-><init>(La/xu;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/wu;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/wu;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/iv;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/wu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wu;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/jv;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/wu;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/wu;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/wu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/wu;->i:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v3, La/rek0;->b:La/rek0;

    .line 9
    .line 10
    iget-object v1, v0, La/wu;->k:La/xu;

    .line 11
    .line 12
    iget-object v2, v1, La/xu;->P1:La/phf0;

    .line 13
    .line 14
    iget-object v0, v0, La/wu;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/iv;

    .line 17
    .line 18
    sget-object v4, La/wne;->a:La/wne;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    if-eqz v0, :cond_a

    .line 24
    .line 25
    instance-of v4, v0, La/cv;

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    check-cast v0, La/cv;

    .line 30
    .line 31
    iget-object v0, v0, La/cv;->a:Ljava/lang/String;

    .line 32
    .line 33
    sget-object v2, La/xu;->Q1:La/gfk0;

    .line 34
    .line 35
    :try_start_0
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "android.intent.action.VIEW"

    .line 40
    .line 41
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    if-nez v2, :cond_0

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :cond_0
    new-instance v4, Landroid/content/Intent;

    .line 53
    .line 54
    invoke-direct {v4, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto/16 :goto_0

    .line 61
    .line 62
    :catchall_0
    move-exception v0

    .line 63
    invoke-virtual {v1}, La/xu;->J0()La/pv;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    iget-object v1, v4, La/pv;->h:La/duj;

    .line 68
    .line 69
    new-instance v2, La/oc;

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v9, 0x2

    .line 73
    const/4 v3, 0x2

    .line 74
    const-class v5, La/pv;

    .line 75
    .line 76
    const-string v6, "onErrorHandlerCalled"

    .line 77
    .line 78
    const-string v7, "onErrorHandlerCalled(Ljava/lang/Throwable;Ljava/lang/String;)V"

    .line 79
    .line 80
    invoke-direct/range {v2 .. v9}, La/oc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_0

    .line 87
    .line 88
    :cond_1
    instance-of v4, v0, La/dv;

    .line 89
    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    sget-object v0, La/xu;->Q1:La/gfk0;

    .line 93
    .line 94
    :try_start_1
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v2, "com.google.android.apps.authenticator2"

    .line 99
    .line 100
    invoke-static {v0, v2}, La/v3c;->U(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    .line 102
    .line 103
    goto/16 :goto_0

    .line 104
    .line 105
    :catchall_1
    move-exception v0

    .line 106
    invoke-virtual {v1}, La/xu;->J0()La/pv;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    iget-object v1, v4, La/pv;->h:La/duj;

    .line 111
    .line 112
    new-instance v2, La/oc;

    .line 113
    .line 114
    const/4 v8, 0x0

    .line 115
    const/4 v9, 0x2

    .line 116
    const/4 v3, 0x2

    .line 117
    const-class v5, La/pv;

    .line 118
    .line 119
    const-string v6, "onErrorHandlerCalled"

    .line 120
    .line 121
    const-string v7, "onErrorHandlerCalled(Ljava/lang/Throwable;Ljava/lang/String;)V"

    .line 122
    .line 123
    invoke-direct/range {v2 .. v9}, La/oc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_0

    .line 130
    .line 131
    :cond_2
    instance-of v4, v0, La/ev;

    .line 132
    .line 133
    if-eqz v4, :cond_3

    .line 134
    .line 135
    sget-object v2, La/xu;->Q1:La/gfk0;

    .line 136
    .line 137
    invoke-virtual {v1}, La/xu;->I0()La/b6i;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iget-object v2, v2, La/b6i;->a:La/ru;

    .line 142
    .line 143
    iget-object v2, v2, La/ru;->j:Ljava/lang/Object;

    .line 144
    .line 145
    move-object v10, v2

    .line 146
    check-cast v10, La/wdk0;

    .line 147
    .line 148
    invoke-static {v10}, La/x1x;->y(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    new-instance v2, La/xdk0;

    .line 152
    .line 153
    check-cast v0, La/ev;

    .line 154
    .line 155
    iget-object v4, v0, La/ev;->a:Ljava/lang/String;

    .line 156
    .line 157
    const/4 v8, 0x0

    .line 158
    const/16 v9, 0x7c

    .line 159
    .line 160
    const/4 v5, 0x0

    .line 161
    const/4 v6, 0x0

    .line 162
    const/4 v7, 0x0

    .line 163
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, La/xu;->H0()La/lxq;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iget-object v8, v0, La/lxq;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 171
    .line 172
    move-object v4, v10

    .line 173
    const/4 v10, 0x0

    .line 174
    const/16 v11, 0x3f4

    .line 175
    .line 176
    const/4 v9, 0x0

    .line 177
    move-object v6, v1

    .line 178
    move-object v5, v2

    .line 179
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 180
    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_3
    instance-of v4, v0, La/fv;

    .line 185
    .line 186
    const/4 v5, 0x1

    .line 187
    if-eqz v4, :cond_5

    .line 188
    .line 189
    sget-object v2, La/hvs0;->c2:La/s9m0;

    .line 190
    .line 191
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    check-cast v0, La/fv;

    .line 199
    .line 200
    iget-object v0, v0, La/fv;->a:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    const-string v2, "TwoFactorAuthenticationQrCodeDialog"

    .line 206
    .line 207
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    if-eqz v2, :cond_4

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_4
    new-instance v2, La/hvs0;

    .line 216
    .line 217
    invoke-direct {v2}, La/hvs0;-><init>()V

    .line 218
    .line 219
    .line 220
    sget-object v3, La/hvs0;->d2:[La/iiy;

    .line 221
    .line 222
    aget-object v3, v3, v5

    .line 223
    .line 224
    iget-object v4, v2, La/hvs0;->b2:La/phf0;

    .line 225
    .line 226
    invoke-virtual {v4, v2, v3, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v2, v1}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :cond_5
    instance-of v4, v0, La/zu;

    .line 235
    .line 236
    if-eqz v4, :cond_6

    .line 237
    .line 238
    check-cast v0, La/zu;

    .line 239
    .line 240
    iget-object v0, v0, La/zu;->a:Ljava/lang/String;

    .line 241
    .line 242
    sget-object v3, La/xu;->Q1:La/gfk0;

    .line 243
    .line 244
    sget-object v3, La/xu;->R1:[La/iiy;

    .line 245
    .line 246
    aget-object v4, v3, v5

    .line 247
    .line 248
    invoke-virtual {v2, v1, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    new-instance v6, Lkotlin/Pair;

    .line 253
    .line 254
    invoke-direct {v6, v4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    filled-new-array {v6}, [Lkotlin/Pair;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    aget-object v3, v3, v5

    .line 270
    .line 271
    invoke-virtual {v2, v1, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-virtual {v4, v0, v2}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1}, La/xu;->J0()La/pv;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {v0}, La/pv;->x()V

    .line 283
    .line 284
    .line 285
    goto/16 :goto_0

    .line 286
    .line 287
    :cond_6
    instance-of v2, v0, La/hv;

    .line 288
    .line 289
    if-eqz v2, :cond_7

    .line 290
    .line 291
    sget-object v0, La/xu;->Q1:La/gfk0;

    .line 292
    .line 293
    invoke-virtual {v1}, La/xu;->I0()La/b6i;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    iget-object v0, v0, La/b6i;->a:La/ru;

    .line 298
    .line 299
    iget-object v0, v0, La/ru;->j:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v0, La/wdk0;

    .line 302
    .line 303
    invoke-static {v0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    new-instance v2, La/xdk0;

    .line 307
    .line 308
    const v4, 0x7f1315cd

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    const/4 v8, 0x0

    .line 319
    const/16 v9, 0x7c

    .line 320
    .line 321
    const/4 v5, 0x0

    .line 322
    const/4 v6, 0x0

    .line 323
    const/4 v7, 0x0

    .line 324
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1}, La/xu;->H0()La/lxq;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    iget-object v8, v3, La/lxq;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 332
    .line 333
    const/4 v10, 0x0

    .line 334
    const/16 v11, 0x3f4

    .line 335
    .line 336
    const/4 v9, 0x0

    .line 337
    move-object v4, v0

    .line 338
    move-object v6, v1

    .line 339
    move-object v5, v2

    .line 340
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 341
    .line 342
    .line 343
    goto :goto_0

    .line 344
    :cond_7
    move-object v6, v1

    .line 345
    instance-of v1, v0, La/gv;

    .line 346
    .line 347
    if-eqz v1, :cond_8

    .line 348
    .line 349
    sget-object v0, La/xu;->Q1:La/gfk0;

    .line 350
    .line 351
    invoke-virtual {v6}, La/xu;->I0()La/b6i;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    iget-object v0, v0, La/b6i;->a:La/ru;

    .line 356
    .line 357
    iget-object v0, v0, La/ru;->i:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v0, La/ii;

    .line 360
    .line 361
    invoke-static {v0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 365
    .line 366
    const v1, 0x7f1307bb

    .line 367
    .line 368
    .line 369
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v8

    .line 373
    const v1, 0x7f13115d

    .line 374
    .line 375
    .line 376
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v9

    .line 380
    const v1, 0x7f130e5d

    .line 381
    .line 382
    .line 383
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    sget-object v16, La/n12;->a:La/n12;

    .line 391
    .line 392
    const/16 v17, 0x0

    .line 393
    .line 394
    const/16 v18, 0x5d8

    .line 395
    .line 396
    const/4 v11, 0x0

    .line 397
    const/4 v12, 0x0

    .line 398
    const-string v13, "ERROR_REQUEST_KEY"

    .line 399
    .line 400
    const/4 v14, 0x0

    .line 401
    const/4 v15, 0x0

    .line 402
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 413
    .line 414
    .line 415
    goto :goto_0

    .line 416
    :cond_8
    instance-of v1, v0, La/bv;

    .line 417
    .line 418
    if-eqz v1, :cond_9

    .line 419
    .line 420
    invoke-static {v6}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 421
    .line 422
    .line 423
    goto :goto_0

    .line 424
    :cond_9
    instance-of v1, v0, La/av;

    .line 425
    .line 426
    if-eqz v1, :cond_a

    .line 427
    .line 428
    check-cast v0, La/av;

    .line 429
    .line 430
    iget-object v0, v0, La/av;->a:La/d7a;

    .line 431
    .line 432
    sget-object v1, La/xu;->Q1:La/gfk0;

    .line 433
    .line 434
    invoke-virtual {v6}, La/xu;->I0()La/b6i;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    const v1, 0x7f1303fb

    .line 442
    .line 443
    .line 444
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    const-string v2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 452
    .line 453
    invoke-static {v6, v2, v0, v1}, La/gl5;->q(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 457
    .line 458
    goto :goto_1

    .line 459
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 460
    .line 461
    .line 462
    const/4 v0, 0x0

    .line 463
    :goto_1
    return-object v0

    .line 464
    :pswitch_0
    iget-object v1, v0, La/wu;->j:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v1, La/jv;

    .line 467
    .line 468
    sget-object v2, La/wne;->a:La/wne;

    .line 469
    .line 470
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    sget-object v2, La/xu;->Q1:La/gfk0;

    .line 474
    .line 475
    iget-object v0, v0, La/wu;->k:La/xu;

    .line 476
    .line 477
    invoke-virtual {v0}, La/xu;->H0()La/lxq;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    iget-object v2, v2, La/lxq;->h:Landroid/widget/FrameLayout;

    .line 482
    .line 483
    iget-boolean v3, v1, La/jv;->a:Z

    .line 484
    .line 485
    if-eqz v3, :cond_b

    .line 486
    .line 487
    const/4 v3, 0x0

    .line 488
    goto :goto_2

    .line 489
    :cond_b
    const/16 v3, 0x8

    .line 490
    .line 491
    :goto_2
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0}, La/xu;->H0()La/lxq;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    iget-object v2, v2, La/lxq;->d:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 499
    .line 500
    iget-object v3, v1, La/jv;->b:Ljava/lang/String;

    .line 501
    .line 502
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v0}, La/xu;->H0()La/lxq;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    iget-object v0, v0, La/lxq;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 510
    .line 511
    iget-boolean v1, v1, La/jv;->d:Z

    .line 512
    .line 513
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonEnabled(Z)V

    .line 514
    .line 515
    .line 516
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 517
    .line 518
    return-object v0

    .line 519
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
