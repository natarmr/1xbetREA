.class public abstract La/kxs0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x2

    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-wide/16 v2, 0x24

    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    filled-new-array {v0, v1, v2}, [Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, La/kxs0;->a:Ljava/util/Set;

    .line 28
    .line 29
    return-void
.end method

.method public static final a(La/m9s;ZLjava/util/List;ZLa/ctf0;)La/v5m;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, La/m9s;->c:Ljava/util/List;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, v0, La/m9s;->d:Ljava/util/List;

    .line 9
    .line 10
    :goto_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/Long;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    :goto_1
    move-wide v4, v1

    .line 23
    goto :goto_2

    .line 24
    :cond_1
    const-wide/16 v1, 0x0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :goto_2
    if-eqz p1, :cond_2

    .line 28
    .line 29
    iget-object v1, v0, La/m9s;->m:Ljava/util/List;

    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_2
    iget-object v1, v0, La/m9s;->n:Ljava/util/List;

    .line 33
    .line 34
    :goto_3
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    const-string v1, ""

    .line 43
    .line 44
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-wide v2, v0, La/m9s;->o:J

    .line 48
    .line 49
    iget-object v6, v0, La/m9s;->I:La/cqg;

    .line 50
    .line 51
    instance-of v6, v6, La/qz7;

    .line 52
    .line 53
    const/4 v10, 0x1

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v11, 0x0

    .line 56
    if-nez v6, :cond_4

    .line 57
    .line 58
    move-object v12, v7

    .line 59
    goto :goto_7

    .line 60
    :cond_4
    if-nez p1, :cond_5

    .line 61
    .line 62
    const-string v6, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePigAvatar.png"

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_5
    const-string v6, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPigAvatar.png"

    .line 66
    .line 67
    :goto_4
    new-instance v8, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 70
    .line 71
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-nez v9, :cond_6

    .line 79
    .line 80
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_6
    sget-object v9, La/ujn;->h:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v6, v9, v11}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-nez v9, :cond_9

    .line 91
    .line 92
    const-string v9, "https://"

    .line 93
    .line 94
    invoke-static {v6, v9, v11}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_7

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_7
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    const/16 v12, 0x2f

    .line 106
    .line 107
    if-lez v9, :cond_8

    .line 108
    .line 109
    const-string v9, "/"

    .line 110
    .line 111
    invoke-static {v8, v9}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    if-nez v9, :cond_8

    .line 116
    .line 117
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    :cond_8
    new-array v9, v10, [C

    .line 121
    .line 122
    aput-char v12, v9, v11

    .line 123
    .line 124
    invoke-static {v6, v9}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_9
    :goto_5
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    :goto_6
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    move-object v12, v6

    .line 143
    :goto_7
    new-instance v13, La/v5m;

    .line 144
    .line 145
    if-eqz p1, :cond_a

    .line 146
    .line 147
    iget-object v6, v0, La/m9s;->i:Ljava/lang/String;

    .line 148
    .line 149
    goto :goto_8

    .line 150
    :cond_a
    iget-object v6, v0, La/m9s;->j:Ljava/lang/String;

    .line 151
    .line 152
    :goto_8
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    if-nez v8, :cond_b

    .line 157
    .line 158
    :goto_9
    move-object v14, v6

    .line 159
    goto :goto_b

    .line 160
    :cond_b
    iget-wide v8, v0, La/m9s;->A:J

    .line 161
    .line 162
    const-wide/32 v14, 0x1ffa7e

    .line 163
    .line 164
    .line 165
    cmp-long v8, v8, v14

    .line 166
    .line 167
    if-eqz v8, :cond_c

    .line 168
    .line 169
    goto :goto_9

    .line 170
    :cond_c
    if-eqz p1, :cond_d

    .line 171
    .line 172
    const v8, 0x7f130f92

    .line 173
    .line 174
    .line 175
    goto :goto_a

    .line 176
    :cond_d
    const v8, 0x7f130689

    .line 177
    .line 178
    .line 179
    :goto_a
    new-array v9, v11, [Ljava/lang/Object;

    .line 180
    .line 181
    move-object/from16 v14, p4

    .line 182
    .line 183
    iget-object v14, v14, La/ctf0;->b:La/lsm0;

    .line 184
    .line 185
    invoke-static {v9, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    invoke-virtual {v14, v8, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    const-string v9, " ("

    .line 194
    .line 195
    const-string v14, ")"

    .line 196
    .line 197
    invoke-static {v6, v9, v8, v14}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    goto :goto_9

    .line 202
    :goto_b
    new-instance v15, La/n0x;

    .line 203
    .line 204
    if-nez v12, :cond_e

    .line 205
    .line 206
    invoke-static {v4, v5, v1}, La/vsm0;->s(JLjava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    goto :goto_c

    .line 211
    :cond_e
    move-object v1, v12

    .line 212
    :goto_c
    invoke-direct {v15, v1}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    sget-object v1, La/jrg;->d:La/jrg;

    .line 216
    .line 217
    iget-wide v8, v1, La/yxg;->b:J

    .line 218
    .line 219
    cmp-long v1, v2, v8

    .line 220
    .line 221
    if-nez v1, :cond_f

    .line 222
    .line 223
    if-nez p1, :cond_f

    .line 224
    .line 225
    const v1, 0x7f080821

    .line 226
    .line 227
    .line 228
    goto :goto_d

    .line 229
    :cond_f
    sget v1, La/gql0;->a:I

    .line 230
    .line 231
    const-wide/16 v8, 0x11c

    .line 232
    .line 233
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 234
    .line 235
    .line 236
    move-result-object v16

    .line 237
    const-wide/16 v8, 0xec

    .line 238
    .line 239
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 240
    .line 241
    .line 242
    move-result-object v17

    .line 243
    const-wide/16 v8, 0x92

    .line 244
    .line 245
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 246
    .line 247
    .line 248
    move-result-object v18

    .line 249
    const-wide/16 v8, 0xeb

    .line 250
    .line 251
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 252
    .line 253
    .line 254
    move-result-object v19

    .line 255
    const-wide/16 v8, 0xa7

    .line 256
    .line 257
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 258
    .line 259
    .line 260
    move-result-object v20

    .line 261
    const-wide/16 v8, 0xea

    .line 262
    .line 263
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 264
    .line 265
    .line 266
    move-result-object v21

    .line 267
    const-wide/16 v8, 0x99

    .line 268
    .line 269
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 270
    .line 271
    .line 272
    move-result-object v22

    .line 273
    const-wide/16 v8, 0xf3

    .line 274
    .line 275
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 276
    .line 277
    .line 278
    move-result-object v23

    .line 279
    const-wide/16 v8, 0x102

    .line 280
    .line 281
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 282
    .line 283
    .line 284
    move-result-object v24

    .line 285
    const-wide/16 v8, 0x10c

    .line 286
    .line 287
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 288
    .line 289
    .line 290
    move-result-object v25

    .line 291
    const-wide/16 v8, 0x11f

    .line 292
    .line 293
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 294
    .line 295
    .line 296
    move-result-object v26

    .line 297
    const-wide/16 v8, 0x112

    .line 298
    .line 299
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 300
    .line 301
    .line 302
    move-result-object v27

    .line 303
    filled-new-array/range {v16 .. v27}, [Ljava/lang/Long;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-eqz v1, :cond_10

    .line 320
    .line 321
    const v1, 0x7f080b27

    .line 322
    .line 323
    .line 324
    goto :goto_d

    .line 325
    :cond_10
    iget-wide v1, v0, La/m9s;->p:J

    .line 326
    .line 327
    const-wide/16 v8, 0x1

    .line 328
    .line 329
    cmp-long v1, v1, v8

    .line 330
    .line 331
    if-nez v1, :cond_11

    .line 332
    .line 333
    const v1, 0x7f080cf8

    .line 334
    .line 335
    .line 336
    goto :goto_d

    .line 337
    :cond_11
    const v1, 0x7f080cf5

    .line 338
    .line 339
    .line 340
    :goto_d
    if-eqz p3, :cond_12

    .line 341
    .line 342
    iget-wide v6, v0, La/m9s;->o:J

    .line 343
    .line 344
    iget-wide v8, v0, La/m9s;->p:J

    .line 345
    .line 346
    move-object/from16 v3, p2

    .line 347
    .line 348
    invoke-static/range {v3 .. v9}, La/jpm0;->i(Ljava/util/List;JJJ)Z

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 353
    .line 354
    .line 355
    move-result-object v7

    .line 356
    :cond_12
    move-object v9, v7

    .line 357
    if-eqz v12, :cond_13

    .line 358
    .line 359
    :goto_e
    move v8, v1

    .line 360
    move-object v3, v13

    .line 361
    move-object v6, v14

    .line 362
    move-object v7, v15

    .line 363
    goto :goto_f

    .line 364
    :cond_13
    move v10, v11

    .line 365
    goto :goto_e

    .line 366
    :goto_f
    invoke-direct/range {v3 .. v10}, La/v5m;-><init>(JLjava/lang/String;La/o0x;ILjava/lang/Boolean;Z)V

    .line 367
    .line 368
    .line 369
    return-object v3
.end method

.method public static final b(La/m9s;La/la30;)La/l6m;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-byte p1, p1, La/la30;->a:B

    .line 5
    .line 6
    move v2, p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v0

    .line 9
    :goto_0
    const/4 p1, 0x1

    .line 10
    if-gt p1, v2, :cond_8

    .line 11
    .line 12
    const/16 p1, 0x8

    .line 13
    .line 14
    if-ge v2, p1, :cond_8

    .line 15
    .line 16
    new-instance v1, La/l6m;

    .line 17
    .line 18
    iget-object p1, p0, La/m9s;->h:La/qqs;

    .line 19
    .line 20
    iget p1, p1, La/qqs;->d:I

    .line 21
    .line 22
    invoke-static {p1, v0, v2}, La/l1e0;->d(III)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iget-object p1, p0, La/m9s;->h:La/qqs;

    .line 27
    .line 28
    iget p1, p1, La/qqs;->e:I

    .line 29
    .line 30
    invoke-static {p1, v0, v2}, La/l1e0;->d(III)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    iget-wide p0, p0, La/m9s;->p:J

    .line 35
    .line 36
    sget-object v0, La/zwg;->d:La/zwg;

    .line 37
    .line 38
    iget-wide v5, v0, La/yxg;->b:J

    .line 39
    .line 40
    cmp-long v0, p0, v5

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    sget-wide p0, La/ijg;->y0:J

    .line 45
    .line 46
    :goto_1
    move-wide v5, p0

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-wide/16 v5, 0x1

    .line 49
    .line 50
    cmp-long v0, p0, v5

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    sget-wide p0, La/ijg;->l0:J

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const-wide/16 v5, 0x28

    .line 58
    .line 59
    cmp-long v0, p0, v5

    .line 60
    .line 61
    if-eqz v0, :cond_7

    .line 62
    .line 63
    const-wide/16 v5, 0x2

    .line 64
    .line 65
    cmp-long v0, p0, v5

    .line 66
    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    const-wide/16 v5, 0x2e

    .line 71
    .line 72
    cmp-long v0, p0, v5

    .line 73
    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    sget-wide p0, La/ijg;->M:J

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    const-wide/16 v5, 0x1b

    .line 80
    .line 81
    cmp-long v0, p0, v5

    .line 82
    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    sget-wide p0, La/ijg;->U:J

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    const-wide/16 v5, 0xf

    .line 89
    .line 90
    cmp-long p0, p0, v5

    .line 91
    .line 92
    if-nez p0, :cond_6

    .line 93
    .line 94
    sget-wide p0, La/ijg;->l1:J

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_6
    sget-wide p0, La/ijg;->H0:J

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_7
    :goto_2
    sget-wide p0, La/ijg;->l1:J

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :goto_3
    invoke-direct/range {v1 .. v6}, La/l6m;-><init>(IIIJ)V

    .line 104
    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_8
    const/4 p0, 0x0

    .line 108
    return-object p0
.end method
