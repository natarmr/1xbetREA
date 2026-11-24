.class public final La/s9g;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic A:La/kie0;

.field public final synthetic B:Lkotlin/jvm/functions/Function1;

.field public final synthetic Y:Ljava/util/List;

.field public final synthetic Z:J

.field public final synthetic f1:J

.field public i:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

.field public j:Ljava/util/List;

.field public k:Ljava/util/List;

.field public l:La/kie0;

.field public m:Lkotlin/jvm/functions/Function1;

.field public n:Ljava/util/List;

.field public o:Ljava/util/Iterator;

.field public p:Ljava/util/Iterator;

.field public q:La/i9g;

.field public r:J

.field public s:J

.field public t:I

.field public u:I

.field public v:B

.field public final synthetic w:Ljava/util/ArrayList;

.field public final synthetic x:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

.field public final synthetic y:Ljava/util/ArrayList;

.field public final synthetic z:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;Ljava/util/ArrayList;Ljava/util/List;La/kie0;Lkotlin/jvm/functions/Function1;Ljava/util/List;JJLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/s9g;->w:Ljava/util/ArrayList;

    .line 2
    .line 3
    iput-object p2, p0, La/s9g;->x:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 4
    .line 5
    iput-object p3, p0, La/s9g;->y:Ljava/util/ArrayList;

    .line 6
    .line 7
    iput-object p4, p0, La/s9g;->z:Ljava/util/List;

    .line 8
    .line 9
    iput-object p5, p0, La/s9g;->A:La/kie0;

    .line 10
    .line 11
    iput-object p6, p0, La/s9g;->B:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iput-object p7, p0, La/s9g;->Y:Ljava/util/List;

    .line 14
    .line 15
    iput-wide p8, p0, La/s9g;->Z:J

    .line 16
    .line 17
    iput-wide p10, p0, La/s9g;->f1:J

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1, p12}, La/bnn0;-><init>(ILa/yje;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 13

    .line 1
    new-instance v0, La/s9g;

    .line 2
    .line 3
    iget-wide v8, p0, La/s9g;->Z:J

    .line 4
    .line 5
    iget-wide v10, p0, La/s9g;->f1:J

    .line 6
    .line 7
    iget-object v1, p0, La/s9g;->w:Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, p0, La/s9g;->x:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 10
    .line 11
    iget-object v3, p0, La/s9g;->y:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v4, p0, La/s9g;->z:Ljava/util/List;

    .line 14
    .line 15
    iget-object v5, p0, La/s9g;->A:La/kie0;

    .line 16
    .line 17
    iget-object v6, p0, La/s9g;->B:Lkotlin/jvm/functions/Function1;

    .line 18
    .line 19
    iget-object v7, p0, La/s9g;->Y:Ljava/util/List;

    .line 20
    .line 21
    move-object v12, p2

    .line 22
    invoke-direct/range {v0 .. v12}, La/s9g;-><init>(Ljava/util/ArrayList;Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;Ljava/util/ArrayList;Ljava/util/List;La/kie0;Lkotlin/jvm/functions/Function1;Ljava/util/List;JJLa/yje;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/s9g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/s9g;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/s9g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v2, v0, La/s9g;->v:B

    .line 6
    .line 7
    iget-object v4, v0, La/s9g;->y:Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    iget-object v7, v0, La/s9g;->x:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 11
    .line 12
    const/4 v8, 0x1

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    if-eq v2, v8, :cond_1

    .line 16
    .line 17
    if-ne v2, v5, :cond_0

    .line 18
    .line 19
    iget v2, v0, La/s9g;->u:I

    .line 20
    .line 21
    iget v9, v0, La/s9g;->t:I

    .line 22
    .line 23
    iget-wide v10, v0, La/s9g;->s:J

    .line 24
    .line 25
    iget-wide v14, v0, La/s9g;->r:J

    .line 26
    .line 27
    iget-object v12, v0, La/s9g;->q:La/i9g;

    .line 28
    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    iget-object v3, v0, La/s9g;->p:Ljava/util/Iterator;

    .line 32
    .line 33
    iget-object v6, v0, La/s9g;->o:Ljava/util/Iterator;

    .line 34
    .line 35
    iget-object v13, v0, La/s9g;->n:Ljava/util/List;

    .line 36
    .line 37
    iget-object v5, v0, La/s9g;->m:Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    iget-object v8, v0, La/s9g;->l:La/kie0;

    .line 40
    .line 41
    move/from16 v20, v2

    .line 42
    .line 43
    iget-object v2, v0, La/s9g;->k:Ljava/util/List;

    .line 44
    .line 45
    move-object/from16 v21, v2

    .line 46
    .line 47
    iget-object v2, v0, La/s9g;->j:Ljava/util/List;

    .line 48
    .line 49
    move-object/from16 v22, v2

    .line 50
    .line 51
    iget-object v2, v0, La/s9g;->i:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 52
    .line 53
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object/from16 v17, v4

    .line 57
    .line 58
    move-object/from16 v30, v7

    .line 59
    .line 60
    move-wide/from16 v24, v10

    .line 61
    .line 62
    move-object v10, v12

    .line 63
    move-object/from16 v18, v13

    .line 64
    .line 65
    move/from16 v12, v20

    .line 66
    .line 67
    move-object/from16 v7, p1

    .line 68
    .line 69
    move-object v4, v3

    .line 70
    move-object v13, v5

    .line 71
    move v5, v9

    .line 72
    const/16 p1, 0x0

    .line 73
    .line 74
    const/4 v3, 0x2

    .line 75
    move-object/from16 v38, v8

    .line 76
    .line 77
    move-object v8, v2

    .line 78
    move-object/from16 v2, v22

    .line 79
    .line 80
    move-wide/from16 v39, v14

    .line 81
    .line 82
    move-object/from16 v14, v38

    .line 83
    .line 84
    move-object/from16 v15, v21

    .line 85
    .line 86
    move-wide/from16 v20, v39

    .line 87
    .line 88
    goto/16 :goto_11

    .line 89
    .line 90
    :cond_0
    const/16 v16, 0x0

    .line 91
    .line 92
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 93
    .line 94
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-object v16

    .line 98
    :cond_1
    const/16 v16, 0x0

    .line 99
    .line 100
    iget v2, v0, La/s9g;->t:I

    .line 101
    .line 102
    iget-wide v5, v0, La/s9g;->s:J

    .line 103
    .line 104
    iget-wide v8, v0, La/s9g;->r:J

    .line 105
    .line 106
    iget-object v3, v0, La/s9g;->q:La/i9g;

    .line 107
    .line 108
    iget-object v10, v0, La/s9g;->p:Ljava/util/Iterator;

    .line 109
    .line 110
    iget-object v11, v0, La/s9g;->o:Ljava/util/Iterator;

    .line 111
    .line 112
    iget-object v12, v0, La/s9g;->n:Ljava/util/List;

    .line 113
    .line 114
    iget-object v13, v0, La/s9g;->m:Lkotlin/jvm/functions/Function1;

    .line 115
    .line 116
    iget-object v14, v0, La/s9g;->l:La/kie0;

    .line 117
    .line 118
    iget-object v15, v0, La/s9g;->k:Ljava/util/List;

    .line 119
    .line 120
    move/from16 v20, v2

    .line 121
    .line 122
    iget-object v2, v0, La/s9g;->j:Ljava/util/List;

    .line 123
    .line 124
    move-object/from16 v21, v2

    .line 125
    .line 126
    iget-object v2, v0, La/s9g;->i:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 127
    .line 128
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    move-object/from16 v17, v4

    .line 132
    .line 133
    move-wide/from16 v24, v5

    .line 134
    .line 135
    move-wide/from16 v22, v8

    .line 136
    .line 137
    move-object v8, v10

    .line 138
    move-object v6, v11

    .line 139
    move-object v5, v13

    .line 140
    move/from16 v9, v20

    .line 141
    .line 142
    move-object v10, v2

    .line 143
    move-object v13, v12

    .line 144
    move-object/from16 v2, p1

    .line 145
    .line 146
    move-object v12, v3

    .line 147
    move-object/from16 v3, v21

    .line 148
    .line 149
    const/16 p1, 0x0

    .line 150
    .line 151
    goto/16 :goto_2

    .line 152
    .line 153
    :cond_2
    const/16 v16, 0x0

    .line 154
    .line 155
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    iget-object v2, v0, La/s9g;->w:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    iget-object v3, v0, La/s9g;->z:Ljava/util/List;

    .line 165
    .line 166
    iget-object v5, v0, La/s9g;->A:La/kie0;

    .line 167
    .line 168
    iget-object v6, v0, La/s9g;->B:Lkotlin/jvm/functions/Function1;

    .line 169
    .line 170
    iget-object v8, v0, La/s9g;->Y:Ljava/util/List;

    .line 171
    .line 172
    iget-wide v9, v0, La/s9g;->Z:J

    .line 173
    .line 174
    iget-wide v11, v0, La/s9g;->f1:J

    .line 175
    .line 176
    move-object v15, v4

    .line 177
    move-object v14, v7

    .line 178
    const/4 v13, 0x0

    .line 179
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v20

    .line 183
    if-eqz v20, :cond_21

    .line 184
    .line 185
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v20

    .line 189
    add-int/lit8 v21, v13, 0x1

    .line 190
    .line 191
    if-ltz v13, :cond_20

    .line 192
    .line 193
    check-cast v20, Ljava/util/List;

    .line 194
    .line 195
    invoke-interface/range {v20 .. v20}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    move-wide/from16 v38, v11

    .line 200
    .line 201
    move-object v11, v8

    .line 202
    move-object v8, v13

    .line 203
    move-wide/from16 v12, v38

    .line 204
    .line 205
    move-object/from16 v23, v15

    .line 206
    .line 207
    move/from16 v15, v21

    .line 208
    .line 209
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v20

    .line 213
    if-eqz v20, :cond_1f

    .line 214
    .line 215
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v20

    .line 219
    check-cast v20, La/i9g;

    .line 220
    .line 221
    move-wide/from16 v21, v12

    .line 222
    .line 223
    sget-object v13, La/tvk;->a:La/rwj;

    .line 224
    .line 225
    move-wide/from16 v24, v9

    .line 226
    .line 227
    new-instance v9, La/g6g;

    .line 228
    .line 229
    move-object v10, v14

    .line 230
    const/4 v14, 0x3

    .line 231
    move-object/from16 v17, v4

    .line 232
    .line 233
    move-object v4, v13

    .line 234
    move-object/from16 v12, v20

    .line 235
    .line 236
    move-wide/from16 v28, v21

    .line 237
    .line 238
    move-wide/from16 v26, v24

    .line 239
    .line 240
    const/4 v13, 0x0

    .line 241
    invoke-direct/range {v9 .. v14}, La/g6g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 242
    .line 243
    .line 244
    iput-object v10, v0, La/s9g;->i:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 245
    .line 246
    move-object/from16 v14, v23

    .line 247
    .line 248
    iput-object v14, v0, La/s9g;->j:Ljava/util/List;

    .line 249
    .line 250
    iput-object v3, v0, La/s9g;->k:Ljava/util/List;

    .line 251
    .line 252
    iput-object v5, v0, La/s9g;->l:La/kie0;

    .line 253
    .line 254
    iput-object v6, v0, La/s9g;->m:Lkotlin/jvm/functions/Function1;

    .line 255
    .line 256
    iput-object v11, v0, La/s9g;->n:Ljava/util/List;

    .line 257
    .line 258
    iput-object v2, v0, La/s9g;->o:Ljava/util/Iterator;

    .line 259
    .line 260
    iput-object v8, v0, La/s9g;->p:Ljava/util/Iterator;

    .line 261
    .line 262
    iput-object v12, v0, La/s9g;->q:La/i9g;

    .line 263
    .line 264
    move-object/from16 p1, v13

    .line 265
    .line 266
    move-object/from16 v20, v14

    .line 267
    .line 268
    move-wide/from16 v13, v26

    .line 269
    .line 270
    iput-wide v13, v0, La/s9g;->r:J

    .line 271
    .line 272
    move-object/from16 v21, v2

    .line 273
    .line 274
    move-object/from16 v22, v3

    .line 275
    .line 276
    move-wide/from16 v2, v28

    .line 277
    .line 278
    iput-wide v2, v0, La/s9g;->s:J

    .line 279
    .line 280
    iput v15, v0, La/s9g;->t:I

    .line 281
    .line 282
    const/4 v2, 0x1

    .line 283
    iput-byte v2, v0, La/s9g;->v:B

    .line 284
    .line 285
    invoke-static {v4, v9, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    if-ne v2, v1, :cond_3

    .line 290
    .line 291
    goto/16 :goto_10

    .line 292
    .line 293
    :cond_3
    move v9, v15

    .line 294
    move-object/from16 v3, v20

    .line 295
    .line 296
    move-object/from16 v15, v22

    .line 297
    .line 298
    move-wide/from16 v24, v28

    .line 299
    .line 300
    move-wide/from16 v22, v13

    .line 301
    .line 302
    move-object v14, v5

    .line 303
    move-object v5, v6

    .line 304
    move-object v13, v11

    .line 305
    move-object/from16 v6, v21

    .line 306
    .line 307
    :goto_2
    check-cast v2, Ljava/util/List;

    .line 308
    .line 309
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    if-nez v4, :cond_1e

    .line 314
    .line 315
    iget-object v4, v10, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->a:La/yag;

    .line 316
    .line 317
    sget-object v11, La/yag;->d:La/yag;

    .line 318
    .line 319
    if-ne v4, v11, :cond_4

    .line 320
    .line 321
    const/4 v4, 0x1

    .line 322
    goto :goto_3

    .line 323
    :cond_4
    const/4 v4, 0x0

    .line 324
    :goto_3
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 325
    .line 326
    .line 327
    move-result-object v11

    .line 328
    const/16 v20, 0x0

    .line 329
    .line 330
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 331
    .line 332
    .line 333
    move-result v21

    .line 334
    if-eqz v21, :cond_12

    .line 335
    .line 336
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v21

    .line 340
    check-cast v21, Ljava/util/List;

    .line 341
    .line 342
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v26

    .line 346
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    .line 347
    .line 348
    .line 349
    move-result v27

    .line 350
    if-eqz v27, :cond_11

    .line 351
    .line 352
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v27

    .line 356
    move/from16 v28, v4

    .line 357
    .line 358
    move-object/from16 v4, v27

    .line 359
    .line 360
    check-cast v4, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 361
    .line 362
    move-object/from16 v27, v10

    .line 363
    .line 364
    move-object/from16 v29, v11

    .line 365
    .line 366
    iget-wide v10, v4, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 367
    .line 368
    :goto_5
    move-wide/from16 v30, v10

    .line 369
    .line 370
    :cond_5
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v4

    .line 374
    if-eqz v4, :cond_6

    .line 375
    .line 376
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    check-cast v4, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 381
    .line 382
    iget-wide v10, v4, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 383
    .line 384
    cmp-long v4, v30, v10

    .line 385
    .line 386
    if-lez v4, :cond_5

    .line 387
    .line 388
    goto :goto_5

    .line 389
    :cond_6
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 394
    .line 395
    .line 396
    move-result v10

    .line 397
    if-eqz v10, :cond_10

    .line 398
    .line 399
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v10

    .line 403
    check-cast v10, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 404
    .line 405
    iget-wide v10, v10, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->b:J

    .line 406
    .line 407
    :goto_6
    move-wide/from16 v32, v10

    .line 408
    .line 409
    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v10

    .line 413
    if-eqz v10, :cond_8

    .line 414
    .line 415
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v10

    .line 419
    check-cast v10, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 420
    .line 421
    iget-wide v10, v10, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->b:J

    .line 422
    .line 423
    cmp-long v21, v32, v10

    .line 424
    .line 425
    if-gez v21, :cond_7

    .line 426
    .line 427
    goto :goto_6

    .line 428
    :cond_8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 433
    .line 434
    .line 435
    move-result v10

    .line 436
    if-eqz v10, :cond_f

    .line 437
    .line 438
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v10

    .line 442
    check-cast v10, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 443
    .line 444
    iget-wide v10, v10, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 445
    .line 446
    :goto_7
    move-wide/from16 v34, v10

    .line 447
    .line 448
    :cond_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 449
    .line 450
    .line 451
    move-result v10

    .line 452
    if-eqz v10, :cond_a

    .line 453
    .line 454
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v10

    .line 458
    check-cast v10, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 459
    .line 460
    iget-wide v10, v10, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 461
    .line 462
    cmp-long v21, v34, v10

    .line 463
    .line 464
    if-lez v21, :cond_9

    .line 465
    .line 466
    goto :goto_7

    .line 467
    :cond_a
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 472
    .line 473
    .line 474
    move-result v10

    .line 475
    if-eqz v10, :cond_e

    .line 476
    .line 477
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v10

    .line 481
    check-cast v10, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 482
    .line 483
    iget-wide v10, v10, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->b:J

    .line 484
    .line 485
    :goto_8
    move-wide/from16 v36, v10

    .line 486
    .line 487
    :cond_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 488
    .line 489
    .line 490
    move-result v10

    .line 491
    if-eqz v10, :cond_c

    .line 492
    .line 493
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v10

    .line 497
    check-cast v10, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 498
    .line 499
    iget-wide v10, v10, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->b:J

    .line 500
    .line 501
    cmp-long v21, v36, v10

    .line 502
    .line 503
    if-gez v21, :cond_b

    .line 504
    .line 505
    goto :goto_8

    .line 506
    :cond_c
    invoke-static/range {v30 .. v37}, La/fre0;->Z(JJJJ)Z

    .line 507
    .line 508
    .line 509
    move-result v4

    .line 510
    if-nez v4, :cond_d

    .line 511
    .line 512
    goto :goto_9

    .line 513
    :cond_d
    add-int/lit8 v20, v20, 0x1

    .line 514
    .line 515
    move-object/from16 v10, v27

    .line 516
    .line 517
    move/from16 v4, v28

    .line 518
    .line 519
    move-object/from16 v11, v29

    .line 520
    .line 521
    goto/16 :goto_4

    .line 522
    .line 523
    :cond_e
    invoke-static {}, La/itt0;->a()V

    .line 524
    .line 525
    .line 526
    return-object v16

    .line 527
    :cond_f
    invoke-static {}, La/itt0;->a()V

    .line 528
    .line 529
    .line 530
    return-object v16

    .line 531
    :cond_10
    invoke-static {}, La/itt0;->a()V

    .line 532
    .line 533
    .line 534
    return-object v16

    .line 535
    :cond_11
    invoke-static {}, La/itt0;->a()V

    .line 536
    .line 537
    .line 538
    return-object v16

    .line 539
    :cond_12
    move/from16 v28, v4

    .line 540
    .line 541
    move-object/from16 v27, v10

    .line 542
    .line 543
    const/16 v20, -0x1

    .line 544
    .line 545
    :goto_9
    if-eqz v28, :cond_13

    .line 546
    .line 547
    if-gez v20, :cond_13

    .line 548
    .line 549
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 550
    .line 551
    .line 552
    move-result v20

    .line 553
    :goto_a
    move/from16 v4, v20

    .line 554
    .line 555
    goto :goto_b

    .line 556
    :cond_13
    if-eqz v28, :cond_14

    .line 557
    .line 558
    goto :goto_a

    .line 559
    :cond_14
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 560
    .line 561
    .line 562
    move-result v20

    .line 563
    goto :goto_a

    .line 564
    :goto_b
    sget-object v10, La/m9g;->a:La/m9g;

    .line 565
    .line 566
    sget-object v11, La/n9g;->a:La/n9g;

    .line 567
    .line 568
    move-object/from16 v30, v7

    .line 569
    .line 570
    const/4 v7, 0x3

    .line 571
    if-eqz v28, :cond_17

    .line 572
    .line 573
    if-ne v4, v7, :cond_17

    .line 574
    .line 575
    if-eqz v15, :cond_15

    .line 576
    .line 577
    invoke-interface {v15}, Ljava/util/Collection;->isEmpty()Z

    .line 578
    .line 579
    .line 580
    move-result v7

    .line 581
    if-eqz v7, :cond_15

    .line 582
    .line 583
    goto :goto_d

    .line 584
    :cond_15
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 585
    .line 586
    .line 587
    move-result-object v7

    .line 588
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 589
    .line 590
    .line 591
    move-result v20

    .line 592
    if-eqz v20, :cond_18

    .line 593
    .line 594
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v20

    .line 598
    move-object/from16 v21, v7

    .line 599
    .line 600
    move-object/from16 v7, v20

    .line 601
    .line 602
    check-cast v7, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 603
    .line 604
    invoke-interface {v2, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v7

    .line 608
    if-eqz v7, :cond_16

    .line 609
    .line 610
    move-object v7, v11

    .line 611
    goto :goto_f

    .line 612
    :cond_16
    move-object/from16 v7, v21

    .line 613
    .line 614
    goto :goto_c

    .line 615
    :cond_17
    if-eqz v28, :cond_18

    .line 616
    .line 617
    if-le v4, v7, :cond_18

    .line 618
    .line 619
    move-object v7, v10

    .line 620
    goto :goto_f

    .line 621
    :cond_18
    :goto_d
    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v7

    .line 625
    check-cast v7, Ljava/util/List;

    .line 626
    .line 627
    if-eqz v7, :cond_19

    .line 628
    .line 629
    invoke-interface {v7, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 630
    .line 631
    .line 632
    goto :goto_e

    .line 633
    :cond_19
    new-instance v7, Ljava/util/ArrayList;

    .line 634
    .line 635
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 636
    .line 637
    .line 638
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    :goto_e
    new-instance v7, La/o9g;

    .line 642
    .line 643
    invoke-direct {v7, v4}, La/o9g;-><init>(I)V

    .line 644
    .line 645
    .line 646
    :goto_f
    invoke-virtual {v7, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    move-result v4

    .line 650
    if-eqz v4, :cond_1a

    .line 651
    .line 652
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 653
    .line 654
    return-object v0

    .line 655
    :cond_1a
    invoke-virtual {v7, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 656
    .line 657
    .line 658
    move-result v4

    .line 659
    if-nez v4, :cond_1d

    .line 660
    .line 661
    instance-of v4, v7, La/o9g;

    .line 662
    .line 663
    if-eqz v4, :cond_1c

    .line 664
    .line 665
    check-cast v7, La/o9g;

    .line 666
    .line 667
    iget v4, v7, La/o9g;->a:I

    .line 668
    .line 669
    sget-object v7, La/tvk;->a:La/rwj;

    .line 670
    .line 671
    new-instance v20, La/j21;

    .line 672
    .line 673
    const/16 v26, 0x0

    .line 674
    .line 675
    const/16 v21, 0x2

    .line 676
    .line 677
    move-object/from16 v28, v2

    .line 678
    .line 679
    invoke-direct/range {v20 .. v28}, La/j21;-><init>(BJJLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    move-object/from16 v11, v20

    .line 683
    .line 684
    move-object/from16 v2, v27

    .line 685
    .line 686
    move/from16 v20, v9

    .line 687
    .line 688
    move-wide/from16 v9, v22

    .line 689
    .line 690
    iput-object v2, v0, La/s9g;->i:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;

    .line 691
    .line 692
    iput-object v3, v0, La/s9g;->j:Ljava/util/List;

    .line 693
    .line 694
    iput-object v15, v0, La/s9g;->k:Ljava/util/List;

    .line 695
    .line 696
    iput-object v14, v0, La/s9g;->l:La/kie0;

    .line 697
    .line 698
    iput-object v5, v0, La/s9g;->m:Lkotlin/jvm/functions/Function1;

    .line 699
    .line 700
    iput-object v13, v0, La/s9g;->n:Ljava/util/List;

    .line 701
    .line 702
    iput-object v6, v0, La/s9g;->o:Ljava/util/Iterator;

    .line 703
    .line 704
    iput-object v8, v0, La/s9g;->p:Ljava/util/Iterator;

    .line 705
    .line 706
    iput-object v12, v0, La/s9g;->q:La/i9g;

    .line 707
    .line 708
    iput-wide v9, v0, La/s9g;->r:J

    .line 709
    .line 710
    move-object/from16 v21, v3

    .line 711
    .line 712
    move-wide/from16 v2, v24

    .line 713
    .line 714
    iput-wide v2, v0, La/s9g;->s:J

    .line 715
    .line 716
    move/from16 v2, v20

    .line 717
    .line 718
    iput v2, v0, La/s9g;->t:I

    .line 719
    .line 720
    iput v4, v0, La/s9g;->u:I

    .line 721
    .line 722
    const/4 v3, 0x2

    .line 723
    iput-byte v3, v0, La/s9g;->v:B

    .line 724
    .line 725
    invoke-static {v7, v11, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v7

    .line 729
    if-ne v7, v1, :cond_1b

    .line 730
    .line 731
    :goto_10
    return-object v1

    .line 732
    :cond_1b
    move-object/from16 v18, v13

    .line 733
    .line 734
    move-object v13, v5

    .line 735
    move v5, v2

    .line 736
    move-object/from16 v2, v21

    .line 737
    .line 738
    move-wide/from16 v20, v9

    .line 739
    .line 740
    move-object v10, v12

    .line 741
    move v12, v4

    .line 742
    move-object v4, v8

    .line 743
    move-object/from16 v8, v27

    .line 744
    .line 745
    :goto_11
    move-object v9, v7

    .line 746
    check-cast v9, La/q9g;

    .line 747
    .line 748
    iget v11, v14, La/kie0;->a:I

    .line 749
    .line 750
    sget v7, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->p:I

    .line 751
    .line 752
    invoke-virtual/range {v8 .. v13}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->b(La/q9g;La/i9g;IILkotlin/jvm/functions/Function1;)V

    .line 753
    .line 754
    .line 755
    iget v7, v14, La/kie0;->a:I

    .line 756
    .line 757
    const/16 v19, 0x1

    .line 758
    .line 759
    add-int/lit8 v7, v7, 0x1

    .line 760
    .line 761
    iput v7, v14, La/kie0;->a:I

    .line 762
    .line 763
    move-object v9, v8

    .line 764
    move-object v8, v4

    .line 765
    move v4, v5

    .line 766
    move-object v5, v14

    .line 767
    move-object v14, v9

    .line 768
    move-object/from16 v23, v2

    .line 769
    .line 770
    move-object v2, v6

    .line 771
    move-object v6, v13

    .line 772
    move-object/from16 v11, v18

    .line 773
    .line 774
    move-wide/from16 v9, v20

    .line 775
    .line 776
    :goto_12
    move-wide/from16 v12, v24

    .line 777
    .line 778
    goto :goto_15

    .line 779
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 780
    .line 781
    .line 782
    return-object v16

    .line 783
    :cond_1d
    :goto_13
    move-object/from16 v21, v3

    .line 784
    .line 785
    move v2, v9

    .line 786
    move-wide/from16 v9, v22

    .line 787
    .line 788
    const/4 v3, 0x2

    .line 789
    const/16 v19, 0x1

    .line 790
    .line 791
    goto :goto_14

    .line 792
    :cond_1e
    move-object/from16 v30, v7

    .line 793
    .line 794
    move-object/from16 v27, v10

    .line 795
    .line 796
    goto :goto_13

    .line 797
    :goto_14
    move v4, v2

    .line 798
    move-object v2, v6

    .line 799
    move-object v11, v13

    .line 800
    move-object/from16 v23, v21

    .line 801
    .line 802
    move-object v6, v5

    .line 803
    move-object v5, v14

    .line 804
    move-object/from16 v14, v27

    .line 805
    .line 806
    goto :goto_12

    .line 807
    :goto_15
    move-object v3, v15

    .line 808
    move-object/from16 v7, v30

    .line 809
    .line 810
    move v15, v4

    .line 811
    move-object/from16 v4, v17

    .line 812
    .line 813
    goto/16 :goto_1

    .line 814
    .line 815
    :cond_1f
    move-object/from16 v21, v2

    .line 816
    .line 817
    move-object/from16 v22, v3

    .line 818
    .line 819
    move-wide/from16 v28, v12

    .line 820
    .line 821
    move-object/from16 v20, v23

    .line 822
    .line 823
    const/16 v19, 0x1

    .line 824
    .line 825
    move-wide/from16 v38, v9

    .line 826
    .line 827
    move-object v10, v14

    .line 828
    move-wide/from16 v13, v38

    .line 829
    .line 830
    move-wide v2, v13

    .line 831
    move-object v14, v10

    .line 832
    move-wide v9, v2

    .line 833
    move-object v8, v11

    .line 834
    move v13, v15

    .line 835
    move-object/from16 v15, v20

    .line 836
    .line 837
    move-object/from16 v2, v21

    .line 838
    .line 839
    move-object/from16 v3, v22

    .line 840
    .line 841
    move-wide/from16 v11, v28

    .line 842
    .line 843
    goto/16 :goto_0

    .line 844
    .line 845
    :cond_20
    const/16 p1, 0x0

    .line 846
    .line 847
    invoke-static {}, La/q3d;->p()V

    .line 848
    .line 849
    .line 850
    throw p1

    .line 851
    :cond_21
    move-object/from16 v17, v4

    .line 852
    .line 853
    move-object/from16 v30, v7

    .line 854
    .line 855
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I

    .line 856
    .line 857
    .line 858
    move-result v0

    .line 859
    sget v1, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->p:I

    .line 860
    .line 861
    move-object/from16 v1, v30

    .line 862
    .line 863
    invoke-virtual {v1, v0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->g(I)V

    .line 864
    .line 865
    .line 866
    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 867
    .line 868
    .line 869
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 870
    .line 871
    return-object v0
.end method
