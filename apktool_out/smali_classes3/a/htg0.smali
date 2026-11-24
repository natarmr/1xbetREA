.class public final La/htg0;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field public final a:La/a8z;

.field public b:La/gtg0;

.field public c:La/sps0;

.field public d:Landroid/animation/AnimatorSet;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    sget-object v0, La/wez;->b:La/wez;

    .line 7
    .line 8
    new-instance v1, La/sue0;

    .line 9
    .line 10
    const/16 v2, 0xa

    .line 11
    .line 12
    invoke-direct {v1, p0, p0, v2}, La/sue0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/htg0;->a:La/a8z;

    .line 20
    .line 21
    sget-object v0, La/gtg0;->a:La/gtg0;

    .line 22
    .line 23
    iput-object v0, p0, La/htg0;->b:La/gtg0;

    .line 24
    .line 25
    const v0, 0x7f0d06c8

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final b(La/htg0;ILa/cym0;)Lkotlin/Unit;
    .locals 3

    .line 1
    sget-object v0, La/gtg0;->c:La/gtg0;

    .line 2
    .line 3
    iput-object v0, p0, La/htg0;->b:La/gtg0;

    .line 4
    .line 5
    invoke-direct {p0}, La/htg0;->getBinding()La/nku0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, La/nku0;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, La/htg0;->setPrize(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    new-instance p1, Landroid/os/Handler;

    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    new-instance v0, La/oh60;

    .line 35
    .line 36
    const/16 v1, 0x11

    .line 37
    .line 38
    invoke-direct {v0, p2, p0, v1}, La/oh60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    const-wide/16 v1, 0x1f4

    .line 42
    .line 43
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0
.end method

.method private final getBinding()La/nku0;
    .locals 0

    .line 1
    iget-object p0, p0, La/htg0;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/nku0;

    .line 8
    .line 9
    return-object p0
.end method

.method private final setPrize(I)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, La/htg0;->getBinding()La/nku0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/nku0;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    const p1, 0x7f080bb4

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/16 v0, 0x32

    .line 17
    .line 18
    if-gt p1, v0, :cond_1

    .line 19
    .line 20
    invoke-direct {p0}, La/htg0;->getBinding()La/nku0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object p0, p0, La/nku0;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 25
    .line 26
    const p1, 0x7f080bb6

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-direct {p0}, La/htg0;->getBinding()La/nku0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object p0, p0, La/nku0;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 38
    .line 39
    const p1, 0x7f080bb5

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, La/htg0;->b:La/gtg0;

    .line 2
    .line 3
    sget-object v1, La/gtg0;->a:La/gtg0;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, La/htg0;->getBinding()La/nku0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v0, v0, La/nku0;->c:Landroidx/appcompat/widget/AppCompatImageView;

    .line 12
    .line 13
    const v2, 0x7f080bb3

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, La/htg0;->getBinding()La/nku0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, La/nku0;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-virtual {v0, v2}, Landroid/view/View;->setRotation(F)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, La/htg0;->getBinding()La/nku0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v0, v0, La/nku0;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, La/htg0;->b:La/gtg0;

    .line 40
    .line 41
    iget-object p0, p0, La/htg0;->c:La/sps0;

    .line 42
    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    invoke-interface {p0}, La/sps0;->c()V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method public final c(ILa/cym0;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/htg0;->b:La/gtg0;

    .line 4
    .line 5
    sget-object v2, La/gtg0;->a:La/gtg0;

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v1, Landroid/animation/AnimatorSet;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x5

    .line 16
    new-array v3, v2, [I

    .line 17
    .line 18
    sget-object v4, La/f1e0;->a:La/e1e0;

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v4, La/f1e0;->b:La/k4;

    .line 24
    .line 25
    const/16 v5, 0xb4

    .line 26
    .line 27
    invoke-virtual {v4, v5}, La/k4;->f(I)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v6, 0x0

    .line 32
    aput v4, v3, v6

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    move v7, v4

    .line 36
    :goto_0
    if-ge v7, v2, :cond_1

    .line 37
    .line 38
    add-int/lit8 v8, v7, -0x1

    .line 39
    .line 40
    aget v8, v3, v8

    .line 41
    .line 42
    sget-object v9, La/f1e0;->a:La/e1e0;

    .line 43
    .line 44
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    sget-object v9, La/f1e0;->b:La/k4;

    .line 48
    .line 49
    invoke-virtual {v9, v5}, La/k4;->f(I)I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    add-int/2addr v9, v8

    .line 54
    aput v9, v3, v7

    .line 55
    .line 56
    add-int/lit8 v7, v7, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-direct {v0}, La/htg0;->getBinding()La/nku0;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    iget-object v5, v5, La/nku0;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 64
    .line 65
    aget v7, v3, v6

    .line 66
    .line 67
    int-to-float v7, v7

    .line 68
    const/4 v8, 0x2

    .line 69
    new-array v9, v8, [F

    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    aput v10, v9, v6

    .line 73
    .line 74
    aput v7, v9, v4

    .line 75
    .line 76
    sget-object v7, Landroid/view/View;->ROTATION:Landroid/util/Property;

    .line 77
    .line 78
    invoke-static {v5, v7, v9}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    const-wide/16 v11, 0x258

    .line 83
    .line 84
    invoke-virtual {v5, v11, v12}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 85
    .line 86
    .line 87
    new-instance v9, La/f0p;

    .line 88
    .line 89
    invoke-direct {v9, v4}, La/f0p;-><init>(B)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v9}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 93
    .line 94
    .line 95
    invoke-direct {v0}, La/htg0;->getBinding()La/nku0;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iget-object v5, v5, La/nku0;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 100
    .line 101
    aget v9, v3, v6

    .line 102
    .line 103
    int-to-float v9, v9

    .line 104
    new-array v13, v8, [F

    .line 105
    .line 106
    aput v10, v13, v6

    .line 107
    .line 108
    aput v9, v13, v4

    .line 109
    .line 110
    invoke-static {v5, v7, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-virtual {v1, v5}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    move v9, v4

    .line 119
    :goto_1
    if-ge v9, v2, :cond_2

    .line 120
    .line 121
    invoke-direct {v0}, La/htg0;->getBinding()La/nku0;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    iget-object v10, v10, La/nku0;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 126
    .line 127
    add-int/lit8 v13, v9, -0x1

    .line 128
    .line 129
    aget v13, v3, v13

    .line 130
    .line 131
    int-to-float v13, v13

    .line 132
    aget v14, v3, v9

    .line 133
    .line 134
    int-to-float v14, v14

    .line 135
    new-array v15, v8, [F

    .line 136
    .line 137
    aput v13, v15, v6

    .line 138
    .line 139
    aput v14, v15, v4

    .line 140
    .line 141
    invoke-static {v10, v7, v15}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    invoke-virtual {v10, v11, v12}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 146
    .line 147
    .line 148
    new-instance v13, La/f0p;

    .line 149
    .line 150
    invoke-direct {v13, v4}, La/f0p;-><init>(B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v10, v13}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 154
    .line 155
    .line 156
    int-to-long v13, v9

    .line 157
    mul-long v15, v13, v11

    .line 158
    .line 159
    const-wide/16 v17, 0x64

    .line 160
    .line 161
    mul-long v13, v13, v17

    .line 162
    .line 163
    add-long/2addr v13, v15

    .line 164
    invoke-virtual {v10, v13, v14}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5, v10}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 168
    .line 169
    .line 170
    add-int/lit8 v9, v9, 0x1

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_2
    new-instance v2, La/x73;

    .line 174
    .line 175
    new-instance v3, La/a7g0;

    .line 176
    .line 177
    const/4 v4, 0x6

    .line 178
    invoke-direct {v3, v0, v4}, La/a7g0;-><init>(Ljava/lang/Object;B)V

    .line 179
    .line 180
    .line 181
    new-instance v4, La/bh1;

    .line 182
    .line 183
    const/16 v5, 0x9

    .line 184
    .line 185
    move/from16 v6, p1

    .line 186
    .line 187
    move-object/from16 v7, p2

    .line 188
    .line 189
    invoke-direct {v4, v0, v6, v7, v5}, La/bh1;-><init>(Ljava/lang/Object;ILjava/lang/Object;B)V

    .line 190
    .line 191
    .line 192
    const/16 v5, 0xa

    .line 193
    .line 194
    invoke-direct {v2, v3, v4, v5}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 198
    .line 199
    .line 200
    iput-object v1, v0, La/htg0;->d:Landroid/animation/AnimatorSet;

    .line 201
    .line 202
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    .line 203
    .line 204
    .line 205
    return-void
.end method

.method public final d(I)V
    .locals 2

    .line 1
    iget-object v0, p0, La/htg0;->b:La/gtg0;

    .line 2
    .line 3
    sget-object v1, La/gtg0;->a:La/gtg0;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0, p1}, La/htg0;->setPrize(I)V

    .line 9
    .line 10
    .line 11
    sget-object p1, La/gtg0;->c:La/gtg0;

    .line 12
    .line 13
    iput-object p1, p0, La/htg0;->b:La/gtg0;

    .line 14
    .line 15
    invoke-direct {p0}, La/htg0;->getBinding()La/nku0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/nku0;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 20
    .line 21
    const/16 p1, 0x8

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setListener(La/sps0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/htg0;->c:La/sps0;

    .line 5
    .line 6
    return-void
.end method
