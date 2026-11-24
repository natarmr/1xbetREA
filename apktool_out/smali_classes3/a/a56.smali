.class public abstract La/a56;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RemoteViewsService$RemoteViewsFactory;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/content/Intent;

.field public final c:I

.field public d:Ljava/util/List;

.field public e:La/sje;

.field public final f:La/n0o0;

.field public g:La/wdv0;

.field public final h:La/md3;

.field public final i:La/kj5;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/a56;->a:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, La/a56;->b:Landroid/content/Intent;

    .line 13
    .line 14
    const-string p1, "appWidgetId"

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iput p1, p0, La/a56;->c:I

    .line 22
    .line 23
    sget-object p1, La/iun;->a:La/iun;

    .line 24
    .line 25
    iput-object p1, p0, La/a56;->d:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object p2, La/tvk;->a:La/rwj;

    .line 32
    .line 33
    sget-object p2, La/ys10;->a:La/vs10;

    .line 34
    .line 35
    invoke-static {p1, p2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, La/a56;->e:La/sje;

    .line 44
    .line 45
    new-instance p1, La/zo4;

    .line 46
    .line 47
    const/16 p2, 0x10

    .line 48
    .line 49
    invoke-direct {p1, p0, p2}, La/zo4;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, La/a56;->f:La/n0o0;

    .line 57
    .line 58
    sget-object p1, La/wdv0;->a:La/wdv0;

    .line 59
    .line 60
    iput-object p1, p0, La/a56;->g:La/wdv0;

    .line 61
    .line 62
    new-instance p1, La/md3;

    .line 63
    .line 64
    const/4 p2, 0x2

    .line 65
    invoke-direct {p1, p0, p2}, La/md3;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, La/a56;->h:La/md3;

    .line 69
    .line 70
    new-instance p1, La/kj5;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, La/a56;->i:La/kj5;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final a(La/xdv0;)Landroid/widget/RemoteViews;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, La/xdv0;->i:La/unp0;

    .line 6
    .line 7
    iget-boolean v3, v1, La/xdv0;->e:Z

    .line 8
    .line 9
    iget-wide v4, v1, La/xdv0;->a:J

    .line 10
    .line 11
    iget-object v6, v2, La/unp0;->c:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v7, v1, La/xdv0;->j:La/unp0;

    .line 18
    .line 19
    iget-object v8, v7, La/unp0;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    iget-object v15, v0, La/a56;->a:Landroid/content/Context;

    .line 26
    .line 27
    if-nez v9, :cond_0

    .line 28
    .line 29
    new-instance v6, Landroid/widget/RemoteViews;

    .line 30
    .line 31
    invoke-virtual {v15}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    const v10, 0x7f0d06e7

    .line 36
    .line 37
    .line 38
    invoke-direct {v6, v9, v10}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    :goto_0
    move-object v10, v6

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    const/4 v9, 0x2

    .line 44
    if-ne v6, v9, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, La/a56;->c()Landroid/widget/RemoteViews;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    if-le v6, v9, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, La/a56;->d()Landroid/widget/RemoteViews;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {v0}, La/a56;->b()Landroid/widget/RemoteViews;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    goto :goto_0

    .line 63
    :goto_1
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance v6, Landroid/content/Intent;

    .line 67
    .line 68
    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 69
    .line 70
    .line 71
    const-string v9, "selected_game_id"

    .line 72
    .line 73
    invoke-virtual {v6, v9, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    const-string v9, "selected_sub_game_id"

    .line 78
    .line 79
    iget-object v11, v1, La/xdv0;->d:Ljava/lang/Long;

    .line 80
    .line 81
    invoke-virtual {v6, v9, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    iget-wide v11, v1, La/xdv0;->b:J

    .line 86
    .line 87
    const-string v9, "SPORT_ID"

    .line 88
    .line 89
    invoke-virtual {v6, v9, v11, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    const-string v9, "is_live"

    .line 94
    .line 95
    invoke-virtual {v6, v9, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    const-string v9, "sportId"

    .line 100
    .line 101
    invoke-virtual {v6, v9, v11, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    const-string v9, "subSportId"

    .line 106
    .line 107
    iget-wide v11, v1, La/xdv0;->c:J

    .line 108
    .line 109
    invoke-virtual {v6, v9, v11, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    const-string v9, "favorite"

    .line 114
    .line 115
    iget-boolean v11, v1, La/xdv0;->l:Z

    .line 116
    .line 117
    invoke-virtual {v6, v9, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    const-string v9, "champ_id"

    .line 122
    .line 123
    iget-wide v11, v1, La/xdv0;->h:J

    .line 124
    .line 125
    invoke-virtual {v6, v9, v11, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    const v9, 0x7f0a144d

    .line 130
    .line 131
    .line 132
    invoke-virtual {v10, v9, v6}, Landroid/widget/RemoteViews;->setOnClickFillInIntent(ILandroid/content/Intent;)V

    .line 133
    .line 134
    .line 135
    const-string v6, "widget_shared_prefs"

    .line 136
    .line 137
    const/4 v9, 0x0

    .line 138
    invoke-virtual {v15, v6, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    const-string v9, "widget_selected_game_id"

    .line 150
    .line 151
    invoke-interface {v6, v9, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 156
    .line 157
    .line 158
    const v4, 0x7f0a0f54

    .line 159
    .line 160
    .line 161
    iget-object v5, v1, La/xdv0;->g:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v10, v4, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    iget-wide v4, v1, La/xdv0;->f:J

    .line 167
    .line 168
    const-wide/16 v11, 0x0

    .line 169
    .line 170
    cmp-long v6, v4, v11

    .line 171
    .line 172
    if-eqz v6, :cond_3

    .line 173
    .line 174
    const-string v6, "svg"

    .line 175
    .line 176
    const-string v9, "sports_v2"

    .line 177
    .line 178
    const-string v11, "static"

    .line 179
    .line 180
    invoke-static {v11, v6, v9}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    const-string v9, ".svg"

    .line 185
    .line 186
    invoke-static {v4, v5, v9, v6}, La/rz4;->s(JLjava/lang/String;La/bzu;)V

    .line 187
    .line 188
    .line 189
    iget-object v4, v6, La/bzu;->b:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v4, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    :goto_2
    move-object/from16 v19, v4

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_3
    const-string v4, ""

    .line 201
    .line 202
    goto :goto_2

    .line 203
    :goto_3
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    const v5, 0x7f070194

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    float-to-int v4, v4

    .line 215
    sget-object v22, La/iun;->a:La/iun;

    .line 216
    .line 217
    iget-object v5, v0, La/a56;->a:Landroid/content/Context;

    .line 218
    .line 219
    const v18, 0x7f0a075e

    .line 220
    .line 221
    .line 222
    const v20, 0x7f080f06

    .line 223
    .line 224
    .line 225
    move/from16 v21, v4

    .line 226
    .line 227
    move-object/from16 v17, v5

    .line 228
    .line 229
    move-object/from16 v16, v10

    .line 230
    .line 231
    invoke-static/range {v16 .. v22}, La/a4n0;->h(Landroid/widget/RemoteViews;Landroid/content/Context;ILjava/lang/String;IILjava/util/List;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v10, v3}, La/a56;->k(Landroid/widget/RemoteViews;Z)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v10, v1}, La/a56;->j(Landroid/widget/RemoteViews;La/xdv0;)V

    .line 238
    .line 239
    .line 240
    iget-object v3, v0, La/a56;->i:La/kj5;

    .line 241
    .line 242
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    iget-object v3, v2, La/unp0;->c:Ljava/util/List;

    .line 246
    .line 247
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    iget-wide v11, v2, La/unp0;->a:J

    .line 252
    .line 253
    const/4 v4, 0x1

    .line 254
    if-ne v3, v4, :cond_4

    .line 255
    .line 256
    const v3, 0x7f0a0765

    .line 257
    .line 258
    .line 259
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v13

    .line 267
    iget-object v14, v2, La/unp0;->c:Ljava/util/List;

    .line 268
    .line 269
    invoke-static/range {v10 .. v15}, La/kj5;->n(Landroid/widget/RemoteViews;JLjava/util/List;Ljava/util/List;Landroid/content/Context;)V

    .line 270
    .line 271
    .line 272
    iget-wide v11, v7, La/unp0;->a:J

    .line 273
    .line 274
    const v3, 0x7f0a076a

    .line 275
    .line 276
    .line 277
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v13

    .line 285
    iget-object v14, v7, La/unp0;->c:Ljava/util/List;

    .line 286
    .line 287
    invoke-static/range {v10 .. v15}, La/kj5;->n(Landroid/widget/RemoteViews;JLjava/util/List;Ljava/util/List;Landroid/content/Context;)V

    .line 288
    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_4
    const v3, 0x7f0a0766

    .line 292
    .line 293
    .line 294
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    const v4, 0x7f0a0768

    .line 299
    .line 300
    .line 301
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    const v5, 0x7f0a0769

    .line 306
    .line 307
    .line 308
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v5

    .line 312
    const v6, 0x7f0a0767

    .line 313
    .line 314
    .line 315
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    filled-new-array {v3, v4, v5, v6}, [Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 324
    .line 325
    .line 326
    move-result-object v13

    .line 327
    iget-object v14, v2, La/unp0;->c:Ljava/util/List;

    .line 328
    .line 329
    invoke-static/range {v10 .. v15}, La/kj5;->n(Landroid/widget/RemoteViews;JLjava/util/List;Ljava/util/List;Landroid/content/Context;)V

    .line 330
    .line 331
    .line 332
    iget-wide v11, v7, La/unp0;->a:J

    .line 333
    .line 334
    const v3, 0x7f0a076b

    .line 335
    .line 336
    .line 337
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 338
    .line 339
    .line 340
    move-result-object v3

    .line 341
    const v4, 0x7f0a076d

    .line 342
    .line 343
    .line 344
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    const v5, 0x7f0a076e

    .line 349
    .line 350
    .line 351
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 352
    .line 353
    .line 354
    move-result-object v5

    .line 355
    const v6, 0x7f0a076c

    .line 356
    .line 357
    .line 358
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    filled-new-array {v3, v4, v5, v6}, [Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 367
    .line 368
    .line 369
    move-result-object v13

    .line 370
    iget-object v14, v7, La/unp0;->c:Ljava/util/List;

    .line 371
    .line 372
    invoke-static/range {v10 .. v15}, La/kj5;->n(Landroid/widget/RemoteViews;JLjava/util/List;Ljava/util/List;Landroid/content/Context;)V

    .line 373
    .line 374
    .line 375
    :goto_4
    iget-object v3, v0, La/a56;->g:La/wdv0;

    .line 376
    .line 377
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    sget-object v4, La/wdv0;->a:La/wdv0;

    .line 381
    .line 382
    iget-object v2, v2, La/unp0;->b:Ljava/lang/String;

    .line 383
    .line 384
    const v5, 0x7f0a0f51

    .line 385
    .line 386
    .line 387
    const v6, 0x7f0a0f50

    .line 388
    .line 389
    .line 390
    if-ne v3, v4, :cond_5

    .line 391
    .line 392
    invoke-virtual {v10, v6, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v10, v5, v8}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 396
    .line 397
    .line 398
    goto :goto_5

    .line 399
    :cond_5
    iget v0, v0, La/a56;->c:I

    .line 400
    .line 401
    invoke-static {v2, v0, v15, v3}, La/kj5;->l(Ljava/lang/String;ILandroid/content/Context;La/wdv0;)Landroid/text/SpannableString;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    invoke-virtual {v10, v6, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 406
    .line 407
    .line 408
    invoke-static {v8, v0, v15, v3}, La/kj5;->l(Ljava/lang/String;ILandroid/content/Context;La/wdv0;)Landroid/text/SpannableString;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v10, v5, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 413
    .line 414
    .line 415
    :goto_5
    const v0, 0x7f0a0f4c

    .line 416
    .line 417
    .line 418
    iget-object v1, v1, La/xdv0;->k:Ljava/lang/String;

    .line 419
    .line 420
    invoke-virtual {v10, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 421
    .line 422
    .line 423
    return-object v10
.end method

.method public b()Landroid/widget/RemoteViews;
    .locals 2

    .line 1
    iget-object p0, p0, La/a56;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 12
    .line 13
    const v1, 0x3fa51eb8    # 1.29f

    .line 14
    .line 15
    .line 16
    cmpl-float v0, v0, v1

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, Landroid/widget/RemoteViews;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const v1, 0x7f0d06ec

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    new-instance v0, Landroid/widget/RemoteViews;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const v1, 0x7f0d06e4

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, p0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public c()Landroid/widget/RemoteViews;
    .locals 2

    .line 1
    iget-object p0, p0, La/a56;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 12
    .line 13
    const v1, 0x3fa51eb8    # 1.29f

    .line 14
    .line 15
    .line 16
    cmpl-float v0, v0, v1

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, Landroid/widget/RemoteViews;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const v1, 0x7f0d06ed

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    new-instance v0, Landroid/widget/RemoteViews;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const v1, 0x7f0d06e5

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, p0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public d()Landroid/widget/RemoteViews;
    .locals 3

    .line 1
    iget-object v0, p0, La/a56;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget v1, v1, Landroid/content/res/Configuration;->fontScale:F

    .line 12
    .line 13
    const v2, 0x3fa51eb8    # 1.29f

    .line 14
    .line 15
    .line 16
    cmpl-float v1, v1, v2

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    .line 20
    sget-object v1, La/wdv0;->b:La/wdv0;

    .line 21
    .line 22
    iput-object v1, p0, La/a56;->g:La/wdv0;

    .line 23
    .line 24
    new-instance p0, Landroid/widget/RemoteViews;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const v1, 0x7f0d06ee

    .line 31
    .line 32
    .line 33
    invoke-direct {p0, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    sget-object v1, La/wdv0;->c:La/wdv0;

    .line 38
    .line 39
    iput-object v1, p0, La/a56;->g:La/wdv0;

    .line 40
    .line 41
    new-instance p0, Landroid/widget/RemoteViews;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const v1, 0x7f0d06e9

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 51
    .line 52
    .line 53
    return-object p0
.end method

.method public final e()La/g56;
    .locals 0

    .line 1
    iget-object p0, p0, La/a56;->f:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/g56;

    .line 8
    .line 9
    return-object p0
.end method

.method public final f(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/a56;->b:Landroid/content/Intent;

    .line 2
    .line 3
    const-string v0, "key_widget_provider_class"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Landroid/content/ComponentName;

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v1, p1, p0}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const p1, 0x7f0a0976

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0, p1}, Landroid/appwidget/AppWidgetManager;->notifyAppWidgetViewDataChanged([II)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public g(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string p2, "action_update_top_all_games"

    .line 9
    .line 10
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, La/a56;->e()La/g56;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, La/g56;->a()V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public getCount()I
    .locals 2

    .line 1
    invoke-virtual {p0}, La/a56;->e()La/g56;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, La/g56;->b()La/s6n0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, La/s6n0;->a:La/noj0;

    .line 10
    .line 11
    invoke-interface {v0}, La/noj0;->d()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/f56;

    .line 20
    .line 21
    instance-of v1, v0, La/d56;

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    instance-of v1, v0, La/e56;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v1, p0, La/a56;->d:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    instance-of v0, v0, La/b56;

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_1
    iget-object p0, p0, La/a56;->d:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 52
    return p0
.end method

.method public final getItemId(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final getLoadingView()Landroid/widget/RemoteViews;
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/RemoteViews;

    .line 2
    .line 3
    iget-object p0, p0, La/a56;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v1, 0x7f0d06e6

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public getViewAt(I)Landroid/widget/RemoteViews;
    .locals 2

    .line 1
    iget-object v0, p0, La/a56;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/a56;->getLoadingView()Landroid/widget/RemoteViews;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object v0, p0, La/a56;->d:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, La/pev0;

    .line 21
    .line 22
    if-eqz p1, :cond_4

    .line 23
    .line 24
    instance-of v0, p1, La/xdv0;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    move-object v0, p1

    .line 30
    check-cast v0, La/xdv0;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v0, v1

    .line 34
    :goto_0
    if-eqz v0, :cond_2

    .line 35
    .line 36
    check-cast p1, La/xdv0;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/a56;->a(La/xdv0;)Landroid/widget/RemoteViews;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_2
    if-nez v1, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    return-object v1

    .line 46
    :cond_4
    :goto_1
    invoke-virtual {p0}, La/a56;->getLoadingView()Landroid/widget/RemoteViews;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public getViewTypeCount()I
    .locals 0

    .line 1
    const/4 p0, 0x6

    .line 2
    return p0
.end method

.method public abstract h()La/g56;
.end method

.method public final hasStableIds()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final i(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/a56;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget p0, p0, La/a56;->c:I

    .line 8
    .line 9
    invoke-virtual {v0, p0, p1}, Landroid/appwidget/AppWidgetManager;->updateAppWidgetOptions(ILandroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public j(Landroid/widget/RemoteViews;La/xdv0;)V
    .locals 3

    .line 1
    iget-boolean v0, p2, La/xdv0;->e:Z

    .line 2
    .line 3
    iget-object p2, p2, La/xdv0;->m:Ljava/lang/Long;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    sget-object v0, La/rdj;->a:La/rdj;

    .line 10
    .line 11
    iget-object p0, p0, La/a56;->a:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {p0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    sget-object p2, La/efj;->c:La/efj;

    .line 22
    .line 23
    new-instance v2, La/znq0;

    .line 24
    .line 25
    invoke-direct {v2, v0, v1}, La/znq0;-><init>(J)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/4 v0, 0x0

    .line 33
    const/16 v1, 0x38

    .line 34
    .line 35
    invoke-static {v2, p2, p0, v0, v1}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const p2, 0x7f0a0f41

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2, p0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public k(Landroid/widget/RemoteViews;Z)V
    .locals 3

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v1, p0

    .line 9
    :goto_0
    const v2, 0x7f0a075f

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v2, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 13
    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move p0, v0

    .line 19
    :goto_1
    const p2, 0x7f0a0f41

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2, p0}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public onCreate()V
    .locals 5

    .line 1
    iget-object v0, p0, La/a56;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, La/gr00;->t(Landroid/content/Context;)La/gr00;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Landroid/content/IntentFilter;

    .line 8
    .line 9
    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "action_update_top_line_games"

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v2, "action_update_top_live_games"

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v2, "action_update_top_all_games"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v2, "action_change_locale"

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, La/a56;->h:La/md3;

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, La/gr00;->D(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, La/tvk;->a:La/rwj;

    .line 42
    .line 43
    sget-object v1, La/ys10;->a:La/vs10;

    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/a56;->e:La/sje;

    .line 54
    .line 55
    new-instance v2, La/qv3;

    .line 56
    .line 57
    const/16 v3, 0xa

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-direct {v2, p0, v4, v3}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x2

    .line 64
    invoke-static {v0, v1, v4, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final onDataSetChanged()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, La/a56;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, La/gr00;->t(Landroid/content/Context;)La/gr00;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, La/a56;->h:La/md3;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, La/gr00;->F(Landroid/content/BroadcastReceiver;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/a56;->e()La/g56;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, La/g56;->onDestroy()V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, La/a56;->e:La/sje;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {p0, v0}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
