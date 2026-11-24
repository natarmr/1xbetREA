.class public final synthetic La/p1j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t1j0;


# direct methods
.method public synthetic constructor <init>(La/t1j0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p1j0;->a:B

    iput-object p1, p0, La/p1j0;->b:La/t1j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 12

    .line 1
    iget-byte v0, p0, La/p1j0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/p1j0;->b:La/t1j0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/t1j0;->Y1:La/zie0;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const-string v0, "REQUEST_SHOW_LOGOUT_DIALOG"

    .line 15
    .line 16
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p2, "CONNECTION_LOST"

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, La/t1j0;->G0()La/ii;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v0, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 36
    .line 37
    const p2, 0x7f130e12

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const p2, 0x7f1307c4

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const p2, 0x7f130e5d

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget-object v9, La/n12;->b:La/n12;

    .line 62
    .line 63
    const/4 v10, 0x0

    .line 64
    const/16 v11, 0x5f8

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v8, 0x0

    .line 71
    invoke-direct/range {v0 .. v11}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    :goto_0
    return-void

    .line 85
    :pswitch_0
    sget-object v0, La/t1j0;->Y1:La/zie0;

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const-string v0, "SETTINGS_QR_SCANNER_REQUEST_KEY"

    .line 91
    .line 92
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-nez p2, :cond_2

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    const-string p2, "SETTINGS_QR_SCANNER_BUNDLE_KEY"

    .line 100
    .line 101
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-eqz p1, :cond_5

    .line 112
    .line 113
    invoke-virtual {p0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    iget-object p2, p0, Lorg/xplatform/settings/impl/presentation/a;->U:La/iqt;

    .line 118
    .line 119
    iget-object p2, p2, La/iqt;->a:La/gst0;

    .line 120
    .line 121
    invoke-virtual {p2}, La/gst0;->a()Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    const/4 v0, 0x1

    .line 126
    if-eqz p2, :cond_3

    .line 127
    .line 128
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    iget-object p2, p0, Lorg/xplatform/settings/impl/presentation/a;->s:La/mne;

    .line 133
    .line 134
    iget-object v5, p2, La/mne;->b:La/dvj;

    .line 135
    .line 136
    new-instance v3, La/kej0;

    .line 137
    .line 138
    invoke-direct {v3, p0, v0}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 139
    .line 140
    .line 141
    new-instance v6, La/sej0;

    .line 142
    .line 143
    const/4 p2, 0x2

    .line 144
    invoke-direct {v6, p0, p1, v1, p2}, La/sej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;Ljava/lang/String;La/yje;B)V

    .line 145
    .line 146
    .line 147
    const/16 v7, 0xa

    .line 148
    .line 149
    const/4 v4, 0x0

    .line 150
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_3
    iget-object p2, p0, Lorg/xplatform/settings/impl/presentation/a;->S0:La/bby;

    .line 155
    .line 156
    if-eqz p2, :cond_4

    .line 157
    .line 158
    invoke-interface {p2, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 159
    .line 160
    .line 161
    :cond_4
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    sget-object v3, La/yej0;->a:La/yej0;

    .line 166
    .line 167
    new-instance v6, La/sej0;

    .line 168
    .line 169
    invoke-direct {v6, p0, p1, v1, v0}, La/sej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;Ljava/lang/String;La/yje;B)V

    .line 170
    .line 171
    .line 172
    const/16 v7, 0xe

    .line 173
    .line 174
    const/4 v4, 0x0

    .line 175
    const/4 v5, 0x0

    .line 176
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    iput-object p1, p0, Lorg/xplatform/settings/impl/presentation/a;->S0:La/bby;

    .line 181
    .line 182
    :cond_5
    :goto_1
    return-void

    .line 183
    :pswitch_1
    sget-object p1, La/t1j0;->Y1:La/zie0;

    .line 184
    .line 185
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    iget-object p1, p0, Lorg/xplatform/settings/impl/presentation/a;->s:La/mne;

    .line 197
    .line 198
    iget-object v5, p1, La/mne;->b:La/dvj;

    .line 199
    .line 200
    sget-object v3, La/ifj0;->a:La/ifj0;

    .line 201
    .line 202
    new-instance v6, La/oej0;

    .line 203
    .line 204
    const/16 p1, 0xe

    .line 205
    .line 206
    invoke-direct {v6, p0, v1, p1}, La/oej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 207
    .line 208
    .line 209
    const/16 v7, 0xa

    .line 210
    .line 211
    const/4 v4, 0x0

    .line 212
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :pswitch_2
    sget-object v0, La/t1j0;->Y1:La/zie0;

    .line 217
    .line 218
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 222
    .line 223
    const/16 v2, 0x21

    .line 224
    .line 225
    if-lt v0, v2, :cond_6

    .line 226
    .line 227
    invoke-static {p1, p2}, La/c7;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    goto :goto_2

    .line 232
    :cond_6
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    instance-of p2, p1, La/rvs0;

    .line 237
    .line 238
    if-nez p2, :cond_7

    .line 239
    .line 240
    move-object p1, v1

    .line 241
    :cond_7
    check-cast p1, La/rvs0;

    .line 242
    .line 243
    :goto_2
    instance-of p2, p1, La/rvs0;

    .line 244
    .line 245
    if-eqz p2, :cond_8

    .line 246
    .line 247
    check-cast p1, La/rvs0;

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_8
    move-object p1, v1

    .line 251
    :goto_3
    if-eqz p1, :cond_10

    .line 252
    .line 253
    invoke-virtual {p0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    instance-of p2, p1, La/mvs0;

    .line 258
    .line 259
    sget-object v0, La/a1j0;->a:La/a1j0;

    .line 260
    .line 261
    if-eqz p2, :cond_9

    .line 262
    .line 263
    invoke-virtual {p0, v0, v1}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_4

    .line 267
    .line 268
    :cond_9
    instance-of p2, p1, La/ovs0;

    .line 269
    .line 270
    if-eqz p2, :cond_a

    .line 271
    .line 272
    new-instance v2, La/fn50;

    .line 273
    .line 274
    check-cast p1, La/ovs0;

    .line 275
    .line 276
    iget-object v3, p1, La/ovs0;->a:Ljava/lang/String;

    .line 277
    .line 278
    iget-object v4, p1, La/ovs0;->b:Ljava/lang/String;

    .line 279
    .line 280
    iget-object v5, p1, La/ovs0;->c:Ljava/lang/String;

    .line 281
    .line 282
    iget-boolean v7, p1, La/ovs0;->d:Z

    .line 283
    .line 284
    iget-boolean v8, p1, La/ovs0;->e:Z

    .line 285
    .line 286
    iget-object v6, p1, La/ovs0;->f:Ljava/lang/String;

    .line 287
    .line 288
    iget-boolean v9, p1, La/ovs0;->g:Z

    .line 289
    .line 290
    invoke-direct/range {v2 .. v9}, La/fn50;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0, v2}, Lorg/xplatform/settings/impl/presentation/a;->z(La/fn50;)V

    .line 294
    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_a
    instance-of p2, p1, La/pvs0;

    .line 298
    .line 299
    if-eqz p2, :cond_b

    .line 300
    .line 301
    check-cast p1, La/pvs0;

    .line 302
    .line 303
    iget p2, p1, La/pvs0;->a:I

    .line 304
    .line 305
    iget-object p1, p1, La/pvs0;->b:Ljava/lang/String;

    .line 306
    .line 307
    iget-object v0, p0, Lorg/xplatform/settings/impl/presentation/a;->j:La/y3v;

    .line 308
    .line 309
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-virtual {v0, v2}, La/y3v;->s(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    iget-object v0, p0, Lorg/xplatform/settings/impl/presentation/a;->Q:La/s64;

    .line 317
    .line 318
    invoke-virtual {v0, p2}, La/s64;->h(I)V

    .line 319
    .line 320
    .line 321
    new-instance p2, La/j1j0;

    .line 322
    .line 323
    invoke-direct {p2, p1}, La/j1j0;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p0, p2, v1}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 327
    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_b
    instance-of p2, p1, La/nvs0;

    .line 331
    .line 332
    if-eqz p2, :cond_e

    .line 333
    .line 334
    check-cast p1, La/nvs0;

    .line 335
    .line 336
    iget-object p1, p1, La/nvs0;->a:Ljava/lang/Class;

    .line 337
    .line 338
    const-class p2, La/n64;

    .line 339
    .line 340
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result p2

    .line 344
    if-eqz p2, :cond_c

    .line 345
    .line 346
    invoke-virtual {p0, v0, v1}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 347
    .line 348
    .line 349
    goto :goto_4

    .line 350
    :cond_c
    const-class p2, La/kj50;

    .line 351
    .line 352
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result p1

    .line 356
    if-eqz p1, :cond_d

    .line 357
    .line 358
    invoke-virtual {p0}, Lorg/xplatform/settings/impl/presentation/a;->A()V

    .line 359
    .line 360
    .line 361
    goto :goto_4

    .line 362
    :cond_d
    invoke-virtual {p0, v0, v1}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 363
    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_e
    instance-of p1, p1, La/qvs0;

    .line 367
    .line 368
    if-eqz p1, :cond_f

    .line 369
    .line 370
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    iget-object p1, p0, Lorg/xplatform/settings/impl/presentation/a;->s:La/mne;

    .line 375
    .line 376
    iget-object v5, p1, La/mne;->b:La/dvj;

    .line 377
    .line 378
    sget-object v3, La/hfj0;->a:La/hfj0;

    .line 379
    .line 380
    new-instance v6, La/oej0;

    .line 381
    .line 382
    const/16 p1, 0xd

    .line 383
    .line 384
    invoke-direct {v6, p0, v1, p1}, La/oej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 385
    .line 386
    .line 387
    const/16 v7, 0xa

    .line 388
    .line 389
    const/4 v4, 0x0

    .line 390
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 391
    .line 392
    .line 393
    goto :goto_4

    .line 394
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 395
    .line 396
    .line 397
    :cond_10
    :goto_4
    return-void

    .line 398
    nop

    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
