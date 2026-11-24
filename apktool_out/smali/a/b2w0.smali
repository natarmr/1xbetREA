.class public La/b2w0;
.super La/xa5;
.source "SourceFile"


# instance fields
.field public final h:La/a2w0;

.field public final i:Landroid/graphics/Path;

.field public final j:Landroid/graphics/RectF;

.field public k:[F

.field public final l:Landroid/graphics/Path;

.field public final m:[F


# direct methods
.method public constructor <init>(La/xju0;La/a2w0;La/ywq0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p3, p2}, La/xa5;-><init>(La/xju0;La/ywq0;La/wa5;)V

    .line 2
    .line 3
    .line 4
    new-instance p3, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, La/b2w0;->i:Landroid/graphics/Path;

    .line 10
    .line 11
    new-instance p3, Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p3, p0, La/b2w0;->j:Landroid/graphics/RectF;

    .line 17
    .line 18
    const/4 p3, 0x2

    .line 19
    new-array v0, p3, [F

    .line 20
    .line 21
    iput-object v0, p0, La/b2w0;->k:[F

    .line 22
    .line 23
    new-instance v0, Landroid/graphics/Path;

    .line 24
    .line 25
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v0, Landroid/graphics/RectF;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v0, Landroid/graphics/Path;

    .line 34
    .line 35
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/b2w0;->l:Landroid/graphics/Path;

    .line 39
    .line 40
    new-array p3, p3, [F

    .line 41
    .line 42
    iput-object p3, p0, La/b2w0;->m:[F

    .line 43
    .line 44
    new-instance p3, Landroid/graphics/RectF;

    .line 45
    .line 46
    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, La/b2w0;->h:La/a2w0;

    .line 50
    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    iget-object p1, p0, La/xa5;->f:Landroid/graphics/Paint;

    .line 54
    .line 55
    const/high16 p2, -0x1000000

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, La/xa5;->f:Landroid/graphics/Paint;

    .line 61
    .line 62
    const/high16 p1, 0x41200000    # 10.0f

    .line 63
    .line 64
    invoke-static {p1}, La/dut0;->c(F)F

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 69
    .line 70
    .line 71
    new-instance p0, Landroid/graphics/Paint;

    .line 72
    .line 73
    const/4 p1, 0x1

    .line 74
    invoke-direct {p0, p1}, Landroid/graphics/Paint;-><init>(I)V

    .line 75
    .line 76
    .line 77
    const p1, -0x777778

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 81
    .line 82
    .line 83
    const/high16 p1, 0x3f800000    # 1.0f

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 86
    .line 87
    .line 88
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 89
    .line 90
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 91
    .line 92
    .line 93
    :cond_0
    return-void
.end method


# virtual methods
.method public final p1()[F
    .locals 6

    .line 1
    iget-object v0, p0, La/b2w0;->k:[F

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    iget-object v2, p0, La/b2w0;->h:La/a2w0;

    .line 5
    .line 6
    iget v3, v2, La/wa5;->j:I

    .line 7
    .line 8
    mul-int/lit8 v3, v3, 0x2

    .line 9
    .line 10
    if-eq v1, v3, :cond_0

    .line 11
    .line 12
    new-array v0, v3, [F

    .line 13
    .line 14
    iput-object v0, p0, La/b2w0;->k:[F

    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    array-length v3, v0

    .line 18
    if-ge v1, v3, :cond_1

    .line 19
    .line 20
    add-int/lit8 v3, v1, 0x1

    .line 21
    .line 22
    iget-object v4, v2, La/wa5;->i:[F

    .line 23
    .line 24
    div-int/lit8 v5, v1, 0x2

    .line 25
    .line 26
    aget v4, v4, v5

    .line 27
    .line 28
    aput v4, v0, v3

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object p0, p0, La/xa5;->d:La/ywq0;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, La/ywq0;->x([F)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public final q1(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/xju0;

    .line 4
    .line 5
    iget-object v1, p0, La/b2w0;->h:La/a2w0;

    .line 6
    .line 7
    iget-boolean v2, v1, La/cgd;->a:Z

    .line 8
    .line 9
    if-eqz v2, :cond_4

    .line 10
    .line 11
    iget-boolean v2, v1, La/wa5;->n:Z

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto :goto_4

    .line 16
    :cond_0
    invoke-virtual {p0}, La/b2w0;->p1()[F

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x0

    .line 21
    iget-object p0, p0, La/xa5;->f:Landroid/graphics/Paint;

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    iget v3, v1, La/cgd;->d:F

    .line 27
    .line 28
    invoke-virtual {p0, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 29
    .line 30
    .line 31
    iget v3, v1, La/cgd;->e:I

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 34
    .line 35
    .line 36
    iget v3, v1, La/cgd;->b:F

    .line 37
    .line 38
    const-string v4, "A"

    .line 39
    .line 40
    invoke-static {p0, v4}, La/dut0;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    int-to-float v4, v4

    .line 45
    const/high16 v5, 0x40200000    # 2.5f

    .line 46
    .line 47
    div-float/2addr v4, v5

    .line 48
    iget v5, v1, La/cgd;->c:F

    .line 49
    .line 50
    add-float/2addr v4, v5

    .line 51
    iget v5, v1, La/a2w0;->v:I

    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    if-ne v5, v6, :cond_1

    .line 55
    .line 56
    sget-object v5, Landroid/graphics/Paint$Align;->RIGHT:Landroid/graphics/Paint$Align;

    .line 57
    .line 58
    invoke-virtual {p0, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, v0, La/xju0;->b:Landroid/graphics/RectF;

    .line 62
    .line 63
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 64
    .line 65
    sub-float/2addr v0, v3

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    sget-object v5, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    .line 68
    .line 69
    invoke-virtual {p0, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v0, La/xju0;->b:Landroid/graphics/RectF;

    .line 73
    .line 74
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 75
    .line 76
    add-float/2addr v0, v3

    .line 77
    :goto_0
    iget v3, v1, La/wa5;->j:I

    .line 78
    .line 79
    const/4 v5, 0x0

    .line 80
    :goto_1
    if-ge v5, v3, :cond_4

    .line 81
    .line 82
    if-ltz v5, :cond_3

    .line 83
    .line 84
    iget-object v7, v1, La/wa5;->i:[F

    .line 85
    .line 86
    array-length v7, v7

    .line 87
    if-lt v5, v7, :cond_2

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    invoke-virtual {v1}, La/wa5;->c()La/e3u0;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    iget-object v8, v1, La/wa5;->i:[F

    .line 95
    .line 96
    aget v8, v8, v5

    .line 97
    .line 98
    invoke-virtual {v7, v8}, La/e3u0;->a(F)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    goto :goto_3

    .line 103
    :cond_3
    :goto_2
    const-string v7, ""

    .line 104
    .line 105
    :goto_3
    mul-int/lit8 v8, v5, 0x2

    .line 106
    .line 107
    add-int/2addr v8, v6

    .line 108
    aget v8, v2, v8

    .line 109
    .line 110
    add-float/2addr v8, v4

    .line 111
    invoke-virtual {p1, v7, v0, v8, p0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v5, v5, 0x1

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    :goto_4
    return-void
.end method

.method public final r1(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v0, p0, La/b2w0;->h:La/a2w0;

    .line 2
    .line 3
    iget-boolean v1, v0, La/cgd;->a:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    const v1, -0x777778

    .line 8
    .line 9
    .line 10
    iget-object v7, p0, La/xa5;->g:Landroid/graphics/Paint;

    .line 11
    .line 12
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    const/high16 v1, 0x3f800000    # 1.0f

    .line 16
    .line 17
    invoke-virtual {v7, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 18
    .line 19
    .line 20
    iget v0, v0, La/a2w0;->v:I

    .line 21
    .line 22
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/xju0;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    if-ne v0, v1, :cond_0

    .line 28
    .line 29
    iget-object p0, p0, La/xju0;->b:Landroid/graphics/RectF;

    .line 30
    .line 31
    iget v3, p0, Landroid/graphics/RectF;->left:F

    .line 32
    .line 33
    iget v4, p0, Landroid/graphics/RectF;->top:F

    .line 34
    .line 35
    iget v6, p0, Landroid/graphics/RectF;->bottom:F

    .line 36
    .line 37
    move v5, v3

    .line 38
    move-object v2, p1

    .line 39
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    move-object v2, p1

    .line 44
    iget-object p0, p0, La/xju0;->b:Landroid/graphics/RectF;

    .line 45
    .line 46
    iget v3, p0, Landroid/graphics/RectF;->right:F

    .line 47
    .line 48
    iget v4, p0, Landroid/graphics/RectF;->top:F

    .line 49
    .line 50
    iget v6, p0, Landroid/graphics/RectF;->bottom:F

    .line 51
    .line 52
    move v5, v3

    .line 53
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void
.end method

.method public final s1(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/xju0;

    .line 4
    .line 5
    iget-object v1, p0, La/b2w0;->h:La/a2w0;

    .line 6
    .line 7
    iget-boolean v2, v1, La/cgd;->a:Z

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget-object v3, v0, La/xju0;->b:Landroid/graphics/RectF;

    .line 17
    .line 18
    iget-object v0, v0, La/xju0;->b:Landroid/graphics/RectF;

    .line 19
    .line 20
    iget-object v4, p0, La/b2w0;->j:Landroid/graphics/RectF;

    .line 21
    .line 22
    invoke-virtual {v4, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 23
    .line 24
    .line 25
    iget-object v3, p0, La/xa5;->c:La/wa5;

    .line 26
    .line 27
    iget v3, v3, La/wa5;->h:F

    .line 28
    .line 29
    neg-float v3, v3

    .line 30
    const/4 v5, 0x0

    .line 31
    invoke-virtual {v4, v5, v3}, Landroid/graphics/RectF;->inset(FF)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/b2w0;->p1()[F

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget v4, v1, La/wa5;->g:I

    .line 42
    .line 43
    iget-object v5, p0, La/xa5;->e:Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 46
    .line 47
    .line 48
    iget v4, v1, La/wa5;->h:F

    .line 49
    .line 50
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v1, La/wa5;->o:Landroid/graphics/DashPathEffect;

    .line 54
    .line 55
    invoke-virtual {v5, v1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, La/b2w0;->i:Landroid/graphics/Path;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/graphics/Path;->reset()V

    .line 61
    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    :goto_0
    array-length v4, v3

    .line 65
    if-ge v1, v4, :cond_1

    .line 66
    .line 67
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 68
    .line 69
    add-int/lit8 v6, v1, 0x1

    .line 70
    .line 71
    aget v7, v3, v6

    .line 72
    .line 73
    invoke-virtual {p0, v4, v7}, Landroid/graphics/Path;->moveTo(FF)V

    .line 74
    .line 75
    .line 76
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 77
    .line 78
    aget v6, v3, v6

    .line 79
    .line 80
    invoke-virtual {p0, v4, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p0, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/graphics/Path;->reset()V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v1, v1, 0x2

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final t1()V
    .locals 5

    .line 1
    iget-object v0, p0, La/b2w0;->h:La/a2w0;

    .line 2
    .line 3
    iget-object v0, v0, La/wa5;->p:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-gtz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, La/b2w0;->m:[F

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    aput v3, v1, v2

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    aput v3, v1, v4

    .line 20
    .line 21
    iget-object p0, p0, La/b2w0;->l:Landroid/graphics/Path;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/graphics/Path;->reset()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-gtz p0, :cond_1

    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {}, La/hny;->b()V

    .line 41
    .line 42
    .line 43
    return-void
.end method
