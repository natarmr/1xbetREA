.class public final Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements La/cbo;


# instance fields
.field public final q:La/jbo;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 355
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 354
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 24

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
    const v3, 0x7f04035a

    .line 16
    .line 17
    .line 18
    move-object/from16 v4, p1

    .line 19
    .line 20
    invoke-direct {v1, v4, v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const v3, 0x7f0d01b2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    const v0, 0x7f0a056f

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Landroid/widget/TextView;

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const v0, 0x7f0a0570

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Landroid/widget/TextView;

    .line 52
    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    const v0, 0x7f0a0581

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Landroid/widget/TextView;

    .line 63
    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    const v0, 0x7f0a0582

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    check-cast v6, Landroid/widget/TextView;

    .line 74
    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    const v0, 0x7f0a058b

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Landroid/widget/TextView;

    .line 85
    .line 86
    if-eqz v7, :cond_1

    .line 87
    .line 88
    const v0, 0x7f0a0590

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    check-cast v8, Landroid/widget/TextView;

    .line 96
    .line 97
    if-eqz v8, :cond_1

    .line 98
    .line 99
    const v0, 0x7f0a0591

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    check-cast v9, Landroid/widget/TextView;

    .line 107
    .line 108
    if-eqz v9, :cond_1

    .line 109
    .line 110
    const v0, 0x7f0a0596

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    check-cast v10, Landroid/widget/TextView;

    .line 118
    .line 119
    if-eqz v10, :cond_1

    .line 120
    .line 121
    const v0, 0x7f0a0597

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    check-cast v11, Landroid/widget/TextView;

    .line 129
    .line 130
    if-eqz v11, :cond_1

    .line 131
    .line 132
    const v0, 0x7f0a07d4

    .line 133
    .line 134
    .line 135
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v12

    .line 139
    check-cast v12, Landroid/widget/TextView;

    .line 140
    .line 141
    if-eqz v12, :cond_1

    .line 142
    .line 143
    const v0, 0x7f0a0cd3

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    check-cast v13, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 151
    .line 152
    if-eqz v13, :cond_1

    .line 153
    .line 154
    const v0, 0x7f0a0d03

    .line 155
    .line 156
    .line 157
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    check-cast v14, Landroid/widget/TextView;

    .line 162
    .line 163
    if-eqz v14, :cond_1

    .line 164
    .line 165
    const v0, 0x7f0a0d04

    .line 166
    .line 167
    .line 168
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v15

    .line 172
    check-cast v15, Landroid/widget/TextView;

    .line 173
    .line 174
    if-eqz v15, :cond_1

    .line 175
    .line 176
    const v0, 0x7f0a0d17

    .line 177
    .line 178
    .line 179
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object v16

    .line 183
    check-cast v16, Landroid/widget/TextView;

    .line 184
    .line 185
    if-eqz v16, :cond_1

    .line 186
    .line 187
    const v0, 0x7f0a0d18

    .line 188
    .line 189
    .line 190
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object v17

    .line 194
    check-cast v17, Landroid/widget/TextView;

    .line 195
    .line 196
    if-eqz v17, :cond_1

    .line 197
    .line 198
    const v0, 0x7f0a0d21

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v18

    .line 205
    check-cast v18, Landroid/widget/TextView;

    .line 206
    .line 207
    if-eqz v18, :cond_1

    .line 208
    .line 209
    const v0, 0x7f0a0d26

    .line 210
    .line 211
    .line 212
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 213
    .line 214
    .line 215
    move-result-object v19

    .line 216
    check-cast v19, Landroid/widget/TextView;

    .line 217
    .line 218
    if-eqz v19, :cond_1

    .line 219
    .line 220
    const v0, 0x7f0a0d27

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 224
    .line 225
    .line 226
    move-result-object v20

    .line 227
    check-cast v20, Landroid/widget/TextView;

    .line 228
    .line 229
    if-eqz v20, :cond_1

    .line 230
    .line 231
    const v0, 0x7f0a0d2c

    .line 232
    .line 233
    .line 234
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 235
    .line 236
    .line 237
    move-result-object v21

    .line 238
    check-cast v21, Landroid/widget/TextView;

    .line 239
    .line 240
    if-eqz v21, :cond_1

    .line 241
    .line 242
    const v0, 0x7f0a0d2d

    .line 243
    .line 244
    .line 245
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v22

    .line 249
    check-cast v22, Landroid/widget/TextView;

    .line 250
    .line 251
    if-eqz v22, :cond_1

    .line 252
    .line 253
    const v0, 0x7f0a0fc0

    .line 254
    .line 255
    .line 256
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v23

    .line 260
    check-cast v23, Landroid/widget/TextView;

    .line 261
    .line 262
    if-eqz v23, :cond_1

    .line 263
    .line 264
    new-instance v0, La/jbo;

    .line 265
    .line 266
    move-object v2, v3

    .line 267
    move-object v3, v4

    .line 268
    move-object v4, v5

    .line 269
    move-object v5, v6

    .line 270
    move-object v6, v7

    .line 271
    move-object v7, v8

    .line 272
    move-object v8, v9

    .line 273
    move-object v9, v10

    .line 274
    move-object v10, v11

    .line 275
    move-object v11, v12

    .line 276
    move-object v12, v13

    .line 277
    move-object v13, v14

    .line 278
    move-object v14, v15

    .line 279
    move-object/from16 v15, v16

    .line 280
    .line 281
    move-object/from16 v16, v17

    .line 282
    .line 283
    move-object/from16 v17, v18

    .line 284
    .line 285
    move-object/from16 v18, v19

    .line 286
    .line 287
    move-object/from16 v19, v20

    .line 288
    .line 289
    move-object/from16 v20, v21

    .line 290
    .line 291
    move-object/from16 v21, v22

    .line 292
    .line 293
    move-object/from16 v22, v23

    .line 294
    .line 295
    invoke-direct/range {v0 .. v22}, La/jbo;-><init>(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit_sport/score/SportScore;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 296
    .line 297
    .line 298
    move-object v4, v0

    .line 299
    move-object/from16 v0, v16

    .line 300
    .line 301
    move-object/from16 v2, v19

    .line 302
    .line 303
    move-object/from16 v3, v21

    .line 304
    .line 305
    iput-object v4, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    .line 306
    .line 307
    const/4 v4, 0x0

    .line 308
    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutDirection(I)V

    .line 309
    .line 310
    .line 311
    const-string v1, "x1"

    .line 312
    .line 313
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 314
    .line 315
    .line 316
    const-string v4, "x2"

    .line 317
    .line 318
    invoke-virtual {v8, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 319
    .line 320
    .line 321
    const-string v5, "x3"

    .line 322
    .line 323
    invoke-virtual {v10, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    const-string v1, "Missing required view with ID: "

    .line 345
    .line 346
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw v2
.end method


# virtual methods
.method public final setFirstFormula(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setFirstFormula(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setFirstFormula(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    iget-object p0, p0, La/jbo;->c:Landroid/view/View;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setFirstFormulaTitle(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setFirstFormulaTitle(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setFirstFormulaTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    iget-object p0, p0, La/jbo;->d:Landroid/view/View;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setFirstPlayerFirstAnswer(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setFirstPlayerFirstAnswer(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setFirstPlayerFirstAnswer(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    iget-object p0, p0, La/jbo;->e:Landroid/view/View;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setFirstPlayerName(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setFirstPlayerName(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setFirstPlayerName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    iget-object p0, p0, La/jbo;->f:Landroid/view/View;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setFirstPlayerSecondAnswer(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setFirstPlayerSecondAnswer(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setFirstPlayerSecondAnswer(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    iget-object p0, p0, La/jbo;->g:Landroid/view/View;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setFirstPlayerThirdAnswer(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setFirstPlayerThirdAnswer(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setFirstPlayerThirdAnswer(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    iget-object p0, p0, La/jbo;->h:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setInformation(I)V
    .locals 1

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setInformation(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setInformation(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    .line 2
    .line 3
    iget-object v0, p0, La/jbo;->i:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/TextView;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/16 v1, 0x8

    .line 19
    .line 20
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, La/jbo;->i:Landroid/view/View;

    .line 24
    .line 25
    check-cast p0, Landroid/widget/TextView;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final setScoreModel(La/p5h0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    .line 5
    .line 6
    iget-object p0, p0, La/jbo;->q:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/score/SportScore;->setScore(La/p5h0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setSecondFormula(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setSecondFormula(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setSecondFormula(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    iget-object p0, p0, La/jbo;->j:Landroid/view/View;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setSecondFormulaTitle(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setSecondFormulaTitle(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setSecondFormulaTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    iget-object p0, p0, La/jbo;->k:Landroid/view/View;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setSecondPlayerFirstAnswer(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setSecondPlayerSecondAnswer(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setSecondPlayerFirstAnswer(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    iget-object p0, p0, La/jbo;->l:Landroid/view/View;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setSecondPlayerName(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setSecondPlayerName(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setSecondPlayerName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    iget-object p0, p0, La/jbo;->m:Landroid/view/View;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setSecondPlayerSecondAnswer(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setSecondPlayerSecondAnswer(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setSecondPlayerSecondAnswer(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    iget-object p0, p0, La/jbo;->n:Landroid/view/View;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setSecondPlayerThirdAnswer(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setSecondPlayerThirdAnswer(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setSecondPlayerThirdAnswer(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    iget-object p0, p0, La/jbo;->o:Landroid/view/View;

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTimeLeft(I)V
    .locals 1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->setTimeLeft(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTimeLeft(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleWinningFormula;->q:La/jbo;

    .line 2
    .line 3
    iget-object v0, p0, La/jbo;->p:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/TextView;

    .line 6
    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    const/4 v1, 0x4

    .line 19
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, La/jbo;->p:Landroid/view/View;

    .line 23
    .line 24
    check-cast p0, Landroid/widget/TextView;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
