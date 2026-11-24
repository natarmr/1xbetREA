.class public final Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/a8z;

.field public final b:Landroid/view/animation/Animation;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wez;->b:La/wez;

    .line 14
    .line 15
    new-instance v1, La/ha30;

    .line 16
    .line 17
    const/16 v2, 0x19

    .line 18
    .line 19
    invoke-direct {v1, p0, p0, v2}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;->a:La/a8z;

    .line 27
    .line 28
    const v0, 0x7f010057

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;->b:Landroid/view/animation/Animation;

    .line 36
    .line 37
    sget-object v0, La/aqd0;->q:[I

    .line 38
    .line 39
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p3, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;->getBinding()La/h3c0;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    iget-object p3, p3, La/h3c0;->c:Landroid/widget/ImageView;

    .line 64
    .line 65
    invoke-virtual {p3, p2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;->getBinding()La/h3c0;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    iget-object p3, p3, La/h3c0;->b:Landroid/widget/ImageView;

    .line 73
    .line 74
    invoke-virtual {p3, p2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;->getBinding()La/h3c0;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    iget-object p2, p2, La/h3c0;->c:Landroid/widget/ImageView;

    .line 82
    .line 83
    const/high16 p3, 0x3f800000    # 1.0f

    .line 84
    .line 85
    invoke-virtual {p2, p3}, Landroid/view/View;->setAlpha(F)V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;->getBinding()La/h3c0;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    iget-object p0, p0, La/h3c0;->b:Landroid/widget/ImageView;

    .line 93
    .line 94
    invoke-virtual {p0, p3}, Landroid/view/View;->setAlpha(F)V

    .line 95
    .line 96
    .line 97
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method private final getBinding()La/h3c0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/h3c0;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;->getBinding()La/h3c0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/h3c0;->b:Landroid/widget/ImageView;

    .line 9
    .line 10
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;->b:Landroid/view/animation/Animation;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;->getBinding()La/h3c0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/h3c0;->b:Landroid/widget/ImageView;

    .line 9
    .line 10
    iget-object p0, p0, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSandClockNew;->b:Landroid/view/animation/Animation;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
