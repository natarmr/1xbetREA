.class public final La/x0g;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/g1g;


# direct methods
.method public synthetic constructor <init>(La/g1g;La/yje;B)V
    .locals 0

    .line 13
    iput-byte p3, p0, La/x0g;->i:B

    iput-object p1, p0, La/x0g;->k:La/g1g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/g1g;ZLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/x0g;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/x0g;->k:La/g1g;

    .line 5
    .line 6
    iput-boolean p2, p0, La/x0g;->j:Z

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/x0g;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/x0g;->k:La/g1g;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/x0g;

    .line 9
    .line 10
    const/4 p1, 0x4

    .line 11
    invoke-direct {p0, v1, p2, p1}, La/x0g;-><init>(La/g1g;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    new-instance p0, La/x0g;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p0, v1, p2, v0}, La/x0g;-><init>(La/g1g;La/yje;B)V

    .line 19
    .line 20
    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput-boolean p1, p0, La/x0g;->j:Z

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_1
    new-instance p1, La/x0g;

    .line 31
    .line 32
    iget-boolean p0, p0, La/x0g;->j:Z

    .line 33
    .line 34
    invoke-direct {p1, v1, p0, p2}, La/x0g;-><init>(La/g1g;ZLa/yje;)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_2
    new-instance p0, La/x0g;

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    invoke-direct {p0, v1, p2, p1}, La/x0g;-><init>(La/g1g;La/yje;B)V

    .line 42
    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_3
    new-instance p0, La/x0g;

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    invoke-direct {p0, v1, p2, p1}, La/x0g;-><init>(La/g1g;La/yje;B)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    nop

    .line 53
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
    iget-byte v0, p0, La/x0g;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/x0g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/x0g;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/x0g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/x0g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/x0g;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/x0g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/x0g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/x0g;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/x0g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/x0g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/x0g;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/x0g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_3
    check-cast p1, La/vne;

    .line 78
    .line 79
    check-cast p2, La/yje;

    .line 80
    .line 81
    invoke-virtual {p0, p1, p2}, La/x0g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/x0g;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/x0g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    nop

    .line 95
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
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/x0g;->i:B

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    iget-object v9, v5, La/x0g;->k:La/g1g;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v6, v5, La/x0g;->j:Z

    .line 18
    .line 19
    if-eqz v6, :cond_1

    .line 20
    .line 21
    if-ne v6, v4, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, v9, La/g1g;->d:La/mku;

    .line 37
    .line 38
    iget-object v1, v1, La/mku;->a:La/q430;

    .line 39
    .line 40
    iget-object v6, v1, La/q430;->a:La/eio;

    .line 41
    .line 42
    invoke-virtual {v6}, La/eio;->a()La/tt20;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    iget-object v6, v6, La/tt20;->a:La/zdg0;

    .line 47
    .line 48
    const-string v7, "market_filter"

    .line 49
    .line 50
    filled-new-array {v7}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    new-instance v8, La/sax;

    .line 55
    .line 56
    const/16 v10, 0x1c

    .line 57
    .line 58
    const/4 v11, 0x2

    .line 59
    invoke-direct {v8, v11, v2, v10}, La/sax;-><init>(ILa/yje;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {v6, v7, v8}, La/wwb;->C(La/zdg0;[Ljava/lang/String;Lkotlin/jvm/functions/Function2;)La/zj2;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    new-instance v7, La/m430;

    .line 67
    .line 68
    invoke-direct {v7, v6, v1, v3}, La/m430;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    iget-object v1, v9, La/g1g;->k:La/z8u;

    .line 72
    .line 73
    iget-object v1, v1, La/z8u;->a:La/m0o0;

    .line 74
    .line 75
    invoke-virtual {v1}, La/m0o0;->d()La/gmq;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v6, La/a1g;

    .line 80
    .line 81
    invoke-direct {v6, v1, v9, v4}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    iget-object v1, v9, La/g1g;->b:Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;

    .line 85
    .line 86
    iget-wide v12, v1, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->h:J

    .line 87
    .line 88
    const-wide/16 v14, 0x2

    .line 89
    .line 90
    cmp-long v1, v12, v14

    .line 91
    .line 92
    const/16 v8, 0xe

    .line 93
    .line 94
    if-nez v1, :cond_2

    .line 95
    .line 96
    iget-object v1, v9, La/g1g;->m:La/b8u;

    .line 97
    .line 98
    invoke-virtual {v1}, La/b8u;->d()La/p7m0;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    new-instance v10, La/i89;

    .line 103
    .line 104
    const/16 v12, 0xd

    .line 105
    .line 106
    invoke-direct {v10, v1, v12}, La/i89;-><init>(La/gmq;B)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    iget-object v1, v9, La/g1g;->l:La/sbu;

    .line 111
    .line 112
    iget-object v1, v1, La/sbu;->a:La/x5s;

    .line 113
    .line 114
    iget-object v1, v1, La/x5s;->a:La/i5s;

    .line 115
    .line 116
    iget-object v1, v1, La/i5s;->a:La/p7m0;

    .line 117
    .line 118
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    new-instance v10, La/i89;

    .line 123
    .line 124
    invoke-direct {v10, v1, v8}, La/i89;-><init>(La/gmq;B)V

    .line 125
    .line 126
    .line 127
    :goto_0
    iget-object v1, v9, La/g1g;->n:La/got;

    .line 128
    .line 129
    iget-object v1, v1, La/got;->a:La/hoo;

    .line 130
    .line 131
    iget-object v12, v1, La/hoo;->c:La/zr20;

    .line 132
    .line 133
    iget-object v12, v12, La/zr20;->b:La/p7m0;

    .line 134
    .line 135
    iget-object v13, v1, La/hoo;->b:La/n530;

    .line 136
    .line 137
    iget-object v13, v13, La/n530;->c:La/qoj0;

    .line 138
    .line 139
    new-instance v14, La/yno;

    .line 140
    .line 141
    const/4 v15, 0x3

    .line 142
    invoke-direct {v14, v15, v2, v3}, La/yno;-><init>(ILa/yje;B)V

    .line 143
    .line 144
    .line 145
    new-instance v8, La/p6d;

    .line 146
    .line 147
    invoke-direct {v8, v12, v13, v14, v4}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 148
    .line 149
    .line 150
    new-instance v12, La/zo1;

    .line 151
    .line 152
    const/16 v13, 0x11

    .line 153
    .line 154
    invoke-direct {v12, v2, v1, v13}, La/zo1;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 155
    .line 156
    .line 157
    invoke-static {v8, v12}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    new-instance v8, La/x0g;

    .line 162
    .line 163
    invoke-direct {v8, v9, v2, v15}, La/x0g;-><init>(La/g1g;La/yje;B)V

    .line 164
    .line 165
    .line 166
    new-instance v12, La/fnq;

    .line 167
    .line 168
    const/4 v13, 0x4

    .line 169
    invoke-direct {v12, v1, v8, v13}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 170
    .line 171
    .line 172
    iget-object v1, v9, La/g1g;->o:La/cmt;

    .line 173
    .line 174
    invoke-virtual {v1}, La/cmt;->a()La/p7m0;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    new-instance v8, La/y0g;

    .line 179
    .line 180
    invoke-direct {v8, v15, v2, v3}, La/y0g;-><init>(ILa/yje;B)V

    .line 181
    .line 182
    .line 183
    new-instance v14, La/p6d;

    .line 184
    .line 185
    invoke-direct {v14, v12, v1, v8, v4}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 186
    .line 187
    .line 188
    iget-object v1, v9, La/g1g;->s:La/xvf;

    .line 189
    .line 190
    iget-object v8, v1, La/xvf;->b:La/cmt;

    .line 191
    .line 192
    invoke-virtual {v8}, La/cmt;->a()La/p7m0;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    new-instance v12, La/a1t;

    .line 197
    .line 198
    move/from16 v16, v13

    .line 199
    .line 200
    const/4 v13, 0x6

    .line 201
    invoke-direct {v12, v8, v13}, La/a1t;-><init>(La/gmq;B)V

    .line 202
    .line 203
    .line 204
    invoke-static {v12}, La/i120;->W(La/gmq;)La/gmq;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    new-instance v12, La/sot;

    .line 209
    .line 210
    invoke-direct {v12, v2, v1, v11}, La/sot;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 211
    .line 212
    .line 213
    invoke-static {v8, v12}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    iget-object v8, v9, La/g1g;->q:La/b3c;

    .line 218
    .line 219
    iget-object v8, v8, La/b3c;->a:La/nvu;

    .line 220
    .line 221
    iget-object v8, v8, La/nvu;->b:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v8, La/g8n0;

    .line 224
    .line 225
    iget-object v8, v8, La/g8n0;->a:La/p7m0;

    .line 226
    .line 227
    invoke-static {v8}, La/vtb;->N(La/qz40;)La/xae0;

    .line 228
    .line 229
    .line 230
    move-result-object v8

    .line 231
    invoke-static {v8}, La/i120;->W(La/gmq;)La/gmq;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    new-instance v12, La/qaf0;

    .line 236
    .line 237
    move/from16 v17, v15

    .line 238
    .line 239
    const/16 v15, 0xe

    .line 240
    .line 241
    invoke-direct {v12, v8, v15}, La/qaf0;-><init>(La/gmq;B)V

    .line 242
    .line 243
    .line 244
    new-instance v8, La/a1g;

    .line 245
    .line 246
    invoke-direct {v8, v12, v9, v11}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 247
    .line 248
    .line 249
    new-array v12, v13, [La/gmq;

    .line 250
    .line 251
    aput-object v7, v12, v3

    .line 252
    .line 253
    aput-object v6, v12, v4

    .line 254
    .line 255
    aput-object v10, v12, v11

    .line 256
    .line 257
    aput-object v14, v12, v17

    .line 258
    .line 259
    aput-object v1, v12, v16

    .line 260
    .line 261
    const/4 v1, 0x5

    .line 262
    aput-object v8, v12, v1

    .line 263
    .line 264
    new-instance v6, La/a1g;

    .line 265
    .line 266
    invoke-direct {v6, v12, v9, v3}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 267
    .line 268
    .line 269
    new-instance v3, La/b1f;

    .line 270
    .line 271
    invoke-direct {v3, v9, v2, v1}, La/b1f;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 272
    .line 273
    .line 274
    iput-boolean v4, v5, La/x0g;->j:Z

    .line 275
    .line 276
    new-instance v1, La/vnq;

    .line 277
    .line 278
    sget-object v2, La/h660;->a:La/h660;

    .line 279
    .line 280
    invoke-direct {v1, v2, v3, v11}, La/vnq;-><init>(La/kmq;Lkotlin/jvm/functions/Function2;B)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v6, v1, v5}, La/a1g;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    if-ne v1, v0, :cond_3

    .line 288
    .line 289
    goto :goto_1

    .line 290
    :cond_3
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 291
    .line 292
    :goto_1
    if-ne v1, v0, :cond_4

    .line 293
    .line 294
    goto :goto_2

    .line 295
    :cond_4
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    :goto_2
    if-ne v1, v0, :cond_5

    .line 298
    .line 299
    move-object v2, v0

    .line 300
    goto :goto_4

    .line 301
    :cond_5
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    :goto_4
    return-object v2

    .line 304
    :pswitch_0
    iget-boolean v0, v5, La/x0g;->j:Z

    .line 305
    .line 306
    sget-object v1, La/wne;->a:La/wne;

    .line 307
    .line 308
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    iput-boolean v0, v9, La/g1g;->B:Z

    .line 312
    .line 313
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    return-object v0

    .line 316
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 317
    .line 318
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    iget-object v0, v9, La/g1g;->f:La/eyg0;

    .line 322
    .line 323
    iget-boolean v1, v5, La/x0g;->j:Z

    .line 324
    .line 325
    iget-object v0, v0, La/eyg0;->b:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, La/wrh;

    .line 328
    .line 329
    iget-object v0, v0, La/wrh;->a:La/h03;

    .line 330
    .line 331
    iget-object v0, v0, La/h03;->b:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v0, La/q7d0;

    .line 334
    .line 335
    const-string v2, "AUTO_STREAM_KEY"

    .line 336
    .line 337
    invoke-virtual {v0, v2, v1}, La/q7d0;->d(Ljava/lang/String;Z)V

    .line 338
    .line 339
    .line 340
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 341
    .line 342
    return-object v0

    .line 343
    :pswitch_2
    sget-object v10, La/wne;->a:La/wne;

    .line 344
    .line 345
    iget-boolean v0, v5, La/x0g;->j:Z

    .line 346
    .line 347
    if-eqz v0, :cond_7

    .line 348
    .line 349
    if-ne v0, v4, :cond_6

    .line 350
    .line 351
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    move-object/from16 v0, p1

    .line 355
    .line 356
    goto :goto_5

    .line 357
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    goto :goto_6

    .line 361
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    iget-object v0, v9, La/g1g;->i:La/njt0;

    .line 365
    .line 366
    iget-object v1, v9, La/g1g;->b:Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;

    .line 367
    .line 368
    iget-wide v6, v1, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->b:J

    .line 369
    .line 370
    iget-wide v11, v1, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->a:J

    .line 371
    .line 372
    iget-boolean v1, v1, Lorg/xplatform/cyber/game/core/presentation/action/CyberActionDialogParams;->c:Z

    .line 373
    .line 374
    iget-object v2, v9, La/g1g;->A:La/qoj0;

    .line 375
    .line 376
    invoke-virtual {v2}, La/qoj0;->d()Ljava/util/List;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    check-cast v2, La/q0g;

    .line 385
    .line 386
    if-eqz v2, :cond_8

    .line 387
    .line 388
    iget-boolean v3, v2, La/q0g;->j:Z

    .line 389
    .line 390
    :cond_8
    iput-boolean v4, v5, La/x0g;->j:Z

    .line 391
    .line 392
    const/4 v8, 0x0

    .line 393
    move-wide/from16 v18, v6

    .line 394
    .line 395
    move v6, v1

    .line 396
    move-wide/from16 v1, v18

    .line 397
    .line 398
    move v7, v3

    .line 399
    move-wide v3, v11

    .line 400
    invoke-virtual/range {v0 .. v8}, La/njt0;->a(JJLa/zje;ZZZ)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    if-ne v0, v10, :cond_9

    .line 405
    .line 406
    move-object v2, v10

    .line 407
    goto :goto_6

    .line 408
    :cond_9
    :goto_5
    check-cast v0, La/sjt0;

    .line 409
    .line 410
    instance-of v1, v0, La/ojt0;

    .line 411
    .line 412
    if-eqz v1, :cond_a

    .line 413
    .line 414
    check-cast v0, La/ojt0;

    .line 415
    .line 416
    iget-boolean v0, v0, La/ojt0;->a:Z

    .line 417
    .line 418
    if-eqz v0, :cond_a

    .line 419
    .line 420
    iget-object v0, v9, La/g1g;->z:La/ol60;

    .line 421
    .line 422
    sget-object v1, La/v9o;->a:La/v9o;

    .line 423
    .line 424
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    :cond_a
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 428
    .line 429
    :goto_6
    return-object v2

    .line 430
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 431
    .line 432
    iget-boolean v3, v5, La/x0g;->j:Z

    .line 433
    .line 434
    if-eqz v3, :cond_c

    .line 435
    .line 436
    if-ne v3, v4, :cond_b

    .line 437
    .line 438
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    goto :goto_8

    .line 442
    :cond_b
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    goto :goto_9

    .line 446
    :cond_c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    iget-object v1, v9, La/g1g;->p:La/rrc;

    .line 450
    .line 451
    iput-boolean v4, v5, La/x0g;->j:Z

    .line 452
    .line 453
    iget-object v1, v1, La/rrc;->b:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v1, La/hoo;

    .line 456
    .line 457
    invoke-virtual {v1, v5}, La/hoo;->b(La/zje;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    if-ne v1, v0, :cond_d

    .line 462
    .line 463
    goto :goto_7

    .line 464
    :cond_d
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 465
    .line 466
    :goto_7
    if-ne v1, v0, :cond_e

    .line 467
    .line 468
    move-object v2, v0

    .line 469
    goto :goto_9

    .line 470
    :cond_e
    :goto_8
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 471
    .line 472
    :goto_9
    return-object v2

    .line 473
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
