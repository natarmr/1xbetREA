.class public final La/sf20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:La/ke;

.field public j:Ljava/lang/String;

.field public k:La/p7m0;

.field public l:J

.field public m:I

.field public n:B

.field public synthetic o:La/ql5;

.field public synthetic p:Z

.field public final synthetic q:La/rg20;


# direct methods
.method public constructor <init>(La/rg20;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/sf20;->q:La/rg20;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, La/ql5;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, La/yje;

    .line 10
    .line 11
    new-instance v0, La/sf20;

    .line 12
    .line 13
    iget-object p0, p0, La/sf20;->q:La/rg20;

    .line 14
    .line 15
    invoke-direct {v0, p0, p3}, La/sf20;-><init>(La/rg20;La/yje;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, La/sf20;->o:La/ql5;

    .line 19
    .line 20
    iput-boolean p2, v0, La/sf20;->p:Z

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, La/sf20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/sf20;->q:La/rg20;

    .line 4
    .line 5
    iget-object v2, v1, La/rg20;->R:La/p7m0;

    .line 6
    .line 7
    iget-object v3, v0, La/sf20;->o:La/ql5;

    .line 8
    .line 9
    iget-boolean v4, v0, La/sf20;->p:Z

    .line 10
    .line 11
    sget-object v5, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-byte v6, v0, La/sf20;->n:B

    .line 14
    .line 15
    const/4 v9, 0x3

    .line 16
    const/4 v10, 0x2

    .line 17
    const/4 v11, 0x1

    .line 18
    const/4 v12, 0x0

    .line 19
    if-eqz v6, :cond_4

    .line 20
    .line 21
    if-eq v6, v11, :cond_2

    .line 22
    .line 23
    if-eq v6, v10, :cond_1

    .line 24
    .line 25
    if-ne v6, v9, :cond_0

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const-wide/16 v17, 0x0

    .line 31
    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v12

    .line 40
    :cond_1
    iget v6, v0, La/sf20;->m:I

    .line 41
    .line 42
    iget-wide v10, v0, La/sf20;->l:J

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const-wide/16 v17, 0x0

    .line 48
    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_2
    iget-object v6, v0, La/sf20;->k:La/p7m0;

    .line 52
    .line 53
    iget-object v13, v0, La/sf20;->j:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v14, v0, La/sf20;->i:La/ke;

    .line 56
    .line 57
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object/from16 v7, p1

    .line 61
    .line 62
    const-wide/16 v17, 0x0

    .line 63
    .line 64
    :cond_3
    move-object/from16 v23, v13

    .line 65
    .line 66
    move-object/from16 v22, v14

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v6, v1, La/rg20;->G:La/p7m0;

    .line 73
    .line 74
    new-instance v14, La/ke;

    .line 75
    .line 76
    sget-object v13, La/pn40;->a:La/pn40;

    .line 77
    .line 78
    const-wide/16 v15, 0x0

    .line 79
    .line 80
    iget-wide v7, v3, La/ql5;->b:D

    .line 81
    .line 82
    iget-object v13, v3, La/ql5;->f:Ljava/lang/String;

    .line 83
    .line 84
    move-wide/from16 v17, v15

    .line 85
    .line 86
    sget-object v15, La/p3u0;->c:La/p3u0;

    .line 87
    .line 88
    invoke-static {v7, v8, v15}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-direct {v14, v7, v13}, La/ke;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-wide v7, v3, La/ql5;->b:D

    .line 96
    .line 97
    invoke-static {v7, v8, v13, v15}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    iget-object v7, v1, La/rg20;->e:La/mrt;

    .line 102
    .line 103
    iput-object v3, v0, La/sf20;->o:La/ql5;

    .line 104
    .line 105
    iput-object v14, v0, La/sf20;->i:La/ke;

    .line 106
    .line 107
    iput-object v13, v0, La/sf20;->j:Ljava/lang/String;

    .line 108
    .line 109
    iput-object v6, v0, La/sf20;->k:La/p7m0;

    .line 110
    .line 111
    iput-boolean v4, v0, La/sf20;->p:Z

    .line 112
    .line 113
    iput-byte v11, v0, La/sf20;->n:B

    .line 114
    .line 115
    invoke-virtual {v7, v0}, La/mrt;->a(La/zje;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    if-ne v7, v5, :cond_3

    .line 120
    .line 121
    goto/16 :goto_4

    .line 122
    .line 123
    :goto_0
    check-cast v7, Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    const/4 v8, 0x0

    .line 130
    if-eqz v7, :cond_5

    .line 131
    .line 132
    iget-object v7, v1, La/rg20;->f:La/eqx;

    .line 133
    .line 134
    iget-object v7, v7, La/eqx;->a:La/b3c0;

    .line 135
    .line 136
    invoke-virtual {v7}, La/b3c0;->c()Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    if-eqz v7, :cond_5

    .line 141
    .line 142
    move/from16 v24, v11

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_5
    move/from16 v24, v8

    .line 146
    .line 147
    :goto_1
    iget-wide v13, v3, La/ql5;->b:D

    .line 148
    .line 149
    new-instance v19, La/nd20;

    .line 150
    .line 151
    move-wide/from16 v20, v13

    .line 152
    .line 153
    invoke-direct/range {v19 .. v24}, La/nd20;-><init>(DLa/ke;Ljava/lang/String;Z)V

    .line 154
    .line 155
    .line 156
    move-object/from16 v7, v19

    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6, v12, v7}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    check-cast v6, Ljava/lang/Number;

    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 171
    .line 172
    .line 173
    move-result-wide v6

    .line 174
    iget-wide v13, v3, La/ql5;->a:J

    .line 175
    .line 176
    cmp-long v15, v6, v13

    .line 177
    .line 178
    if-eqz v15, :cond_6

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_6
    move v11, v8

    .line 182
    :goto_2
    if-eqz v11, :cond_b

    .line 183
    .line 184
    new-instance v8, Ljava/lang/Long;

    .line 185
    .line 186
    invoke-direct {v8, v13, v14}, Ljava/lang/Long;-><init>(J)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, v12, v8}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    iput-object v3, v0, La/sf20;->o:La/ql5;

    .line 196
    .line 197
    iput-object v12, v0, La/sf20;->i:La/ke;

    .line 198
    .line 199
    iput-object v12, v0, La/sf20;->j:Ljava/lang/String;

    .line 200
    .line 201
    iput-object v12, v0, La/sf20;->k:La/p7m0;

    .line 202
    .line 203
    iput-boolean v4, v0, La/sf20;->p:Z

    .line 204
    .line 205
    iput-wide v6, v0, La/sf20;->l:J

    .line 206
    .line 207
    iput v11, v0, La/sf20;->m:I

    .line 208
    .line 209
    iput-byte v10, v0, La/sf20;->n:B

    .line 210
    .line 211
    invoke-virtual {v1, v3, v0}, La/rg20;->z(La/ql5;La/zje;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    if-ne v8, v5, :cond_7

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_7
    move-wide/from16 v25, v6

    .line 219
    .line 220
    move v6, v11

    .line 221
    move-wide/from16 v10, v25

    .line 222
    .line 223
    :goto_3
    cmp-long v7, v10, v17

    .line 224
    .line 225
    if-eqz v7, :cond_8

    .line 226
    .line 227
    iget-object v7, v1, La/rg20;->S:La/qoj0;

    .line 228
    .line 229
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    iput-object v3, v0, La/sf20;->o:La/ql5;

    .line 232
    .line 233
    iput-boolean v4, v0, La/sf20;->p:Z

    .line 234
    .line 235
    iput-wide v10, v0, La/sf20;->l:J

    .line 236
    .line 237
    iput v6, v0, La/sf20;->m:I

    .line 238
    .line 239
    iput-byte v9, v0, La/sf20;->n:B

    .line 240
    .line 241
    invoke-virtual {v7, v8, v0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    if-ne v0, v5, :cond_8

    .line 246
    .line 247
    :goto_4
    return-object v5

    .line 248
    :cond_8
    :goto_5
    if-eqz v4, :cond_a

    .line 249
    .line 250
    iget-object v0, v1, La/rg20;->V:La/c4m0;

    .line 251
    .line 252
    if-eqz v0, :cond_9

    .line 253
    .line 254
    invoke-virtual {v0, v12}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 255
    .line 256
    .line 257
    :cond_9
    iget-object v0, v1, La/rg20;->P:La/p7m0;

    .line 258
    .line 259
    new-instance v2, La/lpp;

    .line 260
    .line 261
    invoke-direct {v2, v1, v3, v12}, La/lpp;-><init>(La/rg20;La/ql5;La/yje;)V

    .line 262
    .line 263
    .line 264
    new-instance v3, La/fnq;

    .line 265
    .line 266
    const/4 v4, 0x4

    .line 267
    invoke-direct {v3, v0, v2, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 268
    .line 269
    .line 270
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    iget-object v2, v1, La/rg20;->o:La/mne;

    .line 275
    .line 276
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 277
    .line 278
    invoke-static {v0, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    new-instance v2, La/tf20;

    .line 283
    .line 284
    invoke-direct {v2, v1, v12, v9}, La/tf20;-><init>(La/rg20;La/yje;B)V

    .line 285
    .line 286
    .line 287
    invoke-static {v3, v0, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    iput-object v0, v1, La/rg20;->V:La/c4m0;

    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_a
    new-instance v0, Ljava/lang/Long;

    .line 295
    .line 296
    move-wide/from16 v3, v17

    .line 297
    .line 298
    invoke-direct {v0, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v12, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    :cond_b
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object v0
.end method
