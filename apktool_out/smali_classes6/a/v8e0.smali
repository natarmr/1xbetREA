.class public final La/v8e0;
.super La/k5;
.source "SourceFile"


# instance fields
.field public l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

.field public final m:La/ksc0;


# direct methods
.method public constructor <init>(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;La/ksc0;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const v1, 0x7f07074c

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, v0, v1}, La/k5;-><init>(La/nmo0;ZI)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/v8e0;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 9
    .line 10
    iput-object p2, p0, La/v8e0;->m:La/ksc0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final g()La/nmo0;
    .locals 0

    .line 1
    iget-object p0, p0, La/v8e0;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j(La/w5;La/y8b;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v0, La/c8e0;

    .line 6
    .line 7
    if-eqz v2, :cond_9

    .line 8
    .line 9
    instance-of v2, v1, La/u3e0;

    .line 10
    .line 11
    if-eqz v2, :cond_9

    .line 12
    .line 13
    check-cast v0, La/c8e0;

    .line 14
    .line 15
    check-cast v1, La/u3e0;

    .line 16
    .line 17
    iget-object v2, v0, La/xhe0;->a:Landroid/view/View;

    .line 18
    .line 19
    iget-object v3, v0, La/c8e0;->u:La/iab;

    .line 20
    .line 21
    iget-object v4, v3, La/iab;->f:Landroid/view/View;

    .line 22
    .line 23
    check-cast v4, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 24
    .line 25
    iget-object v5, v3, La/iab;->g:Landroid/view/View;

    .line 26
    .line 27
    check-cast v5, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 28
    .line 29
    iget-object v6, v3, La/iab;->h:Landroid/view/View;

    .line 30
    .line 31
    check-cast v6, Landroid/widget/TextView;

    .line 32
    .line 33
    iget-object v7, v3, La/iab;->e:Landroid/view/View;

    .line 34
    .line 35
    check-cast v7, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 36
    .line 37
    iget-object v8, v3, La/iab;->b:Landroid/view/View;

    .line 38
    .line 39
    check-cast v8, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 40
    .line 41
    iget-object v9, v3, La/iab;->d:Landroid/view/ViewGroup;

    .line 42
    .line 43
    check-cast v9, Landroid/widget/LinearLayout;

    .line 44
    .line 45
    iget-object v3, v3, La/iab;->c:Landroid/view/View;

    .line 46
    .line 47
    check-cast v3, Landroid/widget/TextView;

    .line 48
    .line 49
    iget-object v10, v1, La/u3e0;->d:La/s3e0;

    .line 50
    .line 51
    const/4 v11, 0x0

    .line 52
    const/16 v14, 0x8

    .line 53
    .line 54
    if-nez v10, :cond_0

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :cond_0
    instance-of v15, v10, La/r3e0;

    .line 59
    .line 60
    const/16 v13, 0xb

    .line 61
    .line 62
    const v12, 0x800013

    .line 63
    .line 64
    .line 65
    if-eqz v15, :cond_1

    .line 66
    .line 67
    check-cast v10, La/r3e0;

    .line 68
    .line 69
    iget-object v0, v10, La/r3e0;->a:La/ufp0;

    .line 70
    .line 71
    invoke-virtual {v9, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v14}, Landroid/view/View;->setVisibility(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v14}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3, v11}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    iget-object v1, v0, La/ufp0;->b:Ljava/lang/String;

    .line 84
    .line 85
    new-instance v4, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, " / "

    .line 94
    .line 95
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6, v11}, Landroid/view/View;->setVisibility(I)V

    .line 106
    .line 107
    .line 108
    iget-object v1, v10, La/r3e0;->b:La/ufp0;

    .line 109
    .line 110
    iget-object v4, v1, La/ufp0;->b:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v8, v11}, Landroid/view/View;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    sget-object v4, La/u0d;->a:Ljava/util/List;

    .line 119
    .line 120
    iget-object v0, v0, La/ufp0;->d:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v0}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-static {v8, v0, v11, v13}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5, v11}, Landroid/view/View;->setVisibility(I)V

    .line 130
    .line 131
    .line 132
    iget-object v0, v1, La/ufp0;->d:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v0}, La/vsm0;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v5, v0, v11, v13}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 139
    .line 140
    .line 141
    goto/16 :goto_2

    .line 142
    .line 143
    :cond_1
    instance-of v15, v10, La/q3e0;

    .line 144
    .line 145
    if-eqz v15, :cond_2

    .line 146
    .line 147
    check-cast v10, La/q3e0;

    .line 148
    .line 149
    iget-object v0, v10, La/q3e0;->a:La/b9a0;

    .line 150
    .line 151
    invoke-virtual {v9, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v14}, Landroid/view/View;->setVisibility(I)V

    .line 155
    .line 156
    .line 157
    iget-object v1, v0, La/b9a0;->b:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6, v11}, Landroid/view/View;->setVisibility(I)V

    .line 163
    .line 164
    .line 165
    iget-object v1, v10, La/q3e0;->b:La/b9a0;

    .line 166
    .line 167
    iget-object v9, v1, La/b9a0;->b:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8, v11}, Landroid/view/View;->setVisibility(I)V

    .line 173
    .line 174
    .line 175
    sget-object v9, La/u0d;->a:Ljava/util/List;

    .line 176
    .line 177
    iget-object v9, v0, La/b9a0;->f:Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {v8, v9, v11, v13}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5, v11}, Landroid/view/View;->setVisibility(I)V

    .line 183
    .line 184
    .line 185
    iget-object v8, v1, La/b9a0;->f:Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v5, v8, v11, v13}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 188
    .line 189
    .line 190
    iget-object v0, v0, La/b9a0;->e:La/bre;

    .line 191
    .line 192
    iget-object v0, v0, La/bre;->b:Ljava/lang/String;

    .line 193
    .line 194
    invoke-static {v7, v0}, La/c8e0;->w(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    iget-object v0, v1, La/b9a0;->e:La/bre;

    .line 198
    .line 199
    iget-object v0, v0, La/bre;->b:Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {v4, v0}, La/c8e0;->w(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    goto/16 :goto_2

    .line 205
    .line 206
    :cond_2
    instance-of v4, v10, La/m3e0;

    .line 207
    .line 208
    if-eqz v4, :cond_3

    .line 209
    .line 210
    check-cast v10, La/m3e0;

    .line 211
    .line 212
    iget-object v1, v10, La/m3e0;->a:La/b9a0;

    .line 213
    .line 214
    invoke-virtual {v9, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0}, La/c8e0;->v()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v8, v11}, Landroid/view/View;->setVisibility(I)V

    .line 221
    .line 222
    .line 223
    iget-object v0, v1, La/b9a0;->b:Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    .line 227
    .line 228
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 229
    .line 230
    iget-object v0, v1, La/b9a0;->f:Ljava/lang/String;

    .line 231
    .line 232
    invoke-static {v8, v0, v11, v13}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 233
    .line 234
    .line 235
    iget-object v0, v1, La/b9a0;->e:La/bre;

    .line 236
    .line 237
    iget-object v0, v0, La/bre;->b:Ljava/lang/String;

    .line 238
    .line 239
    invoke-static {v7, v0}, La/c8e0;->w(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_2

    .line 243
    .line 244
    :cond_3
    instance-of v4, v10, La/j3e0;

    .line 245
    .line 246
    if-eqz v4, :cond_5

    .line 247
    .line 248
    check-cast v10, La/j3e0;

    .line 249
    .line 250
    invoke-virtual {v0}, La/c8e0;->v()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v8, v14}, Landroid/view/View;->setVisibility(I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v7, v14}, Landroid/view/View;->setVisibility(I)V

    .line 257
    .line 258
    .line 259
    iget-object v0, v10, La/j3e0;->a:Ljava/lang/String;

    .line 260
    .line 261
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-eqz v1, :cond_4

    .line 266
    .line 267
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    const v1, 0x7f130890

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    :cond_4
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 282
    .line 283
    .line 284
    const/16 v0, 0x11

    .line 285
    .line 286
    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 287
    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_5
    instance-of v4, v10, La/o3e0;

    .line 291
    .line 292
    if-eqz v4, :cond_6

    .line 293
    .line 294
    check-cast v10, La/o3e0;

    .line 295
    .line 296
    iget-object v1, v10, La/o3e0;->a:La/ufp0;

    .line 297
    .line 298
    invoke-virtual {v9, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0}, La/c8e0;->v()V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v8, v11}, Landroid/view/View;->setVisibility(I)V

    .line 305
    .line 306
    .line 307
    iget-object v0, v1, La/ufp0;->b:Ljava/lang/String;

    .line 308
    .line 309
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 310
    .line 311
    .line 312
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 313
    .line 314
    iget-object v0, v1, La/ufp0;->d:Ljava/lang/String;

    .line 315
    .line 316
    invoke-static {v8, v0, v11, v13}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 317
    .line 318
    .line 319
    goto :goto_2

    .line 320
    :cond_6
    instance-of v4, v10, La/p3e0;

    .line 321
    .line 322
    if-eqz v4, :cond_7

    .line 323
    .line 324
    check-cast v10, La/p3e0;

    .line 325
    .line 326
    invoke-virtual {v9, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, La/c8e0;->v()V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v7, v14}, Landroid/view/View;->setVisibility(I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v8, v14}, Landroid/view/View;->setVisibility(I)V

    .line 336
    .line 337
    .line 338
    iget-object v0, v10, La/p3e0;->a:La/c9e0;

    .line 339
    .line 340
    iget-object v0, v0, La/c9e0;->b:Ljava/lang/String;

    .line 341
    .line 342
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 343
    .line 344
    .line 345
    goto :goto_2

    .line 346
    :cond_7
    :goto_0
    invoke-virtual {v0}, La/c8e0;->v()V

    .line 347
    .line 348
    .line 349
    const/16 v0, 0x11

    .line 350
    .line 351
    invoke-virtual {v9, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v7, v14}, Landroid/view/View;->setVisibility(I)V

    .line 355
    .line 356
    .line 357
    iget-boolean v0, v1, La/u3e0;->e:Z

    .line 358
    .line 359
    if-eqz v0, :cond_8

    .line 360
    .line 361
    const-string v0, ""

    .line 362
    .line 363
    goto :goto_1

    .line 364
    :cond_8
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    const v1, 0x7f130890

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    :goto_1
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 376
    .line 377
    .line 378
    :goto_2
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 379
    .line 380
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    const v1, 0x7f040b0b

    .line 388
    .line 389
    .line 390
    invoke-static {v0, v1, v11}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 398
    .line 399
    .line 400
    :cond_9
    return-void
