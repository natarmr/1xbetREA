.class public final synthetic La/pbg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/a4x;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/pbg;->a:B

    iput-object p1, p0, La/pbg;->b:La/a4x;

    iput-object p2, p0, La/pbg;->c:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, La/pbg;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a4x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput-byte v0, p0, La/pbg;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/pbg;->b:La/a4x;

    iput-object p2, p0, La/pbg;->d:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/pbg;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public synthetic constructor <init>(La/a4x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 3
    const/4 p4, 0x5

    iput-byte p4, p0, La/pbg;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/pbg;->b:La/a4x;

    iput-object p2, p0, La/pbg;->d:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/pbg;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pbg;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/pbg;->d:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object v3, v0, La/pbg;->b:La/a4x;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object v5, v0, La/pbg;->c:Lkotlin/jvm/functions/Function0;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v0, p1

    .line 16
    .line 17
    check-cast v0, La/fet;

    .line 18
    .line 19
    move-object/from16 v1, p2

    .line 20
    .line 21
    check-cast v1, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v4}, La/x8x;->L(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-static {v1, v0, v3, v5, v2}, La/dwi0;->w(ILa/fet;La/a4x;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    move-object/from16 v12, p1

    .line 37
    .line 38
    check-cast v12, La/fet;

    .line 39
    .line 40
    move-object/from16 v1, p2

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    and-int/lit8 v2, v1, 0x3

    .line 49
    .line 50
    const/4 v3, 0x2

    .line 51
    const/4 v15, 0x0

    .line 52
    if-eq v2, v3, :cond_0

    .line 53
    .line 54
    move v2, v4

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move v2, v15

    .line 57
    :goto_0
    and-int/2addr v1, v4

    .line 58
    invoke-virtual {v12, v1, v2}, La/fet;->U(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_4

    .line 63
    .line 64
    const/high16 v1, 0x3f800000    # 1.0f

    .line 65
    .line 66
    sget-object v6, La/jm40;->b:La/jm40;

    .line 67
    .line 68
    invoke-static {v6, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sget-object v2, La/qmk;->a:La/zcl;

    .line 73
    .line 74
    const/high16 v2, 0x44800000    # 1024.0f

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-static {v1, v3, v2, v4}, La/o7k0;->g(La/mm40;FFI)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    sget-object v2, La/uc9;->c:La/mw3;

    .line 82
    .line 83
    sget-object v3, La/gqw0;->m:La/xx7;

    .line 84
    .line 85
    invoke-static {v2, v3, v12, v15}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iget-wide v7, v12, La/fet;->T:J

    .line 90
    .line 91
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-static {v12, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 104
    .line 105
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v12}, La/fet;->i0()V

    .line 109
    .line 110
    .line 111
    iget-boolean v8, v12, La/fet;->S:Z

    .line 112
    .line 113
    if-eqz v8, :cond_1

    .line 114
    .line 115
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 116
    .line 117
    invoke-virtual {v12, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    invoke-virtual {v12}, La/fet;->r0()V

    .line 122
    .line 123
    .line 124
    :goto_1
    sget-object v8, La/gqw0;->x:La/shd;

    .line 125
    .line 126
    invoke-static {v12, v2, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 127
    .line 128
    .line 129
    sget-object v2, La/gqw0;->w:La/shd;

    .line 130
    .line 131
    invoke-static {v12, v7, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    sget-object v3, La/gqw0;->y:La/shd;

    .line 139
    .line 140
    invoke-static {v12, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 144
    .line 145
    .line 146
    sget-object v2, La/gqw0;->v:La/shd;

    .line 147
    .line 148
    invoke-static {v12, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    const/4 v10, 0x0

    .line 152
    const/16 v11, 0x8

    .line 153
    .line 154
    const/high16 v7, 0x41400000    # 12.0f

    .line 155
    .line 156
    const/high16 v8, 0x41200000    # 10.0f

    .line 157
    .line 158
    const/high16 v9, 0x41400000    # 12.0f

    .line 159
    .line 160
    invoke-static/range {v6 .. v11}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    move-object v2, v6

    .line 165
    const/16 v13, 0xd80

    .line 166
    .line 167
    const/16 v14, 0x10

    .line 168
    .line 169
    iget-object v7, v0, La/pbg;->b:La/a4x;

    .line 170
    .line 171
    sget-object v8, La/t3n;->a:La/t3n;

    .line 172
    .line 173
    const/4 v9, 0x1

    .line 174
    const/4 v10, 0x0

    .line 175
    iget-object v11, v0, La/pbg;->d:Lkotlin/jvm/functions/Function1;

    .line 176
    .line 177
    move-object v6, v1

    .line 178
    invoke-static/range {v6 .. v14}, La/tdc;->m(La/mm40;La/a4x;La/v3n;ZLa/xcz;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    if-nez v0, :cond_2

    .line 190
    .line 191
    sget-object v0, La/ukd;->a:La/cl5;

    .line 192
    .line 193
    if-ne v1, v0, :cond_3

    .line 194
    .line 195
    :cond_2
    new-instance v1, La/dbn;

    .line 196
    .line 197
    const/16 v0, 0xd

    .line 198
    .line 199
    invoke-direct {v1, v5, v0}, La/dbn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :cond_3
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 206
    .line 207
    const/high16 v0, 0x41c00000    # 24.0f

    .line 208
    .line 209
    const/high16 v3, 0x41400000    # 12.0f

    .line 210
    .line 211
    invoke-static {v2, v3, v0, v3, v3}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v15, v15, v12, v0, v1}, La/x1x;->l(IILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_4
    invoke-virtual {v12}, La/fet;->X()V

    .line 223
    .line 224
    .line 225
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object v0

    .line 228
    :pswitch_1
    move-object/from16 v0, p1

    .line 229
    .line 230
    check-cast v0, La/fet;

    .line 231
    .line 232
    move-object/from16 v1, p2

    .line 233
    .line 234
    check-cast v1, Ljava/lang/Integer;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-static {v4}, La/x8x;->L(I)I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    invoke-static {v1, v0, v3, v5, v2}, La/sj3;->G(ILa/fet;La/a4x;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 244
    .line 245
    .line 246
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_2
    move-object/from16 v0, p1

    .line 250
    .line 251
    check-cast v0, La/fet;

    .line 252
    .line 253
    move-object/from16 v1, p2

    .line 254
    .line 255
    check-cast v1, Ljava/lang/Integer;

    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-static {v4}, La/x8x;->L(I)I

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    invoke-static {v1, v0, v3, v5, v2}, La/ulb;->y(ILa/fet;La/a4x;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 265
    .line 266
    .line 267
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object v0

    .line 270
    :pswitch_3
    move-object/from16 v0, p1

    .line 271
    .line 272
    check-cast v0, La/fet;

    .line 273
    .line 274
    move-object/from16 v1, p2

    .line 275
    .line 276
    check-cast v1, Ljava/lang/Integer;

    .line 277
    .line 278
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-static {v4}, La/x8x;->L(I)I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    invoke-static {v1, v0, v3, v5, v2}, La/j2e;->C(ILa/fet;La/a4x;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 286
    .line 287
    .line 288
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_4
    move-object/from16 v0, p1

    .line 292
    .line 293
    check-cast v0, La/fet;

    .line 294
    .line 295
    move-object/from16 v1, p2

    .line 296
    .line 297
    check-cast v1, Ljava/lang/Integer;

    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-static {v4}, La/x8x;->L(I)I

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    invoke-static {v1, v0, v3, v5, v2}, La/tke;->s(ILa/fet;La/a4x;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 307
    .line 308
    .line 309
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object v0

    .line 312
    nop

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
