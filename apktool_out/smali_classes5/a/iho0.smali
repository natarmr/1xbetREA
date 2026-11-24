.class public final La/iho0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/jho0;


# direct methods
.method public synthetic constructor <init>(La/jho0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/iho0;->i:B

    iput-object p1, p0, La/iho0;->k:La/jho0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/iho0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/iho0;->k:La/jho0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/iho0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/iho0;-><init>(La/jho0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/iho0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/iho0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/iho0;-><init>(La/jho0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/iho0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/iho0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/who0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/iho0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/iho0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/iho0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/zho0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/iho0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/iho0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/iho0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/iho0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v6, v0, La/iho0;->k:La/jho0;

    .line 11
    .line 12
    iget-object v1, v6, La/jho0;->M1:La/a8z;

    .line 13
    .line 14
    iget-object v0, v0, La/iho0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/who0;

    .line 17
    .line 18
    sget-object v4, La/wne;->a:La/wne;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    if-eqz v0, :cond_9

    .line 24
    .line 25
    instance-of v4, v0, La/tho0;

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    sget-object v0, La/jho0;->R1:La/y2m0;

    .line 30
    .line 31
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, La/cwi;

    .line 36
    .line 37
    iget-object v0, v0, La/cwi;->a:La/db;

    .line 38
    .line 39
    iget-object v0, v0, La/db;->p:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, La/ii;

    .line 42
    .line 43
    invoke-static {v0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 47
    .line 48
    const v1, 0x7f130162

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    const v1, 0x7f130508

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    const v1, 0x7f130e5d

    .line 63
    .line 64
    .line 65
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v16, La/n12;->b:La/n12;

    .line 73
    .line 74
    const/16 v17, 0x0

    .line 75
    .line 76
    const/16 v18, 0x5f8

    .line 77
    .line 78
    const/4 v11, 0x0

    .line 79
    const/4 v12, 0x0

    .line 80
    const/4 v13, 0x0

    .line 81
    const/4 v14, 0x0

    .line 82
    const/4 v15, 0x0

    .line 83
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_2

    .line 97
    .line 98
    :cond_0
    instance-of v4, v0, La/uho0;

    .line 99
    .line 100
    if-eqz v4, :cond_1

    .line 101
    .line 102
    check-cast v0, La/uho0;

    .line 103
    .line 104
    iget-object v9, v0, La/uho0;->a:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v8, v0, La/uho0;->b:La/sek0;

    .line 107
    .line 108
    sget-object v0, La/jho0;->R1:La/y2m0;

    .line 109
    .line 110
    new-instance v5, La/xdk0;

    .line 111
    .line 112
    const/4 v13, 0x0

    .line 113
    const/16 v14, 0x7c

    .line 114
    .line 115
    const/4 v10, 0x0

    .line 116
    const/4 v11, 0x0

    .line 117
    const/4 v12, 0x0

    .line 118
    move-object v7, v5

    .line 119
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, La/cwi;

    .line 127
    .line 128
    iget-object v0, v0, La/cwi;->a:La/db;

    .line 129
    .line 130
    iget-object v0, v0, La/db;->q:Ljava/lang/Object;

    .line 131
    .line 132
    move-object v4, v0

    .line 133
    check-cast v4, La/wdk0;

    .line 134
    .line 135
    invoke-static {v4}, La/x1x;->y(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    const/16 v11, 0x3fc

    .line 139
    .line 140
    const/4 v7, 0x0

    .line 141
    const/4 v8, 0x0

    .line 142
    const/4 v9, 0x0

    .line 143
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 144
    .line 145
    .line 146
    goto/16 :goto_2

    .line 147
    .line 148
    :cond_1
    instance-of v4, v0, La/vho0;

    .line 149
    .line 150
    if-eqz v4, :cond_2

    .line 151
    .line 152
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    new-instance v2, Landroid/content/Intent;

    .line 157
    .line 158
    check-cast v0, La/vho0;

    .line 159
    .line 160
    iget-object v3, v0, La/vho0;->b:Ljava/lang/String;

    .line 161
    .line 162
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    new-instance v3, Landroid/content/ComponentName;

    .line 166
    .line 167
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    iget-object v0, v0, La/vho0;->a:Ljava/lang/String;

    .line 172
    .line 173
    invoke-direct {v3, v4, v0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 181
    .line 182
    .line 183
    goto/16 :goto_2

    .line 184
    .line 185
    :cond_2
    instance-of v4, v0, La/sho0;

    .line 186
    .line 187
    if-eqz v4, :cond_5

    .line 188
    .line 189
    sget-object v0, La/jho0;->R1:La/y2m0;

    .line 190
    .line 191
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 196
    .line 197
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    iget-object v1, v6, La/jho0;->Q1:Landroidx/viewpager2/widget/ViewPager2;

    .line 205
    .line 206
    if-eqz v1, :cond_3

    .line 207
    .line 208
    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    goto :goto_0

    .line 213
    :cond_3
    const/4 v1, -0x1

    .line 214
    :goto_0
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 219
    .line 220
    if-eqz v0, :cond_8

    .line 221
    .line 222
    instance-of v1, v0, La/tah0;

    .line 223
    .line 224
    if-eqz v1, :cond_4

    .line 225
    .line 226
    check-cast v0, La/tah0;

    .line 227
    .line 228
    invoke-interface {v0}, La/tah0;->p()Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_4

    .line 233
    .line 234
    invoke-interface {v0}, La/tah0;->w()V

    .line 235
    .line 236
    .line 237
    goto/16 :goto_2

    .line 238
    .line 239
    :cond_4
    invoke-virtual {v6}, La/jho0;->H0()La/rio0;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    sget-object v5, La/pio0;->a:La/pio0;

    .line 248
    .line 249
    iget-object v1, v0, La/rio0;->y:La/mne;

    .line 250
    .line 251
    iget-object v7, v1, La/mne;->a:La/rwj;

    .line 252
    .line 253
    new-instance v8, La/bh0;

    .line 254
    .line 255
    const/16 v1, 0x1a

    .line 256
    .line 257
    invoke-direct {v8, v0, v2, v3, v1}, La/bh0;-><init>(La/diu0;ILa/yje;B)V

    .line 258
    .line 259
    .line 260
    const/16 v9, 0xa

    .line 261
    .line 262
    const/4 v6, 0x0

    .line 263
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 264
    .line 265
    .line 266
    goto/16 :goto_2

    .line 267
    .line 268
    :cond_5
    instance-of v2, v0, La/pho0;

    .line 269
    .line 270
    if-eqz v2, :cond_6

    .line 271
    .line 272
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    if-eqz v0, :cond_8

    .line 277
    .line 278
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-static {v0}, La/tdc;->U(Landroidx/fragment/app/e;)Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_8

    .line 287
    .line 288
    invoke-virtual {v6}, La/jho0;->H0()La/rio0;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    iget-object v1, v0, La/rio0;->z:La/i1w0;

    .line 293
    .line 294
    new-instance v2, La/lho0;

    .line 295
    .line 296
    const/4 v3, 0x4

    .line 297
    invoke-direct {v2, v0, v3}, La/lho0;-><init>(La/rio0;B)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 301
    .line 302
    .line 303
    goto/16 :goto_2

    .line 304
    .line 305
    :cond_6
    instance-of v2, v0, La/rho0;

    .line 306
    .line 307
    if-eqz v2, :cond_7

    .line 308
    .line 309
    sget-object v0, La/jho0;->R1:La/y2m0;

    .line 310
    .line 311
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    check-cast v0, La/cwi;

    .line 316
    .line 317
    iget-object v0, v0, La/cwi;->a:La/db;

    .line 318
    .line 319
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    sget-object v1, La/jvp0;->a:La/jvp0;

    .line 327
    .line 328
    invoke-static {v0}, La/s9m0;->m(Landroidx/fragment/app/e;)V

    .line 329
    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_7
    instance-of v2, v0, La/qho0;

    .line 333
    .line 334
    if-eqz v2, :cond_9

    .line 335
    .line 336
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    check-cast v0, La/qho0;

    .line 341
    .line 342
    iget-object v0, v0, La/qho0;->a:Ljava/lang/String;

    .line 343
    .line 344
    :try_start_0
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 345
    .line 346
    new-instance v3, Landroid/content/Intent;

    .line 347
    .line 348
    const-string v4, "android.intent.action.VIEW"

    .line 349
    .line 350
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    const/high16 v4, 0x10000000

    .line 354
    .line 355
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 356
    .line 357
    .line 358
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v3, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 366
    .line 367
    .line 368
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 369
    .line 370
    goto :goto_1

    .line 371
    :catchall_0
    move-exception v0

    .line 372
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 373
    .line 374
    new-instance v2, La/g0g0;

    .line 375
    .line 376
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 377
    .line 378
    .line 379
    move-object v0, v2

    .line 380
    :goto_1
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    if-eqz v0, :cond_8

    .line 385
    .line 386
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    check-cast v0, La/cwi;

    .line 391
    .line 392
    iget-object v0, v0, La/cwi;->a:La/db;

    .line 393
    .line 394
    iget-object v0, v0, La/db;->q:Ljava/lang/Object;

    .line 395
    .line 396
    move-object v4, v0

    .line 397
    check-cast v4, La/wdk0;

    .line 398
    .line 399
    invoke-static {v4}, La/x1x;->y(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    new-instance v5, La/xdk0;

    .line 403
    .line 404
    sget-object v8, La/rek0;->b:La/rek0;

    .line 405
    .line 406
    const v0, 0x7f130ebc

    .line 407
    .line 408
    .line 409
    invoke-virtual {v6, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v9

    .line 413
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    const/4 v13, 0x0

    .line 417
    const/16 v14, 0x7c

    .line 418
    .line 419
    const/4 v10, 0x0

    .line 420
    const/4 v11, 0x0

    .line 421
    const/4 v12, 0x0

    .line 422
    move-object v7, v5

    .line 423
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 424
    .line 425
    .line 426
    const/16 v11, 0x3fc

    .line 427
    .line 428
    const/4 v7, 0x0

    .line 429
    const/4 v8, 0x0

    .line 430
    const/4 v9, 0x0

    .line 431
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 432
    .line 433
    .line 434
    :cond_8
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    goto :goto_3

    .line 437
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 438
    .line 439
    .line 440
    :goto_3
    return-object v3

    .line 441
    :pswitch_0
    iget-object v1, v0, La/iho0;->j:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v1, La/zho0;

    .line 444
    .line 445
    sget-object v4, La/wne;->a:La/wne;

    .line 446
    .line 447
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    if-eqz v1, :cond_14

    .line 451
    .line 452
    instance-of v4, v1, La/yho0;

    .line 453
    .line 454
    const/16 v5, 0x8

    .line 455
    .line 456
    iget-object v6, v0, La/iho0;->k:La/jho0;

    .line 457
    .line 458
    if-eqz v4, :cond_a

    .line 459
    .line 460
    sget-object v0, La/jho0;->R1:La/y2m0;

    .line 461
    .line 462
    invoke-virtual {v6}, La/jho0;->G0()La/o5r;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    iget-object v0, v0, La/o5r;->b:Landroid/widget/ProgressBar;

    .line 467
    .line 468
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v6}, La/jho0;->G0()La/o5r;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    iget-object v0, v0, La/o5r;->c:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 476
    .line 477
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 478
    .line 479
    .line 480
    iget-object v0, v6, La/jho0;->Q1:Landroidx/viewpager2/widget/ViewPager2;

    .line 481
    .line 482
    if-eqz v0, :cond_13

    .line 483
    .line 484
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 485
    .line 486
    .line 487
    goto/16 :goto_6

    .line 488
    .line 489
    :cond_a
    instance-of v0, v1, La/xho0;

    .line 490
    .line 491
    if-eqz v0, :cond_14

    .line 492
    .line 493
    check-cast v1, La/xho0;

    .line 494
    .line 495
    sget-object v0, La/jho0;->R1:La/y2m0;

    .line 496
    .line 497
    iget-object v4, v6, La/jho0;->Q1:Landroidx/viewpager2/widget/ViewPager2;

    .line 498
    .line 499
    if-nez v4, :cond_b

    .line 500
    .line 501
    goto/16 :goto_6

    .line 502
    .line 503
    :cond_b
    invoke-virtual {v4}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    if-nez v0, :cond_11

    .line 508
    .line 509
    iget-object v7, v1, La/xho0;->a:La/e140;

    .line 510
    .line 511
    iget-object v8, v7, La/e140;->c:Ljava/util/List;

    .line 512
    .line 513
    iget-object v0, v6, La/jho0;->Q1:Landroidx/viewpager2/widget/ViewPager2;

    .line 514
    .line 515
    if-eqz v0, :cond_c

    .line 516
    .line 517
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    :cond_c
    :try_start_1
    iget-object v0, v6, La/jho0;->Q1:Landroidx/viewpager2/widget/ViewPager2;

    .line 526
    .line 527
    if-eqz v0, :cond_d

    .line 528
    .line 529
    new-instance v9, La/dz30;

    .line 530
    .line 531
    invoke-direct {v9, v8, v6}, La/dz30;-><init>(Ljava/util/List;Landroidx/fragment/app/Fragment;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v0, v9}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 535
    .line 536
    .line 537
    :cond_d
    move-object/from16 p0, v1

    .line 538
    .line 539
    move-object/from16 v17, v4

    .line 540
    .line 541
    goto/16 :goto_4

    .line 542
    .line 543
    :catchall_1
    move-exception v0

    .line 544
    invoke-virtual {v6}, La/jho0;->H0()La/rio0;

    .line 545
    .line 546
    .line 547
    move-result-object v9

    .line 548
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->N()Z

    .line 549
    .line 550
    .line 551
    move-result v10

    .line 552
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 553
    .line 554
    .line 555
    move-result v11

    .line 556
    iget-boolean v12, v6, Landroidx/fragment/app/Fragment;->q:Z

    .line 557
    .line 558
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->R()Z

    .line 559
    .line 560
    .line 561
    move-result v13

    .line 562
    iget-boolean v14, v6, Landroidx/fragment/app/Fragment;->Z:Z

    .line 563
    .line 564
    iget-boolean v15, v6, Landroidx/fragment/app/Fragment;->m:Z

    .line 565
    .line 566
    iget-object v2, v6, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 567
    .line 568
    iget-object v2, v2, La/glz;->i:La/lkz;

    .line 569
    .line 570
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 575
    .line 576
    .line 577
    move-result-object v5

    .line 578
    invoke-virtual {v5}, La/n6r;->b()V

    .line 579
    .line 580
    .line 581
    iget-object v5, v5, La/n6r;->c:La/glz;

    .line 582
    .line 583
    iget-object v5, v5, La/glz;->i:La/lkz;

    .line 584
    .line 585
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v5

    .line 589
    move-object/from16 p0, v1

    .line 590
    .line 591
    new-instance v1, Ljava/lang/StringBuilder;

    .line 592
    .line 593
    move-object/from16 v17, v4

    .line 594
    .line 595
    const-string v4, "\n                    viewPager.currentItem "

    .line 596
    .line 597
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 601
    .line 602
    .line 603
    const-string v3, "\n                    fragment.isAdded = "

    .line 604
    .line 605
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 609
    .line 610
    .line 611
    const-string v3, " \n                    fragment.isResumed = "

    .line 612
    .line 613
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 614
    .line 615
    .line 616
    const-string v3, " \n                    fragment.isInLayout = "

    .line 617
    .line 618
    const-string v4, " \n                    fragment.isStateSaved = "

    .line 619
    .line 620
    invoke-static {v3, v4, v1, v11, v12}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 621
    .line 622
    .line 623
    const-string v3, "\n                    fragment.isDetached = "

    .line 624
    .line 625
    const-string v4, " \n                    fragment.isRemoving = "

    .line 626
    .line 627
    invoke-static {v3, v4, v1, v13, v14}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 628
    .line 629
    .line 630
    const-string v3, " \n                    fragment.lifecycle = "

    .line 631
    .line 632
    const-string v4, "\n                    fragment.viewLifecycleOwner.lifecycle = "

    .line 633
    .line 634
    invoke-static {v3, v2, v4, v1, v15}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    const-string v2, "\n                    "

    .line 641
    .line 642
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    invoke-static {v1}, La/ntm0;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    iget-object v2, v9, La/rio0;->q0:La/rjo;

    .line 654
    .line 655
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 659
    .line 660
    .line 661
    move-result v2

    .line 662
    if-lez v2, :cond_e

    .line 663
    .line 664
    invoke-static {}, La/tfq;->a()La/tfq;

    .line 665
    .line 666
    .line 667
    move-result-object v2

    .line 668
    invoke-virtual {v2, v1}, La/tfq;->b(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    :cond_e
    invoke-static {}, La/tfq;->a()La/tfq;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    invoke-virtual {v1, v0}, La/tfq;->c(Ljava/lang/Throwable;)V

    .line 676
    .line 677
    .line 678
    iget-object v0, v6, La/jho0;->P1:La/mii0;

    .line 679
    .line 680
    if-eqz v0, :cond_f

    .line 681
    .line 682
    iget-object v1, v0, La/mii0;->c:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 685
    .line 686
    iget-object v0, v0, La/mii0;->e:Ljava/lang/Object;

    .line 687
    .line 688
    check-cast v0, La/xp6;

    .line 689
    .line 690
    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 691
    .line 692
    .line 693
    :cond_f
    iget-object v0, v6, La/jho0;->Q1:Landroidx/viewpager2/widget/ViewPager2;

    .line 694
    .line 695
    if-nez v0, :cond_10

    .line 696
    .line 697
    goto :goto_4

    .line 698
    :cond_10
    new-instance v1, La/dz30;

    .line 699
    .line 700
    invoke-direct {v1, v8, v6}, La/dz30;-><init>(Ljava/util/List;Landroidx/fragment/app/Fragment;)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 704
    .line 705
    .line 706
    move-result v2

    .line 707
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 708
    .line 709
    .line 710
    move-result-object v3

    .line 711
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 712
    .line 713
    .line 714
    move-result v4

    .line 715
    invoke-virtual {v6}, La/jho0;->G0()La/o5r;

    .line 716
    .line 717
    .line 718
    move-result-object v5

    .line 719
    iget-object v5, v5, La/o5r;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 720
    .line 721
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 722
    .line 723
    .line 724
    new-instance v5, Landroidx/viewpager2/widget/ViewPager2;

    .line 725
    .line 726
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    invoke-direct {v5, v0}, Landroidx/viewpager2/widget/ViewPager2;-><init>(Landroid/content/Context;)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v5, v2}, Landroid/view/View;->setId(I)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v5, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 737
    .line 738
    .line 739
    iput-object v5, v6, La/jho0;->Q1:Landroidx/viewpager2/widget/ViewPager2;

    .line 740
    .line 741
    invoke-virtual {v6}, La/jho0;->G0()La/o5r;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    iget-object v0, v0, La/o5r;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 746
    .line 747
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v5, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 751
    .line 752
    .line 753
    new-instance v0, La/n23;

    .line 754
    .line 755
    const/16 v1, 0xd

    .line 756
    .line 757
    invoke-direct {v0, v5, v4, v1}, La/n23;-><init>(Ljava/lang/Object;IB)V

    .line 758
    .line 759
    .line 760
    invoke-virtual {v5, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 761
    .line 762
    .line 763
    :goto_4
    invoke-virtual {v6}, La/jho0;->G0()La/o5r;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    iget-object v0, v0, La/o5r;->c:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 768
    .line 769
    iget-object v1, v7, La/e140;->a:Ljava/lang/String;

    .line 770
    .line 771
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/tabs/DsTabs;->setTabsStyle(Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v6}, La/jho0;->G0()La/o5r;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    iget-object v0, v0, La/o5r;->c:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 779
    .line 780
    iget-object v1, v7, La/e140;->b:Ljava/util/ArrayList;

    .line 781
    .line 782
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/tabs/DsTabs;->c(Ljava/util/List;)V

    .line 783
    .line 784
    .line 785
    goto :goto_5

    .line 786
    :cond_11
    move-object/from16 p0, v1

    .line 787
    .line 788
    move-object/from16 v17, v4

    .line 789
    .line 790
    :goto_5
    invoke-virtual {v6}, La/jho0;->G0()La/o5r;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    iget-object v0, v0, La/o5r;->b:Landroid/widget/ProgressBar;

    .line 795
    .line 796
    const/16 v1, 0x8

    .line 797
    .line 798
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v6}, La/jho0;->G0()La/o5r;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    iget-object v0, v0, La/o5r;->c:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 806
    .line 807
    const/4 v1, 0x0

    .line 808
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 809
    .line 810
    .line 811
    move-object/from16 v2, v17

    .line 812
    .line 813
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 814
    .line 815
    .line 816
    move-object/from16 v2, p0

    .line 817
    .line 818
    iget-boolean v0, v2, La/xho0;->c:Z

    .line 819
    .line 820
    iget-object v3, v6, La/jho0;->Q1:Landroidx/viewpager2/widget/ViewPager2;

    .line 821
    .line 822
    if-eqz v0, :cond_12

    .line 823
    .line 824
    if-eqz v3, :cond_13

    .line 825
    .line 826
    iget v0, v2, La/xho0;->b:I

    .line 827
    .line 828
    invoke-virtual {v3, v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    .line 829
    .line 830
    .line 831
    goto :goto_6

    .line 832
    :cond_12
    if-eqz v3, :cond_13

    .line 833
    .line 834
    new-instance v0, La/oh60;

    .line 835
    .line 836
    const/16 v1, 0x1b

    .line 837
    .line 838
    invoke-direct {v0, v3, v2, v1}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 842
    .line 843
    .line 844
    :cond_13
    :goto_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 845
    .line 846
    goto :goto_7

    .line 847
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 848
    .line 849
    .line 850
    :goto_7
    return-object v3

    .line 851
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
