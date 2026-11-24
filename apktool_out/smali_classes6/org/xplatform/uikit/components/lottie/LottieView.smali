.class public final Lorg/xplatform/uikit/components/lottie/LottieView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic o1:I


# instance fields
.field public final A:La/a8z;

.field public final B:Landroid/animation/ValueAnimator;

.field public final f1:Landroid/animation/ValueAnimator;

.field public final g1:Z

.field public final h1:Z

.field public final i1:Z

.field public final j1:F

.field public k1:Ljava/lang/String;

.field public l1:Ljava/lang/Integer;

.field public m1:Ljava/lang/Integer;

.field public n1:La/c4m0;

.field public final q:Lcom/airbnb/lottie/LottieAnimationView;

.field public final r:Landroid/widget/TextView;

.field public final s:Landroid/widget/TextView;

.field public final t:Lorg/xplatform/uikit/components/buttons/DsButton;

.field public final u:La/n0o0;

.field public final v:I

.field public final w:La/n0o0;

.field public final x:I

.field public final y:La/z0i;

.field public final z:La/vb3;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 358
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 357
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

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
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->getLayoutId()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {p1, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    const v1, 0x7f0a09da

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast v1, Lcom/airbnb/lottie/LottieAnimationView;

    .line 31
    .line 32
    iput-object v1, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->q:Lcom/airbnb/lottie/LottieAnimationView;

    .line 33
    .line 34
    const v2, 0x7f0a117a

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    check-cast v2, Landroid/widget/TextView;

    .line 45
    .line 46
    iput-object v2, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->r:Landroid/widget/TextView;

    .line 47
    .line 48
    const v2, 0x7f0a10c4

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    check-cast v2, Landroid/widget/TextView;

    .line 59
    .line 60
    iput-object v2, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->s:Landroid/widget/TextView;

    .line 61
    .line 62
    const v2, 0x7f0a00e6

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    check-cast v2, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 73
    .line 74
    iput-object v2, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->t:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 75
    .line 76
    new-instance v2, La/mbz;

    .line 77
    .line 78
    const/16 v3, 0xf

    .line 79
    .line 80
    invoke-direct {v2, p0, p1, v3}, La/mbz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    iput-object v2, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->u:La/n0o0;

    .line 88
    .line 89
    const/16 v2, 0x60

    .line 90
    .line 91
    invoke-static {v2}, La/f7k;->M(I)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    iput v2, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->v:I

    .line 96
    .line 97
    new-instance v3, La/rx00;

    .line 98
    .line 99
    const/4 v4, 0x5

    .line 100
    invoke-direct {v3, p0, v4}, La/rx00;-><init>(Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {v3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    iput-object v3, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->w:La/n0o0;

    .line 108
    .line 109
    const/16 v3, 0x10

    .line 110
    .line 111
    invoke-static {v3}, La/f7k;->M(I)I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    iput v3, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->x:I

    .line 116
    .line 117
    new-instance v3, La/z0i;

    .line 118
    .line 119
    invoke-direct {v3, p0, v0}, La/z0i;-><init>(Ljava/lang/Object;B)V

    .line 120
    .line 121
    .line 122
    iput-object v3, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->y:La/z0i;

    .line 123
    .line 124
    new-instance v3, La/vb3;

    .line 125
    .line 126
    invoke-direct {v3, p0, v0}, La/vb3;-><init>(Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    iput-object v3, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->z:La/vb3;

    .line 130
    .line 131
    new-instance v3, La/t010;

    .line 132
    .line 133
    const/16 v5, 0x18

    .line 134
    .line 135
    invoke-direct {v3, v5}, La/t010;-><init>(B)V

    .line 136
    .line 137
    .line 138
    sget-object v5, La/wez;->b:La/wez;

    .line 139
    .line 140
    invoke-static {v5, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    iput-object v3, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->A:La/a8z;

    .line 145
    .line 146
    new-instance v3, Landroid/animation/ValueAnimator;

    .line 147
    .line 148
    invoke-direct {v3}, Landroid/animation/ValueAnimator;-><init>()V

    .line 149
    .line 150
    .line 151
    new-instance v5, La/vb10;

    .line 152
    .line 153
    invoke-direct {v5, p0, p3}, La/vb10;-><init>(Lorg/xplatform/uikit/components/lottie/LottieView;B)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 157
    .line 158
    .line 159
    iput-object v3, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->B:Landroid/animation/ValueAnimator;

    .line 160
    .line 161
    new-instance v3, Landroid/animation/ValueAnimator;

    .line 162
    .line 163
    invoke-direct {v3}, Landroid/animation/ValueAnimator;-><init>()V

    .line 164
    .line 165
    .line 166
    new-instance v5, La/vb10;

    .line 167
    .line 168
    const/4 v6, 0x1

    .line 169
    invoke-direct {v5, p0, v6}, La/vb10;-><init>(Lorg/xplatform/uikit/components/lottie/LottieView;B)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 173
    .line 174
    .line 175
    iput-object v3, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->f1:Landroid/animation/ValueAnimator;

    .line 176
    .line 177
    iput-boolean v6, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->i1:Z

    .line 178
    .line 179
    const-string v3, ""

    .line 180
    .line 181
    iput-object v3, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->k1:Ljava/lang/String;

    .line 182
    .line 183
    sget-object v3, La/bqd0;->Q:[I

    .line 184
    .line 185
    invoke-virtual {p1, p2, v3, p3, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    const/4 v3, 0x3

    .line 190
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-static {p2, p1, v3}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-direct {p0, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setLottieAnimation(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    const/4 v3, 0x6

    .line 206
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-static {p2, p1, v3}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-virtual {p0, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setText(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-static {p2, v3}, La/ktt0;->l(Landroid/content/res/TypedArray;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    const v5, 0x7f040b0b

    .line 230
    .line 231
    .line 232
    if-eqz v3, :cond_1

    .line 233
    .line 234
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    goto :goto_0

    .line 239
    :cond_1
    invoke-static {v5, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    :goto_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    invoke-static {p2, v4}, La/ktt0;->l(Landroid/content/res/TypedArray;Ljava/lang/Integer;)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    if-eqz v4, :cond_2

    .line 252
    .line 253
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    goto :goto_1

    .line 258
    :cond_2
    invoke-static {v5, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    :goto_1
    invoke-virtual {p0, p1, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->B(II)V

    .line 263
    .line 264
    .line 265
    iget-boolean p1, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->g1:Z

    .line 266
    .line 267
    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->g1:Z

    .line 272
    .line 273
    invoke-virtual {p2, p3, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    iput-boolean v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->i1:Z

    .line 278
    .line 279
    const/4 v0, 0x4

    .line 280
    iget-boolean v3, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->h1:Z

    .line 281
    .line 282
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    iput-boolean v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->h1:Z

    .line 287
    .line 288
    const/4 v0, 0x7

    .line 289
    const/high16 v3, 0x3f000000    # 0.5f

    .line 290
    .line 291
    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    iput v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->j1:F

    .line 296
    .line 297
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 298
    .line 299
    .line 300
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 301
    .line 302
    const/16 v0, 0x1a

    .line 303
    .line 304
    if-eq p2, v0, :cond_4

    .line 305
    .line 306
    const/16 v0, 0x1b

    .line 307
    .line 308
    if-ne p2, v0, :cond_3

    .line 309
    .line 310
    goto :goto_2

    .line 311
    :cond_3
    sget-object p2, La/ijf0;->a:La/ijf0;

    .line 312
    .line 313
    goto :goto_3

    .line 314
    :cond_4
    :goto_2
    sget-object p2, La/ijf0;->c:La/ijf0;

    .line 315
    .line 316
    :goto_3
    invoke-virtual {v1, p2}, Lcom/airbnb/lottie/LottieAnimationView;->setRenderMode(La/ijf0;)V

    .line 317
    .line 318
    .line 319
    if-eqz p1, :cond_7

    .line 320
    .line 321
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 322
    .line 323
    .line 324
    move-result p1

    .line 325
    if-eqz p1, :cond_6

    .line 326
    .line 327
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 328
    .line 329
    .line 330
    move-result p1

    .line 331
    if-nez p1, :cond_6

    .line 332
    .line 333
    invoke-virtual {p0, v6}, Lorg/xplatform/uikit/components/lottie/LottieView;->C(Z)V

    .line 334
    .line 335
    .line 336
    invoke-direct {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->getMaxLottieHeight()I

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    if-ge p1, v2, :cond_5

    .line 341
    .line 342
    goto :goto_4

    .line 343
    :cond_5
    move v2, p1

    .line 344
    :goto_4
    invoke-virtual {p0, v2, p3}, Lorg/xplatform/uikit/components/lottie/LottieView;->D(IZ)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :cond_6
    new-instance p1, La/yb10;

    .line 349
    .line 350
    invoke-direct {p1, p0, v6}, La/yb10;-><init>(Lorg/xplatform/uikit/components/lottie/LottieView;B)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 354
    .line 355
    .line 356
    :cond_7
    return-void
.end method

.method public static A(Landroid/content/Context;)Landroid/view/Window;
    .locals 1

    .line 1
    instance-of v0, p0, Landroid/app/Activity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/app/Activity;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    return-object v0

    .line 20
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast p0, Landroid/content/ContextWrapper;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->A(Landroid/content/Context;)Landroid/view/Window;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method private final getLayoutId()I
    .locals 0

    const p0, 0x7f0d048e

    return p0
.end method

.method private final getMainScope()La/vne;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->A:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vne;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getMaxLottieHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->w:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getNavBarHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->u:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getSnackHeight()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x7f0a0e2d

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method private final getYLocation()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    aget p0, v0, p0

    .line 9
    .line 10
    return p0
.end method

.method private final setButtonText(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->t:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 v0, 0x0

    .line 22
    if-lez p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, v0

    .line 27
    :goto_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/16 v0, 0x8

    .line 31
    .line 32
    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private final setLottieAnimation(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "lottie"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p1, v0, v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->k1:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iput-object p1, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->k1:Ljava/lang/String;

    .line 22
    .line 23
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->q:Lcom/airbnb/lottie/LottieAnimationView;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    iget-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->h:La/bb10;

    .line 35
    .line 36
    invoke-virtual {p1}, La/bb10;->i()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->h()V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public static final synthetic u(Lorg/xplatform/uikit/components/lottie/LottieView;)I
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->getMaxLottieHeight()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final y(Lkotlin/jvm/functions/Function0;Lorg/xplatform/uikit/components/lottie/LottieView;La/ra10;Landroid/view/View;)Lkotlin/Unit;
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget-wide p2, p2, La/ra10;->e:J

    .line 8
    .line 9
    iget-object p0, p1, Lorg/xplatform/uikit/components/lottie/LottieView;->s:Landroid/widget/TextView;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/high16 v1, 0x3f800000    # 1.0f

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p1, Lorg/xplatform/uikit/components/lottie/LottieView;->n1:La/c4m0;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, La/pby;->isActive()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-ne p0, v1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p0, 0x4

    .line 37
    invoke-static {p0, p2, p3}, La/e3c;->t(IJ)La/vsg0;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    new-instance p3, La/wb10;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-direct {p3, p1, v2, v1}, La/wb10;-><init>(Lorg/xplatform/uikit/components/lottie/LottieView;La/yje;B)V

    .line 45
    .line 46
    .line 47
    new-instance v3, La/fnq;

    .line 48
    .line 49
    invoke-direct {v3, p2, p3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 50
    .line 51
    .line 52
    new-instance p2, La/xb10;

    .line 53
    .line 54
    invoke-direct {p2, p1, v2, v1}, La/xb10;-><init>(Lorg/xplatform/uikit/components/lottie/LottieView;La/yje;B)V

    .line 55
    .line 56
    .line 57
    new-instance p3, La/fnq;

    .line 58
    .line 59
    invoke-direct {p3, v3, p2, p0}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 60
    .line 61
    .line 62
    new-instance p0, La/gbv;

    .line 63
    .line 64
    const/4 p2, 0x5

    .line 65
    invoke-direct {p0, p1, v2, p2}, La/gbv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 66
    .line 67
    .line 68
    new-instance p2, La/dnq;

    .line 69
    .line 70
    invoke-direct {p2, p3, p0, v0}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p1}, Lorg/xplatform/uikit/components/lottie/LottieView;->getMainScope()La/vne;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {p2, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iput-object p0, p1, Lorg/xplatform/uikit/components/lottie/LottieView;->n1:La/c4m0;

    .line 82
    .line 83
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0
.end method

.method public static z(Landroid/view/ViewParent;)Lcom/google/android/material/appbar/AppBarLayout;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    instance-of v1, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 10
    .line 11
    :cond_0
    if-eqz v0, :cond_2

    .line 12
    .line 13
    new-instance v1, La/ihu0;

    .line 14
    .line 15
    invoke-direct {v1, v0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, La/j9x;->B:La/j9x;

    .line 19
    .line 20
    invoke-static {v1, v0}, La/pgi0;->h(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, La/pgi0;->j(Lkotlin/sequences/Sequence;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-object v0

    .line 34
    :cond_2
    :goto_0
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->z(Landroid/view/ViewParent;)Lcom/google/android/material/appbar/AppBarLayout;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_3
    return-object v0
.end method


# virtual methods
.method public final B(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->r:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->s:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final C(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->t:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->r:Landroid/widget/TextView;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/high16 v3, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iget-boolean v4, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->i1:Z

    .line 9
    .line 10
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->q:Lcom/airbnb/lottie/LottieAnimationView;

    .line 11
    .line 12
    if-eqz v4, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    move v2, v3

    .line 21
    :cond_0
    invoke-virtual {p0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    if-eqz p1, :cond_2

    .line 44
    .line 45
    move v2, v3

    .line 46
    :cond_2
    invoke-virtual {p0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final D(IZ)V
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const-wide/16 v0, 0x96

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    :goto_0
    iget-object p2, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->f1:Landroid/animation/ValueAnimator;

    .line 9
    .line 10
    invoke-virtual {p2, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->q:Lcom/airbnb/lottie/LottieAnimationView;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    filled-new-array {p0, p1}, [I

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p2, p0}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->start()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final E()V
    .locals 12

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->getYLocation()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-direct {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->getSnackHeight()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-boolean v3, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->h1:Z

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v4, Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast v5, Landroid/view/ViewGroup;

    .line 39
    .line 40
    invoke-virtual {v5, v4}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 41
    .line 42
    .line 43
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 44
    .line 45
    invoke-direct {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->getNavBarHeight()I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    sub-int v5, v1, v5

    .line 50
    .line 51
    sub-int/2addr v5, v2

    .line 52
    if-le v4, v5, :cond_1

    .line 53
    .line 54
    move v4, v5

    .line 55
    :cond_1
    sub-int v2, v4, v0

    .line 56
    .line 57
    :goto_0
    iget-object v4, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->r:Landroid/widget/TextView;

    .line 58
    .line 59
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    iget-object v5, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->t:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 64
    .line 65
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    add-int/2addr v5, v4

    .line 70
    iget v4, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->x:I

    .line 71
    .line 72
    add-int/2addr v5, v4

    .line 73
    iget-object v6, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->l1:Ljava/lang/Integer;

    .line 74
    .line 75
    if-eqz v3, :cond_4

    .line 76
    .line 77
    if-nez v6, :cond_2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-ne v3, v2, :cond_6

    .line 85
    .line 86
    iget-object v3, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->m1:Ljava/lang/Integer;

    .line 87
    .line 88
    if-nez v3, :cond_3

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-ne v3, v5, :cond_6

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    if-nez v6, :cond_5

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-ne v3, v2, :cond_6

    .line 106
    .line 107
    :goto_1
    return-void

    .line 108
    :cond_6
    :goto_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iput-object v3, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->m1:Ljava/lang/Integer;

    .line 113
    .line 114
    iget v3, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->v:I

    .line 115
    .line 116
    add-int v6, v3, v5

    .line 117
    .line 118
    invoke-direct {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->getMaxLottieHeight()I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    add-int/2addr v7, v5

    .line 123
    const/4 v8, 0x1

    .line 124
    const/4 v9, 0x0

    .line 125
    if-ge v6, v2, :cond_7

    .line 126
    .line 127
    move v10, v8

    .line 128
    goto :goto_3

    .line 129
    :cond_7
    move v10, v9

    .line 130
    :goto_3
    sub-int v5, v2, v5

    .line 131
    .line 132
    invoke-direct {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->getMaxLottieHeight()I

    .line 133
    .line 134
    .line 135
    move-result v11

    .line 136
    if-le v5, v11, :cond_8

    .line 137
    .line 138
    move v5, v11

    .line 139
    :cond_8
    if-ge v5, v3, :cond_9

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_9
    move v3, v5

    .line 143
    :goto_4
    iget-object v5, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->l1:Ljava/lang/Integer;

    .line 144
    .line 145
    if-nez v5, :cond_a

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_a
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-eqz v5, :cond_b

    .line 153
    .line 154
    :goto_5
    move v5, v8

    .line 155
    goto :goto_6

    .line 156
    :cond_b
    move v5, v9

    .line 157
    :goto_6
    invoke-virtual {p0, v3, v5}, Lorg/xplatform/uikit/components/lottie/LottieView;->D(IZ)V

    .line 158
    .line 159
    .line 160
    div-int/lit8 v1, v1, 0x2

    .line 161
    .line 162
    sub-int/2addr v1, v0

    .line 163
    int-to-float v0, v1

    .line 164
    int-to-float v1, v7

    .line 165
    const/high16 v3, 0x3f800000    # 1.0f

    .line 166
    .line 167
    iget v5, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->j1:F

    .line 168
    .line 169
    sub-float/2addr v3, v5

    .line 170
    mul-float/2addr v3, v1

    .line 171
    sub-float/2addr v0, v3

    .line 172
    float-to-int v0, v0

    .line 173
    sub-int v1, v2, v7

    .line 174
    .line 175
    if-eqz v10, :cond_c

    .line 176
    .line 177
    move v3, v9

    .line 178
    goto :goto_7

    .line 179
    :cond_c
    sub-int v3, v2, v6

    .line 180
    .line 181
    add-int/2addr v3, v4

    .line 182
    :goto_7
    if-le v0, v1, :cond_d

    .line 183
    .line 184
    move v0, v1

    .line 185
    :cond_d
    if-ge v0, v3, :cond_e

    .line 186
    .line 187
    goto :goto_8

    .line 188
    :cond_e
    move v3, v0

    .line 189
    :goto_8
    iget-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->l1:Ljava/lang/Integer;

    .line 190
    .line 191
    if-nez v0, :cond_f

    .line 192
    .line 193
    goto :goto_9

    .line 194
    :cond_f
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_10

    .line 199
    .line 200
    goto :goto_9

    .line 201
    :cond_10
    move v8, v9

    .line 202
    :goto_9
    if-eqz v8, :cond_11

    .line 203
    .line 204
    const-wide/16 v0, 0x96

    .line 205
    .line 206
    goto :goto_a

    .line 207
    :cond_11
    const-wide/16 v0, 0x0

    .line 208
    .line 209
    :goto_a
    iget-object v4, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->B:Landroid/animation/ValueAnimator;

    .line 210
    .line 211
    invoke-virtual {v4, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 212
    .line 213
    .line 214
    iget-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->q:Lcom/airbnb/lottie/LottieAnimationView;

    .line 215
    .line 216
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 221
    .line 222
    if-eqz v1, :cond_12

    .line 223
    .line 224
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 225
    .line 226
    goto :goto_b

    .line 227
    :cond_12
    const/4 v0, 0x0

    .line 228
    :goto_b
    if-eqz v0, :cond_13

    .line 229
    .line 230
    iget v9, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 231
    .line 232
    :cond_13
    filled-new-array {v9, v3}, [I

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v4, v0}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->start()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v10}, Lorg/xplatform/uikit/components/lottie/LottieView;->C(Z)V

    .line 243
    .line 244
    .line 245
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    iput-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->l1:Ljava/lang/Integer;

    .line 250
    .line 251
    return-void
.end method

.method public final F()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->g1:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->l1:Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    check-cast v0, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->E()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    new-instance v0, La/yb10;

    .line 47
    .line 48
    const/4 v1, 0x2

    .line 49
    invoke-direct {v0, p0, v1}, La/yb10;-><init>(Lorg/xplatform/uikit/components/lottie/LottieView;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->y:La/z0i;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->z(Landroid/view/ViewParent;)Lcom/google/android/material/appbar/AppBarLayout;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->z:La/vb3;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lcom/google/android/material/appbar/AppBarLayout;->a(La/ub3;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->y:La/z0i;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->z(Landroid/view/ViewParent;)Lcom/google/android/material/appbar/AppBarLayout;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->z:La/vb3;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/AppBarLayout;->f(La/ub3;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->n1:La/c4m0;

    .line 30
    .line 31
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 32
    .line 33
    .line 34
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->m1:Ljava/lang/Integer;

    .line 5
    .line 6
    iget-object p2, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->r:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    iget-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->t:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/2addr v0, p2

    .line 19
    iget p2, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->x:I

    .line 20
    .line 21
    add-int/2addr v0, p2

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eq p1, v0, :cond_2

    .line 30
    .line 31
    :goto_0
    iget-boolean p1, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->h1:Z

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->E()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    new-instance p1, La/yb10;

    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    invoke-direct {p1, p0, p2}, La/yb10;-><init>(Lorg/xplatform/uikit/components/lottie/LottieView;B)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->l1:Ljava/lang/Integer;

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_1
    iput-object p1, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->l1:Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->F()V

    .line 18
    .line 19
    .line 20
    :cond_2
    :goto_0
    return-void
.end method

.method public final setButtonClick(Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/r3w;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p1, v1}, La/r3w;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->t:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 11
    .line 12
    invoke-static {p0, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setButtonHorizontalPadding(I)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->t:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0, p1, v0, p1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setButtonPaddingHorizontal(I)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->t:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0, p1, v0, p1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final setButtonWidthLayoutParams(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->t:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 16
    .line 17
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setJson(I)V
    .locals 1
    .annotation runtime La/lbk;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, Lorg/xplatform/uikit/components/lottie/LottieView;->setLottieAnimation(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setText(I)V
    .locals 1

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/lottie/LottieView;->setText(Ljava/lang/String;)V

    return-void
.end method

.method public final setText(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->r:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

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
    move p1, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 19
    :goto_1
    if-nez p1, :cond_2

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :cond_2
    const/16 v0, 0x8

    .line 23
    .line 24
    :goto_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setVisibility(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->q:Lcom/airbnb/lottie/LottieAnimationView;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->h:La/bb10;

    .line 15
    .line 16
    invoke-virtual {p1}, La/bb10;->i()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->h()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final v(La/ra10;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->n1:La/c4m0;

    .line 5
    .line 6
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->l1:Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget v1, p1, La/ra10;->a:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-direct {p0, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->setLottieAnimation(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget v0, p1, La/ra10;->b:I

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->setText(I)V

    .line 32
    .line 33
    .line 34
    iget v0, p1, La/ra10;->c:I

    .line 35
    .line 36
    invoke-direct {p0, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->setButtonText(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p1, La/ra10;->d:Lkotlin/jvm/functions/Function0;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/lottie/LottieView;->setButtonClick(Lkotlin/jvm/functions/Function0;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method

.method public final w(La/ra10;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->l1:Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p1, La/ra10;->a:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {p0, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->setLottieAnimation(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget v0, p1, La/ra10;->b:I

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->setText(I)V

    .line 27
    .line 28
    .line 29
    iget v0, p1, La/ra10;->c:I

    .line 30
    .line 31
    invoke-direct {p0, v0}, Lorg/xplatform/uikit/components/lottie/LottieView;->setButtonText(I)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p1, La/ra10;->d:Lkotlin/jvm/functions/Function0;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    new-instance v1, La/k9v;

    .line 39
    .line 40
    const/16 v2, 0x16

    .line 41
    .line 42
    invoke-direct {v1, v0, p0, p1, v2}, La/k9v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->t:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 46
    .line 47
    invoke-static {p0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
.end method

.method public final x(La/ra10;Lkotlin/jvm/functions/Function0;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->s:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/high16 v2, 0x3f800000    # 1.0f

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->n1:La/c4m0;

    .line 23
    .line 24
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 25
    .line 26
    .line 27
    iget-wide v2, p1, La/ra10;->e:J

    .line 28
    .line 29
    const/4 p1, 0x4

    .line 30
    invoke-static {p1, v2, v3}, La/e3c;->t(IJ)La/vsg0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v2, La/wb10;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {v2, p0, v3, v1}, La/wb10;-><init>(Lorg/xplatform/uikit/components/lottie/LottieView;La/yje;B)V

    .line 38
    .line 39
    .line 40
    new-instance v4, La/fnq;

    .line 41
    .line 42
    invoke-direct {v4, v0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, La/xb10;

    .line 46
    .line 47
    invoke-direct {v0, p0, v3, v1}, La/xb10;-><init>(Lorg/xplatform/uikit/components/lottie/LottieView;La/yje;B)V

    .line 48
    .line 49
    .line 50
    new-instance v2, La/fnq;

    .line 51
    .line 52
    invoke-direct {v2, v4, v0, p1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 53
    .line 54
    .line 55
    new-instance p1, La/qos;

    .line 56
    .line 57
    invoke-direct {p1, p0, p2, v3}, La/qos;-><init>(Lorg/xplatform/uikit/components/lottie/LottieView;Lkotlin/jvm/functions/Function0;La/yje;)V

    .line 58
    .line 59
    .line 60
    new-instance p2, La/dnq;

    .line 61
    .line 62
    invoke-direct {p2, v2, p1, v1}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p0}, Lorg/xplatform/uikit/components/lottie/LottieView;->getMainScope()La/vne;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {p2, p1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lorg/xplatform/uikit/components/lottie/LottieView;->n1:La/c4m0;

    .line 74
    .line 75
    return-void
.end method
