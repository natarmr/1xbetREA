.class public final La/mof0;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/a8z;

.field public b:Lkotlin/jvm/functions/Function0;

.field public c:La/lof0;

.field public final d:Landroid/animation/ObjectAnimator;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v1, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 7
    .line 8
    .line 9
    sget-object p1, La/wez;->b:La/wez;

    .line 10
    .line 11
    new-instance v0, La/sue0;

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-direct {v0, p0, p0, v2}, La/sue0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/mof0;->a:La/a8z;

    .line 22
    .line 23
    new-instance p1, La/b4f0;

    .line 24
    .line 25
    const/16 v0, 0xd

    .line 26
    .line 27
    invoke-direct {p1, v0}, La/b4f0;-><init>(B)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/mof0;->b:Lkotlin/jvm/functions/Function0;

    .line 31
    .line 32
    sget-object p1, La/lof0;->c:La/lof0;

    .line 33
    .line 34
    iput-object p1, p0, La/mof0;->c:La/lof0;

    .line 35
    .line 36
    invoke-direct {p0}, La/mof0;->getBinding()La/jku0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v0, v0, La/jku0;->b:Landroid/widget/ImageView;

    .line 41
    .line 42
    const/4 v2, 0x2

    .line 43
    new-array v2, v2, [F

    .line 44
    .line 45
    fill-array-data v2, :array_0

    .line 46
    .line 47
    .line 48
    sget-object v3, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 49
    .line 50
    invoke-static {v0, v3, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-wide/16 v2, 0x7d0

    .line 55
    .line 56
    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 57
    .line 58
    .line 59
    new-instance v2, Landroid/view/animation/LinearInterpolator;

    .line 60
    .line 61
    invoke-direct {v2}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, La/mof0;->d:Landroid/animation/ObjectAnimator;

    .line 68
    .line 69
    invoke-virtual {p0, p1, v1}, La/mof0;->a(La/lof0;Z)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :array_0
    .array-data 4
        0x0
        -0x3b860000    # -1000.0f
    .end array-data
.end method

.method private final getBinding()La/jku0;
    .locals 0

    .line 1
    iget-object p0, p0, La/mof0;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/jku0;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(La/lof0;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, La/mof0;->c:La/lof0;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/mof0;->b:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iput-object p1, p0, La/mof0;->c:La/lof0;

    .line 12
    .line 13
    invoke-direct {p0}, La/mof0;->getBinding()La/jku0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La/jku0;->c:Landroid/widget/ImageView;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_3

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    if-eq p1, v1, :cond_2

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    if-ne p1, v1, :cond_1

    .line 30
    .line 31
    const p1, 0x7f080b79

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    const p1, 0x7f080b7b

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    const p1, 0x7f080b7c

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 47
    .line 48
    .line 49
    if-eqz p2, :cond_4

    .line 50
    .line 51
    invoke-direct {p0}, La/mof0;->getBinding()La/jku0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object p1, p1, La/jku0;->b:Landroid/widget/ImageView;

    .line 56
    .line 57
    const/4 p2, 0x0

    .line 58
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, La/mof0;->d:Landroid/animation/ObjectAnimator;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance p2, La/r9g;

    .line 67
    .line 68
    const/16 v0, 0x9

    .line 69
    .line 70
    invoke-direct {p2, p0, v0}, La/r9g;-><init>(Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_4
    invoke-direct {p0}, La/mof0;->getBinding()La/jku0;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-object p1, p1, La/jku0;->b:Landroid/widget/ImageView;

    .line 85
    .line 86
    const/16 p2, 0x8

    .line 87
    .line 88
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, La/mof0;->b:Lkotlin/jvm/functions/Function0;

    .line 92
    .line 93
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final setOnDoorAppliedListener(Lkotlin/jvm/functions/Function0;)V
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
    iput-object p1, p0, La/mof0;->b:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method
