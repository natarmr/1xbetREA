.class public final La/z430;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/fragment/app/Fragment;

.field public final b:La/vq;

.field public final c:La/ii;

.field public final d:La/e720;

.field public final e:La/lgn0;

.field public final f:La/wdk0;

.field public final g:La/qta0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;La/vq;La/ii;La/e720;La/lgn0;La/wdk0;La/qta0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/z430;->a:Landroidx/fragment/app/Fragment;

    .line 23
    .line 24
    iput-object p2, p0, La/z430;->b:La/vq;

    .line 25
    .line 26
    iput-object p3, p0, La/z430;->c:La/ii;

    .line 27
    .line 28
    iput-object p4, p0, La/z430;->d:La/e720;

    .line 29
    .line 30
    iput-object p5, p0, La/z430;->e:La/lgn0;

    .line 31
    .line 32
    iput-object p6, p0, La/z430;->f:La/wdk0;

    .line 33
    .line 34
    iput-object p7, p0, La/z430;->g:La/qta0;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a(La/y130;JLjava/lang/String;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    instance-of v2, v1, La/i130;

    .line 12
    .line 13
    iget-object v4, v0, La/z430;->a:Landroidx/fragment/app/Fragment;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    check-cast v1, La/i130;

    .line 18
    .line 19
    iget-object v5, v1, La/i130;->a:La/aud;

    .line 20
    .line 21
    iget-object v9, v1, La/i130;->b:La/ctc;

    .line 22
    .line 23
    iget-object v11, v1, La/i130;->c:La/ms2;

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v10, 0x1

    .line 27
    iget-object v3, v0, La/z430;->b:La/vq;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    move-wide/from16 v12, p2

    .line 32
    .line 33
    move-object/from16 v14, p4

    .line 34
    .line 35
    invoke-virtual/range {v3 .. v14}, La/vq;->a(Landroidx/fragment/app/Fragment;La/aud;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ctc;ZLa/ms2;JLjava/lang/String;)La/yq;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    sget-object v2, La/n130;->a:La/n130;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/4 v3, 0x0

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    iget-object v0, v0, La/z430;->b:La/vq;

    .line 49
    .line 50
    invoke-virtual {v0, v4, v3, v3}, La/vq;->b(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)La/xq;

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    instance-of v2, v1, La/j130;

    .line 55
    .line 56
    iget-object v5, v0, La/z430;->c:La/ii;

    .line 57
    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    move-object v0, v1

    .line 61
    check-cast v0, La/j130;

    .line 62
    .line 63
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 64
    .line 65
    iget-object v7, v0, La/j130;->a:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v8, v0, La/j130;->b:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v9, v0, La/j130;->c:Ljava/lang/String;

    .line 70
    .line 71
    sget-object v15, La/n12;->b:La/n12;

    .line 72
    .line 73
    const/16 v16, 0x0

    .line 74
    .line 75
    const/16 v17, 0x5f8

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    const/4 v11, 0x0

    .line 79
    const/4 v12, 0x0

    .line 80
    const/4 v13, 0x0

    .line 81
    const/4 v14, 0x0

    .line 82
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 83
    .line 84
    .line 85
    invoke-static {v4, v5, v6}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_2
    instance-of v2, v1, La/k130;

    .line 90
    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    move-object v0, v1

    .line 94
    check-cast v0, La/k130;

    .line 95
    .line 96
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 97
    .line 98
    iget-object v7, v0, La/k130;->a:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v8, v0, La/k130;->b:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v9, v0, La/k130;->c:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v10, v0, La/k130;->d:Ljava/lang/String;

    .line 105
    .line 106
    sget-object v15, La/n12;->b:La/n12;

    .line 107
    .line 108
    const/16 v16, 0x0

    .line 109
    .line 110
    const/16 v17, 0x5d0

    .line 111
    .line 112
    const/4 v11, 0x0

    .line 113
    const-string v12, "REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG"

    .line 114
    .line 115
    const/4 v13, 0x0

    .line 116
    const/4 v14, 0x0

    .line 117
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 118
    .line 119
    .line 120
    invoke-static {v4, v5, v6}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_3
    sget-object v2, La/l130;->a:La/l130;

    .line 125
    .line 126
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_4

    .line 131
    .line 132
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_4
    instance-of v2, v1, La/m130;

    .line 141
    .line 142
    if-eqz v2, :cond_5

    .line 143
    .line 144
    move-object v0, v1

    .line 145
    check-cast v0, La/m130;

    .line 146
    .line 147
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 148
    .line 149
    iget-object v7, v0, La/m130;->a:Ljava/lang/String;

    .line 150
    .line 151
    iget-object v8, v0, La/m130;->b:Ljava/lang/String;

    .line 152
    .line 153
    iget-object v9, v0, La/m130;->c:Ljava/lang/String;

    .line 154
    .line 155
    sget-object v15, La/n12;->b:La/n12;

    .line 156
    .line 157
    const/16 v16, 0x0

    .line 158
    .line 159
    const/16 v17, 0x5f8

    .line 160
    .line 161
    const/4 v10, 0x0

    .line 162
    const/4 v11, 0x0

    .line 163
    const/4 v12, 0x0

    .line 164
    const/4 v13, 0x0

    .line 165
    const/4 v14, 0x0

    .line 166
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 167
    .line 168
    .line 169
    invoke-static {v4, v5, v6}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_5
    instance-of v2, v1, La/o130;

    .line 174
    .line 175
    if-eqz v2, :cond_6

    .line 176
    .line 177
    move-object v0, v1

    .line 178
    check-cast v0, La/o130;

    .line 179
    .line 180
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 181
    .line 182
    iget-object v7, v0, La/o130;->a:Ljava/lang/String;

    .line 183
    .line 184
    iget-object v8, v0, La/o130;->b:Ljava/lang/String;

    .line 185
    .line 186
    iget-object v9, v0, La/o130;->c:Ljava/lang/String;

    .line 187
    .line 188
    iget-object v10, v0, La/o130;->d:Ljava/lang/String;

    .line 189
    .line 190
    sget-object v15, La/n12;->b:La/n12;

    .line 191
    .line 192
    const/16 v16, 0x0

    .line 193
    .line 194
    const/16 v17, 0x5d0

    .line 195
    .line 196
    const/4 v11, 0x0

    .line 197
    const-string v12, "REQUEST_CODE_SHOW_COUPON_HAS_SAME_EVENT"

    .line 198
    .line 199
    const/4 v13, 0x0

    .line 200
    const/4 v14, 0x0

    .line 201
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 202
    .line 203
    .line 204
    invoke-static {v4, v5, v6}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_6
    instance-of v2, v1, La/p130;

    .line 209
    .line 210
    if-eqz v2, :cond_7

    .line 211
    .line 212
    check-cast v1, La/p130;

    .line 213
    .line 214
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    iget-object v3, v1, La/p130;->a:La/m97;

    .line 222
    .line 223
    iget-object v4, v1, La/p130;->b:La/m0k0;

    .line 224
    .line 225
    iget-object v1, v1, La/p130;->c:La/ms2;

    .line 226
    .line 227
    iget-object v0, v0, La/z430;->d:La/e720;

    .line 228
    .line 229
    invoke-virtual {v0, v2, v3, v4, v1}, La/e720;->b(Landroidx/fragment/app/e;La/m97;La/m0k0;La/ms2;)V

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :cond_7
    instance-of v2, v1, La/s130;

    .line 234
    .line 235
    if-eqz v2, :cond_8

    .line 236
    .line 237
    move-object v0, v1

    .line 238
    check-cast v0, La/s130;

    .line 239
    .line 240
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-static {v1}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 245
    .line 246
    .line 247
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 248
    .line 249
    iget-object v7, v0, La/s130;->a:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v8, v0, La/s130;->b:Ljava/lang/String;

    .line 252
    .line 253
    iget-object v9, v0, La/s130;->c:Ljava/lang/String;

    .line 254
    .line 255
    iget-object v10, v0, La/s130;->d:Ljava/lang/String;

    .line 256
    .line 257
    sget-object v15, La/n12;->b:La/n12;

    .line 258
    .line 259
    const/16 v16, 0x0

    .line 260
    .line 261
    const/16 v17, 0x5d0

    .line 262
    .line 263
    const/4 v11, 0x0

    .line 264
    const-string v12, "REQUEST_CODE_BET_EXIST_ERROR"

    .line 265
    .line 266
    const/4 v13, 0x0

    .line 267
    const/4 v14, 0x0

    .line 268
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 269
    .line 270
    .line 271
    invoke-static {v4, v5, v6}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :cond_8
    instance-of v2, v1, La/t130;

    .line 276
    .line 277
    if-eqz v2, :cond_9

    .line 278
    .line 279
    move-object v0, v1

    .line 280
    check-cast v0, La/t130;

    .line 281
    .line 282
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-static {v1}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 287
    .line 288
    .line 289
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 290
    .line 291
    iget-object v7, v0, La/t130;->a:Ljava/lang/String;

    .line 292
    .line 293
    iget-object v8, v0, La/t130;->b:Ljava/lang/String;

    .line 294
    .line 295
    iget-object v9, v0, La/t130;->c:Ljava/lang/String;

    .line 296
    .line 297
    sget-object v15, La/n12;->b:La/n12;

    .line 298
    .line 299
    const/16 v16, 0x0

    .line 300
    .line 301
    const/16 v17, 0x5f8

    .line 302
    .line 303
    const/4 v10, 0x0

    .line 304
    const/4 v11, 0x0

    .line 305
    const/4 v12, 0x0

    .line 306
    const/4 v13, 0x0

    .line 307
    const/4 v14, 0x0

    .line 308
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 309
    .line 310
    .line 311
    invoke-static {v4, v5, v6}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 312
    .line 313
    .line 314
    return-void

    .line 315
    :cond_9
    instance-of v2, v1, La/u130;

    .line 316
    .line 317
    if-eqz v2, :cond_a

    .line 318
    .line 319
    move-object v0, v1

    .line 320
    check-cast v0, La/u130;

    .line 321
    .line 322
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-static {v1}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 327
    .line 328
    .line 329
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 330
    .line 331
    iget-object v7, v0, La/u130;->a:Ljava/lang/String;

    .line 332
    .line 333
    iget-object v8, v0, La/u130;->b:Ljava/lang/String;

    .line 334
    .line 335
    iget-object v9, v0, La/u130;->c:Ljava/lang/String;

    .line 336
    .line 337
    iget-object v10, v0, La/u130;->d:Ljava/lang/String;

    .line 338
    .line 339
    sget-object v15, La/n12;->b:La/n12;

    .line 340
    .line 341
    const/16 v16, 0x0

    .line 342
    .line 343
    const/16 v17, 0x5d0

    .line 344
    .line 345
    const/4 v11, 0x0

    .line 346
    const-string v12, "REQUEST_CODE_NOT_ENOUGH_MONEY_ERROR"

    .line 347
    .line 348
    const/4 v13, 0x0

    .line 349
    const/4 v14, 0x0

    .line 350
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 351
    .line 352
    .line 353
    invoke-static {v4, v5, v6}, La/ua80;->r(Landroidx/fragment/app/Fragment;La/ii;Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 354
    .line 355
    .line 356
    return-void

    .line 357
    :cond_a
    sget-object v2, La/v130;->a:La/v130;

    .line 358
    .line 359
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    if-eqz v2, :cond_b

    .line 364
    .line 365
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-static {v0}, La/gnm0;->s(Landroidx/fragment/app/e;)V

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :cond_b
    instance-of v2, v1, La/w130;

    .line 374
    .line 375
    if-eqz v2, :cond_e

    .line 376
    .line 377
    check-cast v1, La/w130;

    .line 378
    .line 379
    iget-object v2, v1, La/w130;->a:La/zh7;

    .line 380
    .line 381
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    invoke-static {v5}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 386
    .line 387
    .line 388
    sget-object v5, La/pn40;->a:La/pn40;

    .line 389
    .line 390
    iget-wide v5, v2, La/zh7;->e:D

    .line 391
    .line 392
    sget-object v7, La/p3u0;->c:La/p3u0;

    .line 393
    .line 394
    invoke-static {v5, v6, v7}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v11

    .line 398
    new-instance v5, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 399
    .line 400
    iget-object v6, v1, La/w130;->f:Ljava/lang/String;

    .line 401
    .line 402
    iget-object v7, v1, La/w130;->m:Ljava/lang/String;

    .line 403
    .line 404
    invoke-direct {v5, v6, v3, v7, v3}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    iget-object v3, v1, La/w130;->g:Ljava/lang/String;

    .line 408
    .line 409
    iget-object v14, v2, La/zh7;->b:Ljava/lang/String;

    .line 410
    .line 411
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    new-instance v7, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 416
    .line 417
    iget-object v8, v1, La/w130;->h:Ljava/lang/String;

    .line 418
    .line 419
    iget-object v2, v2, La/zh7;->d:Ljava/lang/String;

    .line 420
    .line 421
    invoke-direct {v7, v8, v2}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v6, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    iget-object v2, v1, La/w130;->k:Ljava/lang/String;

    .line 428
    .line 429
    if-eqz v2, :cond_c

    .line 430
    .line 431
    iget-object v7, v1, La/w130;->l:Ljava/lang/String;

    .line 432
    .line 433
    if-eqz v7, :cond_c

    .line 434
    .line 435
    new-instance v8, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 436
    .line 437
    invoke-direct {v8, v2, v7}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v6, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    :cond_c
    new-instance v8, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 444
    .line 445
    iget-object v10, v1, La/w130;->j:Ljava/lang/String;

    .line 446
    .line 447
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    const v7, 0x7f040b72

    .line 452
    .line 453
    .line 454
    invoke-static {v7, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 455
    .line 456
    .line 457
    move-result v9

    .line 458
    iget-object v12, v1, La/w130;->b:Ljava/lang/String;

    .line 459
    .line 460
    const/4 v13, 0x1

    .line 461
    invoke-direct/range {v8 .. v13}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v6, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    iget-boolean v2, v1, La/w130;->e:Z

    .line 468
    .line 469
    if-nez v2, :cond_d

    .line 470
    .line 471
    new-instance v7, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 472
    .line 473
    iget-object v9, v1, La/w130;->i:Ljava/lang/String;

    .line 474
    .line 475
    iget-object v10, v1, La/w130;->c:Ljava/lang/String;

    .line 476
    .line 477
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    const v8, 0x7f040aeb

    .line 482
    .line 483
    .line 484
    invoke-static {v8, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 485
    .line 486
    .line 487
    move-result v8

    .line 488
    iget-object v11, v1, La/w130;->b:Ljava/lang/String;

    .line 489
    .line 490
    const/4 v12, 0x0

    .line 491
    invoke-direct/range {v7 .. v12}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v6, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    :cond_d
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 498
    .line 499
    .line 500
    move-result-object v18

    .line 501
    iget-wide v1, v1, La/w130;->d:J

    .line 502
    .line 503
    sget-object v6, La/hg7;->a:La/hg7;

    .line 504
    .line 505
    new-instance v12, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 506
    .line 507
    const-string v15, "REQUEST_SUCCESS_BET_KEY"

    .line 508
    .line 509
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 510
    .line 511
    .line 512
    move-result-object v16

    .line 513
    const-string v17, "SIMPLE"

    .line 514
    .line 515
    move-object v13, v3

    .line 516
    invoke-direct/range {v12 .. v18}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 517
    .line 518
    .line 519
    iget-object v0, v0, La/z430;->e:La/lgn0;

    .line 520
    .line 521
    invoke-virtual {v0, v5, v12, v4}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 522
    .line 523
    .line 524
    return-void

    .line 525
    :cond_e
    instance-of v2, v1, La/x130;

    .line 526
    .line 527
    if-eqz v2, :cond_f

    .line 528
    .line 529
    check-cast v1, La/x130;

    .line 530
    .line 531
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    invoke-static {v2}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 536
    .line 537
    .line 538
    new-instance v5, La/xdk0;

    .line 539
    .line 540
    sget-object v6, La/rek0;->b:La/rek0;

    .line 541
    .line 542
    iget-object v7, v1, La/x130;->a:Ljava/lang/String;

    .line 543
    .line 544
    const/4 v11, 0x0

    .line 545
    const/16 v12, 0x7c

    .line 546
    .line 547
    const/4 v8, 0x0

    .line 548
    const/4 v9, 0x0

    .line 549
    const/4 v10, 0x0

    .line 550
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 551
    .line 552
    .line 553
    const/16 v10, 0x3fc

    .line 554
    .line 555
    iget-object v3, v0, La/z430;->f:La/wdk0;

    .line 556
    .line 557
    const/4 v6, 0x0

    .line 558
    const/4 v7, 0x0

    .line 559
    const/4 v8, 0x0

    .line 560
    move-object/from16 v19, v5

    .line 561
    .line 562
    move-object v5, v4

    .line 563
    move-object/from16 v4, v19

    .line 564
    .line 565
    invoke-static/range {v3 .. v10}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 566
    .line 567
    .line 568
    return-void

    .line 569
    :cond_f
    sget-object v2, La/r130;->a:La/r130;

    .line 570
    .line 571
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v2

    .line 575
    if-eqz v2, :cond_11

    .line 576
    .line 577
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    iget-object v0, v0, La/z430;->g:La/qta0;

    .line 585
    .line 586
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    sget v0, La/nta0;->m2:I

    .line 590
    .line 591
    const-string v0, "PolybetRulesBottomSheetDialog"

    .line 592
    .line 593
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    if-eqz v2, :cond_10

    .line 598
    .line 599
    return-void

    .line 600
    :cond_10
    new-instance v2, La/nta0;

    .line 601
    .line 602
    invoke-direct {v2}, La/nta0;-><init>()V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v2, v1, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    return-void

    .line 609
    :cond_11
    instance-of v0, v1, La/q130;

    .line 610
    .line 611
    if-eqz v0, :cond_12

    .line 612
    .line 613
    sget-object v0, La/vv20;->m2:La/xuz;

    .line 614
    .line 615
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    check-cast v1, La/q130;

    .line 623
    .line 624
    iget-object v3, v1, La/q130;->a:Ljava/lang/String;

    .line 625
    .line 626
    iget-object v1, v1, La/q130;->b:Ljava/lang/String;

    .line 627
    .line 628
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    invoke-static {v2, v3, v1}, La/xuz;->c(Landroidx/fragment/app/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    return-void

    .line 635
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 636
    .line 637
    .line 638
    return-void
.end method

.method public final b(La/ms2;Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    new-instance v0, La/pd10;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, p2, v1}, La/pd10;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/z430;->a:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    const-string v2, "REQUEST_CODE_NOT_ENOUGH_MONEY_ERROR"

    .line 11
    .line 12
    invoke-static {v1, v2, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, La/pd10;

    .line 16
    .line 17
    const/16 v2, 0x1a

    .line 18
    .line 19
    invoke-direct {v0, p2, v2}, La/pd10;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 20
    .line 21
    .line 22
    const-string v2, "REQUEST_CODE_BET_EXIST_ERROR"

    .line 23
    .line 24
    invoke-static {v1, v2, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, La/pd10;

    .line 28
    .line 29
    const/16 v2, 0x1b

    .line 30
    .line 31
    invoke-direct {v0, p2, v2}, La/pd10;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 32
    .line 33
    .line 34
    const-string v2, "REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG"

    .line 35
    .line 36
    invoke-static {v1, v2, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, La/pd10;

    .line 40
    .line 41
    const/16 v2, 0x1c

    .line 42
    .line 43
    invoke-direct {v0, p2, v2}, La/pd10;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 44
    .line 45
    .line 46
    const-string v2, "REQUEST_CODE_SHOW_COUPON_HAS_SAME_EVENT"

    .line 47
    .line 48
    invoke-static {v1, v2, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, La/gn;

    .line 52
    .line 53
    const/16 v2, 0x1d

    .line 54
    .line 55
    invoke-direct {v0, p2, v2}, La/gn;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, La/z430;->b:La/vq;

    .line 59
    .line 60
    invoke-virtual {p0, v1, p1, v0}, La/vq;->e(Landroidx/fragment/app/Fragment;La/ms2;La/xdr;)V

    .line 61
    .line 62
    .line 63
    new-instance v0, La/pd10;

    .line 64
    .line 65
    invoke-direct {v0, p2, v2}, La/pd10;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v1, p1, v0}, La/vq;->f(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function0;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method
