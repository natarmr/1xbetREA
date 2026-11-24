.class public final Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:F

.field public final g:F

.field public h:I

.field public final i:I

.field public j:I

.field public k:La/z6p0;

.field public final l:Ljava/util/ArrayList;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ljava/util/LinkedHashMap;

.field public o:La/jlp0;

.field public final p:La/n0o0;

.field public final q:Ljava/util/ArrayList;

.field public final r:Ljava/util/LinkedHashMap;

.field public s:I

.field public final t:Ljava/util/LinkedHashSet;

.field public final u:Ljava/util/ArrayList;

.field public final v:Landroid/graphics/Rect;

.field public final w:Landroid/text/TextPaint;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 225
    invoke-direct {p0, p1, v0}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const/4 v0, 0x0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-ne p2, v1, :cond_0

    .line 22
    .line 23
    move p2, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p2, v0

    .line 26
    :goto_0
    iput-boolean p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->a:Z

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const v2, 0x7f07069b

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iput p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->b:I

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const v3, 0x7f070717

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iput v2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->c:I

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const v4, 0x7f070722

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    iput v3, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->d:I

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const v4, 0x7f07072d

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    iput v3, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->e:I

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const v4, 0x7f0706d0

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    int-to-float v3, v3

    .line 92
    iput v3, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->f:F

    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    const v4, 0x7f070649

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    int-to-float v3, v3

    .line 106
    iput v3, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->g:F

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    const v4, 0x7f070748

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    int-to-float v3, v3

    .line 120
    add-int/2addr p2, v2

    .line 121
    iput p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->i:I

    .line 122
    .line 123
    new-instance p2, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    iput-object p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->l:Ljava/util/ArrayList;

    .line 129
    .line 130
    new-instance p2, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    iput-object p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->m:Ljava/util/ArrayList;

    .line 136
    .line 137
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 138
    .line 139
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 140
    .line 141
    .line 142
    iput-object p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->n:Ljava/util/LinkedHashMap;

    .line 143
    .line 144
    sget-object p2, La/jlp0;->a:La/jlp0;

    .line 145
    .line 146
    iput-object p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->o:La/jlp0;

    .line 147
    .line 148
    new-instance p2, La/hrf0;

    .line 149
    .line 150
    const/16 v2, 0x17

    .line 151
    .line 152
    invoke-direct {p2, p1, v2}, La/hrf0;-><init>(Landroid/content/Context;B)V

    .line 153
    .line 154
    .line 155
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    iput-object p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->p:La/n0o0;

    .line 160
    .line 161
    new-instance p2, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 164
    .line 165
    .line 166
    iput-object p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->q:Ljava/util/ArrayList;

    .line 167
    .line 168
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 169
    .line 170
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 171
    .line 172
    .line 173
    iput-object p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->r:Ljava/util/LinkedHashMap;

    .line 174
    .line 175
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 176
    .line 177
    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 178
    .line 179
    .line 180
    iput-object p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->t:Ljava/util/LinkedHashSet;

    .line 181
    .line 182
    new-instance p2, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    iput-object p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->u:Ljava/util/ArrayList;

    .line 188
    .line 189
    new-instance p2, Landroid/graphics/Rect;

    .line 190
    .line 191
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 192
    .line 193
    .line 194
    iput-object p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->v:Landroid/graphics/Rect;

    .line 195
    .line 196
    new-instance p2, Landroid/text/TextPaint;

    .line 197
    .line 198
    invoke-direct {p2}, Landroid/text/TextPaint;-><init>()V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 202
    .line 203
    .line 204
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 205
    .line 206
    const v1, 0x7f0606da

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 217
    .line 218
    .line 219
    iput-object p2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->w:Landroid/text/TextPaint;

    .line 220
    .line 221
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 222
    .line 223
    .line 224
    return-void
.end method

