.class public final La/w4d;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/kao0;


# instance fields
.field public final a:Z

.field public b:Lkotlin/jvm/functions/Function1;

.field public final c:La/vqc;

.field public final d:Ljava/util/ArrayList;

.field public e:Ljava/util/List;

.field public final f:I

.field public final g:I

.field public final h:I

.field public i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    .line 7
    .line 8
    iput-boolean p2, p0, La/w4d;->a:Z

    .line 9
    .line 10
    new-instance v0, La/vqc;

    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-direct {v0, p0, v1}, La/vqc;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/w4d;->c:La/vqc;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/4 v1, 0x5

    .line 21
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, La/w4d;->d:Ljava/util/ArrayList;

    .line 25
    .line 26
    sget-object v0, La/iun;->a:La/iun;

    .line 27
    .line 28
    iput-object v0, p0, La/w4d;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const v1, 0x7f070705

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iput v0, p0, La/w4d;->f:I

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const v1, 0x7f0706c1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iput v0, p0, La/w4d;->g:I

    .line 55
    .line 56
    if-eqz p2, :cond_0

    .line 57
    .line 58
    const p2, 0x7f06069c

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const p2, 0x7f040ae3

    .line 67
    .line 68
    .line 69
    invoke-static {p2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    :goto_0
    iput p1, p0, La/w4d;->h:I

    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Z)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/w4d;->d:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v3, v1

    .line 22
    check-cast v3, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v1, v2

    .line 36
    :goto_0
    instance-of p1, v1, La/wak0;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    move-object v2, v1

    .line 41
    check-cast v2, La/wak0;

    .line 42
    .line 43
    :cond_2
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-virtual {v2, p2}, La/wak0;->a(Z)V

    .line 46
    .line 47
    .line 48
    iget p0, p0, La/w4d;->h:I

    .line 49
    .line 50
    invoke-virtual {v2, p0}, La/wak0;->b(I)V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public final b(ILjava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/w4d;->d:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    move-object v3, v1

    .line 22
    check-cast v3, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v3, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v1, v2

    .line 36
    :goto_0
    check-cast v1, Landroid/view/View;

    .line 37
    .line 38
    instance-of p2, v1, La/xoe;

    .line 39
    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    move-object p2, v1

    .line 43
    check-cast p2, La/xoe;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object p2, v2

    .line 47
    :goto_1
    if-eqz p2, :cond_3

    .line 48
    .line 49
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p2, p1}, La/xoe;->setCount(Ljava/lang/Integer;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    instance-of p1, v1, La/wak0;

    .line 57
    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    move-object v2, v1

    .line 61
    check-cast v2, La/wak0;

    .line 62
    .line 63
    :cond_4
    if-eqz v2, :cond_5

    .line 64
    .line 65
    iget p0, p0, La/w4d;->h:I

    .line 66
    .line 67
    invoke-virtual {v2, p0}, La/wak0;->b(I)V

    .line 68
    .line 69
    .line 70
    :cond_5
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 5

    .line 1
    iget-object p0, p0, La/w4d;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/view/View;

    .line 18
    .line 19
    instance-of v1, v0, La/wak0;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    move-object v1, v0

    .line 26
    check-cast v1, La/wak0;

    .line 27
    .line 28
    if-eq v0, p1, :cond_1

    .line 29
    .line 30
    move v4, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v4, v3

    .line 33
    :goto_1
    invoke-virtual {v1, v4}, La/wak0;->setSelect(Z)V

    .line 34
    .line 35
    .line 36
    :cond_2
    instance-of v1, v0, La/fxy;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    move-object v1, v0

    .line 41
    check-cast v1, La/fxy;

    .line 42
    .line 43
    if-eq v0, p1, :cond_3

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    move v2, v3

    .line 47
    :goto_2
    invoke-virtual {v1, v2}, La/fxy;->setSelect(Z)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_4
    return-void
.end method

.method public getMaxItemHeight()I
    .locals 0

    .line 1
    iget p0, p0, La/w4d;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public getSelectedTabTag()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object p0, p0, La/w4d;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move-object v2, v0

    .line 19
    check-cast v2, Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/View;->isSelected()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v0, v1

    .line 29
    :goto_0
    check-cast v0, Landroid/view/View;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-object p0, v1

    .line 39
    :goto_1
    instance-of v0, p0, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    move-object v1, p0

    .line 44
    check-cast v1, Ljava/lang/String;

    .line 45
    .line 46
    :cond_3
    if-nez v1, :cond_4

    .line 47
    .line 48
    const-string p0, ""

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_4
    return-object v1
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 p3, 0x0

    .line 10
    move v0, p1

    .line 11
    :goto_0
    if-ge p3, p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    add-int v2, v0, p1

    .line 26
    .line 27
    iget v3, p0, La/w4d;->g:I

    .line 28
    .line 29
    sub-int v1, v3, p4

    .line 30
    .line 31
    move-object v5, p0

    .line 32
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 33
    .line 34
    .line 35
    iget p0, v5, La/w4d;->f:I

    .line 36
    .line 37
    add-int/2addr p1, p0

    .line 38
    add-int/2addr v0, p1

    .line 39
    add-int/lit8 p3, p3, 0x1

    .line 40
    .line 41
    move-object p0, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    iget-object v0, p0, La/w4d;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    add-int/lit8 v1, v0, -0x1

    .line 12
    .line 13
    iget v2, p0, La/w4d;->f:I

    .line 14
    .line 15
    mul-int/2addr v1, v2

    .line 16
    sub-int v1, p1, v1

    .line 17
    .line 18
    div-int/2addr v1, v0

    .line 19
    const/high16 v0, 0x40000000    # 2.0f

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v1, p0, La/w4d;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Landroid/view/View;

    .line 42
    .line 43
    invoke-virtual {p0, v2, v0, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget p2, p0, La/w4d;->g:I

    .line 48
    .line 49
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public setClickable(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/w4d;->d:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

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
    check-cast v0, Landroid/view/View;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public setMaxItemHeight(I)V
    .locals 1

    .line 1
    iget v0, p0, La/w4d;->i:I

    .line 2
    .line 3
    if-le p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, La/w4d;->i:I

    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public setOnTabClickListener(Lkotlin/jvm/functions/Function1;)V
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
    iput-object p1, p0, La/w4d;->b:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    return-void
.end method

.method public setSelectedTab(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/w4d;->d:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v2, v1

    .line 21
    check-cast v2, Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v1, 0x0

    .line 35
    :goto_0
    check-cast v1, Landroid/view/View;

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    invoke-virtual {p0, v1}, La/w4d;->c(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public setTabs(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/oao0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/w4d;->e:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/oao0;

    .line 21
    .line 22
    new-instance v1, La/wak0;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-boolean v3, p0, La/w4d;->a:Z

    .line 32
    .line 33
    invoke-direct {v1, v2, v3}, La/wak0;-><init>(Landroid/content/Context;Z)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, La/oao0;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget v3, v0, La/oao0;->c:I

    .line 46
    .line 47
    invoke-static {v3, v2}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v1, v2}, La/wak0;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v0, La/oao0;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v1, v0}, La/wak0;->setText(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, La/w4d;->c:La/vqc;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, La/wak0;->setTabSelectListener(La/tdo0;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, La/w4d;->d:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    return-void
.end method
