.class public final La/myo0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/pyo0;


# direct methods
.method public synthetic constructor <init>(La/pyo0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/myo0;->i:B

    iput-object p1, p0, La/myo0;->k:La/pyo0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/myo0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/myo0;->k:La/pyo0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/myo0;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/myo0;-><init>(La/pyo0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/myo0;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/myo0;-><init>(La/pyo0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/myo0;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/myo0;-><init>(La/pyo0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/myo0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/myo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/myo0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/myo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/myo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/myo0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/myo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/myo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/myo0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/myo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget-byte v0, p0, La/myo0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/myo0;->k:La/pyo0;

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
    iget-boolean v5, p0, La/myo0;->j:Z

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
    iget-object p1, v2, La/pyo0;->w:La/yfu;

    .line 32
    .line 33
    invoke-virtual {p1}, La/yfu;->b()La/gmq;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance v1, La/nyo0;

    .line 38
    .line 39
    invoke-direct {v1, v2, v4}, La/nyo0;-><init>(La/pyo0;B)V

    .line 40
    .line 41
    .line 42
    iput-boolean v4, p0, La/myo0;->j:Z

    .line 43
    .line 44
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-ne p0, v0, :cond_2

    .line 49
    .line 50
    move-object v3, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    :goto_1
    return-object v3

    .line 55
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 56
    .line 57
    iget-boolean v5, p0, La/myo0;->j:Z

    .line 58
    .line 59
    if-eqz v5, :cond_4

    .line 60
    .line 61
    if-ne v5, v4, :cond_3

    .line 62
    .line 63
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, v2, La/pyo0;->v:La/j9u;

    .line 75
    .line 76
    iget-object p1, p1, La/j9u;->a:La/m0o0;

    .line 77
    .line 78
    invoke-virtual {p1}, La/m0o0;->e()La/gmq;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance v1, La/nyo0;

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-direct {v1, v2, v3}, La/nyo0;-><init>(La/pyo0;B)V

    .line 86
    .line 87
    .line 88
    iput-boolean v4, p0, La/myo0;->j:Z

    .line 89
    .line 90
    invoke-interface {p1, v1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-ne p0, v0, :cond_5

    .line 95
    .line 96
    move-object v3, v0

    .line 97
    goto :goto_3

    .line 98
    :cond_5
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    :goto_3
    return-object v3

    .line 101
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 102
    .line 103
    iget-boolean v5, p0, La/myo0;->j:Z

    .line 104
    .line 105
    if-eqz v5, :cond_7

    .line 106
    .line 107
    if-ne v5, v4, :cond_6

    .line 108
    .line 109
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_a

    .line 117
    .line 118
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object p1, v2, La/pyo0;->u:La/n4u;

    .line 122
    .line 123
    invoke-virtual {p1}, La/n4u;->b()La/a1t;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iput-boolean v4, p0, La/myo0;->j:Z

    .line 128
    .line 129
    invoke-static {p1, p0}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-ne p1, v0, :cond_8

    .line 134
    .line 135
    move-object v3, v0

    .line 136
    goto/16 :goto_a

    .line 137
    .line 138
    :cond_8
    :goto_4
    check-cast p1, Ljava/util/List;

    .line 139
    .line 140
    iget-object p0, v2, La/pyo0;->p:Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;

    .line 141
    .line 142
    iget-wide v0, p0, Lorg/xplatform/favorites/impl/presentation/teambet/presentation/models/TeamBetScreenParams;->a:J

    .line 143
    .line 144
    if-eqz p1, :cond_b

    .line 145
    .line 146
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_a

    .line 155
    .line 156
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    move-object v4, p1

    .line 161
    check-cast v4, La/xcp;

    .line 162
    .line 163
    iget-object v4, v4, La/xcp;->b:La/tnp0;

    .line 164
    .line 165
    invoke-interface {v4}, La/tnp0;->a()J

    .line 166
    .line 167
    .line 168
    move-result-wide v4

    .line 169
    cmp-long v4, v4, v0

    .line 170
    .line 171
    if-nez v4, :cond_9

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_a
    move-object p1, v3

    .line 175
    :goto_5
    check-cast p1, La/xcp;

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_b
    move-object p1, v3

    .line 179
    :goto_6
    if-eqz p1, :cond_c

    .line 180
    .line 181
    iget-object p0, p1, La/xcp;->f:Ljava/util/List;

    .line 182
    .line 183
    if-eqz p0, :cond_c

    .line 184
    .line 185
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    move-object v3, p0

    .line 190
    check-cast v3, Ljava/lang/String;

    .line 191
    .line 192
    :cond_c
    if-eqz v3, :cond_e

    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    if-nez p0, :cond_d

    .line 199
    .line 200
    goto :goto_8

    .line 201
    :cond_d
    :goto_7
    move-object v6, v3

    .line 202
    goto :goto_9

    .line 203
    :cond_e
    :goto_8
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    check-cast p0, La/kyo0;

    .line 208
    .line 209
    iget-object v3, p0, La/kyo0;->c:Ljava/lang/String;

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :goto_9
    iget-object p0, v2, La/pyo0;->o:La/vzg0;

    .line 213
    .line 214
    const-string p1, "TEAN_IMAGE_KEY"

    .line 215
    .line 216
    invoke-virtual {p0, p1, v6}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 220
    .line 221
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 222
    .line 223
    :cond_f
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-object v4, p1

    .line 231
    check-cast v4, La/kyo0;

    .line 232
    .line 233
    const/4 v9, 0x0

    .line 234
    const/16 v10, 0x7b

    .line 235
    .line 236
    const/4 v5, 0x0

    .line 237
    const/4 v7, 0x0

    .line 238
    const/4 v8, 0x0

    .line 239
    invoke-static/range {v4 .. v10}, La/kyo0;->a(La/kyo0;La/jyo0;Ljava/lang/String;La/j3p0;ZZI)La/kyo0;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    if-eqz p1, :cond_f

    .line 248
    .line 249
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    :goto_a
    return-object v3

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
