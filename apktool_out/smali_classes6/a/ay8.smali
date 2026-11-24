.class public final synthetic La/ay8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yx8;

.field public final synthetic c:La/by8;


# direct methods
.method public synthetic constructor <init>(La/by8;La/yx8;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/ay8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ay8;->c:La/by8;

    iput-object p2, p0, La/ay8;->b:La/yx8;

    return-void
.end method

.method public synthetic constructor <init>(La/yx8;La/by8;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/ay8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ay8;->b:La/yx8;

    iput-object p2, p0, La/ay8;->c:La/by8;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ay8;->a:B

    .line 4
    .line 5
    sget-object v2, La/fmm;->a:La/fmm;

    .line 6
    .line 7
    iget-object v3, v0, La/ay8;->c:La/by8;

    .line 8
    .line 9
    iget-object v0, v0, La/ay8;->b:La/yx8;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v4, La/imm;

    .line 22
    .line 23
    iget-boolean v0, v0, La/yx8;->n:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    new-instance v2, La/emm;

    .line 28
    .line 29
    iget-object v0, v3, La/by8;->l:La/n0o0;

    .line 30
    .line 31
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, La/fee;

    .line 36
    .line 37
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    new-instance v0, La/na50;

    .line 50
    .line 51
    new-instance v5, La/skm;

    .line 52
    .line 53
    const/4 v9, 0x0

    .line 54
    const/16 v10, 0x30

    .line 55
    .line 56
    const/4 v6, 0x0

    .line 57
    const v7, 0x7f0809ee

    .line 58
    .line 59
    .line 60
    const/4 v8, 0x1

    .line 61
    invoke-direct/range {v5 .. v10}, La/skm;-><init>(IIZLa/y3d;I)V

    .line 62
    .line 63
    .line 64
    new-instance v6, La/skm;

    .line 65
    .line 66
    const/4 v10, 0x0

    .line 67
    const/16 v11, 0x30

    .line 68
    .line 69
    const/4 v7, 0x1

    .line 70
    const v8, 0x7f080965

    .line 71
    .line 72
    .line 73
    const/4 v9, 0x1

    .line 74
    invoke-direct/range {v6 .. v11}, La/skm;-><init>(IIZLa/y3d;I)V

    .line 75
    .line 76
    .line 77
    invoke-direct {v0, v5, v6}, La/na50;-><init>(La/skm;La/skm;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    new-instance v0, La/la50;

    .line 82
    .line 83
    new-instance v5, La/skm;

    .line 84
    .line 85
    const/4 v9, 0x0

    .line 86
    const/16 v10, 0x30

    .line 87
    .line 88
    const/4 v6, 0x0

    .line 89
    const v7, 0x7f0809ee

    .line 90
    .line 91
    .line 92
    const/4 v8, 0x1

    .line 93
    invoke-direct/range {v5 .. v10}, La/skm;-><init>(IIZLa/y3d;I)V

    .line 94
    .line 95
    .line 96
    invoke-direct {v0, v5}, La/la50;-><init>(La/skm;)V

    .line 97
    .line 98
    .line 99
    :goto_0
    invoke-direct {v2, v0}, La/emm;-><init>(La/oa50;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    move-object v7, v2

    .line 103
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 104
    .line 105
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 106
    .line 107
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 108
    .line 109
    .line 110
    move-result-wide v8

    .line 111
    const/4 v10, 0x0

    .line 112
    const/4 v11, 0x0

    .line 113
    sget-object v5, La/jlm;->a:La/jlm;

    .line 114
    .line 115
    sget-object v6, La/mlm;->a:La/mlm;

    .line 116
    .line 117
    invoke-direct/range {v4 .. v11}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 118
    .line 119
    .line 120
    return-object v4

    .line 121
    :pswitch_0
    iget-object v1, v3, La/by8;->l:La/n0o0;

    .line 122
    .line 123
    iget-boolean v0, v0, La/yx8;->n:Z

    .line 124
    .line 125
    move-object/from16 v4, p1

    .line 126
    .line 127
    check-cast v4, La/xx8;

    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    new-instance v5, La/wkm;

    .line 133
    .line 134
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 135
    .line 136
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 141
    .line 142
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 143
    .line 144
    .line 145
    move-result-wide v10

    .line 146
    const/4 v6, 0x0

    .line 147
    const v7, 0x7f0809ee

    .line 148
    .line 149
    .line 150
    const/4 v8, 0x1

    .line 151
    sget-object v16, La/ra50;->a:La/ra50;

    .line 152
    .line 153
    move-object/from16 v9, v16

    .line 154
    .line 155
    invoke-direct/range {v5 .. v11}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 156
    .line 157
    .line 158
    new-instance v12, La/wkm;

    .line 159
    .line 160
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 165
    .line 166
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 167
    .line 168
    .line 169
    move-result-wide v17

    .line 170
    const/4 v13, 0x1

    .line 171
    const v14, 0x7f080965

    .line 172
    .line 173
    .line 174
    const/4 v15, 0x1

    .line 175
    invoke-direct/range {v12 .. v18}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 176
    .line 177
    .line 178
    new-instance v13, La/imm;

    .line 179
    .line 180
    new-instance v14, La/ilm;

    .line 181
    .line 182
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 187
    .line 188
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 189
    .line 190
    .line 191
    move-result-wide v6

    .line 192
    invoke-direct {v14, v6, v7}, La/ilm;-><init>(J)V

    .line 193
    .line 194
    .line 195
    iget-boolean v6, v4, La/xx8;->b:Z

    .line 196
    .line 197
    if-eqz v6, :cond_2

    .line 198
    .line 199
    new-instance v7, La/nlm;

    .line 200
    .line 201
    new-instance v8, La/hmm;

    .line 202
    .line 203
    iget-object v4, v4, La/xx8;->c:Ljava/lang/String;

    .line 204
    .line 205
    iget-object v9, v3, La/by8;->b:La/ctf0;

    .line 206
    .line 207
    const/4 v10, 0x0

    .line 208
    new-array v11, v10, [Ljava/lang/Object;

    .line 209
    .line 210
    iget-object v9, v9, La/ctf0;->b:La/lsm0;

    .line 211
    .line 212
    invoke-static {v11, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    const v15, 0x7f1311c4

    .line 217
    .line 218
    .line 219
    invoke-virtual {v9, v15, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v9

    .line 223
    const/16 v11, 0xa

    .line 224
    .line 225
    invoke-direct {v8, v11, v4, v9, v10}, La/hmm;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 226
    .line 227
    .line 228
    invoke-direct {v7, v8}, La/nlm;-><init>(La/hmm;)V

    .line 229
    .line 230
    .line 231
    :goto_1
    move-object v15, v7

    .line 232
    goto :goto_2

    .line 233
    :cond_2
    new-instance v7, La/plm;

    .line 234
    .line 235
    iget-object v4, v4, La/xx8;->a:Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    iget-object v8, v8, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 242
    .line 243
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 244
    .line 245
    .line 246
    move-result-wide v8

    .line 247
    sget-object v10, La/fa50;->a:La/fa50;

    .line 248
    .line 249
    invoke-direct {v7, v4, v8, v9, v10}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 250
    .line 251
    .line 252
    goto :goto_1

    .line 253
    :goto_2
    if-eqz v6, :cond_4

    .line 254
    .line 255
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    check-cast v1, La/fee;

    .line 260
    .line 261
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    check-cast v1, Ljava/lang/Boolean;

    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-eqz v1, :cond_3

    .line 272
    .line 273
    if-eqz v0, :cond_3

    .line 274
    .line 275
    new-instance v2, La/dmm;

    .line 276
    .line 277
    new-instance v0, La/ta50;

    .line 278
    .line 279
    invoke-direct {v0, v12}, La/ta50;-><init>(La/wkm;)V

    .line 280
    .line 281
    .line 282
    invoke-direct {v2, v0}, La/dmm;-><init>(La/wa50;)V

    .line 283
    .line 284
    .line 285
    :cond_3
    :goto_3
    move-object/from16 v16, v2

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_4
    if-eqz v0, :cond_3

    .line 289
    .line 290
    new-instance v2, La/dmm;

    .line 291
    .line 292
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    check-cast v0, La/fee;

    .line 297
    .line 298
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    check-cast v0, Ljava/lang/Boolean;

    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-eqz v0, :cond_5

    .line 309
    .line 310
    new-instance v0, La/va50;

    .line 311
    .line 312
    invoke-direct {v0, v5, v12}, La/va50;-><init>(La/wkm;La/wkm;)V

    .line 313
    .line 314
    .line 315
    goto :goto_4

    .line 316
    :cond_5
    new-instance v0, La/ta50;

    .line 317
    .line 318
    invoke-direct {v0, v5}, La/ta50;-><init>(La/wkm;)V

    .line 319
    .line 320
    .line 321
    :goto_4
    invoke-direct {v2, v0}, La/dmm;-><init>(La/wa50;)V

    .line 322
    .line 323
    .line 324
    goto :goto_3

    .line 325
    :goto_5
    iget-object v0, v3, La/by8;->B:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, La/ix8;

    .line 328
    .line 329
    sget-object v1, La/ix8;->a:La/ix8;

    .line 330
    .line 331
    if-ne v0, v1, :cond_6

    .line 332
    .line 333
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 338
    .line 339
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 340
    .line 341
    .line 342
    move-result-wide v0

    .line 343
    :goto_6
    move-wide/from16 v17, v0

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_6
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 347
    .line 348
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 349
    .line 350
    .line 351
    move-result-wide v0

    .line 352
    goto :goto_6

    .line 353
    :goto_7
    const/16 v19, 0x0

    .line 354
    .line 355
    const/16 v20, 0x0

    .line 356
    .line 357
    invoke-direct/range {v13 .. v20}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 358
    .line 359
    .line 360
    return-object v13

    .line 361
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
