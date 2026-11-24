.class public final La/ymq;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public synthetic n:Ljava/lang/Object;

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ymq;->i:B

    iput-object p1, p0, La/ymq;->p:Ljava/lang/Object;

    iput-object p2, p0, La/ymq;->q:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/ymq;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/ymq;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/ymq;->p:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/uvp;

    .line 11
    .line 12
    check-cast p2, La/uvp;

    .line 13
    .line 14
    check-cast p3, La/yje;

    .line 15
    .line 16
    new-instance v0, La/ymq;

    .line 17
    .line 18
    check-cast p0, La/kzj;

    .line 19
    .line 20
    check-cast v1, La/kzj;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v0, p0, v1, p3, v2}, La/ymq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 24
    .line 25
    .line 26
    iput-object p1, v0, La/ymq;->n:Ljava/lang/Object;

    .line 27
    .line 28
    iput-object p2, v0, La/ymq;->o:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, La/ymq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, La/vne;

    .line 38
    .line 39
    check-cast p2, La/kmq;

    .line 40
    .line 41
    check-cast p3, La/yje;

    .line 42
    .line 43
    new-instance v0, La/ymq;

    .line 44
    .line 45
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    check-cast v1, La/gmq;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-direct {v0, p0, v1, p3, v2}, La/ymq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 51
    .line 52
    .line 53
    iput-object p1, v0, La/ymq;->n:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object p2, v0, La/ymq;->o:Ljava/lang/Object;

    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    invoke-virtual {v0, p0}, La/ymq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ymq;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/ymq;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/ymq;->p:Ljava/lang/Object;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x2

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, La/ymq;->n:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/uvp;

    .line 20
    .line 21
    iget-object v8, v0, La/ymq;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v8, La/uvp;

    .line 24
    .line 25
    sget-object v9, La/wne;->a:La/wne;

    .line 26
    .line 27
    iget-byte v10, v0, La/ymq;->j:B

    .line 28
    .line 29
    if-eqz v10, :cond_2

    .line 30
    .line 31
    if-eq v10, v5, :cond_1

    .line 32
    .line 33
    if-ne v10, v6, :cond_0

    .line 34
    .line 35
    iget-object v1, v0, La/ymq;->m:Ljava/lang/Object;

    .line 36
    .line 37
    move-object v8, v1

    .line 38
    check-cast v8, La/uvp;

    .line 39
    .line 40
    iget-object v1, v0, La/ymq;->l:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, La/uvp;

    .line 43
    .line 44
    iget-object v0, v0, La/ymq;->k:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v3, v0

    .line 50
    move-object/from16 v0, p1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object/from16 v3, p1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    check-cast v3, La/kzj;

    .line 67
    .line 68
    iput-object v1, v0, La/ymq;->n:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v8, v0, La/ymq;->o:Ljava/lang/Object;

    .line 71
    .line 72
    iput-byte v5, v0, La/ymq;->j:B

    .line 73
    .line 74
    invoke-virtual {v3, v0}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    if-ne v3, v9, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    :goto_0
    check-cast v3, La/j0g0;

    .line 82
    .line 83
    iget-object v3, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, La/kzj;

    .line 86
    .line 87
    iput-object v7, v0, La/ymq;->n:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object v7, v0, La/ymq;->o:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v3, v0, La/ymq;->k:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v1, v0, La/ymq;->l:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v8, v0, La/ymq;->m:Ljava/lang/Object;

    .line 96
    .line 97
    iput-byte v6, v0, La/ymq;->j:B

    .line 98
    .line 99
    invoke-virtual {v2, v0}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-ne v0, v9, :cond_4

    .line 104
    .line 105
    :goto_1
    move-object v7, v9

    .line 106
    goto :goto_3

    .line 107
    :cond_4
    :goto_2
    check-cast v0, La/j0g0;

    .line 108
    .line 109
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 110
    .line 111
    new-instance v7, La/xwp;

    .line 112
    .line 113
    invoke-direct {v7, v3, v1, v8, v0}, La/xwp;-><init>(Ljava/lang/Object;La/uvp;La/uvp;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :goto_3
    return-object v7

    .line 117
    :pswitch_0
    iget-object v1, v0, La/ymq;->n:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, La/vne;

    .line 120
    .line 121
    iget-object v8, v0, La/ymq;->o:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v8, La/kmq;

    .line 124
    .line 125
    sget-object v9, La/wne;->a:La/wne;

    .line 126
    .line 127
    iget-byte v10, v0, La/ymq;->j:B

    .line 128
    .line 129
    const/4 v11, 0x0

    .line 130
    if-eqz v10, :cond_7

    .line 131
    .line 132
    if-eq v10, v5, :cond_6

    .line 133
    .line 134
    if-ne v10, v6, :cond_5

    .line 135
    .line 136
    iget-object v1, v0, La/ymq;->l:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, La/mie0;

    .line 139
    .line 140
    iget-object v2, v0, La/ymq;->k:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, La/htb;

    .line 143
    .line 144
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_8

    .line 152
    .line 153
    :cond_6
    iget-object v1, v0, La/ymq;->m:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v1, La/lie0;

    .line 156
    .line 157
    iget-object v2, v0, La/ymq;->l:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v2, La/mie0;

    .line 160
    .line 161
    iget-object v4, v0, La/ymq;->k:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v4, La/htb;

    .line 164
    .line 165
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_5

    .line 169
    .line 170
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    new-instance v4, La/v6d;

    .line 174
    .line 175
    check-cast v2, La/gmq;

    .line 176
    .line 177
    invoke-direct {v4, v2, v7, v6}, La/v6d;-><init>(La/gmq;La/yje;B)V

    .line 178
    .line 179
    .line 180
    sget-object v2, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 181
    .line 182
    sget-object v10, La/i99;->a:La/i99;

    .line 183
    .line 184
    sget-object v12, La/yne;->a:La/yne;

    .line 185
    .line 186
    const/4 v13, 0x4

    .line 187
    invoke-static {v11, v10, v7, v13}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    invoke-static {v1, v2}, La/jne;->b(La/vne;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    new-instance v2, La/hzb0;

    .line 196
    .line 197
    invoke-direct {v2, v1, v10}, La/hzb0;-><init>(Lkotlin/coroutines/CoroutineContext;La/q99;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v12, v2, v4}, La/a2;->d0(La/yne;La/a2;Lkotlin/jvm/functions/Function2;)V

    .line 201
    .line 202
    .line 203
    new-instance v1, La/mie0;

    .line 204
    .line 205
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 206
    .line 207
    .line 208
    :cond_8
    :goto_4
    move-object v4, v2

    .line 209
    move-object v2, v1

    .line 210
    iget-object v1, v2, La/mie0;->a:Ljava/lang/Object;

    .line 211
    .line 212
    sget-object v10, La/k860;->c:La/pfw;

    .line 213
    .line 214
    if-eq v1, v10, :cond_f

    .line 215
    .line 216
    new-instance v10, La/lie0;

    .line 217
    .line 218
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 219
    .line 220
    .line 221
    if-eqz v1, :cond_c

    .line 222
    .line 223
    move-object v12, v3

    .line 224
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 225
    .line 226
    sget-object v13, La/k860;->a:La/pfw;

    .line 227
    .line 228
    if-ne v1, v13, :cond_9

    .line 229
    .line 230
    move-object v1, v7

    .line 231
    :cond_9
    invoke-interface {v12, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    check-cast v1, Ljava/lang/Number;

    .line 236
    .line 237
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 238
    .line 239
    .line 240
    move-result-wide v14

    .line 241
    iput-wide v14, v10, La/lie0;->a:J

    .line 242
    .line 243
    const-wide/16 v16, 0x0

    .line 244
    .line 245
    cmp-long v1, v14, v16

    .line 246
    .line 247
    if-ltz v1, :cond_d

    .line 248
    .line 249
    if-nez v1, :cond_c

    .line 250
    .line 251
    iget-object v1, v2, La/mie0;->a:Ljava/lang/Object;

    .line 252
    .line 253
    if-ne v1, v13, :cond_a

    .line 254
    .line 255
    move-object v1, v7

    .line 256
    :cond_a
    iput-object v7, v0, La/ymq;->n:Ljava/lang/Object;

    .line 257
    .line 258
    iput-object v8, v0, La/ymq;->o:Ljava/lang/Object;

    .line 259
    .line 260
    iput-object v4, v0, La/ymq;->k:Ljava/lang/Object;

    .line 261
    .line 262
    iput-object v2, v0, La/ymq;->l:Ljava/lang/Object;

    .line 263
    .line 264
    iput-object v10, v0, La/ymq;->m:Ljava/lang/Object;

    .line 265
    .line 266
    iput-byte v5, v0, La/ymq;->j:B

    .line 267
    .line 268
    invoke-interface {v8, v1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    if-ne v1, v9, :cond_b

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_b
    move-object v1, v10

    .line 276
    :goto_5
    iput-object v7, v2, La/mie0;->a:Ljava/lang/Object;

    .line 277
    .line 278
    move-object v10, v1

    .line 279
    :cond_c
    move-object v1, v2

    .line 280
    move-object v2, v4

    .line 281
    goto :goto_6

    .line 282
    :cond_d
    const-string v0, "Debounce timeout should not be negative"

    .line 283
    .line 284
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    goto :goto_8

    .line 288
    :goto_6
    new-instance v4, La/o2i0;

    .line 289
    .line 290
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    invoke-direct {v4, v12}, La/o2i0;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    .line 295
    .line 296
    .line 297
    iget-object v12, v1, La/mie0;->a:Ljava/lang/Object;

    .line 298
    .line 299
    if-eqz v12, :cond_e

    .line 300
    .line 301
    iget-wide v12, v10, La/lie0;->a:J

    .line 302
    .line 303
    new-instance v10, La/ffd;

    .line 304
    .line 305
    const/16 v14, 0xc

    .line 306
    .line 307
    invoke-direct {v10, v8, v1, v7, v14}, La/ffd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 308
    .line 309
    .line 310
    invoke-static {v4, v12, v13, v10}, La/idx;->L(La/o2i0;JLkotlin/jvm/functions/Function1;)V

    .line 311
    .line 312
    .line 313
    :cond_e
    invoke-interface {v2}, La/htb;->i()La/i1i0;

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    new-instance v12, La/wmq;

    .line 318
    .line 319
    invoke-direct {v12, v1, v8, v7, v11}, La/wmq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v4, v10, v12}, La/o2i0;->g(La/i1i0;Lkotlin/jvm/functions/Function2;)V

    .line 323
    .line 324
    .line 325
    iput-object v7, v0, La/ymq;->n:Ljava/lang/Object;

    .line 326
    .line 327
    iput-object v8, v0, La/ymq;->o:Ljava/lang/Object;

    .line 328
    .line 329
    iput-object v2, v0, La/ymq;->k:Ljava/lang/Object;

    .line 330
    .line 331
    iput-object v1, v0, La/ymq;->l:Ljava/lang/Object;

    .line 332
    .line 333
    iput-object v7, v0, La/ymq;->m:Ljava/lang/Object;

    .line 334
    .line 335
    iput-byte v6, v0, La/ymq;->j:B

    .line 336
    .line 337
    invoke-static {v4, v0}, La/o2i0;->d(La/o2i0;La/bnn0;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    if-ne v4, v9, :cond_8

    .line 342
    .line 343
    :goto_7
    move-object v7, v9

    .line 344
    goto :goto_8

    .line 345
    :cond_f
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 346
    .line 347
    :goto_8
    return-object v7

    .line 348
    nop

    .line 349
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
