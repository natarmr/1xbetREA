.class public final La/nl20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/on20;


# direct methods
.method public synthetic constructor <init>(La/on20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nl20;->i:B

    iput-object p1, p0, La/nl20;->k:La/on20;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/nl20;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/nl20;->k:La/on20;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/nl20;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/nl20;-><init>(La/on20;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/nl20;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/nl20;-><init>(La/on20;La/yje;B)V

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
    iget-byte v0, p0, La/nl20;->i:B

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
    invoke-virtual {p0, p1, p2}, La/nl20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nl20;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nl20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/nl20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/nl20;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/nl20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/nl20;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v0, La/nl20;->k:La/on20;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-byte v7, v0, La/nl20;->j:B

    .line 18
    .line 19
    if-eqz v7, :cond_2

    .line 20
    .line 21
    if-eq v7, v4, :cond_1

    .line 22
    .line 23
    if-ne v7, v5, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, La/a820;

    .line 42
    .line 43
    iget-object v2, v2, La/a820;->c:La/ko7;

    .line 44
    .line 45
    sget-object v7, La/jo7;->b:La/jo7;

    .line 46
    .line 47
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_3

    .line 52
    .line 53
    iput-byte v4, v0, La/nl20;->j:B

    .line 54
    .line 55
    invoke-virtual {v3, v0}, La/on20;->n0(La/zje;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-ne v0, v1, :cond_4

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    sget-object v4, La/ho7;->b:La/ho7;

    .line 63
    .line 64
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_5

    .line 69
    .line 70
    iput-byte v5, v0, La/nl20;->j:B

    .line 71
    .line 72
    invoke-virtual {v3, v0}, La/on20;->l0(La/zje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-ne v0, v1, :cond_4

    .line 77
    .line 78
    :goto_1
    move-object v6, v1

    .line 79
    goto :goto_3

    .line 80
    :cond_4
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_5
    sget-object v0, La/io7;->b:La/io7;

    .line 84
    .line 85
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_6

    .line 90
    .line 91
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 95
    .line 96
    .line 97
    :goto_3
    return-object v6

    .line 98
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 99
    .line 100
    iget-byte v7, v0, La/nl20;->j:B

    .line 101
    .line 102
    if-eqz v7, :cond_9

    .line 103
    .line 104
    if-eq v7, v4, :cond_8

    .line 105
    .line 106
    if-ne v7, v5, :cond_7

    .line 107
    .line 108
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_9

    .line 112
    .line 113
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_a

    .line 117
    .line 118
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    move-object/from16 v2, p1

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object v2, v3, La/on20;->B:La/m1e;

    .line 128
    .line 129
    invoke-interface {v2}, La/m1e;->b()La/gmq;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    iput-byte v4, v0, La/nl20;->j:B

    .line 134
    .line 135
    invoke-static {v2, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    if-ne v2, v1, :cond_a

    .line 140
    .line 141
    goto/16 :goto_8

    .line 142
    .line 143
    :cond_a
    :goto_4
    check-cast v2, Ljava/lang/Boolean;

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-nez v2, :cond_b

    .line 150
    .line 151
    sget v0, La/on20;->m1:I

    .line 152
    .line 153
    invoke-virtual {v3}, La/on20;->C0()V

    .line 154
    .line 155
    .line 156
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    goto/16 :goto_a

    .line 159
    .line 160
    :cond_b
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, La/a820;

    .line 165
    .line 166
    iget-object v2, v2, La/a820;->h:La/vtb0;

    .line 167
    .line 168
    if-eqz v2, :cond_13

    .line 169
    .line 170
    iget-boolean v6, v2, La/vtb0;->h:Z

    .line 171
    .line 172
    iget-object v7, v3, La/on20;->b0:La/j9c;

    .line 173
    .line 174
    invoke-virtual {v7}, La/j9c;->a()La/q4f;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    sget-object v8, La/q4f;->g:La/q4f;

    .line 179
    .line 180
    if-ne v7, v8, :cond_c

    .line 181
    .line 182
    invoke-virtual {v3}, La/on20;->e0()La/xc20;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    if-eqz v8, :cond_c

    .line 187
    .line 188
    if-nez v6, :cond_c

    .line 189
    .line 190
    invoke-virtual {v3}, La/on20;->e0()La/xc20;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-eqz v0, :cond_12

    .line 195
    .line 196
    invoke-virtual {v3, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_9

    .line 200
    .line 201
    :cond_c
    iget-wide v8, v2, La/vtb0;->a:D

    .line 202
    .line 203
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    check-cast v10, La/a820;

    .line 208
    .line 209
    iget-object v10, v10, La/a820;->d:La/xm5;

    .line 210
    .line 211
    iget-object v10, v10, La/xm5;->c:La/ql5;

    .line 212
    .line 213
    iget-wide v10, v10, La/ql5;->b:D

    .line 214
    .line 215
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    check-cast v12, La/a820;

    .line 220
    .line 221
    iget-object v12, v12, La/a820;->d:La/xm5;

    .line 222
    .line 223
    iget-object v12, v12, La/xm5;->d:La/h40;

    .line 224
    .line 225
    iget-wide v12, v12, La/h40;->a:D

    .line 226
    .line 227
    iget-object v14, v3, La/on20;->v:La/pru;

    .line 228
    .line 229
    invoke-virtual {v14}, La/pru;->a()La/sff0;

    .line 230
    .line 231
    .line 232
    move-result-object v14

    .line 233
    iget-object v14, v14, La/sff0;->a:La/gx7;

    .line 234
    .line 235
    iget-object v14, v14, La/gx7;->a:La/gm7;

    .line 236
    .line 237
    iget-boolean v14, v14, La/gm7;->b:Z

    .line 238
    .line 239
    const-wide/16 v15, 0x0

    .line 240
    .line 241
    cmpl-double v15, v12, v15

    .line 242
    .line 243
    const/16 v16, 0x0

    .line 244
    .line 245
    if-lez v15, :cond_d

    .line 246
    .line 247
    move v15, v4

    .line 248
    goto :goto_5

    .line 249
    :cond_d
    move/from16 v15, v16

    .line 250
    .line 251
    :goto_5
    sget-object v4, La/q4f;->m:La/q4f;

    .line 252
    .line 253
    if-ne v7, v4, :cond_e

    .line 254
    .line 255
    iget-object v4, v3, La/on20;->N0:La/es;

    .line 256
    .line 257
    invoke-virtual {v4, v8, v9}, La/es;->l(D)D

    .line 258
    .line 259
    .line 260
    move-result-wide v8

    .line 261
    cmpl-double v4, v8, v10

    .line 262
    .line 263
    if-lez v4, :cond_10

    .line 264
    .line 265
    if-eqz v15, :cond_10

    .line 266
    .line 267
    if-eqz v14, :cond_10

    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_e
    add-double/2addr v12, v10

    .line 271
    cmpl-double v4, v12, v8

    .line 272
    .line 273
    if-ltz v4, :cond_f

    .line 274
    .line 275
    const/4 v4, 0x1

    .line 276
    goto :goto_6

    .line 277
    :cond_f
    move/from16 v4, v16

    .line 278
    .line 279
    :goto_6
    cmpl-double v8, v8, v10

    .line 280
    .line 281
    if-lez v8, :cond_10

    .line 282
    .line 283
    if-eqz v4, :cond_10

    .line 284
    .line 285
    if-eqz v15, :cond_10

    .line 286
    .line 287
    if-eqz v14, :cond_10

    .line 288
    .line 289
    :goto_7
    iget-boolean v4, v2, La/vtb0;->d:Z

    .line 290
    .line 291
    if-nez v4, :cond_10

    .line 292
    .line 293
    sget-object v0, La/vc20;->a:La/vc20;

    .line 294
    .line 295
    invoke-virtual {v3, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    goto :goto_9

    .line 299
    :cond_10
    if-eqz v6, :cond_11

    .line 300
    .line 301
    sget-object v7, La/q4f;->e:La/q4f;

    .line 302
    .line 303
    :cond_11
    iput-byte v5, v0, La/nl20;->j:B

    .line 304
    .line 305
    invoke-virtual {v3, v7, v2, v0}, La/on20;->x0(La/q4f;La/vtb0;La/zje;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    if-ne v0, v1, :cond_12

    .line 310
    .line 311
    :goto_8
    move-object v6, v1

    .line 312
    goto :goto_a

    .line 313
    :cond_12
    :goto_9
    sget v0, La/on20;->m1:I

    .line 314
    .line 315
    sget-object v0, La/lb20;->a:La/lb20;

    .line 316
    .line 317
    invoke-virtual {v3, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_13
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 321
    .line 322
    :goto_a
    return-object v6

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
