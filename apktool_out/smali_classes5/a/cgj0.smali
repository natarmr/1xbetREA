.class public final La/cgj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ngj0;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(La/ngj0;ZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/cgj0;->i:B

    iput-object p1, p0, La/cgj0;->k:La/ngj0;

    iput-boolean p2, p0, La/cgj0;->l:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/cgj0;->i:B

    .line 2
    .line 3
    iget-boolean v0, p0, La/cgj0;->l:Z

    .line 4
    .line 5
    iget-object p0, p0, La/cgj0;->k:La/ngj0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/cgj0;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/cgj0;-><init>(La/ngj0;ZLa/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/cgj0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/cgj0;-><init>(La/ngj0;ZLa/yje;B)V

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
    iget-byte v0, p0, La/cgj0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/cgj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/cgj0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/cgj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/cgj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/cgj0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/cgj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cgj0;->i:B

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
    iget-boolean v5, v0, La/cgj0;->j:Z

    .line 15
    .line 16
    iget-object v7, v0, La/cgj0;->k:La/ngj0;

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
    iget-object v2, v7, La/ngj0;->u:La/ahu;

    .line 36
    .line 37
    iput-boolean v4, v0, La/cgj0;->j:Z

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
    sget v1, La/ngj0;->Y0:I

    .line 52
    .line 53
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v2, v7, La/ngj0;->I:La/mne;

    .line 58
    .line 59
    iget-object v13, v2, La/mne;->b:La/dvj;

    .line 60
    .line 61
    new-instance v2, La/tfj0;

    .line 62
    .line 63
    const/16 v3, 0x8

    .line 64
    .line 65
    invoke-direct {v2, v7, v3}, La/tfj0;-><init>(La/ngj0;B)V

    .line 66
    .line 67
    .line 68
    new-instance v14, La/yfj0;

    .line 69
    .line 70
    const/4 v11, 0x0

    .line 71
    iget-boolean v10, v0, La/cgj0;->l:Z

    .line 72
    .line 73
    move-object v6, v14

    .line 74
    invoke-direct/range {v6 .. v11}, La/yfj0;-><init>(La/ngj0;JZLa/yje;)V

    .line 75
    .line 76
    .line 77
    const/16 v15, 0xa

    .line 78
    .line 79
    const/4 v12, 0x0

    .line 80
    move-object v10, v1

    .line 81
    move-object v11, v2

    .line 82
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 83
    .line 84
    .line 85
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    :goto_1
    return-object v2

    .line 88
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 89
    .line 90
    iget-boolean v5, v0, La/cgj0;->j:Z

    .line 91
    .line 92
    const/4 v6, 0x0

    .line 93
    iget-object v8, v0, La/cgj0;->k:La/ngj0;

    .line 94
    .line 95
    if-eqz v5, :cond_4

    .line 96
    .line 97
    if-ne v5, v4, :cond_3

    .line 98
    .line 99
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move-object/from16 v2, p1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_4

    .line 109
    .line 110
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v2, v8, La/ngj0;->F0:La/nhf0;

    .line 114
    .line 115
    iput-boolean v4, v0, La/cgj0;->j:Z

    .line 116
    .line 117
    invoke-virtual {v2, v6, v4, v0}, La/nhf0;->f(ZZLa/yje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    if-ne v2, v1, :cond_5

    .line 122
    .line 123
    move-object v2, v1

    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :cond_5
    :goto_2
    check-cast v2, La/gm3;

    .line 127
    .line 128
    iget-object v9, v2, La/gm3;->a:Ljava/lang/String;

    .line 129
    .line 130
    iget-boolean v10, v2, La/gm3;->b:Z

    .line 131
    .line 132
    iget-object v11, v2, La/gm3;->c:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    const/16 v2, 0x11

    .line 139
    .line 140
    iget-boolean v0, v0, La/cgj0;->l:Z

    .line 141
    .line 142
    if-lez v1, :cond_6

    .line 143
    .line 144
    sget v1, La/ngj0;->Y0:I

    .line 145
    .line 146
    new-instance v1, La/cxi0;

    .line 147
    .line 148
    invoke-direct {v1, v2, v4}, La/cxi0;-><init>(BZ)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v8, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 152
    .line 153
    .line 154
    if-eqz v0, :cond_9

    .line 155
    .line 156
    iget-object v0, v8, La/ngj0;->B:La/i1w0;

    .line 157
    .line 158
    new-instance v7, La/t13;

    .line 159
    .line 160
    const/16 v12, 0x18

    .line 161
    .line 162
    invoke-direct/range {v7 .. v12}, La/t13;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;B)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v7}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_6
    if-eqz v0, :cond_7

    .line 170
    .line 171
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, La/pfj0;

    .line 176
    .line 177
    iget-boolean v0, v0, La/pfj0;->P:Z

    .line 178
    .line 179
    if-eqz v0, :cond_7

    .line 180
    .line 181
    invoke-virtual {v8}, La/ngj0;->W()V

    .line 182
    .line 183
    .line 184
    new-instance v0, La/mej0;

    .line 185
    .line 186
    const/16 v1, 0x1d

    .line 187
    .line 188
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v8, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    :cond_7
    sget v0, La/ngj0;->Y0:I

    .line 195
    .line 196
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 197
    .line 198
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 199
    .line 200
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-object v9, v1

    .line 208
    check-cast v9, La/pfj0;

    .line 209
    .line 210
    const/16 v40, -0x1

    .line 211
    .line 212
    const v41, 0xeffff

    .line 213
    .line 214
    .line 215
    const/4 v10, 0x0

    .line 216
    const/4 v11, 0x0

    .line 217
    const/4 v12, 0x0

    .line 218
    const/4 v13, 0x0

    .line 219
    const/4 v14, 0x0

    .line 220
    const/4 v15, 0x0

    .line 221
    const/16 v16, 0x0

    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    const/16 v18, 0x0

    .line 226
    .line 227
    const/16 v19, 0x0

    .line 228
    .line 229
    const/16 v20, 0x0

    .line 230
    .line 231
    const/16 v21, 0x0

    .line 232
    .line 233
    const/16 v22, 0x0

    .line 234
    .line 235
    const/16 v23, 0x0

    .line 236
    .line 237
    const/16 v24, 0x0

    .line 238
    .line 239
    const/16 v25, 0x0

    .line 240
    .line 241
    const/16 v26, 0x0

    .line 242
    .line 243
    const/16 v27, 0x0

    .line 244
    .line 245
    const/16 v28, 0x0

    .line 246
    .line 247
    const/16 v29, 0x0

    .line 248
    .line 249
    const/16 v30, 0x0

    .line 250
    .line 251
    const/16 v31, 0x0

    .line 252
    .line 253
    const/16 v32, 0x0

    .line 254
    .line 255
    const/16 v33, 0x0

    .line 256
    .line 257
    const/16 v34, 0x0

    .line 258
    .line 259
    const/16 v35, 0x0

    .line 260
    .line 261
    const/16 v36, 0x0

    .line 262
    .line 263
    const/16 v37, 0x0

    .line 264
    .line 265
    const/16 v38, 0x1

    .line 266
    .line 267
    const/16 v39, 0x0

    .line 268
    .line 269
    invoke-static/range {v9 .. v41}, La/pfj0;->a(La/pfj0;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/j6d0;ZZLa/jph0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZIZZIII)La/pfj0;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-eqz v1, :cond_8

    .line 278
    .line 279
    new-instance v0, La/cxi0;

    .line 280
    .line 281
    invoke-direct {v0, v2, v6}, La/cxi0;-><init>(BZ)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v8, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 285
    .line 286
    .line 287
    :cond_9
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    :goto_4
    return-object v2

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
