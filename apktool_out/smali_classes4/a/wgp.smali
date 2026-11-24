.class public final La/wgp;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic v:I


# instance fields
.field public final o:La/duj;

.field public final p:La/b8u;

.field public final q:La/i1w0;

.field public final r:La/kki;

.field public final s:Ljava/lang/String;

.field public final t:La/mne;

.field public u:La/bby;


# direct methods
.method public constructor <init>(La/duj;La/b8u;La/m1e;La/i1w0;La/kki;La/ocl;Ljava/lang/String;La/r9u;La/mne;La/ctf0;La/vjp;)V
    .locals 7

    .line 1
    move-object/from16 v0, p9

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v3, La/dfp;

    .line 13
    .line 14
    const/4 v1, 0x5

    .line 15
    invoke-direct {v3, v1}, La/dfp;-><init>(B)V

    .line 16
    .line 17
    .line 18
    new-instance v4, La/ifd;

    .line 19
    .line 20
    move-object/from16 v1, p10

    .line 21
    .line 22
    move-object/from16 v2, p11

    .line 23
    .line 24
    invoke-direct {v4, v1, p6, v2, p8}, La/ifd;-><init>(La/ctf0;La/ocl;La/vjp;La/r9u;)V

    .line 25
    .line 26
    .line 27
    iget-object p6, v0, La/mne;->c:La/vs10;

    .line 28
    .line 29
    iget-object p8, v0, La/mne;->a:La/rwj;

    .line 30
    .line 31
    invoke-static {p6, p8}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v2, 0x0

    .line 37
    move-object v1, p0

    .line 38
    invoke-direct/range {v1 .. v6}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, La/wgp;->o:La/duj;

    .line 42
    .line 43
    iput-object p2, p0, La/wgp;->p:La/b8u;

    .line 44
    .line 45
    iput-object p4, p0, La/wgp;->q:La/i1w0;

    .line 46
    .line 47
    iput-object p5, p0, La/wgp;->r:La/kki;

    .line 48
    .line 49
    iput-object p7, p0, La/wgp;->s:Ljava/lang/String;

    .line 50
    .line 51
    iput-object v0, p0, La/wgp;->t:La/mne;

    .line 52
    .line 53
    new-instance p1, La/ax5;

    .line 54
    .line 55
    invoke-direct {p1, p0}, La/ax5;-><init>(La/wgp;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p3}, La/m1e;->b()La/gmq;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    new-instance p3, La/hij;

    .line 63
    .line 64
    const/4 p4, 0x0

    .line 65
    const/16 p5, 0x15

    .line 66
    .line 67
    invoke-direct {p3, p0, p4, p5}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 68
    .line 69
    .line 70
    new-instance p4, La/fnq;

    .line 71
    .line 72
    const/4 p5, 0x4

    .line 73
    invoke-direct {p4, p2, p3, p5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    iget-object p3, v0, La/mne;->b:La/dvj;

    .line 81
    .line 82
    invoke-static {p2, p3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-static {p2, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p4, p1}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, La/wgp;->M()V

    .line 94
    .line 95
    .line 96
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 9

    .line 1
    iget-object v0, p0, La/wgp;->u:La/bby;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 7
    .line 8
    .line 9
    move-result v0

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
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-object v3, v2

    .line 25
    check-cast v3, La/rgp;

    .line 26
    .line 27
    iget-object v4, p0, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static {v3, v1, v4, v4}, La/rgp;->a(La/rgp;ZZZ)La/rgp;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v0, p0, La/wgp;->t:La/mne;

    .line 48
    .line 49
    iget-object v6, v0, La/mne;->b:La/dvj;

    .line 50
    .line 51
    new-instance v4, La/g7p;

    .line 52
    .line 53
    const/4 v0, 0x3

    .line 54
    invoke-direct {v4, p0, v0}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    new-instance v7, La/j0l;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    const/16 v1, 0x17

    .line 61
    .line 62
    invoke-direct {v7, p0, v0, v1}, La/j0l;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 63
    .line 64
    .line 65
    const/16 v8, 0xa

    .line 66
    .line 67
    const/4 v5, 0x0

    .line 68
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/wgp;->u:La/bby;

    .line 73
    .line 74
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/ngp;

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
    sget-object v0, La/kgp;->a:La/kgp;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, La/wgp;->q:La/i1w0;

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
    instance-of v0, p1, La/lgp;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    check-cast p1, La/lgp;

    .line 61
    .line 62
    iget-object p1, p1, La/lgp;->a:La/ugp;

    .line 63
    .line 64
    instance-of v0, p1, La/sgp;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    new-instance v0, La/ffd;

    .line 69
    .line 70
    const/16 v1, 0x9

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    invoke-direct {v0, p0, p1, v2, v1}, La/ffd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 74
    .line 75
    .line 76
    const/4 p1, 0x3

    .line 77
    invoke-static {p0, v2, v2, v0, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 78
    .line 79
    .line 80
    :cond_1
    return-void

    .line 81
    :cond_2
    sget-object v0, La/mgp;->a:La/mgp;

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_3

    .line 88
    .line 89
    invoke-virtual {p0}, La/wgp;->M()V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 94
    .line 95
    .line 96
    return-void
.end method
