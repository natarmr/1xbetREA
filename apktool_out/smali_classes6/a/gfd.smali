.class public final La/gfd;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic u:I


# instance fields
.field public final o:La/duj;

.field public final p:La/lsn;

.field public final q:La/i1w0;

.field public final r:La/kki;

.field public final s:Ljava/lang/String;

.field public final t:La/mne;


# direct methods
.method public constructor <init>(La/duj;La/lsn;La/m1e;La/i1w0;La/kki;La/ocl;La/ctf0;ZLa/vjp;Ljava/lang/String;La/r9u;La/mne;)V
    .locals 11

    .line 1
    move-object/from16 v0, p12

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p11 .. p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v3, La/a7d;

    .line 13
    .line 14
    const/16 v1, 0x9

    .line 15
    .line 16
    invoke-direct {v3, v1}, La/a7d;-><init>(B)V

    .line 17
    .line 18
    .line 19
    new-instance v4, La/cw6;

    .line 20
    .line 21
    const/4 v10, 0x3

    .line 22
    move-object/from16 v8, p6

    .line 23
    .line 24
    move-object/from16 v9, p7

    .line 25
    .line 26
    move/from16 v7, p8

    .line 27
    .line 28
    move-object/from16 v5, p9

    .line 29
    .line 30
    move-object/from16 v6, p11

    .line 31
    .line 32
    invoke-direct/range {v4 .. v10}, La/cw6;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    iget-object v1, v0, La/mne;->c:La/vs10;

    .line 36
    .line 37
    iget-object v2, v0, La/mne;->a:La/rwj;

    .line 38
    .line 39
    invoke-static {v1, v2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v2, 0x0

    .line 45
    move-object v1, p0

    .line 46
    invoke-direct/range {v1 .. v6}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, La/gfd;->o:La/duj;

    .line 50
    .line 51
    iput-object p2, p0, La/gfd;->p:La/lsn;

    .line 52
    .line 53
    iput-object p4, p0, La/gfd;->q:La/i1w0;

    .line 54
    .line 55
    move-object/from16 p1, p5

    .line 56
    .line 57
    iput-object p1, p0, La/gfd;->r:La/kki;

    .line 58
    .line 59
    move-object/from16 p1, p10

    .line 60
    .line 61
    iput-object p1, p0, La/gfd;->s:Ljava/lang/String;

    .line 62
    .line 63
    iput-object v0, p0, La/gfd;->t:La/mne;

    .line 64
    .line 65
    new-instance p1, La/ax5;

    .line 66
    .line 67
    invoke-direct {p1, p0}, La/ax5;-><init>(La/gfd;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p3}, La/m1e;->b()La/gmq;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    new-instance v3, La/efd;

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    invoke-direct {v3, p0, v4, v5}, La/efd;-><init>(La/gfd;La/yje;B)V

    .line 79
    .line 80
    .line 81
    new-instance v4, La/fnq;

    .line 82
    .line 83
    const/4 v5, 0x4

    .line 84
    invoke-direct {v4, v2, v3, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 92
    .line 93
    invoke-static {v2, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {v4, p1}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, La/gfd;->M()V

    .line 105
    .line 106
    .line 107
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 10

    .line 1
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 2
    .line 3
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 4
    .line 5
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, La/cfd;

    .line 14
    .line 15
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    const/16 v9, 0x11

    .line 22
    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    invoke-static/range {v2 .. v9}, La/cfd;->a(La/cfd;JZZZLjava/util/List;I)La/cfd;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    iget-object v0, p0, La/gfd;->t:La/mne;

    .line 43
    .line 44
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 45
    .line 46
    new-instance v3, La/lya;

    .line 47
    .line 48
    const/16 v0, 0x1b

    .line 49
    .line 50
    invoke-direct {v3, p0, v0}, La/lya;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    new-instance v6, La/efd;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    const/4 v1, 0x1

    .line 57
    invoke-direct {v6, p0, v0, v1}, La/efd;-><init>(La/gfd;La/yje;B)V

    .line 58
    .line 59
    .line 60
    const/16 v7, 0xa

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/wed;

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
    sget-object v0, La/ted;->a:La/ted;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, La/gfd;->q:La/i1w0;

    .line 19
    .line 20
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance v0, La/c8d;

    .line 25
    .line 26
    sget-object v2, La/y7d;->a:La/v7d;

    .line 27
    .line 28
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 29
    .line 30
    invoke-direct {v0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 31
    .line 32
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
    if-eqz v1, :cond_1

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
    instance-of v0, p1, La/ued;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    check-cast p1, La/ued;

    .line 61
    .line 62
    iget-object p1, p1, La/ued;->a:La/xdd;

    .line 63
    .line 64
    instance-of v0, p1, La/vdd;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    new-instance v0, La/ffd;

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    invoke-direct {v0, p0, p1, v2, v1}, La/ffd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 72
    .line 73
    .line 74
    const/4 p1, 0x3

    .line 75
    invoke-static {p0, v2, v2, v0, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 76
    .line 77
    .line 78
    :cond_1
    return-void

    .line 79
    :cond_2
    sget-object v0, La/ved;->a:La/ved;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0}, La/gfd;->M()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 92
    .line 93
    .line 94
    return-void
.end method
