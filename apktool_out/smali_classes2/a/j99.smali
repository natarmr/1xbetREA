.class public final La/j99;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nvu0;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:La/n5a;

.field public final synthetic c:La/q99;


# direct methods
.method public constructor <init>(La/q99;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/j99;->c:La/q99;

    .line 5
    .line 6
    sget-object p1, La/s99;->p:La/pfw;

    .line 7
    .line 8
    iput-object p1, p0, La/j99;->a:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(La/wvh0;I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/j99;->b:La/n5a;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/n5a;->a(La/wvh0;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final b(La/zje;)Ljava/lang/Object;
    .locals 15

    .line 1
    iget-object v0, p0, La/j99;->a:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, La/s99;->p:La/pfw;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, La/s99;->l:La/pfw;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_0
    sget-object v0, La/q99;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 15
    .line 16
    iget-object v6, p0, La/j99;->c:La/q99;

    .line 17
    .line 18
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, La/aub;

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v6}, La/q99;->z()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    sget-object v0, La/s99;->l:La/pfw;

    .line 31
    .line 32
    iput-object v0, p0, La/j99;->a:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v6}, La/q99;->q()Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_1
    sget v1, La/yul0;->a:I

    .line 44
    .line 45
    throw v0

    .line 46
    :cond_2
    sget-object v1, La/q99;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 47
    .line 48
    invoke-virtual {v1, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    sget v1, La/s99;->b:I

    .line 53
    .line 54
    int-to-long v7, v1

    .line 55
    div-long v9, v3, v7

    .line 56
    .line 57
    rem-long v7, v3, v7

    .line 58
    .line 59
    long-to-int v8, v7

    .line 60
    iget-wide v11, v0, La/wvh0;->d:J

    .line 61
    .line 62
    cmp-long v1, v11, v9

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    invoke-virtual {v6, v9, v10, v0}, La/q99;->n(JLa/aub;)La/aub;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-nez v1, :cond_4

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move-object v1, v0

    .line 74
    :cond_4
    const/4 v11, 0x0

    .line 75
    move-object v7, v1

    .line 76
    move-wide v9, v3

    .line 77
    invoke-virtual/range {v6 .. v11}, La/q99;->M(La/aub;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v7, La/s99;->m:La/pfw;

    .line 82
    .line 83
    const/4 v9, 0x0

    .line 84
    if-eq v0, v7, :cond_14

    .line 85
    .line 86
    sget-object v10, La/s99;->o:La/pfw;

    .line 87
    .line 88
    if-ne v0, v10, :cond_6

    .line 89
    .line 90
    invoke-virtual {v6}, La/q99;->v()J

    .line 91
    .line 92
    .line 93
    move-result-wide v7

    .line 94
    cmp-long v0, v3, v7

    .line 95
    .line 96
    if-gez v0, :cond_5

    .line 97
    .line 98
    invoke-virtual {v1}, La/tqd;->a()V

    .line 99
    .line 100
    .line 101
    :cond_5
    move-object v0, v1

    .line 102
    goto :goto_0

    .line 103
    :cond_6
    sget-object v11, La/s99;->n:La/pfw;

    .line 104
    .line 105
    if-ne v0, v11, :cond_13

    .line 106
    .line 107
    iget-object v0, p0, La/j99;->c:La/q99;

    .line 108
    .line 109
    invoke-static/range {p1 .. p1}, La/pnx;->b(La/yje;)La/yje;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v2}, La/rq8;->Q(La/yje;)La/n5a;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    :try_start_0
    iput-object v11, p0, La/j99;->b:La/n5a;

    .line 118
    .line 119
    move-object v5, p0

    .line 120
    move v2, v8

    .line 121
    invoke-virtual/range {v0 .. v5}, La/q99;->M(La/aub;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    iget-object v12, v0, La/q99;->b:Lkotlin/jvm/functions/Function1;

    .line 126
    .line 127
    if-ne v8, v7, :cond_7

    .line 128
    .line 129
    invoke-virtual {p0, v1, v2}, La/j99;->a(La/wvh0;I)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_3

    .line 133
    .line 134
    :catchall_0
    move-exception v0

    .line 135
    goto/16 :goto_4

    .line 136
    .line 137
    :cond_7
    if-ne v8, v10, :cond_12

    .line 138
    .line 139
    invoke-virtual {v0}, La/q99;->v()J

    .line 140
    .line 141
    .line 142
    move-result-wide v13

    .line 143
    cmp-long v2, v3, v13

    .line 144
    .line 145
    if-gez v2, :cond_8

    .line 146
    .line 147
    invoke-virtual {v1}, La/tqd;->a()V

    .line 148
    .line 149
    .line 150
    :cond_8
    sget-object v1, La/q99;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 151
    .line 152
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, La/aub;

    .line 157
    .line 158
    :cond_9
    :goto_1
    invoke-virtual {v0}, La/q99;->z()Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_b

    .line 163
    .line 164
    iget-object v0, p0, La/j99;->b:La/n5a;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iput-object v9, p0, La/j99;->b:La/n5a;

    .line 170
    .line 171
    sget-object v1, La/s99;->l:La/pfw;

    .line 172
    .line 173
    iput-object v1, p0, La/j99;->a:Ljava/lang/Object;

    .line 174
    .line 175
    invoke-virtual {v6}, La/q99;->q()Ljava/lang/Throwable;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    if-nez v1, :cond_a

    .line 180
    .line 181
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 182
    .line 183
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-virtual {v0, v1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_3

    .line 189
    .line 190
    :cond_a
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 191
    .line 192
    new-instance v2, La/g0g0;

    .line 193
    .line 194
    invoke-direct {v2, v1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v2}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_3

    .line 201
    .line 202
    :cond_b
    sget-object v2, La/q99;->e:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 203
    .line 204
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 205
    .line 206
    .line 207
    move-result-wide v3

    .line 208
    sget v2, La/s99;->b:I

    .line 209
    .line 210
    int-to-long v13, v2

    .line 211
    div-long v7, v3, v13

    .line 212
    .line 213
    rem-long v13, v3, v13

    .line 214
    .line 215
    long-to-int v2, v13

    .line 216
    iget-wide v13, v1, La/wvh0;->d:J

    .line 217
    .line 218
    cmp-long v10, v13, v7

    .line 219
    .line 220
    if-eqz v10, :cond_d

    .line 221
    .line 222
    invoke-virtual {v0, v7, v8, v1}, La/q99;->n(JLa/aub;)La/aub;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    if-nez v7, :cond_c

    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_c
    move-object v1, v7

    .line 230
    :cond_d
    move-object v5, p0

    .line 231
    invoke-virtual/range {v0 .. v5}, La/q99;->M(La/aub;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    sget-object v8, La/s99;->m:La/pfw;

    .line 236
    .line 237
    if-ne v7, v8, :cond_e

    .line 238
    .line 239
    invoke-virtual {p0, v1, v2}, La/j99;->a(La/wvh0;I)V

    .line 240
    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_e
    sget-object v2, La/s99;->o:La/pfw;

    .line 244
    .line 245
    if-ne v7, v2, :cond_f

    .line 246
    .line 247
    invoke-virtual {v0}, La/q99;->v()J

    .line 248
    .line 249
    .line 250
    move-result-wide v7

    .line 251
    cmp-long v2, v3, v7

    .line 252
    .line 253
    if-gez v2, :cond_9

    .line 254
    .line 255
    invoke-virtual {v1}, La/tqd;->a()V

    .line 256
    .line 257
    .line 258
    goto :goto_1

    .line 259
    :cond_f
    sget-object v0, La/s99;->n:La/pfw;

    .line 260
    .line 261
    if-eq v7, v0, :cond_11

    .line 262
    .line 263
    invoke-virtual {v1}, La/tqd;->a()V

    .line 264
    .line 265
    .line 266
    iput-object v7, p0, La/j99;->a:Ljava/lang/Object;

    .line 267
    .line 268
    iput-object v9, p0, La/j99;->b:La/n5a;

    .line 269
    .line 270
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 271
    .line 272
    if-eqz v12, :cond_10

    .line 273
    .line 274
    new-instance v9, La/ab4;

    .line 275
    .line 276
    const/16 v1, 0x10

    .line 277
    .line 278
    invoke-direct {v9, v1, v7, v12}, La/ab4;-><init>(BLjava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 279
    .line 280
    .line 281
    :cond_10
    :goto_2
    invoke-virtual {v11, v0, v9}, La/n5a;->v(Ljava/lang/Object;La/xdr;)V

    .line 282
    .line 283
    .line 284
    goto :goto_3

    .line 285
    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 286
    .line 287
    const-string v1, "unexpected"

    .line 288
    .line 289
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    throw v0

    .line 293
    :cond_12
    invoke-virtual {v1}, La/tqd;->a()V

    .line 294
    .line 295
    .line 296
    iput-object v8, p0, La/j99;->a:Ljava/lang/Object;

    .line 297
    .line 298
    iput-object v9, p0, La/j99;->b:La/n5a;

    .line 299
    .line 300
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 301
    .line 302
    if-eqz v12, :cond_10

    .line 303
    .line 304
    new-instance v9, La/ab4;

    .line 305
    .line 306
    const/16 v1, 0x10

    .line 307
    .line 308
    invoke-direct {v9, v1, v8, v12}, La/ab4;-><init>(BLjava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 309
    .line 310
    .line 311
    goto :goto_2

    .line 312
    :goto_3
    invoke-virtual {v11}, La/n5a;->p()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    sget-object v1, La/wne;->a:La/wne;

    .line 317
    .line 318
    return-object v0

    .line 319
    :goto_4
    invoke-virtual {v11}, La/n5a;->B()V

    .line 320
    .line 321
    .line 322
    throw v0

    .line 323
    :cond_13
    invoke-virtual {v1}, La/tqd;->a()V

    .line 324
    .line 325
    .line 326
    iput-object v0, p0, La/j99;->a:Ljava/lang/Object;

    .line 327
    .line 328
    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    return-object v0

    .line 333
    :cond_14
    const-string v0, "unreachable"

    .line 334
    .line 335
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    return-object v9
.end method

.method public final c()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La/j99;->a:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, La/s99;->p:La/pfw;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    iput-object v1, p0, La/j99;->a:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v1, La/s99;->l:La/pfw;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object p0, p0, La/j99;->c:La/q99;

    .line 15
    .line 16
    invoke-virtual {p0}, La/q99;->s()Ljava/lang/Throwable;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget v0, La/yul0;->a:I

    .line 21
    .line 22
    throw p0

    .line 23
    :cond_1
    const-string p0, "`hasNext()` has not been invoked"

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method
