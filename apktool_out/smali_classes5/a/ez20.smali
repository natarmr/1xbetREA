.class public final synthetic La/ez20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/kz20;FFLkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/ez20;->a:B

    iput-object p1, p0, La/ez20;->b:Ljava/lang/Object;

    iput p2, p0, La/ez20;->c:F

    iput p3, p0, La/ez20;->d:F

    iput-object p4, p0, La/ez20;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/l7m0;La/l7m0;FF)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/ez20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ez20;->b:Ljava/lang/Object;

    iput-object p2, p0, La/ez20;->e:Ljava/lang/Object;

    iput p3, p0, La/ez20;->c:F

    iput p4, p0, La/ez20;->d:F

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ez20;->a:B

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x6

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x0

    .line 12
    iget-object v8, v0, La/ez20;->e:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v9, v0, La/ez20;->b:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v9, La/l7m0;

    .line 20
    .line 21
    check-cast v8, La/l7m0;

    .line 22
    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    check-cast v1, La/vj30;

    .line 26
    .line 27
    move-object/from16 v2, p2

    .line 28
    .line 29
    check-cast v2, La/pj30;

    .line 30
    .line 31
    move-object/from16 v3, p3

    .line 32
    .line 33
    check-cast v3, La/p4e;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    :goto_0
    iget v5, v0, La/ez20;->c:F

    .line 66
    .line 67
    iget v0, v0, La/ez20;->d:F

    .line 68
    .line 69
    invoke-static {v5, v0, v4}, La/l7x;->O(FFF)F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-gez v0, :cond_1

    .line 78
    .line 79
    move v0, v7

    .line 80
    :cond_1
    iget-wide v8, v3, La/p4e;->a:J

    .line 81
    .line 82
    invoke-static {v8, v9}, La/p4e;->j(J)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    sub-int/2addr v4, v0

    .line 87
    if-gez v4, :cond_2

    .line 88
    .line 89
    move v12, v7

    .line 90
    goto :goto_1

    .line 91
    :cond_2
    move v12, v4

    .line 92
    :goto_1
    iget-wide v3, v3, La/p4e;->a:J

    .line 93
    .line 94
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    sub-int/2addr v3, v0

    .line 99
    if-gez v3, :cond_3

    .line 100
    .line 101
    move v13, v7

    .line 102
    goto :goto_2

    .line 103
    :cond_3
    move v13, v3

    .line 104
    :goto_2
    const/4 v14, 0x3

    .line 105
    const/4 v10, 0x0

    .line 106
    const/4 v11, 0x0

    .line 107
    invoke-static/range {v8 .. v14}, La/p4e;->b(JIIIII)J

    .line 108
    .line 109
    .line 110
    move-result-wide v3

    .line 111
    invoke-interface {v2, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    iget v3, v2, La/pu90;->a:I

    .line 116
    .line 117
    iget v4, v2, La/pu90;->b:I

    .line 118
    .line 119
    add-int/2addr v4, v0

    .line 120
    new-instance v5, La/n7;

    .line 121
    .line 122
    invoke-direct {v5, v2, v0, v6}, La/n7;-><init>(La/pu90;IB)V

    .line 123
    .line 124
    .line 125
    invoke-static {v1, v3, v4, v5}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0

    .line 130
    :pswitch_0
    check-cast v9, La/kz20;

    .line 131
    .line 132
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 133
    .line 134
    move-object/from16 v11, p1

    .line 135
    .line 136
    check-cast v11, La/mm40;

    .line 137
    .line 138
    move-object/from16 v15, p2

    .line 139
    .line 140
    check-cast v15, La/fet;

    .line 141
    .line 142
    move-object/from16 v1, p3

    .line 143
    .line 144
    check-cast v1, Ljava/lang/Integer;

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    and-int/lit8 v10, v1, 0x6

    .line 154
    .line 155
    if-nez v10, :cond_5

    .line 156
    .line 157
    invoke-virtual {v15, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    if-eqz v10, :cond_4

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_4
    move v3, v6

    .line 165
    :goto_3
    or-int/2addr v1, v3

    .line 166
    :cond_5
    move v10, v1

    .line 167
    and-int/lit8 v1, v10, 0x13

    .line 168
    .line 169
    if-eq v1, v2, :cond_6

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_6
    move v5, v7

    .line 173
    :goto_4
    and-int/lit8 v1, v10, 0x1

    .line 174
    .line 175
    invoke-virtual {v15, v1, v5}, La/fet;->U(IZ)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_7

    .line 180
    .line 181
    iget-boolean v1, v9, La/kz20;->f:Z

    .line 182
    .line 183
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    const/16 v1, 0xc8

    .line 188
    .line 189
    const/4 v2, 0x0

    .line 190
    invoke-static {v1, v7, v2, v4}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    new-instance v1, La/ez20;

    .line 195
    .line 196
    const/4 v6, 0x0

    .line 197
    iget v3, v0, La/ez20;->c:F

    .line 198
    .line 199
    iget v4, v0, La/ez20;->d:F

    .line 200
    .line 201
    move-object v5, v8

    .line 202
    move-object v2, v9

    .line 203
    invoke-direct/range {v1 .. v6}, La/ez20;-><init>(La/kz20;FFLkotlin/jvm/functions/Function1;B)V

    .line 204
    .line 205
    .line 206
    const v0, 0x6219582e

    .line 207
    .line 208
    .line 209
    invoke-static {v0, v1, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 210
    .line 211
    .line 212
    move-result-object v14

    .line 213
    shl-int/lit8 v0, v10, 0x3

    .line 214
    .line 215
    and-int/lit8 v0, v0, 0x70

    .line 216
    .line 217
    or-int/lit16 v0, v0, 0x6180

    .line 218
    .line 219
    const/16 v17, 0x8

    .line 220
    .line 221
    const/4 v13, 0x0

    .line 222
    move/from16 v16, v0

    .line 223
    .line 224
    move-object v10, v12

    .line 225
    move-object v12, v7

    .line 226
    invoke-static/range {v10 .. v17}, La/jwb;->e(Ljava/lang/Object;La/mm40;La/cfq;Ljava/lang/String;La/ugd;La/fet;II)V

    .line 227
    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_7
    invoke-virtual {v15}, La/fet;->X()V

    .line 231
    .line 232
    .line 233
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    return-object v0

    .line 236
    :pswitch_1
    check-cast v9, La/kz20;

    .line 237
    .line 238
    move-object v12, v8

    .line 239
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 240
    .line 241
    move-object/from16 v1, p1

    .line 242
    .line 243
    check-cast v1, Ljava/lang/Boolean;

    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    move-object/from16 v15, p2

    .line 250
    .line 251
    check-cast v15, La/fet;

    .line 252
    .line 253
    move-object/from16 v8, p3

    .line 254
    .line 255
    check-cast v8, Ljava/lang/Integer;

    .line 256
    .line 257
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    and-int/lit8 v10, v8, 0x6

    .line 262
    .line 263
    if-nez v10, :cond_9

    .line 264
    .line 265
    invoke-virtual {v15, v1}, La/fet;->h(Z)Z

    .line 266
    .line 267
    .line 268
    move-result v10

    .line 269
    if-eqz v10, :cond_8

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_8
    move v3, v6

    .line 273
    :goto_6
    or-int/2addr v8, v3

    .line 274
    :cond_9
    and-int/lit8 v3, v8, 0x13

    .line 275
    .line 276
    if-eq v3, v2, :cond_a

    .line 277
    .line 278
    move v2, v5

    .line 279
    goto :goto_7

    .line 280
    :cond_a
    move v2, v7

    .line 281
    :goto_7
    and-int/lit8 v3, v8, 0x1

    .line 282
    .line 283
    invoke-virtual {v15, v3, v2}, La/fet;->U(IZ)Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-eqz v2, :cond_c

    .line 288
    .line 289
    if-eqz v1, :cond_b

    .line 290
    .line 291
    const v0, -0x1ca2523b

    .line 292
    .line 293
    .line 294
    invoke-virtual {v15, v0}, La/fet;->e0(I)V

    .line 295
    .line 296
    .line 297
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 298
    .line 299
    invoke-static {v4, v7, v15, v0}, La/bsr0;->j(IILa/fet;La/mm40;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 303
    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_b
    const v1, -0x1c9f6dbe

    .line 307
    .line 308
    .line 309
    invoke-virtual {v15, v1}, La/fet;->e0(I)V

    .line 310
    .line 311
    .line 312
    sget-object v8, La/o7k0;->c:La/n0q;

    .line 313
    .line 314
    sget-object v13, La/b34;->j:La/ugd;

    .line 315
    .line 316
    sget-object v14, La/b34;->k:La/ugd;

    .line 317
    .line 318
    const v16, 0x1b0006

    .line 319
    .line 320
    .line 321
    iget v10, v0, La/ez20;->c:F

    .line 322
    .line 323
    iget v11, v0, La/ez20;->d:F

    .line 324
    .line 325
    invoke-static/range {v8 .. v16}, La/j2e;->l(La/mm40;La/kz20;FFLkotlin/jvm/functions/Function1;La/ugd;La/ugd;La/fet;I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 329
    .line 330
    .line 331
    goto :goto_8

    .line 332
    :cond_c
    invoke-virtual {v15}, La/fet;->X()V

    .line 333
    .line 334
    .line 335
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object v0

    .line 338
    nop

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
