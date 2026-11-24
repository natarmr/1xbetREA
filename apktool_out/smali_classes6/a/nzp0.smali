.class public final La/nzp0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public final o:La/vzg0;

.field public final p:Ljava/lang/String;

.field public final q:La/i1w0;

.field public final r:La/duj;

.field public final s:La/mne;

.field public final t:La/x4u;

.field public final u:La/psu;

.field public final v:La/osc;

.field public final w:La/psu;

.field public final x:La/b8u;

.field public y:La/bby;


# direct methods
.method public constructor <init>(La/vzg0;Ljava/lang/String;La/i1w0;La/m1e;La/duj;La/ocl;La/ctf0;La/mne;La/x4u;La/psu;La/lsn;La/osc;La/psu;La/b8u;)V
    .locals 8

    .line 1
    move-object/from16 v0, p8

    .line 2
    .line 3
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v3, La/mhp0;

    .line 10
    .line 11
    const/16 v1, 0x1d

    .line 12
    .line 13
    invoke-direct {v3, v1}, La/mhp0;-><init>(B)V

    .line 14
    .line 15
    .line 16
    new-instance v4, La/gpb0;

    .line 17
    .line 18
    const/16 v1, 0xf

    .line 19
    .line 20
    invoke-direct {v4, p6, p7, v1}, La/gpb0;-><init>(La/ocl;La/ctf0;B)V

    .line 21
    .line 22
    .line 23
    iget-object p6, v0, La/mne;->c:La/vs10;

    .line 24
    .line 25
    iget-object v7, v0, La/mne;->b:La/dvj;

    .line 26
    .line 27
    iget-object v1, v0, La/mne;->a:La/rwj;

    .line 28
    .line 29
    invoke-static {p6, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const/4 v6, 0x0

    .line 34
    const/4 v2, 0x0

    .line 35
    move-object v1, p0

    .line 36
    invoke-direct/range {v1 .. v6}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/nzp0;->o:La/vzg0;

    .line 40
    .line 41
    iput-object p2, p0, La/nzp0;->p:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p3, p0, La/nzp0;->q:La/i1w0;

    .line 44
    .line 45
    iput-object p5, p0, La/nzp0;->r:La/duj;

    .line 46
    .line 47
    iput-object v0, p0, La/nzp0;->s:La/mne;

    .line 48
    .line 49
    move-object/from16 p2, p9

    .line 50
    .line 51
    iput-object p2, p0, La/nzp0;->t:La/x4u;

    .line 52
    .line 53
    move-object/from16 p2, p10

    .line 54
    .line 55
    iput-object p2, p0, La/nzp0;->u:La/psu;

    .line 56
    .line 57
    move-object/from16 p2, p12

    .line 58
    .line 59
    iput-object p2, p0, La/nzp0;->v:La/osc;

    .line 60
    .line 61
    move-object/from16 p2, p13

    .line 62
    .line 63
    iput-object p2, p0, La/nzp0;->w:La/psu;

    .line 64
    .line 65
    move-object/from16 p2, p14

    .line 66
    .line 67
    iput-object p2, p0, La/nzp0;->x:La/b8u;

    .line 68
    .line 69
    const-string p2, "KAKOI_KEY"

    .line 70
    .line 71
    invoke-virtual {p1, p2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    const/4 p2, 0x0

    .line 82
    if-nez p1, :cond_0

    .line 83
    .line 84
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance p3, La/mzp0;

    .line 89
    .line 90
    const/4 p5, 0x1

    .line 91
    invoke-direct {p3, p0, p2, p5}, La/mzp0;-><init>(La/nzp0;La/yje;B)V

    .line 92
    .line 93
    .line 94
    const/4 p5, 0x3

    .line 95
    invoke-static {p1, p2, p2, p3, p5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 96
    .line 97
    .line 98
    :cond_0
    move-object/from16 p1, p11

    .line 99
    .line 100
    iget-object p1, p1, La/lsn;->a:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, La/xyp0;

    .line 103
    .line 104
    iget-object p1, p1, La/xyp0;->c:La/typ0;

    .line 105
    .line 106
    iget-object p1, p1, La/typ0;->b:La/p7m0;

    .line 107
    .line 108
    new-instance p3, La/ssl0;

    .line 109
    .line 110
    const/16 p5, 0x14

    .line 111
    .line 112
    invoke-direct {p3, p0, p2, p5}, La/ssl0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 113
    .line 114
    .line 115
    new-instance p5, La/fnq;

    .line 116
    .line 117
    const/4 p6, 0x4

    .line 118
    invoke-direct {p5, p1, p3, p6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 119
    .line 120
    .line 121
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-static {p1, v7}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    new-instance p3, La/p23;

    .line 130
    .line 131
    const/16 v0, 0xd

    .line 132
    .line 133
    const/4 v2, 0x2

    .line 134
    invoke-direct {p3, v2, p2, v0}, La/p23;-><init>(ILa/yje;B)V

    .line 135
    .line 136
    .line 137
    invoke-static {p5, p1, p3}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 138
    .line 139
    .line 140
    invoke-interface {p4}, La/m1e;->b()La/gmq;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    new-instance p3, La/mzp0;

    .line 145
    .line 146
    const/4 p4, 0x0

    .line 147
    invoke-direct {p3, p0, p2, p4}, La/mzp0;-><init>(La/nzp0;La/yje;B)V

    .line 148
    .line 149
    .line 150
    new-instance p2, La/fnq;

    .line 151
    .line 152
    invoke-direct {p2, p1, p3, p6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 153
    .line 154
    .line 155
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-static {p0, v7}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p2, p0}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 164
    .line 165
    .line 166
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 10

    .line 1
    iget-object v0, p0, La/nzp0;->y:La/bby;

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
    check-cast v2, La/fzp0;

    .line 26
    .line 27
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const/16 v9, 0x78

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    invoke-static/range {v2 .. v9}, La/fzp0;->a(La/fzp0;ZZZLa/uyp0;ZLorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;I)La/fzp0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget-object v0, p0, La/nzp0;->s:La/mne;

    .line 55
    .line 56
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 57
    .line 58
    new-instance v3, La/nop0;

    .line 59
    .line 60
    const/16 v0, 0x8

    .line 61
    .line 62
    invoke-direct {v3, p0, v0}, La/nop0;-><init>(Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    new-instance v6, La/mzp0;

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    const/4 v1, 0x2

    .line 69
    invoke-direct {v6, p0, v0, v1}, La/mzp0;-><init>(La/nzp0;La/yje;B)V

    .line 70
    .line 71
    .line 72
    const/16 v7, 0xa

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/nzp0;->y:La/bby;

    .line 80
    .line 81
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/txp0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/qxp0;->a:La/qxp0;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    iget-object v2, p0, La/nzp0;->q:La/i1w0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance p1, La/c8d;

    .line 22
    .line 23
    sget-object v0, La/y7d;->a:La/v7d;

    .line 24
    .line 25
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 26
    .line 27
    invoke-direct {p1, v0, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0, p1, v2, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :goto_0
    move-object p1, p0

    .line 35
    check-cast p1, La/paw;

    .line 36
    .line 37
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, La/oe50;

    .line 48
    .line 49
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    sget-object v0, La/rxp0;->a:La/rxp0;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    const-string p1, "KAKOI_KEY"

    .line 62
    .line 63
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    iget-object v3, p0, La/nzp0;->o:La/vzg0;

    .line 66
    .line 67
    invoke-virtual {v3, p1, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v0, Lorg/xplatform/statistic/tennis/impl/summary/presentation/filters/TennisSummaryFiltersFragmentScreen;

    .line 79
    .line 80
    iget-object p0, p0, La/nzp0;->p:Ljava/lang/String;

    .line 81
    .line 82
    invoke-direct {v0, p0}, Lorg/xplatform/statistic/tennis/impl/summary/presentation/filters/TennisSummaryFiltersFragmentScreen;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    instance-of p0, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 86
    .line 87
    if-eqz p0, :cond_1

    .line 88
    .line 89
    new-instance p0, La/e1w0;

    .line 90
    .line 91
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 92
    .line 93
    invoke-direct {p0, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 94
    .line 95
    .line 96
    new-instance v0, La/c8d;

    .line 97
    .line 98
    sget-object v3, La/y7d;->a:La/v7d;

    .line 99
    .line 100
    invoke-direct {v0, v3, p0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    new-instance p0, La/w0w0;

    .line 108
    .line 109
    invoke-direct {p0, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 110
    .line 111
    .line 112
    new-instance v0, La/c8d;

    .line 113
    .line 114
    sget-object v3, La/y7d;->a:La/v7d;

    .line 115
    .line 116
    invoke-direct {v0, v3, p0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    :goto_1
    invoke-static {v2, p1, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    :goto_2
    move-object p1, p0

    .line 127
    check-cast p1, La/paw;

    .line 128
    .line 129
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_2

    .line 134
    .line 135
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, La/oe50;

    .line 140
    .line 141
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_2
    return-void

    .line 146
    :cond_3
    sget-object v0, La/sxp0;->a:La/sxp0;

    .line 147
    .line 148
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_4

    .line 153
    .line 154
    invoke-virtual {p0}, La/nzp0;->M()V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 159
    .line 160
    .line 161
    return-void
.end method
