.class public final La/ota0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic t:I


# instance fields
.field public final o:La/n4u;

.field public final p:La/drc;

.field public final q:La/duj;

.field public final r:La/mne;

.field public s:La/bby;


# direct methods
.method public constructor <init>(La/n4u;La/ocl;La/drc;La/xfu;La/duj;La/mne;)V
    .locals 6

    .line 1
    new-instance v2, La/ssa0;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {v2, p4, v0}, La/ssa0;-><init>(Ljava/lang/Object;B)V

    .line 5
    .line 6
    .line 7
    new-instance v3, La/yar;

    .line 8
    .line 9
    const/16 p4, 0xa

    .line 10
    .line 11
    invoke-direct {v3, p2, p4}, La/yar;-><init>(La/ocl;B)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p6, La/mne;->c:La/vs10;

    .line 15
    .line 16
    iget-object p4, p6, La/mne;->a:La/rwj;

    .line 17
    .line 18
    invoke-static {p2, p4}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v1, 0x0

    .line 24
    move-object v0, p0

    .line 25
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v0, La/ota0;->o:La/n4u;

    .line 29
    .line 30
    iput-object p3, v0, La/ota0;->p:La/drc;

    .line 31
    .line 32
    iput-object p5, v0, La/ota0;->q:La/duj;

    .line 33
    .line 34
    iput-object p6, v0, La/ota0;->r:La/mne;

    .line 35
    .line 36
    invoke-virtual {v0}, La/ota0;->M()V

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 10

    .line 1
    iget-object v0, p0, La/ota0;->s:La/bby;

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
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La/hua0;

    .line 18
    .line 19
    iget-object v0, v0, La/hua0;->a:Ljava/util/List;

    .line 20
    .line 21
    new-instance v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v3, 0xa

    .line 24
    .line 25
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, La/yv20;

    .line 47
    .line 48
    iget-wide v3, v3, La/yv20;->c:J

    .line 49
    .line 50
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    const/4 v3, 0x0

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 66
    .line 67
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 68
    .line 69
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-object v4, v2

    .line 77
    check-cast v4, La/hua0;

    .line 78
    .line 79
    iget-object v5, p0, La/i3t0;->f:La/oyg0;

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    const/4 v5, 0x5

    .line 85
    invoke-static {v4, v3, v1, v5}, La/hua0;->a(La/hua0;Ljava/util/List;ZI)La/hua0;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v0, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-eqz v2, :cond_2

    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    iget-object v0, p0, La/ota0;->r:La/mne;

    .line 101
    .line 102
    iget-object v7, v0, La/mne;->b:La/dvj;

    .line 103
    .line 104
    new-instance v5, La/yr80;

    .line 105
    .line 106
    const/16 v0, 0x11

    .line 107
    .line 108
    invoke-direct {v5, p0, v0}, La/yr80;-><init>(Ljava/lang/Object;B)V

    .line 109
    .line 110
    .line 111
    new-instance v8, La/o690;

    .line 112
    .line 113
    const/16 v0, 0x9

    .line 114
    .line 115
    invoke-direct {v8, p0, v2, v3, v0}, La/o690;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 116
    .line 117
    .line 118
    const/16 v9, 0xa

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iput-object v0, p0, La/ota0;->s:La/bby;

    .line 126
    .line 127
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, La/yqa0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/dqa0;->a:La/dqa0;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, La/ota0;->p:La/drc;

    .line 15
    .line 16
    iget-object p0, p0, La/drc;->a:La/nr00;

    .line 17
    .line 18
    iget-object p0, p0, La/nr00;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/xv20;

    .line 21
    .line 22
    iget-object p0, p0, La/xv20;->a:La/p7m0;

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    sget-object v0, La/lqa0;->a:La/lqa0;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, La/ota0;->M()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 42
    .line 43
    .line 44
    return-void
.end method
