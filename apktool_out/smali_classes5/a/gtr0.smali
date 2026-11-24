.class public final synthetic La/gtr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ltr0;


# direct methods
.method public synthetic constructor <init>(La/ltr0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gtr0;->a:B

    iput-object p1, p0, La/gtr0;->b:La/ltr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gtr0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/gtr0;->b:La/ltr0;

    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/oyg0;

    .line 15
    .line 16
    move-object/from16 v4, p2

    .line 17
    .line 18
    check-cast v4, La/ftr0;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, v4, La/ftr0;->f:La/pur0;

    .line 27
    .line 28
    iget-object v5, v1, La/pur0;->a:La/rjr0;

    .line 29
    .line 30
    iget-object v6, v5, La/rjr0;->b:Ljava/math/BigDecimal;

    .line 31
    .line 32
    iget-object v7, v5, La/rjr0;->c:Ljava/math/BigDecimal;

    .line 33
    .line 34
    iget-object v8, v5, La/rjr0;->d:Ljava/math/BigDecimal;

    .line 35
    .line 36
    iget-object v9, v5, La/rjr0;->e:Ljava/math/BigDecimal;

    .line 37
    .line 38
    invoke-virtual {v6, v7}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v10, v9}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    if-lez v10, :cond_0

    .line 50
    .line 51
    move-object v7, v9

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    invoke-virtual {v6, v8}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-gez v9, :cond_1

    .line 58
    .line 59
    :goto_0
    move-object v7, v8

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-virtual {v6, v7}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :goto_1
    invoke-static {v7}, La/ltr0;->M(Ljava/math/BigDecimal;)La/a8q0;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    iget-object v6, v0, La/i3t0;->i:La/ocj;

    .line 74
    .line 75
    iget-object v6, v6, La/ocj;->a:La/p7m0;

    .line 76
    .line 77
    :goto_2
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v10, v0, La/i3t0;->f:La/oyg0;

    .line 85
    .line 86
    move-object v11, v8

    .line 87
    check-cast v11, La/ftr0;

    .line 88
    .line 89
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v10, v11, La/ftr0;->f:La/pur0;

    .line 93
    .line 94
    move-object v12, v8

    .line 95
    iget-object v8, v10, La/pur0;->a:La/rjr0;

    .line 96
    .line 97
    const/16 v16, 0x0

    .line 98
    .line 99
    const/16 v17, 0xfe

    .line 100
    .line 101
    move-object v13, v10

    .line 102
    const/4 v10, 0x0

    .line 103
    move-object v14, v11

    .line 104
    const/4 v11, 0x0

    .line 105
    move-object v15, v12

    .line 106
    const/4 v12, 0x0

    .line 107
    move-object/from16 v18, v13

    .line 108
    .line 109
    const/4 v13, 0x0

    .line 110
    move-object/from16 v19, v14

    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    move-object/from16 v20, v15

    .line 114
    .line 115
    const/4 v15, 0x0

    .line 116
    move-object/from16 p0, v18

    .line 117
    .line 118
    move-object/from16 v18, v5

    .line 119
    .line 120
    move-object/from16 v5, p0

    .line 121
    .line 122
    move-object/from16 p0, v4

    .line 123
    .line 124
    move-object/from16 v4, v20

    .line 125
    .line 126
    invoke-static/range {v8 .. v17}, La/rjr0;->a(La/rjr0;La/a8q0;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZZI)La/rjr0;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-static {v5, v8, v2, v3}, La/pur0;->a(La/pur0;La/rjr0;Ljava/lang/String;I)La/pur0;

    .line 131
    .line 132
    .line 133
    move-result-object v14

    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    const/16 v17, 0xdf

    .line 137
    .line 138
    move-object/from16 v11, v19

    .line 139
    .line 140
    invoke-static/range {v11 .. v17}, La/ftr0;->a(La/ftr0;La/vsr0;La/rm5;La/pur0;ZLa/jur0;I)La/ftr0;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v6, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_2

    .line 149
    .line 150
    const/4 v13, 0x0

    .line 151
    const/16 v14, 0xfd

    .line 152
    .line 153
    const/4 v6, 0x0

    .line 154
    const/4 v8, 0x0

    .line 155
    const/4 v9, 0x0

    .line 156
    const/4 v10, 0x0

    .line 157
    const/4 v11, 0x0

    .line 158
    const/4 v12, 0x0

    .line 159
    move-object/from16 v5, v18

    .line 160
    .line 161
    invoke-static/range {v5 .. v14}, La/rjr0;->a(La/rjr0;La/a8q0;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZZI)La/rjr0;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {v1, v0, v2, v3}, La/pur0;->a(La/pur0;La/rjr0;Ljava/lang/String;I)La/pur0;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    const/16 v10, 0xdf

    .line 170
    .line 171
    const/4 v5, 0x0

    .line 172
    const/4 v8, 0x0

    .line 173
    move-object/from16 v4, p0

    .line 174
    .line 175
    invoke-static/range {v4 .. v10}, La/ftr0;->a(La/ftr0;La/vsr0;La/rm5;La/pur0;ZLa/jur0;I)La/ftr0;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    return-object v0

    .line 180
    :cond_2
    move-object/from16 v4, p0

    .line 181
    .line 182
    move-object/from16 v5, v18

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :pswitch_0
    move-object/from16 v1, p1

    .line 186
    .line 187
    check-cast v1, La/oyg0;

    .line 188
    .line 189
    move-object/from16 v4, p2

    .line 190
    .line 191
    check-cast v4, La/ftr0;

    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    iget-object v1, v4, La/ftr0;->f:La/pur0;

    .line 200
    .line 201
    iget-object v5, v1, La/pur0;->a:La/rjr0;

    .line 202
    .line 203
    iget-object v6, v5, La/rjr0;->b:Ljava/math/BigDecimal;

    .line 204
    .line 205
    iget-object v7, v5, La/rjr0;->c:Ljava/math/BigDecimal;

    .line 206
    .line 207
    iget-object v8, v5, La/rjr0;->d:Ljava/math/BigDecimal;

    .line 208
    .line 209
    iget-object v9, v5, La/rjr0;->e:Ljava/math/BigDecimal;

    .line 210
    .line 211
    invoke-virtual {v6, v7}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v10, v8}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 219
    .line 220
    .line 221
    move-result v10

    .line 222
    if-gez v10, :cond_3

    .line 223
    .line 224
    :goto_3
    move-object v7, v8

    .line 225
    goto :goto_4

    .line 226
    :cond_3
    invoke-virtual {v6, v9}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    if-lez v8, :cond_4

    .line 231
    .line 232
    move-object v7, v9

    .line 233
    goto :goto_4

    .line 234
    :cond_4
    invoke-virtual {v6, v7}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :goto_4
    invoke-static {v7}, La/ltr0;->M(Ljava/math/BigDecimal;)La/a8q0;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    iget-object v6, v0, La/i3t0;->i:La/ocj;

    .line 247
    .line 248
    iget-object v6, v6, La/ocj;->a:La/p7m0;

    .line 249
    .line 250
    :goto_5
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    iget-object v10, v0, La/i3t0;->f:La/oyg0;

    .line 258
    .line 259
    move-object v11, v8

    .line 260
    check-cast v11, La/ftr0;

    .line 261
    .line 262
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    iget-object v10, v11, La/ftr0;->f:La/pur0;

    .line 266
    .line 267
    move-object v12, v8

    .line 268
    iget-object v8, v10, La/pur0;->a:La/rjr0;

    .line 269
    .line 270
    const/16 v16, 0x0

    .line 271
    .line 272
    const/16 v17, 0xfe

    .line 273
    .line 274
    move-object v13, v10

    .line 275
    const/4 v10, 0x0

    .line 276
    move-object v14, v11

    .line 277
    const/4 v11, 0x0

    .line 278
    move-object v15, v12

    .line 279
    const/4 v12, 0x0

    .line 280
    move-object/from16 v18, v13

    .line 281
    .line 282
    const/4 v13, 0x0

    .line 283
    move-object/from16 v19, v14

    .line 284
    .line 285
    const/4 v14, 0x0

    .line 286
    move-object/from16 v20, v15

    .line 287
    .line 288
    const/4 v15, 0x0

    .line 289
    move-object/from16 p0, v0

    .line 290
    .line 291
    move-object/from16 p1, v4

    .line 292
    .line 293
    move-object/from16 v4, v18

    .line 294
    .line 295
    move-object/from16 v0, v20

    .line 296
    .line 297
    invoke-static/range {v8 .. v17}, La/rjr0;->a(La/rjr0;La/a8q0;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZZI)La/rjr0;

    .line 298
    .line 299
    .line 300
    move-result-object v8

    .line 301
    invoke-static {v4, v8, v2, v3}, La/pur0;->a(La/pur0;La/rjr0;Ljava/lang/String;I)La/pur0;

    .line 302
    .line 303
    .line 304
    move-result-object v14

    .line 305
    const/16 v16, 0x0

    .line 306
    .line 307
    const/16 v17, 0xdf

    .line 308
    .line 309
    move-object/from16 v11, v19

    .line 310
    .line 311
    invoke-static/range {v11 .. v17}, La/ftr0;->a(La/ftr0;La/vsr0;La/rm5;La/pur0;ZLa/jur0;I)La/ftr0;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    invoke-virtual {v6, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_5

    .line 320
    .line 321
    const/4 v13, 0x0

    .line 322
    const/16 v14, 0xfd

    .line 323
    .line 324
    const/4 v6, 0x0

    .line 325
    const/4 v8, 0x0

    .line 326
    const/4 v9, 0x0

    .line 327
    const/4 v10, 0x0

    .line 328
    const/4 v11, 0x0

    .line 329
    const/4 v12, 0x0

    .line 330
    invoke-static/range {v5 .. v14}, La/rjr0;->a(La/rjr0;La/a8q0;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZZI)La/rjr0;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-static {v1, v0, v2, v3}, La/pur0;->a(La/pur0;La/rjr0;Ljava/lang/String;I)La/pur0;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    const/16 v10, 0xdf

    .line 339
    .line 340
    const/4 v5, 0x0

    .line 341
    const/4 v8, 0x0

    .line 342
    move-object/from16 v4, p1

    .line 343
    .line 344
    invoke-static/range {v4 .. v10}, La/ftr0;->a(La/ftr0;La/vsr0;La/rm5;La/pur0;ZLa/jur0;I)La/ftr0;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    return-object v0

    .line 349
    :cond_5
    move-object/from16 v0, p0

    .line 350
    .line 351
    move-object/from16 v4, p1

    .line 352
    .line 353
    goto :goto_5

    .line 354
    nop

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
