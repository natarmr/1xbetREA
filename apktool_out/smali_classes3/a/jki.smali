.class public final La/jki;
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
    iput-byte p2, p0, La/jki;->a:B

    iput-object p1, p0, La/jki;->b:La/n5d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jki;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/jki;->b:La/n5d0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v3, p1

    .line 11
    .line 12
    check-cast v3, La/i1w0;

    .line 13
    .line 14
    new-instance v2, La/b07;

    .line 15
    .line 16
    check-cast v0, La/c7i;

    .line 17
    .line 18
    iget-object v1, v0, La/c7i;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, La/iyi;

    .line 21
    .line 22
    iget-object v4, v1, La/iyi;->a:La/g8i;

    .line 23
    .line 24
    invoke-virtual {v4}, La/g8i;->L8()La/ctf0;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v5, v1, La/iyi;->a:La/g8i;

    .line 32
    .line 33
    move-object v6, v5

    .line 34
    invoke-virtual {v6}, La/g8i;->u0()La/v88;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    move-object v7, v6

    .line 39
    invoke-virtual {v7}, La/g8i;->v1()La/mne;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    move-object v8, v7

    .line 44
    invoke-virtual {v8}, La/g8i;->d2()La/duj;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    iget-object v0, v0, La/c7i;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, La/kki;

    .line 51
    .line 52
    move-object v9, v8

    .line 53
    new-instance v8, La/iqi;

    .line 54
    .line 55
    iget-object v0, v0, La/kki;->e:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, La/iyi;

    .line 58
    .line 59
    iget-object v10, v0, La/iyi;->d:La/s470;

    .line 60
    .line 61
    iget-object v11, v0, La/iyi;->e:La/rkc0;

    .line 62
    .line 63
    invoke-direct {v8, v10, v11}, La/iqi;-><init>(La/s470;La/rkc0;)V

    .line 64
    .line 65
    .line 66
    move-object v10, v9

    .line 67
    new-instance v9, La/dq00;

    .line 68
    .line 69
    iget-object v11, v0, La/iyi;->e:La/rkc0;

    .line 70
    .line 71
    iget-object v12, v0, La/iyi;->d:La/s470;

    .line 72
    .line 73
    invoke-direct {v9, v12, v11}, La/dq00;-><init>(La/s470;La/rkc0;)V

    .line 74
    .line 75
    .line 76
    move-object v11, v10

    .line 77
    new-instance v10, La/y3v;

    .line 78
    .line 79
    iget-object v12, v0, La/iyi;->d:La/s470;

    .line 80
    .line 81
    iget-object v13, v0, La/iyi;->a:La/g8i;

    .line 82
    .line 83
    invoke-virtual {v13}, La/g8i;->Oa()La/ort;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    iget-object v14, v0, La/iyi;->e:La/rkc0;

    .line 88
    .line 89
    invoke-direct {v10, v12, v13, v14}, La/y3v;-><init>(La/s470;La/ort;La/rkc0;)V

    .line 90
    .line 91
    .line 92
    move-object v12, v11

    .line 93
    new-instance v11, La/b8u;

    .line 94
    .line 95
    iget-object v0, v0, La/iyi;->e:La/rkc0;

    .line 96
    .line 97
    invoke-direct {v11, v0}, La/b8u;-><init>(La/rkc0;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, v1, La/iyi;->c:La/wsf0;

    .line 101
    .line 102
    move-object v13, v12

    .line 103
    new-instance v12, La/bsu;

    .line 104
    .line 105
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, La/wsf0;->g()La/urt;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v13}, La/g8i;->q1()La/m1e;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    new-instance v15, La/wsf0;

    .line 120
    .line 121
    iget-object v1, v1, La/iyi;->b:La/tnc0;

    .line 122
    .line 123
    invoke-direct {v15, v1}, La/wsf0;-><init>(La/tnc0;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v13}, La/g8i;->c5()La/pru;

    .line 127
    .line 128
    .line 129
    move-result-object v16

    .line 130
    move-object v13, v0

    .line 131
    invoke-direct/range {v2 .. v16}, La/b07;-><init>(La/i1w0;La/ctf0;La/v88;La/mne;La/duj;La/iqi;La/dq00;La/y3v;La/b8u;La/bsu;La/urt;La/m1e;La/wsf0;La/pru;)V

    .line 132
    .line 133
    .line 134
    return-object v2

    .line 135
    :pswitch_0
    move-object/from16 v4, p1

    .line 136
    .line 137
    check-cast v4, La/i1w0;

    .line 138
    .line 139
    new-instance v3, La/b07;

    .line 140
    .line 141
    check-cast v0, La/c7i;

    .line 142
    .line 143
    iget-object v1, v0, La/c7i;->c:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v1, La/nli;

    .line 146
    .line 147
    iget-object v2, v1, La/nli;->a:La/g8i;

    .line 148
    .line 149
    invoke-virtual {v2}, La/g8i;->L8()La/ctf0;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    iget-object v2, v1, La/nli;->a:La/g8i;

    .line 157
    .line 158
    invoke-virtual {v2}, La/g8i;->u0()La/v88;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {v2}, La/g8i;->v1()La/mne;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    invoke-virtual {v2}, La/g8i;->d2()La/duj;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    iget-object v0, v0, La/c7i;->d:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, La/kki;

    .line 173
    .line 174
    new-instance v9, La/iqi;

    .line 175
    .line 176
    iget-object v0, v0, La/kki;->e:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, La/nli;

    .line 179
    .line 180
    sget-object v10, La/s470;->c:La/s470;

    .line 181
    .line 182
    iget-object v11, v0, La/nli;->d:La/rkc0;

    .line 183
    .line 184
    invoke-direct {v9, v10, v11}, La/iqi;-><init>(La/s470;La/rkc0;)V

    .line 185
    .line 186
    .line 187
    new-instance v11, La/dq00;

    .line 188
    .line 189
    iget-object v12, v0, La/nli;->d:La/rkc0;

    .line 190
    .line 191
    invoke-direct {v11, v10, v12}, La/dq00;-><init>(La/s470;La/rkc0;)V

    .line 192
    .line 193
    .line 194
    move-object v12, v11

    .line 195
    new-instance v11, La/y3v;

    .line 196
    .line 197
    iget-object v13, v0, La/nli;->a:La/g8i;

    .line 198
    .line 199
    invoke-virtual {v13}, La/g8i;->Oa()La/ort;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    iget-object v14, v0, La/nli;->d:La/rkc0;

    .line 204
    .line 205
    invoke-direct {v11, v10, v13, v14}, La/y3v;-><init>(La/s470;La/ort;La/rkc0;)V

    .line 206
    .line 207
    .line 208
    move-object v10, v12

    .line 209
    new-instance v12, La/b8u;

    .line 210
    .line 211
    iget-object v0, v0, La/nli;->d:La/rkc0;

    .line 212
    .line 213
    invoke-direct {v12, v0}, La/b8u;-><init>(La/rkc0;)V

    .line 214
    .line 215
    .line 216
    iget-object v0, v1, La/nli;->c:La/wsf0;

    .line 217
    .line 218
    new-instance v13, La/bsu;

    .line 219
    .line 220
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0}, La/wsf0;->g()La/urt;

    .line 224
    .line 225
    .line 226
    move-result-object v14

    .line 227
    invoke-virtual {v2}, La/g8i;->q1()La/m1e;

    .line 228
    .line 229
    .line 230
    move-result-object v15

    .line 231
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    new-instance v0, La/wsf0;

    .line 235
    .line 236
    iget-object v1, v1, La/nli;->b:La/tnc0;

    .line 237
    .line 238
    invoke-direct {v0, v1}, La/wsf0;-><init>(La/tnc0;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, La/g8i;->c5()La/pru;

    .line 242
    .line 243
    .line 244
    move-result-object v17

    .line 245
    move-object/from16 v16, v0

    .line 246
    .line 247
    invoke-direct/range {v3 .. v17}, La/b07;-><init>(La/i1w0;La/ctf0;La/v88;La/mne;La/duj;La/iqi;La/dq00;La/y3v;La/b8u;La/bsu;La/urt;La/m1e;La/wsf0;La/pru;)V

    .line 248
    .line 249
    .line 250
    return-object v3

    .line 251
    :pswitch_1
    move-object/from16 v5, p1

    .line 252
    .line 253
    check-cast v5, La/i1w0;

    .line 254
    .line 255
    new-instance v4, La/b07;

    .line 256
    .line 257
    check-cast v0, La/c7i;

    .line 258
    .line 259
    iget-object v1, v0, La/c7i;->c:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v1, La/fki;

    .line 262
    .line 263
    iget-object v2, v1, La/fki;->a:La/g8i;

    .line 264
    .line 265
    invoke-virtual {v2}, La/g8i;->L8()La/ctf0;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    iget-object v2, v1, La/fki;->a:La/g8i;

    .line 273
    .line 274
    invoke-virtual {v2}, La/g8i;->u0()La/v88;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    invoke-virtual {v2}, La/g8i;->v1()La/mne;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    invoke-virtual {v2}, La/g8i;->d2()La/duj;

    .line 283
    .line 284
    .line 285
    move-result-object v9

    .line 286
    iget-object v0, v0, La/c7i;->d:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, La/kki;

    .line 289
    .line 290
    new-instance v10, La/iqi;

    .line 291
    .line 292
    iget-object v0, v0, La/kki;->e:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v0, La/fki;

    .line 295
    .line 296
    sget-object v3, La/s470;->f:La/s470;

    .line 297
    .line 298
    iget-object v11, v0, La/fki;->d:La/rkc0;

    .line 299
    .line 300
    invoke-direct {v10, v3, v11}, La/iqi;-><init>(La/s470;La/rkc0;)V

    .line 301
    .line 302
    .line 303
    new-instance v11, La/dq00;

    .line 304
    .line 305
    iget-object v12, v0, La/fki;->d:La/rkc0;

    .line 306
    .line 307
    invoke-direct {v11, v3, v12}, La/dq00;-><init>(La/s470;La/rkc0;)V

    .line 308
    .line 309
    .line 310
    new-instance v12, La/y3v;

    .line 311
    .line 312
    iget-object v13, v0, La/fki;->a:La/g8i;

    .line 313
    .line 314
    invoke-virtual {v13}, La/g8i;->Oa()La/ort;

    .line 315
    .line 316
    .line 317
    move-result-object v13

    .line 318
    iget-object v14, v0, La/fki;->d:La/rkc0;

    .line 319
    .line 320
    invoke-direct {v12, v3, v13, v14}, La/y3v;-><init>(La/s470;La/ort;La/rkc0;)V

    .line 321
    .line 322
    .line 323
    new-instance v13, La/b8u;

    .line 324
    .line 325
    iget-object v0, v0, La/fki;->d:La/rkc0;

    .line 326
    .line 327
    invoke-direct {v13, v0}, La/b8u;-><init>(La/rkc0;)V

    .line 328
    .line 329
    .line 330
    iget-object v0, v1, La/fki;->c:La/wsf0;

    .line 331
    .line 332
    new-instance v14, La/bsu;

    .line 333
    .line 334
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0}, La/wsf0;->g()La/urt;

    .line 338
    .line 339
    .line 340
    move-result-object v15

    .line 341
    invoke-virtual {v2}, La/g8i;->q1()La/m1e;

    .line 342
    .line 343
    .line 344
    move-result-object v16

    .line 345
    invoke-static/range {v16 .. v16}, La/x1x;->x(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    new-instance v0, La/wsf0;

    .line 349
    .line 350
    iget-object v1, v1, La/fki;->b:La/tnc0;

    .line 351
    .line 352
    invoke-direct {v0, v1}, La/wsf0;-><init>(La/tnc0;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2}, La/g8i;->c5()La/pru;

    .line 356
    .line 357
    .line 358
    move-result-object v18

    .line 359
    move-object/from16 v17, v0

    .line 360
    .line 361
    invoke-direct/range {v4 .. v18}, La/b07;-><init>(La/i1w0;La/ctf0;La/v88;La/mne;La/duj;La/iqi;La/dq00;La/y3v;La/b8u;La/bsu;La/urt;La/m1e;La/wsf0;La/pru;)V

    .line 362
    .line 363
    .line 364
    return-object v4

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
