.class public final La/wh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wh;->a:B

    iput-object p1, p0, La/wh;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    iget-byte v0, p0, La/wh;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object p0, p0, La/wh;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Landroidx/media3/ui/TrackSelectionView;

    .line 12
    .line 13
    sget v0, Landroidx/media3/ui/TrackSelectionView;->m:I

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/media3/ui/TrackSelectionView;->g:Ljava/util/HashMap;

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/media3/ui/TrackSelectionView;->c:Landroid/widget/CheckedTextView;

    .line 18
    .line 19
    if-ne p1, v1, :cond_0

    .line 20
    .line 21
    iput-boolean v3, p0, Landroidx/media3/ui/TrackSelectionView;->l:Z

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :cond_0
    iget-object v1, p0, Landroidx/media3/ui/TrackSelectionView;->d:Landroid/widget/CheckedTextView;

    .line 29
    .line 30
    if-ne p1, v1, :cond_1

    .line 31
    .line 32
    iput-boolean v2, p0, Landroidx/media3/ui/TrackSelectionView;->l:Z

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_1
    iput-boolean v2, p0, Landroidx/media3/ui/TrackSelectionView;->l:Z

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    check-cast v1, La/tcs0;

    .line 49
    .line 50
    iget-object v4, v1, La/tcs0;->a:La/qds0;

    .line 51
    .line 52
    iget-object v5, v4, La/qds0;->b:La/ccs0;

    .line 53
    .line 54
    iget v1, v1, La/tcs0;->b:I

    .line 55
    .line 56
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, La/pcs0;

    .line 61
    .line 62
    if-nez v6, :cond_3

    .line 63
    .line 64
    iget-boolean p1, p0, Landroidx/media3/ui/TrackSelectionView;->i:Z

    .line 65
    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-nez p1, :cond_2

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 75
    .line 76
    .line 77
    :cond_2
    new-instance p1, La/pcs0;

    .line 78
    .line 79
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {v1}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-direct {p1, v5, v1}, La/pcs0;-><init>(La/ccs0;Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :cond_3
    new-instance v7, Ljava/util/ArrayList;

    .line 96
    .line 97
    iget-object v6, v6, La/pcs0;->b:La/b4x;

    .line 98
    .line 99
    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 100
    .line 101
    .line 102
    check-cast p1, Landroid/widget/CheckedTextView;

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/widget/CheckedTextView;->isChecked()Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    iget-boolean v6, p0, Landroidx/media3/ui/TrackSelectionView;->h:Z

    .line 109
    .line 110
    if-eqz v6, :cond_4

    .line 111
    .line 112
    iget-boolean v4, v4, La/qds0;->c:Z

    .line 113
    .line 114
    if-eqz v4, :cond_4

    .line 115
    .line 116
    move v4, v3

    .line 117
    goto :goto_0

    .line 118
    :cond_4
    move v4, v2

    .line 119
    :goto_0
    if-nez v4, :cond_5

    .line 120
    .line 121
    iget-boolean v6, p0, Landroidx/media3/ui/TrackSelectionView;->i:Z

    .line 122
    .line 123
    if-eqz v6, :cond_6

    .line 124
    .line 125
    iget-object v6, p0, Landroidx/media3/ui/TrackSelectionView;->f:Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-le v6, v3, :cond_6

    .line 132
    .line 133
    :cond_5
    move v2, v3

    .line 134
    :cond_6
    if-eqz p1, :cond_8

    .line 135
    .line 136
    if-eqz v2, :cond_8

    .line 137
    .line 138
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_7

    .line 150
    .line 151
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_7
    new-instance p1, La/pcs0;

    .line 156
    .line 157
    invoke-direct {p1, v5, v7}, La/pcs0;-><init>(La/ccs0;Ljava/util/List;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_8
    if-nez p1, :cond_a

    .line 165
    .line 166
    if-eqz v4, :cond_9

    .line 167
    .line 168
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    new-instance p1, La/pcs0;

    .line 176
    .line 177
    invoke-direct {p1, v5, v7}, La/pcs0;-><init>(La/ccs0;Ljava/util/List;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_9
    new-instance p1, La/pcs0;

    .line 185
    .line 186
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-static {v1}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    invoke-direct {p1, v5, v1}, La/pcs0;-><init>(La/ccs0;Ljava/util/List;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v5, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    :cond_a
    :goto_1
    invoke-virtual {p0}, Landroidx/media3/ui/TrackSelectionView;->a()V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :pswitch_0
    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    .line 205
    .line 206
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->p1:La/fwq0;

    .line 207
    .line 208
    if-nez p0, :cond_b

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_b
    iget-object v1, p0, La/fwq0;->b:La/hz30;

    .line 212
    .line 213
    :goto_2
    if-eqz v1, :cond_c

    .line 214
    .line 215
    invoke-virtual {v1}, La/hz30;->collapseActionView()Z

    .line 216
    .line 217
    .line 218
    :cond_c
    return-void

    .line 219
    :pswitch_1
    check-cast p0, Landroidx/appcompat/widget/d;

    .line 220
    .line 221
    iget-object v0, p0, Landroidx/appcompat/widget/d;->p:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 222
    .line 223
    iget-object v4, p0, Landroidx/appcompat/widget/d;->t:Landroid/widget/ImageView;

    .line 224
    .line 225
    if-ne p1, v4, :cond_d

    .line 226
    .line 227
    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/d;->w(Z)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    .line 234
    .line 235
    .line 236
    iget-object p1, p0, Landroidx/appcompat/widget/d;->p1:Landroid/view/View$OnClickListener;

    .line 237
    .line 238
    if-eqz p1, :cond_14

    .line 239
    .line 240
    invoke-interface {p1, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 241
    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_d
    iget-object v2, p0, Landroidx/appcompat/widget/d;->v:Landroid/widget/ImageView;

    .line 245
    .line 246
    if-ne p1, v2, :cond_e

    .line 247
    .line 248
    invoke-virtual {p0}, Landroidx/appcompat/widget/d;->m()V

    .line 249
    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_e
    iget-object v2, p0, Landroidx/appcompat/widget/d;->u:Landroid/widget/ImageView;

    .line 253
    .line 254
    if-ne p1, v2, :cond_f

    .line 255
    .line 256
    invoke-virtual {p0}, Landroidx/appcompat/widget/d;->q()V

    .line 257
    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_f
    iget-object v2, p0, Landroidx/appcompat/widget/d;->w:Landroid/widget/ImageView;

    .line 261
    .line 262
    if-ne p1, v2, :cond_13

    .line 263
    .line 264
    iget-object p1, p0, Landroidx/appcompat/widget/d;->D1:Landroid/app/SearchableInfo;

    .line 265
    .line 266
    if-nez p1, :cond_10

    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_10
    :try_start_0
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_12

    .line 274
    .line 275
    iget-object v0, p0, Landroidx/appcompat/widget/d;->k1:Landroid/content/Intent;

    .line 276
    .line 277
    new-instance v2, Landroid/content/Intent;

    .line 278
    .line 279
    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    const-string v0, "calling_package"

    .line 287
    .line 288
    if-nez p1, :cond_11

    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_11
    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    :goto_3
    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-virtual {p0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_12
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_14

    .line 311
    .line 312
    iget-object v0, p0, Landroidx/appcompat/widget/d;->l1:Landroid/content/Intent;

    .line 313
    .line 314
    invoke-virtual {p0, v0, p1}, Landroidx/appcompat/widget/d;->k(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 323
    .line 324
    .line 325
    goto :goto_4

    .line 326
    :catch_0
    const-string p0, "SearchView"

    .line 327
    .line 328
    const-string p1, "Could not find voice search activity"

    .line 329
    .line 330
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 331
    .line 332
    .line 333
    goto :goto_4

    .line 334
    :cond_13
    if-ne p1, v0, :cond_14

    .line 335
    .line 336
    invoke-virtual {p0}, Landroidx/appcompat/widget/d;->l()V

    .line 337
    .line 338
    .line 339
    :cond_14
    :goto_4
    return-void

    .line 340
    :pswitch_2
    check-cast p0, Lcom/google/android/material/datepicker/e;

    .line 341
    .line 342
    iget p1, p0, Lcom/google/android/material/datepicker/e;->L1:I

    .line 343
    .line 344
    const/4 v0, 0x2

    .line 345
    if-ne p1, v0, :cond_15

    .line 346
    .line 347
    invoke-virtual {p0, v3}, Lcom/google/android/material/datepicker/e;->A0(I)V

    .line 348
    .line 349
    .line 350
    goto :goto_5

    .line 351
    :cond_15
    if-ne p1, v3, :cond_16

    .line 352
    .line 353
    invoke-virtual {p0, v0}, Lcom/google/android/material/datepicker/e;->A0(I)V

    .line 354
    .line 355
    .line 356
    :cond_16
    :goto_5
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 357
    .line 358
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/e;->B0(Landroid/view/View;)V

    .line 359
    .line 360
    .line 361
    return-void

    .line 362
    :pswitch_3
    check-cast p0, La/wo8;

    .line 363
    .line 364
    iget-boolean p1, p0, La/wo8;->k:Z

    .line 365
    .line 366
    if-eqz p1, :cond_18

    .line 367
    .line 368
    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    .line 369
    .line 370
    .line 371
    move-result p1

    .line 372
    if-eqz p1, :cond_18

    .line 373
    .line 374
    iget-boolean p1, p0, La/wo8;->m:Z

    .line 375
    .line 376
    if-nez p1, :cond_17

    .line 377
    .line 378
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    const v0, 0x101035b

    .line 383
    .line 384
    .line 385
    filled-new-array {v0}, [I

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-virtual {p1, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    iput-boolean v0, p0, La/wo8;->l:Z

    .line 398
    .line 399
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 400
    .line 401
    .line 402
    iput-boolean v3, p0, La/wo8;->m:Z

    .line 403
    .line 404
    :cond_17
    iget-boolean p1, p0, La/wo8;->l:Z

    .line 405
    .line 406
    if-eqz p1, :cond_18

    .line 407
    .line 408
    invoke-virtual {p0}, La/wo8;->cancel()V

    .line 409
    .line 410
    .line 411
    :cond_18
    return-void

    .line 412
    :pswitch_4
    check-cast p0, La/i12;

    .line 413
    .line 414
    iget-object v0, p0, La/i12;->h:Landroid/widget/Button;

    .line 415
    .line 416
    if-ne p1, v0, :cond_19

    .line 417
    .line 418
    iget-object v0, p0, La/i12;->j:Landroid/os/Message;

    .line 419
    .line 420
    if-eqz v0, :cond_19

    .line 421
    .line 422
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    goto :goto_6

    .line 427
    :cond_19
    iget-object v0, p0, La/i12;->k:Landroid/widget/Button;

    .line 428
    .line 429
    if-ne p1, v0, :cond_1a

    .line 430
    .line 431
    iget-object v0, p0, La/i12;->m:Landroid/os/Message;

    .line 432
    .line 433
    if-eqz v0, :cond_1a

    .line 434
    .line 435
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    goto :goto_6

    .line 440
    :cond_1a
    iget-object v0, p0, La/i12;->n:Landroid/widget/Button;

    .line 441
    .line 442
    if-ne p1, v0, :cond_1b

    .line 443
    .line 444
    iget-object p1, p0, La/i12;->p:Landroid/os/Message;

    .line 445
    .line 446
    if-eqz p1, :cond_1b

    .line 447
    .line 448
    invoke-static {p1}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    :cond_1b
    :goto_6
    if-eqz v1, :cond_1c

    .line 453
    .line 454
    invoke-virtual {v1}, Landroid/os/Message;->sendToTarget()V

    .line 455
    .line 456
    .line 457
    :cond_1c
    iget-object p1, p0, La/i12;->D:La/g12;

    .line 458
    .line 459
    iget-object p0, p0, La/i12;->b:La/k12;

    .line 460
    .line 461
    invoke-virtual {p1, v3, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :pswitch_5
    check-cast p0, La/xj;

    .line 470
    .line 471
    invoke-virtual {p0}, La/xj;->c()V

    .line 472
    .line 473
    .line 474
    return-void

    .line 475
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
