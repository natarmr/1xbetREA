.class public final synthetic La/ypd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/mm40;


# direct methods
.method public synthetic constructor <init>(BLa/mm40;La/pz40;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/ypd;->a:B

    iput-object p3, p0, La/ypd;->b:La/pz40;

    iput-object p2, p0, La/ypd;->c:La/mm40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/ypd;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x12

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/ypd;->c:La/mm40;

    .line 8
    .line 9
    const/4 v5, 0x4

    .line 10
    const/4 v6, 0x2

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v7, p1

    .line 15
    check-cast v7, La/mm40;

    .line 16
    .line 17
    move-object v11, p2

    .line 18
    check-cast v11, La/fet;

    .line 19
    .line 20
    move-object/from16 p1, p3

    .line 21
    .line 22
    check-cast p1, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    and-int/lit8 v0, p1, 0x6

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v11, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v5, v6

    .line 43
    :goto_0
    or-int/2addr p1, v5

    .line 44
    :cond_1
    and-int/lit8 v0, p1, 0x13

    .line 45
    .line 46
    if-eq v0, v2, :cond_2

    .line 47
    .line 48
    move v1, v3

    .line 49
    :cond_2
    and-int/lit8 v0, p1, 0x1

    .line 50
    .line 51
    invoke-virtual {v11, v0, v1}, La/fet;->U(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    new-instance v0, La/ft0;

    .line 58
    .line 59
    const/16 v1, 0xa

    .line 60
    .line 61
    invoke-direct {v0, v4, v1}, La/ft0;-><init>(La/mm40;B)V

    .line 62
    .line 63
    .line 64
    const v1, -0x7ec8b4cd

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v0, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    new-instance v0, La/fp0;

    .line 72
    .line 73
    const/16 v1, 0x8

    .line 74
    .line 75
    invoke-direct {v0, v4, v1}, La/fp0;-><init>(La/mm40;B)V

    .line 76
    .line 77
    .line 78
    const v1, -0x484e07cb

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v0, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    and-int/lit8 p1, p1, 0xe

    .line 86
    .line 87
    or-int/lit16 v12, p1, 0xd80

    .line 88
    .line 89
    iget-object v8, p0, La/ypd;->b:La/pz40;

    .line 90
    .line 91
    invoke-static/range {v7 .. v12}, La/c3x;->h(La/mm40;La/l7m0;La/xdr;La/ugd;La/fet;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-virtual {v11}, La/fet;->X()V

    .line 96
    .line 97
    .line 98
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_0
    move-object v0, p1

    .line 102
    check-cast v0, La/mm40;

    .line 103
    .line 104
    move-object p1, p2

    .line 105
    check-cast p1, La/fet;

    .line 106
    .line 107
    move-object/from16 v7, p3

    .line 108
    .line 109
    check-cast v7, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    and-int/lit8 v8, v7, 0x6

    .line 119
    .line 120
    if-nez v8, :cond_5

    .line 121
    .line 122
    invoke-virtual {p1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    if-eqz v8, :cond_4

    .line 127
    .line 128
    move v6, v5

    .line 129
    :cond_4
    or-int/2addr v7, v6

    .line 130
    :cond_5
    and-int/lit8 v6, v7, 0x13

    .line 131
    .line 132
    if-eq v6, v2, :cond_6

    .line 133
    .line 134
    move v1, v3

    .line 135
    :cond_6
    and-int/lit8 v2, v7, 0x1

    .line 136
    .line 137
    invoke-virtual {p1, v2, v1}, La/fet;->U(IZ)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_7

    .line 142
    .line 143
    new-instance v1, La/ft0;

    .line 144
    .line 145
    const/4 v2, 0x7

    .line 146
    invoke-direct {v1, v4, v2}, La/ft0;-><init>(La/mm40;B)V

    .line 147
    .line 148
    .line 149
    const v2, -0x28986e8

    .line 150
    .line 151
    .line 152
    invoke-static {v2, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    new-instance v1, La/fp0;

    .line 157
    .line 158
    invoke-direct {v1, v4, v5}, La/fp0;-><init>(La/mm40;B)V

    .line 159
    .line 160
    .line 161
    const v3, 0x68db191a

    .line 162
    .line 163
    .line 164
    invoke-static {v3, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    and-int/lit8 v1, v7, 0xe

    .line 169
    .line 170
    or-int/lit16 v5, v1, 0xd80

    .line 171
    .line 172
    iget-object v1, p0, La/ypd;->b:La/pz40;

    .line 173
    .line 174
    move-object v4, p1

    .line 175
    invoke-static/range {v0 .. v5}, La/c3x;->h(La/mm40;La/l7m0;La/xdr;La/ugd;La/fet;I)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_7
    move-object v4, p1

    .line 180
    invoke-virtual {v4}, La/fet;->X()V

    .line 181
    .line 182
    .line 183
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_1
    move-object v0, p1

    .line 187
    check-cast v0, La/mm40;

    .line 188
    .line 189
    move-object p1, p2

    .line 190
    check-cast p1, La/fet;

    .line 191
    .line 192
    move-object/from16 v7, p3

    .line 193
    .line 194
    check-cast v7, Ljava/lang/Integer;

    .line 195
    .line 196
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    and-int/lit8 v8, v7, 0x6

    .line 204
    .line 205
    if-nez v8, :cond_9

    .line 206
    .line 207
    invoke-virtual {p1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v8

    .line 211
    if-eqz v8, :cond_8

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_8
    move v5, v6

    .line 215
    :goto_3
    or-int/2addr v7, v5

    .line 216
    :cond_9
    and-int/lit8 v5, v7, 0x13

    .line 217
    .line 218
    if-eq v5, v2, :cond_a

    .line 219
    .line 220
    move v1, v3

    .line 221
    :cond_a
    and-int/lit8 v2, v7, 0x1

    .line 222
    .line 223
    invoke-virtual {p1, v2, v1}, La/fet;->U(IZ)Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-eqz v1, :cond_b

    .line 228
    .line 229
    new-instance v1, La/ft0;

    .line 230
    .line 231
    const/4 v2, 0x3

    .line 232
    invoke-direct {v1, v4, v2}, La/ft0;-><init>(La/mm40;B)V

    .line 233
    .line 234
    .line 235
    const v3, -0x52c3c3f8

    .line 236
    .line 237
    .line 238
    invoke-static {v3, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    new-instance v3, La/fp0;

    .line 243
    .line 244
    invoke-direct {v3, v4, v2}, La/fp0;-><init>(La/mm40;B)V

    .line 245
    .line 246
    .line 247
    const v2, 0x4b5bb98a    # 1.4399882E7f

    .line 248
    .line 249
    .line 250
    invoke-static {v2, v3, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    and-int/lit8 v2, v7, 0xe

    .line 255
    .line 256
    or-int/lit16 v5, v2, 0xd80

    .line 257
    .line 258
    move-object v2, v1

    .line 259
    iget-object v1, p0, La/ypd;->b:La/pz40;

    .line 260
    .line 261
    move-object v4, p1

    .line 262
    invoke-static/range {v0 .. v5}, La/c3x;->h(La/mm40;La/l7m0;La/xdr;La/ugd;La/fet;I)V

    .line 263
    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_b
    move-object v4, p1

    .line 267
    invoke-virtual {v4}, La/fet;->X()V

    .line 268
    .line 269
    .line 270
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object p0

    .line 273
    :pswitch_2
    move-object v0, p1

    .line 274
    check-cast v0, La/mm40;

    .line 275
    .line 276
    move-object p1, p2

    .line 277
    check-cast p1, La/fet;

    .line 278
    .line 279
    move-object/from16 v7, p3

    .line 280
    .line 281
    check-cast v7, Ljava/lang/Integer;

    .line 282
    .line 283
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    and-int/lit8 v8, v7, 0x6

    .line 291
    .line 292
    if-nez v8, :cond_d

    .line 293
    .line 294
    invoke-virtual {p1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v8

    .line 298
    if-eqz v8, :cond_c

    .line 299
    .line 300
    goto :goto_5

    .line 301
    :cond_c
    move v5, v6

    .line 302
    :goto_5
    or-int/2addr v7, v5

    .line 303
    :cond_d
    and-int/lit8 v5, v7, 0x13

    .line 304
    .line 305
    if-eq v5, v2, :cond_e

    .line 306
    .line 307
    move v1, v3

    .line 308
    :cond_e
    and-int/lit8 v2, v7, 0x1

    .line 309
    .line 310
    invoke-virtual {p1, v2, v1}, La/fet;->U(IZ)Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-eqz v1, :cond_f

    .line 315
    .line 316
    new-instance v1, La/ft0;

    .line 317
    .line 318
    invoke-direct {v1, v4, v6}, La/ft0;-><init>(La/mm40;B)V

    .line 319
    .line 320
    .line 321
    const v2, -0x2ffa7c0

    .line 322
    .line 323
    .line 324
    invoke-static {v2, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    new-instance v1, La/fp0;

    .line 329
    .line 330
    invoke-direct {v1, v4, v6}, La/fp0;-><init>(La/mm40;B)V

    .line 331
    .line 332
    .line 333
    const v3, 0x85e88c2

    .line 334
    .line 335
    .line 336
    invoke-static {v3, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    and-int/lit8 v1, v7, 0xe

    .line 341
    .line 342
    or-int/lit16 v5, v1, 0xd80

    .line 343
    .line 344
    iget-object v1, p0, La/ypd;->b:La/pz40;

    .line 345
    .line 346
    move-object v4, p1

    .line 347
    invoke-static/range {v0 .. v5}, La/c3x;->h(La/mm40;La/l7m0;La/xdr;La/ugd;La/fet;I)V

    .line 348
    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_f
    move-object v4, p1

    .line 352
    invoke-virtual {v4}, La/fet;->X()V

    .line 353
    .line 354
    .line 355
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 356
    .line 357
    return-object p0

    .line 358
    nop

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
