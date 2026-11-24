.class public final La/lgw0;
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
    iput-byte p1, p0, La/lgw0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/measurement/internal/zzbh;Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbh;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/16 v1, 0x4f45

    .line 4
    .line 5
    invoke-static {p1, v1}, La/q5x;->p0(Landroid/os/Parcel;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-static {p1, v2, v0}, La/q5x;->k0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzbh;->b:Lcom/google/android/gms/measurement/internal/zzbf;

    .line 15
    .line 16
    invoke-static {p1, v0, v2, p2}, La/q5x;->j0(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 17
    .line 18
    .line 19
    const/4 p2, 0x4

    .line 20
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbh;->c:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p1, p2, v0}, La/q5x;->k0(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzbh;->d:J

    .line 26
    .line 27
    const/4 p2, 0x5

    .line 28
    const/16 v0, 0x8

    .line 29
    .line 30
    invoke-static {p1, p2, v0}, La/q5x;->o0(Landroid/os/Parcel;II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 34
    .line 35
    .line 36
    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/zzbh;->e:J

    .line 37
    .line 38
    const/4 p0, 0x6

    .line 39
    invoke-static {p1, p0, v0}, La/q5x;->o0(Landroid/os/Parcel;II)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v1}, La/q5x;->q0(Landroid/os/Parcel;I)V

    .line 46
    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v0, v0, La/lgw0;->a:B

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    const/4 v3, 0x5

    .line 9
    const-wide/16 v4, 0x0

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x4

    .line 13
    const/4 v8, 0x3

    .line 14
    const/4 v9, 0x2

    .line 15
    const/4 v10, 0x1

    .line 16
    const/4 v11, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    move-object v2, v11

    .line 25
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-ge v3, v0, :cond_3

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    int-to-char v4, v3

    .line 36
    if-eq v4, v10, :cond_2

    .line 37
    .line 38
    if-eq v4, v9, :cond_1

    .line 39
    .line 40
    if-eq v4, v8, :cond_0

    .line 41
    .line 42
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    sget-object v2, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 47
    .line 48
    invoke-static {v1, v3, v2}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, Landroid/content/Intent;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-static {v1, v3}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdd;

    .line 69
    .line 70
    invoke-direct {v0, v6, v11, v2}, Lcom/google/android/gms/internal/measurement/zzdd;-><init>(ILjava/lang/String;Landroid/content/Intent;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_0
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    move-wide v13, v4

    .line 79
    move-wide v15, v13

    .line 80
    move/from16 v17, v6

    .line 81
    .line 82
    move-object/from16 v18, v11

    .line 83
    .line 84
    move-object/from16 v19, v18

    .line 85
    .line 86
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-ge v2, v0, :cond_9

    .line 91
    .line 92
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    int-to-char v3, v2

    .line 97
    if-eq v3, v10, :cond_8

    .line 98
    .line 99
    if-eq v3, v9, :cond_7

    .line 100
    .line 101
    if-eq v3, v8, :cond_6

    .line 102
    .line 103
    const/4 v4, 0x7

    .line 104
    if-eq v3, v4, :cond_5

    .line 105
    .line 106
    const/16 v4, 0x8

    .line 107
    .line 108
    if-eq v3, v4, :cond_4

    .line 109
    .line 110
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    move-object/from16 v19, v2

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_5
    invoke-static {v1, v2}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    move-object/from16 v18, v2

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_6
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    move/from16 v17, v2

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_7
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 136
    .line 137
    .line 138
    move-result-wide v2

    .line 139
    move-wide v15, v2

    .line 140
    goto :goto_1

    .line 141
    :cond_8
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 142
    .line 143
    .line 144
    move-result-wide v2

    .line 145
    move-wide v13, v2

    .line 146
    goto :goto_1

    .line 147
    :cond_9
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 148
    .line 149
    .line 150
    new-instance v12, Lcom/google/android/gms/internal/measurement/zzdb;

    .line 151
    .line 152
    invoke-direct/range {v12 .. v19}, Lcom/google/android/gms/internal/measurement/zzdb;-><init>(JJZLandroid/os/Bundle;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-object v12

    .line 156
    :pswitch_1
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-ge v2, v0, :cond_c

    .line 165
    .line 166
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    int-to-char v3, v2

    .line 171
    if-eq v3, v10, :cond_b

    .line 172
    .line 173
    if-eq v3, v9, :cond_a

    .line 174
    .line 175
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_a
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    goto :goto_2

    .line 184
    :cond_b
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    goto :goto_2

    .line 189
    :cond_c
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    .line 193
    .line 194
    invoke-direct {v0, v6, v11}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_2
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    move-object v13, v11

    .line 203
    move-object v14, v13

    .line 204
    move-object v15, v14

    .line 205
    move-object/from16 v16, v15

    .line 206
    .line 207
    move-object/from16 v17, v16

    .line 208
    .line 209
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-ge v2, v0, :cond_12

    .line 214
    .line 215
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    int-to-char v4, v2

    .line 220
    if-eq v4, v10, :cond_11

    .line 221
    .line 222
    if-eq v4, v9, :cond_10

    .line 223
    .line 224
    if-eq v4, v8, :cond_f

    .line 225
    .line 226
    if-eq v4, v7, :cond_e

    .line 227
    .line 228
    if-eq v4, v3, :cond_d

    .line 229
    .line 230
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_d
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v17

    .line 238
    goto :goto_3

    .line 239
    :cond_e
    sget-object v4, Lcom/google/android/gms/fido/fido2/api/common/zzh;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 240
    .line 241
    invoke-static {v1, v2, v4}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    move-object/from16 v16, v2

    .line 246
    .line 247
    check-cast v16, Lcom/google/android/gms/fido/fido2/api/common/zzh;

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_f
    sget-object v4, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsCredPropsOutputs;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 251
    .line 252
    invoke-static {v1, v2, v4}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    move-object v15, v2

    .line 257
    check-cast v15, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsCredPropsOutputs;

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_10
    sget-object v4, Lcom/google/android/gms/fido/fido2/api/common/zzf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 261
    .line 262
    invoke-static {v1, v2, v4}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    move-object v14, v2

    .line 267
    check-cast v14, Lcom/google/android/gms/fido/fido2/api/common/zzf;

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_11
    sget-object v4, Lcom/google/android/gms/fido/fido2/api/common/UvmEntries;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 271
    .line 272
    invoke-static {v1, v2, v4}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    move-object v13, v2

    .line 277
    check-cast v13, Lcom/google/android/gms/fido/fido2/api/common/UvmEntries;

    .line 278
    .line 279
    goto :goto_3

    .line 280
    :cond_12
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 281
    .line 282
    .line 283
    new-instance v12, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;

    .line 284
    .line 285
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;-><init>(Lcom/google/android/gms/fido/fido2/api/common/UvmEntries;Lcom/google/android/gms/fido/fido2/api/common/zzf;Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsCredPropsOutputs;Lcom/google/android/gms/fido/fido2/api/common/zzh;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    return-object v12

    .line 289
    :pswitch_3
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    move v2, v6

    .line 294
    move v3, v2

    .line 295
    move v4, v10

    .line 296
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 297
    .line 298
    .line 299
    move-result v5

    .line 300
    if-ge v5, v0, :cond_17

    .line 301
    .line 302
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    int-to-char v11, v5

    .line 307
    if-eq v11, v10, :cond_16

    .line 308
    .line 309
    if-eq v11, v9, :cond_15

    .line 310
    .line 311
    if-eq v11, v8, :cond_14

    .line 312
    .line 313
    if-eq v11, v7, :cond_13

    .line 314
    .line 315
    invoke-static {v1, v5}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 316
    .line 317
    .line 318
    goto :goto_4

    .line 319
    :cond_13
    invoke-static {v1, v5}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    goto :goto_4

    .line 324
    :cond_14
    invoke-static {v1, v5}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    goto :goto_4

    .line 329
    :cond_15
    invoke-static {v1, v5}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 330
    .line 331
    .line 332
    move-result v2

    .line 333
    goto :goto_4

    .line 334
    :cond_16
    invoke-static {v1, v5}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    goto :goto_4

    .line 339
    :cond_17
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 340
    .line 341
    .line 342
    new-instance v0, Lcom/google/android/gms/common/api/ComplianceOptions;

    .line 343
    .line 344
    invoke-direct {v0, v6, v2, v3, v4}, Lcom/google/android/gms/common/api/ComplianceOptions;-><init>(IIIZ)V

    .line 345
    .line 346
    .line 347
    return-object v0

    .line 348
    :pswitch_4
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    move-object v2, v11

    .line 353
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 354
    .line 355
    .line 356
    move-result v3

    .line 357
    if-ge v3, v0, :cond_1a

    .line 358
    .line 359
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    int-to-char v4, v3

    .line 364
    if-eq v4, v10, :cond_19

    .line 365
    .line 366
    if-eq v4, v9, :cond_18

    .line 367
    .line 368
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 369
    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_18
    sget-object v2, Lcom/google/firebase/auth/TotpMultiFactorInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 373
    .line 374
    invoke-static {v1, v3, v2}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    goto :goto_5

    .line 379
    :cond_19
    sget-object v4, Lcom/google/firebase/auth/PhoneMultiFactorInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 380
    .line 381
    invoke-static {v1, v3, v4}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 382
    .line 383
    .line 384
    move-result-object v11

    .line 385
    goto :goto_5

    .line 386
    :cond_1a
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 387
    .line 388
    .line 389
    new-instance v0, Lcom/google/firebase/auth/internal/zzbl;

    .line 390
    .line 391
    invoke-direct {v0, v11, v2}, Lcom/google/firebase/auth/internal/zzbl;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 392
    .line 393
    .line 394
    return-object v0

    .line 395
    :pswitch_5
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    move-wide/from16 v16, v4

    .line 400
    .line 401
    move-wide/from16 v18, v16

    .line 402
    .line 403
    move-object v13, v11

    .line 404
    move-object v14, v13

    .line 405
    move-object v15, v14

    .line 406
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 407
    .line 408
    .line 409
    move-result v4

    .line 410
    if-ge v4, v0, :cond_20

    .line 411
    .line 412
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    int-to-char v5, v4

    .line 417
    if-eq v5, v9, :cond_1f

    .line 418
    .line 419
    if-eq v5, v8, :cond_1e

    .line 420
    .line 421
    if-eq v5, v7, :cond_1d

    .line 422
    .line 423
    if-eq v5, v3, :cond_1c

    .line 424
    .line 425
    if-eq v5, v2, :cond_1b

    .line 426
    .line 427
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 428
    .line 429
    .line 430
    goto :goto_6

    .line 431
    :cond_1b
    invoke-static {v1, v4}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 432
    .line 433
    .line 434
    move-result-wide v4

    .line 435
    move-wide/from16 v18, v4

    .line 436
    .line 437
    goto :goto_6

    .line 438
    :cond_1c
    invoke-static {v1, v4}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 439
    .line 440
    .line 441
    move-result-wide v4

    .line 442
    move-wide/from16 v16, v4

    .line 443
    .line 444
    goto :goto_6

    .line 445
    :cond_1d
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    move-object v15, v4

    .line 450
    goto :goto_6

    .line 451
    :cond_1e
    sget-object v5, Lcom/google/android/gms/measurement/internal/zzbf;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 452
    .line 453
    invoke-static {v1, v4, v5}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    check-cast v4, Lcom/google/android/gms/measurement/internal/zzbf;

    .line 458
    .line 459
    move-object v14, v4

    .line 460
    goto :goto_6

    .line 461
    :cond_1f
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    move-object v13, v4

    .line 466
    goto :goto_6

    .line 467
    :cond_20
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 468
    .line 469
    .line 470
    new-instance v12, Lcom/google/android/gms/measurement/internal/zzbh;

    .line 471
    .line 472
    invoke-direct/range {v12 .. v19}, Lcom/google/android/gms/measurement/internal/zzbh;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbf;Ljava/lang/String;JJ)V

    .line 473
    .line 474
    .line 475
    return-object v12

    .line 476
    :pswitch_6
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    if-ge v2, v0, :cond_22

    .line 485
    .line 486
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    int-to-char v3, v2

    .line 491
    if-eq v3, v9, :cond_21

    .line 492
    .line 493
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 494
    .line 495
    .line 496
    goto :goto_7

    .line 497
    :cond_21
    invoke-static {v1, v2}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 498
    .line 499
    .line 500
    move-result-object v11

    .line 501
    goto :goto_7

    .line 502
    :cond_22
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 503
    .line 504
    .line 505
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzbf;

    .line 506
    .line 507
    invoke-direct {v0, v11}, Lcom/google/android/gms/measurement/internal/zzbf;-><init>(Landroid/os/Bundle;)V

    .line 508
    .line 509
    .line 510
    return-object v0

    .line 511
    :pswitch_7
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    move v2, v6

    .line 516
    move v3, v2

    .line 517
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 518
    .line 519
    .line 520
    move-result v4

    .line 521
    if-ge v4, v0, :cond_26

    .line 522
    .line 523
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 524
    .line 525
    .line 526
    move-result v4

    .line 527
    int-to-char v5, v4

    .line 528
    if-eq v5, v10, :cond_25

    .line 529
    .line 530
    if-eq v5, v9, :cond_24

    .line 531
    .line 532
    if-eq v5, v8, :cond_23

    .line 533
    .line 534
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 535
    .line 536
    .line 537
    goto :goto_8

    .line 538
    :cond_23
    invoke-static {v1, v4, v7}, La/b5x;->j0(Landroid/os/Parcel;II)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    int-to-short v3, v3

    .line 546
    goto :goto_8

    .line 547
    :cond_24
    invoke-static {v1, v4, v7}, La/b5x;->j0(Landroid/os/Parcel;II)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 551
    .line 552
    .line 553
    move-result v2

    .line 554
    int-to-short v2, v2

    .line 555
    goto :goto_8

    .line 556
    :cond_25
    invoke-static {v1, v4}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 557
    .line 558
    .line 559
    move-result v6

    .line 560
    goto :goto_8

    .line 561
    :cond_26
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 562
    .line 563
    .line 564
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/UvmEntry;

    .line 565
    .line 566
    invoke-direct {v0, v6, v2, v3}, Lcom/google/android/gms/fido/fido2/api/common/UvmEntry;-><init>(ISS)V

    .line 567
    .line 568
    .line 569
    return-object v0

    .line 570
    :pswitch_8
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 575
    .line 576
    .line 577
    move-result v2

    .line 578
    if-ge v2, v0, :cond_28

    .line 579
    .line 580
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    int-to-char v3, v2

    .line 585
    if-eq v3, v10, :cond_27

    .line 586
    .line 587
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 588
    .line 589
    .line 590
    goto :goto_9

    .line 591
    :cond_27
    sget-object v3, Lcom/google/android/gms/fido/fido2/api/common/UvmEntry;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 592
    .line 593
    invoke-static {v1, v2, v3}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 594
    .line 595
    .line 596
    move-result-object v11

    .line 597
    goto :goto_9

    .line 598
    :cond_28
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 599
    .line 600
    .line 601
    new-instance v0, Lcom/google/android/gms/fido/fido2/api/common/UvmEntries;

    .line 602
    .line 603
    invoke-direct {v0, v11}, Lcom/google/android/gms/fido/fido2/api/common/UvmEntries;-><init>(Ljava/util/ArrayList;)V

    .line 604
    .line 605
    .line 606
    return-object v0

    .line 607
    :pswitch_9
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    const-wide/16 v2, -0x1

    .line 612
    .line 613
    move-wide v14, v2

    .line 614
    move v13, v6

    .line 615
    move/from16 v17, v13

    .line 616
    .line 617
    move-object/from16 v16, v11

    .line 618
    .line 619
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 620
    .line 621
    .line 622
    move-result v2

    .line 623
    if-ge v2, v0, :cond_2d

    .line 624
    .line 625
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    int-to-char v3, v2

    .line 630
    if-eq v3, v10, :cond_2c

    .line 631
    .line 632
    if-eq v3, v9, :cond_2b

    .line 633
    .line 634
    if-eq v3, v8, :cond_2a

    .line 635
    .line 636
    if-eq v3, v7, :cond_29

    .line 637
    .line 638
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 639
    .line 640
    .line 641
    goto :goto_a

    .line 642
    :cond_29
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    move/from16 v17, v2

    .line 647
    .line 648
    goto :goto_a

    .line 649
    :cond_2a
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 650
    .line 651
    .line 652
    move-result-wide v2

    .line 653
    move-wide v14, v2

    .line 654
    goto :goto_a

    .line 655
    :cond_2b
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 656
    .line 657
    .line 658
    move-result v2

    .line 659
    move v13, v2

    .line 660
    goto :goto_a

    .line 661
    :cond_2c
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    move-object/from16 v16, v2

    .line 666
    .line 667
    goto :goto_a

    .line 668
    :cond_2d
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 669
    .line 670
    .line 671
    new-instance v12, Lcom/google/android/gms/common/Feature;

    .line 672
    .line 673
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/common/Feature;-><init>(IJLjava/lang/String;Z)V

    .line 674
    .line 675
    .line 676
    return-object v12

    .line 677
    :pswitch_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    new-instance v1, Lcom/google/android/gms/cloudmessaging/zzd;

    .line 682
    .line 683
    invoke-direct {v1, v0}, Lcom/google/android/gms/cloudmessaging/zzd;-><init>(Landroid/os/IBinder;)V

    .line 684
    .line 685
    .line 686
    return-object v1

    .line 687
    :pswitch_b
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    move-object v2, v11

    .line 692
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 693
    .line 694
    .line 695
    move-result v3

    .line 696
    if-ge v3, v0, :cond_30

    .line 697
    .line 698
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 699
    .line 700
    .line 701
    move-result v3

    .line 702
    int-to-char v4, v3

    .line 703
    if-eq v4, v10, :cond_2f

    .line 704
    .line 705
    if-eq v4, v9, :cond_2e

    .line 706
    .line 707
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 708
    .line 709
    .line 710
    goto :goto_b

    .line 711
    :cond_2e
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    goto :goto_b

    .line 716
    :cond_2f
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v11

    .line 720
    goto :goto_b

    .line 721
    :cond_30
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 722
    .line 723
    .line 724
    new-instance v0, Lcom/google/firebase/auth/TwitterAuthCredential;

    .line 725
    .line 726
    invoke-direct {v0, v11, v2}, Lcom/google/firebase/auth/TwitterAuthCredential;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    return-object v0

    .line 730
    :pswitch_c
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 731
    .line 732
    .line 733
    move-result v0

    .line 734
    move-wide v15, v4

    .line 735
    move-object v13, v11

    .line 736
    move-object v14, v13

    .line 737
    move-object/from16 v17, v14

    .line 738
    .line 739
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 740
    .line 741
    .line 742
    move-result v2

    .line 743
    if-ge v2, v0, :cond_35

    .line 744
    .line 745
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 746
    .line 747
    .line 748
    move-result v2

    .line 749
    int-to-char v3, v2

    .line 750
    if-eq v3, v10, :cond_34

    .line 751
    .line 752
    if-eq v3, v9, :cond_33

    .line 753
    .line 754
    if-eq v3, v8, :cond_32

    .line 755
    .line 756
    if-eq v3, v7, :cond_31

    .line 757
    .line 758
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 759
    .line 760
    .line 761
    goto :goto_c

    .line 762
    :cond_31
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzaje;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 763
    .line 764
    invoke-static {v1, v2, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 765
    .line 766
    .line 767
    move-result-object v2

    .line 768
    move-object/from16 v17, v2

    .line 769
    .line 770
    check-cast v17, Lcom/google/android/gms/internal/firebase-auth-api/zzaje;

    .line 771
    .line 772
    goto :goto_c

    .line 773
    :cond_32
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 774
    .line 775
    .line 776
    move-result-wide v15

    .line 777
    goto :goto_c

    .line 778
    :cond_33
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v14

    .line 782
    goto :goto_c

    .line 783
    :cond_34
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v13

    .line 787
    goto :goto_c

    .line 788
    :cond_35
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 789
    .line 790
    .line 791
    new-instance v12, Lcom/google/firebase/auth/TotpMultiFactorInfo;

    .line 792
    .line 793
    invoke-direct/range {v12 .. v17}, Lcom/google/firebase/auth/TotpMultiFactorInfo;-><init>(Ljava/lang/String;Ljava/lang/String;JLcom/google/android/gms/internal/firebase-auth-api/zzaje;)V

    .line 794
    .line 795
    .line 796
    return-object v12

    .line 797
    :pswitch_d
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 798
    .line 799
    .line 800
    move-result v0

    .line 801
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 802
    .line 803
    .line 804
    move-result v2

    .line 805
    if-ge v2, v0, :cond_37

    .line 806
    .line 807
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 808
    .line 809
    .line 810
    move-result v2

    .line 811
    int-to-char v3, v2

    .line 812
    if-eq v3, v10, :cond_36

    .line 813
    .line 814
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 815
    .line 816
    .line 817
    goto :goto_d

    .line 818
    :cond_36
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v11

    .line 822
    goto :goto_d

    .line 823
    :cond_37
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 824
    .line 825
    .line 826
    new-instance v0, Lcom/google/firebase/auth/PlayGamesAuthCredential;

    .line 827
    .line 828
    invoke-direct {v0, v11}, Lcom/google/firebase/auth/PlayGamesAuthCredential;-><init>(Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    return-object v0

    .line 832
    :pswitch_e
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 833
    .line 834
    .line 835
    move-result v0

    .line 836
    move-wide v13, v4

    .line 837
    move-object v15, v11

    .line 838
    move-object/from16 v16, v15

    .line 839
    .line 840
    move-object/from16 v17, v16

    .line 841
    .line 842
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 843
    .line 844
    .line 845
    move-result v2

    .line 846
    if-ge v2, v0, :cond_3c

    .line 847
    .line 848
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 849
    .line 850
    .line 851
    move-result v2

    .line 852
    int-to-char v3, v2

    .line 853
    if-eq v3, v10, :cond_3b

    .line 854
    .line 855
    if-eq v3, v9, :cond_3a

    .line 856
    .line 857
    if-eq v3, v8, :cond_39

    .line 858
    .line 859
    if-eq v3, v7, :cond_38

    .line 860
    .line 861
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 862
    .line 863
    .line 864
    goto :goto_e

    .line 865
    :cond_38
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v17

    .line 869
    goto :goto_e

    .line 870
    :cond_39
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 871
    .line 872
    .line 873
    move-result-wide v13

    .line 874
    goto :goto_e

    .line 875
    :cond_3a
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v16

    .line 879
    goto :goto_e

    .line 880
    :cond_3b
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v15

    .line 884
    goto :goto_e

    .line 885
    :cond_3c
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 886
    .line 887
    .line 888
    new-instance v12, Lcom/google/firebase/auth/PhoneMultiFactorInfo;

    .line 889
    .line 890
    invoke-direct/range {v12 .. v17}, Lcom/google/firebase/auth/PhoneMultiFactorInfo;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    return-object v12

    .line 894
    :pswitch_f
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 895
    .line 896
    .line 897
    move-result v0

    .line 898
    move/from16 v16, v6

    .line 899
    .line 900
    move-object v13, v11

    .line 901
    move-object v14, v13

    .line 902
    move-object v15, v14

    .line 903
    move-object/from16 v17, v15

    .line 904
    .line 905
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 906
    .line 907
    .line 908
    move-result v4

    .line 909
    if-ge v4, v0, :cond_42

    .line 910
    .line 911
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 912
    .line 913
    .line 914
    move-result v4

    .line 915
    int-to-char v5, v4

    .line 916
    if-eq v5, v10, :cond_41

    .line 917
    .line 918
    if-eq v5, v9, :cond_40

    .line 919
    .line 920
    if-eq v5, v7, :cond_3f

    .line 921
    .line 922
    if-eq v5, v3, :cond_3e

    .line 923
    .line 924
    if-eq v5, v2, :cond_3d

    .line 925
    .line 926
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 927
    .line 928
    .line 929
    goto :goto_f

    .line 930
    :cond_3d
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v17

    .line 934
    goto :goto_f

    .line 935
    :cond_3e
    invoke-static {v1, v4}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 936
    .line 937
    .line 938
    move-result v16

    .line 939
    goto :goto_f

    .line 940
    :cond_3f
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v15

    .line 944
    goto :goto_f

    .line 945
    :cond_40
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v14

    .line 949
    goto :goto_f

    .line 950
    :cond_41
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 951
    .line 952
    .line 953
    move-result-object v13

    .line 954
    goto :goto_f

    .line 955
    :cond_42
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 956
    .line 957
    .line 958
    new-instance v12, Lcom/google/firebase/auth/PhoneAuthCredential;

    .line 959
    .line 960
    invoke-direct/range {v12 .. v17}, Lcom/google/firebase/auth/PhoneAuthCredential;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 961
    .line 962
    .line 963
    return-object v12

    .line 964
    :pswitch_10
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 965
    .line 966
    .line 967
    move-result v0

    .line 968
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 969
    .line 970
    .line 971
    move-result v2

    .line 972
    if-ge v2, v0, :cond_44

    .line 973
    .line 974
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 975
    .line 976
    .line 977
    move-result v2

    .line 978
    int-to-char v3, v2

    .line 979
    if-eq v3, v10, :cond_43

    .line 980
    .line 981
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 982
    .line 983
    .line 984
    goto :goto_10

    .line 985
    :cond_43
    invoke-static {v1, v2}, La/b5x;->y(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 986
    .line 987
    .line 988
    move-result-object v11

    .line 989
    goto :goto_10

    .line 990
    :cond_44
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 991
    .line 992
    .line 993
    new-instance v0, Lcom/google/android/gms/measurement/internal/zzao;

    .line 994
    .line 995
    invoke-direct {v0, v11}, Lcom/google/android/gms/measurement/internal/zzao;-><init>(Landroid/os/Bundle;)V

    .line 996
    .line 997
    .line 998
    return-object v0

    .line 999
    :pswitch_11
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1000
    .line 1001
    .line 1002
    move-result v0

    .line 1003
    move-object v2, v11

    .line 1004
    move-object v3, v2

    .line 1005
    move-object v4, v3

    .line 1006
    move-object v5, v4

    .line 1007
    move-object v6, v5

    .line 1008
    move-object v7, v6

    .line 1009
    move-object v8, v7

    .line 1010
    move-object v9, v8

    .line 1011
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1012
    .line 1013
    .line 1014
    move-result v10

    .line 1015
    if-ge v10, v0, :cond_45

    .line 1016
    .line 1017
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1018
    .line 1019
    .line 1020
    move-result v10

    .line 1021
    int-to-char v11, v10

    .line 1022
    packed-switch v11, :pswitch_data_1

    .line 1023
    .line 1024
    .line 1025
    invoke-static {v1, v10}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1026
    .line 1027
    .line 1028
    goto :goto_11

    .line 1029
    :pswitch_12
    invoke-static {v1, v10}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    goto :goto_11

    .line 1033
    :pswitch_13
    invoke-static {v1, v10}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v9

    .line 1037
    goto :goto_11

    .line 1038
    :pswitch_14
    sget-object v8, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1039
    .line 1040
    invoke-static {v1, v10, v8}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v8

    .line 1044
    check-cast v8, Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;

    .line 1045
    .line 1046
    goto :goto_11

    .line 1047
    :pswitch_15
    sget-object v7, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1048
    .line 1049
    invoke-static {v1, v10, v7}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v7

    .line 1053
    check-cast v7, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;

    .line 1054
    .line 1055
    goto :goto_11

    .line 1056
    :pswitch_16
    sget-object v6, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1057
    .line 1058
    invoke-static {v1, v10, v6}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v6

    .line 1062
    check-cast v6, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;

    .line 1063
    .line 1064
    goto :goto_11

    .line 1065
    :pswitch_17
    sget-object v5, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1066
    .line 1067
    invoke-static {v1, v10, v5}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v5

    .line 1071
    check-cast v5, Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;

    .line 1072
    .line 1073
    goto :goto_11

    .line 1074
    :pswitch_18
    invoke-static {v1, v10}, La/b5x;->z(Landroid/os/Parcel;I)[B

    .line 1075
    .line 1076
    .line 1077
    move-result-object v4

    .line 1078
    goto :goto_11

    .line 1079
    :pswitch_19
    invoke-static {v1, v10}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v3

    .line 1083
    goto :goto_11

    .line 1084
    :pswitch_1a
    invoke-static {v1, v10}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v2

    .line 1088
    goto :goto_11

    .line 1089
    :cond_45
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1090
    .line 1091
    .line 1092
    new-instance v1, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;

    .line 1093
    .line 1094
    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;-><init>(Ljava/lang/String;Ljava/lang/String;[BLcom/google/android/gms/fido/fido2/api/common/AuthenticatorAttestationResponse;Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorAssertionResponse;Lcom/google/android/gms/fido/fido2/api/common/AuthenticatorErrorResponse;Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;Ljava/lang/String;)V

    .line 1095
    .line 1096
    .line 1097
    return-object v1

    .line 1098
    :pswitch_1b
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1099
    .line 1100
    .line 1101
    move-result v0

    .line 1102
    move-object v2, v11

    .line 1103
    move-object v4, v2

    .line 1104
    move-object v5, v4

    .line 1105
    move-object v6, v5

    .line 1106
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1107
    .line 1108
    .line 1109
    move-result v12

    .line 1110
    if-ge v12, v0, :cond_4b

    .line 1111
    .line 1112
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1113
    .line 1114
    .line 1115
    move-result v12

    .line 1116
    int-to-char v13, v12

    .line 1117
    if-eq v13, v10, :cond_4a

    .line 1118
    .line 1119
    if-eq v13, v9, :cond_49

    .line 1120
    .line 1121
    if-eq v13, v8, :cond_48

    .line 1122
    .line 1123
    if-eq v13, v7, :cond_47

    .line 1124
    .line 1125
    if-eq v13, v3, :cond_46

    .line 1126
    .line 1127
    invoke-static {v1, v12}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1128
    .line 1129
    .line 1130
    goto :goto_12

    .line 1131
    :cond_46
    sget-object v6, Lcom/google/firebase/auth/internal/zzad;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1132
    .line 1133
    invoke-static {v1, v12, v6}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v6

    .line 1137
    check-cast v6, Lcom/google/firebase/auth/internal/zzad;

    .line 1138
    .line 1139
    goto :goto_12

    .line 1140
    :cond_47
    sget-object v5, Lcom/google/firebase/auth/TotpMultiFactorInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1141
    .line 1142
    invoke-static {v1, v12, v5}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v5

    .line 1146
    goto :goto_12

    .line 1147
    :cond_48
    sget-object v4, Lcom/google/firebase/auth/PhoneMultiFactorInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1148
    .line 1149
    invoke-static {v1, v12, v4}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v4

    .line 1153
    goto :goto_12

    .line 1154
    :cond_49
    invoke-static {v1, v12}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v2

    .line 1158
    goto :goto_12

    .line 1159
    :cond_4a
    invoke-static {v1, v12}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v11

    .line 1163
    goto :goto_12

    .line 1164
    :cond_4b
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1165
    .line 1166
    .line 1167
    new-instance v0, Lcom/google/firebase/auth/internal/zzao;

    .line 1168
    .line 1169
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1170
    .line 1171
    .line 1172
    iput-object v11, v0, Lcom/google/firebase/auth/internal/zzao;->a:Ljava/lang/String;

    .line 1173
    .line 1174
    iput-object v2, v0, Lcom/google/firebase/auth/internal/zzao;->b:Ljava/lang/String;

    .line 1175
    .line 1176
    iput-object v4, v0, Lcom/google/firebase/auth/internal/zzao;->c:Ljava/util/ArrayList;

    .line 1177
    .line 1178
    iput-object v5, v0, Lcom/google/firebase/auth/internal/zzao;->d:Ljava/util/ArrayList;

    .line 1179
    .line 1180
    iput-object v6, v0, Lcom/google/firebase/auth/internal/zzao;->e:Lcom/google/firebase/auth/internal/zzad;

    .line 1181
    .line 1182
    return-object v0

    .line 1183
    :pswitch_1c
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1184
    .line 1185
    .line 1186
    move-result v0

    .line 1187
    move-object v2, v11

    .line 1188
    move-object v3, v2

    .line 1189
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1190
    .line 1191
    .line 1192
    move-result v4

    .line 1193
    if-ge v4, v0, :cond_4f

    .line 1194
    .line 1195
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1196
    .line 1197
    .line 1198
    move-result v4

    .line 1199
    int-to-char v5, v4

    .line 1200
    if-eq v5, v10, :cond_4e

    .line 1201
    .line 1202
    if-eq v5, v9, :cond_4d

    .line 1203
    .line 1204
    if-eq v5, v8, :cond_4c

    .line 1205
    .line 1206
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1207
    .line 1208
    .line 1209
    goto :goto_13

    .line 1210
    :cond_4c
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v3

    .line 1214
    goto :goto_13

    .line 1215
    :cond_4d
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v2

    .line 1219
    goto :goto_13

    .line 1220
    :cond_4e
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v11

    .line 1224
    goto :goto_13

    .line 1225
    :cond_4f
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1226
    .line 1227
    .line 1228
    new-instance v0, Lcom/google/firebase/auth/zzao;

    .line 1229
    .line 1230
    invoke-direct {v0, v11, v2, v3}, Lcom/google/firebase/auth/zzao;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1231
    .line 1232
    .line 1233
    return-object v0

    .line 1234
    :pswitch_1d
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1235
    .line 1236
    .line 1237
    move-result v0

    .line 1238
    move-object v2, v11

    .line 1239
    move-object v3, v2

    .line 1240
    move-object v4, v3

    .line 1241
    move-object v5, v4

    .line 1242
    move-object v6, v5

    .line 1243
    move-object v7, v6

    .line 1244
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1245
    .line 1246
    .line 1247
    move-result v8

    .line 1248
    if-ge v8, v0, :cond_50

    .line 1249
    .line 1250
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1251
    .line 1252
    .line 1253
    move-result v8

    .line 1254
    int-to-char v9, v8

    .line 1255
    packed-switch v9, :pswitch_data_2

    .line 1256
    .line 1257
    .line 1258
    invoke-static {v1, v8}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1259
    .line 1260
    .line 1261
    goto :goto_14

    .line 1262
    :pswitch_1e
    sget-object v7, Lcom/google/firebase/auth/TotpMultiFactorInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1263
    .line 1264
    invoke-static {v1, v8, v7}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v7

    .line 1268
    goto :goto_14

    .line 1269
    :pswitch_1f
    sget-object v6, Lcom/google/firebase/auth/internal/zzad;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1270
    .line 1271
    invoke-static {v1, v8, v6}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v6

    .line 1275
    check-cast v6, Lcom/google/firebase/auth/internal/zzad;

    .line 1276
    .line 1277
    goto :goto_14

    .line 1278
    :pswitch_20
    sget-object v5, Lcom/google/firebase/auth/zzc;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1279
    .line 1280
    invoke-static {v1, v8, v5}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v5

    .line 1284
    check-cast v5, Lcom/google/firebase/auth/zzc;

    .line 1285
    .line 1286
    goto :goto_14

    .line 1287
    :pswitch_21
    invoke-static {v1, v8}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v4

    .line 1291
    goto :goto_14

    .line 1292
    :pswitch_22
    sget-object v3, Lcom/google/firebase/auth/internal/zzao;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1293
    .line 1294
    invoke-static {v1, v8, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v3

    .line 1298
    check-cast v3, Lcom/google/firebase/auth/internal/zzao;

    .line 1299
    .line 1300
    goto :goto_14

    .line 1301
    :pswitch_23
    sget-object v2, Lcom/google/firebase/auth/PhoneMultiFactorInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1302
    .line 1303
    invoke-static {v1, v8, v2}, La/b5x;->G(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v2

    .line 1307
    goto :goto_14

    .line 1308
    :cond_50
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1309
    .line 1310
    .line 1311
    new-instance v1, Lcom/google/firebase/auth/internal/zzaj;

    .line 1312
    .line 1313
    invoke-direct/range {v1 .. v7}, Lcom/google/firebase/auth/internal/zzaj;-><init>(Ljava/util/ArrayList;Lcom/google/firebase/auth/internal/zzao;Ljava/lang/String;Lcom/google/firebase/auth/zzc;Lcom/google/firebase/auth/internal/zzad;Ljava/util/ArrayList;)V

    .line 1314
    .line 1315
    .line 1316
    return-object v1

    .line 1317
    :pswitch_24
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1318
    .line 1319
    .line 1320
    move-result v0

    .line 1321
    move-object v2, v11

    .line 1322
    :goto_15
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1323
    .line 1324
    .line 1325
    move-result v3

    .line 1326
    if-ge v3, v0, :cond_53

    .line 1327
    .line 1328
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1329
    .line 1330
    .line 1331
    move-result v3

    .line 1332
    int-to-char v4, v3

    .line 1333
    if-eq v4, v10, :cond_52

    .line 1334
    .line 1335
    if-eq v4, v9, :cond_51

    .line 1336
    .line 1337
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1338
    .line 1339
    .line 1340
    goto :goto_15

    .line 1341
    :cond_51
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v2

    .line 1345
    goto :goto_15

    .line 1346
    :cond_52
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v11

    .line 1350
    goto :goto_15

    .line 1351
    :cond_53
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1352
    .line 1353
    .line 1354
    new-instance v0, Lcom/google/firebase/auth/GoogleAuthCredential;

    .line 1355
    .line 1356
    invoke-direct {v0, v11, v2}, Lcom/google/firebase/auth/GoogleAuthCredential;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1357
    .line 1358
    .line 1359
    return-object v0

    .line 1360
    :pswitch_25
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1361
    .line 1362
    .line 1363
    move-result v0

    .line 1364
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1365
    .line 1366
    .line 1367
    move-result v2

    .line 1368
    if-ge v2, v0, :cond_55

    .line 1369
    .line 1370
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1371
    .line 1372
    .line 1373
    move-result v2

    .line 1374
    int-to-char v3, v2

    .line 1375
    if-eq v3, v10, :cond_54

    .line 1376
    .line 1377
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1378
    .line 1379
    .line 1380
    goto :goto_16

    .line 1381
    :cond_54
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v11

    .line 1385
    goto :goto_16

    .line 1386
    :cond_55
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1387
    .line 1388
    .line 1389
    new-instance v0, Lcom/google/firebase/auth/GithubAuthCredential;

    .line 1390
    .line 1391
    invoke-direct {v0, v11}, Lcom/google/firebase/auth/GithubAuthCredential;-><init>(Ljava/lang/String;)V

    .line 1392
    .line 1393
    .line 1394
    return-object v0

    .line 1395
    :pswitch_26
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1396
    .line 1397
    .line 1398
    move-result v0

    .line 1399
    move v2, v6

    .line 1400
    move/from16 v16, v2

    .line 1401
    .line 1402
    move-object v4, v11

    .line 1403
    move-object v5, v4

    .line 1404
    move-object v7, v5

    .line 1405
    move-object v8, v7

    .line 1406
    move-object v9, v8

    .line 1407
    move-object v10, v9

    .line 1408
    move-object v12, v10

    .line 1409
    move-object v13, v12

    .line 1410
    move-object v14, v13

    .line 1411
    move-object v15, v14

    .line 1412
    move-object/from16 v17, v15

    .line 1413
    .line 1414
    move-object/from16 v20, v17

    .line 1415
    .line 1416
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1417
    .line 1418
    .line 1419
    move-result v3

    .line 1420
    if-ge v3, v0, :cond_56

    .line 1421
    .line 1422
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1423
    .line 1424
    .line 1425
    move-result v3

    .line 1426
    move-object/from16 v18, v15

    .line 1427
    .line 1428
    int-to-char v15, v3

    .line 1429
    packed-switch v15, :pswitch_data_3

    .line 1430
    .line 1431
    .line 1432
    invoke-static {v1, v3}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1433
    .line 1434
    .line 1435
    :goto_18
    move-object/from16 v15, v18

    .line 1436
    .line 1437
    goto :goto_17

    .line 1438
    :pswitch_27
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v20

    .line 1442
    goto :goto_18

    .line 1443
    :pswitch_28
    invoke-static {v1, v3}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1444
    .line 1445
    .line 1446
    move-result v16

    .line 1447
    goto :goto_18

    .line 1448
    :pswitch_29
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v17

    .line 1452
    goto :goto_18

    .line 1453
    :pswitch_2a
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v15

    .line 1457
    goto :goto_17

    .line 1458
    :pswitch_2b
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v14

    .line 1462
    goto :goto_18

    .line 1463
    :pswitch_2c
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v13

    .line 1467
    goto :goto_18

    .line 1468
    :pswitch_2d
    invoke-static {v1, v3}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1469
    .line 1470
    .line 1471
    move-result v2

    .line 1472
    goto :goto_18

    .line 1473
    :pswitch_2e
    invoke-static {v1, v3}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1474
    .line 1475
    .line 1476
    move-result v6

    .line 1477
    goto :goto_18

    .line 1478
    :pswitch_2f
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v12

    .line 1482
    goto :goto_18

    .line 1483
    :pswitch_30
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v10

    .line 1487
    goto :goto_18

    .line 1488
    :pswitch_31
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v9

    .line 1492
    goto :goto_18

    .line 1493
    :pswitch_32
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v8

    .line 1497
    goto :goto_18

    .line 1498
    :pswitch_33
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v7

    .line 1502
    goto :goto_18

    .line 1503
    :pswitch_34
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v5

    .line 1507
    goto :goto_18

    .line 1508
    :pswitch_35
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v4

    .line 1512
    goto :goto_18

    .line 1513
    :pswitch_36
    invoke-static {v1, v3}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v11

    .line 1517
    goto :goto_18

    .line 1518
    :cond_56
    move-object/from16 v18, v15

    .line 1519
    .line 1520
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1521
    .line 1522
    .line 1523
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;

    .line 1524
    .line 1525
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1526
    .line 1527
    .line 1528
    iput-object v11, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->a:Ljava/lang/String;

    .line 1529
    .line 1530
    iput-object v4, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->b:Ljava/lang/String;

    .line 1531
    .line 1532
    iput-object v5, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->c:Ljava/lang/String;

    .line 1533
    .line 1534
    iput-object v7, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->d:Ljava/lang/String;

    .line 1535
    .line 1536
    iput-object v8, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->e:Ljava/lang/String;

    .line 1537
    .line 1538
    iput-object v9, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->f:Ljava/lang/String;

    .line 1539
    .line 1540
    iput-object v10, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->g:Ljava/lang/String;

    .line 1541
    .line 1542
    iput-object v12, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->h:Ljava/lang/String;

    .line 1543
    .line 1544
    iput-boolean v6, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->i:Z

    .line 1545
    .line 1546
    iput-boolean v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->j:Z

    .line 1547
    .line 1548
    iput-object v13, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->k:Ljava/lang/String;

    .line 1549
    .line 1550
    iput-object v14, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->l:Ljava/lang/String;

    .line 1551
    .line 1552
    iput-object v15, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->m:Ljava/lang/String;

    .line 1553
    .line 1554
    move-object/from16 v11, v17

    .line 1555
    .line 1556
    iput-object v11, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->n:Ljava/lang/String;

    .line 1557
    .line 1558
    move/from16 v6, v16

    .line 1559
    .line 1560
    iput-boolean v6, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->o:Z

    .line 1561
    .line 1562
    move-object/from16 v11, v20

    .line 1563
    .line 1564
    iput-object v11, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzajg;->p:Ljava/lang/String;

    .line 1565
    .line 1566
    return-object v0

    .line 1567
    :pswitch_37
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1568
    .line 1569
    .line 1570
    move-result v0

    .line 1571
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1572
    .line 1573
    .line 1574
    move-result v2

    .line 1575
    if-ge v2, v0, :cond_57

    .line 1576
    .line 1577
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1578
    .line 1579
    .line 1580
    move-result v2

    .line 1581
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1582
    .line 1583
    .line 1584
    goto :goto_19

    .line 1585
    :cond_57
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1586
    .line 1587
    .line 1588
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/zzaje;

    .line 1589
    .line 1590
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1591
    .line 1592
    .line 1593
    return-object v0

    .line 1594
    :pswitch_38
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1595
    .line 1596
    .line 1597
    move-result v0

    .line 1598
    move-object v13, v11

    .line 1599
    move-object v14, v13

    .line 1600
    move-object v15, v14

    .line 1601
    move-object/from16 v16, v15

    .line 1602
    .line 1603
    move-object/from16 v17, v16

    .line 1604
    .line 1605
    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1606
    .line 1607
    .line 1608
    move-result v4

    .line 1609
    if-ge v4, v0, :cond_5d

    .line 1610
    .line 1611
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1612
    .line 1613
    .line 1614
    move-result v4

    .line 1615
    int-to-char v5, v4

    .line 1616
    if-eq v5, v9, :cond_5c

    .line 1617
    .line 1618
    if-eq v5, v8, :cond_5b

    .line 1619
    .line 1620
    if-eq v5, v7, :cond_5a

    .line 1621
    .line 1622
    if-eq v5, v3, :cond_59

    .line 1623
    .line 1624
    if-eq v5, v2, :cond_58

    .line 1625
    .line 1626
    invoke-static {v1, v4}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1627
    .line 1628
    .line 1629
    goto :goto_1a

    .line 1630
    :cond_58
    invoke-static {v1, v4}, La/b5x;->Y(Landroid/os/Parcel;I)Ljava/lang/Long;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v14

    .line 1634
    goto :goto_1a

    .line 1635
    :cond_59
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v17

    .line 1639
    goto :goto_1a

    .line 1640
    :cond_5a
    invoke-static {v1, v4}, La/b5x;->Y(Landroid/os/Parcel;I)Ljava/lang/Long;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v13

    .line 1644
    goto :goto_1a

    .line 1645
    :cond_5b
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v16

    .line 1649
    goto :goto_1a

    .line 1650
    :cond_5c
    invoke-static {v1, v4}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v15

    .line 1654
    goto :goto_1a

    .line 1655
    :cond_5d
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1656
    .line 1657
    .line 1658
    new-instance v12, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 1659
    .line 1660
    invoke-direct/range {v12 .. v17}, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1661
    .line 1662
    .line 1663
    return-object v12

    .line 1664
    :pswitch_39
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1665
    .line 1666
    .line 1667
    move-result v0

    .line 1668
    move-wide v2, v4

    .line 1669
    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1670
    .line 1671
    .line 1672
    move-result v6

    .line 1673
    if-ge v6, v0, :cond_60

    .line 1674
    .line 1675
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1676
    .line 1677
    .line 1678
    move-result v6

    .line 1679
    int-to-char v7, v6

    .line 1680
    if-eq v7, v10, :cond_5f

    .line 1681
    .line 1682
    if-eq v7, v9, :cond_5e

    .line 1683
    .line 1684
    invoke-static {v1, v6}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1685
    .line 1686
    .line 1687
    goto :goto_1b

    .line 1688
    :cond_5e
    invoke-static {v1, v6}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 1689
    .line 1690
    .line 1691
    move-result-wide v2

    .line 1692
    goto :goto_1b

    .line 1693
    :cond_5f
    invoke-static {v1, v6}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 1694
    .line 1695
    .line 1696
    move-result-wide v4

    .line 1697
    goto :goto_1b

    .line 1698
    :cond_60
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1699
    .line 1700
    .line 1701
    new-instance v0, Lcom/google/firebase/auth/internal/zzaf;

    .line 1702
    .line 1703
    invoke-direct {v0, v4, v5, v2, v3}, Lcom/google/firebase/auth/internal/zzaf;-><init>(JJ)V

    .line 1704
    .line 1705
    .line 1706
    return-object v0

    .line 1707
    :pswitch_3a
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1708
    .line 1709
    .line 1710
    move-result v0

    .line 1711
    move-wide/from16 v16, v4

    .line 1712
    .line 1713
    move-wide/from16 v21, v16

    .line 1714
    .line 1715
    move-wide/from16 v24, v21

    .line 1716
    .line 1717
    move/from16 v18, v6

    .line 1718
    .line 1719
    move-object v13, v11

    .line 1720
    move-object v14, v13

    .line 1721
    move-object v15, v14

    .line 1722
    move-object/from16 v19, v15

    .line 1723
    .line 1724
    move-object/from16 v20, v19

    .line 1725
    .line 1726
    move-object/from16 v23, v20

    .line 1727
    .line 1728
    move-object/from16 v26, v23

    .line 1729
    .line 1730
    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1731
    .line 1732
    .line 1733
    move-result v2

    .line 1734
    if-ge v2, v0, :cond_61

    .line 1735
    .line 1736
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1737
    .line 1738
    .line 1739
    move-result v2

    .line 1740
    int-to-char v3, v2

    .line 1741
    packed-switch v3, :pswitch_data_4

    .line 1742
    .line 1743
    .line 1744
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1745
    .line 1746
    .line 1747
    goto :goto_1c

    .line 1748
    :pswitch_3b
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzbh;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1749
    .line 1750
    invoke-static {v1, v2, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v2

    .line 1754
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzbh;

    .line 1755
    .line 1756
    move-object/from16 v26, v2

    .line 1757
    .line 1758
    goto :goto_1c

    .line 1759
    :pswitch_3c
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 1760
    .line 1761
    .line 1762
    move-result-wide v2

    .line 1763
    move-wide/from16 v24, v2

    .line 1764
    .line 1765
    goto :goto_1c

    .line 1766
    :pswitch_3d
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzbh;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1767
    .line 1768
    invoke-static {v1, v2, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v2

    .line 1772
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzbh;

    .line 1773
    .line 1774
    move-object/from16 v23, v2

    .line 1775
    .line 1776
    goto :goto_1c

    .line 1777
    :pswitch_3e
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 1778
    .line 1779
    .line 1780
    move-result-wide v2

    .line 1781
    move-wide/from16 v21, v2

    .line 1782
    .line 1783
    goto :goto_1c

    .line 1784
    :pswitch_3f
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzbh;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1785
    .line 1786
    invoke-static {v1, v2, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1787
    .line 1788
    .line 1789
    move-result-object v2

    .line 1790
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzbh;

    .line 1791
    .line 1792
    move-object/from16 v20, v2

    .line 1793
    .line 1794
    goto :goto_1c

    .line 1795
    :pswitch_40
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v2

    .line 1799
    move-object/from16 v19, v2

    .line 1800
    .line 1801
    goto :goto_1c

    .line 1802
    :pswitch_41
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1803
    .line 1804
    .line 1805
    move-result v2

    .line 1806
    move/from16 v18, v2

    .line 1807
    .line 1808
    goto :goto_1c

    .line 1809
    :pswitch_42
    invoke-static {v1, v2}, La/b5x;->X(Landroid/os/Parcel;I)J

    .line 1810
    .line 1811
    .line 1812
    move-result-wide v2

    .line 1813
    move-wide/from16 v16, v2

    .line 1814
    .line 1815
    goto :goto_1c

    .line 1816
    :pswitch_43
    sget-object v3, Lcom/google/android/gms/measurement/internal/zzpl;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1817
    .line 1818
    invoke-static {v1, v2, v3}, La/b5x;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v2

    .line 1822
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzpl;

    .line 1823
    .line 1824
    move-object v15, v2

    .line 1825
    goto :goto_1c

    .line 1826
    :pswitch_44
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v2

    .line 1830
    move-object v14, v2

    .line 1831
    goto :goto_1c

    .line 1832
    :pswitch_45
    invoke-static {v1, v2}, La/b5x;->D(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v2

    .line 1836
    move-object v13, v2

    .line 1837
    goto :goto_1c

    .line 1838
    :cond_61
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1839
    .line 1840
    .line 1841
    new-instance v12, Lcom/google/android/gms/measurement/internal/zzah;

    .line 1842
    .line 1843
    invoke-direct/range {v12 .. v26}, Lcom/google/android/gms/measurement/internal/zzah;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzpl;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/zzbh;JLcom/google/android/gms/measurement/internal/zzbh;JLcom/google/android/gms/measurement/internal/zzbh;)V

    .line 1844
    .line 1845
    .line 1846
    return-object v12

    .line 1847
    :pswitch_46
    invoke-static {v1}, La/b5x;->i0(Landroid/os/Parcel;)I

    .line 1848
    .line 1849
    .line 1850
    move-result v0

    .line 1851
    move v12, v6

    .line 1852
    move v13, v12

    .line 1853
    move v14, v13

    .line 1854
    move v15, v14

    .line 1855
    move/from16 v16, v15

    .line 1856
    .line 1857
    :goto_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1858
    .line 1859
    .line 1860
    move-result v2

    .line 1861
    if-ge v2, v0, :cond_67

    .line 1862
    .line 1863
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1864
    .line 1865
    .line 1866
    move-result v2

    .line 1867
    int-to-char v4, v2

    .line 1868
    if-eq v4, v10, :cond_66

    .line 1869
    .line 1870
    if-eq v4, v9, :cond_65

    .line 1871
    .line 1872
    if-eq v4, v8, :cond_64

    .line 1873
    .line 1874
    if-eq v4, v7, :cond_63

    .line 1875
    .line 1876
    if-eq v4, v3, :cond_62

    .line 1877
    .line 1878
    invoke-static {v1, v2}, La/b5x;->b0(Landroid/os/Parcel;I)V

    .line 1879
    .line 1880
    .line 1881
    goto :goto_1d

    .line 1882
    :cond_62
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1883
    .line 1884
    .line 1885
    move-result v14

    .line 1886
    goto :goto_1d

    .line 1887
    :cond_63
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1888
    .line 1889
    .line 1890
    move-result v13

    .line 1891
    goto :goto_1d

    .line 1892
    :cond_64
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1893
    .line 1894
    .line 1895
    move-result v16

    .line 1896
    goto :goto_1d

    .line 1897
    :cond_65
    invoke-static {v1, v2}, La/b5x;->T(Landroid/os/Parcel;I)Z

    .line 1898
    .line 1899
    .line 1900
    move-result v15

    .line 1901
    goto :goto_1d

    .line 1902
    :cond_66
    invoke-static {v1, v2}, La/b5x;->W(Landroid/os/Parcel;I)I

    .line 1903
    .line 1904
    .line 1905
    move-result v12

    .line 1906
    goto :goto_1d

    .line 1907
    :cond_67
    invoke-static {v1, v0}, La/b5x;->H(Landroid/os/Parcel;I)V

    .line 1908
    .line 1909
    .line 1910
    new-instance v11, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    .line 1911
    .line 1912
    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;-><init>(IIIZZ)V

    .line 1913
    .line 1914
    .line 1915
    return-object v11

    .line 1916
    nop

    .line 1917
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_46
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
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
    .line 1978
    .line 1979
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch

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
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch

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
    :pswitch_data_3
    .packed-switch 0x2
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
    .end packed-switch

    .line 2018
    .line 2019
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
    :pswitch_data_4
    .packed-switch 0x2
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p0, p0, La/lgw0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/google/android/gms/internal/measurement/zzdd;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lcom/google/android/gms/internal/measurement/zzdb;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/google/android/gms/common/api/Scope;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/AuthenticationExtensionsClientOutputs;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lcom/google/android/gms/common/api/ComplianceOptions;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/firebase/auth/internal/zzbl;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzbh;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzbf;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/UvmEntry;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/UvmEntries;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lcom/google/android/gms/common/Feature;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lcom/google/android/gms/cloudmessaging/zzd;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lcom/google/firebase/auth/TwitterAuthCredential;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lcom/google/firebase/auth/TotpMultiFactorInfo;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcom/google/firebase/auth/PlayGamesAuthCredential;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/google/firebase/auth/PhoneMultiFactorInfo;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/google/firebase/auth/PhoneAuthCredential;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzao;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lcom/google/firebase/auth/internal/zzao;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lcom/google/firebase/auth/zzao;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lcom/google/firebase/auth/internal/zzaj;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/google/firebase/auth/GoogleAuthCredential;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/google/firebase/auth/GithubAuthCredential;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/google/android/gms/internal/firebase-auth-api/zzajg;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lcom/google/android/gms/internal/firebase-auth-api/zzaje;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lcom/google/firebase/auth/internal/zzaf;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lcom/google/android/gms/measurement/internal/zzah;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

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
