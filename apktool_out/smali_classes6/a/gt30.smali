.class public final La/gt30;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic f:I


# instance fields
.field public final a:Landroid/graphics/Path;

.field public b:Z

.field public c:La/o9k0;

.field public d:Landroid/animation/AnimatorSet;

.field public final e:La/a8z;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

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
    new-instance p1, Landroid/graphics/Path;

    .line 10
    .line 11
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/gt30;->a:Landroid/graphics/Path;

    .line 15
    .line 16
    sget-object p1, La/wez;->b:La/wez;

    .line 17
    .line 18
    new-instance v1, La/ha30;

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    invoke-direct {v1, p0, p0, v2}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La/gt30;->e:La/a8z;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    invoke-direct {p0}, La/gt30;->getBinding()La/ciu0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object p1, p1, La/ciu0;->c:Lorg/xplatform/bonus_games/impl/core/presentation/views/ForegroundImageView;

    .line 41
    .line 42
    const v1, 0x7f080ac7

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 46
    .line 47
    .line 48
    :cond_0
    const/4 p1, 0x1

    .line 49
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method private final getBinding()La/ciu0;
    .locals 0

    .line 1
    iget-object p0, p0, La/gt30;->e:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ciu0;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(IILa/f73;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, La/gt30;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, La/gt30;->b:Z

    .line 8
    .line 9
    iget-object v1, p0, La/gt30;->d:Landroid/animation/AnimatorSet;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->isRunning()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->end()V

    .line 20
    .line 21
    .line 22
    :cond_1
    const/4 v1, -0x1

    .line 23
    if-ne p2, v1, :cond_2

    .line 24
    .line 25
    invoke-direct {p0}, La/gt30;->getBinding()La/ciu0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object p1, p1, La/ciu0;->b:Landroid/widget/ImageView;

    .line 30
    .line 31
    const p2, 0x7f080dc5

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_2

    .line 38
    .line 39
    :cond_2
    invoke-direct {p0}, La/gt30;->getBinding()La/ciu0;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v1, v1, La/ciu0;->b:Landroid/widget/ImageView;

    .line 44
    .line 45
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 46
    .line 47
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const/4 p2, 0x2

    .line 60
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const-string p2, "/static/img/android/games/background/1xMemory/%d/redesign/icon_%d.png"

    .line 65
    .line 66
    invoke-static {v2, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    sget-object p2, La/iun;->a:La/iun;

    .line 71
    .line 72
    new-instance v2, La/tr20;

    .line 73
    .line 74
    const/16 v3, 0x17

    .line 75
    .line 76
    invoke-direct {v2, v3}, La/tr20;-><init>(B)V

    .line 77
    .line 78
    .line 79
    new-instance v3, La/tr20;

    .line 80
    .line 81
    const/16 v4, 0x18

    .line 82
    .line 83
    invoke-direct {v3, v4}, La/tr20;-><init>(B)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-static {v4}, La/sj3;->q0(Landroid/content/Context;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-nez v4, :cond_3

    .line 98
    .line 99
    goto/16 :goto_2

    .line 100
    .line 101
    :cond_3
    const v4, 0x7f080ac7

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-static {v4, v5}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    const v5, 0x7f080ac8

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-static {v5, v6}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {v6}, La/sj3;->q0(Landroid/content/Context;)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-nez v6, :cond_4

    .line 135
    .line 136
    goto/16 :goto_2

    .line 137
    .line 138
    :cond_4
    sget-object v6, La/u0d;->a:Ljava/util/List;

    .line 139
    .line 140
    invoke-static {p1}, La/u0d;->c(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-eqz v6, :cond_5

    .line 145
    .line 146
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_2

    .line 150
    .line 151
    :cond_5
    new-instance v6, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 154
    .line 155
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    const/4 v8, 0x0

    .line 163
    if-nez v7, :cond_6

    .line 164
    .line 165
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_6
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 170
    .line 171
    invoke-static {p1, v7, v8}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    if-nez v7, :cond_9

    .line 176
    .line 177
    const-string v7, "https://"

    .line 178
    .line 179
    invoke-static {p1, v7, v8}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-eqz v7, :cond_7

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_7
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    const/16 v9, 0x2f

    .line 191
    .line 192
    if-lez v7, :cond_8

    .line 193
    .line 194
    const-string v7, "/"

    .line 195
    .line 196
    invoke-static {v6, v7}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    if-nez v7, :cond_8

    .line 201
    .line 202
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    :cond_8
    new-array v7, v0, [C

    .line 206
    .line 207
    aput-char v9, v7, v8

    .line 208
    .line 209
    invoke-static {p1, v7}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_9
    :goto_0
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    :goto_1
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-static {v6}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    new-instance v7, La/k1x;

    .line 236
    .line 237
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    invoke-direct {v7, v9}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 242
    .line 243
    .line 244
    iput-object p1, v7, La/k1x;->c:Ljava/lang/Object;

    .line 245
    .line 246
    invoke-static {v7, v1}, La/t1x;->h(La/k1x;Landroid/widget/ImageView;)V

    .line 247
    .line 248
    .line 249
    invoke-static {v7, v8}, La/t1x;->a(La/k1x;Z)V

    .line 250
    .line 251
    .line 252
    invoke-static {p1}, La/u0d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    iput-object v8, v7, La/k1x;->i:Ljava/lang/String;

    .line 257
    .line 258
    invoke-static {p1}, La/u0d;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    iput-object p1, v7, La/k1x;->f:Ljava/lang/String;

    .line 263
    .line 264
    invoke-static {v7, v4}, La/t1x;->g(La/k1x;Landroid/graphics/drawable/Drawable;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v7, v5}, La/t1x;->d(La/k1x;Landroid/graphics/drawable/Drawable;)V

    .line 268
    .line 269
    .line 270
    sget-object p1, La/ezw;->a:La/ezw;

    .line 271
    .line 272
    invoke-static {p1}, La/dtb;->O(La/hzw;)La/prs0;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    iget-object v4, p1, La/prs0;->a:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v4, La/vi9;

    .line 279
    .line 280
    iget-object v5, p1, La/prs0;->b:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v5, La/vi9;

    .line 283
    .line 284
    iget-object p1, p1, La/prs0;->c:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast p1, La/vi9;

    .line 287
    .line 288
    iput-object v4, v7, La/k1x;->n:La/vi9;

    .line 289
    .line 290
    iput-object v5, v7, La/k1x;->m:La/vi9;

    .line 291
    .line 292
    iput-object p1, v7, La/k1x;->o:La/vi9;

    .line 293
    .line 294
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-static {p1, p2}, La/dtb;->P(Landroid/content/Context;Ljava/util/List;)Ljava/util/ArrayList;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-static {v7, p1}, La/q1x;->b(La/k1x;Ljava/util/List;)V

    .line 306
    .line 307
    .line 308
    new-instance p1, La/jw20;

    .line 309
    .line 310
    invoke-direct {p1, v3, v2, v1}, La/jw20;-><init>(La/tr20;La/tr20;Landroid/widget/ImageView;)V

    .line 311
    .line 312
    .line 313
    iput-object p1, v7, La/k1x;->e:La/n1x;

    .line 314
    .line 315
    invoke-static {v7, v0}, La/t1x;->b(La/k1x;Z)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v7}, La/k1x;->a()La/o1x;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-virtual {v6, p1}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 323
    .line 324
    .line 325
    :goto_2
    new-instance p1, La/ukq;

    .line 326
    .line 327
    invoke-direct {p0}, La/gt30;->getBinding()La/ciu0;

    .line 328
    .line 329
    .line 330
    move-result-object p2

    .line 331
    iget-object p2, p2, La/ciu0;->c:Lorg/xplatform/bonus_games/impl/core/presentation/views/ForegroundImageView;

    .line 332
    .line 333
    invoke-direct {p0}, La/gt30;->getBinding()La/ciu0;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    iget-object v0, v0, La/ciu0;->b:Landroid/widget/ImageView;

    .line 338
    .line 339
    invoke-direct {p1, p2, v0}, La/ukq;-><init>(Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p1, p3}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {p0, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 346
    .line 347
    .line 348
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-boolean v0, p0, La/gt30;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, La/gt30;->b:Z

    .line 8
    .line 9
    iget-object v1, p0, La/gt30;->d:Landroid/animation/AnimatorSet;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->isRunning()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->end()V

    .line 20
    .line 21
    .line 22
    :cond_1
    new-instance v1, La/ukq;

    .line 23
    .line 24
    invoke-direct {p0}, La/gt30;->getBinding()La/ciu0;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v2, v2, La/ciu0;->b:Landroid/widget/ImageView;

    .line 29
    .line 30
    invoke-direct {p0}, La/gt30;->getBinding()La/ciu0;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v3, v3, La/ciu0;->c:Lorg/xplatform/bonus_games/impl/core/presentation/views/ForegroundImageView;

    .line 35
    .line 36
    invoke-direct {v1, v2, v3}, La/ukq;-><init>(Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, La/f73;

    .line 43
    .line 44
    new-instance v3, La/ft30;

    .line 45
    .line 46
    invoke-direct {v3, p0, v0}, La/ft30;-><init>(La/gt30;B)V

    .line 47
    .line 48
    .line 49
    new-instance v4, La/ft30;

    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    invoke-direct {v4, p0, v5}, La/ft30;-><init>(La/gt30;B)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v2, v3, v4, v0}, La/f73;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/gt30;->a:Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    int-to-float p1, p1

    .line 5
    const p3, 0x3dcccccd    # 0.1f

    .line 6
    .line 7
    .line 8
    mul-float/2addr p3, p1

    .line 9
    iget-object p0, p0, La/gt30;->a:Landroid/graphics/Path;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/graphics/Path;->reset()V

    .line 12
    .line 13
    .line 14
    new-instance p4, Landroid/graphics/RectF;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    int-to-float p2, p2

    .line 18
    invoke-direct {p4, v0, v0, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 22
    .line 23
    invoke-virtual {p0, p4, p3, p3, p1}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Path$Direction;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final setListener(La/o9k0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/gt30;->c:La/o9k0;

    .line 5
    .line 6
    return-void
.end method
