.class public final La/w400;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic x:I


# instance fields
.field public final o:La/shu;

.field public final p:La/wgu;

.field public final q:La/i1w0;

.field public final r:La/mne;

.field public final s:La/duj;

.field public final t:La/pru;

.field public final u:La/evz;

.field public final v:La/c4m0;

.field public w:La/bby;


# direct methods
.method public constructor <init>(La/vzg0;La/shu;La/wgu;La/i1w0;La/m1e;La/ctf0;La/mne;La/duj;La/pru;La/evz;La/ocl;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, La/zwz;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, p9, v1}, La/zwz;-><init>(La/pru;B)V

    .line 17
    .line 18
    .line 19
    new-instance v2, La/cz;

    .line 20
    .line 21
    const/16 v3, 0x14

    .line 22
    .line 23
    invoke-direct {v2, p6, p11, v3}, La/cz;-><init>(La/ctf0;La/ocl;B)V

    .line 24
    .line 25
    .line 26
    iget-object p6, p7, La/mne;->c:La/vs10;

    .line 27
    .line 28
    iget-object p11, p7, La/mne;->a:La/rwj;

    .line 29
    .line 30
    invoke-static {p6, p11}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 31
    .line 32
    .line 33
    move-result-object p6

    .line 34
    invoke-direct {p0, p1, v0, v2, p6}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/g090;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, La/w400;->o:La/shu;

    .line 38
    .line 39
    iput-object p3, p0, La/w400;->p:La/wgu;

    .line 40
    .line 41
    iput-object p4, p0, La/w400;->q:La/i1w0;

    .line 42
    .line 43
    iput-object p7, p0, La/w400;->r:La/mne;

    .line 44
    .line 45
    iput-object p8, p0, La/w400;->s:La/duj;

    .line 46
    .line 47
    iput-object p9, p0, La/w400;->t:La/pru;

    .line 48
    .line 49
    iput-object p10, p0, La/w400;->u:La/evz;

    .line 50
    .line 51
    iget-object p1, p0, La/w400;->v:La/c4m0;

    .line 52
    .line 53
    if-eqz p1, :cond_0

    .line 54
    .line 55
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-ne p1, v1, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-interface {p5}, La/m1e;->a()La/gmq;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance p2, La/slx;

    .line 67
    .line 68
    const/4 p3, 0x0

    .line 69
    const/16 p4, 0xe

    .line 70
    .line 71
    invoke-direct {p2, p0, p3, p4}, La/slx;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 72
    .line 73
    .line 74
    new-instance p3, La/fnq;

    .line 75
    .line 76
    const/4 p4, 0x4

    .line 77
    invoke-direct {p3, p1, p2, p4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 78
    .line 79
    .line 80
    sget-object p1, La/v400;->h:La/v400;

    .line 81
    .line 82
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-static {p2, p11}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-static {p3, p2, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, p0, La/w400;->v:La/c4m0;

    .line 95
    .line 96
    :goto_0
    invoke-virtual {p0}, La/w400;->M()V

    .line 97
    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 5

    .line 1
    iget-object v0, p0, La/w400;->w:La/bby;

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
    iget-object v0, p0, La/w400;->r:La/mne;

    .line 14
    .line 15
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 16
    .line 17
    new-instance v1, La/ebz;

    .line 18
    .line 19
    const/16 v2, 0x16

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/epp;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/16 v4, 0xd

    .line 28
    .line 29
    invoke-direct {v2, p0, v3, v4}, La/epp;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0, v1, v2}, La/i3t0;->I(La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/bby;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/w400;->w:La/bby;

    .line 37
    .line 38
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 8

    .line 1
    check-cast p1, La/x300;

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
    sget-object v0, La/s300;->a:La/s300;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    iget-object v2, p0, La/w400;->q:La/i1w0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance p1, La/c8d;

    .line 25
    .line 26
    sget-object v0, La/y7d;->a:La/v7d;

    .line 27
    .line 28
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 29
    .line 30
    invoke-direct {p1, v0, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p1, v2, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    move-object p1, p0

    .line 38
    check-cast p1, La/paw;

    .line 39
    .line 40
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_9

    .line 45
    .line 46
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, La/oe50;

    .line 51
    .line 52
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    sget-object v0, La/v300;->a:La/v300;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0}, La/w400;->M()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    sget-object v0, La/u300;->a:La/u300;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-virtual {p0}, La/w400;->M()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_2
    sget-object v0, La/r300;->a:La/r300;

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    instance-of v0, p1, La/t300;

    .line 93
    .line 94
    if-eqz v0, :cond_a

    .line 95
    .line 96
    check-cast p1, La/t300;

    .line 97
    .line 98
    iget-object p1, p1, La/t300;->a:La/xrz;

    .line 99
    .line 100
    instance-of v0, p1, La/pki0;

    .line 101
    .line 102
    iget-object v3, p0, La/w400;->u:La/evz;

    .line 103
    .line 104
    if-eqz v0, :cond_5

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance p0, La/k0w0;

    .line 110
    .line 111
    invoke-direct {p0, v2}, La/k0w0;-><init>(La/i1w0;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance v0, Lorg/xplatform/limits/rs/impl/navigation/LimitsRsScreens$SessionTimeLimitsRsFragmentScreen;

    .line 118
    .line 119
    invoke-direct {v0, p1}, Lorg/xplatform/limits/rs/impl/navigation/LimitsRsScreens$SessionTimeLimitsRsFragmentScreen;-><init>(La/xrz;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 123
    .line 124
    .line 125
    iget-object p0, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 126
    .line 127
    invoke-static {v2, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    :goto_1
    move-object p1, p0

    .line 132
    check-cast p1, La/paw;

    .line 133
    .line 134
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_4

    .line 139
    .line 140
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    check-cast p1, La/oe50;

    .line 145
    .line 146
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_4
    return-void

    .line 151
    :cond_5
    instance-of v0, p1, La/lf7;

    .line 152
    .line 153
    if-eqz v0, :cond_6

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_6
    instance-of v0, p1, La/m810;

    .line 157
    .line 158
    if-eqz v0, :cond_7

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_7
    instance-of v0, p1, La/q8k;

    .line 162
    .line 163
    if-eqz v0, :cond_8

    .line 164
    .line 165
    :goto_2
    new-instance v0, La/u400;

    .line 166
    .line 167
    invoke-direct {v0, p0, p1, v1}, La/u400;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_8
    instance-of p0, p1, La/h8i0;

    .line 175
    .line 176
    if-eqz p0, :cond_9

    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    new-instance p0, La/k0w0;

    .line 182
    .line 183
    invoke-direct {p0, v2}, La/k0w0;-><init>(La/i1w0;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance p1, Lorg/xplatform/limits/rs/impl/navigation/internal/LimitsRsInternalScreens$SelfExclusionFragmentScreen;

    .line 190
    .line 191
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, p1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 195
    .line 196
    .line 197
    iget-object p0, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 198
    .line 199
    invoke-static {v2, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    :goto_3
    move-object p1, p0

    .line 204
    check-cast p1, La/paw;

    .line 205
    .line 206
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_9

    .line 211
    .line 212
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    check-cast p1, La/oe50;

    .line 217
    .line 218
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 219
    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_9
    return-void

    .line 223
    :cond_a
    instance-of v0, p1, La/w300;

    .line 224
    .line 225
    if-eqz v0, :cond_c

    .line 226
    .line 227
    check-cast p1, La/w300;

    .line 228
    .line 229
    iget v3, p1, La/w300;->a:I

    .line 230
    .line 231
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 232
    .line 233
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 234
    .line 235
    :cond_b
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    move-object v0, v7

    .line 243
    check-cast v0, La/l400;

    .line 244
    .line 245
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    const-string v4, "CURRENT_TAB_KEY"

    .line 255
    .line 256
    invoke-static {v1, v2, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const/4 v5, 0x0

    .line 260
    const/16 v6, 0x3fb

    .line 261
    .line 262
    const/4 v1, 0x0

    .line 263
    const/4 v2, 0x0

    .line 264
    const/4 v4, 0x0

    .line 265
    invoke-static/range {v0 .. v6}, La/l400;->a(La/l400;Ljava/util/List;Ljava/util/List;IZZI)La/l400;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {p1, v7, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_b

    .line 274
    .line 275
    return-void

    .line 276
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 277
    .line 278
    .line 279
    return-void
.end method
