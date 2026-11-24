.class public abstract La/u46;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:B

.field public final c:B

.field public final d:I

.field public e:I

.field public f:Landroid/graphics/drawable/Drawable;

.field public g:Landroid/graphics/drawable/Drawable;

.field public h:I

.field public i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, p2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const p2, 0x7f07066b

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, La/u46;->a:I

    .line 20
    .line 21
    const/4 p1, 0x3

    .line 22
    iput-byte p1, p0, La/u46;->b:B

    .line 23
    .line 24
    const/4 p1, 0x4

    .line 25
    iput-byte p1, p0, La/u46;->c:B

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    const v0, 0x7f070634

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    iput p2, p0, La/u46;->d:I

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    iput p2, p0, La/u46;->e:I

    .line 49
    .line 50
    iput p1, p0, La/u46;->h:I

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;IZ)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/u46;->getTotalCount()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0}, La/u46;->getIndicatorWidth()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    mul-int/2addr v1, v0

    .line 13
    invoke-virtual {p0}, La/u46;->getTotalCount()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x1

    .line 18
    sub-int/2addr v0, v2

    .line 19
    invoke-virtual {p0}, La/u46;->getGapSize()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    mul-int/2addr v3, v0

    .line 24
    add-int/2addr v3, v1

    .line 25
    if-nez p2, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0}, La/u46;->getGapSize()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    sub-int/2addr v4, v3

    .line 48
    div-int/lit8 v4, v4, 0x2

    .line 49
    .line 50
    sub-int/2addr v1, v4

    .line 51
    invoke-virtual {p0}, La/u46;->getIndicatorWidth()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    sub-int/2addr v1, v3

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    sub-int/2addr v1, v3

    .line 62
    div-int/lit8 v1, v1, 0x2

    .line 63
    .line 64
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-ne v3, v2, :cond_2

    .line 69
    .line 70
    invoke-virtual {p0}, La/u46;->getIndicatorWidth()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    add-int/2addr v2, v0

    .line 75
    mul-int/2addr v2, p2

    .line 76
    sub-int/2addr v1, v2

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    invoke-virtual {p0}, La/u46;->getIndicatorWidth()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    add-int/2addr v2, v0

    .line 83
    mul-int/2addr v2, p2

    .line 84
    add-int/2addr v1, v2

    .line 85
    :goto_2
    int-to-float p2, v1

    .line 86
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/4 v1, 0x0

    .line 91
    invoke-virtual {p1, p2, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 92
    .line 93
    .line 94
    if-eqz p3, :cond_3

    .line 95
    .line 96
    :try_start_0
    invoke-virtual {p0}, La/u46;->getWinIndicator()Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-eqz p0, :cond_4

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :catchall_0
    move-exception p0

    .line 107
    goto :goto_4

    .line 108
    :cond_3
    invoke-virtual {p0}, La/u46;->getRegularIndicator()Landroid/graphics/drawable/Drawable;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    if-eqz p0, :cond_4

    .line 113
    .line 114
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    .line 117
    :cond_4
    :goto_3
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :goto_4
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 122
    .line 123
    .line 124
    throw p0
.end method

.method public final b(II)V
    .locals 0

    .line 1
    iput p1, p0, La/u46;->h:I

    .line 2
    .line 3
    iput p2, p0, La/u46;->i:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final getGapSize()I
    .locals 0

    .line 1
    iget p0, p0, La/u46;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public final getIndicatorHeight()I
    .locals 0

    .line 1
    iget p0, p0, La/u46;->d:I

    .line 2
    .line 3
    return p0
.end method

.method public final getIndicatorWidth()I
    .locals 0

    .line 1
    iget p0, p0, La/u46;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final getMaxTotalCount()I
    .locals 0

    .line 1
    iget-byte p0, p0, La/u46;->c:B

    .line 2
    .line 3
    return p0
.end method

.method public final getRegularIndicator()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, La/u46;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSpaceCount()I
    .locals 0

    .line 1
    iget-byte p0, p0, La/u46;->b:B

    .line 2
    .line 3
    return p0
.end method

.method public final getTotalCount()I
    .locals 0

    .line 1
    iget p0, p0, La/u46;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public final getWinCount()I
    .locals 0

    .line 1
    iget p0, p0, La/u46;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public final getWinIndicator()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, La/u46;->g:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, La/u46;->h:I

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    if-ge v2, v0, :cond_1

    .line 9
    .line 10
    iget v3, p0, La/u46;->i:I

    .line 11
    .line 12
    if-le v3, v2, :cond_0

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    move v3, v1

    .line 17
    :goto_1
    invoke-virtual {p0, p1, v2, v3}, La/u46;->a(Landroid/graphics/Canvas;IZ)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
.end method

.method public final setIndicatorWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, La/u46;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public final setRegularIndicator(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/u46;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-void
.end method

.method public final setTotalCount(I)V
    .locals 0

    .line 1
    iput p1, p0, La/u46;->h:I

    .line 2
    .line 3
    return-void
.end method

.method public final setWinIndicator(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/u46;->g:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-void
.end method

.method public final setWinIndicatorColor(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/u46;->g:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
