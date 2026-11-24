.class public final La/kjr0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/njr0;


# direct methods
.method public synthetic constructor <init>(La/njr0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kjr0;->i:B

    iput-object p1, p0, La/kjr0;->k:La/njr0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/kjr0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/kjr0;->k:La/njr0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/kjr0;

    .line 9
    .line 10
    const/4 v0, 0x6

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/kjr0;-><init>(La/njr0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance v0, La/kjr0;

    .line 16
    .line 17
    const/4 v1, 0x5

    .line 18
    invoke-direct {v0, p0, p2, v1}, La/kjr0;-><init>(La/njr0;La/yje;B)V

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
    iput-boolean p0, v0, La/kjr0;->j:Z

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance p1, La/kjr0;

    .line 31
    .line 32
    const/4 v0, 0x4

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/kjr0;-><init>(La/njr0;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_2
    new-instance p1, La/kjr0;

    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/kjr0;-><init>(La/njr0;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_3
    new-instance p1, La/kjr0;

    .line 45
    .line 46
    const/4 v0, 0x2

    .line 47
    invoke-direct {p1, p0, p2, v0}, La/kjr0;-><init>(La/njr0;La/yje;B)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_4
    new-instance p1, La/kjr0;

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    invoke-direct {p1, p0, p2, v0}, La/kjr0;-><init>(La/njr0;La/yje;B)V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_5
    new-instance p1, La/kjr0;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-direct {p1, p0, p2, v0}, La/kjr0;-><init>(La/njr0;La/yje;B)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
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
    iget-byte v0, p0, La/kjr0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/kjr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kjr0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kjr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/kjr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/kjr0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/kjr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/kjr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/kjr0;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/kjr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/kjr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/kjr0;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/kjr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/kjr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/kjr0;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/kjr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :pswitch_4
    check-cast p1, La/vne;

    .line 95
    .line 96
    check-cast p2, La/yje;

    .line 97
    .line 98
    invoke-virtual {p0, p1, p2}, La/kjr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/kjr0;

    .line 103
    .line 104
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, La/kjr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_5
    check-cast p1, La/vne;

    .line 112
    .line 113
    check-cast p2, La/yje;

    .line 114
    .line 115
    invoke-virtual {p0, p1, p2}, La/kjr0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, La/kjr0;

    .line 120
    .line 121
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    invoke-virtual {p0, p1}, La/kjr0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/kjr0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, La/kjr0;->k:La/njr0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v1, p0, La/kjr0;->j:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    if-ne v1, v4, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v5, La/njr0;->q:La/nhf0;

    .line 33
    .line 34
    iput-boolean v4, p0, La/kjr0;->j:Z

    .line 35
    .line 36
    invoke-virtual {p1, p0}, La/nhf0;->w(La/bnn0;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-ne p0, v0, :cond_2

    .line 41
    .line 42
    move-object v2, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    :goto_1
    return-object v2

    .line 47
    :pswitch_0
    iget-boolean p0, p0, La/kjr0;->j:Z

    .line 48
    .line 49
    sget-object v0, La/wne;->a:La/wne;

    .line 50
    .line 51
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    iget-object p0, v5, La/njr0;->G:La/p7m0;

    .line 57
    .line 58
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, La/cjr0;

    .line 63
    .line 64
    iget-object p0, p0, La/cjr0;->b:La/ijr0;

    .line 65
    .line 66
    instance-of p0, p0, La/ejr0;

    .line 67
    .line 68
    if-eqz p0, :cond_3

    .line 69
    .line 70
    invoke-virtual {v5, v1}, La/njr0;->A(Z)V

    .line 71
    .line 72
    .line 73
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 77
    .line 78
    iget-boolean v6, p0, La/kjr0;->j:Z

    .line 79
    .line 80
    if-eqz v6, :cond_5

    .line 81
    .line 82
    if-ne v6, v4, :cond_4

    .line 83
    .line 84
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_5

    .line 92
    .line 93
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object p1, v5, La/njr0;->i:La/ctu;

    .line 97
    .line 98
    iget-object p1, p1, La/ctu;->a:La/rkr0;

    .line 99
    .line 100
    invoke-interface {p1}, La/rkr0;->r()La/lmr0;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object p1, p1, La/lmr0;->c:La/ulr0;

    .line 105
    .line 106
    sget-object v2, La/ulr0;->h:La/ulr0;

    .line 107
    .line 108
    if-ne p1, v2, :cond_8

    .line 109
    .line 110
    iget-object p1, v5, La/njr0;->u:La/g2v;

    .line 111
    .line 112
    iput-boolean v4, p0, La/kjr0;->j:Z

    .line 113
    .line 114
    invoke-virtual {p1, p0}, La/g2v;->f(La/zje;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-ne p1, v0, :cond_6

    .line 119
    .line 120
    move-object v2, v0

    .line 121
    goto :goto_5

    .line 122
    :cond_6
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-eqz p0, :cond_7

    .line 129
    .line 130
    invoke-virtual {v5}, La/njr0;->B()V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_7
    iget-object p0, v5, La/njr0;->I:La/ol60;

    .line 135
    .line 136
    sget-object p1, La/uir0;->a:La/uir0;

    .line 137
    .line 138
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_8
    iget-object p0, v5, La/njr0;->t:La/cyu;

    .line 145
    .line 146
    invoke-virtual {p0}, La/cyu;->v()Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    iget-object p1, v5, La/njr0;->i:La/ctu;

    .line 151
    .line 152
    iget-object p1, p1, La/ctu;->a:La/rkr0;

    .line 153
    .line 154
    invoke-interface {p1}, La/rkr0;->r()La/lmr0;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    iget-object p1, p1, La/lmr0;->b:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v0, v5, La/njr0;->r:La/hru;

    .line 161
    .line 162
    invoke-virtual {v0}, La/hru;->a()J

    .line 163
    .line 164
    .line 165
    move-result-wide v2

    .line 166
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iget-object v2, v5, La/njr0;->l:La/pru;

    .line 171
    .line 172
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    iget-object v2, v2, La/sff0;->l:La/toc0;

    .line 177
    .line 178
    iget-boolean v2, v2, La/toc0;->g:Z

    .line 179
    .line 180
    iget-object v3, v5, La/njr0;->I:La/ol60;

    .line 181
    .line 182
    if-nez p0, :cond_9

    .line 183
    .line 184
    sget-object p0, La/xir0;->a:La/xir0;

    .line 185
    .line 186
    invoke-virtual {v3, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_9
    new-instance p0, La/tir0;

    .line 191
    .line 192
    iget-object v5, v5, La/njr0;->F:La/lk5;

    .line 193
    .line 194
    sget-object v6, La/j820;->c:La/j820;

    .line 195
    .line 196
    invoke-virtual {v5, v6}, La/lk5;->c(La/j820;)La/ua20;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    sget-object v6, La/ua20;->b:La/ua20;

    .line 201
    .line 202
    if-eq v5, v6, :cond_a

    .line 203
    .line 204
    move v1, v4

    .line 205
    :cond_a
    invoke-direct {p0, p1, v0, v2, v1}, La/tir0;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    :goto_5
    return-object v2

    .line 214
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 215
    .line 216
    iget-boolean v1, p0, La/kjr0;->j:Z

    .line 217
    .line 218
    if-eqz v1, :cond_c

    .line 219
    .line 220
    if-ne v1, v4, :cond_b

    .line 221
    .line 222
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_b
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    iget-object p1, v5, La/njr0;->h:La/yk00;

    .line 234
    .line 235
    iput-boolean v4, p0, La/kjr0;->j:Z

    .line 236
    .line 237
    iget-object p1, p1, La/yk00;->a:La/rkr0;

    .line 238
    .line 239
    invoke-interface {p1, p0}, La/rkr0;->d(La/yje;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    if-ne p0, v0, :cond_d

    .line 244
    .line 245
    goto :goto_6

    .line 246
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    :goto_6
    if-ne p0, v0, :cond_e

    .line 249
    .line 250
    move-object v2, v0

    .line 251
    goto :goto_8

    .line 252
    :cond_e
    :goto_7
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    :goto_8
    return-object v2

    .line 255
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 256
    .line 257
    iget-boolean v1, p0, La/kjr0;->j:Z

    .line 258
    .line 259
    if-eqz v1, :cond_10

    .line 260
    .line 261
    if-ne v1, v4, :cond_f

    .line 262
    .line 263
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    goto :goto_9

    .line 267
    :cond_f
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    goto :goto_a

    .line 271
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    iget-object p1, v5, La/njr0;->B:La/zpu;

    .line 275
    .line 276
    iput-boolean v4, p0, La/kjr0;->j:Z

    .line 277
    .line 278
    invoke-virtual {p1, p0}, La/zpu;->j(La/zje;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    if-ne p0, v0, :cond_11

    .line 283
    .line 284
    move-object v2, v0

    .line 285
    goto :goto_a

    .line 286
    :cond_11
    :goto_9
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    :goto_a
    return-object v2

    .line 289
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 290
    .line 291
    iget-boolean v1, p0, La/kjr0;->j:Z

    .line 292
    .line 293
    if-eqz v1, :cond_13

    .line 294
    .line 295
    if-ne v1, v4, :cond_12

    .line 296
    .line 297
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    goto :goto_b

    .line 301
    :cond_12
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    goto :goto_c

    .line 305
    :cond_13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    iget-object p1, v5, La/njr0;->o:La/usc;

    .line 309
    .line 310
    iput-boolean v4, p0, La/kjr0;->j:Z

    .line 311
    .line 312
    invoke-virtual {p1, p0}, La/usc;->a(La/bnn0;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    if-ne p0, v0, :cond_14

    .line 317
    .line 318
    move-object v2, v0

    .line 319
    goto :goto_c

    .line 320
    :cond_14
    :goto_b
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 321
    .line 322
    :goto_c
    return-object v2

    .line 323
    :pswitch_5
    sget-object v0, La/wne;->a:La/wne;

    .line 324
    .line 325
    iget-boolean v1, p0, La/kjr0;->j:Z

    .line 326
    .line 327
    if-eqz v1, :cond_16

    .line 328
    .line 329
    if-ne v1, v4, :cond_15

    .line 330
    .line 331
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    goto :goto_d

    .line 335
    :cond_15
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    goto :goto_e

    .line 339
    :cond_16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    iget-object p1, v5, La/njr0;->A:La/xex;

    .line 343
    .line 344
    iput-boolean v4, p0, La/kjr0;->j:Z

    .line 345
    .line 346
    invoke-virtual {p1, p0}, La/xex;->H(La/yje;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    if-ne p1, v0, :cond_17

    .line 351
    .line 352
    move-object v2, v0

    .line 353
    goto :goto_e

    .line 354
    :cond_17
    :goto_d
    check-cast p1, Ljava/lang/Boolean;

    .line 355
    .line 356
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 357
    .line 358
    .line 359
    move-result p0

    .line 360
    if-eqz p0, :cond_18

    .line 361
    .line 362
    iget-object p0, v5, La/njr0;->I:La/ol60;

    .line 363
    .line 364
    sget-object p1, La/sir0;->a:La/sir0;

    .line 365
    .line 366
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    :cond_18
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 370
    .line 371
    :goto_e
    return-object v2

    .line 372
    nop

    .line 373
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
