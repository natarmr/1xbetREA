.class public final La/m5l;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/dc3;

.field public final b:Z

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:La/n0o0;

.field public final h:Lorg/xplatform/cyber/dota/impl/presentation/common/DotaAdditionalTeamInformationView;

.field public i:La/amw;

.field public j:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const v3, 0x7f0d00d1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    const v2, 0x7f0a008a

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    move-object v6, v3

    .line 24
    check-cast v6, Lorg/xplatform/cyber/dota/impl/presentation/common/DotaAdditionalTeamInformationView;

    .line 25
    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    const v2, 0x7f0a06f8

    .line 29
    .line 30
    .line 31
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    move-object v7, v3

    .line 36
    check-cast v7, Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsHeroesTableView;

    .line 37
    .line 38
    if-eqz v7, :cond_0

    .line 39
    .line 40
    const v2, 0x7f0a07f7

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    move-object v8, v3

    .line 48
    check-cast v8, Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsTableView;

    .line 49
    .line 50
    if-eqz v8, :cond_0

    .line 51
    .line 52
    const v2, 0x7f0a0cdd

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    move-object v9, v3

    .line 60
    check-cast v9, Landroid/widget/HorizontalScrollView;

    .line 61
    .line 62
    if-eqz v9, :cond_0

    .line 63
    .line 64
    new-instance v4, La/dc3;

    .line 65
    .line 66
    move-object v5, p0

    .line 67
    invoke-direct/range {v4 .. v9}, La/dc3;-><init>(La/m5l;Lorg/xplatform/cyber/dota/impl/presentation/common/DotaAdditionalTeamInformationView;Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsHeroesTableView;Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsTableView;Landroid/widget/HorizontalScrollView;)V

    .line 68
    .line 69
    .line 70
    iput-object v4, v5, La/m5l;->a:La/dc3;

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    const p1, 0x7f05000f

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    iput-boolean p0, v5, La/m5l;->b:Z

    .line 84
    .line 85
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    const p1, 0x7f07069b

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    iput p0, v5, La/m5l;->c:I

    .line 97
    .line 98
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    const p1, 0x7f070714

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    iput p0, v5, La/m5l;->d:I

    .line 110
    .line 111
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    const p1, 0x7f070659

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    iput p0, v5, La/m5l;->e:I

    .line 123
    .line 124
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    const p1, 0x7f070722

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    iput p0, v5, La/m5l;->f:I

    .line 136
    .line 137
    new-instance p0, La/ucj;

    .line 138
    .line 139
    const/16 p1, 0x12

    .line 140
    .line 141
    invoke-direct {p0, v5, p1}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 142
    .line 143
    .line 144
    invoke-static {p0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    iput-object p0, v5, La/m5l;->g:La/n0o0;

    .line 149
    .line 150
    iput-object v6, v5, La/m5l;->h:Lorg/xplatform/cyber/dota/impl/presentation/common/DotaAdditionalTeamInformationView;

    .line 151
    .line 152
    sget-object p0, La/iun;->a:La/iun;

    .line 153
    .line 154
    iput-object p0, v5, La/m5l;->j:Ljava/util/List;

    .line 155
    .line 156
    invoke-virtual {v5, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_0
    move-object v5, p0

    .line 161
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    const-string p1, "Missing required view with ID: "

    .line 170
    .line 171
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v0
.end method

.method public static final a(La/m5l;IIII)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-direct {p0}, La/m5l;->getTeamDelegate()La/z6p0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, La/z6p0;->b(IIII)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 9
    .line 10
    return-object p0
.end method

.method private final getTeamDelegate()La/z6p0;
    .locals 0

    .line 1
    iget-object p0, p0, La/m5l;->g:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/z6p0;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/m5l;->getTeamDelegate()La/z6p0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p1}, La/z6p0;->a(Landroid/graphics/Canvas;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 8

    .line 1
    iget-object v6, p0, La/m5l;->a:La/dc3;

    .line 2
    .line 3
    iget-object v1, v6, La/dc3;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast v1, Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsHeroesTableView;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget v2, p0, La/m5l;->f:I

    .line 12
    .line 13
    sub-int v3, v1, v2

    .line 14
    .line 15
    new-instance v5, La/l5l;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v5, p0, v1}, La/l5l;-><init>(La/m5l;B)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    iget v4, p0, La/m5l;->c:I

    .line 23
    .line 24
    move-object v0, p0

    .line 25
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v6, La/dc3;->c:Landroid/view/View;

    .line 29
    .line 30
    move-object v7, v1

    .line 31
    check-cast v7, Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsHeroesTableView;

    .line 32
    .line 33
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v5, La/l5l;

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    invoke-direct {v5, p0, v2}, La/l5l;-><init>(La/m5l;B)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    iget v4, p0, La/m5l;->c:I

    .line 49
    .line 50
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    move v3, v1

    .line 62
    iget v1, p0, La/m5l;->d:I

    .line 63
    .line 64
    add-int/2addr v3, v1

    .line 65
    const/4 v0, 0x0

    .line 66
    move-object v5, p0

    .line 67
    move-object v4, v7

    .line 68
    invoke-static/range {v0 .. v5}, La/cww;->z(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, v6, La/dc3;->e:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v4, v1

    .line 74
    check-cast v4, Landroid/widget/HorizontalScrollView;

    .line 75
    .line 76
    iget v1, p0, La/m5l;->d:I

    .line 77
    .line 78
    move v0, v2

    .line 79
    move v2, p4

    .line 80
    invoke-static/range {v0 .. v5}, La/cww;->z(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final onMeasure(II)V
    .locals 6

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, La/m5l;->a:La/dc3;

    .line 6
    .line 7
    iget-object v2, v1, La/dc3;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Landroid/widget/HorizontalScrollView;

    .line 10
    .line 11
    iget-object v3, v1, La/dc3;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsTableView;

    .line 14
    .line 15
    invoke-virtual {v2, p1, p2}, Landroid/view/View;->measure(II)V

    .line 16
    .line 17
    .line 18
    iget-object p1, v1, La/dc3;->c:Landroid/view/View;

    .line 19
    .line 20
    check-cast p1, Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsHeroesTableView;

    .line 21
    .line 22
    const/high16 v1, 0x40000000    # 2.0f

    .line 23
    .line 24
    iget-boolean v2, p0, La/m5l;->b:Z

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-virtual {v3}, Landroid/view/View;->getMinimumWidth()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    sub-int v2, v0, v2

    .line 33
    .line 34
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p1, v2, p2}, Landroid/view/View;->measure(II)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget v2, p0, La/m5l;->e:I

    .line 43
    .line 44
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {p1, v2, p2}, Landroid/view/View;->measure(II)V

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-direct {p0}, La/m5l;->getTeamDelegate()La/z6p0;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    iget v5, p0, La/m5l;->f:I

    .line 60
    .line 61
    sub-int/2addr v4, v5

    .line 62
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v4}, La/z6p0;->c(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    sub-int/2addr p1, v5

    .line 73
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iget p2, p0, La/m5l;->c:I

    .line 78
    .line 79
    invoke-static {p2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    iget-object v2, p0, La/m5l;->h:Lorg/xplatform/cyber/dota/impl/presentation/common/DotaAdditionalTeamInformationView;

    .line 84
    .line 85
    invoke-virtual {v2, p1, p2}, Landroid/view/View;->measure(II)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iget p2, p0, La/m5l;->d:I

    .line 93
    .line 94
    add-int/2addr p1, p2

    .line 95
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final setAdditionalInformation(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/h00;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/m5l;->h:Lorg/xplatform/cyber/dota/impl/presentation/common/DotaAdditionalTeamInformationView;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/dota/impl/presentation/common/DotaAdditionalTeamInformationView;->setItemParams(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setHeroes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/l4l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/m5l;->a:La/dc3;

    .line 5
    .line 6
    iget-object p0, p0, La/dc3;->c:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsHeroesTableView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsHeroesTableView;->setHeroes(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setHeroesItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/v4l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/m5l;->a:La/dc3;

    .line 5
    .line 6
    iget-object p0, p0, La/dc3;->c:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsHeroesTableView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsHeroesTableView;->setHeroesItems(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/k5l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/m5l;->a:La/dc3;

    .line 5
    .line 6
    iget-object v0, v0, La/dc3;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsTableView;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lorg/xplatform/cyber/dota/impl/presentation/statistic/items/view/DotaItemsTableView;->setItems(Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/m5l;->j:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    new-instance v0, La/mx2;

    .line 22
    .line 23
    const/4 v1, 0x6

    .line 24
    invoke-direct {v0, p0, p0, v1}, La/mx2;-><init>(Landroid/view/ViewGroup;Landroid/view/ViewGroup;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iput-object p1, p0, La/m5l;->j:Ljava/util/List;

    .line 31
    .line 32
    return-void
.end method

.method public final setScrollViewKeeper(La/amw;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/m5l;->i:La/amw;

    .line 5
    .line 6
    return-void
.end method

.method public final setTeam(La/xnp0;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/m5l;->getTeamDelegate()La/z6p0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p1, La/xnp0;->a:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p1, La/xnp0;->b:Ljava/lang/String;

    .line 11
    .line 12
    iget-boolean v3, p1, La/xnp0;->c:Z

    .line 13
    .line 14
    iget-boolean v5, p1, La/xnp0;->g:Z

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    invoke-virtual/range {v0 .. v5}, La/z6p0;->d(Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
