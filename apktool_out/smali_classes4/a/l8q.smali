.class public final La/l8q;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/r8q;


# direct methods
.method public synthetic constructor <init>(La/r8q;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/l8q;->i:B

    iput-object p1, p0, La/l8q;->k:La/r8q;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/l8q;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/l8q;->k:La/r8q;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/l8q;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/l8q;-><init>(La/r8q;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/l8q;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/l8q;

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/l8q;-><init>(La/r8q;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/l8q;

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/l8q;-><init>(La/r8q;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/l8q;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/l8q;-><init>(La/r8q;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_3
    new-instance v0, La/l8q;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/l8q;-><init>(La/r8q;La/yje;B)V

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
    iput-boolean p0, v0, La/l8q;->j:Z

    .line 57
    .line 58
    return-object v0

    .line 59
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
    iget-byte v0, p0, La/l8q;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/l8q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/l8q;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/l8q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/l8q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/l8q;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/l8q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/l8q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/l8q;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/l8q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/l8q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/l8q;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/l8q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/l8q;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/l8q;

    .line 89
    .line 90
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, La/l8q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/l8q;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/l8q;->k:La/r8q;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-boolean p0, p0, La/l8q;->j:Z

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, v3, La/r8q;->i:La/mne;

    .line 20
    .line 21
    iget-object v0, v3, La/r8q;->X:La/sje;

    .line 22
    .line 23
    iget-object v1, v3, La/r8q;->Q:La/p7m0;

    .line 24
    .line 25
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/j8q;

    .line 30
    .line 31
    instance-of v5, v1, La/f8q;

    .line 32
    .line 33
    if-nez v5, :cond_1

    .line 34
    .line 35
    sget-object v5, La/h8q;->a:La/h8q;

    .line 36
    .line 37
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    if-nez p0, :cond_3

    .line 45
    .line 46
    invoke-virtual {v3}, La/r8q;->F()V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    if-eqz p0, :cond_2

    .line 51
    .line 52
    iget-object p0, p1, La/mne;->b:La/dvj;

    .line 53
    .line 54
    new-instance v1, La/e3p;

    .line 55
    .line 56
    const/4 v5, 0x2

    .line 57
    invoke-direct {v1, v3, v4, v5}, La/e3p;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, p0, v4, v1, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 61
    .line 62
    .line 63
    iget-object p0, v3, La/r8q;->d:La/ort;

    .line 64
    .line 65
    invoke-virtual {p0}, La/ort;->a()La/p7m0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, La/i120;->W(La/gmq;)La/gmq;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    new-instance v1, La/k8q;

    .line 74
    .line 75
    invoke-direct {v1, v3, v4, v2}, La/k8q;-><init>(La/r8q;La/yje;B)V

    .line 76
    .line 77
    .line 78
    new-instance v2, La/fnq;

    .line 79
    .line 80
    const/4 v3, 0x4

    .line 81
    invoke-direct {v2, p0, v1, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 82
    .line 83
    .line 84
    iget-object p0, p1, La/mne;->b:La/dvj;

    .line 85
    .line 86
    invoke-static {v0, p0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {v2, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    invoke-virtual {v3}, La/r8q;->F()V

    .line 95
    .line 96
    .line 97
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 101
    .line 102
    iget-boolean v5, p0, La/l8q;->j:Z

    .line 103
    .line 104
    if-eqz v5, :cond_5

    .line 105
    .line 106
    if-ne v5, v2, :cond_4

    .line 107
    .line 108
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, v3, La/r8q;->d:La/ort;

    .line 120
    .line 121
    iget-object p1, p1, La/ort;->a:La/gst0;

    .line 122
    .line 123
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_6

    .line 128
    .line 129
    iput-boolean v2, p0, La/l8q;->j:Z

    .line 130
    .line 131
    invoke-virtual {v3, p0}, La/r8q;->y(La/zje;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    if-ne p0, v0, :cond_6

    .line 136
    .line 137
    move-object v4, v0

    .line 138
    goto :goto_3

    .line 139
    :cond_6
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    :goto_3
    return-object v4

    .line 142
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 143
    .line 144
    iget-boolean v5, p0, La/l8q;->j:Z

    .line 145
    .line 146
    if-eqz v5, :cond_8

    .line 147
    .line 148
    if-ne v5, v2, :cond_7

    .line 149
    .line 150
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    iget-object p1, v3, La/r8q;->w:La/vpu;

    .line 162
    .line 163
    iput-boolean v2, p0, La/l8q;->j:Z

    .line 164
    .line 165
    const/4 v1, 0x0

    .line 166
    invoke-virtual {p1, v1, p0}, La/vpu;->b(ZLa/yje;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    if-ne p0, v0, :cond_9

    .line 171
    .line 172
    move-object v4, v0

    .line 173
    goto :goto_5

    .line 174
    :cond_9
    :goto_4
    iget-object p0, v3, La/r8q;->T:La/ol60;

    .line 175
    .line 176
    sget-object p1, La/a8q;->a:La/a8q;

    .line 177
    .line 178
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    :goto_5
    return-object v4

    .line 184
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 185
    .line 186
    iget-boolean v5, p0, La/l8q;->j:Z

    .line 187
    .line 188
    if-eqz v5, :cond_b

    .line 189
    .line 190
    if-ne v5, v2, :cond_a

    .line 191
    .line 192
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_a
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-object p1, v3, La/r8q;->M:La/xex;

    .line 204
    .line 205
    iput-boolean v2, p0, La/l8q;->j:Z

    .line 206
    .line 207
    invoke-virtual {p1, p0}, La/xex;->H(La/yje;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    if-ne p1, v0, :cond_c

    .line 212
    .line 213
    move-object v4, v0

    .line 214
    goto :goto_7

    .line 215
    :cond_c
    :goto_6
    check-cast p1, Ljava/lang/Boolean;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    if-eqz p0, :cond_d

    .line 222
    .line 223
    iget-object p0, v3, La/r8q;->T:La/ol60;

    .line 224
    .line 225
    sget-object p1, La/t7q;->a:La/t7q;

    .line 226
    .line 227
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    :cond_d
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    :goto_7
    return-object v4

    .line 233
    :pswitch_3
    iget-boolean p0, p0, La/l8q;->j:Z

    .line 234
    .line 235
    sget-object v0, La/wne;->a:La/wne;

    .line 236
    .line 237
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iget-object p1, v3, La/r8q;->U:La/p7m0;

    .line 241
    .line 242
    invoke-virtual {v3}, La/r8q;->x()La/l7q;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    const/4 v1, 0x6

    .line 247
    invoke-static {v0, p0, v4, v1}, La/l7q;->a(La/l7q;ZLjava/util/List;I)La/l7q;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, v4, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object p0

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
