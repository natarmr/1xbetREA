.class public final La/zfi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/dci;


# direct methods
.method public constructor <init>(La/dci;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zfi;->a:La/dci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 23

    .line 1
    new-instance v0, La/d4o;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/zfi;->a:La/dci;

    .line 6
    .line 7
    iget-object v1, v1, La/dci;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/agi;

    .line 10
    .line 11
    iget-object v2, v1, La/agi;->a:Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;

    .line 12
    .line 13
    new-instance v3, La/a6u;

    .line 14
    .line 15
    iget-object v4, v1, La/agi;->b:La/iip;

    .line 16
    .line 17
    invoke-interface {v4}, La/iip;->V()La/j3c;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, La/agi;->c:La/ugf0;

    .line 25
    .line 26
    iget-object v5, v5, La/ugf0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v5, La/daf;

    .line 29
    .line 30
    invoke-virtual {v5}, La/daf;->w()La/luu;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v6, La/ywq0;

    .line 38
    .line 39
    iget-object v7, v1, La/agi;->w:La/n5d0;

    .line 40
    .line 41
    invoke-interface {v7}, La/o5d0;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    check-cast v7, La/cog;

    .line 46
    .line 47
    iget-object v8, v1, La/agi;->d:La/rtu;

    .line 48
    .line 49
    iget-object v9, v1, La/agi;->e:La/lsn;

    .line 50
    .line 51
    iget-object v9, v9, La/lsn;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, La/gbi;

    .line 54
    .line 55
    invoke-virtual {v9}, La/gbi;->k()La/v7i;

    .line 56
    .line 57
    .line 58
    move-result-object v9

    .line 59
    new-instance v10, La/u8u;

    .line 60
    .line 61
    iget-object v11, v1, La/agi;->f:La/pyg;

    .line 62
    .line 63
    invoke-interface {v11}, La/pyg;->o()La/phf0;

    .line 64
    .line 65
    .line 66
    move-result-object v12

    .line 67
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object v13, v1, La/agi;->g:La/vqc;

    .line 71
    .line 72
    iget-object v13, v13, La/vqc;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v13, La/cih;

    .line 75
    .line 76
    invoke-virtual {v13}, La/cih;->a()La/uzc;

    .line 77
    .line 78
    .line 79
    move-result-object v14

    .line 80
    const/4 v15, 0x3

    .line 81
    invoke-direct {v10, v12, v14, v15}, La/u8u;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    new-instance v12, La/edu;

    .line 85
    .line 86
    invoke-interface {v11}, La/pyg;->l()La/cu;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v13}, La/cih;->a()La/uzc;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    const/4 v15, 0x0

    .line 98
    invoke-direct {v12, v11, v14, v15}, La/edu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 99
    .line 100
    .line 101
    new-instance v11, La/khf0;

    .line 102
    .line 103
    iget-object v14, v1, La/agi;->h:La/sb6;

    .line 104
    .line 105
    invoke-virtual {v13}, La/cih;->a()La/uzc;

    .line 106
    .line 107
    .line 108
    move-result-object v13

    .line 109
    iget-object v15, v1, La/agi;->i:La/gst0;

    .line 110
    .line 111
    invoke-direct {v11, v14, v13, v15}, La/khf0;-><init>(La/sb6;La/uzc;La/gst0;)V

    .line 112
    .line 113
    .line 114
    iget-object v13, v1, La/agi;->j:La/pru;

    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object v7, v6, La/ywq0;->a:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v8, v6, La/ywq0;->b:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v9, v6, La/ywq0;->c:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v10, v6, La/ywq0;->d:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v12, v6, La/ywq0;->e:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v11, v6, La/ywq0;->f:Ljava/lang/Object;

    .line 133
    .line 134
    new-instance v7, La/b6u;

    .line 135
    .line 136
    const/4 v8, 0x5

    .line 137
    invoke-direct {v7, v13, v8}, La/b6u;-><init>(La/pru;B)V

    .line 138
    .line 139
    .line 140
    invoke-static {v7}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    iput-object v7, v6, La/ywq0;->g:Ljava/lang/Object;

    .line 145
    .line 146
    new-instance v7, La/x2u;

    .line 147
    .line 148
    iget-object v8, v1, La/agi;->w:La/n5d0;

    .line 149
    .line 150
    invoke-interface {v8}, La/o5d0;->get()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    check-cast v8, La/cog;

    .line 155
    .line 156
    const/4 v9, 0x0

    .line 157
    invoke-direct {v7, v8, v9}, La/x2u;-><init>(La/cog;B)V

    .line 158
    .line 159
    .line 160
    new-instance v8, La/nmo;

    .line 161
    .line 162
    iget-object v9, v1, La/agi;->x:La/n5d0;

    .line 163
    .line 164
    invoke-interface {v9}, La/o5d0;->get()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v9

    .line 168
    check-cast v9, La/t2g;

    .line 169
    .line 170
    invoke-direct {v8, v9}, La/nmo;-><init>(La/t2g;)V

    .line 171
    .line 172
    .line 173
    const/4 v9, 0x2

    .line 174
    invoke-direct/range {v3 .. v9}, La/a6u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 175
    .line 176
    .line 177
    new-instance v4, La/soi0;

    .line 178
    .line 179
    iget-object v5, v1, La/agi;->w:La/n5d0;

    .line 180
    .line 181
    invoke-interface {v5}, La/o5d0;->get()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    check-cast v5, La/cog;

    .line 186
    .line 187
    const/4 v9, 0x0

    .line 188
    invoke-direct {v4, v5, v9}, La/soi0;-><init>(La/cog;B)V

    .line 189
    .line 190
    .line 191
    iget-object v5, v1, La/agi;->k:La/ctf0;

    .line 192
    .line 193
    iget-object v6, v1, La/agi;->l:La/cad;

    .line 194
    .line 195
    iget-object v6, v6, La/cad;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v6, La/psc;

    .line 198
    .line 199
    invoke-virtual {v6}, La/psc;->h()La/mne;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    iget-object v7, v1, La/agi;->m:La/g2v;

    .line 207
    .line 208
    iget-object v8, v1, La/agi;->n:La/vqc;

    .line 209
    .line 210
    iget-object v9, v1, La/agi;->j:La/pru;

    .line 211
    .line 212
    iget-object v10, v1, La/agi;->o:La/lbu;

    .line 213
    .line 214
    iget-object v11, v1, La/agi;->p:La/y78;

    .line 215
    .line 216
    iget-object v12, v1, La/agi;->f:La/pyg;

    .line 217
    .line 218
    invoke-interface {v12}, La/pyg;->a()La/hzg;

    .line 219
    .line 220
    .line 221
    move-result-object v12

    .line 222
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    iget-object v13, v1, La/agi;->q:La/itr;

    .line 226
    .line 227
    invoke-interface {v13}, La/itr;->a()La/hjd;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    new-instance v14, La/soi0;

    .line 235
    .line 236
    iget-object v15, v1, La/agi;->w:La/n5d0;

    .line 237
    .line 238
    invoke-interface {v15}, La/o5d0;->get()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v15

    .line 242
    check-cast v15, La/cog;

    .line 243
    .line 244
    move-object/from16 v16, v0

    .line 245
    .line 246
    const/4 v0, 0x1

    .line 247
    invoke-direct {v14, v15, v0}, La/soi0;-><init>(La/cog;B)V

    .line 248
    .line 249
    .line 250
    new-instance v15, La/nsu;

    .line 251
    .line 252
    iget-object v0, v1, La/agi;->w:La/n5d0;

    .line 253
    .line 254
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    check-cast v0, La/cog;

    .line 259
    .line 260
    move-object/from16 v18, v2

    .line 261
    .line 262
    const/4 v2, 0x1

    .line 263
    invoke-direct {v15, v0, v2}, La/nsu;-><init>(La/cog;B)V

    .line 264
    .line 265
    .line 266
    new-instance v0, La/fvt0;

    .line 267
    .line 268
    iget-object v2, v1, La/agi;->w:La/n5d0;

    .line 269
    .line 270
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    check-cast v2, La/cog;

    .line 275
    .line 276
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 280
    .line 281
    .line 282
    iput-object v2, v0, La/fvt0;->a:Ljava/lang/Object;

    .line 283
    .line 284
    new-instance v2, La/pmi0;

    .line 285
    .line 286
    move-object/from16 v17, v0

    .line 287
    .line 288
    iget-object v0, v1, La/agi;->x:La/n5d0;

    .line 289
    .line 290
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    check-cast v0, La/t2g;

    .line 295
    .line 296
    invoke-direct {v2, v0}, La/pmi0;-><init>(La/t2g;)V

    .line 297
    .line 298
    .line 299
    new-instance v0, La/cqc;

    .line 300
    .line 301
    move-object/from16 v19, v2

    .line 302
    .line 303
    iget-object v2, v1, La/agi;->w:La/n5d0;

    .line 304
    .line 305
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    check-cast v2, La/cog;

    .line 310
    .line 311
    move-object/from16 v20, v3

    .line 312
    .line 313
    const/4 v3, 0x0

    .line 314
    invoke-direct {v0, v2, v3}, La/cqc;-><init>(La/cog;B)V

    .line 315
    .line 316
    .line 317
    iget-object v2, v1, La/agi;->r:La/epi0;

    .line 318
    .line 319
    iget-object v2, v2, La/epi0;->b:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v2, La/xzp;

    .line 322
    .line 323
    invoke-virtual {v2}, La/xzp;->C()La/r9u;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    iget-object v3, v1, La/agi;->s:La/s31;

    .line 328
    .line 329
    move-object/from16 p0, v0

    .line 330
    .line 331
    iget-object v0, v1, La/agi;->t:La/cyu;

    .line 332
    .line 333
    iget-object v1, v1, La/agi;->u:La/m1e;

    .line 334
    .line 335
    move-object/from16 v21, v20

    .line 336
    .line 337
    move-object/from16 v20, v3

    .line 338
    .line 339
    move-object/from16 v3, v21

    .line 340
    .line 341
    move-object/from16 v21, v0

    .line 342
    .line 343
    move-object/from16 v22, v1

    .line 344
    .line 345
    move-object/from16 v0, v16

    .line 346
    .line 347
    move-object/from16 v16, v17

    .line 348
    .line 349
    move-object/from16 v17, v19

    .line 350
    .line 351
    move-object/from16 v1, p1

    .line 352
    .line 353
    move-object/from16 v19, v2

    .line 354
    .line 355
    move-object/from16 v2, v18

    .line 356
    .line 357
    move-object/from16 v18, p0

    .line 358
    .line 359
    invoke-direct/range {v0 .. v22}, La/d4o;-><init>(La/vzg0;Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;La/a6u;La/soi0;La/ctf0;La/mne;La/g2v;La/vqc;La/pru;La/lbu;La/y78;La/hzg;La/hjd;La/soi0;La/nsu;La/fvt0;La/pmi0;La/cqc;La/r9u;La/s31;La/cyu;La/m1e;)V

    .line 360
    .line 361
    .line 362
    return-object v0
.end method
