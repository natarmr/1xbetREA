.class public final La/lja0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/lja0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/jh70",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final n2:La/jh70;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/kiu0;

.field public final m2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/lja0;

    .line 4
    .line 5
    const-string v2, "teamId"

    .line 6
    .line 7
    const-string v3, "getTeamId()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/lja0;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/jh70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/lja0;->n2:La/jh70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/l3a0;

    .line 5
    .line 6
    const/16 v1, 0x16

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, La/l3a0;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v2, La/wz80;

    .line 12
    .line 13
    const/16 v3, 0x15

    .line 14
    .line 15
    invoke-direct {v2, p0, v3}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    sget-object v4, La/wez;->b:La/wez;

    .line 19
    .line 20
    new-instance v5, La/wz80;

    .line 21
    .line 22
    invoke-direct {v5, v2, v1}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {v4, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-class v2, La/qja0;

    .line 30
    .line 31
    sget-object v4, La/sre0;->a:La/tre0;

    .line 32
    .line 33
    invoke-virtual {v4, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v4, La/a190;

    .line 38
    .line 39
    const/16 v5, 0x14

    .line 40
    .line 41
    invoke-direct {v4, v1, v5}, La/a190;-><init>(La/a8z;B)V

    .line 42
    .line 43
    .line 44
    new-instance v5, La/a190;

    .line 45
    .line 46
    invoke-direct {v5, v1, v3}, La/a190;-><init>(La/a8z;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0, v2, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/lja0;->l2:La/kiu0;

    .line 54
    .line 55
    new-instance v0, La/phf0;

    .line 56
    .line 57
    const-string v1, "TEAM_ID_KEY"

    .line 58
    .line 59
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, La/lja0;->m2:La/phf0;

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 7

    .line 1
    const v0, 0x98815c3

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/lja0;->l2:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/qja0;

    .line 14
    .line 15
    sget v1, La/qja0;->r:I

    .line 16
    .line 17
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, La/bw5;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-static {v2, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget-object v3, La/x4d0;->d:La/ugd;

    .line 29
    .line 30
    new-instance v4, La/in80;

    .line 31
    .line 32
    const/4 v5, 0x3

    .line 33
    invoke-direct {v4, v0, p0, v5}, La/in80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    const p0, 0x1603d6f2

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const/16 v6, 0xa

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 51
    .line 52
    .line 53
    return-object v1
.end method

.method public final P0(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 33

    .line 1
    move/from16 v3, p2

    .line 2
    .line 3
    move/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v8, p5

    .line 6
    .line 7
    const v0, 0x62c9ba4b

    .line 8
    .line 9
    .line 10
    invoke-virtual {v8, v0}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p1

    .line 14
    .line 15
    invoke-virtual {v8, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    :goto_0
    or-int v0, p6, v0

    .line 25
    .line 26
    invoke-virtual {v8, v3}, La/fet;->h(Z)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const/16 v1, 0x20

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v1, 0x10

    .line 36
    .line 37
    :goto_1
    or-int/2addr v0, v1

    .line 38
    invoke-virtual {v8, v4}, La/fet;->h(Z)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/16 v1, 0x100

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v1, 0x80

    .line 48
    .line 49
    :goto_2
    or-int/2addr v0, v1

    .line 50
    move-object/from16 v14, p4

    .line 51
    .line 52
    invoke-virtual {v8, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    const/16 v1, 0x800

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/16 v1, 0x400

    .line 62
    .line 63
    :goto_3
    or-int/2addr v0, v1

    .line 64
    and-int/lit16 v1, v0, 0x493

    .line 65
    .line 66
    const/16 v5, 0x492

    .line 67
    .line 68
    const/4 v7, 0x0

    .line 69
    if-eq v1, v5, :cond_4

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    goto :goto_4

    .line 73
    :cond_4
    move v1, v7

    .line 74
    :goto_4
    and-int/lit8 v5, v0, 0x1

    .line 75
    .line 76
    invoke-virtual {v8, v5, v1}, La/fet;->U(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_9

    .line 81
    .line 82
    const/high16 v1, 0x3f800000    # 1.0f

    .line 83
    .line 84
    sget-object v5, La/jm40;->b:La/jm40;

    .line 85
    .line 86
    invoke-static {v5, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    const/4 v13, 0x0

    .line 91
    const/16 v15, 0x1c

    .line 92
    .line 93
    const/4 v10, 0x0

    .line 94
    const/4 v11, 0x0

    .line 95
    const/4 v12, 0x0

    .line 96
    invoke-static/range {v9 .. v15}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    sget-object v9, La/uc9;->c:La/mw3;

    .line 101
    .line 102
    sget-object v10, La/gqw0;->m:La/xx7;

    .line 103
    .line 104
    invoke-static {v9, v10, v8, v7}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    iget-wide v10, v8, La/fet;->T:J

    .line 109
    .line 110
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    invoke-static {v8, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 123
    .line 124
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v8}, La/fet;->i0()V

    .line 128
    .line 129
    .line 130
    iget-boolean v12, v8, La/fet;->S:Z

    .line 131
    .line 132
    sget-object v13, La/e7z;->u1:La/pcy;

    .line 133
    .line 134
    if-eqz v12, :cond_5

    .line 135
    .line 136
    invoke-virtual {v8, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 137
    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_5
    invoke-virtual {v8}, La/fet;->r0()V

    .line 141
    .line 142
    .line 143
    :goto_5
    sget-object v12, La/gqw0;->x:La/shd;

    .line 144
    .line 145
    invoke-static {v8, v9, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 146
    .line 147
    .line 148
    sget-object v9, La/gqw0;->w:La/shd;

    .line 149
    .line 150
    invoke-static {v8, v11, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v10

    .line 157
    sget-object v11, La/gqw0;->y:La/shd;

    .line 158
    .line 159
    invoke-static {v8, v10, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v8}, La/jpm0;->n(La/fet;)V

    .line 163
    .line 164
    .line 165
    sget-object v10, La/gqw0;->v:La/shd;

    .line 166
    .line 167
    invoke-static {v8, v1, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 168
    .line 169
    .line 170
    sget-object v1, La/qmk;->a:La/zcl;

    .line 171
    .line 172
    const/high16 v1, 0x42680000    # 58.0f

    .line 173
    .line 174
    invoke-static {v5, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    sget-object v14, La/gqw0;->a:La/zx7;

    .line 179
    .line 180
    invoke-static {v14, v7}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    iget-wide v6, v8, La/fet;->T:J

    .line 185
    .line 186
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    invoke-static {v8, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v8}, La/fet;->i0()V

    .line 199
    .line 200
    .line 201
    iget-boolean v15, v8, La/fet;->S:Z

    .line 202
    .line 203
    if-eqz v15, :cond_6

    .line 204
    .line 205
    invoke-virtual {v8, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 206
    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_6
    invoke-virtual {v8}, La/fet;->r0()V

    .line 210
    .line 211
    .line 212
    :goto_6
    invoke-static {v8, v14, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v8, v7, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v6, v8, v11, v8}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v8, v1, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 222
    .line 223
    .line 224
    sget-object v1, La/jr8;->a:La/jr8;

    .line 225
    .line 226
    sget-object v6, La/gqw0;->d:La/zx7;

    .line 227
    .line 228
    invoke-virtual {v1, v5, v6}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    if-eqz v4, :cond_7

    .line 233
    .line 234
    const v1, -0x134bcb3f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 238
    .line 239
    .line 240
    sget-object v24, La/j1t0;->c:La/qrq;

    .line 241
    .line 242
    sget-wide v21, La/qmk;->s:J

    .line 243
    .line 244
    sget-wide v30, La/qmk;->G:J

    .line 245
    .line 246
    new-instance v18, La/y9q0;

    .line 247
    .line 248
    const/16 v29, 0x0

    .line 249
    .line 250
    const v32, 0xfdffdd

    .line 251
    .line 252
    .line 253
    const-wide/16 v19, 0x0

    .line 254
    .line 255
    const/16 v23, 0x0

    .line 256
    .line 257
    const-wide/16 v25, 0x0

    .line 258
    .line 259
    const/16 v27, 0x0

    .line 260
    .line 261
    const/16 v28, 0x0

    .line 262
    .line 263
    invoke-direct/range {v18 .. v32}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 264
    .line 265
    .line 266
    move-object/from16 v1, v18

    .line 267
    .line 268
    invoke-static {v1, v8}, La/ibm0;->l(La/y9q0;La/fet;)La/y9q0;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    const/4 v5, 0x0

    .line 273
    invoke-virtual {v8, v5}, La/fet;->r(Z)V

    .line 274
    .line 275
    .line 276
    :goto_7
    move-object/from16 v25, v1

    .line 277
    .line 278
    goto :goto_8

    .line 279
    :cond_7
    const v1, -0x134a75c3

    .line 280
    .line 281
    .line 282
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 283
    .line 284
    .line 285
    sget-object v24, La/j1t0;->c:La/qrq;

    .line 286
    .line 287
    sget-wide v21, La/qmk;->s:J

    .line 288
    .line 289
    sget-wide v30, La/qmk;->G:J

    .line 290
    .line 291
    new-instance v18, La/y9q0;

    .line 292
    .line 293
    const/16 v29, 0x0

    .line 294
    .line 295
    const v32, 0xfdffdd

    .line 296
    .line 297
    .line 298
    const-wide/16 v19, 0x0

    .line 299
    .line 300
    const/16 v23, 0x0

    .line 301
    .line 302
    const-wide/16 v25, 0x0

    .line 303
    .line 304
    const/16 v27, 0x0

    .line 305
    .line 306
    const/16 v28, 0x0

    .line 307
    .line 308
    invoke-direct/range {v18 .. v32}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 309
    .line 310
    .line 311
    move-object/from16 v1, v18

    .line 312
    .line 313
    invoke-static {v1, v8}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    const/4 v5, 0x0

    .line 318
    invoke-virtual {v8, v5}, La/fet;->r(Z)V

    .line 319
    .line 320
    .line 321
    goto :goto_7

    .line 322
    :goto_8
    and-int/lit8 v27, v0, 0xe

    .line 323
    .line 324
    const/16 v28, 0x6180

    .line 325
    .line 326
    const v29, 0x1affc

    .line 327
    .line 328
    .line 329
    const-wide/16 v7, 0x0

    .line 330
    .line 331
    const/4 v9, 0x0

    .line 332
    const-wide/16 v10, 0x0

    .line 333
    .line 334
    const/4 v12, 0x0

    .line 335
    const/4 v13, 0x0

    .line 336
    const/4 v14, 0x0

    .line 337
    const-wide/16 v15, 0x0

    .line 338
    .line 339
    const/4 v0, 0x1

    .line 340
    const/16 v17, 0x0

    .line 341
    .line 342
    const-wide/16 v18, 0x0

    .line 343
    .line 344
    const/16 v20, 0x2

    .line 345
    .line 346
    const/16 v21, 0x0

    .line 347
    .line 348
    const/16 v22, 0x1

    .line 349
    .line 350
    const/16 v23, 0x0

    .line 351
    .line 352
    const/16 v24, 0x0

    .line 353
    .line 354
    move-object/from16 v26, p5

    .line 355
    .line 356
    move v1, v5

    .line 357
    move-object v5, v2

    .line 358
    invoke-static/range {v5 .. v29}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 359
    .line 360
    .line 361
    move-object/from16 v8, v26

    .line 362
    .line 363
    invoke-virtual {v8, v0}, La/fet;->r(Z)V

    .line 364
    .line 365
    .line 366
    if-eqz v3, :cond_8

    .line 367
    .line 368
    const v2, 0x166c366b

    .line 369
    .line 370
    .line 371
    invoke-virtual {v8, v2}, La/fet;->e0(I)V

    .line 372
    .line 373
    .line 374
    const/4 v9, 0x6

    .line 375
    const/4 v10, 0x6

    .line 376
    sget-object v5, La/agi0;->a:La/agi0;

    .line 377
    .line 378
    const/4 v6, 0x0

    .line 379
    const/4 v7, 0x0

    .line 380
    invoke-static/range {v5 .. v10}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 381
    .line 382
    .line 383
    :goto_9
    invoke-virtual {v8, v1}, La/fet;->r(Z)V

    .line 384
    .line 385
    .line 386
    goto :goto_a

    .line 387
    :cond_8
    const v2, -0x48e49e53

    .line 388
    .line 389
    .line 390
    invoke-virtual {v8, v2}, La/fet;->e0(I)V

    .line 391
    .line 392
    .line 393
    goto :goto_9

    .line 394
    :goto_a
    invoke-virtual {v8, v0}, La/fet;->r(Z)V

    .line 395
    .line 396
    .line 397
    goto :goto_b

    .line 398
    :cond_9
    invoke-virtual {v8}, La/fet;->X()V

    .line 399
    .line 400
    .line 401
    :goto_b
    invoke-virtual {v8}, La/fet;->u()La/yfe0;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    if-eqz v8, :cond_a

    .line 406
    .line 407
    new-instance v0, La/qg5;

    .line 408
    .line 409
    const/4 v7, 0x5

    .line 410
    move-object/from16 v1, p0

    .line 411
    .line 412
    move-object/from16 v2, p1

    .line 413
    .line 414
    move-object/from16 v5, p4

    .line 415
    .line 416
    move/from16 v6, p6

    .line 417
    .line 418
    invoke-direct/range {v0 .. v7}, La/qg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZZLa/wdr;IB)V

    .line 419
    .line 420
    .line 421
    iput-object v0, v8, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 422
    .line 423
    :cond_a
    return-void
.end method

.method public final V(Landroid/content/Context;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/fma0;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/fma0;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    move-object v2, v1

    .line 55
    check-cast v2, La/fma0;

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    sget-object p1, La/lja0;->o2:[La/iiy;

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    aget-object p1, p1, v0

    .line 67
    .line 68
    iget-object v0, p0, La/lja0;->m2:La/phf0;

    .line 69
    .line 70
    invoke-virtual {v0, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    const-wide/16 v3, 0x0

    .line 75
    .line 76
    const-string v6, ""

    .line 77
    .line 78
    invoke-virtual/range {v2 .. v7}, La/fma0;->a(JLa/i1w0;Ljava/lang/String;Ljava/lang/String;)La/f6i;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, La/f6i;->i()La/fiu0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, La/lja0;->k2:La/fiu0;

    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 90
    .line 91
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method
