.class public final Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# static fields
.field public static final synthetic g:I


# instance fields
.field public final d:[F

.field public final e:Landroid/graphics/Path;

.field public final f:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

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
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    new-array v1, v1, [F

    .line 16
    .line 17
    iput-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;->d:[F

    .line 18
    .line 19
    new-instance v2, Landroid/graphics/Path;

    .line 20
    .line 21
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;->e:Landroid/graphics/Path;

    .line 25
    .line 26
    new-instance v2, La/a7g0;

    .line 27
    .line 28
    const/4 v3, 0x4

    .line 29
    invoke-direct {v2, p0, v3}, La/a7g0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iput-object v2, p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;->f:La/n0o0;

    .line 37
    .line 38
    sget-object p0, La/aqd0;->s:[I

    .line 39
    .line 40
    invoke-virtual {p1, p2, p0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x3

    .line 48
    const/4 p2, 0x0

    .line 49
    :try_start_0
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-virtual {p0, v3, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-virtual {p0, p3, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    const/4 v6, 0x1

    .line 62
    invoke-virtual {p0, v6, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    invoke-virtual {p0, v0, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    cmpg-float p2, v8, p2

    .line 71
    .line 72
    const/4 v9, 0x7

    .line 73
    const/4 v10, 0x6

    .line 74
    const/4 v11, 0x5

    .line 75
    if-nez p2, :cond_1

    .line 76
    .line 77
    aput v2, v1, p3

    .line 78
    .line 79
    aput v2, v1, v6

    .line 80
    .line 81
    aput v4, v1, v0

    .line 82
    .line 83
    aput v4, v1, p1

    .line 84
    .line 85
    aput v7, v1, v3

    .line 86
    .line 87
    aput v7, v1, v11

    .line 88
    .line 89
    aput v5, v1, v10

    .line 90
    .line 91
    aput v5, v1, v9

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catchall_0
    move-exception p1

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    aput v8, v1, p3

    .line 97
    .line 98
    aput v8, v1, v6

    .line 99
    .line 100
    aput v8, v1, v0

    .line 101
    .line 102
    aput v8, v1, p1

    .line 103
    .line 104
    aput v8, v1, v3

    .line 105
    .line 106
    aput v8, v1, v11

    .line 107
    .line 108
    aput v8, v1, v10

    .line 109
    .line 110
    aput v8, v1, v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    :goto_0
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :goto_1
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 117
    .line 118
    .line 119
    throw p1
.end method

.method private final getRect()Landroid/graphics/RectF;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;->f:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/RectF;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;->getRect()Landroid/graphics/RectF;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    int-to-float v1, v1

    .line 13
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;->getRect()Landroid/graphics/RectF;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    int-to-float v1, v1

    .line 24
    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 25
    .line 26
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;->getRect()Landroid/graphics/RectF;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;->d:[F

    .line 31
    .line 32
    sget-object v2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 33
    .line 34
    iget-object v3, p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;->e:Landroid/graphics/Path;

    .line 35
    .line 36
    invoke-virtual {v3, v0, v1, v2}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 40
    .line 41
    .line 42
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
