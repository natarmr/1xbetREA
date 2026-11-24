.class public final La/sqg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/vqg;


# direct methods
.method public synthetic constructor <init>(La/vqg;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/sqg;->i:B

    iput-object p1, p0, La/sqg;->k:La/vqg;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/sqg;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/sqg;->k:La/vqg;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/sqg;

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/sqg;-><init>(La/vqg;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/sqg;

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/sqg;-><init>(La/vqg;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance v0, La/sqg;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, p2, v1}, La/sqg;-><init>(La/vqg;La/yje;B)V

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
    iput-boolean p0, v0, La/sqg;->j:Z

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_2
    new-instance p1, La/sqg;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {p1, p0, p2, v0}, La/sqg;-><init>(La/vqg;La/yje;B)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/sqg;->i:B

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
    invoke-virtual {p0, p1, p2}, La/sqg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/sqg;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/sqg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/sqg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/sqg;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/sqg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/sqg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/sqg;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/sqg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/sqg;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/sqg;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/sqg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/sqg;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/sqg;->k:La/vqg;

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
    iget-boolean v5, p0, La/sqg;->j:Z

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
    iget-object v6, v2, La/vqg;->s:La/h3c;

    .line 32
    .line 33
    iget-object p1, v2, La/vqg;->b:Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 34
    .line 35
    iget-wide v9, p1, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->b:J

    .line 36
    .line 37
    iput-boolean v4, p0, La/sqg;->j:Z

    .line 38
    .line 39
    const-wide/16 v7, 0x28

    .line 40
    .line 41
    move-object v11, p0

    .line 42
    invoke-virtual/range {v6 .. v11}, La/h3c;->a(JJLa/zje;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    .line 48
    move-object v3, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 51
    .line 52
    iget-object p0, v2, La/vqg;->r:La/oeg0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance v0, La/v4f;

    .line 59
    .line 60
    const/16 v1, 0x16

    .line 61
    .line 62
    invoke-direct {v0, v2, p1, v1}, La/v4f;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 66
    .line 67
    .line 68
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    :goto_1
    return-object v3

    .line 71
    :pswitch_0
    move-object v9, p0

    .line 72
    sget-object p0, La/wne;->a:La/wne;

    .line 73
    .line 74
    iget-boolean v0, v9, La/sqg;->j:Z

    .line 75
    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    if-ne v0, v4, :cond_3

    .line 79
    .line 80
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    iget-object p1, v2, La/vqg;->H:La/p7m0;

    .line 92
    .line 93
    iget-object v0, v2, La/vqg;->K:La/p7m0;

    .line 94
    .line 95
    new-instance v1, La/znc;

    .line 96
    .line 97
    const/4 v5, 0x3

    .line 98
    invoke-direct {v1, v5, v3, v4}, La/znc;-><init>(ILa/yje;B)V

    .line 99
    .line 100
    .line 101
    new-instance v6, La/p6d;

    .line 102
    .line 103
    invoke-direct {v6, p1, v0, v1, v4}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 104
    .line 105
    .line 106
    iget-object p1, v2, La/vqg;->L:La/p7m0;

    .line 107
    .line 108
    new-instance v0, La/y0g;

    .line 109
    .line 110
    invoke-direct {v0, v2, v3, v4}, La/y0g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 111
    .line 112
    .line 113
    new-instance v1, La/p6d;

    .line 114
    .line 115
    invoke-direct {v1, v6, p1, v0, v4}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 116
    .line 117
    .line 118
    new-instance p1, La/lo3;

    .line 119
    .line 120
    const/16 v0, 0xa

    .line 121
    .line 122
    invoke-direct {p1, v5, v3, v0}, La/lo3;-><init>(ILa/yje;B)V

    .line 123
    .line 124
    .line 125
    new-instance v0, La/dnq;

    .line 126
    .line 127
    invoke-direct {v0, v1, p1, v4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 128
    .line 129
    .line 130
    iput-boolean v4, v9, La/sqg;->j:Z

    .line 131
    .line 132
    invoke-static {v0, v9}, La/slb;->N(La/gmq;La/yje;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-ne p1, p0, :cond_5

    .line 137
    .line 138
    move-object v3, p0

    .line 139
    goto :goto_3

    .line 140
    :cond_5
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    :goto_3
    return-object v3

    .line 143
    :pswitch_1
    move-object v9, p0

    .line 144
    iget-boolean p0, v9, La/sqg;->j:Z

    .line 145
    .line 146
    sget-object v0, La/wne;->a:La/wne;

    .line 147
    .line 148
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    if-eqz p0, :cond_6

    .line 152
    .line 153
    invoke-virtual {v2}, La/vqg;->w()V

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :cond_6
    iget-object p0, v2, La/vqg;->C:La/bby;

    .line 158
    .line 159
    if-eqz p0, :cond_7

    .line 160
    .line 161
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-ne p0, v4, :cond_7

    .line 166
    .line 167
    iget-object p0, v2, La/vqg;->C:La/bby;

    .line 168
    .line 169
    if-eqz p0, :cond_7

    .line 170
    .line 171
    invoke-interface {p0, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 172
    .line 173
    .line 174
    :cond_7
    iget-object p0, v2, La/vqg;->E:La/dqg;

    .line 175
    .line 176
    if-nez p0, :cond_8

    .line 177
    .line 178
    invoke-virtual {v2}, La/vqg;->z()V

    .line 179
    .line 180
    .line 181
    :cond_8
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_2
    move-object v9, p0

    .line 185
    iget-object p0, v2, La/vqg;->b:Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 186
    .line 187
    sget-object v0, La/wne;->a:La/wne;

    .line 188
    .line 189
    iget-boolean v5, v9, La/sqg;->j:Z

    .line 190
    .line 191
    if-eqz v5, :cond_a

    .line 192
    .line 193
    if-ne v5, v4, :cond_9

    .line 194
    .line 195
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    move p1, v4

    .line 207
    iget-object v4, v2, La/vqg;->m:La/j3c;

    .line 208
    .line 209
    iget-wide v7, p0, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->b:J

    .line 210
    .line 211
    iput-boolean p1, v9, La/sqg;->j:Z

    .line 212
    .line 213
    const-wide/16 v5, 0x28

    .line 214
    .line 215
    invoke-virtual/range {v4 .. v9}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    if-ne p1, v0, :cond_b

    .line 220
    .line 221
    move-object v3, v0

    .line 222
    goto :goto_6

    .line 223
    :cond_b
    :goto_5
    check-cast p1, La/ypl0;

    .line 224
    .line 225
    new-instance v3, La/bqr;

    .line 226
    .line 227
    iget-wide v6, p0, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->b:J

    .line 228
    .line 229
    iget-object p0, p1, La/ypl0;->c:La/lel0;

    .line 230
    .line 231
    iget-object v8, p0, La/lel0;->i:Ljava/lang/String;

    .line 232
    .line 233
    const-wide/16 v4, 0x28

    .line 234
    .line 235
    invoke-direct/range {v3 .. v8}, La/bqr;-><init>(JJLjava/lang/String;)V

    .line 236
    .line 237
    .line 238
    iget-object p0, v2, La/vqg;->J:La/p7m0;

    .line 239
    .line 240
    :cond_c
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    move-object v0, p1

    .line 245
    check-cast v0, La/cqr;

    .line 246
    .line 247
    const/4 v0, 0x0

    .line 248
    invoke-static {v3, v0}, La/kpb;->o0(La/bqr;Z)La/cqr;

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
    if-eqz p1, :cond_c

    .line 257
    .line 258
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    :goto_6
    return-object v3

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
