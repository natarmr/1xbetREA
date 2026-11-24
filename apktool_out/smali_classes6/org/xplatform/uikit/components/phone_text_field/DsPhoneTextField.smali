.class public final Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;
.super La/jrx;
.source "SourceFile"


# static fields
.field public static final synthetic f:I


# instance fields
.field public final a:Lorg/xplatform/uikit/components/text_field/DsTextField;

.field public final b:Lorg/xplatform/uikit/components/text_field/DsTextField;

.field public final c:I

.field public final d:La/a8z;

.field public e:La/iwk;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 414
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 413
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v1

    .line 7
    :cond_0
    const/4 p3, 0x5

    .line 8
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {p0, p1, p2, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 20
    .line 21
    new-instance v4, La/tje;

    .line 22
    .line 23
    const v5, 0x7f140863

    .line 24
    .line 25
    .line 26
    invoke-direct {v4, p1, v5}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 27
    .line 28
    .line 29
    const/16 v6, 0xe

    .line 30
    .line 31
    invoke-direct {v3, v4, v1, v6}, Lorg/xplatform/uikit/components/text_field/DsTextField;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    .line 33
    .line 34
    const v4, 0x7f0a0493

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 38
    .line 39
    .line 40
    iput-object v3, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 41
    .line 42
    new-instance v3, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 43
    .line 44
    new-instance v7, La/tje;

    .line 45
    .line 46
    const v8, 0x7f14086a

    .line 47
    .line 48
    .line 49
    invoke-direct {v7, p1, v8}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v3, v7, v1, v6}, Lorg/xplatform/uikit/components/text_field/DsTextField;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 53
    .line 54
    .line 55
    const v7, 0x7f0a0494

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v7}, Landroid/view/View;->setId(I)V

    .line 59
    .line 60
    .line 61
    iput-object v3, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    const v8, 0x7f0706ea

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    iput v7, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->c:I

    .line 75
    .line 76
    sget-object v7, La/dnm;->a:La/dnm;

    .line 77
    .line 78
    sget-object v8, La/wez;->b:La/wez;

    .line 79
    .line 80
    invoke-static {v8, v7}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    iput-object v7, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->d:La/a8z;

    .line 85
    .line 86
    const/4 v7, 0x1

    .line 87
    invoke-virtual {p0, v7}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 88
    .line 89
    .line 90
    sget-object v8, La/bqd0;->X:[I

    .line 91
    .line 92
    invoke-virtual {p1, p2, v8, v2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    new-instance p2, Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 97
    .line 98
    new-instance v8, La/tje;

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    const v5, 0x7f140869

    .line 112
    .line 113
    .line 114
    :goto_0
    invoke-direct {v8, v9, v5}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 115
    .line 116
    .line 117
    invoke-direct {p2, v8, v1, v6}, Lorg/xplatform/uikit/components/text_field/DsTextField;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2, v4}, Landroid/view/View;->setId(I)V

    .line 121
    .line 122
    .line 123
    iput-object p2, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 124
    .line 125
    const/4 p2, 0x4

    .line 126
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeStartIcon(Landroid/graphics/drawable/Drawable;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-static {p1, p2, v0}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeLabel(Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-static {p1, p2, p3}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeText(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {p1, p2, v0}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeHelperText(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    const/4 v0, 0x3

    .line 191
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-static {p1, p2, v1}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodePlaceholder(Ljava/lang/CharSequence;)V

    .line 200
    .line 201
    .line 202
    iget-object p2, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 203
    .line 204
    invoke-virtual {p2, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setFocusable(Z)V

    .line 205
    .line 206
    .line 207
    iget-object p2, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 208
    .line 209
    invoke-virtual {p2, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setTextDirection(I)V

    .line 210
    .line 211
    .line 212
    iget-object p2, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 213
    .line 214
    const-string v0, "DsPhoneTextField.TAG_CODE"

    .line 215
    .line 216
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    iget-object p2, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 220
    .line 221
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    const v1, 0x7f070717

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    invoke-virtual {p2}, Landroid/view/View;->getPaddingRight()I

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    invoke-virtual {p2, v4, v5, v6, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 245
    .line 246
    .line 247
    iget-object p2, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 248
    .line 249
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    const/16 v0, 0x8

    .line 263
    .line 264
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {p1, p2, v0}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhoneLabel(Ljava/lang/CharSequence;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    const/16 v0, 0xa

    .line 283
    .line 284
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-static {p1, p2, v0}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p2

    .line 292
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhoneText(Ljava/lang/CharSequence;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 296
    .line 297
    .line 298
    move-result-object p2

    .line 299
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    const/4 v0, 0x7

    .line 303
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {p1, p2, v0}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhoneHelperText(Ljava/lang/CharSequence;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 315
    .line 316
    .line 317
    move-result-object p2

    .line 318
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    const/16 v0, 0x9

    .line 322
    .line 323
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-static {p1, p2, v0}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object p2

    .line 331
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhonePlaceholder(Ljava/lang/CharSequence;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 335
    .line 336
    .line 337
    move-result-object p2

    .line 338
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    const/4 v0, 0x6

    .line 342
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-static {p1, p2, v0}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object p2

    .line 350
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhoneErrorText(Ljava/lang/CharSequence;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 354
    .line 355
    .line 356
    move-result-object p2

    .line 357
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-static {p1, p2, p3}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p2

    .line 364
    if-eqz p2, :cond_2

    .line 365
    .line 366
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 367
    .line 368
    .line 369
    move-result p2

    .line 370
    if-nez p2, :cond_3

    .line 371
    .line 372
    :cond_2
    move v2, v7

    .line 373
    :cond_3
    xor-int/lit8 p2, v2, 0x1

    .line 374
    .line 375
    invoke-virtual {p0, p2}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhoneEnabled(Z)V

    .line 376
    .line 377
    .line 378
    const-string p2, "DsPhoneTextField.TAG_PHONE"

    .line 379
    .line 380
    invoke-virtual {v3, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 384
    .line 385
    .line 386
    move-result-object p2

    .line 387
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 388
    .line 389
    .line 390
    move-result p2

    .line 391
    invoke-virtual {v3}, Landroid/view/View;->getPaddingLeft()I

    .line 392
    .line 393
    .line 394
    move-result p3

    .line 395
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    invoke-virtual {v3, p3, v0, v1, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 410
    .line 411
    .line 412
    return-void
.end method

.method private final getCodeStartIconPlaceHolder()Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f08096d

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Landroid/util/TypedValue;

    .line 13
    .line 14
    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const v2, 0x7f040b10

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-virtual {p0, v2, v1, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 30
    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget p0, v1, Landroid/util/TypedValue;->data:I

    .line 35
    .line 36
    sget-object v1, La/n78;->f:La/n78;

    .line 37
    .line 38
    invoke-static {p0, v1}, La/dwi0;->J(ILa/n78;)Landroid/graphics/ColorFilter;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-object v0
.end method

.method private final getPhoneHelper()La/vex;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->d:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vex;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    sget-object v0, La/cnm;->a:La/cnm;

    .line 2
    .line 3
    invoke-virtual {v0, v0}, La/cnm;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->getPhoneHelper()La/vex;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La/vex;->k:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/text/TextWatcher;

    .line 20
    .line 21
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final b()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->getPhoneHelper()La/vex;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/vex;->j:La/n0o0;

    .line 6
    .line 7
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/text/InputFilter;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [Landroid/text/InputFilter;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    aput-object v0, v1, v2

    .line 18
    .line 19
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setFilters([Landroid/text/InputFilter;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->getPhoneHelper()La/vex;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, La/vex;->i:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    return-void
.end method

.method public final clearFocus()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->clearFocus()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->clearFocus()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    sget-object v0, La/cnm;->a:La/cnm;

    .line 2
    .line 3
    invoke-virtual {v0, v0}, La/cnm;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->getPhoneHelper()La/vex;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La/vex;->k:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/text/TextWatcher;

    .line 20
    .line 21
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->c(Landroid/text/TextWatcher;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->getCodeStartIconPlaceHolder()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeStartIcon(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final getCode()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getPhone()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getPhoneTextView()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTextView()Landroid/widget/TextView;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final onFinishInflate()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 5
    .line 6
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTextView()Landroid/widget/TextView;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 14
    .line 15
    .line 16
    new-instance v2, La/bnm;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnScrollChangeListener(Landroid/view/View$OnScrollChangeListener;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTextView()Landroid/widget/TextView;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 33
    .line 34
    .line 35
    new-instance v0, La/bnm;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnScrollChangeListener(Landroid/view/View$OnScrollChangeListener;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    iget-object p1, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    const/4 p4, 0x0

    .line 12
    invoke-virtual {p1, p4, p4, p2, p3}, Landroid/view/View;->layout(IIII)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget p3, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->c:I

    .line 20
    .line 21
    add-int/2addr p2, p3

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 27
    .line 28
    .line 29
    move-result p5

    .line 30
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 31
    .line 32
    invoke-virtual {p0, p2, p4, p3, p5}, Landroid/view/View;->layout(IIII)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTextView()Landroid/widget/TextView;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    invoke-virtual {p1, p4}, Landroid/view/View;->setScrollY(I)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTextView()Landroid/widget/TextView;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0, p4}, Landroid/view/View;->setScrollY(I)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iget-object v2, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 11
    .line 12
    invoke-virtual {v2, v0, v1}, Landroid/view/View;->measure(II)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-object v0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sub-int/2addr p1, v0

    .line 26
    iget v1, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->c:I

    .line 27
    .line 28
    sub-int/2addr p1, v1

    .line 29
    const/high16 v2, 0x40000000    # 2.0f

    .line 30
    .line 31
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iget-object v3, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 40
    .line 41
    invoke-virtual {v3, v2, p2}, Landroid/view/View;->measure(II)V

    .line 42
    .line 43
    .line 44
    add-int/2addr v0, v1

    .line 45
    add-int/2addr v0, p1

    .line 46
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final setAfterTextFormattingCallback(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->getPhoneHelper()La/vex;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/vex;->i:Lkotlin/jvm/functions/Function1;

    .line 15
    .line 16
    return-void
.end method

.method public final setCodeChevronVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEndViewVisible(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCodeClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setCodeEditable(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEditable(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCodeEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCodeErrorText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCodeFocusable(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setFocusable(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCodeHelperText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setHelperText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCodeLabel(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setLabelText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCodePlaceholder(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCodeStartIcon(I)V
    .locals 0

    .line 66
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setStartIconDrawableRes(I)V

    return-void
.end method

.method public final setCodeStartIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 67
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setStartIconDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setCodeStartIcon(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->e:La/iwk;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, La/iwk;->a()V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->e:La/iwk;

    .line 13
    .line 14
    invoke-direct {p0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->getCodeStartIconPlaceHolder()Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeStartIcon(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La/k1x;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, v2}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, v1, La/k1x;->c:Ljava/lang/Object;

    .line 45
    .line 46
    new-instance p1, La/lrc;

    .line 47
    .line 48
    const/16 v2, 0x1b

    .line 49
    .line 50
    invoke-direct {p1, p0, v2}, La/lrc;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    iput-object p1, v1, La/k1x;->e:La/n1x;

    .line 54
    .line 55
    invoke-virtual {v1}, La/k1x;->a()La/o1x;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v0, p1}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->e:La/iwk;

    .line 64
    .line 65
    return-void
.end method

.method public final setCodeStartIconTint(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeStartIconTintList(Landroid/content/res/ColorStateList;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setCodeStartIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setStartIconTintList(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCodeText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    move p1, v0

    .line 19
    :goto_1
    xor-int/2addr p1, v0

    .line 20
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhoneEnabled(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public setEnabled(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 24
    :goto_1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEnabled(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEnabled(Z)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final setImeOptions(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setImeOptions(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setPhoneEditable(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEditable(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setPhoneEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setPhoneErrorText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setPhoneHelperText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setHelperText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setPhoneLabel(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setLabelText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setPhoneMask(Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 5
    .line 6
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {p0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->getPhoneHelper()La/vex;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v3, v2, La/vex;->b:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v2, v2, La/vex;->g:Lkotlin/text/Regex;

    .line 20
    .line 21
    const-string v4, "#"

    .line 22
    .line 23
    invoke-virtual {v2, p1, v4}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_5

    .line 32
    .line 33
    invoke-direct {p0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->getPhoneHelper()La/vex;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v3, v2, La/vex;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    iput-object p1, v2, La/vex;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const-string v5, ""

    .line 56
    .line 57
    if-lez v3, :cond_3

    .line 58
    .line 59
    iget-object v3, v2, La/vex;->g:Lkotlin/text/Regex;

    .line 60
    .line 61
    invoke-virtual {v3, p1, v4}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    iput-object v3, v2, La/vex;->b:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v4, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    const/4 v7, 0x0

    .line 77
    move v8, v7

    .line 78
    :goto_0
    if-ge v8, v6, :cond_2

    .line 79
    .line 80
    invoke-virtual {v3, v8}, Ljava/lang/String;->charAt(I)C

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    const/16 v10, 0x23

    .line 85
    .line 86
    if-ne v9, v10, :cond_1

    .line 87
    .line 88
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 89
    .line 90
    .line 91
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    iput v3, v2, La/vex;->f:I

    .line 99
    .line 100
    iput-object v5, v2, La/vex;->d:Ljava/lang/String;

    .line 101
    .line 102
    iput v7, v2, La/vex;->c:I

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    iput-object v5, v2, La/vex;->b:Ljava/lang/String;

    .line 106
    .line 107
    const/16 v3, 0xff

    .line 108
    .line 109
    iput v3, v2, La/vex;->f:I

    .line 110
    .line 111
    :goto_1
    const/4 v2, 0x0

    .line 112
    if-eqz v1, :cond_4

    .line 113
    .line 114
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_4

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    :goto_2
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getPlaceholderOrEmpty()Ljava/lang/CharSequence;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-nez v0, :cond_6

    .line 139
    .line 140
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setPhonePlaceholder(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    :cond_6
    return-void
.end method

.method public final setPhonePlaceholder(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setPhoneText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
