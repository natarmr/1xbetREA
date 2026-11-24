.class public final La/iu6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/iu6;->i:B

    iput-object p1, p0, La/iu6;->k:Ljava/lang/String;

    iput-object p2, p0, La/iu6;->l:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/iu6;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/iu6;->l:Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, La/iu6;->k:Ljava/lang/String;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/iu6;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v0, p0, v1, p2, v2}, La/iu6;-><init>(Ljava/lang/String;Ljava/util/List;La/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/iu6;->j:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/iu6;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, p0, v1, p2, v2}, La/iu6;-><init>(Ljava/lang/String;Ljava/util/List;La/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/iu6;->j:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, La/iu6;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v0, p0, v1, p2, v2}, La/iu6;-><init>(Ljava/lang/String;Ljava/util/List;La/yje;B)V

    .line 32
    .line 33
    .line 34
    iput-object p1, v0, La/iu6;->j:Ljava/lang/Object;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/iu6;->i:B

    .line 2
    .line 3
    check-cast p1, La/qpg0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/iu6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/iu6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/iu6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/iu6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/iu6;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/iu6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/iu6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/iu6;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/iu6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 52

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iu6;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/iu6;->l:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, v0, La/iu6;->k:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v0, v0, La/iu6;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/qpg0;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v3}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :try_start_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v2, 0x1

    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    invoke-interface {v1, v2, v5, v6}, La/xpg0;->o(IJ)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_0
    const-string v0, "id"

    .line 56
    .line 57
    invoke-static {v1, v0}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    const-string v2, "name"

    .line 62
    .line 63
    invoke-static {v1, v2}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const-string v3, "team"

    .line 68
    .line 69
    invoke-static {v1, v3}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    const-string v5, "short_name"

    .line 74
    .line 75
    invoke-static {v1, v5}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    const-string v6, "cyber"

    .line 80
    .line 81
    invoke-static {v1, v6}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    const-string v7, "background"

    .line 86
    .line 87
    invoke-static {v1, v7}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    const-string v8, "image_small"

    .line 92
    .line 93
    invoke-static {v1, v8}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    const-string v9, "image_popular"

    .line 98
    .line 99
    invoke-static {v1, v9}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    const-string v10, "background_tablet"

    .line 104
    .line 105
    invoke-static {v1, v10}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    const-string v11, "background_champ_default"

    .line 110
    .line 111
    invoke-static {v1, v11}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    const-string v12, "background_champ_tablet_default"

    .line 116
    .line 117
    invoke-static {v1, v12}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    const-string v13, "background_champ_header_default"

    .line 122
    .line 123
    invoke-static {v1, v13}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v13

    .line 127
    const-string v14, "background_champ_header_tablet_default"

    .line 128
    .line 129
    invoke-static {v1, v14}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    const-string v15, "game_background"

    .line 134
    .line 135
    invoke-static {v1, v15}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    move-result v15

    .line 139
    const-string v4, "sub_sports"

    .line 140
    .line 141
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    move/from16 p0, v4

    .line 146
    .line 147
    const-string v4, "image_champ_small"

    .line 148
    .line 149
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    move/from16 p1, v4

    .line 154
    .line 155
    const-string v4, "feed_image_vertical"

    .line 156
    .line 157
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    move/from16 v16, v4

    .line 162
    .line 163
    const-string v4, "feed_image_horizontal"

    .line 164
    .line 165
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    move/from16 v17, v4

    .line 170
    .line 171
    const-string v4, "feed_image_square"

    .line 172
    .line 173
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    move/from16 v18, v4

    .line 178
    .line 179
    const-string v4, "discipline_icon_3d"

    .line 180
    .line 181
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    move/from16 v19, v4

    .line 186
    .line 187
    const-string v4, "esports_event_focus_discipline_header"

    .line 188
    .line 189
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    move/from16 v20, v4

    .line 194
    .line 195
    const-string v4, "esports_header_focus_discipline_header"

    .line 196
    .line 197
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    move/from16 v21, v4

    .line 202
    .line 203
    const-string v4, "default_opponent_header"

    .line 204
    .line 205
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    move/from16 v22, v4

    .line 210
    .line 211
    const-string v4, "default_opponent_header_tablet"

    .line 212
    .line 213
    invoke-static {v1, v4}, La/x0x;->P(La/xpg0;Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    move/from16 v23, v4

    .line 218
    .line 219
    new-instance v4, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 222
    .line 223
    .line 224
    :goto_1
    invoke-interface {v1}, La/xpg0;->W0()Z

    .line 225
    .line 226
    .line 227
    move-result v24

    .line 228
    if-eqz v24, :cond_2

    .line 229
    .line 230
    invoke-interface {v1, v0}, La/xpg0;->getLong(I)J

    .line 231
    .line 232
    .line 233
    move-result-wide v26

    .line 234
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v28

    .line 238
    invoke-interface {v1, v3}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v29

    .line 242
    invoke-interface {v1, v5}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v30

    .line 246
    move/from16 v24, v2

    .line 247
    .line 248
    move/from16 v51, v3

    .line 249
    .line 250
    invoke-interface {v1, v6}, La/xpg0;->getLong(I)J

    .line 251
    .line 252
    .line 253
    move-result-wide v2

    .line 254
    long-to-int v2, v2

    .line 255
    if-eqz v2, :cond_1

    .line 256
    .line 257
    const/16 v31, 0x1

    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_1
    const/4 v2, 0x0

    .line 261
    move/from16 v31, v2

    .line 262
    .line 263
    :goto_2
    invoke-interface {v1, v7}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v32

    .line 267
    invoke-interface {v1, v8}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v33

    .line 271
    invoke-interface {v1, v9}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v34

    .line 275
    invoke-interface {v1, v10}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v35

    .line 279
    invoke-interface {v1, v11}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v36

    .line 283
    invoke-interface {v1, v12}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v37

    .line 287
    invoke-interface {v1, v13}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v38

    .line 291
    invoke-interface {v1, v14}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v39

    .line 295
    invoke-interface {v1, v15}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v40

    .line 299
    move/from16 v2, p0

    .line 300
    .line 301
    invoke-interface {v1, v2}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v41

    .line 305
    move/from16 v3, p1

    .line 306
    .line 307
    invoke-interface {v1, v3}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v42

    .line 311
    move/from16 p0, v0

    .line 312
    .line 313
    move/from16 v0, v16

    .line 314
    .line 315
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v43

    .line 319
    move/from16 v16, v0

    .line 320
    .line 321
    move/from16 v0, v17

    .line 322
    .line 323
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v44

    .line 327
    move/from16 v17, v0

    .line 328
    .line 329
    move/from16 v0, v18

    .line 330
    .line 331
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v45

    .line 335
    move/from16 v18, v0

    .line 336
    .line 337
    move/from16 v0, v19

    .line 338
    .line 339
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v46

    .line 343
    move/from16 v19, v0

    .line 344
    .line 345
    move/from16 v0, v20

    .line 346
    .line 347
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v47

    .line 351
    move/from16 v20, v0

    .line 352
    .line 353
    move/from16 v0, v21

    .line 354
    .line 355
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v48

    .line 359
    move/from16 v21, v0

    .line 360
    .line 361
    move/from16 v0, v22

    .line 362
    .line 363
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v49

    .line 367
    move/from16 v22, v0

    .line 368
    .line 369
    move/from16 v0, v23

    .line 370
    .line 371
    invoke-interface {v1, v0}, La/xpg0;->J0(I)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v50

    .line 375
    new-instance v25, La/h5l0;

    .line 376
    .line 377
    invoke-direct/range {v25 .. v50}, La/h5l0;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    move/from16 v23, v0

    .line 381
    .line 382
    move-object/from16 v0, v25

    .line 383
    .line 384
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 385
    .line 386
    .line 387
    move/from16 v0, p0

    .line 388
    .line 389
    move/from16 p0, v2

    .line 390
    .line 391
    move/from16 p1, v3

    .line 392
    .line 393
    move/from16 v2, v24

    .line 394
    .line 395
    move/from16 v3, v51

    .line 396
    .line 397
    goto/16 :goto_1

    .line 398
    .line 399
    :cond_2
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 400
    .line 401
    .line 402
    return-object v4

    .line 403
    :goto_3
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 404
    .line 405
    .line 406
    throw v0

    .line 407
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 408
    .line 409
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    invoke-interface {v0, v3}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    :try_start_1
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    const/4 v4, 0x1

    .line 421
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-eqz v2, :cond_3

    .line 426
    .line 427
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    check-cast v2, Ljava/lang/Number;

    .line 432
    .line 433
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 434
    .line 435
    .line 436
    move-result-wide v2

    .line 437
    invoke-interface {v1, v4, v2, v3}, La/xpg0;->o(IJ)V

    .line 438
    .line 439
    .line 440
    add-int/lit8 v4, v4, 0x1

    .line 441
    .line 442
    goto :goto_4

    .line 443
    :catchall_1
    move-exception v0

    .line 444
    goto :goto_5

    .line 445
    :cond_3
    invoke-interface {v1}, La/xpg0;->W0()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 446
    .line 447
    .line 448
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 449
    .line 450
    .line 451
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 452
    .line 453
    return-object v0

    .line 454
    :goto_5
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 455
    .line 456
    .line 457
    throw v0

    .line 458
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 459
    .line 460
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    invoke-interface {v0, v3}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    :try_start_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    const/4 v4, 0x1

    .line 472
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    if-eqz v2, :cond_4

    .line 477
    .line 478
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    check-cast v2, Ljava/lang/Number;

    .line 483
    .line 484
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 485
    .line 486
    .line 487
    move-result-wide v2

    .line 488
    invoke-interface {v1, v4, v2, v3}, La/xpg0;->o(IJ)V

    .line 489
    .line 490
    .line 491
    add-int/lit8 v4, v4, 0x1

    .line 492
    .line 493
    goto :goto_6

    .line 494
    :catchall_2
    move-exception v0

    .line 495
    goto :goto_7

    .line 496
    :cond_4
    invoke-interface {v1}, La/xpg0;->W0()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 497
    .line 498
    .line 499
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 500
    .line 501
    .line 502
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 503
    .line 504
    return-object v0

    .line 505
    :goto_7
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 506
    .line 507
    .line 508
    throw v0

    .line 509
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
