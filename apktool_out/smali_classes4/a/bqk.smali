.class public final La/bqk;
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


# direct methods
.method public constructor <init>(La/ksk;La/ctf0;La/g2v;La/y78;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/bqk;->a:La/ksk;

    .line 8
    .line 9
    iput-object p2, p0, La/bqk;->b:La/ctf0;

    .line 10
    .line 11
    iput-object p3, p0, La/bqk;->c:La/g2v;

    .line 12
    .line 13
    iput-object p4, p0, La/bqk;->d:La/y78;

    .line 14
    .line 15
    new-instance p2, La/aqk;

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-direct {p2, p0, p3}, La/aqk;-><init>(La/bqk;B)V

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
    iput-object p2, p0, La/bqk;->e:La/n0o0;

    .line 34
    .line 35
    iget-object p2, p1, La/ksk;->c:La/j0g0;

    .line 36
    .line 37
    new-instance p3, La/aqk;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-direct {p3, p0, v1}, La/aqk;-><init>(La/bqk;B)V

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
    move-result-object p2

    .line 52
    iput-object p2, p0, La/bqk;->f:La/n0o0;

    .line 53
    .line 54
    iget-object p1, p1, La/ksk;->d:La/j0g0;

    .line 55
    .line 56
    const-string p2, ""

    .line 57
    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    iget-object p3, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 61
    .line 62
    instance-of v1, p3, La/g0g0;

    .line 63
    .line 64
    if-eqz v1, :cond_0

    .line 65
    .line 66
    move-object p3, p4

    .line 67
    :cond_0
    check-cast p3, La/kuk;

    .line 68
    .line 69
    if-eqz p3, :cond_2

    .line 70
    .line 71
    iget-object p3, p3, La/kuk;->c:La/j0g0;

    .line 72
    .line 73
    if-eqz p3, :cond_2

    .line 74
    .line 75
    iget-object p3, p3, La/j0g0;->a:Ljava/lang/Object;

    .line 76
    .line 77
    new-instance v1, La/btk;

    .line 78
    .line 79
    sget-object v2, La/iun;->a:La/iun;

    .line 80
    .line 81
    invoke-direct {v1, v2, p2}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    instance-of v2, p3, La/g0g0;

    .line 85
    .line 86
    if-eqz v2, :cond_1

    .line 87
    .line 88
    move-object p3, v1

    .line 89
    :cond_1
    check-cast p3, La/btk;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    move-object p3, p4

    .line 93
    :goto_0
    new-instance v1, La/aqk;

    .line 94
    .line 95
    const/4 v2, 0x2

    .line 96
    invoke-direct {v1, p0, v2}, La/aqk;-><init>(La/bqk;B)V

    .line 97
    .line 98
    .line 99
    new-instance v2, La/yw9;

    .line 100
    .line 101
    invoke-direct {v2, p3, v1, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    iput-object p3, p0, La/bqk;->g:La/n0o0;

    .line 109
    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    iget-object p3, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 113
    .line 114
    instance-of v1, p3, La/g0g0;

    .line 115
    .line 116
    if-eqz v1, :cond_3

    .line 117
    .line 118
    move-object p3, p4

    .line 119
    :cond_3
    check-cast p3, La/kuk;

    .line 120
    .line 121
    if-eqz p3, :cond_5

    .line 122
    .line 123
    iget-object p3, p3, La/kuk;->d:La/j0g0;

    .line 124
    .line 125
    if-eqz p3, :cond_5

    .line 126
    .line 127
    iget-object p3, p3, La/j0g0;->a:Ljava/lang/Object;

    .line 128
    .line 129
    new-instance v1, La/btk;

    .line 130
    .line 131
    sget-object v2, La/iun;->a:La/iun;

    .line 132
    .line 133
    invoke-direct {v1, v2, p2}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    instance-of p2, p3, La/g0g0;

    .line 137
    .line 138
    if-eqz p2, :cond_4

    .line 139
    .line 140
    move-object p3, v1

    .line 141
    :cond_4
    check-cast p3, La/btk;

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_5
    move-object p3, p4

    .line 145
    :goto_1
    new-instance p2, La/aqk;

    .line 146
    .line 147
    const/4 v1, 0x3

    .line 148
    invoke-direct {p2, p0, v1}, La/aqk;-><init>(La/bqk;B)V

    .line 149
    .line 150
    .line 151
    new-instance v1, La/yw9;

    .line 152
    .line 153
    invoke-direct {v1, p3, p2, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 154
    .line 155
    .line 156
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    iput-object p2, p0, La/bqk;->h:La/n0o0;

    .line 161
    .line 162
    if-eqz p1, :cond_8

    .line 163
    .line 164
    iget-object p2, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 165
    .line 166
    instance-of p3, p2, La/g0g0;

    .line 167
    .line 168
    if-eqz p3, :cond_6

    .line 169
    .line 170
    move-object p2, p4

    .line 171
    :cond_6
    check-cast p2, La/kuk;

    .line 172
    .line 173
    if-eqz p2, :cond_8

    .line 174
    .line 175
    iget-object p2, p2, La/kuk;->g:La/j0g0;

    .line 176
    .line 177
    if-eqz p2, :cond_8

    .line 178
    .line 179
    iget-object p2, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 180
    .line 181
    sget-object p3, La/iun;->a:La/iun;

    .line 182
    .line 183
    instance-of v1, p2, La/g0g0;

    .line 184
    .line 185
    if-eqz v1, :cond_7

    .line 186
    .line 187
    move-object p2, p3

    .line 188
    :cond_7
    check-cast p2, Ljava/util/List;

    .line 189
    .line 190
    if-nez p2, :cond_9

    .line 191
    .line 192
    :cond_8
    sget-object p3, La/iun;->a:La/iun;

    .line 193
    .line 194
    move-object p2, p3

    .line 195
    :cond_9
    new-instance v1, La/aqk;

    .line 196
    .line 197
    const/4 v2, 0x4

    .line 198
    invoke-direct {v1, p0, v2}, La/aqk;-><init>(La/bqk;B)V

    .line 199
    .line 200
    .line 201
    new-instance v2, La/yw9;

    .line 202
    .line 203
    invoke-direct {v2, p2, v1, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 204
    .line 205
    .line 206
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    iput-object p2, p0, La/bqk;->i:La/n0o0;

    .line 211
    .line 212
    new-instance p2, La/mpk;

    .line 213
    .line 214
    if-eqz p1, :cond_c

    .line 215
    .line 216
    iget-object v1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 217
    .line 218
    instance-of v2, v1, La/g0g0;

    .line 219
    .line 220
    if-eqz v2, :cond_a

    .line 221
    .line 222
    move-object v1, p4

    .line 223
    :cond_a
    check-cast v1, La/kuk;

    .line 224
    .line 225
    if-eqz v1, :cond_c

    .line 226
    .line 227
    iget-object v1, v1, La/kuk;->a:La/j0g0;

    .line 228
    .line 229
    if-eqz v1, :cond_c

    .line 230
    .line 231
    iget-object v1, v1, La/j0g0;->a:Ljava/lang/Object;

    .line 232
    .line 233
    instance-of v2, v1, La/g0g0;

    .line 234
    .line 235
    if-eqz v2, :cond_b

    .line 236
    .line 237
    move-object v1, p4

    .line 238
    :cond_b
    check-cast v1, Ljava/util/List;

    .line 239
    .line 240
    if-nez v1, :cond_d

    .line 241
    .line 242
    :cond_c
    move-object v1, p3

    .line 243
    :cond_d
    if-eqz p1, :cond_10

    .line 244
    .line 245
    iget-object v2, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 246
    .line 247
    instance-of v3, v2, La/g0g0;

    .line 248
    .line 249
    if-eqz v3, :cond_e

    .line 250
    .line 251
    move-object v2, p4

    .line 252
    :cond_e
    check-cast v2, La/kuk;

    .line 253
    .line 254
    if-eqz v2, :cond_10

    .line 255
    .line 256
    iget-object v2, v2, La/kuk;->b:La/j0g0;

    .line 257
    .line 258
    if-eqz v2, :cond_10

    .line 259
    .line 260
    iget-object v2, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 261
    .line 262
    instance-of v3, v2, La/g0g0;

    .line 263
    .line 264
    if-eqz v3, :cond_f

    .line 265
    .line 266
    move-object v2, p4

    .line 267
    :cond_f
    check-cast v2, Ljava/util/List;

    .line 268
    .line 269
    if-nez v2, :cond_11

    .line 270
    .line 271
    :cond_10
    move-object v2, p3

    .line 272
    :cond_11
    invoke-direct {p2, v1, v2}, La/mpk;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 273
    .line 274
    .line 275
    new-instance v1, La/aqk;

    .line 276
    .line 277
    const/4 v2, 0x5

    .line 278
    invoke-direct {v1, p0, v2}, La/aqk;-><init>(La/bqk;B)V

    .line 279
    .line 280
    .line 281
    new-instance v2, La/yw9;

    .line 282
    .line 283
    invoke-direct {v2, p2, v1, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 284
    .line 285
    .line 286
    invoke-static {v2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 287
    .line 288
    .line 289
    move-result-object p2

    .line 290
    iput-object p2, p0, La/bqk;->j:La/n0o0;

    .line 291
    .line 292
    if-eqz p1, :cond_15

    .line 293
    .line 294
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 295
    .line 296
    instance-of p2, p1, La/g0g0;

    .line 297
    .line 298
    if-eqz p2, :cond_12

    .line 299
    .line 300
    move-object p1, p4

    .line 301
    :cond_12
    check-cast p1, La/kuk;

    .line 302
    .line 303
    if-eqz p1, :cond_15

    .line 304
    .line 305
    iget-object p1, p1, La/kuk;->j:Ljava/lang/Object;

    .line 306
    .line 307
    instance-of p2, p1, La/g0g0;

    .line 308
    .line 309
    if-eqz p2, :cond_13

    .line 310
    .line 311
    goto :goto_2

    .line 312
    :cond_13
    move-object p4, p1

    .line 313
    :goto_2
    check-cast p4, Ljava/util/List;

    .line 314
    .line 315
    if-nez p4, :cond_14

    .line 316
    .line 317
    goto :goto_3

    .line 318
    :cond_14
    move-object p3, p4

    .line 319
    :cond_15
    :goto_3
    new-instance p1, La/aqk;

    .line 320
    .line 321
    const/4 p2, 0x6

    .line 322
    invoke-direct {p1, p0, p2}, La/aqk;-><init>(La/bqk;B)V

    .line 323
    .line 324
    .line 325
    new-instance p2, La/yw9;

    .line 326
    .line 327
    invoke-direct {p2, p3, p1, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 328
    .line 329
    .line 330
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 331
    .line 332
    .line 333
    move-result-object p1

    .line 334
    iput-object p1, p0, La/bqk;->k:La/n0o0;

    .line 335
    .line 336
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
    iget-object v2, p0, La/bqk;->e:La/n0o0;

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
    new-instance v0, La/tsk;

    .line 78
    .line 79
    iget-object v2, p0, La/bqk;->a:La/ksk;

    .line 80
    .line 81
    iget-object v2, v2, La/ksk;->b:La/sff0;

    .line 82
    .line 83
    iget-object v2, v2, La/sff0;->c:La/ech;

    .line 84
    .line 85
    iget-object v2, v2, La/ech;->q:La/n2o;

    .line 86
    .line 87
    iget-object v3, p0, La/bqk;->f:La/n0o0;

    .line 88
    .line 89
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, La/fee;

    .line 94
    .line 95
    iget-object v4, v4, La/fee;->e:La/zbk;

    .line 96
    .line 97
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, La/fee;

    .line 102
    .line 103
    invoke-virtual {v3, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p1, La/ksk;->b:La/sff0;

    .line 107
    .line 108
    iget-object v3, v1, La/sff0;->c:La/ech;

    .line 109
    .line 110
    iget-object v5, v3, La/ech;->q:La/n2o;

    .line 111
    .line 112
    iget-object v1, v1, La/sff0;->g:La/mum0;

    .line 113
    .line 114
    iget-object v6, v1, La/mum0;->y:La/v5l0;

    .line 115
    .line 116
    iget-object v7, p1, La/ksk;->d:La/j0g0;

    .line 117
    .line 118
    iget-object v9, p1, La/ksk;->a:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;

    .line 119
    .line 120
    iget-object v1, v9, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 121
    .line 122
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 123
    .line 124
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    new-instance v11, La/vef;

    .line 129
    .line 130
    const/16 v1, 0x1b

    .line 131
    .line 132
    invoke-direct {v11, p0, p1, v1}, La/vef;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    iget-object v8, p0, La/bqk;->c:La/g2v;

    .line 136
    .line 137
    invoke-static/range {v5 .. v11}, La/xbc;->P(La/n2o;La/v5l0;La/j0g0;La/g2v;Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineDetailsParams;ZLkotlin/jvm/functions/Function0;)La/gsk;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-direct {v0, v2, v4, p0}, La/tsk;-><init>(La/n2o;La/l7m0;La/gsk;)V

    .line 142
    .line 143
    .line 144
    return-object v0
.end method
