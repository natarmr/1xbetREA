.class public final synthetic La/gg30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;

.field public final synthetic c:La/ugd;

.field public final synthetic d:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/ugd;La/ugd;La/ugd;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/gg30;->a:B

    iput-object p1, p0, La/gg30;->b:La/ugd;

    iput-object p2, p0, La/gg30;->c:La/ugd;

    iput-object p3, p0, La/gg30;->d:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/gg30;->a:B

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    sget-object v2, La/zhg0;->a:La/zhg0;

    .line 5
    .line 6
    sget-object v3, La/e7z;->u1:La/pcy;

    .line 7
    .line 8
    sget-object v4, La/jm40;->b:La/jm40;

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v8, p0, La/gg30;->d:La/ugd;

    .line 14
    .line 15
    iget-object v9, p0, La/gg30;->c:La/ugd;

    .line 16
    .line 17
    iget-object p0, p0, La/gg30;->b:La/ugd;

    .line 18
    .line 19
    check-cast p1, La/fet;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    packed-switch v0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    and-int/lit8 v1, p2, 0x3

    .line 35
    .line 36
    if-eq v1, v5, :cond_0

    .line 37
    .line 38
    move v7, v6

    .line 39
    :cond_0
    and-int/2addr p2, v6

    .line 40
    invoke-virtual {p1, p2, v7}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    const/high16 p2, 0x3f800000    # 1.0f

    .line 47
    .line 48
    invoke-static {v4, p2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    sget-object v1, La/qmk;->a:La/zcl;

    .line 53
    .line 54
    const/high16 v1, 0x42900000    # 72.0f

    .line 55
    .line 56
    invoke-static {p2, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    sget-object v1, La/gqw0;->k:La/yx7;

    .line 61
    .line 62
    sget-object v2, La/gqw0;->n:La/xx7;

    .line 63
    .line 64
    new-instance v4, La/qw3;

    .line 65
    .line 66
    new-instance v5, La/gne;

    .line 67
    .line 68
    const/16 v7, 0xc

    .line 69
    .line 70
    invoke-direct {v5, v2, v7}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x42100000    # 36.0f

    .line 74
    .line 75
    invoke-direct {v4, v2, v6, v5}, La/qw3;-><init>(FZLa/rw3;)V

    .line 76
    .line 77
    .line 78
    const/16 v2, 0x30

    .line 79
    .line 80
    invoke-static {v4, v1, p1, v2}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-wide v4, p1, La/fet;->T:J

    .line 85
    .line 86
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-static {p1, p2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 99
    .line 100
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, La/fet;->i0()V

    .line 104
    .line 105
    .line 106
    iget-boolean v5, p1, La/fet;->S:Z

    .line 107
    .line 108
    if-eqz v5, :cond_1

    .line 109
    .line 110
    invoke-virtual {p1, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    invoke-virtual {p1}, La/fet;->r0()V

    .line 115
    .line 116
    .line 117
    :goto_0
    sget-object v3, La/gqw0;->x:La/shd;

    .line 118
    .line 119
    invoke-static {p1, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 120
    .line 121
    .line 122
    sget-object v1, La/gqw0;->w:La/shd;

    .line 123
    .line 124
    invoke-static {p1, v4, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    sget-object v2, La/gqw0;->y:La/shd;

    .line 132
    .line 133
    invoke-static {p1, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 137
    .line 138
    .line 139
    sget-object v1, La/gqw0;->v:La/shd;

    .line 140
    .line 141
    invoke-static {p1, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, p1, v0}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v9, p1, v0}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v8, p1, v0}, La/ugd;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v6}, La/fet;->r(Z)V

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_2
    invoke-virtual {p1}, La/fet;->X()V

    .line 158
    .line 159
    .line 160
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    return-object p0

    .line 163
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 164
    .line 165
    if-eq v0, v5, :cond_3

    .line 166
    .line 167
    move v0, v6

    .line 168
    goto :goto_2

    .line 169
    :cond_3
    move v0, v7

    .line 170
    :goto_2
    and-int/2addr p2, v6

    .line 171
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 172
    .line 173
    .line 174
    move-result p2

    .line 175
    if-eqz p2, :cond_5

    .line 176
    .line 177
    sget-object p2, La/uc9;->a:La/lw3;

    .line 178
    .line 179
    sget-object v0, La/gqw0;->j:La/yx7;

    .line 180
    .line 181
    invoke-static {p2, v0, p1, v7}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    iget-wide v10, p1, La/fet;->T:J

    .line 186
    .line 187
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-static {p1, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 200
    .line 201
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1}, La/fet;->i0()V

    .line 205
    .line 206
    .line 207
    iget-boolean v7, p1, La/fet;->S:Z

    .line 208
    .line 209
    if-eqz v7, :cond_4

    .line 210
    .line 211
    invoke-virtual {p1, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_4
    invoke-virtual {p1}, La/fet;->r0()V

    .line 216
    .line 217
    .line 218
    :goto_3
    sget-object v3, La/gqw0;->x:La/shd;

    .line 219
    .line 220
    invoke-static {p1, p2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 221
    .line 222
    .line 223
    sget-object p2, La/gqw0;->w:La/shd;

    .line 224
    .line 225
    invoke-static {p1, v5, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    sget-object v0, La/gqw0;->y:La/shd;

    .line 233
    .line 234
    invoke-static {p1, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 235
    .line 236
    .line 237
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 238
    .line 239
    .line 240
    sget-object p2, La/gqw0;->v:La/shd;

    .line 241
    .line 242
    invoke-static {p1, v4, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 243
    .line 244
    .line 245
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object p2

    .line 249
    invoke-virtual {p0, v2, p1, p2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-virtual {v9, v2, p1, p0}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    invoke-static {v1, v8, v2, p1, v6}, La/h97;->p(ILa/ugd;La/zhg0;La/fet;Z)V

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 264
    .line 265
    .line 266
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    return-object p0

    .line 269
    :pswitch_1
    and-int/lit8 v0, p2, 0x3

    .line 270
    .line 271
    if-eq v0, v5, :cond_6

    .line 272
    .line 273
    move v0, v6

    .line 274
    goto :goto_5

    .line 275
    :cond_6
    move v0, v7

    .line 276
    :goto_5
    and-int/2addr p2, v6

    .line 277
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 278
    .line 279
    .line 280
    move-result p2

    .line 281
    if-eqz p2, :cond_8

    .line 282
    .line 283
    sget-object p2, La/uc9;->a:La/lw3;

    .line 284
    .line 285
    sget-object v0, La/gqw0;->j:La/yx7;

    .line 286
    .line 287
    invoke-static {p2, v0, p1, v7}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    iget-wide v10, p1, La/fet;->T:J

    .line 292
    .line 293
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    invoke-static {p1, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 306
    .line 307
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    invoke-virtual {p1}, La/fet;->i0()V

    .line 311
    .line 312
    .line 313
    iget-boolean v7, p1, La/fet;->S:Z

    .line 314
    .line 315
    if-eqz v7, :cond_7

    .line 316
    .line 317
    invoke-virtual {p1, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 318
    .line 319
    .line 320
    goto :goto_6

    .line 321
    :cond_7
    invoke-virtual {p1}, La/fet;->r0()V

    .line 322
    .line 323
    .line 324
    :goto_6
    sget-object v3, La/gqw0;->x:La/shd;

    .line 325
    .line 326
    invoke-static {p1, p2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 327
    .line 328
    .line 329
    sget-object p2, La/gqw0;->w:La/shd;

    .line 330
    .line 331
    invoke-static {p1, v5, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 332
    .line 333
    .line 334
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object p2

    .line 338
    sget-object v0, La/gqw0;->y:La/shd;

    .line 339
    .line 340
    invoke-static {p1, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 341
    .line 342
    .line 343
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 344
    .line 345
    .line 346
    sget-object p2, La/gqw0;->v:La/shd;

    .line 347
    .line 348
    invoke-static {p1, v4, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 349
    .line 350
    .line 351
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 352
    .line 353
    .line 354
    move-result-object p2

    .line 355
    invoke-virtual {p0, v2, p1, p2}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    invoke-virtual {v9, v2, p1, p0}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    invoke-static {v1, v8, v2, p1, v6}, La/h97;->p(ILa/ugd;La/zhg0;La/fet;Z)V

    .line 366
    .line 367
    .line 368
    goto :goto_7

    .line 369
    :cond_8
    invoke-virtual {p1}, La/fet;->X()V

    .line 370
    .line 371
    .line 372
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 373
    .line 374
    return-object p0

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
