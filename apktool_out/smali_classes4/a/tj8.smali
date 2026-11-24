.class public final La/tj8;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic u:I


# instance fields
.field public final o:La/jtj;

.field public final p:La/pru;

.field public final q:La/mne;

.field public final r:La/duj;

.field public final s:La/i1w0;

.field public t:La/c4m0;


# direct methods
.method public constructor <init>(La/jtj;La/pru;La/mne;La/duj;La/i1w0;La/ocl;La/ctf0;)V
    .locals 6

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/hc0;

    .line 8
    .line 9
    const/16 v0, 0xd

    .line 10
    .line 11
    invoke-direct {v2, p2, v0}, La/hc0;-><init>(La/pru;B)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/cz;

    .line 15
    .line 16
    const/4 v0, 0x6

    .line 17
    invoke-direct {v3, p6, p7, v0}, La/cz;-><init>(La/ocl;La/ctf0;B)V

    .line 18
    .line 19
    .line 20
    iget-object p6, p3, La/mne;->c:La/vs10;

    .line 21
    .line 22
    iget-object p7, p3, La/mne;->a:La/rwj;

    .line 23
    .line 24
    invoke-static {p6, p7}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    move-object v0, p0

    .line 31
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, v0, La/tj8;->o:La/jtj;

    .line 35
    .line 36
    iput-object p2, v0, La/tj8;->p:La/pru;

    .line 37
    .line 38
    iput-object p3, v0, La/tj8;->q:La/mne;

    .line 39
    .line 40
    iput-object p4, v0, La/tj8;->r:La/duj;

    .line 41
    .line 42
    iput-object p5, v0, La/tj8;->s:La/i1w0;

    .line 43
    .line 44
    invoke-virtual {v0}, La/tj8;->M()V

    .line 45
    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 6

    .line 1
    iget-object v0, p0, La/tj8;->t:La/c4m0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, La/tj8;->q:La/mne;

    .line 18
    .line 19
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 20
    .line 21
    new-instance v2, La/d38;

    .line 22
    .line 23
    const/16 v3, 0x8

    .line 24
    .line 25
    invoke-direct {v2, p0, v3}, La/d38;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    new-instance v3, La/qv3;

    .line 29
    .line 30
    const/16 v4, 0x12

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-direct {v3, p0, v5, v4}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v2, v5, v1, v3}, La/sac;->R(La/bvc;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/tj8;->t:La/c4m0;

    .line 41
    .line 42
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/si8;

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
    sget-object v0, La/qi8;->a:La/qi8;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, La/tj8;->s:La/i1w0;

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
    sget-object v0, La/ri8;->a:La/ri8;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0}, La/tj8;->M()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    sget-object v0, La/pi8;->a:La/pi8;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 82
    .line 83
    .line 84
    return-void
.end method
