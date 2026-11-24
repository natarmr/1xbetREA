.class public final La/hki;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/n5d0;


# direct methods
.method public synthetic constructor <init>(La/n5d0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hki;->a:B

    iput-object p1, p0, La/hki;->b:La/n5d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hki;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x16

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v0, v0, La/hki;->b:La/n5d0;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v6, p1

    .line 15
    .line 16
    check-cast v6, La/i1w0;

    .line 17
    .line 18
    new-instance v5, La/clc0;

    .line 19
    .line 20
    check-cast v0, La/c7i;

    .line 21
    .line 22
    iget-object v1, v0, La/c7i;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, La/iyi;

    .line 25
    .line 26
    new-instance v7, La/tpx;

    .line 27
    .line 28
    iget-object v8, v1, La/iyi;->b:La/tnc0;

    .line 29
    .line 30
    invoke-direct {v7, v8, v4}, La/tpx;-><init>(La/tnc0;B)V

    .line 31
    .line 32
    .line 33
    iget-object v8, v1, La/iyi;->d:La/s470;

    .line 34
    .line 35
    iget-object v4, v1, La/iyi;->a:La/g8i;

    .line 36
    .line 37
    invoke-virtual {v4}, La/g8i;->T()La/uf3;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    iget-object v0, v0, La/c7i;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, La/kki;

    .line 44
    .line 45
    new-instance v10, La/oif0;

    .line 46
    .line 47
    iget-object v0, v0, La/kki;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, La/iyi;

    .line 50
    .line 51
    iget-object v11, v0, La/iyi;->f:La/fhj;

    .line 52
    .line 53
    iget-object v12, v0, La/iyi;->a:La/g8i;

    .line 54
    .line 55
    invoke-virtual {v12}, La/g8i;->f5()La/ntu;

    .line 56
    .line 57
    .line 58
    move-result-object v13

    .line 59
    invoke-virtual {v12}, La/g8i;->g3()La/iqt;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    invoke-direct {v10, v11, v13, v12, v3}, La/oif0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    new-instance v11, La/ieu;

    .line 67
    .line 68
    iget-object v3, v0, La/iyi;->c:La/wsf0;

    .line 69
    .line 70
    iget-object v3, v3, La/wsf0;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v3, La/g45;

    .line 73
    .line 74
    invoke-virtual {v3}, La/g45;->E()La/nou;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-object v12, v0, La/iyi;->e:La/rkc0;

    .line 79
    .line 80
    invoke-direct {v11, v3, v12}, La/ieu;-><init>(La/nou;La/rkc0;)V

    .line 81
    .line 82
    .line 83
    new-instance v12, La/pyu;

    .line 84
    .line 85
    iget-object v3, v0, La/iyi;->b:La/tnc0;

    .line 86
    .line 87
    invoke-direct {v12, v3}, La/pyu;-><init>(La/tnc0;)V

    .line 88
    .line 89
    .line 90
    new-instance v13, La/lef0;

    .line 91
    .line 92
    iget-object v3, v0, La/iyi;->b:La/tnc0;

    .line 93
    .line 94
    invoke-direct {v13, v3}, La/lef0;-><init>(La/tnc0;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, La/g8i;->v1()La/mne;

    .line 98
    .line 99
    .line 100
    move-result-object v14

    .line 101
    new-instance v15, La/wsf0;

    .line 102
    .line 103
    iget-object v1, v1, La/iyi;->b:La/tnc0;

    .line 104
    .line 105
    invoke-direct {v15, v1}, La/wsf0;-><init>(La/tnc0;)V

    .line 106
    .line 107
    .line 108
    new-instance v1, La/tpx;

    .line 109
    .line 110
    iget-object v0, v0, La/iyi;->b:La/tnc0;

    .line 111
    .line 112
    invoke-direct {v1, v0, v2}, La/tpx;-><init>(La/tnc0;B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, La/g8i;->q1()La/m1e;

    .line 116
    .line 117
    .line 118
    move-result-object v18

    .line 119
    invoke-static/range {v18 .. v18}, La/x1x;->x(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    const/16 v17, 0x0

    .line 123
    .line 124
    move-object/from16 v16, v1

    .line 125
    .line 126
    invoke-direct/range {v5 .. v18}, La/clc0;-><init>(La/i1w0;La/tpx;La/s470;La/uf3;La/oif0;La/ieu;La/pyu;La/lef0;La/mne;La/wsf0;La/tpx;ZLa/m1e;)V

    .line 127
    .line 128
    .line 129
    return-object v5

    .line 130
    :pswitch_0
    move-object/from16 v7, p1

    .line 131
    .line 132
    check-cast v7, La/i1w0;

    .line 133
    .line 134
    new-instance v6, La/clc0;

    .line 135
    .line 136
    check-cast v0, La/c7i;

    .line 137
    .line 138
    iget-object v1, v0, La/c7i;->c:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, La/nli;

    .line 141
    .line 142
    new-instance v8, La/tpx;

    .line 143
    .line 144
    iget-object v5, v1, La/nli;->b:La/tnc0;

    .line 145
    .line 146
    invoke-direct {v8, v5, v4}, La/tpx;-><init>(La/tnc0;B)V

    .line 147
    .line 148
    .line 149
    sget-object v9, La/s470;->c:La/s470;

    .line 150
    .line 151
    iget-object v4, v1, La/nli;->a:La/g8i;

    .line 152
    .line 153
    invoke-virtual {v4}, La/g8i;->T()La/uf3;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    iget-object v0, v0, La/c7i;->d:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, La/kki;

    .line 160
    .line 161
    new-instance v11, La/oif0;

    .line 162
    .line 163
    iget-object v0, v0, La/kki;->e:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, La/nli;

    .line 166
    .line 167
    iget-object v5, v0, La/nli;->e:La/fhj;

    .line 168
    .line 169
    iget-object v12, v0, La/nli;->a:La/g8i;

    .line 170
    .line 171
    invoke-virtual {v12}, La/g8i;->f5()La/ntu;

    .line 172
    .line 173
    .line 174
    move-result-object v13

    .line 175
    invoke-virtual {v12}, La/g8i;->g3()La/iqt;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    invoke-direct {v11, v5, v13, v12, v3}, La/oif0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 180
    .line 181
    .line 182
    new-instance v12, La/ieu;

    .line 183
    .line 184
    iget-object v3, v0, La/nli;->c:La/wsf0;

    .line 185
    .line 186
    iget-object v3, v3, La/wsf0;->b:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v3, La/g45;

    .line 189
    .line 190
    invoke-virtual {v3}, La/g45;->E()La/nou;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    iget-object v5, v0, La/nli;->d:La/rkc0;

    .line 195
    .line 196
    invoke-direct {v12, v3, v5}, La/ieu;-><init>(La/nou;La/rkc0;)V

    .line 197
    .line 198
    .line 199
    new-instance v13, La/pyu;

    .line 200
    .line 201
    iget-object v3, v0, La/nli;->b:La/tnc0;

    .line 202
    .line 203
    invoke-direct {v13, v3}, La/pyu;-><init>(La/tnc0;)V

    .line 204
    .line 205
    .line 206
    new-instance v14, La/lef0;

    .line 207
    .line 208
    iget-object v3, v0, La/nli;->b:La/tnc0;

    .line 209
    .line 210
    invoke-direct {v14, v3}, La/lef0;-><init>(La/tnc0;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v4}, La/g8i;->v1()La/mne;

    .line 214
    .line 215
    .line 216
    move-result-object v15

    .line 217
    new-instance v3, La/wsf0;

    .line 218
    .line 219
    iget-object v1, v1, La/nli;->b:La/tnc0;

    .line 220
    .line 221
    invoke-direct {v3, v1}, La/wsf0;-><init>(La/tnc0;)V

    .line 222
    .line 223
    .line 224
    new-instance v1, La/tpx;

    .line 225
    .line 226
    iget-object v0, v0, La/nli;->b:La/tnc0;

    .line 227
    .line 228
    invoke-direct {v1, v0, v2}, La/tpx;-><init>(La/tnc0;B)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v4}, La/g8i;->q1()La/m1e;

    .line 232
    .line 233
    .line 234
    move-result-object v19

    .line 235
    invoke-static/range {v19 .. v19}, La/x1x;->x(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    const/16 v18, 0x1

    .line 239
    .line 240
    move-object/from16 v17, v1

    .line 241
    .line 242
    move-object/from16 v16, v3

    .line 243
    .line 244
    invoke-direct/range {v6 .. v19}, La/clc0;-><init>(La/i1w0;La/tpx;La/s470;La/uf3;La/oif0;La/ieu;La/pyu;La/lef0;La/mne;La/wsf0;La/tpx;ZLa/m1e;)V

    .line 245
    .line 246
    .line 247
    return-object v6

    .line 248
    :pswitch_1
    move-object/from16 v8, p1

    .line 249
    .line 250
    check-cast v8, La/i1w0;

    .line 251
    .line 252
    new-instance v7, La/clc0;

    .line 253
    .line 254
    check-cast v0, La/c7i;

    .line 255
    .line 256
    iget-object v1, v0, La/c7i;->c:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v1, La/fki;

    .line 259
    .line 260
    new-instance v9, La/tpx;

    .line 261
    .line 262
    iget-object v5, v1, La/fki;->b:La/tnc0;

    .line 263
    .line 264
    invoke-direct {v9, v5, v4}, La/tpx;-><init>(La/tnc0;B)V

    .line 265
    .line 266
    .line 267
    sget-object v10, La/s470;->f:La/s470;

    .line 268
    .line 269
    iget-object v4, v1, La/fki;->a:La/g8i;

    .line 270
    .line 271
    invoke-virtual {v4}, La/g8i;->T()La/uf3;

    .line 272
    .line 273
    .line 274
    move-result-object v11

    .line 275
    iget-object v0, v0, La/c7i;->d:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v0, La/kki;

    .line 278
    .line 279
    new-instance v12, La/oif0;

    .line 280
    .line 281
    iget-object v0, v0, La/kki;->e:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, La/fki;

    .line 284
    .line 285
    iget-object v5, v0, La/fki;->e:La/fhj;

    .line 286
    .line 287
    iget-object v6, v0, La/fki;->a:La/g8i;

    .line 288
    .line 289
    invoke-virtual {v6}, La/g8i;->f5()La/ntu;

    .line 290
    .line 291
    .line 292
    move-result-object v13

    .line 293
    invoke-virtual {v6}, La/g8i;->g3()La/iqt;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    invoke-direct {v12, v5, v13, v6, v3}, La/oif0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 298
    .line 299
    .line 300
    new-instance v13, La/ieu;

    .line 301
    .line 302
    iget-object v3, v0, La/fki;->c:La/wsf0;

    .line 303
    .line 304
    iget-object v3, v3, La/wsf0;->b:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v3, La/g45;

    .line 307
    .line 308
    invoke-virtual {v3}, La/g45;->E()La/nou;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    iget-object v5, v0, La/fki;->d:La/rkc0;

    .line 313
    .line 314
    invoke-direct {v13, v3, v5}, La/ieu;-><init>(La/nou;La/rkc0;)V

    .line 315
    .line 316
    .line 317
    new-instance v14, La/pyu;

    .line 318
    .line 319
    iget-object v3, v0, La/fki;->b:La/tnc0;

    .line 320
    .line 321
    invoke-direct {v14, v3}, La/pyu;-><init>(La/tnc0;)V

    .line 322
    .line 323
    .line 324
    new-instance v15, La/lef0;

    .line 325
    .line 326
    iget-object v3, v0, La/fki;->b:La/tnc0;

    .line 327
    .line 328
    invoke-direct {v15, v3}, La/lef0;-><init>(La/tnc0;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v4}, La/g8i;->v1()La/mne;

    .line 332
    .line 333
    .line 334
    move-result-object v16

    .line 335
    new-instance v3, La/wsf0;

    .line 336
    .line 337
    iget-object v1, v1, La/fki;->b:La/tnc0;

    .line 338
    .line 339
    invoke-direct {v3, v1}, La/wsf0;-><init>(La/tnc0;)V

    .line 340
    .line 341
    .line 342
    new-instance v1, La/tpx;

    .line 343
    .line 344
    iget-object v0, v0, La/fki;->b:La/tnc0;

    .line 345
    .line 346
    invoke-direct {v1, v0, v2}, La/tpx;-><init>(La/tnc0;B)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v4}, La/g8i;->q1()La/m1e;

    .line 350
    .line 351
    .line 352
    move-result-object v20

    .line 353
    invoke-static/range {v20 .. v20}, La/x1x;->x(Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    const/16 v19, 0x0

    .line 357
    .line 358
    move-object/from16 v18, v1

    .line 359
    .line 360
    move-object/from16 v17, v3

    .line 361
    .line 362
    invoke-direct/range {v7 .. v20}, La/clc0;-><init>(La/i1w0;La/tpx;La/s470;La/uf3;La/oif0;La/ieu;La/pyu;La/lef0;La/mne;La/wsf0;La/tpx;ZLa/m1e;)V

    .line 363
    .line 364
    .line 365
    return-object v7

    .line 366
    nop

    .line 367
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
