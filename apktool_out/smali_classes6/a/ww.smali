.class public final La/ww;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic B:I


# instance fields
.field public A:La/bby;

.field public final o:La/zg;

.field public final p:La/mne;

.field public final q:La/rou;

.field public final r:La/nr;

.field public final s:La/m0u;

.field public final t:La/ctf0;

.field public final u:La/h0q0;

.field public final v:La/a7q;

.field public final w:La/je;

.field public final x:La/i1w0;

.field public y:La/bby;

.field public z:La/bby;


# direct methods
.method public constructor <init>(La/zg;La/mne;La/rou;La/nr;La/m0u;La/ctf0;La/h0q0;La/a7q;La/je;La/i1w0;)V
    .locals 4

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p2, La/mne;->c:La/vs10;

    .line 5
    .line 6
    iget-object v1, p2, La/mne;->a:La/rwj;

    .line 7
    .line 8
    invoke-static {v0, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/q8;

    .line 13
    .line 14
    const/16 v2, 0x11

    .line 15
    .line 16
    invoke-direct {v1, v2}, La/q8;-><init>(B)V

    .line 17
    .line 18
    .line 19
    new-instance v2, La/uc;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    invoke-direct {v2, p6, v3}, La/uc;-><init>(La/ctf0;B)V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {p0, v1, v0, v2, v3}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/ww;->o:La/zg;

    .line 30
    .line 31
    iput-object p2, p0, La/ww;->p:La/mne;

    .line 32
    .line 33
    iput-object p3, p0, La/ww;->q:La/rou;

    .line 34
    .line 35
    iput-object p4, p0, La/ww;->r:La/nr;

    .line 36
    .line 37
    iput-object p5, p0, La/ww;->s:La/m0u;

    .line 38
    .line 39
    iput-object p6, p0, La/ww;->t:La/ctf0;

    .line 40
    .line 41
    iput-object p7, p0, La/ww;->u:La/h0q0;

    .line 42
    .line 43
    iput-object p8, p0, La/ww;->v:La/a7q;

    .line 44
    .line 45
    iput-object p9, p0, La/ww;->w:La/je;

    .line 46
    .line 47
    iput-object p10, p0, La/ww;->x:La/i1w0;

    .line 48
    .line 49
    return-void
.end method

.method public static M(La/ww;La/t0;Lkotlin/jvm/functions/Function1;I)La/bby;
    .locals 12

    .line 1
    iget-object v0, p0, La/ww;->p:La/mne;

    .line 2
    .line 3
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 4
    .line 5
    and-int/lit8 p3, p3, 0x2

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    sget-object p1, La/vw;->a:La/vw;

    .line 10
    .line 11
    :cond_0
    iget-object p3, p0, La/i3t0;->i:La/ocj;

    .line 12
    .line 13
    iget-object p3, p3, La/ocj;->a:La/p7m0;

    .line 14
    .line 15
    :cond_1
    invoke-virtual {p3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 23
    .line 24
    move-object v3, v1

    .line 25
    check-cast v3, La/lw;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    const/16 v11, 0x7e

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x0

    .line 39
    invoke-static/range {v3 .. v11}, La/lw;->a(La/lw;ZLa/xuf;ZZLjava/lang/String;Ljava/lang/String;ZI)La/lw;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {p3, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    new-instance p3, La/za;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    const/4 v2, 0x5

    .line 53
    invoke-direct {p3, p2, p0, v1, v2}, La/za;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0, p1, p3}, La/i3t0;->I(La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/bby;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 14

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/xv;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-super {p0, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    instance-of v2, v0, La/uv;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, La/ww;->x:La/i1w0;

    .line 16
    .line 17
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, La/c8d;

    .line 22
    .line 23
    sget-object v4, La/y7d;->a:La/v7d;

    .line 24
    .line 25
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 26
    .line 27
    invoke-direct {v2, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2, v0, v1, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    move-object v2, v1

    .line 35
    check-cast v2, La/paw;

    .line 36
    .line 37
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_e

    .line 42
    .line 43
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, La/oe50;

    .line 48
    .line 49
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    instance-of v2, v0, La/vv;

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x1

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    iget-object v0, p0, La/ww;->A:La/bby;

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-ne v0, v9, :cond_1

    .line 68
    .line 69
    goto/16 :goto_5

    .line 70
    .line 71
    :cond_1
    iget-object v0, p0, La/ww;->p:La/mne;

    .line 72
    .line 73
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 74
    .line 75
    new-instance v2, La/tw;

    .line 76
    .line 77
    invoke-direct {v2, p0, v8, v3}, La/tw;-><init>(La/diu0;La/yje;B)V

    .line 78
    .line 79
    .line 80
    const/4 v3, 0x2

    .line 81
    invoke-static {p0, v0, v8, v2, v3}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, La/ww;->A:La/bby;

    .line 86
    .line 87
    return-void

    .line 88
    :cond_2
    instance-of v2, v0, La/tv;

    .line 89
    .line 90
    const v4, 0x7f1317d7

    .line 91
    .line 92
    .line 93
    iget-object v5, p0, La/ww;->t:La/ctf0;

    .line 94
    .line 95
    const/16 v6, 0x1e

    .line 96
    .line 97
    if-eqz v2, :cond_7

    .line 98
    .line 99
    check-cast v0, La/tv;

    .line 100
    .line 101
    iget-object v0, v0, La/tv;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-le v0, v6, :cond_4

    .line 116
    .line 117
    new-array v0, v3, [Ljava/lang/Object;

    .line 118
    .line 119
    iget-object v2, v5, La/ctf0;->b:La/lsm0;

    .line 120
    .line 121
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v2, v4, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 130
    .line 131
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 132
    .line 133
    :goto_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-object v5, v2

    .line 141
    check-cast v5, La/lw;

    .line 142
    .line 143
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    const/4 v12, 0x0

    .line 149
    const/16 v13, 0x27

    .line 150
    .line 151
    const/4 v6, 0x0

    .line 152
    const/4 v7, 0x0

    .line 153
    const/4 v8, 0x0

    .line 154
    const/4 v9, 0x1

    .line 155
    const/4 v11, 0x0

    .line 156
    invoke-static/range {v5 .. v13}, La/lw;->a(La/lw;ZLa/xuf;ZZLjava/lang/String;Ljava/lang/String;ZI)La/lw;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    move-object v4, v10

    .line 161
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_3

    .line 166
    .line 167
    return-void

    .line 168
    :cond_3
    move-object v10, v4

    .line 169
    goto :goto_1

    .line 170
    :cond_4
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-nez v0, :cond_5

    .line 175
    .line 176
    goto/16 :goto_5

    .line 177
    .line 178
    :cond_5
    iget-object v0, p0, La/ww;->y:La/bby;

    .line 179
    .line 180
    if-eqz v0, :cond_6

    .line 181
    .line 182
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-ne v0, v9, :cond_6

    .line 187
    .line 188
    goto/16 :goto_5

    .line 189
    .line 190
    :cond_6
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, La/lw;

    .line 195
    .line 196
    iget-object v0, v0, La/lw;->b:La/xuf;

    .line 197
    .line 198
    iget-boolean v0, v0, La/xuf;->o:Z

    .line 199
    .line 200
    if-nez v0, :cond_e

    .line 201
    .line 202
    new-instance v0, La/t0;

    .line 203
    .line 204
    const/4 v6, 0x0

    .line 205
    const/16 v7, 0x18

    .line 206
    .line 207
    const/4 v1, 0x1

    .line 208
    const-class v3, La/ww;

    .line 209
    .line 210
    const-string v4, "handleAddAccountError"

    .line 211
    .line 212
    const-string v5, "handleAddAccountError(Ljava/lang/Throwable;)V"

    .line 213
    .line 214
    move-object v2, p0

    .line 215
    invoke-direct/range {v0 .. v7}, La/t0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 216
    .line 217
    .line 218
    new-instance v2, La/za;

    .line 219
    .line 220
    const/4 v3, 0x4

    .line 221
    invoke-direct {v2, p0, v10, v8, v3}, La/za;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 222
    .line 223
    .line 224
    invoke-static {p0, v0, v2, v9}, La/ww;->M(La/ww;La/t0;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    iput-object v0, p0, La/ww;->y:La/bby;

    .line 229
    .line 230
    return-void

    .line 231
    :cond_7
    instance-of v2, v0, La/wv;

    .line 232
    .line 233
    if-eqz v2, :cond_d

    .line 234
    .line 235
    check-cast v0, La/wv;

    .line 236
    .line 237
    iget-object v0, v0, La/wv;->a:Ljava/lang/String;

    .line 238
    .line 239
    new-instance v2, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 245
    .line 246
    .line 247
    move-result v7

    .line 248
    move v8, v3

    .line 249
    :goto_2
    if-ge v8, v7, :cond_a

    .line 250
    .line 251
    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    invoke-static {v10}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    if-nez v11, :cond_8

    .line 260
    .line 261
    const/16 v11, 0x20

    .line 262
    .line 263
    if-eq v10, v11, :cond_8

    .line 264
    .line 265
    const/16 v11, 0x2d

    .line 266
    .line 267
    if-eq v10, v11, :cond_8

    .line 268
    .line 269
    const/16 v11, 0x27

    .line 270
    .line 271
    if-ne v10, v11, :cond_9

    .line 272
    .line 273
    :cond_8
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 274
    .line 275
    .line 276
    :cond_9
    add-int/lit8 v8, v8, 0x1

    .line 277
    .line 278
    goto :goto_2

    .line 279
    :cond_a
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-le v2, v6, :cond_b

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_b
    move v9, v3

    .line 291
    :goto_3
    if-eqz v9, :cond_c

    .line 292
    .line 293
    new-array v2, v3, [Ljava/lang/Object;

    .line 294
    .line 295
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 296
    .line 297
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-virtual {v5, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    goto :goto_4

    .line 306
    :cond_c
    const-string v2, ""

    .line 307
    .line 308
    :goto_4
    new-instance v3, La/sw;

    .line 309
    .line 310
    invoke-direct {v3, v0, v9, v2}, La/sw;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {p0, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :cond_d
    instance-of v2, v0, La/sv;

    .line 318
    .line 319
    if-eqz v2, :cond_10

    .line 320
    .line 321
    check-cast v0, La/sv;

    .line 322
    .line 323
    iget-wide v2, v0, La/sv;->a:J

    .line 324
    .line 325
    iget-object v0, p0, La/ww;->z:La/bby;

    .line 326
    .line 327
    if-eqz v0, :cond_f

    .line 328
    .line 329
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-ne v0, v9, :cond_f

    .line 334
    .line 335
    :cond_e
    :goto_5
    return-void

    .line 336
    :cond_f
    new-instance v0, La/uw;

    .line 337
    .line 338
    const/4 v5, 0x0

    .line 339
    move-object v1, p0

    .line 340
    move-object v4, v8

    .line 341
    invoke-direct/range {v0 .. v5}, La/uw;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 342
    .line 343
    .line 344
    const/4 v2, 0x3

    .line 345
    invoke-static {p0, v4, v0, v2}, La/ww;->M(La/ww;La/t0;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    iput-object v0, p0, La/ww;->z:La/bby;

    .line 350
    .line 351
    return-void

    .line 352
    :cond_10
    instance-of v0, v0, La/rv;

    .line 353
    .line 354
    if-eqz v0, :cond_11

    .line 355
    .line 356
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 357
    .line 358
    .line 359
    return-void

    .line 360
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 361
    .line 362
    .line 363
    return-void
.end method
