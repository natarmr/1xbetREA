.class public final synthetic La/shl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(La/l7m0;JJJB)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/shl0;->a:B

    iput-object p1, p0, La/shl0;->b:La/l7m0;

    iput-wide p2, p0, La/shl0;->c:J

    iput-wide p4, p0, La/shl0;->d:J

    iput-wide p6, p0, La/shl0;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/shl0;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x40000000    # 2.0f

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const/16 v6, 0x20

    .line 10
    .line 11
    iget-wide v7, v0, La/shl0;->d:J

    .line 12
    .line 13
    iget-wide v9, v0, La/shl0;->c:J

    .line 14
    .line 15
    iget-object v11, v0, La/shl0;->b:La/l7m0;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v12, p1

    .line 21
    .line 22
    check-cast v12, La/fhl;

    .line 23
    .line 24
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v1, La/qmk;->a:La/zcl;

    .line 28
    .line 29
    const/high16 v1, 0x41200000    # 10.0f

    .line 30
    .line 31
    invoke-interface {v12, v1}, La/w6k;->w0(F)F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    int-to-long v13, v13

    .line 40
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const-wide v23, 0xffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    int-to-long v4, v1

    .line 50
    shl-long/2addr v13, v6

    .line 51
    and-long v4, v4, v23

    .line 52
    .line 53
    or-long v19, v13, v4

    .line 54
    .line 55
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_0

    .line 66
    .line 67
    move-wide v13, v9

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move-wide v13, v7

    .line 70
    :goto_0
    invoke-interface {v12}, La/fhl;->d()J

    .line 71
    .line 72
    .line 73
    move-result-wide v17

    .line 74
    const/16 v21, 0x0

    .line 75
    .line 76
    const/16 v22, 0xf2

    .line 77
    .line 78
    const-wide/16 v15, 0x0

    .line 79
    .line 80
    invoke-static/range {v12 .. v22}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_1

    .line 94
    .line 95
    invoke-interface {v12, v3}, La/w6k;->w0(F)F

    .line 96
    .line 97
    .line 98
    move-result v26

    .line 99
    div-float v1, v26, v2

    .line 100
    .line 101
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    int-to-long v2, v2

    .line 106
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    int-to-long v4, v1

    .line 111
    shl-long v1, v2, v6

    .line 112
    .line 113
    and-long v3, v4, v23

    .line 114
    .line 115
    or-long v15, v1, v3

    .line 116
    .line 117
    invoke-interface {v12}, La/fhl;->d()J

    .line 118
    .line 119
    .line 120
    move-result-wide v1

    .line 121
    shr-long/2addr v1, v6

    .line 122
    long-to-int v1, v1

    .line 123
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    sub-float v1, v1, v26

    .line 128
    .line 129
    invoke-interface {v12}, La/fhl;->d()J

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    and-long v2, v2, v23

    .line 134
    .line 135
    long-to-int v2, v2

    .line 136
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    sub-float v2, v2, v26

    .line 141
    .line 142
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    int-to-long v3, v1

    .line 147
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    int-to-long v1, v1

    .line 152
    shl-long/2addr v3, v6

    .line 153
    and-long v1, v1, v23

    .line 154
    .line 155
    or-long v17, v3, v1

    .line 156
    .line 157
    new-instance v21, La/vtm0;

    .line 158
    .line 159
    const/16 v30, 0x0

    .line 160
    .line 161
    const/16 v31, 0x1e

    .line 162
    .line 163
    const/16 v27, 0x0

    .line 164
    .line 165
    const/16 v28, 0x0

    .line 166
    .line 167
    const/16 v29, 0x0

    .line 168
    .line 169
    move-object/from16 v25, v21

    .line 170
    .line 171
    invoke-direct/range {v25 .. v31}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 172
    .line 173
    .line 174
    const/16 v22, 0xe0

    .line 175
    .line 176
    iget-wide v13, v0, La/shl0;->e:J

    .line 177
    .line 178
    invoke-static/range {v12 .. v22}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 179
    .line 180
    .line 181
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object v0

    .line 184
    :pswitch_0
    const-wide v23, 0xffffffffL

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    move-object/from16 v1, p1

    .line 190
    .line 191
    check-cast v1, La/fhl;

    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    sget-object v4, La/qmk;->a:La/zcl;

    .line 197
    .line 198
    const/high16 v4, 0x41600000    # 14.0f

    .line 199
    .line 200
    invoke-interface {v1, v4}, La/w6k;->w0(F)F

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    int-to-long v12, v5

    .line 209
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    int-to-long v4, v4

    .line 214
    shl-long/2addr v12, v6

    .line 215
    and-long v4, v4, v23

    .line 216
    .line 217
    or-long v19, v12, v4

    .line 218
    .line 219
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    check-cast v4, Ljava/lang/Boolean;

    .line 224
    .line 225
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-eqz v4, :cond_2

    .line 230
    .line 231
    move-wide v13, v9

    .line 232
    goto :goto_1

    .line 233
    :cond_2
    move-wide v13, v7

    .line 234
    :goto_1
    invoke-interface {v1}, La/fhl;->d()J

    .line 235
    .line 236
    .line 237
    move-result-wide v17

    .line 238
    const/16 v21, 0x0

    .line 239
    .line 240
    const/16 v22, 0xf2

    .line 241
    .line 242
    const-wide/16 v15, 0x0

    .line 243
    .line 244
    move-object v12, v1

    .line 245
    invoke-static/range {v12 .. v22}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 246
    .line 247
    .line 248
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    check-cast v4, Ljava/lang/Boolean;

    .line 253
    .line 254
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-eqz v4, :cond_3

    .line 259
    .line 260
    invoke-interface {v1, v3}, La/w6k;->w0(F)F

    .line 261
    .line 262
    .line 263
    move-result v8

    .line 264
    div-float v2, v8, v2

    .line 265
    .line 266
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    int-to-long v3, v3

    .line 271
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    int-to-long v9, v2

    .line 276
    shl-long v2, v3, v6

    .line 277
    .line 278
    and-long v4, v9, v23

    .line 279
    .line 280
    or-long/2addr v4, v2

    .line 281
    invoke-interface {v1}, La/fhl;->d()J

    .line 282
    .line 283
    .line 284
    move-result-wide v2

    .line 285
    shr-long/2addr v2, v6

    .line 286
    long-to-int v2, v2

    .line 287
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    sub-float/2addr v2, v8

    .line 292
    invoke-interface {v1}, La/fhl;->d()J

    .line 293
    .line 294
    .line 295
    move-result-wide v9

    .line 296
    and-long v9, v9, v23

    .line 297
    .line 298
    long-to-int v3, v9

    .line 299
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    sub-float/2addr v3, v8

    .line 304
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    int-to-long v9, v2

    .line 309
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    int-to-long v2, v2

    .line 314
    shl-long v6, v9, v6

    .line 315
    .line 316
    and-long v2, v2, v23

    .line 317
    .line 318
    or-long/2addr v2, v6

    .line 319
    new-instance v7, La/vtm0;

    .line 320
    .line 321
    const/4 v12, 0x0

    .line 322
    const/16 v13, 0x1e

    .line 323
    .line 324
    const/4 v9, 0x0

    .line 325
    const/4 v10, 0x0

    .line 326
    const/4 v11, 0x0

    .line 327
    invoke-direct/range {v7 .. v13}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 328
    .line 329
    .line 330
    const/16 v11, 0xe0

    .line 331
    .line 332
    iget-wide v8, v0, La/shl0;->e:J

    .line 333
    .line 334
    move-object v10, v7

    .line 335
    move-wide v6, v2

    .line 336
    move-wide v2, v8

    .line 337
    move-wide/from16 v8, v19

    .line 338
    .line 339
    invoke-static/range {v1 .. v11}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 340
    .line 341
    .line 342
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 343
    .line 344
    return-object v0

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
