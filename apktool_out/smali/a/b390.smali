.class public final La/b390;
.super La/o0d0;
.source "SourceFile"


# virtual methods
.method public final a(La/oms0;Ljava/lang/String;ILa/fet;I)La/l7m0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v6, p4

    .line 8
    .line 9
    const v3, 0x71ed531

    .line 10
    .line 11
    .line 12
    invoke-virtual {v6, v3}, La/fet;->e0(I)V

    .line 13
    .line 14
    .line 15
    and-int/lit8 v3, p5, 0xe

    .line 16
    .line 17
    shl-int/lit8 v4, p5, 0x3

    .line 18
    .line 19
    and-int/lit16 v4, v4, 0x380

    .line 20
    .line 21
    or-int/2addr v3, v4

    .line 22
    sget-object v5, La/hp4;->j:La/lxs0;

    .line 23
    .line 24
    and-int/lit8 v4, v3, 0xe

    .line 25
    .line 26
    shl-int/lit8 v3, v3, 0x3

    .line 27
    .line 28
    and-int/lit16 v3, v3, 0x1c00

    .line 29
    .line 30
    or-int/2addr v3, v4

    .line 31
    invoke-virtual {v1}, La/oms0;->h()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget-object v7, v1, La/oms0;->a:La/p4;

    .line 36
    .line 37
    sget-object v9, La/ukd;->a:La/cl5;

    .line 38
    .line 39
    const/4 v10, 0x4

    .line 40
    const/4 v11, 0x0

    .line 41
    if-nez v4, :cond_6

    .line 42
    .line 43
    const v4, 0x6355e4b0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6, v4}, La/fet;->e0(I)V

    .line 47
    .line 48
    .line 49
    and-int/lit8 v4, v3, 0xe

    .line 50
    .line 51
    xor-int/lit8 v4, v4, 0x6

    .line 52
    .line 53
    if-le v4, v10, :cond_0

    .line 54
    .line 55
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-nez v4, :cond_1

    .line 60
    .line 61
    :cond_0
    and-int/lit8 v4, v3, 0x6

    .line 62
    .line 63
    if-ne v4, v10, :cond_2

    .line 64
    .line 65
    :cond_1
    const/4 v4, 0x1

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move v4, v11

    .line 68
    :goto_0
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    if-nez v4, :cond_3

    .line 73
    .line 74
    if-ne v12, v9, :cond_5

    .line 75
    .line 76
    :cond_3
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    invoke-virtual {v4}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    goto :goto_1

    .line 87
    :cond_4
    const/4 v12, 0x0

    .line 88
    :goto_1
    invoke-static {v4}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    :try_start_0
    invoke-virtual {v7}, La/p4;->y0()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    invoke-static {v4, v13, v12}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move-object v12, v7

    .line 103
    :cond_5
    invoke-virtual {v6, v11}, La/fet;->r(Z)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :catchall_0
    move-exception v0

    .line 108
    invoke-static {v4, v13, v12}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 109
    .line 110
    .line 111
    throw v0

    .line 112
    :cond_6
    const v4, 0x6359c50d

    .line 113
    .line 114
    .line 115
    invoke-static {v6, v4, v11, v7}, La/vqd;->j(La/fet;IZLa/p4;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v12

    .line 119
    :goto_2
    check-cast v12, Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    const v7, -0x482c0a90

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6, v7}, La/fet;->e0(I)V

    .line 129
    .line 130
    .line 131
    const/4 v12, 0x0

    .line 132
    if-eqz v4, :cond_7

    .line 133
    .line 134
    int-to-float v4, v2

    .line 135
    goto :goto_3

    .line 136
    :cond_7
    move v4, v12

    .line 137
    :goto_3
    invoke-virtual {v6, v11}, La/fet;->r(Z)V

    .line 138
    .line 139
    .line 140
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    and-int/lit8 v13, v3, 0xe

    .line 145
    .line 146
    xor-int/lit8 v14, v13, 0x6

    .line 147
    .line 148
    if-le v14, v10, :cond_8

    .line 149
    .line 150
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v15

    .line 154
    if-nez v15, :cond_9

    .line 155
    .line 156
    :cond_8
    and-int/lit8 v15, v3, 0x6

    .line 157
    .line 158
    if-ne v15, v10, :cond_a

    .line 159
    .line 160
    :cond_9
    const/4 v15, 0x1

    .line 161
    goto :goto_4

    .line 162
    :cond_a
    move v15, v11

    .line 163
    :goto_4
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    if-nez v15, :cond_b

    .line 168
    .line 169
    if-ne v8, v9, :cond_c

    .line 170
    .line 171
    :cond_b
    new-instance v8, La/tx50;

    .line 172
    .line 173
    invoke-direct {v8, v1, v10}, La/tx50;-><init>(La/oms0;B)V

    .line 174
    .line 175
    .line 176
    invoke-static {v8}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    invoke-virtual {v6, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_c
    check-cast v8, La/l7m0;

    .line 184
    .line 185
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    check-cast v8, Ljava/lang/Boolean;

    .line 190
    .line 191
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    invoke-virtual {v6, v7}, La/fet;->e0(I)V

    .line 196
    .line 197
    .line 198
    if-eqz v8, :cond_d

    .line 199
    .line 200
    int-to-float v12, v2

    .line 201
    :cond_d
    invoke-virtual {v6, v11}, La/fet;->r(Z)V

    .line 202
    .line 203
    .line 204
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    if-le v14, v10, :cond_e

    .line 209
    .line 210
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    if-nez v8, :cond_f

    .line 215
    .line 216
    :cond_e
    and-int/lit8 v8, v3, 0x6

    .line 217
    .line 218
    if-ne v8, v10, :cond_10

    .line 219
    .line 220
    :cond_f
    const/4 v8, 0x1

    .line 221
    goto :goto_5

    .line 222
    :cond_10
    move v8, v11

    .line 223
    :goto_5
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    const/4 v12, 0x5

    .line 228
    if-nez v8, :cond_11

    .line 229
    .line 230
    if-ne v10, v9, :cond_12

    .line 231
    .line 232
    :cond_11
    new-instance v8, La/tx50;

    .line 233
    .line 234
    invoke-direct {v8, v1, v12}, La/tx50;-><init>(La/oms0;B)V

    .line 235
    .line 236
    .line 237
    invoke-static {v8}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    invoke-virtual {v6, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_12
    check-cast v10, La/l7m0;

    .line 245
    .line 246
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    check-cast v8, La/ams0;

    .line 251
    .line 252
    const v10, 0x7e1f7075

    .line 253
    .line 254
    .line 255
    invoke-virtual {v6, v10}, La/fet;->e0(I)V

    .line 256
    .line 257
    .line 258
    sget-object v10, La/ihn;->d:La/z73;

    .line 259
    .line 260
    const/4 v14, 0x2

    .line 261
    invoke-static {v2, v11, v10, v14}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 262
    .line 263
    .line 264
    move-result-object v10

    .line 265
    invoke-interface {v8}, La/ams0;->b()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    check-cast v8, Ljava/lang/Boolean;

    .line 270
    .line 271
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    if-eqz v8, :cond_13

    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_13
    new-instance v8, La/zag0;

    .line 279
    .line 280
    invoke-direct {v8, v10, v2}, La/zag0;-><init>(La/cfq;I)V

    .line 281
    .line 282
    .line 283
    move-object v10, v8

    .line 284
    :goto_6
    invoke-virtual {v6, v11}, La/fet;->r(Z)V

    .line 285
    .line 286
    .line 287
    const/high16 v2, 0x70000

    .line 288
    .line 289
    shl-int/lit8 v3, v3, 0x6

    .line 290
    .line 291
    and-int/2addr v2, v3

    .line 292
    or-int/2addr v2, v13

    .line 293
    move-object v3, v7

    .line 294
    move v7, v2

    .line 295
    move-object v2, v4

    .line 296
    move-object v4, v10

    .line 297
    invoke-static/range {v1 .. v7}, La/phu0;->E(La/oms0;Ljava/lang/Object;Ljava/lang/Object;La/cfq;La/lxs0;La/fet;I)La/cms0;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    invoke-virtual {v6, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    or-int/2addr v2, v3

    .line 310
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    if-nez v2, :cond_14

    .line 315
    .line 316
    if-ne v3, v9, :cond_15

    .line 317
    .line 318
    :cond_14
    new-instance v3, La/qw80;

    .line 319
    .line 320
    invoke-direct {v3, v0, v1, v12}, La/qw80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v6, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    :cond_15
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 327
    .line 328
    invoke-static {v3}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v6, v11}, La/fet;->r(Z)V

    .line 333
    .line 334
    .line 335
    return-object v0
.end method
