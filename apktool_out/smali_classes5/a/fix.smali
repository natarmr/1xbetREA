.class public final La/fix;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ocl;

.field public final b:La/ugx;

.field public final c:La/us3;

.field public final d:La/knf0;


# direct methods
.method public constructor <init>(La/ocl;La/ugx;La/us3;La/knf0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/fix;->a:La/ocl;

    .line 14
    .line 15
    iput-object p2, p0, La/fix;->b:La/ugx;

    .line 16
    .line 17
    iput-object p3, p0, La/fix;->c:La/us3;

    .line 18
    .line 19
    iput-object p4, p0, La/fix;->d:La/knf0;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(La/gix;La/zje;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, La/fix;->d:La/knf0;

    .line 8
    .line 9
    instance-of v4, v2, La/eix;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v2

    .line 14
    check-cast v4, La/eix;

    .line 15
    .line 16
    iget v5, v4, La/eix;->m:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, La/eix;->m:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, La/eix;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2}, La/eix;-><init>(La/fix;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v2, v4, La/eix;->k:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v6, v4, La/eix;->m:I

    .line 38
    .line 39
    iget-object v7, v0, La/fix;->b:La/ugx;

    .line 40
    .line 41
    const/4 v8, 0x3

    .line 42
    const/4 v9, 0x2

    .line 43
    const/4 v10, 0x1

    .line 44
    const/4 v11, 0x0

    .line 45
    if-eqz v6, :cond_4

    .line 46
    .line 47
    if-eq v6, v10, :cond_3

    .line 48
    .line 49
    if-eq v6, v9, :cond_2

    .line 50
    .line 51
    if-ne v6, v8, :cond_1

    .line 52
    .line 53
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_a

    .line 57
    .line 58
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v11

    .line 64
    :cond_2
    iget-object v0, v4, La/eix;->j:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_6

    .line 70
    .line 71
    :cond_3
    iget-object v0, v4, La/eix;->j:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, La/fix;

    .line 74
    .line 75
    iget-object v1, v4, La/eix;->i:La/gix;

    .line 76
    .line 77
    :try_start_0
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    goto/16 :goto_3

    .line 83
    .line 84
    :cond_4
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :try_start_1
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 88
    .line 89
    iget-object v2, v0, La/fix;->a:La/ocl;

    .line 90
    .line 91
    iget-wide v12, v1, La/gix;->b:J

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-wide v15, v12

    .line 97
    invoke-virtual {v3}, La/knf0;->b()I

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    iget v12, v1, La/gix;->e:I

    .line 102
    .line 103
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v19

    .line 107
    iget v14, v1, La/gix;->g:I

    .line 108
    .line 109
    iget-boolean v3, v1, La/gix;->d:Z

    .line 110
    .line 111
    iget-wide v8, v1, La/gix;->c:J

    .line 112
    .line 113
    move/from16 v20, v3

    .line 114
    .line 115
    move-wide/from16 v17, v8

    .line 116
    .line 117
    invoke-static/range {v12 .. v20}, La/s0x;->O(IIIJJLjava/lang/String;Z)Ljava/util/LinkedHashMap;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    iput-object v1, v4, La/eix;->i:La/gix;

    .line 122
    .line 123
    iput-object v0, v4, La/eix;->j:Ljava/lang/Object;

    .line 124
    .line 125
    iput v10, v4, La/eix;->m:I

    .line 126
    .line 127
    iget-object v2, v2, La/ocl;->a:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, La/wgn;

    .line 130
    .line 131
    invoke-virtual {v2}, La/wgn;->invoke()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, La/tgs;

    .line 136
    .line 137
    invoke-interface {v2, v3, v4}, La/tgs;->a(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    if-ne v2, v5, :cond_5

    .line 142
    .line 143
    goto/16 :goto_9

    .line 144
    .line 145
    :cond_5
    :goto_1
    check-cast v2, La/dx5;

    .line 146
    .line 147
    invoke-virtual {v2}, La/dx5;->a()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, Ljava/lang/Iterable;

    .line 152
    .line 153
    new-instance v3, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-eqz v8, :cond_6

    .line 167
    .line 168
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    move-object v12, v8

    .line 173
    check-cast v12, La/wgs;

    .line 174
    .line 175
    iget-wide v13, v1, La/gix;->b:J

    .line 176
    .line 177
    iget-wide v8, v1, La/gix;->a:J

    .line 178
    .line 179
    iget-object v10, v0, La/fix;->c:La/us3;

    .line 180
    .line 181
    invoke-virtual {v10}, La/us3;->a()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v15

    .line 185
    move-wide/from16 v16, v8

    .line 186
    .line 187
    invoke-static/range {v12 .. v17}, La/j0x;->L(La/wgs;JLjava/lang/String;J)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    invoke-static {v3, v8}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_6
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 196
    .line 197
    move-object v0, v3

    .line 198
    goto :goto_4

    .line 199
    :goto_3
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 200
    .line 201
    new-instance v1, La/g0g0;

    .line 202
    .line 203
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 204
    .line 205
    .line 206
    move-object v0, v1

    .line 207
    :goto_4
    nop

    .line 208
    instance-of v1, v0, La/g0g0;

    .line 209
    .line 210
    if-nez v1, :cond_8

    .line 211
    .line 212
    move-object v1, v0

    .line 213
    check-cast v1, Ljava/util/List;

    .line 214
    .line 215
    iput-object v11, v4, La/eix;->i:La/gix;

    .line 216
    .line 217
    iput-object v0, v4, La/eix;->j:Ljava/lang/Object;

    .line 218
    .line 219
    const/4 v6, 0x2

    .line 220
    iput v6, v4, La/eix;->m:I

    .line 221
    .line 222
    iget-object v2, v7, La/ugx;->b:La/qoj0;

    .line 223
    .line 224
    invoke-virtual {v2, v1, v4}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    sget-object v2, La/wne;->a:La/wne;

    .line 229
    .line 230
    if-ne v1, v2, :cond_7

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_7
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    :goto_5
    if-ne v1, v5, :cond_8

    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_8
    :goto_6
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    if-eqz v1, :cond_c

    .line 243
    .line 244
    instance-of v2, v1, La/zhi0;

    .line 245
    .line 246
    if-eqz v2, :cond_a

    .line 247
    .line 248
    move-object v2, v1

    .line 249
    check-cast v2, La/zhi0;

    .line 250
    .line 251
    iget-object v2, v2, La/zhi0;->c:La/kuw;

    .line 252
    .line 253
    sget-object v3, La/i2o;->D2:La/i2o;

    .line 254
    .line 255
    if-eq v2, v3, :cond_9

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_9
    throw v1

    .line 259
    :cond_a
    :goto_7
    sget-object v1, La/iun;->a:La/iun;

    .line 260
    .line 261
    iput-object v11, v4, La/eix;->i:La/gix;

    .line 262
    .line 263
    iput-object v0, v4, La/eix;->j:Ljava/lang/Object;

    .line 264
    .line 265
    const/4 v2, 0x3

    .line 266
    iput v2, v4, La/eix;->m:I

    .line 267
    .line 268
    iget-object v0, v7, La/ugx;->b:La/qoj0;

    .line 269
    .line 270
    invoke-virtual {v0, v1, v4}, La/qoj0;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    sget-object v1, La/wne;->a:La/wne;

    .line 275
    .line 276
    if-ne v0, v1, :cond_b

    .line 277
    .line 278
    goto :goto_8

    .line 279
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    :goto_8
    if-ne v0, v5, :cond_c

    .line 282
    .line 283
    :goto_9
    return-object v5

    .line 284
    :cond_c
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    return-object v0
.end method
