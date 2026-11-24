.class public final synthetic La/ftc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ftc;->a:B

    iput-object p1, p0, La/ftc;->b:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ftc;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/ftc;->b:Lkotlin/jvm/functions/Function0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v0, p1

    .line 12
    .line 13
    check-cast v0, La/vj30;

    .line 14
    .line 15
    move-object/from16 v1, p2

    .line 16
    .line 17
    check-cast v1, La/pj30;

    .line 18
    .line 19
    move-object/from16 v2, p3

    .line 20
    .line 21
    check-cast v2, La/p4e;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-wide v4, v2, La/p4e;->a:J

    .line 30
    .line 31
    invoke-static {v4, v5}, La/p4e;->h(J)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    iget-wide v5, v2, La/p4e;->a:J

    .line 50
    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v11, 0x3

    .line 53
    const/4 v7, 0x0

    .line 54
    move v10, v9

    .line 55
    invoke-static/range {v5 .. v11}, La/p4e;->b(JIIIII)J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    invoke-interface {v1, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget v3, v1, La/pu90;->a:I

    .line 64
    .line 65
    iget-wide v4, v2, La/p4e;->a:J

    .line 66
    .line 67
    invoke-static {v4, v5}, La/p4e;->h(J)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    new-instance v4, La/cam;

    .line 72
    .line 73
    const/4 v5, 0x6

    .line 74
    invoke-direct {v4, v1, v5}, La/cam;-><init>(La/pu90;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v3, v2, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0

    .line 82
    :pswitch_0
    move-object/from16 v1, p1

    .line 83
    .line 84
    check-cast v1, La/mz3;

    .line 85
    .line 86
    move-object/from16 v8, p2

    .line 87
    .line 88
    check-cast v8, La/fet;

    .line 89
    .line 90
    move-object/from16 v3, p3

    .line 91
    .line 92
    check-cast v3, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    and-int/lit8 v4, v3, 0x6

    .line 102
    .line 103
    if-nez v4, :cond_1

    .line 104
    .line 105
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_0

    .line 110
    .line 111
    const/4 v4, 0x4

    .line 112
    goto :goto_0

    .line 113
    :cond_0
    const/4 v4, 0x2

    .line 114
    :goto_0
    or-int/2addr v3, v4

    .line 115
    :cond_1
    and-int/lit8 v4, v3, 0x13

    .line 116
    .line 117
    const/16 v5, 0x12

    .line 118
    .line 119
    if-eq v4, v5, :cond_2

    .line 120
    .line 121
    const/4 v2, 0x1

    .line 122
    :cond_2
    and-int/lit8 v4, v3, 0x1

    .line 123
    .line 124
    invoke-virtual {v8, v4, v2}, La/fet;->U(IZ)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_3

    .line 129
    .line 130
    sget-object v2, La/qmk;->a:La/zcl;

    .line 131
    .line 132
    const/high16 v2, 0x42e40000    # 114.0f

    .line 133
    .line 134
    sget-object v4, La/jm40;->b:La/jm40;

    .line 135
    .line 136
    invoke-static {v4, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    sget-object v4, La/qmk;->i:La/zcl;

    .line 141
    .line 142
    sget-object v5, La/vgg0;->a:La/ugg0;

    .line 143
    .line 144
    invoke-static {v4, v4, v4, v4, v2}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    const/4 v13, 0x0

    .line 149
    const/16 v15, 0x1c

    .line 150
    .line 151
    const/4 v10, 0x0

    .line 152
    const/4 v11, 0x0

    .line 153
    const/4 v12, 0x0

    .line 154
    iget-object v14, v0, La/ftc;->b:Lkotlin/jvm/functions/Function0;

    .line 155
    .line 156
    invoke-static/range {v9 .. v15}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    and-int/lit8 v2, v3, 0xe

    .line 161
    .line 162
    or-int/lit8 v9, v2, 0x30

    .line 163
    .line 164
    const/16 v10, 0x78

    .line 165
    .line 166
    const-string v2, ""

    .line 167
    .line 168
    const/4 v4, 0x0

    .line 169
    const/4 v5, 0x0

    .line 170
    const/4 v6, 0x0

    .line 171
    const/4 v7, 0x0

    .line 172
    move-object v3, v0

    .line 173
    invoke-static/range {v1 .. v10}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_3
    invoke-virtual {v8}, La/fet;->X()V

    .line 178
    .line 179
    .line 180
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    return-object v0

    .line 183
    :pswitch_1
    move-object/from16 v0, p1

    .line 184
    .line 185
    check-cast v0, La/vj30;

    .line 186
    .line 187
    move-object/from16 v1, p2

    .line 188
    .line 189
    check-cast v1, La/pj30;

    .line 190
    .line 191
    move-object/from16 v2, p3

    .line 192
    .line 193
    check-cast v2, La/p4e;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-wide v4, v2, La/p4e;->a:J

    .line 202
    .line 203
    invoke-interface {v1, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    iget v2, v1, La/pu90;->b:I

    .line 208
    .line 209
    int-to-float v2, v2

    .line 210
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    check-cast v3, Ljava/lang/Number;

    .line 215
    .line 216
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    mul-float/2addr v3, v2

    .line 221
    invoke-static {v3}, La/si30;->b(F)I

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    iget v3, v1, La/pu90;->a:I

    .line 226
    .line 227
    iget v4, v1, La/pu90;->b:I

    .line 228
    .line 229
    sub-int/2addr v4, v2

    .line 230
    new-instance v5, La/n7;

    .line 231
    .line 232
    const/16 v6, 0x9

    .line 233
    .line 234
    invoke-direct {v5, v1, v2, v6}, La/n7;-><init>(La/pu90;IB)V

    .line 235
    .line 236
    .line 237
    invoke-static {v0, v3, v4, v5}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    return-object v0

    .line 242
    :pswitch_2
    move-object/from16 v1, p1

    .line 243
    .line 244
    check-cast v1, La/mm40;

    .line 245
    .line 246
    move-object/from16 v1, p2

    .line 247
    .line 248
    check-cast v1, La/fet;

    .line 249
    .line 250
    move-object/from16 v3, p3

    .line 251
    .line 252
    check-cast v3, Ljava/lang/Integer;

    .line 253
    .line 254
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    const v3, -0x2d10e1f7

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 261
    .line 262
    .line 263
    sget-object v3, La/a6x;->a:La/zfn;

    .line 264
    .line 265
    invoke-virtual {v1, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    move-object v6, v3

    .line 270
    check-cast v6, La/d6x;

    .line 271
    .line 272
    if-eqz v6, :cond_4

    .line 273
    .line 274
    const v3, -0x5fa58202

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v2}, La/fet;->r(Z)V

    .line 281
    .line 282
    .line 283
    const/4 v3, 0x0

    .line 284
    :goto_2
    move-object v5, v3

    .line 285
    goto :goto_3

    .line 286
    :cond_4
    const v3, -0x5fa37bf8

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    sget-object v4, La/ukd;->a:La/cl5;

    .line 297
    .line 298
    if-ne v3, v4, :cond_5

    .line 299
    .line 300
    invoke-static {v1}, La/dw9;->j(La/fet;)La/gy40;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    :cond_5
    check-cast v3, La/gy40;

    .line 305
    .line 306
    invoke-virtual {v1, v2}, La/fet;->r(Z)V

    .line 307
    .line 308
    .line 309
    goto :goto_2

    .line 310
    :goto_3
    sget-object v4, La/jm40;->b:La/jm40;

    .line 311
    .line 312
    const/4 v7, 0x1

    .line 313
    const/4 v8, 0x0

    .line 314
    iget-object v9, v0, La/ftc;->b:Lkotlin/jvm/functions/Function0;

    .line 315
    .line 316
    invoke-static/range {v4 .. v9}, La/y860;->V(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;)La/mm40;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-virtual {v1, v2}, La/fet;->r(Z)V

    .line 321
    .line 322
    .line 323
    return-object v0

    .line 324
    nop

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
