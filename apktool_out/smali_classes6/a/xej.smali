.class public final La/xej;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/xej;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/nwd",
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
.field public static final l2:La/nwd;

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
    const-class v1, La/xej;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;"

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
    sput-object v2, La/xej;->m2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/nwd;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/xej;->l2:La/nwd;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/xej;->n2:Ljava/lang/String;

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
    const-string v1, "KEY_DATE_CALENDAR_PARAMS"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/xej;->k2:La/khf0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 31

    .line 1
    move-object/from16 v7, p1

    .line 2
    .line 3
    const v0, 0x37049eb9

    .line 4
    .line 5
    .line 6
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v10, La/ukd;->a:La/cl5;

    .line 14
    .line 15
    if-ne v0, v10, :cond_0

    .line 16
    .line 17
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v7, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    move-object v11, v0

    .line 25
    check-cast v11, Ljava/util/Calendar;

    .line 26
    .line 27
    invoke-virtual/range {p0 .. p0}, La/xej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v0, v0, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;->d:La/ulq0;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v12, 0x3

    .line 38
    const/4 v1, 0x0

    .line 39
    const/4 v13, 0x1

    .line 40
    if-eqz v0, :cond_13

    .line 41
    .line 42
    if-ne v0, v13, :cond_12

    .line 43
    .line 44
    const v0, -0x7d4efebb

    .line 45
    .line 46
    .line 47
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual/range {p0 .. p0}, La/xej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v0, v0, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;->b:Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 55
    .line 56
    iget-object v0, v0, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 57
    .line 58
    invoke-virtual/range {p0 .. p0}, La/xej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object v2, v2, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;->c:Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 63
    .line 64
    iget-object v2, v2, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 65
    .line 66
    invoke-virtual/range {p0 .. p0}, La/xej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iget-object v3, v3, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;->f:Ljava/lang/Long;

    .line 71
    .line 72
    if-eqz v3, :cond_1

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 75
    .line 76
    .line 77
    move-result-wide v3

    .line 78
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {v3, v4, v11}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    goto :goto_0

    .line 86
    :cond_1
    move-object v3, v1

    .line 87
    :goto_0
    invoke-virtual/range {p0 .. p0}, La/xej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    iget-object v4, v4, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;->g:Ljava/lang/Long;

    .line 92
    .line 93
    if-eqz v4, :cond_2

    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v4, v5, v11}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {}, La/a8k0;->s()Ljava/util/Locale;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v7, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    if-nez v5, :cond_3

    .line 125
    .line 126
    if-ne v6, v10, :cond_4

    .line 127
    .line 128
    :cond_3
    invoke-static {v4}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-virtual {v7, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    check-cast v6, Ljava/util/Calendar;

    .line 136
    .line 137
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v7, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    if-nez v5, :cond_5

    .line 149
    .line 150
    if-ne v8, v10, :cond_6

    .line 151
    .line 152
    :cond_5
    new-instance v5, La/n72;

    .line 153
    .line 154
    invoke-direct {v5, v6, v12}, La/n72;-><init>(Ljava/util/Calendar;B)V

    .line 155
    .line 156
    .line 157
    new-instance v8, La/zcj;

    .line 158
    .line 159
    const/4 v9, 0x2

    .line 160
    invoke-direct {v8, v6, v9}, La/zcj;-><init>(Ljava/util/Calendar;B)V

    .line 161
    .line 162
    .line 163
    new-instance v9, La/v0h0;

    .line 164
    .line 165
    invoke-direct {v9, v8, v5}, La/v0h0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    move-object v8, v9

    .line 172
    :cond_6
    check-cast v8, La/u0h0;

    .line 173
    .line 174
    invoke-virtual {v7, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    invoke-virtual {v7, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    or-int/2addr v5, v9

    .line 183
    invoke-virtual {v7, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    or-int/2addr v5, v9

    .line 188
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    if-nez v5, :cond_7

    .line 193
    .line 194
    if-ne v9, v10, :cond_d

    .line 195
    .line 196
    :cond_7
    if-eqz v3, :cond_9

    .line 197
    .line 198
    if-nez v1, :cond_8

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_8
    new-instance v5, Lkotlin/Pair;

    .line 202
    .line 203
    invoke-direct {v5, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    move-object v9, v5

    .line 207
    goto :goto_5

    .line 208
    :cond_9
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 209
    .line 210
    .line 211
    move-result-wide v15

    .line 212
    invoke-static {v0, v6}, La/wdx;->f0(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)J

    .line 213
    .line 214
    .line 215
    move-result-wide v12

    .line 216
    invoke-static {v2, v6}, La/wdx;->f0(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)J

    .line 217
    .line 218
    .line 219
    move-result-wide v19

    .line 220
    cmp-long v1, v12, v19

    .line 221
    .line 222
    if-lez v1, :cond_a

    .line 223
    .line 224
    invoke-static {v12, v13, v6}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    new-instance v3, Lkotlin/Pair;

    .line 229
    .line 230
    invoke-direct {v3, v1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_a
    move-wide/from16 v17, v12

    .line 235
    .line 236
    invoke-static/range {v15 .. v20}, La/l1e0;->f(JJJ)J

    .line 237
    .line 238
    .line 239
    move-result-wide v12

    .line 240
    cmp-long v1, v12, v19

    .line 241
    .line 242
    if-lez v1, :cond_b

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_b
    move-wide/from16 v19, v12

    .line 246
    .line 247
    :goto_2
    cmp-long v1, v19, v12

    .line 248
    .line 249
    if-gez v1, :cond_c

    .line 250
    .line 251
    move-wide v14, v12

    .line 252
    goto :goto_3

    .line 253
    :cond_c
    move-wide/from16 v14, v19

    .line 254
    .line 255
    :goto_3
    invoke-static {v12, v13, v6}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-static {v14, v15, v6}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    new-instance v5, Lkotlin/Pair;

    .line 264
    .line 265
    invoke-direct {v5, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    move-object v3, v5

    .line 269
    :goto_4
    move-object v9, v3

    .line 270
    :goto_5
    invoke-virtual {v7, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    :cond_d
    check-cast v9, Lkotlin/Pair;

    .line 274
    .line 275
    iget-object v1, v9, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v1, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 278
    .line 279
    iget-object v3, v9, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v3, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 282
    .line 283
    const/4 v5, 0x0

    .line 284
    new-array v6, v5, [Ljava/lang/Object;

    .line 285
    .line 286
    invoke-virtual {v7, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    invoke-virtual {v7, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    or-int/2addr v5, v9

    .line 295
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v9

    .line 299
    if-nez v5, :cond_e

    .line 300
    .line 301
    if-ne v9, v10, :cond_f

    .line 302
    .line 303
    :cond_e
    new-instance v9, La/vef;

    .line 304
    .line 305
    const/16 v5, 0x17

    .line 306
    .line 307
    invoke-direct {v9, v1, v3, v5}, La/vef;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v7, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    :cond_f
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 314
    .line 315
    const/4 v5, 0x0

    .line 316
    invoke-static {v6, v8, v9, v7, v5}, La/e9x;->O([Ljava/lang/Object;La/u0h0;Lkotlin/jvm/functions/Function0;La/fet;I)La/pz40;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {v7, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    invoke-virtual {v7, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    or-int/2addr v3, v5

    .line 329
    invoke-virtual {v7, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    or-int/2addr v3, v5

    .line 334
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    if-nez v3, :cond_10

    .line 339
    .line 340
    if-ne v5, v10, :cond_11

    .line 341
    .line 342
    :cond_10
    new-instance v5, La/ffj;

    .line 343
    .line 344
    invoke-direct {v5, v4, v0, v2, v1}, La/ffj;-><init>(Ljava/util/Locale;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;La/pz40;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    :cond_11
    check-cast v5, La/ffj;

    .line 351
    .line 352
    const/4 v0, 0x0

    .line 353
    invoke-virtual {v7, v0}, La/fet;->r(Z)V

    .line 354
    .line 355
    .line 356
    move-object v0, v7

    .line 357
    goto/16 :goto_7

    .line 358
    .line 359
    :cond_12
    const/4 v0, 0x0

    .line 360
    const v1, -0x77a81581

    .line 361
    .line 362
    .line 363
    invoke-static {v1, v7, v0}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    throw v0

    .line 368
    :cond_13
    const v0, -0x7d59c5bb

    .line 369
    .line 370
    .line 371
    invoke-virtual {v7, v0}, La/fet;->e0(I)V

    .line 372
    .line 373
    .line 374
    invoke-virtual/range {p0 .. p0}, La/xej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    iget-object v0, v0, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;->b:Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 379
    .line 380
    iget-object v0, v0, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 381
    .line 382
    invoke-virtual/range {p0 .. p0}, La/xej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    iget-object v2, v2, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;->c:Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 387
    .line 388
    iget-object v2, v2, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 389
    .line 390
    invoke-virtual/range {p0 .. p0}, La/xej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    iget-object v3, v3, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;->c:Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 395
    .line 396
    iget-object v5, v3, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;->b:Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;

    .line 397
    .line 398
    invoke-virtual/range {p0 .. p0}, La/xej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    iget-object v3, v3, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;->b:Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 403
    .line 404
    iget-object v4, v3, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;->b:Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;

    .line 405
    .line 406
    invoke-virtual/range {p0 .. p0}, La/xej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    iget-object v3, v3, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;->f:Ljava/lang/Long;

    .line 411
    .line 412
    if-eqz v3, :cond_14

    .line 413
    .line 414
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 415
    .line 416
    .line 417
    move-result-wide v8

    .line 418
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    invoke-static {v8, v9, v11}, La/bsr0;->h0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    goto :goto_6

    .line 426
    :cond_14
    move-object v3, v1

    .line 427
    :goto_6
    invoke-virtual/range {p0 .. p0}, La/xej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    iget-object v6, v6, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;->e:La/yg40;

    .line 432
    .line 433
    invoke-virtual/range {p0 .. p0}, La/xej;->P0()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 434
    .line 435
    .line 436
    move-result-object v8

    .line 437
    iget-object v8, v8, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;->g:Ljava/lang/Long;

    .line 438
    .line 439
    if-eqz v8, :cond_15

    .line 440
    .line 441
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 442
    .line 443
    .line 444
    move-result-wide v8

    .line 445
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-static {v8, v9, v11}, La/bsr0;->h0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    :cond_15
    const v8, 0x1201248

    .line 453
    .line 454
    .line 455
    const/16 v9, 0x30

    .line 456
    .line 457
    move-object/from16 v30, v3

    .line 458
    .line 459
    move-object v3, v1

    .line 460
    move-object v1, v2

    .line 461
    move-object/from16 v2, v30

    .line 462
    .line 463
    invoke-static/range {v0 .. v9}, La/rsr0;->d0(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;La/yg40;La/fet;II)La/gfj;

    .line 464
    .line 465
    .line 466
    move-result-object v5

    .line 467
    move-object v0, v7

    .line 468
    const/4 v1, 0x0

    .line 469
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 470
    .line 471
    .line 472
    :goto_7
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    if-ne v1, v10, :cond_16

    .line 477
    .line 478
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    const v2, 0x7f130313

    .line 483
    .line 484
    .line 485
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    invoke-virtual {v0, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    :cond_16
    move-object v8, v1

    .line 493
    check-cast v8, Ljava/lang/String;

    .line 494
    .line 495
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    if-ne v1, v10, :cond_17

    .line 503
    .line 504
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    const v2, 0x7f130311

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    invoke-virtual {v0, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    :cond_17
    move-object v9, v1

    .line 519
    check-cast v9, Ljava/lang/String;

    .line 520
    .line 521
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    if-ne v1, v10, :cond_18

    .line 529
    .line 530
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    const v2, 0x7f13030c

    .line 535
    .line 536
    .line 537
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-virtual {v0, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 542
    .line 543
    .line 544
    :cond_18
    check-cast v1, Ljava/lang/String;

    .line 545
    .line 546
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    if-ne v2, v10, :cond_19

    .line 554
    .line 555
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    const v3, 0x7f13030b

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    :cond_19
    check-cast v2, Ljava/lang/String;

    .line 570
    .line 571
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v3

    .line 578
    if-ne v3, v10, :cond_1a

    .line 579
    .line 580
    new-instance v3, La/ucj;

    .line 581
    .line 582
    const/4 v4, 0x3

    .line 583
    invoke-direct {v3, v5, v4}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 584
    .line 585
    .line 586
    invoke-static {v3}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    invoke-virtual {v0, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    :cond_1a
    check-cast v3, La/l7m0;

    .line 594
    .line 595
    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v4

    .line 599
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v6

    .line 603
    if-nez v4, :cond_1b

    .line 604
    .line 605
    if-ne v6, v10, :cond_1c

    .line 606
    .line 607
    :cond_1b
    new-instance v23, La/wul;

    .line 608
    .line 609
    sget-object v24, La/nul;->e:La/nul;

    .line 610
    .line 611
    sget-object v25, La/oe9;->a:La/oe9;

    .line 612
    .line 613
    new-instance v4, La/ue9;

    .line 614
    .line 615
    invoke-direct {v4, v1}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    const/16 v28, 0x0

    .line 619
    .line 620
    const/16 v29, 0x0

    .line 621
    .line 622
    const/16 v27, 0x1

    .line 623
    .line 624
    move-object/from16 v26, v4

    .line 625
    .line 626
    invoke-direct/range {v23 .. v29}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 627
    .line 628
    .line 629
    move-object/from16 v6, v23

    .line 630
    .line 631
    invoke-virtual {v0, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    :cond_1c
    check-cast v6, La/wul;

    .line 635
    .line 636
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    check-cast v1, Ljava/lang/Boolean;

    .line 641
    .line 642
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    move-result v4

    .line 650
    invoke-virtual {v0, v1}, La/fet;->h(Z)Z

    .line 651
    .line 652
    .line 653
    move-result v1

    .line 654
    or-int/2addr v1, v4

    .line 655
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v4

    .line 659
    if-nez v1, :cond_1d

    .line 660
    .line 661
    if-ne v4, v10, :cond_1e

    .line 662
    .line 663
    :cond_1d
    new-instance v23, La/wul;

    .line 664
    .line 665
    sget-object v24, La/lul;->e:La/lul;

    .line 666
    .line 667
    sget-object v25, La/oe9;->a:La/oe9;

    .line 668
    .line 669
    new-instance v1, La/ue9;

    .line 670
    .line 671
    invoke-direct {v1, v2}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    check-cast v2, Ljava/lang/Boolean;

    .line 679
    .line 680
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 681
    .line 682
    .line 683
    move-result v27

    .line 684
    const/16 v28, 0x0

    .line 685
    .line 686
    const/16 v29, 0x0

    .line 687
    .line 688
    move-object/from16 v26, v1

    .line 689
    .line 690
    invoke-direct/range {v23 .. v29}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 691
    .line 692
    .line 693
    move-object/from16 v4, v23

    .line 694
    .line 695
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    :cond_1e
    move-object v3, v4

    .line 699
    check-cast v3, La/wul;

    .line 700
    .line 701
    const/4 v1, 0x1

    .line 702
    invoke-static {v1, v0}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 703
    .line 704
    .line 705
    move-result-object v18

    .line 706
    new-instance v17, La/bw5;

    .line 707
    .line 708
    new-instance v1, La/sd8;

    .line 709
    .line 710
    const/16 v2, 0x19

    .line 711
    .line 712
    move-object/from16 v4, p0

    .line 713
    .line 714
    invoke-direct {v1, v4, v2}, La/sd8;-><init>(Ljava/lang/Object;B)V

    .line 715
    .line 716
    .line 717
    const v2, 0x162194e8

    .line 718
    .line 719
    .line 720
    invoke-static {v2, v1, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 721
    .line 722
    .line 723
    move-result-object v19

    .line 724
    new-instance v1, La/hgs0;

    .line 725
    .line 726
    const/4 v7, 0x5

    .line 727
    move-object v2, v6

    .line 728
    move-object v6, v11

    .line 729
    invoke-direct/range {v1 .. v7}, La/hgs0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 730
    .line 731
    .line 732
    const v2, 0x2033c4b0

    .line 733
    .line 734
    .line 735
    invoke-static {v2, v1, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 736
    .line 737
    .line 738
    move-result-object v20

    .line 739
    new-instance v1, La/qb;

    .line 740
    .line 741
    const/16 v2, 0x1c

    .line 742
    .line 743
    invoke-direct {v1, v5, v8, v9, v2}, La/qb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 744
    .line 745
    .line 746
    const v2, -0x35dc3596    # -2683546.5f

    .line 747
    .line 748
    .line 749
    invoke-static {v2, v1, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 750
    .line 751
    .line 752
    move-result-object v21

    .line 753
    const/16 v22, 0x2

    .line 754
    .line 755
    invoke-direct/range {v17 .. v22}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 756
    .line 757
    .line 758
    const/4 v5, 0x0

    .line 759
    invoke-virtual {v0, v5}, La/fet;->r(Z)V

    .line 760
    .line 761
    .line 762
    return-object v17
.end method

.method public final P0()Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;
    .locals 2

    .line 1
    sget-object v0, La/xej;->m2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/xej;->k2:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

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
