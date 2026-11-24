.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic t:I


# instance fields
.field public final q:La/zkk;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 337
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 336
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    and-int/lit8 v0, p3, 0x2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object/from16 v0, p2

    .line 11
    .line 12
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    move-object/from16 v4, p1

    .line 17
    .line 18
    invoke-direct {v1, v4, v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const v3, 0x7f0d0166

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    const v0, 0x7f0a0580

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Landroid/widget/ImageView;

    .line 39
    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    const v0, 0x7f0a0584

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Landroid/widget/ImageView;

    .line 50
    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    const v0, 0x7f0a0589

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Landroid/widget/ImageView;

    .line 61
    .line 62
    if-eqz v5, :cond_1

    .line 63
    .line 64
    const v0, 0x7f0a0593

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    check-cast v6, Landroid/widget/ImageView;

    .line 72
    .line 73
    if-eqz v6, :cond_1

    .line 74
    .line 75
    const v0, 0x7f0a0599

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    check-cast v7, Landroid/widget/ImageView;

    .line 83
    .line 84
    if-eqz v7, :cond_1

    .line 85
    .line 86
    const v0, 0x7f0a06dc

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 94
    .line 95
    const v0, 0x7f0a06dd

    .line 96
    .line 97
    .line 98
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 103
    .line 104
    const v0, 0x7f0a06e0

    .line 105
    .line 106
    .line 107
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    check-cast v8, Landroidx/constraintlayout/widget/Guideline;

    .line 112
    .line 113
    if-eqz v8, :cond_1

    .line 114
    .line 115
    const v0, 0x7f0a0803

    .line 116
    .line 117
    .line 118
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    check-cast v8, Landroid/widget/ImageView;

    .line 123
    .line 124
    if-eqz v8, :cond_1

    .line 125
    .line 126
    const v0, 0x7f0a08ee

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    check-cast v9, Landroid/widget/ImageView;

    .line 134
    .line 135
    if-eqz v9, :cond_1

    .line 136
    .line 137
    const v0, 0x7f0a0d16

    .line 138
    .line 139
    .line 140
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    check-cast v10, Landroid/widget/ImageView;

    .line 145
    .line 146
    if-eqz v10, :cond_1

    .line 147
    .line 148
    const v0, 0x7f0a0d1a

    .line 149
    .line 150
    .line 151
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    check-cast v11, Landroid/widget/ImageView;

    .line 156
    .line 157
    if-eqz v11, :cond_1

    .line 158
    .line 159
    const v0, 0x7f0a0d1f

    .line 160
    .line 161
    .line 162
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    check-cast v12, Landroid/widget/ImageView;

    .line 167
    .line 168
    if-eqz v12, :cond_1

    .line 169
    .line 170
    const v0, 0x7f0a0d29

    .line 171
    .line 172
    .line 173
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 174
    .line 175
    .line 176
    move-result-object v13

    .line 177
    check-cast v13, Landroid/widget/ImageView;

    .line 178
    .line 179
    if-eqz v13, :cond_1

    .line 180
    .line 181
    const v0, 0x7f0a0d2f

    .line 182
    .line 183
    .line 184
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    check-cast v14, Landroid/widget/ImageView;

    .line 189
    .line 190
    if-eqz v14, :cond_1

    .line 191
    .line 192
    const v0, 0x7f0a0ecb

    .line 193
    .line 194
    .line 195
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    check-cast v15, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 200
    .line 201
    if-eqz v15, :cond_1

    .line 202
    .line 203
    const v0, 0x7f0a11b5

    .line 204
    .line 205
    .line 206
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 207
    .line 208
    .line 209
    move-result-object v16

    .line 210
    check-cast v16, Landroid/widget/TextView;

    .line 211
    .line 212
    if-eqz v16, :cond_1

    .line 213
    .line 214
    const v0, 0x7f0a11b8

    .line 215
    .line 216
    .line 217
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 218
    .line 219
    .line 220
    move-result-object v17

    .line 221
    check-cast v17, Landroid/widget/TextView;

    .line 222
    .line 223
    if-eqz v17, :cond_1

    .line 224
    .line 225
    const v0, 0x7f0a11bb

    .line 226
    .line 227
    .line 228
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v17

    .line 232
    check-cast v17, Landroid/widget/TextView;

    .line 233
    .line 234
    if-eqz v17, :cond_1

    .line 235
    .line 236
    const v0, 0x7f0a11be

    .line 237
    .line 238
    .line 239
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 240
    .line 241
    .line 242
    move-result-object v18

    .line 243
    check-cast v18, Landroid/widget/TextView;

    .line 244
    .line 245
    if-eqz v18, :cond_1

    .line 246
    .line 247
    const v0, 0x7f0a122f

    .line 248
    .line 249
    .line 250
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 251
    .line 252
    .line 253
    move-result-object v18

    .line 254
    check-cast v18, Landroid/widget/TextView;

    .line 255
    .line 256
    if-eqz v18, :cond_1

    .line 257
    .line 258
    const v0, 0x7f0a1291

    .line 259
    .line 260
    .line 261
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 262
    .line 263
    .line 264
    move-result-object v19

    .line 265
    check-cast v19, Landroid/widget/TextView;

    .line 266
    .line 267
    if-eqz v19, :cond_1

    .line 268
    .line 269
    new-instance v0, La/zkk;

    .line 270
    .line 271
    move-object v2, v3

    .line 272
    move-object v3, v4

    .line 273
    move-object v4, v5

    .line 274
    move-object v5, v6

    .line 275
    move-object v6, v7

    .line 276
    move-object v7, v8

    .line 277
    move-object v8, v9

    .line 278
    move-object v9, v10

    .line 279
    move-object v10, v11

    .line 280
    move-object v11, v12

    .line 281
    move-object v12, v13

    .line 282
    move-object v13, v14

    .line 283
    move-object v14, v15

    .line 284
    move-object/from16 v15, v16

    .line 285
    .line 286
    move-object/from16 v16, v17

    .line 287
    .line 288
    move-object/from16 v17, v18

    .line 289
    .line 290
    move-object/from16 v18, v19

    .line 291
    .line 292
    invoke-direct/range {v0 .. v18}, La/zkk;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 293
    .line 294
    .line 295
    iput-object v0, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->q:La/zkk;

    .line 296
    .line 297
    filled-new-array {v3, v5, v6, v4, v2}, [Landroid/widget/ImageView;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    iput-object v0, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->r:Ljava/util/List;

    .line 306
    .line 307
    filled-new-array {v10, v12, v13, v11, v9}, [Landroid/widget/ImageView;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    iput-object v0, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->s:Ljava/util/List;

    .line 316
    .line 317
    return-void

    .line 318
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    const-string v1, "Missing required view with ID: "

    .line 327
    .line 328
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v2
.end method

.method public static C(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sget-object v1, Landroid/view/ViewGroup;->ALPHA:Landroid/util/Property;

    .line 8
    .line 9
    invoke-static {p0, v1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v1, La/akc;

    .line 17
    .line 18
    const/4 v2, 0x5

    .line 19
    invoke-direct {v1, p0, p1, v2}, La/akc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private final setWinDices(La/gkk;)V
    .locals 2

    .line 1
    iget-object v0, p1, La/gkk;->f:La/nkk;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object p1, p1, La/gkk;->e:Ljava/util/List;

    .line 14
    .line 15
    iget-object v0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->s:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->z(Ljava/util/List;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    iget-object p1, p1, La/gkk;->d:Ljava/util/List;

    .line 22
    .line 23
    iget-object v0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->r:Ljava/util/List;

    .line 24
    .line 25
    invoke-virtual {p0, p1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->z(Ljava/util/List;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static final synthetic u(Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;La/gkk;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->setWinDices(La/gkk;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static x(Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    add-int/lit8 v2, v0, 0x1

    .line 17
    .line 18
    if-ltz v0, :cond_0

    .line 19
    .line 20
    check-cast v1, La/fkk;

    .line 21
    .line 22
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/widget/ImageView;

    .line 27
    .line 28
    iget v1, v1, La/fkk;->a:I

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 31
    .line 32
    .line 33
    move v0, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {}, La/q3d;->p()V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    throw p0

    .line 40
    :cond_1
    return-void
.end method


# virtual methods
.method public final A(La/jkk;Z)V
    .locals 7

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, La/jkk;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->s:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {p1, p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->x(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, La/qkk;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->q:La/zkk;

    .line 25
    .line 26
    iget-object v2, p2, La/zkk;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Landroid/widget/ImageView;

    .line 29
    .line 30
    iget-object p2, p2, La/zkk;->f:Landroid/view/ViewGroup;

    .line 31
    .line 32
    move-object v4, p2

    .line 33
    check-cast v4, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;

    .line 34
    .line 35
    iget-object v5, p1, La/jkk;->b:Ljava/util/List;

    .line 36
    .line 37
    new-instance v6, La/ykk;

    .line 38
    .line 39
    const/4 p2, 0x1

    .line 40
    invoke-direct {v6, p0, p1, p2}, La/ykk;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;La/jkk;B)V

    .line 41
    .line 42
    .line 43
    const v3, 0x7f010022

    .line 44
    .line 45
    .line 46
    invoke-direct/range {v0 .. v6}, La/qkk;-><init>(Landroid/content/Context;Landroid/widget/ImageView;ILorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final B(La/okk;La/tkz;Z)V
    .locals 6

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iget-object v1, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->q:La/zkk;

    .line 4
    .line 5
    if-eqz p3, :cond_2

    .line 6
    .line 7
    iget-boolean p2, p1, La/okk;->c:Z

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    iget-object p2, v1, La/zkk;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Landroid/widget/TextView;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const p3, 0x7f130920

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object p0, v1, La/zkk;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Landroid/widget/TextView;

    .line 33
    .line 34
    iget-object p2, p1, La/okk;->b:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object p0, v1, La/zkk;->g:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 42
    .line 43
    iget-boolean p1, p1, La/okk;->d:Z

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    iget-object p3, v1, La/zkk;->g:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p3, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 55
    .line 56
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    iget-object p3, v1, La/zkk;->h:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p3, Landroid/widget/TextView;

    .line 62
    .line 63
    iget-object v0, p1, La/okk;->a:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    sget-object p3, La/tvk;->a:La/rwj;

    .line 69
    .line 70
    sget-object v3, La/ys10;->a:La/vs10;

    .line 71
    .line 72
    new-instance v1, La/vbk;

    .line 73
    .line 74
    const/4 p3, 0x6

    .line 75
    invoke-direct {v1, p3}, La/vbk;-><init>(B)V

    .line 76
    .line 77
    .line 78
    new-instance v4, La/fr9;

    .line 79
    .line 80
    const/4 p3, 0x0

    .line 81
    const/16 v0, 0x12

    .line 82
    .line 83
    invoke-direct {v4, p0, p1, p3, v0}, La/fr9;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 84
    .line 85
    .line 86
    const/16 v5, 0xa

    .line 87
    .line 88
    const/4 v2, 0x0

    .line 89
    move-object v0, p2

    .line 90
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final v(La/jkk;Z)V
    .locals 7

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, La/jkk;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object p0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->r:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {p1, p0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->x(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, La/qkk;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->q:La/zkk;

    .line 25
    .line 26
    iget-object v2, p2, La/zkk;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Landroid/widget/ImageView;

    .line 29
    .line 30
    iget-object p2, p2, La/zkk;->f:Landroid/view/ViewGroup;

    .line 31
    .line 32
    move-object v4, p2

    .line 33
    check-cast v4, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;

    .line 34
    .line 35
    iget-object v5, p1, La/jkk;->b:Ljava/util/List;

    .line 36
    .line 37
    new-instance v6, La/ykk;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    invoke-direct {v6, p0, p1, p2}, La/ykk;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;La/jkk;B)V

    .line 41
    .line 42
    .line 43
    const v3, 0x7f010023

    .line 44
    .line 45
    .line 46
    invoke-direct/range {v0 .. v6}, La/qkk;-><init>(Landroid/content/Context;Landroid/widget/ImageView;ILorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final w(La/gkk;ZLa/tkz;)V
    .locals 11

    .line 1
    iget-object v0, p1, La/gkk;->f:La/nkk;

    .line 2
    .line 3
    sget-object v1, La/nkk;->d:La/nkk;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, La/tvk;->a:La/rwj;

    .line 8
    .line 9
    sget-object v4, La/ys10;->a:La/vs10;

    .line 10
    .line 11
    new-instance v2, La/vbk;

    .line 12
    .line 13
    const/4 v0, 0x5

    .line 14
    invoke-direct {v2, v0}, La/vbk;-><init>(B)V

    .line 15
    .line 16
    .line 17
    new-instance v5, La/xj1;

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x5

    .line 21
    move-object v7, p0

    .line 22
    move-object v8, p1

    .line 23
    move v6, p2

    .line 24
    invoke-direct/range {v5 .. v10}, La/xj1;-><init>(ZLjava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 25
    .line 26
    .line 27
    const/16 v6, 0xa

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    move-object v1, p3

    .line 31
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final y(Ljava/util/List;Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    add-int/lit8 v2, v0, 0x1

    .line 17
    .line 18
    if-ltz v0, :cond_1

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroid/widget/ImageView;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const v3, 0x7f0803f3

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v1}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Landroid/widget/ImageView;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const v3, 0x7f0606a8

    .line 66
    .line 67
    .line 68
    invoke-static {v3, v1}, La/sj3;->P(ILandroid/content/Context;)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 73
    .line 74
    .line 75
    :goto_1
    move v0, v2

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 78
    .line 79
    .line 80
    const/4 p0, 0x0

    .line 81
    throw p0

    .line 82
    :cond_2
    return-void
.end method

.method public final z(Ljava/util/List;Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    add-int/lit8 v2, v0, 0x1

    .line 17
    .line 18
    if-ltz v0, :cond_1

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroid/widget/ImageView;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const v3, 0x7f0803f4

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v1}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    move v0, v2

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    throw p0

    .line 58
    :cond_2
    return-void
.end method
