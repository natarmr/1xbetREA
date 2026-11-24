.class public final La/xi1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/d9z;

.field public final synthetic l:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/d9z;Lkotlin/jvm/functions/Function0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/xi1;->i:B

    iput-object p1, p0, La/xi1;->k:La/d9z;

    iput-object p2, p0, La/xi1;->l:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/xi1;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/xi1;->l:Lkotlin/jvm/functions/Function0;

    .line 4
    .line 5
    iget-object p0, p0, La/xi1;->k:La/d9z;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/xi1;

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/xi1;-><init>(La/d9z;Lkotlin/jvm/functions/Function0;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/xi1;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/xi1;-><init>(La/d9z;Lkotlin/jvm/functions/Function0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/xi1;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-direct {p1, p0, v0, p2, v1}, La/xi1;-><init>(La/d9z;Lkotlin/jvm/functions/Function0;La/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :pswitch_2
    new-instance p1, La/xi1;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-direct {p1, p0, v0, p2, v1}, La/xi1;-><init>(La/d9z;Lkotlin/jvm/functions/Function0;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_3
    new-instance p1, La/xi1;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {p1, p0, v0, p2, v1}, La/xi1;-><init>(La/d9z;Lkotlin/jvm/functions/Function0;La/yje;B)V

    .line 42
    .line 43
    .line 44
    return-object p1

    .line 45
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
    iget-byte v0, p0, La/xi1;->i:B

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
    invoke-virtual {p0, p1, p2}, La/xi1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xi1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xi1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/xi1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/xi1;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/xi1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/xi1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/xi1;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/xi1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/xi1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/xi1;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/xi1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/xi1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/xi1;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/xi1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/xi1;->i:B

    .line 2
    .line 3
    sget-object v1, La/h660;->a:La/h660;

    .line 4
    .line 5
    iget-object v2, p0, La/xi1;->l:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget-object v4, p0, La/xi1;->k:La/d9z;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v8, p0, La/xi1;->j:Z

    .line 20
    .line 21
    if-eqz v8, :cond_1

    .line 22
    .line 23
    if-ne v8, v6, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, La/ti1;

    .line 37
    .line 38
    const/4 v3, 0x4

    .line 39
    invoke-direct {p1, v4, v3}, La/ti1;-><init>(La/d9z;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v8, La/vi1;

    .line 47
    .line 48
    invoke-direct {v8, p1, v7, v4, v3}, La/vi1;-><init>(La/vsg0;La/yje;La/d9z;B)V

    .line 49
    .line 50
    .line 51
    new-instance p1, La/vsg0;

    .line 52
    .line 53
    invoke-direct {p1, v8}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 54
    .line 55
    .line 56
    new-instance v3, La/wi1;

    .line 57
    .line 58
    const/4 v4, 0x5

    .line 59
    invoke-direct {v3, v2, v7, v4}, La/wi1;-><init>(Lkotlin/jvm/functions/Function0;La/yje;B)V

    .line 60
    .line 61
    .line 62
    iput-boolean v6, p0, La/xi1;->j:Z

    .line 63
    .line 64
    new-instance v2, La/vnq;

    .line 65
    .line 66
    invoke-direct {v2, v1, v3, v5}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v2, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-ne p0, v0, :cond_2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_0
    if-ne p0, v0, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    :goto_1
    if-ne p0, v0, :cond_4

    .line 84
    .line 85
    move-object v7, v0

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    :goto_2
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    :goto_3
    return-object v7

    .line 90
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 91
    .line 92
    iget-boolean v8, p0, La/xi1;->j:Z

    .line 93
    .line 94
    if-eqz v8, :cond_6

    .line 95
    .line 96
    if-ne v8, v6, :cond_5

    .line 97
    .line 98
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    new-instance p1, La/ti1;

    .line 110
    .line 111
    const/4 v3, 0x3

    .line 112
    invoke-direct {p1, v4, v3}, La/ti1;-><init>(La/d9z;B)V

    .line 113
    .line 114
    .line 115
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    new-instance v8, La/vi1;

    .line 120
    .line 121
    invoke-direct {v8, p1, v7, v4, v3}, La/vi1;-><init>(La/vsg0;La/yje;La/d9z;B)V

    .line 122
    .line 123
    .line 124
    new-instance p1, La/vsg0;

    .line 125
    .line 126
    invoke-direct {p1, v8}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 127
    .line 128
    .line 129
    new-instance v4, La/wi1;

    .line 130
    .line 131
    invoke-direct {v4, v2, v7, v3}, La/wi1;-><init>(Lkotlin/jvm/functions/Function0;La/yje;B)V

    .line 132
    .line 133
    .line 134
    iput-boolean v6, p0, La/xi1;->j:Z

    .line 135
    .line 136
    new-instance v2, La/vnq;

    .line 137
    .line 138
    invoke-direct {v2, v1, v4, v5}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v2, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-ne p0, v0, :cond_7

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    :goto_4
    if-ne p0, v0, :cond_8

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    :goto_5
    if-ne p0, v0, :cond_9

    .line 156
    .line 157
    move-object v7, v0

    .line 158
    goto :goto_7

    .line 159
    :cond_9
    :goto_6
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    :goto_7
    return-object v7

    .line 162
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 163
    .line 164
    iget-boolean v8, p0, La/xi1;->j:Z

    .line 165
    .line 166
    if-eqz v8, :cond_b

    .line 167
    .line 168
    if-ne v8, v6, :cond_a

    .line 169
    .line 170
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto :goto_a

    .line 174
    :cond_a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    goto :goto_b

    .line 178
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    new-instance p1, La/ti1;

    .line 182
    .line 183
    invoke-direct {p1, v4, v5}, La/ti1;-><init>(La/d9z;B)V

    .line 184
    .line 185
    .line 186
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    new-instance v3, La/vi1;

    .line 191
    .line 192
    invoke-direct {v3, p1, v7, v4, v5}, La/vi1;-><init>(La/vsg0;La/yje;La/d9z;B)V

    .line 193
    .line 194
    .line 195
    new-instance p1, La/vsg0;

    .line 196
    .line 197
    invoke-direct {p1, v3}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 198
    .line 199
    .line 200
    new-instance v3, La/wi1;

    .line 201
    .line 202
    invoke-direct {v3, v2, v7, v5}, La/wi1;-><init>(Lkotlin/jvm/functions/Function0;La/yje;B)V

    .line 203
    .line 204
    .line 205
    iput-boolean v6, p0, La/xi1;->j:Z

    .line 206
    .line 207
    new-instance v2, La/vnq;

    .line 208
    .line 209
    invoke-direct {v2, v1, v3, v5}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, v2, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    if-ne p0, v0, :cond_c

    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    :goto_8
    if-ne p0, v0, :cond_d

    .line 222
    .line 223
    goto :goto_9

    .line 224
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    :goto_9
    if-ne p0, v0, :cond_e

    .line 227
    .line 228
    move-object v7, v0

    .line 229
    goto :goto_b

    .line 230
    :cond_e
    :goto_a
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    :goto_b
    return-object v7

    .line 233
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 234
    .line 235
    iget-boolean v8, p0, La/xi1;->j:Z

    .line 236
    .line 237
    if-eqz v8, :cond_10

    .line 238
    .line 239
    if-ne v8, v6, :cond_f

    .line 240
    .line 241
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    goto :goto_e

    .line 245
    :cond_f
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    goto :goto_f

    .line 249
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    new-instance p1, La/ti1;

    .line 253
    .line 254
    invoke-direct {p1, v4, v6}, La/ti1;-><init>(La/d9z;B)V

    .line 255
    .line 256
    .line 257
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    new-instance v3, La/vi1;

    .line 262
    .line 263
    invoke-direct {v3, p1, v7, v4, v6}, La/vi1;-><init>(La/vsg0;La/yje;La/d9z;B)V

    .line 264
    .line 265
    .line 266
    new-instance p1, La/vsg0;

    .line 267
    .line 268
    invoke-direct {p1, v3}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 269
    .line 270
    .line 271
    new-instance v3, La/wi1;

    .line 272
    .line 273
    invoke-direct {v3, v2, v7, v6}, La/wi1;-><init>(Lkotlin/jvm/functions/Function0;La/yje;B)V

    .line 274
    .line 275
    .line 276
    iput-boolean v6, p0, La/xi1;->j:Z

    .line 277
    .line 278
    new-instance v2, La/vnq;

    .line 279
    .line 280
    invoke-direct {v2, v1, v3, v5}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1, v2, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    if-ne p0, v0, :cond_11

    .line 288
    .line 289
    goto :goto_c

    .line 290
    :cond_11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 291
    .line 292
    :goto_c
    if-ne p0, v0, :cond_12

    .line 293
    .line 294
    goto :goto_d

    .line 295
    :cond_12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    :goto_d
    if-ne p0, v0, :cond_13

    .line 298
    .line 299
    move-object v7, v0

    .line 300
    goto :goto_f

    .line 301
    :cond_13
    :goto_e
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    :goto_f
    return-object v7

    .line 304
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 305
    .line 306
    iget-boolean v8, p0, La/xi1;->j:Z

    .line 307
    .line 308
    if-eqz v8, :cond_15

    .line 309
    .line 310
    if-ne v8, v6, :cond_14

    .line 311
    .line 312
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    goto :goto_12

    .line 316
    :cond_14
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    goto :goto_13

    .line 320
    :cond_15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    new-instance p1, La/ti1;

    .line 324
    .line 325
    const/4 v3, 0x0

    .line 326
    invoke-direct {p1, v4, v3}, La/ti1;-><init>(La/d9z;B)V

    .line 327
    .line 328
    .line 329
    invoke-static {v7, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    new-instance v8, La/vi1;

    .line 334
    .line 335
    invoke-direct {v8, p1, v7, v4, v3}, La/vi1;-><init>(La/vsg0;La/yje;La/d9z;B)V

    .line 336
    .line 337
    .line 338
    new-instance p1, La/vsg0;

    .line 339
    .line 340
    invoke-direct {p1, v8}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 341
    .line 342
    .line 343
    new-instance v4, La/wi1;

    .line 344
    .line 345
    invoke-direct {v4, v2, v7, v3}, La/wi1;-><init>(Lkotlin/jvm/functions/Function0;La/yje;B)V

    .line 346
    .line 347
    .line 348
    iput-boolean v6, p0, La/xi1;->j:Z

    .line 349
    .line 350
    new-instance v2, La/vnq;

    .line 351
    .line 352
    invoke-direct {v2, v1, v4, v5}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p1, v2, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    if-ne p0, v0, :cond_16

    .line 360
    .line 361
    goto :goto_10

    .line 362
    :cond_16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 363
    .line 364
    :goto_10
    if-ne p0, v0, :cond_17

    .line 365
    .line 366
    goto :goto_11

    .line 367
    :cond_17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 368
    .line 369
    :goto_11
    if-ne p0, v0, :cond_18

    .line 370
    .line 371
    move-object v7, v0

    .line 372
    goto :goto_13

    .line 373
    :cond_18
    :goto_12
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    :goto_13
    return-object v7

    .line 376
    nop

    .line 377
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
