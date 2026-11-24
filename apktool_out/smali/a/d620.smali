.class public final La/d620;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/svu;

.field public j:Ljava/lang/String;

.field public k:I

.field public l:I

.field public m:Z

.field public n:B

.field public final synthetic o:La/h620;

.field public final synthetic p:La/oa20;

.field public final synthetic q:La/q4f;

.field public final synthetic r:La/kuw;

.field public final synthetic s:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(La/h620;La/oa20;La/q4f;La/kuw;Ljava/util/ArrayList;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/d620;->o:La/h620;

    .line 2
    .line 3
    iput-object p2, p0, La/d620;->p:La/oa20;

    .line 4
    .line 5
    iput-object p3, p0, La/d620;->q:La/q4f;

    .line 6
    .line 7
    iput-object p4, p0, La/d620;->r:La/kuw;

    .line 8
    .line 9
    iput-object p5, p0, La/d620;->s:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/d620;

    .line 2
    .line 3
    iget-object v4, p0, La/d620;->r:La/kuw;

    .line 4
    .line 5
    iget-object v5, p0, La/d620;->s:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v1, p0, La/d620;->o:La/h620;

    .line 8
    .line 9
    iget-object v2, p0, La/d620;->p:La/oa20;

    .line 10
    .line 11
    iget-object v3, p0, La/d620;->q:La/q4f;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/d620;-><init>(La/h620;La/oa20;La/q4f;La/kuw;Ljava/util/ArrayList;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/d620;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/d620;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/d620;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    sget-object v12, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v11, La/d620;->n:B

    .line 6
    .line 7
    iget-object v13, v11, La/d620;->p:La/oa20;

    .line 8
    .line 9
    const/4 v14, 0x3

    .line 10
    const/4 v15, 0x2

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    iget-object v3, v11, La/d620;->o:La/h620;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    if-eq v0, v2, :cond_2

    .line 18
    .line 19
    if-eq v0, v15, :cond_1

    .line 20
    .line 21
    if-ne v0, v14, :cond_0

    .line 22
    .line 23
    iget-boolean v0, v11, La/d620;->m:Z

    .line 24
    .line 25
    iget v3, v11, La/d620;->l:I

    .line 26
    .line 27
    iget v4, v11, La/d620;->k:I

    .line 28
    .line 29
    iget-object v5, v11, La/d620;->j:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v6, v11, La/d620;->i:La/svu;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move v11, v0

    .line 37
    move v14, v1

    .line 38
    move v1, v4

    .line 39
    move-object v7, v6

    .line 40
    move-object/from16 v4, p1

    .line 41
    .line 42
    move v6, v2

    .line 43
    :goto_0
    move-object v8, v5

    .line 44
    goto/16 :goto_5

    .line 45
    .line 46
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    return-object v0

    .line 53
    :cond_1
    iget v0, v11, La/d620;->l:I

    .line 54
    .line 55
    iget v4, v11, La/d620;->k:I

    .line 56
    .line 57
    iget-object v5, v11, La/d620;->j:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v6, v11, La/d620;->i:La/svu;

    .line 60
    .line 61
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move v14, v1

    .line 65
    move-object v15, v3

    .line 66
    move v1, v4

    .line 67
    move-object v3, v6

    .line 68
    move v6, v2

    .line 69
    move-object/from16 v2, p1

    .line 70
    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move v14, v1

    .line 77
    move-object v15, v3

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, v3, La/h620;->v:La/w5z;

    .line 83
    .line 84
    const-class v4, La/rye;

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    if-nez v13, :cond_4

    .line 91
    .line 92
    sget-object v4, La/iun;->a:La/iun;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    iget-object v4, v13, La/oa20;->a:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    :goto_1
    sget-object v5, La/g920;->d:La/g920;

    .line 102
    .line 103
    iget-object v6, v3, La/h620;->o0:La/p7m0;

    .line 104
    .line 105
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    check-cast v6, Ljava/lang/Number;

    .line 110
    .line 111
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v8

    .line 115
    iget-object v6, v3, La/h620;->P:La/x1u;

    .line 116
    .line 117
    invoke-virtual {v6}, La/x1u;->a()J

    .line 118
    .line 119
    .line 120
    move-result-wide v16

    .line 121
    iput-byte v2, v11, La/d620;->n:B

    .line 122
    .line 123
    move v6, v2

    .line 124
    iget-object v2, v11, La/d620;->q:La/q4f;

    .line 125
    .line 126
    move v10, v1

    .line 127
    move-object v1, v4

    .line 128
    iget-object v4, v11, La/d620;->r:La/kuw;

    .line 129
    .line 130
    move-object/from16 v18, v3

    .line 131
    .line 132
    move-object v3, v5

    .line 133
    move-wide/from16 v19, v8

    .line 134
    .line 135
    move v9, v6

    .line 136
    move-wide/from16 v5, v19

    .line 137
    .line 138
    iget-object v8, v11, La/d620;->s:Ljava/util/ArrayList;

    .line 139
    .line 140
    move v14, v10

    .line 141
    move-wide/from16 v9, v16

    .line 142
    .line 143
    move-object/from16 v15, v18

    .line 144
    .line 145
    invoke-virtual/range {v0 .. v11}, La/w5z;->V(Ljava/util/List;La/q4f;La/g920;La/kuw;JLjava/lang/String;Ljava/util/List;JLa/zje;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-ne v0, v12, :cond_5

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_5
    :goto_2
    if-eqz v13, :cond_a

    .line 153
    .line 154
    iget-object v0, v15, La/h620;->K:La/svu;

    .line 155
    .line 156
    iget-object v1, v15, La/h620;->n:La/j9c;

    .line 157
    .line 158
    invoke-virtual {v1}, La/j9c;->a()La/q4f;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    iput-object v0, v11, La/d620;->i:La/svu;

    .line 167
    .line 168
    iput-object v1, v11, La/d620;->j:Ljava/lang/String;

    .line 169
    .line 170
    iput v14, v11, La/d620;->k:I

    .line 171
    .line 172
    const/4 v6, 0x1

    .line 173
    iput v6, v11, La/d620;->l:I

    .line 174
    .line 175
    const/4 v2, 0x2

    .line 176
    iput-byte v2, v11, La/d620;->n:B

    .line 177
    .line 178
    invoke-virtual {v15, v11}, La/h620;->z(La/zje;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    if-ne v2, v12, :cond_6

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_6
    move-object v3, v0

    .line 186
    move-object v5, v1

    .line 187
    move v0, v6

    .line 188
    move v1, v14

    .line 189
    :goto_3
    check-cast v2, La/ql5;

    .line 190
    .line 191
    iget-object v2, v2, La/ql5;->i:La/txs0;

    .line 192
    .line 193
    invoke-virtual {v2}, La/txs0;->a()Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    iget-object v4, v15, La/h620;->w:La/u4a;

    .line 198
    .line 199
    iput-object v3, v11, La/d620;->i:La/svu;

    .line 200
    .line 201
    iput-object v5, v11, La/d620;->j:Ljava/lang/String;

    .line 202
    .line 203
    iput v1, v11, La/d620;->k:I

    .line 204
    .line 205
    iput v0, v11, La/d620;->l:I

    .line 206
    .line 207
    iput-boolean v2, v11, La/d620;->m:Z

    .line 208
    .line 209
    const/4 v7, 0x3

    .line 210
    iput-byte v7, v11, La/d620;->n:B

    .line 211
    .line 212
    invoke-virtual {v4, v11}, La/u4a;->a(La/yje;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    if-ne v4, v12, :cond_7

    .line 217
    .line 218
    :goto_4
    return-object v12

    .line 219
    :cond_7
    move v11, v2

    .line 220
    move-object v7, v3

    .line 221
    move v3, v0

    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :goto_5
    if-eqz v1, :cond_8

    .line 225
    .line 226
    move v9, v6

    .line 227
    goto :goto_6

    .line 228
    :cond_8
    move v9, v14

    .line 229
    :goto_6
    if-eqz v3, :cond_9

    .line 230
    .line 231
    move v10, v6

    .line 232
    goto :goto_7

    .line 233
    :cond_9
    move v10, v14

    .line 234
    :goto_7
    check-cast v4, Ljava/lang/Boolean;

    .line 235
    .line 236
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 237
    .line 238
    .line 239
    move-result v12

    .line 240
    invoke-virtual/range {v7 .. v12}, La/svu;->k(Ljava/lang/String;ZZZZ)V

    .line 241
    .line 242
    .line 243
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 244
    .line 245
    return-object v0
.end method
