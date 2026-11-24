.class public final synthetic La/tfp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/a5a0;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/a5a0;La/mm40;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/tfp;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/tfp;->c:La/a5a0;

    iput-object p2, p0, La/tfp;->b:La/mm40;

    iput-object p3, p0, La/tfp;->d:Lkotlin/jvm/functions/Function2;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/a5a0;Lkotlin/jvm/functions/Function2;I)V
    .locals 0

    .line 1
    const/4 p4, 0x1

    iput-byte p4, p0, La/tfp;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/tfp;->b:La/mm40;

    iput-object p2, p0, La/tfp;->c:La/a5a0;

    iput-object p3, p0, La/tfp;->d:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tfp;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/tfp;->d:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    iget-object v3, v0, La/tfp;->c:La/a5a0;

    .line 8
    .line 9
    iget-object v0, v0, La/tfp;->b:La/mm40;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, La/fet;

    .line 18
    .line 19
    move-object/from16 v5, p2

    .line 20
    .line 21
    check-cast v5, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v4}, La/x8x;->L(I)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-static {v0, v3, v2, v1, v4}, La/xkb;->t(La/mm40;La/a5a0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    move-object/from16 v8, p1

    .line 37
    .line 38
    check-cast v8, La/fet;

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
    and-int/lit8 v5, v1, 0x3

    .line 49
    .line 50
    const/4 v6, 0x2

    .line 51
    const/4 v11, 0x0

    .line 52
    if-eq v5, v6, :cond_0

    .line 53
    .line 54
    move v5, v4

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move v5, v11

    .line 57
    :goto_0
    and-int/2addr v1, v4

    .line 58
    invoke-virtual {v8, v1, v5}, La/fet;->U(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_9

    .line 63
    .line 64
    iget-boolean v1, v3, La/a5a0;->c:Z

    .line 65
    .line 66
    invoke-virtual {v8, v1}, La/fet;->h(Z)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    sget-object v12, La/ukd;->a:La/cl5;

    .line 75
    .line 76
    if-nez v5, :cond_1

    .line 77
    .line 78
    if-ne v6, v12, :cond_3

    .line 79
    .line 80
    :cond_1
    if-eqz v1, :cond_2

    .line 81
    .line 82
    new-instance v1, La/x9p;

    .line 83
    .line 84
    sget-object v5, La/d4d;->M1:La/d4d;

    .line 85
    .line 86
    sget-object v6, La/d4d;->a:La/d4d;

    .line 87
    .line 88
    const v7, 0x7f08090a

    .line 89
    .line 90
    .line 91
    invoke-direct {v1, v7, v5, v6}, La/x9p;-><init>(ILa/d4d;La/d4d;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    move-object v6, v1

    .line 95
    goto :goto_2

    .line 96
    :cond_2
    new-instance v1, La/x9p;

    .line 97
    .line 98
    sget-object v5, La/d4d;->P1:La/d4d;

    .line 99
    .line 100
    sget-object v6, La/d4d;->b:La/d4d;

    .line 101
    .line 102
    const v7, 0x7f08090b

    .line 103
    .line 104
    .line 105
    invoke-direct {v1, v7, v5, v6}, La/x9p;-><init>(ILa/d4d;La/d4d;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :goto_2
    invoke-virtual {v8, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    move-object v1, v6

    .line 113
    check-cast v1, La/x9p;

    .line 114
    .line 115
    iget-object v5, v1, La/x9p;->c:La/d4d;

    .line 116
    .line 117
    invoke-static {v5, v8}, La/ibc;->Y(La/d4d;La/fet;)J

    .line 118
    .line 119
    .line 120
    move-result-wide v5

    .line 121
    const/4 v9, 0x0

    .line 122
    const/16 v10, 0xe

    .line 123
    .line 124
    const/4 v7, 0x0

    .line 125
    invoke-static/range {v5 .. v10}, La/m5k0;->b(JLa/j73;La/fet;II)La/l7m0;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    sget-object v6, La/qmk;->a:La/zcl;

    .line 130
    .line 131
    const/high16 v6, 0x41c00000    # 24.0f

    .line 132
    .line 133
    invoke-static {v0, v6}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v8, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    if-nez v6, :cond_4

    .line 146
    .line 147
    if-ne v7, v12, :cond_5

    .line 148
    .line 149
    :cond_4
    new-instance v7, La/ufp;

    .line 150
    .line 151
    invoke-direct {v7, v5, v4}, La/ufp;-><init>(La/l7m0;B)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v8, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_5
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 158
    .line 159
    invoke-static {v0, v7}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sget-object v5, La/vgg0;->a:La/ugg0;

    .line 164
    .line 165
    invoke-static {v0, v5}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    invoke-virtual {v8, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    or-int/2addr v0, v5

    .line 178
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    if-nez v0, :cond_6

    .line 183
    .line 184
    if-ne v5, v12, :cond_7

    .line 185
    .line 186
    :cond_6
    new-instance v5, La/gmo;

    .line 187
    .line 188
    const/16 v0, 0xa

    .line 189
    .line 190
    invoke-direct {v5, v2, v3, v0}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v8, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_7
    move-object/from16 v18, v5

    .line 197
    .line 198
    check-cast v18, Lkotlin/jvm/functions/Function0;

    .line 199
    .line 200
    const/16 v19, 0x1c

    .line 201
    .line 202
    const/4 v14, 0x0

    .line 203
    const/4 v15, 0x0

    .line 204
    const/16 v16, 0x0

    .line 205
    .line 206
    const/16 v17, 0x0

    .line 207
    .line 208
    invoke-static/range {v13 .. v19}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    sget-object v2, La/gqw0;->e:La/zx7;

    .line 213
    .line 214
    invoke-static {v2, v11}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    iget-wide v5, v8, La/fet;->T:J

    .line 219
    .line 220
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-static {v8, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 233
    .line 234
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v8}, La/fet;->i0()V

    .line 238
    .line 239
    .line 240
    iget-boolean v6, v8, La/fet;->S:Z

    .line 241
    .line 242
    if-eqz v6, :cond_8

    .line 243
    .line 244
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 245
    .line 246
    invoke-virtual {v8, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_8
    invoke-virtual {v8}, La/fet;->r0()V

    .line 251
    .line 252
    .line 253
    :goto_3
    sget-object v6, La/gqw0;->x:La/shd;

    .line 254
    .line 255
    invoke-static {v8, v2, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 256
    .line 257
    .line 258
    sget-object v2, La/gqw0;->w:La/shd;

    .line 259
    .line 260
    invoke-static {v8, v5, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 261
    .line 262
    .line 263
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    sget-object v3, La/gqw0;->y:La/shd;

    .line 268
    .line 269
    invoke-static {v8, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 270
    .line 271
    .line 272
    invoke-static {v8}, La/jpm0;->n(La/fet;)V

    .line 273
    .line 274
    .line 275
    sget-object v2, La/gqw0;->v:La/shd;

    .line 276
    .line 277
    invoke-static {v8, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 278
    .line 279
    .line 280
    sget-object v0, La/jm40;->b:La/jm40;

    .line 281
    .line 282
    const/high16 v2, 0x41600000    # 14.0f

    .line 283
    .line 284
    invoke-static {v0, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    iget v0, v1, La/x9p;->a:I

    .line 289
    .line 290
    const/4 v1, 0x6

    .line 291
    invoke-static {v0, v1, v8}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v0, v8}, La/iom0;->r(La/r2x;La/fet;)La/s4u0;

    .line 296
    .line 297
    .line 298
    move-result-object v5

    .line 299
    const/16 v13, 0x38

    .line 300
    .line 301
    const/16 v14, 0x78

    .line 302
    .line 303
    const/4 v6, 0x0

    .line 304
    move-object v12, v8

    .line 305
    const/4 v8, 0x0

    .line 306
    const/4 v9, 0x0

    .line 307
    const/4 v10, 0x0

    .line 308
    const/4 v11, 0x0

    .line 309
    invoke-static/range {v5 .. v14}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 310
    .line 311
    .line 312
    move-object v8, v12

    .line 313
    invoke-virtual {v8, v4}, La/fet;->r(Z)V

    .line 314
    .line 315
    .line 316
    goto :goto_4

    .line 317
    :cond_9
    invoke-virtual {v8}, La/fet;->X()V

    .line 318
    .line 319
    .line 320
    :goto_4
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
