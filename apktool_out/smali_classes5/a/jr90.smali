.class public abstract La/jr90;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/cr90;La/ctf0;Lorg/xplatform/picker/api/presentation/PickerParams;)La/ir90;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    instance-of v3, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Citizenship;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const-string v5, ""

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    new-array v7, v6, [Ljava/lang/Object;

    .line 22
    .line 23
    const v8, 0x7f130dbe

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v8, v7}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    :goto_0
    move-object v10, v7

    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :cond_0
    instance-of v7, v2, Lorg/xplatform/picker/api/presentation/PickerParams$City;

    .line 34
    .line 35
    if-eqz v7, :cond_1

    .line 36
    .line 37
    new-array v7, v6, [Ljava/lang/Object;

    .line 38
    .line 39
    const v8, 0x7f130467

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v8, v7}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    instance-of v7, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Country;

    .line 48
    .line 49
    if-eqz v7, :cond_2

    .line 50
    .line 51
    new-array v7, v6, [Ljava/lang/Object;

    .line 52
    .line 53
    const v8, 0x7f13050a

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v8, v7}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    instance-of v7, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Currency;

    .line 62
    .line 63
    if-eqz v7, :cond_3

    .line 64
    .line 65
    new-array v7, v6, [Ljava/lang/Object;

    .line 66
    .line 67
    const v8, 0x7f1305b6

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v8, v7}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    instance-of v7, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Document;

    .line 76
    .line 77
    if-eqz v7, :cond_4

    .line 78
    .line 79
    new-array v7, v6, [Ljava/lang/Object;

    .line 80
    .line 81
    const v8, 0x7f1306ee

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v8, v7}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    goto :goto_0

    .line 89
    :cond_4
    instance-of v7, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 90
    .line 91
    if-eqz v7, :cond_5

    .line 92
    .line 93
    new-array v7, v6, [Ljava/lang/Object;

    .line 94
    .line 95
    const v8, 0x7f130178

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v8, v7}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    goto :goto_0

    .line 103
    :cond_5
    instance-of v7, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Region;

    .line 104
    .line 105
    if-eqz v7, :cond_6

    .line 106
    .line 107
    new-array v7, v6, [Ljava/lang/Object;

    .line 108
    .line 109
    const v8, 0x7f131125

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v8, v7}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    goto :goto_0

    .line 117
    :cond_6
    instance-of v7, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Language;

    .line 118
    .line 119
    if-eqz v7, :cond_7

    .line 120
    .line 121
    new-array v7, v6, [Ljava/lang/Object;

    .line 122
    .line 123
    iget-object v8, v1, La/ctf0;->b:La/lsm0;

    .line 124
    .line 125
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    const v9, 0x7f130ab0

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    goto :goto_0

    .line 137
    :cond_7
    instance-of v7, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Gender;

    .line 138
    .line 139
    if-eqz v7, :cond_8

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_8
    instance-of v7, v2, Lorg/xplatform/picker/api/presentation/PickerParams$ResidentStatus;

    .line 143
    .line 144
    if-eqz v7, :cond_1c

    .line 145
    .line 146
    :goto_1
    move-object v10, v5

    .line 147
    :goto_2
    if-eqz v3, :cond_9

    .line 148
    .line 149
    new-array v3, v6, [Ljava/lang/Object;

    .line 150
    .line 151
    const v7, 0x7f130173

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v7, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    :goto_3
    move-object v11, v3

    .line 159
    goto/16 :goto_4

    .line 160
    .line 161
    :cond_9
    instance-of v3, v2, Lorg/xplatform/picker/api/presentation/PickerParams$City;

    .line 162
    .line 163
    if-eqz v3, :cond_a

    .line 164
    .line 165
    new-array v3, v6, [Ljava/lang/Object;

    .line 166
    .line 167
    const v7, 0x7f130174

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v7, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    goto :goto_3

    .line 175
    :cond_a
    instance-of v3, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Country;

    .line 176
    .line 177
    if-eqz v3, :cond_b

    .line 178
    .line 179
    new-array v3, v6, [Ljava/lang/Object;

    .line 180
    .line 181
    const v7, 0x7f130175

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v7, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    goto :goto_3

    .line 189
    :cond_b
    instance-of v3, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Currency;

    .line 190
    .line 191
    if-eqz v3, :cond_c

    .line 192
    .line 193
    new-array v3, v6, [Ljava/lang/Object;

    .line 194
    .line 195
    const v7, 0x7f130176

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v7, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    goto :goto_3

    .line 203
    :cond_c
    instance-of v3, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Document;

    .line 204
    .line 205
    if-eqz v3, :cond_d

    .line 206
    .line 207
    new-array v3, v6, [Ljava/lang/Object;

    .line 208
    .line 209
    const v7, 0x7f130177

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v7, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    goto :goto_3

    .line 217
    :cond_d
    instance-of v3, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 218
    .line 219
    if-eqz v3, :cond_e

    .line 220
    .line 221
    new-array v3, v6, [Ljava/lang/Object;

    .line 222
    .line 223
    const v7, 0x7f130179

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v7, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    goto :goto_3

    .line 231
    :cond_e
    instance-of v3, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Region;

    .line 232
    .line 233
    if-eqz v3, :cond_f

    .line 234
    .line 235
    new-array v3, v6, [Ljava/lang/Object;

    .line 236
    .line 237
    const v7, 0x7f13017a

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v7, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    goto :goto_3

    .line 245
    :cond_f
    instance-of v3, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Language;

    .line 246
    .line 247
    if-eqz v3, :cond_10

    .line 248
    .line 249
    new-array v3, v6, [Ljava/lang/Object;

    .line 250
    .line 251
    iget-object v7, v1, La/ctf0;->b:La/lsm0;

    .line 252
    .line 253
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    const v8, 0x7f130ab1

    .line 258
    .line 259
    .line 260
    invoke-virtual {v7, v8, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    goto :goto_3

    .line 265
    :cond_10
    instance-of v3, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Gender;

    .line 266
    .line 267
    if-eqz v3, :cond_11

    .line 268
    .line 269
    new-array v3, v6, [Ljava/lang/Object;

    .line 270
    .line 271
    iget-object v7, v1, La/ctf0;->b:La/lsm0;

    .line 272
    .line 273
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    const v8, 0x7f130453

    .line 278
    .line 279
    .line 280
    invoke-virtual {v7, v8, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    goto :goto_3

    .line 285
    :cond_11
    instance-of v3, v2, Lorg/xplatform/picker/api/presentation/PickerParams$ResidentStatus;

    .line 286
    .line 287
    if-eqz v3, :cond_1b

    .line 288
    .line 289
    new-array v3, v6, [Ljava/lang/Object;

    .line 290
    .line 291
    iget-object v7, v1, La/ctf0;->b:La/lsm0;

    .line 292
    .line 293
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    const v8, 0x7f130459

    .line 298
    .line 299
    .line 300
    invoke-virtual {v7, v8, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    goto/16 :goto_3

    .line 305
    .line 306
    :goto_4
    iget-boolean v3, v0, La/cr90;->a:Z

    .line 307
    .line 308
    iget-boolean v7, v0, La/cr90;->b:Z

    .line 309
    .line 310
    const/4 v8, 0x1

    .line 311
    if-eqz v3, :cond_13

    .line 312
    .line 313
    instance-of v9, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 314
    .line 315
    if-eqz v9, :cond_12

    .line 316
    .line 317
    move-object v9, v2

    .line 318
    check-cast v9, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 319
    .line 320
    iget-boolean v9, v9, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;->c:Z

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_12
    move v9, v6

    .line 324
    :goto_5
    if-eqz v9, :cond_13

    .line 325
    .line 326
    if-nez v7, :cond_13

    .line 327
    .line 328
    move v12, v8

    .line 329
    goto :goto_6

    .line 330
    :cond_13
    move v12, v6

    .line 331
    :goto_6
    if-eqz v3, :cond_15

    .line 332
    .line 333
    instance-of v3, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 334
    .line 335
    if-eqz v3, :cond_14

    .line 336
    .line 337
    move-object v3, v2

    .line 338
    check-cast v3, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;

    .line 339
    .line 340
    iget-boolean v3, v3, Lorg/xplatform/picker/api/presentation/PickerParams$Phone;->c:Z

    .line 341
    .line 342
    goto :goto_7

    .line 343
    :cond_14
    move v3, v6

    .line 344
    :goto_7
    if-eqz v3, :cond_15

    .line 345
    .line 346
    if-eqz v7, :cond_15

    .line 347
    .line 348
    move v13, v8

    .line 349
    goto :goto_8

    .line 350
    :cond_15
    move v13, v6

    .line 351
    :goto_8
    iget-object v14, v0, La/cr90;->d:Ljava/lang/String;

    .line 352
    .line 353
    iget-object v3, v0, La/cr90;->g:Ljava/lang/Throwable;

    .line 354
    .line 355
    if-eqz v3, :cond_16

    .line 356
    .line 357
    new-array v3, v6, [Ljava/lang/Object;

    .line 358
    .line 359
    const v4, 0x7f13005a

    .line 360
    .line 361
    .line 362
    invoke-virtual {v1, v4, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    :cond_16
    if-nez v4, :cond_17

    .line 367
    .line 368
    move-object/from16 v16, v5

    .line 369
    .line 370
    goto :goto_9

    .line 371
    :cond_17
    move-object/from16 v16, v4

    .line 372
    .line 373
    :goto_9
    iget-object v15, v0, La/cr90;->c:Ljava/lang/String;

    .line 374
    .line 375
    iget-object v0, v0, La/cr90;->h:Ljava/lang/Integer;

    .line 376
    .line 377
    if-nez v0, :cond_18

    .line 378
    .line 379
    goto :goto_a

    .line 380
    :cond_18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    const/4 v1, 0x3

    .line 385
    if-ne v0, v1, :cond_19

    .line 386
    .line 387
    move/from16 v17, v8

    .line 388
    .line 389
    goto :goto_b

    .line 390
    :cond_19
    :goto_a
    move/from16 v17, v6

    .line 391
    .line 392
    :goto_b
    instance-of v0, v2, Lorg/xplatform/picker/api/presentation/PickerParams$Gender;

    .line 393
    .line 394
    if-nez v0, :cond_1a

    .line 395
    .line 396
    instance-of v0, v2, Lorg/xplatform/picker/api/presentation/PickerParams$ResidentStatus;

    .line 397
    .line 398
    if-nez v0, :cond_1a

    .line 399
    .line 400
    move v9, v8

    .line 401
    goto :goto_c

    .line 402
    :cond_1a
    move v9, v6

    .line 403
    :goto_c
    new-instance v8, La/ir90;

    .line 404
    .line 405
    invoke-direct/range {v8 .. v17}, La/ir90;-><init>(ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 406
    .line 407
    .line 408
    return-object v8

    .line 409
    :cond_1b
    invoke-static {}, La/t9f;->b()V

    .line 410
    .line 411
    .line 412
    return-object v4

    .line 413
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 414
    .line 415
    .line 416
    return-object v4
.end method
