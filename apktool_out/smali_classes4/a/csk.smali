.class public final La/csk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final a:La/ksk;

.field public final b:La/ctf0;

.field public final c:La/g2v;

.field public final d:La/y78;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public final g:La/n0o0;

.field public final h:La/n0o0;

.field public final i:La/n0o0;

.field public final j:La/n0o0;

.field public final k:La/n0o0;

.field public final l:La/n0o0;


# direct methods
.method public constructor <init>(La/ksk;La/ctf0;La/g2v;La/y78;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/csk;->a:La/ksk;

    .line 8
    .line 9
    iput-object p2, p0, La/csk;->b:La/ctf0;

    .line 10
    .line 11
    iput-object p3, p0, La/csk;->c:La/g2v;

    .line 12
    .line 13
    iput-object p4, p0, La/csk;->d:La/y78;

    .line 14
    .line 15
    new-instance p2, La/bsk;

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-direct {p2, p0, p3}, La/bsk;-><init>(La/csk;B)V

    .line 19
    .line 20
    .line 21
    new-instance p3, La/yw9;

    .line 22
    .line 23
    const/4 p4, 0x0

    .line 24
    const/16 v0, 0x14

    .line 25
    .line 26
    invoke-direct {p3, p4, p2, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iput-object p2, p0, La/csk;->e:La/n0o0;

    .line 34
    .line 35
    iget-object p2, p1, La/ksk;->c:La/j0g0;

    .line 36
    .line 37
    new-instance p3, La/bsk;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-direct {p3, p0, v1}, La/bsk;-><init>(La/csk;B)V

    .line 41
    .line 42
    .line 43
    new-instance v1, La/yw9;

    .line 44
    .line 45
    invoke-direct {v1, p2, p3, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    iput-object p3, p0, La/csk;->f:La/n0o0;

    .line 53
    .line 54
    new-instance p3, La/bsk;

    .line 55
    .line 56
    const/4 v1, 0x2

    .line 57
    invoke-direct {p3, p0, v1}, La/bsk;-><init>(La/csk;B)V

    .line 58
    .line 59
    .line 60
    new-instance v1, La/yw9;

    .line 61
    .line 62
    invoke-direct {v1, p2, p3, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iput-object p2, p0, La/csk;->g:La/n0o0;

    .line 70
    .line 71
    iget-object p1, p1, La/ksk;->d:La/j0g0;

    .line 72
    .line 73
    const-string p2, ""

    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    iget-object p3, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 78
    .line 79
    instance-of v1, p3, La/g0g0;

    .line 80
    .line 81
    if-eqz v1, :cond_0

    .line 82
    .line 83
    move-object p3, p4

    .line 84
    :cond_0
    check-cast p3, La/kuk;

    .line 85
    .line 86
    if-eqz p3, :cond_2

    .line 87
    .line 88
    iget-object p3, p3, La/kuk;->c:La/j0g0;

    .line 89
    .line 90
    if-eqz p3, :cond_2

    .line 91
    .line 92
    iget-object p3, p3, La/j0g0;->a:Ljava/lang/Object;

    .line 93
    .line 94
    new-instance v1, La/btk;

    .line 95
    .line 96
    sget-object v2, La/iun;->a:La/iun;

    .line 97
    .line 98
    invoke-direct {v1, v2, p2}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    instance-of v2, p3, La/g0g0;

    .line 102
    .line 103
    if-eqz v2, :cond_1

    .line 104
    .line 105
    move-object p3, v1

    .line 106
    :cond_1
    check-cast p3, La/btk;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    move-object p3, p4

    .line 110
    :goto_0
    new-instance v1, La/bsk;

    .line 111
    .line 112
    const/4 v2, 0x3

    .line 113
    invoke-direct {v1, p0, v2}, La/bsk;-><init>(La/csk;B)V

    .line 114
    .line 115
    .line 116
    new-instance v2, La/yw9;

    .line 117
    .line 118
    invoke-direct {v2, p3, v1, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 119
    .line 120
    .line 121
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    iput-object p3, p0, La/csk;->h:La/n0o0;

    .line 126
    .line 127
    if-eqz p1, :cond_5

    .line 128
    .line 129
    iget-object p3, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 130
    .line 131
    instance-of v1, p3, La/g0g0;

    .line 132
    .line 133
    if-eqz v1, :cond_3

    .line 134
    .line 135
    move-object p3, p4

    .line 136
    :cond_3
    check-cast p3, La/kuk;

    .line 137
    .line 138
    if-eqz p3, :cond_5

    .line 139
    .line 140
    iget-object p3, p3, La/kuk;->d:La/j0g0;

    .line 141
    .line 142
    if-eqz p3, :cond_5

    .line 143
    .line 144
    iget-object p3, p3, La/j0g0;->a:Ljava/lang/Object;

    .line 145
    .line 146
    new-instance v1, La/btk;

    .line 147
    .line 148
    sget-object v2, La/iun;->a:La/iun;

    .line 149
    .line 150
    invoke-direct {v1, v2, p2}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    instance-of p2, p3, La/g0g0;

    .line 154
    .line 155
    if-eqz p2, :cond_4

    .line 156
    .line 157
    move-object p3, v1

    .line 158
    :cond_4
    check-cast p3, La/btk;

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_5
    move-object p3, p4

    .line 162
    :goto_1
    new-instance p2, La/bsk;

    .line 163
    .line 164
    const/4 v1, 0x4

    .line 165
    invoke-direct {p2, p0, v1}, La/bsk;-><init>(La/csk;B)V

    .line 166
    .line 167
    .line 168
    new-instance v1, La/yw9;

    .line 169
    .line 170
    invoke-direct {v1, p3, p2, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 171
    .line 172
    .line 173
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    iput-object p2, p0, La/csk;->i:La/n0o0;

    .line 178
    .line 179
    if-eqz p1, :cond_7

    .line 180
    .line 181
    iget-object p2, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 182
    .line 183
    instance-of p3, p2, La/g0g0;

    .line 184
    .line 185
    if-eqz p3, :cond_6

    .line 186
    .line 187
    move-object p2, p4

    .line 188
    :cond_6
    check-cast p2, La/kuk;

    .line 189
    .line 190
    if-eqz p2, :cond_7

    .line 191
    .line 192
    invoke-static {p2}, La/obc;->T(La/kuk;)La/zrk;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    goto :goto_2

    .line 197
    :cond_7
    new-instance p2, La/zrk;

    .line 198
    .line 199
    sget-object p3, La/iun;->a:La/iun;

    .line 200
    .line 201
    invoke-direct {p2, p3, p3}, La/zrk;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 202
    .line 203
    .line 204
    :goto_2
    new-instance p3, La/bsk;

    .line 205
    .line 206
    const/4 v1, 0x5

    .line 207
    invoke-direct {p3, p0, v1}, La/bsk;-><init>(La/csk;B)V

    .line 208
    .line 209
    .line 210
    new-instance v1, La/yw9;

    .line 211
    .line 212
    invoke-direct {v1, p2, p3, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 213
    .line 214
    .line 215
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    iput-object p2, p0, La/csk;->j:La/n0o0;

    .line 220
    .line 221
    if-eqz p1, :cond_a

    .line 222
    .line 223
    iget-object p2, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 224
    .line 225
    instance-of p3, p2, La/g0g0;

    .line 226
    .line 227
    if-eqz p3, :cond_8

    .line 228
    .line 229
    move-object p2, p4

    .line 230
    :cond_8
    check-cast p2, La/kuk;

    .line 231
    .line 232
    if-eqz p2, :cond_a

    .line 233
    .line 234
    iget-object p2, p2, La/kuk;->j:Ljava/lang/Object;

    .line 235
    .line 236
    instance-of p3, p2, La/g0g0;

    .line 237
    .line 238
    if-eqz p3, :cond_9

    .line 239
    .line 240
    move-object p2, p4

    .line 241
    :cond_9
    check-cast p2, Ljava/util/List;

    .line 242
    .line 243
    if-nez p2, :cond_b

    .line 244
    .line 245
    :cond_a
    sget-object p2, La/iun;->a:La/iun;

    .line 246
    .line 247
    :cond_b
    invoke-static {p2}, La/kbc;->i0(Ljava/util/List;)La/zrk;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    new-instance p3, La/bsk;

    .line 252
    .line 253
    const/4 v1, 0x6

    .line 254
    invoke-direct {p3, p0, v1}, La/bsk;-><init>(La/csk;B)V

    .line 255
    .line 256
    .line 257
    new-instance v1, La/yw9;

    .line 258
    .line 259
    invoke-direct {v1, p2, p3, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 260
    .line 261
    .line 262
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    iput-object p2, p0, La/csk;->k:La/n0o0;

    .line 267
    .line 268
    if-eqz p1, :cond_e

    .line 269
    .line 270
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 271
    .line 272
    instance-of p2, p1, La/g0g0;

    .line 273
    .line 274
    if-eqz p2, :cond_c

    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_c
    move-object p4, p1

    .line 278
    :goto_3
    check-cast p4, La/kuk;

    .line 279
    .line 280
    if-eqz p4, :cond_e

    .line 281
    .line 282
    iget-object p1, p4, La/kuk;->g:La/j0g0;

    .line 283
    .line 284
    if-eqz p1, :cond_e

    .line 285
    .line 286
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 287
    .line 288
    sget-object p2, La/iun;->a:La/iun;

    .line 289
    .line 290
    instance-of p3, p1, La/g0g0;

    .line 291
    .line 292
    if-eqz p3, :cond_d

    .line 293
    .line 294
    move-object p1, p2

    .line 295
    :cond_d
    check-cast p1, Ljava/util/List;

    .line 296
    .line 297
    if-nez p1, :cond_f

    .line 298
    .line 299
    :cond_e
    sget-object p1, La/iun;->a:La/iun;

    .line 300
    .line 301
    :cond_f
    new-instance p2, La/bsk;

    .line 302
    .line 303
    const/4 p3, 0x7

    .line 304
    invoke-direct {p2, p0, p3}, La/bsk;-><init>(La/csk;B)V

    .line 305
    .line 306
    .line 307
    new-instance p3, La/yw9;

    .line 308
    .line 309
    invoke-direct {p3, p1, p2, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 310
    .line 311
    .line 312
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    iput-object p1, p0, La/csk;->l:La/n0o0;

    .line 317
    .line 318
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, La/ksk;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, La/ksk;->d:La/j0g0;

    .line 7
    .line 8
    iget-object v1, p1, La/ksk;->c:La/j0g0;

    .line 9
    .line 10
    if-eqz v0, :cond_4

    .line 11
    .line 12
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 13
    .line 14
    instance-of v2, v0, La/g0g0;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    move-object v0, v3

    .line 20
    :cond_0
    check-cast v0, La/kuk;

    .line 21
    .line 22
    invoke-static {v0}, La/hic;->w(La/kuk;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/csk;->e:La/n0o0;

    .line 31
    .line 32
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, La/fee;

    .line 37
    .line 38
    if-nez v0, :cond_3

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    iget-object v0, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 43
    .line 44
    instance-of v5, v0, La/g0g0;

    .line 45
    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v3, v0

    .line 50
    :goto_0
    check-cast v3, La/jtk;

    .line 51
    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    iget-boolean v0, v3, La/jtk;->a:Z

    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, La/fee;

    .line 66
    .line 67
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v3, v0

    .line 72
    check-cast v3, Ljava/lang/Boolean;

    .line 73
    .line 74
    :cond_3
    :goto_1
    invoke-virtual {v4, v3}, La/fee;->d(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    iget-object v0, p0, La/csk;->f:La/n0o0;

    .line 78
    .line 79
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, La/fee;

    .line 84
    .line 85
    invoke-virtual {v2, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    new-instance v1, La/tsk;

    .line 89
    .line 90
    iget-object v2, p0, La/csk;->a:La/ksk;

    .line 91
    .line 92
    iget-object v2, v2, La/ksk;->b:La/sff0;

    .line 93
    .line 94
    iget-object v2, v2, La/sff0;->c:La/ech;

    .line 95
    .line 96
    iget-object v2, v2, La/ech;->q:La/n2o;

    .line 97
    .line 98
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, La/fee;

    .line 103
    .line 104
    iget-object v0, v0, La/fee;->e:La/zbk;

    .line 105
    .line 106
    iget-object v3, p1, La/ksk;->b:La/sff0;

    .line 107
    .line 108
    iget-object v4, v3, La/sff0;->c:La/ech;

    .line 109
    .line 110
    iget-object v5, v4, La/ech;->q:La/n2o;

    .line 111
    .line 112
    iget-object v3, v3, La/sff0;->g:La/mum0;

    .line 113
    .line 114
    iget-object v6, v3, La/mum0;->y:La/v5l0;

    .line 115
    .line 116
    iget-object v7, p1, La/ksk;->d:La/j0g0;

    .line 117
    .line 118
    iget-object v9, p1, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 119
    .line 120
    new-instance v11, La/lrk;

    .line 121
    .line 122
    const/4 v3, 0x1

    .line 123
    invoke-direct {v11, p0, p1, v3}, La/lrk;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    iget-object v8, p0, La/csk;->c:La/g2v;

    .line 127
    .line 128
    const/4 v10, 0x0

    .line 129
    invoke-static/range {v5 .. v11}, La/xbc;->P(La/n2o;La/v5l0;La/j0g0;La/g2v;Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;ZLkotlin/jvm/functions/Function0;)La/gsk;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-direct {v1, v2, v0, p0}, La/tsk;-><init>(La/n2o;La/l7m0;La/gsk;)V

    .line 134
    .line 135
    .line 136
    return-object v1
.end method
