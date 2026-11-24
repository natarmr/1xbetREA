.class public final synthetic La/nic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/oic;


# direct methods
.method public synthetic constructor <init>(La/oic;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nic;->a:B

    iput-object p1, p0, La/nic;->b:La/oic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/nic;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/16 v4, 0x10

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    iget-object v0, v0, La/nic;->b:La/oic;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/y5d;

    .line 20
    .line 21
    move-object/from16 v7, p2

    .line 22
    .line 23
    check-cast v7, La/fet;

    .line 24
    .line 25
    move-object/from16 v8, p3

    .line 26
    .line 27
    check-cast v8, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    sget-object v9, La/oic;->l2:La/yk5;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    and-int/lit8 v1, v8, 0x11

    .line 39
    .line 40
    if-eq v1, v4, :cond_0

    .line 41
    .line 42
    move v1, v6

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v1, v5

    .line 45
    :goto_0
    and-int/lit8 v4, v8, 0x1

    .line 46
    .line 47
    invoke-virtual {v7, v4, v1}, La/fet;->U(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-static {v5, v5, v7, v5, v3}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    invoke-static {v8, v7}, La/a8k0;->G(La/bch0;La/fet;)La/ak50;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-static {v2, v1, v3}, La/cjx;->V(La/mm40;La/vj50;La/yj50;)La/mm40;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    sget-object v2, La/qmk;->a:La/zcl;

    .line 67
    .line 68
    const/high16 v2, 0x41800000    # 16.0f

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-static {v3, v2, v6}, La/s5x0;->t(FFI)La/lh80;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-virtual {v7, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    if-nez v2, :cond_1

    .line 84
    .line 85
    sget-object v2, La/ukd;->a:La/cl5;

    .line 86
    .line 87
    if-ne v3, v2, :cond_2

    .line 88
    .line 89
    :cond_1
    new-instance v3, La/lya;

    .line 90
    .line 91
    const/16 v2, 0x12

    .line 92
    .line 93
    invoke-direct {v3, v0, v2}, La/lya;-><init>(Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    move-object v15, v3

    .line 100
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 101
    .line 102
    const/16 v17, 0x0

    .line 103
    .line 104
    const/16 v18, 0x1f8

    .line 105
    .line 106
    const/4 v10, 0x0

    .line 107
    const/4 v11, 0x0

    .line 108
    const/4 v12, 0x0

    .line 109
    const/4 v13, 0x0

    .line 110
    const/4 v14, 0x0

    .line 111
    move-object/from16 v16, v7

    .line 112
    .line 113
    move-object v7, v1

    .line 114
    invoke-static/range {v7 .. v18}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    move-object/from16 v16, v7

    .line 119
    .line 120
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 121
    .line 122
    .line 123
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object v0

    .line 126
    :pswitch_0
    move-object/from16 v1, p1

    .line 127
    .line 128
    check-cast v1, La/y5d;

    .line 129
    .line 130
    move-object/from16 v7, p2

    .line 131
    .line 132
    check-cast v7, La/fet;

    .line 133
    .line 134
    move-object/from16 v8, p3

    .line 135
    .line 136
    check-cast v8, Ljava/lang/Integer;

    .line 137
    .line 138
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    sget-object v9, La/oic;->l2:La/yk5;

    .line 143
    .line 144
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    and-int/lit8 v1, v8, 0x11

    .line 148
    .line 149
    if-eq v1, v4, :cond_4

    .line 150
    .line 151
    move v5, v6

    .line 152
    :cond_4
    and-int/lit8 v1, v8, 0x1

    .line 153
    .line 154
    invoke-virtual {v7, v1, v5}, La/fet;->U(IZ)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_5

    .line 159
    .line 160
    const/high16 v1, 0x3f800000    # 1.0f

    .line 161
    .line 162
    invoke-static {v2, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    sget-object v1, La/qmk;->a:La/zcl;

    .line 167
    .line 168
    const/4 v12, 0x0

    .line 169
    const/16 v13, 0x8

    .line 170
    .line 171
    const/high16 v9, 0x41800000    # 16.0f

    .line 172
    .line 173
    const/high16 v10, 0x41e00000    # 28.0f

    .line 174
    .line 175
    const/high16 v11, 0x41800000    # 16.0f

    .line 176
    .line 177
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-virtual {v0}, La/oic;->P0()Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iget-object v0, v0, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;->b:Ljava/lang/String;

    .line 186
    .line 187
    sget-object v15, La/j1t0;->b:La/qrq;

    .line 188
    .line 189
    sget-wide v12, La/qmk;->t:J

    .line 190
    .line 191
    const/16 v1, 0x16

    .line 192
    .line 193
    invoke-static {v1}, La/idm0;->t(I)J

    .line 194
    .line 195
    .line 196
    move-result-wide v21

    .line 197
    new-instance v23, La/y9q0;

    .line 198
    .line 199
    const/16 v20, 0x0

    .line 200
    .line 201
    move-object/from16 v9, v23

    .line 202
    .line 203
    const v23, 0xfdffdd

    .line 204
    .line 205
    .line 206
    const-wide/16 v10, 0x0

    .line 207
    .line 208
    const/4 v14, 0x0

    .line 209
    const-wide/16 v16, 0x0

    .line 210
    .line 211
    const/16 v18, 0x0

    .line 212
    .line 213
    const/16 v19, 0x0

    .line 214
    .line 215
    invoke-direct/range {v9 .. v23}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 216
    .line 217
    .line 218
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 219
    .line 220
    invoke-virtual {v7, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 225
    .line 226
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 227
    .line 228
    .line 229
    move-result-wide v24

    .line 230
    const/16 v40, 0x0

    .line 231
    .line 232
    const v41, 0xfffffe

    .line 233
    .line 234
    .line 235
    const-wide/16 v26, 0x0

    .line 236
    .line 237
    const/16 v28, 0x0

    .line 238
    .line 239
    const/16 v29, 0x0

    .line 240
    .line 241
    const/16 v30, 0x0

    .line 242
    .line 243
    const-wide/16 v31, 0x0

    .line 244
    .line 245
    const/16 v33, 0x0

    .line 246
    .line 247
    const/16 v34, 0x0

    .line 248
    .line 249
    const/16 v35, 0x0

    .line 250
    .line 251
    const/16 v36, 0x0

    .line 252
    .line 253
    const-wide/16 v37, 0x0

    .line 254
    .line 255
    const/16 v39, 0x0

    .line 256
    .line 257
    move-object/from16 v23, v9

    .line 258
    .line 259
    invoke-static/range {v23 .. v41}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 260
    .line 261
    .line 262
    move-result-object v27

    .line 263
    new-instance v1, La/f2q0;

    .line 264
    .line 265
    invoke-direct {v1, v3}, La/f2q0;-><init>(I)V

    .line 266
    .line 267
    .line 268
    const/16 v30, 0x180

    .line 269
    .line 270
    const v31, 0x1ebfc

    .line 271
    .line 272
    .line 273
    const-wide/16 v9, 0x0

    .line 274
    .line 275
    const/4 v11, 0x0

    .line 276
    const-wide/16 v12, 0x0

    .line 277
    .line 278
    const/4 v15, 0x0

    .line 279
    const/16 v16, 0x0

    .line 280
    .line 281
    const-wide/16 v17, 0x0

    .line 282
    .line 283
    const-wide/16 v20, 0x0

    .line 284
    .line 285
    const/16 v22, 0x2

    .line 286
    .line 287
    const/16 v23, 0x0

    .line 288
    .line 289
    const/16 v24, 0x0

    .line 290
    .line 291
    const/16 v25, 0x0

    .line 292
    .line 293
    const/16 v26, 0x0

    .line 294
    .line 295
    const/16 v29, 0x0

    .line 296
    .line 297
    move-object/from16 v19, v1

    .line 298
    .line 299
    move-object/from16 v28, v7

    .line 300
    .line 301
    move-object v7, v0

    .line 302
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 303
    .line 304
    .line 305
    goto :goto_2

    .line 306
    :cond_5
    move-object/from16 v28, v7

    .line 307
    .line 308
    invoke-virtual/range {v28 .. v28}, La/fet;->X()V

    .line 309
    .line 310
    .line 311
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 312
    .line 313
    return-object v0

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
