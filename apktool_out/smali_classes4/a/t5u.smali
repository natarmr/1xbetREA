.class public final La/t5u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:B

.field public synthetic j:La/kmq;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/v5u;

.field public final synthetic m:Lkotlin/Pair;

.field public final synthetic n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

.field public final synthetic o:J

.field public final synthetic p:La/n2o;

.field public q:La/kmq;

.field public r:La/ypl0;

.field public s:Z


# direct methods
.method public constructor <init>(La/yje;La/v5u;Lkotlin/Pair;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;JLa/n2o;)V
    .locals 0

    .line 1
    iput-object p2, p0, La/t5u;->l:La/v5u;

    .line 2
    .line 3
    iput-object p3, p0, La/t5u;->m:Lkotlin/Pair;

    .line 4
    .line 5
    iput-object p4, p0, La/t5u;->n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 6
    .line 7
    iput-wide p5, p0, La/t5u;->o:J

    .line 8
    .line 9
    iput-object p7, p0, La/t5u;->p:La/n2o;

    .line 10
    .line 11
    const/4 p2, 0x3

    .line 12
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    move-object v1, p3

    .line 4
    check-cast v1, La/yje;

    .line 5
    .line 6
    new-instance v0, La/t5u;

    .line 7
    .line 8
    iget-wide v5, p0, La/t5u;->o:J

    .line 9
    .line 10
    iget-object v7, p0, La/t5u;->p:La/n2o;

    .line 11
    .line 12
    iget-object v2, p0, La/t5u;->l:La/v5u;

    .line 13
    .line 14
    iget-object v3, p0, La/t5u;->m:Lkotlin/Pair;

    .line 15
    .line 16
    iget-object v4, p0, La/t5u;->n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 17
    .line 18
    invoke-direct/range {v0 .. v7}, La/t5u;-><init>(La/yje;La/v5u;Lkotlin/Pair;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;JLa/n2o;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/t5u;->j:La/kmq;

    .line 22
    .line 23
    iput-object p2, v0, La/t5u;->k:Ljava/lang/Object;

    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, La/t5u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v6, v5, La/t5u;->l:La/v5u;

    .line 4
    .line 5
    iget-object v0, v6, La/v5u;->c:La/j3c;

    .line 6
    .line 7
    sget-object v7, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v1, v5, La/t5u;->i:B

    .line 10
    .line 11
    const/4 v8, 0x3

    .line 12
    const/4 v9, 0x2

    .line 13
    const/4 v10, 0x1

    .line 14
    const/4 v11, 0x0

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    if-eq v1, v10, :cond_2

    .line 18
    .line 19
    if-eq v1, v9, :cond_1

    .line 20
    .line 21
    if-ne v1, v8, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_6

    .line 27
    .line 28
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v11

    .line 34
    :cond_1
    iget-object v0, v5, La/t5u;->r:La/ypl0;

    .line 35
    .line 36
    iget-object v1, v5, La/t5u;->q:La/kmq;

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move-object v14, v0

    .line 42
    move-object v12, v1

    .line 43
    move-object v9, v5

    .line 44
    move v15, v10

    .line 45
    move-object/from16 v0, p1

    .line 46
    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :cond_2
    iget-boolean v1, v5, La/t5u;->s:Z

    .line 50
    .line 51
    iget-object v2, v5, La/t5u;->q:La/kmq;

    .line 52
    .line 53
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move v13, v1

    .line 57
    move-object v12, v2

    .line 58
    move-object/from16 v1, p1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v12, v5, La/t5u;->j:La/kmq;

    .line 65
    .line 66
    iget-object v1, v5, La/t5u;->k:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result v13

    .line 74
    iget-object v1, v5, La/t5u;->m:Lkotlin/Pair;

    .line 75
    .line 76
    iget-object v2, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide v2

    .line 84
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Ljava/lang/Number;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 89
    .line 90
    .line 91
    move-result-wide v14

    .line 92
    iput-object v11, v5, La/t5u;->j:La/kmq;

    .line 93
    .line 94
    iput-object v11, v5, La/t5u;->k:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v12, v5, La/t5u;->q:La/kmq;

    .line 97
    .line 98
    iput-boolean v13, v5, La/t5u;->s:Z

    .line 99
    .line 100
    iput-byte v10, v5, La/t5u;->i:B

    .line 101
    .line 102
    move-wide v1, v2

    .line 103
    move-wide v3, v14

    .line 104
    invoke-virtual/range {v0 .. v5}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-ne v1, v7, :cond_4

    .line 109
    .line 110
    goto/16 :goto_5

    .line 111
    .line 112
    :cond_4
    :goto_0
    move-object v14, v1

    .line 113
    check-cast v14, La/ypl0;

    .line 114
    .line 115
    iput-object v11, v5, La/t5u;->j:La/kmq;

    .line 116
    .line 117
    iput-object v11, v5, La/t5u;->k:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v12, v5, La/t5u;->q:La/kmq;

    .line 120
    .line 121
    iput-object v14, v5, La/t5u;->r:La/ypl0;

    .line 122
    .line 123
    iput-boolean v13, v5, La/t5u;->s:Z

    .line 124
    .line 125
    iput-byte v9, v5, La/t5u;->i:B

    .line 126
    .line 127
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 128
    .line 129
    iget-object v2, v5, La/t5u;->n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 130
    .line 131
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_5

    .line 136
    .line 137
    sget-object v1, La/zrg;->d:La/zrg;

    .line 138
    .line 139
    iget-wide v2, v1, La/yxg;->b:J

    .line 140
    .line 141
    move v15, v10

    .line 142
    iget-wide v9, v1, La/yxg;->a:J

    .line 143
    .line 144
    move-wide v1, v2

    .line 145
    move-wide v3, v9

    .line 146
    invoke-virtual/range {v0 .. v5}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    move-object/from16 v9, p0

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_5
    move v15, v10

    .line 154
    sget-object v1, La/gug;->d:La/gug;

    .line 155
    .line 156
    iget-wide v2, v1, La/yxg;->b:J

    .line 157
    .line 158
    iget-wide v4, v1, La/yxg;->a:J

    .line 159
    .line 160
    move-wide v1, v2

    .line 161
    move-wide v3, v4

    .line 162
    move-object/from16 v5, p0

    .line 163
    .line 164
    invoke-virtual/range {v0 .. v5}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    move-object v9, v5

    .line 169
    :goto_1
    if-ne v0, v7, :cond_6

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_6
    :goto_2
    move-object v10, v0

    .line 173
    check-cast v10, La/ypl0;

    .line 174
    .line 175
    iget-object v0, v6, La/v5u;->a:La/nmo;

    .line 176
    .line 177
    iget-object v0, v0, La/nmo;->a:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, La/t2g;

    .line 180
    .line 181
    iget-object v0, v0, La/t2g;->a:La/s2g;

    .line 182
    .line 183
    iget-object v0, v0, La/s2g;->a:La/p7m0;

    .line 184
    .line 185
    move-object v1, v0

    .line 186
    new-instance v0, La/ze1;

    .line 187
    .line 188
    const/4 v5, 0x0

    .line 189
    move-object v2, v1

    .line 190
    move-object v1, v6

    .line 191
    const/4 v6, 0x5

    .line 192
    move-object v4, v2

    .line 193
    iget-wide v2, v9, La/t5u;->o:J

    .line 194
    .line 195
    move-object/from16 v16, v4

    .line 196
    .line 197
    iget-object v4, v9, La/t5u;->n:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 198
    .line 199
    invoke-direct/range {v0 .. v6}, La/ze1;-><init>(Ljava/lang/Object;JLjava/lang/Object;La/yje;B)V

    .line 200
    .line 201
    .line 202
    new-instance v1, La/vsg0;

    .line 203
    .line 204
    invoke-direct {v1, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 205
    .line 206
    .line 207
    new-instance v0, La/u5u;

    .line 208
    .line 209
    iget-object v2, v9, La/t5u;->p:La/n2o;

    .line 210
    .line 211
    const/4 v3, 0x0

    .line 212
    invoke-direct {v0, v2, v11, v3}, La/u5u;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 213
    .line 214
    .line 215
    new-instance v2, La/fnq;

    .line 216
    .line 217
    invoke-direct {v2, v1, v0}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 218
    .line 219
    .line 220
    new-instance v0, La/sot;

    .line 221
    .line 222
    invoke-direct {v0, v14, v10, v11}, La/sot;-><init>(La/ypl0;La/ypl0;La/yje;)V

    .line 223
    .line 224
    .line 225
    iput-object v11, v9, La/t5u;->j:La/kmq;

    .line 226
    .line 227
    iput-object v11, v9, La/t5u;->k:Ljava/lang/Object;

    .line 228
    .line 229
    iput-object v11, v9, La/t5u;->q:La/kmq;

    .line 230
    .line 231
    iput-object v11, v9, La/t5u;->r:La/ypl0;

    .line 232
    .line 233
    iput-byte v8, v9, La/t5u;->i:B

    .line 234
    .line 235
    invoke-static {v12}, La/f7k;->J(La/kmq;)V

    .line 236
    .line 237
    .line 238
    const/4 v13, 0x2

    .line 239
    new-array v1, v13, [La/gmq;

    .line 240
    .line 241
    aput-object v16, v1, v3

    .line 242
    .line 243
    aput-object v2, v1, v15

    .line 244
    .line 245
    sget-object v2, La/pul;->j:La/pul;

    .line 246
    .line 247
    new-instance v3, La/kh1;

    .line 248
    .line 249
    const/16 v4, 0x9

    .line 250
    .line 251
    invoke-direct {v3, v0, v11, v4}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 252
    .line 253
    .line 254
    invoke-static {v9, v12, v3, v2, v1}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-ne v0, v7, :cond_7

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    :goto_3
    if-ne v0, v7, :cond_8

    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    :goto_4
    if-ne v0, v7, :cond_9

    .line 269
    .line 270
    :goto_5
    return-object v7

    .line 271
    :cond_9
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    return-object v0
.end method
