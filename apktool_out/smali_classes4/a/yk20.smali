.class public final La/yk20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/tg20;

.field public j:D

.field public k:D

.field public l:D

.field public m:Z

.field public n:I

.field public o:B

.field public final synthetic p:La/ln20;

.field public final synthetic q:La/ql5;

.field public final synthetic r:D


# direct methods
.method public constructor <init>(La/ln20;La/ql5;DLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/yk20;->p:La/ln20;

    .line 2
    .line 3
    iput-object p2, p0, La/yk20;->q:La/ql5;

    .line 4
    .line 5
    iput-wide p3, p0, La/yk20;->r:D

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/yk20;

    .line 2
    .line 3
    iget-object v2, p0, La/yk20;->q:La/ql5;

    .line 4
    .line 5
    iget-wide v3, p0, La/yk20;->r:D

    .line 6
    .line 7
    iget-object v1, p0, La/yk20;->p:La/ln20;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, La/yk20;-><init>(La/ln20;La/ql5;DLa/yje;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/yk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/yk20;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/yk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/yk20;->p:La/ln20;

    .line 4
    .line 5
    iget-object v2, v1, La/ln20;->Q:La/m1e;

    .line 6
    .line 7
    sget-object v3, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v4, v0, La/yk20;->o:B

    .line 10
    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x2

    .line 13
    iget-object v8, v0, La/yk20;->q:La/ql5;

    .line 14
    .line 15
    const/4 v9, 0x1

    .line 16
    const/4 v10, 0x0

    .line 17
    if-eqz v4, :cond_3

    .line 18
    .line 19
    if-eq v4, v9, :cond_2

    .line 20
    .line 21
    if-eq v4, v7, :cond_1

    .line 22
    .line 23
    if-ne v4, v6, :cond_0

    .line 24
    .line 25
    iget v3, v0, La/yk20;->n:I

    .line 26
    .line 27
    iget-boolean v4, v0, La/yk20;->m:Z

    .line 28
    .line 29
    iget-wide v6, v0, La/yk20;->l:D

    .line 30
    .line 31
    iget-wide v11, v0, La/yk20;->k:D

    .line 32
    .line 33
    iget-wide v13, v0, La/yk20;->j:D

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object/from16 v9, p1

    .line 39
    .line 40
    move/from16 v28, v4

    .line 41
    .line 42
    move-wide/from16 v21, v6

    .line 43
    .line 44
    move-wide/from16 v19, v11

    .line 45
    .line 46
    :goto_0
    move-wide/from16 v23, v13

    .line 47
    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v10

    .line 56
    :cond_1
    iget-object v4, v0, La/yk20;->i:La/tg20;

    .line 57
    .line 58
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object/from16 v7, p1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object/from16 v4, p1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v4, v1, La/ln20;->u:La/m0u;

    .line 74
    .line 75
    iget-wide v11, v8, La/ql5;->e:J

    .line 76
    .line 77
    iput-byte v9, v0, La/yk20;->o:B

    .line 78
    .line 79
    iget-object v4, v4, La/m0u;->a:La/xr;

    .line 80
    .line 81
    invoke-virtual {v4, v11, v12, v0}, La/xr;->c(JLa/yje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-ne v4, v3, :cond_4

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_4
    :goto_1
    check-cast v4, La/xuf;

    .line 89
    .line 90
    iget-object v11, v1, La/ln20;->w:La/rqt;

    .line 91
    .line 92
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-static {v4}, La/rqt;->e(La/xuf;)La/tg20;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    iget-object v11, v1, La/ln20;->I:La/pyu;

    .line 100
    .line 101
    invoke-virtual {v11}, La/pyu;->k()Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-eqz v11, :cond_6

    .line 106
    .line 107
    iget-object v11, v1, La/ln20;->J:La/q4u;

    .line 108
    .line 109
    iput-object v4, v0, La/yk20;->i:La/tg20;

    .line 110
    .line 111
    iput-byte v7, v0, La/yk20;->o:B

    .line 112
    .line 113
    iget-object v7, v11, La/q4u;->a:La/etj;

    .line 114
    .line 115
    invoke-virtual {v7, v8, v0}, La/etj;->a(La/ql5;La/yje;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    if-ne v7, v3, :cond_5

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_5
    :goto_2
    check-cast v7, La/c3j0;

    .line 123
    .line 124
    iget-wide v11, v7, La/c3j0;->b:D

    .line 125
    .line 126
    invoke-static {v4, v11, v12}, La/tg20;->a(La/tg20;D)La/tg20;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    :cond_6
    iget-wide v13, v4, La/tg20;->b:D

    .line 131
    .line 132
    iget-wide v11, v4, La/tg20;->a:D

    .line 133
    .line 134
    const-wide/16 v15, 0x0

    .line 135
    .line 136
    cmpg-double v7, v11, v15

    .line 137
    .line 138
    if-nez v7, :cond_7

    .line 139
    .line 140
    iget-wide v5, v0, La/yk20;->r:D

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_7
    move-wide v5, v11

    .line 144
    :goto_3
    iget-boolean v7, v4, La/tg20;->d:Z

    .line 145
    .line 146
    iget-boolean v4, v4, La/tg20;->c:Z

    .line 147
    .line 148
    if-eqz v4, :cond_8

    .line 149
    .line 150
    cmpl-double v4, v13, v15

    .line 151
    .line 152
    if-lez v4, :cond_8

    .line 153
    .line 154
    move v4, v9

    .line 155
    goto :goto_4

    .line 156
    :cond_8
    const/4 v4, 0x0

    .line 157
    :goto_4
    invoke-interface {v2}, La/m1e;->b()La/gmq;

    .line 158
    .line 159
    .line 160
    move-result-object v15

    .line 161
    iput-object v10, v0, La/yk20;->i:La/tg20;

    .line 162
    .line 163
    iput-wide v13, v0, La/yk20;->j:D

    .line 164
    .line 165
    iput-wide v5, v0, La/yk20;->k:D

    .line 166
    .line 167
    iput-wide v11, v0, La/yk20;->l:D

    .line 168
    .line 169
    iput-boolean v7, v0, La/yk20;->m:Z

    .line 170
    .line 171
    iput v4, v0, La/yk20;->n:I

    .line 172
    .line 173
    const/4 v9, 0x3

    .line 174
    iput-byte v9, v0, La/yk20;->o:B

    .line 175
    .line 176
    invoke-static {v15, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    if-ne v9, v3, :cond_9

    .line 181
    .line 182
    :goto_5
    return-object v3

    .line 183
    :cond_9
    move v3, v4

    .line 184
    move-wide/from16 v19, v5

    .line 185
    .line 186
    move/from16 v28, v7

    .line 187
    .line 188
    move-wide/from16 v21, v11

    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :goto_6
    check-cast v9, Ljava/lang/Boolean;

    .line 193
    .line 194
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 195
    .line 196
    .line 197
    move-result v30

    .line 198
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    check-cast v4, La/sg20;

    .line 203
    .line 204
    iget-object v4, v4, La/sg20;->e:La/qvj0;

    .line 205
    .line 206
    iget-object v4, v4, La/qvj0;->a:La/cx6;

    .line 207
    .line 208
    iget-object v4, v4, La/cx6;->b:La/uw6;

    .line 209
    .line 210
    iget-object v5, v8, La/ql5;->f:Ljava/lang/String;

    .line 211
    .line 212
    invoke-interface {v2}, La/m1e;->c()Z

    .line 213
    .line 214
    .line 215
    move-result v29

    .line 216
    if-eqz v3, :cond_a

    .line 217
    .line 218
    const/16 v31, 0x1

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_a
    const/16 v31, 0x0

    .line 222
    .line 223
    :goto_7
    const/16 v33, 0x0

    .line 224
    .line 225
    const/16 v34, 0x3010

    .line 226
    .line 227
    iget-wide v2, v0, La/yk20;->r:D

    .line 228
    .line 229
    const/16 v32, 0x0

    .line 230
    .line 231
    move-wide/from16 v25, v2

    .line 232
    .line 233
    move-object/from16 v18, v4

    .line 234
    .line 235
    move-object/from16 v27, v5

    .line 236
    .line 237
    invoke-static/range {v18 .. v34}, La/uw6;->a(La/uw6;DDDDLjava/lang/String;ZZZZZZI)La/uw6;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    move-wide/from16 v6, v21

    .line 242
    .line 243
    iget-object v2, v1, La/i3t0;->i:La/ocj;

    .line 244
    .line 245
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 246
    .line 247
    :cond_b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-object v4, v3

    .line 255
    check-cast v4, La/sg20;

    .line 256
    .line 257
    iget-object v5, v4, La/sg20;->e:La/qvj0;

    .line 258
    .line 259
    iget-object v8, v5, La/qvj0;->a:La/cx6;

    .line 260
    .line 261
    const/4 v9, 0x1

    .line 262
    invoke-static {v8, v10, v0, v9}, La/cx6;->a(La/cx6;La/a8q0;La/uw6;I)La/cx6;

    .line 263
    .line 264
    .line 265
    move-result-object v18

    .line 266
    const/16 v21, 0x0

    .line 267
    .line 268
    const/16 v22, 0x1e

    .line 269
    .line 270
    const/16 v19, 0x0

    .line 271
    .line 272
    const/16 v20, 0x0

    .line 273
    .line 274
    move-object/from16 v17, v5

    .line 275
    .line 276
    invoke-static/range {v17 .. v22}, La/qvj0;->a(La/qvj0;La/cx6;La/lnb0;La/jwo0;La/d0d;I)La/qvj0;

    .line 277
    .line 278
    .line 279
    move-result-object v21

    .line 280
    const/16 v26, 0x0

    .line 281
    .line 282
    const/16 v27, 0x7ef

    .line 283
    .line 284
    const/16 v18, 0x0

    .line 285
    .line 286
    const/16 v22, 0x0

    .line 287
    .line 288
    const/16 v23, 0x0

    .line 289
    .line 290
    const/16 v24, 0x0

    .line 291
    .line 292
    const/16 v25, 0x0

    .line 293
    .line 294
    move-object/from16 v17, v4

    .line 295
    .line 296
    invoke-static/range {v17 .. v27}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-eqz v3, :cond_b

    .line 305
    .line 306
    invoke-virtual {v1}, La/ln20;->a0()V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1, v6, v7}, La/ln20;->b0(D)V

    .line 310
    .line 311
    .line 312
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 313
    .line 314
    return-object v0
.end method
