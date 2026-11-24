.class public final synthetic La/rif0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vif0;


# direct methods
.method public synthetic constructor <init>(La/vif0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rif0;->a:B

    iput-object p1, p0, La/rif0;->b:La/vif0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/rif0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/rif0;->b:La/vif0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p0, La/vif0;->Q1:La/cge0;

    .line 11
    .line 12
    invoke-virtual {v3}, La/vif0;->H0()La/gjf0;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    iget-object p0, v6, La/gjf0;->i:La/p7m0;

    .line 17
    .line 18
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/ejf0;

    .line 23
    .line 24
    iget-boolean p0, p0, La/ejf0;->d:Z

    .line 25
    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    iget-object p0, v6, La/gjf0;->j:La/ol60;

    .line 29
    .line 30
    sget-object v0, La/yif0;->a:La/yif0;

    .line 31
    .line 32
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object p0, v6, La/gjf0;->k:La/bby;

    .line 37
    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    const/4 v0, 0x1

    .line 45
    if-ne p0, v0, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance v4, La/aif0;

    .line 53
    .line 54
    const/4 v10, 0x0

    .line 55
    const/4 v11, 0x2

    .line 56
    const/4 v5, 0x1

    .line 57
    const-class v7, La/gjf0;

    .line 58
    .line 59
    const-string v8, "onError"

    .line 60
    .line 61
    const-string v9, "onError(Ljava/lang/Throwable;)V"

    .line 62
    .line 63
    invoke-direct/range {v4 .. v11}, La/aif0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 64
    .line 65
    .line 66
    new-instance v9, La/tie0;

    .line 67
    .line 68
    const/16 v0, 0x12

    .line 69
    .line 70
    invoke-direct {v9, v6, v0}, La/tie0;-><init>(Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    iget-object v0, v6, La/gjf0;->d:La/mne;

    .line 74
    .line 75
    iget-object v10, v0, La/mne;->b:La/dvj;

    .line 76
    .line 77
    new-instance v11, La/fjf0;

    .line 78
    .line 79
    invoke-direct {v11, v6, v1, v2}, La/fjf0;-><init>(La/gjf0;La/yje;B)V

    .line 80
    .line 81
    .line 82
    const/16 v12, 0x8

    .line 83
    .line 84
    move-object v7, p0

    .line 85
    move-object v8, v4

    .line 86
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iput-object p0, v6, La/gjf0;->k:La/bby;

    .line 91
    .line 92
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_0
    sget-object p0, La/vif0;->Q1:La/cge0;

    .line 96
    .line 97
    invoke-virtual {v3}, La/vif0;->H0()La/gjf0;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    iget-object p0, p0, La/gjf0;->g:La/i1w0;

    .line 102
    .line 103
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    new-instance v1, La/c8d;

    .line 108
    .line 109
    sget-object v3, La/y7d;->a:La/v7d;

    .line 110
    .line 111
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 112
    .line 113
    invoke-direct {v1, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    :goto_1
    move-object v1, v0

    .line 121
    check-cast v1, La/paw;

    .line 122
    .line 123
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_2

    .line 128
    .line 129
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, La/oe50;

    .line 134
    .line 135
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0

    .line 142
    :pswitch_1
    sget-object p0, La/vif0;->Q1:La/cge0;

    .line 143
    .line 144
    invoke-virtual {v3}, La/vif0;->H0()La/gjf0;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    iget-object v0, p0, La/gjf0;->g:La/i1w0;

    .line 149
    .line 150
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iget-object p0, p0, La/gjf0;->b:La/usd;

    .line 155
    .line 156
    invoke-virtual {p0}, La/usd;->b()Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    instance-of v3, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 161
    .line 162
    if-eqz v3, :cond_3

    .line 163
    .line 164
    new-instance v3, La/e1w0;

    .line 165
    .line 166
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 167
    .line 168
    invoke-direct {v3, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 169
    .line 170
    .line 171
    new-instance p0, La/c8d;

    .line 172
    .line 173
    sget-object v4, La/y7d;->a:La/v7d;

    .line 174
    .line 175
    invoke-direct {p0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_3
    new-instance v3, La/w0w0;

    .line 183
    .line 184
    invoke-direct {v3, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 185
    .line 186
    .line 187
    new-instance p0, La/c8d;

    .line 188
    .line 189
    sget-object v4, La/y7d;->a:La/v7d;

    .line 190
    .line 191
    invoke-direct {p0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    :goto_2
    invoke-static {v0, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    :goto_3
    move-object v1, p0

    .line 202
    check-cast v1, La/paw;

    .line 203
    .line 204
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_4

    .line 209
    .line 210
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, La/oe50;

    .line 215
    .line 216
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object p0

    .line 223
    :pswitch_2
    sget-object v0, La/vif0;->Q1:La/cge0;

    .line 224
    .line 225
    iget-object v3, p0, La/rif0;->b:La/vif0;

    .line 226
    .line 227
    iget-object p0, v3, La/vif0;->O1:La/a8z;

    .line 228
    .line 229
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    check-cast p0, La/vri;

    .line 234
    .line 235
    iget-object p0, p0, La/vri;->a:La/qgd;

    .line 236
    .line 237
    iget-object p0, p0, La/qgd;->e:Ljava/lang/Object;

    .line 238
    .line 239
    move-object v1, p0

    .line 240
    check-cast v1, La/wdk0;

    .line 241
    .line 242
    invoke-static {v1}, La/x1x;->y(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    new-instance v2, La/xdk0;

    .line 246
    .line 247
    sget-object v5, La/rek0;->b:La/rek0;

    .line 248
    .line 249
    const p0, 0x7f130dca

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    const/4 v10, 0x0

    .line 260
    const/16 v11, 0x7c

    .line 261
    .line 262
    const/4 v7, 0x0

    .line 263
    const/4 v8, 0x0

    .line 264
    const/4 v9, 0x0

    .line 265
    move-object v4, v2

    .line 266
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 267
    .line 268
    .line 269
    const/16 v8, 0x3fc

    .line 270
    .line 271
    const/4 v4, 0x0

    .line 272
    const/4 v5, 0x0

    .line 273
    const/4 v6, 0x0

    .line 274
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 275
    .line 276
    .line 277
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object p0

    .line 280
    :pswitch_3
    sget-object p0, La/vif0;->Q1:La/cge0;

    .line 281
    .line 282
    iget-object p0, v3, La/vif0;->O1:La/a8z;

    .line 283
    .line 284
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    check-cast p0, La/vri;

    .line 289
    .line 290
    iget-object p0, p0, La/vri;->e:La/n5d0;

    .line 291
    .line 292
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    check-cast p0, La/uri;

    .line 297
    .line 298
    return-object p0

    .line 299
    :pswitch_4
    sget-object p0, La/vif0;->Q1:La/cge0;

    .line 300
    .line 301
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    instance-of v0, p0, La/af3;

    .line 313
    .line 314
    if-eqz v0, :cond_5

    .line 315
    .line 316
    check-cast p0, La/af3;

    .line 317
    .line 318
    goto :goto_4

    .line 319
    :cond_5
    move-object p0, v1

    .line 320
    :goto_4
    const-class v0, La/wif0;

    .line 321
    .line 322
    if-eqz p0, :cond_8

    .line 323
    .line 324
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    check-cast p0, La/o5d0;

    .line 333
    .line 334
    if-eqz p0, :cond_6

    .line 335
    .line 336
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    check-cast p0, La/ze3;

    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_6
    move-object p0, v1

    .line 344
    :goto_5
    instance-of v4, p0, La/wif0;

    .line 345
    .line 346
    if-nez v4, :cond_7

    .line 347
    .line 348
    move-object p0, v1

    .line 349
    :cond_7
    check-cast p0, La/wif0;

    .line 350
    .line 351
    if-eqz p0, :cond_8

    .line 352
    .line 353
    invoke-static {v3}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    iget-object v1, v3, La/vif0;->M1:La/cgx0;

    .line 358
    .line 359
    sget-object v4, La/vif0;->R1:[La/iiy;

    .line 360
    .line 361
    aget-object v2, v4, v2

    .line 362
    .line 363
    invoke-virtual {v1, v3, v2}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    iget-object v2, p0, La/wif0;->a:La/lef0;

    .line 371
    .line 372
    iget-object p0, p0, La/wif0;->b:La/qgd;

    .line 373
    .line 374
    new-instance v3, La/vri;

    .line 375
    .line 376
    invoke-direct {v3, p0, v2, v1, v0}, La/vri;-><init>(La/qgd;La/lef0;Ljava/lang/Boolean;La/i1w0;)V

    .line 377
    .line 378
    .line 379
    move-object v1, v3

    .line 380
    goto :goto_6

    .line 381
    :cond_8
    const-string p0, "Cannot create dependency "

    .line 382
    .line 383
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object p0

    .line 387
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    :goto_6
    return-object v1

    .line 391
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
