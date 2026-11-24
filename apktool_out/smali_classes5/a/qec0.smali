.class public final La/qec0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/sec0;


# direct methods
.method public synthetic constructor <init>(La/sec0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qec0;->i:B

    iput-object p1, p0, La/qec0;->k:La/sec0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qec0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qec0;->k:La/sec0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/qec0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/qec0;-><init>(La/sec0;La/yje;B)V

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
    iput-boolean p0, v0, La/qec0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/qec0;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/qec0;-><init>(La/sec0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/qec0;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/qec0;-><init>(La/sec0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qec0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/qec0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/qec0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/qec0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/qec0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/qec0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/qec0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/qec0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/qec0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/qec0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qec0;->i:B

    .line 4
    .line 5
    const/16 v2, 0x7b

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, v0, La/qec0;->k:La/sec0;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-boolean v0, v0, La/qec0;->j:Z

    .line 18
    .line 19
    sget-object v1, La/wne;->a:La/wne;

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, La/bec0;

    .line 31
    .line 32
    iget-boolean v0, v0, La/bec0;->g:Z

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 37
    .line 38
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-object v8, v1

    .line 48
    check-cast v8, La/bec0;

    .line 49
    .line 50
    const/16 v19, 0x0

    .line 51
    .line 52
    const v20, 0xffbf

    .line 53
    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v10, 0x0

    .line 57
    const/4 v11, 0x0

    .line 58
    const/4 v12, 0x0

    .line 59
    const/4 v13, 0x0

    .line 60
    const/4 v14, 0x0

    .line 61
    const/4 v15, 0x1

    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    const/16 v17, 0x0

    .line 65
    .line 66
    const/16 v18, 0x0

    .line 67
    .line 68
    invoke-static/range {v8 .. v20}, La/bec0;->a(La/bec0;La/a4x;La/ydc0;La/a4x;ZZZZZLjava/util/List;ZLa/kdc0;I)La/bec0;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_0

    .line 77
    .line 78
    invoke-virtual {v6, v7, v7}, La/sec0;->M(ZZ)V

    .line 79
    .line 80
    .line 81
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_0
    iget-object v1, v6, La/i3t0;->i:La/ocj;

    .line 85
    .line 86
    sget-object v8, La/wne;->a:La/wne;

    .line 87
    .line 88
    iget-boolean v9, v0, La/qec0;->j:Z

    .line 89
    .line 90
    if-eqz v9, :cond_3

    .line 91
    .line 92
    if-ne v9, v5, :cond_2

    .line 93
    .line 94
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    move-object/from16 v0, p1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object v3, La/sec0;->E:Ljava/util/List;

    .line 109
    .line 110
    iget-object v9, v1, La/ocj;->a:La/p7m0;

    .line 111
    .line 112
    :cond_4
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-object v10, v3

    .line 120
    check-cast v10, La/bec0;

    .line 121
    .line 122
    iget-object v4, v10, La/bec0;->p:La/kdc0;

    .line 123
    .line 124
    const/16 v11, 0x77

    .line 125
    .line 126
    invoke-static {v4, v7, v5, v11}, La/kdc0;->a(La/kdc0;IZI)La/kdc0;

    .line 127
    .line 128
    .line 129
    move-result-object v21

    .line 130
    const/16 v22, 0x7fff

    .line 131
    .line 132
    const/4 v11, 0x0

    .line 133
    const/4 v12, 0x0

    .line 134
    const/4 v13, 0x0

    .line 135
    const/4 v14, 0x0

    .line 136
    const/4 v15, 0x0

    .line 137
    const/16 v16, 0x0

    .line 138
    .line 139
    const/16 v17, 0x0

    .line 140
    .line 141
    const/16 v18, 0x0

    .line 142
    .line 143
    const/16 v19, 0x0

    .line 144
    .line 145
    const/16 v20, 0x0

    .line 146
    .line 147
    invoke-static/range {v10 .. v22}, La/bec0;->a(La/bec0;La/a4x;La/ydc0;La/a4x;ZZZZZLjava/util/List;ZLa/kdc0;I)La/bec0;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-virtual {v9, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-eqz v3, :cond_4

    .line 156
    .line 157
    iget-object v3, v6, La/sec0;->x:La/j910;

    .line 158
    .line 159
    iput-boolean v5, v0, La/qec0;->j:Z

    .line 160
    .line 161
    invoke-virtual {v3, v0}, La/j910;->q(La/zje;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-ne v0, v8, :cond_5

    .line 166
    .line 167
    move-object v3, v8

    .line 168
    goto :goto_1

    .line 169
    :cond_5
    :goto_0
    move-object v3, v0

    .line 170
    check-cast v3, La/o7c0;

    .line 171
    .line 172
    iget-object v0, v6, La/sec0;->v:La/ctf0;

    .line 173
    .line 174
    invoke-static {v3, v0}, La/zvw;->V(La/o7c0;La/ctf0;)La/thc0;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object v4, v0, La/thc0;->b:Ljava/lang/String;

    .line 179
    .line 180
    iget-object v10, v1, La/ocj;->a:La/p7m0;

    .line 181
    .line 182
    :cond_6
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-object v11, v0

    .line 190
    check-cast v11, La/bec0;

    .line 191
    .line 192
    iget-object v1, v11, La/bec0;->p:La/kdc0;

    .line 193
    .line 194
    iget v5, v3, La/o7c0;->d:I

    .line 195
    .line 196
    invoke-static {v1, v5, v7, v2}, La/kdc0;->a(La/kdc0;IZI)La/kdc0;

    .line 197
    .line 198
    .line 199
    move-result-object v22

    .line 200
    const/16 v23, 0x7fff

    .line 201
    .line 202
    const/4 v12, 0x0

    .line 203
    const/4 v13, 0x0

    .line 204
    const/4 v14, 0x0

    .line 205
    const/4 v15, 0x0

    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    const/16 v18, 0x0

    .line 211
    .line 212
    const/16 v19, 0x0

    .line 213
    .line 214
    const/16 v20, 0x0

    .line 215
    .line 216
    const/16 v21, 0x0

    .line 217
    .line 218
    invoke-static/range {v11 .. v23}, La/bec0;->a(La/bec0;La/a4x;La/ydc0;La/a4x;ZZZZZLjava/util/List;ZLa/kdc0;I)La/bec0;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v10, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_6

    .line 227
    .line 228
    new-instance v0, La/iec0;

    .line 229
    .line 230
    invoke-direct {v0, v4}, La/iec0;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v6, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    :goto_1
    return-object v3

    .line 239
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 240
    .line 241
    iget-boolean v8, v0, La/qec0;->j:Z

    .line 242
    .line 243
    if-eqz v8, :cond_8

    .line 244
    .line 245
    if-ne v8, v5, :cond_7

    .line 246
    .line 247
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    move-object/from16 v0, p1

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_7
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    iget-object v3, v6, La/sec0;->w:La/nou;

    .line 261
    .line 262
    iput-boolean v5, v0, La/qec0;->j:Z

    .line 263
    .line 264
    invoke-static {v3, v0}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    if-ne v0, v1, :cond_9

    .line 269
    .line 270
    move-object v3, v1

    .line 271
    goto :goto_3

    .line 272
    :cond_9
    :goto_2
    check-cast v0, La/ql5;

    .line 273
    .line 274
    iget v0, v0, La/ql5;->h:I

    .line 275
    .line 276
    sget-object v1, La/sec0;->E:Ljava/util/List;

    .line 277
    .line 278
    iget-object v1, v6, La/i3t0;->i:La/ocj;

    .line 279
    .line 280
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 281
    .line 282
    :cond_a
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    move-object v8, v3

    .line 290
    check-cast v8, La/bec0;

    .line 291
    .line 292
    iget-object v4, v8, La/bec0;->p:La/kdc0;

    .line 293
    .line 294
    invoke-static {v4, v0, v7, v2}, La/kdc0;->a(La/kdc0;IZI)La/kdc0;

    .line 295
    .line 296
    .line 297
    move-result-object v19

    .line 298
    const/16 v20, 0x7fff

    .line 299
    .line 300
    const/4 v9, 0x0

    .line 301
    const/4 v10, 0x0

    .line 302
    const/4 v11, 0x0

    .line 303
    const/4 v12, 0x0

    .line 304
    const/4 v13, 0x0

    .line 305
    const/4 v14, 0x0

    .line 306
    const/4 v15, 0x0

    .line 307
    const/16 v16, 0x0

    .line 308
    .line 309
    const/16 v17, 0x0

    .line 310
    .line 311
    const/16 v18, 0x0

    .line 312
    .line 313
    invoke-static/range {v8 .. v20}, La/bec0;->a(La/bec0;La/a4x;La/ydc0;La/a4x;ZZZZZLjava/util/List;ZLa/kdc0;I)La/bec0;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    invoke-virtual {v1, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    if-eqz v3, :cond_a

    .line 322
    .line 323
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    :goto_3
    return-object v3

    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
