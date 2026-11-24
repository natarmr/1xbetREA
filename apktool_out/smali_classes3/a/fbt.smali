.class public final La/fbt;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/pbt;

.field public final synthetic l:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(La/pbt;Ljava/util/List;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/fbt;->i:B

    iput-object p1, p0, La/fbt;->k:La/pbt;

    iput-object p2, p0, La/fbt;->l:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/fbt;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/fbt;

    .line 7
    .line 8
    iget-object v0, p0, La/fbt;->l:Ljava/util/List;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object p0, p0, La/fbt;->k:La/pbt;

    .line 12
    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/fbt;-><init>(La/pbt;Ljava/util/List;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/fbt;

    .line 18
    .line 19
    iget-object v0, p0, La/fbt;->l:Ljava/util/List;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iget-object p0, p0, La/fbt;->k:La/pbt;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, La/fbt;-><init>(La/pbt;Ljava/util/List;La/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fbt;->i:B

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
    invoke-virtual {p0, p1, p2}, La/fbt;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/fbt;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/fbt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/fbt;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/fbt;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/fbt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/fbt;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/fbt;->k:La/pbt;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    iget-object v5, p0, La/fbt;->l:Ljava/util/List;

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
    iget-byte v7, p0, La/fbt;->j:B

    .line 18
    .line 19
    if-eqz v7, :cond_2

    .line 20
    .line 21
    if-eq v7, v3, :cond_1

    .line 22
    .line 23
    if-ne v7, v4, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_3

    .line 29
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_5

    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, v2, La/pbt;->c:La/g7d;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    iput-wide v6, p1, La/g7d;->d:J

    .line 50
    .line 51
    iget-object p1, v2, La/pbt;->l:La/pru;

    .line 52
    .line 53
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iget-boolean p1, p1, La/sff0;->V1:Z

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    iput-byte v3, p0, La/fbt;->j:B

    .line 62
    .line 63
    invoke-virtual {v2, v5, p0}, La/pbt;->s(Ljava/util/List;La/zje;)Ljava/io/Serializable;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v0, :cond_3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 71
    .line 72
    :goto_1
    move-object v6, p1

    .line 73
    goto :goto_4

    .line 74
    :cond_4
    iput-byte v4, p0, La/fbt;->j:B

    .line 75
    .line 76
    invoke-virtual {v2, v5, p0}, La/pbt;->t(Ljava/util/List;La/zje;)Ljava/io/Serializable;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-ne p1, v0, :cond_5

    .line 81
    .line 82
    :goto_2
    move-object v6, v0

    .line 83
    goto :goto_5

    .line 84
    :cond_5
    :goto_3
    check-cast p1, Ljava/util/List;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :goto_4
    iget-object p0, v2, La/pbt;->c:La/g7d;

    .line 88
    .line 89
    invoke-virtual {p0, v6}, La/g7d;->f(Ljava/util/List;)V

    .line 90
    .line 91
    .line 92
    :goto_5
    return-object v6

    .line 93
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 94
    .line 95
    iget-byte v7, p0, La/fbt;->j:B

    .line 96
    .line 97
    if-eqz v7, :cond_8

    .line 98
    .line 99
    if-eq v7, v3, :cond_7

    .line 100
    .line 101
    if-ne v7, v4, :cond_6

    .line 102
    .line 103
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_8

    .line 107
    :cond_6
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_d

    .line 111
    .line 112
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, v2, La/pbt;->l:La/pru;

    .line 120
    .line 121
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    iget-boolean p1, p1, La/sff0;->V1:Z

    .line 126
    .line 127
    if-eqz p1, :cond_a

    .line 128
    .line 129
    iput-byte v3, p0, La/fbt;->j:B

    .line 130
    .line 131
    invoke-virtual {v2, v5, p0}, La/pbt;->m(Ljava/util/List;La/zje;)Ljava/io/Serializable;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-ne p1, v0, :cond_9

    .line 136
    .line 137
    goto :goto_7

    .line 138
    :cond_9
    :goto_6
    check-cast p1, Ljava/util/List;

    .line 139
    .line 140
    goto :goto_9

    .line 141
    :cond_a
    iput-byte v4, p0, La/fbt;->j:B

    .line 142
    .line 143
    invoke-virtual {v2, v5, p0}, La/pbt;->n(Ljava/util/List;La/zje;)Ljava/io/Serializable;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-ne p1, v0, :cond_b

    .line 148
    .line 149
    :goto_7
    move-object v6, v0

    .line 150
    goto/16 :goto_d

    .line 151
    .line 152
    :cond_b
    :goto_8
    check-cast p1, Ljava/util/List;

    .line 153
    .line 154
    :goto_9
    iget-object p0, v2, La/pbt;->d:La/p2t;

    .line 155
    .line 156
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-nez v0, :cond_11

    .line 167
    .line 168
    invoke-virtual {p0}, La/p2t;->a()Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-eqz v0, :cond_11

    .line 173
    .line 174
    new-instance v1, Ljava/util/ArrayList;

    .line 175
    .line 176
    const/16 v2, 0xa

    .line 177
    .line 178
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 183
    .line 184
    .line 185
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-eqz v2, :cond_10

    .line 194
    .line 195
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    check-cast v2, La/rq60;

    .line 200
    .line 201
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    :cond_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_d

    .line 210
    .line 211
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    move-object v7, v5

    .line 216
    check-cast v7, La/uq60;

    .line 217
    .line 218
    iget v7, v7, La/uq60;->a:I

    .line 219
    .line 220
    iget v8, v2, La/rq60;->a:I

    .line 221
    .line 222
    if-ne v7, v8, :cond_c

    .line 223
    .line 224
    goto :goto_b

    .line 225
    :cond_d
    move-object v5, v6

    .line 226
    :goto_b
    check-cast v5, La/uq60;

    .line 227
    .line 228
    if-eqz v5, :cond_f

    .line 229
    .line 230
    iget-object v4, v5, La/uq60;->b:La/vpv0;

    .line 231
    .line 232
    sget-object v5, La/vpv0;->b:La/vpv0;

    .line 233
    .line 234
    if-ne v4, v5, :cond_e

    .line 235
    .line 236
    move v12, v3

    .line 237
    goto :goto_c

    .line 238
    :cond_e
    const/4 v4, 0x0

    .line 239
    move v12, v4

    .line 240
    :goto_c
    iget v8, v2, La/rq60;->a:I

    .line 241
    .line 242
    iget-object v9, v2, La/rq60;->b:Ljava/lang/String;

    .line 243
    .line 244
    iget-object v10, v2, La/rq60;->c:Ljava/lang/String;

    .line 245
    .line 246
    iget-object v11, v2, La/rq60;->e:Ljava/util/List;

    .line 247
    .line 248
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    new-instance v7, La/rq60;

    .line 258
    .line 259
    invoke-direct/range {v7 .. v12}, La/rq60;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    .line 260
    .line 261
    .line 262
    move-object v2, v7

    .line 263
    :cond_f
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_a

    .line 267
    :cond_10
    invoke-virtual {p0, v1}, La/p2t;->b(Ljava/util/List;)V

    .line 268
    .line 269
    .line 270
    :cond_11
    move-object v6, p1

    .line 271
    :goto_d
    return-object v6

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
