.class public final La/w4h;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/y4h;


# direct methods
.method public synthetic constructor <init>(La/y4h;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/w4h;->i:B

    iput-object p1, p0, La/w4h;->k:La/y4h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/w4h;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/w4h;->k:La/y4h;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/w4h;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/w4h;-><init>(La/y4h;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/w4h;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/w4h;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/w4h;-><init>(La/y4h;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/w4h;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/w4h;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/w4h;-><init>(La/y4h;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/w4h;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/w4h;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/rz10;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/w4h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/w4h;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/w4h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/w4h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/w4h;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/w4h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/z4h;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/w4h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/w4h;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/w4h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget-byte v0, p0, La/w4h;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/w4h;->k:La/y4h;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, La/w4h;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/rz10;

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, La/rz10;->a:Ljava/util/List;

    .line 20
    .line 21
    iget v0, p0, La/rz10;->c:I

    .line 22
    .line 23
    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, La/qz10;

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, La/rz10;->a:Ljava/util/List;

    .line 32
    .line 33
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    move-object p1, p0

    .line 38
    check-cast p1, La/qz10;

    .line 39
    .line 40
    :cond_0
    if-eqz p1, :cond_a

    .line 41
    .line 42
    iget-object p0, p1, La/qz10;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 43
    .line 44
    sget-object p1, La/y4h;->W1:La/kwd;

    .line 45
    .line 46
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v4, p1, Landroidx/fragment/app/e;->c:La/pmi;

    .line 62
    .line 63
    invoke-virtual {v4}, La/pmi;->p()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v4}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_2

    .line 80
    .line 81
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    move-object v7, v6

    .line 86
    check-cast v7, Landroidx/fragment/app/Fragment;

    .line 87
    .line 88
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->O()Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-nez v8, :cond_1

    .line 93
    .line 94
    iget-object v7, v7, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-nez v7, :cond_1

    .line 101
    .line 102
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    invoke-virtual {p1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-eqz v6, :cond_3

    .line 115
    .line 116
    if-eqz v4, :cond_3

    .line 117
    .line 118
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->S()Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    if-ne v6, v1, :cond_3

    .line 123
    .line 124
    goto/16 :goto_3

    .line 125
    .line 126
    :cond_3
    new-instance v6, La/zb5;

    .line 127
    .line 128
    invoke-direct {v6, p1}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 129
    .line 130
    .line 131
    const p1, 0x7f010053

    .line 132
    .line 133
    .line 134
    const v7, 0x7f010054

    .line 135
    .line 136
    .line 137
    const v8, 0x7f010051

    .line 138
    .line 139
    .line 140
    const v9, 0x7f010052

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6, v8, v9, p1, v7}, La/zb5;->p(IIII)V

    .line 144
    .line 145
    .line 146
    if-eqz v4, :cond_5

    .line 147
    .line 148
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->S()Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-eqz p0, :cond_4

    .line 153
    .line 154
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->O()Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    if-eqz p0, :cond_6

    .line 159
    .line 160
    :cond_4
    sget-object p0, La/lkz;->e:La/lkz;

    .line 161
    .line 162
    invoke-virtual {v6, v4, p0}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6, v4}, La/zb5;->r(Landroidx/fragment/app/Fragment;)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_5
    iget-object p1, v2, La/y4h;->Q1:La/khf0;

    .line 170
    .line 171
    sget-object v4, La/y4h;->X1:[La/iiy;

    .line 172
    .line 173
    const/4 v7, 0x0

    .line 174
    aget-object v4, v4, v7

    .line 175
    .line 176
    invoke-virtual {p1, v2, v4}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    check-cast p1, Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams;

    .line 181
    .line 182
    instance-of p1, p1, Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams$Disciplines;

    .line 183
    .line 184
    if-eqz p1, :cond_9

    .line 185
    .line 186
    iget-object p1, v2, La/y4h;->P1:La/kud;

    .line 187
    .line 188
    if-eqz p1, :cond_8

    .line 189
    .line 190
    new-instance p1, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;

    .line 191
    .line 192
    invoke-direct {p1, p0}, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 193
    .line 194
    .line 195
    sget-object p0, La/ptk;->U1:La/ddk;

    .line 196
    .line 197
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    new-instance p0, La/ptk;

    .line 201
    .line 202
    invoke-direct {p0}, La/ptk;-><init>()V

    .line 203
    .line 204
    .line 205
    sget-object v2, La/ptk;->V1:[La/iiy;

    .line 206
    .line 207
    aget-object v2, v2, v7

    .line 208
    .line 209
    iget-object v3, p0, La/ptk;->N1:La/khf0;

    .line 210
    .line 211
    invoke-virtual {v3, p0, v2, p1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 212
    .line 213
    .line 214
    const p1, 0x7f0a060f

    .line 215
    .line 216
    .line 217
    invoke-virtual {v6, p1, p0, v0, v1}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 218
    .line 219
    .line 220
    :cond_6
    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-eqz p1, :cond_7

    .line 229
    .line 230
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    check-cast p1, Landroidx/fragment/app/Fragment;

    .line 235
    .line 236
    sget-object v0, La/lkz;->d:La/lkz;

    .line 237
    .line 238
    invoke-virtual {v6, p1, v0}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6, p1}, La/zb5;->m(Landroidx/fragment/app/Fragment;)V

    .line 242
    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_7
    invoke-virtual {v6}, La/zb5;->h()V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_8
    const-string p0, "cyberGamesFragmentFactory"

    .line 250
    .line 251
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    throw v3

    .line 255
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 256
    .line 257
    .line 258
    goto :goto_4

    .line 259
    :cond_a
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    :goto_4
    return-object v3

    .line 262
    :pswitch_0
    move-object v5, p0

    .line 263
    check-cast v5, Ljava/lang/String;

    .line 264
    .line 265
    sget-object p0, La/wne;->a:La/wne;

    .line 266
    .line 267
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    sget-object p0, La/y4h;->W1:La/kwd;

    .line 271
    .line 272
    iget-object p0, v2, La/y4h;->R1:La/kiu0;

    .line 273
    .line 274
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    check-cast p0, La/c5h;

    .line 279
    .line 280
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    iget-object p0, p0, La/c5h;->q:La/p7m0;

    .line 284
    .line 285
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    move-object v4, p1

    .line 290
    check-cast v4, La/l120;

    .line 291
    .line 292
    const/4 v9, 0x0

    .line 293
    const/16 v10, 0xfb

    .line 294
    .line 295
    const/4 v6, 0x0

    .line 296
    const/4 v7, 0x0

    .line 297
    const/4 v8, 0x0

    .line 298
    invoke-static/range {v4 .. v10}, La/l120;->a(La/l120;Ljava/lang/String;ZZZZI)La/l120;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-virtual {p0, v3, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object p0

    .line 308
    :pswitch_1
    check-cast p0, La/z4h;

    .line 309
    .line 310
    sget-object v0, La/wne;->a:La/wne;

    .line 311
    .line 312
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    instance-of p0, p0, La/z4h;

    .line 316
    .line 317
    if-eqz p0, :cond_c

    .line 318
    .line 319
    iget-object p0, v2, La/y4h;->N1:La/poq0;

    .line 320
    .line 321
    if-eqz p0, :cond_b

    .line 322
    .line 323
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 324
    .line 325
    .line 326
    move-result-object p0

    .line 327
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    sget-object p1, La/fk60;->b:La/uuz;

    .line 331
    .line 332
    sget-object p1, La/ki60;->q2:La/htz;

    .line 333
    .line 334
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    const-string p1, "OnboardingBottomSheetContainerFragment"

    .line 338
    .line 339
    invoke-virtual {p0, p1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    if-nez v0, :cond_c

    .line 344
    .line 345
    new-instance v0, La/ki60;

    .line 346
    .line 347
    invoke-direct {v0}, La/ki60;-><init>()V

    .line 348
    .line 349
    .line 350
    sget-object v2, La/ki60;->r2:[La/iiy;

    .line 351
    .line 352
    aget-object v1, v2, v1

    .line 353
    .line 354
    iget-object v3, v0, La/ki60;->n2:La/zz2;

    .line 355
    .line 356
    const/4 v4, 0x7

    .line 357
    invoke-virtual {v3, v0, v1, v4}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 358
    .line 359
    .line 360
    const/4 v1, 0x2

    .line 361
    aget-object v1, v2, v1

    .line 362
    .line 363
    iget-object v2, v0, La/ki60;->o2:La/phf0;

    .line 364
    .line 365
    const-string v3, ""

    .line 366
    .line 367
    invoke-virtual {v2, v0, v1, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-static {v0, p0, p1}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    goto :goto_5

    .line 374
    :cond_b
    const-string p0, "tipsDialogFeature"

    .line 375
    .line 376
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    throw v3

    .line 380
    :cond_c
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    return-object p0

    .line 383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
