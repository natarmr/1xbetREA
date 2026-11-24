.class public final synthetic La/phc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xhc;

.field public final synthetic c:La/wpq;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/xhc;La/wpq;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/phc;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/phc;->b:La/xhc;

    iput-object p2, p0, La/phc;->c:La/wpq;

    iput-object p3, p0, La/phc;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/xhc;Lkotlin/jvm/functions/Function1;La/wpq;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/phc;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/phc;->b:La/xhc;

    iput-object p2, p0, La/phc;->d:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/phc;->c:La/wpq;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/phc;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object v5, v0, La/phc;->d:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    iget-object v6, v0, La/phc;->c:La/wpq;

    .line 13
    .line 14
    iget-object v0, v0, La/phc;->b:La/xhc;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/ir8;

    .line 23
    .line 24
    move-object/from16 v11, p2

    .line 25
    .line 26
    check-cast v11, La/fet;

    .line 27
    .line 28
    move-object/from16 v8, p3

    .line 29
    .line 30
    check-cast v8, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v8

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v1, v8, 0x11

    .line 40
    .line 41
    const/16 v9, 0x10

    .line 42
    .line 43
    if-eq v1, v9, :cond_0

    .line 44
    .line 45
    move v1, v4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v1, v7

    .line 48
    :goto_0
    and-int/2addr v4, v8

    .line 49
    invoke-virtual {v11, v4, v1}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    const/high16 v1, 0x3f800000    # 1.0f

    .line 56
    .line 57
    invoke-static {v3, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    sget-object v3, La/qmk;->a:La/zcl;

    .line 62
    .line 63
    const/high16 v3, 0x41800000    # 16.0f

    .line 64
    .line 65
    const/high16 v4, 0x41000000    # 8.0f

    .line 66
    .line 67
    invoke-static {v1, v3, v4}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    new-instance v12, La/wul;

    .line 72
    .line 73
    sget-object v13, La/lul;->e:La/lul;

    .line 74
    .line 75
    sget-object v14, La/oe9;->a:La/oe9;

    .line 76
    .line 77
    new-instance v15, La/ue9;

    .line 78
    .line 79
    const v1, 0x7f1311b2

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v11}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-direct {v15, v1}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-boolean v0, v0, La/xhc;->e:Z

    .line 90
    .line 91
    const/16 v17, 0x0

    .line 92
    .line 93
    const/16 v18, 0x0

    .line 94
    .line 95
    move/from16 v16, v0

    .line 96
    .line 97
    invoke-direct/range {v12 .. v18}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v11, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-virtual {v11, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    or-int/2addr v0, v1

    .line 109
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    if-nez v0, :cond_1

    .line 114
    .line 115
    if-ne v1, v2, :cond_2

    .line 116
    .line 117
    :cond_1
    new-instance v1, La/qhc;

    .line 118
    .line 119
    invoke-direct {v1, v6, v5, v7}, La/qhc;-><init>(La/wpq;Lkotlin/jvm/functions/Function1;B)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v11, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_2
    move-object v10, v1

    .line 126
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 127
    .line 128
    move-object v9, v12

    .line 129
    const/4 v12, 0x0

    .line 130
    const/4 v13, 0x0

    .line 131
    invoke-static/range {v8 .. v13}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    invoke-virtual {v11}, La/fet;->X()V

    .line 136
    .line 137
    .line 138
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_0
    move-object/from16 v1, p1

    .line 142
    .line 143
    check-cast v1, La/hh80;

    .line 144
    .line 145
    move-object/from16 v8, p2

    .line 146
    .line 147
    check-cast v8, La/fet;

    .line 148
    .line 149
    move-object/from16 v9, p3

    .line 150
    .line 151
    check-cast v9, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    and-int/lit8 v10, v9, 0x6

    .line 161
    .line 162
    if-nez v10, :cond_5

    .line 163
    .line 164
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    if-eqz v10, :cond_4

    .line 169
    .line 170
    const/4 v10, 0x4

    .line 171
    goto :goto_2

    .line 172
    :cond_4
    const/4 v10, 0x2

    .line 173
    :goto_2
    or-int/2addr v9, v10

    .line 174
    :cond_5
    and-int/lit8 v10, v9, 0x13

    .line 175
    .line 176
    const/16 v11, 0x12

    .line 177
    .line 178
    if-eq v10, v11, :cond_6

    .line 179
    .line 180
    move v10, v4

    .line 181
    goto :goto_3

    .line 182
    :cond_6
    move v10, v7

    .line 183
    :goto_3
    and-int/2addr v4, v9

    .line 184
    invoke-virtual {v8, v4, v10}, La/fet;->U(IZ)Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-eqz v4, :cond_a

    .line 189
    .line 190
    iget-boolean v4, v0, La/xhc;->f:Z

    .line 191
    .line 192
    if-eqz v4, :cond_7

    .line 193
    .line 194
    const v4, 0x3f10c4da

    .line 195
    .line 196
    .line 197
    invoke-virtual {v8, v4}, La/fet;->e0(I)V

    .line 198
    .line 199
    .line 200
    invoke-static {v7, v8}, La/i120;->A(ILa/fet;)V

    .line 201
    .line 202
    .line 203
    :goto_4
    invoke-virtual {v8, v7}, La/fet;->r(Z)V

    .line 204
    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_7
    const v4, -0x5cf80b90

    .line 208
    .line 209
    .line 210
    invoke-virtual {v8, v4}, La/fet;->e0(I)V

    .line 211
    .line 212
    .line 213
    goto :goto_4

    .line 214
    :goto_5
    invoke-static {v3, v1}, La/s5x0;->I(La/mm40;La/hh80;)La/mm40;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    invoke-static {v8}, La/xfn;->a(La/fet;)La/wfn;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    iget v10, v1, La/wfn;->d:F

    .line 223
    .line 224
    invoke-static {v8}, La/xfn;->a(La/fet;)La/wfn;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    iget v12, v1, La/wfn;->d:F

    .line 229
    .line 230
    const/4 v13, 0x0

    .line 231
    const/16 v14, 0xa

    .line 232
    .line 233
    const/4 v11, 0x0

    .line 234
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    invoke-virtual {v8, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    or-int/2addr v3, v4

    .line 247
    invoke-virtual {v8, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    or-int/2addr v3, v4

    .line 252
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    if-nez v3, :cond_8

    .line 257
    .line 258
    if-ne v4, v2, :cond_9

    .line 259
    .line 260
    :cond_8
    new-instance v4, La/sw8;

    .line 261
    .line 262
    const/4 v2, 0x7

    .line 263
    invoke-direct {v4, v0, v5, v6, v2}, La/sw8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v8, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    :cond_9
    move-object/from16 v16, v4

    .line 270
    .line 271
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 272
    .line 273
    const/16 v18, 0x0

    .line 274
    .line 275
    const/16 v19, 0x1fe

    .line 276
    .line 277
    const/4 v9, 0x0

    .line 278
    const/4 v10, 0x0

    .line 279
    const/4 v11, 0x0

    .line 280
    const/4 v12, 0x0

    .line 281
    const/4 v13, 0x0

    .line 282
    const/4 v14, 0x0

    .line 283
    const/4 v15, 0x0

    .line 284
    move-object/from16 v17, v8

    .line 285
    .line 286
    move-object v8, v1

    .line 287
    invoke-static/range {v8 .. v19}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 288
    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_a
    move-object/from16 v17, v8

    .line 292
    .line 293
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 294
    .line 295
    .line 296
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    return-object v0

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
