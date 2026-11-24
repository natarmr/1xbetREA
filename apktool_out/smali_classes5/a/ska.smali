.class public final synthetic La/ska;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vka;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;

.field public final synthetic d:La/d9z;


# direct methods
.method public synthetic constructor <init>(La/vka;Lkotlin/jvm/functions/Function2;La/d9z;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ska;->a:B

    iput-object p1, p0, La/ska;->b:La/vka;

    iput-object p2, p0, La/ska;->c:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, La/ska;->d:La/d9z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ska;->a:B

    .line 4
    .line 5
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 6
    .line 7
    const/16 v3, 0xb

    .line 8
    .line 9
    const/high16 v4, 0x41400000    # 12.0f

    .line 10
    .line 11
    const/16 v5, 0x12

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x4

    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    iget-object v10, v0, La/ska;->d:La/d9z;

    .line 18
    .line 19
    iget-object v11, v0, La/ska;->b:La/vka;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/mm40;

    .line 27
    .line 28
    move-object/from16 v12, p2

    .line 29
    .line 30
    check-cast v12, La/fet;

    .line 31
    .line 32
    move-object/from16 v13, p3

    .line 33
    .line 34
    check-cast v13, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v13

    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    and-int/lit8 v14, v13, 0x6

    .line 44
    .line 45
    if-nez v14, :cond_1

    .line 46
    .line 47
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v14

    .line 51
    if-eqz v14, :cond_0

    .line 52
    .line 53
    move v6, v7

    .line 54
    :cond_0
    or-int/2addr v13, v6

    .line 55
    :cond_1
    and-int/lit8 v6, v13, 0x13

    .line 56
    .line 57
    if-eq v6, v5, :cond_2

    .line 58
    .line 59
    move v5, v8

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move v5, v9

    .line 62
    :goto_0
    and-int/lit8 v6, v13, 0x1

    .line 63
    .line 64
    invoke-virtual {v12, v6, v5}, La/fet;->U(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_4

    .line 69
    .line 70
    iget-object v5, v11, La/vka;->c:La/pdp0;

    .line 71
    .line 72
    sget-object v6, La/qmk;->a:La/zcl;

    .line 73
    .line 74
    sget-object v6, La/gqw0;->k:La/yx7;

    .line 75
    .line 76
    new-instance v7, La/qw3;

    .line 77
    .line 78
    new-instance v13, La/gne;

    .line 79
    .line 80
    invoke-direct {v13, v6, v3}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 81
    .line 82
    .line 83
    invoke-direct {v7, v4, v9, v13}, La/qw3;-><init>(FZLa/rw3;)V

    .line 84
    .line 85
    .line 86
    new-instance v3, La/n82;

    .line 87
    .line 88
    const/16 v4, 0x9

    .line 89
    .line 90
    iget-object v0, v0, La/ska;->c:Lkotlin/jvm/functions/Function2;

    .line 91
    .line 92
    invoke-direct {v3, v0, v11, v10, v4}, La/n82;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 93
    .line 94
    .line 95
    const v0, -0xb9ad663

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v3, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sget-object v3, La/gqw0;->n:La/xx7;

    .line 103
    .line 104
    invoke-static {v7, v3, v12, v9}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    iget-wide v6, v12, La/fet;->T:J

    .line 109
    .line 110
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-static {v12, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 123
    .line 124
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12}, La/fet;->i0()V

    .line 128
    .line 129
    .line 130
    iget-boolean v7, v12, La/fet;->S:Z

    .line 131
    .line 132
    if-eqz v7, :cond_3

    .line 133
    .line 134
    invoke-virtual {v12, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_3
    invoke-virtual {v12}, La/fet;->r0()V

    .line 139
    .line 140
    .line 141
    :goto_1
    sget-object v2, La/gqw0;->x:La/shd;

    .line 142
    .line 143
    invoke-static {v12, v3, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 144
    .line 145
    .line 146
    sget-object v2, La/gqw0;->w:La/shd;

    .line 147
    .line 148
    invoke-static {v12, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    sget-object v3, La/gqw0;->y:La/shd;

    .line 156
    .line 157
    invoke-static {v12, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 161
    .line 162
    .line 163
    sget-object v2, La/gqw0;->v:La/shd;

    .line 164
    .line 165
    invoke-static {v12, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    const/16 v1, 0x186

    .line 169
    .line 170
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    sget-object v2, La/y5d;->a:La/y5d;

    .line 175
    .line 176
    invoke-virtual {v0, v2, v5, v12, v1}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12, v8}, La/fet;->r(Z)V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_4
    invoke-virtual {v12}, La/fet;->X()V

    .line 184
    .line 185
    .line 186
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_0
    move-object/from16 v1, p1

    .line 190
    .line 191
    check-cast v1, La/mm40;

    .line 192
    .line 193
    move-object/from16 v15, p2

    .line 194
    .line 195
    check-cast v15, La/fet;

    .line 196
    .line 197
    move-object/from16 v12, p3

    .line 198
    .line 199
    check-cast v12, Ljava/lang/Integer;

    .line 200
    .line 201
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v12

    .line 205
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    and-int/lit8 v13, v12, 0x6

    .line 209
    .line 210
    if-nez v13, :cond_6

    .line 211
    .line 212
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    if-eqz v13, :cond_5

    .line 217
    .line 218
    move v6, v7

    .line 219
    :cond_5
    or-int/2addr v12, v6

    .line 220
    :cond_6
    and-int/lit8 v6, v12, 0x13

    .line 221
    .line 222
    if-eq v6, v5, :cond_7

    .line 223
    .line 224
    move v5, v8

    .line 225
    goto :goto_3

    .line 226
    :cond_7
    move v5, v9

    .line 227
    :goto_3
    and-int/lit8 v6, v12, 0x1

    .line 228
    .line 229
    invoke-virtual {v15, v6, v5}, La/fet;->U(IZ)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_9

    .line 234
    .line 235
    sget-object v5, La/qmk;->a:La/zcl;

    .line 236
    .line 237
    sget-object v5, La/gqw0;->j:La/yx7;

    .line 238
    .line 239
    new-instance v6, La/qw3;

    .line 240
    .line 241
    new-instance v7, La/gne;

    .line 242
    .line 243
    invoke-direct {v7, v5, v3}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 244
    .line 245
    .line 246
    invoke-direct {v6, v4, v9, v7}, La/qw3;-><init>(FZLa/rw3;)V

    .line 247
    .line 248
    .line 249
    sget-object v3, La/gqw0;->n:La/xx7;

    .line 250
    .line 251
    const/16 v4, 0x30

    .line 252
    .line 253
    invoke-static {v6, v3, v15, v4}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    iget-wide v4, v15, La/fet;->T:J

    .line 258
    .line 259
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    invoke-virtual {v15}, La/fet;->m()La/bh90;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-static {v15, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 272
    .line 273
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v15}, La/fet;->i0()V

    .line 277
    .line 278
    .line 279
    iget-boolean v6, v15, La/fet;->S:Z

    .line 280
    .line 281
    if-eqz v6, :cond_8

    .line 282
    .line 283
    invoke-virtual {v15, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 284
    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_8
    invoke-virtual {v15}, La/fet;->r0()V

    .line 288
    .line 289
    .line 290
    :goto_4
    sget-object v2, La/gqw0;->x:La/shd;

    .line 291
    .line 292
    invoke-static {v15, v3, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 293
    .line 294
    .line 295
    sget-object v2, La/gqw0;->w:La/shd;

    .line 296
    .line 297
    invoke-static {v15, v5, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 298
    .line 299
    .line 300
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    sget-object v3, La/gqw0;->y:La/shd;

    .line 305
    .line 306
    invoke-static {v15, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v15}, La/jpm0;->n(La/fet;)V

    .line 310
    .line 311
    .line 312
    sget-object v2, La/gqw0;->v:La/shd;

    .line 313
    .line 314
    invoke-static {v15, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 315
    .line 316
    .line 317
    iget-object v13, v11, La/vka;->b:La/pdp0;

    .line 318
    .line 319
    const/16 v16, 0x0

    .line 320
    .line 321
    const/16 v17, 0x1

    .line 322
    .line 323
    const/4 v12, 0x0

    .line 324
    iget-object v14, v0, La/ska;->c:Lkotlin/jvm/functions/Function2;

    .line 325
    .line 326
    invoke-static/range {v12 .. v17}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 327
    .line 328
    .line 329
    iget-object v0, v11, La/vka;->f:La/a4x;

    .line 330
    .line 331
    invoke-static {v0, v10, v15, v9}, La/kc5;->F0(La/a4x;La/d9z;La/fet;I)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v15, v8}, La/fet;->r(Z)V

    .line 335
    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_9
    invoke-virtual {v15}, La/fet;->X()V

    .line 339
    .line 340
    .line 341
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    return-object v0

    .line 344
    nop

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
