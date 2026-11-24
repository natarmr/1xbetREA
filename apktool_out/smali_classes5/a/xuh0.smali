.class public final La/xuh0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/zuh0;


# direct methods
.method public synthetic constructor <init>(La/zuh0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xuh0;->i:B

    iput-object p1, p0, La/xuh0;->k:La/zuh0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/xuh0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/xuh0;->k:La/zuh0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/xuh0;

    .line 9
    .line 10
    const/4 v0, 0x5

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/xuh0;-><init>(La/zuh0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/xuh0;

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/xuh0;-><init>(La/zuh0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/xuh0;

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/xuh0;-><init>(La/zuh0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/xuh0;

    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/xuh0;-><init>(La/zuh0;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/xuh0;

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/xuh0;-><init>(La/zuh0;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_4
    new-instance p1, La/xuh0;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-direct {p1, p0, p2, v0}, La/xuh0;-><init>(La/zuh0;La/yje;B)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/xuh0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/xuh0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xuh0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xuh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/xuh0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/xuh0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/xuh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/xuh0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/xuh0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/xuh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/xuh0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/xuh0;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/xuh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/xuh0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/xuh0;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/xuh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, La/xuh0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/xuh0;

    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/xuh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/xuh0;->i:B

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const-string v2, "."

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    iget-object v5, p0, La/xuh0;->k:La/zuh0;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, v5, La/zuh0;->z:La/i1w0;

    .line 18
    .line 19
    sget-object v1, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-boolean v2, p0, La/xuh0;->j:Z

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    if-ne v2, v6, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, v5, La/zuh0;->i:La/rou;

    .line 40
    .line 41
    iput-boolean v6, p0, La/xuh0;->j:Z

    .line 42
    .line 43
    invoke-virtual {p1, v6, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v1, :cond_2

    .line 48
    .line 49
    move-object v7, v1

    .line 50
    goto :goto_4

    .line 51
    :cond_2
    :goto_0
    check-cast p1, La/m2c0;

    .line 52
    .line 53
    iget-boolean p0, p1, La/m2c0;->a0:Z

    .line 54
    .line 55
    if-eqz p0, :cond_3

    .line 56
    .line 57
    new-instance p0, La/gwg0;

    .line 58
    .line 59
    const/16 p1, 0x11

    .line 60
    .line 61
    invoke-direct {p0, v5, p1}, La/gwg0;-><init>(Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    iget-object p0, v5, La/zuh0;->x:La/svs0;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance p0, Lorg/xplatform/security/impl/presentation/otp_authenticator/OtpScreens$AddTwoFactoryAuthenticationScreen;

    .line 74
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 82
    .line 83
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    instance-of v1, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 87
    .line 88
    if-eqz v1, :cond_4

    .line 89
    .line 90
    new-instance v1, La/e1w0;

    .line 91
    .line 92
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 93
    .line 94
    invoke-direct {v1, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 95
    .line 96
    .line 97
    new-instance p0, La/c8d;

    .line 98
    .line 99
    sget-object v2, La/y7d;->a:La/v7d;

    .line 100
    .line 101
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    new-instance v1, La/w0w0;

    .line 109
    .line 110
    invoke-direct {v1, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 111
    .line 112
    .line 113
    new-instance p0, La/c8d;

    .line 114
    .line 115
    sget-object v2, La/y7d;->a:La/v7d;

    .line 116
    .line 117
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :goto_1
    invoke-static {v0, p1, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    :goto_2
    move-object p1, p0

    .line 128
    check-cast p1, La/paw;

    .line 129
    .line 130
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_5

    .line 135
    .line 136
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    check-cast p1, La/oe50;

    .line 141
    .line 142
    invoke-virtual {v0, p1}, La/i1w0;->a(La/oe50;)V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    :goto_3
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    :goto_4
    return-object v7

    .line 149
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 150
    .line 151
    iget-boolean v1, p0, La/xuh0;->j:Z

    .line 152
    .line 153
    if-eqz v1, :cond_7

    .line 154
    .line 155
    if-ne v1, v6, :cond_6

    .line 156
    .line 157
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iget-object p1, v5, La/zuh0;->f:La/jof0;

    .line 169
    .line 170
    iput-boolean v6, p0, La/xuh0;->j:Z

    .line 171
    .line 172
    invoke-virtual {p1, p0}, La/jof0;->a(La/zje;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    if-ne p1, v0, :cond_8

    .line 177
    .line 178
    move-object v7, v0

    .line 179
    goto :goto_6

    .line 180
    :cond_8
    :goto_5
    check-cast p1, Ljava/lang/String;

    .line 181
    .line 182
    iget-object p0, v5, La/zuh0;->E:La/ol60;

    .line 183
    .line 184
    new-instance v0, La/nuh0;

    .line 185
    .line 186
    invoke-direct {v0, p1}, La/nuh0;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    iget-object p0, v5, La/zuh0;->F:La/p7m0;

    .line 193
    .line 194
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 195
    .line 196
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, v7, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    :goto_6
    return-object v7

    .line 205
    :pswitch_1
    iget-object v0, v5, La/zuh0;->y:La/qgd;

    .line 206
    .line 207
    iget-object v8, v5, La/zuh0;->z:La/i1w0;

    .line 208
    .line 209
    sget-object v9, La/wne;->a:La/wne;

    .line 210
    .line 211
    iget-boolean v10, p0, La/xuh0;->j:Z

    .line 212
    .line 213
    if-eqz v10, :cond_a

    .line 214
    .line 215
    if-ne v10, v6, :cond_9

    .line 216
    .line 217
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    goto/16 :goto_e

    .line 225
    .line 226
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    iget-object p1, v5, La/zuh0;->i:La/rou;

    .line 230
    .line 231
    iput-boolean v6, p0, La/xuh0;->j:Z

    .line 232
    .line 233
    invoke-virtual {p1, v6, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    if-ne p1, v9, :cond_b

    .line 238
    .line 239
    move-object v7, v9

    .line 240
    goto/16 :goto_e

    .line 241
    .line 242
    :cond_b
    :goto_7
    check-cast p1, La/m2c0;

    .line 243
    .line 244
    iget-object p0, p1, La/m2c0;->Z:Ljava/lang/String;

    .line 245
    .line 246
    invoke-static {p0, v2, v1, v3}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 251
    .line 252
    .line 253
    move-result p0

    .line 254
    if-nez p0, :cond_d

    .line 255
    .line 256
    iget-object p0, v5, La/zuh0;->m:La/vd1;

    .line 257
    .line 258
    invoke-virtual {p0}, La/vd1;->b()V

    .line 259
    .line 260
    .line 261
    iget-object p0, v5, La/zuh0;->D:La/ik4;

    .line 262
    .line 263
    iget-object p0, p0, La/ik4;->a:La/s1p;

    .line 264
    .line 265
    new-instance p1, La/j1p;

    .line 266
    .line 267
    const-string v1, "acc_safety"

    .line 268
    .line 269
    invoke-direct {p1, v1, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 270
    .line 271
    .line 272
    invoke-static {p1}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    const-wide/16 v1, 0xc9f

    .line 277
    .line 278
    invoke-virtual {p0, p1, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    new-instance p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 285
    .line 286
    invoke-direct {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, La/qgd;->g()Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    instance-of v0, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 294
    .line 295
    if-eqz v0, :cond_c

    .line 296
    .line 297
    new-instance v0, La/e1w0;

    .line 298
    .line 299
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 300
    .line 301
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 302
    .line 303
    .line 304
    new-instance p1, La/c8d;

    .line 305
    .line 306
    sget-object v1, La/y7d;->a:La/v7d;

    .line 307
    .line 308
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    goto :goto_8

    .line 315
    :cond_c
    new-instance v0, La/w0w0;

    .line 316
    .line 317
    invoke-direct {v0, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 318
    .line 319
    .line 320
    new-instance p1, La/c8d;

    .line 321
    .line 322
    sget-object v1, La/y7d;->a:La/v7d;

    .line 323
    .line 324
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    :goto_8
    invoke-static {v8, p0, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    :goto_9
    move-object p1, p0

    .line 335
    check-cast p1, La/paw;

    .line 336
    .line 337
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_11

    .line 342
    .line 343
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    check-cast p1, La/oe50;

    .line 348
    .line 349
    invoke-virtual {v8, p1}, La/i1w0;->a(La/oe50;)V

    .line 350
    .line 351
    .line 352
    goto :goto_9

    .line 353
    :cond_d
    iget-object p0, p1, La/m2c0;->k:La/jqt0;

    .line 354
    .line 355
    sget-object v1, La/jqt0;->e:La/jqt0;

    .line 356
    .line 357
    if-eq p0, v1, :cond_f

    .line 358
    .line 359
    sget-object v1, La/jqt0;->d:La/jqt0;

    .line 360
    .line 361
    if-eq p0, v1, :cond_f

    .line 362
    .line 363
    iget-object p0, v5, La/zuh0;->p:La/mi70;

    .line 364
    .line 365
    new-instance v0, La/xbi0;

    .line 366
    .line 367
    iget-object p1, p1, La/m2c0;->Z:Ljava/lang/String;

    .line 368
    .line 369
    invoke-direct {v0, p1, v6, v3}, La/xbi0;-><init>(Ljava/lang/String;IZ)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    new-instance p0, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;

    .line 376
    .line 377
    invoke-direct {p0, v0}, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;-><init>(La/dci0;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 384
    .line 385
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 386
    .line 387
    .line 388
    instance-of v0, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 389
    .line 390
    if-eqz v0, :cond_e

    .line 391
    .line 392
    new-instance v0, La/e1w0;

    .line 393
    .line 394
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 395
    .line 396
    invoke-direct {v0, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 397
    .line 398
    .line 399
    new-instance p0, La/c8d;

    .line 400
    .line 401
    sget-object v1, La/y7d;->a:La/v7d;

    .line 402
    .line 403
    invoke-direct {p0, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    goto :goto_a

    .line 410
    :cond_e
    new-instance v0, La/w0w0;

    .line 411
    .line 412
    invoke-direct {v0, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 413
    .line 414
    .line 415
    new-instance p0, La/c8d;

    .line 416
    .line 417
    sget-object v1, La/y7d;->a:La/v7d;

    .line 418
    .line 419
    invoke-direct {p0, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    :goto_a
    invoke-static {v8, p1, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    :goto_b
    move-object p1, p0

    .line 430
    check-cast p1, La/paw;

    .line 431
    .line 432
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    if-eqz v0, :cond_11

    .line 437
    .line 438
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    check-cast p1, La/oe50;

    .line 443
    .line 444
    invoke-virtual {v8, p1}, La/i1w0;->a(La/oe50;)V

    .line 445
    .line 446
    .line 447
    goto :goto_b

    .line 448
    :cond_f
    iget-object p0, p1, La/m2c0;->c:Ljava/lang/String;

    .line 449
    .line 450
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 451
    .line 452
    .line 453
    move-result p0

    .line 454
    if-lez p0, :cond_11

    .line 455
    .line 456
    iget-object p0, v5, La/zuh0;->g:La/bzt;

    .line 457
    .line 458
    iget-object p0, p0, La/bzt;->a:La/fsd;

    .line 459
    .line 460
    invoke-virtual {p0}, La/fsd;->a()La/v8d;

    .line 461
    .line 462
    .line 463
    move-result-object p0

    .line 464
    iget-boolean p0, p0, La/v8d;->g:Z

    .line 465
    .line 466
    if-eqz p0, :cond_11

    .line 467
    .line 468
    invoke-static {v8}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 469
    .line 470
    .line 471
    move-result-object p0

    .line 472
    invoke-virtual {v0}, La/qgd;->p()Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;

    .line 473
    .line 474
    .line 475
    move-result-object p1

    .line 476
    instance-of v0, p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 477
    .line 478
    if-eqz v0, :cond_10

    .line 479
    .line 480
    new-instance v0, La/e1w0;

    .line 481
    .line 482
    check-cast p1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 483
    .line 484
    invoke-direct {v0, p1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 485
    .line 486
    .line 487
    new-instance p1, La/c8d;

    .line 488
    .line 489
    sget-object v1, La/y7d;->a:La/v7d;

    .line 490
    .line 491
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    goto :goto_c

    .line 498
    :cond_10
    new-instance v0, La/w0w0;

    .line 499
    .line 500
    invoke-direct {v0, p1}, La/w0w0;-><init>(La/m7h0;)V

    .line 501
    .line 502
    .line 503
    new-instance p1, La/c8d;

    .line 504
    .line 505
    sget-object v1, La/y7d;->a:La/v7d;

    .line 506
    .line 507
    invoke-direct {p1, v1, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    :goto_c
    invoke-static {v8, p0, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    :goto_d
    move-object p1, p0

    .line 518
    check-cast p1, La/paw;

    .line 519
    .line 520
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    if-eqz v0, :cond_11

    .line 525
    .line 526
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    check-cast p1, La/oe50;

    .line 531
    .line 532
    invoke-virtual {v8, p1}, La/i1w0;->a(La/oe50;)V

    .line 533
    .line 534
    .line 535
    goto :goto_d

    .line 536
    :cond_11
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 537
    .line 538
    :goto_e
    return-object v7

    .line 539
    :pswitch_2
    iget-object v0, v5, La/zuh0;->n:La/zn00;

    .line 540
    .line 541
    iget-object v8, v5, La/zuh0;->z:La/i1w0;

    .line 542
    .line 543
    iget-object v9, v5, La/zuh0;->E:La/ol60;

    .line 544
    .line 545
    sget-object v10, La/wne;->a:La/wne;

    .line 546
    .line 547
    iget-boolean v11, p0, La/xuh0;->j:Z

    .line 548
    .line 549
    if-eqz v11, :cond_13

    .line 550
    .line 551
    if-ne v11, v6, :cond_12

    .line 552
    .line 553
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 554
    .line 555
    .line 556
    goto :goto_f

    .line 557
    :cond_12
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    goto/16 :goto_13

    .line 561
    .line 562
    :cond_13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    iget-object p1, v5, La/zuh0;->i:La/rou;

    .line 566
    .line 567
    iput-boolean v6, p0, La/xuh0;->j:Z

    .line 568
    .line 569
    invoke-virtual {p1, v6, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object p1

    .line 573
    if-ne p1, v10, :cond_14

    .line 574
    .line 575
    move-object v7, v10

    .line 576
    goto/16 :goto_13

    .line 577
    .line 578
    :cond_14
    :goto_f
    check-cast p1, La/m2c0;

    .line 579
    .line 580
    iget-object p0, v5, La/zuh0;->h:La/pru;

    .line 581
    .line 582
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 583
    .line 584
    .line 585
    move-result-object p0

    .line 586
    iget-object p0, p0, La/sff0;->k:La/f3c0;

    .line 587
    .line 588
    iget-boolean p0, p0, La/f3c0;->f:Z

    .line 589
    .line 590
    if-eqz p0, :cond_15

    .line 591
    .line 592
    iget-object v4, p1, La/m2c0;->k:La/jqt0;

    .line 593
    .line 594
    sget-object v5, La/jqt0;->c:La/jqt0;

    .line 595
    .line 596
    if-eq v4, v5, :cond_15

    .line 597
    .line 598
    sget-object v5, La/jqt0;->d:La/jqt0;

    .line 599
    .line 600
    if-eq v4, v5, :cond_15

    .line 601
    .line 602
    sget-object p0, La/iuh0;->a:La/iuh0;

    .line 603
    .line 604
    invoke-virtual {v9, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    goto/16 :goto_12

    .line 608
    .line 609
    :cond_15
    if-eqz p0, :cond_16

    .line 610
    .line 611
    invoke-static {v8, v8}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 612
    .line 613
    .line 614
    move-result-object p0

    .line 615
    sget-object p1, La/we50;->b:La/we50;

    .line 616
    .line 617
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    new-instance v1, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1;

    .line 621
    .line 622
    invoke-direct {v1, v0, p1}, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1;-><init>(La/zn00;La/we50;)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {p0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 626
    .line 627
    .line 628
    iget-object p0, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 629
    .line 630
    invoke-static {v8, p0, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 631
    .line 632
    .line 633
    move-result-object p0

    .line 634
    :goto_10
    move-object p1, p0

    .line 635
    check-cast p1, La/paw;

    .line 636
    .line 637
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 638
    .line 639
    .line 640
    move-result v0

    .line 641
    if-eqz v0, :cond_19

    .line 642
    .line 643
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object p1

    .line 647
    check-cast p1, La/oe50;

    .line 648
    .line 649
    invoke-virtual {v8, p1}, La/i1w0;->a(La/oe50;)V

    .line 650
    .line 651
    .line 652
    goto :goto_10

    .line 653
    :cond_16
    iget-object p0, p1, La/m2c0;->Z:Ljava/lang/String;

    .line 654
    .line 655
    invoke-static {p0, v2, v1, v3}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object p0

    .line 659
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 660
    .line 661
    .line 662
    move-result p0

    .line 663
    if-nez p0, :cond_17

    .line 664
    .line 665
    sget-object p0, La/luh0;->a:La/luh0;

    .line 666
    .line 667
    invoke-virtual {v9, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 668
    .line 669
    .line 670
    goto :goto_12

    .line 671
    :cond_17
    iget-object p0, p1, La/m2c0;->k:La/jqt0;

    .line 672
    .line 673
    sget-object v4, La/jqt0;->e:La/jqt0;

    .line 674
    .line 675
    if-eq p0, v4, :cond_18

    .line 676
    .line 677
    sget-object v4, La/jqt0;->d:La/jqt0;

    .line 678
    .line 679
    if-eq p0, v4, :cond_18

    .line 680
    .line 681
    iget-object p0, p1, La/m2c0;->Z:Ljava/lang/String;

    .line 682
    .line 683
    invoke-static {p0, v2, v1, v3}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object p0

    .line 687
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 688
    .line 689
    .line 690
    move-result p0

    .line 691
    if-lez p0, :cond_18

    .line 692
    .line 693
    sget-object p0, La/juh0;->a:La/juh0;

    .line 694
    .line 695
    invoke-virtual {v9, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    goto :goto_12

    .line 699
    :cond_18
    invoke-static {v8, v8}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 700
    .line 701
    .line 702
    move-result-object p0

    .line 703
    sget-object p1, La/we50;->b:La/we50;

    .line 704
    .line 705
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    new-instance v1, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1;

    .line 709
    .line 710
    invoke-direct {v1, v0, p1}, Lorg/xplatform/security/impl/navigation/PasswordScreenFactoryImpl$getPasswordChangeFragment$1;-><init>(La/zn00;La/we50;)V

    .line 711
    .line 712
    .line 713
    invoke-virtual {p0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 714
    .line 715
    .line 716
    iget-object p0, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 717
    .line 718
    invoke-static {v8, p0, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 719
    .line 720
    .line 721
    move-result-object p0

    .line 722
    :goto_11
    move-object p1, p0

    .line 723
    check-cast p1, La/paw;

    .line 724
    .line 725
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 726
    .line 727
    .line 728
    move-result v0

    .line 729
    if-eqz v0, :cond_19

    .line 730
    .line 731
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object p1

    .line 735
    check-cast p1, La/oe50;

    .line 736
    .line 737
    invoke-virtual {v8, p1}, La/i1w0;->a(La/oe50;)V

    .line 738
    .line 739
    .line 740
    goto :goto_11

    .line 741
    :cond_19
    :goto_12
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 742
    .line 743
    :goto_13
    return-object v7

    .line 744
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 745
    .line 746
    iget-boolean v1, p0, La/xuh0;->j:Z

    .line 747
    .line 748
    if-eqz v1, :cond_1b

    .line 749
    .line 750
    if-ne v1, v6, :cond_1a

    .line 751
    .line 752
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    goto :goto_14

    .line 756
    :cond_1a
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 757
    .line 758
    .line 759
    goto :goto_17

    .line 760
    :cond_1b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 761
    .line 762
    .line 763
    iget-object p1, v5, La/zuh0;->i:La/rou;

    .line 764
    .line 765
    iput-boolean v6, p0, La/xuh0;->j:Z

    .line 766
    .line 767
    invoke-virtual {p1, v6, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object p1

    .line 771
    if-ne p1, v0, :cond_1c

    .line 772
    .line 773
    move-object v7, v0

    .line 774
    goto :goto_17

    .line 775
    :cond_1c
    :goto_14
    check-cast p1, La/m2c0;

    .line 776
    .line 777
    iget-object p0, p1, La/m2c0;->Z:Ljava/lang/String;

    .line 778
    .line 779
    iget-object p1, v5, La/zuh0;->p:La/mi70;

    .line 780
    .line 781
    new-instance v0, La/xbi0;

    .line 782
    .line 783
    const/4 v1, 0x6

    .line 784
    invoke-direct {v0, p0, v1, v3}, La/xbi0;-><init>(Ljava/lang/String;IZ)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 788
    .line 789
    .line 790
    new-instance p0, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;

    .line 791
    .line 792
    invoke-direct {p0, v0}, Lorg/xplatform/security/impl/navigation/SendConfirmationSMSScreen;-><init>(La/dci0;)V

    .line 793
    .line 794
    .line 795
    iget-object p1, v5, La/zuh0;->z:La/i1w0;

    .line 796
    .line 797
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    instance-of v1, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 802
    .line 803
    if-eqz v1, :cond_1d

    .line 804
    .line 805
    new-instance v1, La/e1w0;

    .line 806
    .line 807
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 808
    .line 809
    invoke-direct {v1, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 810
    .line 811
    .line 812
    new-instance p0, La/c8d;

    .line 813
    .line 814
    sget-object v2, La/y7d;->a:La/v7d;

    .line 815
    .line 816
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    goto :goto_15

    .line 823
    :cond_1d
    new-instance v1, La/w0w0;

    .line 824
    .line 825
    invoke-direct {v1, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 826
    .line 827
    .line 828
    new-instance p0, La/c8d;

    .line 829
    .line 830
    sget-object v2, La/y7d;->a:La/v7d;

    .line 831
    .line 832
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    :goto_15
    invoke-static {p1, v0, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 839
    .line 840
    .line 841
    move-result-object p0

    .line 842
    :goto_16
    move-object v0, p0

    .line 843
    check-cast v0, La/paw;

    .line 844
    .line 845
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 846
    .line 847
    .line 848
    move-result v1

    .line 849
    if-eqz v1, :cond_1e

    .line 850
    .line 851
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    check-cast v0, La/oe50;

    .line 856
    .line 857
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 858
    .line 859
    .line 860
    goto :goto_16

    .line 861
    :cond_1e
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 862
    .line 863
    :goto_17
    return-object v7

    .line 864
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 865
    .line 866
    iget-boolean v1, p0, La/xuh0;->j:Z

    .line 867
    .line 868
    if-eqz v1, :cond_20

    .line 869
    .line 870
    if-ne v1, v6, :cond_1f

    .line 871
    .line 872
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 873
    .line 874
    .line 875
    goto :goto_18

    .line 876
    :cond_1f
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 877
    .line 878
    .line 879
    goto :goto_19

    .line 880
    :cond_20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 881
    .line 882
    .line 883
    iget-object p1, v5, La/zuh0;->u:La/m1e;

    .line 884
    .line 885
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 886
    .line 887
    .line 888
    move-result-object p1

    .line 889
    new-instance v1, La/wuh0;

    .line 890
    .line 891
    invoke-direct {v1, v5, v7, v3}, La/wuh0;-><init>(La/zuh0;La/yje;B)V

    .line 892
    .line 893
    .line 894
    new-instance v2, La/vsg0;

    .line 895
    .line 896
    invoke-direct {v2, v1}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 897
    .line 898
    .line 899
    new-instance v1, La/ib60;

    .line 900
    .line 901
    const/16 v3, 0xd

    .line 902
    .line 903
    invoke-direct {v1, v5, v7, v3}, La/ib60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 904
    .line 905
    .line 906
    new-instance v3, La/p6d;

    .line 907
    .line 908
    invoke-direct {v3, p1, v2, v1, v6}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 909
    .line 910
    .line 911
    iget-object p1, v5, La/zuh0;->q:La/mne;

    .line 912
    .line 913
    iget-object p1, p1, La/mne;->a:La/rwj;

    .line 914
    .line 915
    invoke-static {v3, p1}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 916
    .line 917
    .line 918
    move-result-object p1

    .line 919
    iput-boolean v6, p0, La/xuh0;->j:Z

    .line 920
    .line 921
    invoke-static {p1, p0}, La/slb;->N(La/gmq;La/yje;)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    move-result-object p0

    .line 925
    if-ne p0, v0, :cond_21

    .line 926
    .line 927
    move-object v7, v0

    .line 928
    goto :goto_19

    .line 929
    :cond_21
    :goto_18
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 930
    .line 931
    :goto_19
    return-object v7

    .line 932
    nop

    .line 933
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
