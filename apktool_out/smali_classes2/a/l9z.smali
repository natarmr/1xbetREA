.class public final La/l9z;
.super La/jlc;
.source "SourceFile"


# instance fields
.field public final g:La/f7u;

.field public final h:La/mqe0;

.field public final i:La/wm40;

.field public final j:La/f7u;

.field public final k:La/n0o0;

.field public final l:La/slc;

.field public final m:La/gm40;

.field public final n:La/xj;

.field public final o:Z

.field public final p:La/efk;

.field public final q:La/p9z;

.field public final r:La/c3h0;

.field public final s:La/pdx;

.field public final t:La/eaz;

.field public final u:La/j9z;

.field public final v:La/cu00;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v5, "notifyAll"

    .line 2
    .line 3
    const-string v6, "toString"

    .line 4
    .line 5
    const-string v0, "equals"

    .line 6
    .line 7
    const-string v1, "hashCode"

    .line 8
    .line 9
    const-string v2, "getClass"

    .line 10
    .line 11
    const-string v3, "wait"

    .line 12
    .line 13
    const-string v4, "notify"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(La/f7u;La/vjj;La/mqe0;La/wm40;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, La/f7u;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/v7i;

    .line 13
    .line 14
    iget-object v0, v0, La/v7i;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/eu00;

    .line 17
    .line 18
    invoke-virtual {p3}, La/mqe0;->e()La/g950;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p3}, La/m2a;->v(La/x8y;)La/rog0;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {p0, v0, p2, v1, v2}, La/jlc;-><init>(La/eu00;La/vjj;La/g950;La/gmk0;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/l9z;->g:La/f7u;

    .line 30
    .line 31
    iput-object p3, p0, La/l9z;->h:La/mqe0;

    .line 32
    .line 33
    iput-object p4, p0, La/l9z;->i:La/wm40;

    .line 34
    .line 35
    const/4 p2, 0x4

    .line 36
    invoke-static {p1, p0, p3, p2}, La/f7k;->G(La/f7u;La/vlc;La/mqe0;I)La/f7u;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, La/l9z;->j:La/f7u;

    .line 41
    .line 42
    iget-object p1, v1, La/f7u;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, La/v7i;

    .line 45
    .line 46
    iget-object p1, p1, La/v7i;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, La/eu00;

    .line 49
    .line 50
    new-instance p2, La/k9z;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-direct {p2, p0, v0}, La/k9z;-><init>(La/l9z;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    iput-object p2, p0, La/l9z;->k:La/n0o0;

    .line 61
    .line 62
    iget-object p2, p3, La/mqe0;->a:Ljava/lang/Class;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Class;->isAnnotation()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_0

    .line 69
    .line 70
    sget-object v2, La/slc;->e:La/slc;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_1

    .line 78
    .line 79
    sget-object v2, La/slc;->b:La/slc;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    sget-object v2, La/slc;->c:La/slc;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    sget-object v2, La/slc;->a:La/slc;

    .line 92
    .line 93
    :goto_0
    iput-object v2, p0, La/l9z;->l:La/slc;

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Class;->isAnnotation()Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    const/4 v6, 0x1

    .line 100
    if-nez v2, :cond_b

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_3

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_3
    sget-object v2, La/gm40;->a:La/evz;

    .line 110
    .line 111
    invoke-static {p2}, La/zdx;->E(Ljava/lang/Class;)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    if-eqz v3, :cond_4

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    goto :goto_1

    .line 122
    :cond_4
    move v3, v0

    .line 123
    :goto_1
    invoke-static {p2}, La/zdx;->E(Ljava/lang/Class;)Ljava/lang/Boolean;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    if-eqz v4, :cond_5

    .line 128
    .line 129
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    goto :goto_2

    .line 134
    :cond_5
    move v4, v0

    .line 135
    :goto_2
    if-nez v4, :cond_7

    .line 136
    .line 137
    invoke-virtual {p2}, Ljava/lang/Class;->getModifiers()I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-nez v4, :cond_7

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_6

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    move v4, v0

    .line 155
    goto :goto_4

    .line 156
    :cond_7
    :goto_3
    move v4, v6

    .line 157
    :goto_4
    invoke-virtual {p2}, Ljava/lang/Class;->getModifiers()I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    if-eqz v3, :cond_8

    .line 169
    .line 170
    sget-object v2, La/gm40;->c:La/gm40;

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_8
    if-eqz v4, :cond_9

    .line 174
    .line 175
    sget-object v2, La/gm40;->e:La/gm40;

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_9
    if-nez v5, :cond_a

    .line 179
    .line 180
    sget-object v2, La/gm40;->d:La/gm40;

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_a
    sget-object v2, La/gm40;->b:La/gm40;

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_b
    :goto_5
    sget-object v2, La/gm40;->b:La/gm40;

    .line 187
    .line 188
    :goto_6
    iput-object v2, p0, La/l9z;->m:La/gm40;

    .line 189
    .line 190
    invoke-virtual {p2}, Ljava/lang/Class;->getModifiers()I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    if-eqz v3, :cond_c

    .line 199
    .line 200
    sget-object v2, La/huu0;->d:La/huu0;

    .line 201
    .line 202
    goto :goto_7

    .line 203
    :cond_c
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-eqz v3, :cond_d

    .line 208
    .line 209
    sget-object v2, La/euu0;->d:La/euu0;

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_d
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    if-eqz v3, :cond_f

    .line 217
    .line 218
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_e

    .line 223
    .line 224
    sget-object v2, La/oay;->d:La/oay;

    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_e
    sget-object v2, La/nay;->d:La/nay;

    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_f
    sget-object v2, La/may;->d:La/may;

    .line 231
    .line 232
    :goto_7
    iput-object v2, p0, La/l9z;->n:La/xj;

    .line 233
    .line 234
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    if-eqz v2, :cond_10

    .line 239
    .line 240
    new-instance v3, La/mqe0;

    .line 241
    .line 242
    invoke-direct {v3, v2}, La/mqe0;-><init>(Ljava/lang/Class;)V

    .line 243
    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_10
    const/4 v3, 0x0

    .line 247
    :goto_8
    if-eqz v3, :cond_11

    .line 248
    .line 249
    invoke-virtual {p2}, Ljava/lang/Class;->getModifiers()I

    .line 250
    .line 251
    .line 252
    move-result p2

    .line 253
    invoke-static {p2}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    if-nez p2, :cond_11

    .line 258
    .line 259
    move p2, v6

    .line 260
    goto :goto_9

    .line 261
    :cond_11
    move p2, v0

    .line 262
    :goto_9
    iput-boolean p2, p0, La/l9z;->o:Z

    .line 263
    .line 264
    new-instance p2, La/efk;

    .line 265
    .line 266
    invoke-direct {p2, p0}, La/efk;-><init>(La/l9z;)V

    .line 267
    .line 268
    .line 269
    iput-object p2, p0, La/l9z;->p:La/efk;

    .line 270
    .line 271
    move p2, v0

    .line 272
    new-instance v0, La/p9z;

    .line 273
    .line 274
    if-eqz p4, :cond_12

    .line 275
    .line 276
    move v4, v6

    .line 277
    goto :goto_a

    .line 278
    :cond_12
    move v4, p2

    .line 279
    :goto_a
    const/4 v5, 0x0

    .line 280
    move-object v2, p0

    .line 281
    move-object v3, p3

    .line 282
    invoke-direct/range {v0 .. v5}, La/p9z;-><init>(La/f7u;La/wm40;La/mqe0;ZLa/p9z;)V

    .line 283
    .line 284
    .line 285
    iput-object v0, v2, La/l9z;->q:La/p9z;

    .line 286
    .line 287
    sget-object p0, La/c3h0;->d:La/zie0;

    .line 288
    .line 289
    new-instance p2, La/w0;

    .line 290
    .line 291
    const/16 p3, 0x1d

    .line 292
    .line 293
    invoke-direct {p2, v2, p3}, La/w0;-><init>(Ljava/lang/Object;B)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    new-instance p0, La/c3h0;

    .line 300
    .line 301
    invoke-direct {p0, v2, p1, p2}, La/c3h0;-><init>(La/h1;La/eu00;Lkotlin/jvm/functions/Function1;)V

    .line 302
    .line 303
    .line 304
    iput-object p0, v2, La/l9z;->r:La/c3h0;

    .line 305
    .line 306
    new-instance p0, La/pdx;

    .line 307
    .line 308
    invoke-direct {p0, v0}, La/pdx;-><init>(La/cr30;)V

    .line 309
    .line 310
    .line 311
    iput-object p0, v2, La/l9z;->s:La/pdx;

    .line 312
    .line 313
    new-instance p0, La/eaz;

    .line 314
    .line 315
    invoke-direct {p0, v1, v3, v2}, La/eaz;-><init>(La/f7u;La/mqe0;La/l9z;)V

    .line 316
    .line 317
    .line 318
    iput-object p0, v2, La/l9z;->t:La/eaz;

    .line 319
    .line 320
    invoke-static {v1, v3}, La/r8x;->W(La/f7u;La/m8y;)La/j9z;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    iput-object p0, v2, La/l9z;->u:La/j9z;

    .line 325
    .line 326
    new-instance p0, La/k9z;

    .line 327
    .line 328
    invoke-direct {p0, v2, v6}, La/k9z;-><init>(La/l9z;B)V

    .line 329
    .line 330
    .line 331
    new-instance p2, La/cu00;

    .line 332
    .line 333
    invoke-direct {p2, p1, p0}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 334
    .line 335
    .line 336
    iput-object p2, v2, La/l9z;->v:La/cu00;

    .line 337
    .line 338
    return-void
.end method


# virtual methods
.method public final L()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final M()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/l9z;->v:La/cu00;

    .line 2
    .line 3
    invoke-virtual {p0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Q()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final U()La/cr30;
    .locals 0

    .line 1
    iget-object p0, p0, La/l9z;->t:La/eaz;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, La/l9z;->q:La/p9z;

    .line 2
    .line 3
    iget-object p0, p0, La/p9z;->q:La/cu00;

    .line 4
    .line 5
    invoke-virtual {p0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/util/List;

    .line 10
    .line 11
    return-object p0
.end method

.method public final getAnnotations()La/g93;
    .locals 0

    .line 1
    iget-object p0, p0, La/l9z;->u:La/j9z;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVisibility()La/tek;
    .locals 2

    .line 1
    sget-object v0, La/uek;->a:La/tek;

    .line 2
    .line 3
    iget-object v1, p0, La/l9z;->n:La/xj;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, La/l9z;->h:La/mqe0;

    .line 12
    .line 13
    iget-object p0, p0, La/mqe0;->a:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    new-instance v0, La/mqe0;

    .line 22
    .line 23
    invoke-direct {v0, p0}, La/mqe0;-><init>(Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-nez v0, :cond_1

    .line 29
    .line 30
    sget-object p0, La/w8y;->a:La/tek;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    invoke-static {v1}, La/u4n0;->u(La/xj;)La/tek;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final h()La/iys0;
    .locals 0

    .line 1
    iget-object p0, p0, La/l9z;->p:La/efk;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/l9z;->o:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isInline()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final j0()La/cr30;
    .locals 0

    .line 1
    iget-object p0, p0, La/l9z;->s:La/pdx;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k0()La/cr30;
    .locals 0

    .line 1
    invoke-super {p0}, La/wm40;->k0()La/cr30;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/p9z;

    .line 6
    .line 7
    return-object p0
.end method

.method public final l0(La/cty;)La/cr30;
    .locals 1

    .line 1
    iget-object p0, p0, La/l9z;->r:La/c3h0;

    .line 2
    .line 3
    iget-object p1, p0, La/c3h0;->a:La/h1;

    .line 4
    .line 5
    sget v0, La/rek;->a:I

    .line 6
    .line 7
    invoke-static {p1}, La/oek;->c(La/vjj;)La/ym40;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/c3h0;->c:La/cu00;

    .line 15
    .line 16
    sget-object p1, La/c3h0;->e:[La/iiy;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    aget-object p1, p1, v0

    .line 20
    .line 21
    invoke-static {p0, p1}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/cr30;

    .line 26
    .line 27
    check-cast p0, La/p9z;

    .line 28
    .line 29
    return-object p0
.end method

.method public final m()La/gm40;
    .locals 0

    .line 1
    iget-object p0, p0, La/l9z;->m:La/gm40;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m0()La/flc;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final n0()La/k2u0;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final o0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final p0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final q0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final r()La/slc;
    .locals 0

    .line 1
    iget-object p0, p0, La/l9z;->l:La/slc;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Lazy Java class "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget v1, La/rek;->a:I

    .line 9
    .line 10
    invoke-static {p0}, La/oek;->f(La/vjj;)La/twq;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final u0()La/p9z;
    .locals 0

    .line 1
    invoke-super {p0}, La/wm40;->k0()La/cr30;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/p9z;

    .line 6
    .line 7
    return-object p0
.end method
