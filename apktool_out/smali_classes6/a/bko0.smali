.class public final synthetic La/bko0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cko0;


# direct methods
.method public synthetic constructor <init>(La/cko0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bko0;->a:B

    iput-object p1, p0, La/bko0;->b:La/cko0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bko0;->a:B

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
    iget-object v0, v0, La/bko0;->b:La/cko0;

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
    sget-object v9, La/cko0;->m2:La/m6m0;

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
    new-instance v10, La/qw3;

    .line 76
    .line 77
    new-instance v2, La/jf4;

    .line 78
    .line 79
    const/16 v3, 0xe

    .line 80
    .line 81
    invoke-direct {v2, v3}, La/jf4;-><init>(B)V

    .line 82
    .line 83
    .line 84
    const/high16 v3, 0x41000000    # 8.0f

    .line 85
    .line 86
    invoke-direct {v10, v3, v6, v2}, La/qw3;-><init>(FZLa/rw3;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v7, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    if-nez v2, :cond_1

    .line 98
    .line 99
    sget-object v2, La/ukd;->a:La/cl5;

    .line 100
    .line 101
    if-ne v3, v2, :cond_2

    .line 102
    .line 103
    :cond_1
    new-instance v3, La/ttn0;

    .line 104
    .line 105
    const/16 v2, 0xa

    .line 106
    .line 107
    invoke-direct {v3, v0, v2}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    move-object v15, v3

    .line 114
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 115
    .line 116
    const/16 v17, 0x0

    .line 117
    .line 118
    const/16 v18, 0x1e8

    .line 119
    .line 120
    const/4 v11, 0x0

    .line 121
    const/4 v12, 0x0

    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    move-object/from16 v16, v7

    .line 125
    .line 126
    move-object v7, v1

    .line 127
    invoke-static/range {v7 .. v18}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_3
    move-object/from16 v16, v7

    .line 132
    .line 133
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 134
    .line 135
    .line 136
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_0
    move-object/from16 v1, p1

    .line 140
    .line 141
    check-cast v1, La/y5d;

    .line 142
    .line 143
    move-object/from16 v7, p2

    .line 144
    .line 145
    check-cast v7, La/fet;

    .line 146
    .line 147
    move-object/from16 v8, p3

    .line 148
    .line 149
    check-cast v8, Ljava/lang/Integer;

    .line 150
    .line 151
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    sget-object v9, La/cko0;->m2:La/m6m0;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    and-int/lit8 v1, v8, 0x11

    .line 161
    .line 162
    if-eq v1, v4, :cond_4

    .line 163
    .line 164
    move v1, v6

    .line 165
    goto :goto_2

    .line 166
    :cond_4
    move v1, v5

    .line 167
    :goto_2
    and-int/lit8 v4, v8, 0x1

    .line 168
    .line 169
    invoke-virtual {v7, v4, v1}, La/fet;->U(IZ)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_5

    .line 174
    .line 175
    const/high16 v1, 0x3f800000    # 1.0f

    .line 176
    .line 177
    invoke-static {v2, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    sget-object v1, La/qmk;->a:La/zcl;

    .line 182
    .line 183
    const/4 v12, 0x0

    .line 184
    const/16 v13, 0x8

    .line 185
    .line 186
    const/high16 v9, 0x41800000    # 16.0f

    .line 187
    .line 188
    const/high16 v10, 0x41e00000    # 28.0f

    .line 189
    .line 190
    const/high16 v11, 0x41800000    # 16.0f

    .line 191
    .line 192
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    iget-object v1, v0, La/cko0;->k2:La/phf0;

    .line 197
    .line 198
    sget-object v2, La/cko0;->n2:[La/iiy;

    .line 199
    .line 200
    aget-object v2, v2, v5

    .line 201
    .line 202
    invoke-virtual {v1, v0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 207
    .line 208
    invoke-virtual {v7, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 213
    .line 214
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 215
    .line 216
    .line 217
    move-result-wide v9

    .line 218
    sget-object v17, La/j1t0;->b:La/qrq;

    .line 219
    .line 220
    sget-wide v14, La/qmk;->t:J

    .line 221
    .line 222
    const/16 v1, 0x16

    .line 223
    .line 224
    invoke-static {v1}, La/idm0;->t(I)J

    .line 225
    .line 226
    .line 227
    move-result-wide v23

    .line 228
    new-instance v11, La/y9q0;

    .line 229
    .line 230
    const/16 v22, 0x0

    .line 231
    .line 232
    const v25, 0xfdffdd

    .line 233
    .line 234
    .line 235
    const-wide/16 v12, 0x0

    .line 236
    .line 237
    const/16 v16, 0x0

    .line 238
    .line 239
    const-wide/16 v18, 0x0

    .line 240
    .line 241
    const/16 v20, 0x0

    .line 242
    .line 243
    const/16 v21, 0x0

    .line 244
    .line 245
    invoke-direct/range {v11 .. v25}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 246
    .line 247
    .line 248
    new-instance v1, La/f2q0;

    .line 249
    .line 250
    invoke-direct {v1, v3}, La/f2q0;-><init>(I)V

    .line 251
    .line 252
    .line 253
    const/16 v30, 0x6180

    .line 254
    .line 255
    const v31, 0x1abf8

    .line 256
    .line 257
    .line 258
    move-object/from16 v27, v11

    .line 259
    .line 260
    const/4 v11, 0x0

    .line 261
    const/4 v14, 0x0

    .line 262
    const/4 v15, 0x0

    .line 263
    const-wide/16 v17, 0x0

    .line 264
    .line 265
    const-wide/16 v20, 0x0

    .line 266
    .line 267
    const/16 v22, 0x2

    .line 268
    .line 269
    const/16 v23, 0x0

    .line 270
    .line 271
    const/16 v24, 0x1

    .line 272
    .line 273
    const/16 v25, 0x0

    .line 274
    .line 275
    const/16 v26, 0x0

    .line 276
    .line 277
    const/16 v29, 0x0

    .line 278
    .line 279
    move-object/from16 v19, v1

    .line 280
    .line 281
    move-object/from16 v28, v7

    .line 282
    .line 283
    move-object v7, v0

    .line 284
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 285
    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_5
    move-object/from16 v28, v7

    .line 289
    .line 290
    invoke-virtual/range {v28 .. v28}, La/fet;->X()V

    .line 291
    .line 292
    .line 293
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    return-object v0

    .line 296
    nop

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
