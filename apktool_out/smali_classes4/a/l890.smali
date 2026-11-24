.class public final synthetic La/l890;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o890;


# direct methods
.method public synthetic constructor <init>(La/o890;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l890;->a:B

    iput-object p1, p0, La/l890;->b:La/o890;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/l890;->a:B

    .line 2
    .line 3
    const-string v1, "android.permission.CAMERA"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, La/l890;->b:La/o890;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/o890;->f2:La/jh70;

    .line 13
    .line 14
    new-array v0, v2, [Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p0, v1, v0}, La/m7x;->Q(Landroidx/fragment/app/Fragment;Ljava/lang/String;[Ljava/lang/String;)La/khf0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, La/khf0;->d()La/qog0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    :cond_0
    return-object v3

    .line 27
    :pswitch_0
    sget-object v0, La/o890;->f2:La/jh70;

    .line 28
    .line 29
    invoke-static {}, La/j120;->V()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-array v1, v2, [Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p0, v0, v1}, La/m7x;->Q(Landroidx/fragment/app/Fragment;Ljava/lang/String;[Ljava/lang/String;)La/khf0;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, La/khf0;->d()La/qog0;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    :cond_1
    return-object v3

    .line 46
    :pswitch_1
    sget-object v0, La/o890;->f2:La/jh70;

    .line 47
    .line 48
    invoke-static {}, La/j120;->V()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    filled-new-array {v0}, [Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {p0, v1, v0}, La/m7x;->Q(Landroidx/fragment/app/Fragment;Ljava/lang/String;[Ljava/lang/String;)La/khf0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-eqz p0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, La/khf0;->d()La/qog0;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    :cond_2
    return-object v3

    .line 67
    :pswitch_2
    iget-object v0, p0, La/o890;->M1:La/oni;

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iget-object p0, p0, La/agd;->i:La/yfd;

    .line 76
    .line 77
    new-instance v1, La/qm90;

    .line 78
    .line 79
    iget-object v0, v0, La/oni;->a:La/omi;

    .line 80
    .line 81
    iget-object v0, v0, La/omi;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, La/o9i;

    .line 84
    .line 85
    iget-object v0, v0, La/o9i;->j:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, La/zri;

    .line 88
    .line 89
    invoke-direct {v1, p0, v0}, La/qm90;-><init>(La/yfd;La/zri;)V

    .line 90
    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_3
    const-string p0, "photoResultFactory"

    .line 94
    .line 95
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v3

    .line 99
    :pswitch_3
    sget-object v0, La/o890;->f2:La/jh70;

    .line 100
    .line 101
    new-instance v0, La/ry3;

    .line 102
    .line 103
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget-object p0, p0, La/o890;->L1:La/nni;

    .line 108
    .line 109
    if-eqz p0, :cond_4

    .line 110
    .line 111
    invoke-direct {v0, v1, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 112
    .line 113
    .line 114
    return-object v0

    .line 115
    :cond_4
    const-string p0, "viewModelFactory"

    .line 116
    .line 117
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw v3

    .line 121
    :pswitch_4
    sget-object v0, La/o890;->f2:La/jh70;

    .line 122
    .line 123
    invoke-virtual {p0}, La/o890;->M0()La/p990;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0}, La/p990;->A()V

    .line 128
    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_5
    sget-object v0, La/o890;->f2:La/jh70;

    .line 134
    .line 135
    invoke-virtual {p0}, La/o890;->M0()La/p990;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iget-object v1, v0, La/p990;->z:La/p7m0;

    .line 140
    .line 141
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    move-object v2, p0

    .line 146
    check-cast v2, La/d990;

    .line 147
    .line 148
    sget-object v2, La/d990;->a:La/d990;

    .line 149
    .line 150
    invoke-virtual {v1, p0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    if-eqz p0, :cond_5

    .line 155
    .line 156
    invoke-virtual {v0}, La/p990;->C()V

    .line 157
    .line 158
    .line 159
    iget-object p0, v0, La/p990;->k:La/vd1;

    .line 160
    .line 161
    iget-object p0, p0, La/vd1;->a:La/kt2;

    .line 162
    .line 163
    const-string v1, "dep_refresh_method"

    .line 164
    .line 165
    invoke-interface {p0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget-object p0, v0, La/p990;->l:La/z7z;

    .line 169
    .line 170
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    check-cast p0, La/wlt0;

    .line 175
    .line 176
    iget-object p0, p0, La/wlt0;->a:La/s1p;

    .line 177
    .line 178
    const-wide/16 v1, 0xc3f

    .line 179
    .line 180
    sget-object v3, La/xun;->a:La/xun;

    .line 181
    .line 182
    invoke-virtual {p0, v3, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, La/p990;->B()V

    .line 186
    .line 187
    .line 188
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_6
    sget-object v0, La/o890;->f2:La/jh70;

    .line 192
    .line 193
    invoke-virtual {p0}, La/o890;->M0()La/p990;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-virtual {p0}, La/p990;->A()V

    .line 198
    .line 199
    .line 200
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object p0

    .line 203
    :pswitch_7
    sget-object v0, La/o890;->f2:La/jh70;

    .line 204
    .line 205
    invoke-virtual {p0}, La/o890;->M0()La/p990;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    iget-object v0, p0, La/p990;->q:La/z7z;

    .line 210
    .line 211
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, La/ctf0;

    .line 216
    .line 217
    new-array v1, v2, [Ljava/lang/Object;

    .line 218
    .line 219
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 220
    .line 221
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    const v2, 0x7f130690

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iget-object p0, p0, La/p990;->s:La/z7z;

    .line 233
    .line 234
    invoke-interface {p0}, La/z7z;->get()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    check-cast p0, La/grj;

    .line 239
    .line 240
    const-string v1, "://open/editprofile"

    .line 241
    .line 242
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-virtual {p0, v0}, La/grj;->a(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object p0

    .line 252
    :pswitch_8
    sget-object v0, La/o890;->f2:La/jh70;

    .line 253
    .line 254
    invoke-virtual {p0}, La/o890;->M0()La/p990;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-virtual {p0}, La/p990;->A()V

    .line 259
    .line 260
    .line 261
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object p0

    .line 264
    :pswitch_9
    sget-object v0, La/o890;->f2:La/jh70;

    .line 265
    .line 266
    invoke-virtual {p0}, La/o890;->M0()La/p990;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    iget-object v0, p0, La/p990;->p:La/mne;

    .line 275
    .line 276
    iget-object v7, v0, La/mne;->b:La/dvj;

    .line 277
    .line 278
    sget-object v5, La/e990;->a:La/e990;

    .line 279
    .line 280
    new-instance v8, La/o690;

    .line 281
    .line 282
    const/4 v0, 0x1

    .line 283
    invoke-direct {v8, p0, v3, v0}, La/o690;-><init>(La/w46;La/yje;B)V

    .line 284
    .line 285
    .line 286
    const/16 v9, 0xa

    .line 287
    .line 288
    const/4 v6, 0x0

    .line 289
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 290
    .line 291
    .line 292
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    return-object p0

    .line 295
    :pswitch_a
    sget-object v0, La/o890;->f2:La/jh70;

    .line 296
    .line 297
    invoke-virtual {p0}, La/o890;->M0()La/p990;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    invoke-virtual {p0}, La/p990;->A()V

    .line 302
    .line 303
    .line 304
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object p0

    .line 307
    :pswitch_b
    sget-object v0, La/o890;->f2:La/jh70;

    .line 308
    .line 309
    invoke-virtual {p0}, La/o890;->M0()La/p990;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    iget-object v0, p0, La/p990;->y:La/ol60;

    .line 314
    .line 315
    new-instance v1, La/y890;

    .line 316
    .line 317
    iget-object p0, p0, La/p990;->D:La/n0o0;

    .line 318
    .line 319
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    check-cast p0, La/ra10;

    .line 324
    .line 325
    invoke-direct {v1, p0}, La/y890;-><init>(La/ra10;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    return-object p0

    .line 334
    :pswitch_c
    sget-object v0, La/o890;->f2:La/jh70;

    .line 335
    .line 336
    invoke-virtual {p0}, La/o890;->M0()La/p990;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    iget-object v0, p0, La/p990;->y:La/ol60;

    .line 341
    .line 342
    new-instance v1, La/z890;

    .line 343
    .line 344
    iget-object p0, p0, La/p990;->E:La/n0o0;

    .line 345
    .line 346
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    check-cast p0, La/ra10;

    .line 351
    .line 352
    invoke-direct {v1, p0}, La/z890;-><init>(La/ra10;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 359
    .line 360
    return-object p0

    .line 361
    :pswitch_d
    sget-object v0, La/o890;->f2:La/jh70;

    .line 362
    .line 363
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 364
    .line 365
    .line 366
    move-result-object p0

    .line 367
    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 368
    .line 369
    invoke-static {v0}, La/hne;->j(Ljava/lang/String;)Landroid/content/Intent;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    const-string v1, "package"

    .line 374
    .line 375
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    invoke-static {v1, v2, v3}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 384
    .line 385
    .line 386
    const/16 v1, 0x22b

    .line 387
    .line 388
    invoke-virtual {p0, v0, v1}, La/agd;->startActivityForResult(Landroid/content/Intent;I)V

    .line 389
    .line 390
    .line 391
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    return-object p0

    .line 394
    nop

    .line 395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
