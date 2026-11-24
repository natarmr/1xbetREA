.class public final La/u43;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kwk;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/u43;->a:B

    iput-object p1, p0, La/u43;->b:Ljava/lang/Object;

    iput-object p2, p0, La/u43;->c:Ljava/lang/Object;

    iput-object p3, p0, La/u43;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-byte v0, p0, La/u43;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/u43;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, La/u43;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object p0, p0, La/u43;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Landroid/view/ViewTreeObserver;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    check-cast v3, La/mr3;

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    check-cast v2, Landroid/view/View;

    .line 27
    .line 28
    sget-object p0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 29
    .line 30
    invoke-static {v2, v1}, La/div0;->a(Landroid/view/View;La/oyc;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    check-cast p0, La/pz40;

    .line 35
    .line 36
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 41
    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    check-cast v3, La/d930;

    .line 45
    .line 46
    check-cast v2, La/jpu0;

    .line 47
    .line 48
    iget-object v0, v2, La/jpu0;->a:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v3, v0, p0}, La/d930;->c(Ljava/lang/String;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void

    .line 54
    :pswitch_1
    check-cast p0, La/ujd;

    .line 55
    .line 56
    check-cast v3, La/yx5;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {v3}, La/ujd;->a(Landroidx/fragment/app/Fragment;)V

    .line 62
    .line 63
    .line 64
    check-cast v2, La/dcv0;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const-string v0, "WHO_WIN_REQUEST_COUPON_TYPE_LIMIT_EXCEED_DIALOG"

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v0, "WHO_WIN_REQUEST_REPLACE_COUPON_KEY"

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v0, "REQUEST_ALREADY_COUPON_DIALOG_KEY"

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const-string v0, "REQUEST_CLEAR_COUPON_FOR_BET_BUILDER_DIALOG_KEYFIRST"

    .line 89
    .line 90
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v0, "REQUEST_CLEAR_COUPON_FOR_BET_BUILDER_DIALOG_KEYSECOND"

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_2
    check-cast p0, La/czg0;

    .line 100
    .line 101
    iget-object v0, p0, La/czg0;->b:La/hz40;

    .line 102
    .line 103
    invoke-virtual {v0, v3}, La/hz40;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v2, La/izg0;

    .line 108
    .line 109
    if-ne v0, v2, :cond_3

    .line 110
    .line 111
    iget-object p0, p0, La/czg0;->a:Ljava/util/Map;

    .line 112
    .line 113
    invoke-virtual {v2}, La/izg0;->e()Ljava/util/Map;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_2

    .line 122
    .line 123
    invoke-interface {p0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_2
    invoke-interface {p0, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    :cond_3
    :goto_0
    return-void

    .line 131
    :pswitch_3
    check-cast p0, La/uiu0;

    .line 132
    .line 133
    instance-of v0, p0, Ljava/lang/AutoCloseable;

    .line 134
    .line 135
    if-eqz v0, :cond_4

    .line 136
    .line 137
    invoke-virtual {p0}, La/uiu0;->close()V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_4
    instance-of v0, p0, Ljava/util/concurrent/ExecutorService;

    .line 142
    .line 143
    if-eqz v0, :cond_a

    .line 144
    .line 145
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 146
    .line 147
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    if-ne p0, v0, :cond_5

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-nez v0, :cond_8

    .line 159
    .line 160
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 161
    .line 162
    .line 163
    const/4 v1, 0x0

    .line 164
    :cond_6
    :goto_1
    if-nez v0, :cond_7

    .line 165
    .line 166
    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 167
    .line 168
    const-wide/16 v5, 0x1

    .line 169
    .line 170
    invoke-interface {p0, v5, v6, v4}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 171
    .line 172
    .line 173
    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    goto :goto_1

    .line 175
    :catch_0
    if-nez v1, :cond_6

    .line 176
    .line 177
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 178
    .line 179
    .line 180
    const/4 v1, 0x1

    .line 181
    goto :goto_1

    .line 182
    :cond_7
    if-eqz v1, :cond_8

    .line 183
    .line 184
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 189
    .line 190
    .line 191
    :cond_8
    :goto_2
    check-cast v3, La/glz;

    .line 192
    .line 193
    iget-object p0, v3, La/glz;->i:La/lkz;

    .line 194
    .line 195
    sget-object v0, La/lkz;->c:La/lkz;

    .line 196
    .line 197
    invoke-virtual {p0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    if-ltz p0, :cond_b

    .line 202
    .line 203
    check-cast v2, La/xiu0;

    .line 204
    .line 205
    invoke-virtual {v2}, La/xiu0;->a()La/wiu0;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    iget-object p0, p0, La/wiu0;->b:La/hz40;

    .line 210
    .line 211
    sget-object v0, La/rek0;->h:La/rek0;

    .line 212
    .line 213
    invoke-virtual {p0, v0}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    check-cast p0, La/viu0;

    .line 218
    .line 219
    if-eqz p0, :cond_9

    .line 220
    .line 221
    iget p0, p0, La/viu0;->c:I

    .line 222
    .line 223
    if-lez p0, :cond_9

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_9
    invoke-virtual {v2}, La/xiu0;->a()La/wiu0;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-virtual {p0}, La/wiu0;->v()V

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_a
    invoke-static {}, La/e9d0;->o()V

    .line 235
    .line 236
    .line 237
    :cond_b
    :goto_3
    return-void

    .line 238
    :pswitch_4
    check-cast p0, La/clz;

    .line 239
    .line 240
    if-eqz p0, :cond_c

    .line 241
    .line 242
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    if-eqz p0, :cond_c

    .line 247
    .line 248
    check-cast v3, La/g02;

    .line 249
    .line 250
    invoke-virtual {p0, v3}, La/glz;->f(La/blz;)V

    .line 251
    .line 252
    .line 253
    :cond_c
    check-cast v2, La/wjd;

    .line 254
    .line 255
    sget-object p0, La/kkz;->ON_DESTROY:La/kkz;

    .line 256
    .line 257
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0}, La/kkz;->a()La/lkz;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    iput-object p0, v2, La/wjd;->b:La/lkz;

    .line 265
    .line 266
    invoke-virtual {v2}, La/wjd;->a()V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :pswitch_5
    check-cast p0, Landroidx/fragment/app/Fragment;

    .line 271
    .line 272
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    check-cast v3, La/roq0;

    .line 280
    .line 281
    check-cast v2, La/lme0;

    .line 282
    .line 283
    invoke-static {p0, v3, v2}, La/d9x;->J(Landroidx/fragment/app/e;La/roq0;La/lme0;)V

    .line 284
    .line 285
    .line 286
    return-void

    .line 287
    :pswitch_6
    check-cast v2, La/cjv0;

    .line 288
    .line 289
    check-cast p0, Landroid/view/Window;

    .line 290
    .line 291
    if-nez p0, :cond_d

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_d
    check-cast v3, La/a8z;

    .line 295
    .line 296
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    check-cast v0, La/k9o0;

    .line 301
    .line 302
    iget-object v1, v0, La/k9o0;->a:Ljava/lang/Integer;

    .line 303
    .line 304
    iget-object v3, v0, La/k9o0;->b:Ljava/lang/Integer;

    .line 305
    .line 306
    if-eqz v1, :cond_f

    .line 307
    .line 308
    if-eqz v3, :cond_f

    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    invoke-virtual {p0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    invoke-virtual {p0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 322
    .line 323
    .line 324
    if-eqz v2, :cond_f

    .line 325
    .line 326
    iget-object p0, v0, La/k9o0;->c:Ljava/lang/Boolean;

    .line 327
    .line 328
    if-eqz p0, :cond_e

    .line 329
    .line 330
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 331
    .line 332
    .line 333
    move-result p0

    .line 334
    invoke-virtual {v2, p0}, La/cjv0;->b(Z)V

    .line 335
    .line 336
    .line 337
    :cond_e
    iget-object p0, v0, La/k9o0;->d:Ljava/lang/Boolean;

    .line 338
    .line 339
    if-eqz p0, :cond_f

    .line 340
    .line 341
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 342
    .line 343
    .line 344
    move-result p0

    .line 345
    iget-object v0, v2, La/cjv0;->a:La/ycm0;

    .line 346
    .line 347
    invoke-virtual {v0, p0}, La/ycm0;->v(Z)V

    .line 348
    .line 349
    .line 350
    :cond_f
    :goto_4
    return-void

    .line 351
    :pswitch_7
    check-cast p0, La/clz;

    .line 352
    .line 353
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    check-cast v3, La/wb3;

    .line 358
    .line 359
    invoke-virtual {p0, v3}, La/glz;->f(La/blz;)V

    .line 360
    .line 361
    .line 362
    check-cast v2, La/mie0;

    .line 363
    .line 364
    iget-object p0, v2, La/mie0;->a:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast p0, La/olz;

    .line 367
    .line 368
    if-eqz p0, :cond_10

    .line 369
    .line 370
    invoke-interface {p0}, La/olz;->a()V

    .line 371
    .line 372
    .line 373
    :cond_10
    return-void

    .line 374
    :pswitch_8
    check-cast p0, La/clz;

    .line 375
    .line 376
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    check-cast v3, La/wb3;

    .line 381
    .line 382
    invoke-virtual {p0, v3}, La/glz;->f(La/blz;)V

    .line 383
    .line 384
    .line 385
    check-cast v2, La/mie0;

    .line 386
    .line 387
    iget-object p0, v2, La/mie0;->a:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast p0, La/dlz;

    .line 390
    .line 391
    if-eqz p0, :cond_11

    .line 392
    .line 393
    invoke-interface {p0}, La/dlz;->a()V

    .line 394
    .line 395
    .line 396
    :cond_11
    return-void

    .line 397
    :pswitch_9
    check-cast p0, Landroid/view/ViewTreeObserver;

    .line 398
    .line 399
    invoke-virtual {p0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    if-eqz v0, :cond_12

    .line 404
    .line 405
    check-cast v3, La/mr3;

    .line 406
    .line 407
    invoke-virtual {p0, v3}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 408
    .line 409
    .line 410
    :cond_12
    check-cast v2, Landroid/view/View;

    .line 411
    .line 412
    sget-object p0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 413
    .line 414
    invoke-static {v2, v1}, La/div0;->a(Landroid/view/View;La/oyc;)V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :pswitch_a
    check-cast p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 419
    .line 420
    invoke-virtual {p0, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    check-cast v2, La/i53;

    .line 424
    .line 425
    iget-object p0, v2, La/i53;->d:La/hz40;

    .line 426
    .line 427
    invoke-virtual {p0, v3}, La/hz40;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    return-void

    .line 431
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
