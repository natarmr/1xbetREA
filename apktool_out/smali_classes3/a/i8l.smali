.class public final La/i8l;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/p7l;

.field public final b:La/a8z;

.field public final c:La/a8z;

.field public final d:La/s1g;

.field public final e:La/s1g;

.field public final f:La/x23;

.field public final g:La/p8l;

.field public final h:La/p8l;

.field public i:Z

.field public j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    new-instance v0, La/p7l;

    .line 7
    .line 8
    invoke-direct {v0, p1}, La/p7l;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/i8l;->a:La/p7l;

    .line 12
    .line 13
    new-instance v2, La/h8l;

    .line 14
    .line 15
    invoke-direct {v2, p1, p0, v1}, La/h8l;-><init>(Landroid/content/Context;La/i8l;B)V

    .line 16
    .line 17
    .line 18
    sget-object v3, La/wez;->b:La/wez;

    .line 19
    .line 20
    invoke-static {v3, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-object v2, p0, La/i8l;->b:La/a8z;

    .line 25
    .line 26
    new-instance v2, La/h8l;

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    invoke-direct {v2, p1, p0, v4}, La/h8l;-><init>(Landroid/content/Context;La/i8l;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v3, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, La/i8l;->c:La/a8z;

    .line 37
    .line 38
    new-instance p1, La/s1g;

    .line 39
    .line 40
    const v2, 0x7f0606a8

    .line 41
    .line 42
    .line 43
    invoke-direct {p1, p0, v2}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 44
    .line 45
    .line 46
    iget v2, v0, La/p7l;->g:F

    .line 47
    .line 48
    iget v3, v0, La/p7l;->e:F

    .line 49
    .line 50
    mul-float/2addr v2, v3

    .line 51
    invoke-virtual {p1, v2}, La/s1g;->c(F)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, La/i8l;->d:La/s1g;

    .line 55
    .line 56
    new-instance p1, La/s1g;

    .line 57
    .line 58
    const v2, 0x7f0601c8

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, p0, v2}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, La/p7l;->a()F

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {p1, v2}, La/s1g;->c(F)V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, La/i8l;->e:La/s1g;

    .line 72
    .line 73
    new-instance p1, La/x23;

    .line 74
    .line 75
    invoke-direct {p0}, La/i8l;->getMapImageView()Landroid/widget/ImageView;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-direct {p1, v2}, La/x23;-><init>(Landroid/widget/ImageView;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, La/i8l;->f:La/x23;

    .line 83
    .line 84
    new-instance p1, La/p8l;

    .line 85
    .line 86
    invoke-direct {p1, v0, p0}, La/p8l;-><init>(La/p7l;La/i8l;)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, La/i8l;->g:La/p8l;

    .line 90
    .line 91
    new-instance p1, La/p8l;

    .line 92
    .line 93
    invoke-direct {p1, v0, p0}, La/p8l;-><init>(La/p7l;La/i8l;)V

    .line 94
    .line 95
    .line 96
    iput-object p1, p0, La/i8l;->h:La/p8l;

    .line 97
    .line 98
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public static final synthetic a(La/i8l;)La/j8l;
    .locals 0

    .line 1
    invoke-direct {p0}, La/i8l;->getRoshanTextView()La/j8l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getMapImageView()Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, La/i8l;->b:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/ImageView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getRoshanTextView()La/j8l;
    .locals 0

    .line 1
    iget-object p0, p0, La/i8l;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/j8l;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final b(La/d8l;La/vne;)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-direct {p0}, La/i8l;->getRoshanTextView()La/j8l;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-boolean v0, p1, La/d8l;->b:Z

    .line 23
    .line 24
    iget-object v2, p0, La/i8l;->a:La/p7l;

    .line 25
    .line 26
    invoke-virtual {v2}, La/p7l;->e()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-virtual {v2}, La/p7l;->f()F

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    iget-wide v3, p1, La/d8l;->a:J

    .line 35
    .line 36
    const/4 v8, 0x0

    .line 37
    const/16 v9, 0x20

    .line 38
    .line 39
    const v2, 0x7f0804ad

    .line 40
    .line 41
    .line 42
    move-object v5, p2

    .line 43
    invoke-static/range {v1 .. v9}, La/j8l;->l(La/j8l;IJLa/vne;IFLa/ucj;I)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, La/i8l;->getRoshanTextView()La/j8l;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/16 p2, 0x8

    .line 55
    .line 56
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    iput-boolean v0, p0, La/i8l;->j:Z

    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    move-object v5, p2

    .line 63
    new-instance p2, La/pva;

    .line 64
    .line 65
    const/4 v0, 0x2

    .line 66
    invoke-direct {p2, p0, p1, v5, v0}, La/pva;-><init>(Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/i8l;->d:La/s1g;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, La/i8l;->j:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, La/i8l;->e:La/s1g;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, La/i8l;->g:La/p8l;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, La/p8l;->d(Landroid/graphics/Canvas;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, La/i8l;->h:La/p8l;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, La/p8l;->d(Landroid/graphics/Canvas;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 9

    .line 1
    invoke-direct {p0}, La/i8l;->getRoshanTextView()La/j8l;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    iget-object v7, p0, La/i8l;->a:La/p7l;

    .line 6
    .line 7
    invoke-virtual {v7}, La/p7l;->b()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {p0}, La/i8l;->getRoshanTextView()La/j8l;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    sub-int/2addr v2, v3

    .line 20
    div-int/lit8 v2, v2, 0x2

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iget v8, v7, La/p7l;->c:I

    .line 27
    .line 28
    sub-int/2addr v3, v8

    .line 29
    invoke-virtual {v7}, La/p7l;->d()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-direct {p0}, La/i8l;->getRoshanTextView()La/j8l;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    add-int/2addr v5, v4

    .line 42
    div-int/lit8 v5, v5, 0x2

    .line 43
    .line 44
    sub-int/2addr v3, v5

    .line 45
    invoke-static {v1, p0, v2, v3}, La/cww;->A(Landroid/view/View;Landroid/widget/FrameLayout;II)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, La/i8l;->getMapImageView()Landroid/widget/ImageView;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v1, p0, v8, v8}, La/cww;->A(Landroid/view/View;Landroid/widget/FrameLayout;II)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v7}, La/p7l;->b()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    add-int/2addr v1, v8

    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-virtual {v7}, La/p7l;->b()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-virtual {v7}, La/p7l;->d()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    add-int/2addr v4, v3

    .line 73
    add-int/2addr v4, v8

    .line 74
    sub-int/2addr v4, v8

    .line 75
    div-int/lit8 v4, v4, 0x2

    .line 76
    .line 77
    iget-object v3, p0, La/i8l;->g:La/p8l;

    .line 78
    .line 79
    const/4 v5, 0x0

    .line 80
    invoke-virtual {v3, v1, v5, v2, v4}, La/p8l;->p(IIII)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7}, La/p7l;->b()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    add-int/2addr v1, v8

    .line 88
    invoke-virtual {v7}, La/p7l;->b()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-virtual {v7}, La/p7l;->d()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    add-int/2addr v3, v2

    .line 97
    add-int/2addr v3, v8

    .line 98
    sub-int/2addr v3, v8

    .line 99
    div-int/lit8 v3, v3, 0x2

    .line 100
    .line 101
    add-int/2addr v3, v8

    .line 102
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    iget-object v6, p0, La/i8l;->h:La/p8l;

    .line 111
    .line 112
    invoke-virtual {v6, v1, v3, v2, v4}, La/p8l;->p(IIII)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {v7}, La/p7l;->b()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    new-instance v6, La/f8l;

    .line 128
    .line 129
    invoke-direct {v6, p0, v5}, La/f8l;-><init>(La/i8l;B)V

    .line 130
    .line 131
    .line 132
    move v5, v2

    .line 133
    const/4 v2, 0x0

    .line 134
    const/4 v3, 0x0

    .line 135
    move-object v0, p0

    .line 136
    invoke-static/range {v0 .. v6}, La/cww;->C(Landroid/widget/FrameLayout;IIIIILa/ydr;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    iget v2, v7, La/p7l;->c:I

    .line 144
    .line 145
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    invoke-virtual {v7}, La/p7l;->d()I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    sub-int/2addr v3, v4

    .line 154
    sub-int/2addr v3, v8

    .line 155
    invoke-virtual {v7}, La/p7l;->b()I

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    sub-int/2addr v4, v8

    .line 160
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    sub-int/2addr v5, v8

    .line 165
    new-instance v6, La/f8l;

    .line 166
    .line 167
    const/4 v7, 0x1

    .line 168
    invoke-direct {v6, p0, v7}, La/f8l;-><init>(La/i8l;B)V

    .line 169
    .line 170
    .line 171
    invoke-static/range {v0 .. v6}, La/cww;->C(Landroid/widget/FrameLayout;IIIIILa/ydr;)V

    .line 172
    .line 173
    .line 174
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, La/i8l;->a:La/p7l;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    int-to-float v0, v0

    .line 11
    iget v2, v1, La/p7l;->d:I

    .line 12
    .line 13
    int-to-float v2, v2

    .line 14
    div-float/2addr v0, v2

    .line 15
    iput v0, v1, La/p7l;->e:F

    .line 16
    .line 17
    invoke-direct {p0}, La/i8l;->getRoshanTextView()La/j8l;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, La/bcm0;->u(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, La/i8l;->getMapImageView()Landroid/widget/ImageView;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v2, v1, La/p7l;->l:I

    .line 29
    .line 30
    int-to-float v3, v2

    .line 31
    iget v4, v1, La/p7l;->e:F

    .line 32
    .line 33
    mul-float/2addr v3, v4

    .line 34
    invoke-static {v3}, La/si30;->b(F)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    int-to-float v2, v2

    .line 39
    iget v4, v1, La/p7l;->e:F

    .line 40
    .line 41
    mul-float/2addr v2, v4

    .line 42
    invoke-static {v2}, La/si30;->b(F)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-static {v0, v3, v2}, La/bcm0;->t(Landroid/view/View;II)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, La/i8l;->f:La/x23;

    .line 50
    .line 51
    invoke-virtual {v0}, La/x23;->e()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, La/i8l;->g:La/p8l;

    .line 55
    .line 56
    invoke-virtual {v0}, La/p8l;->r()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, La/i8l;->h:La/p8l;

    .line 60
    .line 61
    invoke-virtual {v0}, La/p8l;->r()V

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-virtual {v1}, La/p7l;->b()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-virtual {v1}, La/p7l;->d()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    add-int/2addr v2, v0

    .line 81
    iget v0, v1, La/p7l;->c:I

    .line 82
    .line 83
    add-int/2addr v2, v0

    .line 84
    add-int/2addr v2, p2

    .line 85
    invoke-virtual {p0, p1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final setDireSelectedHeroes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/u6l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/i8l;->h:La/p8l;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/p8l;->y(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setDireTeamIcon(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/i8l;->h:La/p8l;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 10
    .line 11
    iget-object p0, p0, La/p8l;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/a8z;

    .line 14
    .line 15
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Landroid/widget/ImageView;

    .line 20
    .line 21
    const v0, 0x7f080cf7

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x3

    .line 25
    invoke-static {p0, p1, v0, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final setDireTeamName(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/i8l;->h:La/p8l;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/p8l;->l:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public final setMapBuildings(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "La/a3l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/i8l;->i:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, La/k0l;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x6

    .line 12
    const/4 v1, 0x1

    .line 13
    const-class v3, La/i8l;

    .line 14
    .line 15
    const-string v4, "addView"

    .line 16
    .line 17
    const-string v5, "addView(Landroid/view/View;)V"

    .line 18
    .line 19
    move-object v2, p0

    .line 20
    invoke-direct/range {v0 .. v7}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 21
    .line 22
    .line 23
    move-object v8, v0

    .line 24
    new-instance v0, La/k0l;

    .line 25
    .line 26
    const/4 v7, 0x7

    .line 27
    const-string v4, "removeView"

    .line 28
    .line 29
    const-string v5, "removeView(Landroid/view/View;)V"

    .line 30
    .line 31
    invoke-direct/range {v0 .. v7}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, La/i8l;->f:La/x23;

    .line 35
    .line 36
    invoke-virtual {v1, p1, v8, v0}, La/x23;->g(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final setMapHeroes(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/o5l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/i8l;->i:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, La/k0l;

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/16 v8, 0x8

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-class v4, La/i8l;

    .line 15
    .line 16
    const-string v5, "addView"

    .line 17
    .line 18
    const-string v6, "addView(Landroid/view/View;)V"

    .line 19
    .line 20
    move-object v3, p0

    .line 21
    invoke-direct/range {v1 .. v8}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 22
    .line 23
    .line 24
    iget-object p0, v3, La/i8l;->f:La/x23;

    .line 25
    .line 26
    invoke-virtual {p0, p1, v1}, La/x23;->h(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final setNetWorthDire(La/r7l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/r7l;->a:Ljava/lang/String;

    .line 5
    .line 6
    iget-boolean p1, p1, La/r7l;->b:Z

    .line 7
    .line 8
    iget-object p0, p0, La/i8l;->h:La/p8l;

    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, La/p8l;->x(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setNetWorthRadiant(La/z7l;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/z7l;->a:Ljava/lang/String;

    .line 5
    .line 6
    iget-boolean p1, p1, La/z7l;->b:Z

    .line 7
    .line 8
    iget-object p0, p0, La/i8l;->g:La/p8l;

    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, La/p8l;->x(Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setRadiantSelectedHeroes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/u6l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/i8l;->g:La/p8l;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/p8l;->y(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setRadiantTeamIcon(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/i8l;->g:La/p8l;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 10
    .line 11
    iget-object p0, p0, La/p8l;->k:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/a8z;

    .line 14
    .line 15
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Landroid/widget/ImageView;

    .line 20
    .line 21
    const v0, 0x7f080cf7

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x3

    .line 25
    invoke-static {p0, p1, v0, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final setRadiantTeamName(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/i8l;->g:La/p8l;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/p8l;->l:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method
