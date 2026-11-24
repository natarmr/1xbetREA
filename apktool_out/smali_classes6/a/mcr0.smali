.class public final La/mcr0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/scr0;


# direct methods
.method public synthetic constructor <init>(La/scr0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mcr0;->i:B

    iput-object p1, p0, La/mcr0;->k:La/scr0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mcr0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mcr0;->k:La/scr0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/mcr0;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/mcr0;-><init>(La/scr0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/mcr0;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/mcr0;-><init>(La/scr0;La/yje;B)V

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
    iput-boolean p0, v0, La/mcr0;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/mcr0;

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/mcr0;-><init>(La/scr0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/mcr0;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/mcr0;-><init>(La/scr0;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_3
    new-instance p1, La/mcr0;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-direct {p1, p0, p2, v0}, La/mcr0;-><init>(La/scr0;La/yje;B)V

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
    iget-byte v0, p0, La/mcr0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/mcr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mcr0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mcr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/mcr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/mcr0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/mcr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/mcr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/mcr0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/mcr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/mcr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/mcr0;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/mcr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/mcr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/mcr0;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/mcr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget-byte v0, p0, La/mcr0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/mcr0;->k:La/scr0;

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
    iget-boolean v5, p0, La/mcr0;->j:Z

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
    iget-object p1, v3, La/scr0;->B:La/bby;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iput-boolean v2, p0, La/mcr0;->j:Z

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
    iput-object v4, v3, La/scr0;->B:La/bby;

    .line 46
    .line 47
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    :goto_1
    return-object v4

    .line 50
    :pswitch_0
    iget-boolean p0, p0, La/mcr0;->j:Z

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
    check-cast v0, La/gcr0;

    .line 65
    .line 66
    iget-boolean v0, v0, La/gcr0;->d:Z

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
    check-cast p0, La/gcr0;

    .line 80
    .line 81
    iget-boolean p0, p0, La/gcr0;->e:Z

    .line 82
    .line 83
    if-nez p0, :cond_5

    .line 84
    .line 85
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, La/gcr0;

    .line 90
    .line 91
    iget-boolean p0, p0, La/gcr0;->f:Z

    .line 92
    .line 93
    if-eqz p0, :cond_4

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    move v2, p1

    .line 97
    :cond_5
    :goto_3
    if-nez v0, :cond_6

    .line 98
    .line 99
    if-eqz v2, :cond_7

    .line 100
    .line 101
    :cond_6
    sget p0, La/scr0;->E:I

    .line 102
    .line 103
    invoke-virtual {v3}, La/scr0;->N()V

    .line 104
    .line 105
    .line 106
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 110
    .line 111
    iget-boolean v5, p0, La/mcr0;->j:Z

    .line 112
    .line 113
    if-eqz v5, :cond_9

    .line 114
    .line 115
    if-ne v5, v2, :cond_8

    .line 116
    .line 117
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_8
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, v3, La/scr0;->v:La/jwu;

    .line 129
    .line 130
    iget-object v1, v3, La/scr0;->o:Ljava/lang/String;

    .line 131
    .line 132
    iput-boolean v2, p0, La/mcr0;->j:Z

    .line 133
    .line 134
    invoke-virtual {p1, v1, p0}, La/jwu;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-ne p0, v0, :cond_a

    .line 139
    .line 140
    move-object v4, v0

    .line 141
    goto :goto_5

    .line 142
    :cond_a
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    :goto_5
    return-object v4

    .line 145
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 146
    .line 147
    iget-boolean v5, p0, La/mcr0;->j:Z

    .line 148
    .line 149
    if-eqz v5, :cond_c

    .line 150
    .line 151
    if-ne v5, v2, :cond_b

    .line 152
    .line 153
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_b
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    goto :goto_7

    .line 161
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iget-object p1, v3, La/scr0;->v:La/jwu;

    .line 165
    .line 166
    iget-object v1, v3, La/scr0;->o:Ljava/lang/String;

    .line 167
    .line 168
    iput-boolean v2, p0, La/mcr0;->j:Z

    .line 169
    .line 170
    invoke-virtual {p1, v1, p0}, La/jwu;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    if-ne p0, v0, :cond_d

    .line 175
    .line 176
    move-object v4, v0

    .line 177
    goto :goto_7

    .line 178
    :cond_d
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    :goto_7
    return-object v4

    .line 181
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 182
    .line 183
    iget-boolean v5, p0, La/mcr0;->j:Z

    .line 184
    .line 185
    if-eqz v5, :cond_f

    .line 186
    .line 187
    if-ne v5, v2, :cond_e

    .line 188
    .line 189
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_e
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_9

    .line 197
    :cond_f
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    iget-object p1, v3, La/scr0;->q:La/hnu;

    .line 201
    .line 202
    iget-object v1, v3, La/scr0;->o:Ljava/lang/String;

    .line 203
    .line 204
    iput-boolean v2, p0, La/mcr0;->j:Z

    .line 205
    .line 206
    iget-object p1, p1, La/hnu;->a:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast p1, La/ouu;

    .line 209
    .line 210
    iget-object v2, p1, La/ouu;->b:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v2, La/mne;

    .line 213
    .line 214
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 215
    .line 216
    new-instance v5, La/oed;

    .line 217
    .line 218
    const/16 v6, 0x16

    .line 219
    .line 220
    invoke-direct {v5, p1, v1, v4, v6}, La/oed;-><init>(Ljava/lang/Object;Ljava/lang/String;La/yje;B)V

    .line 221
    .line 222
    .line 223
    invoke-static {v2, v5, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    if-ne p1, v0, :cond_10

    .line 228
    .line 229
    move-object v4, v0

    .line 230
    goto :goto_9

    .line 231
    :cond_10
    :goto_8
    move-object v12, p1

    .line 232
    check-cast v12, La/rar0;

    .line 233
    .line 234
    sget p0, La/scr0;->E:I

    .line 235
    .line 236
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 237
    .line 238
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 239
    .line 240
    :cond_11
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-object v4, p1

    .line 248
    check-cast v4, La/gcr0;

    .line 249
    .line 250
    iget-object v0, v12, La/rar0;->d:Ljava/util/List;

    .line 251
    .line 252
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    const/4 v11, 0x0

    .line 257
    const/16 v13, 0x47

    .line 258
    .line 259
    const/4 v5, 0x0

    .line 260
    const/4 v6, 0x0

    .line 261
    const/4 v7, 0x0

    .line 262
    const/4 v8, 0x0

    .line 263
    const/4 v9, 0x0

    .line 264
    invoke-static/range {v4 .. v13}, La/gcr0;->a(La/gcr0;La/eme;La/hdm0;La/nc5;ZZZZLa/rar0;I)La/gcr0;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result p1

    .line 272
    if-eqz p1, :cond_11

    .line 273
    .line 274
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    :goto_9
    return-object v4

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
