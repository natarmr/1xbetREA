.class public final La/foe0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/hoe0;


# direct methods
.method public synthetic constructor <init>(La/hoe0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/foe0;->i:B

    iput-object p1, p0, La/foe0;->k:La/hoe0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/foe0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/foe0;

    .line 7
    .line 8
    iget-object p0, p0, La/foe0;->k:La/hoe0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/foe0;-><init>(La/hoe0;La/yje;B)V

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
    iput-boolean p0, v0, La/foe0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/foe0;

    .line 24
    .line 25
    iget-object p0, p0, La/foe0;->k:La/hoe0;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-direct {p1, p0, p2, v0}, La/foe0;-><init>(La/hoe0;La/yje;B)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/foe0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/foe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/foe0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/foe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/foe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/foe0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/foe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/foe0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/foe0;->k:La/hoe0;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean p0, p0, La/foe0;->j:Z

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object p0, v2, La/hoe0;->h:La/p7m0;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object p1, La/kn00;->a:La/kn00;

    .line 25
    .line 26
    invoke-virtual {p0, v3, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    new-instance v5, La/d8e0;

    .line 34
    .line 35
    iget-object v7, v2, La/hoe0;->e:La/duj;

    .line 36
    .line 37
    const/4 v11, 0x0

    .line 38
    const/16 v12, 0xe

    .line 39
    .line 40
    const/4 v6, 0x1

    .line 41
    const-class v8, La/duj;

    .line 42
    .line 43
    const-string v9, "handleError"

    .line 44
    .line 45
    const-string v10, "handleError(Ljava/lang/Throwable;)V"

    .line 46
    .line 47
    invoke-direct/range {v5 .. v12}, La/d8e0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 48
    .line 49
    .line 50
    new-instance v8, La/foe0;

    .line 51
    .line 52
    invoke-direct {v8, v2, v3, v1}, La/foe0;-><init>(La/hoe0;La/yje;B)V

    .line 53
    .line 54
    .line 55
    const/16 v9, 0xe

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v7, 0x0

    .line 59
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    iget-object p0, v2, La/hoe0;->h:La/p7m0;

    .line 64
    .line 65
    new-instance p1, La/ln00;

    .line 66
    .line 67
    iget-object v4, v2, La/hoe0;->f:La/sa10;

    .line 68
    .line 69
    sget-object v5, La/pb10;->g:La/pb10;

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    const/16 v9, 0x1c

    .line 73
    .line 74
    const v6, 0x7f130677

    .line 75
    .line 76
    .line 77
    const/4 v7, 0x0

    .line 78
    invoke-static/range {v4 .. v9}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-direct {p1, v0}, La/ln00;-><init>(La/ra10;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v3, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 95
    .line 96
    iget-boolean v4, p0, La/foe0;->j:Z

    .line 97
    .line 98
    const/4 v5, 0x1

    .line 99
    if-eqz v4, :cond_2

    .line 100
    .line 101
    if-ne v4, v5, :cond_1

    .line 102
    .line 103
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 108
    .line 109
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto/16 :goto_5

    .line 113
    .line 114
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object p1, v2, La/hoe0;->b:La/hnu;

    .line 118
    .line 119
    iput-boolean v5, p0, La/foe0;->j:Z

    .line 120
    .line 121
    const/4 v3, 0x3

    .line 122
    invoke-static {p1, v1, p0, v3}, La/hnu;->i(La/hnu;ILa/bnn0;I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-ne p1, v0, :cond_3

    .line 127
    .line 128
    move-object v3, v0

    .line 129
    goto/16 :goto_5

    .line 130
    .line 131
    :cond_3
    :goto_1
    check-cast p1, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;

    .line 132
    .line 133
    iget-object p0, p1, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;->d:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-nez p0, :cond_4

    .line 140
    .line 141
    iget-object p0, v2, La/hoe0;->c:La/pzu;

    .line 142
    .line 143
    iget-object p0, p0, La/pzu;->a:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, La/oeg0;

    .line 146
    .line 147
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {p0, p0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    new-instance v0, Lorg/xplatform/referral/impl/navigation/ReferralProgramScreenFactoryImpl$takePartScreen$1;

    .line 156
    .line 157
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 161
    .line 162
    .line 163
    iget-object p1, p1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 164
    .line 165
    invoke-static {p0, p1, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    :goto_2
    move-object v0, p1

    .line 170
    check-cast v0, La/paw;

    .line 171
    .line 172
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_6

    .line 177
    .line 178
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, La/oe50;

    .line 183
    .line 184
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_4
    iget-object p0, v2, La/hoe0;->c:La/pzu;

    .line 189
    .line 190
    new-instance v0, Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;

    .line 191
    .line 192
    invoke-direct {v0, p1}, Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;-><init>(Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;)V

    .line 193
    .line 194
    .line 195
    iget-object p0, p0, La/pzu;->a:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast p0, La/oeg0;

    .line 198
    .line 199
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    new-instance v2, Lorg/xplatform/referral/impl/navigation/ReferralProgramScreenFactoryImpl$networkScreen$1;

    .line 208
    .line 209
    invoke-direct {v2, v0}, Lorg/xplatform/referral/impl/navigation/ReferralProgramScreenFactoryImpl$networkScreen$1;-><init>(Lorg/xplatform/referral/api/presentation/ReferralNetworkParams;)V

    .line 210
    .line 211
    .line 212
    instance-of v0, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 213
    .line 214
    if-eqz v0, :cond_5

    .line 215
    .line 216
    new-instance v0, La/e1w0;

    .line 217
    .line 218
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 219
    .line 220
    invoke-direct {v0, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 221
    .line 222
    .line 223
    new-instance v2, La/c8d;

    .line 224
    .line 225
    sget-object v3, La/y7d;->a:La/v7d;

    .line 226
    .line 227
    invoke-direct {v2, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_5
    new-instance v0, La/w0w0;

    .line 235
    .line 236
    invoke-direct {v0, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 237
    .line 238
    .line 239
    new-instance v2, La/c8d;

    .line 240
    .line 241
    sget-object v3, La/y7d;->a:La/v7d;

    .line 242
    .line 243
    invoke-direct {v2, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    :goto_3
    invoke-static {p0, p1, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    :goto_4
    move-object v0, p1

    .line 254
    check-cast v0, La/paw;

    .line 255
    .line 256
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-eqz v1, :cond_6

    .line 261
    .line 262
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    check-cast v0, La/oe50;

    .line 267
    .line 268
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 269
    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    :goto_5
    return-object v3

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
