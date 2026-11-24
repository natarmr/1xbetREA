.class public final La/x3q0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/d4q0;


# direct methods
.method public synthetic constructor <init>(La/d4q0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/x3q0;->i:B

    iput-object p1, p0, La/x3q0;->k:La/d4q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/x3q0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/x3q0;->k:La/d4q0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/x3q0;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/x3q0;-><init>(La/d4q0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/x3q0;

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/x3q0;-><init>(La/d4q0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/x3q0;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/x3q0;-><init>(La/d4q0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iput-boolean p0, v0, La/x3q0;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    new-instance p1, La/x3q0;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/x3q0;-><init>(La/d4q0;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_3
    new-instance p1, La/x3q0;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-direct {p1, p0, p2, v0}, La/x3q0;-><init>(La/d4q0;La/yje;B)V

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
    iget-byte v0, p0, La/x3q0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/x3q0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/x3q0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/x3q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/x3q0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/x3q0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/x3q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/x3q0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/x3q0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/x3q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/x3q0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/x3q0;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/x3q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/x3q0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/x3q0;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/x3q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/x3q0;->i:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, p0, La/x3q0;->k:La/d4q0;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v1, p0, La/x3q0;->j:Z

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    if-ne v1, v3, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v4, La/d4q0;->w:La/jwu;

    .line 34
    .line 35
    iget-object v1, v4, La/d4q0;->o:Ljava/lang/String;

    .line 36
    .line 37
    iput-boolean v3, p0, La/x3q0;->j:Z

    .line 38
    .line 39
    invoke-virtual {p1, v1, p0}, La/jwu;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-ne p0, v0, :cond_2

    .line 44
    .line 45
    move-object v5, v0

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
    sget-object v0, La/wne;->a:La/wne;

    .line 51
    .line 52
    iget-boolean v1, p0, La/x3q0;->j:Z

    .line 53
    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    if-ne v1, v3, :cond_3

    .line 57
    .line 58
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, v4, La/d4q0;->z:La/bby;

    .line 70
    .line 71
    if-eqz p1, :cond_5

    .line 72
    .line 73
    iput-boolean v3, p0, La/x3q0;->j:Z

    .line 74
    .line 75
    invoke-static {p1, p0}, La/zvw;->H(La/bby;La/yje;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-ne p0, v0, :cond_5

    .line 80
    .line 81
    move-object v5, v0

    .line 82
    goto :goto_3

    .line 83
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    :goto_3
    return-object v5

    .line 86
    :pswitch_1
    iget-boolean p0, p0, La/x3q0;->j:Z

    .line 87
    .line 88
    sget-object v0, La/wne;->a:La/wne;

    .line 89
    .line 90
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    if-eqz p0, :cond_8

    .line 94
    .line 95
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/s3q0;

    .line 100
    .line 101
    iget-boolean p0, p0, La/s3q0;->b:Z

    .line 102
    .line 103
    if-nez p0, :cond_6

    .line 104
    .line 105
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, La/s3q0;

    .line 110
    .line 111
    iget-boolean p0, p0, La/s3q0;->c:Z

    .line 112
    .line 113
    if-eqz p0, :cond_8

    .line 114
    .line 115
    :cond_6
    iget-object p0, v4, La/d4q0;->z:La/bby;

    .line 116
    .line 117
    if-eqz p0, :cond_7

    .line 118
    .line 119
    invoke-interface {p0, v5}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 120
    .line 121
    .line 122
    :cond_7
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    const-wide/16 p0, 0x1e

    .line 127
    .line 128
    sget-object v0, La/bfn;->e:La/bfn;

    .line 129
    .line 130
    invoke-static {p0, p1, v0}, La/ibc;->w0(JLa/bfn;)J

    .line 131
    .line 132
    .line 133
    move-result-wide v7

    .line 134
    new-instance v11, La/x3q0;

    .line 135
    .line 136
    const/4 p0, 0x4

    .line 137
    invoke-direct {v11, v4, v5, p0}, La/x3q0;-><init>(La/d4q0;La/yje;B)V

    .line 138
    .line 139
    .line 140
    const/4 v12, 0x6

    .line 141
    const/4 v9, 0x0

    .line 142
    const/4 v10, 0x0

    .line 143
    invoke-static/range {v6 .. v12}, La/sac;->a0(La/vne;JLkotlin/coroutines/CoroutineContext;La/d4u0;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    iput-object p0, v4, La/d4q0;->z:La/bby;

    .line 148
    .line 149
    const/4 p0, 0x0

    .line 150
    invoke-virtual {v4, p0}, La/d4q0;->M(Z)V

    .line 151
    .line 152
    .line 153
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 157
    .line 158
    iget-boolean v6, p0, La/x3q0;->j:Z

    .line 159
    .line 160
    if-eqz v6, :cond_a

    .line 161
    .line 162
    if-ne v6, v3, :cond_9

    .line 163
    .line 164
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    iget-object p1, v4, La/d4q0;->t:La/abu;

    .line 176
    .line 177
    iget-object v2, v4, La/d4q0;->o:Ljava/lang/String;

    .line 178
    .line 179
    iput-boolean v3, p0, La/x3q0;->j:Z

    .line 180
    .line 181
    iget-object v3, p1, La/abu;->c:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v3, La/mne;

    .line 184
    .line 185
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 186
    .line 187
    new-instance v4, La/juy;

    .line 188
    .line 189
    invoke-direct {v4, p1, v2, v5, v1}, La/juy;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 190
    .line 191
    .line 192
    invoke-static {v3, v4, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    if-ne p0, v0, :cond_b

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    :goto_4
    if-ne p0, v0, :cond_c

    .line 202
    .line 203
    move-object v5, v0

    .line 204
    goto :goto_6

    .line 205
    :cond_c
    :goto_5
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    :goto_6
    return-object v5

    .line 208
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 209
    .line 210
    iget-boolean v6, p0, La/x3q0;->j:Z

    .line 211
    .line 212
    if-eqz v6, :cond_e

    .line 213
    .line 214
    if-ne v6, v3, :cond_d

    .line 215
    .line 216
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_d
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    goto :goto_9

    .line 224
    :cond_e
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    iget-object p1, v4, La/d4q0;->t:La/abu;

    .line 228
    .line 229
    iget-object v2, v4, La/d4q0;->o:Ljava/lang/String;

    .line 230
    .line 231
    iput-boolean v3, p0, La/x3q0;->j:Z

    .line 232
    .line 233
    iget-object v3, p1, La/abu;->c:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v3, La/mne;

    .line 236
    .line 237
    iget-object v3, v3, La/mne;->b:La/dvj;

    .line 238
    .line 239
    new-instance v4, La/juy;

    .line 240
    .line 241
    invoke-direct {v4, p1, v2, v5, v1}, La/juy;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 242
    .line 243
    .line 244
    invoke-static {v3, v4, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    if-ne p0, v0, :cond_f

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    :goto_7
    if-ne p0, v0, :cond_10

    .line 254
    .line 255
    move-object v5, v0

    .line 256
    goto :goto_9

    .line 257
    :cond_10
    :goto_8
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    :goto_9
    return-object v5

    .line 260
    nop

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
