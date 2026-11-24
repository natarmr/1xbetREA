.class public final La/h9c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/chf0;


# direct methods
.method public synthetic constructor <init>(La/chf0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/h9c;->a:La/chf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La/eu4;
    .locals 2

    .line 1
    iget-object p0, p0, La/h9c;->a:La/chf0;

    .line 2
    .line 3
    sget-object v0, La/owe;->a:La/owe;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, La/chf0;->u(La/owe;)La/zj2;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, La/eu4;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, p0, v1}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public b(IILa/zje;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, La/hht0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/hht0;

    .line 11
    .line 12
    iget v3, v2, La/hht0;->o:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/hht0;->o:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/hht0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/hht0;-><init>(La/h9c;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/hht0;->m:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/hht0;->o:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    iget-object v0, v0, La/h9c;->a:La/chf0;

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    if-eq v4, v7, :cond_3

    .line 44
    .line 45
    if-eq v4, v6, :cond_2

    .line 46
    .line 47
    if-ne v4, v5, :cond_1

    .line 48
    .line 49
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v8

    .line 60
    :cond_2
    iget-wide v6, v2, La/hht0;->l:J

    .line 61
    .line 62
    iget v4, v2, La/hht0;->j:I

    .line 63
    .line 64
    iget v9, v2, La/hht0;->i:I

    .line 65
    .line 66
    iget-object v10, v2, La/hht0;->k:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_3
    iget v4, v2, La/hht0;->j:I

    .line 74
    .line 75
    iget v7, v2, La/hht0;->i:I

    .line 76
    .line 77
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move/from16 v34, v7

    .line 81
    .line 82
    move-object v7, v1

    .line 83
    move/from16 v1, v34

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move/from16 v1, p1

    .line 90
    .line 91
    iput v1, v2, La/hht0;->i:I

    .line 92
    .line 93
    move/from16 v4, p2

    .line 94
    .line 95
    iput v4, v2, La/hht0;->j:I

    .line 96
    .line 97
    iput v7, v2, La/hht0;->o:I

    .line 98
    .line 99
    invoke-virtual {v0, v2}, La/chf0;->p(La/yje;)Ljava/io/Serializable;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    if-ne v7, v3, :cond_5

    .line 104
    .line 105
    goto/16 :goto_4

    .line 106
    .line 107
    :cond_5
    :goto_1
    check-cast v7, Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-le v9, v10, :cond_9

    .line 118
    .line 119
    invoke-interface {v7, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    check-cast v9, La/qu6;

    .line 124
    .line 125
    new-instance v10, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    check-cast v11, La/qu6;

    .line 135
    .line 136
    iget-wide v11, v11, La/qu6;->a:J

    .line 137
    .line 138
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v10, v4, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    new-instance v7, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    move-wide v14, v11

    .line 157
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    if-eqz v10, :cond_6

    .line 162
    .line 163
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    move-object v13, v10

    .line 168
    check-cast v13, La/qu6;

    .line 169
    .line 170
    const/16 v32, 0x0

    .line 171
    .line 172
    const/16 v33, -0x2

    .line 173
    .line 174
    const-wide/16 v16, 0x0

    .line 175
    .line 176
    const-wide/16 v18, 0x0

    .line 177
    .line 178
    const/16 v20, 0x0

    .line 179
    .line 180
    const/16 v21, 0x0

    .line 181
    .line 182
    const/16 v22, 0x0

    .line 183
    .line 184
    const/16 v23, 0x0

    .line 185
    .line 186
    const/16 v24, 0x0

    .line 187
    .line 188
    const-wide/16 v25, 0x0

    .line 189
    .line 190
    const/16 v27, 0x0

    .line 191
    .line 192
    const-wide/16 v28, 0x0

    .line 193
    .line 194
    const/16 v30, 0x0

    .line 195
    .line 196
    const/16 v31, 0x0

    .line 197
    .line 198
    invoke-static/range {v13 .. v33}, La/qu6;->a(La/qu6;JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLa/uoy;JLa/zfa0;ILa/ic9;I)La/qu6;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    const-wide/16 v16, 0x1

    .line 206
    .line 207
    add-long v14, v14, v16

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_6
    iput-object v7, v2, La/hht0;->k:Ljava/util/ArrayList;

    .line 211
    .line 212
    iput v1, v2, La/hht0;->i:I

    .line 213
    .line 214
    iput v4, v2, La/hht0;->j:I

    .line 215
    .line 216
    iput-wide v11, v2, La/hht0;->l:J

    .line 217
    .line 218
    iput v6, v2, La/hht0;->o:I

    .line 219
    .line 220
    invoke-virtual {v0, v2}, La/chf0;->s(La/zje;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    if-ne v6, v3, :cond_7

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_7
    move v9, v1

    .line 228
    move-object v10, v7

    .line 229
    move-wide v6, v11

    .line 230
    :goto_3
    iput-object v8, v2, La/hht0;->k:Ljava/util/ArrayList;

    .line 231
    .line 232
    iput v9, v2, La/hht0;->i:I

    .line 233
    .line 234
    iput v4, v2, La/hht0;->j:I

    .line 235
    .line 236
    iput-wide v6, v2, La/hht0;->l:J

    .line 237
    .line 238
    iput v5, v2, La/hht0;->o:I

    .line 239
    .line 240
    invoke-virtual {v0, v10, v2}, La/chf0;->L(Ljava/util/List;La/zje;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    if-ne v0, v3, :cond_8

    .line 245
    .line 246
    :goto_4
    return-object v3

    .line 247
    :cond_8
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    return-object v0

    .line 250
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object v0
.end method
