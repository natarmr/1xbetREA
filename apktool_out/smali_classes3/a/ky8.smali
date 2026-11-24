.class public final La/ky8;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/ty8;


# direct methods
.method public synthetic constructor <init>(La/ty8;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ky8;->i:B

    iput-object p1, p0, La/ky8;->j:La/ty8;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/ky8;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ky8;->j:La/ty8;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ky8;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ky8;-><init>(La/ty8;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/ky8;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/ky8;-><init>(La/ty8;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/ky8;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/ky8;-><init>(La/ty8;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ky8;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ky8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ky8;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ky8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ky8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ky8;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ky8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/ky8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/ky8;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/ky8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ky8;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/ky8;->j:La/ty8;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, La/ty8;->p:La/uc0;

    .line 17
    .line 18
    iget-object v2, v0, La/ty8;->w:La/u58;

    .line 19
    .line 20
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, La/yx8;

    .line 25
    .line 26
    iget-wide v3, v3, La/yx8;->l:J

    .line 27
    .line 28
    const-wide/16 v5, 0x7e

    .line 29
    .line 30
    cmp-long v3, v3, v5

    .line 31
    .line 32
    iget-object v4, v0, La/ty8;->z:La/au0;

    .line 33
    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    iget-object v3, v4, La/au0;->a:La/s1p;

    .line 37
    .line 38
    const-wide/16 v4, 0x2c37

    .line 39
    .line 40
    sget-object v6, La/xun;->a:La/xun;

    .line 41
    .line 42
    invoke-virtual {v3, v6, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v2, La/u58;->a:La/kt2;

    .line 46
    .line 47
    const-string v3, "brand_live_info"

    .line 48
    .line 49
    invoke-interface {v2, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v3, v4, La/au0;->a:La/s1p;

    .line 54
    .line 55
    const-wide/16 v4, 0x2acf

    .line 56
    .line 57
    sget-object v6, La/xun;->a:La/xun;

    .line 58
    .line 59
    invoke-virtual {v3, v6, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 60
    .line 61
    .line 62
    iget-object v2, v2, La/u58;->a:La/kt2;

    .line 63
    .line 64
    const-string v3, "provbrand_prov_info"

    .line 65
    .line 66
    invoke-interface {v2, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    iget-boolean v2, v1, La/uc0;->i:Z

    .line 70
    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    iget-object v1, v0, La/ty8;->r:La/oeg0;

    .line 74
    .line 75
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v2, La/gy8;

    .line 80
    .line 81
    const/4 v3, 0x2

    .line 82
    invoke-direct {v2, v0, v3}, La/gy8;-><init>(La/ty8;B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    iget-object v2, v0, La/ty8;->u:La/s91;

    .line 90
    .line 91
    new-instance v3, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 92
    .line 93
    new-instance v8, La/yl1;

    .line 94
    .line 95
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, La/yx8;

    .line 100
    .line 101
    iget-object v0, v0, La/yx8;->c:La/xx8;

    .line 102
    .line 103
    iget-object v0, v0, La/xx8;->a:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v1, v1, La/uc0;->h:Ljava/lang/String;

    .line 106
    .line 107
    invoke-direct {v8, v0, v1}, La/yl1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const/4 v15, 0x0

    .line 111
    const/16 v16, 0x1f7

    .line 112
    .line 113
    const/4 v4, 0x0

    .line 114
    const/4 v5, 0x0

    .line 115
    const-wide/16 v6, 0x0

    .line 116
    .line 117
    const/4 v9, 0x0

    .line 118
    const-wide/16 v10, 0x0

    .line 119
    .line 120
    const-wide/16 v12, 0x0

    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    invoke-direct/range {v3 .. v16}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v3}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 127
    .line 128
    .line 129
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 133
    .line 134
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    iget-object v0, v0, La/ty8;->r:La/oeg0;

    .line 138
    .line 139
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    new-instance v3, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandGamesFiltersScreen;

    .line 148
    .line 149
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 150
    .line 151
    .line 152
    instance-of v4, v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 153
    .line 154
    if-eqz v4, :cond_2

    .line 155
    .line 156
    new-instance v4, La/e1w0;

    .line 157
    .line 158
    check-cast v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 159
    .line 160
    invoke-direct {v4, v3}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 161
    .line 162
    .line 163
    new-instance v3, La/c8d;

    .line 164
    .line 165
    sget-object v5, La/y7d;->a:La/v7d;

    .line 166
    .line 167
    invoke-direct {v3, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_2
    new-instance v4, La/w0w0;

    .line 175
    .line 176
    invoke-direct {v4, v3}, La/w0w0;-><init>(La/m7h0;)V

    .line 177
    .line 178
    .line 179
    new-instance v3, La/c8d;

    .line 180
    .line 181
    sget-object v5, La/y7d;->a:La/v7d;

    .line 182
    .line 183
    invoke-direct {v3, v5, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    :goto_2
    invoke-static {v0, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    :goto_3
    move-object v2, v1

    .line 194
    check-cast v2, La/paw;

    .line 195
    .line 196
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    if-eqz v3, :cond_3

    .line 201
    .line 202
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    check-cast v2, La/oe50;

    .line 207
    .line 208
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 209
    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 216
    .line 217
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, La/yx8;

    .line 225
    .line 226
    iget-object v1, v1, La/yx8;->c:La/xx8;

    .line 227
    .line 228
    iget-boolean v1, v1, La/xx8;->b:Z

    .line 229
    .line 230
    if-eqz v1, :cond_5

    .line 231
    .line 232
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 233
    .line 234
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 235
    .line 236
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    move-object v4, v3

    .line 244
    check-cast v4, La/yx8;

    .line 245
    .line 246
    invoke-static {v4, v2}, La/yx8;->c(La/yx8;Z)La/yx8;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-virtual {v1, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-eqz v3, :cond_4

    .line 255
    .line 256
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    iget-object v1, v0, La/ty8;->v:La/mne;

    .line 261
    .line 262
    iget-object v7, v1, La/mne;->a:La/rwj;

    .line 263
    .line 264
    sget-object v5, La/oy8;->a:La/oy8;

    .line 265
    .line 266
    new-instance v8, La/xw5;

    .line 267
    .line 268
    const/4 v1, 0x0

    .line 269
    const/16 v2, 0x1d

    .line 270
    .line 271
    const-string v3, ""

    .line 272
    .line 273
    invoke-direct {v8, v0, v3, v1, v2}, La/xw5;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 274
    .line 275
    .line 276
    const/16 v9, 0xa

    .line 277
    .line 278
    const/4 v6, 0x0

    .line 279
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 280
    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_5
    iget-object v1, v0, La/ty8;->w:La/u58;

    .line 284
    .line 285
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 286
    .line 287
    const-string v2, "provbrand_prov_back"

    .line 288
    .line 289
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    iget-object v1, v0, La/ty8;->z:La/au0;

    .line 293
    .line 294
    iget-object v1, v1, La/au0;->a:La/s1p;

    .line 295
    .line 296
    const-wide/16 v2, 0x2ace

    .line 297
    .line 298
    sget-object v4, La/xun;->a:La/xun;

    .line 299
    .line 300
    invoke-virtual {v1, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 301
    .line 302
    .line 303
    sget-object v1, La/kx8;->a:La/kx8;

    .line 304
    .line 305
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 309
    .line 310
    return-object v0

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
