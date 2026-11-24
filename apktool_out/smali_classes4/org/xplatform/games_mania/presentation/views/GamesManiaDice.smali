.class public final Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic e:I


# instance fields
.field public a:I

.field public b:Landroid/animation/AnimatorSet;

.field public c:Lkotlin/jvm/functions/Function1;

.field public d:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    new-instance p1, La/vls;

    .line 14
    .line 15
    const/16 p2, 0xb

    .line 16
    .line 17
    invoke-direct {p1, p2}, La/vls;-><init>(B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->c:Lkotlin/jvm/functions/Function1;

    .line 21
    .line 22
    new-instance p1, La/e6t;

    .line 23
    .line 24
    const/4 p2, 0x7

    .line 25
    invoke-direct {p1, p2}, La/e6t;-><init>(B)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->d:Lkotlin/jvm/functions/Function0;

    .line 29
    .line 30
    return-void
.end method

.method private final getRandomRotation()F
    .locals 2

    .line 1
    sget-object p0, La/f1e0;->a:La/e1e0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/f1e0;->b:La/k4;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    const/16 v1, 0x168

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, La/f1e0;->d(II)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    int-to-float p0, p0

    .line 16
    return p0
.end method

.method private final getRandomX()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x41000000    # 8.0f

    .line 6
    .line 7
    add-float/2addr v0, v1

    .line 8
    float-to-int v0, v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    int-to-float v3, v3

    .line 18
    add-float/2addr v2, v3

    .line 19
    iget p0, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->a:I

    .line 20
    .line 21
    int-to-float p0, p0

    .line 22
    sub-float/2addr v2, p0

    .line 23
    sub-float/2addr v2, v1

    .line 24
    float-to-int p0, v2

    .line 25
    sget-object v1, La/f1e0;->a:La/e1e0;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object v1, La/f1e0;->b:La/k4;

    .line 31
    .line 32
    invoke-virtual {v1, v0, p0}, La/f1e0;->d(II)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0
.end method

.method private final getRandomY()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x41000000    # 8.0f

    .line 6
    .line 7
    add-float/2addr v0, v1

    .line 8
    float-to-int v0, v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    int-to-float v3, v3

    .line 18
    add-float/2addr v2, v3

    .line 19
    iget p0, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->a:I

    .line 20
    .line 21
    int-to-float p0, p0

    .line 22
    sub-float/2addr v2, p0

    .line 23
    sub-float/2addr v2, v1

    .line 24
    float-to-int p0, v2

    .line 25
    sget-object v1, La/f1e0;->a:La/e1e0;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object v1, La/f1e0;->b:La/k4;

    .line 31
    .line 32
    invoke-virtual {v1, v0, p0}, La/f1e0;->d(II)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0
.end method


# virtual methods
.method public final a(JLjava/util/List;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 8
    .line 9
    .line 10
    iget-object v4, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->c:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    invoke-interface {v4, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v5, 0x0

    .line 20
    move v6, v5

    .line 21
    :goto_0
    if-ge v6, v4, :cond_2

    .line 22
    .line 23
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    check-cast v7, La/j7t;

    .line 28
    .line 29
    iget-object v8, v7, La/j7t;->a:Landroid/graphics/Point;

    .line 30
    .line 31
    iget v9, v7, La/j7t;->b:I

    .line 32
    .line 33
    iget v7, v7, La/j7t;->c:F

    .line 34
    .line 35
    new-instance v10, Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    iget v11, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->a:I

    .line 38
    .line 39
    invoke-direct {v10, v11, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 40
    .line 41
    .line 42
    new-instance v11, La/akk;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v12

    .line 48
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const/4 v13, 0x0

    .line 52
    invoke-direct {v11, v12, v13, v5}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 53
    .line 54
    .line 55
    sget-object v12, La/iun;->a:La/iun;

    .line 56
    .line 57
    iput-object v12, v11, La/akk;->d:Ljava/util/List;

    .line 58
    .line 59
    const/4 v12, 0x1

    .line 60
    iput v12, v11, La/akk;->e:I

    .line 61
    .line 62
    invoke-virtual {v11}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object v14

    .line 66
    const v15, 0x7f080476

    .line 67
    .line 68
    .line 69
    invoke-static {v15, v14}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 70
    .line 71
    .line 72
    move-result-object v14

    .line 73
    invoke-virtual {v11, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v11, v12}, La/akk;->setDealerDice(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v11, v9}, La/akk;->setN(I)V

    .line 80
    .line 81
    .line 82
    const-wide/16 v14, 0x0

    .line 83
    .line 84
    cmp-long v9, v1, v14

    .line 85
    .line 86
    if-eqz v9, :cond_1

    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-virtual {v9}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    invoke-virtual {v9}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-ne v9, v12, :cond_0

    .line 108
    .line 109
    const/4 v9, -0x1

    .line 110
    goto :goto_1

    .line 111
    :cond_0
    move v9, v12

    .line 112
    :goto_1
    new-instance v14, Landroid/animation/AnimatorSet;

    .line 113
    .line 114
    invoke-direct {v14}, Landroid/animation/AnimatorSet;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object v14, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->b:Landroid/animation/AnimatorSet;

    .line 118
    .line 119
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    mul-int/2addr v15, v9

    .line 124
    int-to-float v9, v15

    .line 125
    iget v15, v8, Landroid/graphics/Point;->x:I

    .line 126
    .line 127
    int-to-float v15, v15

    .line 128
    move/from16 v16, v5

    .line 129
    .line 130
    const/4 v5, 0x2

    .line 131
    new-array v13, v5, [F

    .line 132
    .line 133
    aput v9, v13, v16

    .line 134
    .line 135
    aput v15, v13, v12

    .line 136
    .line 137
    const-string v9, "translationX"

    .line 138
    .line 139
    invoke-static {v11, v9, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 140
    .line 141
    .line 142
    move-result-object v9

    .line 143
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v14, v9}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 151
    .line 152
    .line 153
    move-result v13

    .line 154
    div-int/2addr v13, v5

    .line 155
    int-to-float v13, v13

    .line 156
    iget v8, v8, Landroid/graphics/Point;->y:I

    .line 157
    .line 158
    int-to-float v8, v8

    .line 159
    new-array v15, v5, [F

    .line 160
    .line 161
    aput v13, v15, v16

    .line 162
    .line 163
    aput v8, v15, v12

    .line 164
    .line 165
    const-string v8, "translationY"

    .line 166
    .line 167
    invoke-static {v11, v8, v15}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v9, v8}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    new-array v5, v5, [F

    .line 179
    .line 180
    const/4 v9, 0x0

    .line 181
    aput v9, v5, v16

    .line 182
    .line 183
    aput v7, v5, v12

    .line 184
    .line 185
    const-string v7, "rotation"

    .line 186
    .line 187
    invoke-static {v11, v7, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v8, v5}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v14, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 198
    .line 199
    .line 200
    new-instance v5, La/f0p;

    .line 201
    .line 202
    invoke-direct {v5, v12}, La/f0p;-><init>(B)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v14, v5}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 206
    .line 207
    .line 208
    invoke-static {v0}, La/s7n0;->l(Landroid/view/View;)La/clz;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    new-instance v7, La/jcs;

    .line 213
    .line 214
    const/16 v8, 0xd

    .line 215
    .line 216
    invoke-direct {v7, v0, v8}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 217
    .line 218
    .line 219
    const/16 v8, 0xb

    .line 220
    .line 221
    const/4 v9, 0x0

    .line 222
    invoke-static {v5, v9, v7, v8}, La/unh0;->h0(La/clz;La/rrf0;Lkotlin/jvm/functions/Function0;I)La/y73;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-virtual {v14, v5}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v14}, Landroid/animation/AnimatorSet;->start()V

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_1
    move/from16 v16, v5

    .line 234
    .line 235
    iget v5, v8, Landroid/graphics/Point;->x:I

    .line 236
    .line 237
    int-to-float v5, v5

    .line 238
    invoke-virtual {v11, v5}, Landroid/view/View;->setX(F)V

    .line 239
    .line 240
    .line 241
    iget v5, v8, Landroid/graphics/Point;->y:I

    .line 242
    .line 243
    int-to-float v5, v5

    .line 244
    invoke-virtual {v11, v5}, Landroid/view/View;->setY(F)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v11, v7}, Landroid/view/View;->setRotation(F)V

    .line 248
    .line 249
    .line 250
    iget-object v5, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->d:Lkotlin/jvm/functions/Function0;

    .line 251
    .line 252
    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    :goto_2
    invoke-virtual {v0, v11, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 256
    .line 257
    .line 258
    add-int/lit8 v6, v6, 0x1

    .line 259
    .line 260
    move/from16 v5, v16

    .line 261
    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :cond_2
    return-void
.end method

.method public final b(JLjava/util/List;)V
    .locals 8

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Point;

    .line 5
    .line 6
    invoke-direct {p0}, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->getRandomX()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-direct {p0}, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->getRandomY()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/16 v2, 0xa

    .line 20
    .line 21
    invoke-static {p3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    const/4 v2, 0x0

    .line 33
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    add-int/lit8 v4, v2, 0x1

    .line 44
    .line 45
    if-ltz v2, :cond_2

    .line 46
    .line 47
    check-cast v3, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v2, :cond_0

    .line 54
    .line 55
    move-object v5, v0

    .line 56
    goto :goto_3

    .line 57
    :cond_0
    iget v2, v0, Landroid/graphics/Point;->y:I

    .line 58
    .line 59
    iget v5, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->a:I

    .line 60
    .line 61
    add-int/2addr v2, v5

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    div-int/lit8 v5, v5, 0x2

    .line 67
    .line 68
    const/high16 v6, 0x41000000    # 8.0f

    .line 69
    .line 70
    if-ge v2, v5, :cond_1

    .line 71
    .line 72
    int-to-float v2, v2

    .line 73
    add-float/2addr v2, v6

    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    int-to-float v7, v7

    .line 83
    add-float/2addr v5, v7

    .line 84
    iget v7, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->a:I

    .line 85
    .line 86
    int-to-float v7, v7

    .line 87
    sub-float/2addr v5, v7

    .line 88
    :goto_1
    sub-float/2addr v5, v6

    .line 89
    goto :goto_2

    .line 90
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    add-float/2addr v2, v6

    .line 95
    iget v5, v0, Landroid/graphics/Point;->y:I

    .line 96
    .line 97
    iget v7, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->a:I

    .line 98
    .line 99
    sub-int/2addr v5, v7

    .line 100
    int-to-float v5, v5

    .line 101
    goto :goto_1

    .line 102
    :goto_2
    sget-object v6, La/f1e0;->a:La/e1e0;

    .line 103
    .line 104
    float-to-int v2, v2

    .line 105
    float-to-int v5, v5

    .line 106
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    sget-object v6, La/f1e0;->b:La/k4;

    .line 110
    .line 111
    invoke-virtual {v6, v2, v5}, La/f1e0;->d(II)I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    new-instance v5, Landroid/graphics/Point;

    .line 116
    .line 117
    invoke-direct {p0}, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->getRandomX()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    invoke-direct {v5, v6, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 122
    .line 123
    .line 124
    :goto_3
    new-instance v2, La/j7t;

    .line 125
    .line 126
    invoke-direct {p0}, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->getRandomRotation()F

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    invoke-direct {v2, v5, v3, v6}, La/j7t;-><init>(Landroid/graphics/Point;IF)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move v2, v4

    .line 137
    goto :goto_0

    .line 138
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 139
    .line 140
    .line 141
    const/4 p0, 0x0

    .line 142
    throw p0

    .line 143
    :cond_3
    invoke-virtual {p0, p1, p2, v1}, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->a(JLjava/util/List;)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    int-to-double p1, p1

    .line 9
    const-wide p3, 0x3fc999999999999aL    # 0.2

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    mul-double/2addr p1, p3

    .line 15
    double-to-int p1, p1

    .line 16
    iput p1, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->a:I

    .line 17
    .line 18
    return-void
.end method

.method public final setDiceListener$games_mania(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "La/j7t;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->c:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method

.method public final setDiceShownListener$games_mania(Lkotlin/jvm/functions/Function0;)V
    .locals 0
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
    iput-object p1, p0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->d:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method
