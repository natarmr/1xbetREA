.class public final synthetic La/c8s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/k9s;

.field public final synthetic c:La/g9s;


# direct methods
.method public synthetic constructor <init>(La/k9s;La/g9s;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/c8s;->a:B

    iput-object p1, p0, La/c8s;->b:La/k9s;

    iput-object p2, p0, La/c8s;->c:La/g9s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 59

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/c8s;->a:B

    .line 4
    .line 5
    const-string v2, "KEY_LIVE"

    .line 6
    .line 7
    const-string v3, "KEY_CHAMP_ID"

    .line 8
    .line 9
    const-string v4, "KEY_GAME_ID"

    .line 10
    .line 11
    iget-object v5, v0, La/c8s;->c:La/g9s;

    .line 12
    .line 13
    iget-object v0, v0, La/c8s;->b:La/k9s;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/oyg0;

    .line 21
    .line 22
    move-object/from16 v6, p2

    .line 23
    .line 24
    check-cast v6, La/r7s;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-wide v7, v0, La/k9s;->a:J

    .line 33
    .line 34
    iget-object v9, v0, La/k9s;->g:Ljava/lang/String;

    .line 35
    .line 36
    iget-wide v10, v0, La/k9s;->b:J

    .line 37
    .line 38
    move-wide v12, v10

    .line 39
    iget-boolean v11, v0, La/k9s;->z:Z

    .line 40
    .line 41
    iget-boolean v1, v0, La/k9s;->W:Z

    .line 42
    .line 43
    invoke-interface {v0}, La/l9s;->s()Z

    .line 44
    .line 45
    .line 46
    move-result v27

    .line 47
    iget-boolean v10, v0, La/k9s;->v:Z

    .line 48
    .line 49
    move-wide v14, v12

    .line 50
    iget-wide v12, v0, La/k9s;->s:J

    .line 51
    .line 52
    move/from16 v25, v1

    .line 53
    .line 54
    iget-object v1, v0, La/k9s;->A:Ljava/lang/String;

    .line 55
    .line 56
    move-object/from16 v19, v1

    .line 57
    .line 58
    iget-object v1, v0, La/k9s;->j:Ljava/lang/String;

    .line 59
    .line 60
    move-object/from16 v20, v1

    .line 61
    .line 62
    iget-object v1, v0, La/k9s;->k:Ljava/lang/String;

    .line 63
    .line 64
    move-object/from16 v21, v1

    .line 65
    .line 66
    iget-object v1, v0, La/k9s;->l:Ljava/lang/String;

    .line 67
    .line 68
    move-object/from16 v44, v1

    .line 69
    .line 70
    iget-object v1, v0, La/k9s;->F:Ljava/lang/String;

    .line 71
    .line 72
    move-object/from16 v22, v1

    .line 73
    .line 74
    iget-object v1, v6, La/r7s;->c:Ljava/lang/Long;

    .line 75
    .line 76
    if-nez v1, :cond_2

    .line 77
    .line 78
    invoke-virtual {v0}, La/k9s;->Q()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_2

    .line 87
    .line 88
    iget-object v1, v0, La/k9s;->S:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_2

    .line 95
    .line 96
    iget-object v1, v0, La/k9s;->V:Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_2

    .line 103
    .line 104
    iget-object v1, v0, La/k9s;->I:Ljava/lang/Long;

    .line 105
    .line 106
    if-eqz v1, :cond_0

    .line 107
    .line 108
    iget-boolean v1, v0, La/k9s;->h:Z

    .line 109
    .line 110
    if-nez v1, :cond_2

    .line 111
    .line 112
    :cond_0
    iget-boolean v1, v0, La/k9s;->i:Z

    .line 113
    .line 114
    if-nez v1, :cond_2

    .line 115
    .line 116
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    iget-boolean v1, v0, La/k9s;->D:Z

    .line 124
    .line 125
    if-nez v1, :cond_2

    .line 126
    .line 127
    :goto_0
    sget-object v1, La/py20;->b:La/py20;

    .line 128
    .line 129
    :goto_1
    move-object/from16 v18, v1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_2
    iget-object v1, v6, La/r7s;->k:La/py20;

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :goto_2
    iget-object v0, v0, La/k9s;->Z:La/vzj0;

    .line 136
    .line 137
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const v57, -0xca7c20

    .line 142
    .line 143
    .line 144
    const v58, 0xfffef

    .line 145
    .line 146
    .line 147
    const-wide/16 v14, 0x0

    .line 148
    .line 149
    const/16 v16, 0x0

    .line 150
    .line 151
    const/16 v17, 0x0

    .line 152
    .line 153
    const/16 v23, 0x0

    .line 154
    .line 155
    const/16 v24, 0x0

    .line 156
    .line 157
    const/16 v26, 0x0

    .line 158
    .line 159
    const/16 v28, 0x0

    .line 160
    .line 161
    const/16 v29, 0x0

    .line 162
    .line 163
    const/16 v32, 0x0

    .line 164
    .line 165
    const/16 v33, 0x0

    .line 166
    .line 167
    const/16 v34, 0x0

    .line 168
    .line 169
    const/16 v35, 0x0

    .line 170
    .line 171
    const/16 v36, 0x0

    .line 172
    .line 173
    const/16 v37, 0x0

    .line 174
    .line 175
    const/16 v38, 0x0

    .line 176
    .line 177
    const/16 v39, 0x0

    .line 178
    .line 179
    const/16 v40, 0x0

    .line 180
    .line 181
    const/16 v41, 0x0

    .line 182
    .line 183
    const/16 v42, 0x0

    .line 184
    .line 185
    const/16 v43, 0x0

    .line 186
    .line 187
    const/16 v45, 0x0

    .line 188
    .line 189
    const/16 v46, 0x0

    .line 190
    .line 191
    const/16 v47, 0x0

    .line 192
    .line 193
    const/16 v48, 0x0

    .line 194
    .line 195
    const/16 v49, 0x0

    .line 196
    .line 197
    const/16 v50, 0x0

    .line 198
    .line 199
    const/16 v51, 0x0

    .line 200
    .line 201
    const/16 v52, 0x0

    .line 202
    .line 203
    const/16 v53, 0x0

    .line 204
    .line 205
    const/16 v54, 0x0

    .line 206
    .line 207
    const/16 v55, 0x0

    .line 208
    .line 209
    const/16 v56, 0x0

    .line 210
    .line 211
    move-object/from16 v31, v0

    .line 212
    .line 213
    move/from16 v30, v10

    .line 214
    .line 215
    move-object v10, v1

    .line 216
    invoke-static/range {v6 .. v58}, La/r7s;->a(La/r7s;JLjava/lang/String;Ljava/lang/Long;ZJJLa/t3z;Ljava/util/LinkedHashSet;La/py20;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;La/fsr;ZZZZZZLjava/lang/Integer;ZZZLjava/lang/String;Ljava/lang/String;ZZLa/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;Ljava/util/List;ZII)La/r7s;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget-object v1, v5, La/g9s;->o:La/vzg0;

    .line 221
    .line 222
    iget-wide v5, v0, La/r7s;->a:J

    .line 223
    .line 224
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-virtual {v1, v4, v5}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    iget-object v4, v0, La/r7s;->g:Ljava/lang/Long;

    .line 232
    .line 233
    invoke-virtual {v1, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    iget-boolean v3, v0, La/r7s;->d:Z

    .line 237
    .line 238
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    const-string v2, "KEY_MARKETS_ANCHOR_STATE"

    .line 246
    .line 247
    iget-object v3, v0, La/r7s;->k:La/py20;

    .line 248
    .line 249
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    return-object v0

    .line 253
    :pswitch_0
    move-object/from16 v1, p1

    .line 254
    .line 255
    check-cast v1, La/oyg0;

    .line 256
    .line 257
    move-object/from16 v6, p2

    .line 258
    .line 259
    check-cast v6, La/r7s;

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    iget-wide v7, v0, La/k9s;->a:J

    .line 268
    .line 269
    iget-object v9, v0, La/k9s;->g:Ljava/lang/String;

    .line 270
    .line 271
    iget-wide v10, v0, La/k9s;->b:J

    .line 272
    .line 273
    move-wide v12, v10

    .line 274
    iget-boolean v11, v0, La/k9s;->z:Z

    .line 275
    .line 276
    iget-boolean v1, v0, La/k9s;->W:Z

    .line 277
    .line 278
    invoke-interface {v0}, La/l9s;->s()Z

    .line 279
    .line 280
    .line 281
    move-result v27

    .line 282
    iget-boolean v10, v0, La/k9s;->v:Z

    .line 283
    .line 284
    iget-wide v14, v0, La/k9s;->s:J

    .line 285
    .line 286
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    const v57, -0x4a0020

    .line 291
    .line 292
    .line 293
    const v58, 0xfff3f

    .line 294
    .line 295
    .line 296
    move-wide v12, v14

    .line 297
    const-wide/16 v14, 0x0

    .line 298
    .line 299
    const/16 v16, 0x0

    .line 300
    .line 301
    const/16 v17, 0x0

    .line 302
    .line 303
    const/16 v18, 0x0

    .line 304
    .line 305
    const/16 v19, 0x0

    .line 306
    .line 307
    const/16 v20, 0x0

    .line 308
    .line 309
    const/16 v21, 0x0

    .line 310
    .line 311
    const/16 v22, 0x0

    .line 312
    .line 313
    const/16 v23, 0x0

    .line 314
    .line 315
    const/16 v24, 0x0

    .line 316
    .line 317
    const/16 v26, 0x0

    .line 318
    .line 319
    const/16 v28, 0x0

    .line 320
    .line 321
    const/16 v29, 0x0

    .line 322
    .line 323
    const/16 v31, 0x0

    .line 324
    .line 325
    const/16 v32, 0x0

    .line 326
    .line 327
    const/16 v33, 0x0

    .line 328
    .line 329
    const/16 v34, 0x0

    .line 330
    .line 331
    const/16 v35, 0x0

    .line 332
    .line 333
    const/16 v36, 0x0

    .line 334
    .line 335
    const/16 v37, 0x0

    .line 336
    .line 337
    const/16 v38, 0x0

    .line 338
    .line 339
    const/16 v39, 0x0

    .line 340
    .line 341
    const/16 v40, 0x0

    .line 342
    .line 343
    const/16 v41, 0x0

    .line 344
    .line 345
    const/16 v42, 0x0

    .line 346
    .line 347
    const/16 v43, 0x0

    .line 348
    .line 349
    const/16 v44, 0x0

    .line 350
    .line 351
    const/16 v45, 0x1

    .line 352
    .line 353
    const/16 v46, 0x0

    .line 354
    .line 355
    const/16 v47, 0x0

    .line 356
    .line 357
    const/16 v48, 0x0

    .line 358
    .line 359
    const/16 v49, 0x0

    .line 360
    .line 361
    const/16 v50, 0x0

    .line 362
    .line 363
    const/16 v51, 0x0

    .line 364
    .line 365
    const/16 v52, 0x0

    .line 366
    .line 367
    const/16 v53, 0x0

    .line 368
    .line 369
    const/16 v54, 0x0

    .line 370
    .line 371
    const/16 v55, 0x0

    .line 372
    .line 373
    const/16 v56, 0x0

    .line 374
    .line 375
    move/from16 v25, v1

    .line 376
    .line 377
    move/from16 v30, v10

    .line 378
    .line 379
    move-object v10, v0

    .line 380
    invoke-static/range {v6 .. v58}, La/r7s;->a(La/r7s;JLjava/lang/String;Ljava/lang/Long;ZJJLa/t3z;Ljava/util/LinkedHashSet;La/py20;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;La/fsr;ZZZZZZLjava/lang/Integer;ZZZLjava/lang/String;Ljava/lang/String;ZZLa/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;Ljava/util/List;ZII)La/r7s;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    iget-object v1, v5, La/g9s;->o:La/vzg0;

    .line 385
    .line 386
    iget-wide v6, v0, La/r7s;->a:J

    .line 387
    .line 388
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    invoke-virtual {v1, v4, v6}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    iget-object v1, v5, La/g9s;->o:La/vzg0;

    .line 396
    .line 397
    iget-object v4, v0, La/r7s;->g:Ljava/lang/Long;

    .line 398
    .line 399
    invoke-virtual {v1, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    iget-boolean v3, v0, La/r7s;->d:Z

    .line 403
    .line 404
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    iget-boolean v2, v0, La/r7s;->M:Z

    .line 412
    .line 413
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    const-string v3, "KEY_SHOW_SUB_GAMES"

    .line 418
    .line 419
    invoke-virtual {v1, v3, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    return-object v0

    .line 423
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
