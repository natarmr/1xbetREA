.class public final La/nua;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic t:I


# instance fields
.field public final o:La/i1w0;

.field public final p:La/hwt;

.field public final q:La/tqt;

.field public final r:La/hwt;

.field public final s:La/a7q;


# direct methods
.method public constructor <init>(La/vzg0;La/i1w0;La/mne;La/ctf0;La/hwt;La/tqt;La/hwt;La/a7q;La/pru;)V
    .locals 6

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/hc0;

    .line 5
    .line 6
    const/16 p1, 0xf

    .line 7
    .line 8
    invoke-direct {v2, p9, p1}, La/hc0;-><init>(La/pru;B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/ep4;

    .line 12
    .line 13
    const/16 p9, 0xe

    .line 14
    .line 15
    invoke-direct {v3, p4, p9}, La/ep4;-><init>(La/ctf0;B)V

    .line 16
    .line 17
    .line 18
    iget-object p4, p3, La/mne;->a:La/rwj;

    .line 19
    .line 20
    iget-object p3, p3, La/mne;->c:La/vs10;

    .line 21
    .line 22
    invoke-static {p4, p3}, La/cvm0;->p(La/lne;La/lne;)La/g090;

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
    iput-object p2, v0, La/nua;->o:La/i1w0;

    .line 33
    .line 34
    iput-object p5, v0, La/nua;->p:La/hwt;

    .line 35
    .line 36
    iput-object p6, v0, La/nua;->q:La/tqt;

    .line 37
    .line 38
    iput-object p7, v0, La/nua;->r:La/hwt;

    .line 39
    .line 40
    iput-object p8, v0, La/nua;->s:La/a7q;

    .line 41
    .line 42
    new-instance p0, La/pn;

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-direct {p0, v0, p2, p1}, La/pn;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x3

    .line 49
    invoke-static {v0, p2, p2, p0, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 50
    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 12

    .line 1
    check-cast p1, La/uta;

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
    instance-of v0, p1, La/nta;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    instance-of v0, p1, La/qta;

    .line 18
    .line 19
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 20
    .line 21
    iget-object v2, p0, La/i3t0;->i:La/ocj;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    check-cast p1, La/qta;

    .line 26
    .line 27
    iget v0, p1, La/qta;->a:I

    .line 28
    .line 29
    iget p1, p1, La/qta;->b:I

    .line 30
    .line 31
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, La/lua;

    .line 36
    .line 37
    iget-object p0, p0, La/lua;->c:Ljava/util/List;

    .line 38
    .line 39
    if-eq v0, p1, :cond_a

    .line 40
    .line 41
    if-ltz v0, :cond_a

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-ge v0, v3, :cond_a

    .line 48
    .line 49
    if-ltz p1, :cond_a

    .line 50
    .line 51
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-ge p1, v3, :cond_a

    .line 56
    .line 57
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 58
    .line 59
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-object v4, v3

    .line 67
    check-cast v4, La/lua;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->N0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v6, p1, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    const/4 v10, 0x0

    .line 84
    const/16 v11, 0x7b

    .line 85
    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v7, 0x0

    .line 88
    const/4 v8, 0x0

    .line 89
    const/4 v9, 0x0

    .line 90
    invoke-static/range {v4 .. v11}, La/lua;->a(La/lua;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZI)La/lua;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_1

    .line 99
    .line 100
    return-void

    .line 101
    :cond_2
    instance-of v0, p1, La/tta;

    .line 102
    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, La/lua;

    .line 110
    .line 111
    iget-object v0, p1, La/lua;->c:Ljava/util/List;

    .line 112
    .line 113
    iget-object v3, v2, La/ocj;->a:La/p7m0;

    .line 114
    .line 115
    :cond_3
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-object v4, p1

    .line 123
    check-cast v4, La/lua;

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    const/4 v10, 0x1

    .line 129
    const/16 v11, 0x3f

    .line 130
    .line 131
    const/4 v5, 0x0

    .line 132
    const/4 v6, 0x0

    .line 133
    const/4 v7, 0x0

    .line 134
    const/4 v8, 0x0

    .line 135
    const/4 v9, 0x0

    .line 136
    invoke-static/range {v4 .. v11}, La/lua;->a(La/lua;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZI)La/lua;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-virtual {v3, p1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-eqz p1, :cond_3

    .line 145
    .line 146
    new-instance p1, La/za;

    .line 147
    .line 148
    const/16 v1, 0x1c

    .line 149
    .line 150
    const/4 v2, 0x0

    .line 151
    invoke-direct {p1, p0, v0, v2, v1}, La/za;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 152
    .line 153
    .line 154
    const/4 v0, 0x3

    .line 155
    invoke-static {p0, v2, v2, p1, v0}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_4
    instance-of v0, p1, La/rta;

    .line 160
    .line 161
    if-eqz v0, :cond_5

    .line 162
    .line 163
    sget-object p1, La/jua;->a:La/jua;

    .line 164
    .line 165
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_5
    instance-of v0, p1, La/sta;

    .line 170
    .line 171
    if-eqz v0, :cond_7

    .line 172
    .line 173
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 174
    .line 175
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-object v2, p0

    .line 183
    check-cast v2, La/lua;

    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v4, v2, La/lua;->d:Ljava/util/List;

    .line 189
    .line 190
    const/4 v8, 0x0

    .line 191
    const/16 v9, 0x7b

    .line 192
    .line 193
    const/4 v3, 0x0

    .line 194
    const/4 v5, 0x0

    .line 195
    const/4 v6, 0x0

    .line 196
    const/4 v7, 0x0

    .line 197
    invoke-static/range {v2 .. v9}, La/lua;->a(La/lua;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;ZI)La/lua;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    if-eqz p0, :cond_6

    .line 206
    .line 207
    return-void

    .line 208
    :cond_7
    instance-of v0, p1, La/ota;

    .line 209
    .line 210
    const/4 v1, 0x0

    .line 211
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 212
    .line 213
    iget-object v3, p0, La/nua;->o:La/i1w0;

    .line 214
    .line 215
    if-eqz v0, :cond_9

    .line 216
    .line 217
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    check-cast p1, La/lua;

    .line 222
    .line 223
    iget-object p1, p1, La/lua;->c:Ljava/util/List;

    .line 224
    .line 225
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, La/lua;

    .line 230
    .line 231
    iget-object v0, v0, La/lua;->f:Ljava/util/List;

    .line 232
    .line 233
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    if-nez p1, :cond_8

    .line 238
    .line 239
    sget-object p1, La/iua;->a:La/iua;

    .line 240
    .line 241
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_8
    invoke-static {v3}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    new-instance p1, La/c8d;

    .line 250
    .line 251
    sget-object v0, La/y7d;->a:La/v7d;

    .line 252
    .line 253
    invoke-direct {p1, v0, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 254
    .line 255
    .line 256
    invoke-static {p0, p1, v3, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    :goto_0
    move-object p1, p0

    .line 261
    check-cast p1, La/paw;

    .line 262
    .line 263
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_a

    .line 268
    .line 269
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    check-cast p1, La/oe50;

    .line 274
    .line 275
    invoke-virtual {v3, p1}, La/i1w0;->a(La/oe50;)V

    .line 276
    .line 277
    .line 278
    goto :goto_0

    .line 279
    :cond_9
    instance-of p0, p1, La/pta;

    .line 280
    .line 281
    if-eqz p0, :cond_b

    .line 282
    .line 283
    invoke-static {v3}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    new-instance p1, La/c8d;

    .line 288
    .line 289
    sget-object v0, La/y7d;->a:La/v7d;

    .line 290
    .line 291
    invoke-direct {p1, v0, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 292
    .line 293
    .line 294
    invoke-static {p0, p1, v3, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    :goto_1
    move-object p1, p0

    .line 299
    check-cast p1, La/paw;

    .line 300
    .line 301
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_a

    .line 306
    .line 307
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    check-cast p1, La/oe50;

    .line 312
    .line 313
    invoke-virtual {v3, p1}, La/i1w0;->a(La/oe50;)V

    .line 314
    .line 315
    .line 316
    goto :goto_1

    .line 317
    :cond_a
    return-void

    .line 318
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 319
    .line 320
    .line 321
    return-void
.end method
