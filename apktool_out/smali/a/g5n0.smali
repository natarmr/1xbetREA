.class public final synthetic La/g5n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p4e;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:La/g9q0;


# direct methods
.method public synthetic constructor <init>(La/p4e;Ljava/lang/String;Ljava/lang/String;La/g9q0;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/g5n0;->a:B

    iput-object p1, p0, La/g5n0;->b:La/p4e;

    iput-object p2, p0, La/g5n0;->c:Ljava/lang/String;

    iput-object p3, p0, La/g5n0;->d:Ljava/lang/String;

    iput-object p4, p0, La/g5n0;->e:La/g9q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g5n0;->a:B

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/g5n0;->b:La/p4e;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/daq0;

    .line 17
    .line 18
    iget-wide v5, v5, La/p4e;->a:J

    .line 19
    .line 20
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    iget-wide v9, v1, La/daq0;->a:J

    .line 25
    .line 26
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    const/16 v23, 0x0

    .line 31
    .line 32
    const v24, 0xfffffd

    .line 33
    .line 34
    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    const/4 v11, 0x0

    .line 38
    const/4 v12, 0x0

    .line 39
    const/4 v13, 0x0

    .line 40
    const-wide/16 v14, 0x0

    .line 41
    .line 42
    const/16 v16, 0x0

    .line 43
    .line 44
    const/16 v17, 0x0

    .line 45
    .line 46
    const/16 v18, 0x0

    .line 47
    .line 48
    const/16 v19, 0x0

    .line 49
    .line 50
    const-wide/16 v20, 0x0

    .line 51
    .line 52
    const/16 v22, 0x0

    .line 53
    .line 54
    invoke-static/range {v6 .. v24}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 55
    .line 56
    .line 57
    move-result-object v27

    .line 58
    invoke-static {v3, v5, v3, v3, v2}, La/r4e;->b(IIIII)J

    .line 59
    .line 60
    .line 61
    move-result-wide v30

    .line 62
    const/16 v32, 0x0

    .line 63
    .line 64
    const/16 v33, 0x3cc

    .line 65
    .line 66
    iget-object v11, v0, La/g5n0;->e:La/g9q0;

    .line 67
    .line 68
    iget-object v1, v0, La/g5n0;->c:Ljava/lang/String;

    .line 69
    .line 70
    const/16 v28, 0x0

    .line 71
    .line 72
    const/16 v29, 0x2

    .line 73
    .line 74
    move-object/from16 v26, v1

    .line 75
    .line 76
    move-object/from16 v25, v11

    .line 77
    .line 78
    invoke-static/range {v25 .. v33}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, La/a9q0;->e()Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-nez v6, :cond_1

    .line 87
    .line 88
    invoke-virtual {v1}, La/a9q0;->d()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-nez v6, :cond_1

    .line 93
    .line 94
    invoke-virtual {v1}, La/a9q0;->f()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_0

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    move v1, v3

    .line 102
    goto :goto_1

    .line 103
    :cond_1
    :goto_0
    move v1, v4

    .line 104
    :goto_1
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    const/16 v23, 0x0

    .line 109
    .line 110
    const v24, 0xfffffd

    .line 111
    .line 112
    .line 113
    const-wide/16 v7, 0x0

    .line 114
    .line 115
    const/4 v11, 0x0

    .line 116
    const/4 v12, 0x0

    .line 117
    const/4 v13, 0x0

    .line 118
    const-wide/16 v14, 0x0

    .line 119
    .line 120
    const/16 v16, 0x0

    .line 121
    .line 122
    const/16 v17, 0x0

    .line 123
    .line 124
    const/16 v18, 0x0

    .line 125
    .line 126
    const/16 v19, 0x0

    .line 127
    .line 128
    const-wide/16 v20, 0x0

    .line 129
    .line 130
    const/16 v22, 0x0

    .line 131
    .line 132
    invoke-static/range {v6 .. v24}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    invoke-static {v3, v5, v3, v3, v2}, La/r4e;->b(IIIII)J

    .line 137
    .line 138
    .line 139
    move-result-wide v16

    .line 140
    const/16 v18, 0x0

    .line 141
    .line 142
    const/16 v19, 0x3cc

    .line 143
    .line 144
    iget-object v12, v0, La/g5n0;->d:Ljava/lang/String;

    .line 145
    .line 146
    const/4 v14, 0x0

    .line 147
    const/4 v15, 0x2

    .line 148
    move-object/from16 v11, v25

    .line 149
    .line 150
    invoke-static/range {v11 .. v19}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v0}, La/a9q0;->e()Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-nez v2, :cond_3

    .line 159
    .line 160
    invoke-virtual {v0}, La/a9q0;->d()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_3

    .line 165
    .line 166
    invoke-virtual {v0}, La/a9q0;->f()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_2

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_2
    move v0, v3

    .line 174
    goto :goto_3

    .line 175
    :cond_3
    :goto_2
    move v0, v4

    .line 176
    :goto_3
    if-nez v1, :cond_4

    .line 177
    .line 178
    if-eqz v0, :cond_5

    .line 179
    .line 180
    :cond_4
    move v3, v4

    .line 181
    :cond_5
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    return-object v0

    .line 186
    :pswitch_0
    move-object/from16 v1, p1

    .line 187
    .line 188
    check-cast v1, La/daq0;

    .line 189
    .line 190
    iget-wide v5, v5, La/p4e;->a:J

    .line 191
    .line 192
    invoke-static {v5, v6}, La/p4e;->i(J)I

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    iget-wide v9, v1, La/daq0;->a:J

    .line 197
    .line 198
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    const/16 v23, 0x0

    .line 203
    .line 204
    const v24, 0xfffffd

    .line 205
    .line 206
    .line 207
    const-wide/16 v7, 0x0

    .line 208
    .line 209
    const/4 v11, 0x0

    .line 210
    const/4 v12, 0x0

    .line 211
    const/4 v13, 0x0

    .line 212
    const-wide/16 v14, 0x0

    .line 213
    .line 214
    const/16 v16, 0x0

    .line 215
    .line 216
    const/16 v17, 0x0

    .line 217
    .line 218
    const/16 v18, 0x0

    .line 219
    .line 220
    const/16 v19, 0x0

    .line 221
    .line 222
    const-wide/16 v20, 0x0

    .line 223
    .line 224
    const/16 v22, 0x0

    .line 225
    .line 226
    invoke-static/range {v6 .. v24}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 227
    .line 228
    .line 229
    move-result-object v27

    .line 230
    invoke-static {v3, v5, v3, v3, v2}, La/r4e;->b(IIIII)J

    .line 231
    .line 232
    .line 233
    move-result-wide v30

    .line 234
    const/16 v32, 0x0

    .line 235
    .line 236
    const/16 v33, 0x3cc

    .line 237
    .line 238
    iget-object v11, v0, La/g5n0;->e:La/g9q0;

    .line 239
    .line 240
    iget-object v1, v0, La/g5n0;->c:Ljava/lang/String;

    .line 241
    .line 242
    const/16 v28, 0x0

    .line 243
    .line 244
    const/16 v29, 0x5

    .line 245
    .line 246
    move-object/from16 v26, v1

    .line 247
    .line 248
    move-object/from16 v25, v11

    .line 249
    .line 250
    invoke-static/range {v25 .. v33}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-virtual {v1}, La/a9q0;->e()Z

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    if-nez v6, :cond_7

    .line 259
    .line 260
    invoke-virtual {v1}, La/a9q0;->d()Z

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    if-nez v6, :cond_7

    .line 265
    .line 266
    invoke-virtual {v1}, La/a9q0;->f()Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_6

    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_6
    move v1, v3

    .line 274
    goto :goto_5

    .line 275
    :cond_7
    :goto_4
    move v1, v4

    .line 276
    :goto_5
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 277
    .line 278
    .line 279
    move-result-object v6

    .line 280
    const/16 v23, 0x0

    .line 281
    .line 282
    const v24, 0xfffffd

    .line 283
    .line 284
    .line 285
    const-wide/16 v7, 0x0

    .line 286
    .line 287
    const/4 v11, 0x0

    .line 288
    const/4 v12, 0x0

    .line 289
    const/4 v13, 0x0

    .line 290
    const-wide/16 v14, 0x0

    .line 291
    .line 292
    const/16 v16, 0x0

    .line 293
    .line 294
    const/16 v17, 0x0

    .line 295
    .line 296
    const/16 v18, 0x0

    .line 297
    .line 298
    const/16 v19, 0x0

    .line 299
    .line 300
    const-wide/16 v20, 0x0

    .line 301
    .line 302
    const/16 v22, 0x0

    .line 303
    .line 304
    invoke-static/range {v6 .. v24}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 305
    .line 306
    .line 307
    move-result-object v13

    .line 308
    invoke-static {v3, v5, v3, v3, v2}, La/r4e;->b(IIIII)J

    .line 309
    .line 310
    .line 311
    move-result-wide v16

    .line 312
    const/16 v18, 0x0

    .line 313
    .line 314
    const/16 v19, 0x3cc

    .line 315
    .line 316
    iget-object v12, v0, La/g5n0;->d:Ljava/lang/String;

    .line 317
    .line 318
    const/4 v14, 0x0

    .line 319
    const/4 v15, 0x5

    .line 320
    move-object/from16 v11, v25

    .line 321
    .line 322
    invoke-static/range {v11 .. v19}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {v0}, La/a9q0;->e()Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-nez v2, :cond_9

    .line 331
    .line 332
    invoke-virtual {v0}, La/a9q0;->d()Z

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    if-nez v2, :cond_9

    .line 337
    .line 338
    invoke-virtual {v0}, La/a9q0;->f()Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-eqz v0, :cond_8

    .line 343
    .line 344
    goto :goto_6

    .line 345
    :cond_8
    move v0, v3

    .line 346
    goto :goto_7

    .line 347
    :cond_9
    :goto_6
    move v0, v4

    .line 348
    :goto_7
    if-nez v1, :cond_a

    .line 349
    .line 350
    if-eqz v0, :cond_b

    .line 351
    .line 352
    :cond_a
    move v3, v4

    .line 353
    :cond_b
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    return-object v0

    .line 358
    nop

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
