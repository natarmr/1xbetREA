.class public final synthetic La/f4s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ej1;


# direct methods
.method public synthetic constructor <init>(La/ej1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f4s0;->a:B

    iput-object p1, p0, La/f4s0;->b:La/ej1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/f4s0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/f4s0;->b:La/ej1;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/fee;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, La/ej1;->d:La/n0o0;

    .line 15
    .line 16
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, La/fee;

    .line 21
    .line 22
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, La/s7s0;

    .line 27
    .line 28
    instance-of v0, p1, La/q7s0;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    check-cast p1, La/q7s0;

    .line 34
    .line 35
    iget-object p1, p1, La/q7s0;->a:La/gu1;

    .line 36
    .line 37
    iget-object v0, p1, La/gu1;->l:La/w98;

    .line 38
    .line 39
    iget-object v0, v0, La/w98;->a:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    move-object v4, v3

    .line 56
    check-cast v4, La/fzl0;

    .line 57
    .line 58
    iget-wide v4, v4, La/fzl0;->c:J

    .line 59
    .line 60
    iget-object v6, p0, La/ej1;->g:La/n0o0;

    .line 61
    .line 62
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    check-cast v6, La/fee;

    .line 67
    .line 68
    invoke-virtual {v6}, La/fee;->c()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 75
    .line 76
    .line 77
    move-result-wide v6

    .line 78
    cmp-long v4, v4, v6

    .line 79
    .line 80
    if-nez v4, :cond_0

    .line 81
    .line 82
    move-object v1, v3

    .line 83
    :cond_1
    check-cast v1, La/fzl0;

    .line 84
    .line 85
    if-nez v1, :cond_3

    .line 86
    .line 87
    iget-object p1, p1, La/gu1;->b:La/z1s0;

    .line 88
    .line 89
    sget-object v0, La/z1s0;->b:La/z1s0;

    .line 90
    .line 91
    if-ne p1, v0, :cond_3

    .line 92
    .line 93
    iget-object p0, p0, La/ej1;->q:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p0, La/n0o0;

    .line 96
    .line 97
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, La/fee;

    .line 102
    .line 103
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    check-cast p0, Ljava/util/Collection;

    .line 108
    .line 109
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    if-nez p0, :cond_3

    .line 114
    .line 115
    const/4 v2, 0x1

    .line 116
    goto :goto_0

    .line 117
    :cond_2
    sget-object p0, La/r7s0;->a:La/r7s0;

    .line 118
    .line 119
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-eqz p0, :cond_4

    .line 124
    .line 125
    :cond_3
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    goto :goto_1

    .line 130
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 131
    .line 132
    .line 133
    :goto_1
    return-object v1

    .line 134
    :pswitch_0
    check-cast p1, La/fee;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, La/ej1;->d:La/n0o0;

    .line 140
    .line 141
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, La/fee;

    .line 146
    .line 147
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    move-object v0, p1

    .line 152
    check-cast v0, La/s7s0;

    .line 153
    .line 154
    iget-object p1, p0, La/ej1;->g:La/n0o0;

    .line 155
    .line 156
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    check-cast p1, La/fee;

    .line 161
    .line 162
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    check-cast p1, Ljava/lang/Number;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 169
    .line 170
    .line 171
    move-result-wide v1

    .line 172
    iget-object v3, p0, La/ej1;->b:La/ctf0;

    .line 173
    .line 174
    iget-object p0, p0, La/ej1;->e:La/n0o0;

    .line 175
    .line 176
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    check-cast p0, La/fee;

    .line 181
    .line 182
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    move-object v4, p0

    .line 187
    check-cast v4, Ljava/lang/String;

    .line 188
    .line 189
    const/4 v5, 0x0

    .line 190
    invoke-static/range {v0 .. v5}, La/lvm0;->g(La/s7s0;JLa/ctf0;Ljava/lang/String;Z)La/i4;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :pswitch_1
    check-cast p1, La/fee;

    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    iget-object p1, p0, La/ej1;->d:La/n0o0;

    .line 201
    .line 202
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    check-cast p1, La/fee;

    .line 207
    .line 208
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    check-cast p1, La/s7s0;

    .line 213
    .line 214
    iget-object v0, p0, La/ej1;->h:La/n0o0;

    .line 215
    .line 216
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, La/fee;

    .line 221
    .line 222
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, La/gqt0;

    .line 227
    .line 228
    instance-of v2, p1, La/q7s0;

    .line 229
    .line 230
    if-eqz v2, :cond_5

    .line 231
    .line 232
    sget-object v2, La/gqt0;->h:La/gqt0;

    .line 233
    .line 234
    if-eq v0, v2, :cond_5

    .line 235
    .line 236
    invoke-static {v0}, La/vsm0;->B(La/gqt0;)La/hqt0;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    check-cast p1, La/q7s0;

    .line 241
    .line 242
    iget-object p1, p1, La/q7s0;->a:La/gu1;

    .line 243
    .line 244
    iget-object v2, p1, La/gu1;->b:La/z1s0;

    .line 245
    .line 246
    new-instance v3, La/mtl;

    .line 247
    .line 248
    new-instance v4, La/itl;

    .line 249
    .line 250
    new-instance v5, La/wul;

    .line 251
    .line 252
    sget-object v6, La/iul;->e:La/iul;

    .line 253
    .line 254
    sget-object v7, La/oe9;->a:La/oe9;

    .line 255
    .line 256
    new-instance v8, La/ue9;

    .line 257
    .line 258
    iget-object p1, p1, La/gu1;->o:La/lf9;

    .line 259
    .line 260
    iget-object v9, p0, La/ej1;->b:La/ctf0;

    .line 261
    .line 262
    invoke-static {p1, v0, v9}, La/unh0;->o0(La/lf9;La/gqt0;La/ctf0;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-direct {v8, p1}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    iget-object p0, p0, La/ej1;->j:La/n0o0;

    .line 270
    .line 271
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    check-cast p0, La/fee;

    .line 276
    .line 277
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    check-cast p0, Ljava/lang/Boolean;

    .line 282
    .line 283
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 284
    .line 285
    .line 286
    move-result v10

    .line 287
    const/4 v11, 0x1

    .line 288
    const/4 v9, 0x1

    .line 289
    invoke-direct/range {v5 .. v11}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 290
    .line 291
    .line 292
    sget-object p0, La/otr0;->c:La/otr0;

    .line 293
    .line 294
    invoke-direct {v4, v5, p0}, La/itl;-><init>(La/wul;La/jtl;)V

    .line 295
    .line 296
    .line 297
    filled-new-array {v4}, [La/itl;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    invoke-static {p0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    invoke-direct {v3, p0}, La/mtl;-><init>(La/a4x;)V

    .line 306
    .line 307
    .line 308
    new-instance p0, La/ci;

    .line 309
    .line 310
    invoke-direct {p0, v3, v1, v2}, La/ci;-><init>(La/mtl;La/hqt0;La/z1s0;)V

    .line 311
    .line 312
    .line 313
    move-object v1, p0

    .line 314
    :cond_5
    return-object v1

    .line 315
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    new-instance v0, La/imm;

    .line 321
    .line 322
    new-instance v1, La/ilm;

    .line 323
    .line 324
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 325
    .line 326
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 331
    .line 332
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 333
    .line 334
    .line 335
    move-result-wide v2

    .line 336
    invoke-direct {v1, v2, v3}, La/ilm;-><init>(J)V

    .line 337
    .line 338
    .line 339
    new-instance v2, La/plm;

    .line 340
    .line 341
    iget-object p0, p0, La/ej1;->k:La/n0o0;

    .line 342
    .line 343
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    check-cast p0, La/fee;

    .line 348
    .line 349
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    check-cast p0, Ljava/lang/String;

    .line 354
    .line 355
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 360
    .line 361
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 362
    .line 363
    .line 364
    move-result-wide v3

    .line 365
    sget-object p1, La/fa50;->a:La/fa50;

    .line 366
    .line 367
    invoke-direct {v2, p0, v3, v4, p1}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 368
    .line 369
    .line 370
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 375
    .line 376
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 377
    .line 378
    .line 379
    move-result-wide v4

    .line 380
    const/4 v6, 0x0

    .line 381
    const/4 v7, 0x0

    .line 382
    sget-object v3, La/fmm;->a:La/fmm;

    .line 383
    .line 384
    invoke-direct/range {v0 .. v7}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 385
    .line 386
    .line 387
    return-object v0

    .line 388
    nop

    .line 389
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
