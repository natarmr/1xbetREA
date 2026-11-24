.class public final synthetic La/apj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/o55;La/ozw;)V
    .locals 0

    .line 1
    const/16 p2, 0xc

    iput-byte p2, p0, La/apj0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/apj0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/apj0;->a:B

    iput-object p1, p0, La/apj0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget-byte v0, p0, La/apj0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-wide/16 v2, 0x1

    .line 5
    .line 6
    const/4 v4, 0x1

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    iget-object p0, p0, La/apj0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, La/x3w0;

    .line 15
    .line 16
    iget-object p0, p0, La/x3w0;->a:La/xx;

    .line 17
    .line 18
    invoke-virtual {p0}, La/xx;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    check-cast p0, La/fht0;

    .line 23
    .line 24
    iget-object v0, p0, La/fht0;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/wpg0;

    .line 27
    .line 28
    new-instance v1, La/ytt0;

    .line 29
    .line 30
    const/4 v2, 0x5

    .line 31
    invoke-direct {v1, p0, v2}, La/ytt0;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, La/wpg0;->l(La/wzn0;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_1
    check-cast p0, La/nov0;

    .line 39
    .line 40
    const-string v0, "FirebaseMessaging"

    .line 41
    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v2, "Service took too long to process intent: "

    .line 45
    .line 46
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, La/nov0;->a:Landroid/content/Intent;

    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v2, " finishing."

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, La/nov0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 71
    .line 72
    invoke-virtual {p0, v6}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_2
    check-cast p0, La/yeu0;

    .line 77
    .line 78
    iget-object v0, p0, La/weu0;->a:Landroid/view/Choreographer;

    .line 79
    .line 80
    invoke-static {v0, p0}, La/e4e0;->h(Landroid/view/Choreographer;Landroid/view/Choreographer$VsyncCallback;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_3
    move-object v0, p0

    .line 85
    check-cast v0, La/o24;

    .line 86
    .line 87
    iget-object p0, v0, La/o24;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 90
    .line 91
    invoke-virtual {p0, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    monitor-enter v0

    .line 95
    :try_start_0
    iget-object p0, v0, La/o24;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->isMarked()Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_0

    .line 104
    .line 105
    iget-object p0, v0, La/o24;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast p0, La/qmy;

    .line 114
    .line 115
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    :try_start_1
    new-instance v1, Ljava/util/HashMap;

    .line 117
    .line 118
    iget-object v2, p0, La/qmy;->a:Ljava/util/HashMap;

    .line 119
    .line 120
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 124
    .line 125
    .line 126
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 127
    :try_start_2
    monitor-exit p0

    .line 128
    iget-object p0, v0, La/o24;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, La/qmy;

    .line 137
    .line 138
    invoke-virtual {p0, v1, v5}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :catchall_0
    move-exception p0

    .line 143
    goto :goto_1

    .line 144
    :catchall_1
    move-exception v1

    .line 145
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 146
    :try_start_4
    throw v1

    .line 147
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 148
    if-eqz v6, :cond_1

    .line 149
    .line 150
    iget-object p0, v0, La/o24;->d:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p0, La/ywq0;

    .line 153
    .line 154
    iget-object v1, p0, La/ywq0;->a:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, La/oa40;

    .line 157
    .line 158
    iget-object p0, p0, La/ywq0;->c:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p0, Ljava/lang/String;

    .line 161
    .line 162
    iget-boolean v0, v0, La/o24;->a:Z

    .line 163
    .line 164
    invoke-virtual {v1, p0, v6, v0}, La/oa40;->h(Ljava/lang/String;Ljava/util/Map;Z)V

    .line 165
    .line 166
    .line 167
    :cond_1
    return-void

    .line 168
    :goto_1
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 169
    throw p0

    .line 170
    :pswitch_4
    check-cast p0, La/ywq0;

    .line 171
    .line 172
    iget-object v0, p0, La/ywq0;->g:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 175
    .line 176
    monitor-enter v0

    .line 177
    :try_start_6
    iget-object v1, p0, La/ywq0;->g:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v1, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->isMarked()Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-eqz v1, :cond_2

    .line 186
    .line 187
    iget-object v1, p0, La/ywq0;->g:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v1, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    move-object v6, v1

    .line 196
    check-cast v6, Ljava/lang/String;

    .line 197
    .line 198
    iget-object v1, p0, La/ywq0;->g:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v1, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 201
    .line 202
    invoke-virtual {v1, v6, v5}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :catchall_2
    move-exception p0

    .line 207
    goto :goto_3

    .line 208
    :cond_2
    move v4, v5

    .line 209
    :goto_2
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 210
    if-eqz v4, :cond_3

    .line 211
    .line 212
    iget-object v0, p0, La/ywq0;->a:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v0, La/oa40;

    .line 215
    .line 216
    iget-object p0, p0, La/ywq0;->c:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast p0, Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {v0, p0, v6}, La/oa40;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    :cond_3
    return-void

    .line 224
    :goto_3
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 225
    throw p0

    .line 226
    :pswitch_5
    check-cast p0, La/qrq0;

    .line 227
    .line 228
    invoke-virtual {p0}, La/qrq0;->i()V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, La/qrq0;->l:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 232
    .line 233
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-nez v2, :cond_4

    .line 250
    .line 251
    iget-object p0, p0, La/qrq0;->h:Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->setHint(Ljava/lang/CharSequence;)V

    .line 254
    .line 255
    .line 256
    :cond_4
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :pswitch_6
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 269
    .line 270
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 271
    .line 272
    .line 273
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 274
    .line 275
    invoke-interface {p0, v2, v3, v0}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :pswitch_7
    check-cast p0, Landroid/os/HandlerThread;

    .line 280
    .line 281
    invoke-virtual {p0}, Landroid/os/HandlerThread;->quit()Z

    .line 282
    .line 283
    .line 284
    const-wide/16 v0, 0x3e8

    .line 285
    .line 286
    invoke-virtual {p0, v0, v1}, Ljava/lang/Thread;->join(J)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :pswitch_8
    check-cast p0, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-eqz v1, :cond_5

    .line 301
    .line 302
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    check-cast v1, Ljava/util/concurrent/ExecutorService;

    .line 307
    .line 308
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 309
    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_5
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    if-eqz v0, :cond_6

    .line 321
    .line 322
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 327
    .line 328
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 329
    .line 330
    invoke-interface {v0, v2, v3, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 331
    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_6
    return-void

    .line 335
    :pswitch_9
    check-cast p0, La/q8q0;

    .line 336
    .line 337
    iget-object v0, p0, La/q8q0;->b:La/y3v;

    .line 338
    .line 339
    iput-object v6, p0, La/q8q0;->n:La/apj0;

    .line 340
    .line 341
    iget-object v2, p0, La/q8q0;->m:La/xz40;

    .line 342
    .line 343
    iget-object p0, p0, La/q8q0;->a:Landroid/view/View;

    .line 344
    .line 345
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    if-nez v3, :cond_7

    .line 350
    .line 351
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    if-eqz p0, :cond_7

    .line 360
    .line 361
    invoke-virtual {p0}, Landroid/view/View;->onCheckIsTextEditor()Z

    .line 362
    .line 363
    .line 364
    move-result p0

    .line 365
    if-ne p0, v4, :cond_7

    .line 366
    .line 367
    invoke-virtual {v2}, La/xz40;->g()V

    .line 368
    .line 369
    .line 370
    goto/16 :goto_b

    .line 371
    .line 372
    :cond_7
    new-instance p0, La/mie0;

    .line 373
    .line 374
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 375
    .line 376
    .line 377
    new-instance v3, La/mie0;

    .line 378
    .line 379
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 380
    .line 381
    .line 382
    iget-object v6, v2, La/xz40;->a:[Ljava/lang/Object;

    .line 383
    .line 384
    iget v7, v2, La/xz40;->c:I

    .line 385
    .line 386
    move v8, v5

    .line 387
    :goto_6
    if-ge v8, v7, :cond_e

    .line 388
    .line 389
    aget-object v9, v6, v8

    .line 390
    .line 391
    check-cast v9, La/p8q0;

    .line 392
    .line 393
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 394
    .line 395
    .line 396
    move-result v10

    .line 397
    if-eqz v10, :cond_c

    .line 398
    .line 399
    if-eq v10, v4, :cond_b

    .line 400
    .line 401
    if-eq v10, v1, :cond_9

    .line 402
    .line 403
    const/4 v11, 0x3

    .line 404
    if-ne v10, v11, :cond_8

    .line 405
    .line 406
    goto :goto_7

    .line 407
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 408
    .line 409
    .line 410
    goto/16 :goto_b

    .line 411
    .line 412
    :cond_9
    :goto_7
    iget-object v10, p0, La/mie0;->a:Ljava/lang/Object;

    .line 413
    .line 414
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 415
    .line 416
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v10

    .line 420
    if-nez v10, :cond_d

    .line 421
    .line 422
    sget-object v10, La/p8q0;->c:La/p8q0;

    .line 423
    .line 424
    if-ne v9, v10, :cond_a

    .line 425
    .line 426
    move v9, v4

    .line 427
    goto :goto_8

    .line 428
    :cond_a
    move v9, v5

    .line 429
    :goto_8
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 430
    .line 431
    .line 432
    move-result-object v9

    .line 433
    iput-object v9, v3, La/mie0;->a:Ljava/lang/Object;

    .line 434
    .line 435
    goto :goto_9

    .line 436
    :cond_b
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 437
    .line 438
    iput-object v9, p0, La/mie0;->a:Ljava/lang/Object;

    .line 439
    .line 440
    iput-object v9, v3, La/mie0;->a:Ljava/lang/Object;

    .line 441
    .line 442
    goto :goto_9

    .line 443
    :cond_c
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 444
    .line 445
    iput-object v9, p0, La/mie0;->a:Ljava/lang/Object;

    .line 446
    .line 447
    iput-object v9, v3, La/mie0;->a:Ljava/lang/Object;

    .line 448
    .line 449
    :cond_d
    :goto_9
    add-int/lit8 v8, v8, 0x1

    .line 450
    .line 451
    goto :goto_6

    .line 452
    :cond_e
    invoke-virtual {v2}, La/xz40;->g()V

    .line 453
    .line 454
    .line 455
    iget-object v1, p0, La/mie0;->a:Ljava/lang/Object;

    .line 456
    .line 457
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 458
    .line 459
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    if-eqz v1, :cond_f

    .line 464
    .line 465
    iget-object v1, v0, La/y3v;->c:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v1, La/a8z;

    .line 468
    .line 469
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 474
    .line 475
    iget-object v2, v0, La/y3v;->b:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v2, Landroid/view/View;

    .line 478
    .line 479
    invoke-virtual {v1, v2}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 480
    .line 481
    .line 482
    :cond_f
    iget-object v1, v3, La/mie0;->a:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v1, Ljava/lang/Boolean;

    .line 485
    .line 486
    if-eqz v1, :cond_11

    .line 487
    .line 488
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 489
    .line 490
    .line 491
    move-result v1

    .line 492
    if-eqz v1, :cond_10

    .line 493
    .line 494
    iget-object v1, v0, La/y3v;->d:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v1, La/ani0;

    .line 497
    .line 498
    iget-object v1, v1, La/ani0;->a:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v1, La/lef0;

    .line 501
    .line 502
    invoke-virtual {v1}, La/lef0;->l()V

    .line 503
    .line 504
    .line 505
    goto :goto_a

    .line 506
    :cond_10
    iget-object v1, v0, La/y3v;->d:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v1, La/ani0;

    .line 509
    .line 510
    iget-object v1, v1, La/ani0;->a:Ljava/lang/Object;

    .line 511
    .line 512
    check-cast v1, La/lef0;

    .line 513
    .line 514
    invoke-virtual {v1}, La/lef0;->h()V

    .line 515
    .line 516
    .line 517
    :cond_11
    :goto_a
    iget-object p0, p0, La/mie0;->a:Ljava/lang/Object;

    .line 518
    .line 519
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 520
    .line 521
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-result p0

    .line 525
    if-eqz p0, :cond_12

    .line 526
    .line 527
    iget-object p0, v0, La/y3v;->c:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast p0, La/a8z;

    .line 530
    .line 531
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object p0

    .line 535
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 536
    .line 537
    iget-object v0, v0, La/y3v;->b:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v0, Landroid/view/View;

    .line 540
    .line 541
    invoke-virtual {p0, v0}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    .line 542
    .line 543
    .line 544
    :cond_12
    :goto_b
    return-void

    .line 545
    :pswitch_a
    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 546
    .line 547
    sget-object v0, Lcom/google/android/material/textfield/TextInputLayout;->e2:[[I

    .line 548
    .line 549
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e:Landroid/widget/EditText;

    .line 550
    .line 551
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 552
    .line 553
    .line 554
    return-void

    .line 555
    :pswitch_b
    check-cast p0, La/o55;

    .line 556
    .line 557
    iget-object p0, p0, La/o55;->d:La/mz9;

    .line 558
    .line 559
    if-eqz p0, :cond_13

    .line 560
    .line 561
    iget-object p0, p0, La/mz9;->a:La/qz9;

    .line 562
    .line 563
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 564
    .line 565
    invoke-virtual {p0}, La/qz9;->S0()La/d4a;

    .line 566
    .line 567
    .line 568
    move-result-object p0

    .line 569
    sget-object v0, La/t0k0;->a:La/t0k0;

    .line 570
    .line 571
    invoke-virtual {p0, v0}, La/d4a;->C(La/a1k0;)V

    .line 572
    .line 573
    .line 574
    goto :goto_c

    .line 575
    :cond_13
    const-string p0, "One and only one callback is allowed."

    .line 576
    .line 577
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    :goto_c
    return-void

    .line 581
    :pswitch_c
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 582
    .line 583
    invoke-static {p0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->a(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;)V

    .line 584
    .line 585
    .line 586
    return-void

    .line 587
    :pswitch_d
    check-cast p0, La/b9o0;

    .line 588
    .line 589
    iget-object p0, p0, La/b9o0;->a:La/a9o0;

    .line 590
    .line 591
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 596
    .line 597
    if-eqz v1, :cond_14

    .line 598
    .line 599
    check-cast v0, Landroid/view/ViewGroup;

    .line 600
    .line 601
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 602
    .line 603
    .line 604
    :cond_14
    return-void

    .line 605
    :pswitch_e
    check-cast p0, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;

    .line 606
    .line 607
    sget-object v0, La/vvn0;->W1:La/j6m0;

    .line 608
    .line 609
    iget-object p0, p0, Lorg/xplatform/swipex/impl/presentation/swipex/cardstack/CardStackLayoutManager;->r:La/xna;

    .line 610
    .line 611
    iput v5, p0, La/xna;->f:I

    .line 612
    .line 613
    return-void

    .line 614
    :pswitch_f
    check-cast p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 615
    .line 616
    sget-object v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->o1:[I

    .line 617
    .line 618
    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->l()V

    .line 619
    .line 620
    .line 621
    return-void

    .line 622
    :pswitch_10
    check-cast p0, La/hi;

    .line 623
    .line 624
    invoke-virtual {p0}, La/hi;->b()V

    .line 625
    .line 626
    .line 627
    return-void

    .line 628
    :pswitch_11
    check-cast p0, La/cyu;

    .line 629
    .line 630
    iget-object p0, p0, La/cyu;->c:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast p0, La/btd;

    .line 633
    .line 634
    if-eqz p0, :cond_15

    .line 635
    .line 636
    invoke-virtual {p0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    .line 637
    .line 638
    .line 639
    move-result-object p0

    .line 640
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 641
    .line 642
    .line 643
    move-result-object p0

    .line 644
    :goto_d
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    if-eqz v0, :cond_15

    .line 649
    .line 650
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    check-cast v0, La/cmn0;

    .line 655
    .line 656
    invoke-virtual {v0}, La/cmn0;->b()V

    .line 657
    .line 658
    .line 659
    goto :goto_d

    .line 660
    :cond_15
    return-void

    .line 661
    :pswitch_12
    check-cast p0, La/kgn0;

    .line 662
    .line 663
    invoke-static {p0}, La/kgn0;->a(La/kgn0;)V

    .line 664
    .line 665
    .line 666
    return-void

    .line 667
    :pswitch_13
    check-cast p0, La/r4n0;

    .line 668
    .line 669
    invoke-virtual {p0}, La/r4n0;->i()V

    .line 670
    .line 671
    .line 672
    iget-object v0, p0, La/r4n0;->k:Lorg/xplatform/uikit/components/search_field/DsSearchField;

    .line 673
    .line 674
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    if-nez v2, :cond_16

    .line 691
    .line 692
    iget-object p0, p0, La/r4n0;->h:Ljava/lang/String;

    .line 693
    .line 694
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->setHint(Ljava/lang/CharSequence;)V

    .line 695
    .line 696
    .line 697
    :cond_16
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/search_field/DsSearchField;->getEditText()Lcom/google/android/material/textfield/TextInputEditText;

    .line 698
    .line 699
    .line 700
    move-result-object p0

    .line 701
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 702
    .line 703
    .line 704
    move-result v0

    .line 705
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 706
    .line 707
    .line 708
    return-void

    .line 709
    :pswitch_14
    check-cast p0, La/j2m0;

    .line 710
    .line 711
    iget-object v0, p0, La/j2m0;->f:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 712
    .line 713
    const/4 v1, -0x1

    .line 714
    if-eqz v0, :cond_17

    .line 715
    .line 716
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1()I

    .line 717
    .line 718
    .line 719
    move-result v0

    .line 720
    goto :goto_e

    .line 721
    :cond_17
    move v0, v1

    .line 722
    :goto_e
    if-eq v0, v1, :cond_18

    .line 723
    .line 724
    goto :goto_f

    .line 725
    :cond_18
    iget v0, p0, La/j2m0;->l:I

    .line 726
    .line 727
    if-lez v0, :cond_19

    .line 728
    .line 729
    goto :goto_f

    .line 730
    :cond_19
    iget v0, p0, La/j2m0;->j:I

    .line 731
    .line 732
    :goto_f
    invoke-virtual {p0, v0, v4}, La/j2m0;->g(IZ)V

    .line 733
    .line 734
    .line 735
    return-void

    .line 736
    :pswitch_15
    check-cast p0, La/qxk0;

    .line 737
    .line 738
    sget v0, La/qxk0;->l:I

    .line 739
    .line 740
    iget-object v0, p0, La/qxk0;->h:Landroid/view/Surface;

    .line 741
    .line 742
    if-eqz v0, :cond_1a

    .line 743
    .line 744
    iget-object v1, p0, La/qxk0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 745
    .line 746
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 747
    .line 748
    .line 749
    move-result-object v1

    .line 750
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 751
    .line 752
    .line 753
    move-result v2

    .line 754
    if-eqz v2, :cond_1a

    .line 755
    .line 756
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    check-cast v2, La/qlo;

    .line 761
    .line 762
    iget-object v2, v2, La/qlo;->a:La/ulo;

    .line 763
    .line 764
    invoke-virtual {v2, v6}, La/ulo;->S(Ljava/lang/Object;)V

    .line 765
    .line 766
    .line 767
    goto :goto_10

    .line 768
    :cond_1a
    iget-object v1, p0, La/qxk0;->g:Landroid/graphics/SurfaceTexture;

    .line 769
    .line 770
    if-eqz v1, :cond_1b

    .line 771
    .line 772
    invoke-virtual {v1}, Landroid/graphics/SurfaceTexture;->release()V

    .line 773
    .line 774
    .line 775
    :cond_1b
    if-eqz v0, :cond_1c

    .line 776
    .line 777
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 778
    .line 779
    .line 780
    :cond_1c
    iput-object v6, p0, La/qxk0;->g:Landroid/graphics/SurfaceTexture;

    .line 781
    .line 782
    iput-object v6, p0, La/qxk0;->h:Landroid/view/Surface;

    .line 783
    .line 784
    return-void

    .line 785
    :pswitch_16
    check-cast p0, La/qo8;

    .line 786
    .line 787
    iput-boolean v5, p0, La/qo8;->c:Z

    .line 788
    .line 789
    iget-object v0, p0, La/qo8;->e:Ljava/lang/Object;

    .line 790
    .line 791
    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 792
    .line 793
    iget-object v2, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:La/ygu0;

    .line 794
    .line 795
    if-eqz v2, :cond_1d

    .line 796
    .line 797
    invoke-virtual {v2}, La/ygu0;->f()Z

    .line 798
    .line 799
    .line 800
    move-result v2

    .line 801
    if-eqz v2, :cond_1d

    .line 802
    .line 803
    iget v0, p0, La/qo8;->b:I

    .line 804
    .line 805
    invoke-virtual {p0, v0}, La/qo8;->d(I)V

    .line 806
    .line 807
    .line 808
    goto :goto_11

    .line 809
    :cond_1d
    iget v2, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 810
    .line 811
    if-ne v2, v1, :cond_1e

    .line 812
    .line 813
    iget p0, p0, La/qo8;->b:I

    .line 814
    .line 815
    invoke-virtual {v0, p0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->y(I)V

    .line 816
    .line 817
    .line 818
    :cond_1e
    :goto_11
    return-void

    .line 819
    :pswitch_17
    check-cast p0, La/y3v;

    .line 820
    .line 821
    iget-object v0, p0, La/y3v;->c:Ljava/lang/Object;

    .line 822
    .line 823
    check-cast v0, Ljava/util/ArrayDeque;

    .line 824
    .line 825
    monitor-enter v0

    .line 826
    :try_start_8
    iget-object v1, p0, La/y3v;->b:Ljava/lang/Object;

    .line 827
    .line 828
    check-cast v1, Landroid/content/SharedPreferences;

    .line 829
    .line 830
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 831
    .line 832
    .line 833
    move-result-object v1

    .line 834
    const-string v2, "topic_operation_queue"

    .line 835
    .line 836
    new-instance v3, Ljava/lang/StringBuilder;

    .line 837
    .line 838
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 839
    .line 840
    .line 841
    iget-object p0, p0, La/y3v;->c:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast p0, Ljava/util/ArrayDeque;

    .line 844
    .line 845
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 846
    .line 847
    .line 848
    move-result-object p0

    .line 849
    :goto_12
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 850
    .line 851
    .line 852
    move-result v4

    .line 853
    if-eqz v4, :cond_1f

    .line 854
    .line 855
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v4

    .line 859
    check-cast v4, Ljava/lang/String;

    .line 860
    .line 861
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 862
    .line 863
    .line 864
    const-string v4, ","

    .line 865
    .line 866
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 867
    .line 868
    .line 869
    goto :goto_12

    .line 870
    :cond_1f
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object p0

    .line 874
    invoke-interface {v1, v2, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 875
    .line 876
    .line 877
    move-result-object p0

    .line 878
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 879
    .line 880
    .line 881
    monitor-exit v0

    .line 882
    return-void

    .line 883
    :catchall_3
    move-exception p0

    .line 884
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 885
    throw p0

    .line 886
    nop

    .line 887
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
