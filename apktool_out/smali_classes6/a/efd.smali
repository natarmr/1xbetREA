.class public final La/efd;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/gfd;


# direct methods
.method public synthetic constructor <init>(La/gfd;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/efd;->i:B

    iput-object p1, p0, La/efd;->k:La/gfd;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/efd;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/efd;->k:La/gfd;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/efd;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/efd;-><init>(La/gfd;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/efd;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/efd;-><init>(La/gfd;La/yje;B)V

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
    iput-boolean p0, v0, La/efd;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/efd;->i:B

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
    invoke-virtual {p0, p1, p2}, La/efd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/efd;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/efd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/efd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/efd;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/efd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/efd;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/efd;->k:La/gfd;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, v1, La/i3t0;->f:La/oyg0;

    .line 10
    .line 11
    iget-object v3, v1, La/i3t0;->i:La/ocj;

    .line 12
    .line 13
    sget-object v4, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v5, p0, La/efd;->j:Z

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v5, :cond_1

    .line 19
    .line 20
    if-ne v5, v2, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object v4, v6

    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v1, La/gfd;->p:La/lsn;

    .line 38
    .line 39
    iget-object v1, v1, La/gfd;->s:Ljava/lang/String;

    .line 40
    .line 41
    iput-boolean v2, p0, La/efd;->j:Z

    .line 42
    .line 43
    iget-object p1, p1, La/lsn;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, La/y3v;

    .line 46
    .line 47
    iget-object v2, p1, La/y3v;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, La/mne;

    .line 50
    .line 51
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 52
    .line 53
    new-instance v5, La/oed;

    .line 54
    .line 55
    const/16 v7, 0x1b

    .line 56
    .line 57
    invoke-direct {v5, p1, v1, v6, v7}, La/oed;-><init>(Ljava/lang/Object;Ljava/lang/String;La/yje;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2, v5, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v4, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    :goto_0
    move-object v4, p1

    .line 68
    check-cast v4, La/t6p0;

    .line 69
    .line 70
    sget p0, La/gfd;->u:I

    .line 71
    .line 72
    iget-object v5, v3, La/ocj;->a:La/p7m0;

    .line 73
    .line 74
    :cond_3
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-object v6, p0

    .line 82
    check-cast v6, La/cfd;

    .line 83
    .line 84
    iget-wide v7, v4, La/t6p0;->a:J

    .line 85
    .line 86
    const/4 v12, 0x0

    .line 87
    const/16 v13, 0x1e

    .line 88
    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v10, 0x0

    .line 91
    const/4 v11, 0x0

    .line 92
    invoke-static/range {v6 .. v13}, La/cfd;->a(La/cfd;JZZZLjava/util/List;I)La/cfd;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {v5, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-eqz p0, :cond_3

    .line 101
    .line 102
    iget-object v12, v4, La/t6p0;->b:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-nez p0, :cond_5

    .line 109
    .line 110
    iget-object p0, v3, La/ocj;->a:La/p7m0;

    .line 111
    .line 112
    :cond_4
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-object v6, p1

    .line 120
    check-cast v6, La/cfd;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    const/4 v11, 0x0

    .line 126
    const/4 v13, 0x1

    .line 127
    const-wide/16 v7, 0x0

    .line 128
    .line 129
    const/4 v9, 0x0

    .line 130
    const/4 v10, 0x0

    .line 131
    invoke-static/range {v6 .. v13}, La/cfd;->a(La/cfd;JZZZLjava/util/List;I)La/cfd;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {p0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_4

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    iget-object p0, v3, La/ocj;->a:La/p7m0;

    .line 143
    .line 144
    :cond_6
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-object v1, p1

    .line 152
    check-cast v1, La/cfd;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    const/4 v7, 0x0

    .line 158
    const/16 v8, 0x11

    .line 159
    .line 160
    const-wide/16 v2, 0x0

    .line 161
    .line 162
    const/4 v4, 0x0

    .line 163
    const/4 v5, 0x0

    .line 164
    const/4 v6, 0x1

    .line 165
    invoke-static/range {v1 .. v8}, La/cfd;->a(La/cfd;JZZZLjava/util/List;I)La/cfd;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {p0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_6

    .line 174
    .line 175
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    :goto_2
    return-object v4

    .line 178
    :pswitch_0
    iget-boolean p0, p0, La/efd;->j:Z

    .line 179
    .line 180
    sget-object v0, La/wne;->a:La/wne;

    .line 181
    .line 182
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    const/4 p1, 0x0

    .line 186
    if-nez p0, :cond_7

    .line 187
    .line 188
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    check-cast v0, La/cfd;

    .line 193
    .line 194
    iget-boolean v0, v0, La/cfd;->b:Z

    .line 195
    .line 196
    if-eqz v0, :cond_7

    .line 197
    .line 198
    move v0, v2

    .line 199
    goto :goto_3

    .line 200
    :cond_7
    move v0, p1

    .line 201
    :goto_3
    if-eqz p0, :cond_8

    .line 202
    .line 203
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    check-cast p0, La/cfd;

    .line 208
    .line 209
    iget-boolean p0, p0, La/cfd;->c:Z

    .line 210
    .line 211
    if-nez p0, :cond_9

    .line 212
    .line 213
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    check-cast p0, La/cfd;

    .line 218
    .line 219
    iget-boolean p0, p0, La/cfd;->d:Z

    .line 220
    .line 221
    if-eqz p0, :cond_8

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_8
    move v2, p1

    .line 225
    :cond_9
    :goto_4
    if-nez v0, :cond_a

    .line 226
    .line 227
    if-eqz v2, :cond_b

    .line 228
    .line 229
    :cond_a
    sget p0, La/gfd;->u:I

    .line 230
    .line 231
    invoke-virtual {v1}, La/gfd;->M()V

    .line 232
    .line 233
    .line 234
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object p0

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
