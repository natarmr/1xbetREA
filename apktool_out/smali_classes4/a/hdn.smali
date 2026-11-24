.class public final La/hdn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final synthetic a:B

.field public final b:La/ctf0;

.field public final c:Z

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public final g:La/n0o0;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/cdn;ZLa/udl0;ZLa/ctf0;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/hdn;->a:B

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p3, p0, La/hdn;->h:Ljava/lang/Object;

    .line 100
    iput-boolean p4, p0, La/hdn;->c:Z

    .line 101
    iput-object p5, p0, La/hdn;->b:La/ctf0;

    .line 102
    iget-object p3, p1, La/cdn;->b:Ljava/util/List;

    .line 103
    invoke-static {p3}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p3

    iput-object p3, p0, La/hdn;->d:La/n0o0;

    .line 104
    iget-object p4, p1, La/cdn;->a:Ljava/util/List;

    .line 105
    invoke-static {p4}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p4

    iput-object p4, p0, La/hdn;->e:La/n0o0;

    .line 106
    iget-object p1, p1, La/cdn;->g:La/aw20;

    .line 107
    invoke-static {p1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p1

    iput-object p1, p0, La/hdn;->f:La/n0o0;

    .line 108
    invoke-virtual {p3}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/fee;

    .line 109
    new-instance p3, La/x9;

    const/16 p4, 0x15

    invoke-direct {p3, p2, p0, p4}, La/x9;-><init>(ZLjava/lang/Object;B)V

    .line 110
    new-instance p2, La/yw9;

    const/16 p4, 0x14

    invoke-direct {p2, p1, p3, p4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    .line 111
    iput-object p1, p0, La/hdn;->g:La/n0o0;

    return-void
.end method

.method public constructor <init>(La/tzh0;La/ctf0;Z)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/hdn;->a:B

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/hdn;->b:La/ctf0;

    .line 11
    .line 12
    iput-boolean p3, p0, La/hdn;->c:Z

    .line 13
    .line 14
    iget-wide p2, p1, La/tzh0;->d:J

    .line 15
    .line 16
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, La/hdn;->d:La/n0o0;

    .line 25
    .line 26
    iget-wide p2, p1, La/tzh0;->e:J

    .line 27
    .line 28
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iput-object p2, p0, La/hdn;->e:La/n0o0;

    .line 37
    .line 38
    iget-object p2, p1, La/tzh0;->c:Ljava/util/List;

    .line 39
    .line 40
    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p0, La/hdn;->f:La/n0o0;

    .line 45
    .line 46
    new-instance p2, La/nzh0;

    .line 47
    .line 48
    new-instance p3, La/v2h;

    .line 49
    .line 50
    sget-object v0, La/ldm;->a:La/ldm;

    .line 51
    .line 52
    sget-object v0, La/pb10;->c:La/xuz;

    .line 53
    .line 54
    const-wide/16 v1, 0x2e

    .line 55
    .line 56
    invoke-static {v1, v2}, La/ozb;->K(J)La/pb10;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget v0, v1, La/pb10;->a:I

    .line 64
    .line 65
    invoke-direct {p3, v0}, La/v2h;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p2, p3}, La/nzh0;-><init>(La/v2h;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    iput-object p2, p0, La/hdn;->h:Ljava/lang/Object;

    .line 76
    .line 77
    new-instance p2, La/gwg0;

    .line 78
    .line 79
    const/16 p3, 0x15

    .line 80
    .line 81
    invoke-direct {p2, p0, p3}, La/gwg0;-><init>(Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    new-instance p3, La/yw9;

    .line 85
    .line 86
    const/16 v0, 0x14

    .line 87
    .line 88
    invoke-direct {p3, p1, p2, v0}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, p0, La/hdn;->g:La/n0o0;

    .line 96
    .line 97
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hdn;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/hdn;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/hdn;->g:La/n0o0;

    .line 8
    .line 9
    iget-object v4, v0, La/hdn;->f:La/n0o0;

    .line 10
    .line 11
    iget-object v5, v0, La/hdn;->e:La/n0o0;

    .line 12
    .line 13
    iget-object v6, v0, La/hdn;->d:La/n0o0;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/tzh0;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    check-cast v6, La/fee;

    .line 30
    .line 31
    iget-wide v7, v1, La/tzh0;->d:J

    .line 32
    .line 33
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    invoke-virtual {v6, v9}, La/fee;->d(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, La/fee;

    .line 45
    .line 46
    iget-wide v9, v1, La/tzh0;->e:J

    .line 47
    .line 48
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v5, v6}, La/fee;->d(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, La/fee;

    .line 60
    .line 61
    iget-object v5, v1, La/tzh0;->c:Ljava/util/List;

    .line 62
    .line 63
    invoke-virtual {v4, v5}, La/fee;->d(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, La/fee;

    .line 71
    .line 72
    invoke-virtual {v4, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object v4, v1, La/tzh0;->a:La/new;

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    if-eqz v4, :cond_2

    .line 79
    .line 80
    iget-object v6, v4, La/new;->b:Ljava/util/List;

    .line 81
    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    if-eqz v11, :cond_1

    .line 93
    .line 94
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    move-object v12, v11

    .line 99
    check-cast v12, La/vcw;

    .line 100
    .line 101
    iget-wide v12, v12, La/vcw;->a:J

    .line 102
    .line 103
    cmp-long v12, v12, v7

    .line 104
    .line 105
    if-nez v12, :cond_0

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    move-object v11, v5

    .line 109
    :goto_0
    check-cast v11, La/vcw;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    move-object v11, v5

    .line 113
    :goto_1
    if-eqz v11, :cond_5

    .line 114
    .line 115
    iget-object v6, v11, La/vcw;->c:Ljava/util/List;

    .line 116
    .line 117
    if-eqz v6, :cond_5

    .line 118
    .line 119
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-eqz v7, :cond_4

    .line 128
    .line 129
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    move-object v8, v7

    .line 134
    check-cast v8, La/jdw;

    .line 135
    .line 136
    iget-wide v11, v8, La/jdw;->a:J

    .line 137
    .line 138
    cmp-long v8, v11, v9

    .line 139
    .line 140
    if-nez v8, :cond_3

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_4
    move-object v7, v5

    .line 144
    :goto_2
    check-cast v7, La/jdw;

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_5
    move-object v7, v5

    .line 148
    :goto_3
    iget-object v8, v1, La/tzh0;->a:La/new;

    .line 149
    .line 150
    iget-wide v9, v1, La/tzh0;->d:J

    .line 151
    .line 152
    if-eqz v7, :cond_6

    .line 153
    .line 154
    iget-object v6, v7, La/jdw;->b:Ljava/lang/String;

    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_6
    move-object v6, v5

    .line 158
    :goto_4
    if-nez v6, :cond_7

    .line 159
    .line 160
    const-string v6, ""

    .line 161
    .line 162
    :cond_7
    move-object v11, v6

    .line 163
    iget-boolean v12, v0, La/hdn;->c:Z

    .line 164
    .line 165
    const/4 v13, 0x1

    .line 166
    invoke-static/range {v8 .. v13}, La/yew;->a(La/new;JLjava/lang/String;ZZ)La/xew;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v2, La/pz40;

    .line 175
    .line 176
    const-wide/16 v6, 0x2e

    .line 177
    .line 178
    if-nez v4, :cond_8

    .line 179
    .line 180
    new-instance v1, La/mzh0;

    .line 181
    .line 182
    sget-object v11, La/ldm;->b:La/ldm;

    .line 183
    .line 184
    sget-object v3, La/pb10;->c:La/xuz;

    .line 185
    .line 186
    sget-object v4, La/pb10;->v:La/pb10;

    .line 187
    .line 188
    invoke-static {v6, v7, v4}, La/ozb;->J(JLa/pb10;)La/pb10;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    iget v9, v4, La/pb10;->a:I

    .line 196
    .line 197
    new-instance v8, La/mdm;

    .line 198
    .line 199
    const-wide/16 v19, 0x0

    .line 200
    .line 201
    const/16 v21, 0x25a

    .line 202
    .line 203
    const/4 v10, 0x0

    .line 204
    const/4 v12, 0x0

    .line 205
    const/4 v13, 0x0

    .line 206
    const v14, 0x7f130677

    .line 207
    .line 208
    .line 209
    const/4 v15, 0x0

    .line 210
    const v16, 0x7f131690

    .line 211
    .line 212
    .line 213
    const-wide/16 v17, 0x2710

    .line 214
    .line 215
    invoke-direct/range {v8 .. v21}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 216
    .line 217
    .line 218
    invoke-direct {v1, v8}, La/mzh0;-><init>(La/mdm;)V

    .line 219
    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_8
    iget-object v1, v1, La/tzh0;->b:La/edw;

    .line 223
    .line 224
    if-eqz v1, :cond_a

    .line 225
    .line 226
    iget-object v4, v1, La/edw;->b:Ljava/lang/Object;

    .line 227
    .line 228
    sget-object v8, La/j0g0;->b:La/e0g0;

    .line 229
    .line 230
    instance-of v8, v4, La/g0g0;

    .line 231
    .line 232
    if-eqz v8, :cond_9

    .line 233
    .line 234
    move-object v4, v5

    .line 235
    :cond_9
    check-cast v4, La/m9s;

    .line 236
    .line 237
    goto :goto_5

    .line 238
    :cond_a
    move-object v4, v5

    .line 239
    :goto_5
    if-nez v4, :cond_e

    .line 240
    .line 241
    if-eqz v1, :cond_c

    .line 242
    .line 243
    iget-object v1, v1, La/edw;->a:Ljava/lang/Object;

    .line 244
    .line 245
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 246
    .line 247
    instance-of v4, v1, La/g0g0;

    .line 248
    .line 249
    if-eqz v4, :cond_b

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_b
    move-object v5, v1

    .line 253
    :goto_6
    check-cast v5, La/m9s;

    .line 254
    .line 255
    :cond_c
    if-eqz v5, :cond_d

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_d
    new-instance v1, La/nzh0;

    .line 259
    .line 260
    new-instance v3, La/v2h;

    .line 261
    .line 262
    sget-object v4, La/ldm;->a:La/ldm;

    .line 263
    .line 264
    sget-object v4, La/pb10;->c:La/xuz;

    .line 265
    .line 266
    invoke-static {v6, v7}, La/ozb;->K(J)La/pb10;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    iget v4, v5, La/pb10;->a:I

    .line 274
    .line 275
    invoke-direct {v3, v4}, La/v2h;-><init>(I)V

    .line 276
    .line 277
    .line 278
    invoke-direct {v1, v3}, La/nzh0;-><init>(La/v2h;)V

    .line 279
    .line 280
    .line 281
    goto :goto_8

    .line 282
    :cond_e
    :goto_7
    new-instance v1, La/lzh0;

    .line 283
    .line 284
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    check-cast v3, La/fee;

    .line 289
    .line 290
    invoke-virtual {v3}, La/fee;->b()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    check-cast v3, Ljava/lang/Iterable;

    .line 295
    .line 296
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    invoke-static {v3}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-direct {v1, v3}, La/lzh0;-><init>(La/l7m0;)V

    .line 305
    .line 306
    .line 307
    :goto_8
    check-cast v2, La/hgk0;

    .line 308
    .line 309
    invoke-virtual {v2, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    new-instance v1, La/vzh0;

    .line 313
    .line 314
    invoke-direct {v1, v0, v2}, La/vzh0;-><init>(La/l7m0;La/l7m0;)V

    .line 315
    .line 316
    .line 317
    return-object v1

    .line 318
    :pswitch_0
    move-object/from16 v1, p1

    .line 319
    .line 320
    check-cast v1, La/cdn;

    .line 321
    .line 322
    check-cast v2, La/udl0;

    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    check-cast v5, La/fee;

    .line 332
    .line 333
    iget-object v7, v1, La/cdn;->a:Ljava/util/List;

    .line 334
    .line 335
    iget-boolean v8, v1, La/cdn;->h:Z

    .line 336
    .line 337
    invoke-virtual {v5, v7}, La/fee;->d(Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    check-cast v5, La/fee;

    .line 345
    .line 346
    iget-object v7, v1, La/cdn;->b:Ljava/util/List;

    .line 347
    .line 348
    invoke-virtual {v5, v7}, La/fee;->d(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    check-cast v4, La/fee;

    .line 356
    .line 357
    iget-object v5, v1, La/cdn;->g:La/aw20;

    .line 358
    .line 359
    invoke-virtual {v4, v5}, La/fee;->d(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    iget-boolean v4, v1, La/cdn;->e:Z

    .line 363
    .line 364
    iget-boolean v0, v0, La/hdn;->c:Z

    .line 365
    .line 366
    if-eqz v4, :cond_f

    .line 367
    .line 368
    new-instance v1, La/edn;

    .line 369
    .line 370
    invoke-direct {v1, v2, v0, v8}, La/edn;-><init>(La/udl0;ZZ)V

    .line 371
    .line 372
    .line 373
    goto/16 :goto_d

    .line 374
    .line 375
    :cond_f
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v4

    .line 379
    check-cast v4, La/fee;

    .line 380
    .line 381
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    check-cast v4, Ljava/util/List;

    .line 386
    .line 387
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    if-eqz v4, :cond_15

    .line 392
    .line 393
    new-instance v0, La/fdn;

    .line 394
    .line 395
    iget-object v1, v1, La/cdn;->c:La/l9s;

    .line 396
    .line 397
    const/4 v3, 0x0

    .line 398
    if-eqz v1, :cond_10

    .line 399
    .line 400
    invoke-interface {v1}, La/l9s;->e()Z

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    const/4 v5, 0x1

    .line 405
    if-ne v4, v5, :cond_10

    .line 406
    .line 407
    move v7, v5

    .line 408
    goto :goto_9

    .line 409
    :cond_10
    move v7, v3

    .line 410
    :goto_9
    const-wide/16 v3, -0x1

    .line 411
    .line 412
    if-eqz v1, :cond_11

    .line 413
    .line 414
    invoke-interface {v1}, La/l9s;->a()J

    .line 415
    .line 416
    .line 417
    move-result-wide v5

    .line 418
    move-wide v8, v5

    .line 419
    goto :goto_a

    .line 420
    :cond_11
    move-wide v8, v3

    .line 421
    :goto_a
    if-eqz v1, :cond_12

    .line 422
    .line 423
    invoke-interface {v1}, La/l9s;->b()J

    .line 424
    .line 425
    .line 426
    move-result-wide v5

    .line 427
    move-wide v14, v5

    .line 428
    goto :goto_b

    .line 429
    :cond_12
    move-wide v14, v3

    .line 430
    :goto_b
    if-eqz v1, :cond_13

    .line 431
    .line 432
    invoke-interface {v1}, La/l9s;->c()J

    .line 433
    .line 434
    .line 435
    move-result-wide v5

    .line 436
    move-wide v10, v5

    .line 437
    goto :goto_c

    .line 438
    :cond_13
    move-wide v10, v3

    .line 439
    :goto_c
    if-eqz v1, :cond_14

    .line 440
    .line 441
    invoke-interface {v1}, La/l9s;->d()J

    .line 442
    .line 443
    .line 444
    move-result-wide v3

    .line 445
    :cond_14
    move-wide v12, v3

    .line 446
    sget-object v16, La/tef0;->b:La/tef0;

    .line 447
    .line 448
    sget-object v1, La/pb10;->c:La/xuz;

    .line 449
    .line 450
    new-instance v6, Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 451
    .line 452
    invoke-direct/range {v6 .. v16}, Lorg/xplatform/related/api/presentation/RelatedParams;-><init>(ZJJJJLa/tef0;)V

    .line 453
    .line 454
    .line 455
    invoke-direct {v0, v2, v6}, La/fdn;-><init>(La/udl0;Lorg/xplatform/related/api/presentation/RelatedParams;)V

    .line 456
    .line 457
    .line 458
    move-object v1, v0

    .line 459
    goto :goto_d

    .line 460
    :cond_15
    new-instance v1, La/ddn;

    .line 461
    .line 462
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    check-cast v3, La/fee;

    .line 467
    .line 468
    invoke-virtual {v3}, La/fee;->b()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    check-cast v3, Ljava/lang/Iterable;

    .line 473
    .line 474
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-direct {v1, v2, v0, v3, v8}, La/ddn;-><init>(La/udl0;ZLa/a4x;Z)V

    .line 479
    .line 480
    .line 481
    :goto_d
    return-object v1

    .line 482
    nop

    .line 483
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
