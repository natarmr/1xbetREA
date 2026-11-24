.class public final La/d5s;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

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
    new-instance v1, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 10
    .line 11
    const/4 v2, 0x6

    .line 12
    invoke-direct {v1, p1, v0, v2}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const v3, 0x7f0705c6

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 32
    .line 33
    .line 34
    const v2, 0x7f040b0e

    .line 35
    .line 36
    .line 37
    invoke-static {v2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, La/d5s;->a:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const v0, 0x7f070639

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iput p1, p0, La/d5s;->b:I

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const v0, 0x7f07072d

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iput p1, p0, La/d5s;->c:I

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const v0, 0x7f0704be

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    iput p1, p0, La/d5s;->d:I

    .line 91
    .line 92
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
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
    move-result p1

    .line 5
    iget p2, p0, La/d5s;->d:I

    .line 6
    .line 7
    sub-int v2, p1, p2

    .line 8
    .line 9
    iget p1, p0, La/d5s;->c:I

    .line 10
    .line 11
    iget p2, p0, La/d5s;->b:I

    .line 12
    .line 13
    add-int v3, p1, p2

    .line 14
    .line 15
    iget v0, p0, La/d5s;->d:I

    .line 16
    .line 17
    iget v1, p0, La/d5s;->c:I

    .line 18
    .line 19
    iget-object v4, p0, La/d5s;->a:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 20
    .line 21
    move-object v5, p0

    .line 22
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget v0, p0, La/d5s;->d:I

    .line 6
    .line 7
    mul-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    sub-int/2addr p2, v0

    .line 10
    const/high16 v0, 0x40000000    # 2.0f

    .line 11
    .line 12
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget v1, p0, La/d5s;->b:I

    .line 17
    .line 18
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/d5s;->a:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 23
    .line 24
    invoke-virtual {v2, p2, v0}, Landroid/view/View;->measure(II)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget p2, p0, La/d5s;->c:I

    .line 32
    .line 33
    add-int/2addr v1, p2

    .line 34
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 35
    .line 36
    .line 37
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
    invoke-static {p0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
