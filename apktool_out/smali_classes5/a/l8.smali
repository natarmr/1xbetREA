.class public final La/l8;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/l8;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/pek0",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final P1:La/pek0;

.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:Z

.field public final L1:La/s0r;

.field public final M1:La/a8z;

.field public final N1:La/a8z;

.field public final O1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/l8;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentAccordionGridMenuBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/l8;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/pek0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/l8;->P1:La/pek0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d01dc

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/l8;->K1:Z

    .line 9
    .line 10
    sget-object v1, La/g8;->a:La/g8;

    .line 11
    .line 12
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, La/l8;->L1:La/s0r;

    .line 17
    .line 18
    new-instance v1, La/d8;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, p0, v2}, La/d8;-><init>(La/l8;B)V

    .line 22
    .line 23
    .line 24
    sget-object v3, La/wez;->b:La/wez;

    .line 25
    .line 26
    invoke-static {v3, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, p0, La/l8;->M1:La/a8z;

    .line 31
    .line 32
    new-instance v1, La/d8;

    .line 33
    .line 34
    invoke-direct {v1, p0, v0}, La/d8;-><init>(La/l8;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {v3, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, p0, La/l8;->N1:La/a8z;

    .line 42
    .line 43
    new-instance v1, La/d8;

    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    invoke-direct {v1, p0, v4}, La/d8;-><init>(La/l8;B)V

    .line 47
    .line 48
    .line 49
    new-instance v4, La/o5;

    .line 50
    .line 51
    const/4 v5, 0x3

    .line 52
    invoke-direct {v4, v1, v5}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    new-instance v1, La/o5;

    .line 56
    .line 57
    const/4 v5, 0x4

    .line 58
    invoke-direct {v1, p0, v5}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    new-instance v5, La/o5;

    .line 62
    .line 63
    const/4 v6, 0x5

    .line 64
    invoke-direct {v5, v1, v6}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {v3, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const-class v3, La/ab;

    .line 72
    .line 73
    sget-object v5, La/sre0;->a:La/tre0;

    .line 74
    .line 75
    invoke-virtual {v5, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    new-instance v5, La/k8;

    .line 80
    .line 81
    invoke-direct {v5, v1, v2}, La/k8;-><init>(La/a8z;B)V

    .line 82
    .line 83
    .line 84
    new-instance v2, La/k8;

    .line 85
    .line 86
    invoke-direct {v2, v1, v0}, La/k8;-><init>(La/a8z;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0, v3, v5, v2, v4}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, La/l8;->O1:La/kiu0;

    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, La/l8;->G0()La/exq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/exq;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p0 .. p0}, La/l8;->G0()La/exq;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/exq;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p0 .. p0}, La/l8;->G0()La/exq;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v0, v0, La/exq;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    move-object/from16 v2, p0

    .line 28
    .line 29
    iget-object v3, v2, La/l8;->M1:La/a8z;

    .line 30
    .line 31
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, La/z8;

    .line 36
    .line 37
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, La/l8;->G0()La/exq;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v0, v0, La/exq;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const v5, 0x7f07072d

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const v5, 0x7f0705c6

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 65
    .line 66
    .line 67
    move-result v17

    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    const v5, 0x7f0701bb

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const v5, 0x7f0706ea

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    new-instance v4, La/dvl;

    .line 91
    .line 92
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    const v6, 0x7f040ae3

    .line 97
    .line 98
    .line 99
    invoke-static {v6, v5}, La/m5d;->b(ILandroid/content/Context;)I

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    const v6, 0x7f040ae1

    .line 108
    .line 109
    .line 110
    invoke-static {v6, v5}, La/m5d;->b(ILandroid/content/Context;)I

    .line 111
    .line 112
    .line 113
    move-result v15

    .line 114
    const-class v5, La/l140;

    .line 115
    .line 116
    const-class v6, La/k140;

    .line 117
    .line 118
    const-class v9, La/m140;

    .line 119
    .line 120
    filled-new-array {v5, v6, v9}, [Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-static {v10}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v16

    .line 128
    const-class v18, La/g140;

    .line 129
    .line 130
    const-class v19, La/w140;

    .line 131
    .line 132
    const-class v20, La/d240;

    .line 133
    .line 134
    const-class v21, La/n140;

    .line 135
    .line 136
    const-class v23, La/e240;

    .line 137
    .line 138
    const-class v24, La/a240;

    .line 139
    .line 140
    const-class v26, La/h140;

    .line 141
    .line 142
    const-class v27, La/c240;

    .line 143
    .line 144
    const-class v29, La/j140;

    .line 145
    .line 146
    const-class v30, La/b240;

    .line 147
    .line 148
    const-class v31, La/v140;

    .line 149
    .line 150
    move-object/from16 v25, v5

    .line 151
    .line 152
    move-object/from16 v22, v6

    .line 153
    .line 154
    move-object/from16 v28, v9

    .line 155
    .line 156
    filled-new-array/range {v18 .. v31}, [Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    move-object/from16 v6, v18

    .line 165
    .line 166
    invoke-static {}, La/cy7;->c()Z

    .line 167
    .line 168
    .line 169
    move-result v18

    .line 170
    sget-object v9, La/sw5;->b:La/cl5;

    .line 171
    .line 172
    move-object v9, v6

    .line 173
    new-instance v6, La/l9b;

    .line 174
    .line 175
    move v10, v7

    .line 176
    move v12, v11

    .line 177
    move v13, v7

    .line 178
    move/from16 p1, v1

    .line 179
    .line 180
    move-object/from16 v2, v19

    .line 181
    .line 182
    move-object/from16 v32, v20

    .line 183
    .line 184
    move-object/from16 v33, v21

    .line 185
    .line 186
    move-object/from16 v1, v24

    .line 187
    .line 188
    move-object/from16 v34, v27

    .line 189
    .line 190
    move-object/from16 v35, v29

    .line 191
    .line 192
    move-object/from16 v36, v30

    .line 193
    .line 194
    move-object/from16 v37, v31

    .line 195
    .line 196
    move-object/from16 v19, v3

    .line 197
    .line 198
    move-object v3, v9

    .line 199
    move v9, v8

    .line 200
    move v8, v7

    .line 201
    move-object v7, v5

    .line 202
    move-object/from16 v5, v26

    .line 203
    .line 204
    invoke-direct/range {v6 .. v18}, La/l9b;-><init>(Ljava/util/List;IIIIIIIILjava/util/List;IZ)V

    .line 205
    .line 206
    .line 207
    move v7, v8

    .line 208
    move v8, v9

    .line 209
    invoke-direct {v4, v6}, La/dvl;-><init>(La/l9b;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 213
    .line 214
    .line 215
    new-instance v6, La/mmk0;

    .line 216
    .line 217
    const-class v4, La/i140;

    .line 218
    .line 219
    const-class v9, La/x140;

    .line 220
    .line 221
    filled-new-array {v4, v9}, [Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    const/4 v10, 0x0

    .line 230
    move v9, v8

    .line 231
    invoke-direct/range {v6 .. v11}, La/mmk0;-><init>(IIIILjava/util/List;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {p0 .. p0}, La/l8;->G0()La/exq;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    iget-object v0, v0, La/exq;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 242
    .line 243
    sget-object v4, La/sre0;->a:La/tre0;

    .line 244
    .line 245
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-virtual {v4, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-virtual {v4, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-virtual {v4, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    move-object/from16 v6, v25

    .line 262
    .line 263
    invoke-virtual {v4, v6}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    move-object/from16 v7, v22

    .line 268
    .line 269
    invoke-virtual {v4, v7}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    move-object/from16 v8, v33

    .line 274
    .line 275
    invoke-virtual {v4, v8}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    move-object/from16 v9, v32

    .line 280
    .line 281
    invoke-virtual {v4, v9}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    move-object/from16 v10, v34

    .line 286
    .line 287
    invoke-virtual {v4, v10}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    move-object/from16 v11, v28

    .line 292
    .line 293
    invoke-virtual {v4, v11}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 294
    .line 295
    .line 296
    move-result-object v11

    .line 297
    move-object/from16 v12, v35

    .line 298
    .line 299
    invoke-virtual {v4, v12}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 300
    .line 301
    .line 302
    move-result-object v12

    .line 303
    move-object/from16 v13, v36

    .line 304
    .line 305
    invoke-virtual {v4, v13}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 306
    .line 307
    .line 308
    move-result-object v13

    .line 309
    move-object/from16 v14, v37

    .line 310
    .line 311
    invoke-virtual {v4, v14}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    const/16 v14, 0xd

    .line 316
    .line 317
    new-array v14, v14, [La/sgy;

    .line 318
    .line 319
    const/4 v15, 0x0

    .line 320
    aput-object v3, v14, v15

    .line 321
    .line 322
    aput-object v2, v14, p1

    .line 323
    .line 324
    const/4 v2, 0x2

    .line 325
    aput-object v1, v14, v2

    .line 326
    .line 327
    const/4 v1, 0x3

    .line 328
    aput-object v5, v14, v1

    .line 329
    .line 330
    const/4 v1, 0x4

    .line 331
    aput-object v6, v14, v1

    .line 332
    .line 333
    const/4 v1, 0x5

    .line 334
    aput-object v7, v14, v1

    .line 335
    .line 336
    const/4 v1, 0x6

    .line 337
    aput-object v8, v14, v1

    .line 338
    .line 339
    const/4 v1, 0x7

    .line 340
    aput-object v9, v14, v1

    .line 341
    .line 342
    const/16 v1, 0x8

    .line 343
    .line 344
    aput-object v10, v14, v1

    .line 345
    .line 346
    const/16 v1, 0x9

    .line 347
    .line 348
    aput-object v11, v14, v1

    .line 349
    .line 350
    const/16 v1, 0xa

    .line 351
    .line 352
    aput-object v12, v14, v1

    .line 353
    .line 354
    const/16 v1, 0xb

    .line 355
    .line 356
    aput-object v13, v14, v1

    .line 357
    .line 358
    const/16 v1, 0xc

    .line 359
    .line 360
    aput-object v4, v14, v1

    .line 361
    .line 362
    invoke-static {v14}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-interface/range {v19 .. v19}, La/a8z;->getValue()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    check-cast v2, La/z8;

    .line 371
    .line 372
    invoke-static {v0, v1, v2}, La/dtb;->u(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;La/qv5;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual/range {p0 .. p0}, La/l8;->G0()La/exq;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    iget-object v0, v0, La/exq;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 380
    .line 381
    move/from16 v1, p1

    .line 382
    .line 383
    invoke-static {v0, v1}, La/knm0;->i(Landroid/view/View;Z)V

    .line 384
    .line 385
    .line 386
    return-void
.end method

.method public final D0()V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/l8;->H0()La/ab;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/r040;->c:La/r040;

    .line 6
    .line 7
    sget-object v2, La/r040;->d:La/r040;

    .line 8
    .line 9
    sget-object v3, La/r040;->g:La/r040;

    .line 10
    .line 11
    sget-object v4, La/r040;->h:La/r040;

    .line 12
    .line 13
    sget-object v5, La/r040;->e:La/r040;

    .line 14
    .line 15
    sget-object v6, La/r040;->f:La/r040;

    .line 16
    .line 17
    sget-object v7, La/r040;->k:La/r040;

    .line 18
    .line 19
    sget-object v8, La/r040;->l:La/r040;

    .line 20
    .line 21
    sget-object v9, La/r040;->m:La/r040;

    .line 22
    .line 23
    sget-object v10, La/r040;->n:La/r040;

    .line 24
    .line 25
    sget-object v11, La/r040;->i:La/r040;

    .line 26
    .line 27
    sget-object v12, La/r040;->j:La/r040;

    .line 28
    .line 29
    filled-new-array/range {v1 .. v12}, [La/r040;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, La/ab;->x(Ljava/util/List;)La/gmq;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, La/lkz;->a:La/lkz;

    .line 42
    .line 43
    new-instance v2, La/i8;

    .line 44
    .line 45
    iget-object v1, p0, La/l8;->M1:La/a8z;

    .line 46
    .line 47
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v4, v1

    .line 52
    check-cast v4, La/z8;

    .line 53
    .line 54
    const/4 v8, 0x4

    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v3, 0x2

    .line 57
    const-class v5, La/z8;

    .line 58
    .line 59
    const-string v6, "setItems"

    .line 60
    .line 61
    const-string v7, "setItems(Ljava/util/List;)V"

    .line 62
    .line 63
    invoke-direct/range {v2 .. v9}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 67
    .line 68
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v3, La/m1;

    .line 73
    .line 74
    check-cast v0, La/a1g;

    .line 75
    .line 76
    const/4 v8, 0x0

    .line 77
    invoke-direct {v3, v0, p0, v2, v8}, La/m1;-><init>(La/a1g;La/l8;La/i8;La/yje;)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x3

    .line 81
    invoke-static {v1, v8, v8, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, La/l8;->H0()La/ab;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v1, v1, La/ab;->v0:La/p7m0;

    .line 89
    .line 90
    new-instance v2, La/j8;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-direct {v2, p0, v8, v3}, La/j8;-><init>(La/l8;La/yje;B)V

    .line 94
    .line 95
    .line 96
    sget-object v3, La/lkz;->a:La/lkz;

    .line 97
    .line 98
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    new-instance v5, La/m1;

    .line 111
    .line 112
    invoke-direct {v5, v1, v3, v2, v8}, La/m1;-><init>(La/gmq;La/clz;La/j8;La/yje;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v4, v8, v8, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, La/l8;->H0()La/ab;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-object v5, v1, La/ab;->w0:La/ol60;

    .line 123
    .line 124
    new-instance v7, La/j8;

    .line 125
    .line 126
    const/4 v1, 0x1

    .line 127
    invoke-direct {v7, p0, v8, v1}, La/j8;-><init>(La/l8;La/yje;B)V

    .line 128
    .line 129
    .line 130
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    new-instance v4, La/m1;

    .line 143
    .line 144
    invoke-direct/range {v4 .. v9}, La/m1;-><init>(La/gmq;La/clz;La/j8;La/yje;B)V

    .line 145
    .line 146
    .line 147
    invoke-static {p0, v8, v8, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public final G0()La/exq;
    .locals 2

    .line 1
    sget-object v0, La/l8;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/l8;->L1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/exq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/ab;
    .locals 0

    .line 1
    iget-object p0, p0, La/l8;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ab;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, La/gne;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, v1}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    const-string v1, "UPDATED_BALANCE_KEY"

    .line 15
    .line 16
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/l8;->G0()La/exq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/exq;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, La/yx5;->Z()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/l8;->H0()La/ab;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, La/ab;->y()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/l8;->K1:Z

    .line 2
    .line 3
    return p0
.end method
