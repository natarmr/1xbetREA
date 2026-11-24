.class public final Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public final a:La/a8z;

.field public final b:Ljava/util/ArrayList;

.field public c:La/fj10;

.field public d:La/ej10;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 367
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 366
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object p1, La/wez;->b:La/wez;

    .line 14
    .line 15
    new-instance p2, La/nsr;

    .line 16
    .line 17
    const/16 p3, 0x1c

    .line 18
    .line 19
    invoke-direct {p2, p0, p0, p3}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->a:La/a8z;

    .line 27
    .line 28
    new-instance p1, Ljava/util/ArrayList;

    .line 29
    .line 30
    const/4 p2, 0x6

    .line 31
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->b:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iget-object p2, p2, La/yhu0;->h:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iget-object p2, p2, La/yhu0;->c:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 50
    .line 51
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    iget-object p2, p2, La/yhu0;->e:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    iget-object p2, p2, La/yhu0;->d:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    iget-object p2, p2, La/yhu0;->b:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    iget-object p2, p2, La/yhu0;->g:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 86
    .line 87
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    iget-object p2, p2, La/yhu0;->h:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    const v0, 0x7f13084f

    .line 101
    .line 102
    .line 103
    invoke-virtual {p3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    const v1, 0x7f080c07

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2, v1, p3}, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;->a(ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    iget-object p2, p2, La/yhu0;->c:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 121
    .line 122
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    invoke-virtual {p3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    const v1, 0x7f080718

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, v1, p3}, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;->a(ILjava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    iget-object p2, p2, La/yhu0;->e:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 144
    .line 145
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    invoke-virtual {p3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p3

    .line 153
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    const v1, 0x7f080a5b

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2, v1, p3}, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;->a(ILjava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    iget-object p2, p2, La/yhu0;->d:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 167
    .line 168
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 169
    .line 170
    .line 171
    move-result-object p3

    .line 172
    invoke-virtual {p3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p3

    .line 176
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    const v0, 0x7f080757

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2, v0, p3}, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;->a(ILjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    iget-object p2, p2, La/yhu0;->b:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 190
    .line 191
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    const v0, 0x7f13084e

    .line 196
    .line 197
    .line 198
    invoke-virtual {p3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p3

    .line 202
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    const v2, 0x7f1302a9

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    const v2, 0x7f06069d

    .line 220
    .line 221
    .line 222
    invoke-virtual {p2, v2, p3, v1}, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    iget-object p2, p2, La/yhu0;->g:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 230
    .line 231
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 232
    .line 233
    .line 234
    move-result-object p3

    .line 235
    invoke-virtual {p3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p3

    .line 239
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    const v1, 0x7f1310de

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    const v1, 0x7f0606d0

    .line 257
    .line 258
    .line 259
    invoke-virtual {p2, v1, p3, v0}, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    iget-object p2, p2, La/yhu0;->h:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 267
    .line 268
    sget-object p3, La/ej10;->b:La/ej10;

    .line 269
    .line 270
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 274
    .line 275
    .line 276
    move-result-object p2

    .line 277
    iget-object p2, p2, La/yhu0;->c:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 278
    .line 279
    sget-object p3, La/ej10;->c:La/ej10;

    .line 280
    .line 281
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 285
    .line 286
    .line 287
    move-result-object p2

    .line 288
    iget-object p2, p2, La/yhu0;->e:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 289
    .line 290
    sget-object p3, La/ej10;->e:La/ej10;

    .line 291
    .line 292
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 296
    .line 297
    .line 298
    move-result-object p2

    .line 299
    iget-object p2, p2, La/yhu0;->b:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 300
    .line 301
    sget-object p3, La/ej10;->f:La/ej10;

    .line 302
    .line 303
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 307
    .line 308
    .line 309
    move-result-object p2

    .line 310
    iget-object p2, p2, La/yhu0;->d:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 311
    .line 312
    sget-object p3, La/ej10;->d:La/ej10;

    .line 313
    .line 314
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 318
    .line 319
    .line 320
    move-result-object p2

    .line 321
    iget-object p2, p2, La/yhu0;->g:Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 322
    .line 323
    sget-object p3, La/ej10;->g:La/ej10;

    .line 324
    .line 325
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result p2

    .line 336
    if-eqz p2, :cond_1

    .line 337
    .line 338
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object p2

    .line 342
    check-cast p2, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 343
    .line 344
    new-instance p3, La/l910;

    .line 345
    .line 346
    const/4 v0, 0x1

    .line 347
    invoke-direct {p3, p0, v0}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p2, p3}, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 351
    .line 352
    .line 353
    goto :goto_0

    .line 354
    :cond_1
    iget-object p1, p0, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->d:La/ej10;

    .line 355
    .line 356
    if-nez p1, :cond_2

    .line 357
    .line 358
    invoke-virtual {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->a()V

    .line 359
    .line 360
    .line 361
    return-void

    .line 362
    :cond_2
    invoke-virtual {p0, p1}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->setSelectedType(La/ej10;)V

    .line 363
    .line 364
    .line 365
    return-void
.end method

.method private final getBinding()La/yhu0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/yhu0;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/yhu0;->f:Landroid/widget/TextView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;->setBlackout(Z)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->b:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;->setEnabled(Z)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final setListener(La/fj10;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->c:La/fj10;

    .line 5
    .line 6
    return-void
.end method

.method public final setSelectedType(La/ej10;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->getBinding()La/yhu0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/yhu0;->f:Landroid/widget/TextView;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->d:La/ej10;

    .line 15
    .line 16
    iget-object p0, p0, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-ne p1, v1, :cond_0

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {v0, v1}, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;->setBlackout(Z)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v1, 0x1

    .line 46
    invoke-virtual {v0, v1}, Lorg/xplatform/core/presentation/views/cards/LuckyCardButton;->setBlackout(Z)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-void
.end method
