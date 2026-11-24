.class public final La/e6j;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic L:I


# instance fields
.field public final A:La/wyb;

.field public final B:La/qoc;

.field public final C:La/nou;

.field public final D:La/trm0;

.field public final E:La/kd30;

.field public F:La/bby;

.field public final G:La/c4m0;

.field public H:La/bby;

.field public I:La/bby;

.field public final J:La/c4m0;

.field public K:La/c4m0;

.field public final o:La/oeg0;

.field public final p:La/duj;

.field public final q:La/mne;

.field public final r:La/ctf0;

.field public final s:La/khf0;

.field public final t:La/edu;

.field public final u:La/crt;

.field public final v:La/rpt;

.field public final w:La/peg0;

.field public final x:La/b4j;

.field public final y:La/je;

.field public final z:La/es;


# direct methods
.method public constructor <init>(La/oeg0;La/duj;La/mne;La/ctf0;La/khf0;La/m1e;La/ali;La/edu;La/crt;La/rpt;La/peg0;La/b4j;La/je;La/es;La/wyb;La/qoc;La/nou;La/trm0;La/kd30;La/bzt;La/pru;La/kc60;)V
    .locals 7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    iget-object v1, p3, La/mne;->c:La/vs10;

    .line 2
    iget-object v2, p3, La/mne;->a:La/rwj;

    .line 3
    invoke-static {v1, v2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    move-result-object v1

    .line 4
    new-instance v2, La/z5j;

    const/4 v3, 0x0

    move-object/from16 v4, p20

    move-object/from16 v5, p21

    invoke-direct {v2, v5, v4, v3}, La/z5j;-><init>(La/pru;La/bzt;B)V

    .line 5
    new-instance v4, La/ep4;

    const/16 v5, 0x1b

    invoke-direct {v4, p4, v5}, La/ep4;-><init>(La/ctf0;B)V

    const/4 v5, 0x0

    .line 6
    invoke-direct {p0, v2, v1, v4, v5}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 7
    iput-object p1, p0, La/e6j;->o:La/oeg0;

    .line 8
    iput-object p2, p0, La/e6j;->p:La/duj;

    .line 9
    iput-object p3, p0, La/e6j;->q:La/mne;

    .line 10
    iput-object p4, p0, La/e6j;->r:La/ctf0;

    .line 11
    iput-object p5, p0, La/e6j;->s:La/khf0;

    .line 12
    iput-object p8, p0, La/e6j;->t:La/edu;

    move-object/from16 p1, p9

    .line 13
    iput-object p1, p0, La/e6j;->u:La/crt;

    move-object/from16 p1, p10

    .line 14
    iput-object p1, p0, La/e6j;->v:La/rpt;

    move-object/from16 p1, p11

    .line 15
    iput-object p1, p0, La/e6j;->w:La/peg0;

    move-object/from16 p1, p12

    .line 16
    iput-object p1, p0, La/e6j;->x:La/b4j;

    move-object/from16 p1, p13

    .line 17
    iput-object p1, p0, La/e6j;->y:La/je;

    move-object/from16 p1, p14

    .line 18
    iput-object p1, p0, La/e6j;->z:La/es;

    move-object/from16 p1, p15

    .line 19
    iput-object p1, p0, La/e6j;->A:La/wyb;

    move-object/from16 p1, p16

    .line 20
    iput-object p1, p0, La/e6j;->B:La/qoc;

    move-object/from16 p1, p17

    .line 21
    iput-object p1, p0, La/e6j;->C:La/nou;

    move-object/from16 p1, p18

    .line 22
    iput-object p1, p0, La/e6j;->D:La/trm0;

    move-object/from16 p1, p19

    .line 23
    iput-object p1, p0, La/e6j;->E:La/kd30;

    .line 24
    invoke-virtual/range {p22 .. p22}, La/kc60;->a()La/p7m0;

    move-result-object p1

    const/4 p2, 0x1

    .line 25
    invoke-static {p1, p2}, La/dtb;->z(La/gmq;I)La/lnq;

    move-result-object p1

    .line 26
    new-instance p4, La/b6j;

    const/4 v1, 0x2

    invoke-direct {p4, p0, v5, v1}, La/b6j;-><init>(La/e6j;La/yje;B)V

    .line 27
    new-instance v2, La/fnq;

    const/4 v4, 0x4

    invoke-direct {v2, p1, p4, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 28
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    move-result-object p1

    .line 29
    iget-object p3, p3, La/mne;->b:La/dvj;

    .line 30
    invoke-static {p1, p3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    move-result-object p1

    .line 31
    sget-object p4, La/d6j;->h:La/d6j;

    .line 32
    invoke-static {v2, p1, p4}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 33
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/w5j;

    .line 34
    iget-boolean p1, p1, La/w5j;->e:Z

    if-eqz p1, :cond_1

    .line 35
    invoke-virtual {p0}, La/e6j;->Q()V

    .line 36
    iget-object p1, p0, La/e6j;->G:La/c4m0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, La/pby;->isActive()Z

    move-result p1

    if-ne p1, p2, :cond_0

    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {p6}, La/m1e;->b()La/gmq;

    move-result-object p1

    .line 38
    iget-object p4, p7, La/ali;->d:Ljava/lang/Object;

    check-cast p4, La/nmt;

    .line 39
    invoke-virtual {p4}, La/nmt;->a()La/p7m0;

    move-result-object p4

    .line 40
    iget-object v1, p7, La/ali;->a:Ljava/lang/Object;

    check-cast v1, La/nmt;

    .line 41
    iget-object v1, v1, La/nmt;->a:La/kki;

    .line 42
    iget-object v1, v1, La/kki;->c:Ljava/lang/Object;

    check-cast v1, La/o0j;

    .line 43
    iget-object v1, v1, La/o0j;->d:La/p7m0;

    .line 44
    new-instance v2, La/i89;

    const/16 v4, 0x16

    invoke-direct {v2, v1, v4}, La/i89;-><init>(La/gmq;B)V

    .line 45
    iget-object v1, p7, La/ali;->b:Ljava/lang/Object;

    check-cast v1, La/crt;

    invoke-virtual {v1}, La/crt;->a()La/i89;

    move-result-object v1

    .line 46
    iget-object v0, p7, La/ali;->c:Ljava/lang/Object;

    check-cast v0, La/crt;

    .line 47
    iget-object v0, v0, La/crt;->a:La/kki;

    .line 48
    iget-object v0, v0, La/kki;->c:Ljava/lang/Object;

    check-cast v0, La/o0j;

    .line 49
    iget-object v0, v0, La/o0j;->e:La/p7m0;

    .line 50
    new-instance v6, La/i89;

    invoke-direct {v6, v0, v4}, La/i89;-><init>(La/gmq;B)V

    .line 51
    new-instance v0, La/i4u;

    const/4 v4, 0x5

    .line 52
    invoke-direct {v0, v4, v5, p2}, La/i4u;-><init>(ILa/yje;B)V

    .line 53
    invoke-static {p4, v2, v1, v6, v0}, La/dub;->e0(La/gmq;La/gmq;La/gmq;La/gmq;La/zdr;)La/a1g;

    move-result-object p4

    .line 54
    new-instance v0, La/ko0;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v5, v1}, La/ko0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 55
    new-instance v1, La/p6d;

    invoke-direct {v1, p1, p4, v0, p2}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 56
    invoke-static {v1}, La/u1c;->J(La/gmq;)La/dnq;

    move-result-object p1

    .line 57
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    move-result-object p2

    invoke-static {p2, p3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    move-result-object p2

    .line 58
    new-instance p3, La/b6j;

    invoke-direct {p3, p0, v5, v3}, La/b6j;-><init>(La/e6j;La/yje;B)V

    invoke-static {p1, p2, p3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    move-result-object p1

    .line 59
    iput-object p1, p0, La/e6j;->G:La/c4m0;

    return-void

    .line 60
    :cond_1
    iget-object p1, p0, La/e6j;->J:La/c4m0;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, La/pby;->isActive()Z

    move-result p1

    if-ne p1, p2, :cond_2

    :goto_0
    return-void

    .line 61
    :cond_2
    invoke-interface {p6}, La/m1e;->b()La/gmq;

    move-result-object p1

    .line 62
    new-instance p4, La/c6j;

    invoke-direct {p4, p0, v5, v3}, La/c6j;-><init>(La/e6j;La/yje;B)V

    .line 63
    new-instance v0, La/fnq;

    invoke-direct {v0, p1, p4, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 64
    new-instance p1, La/rj;

    const/16 p4, 0x13

    invoke-direct {p1, p0, v5, p4}, La/rj;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 65
    new-instance p4, La/dnq;

    invoke-direct {p4, v0, p1, p2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 66
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    move-result-object p1

    invoke-static {p1, p3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    move-result-object p1

    .line 67
    new-instance p2, La/f1e;

    const/16 p3, 0xe

    .line 68
    invoke-direct {p2, v1, v5, p3}, La/f1e;-><init>(ILa/yje;B)V

    .line 69
    invoke-static {p4, p1, p2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    move-result-object p1

    .line 70
    iput-object p1, p0, La/e6j;->J:La/c4m0;

    return-void
.end method

.method public static P(La/e6j;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/e6j;->p:La/duj;

    .line 2
    .line 3
    new-instance v1, La/igm;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2, p0, p1}, La/igm;-><init>(ZLa/e6j;Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final M()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/w5j;

    .line 6
    .line 7
    iget-object p0, p0, La/w5j;->g:Ljava/util/List;

    .line 8
    .line 9
    if-eqz p0, :cond_8

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/d4j;

    .line 33
    .line 34
    iget-object v1, v1, La/d4j;->b:La/oll;

    .line 35
    .line 36
    instance-of v2, v1, La/kll;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    check-cast v1, La/kll;

    .line 41
    .line 42
    iget-boolean v1, v1, La/kll;->b:Z

    .line 43
    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    const-string p0, "start"

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_5

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, La/d4j;

    .line 71
    .line 72
    iget-object v1, v1, La/d4j;->b:La/oll;

    .line 73
    .line 74
    instance-of v2, v1, La/kll;

    .line 75
    .line 76
    if-eqz v2, :cond_4

    .line 77
    .line 78
    check-cast v1, La/kll;

    .line 79
    .line 80
    iget-boolean v1, v1, La/kll;->b:Z

    .line 81
    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    const-string p0, "progress"

    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_5
    :goto_1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_8

    .line 103
    .line 104
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, La/d4j;

    .line 109
    .line 110
    iget-object v0, v0, La/d4j;->b:La/oll;

    .line 111
    .line 112
    instance-of v1, v0, La/kll;

    .line 113
    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    check-cast v0, La/kll;

    .line 117
    .line 118
    iget-boolean v0, v0, La/kll;->a:Z

    .line 119
    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    const-string p0, "finish"

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_8
    :goto_2
    const-string p0, ""

    .line 126
    .line 127
    return-object p0
.end method

.method public final N()V
    .locals 8

    .line 1
    iget-object v0, p0, La/e6j;->H:La/bby;

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
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v0, p0, La/e6j;->q:La/mne;

    .line 18
    .line 19
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 20
    .line 21
    new-instance v3, La/y5j;

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    invoke-direct {v3, p0, v0}, La/y5j;-><init>(La/e6j;B)V

    .line 25
    .line 26
    .line 27
    new-instance v6, La/wg0;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    const/4 v1, 0x4

    .line 31
    invoke-direct {v6, p0, v0, v1}, La/wg0;-><init>(La/i3t0;La/yje;B)V

    .line 32
    .line 33
    .line 34
    const/16 v7, 0xa

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, La/e6j;->H:La/bby;

    .line 42
    .line 43
    return-void
.end method

.method public final O(La/z3j;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-super/range {p0 .. p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    instance-of v2, v0, La/m3j;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, La/i3t0;->E()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    instance-of v2, v0, La/n3j;

    .line 20
    .line 21
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 22
    .line 23
    iget-object v4, v1, La/i3t0;->i:La/ocj;

    .line 24
    .line 25
    iget-object v5, v1, La/e6j;->q:La/mne;

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/w5j;

    .line 35
    .line 36
    iget-boolean v0, v0, La/w5j;->d:Z

    .line 37
    .line 38
    if-eqz v0, :cond_1e

    .line 39
    .line 40
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    iget-object v10, v5, La/mne;->b:La/dvj;

    .line 45
    .line 46
    sget-object v8, La/a6j;->a:La/a6j;

    .line 47
    .line 48
    new-instance v11, La/ya;

    .line 49
    .line 50
    const/16 v0, 0x17

    .line 51
    .line 52
    invoke-direct {v11, v1, v6, v0}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 53
    .line 54
    .line 55
    const/16 v12, 0xa

    .line 56
    .line 57
    const/4 v9, 0x0

    .line 58
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 59
    .line 60
    .line 61
    iget-object v0, v4, La/ocj;->a:La/p7m0;

    .line 62
    .line 63
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-object v2, v1

    .line 71
    check-cast v2, La/w5j;

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    const/16 v4, 0x77

    .line 77
    .line 78
    invoke-static {v2, v6, v6, v4}, La/w5j;->a(La/w5j;La/i6j;Ljava/util/ArrayList;I)La/w5j;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_1

    .line 87
    .line 88
    return-void

    .line 89
    :cond_2
    instance-of v2, v0, La/p3j;

    .line 90
    .line 91
    iget-object v7, v1, La/e6j;->y:La/je;

    .line 92
    .line 93
    iget-object v8, v1, La/e6j;->x:La/b4j;

    .line 94
    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    check-cast v0, La/p3j;

    .line 98
    .line 99
    iget v0, v0, La/p3j;->a:I

    .line 100
    .line 101
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, La/w5j;

    .line 106
    .line 107
    iget-boolean v1, v1, La/w5j;->c:Z

    .line 108
    .line 109
    if-eqz v1, :cond_4

    .line 110
    .line 111
    iget-object v1, v4, La/ocj;->a:La/p7m0;

    .line 112
    .line 113
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-object v2, v0

    .line 121
    check-cast v2, La/w5j;

    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    const/16 v4, 0x7b

    .line 127
    .line 128
    invoke-static {v2, v6, v6, v4}, La/w5j;->a(La/w5j;La/i6j;Ljava/util/ArrayList;I)La/w5j;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_3

    .line 137
    .line 138
    return-void

    .line 139
    :cond_4
    iget-object v1, v8, La/b4j;->a:La/kt2;

    .line 140
    .line 141
    const-string v2, "index"

    .line 142
    .line 143
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    const-string v4, "dchallenge_section_swap"

    .line 148
    .line 149
    invoke-static {v2, v3, v1, v4}, La/b1j;->w(Ljava/lang/String;Ljava/lang/Integer;La/kt2;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object v1, v7, La/je;->a:La/s1p;

    .line 153
    .line 154
    const-wide/16 v2, 0x2abd

    .line 155
    .line 156
    invoke-static {v0, v1, v2, v3}, La/b1j;->r(ILa/s1p;J)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_5
    instance-of v2, v0, La/q3j;

    .line 161
    .line 162
    const/4 v3, 0x0

    .line 163
    iget-object v4, v1, La/e6j;->o:La/oeg0;

    .line 164
    .line 165
    if-eqz v2, :cond_6

    .line 166
    .line 167
    iget-object v0, v8, La/b4j;->a:La/kt2;

    .line 168
    .line 169
    const-string v1, "dchallenge_section_close"

    .line 170
    .line 171
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    iget-object v0, v7, La/je;->a:La/s1p;

    .line 175
    .line 176
    const-wide/16 v1, 0x2ab9

    .line 177
    .line 178
    sget-object v5, La/xun;->a:La/xun;

    .line 179
    .line 180
    invoke-virtual {v0, v5, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4}, La/oeg0;->c()La/i1w0;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 191
    .line 192
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 193
    .line 194
    .line 195
    new-instance v2, La/c8d;

    .line 196
    .line 197
    sget-object v4, La/y7d;->a:La/v7d;

    .line 198
    .line 199
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 200
    .line 201
    invoke-direct {v2, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 202
    .line 203
    .line 204
    invoke-static {v1, v2, v0, v1, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    :goto_0
    move-object v2, v1

    .line 209
    check-cast v2, La/paw;

    .line 210
    .line 211
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-eqz v3, :cond_1e

    .line 216
    .line 217
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    check-cast v2, La/oe50;

    .line 222
    .line 223
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 224
    .line 225
    .line 226
    goto :goto_0

    .line 227
    :cond_6
    instance-of v2, v0, La/o3j;

    .line 228
    .line 229
    sget-object v9, La/u3j;->a:La/u3j;

    .line 230
    .line 231
    if-eqz v2, :cond_f

    .line 232
    .line 233
    check-cast v0, La/o3j;

    .line 234
    .line 235
    iget-wide v2, v0, La/o3j;->a:J

    .line 236
    .line 237
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    check-cast v0, La/w5j;

    .line 242
    .line 243
    iget-object v0, v0, La/w5j;->g:Ljava/util/List;

    .line 244
    .line 245
    if-eqz v0, :cond_9

    .line 246
    .line 247
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-eqz v4, :cond_8

    .line 256
    .line 257
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    move-object v5, v4

    .line 262
    check-cast v5, La/d4j;

    .line 263
    .line 264
    iget-wide v7, v5, La/d4j;->a:J

    .line 265
    .line 266
    cmp-long v5, v7, v2

    .line 267
    .line 268
    if-nez v5, :cond_7

    .line 269
    .line 270
    move-object v6, v4

    .line 271
    :cond_8
    check-cast v6, La/d4j;

    .line 272
    .line 273
    :cond_9
    if-nez v6, :cond_a

    .line 274
    .line 275
    goto/16 :goto_3

    .line 276
    .line 277
    :cond_a
    iget-object v0, v6, La/d4j;->b:La/oll;

    .line 278
    .line 279
    instance-of v2, v0, La/kll;

    .line 280
    .line 281
    if-eqz v2, :cond_d

    .line 282
    .line 283
    check-cast v0, La/kll;

    .line 284
    .line 285
    iget-boolean v2, v0, La/kll;->a:Z

    .line 286
    .line 287
    iget-boolean v3, v0, La/kll;->b:Z

    .line 288
    .line 289
    if-eqz v3, :cond_b

    .line 290
    .line 291
    if-eqz v2, :cond_b

    .line 292
    .line 293
    invoke-virtual {v1, v9}, La/e6j;->O(La/z3j;)V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :cond_b
    if-eqz v3, :cond_c

    .line 298
    .line 299
    if-nez v2, :cond_c

    .line 300
    .line 301
    new-instance v2, La/s3j;

    .line 302
    .line 303
    iget-wide v3, v0, La/kll;->g:J

    .line 304
    .line 305
    iget v0, v0, La/kll;->c:I

    .line 306
    .line 307
    invoke-direct {v2, v3, v4, v0}, La/s3j;-><init>(JI)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1, v2}, La/e6j;->O(La/z3j;)V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :cond_c
    if-nez v3, :cond_1e

    .line 315
    .line 316
    if-nez v2, :cond_1e

    .line 317
    .line 318
    new-instance v0, La/r3j;

    .line 319
    .line 320
    iget-wide v2, v6, La/d4j;->a:J

    .line 321
    .line 322
    invoke-direct {v0, v2, v3}, La/r3j;-><init>(J)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1, v0}, La/e6j;->O(La/z3j;)V

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :cond_d
    instance-of v2, v0, La/lll;

    .line 330
    .line 331
    if-eqz v2, :cond_e

    .line 332
    .line 333
    check-cast v0, La/lll;

    .line 334
    .line 335
    iget-boolean v0, v0, La/lll;->a:Z

    .line 336
    .line 337
    if-eqz v0, :cond_1e

    .line 338
    .line 339
    invoke-virtual {v1, v9}, La/e6j;->O(La/z3j;)V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :cond_e
    instance-of v0, v0, La/mll;

    .line 344
    .line 345
    if-eqz v0, :cond_1e

    .line 346
    .line 347
    sget-object v0, La/v3j;->a:La/v3j;

    .line 348
    .line 349
    invoke-virtual {v1, v0}, La/e6j;->O(La/z3j;)V

    .line 350
    .line 351
    .line 352
    return-void

    .line 353
    :cond_f
    instance-of v2, v0, La/w3j;

    .line 354
    .line 355
    if-eqz v2, :cond_16

    .line 356
    .line 357
    check-cast v0, La/w3j;

    .line 358
    .line 359
    iget-wide v2, v0, La/w3j;->a:J

    .line 360
    .line 361
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    check-cast v0, La/w5j;

    .line 366
    .line 367
    iget-object v0, v0, La/w5j;->g:Ljava/util/List;

    .line 368
    .line 369
    if-eqz v0, :cond_12

    .line 370
    .line 371
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v4

    .line 379
    if-eqz v4, :cond_11

    .line 380
    .line 381
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    move-object v5, v4

    .line 386
    check-cast v5, La/d4j;

    .line 387
    .line 388
    iget-wide v7, v5, La/d4j;->a:J

    .line 389
    .line 390
    cmp-long v5, v7, v2

    .line 391
    .line 392
    if-nez v5, :cond_10

    .line 393
    .line 394
    move-object v6, v4

    .line 395
    :cond_11
    check-cast v6, La/d4j;

    .line 396
    .line 397
    :cond_12
    if-nez v6, :cond_13

    .line 398
    .line 399
    goto/16 :goto_3

    .line 400
    .line 401
    :cond_13
    iget-object v0, v6, La/d4j;->b:La/oll;

    .line 402
    .line 403
    instance-of v2, v0, La/kll;

    .line 404
    .line 405
    if-eqz v2, :cond_1e

    .line 406
    .line 407
    check-cast v0, La/kll;

    .line 408
    .line 409
    iget-object v2, v0, La/kll;->f:La/pll;

    .line 410
    .line 411
    iget-byte v2, v2, La/pll;->a:B

    .line 412
    .line 413
    iget-boolean v3, v0, La/kll;->a:Z

    .line 414
    .line 415
    iget-boolean v4, v0, La/kll;->b:Z

    .line 416
    .line 417
    if-eqz v4, :cond_14

    .line 418
    .line 419
    if-eqz v3, :cond_14

    .line 420
    .line 421
    invoke-virtual {v1, v9}, La/e6j;->O(La/z3j;)V

    .line 422
    .line 423
    .line 424
    return-void

    .line 425
    :cond_14
    if-eqz v4, :cond_15

    .line 426
    .line 427
    if-nez v3, :cond_15

    .line 428
    .line 429
    new-instance v10, La/t3j;

    .line 430
    .line 431
    sget-object v3, La/sba0;->b:La/jh70;

    .line 432
    .line 433
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    invoke-static {v2}, La/jh70;->f(Ljava/lang/Integer;)La/sba0;

    .line 441
    .line 442
    .line 443
    move-result-object v11

    .line 444
    iget-wide v12, v0, La/kll;->g:J

    .line 445
    .line 446
    iget v14, v0, La/kll;->c:I

    .line 447
    .line 448
    invoke-virtual {v1}, La/e6j;->M()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v15

    .line 452
    invoke-direct/range {v10 .. v15}, La/t3j;-><init>(La/sba0;JILjava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1, v10}, La/e6j;->O(La/z3j;)V

    .line 456
    .line 457
    .line 458
    return-void

    .line 459
    :cond_15
    if-nez v4, :cond_1e

    .line 460
    .line 461
    if-nez v3, :cond_1e

    .line 462
    .line 463
    move v3, v2

    .line 464
    new-instance v2, La/t3j;

    .line 465
    .line 466
    sget-object v4, La/sba0;->b:La/jh70;

    .line 467
    .line 468
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    invoke-static {v3}, La/jh70;->f(Ljava/lang/Integer;)La/sba0;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    iget-wide v4, v0, La/kll;->g:J

    .line 480
    .line 481
    const/4 v6, 0x0

    .line 482
    invoke-virtual {v1}, La/e6j;->M()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v7

    .line 486
    invoke-direct/range {v2 .. v7}, La/t3j;-><init>(La/sba0;JILjava/lang/String;)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v1, v2}, La/e6j;->O(La/z3j;)V

    .line 490
    .line 491
    .line 492
    return-void

    .line 493
    :cond_16
    instance-of v2, v0, La/s3j;

    .line 494
    .line 495
    const-string v9, "dchallenge"

    .line 496
    .line 497
    const/4 v10, 0x1

    .line 498
    if-eqz v2, :cond_17

    .line 499
    .line 500
    check-cast v0, La/s3j;

    .line 501
    .line 502
    iget-wide v2, v0, La/s3j;->a:J

    .line 503
    .line 504
    iget v0, v0, La/s3j;->b:I

    .line 505
    .line 506
    invoke-virtual {v8, v0, v9}, La/b4j;->e(ILjava/lang/String;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v7, v0, v9}, La/je;->c(ILjava/lang/String;)V

    .line 510
    .line 511
    .line 512
    new-instance v0, La/hm1;

    .line 513
    .line 514
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    invoke-direct {v0, v10, v6, v2}, La/hm1;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v4}, La/oeg0;->c()La/i1w0;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    new-instance v3, La/ngh;

    .line 530
    .line 531
    const/16 v4, 0x9

    .line 532
    .line 533
    invoke-direct {v3, v1, v0, v4}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 537
    .line 538
    .line 539
    return-void

    .line 540
    :cond_17
    instance-of v2, v0, La/r3j;

    .line 541
    .line 542
    if-eqz v2, :cond_19

    .line 543
    .line 544
    check-cast v0, La/r3j;

    .line 545
    .line 546
    iget-wide v2, v0, La/r3j;->a:J

    .line 547
    .line 548
    iget-object v0, v1, La/e6j;->F:La/bby;

    .line 549
    .line 550
    if-eqz v0, :cond_18

    .line 551
    .line 552
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    if-ne v0, v10, :cond_18

    .line 557
    .line 558
    goto/16 :goto_3

    .line 559
    .line 560
    :cond_18
    invoke-virtual {v8, v9}, La/b4j;->d(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v7, v9}, La/je;->b(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 567
    .line 568
    .line 569
    move-result-object v11

    .line 570
    new-instance v12, La/y5j;

    .line 571
    .line 572
    invoke-direct {v12, v1, v10}, La/y5j;-><init>(La/e6j;B)V

    .line 573
    .line 574
    .line 575
    iget-object v14, v5, La/mne;->b:La/dvj;

    .line 576
    .line 577
    new-instance v15, La/yg1;

    .line 578
    .line 579
    const/16 v5, 0xa

    .line 580
    .line 581
    move-object v4, v6

    .line 582
    move-object v0, v15

    .line 583
    invoke-direct/range {v0 .. v5}, La/yg1;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 584
    .line 585
    .line 586
    const/16 v16, 0xa

    .line 587
    .line 588
    const/4 v13, 0x0

    .line 589
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    iput-object v0, v1, La/e6j;->F:La/bby;

    .line 594
    .line 595
    return-void

    .line 596
    :cond_19
    instance-of v2, v0, La/t3j;

    .line 597
    .line 598
    const-string v5, "option"

    .line 599
    .line 600
    if-eqz v2, :cond_1a

    .line 601
    .line 602
    check-cast v0, La/t3j;

    .line 603
    .line 604
    iget-object v2, v0, La/t3j;->a:La/sba0;

    .line 605
    .line 606
    iget-wide v9, v0, La/t3j;->b:J

    .line 607
    .line 608
    iget v4, v0, La/t3j;->c:I

    .line 609
    .line 610
    iget-object v0, v0, La/t3j;->d:Ljava/lang/String;

    .line 611
    .line 612
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    iget-object v6, v8, La/b4j;->a:La/kt2;

    .line 616
    .line 617
    new-instance v8, Lkotlin/Pair;

    .line 618
    .line 619
    invoke-direct {v8, v5, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    invoke-static {v8}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 623
    .line 624
    .line 625
    move-result-object v5

    .line 626
    const-string v8, "dchallenge_section_more"

    .line 627
    .line 628
    invoke-interface {v6, v8, v5}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    iget-object v5, v7, La/je;->a:La/s1p;

    .line 635
    .line 636
    new-instance v6, La/j1p;

    .line 637
    .line 638
    invoke-direct {v6, v0, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 639
    .line 640
    .line 641
    invoke-static {v6}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    const-wide/16 v6, 0x2ab7

    .line 646
    .line 647
    invoke-virtual {v5, v0, v6, v7}, La/s1p;->a(Ljava/util/Set;J)V

    .line 648
    .line 649
    .line 650
    new-instance v0, La/t5j;

    .line 651
    .line 652
    invoke-direct {v0, v2, v9, v10, v4}, La/t5j;-><init>(La/sba0;JI)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v1, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 656
    .line 657
    .line 658
    return-void

    .line 659
    :cond_1a
    instance-of v2, v0, La/u3j;

    .line 660
    .line 661
    if-eqz v2, :cond_1b

    .line 662
    .line 663
    iget-object v0, v8, La/b4j;->a:La/kt2;

    .line 664
    .line 665
    const-string v2, "dchallenge_section_prize"

    .line 666
    .line 667
    invoke-interface {v0, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    iget-object v0, v7, La/je;->a:La/s1p;

    .line 671
    .line 672
    const-wide/16 v2, 0x2abb

    .line 673
    .line 674
    sget-object v4, La/xun;->a:La/xun;

    .line 675
    .line 676
    invoke-virtual {v0, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 677
    .line 678
    .line 679
    new-instance v0, La/r5j;

    .line 680
    .line 681
    new-instance v2, La/jr1;

    .line 682
    .line 683
    new-instance v3, La/cvc0;

    .line 684
    .line 685
    sget-object v4, La/d7v;->b:La/d7v;

    .line 686
    .line 687
    invoke-direct {v3, v4}, La/cvc0;-><init>(La/d7v;)V

    .line 688
    .line 689
    .line 690
    invoke-direct {v2, v3}, La/jr1;-><init>(La/fvc0;)V

    .line 691
    .line 692
    .line 693
    invoke-direct {v0, v2}, La/r5j;-><init>(La/jr1;)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v1, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    return-void

    .line 700
    :cond_1b
    instance-of v2, v0, La/v3j;

    .line 701
    .line 702
    if-eqz v2, :cond_1c

    .line 703
    .line 704
    iget-object v0, v8, La/b4j;->a:La/kt2;

    .line 705
    .line 706
    const-string v2, "dchallenge_section_end"

    .line 707
    .line 708
    invoke-interface {v0, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    iget-object v0, v7, La/je;->a:La/s1p;

    .line 712
    .line 713
    const-wide/16 v2, 0x2abc

    .line 714
    .line 715
    sget-object v4, La/xun;->a:La/xun;

    .line 716
    .line 717
    invoke-virtual {v0, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 718
    .line 719
    .line 720
    new-instance v0, La/r5j;

    .line 721
    .line 722
    new-instance v2, La/jr1;

    .line 723
    .line 724
    invoke-direct {v2}, La/jr1;-><init>()V

    .line 725
    .line 726
    .line 727
    invoke-direct {v0, v2}, La/r5j;-><init>(La/jr1;)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v1, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 731
    .line 732
    .line 733
    return-void

    .line 734
    :cond_1c
    instance-of v2, v0, La/x3j;

    .line 735
    .line 736
    if-eqz v2, :cond_1f

    .line 737
    .line 738
    invoke-virtual {v1}, La/e6j;->M()Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    iget-object v1, v8, La/b4j;->a:La/kt2;

    .line 746
    .line 747
    new-instance v2, Lkotlin/Pair;

    .line 748
    .line 749
    invoke-direct {v2, v5, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    invoke-static {v2}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    const-string v5, "dchallenge_section_rules"

    .line 757
    .line 758
    invoke-interface {v1, v5, v2}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 762
    .line 763
    .line 764
    iget-object v1, v7, La/je;->a:La/s1p;

    .line 765
    .line 766
    new-instance v2, La/j1p;

    .line 767
    .line 768
    invoke-direct {v2, v0, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 769
    .line 770
    .line 771
    invoke-static {v2}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    const-wide/16 v5, 0x2ab6

    .line 776
    .line 777
    invoke-virtual {v1, v0, v5, v6}, La/s1p;->a(Ljava/util/Set;J)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v4}, La/oeg0;->c()La/i1w0;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 785
    .line 786
    .line 787
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 788
    .line 789
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 790
    .line 791
    .line 792
    new-instance v2, Lorg/xplatform/aggregator/daily_tasks/impl/navigation/DailyTasksScreens$DailyTasksRulesScreen;

    .line 793
    .line 794
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 795
    .line 796
    .line 797
    instance-of v4, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 798
    .line 799
    if-eqz v4, :cond_1d

    .line 800
    .line 801
    new-instance v4, La/e1w0;

    .line 802
    .line 803
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 804
    .line 805
    invoke-direct {v4, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 806
    .line 807
    .line 808
    new-instance v2, La/c8d;

    .line 809
    .line 810
    sget-object v5, La/y7d;->a:La/v7d;

    .line 811
    .line 812
    invoke-direct {v2, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    goto :goto_1

    .line 819
    :cond_1d
    new-instance v4, La/w0w0;

    .line 820
    .line 821
    invoke-direct {v4, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 822
    .line 823
    .line 824
    new-instance v2, La/c8d;

    .line 825
    .line 826
    sget-object v5, La/y7d;->a:La/v7d;

    .line 827
    .line 828
    invoke-direct {v2, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 829
    .line 830
    .line 831
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    :goto_1
    invoke-static {v0, v1, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 835
    .line 836
    .line 837
    move-result-object v1

    .line 838
    :goto_2
    move-object v2, v1

    .line 839
    check-cast v2, La/paw;

    .line 840
    .line 841
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 842
    .line 843
    .line 844
    move-result v3

    .line 845
    if-eqz v3, :cond_1e

    .line 846
    .line 847
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v2

    .line 851
    check-cast v2, La/oe50;

    .line 852
    .line 853
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 854
    .line 855
    .line 856
    goto :goto_2

    .line 857
    :cond_1e
    :goto_3
    return-void

    .line 858
    :cond_1f
    instance-of v0, v0, La/y3j;

    .line 859
    .line 860
    if-eqz v0, :cond_21

    .line 861
    .line 862
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    check-cast v0, La/w5j;

    .line 867
    .line 868
    iget-boolean v0, v0, La/w5j;->e:Z

    .line 869
    .line 870
    if-eqz v0, :cond_20

    .line 871
    .line 872
    invoke-virtual {v1}, La/e6j;->Q()V

    .line 873
    .line 874
    .line 875
    return-void

    .line 876
    :cond_20
    invoke-virtual {v1}, La/e6j;->N()V

    .line 877
    .line 878
    .line 879
    return-void

    .line 880
    :cond_21
    invoke-static {}, La/t9f;->b()V

    .line 881
    .line 882
    .line 883
    return-void
.end method

.method public final Q()V
    .locals 8

    .line 1
    iget-object v0, p0, La/e6j;->I:La/bby;

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
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v0, p0, La/e6j;->q:La/mne;

    .line 18
    .line 19
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 20
    .line 21
    new-instance v3, La/y5j;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {v3, p0, v0}, La/y5j;-><init>(La/e6j;B)V

    .line 25
    .line 26
    .line 27
    new-instance v6, La/c6j;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-direct {v6, p0, v0, v1}, La/c6j;-><init>(La/e6j;La/yje;B)V

    .line 31
    .line 32
    .line 33
    const/16 v7, 0xa

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/e6j;->I:La/bby;

    .line 41
    .line 42
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    iget-object v0, p0, La/e6j;->I:La/bby;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, La/e6j;->J:La/c4m0;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    iget-object v0, p0, La/e6j;->G:La/c4m0;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 21
    .line 22
    .line 23
    :cond_2
    iget-object p0, p0, La/e6j;->H:La/bby;

    .line 24
    .line 25
    if-eqz p0, :cond_3

    .line 26
    .line 27
    invoke-interface {p0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 28
    .line 29
    .line 30
    :cond_3
    return-void
.end method

.method public final bridge synthetic x(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/z3j;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/e6j;->O(La/z3j;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
