.class public final La/see;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public k:I

.field public l:I

.field public m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/a4x;ILa/xcz;ILa/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/see;->i:B

    .line 17
    iput-object p1, p0, La/see;->m:Ljava/lang/Object;

    iput p2, p0, La/see;->k:I

    iput-object p3, p0, La/see;->n:Ljava/lang/Object;

    iput p4, p0, La/see;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/n0w;La/n4u;IILa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/see;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/see;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/see;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, La/see;->k:I

    .line 9
    .line 10
    iput p4, p0, La/see;->l:I

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(La/vsl0;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/see;->i:B

    .line 18
    iput-object p1, p0, La/see;->n:Ljava/lang/Object;

    invoke-direct {p0, v0, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/wfq0;IILa/yje;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/see;->i:B

    .line 19
    iput-object p1, p0, La/see;->n:Ljava/lang/Object;

    iput p2, p0, La/see;->k:I

    iput p3, p0, La/see;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/see;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/see;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/see;

    .line 9
    .line 10
    check-cast v0, La/wfq0;

    .line 11
    .line 12
    iget v1, p0, La/see;->k:I

    .line 13
    .line 14
    iget p0, p0, La/see;->l:I

    .line 15
    .line 16
    invoke-direct {p1, v0, v1, p0, p2}, La/see;-><init>(La/wfq0;IILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    new-instance p0, La/see;

    .line 21
    .line 22
    check-cast v0, La/vsl0;

    .line 23
    .line 24
    invoke-direct {p0, v0, p2}, La/see;-><init>(La/vsl0;La/yje;)V

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_1
    new-instance v1, La/see;

    .line 29
    .line 30
    iget-object p1, p0, La/see;->m:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v2, p1

    .line 33
    check-cast v2, La/n0w;

    .line 34
    .line 35
    move-object v3, v0

    .line 36
    check-cast v3, La/n4u;

    .line 37
    .line 38
    iget v4, p0, La/see;->k:I

    .line 39
    .line 40
    iget v5, p0, La/see;->l:I

    .line 41
    .line 42
    move-object v6, p2

    .line 43
    invoke-direct/range {v1 .. v6}, La/see;-><init>(La/n0w;La/n4u;IILa/yje;)V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :pswitch_2
    move-object v6, p2

    .line 48
    new-instance v2, La/see;

    .line 49
    .line 50
    iget-object p1, p0, La/see;->m:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v3, p1

    .line 53
    check-cast v3, La/a4x;

    .line 54
    .line 55
    iget v4, p0, La/see;->k:I

    .line 56
    .line 57
    move-object v5, v0

    .line 58
    check-cast v5, La/xcz;

    .line 59
    .line 60
    iget p0, p0, La/see;->l:I

    .line 61
    .line 62
    move-object v7, v6

    .line 63
    move v6, p0

    .line 64
    invoke-direct/range {v2 .. v7}, La/see;-><init>(La/a4x;ILa/xcz;ILa/yje;)V

    .line 65
    .line 66
    .line 67
    return-object v2

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/see;->i:B

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
    invoke-virtual {p0, p1, p2}, La/see;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/see;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/see;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/see;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/see;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/see;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    check-cast p2, La/yje;

    .line 47
    .line 48
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1, p2}, La/see;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/see;

    .line 57
    .line 58
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, La/see;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_2
    check-cast p1, La/vne;

    .line 66
    .line 67
    check-cast p2, La/yje;

    .line 68
    .line 69
    invoke-virtual {p0, p1, p2}, La/see;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/see;

    .line 74
    .line 75
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, La/see;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/see;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v3, v0, La/see;->n:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v3, La/wfq0;

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-byte v7, v0, La/see;->j:B

    .line 20
    .line 21
    if-eqz v7, :cond_2

    .line 22
    .line 23
    if-eq v7, v4, :cond_1

    .line 24
    .line 25
    if-ne v7, v5, :cond_0

    .line 26
    .line 27
    iget-object v0, v0, La/see;->m:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, La/xeq0;

    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, La/wfq0;->x()V

    .line 47
    .line 48
    .line 49
    iget-object v2, v3, La/wfq0;->j:La/ouu;

    .line 50
    .line 51
    iget v7, v0, La/see;->k:I

    .line 52
    .line 53
    iget v8, v0, La/see;->l:I

    .line 54
    .line 55
    iget-object v9, v3, La/wfq0;->r:La/y5s;

    .line 56
    .line 57
    iget-object v9, v9, La/y5s;->a:La/s470;

    .line 58
    .line 59
    iput-byte v4, v0, La/see;->j:B

    .line 60
    .line 61
    invoke-virtual {v2, v7, v8, v9, v0}, La/ouu;->H(IILa/s470;La/zje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-ne v2, v1, :cond_3

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_0
    iget-object v2, v3, La/wfq0;->i:La/svu;

    .line 69
    .line 70
    iget-object v2, v2, La/svu;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, La/kgq0;

    .line 73
    .line 74
    iget-object v2, v2, La/kgq0;->c:La/beq0;

    .line 75
    .line 76
    iget-object v2, v2, La/beq0;->a:La/xfq0;

    .line 77
    .line 78
    iget-object v2, v2, La/xfq0;->b:La/xeq0;

    .line 79
    .line 80
    iget-object v4, v3, La/wfq0;->h:La/fq;

    .line 81
    .line 82
    iput-object v2, v0, La/see;->m:Ljava/lang/Object;

    .line 83
    .line 84
    iput-byte v5, v0, La/see;->j:B

    .line 85
    .line 86
    sget-object v5, La/cy5;->a:La/cy5;

    .line 87
    .line 88
    invoke-virtual {v4, v5, v0}, La/fq;->f(La/zy5;La/yje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-ne v0, v1, :cond_4

    .line 93
    .line 94
    :goto_1
    move-object v6, v1

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    move-object v0, v2

    .line 97
    :goto_2
    iget-object v1, v3, La/wfq0;->y:La/p7m0;

    .line 98
    .line 99
    new-instance v2, La/lfq0;

    .line 100
    .line 101
    iget-object v4, v0, La/xeq0;->a:Ljava/util/List;

    .line 102
    .line 103
    iget-object v5, v0, La/xeq0;->c:Ljava/util/List;

    .line 104
    .line 105
    iget-object v7, v0, La/xeq0;->d:Ljava/util/List;

    .line 106
    .line 107
    invoke-direct {v2, v4, v5, v7}, La/lfq0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v6, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    iget-object v0, v0, La/xeq0;->b:Ljava/util/List;

    .line 117
    .line 118
    invoke-virtual {v3, v0}, La/wfq0;->w(Ljava/util/List;)V

    .line 119
    .line 120
    .line 121
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    :goto_3
    return-object v6

    .line 124
    :pswitch_0
    check-cast v3, La/vsl0;

    .line 125
    .line 126
    sget-object v1, La/wne;->a:La/wne;

    .line 127
    .line 128
    iget-byte v7, v0, La/see;->j:B

    .line 129
    .line 130
    const/4 v8, 0x0

    .line 131
    const/4 v9, 0x3

    .line 132
    const/16 v10, 0xa

    .line 133
    .line 134
    if-eqz v7, :cond_8

    .line 135
    .line 136
    if-eq v7, v4, :cond_7

    .line 137
    .line 138
    if-eq v7, v5, :cond_6

    .line 139
    .line 140
    if-ne v7, v9, :cond_5

    .line 141
    .line 142
    iget v1, v0, La/see;->l:I

    .line 143
    .line 144
    iget-object v0, v0, La/see;->m:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    move-object v6, v0

    .line 152
    move-object/from16 v0, p1

    .line 153
    .line 154
    goto/16 :goto_9

    .line 155
    .line 156
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_11

    .line 160
    .line 161
    :cond_6
    iget v2, v0, La/see;->k:I

    .line 162
    .line 163
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    move-object/from16 v5, p1

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_7
    iget v2, v0, La/see;->k:I

    .line 170
    .line 171
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    move-object/from16 v6, p1

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    iget-object v2, v3, La/vsl0;->z:La/vjp;

    .line 181
    .line 182
    iget-object v2, v2, La/vjp;->a:La/pru;

    .line 183
    .line 184
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    iget-object v2, v2, La/sff0;->L:La/rib0;

    .line 189
    .line 190
    iget v2, v2, La/rib0;->c:I

    .line 191
    .line 192
    iget-object v6, v3, La/vsl0;->y:La/hsj;

    .line 193
    .line 194
    iput v2, v0, La/see;->k:I

    .line 195
    .line 196
    iput-byte v4, v0, La/see;->j:B

    .line 197
    .line 198
    iget-object v7, v6, La/hsj;->a:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v7, La/iqi;

    .line 201
    .line 202
    iget-object v6, v6, La/hsj;->b:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v6, La/pru;

    .line 205
    .line 206
    invoke-virtual {v6}, La/pru;->a()La/sff0;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    iget-object v6, v6, La/sff0;->L:La/rib0;

    .line 211
    .line 212
    iget v6, v6, La/rib0;->c:I

    .line 213
    .line 214
    invoke-virtual {v7, v6, v0}, La/iqi;->d(ILa/zje;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    if-ne v6, v1, :cond_9

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_9
    :goto_4
    check-cast v6, La/gmq;

    .line 222
    .line 223
    iput v2, v0, La/see;->k:I

    .line 224
    .line 225
    iput-byte v5, v0, La/see;->j:B

    .line 226
    .line 227
    invoke-static {v6, v0}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    if-ne v5, v1, :cond_a

    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_a
    :goto_5
    check-cast v5, Ljava/util/List;

    .line 235
    .line 236
    if-eqz v5, :cond_17

    .line 237
    .line 238
    new-instance v6, Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-static {v5, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 245
    .line 246
    .line 247
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-eqz v7, :cond_b

    .line 256
    .line 257
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    check-cast v7, La/jkp;

    .line 262
    .line 263
    iget-wide v11, v7, La/jkp;->a:J

    .line 264
    .line 265
    invoke-static {v11, v12, v6}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 266
    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    if-ge v5, v2, :cond_c

    .line 274
    .line 275
    move v5, v4

    .line 276
    goto :goto_7

    .line 277
    :cond_c
    move v5, v8

    .line 278
    :goto_7
    iget-object v7, v3, La/vsl0;->A:La/f4u;

    .line 279
    .line 280
    iput-object v6, v0, La/see;->m:Ljava/lang/Object;

    .line 281
    .line 282
    iput v2, v0, La/see;->k:I

    .line 283
    .line 284
    iput v5, v0, La/see;->l:I

    .line 285
    .line 286
    iput-byte v9, v0, La/see;->j:B

    .line 287
    .line 288
    iget-object v2, v7, La/f4u;->b:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v2, La/w5z;

    .line 291
    .line 292
    invoke-virtual {v2, v0}, La/w5z;->n(La/zje;)Ljava/io/Serializable;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    if-ne v0, v1, :cond_d

    .line 297
    .line 298
    :goto_8
    move-object v6, v1

    .line 299
    goto/16 :goto_11

    .line 300
    .line 301
    :cond_d
    move v1, v5

    .line 302
    :goto_9
    check-cast v0, Ljava/lang/Iterable;

    .line 303
    .line 304
    new-instance v2, Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-static {v0, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 311
    .line 312
    .line 313
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-eqz v5, :cond_f

    .line 322
    .line 323
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    check-cast v5, La/jkp;

    .line 328
    .line 329
    iget-wide v11, v5, La/jkp;->a:J

    .line 330
    .line 331
    new-instance v7, Ljava/lang/Long;

    .line 332
    .line 333
    invoke-direct {v7, v11, v12}, Ljava/lang/Long;-><init>(J)V

    .line 334
    .line 335
    .line 336
    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v7

    .line 340
    iput-boolean v7, v5, La/jkp;->e:Z

    .line 341
    .line 342
    sget v7, La/vsl0;->F:I

    .line 343
    .line 344
    if-eqz v1, :cond_e

    .line 345
    .line 346
    move v7, v4

    .line 347
    goto :goto_b

    .line 348
    :cond_e
    move v7, v8

    .line 349
    :goto_b
    invoke-static {v5, v7}, La/zdx;->P(La/jkp;Z)La/msl0;

    .line 350
    .line 351
    .line 352
    move-result-object v5

    .line 353
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    goto :goto_a

    .line 357
    :cond_f
    new-instance v0, Ljava/util/ArrayList;

    .line 358
    .line 359
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    :cond_10
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v4

    .line 370
    if-eqz v4, :cond_11

    .line 371
    .line 372
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    move-object v5, v4

    .line 377
    check-cast v5, La/msl0;

    .line 378
    .line 379
    iget-boolean v5, v5, La/msl0;->c:Z

    .line 380
    .line 381
    if-eqz v5, :cond_10

    .line 382
    .line 383
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    goto :goto_c

    .line 387
    :cond_11
    new-instance v1, Ljava/util/ArrayList;

    .line 388
    .line 389
    invoke-static {v0, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    if-eqz v4, :cond_12

    .line 405
    .line 406
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    check-cast v4, La/msl0;

    .line 411
    .line 412
    iget-wide v4, v4, La/msl0;->a:J

    .line 413
    .line 414
    invoke-static {v4, v5, v1}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 415
    .line 416
    .line 417
    goto :goto_d

    .line 418
    :cond_12
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->M0(Ljava/util/Collection;)[J

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    sget v1, La/vsl0;->F:I

    .line 423
    .line 424
    iget-object v1, v3, La/vsl0;->o:La/vzg0;

    .line 425
    .line 426
    const-string v4, "SAVED_STATE_CHECKED_SPORT_IDS_LIST"

    .line 427
    .line 428
    invoke-virtual {v1, v4, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    check-cast v0, La/lsl0;

    .line 436
    .line 437
    iget-object v0, v0, La/lsl0;->l:Ljava/util/List;

    .line 438
    .line 439
    new-instance v1, Ljava/util/ArrayList;

    .line 440
    .line 441
    invoke-static {v0, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 442
    .line 443
    .line 444
    move-result v4

    .line 445
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 446
    .line 447
    .line 448
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    if-eqz v4, :cond_13

    .line 457
    .line 458
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v4

    .line 462
    check-cast v4, La/msl0;

    .line 463
    .line 464
    iget-wide v4, v4, La/msl0;->a:J

    .line 465
    .line 466
    invoke-static {v4, v5, v1}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 467
    .line 468
    .line 469
    goto :goto_e

    .line 470
    :cond_13
    new-instance v0, Ljava/util/ArrayList;

    .line 471
    .line 472
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 476
    .line 477
    .line 478
    move-result-object v4

    .line 479
    :cond_14
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 480
    .line 481
    .line 482
    move-result v5

    .line 483
    if-eqz v5, :cond_15

    .line 484
    .line 485
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    move-object v6, v5

    .line 490
    check-cast v6, La/msl0;

    .line 491
    .line 492
    iget-wide v6, v6, La/msl0;->a:J

    .line 493
    .line 494
    new-instance v8, Ljava/lang/Long;

    .line 495
    .line 496
    invoke-direct {v8, v6, v7}, Ljava/lang/Long;-><init>(J)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v6

    .line 503
    if-eqz v6, :cond_14

    .line 504
    .line 505
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    goto :goto_f

    .line 509
    :cond_15
    iget-object v1, v3, La/i3t0;->i:La/ocj;

    .line 510
    .line 511
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 512
    .line 513
    :goto_10
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    move-object v11, v3

    .line 521
    check-cast v11, La/lsl0;

    .line 522
    .line 523
    const/16 v18, 0x0

    .line 524
    .line 525
    const/16 v21, 0x13ff

    .line 526
    .line 527
    const/4 v12, 0x0

    .line 528
    const/4 v13, 0x0

    .line 529
    const/4 v14, 0x0

    .line 530
    const/4 v15, 0x0

    .line 531
    const/16 v16, 0x0

    .line 532
    .line 533
    const/16 v17, 0x0

    .line 534
    .line 535
    move-object/from16 v20, v0

    .line 536
    .line 537
    move-object/from16 v19, v2

    .line 538
    .line 539
    invoke-static/range {v11 .. v21}, La/lsl0;->a(La/lsl0;Ljava/util/List;Ljava/util/List;ZZZZZLjava/util/List;Ljava/util/List;I)La/lsl0;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    invoke-virtual {v1, v3, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-eqz v0, :cond_16

    .line 548
    .line 549
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 550
    .line 551
    goto :goto_11

    .line 552
    :cond_16
    move-object/from16 v2, v19

    .line 553
    .line 554
    move-object/from16 v0, v20

    .line 555
    .line 556
    goto :goto_10

    .line 557
    :cond_17
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 558
    .line 559
    :goto_11
    return-object v6

    .line 560
    :pswitch_1
    iget v1, v0, La/see;->l:I

    .line 561
    .line 562
    iget v7, v0, La/see;->k:I

    .line 563
    .line 564
    check-cast v3, La/n4u;

    .line 565
    .line 566
    iget-object v3, v3, La/n4u;->b:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v3, La/b6t;

    .line 569
    .line 570
    sget-object v8, La/wne;->a:La/wne;

    .line 571
    .line 572
    iget-byte v9, v0, La/see;->j:B

    .line 573
    .line 574
    if-eqz v9, :cond_1a

    .line 575
    .line 576
    if-eq v9, v4, :cond_19

    .line 577
    .line 578
    if-ne v9, v5, :cond_18

    .line 579
    .line 580
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    move-object/from16 v0, p1

    .line 584
    .line 585
    goto :goto_12

    .line 586
    :cond_18
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    goto :goto_15

    .line 590
    :cond_19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    move-object/from16 v0, p1

    .line 594
    .line 595
    goto :goto_14

    .line 596
    :cond_1a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    iget-object v2, v0, La/see;->m:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v2, La/n0w;

    .line 602
    .line 603
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    if-eqz v2, :cond_1d

    .line 608
    .line 609
    if-ne v2, v4, :cond_1c

    .line 610
    .line 611
    iput-byte v5, v0, La/see;->j:B

    .line 612
    .line 613
    invoke-virtual {v3, v7, v1, v0}, La/b6t;->a(IILa/zje;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    if-ne v0, v8, :cond_1b

    .line 618
    .line 619
    goto :goto_13

    .line 620
    :cond_1b
    :goto_12
    move-object v6, v0

    .line 621
    check-cast v6, La/rzv;

    .line 622
    .line 623
    goto :goto_15

    .line 624
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 625
    .line 626
    .line 627
    goto :goto_15

    .line 628
    :cond_1d
    iput-byte v4, v0, La/see;->j:B

    .line 629
    .line 630
    invoke-virtual {v3, v7, v1, v0}, La/b6t;->c(IILa/zje;)Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    if-ne v0, v8, :cond_1e

    .line 635
    .line 636
    :goto_13
    move-object v6, v8

    .line 637
    goto :goto_15

    .line 638
    :cond_1e
    :goto_14
    move-object v6, v0

    .line 639
    check-cast v6, La/rzv;

    .line 640
    .line 641
    :goto_15
    return-object v6

    .line 642
    :pswitch_2
    check-cast v3, La/xcz;

    .line 643
    .line 644
    iget v1, v0, La/see;->k:I

    .line 645
    .line 646
    iget-object v7, v0, La/see;->m:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v7, La/a4x;

    .line 649
    .line 650
    sget-object v8, La/wne;->a:La/wne;

    .line 651
    .line 652
    iget-byte v9, v0, La/see;->j:B

    .line 653
    .line 654
    if-eqz v9, :cond_21

    .line 655
    .line 656
    if-eq v9, v4, :cond_20

    .line 657
    .line 658
    if-ne v9, v5, :cond_1f

    .line 659
    .line 660
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 661
    .line 662
    .line 663
    goto :goto_18

    .line 664
    :cond_1f
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    goto :goto_19

    .line 668
    :cond_20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 669
    .line 670
    .line 671
    goto :goto_16

    .line 672
    :cond_21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 676
    .line 677
    .line 678
    move-result v2

    .line 679
    if-nez v2, :cond_23

    .line 680
    .line 681
    if-lez v1, :cond_23

    .line 682
    .line 683
    new-instance v2, La/eb;

    .line 684
    .line 685
    const/16 v9, 0x12

    .line 686
    .line 687
    invoke-direct {v2, v3, v9}, La/eb;-><init>(La/xcz;B)V

    .line 688
    .line 689
    .line 690
    invoke-static {v6, v2}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    new-instance v9, La/bh0;

    .line 695
    .line 696
    const/4 v10, 0x7

    .line 697
    invoke-direct {v9, v7, v6, v10}, La/bh0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 698
    .line 699
    .line 700
    iput-byte v4, v0, La/see;->j:B

    .line 701
    .line 702
    invoke-static {v2, v9, v0}, La/ntb;->N(La/gmq;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    if-ne v2, v8, :cond_22

    .line 707
    .line 708
    goto :goto_17

    .line 709
    :cond_22
    :goto_16
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 710
    .line 711
    .line 712
    move-result v2

    .line 713
    if-ge v1, v2, :cond_23

    .line 714
    .line 715
    iget v2, v0, La/see;->l:I

    .line 716
    .line 717
    iput-byte v5, v0, La/see;->j:B

    .line 718
    .line 719
    invoke-virtual {v3, v1, v2, v0}, La/xcz;->l(IILa/yje;)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    if-ne v0, v8, :cond_23

    .line 724
    .line 725
    :goto_17
    move-object v6, v8

    .line 726
    goto :goto_19

    .line 727
    :cond_23
    :goto_18
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 728
    .line 729
    :goto_19
    return-object v6

    .line 730
    nop

    .line 731
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
