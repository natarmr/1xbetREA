.class public final La/wwk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/yhi;


# direct methods
.method public synthetic constructor <init>(La/yhi;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wwk0;->i:B

    iput-object p1, p0, La/wwk0;->l:La/yhi;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wwk0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/wwk0;

    .line 7
    .line 8
    iget-object p0, p0, La/wwk0;->l:La/yhi;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/wwk0;-><init>(La/yhi;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/wwk0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/wwk0;

    .line 18
    .line 19
    iget-object p0, p0, La/wwk0;->l:La/yhi;

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    invoke-direct {v0, p0, p2, v1}, La/wwk0;-><init>(La/yhi;La/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/wwk0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, La/wwk0;

    .line 29
    .line 30
    iget-object p0, p0, La/wwk0;->l:La/yhi;

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    invoke-direct {v0, p0, p2, v1}, La/wwk0;-><init>(La/yhi;La/yje;B)V

    .line 34
    .line 35
    .line 36
    iput-object p1, v0, La/wwk0;->k:Ljava/lang/Object;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_2
    new-instance v0, La/wwk0;

    .line 40
    .line 41
    iget-object p0, p0, La/wwk0;->l:La/yhi;

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-direct {v0, p0, p2, v1}, La/wwk0;-><init>(La/yhi;La/yje;B)V

    .line 45
    .line 46
    .line 47
    iput-object p1, v0, La/wwk0;->k:Ljava/lang/Object;

    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_3
    new-instance v0, La/wwk0;

    .line 51
    .line 52
    iget-object p0, p0, La/wwk0;->l:La/yhi;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-direct {v0, p0, p2, v1}, La/wwk0;-><init>(La/yhi;La/yje;B)V

    .line 56
    .line 57
    .line 58
    iput-object p1, v0, La/wwk0;->k:Ljava/lang/Object;

    .line 59
    .line 60
    return-object v0

    .line 61
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
    iget-byte v0, p0, La/wwk0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/util/List;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/wwk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wwk0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/wwk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/wwk0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/wwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/wwk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/wwk0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/wwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/wwk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/wwk0;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/wwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/wwk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/wwk0;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/wwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/wwk0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/wwk0;->l:La/yhi;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/wwk0;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/List;

    .line 15
    .line 16
    sget-object v5, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v6, p0, La/wwk0;->j:Z

    .line 19
    .line 20
    if-eqz v6, :cond_1

    .line 21
    .line 22
    if-ne v6, v3, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v1, La/yhi;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, La/bqx;

    .line 38
    .line 39
    new-instance v1, La/cqk0;

    .line 40
    .line 41
    invoke-direct {v1, v0}, La/cqk0;-><init>(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object v4, p0, La/wwk0;->k:Ljava/lang/Object;

    .line 45
    .line 46
    iput-boolean v3, p0, La/wwk0;->j:Z

    .line 47
    .line 48
    invoke-virtual {p1, v1, p0}, La/bqx;->a(La/dqk0;La/bnn0;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-ne p0, v5, :cond_2

    .line 53
    .line 54
    move-object v4, v5

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    :goto_1
    return-object v4

    .line 59
    :pswitch_0
    iget-object v0, p0, La/wwk0;->k:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ljava/lang/Throwable;

    .line 62
    .line 63
    sget-object v5, La/wne;->a:La/wne;

    .line 64
    .line 65
    iget-boolean v6, p0, La/wwk0;->j:Z

    .line 66
    .line 67
    if-eqz v6, :cond_4

    .line 68
    .line 69
    if-ne v6, v3, :cond_3

    .line 70
    .line 71
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, v1, La/yhi;->k:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, La/bqx;

    .line 85
    .line 86
    iget-object p1, p1, La/bqx;->a:La/u6t;

    .line 87
    .line 88
    iget-object p1, p1, La/u6t;->b:La/s6t;

    .line 89
    .line 90
    iget-object p1, p1, La/s6t;->a:La/ouu;

    .line 91
    .line 92
    invoke-virtual {p1}, La/ouu;->I()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    iget-object p1, v1, La/yhi;->i:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, La/bqx;

    .line 101
    .line 102
    new-instance v1, La/bqk0;

    .line 103
    .line 104
    invoke-direct {v1, v0}, La/bqk0;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    iput-object v4, p0, La/wwk0;->k:Ljava/lang/Object;

    .line 108
    .line 109
    iput-boolean v3, p0, La/wwk0;->j:Z

    .line 110
    .line 111
    invoke-virtual {p1, v1, p0}, La/bqx;->a(La/dqk0;La/bnn0;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-ne p0, v5, :cond_5

    .line 116
    .line 117
    move-object v4, v5

    .line 118
    goto :goto_3

    .line 119
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    :goto_3
    return-object v4

    .line 122
    :pswitch_1
    iget-object v0, p0, La/wwk0;->k:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Ljava/util/List;

    .line 125
    .line 126
    sget-object v5, La/wne;->a:La/wne;

    .line 127
    .line 128
    iget-boolean v6, p0, La/wwk0;->j:Z

    .line 129
    .line 130
    if-eqz v6, :cond_7

    .line 131
    .line 132
    if-ne v6, v3, :cond_6

    .line 133
    .line 134
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iget-object p1, v1, La/yhi;->h:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast p1, La/aqx;

    .line 148
    .line 149
    new-instance v1, La/cqk0;

    .line 150
    .line 151
    invoke-direct {v1, v0}, La/cqk0;-><init>(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iput-object v4, p0, La/wwk0;->k:Ljava/lang/Object;

    .line 155
    .line 156
    iput-boolean v3, p0, La/wwk0;->j:Z

    .line 157
    .line 158
    invoke-virtual {p1, v1, p0}, La/aqx;->a(La/dqk0;La/bnn0;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    if-ne p0, v5, :cond_8

    .line 163
    .line 164
    move-object v4, v5

    .line 165
    goto :goto_5

    .line 166
    :cond_8
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    :goto_5
    return-object v4

    .line 169
    :pswitch_2
    iget-object v0, p0, La/wwk0;->k:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v0, Ljava/lang/Throwable;

    .line 172
    .line 173
    sget-object v5, La/wne;->a:La/wne;

    .line 174
    .line 175
    iget-boolean v6, p0, La/wwk0;->j:Z

    .line 176
    .line 177
    if-eqz v6, :cond_a

    .line 178
    .line 179
    if-ne v6, v3, :cond_9

    .line 180
    .line 181
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    iget-object p1, v1, La/yhi;->l:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast p1, La/aqx;

    .line 195
    .line 196
    iget-object p1, p1, La/aqx;->a:La/p6t;

    .line 197
    .line 198
    iget-object p1, p1, La/p6t;->b:La/n6t;

    .line 199
    .line 200
    iget-object p1, p1, La/n6t;->a:La/ouu;

    .line 201
    .line 202
    invoke-virtual {p1}, La/ouu;->I()Z

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    if-eqz p1, :cond_b

    .line 207
    .line 208
    iget-object p1, v1, La/yhi;->h:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast p1, La/aqx;

    .line 211
    .line 212
    new-instance v1, La/bqk0;

    .line 213
    .line 214
    invoke-direct {v1, v0}, La/bqk0;-><init>(Ljava/lang/Throwable;)V

    .line 215
    .line 216
    .line 217
    iput-object v4, p0, La/wwk0;->k:Ljava/lang/Object;

    .line 218
    .line 219
    iput-boolean v3, p0, La/wwk0;->j:Z

    .line 220
    .line 221
    invoke-virtual {p1, v1, p0}, La/aqx;->a(La/dqk0;La/bnn0;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    if-ne p0, v5, :cond_b

    .line 226
    .line 227
    move-object v4, v5

    .line 228
    goto :goto_7

    .line 229
    :cond_b
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    :goto_7
    return-object v4

    .line 232
    :pswitch_3
    iget-object v0, p0, La/wwk0;->k:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, Ljava/lang/Throwable;

    .line 235
    .line 236
    sget-object v5, La/wne;->a:La/wne;

    .line 237
    .line 238
    iget-boolean v6, p0, La/wwk0;->j:Z

    .line 239
    .line 240
    if-eqz v6, :cond_d

    .line 241
    .line 242
    if-ne v6, v3, :cond_c

    .line 243
    .line 244
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    goto :goto_8

    .line 248
    :cond_c
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    goto :goto_9

    .line 252
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    iget-object p1, v1, La/yhi;->m:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast p1, La/zpx;

    .line 258
    .line 259
    iget-object p1, p1, La/zpx;->a:La/b6t;

    .line 260
    .line 261
    iget-object p1, p1, La/b6t;->b:La/v5t;

    .line 262
    .line 263
    iget-object p1, p1, La/v5t;->a:La/ouu;

    .line 264
    .line 265
    invoke-virtual {p1}, La/ouu;->I()Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    if-eqz p1, :cond_e

    .line 270
    .line 271
    iget-object p1, v1, La/yhi;->j:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast p1, La/zpx;

    .line 274
    .line 275
    new-instance v2, La/bqk0;

    .line 276
    .line 277
    invoke-direct {v2, v0}, La/bqk0;-><init>(Ljava/lang/Throwable;)V

    .line 278
    .line 279
    .line 280
    iget-object v0, v1, La/yhi;->v:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v0, La/n0w;

    .line 283
    .line 284
    iput-object v4, p0, La/wwk0;->k:Ljava/lang/Object;

    .line 285
    .line 286
    iput-boolean v3, p0, La/wwk0;->j:Z

    .line 287
    .line 288
    invoke-virtual {p1, v2, v0, p0}, La/zpx;->a(La/dqk0;La/n0w;La/bnn0;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    if-ne p0, v5, :cond_e

    .line 293
    .line 294
    move-object v4, v5

    .line 295
    goto :goto_9

    .line 296
    :cond_e
    :goto_8
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    :goto_9
    return-object v4

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
