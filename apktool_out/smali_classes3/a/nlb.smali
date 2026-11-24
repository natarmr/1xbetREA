.class public final La/nlb;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:B

.field public final synthetic j:La/plb;

.field public final synthetic k:J

.field public final synthetic l:Ljava/lang/Long;


# direct methods
.method public constructor <init>(La/plb;JLjava/lang/Long;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/nlb;->j:La/plb;

    .line 2
    .line 3
    iput-wide p2, p0, La/nlb;->k:J

    .line 4
    .line 5
    iput-object p4, p0, La/nlb;->l:Ljava/lang/Long;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/nlb;

    .line 2
    .line 3
    iget-wide v2, p0, La/nlb;->k:J

    .line 4
    .line 5
    iget-object v4, p0, La/nlb;->l:Ljava/lang/Long;

    .line 6
    .line 7
    iget-object v1, p0, La/nlb;->j:La/plb;

    .line 8
    .line 9
    move-object v5, p1

    .line 10
    invoke-direct/range {v0 .. v5}, La/nlb;-><init>(La/plb;JLjava/lang/Long;La/yje;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/nlb;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/nlb;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/nlb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v1, p0, La/nlb;->j:La/plb;

    .line 2
    .line 3
    iget-object v2, v1, La/i3t0;->i:La/ocj;

    .line 4
    .line 5
    sget-object v3, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v0, p0, La/nlb;->i:B

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eq v0, v6, :cond_1

    .line 15
    .line 16
    if-ne v0, v5, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    check-cast p1, La/j0g0;

    .line 22
    .line 23
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    goto :goto_4

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v4

    .line 32
    :cond_1
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    move-object p1, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 43
    .line 44
    iget-object p1, v1, La/plb;->s:La/x0u;

    .line 45
    .line 46
    iput-byte v6, p0, La/nlb;->i:B

    .line 47
    .line 48
    invoke-virtual {p1, p0}, La/x0u;->c(La/yje;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v3, :cond_3

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    new-instance v0, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 64
    .line 65
    .line 66
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :goto_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 70
    .line 71
    new-instance v0, La/g0g0;

    .line 72
    .line 73
    invoke-direct {v0, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    new-instance p1, Ljava/lang/Integer;

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    invoke-direct {p1, v7}, Ljava/lang/Integer;-><init>(I)V

    .line 80
    .line 81
    .line 82
    instance-of v7, v0, La/g0g0;

    .line 83
    .line 84
    if-eqz v7, :cond_4

    .line 85
    .line 86
    move-object v0, p1

    .line 87
    :cond_4
    check-cast v0, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    iget-object v7, v1, La/plb;->q:La/xfu;

    .line 94
    .line 95
    iput-byte v5, p0, La/nlb;->i:B

    .line 96
    .line 97
    iget-wide v8, p0, La/nlb;->k:J

    .line 98
    .line 99
    iget-object v10, p0, La/nlb;->l:Ljava/lang/Long;

    .line 100
    .line 101
    move-object v12, p0

    .line 102
    invoke-virtual/range {v7 .. v12}, La/xfu;->i(JLjava/lang/Long;ILa/zje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-ne p0, v3, :cond_5

    .line 107
    .line 108
    :goto_3
    return-object v3

    .line 109
    :cond_5
    :goto_4
    sget p1, La/plb;->I:I

    .line 110
    .line 111
    iget-object p1, v2, La/ocj;->a:La/p7m0;

    .line 112
    .line 113
    :cond_6
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-object v7, v0

    .line 121
    check-cast v7, La/alb;

    .line 122
    .line 123
    new-instance v10, La/j0g0;

    .line 124
    .line 125
    invoke-direct {v10, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    const/4 v12, 0x0

    .line 129
    const/16 v13, 0x37ff

    .line 130
    .line 131
    const/4 v8, 0x0

    .line 132
    const/4 v9, 0x0

    .line 133
    const/4 v11, 0x0

    .line 134
    invoke-static/range {v7 .. v13}, La/alb;->a(La/alb;ZLa/jkb;La/j0g0;La/j0g0;Ljava/util/LinkedHashSet;I)La/alb;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {p1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_6

    .line 143
    .line 144
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    check-cast p0, La/alb;

    .line 149
    .line 150
    iget-object p0, p0, La/alb;->m:La/j0g0;

    .line 151
    .line 152
    if-nez p0, :cond_a

    .line 153
    .line 154
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    check-cast p0, La/alb;

    .line 159
    .line 160
    iget-object p0, p0, La/alb;->k:La/jkb;

    .line 161
    .line 162
    invoke-virtual {v1, p0}, La/plb;->N(La/jkb;)Ljava/lang/Long;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-eqz p0, :cond_8

    .line 167
    .line 168
    iget-object p1, v1, La/plb;->G:La/bby;

    .line 169
    .line 170
    if-eqz p1, :cond_7

    .line 171
    .line 172
    invoke-interface {p1}, La/bby;->isActive()Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-ne p1, v6, :cond_7

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_7
    new-instance p1, La/za;

    .line 180
    .line 181
    const/16 v0, 0x1d

    .line 182
    .line 183
    invoke-direct {p1, v1, p0, v4, v0}, La/za;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 184
    .line 185
    .line 186
    const/4 p0, 0x3

    .line 187
    invoke-static {v1, v4, v4, p1, p0}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    iput-object p0, v1, La/plb;->G:La/bby;

    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_8
    iget-object p0, v2, La/ocj;->a:La/p7m0;

    .line 195
    .line 196
    :cond_9
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-object v5, p1

    .line 204
    check-cast v5, La/alb;

    .line 205
    .line 206
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 207
    .line 208
    new-instance v0, La/ff5;

    .line 209
    .line 210
    invoke-direct {v0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    new-instance v1, La/g0g0;

    .line 214
    .line 215
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    new-instance v9, La/j0g0;

    .line 219
    .line 220
    invoke-direct {v9, v1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    const/4 v10, 0x0

    .line 224
    const/16 v11, 0x2fff

    .line 225
    .line 226
    const/4 v6, 0x0

    .line 227
    const/4 v7, 0x0

    .line 228
    const/4 v8, 0x0

    .line 229
    invoke-static/range {v5 .. v11}, La/alb;->a(La/alb;ZLa/jkb;La/j0g0;La/j0g0;Ljava/util/LinkedHashSet;I)La/alb;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    if-eqz p1, :cond_9

    .line 238
    .line 239
    :cond_a
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object p0
.end method
