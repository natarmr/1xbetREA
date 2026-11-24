.class public final La/fla0;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/i1w0;


# direct methods
.method public constructor <init>(La/i1w0;La/f7u;La/ocl;La/mne;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/l3a0;

    .line 5
    .line 6
    const/16 v0, 0x19

    .line 7
    .line 8
    invoke-direct {v2, p2, v0}, La/l3a0;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/yar;

    .line 12
    .line 13
    const/16 p2, 0x9

    .line 14
    .line 15
    invoke-direct {v3, p3, p2}, La/yar;-><init>(La/ocl;B)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p4, La/mne;->c:La/vs10;

    .line 19
    .line 20
    iget-object p3, p4, La/mne;->a:La/rwj;

    .line 21
    .line 22
    invoke-static {p2, p3}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v1, 0x0

    .line 28
    move-object v0, p0

    .line 29
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/fla0;->o:La/i1w0;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/yka0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/fla0;->o:La/i1w0;

    .line 10
    .line 11
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, La/c8d;

    .line 16
    .line 17
    sget-object v1, La/y7d;->a:La/v7d;

    .line 18
    .line 19
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    move-object v0, p1

    .line 30
    check-cast v0, La/paw;

    .line 31
    .line 32
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/oe50;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-void
.end method
