.class public final La/idr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:F

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;FLkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/idr0;->a:B

    iput-object p1, p0, La/idr0;->b:Ljava/util/ArrayList;

    iput p2, p0, La/idr0;->c:F

    iput-object p3, p0, La/idr0;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/idr0;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    iget v3, v0, La/idr0;->c:F

    .line 8
    .line 9
    sget-object v4, La/jm40;->b:La/jm40;

    .line 10
    .line 11
    iget-object v5, v0, La/idr0;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/16 v6, 0x92

    .line 14
    .line 15
    const/16 v7, 0x10

    .line 16
    .line 17
    const/16 v8, 0x20

    .line 18
    .line 19
    const/4 v9, 0x2

    .line 20
    const/4 v10, 0x4

    .line 21
    iget-object v0, v0, La/idr0;->d:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    const/4 v11, 0x1

    .line 24
    const/4 v12, 0x0

    .line 25
    packed-switch v1, :pswitch_data_0

    .line 26
    .line 27
    .line 28
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, La/k8z;

    .line 31
    .line 32
    move-object/from16 v13, p2

    .line 33
    .line 34
    check-cast v13, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v13

    .line 40
    move-object/from16 v14, p3

    .line 41
    .line 42
    check-cast v14, La/fet;

    .line 43
    .line 44
    move-object/from16 v15, p4

    .line 45
    .line 46
    check-cast v15, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v15

    .line 52
    and-int/lit8 v16, v15, 0x6

    .line 53
    .line 54
    if-nez v16, :cond_1

    .line 55
    .line 56
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    move v9, v10

    .line 63
    :cond_0
    or-int v1, v15, v9

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move v1, v15

    .line 67
    :goto_0
    and-int/lit8 v9, v15, 0x30

    .line 68
    .line 69
    if-nez v9, :cond_3

    .line 70
    .line 71
    invoke-virtual {v14, v13}, La/fet;->e(I)Z

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    if-eqz v9, :cond_2

    .line 76
    .line 77
    move v7, v8

    .line 78
    :cond_2
    or-int/2addr v1, v7

    .line 79
    :cond_3
    and-int/lit16 v7, v1, 0x93

    .line 80
    .line 81
    if-eq v7, v6, :cond_4

    .line 82
    .line 83
    move v6, v11

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    move v6, v12

    .line 86
    :goto_1
    and-int/2addr v1, v11

    .line 87
    invoke-virtual {v14, v1, v6}, La/fet;->U(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_7

    .line 92
    .line 93
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, La/upk0;

    .line 98
    .line 99
    const v5, -0x5e619cfc

    .line 100
    .line 101
    .line 102
    invoke-virtual {v14, v5}, La/fet;->e0(I)V

    .line 103
    .line 104
    .line 105
    invoke-static {v4, v3}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    iget-object v15, v1, La/upk0;->c:La/gy30;

    .line 110
    .line 111
    invoke-virtual {v14, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    or-int/2addr v4, v5

    .line 120
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    if-nez v4, :cond_5

    .line 125
    .line 126
    if-ne v5, v2, :cond_6

    .line 127
    .line 128
    :cond_5
    new-instance v5, La/ywm0;

    .line 129
    .line 130
    const/16 v2, 0x13

    .line 131
    .line 132
    invoke-direct {v5, v0, v1, v2}, La/ywm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v14, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_6
    move-object/from16 v16, v5

    .line 139
    .line 140
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 141
    .line 142
    const/16 v20, 0x0

    .line 143
    .line 144
    const/16 v21, 0x18

    .line 145
    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    const/16 v18, 0x0

    .line 149
    .line 150
    move-object/from16 v19, v14

    .line 151
    .line 152
    move-object v14, v3

    .line 153
    invoke-static/range {v14 .. v21}, La/jiq0;->y(La/mm40;La/gy30;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 154
    .line 155
    .line 156
    move-object/from16 v0, v19

    .line 157
    .line 158
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_7
    move-object v0, v14

    .line 163
    invoke-virtual {v0}, La/fet;->X()V

    .line 164
    .line 165
    .line 166
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    return-object v0

    .line 169
    :pswitch_0
    move-object/from16 v1, p1

    .line 170
    .line 171
    check-cast v1, La/g9z;

    .line 172
    .line 173
    move-object/from16 v13, p2

    .line 174
    .line 175
    check-cast v13, Ljava/lang/Number;

    .line 176
    .line 177
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 178
    .line 179
    .line 180
    move-result v13

    .line 181
    move-object/from16 v14, p3

    .line 182
    .line 183
    check-cast v14, La/fet;

    .line 184
    .line 185
    move-object/from16 v15, p4

    .line 186
    .line 187
    check-cast v15, Ljava/lang/Number;

    .line 188
    .line 189
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    and-int/lit8 v16, v15, 0x6

    .line 194
    .line 195
    if-nez v16, :cond_9

    .line 196
    .line 197
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_8

    .line 202
    .line 203
    move v9, v10

    .line 204
    :cond_8
    or-int v1, v15, v9

    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_9
    move v1, v15

    .line 208
    :goto_3
    and-int/lit8 v9, v15, 0x30

    .line 209
    .line 210
    if-nez v9, :cond_b

    .line 211
    .line 212
    invoke-virtual {v14, v13}, La/fet;->e(I)Z

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    if-eqz v9, :cond_a

    .line 217
    .line 218
    move v7, v8

    .line 219
    :cond_a
    or-int/2addr v1, v7

    .line 220
    :cond_b
    and-int/lit16 v7, v1, 0x93

    .line 221
    .line 222
    if-eq v7, v6, :cond_c

    .line 223
    .line 224
    move v6, v11

    .line 225
    goto :goto_4

    .line 226
    :cond_c
    move v6, v12

    .line 227
    :goto_4
    and-int/2addr v1, v11

    .line 228
    invoke-virtual {v14, v1, v6}, La/fet;->U(IZ)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_11

    .line 233
    .line 234
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    check-cast v1, La/qpo;

    .line 239
    .line 240
    const v5, -0x7918a336

    .line 241
    .line 242
    .line 243
    invoke-virtual {v14, v5}, La/fet;->e0(I)V

    .line 244
    .line 245
    .line 246
    invoke-static {v4, v3}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    const-string v4, "SPORT_EXPRESS_CARD"

    .line 251
    .line 252
    invoke-static {v3, v4}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    iget-object v15, v1, La/qpo;->d:La/npo;

    .line 257
    .line 258
    iget-object v4, v1, La/qpo;->b:Ljava/lang/String;

    .line 259
    .line 260
    iget-object v5, v1, La/qpo;->c:La/a4x;

    .line 261
    .line 262
    iget-object v6, v1, La/qpo;->e:La/chl0;

    .line 263
    .line 264
    invoke-virtual {v14, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v7

    .line 268
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    or-int/2addr v7, v8

    .line 273
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    if-nez v7, :cond_d

    .line 278
    .line 279
    if-ne v8, v2, :cond_e

    .line 280
    .line 281
    :cond_d
    new-instance v8, La/hdr0;

    .line 282
    .line 283
    invoke-direct {v8, v0, v1, v12}, La/hdr0;-><init>(Lkotlin/jvm/functions/Function1;La/qpo;B)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v14, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    :cond_e
    move-object/from16 v19, v8

    .line 290
    .line 291
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 292
    .line 293
    invoke-virtual {v14, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v7

    .line 297
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v8

    .line 301
    or-int/2addr v7, v8

    .line 302
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    if-nez v7, :cond_f

    .line 307
    .line 308
    if-ne v8, v2, :cond_10

    .line 309
    .line 310
    :cond_f
    new-instance v8, La/hdr0;

    .line 311
    .line 312
    invoke-direct {v8, v0, v1, v11}, La/hdr0;-><init>(Lkotlin/jvm/functions/Function1;La/qpo;B)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v14, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    :cond_10
    move-object/from16 v20, v8

    .line 319
    .line 320
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 321
    .line 322
    const/16 v22, 0x0

    .line 323
    .line 324
    move-object/from16 v16, v4

    .line 325
    .line 326
    move-object/from16 v17, v5

    .line 327
    .line 328
    move-object/from16 v18, v6

    .line 329
    .line 330
    move-object/from16 v21, v14

    .line 331
    .line 332
    move-object v14, v3

    .line 333
    invoke-static/range {v14 .. v22}, La/zdx;->s(La/mm40;La/npo;Ljava/lang/String;La/a4x;La/chl0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 334
    .line 335
    .line 336
    move-object/from16 v0, v21

    .line 337
    .line 338
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 339
    .line 340
    .line 341
    goto :goto_5

    .line 342
    :cond_11
    move-object v0, v14

    .line 343
    invoke-virtual {v0}, La/fet;->X()V

    .line 344
    .line 345
    .line 346
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 347
    .line 348
    return-object v0

    .line 349
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
