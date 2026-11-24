.class public final synthetic La/uyd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xyd;


# direct methods
.method public synthetic constructor <init>(La/xyd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uyd;->a:B

    iput-object p1, p0, La/uyd;->b:La/xyd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/uyd;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/uyd;->b:La/xyd;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/xyd;->U1:La/kud;

    .line 12
    .line 13
    invoke-virtual {v3}, La/xyd;->H0()La/kzd;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La/kzd;->t:La/bby;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {v0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_0
    sget-object v0, La/xyd;->U1:La/kud;

    .line 28
    .line 29
    invoke-virtual {v3}, La/xyd;->H0()La/kzd;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    iget-object v0, v6, La/kzd;->s:La/p7m0;

    .line 34
    .line 35
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, La/ezd;

    .line 40
    .line 41
    iget-boolean v0, v0, La/ezd;->b:Z

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v0, v6, La/kzd;->e:La/nr;

    .line 47
    .line 48
    iget-object v0, v0, La/nr;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, La/kt2;

    .line 51
    .line 52
    const-string v1, "reg_approve_code_sent"

    .line 53
    .line 54
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v6, La/kzd;->f:La/s64;

    .line 58
    .line 59
    sget-object v1, La/dl;->a:[La/dl;

    .line 60
    .line 61
    iget-object v0, v0, La/s64;->a:La/s1p;

    .line 62
    .line 63
    const-wide/16 v3, 0xbd3

    .line 64
    .line 65
    const-string v1, "email"

    .line 66
    .line 67
    invoke-static {v1, v0, v3, v4}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 68
    .line 69
    .line 70
    iget-object v0, v6, La/kzd;->t:La/bby;

    .line 71
    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-interface {v0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object v1, v6, La/kzd;->d:La/mne;

    .line 82
    .line 83
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 84
    .line 85
    new-instance v4, La/enc;

    .line 86
    .line 87
    const/4 v10, 0x0

    .line 88
    const/16 v11, 0x1a

    .line 89
    .line 90
    const/4 v5, 0x1

    .line 91
    const-class v7, La/kzd;

    .line 92
    .line 93
    const-string v8, "handleError"

    .line 94
    .line 95
    const-string v9, "handleError(Ljava/lang/Throwable;)V"

    .line 96
    .line 97
    invoke-direct/range {v4 .. v11}, La/enc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 98
    .line 99
    .line 100
    new-instance v11, La/gzd;

    .line 101
    .line 102
    invoke-direct {v11, v6, v2}, La/gzd;-><init>(La/kzd;La/yje;)V

    .line 103
    .line 104
    .line 105
    const/16 v12, 0xa

    .line 106
    .line 107
    const/4 v9, 0x0

    .line 108
    move-object v7, v0

    .line 109
    move-object v10, v1

    .line 110
    move-object v8, v4

    .line 111
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object v0, v6, La/kzd;->t:La/bby;

    .line 116
    .line 117
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object v0

    .line 120
    :pswitch_1
    sget-object v0, La/xyd;->U1:La/kud;

    .line 121
    .line 122
    invoke-virtual {v3}, La/xyd;->H0()La/kzd;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v1, v0, La/kzd;->c:Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;

    .line 127
    .line 128
    invoke-interface {v1}, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;->w()Lorg/xplatform/security/api/presentation/models/SendEmailIntention;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    instance-of v1, v1, Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;

    .line 133
    .line 134
    if-eqz v1, :cond_3

    .line 135
    .line 136
    iget-object v0, v0, La/kzd;->r:La/ol60;

    .line 137
    .line 138
    sget-object v1, La/azd;->a:La/azd;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    invoke-virtual {v0}, La/kzd;->w()V

    .line 145
    .line 146
    .line 147
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_2
    sget-object v0, La/xyd;->U1:La/kud;

    .line 151
    .line 152
    iget-object v0, v3, La/xyd;->Q1:La/a8z;

    .line 153
    .line 154
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, La/zci;

    .line 159
    .line 160
    iget-object v0, v0, La/zci;->s:La/n5d0;

    .line 161
    .line 162
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, La/yci;

    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_3
    sget-object v0, La/xyd;->U1:La/kud;

    .line 170
    .line 171
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    instance-of v1, v0, La/af3;

    .line 183
    .line 184
    if-eqz v1, :cond_4

    .line 185
    .line 186
    check-cast v0, La/af3;

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_4
    move-object v0, v2

    .line 190
    :goto_2
    const-class v1, La/tyd;

    .line 191
    .line 192
    if-eqz v0, :cond_7

    .line 193
    .line 194
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, La/o5d0;

    .line 203
    .line 204
    if-eqz v0, :cond_5

    .line 205
    .line 206
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, La/ze3;

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_5
    move-object v0, v2

    .line 214
    :goto_3
    instance-of v4, v0, La/tyd;

    .line 215
    .line 216
    if-nez v4, :cond_6

    .line 217
    .line 218
    move-object v0, v2

    .line 219
    :cond_6
    check-cast v0, La/tyd;

    .line 220
    .line 221
    if-eqz v0, :cond_7

    .line 222
    .line 223
    invoke-static {v3}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    iget-object v1, v3, La/xyd;->S1:La/khf0;

    .line 228
    .line 229
    sget-object v2, La/xyd;->V1:[La/iiy;

    .line 230
    .line 231
    const/4 v4, 0x1

    .line 232
    aget-object v2, v2, v4

    .line 233
    .line 234
    invoke-virtual {v1, v3, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    move-object v7, v1

    .line 239
    check-cast v7, Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;

    .line 240
    .line 241
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget-object v8, v0, La/tyd;->a:La/mne;

    .line 245
    .line 246
    iget-object v9, v0, La/tyd;->b:La/nr;

    .line 247
    .line 248
    iget-object v10, v0, La/tyd;->c:La/s64;

    .line 249
    .line 250
    iget-object v11, v0, La/tyd;->e:La/zg;

    .line 251
    .line 252
    iget-object v12, v0, La/tyd;->f:La/cyh;

    .line 253
    .line 254
    iget-object v14, v0, La/tyd;->g:La/ort;

    .line 255
    .line 256
    iget-object v13, v0, La/tyd;->j:La/ii;

    .line 257
    .line 258
    iget-object v15, v0, La/tyd;->h:La/zg;

    .line 259
    .line 260
    iget-object v1, v0, La/tyd;->i:La/z4w0;

    .line 261
    .line 262
    iget-object v2, v0, La/tyd;->k:La/duj;

    .line 263
    .line 264
    iget-object v3, v0, La/tyd;->l:La/gst0;

    .line 265
    .line 266
    iget-object v4, v0, La/tyd;->m:La/m1e;

    .line 267
    .line 268
    iget-object v5, v0, La/tyd;->n:La/wdk0;

    .line 269
    .line 270
    move-object/from16 v16, v1

    .line 271
    .line 272
    iget-object v1, v0, La/tyd;->o:La/ctf0;

    .line 273
    .line 274
    move-object/from16 v20, v5

    .line 275
    .line 276
    iget-object v5, v0, La/tyd;->p:La/lef0;

    .line 277
    .line 278
    iget-object v0, v0, La/tyd;->d:La/au0;

    .line 279
    .line 280
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    move-object/from16 v19, v4

    .line 296
    .line 297
    new-instance v4, La/zci;

    .line 298
    .line 299
    move-object/from16 v22, v0

    .line 300
    .line 301
    move-object/from16 v21, v1

    .line 302
    .line 303
    move-object/from16 v17, v2

    .line 304
    .line 305
    move-object/from16 v18, v3

    .line 306
    .line 307
    invoke-direct/range {v4 .. v22}, La/zci;-><init>(La/lef0;La/i1w0;Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;La/mne;La/nr;La/s64;La/zg;La/cyh;La/ii;La/ort;La/zg;La/z4w0;La/duj;La/gst0;La/m1e;La/wdk0;La/ctf0;La/au0;)V

    .line 308
    .line 309
    .line 310
    move-object v2, v4

    .line 311
    goto :goto_4

    .line 312
    :cond_7
    const-string v0, "Cannot create dependency "

    .line 313
    .line 314
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    :goto_4
    return-object v2

    .line 322
    :pswitch_4
    sget-object v0, La/xyd;->U1:La/kud;

    .line 323
    .line 324
    invoke-virtual {v3}, La/xyd;->H0()La/kzd;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-virtual {v0}, La/kzd;->w()V

    .line 329
    .line 330
    .line 331
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    return-object v0

    .line 334
    :pswitch_5
    sget-object v0, La/xyd;->U1:La/kud;

    .line 335
    .line 336
    invoke-virtual {v3}, La/xyd;->H0()La/kzd;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-virtual {v0}, La/kzd;->w()V

    .line 341
    .line 342
    .line 343
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    return-object v0

    .line 346
    :pswitch_6
    sget-object v1, La/xyd;->U1:La/kud;

    .line 347
    .line 348
    iget-object v5, v0, La/uyd;->b:La/xyd;

    .line 349
    .line 350
    iget-object v3, v5, La/xyd;->O1:La/wdk0;

    .line 351
    .line 352
    if-eqz v3, :cond_8

    .line 353
    .line 354
    new-instance v4, La/xdk0;

    .line 355
    .line 356
    sget-object v7, La/rek0;->b:La/rek0;

    .line 357
    .line 358
    const v0, 0x7f130dca

    .line 359
    .line 360
    .line 361
    invoke-virtual {v5, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v8

    .line 365
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    const/4 v12, 0x0

    .line 369
    const/16 v13, 0x7c

    .line 370
    .line 371
    const/4 v9, 0x0

    .line 372
    const/4 v10, 0x0

    .line 373
    const/4 v11, 0x0

    .line 374
    move-object v6, v4

    .line 375
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 376
    .line 377
    .line 378
    const/16 v10, 0x3fc

    .line 379
    .line 380
    const/4 v6, 0x0

    .line 381
    const/4 v7, 0x0

    .line 382
    const/4 v8, 0x0

    .line 383
    invoke-static/range {v3 .. v10}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 384
    .line 385
    .line 386
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 387
    .line 388
    return-object v0

    .line 389
    :cond_8
    const-string v0, "snackbarManager"

    .line 390
    .line 391
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    throw v2

    .line 395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
