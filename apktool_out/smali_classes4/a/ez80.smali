.class public final La/ez80;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/gz80;


# direct methods
.method public synthetic constructor <init>(La/gz80;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ez80;->i:B

    iput-object p1, p0, La/ez80;->k:La/gz80;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ez80;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ez80;->k:La/gz80;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ez80;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ez80;-><init>(La/gz80;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/ez80;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/ez80;-><init>(La/gz80;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iput-boolean p0, v0, La/ez80;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ez80;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ez80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ez80;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ez80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/ez80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/ez80;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/ez80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/ez80;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/ez80;->k:La/gz80;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, La/i3t0;->f:La/oyg0;

    .line 11
    .line 12
    iget-object v4, v1, La/i3t0;->i:La/ocj;

    .line 13
    .line 14
    sget-object v5, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/ez80;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, v1, La/gz80;->w:La/dq00;

    .line 37
    .line 38
    iput-boolean v3, p0, La/ez80;->j:Z

    .line 39
    .line 40
    invoke-virtual {p1, p0}, La/dq00;->g(La/zje;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-ne p1, v5, :cond_2

    .line 45
    .line 46
    move-object v2, v5

    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_2
    :goto_0
    move-object v5, p1

    .line 50
    check-cast v5, Ljava/util/List;

    .line 51
    .line 52
    sget p0, La/gz80;->M:I

    .line 53
    .line 54
    iget-object v6, v4, La/ocj;->a:La/p7m0;

    .line 55
    .line 56
    :cond_3
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-object v7, p0

    .line 64
    check-cast v7, La/az80;

    .line 65
    .line 66
    new-instance v9, La/j0g0;

    .line 67
    .line 68
    invoke-direct {v9, v5}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const/4 v11, 0x0

    .line 72
    const/16 v12, 0xd

    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    invoke-static/range {v7 .. v12}, La/az80;->a(La/az80;ZLa/j0g0;Ljava/util/List;Ljava/util/LinkedHashMap;I)La/az80;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {v6, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_3

    .line 85
    .line 86
    iget-wide p0, v1, La/gz80;->p:J

    .line 87
    .line 88
    iget-object v6, v1, La/gz80;->o:Ljava/lang/String;

    .line 89
    .line 90
    const-string v7, "_"

    .line 91
    .line 92
    const-string v8, " "

    .line 93
    .line 94
    const/4 v9, 0x0

    .line 95
    invoke-static {v6, v7, v8, v9}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 100
    .line 101
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-nez v7, :cond_4

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    iget-boolean v7, v1, La/gz80;->q:Z

    .line 116
    .line 117
    if-eqz v7, :cond_5

    .line 118
    .line 119
    const-wide/16 v7, 0x0

    .line 120
    .line 121
    cmp-long v7, p0, v7

    .line 122
    .line 123
    if-eqz v7, :cond_5

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_5
    move v3, v9

    .line 127
    :goto_1
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_8

    .line 136
    .line 137
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    move-object v8, v7

    .line 142
    check-cast v8, La/by80;

    .line 143
    .line 144
    iget-object v9, v8, La/by80;->a:Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v9, v6}, Lkotlin/text/c;->o(Ljava/lang/String;Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    if-eqz v9, :cond_6

    .line 151
    .line 152
    if-eqz v3, :cond_7

    .line 153
    .line 154
    iget-object v8, v8, La/by80;->b:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    if-eqz v8, :cond_6

    .line 165
    .line 166
    :cond_7
    move-object v2, v7

    .line 167
    :cond_8
    move-object p0, v2

    .line 168
    check-cast p0, La/by80;

    .line 169
    .line 170
    if-nez p0, :cond_9

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_9
    iget-object p1, v4, La/ocj;->a:La/p7m0;

    .line 174
    .line 175
    :cond_a
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-object v3, v2

    .line 183
    check-cast v3, La/az80;

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v4, p0, La/by80;->a:Ljava/lang/String;

    .line 189
    .line 190
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 191
    .line 192
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    const/4 v7, 0x0

    .line 204
    const/16 v8, 0xb

    .line 205
    .line 206
    const/4 v4, 0x0

    .line 207
    const/4 v5, 0x0

    .line 208
    invoke-static/range {v3 .. v8}, La/az80;->a(La/az80;ZLa/j0g0;Ljava/util/List;Ljava/util/LinkedHashMap;I)La/az80;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {p1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_a

    .line 217
    .line 218
    invoke-virtual {v1, p0}, La/gz80;->M(La/by80;)V

    .line 219
    .line 220
    .line 221
    :goto_2
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    :goto_3
    return-object v2

    .line 224
    :pswitch_0
    iget-boolean v4, p0, La/ez80;->j:Z

    .line 225
    .line 226
    sget-object p0, La/wne;->a:La/wne;

    .line 227
    .line 228
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    if-eqz v4, :cond_d

    .line 232
    .line 233
    sget p0, La/gz80;->M:I

    .line 234
    .line 235
    iget-object p0, v1, La/gz80;->I:La/bby;

    .line 236
    .line 237
    if-eqz p0, :cond_b

    .line 238
    .line 239
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    if-ne p0, v3, :cond_b

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_b
    iget-object p0, v1, La/gz80;->I:La/bby;

    .line 247
    .line 248
    if-eqz p0, :cond_c

    .line 249
    .line 250
    invoke-interface {p0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 251
    .line 252
    .line 253
    :cond_c
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    iget-object p0, v1, La/gz80;->v:La/mne;

    .line 258
    .line 259
    iget-object v8, p0, La/mne;->b:La/dvj;

    .line 260
    .line 261
    new-instance v6, La/dz80;

    .line 262
    .line 263
    const/4 p0, 0x3

    .line 264
    invoke-direct {v6, v1, p0}, La/dz80;-><init>(La/gz80;B)V

    .line 265
    .line 266
    .line 267
    new-instance v9, La/ez80;

    .line 268
    .line 269
    invoke-direct {v9, v1, v2, v3}, La/ez80;-><init>(La/gz80;La/yje;B)V

    .line 270
    .line 271
    .line 272
    const/16 v10, 0xa

    .line 273
    .line 274
    const/4 v7, 0x0

    .line 275
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    iput-object p0, v1, La/gz80;->I:La/bby;

    .line 280
    .line 281
    :cond_d
    :goto_4
    sget p0, La/gz80;->M:I

    .line 282
    .line 283
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 284
    .line 285
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 286
    .line 287
    :cond_e
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    move-object v3, p1

    .line 295
    check-cast v3, La/az80;

    .line 296
    .line 297
    const/4 v7, 0x0

    .line 298
    const/16 v8, 0xe

    .line 299
    .line 300
    const/4 v5, 0x0

    .line 301
    const/4 v6, 0x0

    .line 302
    invoke-static/range {v3 .. v8}, La/az80;->a(La/az80;ZLa/j0g0;Ljava/util/List;Ljava/util/LinkedHashMap;I)La/az80;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result p1

    .line 310
    if-eqz p1, :cond_e

    .line 311
    .line 312
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 313
    .line 314
    return-object p0

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
