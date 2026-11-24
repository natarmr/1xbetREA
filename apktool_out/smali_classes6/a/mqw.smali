.class public final La/mqw;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/qqw;


# direct methods
.method public synthetic constructor <init>(La/qqw;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mqw;->i:B

    iput-object p1, p0, La/mqw;->k:La/qqw;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mqw;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mqw;->k:La/qqw;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/mqw;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/mqw;-><init>(La/qqw;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/mqw;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/mqw;-><init>(La/qqw;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/mqw;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/mqw;-><init>(La/qqw;La/yje;B)V

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
    iput-boolean p0, v0, La/mqw;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mqw;->i:B

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
    invoke-virtual {p0, p1, p2}, La/mqw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mqw;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mqw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/mqw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/mqw;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/mqw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/mqw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/mqw;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/mqw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/mqw;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/mqw;->k:La/qqw;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/mqw;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

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
    iput-boolean v4, p0, La/mqw;->j:Z

    .line 32
    .line 33
    const-wide/16 v3, 0x12c

    .line 34
    .line 35
    invoke-static {v3, v4, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p0, v0, :cond_2

    .line 40
    .line 41
    move-object v3, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    sget p0, La/qqw;->A:I

    .line 44
    .line 45
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 46
    .line 47
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 48
    .line 49
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-object v1, p0

    .line 57
    check-cast v1, La/dqw;

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    const/16 v11, 0x3fe

    .line 61
    .line 62
    const/4 v2, 0x1

    .line 63
    const/4 v3, 0x0

    .line 64
    const/4 v4, 0x0

    .line 65
    const/4 v5, 0x0

    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    const/4 v9, 0x0

    .line 70
    invoke-static/range {v1 .. v11}, La/dqw;->a(La/dqw;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/nc5;I)La/dqw;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_3

    .line 79
    .line 80
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    :goto_1
    return-object v3

    .line 83
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 84
    .line 85
    iget-boolean v5, p0, La/mqw;->j:Z

    .line 86
    .line 87
    if-eqz v5, :cond_5

    .line 88
    .line 89
    if-ne v5, v4, :cond_4

    .line 90
    .line 91
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, v2, La/qqw;->s:La/jwu;

    .line 103
    .line 104
    iget-object v1, v2, La/qqw;->o:Ljava/lang/String;

    .line 105
    .line 106
    iput-boolean v4, p0, La/mqw;->j:Z

    .line 107
    .line 108
    invoke-virtual {p1, v1, p0}, La/jwu;->b(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    if-ne p0, v0, :cond_6

    .line 113
    .line 114
    move-object v3, v0

    .line 115
    goto :goto_3

    .line 116
    :cond_6
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    :goto_3
    return-object v3

    .line 119
    :pswitch_1
    iget-boolean p0, p0, La/mqw;->j:Z

    .line 120
    .line 121
    sget-object v0, La/wne;->a:La/wne;

    .line 122
    .line 123
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    if-eqz p0, :cond_9

    .line 127
    .line 128
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, La/dqw;

    .line 133
    .line 134
    iget-boolean p0, p0, La/dqw;->a:Z

    .line 135
    .line 136
    if-nez p0, :cond_7

    .line 137
    .line 138
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    check-cast p0, La/dqw;

    .line 143
    .line 144
    iget-boolean p0, p0, La/dqw;->b:Z

    .line 145
    .line 146
    if-eqz p0, :cond_9

    .line 147
    .line 148
    :cond_7
    iget-object p0, v2, La/qqw;->y:La/bby;

    .line 149
    .line 150
    if-eqz p0, :cond_8

    .line 151
    .line 152
    invoke-interface {p0, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 153
    .line 154
    .line 155
    :cond_8
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    iget-object p0, v2, La/qqw;->w:La/mne;

    .line 160
    .line 161
    iget-object v8, p0, La/mne;->b:La/dvj;

    .line 162
    .line 163
    const-wide/16 p0, 0x1e

    .line 164
    .line 165
    sget-object v0, La/bfn;->e:La/bfn;

    .line 166
    .line 167
    invoke-static {p0, p1, v0}, La/ibc;->w0(JLa/bfn;)J

    .line 168
    .line 169
    .line 170
    move-result-wide v6

    .line 171
    sget-object v9, La/pqw;->a:La/pqw;

    .line 172
    .line 173
    new-instance v10, La/mqw;

    .line 174
    .line 175
    invoke-direct {v10, v2, v3, v4}, La/mqw;-><init>(La/qqw;La/yje;B)V

    .line 176
    .line 177
    .line 178
    invoke-static/range {v5 .. v10}, La/sac;->Z(La/vne;JLkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/bby;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    iput-object p0, v2, La/qqw;->y:La/bby;

    .line 183
    .line 184
    const/4 p0, 0x0

    .line 185
    invoke-virtual {v2, p0}, La/qqw;->M(Z)V

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_9
    sget p0, La/qqw;->A:I

    .line 190
    .line 191
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 192
    .line 193
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 194
    .line 195
    :cond_a
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    iget-object v0, v2, La/i3t0;->f:La/oyg0;

    .line 203
    .line 204
    move-object v3, p1

    .line 205
    check-cast v3, La/dqw;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object v0, v3, La/dqw;->h:Ljava/util/List;

    .line 211
    .line 212
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    const/4 v12, 0x0

    .line 217
    const/16 v13, 0x3fc

    .line 218
    .line 219
    const/4 v4, 0x0

    .line 220
    const/4 v6, 0x0

    .line 221
    const/4 v7, 0x0

    .line 222
    const/4 v8, 0x0

    .line 223
    const/4 v9, 0x0

    .line 224
    const/4 v10, 0x0

    .line 225
    const/4 v11, 0x0

    .line 226
    invoke-static/range {v3 .. v13}, La/dqw;->a(La/dqw;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/nc5;I)La/dqw;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    if-eqz p1, :cond_a

    .line 235
    .line 236
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    return-object p0

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