.method private final getStatisticImages()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->p:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getTotalHeight()I
    .locals 2

    .line 1
    iget v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->b:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x6

    .line 4
    .line 5
    iget v1, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->c:I

    .line 6
    .line 7
    mul-int/lit8 v1, v1, 0x5

    .line 8
    .line 9
    add-int/2addr v1, v0

    .line 10
    iget p0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->e:I

    .line 11
    .line 12
    add-int/2addr v1, p0

    .line 13
    return v1
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;IILjava/util/List;)V
    .locals 14

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->h:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget v2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->h:I

    .line 13
    .line 14
    sub-int/2addr v1, v2

    .line 15
    :goto_0
    invoke-interface/range {p4 .. p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_7

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    add-int/lit8 v6, v4, 0x1

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    if-ltz v4, :cond_6

    .line 35
    .line 36
    check-cast v5, La/x9b;

    .line 37
    .line 38
    iget-object v8, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->u:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-static {v4, v8}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Ljava/lang/Integer;

    .line 45
    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    move v4, v3

    .line 54
    :goto_2
    iget v8, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->i:I

    .line 55
    .line 56
    mul-int v8, v8, p2

    .line 57
    .line 58
    add-int v8, v8, p3

    .line 59
    .line 60
    instance-of v9, v5, La/w9b;

    .line 61
    .line 62
    if-eqz v9, :cond_2

    .line 63
    .line 64
    move-object v7, v5

    .line 65
    check-cast v7, La/w9b;

    .line 66
    .line 67
    :cond_2
    if-eqz v7, :cond_4

    .line 68
    .line 69
    check-cast v5, La/w9b;

    .line 70
    .line 71
    iget-object v7, v5, La/w9b;->b:La/e9b;

    .line 72
    .line 73
    invoke-virtual {p0, v7}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->c(La/e9b;)I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    iget-object v5, v5, La/w9b;->a:Ljava/lang/String;

    .line 78
    .line 79
    int-to-float v9, v1

    .line 80
    int-to-float v8, v8

    .line 81
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    iget-object v11, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->w:Landroid/text/TextPaint;

    .line 86
    .line 87
    iget-object v12, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->v:Landroid/graphics/Rect;

    .line 88
    .line 89
    invoke-virtual {v11, v5, v3, v10, v12}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12}, Landroid/graphics/Rect;->width()I

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    int-to-float v13, v10

    .line 99
    sub-float/2addr v9, v13

    .line 100
    sub-int/2addr v7, v10

    .line 101
    div-int/lit8 v7, v7, 0x2

    .line 102
    .line 103
    int-to-float v7, v7

    .line 104
    sub-float/2addr v9, v7

    .line 105
    goto :goto_3

    .line 106
    :cond_3
    invoke-virtual {v12}, Landroid/graphics/Rect;->width()I

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    sub-int/2addr v7, v10

    .line 111
    div-int/lit8 v7, v7, 0x2

    .line 112
    .line 113
    int-to-float v7, v7

    .line 114
    add-float/2addr v9, v7

    .line 115
    :goto_3
    iget v7, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->b:I

    .line 116
    .line 117
    div-int/lit8 v7, v7, 0x2

    .line 118
    .line 119
    int-to-float v7, v7

    .line 120
    add-float/2addr v8, v7

    .line 121
    invoke-virtual {v12}, Landroid/graphics/Rect;->height()I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    div-int/lit8 v7, v7, 0x2

    .line 126
    .line 127
    int-to-float v7, v7

    .line 128
    add-float/2addr v8, v7

    .line 129
    invoke-virtual {p1, v5, v9, v8, v11}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    iget v5, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->d:I

    .line 133
    .line 134
    if-eqz v0, :cond_5

    .line 135
    .line 136
    add-int/2addr v4, v5

    .line 137
    sub-int/2addr v1, v4

    .line 138
    goto :goto_4

    .line 139
    :cond_5
    add-int/2addr v1, v4

    .line 140
    add-int/2addr v1, v5

    .line 141
    :goto_4
    move v4, v6

    .line 142
    goto :goto_1

    .line 143
    :cond_6
    invoke-static {}, La/q3d;->p()V

    .line 144
    .line 145
    .line 146
    throw v7

    .line 147
    :cond_7
    return-void
.end method

