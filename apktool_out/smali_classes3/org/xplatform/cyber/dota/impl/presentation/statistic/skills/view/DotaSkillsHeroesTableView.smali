.class public final Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic j:I


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Z

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->a:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->b:Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->c:Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    const v0, 0x7f05000f

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    iput-boolean p2, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->d:Z

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    const v0, 0x7f07069b

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    iput p2, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->e:I

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    const v1, 0x7f0706ba

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    iput p2, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->f:I

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    const v1, 0x7f070722

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    iput p2, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->g:I

    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    const v1, 0x7f070717

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    iput p2, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->h:I

    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    iput p1, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->i:I

    .line 108
    .line 109
    invoke-virtual {p0, p3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 110
    .line 111
    .line 112
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->a:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/Iterable;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/hlp0;

    .line 30
    .line 31
    invoke-interface {v0, p1}, La/hlp0;->k(Landroid/graphics/Canvas;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 13

    .line 1
    iget-object v6, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->c:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_0
    iget v7, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->e:I

    .line 16
    .line 17
    mul-int/lit8 v0, v7, 0x2

    .line 18
    .line 19
    iget v8, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->g:I

    .line 20
    .line 21
    add-int/2addr v0, v8

    .line 22
    sub-int v1, p4, p2

    .line 23
    .line 24
    sub-int/2addr v1, v0

    .line 25
    sub-int v9, v1, v8

    .line 26
    .line 27
    iget-object v0, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->a:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget v11, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->h:I

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, La/hlp0;

    .line 66
    .line 67
    mul-int/2addr v11, v1

    .line 68
    mul-int/2addr v1, v7

    .line 69
    add-int v2, v1, v11

    .line 70
    .line 71
    sub-int v3, v9, v8

    .line 72
    .line 73
    add-int v4, v2, v7

    .line 74
    .line 75
    new-instance v5, La/h5l;

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    invoke-direct {v5, v0, v1}, La/h5l;-><init>(La/hlp0;B)V

    .line 79
    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    move-object v0, p0

    .line 83
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Ljava/lang/Iterable;

    .line 92
    .line 93
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->V(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, La/nal;

    .line 98
    .line 99
    const/4 v7, 0x0

    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    goto :goto_1

    .line 107
    :cond_2
    move v0, v7

    .line 108
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    sub-int/2addr v1, v0

    .line 113
    mul-int/lit8 v0, v8, 0x2

    .line 114
    .line 115
    sub-int v2, v1, v0

    .line 116
    .line 117
    iget v9, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->i:I

    .line 118
    .line 119
    sub-int v0, v2, v9

    .line 120
    .line 121
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    check-cast v1, Ljava/lang/Iterable;

    .line 126
    .line 127
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    move v1, v7

    .line 132
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    const/4 v10, 0x0

    .line 137
    if-eqz v3, :cond_4

    .line 138
    .line 139
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    add-int/lit8 v12, v1, 0x1

    .line 144
    .line 145
    if-ltz v1, :cond_3

    .line 146
    .line 147
    move-object v4, v3

    .line 148
    check-cast v4, La/nal;

    .line 149
    .line 150
    add-int v3, v9, v11

    .line 151
    .line 152
    mul-int/2addr v1, v3

    .line 153
    add-int v3, v1, v9

    .line 154
    .line 155
    move-object v5, p0

    .line 156
    invoke-static/range {v0 .. v5}, La/cww;->z(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 157
    .line 158
    .line 159
    move v1, v12

    .line 160
    goto :goto_2

    .line 161
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 162
    .line 163
    .line 164
    throw v10

    .line 165
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    sub-int v2, v0, v8

    .line 170
    .line 171
    sub-int v0, v2, v9

    .line 172
    .line 173
    iget-object v1, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->b:Ljava/util/LinkedHashMap;

    .line 174
    .line 175
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    check-cast v1, Ljava/lang/Iterable;

    .line 180
    .line 181
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_6

    .line 190
    .line 191
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    add-int/lit8 v8, v7, 0x1

    .line 196
    .line 197
    if-ltz v7, :cond_5

    .line 198
    .line 199
    move-object v4, v1

    .line 200
    check-cast v4, La/f7l;

    .line 201
    .line 202
    add-int v1, v9, v11

    .line 203
    .line 204
    mul-int/2addr v1, v7

    .line 205
    add-int v3, v1, v9

    .line 206
    .line 207
    move-object v5, p0

    .line 208
    invoke-static/range {v0 .. v5}, La/cww;->z(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 209
    .line 210
    .line 211
    move v7, v8

    .line 212
    goto :goto_3

    .line 213
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 214
    .line 215
    .line 216
    throw v10

    .line 217
    :cond_6
    :goto_4
    return-void
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 1
    iget-object p2, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->b:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->f:I

    .line 8
    .line 9
    iget v2, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->g:I

    .line 10
    .line 11
    iget-boolean v3, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->d:Z

    .line 12
    .line 13
    const/high16 v4, 0x40000000    # 2.0f

    .line 14
    .line 15
    iget v5, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->e:I

    .line 16
    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    mul-int/lit8 v6, v5, 0x2

    .line 26
    .line 27
    mul-int/lit8 v7, v2, 0x2

    .line 28
    .line 29
    add-int/2addr v7, v6

    .line 30
    sub-int/2addr v0, v7

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v0, v1

    .line 33
    :goto_0
    iget-object v6, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->a:Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    check-cast v6, Ljava/lang/Iterable;

    .line 40
    .line 41
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_1

    .line 50
    .line 51
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    check-cast v7, La/hlp0;

    .line 56
    .line 57
    invoke-interface {v7, v0}, La/hlp0;->b(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-static {v5, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    check-cast v6, Ljava/lang/Iterable;

    .line 70
    .line 71
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-eqz v7, :cond_2

    .line 80
    .line 81
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, La/f7l;

    .line 86
    .line 87
    invoke-virtual {v7, v0, v0}, Landroid/view/View;->measure(II)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    iget-object v6, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->c:Ljava/util/LinkedHashMap;

    .line 92
    .line 93
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, Ljava/lang/Iterable;

    .line 98
    .line 99
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_3

    .line 108
    .line 109
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    check-cast v7, La/nal;

    .line 114
    .line 115
    invoke-virtual {v7, v0, v0}, Landroid/view/View;->measure(II)V

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_3
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_4

    .line 124
    .line 125
    if-nez v3, :cond_4

    .line 126
    .line 127
    mul-int/lit8 p1, v5, 0x2

    .line 128
    .line 129
    add-int/2addr p1, v1

    .line 130
    mul-int/lit8 v2, v2, 0x3

    .line 131
    .line 132
    add-int/2addr v2, p1

    .line 133
    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    :cond_4
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    mul-int/2addr v0, v5

    .line 142
    invoke-interface {p2}, Ljava/util/Map;->size()I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    iget v1, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->h:I

    .line 147
    .line 148
    mul-int/2addr p2, v1

    .line 149
    add-int/2addr p2, v0

    .line 150
    invoke-static {p2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 163
    .line 164
    .line 165
    return-void
.end method

.method public final setHeroes(Ljava/util/List;)V
    .locals 5
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
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    if-ltz v0, :cond_2

    .line 22
    .line 23
    check-cast v1, La/l4l;

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v3, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->a:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    iget-boolean v4, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->d:Z

    .line 38
    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    new-instance v4, La/uea0;

    .line 42
    .line 43
    invoke-direct {v4, p0}, La/uea0;-><init>(Landroid/widget/FrameLayout;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance v4, La/mvv;

    .line 48
    .line 49
    invoke-direct {v4, p0}, La/mvv;-><init>(Landroid/widget/FrameLayout;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :cond_1
    check-cast v4, La/hlp0;

    .line 56
    .line 57
    iget-object v0, v1, La/l4l;->a:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, v1, La/l4l;->b:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v1, v1, La/l4l;->c:Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {v4, v0, v3, v1}, La/hlp0;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    move v0, v2

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    throw p0

    .line 73
    :cond_3
    return-void
.end method

.method public final setHeroesItems(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/g7l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    if-ltz v0, :cond_2

    .line 22
    .line 23
    check-cast v1, La/g7l;

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v4, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->b:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    if-nez v5, :cond_0

    .line 36
    .line 37
    new-instance v5, La/f7l;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-direct {v5, v6}, La/f7l;-><init>(Landroid/content/Context;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :cond_0
    check-cast v5, La/f7l;

    .line 56
    .line 57
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v3, p0, Lorg/xplatform/cyber/dota/impl/presentation/statistic/skills/view/DotaSkillsHeroesTableView;->c:Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-virtual {v3, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    if-nez v4, :cond_1

    .line 68
    .line 69
    new-instance v4, La/nal;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-direct {v4, v6}, La/nal;-><init>(Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_1
    check-cast v4, La/nal;

    .line 88
    .line 89
    new-instance v0, La/u9b;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    const v3, 0x7f0803b3

    .line 95
    .line 96
    .line 97
    sget-object v6, La/c9b;->a:La/c9b;

    .line 98
    .line 99
    invoke-direct {v0, v3, v6}, La/u9b;-><init>(ILa/e9b;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v0}, La/f7l;->setImageItem(La/x9b;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, La/mal;

    .line 106
    .line 107
    iget-object v1, v1, La/g7l;->a:Ljava/lang/String;

    .line 108
    .line 109
    invoke-direct {v0, v1}, La/mal;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v0}, La/nal;->setTitleItem(La/mal;)V

    .line 113
    .line 114
    .line 115
    move v0, v2

    .line 116
    goto :goto_0

    .line 117
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 118
    .line 119
    .line 120
    const/4 p0, 0x0

    .line 121
    throw p0

    .line 122
    :cond_3
    return-void
.end method
