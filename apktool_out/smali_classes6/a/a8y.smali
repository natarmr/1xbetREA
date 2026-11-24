.class public abstract La/a8y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/i0w;->b:La/i0w;

    .line 2
    .line 3
    sget-object v1, La/i0w;->d:La/i0w;

    .line 4
    .line 5
    sget-object v2, La/i0w;->e:La/i0w;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [La/i0w;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, La/a8y;->a:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public static final a(La/z7y;La/ctf0;Ljava/lang/String;Ljava/util/List;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)La/qp30;
    .locals 30

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
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v2, v0, La/z7y;->a:Ljava/lang/String;

    .line 12
    .line 13
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, v1, La/ctf0;->b:La/lsm0;

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const v5, 0x7f1309d9

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v5, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v6, v0, La/z7y;->e:La/i0w;

    .line 32
    .line 33
    move-object/from16 v5, p3

    .line 34
    .line 35
    move-object/from16 v7, p4

    .line 36
    .line 37
    invoke-static {v7, v6, v5}, La/hew0;->G(Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;La/i0w;Ljava/util/List;)Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    new-instance v7, Ljava/util/ArrayList;

    .line 42
    .line 43
    const/16 v8, 0xa

    .line 44
    .line 45
    invoke-static {v5, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    const/4 v9, 0x0

    .line 61
    if-eqz v8, :cond_0

    .line 62
    .line 63
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    check-cast v8, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 68
    .line 69
    invoke-static {v8, v9}, La/eeq;->X(Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;Z)La/so30;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    iget-object v10, v0, La/z7y;->a:Ljava/lang/String;

    .line 78
    .line 79
    iget-wide v11, v0, La/z7y;->d:J

    .line 80
    .line 81
    invoke-static {v11, v12, v1}, La/bfb;->R(JLa/ctf0;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    const-string v8, " \u00b7 \u200e"

    .line 86
    .line 87
    invoke-static {v5, v8, v2}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    new-instance v8, La/nom0;

    .line 92
    .line 93
    invoke-static {v6, v1}, La/aac;->Z(La/i0w;La/ctf0;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v6}, La/iom0;->n(La/i0w;)La/hom0;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-direct {v8, v1, v2}, La/nom0;-><init>(Ljava/lang/String;La/hom0;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v9, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    move-object/from16 v26, v1

    .line 109
    .line 110
    check-cast v26, La/so30;

    .line 111
    .line 112
    invoke-static {v4, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    move-object/from16 v27, v1

    .line 117
    .line 118
    check-cast v27, La/so30;

    .line 119
    .line 120
    new-array v1, v9, [Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    const v2, 0x7f130a9a

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v14

    .line 133
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    iget-object v11, v0, La/z7y;->k:La/hxu;

    .line 138
    .line 139
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    const/4 v2, 0x3

    .line 144
    if-eq v1, v2, :cond_1

    .line 145
    .line 146
    const/4 v2, 0x4

    .line 147
    if-eq v1, v2, :cond_1

    .line 148
    .line 149
    const/16 p1, 0x0

    .line 150
    .line 151
    const/4 v1, 0x0

    .line 152
    goto :goto_1

    .line 153
    :cond_1
    new-instance v1, La/x680;

    .line 154
    .line 155
    new-array v2, v9, [Ljava/lang/Object;

    .line 156
    .line 157
    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const v5, 0x7f130494

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v5, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    sget-object v5, La/pn40;->a:La/pn40;

    .line 169
    .line 170
    const/16 p1, 0x0

    .line 171
    .line 172
    iget-wide v4, v0, La/z7y;->f:D

    .line 173
    .line 174
    sget-object v13, La/p3u0;->c:La/p3u0;

    .line 175
    .line 176
    invoke-static {v4, v5, v13}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v4

    .line 180
    new-instance v5, La/auy;

    .line 181
    .line 182
    invoke-direct {v5, v4}, La/auy;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    const-string v4, "COEF_ID"

    .line 186
    .line 187
    invoke-direct {v1, v4, v2, v5}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    .line 188
    .line 189
    .line 190
    :goto_1
    invoke-virtual {v7, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    sget-object v1, La/i0w;->i:La/i0w;

    .line 194
    .line 195
    if-ne v6, v1, :cond_2

    .line 196
    .line 197
    const v1, 0x7f130559

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_2
    const v1, 0x7f130f4a

    .line 202
    .line 203
    .line 204
    :goto_2
    new-array v2, v9, [Ljava/lang/Object;

    .line 205
    .line 206
    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-virtual {v3, v1, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v13

    .line 214
    sget-object v1, La/pn40;->a:La/pn40;

    .line 215
    .line 216
    iget-object v1, v11, La/hxu;->f:La/ivo0;

    .line 217
    .line 218
    iget-wide v1, v1, La/ivo0;->b:D

    .line 219
    .line 220
    const-wide/16 v3, 0x0

    .line 221
    .line 222
    cmpg-double v3, v1, v3

    .line 223
    .line 224
    if-nez v3, :cond_3

    .line 225
    .line 226
    iget-wide v1, v0, La/z7y;->c:D

    .line 227
    .line 228
    :cond_3
    sget-object v3, La/p3u0;->c:La/p3u0;

    .line 229
    .line 230
    invoke-static {v1, v2, v3}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    iget-wide v4, v0, La/z7y;->g:D

    .line 235
    .line 236
    invoke-static {v4, v5, v3}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    new-instance v15, La/x680;

    .line 241
    .line 242
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    packed-switch v0, :pswitch_data_0

    .line 247
    .line 248
    .line 249
    invoke-static {}, La/t9f;->b()V

    .line 250
    .line 251
    .line 252
    return-object p1

    .line 253
    :pswitch_0
    new-instance v0, La/xty;

    .line 254
    .line 255
    sget-object v2, La/s6t0;->a:La/pz40;

    .line 256
    .line 257
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 258
    .line 259
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getGreen-0d7_KjU()J

    .line 260
    .line 261
    .line 262
    move-result-wide v2

    .line 263
    move-wide/from16 v28, v2

    .line 264
    .line 265
    move-object v3, v1

    .line 266
    move-wide/from16 v1, v28

    .line 267
    .line 268
    move-object/from16 v5, p2

    .line 269
    .line 270
    invoke-direct/range {v0 .. v5}, La/xty;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    goto :goto_3

    .line 274
    :pswitch_1
    move-object/from16 v5, p2

    .line 275
    .line 276
    new-instance v0, La/wty;

    .line 277
    .line 278
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 279
    .line 280
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 285
    .line 286
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 287
    .line 288
    .line 289
    move-result-wide v1

    .line 290
    invoke-direct {v0, v4, v5, v1, v2}, La/wty;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 291
    .line 292
    .line 293
    :goto_3
    const-string v1, "POSSIBLE_PAYOUT"

    .line 294
    .line 295
    invoke-direct {v15, v1, v13, v0}, La/x680;-><init>(Ljava/lang/String;Ljava/lang/String;La/buy;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v7, v15}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    sget-object v0, La/a8y;->a:Ljava/util/List;

    .line 302
    .line 303
    invoke-interface {v0, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-eqz v0, :cond_4

    .line 308
    .line 309
    invoke-static {v11, v6, v5}, La/bdx;->i0(La/hxu;La/i0w;Ljava/lang/String;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    goto :goto_4

    .line 314
    :cond_4
    sget-object v0, La/iun;->a:La/iun;

    .line 315
    .line 316
    :goto_4
    invoke-virtual {v7, v0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 317
    .line 318
    .line 319
    invoke-static {v7}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->S(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 328
    .line 329
    .line 330
    move-result-object v22

    .line 331
    sget-object v16, La/lak0;->c:La/lak0;

    .line 332
    .line 333
    new-instance v0, La/ec;

    .line 334
    .line 335
    invoke-direct {v0, v9, v9}, La/ec;-><init>(ZZ)V

    .line 336
    .line 337
    .line 338
    new-instance v9, La/qp30;

    .line 339
    .line 340
    new-instance v13, La/svw;

    .line 341
    .line 342
    const v1, 0x7f0807a6

    .line 343
    .line 344
    .line 345
    invoke-direct {v13, v1}, La/svw;-><init>(I)V

    .line 346
    .line 347
    .line 348
    const/16 v23, 0x0

    .line 349
    .line 350
    const-string v25, ""

    .line 351
    .line 352
    const/4 v15, 0x0

    .line 353
    sget-object v18, La/hb30;->a:La/hb30;

    .line 354
    .line 355
    const-string v19, ""

    .line 356
    .line 357
    const-string v20, ""

    .line 358
    .line 359
    const-string v21, ""

    .line 360
    .line 361
    move-object v11, v10

    .line 362
    move-object/from16 v17, v0

    .line 363
    .line 364
    move-object/from16 v24, v8

    .line 365
    .line 366
    invoke-direct/range {v9 .. v27}, La/qp30;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/tvw;Ljava/lang/String;ZLa/a4x;La/ec;La/kb30;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;La/l3w;La/nom0;Ljava/lang/String;La/so30;La/so30;)V

    .line 367
    .line 368
    .line 369
    return-object v9

    .line 370
    nop

    .line 371
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
