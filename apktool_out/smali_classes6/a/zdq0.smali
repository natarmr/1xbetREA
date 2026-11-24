.class public final La/zdq0;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# instance fields
.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public f:Lkotlin/jvm/functions/Function0;

.field public g:Z

.field public h:Lkotlin/jvm/functions/Function0;

.field public i:I

.field public j:I

.field public k:La/s470;

.field public l:La/lgq0;


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
    invoke-direct {p0, p1, v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    new-instance p1, La/ydq0;

    .line 10
    .line 11
    invoke-direct {p1, p0, v1}, La/ydq0;-><init>(La/zdq0;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, La/zdq0;->d:La/n0o0;

    .line 19
    .line 20
    new-instance p1, La/ydq0;

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-direct {p1, p0, v0}, La/ydq0;-><init>(La/zdq0;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/zdq0;->e:La/n0o0;

    .line 31
    .line 32
    new-instance p1, La/ozp0;

    .line 33
    .line 34
    const/16 v0, 0x13

    .line 35
    .line 36
    invoke-direct {p1, v0}, La/ozp0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/zdq0;->f:Lkotlin/jvm/functions/Function0;

    .line 40
    .line 41
    new-instance p1, La/ozp0;

    .line 42
    .line 43
    const/16 v0, 0x14

    .line 44
    .line 45
    invoke-direct {p1, v0}, La/ozp0;-><init>(B)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, La/zdq0;->h:Lkotlin/jvm/functions/Function0;

    .line 49
    .line 50
    sget-object p1, La/s470;->r:La/s470;

    .line 51
    .line 52
    iput-object p1, p0, La/zdq0;->k:La/s470;

    .line 53
    .line 54
    sget-object p1, La/lgq0;->a:La/lgq0;

    .line 55
    .line 56
    iput-object p1, p0, La/zdq0;->l:La/lgq0;

    .line 57
    .line 58
    invoke-virtual {p0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 59
    .line 60
    .line 61
    sget-object p1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 64
    .line 65
    .line 66
    new-instance p1, La/jpe0;

    .line 67
    .line 68
    const/16 v0, 0xd

    .line 69
    .line 70
    invoke-direct {p1, p0, v0}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public static final a(La/zdq0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-direct {p0}, La/zdq0;->getDisappearAnimator()Landroid/animation/Animator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/animation/Animator;->start()V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 9
    .line 10
    return-object p0
.end method

.method private final getDisappearAnimator()Landroid/animation/Animator;
    .locals 0

    .line 1
    iget-object p0, p0, La/zdq0;->e:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/animation/Animator;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getWinAnimator()Landroid/animation/Animator;
    .locals 0

    .line 1
    iget-object p0, p0, La/zdq0;->d:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/animation/Animator;

    .line 8
    .line 9
    return-object p0
.end method

.method private final setDefaultScale(Lkotlin/jvm/functions/Function0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    cmpg-float v0, v0, v1

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x2

    .line 20
    new-array v2, v2, [F

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    aput v0, v2, v3

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    aput v1, v2, v0

    .line 27
    .line 28
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La/fd5;

    .line 33
    .line 34
    const/16 v2, 0x18

    .line 35
    .line 36
    invoke-direct {v1, p0, v2}, La/fd5;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 40
    .line 41
    .line 42
    new-instance p0, La/x73;

    .line 43
    .line 44
    new-instance v1, La/xhl0;

    .line 45
    .line 46
    const/16 v2, 0xd

    .line 47
    .line 48
    invoke-direct {v1, p1, v2}, La/xhl0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 49
    .line 50
    .line 51
    const/16 p1, 0xb

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-direct {p0, v2, v1, p1}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 61
    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final d(La/zbg0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, La/zdq0;->getWinAnimator()Landroid/animation/Animator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/zdq0;->f:Lkotlin/jvm/functions/Function0;

    .line 9
    .line 10
    new-instance p1, La/ydq0;

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    invoke-direct {p1, p0, v0}, La/ydq0;-><init>(La/zdq0;B)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, La/zdq0;->setDefaultScale(Lkotlin/jvm/functions/Function0;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, La/zdq0;->k:La/s470;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0xf

    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/16 v1, 0x10

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    new-array v0, v0, [I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-array v0, v2, [I

    .line 24
    .line 25
    fill-array-data v0, :array_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    new-array v0, v2, [I

    .line 30
    .line 31
    fill-array-data v0, :array_1

    .line 32
    .line 33
    .line 34
    :goto_0
    iget-object v1, p0, La/zdq0;->l:La/lgq0;

    .line 35
    .line 36
    invoke-virtual {v1}, La/lgq0;->a()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    aget v0, v0, v1

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    iput-boolean v0, p0, La/zdq0;->g:Z

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, La/zdq0;->getDisappearAnimator()Landroid/animation/Animator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 56
    .line 57
    .line 58
    invoke-direct {p0}, La/zdq0;->getWinAnimator()Landroid/animation/Animator;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Landroid/animation/Animator;->start()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :array_0
    .array-data 4
        0x7f08056f
        0x7f080579
        0x7f080580
        0x7f080584
        0x7f080587
        0x7f080575
    .end array-data

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    :array_1
    .array-data 4
        0x7f080b06
        0x7f080afe
        0x7f080b08
        0x7f080b04
        0x7f080b00
        0x7f080b02
    .end array-data
.end method

.method public final getColumn$tile_matching()I
    .locals 0

    .line 1
    iget p0, p0, La/zdq0;->j:I

    .line 2
    .line 3
    return p0
.end method

.method public final getRow$tile_matching()I
    .locals 0

    .line 1
    iget p0, p0, La/zdq0;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public final getType$tile_matching()La/lgq0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zdq0;->l:La/lgq0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(FLkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput p1, v0, v1

    .line 6
    .line 7
    sget-object p1, Landroid/view/View;->Y:Landroid/util/Property;

    .line 8
    .line 9
    invoke-static {p0, p1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, La/x73;

    .line 14
    .line 15
    new-instance v0, La/xhl0;

    .line 16
    .line 17
    const/16 v1, 0xe

    .line 18
    .line 19
    invoke-direct {v0, p2, v1}, La/xhl0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 20
    .line 21
    .line 22
    const/16 p2, 0xb

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {p1, v1, v0, p2}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 29
    .line 30
    .line 31
    const-wide/16 p1, 0x28a

    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final i()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/zdq0;->getWinAnimator()Landroid/animation/Animator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, La/zdq0;->getDisappearAnimator()Landroid/animation/Animator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/zdq0;->k:La/s470;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/16 v1, 0xf

    .line 25
    .line 26
    const/4 v2, 0x6

    .line 27
    const/4 v3, 0x0

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    const/16 v1, 0x10

    .line 31
    .line 32
    if-eq v0, v1, :cond_0

    .line 33
    .line 34
    new-array v0, v3, [I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-array v0, v2, [I

    .line 38
    .line 39
    fill-array-data v0, :array_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    new-array v0, v2, [I

    .line 44
    .line 45
    fill-array-data v0, :array_1

    .line 46
    .line 47
    .line 48
    :goto_0
    iget-object v1, p0, La/zdq0;->l:La/lgq0;

    .line 49
    .line 50
    invoke-virtual {v1}, La/lgq0;->a()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    aget v0, v0, v1

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 60
    .line 61
    .line 62
    iput-boolean v3, p0, La/zdq0;->g:Z

    .line 63
    .line 64
    const/high16 v0, 0x3f800000    # 1.0f

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleX(F)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Landroid/view/View;->setScaleY(F)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :array_0
    .array-data 4
        0x7f080570
        0x7f08057a
        0x7f080581
        0x7f080583
        0x7f080588
        0x7f080572
    .end array-data

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    :array_1
    .array-data 4
        0x7f080b05
        0x7f080afd
        0x7f080b07
        0x7f080b03
        0x7f080aff
        0x7f080b01
    .end array-data
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/zdq0;->getDisappearAnimator()Landroid/animation/Animator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, La/zdq0;->getWinAnimator()Landroid/animation/Animator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroid/animation/Animator;->cancel()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setColumn$tile_matching(I)V
    .locals 0

    .line 1
    iput p1, p0, La/zdq0;->j:I

    .line 2
    .line 3
    return-void
.end method

.method public final setRow$tile_matching(I)V
    .locals 0

    .line 1
    iput p1, p0, La/zdq0;->i:I

    .line 2
    .line 3
    return-void
.end method

.method public final setType$tile_matching(La/lgq0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zdq0;->l:La/lgq0;

    .line 5
    .line 6
    invoke-virtual {p0}, La/zdq0;->i()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setYByLine$tile_matching(I)V
    .locals 1

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    int-to-float v0, v0

    .line 7
    mul-float/2addr p1, v0

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->setY(F)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
