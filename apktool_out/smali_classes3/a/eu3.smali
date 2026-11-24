.class public final La/eu3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/zu3;


# direct methods
.method public synthetic constructor <init>(La/zu3;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/eu3;->i:B

    iput-object p1, p0, La/eu3;->l:La/zu3;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/eu3;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/eu3;->l:La/zu3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/eu3;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/eu3;-><init>(La/zu3;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/eu3;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/eu3;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/eu3;-><init>(La/zu3;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/eu3;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/eu3;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vu00;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/eu3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/eu3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/eu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kmq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/eu3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/eu3;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/eu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/eu3;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/eu3;->l:La/zu3;

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
    iget-object v0, p0, La/eu3;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/vu00;

    .line 15
    .line 16
    sget-object v5, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v6, p0, La/eu3;->j:Z

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
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object v4, p0, La/eu3;->k:Ljava/lang/Object;

    .line 38
    .line 39
    iput-boolean v3, p0, La/eu3;->j:Z

    .line 40
    .line 41
    sget p1, La/zu3;->s0:I

    .line 42
    .line 43
    iget-object p1, v1, La/zu3;->h0:La/ol60;

    .line 44
    .line 45
    if-eqz v0, :cond_e

    .line 46
    .line 47
    instance-of v2, v0, La/mu00;

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    check-cast v0, La/mu00;

    .line 52
    .line 53
    iget-boolean p1, v0, La/mu00;->a:Z

    .line 54
    .line 55
    iget-boolean v0, v0, La/mu00;->b:Z

    .line 56
    .line 57
    invoke-virtual {v1, p1, v0, p0}, La/zu3;->x(ZZLa/zje;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-ne p0, v5, :cond_2

    .line 62
    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    goto/16 :goto_1

    .line 68
    .line 69
    :cond_3
    instance-of p0, v0, La/tu00;

    .line 70
    .line 71
    if-eqz p0, :cond_4

    .line 72
    .line 73
    new-instance p0, La/pt3;

    .line 74
    .line 75
    check-cast v0, La/tu00;

    .line 76
    .line 77
    iget-object v0, v0, La/tu00;->a:Ljava/lang/String;

    .line 78
    .line 79
    invoke-direct {p0, v0}, La/pt3;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :cond_4
    instance-of p0, v0, La/su00;

    .line 88
    .line 89
    if-eqz p0, :cond_5

    .line 90
    .line 91
    iget-object p0, v1, La/zu3;->j0:La/n0o0;

    .line 92
    .line 93
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, La/sff0;

    .line 98
    .line 99
    iget-boolean p0, p0, La/sff0;->f0:Z

    .line 100
    .line 101
    if-eqz p0, :cond_c

    .line 102
    .line 103
    sget-object p0, La/rt3;->a:La/rt3;

    .line 104
    .line 105
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    instance-of p0, v0, La/nu00;

    .line 110
    .line 111
    if-eqz p0, :cond_7

    .line 112
    .line 113
    iget-object p0, v1, La/zu3;->i0:La/n0o0;

    .line 114
    .line 115
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, La/v8d;

    .line 120
    .line 121
    iget-object p0, p0, La/v8d;->p:La/lxw;

    .line 122
    .line 123
    sget-object v1, La/lxw;->b:La/lxw;

    .line 124
    .line 125
    if-ne p0, v1, :cond_6

    .line 126
    .line 127
    new-instance p0, La/mt3;

    .line 128
    .line 129
    check-cast v0, La/nu00;

    .line 130
    .line 131
    iget-object v0, v0, La/nu00;->a:Ljava/lang/String;

    .line 132
    .line 133
    invoke-direct {p0, v0}, La/mt3;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_6
    sget-object p0, La/qt3;->a:La/qt3;

    .line 141
    .line 142
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_7
    instance-of p0, v0, La/ou00;

    .line 147
    .line 148
    if-eqz p0, :cond_8

    .line 149
    .line 150
    sget-object p0, La/gt3;->a:La/gt3;

    .line 151
    .line 152
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_8
    instance-of p0, v0, La/pu00;

    .line 157
    .line 158
    if-eqz p0, :cond_9

    .line 159
    .line 160
    sget-object p0, La/ht3;->a:La/ht3;

    .line 161
    .line 162
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_9
    instance-of p0, v0, La/uu00;

    .line 167
    .line 168
    if-eqz p0, :cond_a

    .line 169
    .line 170
    new-instance p0, La/jt3;

    .line 171
    .line 172
    check-cast v0, La/uu00;

    .line 173
    .line 174
    iget-object v0, v0, La/uu00;->a:Ljava/lang/String;

    .line 175
    .line 176
    invoke-direct {p0, v0}, La/jt3;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_0

    .line 183
    :cond_a
    instance-of p0, v0, La/ru00;

    .line 184
    .line 185
    if-eqz p0, :cond_b

    .line 186
    .line 187
    sget-object p0, La/ut3;->a:La/ut3;

    .line 188
    .line 189
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto :goto_0

    .line 193
    :cond_b
    instance-of p0, v0, La/qu00;

    .line 194
    .line 195
    if-eqz p0, :cond_e

    .line 196
    .line 197
    sget-object p0, La/tt3;->a:La/tt3;

    .line 198
    .line 199
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :cond_c
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    :goto_1
    if-ne p0, v5, :cond_d

    .line 205
    .line 206
    move-object v4, v5

    .line 207
    goto :goto_3

    .line 208
    :cond_d
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 212
    .line 213
    .line 214
    :goto_3
    return-object v4

    .line 215
    :pswitch_0
    iget-object v0, p0, La/eu3;->k:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, La/kmq;

    .line 218
    .line 219
    sget-object v5, La/wne;->a:La/wne;

    .line 220
    .line 221
    iget-boolean v6, p0, La/eu3;->j:Z

    .line 222
    .line 223
    if-eqz v6, :cond_10

    .line 224
    .line 225
    if-ne v6, v3, :cond_f

    .line 226
    .line 227
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_f
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    iget-object p1, v1, La/zu3;->W:La/z7z;

    .line 239
    .line 240
    invoke-interface {p1}, La/z7z;->get()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    check-cast p1, La/upx;

    .line 245
    .line 246
    iget-object p1, p1, La/upx;->a:La/hru;

    .line 247
    .line 248
    iget-object p1, p1, La/hru;->a:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast p1, La/umx;

    .line 251
    .line 252
    iget-object p1, p1, La/umx;->a:La/n0o0;

    .line 253
    .line 254
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    check-cast p1, Ljava/lang/Boolean;

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    if-eqz p1, :cond_11

    .line 265
    .line 266
    iget-object p1, v1, La/zu3;->j:La/z7z;

    .line 267
    .line 268
    invoke-interface {p1}, La/z7z;->get()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    check-cast p1, La/sqx;

    .line 273
    .line 274
    invoke-virtual {p1}, La/sqx;->a()V

    .line 275
    .line 276
    .line 277
    :cond_11
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 278
    .line 279
    iput-object v4, p0, La/eu3;->k:Ljava/lang/Object;

    .line 280
    .line 281
    iput-boolean v3, p0, La/eu3;->j:Z

    .line 282
    .line 283
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    if-ne p0, v5, :cond_12

    .line 288
    .line 289
    move-object v4, v5

    .line 290
    goto :goto_5

    .line 291
    :cond_12
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 292
    .line 293
    :goto_5
    return-object v4

    .line 294
    nop

    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
