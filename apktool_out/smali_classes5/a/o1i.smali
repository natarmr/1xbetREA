.class public final synthetic La/o1i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/p4i;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/p4i;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/o1i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o1i;->b:La/mm40;

    iput-object p2, p0, La/o1i;->c:La/p4i;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/p4i;I)V
    .locals 0

    .line 2
    const/4 p3, 0x1

    iput-byte p3, p0, La/o1i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o1i;->b:La/mm40;

    iput-object p2, p0, La/o1i;->c:La/p4i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/o1i;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/o1i;->c:La/p4i;

    .line 7
    .line 8
    iget-object v0, v0, La/o1i;->b:La/mm40;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/fet;

    .line 16
    .line 17
    move-object/from16 v4, p2

    .line 18
    .line 19
    check-cast v4, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, La/x8x;->L(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v0, v3, v1, v2}, La/vzb;->c(La/mm40;La/p4i;La/fet;I)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, La/fet;

    .line 37
    .line 38
    move-object/from16 v4, p2

    .line 39
    .line 40
    check-cast v4, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    and-int/lit8 v5, v4, 0x3

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    const/4 v7, 0x2

    .line 50
    if-eq v5, v7, :cond_0

    .line 51
    .line 52
    move v5, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v5, v6

    .line 55
    :goto_0
    and-int/2addr v4, v2

    .line 56
    invoke-virtual {v1, v4, v5}, La/fet;->U(IZ)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_7

    .line 61
    .line 62
    const/high16 v4, 0x3f800000    # 1.0f

    .line 63
    .line 64
    invoke-static {v0, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget-object v5, La/qmk;->a:La/zcl;

    .line 69
    .line 70
    const/high16 v5, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/4 v8, 0x0

    .line 73
    invoke-static {v0, v5, v8, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sget-object v9, La/uc9;->c:La/mw3;

    .line 78
    .line 79
    sget-object v10, La/gqw0;->m:La/xx7;

    .line 80
    .line 81
    invoke-static {v9, v10, v1, v6}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    iget-wide v10, v1, La/fet;->T:J

    .line 86
    .line 87
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    invoke-static {v1, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 100
    .line 101
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, La/fet;->i0()V

    .line 105
    .line 106
    .line 107
    iget-boolean v12, v1, La/fet;->S:Z

    .line 108
    .line 109
    sget-object v13, La/e7z;->u1:La/pcy;

    .line 110
    .line 111
    if-eqz v12, :cond_1

    .line 112
    .line 113
    invoke-virtual {v1, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 118
    .line 119
    .line 120
    :goto_1
    sget-object v12, La/gqw0;->x:La/shd;

    .line 121
    .line 122
    invoke-static {v1, v9, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    sget-object v9, La/gqw0;->w:La/shd;

    .line 126
    .line 127
    invoke-static {v1, v11, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    sget-object v11, La/gqw0;->y:La/shd;

    .line 135
    .line 136
    invoke-static {v1, v10, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 140
    .line 141
    .line 142
    sget-object v10, La/gqw0;->v:La/shd;

    .line 143
    .line 144
    invoke-static {v1, v0, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    sget-object v0, La/jm40;->b:La/jm40;

    .line 148
    .line 149
    invoke-static {v0, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    const/high16 v14, 0x42580000    # 54.0f

    .line 154
    .line 155
    invoke-static {v4, v14}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    sget-object v14, La/gqw0;->k:La/yx7;

    .line 160
    .line 161
    sget-object v15, La/uc9;->a:La/lw3;

    .line 162
    .line 163
    const/16 v5, 0x30

    .line 164
    .line 165
    invoke-static {v15, v14, v1, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    iget-wide v14, v1, La/fet;->T:J

    .line 170
    .line 171
    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    .line 172
    .line 173
    .line 174
    move-result v14

    .line 175
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 176
    .line 177
    .line 178
    move-result-object v15

    .line 179
    invoke-static {v1, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-virtual {v1}, La/fet;->i0()V

    .line 184
    .line 185
    .line 186
    iget-boolean v7, v1, La/fet;->S:Z

    .line 187
    .line 188
    if-eqz v7, :cond_2

    .line 189
    .line 190
    invoke-virtual {v1, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_2
    invoke-virtual {v1}, La/fet;->r0()V

    .line 195
    .line 196
    .line 197
    :goto_2
    invoke-static {v1, v5, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v1, v15, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v14, v1, v11, v1}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 204
    .line 205
    .line 206
    invoke-static {v1, v4, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 207
    .line 208
    .line 209
    const v4, 0x3eb33333    # 0.35f

    .line 210
    .line 211
    .line 212
    float-to-double v9, v4

    .line 213
    const-wide/16 v11, 0x0

    .line 214
    .line 215
    cmpl-double v5, v9, v11

    .line 216
    .line 217
    const-string v7, "invalid weight; must be greater than zero"

    .line 218
    .line 219
    if-lez v5, :cond_3

    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_3
    invoke-static {v7}, La/vcx;->a(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    :goto_3
    new-instance v5, La/x7z;

    .line 226
    .line 227
    const v9, 0x7f7fffff    # Float.MAX_VALUE

    .line 228
    .line 229
    .line 230
    cmpl-float v10, v4, v9

    .line 231
    .line 232
    if-lez v10, :cond_4

    .line 233
    .line 234
    move v10, v9

    .line 235
    goto :goto_4

    .line 236
    :cond_4
    move v10, v4

    .line 237
    :goto_4
    invoke-direct {v5, v10, v2}, La/x7z;-><init>(FZ)V

    .line 238
    .line 239
    .line 240
    iget-object v10, v3, La/p4i;->a:La/o4i;

    .line 241
    .line 242
    invoke-static {v5, v10, v1, v6}, La/vzb;->t(La/mm40;La/o4i;La/fet;I)V

    .line 243
    .line 244
    .line 245
    const/high16 v5, 0x41000000    # 8.0f

    .line 246
    .line 247
    const/4 v10, 0x2

    .line 248
    invoke-static {v0, v5, v8, v10}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    new-instance v5, La/lpm;

    .line 253
    .line 254
    new-instance v8, La/hpm;

    .line 255
    .line 256
    const-wide/16 v13, 0x0

    .line 257
    .line 258
    const/4 v10, 0x3

    .line 259
    invoke-direct {v8, v13, v14, v10}, La/hpm;-><init>(JI)V

    .line 260
    .line 261
    .line 262
    sget-object v10, La/opm;->a:La/opm;

    .line 263
    .line 264
    invoke-direct {v5, v10, v8}, La/lpm;-><init>(La/rpm;La/ipm;)V

    .line 265
    .line 266
    .line 267
    iget-boolean v8, v3, La/p4i;->e:Z

    .line 268
    .line 269
    invoke-static {v0, v5, v8, v1, v6}, La/n4c;->l(La/mm40;La/mpm;ZLa/fet;I)V

    .line 270
    .line 271
    .line 272
    float-to-double v13, v4

    .line 273
    cmpl-double v0, v13, v11

    .line 274
    .line 275
    if-lez v0, :cond_5

    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_5
    invoke-static {v7}, La/vcx;->a(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    :goto_5
    new-instance v0, La/x7z;

    .line 282
    .line 283
    cmpl-float v5, v4, v9

    .line 284
    .line 285
    if-lez v5, :cond_6

    .line 286
    .line 287
    move v4, v9

    .line 288
    :cond_6
    invoke-direct {v0, v4, v2}, La/x7z;-><init>(FZ)V

    .line 289
    .line 290
    .line 291
    iget-object v4, v3, La/p4i;->b:La/o4i;

    .line 292
    .line 293
    invoke-static {v0, v4, v1, v6}, La/vzb;->u(La/mm40;La/o4i;La/fet;I)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v2}, La/fet;->r(Z)V

    .line 297
    .line 298
    .line 299
    iget-object v0, v3, La/p4i;->c:Ljava/lang/String;

    .line 300
    .line 301
    iget-object v3, v3, La/p4i;->d:La/z1n;

    .line 302
    .line 303
    const/4 v4, 0x0

    .line 304
    invoke-static {v4, v0, v3, v1, v6}, La/vzb;->x(La/mm40;Ljava/lang/String;La/z1n;La/fet;I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v2}, La/fet;->r(Z)V

    .line 308
    .line 309
    .line 310
    goto :goto_6

    .line 311
    :cond_7
    invoke-virtual {v1}, La/fet;->X()V

    .line 312
    .line 313
    .line 314
    :goto_6
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
