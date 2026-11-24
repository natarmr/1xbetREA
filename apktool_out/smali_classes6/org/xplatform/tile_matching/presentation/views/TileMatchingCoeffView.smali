.class public final Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final q:La/iab;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const p2, 0x7f0d0693

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    const p2, 0x7f0a0811

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    move-object v3, p3

    .line 36
    check-cast v3, Landroid/widget/ImageView;

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    const p2, 0x7f0a0814

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    move-object v4, p3

    .line 48
    check-cast v4, Landroid/widget/ImageView;

    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    const p2, 0x7f0a0895

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    move-object v5, p3

    .line 60
    check-cast v5, Landroid/widget/ImageView;

    .line 61
    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    const p2, 0x7f0a0b99

    .line 65
    .line 66
    .line 67
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    move-object v6, p3

    .line 72
    check-cast v6, Landroid/widget/ProgressBar;

    .line 73
    .line 74
    if-eqz v6, :cond_1

    .line 75
    .line 76
    const p2, 0x7f0a10a8

    .line 77
    .line 78
    .line 79
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    move-object v7, p3

    .line 84
    check-cast v7, Landroid/widget/TextView;

    .line 85
    .line 86
    if-eqz v7, :cond_1

    .line 87
    .line 88
    const p2, 0x7f0a10a9

    .line 89
    .line 90
    .line 91
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    move-object v8, p3

    .line 96
    check-cast v8, Landroid/widget/TextView;

    .line 97
    .line 98
    if-eqz v8, :cond_1

    .line 99
    .line 100
    new-instance v1, La/iab;

    .line 101
    .line 102
    move-object v2, p1

    .line 103
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 104
    .line 105
    invoke-direct/range {v1 .. v8}, La/iab;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 106
    .line 107
    .line 108
    iput-object v1, p0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->q:La/iab;

    .line 109
    .line 110
    return-void

    .line 111
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    const-string p1, "Missing required view with ID: "

    .line 120
    .line 121
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0
.end method


# virtual methods
.method public final setCoeffImage$tile_matching(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->q:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setMaxProgress$tile_matching(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->q:La/iab;

    .line 2
    .line 3
    iget-object p0, p0, La/iab;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/ProgressBar;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setProgressDrawableTint$tile_matching(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->q:La/iab;

    .line 2
    .line 3
    iget-object v0, v0, La/iab;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/ProgressBar;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/content/Context;->getColor(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final u(I)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingCoeffView;->q:La/iab;

    .line 2
    .line 3
    iget-object v0, p0, La/iab;->g:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/TextView;

    .line 6
    .line 7
    if-gtz p1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/iab;->g:Landroid/view/View;

    .line 16
    .line 17
    check-cast p0, Landroid/widget/TextView;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
