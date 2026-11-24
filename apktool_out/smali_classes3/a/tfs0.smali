.class public final La/tfs0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/wfs0;


# direct methods
.method public synthetic constructor <init>(La/wfs0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/tfs0;->i:B

    iput-object p1, p0, La/tfs0;->k:La/wfs0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tfs0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/tfs0;->k:La/wfs0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/tfs0;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/tfs0;-><init>(La/wfs0;La/yje;B)V

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
    iput-boolean p0, v0, La/tfs0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/tfs0;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/tfs0;-><init>(La/wfs0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/tfs0;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/tfs0;-><init>(La/wfs0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/tfs0;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/tfs0;-><init>(La/wfs0;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/tfs0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/tfs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/tfs0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/tfs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/tfs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/tfs0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/tfs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/tfs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/tfs0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/tfs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, La/vne;

    .line 61
    .line 62
    check-cast p2, La/yje;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, La/tfs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/tfs0;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/tfs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
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
    iget-byte v1, v0, La/tfs0;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/tfs0;->k:La/wfs0;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v7, v0, La/tfs0;->j:Z

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 22
    .line 23
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, La/ifs0;

    .line 28
    .line 29
    iget-object v1, v1, La/ifs0;->b:La/lgs0;

    .line 30
    .line 31
    sget-object v2, La/kgs0;->a:La/kgs0;

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_3

    .line 38
    .line 39
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ifs0;

    .line 44
    .line 45
    iget-object v1, v1, La/ifs0;->b:La/lgs0;

    .line 46
    .line 47
    sget-object v2, La/jgs0;->a:La/jgs0;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    invoke-virtual {v5}, La/wfs0;->M()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, La/ifs0;

    .line 64
    .line 65
    iget-boolean v1, v1, La/ifs0;->a:Z

    .line 66
    .line 67
    if-nez v1, :cond_1

    .line 68
    .line 69
    if-eqz v7, :cond_1

    .line 70
    .line 71
    invoke-virtual {v5}, La/wfs0;->M()V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    if-nez v7, :cond_3

    .line 76
    .line 77
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, La/ifs0;

    .line 82
    .line 83
    iget-object v1, v1, La/ifs0;->b:La/lgs0;

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 92
    .line 93
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-object v8, v2

    .line 101
    check-cast v8, La/ifs0;

    .line 102
    .line 103
    const/4 v15, 0x0

    .line 104
    const/16 v16, 0x1fd

    .line 105
    .line 106
    const/4 v9, 0x0

    .line 107
    sget-object v10, La/igs0;->a:La/igs0;

    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    const/4 v12, 0x0

    .line 111
    const/4 v13, 0x0

    .line 112
    const/4 v14, 0x0

    .line 113
    invoke-static/range {v8 .. v16}, La/ifs0;->a(La/ifs0;ZLa/lgs0;La/ql5;ZLjava/util/List;Ljava/util/List;Ljava/util/List;I)La/ifs0;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_2

    .line 122
    .line 123
    :cond_3
    :goto_0
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 124
    .line 125
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-object v6, v0

    .line 133
    check-cast v6, La/ifs0;

    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    const/16 v14, 0x1fe

    .line 137
    .line 138
    const/4 v8, 0x0

    .line 139
    const/4 v9, 0x0

    .line 140
    const/4 v10, 0x0

    .line 141
    const/4 v11, 0x0

    .line 142
    const/4 v12, 0x0

    .line 143
    invoke-static/range {v6 .. v14}, La/ifs0;->a(La/ifs0;ZLa/lgs0;La/ql5;ZLjava/util/List;Ljava/util/List;Ljava/util/List;I)La/ifs0;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_4

    .line 152
    .line 153
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object v0

    .line 156
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 157
    .line 158
    iget-boolean v6, v0, La/tfs0;->j:Z

    .line 159
    .line 160
    if-eqz v6, :cond_6

    .line 161
    .line 162
    if-ne v6, v3, :cond_5

    .line 163
    .line 164
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    sget-object v2, La/wen;->b:La/uen;

    .line 176
    .line 177
    const-wide/16 v6, 0x7530

    .line 178
    .line 179
    sget-object v2, La/bfn;->d:La/bfn;

    .line 180
    .line 181
    invoke-static {v6, v7, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 182
    .line 183
    .line 184
    move-result-wide v6

    .line 185
    iput-boolean v3, v0, La/tfs0;->j:Z

    .line 186
    .line 187
    invoke-static {v6, v7, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-ne v0, v1, :cond_7

    .line 192
    .line 193
    move-object v4, v1

    .line 194
    goto :goto_2

    .line 195
    :cond_7
    :goto_1
    iget-object v0, v5, La/wfs0;->z:La/bby;

    .line 196
    .line 197
    if-eqz v0, :cond_8

    .line 198
    .line 199
    invoke-interface {v0, v4}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 200
    .line 201
    .line 202
    :cond_8
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    :goto_2
    return-object v4

    .line 205
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 206
    .line 207
    iget-boolean v6, v0, La/tfs0;->j:Z

    .line 208
    .line 209
    if-eqz v6, :cond_a

    .line 210
    .line 211
    if-ne v6, v3, :cond_9

    .line 212
    .line 213
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    sget-object v2, La/wen;->b:La/uen;

    .line 225
    .line 226
    const-wide/16 v6, 0x3e8

    .line 227
    .line 228
    sget-object v2, La/bfn;->d:La/bfn;

    .line 229
    .line 230
    invoke-static {v6, v7, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 231
    .line 232
    .line 233
    move-result-wide v6

    .line 234
    iput-boolean v3, v0, La/tfs0;->j:Z

    .line 235
    .line 236
    invoke-static {v6, v7, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    if-ne v0, v1, :cond_b

    .line 241
    .line 242
    move-object v4, v1

    .line 243
    goto :goto_4

    .line 244
    :cond_b
    :goto_3
    sget v0, La/wfs0;->A:I

    .line 245
    .line 246
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 247
    .line 248
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 249
    .line 250
    :cond_c
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    move-object v2, v0

    .line 258
    check-cast v2, La/ifs0;

    .line 259
    .line 260
    const/4 v9, 0x0

    .line 261
    const/16 v10, 0x1ef

    .line 262
    .line 263
    const/4 v3, 0x0

    .line 264
    const/4 v4, 0x0

    .line 265
    const/4 v5, 0x0

    .line 266
    const/4 v6, 0x0

    .line 267
    const/4 v7, 0x0

    .line 268
    const/4 v8, 0x0

    .line 269
    invoke-static/range {v2 .. v10}, La/ifs0;->a(La/ifs0;ZLa/lgs0;La/ql5;ZLjava/util/List;Ljava/util/List;Ljava/util/List;I)La/ifs0;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_c

    .line 278
    .line 279
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    :goto_4
    return-object v4

    .line 282
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 283
    .line 284
    iget-boolean v6, v0, La/tfs0;->j:Z

    .line 285
    .line 286
    if-eqz v6, :cond_e

    .line 287
    .line 288
    if-ne v6, v3, :cond_d

    .line 289
    .line 290
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    move-object/from16 v0, p1

    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_d
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    iget-object v2, v5, La/wfs0;->u:La/hnu;

    .line 304
    .line 305
    iget-object v4, v5, La/wfs0;->p:Ljava/lang/String;

    .line 306
    .line 307
    iget-object v6, v5, La/wfs0;->o:Ljava/lang/String;

    .line 308
    .line 309
    iput-boolean v3, v0, La/tfs0;->j:Z

    .line 310
    .line 311
    iget-object v2, v2, La/hnu;->a:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v2, La/hcp0;

    .line 314
    .line 315
    invoke-virtual {v2, v6, v4, v0}, La/hcp0;->o(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    if-ne v0, v1, :cond_f

    .line 320
    .line 321
    move-object v4, v1

    .line 322
    goto :goto_6

    .line 323
    :cond_f
    :goto_5
    move-object v13, v0

    .line 324
    check-cast v13, Ljava/util/List;

    .line 325
    .line 326
    sget v0, La/wfs0;->A:I

    .line 327
    .line 328
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 329
    .line 330
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 331
    .line 332
    :cond_10
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    move-object v6, v1

    .line 340
    check-cast v6, La/ifs0;

    .line 341
    .line 342
    const/4 v12, 0x0

    .line 343
    const/16 v14, 0xed

    .line 344
    .line 345
    const/4 v7, 0x0

    .line 346
    sget-object v8, La/kgs0;->a:La/kgs0;

    .line 347
    .line 348
    const/4 v9, 0x0

    .line 349
    const/4 v10, 0x0

    .line 350
    const/4 v11, 0x0

    .line 351
    invoke-static/range {v6 .. v14}, La/ifs0;->a(La/ifs0;ZLa/lgs0;La/ql5;ZLjava/util/List;Ljava/util/List;Ljava/util/List;I)La/ifs0;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    if-eqz v1, :cond_10

    .line 360
    .line 361
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    :goto_6
    return-object v4

    .line 364
    nop

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
