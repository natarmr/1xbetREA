.class public final La/lxi0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xxi0;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(La/xxi0;ZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/lxi0;->i:B

    iput-object p1, p0, La/lxi0;->k:La/xxi0;

    iput-boolean p2, p0, La/lxi0;->l:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/lxi0;->i:B

    .line 2
    .line 3
    iget-boolean v0, p0, La/lxi0;->l:Z

    .line 4
    .line 5
    iget-object p0, p0, La/lxi0;->k:La/xxi0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/lxi0;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/lxi0;-><init>(La/xxi0;ZLa/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/lxi0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/lxi0;-><init>(La/xxi0;ZLa/yje;B)V

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
    iget-byte v0, p0, La/lxi0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/lxi0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lxi0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lxi0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/lxi0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/lxi0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/lxi0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/lxi0;->i:B

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
    iget-boolean v5, v0, La/lxi0;->j:Z

    .line 15
    .line 16
    iget-object v7, v0, La/lxi0;->k:La/xxi0;

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
    iget-object v2, v7, La/xxi0;->u:La/ahu;

    .line 36
    .line 37
    iput-boolean v4, v0, La/lxi0;->j:Z

    .line 38
    .line 39
    invoke-static {v2, v0}, La/ahu;->c(La/ahu;La/yje;)Ljava/io/Serializable;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-ne v2, v1, :cond_2

    .line 44
    .line 45
    move-object v2, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    check-cast v2, La/ql5;

    .line 48
    .line 49
    iget-wide v8, v2, La/ql5;->a:J

    .line 50
    .line 51
    sget v1, La/xxi0;->Y0:I

    .line 52
    .line 53
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v2, v7, La/xxi0;->H:La/mne;

    .line 58
    .line 59
    iget-object v13, v2, La/mne;->b:La/dvj;

    .line 60
    .line 61
    new-instance v2, La/ywi0;

    .line 62
    .line 63
    const/4 v3, 0x6

    .line 64
    invoke-direct {v2, v7, v3}, La/ywi0;-><init>(La/xxi0;B)V

    .line 65
    .line 66
    .line 67
    new-instance v14, La/hxi0;

    .line 68
    .line 69
    const/4 v11, 0x0

    .line 70
    iget-boolean v10, v0, La/lxi0;->l:Z

    .line 71
    .line 72
    move-object v6, v14

    .line 73
    invoke-direct/range {v6 .. v11}, La/hxi0;-><init>(La/xxi0;JZLa/yje;)V

    .line 74
    .line 75
    .line 76
    const/16 v15, 0xa

    .line 77
    .line 78
    const/4 v12, 0x0

    .line 79
    move-object v10, v1

    .line 80
    move-object v11, v2

    .line 81
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 82
    .line 83
    .line 84
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    :goto_1
    return-object v2

    .line 87
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 88
    .line 89
    iget-boolean v5, v0, La/lxi0;->j:Z

    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    iget-object v8, v0, La/lxi0;->k:La/xxi0;

    .line 93
    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    if-ne v5, v4, :cond_3

    .line 97
    .line 98
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    move-object/from16 v2, p1

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_4

    .line 108
    .line 109
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v8, La/xxi0;->F0:La/nhf0;

    .line 113
    .line 114
    iput-boolean v4, v0, La/lxi0;->j:Z

    .line 115
    .line 116
    invoke-virtual {v2, v6, v4, v0}, La/nhf0;->f(ZZLa/yje;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    if-ne v2, v1, :cond_5

    .line 121
    .line 122
    move-object v2, v1

    .line 123
    goto/16 :goto_4

    .line 124
    .line 125
    :cond_5
    :goto_2
    check-cast v2, La/gm3;

    .line 126
    .line 127
    iget-object v9, v2, La/gm3;->a:Ljava/lang/String;

    .line 128
    .line 129
    iget-boolean v10, v2, La/gm3;->b:Z

    .line 130
    .line 131
    iget-object v11, v2, La/gm3;->c:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    const/4 v2, 0x2

    .line 138
    iget-boolean v0, v0, La/lxi0;->l:Z

    .line 139
    .line 140
    if-lez v1, :cond_6

    .line 141
    .line 142
    sget v1, La/xxi0;->Y0:I

    .line 143
    .line 144
    new-instance v1, La/cxi0;

    .line 145
    .line 146
    invoke-direct {v1, v2, v4}, La/cxi0;-><init>(BZ)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v8, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    if-eqz v0, :cond_a

    .line 153
    .line 154
    iget-object v0, v8, La/xxi0;->A:La/i1w0;

    .line 155
    .line 156
    new-instance v7, La/t13;

    .line 157
    .line 158
    const/16 v12, 0x15

    .line 159
    .line 160
    invoke-direct/range {v7 .. v12}, La/t13;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;B)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v7}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 164
    .line 165
    .line 166
    goto/16 :goto_3

    .line 167
    .line 168
    :cond_6
    if-eqz v0, :cond_7

    .line 169
    .line 170
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, La/twi0;

    .line 175
    .line 176
    iget-boolean v0, v0, La/twi0;->R:Z

    .line 177
    .line 178
    if-eqz v0, :cond_7

    .line 179
    .line 180
    invoke-virtual {v8}, La/xxi0;->W()V

    .line 181
    .line 182
    .line 183
    new-instance v0, La/kui0;

    .line 184
    .line 185
    const/16 v1, 0x16

    .line 186
    .line 187
    invoke-direct {v0, v1}, La/kui0;-><init>(B)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v8, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 191
    .line 192
    .line 193
    :cond_7
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    check-cast v0, La/twi0;

    .line 198
    .line 199
    iget-boolean v0, v0, La/twi0;->R:Z

    .line 200
    .line 201
    if-nez v0, :cond_9

    .line 202
    .line 203
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 204
    .line 205
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 206
    .line 207
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-object v9, v1

    .line 215
    check-cast v9, La/twi0;

    .line 216
    .line 217
    const/16 v41, -0x1

    .line 218
    .line 219
    const v42, 0x1dffff

    .line 220
    .line 221
    .line 222
    const/4 v10, 0x0

    .line 223
    const/4 v11, 0x0

    .line 224
    const/4 v12, 0x0

    .line 225
    const/4 v13, 0x0

    .line 226
    const/4 v14, 0x0

    .line 227
    const/4 v15, 0x0

    .line 228
    const/16 v16, 0x0

    .line 229
    .line 230
    const/16 v17, 0x0

    .line 231
    .line 232
    const/16 v18, 0x0

    .line 233
    .line 234
    const/16 v19, 0x0

    .line 235
    .line 236
    const/16 v20, 0x0

    .line 237
    .line 238
    const/16 v21, 0x0

    .line 239
    .line 240
    const/16 v22, 0x0

    .line 241
    .line 242
    const/16 v23, 0x0

    .line 243
    .line 244
    const/16 v24, 0x0

    .line 245
    .line 246
    const/16 v25, 0x0

    .line 247
    .line 248
    const/16 v26, 0x0

    .line 249
    .line 250
    const/16 v27, 0x0

    .line 251
    .line 252
    const/16 v28, 0x0

    .line 253
    .line 254
    const/16 v29, 0x0

    .line 255
    .line 256
    const/16 v30, 0x0

    .line 257
    .line 258
    const/16 v31, 0x0

    .line 259
    .line 260
    const/16 v32, 0x0

    .line 261
    .line 262
    const/16 v33, 0x0

    .line 263
    .line 264
    const/16 v34, 0x0

    .line 265
    .line 266
    const/16 v35, 0x0

    .line 267
    .line 268
    const/16 v36, 0x0

    .line 269
    .line 270
    const/16 v37, 0x0

    .line 271
    .line 272
    const/16 v38, 0x0

    .line 273
    .line 274
    const/16 v39, 0x1

    .line 275
    .line 276
    const/16 v40, 0x0

    .line 277
    .line 278
    invoke-static/range {v9 .. v42}, La/twi0;->a(La/twi0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/twi0;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-eqz v1, :cond_8

    .line 287
    .line 288
    :cond_9
    new-instance v0, La/cxi0;

    .line 289
    .line 290
    invoke-direct {v0, v2, v6}, La/cxi0;-><init>(BZ)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v8, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 294
    .line 295
    .line 296
    :cond_a
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    :goto_4
    return-object v2

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
