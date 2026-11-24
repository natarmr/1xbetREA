.class public final La/qb8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Rect;

.field public b:La/nb8;

.field public c:Z

.field public d:Z

.field public e:F

.field public f:Z

.field public g:F

.field public final h:Landroid/graphics/Rect;

.field public i:F

.field public j:F

.field public k:Z

.field public l:F

.field public m:F

.field public n:Z

.field public o:B

.field public p:I

.field public q:I

.field public r:F

.field public s:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, La/qb8;->a:Landroid/graphics/Rect;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 51
    iput v0, p0, La/qb8;->g:F

    .line 52
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, La/qb8;->h:Landroid/graphics/Rect;

    .line 53
    iput v0, p0, La/qb8;->r:F

    .line 54
    new-instance v0, La/nb8;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1, v1}, La/nb8;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;II)V

    iput-object v0, p0, La/qb8;->b:La/nb8;

    .line 55
    iput-boolean v1, p0, La/qb8;->d:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;II)V
    .locals 2

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
    new-instance v0, Landroid/graphics/Rect;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/qb8;->a:Landroid/graphics/Rect;

    .line 16
    .line 17
    const/high16 v0, 0x3f800000    # 1.0f

    .line 18
    .line 19
    iput v0, p0, La/qb8;->g:F

    .line 20
    .line 21
    new-instance v1, Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, La/qb8;->h:Landroid/graphics/Rect;

    .line 27
    .line 28
    iput v0, p0, La/qb8;->r:F

    .line 29
    .line 30
    new-instance v0, La/nb8;

    .line 31
    .line 32
    invoke-direct {v0, p1, p2, p3, p4}, La/nb8;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;II)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, La/qb8;->b:La/nb8;

    .line 36
    .line 37
    iput p3, p0, La/qb8;->p:I

    .line 38
    .line 39
    iput p4, p0, La/qb8;->q:I

    .line 40
    .line 41
    if-ne p3, p4, :cond_0

    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    :goto_0
    iput-boolean p1, p0, La/qb8;->d:Z

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 1

    .line 1
    iget v0, p0, La/qb8;->p:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    iget p0, p0, La/qb8;->q:I

    .line 6
    .line 7
    if-ne p1, p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public final b(II)Z
    .locals 2

    .line 1
    iget v0, p0, La/qb8;->p:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    if-ne p2, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget p0, p0, La/qb8;->q:I

    .line 10
    .line 11
    if-eq p1, p0, :cond_2

    .line 12
    .line 13
    if-ne p2, p0, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_2
    :goto_0
    return v1
.end method

