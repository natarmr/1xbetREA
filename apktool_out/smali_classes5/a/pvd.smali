.class public final La/pvd;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/svd;


# direct methods
.method public synthetic constructor <init>(La/svd;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pvd;->i:B

    iput-object p1, p0, La/pvd;->k:La/svd;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/pvd;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/pvd;->k:La/svd;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/pvd;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/pvd;-><init>(La/svd;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/pvd;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/pvd;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/pvd;-><init>(La/svd;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/pvd;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/pvd;-><init>(La/svd;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/pvd;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/pvd;-><init>(La/svd;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

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
    iget-byte v0, p0, La/pvd;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/pvd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/pvd;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/pvd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/pvd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/pvd;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/pvd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/pvd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/pvd;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/pvd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, La/vne;

    .line 61
    .line 62
    check-cast p2, La/yje;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, La/pvd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/pvd;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/pvd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
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
    iget-byte v0, p0, La/pvd;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/pvd;->k:La/svd;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-boolean v10, p0, La/pvd;->j:Z

    .line 14
    .line 15
    sget-object p0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-boolean v10, v4, La/svd;->F:Z

    .line 21
    .line 22
    iget-object v0, v4, La/svd;->A:La/p7m0;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    move-object v6, p0

    .line 29
    check-cast v6, La/fvd;

    .line 30
    .line 31
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, La/fvd;

    .line 36
    .line 37
    iget-object p1, p1, La/fvd;->h:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    if-eqz v10, :cond_1

    .line 46
    .line 47
    move v9, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v9, v1

    .line 50
    :goto_0
    const/4 v12, 0x0

    .line 51
    const/16 v13, 0xf3

    .line 52
    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v11, 0x0

    .line 56
    invoke-static/range {v6 .. v13}, La/fvd;->a(La/fvd;ZZZZZLjava/lang/String;I)La/fvd;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_0

    .line 65
    .line 66
    iget-boolean p0, v4, La/svd;->H:Z

    .line 67
    .line 68
    if-nez p0, :cond_2

    .line 69
    .line 70
    if-eqz v10, :cond_2

    .line 71
    .line 72
    iget-object p0, v4, La/svd;->C:La/bby;

    .line 73
    .line 74
    if-eqz p0, :cond_2

    .line 75
    .line 76
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-nez p0, :cond_2

    .line 81
    .line 82
    invoke-virtual {v4}, La/svd;->D()V

    .line 83
    .line 84
    .line 85
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 89
    .line 90
    iget-boolean v6, p0, La/pvd;->j:Z

    .line 91
    .line 92
    if-eqz v6, :cond_4

    .line 93
    .line 94
    if-ne v6, v3, :cond_3

    .line 95
    .line 96
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iput-boolean v1, v4, La/svd;->H:Z

    .line 108
    .line 109
    iget-object p1, v4, La/svd;->t:La/qgd;

    .line 110
    .line 111
    sget-object v1, La/ckk0;->g:La/ckk0;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v2, La/zm70;

    .line 117
    .line 118
    const/16 v6, 0x8

    .line 119
    .line 120
    invoke-direct {v2, p1, v1, v5, v6}, La/zm70;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 121
    .line 122
    .line 123
    new-instance p1, La/vsg0;

    .line 124
    .line 125
    invoke-direct {p1, v2}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 126
    .line 127
    .line 128
    new-instance v1, La/jtb;

    .line 129
    .line 130
    const/16 v2, 0xd

    .line 131
    .line 132
    invoke-direct {v1, v4, v5, v2}, La/jtb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 133
    .line 134
    .line 135
    iput-boolean v3, p0, La/pvd;->j:Z

    .line 136
    .line 137
    new-instance v2, La/vnq;

    .line 138
    .line 139
    const/4 v3, 0x2

    .line 140
    sget-object v4, La/h660;->a:La/h660;

    .line 141
    .line 142
    invoke-direct {v2, v4, v1, v3}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v2, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-ne p0, v0, :cond_5

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    :goto_1
    if-ne p0, v0, :cond_6

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    :goto_2
    if-ne p0, v0, :cond_7

    .line 160
    .line 161
    move-object v5, v0

    .line 162
    goto :goto_4

    .line 163
    :cond_7
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    :goto_4
    return-object v5

    .line 166
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 167
    .line 168
    iget-boolean v1, p0, La/pvd;->j:Z

    .line 169
    .line 170
    if-eqz v1, :cond_9

    .line 171
    .line 172
    if-ne v1, v3, :cond_8

    .line 173
    .line 174
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    iget-object v1, v4, La/svd;->A:La/p7m0;

    .line 186
    .line 187
    :cond_a
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    move-object v5, p1

    .line 192
    check-cast v5, La/fvd;

    .line 193
    .line 194
    const/4 v11, 0x0

    .line 195
    const/16 v12, 0xfc

    .line 196
    .line 197
    const/4 v6, 0x1

    .line 198
    const/4 v7, 0x0

    .line 199
    const/4 v8, 0x0

    .line 200
    const/4 v9, 0x0

    .line 201
    const/4 v10, 0x0

    .line 202
    invoke-static/range {v5 .. v12}, La/fvd;->a(La/fvd;ZZZZZLjava/lang/String;I)La/fvd;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v1, p1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    if-eqz p1, :cond_a

    .line 211
    .line 212
    iget-object p1, v4, La/svd;->k:La/suk;

    .line 213
    .line 214
    iput-boolean v3, p0, La/pvd;->j:Z

    .line 215
    .line 216
    invoke-virtual {p1}, La/suk;->a()Lkotlin/Unit;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    if-ne p0, v0, :cond_b

    .line 221
    .line 222
    move-object v5, v0

    .line 223
    goto :goto_6

    .line 224
    :cond_b
    :goto_5
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    :goto_6
    return-object v5

    .line 227
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 228
    .line 229
    iget-boolean v1, p0, La/pvd;->j:Z

    .line 230
    .line 231
    if-eqz v1, :cond_d

    .line 232
    .line 233
    if-ne v1, v3, :cond_c

    .line 234
    .line 235
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_c
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    goto :goto_8

    .line 243
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    iget-object p1, v4, La/svd;->j:La/hse0;

    .line 247
    .line 248
    iput-boolean v3, p0, La/pvd;->j:Z

    .line 249
    .line 250
    const/4 v1, 0x5

    .line 251
    invoke-static {p1, v5, v3, p0, v1}, La/hse0;->a(La/hse0;Ljava/lang/String;ZLa/yje;I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    if-ne p0, v0, :cond_e

    .line 256
    .line 257
    move-object v5, v0

    .line 258
    goto :goto_8

    .line 259
    :cond_e
    :goto_7
    invoke-virtual {v4}, La/svd;->D()V

    .line 260
    .line 261
    .line 262
    iget-object p0, v4, La/svd;->A:La/p7m0;

    .line 263
    .line 264
    :cond_f
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    move-object v0, p1

    .line 269
    check-cast v0, La/fvd;

    .line 270
    .line 271
    const/4 v6, 0x0

    .line 272
    const/16 v7, 0xbf

    .line 273
    .line 274
    const/4 v1, 0x0

    .line 275
    const/4 v2, 0x0

    .line 276
    const/4 v3, 0x0

    .line 277
    const/4 v4, 0x0

    .line 278
    const/4 v5, 0x0

    .line 279
    invoke-static/range {v0 .. v7}, La/fvd;->a(La/fvd;ZZZZZLjava/lang/String;I)La/fvd;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    if-eqz p1, :cond_f

    .line 288
    .line 289
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    :goto_8
    return-object v5

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
