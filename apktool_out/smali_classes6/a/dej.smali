.class public final La/dej;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/dej;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/kwd",
        "",
        "isApplyEnabled",
        "ui_core"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final l2:La/kwd;

.field public static final synthetic m2:[La/iiy;

.field public static final n2:Ljava/lang/String;


# instance fields
.field public final k2:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/dej;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/dej;->m2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/kwd;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/dej;->l2:La/kwd;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/dej;->n2:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "KEY_DATE_CALENDAR_RANGE_PARAMS"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/dej;->k2:La/khf0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 23

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    const v0, 0x503cbd99

    .line 6
    .line 7
    .line 8
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v3}, La/dej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v9, v0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 16
    .line 17
    invoke-virtual {v3}, La/dej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v10, v0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->e:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 22
    .line 23
    invoke-virtual {v3}, La/dej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->f:Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v3}, La/dej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget v1, v1, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->g:I

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v12

    .line 39
    invoke-virtual {v3}, La/dej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v1, v1, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->h:Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 44
    .line 45
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {}, La/a8k0;->s()Ljava/util/Locale;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    invoke-virtual {v6, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    sget-object v5, La/ukd;->a:La/cl5;

    .line 64
    .line 65
    if-nez v2, :cond_0

    .line 66
    .line 67
    if-ne v4, v5, :cond_1

    .line 68
    .line 69
    :cond_0
    invoke-static {v8}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v6, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    check-cast v4, Ljava/util/Calendar;

    .line 77
    .line 78
    invoke-virtual {v6, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    const/4 v11, 0x2

    .line 87
    const/4 v14, 0x1

    .line 88
    if-nez v2, :cond_2

    .line 89
    .line 90
    if-ne v7, v5, :cond_3

    .line 91
    .line 92
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance v2, La/n72;

    .line 96
    .line 97
    invoke-direct {v2, v4, v11}, La/n72;-><init>(Ljava/util/Calendar;B)V

    .line 98
    .line 99
    .line 100
    new-instance v7, La/zcj;

    .line 101
    .line 102
    invoke-direct {v7, v4, v14}, La/zcj;-><init>(Ljava/util/Calendar;B)V

    .line 103
    .line 104
    .line 105
    new-instance v4, La/v0h0;

    .line 106
    .line 107
    invoke-direct {v4, v7, v2}, La/v0h0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move-object v7, v4

    .line 114
    :cond_3
    check-cast v7, La/u0h0;

    .line 115
    .line 116
    const/4 v15, 0x0

    .line 117
    new-array v2, v15, [Ljava/lang/Object;

    .line 118
    .line 119
    invoke-virtual {v6, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    if-nez v4, :cond_4

    .line 128
    .line 129
    if-ne v13, v5, :cond_5

    .line 130
    .line 131
    :cond_4
    new-instance v13, La/ucj;

    .line 132
    .line 133
    invoke-direct {v13, v1, v11}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_5
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 140
    .line 141
    invoke-static {v2, v7, v13, v6, v15}, La/e9x;->O([Ljava/lang/Object;La/u0h0;Lkotlin/jvm/functions/Function0;La/fet;I)La/pz40;

    .line 142
    .line 143
    .line 144
    move-result-object v13

    .line 145
    invoke-virtual {v6, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-virtual {v6, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    or-int/2addr v1, v2

    .line 154
    invoke-virtual {v6, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    or-int/2addr v1, v2

    .line 159
    invoke-virtual {v6, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    or-int/2addr v1, v2

    .line 164
    invoke-virtual {v6, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    or-int/2addr v1, v2

    .line 169
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    if-nez v1, :cond_6

    .line 174
    .line 175
    if-ne v2, v5, :cond_8

    .line 176
    .line 177
    :cond_6
    new-instance v7, La/jej;

    .line 178
    .line 179
    if-eqz v0, :cond_7

    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    :cond_7
    invoke-direct/range {v7 .. v13}, La/jej;-><init>(Ljava/util/Locale;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;ILjava/lang/Integer;La/pz40;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    move-object v2, v7

    .line 192
    :cond_8
    move-object v4, v2

    .line 193
    check-cast v4, La/jej;

    .line 194
    .line 195
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    if-ne v0, v5, :cond_9

    .line 200
    .line 201
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    const v1, 0x7f13030c

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v6, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_9
    check-cast v0, Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    if-ne v1, v5, :cond_a

    .line 225
    .line 226
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    const v2, 0x7f13030b

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v6, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :cond_a
    check-cast v1, Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3}, La/dej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v6, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    if-nez v2, :cond_b

    .line 258
    .line 259
    if-ne v7, v5, :cond_c

    .line 260
    .line 261
    :cond_b
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    const v7, 0x7f130310

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v3}, La/dej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    iget v7, v7, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;->g:I

    .line 280
    .line 281
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    invoke-static {v7, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    invoke-static {v2, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    invoke-virtual {v6, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    :cond_c
    check-cast v7, Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {v6, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v8

    .line 310
    if-nez v2, :cond_d

    .line 311
    .line 312
    if-ne v8, v5, :cond_e

    .line 313
    .line 314
    :cond_d
    new-instance v8, La/utl;

    .line 315
    .line 316
    invoke-direct {v8, v4}, La/utl;-><init>(La/jej;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v6, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    :cond_e
    check-cast v8, La/utl;

    .line 323
    .line 324
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    if-ne v2, v5, :cond_f

    .line 329
    .line 330
    new-instance v2, La/ucj;

    .line 331
    .line 332
    invoke-direct {v2, v4, v14}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 333
    .line 334
    .line 335
    invoke-static {v2}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v6, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    :cond_f
    check-cast v2, La/l7m0;

    .line 343
    .line 344
    invoke-virtual {v6, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v10

    .line 352
    if-nez v9, :cond_10

    .line 353
    .line 354
    if-ne v10, v5, :cond_11

    .line 355
    .line 356
    :cond_10
    new-instance v16, La/wul;

    .line 357
    .line 358
    sget-object v17, La/nul;->e:La/nul;

    .line 359
    .line 360
    sget-object v18, La/oe9;->a:La/oe9;

    .line 361
    .line 362
    new-instance v9, La/ue9;

    .line 363
    .line 364
    invoke-direct {v9, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    const/16 v21, 0x0

    .line 368
    .line 369
    const/16 v22, 0x0

    .line 370
    .line 371
    const/16 v20, 0x1

    .line 372
    .line 373
    move-object/from16 v19, v9

    .line 374
    .line 375
    invoke-direct/range {v16 .. v22}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 376
    .line 377
    .line 378
    move-object/from16 v10, v16

    .line 379
    .line 380
    invoke-virtual {v6, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :cond_11
    check-cast v10, La/wul;

    .line 384
    .line 385
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    check-cast v0, Ljava/lang/Boolean;

    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v9

    .line 399
    invoke-virtual {v6, v0}, La/fet;->h(Z)Z

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    or-int/2addr v0, v9

    .line 404
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v9

    .line 408
    if-nez v0, :cond_12

    .line 409
    .line 410
    if-ne v9, v5, :cond_13

    .line 411
    .line 412
    :cond_12
    new-instance v16, La/wul;

    .line 413
    .line 414
    sget-object v17, La/lul;->e:La/lul;

    .line 415
    .line 416
    sget-object v18, La/oe9;->a:La/oe9;

    .line 417
    .line 418
    new-instance v0, La/ue9;

    .line 419
    .line 420
    invoke-direct {v0, v1}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    check-cast v1, Ljava/lang/Boolean;

    .line 428
    .line 429
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 430
    .line 431
    .line 432
    move-result v20

    .line 433
    const/16 v21, 0x0

    .line 434
    .line 435
    const/16 v22, 0x0

    .line 436
    .line 437
    move-object/from16 v19, v0

    .line 438
    .line 439
    invoke-direct/range {v16 .. v22}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 440
    .line 441
    .line 442
    move-object/from16 v9, v16

    .line 443
    .line 444
    invoke-virtual {v6, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    :cond_13
    move-object v2, v9

    .line 448
    check-cast v2, La/wul;

    .line 449
    .line 450
    invoke-static {v14, v6}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 451
    .line 452
    .line 453
    move-result-object v17

    .line 454
    new-instance v16, La/bw5;

    .line 455
    .line 456
    new-instance v0, La/rgh;

    .line 457
    .line 458
    const/4 v1, 0x4

    .line 459
    invoke-direct {v0, v3, v7, v1}, La/rgh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 460
    .line 461
    .line 462
    const v1, 0x2911f1c8

    .line 463
    .line 464
    .line 465
    invoke-static {v1, v0, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 466
    .line 467
    .line 468
    move-result-object v18

    .line 469
    new-instance v0, La/x2g;

    .line 470
    .line 471
    const/16 v5, 0xf

    .line 472
    .line 473
    move-object v1, v10

    .line 474
    invoke-direct/range {v0 .. v5}, La/x2g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 475
    .line 476
    .line 477
    const v1, 0x25ccb190

    .line 478
    .line 479
    .line 480
    invoke-static {v1, v0, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 481
    .line 482
    .line 483
    move-result-object v19

    .line 484
    new-instance v0, La/rgh;

    .line 485
    .line 486
    const/4 v1, 0x5

    .line 487
    invoke-direct {v0, v3, v8, v1}, La/rgh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 488
    .line 489
    .line 490
    const v1, 0x5ee36b4a

    .line 491
    .line 492
    .line 493
    invoke-static {v1, v0, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 494
    .line 495
    .line 496
    move-result-object v20

    .line 497
    const/16 v21, 0x2

    .line 498
    .line 499
    invoke-direct/range {v16 .. v21}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v6, v15}, La/fet;->r(Z)V

    .line 503
    .line 504
    .line 505
    return-object v16
.end method

.method public final P0()Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;
    .locals 2

    .line 1
    sget-object v0, La/dej;->m2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/dej;->k2:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/ui_core/calendar/model/DateRangeCalendarBottomSheetParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/iw5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 10
    .line 11
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x3

    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
