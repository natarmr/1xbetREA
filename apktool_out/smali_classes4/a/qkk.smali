.class public final La/qkk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/ImageView;

.field public final b:Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;

.field public final c:Ljava/util/List;

.field public final d:Lkotlin/jvm/functions/Function0;

.field public final e:F

.field public final f:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/widget/ImageView;ILorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/qkk;->a:Landroid/widget/ImageView;

    .line 11
    .line 12
    iput-object p4, p0, La/qkk;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;

    .line 13
    .line 14
    iput-object p5, p0, La/qkk;->c:Ljava/util/List;

    .line 15
    .line 16
    iput-object p6, p0, La/qkk;->d:Lkotlin/jvm/functions/Function0;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    const p5, 0x7f05000f

    .line 23
    .line 24
    .line 25
    invoke-virtual {p4, p5}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    const/high16 p6, 0x3f800000    # 1.0f

    .line 30
    .line 31
    if-eqz p4, :cond_0

    .line 32
    .line 33
    const p4, 0x3fb33333    # 1.4f

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move p4, p6

    .line 38
    :goto_0
    iput p4, p0, La/qkk;->e:F

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object p4

    .line 44
    invoke-virtual {p4, p5}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 45
    .line 46
    .line 47
    move-result p4

    .line 48
    if-eqz p4, :cond_1

    .line 49
    .line 50
    const/high16 p6, 0x3fc00000    # 1.5f

    .line 51
    .line 52
    :cond_1
    iput p6, p0, La/qkk;->f:F

    .line 53
    .line 54
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    invoke-static {p4, p3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    new-instance p4, La/f73;

    .line 63
    .line 64
    const/4 p5, 0x2

    .line 65
    invoke-direct {p4, p0, p1, p5}, La/f73;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3, p4}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2, p3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method
