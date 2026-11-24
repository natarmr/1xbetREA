.class public final La/mab0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/sbb0;


# direct methods
.method public synthetic constructor <init>(La/sbb0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mab0;->i:B

    iput-object p1, p0, La/mab0;->k:La/sbb0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/mab0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mab0;->k:La/sbb0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/mab0;

    .line 9
    .line 10
    const/16 v0, 0x8

    .line 11
    .line 12
    invoke-direct {p1, p0, p2, v0}, La/mab0;-><init>(La/sbb0;La/yje;B)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, La/mab0;

    .line 17
    .line 18
    const/4 v0, 0x7

    .line 19
    invoke-direct {p1, p0, p2, v0}, La/mab0;-><init>(La/sbb0;La/yje;B)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_1
    new-instance p1, La/mab0;

    .line 24
    .line 25
    const/4 v0, 0x6

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/mab0;-><init>(La/sbb0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_2
    new-instance p1, La/mab0;

    .line 31
    .line 32
    const/4 v0, 0x5

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/mab0;-><init>(La/sbb0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_3
    new-instance p1, La/mab0;

    .line 38
    .line 39
    const/4 v0, 0x4

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/mab0;-><init>(La/sbb0;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_4
    new-instance p1, La/mab0;

    .line 45
    .line 46
    const/4 v0, 0x3

    .line 47
    invoke-direct {p1, p0, p2, v0}, La/mab0;-><init>(La/sbb0;La/yje;B)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_5
    new-instance p1, La/mab0;

    .line 52
    .line 53
    const/4 v0, 0x2

    .line 54
    invoke-direct {p1, p0, p2, v0}, La/mab0;-><init>(La/sbb0;La/yje;B)V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_6
    new-instance p1, La/mab0;

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    invoke-direct {p1, p0, p2, v0}, La/mab0;-><init>(La/sbb0;La/yje;B)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_7
    new-instance p1, La/mab0;

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    invoke-direct {p1, p0, p2, v0}, La/mab0;-><init>(La/sbb0;La/yje;B)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
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
    iget-byte v0, p0, La/mab0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/mab0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mab0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mab0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/mab0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/mab0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/mab0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/mab0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/mab0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/mab0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, La/mab0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/mab0;

    .line 54
    .line 55
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/mab0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, La/mab0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/mab0;

    .line 67
    .line 68
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/mab0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_4
    invoke-virtual {p0, p1, p2}, La/mab0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/mab0;

    .line 80
    .line 81
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, La/mab0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_5
    invoke-virtual {p0, p1, p2}, La/mab0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, La/mab0;

    .line 93
    .line 94
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    invoke-virtual {p0, p1}, La/mab0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :pswitch_6
    invoke-virtual {p0, p1, p2}, La/mab0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, La/mab0;

    .line 106
    .line 107
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    invoke-virtual {p0, p1}, La/mab0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :pswitch_7
    invoke-virtual {p0, p1, p2}, La/mab0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, La/mab0;

    .line 119
    .line 120
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    invoke-virtual {p0, p1}, La/mab0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
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
    .locals 9

    .line 1
    iget-byte v0, p0, La/mab0;->i:B

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, La/mab0;->k:La/sbb0;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v1, p0, La/mab0;->j:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    if-ne v1, v4, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v5, La/sbb0;->h0:La/rou;

    .line 35
    .line 36
    iput-boolean v4, p0, La/mab0;->j:Z

    .line 37
    .line 38
    invoke-virtual {p1, v2, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v0, :cond_2

    .line 43
    .line 44
    move-object v6, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    check-cast p1, La/m2c0;

    .line 47
    .line 48
    iget-boolean p0, p1, La/m2c0;->t0:Z

    .line 49
    .line 50
    if-eqz p0, :cond_3

    .line 51
    .line 52
    invoke-virtual {v5}, La/sbb0;->H()V

    .line 53
    .line 54
    .line 55
    :cond_3
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    :goto_1
    return-object v6

    .line 58
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 59
    .line 60
    iget-boolean v1, p0, La/mab0;->j:Z

    .line 61
    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    if-ne v1, v4, :cond_4

    .line 65
    .line 66
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, v5, La/sbb0;->B0:La/p7m0;

    .line 78
    .line 79
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, La/r9b0;

    .line 84
    .line 85
    iget-object p1, p1, La/r9b0;->c:La/s9b0;

    .line 86
    .line 87
    sget-object v1, La/s9b0;->f:La/s9b0;

    .line 88
    .line 89
    if-ne p1, v1, :cond_6

    .line 90
    .line 91
    iget-object p1, v5, La/sbb0;->l0:La/ytt;

    .line 92
    .line 93
    sget-object v1, La/aue0;->d:La/aue0;

    .line 94
    .line 95
    iput-boolean v4, p0, La/mab0;->j:Z

    .line 96
    .line 97
    invoke-virtual {p1, v1, p0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    if-ne p0, v0, :cond_6

    .line 102
    .line 103
    move-object v6, v0

    .line 104
    goto :goto_4

    .line 105
    :cond_6
    :goto_2
    iget-object p0, v5, La/sbb0;->h:La/i1w0;

    .line 106
    .line 107
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    new-instance v0, La/c8d;

    .line 112
    .line 113
    sget-object v1, La/y7d;->a:La/v7d;

    .line 114
    .line 115
    sget-object v3, La/o0w0;->a:La/o0w0;

    .line 116
    .line 117
    invoke-direct {v0, v1, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1, v0, v0, p0, p1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1, v2}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    :goto_3
    move-object v0, p1

    .line 129
    check-cast v0, La/paw;

    .line 130
    .line 131
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_7

    .line 136
    .line 137
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, La/oe50;

    .line 142
    .line 143
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    :goto_4
    return-object v6

    .line 150
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 151
    .line 152
    iget-boolean v2, p0, La/mab0;->j:Z

    .line 153
    .line 154
    if-eqz v2, :cond_9

    .line 155
    .line 156
    if-ne v2, v4, :cond_8

    .line 157
    .line 158
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_8
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iget-object p1, v5, La/sbb0;->v:La/sd60;

    .line 170
    .line 171
    iput-boolean v4, p0, La/mab0;->j:Z

    .line 172
    .line 173
    invoke-virtual {p1, v1, p0}, La/sd60;->i(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    if-ne p0, v0, :cond_a

    .line 178
    .line 179
    move-object v6, v0

    .line 180
    goto :goto_6

    .line 181
    :cond_a
    :goto_5
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    :goto_6
    return-object v6

    .line 184
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 185
    .line 186
    iget-boolean v1, p0, La/mab0;->j:Z

    .line 187
    .line 188
    if-eqz v1, :cond_c

    .line 189
    .line 190
    if-ne v1, v4, :cond_b

    .line 191
    .line 192
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_b
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    goto :goto_9

    .line 200
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-object p1, v5, La/sbb0;->B0:La/p7m0;

    .line 204
    .line 205
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    check-cast p1, La/r9b0;

    .line 210
    .line 211
    iget-object p1, p1, La/r9b0;->c:La/s9b0;

    .line 212
    .line 213
    sget-object v1, La/s9b0;->f:La/s9b0;

    .line 214
    .line 215
    if-ne p1, v1, :cond_d

    .line 216
    .line 217
    iget-object p1, v5, La/sbb0;->l0:La/ytt;

    .line 218
    .line 219
    sget-object v1, La/aue0;->d:La/aue0;

    .line 220
    .line 221
    iput-boolean v4, p0, La/mab0;->j:Z

    .line 222
    .line 223
    invoke-virtual {p1, v1, p0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    if-ne p0, v0, :cond_d

    .line 228
    .line 229
    move-object v6, v0

    .line 230
    goto :goto_9

    .line 231
    :cond_d
    :goto_7
    iget-object p0, v5, La/sbb0;->h:La/i1w0;

    .line 232
    .line 233
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    new-instance v0, La/c8d;

    .line 238
    .line 239
    sget-object v1, La/y7d;->a:La/v7d;

    .line 240
    .line 241
    sget-object v3, La/n0w0;->a:La/n0w0;

    .line 242
    .line 243
    invoke-direct {v0, v1, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 244
    .line 245
    .line 246
    invoke-static {p1, v0, v0, p0, p1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-virtual {p1, v2}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    :goto_8
    move-object v0, p1

    .line 255
    check-cast v0, La/paw;

    .line 256
    .line 257
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-eqz v1, :cond_e

    .line 262
    .line 263
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, La/oe50;

    .line 268
    .line 269
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 270
    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_e
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 274
    .line 275
    :goto_9
    return-object v6

    .line 276
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 277
    .line 278
    iget-boolean v1, p0, La/mab0;->j:Z

    .line 279
    .line 280
    if-eqz v1, :cond_10

    .line 281
    .line 282
    if-ne v1, v4, :cond_f

    .line 283
    .line 284
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    goto :goto_a

    .line 288
    :cond_f
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    goto :goto_b

    .line 292
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    iget-object p1, v5, La/sbb0;->D:La/x4u;

    .line 296
    .line 297
    iget-object p1, p1, La/x4u;->a:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast p1, La/cad;

    .line 300
    .line 301
    iget-object p1, p1, La/cad;->b:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast p1, La/bad;

    .line 304
    .line 305
    iget-object p1, p1, La/bad;->a:La/p7m0;

    .line 306
    .line 307
    iput-boolean v4, p0, La/mab0;->j:Z

    .line 308
    .line 309
    invoke-static {p1, p0}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    if-ne p1, v0, :cond_11

    .line 314
    .line 315
    move-object v6, v0

    .line 316
    goto :goto_b

    .line 317
    :cond_11
    :goto_a
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 318
    .line 319
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result p0

    .line 323
    if-eqz p0, :cond_12

    .line 324
    .line 325
    iget-object p0, v5, La/sbb0;->E0:La/ol60;

    .line 326
    .line 327
    sget-object p1, La/iab0;->a:La/iab0;

    .line 328
    .line 329
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    :cond_12
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 333
    .line 334
    :goto_b
    return-object v6

    .line 335
    :pswitch_4
    iget-object v0, v5, La/sbb0;->g0:La/svs0;

    .line 336
    .line 337
    iget-object v1, v5, La/sbb0;->h:La/i1w0;

    .line 338
    .line 339
    sget-object v7, La/wne;->a:La/wne;

    .line 340
    .line 341
    iget-boolean v8, p0, La/mab0;->j:Z

    .line 342
    .line 343
    if-eqz v8, :cond_14

    .line 344
    .line 345
    if-ne v8, v4, :cond_13

    .line 346
    .line 347
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    goto :goto_c

    .line 351
    :cond_13
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_10

    .line 355
    .line 356
    :cond_14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    iget-object p1, v5, La/sbb0;->h0:La/rou;

    .line 360
    .line 361
    iput-boolean v4, p0, La/mab0;->j:Z

    .line 362
    .line 363
    invoke-virtual {p1, v4, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    if-ne p1, v7, :cond_15

    .line 368
    .line 369
    move-object v6, v7

    .line 370
    goto/16 :goto_10

    .line 371
    .line 372
    :cond_15
    :goto_c
    check-cast p1, La/m2c0;

    .line 373
    .line 374
    iget-boolean p0, p1, La/m2c0;->a0:Z

    .line 375
    .line 376
    if-eqz p0, :cond_16

    .line 377
    .line 378
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    new-instance p0, La/k0w0;

    .line 382
    .line 383
    invoke-direct {p0, v1}, La/k0w0;-><init>(La/i1w0;)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    new-instance p1, Lorg/xplatform/security/impl/navigation/TwoFactorAuthenticationScreenFactoryImpl$getRemoveTwoFactoryAuthenticationScreen$1;

    .line 390
    .line 391
    invoke-direct {p1, v4}, Lorg/xplatform/security/impl/navigation/TwoFactorAuthenticationScreenFactoryImpl$getRemoveTwoFactoryAuthenticationScreen$1;-><init>(Z)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p0, p1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 395
    .line 396
    .line 397
    iget-object p0, p0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 398
    .line 399
    invoke-static {v1, p0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    :goto_d
    move-object p1, p0

    .line 404
    check-cast p1, La/paw;

    .line 405
    .line 406
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    if-eqz v0, :cond_18

    .line 411
    .line 412
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    check-cast p1, La/oe50;

    .line 417
    .line 418
    invoke-virtual {v1, p1}, La/i1w0;->a(La/oe50;)V

    .line 419
    .line 420
    .line 421
    goto :goto_d

    .line 422
    :cond_16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    new-instance p0, Lorg/xplatform/security/impl/presentation/otp_authenticator/OtpScreens$AddTwoFactoryAuthenticationScreen;

    .line 426
    .line 427
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 434
    .line 435
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 436
    .line 437
    .line 438
    instance-of v0, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 439
    .line 440
    if-eqz v0, :cond_17

    .line 441
    .line 442
    new-instance v0, La/e1w0;

    .line 443
    .line 444
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 445
    .line 446
    invoke-direct {v0, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 447
    .line 448
    .line 449
    new-instance p0, La/c8d;

    .line 450
    .line 451
    sget-object v3, La/y7d;->a:La/v7d;

    .line 452
    .line 453
    invoke-direct {p0, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    goto :goto_e

    .line 460
    :cond_17
    new-instance v0, La/w0w0;

    .line 461
    .line 462
    invoke-direct {v0, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 463
    .line 464
    .line 465
    new-instance p0, La/c8d;

    .line 466
    .line 467
    sget-object v3, La/y7d;->a:La/v7d;

    .line 468
    .line 469
    invoke-direct {p0, v3, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    :goto_e
    invoke-static {v1, p1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 476
    .line 477
    .line 478
    move-result-object p0

    .line 479
    :goto_f
    move-object p1, p0

    .line 480
    check-cast p1, La/paw;

    .line 481
    .line 482
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    if-eqz v0, :cond_18

    .line 487
    .line 488
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object p1

    .line 492
    check-cast p1, La/oe50;

    .line 493
    .line 494
    invoke-virtual {v1, p1}, La/i1w0;->a(La/oe50;)V

    .line 495
    .line 496
    .line 497
    goto :goto_f

    .line 498
    :cond_18
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 499
    .line 500
    :goto_10
    return-object v6

    .line 501
    :pswitch_5
    sget-object v0, La/wne;->a:La/wne;

    .line 502
    .line 503
    iget-boolean v1, p0, La/mab0;->j:Z

    .line 504
    .line 505
    if-eqz v1, :cond_1a

    .line 506
    .line 507
    if-ne v1, v4, :cond_19

    .line 508
    .line 509
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    goto :goto_11

    .line 513
    :cond_19
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    goto :goto_12

    .line 517
    :cond_1a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    iget-object p1, v5, La/sbb0;->k:La/ort;

    .line 521
    .line 522
    invoke-virtual {p1}, La/ort;->a()La/p7m0;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    new-instance v1, La/ebb0;

    .line 527
    .line 528
    const/4 v2, 0x5

    .line 529
    invoke-direct {v1, v5, v6, v2}, La/ebb0;-><init>(La/sbb0;La/yje;B)V

    .line 530
    .line 531
    .line 532
    new-instance v2, La/fnq;

    .line 533
    .line 534
    const/4 v3, 0x4

    .line 535
    invoke-direct {v2, p1, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 536
    .line 537
    .line 538
    new-instance p1, La/rf0;

    .line 539
    .line 540
    const/16 v1, 0xa

    .line 541
    .line 542
    invoke-direct {p1, v2, v1}, La/rf0;-><init>(La/fnq;B)V

    .line 543
    .line 544
    .line 545
    new-instance v1, La/o6b0;

    .line 546
    .line 547
    const/16 v2, 0xd

    .line 548
    .line 549
    invoke-direct {v1, v5, v2}, La/o6b0;-><init>(Ljava/lang/Object;B)V

    .line 550
    .line 551
    .line 552
    iput-boolean v4, p0, La/mab0;->j:Z

    .line 553
    .line 554
    invoke-virtual {p1, v1, p0}, La/rf0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object p0

    .line 558
    if-ne p0, v0, :cond_1b

    .line 559
    .line 560
    move-object v6, v0

    .line 561
    goto :goto_12

    .line 562
    :cond_1b
    :goto_11
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 563
    .line 564
    :goto_12
    return-object v6

    .line 565
    :pswitch_6
    sget-object v0, La/wne;->a:La/wne;

    .line 566
    .line 567
    iget-boolean v1, p0, La/mab0;->j:Z

    .line 568
    .line 569
    if-eqz v1, :cond_1d

    .line 570
    .line 571
    if-ne v1, v4, :cond_1c

    .line 572
    .line 573
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    goto :goto_13

    .line 577
    :cond_1c
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    goto :goto_14

    .line 581
    :cond_1d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    iget-object p1, v5, La/sbb0;->h0:La/rou;

    .line 585
    .line 586
    iput-boolean v4, p0, La/mab0;->j:Z

    .line 587
    .line 588
    invoke-virtual {p1, v2, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object p1

    .line 592
    if-ne p1, v0, :cond_1e

    .line 593
    .line 594
    move-object v6, v0

    .line 595
    goto :goto_14

    .line 596
    :cond_1e
    :goto_13
    check-cast p1, La/m2c0;

    .line 597
    .line 598
    iget-boolean p0, p1, La/m2c0;->t0:Z

    .line 599
    .line 600
    if-eqz p0, :cond_1f

    .line 601
    .line 602
    invoke-virtual {v5}, La/sbb0;->H()V

    .line 603
    .line 604
    .line 605
    :cond_1f
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 606
    .line 607
    :goto_14
    return-object v6

    .line 608
    :pswitch_7
    sget-object v0, La/wne;->a:La/wne;

    .line 609
    .line 610
    iget-boolean v2, p0, La/mab0;->j:Z

    .line 611
    .line 612
    if-eqz v2, :cond_21

    .line 613
    .line 614
    if-ne v2, v4, :cond_20

    .line 615
    .line 616
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 617
    .line 618
    .line 619
    goto :goto_15

    .line 620
    :cond_20
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    goto :goto_16

    .line 624
    :cond_21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    iget-object p1, v5, La/sbb0;->v:La/sd60;

    .line 628
    .line 629
    iput-boolean v4, p0, La/mab0;->j:Z

    .line 630
    .line 631
    invoke-virtual {p1, v1, p0}, La/sd60;->i(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object p0

    .line 635
    if-ne p0, v0, :cond_22

    .line 636
    .line 637
    move-object v6, v0

    .line 638
    goto :goto_16

    .line 639
    :cond_22
    :goto_15
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 640
    .line 641
    :goto_16
    return-object v6

    .line 642
    nop

    .line 643
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
