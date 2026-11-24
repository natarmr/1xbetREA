.class public final La/llu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmf0;
.implements La/qvj;


# instance fields
.field public final a:La/gbe0;

.field public final b:La/o1x;

.field public final c:La/zjt;

.field public final d:La/glz;

.field public final e:La/bby;


# direct methods
.method public constructor <init>(La/gbe0;La/o1x;La/zjt;La/glz;La/bby;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/llu0;->a:La/gbe0;

    .line 5
    .line 6
    iput-object p2, p0, La/llu0;->b:La/o1x;

    .line 7
    .line 8
    iput-object p3, p0, La/llu0;->c:La/zjt;

    .line 9
    .line 10
    iput-object p4, p0, La/llu0;->d:La/glz;

    .line 11
    .line 12
    iput-object p5, p0, La/llu0;->e:La/bby;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, La/llu0;->c:La/zjt;

    .line 2
    .line 3
    invoke-virtual {v0}, La/zjt;->getView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {v0}, La/zjt;->getView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, La/o5n0;->r(Landroid/view/View;)La/mlu0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, v0, La/mlu0;->d:La/llu0;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v2, v1, La/llu0;->d:La/glz;

    .line 27
    .line 28
    iget-object v3, v1, La/llu0;->e:La/bby;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    invoke-interface {v3, v4}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 32
    .line 33
    .line 34
    iget-object v3, v1, La/llu0;->c:La/zjt;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2, v3}, La/glz;->f(La/blz;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    if-eqz v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {v2, v1}, La/glz;->f(La/blz;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iput-object p0, v0, La/mlu0;->d:La/llu0;

    .line 49
    .line 50
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 51
    .line 52
    const-string v0, "\'ViewTarget.view\' must be attached to a window."

    .line 53
    .line 54
    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0
.end method

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, La/llu0;->d:La/glz;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p0}, La/glz;->a(La/blz;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v1, p0, La/llu0;->c:La/zjt;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v1}, La/glz;->f(La/blz;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/glz;->a(La/blz;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {v1}, La/zjt;->getView()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, La/o5n0;->r(Landroid/view/View;)La/mlu0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, v0, La/mlu0;->d:La/llu0;

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    iget-object v2, v1, La/llu0;->d:La/glz;

    .line 33
    .line 34
    iget-object v3, v1, La/llu0;->e:La/bby;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-interface {v3, v4}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 38
    .line 39
    .line 40
    iget-object v3, v1, La/llu0;->c:La/zjt;

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {v2, v3}, La/glz;->f(La/blz;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    if-eqz v2, :cond_3

    .line 50
    .line 51
    invoke-virtual {v2, v1}, La/glz;->f(La/blz;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    iput-object p0, v0, La/mlu0;->d:La/llu0;

    .line 55
    .line 56
    return-void
.end method

.method public final d(La/fbe0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/llu0;->d:La/glz;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p0, p1}, La/x1x;->v(La/glz;La/zje;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.method public final onDestroy(La/clz;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/llu0;->c:La/zjt;

    .line 2
    .line 3
    invoke-virtual {p0}, La/zjt;->getView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, La/o5n0;->r(Landroid/view/View;)La/mlu0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, La/mlu0;->a()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
