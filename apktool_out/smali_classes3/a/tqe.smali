.class public final La/tqe;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/uqe;

.field public final synthetic l:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(La/uqe;Ljava/util/List;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/tqe;->i:B

    iput-object p1, p0, La/tqe;->k:La/uqe;

    iput-object p2, p0, La/tqe;->l:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/tqe;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/tqe;->l:Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, La/tqe;->k:La/uqe;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/tqe;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/tqe;-><init>(La/uqe;Ljava/util/List;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/tqe;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/tqe;-><init>(La/uqe;Ljava/util/List;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/tqe;->i:B

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
    invoke-virtual {p0, p1, p2}, La/tqe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/tqe;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/tqe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/tqe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/tqe;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/tqe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tqe;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0xa

    .line 7
    .line 8
    iget-object v4, v0, La/tqe;->l:Ljava/util/List;

    .line 9
    .line 10
    iget-object v5, v0, La/tqe;->k:La/uqe;

    .line 11
    .line 12
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    sget-object v1, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-boolean v9, v0, La/tqe;->j:Z

    .line 22
    .line 23
    if-eqz v9, :cond_1

    .line 24
    .line 25
    if-ne v9, v7, :cond_0

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v5, v5, La/uqe;->a:La/xqe;

    .line 39
    .line 40
    iput-boolean v7, v0, La/tqe;->j:Z

    .line 41
    .line 42
    invoke-virtual {v5}, La/xqe;->c()La/nqe;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    new-instance v6, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {v4, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, La/cm90;

    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v9, La/dm90;

    .line 75
    .line 76
    iget v10, v4, La/cm90;->a:I

    .line 77
    .line 78
    iget v11, v4, La/cm90;->c:I

    .line 79
    .line 80
    iget v12, v4, La/cm90;->b:I

    .line 81
    .line 82
    iget-object v4, v4, La/cm90;->d:Ljava/lang/String;

    .line 83
    .line 84
    invoke-direct {v9, v10, v11, v12, v4}, La/dm90;-><init>(IIILjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    iget-object v3, v5, La/nqe;->a:La/zdg0;

    .line 92
    .line 93
    new-instance v4, La/mqe;

    .line 94
    .line 95
    const/4 v9, 0x2

    .line 96
    invoke-direct {v4, v5, v6, v8, v9}, La/mqe;-><init>(La/nqe;Ljava/util/ArrayList;La/yje;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v3, v4, v2, v7}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sget-object v2, La/wne;->a:La/wne;

    .line 104
    .line 105
    if-ne v0, v2, :cond_3

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    :goto_1
    if-ne v0, v2, :cond_4

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    :goto_2
    if-ne v0, v1, :cond_5

    .line 116
    .line 117
    move-object v8, v1

    .line 118
    goto :goto_4

    .line 119
    :cond_5
    :goto_3
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    :goto_4
    return-object v8

    .line 122
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 123
    .line 124
    iget-boolean v9, v0, La/tqe;->j:Z

    .line 125
    .line 126
    if-eqz v9, :cond_7

    .line 127
    .line 128
    if-ne v9, v7, :cond_6

    .line 129
    .line 130
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_8

    .line 134
    :cond_6
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_9

    .line 138
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iget-object v5, v5, La/uqe;->a:La/xqe;

    .line 142
    .line 143
    iput-boolean v7, v0, La/tqe;->j:Z

    .line 144
    .line 145
    invoke-virtual {v5}, La/xqe;->c()La/nqe;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    new-instance v6, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-static {v4, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-eqz v4, :cond_8

    .line 167
    .line 168
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    check-cast v4, La/tkt;

    .line 173
    .line 174
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    new-instance v9, La/skt;

    .line 178
    .line 179
    iget v11, v4, La/tkt;->a:I

    .line 180
    .line 181
    iget-object v10, v4, La/tkt;->b:Ljava/lang/String;

    .line 182
    .line 183
    iget v14, v4, La/tkt;->c:I

    .line 184
    .line 185
    iget-object v12, v4, La/tkt;->d:Ljava/lang/String;

    .line 186
    .line 187
    move-object/from16 p1, v3

    .line 188
    .line 189
    iget-wide v2, v4, La/tkt;->e:J

    .line 190
    .line 191
    iget-object v13, v4, La/tkt;->f:Ljava/lang/String;

    .line 192
    .line 193
    move-wide v15, v2

    .line 194
    invoke-direct/range {v9 .. v16}, La/skt;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IJ)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-object/from16 v3, p1

    .line 201
    .line 202
    const/4 v2, 0x0

    .line 203
    goto :goto_5

    .line 204
    :cond_8
    iget-object v2, v5, La/nqe;->a:La/zdg0;

    .line 205
    .line 206
    new-instance v3, La/mqe;

    .line 207
    .line 208
    invoke-direct {v3, v5, v6, v8, v7}, La/mqe;-><init>(La/nqe;Ljava/util/ArrayList;La/yje;B)V

    .line 209
    .line 210
    .line 211
    const/4 v4, 0x0

    .line 212
    invoke-static {v0, v2, v3, v4, v7}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    sget-object v2, La/wne;->a:La/wne;

    .line 217
    .line 218
    if-ne v0, v2, :cond_9

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    :goto_6
    if-ne v0, v2, :cond_a

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    :goto_7
    if-ne v0, v1, :cond_b

    .line 229
    .line 230
    move-object v8, v1

    .line 231
    goto :goto_9

    .line 232
    :cond_b
    :goto_8
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    :goto_9
    return-object v8

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
