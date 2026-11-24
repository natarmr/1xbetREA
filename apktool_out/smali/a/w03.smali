.class public final La/w03;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Path;

.field public b:Landroid/graphics/RectF;

.field public c:[F

.field public d:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Landroid/graphics/Path;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/w03;->a:Landroid/graphics/Path;

    .line 5
    .line 6
    return-void
.end method

.method public static a(La/w03;La/w03;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/w03;->a:Landroid/graphics/Path;

    .line 2
    .line 3
    instance-of v0, p1, La/w03;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p1, La/w03;->a:Landroid/graphics/Path;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, p1, v1, v0}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;FF)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "Unable to obtain android.graphics.Path"

    .line 23
    .line 24
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static b(La/w03;La/wfg0;)V
    .locals 13

    .line 1
    sget-object v0, La/x190;->a:La/x190;

    .line 2
    .line 3
    iget-object v1, p0, La/w03;->b:Landroid/graphics/RectF;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, La/w03;->b:Landroid/graphics/RectF;

    .line 13
    .line 14
    :cond_0
    iget v2, p1, La/wfg0;->a:F

    .line 15
    .line 16
    iget-wide v3, p1, La/wfg0;->h:J

    .line 17
    .line 18
    iget-wide v5, p1, La/wfg0;->g:J

    .line 19
    .line 20
    iget-wide v7, p1, La/wfg0;->f:J

    .line 21
    .line 22
    iget-wide v9, p1, La/wfg0;->e:J

    .line 23
    .line 24
    iget v11, p1, La/wfg0;->b:F

    .line 25
    .line 26
    iget v12, p1, La/wfg0;->c:F

    .line 27
    .line 28
    iget p1, p1, La/wfg0;->d:F

    .line 29
    .line 30
    invoke-virtual {v1, v2, v11, v12, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, La/w03;->c:[F

    .line 34
    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    const/16 p1, 0x8

    .line 38
    .line 39
    new-array p1, p1, [F

    .line 40
    .line 41
    iput-object p1, p0, La/w03;->c:[F

    .line 42
    .line 43
    :cond_1
    const/16 v1, 0x20

    .line 44
    .line 45
    shr-long v11, v9, v1

    .line 46
    .line 47
    long-to-int v2, v11

    .line 48
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v11, 0x0

    .line 53
    aput v2, p1, v11

    .line 54
    .line 55
    const-wide v11, 0xffffffffL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    and-long/2addr v9, v11

    .line 61
    long-to-int v2, v9

    .line 62
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    const/4 v9, 0x1

    .line 67
    aput v2, p1, v9

    .line 68
    .line 69
    shr-long v9, v7, v1

    .line 70
    .line 71
    long-to-int v2, v9

    .line 72
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    const/4 v9, 0x2

    .line 77
    aput v2, p1, v9

    .line 78
    .line 79
    and-long/2addr v7, v11

    .line 80
    long-to-int v2, v7

    .line 81
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    const/4 v7, 0x3

    .line 86
    aput v2, p1, v7

    .line 87
    .line 88
    shr-long v7, v5, v1

    .line 89
    .line 90
    long-to-int v2, v7

    .line 91
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    const/4 v7, 0x4

    .line 96
    aput v2, p1, v7

    .line 97
    .line 98
    and-long/2addr v5, v11

    .line 99
    long-to-int v2, v5

    .line 100
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v5, 0x5

    .line 105
    aput v2, p1, v5

    .line 106
    .line 107
    shr-long v1, v3, v1

    .line 108
    .line 109
    long-to-int v1, v1

    .line 110
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    const/4 v2, 0x6

    .line 115
    aput v1, p1, v2

    .line 116
    .line 117
    and-long v1, v3, v11

    .line 118
    .line 119
    long-to-int v1, v1

    .line 120
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    const/4 v2, 0x7

    .line 125
    aput v1, p1, v2

    .line 126
    .line 127
    iget-object p1, p0, La/w03;->a:Landroid/graphics/Path;

    .line 128
    .line 129
    iget-object v1, p0, La/w03;->b:Landroid/graphics/RectF;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object p0, p0, La/w03;->c:[F

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {v0}, La/z03;->c(La/x190;)Landroid/graphics/Path$Direction;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {p1, v1, p0, v0}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 144
    .line 145
    .line 146
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 0

    .line 1
    iget-object p0, p0, La/w03;->a:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Path;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()La/jge0;
    .locals 4

    .line 1
    iget-object v0, p0, La/w03;->b:Landroid/graphics/RectF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/RectF;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/w03;->b:Landroid/graphics/RectF;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, La/w03;->a:Landroid/graphics/Path;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p0, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 16
    .line 17
    .line 18
    new-instance p0, La/jge0;

    .line 19
    .line 20
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 21
    .line 22
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 23
    .line 24
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 25
    .line 26
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 27
    .line 28
    invoke-direct {p0, v1, v2, v3, v0}, La/jge0;-><init>(FFFF)V

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method public final e(FF)V
    .locals 0

    .line 1
    iget-object p0, p0, La/w03;->a:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(FF)V
    .locals 0

    .line 1
    iget-object p0, p0, La/w03;->a:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g(La/w03;La/w03;I)Z
    .locals 3

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    sget-object p3, Landroid/graphics/Path$Op;->DIFFERENCE:Landroid/graphics/Path$Op;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    if-ne p3, v0, :cond_1

    .line 8
    .line 9
    sget-object p3, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 v0, 0x4

    .line 13
    if-ne p3, v0, :cond_2

    .line 14
    .line 15
    sget-object p3, Landroid/graphics/Path$Op;->REVERSE_DIFFERENCE:Landroid/graphics/Path$Op;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    const/4 v0, 0x2

    .line 19
    if-ne p3, v0, :cond_3

    .line 20
    .line 21
    sget-object p3, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_3
    sget-object p3, Landroid/graphics/Path$Op;->XOR:Landroid/graphics/Path$Op;

    .line 25
    .line 26
    :goto_0
    instance-of v0, p1, La/w03;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    const-string v2, "Unable to obtain android.graphics.Path"

    .line 30
    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    iget-object p1, p1, La/w03;->a:Landroid/graphics/Path;

    .line 34
    .line 35
    instance-of v0, p2, La/w03;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object p2, p2, La/w03;->a:Landroid/graphics/Path;

    .line 40
    .line 41
    iget-object p0, p0, La/w03;->a:Landroid/graphics/Path;

    .line 42
    .line 43
    invoke-virtual {p0, p1, p2, p3}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_4
    invoke-static {v2}, La/v4i0;->p(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return v1

    .line 52
    :cond_5
    invoke-static {v2}, La/v4i0;->p(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return v1
.end method

.method public final h()V
    .locals 0

    .line 1
    iget-object p0, p0, La/w03;->a:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Path;->reset()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    iget-object p0, p0, La/w03;->a:Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/Path;->rewind()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    sget-object p1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 8
    .line 9
    :goto_0
    iget-object p0, p0, La/w03;->a:Landroid/graphics/Path;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final k(J)V
    .locals 4

    .line 1
    iget-object v0, p0, La/w03;->d:Landroid/graphics/Matrix;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Matrix;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/w03;->d:Landroid/graphics/Matrix;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object v0, p0, La/w03;->d:Landroid/graphics/Matrix;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/16 v1, 0x20

    .line 22
    .line 23
    shr-long v1, p1, v1

    .line 24
    .line 25
    long-to-int v1, v1

    .line 26
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    const-wide v2, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr p1, v2

    .line 36
    long-to-int p1, p1

    .line 37
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, La/w03;->d:Landroid/graphics/Matrix;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, La/w03;->a:Landroid/graphics/Path;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
