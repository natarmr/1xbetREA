.class public final La/jcj;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:Z

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:I

.field public n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILa/yje;La/pzu;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/jcj;->i:B

    .line 3
    .line 4
    iput-object p3, p0, La/jcj;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput-boolean p4, p0, La/jcj;->k:Z

    .line 7
    .line 8
    iput p1, p0, La/jcj;->m:I

    .line 9
    .line 10
    invoke-direct {p0, v0, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(La/ncj;ILa/yje;B)V
    .locals 0

    .line 14
    iput-byte p4, p0, La/jcj;->i:B

    iput-object p1, p0, La/jcj;->l:Ljava/lang/Object;

    iput p2, p0, La/jcj;->m:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/jcj;->i:B

    .line 2
    .line 3
    iget v1, p0, La/jcj;->m:I

    .line 4
    .line 5
    iget-object v2, p0, La/jcj;->l:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/jcj;

    .line 11
    .line 12
    check-cast v2, La/pzu;

    .line 13
    .line 14
    iget-boolean p0, p0, La/jcj;->k:Z

    .line 15
    .line 16
    invoke-direct {p1, v1, p2, v2, p0}, La/jcj;-><init>(ILa/yje;La/pzu;Z)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    new-instance p0, La/jcj;

    .line 21
    .line 22
    check-cast v2, La/ncj;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p0, v2, v1, p2, v0}, La/jcj;-><init>(La/ncj;ILa/yje;B)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iput-boolean p1, p0, La/jcj;->k:Z

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_1
    new-instance p0, La/jcj;

    .line 38
    .line 39
    check-cast v2, La/ncj;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {p0, v2, v1, p2, v0}, La/jcj;-><init>(La/ncj;ILa/yje;B)V

    .line 43
    .line 44
    .line 45
    check-cast p1, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iput-boolean p1, p0, La/jcj;->k:Z

    .line 52
    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/jcj;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    check-cast p2, La/yje;

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1, p2}, La/jcj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/jcj;

    .line 23
    .line 24
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/jcj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    check-cast p2, La/yje;

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2}, La/jcj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, La/jcj;

    .line 43
    .line 44
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, La/jcj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    check-cast p2, La/yje;

    .line 57
    .line 58
    invoke-virtual {p0, p1, p2}, La/jcj;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, La/jcj;

    .line 63
    .line 64
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, La/jcj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/jcj;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/jcj;->l:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    iget v5, p0, La/jcj;->m:I

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-byte v7, p0, La/jcj;->j:B

    .line 18
    .line 19
    if-eqz v7, :cond_2

    .line 20
    .line 21
    if-eq v7, v3, :cond_1

    .line 22
    .line 23
    if-ne v7, v4, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, La/jcj;->n:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, La/pzu;

    .line 28
    .line 29
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_1
    iget-object p0, p0, La/jcj;->n:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, La/pzu;

    .line 42
    .line 43
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object p1, v1

    .line 51
    check-cast p1, La/pzu;

    .line 52
    .line 53
    iget-boolean v1, p0, La/jcj;->k:Z

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    iget-object v1, p1, La/pzu;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, La/abu;

    .line 60
    .line 61
    iput-object p1, p0, La/jcj;->n:Ljava/lang/Object;

    .line 62
    .line 63
    iput-byte v3, p0, La/jcj;->j:B

    .line 64
    .line 65
    iget-object v2, v1, La/abu;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, La/pyu;

    .line 68
    .line 69
    iget-object v1, v1, La/abu;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, La/k7u;

    .line 72
    .line 73
    iget-object v1, v1, La/k7u;->a:La/uzc;

    .line 74
    .line 75
    invoke-virtual {v1}, La/uzc;->b()La/jvn;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-object v2, v2, La/pyu;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, La/w5z;

    .line 82
    .line 83
    invoke-virtual {v2, v1, v5, p0}, La/w5z;->C(La/jvn;ILa/zje;)Ljava/io/Serializable;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-ne p0, v0, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    move-object v9, p1

    .line 91
    move-object p1, p0

    .line 92
    move-object p0, v9

    .line 93
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    iget-object v1, p1, La/pzu;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, La/ieu;

    .line 99
    .line 100
    iput-object p1, p0, La/jcj;->n:Ljava/lang/Object;

    .line 101
    .line 102
    iput-byte v4, p0, La/jcj;->j:B

    .line 103
    .line 104
    iget-object v2, v1, La/ieu;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, La/bzu;

    .line 107
    .line 108
    iget-object v1, v1, La/ieu;->c:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, La/k7u;

    .line 111
    .line 112
    iget-object v1, v1, La/k7u;->a:La/uzc;

    .line 113
    .line 114
    invoke-virtual {v1}, La/uzc;->b()La/jvn;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iget-object v2, v2, La/bzu;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, La/w5z;

    .line 121
    .line 122
    invoke-virtual {v2, v1, v5, p0}, La/w5z;->B(La/jvn;ILa/zje;)Ljava/io/Serializable;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v0, :cond_5

    .line 127
    .line 128
    :goto_1
    move-object v6, v0

    .line 129
    goto :goto_4

    .line 130
    :cond_5
    move-object v9, p1

    .line 131
    move-object p1, p0

    .line 132
    move-object p0, v9

    .line 133
    :goto_2
    check-cast p1, Ljava/util/List;

    .line 134
    .line 135
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-static {p1}, La/pzu;->C(Ljava/util/List;)Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    :goto_4
    return-object v6

    .line 143
    :pswitch_0
    check-cast v1, La/ncj;

    .line 144
    .line 145
    sget-object v0, La/wne;->a:La/wne;

    .line 146
    .line 147
    iget-byte v7, p0, La/jcj;->j:B

    .line 148
    .line 149
    if-eqz v7, :cond_8

    .line 150
    .line 151
    if-eq v7, v3, :cond_7

    .line 152
    .line 153
    if-ne v7, v4, :cond_6

    .line 154
    .line 155
    iget-object p0, p0, La/jcj;->n:Ljava/lang/Object;

    .line 156
    .line 157
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_7

    .line 161
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_9

    .line 165
    :cond_7
    iget-boolean v2, p0, La/jcj;->k:Z

    .line 166
    .line 167
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    iget-boolean v2, p0, La/jcj;->k:Z

    .line 175
    .line 176
    iput-boolean v2, p0, La/jcj;->k:Z

    .line 177
    .line 178
    iput-byte v3, p0, La/jcj;->j:B

    .line 179
    .line 180
    iget-object p1, v1, La/ncj;->j:La/n0o0;

    .line 181
    .line 182
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    check-cast p1, La/vzp;

    .line 187
    .line 188
    new-instance v3, La/y0g;

    .line 189
    .line 190
    const/4 v7, 0x3

    .line 191
    const/16 v8, 0xb

    .line 192
    .line 193
    invoke-direct {v3, v7, v6, v8}, La/y0g;-><init>(ILa/yje;B)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, v3, p0}, La/vzp;->a(La/y0g;La/zje;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    if-ne p1, v0, :cond_9

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_9
    :goto_5
    if-eqz v2, :cond_b

    .line 204
    .line 205
    invoke-virtual {v1}, La/ncj;->c()La/mlx;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    iput-object p1, p0, La/jcj;->n:Ljava/lang/Object;

    .line 210
    .line 211
    iput-byte v4, p0, La/jcj;->j:B

    .line 212
    .line 213
    invoke-interface {v1, p0}, La/mlx;->a(La/zje;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    if-ne p0, v0, :cond_a

    .line 218
    .line 219
    :goto_6
    move-object v6, v0

    .line 220
    goto :goto_9

    .line 221
    :cond_a
    move-object v9, p1

    .line 222
    move-object p1, p0

    .line 223
    move-object p0, v9

    .line 224
    :goto_7
    check-cast p1, Ljava/lang/Number;

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    move-object p1, p0

    .line 231
    :cond_b
    new-instance v6, La/naj;

    .line 232
    .line 233
    if-eqz p1, :cond_c

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 236
    .line 237
    .line 238
    move-result p0

    .line 239
    goto :goto_8

    .line 240
    :cond_c
    const/4 p0, 0x0

    .line 241
    :goto_8
    invoke-direct {v6, p0, v5, p1}, La/naj;-><init>(IILjava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :goto_9
    return-object v6

    .line 245
    :pswitch_1
    check-cast v1, La/ncj;

    .line 246
    .line 247
    sget-object v0, La/wne;->a:La/wne;

    .line 248
    .line 249
    iget-byte v7, p0, La/jcj;->j:B

    .line 250
    .line 251
    if-eqz v7, :cond_f

    .line 252
    .line 253
    if-eq v7, v3, :cond_e

    .line 254
    .line 255
    if-ne v7, v4, :cond_d

    .line 256
    .line 257
    iget-boolean v0, p0, La/jcj;->k:Z

    .line 258
    .line 259
    iget-object p0, p0, La/jcj;->n:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast p0, Ljava/lang/Throwable;

    .line 262
    .line 263
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto :goto_d

    .line 267
    :cond_d
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    goto :goto_f

    .line 271
    :cond_e
    iget-boolean v2, p0, La/jcj;->k:Z

    .line 272
    .line 273
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 274
    .line 275
    .line 276
    goto :goto_a

    .line 277
    :catchall_0
    move-exception p1

    .line 278
    goto :goto_b

    .line 279
    :cond_f
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    iget-boolean v2, p0, La/jcj;->k:Z

    .line 283
    .line 284
    :try_start_1
    iput-boolean v2, p0, La/jcj;->k:Z

    .line 285
    .line 286
    iput-byte v3, p0, La/jcj;->j:B

    .line 287
    .line 288
    invoke-virtual {v1, v2, p0}, La/ncj;->h(ZLa/zje;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    if-ne p1, v0, :cond_10

    .line 293
    .line 294
    goto :goto_c

    .line 295
    :cond_10
    :goto_a
    check-cast p1, La/g7m0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 296
    .line 297
    goto :goto_e

    .line 298
    :goto_b
    if-eqz v2, :cond_12

    .line 299
    .line 300
    invoke-virtual {v1}, La/ncj;->c()La/mlx;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    iput-object p1, p0, La/jcj;->n:Ljava/lang/Object;

    .line 305
    .line 306
    iput-boolean v2, p0, La/jcj;->k:Z

    .line 307
    .line 308
    iput-byte v4, p0, La/jcj;->j:B

    .line 309
    .line 310
    invoke-interface {v1, p0}, La/mlx;->a(La/zje;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    if-ne p0, v0, :cond_11

    .line 315
    .line 316
    :goto_c
    move-object v6, v0

    .line 317
    goto :goto_f

    .line 318
    :cond_11
    move-object v0, p1

    .line 319
    move-object p1, p0

    .line 320
    move-object p0, v0

    .line 321
    move v0, v2

    .line 322
    :goto_d
    check-cast p1, Ljava/lang/Number;

    .line 323
    .line 324
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    move-object p1, p0

    .line 329
    move v2, v0

    .line 330
    :cond_12
    new-instance p0, La/jae0;

    .line 331
    .line 332
    invoke-direct {p0, v5, p1}, La/jae0;-><init>(ILjava/lang/Throwable;)V

    .line 333
    .line 334
    .line 335
    move-object p1, p0

    .line 336
    :goto_e
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    new-instance v6, Lkotlin/Pair;

    .line 341
    .line 342
    invoke-direct {v6, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    :goto_f
    return-object v6

    .line 346
    nop

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
