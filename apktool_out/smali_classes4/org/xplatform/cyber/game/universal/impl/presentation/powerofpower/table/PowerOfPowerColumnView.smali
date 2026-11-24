.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/util/ArrayList;

.field public c:La/jqb0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const p2, 0x7f070717

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;->a:I

    .line 25
    .line 26
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;->b:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 44
    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final onLayout(ZIIII)V
    .locals 5

    .line 1
    iget-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;->c:La/jqb0;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p1, La/jqb0;->c:La/qpb0;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object p4

    .line 12
    iget p1, p1, La/qpb0;->a:I

    .line 13
    .line 14
    invoke-virtual {p4, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p1, p2

    .line 20
    :goto_0
    iget-object p4, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;->b:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    move p5, p2

    .line 27
    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    add-int/lit8 v1, p5, 0x1

    .line 38
    .line 39
    if-ltz p5, :cond_3

    .line 40
    .line 41
    check-cast v0, La/tpb0;

    .line 42
    .line 43
    iget-object v2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;->c:La/jqb0;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    const/4 v2, 0x3

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    const v2, 0x7fffffff

    .line 50
    .line 51
    .line 52
    :goto_2
    if-le p5, v2, :cond_2

    .line 53
    .line 54
    move v2, p1

    .line 55
    goto :goto_3

    .line 56
    :cond_2
    move v2, p2

    .line 57
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    mul-int/2addr v3, p5

    .line 62
    add-int/2addr v3, p3

    .line 63
    iget v4, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;->a:I

    .line 64
    .line 65
    invoke-static {p5, v4, v3, v2}, La/vqd;->a(IIII)I

    .line 66
    .line 67
    .line 68
    move-result p5

    .line 69
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    add-int/2addr v3, p5

    .line 78
    invoke-virtual {v0, p2, p5, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 79
    .line 80
    .line 81
    move p5, v1

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    throw p0

    .line 88
    :cond_4
    return-void
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 1
    iget-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;->c:La/jqb0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p1, La/jqb0;->c:La/qpb0;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget p1, p1, La/qpb0;->a:I

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p1, v0

    .line 20
    :goto_0
    iget-object v1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;->c:La/jqb0;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, v1, La/jqb0;->a:La/ypb0;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v1, 0x0

    .line 28
    :goto_1
    if-nez v1, :cond_2

    .line 29
    .line 30
    goto/16 :goto_7

    .line 31
    .line 32
    :cond_2
    instance-of v2, v1, La/wpb0;

    .line 33
    .line 34
    const/high16 v3, 0x40000000    # 2.0f

    .line 35
    .line 36
    iget v4, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;->a:I

    .line 37
    .line 38
    iget-object v5, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;->b:Ljava/util/ArrayList;

    .line 39
    .line 40
    if-eqz v2, :cond_5

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v1, La/wpb0;

    .line 47
    .line 48
    iget v1, v1, La/wpb0;->a:I

    .line 49
    .line 50
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_3

    .line 63
    .line 64
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    check-cast v6, La/tpb0;

    .line 69
    .line 70
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    iput v1, v7, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 75
    .line 76
    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    invoke-virtual {p0, v6, v7, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, La/tpb0;

    .line 102
    .line 103
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    add-int/2addr v0, v2

    .line 108
    goto :goto_3

    .line 109
    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    mul-int/2addr p2, v4

    .line 114
    add-int/2addr p2, v0

    .line 115
    add-int/2addr p2, p1

    .line 116
    invoke-virtual {p0, v1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_5
    instance-of v1, v1, La/xpb0;

    .line 121
    .line 122
    if-eqz v1, :cond_9

    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    move v2, v0

    .line 129
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_6

    .line 134
    .line 135
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    check-cast v6, La/tpb0;

    .line 140
    .line 141
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    invoke-virtual {p0, v6, v7, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    goto :goto_4

    .line 157
    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-eqz v6, :cond_7

    .line 166
    .line 167
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    check-cast v6, La/tpb0;

    .line 172
    .line 173
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    add-int/2addr v0, v6

    .line 178
    goto :goto_5

    .line 179
    :cond_7
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    mul-int/2addr v1, v4

    .line 184
    add-int/2addr v1, v0

    .line 185
    add-int/2addr v1, p1

    .line 186
    invoke-virtual {p0, v2, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_8

    .line 198
    .line 199
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, La/tpb0;

    .line 204
    .line 205
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    const/4 v4, -0x1

    .line 210
    iput v4, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    invoke-virtual {p0, v0, v1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 220
    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_8
    :goto_7
    return-void

    .line 224
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 225
    .line 226
    .line 227
    return-void
.end method

.method public final setColumn(La/jqb0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/jqb0;->b:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    iget-object v5, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    if-eqz v4, :cond_2

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    add-int/lit8 v6, v3, 0x1

    .line 25
    .line 26
    if-ltz v3, :cond_1

    .line 27
    .line 28
    check-cast v4, La/iqb0;

    .line 29
    .line 30
    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, La/tpb0;

    .line 35
    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_0
    new-instance v3, La/tpb0;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-direct {v3, v7}, La/tpb0;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 55
    .line 56
    const/4 v8, -0x2

    .line 57
    invoke-direct {v7, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-virtual {v3, v4}, La/tpb0;->setCellItem(La/iqb0;)V

    .line 70
    .line 71
    .line 72
    move v3, v6

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 75
    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    throw p0

    .line 79
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-ge v1, v2, :cond_3

    .line 88
    .line 89
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-virtual {v5, v0, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_3

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, La/tpb0;

    .line 116
    .line 117
    const/16 v2, 0x8

    .line 118
    .line 119
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/table/PowerOfPowerColumnView;->c:La/jqb0;

    .line 124
    .line 125
    return-void
.end method
