.class public final La/b8t;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/b8t;",
        "La/yx5;",
        "<init>",
        "()V",
        "games_mania"
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
.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public final L1:La/s0r;

.field public M1:La/fiu0;

.field public final N1:La/kiu0;

.field public O1:Ljava/util/List;

.field public final P1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/b8t;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/games_mania/databinding/GamesManiaGameFragmentBinding;"

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
    sput-object v1, La/b8t;->Q1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d031a

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/b8t;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/y7t;->a:La/y7t;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/b8t;->L1:La/s0r;

    .line 18
    .line 19
    new-instance v0, La/v7t;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, v1}, La/v7t;-><init>(La/b8t;B)V

    .line 23
    .line 24
    .line 25
    new-instance v1, La/t7t;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-direct {v1, p0, v2}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    sget-object v3, La/wez;->b:La/wez;

    .line 32
    .line 33
    new-instance v4, La/t7t;

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    invoke-direct {v4, v1, v5}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-class v3, La/a9t;

    .line 44
    .line 45
    sget-object v4, La/sre0;->a:La/tre0;

    .line 46
    .line 47
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    new-instance v4, La/r6p;

    .line 52
    .line 53
    const/16 v5, 0x12

    .line 54
    .line 55
    invoke-direct {v4, v1, v5}, La/r6p;-><init>(La/a8z;B)V

    .line 56
    .line 57
    .line 58
    new-instance v5, La/r6p;

    .line 59
    .line 60
    const/16 v6, 0x13

    .line 61
    .line 62
    invoke-direct {v5, v1, v6}, La/r6p;-><init>(La/a8z;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/b8t;->N1:La/kiu0;

    .line 70
    .line 71
    sget-object v0, La/iun;->a:La/iun;

    .line 72
    .line 73
    iput-object v0, p0, La/b8t;->O1:Ljava/util/List;

    .line 74
    .line 75
    new-instance v0, La/v7t;

    .line 76
    .line 77
    invoke-direct {v0, p0, v2}, La/v7t;-><init>(La/b8t;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, La/b8t;->P1:La/n0o0;

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 8
    .line 9
    iget-object v1, v1, La/jbo;->d:Landroid/view/View;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, Landroid/widget/ImageView;

    .line 13
    .line 14
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 19
    .line 20
    iget-object v1, v1, La/jbo;->f:Landroid/view/View;

    .line 21
    .line 22
    move-object v3, v1

    .line 23
    check-cast v3, Landroid/widget/ImageView;

    .line 24
    .line 25
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 30
    .line 31
    iget-object v1, v1, La/jbo;->g:Landroid/view/View;

    .line 32
    .line 33
    move-object v4, v1

    .line 34
    check-cast v4, Landroid/widget/ImageView;

    .line 35
    .line 36
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 41
    .line 42
    iget-object v1, v1, La/jbo;->e:Landroid/view/View;

    .line 43
    .line 44
    move-object v5, v1

    .line 45
    check-cast v5, Landroid/widget/ImageView;

    .line 46
    .line 47
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 52
    .line 53
    iget-object v1, v1, La/jbo;->c:Landroid/view/View;

    .line 54
    .line 55
    move-object v6, v1

    .line 56
    check-cast v6, Landroid/widget/ImageView;

    .line 57
    .line 58
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 63
    .line 64
    iget-object v1, v1, La/jbo;->j:Landroid/view/View;

    .line 65
    .line 66
    move-object v7, v1

    .line 67
    check-cast v7, Landroid/widget/ImageView;

    .line 68
    .line 69
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 74
    .line 75
    iget-object v1, v1, La/jbo;->l:Landroid/view/View;

    .line 76
    .line 77
    move-object v8, v1

    .line 78
    check-cast v8, Landroid/widget/ImageView;

    .line 79
    .line 80
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 85
    .line 86
    iget-object v1, v1, La/jbo;->m:Landroid/view/View;

    .line 87
    .line 88
    move-object v9, v1

    .line 89
    check-cast v9, Landroid/widget/ImageView;

    .line 90
    .line 91
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 96
    .line 97
    iget-object v1, v1, La/jbo;->k:Landroid/view/View;

    .line 98
    .line 99
    move-object v10, v1

    .line 100
    check-cast v10, Landroid/widget/ImageView;

    .line 101
    .line 102
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 107
    .line 108
    iget-object v1, v1, La/jbo;->i:Landroid/view/View;

    .line 109
    .line 110
    move-object v11, v1

    .line 111
    check-cast v11, Landroid/widget/ImageView;

    .line 112
    .line 113
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 118
    .line 119
    iget-object v1, v1, La/jbo;->n:Landroid/view/View;

    .line 120
    .line 121
    move-object v12, v1

    .line 122
    check-cast v12, Landroid/widget/ImageView;

    .line 123
    .line 124
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 129
    .line 130
    iget-object v1, v1, La/jbo;->p:Landroid/view/View;

    .line 131
    .line 132
    move-object v13, v1

    .line 133
    check-cast v13, Landroid/widget/ImageView;

    .line 134
    .line 135
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 140
    .line 141
    iget-object v1, v1, La/jbo;->q:Landroid/view/View;

    .line 142
    .line 143
    move-object v14, v1

    .line 144
    check-cast v14, Landroid/widget/ImageView;

    .line 145
    .line 146
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 151
    .line 152
    iget-object v1, v1, La/jbo;->o:Landroid/view/View;

    .line 153
    .line 154
    move-object v15, v1

    .line 155
    check-cast v15, Landroid/widget/ImageView;

    .line 156
    .line 157
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 162
    .line 163
    iget-object v1, v1, La/jbo;->n:Landroid/view/View;

    .line 164
    .line 165
    move-object/from16 v16, v1

    .line 166
    .line 167
    check-cast v16, Landroid/widget/ImageView;

    .line 168
    .line 169
    filled-new-array/range {v2 .. v16}, [Landroid/widget/ImageView;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    iput-object v1, v0, La/b8t;->O1:Ljava/util/List;

    .line 178
    .line 179
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    iget-object v1, v1, La/c8t;->i:Landroid/widget/ImageView;

    .line 184
    .line 185
    new-instance v2, La/x7t;

    .line 186
    .line 187
    const/4 v3, 0x1

    .line 188
    invoke-direct {v2, v0, v3}, La/x7t;-><init>(La/b8t;B)V

    .line 189
    .line 190
    .line 191
    invoke-static {v1, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    iget-object v1, v1, La/c8t;->k:La/jbo;

    .line 199
    .line 200
    iget-object v1, v1, La/jbo;->h:Landroid/widget/TextView;

    .line 201
    .line 202
    check-cast v1, Landroid/widget/Button;

    .line 203
    .line 204
    new-instance v2, La/x7t;

    .line 205
    .line 206
    const/4 v4, 0x2

    .line 207
    invoke-direct {v2, v0, v4}, La/x7t;-><init>(La/b8t;B)V

    .line 208
    .line 209
    .line 210
    invoke-static {v1, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    iget-object v1, v1, La/c8t;->d:Landroid/widget/FrameLayout;

    .line 218
    .line 219
    new-instance v2, La/jw5;

    .line 220
    .line 221
    const/4 v5, 0x7

    .line 222
    invoke-direct {v2, v0, v5}, La/jw5;-><init>(Ljava/lang/Object;B)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    iget-object v1, v1, La/c8t;->f:Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;

    .line 233
    .line 234
    new-instance v2, La/x7t;

    .line 235
    .line 236
    const/4 v5, 0x3

    .line 237
    invoke-direct {v2, v0, v5}, La/x7t;-><init>(La/b8t;B)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v2}, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->setDiceListener$games_mania(Lkotlin/jvm/functions/Function1;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    iget-object v1, v1, La/c8t;->f:Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;

    .line 248
    .line 249
    new-instance v2, La/v7t;

    .line 250
    .line 251
    invoke-direct {v2, v0, v4}, La/v7t;-><init>(La/b8t;B)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v2}, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->setDiceShownListener$games_mania(Lkotlin/jvm/functions/Function0;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    iget-object v1, v1, La/c8t;->g:Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;

    .line 262
    .line 263
    iget-object v2, v1, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->i:Landroid/graphics/Paint;

    .line 264
    .line 265
    const/16 v4, 0x7f

    .line 266
    .line 267
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 268
    .line 269
    .line 270
    iget-object v2, v1, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->h:Landroid/graphics/Paint;

    .line 271
    .line 272
    const/16 v4, 0xa

    .line 273
    .line 274
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 275
    .line 276
    .line 277
    iget-object v2, v1, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->d:Landroid/graphics/Paint;

    .line 278
    .line 279
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    const v5, 0x7f0601e8

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 291
    .line 292
    .line 293
    sget-object v4, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 294
    .line 295
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 296
    .line 297
    .line 298
    iget-object v2, v1, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->e:Landroid/graphics/Paint;

    .line 299
    .line 300
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    const v5, 0x7f0601e9

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 312
    .line 313
    .line 314
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 315
    .line 316
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 317
    .line 318
    .line 319
    const/high16 v5, 0x40000000    # 2.0f

    .line 320
    .line 321
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 322
    .line 323
    .line 324
    iget-object v2, v1, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->c:Landroid/graphics/Paint;

    .line 325
    .line 326
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    const v6, 0x7f0601ee

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5, v6}, Landroid/content/Context;->getColor(I)I

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 338
    .line 339
    .line 340
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 341
    .line 342
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 343
    .line 344
    .line 345
    iget-object v2, v1, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->f:Landroid/graphics/Paint;

    .line 346
    .line 347
    const/4 v5, -0x1

    .line 348
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 352
    .line 353
    .line 354
    const/high16 v4, 0x40400000    # 3.0f

    .line 355
    .line 356
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 357
    .line 358
    .line 359
    iget-object v1, v1, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->g:Landroid/graphics/Paint;

    .line 360
    .line 361
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 362
    .line 363
    .line 364
    sget-object v2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 365
    .line 366
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 367
    .line 368
    .line 369
    sget-object v2, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 370
    .line 371
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0}, La/b8t;->H0()La/c8t;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    iget-object v1, v1, La/c8t;->g:Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;

    .line 379
    .line 380
    new-instance v2, La/jar;

    .line 381
    .line 382
    const/16 v4, 0x13

    .line 383
    .line 384
    invoke-direct {v2, v0, v4}, La/jar;-><init>(Ljava/lang/Object;B)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1, v2}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->setPuzzleCellListener$games_mania(Lkotlin/jvm/functions/Function2;)V

    .line 388
    .line 389
    .line 390
    new-instance v2, La/d2s;

    .line 391
    .line 392
    invoke-direct {v2, v0, v1, v3}, La/d2s;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, v2}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->setGamesManiaGameResultListener$games_mania(La/ydr;)V

    .line 396
    .line 397
    .line 398
    return-void
.end method

.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/u7t;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/u7t;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, La/u7t;->W1:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/cii;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v1, La/fiu0;

    .line 24
    .line 25
    const-class v2, La/a9t;

    .line 26
    .line 27
    iget-object v0, v0, La/cii;->m0:La/dci;

    .line 28
    .line 29
    invoke-static {v2, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {v1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, La/b8t;->M1:La/fiu0;

    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/b8t;->I0()La/a9t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/a9t;->o:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/gkr;

    .line 8
    .line 9
    const/4 v2, 0x7

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/gkr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v2, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, La/fns;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2, v1, v7}, La/fns;-><init>(La/gmq;La/clz;La/gkr;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/b8t;->I0()La/a9t;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/a9t;->r:La/p7m0;

    .line 42
    .line 43
    new-instance v6, La/a8t;

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/a8t;-><init>(La/b8t;La/yje;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v3, La/fns;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/fns;-><init>(La/gmq;La/clz;La/a8t;La/yje;I)V

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La/b8t;->I0()La/a9t;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v1, v1, La/a9t;->s:La/p7m0;

    .line 75
    .line 76
    new-instance v2, La/a8t;

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-direct {v2, p0, v7, v3}, La/a8t;-><init>(La/b8t;La/yje;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    new-instance v5, La/fns;

    .line 95
    .line 96
    invoke-direct {v5, v1, v3, v2, v7}, La/fns;-><init>(La/gmq;La/clz;La/a8t;La/yje;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v4, v7, v7, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, La/b8t;->I0()La/a9t;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iget-object v4, v1, La/a9t;->t:La/p7m0;

    .line 107
    .line 108
    new-instance v6, La/a8t;

    .line 109
    .line 110
    const/4 v1, 0x1

    .line 111
    invoke-direct {v6, p0, v7, v1}, La/a8t;-><init>(La/b8t;La/yje;B)V

    .line 112
    .line 113
    .line 114
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    new-instance v3, La/fns;

    .line 127
    .line 128
    invoke-direct/range {v3 .. v8}, La/fns;-><init>(La/gmq;La/clz;La/a8t;La/yje;B)V

    .line 129
    .line 130
    .line 131
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, La/b8t;->I0()La/a9t;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    iget-object v4, v1, La/a9t;->p:La/p7m0;

    .line 139
    .line 140
    sget-object v1, La/lkz;->a:La/lkz;

    .line 141
    .line 142
    new-instance v6, La/a8t;

    .line 143
    .line 144
    const/4 v1, 0x2

    .line 145
    invoke-direct {v6, p0, v7, v1}, La/a8t;-><init>(La/b8t;La/yje;B)V

    .line 146
    .line 147
    .line 148
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    new-instance v3, La/fns;

    .line 161
    .line 162
    invoke-direct/range {v3 .. v8}, La/fns;-><init>(La/gmq;La/clz;La/a8t;La/yje;C)V

    .line 163
    .line 164
    .line 165
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, La/b8t;->I0()La/a9t;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iget-object v1, v1, La/a9t;->q:La/p7m0;

    .line 173
    .line 174
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    new-instance v2, La/a8t;

    .line 179
    .line 180
    invoke-direct {v2, p0, v7, v0}, La/a8t;-><init>(La/b8t;La/yje;B)V

    .line 181
    .line 182
    .line 183
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    new-instance v4, La/fns;

    .line 196
    .line 197
    invoke-direct {v4, v1, p0, v2, v7}, La/fns;-><init>(La/xae0;La/clz;La/a8t;La/yje;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 201
    .line 202
    .line 203
    return-void
.end method

.method public final G0(La/k7t;Ljava/util/List;Z)V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/b8t;->H0()La/c8t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/c8t;->g:Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, p1, La/k7t;->e:Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v2, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->j:I

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    iget v4, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->a:I

    .line 25
    .line 26
    mul-int/lit8 v4, v4, 0x4

    .line 27
    .line 28
    sub-int/2addr v2, v4

    .line 29
    div-int/lit8 v2, v2, 0x5

    .line 30
    .line 31
    iput v2, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->j:I

    .line 32
    .line 33
    iget-object v4, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->g:Landroid/graphics/Paint;

    .line 34
    .line 35
    int-to-float v2, v2

    .line 36
    const v5, 0x402ccccd    # 2.7f

    .line 37
    .line 38
    .line 39
    div-float/2addr v2, v5

    .line 40
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 41
    .line 42
    .line 43
    iget-object v2, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->k:Landroid/graphics/Bitmap;

    .line 44
    .line 45
    iget v4, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->j:I

    .line 46
    .line 47
    invoke-static {v2, v4, v4, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iput-object v2, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->k:Landroid/graphics/Bitmap;

    .line 55
    .line 56
    iget-object v2, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->l:Landroid/graphics/Bitmap;

    .line 57
    .line 58
    iget v4, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->j:I

    .line 59
    .line 60
    invoke-static {v2, v4, v4, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iput-object v2, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->l:Landroid/graphics/Bitmap;

    .line 68
    .line 69
    iget-object v2, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->m:Landroid/graphics/Bitmap;

    .line 70
    .line 71
    iget v4, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->j:I

    .line 72
    .line 73
    invoke-static {v2, v4, v4, v3}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iput-object v2, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->m:Landroid/graphics/Bitmap;

    .line 81
    .line 82
    :cond_0
    iput v3, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->t:I

    .line 83
    .line 84
    if-eqz p3, :cond_1

    .line 85
    .line 86
    sget-object p3, La/m9t;->c:La/m9t;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    sget-object p3, La/m9t;->b:La/m9t;

    .line 90
    .line 91
    :goto_0
    iput-object p3, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->u1:La/m9t;

    .line 92
    .line 93
    iget-object p3, p1, La/k7t;->f:Ljava/util/List;

    .line 94
    .line 95
    invoke-static {v1}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->r(Ljava/util/List;)Ljava/util/ArrayList;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iput-object v2, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->n:Ljava/util/List;

    .line 100
    .line 101
    iput-object v1, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->w:Ljava/util/List;

    .line 102
    .line 103
    invoke-virtual {v0, v2, p3, v1}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->n(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 104
    .line 105
    .line 106
    const/4 v1, 0x1

    .line 107
    iput v1, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->q:I

    .line 108
    .line 109
    iget v1, p1, La/k7t;->a:I

    .line 110
    .line 111
    iput v1, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->s:I

    .line 112
    .line 113
    iget-object p1, p1, La/k7t;->b:Ljava/util/List;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {p1}, La/zys0;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->A:Ljava/util/List;

    .line 123
    .line 124
    iget-object p1, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->n:Ljava/util/List;

    .line 125
    .line 126
    invoke-virtual {v0, p3, p1}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->f(Ljava/util/List;Ljava/util/List;)V

    .line 127
    .line 128
    .line 129
    iput-object p2, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->h1:Ljava/util/List;

    .line 130
    .line 131
    invoke-virtual {p0}, La/b8t;->H0()La/c8t;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iget-object p0, p0, La/c8t;->g:Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;

    .line 136
    .line 137
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public final H0()La/c8t;
    .locals 2

    .line 1
    sget-object v0, La/b8t;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/b8t;->L1:La/s0r;

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
    check-cast p0, La/c8t;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()La/a9t;
    .locals 0

    .line 1
    iget-object p0, p0, La/b8t;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/a9t;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/b8t;->I0()La/a9t;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, La/a9t;->w:Z

    .line 10
    .line 11
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/b8t;->I0()La/a9t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, La/a9t;->w:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/b8t;->H0()La/c8t;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v0, v0, La/c8t;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, La/b8t;->P1:La/n0o0;

    .line 20
    .line 21
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/z7t;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 32
    .line 33
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/b8t;->I0()La/a9t;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-boolean v0, v0, La/a9t;->w:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, La/b8t;->H0()La/c8t;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, La/c8t;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object p0, p0, La/b8t;->P1:La/n0o0;

    .line 23
    .line 24
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/z7t;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-virtual {p0}, La/b8t;->I0()La/a9t;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, La/a9t;->B()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/b8t;->H0()La/c8t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/c8t;->f:Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;

    .line 6
    .line 7
    iget-object v0, v0, Lorg/xplatform/games_mania/presentation/views/GamesManiaDice;->b:Landroid/animation/AnimatorSet;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->end()V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 16
    .line 17
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/b8t;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
