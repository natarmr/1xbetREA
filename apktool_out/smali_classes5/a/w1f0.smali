.class public final La/w1f0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:Z

.field public final synthetic l:La/y1f0;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:La/jo20;

.field public final synthetic o:La/ynb0;


# direct methods
.method public synthetic constructor <init>(ZLa/y1f0;Ljava/lang/String;La/jo20;La/ynb0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/w1f0;->i:B

    iput-boolean p1, p0, La/w1f0;->k:Z

    iput-object p2, p0, La/w1f0;->l:La/y1f0;

    iput-object p3, p0, La/w1f0;->m:Ljava/lang/String;

    iput-object p4, p0, La/w1f0;->n:La/jo20;

    iput-object p5, p0, La/w1f0;->o:La/ynb0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte p1, p0, La/w1f0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/w1f0;

    .line 7
    .line 8
    iget-object v5, p0, La/w1f0;->o:La/ynb0;

    .line 9
    .line 10
    const/4 v7, 0x2

    .line 11
    iget-boolean v1, p0, La/w1f0;->k:Z

    .line 12
    .line 13
    iget-object v2, p0, La/w1f0;->l:La/y1f0;

    .line 14
    .line 15
    iget-object v3, p0, La/w1f0;->m:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v4, p0, La/w1f0;->n:La/jo20;

    .line 18
    .line 19
    move-object v6, p2

    .line 20
    invoke-direct/range {v0 .. v7}, La/w1f0;-><init>(ZLa/y1f0;Ljava/lang/String;La/jo20;La/ynb0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    move-object v7, p2

    .line 25
    new-instance v1, La/w1f0;

    .line 26
    .line 27
    iget-object v6, p0, La/w1f0;->o:La/ynb0;

    .line 28
    .line 29
    const/4 v8, 0x1

    .line 30
    iget-boolean v2, p0, La/w1f0;->k:Z

    .line 31
    .line 32
    iget-object v3, p0, La/w1f0;->l:La/y1f0;

    .line 33
    .line 34
    iget-object v4, p0, La/w1f0;->m:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v5, p0, La/w1f0;->n:La/jo20;

    .line 37
    .line 38
    invoke-direct/range {v1 .. v8}, La/w1f0;-><init>(ZLa/y1f0;Ljava/lang/String;La/jo20;La/ynb0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :pswitch_1
    move-object v7, p2

    .line 43
    new-instance v1, La/w1f0;

    .line 44
    .line 45
    iget-object v6, p0, La/w1f0;->o:La/ynb0;

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    iget-boolean v2, p0, La/w1f0;->k:Z

    .line 49
    .line 50
    iget-object v3, p0, La/w1f0;->l:La/y1f0;

    .line 51
    .line 52
    iget-object v4, p0, La/w1f0;->m:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v5, p0, La/w1f0;->n:La/jo20;

    .line 55
    .line 56
    invoke-direct/range {v1 .. v8}, La/w1f0;-><init>(ZLa/y1f0;Ljava/lang/String;La/jo20;La/ynb0;La/yje;B)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/w1f0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/w1f0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/w1f0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/w1f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/w1f0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/w1f0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/w1f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/w1f0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/w1f0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/w1f0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/w1f0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/w1f0;->l:La/y1f0;

    .line 4
    .line 5
    iget-boolean v2, p0, La/w1f0;->k:Z

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    iget-object v6, p0, La/w1f0;->m:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v7, p0, La/w1f0;->n:La/jo20;

    .line 14
    .line 15
    iget-object v8, p0, La/w1f0;->o:La/ynb0;

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    sget-object v0, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-byte v10, p0, La/w1f0;->j:B

    .line 24
    .line 25
    if-eqz v10, :cond_2

    .line 26
    .line 27
    if-eq v10, v4, :cond_1

    .line 28
    .line 29
    if-ne v10, v5, :cond_0

    .line 30
    .line 31
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_4

    .line 39
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    if-eqz v2, :cond_4

    .line 47
    .line 48
    iget-object p1, v1, La/y1f0;->a:La/jw20;

    .line 49
    .line 50
    new-instance v1, La/d2f0;

    .line 51
    .line 52
    iget-object v2, v8, La/ynb0;->a:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v3, v8, La/ynb0;->b:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v1, v7, v2, v3}, La/d2f0;-><init>(La/jo20;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iput-byte v4, p0, La/w1f0;->j:B

    .line 60
    .line 61
    iget-object p1, p1, La/jw20;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, La/rta0;

    .line 64
    .line 65
    invoke-virtual {p1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, La/yte0;

    .line 70
    .line 71
    invoke-interface {p1, v6, v1, p0}, La/yte0;->d(Ljava/lang/String;La/d2f0;La/yje;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v0, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    :goto_0
    check-cast p1, La/q16;

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    iget-object p1, v1, La/y1f0;->a:La/jw20;

    .line 82
    .line 83
    new-instance v1, La/d2f0;

    .line 84
    .line 85
    iget-object v2, v8, La/ynb0;->a:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v3, v8, La/ynb0;->b:Ljava/lang/String;

    .line 88
    .line 89
    invoke-direct {v1, v7, v2, v3}, La/d2f0;-><init>(La/jo20;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iput-byte v5, p0, La/w1f0;->j:B

    .line 93
    .line 94
    iget-object p1, p1, La/jw20;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, La/rta0;

    .line 97
    .line 98
    invoke-virtual {p1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, La/yte0;

    .line 103
    .line 104
    invoke-interface {p1, v6, v1, p0}, La/yte0;->d(Ljava/lang/String;La/d2f0;La/yje;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-ne p1, v0, :cond_5

    .line 109
    .line 110
    :goto_1
    move-object v9, v0

    .line 111
    goto :goto_4

    .line 112
    :cond_5
    :goto_2
    check-cast p1, La/q16;

    .line 113
    .line 114
    :goto_3
    invoke-static {p1}, La/yyw;->G(La/q16;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, La/fst0;

    .line 119
    .line 120
    iget-object p0, p0, La/fst0;->a:La/ort0;

    .line 121
    .line 122
    if-eqz p0, :cond_6

    .line 123
    .line 124
    invoke-static {p0}, La/xsm0;->x(La/ort0;)La/zqt0;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    goto :goto_4

    .line 129
    :cond_6
    invoke-static {v9}, La/jf4;->k(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :goto_4
    return-object v9

    .line 133
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 134
    .line 135
    iget-byte v10, p0, La/w1f0;->j:B

    .line 136
    .line 137
    if-eqz v10, :cond_9

    .line 138
    .line 139
    if-eq v10, v4, :cond_8

    .line 140
    .line 141
    if-ne v10, v5, :cond_7

    .line 142
    .line 143
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_7

    .line 147
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    goto :goto_9

    .line 151
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    if-eqz v2, :cond_b

    .line 159
    .line 160
    iget-object p1, v1, La/y1f0;->a:La/jw20;

    .line 161
    .line 162
    new-instance v1, La/d2f0;

    .line 163
    .line 164
    iget-object v2, v8, La/ynb0;->a:Ljava/lang/String;

    .line 165
    .line 166
    iget-object v3, v8, La/ynb0;->b:Ljava/lang/String;

    .line 167
    .line 168
    invoke-direct {v1, v7, v2, v3}, La/d2f0;-><init>(La/jo20;Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    iput-byte v4, p0, La/w1f0;->j:B

    .line 172
    .line 173
    iget-object p1, p1, La/jw20;->b:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p1, La/rta0;

    .line 176
    .line 177
    invoke-virtual {p1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    check-cast p1, La/yte0;

    .line 182
    .line 183
    invoke-interface {p1, v6, v1, p0}, La/yte0;->b(Ljava/lang/String;La/d2f0;La/yje;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    if-ne p1, v0, :cond_a

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_a
    :goto_5
    check-cast p1, La/q16;

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_b
    iget-object p1, v1, La/y1f0;->a:La/jw20;

    .line 194
    .line 195
    new-instance v1, La/d2f0;

    .line 196
    .line 197
    iget-object v2, v8, La/ynb0;->a:Ljava/lang/String;

    .line 198
    .line 199
    iget-object v3, v8, La/ynb0;->b:Ljava/lang/String;

    .line 200
    .line 201
    invoke-direct {v1, v7, v2, v3}, La/d2f0;-><init>(La/jo20;Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    iput-byte v5, p0, La/w1f0;->j:B

    .line 205
    .line 206
    iget-object p1, p1, La/jw20;->b:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast p1, La/rta0;

    .line 209
    .line 210
    invoke-virtual {p1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    check-cast p1, La/yte0;

    .line 215
    .line 216
    invoke-interface {p1, v6, v1, p0}, La/yte0;->e(Ljava/lang/String;La/d2f0;La/yje;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    if-ne p1, v0, :cond_c

    .line 221
    .line 222
    :goto_6
    move-object v9, v0

    .line 223
    goto :goto_9

    .line 224
    :cond_c
    :goto_7
    check-cast p1, La/q16;

    .line 225
    .line 226
    :goto_8
    invoke-static {p1}, La/yyw;->G(La/q16;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    check-cast p0, La/dn4;

    .line 231
    .line 232
    invoke-static {p0}, La/nnw0;->K(La/dn4;)La/qu4;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    :goto_9
    return-object v9

    .line 237
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 238
    .line 239
    iget-byte v10, p0, La/w1f0;->j:B

    .line 240
    .line 241
    if-eqz v10, :cond_f

    .line 242
    .line 243
    if-eq v10, v4, :cond_e

    .line 244
    .line 245
    if-ne v10, v5, :cond_d

    .line 246
    .line 247
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    goto :goto_c

    .line 251
    :cond_d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    goto :goto_e

    .line 255
    :cond_e
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    goto :goto_a

    .line 259
    :cond_f
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    if-eqz v2, :cond_11

    .line 263
    .line 264
    iget-object p1, v1, La/y1f0;->a:La/jw20;

    .line 265
    .line 266
    new-instance v1, La/d2f0;

    .line 267
    .line 268
    iget-object v2, v8, La/ynb0;->a:Ljava/lang/String;

    .line 269
    .line 270
    iget-object v3, v8, La/ynb0;->b:Ljava/lang/String;

    .line 271
    .line 272
    invoke-direct {v1, v7, v2, v3}, La/d2f0;-><init>(La/jo20;Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    iput-byte v4, p0, La/w1f0;->j:B

    .line 276
    .line 277
    iget-object p1, p1, La/jw20;->b:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast p1, La/rta0;

    .line 280
    .line 281
    invoke-virtual {p1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    check-cast p1, La/yte0;

    .line 286
    .line 287
    invoke-interface {p1, v6, v1, p0}, La/yte0;->b(Ljava/lang/String;La/d2f0;La/yje;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    if-ne p1, v0, :cond_10

    .line 292
    .line 293
    goto :goto_b

    .line 294
    :cond_10
    :goto_a
    check-cast p1, La/q16;

    .line 295
    .line 296
    goto :goto_d

    .line 297
    :cond_11
    iget-object p1, v1, La/y1f0;->a:La/jw20;

    .line 298
    .line 299
    new-instance v1, La/d2f0;

    .line 300
    .line 301
    iget-object v2, v8, La/ynb0;->a:Ljava/lang/String;

    .line 302
    .line 303
    iget-object v3, v8, La/ynb0;->b:Ljava/lang/String;

    .line 304
    .line 305
    invoke-direct {v1, v7, v2, v3}, La/d2f0;-><init>(La/jo20;Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    iput-byte v5, p0, La/w1f0;->j:B

    .line 309
    .line 310
    iget-object p1, p1, La/jw20;->b:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast p1, La/rta0;

    .line 313
    .line 314
    invoke-virtual {p1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    check-cast p1, La/yte0;

    .line 319
    .line 320
    invoke-interface {p1, v6, v1, p0}, La/yte0;->b(Ljava/lang/String;La/d2f0;La/yje;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    if-ne p1, v0, :cond_12

    .line 325
    .line 326
    :goto_b
    move-object v9, v0

    .line 327
    goto :goto_e

    .line 328
    :cond_12
    :goto_c
    check-cast p1, La/q16;

    .line 329
    .line 330
    :goto_d
    invoke-static {p1}, La/yyw;->G(La/q16;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    check-cast p0, La/dn4;

    .line 335
    .line 336
    invoke-static {p0}, La/nnw0;->K(La/dn4;)La/qu4;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    :goto_e
    return-object v9

    .line 341
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
