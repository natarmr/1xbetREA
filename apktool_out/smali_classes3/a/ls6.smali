.class public final synthetic La/ls6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dt6;


# direct methods
.method public synthetic constructor <init>(La/dt6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ls6;->a:B

    iput-object p1, p0, La/ls6;->b:La/dt6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ls6;->a:B

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v0, v0, La/ls6;->b:La/dt6;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, Ljava/lang/Throwable;

    .line 19
    .line 20
    move-object/from16 v2, p2

    .line 21
    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    .line 31
    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    new-instance v1, La/gh5;

    .line 41
    .line 42
    const/16 v2, 0x1d

    .line 43
    .line 44
    invoke-direct {v1, v2}, La/gh5;-><init>(B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    :goto_0
    return-object v0

    .line 53
    :pswitch_0
    move-object/from16 v1, p1

    .line 54
    .line 55
    check-cast v1, Ljava/lang/Throwable;

    .line 56
    .line 57
    move-object/from16 v6, p2

    .line 58
    .line 59
    check-cast v6, Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    instance-of v6, v1, Ljava/util/concurrent/CancellationException;

    .line 68
    .line 69
    if-eqz v6, :cond_1

    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 75
    .line 76
    .line 77
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 78
    .line 79
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 80
    .line 81
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v7, v0, La/i3t0;->f:La/oyg0;

    .line 89
    .line 90
    move-object v8, v6

    .line 91
    check-cast v8, La/c820;

    .line 92
    .line 93
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v7, v8, La/c820;->d:La/svj0;

    .line 97
    .line 98
    iget-object v9, v7, La/svj0;->b:La/nnb0;

    .line 99
    .line 100
    const/4 v10, 0x2

    .line 101
    invoke-static {v9, v4, v5, v3, v10}, La/nnb0;->a(La/nnb0;ZLjava/lang/String;Ljava/lang/String;I)La/nnb0;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    invoke-static {v7, v5, v9, v5, v2}, La/svj0;->a(La/svj0;La/ex6;La/nnb0;La/lwo0;I)La/svj0;

    .line 106
    .line 107
    .line 108
    move-result-object v12

    .line 109
    const/16 v19, 0x0

    .line 110
    .line 111
    const/16 v20, 0x1ff7

    .line 112
    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v10, 0x0

    .line 115
    const/4 v11, 0x0

    .line 116
    const/4 v13, 0x0

    .line 117
    const/4 v14, 0x0

    .line 118
    const/4 v15, 0x0

    .line 119
    const/16 v16, 0x0

    .line 120
    .line 121
    const/16 v17, 0x0

    .line 122
    .line 123
    const/16 v18, 0x0

    .line 124
    .line 125
    invoke-static/range {v8 .. v20}, La/c820;->a(La/c820;La/my6;La/go7;La/bn5;La/svj0;La/jfc0;La/xtb0;ZZZZLa/jg7;I)La/c820;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {v1, v6, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_2

    .line 134
    .line 135
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    :goto_1
    return-object v0

    .line 138
    :pswitch_1
    move-object/from16 v1, p1

    .line 139
    .line 140
    check-cast v1, La/oyg0;

    .line 141
    .line 142
    move-object/from16 v6, p2

    .line 143
    .line 144
    check-cast v6, La/c820;

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object v1, v6, La/c820;->d:La/svj0;

    .line 153
    .line 154
    iget-object v7, v1, La/svj0;->b:La/nnb0;

    .line 155
    .line 156
    invoke-virtual {v0}, La/dt6;->O()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    const/4 v8, 0x1

    .line 161
    invoke-static {v7, v4, v0, v3, v8}, La/nnb0;->a(La/nnb0;ZLjava/lang/String;Ljava/lang/String;I)La/nnb0;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {v1, v5, v0, v5, v2}, La/svj0;->a(La/svj0;La/ex6;La/nnb0;La/lwo0;I)La/svj0;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    const/16 v18, 0x1ff7

    .line 172
    .line 173
    const/4 v7, 0x0

    .line 174
    const/4 v8, 0x0

    .line 175
    const/4 v9, 0x0

    .line 176
    const/4 v11, 0x0

    .line 177
    const/4 v12, 0x0

    .line 178
    const/4 v13, 0x0

    .line 179
    const/4 v14, 0x0

    .line 180
    const/4 v15, 0x0

    .line 181
    const/16 v16, 0x0

    .line 182
    .line 183
    invoke-static/range {v6 .. v18}, La/c820;->a(La/c820;La/my6;La/go7;La/bn5;La/svj0;La/jfc0;La/xtb0;ZZZZLa/jg7;I)La/c820;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    :pswitch_2
    move-object/from16 v1, p1

    .line 189
    .line 190
    check-cast v1, Ljava/lang/Throwable;

    .line 191
    .line 192
    move-object/from16 v2, p2

    .line 193
    .line 194
    check-cast v2, Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {v2, v1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    instance-of v3, v1, La/zhi0;

    .line 200
    .line 201
    if-eqz v3, :cond_5

    .line 202
    .line 203
    check-cast v1, La/zhi0;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 209
    .line 210
    sget-object v3, La/i2o;->q:La/i2o;

    .line 211
    .line 212
    if-ne v1, v3, :cond_3

    .line 213
    .line 214
    new-instance v1, La/dc20;

    .line 215
    .line 216
    invoke-direct {v1, v2}, La/dc20;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_3
    sget-object v3, La/i2o;->n2:La/i2o;

    .line 224
    .line 225
    if-ne v1, v3, :cond_4

    .line 226
    .line 227
    new-instance v1, La/ub20;

    .line 228
    .line 229
    invoke-direct {v1, v2}, La/ub20;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_4
    invoke-virtual {v0, v2}, La/dt6;->W(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_5
    invoke-static {v1}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_6

    .line 245
    .line 246
    invoke-virtual {v0}, La/dt6;->V()V

    .line 247
    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_6
    invoke-virtual {v0, v2}, La/dt6;->W(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object v0

    .line 256
    :pswitch_3
    move-object/from16 v1, p1

    .line 257
    .line 258
    check-cast v1, La/oyg0;

    .line 259
    .line 260
    move-object/from16 v6, p2

    .line 261
    .line 262
    check-cast v6, La/c820;

    .line 263
    .line 264
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    iget-object v1, v6, La/c820;->d:La/svj0;

    .line 271
    .line 272
    iget-object v7, v1, La/svj0;->c:La/lwo0;

    .line 273
    .line 274
    invoke-virtual {v0}, La/dt6;->M()Z

    .line 275
    .line 276
    .line 277
    move-result v8

    .line 278
    sget-object v12, La/iun;->a:La/iun;

    .line 279
    .line 280
    const-wide/16 v10, 0x0

    .line 281
    .line 282
    const/16 v13, 0x14

    .line 283
    .line 284
    const/4 v9, 0x0

    .line 285
    invoke-static/range {v7 .. v13}, La/lwo0;->a(La/lwo0;ZZDLjava/util/List;I)La/lwo0;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    const/16 v2, 0xb

    .line 290
    .line 291
    invoke-static {v1, v5, v5, v0, v2}, La/svj0;->a(La/svj0;La/ex6;La/nnb0;La/lwo0;I)La/svj0;

    .line 292
    .line 293
    .line 294
    move-result-object v10

    .line 295
    const/16 v17, 0x0

    .line 296
    .line 297
    const/16 v18, 0x1ff7

    .line 298
    .line 299
    const/4 v7, 0x0

    .line 300
    const/4 v8, 0x0

    .line 301
    const/4 v9, 0x0

    .line 302
    const/4 v11, 0x0

    .line 303
    const/4 v12, 0x0

    .line 304
    const/4 v13, 0x0

    .line 305
    const/4 v14, 0x0

    .line 306
    const/4 v15, 0x0

    .line 307
    const/16 v16, 0x0

    .line 308
    .line 309
    invoke-static/range {v6 .. v18}, La/c820;->a(La/c820;La/my6;La/go7;La/bn5;La/svj0;La/jfc0;La/xtb0;ZZZZLa/jg7;I)La/c820;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    return-object v0

    .line 314
    :pswitch_4
    move-object/from16 v1, p1

    .line 315
    .line 316
    check-cast v1, Ljava/lang/Throwable;

    .line 317
    .line 318
    move-object/from16 v4, p2

    .line 319
    .line 320
    check-cast v4, Ljava/lang/String;

    .line 321
    .line 322
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 329
    .line 330
    .line 331
    new-instance v1, La/rc20;

    .line 332
    .line 333
    new-instance v2, La/xdk0;

    .line 334
    .line 335
    sget-object v3, La/rek0;->b:La/rek0;

    .line 336
    .line 337
    const/4 v8, 0x0

    .line 338
    const/16 v9, 0x7c

    .line 339
    .line 340
    const/4 v5, 0x0

    .line 341
    const/4 v6, 0x0

    .line 342
    const/4 v7, 0x0

    .line 343
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 344
    .line 345
    .line 346
    invoke-direct {v1, v2}, La/rc20;-><init>(La/xdk0;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    return-object v0

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
