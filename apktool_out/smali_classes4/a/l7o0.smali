.class public final La/l7o0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Ljava/util/Date;

.field public j:La/fxu;

.field public k:Ljava/util/Date;

.field public l:J

.field public m:B

.field public n:B

.field public final synthetic o:La/m7o0;

.field public final synthetic p:I


# direct methods
.method public constructor <init>(La/m7o0;ILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/l7o0;->o:La/m7o0;

    .line 2
    .line 3
    iput p2, p0, La/l7o0;->p:I

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
    new-instance v0, La/l7o0;

    .line 2
    .line 3
    iget-object v1, p0, La/l7o0;->o:La/m7o0;

    .line 4
    .line 5
    iget p0, p0, La/l7o0;->p:I

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, La/l7o0;-><init>(La/m7o0;ILa/yje;)V

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
    invoke-virtual {p0, p1}, La/l7o0;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/l7o0;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/l7o0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v7, v5, La/l7o0;->o:La/m7o0;

    .line 4
    .line 5
    iget-object v8, v7, La/i3t0;->i:La/ocj;

    .line 6
    .line 7
    sget-object v9, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v0, v5, La/l7o0;->n:B

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    const/4 v2, 0x2

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    if-eq v0, v3, :cond_2

    .line 18
    .line 19
    if-eq v0, v2, :cond_1

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v4

    .line 36
    :cond_1
    iget-byte v0, v5, La/l7o0;->m:B

    .line 37
    .line 38
    iget-wide v2, v5, La/l7o0;->l:J

    .line 39
    .line 40
    iget-object v6, v5, La/l7o0;->k:Ljava/util/Date;

    .line 41
    .line 42
    iget-object v10, v5, La/l7o0;->j:La/fxu;

    .line 43
    .line 44
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-wide v11, v2

    .line 48
    move-object/from16 v2, p1

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :cond_2
    iget-object v0, v5, La/l7o0;->i:Ljava/util/Date;

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-object/from16 v3, p1

    .line 58
    .line 59
    :cond_3
    move-object v6, v0

    .line 60
    goto :goto_0

    .line 61
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, La/i7o0;

    .line 69
    .line 70
    iget-object v0, v0, La/i7o0;->e:Ljava/util/List;

    .line 71
    .line 72
    iget v6, v5, La/l7o0;->p:I

    .line 73
    .line 74
    invoke-static {v6, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ljava/util/Date;

    .line 79
    .line 80
    if-nez v0, :cond_5

    .line 81
    .line 82
    new-instance v0, Ljava/util/Date;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 85
    .line 86
    .line 87
    :cond_5
    iget-object v6, v7, La/m7o0;->s:La/reu;

    .line 88
    .line 89
    iput-object v0, v5, La/l7o0;->i:Ljava/util/Date;

    .line 90
    .line 91
    iput-byte v3, v5, La/l7o0;->n:B

    .line 92
    .line 93
    iget-object v3, v6, La/reu;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, La/udg;

    .line 96
    .line 97
    iget-object v3, v3, La/udg;->b:La/tcg;

    .line 98
    .line 99
    iget-object v3, v3, La/tcg;->d:Ljava/util/LinkedHashMap;

    .line 100
    .line 101
    if-ne v3, v9, :cond_3

    .line 102
    .line 103
    goto/16 :goto_2

    .line 104
    .line 105
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 106
    .line 107
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, Ljava/util/List;

    .line 112
    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_8

    .line 120
    .line 121
    :cond_6
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, La/i7o0;

    .line 126
    .line 127
    iget-boolean v0, v0, La/i7o0;->f:Z

    .line 128
    .line 129
    if-nez v0, :cond_8

    .line 130
    .line 131
    iget-object v0, v8, La/ocj;->a:La/p7m0;

    .line 132
    .line 133
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-object v10, v3

    .line 141
    check-cast v10, La/i7o0;

    .line 142
    .line 143
    const/4 v15, 0x1

    .line 144
    const/16 v16, 0xdf

    .line 145
    .line 146
    const/4 v11, 0x0

    .line 147
    const/4 v12, 0x0

    .line 148
    const/4 v13, 0x0

    .line 149
    const/4 v14, 0x0

    .line 150
    invoke-static/range {v10 .. v16}, La/i7o0;->a(La/i7o0;ZLjava/lang/Integer;Ljava/util/List;Ljava/util/List;ZI)La/i7o0;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-virtual {v0, v3, v10}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-eqz v3, :cond_7

    .line 159
    .line 160
    :cond_8
    iget-object v10, v7, La/m7o0;->q:La/fxu;

    .line 161
    .line 162
    iget-object v0, v7, La/m7o0;->o:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 163
    .line 164
    iget-wide v11, v0, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->a:J

    .line 165
    .line 166
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 167
    .line 168
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 169
    .line 170
    iget-object v3, v7, La/m7o0;->r:La/pmi;

    .line 171
    .line 172
    iput-object v4, v5, La/l7o0;->i:Ljava/util/Date;

    .line 173
    .line 174
    iput-object v10, v5, La/l7o0;->j:La/fxu;

    .line 175
    .line 176
    iput-object v6, v5, La/l7o0;->k:Ljava/util/Date;

    .line 177
    .line 178
    iput-wide v11, v5, La/l7o0;->l:J

    .line 179
    .line 180
    iput-byte v0, v5, La/l7o0;->m:B

    .line 181
    .line 182
    iput-byte v2, v5, La/l7o0;->n:B

    .line 183
    .line 184
    invoke-virtual {v3, v5}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    if-ne v2, v9, :cond_9

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_9
    :goto_1
    check-cast v2, Ljava/lang/Number;

    .line 192
    .line 193
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    iput-object v4, v5, La/l7o0;->i:Ljava/util/Date;

    .line 198
    .line 199
    iput-object v4, v5, La/l7o0;->j:La/fxu;

    .line 200
    .line 201
    iput-object v4, v5, La/l7o0;->k:Ljava/util/Date;

    .line 202
    .line 203
    iput-byte v1, v5, La/l7o0;->n:B

    .line 204
    .line 205
    iget-object v1, v10, La/fxu;->a:La/udg;

    .line 206
    .line 207
    move v3, v2

    .line 208
    move v2, v0

    .line 209
    move-object v0, v1

    .line 210
    move v1, v3

    .line 211
    move-wide v3, v11

    .line 212
    invoke-virtual/range {v0 .. v6}, La/udg;->e(IIJLa/zje;Ljava/util/Date;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    if-ne v0, v9, :cond_a

    .line 217
    .line 218
    :goto_2
    return-object v9

    .line 219
    :cond_a
    :goto_3
    move-object v12, v0

    .line 220
    check-cast v12, Ljava/util/List;

    .line 221
    .line 222
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, La/i7o0;

    .line 227
    .line 228
    iget-object v0, v0, La/i7o0;->e:Ljava/util/List;

    .line 229
    .line 230
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-eqz v1, :cond_b

    .line 235
    .line 236
    new-instance v0, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    const/16 v3, -0xe

    .line 250
    .line 251
    const/4 v4, 0x5

    .line 252
    invoke-virtual {v2, v4, v3}, Ljava/util/Calendar;->add(II)V

    .line 253
    .line 254
    .line 255
    :goto_4
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    if-nez v3, :cond_b

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    const/4 v3, -0x1

    .line 272
    invoke-virtual {v1, v4, v3}, Ljava/util/Calendar;->add(II)V

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_b
    move-object v13, v0

    .line 277
    iget-object v0, v8, La/ocj;->a:La/p7m0;

    .line 278
    .line 279
    :cond_c
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    move-object v9, v1

    .line 287
    check-cast v9, La/i7o0;

    .line 288
    .line 289
    const/4 v14, 0x0

    .line 290
    const/16 v15, 0xc7

    .line 291
    .line 292
    const/4 v10, 0x0

    .line 293
    const/4 v11, 0x0

    .line 294
    invoke-static/range {v9 .. v15}, La/i7o0;->a(La/i7o0;ZLjava/lang/Integer;Ljava/util/List;Ljava/util/List;ZI)La/i7o0;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-eqz v1, :cond_c

    .line 303
    .line 304
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object v0
.end method
