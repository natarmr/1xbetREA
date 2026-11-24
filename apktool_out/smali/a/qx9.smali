.class public final synthetic La/qx9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mbn;La/agn;La/tu9;)V
    .locals 1

    .line 3
    const/4 v0, 0x4

    iput-byte v0, p0, La/qx9;->a:B

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qx9;->b:Ljava/lang/Object;

    iput-object p2, p0, La/qx9;->c:Ljava/lang/Object;

    iput-object v0, p0, La/qx9;->d:Ljava/lang/Object;

    iput-object p3, p0, La/qx9;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/std;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/hy40;La/tu9;)V
    .locals 0

    .line 2
    const/4 p1, 0x7

    iput-byte p1, p0, La/qx9;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/qx9;->b:Ljava/lang/Object;

    iput-object p3, p0, La/qx9;->c:Ljava/lang/Object;

    iput-object p4, p0, La/qx9;->d:Ljava/lang/Object;

    iput-object p5, p0, La/qx9;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/txj;La/agn;La/tu9;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/qx9;->a:B

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qx9;->b:Ljava/lang/Object;

    iput-object p2, p0, La/qx9;->c:Ljava/lang/Object;

    iput-object v0, p0, La/qx9;->d:Ljava/lang/Object;

    iput-object p3, p0, La/qx9;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 4
    iput-byte p5, p0, La/qx9;->a:B

    iput-object p1, p0, La/qx9;->b:Ljava/lang/Object;

    iput-object p2, p0, La/qx9;->c:Ljava/lang/Object;

    iput-object p3, p0, La/qx9;->d:Ljava/lang/Object;

    iput-object p4, p0, La/qx9;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-byte v0, p0, La/qx9;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/qx9;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v4, p0, La/qx9;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, La/qx9;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, La/qx9;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, Landroid/content/Context;

    .line 17
    .line 18
    check-cast v5, Ljava/lang/String;

    .line 19
    .line 20
    check-cast v3, Ljava/lang/Integer;

    .line 21
    .line 22
    check-cast v4, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v0, Landroid/content/Intent;

    .line 28
    .line 29
    const-class v1, Lcom/vk/api/sdk/ui/VKCaptchaActivity;

    .line 30
    .line 31
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 32
    .line 33
    .line 34
    const/high16 v1, 0x10000000

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "key_url"

    .line 41
    .line 42
    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "key_height"

    .line 47
    .line 48
    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "key_width"

    .line 53
    .line 54
    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_0
    check-cast p0, La/ywq0;

    .line 66
    .line 67
    check-cast v5, Ljava/lang/String;

    .line 68
    .line 69
    check-cast v3, Ljava/util/Map;

    .line 70
    .line 71
    check-cast v4, Ljava/util/List;

    .line 72
    .line 73
    iget-object v0, p0, La/ywq0;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, La/oa40;

    .line 76
    .line 77
    iget-object p0, p0, La/ywq0;->g:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Ljava/lang/String;

    .line 86
    .line 87
    if-eqz v2, :cond_0

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v0, v5, p0}, La/oa40;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_0
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-nez p0, :cond_1

    .line 103
    .line 104
    invoke-virtual {v0, v5, v3, v1}, La/oa40;->h(Ljava/lang/String;Ljava/util/Map;Z)V

    .line 105
    .line 106
    .line 107
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    if-nez p0, :cond_2

    .line 112
    .line 113
    invoke-virtual {v0, v5, v4}, La/oa40;->i(Ljava/lang/String;Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    :cond_2
    return-void

    .line 117
    :pswitch_1
    check-cast p0, La/raq0;

    .line 118
    .line 119
    check-cast v5, Landroid/view/Surface;

    .line 120
    .line 121
    check-cast v3, La/wu9;

    .line 122
    .line 123
    check-cast v4, La/pmn0;

    .line 124
    .line 125
    const-string v0, "TextureViewImpl"

    .line 126
    .line 127
    const-string v1, "Safe to release surface."

    .line 128
    .line 129
    invoke-static {v0, v1}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, La/raq0;->l:La/hi;

    .line 133
    .line 134
    if-eqz v0, :cond_3

    .line 135
    .line 136
    invoke-virtual {v0}, La/hi;->b()V

    .line 137
    .line 138
    .line 139
    iput-object v2, p0, La/raq0;->l:La/hi;

    .line 140
    .line 141
    :cond_3
    invoke-virtual {v5}, Landroid/view/Surface;->release()V

    .line 142
    .line 143
    .line 144
    iget-object v0, p0, La/raq0;->g:La/wu9;

    .line 145
    .line 146
    if-ne v0, v3, :cond_4

    .line 147
    .line 148
    iput-object v2, p0, La/raq0;->g:La/wu9;

    .line 149
    .line 150
    :cond_4
    iget-object v0, p0, La/raq0;->h:La/pmn0;

    .line 151
    .line 152
    if-ne v0, v4, :cond_5

    .line 153
    .line 154
    iput-object v2, p0, La/raq0;->h:La/pmn0;

    .line 155
    .line 156
    :cond_5
    return-void

    .line 157
    :pswitch_2
    check-cast p0, Landroidx/work/impl/WorkDatabase;

    .line 158
    .line 159
    check-cast v5, La/xov0;

    .line 160
    .line 161
    check-cast v3, Ljava/util/List;

    .line 162
    .line 163
    check-cast v4, La/wsd;

    .line 164
    .line 165
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iget-object v2, v5, La/xov0;->a:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    iget-object v0, v0, La/upv0;->a:La/aeg0;

    .line 178
    .line 179
    new-instance v6, La/ka6;

    .line 180
    .line 181
    const/16 v7, 0x17

    .line 182
    .line 183
    invoke-direct {v6, v2, v7}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 184
    .line 185
    .line 186
    const/4 v2, 0x1

    .line 187
    invoke-static {v0, v2, v1, v6}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Ljava/lang/Boolean;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_6

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_6
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_7

    .line 209
    .line 210
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, La/j2h0;

    .line 215
    .line 216
    iget-object v2, v5, La/xov0;->a:Ljava/lang/String;

    .line 217
    .line 218
    invoke-interface {v1, v2}, La/j2h0;->b(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    goto :goto_0

    .line 222
    :cond_7
    invoke-static {v4, p0, v3}, La/m2h0;->b(La/wsd;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 223
    .line 224
    .line 225
    :goto_1
    return-void

    .line 226
    :pswitch_3
    check-cast p0, Ljava/lang/String;

    .line 227
    .line 228
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 229
    .line 230
    check-cast v3, La/hy40;

    .line 231
    .line 232
    check-cast v4, La/tu9;

    .line 233
    .line 234
    invoke-static {}, La/afn0;->w()Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-eqz v0, :cond_9

    .line 239
    .line 240
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    const/16 v6, 0x7f

    .line 245
    .line 246
    if-gt v2, v6, :cond_8

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_8
    invoke-virtual {p0, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    :goto_2
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 254
    .line 255
    .line 256
    :cond_9
    :try_start_1
    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    sget-object p0, La/gqw0;->w1:La/k080;

    .line 260
    .line 261
    invoke-virtual {v3, p0}, La/wh00;->i(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4, p0}, La/tu9;->b(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 265
    .line 266
    .line 267
    goto :goto_3

    .line 268
    :catchall_0
    move-exception p0

    .line 269
    :try_start_2
    new-instance v1, La/j080;

    .line 270
    .line 271
    invoke-direct {v1, p0}, La/j080;-><init>(Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v3, v1}, La/wh00;->i(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v4, p0}, La/tu9;->d(Ljava/lang/Throwable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 278
    .line 279
    .line 280
    :goto_3
    if-eqz v0, :cond_a

    .line 281
    .line 282
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 283
    .line 284
    .line 285
    :cond_a
    return-void

    .line 286
    :catchall_1
    move-exception p0

    .line 287
    if-eqz v0, :cond_b

    .line 288
    .line 289
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 290
    .line 291
    .line 292
    :cond_b
    throw p0

    .line 293
    :pswitch_4
    check-cast p0, Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 294
    .line 295
    check-cast v5, Landroid/graphics/drawable/Drawable;

    .line 296
    .line 297
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 298
    .line 299
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 300
    .line 301
    invoke-static {p0, v5, v3, v4}, Lorg/xplatform/uikit/components/views/LoadableImageView;->l(Lorg/xplatform/uikit/components/views/LoadableImageView;Landroid/graphics/drawable/Drawable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :pswitch_5
    check-cast p0, Landroidx/fragment/app/Fragment;

    .line 306
    .line 307
    check-cast v5, Landroid/view/LayoutInflater;

    .line 308
    .line 309
    check-cast v3, Landroid/view/ViewGroup;

    .line 310
    .line 311
    check-cast v4, Landroid/os/Bundle;

    .line 312
    .line 313
    invoke-virtual {p0, v5, v3, v4}, Landroidx/fragment/app/Fragment;->X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 318
    .line 319
    return-void

    .line 320
    :pswitch_6
    check-cast p0, La/mbn;

    .line 321
    .line 322
    check-cast v5, La/agn;

    .line 323
    .line 324
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 325
    .line 326
    check-cast v4, La/tu9;

    .line 327
    .line 328
    :try_start_3
    iget-object p0, p0, La/mbn;->a:La/jbn;

    .line 329
    .line 330
    invoke-virtual {p0, v5}, La/jbn;->o(La/agn;)La/w35;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v4, v2}, La/tu9;->b(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    .line 334
    .line 335
    .line 336
    goto :goto_4

    .line 337
    :catch_0
    move-exception p0

    .line 338
    invoke-virtual {v4, p0}, La/tu9;->d(Ljava/lang/Throwable;)Z

    .line 339
    .line 340
    .line 341
    :goto_4
    return-void

    .line 342
    :pswitch_7
    check-cast p0, La/txj;

    .line 343
    .line 344
    check-cast v5, La/agn;

    .line 345
    .line 346
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 347
    .line 348
    check-cast v4, La/tu9;

    .line 349
    .line 350
    :try_start_4
    iget-object p0, p0, La/txj;->a:La/p8l;

    .line 351
    .line 352
    invoke-virtual {p0, v5}, La/p8l;->o(La/agn;)La/w35;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v4, v2}, La/tu9;->b(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1

    .line 356
    .line 357
    .line 358
    goto :goto_5

    .line 359
    :catch_1
    move-exception p0

    .line 360
    invoke-virtual {v4, p0}, La/tu9;->d(Ljava/lang/Throwable;)Z

    .line 361
    .line 362
    .line 363
    :goto_5
    return-void

    .line 364
    :pswitch_8
    check-cast p0, La/swj;

    .line 365
    .line 366
    check-cast v5, La/q55;

    .line 367
    .line 368
    iget-object v0, v5, La/q55;->a:Ljava/lang/String;

    .line 369
    .line 370
    check-cast v3, La/fps0;

    .line 371
    .line 372
    check-cast v4, La/q35;

    .line 373
    .line 374
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    sget-object v1, La/swj;->f:Ljava/util/logging/Logger;

    .line 378
    .line 379
    const-string v6, "Transport backend \'"

    .line 380
    .line 381
    :try_start_5
    iget-object v7, p0, La/swj;->c:La/hd40;

    .line 382
    .line 383
    invoke-virtual {v7, v0}, La/hd40;->a(Ljava/lang/String;)La/los0;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    if-nez v7, :cond_c

    .line 388
    .line 389
    new-instance p0, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    invoke-direct {p0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    const-string v0, "\' is not registered"

    .line 398
    .line 399
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    invoke-virtual {v1, p0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 410
    .line 411
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    invoke-interface {v3, v0}, La/fps0;->b(Ljava/lang/Exception;)V

    .line 415
    .line 416
    .line 417
    goto :goto_7

    .line 418
    :catch_2
    move-exception p0

    .line 419
    goto :goto_6

    .line 420
    :cond_c
    check-cast v7, La/k8b;

    .line 421
    .line 422
    invoke-virtual {v7, v4}, La/k8b;->a(La/q35;)La/q35;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    iget-object v4, p0, La/swj;->e:La/wpg0;

    .line 427
    .line 428
    new-instance v6, La/hi;

    .line 429
    .line 430
    const/4 v7, 0x4

    .line 431
    invoke-direct {v6, p0, v5, v0, v7}, La/hi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v4, v6}, La/wpg0;->l(La/wzn0;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    invoke-interface {v3, v2}, La/fps0;->b(Ljava/lang/Exception;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 438
    .line 439
    .line 440
    goto :goto_7

    .line 441
    :goto_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 442
    .line 443
    const-string v2, "Error scheduling event "

    .line 444
    .line 445
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    invoke-interface {v3, p0}, La/fps0;->b(Ljava/lang/Exception;)V

    .line 463
    .line 464
    .line 465
    :goto_7
    return-void

    .line 466
    :pswitch_9
    check-cast p0, La/o3a;

    .line 467
    .line 468
    check-cast v5, Landroid/hardware/camera2/CameraCaptureSession;

    .line 469
    .line 470
    check-cast v3, Landroid/hardware/camera2/CaptureRequest;

    .line 471
    .line 472
    check-cast v4, Landroid/hardware/camera2/CaptureFailure;

    .line 473
    .line 474
    iget-object p0, p0, La/o3a;->a:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 475
    .line 476
    invoke-virtual {p0, v5, v3, v4}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureFailed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V

    .line 477
    .line 478
    .line 479
    return-void

    .line 480
    :pswitch_a
    check-cast p0, La/o3a;

    .line 481
    .line 482
    check-cast v5, Landroid/hardware/camera2/CameraCaptureSession;

    .line 483
    .line 484
    check-cast v3, Landroid/hardware/camera2/CaptureRequest;

    .line 485
    .line 486
    check-cast v4, Landroid/hardware/camera2/TotalCaptureResult;

    .line 487
    .line 488
    iget-object p0, p0, La/o3a;->a:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    .line 489
    .line 490
    invoke-virtual {p0, v5, v3, v4}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V

    .line 491
    .line 492
    .line 493
    return-void

    .line 494
    nop

    .line 495
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
