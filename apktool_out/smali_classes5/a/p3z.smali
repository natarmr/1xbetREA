.class public final La/p3z;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:Z

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/tzi;

.field public final synthetic m:Z

.field public final synthetic n:Z

.field public final synthetic o:B

.field public final synthetic p:La/u3z;

.field public final synthetic q:Ljava/lang/Long;


# direct methods
.method public constructor <init>(La/yje;La/tzi;ZZILa/u3z;Ljava/lang/Long;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/p3z;->l:La/tzi;

    .line 2
    .line 3
    iput-boolean p3, p0, La/p3z;->m:Z

    .line 4
    .line 5
    iput-boolean p4, p0, La/p3z;->n:Z

    .line 6
    .line 7
    iput-byte p5, p0, La/p3z;->o:B

    .line 8
    .line 9
    iput-object p6, p0, La/p3z;->p:La/u3z;

    .line 10
    .line 11
    iput-object p7, p0, La/p3z;->q:Ljava/lang/Long;

    .line 12
    .line 13
    const/4 p2, 0x3

    .line 14
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/p3z;

    .line 7
    .line 8
    iget-object v6, p0, La/p3z;->p:La/u3z;

    .line 9
    .line 10
    iget-object v7, p0, La/p3z;->q:Ljava/lang/Long;

    .line 11
    .line 12
    iget-object v2, p0, La/p3z;->l:La/tzi;

    .line 13
    .line 14
    iget-boolean v3, p0, La/p3z;->m:Z

    .line 15
    .line 16
    iget-boolean v4, p0, La/p3z;->n:Z

    .line 17
    .line 18
    iget-byte v5, p0, La/p3z;->o:B

    .line 19
    .line 20
    invoke-direct/range {v0 .. v7}, La/p3z;-><init>(La/yje;La/tzi;ZZILa/u3z;Ljava/lang/Long;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/p3z;->j:La/kmq;

    .line 24
    .line 25
    iput-object p2, v0, La/p3z;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, La/p3z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/p3z;->i:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-ne v2, v4, :cond_0

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v3

    .line 24
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, v0, La/p3z;->j:La/kmq;

    .line 28
    .line 29
    iget-object v5, v0, La/p3z;->k:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, La/l4z;

    .line 32
    .line 33
    if-eqz v5, :cond_5

    .line 34
    .line 35
    instance-of v6, v5, La/i4z;

    .line 36
    .line 37
    const/4 v7, 0x4

    .line 38
    iget-object v11, v0, La/p3z;->q:Ljava/lang/Long;

    .line 39
    .line 40
    iget-object v10, v0, La/p3z;->p:La/u3z;

    .line 41
    .line 42
    iget-byte v8, v0, La/p3z;->o:B

    .line 43
    .line 44
    iget-boolean v9, v0, La/p3z;->n:Z

    .line 45
    .line 46
    iget-boolean v15, v0, La/p3z;->m:Z

    .line 47
    .line 48
    move/from16 v16, v9

    .line 49
    .line 50
    iget-object v9, v0, La/p3z;->l:La/tzi;

    .line 51
    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    iget-object v3, v9, La/tzi;->b:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v13, v3

    .line 57
    check-cast v13, La/abu;

    .line 58
    .line 59
    move-object v14, v5

    .line 60
    check-cast v14, La/i4z;

    .line 61
    .line 62
    sget-object v3, La/i2o;->p:La/i2o;

    .line 63
    .line 64
    new-instance v6, La/djx;

    .line 65
    .line 66
    const/16 v12, 0x19

    .line 67
    .line 68
    invoke-direct {v6, v12}, La/djx;-><init>(B)V

    .line 69
    .line 70
    .line 71
    new-instance v4, La/y2x;

    .line 72
    .line 73
    invoke-direct {v4, v14, v12}, La/y2x;-><init>(Ljava/lang/Object;B)V

    .line 74
    .line 75
    .line 76
    new-instance v22, La/q4z;

    .line 77
    .line 78
    const/16 v18, 0x0

    .line 79
    .line 80
    const/16 v19, 0x0

    .line 81
    .line 82
    move/from16 v17, v8

    .line 83
    .line 84
    move-object/from16 v12, v22

    .line 85
    .line 86
    const/4 v8, 0x0

    .line 87
    invoke-direct/range {v12 .. v19}, La/q4z;-><init>(Ljava/lang/Object;La/l4z;ZZILa/yje;B)V

    .line 88
    .line 89
    .line 90
    const-wide/16 v17, 0x1e

    .line 91
    .line 92
    move-object/from16 v19, v3

    .line 93
    .line 94
    move-object/from16 v21, v4

    .line 95
    .line 96
    move-object/from16 v20, v6

    .line 97
    .line 98
    invoke-static/range {v17 .. v22}, La/nkb;->H(JLa/i2o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)La/vsg0;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    new-instance v4, La/r3z;

    .line 103
    .line 104
    const/4 v6, 0x0

    .line 105
    invoke-direct {v4, v9, v5, v8, v6}, La/r3z;-><init>(La/tzi;La/l4z;La/yje;B)V

    .line 106
    .line 107
    .line 108
    new-instance v5, La/fnq;

    .line 109
    .line 110
    invoke-direct {v5, v3, v4, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 111
    .line 112
    .line 113
    move-object v12, v8

    .line 114
    new-instance v8, La/s3z;

    .line 115
    .line 116
    const/4 v13, 0x0

    .line 117
    invoke-direct/range {v8 .. v13}, La/s3z;-><init>(La/tzi;La/u3z;Ljava/lang/Long;La/yje;B)V

    .line 118
    .line 119
    .line 120
    move-object v4, v12

    .line 121
    new-instance v3, La/dnq;

    .line 122
    .line 123
    const/4 v6, 0x1

    .line 124
    invoke-direct {v3, v5, v8, v6}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 125
    .line 126
    .line 127
    goto/16 :goto_0

    .line 128
    .line 129
    :cond_2
    move/from16 v17, v8

    .line 130
    .line 131
    const/4 v4, 0x0

    .line 132
    instance-of v6, v5, La/j4z;

    .line 133
    .line 134
    const/16 v8, 0x1b

    .line 135
    .line 136
    const/16 v12, 0x1a

    .line 137
    .line 138
    if-eqz v6, :cond_3

    .line 139
    .line 140
    iget-object v3, v9, La/tzi;->c:Ljava/lang/Object;

    .line 141
    .line 142
    move-object v13, v3

    .line 143
    check-cast v13, La/gxu;

    .line 144
    .line 145
    move-object v14, v5

    .line 146
    check-cast v14, La/j4z;

    .line 147
    .line 148
    sget-object v25, La/i2o;->o:La/i2o;

    .line 149
    .line 150
    new-instance v3, La/adw;

    .line 151
    .line 152
    invoke-direct {v3, v13, v12}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 153
    .line 154
    .line 155
    new-instance v6, La/wqv;

    .line 156
    .line 157
    invoke-direct {v6, v13, v14, v8}, La/wqv;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 158
    .line 159
    .line 160
    new-instance v12, La/q4z;

    .line 161
    .line 162
    const/16 v18, 0x0

    .line 163
    .line 164
    const/16 v19, 0x1

    .line 165
    .line 166
    invoke-direct/range {v12 .. v19}, La/q4z;-><init>(Ljava/lang/Object;La/l4z;ZZILa/yje;B)V

    .line 167
    .line 168
    .line 169
    const-wide/16 v23, 0x8

    .line 170
    .line 171
    move-object/from16 v26, v3

    .line 172
    .line 173
    move-object/from16 v27, v6

    .line 174
    .line 175
    move-object/from16 v28, v12

    .line 176
    .line 177
    invoke-static/range {v23 .. v28}, La/nkb;->H(JLa/i2o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)La/vsg0;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    new-instance v6, La/r3z;

    .line 182
    .line 183
    const/4 v14, 0x1

    .line 184
    invoke-direct {v6, v9, v5, v4, v14}, La/r3z;-><init>(La/tzi;La/l4z;La/yje;B)V

    .line 185
    .line 186
    .line 187
    new-instance v5, La/fnq;

    .line 188
    .line 189
    invoke-direct {v5, v3, v6, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 190
    .line 191
    .line 192
    new-instance v8, La/s3z;

    .line 193
    .line 194
    const/4 v13, 0x1

    .line 195
    move-object v12, v4

    .line 196
    invoke-direct/range {v8 .. v13}, La/s3z;-><init>(La/tzi;La/u3z;Ljava/lang/Long;La/yje;B)V

    .line 197
    .line 198
    .line 199
    new-instance v3, La/dnq;

    .line 200
    .line 201
    invoke-direct {v3, v5, v8, v14}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 202
    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_3
    instance-of v6, v5, La/k4z;

    .line 206
    .line 207
    if-eqz v6, :cond_5

    .line 208
    .line 209
    iget-object v3, v9, La/tzi;->d:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v3, La/onv;

    .line 212
    .line 213
    move-object v6, v5

    .line 214
    check-cast v6, La/k4z;

    .line 215
    .line 216
    new-instance v10, La/djx;

    .line 217
    .line 218
    invoke-direct {v10, v12}, La/djx;-><init>(B)V

    .line 219
    .line 220
    .line 221
    new-instance v15, La/adw;

    .line 222
    .line 223
    invoke-direct {v15, v6, v8}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 224
    .line 225
    .line 226
    new-instance v8, La/y2x;

    .line 227
    .line 228
    invoke-direct {v8, v6, v12}, La/y2x;-><init>(Ljava/lang/Object;B)V

    .line 229
    .line 230
    .line 231
    new-instance v14, La/ffd;

    .line 232
    .line 233
    const/16 v11, 0x10

    .line 234
    .line 235
    invoke-direct {v14, v3, v6, v4, v11}, La/ffd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 236
    .line 237
    .line 238
    new-instance v13, La/lqs;

    .line 239
    .line 240
    const/16 v18, 0x0

    .line 241
    .line 242
    move-object/from16 v16, v8

    .line 243
    .line 244
    move-object/from16 v17, v10

    .line 245
    .line 246
    invoke-direct/range {v13 .. v18}, La/lqs;-><init>(La/ffd;La/adw;La/y2x;La/djx;La/yje;)V

    .line 247
    .line 248
    .line 249
    new-instance v3, La/vsg0;

    .line 250
    .line 251
    invoke-direct {v3, v13}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 252
    .line 253
    .line 254
    new-instance v6, La/r3z;

    .line 255
    .line 256
    const/4 v8, 0x2

    .line 257
    invoke-direct {v6, v9, v5, v4, v8}, La/r3z;-><init>(La/tzi;La/l4z;La/yje;B)V

    .line 258
    .line 259
    .line 260
    new-instance v5, La/fnq;

    .line 261
    .line 262
    invoke-direct {v5, v3, v6, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 263
    .line 264
    .line 265
    move-object v3, v5

    .line 266
    :goto_0
    iput-object v4, v0, La/p3z;->j:La/kmq;

    .line 267
    .line 268
    iput-object v4, v0, La/p3z;->k:Ljava/lang/Object;

    .line 269
    .line 270
    const/4 v14, 0x1

    .line 271
    iput-boolean v14, v0, La/p3z;->i:Z

    .line 272
    .line 273
    invoke-static {v2, v3, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    if-ne v0, v1, :cond_4

    .line 278
    .line 279
    return-object v1

    .line 280
    :cond_4
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v0

    .line 283
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 284
    .line 285
    .line 286
    return-object v3
.end method