.method public final c(Lorg/xplatform/domino/presentation/views/DominoHandView;)Landroid/animation/AnimatorSet;
    .locals 7

    .line 1
    iget-boolean v0, p0, La/qb8;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    iget v0, p0, La/qb8;->i:F

    .line 8
    .line 9
    iget-object v1, p0, La/qb8;->a:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    int-to-float v2, v2

    .line 16
    sub-float/2addr v0, v2

    .line 17
    const/4 v2, 0x2

    .line 18
    new-array v3, v2, [F

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    aput v0, v3, v4

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    const/4 v5, 0x0

    .line 25
    aput v5, v3, v0

    .line 26
    .line 27
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    new-instance v6, La/ob8;

    .line 32
    .line 33
    invoke-direct {v6, p0, v4}, La/ob8;-><init>(La/qb8;B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 37
    .line 38
    .line 39
    iget v6, p0, La/qb8;->j:F

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    int-to-float v1, v1

    .line 46
    sub-float/2addr v6, v1

    .line 47
    new-array v1, v2, [F

    .line 48
    .line 49
    aput v6, v1, v4

    .line 50
    .line 51
    aput v5, v1, v0

    .line 52
    .line 53
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    new-instance v5, La/sb3;

    .line 58
    .line 59
    invoke-direct {v5, p0, p1, v0}, La/sb3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 63
    .line 64
    .line 65
    new-instance p0, Landroid/animation/AnimatorSet;

    .line 66
    .line 67
    invoke-direct {p0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1}, Landroid/animation/AnimatorSet;->setTarget(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-array p1, v2, [Landroid/animation/Animator;

    .line 74
    .line 75
    aput-object v3, p1, v4

    .line 76
    .line 77
    aput-object v1, p1, v0

    .line 78
    .line 79
    invoke-virtual {p0, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 80
    .line 81
    .line 82
    const-wide/16 v0, 0x258

    .line 83
    .line 84
    invoke-virtual {p0, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 85
    .line 86
    .line 87
    return-object p0
.end method

.method public final d(Landroid/view/View;Landroid/graphics/Rect;II)Landroid/animation/AnimatorSet;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/qb8;->a:Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 15
    .line 16
    iget v2, p2, Landroid/graphics/Rect;->left:I

    .line 17
    .line 18
    sub-int/2addr v1, v2

    .line 19
    sub-int/2addr v1, p3

    .line 20
    int-to-float p3, v1

    .line 21
    const/4 v1, 0x2

    .line 22
    new-array v2, v1, [F

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    aput p3, v2, v3

    .line 26
    .line 27
    const/4 p3, 0x1

    .line 28
    const/4 v4, 0x0

    .line 29
    aput v4, v2, p3

    .line 30
    .line 31
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v5, La/pb8;

    .line 36
    .line 37
    invoke-direct {v5, p0, p1, v3}, La/pb8;-><init>(La/qb8;Landroid/view/View;B)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 41
    .line 42
    .line 43
    iget v5, v0, Landroid/graphics/Rect;->top:I

    .line 44
    .line 45
    iget v6, p2, Landroid/graphics/Rect;->top:I

    .line 46
    .line 47
    sub-int/2addr v5, v6

    .line 48
    sub-int/2addr v5, p4

    .line 49
    int-to-float p4, v5

    .line 50
    new-array v5, v1, [F

    .line 51
    .line 52
    aput p4, v5, v3

    .line 53
    .line 54
    aput v4, v5, p3

    .line 55
    .line 56
    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 57
    .line 58
    .line 59
    move-result-object p4

    .line 60
    new-instance v4, La/ob8;

    .line 61
    .line 62
    invoke-direct {v4, p0, p3}, La/ob8;-><init>(La/qb8;B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p4, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 66
    .line 67
    .line 68
    iget v4, p0, La/qb8;->r:F

    .line 69
    .line 70
    new-array v5, v1, [F

    .line 71
    .line 72
    aput v4, v5, v3

    .line 73
    .line 74
    const/high16 v4, 0x3f800000    # 1.0f

    .line 75
    .line 76
    aput v4, v5, p3

    .line 77
    .line 78
    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    new-instance v5, La/ob8;

    .line 83
    .line 84
    invoke-direct {v5, p0, v1}, La/ob8;-><init>(La/qb8;B)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 91
    .line 92
    .line 93
    new-instance p0, Landroid/animation/AnimatorSet;

    .line 94
    .line 95
    invoke-direct {p0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, p1}, Landroid/animation/AnimatorSet;->setTarget(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    const/4 p1, 0x3

    .line 102
    new-array p1, p1, [Landroid/animation/Animator;

    .line 103
    .line 104
    aput-object v2, p1, v3

    .line 105
    .line 106
    aput-object p4, p1, p3

    .line 107
    .line 108
    aput-object v4, p1, v1

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 111
    .line 112
    .line 113
    const-wide/16 p1, 0x258

    .line 114
    .line 115
    invoke-virtual {p0, p1, p2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 116
    .line 117
    .line 118
    return-object p0
.end method

.method public final e(Landroid/graphics/Canvas;II)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 5
    .line 6
    .line 7
    iget v0, p0, La/qb8;->r:F

    .line 8
    .line 9
    int-to-float p2, p2

    .line 10
    int-to-float p3, p3

    .line 11
    invoke-virtual {p1, v0, v0, p2, p3}, Landroid/graphics/Canvas;->scale(FFFF)V

    .line 12
    .line 13
    .line 14
    iget-boolean p2, p0, La/qb8;->k:Z

    .line 15
    .line 16
    iget-object p3, p0, La/qb8;->a:Landroid/graphics/Rect;

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    iget p2, p0, La/qb8;->i:F

    .line 21
    .line 22
    invoke-virtual {p3}, Landroid/graphics/Rect;->centerX()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    int-to-float v0, v0

    .line 27
    sub-float/2addr p2, v0

    .line 28
    iget v0, p0, La/qb8;->j:F

    .line 29
    .line 30
    invoke-virtual {p3}, Landroid/graphics/Rect;->centerY()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    int-to-float v1, v1

    .line 35
    sub-float/2addr v0, v1

    .line 36
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget p2, p0, La/qb8;->l:F

    .line 40
    .line 41
    iget v0, p0, La/qb8;->m:F

    .line 42
    .line 43
    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 44
    .line 45
    .line 46
    iget-byte p2, p0, La/qb8;->o:B

    .line 47
    .line 48
    and-int/lit8 p2, p2, 0x7

    .line 49
    .line 50
    const/4 v0, 0x3

    .line 51
    const/4 v1, 0x0

    .line 52
    if-eq p2, v0, :cond_2

    .line 53
    .line 54
    const/4 v0, 0x5

    .line 55
    if-eq p2, v0, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    div-int/lit8 p2, p2, 0x2

    .line 63
    .line 64
    invoke-virtual {p3}, Landroid/graphics/Rect;->centerX()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget v2, p3, Landroid/graphics/Rect;->left:I

    .line 69
    .line 70
    sub-int/2addr v0, v2

    .line 71
    sub-int/2addr p2, v0

    .line 72
    int-to-float p2, p2

    .line 73
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    div-int/lit8 p2, p2, 0x2

    .line 82
    .line 83
    invoke-virtual {p3}, Landroid/graphics/Rect;->centerX()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    iget v2, p3, Landroid/graphics/Rect;->left:I

    .line 88
    .line 89
    sub-int/2addr v0, v2

    .line 90
    sub-int/2addr p2, v0

    .line 91
    neg-int p2, p2

    .line 92
    int-to-float p2, p2

    .line 93
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 94
    .line 95
    .line 96
    :goto_0
    iget-byte p2, p0, La/qb8;->o:B

    .line 97
    .line 98
    and-int/lit8 p2, p2, 0x70

    .line 99
    .line 100
    const/16 v0, 0x30

    .line 101
    .line 102
    if-eq p2, v0, :cond_4

    .line 103
    .line 104
    const/16 v0, 0x50

    .line 105
    .line 106
    if-eq p2, v0, :cond_3

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    div-int/lit8 p2, p2, 0x2

    .line 114
    .line 115
    invoke-virtual {p3}, Landroid/graphics/Rect;->centerX()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iget v2, p3, Landroid/graphics/Rect;->left:I

    .line 120
    .line 121
    sub-int/2addr v0, v2

    .line 122
    sub-int/2addr p2, v0

    .line 123
    int-to-float p2, p2

    .line 124
    invoke-virtual {p1, v1, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    div-int/lit8 p2, p2, 0x2

    .line 133
    .line 134
    invoke-virtual {p3}, Landroid/graphics/Rect;->centerX()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    iget v2, p3, Landroid/graphics/Rect;->left:I

    .line 139
    .line 140
    sub-int/2addr v0, v2

    .line 141
    sub-int/2addr p2, v0

    .line 142
    neg-int p2, p2

    .line 143
    int-to-float p2, p2

    .line 144
    invoke-virtual {p1, v1, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 145
    .line 146
    .line 147
    :goto_1
    iget p2, p0, La/qb8;->e:F

    .line 148
    .line 149
    invoke-virtual {p3}, Landroid/graphics/Rect;->centerX()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    int-to-float v0, v0

    .line 154
    invoke-virtual {p3}, Landroid/graphics/Rect;->centerY()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    int-to-float v1, v1

    .line 159
    invoke-virtual {p1, p2, v0, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 160
    .line 161
    .line 162
    iget-object p2, p0, La/qb8;->h:Landroid/graphics/Rect;

    .line 163
    .line 164
    invoke-virtual {p2, p3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 165
    .line 166
    .line 167
    const/4 v0, -0x5

    .line 168
    invoke-virtual {p2, v0, v0}, Landroid/graphics/Rect;->inset(II)V

    .line 169
    .line 170
    .line 171
    iget-object p2, p0, La/qb8;->b:La/nb8;

    .line 172
    .line 173
    invoke-virtual {p2, p3}, La/nb8;->setBounds(Landroid/graphics/Rect;)V

    .line 174
    .line 175
    .line 176
    iget-boolean p2, p0, La/qb8;->s:Z

    .line 177
    .line 178
    if-nez p2, :cond_5

    .line 179
    .line 180
    iget-boolean p2, p0, La/qb8;->n:Z

    .line 181
    .line 182
    if-eqz p2, :cond_5

    .line 183
    .line 184
    iget-object p0, p0, La/qb8;->b:La/nb8;

    .line 185
    .line 186
    const/high16 p2, 0x3f000000    # 0.5f

    .line 187
    .line 188
    iput p2, p0, La/nb8;->b:F

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_5
    iget-boolean p2, p0, La/qb8;->f:Z

    .line 192
    .line 193
    iget-object p3, p0, La/qb8;->b:La/nb8;

    .line 194
    .line 195
    if-eqz p2, :cond_6

    .line 196
    .line 197
    const/high16 p0, 0x3f800000    # 1.0f

    .line 198
    .line 199
    iput p0, p3, La/nb8;->b:F

    .line 200
    .line 201
    :goto_2
    move-object p0, p3

    .line 202
    goto :goto_3

    .line 203
    :cond_6
    iget p0, p0, La/qb8;->g:F

    .line 204
    .line 205
    iput p0, p3, La/nb8;->b:F

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :goto_3
    invoke-virtual {p0, p1}, La/nb8;->draw(Landroid/graphics/Canvas;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 212
    .line 213
    .line 214
    return-void
.end method

.method public final f(Landroid/view/View;FZ)V
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget p3, p0, La/qb8;->e:F

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    new-array v0, v0, [F

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    aput p3, v0, v1

    .line 10
    .line 11
    const/4 p3, 0x1

    .line 12
    aput p2, v0, p3

    .line 13
    .line 14
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p2, p1}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, La/pb8;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1, p3}, La/pb8;-><init>(La/qb8;Landroid/view/View;B)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 27
    .line 28
    .line 29
    const-wide/16 p0, 0x258

    .line 30
    .line 31
    invoke-virtual {p2, p0, p1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Landroid/animation/Animator;->start()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iput p2, p0, La/qb8;->e:F

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 41
    .line 42
    .line 43
    return-void
.end method
