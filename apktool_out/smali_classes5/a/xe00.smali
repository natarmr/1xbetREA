.class public final La/xe00;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/ef00;


# direct methods
.method public synthetic constructor <init>(La/ef00;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xe00;->i:B

    iput-object p1, p0, La/xe00;->k:La/ef00;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/xe00;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/xe00;->k:La/ef00;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/xe00;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/xe00;-><init>(La/ef00;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/xe00;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/xe00;-><init>(La/ef00;La/yje;B)V

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
    iget-byte v0, p0, La/xe00;->i:B

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
    invoke-virtual {p0, p1, p2}, La/xe00;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xe00;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xe00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/xe00;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/xe00;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/xe00;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/xe00;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/xe00;->k:La/ef00;

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
    iget-object v0, v3, La/ef00;->I:La/uf3;

    .line 15
    .line 16
    iget-object v7, v3, La/ef00;->Q:La/i1w0;

    .line 17
    .line 18
    sget-object v8, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-byte v9, p0, La/xe00;->j:B

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
    iget-object p1, v3, La/ef00;->j:La/iqt;

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
    iget-object p1, v3, La/ef00;->k:La/rou;

    .line 55
    .line 56
    iput-byte v4, p0, La/xe00;->j:B

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
    iget-object p1, v3, La/ef00;->l:La/gxu;

    .line 72
    .line 73
    iput-byte v6, p0, La/xe00;->j:B

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
    invoke-virtual {v0}, La/uf3;->c()Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$authenticatorScreen$1;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    instance-of v0, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    new-instance v0, La/e1w0;

    .line 105
    .line 106
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 107
    .line 108
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 109
    .line 110
    .line 111
    new-instance p1, La/c8d;

    .line 112
    .line 113
    sget-object v1, La/y7d;->a:La/v7d;

    .line 114
    .line 115
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    new-instance v0, La/w0w0;

    .line 123
    .line 124
    invoke-direct {v0, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 125
    .line 126
    .line 127
    new-instance p1, La/c8d;

    .line 128
    .line 129
    sget-object v1, La/y7d;->a:La/v7d;

    .line 130
    .line 131
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    :goto_3
    invoke-static {v7, p0, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    :goto_4
    move-object p1, p0

    .line 142
    check-cast p1, La/paw;

    .line 143
    .line 144
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-eqz v0, :cond_8

    .line 149
    .line 150
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    check-cast p1, La/oe50;

    .line 155
    .line 156
    invoke-virtual {v7, p1}, La/i1w0;->a(La/oe50;)V

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_6
    invoke-static {v7}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {v0}, La/uf3;->b()Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    instance-of v0, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 169
    .line 170
    if-eqz v0, :cond_7

    .line 171
    .line 172
    new-instance v0, La/e1w0;

    .line 173
    .line 174
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 175
    .line 176
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 177
    .line 178
    .line 179
    new-instance p1, La/c8d;

    .line 180
    .line 181
    sget-object v1, La/y7d;->a:La/v7d;

    .line 182
    .line 183
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_7
    new-instance v0, La/w0w0;

    .line 191
    .line 192
    invoke-direct {v0, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 193
    .line 194
    .line 195
    new-instance p1, La/c8d;

    .line 196
    .line 197
    sget-object v1, La/y7d;->a:La/v7d;

    .line 198
    .line 199
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    :goto_5
    invoke-static {v7, p0, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    :goto_6
    move-object p1, p0

    .line 210
    check-cast p1, La/paw;

    .line 211
    .line 212
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_8

    .line 217
    .line 218
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    check-cast p1, La/oe50;

    .line 223
    .line 224
    invoke-virtual {v7, p1}, La/i1w0;->a(La/oe50;)V

    .line 225
    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_8
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    :goto_7
    return-object v1

    .line 231
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 232
    .line 233
    iget-byte v7, p0, La/xe00;->j:B

    .line 234
    .line 235
    const/4 v8, 0x3

    .line 236
    if-eqz v7, :cond_c

    .line 237
    .line 238
    if-eq v7, v4, :cond_b

    .line 239
    .line 240
    if-eq v7, v6, :cond_a

    .line 241
    .line 242
    if-ne v7, v8, :cond_9

    .line 243
    .line 244
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    goto :goto_b

    .line 248
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    goto :goto_c

    .line 252
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    goto :goto_9

    .line 256
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    iput-byte v4, p0, La/xe00;->j:B

    .line 264
    .line 265
    invoke-virtual {v3, p0}, La/ef00;->w(La/zje;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    if-ne p1, v0, :cond_d

    .line 270
    .line 271
    goto :goto_a

    .line 272
    :cond_d
    :goto_8
    iget-object p1, v3, La/ef00;->b:La/nlu;

    .line 273
    .line 274
    iput-byte v6, p0, La/xe00;->j:B

    .line 275
    .line 276
    invoke-virtual {p1, v5, p0}, La/nlu;->d(ZLa/zje;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    if-ne p1, v0, :cond_e

    .line 281
    .line 282
    goto :goto_a

    .line 283
    :cond_e
    :goto_9
    check-cast p1, La/gmq;

    .line 284
    .line 285
    new-instance v1, La/poz;

    .line 286
    .line 287
    const/16 v2, 0x10

    .line 288
    .line 289
    invoke-direct {v1, v3, v2}, La/poz;-><init>(Ljava/lang/Object;B)V

    .line 290
    .line 291
    .line 292
    iput-byte v8, p0, La/xe00;->j:B

    .line 293
    .line 294
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    if-ne p0, v0, :cond_f

    .line 299
    .line 300
    :goto_a
    move-object v1, v0

    .line 301
    goto :goto_c

    .line 302
    :cond_f
    :goto_b
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    :goto_c
    return-object v1

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
