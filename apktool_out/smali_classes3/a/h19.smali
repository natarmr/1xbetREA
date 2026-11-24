.class public final synthetic La/h19;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m19;


# direct methods
.method public synthetic constructor <init>(La/m19;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h19;->a:B

    iput-object p1, p0, La/h19;->b:La/m19;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/h19;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Landroid/os/Bundle;

    .line 15
    .line 16
    sget-object v3, La/m19;->U1:La/kj5;

    .line 17
    .line 18
    const-string v3, "SELECT_SORT_TYPE_REQUEST_KEY"

    .line 19
    .line 20
    invoke-static {v2, v1, v3}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 30
    .line 31
    const/16 v4, 0x21

    .line 32
    .line 33
    if-lt v1, v4, :cond_1

    .line 34
    .line 35
    invoke-static {v2}, La/uq6;->z(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    instance-of v2, v1, La/uzb0;

    .line 45
    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    :cond_2
    check-cast v1, La/uzb0;

    .line 50
    .line 51
    :goto_0
    check-cast v1, La/uzb0;

    .line 52
    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    iget-object v0, v0, La/h19;->b:La/m19;

    .line 59
    .line 60
    invoke-virtual {v0}, La/m19;->G0()La/k3t0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v2, La/v09;

    .line 65
    .line 66
    invoke-direct {v2, v1}, La/v09;-><init>(La/uzb0;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    :goto_1
    return-object v0

    .line 75
    :pswitch_0
    move-object/from16 v6, p1

    .line 76
    .line 77
    check-cast v6, La/fet;

    .line 78
    .line 79
    move-object/from16 v1, p2

    .line 80
    .line 81
    check-cast v1, Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    sget-object v2, La/m19;->U1:La/kj5;

    .line 88
    .line 89
    and-int/lit8 v2, v1, 0x3

    .line 90
    .line 91
    const/4 v3, 0x2

    .line 92
    const/4 v4, 0x1

    .line 93
    const/4 v5, 0x0

    .line 94
    if-eq v2, v3, :cond_4

    .line 95
    .line 96
    move v2, v4

    .line 97
    goto :goto_2

    .line 98
    :cond_4
    move v2, v5

    .line 99
    :goto_2
    and-int/2addr v1, v4

    .line 100
    invoke-virtual {v6, v1, v2}, La/fet;->U(IZ)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_e

    .line 105
    .line 106
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    sget-object v2, La/ukd;->a:La/cl5;

    .line 111
    .line 112
    if-ne v1, v2, :cond_5

    .line 113
    .line 114
    sget-object v1, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 115
    .line 116
    invoke-static {v1, v6}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v6, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_5
    move-object v8, v1

    .line 124
    check-cast v8, La/vne;

    .line 125
    .line 126
    invoke-static {v6}, La/f9z;->a(La/fet;)La/d9z;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const/4 v1, 0x7

    .line 131
    invoke-static {v5, v1, v6}, La/ob3;->d(IILa/fet;)La/oyq0;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const/16 v5, 0x6000

    .line 136
    .line 137
    invoke-static {v1, v6, v5}, La/lyq0;->b(La/oyq0;La/fet;I)La/clo;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    invoke-virtual {v6, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    iget-object v14, v0, La/h19;->b:La/m19;

    .line 146
    .line 147
    invoke-virtual {v6, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    or-int/2addr v0, v1

    .line 152
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const/4 v5, 0x0

    .line 157
    if-nez v0, :cond_6

    .line 158
    .line 159
    if-ne v1, v2, :cond_7

    .line 160
    .line 161
    :cond_6
    new-instance v1, La/d09;

    .line 162
    .line 163
    invoke-direct {v1, v3, v14, v5, v4}, La/d09;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v6, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_7
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 170
    .line 171
    invoke-static {v6, v3, v1}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v14}, La/m19;->G0()La/k3t0;

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    invoke-virtual {v6, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    invoke-virtual {v6, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    or-int/2addr v0, v1

    .line 187
    invoke-virtual {v6, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    or-int/2addr v0, v1

    .line 192
    invoke-virtual {v6, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    or-int/2addr v0, v1

    .line 197
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    if-nez v0, :cond_9

    .line 202
    .line 203
    if-ne v1, v2, :cond_8

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_8
    move-object v4, v11

    .line 207
    goto :goto_4

    .line 208
    :cond_9
    :goto_3
    new-instance v7, La/dc0;

    .line 209
    .line 210
    const/16 v12, 0x10

    .line 211
    .line 212
    move-object v10, v3

    .line 213
    move-object v9, v14

    .line 214
    invoke-direct/range {v7 .. v12}, La/dc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 215
    .line 216
    .line 217
    move-object v4, v11

    .line 218
    invoke-virtual {v6, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    move-object v1, v7

    .line 222
    :goto_4
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 223
    .line 224
    sget-object v0, La/lkz;->a:La/lkz;

    .line 225
    .line 226
    invoke-static {v1, v6}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 227
    .line 228
    .line 229
    move-result-object v15

    .line 230
    invoke-virtual {v6, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    invoke-virtual {v6, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    or-int/2addr v0, v1

    .line 239
    const/4 v1, 0x3

    .line 240
    invoke-virtual {v6, v1}, La/fet;->e(I)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    or-int/2addr v0, v1

    .line 245
    invoke-virtual {v6, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    or-int/2addr v0, v1

    .line 250
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    if-nez v0, :cond_a

    .line 255
    .line 256
    if-ne v1, v2, :cond_b

    .line 257
    .line 258
    :cond_a
    new-instance v12, La/ua7;

    .line 259
    .line 260
    const/16 v17, 0x9

    .line 261
    .line 262
    move-object/from16 v16, v5

    .line 263
    .line 264
    invoke-direct/range {v12 .. v17}, La/ua7;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v6, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    move-object v1, v12

    .line 271
    :cond_b
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 272
    .line 273
    invoke-static {v6, v14, v1}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v14}, La/m19;->G0()La/k3t0;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    check-cast v0, La/i3t0;

    .line 281
    .line 282
    invoke-virtual {v0, v6}, La/i3t0;->y(La/fet;)La/pz40;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v14}, La/m19;->G0()La/k3t0;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-virtual {v6, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v5

    .line 294
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    if-nez v5, :cond_c

    .line 299
    .line 300
    if-ne v7, v2, :cond_d

    .line 301
    .line 302
    :cond_c
    new-instance v15, La/li8;

    .line 303
    .line 304
    const/16 v21, 0x0

    .line 305
    .line 306
    const/16 v22, 0xe

    .line 307
    .line 308
    const/16 v16, 0x1

    .line 309
    .line 310
    const-class v18, La/k3t0;

    .line 311
    .line 312
    const-string v19, "onAction"

    .line 313
    .line 314
    const-string v20, "onAction(Ljava/lang/Object;)V"

    .line 315
    .line 316
    move-object/from16 v17, v1

    .line 317
    .line 318
    invoke-direct/range {v15 .. v22}, La/li8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v6, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    move-object v7, v15

    .line 325
    :cond_d
    check-cast v7, La/jhy;

    .line 326
    .line 327
    move-object v5, v7

    .line 328
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 329
    .line 330
    const/4 v7, 0x0

    .line 331
    const/4 v1, 0x0

    .line 332
    move-object v2, v0

    .line 333
    invoke-static/range {v1 .. v7}, La/s5x0;->k(La/mm40;La/l7m0;La/d9z;La/nyq0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 334
    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_e
    invoke-virtual {v6}, La/fet;->X()V

    .line 338
    .line 339
    .line 340
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 341
    .line 342
    return-object v0

    .line 343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
