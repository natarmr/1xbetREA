.class public final La/h18;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public k:Z

.field public l:I

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/j9v0;La/yje;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/h18;->i:B

    .line 16
    iput-object p1, p0, La/h18;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZILa/yje;B)V
    .locals 0

    .line 15
    iput-byte p5, p0, La/h18;->i:B

    iput-object p1, p0, La/h18;->m:Ljava/lang/Object;

    iput-boolean p2, p0, La/h18;->k:Z

    iput p3, p0, La/h18;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(ZLa/yrx;ILa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/h18;->i:B

    .line 3
    .line 4
    iput-boolean p1, p0, La/h18;->k:Z

    .line 5
    .line 6
    iput-object p2, p0, La/h18;->m:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, La/h18;->l:I

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/h18;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/h18;->m:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/h18;

    .line 9
    .line 10
    check-cast v0, La/j9v0;

    .line 11
    .line 12
    invoke-direct {p0, v0, p2}, La/h18;-><init>(La/j9v0;La/yje;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance v1, La/h18;

    .line 17
    .line 18
    move-object v2, v0

    .line 19
    check-cast v2, La/aqf0;

    .line 20
    .line 21
    iget-boolean v3, p0, La/h18;->k:Z

    .line 22
    .line 23
    iget v4, p0, La/h18;->l:I

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    move-object v5, p2

    .line 27
    invoke-direct/range {v1 .. v6}, La/h18;-><init>(Ljava/lang/Object;ZILa/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_1
    move-object v5, p2

    .line 32
    new-instance p1, La/h18;

    .line 33
    .line 34
    iget-boolean p2, p0, La/h18;->k:Z

    .line 35
    .line 36
    check-cast v0, La/yrx;

    .line 37
    .line 38
    iget p0, p0, La/h18;->l:I

    .line 39
    .line 40
    invoke-direct {p1, p2, v0, p0, v5}, La/h18;-><init>(ZLa/yrx;ILa/yje;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_2
    move-object v5, p2

    .line 45
    new-instance v2, La/h18;

    .line 46
    .line 47
    move-object v3, v0

    .line 48
    check-cast v3, La/t33;

    .line 49
    .line 50
    iget-boolean v4, p0, La/h18;->k:Z

    .line 51
    .line 52
    iget p0, p0, La/h18;->l:I

    .line 53
    .line 54
    const/4 v7, 0x0

    .line 55
    move-object v6, v5

    .line 56
    move v5, p0

    .line 57
    invoke-direct/range {v2 .. v7}, La/h18;-><init>(Ljava/lang/Object;ZILa/yje;B)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/h18;->i:B

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
    invoke-virtual {p0, p1, p2}, La/h18;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/h18;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/h18;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/h18;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/h18;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/h18;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/h18;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/h18;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/h18;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/h18;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/h18;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/h18;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/h18;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v6, 0x2

    .line 9
    iget-object v7, p0, La/h18;->m:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v7, La/j9v0;

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-byte v8, p0, La/h18;->j:B

    .line 19
    .line 20
    const/4 v9, 0x3

    .line 21
    if-eqz v8, :cond_3

    .line 22
    .line 23
    if-eq v8, v4, :cond_2

    .line 24
    .line 25
    if-eq v8, v6, :cond_1

    .line 26
    .line 27
    if-ne v8, v9, :cond_0

    .line 28
    .line 29
    iget-boolean v0, p0, La/h18;->k:Z

    .line 30
    .line 31
    iget v1, p0, La/h18;->l:I

    .line 32
    .line 33
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move v10, v0

    .line 37
    move v12, v1

    .line 38
    move-object v1, p1

    .line 39
    goto :goto_3

    .line 40
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_5

    .line 44
    .line 45
    :cond_1
    iget v1, p0, La/h18;->l:I

    .line 46
    .line 47
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move v2, v1

    .line 51
    move-object v1, p1

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object v2, p1

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v2, v7, La/j9v0;->q:La/m4v;

    .line 62
    .line 63
    iput-byte v4, p0, La/h18;->j:B

    .line 64
    .line 65
    iget-object v2, v2, La/m4v;->a:La/z8v0;

    .line 66
    .line 67
    invoke-virtual {v2, p0}, La/z8v0;->a(La/zje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-ne v2, v0, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :goto_0
    check-cast v2, La/sqt0;

    .line 75
    .line 76
    iget v2, v2, La/sqt0;->c:I

    .line 77
    .line 78
    iget-object v3, v7, La/j9v0;->o:La/rou;

    .line 79
    .line 80
    iput v2, p0, La/h18;->l:I

    .line 81
    .line 82
    iput-byte v6, p0, La/h18;->j:B

    .line 83
    .line 84
    invoke-virtual {v3, v1, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-ne v1, v0, :cond_5

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    :goto_1
    check-cast v1, La/m2c0;

    .line 92
    .line 93
    iget-boolean v3, v1, La/m2c0;->P:Z

    .line 94
    .line 95
    iget-object v4, v7, La/j9v0;->p:La/ytt;

    .line 96
    .line 97
    iget-object v6, v1, La/m2c0;->c:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v6}, La/wvb;->X(Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    iget-wide v10, v1, La/m2c0;->S:J

    .line 104
    .line 105
    iput v2, p0, La/h18;->l:I

    .line 106
    .line 107
    iput-boolean v3, p0, La/h18;->k:Z

    .line 108
    .line 109
    iput-byte v9, p0, La/h18;->j:B

    .line 110
    .line 111
    iget-object v1, v4, La/ytt;->a:La/oue0;

    .line 112
    .line 113
    invoke-virtual {v1, v6, v10, v11, p0}, La/oue0;->b(IJLa/zje;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    if-ne v1, v0, :cond_6

    .line 118
    .line 119
    :goto_2
    move-object v2, v0

    .line 120
    goto :goto_5

    .line 121
    :cond_6
    move v12, v2

    .line 122
    move v10, v3

    .line 123
    :goto_3
    move-object v11, v1

    .line 124
    check-cast v11, Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_7

    .line 131
    .line 132
    sget v0, La/j9v0;->v:I

    .line 133
    .line 134
    sget-object v0, La/c9v0;->a:La/c9v0;

    .line 135
    .line 136
    invoke-virtual {v7, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_7
    sget v0, La/j9v0;->v:I

    .line 141
    .line 142
    iget-object v0, v7, La/i3t0;->i:La/ocj;

    .line 143
    .line 144
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 145
    .line 146
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-object v8, v1

    .line 154
    check-cast v8, La/e9v0;

    .line 155
    .line 156
    const/4 v9, 0x0

    .line 157
    const/4 v13, 0x1

    .line 158
    invoke-static/range {v8 .. v13}, La/e9v0;->a(La/e9v0;ZZLjava/util/List;II)La/e9v0;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_8

    .line 167
    .line 168
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    :goto_5
    return-object v2

    .line 171
    :pswitch_0
    check-cast v7, La/aqf0;

    .line 172
    .line 173
    sget-object v0, La/wne;->a:La/wne;

    .line 174
    .line 175
    iget-byte v8, p0, La/h18;->j:B

    .line 176
    .line 177
    if-eqz v8, :cond_b

    .line 178
    .line 179
    if-eq v8, v4, :cond_a

    .line 180
    .line 181
    if-ne v8, v6, :cond_9

    .line 182
    .line 183
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-object v1, p1

    .line 187
    goto :goto_9

    .line 188
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_b

    .line 192
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    iget-object v2, v7, La/aqf0;->j:La/fq;

    .line 200
    .line 201
    iput-byte v4, p0, La/h18;->j:B

    .line 202
    .line 203
    sget-object v3, La/cy5;->a:La/cy5;

    .line 204
    .line 205
    invoke-virtual {v2, v3, p0}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    if-ne v2, v0, :cond_c

    .line 210
    .line 211
    goto :goto_8

    .line 212
    :cond_c
    :goto_6
    iget-object v2, v7, La/aqf0;->y:La/vqf0;

    .line 213
    .line 214
    if-eqz v2, :cond_d

    .line 215
    .line 216
    iget-object v2, v2, La/vqf0;->b:La/wof0;

    .line 217
    .line 218
    if-eqz v2, :cond_d

    .line 219
    .line 220
    iget-boolean v2, v2, La/wof0;->h:Z

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_d
    move v2, v1

    .line 224
    :goto_7
    invoke-virtual {v7, v1, v2}, La/aqf0;->y(ZZ)V

    .line 225
    .line 226
    .line 227
    iget-object v1, v7, La/aqf0;->c:La/uqf0;

    .line 228
    .line 229
    iget-object v2, v7, La/aqf0;->y:La/vqf0;

    .line 230
    .line 231
    if-eqz v2, :cond_12

    .line 232
    .line 233
    iget-object v2, v2, La/vqf0;->b:La/wof0;

    .line 234
    .line 235
    if-eqz v2, :cond_12

    .line 236
    .line 237
    iget v2, v2, La/wof0;->e:I

    .line 238
    .line 239
    iget-boolean v3, p0, La/h18;->k:Z

    .line 240
    .line 241
    iget v8, p0, La/h18;->l:I

    .line 242
    .line 243
    if-eqz v3, :cond_e

    .line 244
    .line 245
    add-int/lit8 v8, v8, 0x5

    .line 246
    .line 247
    :cond_e
    new-instance v3, Ljava/lang/Integer;

    .line 248
    .line 249
    invoke-direct {v3, v8}, Ljava/lang/Integer;-><init>(I)V

    .line 250
    .line 251
    .line 252
    iget-object v8, v7, La/aqf0;->y:La/vqf0;

    .line 253
    .line 254
    if-eqz v8, :cond_11

    .line 255
    .line 256
    iget-object v8, v8, La/vqf0;->b:La/wof0;

    .line 257
    .line 258
    if-eqz v8, :cond_11

    .line 259
    .line 260
    iget-object v8, v8, La/wof0;->g:Ljava/lang/String;

    .line 261
    .line 262
    if-nez v8, :cond_f

    .line 263
    .line 264
    goto :goto_a

    .line 265
    :cond_f
    iput-byte v6, p0, La/h18;->j:B

    .line 266
    .line 267
    invoke-virtual {v1, v2, v3, v8, p0}, La/uqf0;->a(ILjava/lang/Integer;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    if-ne v1, v0, :cond_10

    .line 272
    .line 273
    :goto_8
    move-object v2, v0

    .line 274
    goto :goto_b

    .line 275
    :cond_10
    :goto_9
    check-cast v1, La/vqf0;

    .line 276
    .line 277
    invoke-virtual {v7, v1, v4}, La/aqf0;->x(La/vqf0;Z)V

    .line 278
    .line 279
    .line 280
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    goto :goto_b

    .line 283
    :cond_11
    :goto_a
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 284
    .line 285
    goto :goto_b

    .line 286
    :cond_12
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    :goto_b
    return-object v2

    .line 289
    :pswitch_1
    iget v0, p0, La/h18;->l:I

    .line 290
    .line 291
    sget-object v8, La/wne;->a:La/wne;

    .line 292
    .line 293
    iget-byte v9, p0, La/h18;->j:B

    .line 294
    .line 295
    if-eqz v9, :cond_15

    .line 296
    .line 297
    if-eq v9, v4, :cond_13

    .line 298
    .line 299
    if-ne v9, v6, :cond_14

    .line 300
    .line 301
    :cond_13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    goto :goto_d

    .line 305
    :cond_14
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    goto :goto_e

    .line 309
    :cond_15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    iget-boolean v2, p0, La/h18;->k:Z

    .line 313
    .line 314
    check-cast v7, La/yrx;

    .line 315
    .line 316
    if-eqz v2, :cond_16

    .line 317
    .line 318
    iget-object v2, v7, La/yrx;->a:La/rah0;

    .line 319
    .line 320
    sget-object v3, La/ihn;->b:La/zsf;

    .line 321
    .line 322
    const/16 v7, 0xc8

    .line 323
    .line 324
    invoke-static {v7, v1, v3, v6}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    iput-byte v4, p0, La/h18;->j:B

    .line 329
    .line 330
    invoke-virtual {v2, v0, v1, p0}, La/rah0;->f(ILa/cfq;La/bnn0;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    if-ne v0, v8, :cond_17

    .line 335
    .line 336
    goto :goto_c

    .line 337
    :cond_16
    iget-object v1, v7, La/yrx;->a:La/rah0;

    .line 338
    .line 339
    iput-byte v6, p0, La/h18;->j:B

    .line 340
    .line 341
    iget-object v2, v1, La/rah0;->a:La/cgk0;

    .line 342
    .line 343
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    sub-int/2addr v0, v2

    .line 348
    int-to-float v0, v0

    .line 349
    invoke-static {v1, v0, p0}, La/bww;->T(La/bch0;FLa/zje;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    if-ne v0, v8, :cond_17

    .line 354
    .line 355
    :goto_c
    move-object v2, v8

    .line 356
    goto :goto_e

    .line 357
    :cond_17
    :goto_d
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 358
    .line 359
    :goto_e
    return-object v2

    .line 360
    :pswitch_2
    iget v0, p0, La/h18;->l:I

    .line 361
    .line 362
    sget-object v8, La/wne;->a:La/wne;

    .line 363
    .line 364
    iget-byte v9, p0, La/h18;->j:B

    .line 365
    .line 366
    if-eqz v9, :cond_1a

    .line 367
    .line 368
    if-eq v9, v4, :cond_19

    .line 369
    .line 370
    if-ne v9, v6, :cond_18

    .line 371
    .line 372
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    goto :goto_11

    .line 376
    :cond_18
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    goto :goto_12

    .line 380
    :cond_19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    goto :goto_f

    .line 384
    :cond_1a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    move-object v2, v7

    .line 388
    check-cast v2, La/t33;

    .line 389
    .line 390
    new-instance v3, Ljava/lang/Float;

    .line 391
    .line 392
    const/4 v9, 0x0

    .line 393
    invoke-direct {v3, v9}, Ljava/lang/Float;-><init>(F)V

    .line 394
    .line 395
    .line 396
    iput-byte v4, p0, La/h18;->j:B

    .line 397
    .line 398
    invoke-virtual {v2, p0, v3}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    if-ne v2, v8, :cond_1b

    .line 403
    .line 404
    goto :goto_10

    .line 405
    :cond_1b
    :goto_f
    iget-boolean v2, p0, La/h18;->k:Z

    .line 406
    .line 407
    if-eqz v2, :cond_1c

    .line 408
    .line 409
    if-lez v0, :cond_1c

    .line 410
    .line 411
    check-cast v7, La/t33;

    .line 412
    .line 413
    int-to-float v2, v0

    .line 414
    new-instance v3, Ljava/lang/Float;

    .line 415
    .line 416
    invoke-direct {v3, v2}, Ljava/lang/Float;-><init>(F)V

    .line 417
    .line 418
    .line 419
    mul-int/lit8 v0, v0, 0x64

    .line 420
    .line 421
    sget-object v2, La/ihn;->d:La/z73;

    .line 422
    .line 423
    invoke-static {v0, v1, v2, v6}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    sget-object v1, La/kkf0;->a:La/kkf0;

    .line 428
    .line 429
    const-wide/16 v9, 0x0

    .line 430
    .line 431
    const/4 v2, 0x4

    .line 432
    invoke-static {v0, v1, v9, v10, v2}, La/ro4;->b0(La/xen;La/kkf0;JI)La/w7x;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    iput-byte v6, p0, La/h18;->j:B

    .line 437
    .line 438
    move-object v1, v3

    .line 439
    const/4 v3, 0x0

    .line 440
    const/4 v4, 0x0

    .line 441
    const/16 v6, 0xc

    .line 442
    .line 443
    move-object v5, p0

    .line 444
    move-object v0, v7

    .line 445
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    if-ne v0, v8, :cond_1c

    .line 450
    .line 451
    :goto_10
    move-object v2, v8

    .line 452
    goto :goto_12

    .line 453
    :cond_1c
    :goto_11
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 454
    .line 455
    :goto_12
    return-object v2

    .line 456
    nop

    .line 457
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
