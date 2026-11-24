.class public final La/zlg0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/bmg0;


# direct methods
.method public synthetic constructor <init>(La/bmg0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zlg0;->i:B

    iput-object p1, p0, La/zlg0;->k:La/bmg0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/zlg0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/zlg0;->k:La/bmg0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/zlg0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/zlg0;-><init>(La/bmg0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/zlg0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/zlg0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/zlg0;-><init>(La/bmg0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/zlg0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/zlg0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/kog0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/zlg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zlg0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zlg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/fog0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/zlg0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/zlg0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/zlg0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget-byte v0, p0, La/zlg0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/zlg0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/kog0;

    .line 10
    .line 11
    sget-object v2, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_6

    .line 17
    .line 18
    instance-of p1, v0, La/jog0;

    .line 19
    .line 20
    const/16 v2, 0x8

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    iget-object p0, p0, La/zlg0;->k:La/bmg0;

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    sget-object p1, La/bmg0;->Z1:La/zie0;

    .line 28
    .line 29
    invoke-virtual {p0, v3}, La/bmg0;->I0(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/bmg0;->G0()La/cmg0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p1, p1, La/cmg0;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 37
    .line 38
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    check-cast v0, La/jog0;

    .line 42
    .line 43
    iget-object p1, v0, La/jog0;->a:Ljava/util/List;

    .line 44
    .line 45
    iget-object v0, p0, La/bmg0;->Y1:La/n0o0;

    .line 46
    .line 47
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, La/plg0;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, La/i26;->G(Ljava/util/List;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-object v2, v0

    .line 71
    check-cast v2, La/ykg0;

    .line 72
    .line 73
    iget-object v2, v2, La/ykg0;->e:La/clg0;

    .line 74
    .line 75
    sget-object v3, La/clg0;->d:La/clg0;

    .line 76
    .line 77
    if-ne v2, v3, :cond_0

    .line 78
    .line 79
    move-object v1, v0

    .line 80
    :cond_1
    if-eqz v1, :cond_5

    .line 81
    .line 82
    invoke-virtual {p0}, La/bmg0;->G0()La/cmg0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget-object p1, p1, La/cmg0;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 87
    .line 88
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const v0, 0x7f07071f

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    new-instance v1, La/pmk0;

    .line 100
    .line 101
    const/4 v7, 0x1

    .line 102
    const/16 v8, 0xce

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    const/4 v3, 0x0

    .line 106
    const/4 v4, 0x0

    .line 107
    const/4 v5, 0x0

    .line 108
    invoke-direct/range {v1 .. v8}, La/pmk0;-><init>(IIIIIII)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_2
    instance-of p1, v0, La/iog0;

    .line 116
    .line 117
    if-eqz p1, :cond_3

    .line 118
    .line 119
    sget-object p1, La/bmg0;->Z1:La/zie0;

    .line 120
    .line 121
    invoke-virtual {p0, v3}, La/bmg0;->I0(Z)V

    .line 122
    .line 123
    .line 124
    check-cast v0, La/iog0;

    .line 125
    .line 126
    iget-object p1, v0, La/iog0;->a:La/jkm;

    .line 127
    .line 128
    invoke-virtual {p0}, La/bmg0;->G0()La/cmg0;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    iget-object p0, p0, La/cmg0;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 133
    .line 134
    sget v0, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 135
    .line 136
    new-instance v0, La/bmh;

    .line 137
    .line 138
    const/16 v1, 0xc

    .line 139
    .line 140
    invoke-direct {v0, v1}, La/bmh;-><init>(B)V

    .line 141
    .line 142
    .line 143
    const-wide/16 v1, 0x2710

    .line 144
    .line 145
    invoke-virtual {p0, p1, v1, v2, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_3
    instance-of p1, v0, La/hog0;

    .line 153
    .line 154
    if-eqz p1, :cond_4

    .line 155
    .line 156
    sget-object p1, La/bmg0;->Z1:La/zie0;

    .line 157
    .line 158
    invoke-virtual {p0}, La/bmg0;->G0()La/cmg0;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    iget-object p1, p1, La/cmg0;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 163
    .line 164
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 165
    .line 166
    .line 167
    const/4 p1, 0x1

    .line 168
    invoke-virtual {p0, p1}, La/bmg0;->I0(Z)V

    .line 169
    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_4
    instance-of p0, v0, La/gog0;

    .line 173
    .line 174
    if-eqz p0, :cond_6

    .line 175
    .line 176
    :cond_5
    :goto_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 180
    .line 181
    .line 182
    :goto_1
    return-object v1

    .line 183
    :pswitch_0
    sget-object v3, La/rek0;->b:La/rek0;

    .line 184
    .line 185
    iget-object v0, p0, La/zlg0;->j:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, La/fog0;

    .line 188
    .line 189
    sget-object v2, La/wne;->a:La/wne;

    .line 190
    .line 191
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    if-eqz v0, :cond_e

    .line 195
    .line 196
    instance-of p1, v0, La/bog0;

    .line 197
    .line 198
    iget-object p0, p0, La/zlg0;->k:La/bmg0;

    .line 199
    .line 200
    if-eqz p1, :cond_7

    .line 201
    .line 202
    check-cast v0, La/bog0;

    .line 203
    .line 204
    iget-object p1, v0, La/bog0;->a:Ljava/lang/String;

    .line 205
    .line 206
    sget-object v0, La/bmg0;->Z1:La/zie0;

    .line 207
    .line 208
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    if-eqz p0, :cond_d

    .line 213
    .line 214
    invoke-static {p0, p1}, La/j120;->c0(Landroid/content/Context;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    goto/16 :goto_2

    .line 218
    .line 219
    :cond_7
    instance-of p1, v0, La/cog0;

    .line 220
    .line 221
    if-eqz p1, :cond_8

    .line 222
    .line 223
    check-cast v0, La/cog0;

    .line 224
    .line 225
    iget-object p1, v0, La/cog0;->a:Landroid/net/Uri;

    .line 226
    .line 227
    sget-object v0, La/bmg0;->Z1:La/zie0;

    .line 228
    .line 229
    new-instance v0, Landroid/content/Intent;

    .line 230
    .line 231
    const-string v1, "android.intent.action.DIAL"

    .line 232
    .line 233
    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_2

    .line 240
    .line 241
    :cond_8
    instance-of p1, v0, La/dog0;

    .line 242
    .line 243
    const-string v10, "snackbarManager"

    .line 244
    .line 245
    if-eqz p1, :cond_b

    .line 246
    .line 247
    check-cast v0, La/dog0;

    .line 248
    .line 249
    iget-object p1, v0, La/dog0;->a:Ljava/lang/String;

    .line 250
    .line 251
    sget-object v0, La/bmg0;->Z1:La/zie0;

    .line 252
    .line 253
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    iget-object v2, p0, La/bmg0;->O1:La/wdk0;

    .line 258
    .line 259
    if-eqz v2, :cond_a

    .line 260
    .line 261
    invoke-static {v0, v2, p1}, La/n6x;->u0(La/kxq;La/wdk0;Ljava/lang/String;)Ljava/io/Serializable;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-static {p1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    if-eqz p1, :cond_d

    .line 270
    .line 271
    const p1, 0x7f130ebc

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    new-instance v2, La/xdk0;

    .line 282
    .line 283
    const/4 v8, 0x0

    .line 284
    const/16 v9, 0x7c

    .line 285
    .line 286
    const/4 v5, 0x0

    .line 287
    const/4 v6, 0x0

    .line 288
    const/4 v7, 0x0

    .line 289
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 290
    .line 291
    .line 292
    iget-object v4, p0, La/bmg0;->O1:La/wdk0;

    .line 293
    .line 294
    if-eqz v4, :cond_9

    .line 295
    .line 296
    const/4 v10, 0x0

    .line 297
    const/16 v11, 0x3fc

    .line 298
    .line 299
    const/4 v7, 0x0

    .line 300
    const/4 v8, 0x0

    .line 301
    const/4 v9, 0x0

    .line 302
    move-object v6, p0

    .line 303
    move-object v5, v2

    .line 304
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 305
    .line 306
    .line 307
    goto :goto_2

    .line 308
    :cond_9
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw v1

    .line 312
    :cond_a
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    throw v1

    .line 316
    :cond_b
    instance-of p1, v0, La/eog0;

    .line 317
    .line 318
    if-eqz p1, :cond_e

    .line 319
    .line 320
    check-cast v0, La/eog0;

    .line 321
    .line 322
    iget-object p1, v0, La/eog0;->a:Ljava/lang/String;

    .line 323
    .line 324
    sget-object v0, La/bmg0;->Z1:La/zie0;

    .line 325
    .line 326
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 327
    .line 328
    const-string v2, "android.intent.action.VIEW"

    .line 329
    .line 330
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    invoke-direct {v0, v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 338
    .line 339
    .line 340
    goto :goto_2

    .line 341
    :catch_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 342
    .line 343
    .line 344
    move-result p1

    .line 345
    if-eqz p1, :cond_d

    .line 346
    .line 347
    iget-object p1, p0, La/bmg0;->O1:La/wdk0;

    .line 348
    .line 349
    if-eqz p1, :cond_c

    .line 350
    .line 351
    new-instance v2, La/xdk0;

    .line 352
    .line 353
    const v0, 0x7f130a82

    .line 354
    .line 355
    .line 356
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    const/4 v8, 0x0

    .line 364
    const/16 v9, 0x7c

    .line 365
    .line 366
    const/4 v5, 0x0

    .line 367
    const/4 v6, 0x0

    .line 368
    const/4 v7, 0x0

    .line 369
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 370
    .line 371
    .line 372
    const/4 v10, 0x0

    .line 373
    const/16 v11, 0x3fc

    .line 374
    .line 375
    const/4 v9, 0x0

    .line 376
    move-object v6, p0

    .line 377
    move-object v4, p1

    .line 378
    move-object v5, v2

    .line 379
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 380
    .line 381
    .line 382
    goto :goto_2

    .line 383
    :cond_c
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v1

    .line 387
    :cond_d
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 388
    .line 389
    goto :goto_3

    .line 390
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 391
    .line 392
    .line 393
    :goto_3
    return-object v1

    .line 394
    nop

    .line 395
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
