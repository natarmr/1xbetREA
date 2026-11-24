.class public final La/zat;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/kzj;

.field public k:La/pbt;

.field public l:La/kzj;

.field public m:B

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:La/pbt;

.field public final synthetic p:Z

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(BILa/yje;La/pbt;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/zat;->i:B

    iput-object p4, p0, La/zat;->o:La/pbt;

    iput-boolean p6, p0, La/zat;->p:Z

    iput-object p5, p0, La/zat;->q:Ljava/lang/String;

    iput p2, p0, La/zat;->r:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/zat;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/zat;

    .line 7
    .line 8
    iget v3, p0, La/zat;->r:I

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object v5, p0, La/zat;->o:La/pbt;

    .line 12
    .line 13
    iget-object v6, p0, La/zat;->q:Ljava/lang/String;

    .line 14
    .line 15
    iget-boolean v7, p0, La/zat;->p:Z

    .line 16
    .line 17
    move-object v4, p2

    .line 18
    invoke-direct/range {v1 .. v7}, La/zat;-><init>(BILa/yje;La/pbt;Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v1, La/zat;->n:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v1

    .line 24
    :pswitch_0
    move-object v4, p2

    .line 25
    new-instance v2, La/zat;

    .line 26
    .line 27
    move-object v5, v4

    .line 28
    iget v4, p0, La/zat;->r:I

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    iget-object v6, p0, La/zat;->o:La/pbt;

    .line 32
    .line 33
    iget-object v7, p0, La/zat;->q:Ljava/lang/String;

    .line 34
    .line 35
    iget-boolean v8, p0, La/zat;->p:Z

    .line 36
    .line 37
    invoke-direct/range {v2 .. v8}, La/zat;-><init>(BILa/yje;La/pbt;Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    iput-object p1, v2, La/zat;->n:Ljava/lang/Object;

    .line 41
    .line 42
    return-object v2

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zat;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/zat;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zat;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zat;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/zat;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/zat;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/zat;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zat;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    iget-object v11, v0, La/zat;->o:La/pbt;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v1, v11, La/pbt;->c:La/g7d;

    .line 17
    .line 18
    iget-object v7, v0, La/zat;->n:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v14, v7

    .line 21
    check-cast v14, La/vne;

    .line 22
    .line 23
    sget-object v15, La/wne;->a:La/wne;

    .line 24
    .line 25
    iget-byte v7, v0, La/zat;->m:B

    .line 26
    .line 27
    if-eqz v7, :cond_3

    .line 28
    .line 29
    if-eq v7, v5, :cond_2

    .line 30
    .line 31
    if-eq v7, v3, :cond_1

    .line 32
    .line 33
    if-ne v7, v4, :cond_0

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object/from16 v0, p1

    .line 39
    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_1
    iget-object v1, v0, La/zat;->l:La/kzj;

    .line 48
    .line 49
    iget-object v11, v0, La/zat;->k:La/pbt;

    .line 50
    .line 51
    iget-object v2, v0, La/zat;->j:La/kzj;

    .line 52
    .line 53
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object/from16 v0, p1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v1, La/g7d;->e:La/jzj;

    .line 67
    .line 68
    if-eqz v2, :cond_6

    .line 69
    .line 70
    invoke-interface {v2}, La/bby;->isCancelled()Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_6

    .line 75
    .line 76
    iget-object v2, v1, La/g7d;->e:La/jzj;

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-ne v2, v5, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    iget-boolean v2, v1, La/g7d;->c:Z

    .line 88
    .line 89
    if-eqz v2, :cond_6

    .line 90
    .line 91
    :goto_0
    iput-object v6, v0, La/zat;->n:Ljava/lang/Object;

    .line 92
    .line 93
    iput-byte v5, v0, La/zat;->m:B

    .line 94
    .line 95
    invoke-virtual {v1, v0}, La/g7d;->b(La/zje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-ne v0, v15, :cond_5

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    :goto_1
    move-object v6, v0

    .line 103
    check-cast v6, La/d7d;

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_6
    new-instance v7, La/yat;

    .line 107
    .line 108
    const/4 v10, 0x0

    .line 109
    const/4 v8, 0x1

    .line 110
    iget v9, v0, La/zat;->r:I

    .line 111
    .line 112
    iget-object v12, v0, La/zat;->q:Ljava/lang/String;

    .line 113
    .line 114
    iget-boolean v13, v0, La/zat;->p:Z

    .line 115
    .line 116
    invoke-direct/range {v7 .. v13}, La/yat;-><init>(BILa/yje;La/pbt;Ljava/lang/String;Z)V

    .line 117
    .line 118
    .line 119
    invoke-static {v14, v6, v7, v4}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iput-object v6, v0, La/zat;->n:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v2, v0, La/zat;->j:La/kzj;

    .line 126
    .line 127
    iput-object v11, v0, La/zat;->k:La/pbt;

    .line 128
    .line 129
    iput-object v2, v0, La/zat;->l:La/kzj;

    .line 130
    .line 131
    iput-byte v3, v0, La/zat;->m:B

    .line 132
    .line 133
    invoke-virtual {v1, v2, v0}, La/g7d;->a(La/kzj;La/zje;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-ne v1, v15, :cond_7

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_7
    move-object v1, v2

    .line 141
    :goto_2
    new-instance v3, La/xat;

    .line 142
    .line 143
    invoke-direct {v3, v11, v5}, La/xat;-><init>(La/pbt;B)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v1, v3}, La/bby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 147
    .line 148
    .line 149
    iput-object v6, v0, La/zat;->n:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object v6, v0, La/zat;->j:La/kzj;

    .line 152
    .line 153
    iput-object v6, v0, La/zat;->k:La/pbt;

    .line 154
    .line 155
    iput-object v6, v0, La/zat;->l:La/kzj;

    .line 156
    .line 157
    iput-byte v4, v0, La/zat;->m:B

    .line 158
    .line 159
    invoke-interface {v2, v0}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-ne v0, v15, :cond_8

    .line 164
    .line 165
    :goto_3
    move-object v6, v15

    .line 166
    goto :goto_5

    .line 167
    :cond_8
    :goto_4
    move-object v6, v0

    .line 168
    check-cast v6, La/d7d;

    .line 169
    .line 170
    :goto_5
    return-object v6

    .line 171
    :pswitch_0
    iget-object v1, v11, La/pbt;->c:La/g7d;

    .line 172
    .line 173
    iget-object v7, v0, La/zat;->n:Ljava/lang/Object;

    .line 174
    .line 175
    move-object v14, v7

    .line 176
    check-cast v14, La/vne;

    .line 177
    .line 178
    sget-object v15, La/wne;->a:La/wne;

    .line 179
    .line 180
    iget-byte v7, v0, La/zat;->m:B

    .line 181
    .line 182
    if-eqz v7, :cond_c

    .line 183
    .line 184
    if-eq v7, v5, :cond_b

    .line 185
    .line 186
    if-eq v7, v3, :cond_a

    .line 187
    .line 188
    if-ne v7, v4, :cond_9

    .line 189
    .line 190
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    move-object/from16 v0, p1

    .line 194
    .line 195
    goto/16 :goto_a

    .line 196
    .line 197
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_b

    .line 201
    .line 202
    :cond_a
    iget-object v1, v0, La/zat;->l:La/kzj;

    .line 203
    .line 204
    iget-object v11, v0, La/zat;->k:La/pbt;

    .line 205
    .line 206
    iget-object v2, v0, La/zat;->j:La/kzj;

    .line 207
    .line 208
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    goto :goto_8

    .line 212
    :cond_b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    move-object/from16 v0, p1

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    iget-object v2, v1, La/g7d;->e:La/jzj;

    .line 222
    .line 223
    if-eqz v2, :cond_f

    .line 224
    .line 225
    invoke-interface {v2}, La/bby;->isCancelled()Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-nez v2, :cond_f

    .line 230
    .line 231
    iget-object v2, v1, La/g7d;->e:La/jzj;

    .line 232
    .line 233
    if-eqz v2, :cond_d

    .line 234
    .line 235
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-ne v2, v5, :cond_d

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_d
    iget-boolean v2, v1, La/g7d;->c:Z

    .line 243
    .line 244
    if-eqz v2, :cond_f

    .line 245
    .line 246
    :goto_6
    iput-object v6, v0, La/zat;->n:Ljava/lang/Object;

    .line 247
    .line 248
    iput-byte v5, v0, La/zat;->m:B

    .line 249
    .line 250
    invoke-virtual {v1, v0}, La/g7d;->b(La/zje;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-ne v0, v15, :cond_e

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_e
    :goto_7
    move-object v6, v0

    .line 258
    check-cast v6, La/d7d;

    .line 259
    .line 260
    goto :goto_b

    .line 261
    :cond_f
    new-instance v7, La/yat;

    .line 262
    .line 263
    const/4 v10, 0x0

    .line 264
    const/4 v8, 0x0

    .line 265
    iget v9, v0, La/zat;->r:I

    .line 266
    .line 267
    iget-object v12, v0, La/zat;->q:Ljava/lang/String;

    .line 268
    .line 269
    iget-boolean v13, v0, La/zat;->p:Z

    .line 270
    .line 271
    invoke-direct/range {v7 .. v13}, La/yat;-><init>(BILa/yje;La/pbt;Ljava/lang/String;Z)V

    .line 272
    .line 273
    .line 274
    invoke-static {v14, v6, v7, v4}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    iput-object v6, v0, La/zat;->n:Ljava/lang/Object;

    .line 279
    .line 280
    iput-object v2, v0, La/zat;->j:La/kzj;

    .line 281
    .line 282
    iput-object v11, v0, La/zat;->k:La/pbt;

    .line 283
    .line 284
    iput-object v2, v0, La/zat;->l:La/kzj;

    .line 285
    .line 286
    iput-byte v3, v0, La/zat;->m:B

    .line 287
    .line 288
    invoke-virtual {v1, v2, v0}, La/g7d;->a(La/kzj;La/zje;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    if-ne v1, v15, :cond_10

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_10
    move-object v1, v2

    .line 296
    :goto_8
    new-instance v3, La/xat;

    .line 297
    .line 298
    const/4 v5, 0x0

    .line 299
    invoke-direct {v3, v11, v5}, La/xat;-><init>(La/pbt;B)V

    .line 300
    .line 301
    .line 302
    invoke-interface {v1, v3}, La/bby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 303
    .line 304
    .line 305
    iput-object v6, v0, La/zat;->n:Ljava/lang/Object;

    .line 306
    .line 307
    iput-object v6, v0, La/zat;->j:La/kzj;

    .line 308
    .line 309
    iput-object v6, v0, La/zat;->k:La/pbt;

    .line 310
    .line 311
    iput-object v6, v0, La/zat;->l:La/kzj;

    .line 312
    .line 313
    iput-byte v4, v0, La/zat;->m:B

    .line 314
    .line 315
    invoke-interface {v2, v0}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    if-ne v0, v15, :cond_11

    .line 320
    .line 321
    :goto_9
    move-object v6, v15

    .line 322
    goto :goto_b

    .line 323
    :cond_11
    :goto_a
    move-object v6, v0

    .line 324
    check-cast v6, La/d7d;

    .line 325
    .line 326
    :goto_b
    return-object v6

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
