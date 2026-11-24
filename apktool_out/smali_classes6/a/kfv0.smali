.class public final La/kfv0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic t:I


# instance fields
.field public final o:La/mne;

.field public final p:La/owp0;

.field public final q:La/lbu;

.field public final r:La/i1w0;

.field public s:La/bby;


# direct methods
.method public constructor <init>(La/mne;La/xsu;La/owp0;La/lbu;La/ctf0;La/i1w0;)V
    .locals 7

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/y9v0;

    .line 8
    .line 9
    const/4 v6, 0x4

    .line 10
    invoke-direct {v2, v6}, La/y9v0;-><init>(B)V

    .line 11
    .line 12
    .line 13
    new-instance v3, La/uwu0;

    .line 14
    .line 15
    invoke-direct {v3, p5, v6}, La/uwu0;-><init>(La/ctf0;B)V

    .line 16
    .line 17
    .line 18
    iget-object p5, p1, La/mne;->c:La/vs10;

    .line 19
    .line 20
    iget-object v0, p1, La/mne;->a:La/rwj;

    .line 21
    .line 22
    invoke-static {p5, v0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v1, 0x0

    .line 28
    move-object v0, p0

    .line 29
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/kfv0;->o:La/mne;

    .line 33
    .line 34
    iput-object p3, v0, La/kfv0;->p:La/owp0;

    .line 35
    .line 36
    iput-object p4, v0, La/kfv0;->q:La/lbu;

    .line 37
    .line 38
    iput-object p6, v0, La/kfv0;->r:La/i1w0;

    .line 39
    .line 40
    iget-object p0, p2, La/xsu;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, La/ikt0;

    .line 43
    .line 44
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, La/pfv0;

    .line 47
    .line 48
    iget-object p0, p0, La/pfv0;->a:La/qoj0;

    .line 49
    .line 50
    new-instance p2, La/va;

    .line 51
    .line 52
    const/16 p3, 0x19

    .line 53
    .line 54
    invoke-direct {p2, p0, p3}, La/va;-><init>(La/qoj0;B)V

    .line 55
    .line 56
    .line 57
    new-instance p0, La/b6o0;

    .line 58
    .line 59
    const/4 p3, 0x0

    .line 60
    invoke-direct {p0, v0, p3, v6}, La/b6o0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 61
    .line 62
    .line 63
    new-instance p3, La/fnq;

    .line 64
    .line 65
    invoke-direct {p3, p2, p0, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 73
    .line 74
    invoke-static {p0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p3, p0}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 79
    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, La/dfv0;

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
    instance-of v0, p1, La/zev0;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, La/kfv0;->s:La/bby;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-interface {p1, v0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object p1, p0, La/kfv0;->o:La/mne;

    .line 26
    .line 27
    iget-object v4, p1, La/mne;->b:La/dvj;

    .line 28
    .line 29
    sget-object v2, La/jfv0;->a:La/jfv0;

    .line 30
    .line 31
    new-instance v5, La/k6s0;

    .line 32
    .line 33
    const/16 p1, 0x19

    .line 34
    .line 35
    invoke-direct {v5, p0, v0, p1}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 36
    .line 37
    .line 38
    const/16 v6, 0xa

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, La/kfv0;->s:La/bby;

    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    instance-of v0, p1, La/yev0;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    instance-of v0, p1, La/afv0;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iget-object p0, p0, La/kfv0;->r:La/i1w0;

    .line 61
    .line 62
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v0, Lorg/xplatform/wild_free_bet/impl/presentation/navigation/WildFreeBetScreens$SelectGameScreen;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    instance-of v1, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    new-instance v1, La/e1w0;

    .line 76
    .line 77
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 78
    .line 79
    invoke-direct {v1, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 80
    .line 81
    .line 82
    new-instance v0, La/c8d;

    .line 83
    .line 84
    sget-object v2, La/y7d;->a:La/v7d;

    .line 85
    .line 86
    invoke-direct {v0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    new-instance v1, La/w0w0;

    .line 94
    .line 95
    invoke-direct {v1, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 96
    .line 97
    .line 98
    new-instance v0, La/c8d;

    .line 99
    .line 100
    sget-object v2, La/y7d;->a:La/v7d;

    .line 101
    .line 102
    invoke-direct {v0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :goto_0
    const/4 v0, 0x0

    .line 109
    invoke-static {p0, p1, v0}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    :goto_1
    move-object v0, p1

    .line 114
    check-cast v0, La/paw;

    .line 115
    .line 116
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_7

    .line 121
    .line 122
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, La/oe50;

    .line 127
    .line 128
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    instance-of v0, p1, La/bfv0;

    .line 133
    .line 134
    iget-object v1, p0, La/kfv0;->p:La/owp0;

    .line 135
    .line 136
    if-eqz v0, :cond_6

    .line 137
    .line 138
    check-cast p1, La/bfv0;

    .line 139
    .line 140
    iget-object p0, p1, La/bfv0;->a:La/wim;

    .line 141
    .line 142
    iget-object p1, p0, La/wim;->b:La/bjm;

    .line 143
    .line 144
    instance-of p1, p1, La/ajm;

    .line 145
    .line 146
    if-eqz p1, :cond_5

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_5
    iget p0, p0, La/wim;->a:I

    .line 150
    .line 151
    int-to-long p0, p0

    .line 152
    iget-object v0, v1, La/owp0;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, La/ikt0;

    .line 155
    .line 156
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, La/pfv0;

    .line 159
    .line 160
    iget-object v0, v0, La/pfv0;->a:La/qoj0;

    .line 161
    .line 162
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {v0, p0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_6
    instance-of p1, p1, La/cfv0;

    .line 171
    .line 172
    if-eqz p1, :cond_8

    .line 173
    .line 174
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    check-cast p0, La/hfv0;

    .line 179
    .line 180
    iget-object p0, p0, La/hfv0;->a:La/pbv;

    .line 181
    .line 182
    if-eqz p0, :cond_7

    .line 183
    .line 184
    iget-wide p0, p0, La/pbv;->a:J

    .line 185
    .line 186
    iget-object v0, v1, La/owp0;->b:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, La/ikt0;

    .line 189
    .line 190
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v0, La/pfv0;

    .line 193
    .line 194
    iget-object v0, v0, La/pfv0;->a:La/qoj0;

    .line 195
    .line 196
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {v0, p0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    :cond_7
    :goto_2
    return-void

    .line 204
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 205
    .line 206
    .line 207
    return-void
.end method
