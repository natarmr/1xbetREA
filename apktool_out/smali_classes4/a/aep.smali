.class public final La/aep;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/bep;

.field public final synthetic l:La/mlr;


# direct methods
.method public synthetic constructor <init>(La/bep;La/mlr;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/aep;->i:B

    iput-object p1, p0, La/aep;->k:La/bep;

    iput-object p2, p0, La/aep;->l:La/mlr;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/aep;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/aep;->l:La/mlr;

    .line 4
    .line 5
    iget-object p0, p0, La/aep;->k:La/bep;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/aep;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/aep;-><init>(La/bep;La/mlr;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/aep;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/aep;-><init>(La/bep;La/mlr;La/yje;B)V

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
    iget-byte v0, p0, La/aep;->i:B

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
    invoke-virtual {p0, p1, p2}, La/aep;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/aep;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/aep;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/aep;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/aep;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/aep;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/aep;->i:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v6, v5, La/aep;->k:La/bep;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v7, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v0, v5, La/aep;->j:Z

    .line 17
    .line 18
    move-object v4, v1

    .line 19
    iget-object v1, v5, La/aep;->l:La/mlr;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    if-ne v0, v3, :cond_0

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    move-object v1, v4

    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v6, La/bep;->D:La/m1e;

    .line 39
    .line 40
    invoke-interface {v0}, La/m1e;->c()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    iget-object v0, v6, La/bep;->p:La/xr;

    .line 50
    .line 51
    invoke-virtual {v6, v1}, La/bep;->M(La/mlr;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    iput-boolean v3, v5, La/aep;->j:Z

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    const/16 v3, 0x2009

    .line 59
    .line 60
    invoke-virtual/range {v0 .. v5}, La/xr;->m(La/mlr;ZILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-ne v0, v7, :cond_3

    .line 65
    .line 66
    move-object v1, v7

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    :goto_0
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, La/e2p;

    .line 73
    .line 74
    iget-object v0, v0, La/e2p;->j:Ljava/util/List;

    .line 75
    .line 76
    new-instance v15, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    move-object v3, v2

    .line 96
    check-cast v3, La/mlr;

    .line 97
    .line 98
    iget-wide v4, v1, La/mlr;->a:J

    .line 99
    .line 100
    iget-wide v7, v3, La/mlr;->a:J

    .line 101
    .line 102
    cmp-long v3, v4, v7

    .line 103
    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 111
    .line 112
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 113
    .line 114
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-object v7, v1

    .line 122
    check-cast v7, La/e2p;

    .line 123
    .line 124
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    const/16 v17, 0x0

    .line 129
    .line 130
    const v18, 0xfbef

    .line 131
    .line 132
    .line 133
    const/4 v8, 0x0

    .line 134
    const/4 v10, 0x0

    .line 135
    const/4 v11, 0x0

    .line 136
    const/4 v12, 0x0

    .line 137
    const/4 v13, 0x0

    .line 138
    const/4 v14, 0x0

    .line 139
    const/16 v16, 0x0

    .line 140
    .line 141
    invoke-static/range {v7 .. v18}, La/e2p;->a(La/e2p;ZZZZZZLjava/util/List;Ljava/util/List;La/ot0;ZI)La/e2p;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_6

    .line 150
    .line 151
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    :goto_2
    return-object v1

    .line 154
    :pswitch_0
    move-object v4, v1

    .line 155
    sget-object v7, La/wne;->a:La/wne;

    .line 156
    .line 157
    iget-boolean v0, v5, La/aep;->j:Z

    .line 158
    .line 159
    iget-object v1, v5, La/aep;->l:La/mlr;

    .line 160
    .line 161
    if-eqz v0, :cond_8

    .line 162
    .line 163
    if-ne v0, v3, :cond_7

    .line 164
    .line 165
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    move-object v1, v4

    .line 173
    goto :goto_4

    .line 174
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    iget-object v0, v6, La/bep;->D:La/m1e;

    .line 178
    .line 179
    invoke-interface {v0}, La/m1e;->c()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-nez v0, :cond_9

    .line 184
    .line 185
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_9
    iget-object v0, v6, La/bep;->p:La/xr;

    .line 189
    .line 190
    invoke-virtual {v6, v1}, La/bep;->M(La/mlr;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    iput-boolean v3, v5, La/aep;->j:Z

    .line 195
    .line 196
    const/4 v2, 0x1

    .line 197
    const/16 v3, 0x2009

    .line 198
    .line 199
    invoke-virtual/range {v0 .. v5}, La/xr;->m(La/mlr;ZILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    if-ne v0, v7, :cond_a

    .line 204
    .line 205
    move-object v1, v7

    .line 206
    goto :goto_4

    .line 207
    :cond_a
    :goto_3
    sget v0, La/bep;->I:I

    .line 208
    .line 209
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 210
    .line 211
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 212
    .line 213
    :cond_b
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-object v3, v2

    .line 221
    check-cast v3, La/e2p;

    .line 222
    .line 223
    iget-object v4, v3, La/e2p;->j:Ljava/util/List;

    .line 224
    .line 225
    invoke-static {v4, v1}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    const/4 v13, 0x0

    .line 238
    const v14, 0xfbff

    .line 239
    .line 240
    .line 241
    const/4 v4, 0x0

    .line 242
    const/4 v5, 0x0

    .line 243
    const/4 v6, 0x0

    .line 244
    const/4 v7, 0x0

    .line 245
    const/4 v8, 0x0

    .line 246
    const/4 v9, 0x0

    .line 247
    const/4 v10, 0x0

    .line 248
    const/4 v12, 0x0

    .line 249
    invoke-static/range {v3 .. v14}, La/e2p;->a(La/e2p;ZZZZZZLjava/util/List;Ljava/util/List;La/ot0;ZI)La/e2p;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-eqz v2, :cond_b

    .line 258
    .line 259
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    :goto_4
    return-object v1

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
