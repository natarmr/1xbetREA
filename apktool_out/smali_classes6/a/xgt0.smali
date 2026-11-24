.class public final La/xgt0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final o:La/i1w0;

.field public final p:Ljava/lang/String;

.field public final q:La/xsu;

.field public final r:La/duj;

.field public final s:La/kki;

.field public final t:La/mne;

.field public final u:J

.field public v:La/bby;


# direct methods
.method public constructor <init>(La/i1w0;Ljava/lang/String;La/xsu;La/duj;La/kki;La/ocl;La/vjp;La/mne;La/m1e;JLa/r9u;La/ctf0;)V
    .locals 11

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p12 .. p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p13 .. p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v3, La/xns0;

    .line 13
    .line 14
    const/16 v1, 0x18

    .line 15
    .line 16
    invoke-direct {v3, v1}, La/xns0;-><init>(B)V

    .line 17
    .line 18
    .line 19
    new-instance v4, La/p1z;

    .line 20
    .line 21
    move-object/from16 v8, p6

    .line 22
    .line 23
    move-object/from16 v9, p7

    .line 24
    .line 25
    move-wide/from16 v5, p10

    .line 26
    .line 27
    move-object/from16 v10, p12

    .line 28
    .line 29
    move-object/from16 v7, p13

    .line 30
    .line 31
    invoke-direct/range {v4 .. v10}, La/p1z;-><init>(JLa/ctf0;La/ocl;La/vjp;La/r9u;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, La/mne;->c:La/vs10;

    .line 35
    .line 36
    iget-object v2, v0, La/mne;->a:La/rwj;

    .line 37
    .line 38
    invoke-static {v1, v2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v2, 0x0

    .line 44
    move-object v1, p0

    .line 45
    invoke-direct/range {v1 .. v6}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, La/xgt0;->o:La/i1w0;

    .line 49
    .line 50
    iput-object p2, p0, La/xgt0;->p:Ljava/lang/String;

    .line 51
    .line 52
    iput-object p3, p0, La/xgt0;->q:La/xsu;

    .line 53
    .line 54
    iput-object p4, p0, La/xgt0;->r:La/duj;

    .line 55
    .line 56
    move-object/from16 p1, p5

    .line 57
    .line 58
    iput-object p1, p0, La/xgt0;->s:La/kki;

    .line 59
    .line 60
    iput-object v0, p0, La/xgt0;->t:La/mne;

    .line 61
    .line 62
    move-wide/from16 v5, p10

    .line 63
    .line 64
    iput-wide v5, p0, La/xgt0;->u:J

    .line 65
    .line 66
    new-instance p1, La/ax5;

    .line 67
    .line 68
    invoke-direct {p1, p0}, La/ax5;-><init>(La/xgt0;)V

    .line 69
    .line 70
    .line 71
    invoke-interface/range {p9 .. p9}, La/m1e;->b()La/gmq;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    new-instance v2, La/wgt0;

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-direct {v2, p0, v3, v4}, La/wgt0;-><init>(La/xgt0;La/yje;B)V

    .line 80
    .line 81
    .line 82
    new-instance v3, La/fnq;

    .line 83
    .line 84
    const/4 v4, 0x4

    .line 85
    invoke-direct {v3, v0, v2, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {v3, p1}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, La/xgt0;->M()V

    .line 100
    .line 101
    .line 102
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 9

    .line 1
    iget-object v0, p0, La/xgt0;->v:La/bby;

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
    check-cast v3, La/sgt0;

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
    invoke-static {v3, v1, v4}, La/sgt0;->a(La/sgt0;ZZ)La/sgt0;

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
    iget-object v0, p0, La/xgt0;->t:La/mne;

    .line 48
    .line 49
    iget-object v6, v0, La/mne;->b:La/dvj;

    .line 50
    .line 51
    new-instance v4, La/vgt0;

    .line 52
    .line 53
    invoke-direct {v4, p0, v1}, La/vgt0;-><init>(La/xgt0;B)V

    .line 54
    .line 55
    .line 56
    new-instance v7, La/wgt0;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-direct {v7, p0, v0, v1}, La/wgt0;-><init>(La/xgt0;La/yje;B)V

    .line 60
    .line 61
    .line 62
    const/16 v8, 0xa

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/xgt0;->v:La/bby;

    .line 70
    .line 71
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/egt0;

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
    sget-object v0, La/bgt0;->a:La/bgt0;

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
    iget-object p0, p0, La/xgt0;->o:La/i1w0;

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
    instance-of v0, p1, La/cgt0;

    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    check-cast p1, La/cgt0;

    .line 62
    .line 63
    iget-object p1, p1, La/cgt0;->a:La/agt0;

    .line 64
    .line 65
    instance-of v0, p1, La/yft0;

    .line 66
    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    new-instance v0, La/gv60;

    .line 70
    .line 71
    const/16 v1, 0x16

    .line 72
    .line 73
    invoke-direct {v0, p0, p1, v2, v1}, La/gv60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

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
    sget-object v0, La/dgt0;->a:La/dgt0;

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
    new-instance p1, La/vgt0;

    .line 90
    .line 91
    invoke-direct {p1, p0, v1}, La/vgt0;-><init>(La/xgt0;B)V

    .line 92
    .line 93
    .line 94
    new-instance v0, La/m91;

    .line 95
    .line 96
    const/16 v1, 0x19

    .line 97
    .line 98
    invoke-direct {v0, p0, v2, v1}, La/m91;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 99
    .line 100
    .line 101
    const/4 v1, 0x1

    .line 102
    invoke-static {p0, v2, p1, v0, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 107
    .line 108
    .line 109
    return-void
.end method
