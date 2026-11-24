.class public final La/khp;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic q:I


# instance fields
.field public final o:La/dot;

.field public final p:La/i1w0;


# direct methods
.method public constructor <init>(La/ctf0;La/mne;La/dot;La/dot;La/i1w0;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/dfp;

    .line 5
    .line 6
    const/4 v0, 0x6

    .line 7
    invoke-direct {v2, v0}, La/dfp;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v3, La/bcn;

    .line 11
    .line 12
    const/16 v0, 0xc

    .line 13
    .line 14
    invoke-direct {v3, p1, v0}, La/bcn;-><init>(La/ctf0;B)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p2, La/mne;->c:La/vs10;

    .line 18
    .line 19
    iget-object v0, p2, La/mne;->a:La/rwj;

    .line 20
    .line 21
    invoke-static {p1, v0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v1, 0x0

    .line 27
    move-object v0, p0

    .line 28
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 29
    .line 30
    .line 31
    iput-object p4, v0, La/khp;->o:La/dot;

    .line 32
    .line 33
    iput-object p5, v0, La/khp;->p:La/i1w0;

    .line 34
    .line 35
    iget-object p0, p3, La/dot;->a:La/j1q0;

    .line 36
    .line 37
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 38
    .line 39
    iget-object p0, p0, La/m1q0;->d:La/p7m0;

    .line 40
    .line 41
    new-instance p1, La/sxk;

    .line 42
    .line 43
    const/4 p3, 0x0

    .line 44
    const/16 p4, 0x12

    .line 45
    .line 46
    invoke-direct {p1, v0, p3, p4}, La/sxk;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 47
    .line 48
    .line 49
    new-instance p3, La/fnq;

    .line 50
    .line 51
    const/4 p4, 0x4

    .line 52
    invoke-direct {p3, p0, p1, p4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget-object p1, p2, La/mne;->b:La/dvj;

    .line 60
    .line 61
    invoke-static {p0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    sget-object p1, La/jhp;->h:La/jhp;

    .line 66
    .line 67
    invoke-static {p3, p0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 68
    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p1, La/dhp;

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
    instance-of v0, p1, La/ahp;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, La/khp;->p:La/i1w0;

    .line 14
    .line 15
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, La/c8d;

    .line 20
    .line 21
    sget-object v1, La/y7d;->a:La/v7d;

    .line 22
    .line 23
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    move-object v0, p1

    .line 34
    check-cast v0, La/paw;

    .line 35
    .line 36
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, La/oe50;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return-void

    .line 53
    :cond_1
    instance-of v0, p1, La/bhp;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    check-cast p1, La/bhp;

    .line 59
    .line 60
    iget p1, p1, La/bhp;->a:I

    .line 61
    .line 62
    new-instance v0, La/snn;

    .line 63
    .line 64
    invoke-direct {v0, p1, p0, v1}, La/snn;-><init>(ILa/khp;La/yje;)V

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x3

    .line 68
    invoke-static {p0, v1, v1, v0, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    instance-of v0, p1, La/chp;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 77
    .line 78
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 79
    .line 80
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-object v3, v2

    .line 88
    check-cast v3, La/hhp;

    .line 89
    .line 90
    iget-object v4, p0, La/i3t0;->f:La/oyg0;

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-object v4, p1

    .line 96
    check-cast v4, La/chp;

    .line 97
    .line 98
    iget-object v4, v4, La/chp;->a:Ljava/lang/String;

    .line 99
    .line 100
    const/4 v5, 0x2

    .line 101
    invoke-static {v3, v4, v1, v5}, La/hhp;->a(La/hhp;Ljava/lang/String;Ljava/util/ArrayList;I)La/hhp;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_3

    .line 110
    .line 111
    return-void

    .line 112
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 113
    .line 114
    .line 115
    return-void
.end method
