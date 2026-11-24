.class public final La/l87;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:J

.field public final synthetic k:J

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLa/d650;JLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/l87;->i:B

    .line 3
    .line 4
    iput-wide p1, p0, La/l87;->j:J

    .line 5
    .line 6
    iput-object p3, p0, La/l87;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iput-wide p4, p0, La/l87;->k:J

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(La/i3t0;JJLa/yje;B)V
    .locals 0

    .line 16
    iput-byte p7, p0, La/l87;->i:B

    iput-object p1, p0, La/l87;->l:Ljava/lang/Object;

    iput-wide p2, p0, La/l87;->j:J

    iput-wide p4, p0, La/l87;->k:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/n530;JLa/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/l87;->i:B

    .line 15
    iput-object p1, p0, La/l87;->l:Ljava/lang/Object;

    iput-wide p2, p0, La/l87;->k:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    iget-byte v0, p0, La/l87;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/l87;->l:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/l87;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, La/bv70;

    .line 12
    .line 13
    iget-wide v4, p0, La/l87;->j:J

    .line 14
    .line 15
    iget-wide v6, p0, La/l87;->k:J

    .line 16
    .line 17
    const/4 v9, 0x4

    .line 18
    move-object v8, p2

    .line 19
    invoke-direct/range {v2 .. v9}, La/l87;-><init>(La/i3t0;JJLa/yje;B)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :pswitch_0
    move-object v9, p2

    .line 24
    new-instance v3, La/l87;

    .line 25
    .line 26
    iget-wide v4, p0, La/l87;->j:J

    .line 27
    .line 28
    move-object v6, v1

    .line 29
    check-cast v6, La/d650;

    .line 30
    .line 31
    iget-wide v7, p0, La/l87;->k:J

    .line 32
    .line 33
    invoke-direct/range {v3 .. v9}, La/l87;-><init>(JLa/d650;JLa/yje;)V

    .line 34
    .line 35
    .line 36
    return-object v3

    .line 37
    :pswitch_1
    move-object v9, p2

    .line 38
    new-instance p2, La/l87;

    .line 39
    .line 40
    check-cast v1, La/n530;

    .line 41
    .line 42
    iget-wide v2, p0, La/l87;->k:J

    .line 43
    .line 44
    invoke-direct {p2, v1, v2, v3, v9}, La/l87;-><init>(La/n530;JLa/yje;)V

    .line 45
    .line 46
    .line 47
    check-cast p1, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide p0

    .line 53
    iput-wide p0, p2, La/l87;->j:J

    .line 54
    .line 55
    return-object p2

    .line 56
    :pswitch_2
    move-object v9, p2

    .line 57
    new-instance v3, La/l87;

    .line 58
    .line 59
    move-object v4, v1

    .line 60
    check-cast v4, La/hq7;

    .line 61
    .line 62
    iget-wide v5, p0, La/l87;->j:J

    .line 63
    .line 64
    iget-wide v7, p0, La/l87;->k:J

    .line 65
    .line 66
    const/4 v10, 0x1

    .line 67
    invoke-direct/range {v3 .. v10}, La/l87;-><init>(La/i3t0;JJLa/yje;B)V

    .line 68
    .line 69
    .line 70
    return-object v3

    .line 71
    :pswitch_3
    move-object v9, p2

    .line 72
    new-instance v3, La/l87;

    .line 73
    .line 74
    move-object v4, v1

    .line 75
    check-cast v4, La/f97;

    .line 76
    .line 77
    iget-wide v5, p0, La/l87;->j:J

    .line 78
    .line 79
    iget-wide v7, p0, La/l87;->k:J

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    invoke-direct/range {v3 .. v10}, La/l87;-><init>(La/i3t0;JJLa/yje;B)V

    .line 83
    .line 84
    .line 85
    return-object v3

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/l87;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/kmq;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/l87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/l87;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/l87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/l87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/l87;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/l87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    check-cast p2, La/yje;

    .line 47
    .line 48
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1, p2}, La/l87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/l87;

    .line 57
    .line 58
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, La/l87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_2
    check-cast p1, La/vne;

    .line 66
    .line 67
    check-cast p2, La/yje;

    .line 68
    .line 69
    invoke-virtual {p0, p1, p2}, La/l87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/l87;

    .line 74
    .line 75
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, La/l87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    :pswitch_3
    check-cast p1, La/vne;

    .line 83
    .line 84
    check-cast p2, La/yje;

    .line 85
    .line 86
    invoke-virtual {p0, p1, p2}, La/l87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/l87;

    .line 91
    .line 92
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, La/l87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/l87;->i:B

    .line 4
    .line 5
    iget-wide v2, v0, La/l87;->k:J

    .line 6
    .line 7
    iget-object v4, v0, La/l87;->l:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-wide v0, v0, La/l87;->j:J

    .line 13
    .line 14
    sget-object v5, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    check-cast v4, La/bv70;

    .line 20
    .line 21
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, La/hu70;

    .line 26
    .line 27
    iget-object v6, v5, La/hu70;->t:La/suy;

    .line 28
    .line 29
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    check-cast v5, La/hu70;

    .line 34
    .line 35
    iget-object v5, v5, La/hu70;->t:La/suy;

    .line 36
    .line 37
    iget-boolean v5, v5, La/suy;->e:Z

    .line 38
    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    move-wide v10, v0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, La/hu70;

    .line 48
    .line 49
    iget-object v5, v5, La/hu70;->t:La/suy;

    .line 50
    .line 51
    iget-wide v7, v5, La/suy;->d:J

    .line 52
    .line 53
    move-wide v10, v7

    .line 54
    :goto_0
    add-long v8, v2, v0

    .line 55
    .line 56
    sget-object v7, La/wuy;->d:La/wuy;

    .line 57
    .line 58
    const/4 v12, 0x0

    .line 59
    const/4 v13, 0x2

    .line 60
    invoke-static/range {v6 .. v13}, La/suy;->a(La/suy;La/wuy;JJZI)La/suy;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, v4, La/bv70;->K:La/ukt0;

    .line 65
    .line 66
    invoke-virtual {v1, v0}, La/ukt0;->a(La/suy;)V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_0
    check-cast v4, La/d650;

    .line 73
    .line 74
    iget-object v1, v4, La/d650;->L:La/mne;

    .line 75
    .line 76
    sget-object v5, La/wne;->a:La/wne;

    .line 77
    .line 78
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-wide v9, v0, La/l87;->j:J

    .line 82
    .line 83
    const-wide/16 v5, 0x0

    .line 84
    .line 85
    cmp-long v0, v9, v5

    .line 86
    .line 87
    if-nez v0, :cond_1

    .line 88
    .line 89
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    goto/16 :goto_2

    .line 92
    .line 93
    :cond_1
    sget-object v0, La/s0s;->b:La/s0s;

    .line 94
    .line 95
    const-wide/16 v5, -0x1

    .line 96
    .line 97
    cmp-long v0, v9, v5

    .line 98
    .line 99
    if-nez v0, :cond_2

    .line 100
    .line 101
    iget-boolean v0, v4, La/d650;->c1:Z

    .line 102
    .line 103
    if-nez v0, :cond_4

    .line 104
    .line 105
    iget-object v0, v4, La/d650;->H:La/s91;

    .line 106
    .line 107
    new-instance v4, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 108
    .line 109
    new-instance v9, La/lm1;

    .line 110
    .line 111
    invoke-direct {v9, v2, v3}, La/lm1;-><init>(J)V

    .line 112
    .line 113
    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    const/16 v17, 0x1f7

    .line 117
    .line 118
    const/4 v5, 0x0

    .line 119
    const/4 v6, 0x0

    .line 120
    const-wide/16 v7, 0x0

    .line 121
    .line 122
    const/4 v10, 0x0

    .line 123
    const-wide/16 v11, 0x0

    .line 124
    .line 125
    const-wide/16 v13, 0x0

    .line 126
    .line 127
    const/4 v15, 0x0

    .line 128
    invoke-direct/range {v4 .. v17}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v4}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    const-wide/16 v2, -0xa

    .line 136
    .line 137
    cmp-long v0, v9, v2

    .line 138
    .line 139
    const/4 v11, 0x0

    .line 140
    if-nez v0, :cond_3

    .line 141
    .line 142
    sget v0, La/d650;->k1:I

    .line 143
    .line 144
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    iget-object v8, v1, La/mne;->a:La/rwj;

    .line 149
    .line 150
    sget-object v6, La/w550;->a:La/w550;

    .line 151
    .line 152
    new-instance v9, La/x550;

    .line 153
    .line 154
    const/4 v0, 0x1

    .line 155
    invoke-direct {v9, v4, v0, v11, v0}, La/x550;-><init>(La/d650;ZLa/yje;B)V

    .line 156
    .line 157
    .line 158
    const/16 v10, 0xa

    .line 159
    .line 160
    const/4 v7, 0x0

    .line 161
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_3
    move-object v0, v11

    .line 166
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    iget-object v14, v1, La/mne;->a:La/rwj;

    .line 171
    .line 172
    new-instance v1, La/f340;

    .line 173
    .line 174
    const/4 v7, 0x0

    .line 175
    const/16 v8, 0x17

    .line 176
    .line 177
    const/4 v2, 0x1

    .line 178
    move-object v3, v4

    .line 179
    const-class v4, La/d650;

    .line 180
    .line 181
    const-string v5, "handleError"

    .line 182
    .line 183
    const-string v6, "handleError(Ljava/lang/Throwable;)V"

    .line 184
    .line 185
    invoke-direct/range {v1 .. v8}, La/f340;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 186
    .line 187
    .line 188
    move-object v12, v1

    .line 189
    new-instance v15, La/o550;

    .line 190
    .line 191
    const/4 v6, 0x1

    .line 192
    move-object v5, v0

    .line 193
    move-object v2, v3

    .line 194
    move-wide v3, v9

    .line 195
    move-object v1, v15

    .line 196
    invoke-direct/range {v1 .. v6}, La/o550;-><init>(La/d650;JLa/yje;B)V

    .line 197
    .line 198
    .line 199
    const/16 v16, 0xa

    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 203
    .line 204
    .line 205
    :cond_4
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    :goto_2
    return-object v0

    .line 208
    :pswitch_1
    iget-wide v0, v0, La/l87;->j:J

    .line 209
    .line 210
    sget-object v5, La/wne;->a:La/wne;

    .line 211
    .line 212
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    check-cast v4, La/n530;

    .line 216
    .line 217
    new-instance v5, La/i530;

    .line 218
    .line 219
    invoke-direct {v5, v2, v3, v0, v1}, La/i530;-><init>(JJ)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4, v5}, La/n530;->b(La/i530;)La/p7m0;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    return-object v0

    .line 227
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 228
    .line 229
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    check-cast v4, La/hq7;

    .line 233
    .line 234
    iget-object v6, v4, La/hq7;->p:La/gr00;

    .line 235
    .line 236
    iget-wide v7, v0, La/l87;->j:J

    .line 237
    .line 238
    iget-object v1, v6, La/gr00;->a:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v1, La/oeg0;

    .line 241
    .line 242
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    new-instance v5, La/qp7;

    .line 247
    .line 248
    const/4 v11, 0x0

    .line 249
    iget-wide v9, v0, La/l87;->k:J

    .line 250
    .line 251
    invoke-direct/range {v5 .. v11}, La/qp7;-><init>(Ljava/lang/Object;JJB)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v5}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 255
    .line 256
    .line 257
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 261
    .line 262
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    check-cast v4, La/f97;

    .line 266
    .line 267
    iget-wide v7, v0, La/l87;->j:J

    .line 268
    .line 269
    new-instance v5, La/k87;

    .line 270
    .line 271
    const/4 v6, 0x0

    .line 272
    iget-wide v9, v0, La/l87;->k:J

    .line 273
    .line 274
    invoke-direct/range {v5 .. v10}, La/k87;-><init>(BJJ)V

    .line 275
    .line 276
    .line 277
    sget v0, La/f97;->R0:I

    .line 278
    .line 279
    invoke-virtual {v4, v5}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4}, La/f97;->a0()V

    .line 283
    .line 284
    .line 285
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    return-object v0

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
