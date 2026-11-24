.class public Lcom/google/android/material/progressindicator/CircularProgressIndicator;
.super La/t06;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 96
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/progressindicator/CircularProgressIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 1
    const v0, 0x7f040196

    .line 2
    .line 3
    .line 4
    const v1, 0x7f140a0b

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2, v0, v1}, La/t06;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 8
    .line 9
    .line 10
    new-instance p1, La/tjc;

    .line 11
    .line 12
    iget-object p2, p0, La/t06;->a:La/u06;

    .line 13
    .line 14
    check-cast p2, La/dkc;

    .line 15
    .line 16
    invoke-direct {p1, p2}, La/tjc;-><init>(La/dkc;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, La/d5x;

    .line 24
    .line 25
    iget v2, p2, La/dkc;->q:I

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    if-ne v2, v3, :cond_0

    .line 29
    .line 30
    new-instance v2, La/xjc;

    .line 31
    .line 32
    invoke-direct {v2, v0, p2}, La/xjc;-><init>(Landroid/content/Context;La/dkc;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v2, La/vjc;

    .line 37
    .line 38
    invoke-direct {v2, p2}, La/vjc;-><init>(La/dkc;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-direct {v1, v0, p2, p1, v2}, La/d5x;-><init>(Landroid/content/Context;La/u06;La/whl;La/c2;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v2, La/n4u0;

    .line 49
    .line 50
    invoke-direct {v2}, La/n4u0;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v4, La/itf0;->a:Ljava/lang/ThreadLocal;

    .line 54
    .line 55
    const v4, 0x7f080ad4

    .line 56
    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    invoke-virtual {v0, v4, v5}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, v2, La/e4u0;->a:Landroid/graphics/drawable/Drawable;

    .line 64
    .line 65
    new-instance v0, La/m4u0;

    .line 66
    .line 67
    iget-object v4, v2, La/e4u0;->a:Landroid/graphics/drawable/Drawable;

    .line 68
    .line 69
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-direct {v0, v4}, La/m4u0;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    .line 74
    .line 75
    .line 76
    iput-object v2, v1, La/d5x;->p:La/n4u0;

    .line 77
    .line 78
    invoke-virtual {p0, v1}, La/t06;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    new-instance v1, La/hgk;

    .line 86
    .line 87
    invoke-direct {v1, v0, p2, p1}, La/hgk;-><init>(Landroid/content/Context;La/u06;La/whl;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v1}, La/t06;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 91
    .line 92
    .line 93
    iput-boolean v3, p0, La/t06;->i:Z

    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public getIndeterminateAnimationType()I
    .locals 0

    .line 1
    iget-object p0, p0, La/t06;->a:La/u06;

    .line 2
    .line 3
    check-cast p0, La/dkc;

    .line 4
    .line 5
    iget p0, p0, La/dkc;->q:I

    .line 6
    .line 7
    return p0
.end method

.method public getIndicatorDirection()I
    .locals 0

    .line 1
    iget-object p0, p0, La/t06;->a:La/u06;

    .line 2
    .line 3
    check-cast p0, La/dkc;

    .line 4
    .line 5
    iget p0, p0, La/dkc;->t:I

    .line 6
    .line 7
    return p0
.end method

.method public getIndicatorInset()I
    .locals 0

    .line 1
    iget-object p0, p0, La/t06;->a:La/u06;

    .line 2
    .line 3
    check-cast p0, La/dkc;

    .line 4
    .line 5
    iget p0, p0, La/dkc;->s:I

    .line 6
    .line 7
    return p0
.end method

.method public getIndicatorSize()I
    .locals 0

    .line 1
    iget-object p0, p0, La/t06;->a:La/u06;

    .line 2
    .line 3
    check-cast p0, La/dkc;

    .line 4
    .line 5
    iget p0, p0, La/dkc;->r:I

    .line 6
    .line 7
    return p0
.end method

.method public setIndeterminateAnimationType(I)V
    .locals 2

    .line 1
    iget-object v0, p0, La/t06;->a:La/u06;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, La/dkc;

    .line 5
    .line 6
    iget v1, v1, La/dkc;->q:I

    .line 7
    .line 8
    if-ne v1, p1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, La/t06;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-string p0, "Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode."

    .line 25
    .line 26
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    :goto_0
    move-object v1, v0

    .line 31
    check-cast v1, La/dkc;

    .line 32
    .line 33
    iput p1, v1, La/dkc;->q:I

    .line 34
    .line 35
    move-object v1, v0

    .line 36
    check-cast v1, La/dkc;

    .line 37
    .line 38
    invoke-virtual {v1}, La/u06;->d()V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    if-ne p1, v1, :cond_3

    .line 43
    .line 44
    new-instance p1, La/xjc;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v0, La/dkc;

    .line 51
    .line 52
    invoke-direct {p1, v1, v0}, La/xjc;-><init>(Landroid/content/Context;La/dkc;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    new-instance p1, La/vjc;

    .line 57
    .line 58
    check-cast v0, La/dkc;

    .line 59
    .line 60
    invoke-direct {p1, v0}, La/vjc;-><init>(La/dkc;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    invoke-virtual {p0}, La/t06;->getIndeterminateDrawable()La/d5x;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object p1, v0, La/d5x;->o:La/c2;

    .line 68
    .line 69
    iput-object v0, p1, La/c2;->a:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {p0}, La/t06;->b()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, La/t06;->invalidate()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public setIndicatorDirection(I)V
    .locals 1

    .line 1
    iget-object v0, p0, La/t06;->a:La/u06;

    .line 2
    .line 3
    check-cast v0, La/dkc;

    .line 4
    .line 5
    iput p1, v0, La/dkc;->t:I

    .line 6
    .line 7
    invoke-virtual {p0}, La/t06;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setIndicatorInset(I)V
    .locals 2

    .line 1
    iget-object v0, p0, La/t06;->a:La/u06;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, La/dkc;

    .line 5
    .line 6
    iget v1, v1, La/dkc;->s:I

    .line 7
    .line 8
    if-eq v1, p1, :cond_0

    .line 9
    .line 10
    check-cast v0, La/dkc;

    .line 11
    .line 12
    iput p1, v0, La/dkc;->s:I

    .line 13
    .line 14
    invoke-virtual {p0}, La/t06;->invalidate()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setIndicatorSize(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/t06;->getTrackThickness()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, La/t06;->a:La/u06;

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, La/dkc;

    .line 15
    .line 16
    iget v1, v1, La/dkc;->r:I

    .line 17
    .line 18
    if-eq v1, p1, :cond_0

    .line 19
    .line 20
    move-object v1, v0

    .line 21
    check-cast v1, La/dkc;

    .line 22
    .line 23
    iput p1, v1, La/dkc;->r:I

    .line 24
    .line 25
    check-cast v0, La/dkc;

    .line 26
    .line 27
    invoke-virtual {v0}, La/u06;->d()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/t06;->invalidate()V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public setTrackThickness(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La/t06;->setTrackThickness(I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/t06;->a:La/u06;

    .line 5
    .line 6
    check-cast p0, La/dkc;

    .line 7
    .line 8
    invoke-virtual {p0}, La/u06;->d()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
