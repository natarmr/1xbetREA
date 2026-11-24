.class public final La/zly;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/v6z;
.implements La/vld;


# instance fields
.field public A:Z

.field public final B:La/t33;

.field public o:La/ghn;

.field public p:Lkotlin/jvm/functions/Function1;

.field public q:F

.field public r:F

.field public s:Ljava/lang/Integer;

.field public t:La/scq0;

.field public u:La/z0i;

.field public v:Landroid/view/ViewTreeObserver;

.field public w:La/c4m0;

.field public x:La/bby;

.field public y:La/wly;

.field public z:Landroid/view/View;


# direct methods
.method public constructor <init>(La/ghn;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zly;->o:La/ghn;

    .line 5
    .line 6
    iput-object p2, p0, La/zly;->p:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-static {p1}, La/xf0;->c(F)La/t33;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, La/zly;->B:La/t33;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final R0()V
    .locals 5

    .line 1
    new-instance v0, La/vly;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, La/vly;-><init>(La/zly;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0}, La/x4d0;->f0(La/lm40;Lkotlin/jvm/functions/Function1;)La/scq0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, La/zly;->t:La/scq0;

    .line 12
    .line 13
    sget-object v0, La/dy2;->f:La/zfn;

    .line 14
    .line 15
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v3, La/z0i;

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    invoke-direct {v3, p0, v4}, La/z0i;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    new-instance v4, La/wly;

    .line 32
    .line 33
    invoke-direct {v4, p0, v1}, La/wly;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v4}, Landroid/view/ViewTreeObserver;->addOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 44
    .line 45
    .line 46
    iput-object v3, p0, La/zly;->u:La/z0i;

    .line 47
    .line 48
    iput-object v4, p0, La/zly;->y:La/wly;

    .line 49
    .line 50
    iput-object v1, p0, La/zly;->v:Landroid/view/ViewTreeObserver;

    .line 51
    .line 52
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Landroid/view/View;

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, La/yly;

    .line 63
    .line 64
    invoke-direct {v1, p0, v0}, La/yly;-><init>(La/zly;Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 68
    .line 69
    invoke-static {v0, v1}, La/div0;->a(Landroid/view/View;La/oyc;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, La/zly;->z:Landroid/view/View;

    .line 73
    .line 74
    return-void
.end method

.method public final S0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/zly;->t:La/scq0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/scq0;->b()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, La/zly;->t:La/scq0;

    .line 10
    .line 11
    iget-object v1, p0, La/zly;->v:Landroid/view/ViewTreeObserver;

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    iget-object v2, p0, La/zly;->u:La/z0i;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v2, p0, La/zly;->y:La/wly;

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    iput-object v0, p0, La/zly;->u:La/z0i;

    .line 36
    .line 37
    iput-object v0, p0, La/zly;->y:La/wly;

    .line 38
    .line 39
    iput-object v0, p0, La/zly;->v:Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    iget-object v1, p0, La/zly;->z:Landroid/view/View;

    .line 42
    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 47
    .line 48
    invoke-static {v1, v0}, La/div0;->a(Landroid/view/View;La/oyc;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, La/zly;->z:Landroid/view/View;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    iput-boolean v1, p0, La/zly;->A:Z

    .line 55
    .line 56
    :goto_0
    iget-object v1, p0, La/zly;->x:La/bby;

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    invoke-interface {v1, v0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    iput-object v0, p0, La/zly;->x:La/bby;

    .line 64
    .line 65
    iget-object v1, p0, La/zly;->w:La/c4m0;

    .line 66
    .line 67
    if-eqz v1, :cond_5

    .line 68
    .line 69
    invoke-virtual {v1, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 70
    .line 71
    .line 72
    :cond_5
    iput-object v0, p0, La/zly;->w:La/c4m0;

    .line 73
    .line 74
    iput-object v0, p0, La/zly;->s:Ljava/lang/Integer;

    .line 75
    .line 76
    return-void
.end method

.method public final Z0(FZ)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget-object p2, p0, La/zly;->s:Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz p2, :cond_6

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-object v1, p0, La/zly;->p:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    sget-object v2, La/bmd;->h:La/zfn;

    .line 16
    .line 17
    invoke-static {p0, v2}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    int-to-float p2, p2

    .line 32
    sub-float/2addr p1, p2

    .line 33
    add-float/2addr p1, v1

    .line 34
    cmpg-float p2, p1, v0

    .line 35
    .line 36
    if-gez p2, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v0, p1

    .line 40
    :goto_0
    iget p1, p0, La/zly;->r:F

    .line 41
    .line 42
    cmpg-float p1, v0, p1

    .line 43
    .line 44
    if-nez p1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iput v0, p0, La/zly;->r:F

    .line 48
    .line 49
    invoke-static {}, La/a8k0;->A()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    iget-object p2, p0, La/zly;->w:La/c4m0;

    .line 54
    .line 55
    const/4 v1, 0x3

    .line 56
    const/4 v2, 0x0

    .line 57
    if-nez p1, :cond_4

    .line 58
    .line 59
    if-eqz p2, :cond_3

    .line 60
    .line 61
    invoke-virtual {p2, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance p2, La/xly;

    .line 69
    .line 70
    const/4 v3, 0x1

    .line 71
    invoke-direct {p2, p0, v0, v2, v3}, La/xly;-><init>(La/zly;FLa/yje;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v2, v2, p2, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, La/zly;->w:La/c4m0;

    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    if-eqz p2, :cond_5

    .line 82
    .line 83
    invoke-virtual {p2, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance p2, La/xly;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-direct {p2, p0, v0, v2, v3}, La/xly;-><init>(La/zly;FLa/yje;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {p1, v2, v2, p2, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iput-object p1, p0, La/zly;->w:La/c4m0;

    .line 101
    .line 102
    :cond_6
    :goto_1
    return-void
.end method

.method public final a1()V
    .locals 5

    .line 1
    iget-boolean v0, p0, La/zly;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    sget-object v0, La/dy2;->f:La/zfn;

    .line 7
    .line 8
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/view/View;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 19
    .line 20
    invoke-static {v0}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    const/16 v3, 0x8

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object v4, v1, La/xiv0;->a:La/uiv0;

    .line 30
    .line 31
    invoke-virtual {v4, v3}, La/uiv0;->u(I)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v4, v2

    .line 37
    :goto_0
    if-eqz v4, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/view/View;->hasWindowFocus()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    :cond_2
    if-eqz v2, :cond_3

    .line 47
    .line 48
    iget-object v0, v1, La/xiv0;->a:La/uiv0;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, La/uiv0;->i(I)La/pfx;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v0, v0, La/pfx;->d:I

    .line 55
    .line 56
    int-to-float v0, v0

    .line 57
    goto :goto_1

    .line 58
    :cond_3
    const/4 v0, 0x0

    .line 59
    :goto_1
    invoke-virtual {p0, v0, v2}, La/zly;->Z0(FZ)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p3, p4}, La/p4e;->h(J)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const v1, 0x7fffffff

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    :goto_0
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget p0, p0, La/zly;->q:F

    .line 20
    .line 21
    invoke-static {p0}, La/si30;->b(F)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p3, p4}, La/p4e;->h(J)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {p0, v2, v1}, La/l1e0;->d(III)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {p3, p4}, La/p4e;->h(J)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    sub-int/2addr v1, p0

    .line 38
    if-gez v1, :cond_1

    .line 39
    .line 40
    move v8, v2

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v8, v1

    .line 43
    :goto_1
    const/4 v7, 0x0

    .line 44
    const/4 v9, 0x3

    .line 45
    const/4 v5, 0x0

    .line 46
    const/4 v6, 0x0

    .line 47
    move-wide v3, p3

    .line 48
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 49
    .line 50
    .line 51
    move-result-wide p3

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-wide v3, p3

    .line 54
    :goto_2
    invoke-interface {p2, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    goto :goto_3

    .line 65
    :cond_3
    iget p2, p0, La/pu90;->b:I

    .line 66
    .line 67
    :goto_3
    iget p3, p0, La/pu90;->a:I

    .line 68
    .line 69
    new-instance p4, La/cam;

    .line 70
    .line 71
    const/16 v0, 0xa

    .line 72
    .line 73
    invoke-direct {p4, p0, v0}, La/cam;-><init>(La/pu90;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p3, p2, p4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method
