.class public final La/pm60;
.super La/eiu0;
.source "SourceFile"


# instance fields
.field public final c:La/uf3;

.field public final d:La/hs60;

.field public final e:La/gw60;

.field public final f:La/ix0;

.field public final g:La/ls;

.field public final h:La/mne;

.field public final i:La/xcc;

.field public final j:La/p4u;

.field public final k:La/oeg0;

.field public final l:La/z4u;

.field public final m:La/iqt;

.field public final n:La/dcu;

.field public final o:La/lbu;

.field public final p:La/uxs0;

.field public final q:La/qoj0;

.field public r:La/bby;


# direct methods
.method public constructor <init>(La/uf3;La/hs60;La/gw60;La/ix0;La/ls;La/mne;La/xcc;La/p4u;La/oeg0;La/z4u;La/iqt;La/dcu;La/lbu;La/uxs0;)V
    .locals 0

    .line 1
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/pm60;->c:La/uf3;

    .line 8
    .line 9
    iput-object p2, p0, La/pm60;->d:La/hs60;

    .line 10
    .line 11
    iput-object p3, p0, La/pm60;->e:La/gw60;

    .line 12
    .line 13
    iput-object p4, p0, La/pm60;->f:La/ix0;

    .line 14
    .line 15
    iput-object p5, p0, La/pm60;->g:La/ls;

    .line 16
    .line 17
    iput-object p6, p0, La/pm60;->h:La/mne;

    .line 18
    .line 19
    iput-object p7, p0, La/pm60;->i:La/xcc;

    .line 20
    .line 21
    iput-object p8, p0, La/pm60;->j:La/p4u;

    .line 22
    .line 23
    iput-object p9, p0, La/pm60;->k:La/oeg0;

    .line 24
    .line 25
    iput-object p10, p0, La/pm60;->l:La/z4u;

    .line 26
    .line 27
    iput-object p11, p0, La/pm60;->m:La/iqt;

    .line 28
    .line 29
    iput-object p12, p0, La/pm60;->n:La/dcu;

    .line 30
    .line 31
    iput-object p13, p0, La/pm60;->o:La/lbu;

    .line 32
    .line 33
    iput-object p14, p0, La/pm60;->p:La/uxs0;

    .line 34
    .line 35
    invoke-static {}, La/ckb;->F()La/qoj0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, La/pm60;->q:La/qoj0;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final v(Ljava/lang/Throwable;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/eiu0;->s()La/diu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v0, p0, La/pm60;->h:La/mne;

    .line 10
    .line 11
    iget-object v4, v0, La/mne;->a:La/rwj;

    .line 12
    .line 13
    sget-object v2, La/lm60;->a:La/lm60;

    .line 14
    .line 15
    new-instance v5, La/j940;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    const/16 v3, 0x1c

    .line 19
    .line 20
    invoke-direct {v5, p0, p1, v0, v3}, La/j940;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 21
    .line 22
    .line 23
    const/16 v6, 0xa

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final w(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object p1, p0, La/pm60;->d:La/hs60;

    .line 2
    .line 3
    iget-object p1, p1, La/hs60;->a:La/kt2;

    .line 4
    .line 5
    const-string v0, "games_open_all"

    .line 6
    .line 7
    const-string v1, "screen"

    .line 8
    .line 9
    const-string v2, "main_screen"

    .line 10
    .line 11
    invoke-static {v1, v2, p1, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, La/pm60;->f:La/ix0;

    .line 15
    .line 16
    iget-object p1, p1, La/ix0;->a:La/s1p;

    .line 17
    .line 18
    const-wide/16 v0, 0xbf3

    .line 19
    .line 20
    invoke-static {v2, p1, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, La/pm60;->k:La/oeg0;

    .line 24
    .line 25
    invoke-virtual {p1}, La/oeg0;->c()La/i1w0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object p0, p0, La/pm60;->c:La/uf3;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-virtual {p0, v1}, La/uf3;->e(I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    instance-of v2, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    new-instance v2, La/e1w0;

    .line 45
    .line 46
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 47
    .line 48
    invoke-direct {v2, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 49
    .line 50
    .line 51
    new-instance p0, La/c8d;

    .line 52
    .line 53
    sget-object v3, La/y7d;->a:La/v7d;

    .line 54
    .line 55
    invoke-direct {p0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    new-instance v2, La/w0w0;

    .line 63
    .line 64
    invoke-direct {v2, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 65
    .line 66
    .line 67
    new-instance p0, La/c8d;

    .line 68
    .line 69
    sget-object v3, La/y7d;->a:La/v7d;

    .line 70
    .line 71
    invoke-direct {p0, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    :goto_0
    invoke-static {p1, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    :goto_1
    move-object v0, p0

    .line 82
    check-cast v0, La/paw;

    .line 83
    .line 84
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_1

    .line 89
    .line 90
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, La/oe50;

    .line 95
    .line 96
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    return-void
.end method

.method public final x(La/pbv;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/nm60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/nm60;

    .line 7
    .line 8
    iget v1, v0, La/nm60;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/nm60;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/nm60;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/nm60;-><init>(La/pm60;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/nm60;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/nm60;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, La/nm60;->j:La/i1w0;

    .line 38
    .line 39
    iget-object p1, v0, La/nm60;->i:La/pbv;

    .line 40
    .line 41
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p2, p0, La/pm60;->k:La/oeg0;

    .line 55
    .line 56
    invoke-virtual {p2}, La/oeg0;->c()La/i1w0;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    if-eqz p2, :cond_4

    .line 61
    .line 62
    iget-object v2, p1, La/pbv;->e:La/a570;

    .line 63
    .line 64
    invoke-static {v2}, La/x1x;->D(La/a570;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v5

    .line 68
    iput-object p1, v0, La/nm60;->i:La/pbv;

    .line 69
    .line 70
    iput-object p2, v0, La/nm60;->j:La/i1w0;

    .line 71
    .line 72
    iput v4, v0, La/nm60;->m:I

    .line 73
    .line 74
    iget-object p0, p0, La/pm60;->l:La/z4u;

    .line 75
    .line 76
    invoke-virtual {p0, v5, v6, v0}, La/z4u;->a(JLa/yje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-ne p0, v1, :cond_3

    .line 81
    .line 82
    return-object v1

    .line 83
    :cond_3
    move-object v7, p2

    .line 84
    move-object p2, p0

    .line 85
    move-object p0, v7

    .line 86
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    xor-int/2addr p2, v4

    .line 93
    iget-object p1, p1, La/pbv;->e:La/a570;

    .line 94
    .line 95
    invoke-static {p1}, La/x1x;->D(La/a570;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    const/4 p1, 0x6

    .line 100
    invoke-static {p1, v0, v1, v3}, La/jtv;->M0(IJLa/csr;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-eqz p1, :cond_4

    .line 105
    .line 106
    invoke-static {p0, p0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, p1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object p1, p1, La/ikt0;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, La/c8d;

    .line 117
    .line 118
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 119
    .line 120
    new-instance v2, La/v7d;

    .line 121
    .line 122
    invoke-direct {v2, p2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 123
    .line 124
    .line 125
    iput-object v2, p1, La/c8d;->a:La/w7d;

    .line 126
    .line 127
    iget-object p1, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 128
    .line 129
    const/4 p2, 0x0

    .line 130
    invoke-static {p0, p1, p2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    :goto_2
    move-object p2, p1

    .line 135
    check-cast p2, La/paw;

    .line 136
    .line 137
    invoke-virtual {p2}, La/paw;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_4

    .line 142
    .line 143
    invoke-virtual {p2}, La/paw;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    check-cast p2, La/oe50;

    .line 148
    .line 149
    invoke-virtual {p0, p2}, La/i1w0;->a(La/oe50;)V

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0
.end method

.method public final y(JLa/zje;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v4, p3, La/om60;

    .line 2
    .line 3
    if-eqz v4, :cond_0

    .line 4
    .line 5
    move-object v4, p3

    .line 6
    check-cast v4, La/om60;

    .line 7
    .line 8
    iget v5, v4, La/om60;->n:I

    .line 9
    .line 10
    const/high16 v6, -0x80000000

    .line 11
    .line 12
    and-int v7, v5, v6

    .line 13
    .line 14
    if-eqz v7, :cond_0

    .line 15
    .line 16
    sub-int/2addr v5, v6

    .line 17
    iput v5, v4, La/om60;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v4, La/om60;

    .line 21
    .line 22
    invoke-direct {v4, p0, p3}, La/om60;-><init>(La/pm60;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v0, v4, La/om60;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v5, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v6, v4, La/om60;->n:I

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    if-eqz v6, :cond_2

    .line 33
    .line 34
    if-ne v6, v7, :cond_1

    .line 35
    .line 36
    iget-boolean v2, v4, La/om60;->j:Z

    .line 37
    .line 38
    iget-wide v5, v4, La/om60;->i:J

    .line 39
    .line 40
    iget-object v3, v4, La/om60;->k:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move v4, v2

    .line 46
    move-wide v9, v5

    .line 47
    move-object v5, v3

    .line 48
    move-wide v2, v9

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    return-object v0

    .line 57
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object p4, v4, La/om60;->k:Ljava/lang/String;

    .line 61
    .line 62
    iput-wide p1, v4, La/om60;->i:J

    .line 63
    .line 64
    move/from16 v6, p5

    .line 65
    .line 66
    iput-boolean v6, v4, La/om60;->j:Z

    .line 67
    .line 68
    iput v7, v4, La/om60;->n:I

    .line 69
    .line 70
    iget-object v8, p0, La/pm60;->l:La/z4u;

    .line 71
    .line 72
    invoke-virtual {v8, p1, p2, v4}, La/z4u;->a(JLa/yje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    if-ne v4, v5, :cond_3

    .line 77
    .line 78
    return-object v5

    .line 79
    :cond_3
    move-wide v2, p1

    .line 80
    move-object v5, p4

    .line 81
    move-object v0, v4

    .line 82
    move v4, v6

    .line 83
    :goto_1
    check-cast v0, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    xor-int/lit8 v6, v0, 0x1

    .line 90
    .line 91
    iget-object v0, p0, La/pm60;->k:La/oeg0;

    .line 92
    .line 93
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    new-instance v0, La/k1b;

    .line 98
    .line 99
    const/4 v7, 0x1

    .line 100
    move-object v1, p0

    .line 101
    invoke-direct/range {v0 .. v7}, La/k1b;-><init>(Ljava/lang/Object;JZLjava/lang/String;ZB)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v8, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 105
    .line 106
    .line 107
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object v0
.end method
