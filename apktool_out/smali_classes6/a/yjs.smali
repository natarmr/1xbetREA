.class public final La/yjs;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/yks;


# direct methods
.method public synthetic constructor <init>(La/yks;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yjs;->i:B

    iput-object p1, p0, La/yjs;->k:La/yks;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yjs;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yjs;->k:La/yks;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/yjs;

    .line 9
    .line 10
    const/4 v0, 0x6

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/yjs;-><init>(La/yks;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/yjs;

    .line 16
    .line 17
    const/4 v0, 0x5

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/yjs;-><init>(La/yks;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/yjs;

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/yjs;-><init>(La/yks;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance v0, La/yjs;

    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    invoke-direct {v0, p0, p2, v1}, La/yjs;-><init>(La/yks;La/yje;B)V

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
    iput-boolean p0, v0, La/yjs;->j:Z

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/yjs;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/yjs;-><init>(La/yks;La/yje;B)V

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
    iput-boolean p0, v0, La/yjs;->j:Z

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_4
    new-instance v0, La/yjs;

    .line 60
    .line 61
    const/4 v1, 0x1

    .line 62
    invoke-direct {v0, p0, p2, v1}, La/yjs;-><init>(La/yks;La/yje;B)V

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
    iput-boolean p0, v0, La/yjs;->j:Z

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_5
    new-instance p1, La/yjs;

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    invoke-direct {p1, p0, p2, v0}, La/yjs;-><init>(La/yks;La/yje;B)V

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
    iget-byte v0, p0, La/yjs;->i:B

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
    invoke-virtual {p0, p1, p2}, La/yjs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/yjs;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/yjs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/yjs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/yjs;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/yjs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/yjs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/yjs;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/yjs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/yjs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/yjs;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/yjs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/yjs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/yjs;

    .line 89
    .line 90
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, La/yjs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/yjs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, La/yjs;

    .line 109
    .line 110
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, La/yjs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/yjs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, La/yjs;

    .line 126
    .line 127
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    invoke-virtual {p0, p1}, La/yjs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v1, v0, La/yjs;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/yjs;->k:La/yks;

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
    iget-boolean v7, v0, La/yjs;->j:Z

    .line 18
    .line 19
    if-eqz v7, :cond_1

    .line 20
    .line 21
    if-ne v7, v6, :cond_0

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
    iget-object v3, v5, La/yks;->z:La/vpu;

    .line 35
    .line 36
    iput-boolean v6, v0, La/yjs;->j:Z

    .line 37
    .line 38
    invoke-virtual {v3, v2, v0}, La/vpu;->b(ZLa/yje;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-ne v0, v1, :cond_2

    .line 43
    .line 44
    move-object v4, v1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    sget-object v0, La/kjs;->b:La/kjs;

    .line 47
    .line 48
    sget v1, La/yks;->m0:I

    .line 49
    .line 50
    invoke-virtual {v5, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    :goto_1
    return-object v4

    .line 56
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 57
    .line 58
    iget-boolean v2, v0, La/yjs;->j:Z

    .line 59
    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    if-ne v2, v6, :cond_3

    .line 63
    .line 64
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object v2, v5, La/yks;->A:La/vpu;

    .line 76
    .line 77
    invoke-virtual {v2}, La/vpu;->a()La/fnq;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    new-instance v3, La/rks;

    .line 82
    .line 83
    const/4 v4, 0x2

    .line 84
    invoke-direct {v3, v5, v4}, La/rks;-><init>(La/yks;B)V

    .line 85
    .line 86
    .line 87
    iput-boolean v6, v0, La/yjs;->j:Z

    .line 88
    .line 89
    invoke-virtual {v2, v3, v0}, La/fnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-ne v0, v1, :cond_5

    .line 94
    .line 95
    move-object v4, v1

    .line 96
    goto :goto_3

    .line 97
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    :goto_3
    return-object v4

    .line 100
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 101
    .line 102
    iget-boolean v2, v0, La/yjs;->j:Z

    .line 103
    .line 104
    if-eqz v2, :cond_7

    .line 105
    .line 106
    if-ne v2, v6, :cond_6

    .line 107
    .line 108
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object v2, v5, La/yks;->w:La/hnu;

    .line 120
    .line 121
    iget-object v2, v2, La/hnu;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v2, La/n9s;

    .line 124
    .line 125
    invoke-virtual {v2}, La/n9s;->a()La/i89;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    new-instance v3, La/fc4;

    .line 130
    .line 131
    const/16 v4, 0x1c

    .line 132
    .line 133
    invoke-direct {v3, v2, v4}, La/fc4;-><init>(La/i89;B)V

    .line 134
    .line 135
    .line 136
    new-instance v2, La/rks;

    .line 137
    .line 138
    invoke-direct {v2, v5, v6}, La/rks;-><init>(La/yks;B)V

    .line 139
    .line 140
    .line 141
    iput-boolean v6, v0, La/yjs;->j:Z

    .line 142
    .line 143
    invoke-virtual {v3, v2, v0}, La/fc4;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    if-ne v0, v1, :cond_8

    .line 148
    .line 149
    move-object v4, v1

    .line 150
    goto :goto_5

    .line 151
    :cond_8
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    :goto_5
    return-object v4

    .line 154
    :pswitch_2
    iget-boolean v1, v0, La/yjs;->j:Z

    .line 155
    .line 156
    sget-object v3, La/wne;->a:La/wne;

    .line 157
    .line 158
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    iget-object v7, v0, La/yjs;->k:La/yks;

    .line 162
    .line 163
    if-eqz v1, :cond_d

    .line 164
    .line 165
    sget v0, La/yks;->m0:I

    .line 166
    .line 167
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, La/njs;

    .line 172
    .line 173
    iget-wide v9, v0, La/njs;->a:J

    .line 174
    .line 175
    iget-wide v12, v0, La/njs;->e:J

    .line 176
    .line 177
    iget-object v11, v0, La/njs;->h:La/t3z;

    .line 178
    .line 179
    new-instance v8, La/u3z;

    .line 180
    .line 181
    invoke-direct/range {v8 .. v13}, La/u3z;-><init>(JLa/t3z;J)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, La/njs;

    .line 189
    .line 190
    iget-wide v0, v0, La/njs;->f:J

    .line 191
    .line 192
    cmp-long v0, v9, v0

    .line 193
    .line 194
    if-nez v0, :cond_9

    .line 195
    .line 196
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, La/njs;

    .line 201
    .line 202
    iget-object v0, v0, La/njs;->O:Ljava/lang/Long;

    .line 203
    .line 204
    invoke-virtual {v7, v8, v0}, La/yks;->N(La/u3z;Ljava/lang/Long;)V

    .line 205
    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_9
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, La/njs;

    .line 213
    .line 214
    iget-wide v0, v0, La/njs;->f:J

    .line 215
    .line 216
    const-wide/16 v14, 0x0

    .line 217
    .line 218
    cmp-long v0, v0, v14

    .line 219
    .line 220
    if-nez v0, :cond_a

    .line 221
    .line 222
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, La/njs;

    .line 227
    .line 228
    iget-object v0, v0, La/njs;->O:Ljava/lang/Long;

    .line 229
    .line 230
    invoke-virtual {v7, v8, v0}, La/yks;->N(La/u3z;Ljava/lang/Long;)V

    .line 231
    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_a
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    check-cast v0, La/njs;

    .line 239
    .line 240
    iget-wide v0, v0, La/njs;->f:J

    .line 241
    .line 242
    const-wide/16 v14, -0x2ea

    .line 243
    .line 244
    cmp-long v0, v0, v14

    .line 245
    .line 246
    if-nez v0, :cond_b

    .line 247
    .line 248
    invoke-virtual {v7, v12, v13, v9, v10}, La/yks;->O(JJ)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v7, v8, v4}, La/yks;->N(La/u3z;Ljava/lang/Long;)V

    .line 252
    .line 253
    .line 254
    goto :goto_7

    .line 255
    :cond_b
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    check-cast v0, La/njs;

    .line 260
    .line 261
    iget-wide v0, v0, La/njs;->f:J

    .line 262
    .line 263
    sget-object v3, La/t3z;->c:La/t3z;

    .line 264
    .line 265
    if-ne v11, v3, :cond_c

    .line 266
    .line 267
    move v14, v6

    .line 268
    goto :goto_6

    .line 269
    :cond_c
    move v14, v2

    .line 270
    :goto_6
    invoke-virtual {v7}, La/yks;->M()La/sff0;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    iget-boolean v15, v2, La/sff0;->D0:Z

    .line 275
    .line 276
    move-wide v10, v9

    .line 277
    move-wide v8, v0

    .line 278
    invoke-virtual/range {v7 .. v15}, La/yks;->P(JJJZZ)V

    .line 279
    .line 280
    .line 281
    :goto_7
    sget-object v0, La/nks;->a:La/nks;

    .line 282
    .line 283
    new-instance v1, La/jks;

    .line 284
    .line 285
    const/4 v2, 0x3

    .line 286
    invoke-direct {v1, v7, v4, v2}, La/jks;-><init>(La/yks;La/yje;B)V

    .line 287
    .line 288
    .line 289
    invoke-static {v7, v4, v0, v1, v6}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    iput-object v0, v7, La/yks;->j0:La/bby;

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_d
    sget v0, La/yks;->m0:I

    .line 297
    .line 298
    iget-object v0, v7, La/yks;->h0:La/c4m0;

    .line 299
    .line 300
    if-eqz v0, :cond_e

    .line 301
    .line 302
    invoke-virtual {v0, v4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 303
    .line 304
    .line 305
    :cond_e
    iget-object v0, v7, La/yks;->j0:La/bby;

    .line 306
    .line 307
    if-eqz v0, :cond_f

    .line 308
    .line 309
    invoke-interface {v0, v4}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 310
    .line 311
    .line 312
    :cond_f
    iget-object v0, v7, La/yks;->l0:La/bby;

    .line 313
    .line 314
    if-eqz v0, :cond_10

    .line 315
    .line 316
    invoke-interface {v0, v4}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 317
    .line 318
    .line 319
    :cond_10
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object v0

    .line 322
    :pswitch_3
    iget-boolean v0, v0, La/yjs;->j:Z

    .line 323
    .line 324
    sget-object v1, La/wne;->a:La/wne;

    .line 325
    .line 326
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    new-instance v1, La/hks;

    .line 330
    .line 331
    invoke-direct {v1, v0, v5, v6}, La/hks;-><init>(ZLa/yks;B)V

    .line 332
    .line 333
    .line 334
    sget v0, La/yks;->m0:I

    .line 335
    .line 336
    invoke-virtual {v5, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 337
    .line 338
    .line 339
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    return-object v0

    .line 342
    :pswitch_4
    iget-boolean v0, v0, La/yjs;->j:Z

    .line 343
    .line 344
    sget-object v1, La/wne;->a:La/wne;

    .line 345
    .line 346
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    new-instance v1, La/hks;

    .line 350
    .line 351
    invoke-direct {v1, v0, v5, v2}, La/hks;-><init>(ZLa/yks;B)V

    .line 352
    .line 353
    .line 354
    sget v0, La/yks;->m0:I

    .line 355
    .line 356
    invoke-virtual {v5, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 357
    .line 358
    .line 359
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 360
    .line 361
    return-object v0

    .line 362
    :pswitch_5
    sget-object v1, La/wne;->a:La/wne;

    .line 363
    .line 364
    iget-boolean v2, v0, La/yjs;->j:Z

    .line 365
    .line 366
    if-eqz v2, :cond_12

    .line 367
    .line 368
    if-ne v2, v6, :cond_11

    .line 369
    .line 370
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    move-object/from16 v0, p1

    .line 374
    .line 375
    goto :goto_9

    .line 376
    :cond_11
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    goto :goto_b

    .line 380
    :cond_12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    iget-object v2, v5, La/yks;->T:La/jru;

    .line 384
    .line 385
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    check-cast v3, La/njs;

    .line 390
    .line 391
    iget-wide v7, v3, La/njs;->e:J

    .line 392
    .line 393
    iput-boolean v6, v0, La/yjs;->j:Z

    .line 394
    .line 395
    invoke-virtual {v2, v7, v8, v0}, La/jru;->e(JLa/zje;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    if-ne v0, v1, :cond_13

    .line 400
    .line 401
    move-object v4, v1

    .line 402
    goto :goto_b

    .line 403
    :cond_13
    :goto_9
    check-cast v0, Ljava/lang/CharSequence;

    .line 404
    .line 405
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-nez v1, :cond_14

    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_14
    move-object v4, v0

    .line 413
    :goto_a
    check-cast v4, Ljava/lang/String;

    .line 414
    .line 415
    new-instance v0, La/hxk;

    .line 416
    .line 417
    const/16 v1, 0x11

    .line 418
    .line 419
    invoke-direct {v0, v4, v1}, La/hxk;-><init>(Ljava/lang/String;B)V

    .line 420
    .line 421
    .line 422
    sget v1, La/yks;->m0:I

    .line 423
    .line 424
    invoke-virtual {v5, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 425
    .line 426
    .line 427
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 428
    .line 429
    :goto_b
    return-object v4

    .line 430
    nop

    .line 431
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
