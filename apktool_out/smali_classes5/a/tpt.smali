.class public final La/tpt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:J


# instance fields
.field public final a:La/j910;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/wen;->b:La/uen;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    sget-object v1, La/bfn;->e:La/bfn;

    .line 5
    .line 6
    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sput-wide v0, La/tpt;->b:J

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(La/j910;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/tpt;->a:La/j910;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/io/Serializable;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, La/spt;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/spt;

    .line 11
    .line 12
    iget v3, v2, La/spt;->q:I

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
    iput v3, v2, La/spt;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/spt;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/spt;-><init>(La/tpt;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/spt;->o:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/spt;->q:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/spt;->m:I

    .line 47
    .line 48
    iget v10, v2, La/spt;->l:I

    .line 49
    .line 50
    iget v11, v2, La/spt;->k:I

    .line 51
    .line 52
    iget-wide v12, v2, La/spt;->j:J

    .line 53
    .line 54
    iget-wide v14, v2, La/spt;->i:J

    .line 55
    .line 56
    const/16 p1, 0x0

    .line 57
    .line 58
    iget-object v7, v2, La/spt;->n:Ljava/lang/Throwable;

    .line 59
    .line 60
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move v0, v4

    .line 64
    move v4, v10

    .line 65
    move-wide/from16 v16, v14

    .line 66
    .line 67
    move-object v14, v7

    .line 68
    move v7, v11

    .line 69
    move-wide v10, v12

    .line 70
    move-wide/from16 v12, v16

    .line 71
    .line 72
    goto/16 :goto_6

    .line 73
    .line 74
    :cond_1
    const/16 p1, 0x0

    .line 75
    .line 76
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_2
    const/16 p1, 0x0

    .line 83
    .line 84
    iget v4, v2, La/spt;->m:I

    .line 85
    .line 86
    iget v7, v2, La/spt;->l:I

    .line 87
    .line 88
    iget v10, v2, La/spt;->k:I

    .line 89
    .line 90
    iget-wide v11, v2, La/spt;->j:J

    .line 91
    .line 92
    iget-wide v13, v2, La/spt;->i:J

    .line 93
    .line 94
    iget-object v15, v2, La/spt;->n:Ljava/lang/Throwable;

    .line 95
    .line 96
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    move v0, v4

    .line 100
    move v4, v7

    .line 101
    move v7, v10

    .line 102
    move-wide v10, v11

    .line 103
    move-wide v12, v13

    .line 104
    move-object v14, v15

    .line 105
    goto/16 :goto_6

    .line 106
    .line 107
    :cond_3
    const/16 p1, 0x0

    .line 108
    .line 109
    iget v4, v2, La/spt;->l:I

    .line 110
    .line 111
    iget v7, v2, La/spt;->k:I

    .line 112
    .line 113
    iget-wide v10, v2, La/spt;->j:J

    .line 114
    .line 115
    iget-wide v12, v2, La/spt;->i:J

    .line 116
    .line 117
    iget-object v14, v2, La/spt;->n:Ljava/lang/Throwable;

    .line 118
    .line 119
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    goto :goto_4

    .line 125
    :cond_4
    const/16 p1, 0x0

    .line 126
    .line 127
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    const-wide/16 v10, 0x3

    .line 131
    .line 132
    sget-wide v12, La/tpt;->b:J

    .line 133
    .line 134
    move-wide/from16 v16, v12

    .line 135
    .line 136
    move-wide v12, v10

    .line 137
    move-wide/from16 v10, v16

    .line 138
    .line 139
    move-object/from16 v14, p1

    .line 140
    .line 141
    move v0, v9

    .line 142
    const/4 v4, 0x0

    .line 143
    const/4 v7, 0x0

    .line 144
    :goto_1
    if-eqz v0, :cond_10

    .line 145
    .line 146
    :try_start_1
    iget-object v15, v1, La/tpt;->a:La/j910;

    .line 147
    .line 148
    iput-object v14, v2, La/spt;->n:Ljava/lang/Throwable;

    .line 149
    .line 150
    iput-wide v12, v2, La/spt;->i:J

    .line 151
    .line 152
    iput-wide v10, v2, La/spt;->j:J

    .line 153
    .line 154
    iput v7, v2, La/spt;->k:I

    .line 155
    .line 156
    iput v4, v2, La/spt;->l:I

    .line 157
    .line 158
    iput v0, v2, La/spt;->m:I

    .line 159
    .line 160
    iput v9, v2, La/spt;->q:I

    .line 161
    .line 162
    invoke-virtual {v15, v2}, La/j910;->i(La/zje;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-ne v0, v3, :cond_5

    .line 167
    .line 168
    goto/16 :goto_9

    .line 169
    .line 170
    :cond_5
    :goto_2
    check-cast v0, La/kf3;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    .line 172
    iget-object v1, v0, La/kf3;->b:Ljava/lang/String;

    .line 173
    .line 174
    iget-object v0, v0, La/kf3;->c:Ljava/lang/String;

    .line 175
    .line 176
    filled-new-array {v1, v0}, [Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    new-instance v1, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v2, :cond_7

    .line 198
    .line 199
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    move-object v3, v2

    .line 204
    check-cast v3, Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-lez v3, :cond_6

    .line 211
    .line 212
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_7
    return-object v1

    .line 217
    :goto_4
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 218
    .line 219
    .line 220
    move-result v15

    .line 221
    if-eqz v15, :cond_c

    .line 222
    .line 223
    if-nez v7, :cond_8

    .line 224
    .line 225
    new-instance v14, La/el50;

    .line 226
    .line 227
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 228
    .line 229
    .line 230
    const/4 v0, 0x0

    .line 231
    goto :goto_1

    .line 232
    :cond_8
    int-to-long v8, v4

    .line 233
    cmp-long v8, v8, v12

    .line 234
    .line 235
    if-gez v8, :cond_9

    .line 236
    .line 237
    const/4 v8, 0x1

    .line 238
    goto :goto_5

    .line 239
    :cond_9
    const/4 v8, 0x0

    .line 240
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 241
    .line 242
    if-eqz v8, :cond_a

    .line 243
    .line 244
    iput-object v14, v2, La/spt;->n:Ljava/lang/Throwable;

    .line 245
    .line 246
    iput-wide v12, v2, La/spt;->i:J

    .line 247
    .line 248
    iput-wide v10, v2, La/spt;->j:J

    .line 249
    .line 250
    iput v7, v2, La/spt;->k:I

    .line 251
    .line 252
    iput v4, v2, La/spt;->l:I

    .line 253
    .line 254
    iput v8, v2, La/spt;->m:I

    .line 255
    .line 256
    iput v6, v2, La/spt;->q:I

    .line 257
    .line 258
    invoke-static {v10, v11, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    if-ne v0, v3, :cond_b

    .line 263
    .line 264
    goto :goto_9

    .line 265
    :goto_6
    const/4 v9, 0x1

    .line 266
    goto :goto_1

    .line 267
    :cond_a
    new-instance v14, La/el50;

    .line 268
    .line 269
    invoke-direct {v14, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    :cond_b
    :goto_7
    move v0, v8

    .line 273
    goto :goto_6

    .line 274
    :cond_c
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 275
    .line 276
    .line 277
    move-result v8

    .line 278
    if-eqz v8, :cond_f

    .line 279
    .line 280
    int-to-long v8, v4

    .line 281
    cmp-long v8, v8, v12

    .line 282
    .line 283
    if-gez v8, :cond_d

    .line 284
    .line 285
    const/4 v8, 0x1

    .line 286
    goto :goto_8

    .line 287
    :cond_d
    const/4 v8, 0x0

    .line 288
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 289
    .line 290
    if-eqz v8, :cond_e

    .line 291
    .line 292
    iput-object v14, v2, La/spt;->n:Ljava/lang/Throwable;

    .line 293
    .line 294
    iput-wide v12, v2, La/spt;->i:J

    .line 295
    .line 296
    iput-wide v10, v2, La/spt;->j:J

    .line 297
    .line 298
    iput v7, v2, La/spt;->k:I

    .line 299
    .line 300
    iput v4, v2, La/spt;->l:I

    .line 301
    .line 302
    iput v8, v2, La/spt;->m:I

    .line 303
    .line 304
    iput v5, v2, La/spt;->q:I

    .line 305
    .line 306
    invoke-static {v10, v11, v2}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    if-ne v0, v3, :cond_b

    .line 311
    .line 312
    :goto_9
    return-object v3

    .line 313
    :cond_e
    new-instance v14, La/dag0;

    .line 314
    .line 315
    invoke-direct {v14, v0}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 316
    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_f
    invoke-static {v0}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 320
    .line 321
    .line 322
    move-object v14, v0

    .line 323
    const/4 v0, 0x0

    .line 324
    goto :goto_6

    .line 325
    :cond_10
    if-nez v14, :cond_11

    .line 326
    .line 327
    const-string v0, "Unexpected error"

    .line 328
    .line 329
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    return-object p1

    .line 333
    :cond_11
    throw v14
.end method
