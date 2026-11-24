.class public final La/equ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/equ0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/equ0;->a:B

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    const/4 v5, 0x4

    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x2

    .line 13
    const/4 v8, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v10, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    move-object v2, v10

    .line 24
    move-object v3, v2

    .line 25
    move-object v4, v3

    .line 26
    move-object v5, v4

    .line 27
    move-object v6, v5

    .line 28
    move-object v7, v6

    .line 29
    move-object v8, v7

    .line 30
    move-object v11, v8

    .line 31
    move-object v12, v11

    .line 32
    move-object v13, v12

    .line 33
    move-object v14, v13

    .line 34
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 35
    .line 36
    .line 37
    move-result v15

    .line 38
    if-ge v15, v0, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 41
    .line 42
    .line 43
    move-result v15

    .line 44
    move-object/from16 p0, v14

    .line 45
    .line 46
    int-to-char v14, v15

    .line 47
    packed-switch v14, :pswitch_data_1

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v15}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 51
    .line 52
    .line 53
    :goto_1
    move-object/from16 v14, p0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_0
    sget-object v14, Lcom/google/firebase/auth/zzao;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 57
    .line 58
    invoke-static {v1, v15, v14}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    move-result-object v14

    .line 62
    goto :goto_0

    .line 63
    :pswitch_1
    sget-object v13, Lcom/google/firebase/auth/internal/zzbl;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 64
    .line 65
    invoke-static {v1, v15, v13}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 66
    .line 67
    .line 68
    move-result-object v13

    .line 69
    check-cast v13, Lcom/google/firebase/auth/internal/zzbl;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :pswitch_2
    sget-object v12, Lcom/google/firebase/auth/zzc;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 73
    .line 74
    invoke-static {v1, v15, v12}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    check-cast v12, Lcom/google/firebase/auth/zzc;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :pswitch_3
    invoke-static {v1, v15}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    goto :goto_1

    .line 86
    :pswitch_4
    sget-object v11, Lcom/google/firebase/auth/internal/zzaf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 87
    .line 88
    invoke-static {v1, v15, v11}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    check-cast v11, Lcom/google/firebase/auth/internal/zzaf;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :pswitch_5
    invoke-static {v1, v15}, La/b5x;->U(Landroid/os/Parcel;I)Ljava/lang/Boolean;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    goto :goto_1

    .line 100
    :pswitch_6
    invoke-static {v1, v15}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    goto :goto_1

    .line 105
    :pswitch_7
    invoke-static {v1, v15}, La/b5x;->E(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    goto :goto_1

    .line 110
    :pswitch_8
    sget-object v5, Lcom/google/firebase/auth/internal/zzz;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 111
    .line 112
    invoke-static {v1, v15, v5}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    goto :goto_1

    .line 117
    :pswitch_9
    invoke-static {v1, v15}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    goto :goto_1

    .line 122
    :pswitch_a
    invoke-static {v1, v15}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    goto :goto_1

    .line 127
    :pswitch_b
    sget-object v2, Lcom/google/firebase/auth/internal/zzz;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 128
    .line 129
    invoke-static {v1, v15, v2}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Lcom/google/firebase/auth/internal/zzz;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :pswitch_c
    sget-object v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 137
    .line 138
    invoke-static {v1, v15, v10}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    check-cast v10, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_0
    move-object/from16 p0, v14

    .line 146
    .line 147
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 148
    .line 149
    .line 150
    new-instance v0, Lcom/google/firebase/auth/internal/zzad;

    .line 151
    .line 152
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 153
    .line 154
    .line 155
    iput-object v10, v0, Lcom/google/firebase/auth/internal/zzad;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 156
    .line 157
    iput-object v2, v0, Lcom/google/firebase/auth/internal/zzad;->b:Lcom/google/firebase/auth/internal/zzz;

    .line 158
    .line 159
    iput-object v3, v0, Lcom/google/firebase/auth/internal/zzad;->c:Ljava/lang/String;

    .line 160
    .line 161
    iput-object v4, v0, Lcom/google/firebase/auth/internal/zzad;->d:Ljava/lang/String;

    .line 162
    .line 163
    iput-object v5, v0, Lcom/google/firebase/auth/internal/zzad;->e:Ljava/util/ArrayList;

    .line 164
    .line 165
    iput-object v6, v0, Lcom/google/firebase/auth/internal/zzad;->f:Ljava/util/ArrayList;

    .line 166
    .line 167
    iput-object v7, v0, Lcom/google/firebase/auth/internal/zzad;->g:Ljava/lang/String;

    .line 168
    .line 169
    iput-object v8, v0, Lcom/google/firebase/auth/internal/zzad;->h:Ljava/lang/Boolean;

    .line 170
    .line 171
    iput-object v11, v0, Lcom/google/firebase/auth/internal/zzad;->i:Lcom/google/firebase/auth/internal/zzaf;

    .line 172
    .line 173
    iput-boolean v9, v0, Lcom/google/firebase/auth/internal/zzad;->j:Z

    .line 174
    .line 175
    iput-object v12, v0, Lcom/google/firebase/auth/internal/zzad;->k:Lcom/google/firebase/auth/zzc;

    .line 176
    .line 177
    iput-object v13, v0, Lcom/google/firebase/auth/internal/zzad;->l:Lcom/google/firebase/auth/internal/zzbl;

    .line 178
    .line 179
    iput-object v14, v0, Lcom/google/firebase/auth/internal/zzad;->m:Ljava/util/List;

    .line 180
    .line 181
    return-object v0

    .line 182
    :pswitch_d
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    move-wide v12, v3

    .line 187
    move-wide v14, v12

    .line 188
    move v11, v9

    .line 189
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-ge v2, v0, :cond_4

    .line 194
    .line 195
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    int-to-char v3, v2

    .line 200
    if-eq v3, v8, :cond_3

    .line 201
    .line 202
    if-eq v3, v7, :cond_2

    .line 203
    .line 204
    if-eq v3, v6, :cond_1

    .line 205
    .line 206
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_1
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 211
    .line 212
    .line 213
    move-result-wide v2

    .line 214
    move-wide v14, v2

    .line 215
    goto :goto_2

    .line 216
    :cond_2
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    move v11, v2

    .line 221
    goto :goto_2

    .line 222
    :cond_3
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 223
    .line 224
    .line 225
    move-result-wide v2

    .line 226
    move-wide v12, v2

    .line 227
    goto :goto_2

    .line 228
    :cond_4
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 229
    .line 230
    .line 231
    new-instance v10, Lcom/google/android/gms/measurement/internal/zzaf;

    .line 232
    .line 233
    invoke-direct/range {v10 .. v15}, Lcom/google/android/gms/measurement/internal/zzaf;-><init>(IJJ)V

    .line 234
    .line 235
    .line 236
    return-object v10

    .line 237
    :pswitch_e
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    move/from16 v18, v9

    .line 242
    .line 243
    move-object v12, v10

    .line 244
    move-object v13, v12

    .line 245
    move-object v14, v13

    .line 246
    move-object v15, v14

    .line 247
    move-object/from16 v16, v15

    .line 248
    .line 249
    move-object/from16 v17, v16

    .line 250
    .line 251
    move-object/from16 v19, v17

    .line 252
    .line 253
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-ge v2, v0, :cond_5

    .line 258
    .line 259
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    int-to-char v3, v2

    .line 264
    packed-switch v3, :pswitch_data_2

    .line 265
    .line 266
    .line 267
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 268
    .line 269
    .line 270
    goto :goto_3

    .line 271
    :pswitch_f
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v19

    .line 275
    goto :goto_3

    .line 276
    :pswitch_10
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 277
    .line 278
    .line 279
    move-result v18

    .line 280
    goto :goto_3

    .line 281
    :pswitch_11
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v17

    .line 285
    goto :goto_3

    .line 286
    :pswitch_12
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v14

    .line 290
    goto :goto_3

    .line 291
    :pswitch_13
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v15

    .line 295
    goto :goto_3

    .line 296
    :pswitch_14
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v16

    .line 300
    goto :goto_3

    .line 301
    :pswitch_15
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v13

    .line 305
    goto :goto_3

    .line 306
    :pswitch_16
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v12

    .line 310
    goto :goto_3

    .line 311
    :cond_5
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 312
    .line 313
    .line 314
    new-instance v11, Lcom/google/firebase/auth/internal/zzz;

    .line 315
    .line 316
    invoke-direct/range {v11 .. v19}, Lcom/google/firebase/auth/internal/zzz;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 317
    .line 318
    .line 319
    return-object v11

    .line 320
    :pswitch_17
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    move-object v2, v10

    .line 325
    move-object v3, v2

    .line 326
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    if-ge v4, v0, :cond_9

    .line 331
    .line 332
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    int-to-char v5, v4

    .line 337
    if-eq v5, v8, :cond_8

    .line 338
    .line 339
    if-eq v5, v7, :cond_7

    .line 340
    .line 341
    if-eq v5, v6, :cond_6

    .line 342
    .line 343
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 344
    .line 345
    .line 346
    goto :goto_4

    .line 347
    :cond_6
    sget-object v3, Lcom/google/firebase/auth/zzc;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 348
    .line 349
    invoke-static {v1, v4, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    check-cast v3, Lcom/google/firebase/auth/zzc;

    .line 354
    .line 355
    goto :goto_4

    .line 356
    :cond_7
    sget-object v2, Lcom/google/firebase/auth/internal/zzv;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 357
    .line 358
    invoke-static {v1, v4, v2}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    check-cast v2, Lcom/google/firebase/auth/internal/zzv;

    .line 363
    .line 364
    goto :goto_4

    .line 365
    :cond_8
    sget-object v5, Lcom/google/firebase/auth/internal/zzad;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 366
    .line 367
    invoke-static {v1, v4, v5}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    move-object v10, v4

    .line 372
    check-cast v10, Lcom/google/firebase/auth/internal/zzad;

    .line 373
    .line 374
    goto :goto_4

    .line 375
    :cond_9
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 376
    .line 377
    .line 378
    new-instance v0, Lcom/google/firebase/auth/internal/zzx;

    .line 379
    .line 380
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 381
    .line 382
    .line 383
    iput-object v10, v0, Lcom/google/firebase/auth/internal/zzx;->a:Lcom/google/firebase/auth/internal/zzad;

    .line 384
    .line 385
    iput-object v2, v0, Lcom/google/firebase/auth/internal/zzx;->b:Lcom/google/firebase/auth/internal/zzv;

    .line 386
    .line 387
    iput-object v3, v0, Lcom/google/firebase/auth/internal/zzx;->c:Lcom/google/firebase/auth/zzc;

    .line 388
    .line 389
    return-object v0

    .line 390
    :pswitch_18
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    move v12, v9

    .line 395
    move v13, v12

    .line 396
    move-object v14, v10

    .line 397
    move-object v15, v14

    .line 398
    move-object/from16 v16, v15

    .line 399
    .line 400
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    if-ge v3, v0, :cond_10

    .line 405
    .line 406
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    int-to-char v4, v3

    .line 411
    if-eq v4, v8, :cond_f

    .line 412
    .line 413
    if-eq v4, v7, :cond_e

    .line 414
    .line 415
    if-eq v4, v6, :cond_d

    .line 416
    .line 417
    if-eq v4, v5, :cond_c

    .line 418
    .line 419
    if-eq v4, v2, :cond_a

    .line 420
    .line 421
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 422
    .line 423
    .line 424
    goto :goto_5

    .line 425
    :cond_a
    invoke-static {v1, v3}, La/b5x;->Z(Landroid/os/Parcel;I)I

    .line 426
    .line 427
    .line 428
    move-result v3

    .line 429
    if-nez v3, :cond_b

    .line 430
    .line 431
    move-object/from16 v16, v10

    .line 432
    .line 433
    goto :goto_5

    .line 434
    :cond_b
    invoke-static {v1, v3, v5}, La/b5x;->k0(Landroid/os/Parcel;II)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    move-object/from16 v16, v3

    .line 446
    .line 447
    goto :goto_5

    .line 448
    :cond_c
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v15

    .line 452
    goto :goto_5

    .line 453
    :cond_d
    sget-object v4, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 454
    .line 455
    invoke-static {v1, v3, v4}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 456
    .line 457
    .line 458
    move-result-object v3

    .line 459
    move-object v14, v3

    .line 460
    check-cast v14, Landroid/app/PendingIntent;

    .line 461
    .line 462
    goto :goto_5

    .line 463
    :cond_e
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 464
    .line 465
    .line 466
    move-result v13

    .line 467
    goto :goto_5

    .line 468
    :cond_f
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 469
    .line 470
    .line 471
    move-result v12

    .line 472
    goto :goto_5

    .line 473
    :cond_10
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 474
    .line 475
    .line 476
    new-instance v11, Lcom/google/android/gms/common/ConnectionResult;

    .line 477
    .line 478
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/common/ConnectionResult;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 479
    .line 480
    .line 481
    return-object v11

    .line 482
    :pswitch_19
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    if-ge v2, v0, :cond_12

    .line 491
    .line 492
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    int-to-char v3, v2

    .line 497
    if-eq v3, v8, :cond_11

    .line 498
    .line 499
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 500
    .line 501
    .line 502
    goto :goto_6

    .line 503
    :cond_11
    sget-object v3, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 504
    .line 505
    invoke-static {v1, v2, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    move-object v10, v2

    .line 510
    check-cast v10, Landroid/content/Intent;

    .line 511
    .line 512
    goto :goto_6

    .line 513
    :cond_12
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 514
    .line 515
    .line 516
    new-instance v0, Lcom/google/android/gms/cloudmessaging/CloudMessage;

    .line 517
    .line 518
    invoke-direct {v0, v10}, Lcom/google/android/gms/cloudmessaging/CloudMessage;-><init>(Landroid/content/Intent;)V

    .line 519
    .line 520
    .line 521
    return-object v0

    .line 522
    :pswitch_1a
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    move-object v12, v10

    .line 527
    move-object v13, v12

    .line 528
    move-object v14, v13

    .line 529
    move-object v15, v14

    .line 530
    move-object/from16 v16, v15

    .line 531
    .line 532
    move-object/from16 v17, v16

    .line 533
    .line 534
    move-object/from16 v18, v17

    .line 535
    .line 536
    move-object/from16 v19, v18

    .line 537
    .line 538
    move-object/from16 v20, v19

    .line 539
    .line 540
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 541
    .line 542
    .line 543
    move-result v2

    .line 544
    if-ge v2, v0, :cond_13

    .line 545
    .line 546
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 547
    .line 548
    .line 549
    move-result v2

    .line 550
    int-to-char v3, v2

    .line 551
    packed-switch v3, :pswitch_data_3

    .line 552
    .line 553
    .line 554
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 555
    .line 556
    .line 557
    goto :goto_7

    .line 558
    :pswitch_1b
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 559
    .line 560
    invoke-static {v1, v2, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    move-object/from16 v20, v2

    .line 565
    .line 566
    check-cast v20, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;

    .line 567
    .line 568
    goto :goto_7

    .line 569
    :pswitch_1c
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v19

    .line 573
    goto :goto_7

    .line 574
    :pswitch_1d
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v18

    .line 578
    goto :goto_7

    .line 579
    :pswitch_1e
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v17

    .line 583
    goto :goto_7

    .line 584
    :pswitch_1f
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 585
    .line 586
    invoke-static {v1, v2, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    move-object/from16 v16, v2

    .line 591
    .line 592
    check-cast v16, Landroid/net/Uri;

    .line 593
    .line 594
    goto :goto_7

    .line 595
    :pswitch_20
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v15

    .line 599
    goto :goto_7

    .line 600
    :pswitch_21
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v14

    .line 604
    goto :goto_7

    .line 605
    :pswitch_22
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v13

    .line 609
    goto :goto_7

    .line 610
    :pswitch_23
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v12

    .line 614
    goto :goto_7

    .line 615
    :cond_13
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 616
    .line 617
    .line 618
    new-instance v11, Lcom/google/android/gms/auth/api/identity/SignInCredential;

    .line 619
    .line 620
    invoke-direct/range {v11 .. v20}, Lcom/google/android/gms/auth/api/identity/SignInCredential;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)V

    .line 621
    .line 622
    .line 623
    return-object v11

    .line 624
    :pswitch_24
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    move-object v3, v10

    .line 629
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 630
    .line 631
    .line 632
    move-result v4

    .line 633
    if-ge v4, v0, :cond_16

    .line 634
    .line 635
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 636
    .line 637
    .line 638
    move-result v4

    .line 639
    int-to-char v5, v4

    .line 640
    if-eq v5, v7, :cond_15

    .line 641
    .line 642
    if-eq v5, v2, :cond_14

    .line 643
    .line 644
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 645
    .line 646
    .line 647
    goto :goto_8

    .line 648
    :cond_14
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 649
    .line 650
    invoke-static {v1, v4, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    check-cast v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 655
    .line 656
    goto :goto_8

    .line 657
    :cond_15
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v10

    .line 661
    goto :goto_8

    .line 662
    :cond_16
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 663
    .line 664
    .line 665
    new-instance v0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 666
    .line 667
    invoke-direct {v0, v10, v3}, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;-><init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 668
    .line 669
    .line 670
    return-object v0

    .line 671
    :pswitch_25
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    move v2, v9

    .line 676
    move v7, v2

    .line 677
    move-object v3, v10

    .line 678
    move-object v4, v3

    .line 679
    move-object v5, v4

    .line 680
    move-object v6, v5

    .line 681
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 682
    .line 683
    .line 684
    move-result v8

    .line 685
    if-ge v8, v0, :cond_17

    .line 686
    .line 687
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 688
    .line 689
    .line 690
    move-result v8

    .line 691
    int-to-char v9, v8

    .line 692
    packed-switch v9, :pswitch_data_4

    .line 693
    .line 694
    .line 695
    invoke-static {v1, v8}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 696
    .line 697
    .line 698
    goto :goto_9

    .line 699
    :pswitch_26
    invoke-static {v1, v8}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 700
    .line 701
    .line 702
    move-result v2

    .line 703
    goto :goto_9

    .line 704
    :pswitch_27
    invoke-static {v1, v8}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 705
    .line 706
    .line 707
    move-result v7

    .line 708
    goto :goto_9

    .line 709
    :pswitch_28
    invoke-static {v1, v8}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v6

    .line 713
    goto :goto_9

    .line 714
    :pswitch_29
    invoke-static {v1, v8}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v5

    .line 718
    goto :goto_9

    .line 719
    :pswitch_2a
    invoke-static {v1, v8}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v4

    .line 723
    goto :goto_9

    .line 724
    :pswitch_2b
    invoke-static {v1, v8}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v3

    .line 728
    goto :goto_9

    .line 729
    :cond_17
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 730
    .line 731
    .line 732
    new-instance v1, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    .line 733
    .line 734
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 735
    .line 736
    .line 737
    return-object v1

    .line 738
    :pswitch_2c
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 739
    .line 740
    .line 741
    move-result v0

    .line 742
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 743
    .line 744
    .line 745
    move-result v2

    .line 746
    if-ge v2, v0, :cond_19

    .line 747
    .line 748
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 749
    .line 750
    .line 751
    move-result v2

    .line 752
    int-to-char v3, v2

    .line 753
    if-eq v3, v8, :cond_18

    .line 754
    .line 755
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 756
    .line 757
    .line 758
    goto :goto_a

    .line 759
    :cond_18
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 760
    .line 761
    invoke-static {v1, v2, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    move-object v10, v2

    .line 766
    check-cast v10, Landroid/app/PendingIntent;

    .line 767
    .line 768
    goto :goto_a

    .line 769
    :cond_19
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 770
    .line 771
    .line 772
    new-instance v0, Lcom/google/android/gms/auth/api/identity/BeginSignInResult;

    .line 773
    .line 774
    invoke-direct {v0, v10}, Lcom/google/android/gms/auth/api/identity/BeginSignInResult;-><init>(Landroid/app/PendingIntent;)V

    .line 775
    .line 776
    .line 777
    return-object v0

    .line 778
    :pswitch_2d
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    const-string v2, ""

    .line 783
    .line 784
    move-object v3, v2

    .line 785
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 786
    .line 787
    .line 788
    move-result v4

    .line 789
    if-ge v4, v0, :cond_1d

    .line 790
    .line 791
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 792
    .line 793
    .line 794
    move-result v4

    .line 795
    int-to-char v6, v4

    .line 796
    if-eq v6, v5, :cond_1c

    .line 797
    .line 798
    const/4 v7, 0x7

    .line 799
    if-eq v6, v7, :cond_1b

    .line 800
    .line 801
    const/16 v7, 0x8

    .line 802
    .line 803
    if-eq v6, v7, :cond_1a

    .line 804
    .line 805
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 806
    .line 807
    .line 808
    goto :goto_b

    .line 809
    :cond_1a
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v3

    .line 813
    goto :goto_b

    .line 814
    :cond_1b
    sget-object v6, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 815
    .line 816
    invoke-static {v1, v4, v6}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 817
    .line 818
    .line 819
    move-result-object v4

    .line 820
    move-object v10, v4

    .line 821
    check-cast v10, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 822
    .line 823
    goto :goto_b

    .line 824
    :cond_1c
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v2

    .line 828
    goto :goto_b

    .line 829
    :cond_1d
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 830
    .line 831
    .line 832
    new-instance v0, Lcom/google/android/gms/auth/api/signin/SignInAccount;

    .line 833
    .line 834
    invoke-direct {v0, v2, v10, v3}, Lcom/google/android/gms/auth/api/signin/SignInAccount;-><init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    return-object v0

    .line 838
    :pswitch_2e
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 839
    .line 840
    .line 841
    move-result v0

    .line 842
    move v2, v9

    .line 843
    move-object v3, v10

    .line 844
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 845
    .line 846
    .line 847
    move-result v4

    .line 848
    if-ge v4, v0, :cond_22

    .line 849
    .line 850
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 851
    .line 852
    .line 853
    move-result v4

    .line 854
    int-to-char v11, v4

    .line 855
    if-eq v11, v8, :cond_21

    .line 856
    .line 857
    if-eq v11, v7, :cond_20

    .line 858
    .line 859
    if-eq v11, v6, :cond_1f

    .line 860
    .line 861
    if-eq v11, v5, :cond_1e

    .line 862
    .line 863
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 864
    .line 865
    .line 866
    goto :goto_c

    .line 867
    :cond_1e
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 868
    .line 869
    invoke-static {v1, v4, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 870
    .line 871
    .line 872
    move-result-object v3

    .line 873
    check-cast v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 874
    .line 875
    goto :goto_c

    .line 876
    :cond_1f
    invoke-static {v1, v4}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 877
    .line 878
    .line 879
    move-result v2

    .line 880
    goto :goto_c

    .line 881
    :cond_20
    sget-object v10, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 882
    .line 883
    invoke-static {v1, v4, v10}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 884
    .line 885
    .line 886
    move-result-object v4

    .line 887
    move-object v10, v4

    .line 888
    check-cast v10, Landroid/accounts/Account;

    .line 889
    .line 890
    goto :goto_c

    .line 891
    :cond_21
    invoke-static {v1, v4}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 892
    .line 893
    .line 894
    move-result v9

    .line 895
    goto :goto_c

    .line 896
    :cond_22
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 897
    .line 898
    .line 899
    new-instance v0, Lcom/google/android/gms/common/internal/zay;

    .line 900
    .line 901
    invoke-direct {v0, v9, v10, v2, v3}, Lcom/google/android/gms/common/internal/zay;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 902
    .line 903
    .line 904
    return-object v0

    .line 905
    :pswitch_2f
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 906
    .line 907
    .line 908
    move-result v0

    .line 909
    const/4 v2, -0x1

    .line 910
    move/from16 v16, v2

    .line 911
    .line 912
    move-wide/from16 v17, v3

    .line 913
    .line 914
    move-wide/from16 v19, v17

    .line 915
    .line 916
    move v12, v9

    .line 917
    move v13, v12

    .line 918
    move v14, v13

    .line 919
    move v15, v14

    .line 920
    move-object/from16 v21, v10

    .line 921
    .line 922
    move-object/from16 v22, v21

    .line 923
    .line 924
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 925
    .line 926
    .line 927
    move-result v2

    .line 928
    if-ge v2, v0, :cond_23

    .line 929
    .line 930
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 931
    .line 932
    .line 933
    move-result v2

    .line 934
    int-to-char v3, v2

    .line 935
    packed-switch v3, :pswitch_data_5

    .line 936
    .line 937
    .line 938
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 939
    .line 940
    .line 941
    goto :goto_d

    .line 942
    :pswitch_30
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 943
    .line 944
    .line 945
    move-result v2

    .line 946
    move/from16 v16, v2

    .line 947
    .line 948
    goto :goto_d

    .line 949
    :pswitch_31
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 950
    .line 951
    .line 952
    move-result v2

    .line 953
    move v15, v2

    .line 954
    goto :goto_d

    .line 955
    :pswitch_32
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 956
    .line 957
    .line 958
    move-result-object v2

    .line 959
    move-object/from16 v22, v2

    .line 960
    .line 961
    goto :goto_d

    .line 962
    :pswitch_33
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object v2

    .line 966
    move-object/from16 v21, v2

    .line 967
    .line 968
    goto :goto_d

    .line 969
    :pswitch_34
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 970
    .line 971
    .line 972
    move-result-wide v2

    .line 973
    move-wide/from16 v19, v2

    .line 974
    .line 975
    goto :goto_d

    .line 976
    :pswitch_35
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 977
    .line 978
    .line 979
    move-result-wide v2

    .line 980
    move-wide/from16 v17, v2

    .line 981
    .line 982
    goto :goto_d

    .line 983
    :pswitch_36
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 984
    .line 985
    .line 986
    move-result v2

    .line 987
    move v14, v2

    .line 988
    goto :goto_d

    .line 989
    :pswitch_37
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 990
    .line 991
    .line 992
    move-result v2

    .line 993
    move v13, v2

    .line 994
    goto :goto_d

    .line 995
    :pswitch_38
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 996
    .line 997
    .line 998
    move-result v2

    .line 999
    move v12, v2

    .line 1000
    goto :goto_d

    .line 1001
    :cond_23
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1002
    .line 1003
    .line 1004
    new-instance v11, Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 1005
    .line 1006
    invoke-direct/range {v11 .. v22}, Lcom/google/android/gms/common/internal/MethodInvocation;-><init>(IIIIIJJLjava/lang/String;Ljava/lang/String;)V

    .line 1007
    .line 1008
    .line 1009
    return-object v11

    .line 1010
    :pswitch_39
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1011
    .line 1012
    .line 1013
    move-result v0

    .line 1014
    move-object v2, v10

    .line 1015
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1016
    .line 1017
    .line 1018
    move-result v3

    .line 1019
    if-ge v3, v0, :cond_27

    .line 1020
    .line 1021
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1022
    .line 1023
    .line 1024
    move-result v3

    .line 1025
    int-to-char v4, v3

    .line 1026
    if-eq v4, v8, :cond_26

    .line 1027
    .line 1028
    if-eq v4, v7, :cond_25

    .line 1029
    .line 1030
    if-eq v4, v6, :cond_24

    .line 1031
    .line 1032
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1033
    .line 1034
    .line 1035
    goto :goto_e

    .line 1036
    :cond_24
    sget-object v2, Lcom/google/android/gms/common/internal/zaaa;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1037
    .line 1038
    invoke-static {v1, v3, v2}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v2

    .line 1042
    check-cast v2, Lcom/google/android/gms/common/internal/zaaa;

    .line 1043
    .line 1044
    goto :goto_e

    .line 1045
    :cond_25
    sget-object v4, Lcom/google/android/gms/common/ConnectionResult;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1046
    .line 1047
    invoke-static {v1, v3, v4}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v3

    .line 1051
    move-object v10, v3

    .line 1052
    check-cast v10, Lcom/google/android/gms/common/ConnectionResult;

    .line 1053
    .line 1054
    goto :goto_e

    .line 1055
    :cond_26
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1056
    .line 1057
    .line 1058
    move-result v9

    .line 1059
    goto :goto_e

    .line 1060
    :cond_27
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1061
    .line 1062
    .line 1063
    new-instance v0, Lcom/google/android/gms/signin/internal/zak;

    .line 1064
    .line 1065
    invoke-direct {v0, v9, v10, v2}, Lcom/google/android/gms/signin/internal/zak;-><init>(ILcom/google/android/gms/common/ConnectionResult;Lcom/google/android/gms/common/internal/zaaa;)V

    .line 1066
    .line 1067
    .line 1068
    return-object v0

    .line 1069
    :pswitch_3a
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1070
    .line 1071
    .line 1072
    move-result v0

    .line 1073
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1074
    .line 1075
    .line 1076
    move-result v2

    .line 1077
    if-ge v2, v0, :cond_2a

    .line 1078
    .line 1079
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1080
    .line 1081
    .line 1082
    move-result v2

    .line 1083
    int-to-char v3, v2

    .line 1084
    if-eq v3, v8, :cond_29

    .line 1085
    .line 1086
    if-eq v3, v7, :cond_28

    .line 1087
    .line 1088
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1089
    .line 1090
    .line 1091
    goto :goto_f

    .line 1092
    :cond_28
    sget-object v3, Lcom/google/android/gms/common/internal/zay;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1093
    .line 1094
    invoke-static {v1, v2, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v2

    .line 1098
    move-object v10, v2

    .line 1099
    check-cast v10, Lcom/google/android/gms/common/internal/zay;

    .line 1100
    .line 1101
    goto :goto_f

    .line 1102
    :cond_29
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1103
    .line 1104
    .line 1105
    move-result v9

    .line 1106
    goto :goto_f

    .line 1107
    :cond_2a
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1108
    .line 1109
    .line 1110
    new-instance v0, Lcom/google/android/gms/signin/internal/zai;

    .line 1111
    .line 1112
    invoke-direct {v0, v9, v10}, Lcom/google/android/gms/signin/internal/zai;-><init>(ILcom/google/android/gms/common/internal/zay;)V

    .line 1113
    .line 1114
    .line 1115
    return-object v0

    .line 1116
    :pswitch_3b
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1117
    .line 1118
    .line 1119
    move-result v0

    .line 1120
    move-object v2, v10

    .line 1121
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1122
    .line 1123
    .line 1124
    move-result v3

    .line 1125
    if-ge v3, v0, :cond_2d

    .line 1126
    .line 1127
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1128
    .line 1129
    .line 1130
    move-result v3

    .line 1131
    int-to-char v4, v3

    .line 1132
    if-eq v4, v8, :cond_2c

    .line 1133
    .line 1134
    if-eq v4, v7, :cond_2b

    .line 1135
    .line 1136
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_10

    .line 1140
    :cond_2b
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v2

    .line 1144
    goto :goto_10

    .line 1145
    :cond_2c
    invoke-static {v1, v3}, La/b5x;->E(Landroid/os/Parcel;I)Ljava/util/ArrayList;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v10

    .line 1149
    goto :goto_10

    .line 1150
    :cond_2d
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1151
    .line 1152
    .line 1153
    new-instance v0, Lcom/google/android/gms/signin/internal/zag;

    .line 1154
    .line 1155
    invoke-direct {v0, v2, v10}, Lcom/google/android/gms/signin/internal/zag;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1156
    .line 1157
    .line 1158
    return-object v0

    .line 1159
    :pswitch_3c
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1160
    .line 1161
    .line 1162
    move-result v0

    .line 1163
    move v12, v9

    .line 1164
    move v15, v12

    .line 1165
    move/from16 v16, v15

    .line 1166
    .line 1167
    move/from16 v17, v16

    .line 1168
    .line 1169
    move-object v13, v10

    .line 1170
    move-object v14, v13

    .line 1171
    move-object/from16 v18, v14

    .line 1172
    .line 1173
    move-object/from16 v19, v18

    .line 1174
    .line 1175
    move-object/from16 v21, v19

    .line 1176
    .line 1177
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1178
    .line 1179
    .line 1180
    move-result v2

    .line 1181
    if-ge v2, v0, :cond_2e

    .line 1182
    .line 1183
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1184
    .line 1185
    .line 1186
    move-result v2

    .line 1187
    int-to-char v3, v2

    .line 1188
    packed-switch v3, :pswitch_data_6

    .line 1189
    .line 1190
    .line 1191
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1192
    .line 1193
    .line 1194
    goto :goto_11

    .line 1195
    :pswitch_3d
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v21

    .line 1199
    goto :goto_11

    .line 1200
    :pswitch_3e
    sget-object v3, Lcom/google/android/gms/auth/api/signin/internal/GoogleSignInOptionsExtensionParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1201
    .line 1202
    invoke-static {v1, v2, v3}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v10

    .line 1206
    goto :goto_11

    .line 1207
    :pswitch_3f
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v19

    .line 1211
    goto :goto_11

    .line 1212
    :pswitch_40
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v18

    .line 1216
    goto :goto_11

    .line 1217
    :pswitch_41
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1218
    .line 1219
    .line 1220
    move-result v17

    .line 1221
    goto :goto_11

    .line 1222
    :pswitch_42
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1223
    .line 1224
    .line 1225
    move-result v16

    .line 1226
    goto :goto_11

    .line 1227
    :pswitch_43
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v15

    .line 1231
    goto :goto_11

    .line 1232
    :pswitch_44
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1233
    .line 1234
    invoke-static {v1, v2, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v2

    .line 1238
    move-object v14, v2

    .line 1239
    check-cast v14, Landroid/accounts/Account;

    .line 1240
    .line 1241
    goto :goto_11

    .line 1242
    :pswitch_45
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1243
    .line 1244
    invoke-static {v1, v2, v3}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v13

    .line 1248
    goto :goto_11

    .line 1249
    :pswitch_46
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1250
    .line 1251
    .line 1252
    move-result v12

    .line 1253
    goto :goto_11

    .line 1254
    :cond_2e
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1255
    .line 1256
    .line 1257
    new-instance v11, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 1258
    .line 1259
    invoke-static {v10}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->o(Ljava/util/ArrayList;)Ljava/util/HashMap;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v20

    .line 1263
    invoke-direct/range {v11 .. v21}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;-><init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 1264
    .line 1265
    .line 1266
    return-object v11

    .line 1267
    :pswitch_47
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1268
    .line 1269
    .line 1270
    move-result v0

    .line 1271
    move-wide v14, v3

    .line 1272
    move v12, v9

    .line 1273
    move v13, v12

    .line 1274
    move/from16 v17, v13

    .line 1275
    .line 1276
    move-object/from16 v16, v10

    .line 1277
    .line 1278
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1279
    .line 1280
    .line 1281
    move-result v3

    .line 1282
    if-ge v3, v0, :cond_34

    .line 1283
    .line 1284
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1285
    .line 1286
    .line 1287
    move-result v3

    .line 1288
    int-to-char v4, v3

    .line 1289
    if-eq v4, v8, :cond_33

    .line 1290
    .line 1291
    if-eq v4, v7, :cond_32

    .line 1292
    .line 1293
    if-eq v4, v6, :cond_31

    .line 1294
    .line 1295
    if-eq v4, v5, :cond_30

    .line 1296
    .line 1297
    if-eq v4, v2, :cond_2f

    .line 1298
    .line 1299
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1300
    .line 1301
    .line 1302
    goto :goto_12

    .line 1303
    :cond_2f
    invoke-static {v1, v3}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1304
    .line 1305
    .line 1306
    move-result v3

    .line 1307
    move/from16 v17, v3

    .line 1308
    .line 1309
    goto :goto_12

    .line 1310
    :cond_30
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1311
    .line 1312
    .line 1313
    move-result v3

    .line 1314
    move v13, v3

    .line 1315
    goto :goto_12

    .line 1316
    :cond_31
    invoke-static {v1, v3}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 1317
    .line 1318
    .line 1319
    move-result-wide v3

    .line 1320
    move-wide v14, v3

    .line 1321
    goto :goto_12

    .line 1322
    :cond_32
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v3

    .line 1326
    move-object/from16 v16, v3

    .line 1327
    .line 1328
    goto :goto_12

    .line 1329
    :cond_33
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1330
    .line 1331
    .line 1332
    move-result v3

    .line 1333
    move v12, v3

    .line 1334
    goto :goto_12

    .line 1335
    :cond_34
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1336
    .line 1337
    .line 1338
    new-instance v11, Lcom/google/android/gms/common/internal/zab;

    .line 1339
    .line 1340
    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/common/internal/zab;-><init>(IIJLjava/lang/String;Z)V

    .line 1341
    .line 1342
    .line 1343
    return-object v11

    .line 1344
    :pswitch_48
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1345
    .line 1346
    .line 1347
    move-result v0

    .line 1348
    move-wide/from16 v18, v3

    .line 1349
    .line 1350
    move-object v12, v10

    .line 1351
    move-object v13, v12

    .line 1352
    move-object v14, v13

    .line 1353
    move-object v15, v14

    .line 1354
    move-object/from16 v16, v15

    .line 1355
    .line 1356
    move-object/from16 v17, v16

    .line 1357
    .line 1358
    move-object/from16 v20, v17

    .line 1359
    .line 1360
    move-object/from16 v21, v20

    .line 1361
    .line 1362
    move-object/from16 v22, v21

    .line 1363
    .line 1364
    move-object/from16 v23, v22

    .line 1365
    .line 1366
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1367
    .line 1368
    .line 1369
    move-result v2

    .line 1370
    if-ge v2, v0, :cond_35

    .line 1371
    .line 1372
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1373
    .line 1374
    .line 1375
    move-result v2

    .line 1376
    int-to-char v3, v2

    .line 1377
    packed-switch v3, :pswitch_data_7

    .line 1378
    .line 1379
    .line 1380
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1381
    .line 1382
    .line 1383
    goto :goto_13

    .line 1384
    :pswitch_49
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v2

    .line 1388
    move-object/from16 v23, v2

    .line 1389
    .line 1390
    goto :goto_13

    .line 1391
    :pswitch_4a
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v2

    .line 1395
    move-object/from16 v22, v2

    .line 1396
    .line 1397
    goto :goto_13

    .line 1398
    :pswitch_4b
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1399
    .line 1400
    invoke-static {v1, v2, v3}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v2

    .line 1404
    move-object/from16 v21, v2

    .line 1405
    .line 1406
    goto :goto_13

    .line 1407
    :pswitch_4c
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v2

    .line 1411
    move-object/from16 v20, v2

    .line 1412
    .line 1413
    goto :goto_13

    .line 1414
    :pswitch_4d
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 1415
    .line 1416
    .line 1417
    move-result-wide v2

    .line 1418
    move-wide/from16 v18, v2

    .line 1419
    .line 1420
    goto :goto_13

    .line 1421
    :pswitch_4e
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v2

    .line 1425
    move-object/from16 v17, v2

    .line 1426
    .line 1427
    goto :goto_13

    .line 1428
    :pswitch_4f
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1429
    .line 1430
    invoke-static {v1, v2, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v2

    .line 1434
    check-cast v2, Landroid/net/Uri;

    .line 1435
    .line 1436
    move-object/from16 v16, v2

    .line 1437
    .line 1438
    goto :goto_13

    .line 1439
    :pswitch_50
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v2

    .line 1443
    move-object v15, v2

    .line 1444
    goto :goto_13

    .line 1445
    :pswitch_51
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v2

    .line 1449
    move-object v14, v2

    .line 1450
    goto :goto_13

    .line 1451
    :pswitch_52
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v2

    .line 1455
    move-object v13, v2

    .line 1456
    goto :goto_13

    .line 1457
    :pswitch_53
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v2

    .line 1461
    move-object v12, v2

    .line 1462
    goto :goto_13

    .line 1463
    :cond_35
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1464
    .line 1465
    .line 1466
    new-instance v11, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 1467
    .line 1468
    invoke-direct/range {v11 .. v23}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 1469
    .line 1470
    .line 1471
    return-object v11

    .line 1472
    :pswitch_54
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1473
    .line 1474
    .line 1475
    move-result v0

    .line 1476
    move v2, v9

    .line 1477
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1478
    .line 1479
    .line 1480
    move-result v3

    .line 1481
    if-ge v3, v0, :cond_39

    .line 1482
    .line 1483
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1484
    .line 1485
    .line 1486
    move-result v3

    .line 1487
    int-to-char v4, v3

    .line 1488
    if-eq v4, v8, :cond_38

    .line 1489
    .line 1490
    if-eq v4, v7, :cond_37

    .line 1491
    .line 1492
    if-eq v4, v6, :cond_36

    .line 1493
    .line 1494
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1495
    .line 1496
    .line 1497
    goto :goto_14

    .line 1498
    :cond_36
    sget-object v4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1499
    .line 1500
    invoke-static {v1, v3, v4}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v3

    .line 1504
    move-object v10, v3

    .line 1505
    check-cast v10, Landroid/content/Intent;

    .line 1506
    .line 1507
    goto :goto_14

    .line 1508
    :cond_37
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1509
    .line 1510
    .line 1511
    move-result v2

    .line 1512
    goto :goto_14

    .line 1513
    :cond_38
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1514
    .line 1515
    .line 1516
    move-result v9

    .line 1517
    goto :goto_14

    .line 1518
    :cond_39
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1519
    .line 1520
    .line 1521
    new-instance v0, Lcom/google/android/gms/signin/internal/zaa;

    .line 1522
    .line 1523
    invoke-direct {v0, v9, v2, v10}, Lcom/google/android/gms/signin/internal/zaa;-><init>(IILandroid/content/Intent;)V

    .line 1524
    .line 1525
    .line 1526
    return-object v0

    .line 1527
    :pswitch_55
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1528
    .line 1529
    .line 1530
    move-result v0

    .line 1531
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1532
    .line 1533
    .line 1534
    move-result v2

    .line 1535
    if-ge v2, v0, :cond_3c

    .line 1536
    .line 1537
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1538
    .line 1539
    .line 1540
    move-result v2

    .line 1541
    int-to-char v3, v2

    .line 1542
    if-eq v3, v8, :cond_3b

    .line 1543
    .line 1544
    if-eq v3, v7, :cond_3a

    .line 1545
    .line 1546
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1547
    .line 1548
    .line 1549
    goto :goto_15

    .line 1550
    :cond_3a
    sget-object v3, Lcom/google/android/gms/common/internal/MethodInvocation;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1551
    .line 1552
    invoke-static {v1, v2, v3}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v10

    .line 1556
    goto :goto_15

    .line 1557
    :cond_3b
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1558
    .line 1559
    .line 1560
    move-result v9

    .line 1561
    goto :goto_15

    .line 1562
    :cond_3c
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1563
    .line 1564
    .line 1565
    new-instance v0, Lcom/google/android/gms/common/internal/TelemetryData;

    .line 1566
    .line 1567
    invoke-direct {v0, v9, v10}, Lcom/google/android/gms/common/internal/TelemetryData;-><init>(ILjava/util/List;)V

    .line 1568
    .line 1569
    .line 1570
    return-object v0

    .line 1571
    :pswitch_56
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1572
    .line 1573
    .line 1574
    move-result v0

    .line 1575
    move v12, v9

    .line 1576
    move v15, v12

    .line 1577
    move/from16 v16, v15

    .line 1578
    .line 1579
    move-object v13, v10

    .line 1580
    move-object v14, v13

    .line 1581
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1582
    .line 1583
    .line 1584
    move-result v3

    .line 1585
    if-ge v3, v0, :cond_42

    .line 1586
    .line 1587
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1588
    .line 1589
    .line 1590
    move-result v3

    .line 1591
    int-to-char v4, v3

    .line 1592
    if-eq v4, v8, :cond_41

    .line 1593
    .line 1594
    if-eq v4, v7, :cond_40

    .line 1595
    .line 1596
    if-eq v4, v6, :cond_3f

    .line 1597
    .line 1598
    if-eq v4, v5, :cond_3e

    .line 1599
    .line 1600
    if-eq v4, v2, :cond_3d

    .line 1601
    .line 1602
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1603
    .line 1604
    .line 1605
    goto :goto_16

    .line 1606
    :cond_3d
    invoke-static {v1, v3}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1607
    .line 1608
    .line 1609
    move-result v16

    .line 1610
    goto :goto_16

    .line 1611
    :cond_3e
    invoke-static {v1, v3}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1612
    .line 1613
    .line 1614
    move-result v15

    .line 1615
    goto :goto_16

    .line 1616
    :cond_3f
    sget-object v4, Lcom/google/android/gms/common/ConnectionResult;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1617
    .line 1618
    invoke-static {v1, v3, v4}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1619
    .line 1620
    .line 1621
    move-result-object v3

    .line 1622
    move-object v14, v3

    .line 1623
    check-cast v14, Lcom/google/android/gms/common/ConnectionResult;

    .line 1624
    .line 1625
    goto :goto_16

    .line 1626
    :cond_40
    invoke-static {v1, v3}, La/b5x;->V(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v13

    .line 1630
    goto :goto_16

    .line 1631
    :cond_41
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1632
    .line 1633
    .line 1634
    move-result v12

    .line 1635
    goto :goto_16

    .line 1636
    :cond_42
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1637
    .line 1638
    .line 1639
    new-instance v11, Lcom/google/android/gms/common/internal/zaaa;

    .line 1640
    .line 1641
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/common/internal/zaaa;-><init>(ILandroid/os/IBinder;Lcom/google/android/gms/common/ConnectionResult;ZZ)V

    .line 1642
    .line 1643
    .line 1644
    return-object v11

    .line 1645
    :pswitch_57
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1646
    .line 1647
    .line 1648
    move-result v0

    .line 1649
    move v2, v9

    .line 1650
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1651
    .line 1652
    .line 1653
    move-result v3

    .line 1654
    if-ge v3, v0, :cond_46

    .line 1655
    .line 1656
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1657
    .line 1658
    .line 1659
    move-result v3

    .line 1660
    int-to-char v4, v3

    .line 1661
    if-eq v4, v8, :cond_45

    .line 1662
    .line 1663
    if-eq v4, v7, :cond_44

    .line 1664
    .line 1665
    if-eq v4, v6, :cond_43

    .line 1666
    .line 1667
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1668
    .line 1669
    .line 1670
    goto :goto_17

    .line 1671
    :cond_43
    invoke-static {v1, v3}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v10

    .line 1675
    goto :goto_17

    .line 1676
    :cond_44
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1677
    .line 1678
    .line 1679
    move-result v2

    .line 1680
    goto :goto_17

    .line 1681
    :cond_45
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1682
    .line 1683
    .line 1684
    move-result v9

    .line 1685
    goto :goto_17

    .line 1686
    :cond_46
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1687
    .line 1688
    .line 1689
    new-instance v0, Lcom/google/android/gms/auth/api/signin/internal/GoogleSignInOptionsExtensionParcelable;

    .line 1690
    .line 1691
    invoke-direct {v0, v9, v2, v10}, Lcom/google/android/gms/auth/api/signin/internal/GoogleSignInOptionsExtensionParcelable;-><init>(IILandroid/os/Bundle;)V

    .line 1692
    .line 1693
    .line 1694
    return-object v0

    .line 1695
    :pswitch_58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1696
    .line 1697
    .line 1698
    new-instance v0, Lcom/yandex/authsdk/YandexAuthToken;

    .line 1699
    .line 1700
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v2

    .line 1704
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1705
    .line 1706
    .line 1707
    move-result-wide v3

    .line 1708
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1709
    .line 1710
    .line 1711
    move-result-object v1

    .line 1712
    invoke-direct {v0, v3, v4, v2, v1}, Lcom/yandex/authsdk/YandexAuthToken;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 1713
    .line 1714
    .line 1715
    return-object v0

    .line 1716
    :pswitch_59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1717
    .line 1718
    .line 1719
    new-instance v0, Lcom/yandex/authsdk/YandexAuthLoginOptions;

    .line 1720
    .line 1721
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v2

    .line 1725
    invoke-static {v2}, La/vw00;->valueOf(Ljava/lang/String;)La/vw00;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v2

    .line 1729
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v1

    .line 1733
    invoke-direct {v0, v2, v1}, Lcom/yandex/authsdk/YandexAuthLoginOptions;-><init>(La/vw00;Ljava/lang/String;)V

    .line 1734
    .line 1735
    .line 1736
    return-object v0

    .line 1737
    :pswitch_5a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1738
    .line 1739
    .line 1740
    new-instance v0, Lorg/xplatform/search/impl/presentation/xgames/models/XGamesSearchFragmentSettings;

    .line 1741
    .line 1742
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v2

    .line 1746
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v1

    .line 1750
    invoke-direct {v0, v2, v1}, Lorg/xplatform/search/impl/presentation/xgames/models/XGamesSearchFragmentSettings;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1751
    .line 1752
    .line 1753
    return-object v0

    .line 1754
    :pswitch_5b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1755
    .line 1756
    .line 1757
    new-instance v3, Lorg/xplatform/special_event/impl/who_win/presentation/model/WhoWinScreenParams;

    .line 1758
    .line 1759
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1760
    .line 1761
    .line 1762
    move-result v5

    .line 1763
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1764
    .line 1765
    .line 1766
    move-result-wide v7

    .line 1767
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1768
    .line 1769
    .line 1770
    move-result v6

    .line 1771
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v4

    .line 1775
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/special_event/impl/who_win/presentation/model/WhoWinScreenParams;-><init>(Ljava/lang/String;IIJ)V

    .line 1776
    .line 1777
    .line 1778
    return-object v3

    .line 1779
    :pswitch_5c
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1780
    .line 1781
    .line 1782
    new-instance v4, Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 1783
    .line 1784
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1785
    .line 1786
    .line 1787
    move-result-wide v5

    .line 1788
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v7

    .line 1792
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v8

    .line 1796
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v9

    .line 1800
    invoke-direct/range {v4 .. v9}, Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1801
    .line 1802
    .line 1803
    return-object v4

    .line 1804
    :pswitch_5d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1805
    .line 1806
    .line 1807
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1808
    .line 1809
    .line 1810
    move-result v0

    .line 1811
    new-instance v2, Ljava/util/ArrayList;

    .line 1812
    .line 1813
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1814
    .line 1815
    .line 1816
    :goto_18
    if-eq v9, v0, :cond_47

    .line 1817
    .line 1818
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1819
    .line 1820
    .line 1821
    move-result-wide v3

    .line 1822
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v3

    .line 1826
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1827
    .line 1828
    .line 1829
    add-int/lit8 v9, v9, 0x1

    .line 1830
    .line 1831
    goto :goto_18

    .line 1832
    :cond_47
    new-instance v0, Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;

    .line 1833
    .line 1834
    invoke-direct {v0, v2}, Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;-><init>(Ljava/util/List;)V

    .line 1835
    .line 1836
    .line 1837
    return-object v0

    .line 1838
    :pswitch_5e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1839
    .line 1840
    .line 1841
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1842
    .line 1843
    .line 1844
    move-result v0

    .line 1845
    new-instance v2, Ljava/util/ArrayList;

    .line 1846
    .line 1847
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1848
    .line 1849
    .line 1850
    :goto_19
    if-eq v9, v0, :cond_48

    .line 1851
    .line 1852
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1853
    .line 1854
    .line 1855
    move-result-wide v3

    .line 1856
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v3

    .line 1860
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1861
    .line 1862
    .line 1863
    add-int/lit8 v9, v9, 0x1

    .line 1864
    .line 1865
    goto :goto_19

    .line 1866
    :cond_48
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1867
    .line 1868
    .line 1869
    move-result v0

    .line 1870
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v3

    .line 1874
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v1

    .line 1878
    new-instance v4, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;

    .line 1879
    .line 1880
    invoke-direct {v4, v0, v3, v1, v2}, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1881
    .line 1882
    .line 1883
    return-object v4

    .line 1884
    nop

    .line 1885
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_48
        :pswitch_47
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_25
        :pswitch_24
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_e
        :pswitch_d
    .end packed-switch

    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
    .end packed-switch

    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
    .end packed-switch

    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
    .end packed-switch

    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    :pswitch_data_7
    .packed-switch 0x2
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, La/equ0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/firebase/auth/internal/zzad;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzaf;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/google/firebase/auth/internal/zzz;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/google/firebase/auth/internal/zzx;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lcom/google/android/gms/common/ConnectionResult;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/android/gms/cloudmessaging/CloudMessage;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/google/android/gms/auth/api/identity/SignInCredential;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/auth/api/identity/BeginSignInResult;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/SignInAccount;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lcom/google/android/gms/common/internal/zay;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lcom/google/android/gms/common/internal/MethodInvocation;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lcom/google/android/gms/signin/internal/zak;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcom/google/android/gms/signin/internal/zai;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/google/android/gms/signin/internal/zag;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/google/android/gms/common/internal/zab;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lcom/google/android/gms/signin/internal/zaa;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lcom/google/android/gms/common/internal/TelemetryData;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lcom/google/android/gms/common/internal/zaaa;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/internal/GoogleSignInOptionsExtensionParcelable;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/yandex/authsdk/YandexAuthToken;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/yandex/authsdk/YandexAuthLoginOptions;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lorg/xplatform/search/impl/presentation/xgames/models/XGamesSearchFragmentSettings;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lorg/xplatform/special_event/impl/who_win/presentation/model/WhoWinScreenParams;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualGameCategoryParams;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
