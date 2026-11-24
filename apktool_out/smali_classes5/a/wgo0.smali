.class public final La/wgo0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/fho0;


# direct methods
.method public synthetic constructor <init>(La/fho0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wgo0;->i:B

    iput-object p1, p0, La/wgo0;->k:La/fho0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/wgo0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wgo0;->k:La/fho0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/wgo0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/wgo0;-><init>(La/fho0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/wgo0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/wgo0;-><init>(La/fho0;La/yje;B)V

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
    iget-byte v0, p0, La/wgo0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/wgo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wgo0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wgo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/wgo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/wgo0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/wgo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget-byte v0, p0, La/wgo0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/wgo0;->k:La/fho0;

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
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-byte v7, p0, La/wgo0;->j:B

    .line 17
    .line 18
    if-eqz v7, :cond_2

    .line 19
    .line 20
    if-eq v7, v4, :cond_1

    .line 21
    .line 22
    if-ne v7, v6, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_7

    .line 32
    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, v3, La/fho0;->f:La/iqt;

    .line 41
    .line 42
    iget-object p1, p1, La/iqt;->a:La/gst0;

    .line 43
    .line 44
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_6

    .line 49
    .line 50
    iget-object p1, v3, La/fho0;->h:La/rou;

    .line 51
    .line 52
    iput-byte v4, p0, La/wgo0;->j:B

    .line 53
    .line 54
    invoke-virtual {p1, v5, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v0, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    :goto_0
    check-cast p1, La/m2c0;

    .line 62
    .line 63
    iget-boolean p1, p1, La/m2c0;->n0:Z

    .line 64
    .line 65
    if-eqz p1, :cond_6

    .line 66
    .line 67
    iget-object p1, v3, La/fho0;->g:La/gxu;

    .line 68
    .line 69
    iput-byte v6, p0, La/wgo0;->j:B

    .line 70
    .line 71
    invoke-virtual {p1, p0}, La/gxu;->n(La/yje;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v0, :cond_4

    .line 76
    .line 77
    :goto_1
    move-object v1, v0

    .line 78
    goto/16 :goto_7

    .line 79
    .line 80
    :cond_4
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_6

    .line 87
    .line 88
    iget-object p0, v3, La/fho0;->y:La/i1w0;

    .line 89
    .line 90
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget-object v0, v3, La/fho0;->r:La/tf3;

    .line 95
    .line 96
    check-cast v0, La/uf3;

    .line 97
    .line 98
    invoke-virtual {v0}, La/uf3;->c()Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$authenticatorScreen$1;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    instance-of v1, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 103
    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    new-instance v1, La/e1w0;

    .line 107
    .line 108
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 109
    .line 110
    invoke-direct {v1, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 111
    .line 112
    .line 113
    new-instance v0, La/c8d;

    .line 114
    .line 115
    sget-object v2, La/y7d;->a:La/v7d;

    .line 116
    .line 117
    invoke-direct {v0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    new-instance v1, La/w0w0;

    .line 125
    .line 126
    invoke-direct {v1, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 127
    .line 128
    .line 129
    new-instance v0, La/c8d;

    .line 130
    .line 131
    sget-object v2, La/y7d;->a:La/v7d;

    .line 132
    .line 133
    invoke-direct {v0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :goto_3
    invoke-static {p0, p1, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    :goto_4
    move-object v0, p1

    .line 144
    check-cast v0, La/paw;

    .line 145
    .line 146
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_8

    .line 151
    .line 152
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, La/oe50;

    .line 157
    .line 158
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_6
    iget-object p0, v3, La/fho0;->y:La/i1w0;

    .line 163
    .line 164
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iget-object v0, v3, La/fho0;->r:La/tf3;

    .line 169
    .line 170
    check-cast v0, La/uf3;

    .line 171
    .line 172
    invoke-virtual {v0}, La/uf3;->b()Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    instance-of v1, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 177
    .line 178
    if-eqz v1, :cond_7

    .line 179
    .line 180
    new-instance v1, La/e1w0;

    .line 181
    .line 182
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 183
    .line 184
    invoke-direct {v1, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 185
    .line 186
    .line 187
    new-instance v0, La/c8d;

    .line 188
    .line 189
    sget-object v2, La/y7d;->a:La/v7d;

    .line 190
    .line 191
    invoke-direct {v0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_7
    new-instance v1, La/w0w0;

    .line 199
    .line 200
    invoke-direct {v1, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 201
    .line 202
    .line 203
    new-instance v0, La/c8d;

    .line 204
    .line 205
    sget-object v2, La/y7d;->a:La/v7d;

    .line 206
    .line 207
    invoke-direct {v0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    :goto_5
    invoke-static {p0, p1, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    :goto_6
    move-object v0, p1

    .line 218
    check-cast v0, La/paw;

    .line 219
    .line 220
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-eqz v1, :cond_8

    .line 225
    .line 226
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    check-cast v0, La/oe50;

    .line 231
    .line 232
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 233
    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_8
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    :goto_7
    return-object v1

    .line 239
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 240
    .line 241
    iget-byte v7, p0, La/wgo0;->j:B

    .line 242
    .line 243
    const/4 v8, 0x3

    .line 244
    if-eqz v7, :cond_c

    .line 245
    .line 246
    if-eq v7, v4, :cond_b

    .line 247
    .line 248
    if-eq v7, v6, :cond_a

    .line 249
    .line 250
    if-ne v7, v8, :cond_9

    .line 251
    .line 252
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    goto :goto_b

    .line 256
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    goto :goto_c

    .line 260
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    goto :goto_9

    .line 264
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    goto :goto_8

    .line 268
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    iput-byte v4, p0, La/wgo0;->j:B

    .line 272
    .line 273
    invoke-virtual {v3, p0}, La/fho0;->w(La/zje;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    if-ne p1, v0, :cond_d

    .line 278
    .line 279
    goto :goto_a

    .line 280
    :cond_d
    :goto_8
    iget-object p1, v3, La/fho0;->b:La/nlu;

    .line 281
    .line 282
    iput-byte v6, p0, La/wgo0;->j:B

    .line 283
    .line 284
    invoke-virtual {p1, v5, p0}, La/nlu;->d(ZLa/zje;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    if-ne p1, v0, :cond_e

    .line 289
    .line 290
    goto :goto_a

    .line 291
    :cond_e
    :goto_9
    check-cast p1, La/gmq;

    .line 292
    .line 293
    new-instance v1, La/lpn0;

    .line 294
    .line 295
    const/16 v2, 0x10

    .line 296
    .line 297
    invoke-direct {v1, v3, v2}, La/lpn0;-><init>(Ljava/lang/Object;B)V

    .line 298
    .line 299
    .line 300
    iput-byte v8, p0, La/wgo0;->j:B

    .line 301
    .line 302
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    if-ne p0, v0, :cond_f

    .line 307
    .line 308
    :goto_a
    move-object v1, v0

    .line 309
    goto :goto_c

    .line 310
    :cond_f
    :goto_b
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    :goto_c
    return-object v1

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
