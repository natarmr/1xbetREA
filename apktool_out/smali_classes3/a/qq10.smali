.class public final La/qq10;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/vq10;


# direct methods
.method public synthetic constructor <init>(La/vq10;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qq10;->i:B

    iput-object p1, p0, La/qq10;->k:La/vq10;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qq10;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qq10;->k:La/vq10;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/qq10;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/qq10;-><init>(La/vq10;La/yje;B)V

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
    iput-boolean p0, v0, La/qq10;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/qq10;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/qq10;-><init>(La/vq10;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/qq10;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/qq10;-><init>(La/vq10;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/qq10;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/qq10;-><init>(La/vq10;La/yje;B)V

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
    iget-byte v0, p0, La/qq10;->i:B

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
    invoke-virtual {p0, p1, p2}, La/qq10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/qq10;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/qq10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/qq10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/qq10;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/qq10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/qq10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/qq10;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/qq10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/qq10;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/qq10;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/qq10;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/qq10;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/qq10;->k:La/vq10;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v4, La/vq10;->v:La/p7m0;

    .line 14
    .line 15
    iget-boolean p0, p0, La/qq10;->j:Z

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    instance-of p1, p1, La/jq10;

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    move-object p1, p0

    .line 37
    check-cast p1, La/kq10;

    .line 38
    .line 39
    new-instance p1, La/hq10;

    .line 40
    .line 41
    iget-object v6, v4, La/vq10;->h:La/g2v;

    .line 42
    .line 43
    sget-object v7, La/pb10;->g:La/pb10;

    .line 44
    .line 45
    new-instance v12, La/bq10;

    .line 46
    .line 47
    invoke-direct {v12, v4, v5}, La/bq10;-><init>(La/vq10;B)V

    .line 48
    .line 49
    .line 50
    const/16 v13, 0x5e

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x0

    .line 54
    const v10, 0x7f130677

    .line 55
    .line 56
    .line 57
    const v11, 0x7f131690

    .line 58
    .line 59
    .line 60
    invoke-static/range {v6 .. v13}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-direct {p1, v1}, La/hq10;-><init>(La/jkm;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_0

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    if-nez p0, :cond_6

    .line 75
    .line 76
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    instance-of p0, p0, La/jq10;

    .line 81
    .line 82
    if-eqz p0, :cond_6

    .line 83
    .line 84
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    move-object p1, p0

    .line 89
    check-cast p1, La/kq10;

    .line 90
    .line 91
    instance-of v1, p1, La/jq10;

    .line 92
    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    check-cast p1, La/jq10;

    .line 96
    .line 97
    iget-object p1, p1, La/jq10;->a:Ljava/util/List;

    .line 98
    .line 99
    new-instance v1, Ljava/util/ArrayList;

    .line 100
    .line 101
    const/16 v2, 0xa

    .line 102
    .line 103
    invoke-static {p1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_4

    .line 119
    .line 120
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, La/p6t0;

    .line 125
    .line 126
    instance-of v3, v2, La/cr10;

    .line 127
    .line 128
    if-eqz v3, :cond_3

    .line 129
    .line 130
    check-cast v2, La/cr10;

    .line 131
    .line 132
    const/16 v3, 0x3b

    .line 133
    .line 134
    invoke-static {v2, v5, v3}, La/cr10;->c(La/cr10;ZI)La/cr10;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    :cond_3
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_4
    new-instance p1, La/jq10;

    .line 143
    .line 144
    invoke-direct {p1, v1, v5, v5}, La/jq10;-><init>(Ljava/util/List;ZZ)V

    .line 145
    .line 146
    .line 147
    :cond_5
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-eqz p0, :cond_2

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_6
    invoke-virtual {v4, v5}, La/vq10;->x(Z)V

    .line 155
    .line 156
    .line 157
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 161
    .line 162
    iget-boolean v6, p0, La/qq10;->j:Z

    .line 163
    .line 164
    if-eqz v6, :cond_8

    .line 165
    .line 166
    if-ne v6, v3, :cond_7

    .line 167
    .line 168
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    iput-boolean v3, p0, La/qq10;->j:Z

    .line 180
    .line 181
    invoke-virtual {v4, v5, p0}, La/vq10;->w(ZLa/zje;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    if-ne p0, v0, :cond_9

    .line 186
    .line 187
    move-object v1, v0

    .line 188
    goto :goto_3

    .line 189
    :cond_9
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    :goto_3
    return-object v1

    .line 192
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 193
    .line 194
    iget-boolean v5, p0, La/qq10;->j:Z

    .line 195
    .line 196
    if-eqz v5, :cond_b

    .line 197
    .line 198
    if-ne v5, v3, :cond_a

    .line 199
    .line 200
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    iget-object p1, v4, La/vq10;->w:La/qoj0;

    .line 212
    .line 213
    iput-boolean v3, p0, La/qq10;->j:Z

    .line 214
    .line 215
    sget-object v1, La/dq10;->a:La/dq10;

    .line 216
    .line 217
    invoke-virtual {p1, v1, p0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    if-ne p0, v0, :cond_c

    .line 222
    .line 223
    move-object v1, v0

    .line 224
    goto :goto_5

    .line 225
    :cond_c
    :goto_4
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    :goto_5
    return-object v1

    .line 228
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 229
    .line 230
    iget-boolean v6, p0, La/qq10;->j:Z

    .line 231
    .line 232
    if-eqz v6, :cond_e

    .line 233
    .line 234
    if-ne v6, v3, :cond_d

    .line 235
    .line 236
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_d
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_e
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    iget-object p1, v4, La/vq10;->p:La/rou;

    .line 248
    .line 249
    iput-boolean v3, p0, La/qq10;->j:Z

    .line 250
    .line 251
    invoke-virtual {p1, v5, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    if-ne p1, v0, :cond_f

    .line 256
    .line 257
    move-object v1, v0

    .line 258
    goto :goto_7

    .line 259
    :cond_f
    :goto_6
    check-cast p1, La/m2c0;

    .line 260
    .line 261
    iget-object p0, p1, La/m2c0;->Z:Ljava/lang/String;

    .line 262
    .line 263
    iget-object p1, v4, La/vq10;->q:La/i1w0;

    .line 264
    .line 265
    new-instance v0, La/u400;

    .line 266
    .line 267
    const/16 v1, 0x14

    .line 268
    .line 269
    invoke-direct {v0, v4, p0, v1}, La/u400;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 273
    .line 274
    .line 275
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    :goto_7
    return-object v1

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