.end method

.method public final k(La/w5;La/y8b;)V
    .locals 2

    .line 1
    instance-of p0, p1, La/j6d;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    instance-of p0, p2, La/v3e0;

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    check-cast p1, La/j6d;

    .line 10
    .line 11
    check-cast p2, La/v3e0;

    .line 12
    .line 13
    iget-object p0, p1, La/j6d;->u:La/wcu0;

    .line 14
    .line 15
    iget-object v0, p0, La/wcu0;->d:Landroid/widget/TextView;

    .line 16
    .line 17
    iget-object p0, p0, La/wcu0;->c:Landroid/widget/TextView;

    .line 18
    .line 19
    iget-object v1, p2, La/v3e0;->d:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p2, La/v3e0;->e:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    const/4 v0, 0x0

    .line 34
    if-lez p2, :cond_0

    .line 35
    .line 36
    move p2, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/16 p2, 0x8

    .line 39
    .line 40
    :goto_0
    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    sget-object p0, La/j5d;->a:Landroid/util/TypedValue;

    .line 44
    .line 45
    iget-object p0, p1, La/xhe0;->a:Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const p2, 0x7f040ae1

    .line 55
    .line 56
    .line 57
    invoke-static {p0, p2, v0}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    invoke-virtual {p1, p0}, La/w5;->u(I)V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void
