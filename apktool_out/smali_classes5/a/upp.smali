.class public final La/upp;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Ljava/lang/Object;

.field public k:J

.field public l:B

.field public m:Ljava/lang/Object;

.field public final synthetic n:J

.field public o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/tpe0;JJLa/yje;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/upp;->i:B

    .line 17
    iput-object p1, p0, La/upp;->p:Ljava/lang/Object;

    iput-wide p2, p0, La/upp;->k:J

    iput-wide p4, p0, La/upp;->n:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/tzi;JLa/sip;JLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/upp;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/upp;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p2, p0, La/upp;->k:J

    .line 7
    .line 8
    iput-object p4, p0, La/upp;->p:Ljava/lang/Object;

    .line 9
    .line 10
    iput-wide p5, p0, La/upp;->n:J

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Enum;JLa/yje;B)V
    .locals 0

    .line 18
    iput-byte p6, p0, La/upp;->i:B

    iput-object p1, p0, La/upp;->o:Ljava/lang/Object;

    iput-object p2, p0, La/upp;->p:Ljava/lang/Object;

    iput-wide p3, p0, La/upp;->n:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    iget-byte v0, p0, La/upp;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/upp;->p:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/upp;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, La/tpe0;

    .line 12
    .line 13
    iget-wide v4, p0, La/upp;->k:J

    .line 14
    .line 15
    iget-wide v6, p0, La/upp;->n:J

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v2 .. v8}, La/upp;-><init>(La/tpe0;JJLa/yje;)V

    .line 19
    .line 20
    .line 21
    return-object v2

    .line 22
    :pswitch_0
    move-object v8, p2

    .line 23
    new-instance v3, La/upp;

    .line 24
    .line 25
    iget-object p1, p0, La/upp;->o:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v4, p1

    .line 28
    check-cast v4, La/f1v;

    .line 29
    .line 30
    move-object v5, v1

    .line 31
    check-cast v5, La/jvn;

    .line 32
    .line 33
    iget-wide v6, p0, La/upp;->n:J

    .line 34
    .line 35
    const/4 v9, 0x2

    .line 36
    invoke-direct/range {v3 .. v9}, La/upp;-><init>(Ljava/lang/Object;Ljava/lang/Enum;JLa/yje;B)V

    .line 37
    .line 38
    .line 39
    return-object v3

    .line 40
    :pswitch_1
    move-object v8, p2

    .line 41
    new-instance v3, La/upp;

    .line 42
    .line 43
    iget-object p2, p0, La/upp;->o:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v4, p2

    .line 46
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 47
    .line 48
    move-object v5, v1

    .line 49
    check-cast v5, Ljava/util/concurrent/TimeUnit;

    .line 50
    .line 51
    iget-wide v6, p0, La/upp;->n:J

    .line 52
    .line 53
    const/4 v9, 0x1

    .line 54
    invoke-direct/range {v3 .. v9}, La/upp;-><init>(Ljava/lang/Object;Ljava/lang/Enum;JLa/yje;B)V

    .line 55
    .line 56
    .line 57
    iput-object p1, v3, La/upp;->m:Ljava/lang/Object;

    .line 58
    .line 59
    return-object v3

    .line 60
    :pswitch_2
    move-object v8, p2

    .line 61
    new-instance v3, La/upp;

    .line 62
    .line 63
    iget-object p2, p0, La/upp;->o:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v4, p2

    .line 66
    check-cast v4, La/tzi;

    .line 67
    .line 68
    iget-wide v5, p0, La/upp;->k:J

    .line 69
    .line 70
    move-object v7, v1

    .line 71
    check-cast v7, La/sip;

    .line 72
    .line 73
    iget-wide v0, p0, La/upp;->n:J

    .line 74
    .line 75
    move-object v10, v8

    .line 76
    move-wide v8, v0

    .line 77
    invoke-direct/range {v3 .. v10}, La/upp;-><init>(La/tzi;JLa/sip;JLa/yje;)V

    .line 78
    .line 79
    .line 80
    iput-object p1, v3, La/upp;->m:Ljava/lang/Object;

    .line 81
    .line 82
    return-object v3

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/upp;->i:B

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
    invoke-virtual {p0, p1, p2}, La/upp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/upp;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/upp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    check-cast p2, La/yje;

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1, p2}, La/upp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/upp;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/upp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, La/kmq;

    .line 49
    .line 50
    check-cast p2, La/yje;

    .line 51
    .line 52
    invoke-virtual {p0, p1, p2}, La/upp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/upp;

    .line 57
    .line 58
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, La/upp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_2
    check-cast p1, La/kmq;

    .line 66
    .line 67
    check-cast p2, La/yje;

    .line 68
    .line 69
    invoke-virtual {p0, p1, p2}, La/upp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/upp;

    .line 74
    .line 75
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, La/upp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-byte v0, v6, La/upp;->i:B

    .line 4
    .line 5
    iget-wide v1, v6, La/upp;->n:J

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    iget-object v4, v6, La/upp;->p:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v7, 0x2

    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-wide v9, v6, La/upp;->k:J

    .line 18
    .line 19
    check-cast v4, La/tpe0;

    .line 20
    .line 21
    sget-object v0, La/wne;->a:La/wne;

    .line 22
    .line 23
    iget-byte v11, v6, La/upp;->l:B

    .line 24
    .line 25
    if-eqz v11, :cond_2

    .line 26
    .line 27
    if-eq v11, v5, :cond_1

    .line 28
    .line 29
    if-ne v11, v7, :cond_0

    .line 30
    .line 31
    iget-object v0, v6, La/upp;->o:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, v6, La/upp;->m:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, La/rne0;

    .line 38
    .line 39
    iget-object v4, v6, La/upp;->j:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v4, La/qz40;

    .line 42
    .line 43
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object v11, v4

    .line 47
    move-object/from16 v4, p1

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_1
    iget-object v3, v6, La/upp;->m:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, La/rne0;

    .line 57
    .line 58
    iget-object v11, v6, La/upp;->j:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v11, La/qz40;

    .line 61
    .line 62
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v12, p1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v3, v4, La/tpe0;->i:La/p7m0;

    .line 72
    .line 73
    iget-object v11, v4, La/tpe0;->e:La/rne0;

    .line 74
    .line 75
    iget-object v12, v4, La/tpe0;->c:La/abu;

    .line 76
    .line 77
    iput-object v3, v6, La/upp;->j:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object v11, v6, La/upp;->m:Ljava/lang/Object;

    .line 80
    .line 81
    iput-byte v5, v6, La/upp;->l:B

    .line 82
    .line 83
    invoke-virtual {v12, v6}, La/abu;->w(La/zje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v12

    .line 87
    if-ne v12, v0, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    move-object/from16 v17, v11

    .line 91
    .line 92
    move-object v11, v3

    .line 93
    move-object/from16 v3, v17

    .line 94
    .line 95
    :goto_0
    check-cast v12, Ljava/lang/String;

    .line 96
    .line 97
    iget-object v4, v4, La/tpe0;->b:La/hnu;

    .line 98
    .line 99
    const-wide/16 v15, 0x3e8

    .line 100
    .line 101
    div-long v13, v9, v15

    .line 102
    .line 103
    long-to-int v13, v13

    .line 104
    div-long v14, v1, v15

    .line 105
    .line 106
    long-to-int v14, v14

    .line 107
    iput-object v11, v6, La/upp;->j:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v3, v6, La/upp;->m:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v12, v6, La/upp;->o:Ljava/lang/Object;

    .line 112
    .line 113
    iput-byte v7, v6, La/upp;->l:B

    .line 114
    .line 115
    iget-object v4, v4, La/hnu;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v4, La/z220;

    .line 118
    .line 119
    invoke-virtual {v4, v13, v14, v6}, La/z220;->r(IILa/zje;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    if-ne v4, v0, :cond_4

    .line 124
    .line 125
    :goto_1
    move-object v8, v0

    .line 126
    goto :goto_3

    .line 127
    :cond_4
    move-object v0, v12

    .line 128
    :goto_2
    check-cast v4, Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;

    .line 129
    .line 130
    new-array v6, v7, [J

    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    aput-wide v9, v6, v7

    .line 134
    .line 135
    aput-wide v1, v6, v5

    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {v0, v4, v6}, La/rne0;->a(Ljava/lang/String;Lorg/xplatform/referral/api/domain/model/ReferralNetworkInfo;[J)La/une0;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v1, La/xpe0;

    .line 145
    .line 146
    invoke-direct {v1, v0}, La/xpe0;-><init>(La/une0;)V

    .line 147
    .line 148
    .line 149
    check-cast v11, La/p7m0;

    .line 150
    .line 151
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v11, v8, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    :goto_3
    return-object v8

    .line 160
    :pswitch_0
    sget-object v9, La/wne;->a:La/wne;

    .line 161
    .line 162
    iget-byte v0, v6, La/upp;->l:B

    .line 163
    .line 164
    if-eqz v0, :cond_7

    .line 165
    .line 166
    if-eq v0, v5, :cond_6

    .line 167
    .line 168
    if-ne v0, v7, :cond_5

    .line 169
    .line 170
    iget-object v0, v6, La/upp;->j:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, La/jvn;

    .line 173
    .line 174
    check-cast v0, La/f1v;

    .line 175
    .line 176
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    .line 178
    .line 179
    move-object/from16 v0, p1

    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_6
    iget-wide v1, v6, La/upp;->k:J

    .line 187
    .line 188
    iget-object v0, v6, La/upp;->m:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, La/w5z;

    .line 191
    .line 192
    iget-object v3, v6, La/upp;->j:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v3, La/jvn;

    .line 195
    .line 196
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 197
    .line 198
    .line 199
    move-object v4, v0

    .line 200
    move-object/from16 v0, p1

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    iget-object v0, v6, La/upp;->o:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, La/f1v;

    .line 209
    .line 210
    move-object v3, v4

    .line 211
    check-cast v3, La/jvn;

    .line 212
    .line 213
    :try_start_2
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 214
    .line 215
    iget-object v4, v0, La/f1v;->a:La/w5z;

    .line 216
    .line 217
    iput-object v3, v6, La/upp;->j:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v4, v6, La/upp;->m:Ljava/lang/Object;

    .line 220
    .line 221
    iput-wide v1, v6, La/upp;->k:J

    .line 222
    .line 223
    iput-byte v5, v6, La/upp;->l:B

    .line 224
    .line 225
    invoke-virtual {v0, v6}, La/f1v;->a(La/zje;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    if-ne v0, v9, :cond_8

    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_8
    :goto_4
    check-cast v0, Ljava/lang/Number;

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    move-wide/from16 v17, v1

    .line 239
    .line 240
    move v1, v0

    .line 241
    move-object v0, v4

    .line 242
    move-wide/from16 v4, v17

    .line 243
    .line 244
    move-object v2, v3

    .line 245
    sget-object v3, La/y9s;->a:La/y9s;

    .line 246
    .line 247
    iput-object v8, v6, La/upp;->j:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v8, v6, La/upp;->m:Ljava/lang/Object;

    .line 250
    .line 251
    iput-byte v7, v6, La/upp;->l:B

    .line 252
    .line 253
    invoke-virtual/range {v0 .. v6}, La/w5z;->M(ILa/jvn;La/y9s;JLa/bnn0;)Ljava/io/Serializable;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    if-ne v0, v9, :cond_9

    .line 258
    .line 259
    :goto_5
    move-object v8, v9

    .line 260
    goto :goto_8

    .line 261
    :cond_9
    :goto_6
    check-cast v0, Ljava/util/List;

    .line 262
    .line 263
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 264
    .line 265
    goto :goto_7

    .line 266
    :catchall_0
    move-exception v0

    .line 267
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 268
    .line 269
    new-instance v1, La/g0g0;

    .line 270
    .line 271
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 272
    .line 273
    .line 274
    move-object v0, v1

    .line 275
    :goto_7
    new-instance v8, La/j0g0;

    .line 276
    .line 277
    invoke-direct {v8, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :goto_8
    return-object v8

    .line 281
    :pswitch_1
    iget-object v0, v6, La/upp;->m:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, La/kmq;

    .line 284
    .line 285
    sget-object v9, La/wne;->a:La/wne;

    .line 286
    .line 287
    iget-byte v10, v6, La/upp;->l:B

    .line 288
    .line 289
    const/4 v11, 0x3

    .line 290
    if-eqz v10, :cond_d

    .line 291
    .line 292
    if-eq v10, v5, :cond_c

    .line 293
    .line 294
    if-eq v10, v7, :cond_b

    .line 295
    .line 296
    if-ne v10, v11, :cond_a

    .line 297
    .line 298
    iget-wide v12, v6, La/upp;->k:J

    .line 299
    .line 300
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    goto :goto_d

    .line 304
    :cond_a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    goto :goto_e

    .line 308
    :cond_b
    iget-wide v12, v6, La/upp;->k:J

    .line 309
    .line 310
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    goto :goto_b

    .line 314
    :cond_c
    iget-wide v12, v6, La/upp;->k:J

    .line 315
    .line 316
    iget-object v3, v6, La/upp;->j:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v3, La/kmq;

    .line 319
    .line 320
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    move-object v10, v3

    .line 324
    move-object/from16 v3, p1

    .line 325
    .line 326
    goto :goto_a

    .line 327
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    const-wide/16 v12, 0x0

    .line 331
    .line 332
    :goto_9
    invoke-interface {v6}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    invoke-static {v3}, La/zvw;->X(Lkotlin/coroutines/CoroutineContext;)Z

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    if-eqz v3, :cond_11

    .line 341
    .line 342
    iget-object v3, v6, La/upp;->o:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 345
    .line 346
    new-instance v10, Ljava/lang/Long;

    .line 347
    .line 348
    invoke-direct {v10, v12, v13}, Ljava/lang/Long;-><init>(J)V

    .line 349
    .line 350
    .line 351
    iput-object v0, v6, La/upp;->m:Ljava/lang/Object;

    .line 352
    .line 353
    iput-object v0, v6, La/upp;->j:Ljava/lang/Object;

    .line 354
    .line 355
    iput-wide v12, v6, La/upp;->k:J

    .line 356
    .line 357
    iput-byte v5, v6, La/upp;->l:B

    .line 358
    .line 359
    invoke-interface {v3, v10, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    if-ne v3, v9, :cond_e

    .line 364
    .line 365
    goto :goto_c

    .line 366
    :cond_e
    move-object v10, v0

    .line 367
    :goto_a
    iput-object v0, v6, La/upp;->m:Ljava/lang/Object;

    .line 368
    .line 369
    iput-object v8, v6, La/upp;->j:Ljava/lang/Object;

    .line 370
    .line 371
    iput-wide v12, v6, La/upp;->k:J

    .line 372
    .line 373
    iput-byte v7, v6, La/upp;->l:B

    .line 374
    .line 375
    invoke-interface {v10, v3, v6}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    if-ne v3, v9, :cond_f

    .line 380
    .line 381
    goto :goto_c

    .line 382
    :cond_f
    :goto_b
    move-object v3, v4

    .line 383
    check-cast v3, Ljava/util/concurrent/TimeUnit;

    .line 384
    .line 385
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 386
    .line 387
    .line 388
    move-result-wide v14

    .line 389
    iput-object v0, v6, La/upp;->m:Ljava/lang/Object;

    .line 390
    .line 391
    iput-wide v12, v6, La/upp;->k:J

    .line 392
    .line 393
    iput-byte v11, v6, La/upp;->l:B

    .line 394
    .line 395
    invoke-static {v14, v15, v6}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    if-ne v3, v9, :cond_10

    .line 400
    .line 401
    :goto_c
    move-object v8, v9

    .line 402
    goto :goto_e

    .line 403
    :cond_10
    :goto_d
    add-long/2addr v12, v1

    .line 404
    goto :goto_9

    .line 405
    :cond_11
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 406
    .line 407
    :goto_e
    return-object v8

    .line 408
    :pswitch_2
    iget-object v0, v6, La/upp;->m:Ljava/lang/Object;

    .line 409
    .line 410
    move-object v9, v0

    .line 411
    check-cast v9, La/kmq;

    .line 412
    .line 413
    sget-object v10, La/wne;->a:La/wne;

    .line 414
    .line 415
    iget-byte v0, v6, La/upp;->l:B

    .line 416
    .line 417
    if-eqz v0, :cond_14

    .line 418
    .line 419
    if-eq v0, v5, :cond_13

    .line 420
    .line 421
    if-ne v0, v7, :cond_12

    .line 422
    .line 423
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    goto :goto_11

    .line 427
    :cond_12
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    goto :goto_12

    .line 431
    :cond_13
    iget-object v0, v6, La/upp;->j:Ljava/lang/Object;

    .line 432
    .line 433
    move-object v9, v0

    .line 434
    check-cast v9, La/kmq;

    .line 435
    .line 436
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    move-object/from16 v0, p1

    .line 440
    .line 441
    goto :goto_f

    .line 442
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    iget-object v0, v6, La/upp;->o:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v0, La/tzi;

    .line 448
    .line 449
    iget-object v0, v0, La/tzi;->j:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v0, La/nr;

    .line 452
    .line 453
    iget-wide v1, v6, La/upp;->k:J

    .line 454
    .line 455
    move-object v3, v4

    .line 456
    check-cast v3, La/sip;

    .line 457
    .line 458
    iput-object v8, v6, La/upp;->m:Ljava/lang/Object;

    .line 459
    .line 460
    iput-object v9, v6, La/upp;->j:Ljava/lang/Object;

    .line 461
    .line 462
    iput-byte v5, v6, La/upp;->l:B

    .line 463
    .line 464
    iget-wide v4, v6, La/upp;->n:J

    .line 465
    .line 466
    invoke-virtual/range {v0 .. v6}, La/nr;->x(JLa/sip;JLa/zje;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    if-ne v0, v10, :cond_15

    .line 471
    .line 472
    goto :goto_10

    .line 473
    :cond_15
    :goto_f
    iput-object v8, v6, La/upp;->m:Ljava/lang/Object;

    .line 474
    .line 475
    iput-object v8, v6, La/upp;->j:Ljava/lang/Object;

    .line 476
    .line 477
    iput-byte v7, v6, La/upp;->l:B

    .line 478
    .line 479
    invoke-interface {v9, v0, v6}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    if-ne v0, v10, :cond_16

    .line 484
    .line 485
    :goto_10
    move-object v8, v10

    .line 486
    goto :goto_12

    .line 487
    :cond_16
    :goto_11
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 488
    .line 489
    :goto_12
    return-object v8

    .line 490
    nop

    .line 491
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
