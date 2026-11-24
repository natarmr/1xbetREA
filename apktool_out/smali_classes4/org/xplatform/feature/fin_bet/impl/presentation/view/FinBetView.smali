.class public final Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic m1:I


# instance fields
.field public final A:Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;

.field public B:I

.field public f1:I

.field public g1:I

.field public h1:Z

.field public i1:Z

.field public j1:[F

.field public k1:I

.field public l1:I

.field public final q:La/n0o0;

.field public final r:La/n0o0;

.field public final s:La/n0o0;

.field public final t:La/n0o0;

.field public final u:La/n0o0;

.field public final v:La/n0o0;

.field public final w:Landroid/graphics/PointF;

.field public final x:Landroid/graphics/Rect;

.field public final y:F

.field public final z:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    new-instance p2, La/ryl;

    .line 14
    .line 15
    const/16 v0, 0x1a

    .line 16
    .line 17
    invoke-direct {p2, p1, v0}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->q:La/n0o0;

    .line 25
    .line 26
    new-instance p2, La/dfp;

    .line 27
    .line 28
    const/16 v0, 0x1d

    .line 29
    .line 30
    invoke-direct {p2, v0}, La/dfp;-><init>(B)V

    .line 31
    .line 32
    .line 33
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iput-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->r:La/n0o0;

    .line 38
    .line 39
    new-instance p2, La/ryl;

    .line 40
    .line 41
    const/16 v1, 0x1b

    .line 42
    .line 43
    invoke-direct {p2, p1, v1}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    iput-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->s:La/n0o0;

    .line 51
    .line 52
    new-instance p2, La/ryl;

    .line 53
    .line 54
    const/16 v1, 0x1c

    .line 55
    .line 56
    invoke-direct {p2, p1, v1}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    iput-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->t:La/n0o0;

    .line 64
    .line 65
    new-instance p2, La/ryl;

    .line 66
    .line 67
    invoke-direct {p2, p1, v0}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    iput-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->u:La/n0o0;

    .line 75
    .line 76
    new-instance p2, La/i7q;

    .line 77
    .line 78
    invoke-direct {p2, p1, p3}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    iput-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->v:La/n0o0;

    .line 86
    .line 87
    new-instance p2, Landroid/graphics/PointF;

    .line 88
    .line 89
    invoke-direct {p2}, Landroid/graphics/PointF;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->w:Landroid/graphics/PointF;

    .line 93
    .line 94
    new-instance p2, Landroid/graphics/Rect;

    .line 95
    .line 96
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->x:Landroid/graphics/Rect;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 110
    .line 111
    const/high16 v0, 0x40800000    # 4.0f

    .line 112
    .line 113
    mul-float/2addr p2, v0

    .line 114
    float-to-double v0, p2

    .line 115
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    double-to-float p2, v0

    .line 120
    float-to-int p2, p2

    .line 121
    int-to-float p2, p2

    .line 122
    iput p2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->y:F

    .line 123
    .line 124
    const/4 p2, -0x1

    .line 125
    iput p2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->g1:I

    .line 126
    .line 127
    new-array p2, p3, [F

    .line 128
    .line 129
    iput-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 130
    .line 131
    const p2, 0x7f0d01d7

    .line 132
    .line 133
    .line 134
    invoke-static {p1, p2, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    const p1, 0x7f0a02dc

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    check-cast p1, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 148
    .line 149
    iput-object p1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->z:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 150
    .line 151
    const p1, 0x7f0a0256

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    check-cast p1, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;

    .line 162
    .line 163
    iput-object p1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->A:Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;

    .line 164
    .line 165
    return-void
.end method

.method private final getLevelLinePaint()Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->s:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

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

.method private final getLevelLineTextPaint()Landroid/text/TextPaint;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->t:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/text/TextPaint;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getNoBetsTextPoints()Lkotlin/Pair;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Pair<",
            "Landroid/graphics/PointF;",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->getNoBetsTitleTextPaint()Landroid/text/TextPaint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->getNoBetsTitle()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->getNoBetsTitle()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    iget-object v4, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->x:Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-float v0, v0

    .line 28
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->A:Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    int-to-float v1, v1

    .line 35
    sub-float/2addr v0, v1

    .line 36
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->z:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 37
    .line 38
    invoke-virtual {v1}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->getNoBetsAreaSizeX()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/high16 v2, 0x40000000    # 2.0f

    .line 43
    .line 44
    div-float/2addr v1, v2

    .line 45
    sub-float/2addr v0, v1

    .line 46
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    div-int/lit8 v1, v1, 0x2

    .line 51
    .line 52
    int-to-float v1, v1

    .line 53
    add-float/2addr v0, v1

    .line 54
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    int-to-float v1, v1

    .line 59
    const v2, 0x3d4ccccd    # 0.05f

    .line 60
    .line 61
    .line 62
    mul-float/2addr v1, v2

    .line 63
    sub-float/2addr v0, v1

    .line 64
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->w:Landroid/graphics/PointF;

    .line 65
    .line 66
    iput v0, v1, Landroid/graphics/PointF;->x:F

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    div-int/lit8 p0, p0, 0x2

    .line 73
    .line 74
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    div-int/lit8 v0, v0, 0x2

    .line 79
    .line 80
    add-int/2addr v0, p0

    .line 81
    int-to-float p0, v0

    .line 82
    iput p0, v1, Landroid/graphics/PointF;->y:F

    .line 83
    .line 84
    new-instance p0, Lkotlin/Pair;

    .line 85
    .line 86
    invoke-direct {p0, v1, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-object p0
.end method

.method private final getNoBetsTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->q:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getNoBetsTitleTextPaint()Landroid/text/TextPaint;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->u:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/text/TextPaint;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getTouchSlop()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->v:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getZonesPaint()Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->r:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

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
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super/range {p0 .. p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 8
    .line 9
    array-length v2, v1

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget v2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->k1:I

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    :goto_0
    return-void

    .line 18
    :cond_1
    int-to-float v2, v2

    .line 19
    array-length v3, v1

    .line 20
    const/16 v4, 0x17

    .line 21
    .line 22
    if-ge v4, v3, :cond_2

    .line 23
    .line 24
    aget v1, v1, v4

    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    const/4 v1, 0x0

    .line 32
    :goto_1
    const/4 v7, 0x1

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    :goto_2
    move v3, v1

    .line 40
    goto :goto_3

    .line 41
    :cond_3
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    array-length v3, v1

    .line 47
    if-eqz v3, :cond_5

    .line 48
    .line 49
    array-length v3, v1

    .line 50
    sub-int/2addr v3, v7

    .line 51
    aget v1, v1, v3

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    int-to-float v1, v1

    .line 59
    iget-object v8, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->A:Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;

    .line 60
    .line 61
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    int-to-float v4, v4

    .line 66
    sub-float v4, v1, v4

    .line 67
    .line 68
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 69
    .line 70
    invoke-virtual {v8}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->getCurrentHighlightView()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    mul-int/lit8 v5, v5, 0x2

    .line 75
    .line 76
    add-int/2addr v5, v7

    .line 77
    aget v5, v1, v5

    .line 78
    .line 79
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->getZonesPaint()Landroid/graphics/Paint;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const v9, 0x7f0606c3

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 98
    .line 99
    .line 100
    move-object v1, p1

    .line 101
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 102
    .line 103
    .line 104
    iget v1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->k1:I

    .line 105
    .line 106
    int-to-float v2, v1

    .line 107
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 108
    .line 109
    invoke-virtual {v8}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->getCurrentHighlightView()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    mul-int/lit8 v3, v3, 0x2

    .line 114
    .line 115
    add-int/2addr v3, v7

    .line 116
    aget v3, v1, v3

    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    int-to-float v1, v1

    .line 123
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    int-to-float v4, v4

    .line 128
    sub-float v4, v1, v4

    .line 129
    .line 130
    iget-object v1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 131
    .line 132
    aget v5, v1, v7

    .line 133
    .line 134
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->getZonesPaint()Landroid/graphics/Paint;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    const v9, 0x7f0606d2

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v9}, Landroid/content/Context;->getColor(I)I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 153
    .line 154
    .line 155
    move-object v1, p1

    .line 156
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 157
    .line 158
    .line 159
    iget v2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->k1:I

    .line 160
    .line 161
    int-to-float v2, v2

    .line 162
    iget-object v3, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 163
    .line 164
    invoke-virtual {v8}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->getCurrentHighlightView()I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    mul-int/lit8 v4, v4, 0x2

    .line 169
    .line 170
    add-int/2addr v4, v7

    .line 171
    aget v3, v3, v4

    .line 172
    .line 173
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 189
    .line 190
    const/high16 v9, 0x40400000    # 3.0f

    .line 191
    .line 192
    mul-float/2addr v4, v9

    .line 193
    float-to-double v4, v4

    .line 194
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 195
    .line 196
    .line 197
    move-result-wide v4

    .line 198
    double-to-float v4, v4

    .line 199
    float-to-int v4, v4

    .line 200
    int-to-float v4, v4

    .line 201
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->getLevelLinePaint()Landroid/graphics/Paint;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 206
    .line 207
    .line 208
    iget v2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->k1:I

    .line 209
    .line 210
    int-to-float v2, v2

    .line 211
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 227
    .line 228
    mul-float/2addr v3, v9

    .line 229
    float-to-double v3, v3

    .line 230
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 231
    .line 232
    .line 233
    move-result-wide v3

    .line 234
    double-to-float v3, v3

    .line 235
    float-to-int v3, v3

    .line 236
    int-to-float v3, v3

    .line 237
    add-float/2addr v2, v3

    .line 238
    iget-object v3, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 239
    .line 240
    invoke-virtual {v8}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->getCurrentHighlightView()I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    mul-int/lit8 v4, v4, 0x2

    .line 245
    .line 246
    add-int/2addr v4, v7

    .line 247
    aget v3, v3, v4

    .line 248
    .line 249
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    int-to-float v4, v4

    .line 254
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    int-to-float v5, v5

    .line 259
    const v6, 0x3f7851ec    # 0.97f

    .line 260
    .line 261
    .line 262
    mul-float/2addr v5, v6

    .line 263
    sub-float/2addr v4, v5

    .line 264
    iget-object v5, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 265
    .line 266
    invoke-virtual {v8}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->getCurrentHighlightView()I

    .line 267
    .line 268
    .line 269
    move-result v6

    .line 270
    mul-int/lit8 v6, v6, 0x2

    .line 271
    .line 272
    add-int/2addr v6, v7

    .line 273
    aget v5, v5, v6

    .line 274
    .line 275
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->getLevelLinePaint()Landroid/graphics/Paint;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v8}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->getCurrentHighlightView()I

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    invoke-virtual {v8}, Landroid/view/ViewGroup;->getChildCount()I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    sub-int/2addr v3, v7

    .line 291
    iget v4, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->y:F

    .line 292
    .line 293
    if-ne v2, v3, :cond_4

    .line 294
    .line 295
    mul-float/2addr v9, v4

    .line 296
    goto :goto_4

    .line 297
    :cond_4
    neg-float v9, v4

    .line 298
    :goto_4
    sget-object v2, La/pn40;->a:La/pn40;

    .line 299
    .line 300
    invoke-virtual {v8}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->getCurrentHighlightView()I

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    invoke-virtual {v8, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    check-cast v2, La/qva;

    .line 312
    .line 313
    invoke-virtual {v2}, La/qva;->getPrice()D

    .line 314
    .line 315
    .line 316
    move-result-wide v2

    .line 317
    iget v5, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->l1:I

    .line 318
    .line 319
    const/4 v6, 0x0

    .line 320
    invoke-static {v2, v3, v5, v6}, La/pn40;->j(DIZ)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    iget v3, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->k1:I

    .line 325
    .line 326
    int-to-float v3, v3

    .line 327
    const/high16 v5, 0x40000000    # 2.0f

    .line 328
    .line 329
    mul-float/2addr v5, v4

    .line 330
    add-float/2addr v5, v3

    .line 331
    iget-object v3, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 332
    .line 333
    invoke-virtual {v8}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->getCurrentHighlightView()I

    .line 334
    .line 335
    .line 336
    move-result v4

    .line 337
    mul-int/lit8 v4, v4, 0x2

    .line 338
    .line 339
    add-int/2addr v4, v7

    .line 340
    aget v3, v3, v4

    .line 341
    .line 342
    add-float/2addr v3, v9

    .line 343
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->getLevelLineTextPaint()Landroid/text/TextPaint;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    invoke-virtual {p1, v2, v5, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 348
    .line 349
    .line 350
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->getNoBetsTextPoints()Lkotlin/Pair;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 355
    .line 356
    .line 357
    iget-object v3, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v3, Landroid/graphics/PointF;

    .line 360
    .line 361
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 362
    .line 363
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 364
    .line 365
    const/high16 v5, -0x3d4c0000    # -90.0f

    .line 366
    .line 367
    invoke-virtual {p1, v5, v4, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 368
    .line 369
    .line 370
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->getNoBetsTitle()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    iget-object v2, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v2, Landroid/graphics/PointF;

    .line 377
    .line 378
    iget v4, v2, Landroid/graphics/PointF;->x:F

    .line 379
    .line 380
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 381
    .line 382
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->getNoBetsTitleTextPaint()Landroid/text/TextPaint;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    invoke-virtual {p1, v3, v4, v2, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :cond_5
    const-string v0, "Array is empty."

    .line 394
    .line 395
    invoke-static {v0}, La/v4i0;->o(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->i1:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->z:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->j()[F

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 8
    .line 9
    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->z:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 8
    .line 9
    invoke-virtual {p1}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->j()[F

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iput-object p2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 14
    .line 15
    array-length v0, p2

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->A:Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->setGrid([F)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;->getStartBetZone()F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    float-to-int p1, p1

    .line 29
    iput p1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->k1:I

    .line 30
    .line 31
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x2

    .line 9
    iget-object v2, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->A:Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    if-nez v0, :cond_5

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ne v0, v4, :cond_5

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    float-to-int v0, v0

    .line 26
    iput v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->B:I

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    float-to-int v0, v0

    .line 33
    iput v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->f1:I

    .line 34
    .line 35
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iput p1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->g1:I

    .line 40
    .line 41
    iput-boolean v4, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->h1:Z

    .line 42
    .line 43
    iget p1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->f1:I

    .line 44
    .line 45
    iget-object v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 46
    .line 47
    array-length v0, v0

    .line 48
    invoke-static {v4, v0}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v1, v0}, La/l1e0;->m(ILkotlin/ranges/IntRange;)Lkotlin/ranges/a;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget v5, v0, Lkotlin/ranges/a;->a:I

    .line 57
    .line 58
    iget v6, v0, Lkotlin/ranges/a;->b:I

    .line 59
    .line 60
    iget v0, v0, Lkotlin/ranges/a;->c:I

    .line 61
    .line 62
    if-lez v0, :cond_0

    .line 63
    .line 64
    if-le v5, v6, :cond_1

    .line 65
    .line 66
    :cond_0
    if-gez v0, :cond_c

    .line 67
    .line 68
    if-gt v6, v5, :cond_c

    .line 69
    .line 70
    :cond_1
    :goto_0
    iget-object v7, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 71
    .line 72
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    array-length v7, v7

    .line 76
    sub-int/2addr v7, v4

    .line 77
    if-ne v5, v7, :cond_2

    .line 78
    .line 79
    div-int/2addr v5, v1

    .line 80
    invoke-virtual {v2, v5}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->setupViewIndex(I)V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_4

    .line 84
    .line 85
    :cond_2
    iget-object v7, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->j1:[F

    .line 86
    .line 87
    aget v8, v7, v5

    .line 88
    .line 89
    add-int/lit8 v9, v5, 0x2

    .line 90
    .line 91
    aget v7, v7, v9

    .line 92
    .line 93
    int-to-float v10, p1

    .line 94
    cmpg-float v11, v7, v10

    .line 95
    .line 96
    if-gez v11, :cond_4

    .line 97
    .line 98
    cmpg-float v11, v10, v8

    .line 99
    .line 100
    if-gez v11, :cond_4

    .line 101
    .line 102
    sub-float p1, v8, v7

    .line 103
    .line 104
    const/high16 v0, 0x40000000    # 2.0f

    .line 105
    .line 106
    div-float/2addr p1, v0

    .line 107
    sub-float/2addr v8, p1

    .line 108
    cmpg-float p1, v8, v10

    .line 109
    .line 110
    if-gez p1, :cond_3

    .line 111
    .line 112
    div-int/2addr v5, v1

    .line 113
    goto :goto_1

    .line 114
    :cond_3
    div-int/lit8 v5, v9, 0x2

    .line 115
    .line 116
    :goto_1
    invoke-virtual {v2, v5}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->setupViewIndex(I)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_4

    .line 120
    .line 121
    :cond_4
    if-eq v5, v6, :cond_c

    .line 122
    .line 123
    add-int/2addr v5, v0

    .line 124
    goto :goto_0

    .line 125
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-ne v0, v1, :cond_a

    .line 130
    .line 131
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    iget v1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->g1:I

    .line 136
    .line 137
    if-ne v0, v1, :cond_a

    .line 138
    .line 139
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    iget v1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->B:I

    .line 144
    .line 145
    int-to-float v1, v1

    .line 146
    sub-float/2addr v0, v1

    .line 147
    float-to-int v0, v0

    .line 148
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    int-to-float v0, v0

    .line 153
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    float-to-int v1, v1

    .line 158
    iget v5, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->f1:I

    .line 159
    .line 160
    sub-int/2addr v1, v5

    .line 161
    int-to-float v1, v1

    .line 162
    iget-boolean v5, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->h1:Z

    .line 163
    .line 164
    if-eqz v5, :cond_6

    .line 165
    .line 166
    iget-boolean v5, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->i1:Z

    .line 167
    .line 168
    if-nez v5, :cond_6

    .line 169
    .line 170
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    const/high16 v6, 0x40400000    # 3.0f

    .line 175
    .line 176
    div-float/2addr v5, v6

    .line 177
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    cmpl-float v0, v5, v0

    .line 182
    .line 183
    if-lez v0, :cond_6

    .line 184
    .line 185
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    invoke-direct {p0}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->getTouchSlop()I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    int-to-float v5, v5

    .line 194
    cmpl-float v0, v0, v5

    .line 195
    .line 196
    if-ltz v0, :cond_6

    .line 197
    .line 198
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    float-to-int p1, p1

    .line 203
    iput p1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->f1:I

    .line 204
    .line 205
    iput-boolean v3, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->h1:Z

    .line 206
    .line 207
    iput-boolean v4, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->i1:Z

    .line 208
    .line 209
    goto/16 :goto_4

    .line 210
    .line 211
    :cond_6
    iget-boolean v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->i1:Z

    .line 212
    .line 213
    if-eqz v0, :cond_c

    .line 214
    .line 215
    const/4 v0, 0x0

    .line 216
    cmpl-float v5, v1, v0

    .line 217
    .line 218
    if-lez v5, :cond_7

    .line 219
    .line 220
    invoke-virtual {v2}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->getCurrentHighlightView()I

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    sub-int/2addr v6, v4

    .line 225
    goto :goto_2

    .line 226
    :cond_7
    invoke-virtual {v2}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->getCurrentHighlightView()I

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    add-int/2addr v6, v4

    .line 231
    :goto_2
    if-ltz v6, :cond_c

    .line 232
    .line 233
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    if-ge v6, v7, :cond_c

    .line 238
    .line 239
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 247
    .line 248
    .line 249
    move-result v8

    .line 250
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    int-to-float v9, v9

    .line 255
    cmpl-float v8, v8, v9

    .line 256
    .line 257
    if-lez v8, :cond_8

    .line 258
    .line 259
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    invoke-virtual {v7}, Landroid/view/View;->getBottom()I

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    int-to-float v9, v9

    .line 268
    cmpg-float v8, v8, v9

    .line 269
    .line 270
    if-gez v8, :cond_8

    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_8
    if-lez v5, :cond_9

    .line 274
    .line 275
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    invoke-virtual {v7}, Landroid/view/View;->getBottom()I

    .line 280
    .line 281
    .line 282
    move-result v8

    .line 283
    int-to-float v8, v8

    .line 284
    cmpl-float v5, v5, v8

    .line 285
    .line 286
    if-lez v5, :cond_9

    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_9
    cmpg-float v0, v1, v0

    .line 290
    .line 291
    if-gez v0, :cond_c

    .line 292
    .line 293
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    int-to-float v0, v0

    .line 302
    cmpg-float p1, p1, v0

    .line 303
    .line 304
    if-gez p1, :cond_c

    .line 305
    .line 306
    :goto_3
    invoke-virtual {v2, v6}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->setupViewIndex(I)V

    .line 307
    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_a
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    const/4 v1, 0x3

    .line 315
    if-eq v0, v1, :cond_b

    .line 316
    .line 317
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-eq v0, v4, :cond_b

    .line 322
    .line 323
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    const/4 v1, 0x6

    .line 328
    if-ne v0, v1, :cond_c

    .line 329
    .line 330
    :cond_b
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 331
    .line 332
    .line 333
    move-result p1

    .line 334
    iget v0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->g1:I

    .line 335
    .line 336
    if-ne p1, v0, :cond_c

    .line 337
    .line 338
    iput-boolean v3, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->h1:Z

    .line 339
    .line 340
    iput-boolean v3, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->i1:Z

    .line 341
    .line 342
    const/4 p1, -0x1

    .line 343
    iput p1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->g1:I

    .line 344
    .line 345
    :cond_c
    :goto_4
    iget-boolean p1, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->i1:Z

    .line 346
    .line 347
    if-nez p1, :cond_e

    .line 348
    .line 349
    iget-boolean p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->h1:Z

    .line 350
    .line 351
    if-eqz p0, :cond_d

    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_d
    return v3

    .line 355
    :cond_e
    :goto_5
    return v4
.end method

.method public final setLastClickedCoefficient(La/p0d;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, La/p0d;->a:I

    .line 5
    .line 6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object p1, p1, La/p0d;->b:La/qic;

    .line 11
    .line 12
    new-instance v1, Lkotlin/Pair;

    .line 13
    .line 14
    invoke-direct {v1, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->A:Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->setLastClicked(Lkotlin/Pair;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setOnCarriageViewClicked(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->A:Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->setOnCarriageViewClicked(Lkotlin/jvm/functions/Function1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setOnSpinnerValueClicked(Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "La/qic;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetView;->A:Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lorg/xplatform/feature/fin_bet/impl/presentation/view/CarriageContainer;->setOnSpinnerValueClicked(Lkotlin/jvm/functions/Function2;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
