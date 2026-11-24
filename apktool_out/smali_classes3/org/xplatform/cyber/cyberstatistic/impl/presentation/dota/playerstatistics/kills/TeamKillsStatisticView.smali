.class public final Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic B:I


# instance fields
.field public final A:Landroid/text/TextPaint;

.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:F

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public m:I

.field public n:La/z6p0;

.field public final o:Ljava/util/ArrayList;

.field public p:La/s1g;

.field public final q:Ljava/util/LinkedHashMap;

.field public final r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public final t:Ljava/util/LinkedHashMap;

.field public final u:Ljava/util/LinkedHashMap;

.field public final v:Ljava/util/LinkedHashMap;

.field public final w:I

.field public final x:I

.field public final y:Landroid/graphics/Rect;

.field public final z:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 260
    invoke-direct {p0, p1, v0}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

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
    const v0, 0x7f07069b

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iput p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->a:I

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const v1, 0x7f0706b0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const v2, 0x7f070705

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iput v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->b:I

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const v2, 0x7f070717

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    iput v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->c:I

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const v3, 0x7f070722

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iput v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->d:I

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const v4, 0x7f07072d

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    iput v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->e:I

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    const v4, 0x7f0706f8

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    iput v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->f:I

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    const v4, 0x7f0706d0

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    int-to-float v3, v3

    .line 108
    iput v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->g:F

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    const v4, 0x7f070748

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    int-to-float v3, v3

    .line 122
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    const v5, 0x7f07066c

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    iput v4, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->h:I

    .line 134
    .line 135
    iput v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->i:I

    .line 136
    .line 137
    add-int/2addr v0, v2

    .line 138
    iput v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->j:I

    .line 139
    .line 140
    add-int/2addr p2, v1

    .line 141
    iput p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->k:I

    .line 142
    .line 143
    invoke-direct {p0}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->getKillsStatisticColumnsWidth()I

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    iput p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->l:I

    .line 148
    .line 149
    new-instance p2, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    iput-object p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->o:Ljava/util/ArrayList;

    .line 155
    .line 156
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 157
    .line 158
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-object p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->q:Ljava/util/LinkedHashMap;

    .line 162
    .line 163
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    const v0, 0x7f130e4c

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    iput-object p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->r:Ljava/lang/String;

    .line 178
    .line 179
    const-string p2, ""

    .line 180
    .line 181
    iput-object p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->s:Ljava/lang/String;

    .line 182
    .line 183
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 184
    .line 185
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 186
    .line 187
    .line 188
    iput-object p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->t:Ljava/util/LinkedHashMap;

    .line 189
    .line 190
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 191
    .line 192
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 193
    .line 194
    .line 195
    iput-object p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->u:Ljava/util/LinkedHashMap;

    .line 196
    .line 197
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 198
    .line 199
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 200
    .line 201
    .line 202
    iput-object p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->v:Ljava/util/LinkedHashMap;

    .line 203
    .line 204
    sget-object p2, La/j5d;->a:Landroid/util/TypedValue;

    .line 205
    .line 206
    const p2, 0x7f0606da

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    iput p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->w:I

    .line 214
    .line 215
    const v0, 0x7f0606e1

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, v0}, Landroid/content/Context;->getColor(I)I

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    iput p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->x:I

    .line 223
    .line 224
    new-instance p1, Landroid/graphics/Rect;

    .line 225
    .line 226
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 227
    .line 228
    .line 229
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->y:Landroid/graphics/Rect;

    .line 230
    .line 231
    new-instance p1, Landroid/graphics/Rect;

    .line 232
    .line 233
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 234
    .line 235
    .line 236
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->z:Landroid/graphics/Rect;

    .line 237
    .line 238
    new-instance p1, Landroid/text/TextPaint;

    .line 239
    .line 240
    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    .line 241
    .line 242
    .line 243
    const/4 v0, 0x1

    .line 244
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 251
    .line 252
    .line 253
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->A:Landroid/text/TextPaint;

    .line 254
    .line 255
    const/4 p1, 0x0

    .line 256
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 257
    .line 258
    .line 259
    return-void
.end method

.method private final getKillsStatisticColumnsWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->j:I

    .line 2
    .line 3
    mul-int/lit8 p0, p0, 0x5

    .line 4
    .line 5
    return p0
.end method

