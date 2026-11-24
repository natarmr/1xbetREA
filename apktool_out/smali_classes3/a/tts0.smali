.class public final La/tts0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final o:La/i1w0;

.field public final p:La/mne;

.field public final q:La/g2v;

.field public final r:La/m0u;

.field public final s:La/ahu;

.field public final t:La/gle0;

.field public u:La/bby;

.field public final v:La/c4m0;


# direct methods
.method public constructor <init>(La/i1w0;La/mne;La/g2v;La/m0u;La/ahu;La/bzt;La/gle0;La/m1e;Ljava/lang/String;ZLa/ctf0;)V
    .locals 3

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, La/mne;->c:La/vs10;

    .line 8
    .line 9
    iget-object v1, p2, La/mne;->a:La/rwj;

    .line 10
    .line 11
    invoke-static {v0, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/lf2;

    .line 16
    .line 17
    const/16 v2, 0xc

    .line 18
    .line 19
    invoke-direct {v1, p10, p6, p9, v2}, La/lf2;-><init>(ZLjava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    new-instance p6, La/h0j0;

    .line 23
    .line 24
    const/16 p9, 0x1d

    .line 25
    .line 26
    invoke-direct {p6, p11, p9}, La/h0j0;-><init>(La/ctf0;B)V

    .line 27
    .line 28
    .line 29
    const/4 p9, 0x0

    .line 30
    invoke-direct {p0, v1, v0, p6, p9}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, La/tts0;->o:La/i1w0;

    .line 34
    .line 35
    iput-object p2, p0, La/tts0;->p:La/mne;

    .line 36
    .line 37
    iput-object p3, p0, La/tts0;->q:La/g2v;

    .line 38
    .line 39
    iput-object p4, p0, La/tts0;->r:La/m0u;

    .line 40
    .line 41
    iput-object p5, p0, La/tts0;->s:La/ahu;

    .line 42
    .line 43
    iput-object p7, p0, La/tts0;->t:La/gle0;

    .line 44
    .line 45
    iget-object p1, p0, La/tts0;->v:La/c4m0;

    .line 46
    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/4 p3, 0x1

    .line 54
    if-ne p1, p3, :cond_0

    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    invoke-interface {p8}, La/m1e;->b()La/gmq;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p3, La/k6s0;

    .line 62
    .line 63
    const/4 p4, 0x6

    .line 64
    invoke-direct {p3, p0, p9, p4}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 65
    .line 66
    .line 67
    new-instance p4, La/fnq;

    .line 68
    .line 69
    const/4 p5, 0x4

    .line 70
    invoke-direct {p4, p1, p3, p5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 71
    .line 72
    .line 73
    sget-object p1, La/sts0;->h:La/sts0;

    .line 74
    .line 75
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    iget-object p2, p2, La/mne;->b:La/dvj;

    .line 80
    .line 81
    invoke-static {p3, p2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-static {p4, p2, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p0, La/tts0;->v:La/c4m0;

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 9

    .line 1
    iget-object v0, p0, La/tts0;->u:La/bby;

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
    check-cast v2, La/fts0;

    .line 26
    .line 27
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    const/16 v8, 0xf5

    .line 34
    .line 35
    sget-object v3, La/hts0;->a:La/hts0;

    .line 36
    .line 37
    const-wide/16 v4, 0x0

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-static/range {v2 .. v8}, La/fts0;->a(La/fts0;La/its0;JZLjava/lang/String;I)La/fts0;

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
    iget-object v0, p0, La/tts0;->p:La/mne;

    .line 55
    .line 56
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 57
    .line 58
    new-instance v3, La/rts0;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-direct {v3, p0, v0}, La/rts0;-><init>(La/tts0;B)V

    .line 62
    .line 63
    .line 64
    new-instance v6, La/jc1;

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    const/16 v1, 0xb

    .line 68
    .line 69
    invoke-direct {v6, p0, v0, v1}, La/jc1;-><init>(Ljava/lang/Object;La/yje;B)V

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
    iput-object v0, p0, La/tts0;->u:La/bby;

    .line 80
    .line 81
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 9

    .line 1
    check-cast p1, La/jss0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/fss0;->a:La/fss0;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, La/tts0;->o:La/i1w0;

    .line 15
    .line 16
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, La/c8d;

    .line 21
    .line 22
    sget-object v1, La/y7d;->a:La/v7d;

    .line 23
    .line 24
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    move-object v0, p1

    .line 35
    check-cast v0, La/paw;

    .line 36
    .line 37
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/oe50;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-void

    .line 54
    :cond_1
    sget-object v0, La/gss0;->a:La/gss0;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, La/tts0;->M()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    sget-object v0, La/hss0;->a:La/hss0;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-object p1, p0, La/tts0;->u:La/bby;

    .line 79
    .line 80
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    iget-object p1, p0, La/tts0;->p:La/mne;

    .line 85
    .line 86
    iget-object v4, p1, La/mne;->b:La/dvj;

    .line 87
    .line 88
    new-instance v7, La/wup0;

    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    const/4 v0, 0x6

    .line 92
    invoke-direct {v7, p0, p1, v0}, La/wup0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 93
    .line 94
    .line 95
    const/16 v8, 0x38

    .line 96
    .line 97
    const/4 v2, 0x0

    .line 98
    const/4 v5, 0x0

    .line 99
    const/4 v6, 0x0

    .line 100
    invoke-static/range {v1 .. v8}, La/bww;->R(La/bvc;La/bby;Ljava/util/List;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    instance-of v0, p1, La/iss0;

    .line 105
    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 109
    .line 110
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 111
    .line 112
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-object v2, v1

    .line 120
    check-cast v2, La/fts0;

    .line 121
    .line 122
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-object v3, p1

    .line 128
    check-cast v3, La/iss0;

    .line 129
    .line 130
    iget-wide v4, v3, La/iss0;->a:J

    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    const/16 v8, 0xfb

    .line 134
    .line 135
    const/4 v3, 0x0

    .line 136
    const/4 v6, 0x0

    .line 137
    invoke-static/range {v2 .. v8}, La/fts0;->a(La/fts0;La/its0;JZLjava/lang/String;I)La/fts0;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_4

    .line 146
    .line 147
    return-void

    .line 148
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 149
    .line 150
    .line 151
    return-void
.end method
