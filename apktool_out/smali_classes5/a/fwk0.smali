.class public final La/fwk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/i3t0;Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/fwk0;->i:B

    iput-object p1, p0, La/fwk0;->k:Ljava/lang/Object;

    iput-object p2, p0, La/fwk0;->l:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/fwk0;->i:B

    iput-object p1, p0, La/fwk0;->l:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/fwk0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/fwk0;->l:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/fwk0;

    .line 9
    .line 10
    check-cast v1, La/dyu0;

    .line 11
    .line 12
    const/4 v0, 0x7

    .line 13
    invoke-direct {p0, v1, p1, v0}, La/fwk0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    new-instance p0, La/fwk0;

    .line 18
    .line 19
    check-cast v1, La/xot0;

    .line 20
    .line 21
    const/4 v0, 0x6

    .line 22
    invoke-direct {p0, v1, p1, v0}, La/fwk0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    new-instance p0, La/fwk0;

    .line 27
    .line 28
    check-cast v1, La/ltr0;

    .line 29
    .line 30
    const/4 v0, 0x5

    .line 31
    invoke-direct {p0, v1, p1, v0}, La/fwk0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_2
    new-instance p0, La/fwk0;

    .line 36
    .line 37
    check-cast v1, La/fir0;

    .line 38
    .line 39
    const/4 v0, 0x4

    .line 40
    invoke-direct {p0, v1, p1, v0}, La/fwk0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_3
    new-instance p0, La/fwk0;

    .line 45
    .line 46
    check-cast v1, La/m2r0;

    .line 47
    .line 48
    const/4 v0, 0x3

    .line 49
    invoke-direct {p0, v1, p1, v0}, La/fwk0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_4
    new-instance v0, La/fwk0;

    .line 54
    .line 55
    iget-object p0, p0, La/fwk0;->k:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, La/lkq0;

    .line 58
    .line 59
    check-cast v1, La/a95;

    .line 60
    .line 61
    const/4 v2, 0x2

    .line 62
    invoke-direct {v0, p0, v1, p1, v2}, La/fwk0;-><init>(La/i3t0;Ljava/lang/Object;La/yje;B)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_5
    new-instance p0, La/fwk0;

    .line 67
    .line 68
    check-cast v1, La/b0p0;

    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    invoke-direct {p0, v1, p1, v0}, La/fwk0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_6
    new-instance v0, La/fwk0;

    .line 76
    .line 77
    iget-object p0, p0, La/fwk0;->k:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, La/iwk0;

    .line 80
    .line 81
    check-cast v1, La/kr5;

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    invoke-direct {v0, p0, v1, p1, v2}, La/fwk0;-><init>(La/i3t0;Ljava/lang/Object;La/yje;B)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fwk0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/fwk0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/fwk0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/fwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/fwk0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/fwk0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/fwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/fwk0;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/fwk0;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/fwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/fwk0;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/fwk0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/fwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/fwk0;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/fwk0;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/fwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_4
    invoke-virtual {p0, p1}, La/fwk0;->create(La/yje;)La/yje;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/fwk0;

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/fwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_5
    invoke-virtual {p0, p1}, La/fwk0;->create(La/yje;)La/yje;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/fwk0;

    .line 91
    .line 92
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, La/fwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_6
    invoke-virtual {p0, p1}, La/fwk0;->create(La/yje;)La/yje;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, La/fwk0;

    .line 104
    .line 105
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, La/fwk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/fwk0;->i:B

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    const/4 v7, 0x0

    .line 7
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v6, 0x2

    .line 11
    iget-object v4, v5, La/fwk0;->l:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object v9, v4

    .line 18
    check-cast v9, La/dyu0;

    .line 19
    .line 20
    sget-object v10, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-byte v0, v5, La/fwk0;->j:B

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    if-eq v0, v3, :cond_1

    .line 27
    .line 28
    if-ne v0, v6, :cond_0

    .line 29
    .line 30
    iget-object v0, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v9, v0

    .line 33
    check-cast v9, La/dyu0;

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object/from16 v0, p1

    .line 39
    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_1
    iget-object v0, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v9, v0

    .line 50
    check-cast v9, La/dyu0;

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object/from16 v0, p1

    .line 56
    .line 57
    goto/16 :goto_0

    .line 58
    .line 59
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, La/txu0;

    .line 67
    .line 68
    iget-object v0, v0, La/txu0;->b:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v0}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-eqz v0, :cond_8

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 77
    .line 78
    .line 79
    move-result-wide v0

    .line 80
    iget-object v2, v9, La/i3t0;->i:La/ocj;

    .line 81
    .line 82
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 83
    .line 84
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-object v11, v4

    .line 92
    check-cast v11, La/txu0;

    .line 93
    .line 94
    iget-object v8, v11, La/txu0;->e:La/fwu0;

    .line 95
    .line 96
    iget-object v12, v8, La/fwu0;->a:La/gwu0;

    .line 97
    .line 98
    iget-object v8, v8, La/fwu0;->b:La/hwu0;

    .line 99
    .line 100
    new-instance v15, La/fwu0;

    .line 101
    .line 102
    invoke-direct {v15, v12, v8, v7}, La/fwu0;-><init>(La/gwu0;La/hwu0;Z)V

    .line 103
    .line 104
    .line 105
    const-wide/16 v19, 0x0

    .line 106
    .line 107
    const/16 v21, 0x18f

    .line 108
    .line 109
    const/4 v12, 0x0

    .line 110
    const/4 v13, 0x0

    .line 111
    const/4 v14, 0x0

    .line 112
    const/16 v16, 0x0

    .line 113
    .line 114
    const/16 v17, 0x1

    .line 115
    .line 116
    const/16 v18, 0x0

    .line 117
    .line 118
    invoke-static/range {v11 .. v21}, La/txu0;->a(La/txu0;Ljava/lang/String;ZLa/axu0;La/fwu0;La/dxu0;ZZDI)La/txu0;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    invoke-virtual {v2, v4, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_3

    .line 127
    .line 128
    iget-object v2, v9, La/dyu0;->q:La/xrs;

    .line 129
    .line 130
    iget-boolean v4, v2, La/xrs;->c:Z

    .line 131
    .line 132
    if-eqz v4, :cond_5

    .line 133
    .line 134
    iget-object v4, v9, La/dyu0;->D:La/roi0;

    .line 135
    .line 136
    iget-wide v6, v2, La/xrs;->a:J

    .line 137
    .line 138
    sget-object v8, La/pn40;->a:La/pn40;

    .line 139
    .line 140
    sget-object v8, La/p3u0;->c:La/p3u0;

    .line 141
    .line 142
    invoke-static {v0, v1, v8}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget-wide v1, v2, La/xrs;->b:J

    .line 147
    .line 148
    iput-object v9, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 149
    .line 150
    iput-byte v3, v5, La/fwk0;->j:B

    .line 151
    .line 152
    iget-object v3, v4, La/roi0;->a:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v3, La/fuj0;

    .line 155
    .line 156
    move-wide/from16 v23, v6

    .line 157
    .line 158
    move-object v6, v0

    .line 159
    move-object v0, v3

    .line 160
    move-wide v3, v1

    .line 161
    move-wide/from16 v1, v23

    .line 162
    .line 163
    invoke-virtual/range {v0 .. v6}, La/fuj0;->F(JJLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    if-ne v0, v10, :cond_4

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_4
    :goto_0
    check-cast v0, La/aq40;

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_5
    iget-object v3, v9, La/dyu0;->E:La/qrt;

    .line 174
    .line 175
    iget-wide v7, v2, La/xrs;->a:J

    .line 176
    .line 177
    sget-object v4, La/pn40;->a:La/pn40;

    .line 178
    .line 179
    sget-object v4, La/p3u0;->c:La/p3u0;

    .line 180
    .line 181
    invoke-static {v0, v1, v4}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iget-wide v1, v2, La/xrs;->b:J

    .line 186
    .line 187
    iput-object v9, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 188
    .line 189
    iput-byte v6, v5, La/fwk0;->j:B

    .line 190
    .line 191
    iget-object v3, v3, La/qrt;->a:La/fuj0;

    .line 192
    .line 193
    move-object v6, v0

    .line 194
    move-object v0, v3

    .line 195
    move-wide v3, v1

    .line 196
    move-wide v1, v7

    .line 197
    invoke-virtual/range {v0 .. v6}, La/fuj0;->G(JJLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-ne v0, v10, :cond_6

    .line 202
    .line 203
    :goto_1
    move-object v8, v10

    .line 204
    goto :goto_5

    .line 205
    :cond_6
    :goto_2
    check-cast v0, La/aq40;

    .line 206
    .line 207
    :goto_3
    iget-object v1, v9, La/dyu0;->q:La/xrs;

    .line 208
    .line 209
    iget-boolean v1, v1, La/xrs;->c:Z

    .line 210
    .line 211
    if-eqz v1, :cond_7

    .line 212
    .line 213
    new-instance v1, La/qxu0;

    .line 214
    .line 215
    iget-object v0, v0, La/aq40;->a:Ljava/lang/String;

    .line 216
    .line 217
    invoke-direct {v1, v0}, La/qxu0;-><init>(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v9, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_7
    new-instance v1, La/rxu0;

    .line 225
    .line 226
    iget-object v0, v0, La/aq40;->a:Ljava/lang/String;

    .line 227
    .line 228
    invoke-direct {v1, v0}, La/rxu0;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v9, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    :cond_8
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    :goto_5
    return-object v8

    .line 237
    :pswitch_0
    check-cast v4, La/xot0;

    .line 238
    .line 239
    iget-object v4, v4, La/xot0;->c:La/kpt0;

    .line 240
    .line 241
    sget-object v7, La/wne;->a:La/wne;

    .line 242
    .line 243
    iget-byte v0, v5, La/fwk0;->j:B

    .line 244
    .line 245
    const-string v9, "Cannot acquire the CameraGraph.Session"

    .line 246
    .line 247
    const/4 v10, 0x4

    .line 248
    const-string v11, "CXCP"

    .line 249
    .line 250
    if-eqz v0, :cond_d

    .line 251
    .line 252
    if-eq v0, v3, :cond_c

    .line 253
    .line 254
    if-eq v0, v6, :cond_b

    .line 255
    .line 256
    if-eq v0, v1, :cond_a

    .line 257
    .line 258
    if-ne v0, v10, :cond_9

    .line 259
    .line 260
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 261
    .line 262
    .line 263
    move-object/from16 v0, p1

    .line 264
    .line 265
    goto/16 :goto_d

    .line 266
    .line 267
    :catch_0
    move-exception v0

    .line 268
    goto/16 :goto_f

    .line 269
    .line 270
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    goto/16 :goto_10

    .line 274
    .line 275
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_b

    .line 279
    .line 280
    :cond_b
    iget-object v0, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 281
    .line 282
    move-object v2, v0

    .line 283
    check-cast v2, Ljava/lang/AutoCloseable;

    .line 284
    .line 285
    :try_start_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 286
    .line 287
    .line 288
    move-object/from16 v0, p1

    .line 289
    .line 290
    goto :goto_7

    .line 291
    :catchall_0
    move-exception v0

    .line 292
    move-object v3, v2

    .line 293
    move-object v2, v0

    .line 294
    goto :goto_8

    .line 295
    :cond_c
    :try_start_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1

    .line 296
    .line 297
    .line 298
    move-object/from16 v0, p1

    .line 299
    .line 300
    goto :goto_6

    .line 301
    :catch_1
    move-exception v0

    .line 302
    goto :goto_9

    .line 303
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    invoke-static {v11}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_e

    .line 311
    .line 312
    const-string v0, "UseCaseCameraRequestControlImpl#cancelFocusAndMeteringAsync"

    .line 313
    .line 314
    invoke-static {v11, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 315
    .line 316
    .line 317
    :cond_e
    :try_start_3
    invoke-virtual {v4}, La/kpt0;->a()La/b0a;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    iput-byte v3, v5, La/fwk0;->j:B

    .line 322
    .line 323
    invoke-virtual {v0, v5}, La/b0a;->c(La/zje;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    if-ne v0, v7, :cond_f

    .line 328
    .line 329
    goto :goto_c

    .line 330
    :cond_f
    :goto_6
    move-object v2, v0

    .line 331
    check-cast v2, Ljava/lang/AutoCloseable;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 332
    .line 333
    :try_start_4
    move-object v0, v2

    .line 334
    check-cast v0, La/e0a;

    .line 335
    .line 336
    iput-object v2, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 337
    .line 338
    iput-byte v6, v5, La/fwk0;->j:B

    .line 339
    .line 340
    const-wide/16 v12, 0x0

    .line 341
    .line 342
    const/16 v3, 0x38

    .line 343
    .line 344
    invoke-static {v0, v12, v13, v3}, La/e0a;->n(La/e0a;JI)La/odd;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    if-ne v0, v7, :cond_10

    .line 349
    .line 350
    goto :goto_c

    .line 351
    :cond_10
    :goto_7
    check-cast v0, La/jzj;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 352
    .line 353
    :try_start_5
    invoke-static {v2, v8}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_1

    .line 354
    .line 355
    .line 356
    goto :goto_a

    .line 357
    :goto_8
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 358
    :catchall_1
    move-exception v0

    .line 359
    :try_start_7
    invoke-static {v3, v2}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 360
    .line 361
    .line 362
    throw v0
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_1

    .line 363
    :goto_9
    invoke-static {v11}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-eqz v2, :cond_11

    .line 368
    .line 369
    invoke-static {v11, v9, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 370
    .line 371
    .line 372
    :cond_11
    sget-object v0, La/xot0;->l:La/odd;

    .line 373
    .line 374
    :goto_a
    iput-object v8, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 375
    .line 376
    iput-byte v1, v5, La/fwk0;->j:B

    .line 377
    .line 378
    invoke-interface {v0, v5}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    if-ne v0, v7, :cond_12

    .line 383
    .line 384
    goto :goto_c

    .line 385
    :cond_12
    :goto_b
    :try_start_8
    invoke-virtual {v4}, La/kpt0;->a()La/b0a;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    iput-byte v10, v5, La/fwk0;->j:B

    .line 390
    .line 391
    invoke-virtual {v0, v5}, La/b0a;->c(La/zje;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    if-ne v0, v7, :cond_13

    .line 396
    .line 397
    :goto_c
    move-object v8, v7

    .line 398
    goto :goto_10

    .line 399
    :cond_13
    :goto_d
    move-object v1, v0

    .line 400
    check-cast v1, Ljava/lang/AutoCloseable;
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_0

    .line 401
    .line 402
    :try_start_9
    move-object v12, v1

    .line 403
    check-cast v12, La/e0a;

    .line 404
    .line 405
    sget-object v0, La/uz9;->a:[Landroid/hardware/camera2/params/MeteringRectangle;

    .line 406
    .line 407
    invoke-static {v0}, La/qx3;->c([Ljava/lang/Object;)Ljava/util/List;

    .line 408
    .line 409
    .line 410
    move-result-object v16

    .line 411
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 412
    .line 413
    .line 414
    move-result-object v17

    .line 415
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v18

    .line 422
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    const/16 v19, 0x7

    .line 426
    .line 427
    const/4 v13, 0x0

    .line 428
    const/4 v14, 0x0

    .line 429
    const/4 v15, 0x0

    .line 430
    invoke-static/range {v12 .. v19}, La/vy9;->a(La/e0a;La/z40;La/q70;La/va5;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)La/jzj;

    .line 431
    .line 432
    .line 433
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 434
    :try_start_a
    invoke-static {v1, v8}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_0

    .line 435
    .line 436
    .line 437
    :goto_e
    move-object v8, v0

    .line 438
    goto :goto_10

    .line 439
    :catchall_2
    move-exception v0

    .line 440
    move-object v2, v0

    .line 441
    :try_start_b
    throw v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 442
    :catchall_3
    move-exception v0

    .line 443
    :try_start_c
    invoke-static {v1, v2}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 444
    .line 445
    .line 446
    throw v0
    :try_end_c
    .catch Ljava/util/concurrent/CancellationException; {:try_start_c .. :try_end_c} :catch_0

    .line 447
    :goto_f
    invoke-static {v11}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    if-eqz v1, :cond_14

    .line 452
    .line 453
    invoke-static {v11, v9, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 454
    .line 455
    .line 456
    :cond_14
    sget-object v0, La/xot0;->l:La/odd;

    .line 457
    .line 458
    goto :goto_e

    .line 459
    :goto_10
    return-object v8

    .line 460
    :pswitch_1
    move-object v9, v4

    .line 461
    check-cast v9, La/ltr0;

    .line 462
    .line 463
    sget-object v10, La/wne;->a:La/wne;

    .line 464
    .line 465
    iget-byte v0, v5, La/fwk0;->j:B

    .line 466
    .line 467
    if-eqz v0, :cond_18

    .line 468
    .line 469
    if-eq v0, v3, :cond_17

    .line 470
    .line 471
    if-eq v0, v6, :cond_16

    .line 472
    .line 473
    if-ne v0, v1, :cond_15

    .line 474
    .line 475
    iget-object v0, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v0, La/ql5;

    .line 478
    .line 479
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    move-object v1, v0

    .line 483
    move-object/from16 v0, p1

    .line 484
    .line 485
    goto/16 :goto_14

    .line 486
    .line 487
    :cond_15
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    goto/16 :goto_15

    .line 491
    .line 492
    :cond_16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    move-object/from16 v0, p1

    .line 496
    .line 497
    goto :goto_12

    .line 498
    :cond_17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    move-object/from16 v0, p1

    .line 502
    .line 503
    goto :goto_11

    .line 504
    :cond_18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    iget-object v0, v9, La/ltr0;->H:La/m1e;

    .line 508
    .line 509
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    iput-byte v3, v5, La/fwk0;->j:B

    .line 514
    .line 515
    invoke-static {v0, v5}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    if-ne v0, v10, :cond_19

    .line 520
    .line 521
    goto :goto_13

    .line 522
    :cond_19
    :goto_11
    check-cast v0, Ljava/lang/Boolean;

    .line 523
    .line 524
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 525
    .line 526
    .line 527
    move-result v0

    .line 528
    if-nez v0, :cond_1a

    .line 529
    .line 530
    sget v0, La/ltr0;->Q:I

    .line 531
    .line 532
    invoke-virtual {v9}, La/ltr0;->O()V

    .line 533
    .line 534
    .line 535
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    goto/16 :goto_15

    .line 538
    .line 539
    :cond_1a
    sget v0, La/ltr0;->Q:I

    .line 540
    .line 541
    sget-object v0, La/ctr0;->a:La/ctr0;

    .line 542
    .line 543
    invoke-virtual {v9, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    iget-object v0, v9, La/ltr0;->r:La/khf0;

    .line 547
    .line 548
    sget-object v2, La/bm5;->l:La/bm5;

    .line 549
    .line 550
    iput-byte v6, v5, La/fwk0;->j:B

    .line 551
    .line 552
    invoke-static {v0, v2, v5}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    if-ne v0, v10, :cond_1b

    .line 557
    .line 558
    goto :goto_13

    .line 559
    :cond_1b
    :goto_12
    move-object v11, v0

    .line 560
    check-cast v11, La/ql5;

    .line 561
    .line 562
    iget-object v0, v9, La/ltr0;->D:La/ot;

    .line 563
    .line 564
    sget-object v2, La/bm5;->l:La/bm5;

    .line 565
    .line 566
    invoke-virtual {v0, v2, v11}, La/ot;->a(La/bm5;La/ql5;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    check-cast v0, La/ftr0;

    .line 574
    .line 575
    iget-object v0, v0, La/ftr0;->f:La/pur0;

    .line 576
    .line 577
    iget-object v0, v0, La/pur0;->a:La/rjr0;

    .line 578
    .line 579
    iget-object v0, v0, La/rjr0;->b:Ljava/math/BigDecimal;

    .line 580
    .line 581
    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 582
    .line 583
    .line 584
    move-result-wide v2

    .line 585
    iget-object v0, v9, La/ltr0;->x:La/zku;

    .line 586
    .line 587
    iget-wide v12, v11, La/ql5;->a:J

    .line 588
    .line 589
    iput-object v11, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 590
    .line 591
    iput-byte v1, v5, La/fwk0;->j:B

    .line 592
    .line 593
    iget-object v0, v0, La/zku;->a:La/w5z;

    .line 594
    .line 595
    const-string v1, ""

    .line 596
    .line 597
    move-object v6, v5

    .line 598
    move-wide v4, v12

    .line 599
    invoke-virtual/range {v0 .. v6}, La/w5z;->b0(Ljava/lang/String;DJLa/zje;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    if-ne v0, v10, :cond_1c

    .line 604
    .line 605
    :goto_13
    move-object v8, v10

    .line 606
    goto/16 :goto_15

    .line 607
    .line 608
    :cond_1c
    move-object v1, v11

    .line 609
    :goto_14
    check-cast v0, La/ku;

    .line 610
    .line 611
    sget v2, La/ltr0;->Q:I

    .line 612
    .line 613
    iget-object v2, v9, La/ltr0;->z:La/fvt0;

    .line 614
    .line 615
    iget-object v2, v2, La/fvt0;->a:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v2, La/o3c;

    .line 618
    .line 619
    invoke-virtual {v2}, La/o3c;->d()La/hpc;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    iget-object v2, v2, La/hpc;->a:La/rrd;

    .line 624
    .line 625
    iget-object v2, v2, La/rrd;->g:Ljava/lang/Object;

    .line 626
    .line 627
    check-cast v2, La/m0w;

    .line 628
    .line 629
    iget-object v2, v2, La/m0w;->f:La/lt2;

    .line 630
    .line 631
    if-nez v2, :cond_1d

    .line 632
    .line 633
    new-instance v2, La/lt2;

    .line 634
    .line 635
    const-string v3, ""

    .line 636
    .line 637
    invoke-direct {v2, v3, v3}, La/lt2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    :cond_1d
    iget-object v2, v2, La/lt2;->a:Ljava/lang/String;

    .line 641
    .line 642
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    if-lez v3, :cond_1e

    .line 647
    .line 648
    iget-object v3, v9, La/ltr0;->E:La/mii0;

    .line 649
    .line 650
    invoke-virtual {v3, v2}, La/mii0;->M(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    :cond_1e
    iget-object v2, v9, La/ltr0;->A:La/ilt0;

    .line 654
    .line 655
    iget-wide v3, v1, La/ql5;->a:J

    .line 656
    .line 657
    iget-wide v5, v0, La/ku;->b:D

    .line 658
    .line 659
    invoke-virtual {v2, v5, v6, v3, v4}, La/ilt0;->a(DJ)V

    .line 660
    .line 661
    .line 662
    iget-object v10, v9, La/ltr0;->B:La/trm0;

    .line 663
    .line 664
    sget-object v11, La/bm5;->b:La/bm5;

    .line 665
    .line 666
    iget-wide v2, v0, La/ku;->b:D

    .line 667
    .line 668
    const/4 v5, 0x0

    .line 669
    const/16 v6, 0x1ffd

    .line 670
    .line 671
    const/4 v4, 0x0

    .line 672
    invoke-static/range {v1 .. v6}, La/ql5;->a(La/ql5;DLjava/lang/String;II)La/ql5;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    invoke-virtual {v10, v11, v2}, La/trm0;->l(La/bm5;La/ql5;)V

    .line 677
    .line 678
    .line 679
    sget-object v2, La/ysr0;->a:La/ysr0;

    .line 680
    .line 681
    invoke-virtual {v9, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 682
    .line 683
    .line 684
    iget-object v2, v9, La/ltr0;->q:La/ctf0;

    .line 685
    .line 686
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v3

    .line 690
    check-cast v3, La/ftr0;

    .line 691
    .line 692
    iget-object v3, v3, La/ftr0;->f:La/pur0;

    .line 693
    .line 694
    iget-object v3, v3, La/pur0;->a:La/rjr0;

    .line 695
    .line 696
    iget-object v3, v3, La/rjr0;->b:Ljava/math/BigDecimal;

    .line 697
    .line 698
    invoke-virtual {v3}, Ljava/math/BigDecimal;->doubleValue()D

    .line 699
    .line 700
    .line 701
    move-result-wide v3

    .line 702
    iget-object v5, v9, La/ltr0;->G:La/xfu;

    .line 703
    .line 704
    iget-object v5, v5, La/xfu;->a:Ljava/lang/Object;

    .line 705
    .line 706
    check-cast v5, La/w5z;

    .line 707
    .line 708
    iget-object v5, v5, La/w5z;->c:Ljava/lang/Object;

    .line 709
    .line 710
    check-cast v5, La/gkr0;

    .line 711
    .line 712
    invoke-virtual {v5}, La/gkr0;->b()La/lmr0;

    .line 713
    .line 714
    .line 715
    move-result-object v5

    .line 716
    iget-object v6, v9, La/ltr0;->I:La/ouu;

    .line 717
    .line 718
    invoke-virtual {v6}, La/ouu;->t()La/cb50;

    .line 719
    .line 720
    .line 721
    move-result-object v6

    .line 722
    instance-of v6, v6, La/za50;

    .line 723
    .line 724
    if-eqz v6, :cond_1f

    .line 725
    .line 726
    iget-object v6, v9, La/ltr0;->t:La/pmi0;

    .line 727
    .line 728
    invoke-static {v6}, La/pmi0;->i(La/pmi0;)V

    .line 729
    .line 730
    .line 731
    :cond_1f
    new-instance v6, La/zsr0;

    .line 732
    .line 733
    new-instance v10, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 734
    .line 735
    new-array v11, v7, [Ljava/lang/Object;

    .line 736
    .line 737
    iget-object v12, v2, La/ctf0;->b:La/lsm0;

    .line 738
    .line 739
    iget-object v13, v2, La/ctf0;->b:La/lsm0;

    .line 740
    .line 741
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v11

    .line 745
    const v14, 0x7f13025d

    .line 746
    .line 747
    .line 748
    invoke-virtual {v12, v14, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v11

    .line 752
    invoke-direct {v10, v11, v8, v8, v8}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 753
    .line 754
    .line 755
    new-array v8, v7, [Ljava/lang/Object;

    .line 756
    .line 757
    invoke-static {v8, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v8

    .line 761
    const v11, 0x7f13162b

    .line 762
    .line 763
    .line 764
    invoke-virtual {v13, v11, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v8

    .line 768
    iget-object v5, v5, La/lmr0;->b:Ljava/lang/String;

    .line 769
    .line 770
    const-string v11, ": "

    .line 771
    .line 772
    invoke-static {v8, v11, v5}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v15

    .line 776
    iget-object v0, v0, La/ku;->c:Ljava/lang/String;

    .line 777
    .line 778
    new-instance v16, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 779
    .line 780
    new-array v5, v7, [Ljava/lang/Object;

    .line 781
    .line 782
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v5

    .line 786
    const v7, 0x7f130270

    .line 787
    .line 788
    .line 789
    invoke-virtual {v13, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v18

    .line 793
    sget-object v5, La/pn40;->a:La/pn40;

    .line 794
    .line 795
    sget-object v5, La/p3u0;->c:La/p3u0;

    .line 796
    .line 797
    invoke-static {v3, v4, v5}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v19

    .line 801
    const v3, 0x7f040b72

    .line 802
    .line 803
    .line 804
    invoke-static {v3, v2}, La/ctf0;->b(ILa/ctf0;)I

    .line 805
    .line 806
    .line 807
    move-result v17

    .line 808
    iget-object v2, v1, La/ql5;->f:Ljava/lang/String;

    .line 809
    .line 810
    const/16 v21, 0x1

    .line 811
    .line 812
    move-object/from16 v20, v2

    .line 813
    .line 814
    invoke-direct/range {v16 .. v21}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 815
    .line 816
    .line 817
    invoke-static/range {v16 .. v16}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 818
    .line 819
    .line 820
    move-result-object v20

    .line 821
    iget-wide v1, v1, La/ql5;->a:J

    .line 822
    .line 823
    new-instance v14, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 824
    .line 825
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 826
    .line 827
    .line 828
    move-result-object v18

    .line 829
    const-string v19, "TOTO"

    .line 830
    .line 831
    const-string v17, "REQUEST_SUCCESS_BET_KEY"

    .line 832
    .line 833
    move-object/from16 v16, v0

    .line 834
    .line 835
    invoke-direct/range {v14 .. v20}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 836
    .line 837
    .line 838
    invoke-direct {v6, v10, v14}, La/zsr0;-><init>(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v9, v6}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 842
    .line 843
    .line 844
    sget-object v0, La/wsr0;->a:La/wsr0;

    .line 845
    .line 846
    invoke-virtual {v9, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 850
    .line 851
    :goto_15
    return-object v8

    .line 852
    :pswitch_2
    check-cast v4, La/fir0;

    .line 853
    .line 854
    sget-object v0, La/wne;->a:La/wne;

    .line 855
    .line 856
    iget-byte v1, v5, La/fwk0;->j:B

    .line 857
    .line 858
    if-eqz v1, :cond_22

    .line 859
    .line 860
    if-eq v1, v3, :cond_21

    .line 861
    .line 862
    if-ne v1, v6, :cond_20

    .line 863
    .line 864
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    goto :goto_19

    .line 868
    :cond_20
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 869
    .line 870
    .line 871
    goto :goto_1a

    .line 872
    :cond_21
    iget-object v1, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v1, La/yk00;

    .line 875
    .line 876
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 877
    .line 878
    .line 879
    move-object/from16 v2, p1

    .line 880
    .line 881
    goto :goto_16

    .line 882
    :cond_22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 883
    .line 884
    .line 885
    iget-object v1, v4, La/fir0;->p:La/yk00;

    .line 886
    .line 887
    iget-object v2, v4, La/fir0;->q:La/khf0;

    .line 888
    .line 889
    sget-object v7, La/bm5;->l:La/bm5;

    .line 890
    .line 891
    iput-object v1, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 892
    .line 893
    iput-byte v3, v5, La/fwk0;->j:B

    .line 894
    .line 895
    invoke-static {v2, v7, v5}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    if-ne v2, v0, :cond_23

    .line 900
    .line 901
    goto :goto_18

    .line 902
    :cond_23
    :goto_16
    check-cast v2, La/ql5;

    .line 903
    .line 904
    iput-object v8, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 905
    .line 906
    iput-byte v6, v5, La/fwk0;->j:B

    .line 907
    .line 908
    iget-object v1, v1, La/yk00;->a:La/rkr0;

    .line 909
    .line 910
    iget-object v3, v2, La/ql5;->g:Ljava/lang/String;

    .line 911
    .line 912
    iget-object v2, v2, La/ql5;->f:Ljava/lang/String;

    .line 913
    .line 914
    invoke-interface {v1}, La/rkr0;->r()La/lmr0;

    .line 915
    .line 916
    .line 917
    move-result-object v6

    .line 918
    iget v6, v6, La/lmr0;->a:I

    .line 919
    .line 920
    invoke-interface {v1, v3, v2, v6, v5}, La/rkr0;->k(Ljava/lang/String;Ljava/lang/String;ILa/yje;)Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    if-ne v1, v0, :cond_24

    .line 925
    .line 926
    goto :goto_17

    .line 927
    :cond_24
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 928
    .line 929
    :goto_17
    if-ne v1, v0, :cond_25

    .line 930
    .line 931
    :goto_18
    move-object v8, v0

    .line 932
    goto :goto_1a

    .line 933
    :cond_25
    :goto_19
    iget-object v0, v4, La/fir0;->V:La/bby;

    .line 934
    .line 935
    if-eqz v0, :cond_26

    .line 936
    .line 937
    invoke-interface {v0, v8}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 938
    .line 939
    .line 940
    :cond_26
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 941
    .line 942
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 943
    .line 944
    :cond_27
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 949
    .line 950
    .line 951
    move-object v2, v1

    .line 952
    check-cast v2, La/yhr0;

    .line 953
    .line 954
    const/4 v12, 0x0

    .line 955
    const/16 v13, 0x1bf

    .line 956
    .line 957
    const/4 v3, 0x0

    .line 958
    const/4 v4, 0x0

    .line 959
    const/4 v5, 0x0

    .line 960
    const/4 v6, 0x0

    .line 961
    const/4 v7, 0x0

    .line 962
    const-wide/16 v8, 0x0

    .line 963
    .line 964
    const-wide/16 v10, 0x0

    .line 965
    .line 966
    invoke-static/range {v2 .. v13}, La/yhr0;->a(La/yhr0;La/lhr0;La/lmr0;Ljava/util/Map;ZZJJLjava/lang/String;I)La/yhr0;

    .line 967
    .line 968
    .line 969
    move-result-object v2

    .line 970
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 971
    .line 972
    .line 973
    move-result v1

    .line 974
    if-eqz v1, :cond_27

    .line 975
    .line 976
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 977
    .line 978
    :goto_1a
    return-object v8

    .line 979
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 980
    .line 981
    iget-byte v1, v5, La/fwk0;->j:B

    .line 982
    .line 983
    if-eqz v1, :cond_2a

    .line 984
    .line 985
    if-eq v1, v3, :cond_29

    .line 986
    .line 987
    if-ne v1, v6, :cond_28

    .line 988
    .line 989
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 990
    .line 991
    .line 992
    move-object/from16 v0, p1

    .line 993
    .line 994
    goto :goto_1c

    .line 995
    :cond_28
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    move-object v0, v8

    .line 999
    goto :goto_1c

    .line 1000
    :cond_29
    iget-object v1, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 1001
    .line 1002
    check-cast v1, La/g3u;

    .line 1003
    .line 1004
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1005
    .line 1006
    .line 1007
    move-object/from16 v2, p1

    .line 1008
    .line 1009
    goto :goto_1b

    .line 1010
    :cond_2a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1011
    .line 1012
    .line 1013
    check-cast v4, La/m2r0;

    .line 1014
    .line 1015
    iget-object v1, v4, La/m2r0;->a:La/g3u;

    .line 1016
    .line 1017
    iget-object v2, v4, La/m2r0;->b:La/pmi;

    .line 1018
    .line 1019
    iput-object v1, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 1020
    .line 1021
    iput-byte v3, v5, La/fwk0;->j:B

    .line 1022
    .line 1023
    invoke-virtual {v2, v5}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v2

    .line 1027
    if-ne v2, v0, :cond_2b

    .line 1028
    .line 1029
    goto :goto_1c

    .line 1030
    :cond_2b
    :goto_1b
    check-cast v2, Ljava/lang/Number;

    .line 1031
    .line 1032
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1033
    .line 1034
    .line 1035
    move-result v2

    .line 1036
    iput-object v8, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 1037
    .line 1038
    iput-byte v6, v5, La/fwk0;->j:B

    .line 1039
    .line 1040
    check-cast v1, La/i3u;

    .line 1041
    .line 1042
    invoke-virtual {v1, v2, v5}, La/i3u;->a(ILa/zje;)Ljava/io/Serializable;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v1

    .line 1046
    if-ne v1, v0, :cond_2c

    .line 1047
    .line 1048
    goto :goto_1c

    .line 1049
    :cond_2c
    move-object v0, v1

    .line 1050
    :goto_1c
    return-object v0

    .line 1051
    :pswitch_4
    move-object v0, v4

    .line 1052
    check-cast v0, La/a95;

    .line 1053
    .line 1054
    iget-object v1, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 1055
    .line 1056
    move-object v7, v1

    .line 1057
    check-cast v7, La/lkq0;

    .line 1058
    .line 1059
    iget-object v9, v7, La/i3t0;->i:La/ocj;

    .line 1060
    .line 1061
    sget-object v10, La/wne;->a:La/wne;

    .line 1062
    .line 1063
    iget-byte v1, v5, La/fwk0;->j:B

    .line 1064
    .line 1065
    if-eqz v1, :cond_2f

    .line 1066
    .line 1067
    if-eq v1, v3, :cond_2e

    .line 1068
    .line 1069
    if-ne v1, v6, :cond_2d

    .line 1070
    .line 1071
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1072
    .line 1073
    .line 1074
    goto :goto_20

    .line 1075
    :cond_2d
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 1076
    .line 1077
    .line 1078
    goto/16 :goto_21

    .line 1079
    .line 1080
    :cond_2e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1081
    .line 1082
    .line 1083
    goto :goto_1e

    .line 1084
    :cond_2f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1085
    .line 1086
    .line 1087
    sget v1, La/lkq0;->z:I

    .line 1088
    .line 1089
    iget-object v1, v9, La/ocj;->a:La/p7m0;

    .line 1090
    .line 1091
    :cond_30
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v2

    .line 1095
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1096
    .line 1097
    .line 1098
    move-object v11, v2

    .line 1099
    check-cast v11, La/ikq0;

    .line 1100
    .line 1101
    const/16 v18, 0x0

    .line 1102
    .line 1103
    const/16 v19, 0xfd

    .line 1104
    .line 1105
    const/4 v12, 0x0

    .line 1106
    const/4 v13, 0x1

    .line 1107
    const/4 v14, 0x0

    .line 1108
    const/4 v15, 0x0

    .line 1109
    const/16 v16, 0x0

    .line 1110
    .line 1111
    const/16 v17, 0x0

    .line 1112
    .line 1113
    invoke-static/range {v11 .. v19}, La/ikq0;->a(La/ikq0;ZZZZLa/siq0;III)La/ikq0;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v4

    .line 1117
    invoke-virtual {v1, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v2

    .line 1121
    if-eqz v2, :cond_30

    .line 1122
    .line 1123
    iget-object v1, v7, La/lkq0;->v:La/hti0;

    .line 1124
    .line 1125
    iget-wide v11, v0, La/a95;->a:D

    .line 1126
    .line 1127
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v2

    .line 1131
    check-cast v2, La/ikq0;

    .line 1132
    .line 1133
    iget-object v2, v2, La/ikq0;->h:La/xrz;

    .line 1134
    .line 1135
    iget-object v4, v0, La/a95;->b:Ljava/lang/String;

    .line 1136
    .line 1137
    iput-byte v3, v5, La/fwk0;->j:B

    .line 1138
    .line 1139
    iget-object v0, v1, La/hti0;->a:La/twz;

    .line 1140
    .line 1141
    invoke-interface {v2}, La/xrz;->getId()I

    .line 1142
    .line 1143
    .line 1144
    move-result v3

    .line 1145
    move-wide v1, v11

    .line 1146
    invoke-virtual/range {v0 .. v5}, La/twz;->g(DILjava/lang/String;La/zje;)Ljava/lang/Object;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v0

    .line 1150
    if-ne v0, v10, :cond_31

    .line 1151
    .line 1152
    goto :goto_1d

    .line 1153
    :cond_31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1154
    .line 1155
    :goto_1d
    if-ne v0, v10, :cond_32

    .line 1156
    .line 1157
    goto :goto_1f

    .line 1158
    :cond_32
    :goto_1e
    sget-object v0, La/wen;->b:La/uen;

    .line 1159
    .line 1160
    const/16 v0, 0xdac

    .line 1161
    .line 1162
    sget-object v1, La/bfn;->d:La/bfn;

    .line 1163
    .line 1164
    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    .line 1165
    .line 1166
    .line 1167
    move-result-wide v0

    .line 1168
    iput-byte v6, v5, La/fwk0;->j:B

    .line 1169
    .line 1170
    invoke-static {v0, v1, v5}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v0

    .line 1174
    if-ne v0, v10, :cond_33

    .line 1175
    .line 1176
    :goto_1f
    move-object v8, v10

    .line 1177
    goto :goto_21

    .line 1178
    :cond_33
    :goto_20
    sget v0, La/lkq0;->z:I

    .line 1179
    .line 1180
    iget-object v2, v9, La/ocj;->a:La/p7m0;

    .line 1181
    .line 1182
    :cond_34
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v0

    .line 1186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1187
    .line 1188
    .line 1189
    move-object v8, v0

    .line 1190
    check-cast v8, La/ikq0;

    .line 1191
    .line 1192
    const/4 v15, 0x0

    .line 1193
    const/16 v16, 0xfd

    .line 1194
    .line 1195
    const/4 v9, 0x0

    .line 1196
    const/4 v10, 0x0

    .line 1197
    const/4 v11, 0x0

    .line 1198
    const/4 v12, 0x0

    .line 1199
    const/4 v13, 0x0

    .line 1200
    const/4 v14, 0x0

    .line 1201
    invoke-static/range {v8 .. v16}, La/ikq0;->a(La/ikq0;ZZZZLa/siq0;III)La/ikq0;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v1

    .line 1205
    invoke-virtual {v2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1206
    .line 1207
    .line 1208
    move-result v0

    .line 1209
    if-eqz v0, :cond_34

    .line 1210
    .line 1211
    sget-object v0, La/dkq0;->a:La/dkq0;

    .line 1212
    .line 1213
    invoke-virtual {v7, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1214
    .line 1215
    .line 1216
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1217
    .line 1218
    :goto_21
    return-object v8

    .line 1219
    :pswitch_5
    move-object v0, v4

    .line 1220
    check-cast v0, La/b0p0;

    .line 1221
    .line 1222
    sget-object v1, La/wne;->a:La/wne;

    .line 1223
    .line 1224
    iget-byte v4, v5, La/fwk0;->j:B

    .line 1225
    .line 1226
    if-eqz v4, :cond_37

    .line 1227
    .line 1228
    if-eq v4, v3, :cond_36

    .line 1229
    .line 1230
    if-ne v4, v6, :cond_35

    .line 1231
    .line 1232
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1233
    .line 1234
    .line 1235
    goto/16 :goto_24

    .line 1236
    .line 1237
    :cond_35
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 1238
    .line 1239
    .line 1240
    goto/16 :goto_25

    .line 1241
    .line 1242
    :cond_36
    iget-object v2, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 1243
    .line 1244
    check-cast v2, La/sff0;

    .line 1245
    .line 1246
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1247
    .line 1248
    .line 1249
    move-object/from16 v3, p1

    .line 1250
    .line 1251
    goto :goto_22

    .line 1252
    :cond_37
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1253
    .line 1254
    .line 1255
    iget-object v2, v0, La/b0p0;->v:La/pru;

    .line 1256
    .line 1257
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v2

    .line 1261
    iget-object v4, v0, La/b0p0;->t:La/j3c;

    .line 1262
    .line 1263
    iput-object v2, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 1264
    .line 1265
    iput-byte v3, v5, La/fwk0;->j:B

    .line 1266
    .line 1267
    invoke-virtual {v4, v5}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v3

    .line 1271
    if-ne v3, v1, :cond_38

    .line 1272
    .line 1273
    goto :goto_23

    .line 1274
    :cond_38
    :goto_22
    move-object v10, v3

    .line 1275
    check-cast v10, La/wcb;

    .line 1276
    .line 1277
    iget-object v3, v0, La/b0p0;->u:La/luu;

    .line 1278
    .line 1279
    iget-object v3, v3, La/luu;->a:La/nok0;

    .line 1280
    .line 1281
    invoke-virtual {v3}, La/nok0;->a()Ljava/util/List;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v11

    .line 1285
    iget-object v3, v2, La/sff0;->g:La/mum0;

    .line 1286
    .line 1287
    iget-object v12, v3, La/mum0;->y:La/v5l0;

    .line 1288
    .line 1289
    iget-object v3, v0, La/b0p0;->w:La/lbu;

    .line 1290
    .line 1291
    invoke-virtual {v3}, La/lbu;->j()Z

    .line 1292
    .line 1293
    .line 1294
    move-result v13

    .line 1295
    iget-boolean v14, v2, La/sff0;->J:Z

    .line 1296
    .line 1297
    iget-object v2, v0, La/b0p0;->x:La/r9u;

    .line 1298
    .line 1299
    sget-object v3, La/ygp;->t:La/ygp;

    .line 1300
    .line 1301
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1302
    .line 1303
    .line 1304
    iget-object v2, v2, La/r9u;->a:La/j1q0;

    .line 1305
    .line 1306
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1307
    .line 1308
    .line 1309
    iget-object v2, v2, La/j1q0;->a:La/m1q0;

    .line 1310
    .line 1311
    invoke-virtual {v2, v3}, La/m1q0;->d(La/ygp;)Z

    .line 1312
    .line 1313
    .line 1314
    move-result v15

    .line 1315
    new-instance v20, La/nzo0;

    .line 1316
    .line 1317
    move-object/from16 v9, v20

    .line 1318
    .line 1319
    invoke-direct/range {v9 .. v15}, La/nzo0;-><init>(La/wcb;Ljava/util/List;La/v5l0;ZZZ)V

    .line 1320
    .line 1321
    .line 1322
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 1323
    .line 1324
    iget-object v7, v2, La/ocj;->a:La/p7m0;

    .line 1325
    .line 1326
    :cond_39
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v2

    .line 1330
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1331
    .line 1332
    .line 1333
    move-object/from16 v16, v2

    .line 1334
    .line 1335
    check-cast v16, La/szo0;

    .line 1336
    .line 1337
    const/16 v21, 0x0

    .line 1338
    .line 1339
    const/16 v22, 0x37

    .line 1340
    .line 1341
    const/16 v17, 0x0

    .line 1342
    .line 1343
    const/16 v18, 0x0

    .line 1344
    .line 1345
    const/16 v19, 0x0

    .line 1346
    .line 1347
    invoke-static/range {v16 .. v22}, La/szo0;->a(La/szo0;La/d0t;Ljava/util/ArrayList;La/izo0;La/nzo0;ZI)La/szo0;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v3

    .line 1351
    invoke-virtual {v7, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v2

    .line 1355
    if-eqz v2, :cond_39

    .line 1356
    .line 1357
    iget-object v0, v0, La/b0p0;->s:La/hjd;

    .line 1358
    .line 1359
    new-instance v2, La/cid;

    .line 1360
    .line 1361
    new-instance v3, La/cq2;

    .line 1362
    .line 1363
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1364
    .line 1365
    .line 1366
    const-string v4, "favorite_team"

    .line 1367
    .line 1368
    invoke-direct {v2, v4, v3}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 1369
    .line 1370
    .line 1371
    iput-object v8, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 1372
    .line 1373
    iput-byte v6, v5, La/fwk0;->j:B

    .line 1374
    .line 1375
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v0, v2, v5}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v0

    .line 1382
    if-ne v0, v1, :cond_3a

    .line 1383
    .line 1384
    :goto_23
    move-object v8, v1

    .line 1385
    goto :goto_25

    .line 1386
    :cond_3a
    :goto_24
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1387
    .line 1388
    :goto_25
    return-object v8

    .line 1389
    :pswitch_6
    check-cast v4, La/kr5;

    .line 1390
    .line 1391
    iget v0, v4, La/kr5;->b:I

    .line 1392
    .line 1393
    iget-object v1, v5, La/fwk0;->k:Ljava/lang/Object;

    .line 1394
    .line 1395
    check-cast v1, La/iwk0;

    .line 1396
    .line 1397
    sget-object v4, La/wne;->a:La/wne;

    .line 1398
    .line 1399
    iget-byte v7, v5, La/fwk0;->j:B

    .line 1400
    .line 1401
    if-eqz v7, :cond_3d

    .line 1402
    .line 1403
    if-eq v7, v3, :cond_3c

    .line 1404
    .line 1405
    if-ne v7, v6, :cond_3b

    .line 1406
    .line 1407
    goto :goto_26

    .line 1408
    :cond_3b
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 1409
    .line 1410
    .line 1411
    goto :goto_29

    .line 1412
    :cond_3c
    :goto_26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1413
    .line 1414
    .line 1415
    goto :goto_28

    .line 1416
    :cond_3d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1417
    .line 1418
    .line 1419
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v2

    .line 1423
    check-cast v2, La/dvk0;

    .line 1424
    .line 1425
    iget-object v2, v2, La/dvk0;->C:La/ttk0;

    .line 1426
    .line 1427
    iget-boolean v2, v2, La/ttk0;->p:Z

    .line 1428
    .line 1429
    if-eqz v2, :cond_3e

    .line 1430
    .line 1431
    iget-object v1, v1, La/iwk0;->d0:La/qyg0;

    .line 1432
    .line 1433
    iput-byte v3, v5, La/fwk0;->j:B

    .line 1434
    .line 1435
    invoke-virtual {v1, v0, v5}, La/qyg0;->a(ILa/zje;)Ljava/lang/Object;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v0

    .line 1439
    if-ne v0, v4, :cond_3f

    .line 1440
    .line 1441
    goto :goto_27

    .line 1442
    :cond_3e
    iget-object v1, v1, La/iwk0;->c0:La/pyg0;

    .line 1443
    .line 1444
    iput-byte v6, v5, La/fwk0;->j:B

    .line 1445
    .line 1446
    invoke-virtual {v1, v0, v5}, La/pyg0;->a(ILa/zje;)Ljava/lang/Object;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v0

    .line 1450
    if-ne v0, v4, :cond_3f

    .line 1451
    .line 1452
    :goto_27
    move-object v8, v4

    .line 1453
    goto :goto_29

    .line 1454
    :cond_3f
    :goto_28
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1455
    .line 1456
    :goto_29
    return-object v8

    .line 1457
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
