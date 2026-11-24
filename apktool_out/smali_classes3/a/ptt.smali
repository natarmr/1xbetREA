.class public final La/ptt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(La/wdj;JILjava/util/List;ILjava/util/List;Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;)La/cn7;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;->p0()La/k77;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v3, La/k77;->c:La/k77;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eq v2, v3, :cond_1

    .line 22
    .line 23
    invoke-interface {v1}, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;->p0()La/k77;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sget-object v3, La/k77;->e:La/k77;

    .line 28
    .line 29
    if-ne v2, v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object/from16 v16, v4

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_1
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface/range {p6 .. p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_3

    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    move-object v6, v5

    .line 55
    check-cast v6, La/un7;

    .line 56
    .line 57
    iget-boolean v6, v6, La/un7;->b:Z

    .line 58
    .line 59
    if-eqz v6, :cond_2

    .line 60
    .line 61
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_5

    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    check-cast v5, La/un7;

    .line 85
    .line 86
    iget-object v5, v5, La/un7;->a:La/q4f;

    .line 87
    .line 88
    invoke-static {v5}, La/zjb;->O(La/q4f;)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    if-eqz v5, :cond_4

    .line 93
    .line 94
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    move-object/from16 v16, v3

    .line 99
    .line 100
    :goto_3
    new-instance v2, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-interface/range {p4 .. p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    :cond_6
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_7

    .line 114
    .line 115
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    move-object v6, v5

    .line 120
    check-cast v6, La/h0w;

    .line 121
    .line 122
    iget-boolean v6, v6, La/h0w;->b:Z

    .line 123
    .line 124
    if-eqz v6, :cond_6

    .line 125
    .line 126
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_7
    new-instance v14, Ljava/util/ArrayList;

    .line 131
    .line 132
    const/16 v3, 0xa

    .line 133
    .line 134
    invoke-static {v2, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    invoke-direct {v14, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_8

    .line 150
    .line 151
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    check-cast v3, La/h0w;

    .line 156
    .line 157
    invoke-static {v3}, La/xnm0;->k(La/h0w;)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_8
    instance-of v2, v1, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 170
    .line 171
    if-eqz v2, :cond_9

    .line 172
    .line 173
    move-object v0, v1

    .line 174
    check-cast v0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;

    .line 175
    .line 176
    iget-object v15, v0, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;->f:Ljava/lang/String;

    .line 177
    .line 178
    new-instance v6, La/cn7;

    .line 179
    .line 180
    const-wide/16 v10, 0x0

    .line 181
    .line 182
    const-wide/16 v12, 0x0

    .line 183
    .line 184
    move-wide/from16 v8, p1

    .line 185
    .line 186
    move/from16 v7, p3

    .line 187
    .line 188
    invoke-direct/range {v6 .. v16}, La/cn7;-><init>(IJJJLjava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 189
    .line 190
    .line 191
    return-object v6

    .line 192
    :cond_9
    instance-of v1, v1, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;

    .line 193
    .line 194
    if-eqz v1, :cond_10

    .line 195
    .line 196
    sget-object v1, La/rv00;->k:La/rv00;

    .line 197
    .line 198
    sget-object v2, La/udj;->a:La/udj;

    .line 199
    .line 200
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_a

    .line 205
    .line 206
    add-int/lit8 v3, p5, -0x1

    .line 207
    .line 208
    int-to-long v5, v3

    .line 209
    const-wide/32 v7, 0x5265c00

    .line 210
    .line 211
    .line 212
    mul-long/2addr v5, v7

    .line 213
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 218
    .line 219
    .line 220
    move-result-wide v7

    .line 221
    sub-long/2addr v7, v5

    .line 222
    const/16 v3, 0xe

    .line 223
    .line 224
    invoke-static {v1, v7, v8, v3}, La/rv00;->n(La/rv00;JI)J

    .line 225
    .line 226
    .line 227
    move-result-wide v5

    .line 228
    const-wide/16 v7, 0x3e8

    .line 229
    .line 230
    div-long/2addr v5, v7

    .line 231
    :goto_6
    move-wide v10, v5

    .line 232
    goto :goto_7

    .line 233
    :cond_a
    instance-of v3, v0, La/tdj;

    .line 234
    .line 235
    if-eqz v3, :cond_b

    .line 236
    .line 237
    move-object v3, v0

    .line 238
    check-cast v3, La/tdj;

    .line 239
    .line 240
    iget-wide v5, v3, La/tdj;->a:J

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_b
    instance-of v3, v0, La/vdj;

    .line 244
    .line 245
    if-eqz v3, :cond_f

    .line 246
    .line 247
    move-object v3, v0

    .line 248
    check-cast v3, La/vdj;

    .line 249
    .line 250
    iget-wide v5, v3, La/vdj;->a:J

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :goto_7
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-eqz v2, :cond_c

    .line 258
    .line 259
    const-wide/16 v0, 0x0

    .line 260
    .line 261
    :goto_8
    move-wide v12, v0

    .line 262
    goto :goto_9

    .line 263
    :cond_c
    instance-of v2, v0, La/tdj;

    .line 264
    .line 265
    if-eqz v2, :cond_d

    .line 266
    .line 267
    check-cast v0, La/tdj;

    .line 268
    .line 269
    iget-wide v2, v0, La/tdj;->a:J

    .line 270
    .line 271
    const/16 v0, 0xc

    .line 272
    .line 273
    invoke-static {v1, v2, v3, v0}, La/rv00;->n(La/rv00;JI)J

    .line 274
    .line 275
    .line 276
    move-result-wide v0

    .line 277
    goto :goto_8

    .line 278
    :cond_d
    instance-of v1, v0, La/vdj;

    .line 279
    .line 280
    if-eqz v1, :cond_e

    .line 281
    .line 282
    check-cast v0, La/vdj;

    .line 283
    .line 284
    iget-wide v0, v0, La/vdj;->b:J

    .line 285
    .line 286
    goto :goto_8

    .line 287
    :goto_9
    new-instance v6, La/cn7;

    .line 288
    .line 289
    const-string v15, ""

    .line 290
    .line 291
    move-wide/from16 v8, p1

    .line 292
    .line 293
    move/from16 v7, p3

    .line 294
    .line 295
    invoke-direct/range {v6 .. v16}, La/cn7;-><init>(IJJJLjava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 296
    .line 297
    .line 298
    return-object v6

    .line 299
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 300
    .line 301
    .line 302
    return-object v4

    .line 303
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 304
    .line 305
    .line 306
    return-object v4

    .line 307
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 308
    .line 309
    .line 310
    return-object v4
.end method
