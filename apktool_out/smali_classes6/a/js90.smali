.class public final synthetic La/js90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:La/j73;

.field public final synthetic g:La/vne;

.field public final synthetic h:La/pz40;

.field public final synthetic i:La/xcz;

.field public final synthetic j:F

.field public final synthetic k:La/a8x;

.field public final synthetic l:La/l7m0;

.field public final synthetic m:La/pz40;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;IIIILa/j73;La/vne;La/pz40;La/xcz;FLa/a8x;La/l7m0;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/js90;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput p2, p0, La/js90;->b:I

    iput p3, p0, La/js90;->c:I

    iput p4, p0, La/js90;->d:I

    iput p5, p0, La/js90;->e:I

    iput-object p6, p0, La/js90;->f:La/j73;

    iput-object p7, p0, La/js90;->g:La/vne;

    iput-object p8, p0, La/js90;->h:La/pz40;

    iput-object p9, p0, La/js90;->i:La/xcz;

    iput p10, p0, La/js90;->j:F

    iput-object p11, p0, La/js90;->k:La/a8x;

    iput-object p12, p0, La/js90;->l:La/l7m0;

    iput-object p13, p0, La/js90;->m:La/pz40;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, La/js90;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    new-instance v2, La/tp90;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-direct {v2, v0, v3}, La/tp90;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;B)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iget v4, p0, La/js90;->b:I

    .line 15
    .line 16
    invoke-static {v1, v4, v3, v0, v2}, La/ys90;->g(IIZILkotlin/jvm/functions/Function1;)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    :cond_0
    iget v0, p0, La/js90;->c:I

    .line 27
    .line 28
    iget v1, p0, La/js90;->d:I

    .line 29
    .line 30
    iget v2, p0, La/js90;->e:I

    .line 31
    .line 32
    invoke-static {v0, v4, v1, v2}, La/ys90;->h(IIII)I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    iget-object v5, p0, La/js90;->g:La/vne;

    .line 37
    .line 38
    iget-object v6, p0, La/js90;->h:La/pz40;

    .line 39
    .line 40
    iget-object v7, p0, La/js90;->i:La/xcz;

    .line 41
    .line 42
    iget v8, p0, La/js90;->j:F

    .line 43
    .line 44
    iget-object v9, p0, La/js90;->k:La/a8x;

    .line 45
    .line 46
    iget-object v10, p0, La/js90;->l:La/l7m0;

    .line 47
    .line 48
    iget-object v11, p0, La/js90;->m:La/pz40;

    .line 49
    .line 50
    iget-object v13, p0, La/js90;->f:La/j73;

    .line 51
    .line 52
    invoke-static/range {v5 .. v13}, La/ys90;->d(La/vne;La/pz40;La/xcz;FLa/a8x;La/l7m0;La/pz40;ILa/j73;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0
.end method
