.class public final synthetic La/oop;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rop;


# direct methods
.method public synthetic constructor <init>(La/rop;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/oop;->a:B

    iput-object p1, p0, La/oop;->b:La/rop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/oop;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/oop;->b:La/rop;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/rop;->a2:La/nek;

    .line 11
    .line 12
    invoke-virtual {v0}, La/rop;->K0()V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    sget-object v1, La/rop;->a2:La/nek;

    .line 19
    .line 20
    new-instance v1, La/q0h0;

    .line 21
    .line 22
    invoke-virtual {v0}, La/rop;->M0()La/zgi;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v0, v0, La/zgi;->r:La/n5d0;

    .line 27
    .line 28
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La/ygi;

    .line 33
    .line 34
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_1
    sget-object v1, La/rop;->a2:La/nek;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    instance-of v2, v1, La/af3;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    check-cast v1, La/af3;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move-object v1, v3

    .line 60
    :goto_0
    const-string v2, "Cannot create dependency "

    .line 61
    .line 62
    const-class v4, La/onp;

    .line 63
    .line 64
    if-eqz v1, :cond_9

    .line 65
    .line 66
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1, v4}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, La/o5d0;

    .line 75
    .line 76
    if-eqz v1, :cond_1

    .line 77
    .line 78
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, La/ze3;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    move-object v1, v3

    .line 86
    :goto_1
    instance-of v5, v1, La/onp;

    .line 87
    .line 88
    if-nez v5, :cond_2

    .line 89
    .line 90
    move-object v1, v3

    .line 91
    :cond_2
    check-cast v1, La/onp;

    .line 92
    .line 93
    if-eqz v1, :cond_9

    .line 94
    .line 95
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v4}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    iget-object v5, v0, La/rop;->O1:La/yzn0;

    .line 111
    .line 112
    sget-object v6, La/rop;->b2:[La/iiy;

    .line 113
    .line 114
    const/4 v7, 0x2

    .line 115
    aget-object v7, v6, v7

    .line 116
    .line 117
    invoke-virtual {v5, v0, v7}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    move-object/from16 v18, v5

    .line 122
    .line 123
    check-cast v18, La/f9h0;

    .line 124
    .line 125
    invoke-virtual {v0}, La/rop;->L0()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    iget-object v5, v0, La/rop;->Q1:La/cu;

    .line 130
    .line 131
    const/4 v7, 0x4

    .line 132
    aget-object v7, v6, v7

    .line 133
    .line 134
    invoke-virtual {v5, v0, v7}, La/cu;->h(Landroidx/fragment/app/Fragment;La/iiy;)[J

    .line 135
    .line 136
    .line 137
    move-result-object v19

    .line 138
    iget-object v5, v0, La/rop;->N1:La/bj5;

    .line 139
    .line 140
    const/4 v7, 0x1

    .line 141
    aget-object v6, v6, v7

    .line 142
    .line 143
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 150
    .line 151
    if-eqz v0, :cond_8

    .line 152
    .line 153
    const-string v5, "SCREEN_TYPE_KEY"

    .line 154
    .line 155
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-eqz v0, :cond_8

    .line 160
    .line 161
    invoke-static {v0}, La/j700;->valueOf(Ljava/lang/String;)La/j700;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    if-eqz v11, :cond_8

    .line 166
    .line 167
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    sget-object v0, La/whp;->a:Ljava/util/LinkedHashMap;

    .line 174
    .line 175
    invoke-virtual {v0, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    if-nez v5, :cond_7

    .line 180
    .line 181
    new-instance v5, La/xhp;

    .line 182
    .line 183
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-static {v6}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    instance-of v8, v4, La/af3;

    .line 196
    .line 197
    if-eqz v8, :cond_3

    .line 198
    .line 199
    check-cast v4, La/af3;

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_3
    move-object v4, v3

    .line 203
    :goto_2
    const-class v8, La/fkp;

    .line 204
    .line 205
    if-eqz v4, :cond_6

    .line 206
    .line 207
    invoke-interface {v4}, La/af3;->d()La/wcf0;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-virtual {v4, v8}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    check-cast v4, La/o5d0;

    .line 216
    .line 217
    if-eqz v4, :cond_4

    .line 218
    .line 219
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    check-cast v4, La/ze3;

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_4
    move-object v4, v3

    .line 227
    :goto_3
    instance-of v9, v4, La/fkp;

    .line 228
    .line 229
    if-nez v9, :cond_5

    .line 230
    .line 231
    move-object v4, v3

    .line 232
    :cond_5
    check-cast v4, La/fkp;

    .line 233
    .line 234
    if-eqz v4, :cond_6

    .line 235
    .line 236
    new-instance v2, La/xex;

    .line 237
    .line 238
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 239
    .line 240
    .line 241
    new-instance v3, La/f7i;

    .line 242
    .line 243
    const/16 v4, 0x17

    .line 244
    .line 245
    invoke-direct {v3, v2, v7, v4}, La/f7i;-><init>(Ljava/lang/Object;IB)V

    .line 246
    .line 247
    .line 248
    invoke-static {v3}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    iput-object v3, v2, La/xex;->a:Ljava/lang/Object;

    .line 253
    .line 254
    new-instance v3, La/f7i;

    .line 255
    .line 256
    const/4 v7, 0x0

    .line 257
    invoke-direct {v3, v2, v7, v4}, La/f7i;-><init>(Ljava/lang/Object;IB)V

    .line 258
    .line 259
    .line 260
    invoke-static {v3}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    iput-object v3, v2, La/xex;->b:Ljava/lang/Object;

    .line 265
    .line 266
    invoke-direct {v5, v6, v2}, La/xhp;-><init>(Ljava/util/Set;La/xex;)V

    .line 267
    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_6
    invoke-static {v8, v2}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_5

    .line 278
    .line 279
    :cond_7
    :goto_4
    check-cast v5, La/xhp;

    .line 280
    .line 281
    iget-object v2, v5, La/xhp;->b:La/xex;

    .line 282
    .line 283
    iget-object v3, v5, La/xhp;->a:Ljava/util/Set;

    .line 284
    .line 285
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-static {v3, v4}, La/eui0;->h(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    new-instance v4, La/xhp;

    .line 298
    .line 299
    invoke-direct {v4, v3, v2}, La/xhp;-><init>(Ljava/util/Set;La/xex;)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v0, v10, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    iget-object v0, v2, La/xex;->b:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, La/n5d0;

    .line 308
    .line 309
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    move-object v13, v0

    .line 314
    check-cast v13, La/hkp;

    .line 315
    .line 316
    iget-object v7, v1, La/onp;->a:La/iip;

    .line 317
    .line 318
    iget-object v9, v1, La/onp;->h:La/zr1;

    .line 319
    .line 320
    iget-object v0, v1, La/onp;->i:La/yo4;

    .line 321
    .line 322
    iget-object v14, v1, La/onp;->d:La/ctf0;

    .line 323
    .line 324
    iget-object v2, v1, La/onp;->c:La/mne;

    .line 325
    .line 326
    iget-object v6, v1, La/onp;->e:La/iw20;

    .line 327
    .line 328
    iget-object v15, v1, La/onp;->j:La/m1e;

    .line 329
    .line 330
    iget-object v3, v1, La/onp;->k:La/wdk0;

    .line 331
    .line 332
    iget-object v4, v1, La/onp;->f:La/m8l0;

    .line 333
    .line 334
    iget-object v5, v1, La/onp;->g:La/r9u;

    .line 335
    .line 336
    iget-object v8, v1, La/onp;->l:La/kt2;

    .line 337
    .line 338
    move-object/from16 v20, v0

    .line 339
    .line 340
    iget-object v0, v1, La/onp;->m:La/cyu;

    .line 341
    .line 342
    iget-object v1, v1, La/onp;->b:La/n5r0;

    .line 343
    .line 344
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    new-instance v5, La/zgi;

    .line 372
    .line 373
    move-object/from16 v22, v0

    .line 374
    .line 375
    move-object/from16 v17, v2

    .line 376
    .line 377
    move-object/from16 v16, v3

    .line 378
    .line 379
    move-object/from16 v21, v8

    .line 380
    .line 381
    move-object v8, v1

    .line 382
    invoke-direct/range {v5 .. v22}, La/zgi;-><init>(La/iw20;La/iip;La/n5r0;La/zr1;Ljava/lang/String;La/j700;La/i1w0;La/hkp;La/ctf0;La/m1e;La/wdk0;La/mne;La/f9h0;[JLa/yo4;La/kt2;La/cyu;)V

    .line 383
    .line 384
    .line 385
    move-object v3, v5

    .line 386
    goto :goto_5

    .line 387
    :cond_8
    new-instance v0, La/ss3;

    .line 388
    .line 389
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 390
    .line 391
    .line 392
    throw v0

    .line 393
    :cond_9
    invoke-static {v4, v2}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    :goto_5
    return-object v3

    .line 401
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
