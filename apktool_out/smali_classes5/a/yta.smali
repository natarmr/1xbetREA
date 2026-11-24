.class public final La/yta;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:La/a4x;

.field public final synthetic b:La/omv;

.field public final synthetic c:F

.field public final synthetic d:La/pz40;

.field public final synthetic e:La/pz40;

.field public final synthetic f:La/pz40;

.field public final synthetic g:La/pz40;


# direct methods
.method public constructor <init>(La/a4x;La/omv;FLa/pz40;La/pz40;La/pz40;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/yta;->a:La/a4x;

    .line 5
    .line 6
    iput-object p2, p0, La/yta;->b:La/omv;

    .line 7
    .line 8
    iput p3, p0, La/yta;->c:F

    .line 9
    .line 10
    iput-object p4, p0, La/yta;->d:La/pz40;

    .line 11
    .line 12
    iput-object p5, p0, La/yta;->e:La/pz40;

    .line 13
    .line 14
    iput-object p6, p0, La/yta;->f:La/pz40;

    .line 15
    .line 16
    iput-object p7, p0, La/yta;->g:La/pz40;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    move-object/from16 v11, p3

    .line 16
    .line 17
    check-cast v11, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    and-int/lit8 v4, v3, 0x6

    .line 28
    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    const/4 v4, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v4, 0x2

    .line 40
    :goto_0
    or-int/2addr v4, v3

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v4, v3

    .line 43
    :goto_1
    and-int/lit8 v3, v3, 0x30

    .line 44
    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v11, v2}, La/fet;->e(I)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    const/16 v3, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v3, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v4, v3

    .line 59
    :cond_3
    and-int/lit16 v3, v4, 0x93

    .line 60
    .line 61
    const/16 v5, 0x92

    .line 62
    .line 63
    const/4 v6, 0x1

    .line 64
    const/4 v14, 0x0

    .line 65
    if-eq v3, v5, :cond_4

    .line 66
    .line 67
    move v3, v6

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    move v3, v14

    .line 70
    :goto_3
    and-int/2addr v4, v6

    .line 71
    invoke-virtual {v11, v4, v3}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_a

    .line 76
    .line 77
    iget-object v3, v0, La/yta;->a:La/a4x;

    .line 78
    .line 79
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, La/eja;

    .line 84
    .line 85
    const v4, 0x3a71741b

    .line 86
    .line 87
    .line 88
    invoke-virtual {v11, v4}, La/fet;->e0(I)V

    .line 89
    .line 90
    .line 91
    iget-object v4, v3, La/eja;->a:La/dja;

    .line 92
    .line 93
    iget-object v5, v0, La/yta;->e:La/pz40;

    .line 94
    .line 95
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    check-cast v5, La/dja;

    .line 100
    .line 101
    sget-object v7, La/jm40;->b:La/jm40;

    .line 102
    .line 103
    sget-object v8, La/ukd;->a:La/cl5;

    .line 104
    .line 105
    if-ne v4, v5, :cond_6

    .line 106
    .line 107
    const v1, 0x3a723029

    .line 108
    .line 109
    .line 110
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 111
    .line 112
    .line 113
    const/high16 v1, 0x3f800000    # 1.0f

    .line 114
    .line 115
    invoke-static {v7, v1}, La/k7n0;->H(La/mm40;F)La/mm40;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    if-ne v4, v8, :cond_5

    .line 124
    .line 125
    new-instance v4, La/wta;

    .line 126
    .line 127
    iget-object v5, v0, La/yta;->f:La/pz40;

    .line 128
    .line 129
    invoke-direct {v4, v5, v14}, La/wta;-><init>(La/pz40;B)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v11, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_5
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 136
    .line 137
    invoke-static {v1, v4}, La/ffb0;->P(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v11, v14}, La/fet;->r(Z)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_6
    const v4, 0x3a75ca88

    .line 146
    .line 147
    .line 148
    invoke-virtual {v11, v4}, La/fet;->e0(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v11, v14}, La/fet;->r(Z)V

    .line 152
    .line 153
    .line 154
    const/4 v4, 0x0

    .line 155
    const/4 v5, 0x7

    .line 156
    invoke-static {v1, v7, v4, v5}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    :goto_4
    iget-object v4, v3, La/eja;->b:La/rqm;

    .line 161
    .line 162
    sget-object v22, La/wui0;->c:La/wui0;

    .line 163
    .line 164
    iget-object v5, v4, La/rqm;->a:La/vui0;

    .line 165
    .line 166
    iget-object v7, v4, La/rqm;->b:La/pui0;

    .line 167
    .line 168
    iget-object v9, v4, La/rqm;->c:La/pvi0;

    .line 169
    .line 170
    iget v10, v4, La/rqm;->d:F

    .line 171
    .line 172
    iget-object v12, v4, La/rqm;->e:La/d4d;

    .line 173
    .line 174
    iget-object v13, v4, La/rqm;->f:La/tvi0;

    .line 175
    .line 176
    iget-boolean v15, v4, La/rqm;->h:Z

    .line 177
    .line 178
    iget-object v4, v4, La/rqm;->i:La/t89;

    .line 179
    .line 180
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move/from16 v23, v15

    .line 190
    .line 191
    new-instance v15, La/rqm;

    .line 192
    .line 193
    move-object/from16 v24, v4

    .line 194
    .line 195
    move-object/from16 v16, v5

    .line 196
    .line 197
    move-object/from16 v17, v7

    .line 198
    .line 199
    move-object/from16 v18, v9

    .line 200
    .line 201
    move/from16 v19, v10

    .line 202
    .line 203
    move-object/from16 v20, v12

    .line 204
    .line 205
    move-object/from16 v21, v13

    .line 206
    .line 207
    invoke-direct/range {v15 .. v24}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;FLa/d4d;La/tvi0;La/wui0;ZLa/t89;)V

    .line 208
    .line 209
    .line 210
    move-object v4, v15

    .line 211
    iget-object v5, v0, La/yta;->g:La/pz40;

    .line 212
    .line 213
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    check-cast v5, La/a4x;

    .line 218
    .line 219
    invoke-static {v5}, La/q3d;->i(Ljava/util/List;)I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-eq v2, v5, :cond_7

    .line 224
    .line 225
    move v5, v6

    .line 226
    goto :goto_5

    .line 227
    :cond_7
    move v5, v14

    .line 228
    :goto_5
    invoke-virtual {v11, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    iget-object v6, v0, La/yta;->b:La/omv;

    .line 233
    .line 234
    invoke-virtual {v11, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    or-int/2addr v2, v6

    .line 239
    iget v6, v0, La/yta;->c:F

    .line 240
    .line 241
    invoke-virtual {v11, v6}, La/fet;->d(F)Z

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    or-int/2addr v2, v6

    .line 246
    iget-object v6, v0, La/yta;->d:La/pz40;

    .line 247
    .line 248
    invoke-virtual {v11, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    or-int/2addr v2, v7

    .line 253
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v7

    .line 257
    if-nez v2, :cond_8

    .line 258
    .line 259
    if-ne v7, v8, :cond_9

    .line 260
    .line 261
    :cond_8
    new-instance v15, La/xta;

    .line 262
    .line 263
    iget-object v2, v0, La/yta;->f:La/pz40;

    .line 264
    .line 265
    iget-object v7, v0, La/yta;->g:La/pz40;

    .line 266
    .line 267
    iget-object v8, v0, La/yta;->b:La/omv;

    .line 268
    .line 269
    iget v9, v0, La/yta;->c:F

    .line 270
    .line 271
    iget-object v0, v0, La/yta;->e:La/pz40;

    .line 272
    .line 273
    move-object/from16 v19, v0

    .line 274
    .line 275
    move-object/from16 v20, v2

    .line 276
    .line 277
    move-object/from16 v16, v3

    .line 278
    .line 279
    move-object/from16 v22, v6

    .line 280
    .line 281
    move-object/from16 v21, v7

    .line 282
    .line 283
    move-object/from16 v17, v8

    .line 284
    .line 285
    move/from16 v18, v9

    .line 286
    .line 287
    invoke-direct/range {v15 .. v22}, La/xta;-><init>(La/eja;La/omv;FLa/pz40;La/pz40;La/pz40;La/pz40;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v11, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    move-object v7, v15

    .line 294
    :cond_9
    move-object v10, v7

    .line 295
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 296
    .line 297
    const/4 v12, 0x0

    .line 298
    const/16 v13, 0x78

    .line 299
    .line 300
    const/4 v6, 0x0

    .line 301
    const/4 v7, 0x0

    .line 302
    const/4 v8, 0x0

    .line 303
    const/4 v9, 0x0

    .line 304
    move-object v3, v1

    .line 305
    invoke-static/range {v3 .. v13}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v11, v14}, La/fet;->r(Z)V

    .line 309
    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_a
    invoke-virtual {v11}, La/fet;->X()V

    .line 313
    .line 314
    .line 315
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    return-object v0
.end method
