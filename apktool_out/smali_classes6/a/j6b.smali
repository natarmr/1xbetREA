.class public final synthetic La/j6b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(BJLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/j6b;->a:B

    iput-wide p2, p0, La/j6b;->b:J

    iput-object p4, p0, La/j6b;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/j6b;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    sget-object v4, La/jm40;->b:La/jm40;

    .line 10
    .line 11
    iget-object v5, v0, La/j6b;->c:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iget-wide v6, v0, La/j6b;->b:J

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/16 v9, 0x12

    .line 17
    .line 18
    const/4 v10, 0x2

    .line 19
    const/4 v11, 0x4

    .line 20
    const/4 v12, 0x1

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v15, p1

    .line 25
    .line 26
    check-cast v15, La/y8m;

    .line 27
    .line 28
    move-object/from16 v1, p2

    .line 29
    .line 30
    check-cast v1, La/fet;

    .line 31
    .line 32
    move-object/from16 v2, p3

    .line 33
    .line 34
    check-cast v2, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    and-int/lit8 v3, v2, 0x6

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    invoke-virtual {v1, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    move v10, v11

    .line 54
    :cond_0
    or-int/2addr v2, v10

    .line 55
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 56
    .line 57
    if-eq v3, v9, :cond_2

    .line 58
    .line 59
    move v8, v12

    .line 60
    :cond_2
    and-int/lit8 v3, v2, 0x1

    .line 61
    .line 62
    invoke-virtual {v1, v3, v8}, La/fet;->U(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    shl-int/lit8 v2, v2, 0x3

    .line 69
    .line 70
    and-int/lit8 v18, v2, 0x70

    .line 71
    .line 72
    iget-wide v13, v0, La/j6b;->b:J

    .line 73
    .line 74
    iget-object v0, v0, La/j6b;->c:Lkotlin/jvm/functions/Function1;

    .line 75
    .line 76
    move-object/from16 v16, v0

    .line 77
    .line 78
    move-object/from16 v17, v1

    .line 79
    .line 80
    invoke-static/range {v13 .. v18}, La/b9m;->a(JLa/y8m;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    move-object/from16 v17, v1

    .line 85
    .line 86
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 87
    .line 88
    .line 89
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_0
    move-object/from16 v0, p1

    .line 93
    .line 94
    check-cast v0, La/i8b;

    .line 95
    .line 96
    move-object/from16 v1, p2

    .line 97
    .line 98
    check-cast v1, La/fet;

    .line 99
    .line 100
    move-object/from16 v13, p3

    .line 101
    .line 102
    check-cast v13, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    and-int/lit8 v14, v13, 0x6

    .line 112
    .line 113
    if-nez v14, :cond_5

    .line 114
    .line 115
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v14

    .line 119
    if-eqz v14, :cond_4

    .line 120
    .line 121
    move v10, v11

    .line 122
    :cond_4
    or-int/2addr v13, v10

    .line 123
    :cond_5
    and-int/lit8 v10, v13, 0x13

    .line 124
    .line 125
    if-eq v10, v9, :cond_6

    .line 126
    .line 127
    move v8, v12

    .line 128
    :cond_6
    and-int/lit8 v9, v13, 0x1

    .line 129
    .line 130
    invoke-virtual {v1, v9, v8}, La/fet;->U(IZ)Z

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    if-eqz v8, :cond_9

    .line 135
    .line 136
    sget-object v8, La/jd8;->n:La/ljc;

    .line 137
    .line 138
    invoke-static {v4, v6, v7, v8}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    sget-object v6, La/qmk;->a:La/zcl;

    .line 143
    .line 144
    const/high16 v6, 0x41000000    # 8.0f

    .line 145
    .line 146
    const/high16 v7, 0x40800000    # 4.0f

    .line 147
    .line 148
    invoke-static {v4, v6, v7}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    if-nez v4, :cond_7

    .line 165
    .line 166
    if-ne v6, v2, :cond_8

    .line 167
    .line 168
    :cond_7
    new-instance v6, La/ag0;

    .line 169
    .line 170
    const/16 v2, 0x14

    .line 171
    .line 172
    invoke-direct {v6, v5, v2}, La/ag0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_8
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 179
    .line 180
    sget-object v4, La/mrv;->c:La/ugd;

    .line 181
    .line 182
    sget-object v5, La/mrv;->d:La/ugd;

    .line 183
    .line 184
    shl-int/lit8 v2, v13, 0x3

    .line 185
    .line 186
    and-int/lit8 v2, v2, 0x70

    .line 187
    .line 188
    or-int/lit16 v7, v2, 0x6c00

    .line 189
    .line 190
    move-object v2, v6

    .line 191
    move-object v6, v1

    .line 192
    move-object v1, v3

    .line 193
    move-object v3, v2

    .line 194
    move-object v2, v0

    .line 195
    invoke-static/range {v1 .. v7}, La/lvm0;->b(La/mm40;La/i8b;Lkotlin/jvm/functions/Function2;La/ugd;La/ugd;La/fet;I)V

    .line 196
    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_9
    move-object v6, v1

    .line 200
    invoke-virtual {v6}, La/fet;->X()V

    .line 201
    .line 202
    .line 203
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_1
    move-object/from16 v0, p1

    .line 207
    .line 208
    check-cast v0, La/i8b;

    .line 209
    .line 210
    move-object/from16 v1, p2

    .line 211
    .line 212
    check-cast v1, La/fet;

    .line 213
    .line 214
    move-object/from16 v13, p3

    .line 215
    .line 216
    check-cast v13, Ljava/lang/Integer;

    .line 217
    .line 218
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 219
    .line 220
    .line 221
    move-result v13

    .line 222
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    and-int/lit8 v14, v13, 0x6

    .line 226
    .line 227
    if-nez v14, :cond_b

    .line 228
    .line 229
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v14

    .line 233
    if-eqz v14, :cond_a

    .line 234
    .line 235
    move v10, v11

    .line 236
    :cond_a
    or-int/2addr v13, v10

    .line 237
    :cond_b
    and-int/lit8 v10, v13, 0x13

    .line 238
    .line 239
    if-eq v10, v9, :cond_c

    .line 240
    .line 241
    move v8, v12

    .line 242
    :cond_c
    and-int/lit8 v9, v13, 0x1

    .line 243
    .line 244
    invoke-virtual {v1, v9, v8}, La/fet;->U(IZ)Z

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    if-eqz v8, :cond_10

    .line 249
    .line 250
    iget-boolean v8, v0, La/i8b;->c:Z

    .line 251
    .line 252
    if-eqz v8, :cond_d

    .line 253
    .line 254
    sget-object v8, La/qmk;->i:La/zcl;

    .line 255
    .line 256
    sget-object v9, La/qmk;->a:La/zcl;

    .line 257
    .line 258
    new-instance v10, La/ugg0;

    .line 259
    .line 260
    invoke-direct {v10, v8, v8, v9, v9}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_d
    sget-object v8, La/qmk;->i:La/zcl;

    .line 265
    .line 266
    sget-object v9, La/vgg0;->a:La/ugg0;

    .line 267
    .line 268
    new-instance v10, La/ugg0;

    .line 269
    .line 270
    invoke-direct {v10, v8, v8, v8, v8}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 271
    .line 272
    .line 273
    :goto_2
    invoke-static {v4, v10}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    sget-object v8, La/jd8;->n:La/ljc;

    .line 278
    .line 279
    invoke-static {v4, v6, v7, v8}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    const/high16 v6, 0x40c00000    # 6.0f

    .line 284
    .line 285
    const/4 v7, 0x0

    .line 286
    invoke-static {v4, v7, v6, v12}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    if-nez v4, :cond_e

    .line 303
    .line 304
    if-ne v6, v2, :cond_f

    .line 305
    .line 306
    :cond_e
    new-instance v6, La/ag0;

    .line 307
    .line 308
    const/16 v2, 0x13

    .line 309
    .line 310
    invoke-direct {v6, v5, v2}, La/ag0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    :cond_f
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 317
    .line 318
    sget-object v4, La/ntr;->c:La/ugd;

    .line 319
    .line 320
    sget-object v5, La/ntr;->d:La/ugd;

    .line 321
    .line 322
    shl-int/lit8 v2, v13, 0x3

    .line 323
    .line 324
    and-int/lit8 v2, v2, 0x70

    .line 325
    .line 326
    or-int/lit16 v7, v2, 0x6c00

    .line 327
    .line 328
    move-object v2, v6

    .line 329
    move-object v6, v1

    .line 330
    move-object v1, v3

    .line 331
    move-object v3, v2

    .line 332
    move-object v2, v0

    .line 333
    invoke-static/range {v1 .. v7}, La/lvm0;->b(La/mm40;La/i8b;Lkotlin/jvm/functions/Function2;La/ugd;La/ugd;La/fet;I)V

    .line 334
    .line 335
    .line 336
    goto :goto_3

    .line 337
    :cond_10
    move-object v6, v1

    .line 338
    invoke-virtual {v6}, La/fet;->X()V

    .line 339
    .line 340
    .line 341
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    return-object v0

    .line 344
    nop

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
