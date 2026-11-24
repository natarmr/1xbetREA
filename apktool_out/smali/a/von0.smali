.class public final La/von0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method public synthetic constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/von0;->a:B

    iput-object p1, p0, La/von0;->b:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .line 1
    iget-byte p1, p0, La/von0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/von0;->b:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/won0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, v0}, La/won0;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->B:La/won0;

    .line 15
    .line 16
    const-wide/16 v0, 0x96

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->t:La/gjc;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p1, La/gjc;->a:Landroid/view/animation/Animation$AnimationListener;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->t:La/gjc;

    .line 30
    .line 31
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->B:La/won0;

    .line 32
    .line 33
    invoke-virtual {p1, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    iget-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->c:Z

    .line 38
    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->z:La/ckc;

    .line 42
    .line 43
    const/16 v0, 0xff

    .line 44
    .line 45
    invoke-virtual {p1, v0}, La/ckc;->setAlpha(I)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->z:La/ckc;

    .line 49
    .line 50
    invoke-virtual {p1}, La/ckc;->start()V

    .line 51
    .line 52
    .line 53
    iget-boolean p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->h1:Z

    .line 54
    .line 55
    if-eqz p1, :cond_0

    .line 56
    .line 57
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->b:La/zon0;

    .line 58
    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    invoke-interface {p1}, La/zon0;->b()V

    .line 62
    .line 63
    .line 64
    :cond_0
    iget-object p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->t:La/gjc;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iput p1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->n:I

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->l()V

    .line 74
    .line 75
    .line 76
    :goto_0
    return-void

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/von0;->a:B

    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/von0;->a:B

    return-void
.end method
