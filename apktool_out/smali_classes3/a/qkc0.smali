.class public final La/qkc0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:J

.field public k:B

.field public synthetic l:J

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/rkc0;JJLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/qkc0;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/qkc0;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p2, p0, La/qkc0;->j:J

    .line 7
    .line 8
    iput-wide p4, p0, La/qkc0;->l:J

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(La/sch0;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/qkc0;->i:B

    .line 15
    iput-object p1, p0, La/qkc0;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte v0, p0, La/qkc0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/qkc0;

    .line 7
    .line 8
    iget-object p0, p0, La/qkc0;->m:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/sch0;

    .line 11
    .line 12
    invoke-direct {v0, p0, p2}, La/qkc0;-><init>(La/sch0;La/yje;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, La/g6u0;

    .line 16
    .line 17
    iget-wide p0, p1, La/g6u0;->a:J

    .line 18
    .line 19
    iput-wide p0, v0, La/qkc0;->l:J

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    new-instance v1, La/qkc0;

    .line 23
    .line 24
    iget-object p1, p0, La/qkc0;->m:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    check-cast v2, La/rkc0;

    .line 28
    .line 29
    iget-wide v3, p0, La/qkc0;->j:J

    .line 30
    .line 31
    iget-wide v5, p0, La/qkc0;->l:J

    .line 32
    .line 33
    move-object v7, p2

    .line 34
    invoke-direct/range {v1 .. v7}, La/qkc0;-><init>(La/rkc0;JJLa/yje;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qkc0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/g6u0;

    .line 7
    .line 8
    iget-wide v0, p1, La/g6u0;->a:J

    .line 9
    .line 10
    check-cast p2, La/yje;

    .line 11
    .line 12
    new-instance p1, La/qkc0;

    .line 13
    .line 14
    iget-object p0, p0, La/qkc0;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/sch0;

    .line 17
    .line 18
    invoke-direct {p1, p0, p2}, La/qkc0;-><init>(La/sch0;La/yje;)V

    .line 19
    .line 20
    .line 21
    iput-wide v0, p1, La/qkc0;->l:J

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    invoke-virtual {p1, p0}, La/qkc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, La/vne;

    .line 31
    .line 32
    check-cast p2, La/yje;

    .line 33
    .line 34
    invoke-virtual {p0, p1, p2}, La/qkc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/qkc0;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/qkc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/qkc0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/qkc0;->m:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v2, La/sch0;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-byte v6, p0, La/qkc0;->k:B

    .line 18
    .line 19
    const/4 v7, 0x3

    .line 20
    if-eqz v6, :cond_3

    .line 21
    .line 22
    if-eq v6, v3, :cond_2

    .line 23
    .line 24
    if-eq v6, v4, :cond_1

    .line 25
    .line 26
    if-ne v6, v7, :cond_0

    .line 27
    .line 28
    iget-wide v0, p0, La/qkc0;->j:J

    .line 29
    .line 30
    iget-wide v2, p0, La/qkc0;->l:J

    .line 31
    .line 32
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_4

    .line 40
    :cond_1
    iget-wide v3, p0, La/qkc0;->j:J

    .line 41
    .line 42
    iget-wide v5, p0, La/qkc0;->l:J

    .line 43
    .line 44
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget-wide v5, p0, La/qkc0;->l:J

    .line 49
    .line 50
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-wide v5, p0, La/qkc0;->l:J

    .line 58
    .line 59
    iget-object p1, v2, La/sch0;->f:La/yj50;

    .line 60
    .line 61
    iput-wide v5, p0, La/qkc0;->l:J

    .line 62
    .line 63
    iput-byte v3, p0, La/qkc0;->k:B

    .line 64
    .line 65
    invoke-virtual {p1, v5, v6, p0}, La/yj50;->b(JLa/zje;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v0, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    :goto_0
    check-cast p1, La/g6u0;

    .line 73
    .line 74
    iget-wide v8, p1, La/g6u0;->a:J

    .line 75
    .line 76
    invoke-static {v5, v6, v8, v9}, La/g6u0;->d(JJ)J

    .line 77
    .line 78
    .line 79
    move-result-wide v8

    .line 80
    iput-wide v5, p0, La/qkc0;->l:J

    .line 81
    .line 82
    iput-wide v8, p0, La/qkc0;->j:J

    .line 83
    .line 84
    iput-byte v4, p0, La/qkc0;->k:B

    .line 85
    .line 86
    invoke-virtual {v2, v8, v9, p0}, La/sch0;->a(JLa/zje;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v0, :cond_5

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_5
    move-wide v3, v8

    .line 94
    :goto_1
    check-cast p1, La/g6u0;

    .line 95
    .line 96
    iget-wide v11, p1, La/g6u0;->a:J

    .line 97
    .line 98
    iget-object v8, v2, La/sch0;->f:La/yj50;

    .line 99
    .line 100
    invoke-static {v3, v4, v11, v12}, La/g6u0;->d(JJ)J

    .line 101
    .line 102
    .line 103
    move-result-wide v9

    .line 104
    iput-wide v5, p0, La/qkc0;->l:J

    .line 105
    .line 106
    iput-wide v11, p0, La/qkc0;->j:J

    .line 107
    .line 108
    iput-byte v7, p0, La/qkc0;->k:B

    .line 109
    .line 110
    move-object v13, p0

    .line 111
    invoke-virtual/range {v8 .. v13}, La/yj50;->a(JJLa/zje;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-ne p1, v0, :cond_6

    .line 116
    .line 117
    :goto_2
    move-object v5, v0

    .line 118
    goto :goto_4

    .line 119
    :cond_6
    move-wide v2, v5

    .line 120
    move-wide v0, v11

    .line 121
    :goto_3
    check-cast p1, La/g6u0;

    .line 122
    .line 123
    iget-wide p0, p1, La/g6u0;->a:J

    .line 124
    .line 125
    invoke-static {v0, v1, p0, p1}, La/g6u0;->d(JJ)J

    .line 126
    .line 127
    .line 128
    move-result-wide p0

    .line 129
    invoke-static {v2, v3, p0, p1}, La/g6u0;->d(JJ)J

    .line 130
    .line 131
    .line 132
    move-result-wide p0

    .line 133
    new-instance v5, La/g6u0;

    .line 134
    .line 135
    invoke-direct {v5, p0, p1}, La/g6u0;-><init>(J)V

    .line 136
    .line 137
    .line 138
    :goto_4
    return-object v5

    .line 139
    :pswitch_0
    move-object v13, p0

    .line 140
    check-cast v2, La/rkc0;

    .line 141
    .line 142
    sget-object p0, La/wne;->a:La/wne;

    .line 143
    .line 144
    iget-byte v0, v13, La/qkc0;->k:B

    .line 145
    .line 146
    if-eqz v0, :cond_9

    .line 147
    .line 148
    if-eq v0, v3, :cond_8

    .line 149
    .line 150
    if-ne v0, v4, :cond_7

    .line 151
    .line 152
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto/16 :goto_9

    .line 156
    .line 157
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_a

    .line 161
    .line 162
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iget-object p1, v2, La/rkc0;->a:La/yox;

    .line 170
    .line 171
    iget-object v0, v2, La/rkc0;->d:La/knf0;

    .line 172
    .line 173
    iget-object v1, v2, La/rkc0;->c:La/btt0;

    .line 174
    .line 175
    invoke-virtual {v1}, La/btt0;->a()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v11

    .line 183
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    new-instance v6, La/poc0;

    .line 187
    .line 188
    iget-wide v7, v13, La/qkc0;->j:J

    .line 189
    .line 190
    iget-wide v9, v13, La/qkc0;->l:J

    .line 191
    .line 192
    invoke-direct/range {v6 .. v11}, La/poc0;-><init>(JJLjava/lang/String;)V

    .line 193
    .line 194
    .line 195
    iput-byte v3, v13, La/qkc0;->k:B

    .line 196
    .line 197
    iget-object p1, p1, La/yox;->a:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p1, La/rta0;

    .line 200
    .line 201
    invoke-virtual {p1}, La/rta0;->invoke()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    check-cast p1, La/w4c0;

    .line 206
    .line 207
    invoke-interface {p1, v1, v6, v13}, La/w4c0;->a(Ljava/lang/String;La/poc0;La/yje;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    if-ne p1, p0, :cond_a

    .line 212
    .line 213
    goto :goto_8

    .line 214
    :cond_a
    :goto_5
    check-cast p1, La/u2t;

    .line 215
    .line 216
    invoke-virtual {p1}, La/u2t;->a()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    check-cast p1, La/trt;

    .line 221
    .line 222
    iget-object v0, p1, La/trt;->f:Ljava/lang/Long;

    .line 223
    .line 224
    iget-wide v6, v13, La/qkc0;->l:J

    .line 225
    .line 226
    if-eqz v0, :cond_e

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 229
    .line 230
    .line 231
    move-result-wide v0

    .line 232
    cmp-long v0, v0, v6

    .line 233
    .line 234
    if-nez v0, :cond_e

    .line 235
    .line 236
    iget-object v0, v2, La/rkc0;->b:La/dnc0;

    .line 237
    .line 238
    invoke-static {p1}, La/obb;->l0(La/trt;)La/pl5;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    iput-byte v4, v13, La/qkc0;->k:B

    .line 243
    .line 244
    iget v1, v0, La/dnc0;->e:I

    .line 245
    .line 246
    iget v2, p1, La/pl5;->f:I

    .line 247
    .line 248
    if-eq v1, v2, :cond_b

    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_b
    const/4 v3, 0x0

    .line 252
    :goto_6
    iput-boolean v3, v0, La/dnc0;->f:Z

    .line 253
    .line 254
    iput v2, v0, La/dnc0;->e:I

    .line 255
    .line 256
    iget-object v0, v0, La/dnc0;->d:La/qoj0;

    .line 257
    .line 258
    invoke-virtual {v0, p1, v13}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    if-ne p1, p0, :cond_c

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_c
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    :goto_7
    if-ne p1, p0, :cond_d

    .line 268
    .line 269
    :goto_8
    move-object v5, p0

    .line 270
    goto :goto_a

    .line 271
    :cond_d
    :goto_9
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    goto :goto_a

    .line 274
    :cond_e
    invoke-static {v5}, La/jf4;->k(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    :goto_a
    return-object v5

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
