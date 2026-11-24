.class public final La/i92;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/n92;


# direct methods
.method public synthetic constructor <init>(La/n92;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/i92;->i:B

    iput-object p1, p0, La/i92;->k:La/n92;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/i92;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/i92;->k:La/n92;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/i92;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/i92;-><init>(La/n92;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/i92;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/i92;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/i92;-><init>(La/n92;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/i92;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/i92;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/i92;-><init>(La/n92;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/i92;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/i92;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/i92;-><init>(La/n92;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/i92;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
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
    iget-byte v0, p0, La/i92;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/dj50;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/i92;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/i92;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/i92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/uf50;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/i92;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/i92;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/i92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/uaq0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/i92;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/i92;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/i92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/i92;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/i92;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/i92;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/i92;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/i92;->k:La/n92;

    .line 5
    .line 6
    iget-object p0, p0, La/i92;->j:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v8, p0

    .line 12
    check-cast v8, La/dj50;

    .line 13
    .line 14
    sget-object p0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, La/n92;->h0:Lkotlin/ranges/IntRange;

    .line 20
    .line 21
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 22
    .line 23
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 24
    .line 25
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-object v3, p0

    .line 33
    check-cast v3, La/d92;

    .line 34
    .line 35
    const/4 v11, 0x0

    .line 36
    const/16 v12, 0x7bf

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    const-wide/16 v9, 0x0

    .line 43
    .line 44
    invoke-static/range {v3 .. v12}, La/d92;->a(La/d92;La/b92;La/lwk0;Ljava/util/List;La/yi50;La/dj50;JLa/bj50;I)La/d92;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_0
    check-cast p0, La/uf50;

    .line 58
    .line 59
    sget-object v0, La/wne;->a:La/wne;

    .line 60
    .line 61
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, La/o00;

    .line 65
    .line 66
    const/16 v0, 0x1d

    .line 67
    .line 68
    invoke-direct {p1, p0, v0}, La/o00;-><init>(Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    sget-object v0, La/n92;->h0:Lkotlin/ranges/IntRange;

    .line 72
    .line 73
    invoke-virtual {v2, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 74
    .line 75
    .line 76
    if-nez p0, :cond_3

    .line 77
    .line 78
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/d92;

    .line 83
    .line 84
    iget-object p0, p0, La/d92;->b:La/b92;

    .line 85
    .line 86
    iget-object p0, p0, La/b92;->d:La/lok0;

    .line 87
    .line 88
    iget-boolean p0, p0, La/lok0;->r:Z

    .line 89
    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    iget-object p0, v2, La/n92;->e0:La/bby;

    .line 93
    .line 94
    const/4 p1, 0x3

    .line 95
    const/4 v0, 0x1

    .line 96
    const/4 v1, 0x0

    .line 97
    if-eqz p0, :cond_1

    .line 98
    .line 99
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-ne p0, v0, :cond_1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_1
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    iget-object p0, v2, La/n92;->r:La/mne;

    .line 111
    .line 112
    iget-object v6, p0, La/mne;->a:La/rwj;

    .line 113
    .line 114
    new-instance v4, La/g92;

    .line 115
    .line 116
    invoke-direct {v4, v2, p1}, La/g92;-><init>(La/n92;B)V

    .line 117
    .line 118
    .line 119
    new-instance v7, La/pa;

    .line 120
    .line 121
    const/16 p0, 0x14

    .line 122
    .line 123
    invoke-direct {v7, v2, v1, p0}, La/pa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 124
    .line 125
    .line 126
    const/16 v8, 0xa

    .line 127
    .line 128
    const/4 v5, 0x0

    .line 129
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    iput-object p0, v2, La/n92;->e0:La/bby;

    .line 134
    .line 135
    :goto_0
    iget-object p0, v2, La/n92;->f0:La/c4m0;

    .line 136
    .line 137
    if-eqz p0, :cond_2

    .line 138
    .line 139
    invoke-virtual {p0}, La/pby;->isActive()Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    if-ne p0, v0, :cond_2

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_2
    iget-object p0, v2, La/n92;->P:La/reu;

    .line 147
    .line 148
    iget-object p0, p0, La/reu;->b:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p0, La/d5m0;

    .line 151
    .line 152
    iget-object p0, p0, La/d5m0;->a:La/c5m0;

    .line 153
    .line 154
    iget-object p0, p0, La/c5m0;->a:La/p7m0;

    .line 155
    .line 156
    new-instance v3, La/i89;

    .line 157
    .line 158
    const/16 v4, 0x16

    .line 159
    .line 160
    invoke-direct {v3, p0, v4}, La/i89;-><init>(La/gmq;B)V

    .line 161
    .line 162
    .line 163
    new-instance p0, La/yg1;

    .line 164
    .line 165
    invoke-direct {p0, v2, v1, v0}, La/yg1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 166
    .line 167
    .line 168
    new-instance v4, La/fnq;

    .line 169
    .line 170
    const/4 v5, 0x4

    .line 171
    invoke-direct {v4, v3, p0, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 172
    .line 173
    .line 174
    new-instance p0, La/l92;

    .line 175
    .line 176
    const/4 v3, 0x2

    .line 177
    invoke-direct {p0, v2, v1, v3}, La/l92;-><init>(La/n92;La/yje;B)V

    .line 178
    .line 179
    .line 180
    new-instance v3, La/dnq;

    .line 181
    .line 182
    invoke-direct {v3, v4, p0, v0}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 183
    .line 184
    .line 185
    invoke-static {v2, v3, v1, v1, p1}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    iput-object p0, v2, La/n92;->f0:La/c4m0;

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_3
    iget-object p0, v2, La/n92;->e0:La/bby;

    .line 193
    .line 194
    invoke-static {p0}, La/v3c;->N(La/bby;)V

    .line 195
    .line 196
    .line 197
    iget-object p0, v2, La/n92;->f0:La/c4m0;

    .line 198
    .line 199
    invoke-static {p0}, La/v3c;->N(La/bby;)V

    .line 200
    .line 201
    .line 202
    iget-object p0, v2, La/n92;->Q:La/i6m0;

    .line 203
    .line 204
    iget-object p0, p0, La/i6m0;->a:La/d5m0;

    .line 205
    .line 206
    iget-object p0, p0, La/d5m0;->a:La/c5m0;

    .line 207
    .line 208
    iput-boolean v1, p0, La/c5m0;->b:Z

    .line 209
    .line 210
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 211
    .line 212
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 213
    .line 214
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    iget-object p1, v2, La/i3t0;->f:La/oyg0;

    .line 222
    .line 223
    move-object v3, p0

    .line 224
    check-cast v3, La/d92;

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    const/4 v11, 0x0

    .line 230
    const/16 v12, 0x6ff

    .line 231
    .line 232
    const/4 v4, 0x0

    .line 233
    const/4 v5, 0x0

    .line 234
    const/4 v6, 0x0

    .line 235
    const/4 v7, 0x0

    .line 236
    const/4 v8, 0x0

    .line 237
    const-wide/16 v9, 0x0

    .line 238
    .line 239
    invoke-static/range {v3 .. v12}, La/d92;->a(La/d92;La/b92;La/lwk0;Ljava/util/List;La/yi50;La/dj50;JLa/bj50;I)La/d92;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result p0

    .line 247
    if-eqz p0, :cond_4

    .line 248
    .line 249
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object p0

    .line 252
    :pswitch_1
    check-cast p0, La/uaq0;

    .line 253
    .line 254
    sget-object v0, La/wne;->a:La/wne;

    .line 255
    .line 256
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    new-instance p1, La/k92;

    .line 260
    .line 261
    invoke-direct {p1, p0, v1}, La/k92;-><init>(La/uaq0;B)V

    .line 262
    .line 263
    .line 264
    sget-object p0, La/n92;->h0:Lkotlin/ranges/IntRange;

    .line 265
    .line 266
    invoke-virtual {v2, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 267
    .line 268
    .line 269
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    return-object p0

    .line 272
    :pswitch_2
    move-object v6, p0

    .line 273
    check-cast v6, Ljava/util/List;

    .line 274
    .line 275
    sget-object p0, La/wne;->a:La/wne;

    .line 276
    .line 277
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    sget-object p0, La/n92;->h0:Lkotlin/ranges/IntRange;

    .line 281
    .line 282
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 283
    .line 284
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 285
    .line 286
    :cond_5
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-object v3, p1

    .line 294
    check-cast v3, La/d92;

    .line 295
    .line 296
    const/4 v11, 0x0

    .line 297
    const/16 v12, 0x7f7

    .line 298
    .line 299
    const/4 v4, 0x0

    .line 300
    const/4 v5, 0x0

    .line 301
    const/4 v7, 0x0

    .line 302
    const/4 v8, 0x0

    .line 303
    const-wide/16 v9, 0x0

    .line 304
    .line 305
    invoke-static/range {v3 .. v12}, La/d92;->a(La/d92;La/b92;La/lwk0;Ljava/util/List;La/yi50;La/dj50;JLa/bj50;I)La/d92;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result p1

    .line 313
    if-eqz p1, :cond_5

    .line 314
    .line 315
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    return-object p0

    .line 318
    nop

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
