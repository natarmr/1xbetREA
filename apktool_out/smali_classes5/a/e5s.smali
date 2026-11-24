.class public final La/e5s;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/uikit/components/header/DsHeader;

.field public final b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

.field public final c:I

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

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
    new-instance v1, Lorg/xplatform/uikit/components/header/DsHeader;

    .line 10
    .line 11
    new-instance v2, Landroid/view/ContextThemeWrapper;

    .line 12
    .line 13
    const v3, 0x7f1408bd

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, p1, v3}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x6

    .line 20
    invoke-direct {v1, v2, v0, v3}, Lorg/xplatform/uikit/components/header/DsHeader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, La/e5s;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 24
    .line 25
    new-instance v2, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 26
    .line 27
    invoke-direct {v2, p1, v0, v3}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const v4, 0x7f0705c6

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 47
    .line 48
    .line 49
    const v3, 0x7f040b0e

    .line 50
    .line 51
    .line 52
    invoke-static {v3, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    iput-object v2, p0, La/e5s;->b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const v0, 0x7f0706a9

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iput p1, p0, La/e5s;->c:I

    .line 80
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const v0, 0x7f070639

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iput p1, p0, La/e5s;->d:I

    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const v0, 0x7f0704be

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    iput p1, p0, La/e5s;->e:I

    .line 106
    .line 107
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget p3, p0, La/e5s;->c:I

    .line 6
    .line 7
    move-object p5, p0

    .line 8
    const/4 p0, 0x0

    .line 9
    const/4 p1, 0x0

    .line 10
    iget-object p4, p5, La/e5s;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 11
    .line 12
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    iget p1, p5, La/e5s;->e:I

    .line 20
    .line 21
    sub-int v2, p0, p1

    .line 22
    .line 23
    iget p0, p5, La/e5s;->c:I

    .line 24
    .line 25
    iget p1, p5, La/e5s;->d:I

    .line 26
    .line 27
    add-int v3, p0, p1

    .line 28
    .line 29
    iget v0, p5, La/e5s;->e:I

    .line 30
    .line 31
    iget v1, p5, La/e5s;->c:I

    .line 32
    .line 33
    iget-object v4, p5, La/e5s;->b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 34
    .line 35
    move-object v5, p5

    .line 36
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget v0, p0, La/e5s;->e:I

    .line 6
    .line 7
    mul-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    sub-int/2addr p2, v0

    .line 10
    iget v0, p0, La/e5s;->c:I

    .line 11
    .line 12
    const/high16 v1, 0x40000000    # 2.0f

    .line 13
    .line 14
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, La/e5s;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 19
    .line 20
    invoke-virtual {v3, p1, v2}, Landroid/view/View;->measure(II)V

    .line 21
    .line 22
    .line 23
    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    iget v2, p0, La/e5s;->d:I

    .line 28
    .line 29
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget-object v3, p0, La/e5s;->b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 34
    .line 35
    invoke-virtual {v3, p2, v1}, Landroid/view/View;->measure(II)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    add-int/2addr v0, v2

    .line 43
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public setVisibility(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v1, p0, La/e5s;->a:Lorg/xplatform/uikit/components/header/DsHeader;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/header/DsHeader;->b(Z)V

    .line 12
    .line 13
    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
