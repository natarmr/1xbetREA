.class public final Lorg/xplatform/personal/impl/presentation/edit/l;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public final synthetic j:Lorg/xplatform/personal/impl/presentation/edit/n;

.field public final synthetic k:Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;


# direct methods
.method public constructor <init>(Lorg/xplatform/personal/impl/presentation/edit/n;Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/xplatform/personal/impl/presentation/edit/l;->j:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/xplatform/personal/impl/presentation/edit/l;->k:Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance p1, Lorg/xplatform/personal/impl/presentation/edit/l;

    .line 2
    .line 3
    iget-object v0, p0, Lorg/xplatform/personal/impl/presentation/edit/l;->j:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 4
    .line 5
    iget-object p0, p0, Lorg/xplatform/personal/impl/presentation/edit/l;->k:Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Lorg/xplatform/personal/impl/presentation/edit/l;-><init>(Lorg/xplatform/personal/impl/presentation/edit/n;Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;La/yje;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/personal/impl/presentation/edit/l;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lorg/xplatform/personal/impl/presentation/edit/l;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lorg/xplatform/personal/impl/presentation/edit/l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lorg/xplatform/personal/impl/presentation/edit/l;->j:Lorg/xplatform/personal/impl/presentation/edit/n;

    .line 4
    .line 5
    iget-object v2, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->m:La/au0;

    .line 6
    .line 7
    iget-object v3, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->l:La/zg;

    .line 8
    .line 9
    sget-object v4, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-byte v5, v0, Lorg/xplatform/personal/impl/presentation/edit/l;->i:B

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x1

    .line 16
    if-eqz v5, :cond_2

    .line 17
    .line 18
    if-eq v5, v8, :cond_1

    .line 19
    .line 20
    if-ne v5, v6, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    goto/16 :goto_22

    .line 28
    .line 29
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v7

    .line 35
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object/from16 v5, p1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v5, La/g2c0;

    .line 45
    .line 46
    invoke-direct {v5, v8}, La/g2c0;-><init>(Z)V

    .line 47
    .line 48
    .line 49
    sget-object v9, Lorg/xplatform/personal/impl/presentation/edit/n;->v:La/sdj;

    .line 50
    .line 51
    invoke-virtual {v1, v5}, Lorg/xplatform/personal/impl/presentation/edit/n;->D(La/k2c0;)V

    .line 52
    .line 53
    .line 54
    iget-object v5, v3, La/zg;->a:La/kt2;

    .line 55
    .line 56
    const-string v9, "acc_pers_data_submit"

    .line 57
    .line 58
    invoke-interface {v5, v9}, La/kt2;->c(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v5, v2, La/au0;->a:La/s1p;

    .line 62
    .line 63
    const-wide/16 v9, 0xc97

    .line 64
    .line 65
    sget-object v11, La/xun;->a:La/xun;

    .line 66
    .line 67
    invoke-virtual {v5, v11, v9, v10}, La/s1p;->a(Ljava/util/Set;J)V

    .line 68
    .line 69
    .line 70
    iput-byte v8, v0, Lorg/xplatform/personal/impl/presentation/edit/l;->i:B

    .line 71
    .line 72
    iget-object v5, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->d:La/nqs;

    .line 73
    .line 74
    invoke-virtual {v5, v0}, La/nqs;->w(La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    if-ne v5, v4, :cond_3

    .line 79
    .line 80
    goto/16 :goto_21

    .line 81
    .line 82
    :cond_3
    :goto_0
    check-cast v5, La/ynb0;

    .line 83
    .line 84
    iget-object v8, v0, Lorg/xplatform/personal/impl/presentation/edit/l;->k:Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;

    .line 85
    .line 86
    iget-object v8, v8, Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState$Loaded;->a:Ljava/util/Map;

    .line 87
    .line 88
    sget-object v9, Lorg/xplatform/personal/impl/presentation/edit/n;->v:La/sdj;

    .line 89
    .line 90
    iget-object v9, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->o:La/n0o0;

    .line 91
    .line 92
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    check-cast v9, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    new-instance v10, La/hqn;

    .line 103
    .line 104
    sget-object v11, La/w2c0;->e:La/w2c0;

    .line 105
    .line 106
    invoke-interface {v8, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    instance-of v12, v11, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 111
    .line 112
    if-eqz v12, :cond_4

    .line 113
    .line 114
    check-cast v11, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    move-object v11, v7

    .line 118
    :goto_1
    const-string v12, ""

    .line 119
    .line 120
    if-eqz v11, :cond_5

    .line 121
    .line 122
    iget-object v11, v11, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->b:Ljava/lang/String;

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    move-object v11, v12

    .line 126
    :goto_2
    sget-object v13, La/w2c0;->f:La/w2c0;

    .line 127
    .line 128
    invoke-interface {v8, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    instance-of v14, v13, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 133
    .line 134
    if-eqz v14, :cond_6

    .line 135
    .line 136
    check-cast v13, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_6
    move-object v13, v7

    .line 140
    :goto_3
    if-eqz v13, :cond_7

    .line 141
    .line 142
    iget-object v13, v13, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->b:Ljava/lang/String;

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_7
    move-object v13, v12

    .line 146
    :goto_4
    sget-object v14, La/w2c0;->g:La/w2c0;

    .line 147
    .line 148
    invoke-interface {v8, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v14

    .line 152
    instance-of v15, v14, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 153
    .line 154
    if-eqz v15, :cond_8

    .line 155
    .line 156
    check-cast v14, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_8
    move-object v14, v7

    .line 160
    :goto_5
    if-eqz v14, :cond_9

    .line 161
    .line 162
    iget-object v14, v14, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->b:Ljava/lang/String;

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_9
    move-object v14, v12

    .line 166
    :goto_6
    sget-object v15, La/w2c0;->h:La/w2c0;

    .line 167
    .line 168
    invoke-interface {v8, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v15

    .line 172
    instance-of v7, v15, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 173
    .line 174
    if-eqz v7, :cond_a

    .line 175
    .line 176
    check-cast v15, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 177
    .line 178
    goto :goto_7

    .line 179
    :cond_a
    const/4 v15, 0x0

    .line 180
    :goto_7
    if-eqz v15, :cond_b

    .line 181
    .line 182
    iget-object v7, v15, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->c:Ljava/lang/String;

    .line 183
    .line 184
    if-eqz v7, :cond_b

    .line 185
    .line 186
    invoke-static {v7}, La/f0c0;->a(Ljava/lang/String;)Ljava/lang/Long;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    goto :goto_8

    .line 191
    :cond_b
    const/4 v7, 0x0

    .line 192
    :goto_8
    sget-object v15, La/w2c0;->i:La/w2c0;

    .line 193
    .line 194
    invoke-interface {v8, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v15

    .line 198
    instance-of v6, v15, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 199
    .line 200
    if-eqz v6, :cond_c

    .line 201
    .line 202
    check-cast v15, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 203
    .line 204
    goto :goto_9

    .line 205
    :cond_c
    const/4 v15, 0x0

    .line 206
    :goto_9
    if-eqz v15, :cond_d

    .line 207
    .line 208
    iget-object v6, v15, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->b:Ljava/lang/String;

    .line 209
    .line 210
    move-object v15, v6

    .line 211
    goto :goto_a

    .line 212
    :cond_d
    move-object v15, v12

    .line 213
    :goto_a
    sget-object v6, La/w2c0;->j:La/w2c0;

    .line 214
    .line 215
    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    move-object/from16 p1, v7

    .line 220
    .line 221
    instance-of v7, v6, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 222
    .line 223
    if-eqz v7, :cond_e

    .line 224
    .line 225
    check-cast v6, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 226
    .line 227
    goto :goto_b

    .line 228
    :cond_e
    const/4 v6, 0x0

    .line 229
    :goto_b
    if-eqz v6, :cond_f

    .line 230
    .line 231
    iget v6, v6, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->b:I

    .line 232
    .line 233
    goto :goto_c

    .line 234
    :cond_f
    const/4 v6, 0x0

    .line 235
    :goto_c
    sget-object v7, La/w2c0;->k:La/w2c0;

    .line 236
    .line 237
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    move/from16 v18, v6

    .line 242
    .line 243
    instance-of v6, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 244
    .line 245
    if-eqz v6, :cond_10

    .line 246
    .line 247
    check-cast v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 248
    .line 249
    goto :goto_d

    .line 250
    :cond_10
    const/4 v7, 0x0

    .line 251
    :goto_d
    if-eqz v7, :cond_11

    .line 252
    .line 253
    iget v6, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->b:I

    .line 254
    .line 255
    goto :goto_e

    .line 256
    :cond_11
    const/4 v6, 0x0

    .line 257
    :goto_e
    sget-object v7, La/w2c0;->l:La/w2c0;

    .line 258
    .line 259
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    move/from16 v19, v6

    .line 264
    .line 265
    instance-of v6, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 266
    .line 267
    if-eqz v6, :cond_12

    .line 268
    .line 269
    check-cast v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 270
    .line 271
    goto :goto_f

    .line 272
    :cond_12
    const/4 v7, 0x0

    .line 273
    :goto_f
    if-eqz v7, :cond_13

    .line 274
    .line 275
    iget v6, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->b:I

    .line 276
    .line 277
    goto :goto_10

    .line 278
    :cond_13
    const/4 v6, 0x0

    .line 279
    :goto_10
    sget-object v7, La/w2c0;->n:La/w2c0;

    .line 280
    .line 281
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    move/from16 v20, v6

    .line 286
    .line 287
    instance-of v6, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 288
    .line 289
    if-eqz v6, :cond_14

    .line 290
    .line 291
    check-cast v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 292
    .line 293
    goto :goto_11

    .line 294
    :cond_14
    const/4 v7, 0x0

    .line 295
    :goto_11
    if-eqz v7, :cond_15

    .line 296
    .line 297
    iget v7, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->b:I

    .line 298
    .line 299
    goto :goto_12

    .line 300
    :cond_15
    const/4 v7, 0x0

    .line 301
    :goto_12
    sget-object v6, La/w2c0;->o:La/w2c0;

    .line 302
    .line 303
    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    move/from16 v17, v7

    .line 308
    .line 309
    instance-of v7, v6, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 310
    .line 311
    if-eqz v7, :cond_16

    .line 312
    .line 313
    check-cast v6, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 314
    .line 315
    goto :goto_13

    .line 316
    :cond_16
    const/4 v6, 0x0

    .line 317
    :goto_13
    if-eqz v6, :cond_17

    .line 318
    .line 319
    iget-object v6, v6, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->b:Ljava/lang/String;

    .line 320
    .line 321
    goto :goto_14

    .line 322
    :cond_17
    move-object v6, v12

    .line 323
    :goto_14
    sget-object v7, La/w2c0;->p:La/w2c0;

    .line 324
    .line 325
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    move-object/from16 v21, v6

    .line 330
    .line 331
    instance-of v6, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 332
    .line 333
    if-eqz v6, :cond_18

    .line 334
    .line 335
    check-cast v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 336
    .line 337
    goto :goto_15

    .line 338
    :cond_18
    const/4 v7, 0x0

    .line 339
    :goto_15
    if-eqz v7, :cond_19

    .line 340
    .line 341
    iget-object v6, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->b:Ljava/lang/String;

    .line 342
    .line 343
    goto :goto_16

    .line 344
    :cond_19
    move-object v6, v12

    .line 345
    :goto_16
    sget-object v7, La/w2c0;->q:La/w2c0;

    .line 346
    .line 347
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    move-object/from16 v22, v6

    .line 352
    .line 353
    instance-of v6, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 354
    .line 355
    if-eqz v6, :cond_1a

    .line 356
    .line 357
    check-cast v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;

    .line 358
    .line 359
    goto :goto_17

    .line 360
    :cond_1a
    const/4 v7, 0x0

    .line 361
    :goto_17
    if-eqz v7, :cond_1b

    .line 362
    .line 363
    iget-object v6, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItemClickable;->c:Ljava/lang/String;

    .line 364
    .line 365
    if-eqz v6, :cond_1b

    .line 366
    .line 367
    invoke-static {v6}, La/f0c0;->a(Ljava/lang/String;)Ljava/lang/Long;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    goto :goto_18

    .line 372
    :cond_1b
    const/4 v6, 0x0

    .line 373
    :goto_18
    sget-object v7, La/w2c0;->r:La/w2c0;

    .line 374
    .line 375
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    move-object/from16 v23, v6

    .line 380
    .line 381
    instance-of v6, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 382
    .line 383
    if-eqz v6, :cond_1c

    .line 384
    .line 385
    check-cast v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 386
    .line 387
    goto :goto_19

    .line 388
    :cond_1c
    const/4 v7, 0x0

    .line 389
    :goto_19
    if-eqz v7, :cond_1d

    .line 390
    .line 391
    iget-object v6, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->b:Ljava/lang/String;

    .line 392
    .line 393
    goto :goto_1a

    .line 394
    :cond_1d
    move-object v6, v12

    .line 395
    :goto_1a
    sget-object v7, La/w2c0;->m:La/w2c0;

    .line 396
    .line 397
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v7

    .line 401
    move-object/from16 v24, v6

    .line 402
    .line 403
    instance-of v6, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 404
    .line 405
    if-eqz v6, :cond_1e

    .line 406
    .line 407
    check-cast v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 408
    .line 409
    goto :goto_1b

    .line 410
    :cond_1e
    const/4 v7, 0x0

    .line 411
    :goto_1b
    if-eqz v7, :cond_1f

    .line 412
    .line 413
    iget-object v6, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->b:Ljava/lang/String;

    .line 414
    .line 415
    goto :goto_1c

    .line 416
    :cond_1f
    move-object v6, v12

    .line 417
    :goto_1c
    if-eqz v9, :cond_20

    .line 418
    .line 419
    sget-object v7, La/w2c0;->t:La/w2c0;

    .line 420
    .line 421
    goto :goto_1d

    .line 422
    :cond_20
    sget-object v7, La/w2c0;->s:La/w2c0;

    .line 423
    .line 424
    :goto_1d
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v7

    .line 428
    instance-of v9, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 429
    .line 430
    if-eqz v9, :cond_21

    .line 431
    .line 432
    check-cast v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 433
    .line 434
    goto :goto_1e

    .line 435
    :cond_21
    const/4 v7, 0x0

    .line 436
    :goto_1e
    if-eqz v7, :cond_22

    .line 437
    .line 438
    iget-object v7, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->b:Ljava/lang/String;

    .line 439
    .line 440
    move-object/from16 v25, v7

    .line 441
    .line 442
    goto :goto_1f

    .line 443
    :cond_22
    move-object/from16 v25, v12

    .line 444
    .line 445
    :goto_1f
    sget-object v7, La/w2c0;->u:La/w2c0;

    .line 446
    .line 447
    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    instance-of v8, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 452
    .line 453
    if-eqz v8, :cond_23

    .line 454
    .line 455
    check-cast v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;

    .line 456
    .line 457
    goto :goto_20

    .line 458
    :cond_23
    const/4 v7, 0x0

    .line 459
    :goto_20
    if-eqz v7, :cond_24

    .line 460
    .line 461
    iget-object v12, v7, Lorg/xplatform/personal/impl/presentation/edit/models/ProfileEditUiModelItem;->b:Ljava/lang/String;

    .line 462
    .line 463
    :cond_24
    move-object/from16 v26, v12

    .line 464
    .line 465
    const/16 v27, 0x0

    .line 466
    .line 467
    move/from16 v12, v19

    .line 468
    .line 469
    move/from16 v19, v17

    .line 470
    .line 471
    move/from16 v17, v12

    .line 472
    .line 473
    move-object v12, v13

    .line 474
    move-object v13, v14

    .line 475
    move/from16 v16, v18

    .line 476
    .line 477
    move/from16 v18, v20

    .line 478
    .line 479
    move-object/from16 v20, v21

    .line 480
    .line 481
    move-object/from16 v21, v22

    .line 482
    .line 483
    move-object/from16 v22, v23

    .line 484
    .line 485
    move-object/from16 v23, v24

    .line 486
    .line 487
    move-object/from16 v14, p1

    .line 488
    .line 489
    move-object/from16 v24, v6

    .line 490
    .line 491
    invoke-direct/range {v10 .. v27}, La/hqn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 492
    .line 493
    .line 494
    iget-object v6, v1, Lorg/xplatform/personal/impl/presentation/edit/n;->h:La/iqi;

    .line 495
    .line 496
    const/4 v7, 0x2

    .line 497
    iput-byte v7, v0, Lorg/xplatform/personal/impl/presentation/edit/l;->i:B

    .line 498
    .line 499
    invoke-virtual {v6, v10, v5, v0}, La/iqi;->i(La/hqn;La/ynb0;La/zje;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    if-ne v0, v4, :cond_25

    .line 504
    .line 505
    :goto_21
    return-object v4

    .line 506
    :cond_25
    :goto_22
    check-cast v0, La/gqn;

    .line 507
    .line 508
    iget-object v4, v0, La/gqn;->c:La/ypn;

    .line 509
    .line 510
    iget-object v4, v4, La/ypn;->a:Ljava/util/List;

    .line 511
    .line 512
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    if-eqz v4, :cond_26

    .line 517
    .line 518
    iget-object v0, v3, La/zg;->a:La/kt2;

    .line 519
    .line 520
    const-string v3, "acc_pers_data_done"

    .line 521
    .line 522
    invoke-interface {v0, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    iget-object v0, v2, La/au0;->a:La/s1p;

    .line 526
    .line 527
    const-wide/16 v2, 0xc98

    .line 528
    .line 529
    sget-object v4, La/xun;->a:La/xun;

    .line 530
    .line 531
    invoke-virtual {v0, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 532
    .line 533
    .line 534
    sget-object v0, La/j2c0;->a:La/j2c0;

    .line 535
    .line 536
    invoke-virtual {v1, v0}, Lorg/xplatform/personal/impl/presentation/edit/n;->D(La/k2c0;)V

    .line 537
    .line 538
    .line 539
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 540
    .line 541
    return-object v0

    .line 542
    :cond_26
    new-instance v1, La/ypn;

    .line 543
    .line 544
    iget-object v0, v0, La/gqn;->c:La/ypn;

    .line 545
    .line 546
    iget-object v0, v0, La/ypn;->a:Ljava/util/List;

    .line 547
    .line 548
    invoke-direct {v1, v0}, La/ypn;-><init>(Ljava/util/List;)V

    .line 549
    .line 550
    .line 551
    throw v1
.end method
