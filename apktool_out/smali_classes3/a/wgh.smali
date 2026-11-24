.class public final synthetic La/wgh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qpg;


# direct methods
.method public synthetic constructor <init>(La/qpg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wgh;->a:B

    iput-object p1, p0, La/wgh;->b:La/qpg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wgh;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/wgh;->b:La/qpg;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Long;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    iget-object v0, v0, La/qpg;->a:La/vqg;

    .line 19
    .line 20
    iget-object v1, v0, La/vqg;->K:La/p7m0;

    .line 21
    .line 22
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v2, v0

    .line 27
    check-cast v2, La/wmm0;

    .line 28
    .line 29
    sget-object v5, La/kqg;->b:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const/4 v7, 0x0

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    move-object v8, v6

    .line 47
    check-cast v8, La/u1h;

    .line 48
    .line 49
    iget-byte v8, v8, La/u1h;->a:B

    .line 50
    .line 51
    int-to-long v8, v8

    .line 52
    cmp-long v8, v8, v3

    .line 53
    .line 54
    if-nez v8, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    move-object v6, v7

    .line 58
    :goto_0
    if-eqz v6, :cond_3

    .line 59
    .line 60
    const/16 v19, 0x0

    .line 61
    .line 62
    const/16 v20, 0x3fe

    .line 63
    .line 64
    const-wide/16 v5, 0x0

    .line 65
    .line 66
    const-wide/16 v7, 0x0

    .line 67
    .line 68
    const-wide/16 v9, 0x0

    .line 69
    .line 70
    const-wide/16 v11, 0x0

    .line 71
    .line 72
    const-wide/16 v13, 0x0

    .line 73
    .line 74
    const/4 v15, 0x0

    .line 75
    const/16 v16, 0x0

    .line 76
    .line 77
    const-wide/16 v17, 0x0

    .line 78
    .line 79
    invoke-static/range {v2 .. v20}, La/wmm0;->a(La/wmm0;JJJJJJLa/o4i0;La/hyx;JLjava/util/ArrayList;I)La/wmm0;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    goto/16 :goto_4

    .line 84
    .line 85
    :cond_3
    sget-object v5, La/kqg;->a:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_5

    .line 96
    .line 97
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    move-object v8, v6

    .line 102
    check-cast v8, La/mog;

    .line 103
    .line 104
    iget-byte v8, v8, La/mog;->a:B

    .line 105
    .line 106
    int-to-long v8, v8

    .line 107
    cmp-long v8, v8, v3

    .line 108
    .line 109
    if-nez v8, :cond_4

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    move-object v6, v7

    .line 113
    :goto_1
    if-eqz v6, :cond_6

    .line 114
    .line 115
    const/16 v19, 0x0

    .line 116
    .line 117
    const/16 v20, 0x3fb

    .line 118
    .line 119
    move-wide v5, v3

    .line 120
    const-wide/16 v3, 0x0

    .line 121
    .line 122
    move-wide v7, v5

    .line 123
    const-wide/16 v5, 0x0

    .line 124
    .line 125
    const-wide/16 v9, 0x0

    .line 126
    .line 127
    const-wide/16 v11, 0x0

    .line 128
    .line 129
    const-wide/16 v13, 0x0

    .line 130
    .line 131
    const/4 v15, 0x0

    .line 132
    const/16 v16, 0x0

    .line 133
    .line 134
    const-wide/16 v17, 0x0

    .line 135
    .line 136
    invoke-static/range {v2 .. v20}, La/wmm0;->a(La/wmm0;JJJJJJLa/o4i0;La/hyx;JLjava/util/ArrayList;I)La/wmm0;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    move-wide v3, v7

    .line 141
    goto/16 :goto_4

    .line 142
    .line 143
    :cond_6
    sget-object v5, La/jgh;->a:Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_8

    .line 154
    .line 155
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    move-object v8, v6

    .line 160
    check-cast v8, La/igh;

    .line 161
    .line 162
    iget-byte v8, v8, La/igh;->a:B

    .line 163
    .line 164
    int-to-long v8, v8

    .line 165
    cmp-long v8, v8, v3

    .line 166
    .line 167
    if-nez v8, :cond_7

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_8
    move-object v6, v7

    .line 171
    :goto_2
    if-eqz v6, :cond_9

    .line 172
    .line 173
    const/16 v19, 0x0

    .line 174
    .line 175
    const/16 v20, 0x3ef

    .line 176
    .line 177
    move-wide v5, v3

    .line 178
    const-wide/16 v3, 0x0

    .line 179
    .line 180
    move-wide v7, v5

    .line 181
    const-wide/16 v5, 0x0

    .line 182
    .line 183
    move-wide v9, v7

    .line 184
    const-wide/16 v7, 0x0

    .line 185
    .line 186
    move-wide v11, v9

    .line 187
    const-wide/16 v9, 0x0

    .line 188
    .line 189
    const-wide/16 v13, 0x0

    .line 190
    .line 191
    const/4 v15, 0x0

    .line 192
    const/16 v16, 0x0

    .line 193
    .line 194
    const-wide/16 v17, 0x0

    .line 195
    .line 196
    invoke-static/range {v2 .. v20}, La/wmm0;->a(La/wmm0;JJJJJJLa/o4i0;La/hyx;JLjava/util/ArrayList;I)La/wmm0;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    move-wide v3, v11

    .line 201
    goto/16 :goto_4

    .line 202
    .line 203
    :cond_9
    sget-object v5, La/upp0;->a:Ljava/util/List;

    .line 204
    .line 205
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    :cond_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    if-eqz v6, :cond_b

    .line 214
    .line 215
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    move-object v8, v6

    .line 220
    check-cast v8, La/jma0;

    .line 221
    .line 222
    iget-byte v8, v8, La/jma0;->a:B

    .line 223
    .line 224
    int-to-long v8, v8

    .line 225
    cmp-long v8, v8, v3

    .line 226
    .line 227
    if-nez v8, :cond_a

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_b
    move-object v6, v7

    .line 231
    :goto_3
    if-eqz v6, :cond_c

    .line 232
    .line 233
    const/16 v19, 0x0

    .line 234
    .line 235
    const/16 v20, 0x3f7

    .line 236
    .line 237
    move-wide v5, v3

    .line 238
    const-wide/16 v3, 0x0

    .line 239
    .line 240
    move-wide v7, v5

    .line 241
    const-wide/16 v5, 0x0

    .line 242
    .line 243
    move-wide v9, v7

    .line 244
    const-wide/16 v7, 0x0

    .line 245
    .line 246
    const-wide/16 v11, 0x0

    .line 247
    .line 248
    const-wide/16 v13, 0x0

    .line 249
    .line 250
    const/4 v15, 0x0

    .line 251
    const/16 v16, 0x0

    .line 252
    .line 253
    const-wide/16 v17, 0x0

    .line 254
    .line 255
    invoke-static/range {v2 .. v20}, La/wmm0;->a(La/wmm0;JJJJJJLa/o4i0;La/hyx;JLjava/util/ArrayList;I)La/wmm0;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    move-wide v3, v9

    .line 260
    goto :goto_4

    .line 261
    :cond_c
    sget-object v5, La/hc6;->a:Ljava/util/List;

    .line 262
    .line 263
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    :cond_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-eqz v6, :cond_e

    .line 272
    .line 273
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v6

    .line 277
    move-object v8, v6

    .line 278
    check-cast v8, La/lc6;

    .line 279
    .line 280
    invoke-interface {v8}, La/lc6;->a()J

    .line 281
    .line 282
    .line 283
    move-result-wide v8

    .line 284
    cmp-long v8, v8, v3

    .line 285
    .line 286
    if-nez v8, :cond_d

    .line 287
    .line 288
    move-object v7, v6

    .line 289
    :cond_e
    if-eqz v7, :cond_f

    .line 290
    .line 291
    const/16 v19, 0x0

    .line 292
    .line 293
    const/16 v20, 0x3df

    .line 294
    .line 295
    move-wide v5, v3

    .line 296
    const-wide/16 v3, 0x0

    .line 297
    .line 298
    move-wide v7, v5

    .line 299
    const-wide/16 v5, 0x0

    .line 300
    .line 301
    move-wide v9, v7

    .line 302
    const-wide/16 v7, 0x0

    .line 303
    .line 304
    move-wide v11, v9

    .line 305
    const-wide/16 v9, 0x0

    .line 306
    .line 307
    move-wide v13, v11

    .line 308
    const-wide/16 v11, 0x0

    .line 309
    .line 310
    const/4 v15, 0x0

    .line 311
    const/16 v16, 0x0

    .line 312
    .line 313
    const-wide/16 v17, 0x0

    .line 314
    .line 315
    invoke-static/range {v2 .. v20}, La/wmm0;->a(La/wmm0;JJJJJJLa/o4i0;La/hyx;JLjava/util/ArrayList;I)La/wmm0;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    move-wide v3, v13

    .line 320
    goto :goto_4

    .line 321
    :cond_f
    const/16 v19, 0x0

    .line 322
    .line 323
    const/16 v20, 0x3fd

    .line 324
    .line 325
    move-wide v5, v3

    .line 326
    const-wide/16 v3, 0x0

    .line 327
    .line 328
    const-wide/16 v7, 0x0

    .line 329
    .line 330
    const-wide/16 v9, 0x0

    .line 331
    .line 332
    const-wide/16 v11, 0x0

    .line 333
    .line 334
    const-wide/16 v13, 0x0

    .line 335
    .line 336
    const/4 v15, 0x0

    .line 337
    const/16 v16, 0x0

    .line 338
    .line 339
    const-wide/16 v17, 0x0

    .line 340
    .line 341
    invoke-static/range {v2 .. v20}, La/wmm0;->a(La/wmm0;JJJJJJLa/o4i0;La/hyx;JLjava/util/ArrayList;I)La/wmm0;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    move-wide v3, v5

    .line 346
    :goto_4
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    if-eqz v0, :cond_0

    .line 351
    .line 352
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    return-object v0

    .line 355
    :pswitch_0
    move-object/from16 v1, p1

    .line 356
    .line 357
    check-cast v1, La/cp;

    .line 358
    .line 359
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    new-instance v2, La/ngh;

    .line 363
    .line 364
    invoke-direct {v2, v1, v0}, La/ngh;-><init>(La/cp;La/qpg;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1, v2}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 368
    .line 369
    .line 370
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    return-object v0

    .line 373
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
