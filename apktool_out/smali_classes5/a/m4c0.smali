.class public final La/m4c0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

.field public final d:Lorg/xplatform/uikit/components/views/LoadableImageView;

.field public final e:Landroidx/appcompat/widget/AppCompatTextView;

.field public final f:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

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
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const v3, 0x7f0706ea

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iput v2, p0, La/m4c0;->a:I

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const v3, 0x7f0705c6

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iput v3, p0, La/m4c0;->b:I

    .line 38
    .line 39
    new-instance v3, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 40
    .line 41
    const/4 v4, 0x6

    .line 42
    invoke-direct {v3, p1, v0, v4}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    .line 44
    .line 45
    const v5, 0x7f0a130b

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v5}, Landroid/view/View;->setId(I)V

    .line 49
    .line 50
    .line 51
    const-string v5, "bannerShimmer"

    .line 52
    .line 53
    invoke-virtual {v3, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object v3, p0, La/m4c0;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 57
    .line 58
    new-instance v5, Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 59
    .line 60
    invoke-direct {v5, p1, v0, v4, v1}, Lorg/xplatform/uikit/components/views/LoadableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 61
    .line 62
    .line 63
    const-string v0, "bannerImage"

    .line 64
    .line 65
    invoke-virtual {v5, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 69
    .line 70
    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 71
    .line 72
    .line 73
    iput-object v5, p0, La/m4c0;->d:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 74
    .line 75
    new-instance v0, Landroidx/appcompat/widget/AppCompatTextView;

    .line 76
    .line 77
    invoke-direct {v0, p1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    const-string v1, "bannerLabel"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 88
    .line 89
    .line 90
    const/4 v1, 0x2

    .line 91
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 92
    .line 93
    .line 94
    const/4 v1, 0x5

    .line 95
    invoke-virtual {v0, v1}, Landroid/view/View;->setTextAlignment(I)V

    .line 96
    .line 97
    .line 98
    const v1, 0x7f140461

    .line 99
    .line 100
    .line 101
    invoke-static {v1, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, La/m4c0;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 105
    .line 106
    new-instance v1, Landroid/view/View;

    .line 107
    .line 108
    invoke-direct {v1, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 109
    .line 110
    .line 111
    const p1, 0x7f080e45

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 115
    .line 116
    .line 117
    iput-object v1, p0, La/m4c0;->f:Landroid/view/View;

    .line 118
    .line 119
    invoke-static {p0, v2}, La/jmu0;->i(Landroid/view/View;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 9

    .line 1
    iget-object p1, p0, La/m4c0;->d:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 13
    .line 14
    .line 15
    sub-int/2addr p5, p3

    .line 16
    iget-object v7, p0, La/m4c0;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 17
    .line 18
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    sub-int/2addr p4, p2

    .line 23
    sub-int/2addr p5, p1

    .line 24
    iget v3, p0, La/m4c0;->a:I

    .line 25
    .line 26
    sub-int v4, p5, v3

    .line 27
    .line 28
    sub-int v5, p4, v3

    .line 29
    .line 30
    add-int v6, v4, p1

    .line 31
    .line 32
    move-object v8, p0

    .line 33
    invoke-static/range {v3 .. v8}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, v8, La/m4c0;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-virtual {p0, v2, v2, p1, p2}, Landroid/view/View;->layout(IIII)V

    .line 47
    .line 48
    .line 49
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
    const/high16 v0, 0x40000000    # 2.0f

    .line 6
    .line 7
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget v2, p0, La/m4c0;->a:I

    .line 12
    .line 13
    mul-int/lit8 v2, v2, 0x2

    .line 14
    .line 15
    sub-int/2addr p2, v2

    .line 16
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iget-object v0, p0, La/m4c0;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 21
    .line 22
    iget v2, p0, La/m4c0;->b:I

    .line 23
    .line 24
    invoke-virtual {v0, p2, v2}, Landroid/view/View;->measure(II)V

    .line 25
    .line 26
    .line 27
    iget-object p2, p0, La/m4c0;->d:Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 28
    .line 29
    invoke-virtual {p0, p2, p1, v1}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, La/m4c0;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 33
    .line 34
    invoke-virtual {p0, p2, p1, v1}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final setLabel$impl(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/m4c0;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
