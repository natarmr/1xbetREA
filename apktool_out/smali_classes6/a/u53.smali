.class public final synthetic La/u53;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/a4x;

.field public final synthetic b:La/vne;

.field public final synthetic c:F

.field public final synthetic d:La/i050;

.field public final synthetic e:F

.field public final synthetic f:Landroidx/compose/runtime/snapshots/SnapshotStateList;

.field public final synthetic g:La/rcq0;

.field public final synthetic h:La/pz40;

.field public final synthetic i:La/agk0;


# direct methods
.method public synthetic constructor <init>(La/a4x;La/vne;FLa/i050;FLandroidx/compose/runtime/snapshots/SnapshotStateList;La/rcq0;La/pz40;La/agk0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/u53;->a:La/a4x;

    iput-object p2, p0, La/u53;->b:La/vne;

    iput p3, p0, La/u53;->c:F

    iput-object p4, p0, La/u53;->d:La/i050;

    iput p5, p0, La/u53;->e:F

    iput-object p6, p0, La/u53;->f:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p7, p0, La/u53;->g:La/rcq0;

    iput-object p8, p0, La/u53;->h:La/pz40;

    iput-object p9, p0, La/u53;->i:La/agk0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Ljava/lang/Float;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    iget-object v7, p0, La/u53;->a:La/a4x;

    .line 8
    .line 9
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x1

    .line 14
    if-gt p1, v0, :cond_0

    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance v0, La/g63;

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    iget v1, p0, La/u53;->c:F

    .line 23
    .line 24
    iget-object v2, p0, La/u53;->d:La/i050;

    .line 25
    .line 26
    iget v4, p0, La/u53;->e:F

    .line 27
    .line 28
    iget-object v5, p0, La/u53;->f:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 29
    .line 30
    iget-object v6, p0, La/u53;->g:La/rcq0;

    .line 31
    .line 32
    iget-object v8, p0, La/u53;->h:La/pz40;

    .line 33
    .line 34
    iget-object v9, p0, La/u53;->i:La/agk0;

    .line 35
    .line 36
    invoke-direct/range {v0 .. v10}, La/g63;-><init>(FLa/i050;FFLandroidx/compose/runtime/snapshots/SnapshotStateList;La/rcq0;La/a4x;La/pz40;La/agk0;La/yje;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x3

    .line 40
    iget-object p0, p0, La/u53;->b:La/vne;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-static {p0, v1, v1, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0
.end method
