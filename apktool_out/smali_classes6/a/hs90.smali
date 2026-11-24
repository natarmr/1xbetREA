.class public final synthetic La/hs90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

.field public final synthetic c:Z

.field public final synthetic d:F

.field public final synthetic e:I

.field public final synthetic f:La/b8x;

.field public final synthetic g:La/okt0;

.field public final synthetic h:Z

.field public final synthetic i:Lkotlin/jvm/functions/Function2;

.field public final synthetic j:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;Landroidx/compose/runtime/snapshots/SnapshotStateList;ZFILa/b8x;La/okt0;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hs90;->a:La/mm40;

    iput-object p2, p0, La/hs90;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-boolean p3, p0, La/hs90;->c:Z

    iput p4, p0, La/hs90;->d:F

    iput p5, p0, La/hs90;->e:I

    iput-object p6, p0, La/hs90;->f:La/b8x;

    iput-object p7, p0, La/hs90;->g:La/okt0;

    iput-boolean p8, p0, La/hs90;->h:Z

    iput-object p9, p0, La/hs90;->i:Lkotlin/jvm/functions/Function2;

    iput-object p10, p0, La/hs90;->j:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p1, 0x200001

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, La/x8x;->L(I)I

    .line 13
    .line 14
    .line 15
    move-result v11

    .line 16
    iget-object v0, p0, La/hs90;->a:La/mm40;

    .line 17
    .line 18
    iget-object v1, p0, La/hs90;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 19
    .line 20
    iget-boolean v2, p0, La/hs90;->c:Z

    .line 21
    .line 22
    iget v3, p0, La/hs90;->d:F

    .line 23
    .line 24
    iget v4, p0, La/hs90;->e:I

    .line 25
    .line 26
    iget-object v5, p0, La/hs90;->f:La/b8x;

    .line 27
    .line 28
    iget-object v6, p0, La/hs90;->g:La/okt0;

    .line 29
    .line 30
    iget-boolean v7, p0, La/hs90;->h:Z

    .line 31
    .line 32
    iget-object v8, p0, La/hs90;->i:Lkotlin/jvm/functions/Function2;

    .line 33
    .line 34
    iget-object v9, p0, La/hs90;->j:Lkotlin/jvm/functions/Function1;

    .line 35
    .line 36
    invoke-static/range {v0 .. v11}, La/ys90;->a(La/mm40;Landroidx/compose/runtime/snapshots/SnapshotStateList;ZFILa/b8x;La/okt0;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0
.end method
