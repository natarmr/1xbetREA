.class public final synthetic La/ooe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/woe0;


# direct methods
.method public synthetic constructor <init>(La/woe0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ooe0;->a:B

    iput-object p1, p0, La/ooe0;->b:La/woe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/ooe0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "decline"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const-wide/16 v4, 0xcfe

    .line 8
    .line 9
    const-string v6, "promo_referal_data_error"

    .line 10
    .line 11
    const-string v7, "action"

    .line 12
    .line 13
    iget-object p0, p0, La/ooe0;->b:La/woe0;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v0, La/woe0;->S1:La/gne0;

    .line 19
    .line 20
    invoke-virtual {p0}, La/woe0;->H0()La/zoe0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object v0, p0, La/zoe0;->j:La/yo4;

    .line 25
    .line 26
    iget-object v0, v0, La/yo4;->a:La/kt2;

    .line 27
    .line 28
    const-string v1, "fill"

    .line 29
    .line 30
    invoke-static {v7, v1, v0, v6}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, La/zoe0;->n:La/x20;

    .line 34
    .line 35
    iget-object v0, v0, La/x20;->a:La/s1p;

    .line 36
    .line 37
    invoke-static {v1, v0, v4, v5}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, La/zoe0;->e:La/pzu;

    .line 41
    .line 42
    iget-object v0, p0, La/pzu;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, La/oeg0;

    .line 45
    .line 46
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object p0, p0, La/pzu;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/jh70;

    .line 57
    .line 58
    invoke-static {p0, v3}, La/jh70;->j(La/jh70;Z)Lorg/xplatform/personal/impl/navigation/PersonalScreen$PersonalDataScreen;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    instance-of v2, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 63
    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    new-instance v2, La/e1w0;

    .line 67
    .line 68
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 69
    .line 70
    invoke-direct {v2, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 71
    .line 72
    .line 73
    new-instance p0, La/c8d;

    .line 74
    .line 75
    sget-object v4, La/y7d;->a:La/v7d;

    .line 76
    .line 77
    invoke-direct {p0, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    new-instance v2, La/w0w0;

    .line 85
    .line 86
    invoke-direct {v2, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 87
    .line 88
    .line 89
    new-instance p0, La/c8d;

    .line 90
    .line 91
    sget-object v4, La/y7d;->a:La/v7d;

    .line 92
    .line 93
    invoke-direct {p0, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :goto_0
    invoke-static {v0, v1, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    :goto_1
    move-object v1, p0

    .line 104
    check-cast v1, La/paw;

    .line 105
    .line 106
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_1

    .line 111
    .line 112
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, La/oe50;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object p0

    .line 125
    :pswitch_0
    sget-object v0, La/woe0;->S1:La/gne0;

    .line 126
    .line 127
    invoke-virtual {p0}, La/woe0;->H0()La/zoe0;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    iget-object v0, p0, La/zoe0;->j:La/yo4;

    .line 132
    .line 133
    iget-object v0, v0, La/yo4;->a:La/kt2;

    .line 134
    .line 135
    const-string v1, "promo_referal_deposit_error"

    .line 136
    .line 137
    invoke-static {v7, v2, v0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object p0, p0, La/zoe0;->n:La/x20;

    .line 141
    .line 142
    iget-object p0, p0, La/x20;->a:La/s1p;

    .line 143
    .line 144
    const-wide/16 v0, 0xcff

    .line 145
    .line 146
    invoke-static {v2, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 147
    .line 148
    .line 149
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_1
    sget-object v0, La/woe0;->S1:La/gne0;

    .line 153
    .line 154
    invoke-virtual {p0}, La/woe0;->H0()La/zoe0;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    iget-object v0, p0, La/zoe0;->i:La/ih5;

    .line 159
    .line 160
    iget-object v0, v0, La/ih5;->a:La/kt2;

    .line 161
    .line 162
    const-string v2, "screen"

    .line 163
    .line 164
    const-string v3, "referal_deposit_error"

    .line 165
    .line 166
    const-string v4, "deposit_call"

    .line 167
    .line 168
    invoke-static {v2, v3, v0, v4}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, La/zoe0;->l:La/l7k;

    .line 172
    .line 173
    sget-object v2, La/y1p;->b:La/y1p;

    .line 174
    .line 175
    iget-object v2, p0, La/zoe0;->m:La/cmt;

    .line 176
    .line 177
    invoke-virtual {v2}, La/cmt;->g()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v0, v3, v2}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    new-instance v5, La/d8e0;

    .line 189
    .line 190
    iget-object v7, p0, La/zoe0;->k:La/duj;

    .line 191
    .line 192
    const/4 v11, 0x0

    .line 193
    const/16 v12, 0xf

    .line 194
    .line 195
    const/4 v6, 0x1

    .line 196
    const-class v8, La/duj;

    .line 197
    .line 198
    const-string v9, "handleError"

    .line 199
    .line 200
    const-string v10, "handleError(Ljava/lang/Throwable;)V"

    .line 201
    .line 202
    invoke-direct/range {v5 .. v12}, La/d8e0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 203
    .line 204
    .line 205
    new-instance v8, La/d7a0;

    .line 206
    .line 207
    const/16 v0, 0x15

    .line 208
    .line 209
    invoke-direct {v8, p0, v1, v0}, La/d7a0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 210
    .line 211
    .line 212
    const/16 v9, 0xe

    .line 213
    .line 214
    const/4 v6, 0x0

    .line 215
    const/4 v7, 0x0

    .line 216
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 217
    .line 218
    .line 219
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object p0

    .line 222
    :pswitch_2
    iget-object p0, p0, La/woe0;->M1:La/fiu0;

    .line 223
    .line 224
    if-eqz p0, :cond_2

    .line 225
    .line 226
    return-object p0

    .line 227
    :cond_2
    const-string p0, "viewModelFactory"

    .line 228
    .line 229
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v1

    .line 233
    :pswitch_3
    sget-object v0, La/woe0;->S1:La/gne0;

    .line 234
    .line 235
    invoke-virtual {p0}, La/woe0;->H0()La/zoe0;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    iget-object v0, p0, La/zoe0;->j:La/yo4;

    .line 240
    .line 241
    iget-object v0, v0, La/yo4;->a:La/kt2;

    .line 242
    .line 243
    invoke-static {v7, v2, v0, v6}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    iget-object p0, p0, La/zoe0;->n:La/x20;

    .line 247
    .line 248
    iget-object p0, p0, La/x20;->a:La/s1p;

    .line 249
    .line 250
    invoke-static {v2, p0, v4, v5}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 251
    .line 252
    .line 253
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object p0

    .line 256
    :pswitch_4
    sget-object v0, La/woe0;->S1:La/gne0;

    .line 257
    .line 258
    invoke-virtual {p0}, La/woe0;->H0()La/zoe0;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    iget-object p0, p0, La/zoe0;->e:La/pzu;

    .line 263
    .line 264
    iget-object v0, p0, La/pzu;->a:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v0, La/oeg0;

    .line 267
    .line 268
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    iget-object v2, p0, La/pzu;->e:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v2, La/jh70;

    .line 279
    .line 280
    iget-object p0, p0, La/pzu;->f:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast p0, La/pru;

    .line 283
    .line 284
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    iget-object p0, p0, La/sff0;->V0:La/zuc0;

    .line 289
    .line 290
    invoke-static {v2, p0}, La/jh70;->i(La/jh70;La/zuc0;)Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    invoke-virtual {v1, p0}, La/k0w0;->c(La/m7h0;)V

    .line 295
    .line 296
    .line 297
    iget-object p0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 298
    .line 299
    invoke-static {v0, p0, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    :goto_2
    move-object v1, p0

    .line 304
    check-cast v1, La/paw;

    .line 305
    .line 306
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    if-eqz v2, :cond_3

    .line 311
    .line 312
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    check-cast v1, La/oe50;

    .line 317
    .line 318
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 319
    .line 320
    .line 321
    goto :goto_2

    .line 322
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    return-object p0

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
