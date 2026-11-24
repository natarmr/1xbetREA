.class public final La/m5w;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/q5w;


# direct methods
.method public synthetic constructor <init>(La/q5w;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/m5w;->i:B

    iput-object p1, p0, La/m5w;->j:La/q5w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/m5w;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/m5w;->j:La/q5w;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/m5w;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/m5w;-><init>(La/q5w;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/m5w;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/m5w;-><init>(La/q5w;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/m5w;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/m5w;-><init>(La/q5w;La/yje;B)V

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
    iget-byte v0, p0, La/m5w;->i:B

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
    invoke-virtual {p0, p1, p2}, La/m5w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/m5w;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/m5w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/m5w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/m5w;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/m5w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/m5w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/m5w;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/m5w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m5w;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/m5w;->j:La/q5w;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const-wide/16 v5, 0x0

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v10, v0, La/m5w;->j:La/q5w;

    .line 21
    .line 22
    iget-object v0, v10, La/q5w;->D:La/ol60;

    .line 23
    .line 24
    iget-object v1, v10, La/q5w;->t:La/mne;

    .line 25
    .line 26
    sget-object v2, La/q5w;->G:Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {v10}, La/q5w;->v()La/n3w;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v2, v2, La/n3w;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v2}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 41
    .line 42
    .line 43
    move-result-wide v8

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-wide v8, v5

    .line 46
    :goto_0
    invoke-virtual {v10}, La/q5w;->v()La/n3w;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iget-boolean v2, v2, La/n3w;->j1:Z

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    cmp-long v2, v8, v5

    .line 55
    .line 56
    if-lez v2, :cond_1

    .line 57
    .line 58
    invoke-virtual {v10}, La/eiu0;->s()La/diu0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v8, La/n5w;

    .line 67
    .line 68
    const/4 v14, 0x0

    .line 69
    const/4 v15, 0x5

    .line 70
    const/4 v9, 0x1

    .line 71
    const-class v11, La/q5w;

    .line 72
    .line 73
    const-string v12, "handleError"

    .line 74
    .line 75
    const-string v13, "handleError(Ljava/lang/Throwable;)V"

    .line 76
    .line 77
    invoke-direct/range {v8 .. v15}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 78
    .line 79
    .line 80
    iget-object v14, v1, La/mne;->b:La/dvj;

    .line 81
    .line 82
    new-instance v15, La/p5w;

    .line 83
    .line 84
    invoke-direct {v15, v10, v7, v4}, La/p5w;-><init>(La/q5w;La/yje;B)V

    .line 85
    .line 86
    .line 87
    const/16 v16, 0xa

    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    move-object v11, v0

    .line 91
    move-object v12, v8

    .line 92
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    iget-object v2, v10, La/q5w;->m:La/h760;

    .line 97
    .line 98
    invoke-interface {v2}, La/h760;->a()La/t760;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, La/u760;

    .line 103
    .line 104
    invoke-virtual {v2}, La/u760;->f()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_2

    .line 109
    .line 110
    sget-object v1, La/e5w;->c:La/e5w;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_2
    iget-object v2, v10, La/q5w;->p:La/vpt;

    .line 117
    .line 118
    invoke-virtual {v2}, La/vpt;->a()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_3

    .line 123
    .line 124
    sget-object v1, La/e5w;->b:La/e5w;

    .line 125
    .line 126
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_3
    invoke-virtual {v10}, La/eiu0;->s()La/diu0;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    new-instance v8, La/n5w;

    .line 139
    .line 140
    const/4 v14, 0x0

    .line 141
    const/4 v15, 0x4

    .line 142
    const/4 v9, 0x1

    .line 143
    const-class v11, La/q5w;

    .line 144
    .line 145
    const-string v12, "handleSelfExclusionError"

    .line 146
    .line 147
    const-string v13, "handleSelfExclusionError(Ljava/lang/Throwable;)V"

    .line 148
    .line 149
    invoke-direct/range {v8 .. v15}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 150
    .line 151
    .line 152
    iget-object v14, v1, La/mne;->b:La/dvj;

    .line 153
    .line 154
    new-instance v15, La/p5w;

    .line 155
    .line 156
    invoke-direct {v15, v10, v7, v3}, La/p5w;-><init>(La/q5w;La/yje;B)V

    .line 157
    .line 158
    .line 159
    const/16 v16, 0xa

    .line 160
    .line 161
    const/4 v13, 0x0

    .line 162
    move-object v11, v0

    .line 163
    move-object v12, v8

    .line 164
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 165
    .line 166
    .line 167
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0

    .line 170
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 171
    .line 172
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, v2, La/q5w;->F:La/p7m0;

    .line 176
    .line 177
    new-instance v1, La/c5w;

    .line 178
    .line 179
    invoke-direct {v1, v3, v3}, La/c5w;-><init>(ZZ)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object v0

    .line 188
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 189
    .line 190
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    sget-object v0, La/q5w;->G:Ljava/util/List;

    .line 194
    .line 195
    invoke-virtual {v2}, La/q5w;->v()La/n3w;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    iget-boolean v0, v0, La/n3w;->j1:Z

    .line 200
    .line 201
    if-eqz v0, :cond_6

    .line 202
    .line 203
    invoke-virtual {v2}, La/q5w;->v()La/n3w;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    iget-object v0, v0, La/n3w;->a:Ljava/lang/String;

    .line 208
    .line 209
    invoke-static {v0}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-eqz v0, :cond_4

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 216
    .line 217
    .line 218
    move-result-wide v0

    .line 219
    goto :goto_2

    .line 220
    :cond_4
    move-wide v0, v5

    .line 221
    :goto_2
    cmp-long v0, v0, v5

    .line 222
    .line 223
    if-lez v0, :cond_6

    .line 224
    .line 225
    iget-object v0, v2, La/q5w;->z:La/yqc;

    .line 226
    .line 227
    invoke-virtual {v2}, La/q5w;->v()La/n3w;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    iget-object v1, v1, La/n3w;->a:Ljava/lang/String;

    .line 232
    .line 233
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 234
    .line 235
    .line 236
    move-result-wide v5

    .line 237
    iget-object v0, v0, La/yqc;->b:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v0, La/mii0;

    .line 240
    .line 241
    iget-object v0, v0, La/mii0;->d:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, La/ev7;

    .line 244
    .line 245
    iget-object v0, v0, La/ev7;->a:Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    iget-object v0, v2, La/q5w;->C:La/p7m0;

    .line 255
    .line 256
    :cond_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    move-object v8, v1

    .line 261
    check-cast v8, La/n3w;

    .line 262
    .line 263
    iget-boolean v3, v8, La/n3w;->j1:Z

    .line 264
    .line 265
    xor-int/lit8 v24, v3, 0x1

    .line 266
    .line 267
    const/16 v28, -0x1

    .line 268
    .line 269
    const/16 v29, -0x11

    .line 270
    .line 271
    const/4 v9, 0x0

    .line 272
    const-wide/16 v10, 0x0

    .line 273
    .line 274
    const/4 v12, 0x0

    .line 275
    const/4 v13, 0x0

    .line 276
    const-wide/16 v14, 0x0

    .line 277
    .line 278
    const/16 v16, 0x0

    .line 279
    .line 280
    const-wide/16 v17, 0x0

    .line 281
    .line 282
    const-wide/16 v19, 0x0

    .line 283
    .line 284
    const/16 v21, 0x0

    .line 285
    .line 286
    const/16 v22, 0x0

    .line 287
    .line 288
    const/16 v23, 0x0

    .line 289
    .line 290
    const/16 v25, 0x0

    .line 291
    .line 292
    const/16 v26, 0x0

    .line 293
    .line 294
    const/16 v27, 0x0

    .line 295
    .line 296
    invoke-static/range {v8 .. v29}, La/n3w;->d(La/n3w;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;JLa/e4f;DDLjava/lang/String;Ljava/lang/String;La/q4f;ZLjava/lang/String;La/hxu;Ljava/util/List;II)La/n3w;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    if-eqz v1, :cond_5

    .line 305
    .line 306
    :cond_6
    iget-object v0, v2, La/q5w;->E:La/p7m0;

    .line 307
    .line 308
    sget-object v1, La/k5w;->a:La/k5w;

    .line 309
    .line 310
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    return-object v0

    .line 316
    nop

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