.method private final getTotalHeight()I
    .locals 2

    .line 1
    iget v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->a:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x6

    .line 4
    .line 5
    iget v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->c:I

    .line 6
    .line 7
    mul-int/lit8 v1, v1, 0x5

    .line 8
    .line 9
    add-int/2addr v1, v0

    .line 10
    iget p0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->e:I

    .line 11
    .line 12
    add-int/2addr v1, p0

    .line 13
    return v1
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->p:La/s1g;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->n:La/z6p0;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, p1}, La/z6p0;->a(Landroid/graphics/Canvas;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->o:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/hlp0;

    .line 35
    .line 36
    invoke-interface {v1, p1}, La/hlp0;->k(Landroid/graphics/Canvas;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->x:I

    .line 41
    .line 42
    iget-object v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->A:Landroid/text/TextPaint;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->r:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const/4 v3, 0x0

    .line 54
    iget-object v4, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->y:Landroid/graphics/Rect;

    .line 55
    .line 56
    invoke-virtual {v1, v0, v3, v2, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->s:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    iget-object v6, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->z:Landroid/graphics/Rect;

    .line 66
    .line 67
    invoke-virtual {v1, v2, v3, v5, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 68
    .line 69
    .line 70
    iget v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->l:I

    .line 71
    .line 72
    int-to-float v5, v2

    .line 73
    const/high16 v7, 0x3f000000    # 0.5f

    .line 74
    .line 75
    mul-float/2addr v5, v7

    .line 76
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    int-to-float v8, v8

    .line 81
    mul-float/2addr v8, v7

    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    const/4 v10, 0x1

    .line 87
    iget v11, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->c:I

    .line 88
    .line 89
    if-ne v9, v10, :cond_3

    .line 90
    .line 91
    sub-float/2addr v5, v8

    .line 92
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    int-to-float v2, v2

    .line 97
    mul-float/2addr v2, v7

    .line 98
    add-float/2addr v2, v5

    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    sub-int/2addr v7, v2

    .line 105
    iget v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->d:I

    .line 106
    .line 107
    add-int/2addr v7, v2

    .line 108
    int-to-float v2, v7

    .line 109
    add-float/2addr v2, v5

    .line 110
    sub-float/2addr v2, v8

    .line 111
    int-to-float v5, v11

    .line 112
    sub-float/2addr v2, v5

    .line 113
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    int-to-float v5, v5

    .line 118
    sub-float/2addr v2, v5

    .line 119
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-ne v5, v10, :cond_4

    .line 124
    .line 125
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    int-to-float v4, v4

    .line 130
    sub-float v4, v2, v4

    .line 131
    .line 132
    int-to-float v5, v11

    .line 133
    sub-float/2addr v4, v5

    .line 134
    goto :goto_2

    .line 135
    :cond_4
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    int-to-float v4, v4

    .line 140
    add-float/2addr v4, v2

    .line 141
    int-to-float v5, v11

    .line 142
    add-float/2addr v4, v5

    .line 143
    :goto_2
    iget v5, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->f:I

    .line 144
    .line 145
    add-int/2addr v11, v5

    .line 146
    int-to-float v5, v11

    .line 147
    invoke-virtual {p1, v0, v2, v5, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 148
    .line 149
    .line 150
    iget v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->w:I

    .line 151
    .line 152
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->s:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {p1, v0, v4, v5, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->q:Ljava/util/LinkedHashMap;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, Ljava/lang/Iterable;

    .line 167
    .line 168
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_6

    .line 177
    .line 178
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    check-cast v2, Ljava/util/Map$Entry;

    .line 183
    .line 184
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, Ljava/util/List;

    .line 189
    .line 190
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-eqz v4, :cond_5

    .line 199
    .line 200
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    check-cast v4, La/s1g;

    .line 205
    .line 206
    invoke-virtual {v4, p1}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_6
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->u:Ljava/util/LinkedHashMap;

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, Ljava/lang/Iterable;

    .line 217
    .line 218
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-eqz v2, :cond_b

    .line 227
    .line 228
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    check-cast v2, Ljava/util/Map$Entry;

    .line 233
    .line 234
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    check-cast v4, Ljava/lang/Number;

    .line 239
    .line 240
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    check-cast v2, Ljava/util/List;

    .line 249
    .line 250
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    move v5, v3

    .line 255
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    if-eqz v6, :cond_7

    .line 260
    .line 261
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    add-int/lit8 v7, v5, 0x1

    .line 266
    .line 267
    if-ltz v5, :cond_a

    .line 268
    .line 269
    check-cast v6, La/boy;

    .line 270
    .line 271
    sget-object v8, La/j5d;->a:Landroid/util/TypedValue;

    .line 272
    .line 273
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    iget v9, v6, La/boy;->d:I

    .line 281
    .line 282
    invoke-virtual {v8, v9}, Landroid/content/Context;->getColor(I)I

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    invoke-virtual {v1, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 287
    .line 288
    .line 289
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    iget-object v9, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->v:Ljava/util/LinkedHashMap;

    .line 294
    .line 295
    invoke-virtual {v9, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    check-cast v8, Ljava/util/List;

    .line 300
    .line 301
    const/4 v10, 0x0

    .line 302
    if-eqz v8, :cond_8

    .line 303
    .line 304
    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    check-cast v8, La/qab;

    .line 309
    .line 310
    if-eqz v8, :cond_8

    .line 311
    .line 312
    iget v8, v8, La/qab;->a:F

    .line 313
    .line 314
    goto :goto_5

    .line 315
    :cond_8
    move v8, v10

    .line 316
    :goto_5
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 317
    .line 318
    .line 319
    move-result-object v11

    .line 320
    invoke-virtual {v9, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v9

    .line 324
    check-cast v9, Ljava/util/List;

    .line 325
    .line 326
    if-eqz v9, :cond_9

    .line 327
    .line 328
    invoke-interface {v9, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    check-cast v5, La/qab;

    .line 333
    .line 334
    if-eqz v5, :cond_9

    .line 335
    .line 336
    iget v10, v5, La/qab;->b:F

    .line 337
    .line 338
    :cond_9
    iget-object v5, v6, La/boy;->c:Ljava/lang/String;

    .line 339
    .line 340
    invoke-virtual {p1, v5, v8, v10, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 341
    .line 342
    .line 343
    move v5, v7

    .line 344
    goto :goto_4

    .line 345
    :cond_a
    invoke-static {}, La/q3d;->p()V

    .line 346
    .line 347
    .line 348
    const/4 p0, 0x0

    .line 349
    throw p0

    .line 350
    :cond_b
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 22

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
    iget v6, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->l:I

    .line 8
    .line 9
    sub-int v3, v1, v6

    .line 10
    .line 11
    iput v3, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->m:I

    .line 12
    .line 13
    new-instance v5, La/xep0;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    invoke-direct {v5, v0, v7}, La/xep0;-><init>(Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;B)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    iget v4, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->a:I

    .line 22
    .line 23
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    sub-int/2addr v1, v6

    .line 31
    iget v8, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->d:I

    .line 32
    .line 33
    add-int/2addr v1, v8

    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    new-instance v5, La/xep0;

    .line 39
    .line 40
    const/4 v9, 0x1

    .line 41
    invoke-direct {v5, v0, v9}, La/xep0;-><init>(Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;B)V

    .line 42
    .line 43
    .line 44
    iget v4, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->a:I

    .line 45
    .line 46
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 47
    .line 48
    .line 49
    iget v10, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->a:I

    .line 50
    .line 51
    iget v11, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->c:I

    .line 52
    .line 53
    add-int v12, v10, v11

    .line 54
    .line 55
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->o:Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    move v1, v7

    .line 62
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    const/4 v14, 0x0

    .line 67
    iget v15, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->k:I

    .line 68
    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    add-int/lit8 v16, v1, 0x1

    .line 76
    .line 77
    if-ltz v1, :cond_0

    .line 78
    .line 79
    check-cast v2, La/hlp0;

    .line 80
    .line 81
    mul-int/2addr v15, v1

    .line 82
    add-int/2addr v15, v12

    .line 83
    iget v3, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->m:I

    .line 84
    .line 85
    add-int v4, v15, v10

    .line 86
    .line 87
    new-instance v5, La/h5l;

    .line 88
    .line 89
    const/4 v1, 0x2

    .line 90
    invoke-direct {v5, v2, v1}, La/h5l;-><init>(La/hlp0;B)V

    .line 91
    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    move v2, v15

    .line 95
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 96
    .line 97
    .line 98
    move/from16 v1, v16

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    invoke-static {}, La/q3d;->p()V

    .line 102
    .line 103
    .line 104
    throw v14

    .line 105
    :cond_1
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->q:Ljava/util/LinkedHashMap;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    :cond_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    iget v2, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->i:I

    .line 120
    .line 121
    iget v3, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->j:I

    .line 122
    .line 123
    if-eqz v1, :cond_3

    .line 124
    .line 125
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Ljava/util/Map$Entry;

    .line 130
    .line 131
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    sub-int/2addr v4, v6

    .line 136
    add-int/2addr v4, v8

    .line 137
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    check-cast v5, Ljava/lang/Number;

    .line 142
    .line 143
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v16

    .line 147
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, Ljava/lang/Iterable;

    .line 152
    .line 153
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v17

    .line 157
    move v1, v4

    .line 158
    :goto_1
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eqz v4, :cond_2

    .line 163
    .line 164
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    check-cast v4, La/s1g;

    .line 169
    .line 170
    move v5, v3

    .line 171
    add-int v3, v1, v2

    .line 172
    .line 173
    mul-int v18, v15, v16

    .line 174
    .line 175
    add-int v18, v18, v15

    .line 176
    .line 177
    add-int v19, v18, v10

    .line 178
    .line 179
    move/from16 v20, v5

    .line 180
    .line 181
    new-instance v5, La/pfh;

    .line 182
    .line 183
    move-object/from16 p1, v14

    .line 184
    .line 185
    const/4 v14, 0x4

    .line 186
    invoke-direct {v5, v4, v14}, La/pfh;-><init>(La/s1g;B)V

    .line 187
    .line 188
    .line 189
    move/from16 v21, v2

    .line 190
    .line 191
    move/from16 v2, v18

    .line 192
    .line 193
    move/from16 v4, v19

    .line 194
    .line 195
    move/from16 v14, v20

    .line 196
    .line 197
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 198
    .line 199
    .line 200
    add-int/2addr v1, v14

    .line 201
    move v3, v14

    .line 202
    move/from16 v2, v21

    .line 203
    .line 204
    move-object/from16 v14, p1

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_3
    move/from16 v21, v2

    .line 208
    .line 209
    move-object/from16 p1, v14

    .line 210
    .line 211
    move v14, v3

    .line 212
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->t:Ljava/util/LinkedHashMap;

    .line 213
    .line 214
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    check-cast v1, Ljava/lang/Iterable;

    .line 219
    .line 220
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v10

    .line 224
    :cond_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    iget v13, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->f:I

    .line 229
    .line 230
    const/high16 v16, 0x3f000000    # 0.5f

    .line 231
    .line 232
    if-eqz v1, :cond_5

    .line 233
    .line 234
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    check-cast v1, Ljava/util/Map$Entry;

    .line 239
    .line 240
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    check-cast v2, Ljava/lang/Number;

    .line 245
    .line 246
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    sub-int/2addr v3, v6

    .line 255
    add-int/2addr v3, v8

    .line 256
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    check-cast v1, Ljava/lang/Iterable;

    .line 261
    .line 262
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object v17

    .line 266
    move/from16 v18, v3

    .line 267
    .line 268
    :goto_2
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-eqz v1, :cond_4

    .line 273
    .line 274
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    move-object v4, v1

    .line 279
    check-cast v4, Landroid/widget/ImageView;

    .line 280
    .line 281
    iget v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->h:I

    .line 282
    .line 283
    int-to-float v3, v1

    .line 284
    mul-float v5, v3, v16

    .line 285
    .line 286
    add-int v0, v18, v11

    .line 287
    .line 288
    add-int/2addr v1, v0

    .line 289
    invoke-static {v15, v2, v15, v13}, La/vqd;->a(IIII)I

    .line 290
    .line 291
    .line 292
    move-result v7

    .line 293
    int-to-float v7, v7

    .line 294
    sub-float/2addr v7, v5

    .line 295
    add-float/2addr v3, v7

    .line 296
    float-to-int v5, v7

    .line 297
    float-to-int v3, v3

    .line 298
    move v7, v2

    .line 299
    move v2, v1

    .line 300
    move v1, v5

    .line 301
    move-object/from16 v5, p0

    .line 302
    .line 303
    invoke-static/range {v0 .. v5}, La/cww;->z(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 304
    .line 305
    .line 306
    move-object v0, v5

    .line 307
    add-int v18, v18, v14

    .line 308
    .line 309
    move v2, v7

    .line 310
    const/4 v7, 0x0

    .line 311
    goto :goto_2

    .line 312
    :cond_5
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->u:Ljava/util/LinkedHashMap;

    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    check-cast v1, Ljava/lang/Iterable;

    .line 319
    .line 320
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    if-eqz v2, :cond_b

    .line 329
    .line 330
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    check-cast v2, Ljava/util/Map$Entry;

    .line 335
    .line 336
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    check-cast v3, Ljava/lang/Number;

    .line 341
    .line 342
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 343
    .line 344
    .line 345
    move-result v3

    .line 346
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    check-cast v2, Ljava/util/List;

    .line 351
    .line 352
    new-instance v4, Ljava/util/ArrayList;

    .line 353
    .line 354
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    if-ne v5, v9, :cond_6

    .line 362
    .line 363
    move v5, v6

    .line 364
    goto :goto_4

    .line 365
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    sub-int/2addr v5, v6

    .line 370
    :goto_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    const/4 v7, 0x0

    .line 375
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v8

    .line 379
    if-eqz v8, :cond_a

    .line 380
    .line 381
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v8

    .line 385
    add-int/lit8 v10, v7, 0x1

    .line 386
    .line 387
    if-ltz v7, :cond_9

    .line 388
    .line 389
    check-cast v8, La/boy;

    .line 390
    .line 391
    iget-object v7, v8, La/boy;->c:Ljava/lang/String;

    .line 392
    .line 393
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 394
    .line 395
    .line 396
    move-result v9

    .line 397
    move-object/from16 p4, v1

    .line 398
    .line 399
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->A:Landroid/text/TextPaint;

    .line 400
    .line 401
    move-object/from16 p5, v2

    .line 402
    .line 403
    iget-object v2, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->y:Landroid/graphics/Rect;

    .line 404
    .line 405
    move/from16 v17, v3

    .line 406
    .line 407
    const/4 v3, 0x0

    .line 408
    invoke-virtual {v1, v7, v3, v9, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    int-to-float v2, v2

    .line 416
    mul-float v2, v2, v16

    .line 417
    .line 418
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 419
    .line 420
    .line 421
    move-result v7

    .line 422
    const/4 v9, 0x1

    .line 423
    if-ne v7, v9, :cond_7

    .line 424
    .line 425
    int-to-float v7, v5

    .line 426
    move/from16 v9, v21

    .line 427
    .line 428
    int-to-float v3, v9

    .line 429
    sub-float/2addr v7, v3

    .line 430
    int-to-float v3, v11

    .line 431
    add-float/2addr v7, v3

    .line 432
    sub-float/2addr v7, v2

    .line 433
    goto :goto_6

    .line 434
    :cond_7
    move/from16 v9, v21

    .line 435
    .line 436
    int-to-float v3, v5

    .line 437
    int-to-float v7, v9

    .line 438
    add-float/2addr v3, v7

    .line 439
    int-to-float v7, v11

    .line 440
    sub-float/2addr v3, v7

    .line 441
    sub-float v7, v3, v2

    .line 442
    .line 443
    :goto_6
    mul-int v3, v15, v17

    .line 444
    .line 445
    add-int/2addr v3, v12

    .line 446
    int-to-float v2, v3

    .line 447
    int-to-float v3, v11

    .line 448
    add-float/2addr v2, v3

    .line 449
    int-to-float v3, v13

    .line 450
    add-float/2addr v2, v3

    .line 451
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    iget v8, v8, La/boy;->d:I

    .line 459
    .line 460
    invoke-virtual {v3, v8}, Landroid/content/Context;->getColor(I)I

    .line 461
    .line 462
    .line 463
    move-result v3

    .line 464
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 465
    .line 466
    .line 467
    new-instance v1, La/qab;

    .line 468
    .line 469
    invoke-direct {v1, v7, v2}, La/qab;-><init>(FF)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    const/4 v2, 0x1

    .line 480
    if-ne v1, v2, :cond_8

    .line 481
    .line 482
    neg-int v3, v14

    .line 483
    goto :goto_7

    .line 484
    :cond_8
    move v3, v14

    .line 485
    :goto_7
    add-int/2addr v5, v3

    .line 486
    move-object/from16 v1, p4

    .line 487
    .line 488
    move/from16 v21, v9

    .line 489
    .line 490
    move v7, v10

    .line 491
    move/from16 v3, v17

    .line 492
    .line 493
    move v9, v2

    .line 494
    move-object/from16 v2, p5

    .line 495
    .line 496
    goto :goto_5

    .line 497
    :cond_9
    invoke-static {}, La/q3d;->p()V

    .line 498
    .line 499
    .line 500
    throw p1

    .line 501
    :cond_a
    move-object/from16 p4, v1

    .line 502
    .line 503
    move/from16 v17, v3

    .line 504
    .line 505
    move v2, v9

    .line 506
    move/from16 v9, v21

    .line 507
    .line 508
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->v:Ljava/util/LinkedHashMap;

    .line 509
    .line 510
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-object/from16 v1, p4

    .line 518
    .line 519
    move v9, v2

    .line 520
    goto/16 :goto_3

    .line 521
    .line 522
    :cond_b
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
    invoke-direct {p0}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->getTotalHeight()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->l:I

    .line 10
    .line 11
    sub-int v0, p1, v0

    .line 12
    .line 13
    iget-object v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->n:La/z6p0;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, v0}, La/z6p0;->c(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->o:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, La/hlp0;

    .line 37
    .line 38
    invoke-interface {v2, v0}, La/hlp0;->b(I)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final setHeader(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->s:Ljava/lang/String;

    .line 5
    .line 6
    iget-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->p:La/s1g;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    new-instance p1, La/s1g;

    .line 11
    .line 12
    const v0, 0x7f0606a8

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, p0, v0}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 16
    .line 17
    .line 18
    iget v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->g:F

    .line 19
    .line 20
    invoke-virtual {p1, v0}, La/s1g;->c(F)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->p:La/s1g;

    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final setPlayersKillsStatistics(Ljava/util/List;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/n4a0;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/16 v3, 0xa

    .line 11
    .line 12
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, La/n4a0;

    .line 34
    .line 35
    new-instance v6, La/yep0;

    .line 36
    .line 37
    iget-object v7, v5, La/n4a0;->b:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v5, v5, La/n4a0;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-direct {v6, v7, v5}, La/yep0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const/4 v4, 0x0

    .line 53
    move v5, v4

    .line 54
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    iget-object v7, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->t:Ljava/util/LinkedHashMap;

    .line 59
    .line 60
    iget-object v8, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->u:Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    const/4 v9, 0x0

    .line 63
    if-eqz v6, :cond_7

    .line 64
    .line 65
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    add-int/lit8 v10, v5, 0x1

    .line 70
    .line 71
    if-ltz v5, :cond_6

    .line 72
    .line 73
    check-cast v6, La/n4a0;

    .line 74
    .line 75
    iget-object v9, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->o:Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-static {v5, v9}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v11

    .line 81
    check-cast v11, La/hlp0;

    .line 82
    .line 83
    if-nez v11, :cond_1

    .line 84
    .line 85
    new-instance v11, La/uea0;

    .line 86
    .line 87
    invoke-direct {v11, v0}, La/uea0;-><init>(Landroid/widget/FrameLayout;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9, v5, v11}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    iget-object v9, v6, La/n4a0;->d:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v12, v6, La/n4a0;->b:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v6, v6, La/n4a0;->c:Ljava/lang/String;

    .line 98
    .line 99
    invoke-interface {v11, v9, v12, v6}, La/hlp0;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    check-cast v9, La/n4a0;

    .line 111
    .line 112
    iget-object v9, v9, La/n4a0;->e:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-interface {v8, v6, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-virtual {v7, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    if-nez v6, :cond_3

    .line 126
    .line 127
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    new-instance v8, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    if-eqz v11, :cond_2

    .line 149
    .line 150
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    check-cast v11, La/n4a0;

    .line 155
    .line 156
    new-instance v11, Landroid/widget/ImageView;

    .line 157
    .line 158
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 159
    .line 160
    .line 161
    move-result-object v12

    .line 162
    invoke-direct {v11, v12}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 163
    .line 164
    .line 165
    new-instance v12, Landroid/widget/FrameLayout$LayoutParams;

    .line 166
    .line 167
    iget v13, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->h:I

    .line 168
    .line 169
    invoke-direct {v12, v13, v13}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v11, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 173
    .line 174
    .line 175
    iget v12, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->b:I

    .line 176
    .line 177
    invoke-virtual {v11, v12, v12, v12, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_2
    invoke-interface {v7, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    :cond_3
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    iget-object v7, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->q:Ljava/util/LinkedHashMap;

    .line 192
    .line 193
    invoke-virtual {v7, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    if-nez v6, :cond_5

    .line 198
    .line 199
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    new-instance v6, Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 210
    .line 211
    .line 212
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v9

    .line 220
    if-eqz v9, :cond_4

    .line 221
    .line 222
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    check-cast v9, La/n4a0;

    .line 227
    .line 228
    new-instance v9, La/s1g;

    .line 229
    .line 230
    const v11, 0x7f0606a8

    .line 231
    .line 232
    .line 233
    invoke-direct {v9, v0, v11}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 234
    .line 235
    .line 236
    iget v11, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->g:F

    .line 237
    .line 238
    invoke-virtual {v9, v11}, La/s1g;->c(F)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_4
    invoke-interface {v7, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    :cond_5
    move v5, v10

    .line 249
    goto/16 :goto_1

    .line 250
    .line 251
    :cond_6
    invoke-static {}, La/q3d;->p()V

    .line 252
    .line 253
    .line 254
    throw v9

    .line 255
    :cond_7
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    check-cast v1, Ljava/lang/Iterable;

    .line 260
    .line 261
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_d

    .line 270
    .line 271
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    check-cast v2, Ljava/util/Map$Entry;

    .line 276
    .line 277
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    check-cast v3, Ljava/lang/Number;

    .line 282
    .line 283
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    check-cast v2, Ljava/lang/Iterable;

    .line 292
    .line 293
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    move v5, v4

    .line 298
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    if-eqz v6, :cond_8

    .line 303
    .line 304
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    add-int/lit8 v7, v5, 0x1

    .line 309
    .line 310
    if-ltz v5, :cond_c

    .line 311
    .line 312
    move-object v10, v6

    .line 313
    check-cast v10, Landroid/widget/ImageView;

    .line 314
    .line 315
    sget-object v6, La/u0d;->a:Ljava/util/List;

    .line 316
    .line 317
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    invoke-virtual {v8, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    check-cast v6, Ljava/util/List;

    .line 326
    .line 327
    if-eqz v6, :cond_9

    .line 328
    .line 329
    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    check-cast v5, La/boy;

    .line 334
    .line 335
    if-eqz v5, :cond_9

    .line 336
    .line 337
    iget-object v5, v5, La/boy;->b:Ljava/lang/String;

    .line 338
    .line 339
    goto :goto_5

    .line 340
    :cond_9
    move-object v5, v9

    .line 341
    :goto_5
    if-nez v5, :cond_a

    .line 342
    .line 343
    const-string v5, ""

    .line 344
    .line 345
    :cond_a
    move-object v11, v5

    .line 346
    const/16 v16, 0x0

    .line 347
    .line 348
    const/16 v17, 0x1fc

    .line 349
    .line 350
    const v12, 0x7f0804a8

    .line 351
    .line 352
    .line 353
    const/4 v13, 0x0

    .line 354
    const/4 v14, 0x0

    .line 355
    const/4 v15, 0x0

    .line 356
    invoke-static/range {v10 .. v17}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    if-nez v5, :cond_b

    .line 364
    .line 365
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 366
    .line 367
    .line 368
    :cond_b
    move v5, v7

    .line 369
    goto :goto_4

    .line 370
    :cond_c
    invoke-static {}, La/q3d;->p()V

    .line 371
    .line 372
    .line 373
    throw v9

    .line 374
    :cond_d
    return-void
.end method

.method public final setTeam(La/xnp0;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->n:La/z6p0;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, La/z6p0;

    .line 9
    .line 10
    iget v1, p1, La/xnp0;->e:I

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, La/z6p0;-><init>(Landroid/widget/FrameLayout;I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/dota/playerstatistics/kills/TeamKillsStatisticView;->n:La/z6p0;

    .line 16
    .line 17
    :cond_0
    move-object v2, v0

    .line 18
    iget-object v3, p1, La/xnp0;->a:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v4, p1, La/xnp0;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-boolean v5, p1, La/xnp0;->c:Z

    .line 23
    .line 24
    iget-boolean v6, p1, La/xnp0;->d:Z

    .line 25
    .line 26
    iget-boolean v7, p1, La/xnp0;->g:Z

    .line 27
    .line 28
    invoke-virtual/range {v2 .. v7}, La/z6p0;->d(Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 32
    .line 33
    .line 34
    return-void
.end method
