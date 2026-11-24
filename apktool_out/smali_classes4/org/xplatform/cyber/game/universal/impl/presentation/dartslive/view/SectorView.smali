.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/SectorView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public b:La/nnh0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/SectorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/SectorView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/SectorView;->a:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/SectorView;->b:La/nnh0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    int-to-float v1, v1

    .line 13
    const/high16 v2, 0x40000000    # 2.0f

    .line 14
    .line 15
    div-float/2addr v1, v2

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    int-to-float p0, p0

    .line 21
    div-float/2addr p0, v2

    .line 22
    new-instance v4, Landroid/graphics/RectF;

    .line 23
    .line 24
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 25
    .line 26
    .line 27
    iget v3, v0, La/nnh0;->d:F

    .line 28
    .line 29
    iget v5, v0, La/nnh0;->a:F

    .line 30
    .line 31
    iget v6, v0, La/nnh0;->e:F

    .line 32
    .line 33
    iget-boolean v7, v0, La/nnh0;->c:Z

    .line 34
    .line 35
    iget-object v8, v0, La/nnh0;->b:Landroid/graphics/Paint;

    .line 36
    .line 37
    move v9, v6

    .line 38
    iget v6, v0, La/nnh0;->f:F

    .line 39
    .line 40
    iget v0, v0, La/nnh0;->g:F

    .line 41
    .line 42
    mul-float/2addr v9, v1

    .line 43
    mul-float/2addr v2, v9

    .line 44
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 45
    .line 46
    .line 47
    mul-float v2, v1, v3

    .line 48
    .line 49
    sub-float v10, v1, v2

    .line 50
    .line 51
    add-float/2addr v10, v9

    .line 52
    mul-float/2addr v3, p0

    .line 53
    sub-float v11, p0, v3

    .line 54
    .line 55
    add-float/2addr v11, v9

    .line 56
    add-float/2addr v1, v2

    .line 57
    sub-float/2addr v1, v9

    .line 58
    add-float/2addr p0, v3

    .line 59
    sub-float/2addr p0, v9

    .line 60
    invoke-virtual {v4, v10, v11, v1, p0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 61
    .line 62
    .line 63
    add-float/2addr v5, v0

    .line 64
    move-object v3, p1

    .line 65
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    return-void
.end method
