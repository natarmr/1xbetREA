.class public final La/ckd;
.super La/c2;
.source "SourceFile"


# instance fields
.field public final c:La/vne;

.field public d:Lkotlin/jvm/functions/Function2;

.field public e:La/q99;

.field public f:La/c4m0;

.field public g:Z


# direct methods
.method public constructor <init>(La/vne;La/ssb0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p2}, La/c2;-><init>(La/df50;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ckd;->c:La/vne;

    .line 5
    .line 6
    new-instance p1, La/p23;

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    const/4 v0, 0x2

    .line 10
    invoke-direct {p1, v0, p2, v0}, La/p23;-><init>(ILa/yje;B)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/ckd;->d:Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/ckd;->x()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, La/c2;->u()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, La/ckd;->g:Z

    .line 12
    .line 13
    sget-object v0, La/i99;->a:La/i99;

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    const/4 v2, -0x2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static {v2, v0, v3, v1}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/ckd;->e:La/q99;

    .line 23
    .line 24
    new-instance v0, La/jtb;

    .line 25
    .line 26
    const/16 v1, 0x9

    .line 27
    .line 28
    invoke-direct {v0, p0, v3, v1}, La/jtb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    iget-object v2, p0, La/ckd;->c:La/vne;

    .line 33
    .line 34
    invoke-static {v2, v3, v3, v0, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, La/ckd;->f:La/c4m0;

    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public final Q(Z)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-super {p0}, La/c2;->u()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, La/ckd;->f:La/c4m0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, La/ckd;->x()V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, La/c2;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, La/v62;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, La/eg60;->f(Z)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/c2;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, La/qb5;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, La/af50;->i(Z)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final x()V
    .locals 3

    .line 1
    iget-object v0, p0, La/ckd;->e:La/q99;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Ljava/util/concurrent/CancellationException;

    .line 6
    .line 7
    const-string v2, "onBack cancelled"

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, v2}, La/q99;->e(Ljava/lang/Throwable;Z)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, La/ckd;->f:La/c4m0;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    iput-object v1, p0, La/ckd;->e:La/q99;

    .line 25
    .line 26
    iput-object v1, p0, La/ckd;->f:La/c4m0;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, La/ckd;->g:Z

    .line 30
    .line 31
    return-void
.end method

.method public final y()V
    .locals 5

    .line 1
    iget-object v0, p0, La/ckd;->e:La/q99;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, La/ckd;->g:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/ckd;->x()V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, La/ckd;->e:La/q99;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iput-boolean v2, p0, La/ckd;->g:Z

    .line 19
    .line 20
    sget-object v0, La/i99;->a:La/i99;

    .line 21
    .line 22
    const/4 v3, 0x4

    .line 23
    const/4 v4, -0x2

    .line 24
    invoke-static {v4, v0, v1, v3}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/ckd;->e:La/q99;

    .line 29
    .line 30
    new-instance v0, La/jtb;

    .line 31
    .line 32
    const/16 v3, 0x9

    .line 33
    .line 34
    invoke-direct {v0, p0, v1, v3}, La/jtb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 35
    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    iget-object v4, p0, La/ckd;->c:La/vne;

    .line 39
    .line 40
    invoke-static {v4, v1, v1, v0, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, La/ckd;->f:La/c4m0;

    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, La/ckd;->e:La/q99;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0, v1}, La/q99;->d(Ljava/lang/Throwable;)Z

    .line 51
    .line 52
    .line 53
    :cond_2
    iput-boolean v2, p0, La/ckd;->g:Z

    .line 54
    .line 55
    return-void
.end method

.method public final z(La/pb5;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ckd;->e:La/q99;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
