.class public final La/qnp0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final o:La/vzg0;

.field public final p:Ljava/lang/String;

.field public final q:La/xfu;

.field public final r:La/duj;

.field public final s:La/mne;

.field public final t:La/i1w0;

.field public u:La/bby;

.field public final v:La/c4m0;


# direct methods
.method public constructor <init>(La/vzg0;Ljava/lang/String;La/xfu;La/m1e;La/ocl;La/duj;La/mne;La/i1w0;La/ctf0;La/pru;)V
    .locals 7

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/ck60;

    .line 8
    .line 9
    const/16 v0, 0x14

    .line 10
    .line 11
    move-object/from16 v1, p10

    .line 12
    .line 13
    invoke-direct {v2, p2, p1, v1, v0}, La/ck60;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    new-instance v3, La/gpb0;

    .line 17
    .line 18
    const/16 v0, 0xe

    .line 19
    .line 20
    move-object/from16 v1, p9

    .line 21
    .line 22
    invoke-direct {v3, p5, v1, v0}, La/gpb0;-><init>(La/ocl;La/ctf0;B)V

    .line 23
    .line 24
    .line 25
    iget-object p5, p7, La/mne;->c:La/vs10;

    .line 26
    .line 27
    iget-object v6, p7, La/mne;->a:La/rwj;

    .line 28
    .line 29
    invoke-static {p5, v6}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v1, 0x0

    .line 35
    move-object v0, p0

    .line 36
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/qnp0;->o:La/vzg0;

    .line 40
    .line 41
    iput-object p2, p0, La/qnp0;->p:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p3, p0, La/qnp0;->q:La/xfu;

    .line 44
    .line 45
    iput-object p6, p0, La/qnp0;->r:La/duj;

    .line 46
    .line 47
    iput-object p7, p0, La/qnp0;->s:La/mne;

    .line 48
    .line 49
    iput-object p8, p0, La/qnp0;->t:La/i1w0;

    .line 50
    .line 51
    iget-object p1, p0, La/qnp0;->v:La/c4m0;

    .line 52
    .line 53
    const/4 p2, 0x1

    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-ne p1, p2, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-interface {p4}, La/m1e;->b()La/gmq;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance p3, La/pnp0;

    .line 68
    .line 69
    const/4 p4, 0x0

    .line 70
    invoke-direct {p3, p0, p4, p2}, La/pnp0;-><init>(La/qnp0;La/yje;B)V

    .line 71
    .line 72
    .line 73
    new-instance p2, La/fnq;

    .line 74
    .line 75
    const/4 p5, 0x4

    .line 76
    invoke-direct {p2, p1, p3, p5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1, v6}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance p3, La/ssl0;

    .line 88
    .line 89
    const/16 p5, 0x11

    .line 90
    .line 91
    invoke-direct {p3, p0, p4, p5}, La/ssl0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {p2, p1, p3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, La/qnp0;->v:La/c4m0;

    .line 99
    .line 100
    :goto_0
    invoke-virtual {p0}, La/qnp0;->M()V

    .line 101
    .line 102
    .line 103
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 8

    .line 1
    iget-object v0, p0, La/qnp0;->u:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/bby;->isActive()Z

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
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 14
    .line 15
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 16
    .line 17
    :cond_1
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
    check-cast v2, La/knp0;

    .line 26
    .line 27
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    const/16 v7, 0x39

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static/range {v2 .. v7}, La/knp0;->a(La/knp0;ZZLjava/util/List;II)La/knp0;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-object v0, p0, La/qnp0;->s:La/mne;

    .line 53
    .line 54
    iget-object v5, v0, La/mne;->a:La/rwj;

    .line 55
    .line 56
    new-instance v3, La/ttn0;

    .line 57
    .line 58
    const/16 v0, 0x1c

    .line 59
    .line 60
    invoke-direct {v3, p0, v0}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    new-instance v6, La/pnp0;

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-direct {v6, p0, v0, v1}, La/pnp0;-><init>(La/qnp0;La/yje;B)V

    .line 68
    .line 69
    .line 70
    const/16 v7, 0xa

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, La/qnp0;->u:La/bby;

    .line 78
    .line 79
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 8

    .line 1
    check-cast p1, La/fnp0;

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
    instance-of v0, p1, La/cnp0;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, La/qnp0;->t:La/i1w0;

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
    instance-of v0, p1, La/dnp0;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, La/qnp0;->M()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    instance-of v0, p1, La/enp0;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    move-object v0, p1

    .line 66
    check-cast v0, La/enp0;

    .line 67
    .line 68
    iget v0, v0, La/enp0;->a:I

    .line 69
    .line 70
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, p0, La/qnp0;->o:La/vzg0;

    .line 75
    .line 76
    const-string v2, "KEY_CURRENT_TAB"

    .line 77
    .line 78
    invoke-virtual {v1, v2, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 82
    .line 83
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 84
    .line 85
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-object v2, v1

    .line 93
    check-cast v2, La/knp0;

    .line 94
    .line 95
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-object v3, p1

    .line 101
    check-cast v3, La/enp0;

    .line 102
    .line 103
    iget v6, v3, La/enp0;->a:I

    .line 104
    .line 105
    const/16 v7, 0x2f

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    const/4 v4, 0x0

    .line 109
    const/4 v5, 0x0

    .line 110
    invoke-static/range {v2 .. v7}, La/knp0;->a(La/knp0;ZZLjava/util/List;II)La/knp0;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_3

    .line 119
    .line 120
    return-void

    .line 121
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 122
    .line 123
    .line 124
    return-void
.end method
