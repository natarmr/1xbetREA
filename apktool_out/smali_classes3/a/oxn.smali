.class public final La/oxn;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/t33;

.field public final synthetic l:J

.field public final synthetic m:La/zsf;


# direct methods
.method public synthetic constructor <init>(La/t33;JLa/zsf;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/oxn;->i:B

    iput-object p1, p0, La/oxn;->k:La/t33;

    iput-wide p2, p0, La/oxn;->l:J

    iput-object p4, p0, La/oxn;->m:La/zsf;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/oxn;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/oxn;

    .line 7
    .line 8
    iget-object v4, p0, La/oxn;->m:La/zsf;

    .line 9
    .line 10
    const/4 v6, 0x5

    .line 11
    iget-object v1, p0, La/oxn;->k:La/t33;

    .line 12
    .line 13
    iget-wide v2, p0, La/oxn;->l:J

    .line 14
    .line 15
    move-object v5, p2

    .line 16
    invoke-direct/range {v0 .. v6}, La/oxn;-><init>(La/t33;JLa/zsf;La/yje;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v6, p2

    .line 21
    new-instance v1, La/oxn;

    .line 22
    .line 23
    iget-object v5, p0, La/oxn;->m:La/zsf;

    .line 24
    .line 25
    const/4 v7, 0x4

    .line 26
    iget-object v2, p0, La/oxn;->k:La/t33;

    .line 27
    .line 28
    iget-wide v3, p0, La/oxn;->l:J

    .line 29
    .line 30
    invoke-direct/range {v1 .. v7}, La/oxn;-><init>(La/t33;JLa/zsf;La/yje;B)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_1
    move-object v6, p2

    .line 35
    new-instance v1, La/oxn;

    .line 36
    .line 37
    iget-object v5, p0, La/oxn;->m:La/zsf;

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    iget-object v2, p0, La/oxn;->k:La/t33;

    .line 41
    .line 42
    iget-wide v3, p0, La/oxn;->l:J

    .line 43
    .line 44
    invoke-direct/range {v1 .. v7}, La/oxn;-><init>(La/t33;JLa/zsf;La/yje;B)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :pswitch_2
    move-object v6, p2

    .line 49
    new-instance v1, La/oxn;

    .line 50
    .line 51
    iget-object v5, p0, La/oxn;->m:La/zsf;

    .line 52
    .line 53
    const/4 v7, 0x2

    .line 54
    iget-object v2, p0, La/oxn;->k:La/t33;

    .line 55
    .line 56
    iget-wide v3, p0, La/oxn;->l:J

    .line 57
    .line 58
    invoke-direct/range {v1 .. v7}, La/oxn;-><init>(La/t33;JLa/zsf;La/yje;B)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :pswitch_3
    move-object v6, p2

    .line 63
    new-instance v1, La/oxn;

    .line 64
    .line 65
    iget-object v5, p0, La/oxn;->m:La/zsf;

    .line 66
    .line 67
    const/4 v7, 0x1

    .line 68
    iget-object v2, p0, La/oxn;->k:La/t33;

    .line 69
    .line 70
    iget-wide v3, p0, La/oxn;->l:J

    .line 71
    .line 72
    invoke-direct/range {v1 .. v7}, La/oxn;-><init>(La/t33;JLa/zsf;La/yje;B)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :pswitch_4
    move-object v6, p2

    .line 77
    new-instance v1, La/oxn;

    .line 78
    .line 79
    iget-object v5, p0, La/oxn;->m:La/zsf;

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    iget-object v2, p0, La/oxn;->k:La/t33;

    .line 83
    .line 84
    iget-wide v3, p0, La/oxn;->l:J

    .line 85
    .line 86
    invoke-direct/range {v1 .. v7}, La/oxn;-><init>(La/t33;JLa/zsf;La/yje;B)V

    .line 87
    .line 88
    .line 89
    return-object v1

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
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
    iget-byte v0, p0, La/oxn;->i:B

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
    invoke-virtual {p0, p1, p2}, La/oxn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/oxn;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/oxn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/oxn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/oxn;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/oxn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/oxn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/oxn;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/oxn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/oxn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/oxn;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/oxn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/oxn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/oxn;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/oxn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, La/oxn;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/oxn;

    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/oxn;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/oxn;->i:B

    .line 2
    .line 3
    const/16 v1, 0x190

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    iget-object v3, p0, La/oxn;->m:La/zsf;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-wide v6, p0, La/oxn;->l:J

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const-string v9, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    const/4 v10, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v11, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v0, p0, La/oxn;->j:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    if-ne v0, v10, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, La/y3d;

    .line 38
    .line 39
    invoke-direct {v0, v6, v7}, La/y3d;-><init>(J)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v4, v3, v2}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iput-boolean v10, p0, La/oxn;->j:Z

    .line 47
    .line 48
    move-object v1, v0

    .line 49
    iget-object v0, p0, La/oxn;->k:La/t33;

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/16 v6, 0xc

    .line 54
    .line 55
    move-object v5, p0

    .line 56
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-ne v0, v11, :cond_2

    .line 61
    .line 62
    move-object v8, v11

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    :goto_1
    return-object v8

    .line 67
    :pswitch_0
    sget-object v11, La/wne;->a:La/wne;

    .line 68
    .line 69
    iget-boolean v0, p0, La/oxn;->j:Z

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    if-ne v0, v10, :cond_3

    .line 74
    .line 75
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance v0, La/y3d;

    .line 87
    .line 88
    invoke-direct {v0, v6, v7}, La/y3d;-><init>(J)V

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v4, v3, v2}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iput-boolean v10, p0, La/oxn;->j:Z

    .line 96
    .line 97
    move-object v1, v0

    .line 98
    iget-object v0, p0, La/oxn;->k:La/t33;

    .line 99
    .line 100
    const/4 v3, 0x0

    .line 101
    const/4 v4, 0x0

    .line 102
    const/16 v6, 0xc

    .line 103
    .line 104
    move-object v5, p0

    .line 105
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-ne v0, v11, :cond_5

    .line 110
    .line 111
    move-object v8, v11

    .line 112
    goto :goto_3

    .line 113
    :cond_5
    :goto_2
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    :goto_3
    return-object v8

    .line 116
    :pswitch_1
    sget-object v11, La/wne;->a:La/wne;

    .line 117
    .line 118
    iget-boolean v0, p0, La/oxn;->j:Z

    .line 119
    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    if-ne v0, v10, :cond_6

    .line 123
    .line 124
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_6
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    new-instance v1, La/y3d;

    .line 136
    .line 137
    invoke-direct {v1, v6, v7}, La/y3d;-><init>(J)V

    .line 138
    .line 139
    .line 140
    const/16 v0, 0x258

    .line 141
    .line 142
    invoke-static {v0, v4, v3, v2}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    iput-boolean v10, p0, La/oxn;->j:Z

    .line 147
    .line 148
    iget-object v0, p0, La/oxn;->k:La/t33;

    .line 149
    .line 150
    const/4 v3, 0x0

    .line 151
    const/4 v4, 0x0

    .line 152
    const/16 v6, 0xc

    .line 153
    .line 154
    move-object v5, p0

    .line 155
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-ne v0, v11, :cond_8

    .line 160
    .line 161
    move-object v8, v11

    .line 162
    goto :goto_5

    .line 163
    :cond_8
    :goto_4
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    :goto_5
    return-object v8

    .line 166
    :pswitch_2
    sget-object v11, La/wne;->a:La/wne;

    .line 167
    .line 168
    iget-boolean v0, p0, La/oxn;->j:Z

    .line 169
    .line 170
    if-eqz v0, :cond_a

    .line 171
    .line 172
    if-ne v0, v10, :cond_9

    .line 173
    .line 174
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_9
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    new-instance v0, La/y3d;

    .line 186
    .line 187
    invoke-direct {v0, v6, v7}, La/y3d;-><init>(J)V

    .line 188
    .line 189
    .line 190
    invoke-static {v1, v4, v3, v2}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    iput-boolean v10, p0, La/oxn;->j:Z

    .line 195
    .line 196
    move-object v1, v0

    .line 197
    iget-object v0, p0, La/oxn;->k:La/t33;

    .line 198
    .line 199
    const/4 v3, 0x0

    .line 200
    const/4 v4, 0x0

    .line 201
    const/16 v6, 0xc

    .line 202
    .line 203
    move-object v5, p0

    .line 204
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    if-ne v0, v11, :cond_b

    .line 209
    .line 210
    move-object v8, v11

    .line 211
    goto :goto_7

    .line 212
    :cond_b
    :goto_6
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    :goto_7
    return-object v8

    .line 215
    :pswitch_3
    sget-object v11, La/wne;->a:La/wne;

    .line 216
    .line 217
    iget-boolean v0, p0, La/oxn;->j:Z

    .line 218
    .line 219
    if-eqz v0, :cond_d

    .line 220
    .line 221
    if-ne v0, v10, :cond_c

    .line 222
    .line 223
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_c
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    goto :goto_9

    .line 231
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    new-instance v0, La/y3d;

    .line 235
    .line 236
    invoke-direct {v0, v6, v7}, La/y3d;-><init>(J)V

    .line 237
    .line 238
    .line 239
    invoke-static {v1, v4, v3, v2}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    iput-boolean v10, p0, La/oxn;->j:Z

    .line 244
    .line 245
    move-object v1, v0

    .line 246
    iget-object v0, p0, La/oxn;->k:La/t33;

    .line 247
    .line 248
    const/4 v3, 0x0

    .line 249
    const/4 v4, 0x0

    .line 250
    const/16 v6, 0xc

    .line 251
    .line 252
    move-object v5, p0

    .line 253
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    if-ne v0, v11, :cond_e

    .line 258
    .line 259
    move-object v8, v11

    .line 260
    goto :goto_9

    .line 261
    :cond_e
    :goto_8
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    :goto_9
    return-object v8

    .line 264
    :pswitch_4
    sget-object v11, La/wne;->a:La/wne;

    .line 265
    .line 266
    iget-boolean v0, p0, La/oxn;->j:Z

    .line 267
    .line 268
    if-eqz v0, :cond_10

    .line 269
    .line 270
    if-ne v0, v10, :cond_f

    .line 271
    .line 272
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    goto :goto_a

    .line 276
    :cond_f
    invoke-static {v9}, La/jf4;->n(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    goto :goto_b

    .line 280
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    new-instance v0, La/y3d;

    .line 284
    .line 285
    invoke-direct {v0, v6, v7}, La/y3d;-><init>(J)V

    .line 286
    .line 287
    .line 288
    invoke-static {v1, v4, v3, v2}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    iput-boolean v10, p0, La/oxn;->j:Z

    .line 293
    .line 294
    move-object v1, v0

    .line 295
    iget-object v0, p0, La/oxn;->k:La/t33;

    .line 296
    .line 297
    const/4 v3, 0x0

    .line 298
    const/4 v4, 0x0

    .line 299
    const/16 v6, 0xc

    .line 300
    .line 301
    move-object v5, p0

    .line 302
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    if-ne v0, v11, :cond_11

    .line 307
    .line 308
    move-object v8, v11

    .line 309
    goto :goto_b

    .line 310
    :cond_11
    :goto_a
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    :goto_b
    return-object v8

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
