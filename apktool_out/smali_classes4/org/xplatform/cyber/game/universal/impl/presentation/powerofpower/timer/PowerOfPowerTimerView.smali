.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic g:I


# instance fields
.field public final a:I

.field public final b:I

.field public final c:La/a8z;

.field public final d:La/a8z;

.field public final e:La/a8z;

.field public final f:La/s1g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const v1, 0x7f07072d

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->a:I

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const v1, 0x7f07066c

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iput p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->b:I

    .line 38
    .line 39
    new-instance p2, La/wqb0;

    .line 40
    .line 41
    invoke-direct {p2, p1, p0, p3}, La/wqb0;-><init>(Landroid/content/Context;Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;B)V

    .line 42
    .line 43
    .line 44
    sget-object v1, La/wez;->b:La/wez;

    .line 45
    .line 46
    invoke-static {v1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    iput-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->c:La/a8z;

    .line 51
    .line 52
    new-instance p2, La/wqb0;

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    invoke-direct {p2, p1, p0, v2}, La/wqb0;-><init>(Landroid/content/Context;Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iput-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->d:La/a8z;

    .line 63
    .line 64
    new-instance p2, La/wqb0;

    .line 65
    .line 66
    invoke-direct {p2, p1, p0, v0}, La/wqb0;-><init>(Landroid/content/Context;Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {v1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->e:La/a8z;

    .line 74
    .line 75
    new-instance p1, La/s1g;

    .line 76
    .line 77
    const p2, 0x7f0606a8

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, p0, p2}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    const v0, 0x7f0700ad

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-virtual {p1, p2}, La/s1g;->c(F)V

    .line 95
    .line 96
    .line 97
    iput-object p1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->f:La/s1g;

    .line 98
    .line 99
    invoke-virtual {p0, p3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method private final getIvTimerIcon()Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->d:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/ImageView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getTvDescription()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getVTimer()Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->e:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(JLa/tkz;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getVTimer()Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v4, 0x0

    .line 6
    const/16 v5, 0x8

    .line 7
    .line 8
    move-wide v1, p1

    .line 9
    move-object v3, p3

    .line 10
    invoke-static/range {v0 .. v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;->b(Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;JLa/tkz;Ljava/lang/Long;I)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getVTimer()Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string p1, ""

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;->setTimerDescription(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->f:La/s1g;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget-object p3, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->f:La/s1g;

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    invoke-virtual {p3, p4, p4, p1, p2}, La/s1g;->b(IIII)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getTvDescription()Landroid/widget/TextView;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getTvDescription()Landroid/widget/TextView;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    sub-int/2addr p2, p3

    .line 32
    div-int/lit8 p2, p2, 0x2

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getTvDescription()Landroid/widget/TextView;

    .line 39
    .line 40
    .line 41
    move-result-object p4

    .line 42
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 43
    .line 44
    .line 45
    move-result p4

    .line 46
    sub-int/2addr p3, p4

    .line 47
    div-int/lit8 p3, p3, 0x2

    .line 48
    .line 49
    invoke-static {p1, p2, p3}, La/bcm0;->s(Landroid/view/View;II)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getIvTimerIcon()Landroid/widget/ImageView;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    iget p3, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->b:I

    .line 61
    .line 62
    sub-int/2addr p2, p3

    .line 63
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getVTimer()Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 68
    .line 69
    .line 70
    move-result p4

    .line 71
    sub-int/2addr p2, p4

    .line 72
    div-int/lit8 p2, p2, 0x2

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 75
    .line 76
    .line 77
    move-result p4

    .line 78
    sub-int/2addr p4, p3

    .line 79
    div-int/lit8 p4, p4, 0x2

    .line 80
    .line 81
    invoke-static {p1, p0, p2, p4}, La/cww;->A(Landroid/view/View;Landroid/widget/FrameLayout;II)V

    .line 82
    .line 83
    .line 84
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getVTimer()Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    add-int/2addr p2, p3

    .line 93
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getVTimer()Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    sub-int/2addr p2, p3

    .line 102
    div-int/lit8 p2, p2, 0x2

    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getVTimer()Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 109
    .line 110
    .line 111
    move-result-object p4

    .line 112
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 113
    .line 114
    .line 115
    move-result p4

    .line 116
    sub-int/2addr p3, p4

    .line 117
    div-int/lit8 p3, p3, 0x2

    .line 118
    .line 119
    invoke-static {p1, p0, p2, p3}, La/cww;->A(Landroid/view/View;Landroid/widget/FrameLayout;II)V

    .line 120
    .line 121
    .line 122
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
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getTvDescription()Landroid/widget/TextView;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->a:I

    .line 14
    .line 15
    mul-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    sub-int v2, p1, v2

    .line 18
    .line 19
    mul-int/lit8 v1, v1, 0x2

    .line 20
    .line 21
    sub-int v1, p2, v1

    .line 22
    .line 23
    invoke-static {v0, v2, v1}, La/bcm0;->t(Landroid/view/View;II)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getIvTimerIcon()Landroid/widget/ImageView;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget v1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->b:I

    .line 31
    .line 32
    invoke-static {v0, v1, v1}, La/bcm0;->t(Landroid/view/View;II)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getVTimer()Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, La/bcm0;->u(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final setDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getTvDescription()Landroid/widget/TextView;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setIcon(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getIvTimerIcon()Landroid/widget/ImageView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p0}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setTimerVisibility(Z)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getVTimer()Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    move v3, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v3, v1

    .line 13
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getIvTimerIcon()Landroid/widget/ImageView;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    move v3, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v3, v1

    .line 25
    :goto_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->getTvDescription()Landroid/widget/TextView;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    move v1, v2

    .line 35
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
