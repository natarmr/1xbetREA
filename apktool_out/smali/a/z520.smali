.class public final La/z520;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/h620;


# direct methods
.method public synthetic constructor <init>(La/h620;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z520;->i:B

    iput-object p1, p0, La/z520;->k:La/h620;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/z520;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/z520;->k:La/h620;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/z520;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/z520;-><init>(La/h620;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/z520;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/z520;-><init>(La/h620;La/yje;B)V

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
    iget-byte v0, p0, La/z520;->i:B

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
    invoke-virtual {p0, p1, p2}, La/z520;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/z520;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/z520;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/z520;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/z520;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/z520;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/z520;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v0, La/z520;->k:La/h620;

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
    iget-byte v7, v0, La/z520;->j:B

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
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object/from16 v0, p1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object/from16 v2, p1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-byte v4, v0, La/z520;->j:B

    .line 45
    .line 46
    invoke-virtual {v3, v0}, La/h620;->z(La/zje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-ne v2, v1, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    :goto_0
    check-cast v2, La/ql5;

    .line 54
    .line 55
    iget-wide v6, v2, La/ql5;->e:J

    .line 56
    .line 57
    iget-object v2, v3, La/h620;->h:La/a6u;

    .line 58
    .line 59
    iput-byte v5, v0, La/z520;->j:B

    .line 60
    .line 61
    invoke-virtual {v2, v6, v7, v0}, La/a6u;->z(JLa/zje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-ne v0, v1, :cond_4

    .line 66
    .line 67
    :goto_1
    move-object v6, v1

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    :goto_2
    move-object v1, v0

    .line 70
    check-cast v1, La/vf7;

    .line 71
    .line 72
    iget-object v7, v3, La/h620;->i0:La/p7m0;

    .line 73
    .line 74
    :cond_5
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    move-object v8, v0

    .line 79
    check-cast v8, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 80
    .line 81
    new-instance v2, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;

    .line 82
    .line 83
    iget-boolean v3, v1, La/vf7;->g:Z

    .line 84
    .line 85
    iget-wide v4, v1, La/vf7;->b:D

    .line 86
    .line 87
    invoke-direct {v2, v4, v5, v3}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;-><init>(DZ)V

    .line 88
    .line 89
    .line 90
    const/16 v29, 0x0

    .line 91
    .line 92
    const v30, 0x3feff

    .line 93
    .line 94
    .line 95
    const-wide/16 v9, 0x0

    .line 96
    .line 97
    const-wide/16 v11, 0x0

    .line 98
    .line 99
    const-wide/16 v13, 0x0

    .line 100
    .line 101
    const-wide/16 v15, 0x0

    .line 102
    .line 103
    const-wide/16 v17, 0x0

    .line 104
    .line 105
    const/16 v19, 0x0

    .line 106
    .line 107
    const/16 v20, 0x0

    .line 108
    .line 109
    const/16 v21, 0x0

    .line 110
    .line 111
    const/16 v23, 0x0

    .line 112
    .line 113
    const/16 v24, 0x0

    .line 114
    .line 115
    const/16 v25, 0x0

    .line 116
    .line 117
    const/16 v26, 0x0

    .line 118
    .line 119
    const/16 v27, 0x0

    .line 120
    .line 121
    const/16 v28, 0x0

    .line 122
    .line 123
    move-object/from16 v22, v2

    .line 124
    .line 125
    invoke-static/range {v8 .. v30}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-virtual {v7, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_5

    .line 134
    .line 135
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    :goto_3
    return-object v6

    .line 138
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 139
    .line 140
    iget-byte v7, v0, La/z520;->j:B

    .line 141
    .line 142
    if-eqz v7, :cond_8

    .line 143
    .line 144
    if-eq v7, v4, :cond_7

    .line 145
    .line 146
    if-ne v7, v5, :cond_6

    .line 147
    .line 148
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v0, p1

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_8

    .line 158
    .line 159
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    move-object/from16 v2, p1

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iput-byte v4, v0, La/z520;->j:B

    .line 169
    .line 170
    invoke-virtual {v3, v0}, La/h620;->z(La/zje;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    if-ne v2, v1, :cond_9

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_9
    :goto_4
    check-cast v2, La/ql5;

    .line 178
    .line 179
    iget-wide v7, v2, La/ql5;->e:J

    .line 180
    .line 181
    iget-object v2, v3, La/h620;->h:La/a6u;

    .line 182
    .line 183
    iput-byte v5, v0, La/z520;->j:B

    .line 184
    .line 185
    invoke-virtual {v2, v7, v8, v0}, La/a6u;->z(JLa/zje;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-ne v0, v1, :cond_a

    .line 190
    .line 191
    :goto_5
    move-object v6, v1

    .line 192
    goto :goto_8

    .line 193
    :cond_a
    :goto_6
    check-cast v0, La/vf7;

    .line 194
    .line 195
    iget-object v1, v3, La/h620;->a0:La/bby;

    .line 196
    .line 197
    if-eqz v1, :cond_b

    .line 198
    .line 199
    invoke-interface {v1, v6}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 200
    .line 201
    .line 202
    :cond_b
    iget-object v1, v3, La/h620;->i0:La/p7m0;

    .line 203
    .line 204
    :cond_c
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    move-object v3, v2

    .line 209
    check-cast v3, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 210
    .line 211
    iget-wide v10, v0, La/vf7;->c:D

    .line 212
    .line 213
    iget-wide v4, v0, La/vf7;->b:D

    .line 214
    .line 215
    iget-boolean v15, v0, La/vf7;->h:Z

    .line 216
    .line 217
    if-eqz v15, :cond_d

    .line 218
    .line 219
    const-wide v6, 0x42a2309ce53ffffbL    # 9.99999999999999E12

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    move-wide v12, v6

    .line 225
    goto :goto_7

    .line 226
    :cond_d
    move-wide v12, v4

    .line 227
    :goto_7
    new-instance v6, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;

    .line 228
    .line 229
    iget-boolean v7, v0, La/vf7;->g:Z

    .line 230
    .line 231
    invoke-direct {v6, v4, v5, v7}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;-><init>(DZ)V

    .line 232
    .line 233
    .line 234
    iget-object v14, v0, La/vf7;->f:Ljava/lang/String;

    .line 235
    .line 236
    const/16 v24, 0x0

    .line 237
    .line 238
    const v25, 0x2fe87

    .line 239
    .line 240
    .line 241
    const-wide/16 v4, 0x0

    .line 242
    .line 243
    move-object/from16 v17, v6

    .line 244
    .line 245
    const-wide/16 v6, 0x0

    .line 246
    .line 247
    const-wide/16 v8, 0x0

    .line 248
    .line 249
    const/16 v16, 0x0

    .line 250
    .line 251
    const/16 v18, 0x0

    .line 252
    .line 253
    const/16 v19, 0x0

    .line 254
    .line 255
    const/16 v20, 0x0

    .line 256
    .line 257
    const/16 v21, 0x0

    .line 258
    .line 259
    const/16 v22, 0x0

    .line 260
    .line 261
    const/16 v23, 0x0

    .line 262
    .line 263
    invoke-static/range {v3 .. v25}, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a(Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;DDDDDLjava/lang/String;ZZLorg/xplatform/coupon/impl/make_bet/presentation/model/AutoMaxUiModel;ZZZZZZZI)Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-eqz v2, :cond_c

    .line 272
    .line 273
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 274
    .line 275
    :goto_8
    return-object v6

    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
