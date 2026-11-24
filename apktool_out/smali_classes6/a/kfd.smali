.class public final La/kfd;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final o:La/duj;

.field public final p:La/bwl;

.field public final q:La/i1w0;

.field public final r:La/kki;

.field public final s:Ljava/lang/String;

.field public final t:J

.field public final u:La/ax5;

.field public v:La/c4m0;


# direct methods
.method public constructor <init>(La/duj;La/bwl;La/m1e;La/i1w0;La/ctf0;La/kki;La/ocl;La/vjp;Ljava/lang/String;JLa/r9u;La/mne;)V
    .locals 6

    .line 1
    move-object/from16 v0, p13

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p12 .. p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v2, La/a7d;

    .line 13
    .line 14
    const/16 v1, 0xa

    .line 15
    .line 16
    invoke-direct {v2, v1}, La/a7d;-><init>(B)V

    .line 17
    .line 18
    .line 19
    new-instance v3, La/ifd;

    .line 20
    .line 21
    move-object/from16 v1, p12

    .line 22
    .line 23
    invoke-direct {v3, p8, v1, p5, p7}, La/ifd;-><init>(La/vjp;La/r9u;La/ctf0;La/ocl;)V

    .line 24
    .line 25
    .line 26
    iget-object p5, v0, La/mne;->c:La/vs10;

    .line 27
    .line 28
    iget-object p7, v0, La/mne;->a:La/rwj;

    .line 29
    .line 30
    invoke-static {p5, p7}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v1, 0x0

    .line 36
    move-object v0, p0

    .line 37
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/kfd;->o:La/duj;

    .line 41
    .line 42
    iput-object p2, p0, La/kfd;->p:La/bwl;

    .line 43
    .line 44
    iput-object p4, p0, La/kfd;->q:La/i1w0;

    .line 45
    .line 46
    iput-object p6, p0, La/kfd;->r:La/kki;

    .line 47
    .line 48
    iput-object p9, p0, La/kfd;->s:Ljava/lang/String;

    .line 49
    .line 50
    move-wide/from16 p1, p10

    .line 51
    .line 52
    iput-wide p1, p0, La/kfd;->t:J

    .line 53
    .line 54
    new-instance p1, La/ax5;

    .line 55
    .line 56
    invoke-direct {p1, p0}, La/ax5;-><init>(La/kfd;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, La/kfd;->u:La/ax5;

    .line 60
    .line 61
    invoke-interface {p3}, La/m1e;->b()La/gmq;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    new-instance p3, La/jfd;

    .line 66
    .line 67
    const/4 p4, 0x0

    .line 68
    const/4 p5, 0x0

    .line 69
    invoke-direct {p3, p0, p4, p5}, La/jfd;-><init>(La/kfd;La/yje;B)V

    .line 70
    .line 71
    .line 72
    new-instance p4, La/fnq;

    .line 73
    .line 74
    const/4 p5, 0x4

    .line 75
    invoke-direct {p4, p2, p3, p5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-static {p2, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p4, p1}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, La/kfd;->M()V

    .line 90
    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 5

    .line 1
    iget-object v0, p0, La/kfd;->v:La/c4m0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, La/pby;->isActive()Z

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
    check-cast v3, La/sed;

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
    invoke-static {v3, v1, v4}, La/sed;->a(La/sed;ZZ)La/sed;

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
    move-result-object v0

    .line 47
    new-instance v2, La/jfd;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-direct {v2, p0, v3, v1}, La/jfd;-><init>(La/kfd;La/yje;B)V

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x2

    .line 54
    iget-object v4, p0, La/kfd;->u:La/ax5;

    .line 55
    .line 56
    invoke-static {v0, v4, v3, v2, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, La/kfd;->v:La/c4m0;

    .line 61
    .line 62
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/eed;

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
    sget-object v0, La/bed;->a:La/bed;

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
    iget-object p0, p0, La/kfd;->q:La/i1w0;

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
    instance-of v0, p1, La/ced;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    check-cast p1, La/ced;

    .line 61
    .line 62
    iget-object p1, p1, La/ced;->a:La/aed;

    .line 63
    .line 64
    instance-of v0, p1, La/ydd;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    new-instance v0, La/ffd;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-direct {v0, p0, p1, v2, v1}, La/ffd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 73
    .line 74
    .line 75
    const/4 p1, 0x3

    .line 76
    invoke-static {p0, v2, v2, v0, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void

    .line 80
    :cond_2
    sget-object v0, La/ded;->a:La/ded;

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_3

    .line 87
    .line 88
    invoke-virtual {p0}, La/kfd;->M()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 93
    .line 94
    .line 95
    return-void
.end method
