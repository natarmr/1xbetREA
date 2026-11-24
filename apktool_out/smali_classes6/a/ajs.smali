.class public final synthetic La/ajs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/cjs;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:J

.field public final synthetic d:F

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(La/cjs;La/pz40;JFJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ajs;->a:La/cjs;

    iput-object p2, p0, La/ajs;->b:La/l7m0;

    iput-wide p3, p0, La/ajs;->c:J

    iput p5, p0, La/ajs;->d:F

    iput-wide p6, p0, La/ajs;->e:J

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/mm40;

    .line 6
    .line 7
    move-object/from16 v9, p2

    .line 8
    .line 9
    check-cast v9, La/fet;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sget-object v3, La/cjs;->a2:La/nek;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    and-int/lit8 v3, v2, 0x6

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    const/4 v3, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v3, 0x2

    .line 37
    :goto_0
    or-int/2addr v2, v3

    .line 38
    :cond_1
    and-int/lit8 v3, v2, 0x13

    .line 39
    .line 40
    const/16 v4, 0x12

    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    if-eq v3, v4, :cond_2

    .line 44
    .line 45
    move v3, v6

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const/4 v3, 0x0

    .line 48
    :goto_1
    and-int/2addr v2, v6

    .line 49
    invoke-virtual {v9, v2, v3}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_d

    .line 54
    .line 55
    sget-object v2, La/o7k0;->c:La/n0q;

    .line 56
    .line 57
    invoke-interface {v1, v2}, La/mm40;->e(La/mm40;)La/mm40;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iget-object v11, v0, La/ajs;->a:La/cjs;

    .line 62
    .line 63
    iget-object v1, v11, La/cjs;->R1:La/nek;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    if-eqz v1, :cond_c

    .line 67
    .line 68
    iget-object v4, v11, La/cjs;->S1:La/xak;

    .line 69
    .line 70
    if-eqz v4, :cond_b

    .line 71
    .line 72
    invoke-virtual {v11}, La/cjs;->I0()La/k3t0;

    .line 73
    .line 74
    .line 75
    move-result-object v14

    .line 76
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    sget-object v7, La/ukd;->a:La/cl5;

    .line 85
    .line 86
    if-nez v2, :cond_3

    .line 87
    .line 88
    if-ne v6, v7, :cond_4

    .line 89
    .line 90
    :cond_3
    new-instance v12, La/h2s;

    .line 91
    .line 92
    const/16 v18, 0x0

    .line 93
    .line 94
    const/16 v19, 0xc

    .line 95
    .line 96
    const/4 v13, 0x1

    .line 97
    const-class v15, La/k3t0;

    .line 98
    .line 99
    const-string v16, "onAction"

    .line 100
    .line 101
    const-string v17, "onAction(Ljava/lang/Object;)V"

    .line 102
    .line 103
    invoke-direct/range {v12 .. v19}, La/h2s;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v6, v12

    .line 110
    :cond_4
    check-cast v6, La/jhy;

    .line 111
    .line 112
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 113
    .line 114
    new-instance v10, La/yis;

    .line 115
    .line 116
    iget-wide v12, v0, La/ajs;->c:J

    .line 117
    .line 118
    iget v14, v0, La/ajs;->d:F

    .line 119
    .line 120
    move-object/from16 p2, v6

    .line 121
    .line 122
    iget-wide v5, v0, La/ajs;->e:J

    .line 123
    .line 124
    move-wide v15, v5

    .line 125
    invoke-direct/range {v10 .. v16}, La/yis;-><init>(La/cjs;JFJ)V

    .line 126
    .line 127
    .line 128
    const v2, -0x30b01466

    .line 129
    .line 130
    .line 131
    invoke-static {v2, v10, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 132
    .line 133
    .line 134
    move-result-object v19

    .line 135
    new-instance v2, La/zis;

    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    invoke-direct {v2, v11, v12, v13, v5}, La/zis;-><init>(Ljava/lang/Object;JB)V

    .line 139
    .line 140
    .line 141
    const v6, -0x49d32aad

    .line 142
    .line 143
    .line 144
    invoke-static {v6, v2, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 145
    .line 146
    .line 147
    move-result-object v20

    .line 148
    iget-object v13, v0, La/ajs;->b:La/l7m0;

    .line 149
    .line 150
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    new-array v0, v5, [Ljava/lang/Object;

    .line 157
    .line 158
    invoke-virtual {v9, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    if-nez v2, :cond_5

    .line 167
    .line 168
    if-ne v5, v7, :cond_6

    .line 169
    .line 170
    :cond_5
    new-instance v5, La/z6s;

    .line 171
    .line 172
    const/16 v2, 0x9

    .line 173
    .line 174
    invoke-direct {v5, v13, v2}, La/z6s;-><init>(La/l7m0;B)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :cond_6
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 181
    .line 182
    invoke-static {v0, v5, v9}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 183
    .line 184
    .line 185
    move-result-object v15

    .line 186
    const/4 v5, 0x0

    .line 187
    new-array v0, v5, [Ljava/lang/Object;

    .line 188
    .line 189
    invoke-virtual {v9, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    if-nez v2, :cond_7

    .line 198
    .line 199
    if-ne v5, v7, :cond_8

    .line 200
    .line 201
    :cond_7
    new-instance v5, La/z6s;

    .line 202
    .line 203
    const/16 v2, 0xa

    .line 204
    .line 205
    invoke-direct {v5, v13, v2}, La/z6s;-><init>(La/l7m0;B)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v9, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_8
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 212
    .line 213
    invoke-static {v0, v5, v9}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 214
    .line 215
    .line 216
    move-result-object v16

    .line 217
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    move-object v2, v0

    .line 222
    check-cast v2, La/tf50;

    .line 223
    .line 224
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    if-ne v0, v7, :cond_9

    .line 229
    .line 230
    new-instance v0, La/dcr;

    .line 231
    .line 232
    const/16 v5, 0x18

    .line 233
    .line 234
    invoke-direct {v0, v5}, La/dcr;-><init>(B)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :cond_9
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 241
    .line 242
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    if-ne v5, v7, :cond_a

    .line 247
    .line 248
    new-instance v5, La/dcr;

    .line 249
    .line 250
    const/16 v6, 0x19

    .line 251
    .line 252
    invoke-direct {v5, v6}, La/dcr;-><init>(B)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v9, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    :cond_a
    move-object v7, v5

    .line 259
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 260
    .line 261
    new-instance v12, La/vis;

    .line 262
    .line 263
    move-object/from16 v14, p2

    .line 264
    .line 265
    move-object/from16 v18, v1

    .line 266
    .line 267
    move-object/from16 v17, v4

    .line 268
    .line 269
    invoke-direct/range {v12 .. v20}, La/vis;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;La/l7m0;La/l7m0;La/xak;La/nek;La/ugd;La/ugd;)V

    .line 270
    .line 271
    .line 272
    const v1, -0x74a4fe1f

    .line 273
    .line 274
    .line 275
    invoke-static {v1, v12, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    const v10, 0x1b0180

    .line 280
    .line 281
    .line 282
    const/16 v11, 0x18

    .line 283
    .line 284
    const/4 v5, 0x0

    .line 285
    const/4 v6, 0x0

    .line 286
    move-object v4, v0

    .line 287
    invoke-static/range {v2 .. v11}, La/ay3;->f(Ljava/lang/Object;La/mm40;Lkotlin/jvm/functions/Function1;La/u12;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/ydr;La/fet;II)V

    .line 288
    .line 289
    .line 290
    goto :goto_2

    .line 291
    :cond_b
    const-string v0, "gameZoneFactory"

    .line 292
    .line 293
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw v2

    .line 297
    :cond_c
    const-string v0, "gameVideoFactory"

    .line 298
    .line 299
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw v2

    .line 303
    :cond_d
    invoke-virtual {v9}, La/fet;->X()V

    .line 304
    .line 305
    .line 306
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    return-object v0
.end method
