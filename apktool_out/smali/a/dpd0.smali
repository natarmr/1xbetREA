.class public final synthetic La/dpd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g9q0;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/pz40;

.field public final synthetic e:La/pz40;

.field public final synthetic f:La/pz40;

.field public final synthetic g:La/w6k;


# direct methods
.method public synthetic constructor <init>(La/g9q0;La/pz40;La/pz40;La/pz40;La/pz40;La/w6k;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/dpd0;->a:B

    iput-object p1, p0, La/dpd0;->b:La/g9q0;

    iput-object p2, p0, La/dpd0;->c:La/pz40;

    iput-object p3, p0, La/dpd0;->d:La/pz40;

    iput-object p4, p0, La/dpd0;->e:La/pz40;

    iput-object p5, p0, La/dpd0;->f:La/pz40;

    iput-object p6, p0, La/dpd0;->g:La/w6k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dpd0;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x42000000    # 32.0f

    .line 6
    .line 7
    const/high16 v3, 0x41400000    # 12.0f

    .line 8
    .line 9
    const/high16 v4, 0x40800000    # 4.0f

    .line 10
    .line 11
    const/high16 v5, 0x41c00000    # 24.0f

    .line 12
    .line 13
    const/high16 v6, 0x40000000    # 2.0f

    .line 14
    .line 15
    const/16 v7, 0x20

    .line 16
    .line 17
    iget-object v8, v0, La/dpd0;->g:La/w6k;

    .line 18
    .line 19
    iget-object v9, v0, La/dpd0;->f:La/pz40;

    .line 20
    .line 21
    iget-object v10, v0, La/dpd0;->e:La/pz40;

    .line 22
    .line 23
    iget-object v11, v0, La/dpd0;->d:La/pz40;

    .line 24
    .line 25
    iget-object v12, v0, La/dpd0;->c:La/pz40;

    .line 26
    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    new-instance v14, La/j83;

    .line 31
    .line 32
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-direct {v14, v1}, La/j83;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 42
    .line 43
    .line 44
    move-result-object v15

    .line 45
    const/16 v23, 0x0

    .line 46
    .line 47
    const/16 v24, 0x7ec

    .line 48
    .line 49
    iget-object v13, v0, La/dpd0;->b:La/g9q0;

    .line 50
    .line 51
    const/16 v16, 0x0

    .line 52
    .line 53
    const/16 v17, 0x0

    .line 54
    .line 55
    const/16 v18, 0x1

    .line 56
    .line 57
    const-wide/16 v19, 0x0

    .line 58
    .line 59
    const/16 v21, 0x0

    .line 60
    .line 61
    const/16 v22, 0x0

    .line 62
    .line 63
    invoke-static/range {v13 .. v24}, La/g9q0;->b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-object/from16 v25, v13

    .line 68
    .line 69
    iget-wide v0, v0, La/a9q0;->c:J

    .line 70
    .line 71
    shr-long/2addr v0, v7

    .line 72
    long-to-int v0, v0

    .line 73
    new-instance v1, La/j83;

    .line 74
    .line 75
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    check-cast v11, Ljava/lang/String;

    .line 80
    .line 81
    invoke-direct {v1, v11}, La/j83;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 85
    .line 86
    .line 87
    move-result-object v27

    .line 88
    const/16 v35, 0x0

    .line 89
    .line 90
    const/16 v36, 0x7ec

    .line 91
    .line 92
    const/16 v28, 0x0

    .line 93
    .line 94
    const/16 v29, 0x0

    .line 95
    .line 96
    const/16 v30, 0x1

    .line 97
    .line 98
    const-wide/16 v31, 0x0

    .line 99
    .line 100
    const/16 v33, 0x0

    .line 101
    .line 102
    const/16 v34, 0x0

    .line 103
    .line 104
    move-object/from16 v26, v1

    .line 105
    .line 106
    invoke-static/range {v25 .. v36}, La/g9q0;->b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iget-wide v11, v1, La/a9q0;->c:J

    .line 111
    .line 112
    shr-long/2addr v11, v7

    .line 113
    long-to-int v1, v11

    .line 114
    new-instance v11, La/j83;

    .line 115
    .line 116
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    check-cast v10, Ljava/lang/String;

    .line 121
    .line 122
    invoke-direct {v11, v10}, La/j83;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 126
    .line 127
    .line 128
    move-result-object v27

    .line 129
    move-object/from16 v26, v11

    .line 130
    .line 131
    invoke-static/range {v25 .. v36}, La/g9q0;->b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    iget-wide v10, v10, La/a9q0;->c:J

    .line 136
    .line 137
    shr-long/2addr v10, v7

    .line 138
    long-to-int v10, v10

    .line 139
    new-instance v11, La/j83;

    .line 140
    .line 141
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    check-cast v9, Ljava/lang/String;

    .line 146
    .line 147
    invoke-direct {v11, v9}, La/j83;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 151
    .line 152
    .line 153
    move-result-object v27

    .line 154
    move-object/from16 v26, v11

    .line 155
    .line 156
    invoke-static/range {v25 .. v36}, La/g9q0;->b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    iget-wide v11, v9, La/a9q0;->c:J

    .line 161
    .line 162
    shr-long/2addr v11, v7

    .line 163
    long-to-int v7, v11

    .line 164
    filled-new-array {v1, v10, v7}, [I

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-static {v1, v0}, La/idd;->c([II)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-interface {v8, v0}, La/w6k;->r0(I)F

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    sget-object v1, La/qmk;->a:La/zcl;

    .line 177
    .line 178
    add-float/2addr v0, v6

    .line 179
    add-float/2addr v0, v5

    .line 180
    mul-float/2addr v0, v4

    .line 181
    add-float/2addr v0, v3

    .line 182
    add-float/2addr v0, v2

    .line 183
    new-instance v1, La/ycl;

    .line 184
    .line 185
    invoke-direct {v1, v0}, La/ycl;-><init>(F)V

    .line 186
    .line 187
    .line 188
    return-object v1

    .line 189
    :pswitch_0
    new-instance v13, La/j83;

    .line 190
    .line 191
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    check-cast v1, Ljava/lang/String;

    .line 196
    .line 197
    invoke-direct {v13, v1}, La/j83;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 201
    .line 202
    .line 203
    move-result-object v14

    .line 204
    const/16 v22, 0x0

    .line 205
    .line 206
    const/16 v23, 0x7ec

    .line 207
    .line 208
    iget-object v12, v0, La/dpd0;->b:La/g9q0;

    .line 209
    .line 210
    const/4 v15, 0x0

    .line 211
    const/16 v16, 0x0

    .line 212
    .line 213
    const/16 v17, 0x1

    .line 214
    .line 215
    const-wide/16 v18, 0x0

    .line 216
    .line 217
    const/16 v20, 0x0

    .line 218
    .line 219
    const/16 v21, 0x0

    .line 220
    .line 221
    invoke-static/range {v12 .. v23}, La/g9q0;->b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    move-object/from16 v24, v12

    .line 226
    .line 227
    iget-wide v0, v0, La/a9q0;->c:J

    .line 228
    .line 229
    shr-long/2addr v0, v7

    .line 230
    long-to-int v0, v0

    .line 231
    new-instance v1, La/j83;

    .line 232
    .line 233
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v11

    .line 237
    check-cast v11, Ljava/lang/String;

    .line 238
    .line 239
    invoke-direct {v1, v11}, La/j83;-><init>(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 243
    .line 244
    .line 245
    move-result-object v26

    .line 246
    const/16 v34, 0x0

    .line 247
    .line 248
    const/16 v35, 0x7ec

    .line 249
    .line 250
    const/16 v27, 0x0

    .line 251
    .line 252
    const/16 v28, 0x0

    .line 253
    .line 254
    const/16 v29, 0x1

    .line 255
    .line 256
    const-wide/16 v30, 0x0

    .line 257
    .line 258
    const/16 v32, 0x0

    .line 259
    .line 260
    const/16 v33, 0x0

    .line 261
    .line 262
    move-object/from16 v25, v1

    .line 263
    .line 264
    invoke-static/range {v24 .. v35}, La/g9q0;->b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    iget-wide v11, v1, La/a9q0;->c:J

    .line 269
    .line 270
    shr-long/2addr v11, v7

    .line 271
    long-to-int v1, v11

    .line 272
    new-instance v11, La/j83;

    .line 273
    .line 274
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v10

    .line 278
    check-cast v10, Ljava/lang/String;

    .line 279
    .line 280
    invoke-direct {v11, v10}, La/j83;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 284
    .line 285
    .line 286
    move-result-object v26

    .line 287
    move-object/from16 v25, v11

    .line 288
    .line 289
    invoke-static/range {v24 .. v35}, La/g9q0;->b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;

    .line 290
    .line 291
    .line 292
    move-result-object v10

    .line 293
    iget-wide v10, v10, La/a9q0;->c:J

    .line 294
    .line 295
    shr-long/2addr v10, v7

    .line 296
    long-to-int v10, v10

    .line 297
    new-instance v11, La/j83;

    .line 298
    .line 299
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    check-cast v9, Ljava/lang/String;

    .line 304
    .line 305
    invoke-direct {v11, v9}, La/j83;-><init>(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 309
    .line 310
    .line 311
    move-result-object v26

    .line 312
    move-object/from16 v25, v11

    .line 313
    .line 314
    invoke-static/range {v24 .. v35}, La/g9q0;->b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;

    .line 315
    .line 316
    .line 317
    move-result-object v9

    .line 318
    iget-wide v11, v9, La/a9q0;->c:J

    .line 319
    .line 320
    shr-long/2addr v11, v7

    .line 321
    long-to-int v7, v11

    .line 322
    filled-new-array {v1, v10, v7}, [I

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-static {v1, v0}, La/idd;->c([II)I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    invoke-interface {v8, v0}, La/w6k;->r0(I)F

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    sget-object v1, La/qmk;->a:La/zcl;

    .line 335
    .line 336
    add-float/2addr v0, v6

    .line 337
    add-float/2addr v0, v5

    .line 338
    mul-float/2addr v0, v4

    .line 339
    add-float/2addr v0, v3

    .line 340
    add-float/2addr v0, v2

    .line 341
    new-instance v1, La/ycl;

    .line 342
    .line 343
    invoke-direct {v1, v0}, La/ycl;-><init>(F)V

    .line 344
    .line 345
    .line 346
    return-object v1

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
