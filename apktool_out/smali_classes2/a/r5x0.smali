.class public final synthetic La/r5x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l6x0;


# direct methods
.method public synthetic constructor <init>(La/l6x0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r5x0;->a:B

    iput-object p1, p0, La/r5x0;->b:La/l6x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-byte v0, p0, La/r5x0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/r5x0;->b:La/l6x0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/l6x0;->a()La/td9;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, v0, La/td9;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, p0, La/l6x0;->b:La/c1x0;

    .line 17
    .line 18
    iget-object v3, v2, La/c1x0;->d:La/lin0;

    .line 19
    .line 20
    iget-object v4, v2, La/c1x0;->g:La/i8x0;

    .line 21
    .line 22
    invoke-virtual {v4}, La/i8x0;->b()La/t7x0;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iget-boolean v5, v4, La/t7x0;->i:Z

    .line 27
    .line 28
    iget-boolean v4, v4, La/t7x0;->j:Z

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    if-eqz v4, :cond_5

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    :cond_0
    if-nez v5, :cond_1

    .line 42
    .line 43
    sget-object p0, La/n3x;->b:La/n3x;

    .line 44
    .line 45
    goto/16 :goto_3

    .line 46
    .line 47
    :cond_1
    invoke-static {}, La/g2x0;->s()La/b2x0;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget-object v0, v0, La/td9;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, La/un00;

    .line 54
    .line 55
    iget-byte v7, v0, La/un00;->a:B

    .line 56
    .line 57
    invoke-static {}, La/f2x0;->r()La/d2x0;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    invoke-virtual {v8}, La/iew0;->c()V

    .line 62
    .line 63
    .line 64
    iget-object v9, v8, La/iew0;->b:La/mew0;

    .line 65
    .line 66
    check-cast v9, La/f2x0;

    .line 67
    .line 68
    invoke-virtual {v9, v7}, La/f2x0;->s(I)V

    .line 69
    .line 70
    .line 71
    iget v0, v0, La/un00;->b:I

    .line 72
    .line 73
    invoke-virtual {v8}, La/iew0;->c()V

    .line 74
    .line 75
    .line 76
    iget-object v7, v8, La/iew0;->b:La/mew0;

    .line 77
    .line 78
    check-cast v7, La/f2x0;

    .line 79
    .line 80
    invoke-virtual {v7, v0}, La/f2x0;->t(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8}, La/iew0;->e()La/mew0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, La/f2x0;

    .line 88
    .line 89
    invoke-virtual {v4}, La/iew0;->c()V

    .line 90
    .line 91
    .line 92
    iget-object v7, v4, La/iew0;->b:La/mew0;

    .line 93
    .line 94
    check-cast v7, La/g2x0;

    .line 95
    .line 96
    invoke-virtual {v7, v0}, La/g2x0;->u(La/f2x0;)V

    .line 97
    .line 98
    .line 99
    if-eqz v1, :cond_3

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_2

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    invoke-virtual {v4}, La/iew0;->c()V

    .line 109
    .line 110
    .line 111
    iget-object v0, v4, La/iew0;->b:La/mew0;

    .line 112
    .line 113
    check-cast v0, La/g2x0;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, La/g2x0;->t(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    :goto_0
    if-eqz v5, :cond_4

    .line 119
    .line 120
    iget-object v0, p0, La/l6x0;->c:Ljava/lang/String;

    .line 121
    .line 122
    invoke-virtual {v4}, La/iew0;->c()V

    .line 123
    .line 124
    .line 125
    iget-object v1, v4, La/iew0;->b:La/mew0;

    .line 126
    .line 127
    check-cast v1, La/g2x0;

    .line 128
    .line 129
    invoke-virtual {v1, v0}, La/g2x0;->v(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    invoke-interface {v3}, La/lin0;->get()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, La/y2x0;

    .line 137
    .line 138
    invoke-virtual {v4}, La/iew0;->e()La/mew0;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, La/g2x0;

    .line 143
    .line 144
    iget-object v0, v0, La/y2x0;->a:La/tzw0;

    .line 145
    .line 146
    invoke-static {}, La/s9w0;->a()La/euo0;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    new-instance v4, La/owp0;

    .line 151
    .line 152
    const/16 v5, 0x19

    .line 153
    .line 154
    invoke-direct {v4, v1, v5}, La/owp0;-><init>(Ljava/lang/Object;B)V

    .line 155
    .line 156
    .line 157
    iput-object v4, v3, La/euo0;->a:La/mff0;

    .line 158
    .line 159
    sget-object v4, La/f1t0;->i:Lcom/google/android/gms/common/Feature;

    .line 160
    .line 161
    filled-new-array {v4}, [Lcom/google/android/gms/common/Feature;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    iput-object v4, v3, La/euo0;->d:[Lcom/google/android/gms/common/Feature;

    .line 166
    .line 167
    const/4 v4, 0x1

    .line 168
    iput-boolean v4, v3, La/euo0;->c:Z

    .line 169
    .line 170
    iput-boolean v6, v3, La/euo0;->b:Z

    .line 171
    .line 172
    invoke-virtual {v3}, La/euo0;->a()La/s9w0;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {v0, v6, v3}, La/nav;->b(ILa/s9w0;)Lcom/google/android/gms/tasks/Task;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    sget-object v4, La/ank;->a:La/ank;

    .line 181
    .line 182
    new-instance v5, La/fuj0;

    .line 183
    .line 184
    invoke-direct {v5, v0, v1, v6}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0}, La/y2x0;->b(Lcom/google/android/gms/tasks/Task;)La/d1;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    goto :goto_1

    .line 196
    :cond_5
    if-eqz v1, :cond_7

    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_6

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_6
    invoke-interface {v3}, La/lin0;->get()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, La/y2x0;

    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    iget-object v0, v0, La/y2x0;->a:La/tzw0;

    .line 218
    .line 219
    invoke-virtual {v0, v1}, La/tzw0;->c(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-static {v0}, La/y2x0;->b(Lcom/google/android/gms/tasks/Task;)La/d1;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    :goto_1
    new-instance v1, La/v5x0;

    .line 228
    .line 229
    invoke-direct {v1, p0, v6}, La/v5x0;-><init>(Ljava/lang/Object;B)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, La/c1x0;->a()La/fr40;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    const-class v2, La/s2x0;

    .line 237
    .line 238
    sget v3, La/f1;->l:I

    .line 239
    .line 240
    new-instance v3, La/d1;

    .line 241
    .line 242
    invoke-direct {v3, v0, v2, v1}, La/f1;-><init>(La/ig00;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-static {p0, v3}, La/n2x;->I(Ljava/util/concurrent/Executor;La/epq;)Ljava/util/concurrent/Executor;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    invoke-virtual {v0, v3, p0}, La/l2;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 250
    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_7
    :goto_2
    sget-object p0, La/n3x;->b:La/n3x;

    .line 254
    .line 255
    :goto_3
    return-void

    .line 256
    :pswitch_0
    iget-object v0, p0, La/l6x0;->b:La/c1x0;

    .line 257
    .line 258
    iget-object v0, v0, La/c1x0;->i:La/l7x0;

    .line 259
    .line 260
    iget-boolean p0, p0, La/l6x0;->d:Z

    .line 261
    .line 262
    sget-object v1, La/y5x0;->a:La/y5x0;

    .line 263
    .line 264
    iget-object v2, v0, La/l7x0;->c:La/lin0;

    .line 265
    .line 266
    invoke-interface {v2}, La/lin0;->get()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    check-cast v2, La/r7x0;

    .line 271
    .line 272
    if-nez v2, :cond_8

    .line 273
    .line 274
    if-nez p0, :cond_8

    .line 275
    .line 276
    sget-object p0, La/n3x;->b:La/n3x;

    .line 277
    .line 278
    goto/16 :goto_a

    .line 279
    .line 280
    :cond_8
    iget p0, v0, La/l7x0;->e:I

    .line 281
    .line 282
    and-int/lit8 p0, p0, 0x40

    .line 283
    .line 284
    if-nez p0, :cond_a

    .line 285
    .line 286
    iget-object p0, v0, La/l7x0;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 287
    .line 288
    monitor-enter p0

    .line 289
    :try_start_0
    iget v3, v0, La/l7x0;->e:I

    .line 290
    .line 291
    and-int/lit8 v4, v3, 0x40

    .line 292
    .line 293
    if-nez v4, :cond_9

    .line 294
    .line 295
    invoke-virtual {p0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    or-int/lit8 v1, v3, 0x40

    .line 299
    .line 300
    iput v1, v0, La/l7x0;->e:I

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :catchall_0
    move-exception v0

    .line 304
    goto :goto_5

    .line 305
    :cond_9
    :goto_4
    monitor-exit p0

    .line 306
    goto :goto_6

    .line 307
    :goto_5
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 308
    throw v0

    .line 309
    :cond_a
    :goto_6
    iget-object p0, v0, La/l7x0;->h:La/epq;

    .line 310
    .line 311
    if-nez p0, :cond_e

    .line 312
    .line 313
    iget-object p0, v0, La/l7x0;->g:Ljava/lang/Object;

    .line 314
    .line 315
    monitor-enter p0

    .line 316
    :try_start_1
    iget-object v1, v0, La/l7x0;->h:La/epq;

    .line 317
    .line 318
    if-nez v1, :cond_d

    .line 319
    .line 320
    if-nez v2, :cond_b

    .line 321
    .line 322
    sget-object v2, La/i7x0;->a:La/i7x0;

    .line 323
    .line 324
    goto :goto_7

    .line 325
    :catchall_1
    move-exception v0

    .line 326
    goto :goto_9

    .line 327
    :cond_b
    :goto_7
    iget-object v1, v0, La/l7x0;->a:Landroid/content/Context;

    .line 328
    .line 329
    invoke-static {v1}, La/m0x0;->X(Landroid/content/Context;)Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-nez v3, :cond_c

    .line 334
    .line 335
    sget-object v3, La/tsn;->c:La/tsn;

    .line 336
    .line 337
    iget-object v4, v0, La/l7x0;->b:La/lin0;

    .line 338
    .line 339
    invoke-interface {v4}, La/lin0;->get()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 344
    .line 345
    const/4 v6, 0x0

    .line 346
    invoke-static {v3, v6}, Ljava/util/concurrent/Executors;->callable(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Callable;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-static {v1, v3, v5}, La/m0x0;->W(Landroid/content/Context;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)La/l2;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    new-instance v3, La/g7x0;

    .line 355
    .line 356
    invoke-direct {v3, v0, v2}, La/g7x0;-><init>(La/l7x0;La/r7x0;)V

    .line 357
    .line 358
    .line 359
    invoke-interface {v4}, La/lin0;->get()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 364
    .line 365
    invoke-static {v1, v3, v2}, La/n5;->q(La/ig00;La/yy3;Ljava/util/concurrent/Executor;)La/l5;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    iput-object v1, v0, La/l7x0;->h:La/epq;

    .line 370
    .line 371
    goto :goto_8

    .line 372
    :cond_c
    iget-object v1, v0, La/l7x0;->d:La/lin0;

    .line 373
    .line 374
    invoke-interface {v1}, La/lin0;->get()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    check-cast v1, La/y2x0;

    .line 379
    .line 380
    new-instance v3, La/k7x0;

    .line 381
    .line 382
    invoke-direct {v3, v0, v2}, La/k7x0;-><init>(La/l7x0;La/r7x0;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1, v3}, La/y2x0;->a(La/k7x0;)La/d1;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    iput-object v1, v0, La/l7x0;->h:La/epq;

    .line 390
    .line 391
    :goto_8
    new-instance v2, La/fju0;

    .line 392
    .line 393
    const/16 v3, 0xe

    .line 394
    .line 395
    invoke-direct {v2, v1, v3}, La/fju0;-><init>(Ljava/lang/Object;B)V

    .line 396
    .line 397
    .line 398
    iget-object v0, v0, La/l7x0;->b:La/lin0;

    .line 399
    .line 400
    invoke-interface {v0}, La/lin0;->get()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 405
    .line 406
    invoke-virtual {v1, v2, v0}, La/l2;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 407
    .line 408
    .line 409
    :cond_d
    monitor-exit p0

    .line 410
    goto :goto_a

    .line 411
    :goto_9
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 412
    throw v0

    .line 413
    :cond_e
    :goto_a
    return-void

    .line 414
    :pswitch_1
    invoke-virtual {p0}, La/l6x0;->b()V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    nop

    .line 419
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
