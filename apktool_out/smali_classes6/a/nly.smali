.class public final La/nly;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/v6z;
.implements La/vld;


# instance fields
.field public final A:La/t33;

.field public o:Z

.field public p:La/ghn;

.field public q:F

.field public r:La/l7m0;

.field public s:F

.field public t:Ljava/lang/Integer;

.field public u:I

.field public v:La/scq0;

.field public w:La/thq;

.field public x:Landroid/view/ViewTreeObserver;

.field public y:La/c4m0;

.field public z:La/bby;


# direct methods
.method public constructor <init>(ZLa/ghn;FLa/l7m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/nly;->o:Z

    .line 5
    .line 6
    iput-object p2, p0, La/nly;->p:La/ghn;

    .line 7
    .line 8
    iput p3, p0, La/nly;->q:F

    .line 9
    .line 10
    iput-object p4, p0, La/nly;->r:La/l7m0;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-static {p1}, La/xf0;->c(F)La/t33;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, La/nly;->A:La/t33;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final R0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/nly;->Z0()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/lly;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, La/lly;-><init>(La/nly;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0}, La/x4d0;->f0(La/lm40;Lkotlin/jvm/functions/Function1;)La/scq0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, La/nly;->v:La/scq0;

    .line 15
    .line 16
    invoke-virtual {p0}, La/nly;->c1()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final S0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/nly;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, La/nly;->b1()La/agd;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget v1, p0, La/nly;->u:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 21
    .line 22
    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, La/nly;->v:La/scq0;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, La/scq0;->b()V

    .line 28
    .line 29
    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, La/nly;->v:La/scq0;

    .line 32
    .line 33
    invoke-virtual {p0}, La/nly;->d1()V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La/nly;->y:La/c4m0;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {v1, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 41
    .line 42
    .line 43
    :cond_3
    iput-object v0, p0, La/nly;->y:La/c4m0;

    .line 44
    .line 45
    iput-object v0, p0, La/nly;->t:Ljava/lang/Integer;

    .line 46
    .line 47
    return-void
.end method

.method public final Z0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/nly;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, La/nly;->b1()La/agd;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 22
    .line 23
    iput v1, p0, La/nly;->u:I

    .line 24
    .line 25
    invoke-static {}, La/a8k0;->A()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    const/16 p0, 0x10

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    const/16 p0, 0x30

    .line 35
    .line 36
    :goto_1
    invoke-virtual {v0, p0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final a1(FZ)V
    .locals 4

    .line 1
    iget-object v0, p0, La/nly;->t:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    int-to-float p2, v0

    .line 13
    sub-float/2addr p1, p2

    .line 14
    iget p2, p0, La/nly;->q:F

    .line 15
    .line 16
    sub-float/2addr p1, p2

    .line 17
    cmpg-float p2, p1, v1

    .line 18
    .line 19
    if-gez p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, p1

    .line 23
    :cond_1
    :goto_0
    invoke-static {}, La/a8k0;->A()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/4 p2, 0x3

    .line 28
    const/4 v0, 0x0

    .line 29
    if-nez p1, :cond_3

    .line 30
    .line 31
    iget-boolean p1, p0, La/nly;->o:Z

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget-object p1, p0, La/nly;->y:La/c4m0;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v2, La/mly;

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-direct {v2, p0, v1, v0, v3}, La/mly;-><init>(La/nly;FLa/yje;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0, v0, v2, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, La/nly;->y:La/c4m0;

    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    iget-object p1, p0, La/nly;->y:La/c4m0;

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    invoke-virtual {p1, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 64
    .line 65
    .line 66
    :cond_4
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance v2, La/mly;

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    invoke-direct {v2, p0, v1, v0, v3}, La/mly;-><init>(La/nly;FLa/yje;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1, v0, v0, v2, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, La/nly;->y:La/c4m0;

    .line 81
    .line 82
    :cond_5
    return-void
.end method

.method public final b1()La/agd;
    .locals 1

    .line 1
    sget-object v0, La/dy2;->f:La/zfn;

    .line 2
    .line 3
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    instance-of v0, p0, La/agd;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    check-cast p0, La/agd;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iget p3, p2, La/pu90;->a:I

    .line 9
    .line 10
    iget p4, p2, La/pu90;->b:I

    .line 11
    .line 12
    new-instance v0, La/okw;

    .line 13
    .line 14
    const/16 v1, 0xe

    .line 15
    .line 16
    invoke-direct {v0, p2, p0, v1}, La/okw;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p3, p4, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final c1()V
    .locals 5

    .line 1
    iget-object v0, p0, La/nly;->r:La/l7m0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, La/dy2;->f:La/zfn;

    .line 6
    .line 7
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, La/thq;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v1, v2, v0, p0}, La/thq;-><init>(BLandroid/view/View;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, La/nly;->w:La/thq;

    .line 31
    .line 32
    iput-object v0, p0, La/nly;->x:Landroid/view/ViewTreeObserver;

    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, La/u5u;

    .line 40
    .line 41
    const/16 v3, 0x1c

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-direct {v2, v0, p0, v4, v3}, La/u5u;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x3

    .line 48
    invoke-static {v1, v4, v4, v2, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, La/nly;->z:La/bby;

    .line 53
    .line 54
    return-void
.end method

.method public final d1()V
    .locals 4

    .line 1
    iget-object v0, p0, La/nly;->w:La/thq;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v2, p0, La/nly;->x:Landroid/view/ViewTreeObserver;

    .line 8
    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iput-object v1, p0, La/nly;->w:La/thq;

    .line 21
    .line 22
    iput-object v1, p0, La/nly;->x:Landroid/view/ViewTreeObserver;

    .line 23
    .line 24
    :goto_0
    iget-object v0, p0, La/nly;->z:La/bby;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    iput-object v1, p0, La/nly;->z:La/bby;

    .line 32
    .line 33
    return-void
.end method
