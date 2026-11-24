.class public final Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/bu20;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public g:La/jo8;

.field public h:La/sao;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 80
    invoke-direct {p0, p1, v0}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    new-instance p2, La/bu20;

    .line 8
    .line 9
    invoke-direct {p2, p0}, La/bu20;-><init>(Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;)V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->a:La/bu20;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const v0, 0x7f0706b7

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iput p2, p0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->b:I

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    const v0, 0x7f070660

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    iput p2, p0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c:I

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    const v0, 0x7f070705

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    iput p2, p0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->d:I

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const v0, 0x7f0706f8

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    iput p2, p0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->e:I

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const p2, 0x7f07072d

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iput p1, p0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->f:I

    .line 78
    .line 79
    return-void
.end method

.method public static b(Ljava/util/ArrayList;Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;La/bbo;III)V
    .locals 6

    .line 1
    iget-object v0, p2, La/bbo;->a:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->setDescriptionMarket(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p2, La/bbo;->b:Ljava/lang/CharSequence;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->setCoefficientMarket(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p2, La/bbo;->c:La/j0d;

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->setCoefficientState(La/j0d;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    iget-boolean v0, p2, La/bbo;->d:Z

    .line 20
    .line 21
    iget-object v1, p1, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->c:La/qr20;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, La/qr20;->j(Z)V

    .line 24
    .line 25
    .line 26
    iget-boolean v0, p2, La/bbo;->e:Z

    .line 27
    .line 28
    invoke-virtual {v1, v0}, La/qr20;->l(Z)V

    .line 29
    .line 30
    .line 31
    iget-boolean p2, p2, La/bbo;->f:Z

    .line 32
    .line 33
    invoke-virtual {v1, p2}, La/qr20;->i(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p1, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->a:La/pr20;

    .line 37
    .line 38
    iput-boolean p2, v0, La/pr20;->b:Z

    .line 39
    .line 40
    iget-object v0, v0, La/pr20;->a:La/nr20;

    .line 41
    .line 42
    xor-int/lit8 p2, p2, 0x1

    .line 43
    .line 44
    invoke-virtual {v0, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 45
    .line 46
    .line 47
    const/4 p2, 0x0

    .line 48
    invoke-virtual {p1, p2}, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    sget-object v5, La/vao;->a:La/vao;

    .line 52
    .line 53
    new-instance v0, La/uao;

    .line 54
    .line 55
    move-object v1, p1

    .line 56
    move v2, p3

    .line 57
    move v3, p4

    .line 58
    move v4, p5

    .line 59
    invoke-direct/range {v0 .. v5}, La/uao;-><init>(Landroid/view/View;IIILa/vao;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;IIIIILa/bbo;)V
    .locals 7

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->a:La/bu20;

    .line 2
    .line 3
    iget-object v0, p0, La/bu20;->d:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/util/List;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v2, p0, La/bu20;->a:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 23
    .line 24
    invoke-static {p3, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    new-instance v3, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;

    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v6, 0x6

    .line 43
    invoke-direct {v3, v4, v5, v6}, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, La/jmu0;->d()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 51
    .line 52
    .line 53
    const-string v4, "marketCoefficient"

    .line 54
    .line 55
    invoke-virtual {v3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/16 v4, 0x8

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    sget-object v4, La/ymx;->e:La/ymx;

    .line 64
    .line 65
    new-instance v5, La/au20;

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    invoke-direct {v5, p0, p2, p3, v6}, La/au20;-><init>(La/bu20;IIB)V

    .line 69
    .line 70
    .line 71
    invoke-static {v3, v4, v5}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 72
    .line 73
    .line 74
    new-instance v4, La/au20;

    .line 75
    .line 76
    const/4 v5, 0x1

    .line 77
    invoke-direct {v4, p0, p2, p3, v5}, La/au20;-><init>(La/bu20;IIB)V

    .line 78
    .line 79
    .line 80
    new-instance p0, La/djj;

    .line 81
    .line 82
    invoke-direct {p0, v4}, La/djj;-><init>(La/au20;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-object p3, p7

    .line 102
    move-object p2, v3

    .line 103
    invoke-static/range {p1 .. p6}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->b(Ljava/util/ArrayList;Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;La/bbo;III)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final c(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->a:La/bu20;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/bu20;->g:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    iput-object p2, p0, La/bu20;->h:Lkotlin/jvm/functions/Function2;

    .line 9
    .line 10
    return-void
.end method

.method public final getMarketGroupBindHelper()La/bu20;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->a:La/bu20;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onMeasure(II)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    iget-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->h:La/sao;

    .line 8
    .line 9
    iget v3, v1, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->b:I

    .line 10
    .line 11
    iget v4, v1, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->d:I

    .line 12
    .line 13
    iget v5, v1, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->c:I

    .line 14
    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    iget-object v0, v0, La/sao;->a:Ljava/util/List;

    .line 18
    .line 19
    if-eqz v0, :cond_5

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_5

    .line 30
    .line 31
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, La/rao;

    .line 36
    .line 37
    iget-object v7, v0, La/rao;->a:La/qao;

    .line 38
    .line 39
    const-string v8, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 40
    .line 41
    const/high16 v9, 0x40000000    # 2.0f

    .line 42
    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    iget-object v10, v7, La/qao;->a:Landroid/view/View;

    .line 46
    .line 47
    if-eqz v10, :cond_2

    .line 48
    .line 49
    iget v11, v7, La/qao;->c:I

    .line 50
    .line 51
    iget v7, v7, La/qao;->b:I

    .line 52
    .line 53
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 54
    .line 55
    .line 56
    move-result-object v12

    .line 57
    if-eqz v12, :cond_1

    .line 58
    .line 59
    check-cast v12, Landroid/widget/FrameLayout$LayoutParams;

    .line 60
    .line 61
    add-int v13, v5, v4

    .line 62
    .line 63
    mul-int/2addr v13, v11

    .line 64
    mul-int/2addr v7, v3

    .line 65
    add-int/2addr v7, v13

    .line 66
    iput v7, v12, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 67
    .line 68
    invoke-virtual {v10, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v5, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    move/from16 v11, p1

    .line 76
    .line 77
    invoke-virtual {v10, v11, v7}, Landroid/view/View;->measure(II)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    invoke-static {v8}, La/hny;->u(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    move/from16 v11, p1

    .line 86
    .line 87
    :goto_0
    iget-object v7, v0, La/rao;->b:Ljava/util/List;

    .line 88
    .line 89
    iget v10, v0, La/rao;->c:I

    .line 90
    .line 91
    add-int/lit8 v0, v10, -0x1

    .line 92
    .line 93
    iget v12, v1, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->f:I

    .line 94
    .line 95
    mul-int/2addr v0, v12

    .line 96
    iget v13, v1, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->e:I

    .line 97
    .line 98
    add-int/2addr v0, v13

    .line 99
    sub-int v0, v2, v0

    .line 100
    .line 101
    div-int v13, v0, v10

    .line 102
    .line 103
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_0

    .line 112
    .line 113
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, La/uao;

    .line 118
    .line 119
    iget-object v14, v0, La/uao;->e:La/vao;

    .line 120
    .line 121
    iget v15, v0, La/uao;->c:I

    .line 122
    .line 123
    sget-object v9, La/vao;->c:La/vao;

    .line 124
    .line 125
    if-ne v14, v9, :cond_3

    .line 126
    .line 127
    sub-int v9, v10, v15

    .line 128
    .line 129
    mul-int/2addr v9, v13

    .line 130
    goto :goto_2

    .line 131
    :cond_3
    move v9, v13

    .line 132
    :goto_2
    iget-object v14, v0, La/uao;->a:Landroid/view/View;

    .line 133
    .line 134
    move/from16 v16, v4

    .line 135
    .line 136
    iget v4, v0, La/uao;->b:I

    .line 137
    .line 138
    iget v0, v0, La/uao;->d:I

    .line 139
    .line 140
    :try_start_0
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 141
    .line 142
    .line 143
    move-result-object v17

    .line 144
    if-eqz v17, :cond_4

    .line 145
    .line 146
    move/from16 v18, v0

    .line 147
    .line 148
    move-object/from16 v0, v17

    .line 149
    .line 150
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 151
    .line 152
    move/from16 v17, v4

    .line 153
    .line 154
    const/4 v4, 0x3

    .line 155
    iput v4, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 156
    .line 157
    mul-int v4, v15, v9

    .line 158
    .line 159
    add-int/lit8 v15, v15, 0x1

    .line 160
    .line 161
    mul-int/2addr v15, v12

    .line 162
    add-int/2addr v15, v4

    .line 163
    iput v15, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 164
    .line 165
    mul-int v4, v17, v3

    .line 166
    .line 167
    mul-int v15, v5, v18

    .line 168
    .line 169
    add-int/2addr v15, v4

    .line 170
    add-int/lit8 v4, v18, -0x1

    .line 171
    .line 172
    mul-int v4, v4, v16

    .line 173
    .line 174
    add-int/2addr v4, v15

    .line 175
    iput v4, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 176
    .line 177
    invoke-virtual {v14, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 178
    .line 179
    .line 180
    const/high16 v4, 0x40000000    # 2.0f

    .line 181
    .line 182
    :try_start_1
    invoke-static {v9, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    invoke-virtual {v14, v0, v9}, Landroid/view/View;->measure(II)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :catch_0
    move-exception v0

    .line 195
    goto :goto_3

    .line 196
    :catch_1
    move-exception v0

    .line 197
    const/high16 v4, 0x40000000    # 2.0f

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_4
    const/high16 v4, 0x40000000    # 2.0f

    .line 201
    .line 202
    new-instance v0, Ljava/lang/NullPointerException;

    .line 203
    .line 204
    invoke-direct {v0, v8}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 208
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 209
    .line 210
    .line 211
    :goto_4
    move v9, v4

    .line 212
    move/from16 v4, v16

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_5
    move/from16 v16, v4

    .line 216
    .line 217
    iget-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->h:La/sao;

    .line 218
    .line 219
    const/4 v4, 0x0

    .line 220
    if-eqz v0, :cond_6

    .line 221
    .line 222
    iget v6, v0, La/sao;->c:I

    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_6
    move v6, v4

    .line 226
    :goto_5
    mul-int/2addr v3, v6

    .line 227
    add-int v5, v5, v16

    .line 228
    .line 229
    if-eqz v0, :cond_7

    .line 230
    .line 231
    iget v4, v0, La/sao;->d:I

    .line 232
    .line 233
    :cond_7
    mul-int/2addr v5, v4

    .line 234
    add-int/2addr v5, v3

    .line 235
    invoke-virtual {v1, v2, v5}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 236
    .line 237
    .line 238
    return-void
.end method

.method public final setExpandedListener(La/xdr;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/xdr;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->a:La/bu20;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/bu20;->j:La/xdr;

    .line 13
    .line 14
    return-void
.end method

.method public final setMarkets(La/jo8;)V
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, v8, La/jo8;->a:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-byte v9, v8, La/jo8;->b:B

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v10, 0x0

    .line 17
    move v3, v10

    .line 18
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, La/ev20;

    .line 29
    .line 30
    iget-object v5, v4, La/ev20;->b:Ljava/util/List;

    .line 31
    .line 32
    iget v4, v4, La/ev20;->c:I

    .line 33
    .line 34
    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;I)Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    add-int/2addr v3, v4

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v3

    .line 49
    const/4 v11, 0x1

    .line 50
    if-le v2, v9, :cond_1

    .line 51
    .line 52
    move v2, v11

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move v2, v10

    .line 55
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    move v4, v10

    .line 60
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_5

    .line 65
    .line 66
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, La/ev20;

    .line 71
    .line 72
    iget-object v6, v5, La/ev20;->b:Ljava/util/List;

    .line 73
    .line 74
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    iget v7, v5, La/ev20;->c:I

    .line 79
    .line 80
    div-int/2addr v6, v7

    .line 81
    add-int/2addr v4, v11

    .line 82
    const/16 v7, 0x9

    .line 83
    .line 84
    if-ne v4, v7, :cond_4

    .line 85
    .line 86
    if-ne v6, v11, :cond_3

    .line 87
    .line 88
    iget-object v2, v5, La/ev20;->b:Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-ne v2, v11, :cond_3

    .line 95
    .line 96
    :cond_2
    move v2, v11

    .line 97
    goto :goto_3

    .line 98
    :cond_3
    if-ne v6, v11, :cond_2

    .line 99
    .line 100
    move v2, v10

    .line 101
    goto :goto_3

    .line 102
    :cond_4
    add-int/2addr v4, v6

    .line 103
    goto :goto_2

    .line 104
    :cond_5
    :goto_3
    iget-boolean v3, v8, La/jo8;->c:Z

    .line 105
    .line 106
    if-eqz v3, :cond_6

    .line 107
    .line 108
    if-eqz v2, :cond_6

    .line 109
    .line 110
    move v12, v11

    .line 111
    goto :goto_4

    .line 112
    :cond_6
    move v12, v10

    .line 113
    :goto_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    const/4 v13, 0x6

    .line 118
    const/16 v14, 0x8

    .line 119
    .line 120
    iget-object v15, v0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->a:La/bu20;

    .line 121
    .line 122
    const/4 v3, 0x0

    .line 123
    const/4 v4, 0x3

    .line 124
    if-eqz v2, :cond_9

    .line 125
    .line 126
    iget-boolean v2, v8, La/jo8;->d:Z

    .line 127
    .line 128
    if-eqz v2, :cond_9

    .line 129
    .line 130
    new-instance v1, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    move v2, v10

    .line 136
    :goto_5
    if-ge v2, v4, :cond_8

    .line 137
    .line 138
    iget-object v5, v15, La/bu20;->a:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 139
    .line 140
    iget-object v6, v15, La/bu20;->e:Ljava/util/LinkedHashMap;

    .line 141
    .line 142
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    invoke-virtual {v6, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    check-cast v7, Lorg/xplatform/uikit/components/market/view/DsMarketBlocked;

    .line 151
    .line 152
    if-nez v7, :cond_7

    .line 153
    .line 154
    new-instance v7, Lorg/xplatform/uikit/components/market/view/DsMarketBlocked;

    .line 155
    .line 156
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-direct {v7, v9, v3, v13}, Lorg/xplatform/uikit/components/market/view/DsMarketBlocked;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 164
    .line 165
    .line 166
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    invoke-interface {v6, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 174
    .line 175
    .line 176
    :cond_7
    invoke-virtual {v7, v10}, Landroid/view/View;->setVisibility(I)V

    .line 177
    .line 178
    .line 179
    new-instance v16, La/uao;

    .line 180
    .line 181
    const/16 v20, 0x1

    .line 182
    .line 183
    sget-object v21, La/vao;->b:La/vao;

    .line 184
    .line 185
    const/16 v18, 0x0

    .line 186
    .line 187
    move/from16 v19, v2

    .line 188
    .line 189
    move-object/from16 v17, v7

    .line 190
    .line 191
    invoke-direct/range {v16 .. v21}, La/uao;-><init>(Landroid/view/View;IIILa/vao;)V

    .line 192
    .line 193
    .line 194
    move-object/from16 v2, v16

    .line 195
    .line 196
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    add-int/lit8 v2, v19, 0x1

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_8
    new-instance v16, La/rao;

    .line 203
    .line 204
    const/16 v20, -0x1

    .line 205
    .line 206
    sget-object v21, La/vao;->b:La/vao;

    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    const/16 v19, 0x3

    .line 211
    .line 212
    move-object/from16 v18, v1

    .line 213
    .line 214
    invoke-direct/range {v16 .. v21}, La/rao;-><init>(La/qao;Ljava/util/List;IILa/vao;)V

    .line 215
    .line 216
    .line 217
    new-instance v1, La/sao;

    .line 218
    .line 219
    invoke-static/range {v16 .. v16}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    sget-object v4, La/tao;->c:La/tao;

    .line 224
    .line 225
    invoke-direct {v1, v2, v4, v11, v11}, La/sao;-><init>(Ljava/util/List;La/tao;II)V

    .line 226
    .line 227
    .line 228
    move-object/from16 v19, v3

    .line 229
    .line 230
    move/from16 v24, v12

    .line 231
    .line 232
    goto/16 :goto_26

    .line 233
    .line 234
    :cond_9
    move v2, v10

    .line 235
    :goto_6
    if-ge v2, v4, :cond_b

    .line 236
    .line 237
    iget-object v5, v15, La/bu20;->e:Ljava/util/LinkedHashMap;

    .line 238
    .line 239
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    invoke-virtual {v5, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    check-cast v5, Lorg/xplatform/uikit/components/market/view/DsMarketBlocked;

    .line 248
    .line 249
    if-eqz v5, :cond_a

    .line 250
    .line 251
    invoke-virtual {v5, v14}, Landroid/view/View;->setVisibility(I)V

    .line 252
    .line 253
    .line 254
    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_b
    new-instance v2, Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 260
    .line 261
    .line 262
    new-instance v4, La/hie0;

    .line 263
    .line 264
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 265
    .line 266
    .line 267
    sget-object v5, La/tao;->a:La/tao;

    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object v16

    .line 273
    move v1, v10

    .line 274
    move/from16 v19, v1

    .line 275
    .line 276
    move/from16 v21, v19

    .line 277
    .line 278
    :goto_7
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    if-eqz v6, :cond_34

    .line 283
    .line 284
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    add-int/lit8 v17, v1, 0x1

    .line 289
    .line 290
    if-ltz v1, :cond_33

    .line 291
    .line 292
    check-cast v6, La/ev20;

    .line 293
    .line 294
    add-int v7, v19, v21

    .line 295
    .line 296
    add-int/2addr v7, v11

    .line 297
    if-lt v7, v9, :cond_d

    .line 298
    .line 299
    if-eqz v12, :cond_c

    .line 300
    .line 301
    iget-boolean v1, v4, La/hie0;->a:Z

    .line 302
    .line 303
    if-nez v1, :cond_c

    .line 304
    .line 305
    invoke-virtual {v15}, La/bu20;->a()La/pkm;

    .line 306
    .line 307
    .line 308
    move-result-object v18

    .line 309
    new-instance v17, La/uao;

    .line 310
    .line 311
    sget-object v22, La/vao;->c:La/vao;

    .line 312
    .line 313
    const/16 v20, 0x0

    .line 314
    .line 315
    invoke-direct/range {v17 .. v22}, La/uao;-><init>(Landroid/view/View;IIILa/vao;)V

    .line 316
    .line 317
    .line 318
    move/from16 v7, v19

    .line 319
    .line 320
    invoke-static/range {v17 .. v17}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v24

    .line 324
    move-object/from16 v27, v22

    .line 325
    .line 326
    new-instance v22, La/rao;

    .line 327
    .line 328
    const/16 v23, 0x0

    .line 329
    .line 330
    const/16 v25, 0x1

    .line 331
    .line 332
    const/16 v26, 0x0

    .line 333
    .line 334
    invoke-direct/range {v22 .. v27}, La/rao;-><init>(La/qao;Ljava/util/List;IILa/vao;)V

    .line 335
    .line 336
    .line 337
    move-object/from16 v1, v22

    .line 338
    .line 339
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    add-int/lit8 v19, v7, 0x1

    .line 343
    .line 344
    goto :goto_8

    .line 345
    :cond_c
    move/from16 v7, v19

    .line 346
    .line 347
    move/from16 v19, v7

    .line 348
    .line 349
    :goto_8
    move-object v1, v2

    .line 350
    move/from16 v24, v12

    .line 351
    .line 352
    move/from16 v4, v19

    .line 353
    .line 354
    move/from16 v2, v21

    .line 355
    .line 356
    move-object/from16 v19, v3

    .line 357
    .line 358
    goto/16 :goto_25

    .line 359
    .line 360
    :cond_d
    move/from16 v7, v19

    .line 361
    .line 362
    move/from16 v18, v21

    .line 363
    .line 364
    iget-object v3, v0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->g:La/jo8;

    .line 365
    .line 366
    if-eqz v3, :cond_e

    .line 367
    .line 368
    iget-object v3, v3, La/jo8;->a:Ljava/util/ArrayList;

    .line 369
    .line 370
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    check-cast v3, La/ev20;

    .line 375
    .line 376
    goto :goto_9

    .line 377
    :cond_e
    const/4 v3, 0x0

    .line 378
    :goto_9
    iget-object v14, v6, La/ev20;->a:La/cwr0;

    .line 379
    .line 380
    iget v11, v6, La/ev20;->c:I

    .line 381
    .line 382
    if-eqz v3, :cond_f

    .line 383
    .line 384
    iget-object v13, v3, La/ev20;->a:La/cwr0;

    .line 385
    .line 386
    goto :goto_a

    .line 387
    :cond_f
    const/4 v13, 0x0

    .line 388
    :goto_a
    if-eqz v3, :cond_10

    .line 389
    .line 390
    iget-object v10, v3, La/ev20;->b:Ljava/util/List;

    .line 391
    .line 392
    if-eqz v10, :cond_10

    .line 393
    .line 394
    move/from16 v24, v1

    .line 395
    .line 396
    iget v1, v3, La/ev20;->c:I

    .line 397
    .line 398
    invoke-static {v10, v1, v1}, Lkotlin/collections/CollectionsKt;->Q0(Ljava/lang/Iterable;II)Ljava/util/ArrayList;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    move-object v10, v1

    .line 403
    goto :goto_b

    .line 404
    :cond_10
    move/from16 v24, v1

    .line 405
    .line 406
    const/4 v10, 0x0

    .line 407
    :goto_b
    iget-object v1, v6, La/ev20;->b:Ljava/util/List;

    .line 408
    .line 409
    invoke-static {v1, v11}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;I)Ljava/util/ArrayList;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    move-object/from16 v25, v1

    .line 414
    .line 415
    iget-object v1, v0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->g:La/jo8;

    .line 416
    .line 417
    if-eqz v1, :cond_11

    .line 418
    .line 419
    iget-byte v1, v1, La/jo8;->b:B

    .line 420
    .line 421
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    goto :goto_c

    .line 426
    :cond_11
    const/4 v1, 0x0

    .line 427
    :goto_c
    if-eqz v3, :cond_12

    .line 428
    .line 429
    iget v3, v3, La/ev20;->c:I

    .line 430
    .line 431
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    goto :goto_d

    .line 436
    :cond_12
    const/4 v3, 0x0

    .line 437
    :goto_d
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->size()I

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-eqz v10, :cond_13

    .line 442
    .line 443
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 444
    .line 445
    .line 446
    move-result v26

    .line 447
    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 448
    .line 449
    .line 450
    move-result-object v26

    .line 451
    goto :goto_e

    .line 452
    :cond_13
    const/16 v26, 0x0

    .line 453
    .line 454
    :goto_e
    if-nez v1, :cond_14

    .line 455
    .line 456
    goto :goto_f

    .line 457
    :cond_14
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    if-ne v9, v1, :cond_18

    .line 462
    .line 463
    if-nez v3, :cond_15

    .line 464
    .line 465
    goto :goto_f

    .line 466
    :cond_15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    if-ne v11, v1, :cond_18

    .line 471
    .line 472
    if-nez v26, :cond_16

    .line 473
    .line 474
    goto :goto_f

    .line 475
    :cond_16
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Integer;->intValue()I

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    if-eq v0, v1, :cond_17

    .line 480
    .line 481
    goto :goto_f

    .line 482
    :cond_17
    sget-object v0, La/tao;->b:La/tao;

    .line 483
    .line 484
    goto :goto_10

    .line 485
    :cond_18
    :goto_f
    sget-object v0, La/tao;->c:La/tao;

    .line 486
    .line 487
    :goto_10
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 492
    .line 493
    .line 494
    move-result v3

    .line 495
    if-le v1, v3, :cond_19

    .line 496
    .line 497
    goto :goto_11

    .line 498
    :cond_19
    move-object v0, v5

    .line 499
    :goto_11
    invoke-virtual {v14, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    if-eqz v1, :cond_1b

    .line 504
    .line 505
    sget-object v1, La/tao;->a:La/tao;

    .line 506
    .line 507
    if-eq v0, v1, :cond_1a

    .line 508
    .line 509
    goto :goto_13

    .line 510
    :cond_1a
    move-object/from16 v26, v2

    .line 511
    .line 512
    move/from16 v2, v18

    .line 513
    .line 514
    const/4 v5, 0x0

    .line 515
    :goto_12
    const/4 v13, 0x0

    .line 516
    move/from16 v18, v11

    .line 517
    .line 518
    const/4 v11, 0x6

    .line 519
    goto/16 :goto_18

    .line 520
    .line 521
    :cond_1b
    :goto_13
    instance-of v1, v14, La/io8;

    .line 522
    .line 523
    if-eqz v1, :cond_1c

    .line 524
    .line 525
    move-object v1, v14

    .line 526
    check-cast v1, La/io8;

    .line 527
    .line 528
    goto :goto_14

    .line 529
    :cond_1c
    const/4 v1, 0x0

    .line 530
    :goto_14
    if-eqz v1, :cond_1e

    .line 531
    .line 532
    iget-object v1, v15, La/bu20;->a:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 533
    .line 534
    iget-object v3, v15, La/bu20;->b:Ljava/util/LinkedHashMap;

    .line 535
    .line 536
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 537
    .line 538
    .line 539
    move-result-object v5

    .line 540
    invoke-virtual {v3, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    check-cast v5, La/oao;

    .line 545
    .line 546
    if-nez v5, :cond_1d

    .line 547
    .line 548
    new-instance v5, La/oao;

    .line 549
    .line 550
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 551
    .line 552
    .line 553
    move-result-object v13

    .line 554
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    invoke-direct {v5, v13}, La/oao;-><init>(Landroid/content/Context;)V

    .line 558
    .line 559
    .line 560
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 561
    .line 562
    .line 563
    move-result-object v13

    .line 564
    invoke-interface {v3, v13, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 568
    .line 569
    .line 570
    :cond_1d
    const/4 v1, 0x0

    .line 571
    invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V

    .line 572
    .line 573
    .line 574
    move-object v1, v14

    .line 575
    check-cast v1, La/io8;

    .line 576
    .line 577
    iget-object v3, v1, La/io8;->q:Ljava/lang/String;

    .line 578
    .line 579
    iget-object v1, v1, La/io8;->r:Ljava/lang/String;

    .line 580
    .line 581
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    iput-object v3, v5, La/oao;->e:Ljava/lang/String;

    .line 585
    .line 586
    iput-object v1, v5, La/oao;->f:Ljava/lang/String;

    .line 587
    .line 588
    move-object/from16 v26, v2

    .line 589
    .line 590
    move/from16 v2, v18

    .line 591
    .line 592
    goto :goto_12

    .line 593
    :cond_1e
    instance-of v1, v14, La/ho8;

    .line 594
    .line 595
    if-eqz v1, :cond_1f

    .line 596
    .line 597
    move-object v1, v14

    .line 598
    check-cast v1, La/ho8;

    .line 599
    .line 600
    goto :goto_15

    .line 601
    :cond_1f
    const/4 v1, 0x0

    .line 602
    :goto_15
    if-eqz v1, :cond_21

    .line 603
    .line 604
    iget-object v1, v15, La/bu20;->a:Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;

    .line 605
    .line 606
    iget-object v3, v15, La/bu20;->c:Ljava/util/LinkedHashMap;

    .line 607
    .line 608
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 609
    .line 610
    .line 611
    move-result-object v5

    .line 612
    invoke-virtual {v3, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v5

    .line 616
    check-cast v5, La/pao;

    .line 617
    .line 618
    if-nez v5, :cond_20

    .line 619
    .line 620
    new-instance v5, La/pao;

    .line 621
    .line 622
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 623
    .line 624
    .line 625
    move-result-object v13

    .line 626
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    invoke-direct {v5, v13}, La/pao;-><init>(Landroid/content/Context;)V

    .line 630
    .line 631
    .line 632
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 633
    .line 634
    .line 635
    move-result-object v13

    .line 636
    invoke-interface {v3, v13, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    sget-object v3, La/ymx;->e:La/ymx;

    .line 640
    .line 641
    new-instance v13, La/g18;

    .line 642
    .line 643
    move-object/from16 v26, v2

    .line 644
    .line 645
    move/from16 v2, v18

    .line 646
    .line 647
    move/from16 v18, v11

    .line 648
    .line 649
    const/4 v11, 0x6

    .line 650
    invoke-direct {v13, v15, v5, v2, v11}, La/g18;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 651
    .line 652
    .line 653
    invoke-static {v5, v3, v13}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 657
    .line 658
    .line 659
    :goto_16
    const/4 v13, 0x0

    .line 660
    goto :goto_17

    .line 661
    :cond_20
    move-object/from16 v26, v2

    .line 662
    .line 663
    move/from16 v2, v18

    .line 664
    .line 665
    move/from16 v18, v11

    .line 666
    .line 667
    const/4 v11, 0x6

    .line 668
    goto :goto_16

    .line 669
    :goto_17
    invoke-virtual {v5, v13}, Landroid/view/View;->setVisibility(I)V

    .line 670
    .line 671
    .line 672
    move-object v1, v14

    .line 673
    check-cast v1, La/ho8;

    .line 674
    .line 675
    iget-object v1, v1, La/ho8;->q:Ljava/lang/String;

    .line 676
    .line 677
    invoke-virtual {v5, v1}, La/pao;->b(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    goto :goto_18

    .line 681
    :cond_21
    move-object/from16 v26, v2

    .line 682
    .line 683
    move/from16 v2, v18

    .line 684
    .line 685
    const/4 v13, 0x0

    .line 686
    move/from16 v18, v11

    .line 687
    .line 688
    const/4 v11, 0x6

    .line 689
    const/4 v5, 0x0

    .line 690
    :goto_18
    instance-of v1, v14, La/ho8;

    .line 691
    .line 692
    new-instance v14, La/qao;

    .line 693
    .line 694
    invoke-direct {v14, v5, v7, v2, v1}, La/qao;-><init>(Landroid/view/View;IIZ)V

    .line 695
    .line 696
    .line 697
    add-int/lit8 v31, v2, 0x1

    .line 698
    .line 699
    new-instance v1, Ljava/util/ArrayList;

    .line 700
    .line 701
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 702
    .line 703
    .line 704
    new-instance v2, La/kie0;

    .line 705
    .line 706
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 707
    .line 708
    .line 709
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 710
    .line 711
    .line 712
    move-result-object v22

    .line 713
    move/from16 v29, v7

    .line 714
    .line 715
    move v3, v13

    .line 716
    :goto_19
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    .line 717
    .line 718
    .line 719
    move-result v5

    .line 720
    if-eqz v5, :cond_32

    .line 721
    .line 722
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v5

    .line 726
    add-int/lit8 v23, v3, 0x1

    .line 727
    .line 728
    if-ltz v3, :cond_31

    .line 729
    .line 730
    check-cast v5, Ljava/util/List;

    .line 731
    .line 732
    if-eqz v10, :cond_22

    .line 733
    .line 734
    invoke-static {v3, v10}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v7

    .line 738
    check-cast v7, Ljava/util/List;

    .line 739
    .line 740
    goto :goto_1a

    .line 741
    :cond_22
    const/4 v7, 0x0

    .line 742
    :goto_1a
    add-int v25, v29, v31

    .line 743
    .line 744
    add-int/lit8 v11, v25, 0x1

    .line 745
    .line 746
    if-lt v11, v9, :cond_23

    .line 747
    .line 748
    const/4 v11, 0x1

    .line 749
    goto :goto_1b

    .line 750
    :cond_23
    move v11, v13

    .line 751
    :goto_1b
    add-int/lit8 v13, v25, 0x2

    .line 752
    .line 753
    if-lt v13, v9, :cond_24

    .line 754
    .line 755
    const/4 v13, 0x1

    .line 756
    :goto_1c
    move-object/from16 v25, v10

    .line 757
    .line 758
    goto :goto_1d

    .line 759
    :cond_24
    const/4 v13, 0x0

    .line 760
    goto :goto_1c

    .line 761
    :goto_1d
    invoke-static {v5}, La/q3d;->i(Ljava/util/List;)I

    .line 762
    .line 763
    .line 764
    move-result v10

    .line 765
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 766
    .line 767
    .line 768
    move-result-object v33

    .line 769
    const/4 v5, 0x0

    .line 770
    :goto_1e
    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->hasNext()Z

    .line 771
    .line 772
    .line 773
    move-result v27

    .line 774
    if-eqz v27, :cond_2f

    .line 775
    .line 776
    invoke-interface/range {v33 .. v33}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v27

    .line 780
    add-int/lit8 v34, v5, 0x1

    .line 781
    .line 782
    if-ltz v5, :cond_2e

    .line 783
    .line 784
    check-cast v27, La/bbo;

    .line 785
    .line 786
    if-eqz v7, :cond_25

    .line 787
    .line 788
    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v28

    .line 792
    check-cast v28, La/bbo;

    .line 793
    .line 794
    move/from16 v35, v11

    .line 795
    .line 796
    move-object/from16 v11, v28

    .line 797
    .line 798
    goto :goto_1f

    .line 799
    :cond_25
    move/from16 v35, v11

    .line 800
    .line 801
    const/4 v11, 0x0

    .line 802
    :goto_1f
    mul-int v28, v3, v18

    .line 803
    .line 804
    add-int v28, v28, v5

    .line 805
    .line 806
    if-eqz v12, :cond_26

    .line 807
    .line 808
    if-eqz v35, :cond_26

    .line 809
    .line 810
    if-ne v10, v5, :cond_26

    .line 811
    .line 812
    move/from16 v36, v3

    .line 813
    .line 814
    const/4 v3, 0x1

    .line 815
    iput-boolean v3, v4, La/hie0;->a:Z

    .line 816
    .line 817
    iget v11, v2, La/kie0;->a:I

    .line 818
    .line 819
    sub-int/2addr v11, v3

    .line 820
    iput v11, v2, La/kie0;->a:I

    .line 821
    .line 822
    invoke-virtual {v15}, La/bu20;->a()La/pkm;

    .line 823
    .line 824
    .line 825
    move-result-object v28

    .line 826
    sget-object v32, La/vao;->c:La/vao;

    .line 827
    .line 828
    new-instance v27, La/uao;

    .line 829
    .line 830
    move/from16 v30, v5

    .line 831
    .line 832
    invoke-direct/range {v27 .. v32}, La/uao;-><init>(Landroid/view/View;IIILa/vao;)V

    .line 833
    .line 834
    .line 835
    move-object/from16 v3, v27

    .line 836
    .line 837
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move v8, v12

    .line 841
    move-object v12, v2

    .line 842
    move/from16 v2, v24

    .line 843
    .line 844
    move/from16 v24, v8

    .line 845
    .line 846
    const/16 v19, 0x0

    .line 847
    .line 848
    move-object v8, v0

    .line 849
    move-object/from16 v39, v7

    .line 850
    .line 851
    move-object/from16 v37, v26

    .line 852
    .line 853
    move/from16 v38, v36

    .line 854
    .line 855
    move-object/from16 v0, p0

    .line 856
    .line 857
    move/from16 v26, v13

    .line 858
    .line 859
    move-object/from16 v36, v14

    .line 860
    .line 861
    move-object v13, v4

    .line 862
    move-object v14, v6

    .line 863
    goto/16 :goto_22

    .line 864
    .line 865
    :cond_26
    move/from16 v36, v3

    .line 866
    .line 867
    sget-object v3, La/tao;->c:La/tao;

    .line 868
    .line 869
    if-ne v0, v3, :cond_27

    .line 870
    .line 871
    move v3, v12

    .line 872
    move-object v12, v2

    .line 873
    move/from16 v2, v24

    .line 874
    .line 875
    move/from16 v24, v3

    .line 876
    .line 877
    const/16 v19, 0x0

    .line 878
    .line 879
    move-object v8, v0

    .line 880
    move-object/from16 v39, v7

    .line 881
    .line 882
    move-object/from16 v37, v26

    .line 883
    .line 884
    move-object/from16 v7, v27

    .line 885
    .line 886
    move/from16 v3, v28

    .line 887
    .line 888
    move/from16 v38, v36

    .line 889
    .line 890
    move-object/from16 v0, p0

    .line 891
    .line 892
    move/from16 v26, v13

    .line 893
    .line 894
    move-object/from16 v36, v14

    .line 895
    .line 896
    move-object v13, v4

    .line 897
    move-object v14, v6

    .line 898
    move/from16 v4, v29

    .line 899
    .line 900
    move/from16 v6, v31

    .line 901
    .line 902
    invoke-virtual/range {v0 .. v7}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->a(Ljava/util/ArrayList;IIIIILa/bbo;)V

    .line 903
    .line 904
    .line 905
    goto/16 :goto_22

    .line 906
    .line 907
    :cond_27
    move v3, v12

    .line 908
    move-object v12, v2

    .line 909
    move/from16 v2, v24

    .line 910
    .line 911
    move/from16 v24, v3

    .line 912
    .line 913
    move-object v8, v0

    .line 914
    move-object/from16 v39, v7

    .line 915
    .line 916
    move-object/from16 v37, v26

    .line 917
    .line 918
    move-object/from16 v7, v27

    .line 919
    .line 920
    move/from16 v3, v28

    .line 921
    .line 922
    move/from16 v38, v36

    .line 923
    .line 924
    const/16 v19, 0x0

    .line 925
    .line 926
    move/from16 v26, v13

    .line 927
    .line 928
    move-object/from16 v36, v14

    .line 929
    .line 930
    move-object v13, v4

    .line 931
    move-object v14, v6

    .line 932
    sget-object v0, La/tao;->b:La/tao;

    .line 933
    .line 934
    if-ne v8, v0, :cond_2b

    .line 935
    .line 936
    iget-object v0, v15, La/bu20;->d:Ljava/util/LinkedHashMap;

    .line 937
    .line 938
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 939
    .line 940
    .line 941
    move-result-object v4

    .line 942
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    check-cast v0, Ljava/util/List;

    .line 947
    .line 948
    if-eqz v0, :cond_28

    .line 949
    .line 950
    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    check-cast v0, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;

    .line 955
    .line 956
    move-object/from16 v28, v0

    .line 957
    .line 958
    goto :goto_20

    .line 959
    :cond_28
    move-object/from16 v28, v19

    .line 960
    .line 961
    :goto_20
    invoke-static {v7, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 962
    .line 963
    .line 964
    move-result v0

    .line 965
    if-eqz v0, :cond_29

    .line 966
    .line 967
    if-eqz v28, :cond_29

    .line 968
    .line 969
    invoke-virtual/range {v28 .. v28}, Landroid/view/View;->getMeasuredWidth()I

    .line 970
    .line 971
    .line 972
    move-result v0

    .line 973
    if-eqz v0, :cond_29

    .line 974
    .line 975
    invoke-virtual/range {v28 .. v28}, Landroid/view/View;->getVisibility()I

    .line 976
    .line 977
    .line 978
    move-result v0

    .line 979
    if-nez v0, :cond_29

    .line 980
    .line 981
    goto :goto_21

    .line 982
    :cond_29
    if-eqz v28, :cond_2a

    .line 983
    .line 984
    move-object/from16 v27, v1

    .line 985
    .line 986
    move/from16 v30, v29

    .line 987
    .line 988
    move/from16 v32, v31

    .line 989
    .line 990
    move/from16 v31, v5

    .line 991
    .line 992
    move-object/from16 v29, v7

    .line 993
    .line 994
    invoke-static/range {v27 .. v32}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->b(Ljava/util/ArrayList;Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;La/bbo;III)V

    .line 995
    .line 996
    .line 997
    move-object/from16 v0, p0

    .line 998
    .line 999
    move/from16 v29, v30

    .line 1000
    .line 1001
    move/from16 v31, v32

    .line 1002
    .line 1003
    goto :goto_22

    .line 1004
    :cond_2a
    move-object/from16 v0, p0

    .line 1005
    .line 1006
    move/from16 v4, v29

    .line 1007
    .line 1008
    move/from16 v6, v31

    .line 1009
    .line 1010
    invoke-virtual/range {v0 .. v7}, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->a(Ljava/util/ArrayList;IIIIILa/bbo;)V

    .line 1011
    .line 1012
    .line 1013
    goto :goto_22

    .line 1014
    :cond_2b
    :goto_21
    move-object/from16 v0, p0

    .line 1015
    .line 1016
    :goto_22
    if-eqz v24, :cond_2c

    .line 1017
    .line 1018
    if-nez v35, :cond_2d

    .line 1019
    .line 1020
    if-eqz v26, :cond_2c

    .line 1021
    .line 1022
    goto :goto_23

    .line 1023
    :cond_2c
    move/from16 v4, v29

    .line 1024
    .line 1025
    move/from16 v6, v31

    .line 1026
    .line 1027
    move/from16 v30, v34

    .line 1028
    .line 1029
    const/4 v3, 0x1

    .line 1030
    goto :goto_24

    .line 1031
    :cond_2d
    :goto_23
    add-int/lit8 v11, v18, -0x1

    .line 1032
    .line 1033
    if-ge v10, v11, :cond_2c

    .line 1034
    .line 1035
    const/4 v3, 0x1

    .line 1036
    iput-boolean v3, v13, La/hie0;->a:Z

    .line 1037
    .line 1038
    invoke-virtual {v15}, La/bu20;->a()La/pkm;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v28

    .line 1042
    sget-object v32, La/vao;->c:La/vao;

    .line 1043
    .line 1044
    new-instance v27, La/uao;

    .line 1045
    .line 1046
    move/from16 v30, v34

    .line 1047
    .line 1048
    invoke-direct/range {v27 .. v32}, La/uao;-><init>(Landroid/view/View;IIILa/vao;)V

    .line 1049
    .line 1050
    .line 1051
    move-object/from16 v5, v27

    .line 1052
    .line 1053
    move/from16 v4, v29

    .line 1054
    .line 1055
    move/from16 v6, v31

    .line 1056
    .line 1057
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1058
    .line 1059
    .line 1060
    :goto_24
    iget v5, v12, La/kie0;->a:I

    .line 1061
    .line 1062
    add-int/2addr v5, v3

    .line 1063
    iput v5, v12, La/kie0;->a:I

    .line 1064
    .line 1065
    move/from16 v0, v24

    .line 1066
    .line 1067
    move/from16 v24, v2

    .line 1068
    .line 1069
    move-object v2, v12

    .line 1070
    move v12, v0

    .line 1071
    move/from16 v29, v4

    .line 1072
    .line 1073
    move/from16 v31, v6

    .line 1074
    .line 1075
    move-object v0, v8

    .line 1076
    move-object v4, v13

    .line 1077
    move-object v6, v14

    .line 1078
    move/from16 v13, v26

    .line 1079
    .line 1080
    move/from16 v5, v30

    .line 1081
    .line 1082
    move/from16 v11, v35

    .line 1083
    .line 1084
    move-object/from16 v14, v36

    .line 1085
    .line 1086
    move-object/from16 v26, v37

    .line 1087
    .line 1088
    move/from16 v3, v38

    .line 1089
    .line 1090
    move-object/from16 v7, v39

    .line 1091
    .line 1092
    move-object/from16 v8, p1

    .line 1093
    .line 1094
    goto/16 :goto_1e

    .line 1095
    .line 1096
    :cond_2e
    const/16 v19, 0x0

    .line 1097
    .line 1098
    invoke-static {}, La/q3d;->p()V

    .line 1099
    .line 1100
    .line 1101
    throw v19

    .line 1102
    :cond_2f
    move v3, v12

    .line 1103
    move-object v12, v2

    .line 1104
    move/from16 v2, v24

    .line 1105
    .line 1106
    move/from16 v24, v3

    .line 1107
    .line 1108
    const/4 v3, 0x1

    .line 1109
    const/16 v19, 0x0

    .line 1110
    .line 1111
    move-object v8, v0

    .line 1112
    move-object v13, v4

    .line 1113
    move-object/from16 v36, v14

    .line 1114
    .line 1115
    move-object/from16 v37, v26

    .line 1116
    .line 1117
    move/from16 v4, v29

    .line 1118
    .line 1119
    move-object/from16 v0, p0

    .line 1120
    .line 1121
    move-object v14, v6

    .line 1122
    move/from16 v6, v31

    .line 1123
    .line 1124
    add-int/lit8 v4, v4, 0x1

    .line 1125
    .line 1126
    add-int v5, v4, v6

    .line 1127
    .line 1128
    if-lt v5, v9, :cond_30

    .line 1129
    .line 1130
    iget v2, v14, La/ev20;->c:I

    .line 1131
    .line 1132
    iget v5, v12, La/kie0;->a:I

    .line 1133
    .line 1134
    add-int/lit8 v31, v5, -0x1

    .line 1135
    .line 1136
    sget-object v32, La/vao;->a:La/vao;

    .line 1137
    .line 1138
    new-instance v27, La/rao;

    .line 1139
    .line 1140
    move-object/from16 v29, v1

    .line 1141
    .line 1142
    move/from16 v30, v2

    .line 1143
    .line 1144
    move-object/from16 v28, v36

    .line 1145
    .line 1146
    invoke-direct/range {v27 .. v32}, La/rao;-><init>(La/qao;Ljava/util/List;IILa/vao;)V

    .line 1147
    .line 1148
    .line 1149
    move-object/from16 v2, v27

    .line 1150
    .line 1151
    move-object/from16 v1, v37

    .line 1152
    .line 1153
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1154
    .line 1155
    .line 1156
    move v2, v6

    .line 1157
    move-object v5, v8

    .line 1158
    goto/16 :goto_25

    .line 1159
    .line 1160
    :cond_30
    move/from16 v0, v24

    .line 1161
    .line 1162
    move/from16 v24, v2

    .line 1163
    .line 1164
    move-object v2, v12

    .line 1165
    move v12, v0

    .line 1166
    move/from16 v29, v4

    .line 1167
    .line 1168
    move/from16 v31, v6

    .line 1169
    .line 1170
    move-object v0, v8

    .line 1171
    move-object v4, v13

    .line 1172
    move-object v6, v14

    .line 1173
    move/from16 v3, v23

    .line 1174
    .line 1175
    move-object/from16 v10, v25

    .line 1176
    .line 1177
    move-object/from16 v14, v36

    .line 1178
    .line 1179
    move-object/from16 v26, v37

    .line 1180
    .line 1181
    const/4 v11, 0x6

    .line 1182
    const/4 v13, 0x0

    .line 1183
    move-object/from16 v8, p1

    .line 1184
    .line 1185
    goto/16 :goto_19

    .line 1186
    .line 1187
    :cond_31
    const/16 v19, 0x0

    .line 1188
    .line 1189
    invoke-static {}, La/q3d;->p()V

    .line 1190
    .line 1191
    .line 1192
    throw v19

    .line 1193
    :cond_32
    const/4 v3, 0x1

    .line 1194
    const/16 v19, 0x0

    .line 1195
    .line 1196
    move-object v8, v0

    .line 1197
    move-object v13, v4

    .line 1198
    move/from16 v24, v12

    .line 1199
    .line 1200
    move-object/from16 v28, v14

    .line 1201
    .line 1202
    move/from16 v4, v29

    .line 1203
    .line 1204
    move-object/from16 v0, p0

    .line 1205
    .line 1206
    move-object/from16 v29, v1

    .line 1207
    .line 1208
    move-object v12, v2

    .line 1209
    move-object v14, v6

    .line 1210
    move-object/from16 v1, v26

    .line 1211
    .line 1212
    move/from16 v6, v31

    .line 1213
    .line 1214
    iget v2, v14, La/ev20;->c:I

    .line 1215
    .line 1216
    iget v5, v12, La/kie0;->a:I

    .line 1217
    .line 1218
    add-int/lit8 v31, v5, -0x1

    .line 1219
    .line 1220
    sget-object v32, La/vao;->a:La/vao;

    .line 1221
    .line 1222
    new-instance v27, La/rao;

    .line 1223
    .line 1224
    move/from16 v30, v2

    .line 1225
    .line 1226
    invoke-direct/range {v27 .. v32}, La/rao;-><init>(La/qao;Ljava/util/List;IILa/vao;)V

    .line 1227
    .line 1228
    .line 1229
    move-object/from16 v2, v27

    .line 1230
    .line 1231
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1232
    .line 1233
    .line 1234
    move-object v2, v1

    .line 1235
    move/from16 v21, v6

    .line 1236
    .line 1237
    move-object v5, v8

    .line 1238
    move/from16 v1, v17

    .line 1239
    .line 1240
    move-object/from16 v3, v19

    .line 1241
    .line 1242
    move/from16 v12, v24

    .line 1243
    .line 1244
    const/4 v10, 0x0

    .line 1245
    const/4 v11, 0x1

    .line 1246
    const/16 v14, 0x8

    .line 1247
    .line 1248
    move-object/from16 v8, p1

    .line 1249
    .line 1250
    move/from16 v19, v4

    .line 1251
    .line 1252
    move-object v4, v13

    .line 1253
    const/4 v13, 0x6

    .line 1254
    goto/16 :goto_7

    .line 1255
    .line 1256
    :cond_33
    move-object/from16 v19, v3

    .line 1257
    .line 1258
    invoke-static {}, La/q3d;->p()V

    .line 1259
    .line 1260
    .line 1261
    throw v19

    .line 1262
    :cond_34
    move-object v1, v2

    .line 1263
    move/from16 v24, v12

    .line 1264
    .line 1265
    move/from16 v7, v19

    .line 1266
    .line 1267
    move/from16 v2, v21

    .line 1268
    .line 1269
    move-object/from16 v19, v3

    .line 1270
    .line 1271
    move v4, v7

    .line 1272
    :goto_25
    new-instance v3, La/sao;

    .line 1273
    .line 1274
    invoke-direct {v3, v1, v5, v4, v2}, La/sao;-><init>(Ljava/util/List;La/tao;II)V

    .line 1275
    .line 1276
    .line 1277
    move-object v1, v3

    .line 1278
    :goto_26
    iget-object v2, v1, La/sao;->a:Ljava/util/List;

    .line 1279
    .line 1280
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1281
    .line 1282
    .line 1283
    move-result v3

    .line 1284
    const/16 v21, 0x1

    .line 1285
    .line 1286
    add-int/lit8 v3, v3, -0x1

    .line 1287
    .line 1288
    iget-object v4, v15, La/bu20;->d:Ljava/util/LinkedHashMap;

    .line 1289
    .line 1290
    iget-object v5, v15, La/bu20;->c:Ljava/util/LinkedHashMap;

    .line 1291
    .line 1292
    iget-object v6, v15, La/bu20;->b:Ljava/util/LinkedHashMap;

    .line 1293
    .line 1294
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v4

    .line 1298
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 1299
    .line 1300
    .line 1301
    move-result v4

    .line 1302
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 1303
    .line 1304
    .line 1305
    move-result v7

    .line 1306
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 1307
    .line 1308
    .line 1309
    move-result v4

    .line 1310
    if-ltz v4, :cond_47

    .line 1311
    .line 1312
    const/4 v7, 0x0

    .line 1313
    :goto_27
    iget-object v8, v15, La/bu20;->d:Ljava/util/LinkedHashMap;

    .line 1314
    .line 1315
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v8

    .line 1319
    check-cast v8, Ljava/lang/Iterable;

    .line 1320
    .line 1321
    invoke-static {v8, v7}, Lkotlin/collections/CollectionsKt;->R(Ljava/lang/Iterable;I)Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v8

    .line 1325
    check-cast v8, Ljava/util/List;

    .line 1326
    .line 1327
    invoke-static {v7, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v9

    .line 1331
    check-cast v9, La/rao;

    .line 1332
    .line 1333
    if-eqz v9, :cond_35

    .line 1334
    .line 1335
    iget v10, v9, La/rao;->d:I

    .line 1336
    .line 1337
    goto :goto_28

    .line 1338
    :cond_35
    const/4 v10, -0x1

    .line 1339
    :goto_28
    invoke-static {v7, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v11

    .line 1343
    check-cast v11, La/rao;

    .line 1344
    .line 1345
    if-eqz v11, :cond_36

    .line 1346
    .line 1347
    iget-object v11, v11, La/rao;->e:La/vao;

    .line 1348
    .line 1349
    goto :goto_29

    .line 1350
    :cond_36
    move-object/from16 v11, v19

    .line 1351
    .line 1352
    :goto_29
    sget-object v12, La/vao;->b:La/vao;

    .line 1353
    .line 1354
    if-eq v11, v12, :cond_37

    .line 1355
    .line 1356
    sget-object v12, La/vao;->c:La/vao;

    .line 1357
    .line 1358
    if-eq v11, v12, :cond_37

    .line 1359
    .line 1360
    move/from16 v11, v21

    .line 1361
    .line 1362
    goto :goto_2a

    .line 1363
    :cond_37
    const/4 v11, 0x0

    .line 1364
    :goto_2a
    if-gt v7, v3, :cond_38

    .line 1365
    .line 1366
    if-eqz v11, :cond_38

    .line 1367
    .line 1368
    move/from16 v11, v21

    .line 1369
    .line 1370
    goto :goto_2b

    .line 1371
    :cond_38
    const/4 v11, 0x0

    .line 1372
    :goto_2b
    if-eqz v9, :cond_39

    .line 1373
    .line 1374
    iget-object v9, v9, La/rao;->a:La/qao;

    .line 1375
    .line 1376
    if-eqz v9, :cond_39

    .line 1377
    .line 1378
    iget-boolean v9, v9, La/qao;->d:Z

    .line 1379
    .line 1380
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v9

    .line 1384
    goto :goto_2c

    .line 1385
    :cond_39
    move-object/from16 v9, v19

    .line 1386
    .line 1387
    :goto_2c
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1388
    .line 1389
    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1390
    .line 1391
    .line 1392
    move-result v12

    .line 1393
    if-eqz v12, :cond_3c

    .line 1394
    .line 1395
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v9

    .line 1399
    invoke-virtual {v5, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v9

    .line 1403
    check-cast v9, La/pao;

    .line 1404
    .line 1405
    if-eqz v9, :cond_3b

    .line 1406
    .line 1407
    if-eqz v11, :cond_3a

    .line 1408
    .line 1409
    const/4 v12, 0x0

    .line 1410
    goto :goto_2d

    .line 1411
    :cond_3a
    const/16 v12, 0x8

    .line 1412
    .line 1413
    :goto_2d
    invoke-virtual {v9, v12}, Landroid/view/View;->setVisibility(I)V

    .line 1414
    .line 1415
    .line 1416
    :cond_3b
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v9

    .line 1420
    invoke-virtual {v6, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v9

    .line 1424
    check-cast v9, La/oao;

    .line 1425
    .line 1426
    const/16 v12, 0x8

    .line 1427
    .line 1428
    if-eqz v9, :cond_43

    .line 1429
    .line 1430
    invoke-virtual {v9, v12}, Landroid/view/View;->setVisibility(I)V

    .line 1431
    .line 1432
    .line 1433
    goto :goto_31

    .line 1434
    :cond_3c
    const/16 v12, 0x8

    .line 1435
    .line 1436
    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1437
    .line 1438
    invoke-static {v9, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1439
    .line 1440
    .line 1441
    move-result v9

    .line 1442
    if-eqz v9, :cond_3f

    .line 1443
    .line 1444
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v9

    .line 1448
    invoke-virtual {v5, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v9

    .line 1452
    check-cast v9, La/pao;

    .line 1453
    .line 1454
    if-eqz v9, :cond_3d

    .line 1455
    .line 1456
    invoke-virtual {v9, v12}, Landroid/view/View;->setVisibility(I)V

    .line 1457
    .line 1458
    .line 1459
    :cond_3d
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v9

    .line 1463
    invoke-virtual {v6, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v9

    .line 1467
    check-cast v9, La/oao;

    .line 1468
    .line 1469
    if-eqz v9, :cond_43

    .line 1470
    .line 1471
    if-eqz v11, :cond_3e

    .line 1472
    .line 1473
    const/4 v13, 0x0

    .line 1474
    goto :goto_2e

    .line 1475
    :cond_3e
    move v13, v12

    .line 1476
    :goto_2e
    invoke-virtual {v9, v13}, Landroid/view/View;->setVisibility(I)V

    .line 1477
    .line 1478
    .line 1479
    goto :goto_31

    .line 1480
    :cond_3f
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v9

    .line 1484
    invoke-virtual {v6, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v9

    .line 1488
    check-cast v9, La/oao;

    .line 1489
    .line 1490
    if-eqz v9, :cond_41

    .line 1491
    .line 1492
    if-eqz v11, :cond_40

    .line 1493
    .line 1494
    const/4 v13, 0x0

    .line 1495
    goto :goto_2f

    .line 1496
    :cond_40
    move v13, v12

    .line 1497
    :goto_2f
    invoke-virtual {v9, v13}, Landroid/view/View;->setVisibility(I)V

    .line 1498
    .line 1499
    .line 1500
    :cond_41
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v9

    .line 1504
    invoke-virtual {v5, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1505
    .line 1506
    .line 1507
    move-result-object v9

    .line 1508
    check-cast v9, La/pao;

    .line 1509
    .line 1510
    if-eqz v9, :cond_43

    .line 1511
    .line 1512
    if-eqz v11, :cond_42

    .line 1513
    .line 1514
    const/4 v13, 0x0

    .line 1515
    goto :goto_30

    .line 1516
    :cond_42
    move v13, v12

    .line 1517
    :goto_30
    invoke-virtual {v9, v13}, Landroid/view/View;->setVisibility(I)V

    .line 1518
    .line 1519
    .line 1520
    :cond_43
    :goto_31
    if-eqz v8, :cond_46

    .line 1521
    .line 1522
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v8

    .line 1526
    const/4 v9, 0x0

    .line 1527
    :goto_32
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1528
    .line 1529
    .line 1530
    move-result v13

    .line 1531
    if-eqz v13, :cond_46

    .line 1532
    .line 1533
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v13

    .line 1537
    add-int/lit8 v14, v9, 0x1

    .line 1538
    .line 1539
    if-ltz v9, :cond_45

    .line 1540
    .line 1541
    check-cast v13, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;

    .line 1542
    .line 1543
    if-eqz v11, :cond_44

    .line 1544
    .line 1545
    if-gt v9, v10, :cond_44

    .line 1546
    .line 1547
    const/4 v9, 0x0

    .line 1548
    goto :goto_33

    .line 1549
    :cond_44
    move v9, v12

    .line 1550
    :goto_33
    invoke-virtual {v13, v9}, Lorg/xplatform/uikit/components/market/view/DsMarketCoefficient;->setVisibility(I)V

    .line 1551
    .line 1552
    .line 1553
    move v9, v14

    .line 1554
    goto :goto_32

    .line 1555
    :cond_45
    invoke-static {}, La/q3d;->p()V

    .line 1556
    .line 1557
    .line 1558
    throw v19

    .line 1559
    :cond_46
    if-eq v7, v4, :cond_48

    .line 1560
    .line 1561
    add-int/lit8 v7, v7, 0x1

    .line 1562
    .line 1563
    goto/16 :goto_27

    .line 1564
    .line 1565
    :cond_47
    const/16 v12, 0x8

    .line 1566
    .line 1567
    :cond_48
    invoke-virtual {v15}, La/bu20;->a()La/pkm;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v2

    .line 1571
    if-eqz v24, :cond_49

    .line 1572
    .line 1573
    const/4 v10, 0x0

    .line 1574
    goto :goto_34

    .line 1575
    :cond_49
    move v10, v12

    .line 1576
    :goto_34
    invoke-virtual {v2, v10}, Landroid/view/View;->setVisibility(I)V

    .line 1577
    .line 1578
    .line 1579
    iput-object v1, v0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->h:La/sao;

    .line 1580
    .line 1581
    move-object/from16 v8, p1

    .line 1582
    .line 1583
    iput-object v8, v0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->g:La/jo8;

    .line 1584
    .line 1585
    iget-object v1, v1, La/sao;->b:La/tao;

    .line 1586
    .line 1587
    sget-object v2, La/tao;->a:La/tao;

    .line 1588
    .line 1589
    if-eq v1, v2, :cond_4a

    .line 1590
    .line 1591
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 1592
    .line 1593
    .line 1594
    :cond_4a
    return-void
.end method

.method public final setShowMoreButtonListener(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/bottom/EventCardBottomMarketMultiline;->a:La/bu20;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/bu20;->i:Lkotlin/jvm/functions/Function0;

    .line 13
    .line 14
    return-void
.end method
