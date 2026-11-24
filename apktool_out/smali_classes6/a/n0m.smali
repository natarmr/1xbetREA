.class public final synthetic La/n0m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;JJILa/ope;JLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/n0m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n0m;->b:La/mm40;

    iput-wide p2, p0, La/n0m;->c:J

    iput-wide p4, p0, La/n0m;->d:J

    iput p6, p0, La/n0m;->f:I

    iput-object p7, p0, La/n0m;->g:Ljava/lang/Object;

    iput-wide p8, p0, La/n0m;->e:J

    iput-object p10, p0, La/n0m;->h:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Lkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;JJJI)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/n0m;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/n0m;->b:La/mm40;

    iput-object p2, p0, La/n0m;->g:Ljava/lang/Object;

    iput-object p3, p0, La/n0m;->h:Ljava/lang/Object;

    iput-wide p4, p0, La/n0m;->c:J

    iput-wide p6, p0, La/n0m;->d:J

    iput-wide p8, p0, La/n0m;->e:J

    iput p10, p0, La/n0m;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/n0m;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget v3, v0, La/n0m;->f:I

    .line 7
    .line 8
    iget-object v4, v0, La/n0m;->h:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, v0, La/n0m;->g:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v7, v5

    .line 16
    check-cast v7, Lkotlin/ranges/IntRange;

    .line 17
    .line 18
    move-object v8, v4

    .line 19
    check-cast v8, Lkotlin/ranges/IntRange;

    .line 20
    .line 21
    move-object/from16 v15, p1

    .line 22
    .line 23
    check-cast v15, La/fet;

    .line 24
    .line 25
    move-object/from16 v1, p2

    .line 26
    .line 27
    check-cast v1, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    or-int/lit8 v1, v3, 0x1

    .line 33
    .line 34
    invoke-static {v1}, La/x8x;->L(I)I

    .line 35
    .line 36
    .line 37
    move-result v16

    .line 38
    iget-object v6, v0, La/n0m;->b:La/mm40;

    .line 39
    .line 40
    iget-wide v9, v0, La/n0m;->c:J

    .line 41
    .line 42
    iget-wide v11, v0, La/n0m;->d:J

    .line 43
    .line 44
    iget-wide v13, v0, La/n0m;->e:J

    .line 45
    .line 46
    invoke-static/range {v6 .. v16}, La/dyb;->b(La/mm40;Lkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;JJJLa/fet;I)V

    .line 47
    .line 48
    .line 49
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_0
    check-cast v5, La/ope;

    .line 53
    .line 54
    move-object v6, v4

    .line 55
    check-cast v6, Ljava/lang/String;

    .line 56
    .line 57
    move-object/from16 v1, p1

    .line 58
    .line 59
    check-cast v1, La/fet;

    .line 60
    .line 61
    move-object/from16 v4, p2

    .line 62
    .line 63
    check-cast v4, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    and-int/lit8 v7, v4, 0x3

    .line 70
    .line 71
    const/4 v8, 0x2

    .line 72
    if-eq v7, v8, :cond_0

    .line 73
    .line 74
    move v7, v2

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/4 v7, 0x0

    .line 77
    :goto_0
    and-int/2addr v4, v2

    .line 78
    invoke-virtual {v1, v4, v7}, La/fet;->U(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    sget-object v4, La/qmk;->a:La/zcl;

    .line 85
    .line 86
    const/high16 v4, 0x41a00000    # 20.0f

    .line 87
    .line 88
    iget-object v7, v0, La/n0m;->b:La/mm40;

    .line 89
    .line 90
    invoke-static {v7, v4}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    sget-object v7, La/vgg0;->a:La/ugg0;

    .line 95
    .line 96
    sget-object v9, La/jm40;->b:La/jm40;

    .line 97
    .line 98
    const/high16 v10, 0x40000000    # 2.0f

    .line 99
    .line 100
    iget-wide v11, v0, La/n0m;->c:J

    .line 101
    .line 102
    invoke-static {v9, v10, v11, v12, v7}, La/i120;->S(La/mm40;FJLa/yjj0;)La/mm40;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-interface {v4, v9}, La/mm40;->e(La/mm40;)La/mm40;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-static {v4, v10}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    iget-wide v11, v0, La/n0m;->d:J

    .line 115
    .line 116
    invoke-static {v4, v11, v12, v7}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    const/high16 v7, 0x40c00000    # 6.0f

    .line 121
    .line 122
    const/4 v9, 0x0

    .line 123
    invoke-static {v4, v7, v9, v8}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    sget-object v7, La/gqw0;->n:La/xx7;

    .line 128
    .line 129
    new-instance v8, La/qw3;

    .line 130
    .line 131
    new-instance v9, La/gne;

    .line 132
    .line 133
    const/16 v11, 0xc

    .line 134
    .line 135
    invoke-direct {v9, v7, v11}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 136
    .line 137
    .line 138
    invoke-direct {v8, v10, v2, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 139
    .line 140
    .line 141
    sget-object v7, La/gqw0;->k:La/yx7;

    .line 142
    .line 143
    const/16 v9, 0x30

    .line 144
    .line 145
    invoke-static {v8, v7, v1, v9}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    iget-wide v8, v1, La/fet;->T:J

    .line 150
    .line 151
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    invoke-static {v1, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 164
    .line 165
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, La/fet;->i0()V

    .line 169
    .line 170
    .line 171
    iget-boolean v10, v1, La/fet;->S:Z

    .line 172
    .line 173
    if-eqz v10, :cond_1

    .line 174
    .line 175
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 176
    .line 177
    invoke-virtual {v1, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 182
    .line 183
    .line 184
    :goto_1
    sget-object v10, La/gqw0;->x:La/shd;

    .line 185
    .line 186
    invoke-static {v1, v7, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 187
    .line 188
    .line 189
    sget-object v7, La/gqw0;->w:La/shd;

    .line 190
    .line 191
    invoke-static {v1, v9, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    sget-object v8, La/gqw0;->y:La/shd;

    .line 199
    .line 200
    invoke-static {v1, v7, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 204
    .line 205
    .line 206
    sget-object v7, La/gqw0;->v:La/shd;

    .line 207
    .line 208
    invoke-static {v1, v4, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v3, v5}, La/tdc;->L(ILa/ope;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    invoke-static {}, La/g1t0;->b()La/y9q0;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-static {v3}, La/tdc;->J(La/y9q0;)La/y9q0;

    .line 220
    .line 221
    .line 222
    move-result-object v27

    .line 223
    const/16 v30, 0x0

    .line 224
    .line 225
    const v31, 0x1fffa

    .line 226
    .line 227
    .line 228
    const/4 v8, 0x0

    .line 229
    iget-wide v9, v0, La/n0m;->e:J

    .line 230
    .line 231
    const/4 v11, 0x0

    .line 232
    const-wide/16 v12, 0x0

    .line 233
    .line 234
    const/4 v14, 0x0

    .line 235
    const/4 v15, 0x0

    .line 236
    const/16 v16, 0x0

    .line 237
    .line 238
    const-wide/16 v17, 0x0

    .line 239
    .line 240
    const/16 v19, 0x0

    .line 241
    .line 242
    const-wide/16 v20, 0x0

    .line 243
    .line 244
    const/16 v22, 0x0

    .line 245
    .line 246
    const/16 v23, 0x0

    .line 247
    .line 248
    const/16 v24, 0x0

    .line 249
    .line 250
    const/16 v25, 0x0

    .line 251
    .line 252
    const/16 v26, 0x0

    .line 253
    .line 254
    const/16 v29, 0x0

    .line 255
    .line 256
    move-object/from16 v28, v1

    .line 257
    .line 258
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 259
    .line 260
    .line 261
    move-wide v8, v9

    .line 262
    move-object/from16 v27, v28

    .line 263
    .line 264
    invoke-static {}, La/g1t0;->b()La/y9q0;

    .line 265
    .line 266
    .line 267
    move-result-object v26

    .line 268
    const/16 v29, 0x6180

    .line 269
    .line 270
    const v30, 0x1affa

    .line 271
    .line 272
    .line 273
    const/4 v7, 0x0

    .line 274
    const/4 v10, 0x0

    .line 275
    const-wide/16 v11, 0x0

    .line 276
    .line 277
    const/4 v13, 0x0

    .line 278
    const-wide/16 v16, 0x0

    .line 279
    .line 280
    const/16 v18, 0x0

    .line 281
    .line 282
    const-wide/16 v19, 0x0

    .line 283
    .line 284
    const/16 v21, 0x2

    .line 285
    .line 286
    const/16 v23, 0x1

    .line 287
    .line 288
    const/16 v25, 0x0

    .line 289
    .line 290
    const/16 v28, 0x0

    .line 291
    .line 292
    invoke-static/range {v6 .. v30}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 293
    .line 294
    .line 295
    move-object/from16 v0, v27

    .line 296
    .line 297
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 298
    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_2
    move-object v0, v1

    .line 302
    invoke-virtual {v0}, La/fet;->X()V

    .line 303
    .line 304
    .line 305
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object v0

    .line 308
    nop

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
