.class public final Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final q:La/jk3;

.field public final r:F

.field public final s:F

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    move-result-object p2

    .line 18
    const v1, 0x7f0d00b7

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    const p2, 0x7f0a0801

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v4, v1

    .line 32
    check-cast v4, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    const p2, 0x7f0a1236

    .line 37
    .line 38
    .line 39
    invoke-static {p0, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    move-object v5, v1

    .line 44
    check-cast v5, Landroid/widget/TextView;

    .line 45
    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    const p2, 0x7f0a1260

    .line 49
    .line 50
    .line 51
    invoke-static {p0, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    move-object v6, v1

    .line 56
    check-cast v6, Landroid/widget/TextView;

    .line 57
    .line 58
    if-eqz v6, :cond_1

    .line 59
    .line 60
    const p2, 0x7f0a13aa

    .line 61
    .line 62
    .line 63
    invoke-static {p0, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    move-object v7, v1

    .line 68
    check-cast v7, Lorg/xplatform/uikit/components/tag/DsTag;

    .line 69
    .line 70
    if-eqz v7, :cond_1

    .line 71
    .line 72
    new-instance v2, La/jk3;

    .line 73
    .line 74
    const/4 v8, 0x5

    .line 75
    move-object v3, p0

    .line 76
    invoke-direct/range {v2 .. v8}, La/jk3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 77
    .line 78
    .line 79
    iput-object v2, v3, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->q:La/jk3;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const p2, 0x7f070644

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    iput p0, v3, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->r:F

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const p1, 0x7f070664

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    iput p0, v3, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->s:F

    .line 106
    .line 107
    invoke-virtual {v3, p3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, p3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_1
    move-object v3, p0

    .line 115
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    const-string p1, "Missing required view with ID: "

    .line 124
    .line 125
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v0
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 1

    .line 1
    iget p1, p0, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->r:F

    .line 2
    .line 3
    float-to-int p1, p1

    .line 4
    const/high16 p2, 0x40000000    # 2.0f

    .line 5
    .line 6
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget v0, p0, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->s:F

    .line 11
    .line 12
    float-to-int v0, v0

    .line 13
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setBannerType(La/rnk;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    const v0, 0x7f140852

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const v0, 0x7f140859

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const v0, 0x7f140853

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p0, p0, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->q:La/jk3;

    .line 32
    .line 33
    iget-object v2, p0, La/jk3;->f:Landroid/view/View;

    .line 34
    .line 35
    check-cast v2, Lorg/xplatform/uikit/components/tag/DsTag;

    .line 36
    .line 37
    iget-object p0, p0, La/jk3;->f:Landroid/view/View;

    .line 38
    .line 39
    check-cast p0, Lorg/xplatform/uikit/components/tag/DsTag;

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/tag/DsTag;->setStyle(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setAllCaps(Z)V

    .line 45
    .line 46
    .line 47
    iget p1, p1, La/rnk;->a:I

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final setSubtitle(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->u:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->u:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p0, p0, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->q:La/jk3;

    .line 15
    .line 16
    iget-object p0, p0, La/jk3;->d:Landroid/view/View;

    .line 17
    .line 18
    check-cast p0, Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->t:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->t:Ljava/lang/String;

    .line 13
    .line 14
    iget-object p0, p0, Lorg/xplatform/cyber/section/impl/championships/esports_world_cup/presentation/discipline/discipline_banner/DisciplineBannerView;->q:La/jk3;

    .line 15
    .line 16
    iget-object p0, p0, La/jk3;->e:Landroid/view/View;

    .line 17
    .line 18
    check-cast p0, Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
