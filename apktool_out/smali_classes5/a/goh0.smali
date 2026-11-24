.class public final La/goh0;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/i1w0;

.field public final p:La/pru;


# direct methods
.method public constructor <init>(La/i1w0;La/nqh0;La/ctf0;La/pru;La/mne;)V
    .locals 10

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/x6h0;

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    invoke-direct {v2, p3, p2, v0}, La/x6h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    new-instance v3, La/eoh0;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-direct {v3, p2}, La/eoh0;-><init>(B)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p5, La/mne;->c:La/vs10;

    .line 17
    .line 18
    iget-object v7, p5, La/mne;->a:La/rwj;

    .line 19
    .line 20
    invoke-static {p2, v7}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v1, 0x0

    .line 26
    move-object v0, p0

    .line 27
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, v0, La/goh0;->o:La/i1w0;

    .line 31
    .line 32
    iput-object p4, v0, La/goh0;->p:La/pru;

    .line 33
    .line 34
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    sget-object v5, La/foh0;->a:La/foh0;

    .line 39
    .line 40
    new-instance v8, La/tmg0;

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    const/4 p1, 0x3

    .line 44
    invoke-direct {v8, v0, p0, p1}, La/tmg0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 45
    .line 46
    .line 47
    const/16 v9, 0xa

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 51
    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p1, La/sph0;

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
    instance-of v0, p1, La/rph0;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 14
    .line 15
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, La/yph0;

    .line 26
    .line 27
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-object v3, p1

    .line 33
    check-cast v3, La/rph0;

    .line 34
    .line 35
    iget v3, v3, La/rph0;->a:I

    .line 36
    .line 37
    const/4 v4, 0x3

    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-static {v2, v5, v3, v4}, La/yph0;->a(La/yph0;La/zvh0;II)La/yph0;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    instance-of p1, p1, La/qph0;

    .line 51
    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    iget-object p0, p0, La/goh0;->o:La/i1w0;

    .line 55
    .line 56
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v0, La/c8d;

    .line 61
    .line 62
    sget-object v1, La/y7d;->a:La/v7d;

    .line 63
    .line 64
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 65
    .line 66
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_0
    move-object v0, p1

    .line 75
    check-cast v0, La/paw;

    .line 76
    .line 77
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, La/oe50;

    .line 88
    .line 89
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    return-void

    .line 94
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 95
    .line 96
    .line 97
    return-void
.end method
