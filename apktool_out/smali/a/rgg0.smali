.class public final La/rgg0;
.super Landroid/text/style/ReplacementSpan;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public c:I

.field public final d:Ljava/lang/Float;

.field public final e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(IILjava/lang/Float;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 21
    iput p1, p0, La/rgg0;->b:I

    .line 22
    iput p2, p0, La/rgg0;->c:I

    .line 23
    iput-object p3, p0, La/rgg0;->d:Ljava/lang/Float;

    const p1, -0xff0001

    .line 24
    iput p1, p0, La/rgg0;->a:I

    const/4 p1, 0x0

    .line 25
    iput-object p1, p0, La/rgg0;->e:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Float;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    iput-object p3, p0, La/rgg0;->e:Ljava/lang/Integer;

    .line 9
    .line 10
    iput p1, p0, La/rgg0;->a:I

    .line 11
    .line 12
    iput-object p2, p0, La/rgg0;->d:Ljava/lang/Float;

    .line 13
    .line 14
    iput p4, p0, La/rgg0;->b:I

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, La/rgg0;->c:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 9

    .line 1
    move-object/from16 v6, p9

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v6}, Landroid/graphics/Paint;->getColor()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget v2, p0, La/rgg0;->a:I

    .line 17
    .line 18
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v6, p2, p3, p4}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    move/from16 v4, p7

    .line 26
    .line 27
    int-to-float v5, v4

    .line 28
    invoke-virtual {v6}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget v4, v4, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 33
    .line 34
    add-float/2addr v4, v5

    .line 35
    iget v7, p0, La/rgg0;->b:I

    .line 36
    .line 37
    int-to-float v7, v7

    .line 38
    sub-float/2addr v4, v7

    .line 39
    invoke-virtual {v6}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    iget v8, v8, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 44
    .line 45
    add-float/2addr v8, v5

    .line 46
    add-float/2addr v8, v7

    .line 47
    iget v7, p0, La/rgg0;->c:I

    .line 48
    .line 49
    mul-int/lit8 v7, v7, 0x2

    .line 50
    .line 51
    int-to-float v7, v7

    .line 52
    add-float/2addr v2, v7

    .line 53
    new-instance v7, Landroid/graphics/RectF;

    .line 54
    .line 55
    add-float/2addr v2, p5

    .line 56
    invoke-direct {v7, p5, v4, v2, v8}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, La/rgg0;->d:Ljava/lang/Float;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {p1, v7, v4, v2, v6}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 73
    .line 74
    .line 75
    iget p0, p0, La/rgg0;->c:I

    .line 76
    .line 77
    int-to-float p0, p0

    .line 78
    add-float v4, p5, p0

    .line 79
    .line 80
    move-object v0, p1

    .line 81
    move-object v1, p2

    .line 82
    move v2, p3

    .line 83
    move v3, p4

    .line 84
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/Paint;->measureText(Ljava/lang/CharSequence;II)F

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget p3, p0, La/rgg0;->b:I

    .line 13
    .line 14
    if-eqz p5, :cond_0

    .line 15
    .line 16
    iget p4, p1, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 17
    .line 18
    sub-int/2addr p4, p3

    .line 19
    iput p4, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 20
    .line 21
    :cond_0
    if-eqz p5, :cond_1

    .line 22
    .line 23
    iget p4, p1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 24
    .line 25
    sub-int/2addr p4, p3

    .line 26
    iput p4, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 27
    .line 28
    :cond_1
    if-eqz p5, :cond_2

    .line 29
    .line 30
    iget p4, p1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 31
    .line 32
    add-int/2addr p4, p3

    .line 33
    iput p4, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 34
    .line 35
    :cond_2
    if-eqz p5, :cond_3

    .line 36
    .line 37
    iget p1, p1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 38
    .line 39
    add-int/2addr p1, p3

    .line 40
    iput p1, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 41
    .line 42
    :cond_3
    iget-object p1, p0, La/rgg0;->e:Ljava/lang/Integer;

    .line 43
    .line 44
    if-eqz p1, :cond_4

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    int-to-float p3, p3

    .line 51
    sub-float/2addr p3, p2

    .line 52
    const/high16 p2, 0x40000000    # 2.0f

    .line 53
    .line 54
    div-float/2addr p3, p2

    .line 55
    float-to-int p2, p3

    .line 56
    iput p2, p0, La/rgg0;->c:I

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0

    .line 63
    :cond_4
    iget p0, p0, La/rgg0;->c:I

    .line 64
    .line 65
    int-to-float p1, p0

    .line 66
    add-float/2addr p1, p2

    .line 67
    int-to-float p0, p0

    .line 68
    add-float/2addr p1, p0

    .line 69
    float-to-int p0, p1

    .line 70
    return p0
.end method