.end method

.method public final l(La/w5;La/y8b;)V
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v0, La/aig0;

    .line 6
    .line 7
    if-eqz v2, :cond_15

    .line 8
    .line 9
    instance-of v2, v1, La/l6e0;

    .line 10
    .line 11
    if-eqz v2, :cond_15

    .line 12
    .line 13
    check-cast v0, La/aig0;

    .line 14
    .line 15
    check-cast v1, La/l6e0;

    .line 16
    .line 17
    iget-object v2, v0, La/xhe0;->a:Landroid/view/View;

    .line 18
    .line 19
    iget-object v3, v0, La/aig0;->u:La/zkk;

    .line 20
    .line 21
    iget-object v4, v3, La/zkk;->d:Landroid/widget/TextView;

    .line 22
    .line 23
    iget-object v5, v3, La/zkk;->f:Landroid/view/ViewGroup;

    .line 24
    .line 25
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 26
    .line 27
    iget-object v6, v3, La/zkk;->g:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Landroid/widget/FrameLayout;

    .line 30
    .line 31
    iget-object v7, v3, La/zkk;->e:Landroid/view/View;

    .line 32
    .line 33
    check-cast v7, Landroid/widget/TextView;

    .line 34
    .line 35
    iget-object v8, v3, La/zkk;->i:Landroid/view/View;

    .line 36
    .line 37
    check-cast v8, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 38
    .line 39
    iget-object v9, v1, La/l6e0;->g:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v10, v1, La/l6e0;->j:La/b9a0;

    .line 42
    .line 43
    iget-object v11, v1, La/l6e0;->h:La/e6e0;

    .line 44
    .line 45
    iget-object v12, v1, La/l6e0;->l:La/hee;

    .line 46
    .line 47
    invoke-static {v9}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v13

    .line 51
    const/4 v14, 0x0

    .line 52
    const/16 v15, 0x8

    .line 53
    .line 54
    if-eqz v13, :cond_1

    .line 55
    .line 56
    sget-object v13, La/hee;->a:La/hee;

    .line 57
    .line 58
    if-ne v12, v13, :cond_1

    .line 59
    .line 60
    sget-object v13, La/e6e0;->c:La/e6e0;

    .line 61
    .line 62
    if-eq v11, v13, :cond_0

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {v6, v15}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :cond_1
    :goto_0
    iget-object v13, v3, La/zkk;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v13, Landroid/widget/ImageView;

    .line 73
    .line 74
    invoke-virtual {v6, v14}, Landroid/view/View;->setVisibility(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-lez v6, :cond_2

    .line 82
    .line 83
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v14}, Landroid/view/View;->setVisibility(I)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    invoke-virtual {v4, v15}, Landroid/view/View;->setVisibility(I)V

    .line 91
    .line 92
    .line 93
    :goto_1
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_4

    .line 98
    .line 99
    const/4 v9, 0x1

    .line 100
    if-eq v6, v9, :cond_3

    .line 101
    .line 102
    move v6, v14

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    const v6, 0x7f080634

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    const v6, 0x7f080644

    .line 109
    .line 110
    .line 111
    :goto_2
    if-eqz v6, :cond_6

    .line 112
    .line 113
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    invoke-virtual {v9, v6}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    const v11, 0x7f0706f8

    .line 126
    .line 127
    .line 128
    invoke-virtual {v9, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-eqz v6, :cond_5

    .line 133
    .line 134
    invoke-virtual {v6, v14, v14, v9, v9}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 135
    .line 136
    .line 137
    :cond_5
    const/4 v9, 0x0

    .line 138
    invoke-virtual {v4, v9, v9, v6, v9}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    const/4 v9, 0x0

    .line 143
    invoke-virtual {v4, v9, v9, v9, v9}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 144
    .line 145
    .line 146
    :goto_3
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-eqz v6, :cond_b

    .line 151
    .line 152
    const/4 v9, 0x1

    .line 153
    if-eq v6, v9, :cond_a

    .line 154
    .line 155
    const/4 v9, 0x2

    .line 156
    if-eq v6, v9, :cond_9

    .line 157
    .line 158
    const/4 v9, 0x3

    .line 159
    if-eq v6, v9, :cond_8

    .line 160
    .line 161
    const/4 v9, 0x4

    .line 162
    if-ne v6, v9, :cond_7

    .line 163
    .line 164
    invoke-virtual {v13, v14}, Landroid/view/View;->setVisibility(I)V

    .line 165
    .line 166
    .line 167
    const v6, 0x7f080c95

    .line 168
    .line 169
    .line 170
    invoke-virtual {v13, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 171
    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_8
    invoke-virtual {v13, v14}, Landroid/view/View;->setVisibility(I)V

    .line 179
    .line 180
    .line 181
    const v6, 0x7f080c96

    .line 182
    .line 183
    .line 184
    invoke-virtual {v13, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_9
    invoke-virtual {v13, v14}, Landroid/view/View;->setVisibility(I)V

    .line 189
    .line 190
    .line 191
    const v6, 0x7f080c94

    .line 192
    .line 193
    .line 194
    invoke-virtual {v13, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 195
    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_a
    invoke-virtual {v13, v14}, Landroid/view/View;->setVisibility(I)V

    .line 199
    .line 200
    .line 201
    const v6, 0x7f080c97

    .line 202
    .line 203
    .line 204
    invoke-virtual {v13, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :cond_b
    invoke-virtual {v13, v15}, Landroid/view/View;->setVisibility(I)V

    .line 209
    .line 210
    .line 211
    const/4 v9, 0x0

    .line 212
    invoke-virtual {v13, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 213
    .line 214
    .line 215
    :goto_4
    iget-object v6, v1, La/l6e0;->i:La/ufp0;

    .line 216
    .line 217
    iget-object v9, v1, La/l6e0;->f:Ljava/lang/String;

    .line 218
    .line 219
    new-instance v16, La/ufp0;

    .line 220
    .line 221
    const-string v20, ""

    .line 222
    .line 223
    sget-object v21, La/iun;->a:La/iun;

    .line 224
    .line 225
    const/16 v17, 0x0

    .line 226
    .line 227
    const-string v18, ""

    .line 228
    .line 229
    const-string v19, ""

    .line 230
    .line 231
    invoke-direct/range {v16 .. v21}, La/ufp0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 232
    .line 233
    .line 234
    move-object/from16 v11, v16

    .line 235
    .line 236
    invoke-virtual {v6, v11}, La/ufp0;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    const/16 v12, 0x11

    .line 241
    .line 242
    const/16 v13, 0xb

    .line 243
    .line 244
    if-nez v11, :cond_c

    .line 245
    .line 246
    invoke-virtual {v8, v14}, Landroid/view/View;->setVisibility(I)V

    .line 247
    .line 248
    .line 249
    iget-object v9, v6, La/ufp0;->b:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 252
    .line 253
    .line 254
    sget-object v9, La/u0d;->a:Ljava/util/List;

    .line 255
    .line 256
    iget-object v6, v6, La/ufp0;->d:Ljava/lang/String;

    .line 257
    .line 258
    invoke-static {v8, v6, v14, v13}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 259
    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_c
    sget-object v6, La/b9a0;->g:La/b9a0;

    .line 263
    .line 264
    invoke-static {v10, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    if-nez v6, :cond_d

    .line 269
    .line 270
    invoke-virtual {v8, v14}, Landroid/view/View;->setVisibility(I)V

    .line 271
    .line 272
    .line 273
    iget-object v6, v10, La/b9a0;->b:Ljava/lang/String;

    .line 274
    .line 275
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 276
    .line 277
    .line 278
    sget-object v6, La/u0d;->a:Ljava/util/List;

    .line 279
    .line 280
    iget-object v6, v10, La/b9a0;->f:Ljava/lang/String;

    .line 281
    .line 282
    invoke-static {v8, v6, v14, v13}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 283
    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_d
    invoke-static {v9}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    if-nez v6, :cond_f

    .line 291
    .line 292
    iget-object v6, v1, La/l6e0;->p:La/hnh0;

    .line 293
    .line 294
    sget-object v11, La/hnh0;->b:La/hnh0;

    .line 295
    .line 296
    if-ne v6, v11, :cond_e

    .line 297
    .line 298
    const v6, 0x800003

    .line 299
    .line 300
    .line 301
    goto :goto_5

    .line 302
    :cond_e
    move v6, v12

    .line 303
    :goto_5
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v8, v15}, Landroid/view/View;->setVisibility(I)V

    .line 310
    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_f
    const-string v6, ""

    .line 314
    .line 315
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v8, v15}, Landroid/view/View;->setVisibility(I)V

    .line 319
    .line 320
    .line 321
    :goto_6
    iget-object v6, v3, La/zkk;->b:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v6, Landroid/widget/ImageView;

    .line 324
    .line 325
    iget-object v3, v3, La/zkk;->h:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v3, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 328
    .line 329
    const/4 v9, 0x1

    .line 330
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setSelected(Z)V

    .line 331
    .line 332
    .line 333
    iget-object v8, v10, La/b9a0;->e:La/bre;

    .line 334
    .line 335
    iget-object v8, v8, La/bre;->b:Ljava/lang/String;

    .line 336
    .line 337
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 338
    .line 339
    .line 340
    move-result v9

    .line 341
    if-lez v9, :cond_10

    .line 342
    .line 343
    invoke-virtual {v3, v14}, Landroid/view/View;->setVisibility(I)V

    .line 344
    .line 345
    .line 346
    sget-object v9, La/u0d;->a:Ljava/util/List;

    .line 347
    .line 348
    const-string v9, "sfiles"

    .line 349
    .line 350
    const-string v10, "logo_teams"

    .line 351
    .line 352
    invoke-static {v9, v10, v8}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 353
    .line 354
    .line 355
    move-result-object v8

    .line 356
    iget-object v8, v8, La/bzu;->b:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v8, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v17

    .line 364
    sget-object v8, La/g2x;->a:La/g2x;

    .line 365
    .line 366
    invoke-static {v8}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 367
    .line 368
    .line 369
    move-result-object v20

    .line 370
    const/16 v22, 0x0

    .line 371
    .line 372
    const/16 v23, 0x1ee

    .line 373
    .line 374
    const/16 v18, 0x0

    .line 375
    .line 376
    const/16 v19, 0x0

    .line 377
    .line 378
    const/16 v21, 0x0

    .line 379
    .line 380
    move-object/from16 v16, v3

    .line 381
    .line 382
    invoke-static/range {v16 .. v23}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 383
    .line 384
    .line 385
    goto :goto_7

    .line 386
    :cond_10
    invoke-virtual {v3, v15}, Landroid/view/View;->setVisibility(I)V

    .line 387
    .line 388
    .line 389
    :goto_7
    iget-object v3, v1, La/l6e0;->m:Lkotlin/ranges/IntRange;

    .line 390
    .line 391
    const v8, 0x7f040b0b

    .line 392
    .line 393
    .line 394
    if-eqz v3, :cond_12

    .line 395
    .line 396
    invoke-virtual {v6, v14}, Landroid/view/View;->setVisibility(I)V

    .line 397
    .line 398
    .line 399
    iget-boolean v3, v1, La/l6e0;->n:Z

    .line 400
    .line 401
    if-eqz v3, :cond_11

    .line 402
    .line 403
    const v3, 0x7f080643

    .line 404
    .line 405
    .line 406
    invoke-virtual {v6, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 407
    .line 408
    .line 409
    sget-object v3, La/j5d;->a:Landroid/util/TypedValue;

    .line 410
    .line 411
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    const v6, 0x7f040b72

    .line 419
    .line 420
    .line 421
    invoke-static {v3, v6, v14}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    invoke-static {v3, v6, v14}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 440
    .line 441
    .line 442
    goto :goto_8

    .line 443
    :cond_11
    const v3, 0x7f08062f

    .line 444
    .line 445
    .line 446
    invoke-virtual {v6, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 447
    .line 448
    .line 449
    sget-object v3, La/j5d;->a:Landroid/util/TypedValue;

    .line 450
    .line 451
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    invoke-static {v3, v8, v14}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 459
    .line 460
    .line 461
    move-result v3

    .line 462
    invoke-virtual {v7, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    invoke-static {v3, v8, v14}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 477
    .line 478
    .line 479
    :goto_8
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    new-instance v3, La/dff0;

    .line 483
    .line 484
    invoke-direct {v3, v0, v1, v12}, La/dff0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 485
    .line 486
    .line 487
    invoke-static {v5, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 488
    .line 489
    .line 490
    goto :goto_9

    .line 491
    :cond_12
    invoke-virtual {v6, v15}, Landroid/view/View;->setVisibility(I)V

    .line 492
    .line 493
    .line 494
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 495
    .line 496
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    invoke-static {v0, v8, v14}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 504
    .line 505
    .line 506
    move-result v0

    .line 507
    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    invoke-static {v0, v8, v14}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 522
    .line 523
    .line 524
    const/4 v9, 0x0

    .line 525
    invoke-virtual {v5, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 526
    .line 527
    .line 528
    :goto_9
    iget-boolean v0, v1, La/l6e0;->o:Z

    .line 529
    .line 530
    if-eqz v0, :cond_13

    .line 531
    .line 532
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    const v1, 0x7f070712

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 540
    .line 541
    .line 542
    move-result v0

    .line 543
    invoke-virtual {v5}, Landroid/view/View;->getPaddingTop()I

    .line 544
    .line 545
    .line 546
    move-result v1

    .line 547
    invoke-virtual {v5}, Landroid/view/View;->getPaddingRight()I

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    invoke-virtual {v5, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 556
    .line 557
    .line 558
    goto :goto_a

    .line 559
    :cond_13
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    const v1, 0x7f07072d

    .line 564
    .line 565
    .line 566
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 567
    .line 568
    .line 569
    move-result v0

    .line 570
    invoke-virtual {v5}, Landroid/view/View;->getPaddingTop()I

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    invoke-virtual {v5}, Landroid/view/View;->getPaddingRight()I

    .line 575
    .line 576
    .line 577
    move-result v2

    .line 578
    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    invoke-virtual {v5, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 583
    .line 584
    .line 585
    :goto_a
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    if-eqz v0, :cond_14

    .line 593
    .line 594
    const/4 v1, -0x1

    .line 595
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 596
    .line 597
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 598
    .line 599
    .line 600
    return-void

    .line 601
    :cond_14
    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 602
    .line 603
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 604
    .line 605
    .line 606
    :cond_15
    return-void
.end method

.method public final m(Landroid/view/ViewGroup;I)La/w5;
    .locals 10

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance p2, La/c8e0;

    .line 10
    .line 11
    const v0, 0x7f0d065e

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const p1, 0x7f0a0bde

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    move-object v3, v0

    .line 27
    check-cast v3, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    const p1, 0x7f0a0bdf

    .line 32
    .line 33
    .line 34
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    move-object v4, v0

    .line 39
    check-cast v4, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 40
    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    const p1, 0x7f0a0be0

    .line 44
    .line 45
    .line 46
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    move-object v5, v0

    .line 51
    check-cast v5, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 52
    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    const p1, 0x7f0a0be1

    .line 56
    .line 57
    .line 58
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    move-object v6, v0

    .line 63
    check-cast v6, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 64
    .line 65
    if-eqz v6, :cond_0

    .line 66
    .line 67
    const p1, 0x7f0a10d6

    .line 68
    .line 69
    .line 70
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move-object v7, v0

    .line 75
    check-cast v7, Landroid/widget/TextView;

    .line 76
    .line 77
    if-eqz v7, :cond_0

    .line 78
    .line 79
    const p1, 0x7f0a11f1

    .line 80
    .line 81
    .line 82
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    move-object v8, v0

    .line 87
    check-cast v8, Landroid/widget/TextView;

    .line 88
    .line 89
    if-eqz v8, :cond_0

    .line 90
    .line 91
    new-instance v1, La/iab;

    .line 92
    .line 93
    move-object v2, p0

    .line 94
    check-cast v2, Landroid/widget/LinearLayout;

    .line 95
    .line 96
    const/4 v9, 0x5

    .line 97
    invoke-direct/range {v1 .. v9}, La/iab;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 98
    .line 99
    .line 100
    invoke-direct {p2, v1}, La/c8e0;-><init>(La/iab;)V

    .line 101
    .line 102
    .line 103
    return-object p2

    .line 104
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    const-string p1, "Missing required view with ID: "

    .line 113
    .line 114
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    const/4 p0, 0x0

    .line 122
    return-object p0
.end method

.method public final n(Landroid/view/ViewGroup;I)La/w5;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance p2, La/j6d;

    .line 10
    .line 11
    const v0, 0x7f0d065d

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const p1, 0x7f0a1232

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/widget/TextView;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const p1, 0x7f0a1260

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Landroid/widget/TextView;

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    new-instance p1, La/wcu0;

    .line 42
    .line 43
    check-cast p0, Landroid/widget/LinearLayout;

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    invoke-direct {p1, p0, v0, v1, v2}, La/wcu0;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;B)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p2, p1}, La/j6d;-><init>(La/wcu0;)V

    .line 50
    .line 51
    .line 52
    return-object p2

    .line 53
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string p1, "Missing required view with ID: "

    .line 62
    .line 63
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    return-object p0
.end method

.method public final o(Landroid/view/ViewGroup;La/y8b;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, La/shq;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v0}, La/shq;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 17
    .line 18
    const v1, 0x7f0706ba

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v1}, La/vqd;->d(Landroid/view/ViewGroup;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/4 v1, -0x2

    .line 26
    invoke-direct {v0, v1, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 30
    .line 31
    .line 32
    instance-of p1, p2, La/rhq;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    check-cast p2, La/rhq;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 p2, 0x0

    .line 40
    :goto_0
    if-eqz p2, :cond_1

    .line 41
    .line 42
    iget-object p1, p2, La/w8b;->a:La/h9b;

    .line 43
    .line 44
    iget-object p1, p1, La/h9b;->a:Ljava/lang/String;

    .line 45
    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    :cond_1
    const-string p1, "-"

    .line 49
    .line 50
    :cond_2
    invoke-virtual {p0, p1}, La/shq;->setTitle(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    iget-boolean p1, p2, La/rhq;->e:Z

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    if-ne p1, v0, :cond_3

    .line 59
    .line 60
    iget p1, p2, La/rhq;->f:I

    .line 61
    .line 62
    if-le p1, v0, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    const/4 v0, 0x0

    .line 66
    :goto_1
    invoke-virtual {p0, v0}, La/shq;->setNumberVisibility(Z)V

    .line 67
    .line 68
    .line 69
    return-object p0
.end method

.method public final p(Landroid/view/ViewGroup;I)La/w5;
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    new-instance v0, La/aig0;

    .line 10
    .line 11
    const v1, 0x7f0d065f

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {p2, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const p2, 0x7f0a04c0

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroidx/constraintlayout/widget/Barrier;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const p2, 0x7f0a05e7

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v4, v1

    .line 38
    check-cast v4, Landroid/widget/FrameLayout;

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    const p2, 0x7f0a06b9

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Landroidx/constraintlayout/widget/Barrier;

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    const p2, 0x7f0a081a

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v5, v1

    .line 61
    check-cast v5, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 62
    .line 63
    if-eqz v5, :cond_0

    .line 64
    .line 65
    const p2, 0x7f0a0837

    .line 66
    .line 67
    .line 68
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    move-object v6, v1

    .line 73
    check-cast v6, Landroid/widget/ImageView;

    .line 74
    .line 75
    if-eqz v6, :cond_0

    .line 76
    .line 77
    const p2, 0x7f0a0891

    .line 78
    .line 79
    .line 80
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    move-object v7, v1

    .line 85
    check-cast v7, Landroid/widget/ImageView;

    .line 86
    .line 87
    if-eqz v7, :cond_0

    .line 88
    .line 89
    const p2, 0x7f0a08c7

    .line 90
    .line 91
    .line 92
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    move-object v8, v1

    .line 97
    check-cast v8, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 98
    .line 99
    if-eqz v8, :cond_0

    .line 100
    .line 101
    const p2, 0x7f0a11c6

    .line 102
    .line 103
    .line 104
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    move-object v9, v1

    .line 109
    check-cast v9, Landroid/widget/TextView;

    .line 110
    .line 111
    if-eqz v9, :cond_0

    .line 112
    .line 113
    const p2, 0x7f0a1260

    .line 114
    .line 115
    .line 116
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    move-object v10, v1

    .line 121
    check-cast v10, Landroid/widget/TextView;

    .line 122
    .line 123
    if-eqz v10, :cond_0

    .line 124
    .line 125
    new-instance v2, La/zkk;

    .line 126
    .line 127
    move-object v3, p1

    .line 128
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 129
    .line 130
    invoke-direct/range {v2 .. v10}, La/zkk;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 131
    .line 132
    .line 133
    iget-object p0, p0, La/v8e0;->m:La/ksc0;

    .line 134
    .line 135
    invoke-direct {v0, v2, p0}, La/aig0;-><init>(La/zkk;La/ksc0;)V

    .line 136
    .line 137
    .line 138
    return-object v0

    .line 139
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    const-string p1, "Missing required view with ID: "

    .line 148
    .line 149
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const/4 p0, 0x0

    .line 157
    return-object p0
.end method

.method public final r(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/v8e0;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 2
    .line 3
    return-void
.end method
