.class public final La/syj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:La/nv20;

.field public j:Ljava/lang/String;

.field public k:I

.field public l:B

.field public synthetic m:La/ql5;

.field public synthetic n:Z

.field public final synthetic o:La/wyj0;


# direct methods
.method public constructor <init>(La/wyj0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/syj0;->o:La/wyj0;

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
    new-instance v0, La/syj0;

    .line 12
    .line 13
    iget-object p0, p0, La/syj0;->o:La/wyj0;

    .line 14
    .line 15
    invoke-direct {v0, p0, p3}, La/syj0;-><init>(La/wyj0;La/yje;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, v0, La/syj0;->m:La/ql5;

    .line 19
    .line 20
    iput-boolean p2, v0, La/syj0;->n:Z

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, La/syj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/syj0;->o:La/wyj0;

    .line 4
    .line 5
    iget-object v2, v1, La/wyj0;->E:La/p7m0;

    .line 6
    .line 7
    iget-object v3, v1, La/wyj0;->D:La/p7m0;

    .line 8
    .line 9
    iget-object v4, v0, La/syj0;->m:La/ql5;

    .line 10
    .line 11
    iget-boolean v5, v0, La/syj0;->n:Z

    .line 12
    .line 13
    sget-object v6, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v7, v0, La/syj0;->l:B

    .line 16
    .line 17
    const/4 v8, 0x2

    .line 18
    const/4 v9, 0x1

    .line 19
    const/4 v10, 0x0

    .line 20
    if-eqz v7, :cond_2

    .line 21
    .line 22
    if-eq v7, v9, :cond_1

    .line 23
    .line 24
    if-ne v7, v8, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_6

    .line 30
    .line 31
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v10

    .line 37
    :cond_1
    iget v3, v0, La/syj0;->k:I

    .line 38
    .line 39
    iget-object v7, v0, La/syj0;->j:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v9, v0, La/syj0;->i:La/nv20;

    .line 42
    .line 43
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object v10, v7

    .line 47
    move v7, v3

    .line 48
    move-object/from16 v3, p1

    .line 49
    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object v7, v1, La/wyj0;->F:La/p7m0;

    .line 56
    .line 57
    :goto_0
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    move-object v12, v11

    .line 62
    check-cast v12, La/pn5;

    .line 63
    .line 64
    new-instance v13, La/ke;

    .line 65
    .line 66
    sget-object v14, La/pn40;->a:La/pn40;

    .line 67
    .line 68
    iget-wide v14, v4, La/ql5;->b:D

    .line 69
    .line 70
    iget-wide v8, v4, La/ql5;->a:J

    .line 71
    .line 72
    iget-object v10, v4, La/ql5;->f:Ljava/lang/String;

    .line 73
    .line 74
    move-object/from16 p1, v12

    .line 75
    .line 76
    sget-object v12, La/p3u0;->c:La/p3u0;

    .line 77
    .line 78
    invoke-static {v14, v15, v12}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v12

    .line 82
    invoke-direct {v13, v12, v10}, La/ke;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget-wide v14, v4, La/ql5;->b:D

    .line 86
    .line 87
    const/16 v16, 0x0

    .line 88
    .line 89
    const/16 v17, 0x4

    .line 90
    .line 91
    move-object/from16 v12, p1

    .line 92
    .line 93
    invoke-static/range {v12 .. v17}, La/pn5;->a(La/pn5;La/ke;DZI)La/pn5;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    invoke-virtual {v7, v11, v12}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    if-eqz v11, :cond_b

    .line 102
    .line 103
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    check-cast v7, Ljava/lang/Number;

    .line 108
    .line 109
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v11

    .line 113
    cmp-long v7, v11, v8

    .line 114
    .line 115
    if-eqz v7, :cond_3

    .line 116
    .line 117
    const/4 v7, 0x1

    .line 118
    goto :goto_1

    .line 119
    :cond_3
    const/4 v7, 0x0

    .line 120
    :goto_1
    if-eqz v7, :cond_a

    .line 121
    .line 122
    :cond_4
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    move-object/from16 v18, v11

    .line 127
    .line 128
    check-cast v18, La/od7;

    .line 129
    .line 130
    new-instance v12, Ljava/math/BigDecimal;

    .line 131
    .line 132
    const-wide/high16 v13, -0x4010000000000000L    # -1.0

    .line 133
    .line 134
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    invoke-direct {v12, v13}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const/16 v23, 0x0

    .line 142
    .line 143
    const/16 v24, 0x16

    .line 144
    .line 145
    const/16 v20, 0x0

    .line 146
    .line 147
    const/16 v21, 0x0

    .line 148
    .line 149
    const/16 v22, 0x1

    .line 150
    .line 151
    move-object/from16 v19, v12

    .line 152
    .line 153
    invoke-static/range {v18 .. v24}, La/od7;->a(La/od7;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;I)La/od7;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    invoke-virtual {v2, v11, v12}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    if-eqz v11, :cond_4

    .line 162
    .line 163
    if-eqz v5, :cond_a

    .line 164
    .line 165
    new-instance v11, Ljava/lang/Long;

    .line 166
    .line 167
    invoke-direct {v11, v8, v9}, Ljava/lang/Long;-><init>(J)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    const/4 v8, 0x0

    .line 174
    invoke-virtual {v3, v8, v11}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    iget-object v9, v1, La/wyj0;->i:La/nv20;

    .line 178
    .line 179
    iget-object v8, v4, La/ql5;->g:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-lez v3, :cond_5

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_5
    const/4 v8, 0x0

    .line 189
    :goto_2
    if-nez v8, :cond_7

    .line 190
    .line 191
    iget-object v3, v1, La/wyj0;->s:La/m0u;

    .line 192
    .line 193
    iget-wide v11, v4, La/ql5;->e:J

    .line 194
    .line 195
    iput-object v4, v0, La/syj0;->m:La/ql5;

    .line 196
    .line 197
    iput-object v9, v0, La/syj0;->i:La/nv20;

    .line 198
    .line 199
    iput-object v10, v0, La/syj0;->j:Ljava/lang/String;

    .line 200
    .line 201
    iput-boolean v5, v0, La/syj0;->n:Z

    .line 202
    .line 203
    iput v7, v0, La/syj0;->k:I

    .line 204
    .line 205
    const/4 v13, 0x1

    .line 206
    iput-byte v13, v0, La/syj0;->l:B

    .line 207
    .line 208
    iget-object v3, v3, La/m0u;->a:La/xr;

    .line 209
    .line 210
    invoke-virtual {v3, v11, v12, v0}, La/xr;->c(JLa/yje;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    if-ne v3, v6, :cond_6

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_6
    :goto_3
    check-cast v3, La/xuf;

    .line 218
    .line 219
    iget-object v8, v3, La/xuf;->b:Ljava/lang/String;

    .line 220
    .line 221
    :cond_7
    iput-object v4, v0, La/syj0;->m:La/ql5;

    .line 222
    .line 223
    const/4 v11, 0x0

    .line 224
    iput-object v11, v0, La/syj0;->i:La/nv20;

    .line 225
    .line 226
    iput-object v11, v0, La/syj0;->j:Ljava/lang/String;

    .line 227
    .line 228
    iput-boolean v5, v0, La/syj0;->n:Z

    .line 229
    .line 230
    iput v7, v0, La/syj0;->k:I

    .line 231
    .line 232
    const/4 v12, 0x2

    .line 233
    iput-byte v12, v0, La/syj0;->l:B

    .line 234
    .line 235
    iget-object v3, v9, La/nv20;->a:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v3, La/w5z;

    .line 238
    .line 239
    invoke-virtual {v3, v10, v8, v0}, La/w5z;->g0(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    sget-object v3, La/wne;->a:La/wne;

    .line 244
    .line 245
    if-ne v0, v3, :cond_8

    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    :goto_4
    if-ne v0, v6, :cond_9

    .line 251
    .line 252
    :goto_5
    return-object v6

    .line 253
    :cond_9
    :goto_6
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    move-object v5, v0

    .line 258
    check-cast v5, La/od7;

    .line 259
    .line 260
    iget-object v3, v1, La/wyj0;->h:La/hsj;

    .line 261
    .line 262
    invoke-virtual {v3}, La/hsj;->s()Ljava/math/BigDecimal;

    .line 263
    .line 264
    .line 265
    move-result-object v7

    .line 266
    iget-object v3, v1, La/wyj0;->g:La/zku;

    .line 267
    .line 268
    invoke-virtual {v3}, La/zku;->a()Ljava/math/BigDecimal;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    iget-object v10, v4, La/ql5;->f:Ljava/lang/String;

    .line 273
    .line 274
    const/4 v9, 0x0

    .line 275
    const/4 v11, 0x1

    .line 276
    const/4 v6, 0x0

    .line 277
    invoke-static/range {v5 .. v11}, La/od7;->a(La/od7;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLjava/lang/String;I)La/od7;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-eqz v0, :cond_9

    .line 286
    .line 287
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    return-object v0

    .line 290
    :cond_b
    const/4 v8, 0x2

    .line 291
    const/4 v9, 0x1

    .line 292
    const/4 v10, 0x0

    .line 293
    goto/16 :goto_0
.end method
