.class public final La/pyp0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final o:La/vzg0;

.field public final p:La/i1w0;

.field public final q:La/ctf0;

.field public final r:La/x4u;

.field public final s:La/psu;

.field public final t:La/psu;

.field public final u:La/osc;

.field public final v:La/lsn;


# direct methods
.method public constructor <init>(La/vzg0;La/mne;La/i1w0;La/ctf0;La/x4u;La/psu;La/psu;La/osc;La/lsn;)V
    .locals 6

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/mhp0;

    .line 5
    .line 6
    const/16 v0, 0x1b

    .line 7
    .line 8
    invoke-direct {v2, v0}, La/mhp0;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/h0j0;

    .line 12
    .line 13
    const/16 v0, 0x12

    .line 14
    .line 15
    invoke-direct {v3, p4, v0}, La/h0j0;-><init>(La/ctf0;B)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p2, La/mne;->c:La/vs10;

    .line 19
    .line 20
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 21
    .line 22
    invoke-static {v0, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

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
    iput-object p1, v0, La/pyp0;->o:La/vzg0;

    .line 33
    .line 34
    iput-object p3, v0, La/pyp0;->p:La/i1w0;

    .line 35
    .line 36
    iput-object p4, v0, La/pyp0;->q:La/ctf0;

    .line 37
    .line 38
    iput-object p5, v0, La/pyp0;->r:La/x4u;

    .line 39
    .line 40
    iput-object p6, v0, La/pyp0;->s:La/psu;

    .line 41
    .line 42
    iput-object p7, v0, La/pyp0;->t:La/psu;

    .line 43
    .line 44
    iput-object p8, v0, La/pyp0;->u:La/osc;

    .line 45
    .line 46
    iput-object p9, v0, La/pyp0;->v:La/lsn;

    .line 47
    .line 48
    invoke-virtual {p5}, La/x4u;->f()Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string p2, "START_FILTER_MODEL_KEY"

    .line 53
    .line 54
    invoke-virtual {p1, p2}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    check-cast p2, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 59
    .line 60
    const-string p3, "CURRENT_FILTER_MODEL_KEY"

    .line 61
    .line 62
    invoke-virtual {p1, p3}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 67
    .line 68
    if-eqz p2, :cond_2

    .line 69
    .line 70
    if-nez p1, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    iget-object p3, v0, La/i3t0;->i:La/ocj;

    .line 74
    .line 75
    iget-object p3, p3, La/ocj;->a:La/p7m0;

    .line 76
    .line 77
    :cond_1
    invoke-virtual {p3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p4

    .line 81
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object p5, v0, La/i3t0;->f:La/oyg0;

    .line 85
    .line 86
    move-object p6, p4

    .line 87
    check-cast p6, La/nyp0;

    .line 88
    .line 89
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance p5, La/nyp0;

    .line 96
    .line 97
    invoke-direct {p5, p2, p1, p0}, La/nyp0;-><init>(Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p3, p4, p5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p4

    .line 104
    if-eqz p4, :cond_1

    .line 105
    .line 106
    return-void

    .line 107
    :cond_2
    :goto_0
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    new-instance p2, La/lcl0;

    .line 112
    .line 113
    const/16 p3, 0x18

    .line 114
    .line 115
    const/4 p4, 0x0

    .line 116
    invoke-direct {p2, v0, p0, p4, p3}, La/lcl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 117
    .line 118
    .line 119
    const/4 p0, 0x3

    .line 120
    invoke-static {p1, p4, p4, p2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 121
    .line 122
    .line 123
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 13

    .line 1
    check-cast p1, La/gyp0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, La/zxp0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, La/pyp0;->p:La/i1w0;

    .line 12
    .line 13
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, La/c8d;

    .line 18
    .line 19
    sget-object v2, La/y7d;->a:La/v7d;

    .line 20
    .line 21
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 22
    .line 23
    invoke-direct {v0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    move-object v0, p1

    .line 31
    check-cast v0, La/paw;

    .line 32
    .line 33
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, La/oe50;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void

    .line 50
    :cond_1
    instance-of v0, p1, La/ayp0;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    sget-object p1, La/dzp0;->a:La/dzp0;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    instance-of v0, p1, La/byp0;

    .line 61
    .line 62
    const/4 v2, 0x3

    .line 63
    const/4 v3, 0x0

    .line 64
    iget-object v4, p0, La/i3t0;->f:La/oyg0;

    .line 65
    .line 66
    iget-object v5, p0, La/i3t0;->i:La/ocj;

    .line 67
    .line 68
    const/16 v6, 0xa

    .line 69
    .line 70
    const-string v7, "CURRENT_FILTER_MODEL_KEY"

    .line 71
    .line 72
    iget-object v8, p0, La/pyp0;->o:La/vzg0;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    iget-object p1, p0, La/pyp0;->r:La/x4u;

    .line 77
    .line 78
    invoke-virtual {p1}, La/x4u;->f()Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v8, v7, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object v9, v5, La/ocj;->a:La/p7m0;

    .line 86
    .line 87
    :cond_3
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-object v1, p1

    .line 95
    check-cast v1, La/nyp0;

    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v0}, La/nyp0;->a(La/nyp0;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;)La/nyp0;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v9, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    new-instance v0, La/z2n0;

    .line 115
    .line 116
    invoke-direct {v0, p0, v3, v6}, La/z2n0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 117
    .line 118
    .line 119
    invoke-static {p1, v3, v3, v0, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_4
    instance-of v0, p1, La/cyp0;

    .line 124
    .line 125
    iget-object v9, p0, La/pyp0;->q:La/ctf0;

    .line 126
    .line 127
    if-eqz v0, :cond_6

    .line 128
    .line 129
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, La/nyp0;

    .line 134
    .line 135
    iget-object p1, p1, La/nyp0;->b:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 136
    .line 137
    iget-object p1, p1, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->a:Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v9, p1}, La/l7x;->e0(La/ctf0;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iget-object v0, p0, La/pyp0;->t:La/psu;

    .line 144
    .line 145
    iget-object v0, v0, La/psu;->a:La/xyp0;

    .line 146
    .line 147
    iget-object v0, v0, La/xyp0;->c:La/typ0;

    .line 148
    .line 149
    iget-object v0, v0, La/typ0;->a:La/mxp0;

    .line 150
    .line 151
    iget-object v0, v0, La/mxp0;->a:Ljava/util/Map;

    .line 152
    .line 153
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Ljava/lang/Iterable;

    .line 158
    .line 159
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    new-instance v2, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-static {v0, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-eqz v3, :cond_5

    .line 181
    .line 182
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    check-cast v3, Ljava/lang/String;

    .line 187
    .line 188
    invoke-static {v9, v3}, La/l7x;->e0(La/ctf0;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    new-instance v5, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;

    .line 193
    .line 194
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    invoke-direct {v5, v4, v3, v6}, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_5
    new-instance p1, La/czp0;

    .line 206
    .line 207
    sget-object v0, La/pic;->a:La/pic;

    .line 208
    .line 209
    new-array v3, v1, [Ljava/lang/Object;

    .line 210
    .line 211
    iget-object v4, v9, La/ctf0;->b:La/lsm0;

    .line 212
    .line 213
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const v3, 0x7f1311cf

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-direct {p1, v0, v1, v2}, La/czp0;-><init>(La/pic;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :cond_6
    instance-of v0, p1, La/eyp0;

    .line 232
    .line 233
    const-string v10, "0"

    .line 234
    .line 235
    const v11, 0x7f1314f4

    .line 236
    .line 237
    .line 238
    iget-object v12, p0, La/pyp0;->u:La/osc;

    .line 239
    .line 240
    if-eqz v0, :cond_a

    .line 241
    .line 242
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    check-cast p1, La/nyp0;

    .line 247
    .line 248
    iget-object p1, p1, La/nyp0;->b:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 249
    .line 250
    iget-object p1, p1, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->a:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    new-array v0, v1, [Ljava/lang/Object;

    .line 259
    .line 260
    iget-object v2, v9, La/ctf0;->b:La/lsm0;

    .line 261
    .line 262
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v2, v11, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-eqz v0, :cond_7

    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_7
    move-object v10, p1

    .line 278
    :goto_2
    invoke-virtual {v12, v10}, La/osc;->a(Ljava/lang/String;)Ljava/util/List;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    new-instance v0, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-static {p1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v3

    .line 299
    if-eqz v3, :cond_9

    .line 300
    .line 301
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    check-cast v3, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 306
    .line 307
    new-instance v4, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;

    .line 308
    .line 309
    invoke-static {v3, v9}, La/ghm0;->s(Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;La/ctf0;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    iget-object v6, v3, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;->a:Ljava/lang/String;

    .line 314
    .line 315
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    check-cast v7, La/nyp0;

    .line 320
    .line 321
    iget-object v7, v7, La/nyp0;->b:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 322
    .line 323
    iget-object v7, v7, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->b:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 324
    .line 325
    if-ne v3, v7, :cond_8

    .line 326
    .line 327
    const/4 v3, 0x1

    .line 328
    goto :goto_4

    .line 329
    :cond_8
    move v3, v1

    .line 330
    :goto_4
    invoke-direct {v4, v5, v6, v3}, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    goto :goto_3

    .line 337
    :cond_9
    new-instance p1, La/czp0;

    .line 338
    .line 339
    sget-object v3, La/pic;->b:La/pic;

    .line 340
    .line 341
    new-array v4, v1, [Ljava/lang/Object;

    .line 342
    .line 343
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    const v4, 0x7f131501

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    invoke-direct {p1, v3, v1, v0}, La/czp0;-><init>(La/pic;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :cond_a
    instance-of v0, p1, La/yxp0;

    .line 362
    .line 363
    if-eqz v0, :cond_b

    .line 364
    .line 365
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    new-instance v0, La/z2n0;

    .line 370
    .line 371
    invoke-direct {v0, p0, v3, v6}, La/z2n0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 372
    .line 373
    .line 374
    invoke-static {p1, v3, v3, v0, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 375
    .line 376
    .line 377
    return-void

    .line 378
    :cond_b
    instance-of v0, p1, La/dyp0;

    .line 379
    .line 380
    if-eqz v0, :cond_f

    .line 381
    .line 382
    check-cast p1, La/dyp0;

    .line 383
    .line 384
    iget-object p1, p1, La/dyp0;->a:Ljava/lang/String;

    .line 385
    .line 386
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    check-cast p0, La/nyp0;

    .line 391
    .line 392
    iget-object p0, p0, La/nyp0;->b:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 393
    .line 394
    iget-object p0, p0, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->b:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 395
    .line 396
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    new-array v0, v1, [Ljava/lang/Object;

    .line 400
    .line 401
    iget-object v2, v9, La/ctf0;->b:La/lsm0;

    .line 402
    .line 403
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-virtual {v2, v11, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-eqz v0, :cond_c

    .line 416
    .line 417
    goto :goto_5

    .line 418
    :cond_c
    move-object v10, p1

    .line 419
    :goto_5
    invoke-virtual {v12, v10}, La/osc;->a(Ljava/lang/String;)Ljava/util/List;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-eqz v0, :cond_d

    .line 428
    .line 429
    goto :goto_6

    .line 430
    :cond_d
    sget-object p0, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;->d:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 431
    .line 432
    :goto_6
    new-instance v0, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 433
    .line 434
    invoke-direct {v0, p1, p0}, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;-><init>(Ljava/lang/String;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v8, v7, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    iget-object v1, v5, La/ocj;->a:La/p7m0;

    .line 441
    .line 442
    :cond_e
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p0

    .line 446
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    move-object p1, p0

    .line 450
    check-cast p1, La/nyp0;

    .line 451
    .line 452
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    invoke-static {p1, v0}, La/nyp0;->a(La/nyp0;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;)La/nyp0;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    invoke-virtual {v1, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result p0

    .line 463
    if-eqz p0, :cond_e

    .line 464
    .line 465
    return-void

    .line 466
    :cond_f
    instance-of v0, p1, La/fyp0;

    .line 467
    .line 468
    if-eqz v0, :cond_11

    .line 469
    .line 470
    check-cast p1, La/fyp0;

    .line 471
    .line 472
    iget-object p1, p1, La/fyp0;->a:Ljava/lang/String;

    .line 473
    .line 474
    new-instance v0, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 475
    .line 476
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    check-cast p0, La/nyp0;

    .line 481
    .line 482
    iget-object p0, p0, La/nyp0;->b:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 483
    .line 484
    iget-object p0, p0, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->a:Ljava/lang/String;

    .line 485
    .line 486
    sget-object v1, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;->b:La/m6m0;

    .line 487
    .line 488
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    invoke-static {p1}, La/m6m0;->e(Ljava/lang/String;)Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    invoke-direct {v0, p0, p1}, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;-><init>(Ljava/lang/String;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v8, v7, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    iget-object v1, v5, La/ocj;->a:La/p7m0;

    .line 502
    .line 503
    :cond_10
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object p0

    .line 507
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    move-object p1, p0

    .line 511
    check-cast p1, La/nyp0;

    .line 512
    .line 513
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    invoke-static {p1, v0}, La/nyp0;->a(La/nyp0;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;)La/nyp0;

    .line 517
    .line 518
    .line 519
    move-result-object p1

    .line 520
    invoke-virtual {v1, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result p0

    .line 524
    if-eqz p0, :cond_10

    .line 525
    .line 526
    return-void

    .line 527
    :cond_11
    sget-object v0, La/xxp0;->a:La/xxp0;

    .line 528
    .line 529
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    move-result p1

    .line 533
    if-eqz p1, :cond_12

    .line 534
    .line 535
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 536
    .line 537
    .line 538
    return-void

    .line 539
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 540
    .line 541
    .line 542
    return-void
.end method
