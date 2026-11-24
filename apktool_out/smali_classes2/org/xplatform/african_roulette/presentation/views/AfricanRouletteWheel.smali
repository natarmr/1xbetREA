.class public final Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic f:I


# instance fields
.field public final a:La/dc3;

.field public b:F

.field public c:Landroid/animation/AnimatorSet;

.field public d:Landroid/animation/ObjectAnimator;

.field public e:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const p2, 0x7f0d06e1

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, p2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    const p2, 0x7f0a010e

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroid/widget/ImageView;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    const p2, 0x7f0a0ea9

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Landroid/widget/ImageView;

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    const p2, 0x7f0a1447

    .line 48
    .line 49
    .line 50
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Landroid/widget/ImageView;

    .line 55
    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    new-instance p2, La/dc3;

    .line 59
    .line 60
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 61
    .line 62
    invoke-direct {p2, p1, v0, v1, v2}, La/dc3;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 63
    .line 64
    .line 65
    iput-object p2, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->a:La/dc3;

    .line 66
    .line 67
    const p1, 0x4019999a    # 2.4f

    .line 68
    .line 69
    .line 70
    iput p1, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->b:F

    .line 71
    .line 72
    new-instance p1, La/q8;

    .line 73
    .line 74
    const/16 p2, 0x18

    .line 75
    .line 76
    invoke-direct {p1, p2}, La/q8;-><init>(B)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->e:Lkotlin/jvm/functions/Function0;

    .line 80
    .line 81
    return-void

    .line 82
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    const-string p1, "Missing required view with ID: "

    .line 91
    .line 92
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const/4 p0, 0x0

    .line 100
    throw p0
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->a:La/dc3;

    .line 5
    .line 6
    iget-object p2, p1, La/dc3;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, Landroid/widget/ImageView;

    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    instance-of v0, p2, La/a3e;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    check-cast p2, La/a3e;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p2, 0x0

    .line 22
    :goto_0
    if-eqz p2, :cond_1

    .line 23
    .line 24
    iget-object p1, p1, La/dc3;->c:Landroid/view/View;

    .line 25
    .line 26
    check-cast p1, Landroid/widget/ImageView;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    div-int/lit8 p1, p1, 0xf

    .line 33
    .line 34
    iput p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 35
    .line 36
    iput p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    int-to-float p1, p1

    .line 43
    iget v0, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->b:F

    .line 44
    .line 45
    div-float/2addr p1, v0

    .line 46
    float-to-int p1, p1

    .line 47
    iput p1, p2, La/a3e;->q:I

    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public final setAnimationEndListener$african_roulette(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->e:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method
