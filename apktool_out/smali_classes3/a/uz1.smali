.class public final La/uz1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/wz1;

.field public j:La/myr0;

.field public k:Z

.field public final synthetic l:Z

.field public final synthetic m:La/wz1;

.field public final synthetic n:J


# direct methods
.method public constructor <init>(ZLa/wz1;JLa/yje;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/uz1;->l:Z

    .line 2
    .line 3
    iput-object p2, p0, La/uz1;->m:La/wz1;

    .line 4
    .line 5
    iput-wide p3, p0, La/uz1;->n:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/uz1;

    .line 2
    .line 3
    iget-object v2, p0, La/uz1;->m:La/wz1;

    .line 4
    .line 5
    iget-wide v3, p0, La/uz1;->n:J

    .line 6
    .line 7
    iget-boolean v1, p0, La/uz1;->l:Z

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, La/uz1;-><init>(ZLa/wz1;JLa/yje;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/uz1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/uz1;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/uz1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/uz1;->k:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, La/uz1;->j:La/myr0;

    .line 12
    .line 13
    iget-object p0, p0, La/uz1;->i:La/wz1;

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v3

    .line 26
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-boolean p1, p0, La/uz1;->l:Z

    .line 30
    .line 31
    iget-wide v4, p0, La/uz1;->n:J

    .line 32
    .line 33
    iget-object v1, p0, La/uz1;->m:La/wz1;

    .line 34
    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    iget-object v6, v1, La/wz1;->r:La/qu;

    .line 38
    .line 39
    iget-object v6, v6, La/qu;->a:La/kt2;

    .line 40
    .line 41
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    new-instance v8, Lkotlin/Pair;

    .line 46
    .line 47
    const-string v9, "tournament_id"

    .line 48
    .line 49
    invoke-direct {v8, v9, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v7, Lkotlin/Pair;

    .line 53
    .line 54
    const-string v9, "screen"

    .line 55
    .line 56
    const-string v10, "tournaments"

    .line 57
    .line 58
    invoke-direct {v7, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    filled-new-array {v8, v7}, [Lkotlin/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-static {v7}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    const-string v8, "tournament_call"

    .line 70
    .line 71
    invoke-interface {v6, v8, v7}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 72
    .line 73
    .line 74
    iget-object v6, v1, La/wz1;->A:La/zr1;

    .line 75
    .line 76
    iget-object v6, v6, La/zr1;->a:La/s1p;

    .line 77
    .line 78
    new-instance v7, La/i1p;

    .line 79
    .line 80
    const/4 v8, 0x2

    .line 81
    invoke-direct {v7, v8, v4, v5}, La/i1p;-><init>(BJ)V

    .line 82
    .line 83
    .line 84
    new-instance v9, La/j1p;

    .line 85
    .line 86
    const/4 v11, 0x0

    .line 87
    invoke-direct {v9, v10, v11}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 88
    .line 89
    .line 90
    new-array v8, v8, [La/k1p;

    .line 91
    .line 92
    aput-object v7, v8, v11

    .line 93
    .line 94
    aput-object v9, v8, v2

    .line 95
    .line 96
    invoke-static {v8}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    const-wide/16 v8, 0xc17

    .line 101
    .line 102
    invoke-virtual {v6, v7, v8, v9}, La/s1p;->a(Ljava/util/Set;J)V

    .line 103
    .line 104
    .line 105
    :cond_2
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    check-cast v6, La/dz1;

    .line 110
    .line 111
    iget-object v6, v6, La/dz1;->l:La/bie;

    .line 112
    .line 113
    instance-of v7, v6, La/vge;

    .line 114
    .line 115
    if-eqz v7, :cond_3

    .line 116
    .line 117
    check-cast v6, La/vge;

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_3
    move-object v6, v3

    .line 121
    :goto_0
    if-eqz v6, :cond_b

    .line 122
    .line 123
    iget-object v6, v6, La/vge;->a:La/a4x;

    .line 124
    .line 125
    if-eqz v6, :cond_b

    .line 126
    .line 127
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_5

    .line 136
    .line 137
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    move-object v8, v7

    .line 142
    check-cast v8, La/myr0;

    .line 143
    .line 144
    iget-wide v8, v8, La/myr0;->a:J

    .line 145
    .line 146
    cmp-long v8, v8, v4

    .line 147
    .line 148
    if-nez v8, :cond_4

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_5
    move-object v7, v3

    .line 152
    :goto_1
    move-object v4, v7

    .line 153
    check-cast v4, La/myr0;

    .line 154
    .line 155
    if-eqz v4, :cond_b

    .line 156
    .line 157
    iget-object v5, v4, La/myr0;->d:La/kyr0;

    .line 158
    .line 159
    instance-of v5, v5, La/jyr0;

    .line 160
    .line 161
    iget-object v6, v1, La/wz1;->z:La/iqt;

    .line 162
    .line 163
    iget-object v6, v6, La/iqt;->a:La/gst0;

    .line 164
    .line 165
    invoke-virtual {v6}, La/gst0;->a()Z

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    if-eqz v6, :cond_6

    .line 170
    .line 171
    invoke-virtual {v1, v4}, La/wz1;->Q(La/myr0;)V

    .line 172
    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_6
    iget-object v6, v4, La/myr0;->b:La/z1s0;

    .line 176
    .line 177
    sget-object v7, La/z1s0;->a:La/z1s0;

    .line 178
    .line 179
    if-ne v6, v7, :cond_7

    .line 180
    .line 181
    invoke-virtual {v1, v4}, La/wz1;->Q(La/myr0;)V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    sget-object v7, La/z1s0;->b:La/z1s0;

    .line 186
    .line 187
    if-ne v6, v7, :cond_8

    .line 188
    .line 189
    if-eqz v5, :cond_8

    .line 190
    .line 191
    invoke-virtual {v1, v4}, La/wz1;->Q(La/myr0;)V

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_8
    if-eqz p1, :cond_a

    .line 196
    .line 197
    iget-object p1, v1, La/wz1;->G:La/ytt;

    .line 198
    .line 199
    sget-object v3, La/aue0;->d:La/aue0;

    .line 200
    .line 201
    iput-object v1, p0, La/uz1;->i:La/wz1;

    .line 202
    .line 203
    iput-object v4, p0, La/uz1;->j:La/myr0;

    .line 204
    .line 205
    iput-boolean v2, p0, La/uz1;->k:Z

    .line 206
    .line 207
    invoke-virtual {p1, v3, p0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    if-ne p0, v0, :cond_9

    .line 212
    .line 213
    return-object v0

    .line 214
    :cond_9
    move-object p0, v1

    .line 215
    move-object v0, v4

    .line 216
    :goto_2
    iget-object p1, p0, La/wz1;->t:La/oeg0;

    .line 217
    .line 218
    invoke-virtual {p1}, La/oeg0;->b()La/i1w0;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    new-instance v1, La/mz1;

    .line 223
    .line 224
    invoke-direct {v1, p0, v0, v2}, La/mz1;-><init>(La/wz1;La/myr0;B)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_a
    move-object p0, v3

    .line 232
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    iget-object p1, v1, La/wz1;->y:La/mne;

    .line 237
    .line 238
    iget-object v6, p1, La/mne;->b:La/dvj;

    .line 239
    .line 240
    move-object v7, v4

    .line 241
    sget-object v4, La/tz1;->a:La/tz1;

    .line 242
    .line 243
    move-object p1, v7

    .line 244
    new-instance v7, La/l1;

    .line 245
    .line 246
    const/16 v0, 0x1d

    .line 247
    .line 248
    invoke-direct {v7, v1, p1, p0, v0}, La/l1;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 249
    .line 250
    .line 251
    const/16 v8, 0xa

    .line 252
    .line 253
    const/4 v5, 0x0

    .line 254
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 255
    .line 256
    .line 257
    :cond_b
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object p0
.end method
