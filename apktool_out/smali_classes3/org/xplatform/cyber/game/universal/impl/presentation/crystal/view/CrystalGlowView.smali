.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final synthetic i:I


# instance fields
.field public final a:I

.field public final b:I

.field public final c:La/a8z;

.field public final d:La/a8z;

.field public e:F

.field public f:F

.field public g:F

.field public final h:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

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
    const p2, 0x7f060163

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->a:I

    .line 21
    .line 22
    const p2, 0x7f060164

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->b:I

    .line 30
    .line 31
    new-instance p2, La/xff;

    .line 32
    .line 33
    invoke-direct {p2, p0, p3}, La/xff;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;B)V

    .line 34
    .line 35
    .line 36
    sget-object p3, La/wez;->b:La/wez;

    .line 37
    .line 38
    invoke-static {p3, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    iput-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->c:La/a8z;

    .line 43
    .line 44
    new-instance p2, La/xff;

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-direct {p2, p0, v0}, La/xff;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p3, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iput-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->d:La/a8z;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const p2, 0x7f0700ab

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    iput p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->h:F

    .line 68
    .line 69
    return-void
.end method

.method private final getGlowPaint()Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/Paint;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getLinePaint()Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->d:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/Paint;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Landroid/graphics/RectF;

    .line 8
    .line 9
    iget v1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->f:F

    .line 10
    .line 11
    iget v2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->e:F

    .line 12
    .line 13
    sub-float/2addr v2, v1

    .line 14
    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->getGlowPaint()Landroid/graphics/Paint;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget v2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->h:F

    .line 22
    .line 23
    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->getLinePaint()Landroid/graphics/Paint;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p1, v0, v2, v2, p0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-le p2, v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    :goto_0
    int-to-float p2, p2

    .line 24
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->e:F

    .line 25
    .line 26
    const v0, 0x3d23d70a    # 0.04f

    .line 27
    .line 28
    .line 29
    mul-float/2addr p2, v0

    .line 30
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->f:F

    .line 31
    .line 32
    const/high16 v0, 0x40000000    # 2.0f

    .line 33
    .line 34
    div-float/2addr p2, v0

    .line 35
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalGlowView;->g:F

    .line 36
    .line 37
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
