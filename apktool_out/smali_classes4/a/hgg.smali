.class public final La/hgg;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Ljava/util/Date;

.field public j:La/zwt;

.field public k:J

.field public l:B

.field public final synthetic m:La/igg;

.field public final synthetic n:I


# direct methods
.method public constructor <init>(La/igg;ILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/hgg;->m:La/igg;

    .line 2
    .line 3
    iput p2, p0, La/hgg;->n:I

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance v0, La/hgg;

    .line 2
    .line 3
    iget-object v1, p0, La/hgg;->m:La/igg;

    .line 4
    .line 5
    iget p0, p0, La/hgg;->n:I

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, La/hgg;-><init>(La/igg;ILa/yje;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/hgg;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/hgg;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/hgg;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v0, v5, La/hgg;->m:La/igg;

    .line 4
    .line 5
    iget-object v7, v0, La/i3t0;->i:La/ocj;

    .line 6
    .line 7
    sget-object v8, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v1, v5, La/hgg;->l:B

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    const/4 v3, 0x2

    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    if-eq v1, v4, :cond_2

    .line 18
    .line 19
    if-eq v1, v3, :cond_1

    .line 20
    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    check-cast v0, La/j0g0;

    .line 29
    .line 30
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v9

    .line 40
    :cond_1
    iget-wide v0, v5, La/hgg;->k:J

    .line 41
    .line 42
    iget-object v3, v5, La/hgg;->j:La/zwt;

    .line 43
    .line 44
    iget-object v4, v5, La/hgg;->i:Ljava/util/Date;

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v6, v4

    .line 50
    move-wide/from16 v17, v0

    .line 51
    .line 52
    move-object/from16 v0, p1

    .line 53
    .line 54
    move-object v1, v3

    .line 55
    move-wide/from16 v3, v17

    .line 56
    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :cond_2
    iget-object v1, v5, La/hgg;->i:Ljava/util/Date;

    .line 60
    .line 61
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object/from16 v4, p1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, La/egg;

    .line 75
    .line 76
    iget-object v1, v1, La/egg;->e:Ljava/util/List;

    .line 77
    .line 78
    iget v6, v5, La/hgg;->n:I

    .line 79
    .line 80
    invoke-static {v6, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/util/Date;

    .line 85
    .line 86
    if-nez v1, :cond_4

    .line 87
    .line 88
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_4
    iget-object v6, v0, La/igg;->x:La/fvt;

    .line 92
    .line 93
    iput-object v1, v5, La/hgg;->i:Ljava/util/Date;

    .line 94
    .line 95
    iput-byte v4, v5, La/hgg;->l:B

    .line 96
    .line 97
    iget-object v4, v6, La/fvt;->a:La/udg;

    .line 98
    .line 99
    iget-object v4, v4, La/udg;->b:La/tcg;

    .line 100
    .line 101
    iget-object v4, v4, La/tcg;->e:Ljava/util/LinkedHashMap;

    .line 102
    .line 103
    invoke-virtual {v4, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, La/vdg;

    .line 108
    .line 109
    if-eqz v4, :cond_5

    .line 110
    .line 111
    iget-object v4, v4, La/vdg;->b:Ljava/util/ArrayList;

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_5
    sget-object v4, La/iun;->a:La/iun;

    .line 115
    .line 116
    :goto_0
    if-ne v4, v8, :cond_6

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    :goto_1
    check-cast v4, Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_8

    .line 126
    .line 127
    sget v4, La/igg;->I:I

    .line 128
    .line 129
    iget-object v4, v7, La/ocj;->a:La/p7m0;

    .line 130
    .line 131
    :cond_7
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-object v10, v6

    .line 139
    check-cast v10, La/egg;

    .line 140
    .line 141
    const/4 v15, 0x1

    .line 142
    const/16 v16, 0xdf

    .line 143
    .line 144
    const/4 v11, 0x0

    .line 145
    const/4 v12, 0x0

    .line 146
    const/4 v13, 0x0

    .line 147
    const/4 v14, 0x0

    .line 148
    invoke-static/range {v10 .. v16}, La/egg;->a(La/egg;ZLjava/lang/Integer;La/vdg;Ljava/util/List;ZI)La/egg;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    invoke-virtual {v4, v6, v10}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-eqz v6, :cond_7

    .line 157
    .line 158
    :cond_8
    iget-object v4, v0, La/igg;->v:La/zwt;

    .line 159
    .line 160
    iget-object v6, v0, La/igg;->o:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 161
    .line 162
    iget-wide v10, v6, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->a:J

    .line 163
    .line 164
    iget-object v0, v0, La/igg;->y:La/pmi;

    .line 165
    .line 166
    iput-object v1, v5, La/hgg;->i:Ljava/util/Date;

    .line 167
    .line 168
    iput-object v4, v5, La/hgg;->j:La/zwt;

    .line 169
    .line 170
    iput-wide v10, v5, La/hgg;->k:J

    .line 171
    .line 172
    iput-byte v3, v5, La/hgg;->l:B

    .line 173
    .line 174
    invoke-virtual {v0, v5}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-ne v0, v8, :cond_9

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_9
    move-object v6, v1

    .line 182
    move-object v1, v4

    .line 183
    move-wide v3, v10

    .line 184
    :goto_2
    check-cast v0, Ljava/lang/Number;

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    iput-object v9, v5, La/hgg;->i:Ljava/util/Date;

    .line 191
    .line 192
    iput-object v9, v5, La/hgg;->j:La/zwt;

    .line 193
    .line 194
    iput-byte v2, v5, La/hgg;->l:B

    .line 195
    .line 196
    const/16 v2, 0x5a

    .line 197
    .line 198
    move-object/from16 v17, v1

    .line 199
    .line 200
    move v1, v0

    .line 201
    move-object/from16 v0, v17

    .line 202
    .line 203
    invoke-virtual/range {v0 .. v6}, La/zwt;->a(IIJLa/zje;Ljava/util/Date;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    if-ne v0, v8, :cond_a

    .line 208
    .line 209
    :goto_3
    return-object v8

    .line 210
    :cond_a
    :goto_4
    sget v1, La/igg;->I:I

    .line 211
    .line 212
    iget-object v1, v7, La/ocj;->a:La/p7m0;

    .line 213
    .line 214
    :cond_b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    move-object v10, v2

    .line 222
    check-cast v10, La/egg;

    .line 223
    .line 224
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 225
    .line 226
    instance-of v3, v0, La/g0g0;

    .line 227
    .line 228
    if-eqz v3, :cond_c

    .line 229
    .line 230
    move-object v3, v9

    .line 231
    goto :goto_5

    .line 232
    :cond_c
    move-object v3, v0

    .line 233
    :goto_5
    move-object v13, v3

    .line 234
    check-cast v13, La/vdg;

    .line 235
    .line 236
    const/4 v15, 0x0

    .line 237
    const/16 v16, 0xd7

    .line 238
    .line 239
    const/4 v11, 0x0

    .line 240
    const/4 v12, 0x0

    .line 241
    const/4 v14, 0x0

    .line 242
    invoke-static/range {v10 .. v16}, La/egg;->a(La/egg;ZLjava/lang/Integer;La/vdg;Ljava/util/List;ZI)La/egg;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-eqz v2, :cond_b

    .line 251
    .line 252
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    return-object v0
.end method
