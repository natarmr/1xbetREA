.class public final La/w1q0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/x1q0;


# direct methods
.method public synthetic constructor <init>(La/x1q0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/w1q0;->i:B

    iput-object p1, p0, La/w1q0;->k:La/x1q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/w1q0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/w1q0;

    .line 7
    .line 8
    iget-object p0, p0, La/w1q0;->k:La/x1q0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/w1q0;-><init>(La/x1q0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/w1q0;

    .line 16
    .line 17
    iget-object p0, p0, La/w1q0;->k:La/x1q0;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, p0, p2, v0}, La/w1q0;-><init>(La/x1q0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/w1q0;

    .line 25
    .line 26
    iget-object p0, p0, La/w1q0;->k:La/x1q0;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-direct {p1, p0, p2, v0}, La/w1q0;-><init>(La/x1q0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/w1q0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/w1q0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/w1q0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/w1q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/w1q0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/w1q0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/w1q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/w1q0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/w1q0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/w1q0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/w1q0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/w1q0;->k:La/x1q0;

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
    iget-boolean v5, p0, La/w1q0;->j:Z

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    if-eqz v5, :cond_1

    .line 18
    .line 19
    if-ne v5, v2, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_3

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v3, La/x1q0;->r:La/nhf0;

    .line 33
    .line 34
    iput-boolean v2, p0, La/w1q0;->j:Z

    .line 35
    .line 36
    invoke-virtual {p1, v2, v6, p0}, La/nhf0;->f(ZZLa/yje;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    move-object v4, v0

    .line 43
    goto :goto_3

    .line 44
    :cond_2
    :goto_0
    check-cast p1, La/gm3;

    .line 45
    .line 46
    iget-object p0, v3, La/x1q0;->q:La/rek0;

    .line 47
    .line 48
    new-instance v0, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;

    .line 49
    .line 50
    iget-object v1, p1, La/gm3;->a:Ljava/lang/String;

    .line 51
    .line 52
    iget-boolean v2, p1, La/gm3;->b:Z

    .line 53
    .line 54
    iget-object p1, p1, La/gm3;->c:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v0, v1, v2, p1}, Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance p0, Lorg/xplatform/app_update/impl/navigation/AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;

    .line 63
    .line 64
    invoke-direct {p0, v0}, Lorg/xplatform/app_update/impl/navigation/AppUpdateScreenFactoryImpl$getAppUpdateScreen$1;-><init>(Lorg/xplatform/app_update/api/presentation/AppUpdateScreenParams;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, v3, La/x1q0;->l:La/i1w0;

    .line 68
    .line 69
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    instance-of v1, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    new-instance v1, La/e1w0;

    .line 78
    .line 79
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 80
    .line 81
    invoke-direct {v1, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 82
    .line 83
    .line 84
    new-instance p0, La/c8d;

    .line 85
    .line 86
    sget-object v2, La/y7d;->a:La/v7d;

    .line 87
    .line 88
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    new-instance v1, La/w0w0;

    .line 96
    .line 97
    invoke-direct {v1, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 98
    .line 99
    .line 100
    new-instance p0, La/c8d;

    .line 101
    .line 102
    sget-object v2, La/y7d;->a:La/v7d;

    .line 103
    .line 104
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    :goto_1
    invoke-static {p1, v0, v6}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    :goto_2
    move-object v0, p0

    .line 115
    check-cast v0, La/paw;

    .line 116
    .line 117
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_4

    .line 122
    .line 123
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, La/oe50;

    .line 128
    .line 129
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    :goto_3
    return-object v4

    .line 136
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 137
    .line 138
    iget-boolean v5, p0, La/w1q0;->j:Z

    .line 139
    .line 140
    if-eqz v5, :cond_6

    .line 141
    .line 142
    if-ne v5, v2, :cond_5

    .line 143
    .line 144
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_5
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    iget-object p1, v3, La/x1q0;->e:La/yox;

    .line 156
    .line 157
    iget-object p1, p1, La/yox;->a:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p1, La/uii;

    .line 160
    .line 161
    invoke-virtual {p1}, La/uii;->j()La/rpt;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iget-object p1, p1, La/rpt;->a:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p1, La/xr;

    .line 168
    .line 169
    invoke-virtual {p1}, La/xr;->i()La/rl40;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iget-object v1, v3, La/x1q0;->u:La/p7m0;

    .line 174
    .line 175
    new-instance v3, La/yd9;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-direct {v3, p1}, La/yd9;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    iput-boolean v2, p0, La/w1q0;->j:Z

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v4, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    if-ne p0, v0, :cond_7

    .line 195
    .line 196
    move-object v4, v0

    .line 197
    goto :goto_5

    .line 198
    :cond_7
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    :goto_5
    return-object v4

    .line 201
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 202
    .line 203
    iget-boolean v5, p0, La/w1q0;->j:Z

    .line 204
    .line 205
    if-eqz v5, :cond_9

    .line 206
    .line 207
    if-ne v5, v2, :cond_8

    .line 208
    .line 209
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_8
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    goto :goto_7

    .line 217
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    iget-object p1, v3, La/x1q0;->u:La/p7m0;

    .line 221
    .line 222
    sget-object v1, La/vd9;->c:La/vd9;

    .line 223
    .line 224
    iput-boolean v2, p0, La/w1q0;->j:Z

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    if-ne p0, v0, :cond_a

    .line 235
    .line 236
    move-object v4, v0

    .line 237
    goto :goto_7

    .line 238
    :cond_a
    :goto_6
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    :goto_7
    return-object v4

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
