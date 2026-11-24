.class public final synthetic La/u13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Z

.field public final synthetic d:J

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IIJLa/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    iput-byte p1, p0, La/u13;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, La/u13;->b:La/mm40;

    iput-object p6, p0, La/u13;->e:Ljava/lang/Object;

    iput-wide p3, p0, La/u13;->d:J

    iput-object p7, p0, La/u13;->f:Ljava/lang/Object;

    iput-boolean p2, p0, La/u13;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;ZLjava/lang/String;JI)V
    .locals 0

    .line 3
    const/4 p7, 0x3

    iput-byte p7, p0, La/u13;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/u13;->b:La/mm40;

    iput-object p2, p0, La/u13;->e:Ljava/lang/Object;

    iput-boolean p3, p0, La/u13;->c:Z

    iput-object p4, p0, La/u13;->f:Ljava/lang/Object;

    iput-wide p5, p0, La/u13;->d:J

    return-void
.end method

.method public synthetic constructor <init>(La/o0x;La/mm40;ZJLa/pm80;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/u13;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/u13;->e:Ljava/lang/Object;

    iput-object p2, p0, La/u13;->b:La/mm40;

    iput-boolean p3, p0, La/u13;->c:Z

    iput-wide p4, p0, La/u13;->d:J

    iput-object p6, p0, La/u13;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/wgu0;JZLa/mm40;La/ye60;)V
    .locals 1

    .line 4
    const/4 v0, 0x0

    iput-byte v0, p0, La/u13;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/u13;->e:Ljava/lang/Object;

    iput-wide p2, p0, La/u13;->d:J

    iput-boolean p4, p0, La/u13;->c:Z

    iput-object p5, p0, La/u13;->b:La/mm40;

    iput-object p6, p0, La/u13;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u13;->a:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, v0, La/u13;->f:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, v0, La/u13;->e:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v8, v6

    .line 16
    check-cast v8, Ljava/lang/String;

    .line 17
    .line 18
    move-object v10, v5

    .line 19
    check-cast v10, Ljava/lang/String;

    .line 20
    .line 21
    move-object/from16 v13, p1

    .line 22
    .line 23
    check-cast v13, La/fet;

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
    invoke-static {v4}, La/x8x;->L(I)I

    .line 33
    .line 34
    .line 35
    move-result v14

    .line 36
    iget-object v7, v0, La/u13;->b:La/mm40;

    .line 37
    .line 38
    iget-boolean v9, v0, La/u13;->c:Z

    .line 39
    .line 40
    iget-wide v11, v0, La/u13;->d:J

    .line 41
    .line 42
    invoke-static/range {v7 .. v14}, La/jiq0;->m(La/mm40;Ljava/lang/String;ZLjava/lang/String;JLa/fet;I)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_0
    move-object v7, v6

    .line 49
    check-cast v7, Ljava/lang/String;

    .line 50
    .line 51
    move-object v8, v5

    .line 52
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 53
    .line 54
    move-object/from16 v5, p1

    .line 55
    .line 56
    check-cast v5, La/fet;

    .line 57
    .line 58
    move-object/from16 v1, p2

    .line 59
    .line 60
    check-cast v1, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v4}, La/x8x;->L(I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget-boolean v2, v0, La/u13;->c:Z

    .line 70
    .line 71
    iget-wide v3, v0, La/u13;->d:J

    .line 72
    .line 73
    iget-object v6, v0, La/u13;->b:La/mm40;

    .line 74
    .line 75
    invoke-static/range {v1 .. v8}, La/km10;->e(IIJLa/fet;La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 76
    .line 77
    .line 78
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_1
    check-cast v6, La/o0x;

    .line 82
    .line 83
    move-object v11, v5

    .line 84
    check-cast v11, La/pm80;

    .line 85
    .line 86
    move-object/from16 v1, p1

    .line 87
    .line 88
    check-cast v1, La/fet;

    .line 89
    .line 90
    move-object/from16 v5, p2

    .line 91
    .line 92
    check-cast v5, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    and-int/lit8 v7, v5, 0x3

    .line 99
    .line 100
    if-eq v7, v2, :cond_0

    .line 101
    .line 102
    move v2, v4

    .line 103
    goto :goto_0

    .line 104
    :cond_0
    move v2, v3

    .line 105
    :goto_0
    and-int/2addr v4, v5

    .line 106
    invoke-virtual {v1, v4, v2}, La/fet;->U(IZ)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_6

    .line 111
    .line 112
    instance-of v2, v6, La/m0x;

    .line 113
    .line 114
    sget-object v4, La/tg40;->b:La/tg40;

    .line 115
    .line 116
    iget-object v5, v0, La/u13;->b:La/mm40;

    .line 117
    .line 118
    iget-boolean v7, v0, La/u13;->c:Z

    .line 119
    .line 120
    iget-wide v8, v0, La/u13;->d:J

    .line 121
    .line 122
    const/high16 v0, 0x41a00000    # 20.0f

    .line 123
    .line 124
    if-eqz v2, :cond_2

    .line 125
    .line 126
    const v2, -0x289921a6

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 130
    .line 131
    .line 132
    sget-object v2, La/qmk;->a:La/zcl;

    .line 133
    .line 134
    invoke-static {v5, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sget-object v2, La/rlx;->a:La/ykw;

    .line 139
    .line 140
    invoke-interface {v0, v4}, La/mm40;->e(La/mm40;)La/mm40;

    .line 141
    .line 142
    .line 143
    move-result-object v14

    .line 144
    check-cast v6, La/m0x;

    .line 145
    .line 146
    iget v0, v6, La/m0x;->a:I

    .line 147
    .line 148
    invoke-static {v0, v3, v1}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    if-eqz v7, :cond_1

    .line 153
    .line 154
    :goto_1
    move-wide v15, v8

    .line 155
    goto :goto_2

    .line 156
    :cond_1
    sget-wide v8, La/y3d;->g:J

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :goto_2
    const/16 v18, 0x38

    .line 160
    .line 161
    const/16 v19, 0x0

    .line 162
    .line 163
    const/4 v13, 0x0

    .line 164
    move-object/from16 v17, v1

    .line 165
    .line 166
    invoke-static/range {v12 .. v19}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v3}, La/fet;->r(Z)V

    .line 170
    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_2
    instance-of v2, v6, La/n0x;

    .line 174
    .line 175
    if-eqz v2, :cond_3

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_3
    instance-of v2, v6, La/l0x;

    .line 179
    .line 180
    if-eqz v2, :cond_5

    .line 181
    .line 182
    :goto_3
    const v2, -0x289225d2

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 186
    .line 187
    .line 188
    sget-object v2, La/qmk;->a:La/zcl;

    .line 189
    .line 190
    invoke-static {v5, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    sget-object v2, La/rlx;->a:La/ykw;

    .line 195
    .line 196
    invoke-interface {v0, v4}, La/mm40;->e(La/mm40;)La/mm40;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-interface {v6}, La/o0x;->a()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    if-eqz v7, :cond_4

    .line 205
    .line 206
    new-instance v4, La/m78;

    .line 207
    .line 208
    const/4 v5, 0x5

    .line 209
    invoke-direct {v4, v8, v9, v5}, La/m78;-><init>(JI)V

    .line 210
    .line 211
    .line 212
    :goto_4
    move-object/from16 v18, v4

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_4
    const/4 v4, 0x0

    .line 216
    goto :goto_4

    .line 217
    :goto_5
    const/16 v21, 0x0

    .line 218
    .line 219
    const/16 v22, 0x6fe8

    .line 220
    .line 221
    const/4 v8, 0x0

    .line 222
    const/4 v10, 0x0

    .line 223
    const/4 v12, 0x0

    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    const/16 v16, 0x0

    .line 228
    .line 229
    const/16 v17, 0x0

    .line 230
    .line 231
    const v20, 0x8030

    .line 232
    .line 233
    .line 234
    move-object v9, v0

    .line 235
    move-object/from16 v19, v1

    .line 236
    .line 237
    move-object v7, v2

    .line 238
    invoke-static/range {v7 .. v22}, La/k7x;->b(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/pm80;La/pm80;La/pm80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/a4d;La/fet;III)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v3}, La/fet;->r(Z)V

    .line 242
    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_5
    const v0, -0x64680f27

    .line 246
    .line 247
    .line 248
    invoke-static {v0, v1, v3}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    throw v0

    .line 253
    :cond_6
    invoke-virtual {v1}, La/fet;->X()V

    .line 254
    .line 255
    .line 256
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object v0

    .line 259
    :pswitch_2
    check-cast v6, La/wgu0;

    .line 260
    .line 261
    move-object v12, v5

    .line 262
    check-cast v12, La/ye60;

    .line 263
    .line 264
    move-object/from16 v1, p1

    .line 265
    .line 266
    check-cast v1, La/fet;

    .line 267
    .line 268
    move-object/from16 v5, p2

    .line 269
    .line 270
    check-cast v5, Ljava/lang/Integer;

    .line 271
    .line 272
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 273
    .line 274
    .line 275
    move-result v5

    .line 276
    and-int/lit8 v7, v5, 0x3

    .line 277
    .line 278
    if-eq v7, v2, :cond_7

    .line 279
    .line 280
    move v3, v4

    .line 281
    :cond_7
    and-int/lit8 v2, v5, 0x1

    .line 282
    .line 283
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    if-eqz v2, :cond_8

    .line 288
    .line 289
    sget-object v2, La/bmd;->t:La/zfn;

    .line 290
    .line 291
    invoke-virtual {v2, v6}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    new-instance v7, La/w13;

    .line 296
    .line 297
    iget-wide v8, v0, La/u13;->d:J

    .line 298
    .line 299
    iget-boolean v10, v0, La/u13;->c:Z

    .line 300
    .line 301
    iget-object v11, v0, La/u13;->b:La/mm40;

    .line 302
    .line 303
    invoke-direct/range {v7 .. v12}, La/w13;-><init>(JZLa/mm40;La/ye60;)V

    .line 304
    .line 305
    .line 306
    const v0, 0x4b1ac501    # 1.0142977E7f

    .line 307
    .line 308
    .line 309
    invoke-static {v0, v7, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    const/16 v3, 0x38

    .line 314
    .line 315
    invoke-static {v2, v0, v1, v3}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 316
    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_8
    invoke-virtual {v1}, La/fet;->X()V

    .line 320
    .line 321
    .line 322
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    return-object v0

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
