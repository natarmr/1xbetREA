.class public final La/zz6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/b07;

.field public final synthetic l:La/rg5;


# direct methods
.method public synthetic constructor <init>(La/b07;La/rg5;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/zz6;->i:B

    iput-object p1, p0, La/zz6;->k:La/b07;

    iput-object p2, p0, La/zz6;->l:La/rg5;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/zz6;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/zz6;->l:La/rg5;

    .line 4
    .line 5
    iget-object p0, p0, La/zz6;->k:La/b07;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/zz6;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/zz6;-><init>(La/b07;La/rg5;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/zz6;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/zz6;-><init>(La/b07;La/rg5;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/zz6;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {p1, p0, v0, p2, v1}, La/zz6;-><init>(La/b07;La/rg5;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_2
    new-instance p1, La/zz6;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {p1, p0, v0, p2, v1}, La/zz6;-><init>(La/b07;La/rg5;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    nop

    .line 39
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
    iget-byte v0, p0, La/zz6;->i:B

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
    invoke-virtual {p0, p1, p2}, La/zz6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zz6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zz6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/zz6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/zz6;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/zz6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/zz6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/zz6;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/zz6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/zz6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/zz6;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/zz6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/zz6;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/zz6;->l:La/rg5;

    .line 5
    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v4, p0, La/zz6;->k:La/b07;

    .line 9
    .line 10
    const/4 v5, 0x1

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
    iget-boolean v7, p0, La/zz6;->j:Z

    .line 18
    .line 19
    if-eqz v7, :cond_1

    .line 20
    .line 21
    if-ne v7, v5, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, v4, La/b07;->e:La/mne;

    .line 35
    .line 36
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 37
    .line 38
    new-instance v3, La/zz6;

    .line 39
    .line 40
    const/4 v7, 0x2

    .line 41
    invoke-direct {v3, v4, v2, v6, v7}, La/zz6;-><init>(La/b07;La/rg5;La/yje;B)V

    .line 42
    .line 43
    .line 44
    iput-boolean v5, p0, La/zz6;->j:Z

    .line 45
    .line 46
    invoke-static {p1, v3, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    move-object v6, v0

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    :goto_0
    check-cast p1, La/k390;

    .line 55
    .line 56
    sget-object p0, La/b07;->w:Ljava/util/List;

    .line 57
    .line 58
    iget v0, v4, La/b07;->t:I

    .line 59
    .line 60
    new-instance v2, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p0, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    new-instance v0, La/pz6;

    .line 70
    .line 71
    iget v2, v4, La/b07;->t:I

    .line 72
    .line 73
    invoke-direct {v0, p1, v2, p0}, La/pz6;-><init>(La/k390;II)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v0}, La/b07;->z(La/xz6;)V

    .line 77
    .line 78
    .line 79
    new-instance p0, La/tz6;

    .line 80
    .line 81
    invoke-direct {p0, v1}, La/tz6;-><init>(Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, p0}, La/b07;->z(La/xz6;)V

    .line 85
    .line 86
    .line 87
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    :goto_1
    return-object v6

    .line 90
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 91
    .line 92
    iget-boolean v1, p0, La/zz6;->j:Z

    .line 93
    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    if-ne v1, v5, :cond_3

    .line 97
    .line 98
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    move-object p1, v6

    .line 106
    goto :goto_2

    .line 107
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, v4, La/b07;->h:La/dq00;

    .line 111
    .line 112
    iget v7, v4, La/b07;->t:I

    .line 113
    .line 114
    iget-boolean v13, v2, La/rg5;->e:Z

    .line 115
    .line 116
    iget-wide v10, v2, La/rg5;->a:J

    .line 117
    .line 118
    iput-boolean v5, p0, La/zz6;->j:Z

    .line 119
    .line 120
    iget-object v1, p1, La/dq00;->b:Ljava/lang/Object;

    .line 121
    .line 122
    move-object v6, v1

    .line 123
    check-cast v6, La/rkc0;

    .line 124
    .line 125
    iget-object p1, p1, La/dq00;->c:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, La/s470;

    .line 128
    .line 129
    invoke-virtual {p1}, La/s470;->a()J

    .line 130
    .line 131
    .line 132
    move-result-wide v8

    .line 133
    move-object v12, p0

    .line 134
    invoke-virtual/range {v6 .. v13}, La/rkc0;->b(IJJLa/zje;Z)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-ne p1, v0, :cond_5

    .line 139
    .line 140
    move-object p1, v0

    .line 141
    :cond_5
    :goto_2
    return-object p1

    .line 142
    :pswitch_1
    move-object v8, p0

    .line 143
    sget-object p0, La/wne;->a:La/wne;

    .line 144
    .line 145
    iget-boolean v0, v8, La/zz6;->j:Z

    .line 146
    .line 147
    if-eqz v0, :cond_7

    .line 148
    .line 149
    if-ne v0, v5, :cond_6

    .line 150
    .line 151
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, v4, La/b07;->g:La/iqi;

    .line 163
    .line 164
    iget-wide v6, v2, La/rg5;->a:J

    .line 165
    .line 166
    iput-boolean v5, v8, La/zz6;->j:Z

    .line 167
    .line 168
    iget-object v0, p1, La/iqi;->b:Ljava/lang/Object;

    .line 169
    .line 170
    move-object v3, v0

    .line 171
    check-cast v3, La/rkc0;

    .line 172
    .line 173
    iget-object p1, p1, La/iqi;->c:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p1, La/s470;

    .line 176
    .line 177
    invoke-virtual {p1}, La/s470;->a()J

    .line 178
    .line 179
    .line 180
    move-result-wide v4

    .line 181
    invoke-virtual/range {v3 .. v8}, La/rkc0;->a(JJLa/zje;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    if-ne p1, p0, :cond_8

    .line 186
    .line 187
    move-object v6, p0

    .line 188
    goto :goto_4

    .line 189
    :cond_8
    :goto_3
    check-cast p1, La/pl5;

    .line 190
    .line 191
    iget-wide p0, p1, La/pl5;->d:D

    .line 192
    .line 193
    new-instance v0, Ljava/lang/Double;

    .line 194
    .line 195
    invoke-direct {v0, p0, p1}, Ljava/lang/Double;-><init>(D)V

    .line 196
    .line 197
    .line 198
    iget-object p0, v2, La/rg5;->d:Ljava/lang/String;

    .line 199
    .line 200
    new-instance v6, Lkotlin/Pair;

    .line 201
    .line 202
    invoke-direct {v6, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :goto_4
    return-object v6

    .line 206
    :pswitch_2
    move-object v8, p0

    .line 207
    sget-object p0, La/wne;->a:La/wne;

    .line 208
    .line 209
    iget-boolean v0, v8, La/zz6;->j:Z

    .line 210
    .line 211
    if-eqz v0, :cond_a

    .line 212
    .line 213
    if-ne v0, v5, :cond_9

    .line 214
    .line 215
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    iput-boolean v5, v8, La/zz6;->j:Z

    .line 227
    .line 228
    sget-object p1, La/b07;->w:Ljava/util/List;

    .line 229
    .line 230
    invoke-virtual {v4, v2, v8}, La/b07;->y(La/rg5;La/bnn0;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-ne p1, p0, :cond_b

    .line 235
    .line 236
    move-object v6, p0

    .line 237
    goto :goto_6

    .line 238
    :cond_b
    :goto_5
    check-cast p1, Lkotlin/Pair;

    .line 239
    .line 240
    iget-object p0, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 241
    .line 242
    iget-object p1, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast p0, Ljava/lang/String;

    .line 245
    .line 246
    iput-object p0, v4, La/b07;->r:Ljava/lang/String;

    .line 247
    .line 248
    check-cast p1, Ljava/lang/Number;

    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 251
    .line 252
    .line 253
    move-result-wide v2

    .line 254
    iput-wide v2, v4, La/b07;->s:D

    .line 255
    .line 256
    new-instance p0, La/nz6;

    .line 257
    .line 258
    sget-object v0, La/pn40;->a:La/pn40;

    .line 259
    .line 260
    iget v0, v4, La/b07;->t:I

    .line 261
    .line 262
    int-to-double v2, v0

    .line 263
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 264
    .line 265
    .line 266
    move-result-wide v5

    .line 267
    mul-double/2addr v5, v2

    .line 268
    iget-object p1, v4, La/b07;->r:Ljava/lang/String;

    .line 269
    .line 270
    sget-object v0, La/p3u0;->c:La/p3u0;

    .line 271
    .line 272
    invoke-static {v5, v6, p1, v0}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    invoke-direct {p0, p1}, La/nz6;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4, p0}, La/b07;->z(La/xz6;)V

    .line 280
    .line 281
    .line 282
    new-instance p0, La/tz6;

    .line 283
    .line 284
    invoke-direct {p0, v1}, La/tz6;-><init>(Z)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v4, p0}, La/b07;->z(La/xz6;)V

    .line 288
    .line 289
    .line 290
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 291
    .line 292
    :goto_6
    return-object v6

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
