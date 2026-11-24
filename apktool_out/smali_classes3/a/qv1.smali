.class public final La/qv1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/uv1;


# direct methods
.method public synthetic constructor <init>(La/uv1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qv1;->i:B

    iput-object p1, p0, La/qv1;->k:La/uv1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/qv1;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/qv1;->k:La/uv1;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/qv1;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/qv1;-><init>(La/uv1;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/qv1;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/qv1;-><init>(La/uv1;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/qv1;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/qv1;-><init>(La/uv1;La/yje;B)V

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
    iget-byte v0, p0, La/qv1;->i:B

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
    invoke-virtual {p0, p1, p2}, La/qv1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qv1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qv1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/qv1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/qv1;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/qv1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/qv1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/qv1;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/qv1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qv1;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, v0, La/qv1;->k:La/uv1;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/qv1;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v3, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, v4, La/uv1;->o:La/wdu;

    .line 36
    .line 37
    iget-wide v5, v4, La/uv1;->B:J

    .line 38
    .line 39
    invoke-virtual {v2, v3, v5, v6}, La/wdu;->q(ZJ)La/utb;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iput-boolean v3, v0, La/qv1;->j:Z

    .line 44
    .line 45
    invoke-static {v2, v0}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-ne v0, v1, :cond_2

    .line 50
    .line 51
    move-object v5, v1

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :goto_0
    check-cast v0, La/gu1;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    iget-object v0, v0, La/gu1;->r:Ljava/util/List;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, La/mlr;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    sget-object v1, La/bv1;->e:La/bv1;

    .line 70
    .line 71
    sget v2, La/uv1;->X:I

    .line 72
    .line 73
    invoke-virtual {v4, v0, v1}, La/uv1;->O(La/mlr;La/bv1;)V

    .line 74
    .line 75
    .line 76
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    :goto_1
    return-object v5

    .line 82
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 83
    .line 84
    iget-boolean v6, v0, La/qv1;->j:Z

    .line 85
    .line 86
    if-eqz v6, :cond_5

    .line 87
    .line 88
    if-ne v6, v3, :cond_4

    .line 89
    .line 90
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v2, v4, La/uv1;->M:La/r2v;

    .line 102
    .line 103
    iget-wide v5, v4, La/uv1;->B:J

    .line 104
    .line 105
    invoke-virtual {v2, v5, v6}, La/r2v;->a(J)La/o7s0;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    new-instance v5, La/mn1;

    .line 110
    .line 111
    const/4 v6, 0x2

    .line 112
    invoke-direct {v5, v4, v6}, La/mn1;-><init>(Ljava/lang/Object;B)V

    .line 113
    .line 114
    .line 115
    iput-boolean v3, v0, La/qv1;->j:Z

    .line 116
    .line 117
    invoke-virtual {v2, v5, v0}, La/o7s0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-ne v0, v1, :cond_6

    .line 122
    .line 123
    move-object v5, v1

    .line 124
    goto :goto_3

    .line 125
    :cond_6
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    :goto_3
    return-object v5

    .line 128
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 129
    .line 130
    iget-boolean v6, v0, La/qv1;->j:Z

    .line 131
    .line 132
    if-eqz v6, :cond_8

    .line 133
    .line 134
    if-ne v6, v3, :cond_7

    .line 135
    .line 136
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    move-object/from16 v0, p1

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_8
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    check-cast v2, La/yu1;

    .line 154
    .line 155
    iget-object v2, v2, La/yu1;->p:La/gu1;

    .line 156
    .line 157
    if-eqz v2, :cond_a

    .line 158
    .line 159
    iget-object v6, v2, La/gu1;->b:La/z1s0;

    .line 160
    .line 161
    sget-object v7, La/z1s0;->a:La/z1s0;

    .line 162
    .line 163
    if-eq v6, v7, :cond_9

    .line 164
    .line 165
    iget-boolean v6, v2, La/gu1;->d:Z

    .line 166
    .line 167
    if-eqz v6, :cond_9

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_9
    move-object v2, v5

    .line 171
    :goto_4
    if-eqz v2, :cond_a

    .line 172
    .line 173
    new-instance v5, Ljava/lang/Long;

    .line 174
    .line 175
    const-wide/16 v6, 0x0

    .line 176
    .line 177
    invoke-direct {v5, v6, v7}, Ljava/lang/Long;-><init>(J)V

    .line 178
    .line 179
    .line 180
    :cond_a
    iget-object v2, v4, La/uv1;->q:La/zpu;

    .line 181
    .line 182
    iget-wide v6, v4, La/uv1;->B:J

    .line 183
    .line 184
    iput-boolean v3, v0, La/qv1;->j:Z

    .line 185
    .line 186
    invoke-virtual {v2, v6, v7, v0, v5}, La/zpu;->i(JLa/zje;Ljava/lang/Long;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-ne v0, v1, :cond_b

    .line 191
    .line 192
    move-object v5, v1

    .line 193
    goto :goto_6

    .line 194
    :cond_b
    :goto_5
    move-object/from16 v19, v0

    .line 195
    .line 196
    check-cast v19, Ljava/util/List;

    .line 197
    .line 198
    sget v0, La/uv1;->X:I

    .line 199
    .line 200
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 201
    .line 202
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 203
    .line 204
    :cond_c
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-object v5, v1

    .line 212
    check-cast v5, La/yu1;

    .line 213
    .line 214
    const/16 v22, 0x0

    .line 215
    .line 216
    const v23, 0x1dffbff

    .line 217
    .line 218
    .line 219
    const/4 v6, 0x0

    .line 220
    const/4 v7, 0x0

    .line 221
    const/4 v8, 0x0

    .line 222
    const/4 v9, 0x0

    .line 223
    const/4 v10, 0x0

    .line 224
    const/4 v11, 0x0

    .line 225
    sget-object v12, La/at1;->a:La/at1;

    .line 226
    .line 227
    const/4 v13, 0x0

    .line 228
    const/4 v14, 0x0

    .line 229
    const/4 v15, 0x0

    .line 230
    const/16 v16, 0x0

    .line 231
    .line 232
    const/16 v17, 0x0

    .line 233
    .line 234
    const/16 v18, 0x0

    .line 235
    .line 236
    const/16 v20, 0x0

    .line 237
    .line 238
    const/16 v21, 0x0

    .line 239
    .line 240
    invoke-static/range {v5 .. v23}, La/yu1;->a(La/yu1;La/bv1;ZLa/ql5;La/dt1;La/dt1;La/dt1;La/dt1;La/gu1;Ljava/util/LinkedHashMap;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Set;Ljava/util/LinkedHashSet;I)La/yu1;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-eqz v1, :cond_c

    .line 249
    .line 250
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    :goto_6
    return-object v5

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
