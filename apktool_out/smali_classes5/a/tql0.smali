.class public final La/tql0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Landroid/widget/ImageView;

.field public final c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

.field public final d:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

.field public final e:Landroid/widget/TextView;

.field public f:I

.field public g:I

.field public h:I

.field public final i:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Landroid/widget/ImageView;

    .line 7
    .line 8
    invoke-direct {v2, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    iput-object v2, p0, La/tql0;->b:Landroid/widget/ImageView;

    .line 12
    .line 13
    new-instance v3, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 14
    .line 15
    const/4 v4, 0x6

    .line 16
    invoke-direct {v3, p1, v0, v4}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    .line 18
    .line 19
    iput-object v3, p0, La/tql0;->c:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 20
    .line 21
    new-instance v5, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 22
    .line 23
    invoke-direct {v5, p1, v0, v4}, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    .line 25
    .line 26
    iput-object v5, p0, La/tql0;->d:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 27
    .line 28
    new-instance v4, Landroid/widget/TextView;

    .line 29
    .line 30
    invoke-direct {v4, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    iput-object v4, p0, La/tql0;->e:Landroid/widget/TextView;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    const v7, 0x7f070748

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    iput v6, p0, La/tql0;->h:I

    .line 47
    .line 48
    new-instance v6, La/goi0;

    .line 49
    .line 50
    const/16 v7, 0x10

    .line 51
    .line 52
    invoke-direct {v6, p0, v7}, La/goi0;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v6}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    iput-object v6, p0, La/tql0;->i:La/n0o0;

    .line 60
    .line 61
    new-instance v6, La/u5l0;

    .line 62
    .line 63
    const/16 v7, 0x9

    .line 64
    .line 65
    invoke-direct {v6, p0, p1, v7}, La/u5l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    sget-object v7, La/cqd0;->k:[I

    .line 69
    .line 70
    invoke-virtual {p1, v0, v7, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v6, p1}, La/u5l0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method private final getIconLoadHelper()La/r0x;
    .locals 0

    .line 1
    iget-object p0, p0, La/tql0;->i:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/r0x;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public setIcon(La/o0x;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/tql0;->getIconLoadHelper()La/r0x;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, La/m0x;

    .line 9
    .line 10
    const/4 v2, 0x6

    .line 11
    const v3, 0x7f08080a

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    invoke-direct {v1, v3, v4, v2}, La/m0x;-><init>(ILa/bzw;I)V

    .line 16
    .line 17
    .line 18
    const/16 v2, 0xc

    .line 19
    .line 20
    invoke-static {v0, p1, v1, v4, v2}, La/r0x;->d(La/r0x;La/o0x;La/m0x;Lkotlin/jvm/functions/Function1;I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, La/tql0;->b:Landroid/widget/ImageView;

    .line 24
    .line 25
    iget p0, p0, La/tql0;->g:I

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    const/16 v0, 0x8

    .line 16
    .line 17
    :goto_1
    iget-object p0, p0, La/tql0;->e:Landroid/widget/TextView;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
