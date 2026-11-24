.class public final synthetic La/w6e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/e7e;


# direct methods
.method public synthetic constructor <init>(La/e7e;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/w6e;->a:B

    iput-object p1, p0, La/w6e;->b:La/e7e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 11

    .line 1
    iget-byte v0, p0, La/w6e;->a:B

    .line 2
    .line 3
    const/16 v1, 0x21

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/w6e;->b:La/e7e;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/e7e;->d2:La/kwd;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string p2, "ERROR_DIALOG_RESULT_VALUE"

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    instance-of p2, p1, Ljava/util/List;

    .line 23
    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    check-cast v2, Ljava/util/List;

    .line 28
    .line 29
    :cond_0
    if-eqz v2, :cond_6

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_6

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    check-cast p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState;

    .line 46
    .line 47
    if-eqz p2, :cond_5

    .line 48
    .line 49
    instance-of v0, p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RemoveMessage;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RemoveMessage;

    .line 58
    .line 59
    iget-object p2, p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RemoveMessage;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v0, v0, La/fae;->n:La/qv;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v0, v0, La/qv;->a:La/g45;

    .line 70
    .line 71
    iget-object v0, v0, La/g45;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, La/i7e;

    .line 74
    .line 75
    invoke-virtual {v0, p2}, La/i7e;->d(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    instance-of v0, p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RetryUploading;

    .line 80
    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RetryUploading;

    .line 88
    .line 89
    iget-object p2, p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RetryUploading;->a:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0, p2}, La/fae;->z(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    instance-of v0, p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RetryDownloading;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RetryDownloading;

    .line 104
    .line 105
    iget-object v2, p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RetryDownloading;->a:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v3, p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RetryDownloading;->b:Ljava/lang/String;

    .line 108
    .line 109
    iget-wide v4, p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RetryDownloading;->c:J

    .line 110
    .line 111
    iget-boolean p2, p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$RetryDownloading;->d:Z

    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    if-eqz p2, :cond_3

    .line 120
    .line 121
    new-instance p2, La/pcl;

    .line 122
    .line 123
    invoke-direct {p2, v2, v3, v4, v5}, La/pcl;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    new-instance v1, La/qcl;

    .line 128
    .line 129
    sget-object v6, La/w1x;->d:La/w1x;

    .line 130
    .line 131
    invoke-direct/range {v1 .. v6}, La/qcl;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/w1x;)V

    .line 132
    .line 133
    .line 134
    move-object p2, v1

    .line 135
    :goto_1
    invoke-virtual {v0, p2}, La/fae;->x(La/rcl;)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_4
    instance-of v0, p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$Resend;

    .line 140
    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$Resend;

    .line 148
    .line 149
    iget-object p2, p2, Lorg/xplatform/consultantchat/presentation/dialogs/senderror/model/MessageErrorState$Resend;->a:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v0, p2}, La/fae;->z(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 156
    .line 157
    .line 158
    :cond_6
    return-void

    .line 159
    :pswitch_0
    sget-object v0, La/e7e;->d2:La/kwd;

    .line 160
    .line 161
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 165
    .line 166
    if-gt p2, v1, :cond_7

    .line 167
    .line 168
    const-string p2, "FILE_DIALOG_RESULT_RESULT_KEY"

    .line 169
    .line 170
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    goto :goto_2

    .line 175
    :cond_7
    invoke-static {p1}, La/r6e;->l(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    check-cast p1, Landroid/os/Parcelable;

    .line 180
    .line 181
    :goto_2
    check-cast p1, Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult;

    .line 182
    .line 183
    if-eqz p1, :cond_14

    .line 184
    .line 185
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    iget-object p2, p0, La/fae;->B:La/ol60;

    .line 190
    .line 191
    iget-object p0, p0, La/fae;->A:La/zj2;

    .line 192
    .line 193
    invoke-virtual {p0}, La/zj2;->getValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, La/f9e;

    .line 198
    .line 199
    instance-of v1, v0, La/d9e;

    .line 200
    .line 201
    if-eqz v1, :cond_8

    .line 202
    .line 203
    move-object v2, v0

    .line 204
    check-cast v2, La/d9e;

    .line 205
    .line 206
    :cond_8
    if-eqz v2, :cond_9

    .line 207
    .line 208
    iget-object v1, v2, La/d9e;->a:Ljava/util/List;

    .line 209
    .line 210
    if-nez v1, :cond_a

    .line 211
    .line 212
    :cond_9
    sget-object v1, La/iun;->a:La/iun;

    .line 213
    .line 214
    :cond_a
    instance-of v2, p1, Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$FileResult;

    .line 215
    .line 216
    const/4 v3, 0x0

    .line 217
    const/16 v4, 0xa

    .line 218
    .line 219
    if-eqz v2, :cond_e

    .line 220
    .line 221
    move-object v5, p1

    .line 222
    check-cast v5, Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$FileResult;

    .line 223
    .line 224
    iget-object v5, v5, Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$FileResult;->a:Ljava/io/File;

    .line 225
    .line 226
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-static {v5}, La/sj3;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    const-string v7, "image"

    .line 234
    .line 235
    invoke-static {v6, v7, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    if-eqz v6, :cond_e

    .line 240
    .line 241
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-virtual {p1, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    invoke-static {p1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    new-instance v0, Ljava/util/HashSet;

    .line 256
    .line 257
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 258
    .line 259
    .line 260
    new-instance v1, Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, v3}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    :cond_b
    :goto_3
    move-object v2, p1

    .line 270
    check-cast v2, La/paw;

    .line 271
    .line 272
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    if-eqz v3, :cond_c

    .line 277
    .line 278
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    move-object v3, v2

    .line 283
    check-cast v3, Ljava/io/File;

    .line 284
    .line 285
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    if-eqz v3, :cond_b

    .line 294
    .line 295
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    goto :goto_3

    .line 299
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    if-le p1, v4, :cond_d

    .line 304
    .line 305
    new-instance p1, La/n6e;

    .line 306
    .line 307
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p2, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    :cond_d
    new-instance v0, La/d9e;

    .line 314
    .line 315
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-direct {v0, p1}, La/d9e;-><init>(Ljava/util/List;)V

    .line 320
    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_e
    instance-of v5, p1, Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$ImageResult;

    .line 324
    .line 325
    if-eqz v5, :cond_12

    .line 326
    .line 327
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 332
    .line 333
    .line 334
    check-cast p1, Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$ImageResult;

    .line 335
    .line 336
    iget-object p1, p1, Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$ImageResult;->a:Ljava/util/List;

    .line 337
    .line 338
    invoke-virtual {v0, p1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 339
    .line 340
    .line 341
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    new-instance v0, Ljava/util/HashSet;

    .line 346
    .line 347
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 348
    .line 349
    .line 350
    new-instance v1, Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1, v3}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    :cond_f
    :goto_4
    move-object v2, p1

    .line 360
    check-cast v2, La/paw;

    .line 361
    .line 362
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    if-eqz v3, :cond_10

    .line 367
    .line 368
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    move-object v3, v2

    .line 373
    check-cast v3, Ljava/io/File;

    .line 374
    .line 375
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    if-eqz v3, :cond_f

    .line 384
    .line 385
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    goto :goto_4

    .line 389
    :cond_10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 390
    .line 391
    .line 392
    move-result p1

    .line 393
    if-le p1, v4, :cond_11

    .line 394
    .line 395
    new-instance p1, La/n6e;

    .line 396
    .line 397
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 398
    .line 399
    .line 400
    invoke-virtual {p2, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    :cond_11
    new-instance v0, La/d9e;

    .line 404
    .line 405
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    invoke-direct {v0, p1}, La/d9e;-><init>(Ljava/util/List;)V

    .line 410
    .line 411
    .line 412
    goto :goto_5

    .line 413
    :cond_12
    if-eqz v2, :cond_13

    .line 414
    .line 415
    new-instance v0, La/c9e;

    .line 416
    .line 417
    check-cast p1, Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$FileResult;

    .line 418
    .line 419
    iget-object p1, p1, Lorg/xplatform/consultantchat/presentation/dialogs/file/model/FileBottomDialogResult$FileResult;->a:Ljava/io/File;

    .line 420
    .line 421
    invoke-direct {v0, p1}, La/c9e;-><init>(Ljava/io/File;)V

    .line 422
    .line 423
    .line 424
    :cond_13
    :goto_5
    invoke-virtual {p0, v0}, La/zj2;->f(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    :cond_14
    return-void

    .line 428
    :pswitch_1
    sget-object v0, La/e7e;->d2:La/kwd;

    .line 429
    .line 430
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 434
    .line 435
    if-gt p2, v1, :cond_15

    .line 436
    .line 437
    const-string p2, "SEND_RATING_REQUEST_RESULT"

    .line 438
    .line 439
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    goto :goto_6

    .line 444
    :cond_15
    invoke-static {p1}, La/r6e;->s(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    check-cast p1, Landroid/os/Parcelable;

    .line 449
    .line 450
    :goto_6
    check-cast p1, Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel$Value;

    .line 451
    .line 452
    if-eqz p1, :cond_19

    .line 453
    .line 454
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    iget p0, p1, Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel$Value;->b:I

    .line 459
    .line 460
    iget-boolean p1, p1, Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel$Value;->a:Z

    .line 461
    .line 462
    iget-object p2, v4, La/fae;->L:La/p7m0;

    .line 463
    .line 464
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object p2

    .line 468
    instance-of v0, p2, La/tkp;

    .line 469
    .line 470
    if-eqz v0, :cond_16

    .line 471
    .line 472
    check-cast p2, La/tkp;

    .line 473
    .line 474
    iget-object v2, p2, La/tkp;->a:La/skp;

    .line 475
    .line 476
    :cond_16
    if-nez v2, :cond_17

    .line 477
    .line 478
    goto :goto_7

    .line 479
    :cond_17
    iget-object p2, v2, La/skp;->b:La/rkp;

    .line 480
    .line 481
    instance-of v0, p2, La/pkp;

    .line 482
    .line 483
    if-eqz v0, :cond_18

    .line 484
    .line 485
    check-cast p2, La/pkp;

    .line 486
    .line 487
    iget v0, p2, La/pkp;->a:I

    .line 488
    .line 489
    if-ne v0, p0, :cond_18

    .line 490
    .line 491
    iget-boolean p2, p2, La/pkp;->b:Z

    .line 492
    .line 493
    if-eq p2, p1, :cond_19

    .line 494
    .line 495
    :cond_18
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 496
    .line 497
    .line 498
    move-result-object p2

    .line 499
    iget-object v0, v4, La/fae;->k:La/mne;

    .line 500
    .line 501
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 502
    .line 503
    new-instance v3, La/z6e;

    .line 504
    .line 505
    const/4 v9, 0x0

    .line 506
    const/16 v10, 0xc

    .line 507
    .line 508
    move-object v5, v4

    .line 509
    const/4 v4, 0x1

    .line 510
    const-class v6, La/fae;

    .line 511
    .line 512
    const-string v7, "handleError"

    .line 513
    .line 514
    const-string v8, "handleError(Ljava/lang/Throwable;)V"

    .line 515
    .line 516
    invoke-direct/range {v3 .. v10}, La/z6e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 517
    .line 518
    .line 519
    move-object v1, v3

    .line 520
    new-instance v3, La/eae;

    .line 521
    .line 522
    const/4 v8, 0x0

    .line 523
    move v6, p0

    .line 524
    move v7, p1

    .line 525
    move-object v4, v5

    .line 526
    move-object v5, v2

    .line 527
    invoke-direct/range {v3 .. v8}, La/eae;-><init>(La/fae;La/skp;IZLa/yje;)V

    .line 528
    .line 529
    .line 530
    const/16 v10, 0xa

    .line 531
    .line 532
    const/4 v7, 0x0

    .line 533
    move-object v5, p2

    .line 534
    move-object v8, v0

    .line 535
    move-object v6, v1

    .line 536
    move-object v9, v3

    .line 537
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 538
    .line 539
    .line 540
    :cond_19
    :goto_7
    return-void

    .line 541
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
