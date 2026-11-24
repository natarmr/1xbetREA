.class public final La/qse;
.super La/fhe0;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Landroid/content/Context;

.field public final d:I

.field public final e:I

.field public final f:I

.field public g:La/rse;

.field public h:Landroid/graphics/Bitmap;

.field public final i:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(ZZLandroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, La/qse;->a:Z

    .line 8
    .line 9
    iput-boolean p2, p0, La/qse;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, La/qse;->c:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const p2, 0x7f0701bb

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, La/qse;->d:I

    .line 25
    .line 26
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const p2, 0x7f070633

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput p1, p0, La/qse;->e:I

    .line 38
    .line 39
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const p2, 0x7f070717

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, La/qse;->f:I

    .line 51
    .line 52
    sget-object p1, La/rse;->a:La/rse;

    .line 53
    .line 54
    iput-object p1, p0, La/qse;->g:La/rse;

    .line 55
    .line 56
    new-instance p1, Landroid/graphics/Paint;

    .line 57
    .line 58
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, La/qse;->i:Landroid/graphics/Paint;

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1, p2, p3, p4}, La/fhe0;->f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    const/4 v0, -0x1

    .line 18
    if-ne p4, v0, :cond_0

    .line 19
    .line 20
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->V(Landroid/view/View;)I

    .line 21
    .line 22
    .line 23
    move-result p4

    .line 24
    :cond_0
    if-ne p4, v0, :cond_1

    .line 25
    .line 26
    const-class p0, La/qse;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "No position for item in RecyclerView"

    .line 33
    .line 34
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->W(Landroid/view/View;)La/xhe0;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    instance-of p3, p2, La/cp;

    .line 43
    .line 44
    if-eqz p3, :cond_2

    .line 45
    .line 46
    check-cast p2, La/cp;

    .line 47
    .line 48
    invoke-virtual {p2}, La/cp;->u()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/4 p2, 0x0

    .line 54
    :goto_0
    iget-boolean p3, p0, La/qse;->a:Z

    .line 55
    .line 56
    if-nez p3, :cond_3

    .line 57
    .line 58
    instance-of p3, p2, La/t0m;

    .line 59
    .line 60
    if-eqz p3, :cond_3

    .line 61
    .line 62
    check-cast p2, La/t0m;

    .line 63
    .line 64
    invoke-interface {p2}, La/t0m;->c()La/rse;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    iput-object p2, p0, La/qse;->g:La/rse;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    sget-object p2, La/rse;->a:La/rse;

    .line 72
    .line 73
    iput-object p2, p0, La/qse;->g:La/rse;

    .line 74
    .line 75
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-eqz p2, :cond_5

    .line 80
    .line 81
    const/4 p3, 0x1

    .line 82
    if-eq p2, p3, :cond_4

    .line 83
    .line 84
    const/4 p0, 0x0

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    iget p0, p0, La/qse;->e:I

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    iget p0, p0, La/qse;->f:I

    .line 90
    .line 91
    :goto_2
    iput p0, p1, Landroid/graphics/Rect;->bottom:I

    .line 92
    .line 93
    return-void
.end method

.method public final h(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget p3, p0, La/qse;->d:I

    .line 8
    .line 9
    int-to-float v0, p3

    .line 10
    iget-object v1, p0, La/qse;->c:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const v3, 0x7f0706f8

    .line 17
    .line 18
    .line 19
    const v4, 0x7f070717

    .line 20
    .line 21
    .line 22
    iget-boolean v5, p0, La/qse;->b:Z

    .line 23
    .line 24
    iget-boolean v6, p0, La/qse;->a:Z

    .line 25
    .line 26
    if-nez v6, :cond_1

    .line 27
    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v7, v4

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    move v7, v3

    .line 34
    :goto_1
    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    int-to-float v2, v2

    .line 39
    add-float/2addr v0, v2

    .line 40
    iget-object v2, p0, La/qse;->h:Landroid/graphics/Bitmap;

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v8, 0x1

    .line 44
    if-nez v2, :cond_7

    .line 45
    .line 46
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/4 v9, 0x2

    .line 51
    mul-int/2addr p3, v9

    .line 52
    sub-int/2addr v2, p3

    .line 53
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    if-nez v6, :cond_3

    .line 58
    .line 59
    if-nez v5, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move v3, v4

    .line 63
    :cond_3
    :goto_2
    invoke-virtual {p3, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    mul-int/2addr p3, v9

    .line 68
    sub-int/2addr v2, p3

    .line 69
    const/high16 p3, 0x40000000    # 2.0f

    .line 70
    .line 71
    invoke-static {v2, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    iget v4, p0, La/qse;->e:I

    .line 76
    .line 77
    invoke-static {v4, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    iget-object v5, p0, La/qse;->g:La/rse;

    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    const/4 v6, 0x0

    .line 88
    if-eqz v5, :cond_6

    .line 89
    .line 90
    if-eq v5, v8, :cond_5

    .line 91
    .line 92
    if-ne v5, v9, :cond_4

    .line 93
    .line 94
    new-instance v6, La/kaj;

    .line 95
    .line 96
    invoke-direct {v6, v1}, La/kaj;-><init>(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_5
    new-instance v5, Lorg/xplatform/uikit/components/separator/DsSeparator;

    .line 105
    .line 106
    const/4 v9, 0x6

    .line 107
    invoke-direct {v5, v1, v6, v9, v7}, Lorg/xplatform/uikit/components/separator/DsSeparator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    const v6, 0x7f040b15

    .line 118
    .line 119
    .line 120
    invoke-static {v6, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-virtual {v5, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 125
    .line 126
    .line 127
    move-object v6, v5

    .line 128
    :cond_6
    :goto_3
    if-eqz v6, :cond_7

    .line 129
    .line 130
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 131
    .line 132
    invoke-static {v2, v4, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v5, Landroid/graphics/Canvas;

    .line 140
    .line 141
    invoke-direct {v5, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v6, v3, p3}, Landroid/view/View;->measure(II)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v6, v7, v7, v2, v4}, Landroid/view/View;->layout(IIII)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v6, v5}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 151
    .line 152
    .line 153
    iput-object v1, p0, La/qse;->h:Landroid/graphics/Bitmap;

    .line 154
    .line 155
    :cond_7
    iget-object p3, p0, La/qse;->h:Landroid/graphics/Bitmap;

    .line 156
    .line 157
    if-eqz p3, :cond_8

    .line 158
    .line 159
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    sub-int/2addr v1, v8

    .line 164
    :goto_4
    if-ge v7, v1, :cond_8

    .line 165
    .line 166
    invoke-virtual {p2, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    int-to-float v2, v2

    .line 175
    iget-object v3, p0, La/qse;->i:Landroid/graphics/Paint;

    .line 176
    .line 177
    invoke-virtual {p1, p3, v0, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 178
    .line 179
    .line 180
    add-int/lit8 v7, v7, 0x1

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_8
    return-void
.end method
