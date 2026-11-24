.class public final La/ybr0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ecr0;


# direct methods
.method public synthetic constructor <init>(La/ecr0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ybr0;->i:B

    iput-object p1, p0, La/ybr0;->k:La/ecr0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ybr0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ybr0;->k:La/ecr0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/ybr0;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/ybr0;-><init>(La/ecr0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/ybr0;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/ybr0;-><init>(La/ecr0;La/yje;B)V

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
    iput-boolean p0, v0, La/ybr0;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/ybr0;

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/ybr0;-><init>(La/ecr0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/ybr0;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/ybr0;-><init>(La/ecr0;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_3
    new-instance p1, La/ybr0;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-direct {p1, p0, p2, v0}, La/ybr0;-><init>(La/ecr0;La/yje;B)V

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
    iget-byte v0, p0, La/ybr0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ybr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ybr0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ybr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/ybr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/ybr0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/ybr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/ybr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/ybr0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/ybr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/ybr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/ybr0;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/ybr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/ybr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/ybr0;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/ybr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/ybr0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/ybr0;->k:La/ecr0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/ybr0;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v2, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v3, La/ecr0;->B:La/bby;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iput-boolean v2, p0, La/ybr0;->j:Z

    .line 36
    .line 37
    invoke-static {p1, p0}, La/zvw;->H(La/bby;La/yje;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-ne p0, v0, :cond_2

    .line 42
    .line 43
    move-object v4, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :goto_0
    iput-object v4, v3, La/ecr0;->B:La/bby;

    .line 46
    .line 47
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    :goto_1
    return-object v4

    .line 50
    :pswitch_0
    iget-boolean p0, p0, La/ybr0;->j:Z

    .line 51
    .line 52
    sget-object v0, La/wne;->a:La/wne;

    .line 53
    .line 54
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    if-nez p0, :cond_3

    .line 59
    .line 60
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, La/tbr0;

    .line 65
    .line 66
    iget-boolean v0, v0, La/tbr0;->d:Z

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    move v0, v2

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    move v0, p1

    .line 73
    :goto_2
    if-eqz p0, :cond_4

    .line 74
    .line 75
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/tbr0;

    .line 80
    .line 81
    iget-boolean p0, p0, La/tbr0;->e:Z

    .line 82
    .line 83
    if-eqz p0, :cond_4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    move v2, p1

    .line 87
    :goto_3
    if-nez v0, :cond_5

    .line 88
    .line 89
    if-eqz v2, :cond_6

    .line 90
    .line 91
    :cond_5
    sget p0, La/ecr0;->E:I

    .line 92
    .line 93
    invoke-virtual {v3}, La/ecr0;->N()V

    .line 94
    .line 95
    .line 96
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 100
    .line 101
    iget-boolean v5, p0, La/ybr0;->j:Z

    .line 102
    .line 103
    if-eqz v5, :cond_8

    .line 104
    .line 105
    if-ne v5, v2, :cond_7

    .line 106
    .line 107
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, v3, La/ecr0;->v:La/jwu;

    .line 119
    .line 120
    iget-object v1, v3, La/ecr0;->o:Ljava/lang/String;

    .line 121
    .line 122
    iput-boolean v2, p0, La/ybr0;->j:Z

    .line 123
    .line 124
    invoke-virtual {p1, v1, p0}, La/jwu;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    if-ne p0, v0, :cond_9

    .line 129
    .line 130
    move-object v4, v0

    .line 131
    goto :goto_5

    .line 132
    :cond_9
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    :goto_5
    return-object v4

    .line 135
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 136
    .line 137
    iget-boolean v5, p0, La/ybr0;->j:Z

    .line 138
    .line 139
    if-eqz v5, :cond_b

    .line 140
    .line 141
    if-ne v5, v2, :cond_a

    .line 142
    .line 143
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_a
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iget-object p1, v3, La/ecr0;->v:La/jwu;

    .line 155
    .line 156
    iget-object v1, v3, La/ecr0;->o:Ljava/lang/String;

    .line 157
    .line 158
    iput-boolean v2, p0, La/ybr0;->j:Z

    .line 159
    .line 160
    invoke-virtual {p1, v1, p0}, La/jwu;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    if-ne p0, v0, :cond_c

    .line 165
    .line 166
    move-object v4, v0

    .line 167
    goto :goto_7

    .line 168
    :cond_c
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    :goto_7
    return-object v4

    .line 171
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 172
    .line 173
    iget-boolean v5, p0, La/ybr0;->j:Z

    .line 174
    .line 175
    if-eqz v5, :cond_e

    .line 176
    .line 177
    if-ne v5, v2, :cond_d

    .line 178
    .line 179
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    goto :goto_8

    .line 183
    :cond_d
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    goto :goto_9

    .line 187
    :cond_e
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    iget-object p1, v3, La/ecr0;->q:La/yfu;

    .line 191
    .line 192
    iget-object v1, v3, La/ecr0;->o:Ljava/lang/String;

    .line 193
    .line 194
    iput-boolean v2, p0, La/ybr0;->j:Z

    .line 195
    .line 196
    iget-object p1, p1, La/yfu;->a:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast p1, La/y3v;

    .line 199
    .line 200
    iget-object v2, p1, La/y3v;->b:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v2, La/mne;

    .line 203
    .line 204
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 205
    .line 206
    new-instance v5, La/oed;

    .line 207
    .line 208
    const/16 v6, 0x15

    .line 209
    .line 210
    invoke-direct {v5, p1, v1, v4, v6}, La/oed;-><init>(Ljava/lang/Object;Ljava/lang/String;La/yje;B)V

    .line 211
    .line 212
    .line 213
    invoke-static {v2, v5, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    if-ne p1, v0, :cond_f

    .line 218
    .line 219
    move-object v4, v0

    .line 220
    goto :goto_9

    .line 221
    :cond_f
    :goto_8
    move-object v11, p1

    .line 222
    check-cast v11, La/jjy;

    .line 223
    .line 224
    sget p0, La/ecr0;->E:I

    .line 225
    .line 226
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 227
    .line 228
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 229
    .line 230
    :cond_10
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    move-object v4, p1

    .line 238
    check-cast v4, La/tbr0;

    .line 239
    .line 240
    const/4 v10, 0x0

    .line 241
    const/16 v12, 0x27

    .line 242
    .line 243
    const/4 v5, 0x0

    .line 244
    const/4 v6, 0x0

    .line 245
    const/4 v7, 0x0

    .line 246
    const/4 v8, 0x0

    .line 247
    const/4 v9, 0x0

    .line 248
    invoke-static/range {v4 .. v12}, La/tbr0;->a(La/tbr0;La/eme;La/hdm0;La/nc5;ZZZLa/jjy;I)La/tbr0;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    if-eqz p1, :cond_10

    .line 257
    .line 258
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    :goto_9
    return-object v4

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
