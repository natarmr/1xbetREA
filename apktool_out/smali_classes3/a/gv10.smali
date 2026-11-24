.class public final La/gv10;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/hv10;


# direct methods
.method public synthetic constructor <init>(La/hv10;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gv10;->i:B

    iput-object p1, p0, La/gv10;->k:La/hv10;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/gv10;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/gv10;->k:La/hv10;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/gv10;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/gv10;-><init>(La/hv10;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/gv10;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/gv10;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/gv10;-><init>(La/hv10;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/gv10;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/gv10;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/gv10;-><init>(La/hv10;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/gv10;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/gv10;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/evp0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/gv10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/gv10;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/gv10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/wpe;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/gv10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/gv10;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/gv10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/e9h0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/gv10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/gv10;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/gv10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gv10;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/gv10;->k:La/hv10;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v0, v0, La/gv10;->j:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v0, La/evp0;

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, La/bvp0;->a:La/bvp0;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const-string v5, "telegramScreenFactory"

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v0, v3, La/hv10;->L1:La/s9m0;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    new-instance v0, La/qvp0;

    .line 36
    .line 37
    invoke-direct {v0}, La/qvp0;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v0, v1}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v4

    .line 56
    :cond_1
    instance-of v1, v0, La/dvp0;

    .line 57
    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    iget-object v1, v3, La/hv10;->L1:La/s9m0;

    .line 61
    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    new-instance v1, Lorg/xplatform/mailing/api/presentation/models/TelegramBonusCodeParams;

    .line 65
    .line 66
    check-cast v0, La/dvp0;

    .line 67
    .line 68
    iget-object v4, v0, La/dvp0;->b:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v0, v0, La/dvp0;->a:Ljava/lang/String;

    .line 71
    .line 72
    invoke-direct {v1, v4, v0}, Lorg/xplatform/mailing/api/presentation/models/TelegramBonusCodeParams;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sget-object v0, La/gup0;->n2:La/m6m0;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v0, La/gup0;

    .line 81
    .line 82
    invoke-direct {v0}, La/gup0;-><init>()V

    .line 83
    .line 84
    .line 85
    sget-object v4, La/gup0;->o2:[La/iiy;

    .line 86
    .line 87
    aget-object v2, v4, v2

    .line 88
    .line 89
    iget-object v4, v0, La/gup0;->k2:La/khf0;

    .line 90
    .line 91
    invoke-virtual {v4, v0, v2, v1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v0, v1}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v4

    .line 110
    :cond_3
    sget-object v1, La/cvp0;->a:La/cvp0;

    .line 111
    .line 112
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_4

    .line 117
    .line 118
    sget-object v0, La/hv10;->X1:La/atz;

    .line 119
    .line 120
    invoke-virtual {v3}, La/hv10;->I0()La/w220;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    sget-object v6, La/s120;->a:La/s120;

    .line 129
    .line 130
    iget-object v1, v0, La/w220;->C:La/mne;

    .line 131
    .line 132
    iget-object v8, v1, La/mne;->b:La/dvj;

    .line 133
    .line 134
    new-instance v9, La/o120;

    .line 135
    .line 136
    const/4 v1, 0x4

    .line 137
    invoke-direct {v9, v0, v4, v1}, La/o120;-><init>(La/w220;La/yje;B)V

    .line 138
    .line 139
    .line 140
    const/16 v10, 0xa

    .line 141
    .line 142
    const/4 v7, 0x0

    .line 143
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 144
    .line 145
    .line 146
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 150
    .line 151
    .line 152
    :goto_1
    return-object v4

    .line 153
    :pswitch_0
    check-cast v0, La/wpe;

    .line 154
    .line 155
    sget-object v1, La/wne;->a:La/wne;

    .line 156
    .line 157
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    sget-object v1, La/wpe;->a:La/wpe;

    .line 161
    .line 162
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-nez v2, :cond_6

    .line 167
    .line 168
    sget-object v2, La/wpe;->b:La/wpe;

    .line 169
    .line 170
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_6

    .line 175
    .line 176
    sget-object v0, La/hv10;->X1:La/atz;

    .line 177
    .line 178
    iget-object v0, v3, La/hv10;->R1:La/ii;

    .line 179
    .line 180
    if-eqz v0, :cond_5

    .line 181
    .line 182
    new-instance v5, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 183
    .line 184
    const v2, 0x7f130162

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    const v2, 0x7f130508

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    const v2, 0x7f130e5d

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v8

    .line 205
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    sget-object v14, La/n12;->a:La/n12;

    .line 209
    .line 210
    const/4 v15, 0x0

    .line 211
    const/16 v16, 0x5f8

    .line 212
    .line 213
    const/4 v9, 0x0

    .line 214
    const/4 v10, 0x0

    .line 215
    const/4 v11, 0x0

    .line 216
    const/4 v12, 0x0

    .line 217
    const/4 v13, 0x0

    .line 218
    invoke-direct/range {v5 .. v16}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v5, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3}, La/hv10;->I0()La/w220;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    iget-object v0, v0, La/w220;->l0:La/erj;

    .line 236
    .line 237
    iget-object v0, v0, La/erj;->Z:La/p7m0;

    .line 238
    .line 239
    invoke-virtual {v0, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_5
    const-string v0, "actionDialogManager"

    .line 244
    .line 245
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v4

    .line 249
    :cond_6
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object v0

    .line 252
    :pswitch_1
    check-cast v0, La/e9h0;

    .line 253
    .line 254
    sget-object v1, La/wne;->a:La/wne;

    .line 255
    .line 256
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    if-eqz v0, :cond_28

    .line 260
    .line 261
    instance-of v1, v0, La/n8h0;

    .line 262
    .line 263
    if-eqz v1, :cond_19

    .line 264
    .line 265
    check-cast v0, La/n8h0;

    .line 266
    .line 267
    iget-object v0, v0, La/n8h0;->a:Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;

    .line 268
    .line 269
    sget-object v1, La/hv10;->X1:La/atz;

    .line 270
    .line 271
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    iget-object v1, v1, Landroidx/fragment/app/e;->c:La/pmi;

    .line 276
    .line 277
    invoke-virtual {v1}, La/pmi;->p()Ljava/util/List;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    if-eqz v6, :cond_8

    .line 293
    .line 294
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    move-object v7, v6

    .line 299
    check-cast v7, Landroidx/fragment/app/Fragment;

    .line 300
    .line 301
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->S()Z

    .line 302
    .line 303
    .line 304
    move-result v7

    .line 305
    if-eqz v7, :cond_7

    .line 306
    .line 307
    goto :goto_3

    .line 308
    :cond_8
    move-object v6, v4

    .line 309
    :goto_3
    check-cast v6, Landroidx/fragment/app/Fragment;

    .line 310
    .line 311
    if-eqz v6, :cond_a

    .line 312
    .line 313
    instance-of v5, v6, La/sao0;

    .line 314
    .line 315
    if-eqz v5, :cond_9

    .line 316
    .line 317
    check-cast v6, La/sao0;

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_9
    move-object v6, v4

    .line 321
    :goto_4
    if-eqz v6, :cond_a

    .line 322
    .line 323
    invoke-virtual {v6}, La/sao0;->H0()La/cb50;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    goto :goto_5

    .line 328
    :cond_a
    move-object v5, v4

    .line 329
    :goto_5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    move v8, v2

    .line 334
    move-object v7, v4

    .line 335
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 336
    .line 337
    .line 338
    move-result v9

    .line 339
    if-eqz v9, :cond_11

    .line 340
    .line 341
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v9

    .line 345
    add-int/lit8 v10, v8, 0x1

    .line 346
    .line 347
    if-ltz v8, :cond_10

    .line 348
    .line 349
    check-cast v9, Landroidx/fragment/app/Fragment;

    .line 350
    .line 351
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    iget-object v9, v9, Landroidx/fragment/app/e;->c:La/pmi;

    .line 356
    .line 357
    invoke-virtual {v9}, La/pmi;->p()Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v9

    .line 361
    invoke-static {v9}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 362
    .line 363
    .line 364
    move-result-object v11

    .line 365
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object v9

    .line 369
    :cond_b
    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v12

    .line 373
    if-eqz v12, :cond_c

    .line 374
    .line 375
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v12

    .line 379
    instance-of v13, v12, La/ers;

    .line 380
    .line 381
    if-eqz v13, :cond_b

    .line 382
    .line 383
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    goto :goto_7

    .line 387
    :cond_c
    new-instance v9, Ljava/util/ArrayList;

    .line 388
    .line 389
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 393
    .line 394
    .line 395
    move-result-object v11

    .line 396
    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 397
    .line 398
    .line 399
    move-result v12

    .line 400
    if-eqz v12, :cond_e

    .line 401
    .line 402
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v12

    .line 406
    move-object v13, v12

    .line 407
    check-cast v13, La/ers;

    .line 408
    .line 409
    invoke-interface {v13}, La/ers;->a()J

    .line 410
    .line 411
    .line 412
    move-result-wide v13

    .line 413
    move-object/from16 v16, v3

    .line 414
    .line 415
    iget-wide v2, v0, Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;->a:J

    .line 416
    .line 417
    cmp-long v2, v13, v2

    .line 418
    .line 419
    if-nez v2, :cond_d

    .line 420
    .line 421
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    :cond_d
    move-object/from16 v3, v16

    .line 425
    .line 426
    const/4 v2, 0x0

    .line 427
    goto :goto_8

    .line 428
    :cond_e
    move-object/from16 v16, v3

    .line 429
    .line 430
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    if-eqz v3, :cond_f

    .line 439
    .line 440
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    check-cast v3, La/ers;

    .line 445
    .line 446
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v7

    .line 450
    goto :goto_9

    .line 451
    :cond_f
    move v8, v10

    .line 452
    move-object/from16 v3, v16

    .line 453
    .line 454
    const/4 v2, 0x0

    .line 455
    goto :goto_6

    .line 456
    :cond_10
    invoke-static {}, La/q3d;->p()V

    .line 457
    .line 458
    .line 459
    throw v4

    .line 460
    :cond_11
    move-object/from16 v16, v3

    .line 461
    .line 462
    move-object v1, v7

    .line 463
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 464
    .line 465
    if-eqz v1, :cond_12

    .line 466
    .line 467
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    if-eqz v1, :cond_12

    .line 472
    .line 473
    iget-object v1, v1, Landroidx/fragment/app/e;->c:La/pmi;

    .line 474
    .line 475
    invoke-virtual {v1}, La/pmi;->p()Ljava/util/List;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    if-eqz v1, :cond_12

    .line 480
    .line 481
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 486
    .line 487
    goto :goto_a

    .line 488
    :cond_12
    move-object v1, v4

    .line 489
    :goto_a
    instance-of v2, v7, La/sao0;

    .line 490
    .line 491
    if-eqz v2, :cond_13

    .line 492
    .line 493
    move-object v4, v7

    .line 494
    check-cast v4, La/sao0;

    .line 495
    .line 496
    :cond_13
    if-eqz v4, :cond_14

    .line 497
    .line 498
    invoke-virtual {v4}, La/sao0;->H0()La/cb50;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    if-nez v2, :cond_15

    .line 503
    .line 504
    :cond_14
    move-object v2, v5

    .line 505
    :cond_15
    if-eqz v1, :cond_16

    .line 506
    .line 507
    if-nez v2, :cond_17

    .line 508
    .line 509
    :cond_16
    move-object/from16 v1, v16

    .line 510
    .line 511
    goto :goto_b

    .line 512
    :cond_17
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    if-nez v0, :cond_27

    .line 517
    .line 518
    move-object/from16 v1, v16

    .line 519
    .line 520
    invoke-virtual {v1, v2}, La/hv10;->J0(La/cb50;)V

    .line 521
    .line 522
    .line 523
    goto/16 :goto_12

    .line 524
    .line 525
    :goto_b
    invoke-virtual {v1}, La/hv10;->I0()La/w220;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    iget-object v2, v1, La/w220;->s:La/ouu;

    .line 530
    .line 531
    invoke-virtual {v2}, La/ouu;->s()La/i1w0;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 536
    .line 537
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 538
    .line 539
    .line 540
    iget-object v1, v1, La/w220;->A:La/qv2;

    .line 541
    .line 542
    invoke-virtual {v1, v0}, La/qv2;->h(Lorg/xplatform/sportgame/navigation/api/presentation/GameScreenGeneralParams;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    instance-of v1, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 547
    .line 548
    if-eqz v1, :cond_18

    .line 549
    .line 550
    new-instance v1, La/e1w0;

    .line 551
    .line 552
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 553
    .line 554
    invoke-direct {v1, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 555
    .line 556
    .line 557
    new-instance v0, La/c8d;

    .line 558
    .line 559
    sget-object v4, La/y7d;->a:La/v7d;

    .line 560
    .line 561
    invoke-direct {v0, v4, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v3, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    :goto_c
    const/4 v15, 0x0

    .line 568
    goto :goto_d

    .line 569
    :cond_18
    new-instance v1, La/w0w0;

    .line 570
    .line 571
    invoke-direct {v1, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 572
    .line 573
    .line 574
    new-instance v0, La/c8d;

    .line 575
    .line 576
    sget-object v4, La/y7d;->a:La/v7d;

    .line 577
    .line 578
    invoke-direct {v0, v4, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v3, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    goto :goto_c

    .line 585
    :goto_d
    invoke-static {v2, v3, v15}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    :goto_e
    move-object v1, v0

    .line 590
    check-cast v1, La/paw;

    .line 591
    .line 592
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    if-eqz v3, :cond_27

    .line 597
    .line 598
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    check-cast v1, La/oe50;

    .line 603
    .line 604
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 605
    .line 606
    .line 607
    goto :goto_e

    .line 608
    :cond_19
    move-object v1, v3

    .line 609
    instance-of v2, v0, La/w8h0;

    .line 610
    .line 611
    if-eqz v2, :cond_1a

    .line 612
    .line 613
    check-cast v0, La/w8h0;

    .line 614
    .line 615
    iget-boolean v0, v0, La/w8h0;->a:Z

    .line 616
    .line 617
    sget-object v2, La/hv10;->X1:La/atz;

    .line 618
    .line 619
    invoke-virtual {v1}, La/hv10;->H0()La/byq;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    iget-object v1, v1, La/byq;->b:Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 624
    .line 625
    iget-object v2, v1, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->h:Ljava/util/LinkedHashMap;

    .line 626
    .line 627
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 628
    .line 629
    .line 630
    move-result-object v3

    .line 631
    const-string v4, "MENU_TAG"

    .line 632
    .line 633
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    iget-object v1, v1, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->m:La/kao0;

    .line 637
    .line 638
    if-eqz v1, :cond_27

    .line 639
    .line 640
    invoke-interface {v1, v4, v0}, La/kao0;->a(Ljava/lang/String;Z)V

    .line 641
    .line 642
    .line 643
    goto/16 :goto_12

    .line 644
    .line 645
    :cond_1a
    instance-of v2, v0, La/v8h0;

    .line 646
    .line 647
    if-eqz v2, :cond_1d

    .line 648
    .line 649
    check-cast v0, La/v8h0;

    .line 650
    .line 651
    iget-boolean v0, v0, La/v8h0;->a:Z

    .line 652
    .line 653
    sget-object v2, La/hv10;->X1:La/atz;

    .line 654
    .line 655
    iget-object v2, v1, La/hv10;->U1:La/r12;

    .line 656
    .line 657
    if-eqz v2, :cond_1c

    .line 658
    .line 659
    new-instance v3, La/q12;

    .line 660
    .line 661
    new-instance v5, Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$UserAgreementDocumentsDialog;

    .line 662
    .line 663
    invoke-direct {v5, v0}, Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$UserAgreementDocumentsDialog;-><init>(Z)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    iget-object v1, v1, La/hv10;->Q1:La/wxs0;

    .line 671
    .line 672
    if-eqz v1, :cond_1b

    .line 673
    .line 674
    const-string v1, "USER_AGREEMENT_DIALOG_REQUEST_KEY"

    .line 675
    .line 676
    invoke-direct {v3, v5, v0, v1}, La/q12;-><init>(Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    check-cast v2, La/s12;

    .line 680
    .line 681
    invoke-virtual {v2, v3}, La/s12;->a(La/q12;)V

    .line 682
    .line 683
    .line 684
    goto/16 :goto_12

    .line 685
    .line 686
    :cond_1b
    const-string v0, "userAgreementFeature"

    .line 687
    .line 688
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    throw v4

    .line 692
    :cond_1c
    const-string v0, "alertsPipeReceiver"

    .line 693
    .line 694
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    throw v4

    .line 698
    :cond_1d
    instance-of v2, v0, La/a9h0;

    .line 699
    .line 700
    if-eqz v2, :cond_1e

    .line 701
    .line 702
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    invoke-static {v2}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 707
    .line 708
    .line 709
    move-result-object v2

    .line 710
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 711
    .line 712
    .line 713
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    check-cast v0, La/a9h0;

    .line 718
    .line 719
    iget v0, v0, La/a9h0;->a:I

    .line 720
    .line 721
    invoke-static {v2, v1, v0}, La/ga3;->K(La/cpv0;Landroid/content/Context;I)V

    .line 722
    .line 723
    .line 724
    goto/16 :goto_12

    .line 725
    .line 726
    :cond_1e
    instance-of v2, v0, La/u8h0;

    .line 727
    .line 728
    if-eqz v2, :cond_1f

    .line 729
    .line 730
    check-cast v0, La/u8h0;

    .line 731
    .line 732
    iget-object v0, v0, La/u8h0;->a:Ljava/lang/String;

    .line 733
    .line 734
    sget-object v2, La/hv10;->X1:La/atz;

    .line 735
    .line 736
    new-instance v2, Landroid/content/Intent;

    .line 737
    .line 738
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 739
    .line 740
    .line 741
    const-string v3, "android.intent.action.SEND"

    .line 742
    .line 743
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 744
    .line 745
    .line 746
    const-string v3, "android.intent.extra.TEXT"

    .line 747
    .line 748
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 749
    .line 750
    .line 751
    const-string v0, "text/plain"

    .line 752
    .line 753
    invoke-virtual {v2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 754
    .line 755
    .line 756
    invoke-static {v2, v4}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 761
    .line 762
    .line 763
    goto/16 :goto_12

    .line 764
    .line 765
    :cond_1f
    instance-of v2, v0, La/x8h0;

    .line 766
    .line 767
    if-eqz v2, :cond_28

    .line 768
    .line 769
    check-cast v0, La/x8h0;

    .line 770
    .line 771
    iget-object v7, v0, La/x8h0;->a:Ljava/lang/String;

    .line 772
    .line 773
    sget-object v6, La/rek0;->b:La/rek0;

    .line 774
    .line 775
    iget-boolean v0, v0, La/x8h0;->b:Z

    .line 776
    .line 777
    sget-object v2, La/hv10;->X1:La/atz;

    .line 778
    .line 779
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 780
    .line 781
    .line 782
    move-result-object v2

    .line 783
    invoke-virtual {v2}, La/kxq;->r()La/v1r;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    iget-object v2, v2, Landroidx/fragment/app/e;->c:La/pmi;

    .line 788
    .line 789
    invoke-virtual {v2}, La/pmi;->p()Ljava/util/List;

    .line 790
    .line 791
    .line 792
    move-result-object v2

    .line 793
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 794
    .line 795
    .line 796
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    :cond_20
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 801
    .line 802
    .line 803
    move-result v3

    .line 804
    if-eqz v3, :cond_22

    .line 805
    .line 806
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v3

    .line 810
    move-object v5, v3

    .line 811
    check-cast v5, Landroidx/fragment/app/Fragment;

    .line 812
    .line 813
    if-eqz v0, :cond_21

    .line 814
    .line 815
    instance-of v5, v5, La/hgn0;

    .line 816
    .line 817
    goto :goto_f

    .line 818
    :cond_21
    instance-of v5, v5, La/yfn0;

    .line 819
    .line 820
    :goto_f
    if-eqz v5, :cond_20

    .line 821
    .line 822
    goto :goto_10

    .line 823
    :cond_22
    move-object v3, v4

    .line 824
    :goto_10
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 825
    .line 826
    if-eqz v3, :cond_27

    .line 827
    .line 828
    if-eqz v0, :cond_24

    .line 829
    .line 830
    instance-of v0, v3, La/sik;

    .line 831
    .line 832
    if-eqz v0, :cond_23

    .line 833
    .line 834
    move-object v0, v3

    .line 835
    check-cast v0, La/sik;

    .line 836
    .line 837
    goto :goto_11

    .line 838
    :cond_23
    move-object v0, v4

    .line 839
    :goto_11
    if-eqz v0, :cond_27

    .line 840
    .line 841
    invoke-virtual {v0}, La/sik;->A0()Landroid/app/Dialog;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    if-eqz v0, :cond_27

    .line 846
    .line 847
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    if-eqz v0, :cond_27

    .line 852
    .line 853
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    if-nez v0, :cond_25

    .line 858
    .line 859
    goto :goto_12

    .line 860
    :cond_24
    move-object v0, v4

    .line 861
    :cond_25
    iget-object v1, v1, La/hv10;->S1:La/wdk0;

    .line 862
    .line 863
    if-eqz v1, :cond_26

    .line 864
    .line 865
    new-instance v5, La/xdk0;

    .line 866
    .line 867
    const/4 v11, 0x0

    .line 868
    const/16 v12, 0x7c

    .line 869
    .line 870
    const/4 v8, 0x0

    .line 871
    const/4 v9, 0x0

    .line 872
    const/4 v10, 0x0

    .line 873
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 874
    .line 875
    .line 876
    const/4 v14, 0x0

    .line 877
    const/16 v15, 0x3f4

    .line 878
    .line 879
    const/4 v13, 0x0

    .line 880
    move-object v12, v0

    .line 881
    move-object v8, v1

    .line 882
    move-object v10, v3

    .line 883
    move-object v9, v5

    .line 884
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 885
    .line 886
    .line 887
    goto :goto_12

    .line 888
    :cond_26
    const-string v0, "snackbarManager"

    .line 889
    .line 890
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    throw v4

    .line 894
    :cond_27
    :goto_12
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 895
    .line 896
    goto :goto_13

    .line 897
    :cond_28
    invoke-static {}, La/t9f;->b()V

    .line 898
    .line 899
    .line 900
    :goto_13
    return-object v4

    .line 901
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
