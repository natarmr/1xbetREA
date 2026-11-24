.class public final La/bxk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public i:I

.field public j:I

.field public k:I

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:B

.field public synthetic p:Ljava/lang/Throwable;

.field public synthetic q:J

.field public final synthetic r:La/yhi;

.field public final synthetic s:Lkotlin/jvm/functions/Function0;

.field public final synthetic t:Lkotlin/jvm/functions/Function2;

.field public final synthetic u:B


# direct methods
.method public constructor <init>(La/yhi;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;JLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/bxk0;->r:La/yhi;

    .line 2
    .line 3
    iput-object p2, p0, La/bxk0;->s:Lkotlin/jvm/functions/Function0;

    .line 4
    .line 5
    iput-object p3, p0, La/bxk0;->t:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    long-to-int p1, p4

    .line 8
    iput-byte p1, p0, La/bxk0;->u:B

    .line 9
    .line 10
    const/4 p1, 0x4

    .line 11
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/bxk0;->p:Ljava/lang/Throwable;

    .line 4
    .line 5
    iget-wide v2, v0, La/bxk0;->q:J

    .line 6
    .line 7
    sget-object v4, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v5, v0, La/bxk0;->o:B

    .line 10
    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x2

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x1

    .line 15
    if-eqz v5, :cond_3

    .line 16
    .line 17
    if-eq v5, v9, :cond_2

    .line 18
    .line 19
    if-eq v5, v7, :cond_1

    .line 20
    .line 21
    if-ne v5, v6, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v8

    .line 30
    :cond_1
    iget-boolean v1, v0, La/bxk0;->n:Z

    .line 31
    .line 32
    iget-boolean v5, v0, La/bxk0;->m:Z

    .line 33
    .line 34
    iget-boolean v7, v0, La/bxk0;->l:Z

    .line 35
    .line 36
    iget v10, v0, La/bxk0;->k:I

    .line 37
    .line 38
    iget v11, v0, La/bxk0;->j:I

    .line 39
    .line 40
    iget v12, v0, La/bxk0;->i:I

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_6

    .line 46
    .line 47
    :cond_2
    :goto_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_8

    .line 51
    .line 52
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const-class v5, Ljava/net/SocketTimeoutException;

    .line 56
    .line 57
    const-class v10, Ljava/net/UnknownHostException;

    .line 58
    .line 59
    filled-new-array {v5, v10}, [Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-eqz v10, :cond_5

    .line 76
    .line 77
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    move-object v11, v10

    .line 82
    check-cast v11, Ljava/lang/Class;

    .line 83
    .line 84
    invoke-virtual {v11, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    if-eqz v11, :cond_4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    move-object v10, v8

    .line 92
    :goto_1
    check-cast v10, Ljava/lang/Class;

    .line 93
    .line 94
    if-eqz v10, :cond_6

    .line 95
    .line 96
    invoke-virtual {v10, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    goto :goto_2

    .line 101
    :cond_6
    const/4 v10, 0x0

    .line 102
    :goto_2
    xor-int/lit8 v12, v10, 0x1

    .line 103
    .line 104
    instance-of v11, v1, La/zhi0;

    .line 105
    .line 106
    if-eqz v11, :cond_7

    .line 107
    .line 108
    move-object v11, v1

    .line 109
    check-cast v11, La/zhi0;

    .line 110
    .line 111
    iget-boolean v11, v11, La/zhi0;->e:Z

    .line 112
    .line 113
    if-nez v11, :cond_8

    .line 114
    .line 115
    :cond_7
    if-eqz v10, :cond_9

    .line 116
    .line 117
    :cond_8
    move v11, v9

    .line 118
    goto :goto_3

    .line 119
    :cond_9
    const/4 v11, 0x0

    .line 120
    :goto_3
    if-eqz v11, :cond_a

    .line 121
    .line 122
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 123
    .line 124
    return-object v0

    .line 125
    :cond_a
    const-wide/16 v13, 0x3

    .line 126
    .line 127
    cmp-long v10, v2, v13

    .line 128
    .line 129
    if-gez v10, :cond_b

    .line 130
    .line 131
    move v10, v9

    .line 132
    goto :goto_4

    .line 133
    :cond_b
    const/4 v10, 0x0

    .line 134
    :goto_4
    iget-object v15, v0, La/bxk0;->r:La/yhi;

    .line 135
    .line 136
    iget-object v5, v15, La/yhi;->k:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v5, La/bqx;

    .line 139
    .line 140
    iget-object v5, v5, La/bqx;->a:La/u6t;

    .line 141
    .line 142
    iget-object v5, v5, La/u6t;->b:La/s6t;

    .line 143
    .line 144
    iget-object v5, v5, La/s6t;->a:La/ouu;

    .line 145
    .line 146
    invoke-virtual {v5}, La/ouu;->I()Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    iget-object v6, v15, La/yhi;->l:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v6, La/aqx;

    .line 153
    .line 154
    iget-object v6, v6, La/aqx;->a:La/p6t;

    .line 155
    .line 156
    iget-object v6, v6, La/p6t;->b:La/n6t;

    .line 157
    .line 158
    iget-object v6, v6, La/n6t;->a:La/ouu;

    .line 159
    .line 160
    invoke-virtual {v6}, La/ouu;->I()Z

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    iget-object v15, v15, La/yhi;->m:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v15, La/zpx;

    .line 167
    .line 168
    iget-object v15, v15, La/zpx;->a:La/b6t;

    .line 169
    .line 170
    iget-object v15, v15, La/b6t;->b:La/v5t;

    .line 171
    .line 172
    iget-object v15, v15, La/v5t;->a:La/ouu;

    .line 173
    .line 174
    invoke-virtual {v15}, La/ouu;->I()Z

    .line 175
    .line 176
    .line 177
    move-result v15

    .line 178
    iget-object v7, v0, La/bxk0;->s:Lkotlin/jvm/functions/Function0;

    .line 179
    .line 180
    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    check-cast v7, Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-eqz v7, :cond_c

    .line 191
    .line 192
    if-eqz v10, :cond_c

    .line 193
    .line 194
    sget-object v1, La/wen;->b:La/uen;

    .line 195
    .line 196
    sget-object v1, La/bfn;->e:La/bfn;

    .line 197
    .line 198
    invoke-static {v13, v14, v1}, La/ibc;->w0(JLa/bfn;)J

    .line 199
    .line 200
    .line 201
    move-result-wide v13

    .line 202
    iput-object v8, v0, La/bxk0;->p:Ljava/lang/Throwable;

    .line 203
    .line 204
    iput-wide v2, v0, La/bxk0;->q:J

    .line 205
    .line 206
    iput v12, v0, La/bxk0;->i:I

    .line 207
    .line 208
    iput v11, v0, La/bxk0;->j:I

    .line 209
    .line 210
    iput v10, v0, La/bxk0;->k:I

    .line 211
    .line 212
    iput-boolean v5, v0, La/bxk0;->l:Z

    .line 213
    .line 214
    iput-boolean v6, v0, La/bxk0;->m:Z

    .line 215
    .line 216
    iput-boolean v15, v0, La/bxk0;->n:Z

    .line 217
    .line 218
    iput-byte v9, v0, La/bxk0;->o:B

    .line 219
    .line 220
    invoke-static {v13, v14, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    if-ne v0, v4, :cond_10

    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_c
    if-eqz v5, :cond_e

    .line 228
    .line 229
    if-eqz v6, :cond_e

    .line 230
    .line 231
    if-nez v15, :cond_d

    .line 232
    .line 233
    goto :goto_5

    .line 234
    :cond_d
    const/4 v9, 0x0

    .line 235
    goto :goto_8

    .line 236
    :cond_e
    :goto_5
    iput-object v8, v0, La/bxk0;->p:Ljava/lang/Throwable;

    .line 237
    .line 238
    iput-wide v2, v0, La/bxk0;->q:J

    .line 239
    .line 240
    iput v12, v0, La/bxk0;->i:I

    .line 241
    .line 242
    iput v11, v0, La/bxk0;->j:I

    .line 243
    .line 244
    iput v10, v0, La/bxk0;->k:I

    .line 245
    .line 246
    iput-boolean v5, v0, La/bxk0;->l:Z

    .line 247
    .line 248
    iput-boolean v6, v0, La/bxk0;->m:Z

    .line 249
    .line 250
    iput-boolean v15, v0, La/bxk0;->n:Z

    .line 251
    .line 252
    const/4 v7, 0x2

    .line 253
    iput-byte v7, v0, La/bxk0;->o:B

    .line 254
    .line 255
    iget-object v7, v0, La/bxk0;->t:Lkotlin/jvm/functions/Function2;

    .line 256
    .line 257
    invoke-interface {v7, v1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    if-ne v1, v4, :cond_f

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_f
    move v7, v5

    .line 265
    move v5, v6

    .line 266
    move v1, v15

    .line 267
    :goto_6
    sget-object v6, La/wen;->b:La/uen;

    .line 268
    .line 269
    iget-byte v6, v0, La/bxk0;->u:B

    .line 270
    .line 271
    int-to-long v13, v6

    .line 272
    sget-object v6, La/bfn;->e:La/bfn;

    .line 273
    .line 274
    invoke-static {v13, v14, v6}, La/ibc;->w0(JLa/bfn;)J

    .line 275
    .line 276
    .line 277
    move-result-wide v13

    .line 278
    iput-object v8, v0, La/bxk0;->p:Ljava/lang/Throwable;

    .line 279
    .line 280
    iput-wide v2, v0, La/bxk0;->q:J

    .line 281
    .line 282
    iput v12, v0, La/bxk0;->i:I

    .line 283
    .line 284
    iput v11, v0, La/bxk0;->j:I

    .line 285
    .line 286
    iput v10, v0, La/bxk0;->k:I

    .line 287
    .line 288
    iput-boolean v7, v0, La/bxk0;->l:Z

    .line 289
    .line 290
    iput-boolean v5, v0, La/bxk0;->m:Z

    .line 291
    .line 292
    iput-boolean v1, v0, La/bxk0;->n:Z

    .line 293
    .line 294
    const/4 v1, 0x3

    .line 295
    iput-byte v1, v0, La/bxk0;->o:B

    .line 296
    .line 297
    invoke-static {v13, v14, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    if-ne v0, v4, :cond_10

    .line 302
    .line 303
    :goto_7
    return-object v4

    .line 304
    :cond_10
    :goto_8
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    return-object v0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    move-object v8, p4

    .line 12
    check-cast v8, La/yje;

    .line 13
    .line 14
    new-instance v2, La/bxk0;

    .line 15
    .line 16
    iget-byte p1, p0, La/bxk0;->u:B

    .line 17
    .line 18
    int-to-long v6, p1

    .line 19
    iget-object v3, p0, La/bxk0;->r:La/yhi;

    .line 20
    .line 21
    iget-object v4, p0, La/bxk0;->s:Lkotlin/jvm/functions/Function0;

    .line 22
    .line 23
    iget-object v5, p0, La/bxk0;->t:Lkotlin/jvm/functions/Function2;

    .line 24
    .line 25
    invoke-direct/range {v2 .. v8}, La/bxk0;-><init>(La/yhi;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;JLa/yje;)V

    .line 26
    .line 27
    .line 28
    iput-object p2, v2, La/bxk0;->p:Ljava/lang/Throwable;

    .line 29
    .line 30
    iput-wide v0, v2, La/bxk0;->q:J

    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    invoke-virtual {v2, p0}, La/bxk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method
