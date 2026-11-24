.class public final La/tk20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ln20;


# direct methods
.method public synthetic constructor <init>(La/ln20;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/tk20;->i:B

    iput-object p1, p0, La/tk20;->k:La/ln20;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tk20;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/tk20;->k:La/ln20;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/tk20;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/tk20;-><init>(La/ln20;La/yje;B)V

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
    iput-boolean p0, v0, La/tk20;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance v0, La/tk20;

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    invoke-direct {v0, p0, p2, v1}, La/tk20;-><init>(La/ln20;La/yje;B)V

    .line 27
    .line 28
    .line 29
    check-cast p1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    iput-boolean p0, v0, La/tk20;->j:Z

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    new-instance v0, La/tk20;

    .line 39
    .line 40
    const/4 v1, 0x2

    .line 41
    invoke-direct {v0, p0, p2, v1}, La/tk20;-><init>(La/ln20;La/yje;B)V

    .line 42
    .line 43
    .line 44
    check-cast p1, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    iput-boolean p0, v0, La/tk20;->j:Z

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_2
    new-instance p1, La/tk20;

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    invoke-direct {p1, p0, p2, v0}, La/tk20;-><init>(La/ln20;La/yje;B)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_3
    new-instance p1, La/tk20;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-direct {p1, p0, p2, v0}, La/tk20;-><init>(La/ln20;La/yje;B)V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/tk20;->i:B

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
    invoke-virtual {p0, p1, p2}, La/tk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/tk20;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/tk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    check-cast p2, La/yje;

    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, La/tk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, La/tk20;

    .line 38
    .line 39
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, La/tk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    check-cast p2, La/yje;

    .line 52
    .line 53
    invoke-virtual {p0, p1, p2}, La/tk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, La/tk20;

    .line 58
    .line 59
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, La/tk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_2
    check-cast p1, La/vne;

    .line 67
    .line 68
    check-cast p2, La/yje;

    .line 69
    .line 70
    invoke-virtual {p0, p1, p2}, La/tk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/tk20;

    .line 75
    .line 76
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    invoke-virtual {p0, p1}, La/tk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_3
    check-cast p1, La/vne;

    .line 84
    .line 85
    check-cast p2, La/yje;

    .line 86
    .line 87
    invoke-virtual {p0, p1, p2}, La/tk20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, La/tk20;

    .line 92
    .line 93
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, La/tk20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget-byte v0, v7, La/tk20;->i:B

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    iget-object v4, v7, La/tk20;->k:La/ln20;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v11, v7, La/tk20;->j:Z

    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    sget v0, La/ln20;->o0:I

    .line 22
    .line 23
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 24
    .line 25
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-object v5, v1

    .line 35
    check-cast v5, La/sg20;

    .line 36
    .line 37
    const/4 v14, 0x0

    .line 38
    const/16 v15, 0x77f

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x0

    .line 45
    const/4 v12, 0x0

    .line 46
    const/4 v13, 0x0

    .line 47
    invoke-static/range {v5 .. v15}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    if-eqz v11, :cond_1

    .line 58
    .line 59
    invoke-virtual {v4}, La/ln20;->c0()V

    .line 60
    .line 61
    .line 62
    :cond_1
    new-instance v0, La/eh20;

    .line 63
    .line 64
    const/4 v1, 0x5

    .line 65
    invoke-direct {v0, v4, v1}, La/eh20;-><init>(La/ln20;B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_0
    iget-boolean v0, v7, La/tk20;->j:Z

    .line 75
    .line 76
    sget-object v1, La/wne;->a:La/wne;

    .line 77
    .line 78
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    sget v1, La/ln20;->o0:I

    .line 84
    .line 85
    iget-object v1, v4, La/i3t0;->i:La/ocj;

    .line 86
    .line 87
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 88
    .line 89
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-object v5, v2

    .line 97
    check-cast v5, La/sg20;

    .line 98
    .line 99
    iget-object v6, v5, La/sg20;->f:La/ifc0;

    .line 100
    .line 101
    sget-object v7, La/wyc0;->a:La/wyc0;

    .line 102
    .line 103
    const/4 v12, 0x0

    .line 104
    const/16 v13, 0x7d

    .line 105
    .line 106
    const/4 v7, 0x0

    .line 107
    const/4 v8, 0x0

    .line 108
    const/4 v9, 0x0

    .line 109
    const/4 v10, 0x0

    .line 110
    const/4 v11, 0x0

    .line 111
    invoke-static/range {v6 .. v13}, La/ifc0;->a(La/ifc0;La/azc0;La/plc0;ZZZZI)La/ifc0;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    const/4 v14, 0x0

    .line 116
    const/16 v15, 0x7df

    .line 117
    .line 118
    const/4 v6, 0x0

    .line 119
    const/4 v9, 0x0

    .line 120
    const/4 v13, 0x0

    .line 121
    invoke-static/range {v5 .. v15}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {v1, v2, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_2

    .line 130
    .line 131
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    iget-object v1, v4, La/ln20;->E:La/mne;

    .line 136
    .line 137
    iget-object v8, v1, La/mne;->b:La/dvj;

    .line 138
    .line 139
    new-instance v6, La/mh20;

    .line 140
    .line 141
    const/4 v1, 0x2

    .line 142
    invoke-direct {v6, v4, v1}, La/mh20;-><init>(La/ln20;B)V

    .line 143
    .line 144
    .line 145
    new-instance v9, La/e3p;

    .line 146
    .line 147
    const/16 v1, 0x11

    .line 148
    .line 149
    invoke-direct {v9, v4, v3, v1}, La/e3p;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 150
    .line 151
    .line 152
    const/16 v10, 0xa

    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 156
    .line 157
    .line 158
    :cond_3
    new-instance v1, La/obg;

    .line 159
    .line 160
    const/16 v2, 0x16

    .line 161
    .line 162
    invoke-direct {v1, v2, v0}, La/obg;-><init>(BZ)V

    .line 163
    .line 164
    .line 165
    sget v0, La/ln20;->o0:I

    .line 166
    .line 167
    invoke-virtual {v4, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 168
    .line 169
    .line 170
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_1
    iget-boolean v0, v7, La/tk20;->j:Z

    .line 174
    .line 175
    sget-object v1, La/wne;->a:La/wne;

    .line 176
    .line 177
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    check-cast v1, La/sg20;

    .line 185
    .line 186
    iget-object v1, v1, La/sg20;->b:La/ky6;

    .line 187
    .line 188
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    check-cast v1, La/sg20;

    .line 193
    .line 194
    iget-object v1, v1, La/sg20;->b:La/ky6;

    .line 195
    .line 196
    iget-object v1, v1, La/ky6;->b:La/iur;

    .line 197
    .line 198
    iget-wide v1, v1, La/iur;->f:D

    .line 199
    .line 200
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    check-cast v3, La/sg20;

    .line 205
    .line 206
    iget-object v3, v3, La/sg20;->b:La/ky6;

    .line 207
    .line 208
    iget-object v3, v3, La/ky6;->b:La/iur;

    .line 209
    .line 210
    iget-wide v5, v3, La/iur;->e:D

    .line 211
    .line 212
    invoke-static {v1, v2, v5, v6}, La/ln20;->O(DD)La/bzc;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast v2, La/sg20;

    .line 221
    .line 222
    iget-object v2, v2, La/sg20;->f:La/ifc0;

    .line 223
    .line 224
    iget-object v2, v2, La/ifc0;->a:La/azc0;

    .line 225
    .line 226
    iget-object v2, v2, La/azc0;->a:La/pz40;

    .line 227
    .line 228
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    check-cast v2, Ljava/lang/String;

    .line 233
    .line 234
    if-nez v2, :cond_4

    .line 235
    .line 236
    const-string v2, ""

    .line 237
    .line 238
    :cond_4
    new-instance v3, La/q2n;

    .line 239
    .line 240
    const/16 v5, 0xa

    .line 241
    .line 242
    invoke-direct {v3, v0, v2, v1, v5}, La/q2n;-><init>(ZLjava/lang/Object;Ljava/lang/Object;B)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 246
    .line 247
    .line 248
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object v0

    .line 251
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 252
    .line 253
    iget-boolean v5, v7, La/tk20;->j:Z

    .line 254
    .line 255
    if-eqz v5, :cond_6

    .line 256
    .line 257
    if-ne v5, v2, :cond_5

    .line 258
    .line 259
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    move-object/from16 v1, p1

    .line 263
    .line 264
    goto :goto_0

    .line 265
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    goto :goto_1

    .line 269
    :cond_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    iget-object v1, v4, La/ln20;->v:La/mrt;

    .line 273
    .line 274
    iput-boolean v2, v7, La/tk20;->j:Z

    .line 275
    .line 276
    invoke-virtual {v1, v7}, La/mrt;->a(La/zje;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    if-ne v1, v0, :cond_7

    .line 281
    .line 282
    move-object v3, v0

    .line 283
    goto :goto_1

    .line 284
    :cond_7
    :goto_0
    check-cast v1, Ljava/lang/Boolean;

    .line 285
    .line 286
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 287
    .line 288
    .line 289
    move-result v8

    .line 290
    sget v0, La/ln20;->o0:I

    .line 291
    .line 292
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 293
    .line 294
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 295
    .line 296
    :cond_8
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-object v2, v1

    .line 304
    check-cast v2, La/sg20;

    .line 305
    .line 306
    iget-object v5, v2, La/sg20;->f:La/ifc0;

    .line 307
    .line 308
    const/4 v11, 0x0

    .line 309
    const/16 v12, 0x77

    .line 310
    .line 311
    const/4 v6, 0x0

    .line 312
    const/4 v7, 0x0

    .line 313
    const/4 v9, 0x0

    .line 314
    const/4 v10, 0x0

    .line 315
    invoke-static/range {v5 .. v12}, La/ifc0;->a(La/ifc0;La/azc0;La/plc0;ZZZZI)La/ifc0;

    .line 316
    .line 317
    .line 318
    move-result-object v14

    .line 319
    const/16 v18, 0x0

    .line 320
    .line 321
    const/16 v19, 0x7df

    .line 322
    .line 323
    const/4 v10, 0x0

    .line 324
    const/4 v11, 0x0

    .line 325
    const/4 v12, 0x0

    .line 326
    const/4 v13, 0x0

    .line 327
    const/4 v15, 0x0

    .line 328
    const/16 v16, 0x0

    .line 329
    .line 330
    const/16 v17, 0x0

    .line 331
    .line 332
    move-object v9, v2

    .line 333
    invoke-static/range {v9 .. v19}, La/sg20;->a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-eqz v1, :cond_8

    .line 342
    .line 343
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    :goto_1
    return-object v3

    .line 346
    :pswitch_3
    sget-object v8, La/wne;->a:La/wne;

    .line 347
    .line 348
    iget-boolean v0, v7, La/tk20;->j:Z

    .line 349
    .line 350
    if-eqz v0, :cond_a

    .line 351
    .line 352
    if-ne v0, v2, :cond_9

    .line 353
    .line 354
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    goto :goto_2

    .line 358
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    goto :goto_3

    .line 362
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    sget v0, La/ln20;->o0:I

    .line 366
    .line 367
    iget-object v0, v7, La/tk20;->k:La/ln20;

    .line 368
    .line 369
    iget-object v1, v0, La/ln20;->m0:La/bby;

    .line 370
    .line 371
    if-eqz v1, :cond_b

    .line 372
    .line 373
    invoke-interface {v1, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 374
    .line 375
    .line 376
    :cond_b
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 377
    .line 378
    .line 379
    move-result-object v9

    .line 380
    iget-object v1, v0, La/ln20;->E:La/mne;

    .line 381
    .line 382
    iget-object v13, v1, La/mne;->a:La/rwj;

    .line 383
    .line 384
    sget-object v14, La/um20;->a:La/um20;

    .line 385
    .line 386
    new-instance v15, La/nm20;

    .line 387
    .line 388
    invoke-direct {v15, v0, v3, v2}, La/nm20;-><init>(La/ln20;La/yje;B)V

    .line 389
    .line 390
    .line 391
    const/16 v16, 0x20

    .line 392
    .line 393
    const-wide/16 v10, 0x1f4

    .line 394
    .line 395
    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 396
    .line 397
    invoke-static/range {v9 .. v16}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    iput-object v1, v0, La/ln20;->m0:La/bby;

    .line 402
    .line 403
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    check-cast v1, La/sg20;

    .line 408
    .line 409
    iget-object v1, v1, La/sg20;->e:La/qvj0;

    .line 410
    .line 411
    iget-object v1, v1, La/qvj0;->a:La/cx6;

    .line 412
    .line 413
    iget-object v1, v1, La/cx6;->b:La/uw6;

    .line 414
    .line 415
    iget-wide v3, v1, La/uw6;->a:D

    .line 416
    .line 417
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    check-cast v1, La/sg20;

    .line 422
    .line 423
    iget-object v1, v1, La/sg20;->e:La/qvj0;

    .line 424
    .line 425
    iget-object v1, v1, La/qvj0;->d:La/d0d;

    .line 426
    .line 427
    iget-wide v5, v1, La/d0d;->a:D

    .line 428
    .line 429
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    check-cast v1, La/sg20;

    .line 434
    .line 435
    iget-object v1, v1, La/sg20;->e:La/qvj0;

    .line 436
    .line 437
    iget-object v1, v1, La/qvj0;->a:La/cx6;

    .line 438
    .line 439
    iget-object v1, v1, La/cx6;->b:La/uw6;

    .line 440
    .line 441
    iget-object v1, v1, La/uw6;->e:Ljava/lang/String;

    .line 442
    .line 443
    move-wide v9, v3

    .line 444
    move-wide v3, v5

    .line 445
    new-instance v6, La/p0z;

    .line 446
    .line 447
    const/4 v5, 0x7

    .line 448
    invoke-direct {v6, v0, v5}, La/p0z;-><init>(Ljava/lang/Object;B)V

    .line 449
    .line 450
    .line 451
    iput-boolean v2, v7, La/tk20;->j:Z

    .line 452
    .line 453
    move-object v5, v1

    .line 454
    move-wide v1, v9

    .line 455
    invoke-virtual/range {v0 .. v7}, La/ln20;->N(DDLjava/lang/String;La/p0z;La/zje;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    if-ne v0, v8, :cond_c

    .line 460
    .line 461
    move-object v3, v8

    .line 462
    goto :goto_3

    .line 463
    :cond_c
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 464
    .line 465
    :goto_3
    return-object v3

    .line 466
    nop

    .line 467
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
