.class public final synthetic La/awi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qfj0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/qfj0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/awi0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/awi0;->b:La/qfj0;

    iput-object p2, p0, La/awi0;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/qfj0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/awi0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/awi0;->c:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/awi0;->b:La/qfj0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/awi0;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41800000    # 16.0f

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/16 v4, 0x12

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x4

    .line 13
    sget-object v7, La/ukd;->a:La/cl5;

    .line 14
    .line 15
    iget-object v8, v0, La/awi0;->c:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    iget-object v0, v0, La/awi0;->b:La/qfj0;

    .line 18
    .line 19
    const/high16 v9, 0x3f800000    # 1.0f

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    const/4 v11, 0x1

    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/yhg0;

    .line 29
    .line 30
    move-object/from16 v12, p2

    .line 31
    .line 32
    check-cast v12, La/fet;

    .line 33
    .line 34
    move-object/from16 v13, p3

    .line 35
    .line 36
    check-cast v13, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v13

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    and-int/lit8 v14, v13, 0x6

    .line 46
    .line 47
    if-nez v14, :cond_1

    .line 48
    .line 49
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v14

    .line 53
    if-eqz v14, :cond_0

    .line 54
    .line 55
    move v5, v6

    .line 56
    :cond_0
    or-int/2addr v13, v5

    .line 57
    :cond_1
    and-int/lit8 v5, v13, 0x13

    .line 58
    .line 59
    if-eq v5, v4, :cond_2

    .line 60
    .line 61
    move v4, v11

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move v4, v10

    .line 64
    :goto_0
    and-int/lit8 v5, v13, 0x1

    .line 65
    .line 66
    invoke-virtual {v12, v5, v4}, La/fet;->U(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_7

    .line 71
    .line 72
    invoke-static {v3, v9}, La/o7k0;->c(La/mm40;F)La/mm40;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-interface {v1, v9, v3, v11}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 81
    .line 82
    invoke-virtual {v12, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 87
    .line 88
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    sget-object v5, La/qmk;->a:La/zcl;

    .line 93
    .line 94
    invoke-static {v2}, La/vgg0;->a(F)La/ugg0;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static {v1, v3, v4, v2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 99
    .line 100
    .line 101
    move-result-object v19

    .line 102
    iget-object v1, v0, La/qfj0;->a:La/yg;

    .line 103
    .line 104
    iget-object v14, v1, La/yg;->a:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v15, v1, La/yg;->b:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v2, v1, La/yg;->c:Ljava/lang/String;

    .line 109
    .line 110
    iget-boolean v3, v1, La/yg;->d:Z

    .line 111
    .line 112
    iget-boolean v1, v1, La/yg;->e:Z

    .line 113
    .line 114
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    invoke-virtual {v12, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    or-int/2addr v4, v5

    .line 123
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    if-nez v4, :cond_3

    .line 128
    .line 129
    if-ne v5, v7, :cond_4

    .line 130
    .line 131
    :cond_3
    new-instance v5, La/bwi0;

    .line 132
    .line 133
    invoke-direct {v5, v0, v8, v10}, La/bwi0;-><init>(La/qfj0;Lkotlin/jvm/functions/Function1;B)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v12, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_4
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 140
    .line 141
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    invoke-virtual {v12, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    or-int/2addr v4, v6

    .line 150
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    if-nez v4, :cond_5

    .line 155
    .line 156
    if-ne v6, v7, :cond_6

    .line 157
    .line 158
    :cond_5
    new-instance v6, La/bwi0;

    .line 159
    .line 160
    invoke-direct {v6, v0, v8, v11}, La/bwi0;-><init>(La/qfj0;Lkotlin/jvm/functions/Function1;B)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_6
    move-object v13, v6

    .line 167
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 168
    .line 169
    const/16 v21, 0x0

    .line 170
    .line 171
    move/from16 v18, v1

    .line 172
    .line 173
    move-object/from16 v16, v2

    .line 174
    .line 175
    move/from16 v17, v3

    .line 176
    .line 177
    move-object/from16 v20, v12

    .line 178
    .line 179
    move-object v12, v5

    .line 180
    invoke-static/range {v12 .. v21}, La/wha0;->a(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLa/mm40;La/fet;I)V

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_7
    move-object/from16 v20, v12

    .line 185
    .line 186
    invoke-virtual/range {v20 .. v20}, La/fet;->X()V

    .line 187
    .line 188
    .line 189
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object v0

    .line 192
    :pswitch_0
    move-object/from16 v1, p1

    .line 193
    .line 194
    check-cast v1, La/yhg0;

    .line 195
    .line 196
    move-object/from16 v12, p2

    .line 197
    .line 198
    check-cast v12, La/fet;

    .line 199
    .line 200
    move-object/from16 v13, p3

    .line 201
    .line 202
    check-cast v13, Ljava/lang/Integer;

    .line 203
    .line 204
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    and-int/lit8 v14, v13, 0x6

    .line 212
    .line 213
    if-nez v14, :cond_9

    .line 214
    .line 215
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v14

    .line 219
    if-eqz v14, :cond_8

    .line 220
    .line 221
    move v5, v6

    .line 222
    :cond_8
    or-int/2addr v13, v5

    .line 223
    :cond_9
    and-int/lit8 v5, v13, 0x13

    .line 224
    .line 225
    if-eq v5, v4, :cond_a

    .line 226
    .line 227
    move v10, v11

    .line 228
    :cond_a
    and-int/lit8 v4, v13, 0x1

    .line 229
    .line 230
    invoke-virtual {v12, v4, v10}, La/fet;->U(IZ)Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-eqz v4, :cond_d

    .line 235
    .line 236
    invoke-interface {v1, v9, v3, v11}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    sget-object v3, La/zaq0;->b:La/zfn;

    .line 241
    .line 242
    invoke-virtual {v12, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 247
    .line 248
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 249
    .line 250
    .line 251
    move-result-wide v3

    .line 252
    sget-object v5, La/qmk;->a:La/zcl;

    .line 253
    .line 254
    invoke-static {v2}, La/vgg0;->a(F)La/ugg0;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-static {v1, v3, v4, v2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 259
    .line 260
    .line 261
    move-result-object v13

    .line 262
    invoke-virtual {v12, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    if-nez v1, :cond_b

    .line 271
    .line 272
    if-ne v2, v7, :cond_c

    .line 273
    .line 274
    :cond_b
    new-instance v2, La/w7i0;

    .line 275
    .line 276
    const/16 v1, 0x9

    .line 277
    .line 278
    invoke-direct {v2, v8, v1}, La/w7i0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v12, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_c
    move-object/from16 v17, v2

    .line 285
    .line 286
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 287
    .line 288
    const/16 v18, 0xf

    .line 289
    .line 290
    const/4 v14, 0x0

    .line 291
    const/4 v15, 0x0

    .line 292
    const/16 v16, 0x0

    .line 293
    .line 294
    invoke-static/range {v13 .. v18}, La/y860;->Y(La/mm40;ZLjava/lang/String;La/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 295
    .line 296
    .line 297
    move-result-object v17

    .line 298
    iget-object v0, v0, La/qfj0;->b:La/ksh0;

    .line 299
    .line 300
    move-object/from16 v18, v12

    .line 301
    .line 302
    iget v12, v0, La/ksh0;->a:I

    .line 303
    .line 304
    iget-object v14, v0, La/ksh0;->d:Ljava/lang/String;

    .line 305
    .line 306
    iget-boolean v1, v0, La/ksh0;->b:Z

    .line 307
    .line 308
    iget-object v15, v0, La/ksh0;->e:Ljava/lang/String;

    .line 309
    .line 310
    iget v13, v0, La/ksh0;->c:I

    .line 311
    .line 312
    const/16 v19, 0x0

    .line 313
    .line 314
    move/from16 v16, v1

    .line 315
    .line 316
    invoke-static/range {v12 .. v19}, La/t9x;->w(IILjava/lang/String;Ljava/lang/String;ZLa/mm40;La/fet;I)V

    .line 317
    .line 318
    .line 319
    goto :goto_2

    .line 320
    :cond_d
    move-object/from16 v18, v12

    .line 321
    .line 322
    invoke-virtual/range {v18 .. v18}, La/fet;->X()V

    .line 323
    .line 324
    .line 325
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 326
    .line 327
    return-object v0

    .line 328
    nop

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
