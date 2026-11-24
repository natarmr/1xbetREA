.class public final La/wte;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/zse;
.implements La/rkg0;


# instance fields
.field public final a:Lorg/xplatform/uikit_sport/score/SportScore;


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
    new-instance v1, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 10
    .line 11
    const/4 v2, 0x6

    .line 12
    invoke-direct {v1, p1, v0, v2}, Lorg/xplatform/uikit_sport/score/SportScore;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 16
    .line 17
    const/4 v0, -0x2

    .line 18
    invoke-direct {p1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, La/wte;->a:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, La/wte;->a:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/high16 p2, 0x40000000    # 2.0f

    .line 21
    .line 22
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public setRtlSupportEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, La/wte;->a:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit_sport/score/SportScore;->setRtlSupportEnabled(Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setScoreUiModel(La/yse;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/vse;

    .line 5
    .line 6
    iget-object p0, p0, La/wte;->a:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    new-instance v0, La/n5h0;

    .line 11
    .line 12
    check-cast p1, La/vse;

    .line 13
    .line 14
    iget-object v1, p1, La/vse;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v2, p1, La/vse;->c:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v3, p1, La/vse;->b:La/pip0;

    .line 19
    .line 20
    sget-object v4, La/pip0;->d:La/pip0;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x1

    .line 24
    if-ne v3, v4, :cond_0

    .line 25
    .line 26
    move v3, v6

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v3, v5

    .line 29
    :goto_0
    iget-object p1, p1, La/vse;->d:La/pip0;

    .line 30
    .line 31
    if-ne p1, v4, :cond_1

    .line 32
    .line 33
    move v5, v6

    .line 34
    :cond_1
    invoke-direct {v0, v1, v2, v3, v5}, La/n5h0;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit_sport/score/SportScore;->setScore(La/p5h0;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    sget-object v0, La/wse;->a:La/wse;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    sget-object p1, La/o5h0;->a:La/o5h0;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/score/SportScore;->setScore(La/p5h0;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    return-void
.end method
