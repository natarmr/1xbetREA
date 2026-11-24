.class public final La/vu50;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/wu50;


# direct methods
.method public synthetic constructor <init>(La/wu50;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vu50;->i:B

    iput-object p1, p0, La/vu50;->j:La/wu50;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/vu50;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/vu50;->j:La/wu50;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/vu50;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/vu50;-><init>(La/wu50;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/vu50;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/vu50;-><init>(La/wu50;La/yje;B)V

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
    iget-byte v0, p0, La/vu50;->i:B

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
    invoke-virtual {p0, p1, p2}, La/vu50;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/vu50;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/vu50;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/vu50;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/vu50;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/vu50;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget-byte v0, p0, La/vu50;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/vu50;->j:La/wu50;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, La/qu50;

    .line 18
    .line 19
    iget-object p1, p1, La/qu50;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, La/qu50;

    .line 26
    .line 27
    iget v0, v0, La/qu50;->e:I

    .line 28
    .line 29
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, La/kr5;

    .line 34
    .line 35
    iget-object v0, p0, La/wu50;->F:La/jlx;

    .line 36
    .line 37
    iget-object v1, p0, La/wu50;->G:La/uzc0;

    .line 38
    .line 39
    iget-boolean p0, p0, La/wu50;->r:Z

    .line 40
    .line 41
    invoke-virtual {v1, p1, p0}, La/uzc0;->b(La/kr5;Z)Landroid/content/Intent;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {v0, p0}, La/jlx;->a(Landroid/content/Intent;)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 52
    .line 53
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, La/wu50;->C:La/mne;

    .line 57
    .line 58
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, La/qu50;

    .line 63
    .line 64
    iget-object v0, v0, La/qu50;->a:Ljava/util/List;

    .line 65
    .line 66
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, La/qu50;

    .line 71
    .line 72
    iget v1, v1, La/qu50;->e:I

    .line 73
    .line 74
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, La/kr5;

    .line 79
    .line 80
    iget-object v1, p0, La/wu50;->y:La/yo4;

    .line 81
    .line 82
    iget v2, v0, La/kr5;->b:I

    .line 83
    .line 84
    iget-object v3, v0, La/kr5;->w:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v4, v0, La/kr5;->d:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object v1, v1, La/yo4;->a:La/kt2;

    .line 92
    .line 93
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    new-instance v5, Lkotlin/Pair;

    .line 98
    .line 99
    const-string v6, "promo_id"

    .line 100
    .line 101
    invoke-direct {v5, v6, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    new-instance v2, Lkotlin/Pair;

    .line 105
    .line 106
    const-string v6, "translate_id"

    .line 107
    .line 108
    invoke-direct {v2, v6, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    filled-new-array {v5, v2}, [Lkotlin/Pair;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v2}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    const-string v5, "news_promo_call"

    .line 120
    .line 121
    invoke-interface {v1, v5, v2}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, La/wu50;->x:La/x20;

    .line 125
    .line 126
    iget v2, v0, La/kr5;->b:I

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget-object v1, v1, La/x20;->a:La/s1p;

    .line 132
    .line 133
    new-instance v5, La/i1p;

    .line 134
    .line 135
    const/4 v6, 0x2

    .line 136
    invoke-direct {v5, v2, v6}, La/i1p;-><init>(IB)V

    .line 137
    .line 138
    .line 139
    new-instance v2, La/j1p;

    .line 140
    .line 141
    const/4 v7, 0x0

    .line 142
    invoke-direct {v2, v4, v7}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 143
    .line 144
    .line 145
    new-array v4, v6, [La/k1p;

    .line 146
    .line 147
    aput-object v5, v4, v7

    .line 148
    .line 149
    const/4 v5, 0x1

    .line 150
    aput-object v2, v4, v5

    .line 151
    .line 152
    invoke-static {v4}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    const-wide/16 v8, 0xbb9

    .line 157
    .line 158
    invoke-virtual {v1, v2, v8, v9}, La/s1p;->a(Ljava/util/Set;J)V

    .line 159
    .line 160
    .line 161
    iget-object v1, v0, La/kr5;->v:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-lez v2, :cond_0

    .line 168
    .line 169
    iget-object p0, p0, La/wu50;->E:La/grj;

    .line 170
    .line 171
    invoke-virtual {p0, v1}, La/grj;->a(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_1

    .line 175
    .line 176
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-lez v1, :cond_1

    .line 181
    .line 182
    iget-object p1, p0, La/wu50;->D:La/i1w0;

    .line 183
    .line 184
    invoke-static {p1, p1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iget-object p0, p0, La/wu50;->z:La/nv20;

    .line 189
    .line 190
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p0, La/h6i;

    .line 193
    .line 194
    invoke-virtual {p0}, La/h6i;->c()La/yox;

    .line 195
    .line 196
    .line 197
    new-instance p0, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

    .line 198
    .line 199
    invoke-direct {p0, v3}, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 203
    .line 204
    .line 205
    iget-object p0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 206
    .line 207
    invoke-static {p1, p0, v7}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    :goto_0
    move-object v0, p0

    .line 212
    check-cast v0, La/paw;

    .line 213
    .line 214
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_3

    .line 219
    .line 220
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, La/oe50;

    .line 225
    .line 226
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 227
    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_1
    invoke-virtual {v0}, La/kr5;->d()Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    const/16 v2, 0x19

    .line 235
    .line 236
    const/4 v3, 0x0

    .line 237
    if-eqz v1, :cond_2

    .line 238
    .line 239
    iget-object v1, v0, La/kr5;->n:La/oo5;

    .line 240
    .line 241
    sget-object v4, La/oo5;->e:La/oo5;

    .line 242
    .line 243
    if-ne v1, v4, :cond_2

    .line 244
    .line 245
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    iget-object v9, p1, La/mne;->b:La/dvj;

    .line 250
    .line 251
    new-instance v7, La/b530;

    .line 252
    .line 253
    invoke-direct {v7, p0, v2}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 254
    .line 255
    .line 256
    new-instance v10, La/vu50;

    .line 257
    .line 258
    invoke-direct {v10, p0, v3, v5}, La/vu50;-><init>(La/wu50;La/yje;B)V

    .line 259
    .line 260
    .line 261
    const/16 v11, 0xa

    .line 262
    .line 263
    const/4 v8, 0x0

    .line 264
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 265
    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_2
    invoke-virtual {v0}, La/kr5;->d()Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_3

    .line 273
    .line 274
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    iget-object v9, p1, La/mne;->b:La/dvj;

    .line 279
    .line 280
    new-instance v7, La/b530;

    .line 281
    .line 282
    invoke-direct {v7, p0, v2}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 283
    .line 284
    .line 285
    new-instance v10, La/vu50;

    .line 286
    .line 287
    invoke-direct {v10, p0, v3, v5}, La/vu50;-><init>(La/wu50;La/yje;B)V

    .line 288
    .line 289
    .line 290
    const/16 v11, 0xa

    .line 291
    .line 292
    const/4 v8, 0x0

    .line 293
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 294
    .line 295
    .line 296
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    return-object p0

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
