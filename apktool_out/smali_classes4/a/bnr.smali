.class public final synthetic La/bnr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/dnr;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/dnr;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bnr;->a:B

    iput-object p1, p0, La/bnr;->b:La/l7m0;

    iput-object p2, p0, La/bnr;->c:La/dnr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bnr;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/16 v3, 0x12

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    iget-object v5, v0, La/bnr;->c:La/dnr;

    .line 11
    .line 12
    iget-object v0, v0, La/bnr;->b:La/l7m0;

    .line 13
    .line 14
    const/4 v6, 0x4

    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/mm40;

    .line 23
    .line 24
    move-object/from16 v9, p2

    .line 25
    .line 26
    check-cast v9, La/fet;

    .line 27
    .line 28
    move-object/from16 v10, p3

    .line 29
    .line 30
    check-cast v10, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    sget-object v11, La/dnr;->c2:La/ddk;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    and-int/lit8 v11, v10, 0x6

    .line 42
    .line 43
    if-nez v11, :cond_1

    .line 44
    .line 45
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    if-eqz v11, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v6, v4

    .line 53
    :goto_0
    or-int/2addr v10, v6

    .line 54
    :cond_1
    and-int/lit8 v6, v10, 0x13

    .line 55
    .line 56
    if-eq v6, v3, :cond_2

    .line 57
    .line 58
    move v3, v7

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v3, v8

    .line 61
    :goto_1
    and-int/lit8 v6, v10, 0x1

    .line 62
    .line 63
    invoke-virtual {v9, v6, v3}, La/fet;->U(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_5

    .line 68
    .line 69
    sget-object v3, La/qmk;->a:La/zcl;

    .line 70
    .line 71
    invoke-static {v9}, La/qmk;->a(La/fet;)La/wfn;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    iget v3, v3, La/wfn;->d:F

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    invoke-static {v1, v3, v6, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    const/4 v14, 0x0

    .line 83
    const/16 v15, 0xd

    .line 84
    .line 85
    const/4 v11, 0x0

    .line 86
    const/high16 v12, 0x40800000    # 4.0f

    .line 87
    .line 88
    const/4 v13, 0x0

    .line 89
    invoke-static/range {v10 .. v15}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, La/f0k0;

    .line 98
    .line 99
    invoke-virtual {v9, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    if-nez v3, :cond_3

    .line 108
    .line 109
    if-ne v4, v2, :cond_4

    .line 110
    .line 111
    :cond_3
    new-instance v4, La/zmr;

    .line 112
    .line 113
    invoke-direct {v4, v5, v8}, La/zmr;-><init>(La/dnr;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 120
    .line 121
    invoke-static {v1, v0, v4, v9, v8}, La/xww;->o(La/mm40;La/f0k0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    invoke-virtual {v9}, La/fet;->X()V

    .line 126
    .line 127
    .line 128
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object v0

    .line 131
    :pswitch_0
    move-object/from16 v1, p1

    .line 132
    .line 133
    check-cast v1, La/mm40;

    .line 134
    .line 135
    move-object/from16 v9, p2

    .line 136
    .line 137
    check-cast v9, La/fet;

    .line 138
    .line 139
    move-object/from16 v10, p3

    .line 140
    .line 141
    check-cast v10, Ljava/lang/Integer;

    .line 142
    .line 143
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    sget-object v11, La/dnr;->c2:La/ddk;

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    and-int/lit8 v11, v10, 0x6

    .line 153
    .line 154
    if-nez v11, :cond_7

    .line 155
    .line 156
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    if-eqz v11, :cond_6

    .line 161
    .line 162
    move v4, v6

    .line 163
    :cond_6
    or-int/2addr v10, v4

    .line 164
    :cond_7
    and-int/lit8 v4, v10, 0x13

    .line 165
    .line 166
    if-eq v4, v3, :cond_8

    .line 167
    .line 168
    move v8, v7

    .line 169
    :cond_8
    and-int/lit8 v3, v10, 0x1

    .line 170
    .line 171
    invoke-virtual {v9, v3, v8}, La/fet;->U(IZ)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_d

    .line 176
    .line 177
    invoke-virtual {v5}, La/dnr;->I0()La/k3t0;

    .line 178
    .line 179
    .line 180
    move-result-object v13

    .line 181
    invoke-virtual {v9, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    if-nez v3, :cond_9

    .line 190
    .line 191
    if-ne v4, v2, :cond_a

    .line 192
    .line 193
    :cond_9
    new-instance v11, La/pop;

    .line 194
    .line 195
    const/16 v17, 0x0

    .line 196
    .line 197
    const/16 v18, 0x1b

    .line 198
    .line 199
    const/4 v12, 0x1

    .line 200
    const-class v14, La/k3t0;

    .line 201
    .line 202
    const-string v15, "onAction"

    .line 203
    .line 204
    const-string v16, "onAction(Ljava/lang/Object;)V"

    .line 205
    .line 206
    invoke-direct/range {v11 .. v18}, La/pop;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v9, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    move-object v4, v11

    .line 213
    :cond_a
    check-cast v4, La/jhy;

    .line 214
    .line 215
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    sget-object v3, La/bmd;->q:La/zfn;

    .line 224
    .line 225
    invoke-virtual {v9, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    check-cast v3, La/pkk0;

    .line 230
    .line 231
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    or-int/2addr v5, v8

    .line 240
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    if-nez v5, :cond_b

    .line 245
    .line 246
    if-ne v8, v2, :cond_c

    .line 247
    .line 248
    :cond_b
    new-instance v8, La/e54;

    .line 249
    .line 250
    invoke-direct {v8, v3, v4, v6}, La/e54;-><init>(La/pkk0;Lkotlin/jvm/functions/Function1;B)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v9, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    :cond_c
    move-object v2, v8

    .line 257
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 258
    .line 259
    new-instance v3, La/itz;

    .line 260
    .line 261
    const/16 v5, 0x9

    .line 262
    .line 263
    invoke-direct {v3, v0, v4, v5}, La/itz;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;B)V

    .line 264
    .line 265
    .line 266
    const v5, 0x1300c360

    .line 267
    .line 268
    .line 269
    invoke-static {v5, v3, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    new-instance v5, La/itz;

    .line 274
    .line 275
    const/16 v6, 0xd

    .line 276
    .line 277
    invoke-direct {v5, v0, v4, v6}, La/itz;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;B)V

    .line 278
    .line 279
    .line 280
    const v4, 0x51947eff

    .line 281
    .line 282
    .line 283
    invoke-static {v4, v5, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    new-instance v5, La/wq40;

    .line 288
    .line 289
    invoke-direct {v5, v0, v7}, La/wq40;-><init>(La/l7m0;B)V

    .line 290
    .line 291
    .line 292
    const v0, 0x2a4ae4f

    .line 293
    .line 294
    .line 295
    invoke-static {v0, v5, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    and-int/lit8 v0, v10, 0xe

    .line 300
    .line 301
    or-int/lit16 v7, v0, 0x6d80

    .line 302
    .line 303
    move-object v6, v9

    .line 304
    invoke-static/range {v1 .. v7}, La/fre0;->C(La/mm40;Lkotlin/jvm/functions/Function0;La/ugd;La/ugd;La/ugd;La/fet;I)V

    .line 305
    .line 306
    .line 307
    goto :goto_3

    .line 308
    :cond_d
    move-object v6, v9

    .line 309
    invoke-virtual {v6}, La/fet;->X()V

    .line 310
    .line 311
    .line 312
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 313
    .line 314
    return-object v0

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
