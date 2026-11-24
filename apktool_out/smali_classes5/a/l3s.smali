.class public final La/l3s;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/k4s;


# direct methods
.method public synthetic constructor <init>(La/k4s;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/l3s;->i:B

    iput-object p1, p0, La/l3s;->k:La/k4s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/l3s;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/l3s;->k:La/k4s;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/l3s;

    .line 9
    .line 10
    const/4 v0, 0x6

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/l3s;-><init>(La/k4s;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/l3s;

    .line 16
    .line 17
    const/4 v0, 0x5

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/l3s;-><init>(La/k4s;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/l3s;

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/l3s;-><init>(La/k4s;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance v0, La/l3s;

    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    invoke-direct {v0, p0, p2, v1}, La/l3s;-><init>(La/k4s;La/yje;B)V

    .line 33
    .line 34
    .line 35
    check-cast p1, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    iput-boolean p0, v0, La/l3s;->j:Z

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/l3s;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/l3s;-><init>(La/k4s;La/yje;B)V

    .line 48
    .line 49
    .line 50
    check-cast p1, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    iput-boolean p0, v0, La/l3s;->j:Z

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_4
    new-instance v0, La/l3s;

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    invoke-direct {v0, p0, p2, v1}, La/l3s;-><init>(La/k4s;La/yje;B)V

    .line 63
    .line 64
    .line 65
    check-cast p1, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    iput-boolean p0, v0, La/l3s;->j:Z

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_5
    new-instance p1, La/l3s;

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    invoke-direct {p1, p0, p2, v0}, La/l3s;-><init>(La/k4s;La/yje;B)V

    .line 78
    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/l3s;->i:B

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
    invoke-virtual {p0, p1, p2}, La/l3s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/l3s;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/l3s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/l3s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/l3s;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/l3s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/l3s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/l3s;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/l3s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    check-cast p2, La/yje;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, La/l3s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/l3s;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/l3s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    check-cast p2, La/yje;

    .line 83
    .line 84
    invoke-virtual {p0, p1, p2}, La/l3s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/l3s;

    .line 89
    .line 90
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, La/l3s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    check-cast p2, La/yje;

    .line 103
    .line 104
    invoke-virtual {p0, p1, p2}, La/l3s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, La/l3s;

    .line 109
    .line 110
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, La/l3s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :pswitch_5
    check-cast p1, La/vne;

    .line 118
    .line 119
    check-cast p2, La/yje;

    .line 120
    .line 121
    invoke-virtual {p0, p1, p2}, La/l3s;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, La/l3s;

    .line 126
    .line 127
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    invoke-virtual {p0, p1}, La/l3s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/l3s;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/l3s;->k:La/k4s;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v2, v0, La/l3s;->j:Z

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    if-ne v2, v6, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v5, La/k4s;->O:La/vpu;

    .line 35
    .line 36
    invoke-virtual {v2}, La/vpu;->a()La/fnq;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v3, La/d4s;

    .line 41
    .line 42
    const/4 v4, 0x2

    .line 43
    invoke-direct {v3, v5, v4}, La/d4s;-><init>(La/k4s;B)V

    .line 44
    .line 45
    .line 46
    iput-boolean v6, v0, La/l3s;->j:Z

    .line 47
    .line 48
    invoke-virtual {v2, v3, v0}, La/fnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-ne v0, v1, :cond_2

    .line 53
    .line 54
    move-object v4, v1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    :goto_1
    return-object v4

    .line 59
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 60
    .line 61
    iget-boolean v2, v0, La/l3s;->j:Z

    .line 62
    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    if-ne v2, v6, :cond_3

    .line 66
    .line 67
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object v2, v5, La/k4s;->L:La/hnu;

    .line 79
    .line 80
    iget-object v2, v2, La/hnu;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, La/n9s;

    .line 83
    .line 84
    invoke-virtual {v2}, La/n9s;->a()La/i89;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    new-instance v3, La/fc4;

    .line 89
    .line 90
    const/16 v4, 0x1c

    .line 91
    .line 92
    invoke-direct {v3, v2, v4}, La/fc4;-><init>(La/i89;B)V

    .line 93
    .line 94
    .line 95
    new-instance v2, La/d4s;

    .line 96
    .line 97
    invoke-direct {v2, v5, v6}, La/d4s;-><init>(La/k4s;B)V

    .line 98
    .line 99
    .line 100
    iput-boolean v6, v0, La/l3s;->j:Z

    .line 101
    .line 102
    invoke-virtual {v3, v2, v0}, La/fc4;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    if-ne v0, v1, :cond_5

    .line 107
    .line 108
    move-object v4, v1

    .line 109
    goto :goto_3

    .line 110
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    :goto_3
    return-object v4

    .line 113
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 114
    .line 115
    iget-boolean v7, v0, La/l3s;->j:Z

    .line 116
    .line 117
    if-eqz v7, :cond_7

    .line 118
    .line 119
    if-ne v7, v6, :cond_6

    .line 120
    .line 121
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iget-object v3, v5, La/k4s;->K:La/rbu;

    .line 133
    .line 134
    invoke-virtual {v3}, La/rbu;->a()La/p7m0;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-static {v3}, La/i120;->W(La/gmq;)La/gmq;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    new-instance v4, La/d4s;

    .line 143
    .line 144
    invoke-direct {v4, v5, v2}, La/d4s;-><init>(La/k4s;B)V

    .line 145
    .line 146
    .line 147
    iput-boolean v6, v0, La/l3s;->j:Z

    .line 148
    .line 149
    invoke-interface {v3, v4, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    if-ne v0, v1, :cond_8

    .line 154
    .line 155
    move-object v4, v1

    .line 156
    goto :goto_5

    .line 157
    :cond_8
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    :goto_5
    return-object v4

    .line 160
    :pswitch_2
    iget-boolean v1, v0, La/l3s;->j:Z

    .line 161
    .line 162
    sget-object v3, La/wne;->a:La/wne;

    .line 163
    .line 164
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    iget-object v7, v0, La/l3s;->k:La/k4s;

    .line 168
    .line 169
    if-eqz v1, :cond_d

    .line 170
    .line 171
    sget v0, La/k4s;->c0:I

    .line 172
    .line 173
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, La/z2s;

    .line 178
    .line 179
    iget-wide v9, v0, La/z2s;->a:J

    .line 180
    .line 181
    iget-wide v12, v0, La/z2s;->e:J

    .line 182
    .line 183
    iget-object v11, v0, La/z2s;->i:La/t3z;

    .line 184
    .line 185
    new-instance v8, La/u3z;

    .line 186
    .line 187
    invoke-direct/range {v8 .. v13}, La/u3z;-><init>(JLa/t3z;J)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, La/z2s;

    .line 195
    .line 196
    iget-wide v0, v0, La/z2s;->f:J

    .line 197
    .line 198
    cmp-long v0, v9, v0

    .line 199
    .line 200
    if-nez v0, :cond_9

    .line 201
    .line 202
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, La/z2s;

    .line 207
    .line 208
    iget-object v0, v0, La/z2s;->g:Ljava/lang/Long;

    .line 209
    .line 210
    invoke-virtual {v7, v8, v0}, La/k4s;->N(La/u3z;Ljava/lang/Long;)V

    .line 211
    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_9
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, La/z2s;

    .line 219
    .line 220
    iget-wide v0, v0, La/z2s;->f:J

    .line 221
    .line 222
    const-wide/16 v14, 0x0

    .line 223
    .line 224
    cmp-long v0, v0, v14

    .line 225
    .line 226
    if-nez v0, :cond_a

    .line 227
    .line 228
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, La/z2s;

    .line 233
    .line 234
    iget-object v0, v0, La/z2s;->g:Ljava/lang/Long;

    .line 235
    .line 236
    invoke-virtual {v7, v8, v0}, La/k4s;->N(La/u3z;Ljava/lang/Long;)V

    .line 237
    .line 238
    .line 239
    goto :goto_7

    .line 240
    :cond_a
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    check-cast v0, La/z2s;

    .line 245
    .line 246
    iget-wide v0, v0, La/z2s;->f:J

    .line 247
    .line 248
    const-wide/16 v14, -0x2ea

    .line 249
    .line 250
    cmp-long v0, v0, v14

    .line 251
    .line 252
    if-nez v0, :cond_b

    .line 253
    .line 254
    invoke-virtual {v7, v12, v13, v9, v10}, La/k4s;->O(JJ)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v7, v8, v4}, La/k4s;->N(La/u3z;Ljava/lang/Long;)V

    .line 258
    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_b
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, La/z2s;

    .line 266
    .line 267
    iget-wide v0, v0, La/z2s;->f:J

    .line 268
    .line 269
    sget-object v3, La/t3z;->c:La/t3z;

    .line 270
    .line 271
    if-ne v11, v3, :cond_c

    .line 272
    .line 273
    move v14, v6

    .line 274
    goto :goto_6

    .line 275
    :cond_c
    move v14, v2

    .line 276
    :goto_6
    iget-object v2, v7, La/k4s;->V:La/sff0;

    .line 277
    .line 278
    iget-boolean v15, v2, La/sff0;->D0:Z

    .line 279
    .line 280
    move-wide v10, v9

    .line 281
    move-wide v8, v0

    .line 282
    invoke-virtual/range {v7 .. v15}, La/k4s;->P(JJJZZ)V

    .line 283
    .line 284
    .line 285
    :goto_7
    iget-object v0, v7, La/k4s;->P:La/r1u;

    .line 286
    .line 287
    invoke-virtual {v0}, La/r1u;->a()La/i89;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    iget-object v1, v7, La/k4s;->S:La/j1u;

    .line 292
    .line 293
    iget-object v1, v1, La/j1u;->a:La/as20;

    .line 294
    .line 295
    iget-object v1, v1, La/as20;->a:La/yr20;

    .line 296
    .line 297
    iget-object v1, v1, La/yr20;->b:La/p7m0;

    .line 298
    .line 299
    new-instance v2, La/i89;

    .line 300
    .line 301
    const/16 v3, 0x16

    .line 302
    .line 303
    invoke-direct {v2, v1, v3}, La/i89;-><init>(La/gmq;B)V

    .line 304
    .line 305
    .line 306
    new-instance v1, La/wx4;

    .line 307
    .line 308
    const/16 v3, 0x9

    .line 309
    .line 310
    invoke-direct {v1, v7, v4, v3}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 311
    .line 312
    .line 313
    new-instance v3, La/p6d;

    .line 314
    .line 315
    invoke-direct {v3, v0, v2, v1, v6}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 316
    .line 317
    .line 318
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    sget-object v1, La/b4s;->h:La/b4s;

    .line 323
    .line 324
    invoke-static {v3, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    iput-object v0, v7, La/k4s;->a0:La/c4m0;

    .line 329
    .line 330
    goto :goto_8

    .line 331
    :cond_d
    sget v0, La/k4s;->c0:I

    .line 332
    .line 333
    iget-object v0, v7, La/k4s;->Y:La/c4m0;

    .line 334
    .line 335
    if-eqz v0, :cond_e

    .line 336
    .line 337
    invoke-virtual {v0, v4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 338
    .line 339
    .line 340
    :cond_e
    iget-object v0, v7, La/k4s;->a0:La/c4m0;

    .line 341
    .line 342
    if-eqz v0, :cond_f

    .line 343
    .line 344
    invoke-virtual {v0, v4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 345
    .line 346
    .line 347
    :cond_f
    iget-object v0, v7, La/k4s;->X:La/c4m0;

    .line 348
    .line 349
    if-eqz v0, :cond_10

    .line 350
    .line 351
    invoke-virtual {v0, v4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 352
    .line 353
    .line 354
    :cond_10
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 355
    .line 356
    return-object v0

    .line 357
    :pswitch_3
    iget-boolean v0, v0, La/l3s;->j:Z

    .line 358
    .line 359
    sget-object v1, La/wne;->a:La/wne;

    .line 360
    .line 361
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    if-eqz v0, :cond_11

    .line 365
    .line 366
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    check-cast v0, La/z2s;

    .line 371
    .line 372
    iget-object v0, v0, La/z2s;->I:La/fsr;

    .line 373
    .line 374
    if-eqz v0, :cond_11

    .line 375
    .line 376
    new-instance v0, La/gwr;

    .line 377
    .line 378
    const/16 v1, 0x19

    .line 379
    .line 380
    invoke-direct {v0, v1}, La/gwr;-><init>(B)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v5, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 384
    .line 385
    .line 386
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 387
    .line 388
    return-object v0

    .line 389
    :pswitch_4
    iget-boolean v0, v0, La/l3s;->j:Z

    .line 390
    .line 391
    sget-object v1, La/wne;->a:La/wne;

    .line 392
    .line 393
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    if-eqz v0, :cond_12

    .line 397
    .line 398
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    check-cast v0, La/z2s;

    .line 403
    .line 404
    iget-object v0, v0, La/z2s;->I:La/fsr;

    .line 405
    .line 406
    if-eqz v0, :cond_12

    .line 407
    .line 408
    new-instance v0, La/gwr;

    .line 409
    .line 410
    const/16 v1, 0x18

    .line 411
    .line 412
    invoke-direct {v0, v1}, La/gwr;-><init>(B)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v5, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 416
    .line 417
    .line 418
    :cond_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 419
    .line 420
    return-object v0

    .line 421
    :pswitch_5
    sget-object v1, La/wne;->a:La/wne;

    .line 422
    .line 423
    iget-boolean v2, v0, La/l3s;->j:Z

    .line 424
    .line 425
    if-eqz v2, :cond_14

    .line 426
    .line 427
    if-ne v2, v6, :cond_13

    .line 428
    .line 429
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    move-object/from16 v0, p1

    .line 433
    .line 434
    goto :goto_9

    .line 435
    :cond_13
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    goto :goto_a

    .line 439
    :cond_14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    iget-object v2, v5, La/k4s;->J:La/jru;

    .line 443
    .line 444
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    check-cast v3, La/z2s;

    .line 449
    .line 450
    iget-wide v3, v3, La/z2s;->e:J

    .line 451
    .line 452
    iput-boolean v6, v0, La/l3s;->j:Z

    .line 453
    .line 454
    invoke-virtual {v2, v3, v4, v0}, La/jru;->e(JLa/zje;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    if-ne v0, v1, :cond_15

    .line 459
    .line 460
    move-object v4, v1

    .line 461
    goto :goto_a

    .line 462
    :cond_15
    :goto_9
    check-cast v0, Ljava/lang/String;

    .line 463
    .line 464
    new-instance v1, La/hxk;

    .line 465
    .line 466
    const/16 v2, 0xe

    .line 467
    .line 468
    invoke-direct {v1, v0, v2}, La/hxk;-><init>(Ljava/lang/String;B)V

    .line 469
    .line 470
    .line 471
    sget v0, La/k4s;->c0:I

    .line 472
    .line 473
    invoke-virtual {v5, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 474
    .line 475
    .line 476
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 477
    .line 478
    :goto_a
    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
