.class public final La/iha;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public final c:Landroid/view/KeyEvent$Callback;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/kxq;Lkotlin/jvm/functions/Function2;)V
    .locals 3

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, La/iha;->c:Landroid/view/KeyEvent$Callback;

    .line 79
    iput-object p2, p0, La/iha;->d:Ljava/lang/Object;

    .line 80
    new-instance p2, La/y2x;

    const/16 v0, 0x12

    invoke-direct {p2, p0, v0}, La/y2x;-><init>(Ljava/lang/Object;B)V

    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p2

    iput-object p2, p0, La/iha;->e:Ljava/lang/Object;

    .line 81
    new-instance p2, La/qly;

    invoke-direct {p2, p0}, La/qly;-><init>(La/iha;)V

    iput-object p2, p0, La/iha;->f:Ljava/lang/Object;

    .line 82
    invoke-static {p1}, La/b8k0;->N(Landroid/app/Activity;)I

    move-result v0

    .line 83
    invoke-virtual {p0}, La/iha;->b()I

    move-result v1

    invoke-static {p1, v1, v0}, La/b8k0;->S(Landroid/app/Activity;II)Z

    move-result v1

    .line 84
    invoke-virtual {p0}, La/iha;->b()I

    move-result v2

    sub-int/2addr v2, v0

    invoke-virtual {p0, v2, v1}, La/iha;->a(IZ)V

    const p0, 0x1020002

    .line 85
    invoke-virtual {p1, p0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/widget/ImageView;I)V
    .locals 7

    .line 87
    new-instance v3, Landroid/widget/ImageView;

    invoke-direct {v3, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    .line 88
    invoke-direct/range {v0 .. v6}, La/iha;-><init>(Landroid/content/Context;Landroid/widget/ImageView;Landroid/widget/ImageView;III)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/widget/ImageView;Landroid/widget/ImageView;III)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/iha;->c:Landroid/view/KeyEvent$Callback;

    .line 11
    .line 12
    iput-object p3, p0, La/iha;->d:Ljava/lang/Object;

    .line 13
    .line 14
    iput p4, p0, La/iha;->a:I

    .line 15
    .line 16
    iput p5, p0, La/iha;->b:I

    .line 17
    .line 18
    const p3, 0x7f010021

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iput-object p3, p0, La/iha;->e:Ljava/lang/Object;

    .line 29
    .line 30
    const p4, 0x7f010020

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/iha;->f:Ljava/lang/Object;

    .line 41
    .line 42
    const-wide/16 p4, 0x3e8

    .line 43
    .line 44
    int-to-long v0, p6

    .line 45
    mul-long/2addr v0, p4

    .line 46
    invoke-virtual {p3, v0, v1}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 47
    .line 48
    .line 49
    new-instance p4, La/hha;

    .line 50
    .line 51
    const/4 p5, 0x0

    .line 52
    invoke-direct {p4, p0, p5}, La/hha;-><init>(La/iha;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p3, p4}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 56
    .line 57
    .line 58
    new-instance p4, La/hha;

    .line 59
    .line 60
    const/4 p5, 0x1

    .line 61
    invoke-direct {p4, p0, p5}, La/hha;-><init>(La/iha;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p4}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Landroid/view/View;->clearAnimation()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, p3}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2, p3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public a(IZ)V
    .locals 0

    .line 1
    iget-object p0, p0, La/iha;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p0, p2, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public b()I
    .locals 0

    .line 1
    iget-object p0, p0, La/iha;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/n0o0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method
