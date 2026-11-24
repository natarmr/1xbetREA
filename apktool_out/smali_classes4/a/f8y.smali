.class public final La/f8y;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic y:I


# instance fields
.field public final o:La/jru;

.field public final p:La/m0u;

.field public final q:La/uyn;

.field public final r:La/i1w0;

.field public final s:La/mne;

.field public final t:La/duj;

.field public final u:La/abu;

.field public final v:La/wsf0;

.field public final w:La/kyg0;

.field public x:La/bby;


# direct methods
.method public constructor <init>(La/jru;La/m0u;La/m1e;La/uyn;La/i1w0;La/mne;La/duj;La/abu;La/wsf0;La/kyg0;La/ocl;La/n4u;)V
    .locals 7

    .line 1
    new-instance v2, La/y2x;

    .line 2
    .line 3
    const/16 v0, 0xf

    .line 4
    .line 5
    move-object/from16 v1, p12

    .line 6
    .line 7
    invoke-direct {v2, v1, v0}, La/y2x;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    new-instance v3, La/yar;

    .line 11
    .line 12
    const/4 v6, 0x3

    .line 13
    move-object/from16 v0, p11

    .line 14
    .line 15
    invoke-direct {v3, v0, v6}, La/yar;-><init>(La/ocl;B)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p6, La/mne;->c:La/vs10;

    .line 19
    .line 20
    iget-object v1, p6, La/mne;->b:La/dvj;

    .line 21
    .line 22
    invoke-static {v0, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

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
    iput-object p1, p0, La/f8y;->o:La/jru;

    .line 33
    .line 34
    iput-object p2, p0, La/f8y;->p:La/m0u;

    .line 35
    .line 36
    iput-object p4, p0, La/f8y;->q:La/uyn;

    .line 37
    .line 38
    iput-object p5, p0, La/f8y;->r:La/i1w0;

    .line 39
    .line 40
    iput-object p6, p0, La/f8y;->s:La/mne;

    .line 41
    .line 42
    iput-object p7, p0, La/f8y;->t:La/duj;

    .line 43
    .line 44
    iput-object p8, p0, La/f8y;->u:La/abu;

    .line 45
    .line 46
    move-object/from16 p1, p9

    .line 47
    .line 48
    iput-object p1, p0, La/f8y;->v:La/wsf0;

    .line 49
    .line 50
    move-object/from16 p1, p10

    .line 51
    .line 52
    iput-object p1, p0, La/f8y;->w:La/kyg0;

    .line 53
    .line 54
    invoke-interface {p3}, La/m1e;->b()La/gmq;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const/4 p2, 0x1

    .line 63
    invoke-static {p1, p2}, La/dtb;->z(La/gmq;I)La/lnq;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance p2, La/slx;

    .line 68
    .line 69
    const/4 p3, 0x5

    .line 70
    const/4 p4, 0x0

    .line 71
    invoke-direct {p2, p0, p4, p3}, La/slx;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 72
    .line 73
    .line 74
    new-instance p3, La/fnq;

    .line 75
    .line 76
    const/4 p5, 0x4

    .line 77
    invoke-direct {p3, p1, p2, p5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p0, p3, p4, p4, v6}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v6}, La/f8y;->M(I)V

    .line 84
    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final M(I)V
    .locals 22

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    iget-object v0, v2, La/f8y;->x:La/bby;

    .line 4
    .line 5
    const/4 v8, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, v8}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    iget-object v0, v2, La/f8y;->s:La/mne;

    .line 16
    .line 17
    iget-object v10, v0, La/mne;->b:La/dvj;

    .line 18
    .line 19
    const-class v15, La/qct;

    .line 20
    .line 21
    const-class v16, La/fhi0;

    .line 22
    .line 23
    const-class v11, Ljava/net/UnknownHostException;

    .line 24
    .line 25
    const-class v12, La/el50;

    .line 26
    .line 27
    const-class v13, Ljava/net/SocketTimeoutException;

    .line 28
    .line 29
    const-class v14, La/ff5;

    .line 30
    .line 31
    filled-new-array/range {v11 .. v16}, [Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v14

    .line 39
    sget-object v0, La/pnm0;->c:Lkotlin/ranges/IntRange;

    .line 40
    .line 41
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v15

    .line 45
    new-instance v0, La/g1y;

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    const/16 v7, 0xa

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    const-class v3, La/f8y;

    .line 52
    .line 53
    const-string v4, "handleLoadJackpotError"

    .line 54
    .line 55
    const-string v5, "handleLoadJackpotError(Ljava/lang/Throwable;)V"

    .line 56
    .line 57
    invoke-direct/range {v0 .. v7}, La/g1y;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 58
    .line 59
    .line 60
    new-instance v1, La/u2h;

    .line 61
    .line 62
    move/from16 v11, p1

    .line 63
    .line 64
    invoke-direct {v1, v11, v2, v8}, La/u2h;-><init>(ILa/f8y;La/yje;)V

    .line 65
    .line 66
    .line 67
    new-instance v3, La/y2x;

    .line 68
    .line 69
    const/16 v4, 0x10

    .line 70
    .line 71
    invoke-direct {v3, v2, v4}, La/y2x;-><init>(Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    const/16 v20, 0x0

    .line 75
    .line 76
    const/16 v21, 0x200

    .line 77
    .line 78
    move-object/from16 v18, v10

    .line 79
    .line 80
    const-string v10, "JackpotViewModel.loadJackpot"

    .line 81
    .line 82
    const-wide/16 v12, 0x3

    .line 83
    .line 84
    move-object/from16 v19, v0

    .line 85
    .line 86
    move-object/from16 v16, v1

    .line 87
    .line 88
    move-object/from16 v17, v3

    .line 89
    .line 90
    invoke-static/range {v9 .. v21}, La/sac;->i0(La/vne;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)La/bby;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, v2, La/f8y;->x:La/bby;

    .line 95
    .line 96
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 11

    .line 1
    check-cast p1, La/xzx;

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
    sget-object v0, La/szx;->a:La/szx;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, La/f8y;->s:La/mne;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object p1, v1, La/mne;->b:La/dvj;

    .line 21
    .line 22
    new-instance v0, La/adw;

    .line 23
    .line 24
    const/16 v1, 0x14

    .line 25
    .line 26
    invoke-direct {v0, p0, v1}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    new-instance v1, La/epp;

    .line 30
    .line 31
    const/16 v3, 0xb

    .line 32
    .line 33
    invoke-direct {v1, p0, v2, v3}, La/epp;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1, v0, v1}, La/i3t0;->I(La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/bby;

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    sget-object v0, La/rzx;->a:La/rzx;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    sget-object v0, La/tzx;->a:La/tzx;

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/4 v3, 0x0

    .line 59
    iget-object v4, p0, La/f8y;->r:La/i1w0;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-static {v4}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance p1, La/c8d;

    .line 68
    .line 69
    sget-object v0, La/y7d;->a:La/v7d;

    .line 70
    .line 71
    sget-object v1, La/p0w0;->a:La/p0w0;

    .line 72
    .line 73
    invoke-direct {p1, v0, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0, p1, v4, p0, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :goto_0
    move-object p1, p0

    .line 81
    check-cast p1, La/paw;

    .line 82
    .line 83
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_6

    .line 88
    .line 89
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, La/oe50;

    .line 94
    .line 95
    invoke-virtual {v4, p1}, La/i1w0;->a(La/oe50;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    sget-object v0, La/wzx;->a:La/wzx;

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    invoke-static {v4}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iget-object p0, p0, La/f8y;->q:La/uyn;

    .line 112
    .line 113
    invoke-virtual {p0}, La/uyn;->d()Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    instance-of v0, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 118
    .line 119
    if-eqz v0, :cond_3

    .line 120
    .line 121
    new-instance v0, La/e1w0;

    .line 122
    .line 123
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 124
    .line 125
    invoke-direct {v0, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 126
    .line 127
    .line 128
    new-instance p0, La/c8d;

    .line 129
    .line 130
    sget-object v1, La/y7d;->a:La/v7d;

    .line 131
    .line 132
    invoke-direct {p0, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    new-instance v0, La/w0w0;

    .line 140
    .line 141
    invoke-direct {v0, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 142
    .line 143
    .line 144
    new-instance p0, La/c8d;

    .line 145
    .line 146
    sget-object v1, La/y7d;->a:La/v7d;

    .line 147
    .line 148
    invoke-direct {p0, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    :goto_1
    invoke-static {v4, p1, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    :goto_2
    move-object p1, p0

    .line 159
    check-cast p1, La/paw;

    .line 160
    .line 161
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_6

    .line 166
    .line 167
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    check-cast p1, La/oe50;

    .line 172
    .line 173
    invoke-virtual {v4, p1}, La/i1w0;->a(La/oe50;)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_4
    sget-object v0, La/vzx;->a:La/vzx;

    .line 178
    .line 179
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_c

    .line 184
    .line 185
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, La/u7y;

    .line 190
    .line 191
    iget-object p1, p1, La/u7y;->a:La/o7y;

    .line 192
    .line 193
    instance-of v0, p1, La/m7y;

    .line 194
    .line 195
    if-eqz v0, :cond_5

    .line 196
    .line 197
    move-object v2, p1

    .line 198
    check-cast v2, La/m7y;

    .line 199
    .line 200
    :cond_5
    if-nez v2, :cond_7

    .line 201
    .line 202
    :cond_6
    return-void

    .line 203
    :cond_7
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    check-cast p1, La/u7y;

    .line 208
    .line 209
    iget-boolean p1, p1, La/u7y;->e:Z

    .line 210
    .line 211
    if-eqz p1, :cond_8

    .line 212
    .line 213
    const/4 p1, 0x3

    .line 214
    invoke-virtual {p0, p1}, La/f8y;->M(I)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :cond_8
    iget-object p1, v2, La/m7y;->a:La/q0y;

    .line 219
    .line 220
    sget-object v0, La/q0y;->a:La/q0y;

    .line 221
    .line 222
    if-eq p1, v0, :cond_9

    .line 223
    .line 224
    sget-object v0, La/q0y;->b:La/q0y;

    .line 225
    .line 226
    if-ne p1, v0, :cond_b

    .line 227
    .line 228
    :cond_9
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 229
    .line 230
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 231
    .line 232
    :cond_a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-object v4, p1

    .line 240
    check-cast v4, La/u7y;

    .line 241
    .line 242
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    const/4 v9, 0x0

    .line 248
    const/16 v10, 0x17

    .line 249
    .line 250
    const/4 v5, 0x0

    .line 251
    const/4 v6, 0x0

    .line 252
    const-wide/16 v7, 0x2710

    .line 253
    .line 254
    invoke-static/range {v4 .. v10}, La/u7y;->a(La/u7y;La/o7y;Ljava/util/List;JZI)La/u7y;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    if-eqz p1, :cond_a

    .line 263
    .line 264
    :cond_b
    invoke-virtual {p0, v3}, La/f8y;->M(I)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :cond_c
    sget-object v0, La/uzx;->a:La/uzx;

    .line 269
    .line 270
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    if-eqz p1, :cond_d

    .line 275
    .line 276
    iget-object p1, v1, La/mne;->b:La/dvj;

    .line 277
    .line 278
    new-instance v0, La/djx;

    .line 279
    .line 280
    const/16 v1, 0x9

    .line 281
    .line 282
    invoke-direct {v0, v1}, La/djx;-><init>(B)V

    .line 283
    .line 284
    .line 285
    new-instance v1, La/bu;

    .line 286
    .line 287
    const/16 v3, 0x8

    .line 288
    .line 289
    invoke-direct {v1, p0, v2, v3}, La/bu;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0, p1, v0, v1}, La/i3t0;->I(La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/bby;

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 297
    .line 298
    .line 299
    return-void
.end method
