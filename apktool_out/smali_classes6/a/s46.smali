.class public final La/s46;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/i1w0;


# direct methods
.method public constructor <init>(La/vzg0;La/mne;La/i1w0;)V
    .locals 6

    .line 1
    new-instance v2, La/o85;

    .line 2
    .line 3
    const/16 p1, 0x15

    .line 4
    .line 5
    invoke-direct {v2, p1}, La/o85;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v3, La/h26;

    .line 9
    .line 10
    const/4 p1, 0x5

    .line 11
    invoke-direct {v3, p1}, La/h26;-><init>(B)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p2, La/mne;->c:La/vs10;

    .line 15
    .line 16
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 17
    .line 18
    invoke-static {p1, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v1, 0x0

    .line 24
    move-object v0, p0

    .line 25
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 26
    .line 27
    .line 28
    iput-object p3, v0, La/s46;->o:La/i1w0;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/i46;

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
    sget-object v0, La/i46;->a:La/i46;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, La/i46;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, La/s46;->o:La/i1w0;

    .line 18
    .line 19
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, La/c8d;

    .line 24
    .line 25
    sget-object v1, La/y7d;->a:La/v7d;

    .line 26
    .line 27
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 28
    .line 29
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    move-object v0, p1

    .line 38
    check-cast v0, La/paw;

    .line 39
    .line 40
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, La/oe50;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void

    .line 57
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 58
    .line 59
    .line 60
    return-void
.end method
