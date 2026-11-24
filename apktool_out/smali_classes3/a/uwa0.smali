.class public final La/uwa0;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/i1w0;

.field public final p:La/duj;

.field public final q:La/oeg0;

.field public final r:La/peg0;

.field public final s:La/vqc;

.field public final t:La/erc;

.field public final u:La/xri0;


# direct methods
.method public constructor <init>(La/i1w0;La/duj;La/ctf0;La/oeg0;La/mne;La/peg0;La/vqc;La/erc;La/xri0;La/ntu;La/g5k;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p5, La/mne;->c:La/vs10;

    .line 8
    .line 9
    iget-object v1, p5, La/mne;->a:La/rwj;

    .line 10
    .line 11
    invoke-static {v0, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/qw80;

    .line 16
    .line 17
    const/16 v2, 0x18

    .line 18
    .line 19
    invoke-direct {v1, p11, p10, v2}, La/qw80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    new-instance p10, La/iv80;

    .line 23
    .line 24
    const/4 p11, 0x2

    .line 25
    invoke-direct {p10, p3, p11}, La/iv80;-><init>(La/ctf0;B)V

    .line 26
    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    invoke-direct {p0, v1, v0, p10, p3}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/uwa0;->o:La/i1w0;

    .line 33
    .line 34
    iput-object p2, p0, La/uwa0;->p:La/duj;

    .line 35
    .line 36
    iput-object p4, p0, La/uwa0;->q:La/oeg0;

    .line 37
    .line 38
    iput-object p6, p0, La/uwa0;->r:La/peg0;

    .line 39
    .line 40
    iput-object p7, p0, La/uwa0;->s:La/vqc;

    .line 41
    .line 42
    iput-object p8, p0, La/uwa0;->t:La/erc;

    .line 43
    .line 44
    iput-object p9, p0, La/uwa0;->u:La/xri0;

    .line 45
    .line 46
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 47
    .line 48
    .line 49
    move-result-object p4

    .line 50
    iget-object p7, p5, La/mne;->b:La/dvj;

    .line 51
    .line 52
    new-instance p5, La/yr80;

    .line 53
    .line 54
    const/16 p1, 0x14

    .line 55
    .line 56
    invoke-direct {p5, p0, p1}, La/yr80;-><init>(Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    new-instance p8, La/c670;

    .line 60
    .line 61
    const/16 p1, 0x11

    .line 62
    .line 63
    invoke-direct {p8, p0, p3, p1}, La/c670;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 64
    .line 65
    .line 66
    const/16 p9, 0xa

    .line 67
    .line 68
    const/4 p6, 0x0

    .line 69
    invoke-static/range {p4 .. p9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 70
    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/fwa0;

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
    sget-object v0, La/cwa0;->a:La/cwa0;

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
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    sget-object v0, La/dwa0;->a:La/dwa0;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sget-object v1, La/rwa0;->a:La/rwa0;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    sget-object v0, La/ewa0;->a:La/ewa0;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_7

    .line 42
    .line 43
    iget-object p1, p0, La/uwa0;->u:La/xri0;

    .line 44
    .line 45
    iget-object p1, p1, La/xri0;->a:La/pzu;

    .line 46
    .line 47
    iget-object p1, p1, La/pzu;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, La/h840;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, La/uwa0;->t:La/erc;

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-virtual {p1, v0}, La/erc;->a(Z)V

    .line 58
    .line 59
    .line 60
    new-instance p1, La/jr1;

    .line 61
    .line 62
    new-instance v2, La/cvc0;

    .line 63
    .line 64
    sget-object v3, La/d7v;->c:La/d7v;

    .line 65
    .line 66
    invoke-direct {v2, v3}, La/cvc0;-><init>(La/d7v;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, v2}, La/jr1;-><init>(La/fvc0;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, La/uwa0;->r:La/peg0;

    .line 73
    .line 74
    invoke-virtual {v2, p1}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, La/uwa0;->q:La/oeg0;

    .line 82
    .line 83
    iget-object v1, v1, La/oeg0;->a:Ljava/util/LinkedHashMap;

    .line 84
    .line 85
    sget-object v2, La/ehg0;->a:La/ehg0;

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, La/chg0;

    .line 92
    .line 93
    if-eqz v1, :cond_2

    .line 94
    .line 95
    iget-object v1, v1, La/chg0;->a:La/i1w0;

    .line 96
    .line 97
    if-nez v1, :cond_3

    .line 98
    .line 99
    :cond_2
    sget-object v1, La/p1w0;->h:La/p1w0;

    .line 100
    .line 101
    :cond_3
    sget-object v2, La/p1w0;->h:La/p1w0;

    .line 102
    .line 103
    iget-object p0, p0, La/uwa0;->o:La/i1w0;

    .line 104
    .line 105
    if-eq v1, v2, :cond_4

    .line 106
    .line 107
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    new-instance v2, La/d1w0;

    .line 112
    .line 113
    invoke-direct {v2, p1}, La/d1w0;-><init>(La/m7h0;)V

    .line 114
    .line 115
    .line 116
    new-instance p1, La/c8d;

    .line 117
    .line 118
    sget-object v3, La/y7d;->a:La/v7d;

    .line 119
    .line 120
    invoke-direct {p1, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v1, p1, p0, v1, v0}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    :goto_0
    move-object v0, p1

    .line 128
    check-cast v0, La/paw;

    .line 129
    .line 130
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_6

    .line 135
    .line 136
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, La/oe50;

    .line 141
    .line 142
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_4
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    instance-of v2, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 151
    .line 152
    if-eqz v2, :cond_5

    .line 153
    .line 154
    new-instance v2, La/e1w0;

    .line 155
    .line 156
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 157
    .line 158
    invoke-direct {v2, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 159
    .line 160
    .line 161
    new-instance p1, La/c8d;

    .line 162
    .line 163
    sget-object v3, La/y7d;->a:La/v7d;

    .line 164
    .line 165
    invoke-direct {p1, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_5
    new-instance v2, La/w0w0;

    .line 173
    .line 174
    invoke-direct {v2, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 175
    .line 176
    .line 177
    new-instance p1, La/c8d;

    .line 178
    .line 179
    sget-object v3, La/y7d;->a:La/v7d;

    .line 180
    .line 181
    invoke-direct {p1, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    :goto_1
    invoke-static {p0, v1, v0}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    :goto_2
    move-object v0, p1

    .line 192
    check-cast v0, La/paw;

    .line 193
    .line 194
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-eqz v1, :cond_6

    .line 199
    .line 200
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    check-cast v0, La/oe50;

    .line 205
    .line 206
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_6
    return-void

    .line 211
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 212
    .line 213
    .line 214
    return-void
.end method
