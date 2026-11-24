.class public final La/y8;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/y8;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/qek0",
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
.field public static final P1:La/qek0;

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
    const-class v1, La/y8;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/main_menu/impl/databinding/FragmentAccordionMenuBinding;"

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
    sput-object v1, La/y8;->Q1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/qek0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/y8;->P1:La/qek0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d01dd

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/y8;->K1:Z

    .line 9
    .line 10
    sget-object v1, La/w8;->a:La/w8;

    .line 11
    .line 12
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, La/y8;->L1:La/s0r;

    .line 17
    .line 18
    new-instance v1, La/u8;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, p0, v2}, La/u8;-><init>(La/y8;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iput-object v1, p0, La/y8;->M1:La/a8z;

    .line 31
    .line 32
    new-instance v1, La/u8;

    .line 33
    .line 34
    invoke-direct {v1, p0, v0}, La/u8;-><init>(La/y8;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, La/y8;->N1:La/a8z;

    .line 42
    .line 43
    new-instance v0, La/u8;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    invoke-direct {v0, p0, v1}, La/u8;-><init>(La/y8;B)V

    .line 47
    .line 48
    .line 49
    new-instance v3, La/o5;

    .line 50
    .line 51
    const/4 v4, 0x6

    .line 52
    invoke-direct {v3, v0, v4}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    new-instance v0, La/o5;

    .line 56
    .line 57
    const/4 v4, 0x7

    .line 58
    invoke-direct {v0, p0, v4}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    new-instance v4, La/o5;

    .line 62
    .line 63
    const/16 v5, 0x8

    .line 64
    .line 65
    invoke-direct {v4, v0, v5}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-class v2, La/ab;

    .line 73
    .line 74
    sget-object v4, La/sre0;->a:La/tre0;

    .line 75
    .line 76
    invoke-virtual {v4, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    new-instance v4, La/k8;

    .line 81
    .line 82
    invoke-direct {v4, v0, v1}, La/k8;-><init>(La/a8z;B)V

    .line 83
    .line 84
    .line 85
    new-instance v1, La/k8;

    .line 86
    .line 87
    const/4 v5, 0x3

    .line 88
    invoke-direct {v1, v0, v5}, La/k8;-><init>(La/a8z;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {p0, v2, v4, v1, v3}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, La/y8;->O1:La/kiu0;

    .line 96
    .line 97
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 37

    .line 1
    invoke-virtual/range {p0 .. p0}, La/y8;->G0()La/fxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/fxq;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p0 .. p0}, La/y8;->G0()La/fxq;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/fxq;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual/range {p0 .. p0}, La/y8;->G0()La/fxq;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v0, v0, La/fxq;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    move-object/from16 v2, p0

    .line 28
    .line 29
    iget-object v3, v2, La/y8;->M1:La/a8z;

    .line 30
    .line 31
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, La/t8;

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, La/y8;->G0()La/fxq;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v0, v0, La/fxq;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const v4, 0x7f070717

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    const v4, 0x7f07072d

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    const v4, 0x7f0706ea

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const v5, 0x7f07070c

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const v7, 0x7f0705c6

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 98
    .line 99
    .line 100
    move-result v14

    .line 101
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    const v7, 0x7f0701bb

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 109
    .line 110
    .line 111
    move-result v18

    .line 112
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    const v7, 0x7f07071d

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 120
    .line 121
    .line 122
    move-result v22

    .line 123
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    const v7, 0x7f0706e1

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 131
    .line 132
    .line 133
    move-result v19

    .line 134
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    const v7, 0x7f070633

    .line 139
    .line 140
    .line 141
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    new-instance v15, La/mmk0;

    .line 146
    .line 147
    const-class v23, La/g140;

    .line 148
    .line 149
    const-class v24, La/w140;

    .line 150
    .line 151
    const-class v25, La/a240;

    .line 152
    .line 153
    const-class v26, La/d240;

    .line 154
    .line 155
    const-class v27, La/n140;

    .line 156
    .line 157
    const-class v28, La/k140;

    .line 158
    .line 159
    const-class v29, La/e240;

    .line 160
    .line 161
    const-class v30, La/l140;

    .line 162
    .line 163
    const-class v31, La/h140;

    .line 164
    .line 165
    const-class v32, La/m140;

    .line 166
    .line 167
    const-class v33, La/j140;

    .line 168
    .line 169
    const-class v34, La/b240;

    .line 170
    .line 171
    const-class v35, La/v140;

    .line 172
    .line 173
    filled-new-array/range {v23 .. v35}, [Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v20

    .line 181
    const/16 v16, 0x0

    .line 182
    .line 183
    add-int v17, v18, v4

    .line 184
    .line 185
    invoke-direct/range {v15 .. v20}, La/mmk0;-><init>(IIIILjava/util/List;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v15}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 189
    .line 190
    .line 191
    new-instance v5, La/mmk0;

    .line 192
    .line 193
    const-class v4, La/c240;

    .line 194
    .line 195
    invoke-static {v4}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    move v9, v6

    .line 200
    const/4 v6, 0x0

    .line 201
    add-int v7, v18, v3

    .line 202
    .line 203
    move v8, v7

    .line 204
    invoke-direct/range {v5 .. v10}, La/mmk0;-><init>(IIIILjava/util/List;)V

    .line 205
    .line 206
    .line 207
    move v6, v9

    .line 208
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 209
    .line 210
    .line 211
    new-instance v5, La/mmk0;

    .line 212
    .line 213
    const-class v7, La/i140;

    .line 214
    .line 215
    const-class v8, La/x140;

    .line 216
    .line 217
    filled-new-array {v7, v8}, [Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    invoke-static {v7}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    const/4 v9, 0x0

    .line 226
    move/from16 v8, v18

    .line 227
    .line 228
    move/from16 v7, v18

    .line 229
    .line 230
    invoke-direct/range {v5 .. v10}, La/mmk0;-><init>(IIIILjava/util/List;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 234
    .line 235
    .line 236
    new-instance v15, La/dvl;

    .line 237
    .line 238
    new-instance v5, Lkotlin/Pair;

    .line 239
    .line 240
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    invoke-direct {v5, v4, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    const v8, 0x7f040ae3

    .line 256
    .line 257
    .line 258
    invoke-static {v8, v7}, La/m5d;->b(ILandroid/content/Context;)I

    .line 259
    .line 260
    .line 261
    move-result v13

    .line 262
    move-object/from16 v36, v35

    .line 263
    .line 264
    move-object/from16 v35, v34

    .line 265
    .line 266
    move-object/from16 v34, v33

    .line 267
    .line 268
    move-object/from16 v33, v32

    .line 269
    .line 270
    move-object/from16 v32, v4

    .line 271
    .line 272
    filled-new-array/range {v23 .. v36}, [Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    move-object/from16 v32, v33

    .line 277
    .line 278
    move-object/from16 v33, v34

    .line 279
    .line 280
    move-object/from16 v34, v35

    .line 281
    .line 282
    move-object/from16 v35, v36

    .line 283
    .line 284
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    move v10, v11

    .line 289
    move-object v11, v5

    .line 290
    new-instance v5, La/k9b;

    .line 291
    .line 292
    move v9, v3

    .line 293
    move/from16 v8, v18

    .line 294
    .line 295
    invoke-direct/range {v5 .. v14}, La/k9b;-><init>(ILjava/util/List;IIILjava/util/List;III)V

    .line 296
    .line 297
    .line 298
    invoke-direct {v15, v5}, La/dvl;-><init>(La/k9b;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, v15}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 302
    .line 303
    .line 304
    filled-new-array/range {v23 .. v35}, [Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 309
    .line 310
    .line 311
    move-result-object v20

    .line 312
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    const v4, 0x7f040b17

    .line 317
    .line 318
    .line 319
    invoke-static {v4, v3}, La/m5d;->b(ILandroid/content/Context;)I

    .line 320
    .line 321
    .line 322
    move-result v24

    .line 323
    invoke-static {}, La/cy7;->c()Z

    .line 324
    .line 325
    .line 326
    move-result v23

    .line 327
    move/from16 v21, v19

    .line 328
    .line 329
    new-instance v19, La/evl;

    .line 330
    .line 331
    invoke-direct/range {v19 .. v24}, La/evl;-><init>(Ljava/util/List;IIZI)V

    .line 332
    .line 333
    .line 334
    move-object/from16 v3, v19

    .line 335
    .line 336
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, La/y8;->G0()La/fxq;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    iget-object v0, v0, La/fxq;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 344
    .line 345
    invoke-static {v0, v1}, La/knm0;->i(Landroid/view/View;Z)V

    .line 346
    .line 347
    .line 348
    return-void
.end method

.method public final D0()V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/y8;->H0()La/ab;

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
    iget-object v1, p0, La/y8;->M1:La/a8z;

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
    check-cast v4, La/t8;

    .line 53
    .line 54
    const/4 v8, 0x4

    .line 55
    const/4 v9, 0x1

    .line 56
    const/4 v3, 0x2

    .line 57
    const-class v5, La/t8;

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
    invoke-direct {v3, v0, p0, v2, v8}, La/m1;-><init>(La/a1g;La/y8;La/i8;La/yje;)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x3

    .line 81
    invoke-static {v1, v8, v8, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, La/y8;->H0()La/ab;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v1, v1, La/ab;->v0:La/p7m0;

    .line 89
    .line 90
    new-instance v2, La/x8;

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    invoke-direct {v2, p0, v8, v3}, La/x8;-><init>(La/y8;La/yje;B)V

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
    invoke-direct {v5, v1, v3, v2, v8}, La/m1;-><init>(La/gmq;La/clz;La/x8;La/yje;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v4, v8, v8, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, La/y8;->H0()La/ab;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-object v5, v1, La/ab;->w0:La/ol60;

    .line 123
    .line 124
    new-instance v7, La/x8;

    .line 125
    .line 126
    const/4 v1, 0x1

    .line 127
    invoke-direct {v7, p0, v8, v1}, La/x8;-><init>(La/y8;La/yje;B)V

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
    const/4 v9, 0x0

    .line 145
    invoke-direct/range {v4 .. v9}, La/m1;-><init>(La/gmq;La/clz;La/x8;La/yje;B)V

    .line 146
    .line 147
    .line 148
    invoke-static {p0, v8, v8, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public final G0()La/fxq;
    .locals 2

    .line 1
    sget-object v0, La/y8;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/y8;->L1:La/s0r;

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
    check-cast p0, La/fxq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/ab;
    .locals 0

    .line 1
    iget-object p0, p0, La/y8;->O1:La/kiu0;

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
    const/4 v1, 0x2

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
    invoke-virtual {p0}, La/y8;->G0()La/fxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/fxq;->b:Landroidx/recyclerview/widget/RecyclerView;

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
    invoke-virtual {p0}, La/y8;->H0()La/ab;

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
    iget-boolean p0, p0, La/y8;->K1:Z

    .line 2
    .line 3
    return p0
.end method
