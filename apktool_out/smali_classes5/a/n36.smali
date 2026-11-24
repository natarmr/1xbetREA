.class public final La/n36;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/p36;


# direct methods
.method public synthetic constructor <init>(La/p36;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/n36;->i:B

    iput-object p1, p0, La/n36;->k:La/p36;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/n36;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/n36;->k:La/p36;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/n36;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/n36;-><init>(La/p36;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/n36;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/n36;-><init>(La/p36;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/n36;->i:B

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
    invoke-virtual {p0, p1, p2}, La/n36;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/n36;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/n36;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/n36;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/n36;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/n36;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/n36;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/n36;->k:La/p36;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v2, La/p36;->k:La/qoj0;

    .line 15
    .line 16
    sget-object v7, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-byte v8, p0, La/n36;->j:B

    .line 19
    .line 20
    if-eqz v8, :cond_3

    .line 21
    .line 22
    if-eq v8, v6, :cond_2

    .line 23
    .line 24
    if-eq v8, v3, :cond_1

    .line 25
    .line 26
    if-ne v8, v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_5

    .line 33
    :cond_1
    :goto_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v2, La/p36;->l:Ljava/lang/Long;

    .line 45
    .line 46
    if-eqz p1, :cond_4

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v8

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    const-wide/16 v8, 0x0

    .line 54
    .line 55
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 56
    .line 57
    .line 58
    move-result-wide v10

    .line 59
    const-wide/16 v12, 0x7530

    .line 60
    .line 61
    sub-long/2addr v10, v12

    .line 62
    cmp-long p1, v8, v10

    .line 63
    .line 64
    if-gez p1, :cond_5

    .line 65
    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 67
    .line 68
    .line 69
    move-result-wide p0

    .line 70
    new-instance v0, Ljava/lang/Long;

    .line 71
    .line 72
    invoke-direct {v0, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 73
    .line 74
    .line 75
    iput-object v0, v2, La/p36;->l:Ljava/lang/Long;

    .line 76
    .line 77
    iget-object p0, v2, La/p36;->m:La/bby;

    .line 78
    .line 79
    invoke-static {p0}, La/v3c;->N(La/bby;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, La/p36;->f()V

    .line 83
    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_5
    iput-byte v6, p0, La/n36;->j:B

    .line 87
    .line 88
    const-wide/16 v1, 0x5dc

    .line 89
    .line 90
    invoke-static {v1, v2, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v7, :cond_6

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_6
    :goto_2
    invoke-virtual {v0}, La/qoj0;->d()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, La/f56;

    .line 106
    .line 107
    if-eqz p1, :cond_7

    .line 108
    .line 109
    iput-byte v3, p0, La/n36;->j:B

    .line 110
    .line 111
    invoke-virtual {v0, p1, p0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-ne p0, v7, :cond_8

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    iput-byte v4, p0, La/n36;->j:B

    .line 119
    .line 120
    sget-object p1, La/c56;->a:La/c56;

    .line 121
    .line 122
    invoke-virtual {v0, p1, p0}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v7, :cond_8

    .line 127
    .line 128
    :goto_3
    move-object v5, v7

    .line 129
    goto :goto_5

    .line 130
    :cond_8
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    :goto_5
    return-object v5

    .line 133
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 134
    .line 135
    iget-byte v7, p0, La/n36;->j:B

    .line 136
    .line 137
    if-eqz v7, :cond_c

    .line 138
    .line 139
    if-eq v7, v6, :cond_b

    .line 140
    .line 141
    if-eq v7, v3, :cond_a

    .line 142
    .line 143
    if-ne v7, v4, :cond_9

    .line 144
    .line 145
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    goto :goto_9

    .line 149
    :cond_9
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    goto :goto_a

    .line 153
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_6

    .line 161
    :cond_c
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iput-byte v6, p0, La/n36;->j:B

    .line 165
    .line 166
    invoke-virtual {v2, p0}, La/p36;->d(La/zje;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    if-ne p1, v0, :cond_d

    .line 171
    .line 172
    goto :goto_8

    .line 173
    :cond_d
    :goto_6
    iget-object p1, v2, La/p36;->b:La/h0q0;

    .line 174
    .line 175
    iget-object v1, v2, La/p36;->f:La/n0o0;

    .line 176
    .line 177
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    check-cast v1, La/sff0;

    .line 182
    .line 183
    iget-boolean v1, v1, La/sff0;->J1:Z

    .line 184
    .line 185
    iput-byte v3, p0, La/n36;->j:B

    .line 186
    .line 187
    const/4 v3, 0x0

    .line 188
    invoke-virtual {p1, v3, v1, p0}, La/h0q0;->x(ZZLa/zje;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    if-ne p1, v0, :cond_e

    .line 193
    .line 194
    goto :goto_8

    .line 195
    :cond_e
    :goto_7
    check-cast p1, La/gmq;

    .line 196
    .line 197
    new-instance v1, La/lr;

    .line 198
    .line 199
    const/16 v3, 0x19

    .line 200
    .line 201
    invoke-direct {v1, p1, v3}, La/lr;-><init>(La/gmq;B)V

    .line 202
    .line 203
    .line 204
    new-instance p1, La/j36;

    .line 205
    .line 206
    invoke-direct {p1, v2, v5, v6}, La/j36;-><init>(La/p36;La/yje;B)V

    .line 207
    .line 208
    .line 209
    new-instance v3, La/fnq;

    .line 210
    .line 211
    const/4 v7, 0x4

    .line 212
    invoke-direct {v3, v1, p1, v7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 213
    .line 214
    .line 215
    new-instance p1, La/rj;

    .line 216
    .line 217
    invoke-direct {p1, v2, v5, v7}, La/rj;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 218
    .line 219
    .line 220
    new-instance v1, La/dnq;

    .line 221
    .line 222
    invoke-direct {v1, v3, p1, v6}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 223
    .line 224
    .line 225
    iput-byte v4, p0, La/n36;->j:B

    .line 226
    .line 227
    invoke-static {v1, p0}, La/slb;->N(La/gmq;La/yje;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    if-ne p0, v0, :cond_f

    .line 232
    .line 233
    :goto_8
    move-object v5, v0

    .line 234
    goto :goto_a

    .line 235
    :cond_f
    :goto_9
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    :goto_a
    return-object v5

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
