.class public final synthetic La/qhr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/air0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/air0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qhr0;->a:B

    iput-object p1, p0, La/qhr0;->b:La/air0;

    iput-object p2, p0, La/qhr0;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qhr0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x12

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x4

    .line 10
    sget-object v6, La/ukd;->a:La/cl5;

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    iget-object v8, v0, La/qhr0;->c:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    iget-object v0, v0, La/qhr0;->b:La/air0;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v9, p1

    .line 21
    .line 22
    check-cast v9, La/mm40;

    .line 23
    .line 24
    move-object/from16 v15, p2

    .line 25
    .line 26
    check-cast v15, La/fet;

    .line 27
    .line 28
    move-object/from16 v1, p3

    .line 29
    .line 30
    check-cast v1, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v10, v1, 0x6

    .line 40
    .line 41
    if-nez v10, :cond_1

    .line 42
    .line 43
    invoke-virtual {v15, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    if-eqz v10, :cond_0

    .line 48
    .line 49
    move v4, v5

    .line 50
    :cond_0
    or-int/2addr v1, v4

    .line 51
    :cond_1
    and-int/lit8 v4, v1, 0x13

    .line 52
    .line 53
    if-eq v4, v3, :cond_2

    .line 54
    .line 55
    move v2, v7

    .line 56
    :cond_2
    and-int/lit8 v3, v1, 0x1

    .line 57
    .line 58
    invoke-virtual {v15, v3, v2}, La/fet;->U(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_b

    .line 63
    .line 64
    iget-object v10, v0, La/air0;->b:La/imm;

    .line 65
    .line 66
    invoke-virtual {v15, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    if-ne v2, v6, :cond_4

    .line 77
    .line 78
    :cond_3
    new-instance v2, La/sbr0;

    .line 79
    .line 80
    const/16 v0, 0xb

    .line 81
    .line 82
    invoke-direct {v2, v8, v0}, La/sbr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v15, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    move-object v11, v2

    .line 89
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 90
    .line 91
    invoke-virtual {v15, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-nez v0, :cond_5

    .line 100
    .line 101
    if-ne v2, v6, :cond_6

    .line 102
    .line 103
    :cond_5
    new-instance v2, La/sbr0;

    .line 104
    .line 105
    const/16 v0, 0xc

    .line 106
    .line 107
    invoke-direct {v2, v8, v0}, La/sbr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v15, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_6
    move-object v12, v2

    .line 114
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 115
    .line 116
    invoke-virtual {v15, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    if-nez v0, :cond_7

    .line 125
    .line 126
    if-ne v2, v6, :cond_8

    .line 127
    .line 128
    :cond_7
    new-instance v2, La/sbr0;

    .line 129
    .line 130
    const/16 v0, 0xd

    .line 131
    .line 132
    invoke-direct {v2, v8, v0}, La/sbr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v15, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_8
    move-object v13, v2

    .line 139
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 140
    .line 141
    invoke-virtual {v15, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    invoke-virtual {v15}, La/fet;->P()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    if-nez v0, :cond_9

    .line 150
    .line 151
    if-ne v2, v6, :cond_a

    .line 152
    .line 153
    :cond_9
    new-instance v2, La/sbr0;

    .line 154
    .line 155
    const/4 v0, 0x7

    .line 156
    invoke-direct {v2, v8, v0}, La/sbr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v15, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    :cond_a
    move-object v14, v2

    .line 163
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 164
    .line 165
    and-int/lit8 v16, v1, 0xe

    .line 166
    .line 167
    invoke-static/range {v9 .. v16}, La/a4n0;->b(La/mm40;La/imm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 168
    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_b
    invoke-virtual {v15}, La/fet;->X()V

    .line 172
    .line 173
    .line 174
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object v0

    .line 177
    :pswitch_0
    move-object/from16 v1, p1

    .line 178
    .line 179
    check-cast v1, La/mm40;

    .line 180
    .line 181
    move-object/from16 v9, p2

    .line 182
    .line 183
    check-cast v9, La/fet;

    .line 184
    .line 185
    move-object/from16 v10, p3

    .line 186
    .line 187
    check-cast v10, Ljava/lang/Integer;

    .line 188
    .line 189
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    and-int/lit8 v11, v10, 0x6

    .line 197
    .line 198
    if-nez v11, :cond_d

    .line 199
    .line 200
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    if-eqz v11, :cond_c

    .line 205
    .line 206
    move v4, v5

    .line 207
    :cond_c
    or-int/2addr v10, v4

    .line 208
    :cond_d
    and-int/lit8 v4, v10, 0x13

    .line 209
    .line 210
    if-eq v4, v3, :cond_e

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_e
    move v7, v2

    .line 214
    :goto_1
    and-int/lit8 v3, v10, 0x1

    .line 215
    .line 216
    invoke-virtual {v9, v3, v7}, La/fet;->U(IZ)Z

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    if-eqz v3, :cond_16

    .line 221
    .line 222
    iget-object v0, v0, La/air0;->d:La/iur0;

    .line 223
    .line 224
    instance-of v3, v0, La/dur0;

    .line 225
    .line 226
    const/4 v4, 0x0

    .line 227
    if-eqz v3, :cond_f

    .line 228
    .line 229
    check-cast v0, La/dur0;

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_f
    move-object v0, v4

    .line 233
    :goto_2
    if-eqz v0, :cond_10

    .line 234
    .line 235
    iget-object v4, v0, La/dur0;->c:La/smr0;

    .line 236
    .line 237
    :cond_10
    move-object v3, v4

    .line 238
    if-nez v3, :cond_11

    .line 239
    .line 240
    const v0, -0x228ccf62    # -1.09523E18f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v9, v2}, La/fet;->r(Z)V

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_11
    const v0, -0x228ccf61

    .line 251
    .line 252
    .line 253
    invoke-virtual {v9, v0}, La/fet;->e0(I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    if-nez v0, :cond_12

    .line 265
    .line 266
    if-ne v4, v6, :cond_13

    .line 267
    .line 268
    :cond_12
    new-instance v4, La/sbr0;

    .line 269
    .line 270
    const/16 v0, 0x8

    .line 271
    .line 272
    invoke-direct {v4, v8, v0}, La/sbr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    :cond_13
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 279
    .line 280
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    const/16 v7, 0x9

    .line 289
    .line 290
    if-nez v0, :cond_14

    .line 291
    .line 292
    if-ne v5, v6, :cond_15

    .line 293
    .line 294
    :cond_14
    new-instance v5, La/sbr0;

    .line 295
    .line 296
    invoke-direct {v5, v8, v7}, La/sbr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v9, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    :cond_15
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 303
    .line 304
    shl-int/lit8 v0, v10, 0x9

    .line 305
    .line 306
    and-int/lit16 v8, v0, 0x1c00

    .line 307
    .line 308
    move-object v6, v1

    .line 309
    move-object v7, v9

    .line 310
    invoke-static/range {v3 .. v8}, La/ewm0;->i(La/smr0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/mm40;La/fet;I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v7, v2}, La/fet;->r(Z)V

    .line 314
    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_16
    move-object v7, v9

    .line 318
    invoke-virtual {v7}, La/fet;->X()V

    .line 319
    .line 320
    .line 321
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    return-object v0

    .line 324
    nop

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
