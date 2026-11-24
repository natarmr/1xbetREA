.class public final synthetic La/lzb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/szb;


# direct methods
.method public synthetic constructor <init>(La/szb;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lzb;->a:B

    iput-object p1, p0, La/lzb;->b:La/szb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/lzb;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, La/lzb;->b:La/szb;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/yhg0;

    .line 15
    .line 16
    move-object/from16 v11, p2

    .line 17
    .line 18
    check-cast v11, La/fet;

    .line 19
    .line 20
    move-object/from16 v4, p3

    .line 21
    .line 22
    check-cast v4, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    and-int/lit8 v1, v4, 0x11

    .line 32
    .line 33
    const/16 v5, 0x10

    .line 34
    .line 35
    if-eq v1, v5, :cond_0

    .line 36
    .line 37
    move v1, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v1, v2

    .line 40
    :goto_0
    and-int/2addr v3, v4

    .line 41
    invoke-virtual {v11, v3, v1}, La/fet;->U(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    iget-object v0, v0, La/szb;->c:La/yvl;

    .line 48
    .line 49
    iget-boolean v0, v0, La/yvl;->c:Z

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    const v0, -0x1a5b70de

    .line 54
    .line 55
    .line 56
    invoke-virtual {v11, v0}, La/fet;->e0(I)V

    .line 57
    .line 58
    .line 59
    sget-object v0, La/qmk;->a:La/zcl;

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    const/16 v8, 0xb

    .line 63
    .line 64
    sget-object v3, La/jm40;->b:La/jm40;

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    const/high16 v6, 0x41400000    # 12.0f

    .line 69
    .line 70
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const/high16 v1, 0x41800000    # 16.0f

    .line 75
    .line 76
    invoke-static {v0, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v1, "CHECKBOX_WARNING"

    .line 81
    .line 82
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    sget-object v3, La/ukd;->a:La/cl5;

    .line 91
    .line 92
    if-ne v1, v3, :cond_1

    .line 93
    .line 94
    new-instance v1, La/m1b;

    .line 95
    .line 96
    const/16 v3, 0x1d

    .line 97
    .line 98
    invoke-direct {v1, v3}, La/m1b;-><init>(B)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v11, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_1
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 105
    .line 106
    invoke-static {v0, v2, v1}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    const v0, 0x7f080839

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v2, v11}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 118
    .line 119
    invoke-virtual {v11, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 124
    .line 125
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getWarning-0d7_KjU()J

    .line 126
    .line 127
    .line 128
    move-result-wide v0

    .line 129
    new-instance v10, La/m78;

    .line 130
    .line 131
    const/4 v3, 0x5

    .line 132
    invoke-direct {v10, v0, v1, v3}, La/m78;-><init>(JI)V

    .line 133
    .line 134
    .line 135
    sget-object v8, La/gqw0;->f1:La/pge;

    .line 136
    .line 137
    const/16 v12, 0x6038

    .line 138
    .line 139
    const/16 v13, 0x28

    .line 140
    .line 141
    const/4 v5, 0x0

    .line 142
    const/4 v7, 0x0

    .line 143
    const/4 v9, 0x0

    .line 144
    invoke-static/range {v4 .. v13}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v11, v2}, La/fet;->r(Z)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_2
    const v0, -0x1a51f265

    .line 152
    .line 153
    .line 154
    invoke-virtual {v11, v0}, La/fet;->e0(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v11, v2}, La/fet;->r(Z)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_3
    invoke-virtual {v11}, La/fet;->X()V

    .line 162
    .line 163
    .line 164
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_0
    move-object/from16 v1, p1

    .line 168
    .line 169
    check-cast v1, La/yhg0;

    .line 170
    .line 171
    move-object/from16 v4, p2

    .line 172
    .line 173
    check-cast v4, La/fet;

    .line 174
    .line 175
    move-object/from16 v5, p3

    .line 176
    .line 177
    check-cast v5, Ljava/lang/Integer;

    .line 178
    .line 179
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    and-int/lit8 v6, v5, 0x6

    .line 187
    .line 188
    if-nez v6, :cond_5

    .line 189
    .line 190
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-eqz v6, :cond_4

    .line 195
    .line 196
    const/4 v6, 0x4

    .line 197
    goto :goto_2

    .line 198
    :cond_4
    const/4 v6, 0x2

    .line 199
    :goto_2
    or-int/2addr v5, v6

    .line 200
    :cond_5
    and-int/lit8 v6, v5, 0x13

    .line 201
    .line 202
    const/16 v7, 0x12

    .line 203
    .line 204
    if-eq v6, v7, :cond_6

    .line 205
    .line 206
    move v2, v3

    .line 207
    :cond_6
    and-int/2addr v5, v3

    .line 208
    invoke-virtual {v4, v5, v2}, La/fet;->U(IZ)Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_7

    .line 213
    .line 214
    sget-object v2, La/jm40;->b:La/jm40;

    .line 215
    .line 216
    const/high16 v5, 0x3f800000    # 1.0f

    .line 217
    .line 218
    invoke-interface {v1, v5, v2, v3}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    sget-object v1, La/qmk;->a:La/zcl;

    .line 223
    .line 224
    const/4 v7, 0x0

    .line 225
    const/4 v11, 0x1

    .line 226
    const/high16 v8, 0x41200000    # 10.0f

    .line 227
    .line 228
    const/high16 v9, 0x41800000    # 16.0f

    .line 229
    .line 230
    const/high16 v10, 0x41200000    # 10.0f

    .line 231
    .line 232
    invoke-static/range {v6 .. v11}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    const-string v2, "CHECKBOX_TITLE"

    .line 237
    .line 238
    invoke-static {v1, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    iget-object v0, v0, La/szb;->b:Ljava/lang/String;

    .line 243
    .line 244
    sget-object v12, La/j1t0;->c:La/qrq;

    .line 245
    .line 246
    sget-wide v9, La/qmk;->r:J

    .line 247
    .line 248
    sget-wide v18, La/qmk;->F:J

    .line 249
    .line 250
    new-instance v6, La/y9q0;

    .line 251
    .line 252
    const/16 v17, 0x0

    .line 253
    .line 254
    const v20, 0xfdffdd

    .line 255
    .line 256
    .line 257
    const-wide/16 v7, 0x0

    .line 258
    .line 259
    const/4 v11, 0x0

    .line 260
    const-wide/16 v13, 0x0

    .line 261
    .line 262
    const/4 v15, 0x0

    .line 263
    const/16 v16, 0x0

    .line 264
    .line 265
    invoke-direct/range {v6 .. v20}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 266
    .line 267
    .line 268
    invoke-static {v6, v4}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 269
    .line 270
    .line 271
    move-result-object v24

    .line 272
    const/16 v27, 0x0

    .line 273
    .line 274
    const v28, 0x1fffc

    .line 275
    .line 276
    .line 277
    const-wide/16 v6, 0x0

    .line 278
    .line 279
    const/4 v8, 0x0

    .line 280
    const-wide/16 v9, 0x0

    .line 281
    .line 282
    const/4 v12, 0x0

    .line 283
    const/4 v13, 0x0

    .line 284
    const-wide/16 v14, 0x0

    .line 285
    .line 286
    const/16 v16, 0x0

    .line 287
    .line 288
    const-wide/16 v17, 0x0

    .line 289
    .line 290
    const/16 v19, 0x0

    .line 291
    .line 292
    const/16 v20, 0x0

    .line 293
    .line 294
    const/16 v21, 0x0

    .line 295
    .line 296
    const/16 v22, 0x0

    .line 297
    .line 298
    const/16 v23, 0x0

    .line 299
    .line 300
    const/16 v26, 0x0

    .line 301
    .line 302
    move-object/from16 v25, v4

    .line 303
    .line 304
    move-object v4, v0

    .line 305
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 306
    .line 307
    .line 308
    goto :goto_3

    .line 309
    :cond_7
    move-object/from16 v25, v4

    .line 310
    .line 311
    invoke-virtual/range {v25 .. v25}, La/fet;->X()V

    .line 312
    .line 313
    .line 314
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 315
    .line 316
    return-object v0

    .line 317
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
