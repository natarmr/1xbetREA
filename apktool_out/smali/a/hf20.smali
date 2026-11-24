.class public final La/hf20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/q4f;

.field public j:La/ql5;

.field public k:D

.field public l:B

.field public final synthetic m:La/qg20;

.field public final synthetic n:La/ytb0;


# direct methods
.method public constructor <init>(La/qg20;La/ytb0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/hf20;->m:La/qg20;

    .line 2
    .line 3
    iput-object p2, p0, La/hf20;->n:La/ytb0;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance p1, La/hf20;

    .line 2
    .line 3
    iget-object v0, p0, La/hf20;->m:La/qg20;

    .line 4
    .line 5
    iget-object p0, p0, La/hf20;->n:La/ytb0;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, La/hf20;-><init>(La/qg20;La/ytb0;La/yje;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
    invoke-virtual {p0, p1, p2}, La/hf20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/hf20;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/hf20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sget-object v7, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-byte v0, v5, La/hf20;->l:B

    .line 6
    .line 7
    const/4 v6, 0x4

    .line 8
    const/4 v1, 0x3

    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v8, 0x0

    .line 12
    iget-object v4, v5, La/hf20;->m:La/qg20;

    .line 13
    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    if-eq v0, v3, :cond_3

    .line 17
    .line 18
    if-eq v0, v2, :cond_2

    .line 19
    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    if-ne v0, v6, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_7

    .line 28
    .line 29
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v8

    .line 35
    :cond_1
    iget-wide v0, v5, La/hf20;->k:D

    .line 36
    .line 37
    iget-object v2, v5, La/hf20;->j:La/ql5;

    .line 38
    .line 39
    iget-object v3, v5, La/hf20;->i:La/q4f;

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object v11, v2

    .line 45
    move-object v14, v4

    .line 46
    move-object/from16 v4, p1

    .line 47
    .line 48
    move-wide v15, v0

    .line 49
    move-object v1, v3

    .line 50
    move-wide v2, v15

    .line 51
    move-object v0, v14

    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_2
    iget-wide v2, v5, La/hf20;->k:D

    .line 55
    .line 56
    iget-object v0, v5, La/hf20;->j:La/ql5;

    .line 57
    .line 58
    iget-object v9, v5, La/hf20;->i:La/q4f;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v11, v0

    .line 64
    move-object v0, v9

    .line 65
    move-wide v9, v2

    .line 66
    move-object/from16 v2, p1

    .line 67
    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :cond_3
    iget-wide v9, v5, La/hf20;->k:D

    .line 71
    .line 72
    iget-object v0, v5, La/hf20;->i:La/q4f;

    .line 73
    .line 74
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object/from16 v3, p1

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, v4, La/qg20;->X0:La/p7m0;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    sget-object v9, La/ar00;->a:La/ar00;

    .line 89
    .line 90
    invoke-virtual {v0, v8, v9}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    iget-object v0, v5, La/hf20;->n:La/ytb0;

    .line 94
    .line 95
    iget-boolean v0, v0, La/ytb0;->c:Z

    .line 96
    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    sget-object v0, La/q4f;->e:La/q4f;

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_5
    iget-object v0, v4, La/qg20;->i:La/j9c;

    .line 103
    .line 104
    invoke-virtual {v0}, La/j9c;->a()La/q4f;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :goto_0
    iget-object v9, v4, La/qg20;->L:La/hst;

    .line 109
    .line 110
    iget-object v9, v9, La/hst;->a:La/oif0;

    .line 111
    .line 112
    invoke-virtual {v9}, La/oif0;->n()Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    sget-object v10, La/q4f;->h:La/q4f;

    .line 117
    .line 118
    if-ne v0, v10, :cond_6

    .line 119
    .line 120
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    if-nez v10, :cond_6

    .line 125
    .line 126
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    check-cast v9, La/hf6;

    .line 131
    .line 132
    iget-wide v9, v9, La/hf6;->d:D

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_6
    iget-object v9, v4, La/qg20;->d1:La/p7m0;

    .line 136
    .line 137
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    check-cast v9, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

    .line 142
    .line 143
    iget-wide v10, v9, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->a:D

    .line 144
    .line 145
    iget-boolean v9, v9, Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;->r:Z

    .line 146
    .line 147
    if-eqz v9, :cond_7

    .line 148
    .line 149
    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_7
    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    .line 153
    .line 154
    :goto_1
    mul-double v9, v12, v10

    .line 155
    .line 156
    :goto_2
    iput-object v0, v5, La/hf20;->i:La/q4f;

    .line 157
    .line 158
    iput-wide v9, v5, La/hf20;->k:D

    .line 159
    .line 160
    iput-byte v3, v5, La/hf20;->l:B

    .line 161
    .line 162
    invoke-virtual {v4, v5}, La/qg20;->G(La/zje;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    if-ne v3, v7, :cond_8

    .line 167
    .line 168
    goto/16 :goto_6

    .line 169
    .line 170
    :cond_8
    :goto_3
    check-cast v3, La/ql5;

    .line 171
    .line 172
    iput-object v0, v5, La/hf20;->i:La/q4f;

    .line 173
    .line 174
    iput-object v3, v5, La/hf20;->j:La/ql5;

    .line 175
    .line 176
    iput-wide v9, v5, La/hf20;->k:D

    .line 177
    .line 178
    iput-byte v2, v5, La/hf20;->l:B

    .line 179
    .line 180
    iget-object v2, v4, La/qg20;->x:La/m1e;

    .line 181
    .line 182
    invoke-interface {v2}, La/m1e;->b()La/gmq;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-static {v2, v5}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    if-ne v2, v7, :cond_9

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_9
    move-object v11, v3

    .line 194
    :goto_4
    check-cast v2, Ljava/lang/Boolean;

    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-nez v2, :cond_a

    .line 201
    .line 202
    invoke-virtual {v4}, La/qg20;->h0()V

    .line 203
    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_a
    sget-object v2, La/q4f;->g:La/q4f;

    .line 207
    .line 208
    if-ne v0, v2, :cond_b

    .line 209
    .line 210
    invoke-virtual {v4}, La/qg20;->I()La/xuj0;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    if-eqz v2, :cond_b

    .line 215
    .line 216
    invoke-virtual {v4}, La/qg20;->I()La/xuj0;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-eqz v0, :cond_e

    .line 221
    .line 222
    iget-object v1, v4, La/qg20;->W0:La/ol60;

    .line 223
    .line 224
    invoke-virtual {v1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_b
    iput-object v0, v5, La/hf20;->i:La/q4f;

    .line 229
    .line 230
    iput-object v11, v5, La/hf20;->j:La/ql5;

    .line 231
    .line 232
    iput-wide v9, v5, La/hf20;->k:D

    .line 233
    .line 234
    iput-byte v1, v5, La/hf20;->l:B

    .line 235
    .line 236
    move-object v1, v0

    .line 237
    move-object v0, v4

    .line 238
    iget-object v4, v5, La/hf20;->n:La/ytb0;

    .line 239
    .line 240
    move-wide v2, v9

    .line 241
    invoke-virtual/range {v0 .. v5}, La/qg20;->U(La/q4f;DLa/ytb0;La/zje;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v4

    .line 245
    if-ne v4, v7, :cond_c

    .line 246
    .line 247
    goto :goto_6

    .line 248
    :cond_c
    :goto_5
    check-cast v4, Ljava/lang/Boolean;

    .line 249
    .line 250
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    if-eqz v4, :cond_d

    .line 255
    .line 256
    iget-object v0, v0, La/qg20;->b1:La/p7m0;

    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    sget-object v1, La/yb50;->a:La/yb50;

    .line 262
    .line 263
    invoke-virtual {v0, v8, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_d
    iput-object v8, v5, La/hf20;->i:La/q4f;

    .line 268
    .line 269
    iput-object v8, v5, La/hf20;->j:La/ql5;

    .line 270
    .line 271
    iput-wide v2, v5, La/hf20;->k:D

    .line 272
    .line 273
    iput-byte v6, v5, La/hf20;->l:B

    .line 274
    .line 275
    move-object v6, v5

    .line 276
    iget-object v5, v6, La/hf20;->n:La/ytb0;

    .line 277
    .line 278
    move-wide v3, v2

    .line 279
    move-object v2, v11

    .line 280
    invoke-virtual/range {v0 .. v6}, La/qg20;->Y(La/q4f;La/ql5;DLa/ytb0;La/zje;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    if-ne v0, v7, :cond_e

    .line 285
    .line 286
    :goto_6
    return-object v7

    .line 287
    :cond_e
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    return-object v0
.end method
