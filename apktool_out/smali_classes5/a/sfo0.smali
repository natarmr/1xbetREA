.class public final La/sfo0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/ufo0;


# direct methods
.method public synthetic constructor <init>(La/ufo0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sfo0;->i:B

    iput-object p1, p0, La/sfo0;->k:La/ufo0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/sfo0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/sfo0;->k:La/ufo0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/sfo0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/sfo0;-><init>(La/ufo0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/sfo0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/sfo0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/sfo0;-><init>(La/ufo0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/sfo0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/sfo0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ego0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/sfo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/sfo0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/sfo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/hgo0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/sfo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/sfo0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/sfo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/sfo0;->i:B

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
    iget-object v6, v0, La/sfo0;->k:La/ufo0;

    .line 11
    .line 12
    iget-object v1, v6, La/ufo0;->M1:La/a8z;

    .line 13
    .line 14
    iget-object v0, v0, La/sfo0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/ego0;

    .line 17
    .line 18
    sget-object v4, La/wne;->a:La/wne;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    instance-of v4, v0, La/bgo0;

    .line 24
    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    sget-object v0, La/ufo0;->Q1:La/s2m0;

    .line 28
    .line 29
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/cwi;

    .line 34
    .line 35
    iget-object v0, v0, La/cwi;->a:La/db;

    .line 36
    .line 37
    iget-object v0, v0, La/db;->p:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, La/ii;

    .line 40
    .line 41
    invoke-static {v0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 45
    .line 46
    const v1, 0x7f130162

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    const v1, 0x7f130508

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    const v1, 0x7f130e5d

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v10

    .line 67
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sget-object v16, La/n12;->b:La/n12;

    .line 71
    .line 72
    const/16 v17, 0x0

    .line 73
    .line 74
    const/16 v18, 0x5f8

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v12, 0x0

    .line 78
    const/4 v13, 0x0

    .line 79
    const/4 v14, 0x0

    .line 80
    const/4 v15, 0x0

    .line 81
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 92
    .line 93
    .line 94
    goto/16 :goto_1

    .line 95
    .line 96
    :cond_0
    instance-of v4, v0, La/cgo0;

    .line 97
    .line 98
    if-eqz v4, :cond_1

    .line 99
    .line 100
    check-cast v0, La/cgo0;

    .line 101
    .line 102
    iget-object v9, v0, La/cgo0;->a:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v8, v0, La/cgo0;->b:La/sek0;

    .line 105
    .line 106
    sget-object v0, La/ufo0;->Q1:La/s2m0;

    .line 107
    .line 108
    new-instance v5, La/xdk0;

    .line 109
    .line 110
    const/4 v13, 0x0

    .line 111
    const/16 v14, 0x7c

    .line 112
    .line 113
    const/4 v10, 0x0

    .line 114
    const/4 v11, 0x0

    .line 115
    const/4 v12, 0x0

    .line 116
    move-object v7, v5

    .line 117
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, La/cwi;

    .line 125
    .line 126
    iget-object v0, v0, La/cwi;->a:La/db;

    .line 127
    .line 128
    iget-object v0, v0, La/db;->q:Ljava/lang/Object;

    .line 129
    .line 130
    move-object v4, v0

    .line 131
    check-cast v4, La/wdk0;

    .line 132
    .line 133
    invoke-static {v4}, La/x1x;->y(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    const/16 v11, 0x3fc

    .line 137
    .line 138
    const/4 v7, 0x0

    .line 139
    const/4 v8, 0x0

    .line 140
    const/4 v9, 0x0

    .line 141
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 142
    .line 143
    .line 144
    goto/16 :goto_1

    .line 145
    .line 146
    :cond_1
    instance-of v4, v0, La/dgo0;

    .line 147
    .line 148
    if-eqz v4, :cond_2

    .line 149
    .line 150
    check-cast v0, La/dgo0;

    .line 151
    .line 152
    sget-object v1, La/ufo0;->Q1:La/s2m0;

    .line 153
    .line 154
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    new-instance v2, Landroid/content/Intent;

    .line 159
    .line 160
    iget-object v3, v0, La/dgo0;->b:Ljava/lang/String;

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
    iget-object v0, v0, La/dgo0;->a:Ljava/lang/String;

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
    goto/16 :goto_1

    .line 184
    .line 185
    :cond_2
    sget-object v4, La/ago0;->a:La/ago0;

    .line 186
    .line 187
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_4

    .line 192
    .line 193
    sget-object v0, La/ufo0;->Q1:La/s2m0;

    .line 194
    .line 195
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 200
    .line 201
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6}, La/ufo0;->G0()La/o5r;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    iget-object v1, v1, La/o5r;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 213
    .line 214
    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 223
    .line 224
    if-eqz v0, :cond_6

    .line 225
    .line 226
    instance-of v1, v0, La/tah0;

    .line 227
    .line 228
    if-eqz v1, :cond_3

    .line 229
    .line 230
    check-cast v0, La/tah0;

    .line 231
    .line 232
    invoke-interface {v0}, La/tah0;->p()Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-eqz v1, :cond_3

    .line 237
    .line 238
    invoke-interface {v0}, La/tah0;->w()V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_1

    .line 242
    .line 243
    :cond_3
    invoke-virtual {v6}, La/ufo0;->H0()La/fho0;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    sget-object v5, La/cho0;->a:La/cho0;

    .line 252
    .line 253
    iget-object v1, v0, La/fho0;->x:La/mne;

    .line 254
    .line 255
    iget-object v7, v1, La/mne;->a:La/rwj;

    .line 256
    .line 257
    new-instance v8, La/bh0;

    .line 258
    .line 259
    const/16 v1, 0x19

    .line 260
    .line 261
    invoke-direct {v8, v0, v2, v3, v1}, La/bh0;-><init>(La/diu0;ILa/yje;B)V

    .line 262
    .line 263
    .line 264
    const/16 v9, 0xa

    .line 265
    .line 266
    const/4 v6, 0x0

    .line 267
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 268
    .line 269
    .line 270
    goto/16 :goto_1

    .line 271
    .line 272
    :cond_4
    instance-of v2, v0, La/zfo0;

    .line 273
    .line 274
    if-eqz v2, :cond_5

    .line 275
    .line 276
    sget-object v0, La/ufo0;->Q1:La/s2m0;

    .line 277
    .line 278
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, La/cwi;

    .line 283
    .line 284
    iget-object v0, v0, La/cwi;->a:La/db;

    .line 285
    .line 286
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    sget-object v1, La/jvp0;->a:La/jvp0;

    .line 294
    .line 295
    invoke-static {v0}, La/s9m0;->m(Landroidx/fragment/app/e;)V

    .line 296
    .line 297
    .line 298
    goto :goto_1

    .line 299
    :cond_5
    instance-of v2, v0, La/yfo0;

    .line 300
    .line 301
    if-eqz v2, :cond_7

    .line 302
    .line 303
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    check-cast v0, La/yfo0;

    .line 308
    .line 309
    iget-object v0, v0, La/yfo0;->a:Ljava/lang/String;

    .line 310
    .line 311
    :try_start_0
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 312
    .line 313
    new-instance v3, Landroid/content/Intent;

    .line 314
    .line 315
    const-string v4, "android.intent.action.VIEW"

    .line 316
    .line 317
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    const/high16 v4, 0x10000000

    .line 321
    .line 322
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 323
    .line 324
    .line 325
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v3, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 333
    .line 334
    .line 335
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 336
    .line 337
    goto :goto_0

    .line 338
    :catchall_0
    move-exception v0

    .line 339
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 340
    .line 341
    new-instance v2, La/g0g0;

    .line 342
    .line 343
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 344
    .line 345
    .line 346
    move-object v0, v2

    .line 347
    :goto_0
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    if-eqz v0, :cond_6

    .line 352
    .line 353
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    check-cast v0, La/cwi;

    .line 358
    .line 359
    iget-object v0, v0, La/cwi;->a:La/db;

    .line 360
    .line 361
    iget-object v0, v0, La/db;->q:Ljava/lang/Object;

    .line 362
    .line 363
    move-object v4, v0

    .line 364
    check-cast v4, La/wdk0;

    .line 365
    .line 366
    invoke-static {v4}, La/x1x;->y(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    new-instance v5, La/xdk0;

    .line 370
    .line 371
    sget-object v8, La/rek0;->b:La/rek0;

    .line 372
    .line 373
    const v0, 0x7f130ebc

    .line 374
    .line 375
    .line 376
    invoke-virtual {v6, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v9

    .line 380
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    const/4 v13, 0x0

    .line 384
    const/16 v14, 0x7c

    .line 385
    .line 386
    const/4 v10, 0x0

    .line 387
    const/4 v11, 0x0

    .line 388
    const/4 v12, 0x0

    .line 389
    move-object v7, v5

    .line 390
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 391
    .line 392
    .line 393
    const/16 v11, 0x3fc

    .line 394
    .line 395
    const/4 v7, 0x0

    .line 396
    const/4 v8, 0x0

    .line 397
    const/4 v9, 0x0

    .line 398
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 399
    .line 400
    .line 401
    :cond_6
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 402
    .line 403
    goto :goto_2

    .line 404
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 405
    .line 406
    .line 407
    :goto_2
    return-object v3

    .line 408
    :pswitch_0
    iget-object v1, v0, La/sfo0;->j:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v1, La/hgo0;

    .line 411
    .line 412
    sget-object v4, La/wne;->a:La/wne;

    .line 413
    .line 414
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    if-eqz v1, :cond_a

    .line 418
    .line 419
    instance-of v4, v1, La/ggo0;

    .line 420
    .line 421
    const/16 v5, 0x8

    .line 422
    .line 423
    iget-object v0, v0, La/sfo0;->k:La/ufo0;

    .line 424
    .line 425
    if-eqz v4, :cond_8

    .line 426
    .line 427
    sget-object v1, La/ufo0;->Q1:La/s2m0;

    .line 428
    .line 429
    invoke-virtual {v0}, La/ufo0;->G0()La/o5r;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    iget-object v1, v1, La/o5r;->b:Landroid/widget/ProgressBar;

    .line 434
    .line 435
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0}, La/ufo0;->G0()La/o5r;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    iget-object v1, v1, La/o5r;->c:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 443
    .line 444
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0}, La/ufo0;->G0()La/o5r;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    iget-object v0, v0, La/o5r;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 452
    .line 453
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 454
    .line 455
    .line 456
    goto :goto_3

    .line 457
    :cond_8
    instance-of v4, v1, La/fgo0;

    .line 458
    .line 459
    if-eqz v4, :cond_a

    .line 460
    .line 461
    check-cast v1, La/fgo0;

    .line 462
    .line 463
    sget-object v3, La/ufo0;->Q1:La/s2m0;

    .line 464
    .line 465
    invoke-virtual {v0}, La/ufo0;->G0()La/o5r;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    iget-object v3, v3, La/o5r;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 470
    .line 471
    invoke-virtual {v3}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()La/yge0;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    if-nez v3, :cond_9

    .line 476
    .line 477
    invoke-virtual {v0}, La/ufo0;->G0()La/o5r;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    iget-object v3, v3, La/o5r;->c:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 482
    .line 483
    iget-object v4, v1, La/fgo0;->a:La/e140;

    .line 484
    .line 485
    iget-object v6, v4, La/e140;->a:Ljava/lang/String;

    .line 486
    .line 487
    invoke-virtual {v3, v6}, Lorg/xplatform/uikit/components/tabs/DsTabs;->setTabsStyle(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0}, La/ufo0;->G0()La/o5r;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    iget-object v3, v3, La/o5r;->c:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 495
    .line 496
    iget-object v6, v4, La/e140;->b:Ljava/util/ArrayList;

    .line 497
    .line 498
    invoke-virtual {v3, v6}, Lorg/xplatform/uikit/components/tabs/DsTabs;->c(Ljava/util/List;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v0}, La/ufo0;->G0()La/o5r;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    iget-object v3, v3, La/o5r;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 506
    .line 507
    new-instance v6, La/dz30;

    .line 508
    .line 509
    invoke-direct {v6, v4, v0}, La/dz30;-><init>(La/e140;Landroidx/fragment/app/Fragment;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3, v6}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(La/yge0;)V

    .line 513
    .line 514
    .line 515
    :cond_9
    invoke-virtual {v0}, La/ufo0;->G0()La/o5r;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    iget-object v3, v3, La/o5r;->b:Landroid/widget/ProgressBar;

    .line 520
    .line 521
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0}, La/ufo0;->G0()La/o5r;

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    iget-object v3, v3, La/o5r;->c:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 529
    .line 530
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v0}, La/ufo0;->G0()La/o5r;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    iget-object v3, v3, La/o5r;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 538
    .line 539
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v0}, La/ufo0;->G0()La/o5r;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    iget-object v0, v0, La/o5r;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 547
    .line 548
    new-instance v2, La/oh60;

    .line 549
    .line 550
    const/16 v3, 0x1a

    .line 551
    .line 552
    invoke-direct {v2, v0, v1, v3}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 556
    .line 557
    .line 558
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 559
    .line 560
    goto :goto_4

    .line 561
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 562
    .line 563
    .line 564
    :goto_4
    return-object v3

    .line 565
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
