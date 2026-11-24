.class public final La/wa90;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/db90;


# direct methods
.method public synthetic constructor <init>(La/db90;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wa90;->i:B

    iput-object p1, p0, La/wa90;->k:La/db90;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/wa90;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wa90;->k:La/db90;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/wa90;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/wa90;-><init>(La/db90;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/wa90;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/wa90;-><init>(La/db90;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/wa90;

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/wa90;-><init>(La/db90;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/wa90;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/wa90;-><init>(La/db90;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/wa90;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/wa90;-><init>(La/db90;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wa90;->i:B

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
    invoke-virtual {p0, p1, p2}, La/wa90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wa90;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wa90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/wa90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/wa90;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/wa90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/wa90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/wa90;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/wa90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/wa90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/wa90;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/wa90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/wa90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/wa90;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/wa90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/wa90;->i:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/16 v2, 0x19

    .line 5
    .line 6
    iget-object v3, p0, La/wa90;->k:La/db90;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v1, p0, La/wa90;->j:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    if-ne v1, v6, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v3, La/db90;->w:La/suk;

    .line 35
    .line 36
    iget-object p1, p1, La/suk;->a:La/ts4;

    .line 37
    .line 38
    iget-object p1, p1, La/ts4;->e:La/vo4;

    .line 39
    .line 40
    iget-object p1, p1, La/vo4;->a:La/qoj0;

    .line 41
    .line 42
    new-instance v1, La/wk30;

    .line 43
    .line 44
    const/16 v4, 0xd

    .line 45
    .line 46
    invoke-direct {v1, p1, v4}, La/wk30;-><init>(La/gmq;B)V

    .line 47
    .line 48
    .line 49
    new-instance p1, La/eu4;

    .line 50
    .line 51
    invoke-direct {p1, v1, v2}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    new-instance v1, La/mi80;

    .line 55
    .line 56
    const/16 v2, 0x17

    .line 57
    .line 58
    invoke-direct {v1, v3, v2}, La/mi80;-><init>(Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    iput-boolean v6, p0, La/wa90;->j:Z

    .line 62
    .line 63
    invoke-virtual {p1, v1, p0}, La/eu4;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-ne p0, v0, :cond_2

    .line 68
    .line 69
    move-object v4, v0

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    :goto_1
    return-object v4

    .line 74
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 75
    .line 76
    iget-boolean v1, p0, La/wa90;->j:Z

    .line 77
    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    if-ne v1, v6, :cond_3

    .line 81
    .line 82
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, v3, La/db90;->K:La/pru;

    .line 94
    .line 95
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iget-wide v4, p1, La/sff0;->u1:J

    .line 100
    .line 101
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 102
    .line 103
    invoke-virtual {p1, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    const-wide/16 v7, 0x0

    .line 108
    .line 109
    const/4 p1, 0x6

    .line 110
    invoke-static {p1, v4, v5, v7, v8}, La/sac;->L(IJJ)La/vsg0;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iput-boolean v6, p0, La/wa90;->j:Z

    .line 115
    .line 116
    invoke-static {p1, p0}, La/slb;->N(La/gmq;La/yje;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    if-ne p0, v0, :cond_5

    .line 121
    .line 122
    move-object v4, v0

    .line 123
    goto :goto_3

    .line 124
    :cond_5
    :goto_2
    sget p0, La/db90;->M:I

    .line 125
    .line 126
    new-instance p0, La/obg;

    .line 127
    .line 128
    invoke-direct {p0, v2, v6}, La/obg;-><init>(BZ)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, p0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    :goto_3
    return-object v4

    .line 137
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 138
    .line 139
    iget-boolean v1, p0, La/wa90;->j:Z

    .line 140
    .line 141
    if-eqz v1, :cond_7

    .line 142
    .line 143
    if-ne v1, v6, :cond_6

    .line 144
    .line 145
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_6
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    iget-object p1, v3, La/db90;->v:La/z7z;

    .line 157
    .line 158
    invoke-interface {p1}, La/z7z;->get()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    check-cast p1, La/buo0;

    .line 163
    .line 164
    sget-object v1, La/hae0;->d:La/hae0;

    .line 165
    .line 166
    iput-boolean v6, p0, La/wa90;->j:Z

    .line 167
    .line 168
    invoke-virtual {p1, v1, p0}, La/buo0;->a(La/hae0;La/zje;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    if-ne p0, v0, :cond_8

    .line 173
    .line 174
    move-object v4, v0

    .line 175
    goto :goto_5

    .line 176
    :cond_8
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    :goto_5
    return-object v4

    .line 179
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 180
    .line 181
    iget-boolean v2, p0, La/wa90;->j:Z

    .line 182
    .line 183
    iget-object v8, p0, La/wa90;->k:La/db90;

    .line 184
    .line 185
    if-eqz v2, :cond_a

    .line 186
    .line 187
    if-ne v2, v6, :cond_9

    .line 188
    .line 189
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_9
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_8

    .line 197
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    iget-object p1, v8, La/db90;->u:La/ahu;

    .line 201
    .line 202
    iput-boolean v6, p0, La/wa90;->j:Z

    .line 203
    .line 204
    invoke-static {p1, p0}, La/ahu;->c(La/ahu;La/yje;)Ljava/io/Serializable;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    if-ne p1, v0, :cond_b

    .line 209
    .line 210
    move-object v4, v0

    .line 211
    goto :goto_8

    .line 212
    :cond_b
    :goto_6
    check-cast p1, La/ql5;

    .line 213
    .line 214
    iget-object p0, p1, La/ql5;->i:La/txs0;

    .line 215
    .line 216
    invoke-virtual {p0}, La/txs0;->a()Z

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    if-eqz p0, :cond_c

    .line 221
    .line 222
    sget p0, La/db90;->M:I

    .line 223
    .line 224
    sget-object p0, La/x990;->a:La/x990;

    .line 225
    .line 226
    invoke-virtual {v8, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_c
    iget-object p0, v8, La/db90;->o:La/k790;

    .line 231
    .line 232
    iget-wide v9, p0, La/k790;->b:J

    .line 233
    .line 234
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    iget-object p0, v8, La/db90;->D:La/mne;

    .line 239
    .line 240
    iget-object v5, p0, La/mne;->b:La/dvj;

    .line 241
    .line 242
    new-instance v3, La/ua90;

    .line 243
    .line 244
    invoke-direct {v3, v8, v1}, La/ua90;-><init>(La/db90;B)V

    .line 245
    .line 246
    .line 247
    new-instance v6, La/n1;

    .line 248
    .line 249
    const/4 v11, 0x0

    .line 250
    const/16 v12, 0x14

    .line 251
    .line 252
    move-object v7, v6

    .line 253
    invoke-direct/range {v7 .. v12}, La/n1;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 254
    .line 255
    .line 256
    const/16 v7, 0xa

    .line 257
    .line 258
    const/4 v4, 0x0

    .line 259
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 260
    .line 261
    .line 262
    :goto_7
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    :goto_8
    return-object v4

    .line 265
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 266
    .line 267
    iget-boolean v2, p0, La/wa90;->j:Z

    .line 268
    .line 269
    iget-object v8, p0, La/wa90;->k:La/db90;

    .line 270
    .line 271
    if-eqz v2, :cond_e

    .line 272
    .line 273
    if-ne v2, v6, :cond_d

    .line 274
    .line 275
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    goto :goto_9

    .line 279
    :cond_d
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    goto :goto_a

    .line 283
    :cond_e
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    iget-object p1, v8, La/db90;->F:La/nou;

    .line 287
    .line 288
    iput-boolean v6, p0, La/wa90;->j:Z

    .line 289
    .line 290
    invoke-static {p1, p0}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    if-ne p1, v0, :cond_f

    .line 295
    .line 296
    move-object v4, v0

    .line 297
    goto :goto_a

    .line 298
    :cond_f
    :goto_9
    check-cast p1, La/ql5;

    .line 299
    .line 300
    iget-wide v9, p1, La/ql5;->a:J

    .line 301
    .line 302
    sget p0, La/db90;->M:I

    .line 303
    .line 304
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    iget-object p0, v8, La/db90;->D:La/mne;

    .line 309
    .line 310
    iget-object v5, p0, La/mne;->b:La/dvj;

    .line 311
    .line 312
    new-instance v3, La/ua90;

    .line 313
    .line 314
    invoke-direct {v3, v8, v1}, La/ua90;-><init>(La/db90;B)V

    .line 315
    .line 316
    .line 317
    new-instance v6, La/n1;

    .line 318
    .line 319
    const/4 v11, 0x0

    .line 320
    const/16 v12, 0x14

    .line 321
    .line 322
    move-object v7, v6

    .line 323
    invoke-direct/range {v7 .. v12}, La/n1;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 324
    .line 325
    .line 326
    const/16 v7, 0xa

    .line 327
    .line 328
    const/4 v4, 0x0

    .line 329
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 330
    .line 331
    .line 332
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 333
    .line 334
    :goto_a
    return-object v4

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