.method public final b(La/e9b;)F
    .locals 1

    .line 1
    sget-object v0, La/b9b;->a:La/b9b;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    sget-object v0, La/c9b;->a:La/c9b;

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    instance-of v0, p1, La/a9b;

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    instance-of p1, p1, La/d9b;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return p0

    .line 32
    :cond_2
    :goto_0
    iget p0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->f:F

    .line 33
    .line 34
    return p0

    .line 35
    :cond_3
    :goto_1
    iget p0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->g:F

    .line 36
    .line 37
    return p0
.end method

.method public final c(La/e9b;)I
    .locals 1

    .line 1
    sget-object v0, La/b9b;->a:La/b9b;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    sget-object v0, La/c9b;->a:La/c9b;

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of v0, p1, La/a9b;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const p1, 0x7f0706a3

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_1
    instance-of p1, p1, La/d9b;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const p1, 0x7f07069b

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return p0

    .line 55
    :cond_3
    :goto_0
    iget p0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->b:I

    .line 56
    .line 57
    return p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->m:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, La/s1g;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->n:Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Iterable;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ljava/util/Map$Entry;

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    check-cast v1, Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, La/s1g;

    .line 74
    .line 75
    invoke-virtual {v2, p1}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    const/4 v0, 0x0

    .line 80
    iget-object v1, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->q:Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-virtual {p0, p1, v0, v0, v1}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->a(Landroid/graphics/Canvas;IILjava/util/List;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->l:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_3

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, La/hlp0;

    .line 102
    .line 103
    invoke-interface {v1, p1}, La/hlp0;->k(Landroid/graphics/Canvas;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->k:La/z6p0;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    invoke-virtual {v0, p1}, La/z6p0;->a(Landroid/graphics/Canvas;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->r:Ljava/util/LinkedHashMap;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Ljava/lang/Iterable;

    .line 121
    .line 122
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Ljava/util/Map$Entry;

    .line 137
    .line 138
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Ljava/lang/Number;

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v1, Ljava/util/List;

    .line 153
    .line 154
    iget v3, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->i:I

    .line 155
    .line 156
    invoke-virtual {p0, p1, v2, v3, v1}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->a(Landroid/graphics/Canvas;IILjava/util/List;)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_5
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->h:I

    .line 8
    .line 9
    sub-int/2addr v1, v2

    .line 10
    iget v6, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->d:I

    .line 11
    .line 12
    sub-int v3, v1, v6

    .line 13
    .line 14
    iput v3, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->j:I

    .line 15
    .line 16
    new-instance v5, La/csw;

    .line 17
    .line 18
    const/16 v1, 0x11

    .line 19
    .line 20
    invoke-direct {v5, v0, v1}, La/csw;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    iget v4, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->b:I

    .line 26
    .line 27
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget v2, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->h:I

    .line 35
    .line 36
    sub-int/2addr v1, v2

    .line 37
    iget-object v2, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->m:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    const/4 v8, 0x0

    .line 44
    move v2, v8

    .line 45
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    iget-object v9, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->u:Ljava/util/ArrayList;

    .line 50
    .line 51
    const/4 v10, 0x0

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    add-int/lit8 v11, v2, 0x1

    .line 59
    .line 60
    if-ltz v2, :cond_1

    .line 61
    .line 62
    check-cast v3, La/s1g;

    .line 63
    .line 64
    invoke-static {v2, v9}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Ljava/lang/Integer;

    .line 69
    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    move v9, v2

    .line 77
    goto :goto_1

    .line 78
    :cond_0
    move v9, v8

    .line 79
    :goto_1
    add-int v2, v1, v9

    .line 80
    .line 81
    new-instance v5, La/pfh;

    .line 82
    .line 83
    const/4 v4, 0x6

    .line 84
    invoke-direct {v5, v3, v4}, La/pfh;-><init>(La/s1g;B)V

    .line 85
    .line 86
    .line 87
    move v3, v2

    .line 88
    const/4 v2, 0x0

    .line 89
    iget v4, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->b:I

    .line 90
    .line 91
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 92
    .line 93
    .line 94
    add-int/2addr v9, v6

    .line 95
    add-int/2addr v1, v9

    .line 96
    move v2, v11

    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 99
    .line 100
    .line 101
    throw v10

    .line 102
    :cond_2
    iget v1, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->c:I

    .line 103
    .line 104
    iget v7, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->b:I

    .line 105
    .line 106
    add-int v11, v7, v1

    .line 107
    .line 108
    iget-object v1, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->l:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    move v1, v8

    .line 115
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    iget v13, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->i:I

    .line 120
    .line 121
    if-eqz v2, :cond_4

    .line 122
    .line 123
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    add-int/lit8 v14, v1, 0x1

    .line 128
    .line 129
    if-ltz v1, :cond_3

    .line 130
    .line 131
    check-cast v2, La/hlp0;

    .line 132
    .line 133
    mul-int/2addr v13, v1

    .line 134
    add-int/2addr v13, v11

    .line 135
    iget v3, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->j:I

    .line 136
    .line 137
    add-int v4, v13, v7

    .line 138
    .line 139
    new-instance v5, La/h5l;

    .line 140
    .line 141
    const/4 v1, 0x3

    .line 142
    invoke-direct {v5, v2, v1}, La/h5l;-><init>(La/hlp0;B)V

    .line 143
    .line 144
    .line 145
    const/4 v1, 0x0

    .line 146
    move v2, v13

    .line 147
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 148
    .line 149
    .line 150
    move v1, v14

    .line 151
    goto :goto_2

    .line 152
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 153
    .line 154
    .line 155
    throw v10

    .line 156
    :cond_4
    iget-object v1, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->n:Ljava/util/LinkedHashMap;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_12

    .line 171
    .line 172
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, Ljava/util/Map$Entry;

    .line 177
    .line 178
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    iget v3, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->h:I

    .line 183
    .line 184
    sub-int/2addr v2, v3

    .line 185
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    check-cast v3, Ljava/lang/Number;

    .line 190
    .line 191
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result v12

    .line 195
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    check-cast v1, Ljava/lang/Iterable;

    .line 200
    .line 201
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    move v15, v2

    .line 206
    move v1, v8

    .line 207
    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_11

    .line 212
    .line 213
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    add-int/lit8 v16, v1, 0x1

    .line 218
    .line 219
    if-ltz v1, :cond_10

    .line 220
    .line 221
    check-cast v2, La/s1g;

    .line 222
    .line 223
    iget-object v3, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->r:Ljava/util/LinkedHashMap;

    .line 224
    .line 225
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    check-cast v3, Ljava/util/List;

    .line 234
    .line 235
    if-eqz v3, :cond_5

    .line 236
    .line 237
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    check-cast v3, La/x9b;

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_5
    move-object v3, v10

    .line 245
    :goto_5
    invoke-static {v1, v9}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    check-cast v1, Ljava/lang/Integer;

    .line 250
    .line 251
    if-eqz v1, :cond_6

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    move/from16 v17, v1

    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_6
    move/from16 v17, v8

    .line 261
    .line 262
    :goto_6
    add-int v18, v15, v17

    .line 263
    .line 264
    mul-int v1, v13, v12

    .line 265
    .line 266
    add-int v19, v1, v13

    .line 267
    .line 268
    add-int v20, v19, v7

    .line 269
    .line 270
    if-eqz v3, :cond_f

    .line 271
    .line 272
    instance-of v1, v3, La/v9b;

    .line 273
    .line 274
    if-eqz v1, :cond_7

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_7
    instance-of v4, v3, La/u9b;

    .line 278
    .line 279
    if-eqz v4, :cond_f

    .line 280
    .line 281
    :goto_7
    instance-of v3, v3, La/u9b;

    .line 282
    .line 283
    const v4, 0x7f07064b

    .line 284
    .line 285
    .line 286
    if-eqz v3, :cond_8

    .line 287
    .line 288
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    invoke-virtual {v5, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    goto :goto_8

    .line 297
    :cond_8
    if-eqz v1, :cond_9

    .line 298
    .line 299
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-virtual {v5, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    goto :goto_8

    .line 308
    :cond_9
    move v5, v8

    .line 309
    :goto_8
    if-eqz v3, :cond_a

    .line 310
    .line 311
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    goto :goto_9

    .line 320
    :cond_a
    if-eqz v1, :cond_b

    .line 321
    .line 322
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    goto :goto_9

    .line 331
    :cond_b
    move v1, v8

    .line 332
    :goto_9
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    iget v4, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->h:I

    .line 337
    .line 338
    sub-int/2addr v3, v4

    .line 339
    invoke-direct {v0}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->getStatisticImages()Ljava/util/List;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 344
    .line 345
    .line 346
    move-result-object v21

    .line 347
    move/from16 v22, v8

    .line 348
    .line 349
    :goto_a
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    if-eqz v4, :cond_f

    .line 354
    .line 355
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    add-int/lit8 v23, v22, 0x1

    .line 360
    .line 361
    if-ltz v22, :cond_e

    .line 362
    .line 363
    check-cast v4, Landroid/widget/ImageView;

    .line 364
    .line 365
    move-object/from16 p1, v10

    .line 366
    .line 367
    iget-object v10, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->t:Ljava/util/LinkedHashSet;

    .line 368
    .line 369
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object v10

    .line 373
    :goto_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v24

    .line 377
    if-eqz v24, :cond_d

    .line 378
    .line 379
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v24

    .line 383
    check-cast v24, Ljava/lang/Number;

    .line 384
    .line 385
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Number;->intValue()I

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    invoke-virtual {v9, v8, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 390
    .line 391
    .line 392
    move-result-object v24

    .line 393
    invoke-static {v0, v9}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v25

    .line 397
    check-cast v25, Ljava/lang/Integer;

    .line 398
    .line 399
    if-eqz v25, :cond_c

    .line 400
    .line 401
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Integer;->intValue()I

    .line 402
    .line 403
    .line 404
    move-result v25

    .line 405
    move/from16 v8, v25

    .line 406
    .line 407
    :cond_c
    move-object/from16 p3, v2

    .line 408
    .line 409
    invoke-static/range {v24 .. v24}, Lkotlin/collections/CollectionsKt;->C0(Ljava/util/List;)I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    invoke-static {v0, v6, v2, v3}, La/vqd;->a(IIII)I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    const/4 v2, 0x2

    .line 418
    invoke-static {v8, v5, v2, v0}, La/hne;->d(IIII)I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    mul-int v8, v22, v13

    .line 423
    .line 424
    add-int/2addr v8, v13

    .line 425
    invoke-static {v7, v1, v2, v8}, La/hne;->d(IIII)I

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    move v8, v3

    .line 430
    add-int v3, v0, v5

    .line 431
    .line 432
    add-int v24, v2, v1

    .line 433
    .line 434
    move/from16 v25, v5

    .line 435
    .line 436
    new-instance v5, La/csw;

    .line 437
    .line 438
    move/from16 p4, v0

    .line 439
    .line 440
    const/16 v0, 0x12

    .line 441
    .line 442
    invoke-direct {v5, v4, v0}, La/csw;-><init>(Ljava/lang/Object;B)V

    .line 443
    .line 444
    .line 445
    move-object/from16 v0, p0

    .line 446
    .line 447
    move-object/from16 v27, v4

    .line 448
    .line 449
    move/from16 v26, v8

    .line 450
    .line 451
    move/from16 v4, v24

    .line 452
    .line 453
    move-object/from16 v8, p3

    .line 454
    .line 455
    move/from16 v24, v1

    .line 456
    .line 457
    move/from16 v1, p4

    .line 458
    .line 459
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 460
    .line 461
    .line 462
    move-object v2, v8

    .line 463
    move/from16 v1, v24

    .line 464
    .line 465
    move/from16 v5, v25

    .line 466
    .line 467
    move/from16 v3, v26

    .line 468
    .line 469
    move-object/from16 v4, v27

    .line 470
    .line 471
    const/4 v8, 0x0

    .line 472
    goto :goto_b

    .line 473
    :cond_d
    move-object/from16 v0, p0

    .line 474
    .line 475
    move-object/from16 v10, p1

    .line 476
    .line 477
    move/from16 v22, v23

    .line 478
    .line 479
    const/4 v8, 0x0

    .line 480
    goto/16 :goto_a

    .line 481
    .line 482
    :cond_e
    move-object/from16 p1, v10

    .line 483
    .line 484
    invoke-static {}, La/q3d;->p()V

    .line 485
    .line 486
    .line 487
    throw p1

    .line 488
    :cond_f
    move-object v8, v2

    .line 489
    move-object/from16 p1, v10

    .line 490
    .line 491
    new-instance v5, La/pfh;

    .line 492
    .line 493
    const/4 v0, 0x5

    .line 494
    invoke-direct {v5, v8, v0}, La/pfh;-><init>(La/s1g;B)V

    .line 495
    .line 496
    .line 497
    move-object/from16 v0, p0

    .line 498
    .line 499
    move v1, v15

    .line 500
    move/from16 v3, v18

    .line 501
    .line 502
    move/from16 v2, v19

    .line 503
    .line 504
    move/from16 v4, v20

    .line 505
    .line 506
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 507
    .line 508
    .line 509
    add-int v17, v17, v6

    .line 510
    .line 511
    add-int v15, v17, v1

    .line 512
    .line 513
    move-object/from16 v10, p1

    .line 514
    .line 515
    move/from16 v1, v16

    .line 516
    .line 517
    const/4 v8, 0x0

    .line 518
    goto/16 :goto_4

    .line 519
    .line 520
    :cond_10
    move-object/from16 p1, v10

    .line 521
    .line 522
    invoke-static {}, La/q3d;->p()V

    .line 523
    .line 524
    .line 525
    throw p1

    .line 526
    :cond_11
    move-object/from16 v0, p0

    .line 527
    .line 528
    goto/16 :goto_3

    .line 529
    .line 530
    :cond_12
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->getTotalHeight()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->h:I

    .line 10
    .line 11
    sub-int v0, p1, v0

    .line 12
    .line 13
    iget v1, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->d:I

    .line 14
    .line 15
    sub-int/2addr v0, v1

    .line 16
    iget-object v1, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->k:La/z6p0;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1, v0}, La/z6p0;->c(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->l:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, La/hlp0;

    .line 40
    .line 41
    iget v2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->h:I

    .line 42
    .line 43
    sub-int v2, p1, v2

    .line 44
    .line 45
    invoke-interface {v1, v2}, La/hlp0;->b(I)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final setCellHeaders(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "La/x9b;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->s:I

    .line 9
    .line 10
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->q:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->m:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->u:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    iput v2, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->h:I

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, La/x9b;

    .line 52
    .line 53
    new-instance v3, La/s1g;

    .line 54
    .line 55
    invoke-interface {v2}, La/x9b;->a()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    invoke-direct {v3, p0, v4}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v2}, La/x9b;->getType()La/e9b;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {p0, v4}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->b(La/e9b;)F

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v3, v4}, La/s1g;->c(F)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    invoke-interface {v2}, La/x9b;->getType()La/e9b;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {p0, v2}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->c(La/e9b;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    iget v3, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->h:I

    .line 92
    .line 93
    add-int/2addr v3, v2

    .line 94
    iput v3, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->h:I

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    iget p1, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->h:I

    .line 98
    .line 99
    iget v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->s:I

    .line 100
    .line 101
    add-int/lit8 v0, v0, -0x1

    .line 102
    .line 103
    iget v1, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->d:I

    .line 104
    .line 105
    mul-int/2addr v0, v1

    .line 106
    add-int/2addr v0, p1

    .line 107
    iput v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->h:I

    .line 108
    .line 109
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final setPlayerStatistics(Ljava/util/List;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/fba0;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->r:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v2, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->n:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->t:Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    invoke-interface {v3}, Ljava/util/Set;->clear()V

    .line 19
    .line 20
    .line 21
    new-instance v4, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v5, 0xa

    .line 24
    .line 25
    move-object/from16 v6, p1

    .line 26
    .line 27
    invoke-static {v6, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-eqz v8, :cond_0

    .line 43
    .line 44
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    check-cast v8, La/fba0;

    .line 49
    .line 50
    new-instance v9, La/amp0;

    .line 51
    .line 52
    iget-object v10, v8, La/fba0;->b:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v8, v8, La/fba0;->c:Ljava/lang/String;

    .line 55
    .line 56
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 57
    .line 58
    invoke-virtual {v8, v11}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-direct {v9, v10, v8}, La/amp0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    const/4 v7, 0x0

    .line 82
    move v8, v7

    .line 83
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    if-eqz v9, :cond_b

    .line 88
    .line 89
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    add-int/lit8 v11, v8, 0x1

    .line 94
    .line 95
    if-ltz v8, :cond_a

    .line 96
    .line 97
    check-cast v9, La/fba0;

    .line 98
    .line 99
    iget-object v12, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->l:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-static {v8, v12}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v13

    .line 105
    check-cast v13, La/hlp0;

    .line 106
    .line 107
    if-nez v13, :cond_3

    .line 108
    .line 109
    iget-object v13, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->o:La/jlp0;

    .line 110
    .line 111
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    if-eqz v13, :cond_2

    .line 116
    .line 117
    const/4 v14, 0x1

    .line 118
    if-ne v13, v14, :cond_1

    .line 119
    .line 120
    new-instance v13, La/uea0;

    .line 121
    .line 122
    invoke-direct {v13, v0}, La/uea0;-><init>(Landroid/widget/FrameLayout;)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_2
    new-instance v13, La/lvv;

    .line 131
    .line 132
    invoke-direct {v13, v0}, La/lvv;-><init>(Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;)V

    .line 133
    .line 134
    .line 135
    :goto_2
    invoke-virtual {v12, v8, v13}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_3
    iget-object v12, v9, La/fba0;->d:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v14, v9, La/fba0;->b:Ljava/lang/String;

    .line 141
    .line 142
    iget-object v15, v9, La/fba0;->c:Ljava/lang/String;

    .line 143
    .line 144
    const/16 p1, 0x0

    .line 145
    .line 146
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 147
    .line 148
    invoke-virtual {v15, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-interface {v13, v12, v14, v10}, La/hlp0;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget-object v9, v9, La/fba0;->e:Ljava/util/List;

    .line 159
    .line 160
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    invoke-interface {v1, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    new-instance v10, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-static {v9, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 174
    .line 175
    .line 176
    move-result v12

    .line 177
    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v12

    .line 184
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v13

    .line 188
    if-eqz v13, :cond_4

    .line 189
    .line 190
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v13

    .line 194
    check-cast v13, La/x9b;

    .line 195
    .line 196
    new-instance v14, La/s1g;

    .line 197
    .line 198
    const v15, 0x7f0606a8

    .line 199
    .line 200
    .line 201
    invoke-direct {v14, v0, v15}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v13}, La/x9b;->getType()La/e9b;

    .line 205
    .line 206
    .line 207
    move-result-object v13

    .line 208
    invoke-virtual {v0, v13}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->b(La/e9b;)F

    .line 209
    .line 210
    .line 211
    move-result v13

    .line 212
    invoke-virtual {v14, v13}, La/s1g;->c(F)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_4
    invoke-interface {v2, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    move v9, v7

    .line 227
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    if-eqz v10, :cond_9

    .line 232
    .line 233
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    add-int/lit8 v12, v9, 0x1

    .line 238
    .line 239
    if-ltz v9, :cond_8

    .line 240
    .line 241
    check-cast v10, La/x9b;

    .line 242
    .line 243
    if-nez v10, :cond_5

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_5
    instance-of v13, v10, La/u9b;

    .line 247
    .line 248
    if-eqz v13, :cond_6

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_6
    instance-of v13, v10, La/v9b;

    .line 252
    .line 253
    if-eqz v13, :cond_7

    .line 254
    .line 255
    :goto_5
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v9

    .line 259
    invoke-interface {v3, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    :cond_7
    :goto_6
    move v9, v12

    .line 266
    goto :goto_4

    .line 267
    :cond_8
    invoke-static {}, La/q3d;->p()V

    .line 268
    .line 269
    .line 270
    throw p1

    .line 271
    :cond_9
    move v8, v11

    .line 272
    goto/16 :goto_1

    .line 273
    .line 274
    :cond_a
    const/16 p1, 0x0

    .line 275
    .line 276
    invoke-static {}, La/q3d;->p()V

    .line 277
    .line 278
    .line 279
    throw p1

    .line 280
    :cond_b
    const/16 p1, 0x0

    .line 281
    .line 282
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-nez v1, :cond_10

    .line 287
    .line 288
    invoke-direct {v0}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->getStatisticImages()Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    move v2, v7

    .line 297
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-eqz v3, :cond_11

    .line 302
    .line 303
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    add-int/lit8 v5, v2, 0x1

    .line 308
    .line 309
    if-ltz v2, :cond_f

    .line 310
    .line 311
    move-object v8, v3

    .line 312
    check-cast v8, Landroid/widget/ImageView;

    .line 313
    .line 314
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    if-nez v3, :cond_c

    .line 319
    .line 320
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 321
    .line 322
    .line 323
    :cond_c
    invoke-virtual {v8, v7}, Landroid/view/View;->setVisibility(I)V

    .line 324
    .line 325
    .line 326
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    check-cast v2, La/x9b;

    .line 331
    .line 332
    if-eqz v2, :cond_e

    .line 333
    .line 334
    instance-of v3, v2, La/u9b;

    .line 335
    .line 336
    if-eqz v3, :cond_d

    .line 337
    .line 338
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 339
    .line 340
    check-cast v2, La/u9b;

    .line 341
    .line 342
    iget v2, v2, La/u9b;->a:I

    .line 343
    .line 344
    invoke-static {v8, v2}, La/u0d;->i(Landroid/widget/ImageView;I)V

    .line 345
    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_d
    instance-of v3, v2, La/v9b;

    .line 349
    .line 350
    if-eqz v3, :cond_e

    .line 351
    .line 352
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 353
    .line 354
    check-cast v2, La/v9b;

    .line 355
    .line 356
    iget-object v9, v2, La/v9b;->a:Ljava/lang/String;

    .line 357
    .line 358
    const/4 v14, 0x0

    .line 359
    const/16 v15, 0x1fc

    .line 360
    .line 361
    const v10, 0x7f080f7a

    .line 362
    .line 363
    .line 364
    const/4 v11, 0x0

    .line 365
    const/4 v12, 0x0

    .line 366
    const/4 v13, 0x0

    .line 367
    invoke-static/range {v8 .. v15}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 368
    .line 369
    .line 370
    :cond_e
    :goto_8
    move v2, v5

    .line 371
    goto :goto_7

    .line 372
    :cond_f
    invoke-static {}, La/q3d;->p()V

    .line 373
    .line 374
    .line 375
    throw p1

    .line 376
    :cond_10
    invoke-direct {v0}, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->getStatisticImages()Ljava/util/List;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    if-eqz v2, :cond_11

    .line 389
    .line 390
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    check-cast v2, Landroid/widget/ImageView;

    .line 395
    .line 396
    const/16 v3, 0x8

    .line 397
    .line 398
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 399
    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_11
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 406
    .line 407
    .line 408
    return-void
.end method

.method public final setTeam(La/xnp0;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/xnp0;->f:La/jlp0;

    .line 5
    .line 6
    iput-object v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->o:La/jlp0;

    .line 7
    .line 8
    iget-object v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->k:La/z6p0;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, La/z6p0;

    .line 13
    .line 14
    iget v1, p1, La/xnp0;->e:I

    .line 15
    .line 16
    invoke-direct {v0, p0, v1}, La/z6p0;-><init>(Landroid/widget/FrameLayout;I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->k:La/z6p0;

    .line 20
    .line 21
    :cond_0
    move-object v2, v0

    .line 22
    iget-object v3, p1, La/xnp0;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v4, p1, La/xnp0;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-boolean v5, p1, La/xnp0;->c:Z

    .line 27
    .line 28
    iget-boolean v6, p1, La/xnp0;->d:Z

    .line 29
    .line 30
    iget-boolean v7, p1, La/xnp0;->g:Z

    .line 31
    .line 32
    invoke-virtual/range {v2 .. v7}, La/z6p0;->d(Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 36
    .line 37
    .line 38
    return-void
.end method
