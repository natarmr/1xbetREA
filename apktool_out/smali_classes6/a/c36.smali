.class public final synthetic La/c36;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/iqt;La/bzt;La/dmt;La/pru;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput-byte v0, p0, La/c36;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/c36;->d:Ljava/lang/Object;

    iput-object p2, p0, La/c36;->e:Ljava/lang/Object;

    iput-object p3, p0, La/c36;->f:Ljava/lang/Object;

    iput-object p4, p0, La/c36;->c:Ljava/lang/Object;

    iput-object p5, p0, La/c36;->g:Ljava/lang/Object;

    iput-boolean p6, p0, La/c36;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(La/x3m;La/vtj;ZLa/agk0;La/l7m0;La/pz40;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/c36;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/c36;->d:Ljava/lang/Object;

    iput-object p2, p0, La/c36;->e:Ljava/lang/Object;

    iput-boolean p3, p0, La/c36;->b:Z

    iput-object p4, p0, La/c36;->f:Ljava/lang/Object;

    iput-object p5, p0, La/c36;->g:Ljava/lang/Object;

    iput-object p6, p0, La/c36;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;ZLa/pz40;La/pz40;)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput-byte v0, p0, La/c36;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/c36;->d:Ljava/lang/Object;

    iput-object p2, p0, La/c36;->e:Ljava/lang/Object;

    iput-object p3, p0, La/c36;->f:Ljava/lang/Object;

    iput-boolean p4, p0, La/c36;->b:Z

    iput-object p5, p0, La/c36;->c:Ljava/lang/Object;

    iput-object p6, p0, La/c36;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/c36;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-boolean v3, v0, La/c36;->b:Z

    .line 7
    .line 8
    iget-object v4, v0, La/c36;->g:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, v0, La/c36;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, v0, La/c36;->f:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v7, v0, La/c36;->e:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v8, v0, La/c36;->d:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast v8, La/iqt;

    .line 22
    .line 23
    check-cast v7, La/bzt;

    .line 24
    .line 25
    check-cast v6, La/dmt;

    .line 26
    .line 27
    check-cast v5, La/pru;

    .line 28
    .line 29
    move-object/from16 v21, v4

    .line 30
    .line 31
    check-cast v21, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 32
    .line 33
    iget-object v1, v8, La/iqt;->a:La/gst0;

    .line 34
    .line 35
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    iget-object v1, v7, La/bzt;->a:La/fsd;

    .line 40
    .line 41
    invoke-virtual {v1}, La/fsd;->a()La/v8d;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget v15, v1, La/v8d;->r:I

    .line 46
    .line 47
    invoke-virtual {v6}, La/dmt;->b()La/kg;

    .line 48
    .line 49
    .line 50
    move-result-object v16

    .line 51
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    iget-object v1, v1, La/sff0;->b:La/hl1;

    .line 56
    .line 57
    iget-object v1, v1, La/hl1;->l:La/ot0;

    .line 58
    .line 59
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iget-object v2, v2, La/sff0;->b:La/hl1;

    .line 64
    .line 65
    iget-object v2, v2, La/hl1;->e:La/hr10;

    .line 66
    .line 67
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iget-object v3, v3, La/sff0;->b:La/hl1;

    .line 72
    .line 73
    iget-boolean v3, v3, La/hl1;->C:Z

    .line 74
    .line 75
    invoke-virtual {v5}, La/pru;->a()La/sff0;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    iget-boolean v4, v4, La/sff0;->O0:Z

    .line 80
    .line 81
    sget-object v22, La/iun;->a:La/iun;

    .line 82
    .line 83
    sget-object v23, La/xun;->a:La/xun;

    .line 84
    .line 85
    new-instance v9, La/yu80;

    .line 86
    .line 87
    const/4 v14, 0x1

    .line 88
    const/16 v25, 0x0

    .line 89
    .line 90
    const/4 v10, 0x1

    .line 91
    const/4 v11, 0x0

    .line 92
    const/4 v12, 0x0

    .line 93
    sget-object v24, La/fu80;->a:La/fu80;

    .line 94
    .line 95
    iget-boolean v0, v0, La/c36;->b:Z

    .line 96
    .line 97
    move/from16 v26, v0

    .line 98
    .line 99
    move-object/from16 v17, v1

    .line 100
    .line 101
    move-object/from16 v18, v2

    .line 102
    .line 103
    move/from16 v19, v3

    .line 104
    .line 105
    move/from16 v20, v4

    .line 106
    .line 107
    invoke-direct/range {v9 .. v26}, La/yu80;-><init>(ZZZZZILa/kg;La/ot0;La/hr10;ZZLorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/gu80;La/ql5;Z)V

    .line 108
    .line 109
    .line 110
    return-object v9

    .line 111
    :pswitch_0
    check-cast v8, La/x3m;

    .line 112
    .line 113
    iget-object v0, v8, La/x3m;->a:La/pz40;

    .line 114
    .line 115
    check-cast v7, La/vtj;

    .line 116
    .line 117
    check-cast v6, La/agk0;

    .line 118
    .line 119
    check-cast v4, La/l7m0;

    .line 120
    .line 121
    check-cast v5, La/pz40;

    .line 122
    .line 123
    invoke-virtual {v6}, La/agk0;->l()F

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    const/4 v6, 0x0

    .line 128
    cmpg-float v1, v1, v6

    .line 129
    .line 130
    if-gtz v1, :cond_0

    .line 131
    .line 132
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    goto/16 :goto_4

    .line 135
    .line 136
    :cond_0
    iget-object v1, v8, La/x3m;->d:La/rv2;

    .line 137
    .line 138
    iget-object v6, v1, La/rv2;->e:La/zbk;

    .line 139
    .line 140
    move-object v9, v0

    .line 141
    check-cast v9, La/hgk0;

    .line 142
    .line 143
    invoke-virtual {v9}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    check-cast v9, Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    invoke-virtual {v8}, La/x3m;->d()Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    iget-object v10, v1, La/rv2;->c:La/pz40;

    .line 158
    .line 159
    iget-object v11, v1, La/rv2;->f:La/agk0;

    .line 160
    .line 161
    check-cast v10, La/hgk0;

    .line 162
    .line 163
    invoke-virtual {v10}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    invoke-virtual {v6}, La/zbk;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    if-ne v12, v13, :cond_1

    .line 172
    .line 173
    const/4 v2, 0x1

    .line 174
    :cond_1
    if-eqz v9, :cond_4

    .line 175
    .line 176
    invoke-virtual {v11}, La/agk0;->l()F

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    if-eqz v9, :cond_2

    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_2
    if-eqz v2, :cond_3

    .line 188
    .line 189
    invoke-virtual {v10}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, La/y3m;

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_3
    invoke-virtual {v11}, La/agk0;->l()F

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    invoke-virtual {v7, v2}, La/vtj;->a(F)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, La/y3m;

    .line 205
    .line 206
    if-nez v2, :cond_5

    .line 207
    .line 208
    invoke-virtual {v6}, La/zbk;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    check-cast v2, La/y3m;

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_4
    :goto_0
    invoke-virtual {v6}, La/zbk;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    check-cast v2, La/y3m;

    .line 220
    .line 221
    :cond_5
    :goto_1
    if-eqz v8, :cond_6

    .line 222
    .line 223
    sget-object v2, La/y3m;->c:La/y3m;

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_6
    if-eqz v3, :cond_7

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_7
    invoke-virtual {v6}, La/zbk;->getValue()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    sget-object v6, La/y3m;->a:La/y3m;

    .line 234
    .line 235
    if-ne v3, v6, :cond_8

    .line 236
    .line 237
    :goto_2
    move-object v2, v6

    .line 238
    goto :goto_3

    .line 239
    :cond_8
    invoke-virtual {v10}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    sget-object v8, La/y3m;->b:La/y3m;

    .line 244
    .line 245
    if-ne v3, v8, :cond_9

    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_9
    :goto_3
    invoke-virtual {v1, v7, v2}, La/rv2;->i(La/vtj;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 252
    .line 253
    check-cast v0, La/hgk0;

    .line 254
    .line 255
    invoke-virtual {v0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    check-cast v0, Ljava/lang/Boolean;

    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-eqz v0, :cond_a

    .line 269
    .line 270
    invoke-interface {v5, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 274
    .line 275
    :goto_4
    return-object v0

    .line 276
    :pswitch_1
    check-cast v8, Lkotlin/Pair;

    .line 277
    .line 278
    check-cast v7, Ljava/lang/String;

    .line 279
    .line 280
    check-cast v6, Ljava/lang/String;

    .line 281
    .line 282
    check-cast v5, La/pz40;

    .line 283
    .line 284
    check-cast v4, La/pz40;

    .line 285
    .line 286
    invoke-interface {v5, v8}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    if-eqz v7, :cond_d

    .line 290
    .line 291
    new-instance v0, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    :goto_5
    if-ge v2, v1, :cond_c

    .line 301
    .line 302
    invoke-virtual {v6, v2}, Ljava/lang/String;->charAt(I)C

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    invoke-static {v7, v5}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    .line 307
    .line 308
    .line 309
    move-result v8

    .line 310
    if-eqz v8, :cond_b

    .line 311
    .line 312
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 313
    .line 314
    .line 315
    :cond_b
    add-int/lit8 v2, v2, 0x1

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v6

    .line 322
    :cond_d
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    check-cast v0, La/a8q0;

    .line 327
    .line 328
    iget-object v0, v0, La/a8q0;->a:La/j83;

    .line 329
    .line 330
    iget-object v0, v0, La/j83;->b:Ljava/lang/String;

    .line 331
    .line 332
    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-nez v0, :cond_f

    .line 337
    .line 338
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    check-cast v0, La/a8q0;

    .line 343
    .line 344
    if-eqz v3, :cond_e

    .line 345
    .line 346
    sget-wide v1, La/o9q0;->b:J

    .line 347
    .line 348
    goto :goto_6

    .line 349
    :cond_e
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    invoke-static {v1, v1}, La/s7n0;->e(II)J

    .line 354
    .line 355
    .line 356
    move-result-wide v1

    .line 357
    :goto_6
    const/4 v3, 0x4

    .line 358
    invoke-static {v0, v6, v1, v2, v3}, La/a8q0;->b(La/a8q0;Ljava/lang/String;JI)La/a8q0;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-interface {v4, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    :cond_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    return-object v0

    .line 368
    nop

    .line 369
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
