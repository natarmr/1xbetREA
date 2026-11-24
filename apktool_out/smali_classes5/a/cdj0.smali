.class public final La/cdj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/odj0;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(La/odj0;ZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/cdj0;->i:B

    iput-object p1, p0, La/cdj0;->k:La/odj0;

    iput-boolean p2, p0, La/cdj0;->l:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/cdj0;->i:B

    .line 2
    .line 3
    iget-boolean v0, p0, La/cdj0;->l:Z

    .line 4
    .line 5
    iget-object p0, p0, La/cdj0;->k:La/odj0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/cdj0;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/cdj0;-><init>(La/odj0;ZLa/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/cdj0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/cdj0;-><init>(La/odj0;ZLa/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/cdj0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/cdj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/cdj0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/cdj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/cdj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/cdj0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/cdj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cdj0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v1, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, v0, La/cdj0;->j:Z

    .line 15
    .line 16
    iget-object v7, v0, La/cdj0;->k:La/odj0;

    .line 17
    .line 18
    if-eqz v5, :cond_1

    .line 19
    .line 20
    if-ne v5, v4, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v2, p1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, v7, La/odj0;->u:La/ieu;

    .line 36
    .line 37
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, La/tcj0;

    .line 42
    .line 43
    iget-boolean v3, v3, La/tcj0;->B:Z

    .line 44
    .line 45
    xor-int/2addr v3, v4

    .line 46
    iput-boolean v4, v0, La/cdj0;->j:Z

    .line 47
    .line 48
    invoke-static {v2, v3, v0}, La/ieu;->n(La/ieu;ZLa/bnn0;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    if-ne v2, v1, :cond_2

    .line 53
    .line 54
    move-object v2, v1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_0
    check-cast v2, La/ql5;

    .line 57
    .line 58
    iget-wide v8, v2, La/ql5;->a:J

    .line 59
    .line 60
    sget v1, La/odj0;->V0:I

    .line 61
    .line 62
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v2, v7, La/odj0;->F:La/mne;

    .line 67
    .line 68
    iget-object v13, v2, La/mne;->b:La/dvj;

    .line 69
    .line 70
    new-instance v2, La/vcj0;

    .line 71
    .line 72
    invoke-direct {v2, v7, v4}, La/vcj0;-><init>(La/odj0;B)V

    .line 73
    .line 74
    .line 75
    new-instance v14, La/zcj0;

    .line 76
    .line 77
    const/4 v11, 0x0

    .line 78
    iget-boolean v10, v0, La/cdj0;->l:Z

    .line 79
    .line 80
    move-object v6, v14

    .line 81
    invoke-direct/range {v6 .. v11}, La/zcj0;-><init>(La/odj0;JZLa/yje;)V

    .line 82
    .line 83
    .line 84
    const/16 v15, 0xa

    .line 85
    .line 86
    const/4 v12, 0x0

    .line 87
    move-object v10, v1

    .line 88
    move-object v11, v2

    .line 89
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 90
    .line 91
    .line 92
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    :goto_1
    return-object v2

    .line 95
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 96
    .line 97
    iget-boolean v5, v0, La/cdj0;->j:Z

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    iget-object v8, v0, La/cdj0;->k:La/odj0;

    .line 101
    .line 102
    if-eqz v5, :cond_4

    .line 103
    .line 104
    if-ne v5, v4, :cond_3

    .line 105
    .line 106
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object/from16 v2, p1

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_4

    .line 116
    .line 117
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-object v2, v8, La/odj0;->C0:La/nhf0;

    .line 121
    .line 122
    iput-boolean v4, v0, La/cdj0;->j:Z

    .line 123
    .line 124
    invoke-virtual {v2, v6, v4, v0}, La/nhf0;->f(ZZLa/yje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    if-ne v2, v1, :cond_5

    .line 129
    .line 130
    move-object v2, v1

    .line 131
    goto/16 :goto_4

    .line 132
    .line 133
    :cond_5
    :goto_2
    check-cast v2, La/gm3;

    .line 134
    .line 135
    iget-object v9, v2, La/gm3;->a:Ljava/lang/String;

    .line 136
    .line 137
    iget-boolean v10, v2, La/gm3;->b:Z

    .line 138
    .line 139
    iget-object v11, v2, La/gm3;->c:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    const/16 v2, 0x9

    .line 146
    .line 147
    iget-boolean v0, v0, La/cdj0;->l:Z

    .line 148
    .line 149
    if-lez v1, :cond_6

    .line 150
    .line 151
    sget v1, La/odj0;->V0:I

    .line 152
    .line 153
    new-instance v1, La/cxi0;

    .line 154
    .line 155
    invoke-direct {v1, v2, v4}, La/cxi0;-><init>(BZ)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v8, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 159
    .line 160
    .line 161
    if-eqz v0, :cond_a

    .line 162
    .line 163
    iget-object v0, v8, La/odj0;->z:La/i1w0;

    .line 164
    .line 165
    new-instance v7, La/t13;

    .line 166
    .line 167
    const/16 v12, 0x16

    .line 168
    .line 169
    invoke-direct/range {v7 .. v12}, La/t13;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;B)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v7}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 173
    .line 174
    .line 175
    goto/16 :goto_3

    .line 176
    .line 177
    :cond_6
    if-eqz v0, :cond_7

    .line 178
    .line 179
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, La/tcj0;

    .line 184
    .line 185
    iget-boolean v0, v0, La/tcj0;->T:Z

    .line 186
    .line 187
    if-eqz v0, :cond_7

    .line 188
    .line 189
    invoke-virtual {v8}, La/odj0;->V()V

    .line 190
    .line 191
    .line 192
    new-instance v0, La/r3j0;

    .line 193
    .line 194
    const/16 v1, 0x1b

    .line 195
    .line 196
    invoke-direct {v0, v1}, La/r3j0;-><init>(B)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v8, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 200
    .line 201
    .line 202
    :cond_7
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, La/tcj0;

    .line 207
    .line 208
    iget-boolean v0, v0, La/tcj0;->T:Z

    .line 209
    .line 210
    if-nez v0, :cond_9

    .line 211
    .line 212
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 213
    .line 214
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 215
    .line 216
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    move-object v9, v1

    .line 224
    check-cast v9, La/tcj0;

    .line 225
    .line 226
    const/16 v41, -0x1

    .line 227
    .line 228
    const v42, 0x1dffff

    .line 229
    .line 230
    .line 231
    const/4 v10, 0x0

    .line 232
    const/4 v11, 0x0

    .line 233
    const/4 v12, 0x0

    .line 234
    const/4 v13, 0x0

    .line 235
    const/4 v14, 0x0

    .line 236
    const/4 v15, 0x0

    .line 237
    const/16 v16, 0x0

    .line 238
    .line 239
    const/16 v17, 0x0

    .line 240
    .line 241
    const/16 v18, 0x0

    .line 242
    .line 243
    const/16 v19, 0x0

    .line 244
    .line 245
    const/16 v20, 0x0

    .line 246
    .line 247
    const/16 v21, 0x0

    .line 248
    .line 249
    const/16 v22, 0x0

    .line 250
    .line 251
    const/16 v23, 0x0

    .line 252
    .line 253
    const/16 v24, 0x0

    .line 254
    .line 255
    const/16 v25, 0x0

    .line 256
    .line 257
    const/16 v26, 0x0

    .line 258
    .line 259
    const/16 v27, 0x0

    .line 260
    .line 261
    const/16 v28, 0x0

    .line 262
    .line 263
    const/16 v29, 0x0

    .line 264
    .line 265
    const/16 v30, 0x0

    .line 266
    .line 267
    const/16 v31, 0x0

    .line 268
    .line 269
    const/16 v32, 0x0

    .line 270
    .line 271
    const/16 v33, 0x0

    .line 272
    .line 273
    const/16 v34, 0x0

    .line 274
    .line 275
    const/16 v35, 0x0

    .line 276
    .line 277
    const/16 v36, 0x0

    .line 278
    .line 279
    const/16 v37, 0x0

    .line 280
    .line 281
    const/16 v38, 0x0

    .line 282
    .line 283
    const/16 v39, 0x1

    .line 284
    .line 285
    const/16 v40, 0x0

    .line 286
    .line 287
    invoke-static/range {v9 .. v42}, La/tcj0;->a(La/tcj0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZLa/hh5;ZZIII)La/tcj0;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    if-eqz v1, :cond_8

    .line 296
    .line 297
    :cond_9
    new-instance v0, La/cxi0;

    .line 298
    .line 299
    invoke-direct {v0, v2, v6}, La/cxi0;-><init>(BZ)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v8, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 303
    .line 304
    .line 305
    :cond_a
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    :goto_4
    return-object v2

    .line 308
    nop

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
