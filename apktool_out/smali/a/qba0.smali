.class public final La/qba0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:Landroid/view/SurfaceView;

.field public final synthetic j:La/pz40;


# direct methods
.method public constructor <init>(Landroid/view/SurfaceView;La/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qba0;->i:Landroid/view/SurfaceView;

    .line 2
    .line 3
    iput-object p2, p0, La/qba0;->j:La/pz40;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance p1, La/qba0;

    .line 2
    .line 3
    iget-object v0, p0, La/qba0;->i:Landroid/view/SurfaceView;

    .line 4
    .line 5
    iget-object p0, p0, La/qba0;->j:La/pz40;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/qba0;-><init>(Landroid/view/SurfaceView;La/pz40;La/yje;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/qba0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/qba0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/qba0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La/qba0;->i:Landroid/view/SurfaceView;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getRootSurfaceControl()Landroid/view/AttachedSurfaceControl;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v1, Landroid/window/SurfaceSyncGroup;

    .line 15
    .line 16
    const-string v2, "exo-sync-b-334901521"

    .line 17
    .line 18
    invoke-direct {v1, v2}, Landroid/window/SurfaceSyncGroup;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/d12;

    .line 22
    .line 23
    const/4 v3, 0x3

    .line 24
    invoke-direct {v2, v3}, La/d12;-><init>(B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0, v2}, Landroid/window/SurfaceSyncGroup;->add(Landroid/view/AttachedSurfaceControl;Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    iget-object p0, p0, La/qba0;->j:La/pz40;

    .line 34
    .line 35
    invoke-interface {p0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 39
    .line 40
    .line 41
    invoke-static {}, La/xl50;->j()Landroid/view/SurfaceControl$Transaction;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-interface {v0, p0}, Landroid/view/AttachedSurfaceControl;->applyTransactionOnDraw(Landroid/view/SurfaceControl$Transaction;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const-string p0, "Failed to add rootSurfaceControl to SurfaceSyncGroup"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0
.end method
