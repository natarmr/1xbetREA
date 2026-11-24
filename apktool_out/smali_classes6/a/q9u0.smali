.class public final La/q9u0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic v:I


# instance fields
.field public final o:La/i1w0;

.field public final p:La/u8u;

.field public final q:La/bbw0;

.field public final r:La/ilp0;

.field public final s:La/mne;

.field public final t:La/i7u0;

.field public final u:La/q7u0;


# direct methods
.method public constructor <init>(La/vzg0;ILa/i1w0;La/u8u;La/bbw0;La/ilp0;La/mne;La/g2v;La/ctf0;La/i7u0;La/q7u0;)V
    .locals 6

    .line 1
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/y02;

    .line 5
    .line 6
    const/16 p1, 0xa

    .line 7
    .line 8
    invoke-direct {v2, p2, p1}, La/y02;-><init>(IB)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/cls0;

    .line 12
    .line 13
    const/4 p1, 0x6

    .line 14
    invoke-direct {v3, p9, p8, p1}, La/cls0;-><init>(La/ctf0;La/g2v;B)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p7, La/mne;->c:La/vs10;

    .line 18
    .line 19
    iget-object v0, p7, La/mne;->a:La/rwj;

    .line 20
    .line 21
    invoke-static {p1, v0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v1, 0x0

    .line 27
    move-object v0, p0

    .line 28
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 29
    .line 30
    .line 31
    iput-object p3, p0, La/q9u0;->o:La/i1w0;

    .line 32
    .line 33
    iput-object p4, p0, La/q9u0;->p:La/u8u;

    .line 34
    .line 35
    iput-object p5, p0, La/q9u0;->q:La/bbw0;

    .line 36
    .line 37
    iput-object p6, p0, La/q9u0;->r:La/ilp0;

    .line 38
    .line 39
    iput-object p7, p0, La/q9u0;->s:La/mne;

    .line 40
    .line 41
    move-object/from16 p1, p10

    .line 42
    .line 43
    iput-object p1, p0, La/q9u0;->t:La/i7u0;

    .line 44
    .line 45
    move-object/from16 p1, p11

    .line 46
    .line 47
    iput-object p1, p0, La/q9u0;->u:La/q7u0;

    .line 48
    .line 49
    sget-object p1, La/mbu0;->b:La/svs0;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {p2}, La/svs0;->a(I)La/mbu0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    sget-object p2, La/mbu0;->c:La/mbu0;

    .line 59
    .line 60
    if-eq p1, p2, :cond_0

    .line 61
    .line 62
    new-instance p2, La/p9u0;

    .line 63
    .line 64
    const/4 p4, 0x0

    .line 65
    invoke-direct {p2, p0, p1, p4}, La/p9u0;-><init>(La/q9u0;La/mbu0;B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3, p2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 72
    .line 73
    .line 74
    move-result-object p5

    .line 75
    iget-object p1, p7, La/mne;->a:La/rwj;

    .line 76
    .line 77
    new-instance p6, La/npt0;

    .line 78
    .line 79
    const/4 p2, 0x7

    .line 80
    invoke-direct {p6, p0, p2}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 81
    .line 82
    .line 83
    new-instance p2, La/k6s0;

    .line 84
    .line 85
    const/4 p3, 0x0

    .line 86
    const/16 p4, 0x11

    .line 87
    .line 88
    invoke-direct {p2, p0, p3, p4}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 89
    .line 90
    .line 91
    const/16 p0, 0xa

    .line 92
    .line 93
    const/4 p7, 0x0

    .line 94
    move/from16 p10, p0

    .line 95
    .line 96
    move-object p8, p1

    .line 97
    move-object p9, p2

    .line 98
    invoke-static/range {p5 .. p10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 99
    .line 100
    .line 101
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 12

    .line 1
    check-cast p1, La/l8u0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, La/h8u0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object v2, p0, La/q9u0;->o:La/i1w0;

    .line 10
    .line 11
    iget-object v3, p0, La/q9u0;->u:La/q7u0;

    .line 12
    .line 13
    iget-object v4, p0, La/q9u0;->t:La/i7u0;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p1, La/h8u0;

    .line 18
    .line 19
    iget-boolean p0, p1, La/h8u0;->a:Z

    .line 20
    .line 21
    const-string p1, "action"

    .line 22
    .line 23
    const-string v0, "verification_back_click"

    .line 24
    .line 25
    const-wide/16 v5, 0x3059

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    iget-object p0, v3, La/q7u0;->a:La/s1p;

    .line 30
    .line 31
    const-string v3, "system"

    .line 32
    .line 33
    invoke-static {v3, p0, v5, v6}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 34
    .line 35
    .line 36
    iget-object p0, v4, La/i7u0;->a:La/kt2;

    .line 37
    .line 38
    invoke-static {p1, v3, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object p0, v3, La/q7u0;->a:La/s1p;

    .line 43
    .line 44
    const-string v3, "arrow"

    .line 45
    .line 46
    invoke-static {v3, p0, v5, v6}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v4, La/i7u0;->a:La/kt2;

    .line 50
    .line 51
    invoke-static {p1, v3, p0, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance p1, La/c8d;

    .line 59
    .line 60
    sget-object v0, La/y7d;->a:La/v7d;

    .line 61
    .line 62
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 63
    .line 64
    invoke-direct {p1, v0, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, p1, v2, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    :goto_1
    move-object p1, p0

    .line 72
    check-cast p1, La/paw;

    .line 73
    .line 74
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_7

    .line 79
    .line 80
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, La/oe50;

    .line 85
    .line 86
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    instance-of v0, p1, La/j8u0;

    .line 91
    .line 92
    const/4 v5, 0x0

    .line 93
    if-eqz v0, :cond_8

    .line 94
    .line 95
    check-cast p1, La/j8u0;

    .line 96
    .line 97
    iget p1, p1, La/j8u0;->a:I

    .line 98
    .line 99
    iget-object v0, v4, La/i7u0;->a:La/kt2;

    .line 100
    .line 101
    const-string v4, "verification_method_click"

    .line 102
    .line 103
    invoke-interface {v0, v4}, La/kt2;->c(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v3, La/q7u0;->a:La/s1p;

    .line 107
    .line 108
    const-wide/16 v3, 0x3057

    .line 109
    .line 110
    sget-object v6, La/xun;->a:La/xun;

    .line 111
    .line 112
    invoke-virtual {v0, v6, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 113
    .line 114
    .line 115
    sget-object v0, La/mbu0;->b:La/svs0;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {p1}, La/svs0;->a(I)La/mbu0;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, La/n9u0;

    .line 129
    .line 130
    iget-object v0, v0, La/n9u0;->a:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_3

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    move-object v4, v3

    .line 147
    check-cast v4, La/c8u0;

    .line 148
    .line 149
    iget-object v4, v4, La/c8u0;->a:La/mbu0;

    .line 150
    .line 151
    if-ne v4, p1, :cond_2

    .line 152
    .line 153
    move-object v5, v3

    .line 154
    :cond_3
    check-cast v5, La/c8u0;

    .line 155
    .line 156
    if-eqz v5, :cond_7

    .line 157
    .line 158
    iget-object v0, v5, La/c8u0;->f:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v3, v5, La/c8u0;->a:La/mbu0;

    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_4

    .line 167
    .line 168
    const/4 v4, 0x2

    .line 169
    if-eq v3, v4, :cond_4

    .line 170
    .line 171
    new-instance v0, La/p9u0;

    .line 172
    .line 173
    const/4 v1, 0x1

    .line 174
    invoke-direct {v0, p0, p1, v1}, La/p9u0;-><init>(La/q9u0;La/mbu0;B)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-lez p1, :cond_5

    .line 186
    .line 187
    new-instance p1, La/m9u0;

    .line 188
    .line 189
    invoke-direct {p1, v0}, La/m9u0;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_5
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    iget-object p0, p0, La/q9u0;->q:La/bbw0;

    .line 201
    .line 202
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p0, La/clc;

    .line 205
    .line 206
    invoke-virtual {p0}, La/clc;->d()La/r46;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-virtual {p0}, La/r46;->a()Lorg/xplatform/verification/base/impl/navigation/BaseVerificationScreens$BaseVerificationFragmentScreen;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    instance-of v0, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 215
    .line 216
    if-eqz v0, :cond_6

    .line 217
    .line 218
    new-instance v0, La/e1w0;

    .line 219
    .line 220
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 221
    .line 222
    invoke-direct {v0, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 223
    .line 224
    .line 225
    new-instance p0, La/c8d;

    .line 226
    .line 227
    sget-object v3, La/y7d;->a:La/v7d;

    .line 228
    .line 229
    invoke-direct {p0, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_6
    new-instance v0, La/w0w0;

    .line 237
    .line 238
    invoke-direct {v0, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 239
    .line 240
    .line 241
    new-instance p0, La/c8d;

    .line 242
    .line 243
    sget-object v3, La/y7d;->a:La/v7d;

    .line 244
    .line 245
    invoke-direct {p0, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    :goto_2
    invoke-static {v2, p1, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    :goto_3
    move-object p1, p0

    .line 256
    check-cast p1, La/paw;

    .line 257
    .line 258
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_7

    .line 263
    .line 264
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    check-cast p1, La/oe50;

    .line 269
    .line 270
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 271
    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_7
    return-void

    .line 275
    :cond_8
    sget-object v0, La/k8u0;->a:La/k8u0;

    .line 276
    .line 277
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-eqz v0, :cond_9

    .line 282
    .line 283
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    iget-object p1, p0, La/q9u0;->s:La/mne;

    .line 288
    .line 289
    iget-object v9, p1, La/mne;->a:La/rwj;

    .line 290
    .line 291
    new-instance v7, La/npt0;

    .line 292
    .line 293
    const/4 p1, 0x7

    .line 294
    invoke-direct {v7, p0, p1}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 295
    .line 296
    .line 297
    new-instance v10, La/k6s0;

    .line 298
    .line 299
    const/16 p1, 0x11

    .line 300
    .line 301
    invoke-direct {v10, p0, v5, p1}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 302
    .line 303
    .line 304
    const/16 v11, 0xa

    .line 305
    .line 306
    const/4 v8, 0x0

    .line 307
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :cond_9
    sget-object v0, La/i8u0;->a:La/i8u0;

    .line 312
    .line 313
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    if-eqz p1, :cond_a

    .line 318
    .line 319
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 320
    .line 321
    .line 322
    return-void

    .line 323
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 324
    .line 325
    .line 326
    return-void
.end method
