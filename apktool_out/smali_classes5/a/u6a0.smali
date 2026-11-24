.class public final La/u6a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/j6a0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/j6a0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/u6a0;->a:B

    iput-object p1, p0, La/u6a0;->b:La/j6a0;

    iput-object p2, p0, La/u6a0;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u6a0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/u6a0;->c:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object v0, v0, La/u6a0;->b:La/j6a0;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    sget-object v5, La/ukd;->a:La/cl5;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v12, p1

    .line 18
    .line 19
    check-cast v12, La/fet;

    .line 20
    .line 21
    move-object/from16 v1, p2

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    and-int/lit8 v7, v1, 0x3

    .line 30
    .line 31
    if-eq v7, v3, :cond_0

    .line 32
    .line 33
    move v7, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v7, v6

    .line 36
    :goto_0
    and-int/2addr v1, v4

    .line 37
    invoke-virtual {v12, v1, v7}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_11

    .line 42
    .line 43
    iget-object v1, v0, La/j6a0;->b:La/a4x;

    .line 44
    .line 45
    iget-object v0, v0, La/j6a0;->d:La/udl0;

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v15

    .line 51
    move v7, v6

    .line 52
    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    if-eqz v8, :cond_12

    .line 57
    .line 58
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    add-int/lit8 v16, v7, 0x1

    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    if-ltz v7, :cond_10

    .line 66
    .line 67
    check-cast v8, La/d4n;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 70
    .line 71
    .line 72
    move-result v10

    .line 73
    const/4 v11, 0x3

    .line 74
    const/high16 v13, 0x40000000    # 2.0f

    .line 75
    .line 76
    const/4 v14, 0x0

    .line 77
    if-eqz v10, :cond_6

    .line 78
    .line 79
    if-eq v10, v4, :cond_4

    .line 80
    .line 81
    if-eq v10, v3, :cond_3

    .line 82
    .line 83
    if-ne v10, v11, :cond_2

    .line 84
    .line 85
    sget-object v10, La/qmk;->a:La/zcl;

    .line 86
    .line 87
    :cond_1
    :goto_2
    move/from16 v19, v14

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_7

    .line 94
    .line 95
    :cond_3
    sget-object v10, La/qmk;->a:La/zcl;

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    sget-object v10, La/qmk;->a:La/zcl;

    .line 99
    .line 100
    if-nez v7, :cond_5

    .line 101
    .line 102
    const/high16 v10, 0x41400000    # 12.0f

    .line 103
    .line 104
    :goto_3
    move/from16 v19, v10

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_5
    move/from16 v19, v13

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_6
    sget-object v10, La/qmk;->a:La/zcl;

    .line 111
    .line 112
    if-nez v7, :cond_1

    .line 113
    .line 114
    const/high16 v10, 0x40c00000    # 6.0f

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-eqz v10, :cond_b

    .line 122
    .line 123
    if-eq v10, v4, :cond_9

    .line 124
    .line 125
    if-eq v10, v3, :cond_7

    .line 126
    .line 127
    if-ne v10, v11, :cond_8

    .line 128
    .line 129
    :cond_7
    move/from16 v21, v14

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 133
    .line 134
    .line 135
    goto :goto_7

    .line 136
    :cond_9
    invoke-static {v1}, La/q3d;->i(Ljava/util/List;)I

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    if-ne v7, v9, :cond_a

    .line 141
    .line 142
    const/high16 v13, 0x41000000    # 8.0f

    .line 143
    .line 144
    :cond_a
    :goto_5
    move/from16 v21, v13

    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_b
    invoke-static {v1}, La/q3d;->i(Ljava/util/List;)I

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-ne v7, v9, :cond_7

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :goto_6
    const/16 v22, 0x5

    .line 155
    .line 156
    sget-object v17, La/jm40;->b:La/jm40;

    .line 157
    .line 158
    const/16 v18, 0x0

    .line 159
    .line 160
    const/16 v20, 0x0

    .line 161
    .line 162
    invoke-static/range {v17 .. v22}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    sget-object v9, La/kr00;->a:La/zfn;

    .line 167
    .line 168
    invoke-virtual {v12, v9}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v9

    .line 172
    check-cast v9, Ljava/lang/Boolean;

    .line 173
    .line 174
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    invoke-virtual {v12, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    if-nez v10, :cond_c

    .line 187
    .line 188
    if-ne v11, v5, :cond_d

    .line 189
    .line 190
    :cond_c
    new-instance v11, La/w8v;

    .line 191
    .line 192
    const/16 v10, 0x1d

    .line 193
    .line 194
    invoke-direct {v11, v2, v10}, La/w8v;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_d
    move-object v10, v11

    .line 201
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 202
    .line 203
    invoke-virtual {v12, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v11

    .line 207
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v13

    .line 211
    if-nez v11, :cond_e

    .line 212
    .line 213
    if-ne v13, v5, :cond_f

    .line 214
    .line 215
    :cond_e
    new-instance v13, La/v6a0;

    .line 216
    .line 217
    invoke-direct {v13, v2, v6}, La/v6a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v12, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_f
    move-object v11, v13

    .line 224
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 225
    .line 226
    const/4 v13, 0x0

    .line 227
    const/4 v14, 0x0

    .line 228
    invoke-static/range {v7 .. v14}, La/agc;->t(La/mm40;La/k4n;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 229
    .line 230
    .line 231
    move/from16 v7, v16

    .line 232
    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :cond_10
    invoke-static {}, La/q3d;->p()V

    .line 236
    .line 237
    .line 238
    throw v9

    .line 239
    :cond_11
    invoke-virtual {v12}, La/fet;->X()V

    .line 240
    .line 241
    .line 242
    :cond_12
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    :goto_7
    return-object v9

    .line 245
    :pswitch_0
    move-object/from16 v1, p1

    .line 246
    .line 247
    check-cast v1, La/fet;

    .line 248
    .line 249
    move-object/from16 v7, p2

    .line 250
    .line 251
    check-cast v7, Ljava/lang/Number;

    .line 252
    .line 253
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    and-int/lit8 v8, v7, 0x3

    .line 258
    .line 259
    if-eq v8, v3, :cond_13

    .line 260
    .line 261
    move v3, v4

    .line 262
    goto :goto_8

    .line 263
    :cond_13
    move v3, v6

    .line 264
    :goto_8
    and-int/2addr v4, v7

    .line 265
    invoke-virtual {v1, v4, v3}, La/fet;->U(IZ)Z

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    if-eqz v3, :cond_18

    .line 270
    .line 271
    iget-object v0, v0, La/j6a0;->a:La/h6a0;

    .line 272
    .line 273
    invoke-virtual {v1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    if-nez v3, :cond_14

    .line 282
    .line 283
    if-ne v4, v5, :cond_15

    .line 284
    .line 285
    :cond_14
    new-instance v4, La/hrk;

    .line 286
    .line 287
    const/16 v3, 0xa

    .line 288
    .line 289
    invoke-direct {v4, v2, v3}, La/hrk;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :cond_15
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 296
    .line 297
    invoke-virtual {v1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    if-nez v3, :cond_16

    .line 306
    .line 307
    if-ne v7, v5, :cond_17

    .line 308
    .line 309
    :cond_16
    new-instance v7, La/t6a0;

    .line 310
    .line 311
    invoke-direct {v7, v2, v6}, La/t6a0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    :cond_17
    move-object v3, v7

    .line 318
    check-cast v3, La/xdr;

    .line 319
    .line 320
    const/4 v5, 0x0

    .line 321
    move-object v2, v4

    .line 322
    move-object v4, v1

    .line 323
    move-object v1, v0

    .line 324
    const/4 v0, 0x0

    .line 325
    invoke-static/range {v0 .. v5}, La/m7x;->h(La/mm40;La/h6a0;Lkotlin/jvm/functions/Function2;La/xdr;La/fet;I)V

    .line 326
    .line 327
    .line 328
    goto :goto_9

    .line 329
    :cond_18
    move-object v4, v1

    .line 330
    invoke-virtual {v4}, La/fet;->X()V

    .line 331
    .line 332
    .line 333
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 334
    .line 335
    return-object v0

    .line 336
    nop

    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
