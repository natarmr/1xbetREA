.class public final La/ph10;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic B:I


# instance fields
.field public A:La/bby;

.field public final o:La/mne;

.field public final p:La/p4u;

.field public final q:La/xfu;

.field public final r:La/lrc;

.field public final s:La/x0u;

.field public final t:La/ctf0;

.field public final u:La/gle0;

.field public final v:La/zg;

.field public final w:La/au0;

.field public final x:La/duj;

.field public final y:La/c4m0;

.field public z:La/bby;


# direct methods
.method public constructor <init>(Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;La/mne;La/p4u;La/xfu;La/lrc;La/yfu;La/bzt;La/wgu;La/x0u;La/ctf0;La/gle0;La/zg;La/au0;La/m1e;La/uf3;La/duj;La/z7z;La/z7z;)V
    .locals 10

    .line 1
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p14 .. p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p18 .. p18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p2, La/mne;->a:La/rwj;

    .line 17
    .line 18
    invoke-static {v0, v0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 19
    .line 20
    .line 21
    move-result-object v9

    .line 22
    new-instance v0, La/nf10;

    .line 23
    .line 24
    const/4 v8, 0x1

    .line 25
    move-object v5, p1

    .line 26
    move-object/from16 v2, p6

    .line 27
    .line 28
    move-object/from16 v3, p7

    .line 29
    .line 30
    move-object/from16 v4, p8

    .line 31
    .line 32
    move-object/from16 v1, p10

    .line 33
    .line 34
    move-object/from16 v6, p17

    .line 35
    .line 36
    move-object/from16 v7, p18

    .line 37
    .line 38
    invoke-direct/range {v0 .. v8}, La/nf10;-><init>(La/ctf0;La/yfu;La/bzt;La/wgu;Lorg/xplatform/aggregator/loyalty_program/api/navigation/models/LoyaltyProgramScreenParams;La/z7z;La/z7z;B)V

    .line 39
    .line 40
    .line 41
    new-instance p1, La/v510;

    .line 42
    .line 43
    const/4 v2, 0x2

    .line 44
    invoke-direct {p1, v1, v2}, La/v510;-><init>(La/ctf0;B)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {p0, v0, v9, p1, v2}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, La/ph10;->o:La/mne;

    .line 52
    .line 53
    iput-object p3, p0, La/ph10;->p:La/p4u;

    .line 54
    .line 55
    iput-object p4, p0, La/ph10;->q:La/xfu;

    .line 56
    .line 57
    iput-object p5, p0, La/ph10;->r:La/lrc;

    .line 58
    .line 59
    move-object/from16 p1, p9

    .line 60
    .line 61
    iput-object p1, p0, La/ph10;->s:La/x0u;

    .line 62
    .line 63
    iput-object v1, p0, La/ph10;->t:La/ctf0;

    .line 64
    .line 65
    move-object/from16 p1, p11

    .line 66
    .line 67
    iput-object p1, p0, La/ph10;->u:La/gle0;

    .line 68
    .line 69
    move-object/from16 p1, p12

    .line 70
    .line 71
    iput-object p1, p0, La/ph10;->v:La/zg;

    .line 72
    .line 73
    move-object/from16 p1, p13

    .line 74
    .line 75
    iput-object p1, p0, La/ph10;->w:La/au0;

    .line 76
    .line 77
    move-object/from16 p1, p16

    .line 78
    .line 79
    iput-object p1, p0, La/ph10;->x:La/duj;

    .line 80
    .line 81
    invoke-virtual {p0}, La/ph10;->M()V

    .line 82
    .line 83
    .line 84
    iget-object p1, p0, La/ph10;->y:La/c4m0;

    .line 85
    .line 86
    const/4 p3, 0x1

    .line 87
    if-eqz p1, :cond_0

    .line 88
    .line 89
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-ne p1, p3, :cond_0

    .line 94
    .line 95
    return-void

    .line 96
    :cond_0
    invoke-interface/range {p14 .. p14}, La/m1e;->b()La/gmq;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {p1, p3}, La/dtb;->z(La/gmq;I)La/lnq;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance p3, La/slx;

    .line 105
    .line 106
    const/16 p4, 0x19

    .line 107
    .line 108
    invoke-direct {p3, p0, v2, p4}, La/slx;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 109
    .line 110
    .line 111
    new-instance p4, La/fnq;

    .line 112
    .line 113
    const/4 v0, 0x4

    .line 114
    invoke-direct {p4, p1, p3, v0}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 115
    .line 116
    .line 117
    sget-object p1, La/oh10;->h:La/oh10;

    .line 118
    .line 119
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    iget-object p2, p2, La/mne;->b:La/dvj;

    .line 124
    .line 125
    invoke-static {p3, p2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-static {p4, p2, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iput-object p1, p0, La/ph10;->y:La/c4m0;

    .line 134
    .line 135
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 10

    .line 1
    iget-object v0, p0, La/ph10;->z:La/bby;

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
    iget-object v0, p0, La/ph10;->o:La/mne;

    .line 14
    .line 15
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 16
    .line 17
    new-instance v2, La/pf10;

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x3

    .line 21
    const/4 v3, 0x1

    .line 22
    const-class v5, La/ph10;

    .line 23
    .line 24
    const-string v6, "handleContentError"

    .line 25
    .line 26
    const-string v7, "handleContentError(Ljava/lang/Throwable;)V"

    .line 27
    .line 28
    move-object v4, p0

    .line 29
    invoke-direct/range {v2 .. v9}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 30
    .line 31
    .line 32
    new-instance p0, La/qf10;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-direct {p0, v4, v3, v1}, La/qf10;-><init>(La/i3t0;La/yje;B)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v0, v2, p0}, La/i3t0;->I(La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/bby;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    iput-object p0, v4, La/ph10;->z:La/bby;

    .line 43
    .line 44
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 10

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/eg10;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-super {p0, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    instance-of v1, v0, La/yf10;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    iget-object v4, p0, La/ph10;->w:La/au0;

    .line 14
    .line 15
    iget-object v5, p0, La/ph10;->v:La/zg;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, La/gh10;

    .line 24
    .line 25
    iget-object v0, v0, La/gh10;->d:La/jg10;

    .line 26
    .line 27
    instance-of v0, v0, La/gg10;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const-string v0, "back"

    .line 32
    .line 33
    invoke-virtual {v5, v0}, La/zg;->l(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, La/k51;->a:La/k51;

    .line 37
    .line 38
    invoke-virtual {v4, v0}, La/au0;->q(La/k51;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, La/gh10;

    .line 46
    .line 47
    iget-object v0, v0, La/gh10;->f:La/i1w0;

    .line 48
    .line 49
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    new-instance v2, La/c8d;

    .line 54
    .line 55
    sget-object v4, La/y7d;->a:La/v7d;

    .line 56
    .line 57
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 58
    .line 59
    invoke-direct {v2, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v2, v0, v1, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :goto_0
    move-object v2, v1

    .line 67
    check-cast v2, La/paw;

    .line 68
    .line 69
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_7

    .line 74
    .line 75
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, La/oe50;

    .line 80
    .line 81
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    instance-of v1, v0, La/zf10;

    .line 86
    .line 87
    iget-object v6, p0, La/ph10;->o:La/mne;

    .line 88
    .line 89
    const/4 v7, 0x1

    .line 90
    const/4 v8, 0x0

    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    iget-object v0, p0, La/ph10;->A:La/bby;

    .line 94
    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-ne v0, v7, :cond_2

    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :cond_2
    iget-object v9, v6, La/mne;->b:La/dvj;

    .line 106
    .line 107
    new-instance v0, La/pf10;

    .line 108
    .line 109
    const/4 v6, 0x0

    .line 110
    const/4 v7, 0x2

    .line 111
    const/4 v1, 0x1

    .line 112
    const-class v3, La/ph10;

    .line 113
    .line 114
    const-string v4, "handleClaimCashbackError"

    .line 115
    .line 116
    const-string v5, "handleClaimCashbackError(Ljava/lang/Throwable;)V"

    .line 117
    .line 118
    move-object v2, p0

    .line 119
    invoke-direct/range {v0 .. v7}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 120
    .line 121
    .line 122
    new-instance v1, La/epp;

    .line 123
    .line 124
    const/16 v3, 0xf

    .line 125
    .line 126
    invoke-direct {v1, p0, v8, v3}, La/epp;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v9, v0, v1}, La/i3t0;->I(La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/bby;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iput-object v0, p0, La/ph10;->A:La/bby;

    .line 134
    .line 135
    return-void

    .line 136
    :cond_3
    instance-of v1, v0, La/bg10;

    .line 137
    .line 138
    if-eqz v1, :cond_4

    .line 139
    .line 140
    iget-object v0, v5, La/zg;->a:La/kt2;

    .line 141
    .line 142
    const-string v1, "promo_VIP_cashback_rules"

    .line 143
    .line 144
    const-string v5, "screen"

    .line 145
    .line 146
    const-string v6, "cashback"

    .line 147
    .line 148
    invoke-static {v5, v6, v0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    sget-object v0, La/y1p;->b:La/y1p;

    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget-object v0, v4, La/au0;->a:La/s1p;

    .line 157
    .line 158
    new-instance v1, La/j1p;

    .line 159
    .line 160
    invoke-direct {v1, v6, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 161
    .line 162
    .line 163
    invoke-static {v1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    const-wide/16 v3, 0xcf3

    .line 168
    .line 169
    invoke-virtual {v0, v1, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, La/gh10;

    .line 177
    .line 178
    iget-object v0, v0, La/gh10;->f:La/i1w0;

    .line 179
    .line 180
    new-instance v1, La/nh10;

    .line 181
    .line 182
    invoke-direct {v1, p0, v7}, La/nh10;-><init>(La/ph10;B)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_4
    instance-of v1, v0, La/ag10;

    .line 190
    .line 191
    if-eqz v1, :cond_6

    .line 192
    .line 193
    iget-object v0, p0, La/ph10;->z:La/bby;

    .line 194
    .line 195
    if-eqz v0, :cond_5

    .line 196
    .line 197
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-ne v0, v7, :cond_5

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_5
    iget-object v0, v6, La/mne;->b:La/dvj;

    .line 205
    .line 206
    new-instance v1, La/nh10;

    .line 207
    .line 208
    invoke-direct {v1, p0, v3}, La/nh10;-><init>(La/ph10;B)V

    .line 209
    .line 210
    .line 211
    new-instance v3, La/ffd;

    .line 212
    .line 213
    const/16 v4, 0x13

    .line 214
    .line 215
    invoke-direct {v3, p0, v8, v4}, La/ffd;-><init>(La/diu0;La/yje;B)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0, v0, v1, v3}, La/i3t0;->I(La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/bby;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    iput-object v0, p0, La/ph10;->z:La/bby;

    .line 223
    .line 224
    return-void

    .line 225
    :cond_6
    instance-of v1, v0, La/cg10;

    .line 226
    .line 227
    if-nez v1, :cond_a

    .line 228
    .line 229
    instance-of v1, v0, La/dg10;

    .line 230
    .line 231
    if-eqz v1, :cond_8

    .line 232
    .line 233
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    check-cast v0, La/gh10;

    .line 238
    .line 239
    iget-object v0, v0, La/gh10;->d:La/jg10;

    .line 240
    .line 241
    instance-of v0, v0, La/gg10;

    .line 242
    .line 243
    if-eqz v0, :cond_7

    .line 244
    .line 245
    const-string v0, "try_again"

    .line 246
    .line 247
    invoke-virtual {v5, v0}, La/zg;->l(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    sget-object v0, La/k51;->b:La/k51;

    .line 251
    .line 252
    invoke-virtual {v4, v0}, La/au0;->q(La/k51;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0}, La/ph10;->M()V

    .line 256
    .line 257
    .line 258
    :cond_7
    :goto_1
    return-void

    .line 259
    :cond_8
    instance-of v0, v0, La/xf10;

    .line 260
    .line 261
    if-eqz v0, :cond_9

    .line 262
    .line 263
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :cond_a
    throw v8
.end method
