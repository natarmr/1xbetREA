.class public final La/qnv0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final o:La/g2v;

.field public final p:La/mne;

.field public final q:La/i1w0;

.field public final r:La/duj;

.field public final s:Ljava/lang/String;

.field public final t:J

.field public final u:La/rl70;

.field public final v:La/c4m0;

.field public w:La/bby;


# direct methods
.method public constructor <init>(La/g2v;La/m1e;La/mne;La/i1w0;La/duj;Ljava/lang/String;JLa/ocl;La/ctf0;La/rl70;)V
    .locals 10

    .line 1
    move-wide/from16 v0, p7

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v4, La/whh;

    .line 10
    .line 11
    const/4 v8, 0x1

    .line 12
    invoke-direct {v4, v8, v0, v1}, La/whh;-><init>(BJ)V

    .line 13
    .line 14
    .line 15
    new-instance v5, La/gpb0;

    .line 16
    .line 17
    const/16 v2, 0x17

    .line 18
    .line 19
    move-object/from16 v3, p9

    .line 20
    .line 21
    move-object/from16 v6, p10

    .line 22
    .line 23
    invoke-direct {v5, v3, v6, v2}, La/gpb0;-><init>(La/ocl;La/ctf0;B)V

    .line 24
    .line 25
    .line 26
    iget-object v9, p3, La/mne;->a:La/rwj;

    .line 27
    .line 28
    invoke-static {v9, v9}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    move-object v2, p0

    .line 35
    invoke-direct/range {v2 .. v7}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, La/qnv0;->o:La/g2v;

    .line 39
    .line 40
    iput-object p3, p0, La/qnv0;->p:La/mne;

    .line 41
    .line 42
    iput-object p4, p0, La/qnv0;->q:La/i1w0;

    .line 43
    .line 44
    iput-object p5, p0, La/qnv0;->r:La/duj;

    .line 45
    .line 46
    move-object/from16 p1, p6

    .line 47
    .line 48
    iput-object p1, p0, La/qnv0;->s:Ljava/lang/String;

    .line 49
    .line 50
    iput-wide v0, p0, La/qnv0;->t:J

    .line 51
    .line 52
    move-object/from16 p1, p11

    .line 53
    .line 54
    iput-object p1, p0, La/qnv0;->u:La/rl70;

    .line 55
    .line 56
    iget-object p1, p0, La/qnv0;->v:La/c4m0;

    .line 57
    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-ne p1, v8, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-interface {p2}, La/m1e;->b()La/gmq;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance p2, La/onv0;

    .line 72
    .line 73
    const/4 p3, 0x0

    .line 74
    invoke-direct {p2, p0, p3, v8}, La/onv0;-><init>(La/qnv0;La/yje;B)V

    .line 75
    .line 76
    .line 77
    new-instance p4, La/fnq;

    .line 78
    .line 79
    const/4 p5, 0x4

    .line 80
    invoke-direct {p4, p1, p2, p5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1, v9}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance p2, La/pnv0;

    .line 92
    .line 93
    const/4 p5, 0x0

    .line 94
    invoke-direct {p2, p0, p3, p5}, La/pnv0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 95
    .line 96
    .line 97
    invoke-static {p4, p1, p2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-object p1, p0, La/qnv0;->v:La/c4m0;

    .line 102
    .line 103
    :goto_0
    invoke-virtual {p0}, La/qnv0;->M()V

    .line 104
    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 8

    .line 1
    iget-object v0, p0, La/qnv0;->w:La/bby;

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
    check-cast v2, La/jnv0;

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
    const/16 v7, 0x18

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static/range {v2 .. v7}, La/jnv0;->a(La/jnv0;ZZZLjava/util/List;I)La/jnv0;

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
    iget-object v0, p0, La/qnv0;->p:La/mne;

    .line 53
    .line 54
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 55
    .line 56
    new-instance v3, La/gdv0;

    .line 57
    .line 58
    const/4 v0, 0x5

    .line 59
    invoke-direct {v3, p0, v0}, La/gdv0;-><init>(Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    new-instance v6, La/onv0;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-direct {v6, p0, v0, v1}, La/onv0;-><init>(La/qnv0;La/yje;B)V

    .line 67
    .line 68
    .line 69
    const/16 v7, 0xa

    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/qnv0;->w:La/bby;

    .line 77
    .line 78
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/cnv0;

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
    sget-object v0, La/zmv0;->a:La/zmv0;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, La/qnv0;->q:La/i1w0;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance p1, La/c8d;

    .line 24
    .line 25
    sget-object v0, La/y7d;->a:La/v7d;

    .line 26
    .line 27
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 28
    .line 29
    invoke-direct {p1, v0, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {p0, p1, v1, p0, v0}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    move-object p1, p0

    .line 38
    check-cast p1, La/paw;

    .line 39
    .line 40
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, La/oe50;

    .line 51
    .line 52
    invoke-virtual {v1, p1}, La/i1w0;->a(La/oe50;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void

    .line 57
    :cond_1
    instance-of v0, p1, La/anv0;

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    new-instance v0, La/zfv0;

    .line 62
    .line 63
    const/4 v2, 0x6

    .line 64
    invoke-direct {v0, p0, p1, v2}, La/zfv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    sget-object v0, La/bnv0;->a:La/bnv0;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0}, La/qnv0;->M()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 84
    .line 85
    .line 86
    return-void
.end method
