.class public final La/r4b0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/vzg0;

.field public final c:La/i1w0;

.field public final d:La/qv2;

.field public final e:La/vjp;

.field public final f:La/ivn;

.field public final g:La/g2v;

.field public final h:La/lbu;

.field public final i:La/nvu;

.field public final j:La/fvt0;

.field public final k:La/nv20;

.field public final l:La/f4b0;

.field public final m:La/m1e;

.field public final n:La/mne;

.field public final o:La/rkt0;

.field public final p:La/luu;

.field public final q:La/h3c;

.field public final r:La/y3v;

.field public final s:La/xae0;

.field public final t:La/ol60;

.field public final u:La/p7m0;

.field public v:La/c4m0;

.field public w:La/bby;

.field public x:La/bby;

.field public y:Z


# direct methods
.method public constructor <init>(La/vzg0;La/i1w0;La/qv2;La/vjp;La/ivn;La/g2v;La/lbu;La/nvu;La/fvt0;La/nv20;La/f4b0;La/m1e;La/mne;La/rkt0;La/luu;La/h3c;La/y3v;)V
    .locals 0

    .line 1
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/r4b0;->b:La/vzg0;

    .line 8
    .line 9
    iput-object p2, p0, La/r4b0;->c:La/i1w0;

    .line 10
    .line 11
    iput-object p3, p0, La/r4b0;->d:La/qv2;

    .line 12
    .line 13
    iput-object p4, p0, La/r4b0;->e:La/vjp;

    .line 14
    .line 15
    iput-object p5, p0, La/r4b0;->f:La/ivn;

    .line 16
    .line 17
    iput-object p6, p0, La/r4b0;->g:La/g2v;

    .line 18
    .line 19
    iput-object p7, p0, La/r4b0;->h:La/lbu;

    .line 20
    .line 21
    iput-object p8, p0, La/r4b0;->i:La/nvu;

    .line 22
    .line 23
    iput-object p9, p0, La/r4b0;->j:La/fvt0;

    .line 24
    .line 25
    iput-object p10, p0, La/r4b0;->k:La/nv20;

    .line 26
    .line 27
    iput-object p11, p0, La/r4b0;->l:La/f4b0;

    .line 28
    .line 29
    iput-object p12, p0, La/r4b0;->m:La/m1e;

    .line 30
    .line 31
    iput-object p13, p0, La/r4b0;->n:La/mne;

    .line 32
    .line 33
    iput-object p14, p0, La/r4b0;->o:La/rkt0;

    .line 34
    .line 35
    iput-object p15, p0, La/r4b0;->p:La/luu;

    .line 36
    .line 37
    move-object/from16 p2, p16

    .line 38
    .line 39
    iput-object p2, p0, La/r4b0;->q:La/h3c;

    .line 40
    .line 41
    move-object/from16 p2, p17

    .line 42
    .line 43
    iput-object p2, p0, La/r4b0;->r:La/y3v;

    .line 44
    .line 45
    const-string p2, "EXPANDED_IDS_SHARED_KEY"

    .line 46
    .line 47
    sget-object p3, La/xun;->a:La/xun;

    .line 48
    .line 49
    invoke-virtual {p1, p3, p2}, La/vzg0;->c(Ljava/lang/Object;Ljava/lang/String;)La/xae0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, La/r4b0;->s:La/xae0;

    .line 54
    .line 55
    new-instance p1, La/ol60;

    .line 56
    .line 57
    const/4 p2, 0x3

    .line 58
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, La/r4b0;->t:La/ol60;

    .line 62
    .line 63
    new-instance p1, La/l4b0;

    .line 64
    .line 65
    const/4 p2, 0x1

    .line 66
    invoke-direct {p1, p2}, La/l4b0;-><init>(Z)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, La/r4b0;->u:La/p7m0;

    .line 74
    .line 75
    iput-boolean p2, p0, La/r4b0;->y:Z

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final w(La/i4b0;)V
    .locals 13

    .line 1
    iget-object v0, p0, La/r4b0;->u:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/n4b0;

    .line 8
    .line 9
    sget-object v2, La/i4b0;->b:La/i4b0;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne p1, v2, :cond_1

    .line 13
    .line 14
    iget-object v4, p0, La/r4b0;->v:La/c4m0;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    invoke-virtual {v4}, La/pby;->isActive()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-ne v4, v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    instance-of v4, v1, La/k4b0;

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    move-object v4, v1

    .line 30
    check-cast v4, La/k4b0;

    .line 31
    .line 32
    iget-object v4, v4, La/k4b0;->a:Ljava/lang/Throwable;

    .line 33
    .line 34
    invoke-static {v4}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-nez v5, :cond_1

    .line 39
    .line 40
    instance-of v4, v4, La/hr30;

    .line 41
    .line 42
    if-nez v4, :cond_1

    .line 43
    .line 44
    :goto_0
    return-void

    .line 45
    :cond_1
    iget-object v4, p0, La/r4b0;->v:La/c4m0;

    .line 46
    .line 47
    invoke-static {v4}, La/v3c;->N(La/bby;)V

    .line 48
    .line 49
    .line 50
    iget-object v4, p0, La/r4b0;->n:La/mne;

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    const/4 v6, 0x0

    .line 54
    if-ne p1, v2, :cond_4

    .line 55
    .line 56
    instance-of v2, v1, La/k4b0;

    .line 57
    .line 58
    if-nez v2, :cond_2

    .line 59
    .line 60
    instance-of v2, v1, La/m4b0;

    .line 61
    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    :cond_2
    new-instance v1, La/l4b0;

    .line 65
    .line 66
    invoke-direct {v1, v5}, La/l4b0;-><init>(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v6, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, La/r4b0;->x:La/bby;

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-interface {v0, v6}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    iget-object v10, v4, La/mne;->b:La/dvj;

    .line 87
    .line 88
    new-instance v8, La/kma0;

    .line 89
    .line 90
    const/16 v0, 0xd

    .line 91
    .line 92
    invoke-direct {v8, v0}, La/kma0;-><init>(B)V

    .line 93
    .line 94
    .line 95
    new-instance v11, La/q4b0;

    .line 96
    .line 97
    invoke-direct {v11, p0, v6, v5}, La/q4b0;-><init>(La/r4b0;La/yje;B)V

    .line 98
    .line 99
    .line 100
    const/16 v12, 0xa

    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, p0, La/r4b0;->x:La/bby;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    instance-of v1, v1, La/j4b0;

    .line 111
    .line 112
    if-nez v1, :cond_5

    .line 113
    .line 114
    new-instance v1, La/l4b0;

    .line 115
    .line 116
    invoke-direct {v1, v3}, La/l4b0;-><init>(Z)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v6, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    :cond_5
    :goto_1
    sget-object v0, La/i4b0;->a:La/i4b0;

    .line 126
    .line 127
    if-ne p1, v0, :cond_6

    .line 128
    .line 129
    move p1, v3

    .line 130
    goto :goto_2

    .line 131
    :cond_6
    move p1, v5

    .line 132
    :goto_2
    iget-object v0, p0, La/r4b0;->l:La/f4b0;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_8

    .line 139
    .line 140
    if-ne v0, v3, :cond_7

    .line 141
    .line 142
    move v0, v5

    .line 143
    goto :goto_3

    .line 144
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :cond_8
    move v0, v3

    .line 149
    :goto_3
    iget-object v1, p0, La/r4b0;->i:La/nvu;

    .line 150
    .line 151
    invoke-virtual {v1, p1, v0}, La/nvu;->G(ZZ)La/utb;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    new-instance v0, La/p4b0;

    .line 156
    .line 157
    invoke-direct {v0, p0, v6, v5}, La/p4b0;-><init>(La/diu0;La/yje;B)V

    .line 158
    .line 159
    .line 160
    new-instance v1, La/p6d;

    .line 161
    .line 162
    iget-object v2, p0, La/r4b0;->s:La/xae0;

    .line 163
    .line 164
    invoke-direct {v1, p1, v2, v0, v3}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 165
    .line 166
    .line 167
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iget-object v0, v4, La/mne;->b:La/dvj;

    .line 172
    .line 173
    invoke-static {p1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    new-instance v0, La/o4b0;

    .line 178
    .line 179
    invoke-direct {v0, p0, v6, v3}, La/o4b0;-><init>(La/r4b0;La/yje;B)V

    .line 180
    .line 181
    .line 182
    invoke-static {v1, p1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    iput-object p1, p0, La/r4b0;->v:La/c4m0;

    .line 187
    .line 188
    return-void
.end method

.method public final x(J)V
    .locals 2

    .line 1
    iget-object v0, p0, La/r4b0;->s:La/xae0;

    .line 2
    .line 3
    iget-object v0, v0, La/xae0;->a:La/n7m0;

    .line 4
    .line 5
    invoke-interface {v0}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->J0(Ljava/lang/Iterable;)Ljava/util/HashSet;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object p0, p0, La/r4b0;->b:La/vzg0;

    .line 41
    .line 42
    const-string p1, "EXPANDED_IDS_SHARED_KEY"

    .line 43
    .line 44
    invoke-virtual {p0, p1, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
