.class public final La/ptq0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/xtq0;


# direct methods
.method public synthetic constructor <init>(La/xtq0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ptq0;->i:B

    iput-object p1, p0, La/ptq0;->k:La/xtq0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/ptq0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ptq0;->k:La/xtq0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ptq0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ptq0;-><init>(La/xtq0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/ptq0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/ptq0;-><init>(La/xtq0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ptq0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ptq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ptq0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ptq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ptq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ptq0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ptq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/ptq0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/ptq0;->k:La/xtq0;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x2

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v3, La/xtq0;->r:La/tf3;

    .line 15
    .line 16
    iget-object v7, v3, La/xtq0;->y:La/i1w0;

    .line 17
    .line 18
    sget-object v8, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-byte v9, p0, La/ptq0;->j:B

    .line 21
    .line 22
    if-eqz v9, :cond_2

    .line 23
    .line 24
    if-eq v9, v4, :cond_1

    .line 25
    .line 26
    if-ne v9, v6, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_7

    .line 36
    .line 37
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v3, La/xtq0;->f:La/iqt;

    .line 45
    .line 46
    iget-object p1, p1, La/iqt;->a:La/gst0;

    .line 47
    .line 48
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_6

    .line 53
    .line 54
    iget-object p1, v3, La/xtq0;->h:La/rou;

    .line 55
    .line 56
    iput-byte v4, p0, La/ptq0;->j:B

    .line 57
    .line 58
    invoke-virtual {p1, v5, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v8, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    :goto_0
    check-cast p1, La/m2c0;

    .line 66
    .line 67
    iget-boolean p1, p1, La/m2c0;->n0:Z

    .line 68
    .line 69
    if-eqz p1, :cond_6

    .line 70
    .line 71
    iget-object p1, v3, La/xtq0;->g:La/gxu;

    .line 72
    .line 73
    iput-byte v6, p0, La/ptq0;->j:B

    .line 74
    .line 75
    invoke-virtual {p1, p0}, La/gxu;->n(La/yje;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-ne p1, v8, :cond_4

    .line 80
    .line 81
    :goto_1
    move-object v1, v8

    .line 82
    goto/16 :goto_7

    .line 83
    .line 84
    :cond_4
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_6

    .line 91
    .line 92
    invoke-static {v7}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast v0, La/uf3;

    .line 97
    .line 98
    invoke-virtual {v0}, La/uf3;->c()Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$authenticatorScreen$1;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    instance-of v0, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 103
    .line 104
    if-eqz v0, :cond_5

    .line 105
    .line 106
    new-instance v0, La/e1w0;

    .line 107
    .line 108
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 109
    .line 110
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 111
    .line 112
    .line 113
    new-instance p1, La/c8d;

    .line 114
    .line 115
    sget-object v1, La/y7d;->a:La/v7d;

    .line 116
    .line 117
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    new-instance v0, La/w0w0;

    .line 125
    .line 126
    invoke-direct {v0, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 127
    .line 128
    .line 129
    new-instance p1, La/c8d;

    .line 130
    .line 131
    sget-object v1, La/y7d;->a:La/v7d;

    .line 132
    .line 133
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :goto_3
    invoke-static {v7, p0, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    :goto_4
    move-object p1, p0

    .line 144
    check-cast p1, La/paw;

    .line 145
    .line 146
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_8

    .line 151
    .line 152
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    check-cast p1, La/oe50;

    .line 157
    .line 158
    invoke-virtual {v7, p1}, La/i1w0;->a(La/oe50;)V

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_6
    invoke-static {v7}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    check-cast v0, La/uf3;

    .line 167
    .line 168
    invoke-virtual {v0}, La/uf3;->b()Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    instance-of v0, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 173
    .line 174
    if-eqz v0, :cond_7

    .line 175
    .line 176
    new-instance v0, La/e1w0;

    .line 177
    .line 178
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 179
    .line 180
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 181
    .line 182
    .line 183
    new-instance p1, La/c8d;

    .line 184
    .line 185
    sget-object v1, La/y7d;->a:La/v7d;

    .line 186
    .line 187
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_7
    new-instance v0, La/w0w0;

    .line 195
    .line 196
    invoke-direct {v0, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 197
    .line 198
    .line 199
    new-instance p1, La/c8d;

    .line 200
    .line 201
    sget-object v1, La/y7d;->a:La/v7d;

    .line 202
    .line 203
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    :goto_5
    invoke-static {v7, p0, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    :goto_6
    move-object p1, p0

    .line 214
    check-cast p1, La/paw;

    .line 215
    .line 216
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_8

    .line 221
    .line 222
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    check-cast p1, La/oe50;

    .line 227
    .line 228
    invoke-virtual {v7, p1}, La/i1w0;->a(La/oe50;)V

    .line 229
    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_8
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    :goto_7
    return-object v1

    .line 235
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 236
    .line 237
    iget-byte v7, p0, La/ptq0;->j:B

    .line 238
    .line 239
    const/4 v8, 0x3

    .line 240
    if-eqz v7, :cond_c

    .line 241
    .line 242
    if-eq v7, v4, :cond_b

    .line 243
    .line 244
    if-eq v7, v6, :cond_a

    .line 245
    .line 246
    if-ne v7, v8, :cond_9

    .line 247
    .line 248
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    goto :goto_b

    .line 252
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    goto :goto_c

    .line 256
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    goto :goto_9

    .line 260
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    goto :goto_8

    .line 264
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    iput-byte v4, p0, La/ptq0;->j:B

    .line 268
    .line 269
    invoke-virtual {v3, p0}, La/xtq0;->w(La/zje;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    if-ne p1, v0, :cond_d

    .line 274
    .line 275
    goto :goto_a

    .line 276
    :cond_d
    :goto_8
    iget-object p1, v3, La/xtq0;->b:La/nlu;

    .line 277
    .line 278
    iput-byte v6, p0, La/ptq0;->j:B

    .line 279
    .line 280
    invoke-virtual {p1, v5, p0}, La/nlu;->d(ZLa/zje;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    if-ne p1, v0, :cond_e

    .line 285
    .line 286
    goto :goto_a

    .line 287
    :cond_e
    :goto_9
    check-cast p1, La/gmq;

    .line 288
    .line 289
    new-instance v1, La/mmq0;

    .line 290
    .line 291
    const/16 v2, 0x9

    .line 292
    .line 293
    invoke-direct {v1, v3, v2}, La/mmq0;-><init>(Ljava/lang/Object;B)V

    .line 294
    .line 295
    .line 296
    iput-byte v8, p0, La/ptq0;->j:B

    .line 297
    .line 298
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    if-ne p0, v0, :cond_f

    .line 303
    .line 304
    :goto_a
    move-object v1, v0

    .line 305
    goto :goto_c

    .line 306
    :cond_f
    :goto_b
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 307
    .line 308
    :goto_c
    return-object v1

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
