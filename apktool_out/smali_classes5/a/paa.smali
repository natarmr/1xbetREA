.class public final synthetic La/paa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vaa;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/vaa;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/paa;->a:B

    iput-object p1, p0, La/paa;->b:La/vaa;

    iput-object p2, p0, La/paa;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/paa;->a:B

    .line 4
    .line 5
    const/16 v2, 0x30

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/16 v5, 0x12

    .line 10
    .line 11
    const/4 v6, 0x4

    .line 12
    const/4 v7, 0x5

    .line 13
    iget-object v8, v0, La/paa;->c:Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    iget-object v0, v0, La/paa;->b:La/vaa;

    .line 16
    .line 17
    const/4 v9, 0x2

    .line 18
    const/4 v10, 0x1

    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, La/mm40;

    .line 25
    .line 26
    move-object/from16 v11, p2

    .line 27
    .line 28
    check-cast v11, La/fet;

    .line 29
    .line 30
    move-object/from16 v12, p3

    .line 31
    .line 32
    check-cast v12, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v12

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    and-int/lit8 v13, v12, 0x6

    .line 42
    .line 43
    if-nez v13, :cond_1

    .line 44
    .line 45
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v13

    .line 49
    if-eqz v13, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v6, v9

    .line 53
    :goto_0
    or-int/2addr v12, v6

    .line 54
    :cond_1
    and-int/lit8 v6, v12, 0x13

    .line 55
    .line 56
    if-eq v6, v5, :cond_2

    .line 57
    .line 58
    move v4, v10

    .line 59
    :cond_2
    and-int/lit8 v5, v12, 0x1

    .line 60
    .line 61
    invoke-virtual {v11, v5, v4}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_3

    .line 66
    .line 67
    sget-object v4, La/cn80;->b:La/zfn;

    .line 68
    .line 69
    sget-object v5, La/w6n;->f:La/w6n;

    .line 70
    .line 71
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    sget-object v4, La/egp0;->a:La/zfn;

    .line 76
    .line 77
    sget-object v5, La/gqw0;->d:La/zx7;

    .line 78
    .line 79
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 80
    .line 81
    .line 82
    move-result-object v13

    .line 83
    sget-object v4, La/egp0;->c:La/zfn;

    .line 84
    .line 85
    sget-object v5, La/j1t0;->e:La/zfn;

    .line 86
    .line 87
    invoke-virtual {v11, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, La/g1t0;

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 101
    .line 102
    .line 103
    move-result-object v14

    .line 104
    sget-object v4, La/egp0;->b:La/zfn;

    .line 105
    .line 106
    invoke-static {v7, v4}, La/dw9;->k(ILa/zfn;)La/l5d0;

    .line 107
    .line 108
    .line 109
    move-result-object v15

    .line 110
    sget-object v4, La/cn80;->a:La/zfn;

    .line 111
    .line 112
    sget-object v5, La/bmd;->n:La/zfn;

    .line 113
    .line 114
    invoke-virtual {v11, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 119
    .line 120
    .line 121
    move-result-object v16

    .line 122
    sget-object v4, La/kcp0;->c:La/zfn;

    .line 123
    .line 124
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 127
    .line 128
    .line 129
    move-result-object v17

    .line 130
    sget-object v4, La/kcp0;->a:La/zfn;

    .line 131
    .line 132
    invoke-virtual {v4, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 133
    .line 134
    .line 135
    move-result-object v18

    .line 136
    sget-object v3, La/egp0;->d:La/zfn;

    .line 137
    .line 138
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v3, v4}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 143
    .line 144
    .line 145
    move-result-object v19

    .line 146
    filled-new-array/range {v12 .. v19}, [La/l5d0;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    new-instance v4, La/oaa;

    .line 151
    .line 152
    invoke-direct {v4, v1, v0, v8, v9}, La/oaa;-><init>(La/mm40;La/vaa;Lkotlin/jvm/functions/Function2;B)V

    .line 153
    .line 154
    .line 155
    const v0, -0x6b1fa9d0

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v4, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v3, v0, v11, v2}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_3
    invoke-virtual {v11}, La/fet;->X()V

    .line 167
    .line 168
    .line 169
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object v0

    .line 172
    :pswitch_0
    move-object/from16 v1, p1

    .line 173
    .line 174
    check-cast v1, La/mm40;

    .line 175
    .line 176
    move-object/from16 v11, p2

    .line 177
    .line 178
    check-cast v11, La/fet;

    .line 179
    .line 180
    move-object/from16 v12, p3

    .line 181
    .line 182
    check-cast v12, Ljava/lang/Integer;

    .line 183
    .line 184
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    and-int/lit8 v13, v12, 0x6

    .line 192
    .line 193
    if-nez v13, :cond_5

    .line 194
    .line 195
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    if-eqz v13, :cond_4

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_4
    move v6, v9

    .line 203
    :goto_2
    or-int/2addr v12, v6

    .line 204
    :cond_5
    and-int/lit8 v6, v12, 0x13

    .line 205
    .line 206
    if-eq v6, v5, :cond_6

    .line 207
    .line 208
    move v4, v10

    .line 209
    :cond_6
    and-int/lit8 v5, v12, 0x1

    .line 210
    .line 211
    invoke-virtual {v11, v5, v4}, La/fet;->U(IZ)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-eqz v4, :cond_7

    .line 216
    .line 217
    sget-object v4, La/cn80;->b:La/zfn;

    .line 218
    .line 219
    sget-object v5, La/w6n;->f:La/w6n;

    .line 220
    .line 221
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    sget-object v4, La/egp0;->a:La/zfn;

    .line 226
    .line 227
    sget-object v5, La/gqw0;->f:La/zx7;

    .line 228
    .line 229
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 230
    .line 231
    .line 232
    move-result-object v13

    .line 233
    sget-object v4, La/egp0;->c:La/zfn;

    .line 234
    .line 235
    sget-object v5, La/j1t0;->e:La/zfn;

    .line 236
    .line 237
    invoke-virtual {v11, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    check-cast v5, La/g1t0;

    .line 242
    .line 243
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 251
    .line 252
    .line 253
    move-result-object v14

    .line 254
    sget-object v4, La/egp0;->b:La/zfn;

    .line 255
    .line 256
    const/4 v5, 0x6

    .line 257
    invoke-static {v5, v4}, La/dw9;->k(ILa/zfn;)La/l5d0;

    .line 258
    .line 259
    .line 260
    move-result-object v15

    .line 261
    sget-object v4, La/cn80;->a:La/zfn;

    .line 262
    .line 263
    sget-object v5, La/bmd;->n:La/zfn;

    .line 264
    .line 265
    invoke-virtual {v11, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 270
    .line 271
    .line 272
    move-result-object v16

    .line 273
    sget-object v4, La/kcp0;->c:La/zfn;

    .line 274
    .line 275
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 276
    .line 277
    invoke-virtual {v4, v5}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 278
    .line 279
    .line 280
    move-result-object v17

    .line 281
    sget-object v4, La/kcp0;->a:La/zfn;

    .line 282
    .line 283
    invoke-virtual {v4, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 284
    .line 285
    .line 286
    move-result-object v18

    .line 287
    sget-object v3, La/egp0;->d:La/zfn;

    .line 288
    .line 289
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    invoke-virtual {v3, v4}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 294
    .line 295
    .line 296
    move-result-object v19

    .line 297
    filled-new-array/range {v12 .. v19}, [La/l5d0;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    new-instance v4, La/oaa;

    .line 302
    .line 303
    invoke-direct {v4, v1, v0, v8, v10}, La/oaa;-><init>(La/mm40;La/vaa;Lkotlin/jvm/functions/Function2;B)V

    .line 304
    .line 305
    .line 306
    const v0, 0x6164402e

    .line 307
    .line 308
    .line 309
    invoke-static {v0, v4, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-static {v3, v0, v11, v2}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 314
    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_7
    invoke-virtual {v11}, La/fet;->X()V

    .line 318
    .line 319
    .line 320
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 321
    .line 322
    return-object v0

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
