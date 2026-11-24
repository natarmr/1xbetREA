.class public final La/cvq;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ivq;


# direct methods
.method public synthetic constructor <init>(La/ivq;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/cvq;->i:B

    iput-object p1, p0, La/cvq;->k:La/ivq;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/cvq;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/cvq;->k:La/ivq;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/cvq;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/cvq;-><init>(La/ivq;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/cvq;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/cvq;-><init>(La/ivq;La/yje;B)V

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
    move-result p0

    .line 27
    iput-boolean p0, v0, La/cvq;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/cvq;

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/cvq;-><init>(La/ivq;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/cvq;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/cvq;-><init>(La/ivq;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_3
    new-instance p1, La/cvq;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-direct {p1, p0, p2, v0}, La/cvq;-><init>(La/ivq;La/yje;B)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
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
    iget-byte v0, p0, La/cvq;->i:B

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
    invoke-virtual {p0, p1, p2}, La/cvq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/cvq;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/cvq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/cvq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/cvq;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/cvq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/cvq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/cvq;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/cvq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/cvq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/cvq;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/cvq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/cvq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/cvq;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/cvq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cvq;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, v0, La/cvq;->k:La/ivq;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/cvq;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v4, La/ivq;->z:La/bby;

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    iput-boolean v3, v0, La/cvq;->j:Z

    .line 38
    .line 39
    invoke-static {v2, v0}, La/zvw;->H(La/bby;La/yje;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-ne v0, v1, :cond_2

    .line 44
    .line 45
    move-object v5, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    :goto_1
    return-object v5

    .line 50
    :pswitch_0
    iget-boolean v0, v0, La/cvq;->j:Z

    .line 51
    .line 52
    sget-object v1, La/wne;->a:La/wne;

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, La/suq;

    .line 64
    .line 65
    iget-boolean v1, v1, La/suq;->d:Z

    .line 66
    .line 67
    if-nez v1, :cond_3

    .line 68
    .line 69
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, La/suq;

    .line 74
    .line 75
    iget-boolean v1, v1, La/suq;->c:Z

    .line 76
    .line 77
    if-nez v1, :cond_3

    .line 78
    .line 79
    invoke-virtual {v4}, La/ivq;->M()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, La/ivq;->N()V

    .line 83
    .line 84
    .line 85
    :cond_3
    if-nez v0, :cond_5

    .line 86
    .line 87
    iget-object v0, v4, La/ivq;->z:La/bby;

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    invoke-interface {v0, v5}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    iput-object v5, v4, La/ivq;->z:La/bby;

    .line 95
    .line 96
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 100
    .line 101
    iget-boolean v6, v0, La/cvq;->j:Z

    .line 102
    .line 103
    if-eqz v6, :cond_7

    .line 104
    .line 105
    if-ne v6, v3, :cond_6

    .line 106
    .line 107
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object v2, v4, La/ivq;->v:La/jwu;

    .line 119
    .line 120
    iget-object v4, v4, La/ivq;->p:Ljava/lang/String;

    .line 121
    .line 122
    iput-boolean v3, v0, La/cvq;->j:Z

    .line 123
    .line 124
    invoke-virtual {v2, v4, v0}, La/jwu;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-ne v0, v1, :cond_8

    .line 129
    .line 130
    move-object v5, v1

    .line 131
    goto :goto_3

    .line 132
    :cond_8
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    :goto_3
    return-object v5

    .line 135
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 136
    .line 137
    iget-boolean v6, v0, La/cvq;->j:Z

    .line 138
    .line 139
    if-eqz v6, :cond_a

    .line 140
    .line 141
    if-ne v6, v3, :cond_9

    .line 142
    .line 143
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iget-object v2, v4, La/ivq;->v:La/jwu;

    .line 155
    .line 156
    iget-object v4, v4, La/ivq;->p:Ljava/lang/String;

    .line 157
    .line 158
    iput-boolean v3, v0, La/cvq;->j:Z

    .line 159
    .line 160
    invoke-virtual {v2, v4, v0}, La/jwu;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-ne v0, v1, :cond_b

    .line 165
    .line 166
    move-object v5, v1

    .line 167
    goto :goto_5

    .line 168
    :cond_b
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    :goto_5
    return-object v5

    .line 171
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 172
    .line 173
    iget-boolean v6, v0, La/cvq;->j:Z

    .line 174
    .line 175
    if-eqz v6, :cond_d

    .line 176
    .line 177
    if-ne v6, v3, :cond_c

    .line 178
    .line 179
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    move-object/from16 v0, p1

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_c
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    sget v2, La/ivq;->B:I

    .line 193
    .line 194
    iget-object v2, v4, La/i3t0;->i:La/ocj;

    .line 195
    .line 196
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 197
    .line 198
    :cond_e
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-object v6, v5

    .line 206
    check-cast v6, La/suq;

    .line 207
    .line 208
    const/4 v15, 0x0

    .line 209
    const/16 v16, 0x1f0

    .line 210
    .line 211
    const/4 v7, 0x0

    .line 212
    const/4 v8, 0x0

    .line 213
    const/4 v9, 0x1

    .line 214
    const/4 v10, 0x0

    .line 215
    const/4 v11, 0x0

    .line 216
    const/4 v12, 0x0

    .line 217
    const/4 v13, 0x0

    .line 218
    const/4 v14, 0x0

    .line 219
    invoke-static/range {v6 .. v16}, La/suq;->a(La/suq;ZZZZLa/kpm;Ljava/util/List;La/zdm0;La/nc5;ZI)La/suq;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    invoke-virtual {v2, v5, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-eqz v5, :cond_e

    .line 228
    .line 229
    iget-object v2, v4, La/ivq;->o:La/x4u;

    .line 230
    .line 231
    iget-object v5, v4, La/ivq;->p:Ljava/lang/String;

    .line 232
    .line 233
    iput-boolean v3, v0, La/cvq;->j:Z

    .line 234
    .line 235
    iget-object v2, v2, La/x4u;->a:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v2, La/wti;

    .line 238
    .line 239
    invoke-virtual {v2, v0, v5, v3}, La/wti;->g(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    if-ne v0, v1, :cond_f

    .line 244
    .line 245
    move-object v5, v1

    .line 246
    goto :goto_7

    .line 247
    :cond_f
    :goto_6
    check-cast v0, La/vuq;

    .line 248
    .line 249
    new-instance v1, La/f5o;

    .line 250
    .line 251
    const/16 v2, 0x1c

    .line 252
    .line 253
    invoke-direct {v1, v0, v2}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 254
    .line 255
    .line 256
    sget v0, La/ivq;->B:I

    .line 257
    .line 258
    invoke-virtual {v4, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 259
    .line 260
    .line 261
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    :goto_7
    return-object v5

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
