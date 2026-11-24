.class public final La/alt;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/pmi;

.field public j:La/cre;

.field public k:Z

.field public l:Z

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:La/pmi;

.field public final synthetic o:Z

.field public final synthetic p:La/cre;


# direct methods
.method public constructor <init>(La/pmi;ZLa/cre;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/alt;->n:La/pmi;

    .line 2
    .line 3
    iput-boolean p2, p0, La/alt;->o:Z

    .line 4
    .line 5
    iput-object p3, p0, La/alt;->p:La/cre;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    new-instance v0, La/alt;

    .line 2
    .line 3
    iget-boolean v1, p0, La/alt;->o:Z

    .line 4
    .line 5
    iget-object v2, p0, La/alt;->p:La/cre;

    .line 6
    .line 7
    iget-object p0, p0, La/alt;->n:La/pmi;

    .line 8
    .line 9
    invoke-direct {v0, p0, v1, v2, p2}, La/alt;-><init>(La/pmi;ZLa/cre;La/yje;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, La/alt;->m:Ljava/lang/Object;

    .line 13
    .line 14
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
    invoke-virtual {p0, p1, p2}, La/alt;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/alt;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/alt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/alt;->n:La/pmi;

    .line 4
    .line 5
    iget-object v2, v1, La/pmi;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/ykt;

    .line 8
    .line 9
    iget-object v3, v1, La/pmi;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, La/knf0;

    .line 12
    .line 13
    iget-object v4, v0, La/alt;->m:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, La/vne;

    .line 16
    .line 17
    sget-object v4, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v5, v0, La/alt;->l:Z

    .line 20
    .line 21
    const-wide/16 v6, 0x0

    .line 22
    .line 23
    const/4 v8, 0x1

    .line 24
    const/4 v9, 0x0

    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    if-ne v5, v8, :cond_0

    .line 28
    .line 29
    iget-boolean v1, v0, La/alt;->k:Z

    .line 30
    .line 31
    iget-object v4, v0, La/alt;->j:La/cre;

    .line 32
    .line 33
    iget-object v0, v0, La/alt;->i:La/pmi;

    .line 34
    .line 35
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    move v5, v1

    .line 39
    move-object v1, v0

    .line 40
    move-object/from16 v0, p1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto/16 :goto_7

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
    return-object v9

    .line 52
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-boolean v5, v0, La/alt;->o:Z

    .line 56
    .line 57
    iget-object v10, v0, La/alt;->p:La/cre;

    .line 58
    .line 59
    :try_start_1
    sget-object v11, La/j0g0;->b:La/e0g0;

    .line 60
    .line 61
    iget-object v11, v3, La/knf0;->b:La/q7d0;

    .line 62
    .line 63
    const-string v12, "ISO_CODE_TO_CHANGE"

    .line 64
    .line 65
    invoke-static {v11, v12}, La/q7d0;->c(La/q7d0;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    if-nez v11, :cond_2

    .line 70
    .line 71
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    :cond_2
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    if-lez v12, :cond_3

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    move-object v11, v9

    .line 83
    :goto_0
    if-nez v11, :cond_4

    .line 84
    .line 85
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v11

    .line 89
    :cond_4
    iget-object v12, v1, La/pmi;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v12, La/bwl;

    .line 92
    .line 93
    iput-object v9, v0, La/alt;->m:Ljava/lang/Object;

    .line 94
    .line 95
    iput-object v1, v0, La/alt;->i:La/pmi;

    .line 96
    .line 97
    iput-object v10, v0, La/alt;->j:La/cre;

    .line 98
    .line 99
    iput-boolean v5, v0, La/alt;->k:Z

    .line 100
    .line 101
    iput-boolean v8, v0, La/alt;->l:Z

    .line 102
    .line 103
    iget-object v8, v12, La/bwl;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v8, La/wgn;

    .line 106
    .line 107
    invoke-virtual {v8}, La/wgn;->invoke()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    check-cast v8, La/zkt;

    .line 112
    .line 113
    invoke-interface {v8, v11, v0}, La/zkt;->a(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-ne v0, v4, :cond_5

    .line 118
    .line 119
    return-object v4

    .line 120
    :cond_5
    move-object v4, v10

    .line 121
    :goto_1
    check-cast v0, La/dx5;

    .line 122
    .line 123
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, La/dlt;

    .line 128
    .line 129
    invoke-static {v0}, La/hic;->H(La/dlt;)La/xkt;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget v1, v4, La/cre;->a:I

    .line 137
    .line 138
    if-nez v1, :cond_6

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_6
    iget-object v10, v4, La/cre;->b:Ljava/lang/String;

    .line 142
    .line 143
    iget-object v9, v4, La/cre;->c:Ljava/lang/String;

    .line 144
    .line 145
    if-eqz v5, :cond_7

    .line 146
    .line 147
    iget-object v4, v0, La/xkt;->c:Ljava/lang/String;

    .line 148
    .line 149
    :goto_2
    move-object v11, v4

    .line 150
    goto :goto_3

    .line 151
    :cond_7
    const-string v4, ""

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :goto_3
    if-eqz v5, :cond_8

    .line 155
    .line 156
    iget-object v4, v0, La/xkt;->f:Ljava/lang/Long;

    .line 157
    .line 158
    :goto_4
    move-object v14, v4

    .line 159
    goto :goto_5

    .line 160
    :cond_8
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    goto :goto_4

    .line 165
    :goto_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    iget-object v12, v0, La/xkt;->d:Ljava/lang/String;

    .line 170
    .line 171
    iget-object v15, v0, La/xkt;->g:Ljava/lang/Integer;

    .line 172
    .line 173
    new-instance v8, La/xkt;

    .line 174
    .line 175
    invoke-direct/range {v8 .. v15}, La/xkt;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;)V

    .line 176
    .line 177
    .line 178
    move-object v0, v8

    .line 179
    :goto_6
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 180
    .line 181
    goto :goto_8

    .line 182
    :goto_7
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 183
    .line 184
    new-instance v1, La/g0g0;

    .line 185
    .line 186
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    move-object v0, v1

    .line 190
    :goto_8
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    if-nez v1, :cond_9

    .line 195
    .line 196
    goto :goto_9

    .line 197
    :cond_9
    invoke-virtual {v2}, La/ykt;->a()La/xkt;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-eqz v0, :cond_d

    .line 202
    .line 203
    :goto_9
    check-cast v0, La/xkt;

    .line 204
    .line 205
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    iput-object v0, v2, La/ykt;->c:La/xkt;

    .line 209
    .line 210
    iget-object v1, v2, La/ykt;->a:La/q7d0;

    .line 211
    .line 212
    invoke-virtual {v2}, La/ykt;->a()La/xkt;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-nez v4, :cond_a

    .line 221
    .line 222
    const-string v4, "GEO_IP_INFO_PREF_KEY"

    .line 223
    .line 224
    invoke-virtual {v1, v4}, La/q7d0;->h(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    iget-object v2, v2, La/ykt;->b:La/vby;

    .line 228
    .line 229
    sget-object v5, La/xkt;->Companion:La/wkt;

    .line 230
    .line 231
    invoke-virtual {v5}, La/wkt;->serializer()La/jiy;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    check-cast v5, La/jiy;

    .line 236
    .line 237
    invoke-virtual {v2, v5, v0}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-virtual {v1, v4, v2}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :cond_a
    iget-object v1, v0, La/xkt;->e:Ljava/lang/Integer;

    .line 245
    .line 246
    if-eqz v1, :cond_b

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    goto :goto_a

    .line 253
    :cond_b
    const/4 v1, 0x0

    .line 254
    :goto_a
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    iput-object v2, v3, La/knf0;->e:Ljava/lang/Integer;

    .line 259
    .line 260
    iget-object v2, v3, La/knf0;->b:La/q7d0;

    .line 261
    .line 262
    const-string v4, "COUNTRY_ID_PREFS_KEY"

    .line 263
    .line 264
    invoke-virtual {v2, v1, v4}, La/q7d0;->e(ILjava/lang/String;)V

    .line 265
    .line 266
    .line 267
    iget-object v1, v0, La/xkt;->f:Ljava/lang/Long;

    .line 268
    .line 269
    if-eqz v1, :cond_c

    .line 270
    .line 271
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 272
    .line 273
    .line 274
    move-result-wide v6

    .line 275
    :cond_c
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    iput-object v1, v3, La/knf0;->f:Ljava/lang/Long;

    .line 280
    .line 281
    const-string v1, "REGION_ID_PREFS_KEY"

    .line 282
    .line 283
    invoke-virtual {v2, v1, v6, v7}, La/q7d0;->f(Ljava/lang/String;J)V

    .line 284
    .line 285
    .line 286
    invoke-static {v0}, La/vic;->H(La/xkt;)La/elt;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    return-object v0

    .line 291
    :cond_d
    throw v1
.end method
