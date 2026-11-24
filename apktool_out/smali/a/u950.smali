.class public final La/u950;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements La/b8m0;
.implements Ljava/util/RandomAccess;
.implements La/mhy;


# annotations
.annotation runtime La/ahi0;
    with = La/v950;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "La/rb50;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/List<",
        "TT;>;",
        "La/b8m0;",
        "Ljava/util/RandomAccess;",
        "La/mhy;"
    }
.end annotation


# static fields
.field public static final Companion:La/t950;


# instance fields
.field public final a:Landroidx/compose/runtime/snapshots/SnapshotStateList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/t950;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/u950;->Companion:La/t950;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 0

    .line 10
    check-cast p2, La/rb50;

    .line 11
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, La/rb50;

    .line 2
    .line 3
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->addAll(ILjava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 0

    .line 8
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->addAll(Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public final b(La/e8m0;La/e8m0;La/e8m0;)La/e8m0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return-object p0
.end method

.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, La/rb50;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, La/rb50;

    .line 8
    .line 9
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->containsAll(Ljava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final g()La/e8m0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;->a:La/x7m0;

    .line 4
    .line 5
    return-object p0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/rb50;

    .line 8
    .line 9
    return-object p0
.end method

.method public final h(La/e8m0;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;->a:La/x7m0;

    .line 4
    .line 5
    iput-object v0, p1, La/e8m0;->b:La/e8m0;

    .line 6
    .line 7
    check-cast p1, La/x7m0;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;->a:La/x7m0;

    .line 10
    .line 11
    return-void
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, La/rb50;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, La/rb50;

    .line 8
    .line 9
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->indexOf(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 0

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->listIterator()Ljava/util/ListIterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, La/rb50;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, -0x1

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, La/rb50;

    .line 8
    .line 9
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->lastIndexOf(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 0

    .line 12
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->listIterator()Ljava/util/ListIterator;

    move-result-object p0

    return-object p0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, La/paw;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, La/paw;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 0

    .line 16
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La/rb50;

    return-object p0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, La/rb50;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, La/rb50;

    .line 8
    .line 9
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->removeAll(Ljava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->retainAll(Ljava/util/Collection;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, La/rb50;

    .line 2
    .line 3
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/rb50;

    .line 10
    .line 11
    return-object p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final subList(II)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->subList(II)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, La/wha0;->V(Ljava/util/Collection;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 6
    invoke-static {p0, p1}, La/wha0;->W(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
