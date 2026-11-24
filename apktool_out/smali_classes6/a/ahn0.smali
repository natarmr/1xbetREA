.class public final La/ahn0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public f:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

.field public g:Landroid/widget/FrameLayout;

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const v0, 0x7f070705

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, La/ahn0;->a:I

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const v0, 0x7f07072d

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, La/ahn0;->b:I

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const v0, 0x7f070747

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iput p1, p0, La/ahn0;->c:I

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const v0, 0x7f07074a

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iput p1, p0, La/ahn0;->d:I

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const v0, 0x7f07074b

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iput p1, p0, La/ahn0;->e:I

    .line 73
    .line 74
    new-instance p1, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, La/ahn0;->h:Ljava/util/ArrayList;

    .line 80
    .line 81
    return-void
.end method

.method public static c(Landroid/widget/TextView;II)V
    .locals 1

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    :cond_0
    const/high16 v0, -0x80000000

    .line 5
    .line 6
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;Lkotlin/jvm/functions/Function0;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-object/from16 v3, p2

    .line 14
    .line 15
    iget-object v3, v3, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object v1, v0, La/ahn0;->f:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 20
    .line 21
    .line 22
    iget-object v4, v0, La/ahn0;->h:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 25
    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    iput-object v5, v0, La/ahn0;->g:Landroid/widget/FrameLayout;

    .line 29
    .line 30
    iget-object v6, v0, La/ahn0;->f:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 31
    .line 32
    if-eqz v6, :cond_0

    .line 33
    .line 34
    iget-object v6, v6, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->a:Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v6, v5

    .line 38
    :goto_0
    if-eqz v6, :cond_7

    .line 39
    .line 40
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-nez v6, :cond_1

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    iget-object v6, v0, La/ahn0;->f:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 48
    .line 49
    if-eqz v6, :cond_2

    .line 50
    .line 51
    iget-object v6, v6, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->b:Ljava/lang/String;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move-object v6, v5

    .line 55
    :goto_1
    if-eqz v6, :cond_7

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-nez v6, :cond_3

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const-string v6, ""

    .line 65
    .line 66
    if-eqz v3, :cond_5

    .line 67
    .line 68
    new-instance v7, La/zgn0;

    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-direct {v7, v8}, La/zgn0;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    if-nez v2, :cond_4

    .line 81
    .line 82
    move-object v2, v6

    .line 83
    :cond_4
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->a()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    move-object/from16 v8, p3

    .line 88
    .line 89
    invoke-virtual {v7, v2, v6, v3, v8}, La/zgn0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_5
    new-instance v7, La/ygn0;

    .line 94
    .line 95
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-direct {v7, v3}, La/ygn0;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    if-nez v2, :cond_6

    .line 106
    .line 107
    move-object v2, v6

    .line 108
    :cond_6
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->a()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    invoke-virtual {v7, v2, v3}, La/ygn0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :goto_2
    iput-object v7, v0, La/ahn0;->g:Landroid/widget/FrameLayout;

    .line 116
    .line 117
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 118
    .line 119
    .line 120
    :cond_7
    :goto_3
    iget-object v1, v1, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->f:Ljava/util/List;

    .line 121
    .line 122
    new-instance v2, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    :cond_8
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    if-eqz v3, :cond_b

    .line 136
    .line 137
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    move-object v6, v3

    .line 142
    check-cast v6, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;

    .line 143
    .line 144
    if-eqz v6, :cond_a

    .line 145
    .line 146
    instance-of v7, v6, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 147
    .line 148
    if-eqz v7, :cond_9

    .line 149
    .line 150
    check-cast v6, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 151
    .line 152
    iget-object v6, v6, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;->b:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-lez v6, :cond_8

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_9
    instance-of v7, v6, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 162
    .line 163
    if-eqz v7, :cond_a

    .line 164
    .line 165
    check-cast v6, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 166
    .line 167
    iget-object v6, v6, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;->b:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-lez v6, :cond_8

    .line 174
    .line 175
    :goto_5
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-eqz v2, :cond_14

    .line 192
    .line 193
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    check-cast v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;

    .line 198
    .line 199
    new-instance v3, Landroidx/appcompat/widget/AppCompatTextView;

    .line 200
    .line 201
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-direct {v3, v6}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 206
    .line 207
    .line 208
    invoke-static {}, La/jmu0;->d()I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    invoke-virtual {v3, v6}, Landroid/view/View;->setId(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 216
    .line 217
    .line 218
    move-result v6

    .line 219
    new-instance v7, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    const-string v8, "itemName_"

    .line 222
    .line 223
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-virtual {v3, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    const v6, 0x7f1404a4

    .line 237
    .line 238
    .line 239
    invoke-static {v6, v3}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 240
    .line 241
    .line 242
    const/4 v6, 0x2

    .line 243
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 244
    .line 245
    .line 246
    sget-object v7, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 247
    .line 248
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 249
    .line 250
    .line 251
    iget v8, v0, La/ahn0;->d:I

    .line 252
    .line 253
    iget v9, v0, La/ahn0;->e:I

    .line 254
    .line 255
    iget v10, v0, La/ahn0;->c:I

    .line 256
    .line 257
    const/4 v11, 0x0

    .line 258
    invoke-static {v3, v8, v9, v10, v11}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 259
    .line 260
    .line 261
    if-eqz v2, :cond_13

    .line 262
    .line 263
    instance-of v12, v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 264
    .line 265
    const-string v13, "itemValue_"

    .line 266
    .line 267
    const v15, 0x7f140497

    .line 268
    .line 269
    .line 270
    if-eqz v12, :cond_c

    .line 271
    .line 272
    new-instance v5, Landroidx/appcompat/widget/AppCompatTextView;

    .line 273
    .line 274
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 275
    .line 276
    .line 277
    move-result-object v14

    .line 278
    invoke-direct {v5, v14}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 279
    .line 280
    .line 281
    invoke-static {}, La/jmu0;->d()I

    .line 282
    .line 283
    .line 284
    move-result v14

    .line 285
    invoke-virtual {v5, v14}, Landroid/view/View;->setId(I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 289
    .line 290
    .line 291
    move-result v14

    .line 292
    new-instance v11, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    invoke-virtual {v5, v11}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    invoke-static {v15, v5}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 314
    .line 315
    .line 316
    const/4 v6, 0x0

    .line 317
    invoke-static {v5, v8, v9, v10, v6}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 318
    .line 319
    .line 320
    const v6, 0x800005

    .line 321
    .line 322
    .line 323
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 324
    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_c
    instance-of v5, v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 328
    .line 329
    if-eqz v5, :cond_13

    .line 330
    .line 331
    new-instance v5, Landroidx/appcompat/widget/AppCompatTextView;

    .line 332
    .line 333
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    invoke-direct {v5, v11}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 338
    .line 339
    .line 340
    invoke-static {}, La/jmu0;->d()I

    .line 341
    .line 342
    .line 343
    move-result v11

    .line 344
    invoke-virtual {v5, v11}, Landroid/view/View;->setId(I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    .line 348
    .line 349
    .line 350
    move-result v11

    .line 351
    new-instance v14, Ljava/lang/StringBuilder;

    .line 352
    .line 353
    invoke-direct {v14, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v11

    .line 363
    invoke-virtual {v5, v11}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    invoke-static {v15, v5}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 373
    .line 374
    .line 375
    const/4 v6, 0x0

    .line 376
    invoke-static {v5, v8, v9, v10, v6}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 377
    .line 378
    .line 379
    const v6, 0x800005

    .line 380
    .line 381
    .line 382
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setGravity(I)V

    .line 383
    .line 384
    .line 385
    :goto_7
    if-eqz v12, :cond_d

    .line 386
    .line 387
    move-object v6, v2

    .line 388
    check-cast v6, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 389
    .line 390
    iget-object v6, v6, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;->d:Ljava/lang/String;

    .line 391
    .line 392
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 393
    .line 394
    .line 395
    move-result v6

    .line 396
    if-lez v6, :cond_d

    .line 397
    .line 398
    new-instance v6, Landroidx/appcompat/widget/AppCompatTextView;

    .line 399
    .line 400
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 401
    .line 402
    .line 403
    move-result-object v7

    .line 404
    invoke-direct {v6, v7}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 405
    .line 406
    .line 407
    invoke-static {}, La/jmu0;->d()I

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    invoke-virtual {v6, v7}, Landroid/view/View;->setId(I)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    .line 415
    .line 416
    .line 417
    move-result v7

    .line 418
    new-instance v8, Ljava/lang/StringBuilder;

    .line 419
    .line 420
    const-string v9, "itemCurrency_"

    .line 421
    .line 422
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    invoke-virtual {v6, v7}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    invoke-static {v15, v6}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 436
    .line 437
    .line 438
    const v7, 0x800005

    .line 439
    .line 440
    .line 441
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 442
    .line 443
    .line 444
    goto :goto_8

    .line 445
    :cond_d
    const/4 v6, 0x0

    .line 446
    :goto_8
    instance-of v7, v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 447
    .line 448
    if-eqz v7, :cond_f

    .line 449
    .line 450
    move-object v7, v2

    .line 451
    check-cast v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 452
    .line 453
    iget-object v8, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;->b:Ljava/lang/String;

    .line 454
    .line 455
    iget-object v7, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;->a:Ljava/lang/String;

    .line 456
    .line 457
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 458
    .line 459
    .line 460
    const-string v7, "0"

    .line 461
    .line 462
    invoke-static {v8, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v7

    .line 466
    if-eqz v7, :cond_e

    .line 467
    .line 468
    const-string v8, "SP"

    .line 469
    .line 470
    :cond_e
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 471
    .line 472
    .line 473
    const/4 v7, 0x3

    .line 474
    invoke-virtual {v5, v7}, Landroid/view/View;->setTextDirection(I)V

    .line 475
    .line 476
    .line 477
    goto :goto_9

    .line 478
    :cond_f
    if-eqz v12, :cond_12

    .line 479
    .line 480
    move-object v7, v2

    .line 481
    check-cast v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 482
    .line 483
    iget-object v8, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;->a:Ljava/lang/String;

    .line 484
    .line 485
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 486
    .line 487
    .line 488
    iget-object v8, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;->b:Ljava/lang/String;

    .line 489
    .line 490
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 491
    .line 492
    .line 493
    if-eqz v6, :cond_10

    .line 494
    .line 495
    iget-object v7, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;->d:Ljava/lang/String;

    .line 496
    .line 497
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 498
    .line 499
    .line 500
    :cond_10
    :goto_9
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 504
    .line 505
    .line 506
    if-eqz v6, :cond_11

    .line 507
    .line 508
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 509
    .line 510
    .line 511
    :cond_11
    new-instance v7, La/mb7;

    .line 512
    .line 513
    invoke-direct {v7, v3, v5, v6, v2}, La/mb7;-><init>(Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 517
    .line 518
    .line 519
    const/4 v5, 0x0

    .line 520
    goto/16 :goto_6

    .line 521
    .line 522
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 523
    .line 524
    .line 525
    return-void

    .line 526
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 527
    .line 528
    .line 529
    :cond_14
    return-void
.end method

.method public final b()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final onLayout(ZIIII)V
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v0, v5, La/ahn0;->g:Landroid/widget/FrameLayout;

    .line 4
    .line 5
    iget v6, v5, La/ahn0;->b:I

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-virtual {v0, v7, v7, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/2addr v0, v6

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, v7

    .line 28
    :goto_0
    iget-object v1, v5, La/ahn0;->h:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    :goto_1
    move v9, v0

    .line 35
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_f

    .line 40
    .line 41
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, La/mb7;

    .line 46
    .line 47
    iget-object v1, v0, La/mb7;->d:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;

    .line 48
    .line 49
    iget-object v10, v0, La/mb7;->c:Landroidx/appcompat/widget/AppCompatTextView;

    .line 50
    .line 51
    iget-object v4, v0, La/mb7;->a:Landroidx/appcompat/widget/AppCompatTextView;

    .line 52
    .line 53
    iget-object v11, v0, La/mb7;->b:Landroidx/appcompat/widget/AppCompatTextView;

    .line 54
    .line 55
    instance-of v0, v1, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    sub-int v1, v0, v1

    .line 76
    .line 77
    div-int/lit8 v1, v1, 0x2

    .line 78
    .line 79
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    sub-int/2addr v0, v2

    .line 84
    div-int/lit8 v10, v0, 0x2

    .line 85
    .line 86
    move v0, v1

    .line 87
    add-int v1, v9, v0

    .line 88
    .line 89
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    add-int/2addr v2, v9

    .line 94
    add-int v3, v2, v0

    .line 95
    .line 96
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-virtual {v5}, La/ahn0;->b()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_1

    .line 105
    .line 106
    move v2, v6

    .line 107
    goto :goto_3

    .line 108
    :cond_1
    move v2, v7

    .line 109
    :goto_3
    add-int/2addr v2, v0

    .line 110
    const/4 v0, 0x0

    .line 111
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 112
    .line 113
    .line 114
    add-int v0, v9, v10

    .line 115
    .line 116
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    add-int/2addr v1, v9

    .line 121
    add-int/2addr v1, v10

    .line 122
    invoke-virtual/range {p0 .. p0}, La/ahn0;->b()Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_2

    .line 127
    .line 128
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    sub-int/2addr v2, v3

    .line 137
    goto :goto_4

    .line 138
    :cond_2
    move v2, v7

    .line 139
    :goto_4
    invoke-virtual/range {p0 .. p0}, La/ahn0;->b()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_3

    .line 144
    .line 145
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    goto :goto_5

    .line 150
    :cond_3
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    :goto_5
    invoke-virtual {v11, v2, v0, v3, v1}, Landroid/view/View;->layout(IIII)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v11, v7}, Landroid/view/View;->setLayoutDirection(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    add-int/2addr v0, v6

    .line 173
    add-int/2addr v0, v9

    .line 174
    move-object/from16 v5, p0

    .line 175
    .line 176
    goto/16 :goto_1

    .line 177
    .line 178
    :cond_4
    instance-of v0, v1, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 179
    .line 180
    if-eqz v0, :cond_e

    .line 181
    .line 182
    if-nez v10, :cond_5

    .line 183
    .line 184
    move-object/from16 v5, p0

    .line 185
    .line 186
    goto/16 :goto_a

    .line 187
    .line 188
    :cond_5
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    rem-int/lit8 v1, v0, 0x2

    .line 193
    .line 194
    if-eqz v1, :cond_6

    .line 195
    .line 196
    add-int/lit8 v0, v0, 0x1

    .line 197
    .line 198
    :cond_6
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    rem-int/lit8 v2, v1, 0x2

    .line 203
    .line 204
    if-eqz v2, :cond_7

    .line 205
    .line 206
    add-int/lit8 v1, v1, 0x1

    .line 207
    .line 208
    :cond_7
    move v12, v1

    .line 209
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    rem-int/lit8 v2, v1, 0x2

    .line 214
    .line 215
    if-eqz v2, :cond_8

    .line 216
    .line 217
    add-int/lit8 v1, v1, 0x1

    .line 218
    .line 219
    :cond_8
    move v13, v1

    .line 220
    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    sub-int v2, v1, v0

    .line 229
    .line 230
    div-int/lit8 v2, v2, 0x2

    .line 231
    .line 232
    sub-int v3, v1, v12

    .line 233
    .line 234
    div-int/lit8 v14, v3, 0x2

    .line 235
    .line 236
    sub-int/2addr v1, v13

    .line 237
    div-int/lit8 v15, v1, 0x2

    .line 238
    .line 239
    add-int v1, v9, v2

    .line 240
    .line 241
    add-int/2addr v0, v9

    .line 242
    add-int v3, v0, v2

    .line 243
    .line 244
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    add-int v2, v0, v6

    .line 249
    .line 250
    const/4 v0, 0x0

    .line 251
    move-object/from16 v5, p0

    .line 252
    .line 253
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 254
    .line 255
    .line 256
    add-int v0, v9, v14

    .line 257
    .line 258
    add-int/2addr v12, v9

    .line 259
    add-int/2addr v12, v14

    .line 260
    invoke-virtual {v5}, La/ahn0;->b()Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    iget v2, v5, La/ahn0;->a:I

    .line 265
    .line 266
    if-eqz v1, :cond_9

    .line 267
    .line 268
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    sub-int/2addr v1, v3

    .line 277
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    sub-int/2addr v1, v3

    .line 282
    sub-int/2addr v1, v2

    .line 283
    goto :goto_6

    .line 284
    :cond_9
    move v1, v7

    .line 285
    :goto_6
    invoke-virtual {v5}, La/ahn0;->b()Z

    .line 286
    .line 287
    .line 288
    move-result v3

    .line 289
    if-eqz v3, :cond_a

    .line 290
    .line 291
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 296
    .line 297
    .line 298
    move-result v14

    .line 299
    sub-int/2addr v3, v14

    .line 300
    sub-int/2addr v3, v2

    .line 301
    goto :goto_7

    .line 302
    :cond_a
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    :goto_7
    invoke-virtual {v11, v1, v0, v3, v12}, Landroid/view/View;->layout(IIII)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v11, v7}, Landroid/view/View;->setLayoutDirection(I)V

    .line 310
    .line 311
    .line 312
    add-int v0, v9, v15

    .line 313
    .line 314
    add-int/2addr v13, v9

    .line 315
    add-int/2addr v13, v15

    .line 316
    invoke-virtual {v5}, La/ahn0;->b()Z

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    if-eqz v1, :cond_b

    .line 321
    .line 322
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    sub-int/2addr v1, v3

    .line 331
    goto :goto_8

    .line 332
    :cond_b
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    add-int/2addr v1, v2

    .line 337
    :goto_8
    invoke-virtual {v5}, La/ahn0;->b()Z

    .line 338
    .line 339
    .line 340
    move-result v3

    .line 341
    if-eqz v3, :cond_c

    .line 342
    .line 343
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    goto :goto_9

    .line 348
    :cond_c
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 353
    .line 354
    .line 355
    move-result v12

    .line 356
    add-int/2addr v12, v3

    .line 357
    add-int/2addr v2, v12

    .line 358
    :goto_9
    invoke-virtual {v10, v1, v0, v2, v13}, Landroid/view/View;->layout(IIII)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v10, v7}, Landroid/view/View;->setLayoutDirection(I)V

    .line 362
    .line 363
    .line 364
    :goto_a
    if-eqz v10, :cond_d

    .line 365
    .line 366
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    goto :goto_b

    .line 371
    :cond_d
    move v0, v7

    .line 372
    :goto_b
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 377
    .line 378
    .line 379
    move-result v2

    .line 380
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    add-int/2addr v0, v6

    .line 389
    add-int/2addr v0, v9

    .line 390
    goto/16 :goto_1

    .line 391
    .line 392
    :cond_e
    move-object/from16 v5, p0

    .line 393
    .line 394
    goto/16 :goto_2

    .line 395
    .line 396
    :cond_f
    return-void
.end method

.method public final onMeasure(II)V
    .locals 11

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-double v1, v0

    .line 6
    const-wide v3, 0x3fe3333333333333L    # 0.6

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    mul-double/2addr v1, v3

    .line 12
    double-to-int v1, v1

    .line 13
    iget-object v2, p0, La/ahn0;->g:Landroid/widget/FrameLayout;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    if-gez v0, :cond_0

    .line 19
    .line 20
    move v4, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v4, v0

    .line 23
    :goto_0
    const/high16 v5, -0x80000000

    .line 24
    .line 25
    invoke-static {v4, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-virtual {v2, v4, p2}, Landroid/view/View;->measure(II)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v2, p0, La/ahn0;->h:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget v6, p0, La/ahn0;->b:I

    .line 43
    .line 44
    if-eqz v5, :cond_7

    .line 45
    .line 46
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    check-cast v5, La/mb7;

    .line 51
    .line 52
    iget-object v7, v5, La/mb7;->d:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;

    .line 53
    .line 54
    iget-object v8, v5, La/mb7;->a:Landroidx/appcompat/widget/AppCompatTextView;

    .line 55
    .line 56
    iget-object v9, v5, La/mb7;->b:Landroidx/appcompat/widget/AppCompatTextView;

    .line 57
    .line 58
    if-eqz v7, :cond_6

    .line 59
    .line 60
    instance-of v10, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 61
    .line 62
    if-eqz v10, :cond_3

    .line 63
    .line 64
    invoke-static {v8, v0, p2}, La/ahn0;->c(Landroid/widget/TextView;II)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-le v5, v1, :cond_2

    .line 72
    .line 73
    move v5, v1

    .line 74
    :cond_2
    invoke-static {v8, v5, p2}, La/ahn0;->c(Landroid/widget/TextView;II)V

    .line 75
    .line 76
    .line 77
    sub-int v5, v0, v5

    .line 78
    .line 79
    sub-int/2addr v5, v6

    .line 80
    invoke-static {v9, v5, p2}, La/ahn0;->c(Landroid/widget/TextView;II)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    instance-of v7, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 85
    .line 86
    if-eqz v7, :cond_6

    .line 87
    .line 88
    iget-object v5, v5, La/mb7;->c:Landroidx/appcompat/widget/AppCompatTextView;

    .line 89
    .line 90
    if-nez v5, :cond_4

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    invoke-static {v8, v0, p2}, La/ahn0;->c(Landroid/widget/TextView;II)V

    .line 94
    .line 95
    .line 96
    invoke-static {v5, v0, p2}, La/ahn0;->c(Landroid/widget/TextView;II)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-le v7, v1, :cond_5

    .line 104
    .line 105
    move v7, v1

    .line 106
    :cond_5
    invoke-static {v8, v7, p2}, La/ahn0;->c(Landroid/widget/TextView;II)V

    .line 107
    .line 108
    .line 109
    sub-int v7, v0, v7

    .line 110
    .line 111
    sub-int/2addr v7, v6

    .line 112
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    sub-int/2addr v7, v5

    .line 117
    iget v5, p0, La/ahn0;->a:I

    .line 118
    .line 119
    sub-int/2addr v7, v5

    .line 120
    invoke-static {v9, v7, p2}, La/ahn0;->c(Landroid/widget/TextView;II)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_7
    iget-object v1, p0, La/ahn0;->g:Landroid/widget/FrameLayout;

    .line 129
    .line 130
    if-eqz v1, :cond_8

    .line 131
    .line 132
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    add-int/2addr v1, v6

    .line 137
    goto :goto_2

    .line 138
    :cond_8
    move v1, v3

    .line 139
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    move v4, v3

    .line 144
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-eqz v5, :cond_c

    .line 149
    .line 150
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    check-cast v5, La/mb7;

    .line 155
    .line 156
    iget-object v7, v5, La/mb7;->d:Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem;

    .line 157
    .line 158
    iget-object v8, v5, La/mb7;->a:Landroidx/appcompat/widget/AppCompatTextView;

    .line 159
    .line 160
    iget-object v9, v5, La/mb7;->b:Landroidx/appcompat/widget/AppCompatTextView;

    .line 161
    .line 162
    instance-of v10, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$Simple;

    .line 163
    .line 164
    if-eqz v10, :cond_9

    .line 165
    .line 166
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    :goto_4
    add-int/2addr v5, v6

    .line 179
    goto :goto_6

    .line 180
    :cond_9
    instance-of v7, v7, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetInfoItem$WithCurrency;

    .line 181
    .line 182
    if-eqz v7, :cond_b

    .line 183
    .line 184
    iget-object v5, v5, La/mb7;->c:Landroidx/appcompat/widget/AppCompatTextView;

    .line 185
    .line 186
    if-eqz v5, :cond_a

    .line 187
    .line 188
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    goto :goto_5

    .line 193
    :cond_a
    move v5, v3

    .line 194
    :goto_5
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    .line 199
    .line 200
    .line 201
    move-result v8

    .line 202
    invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    goto :goto_4

    .line 211
    :cond_b
    move v5, v3

    .line 212
    :goto_6
    add-int/2addr v4, v5

    .line 213
    goto :goto_3

    .line 214
    :cond_c
    add-int/2addr v1, v4

    .line 215
    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    invoke-static {v1, p2}, Landroid/view/View;->resolveSize(II)I

    .line 220
    .line 221
    .line 222
    move-result p2

    .line 223
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 224
    .line 225
    .line 226
    const-string p1, "SUCCESS_BET_INFO_SECONDARY_VIEW"

    .line 227
    .line 228
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    return-void
.end method
