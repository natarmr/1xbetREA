.class public final La/ccl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/esg0;


# direct methods
.method public constructor <init>(La/esg0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ccl;->a:La/esg0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(ILa/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    instance-of v3, v0, La/bcl;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, La/bcl;

    .line 13
    .line 14
    iget v4, v3, La/bcl;->o:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/bcl;->o:I

    .line 24
    .line 25
    :goto_0
    move-object v7, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, La/bcl;

    .line 28
    .line 29
    invoke-direct {v3, v1, v0}, La/bcl;-><init>(La/ccl;La/zje;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v7, La/bcl;->m:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v3, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v4, v7, La/bcl;->o:I

    .line 38
    .line 39
    const/4 v11, 0x4

    .line 40
    const/4 v5, 0x2

    .line 41
    const/4 v12, 0x3

    .line 42
    const/4 v6, 0x1

    .line 43
    iget-object v13, v1, La/ccl;->a:La/esg0;

    .line 44
    .line 45
    const/4 v14, 0x0

    .line 46
    if-eqz v4, :cond_5

    .line 47
    .line 48
    if-eq v4, v6, :cond_4

    .line 49
    .line 50
    if-eq v4, v5, :cond_3

    .line 51
    .line 52
    if-eq v4, v12, :cond_2

    .line 53
    .line 54
    if-ne v4, v11, :cond_1

    .line 55
    .line 56
    iget-object v1, v7, La/bcl;->l:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_b

    .line 64
    .line 65
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v14

    .line 71
    :cond_2
    iget-boolean v1, v7, La/bcl;->j:Z

    .line 72
    .line 73
    iget v2, v7, La/bcl;->i:I

    .line 74
    .line 75
    iget-object v4, v7, La/bcl;->l:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v5, v7, La/bcl;->k:Ljava/util/List;

    .line 78
    .line 79
    check-cast v5, Ljava/lang/Throwable;

    .line 80
    .line 81
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_8

    .line 85
    .line 86
    :cond_3
    iget-boolean v1, v7, La/bcl;->j:Z

    .line 87
    .line 88
    iget v2, v7, La/bcl;->i:I

    .line 89
    .line 90
    iget-object v4, v7, La/bcl;->k:Ljava/util/List;

    .line 91
    .line 92
    check-cast v4, Ljava/lang/Throwable;

    .line 93
    .line 94
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    check-cast v0, La/j0g0;

    .line 98
    .line 99
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 100
    .line 101
    :goto_2
    move-object v4, v0

    .line 102
    goto/16 :goto_7

    .line 103
    .line 104
    :cond_4
    iget-boolean v2, v7, La/bcl;->j:Z

    .line 105
    .line 106
    iget v4, v7, La/bcl;->i:I

    .line 107
    .line 108
    iget-object v6, v7, La/bcl;->k:Ljava/util/List;

    .line 109
    .line 110
    check-cast v6, La/ccl;

    .line 111
    .line 112
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    .line 115
    move/from16 v16, v4

    .line 116
    .line 117
    move v4, v2

    .line 118
    move/from16 v2, v16

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :catchall_0
    move-exception v0

    .line 122
    move/from16 v16, v4

    .line 123
    .line 124
    move v4, v2

    .line 125
    move/from16 v2, v16

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_5
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, v13, La/esg0;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, La/t52;

    .line 134
    .line 135
    invoke-virtual {v0}, La/t52;->a()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    xor-int/lit8 v4, v0, 0x1

    .line 144
    .line 145
    if-eqz v0, :cond_b

    .line 146
    .line 147
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 148
    .line 149
    iput-object v14, v7, La/bcl;->k:Ljava/util/List;

    .line 150
    .line 151
    iput v2, v7, La/bcl;->i:I

    .line 152
    .line 153
    iput-boolean v4, v7, La/bcl;->j:Z

    .line 154
    .line 155
    iput v6, v7, La/bcl;->o:I

    .line 156
    .line 157
    iget-object v0, v13, La/esg0;->d:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, La/mne;

    .line 160
    .line 161
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 162
    .line 163
    new-instance v6, La/u52;

    .line 164
    .line 165
    const/4 v8, 0x0

    .line 166
    invoke-direct {v6, v13, v2, v14, v8}, La/u52;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 167
    .line 168
    .line 169
    invoke-static {v0, v6, v7}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    if-ne v0, v3, :cond_6

    .line 174
    .line 175
    goto/16 :goto_a

    .line 176
    .line 177
    :cond_6
    :goto_3
    check-cast v0, Ljava/util/List;

    .line 178
    .line 179
    sget-object v6, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 180
    .line 181
    :goto_4
    move v15, v4

    .line 182
    goto :goto_6

    .line 183
    :catchall_1
    move-exception v0

    .line 184
    :goto_5
    sget-object v6, La/j0g0;->b:La/e0g0;

    .line 185
    .line 186
    new-instance v6, La/g0g0;

    .line 187
    .line 188
    invoke-direct {v6, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    move-object v0, v6

    .line 192
    goto :goto_4

    .line 193
    :goto_6
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    if-nez v4, :cond_7

    .line 198
    .line 199
    goto :goto_9

    .line 200
    :cond_7
    sget-object v0, La/wen;->b:La/uen;

    .line 201
    .line 202
    sget-object v0, La/bfn;->e:La/bfn;

    .line 203
    .line 204
    invoke-static {v12, v0}, La/ibc;->v0(ILa/bfn;)J

    .line 205
    .line 206
    .line 207
    move-result-wide v8

    .line 208
    new-instance v10, La/u52;

    .line 209
    .line 210
    const/16 v0, 0x9

    .line 211
    .line 212
    invoke-direct {v10, v1, v2, v14, v0}, La/u52;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 213
    .line 214
    .line 215
    iput-object v14, v7, La/bcl;->k:Ljava/util/List;

    .line 216
    .line 217
    iput v2, v7, La/bcl;->i:I

    .line 218
    .line 219
    iput-boolean v15, v7, La/bcl;->j:Z

    .line 220
    .line 221
    iput v5, v7, La/bcl;->o:I

    .line 222
    .line 223
    move-wide v5, v8

    .line 224
    sget-object v9, La/iun;->a:La/iun;

    .line 225
    .line 226
    const/4 v4, 0x3

    .line 227
    const-string v8, "getAllowedSportIds"

    .line 228
    .line 229
    invoke-static/range {v4 .. v10}, La/j0x;->D(IJLa/zje;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-ne v0, v3, :cond_8

    .line 234
    .line 235
    goto :goto_a

    .line 236
    :cond_8
    move v1, v15

    .line 237
    goto/16 :goto_2

    .line 238
    .line 239
    :goto_7
    invoke-static {v4}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    if-eqz v0, :cond_9

    .line 244
    .line 245
    new-instance v5, La/v52;

    .line 246
    .line 247
    invoke-direct {v5, v0}, La/v52;-><init>(Ljava/lang/Throwable;)V

    .line 248
    .line 249
    .line 250
    iput-object v14, v7, La/bcl;->k:Ljava/util/List;

    .line 251
    .line 252
    iput-object v4, v7, La/bcl;->l:Ljava/lang/Object;

    .line 253
    .line 254
    iput v2, v7, La/bcl;->i:I

    .line 255
    .line 256
    iput-boolean v1, v7, La/bcl;->j:Z

    .line 257
    .line 258
    iput v12, v7, La/bcl;->o:I

    .line 259
    .line 260
    invoke-virtual {v13, v5, v7}, La/esg0;->y0(La/y52;La/bcl;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    if-ne v0, v3, :cond_9

    .line 265
    .line 266
    goto :goto_a

    .line 267
    :cond_9
    :goto_8
    move v15, v1

    .line 268
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 269
    .line 270
    instance-of v0, v4, La/g0g0;

    .line 271
    .line 272
    if-eqz v0, :cond_a

    .line 273
    .line 274
    move-object v4, v14

    .line 275
    :cond_a
    move-object v0, v4

    .line 276
    check-cast v0, Ljava/util/List;

    .line 277
    .line 278
    :goto_9
    check-cast v0, Ljava/util/List;

    .line 279
    .line 280
    if-eqz v0, :cond_b

    .line 281
    .line 282
    new-instance v1, La/x52;

    .line 283
    .line 284
    invoke-direct {v1, v0}, La/x52;-><init>(Ljava/util/List;)V

    .line 285
    .line 286
    .line 287
    iput-object v0, v7, La/bcl;->k:Ljava/util/List;

    .line 288
    .line 289
    iput-object v14, v7, La/bcl;->l:Ljava/lang/Object;

    .line 290
    .line 291
    iput v2, v7, La/bcl;->i:I

    .line 292
    .line 293
    iput-boolean v15, v7, La/bcl;->j:Z

    .line 294
    .line 295
    iput v11, v7, La/bcl;->o:I

    .line 296
    .line 297
    invoke-virtual {v13, v1, v7}, La/esg0;->y0(La/y52;La/bcl;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    if-ne v0, v3, :cond_b

    .line 302
    .line 303
    :goto_a
    return-object v3

    .line 304
    :cond_b
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object v0
.end method
