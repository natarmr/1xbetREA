.class public final Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/kuc0;


# static fields
.field public static final synthetic h:I


# instance fields
.field public final a:I

.field public final b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

.field public final c:Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

.field public final d:Landroid/view/View;

.field public final e:Landroidx/appcompat/widget/AppCompatTextView;

.field public final f:I

.field public final g:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 191
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const v3, 0x7f0706ea

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iput v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->a:I

    .line 26
    .line 27
    const v2, 0x7f1402f4

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v2, p3}, La/akj0;->g(Landroid/content/Context;II)La/daf;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, La/daf;->c()La/akj0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v3, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 39
    .line 40
    const/4 v4, 0x6

    .line 41
    invoke-direct {v3, p1, v1, v4}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    const v6, 0x7f0705c6

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    invoke-static {v3, v5}, La/jmu0;->i(Landroid/view/View;I)V

    .line 56
    .line 57
    .line 58
    iput-object v3, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 59
    .line 60
    new-instance v5, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 61
    .line 62
    invoke-direct {v5, p1, v1, v4}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 66
    .line 67
    invoke-virtual {v5, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v2}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(La/akj0;)V

    .line 71
    .line 72
    .line 73
    iput-object v5, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->c:Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 74
    .line 75
    new-instance v1, Landroid/view/View;

    .line 76
    .line 77
    invoke-direct {v1, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    const v2, 0x7f080e46

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->d:Landroid/view/View;

    .line 87
    .line 88
    new-instance v2, Landroidx/appcompat/widget/AppCompatTextView;

    .line 89
    .line 90
    invoke-direct {v2, p1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 97
    .line 98
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 99
    .line 100
    .line 101
    const/4 v0, 0x5

    .line 102
    invoke-virtual {v2, v0}, Landroid/view/View;->setTextAlignment(I)V

    .line 103
    .line 104
    .line 105
    const v0, 0x7f14044e

    .line 106
    .line 107
    .line 108
    invoke-static {v0, v2}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 109
    .line 110
    .line 111
    iput-object v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const v4, 0x7f0706a3

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    const/high16 v4, -0x80000000

    .line 125
    .line 126
    invoke-static {v0, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iput v0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->f:I

    .line 131
    .line 132
    new-instance v0, La/rbt0;

    .line 133
    .line 134
    const/16 v4, 0xa

    .line 135
    .line 136
    invoke-direct {v0, p0, v4}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 137
    .line 138
    .line 139
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iput-object v0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->g:La/n0o0;

    .line 144
    .line 145
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 155
    .line 156
    .line 157
    invoke-direct {p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->getCounterHelper()La/yoe;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0, p2, p3}, La/yoe;->b(Landroid/util/AttributeSet;I)V

    .line 162
    .line 163
    .line 164
    invoke-direct {p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->getCounterHelper()La/yoe;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    sget-object p3, La/r0m;->p:La/r0m;

    .line 169
    .line 170
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    iput-object p3, p2, La/yoe;->d:La/r0m;

    .line 174
    .line 175
    const p2, 0x7f040ae1

    .line 176
    .line 177
    .line 178
    invoke-static {p2, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    invoke-direct {p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->getCounterHelper()La/yoe;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-virtual {p0, p1}, La/yoe;->f(I)V

    .line 187
    .line 188
    .line 189
    return-void
.end method

.method private final getCounterHelper()La/yoe;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->g:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/yoe;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(La/euc0;La/m0x;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of v0, p1, La/euc0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p1, La/euc0;->c:La/n0x;

    .line 13
    .line 14
    iget-object v2, p1, La/euc0;->e:Lkotlin/jvm/functions/Function2;

    .line 15
    .line 16
    iget-object v3, p1, La/euc0;->f:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    invoke-virtual {p0, v0, p2, v2, v3}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->b(La/n0x;La/o0x;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p1, La/euc0;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->setLabel(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->getCounterHelper()La/yoe;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const-string v0, ""

    .line 35
    .line 36
    invoke-virtual {p1, p2, v0}, La/yoe;->d(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object p1, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->c:Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->d:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 55
    .line 56
    const/16 p2, 0x8

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final b(La/n0x;La/o0x;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/xis0;

    .line 5
    .line 6
    const/16 v1, 0x13

    .line 7
    .line 8
    invoke-direct {v0, p3, p0, v1}, La/xis0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v2, La/ulw;

    .line 12
    .line 13
    const/4 v7, 0x2

    .line 14
    move-object v4, p0

    .line 15
    move-object v5, p2

    .line 16
    move-object v6, p3

    .line 17
    move-object v3, p4

    .line 18
    invoke-direct/range {v2 .. v7}, La/ulw;-><init>(Lkotlin/jvm/functions/Function1;Landroid/widget/FrameLayout;La/o0x;Lkotlin/jvm/functions/Function2;B)V

    .line 19
    .line 20
    .line 21
    iget-object p0, v4, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->c:Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 22
    .line 23
    invoke-virtual {p0, p1, v5, v0, v2}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->h(La/o0x;La/o0x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    iget-object p1, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->c:Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

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
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v3, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->d:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {v3, v2, v2, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iget-object v1, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 37
    .line 38
    invoke-virtual {v1, v2, v2, v0, p1}, Landroid/view/View;->layout(IIII)V

    .line 39
    .line 40
    .line 41
    sub-int/2addr p5, p3

    .line 42
    iget-object v4, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 43
    .line 44
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    sub-int/2addr p4, p2

    .line 49
    sub-int/2addr p5, p1

    .line 50
    iget v0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->a:I

    .line 51
    .line 52
    sub-int v1, p5, v0

    .line 53
    .line 54
    sub-int v2, p4, v0

    .line 55
    .line 56
    add-int v3, v1, p1

    .line 57
    .line 58
    move-object v5, p0

    .line 59
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 60
    .line 61
    .line 62
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
    div-int/lit8 v0, p2, 0x3

    .line 6
    .line 7
    mul-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    const/high16 v1, 0x40000000    # 2.0f

    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->a:I

    .line 16
    .line 17
    mul-int/lit8 v2, v2, 0x2

    .line 18
    .line 19
    sub-int/2addr p2, v2

    .line 20
    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iget-object v1, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 25
    .line 26
    iget v2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->f:I

    .line 27
    .line 28
    invoke-virtual {v1, p2, v2}, Landroid/view/View;->measure(II)V

    .line 29
    .line 30
    .line 31
    iget-object p2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->c:Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 32
    .line 33
    invoke-virtual {p0, p2, p1, v0}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 34
    .line 35
    .line 36
    iget-object p2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->b:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 37
    .line 38
    invoke-virtual {p0, p2, p1, v0}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 39
    .line 40
    .line 41
    iget-object p2, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->d:Landroid/view/View;

    .line 42
    .line 43
    invoke-virtual {p0, p2, p1, v0}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public setLabel(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-lez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 p1, 0x8

    .line 18
    .line 19
    :goto_0
    iget-object p0, p0, Lorg/xplatform/promo/impl/promocodes/presentation/shop/components/VerticalPromoStoreCollectionItem;->d:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
