.class public final Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements La/cbo;


# instance fields
.field public final q:La/ebo;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 333
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 332
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    const v3, 0x7f040352

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
    const v3, 0x7f0d01a7

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    const v0, 0x7f0a01a1

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
    const v0, 0x7f0a0244

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
    const v0, 0x7f0a0375

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Landroidx/constraintlayout/widget/Barrier;

    .line 63
    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    const v0, 0x7f0a041f

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Landroid/widget/ImageView;

    .line 74
    .line 75
    if-eqz v5, :cond_1

    .line 76
    .line 77
    const v0, 0x7f0a0420

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    check-cast v6, Landroid/widget/ImageView;

    .line 85
    .line 86
    if-eqz v6, :cond_1

    .line 87
    .line 88
    const v0, 0x7f0a0421

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    check-cast v7, Landroid/widget/ImageView;

    .line 96
    .line 97
    if-eqz v7, :cond_1

    .line 98
    .line 99
    const v0, 0x7f0a0423

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    check-cast v8, Landroid/widget/ImageView;

    .line 107
    .line 108
    if-eqz v8, :cond_1

    .line 109
    .line 110
    const v0, 0x7f0a0424

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    check-cast v9, Landroid/widget/ImageView;

    .line 118
    .line 119
    if-eqz v9, :cond_1

    .line 120
    .line 121
    const v0, 0x7f0a057d

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    check-cast v10, Landroid/widget/TextView;

    .line 129
    .line 130
    if-eqz v10, :cond_1

    .line 131
    .line 132
    const v0, 0x7f0a0583

    .line 133
    .line 134
    .line 135
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    check-cast v11, Landroid/widget/ImageView;

    .line 140
    .line 141
    if-eqz v11, :cond_1

    .line 142
    .line 143
    const v0, 0x7f0a058b

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    check-cast v12, Landroid/widget/TextView;

    .line 151
    .line 152
    if-eqz v12, :cond_1

    .line 153
    .line 154
    const v0, 0x7f0a0592

    .line 155
    .line 156
    .line 157
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v13

    .line 161
    check-cast v13, Landroid/widget/ImageView;

    .line 162
    .line 163
    if-eqz v13, :cond_1

    .line 164
    .line 165
    const v0, 0x7f0a0598

    .line 166
    .line 167
    .line 168
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v14

    .line 172
    check-cast v14, Landroid/widget/ImageView;

    .line 173
    .line 174
    if-eqz v14, :cond_1

    .line 175
    .line 176
    const v0, 0x7f0a07d4

    .line 177
    .line 178
    .line 179
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    check-cast v15, Landroid/widget/TextView;

    .line 184
    .line 185
    if-eqz v15, :cond_1

    .line 186
    .line 187
    const v0, 0x7f0a0cd3

    .line 188
    .line 189
    .line 190
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object v16

    .line 194
    check-cast v16, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 195
    .line 196
    if-eqz v16, :cond_1

    .line 197
    .line 198
    const v0, 0x7f0a0d13

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v17

    .line 205
    check-cast v17, Landroid/widget/TextView;

    .line 206
    .line 207
    if-eqz v17, :cond_1

    .line 208
    .line 209
    const v0, 0x7f0a0d19

    .line 210
    .line 211
    .line 212
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 213
    .line 214
    .line 215
    move-result-object v18

    .line 216
    check-cast v18, Landroid/widget/ImageView;

    .line 217
    .line 218
    if-eqz v18, :cond_1

    .line 219
    .line 220
    const v0, 0x7f0a0d21

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 224
    .line 225
    .line 226
    move-result-object v19

    .line 227
    check-cast v19, Landroid/widget/TextView;

    .line 228
    .line 229
    if-eqz v19, :cond_1

    .line 230
    .line 231
    const v0, 0x7f0a0d28

    .line 232
    .line 233
    .line 234
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 235
    .line 236
    .line 237
    move-result-object v20

    .line 238
    check-cast v20, Landroid/widget/ImageView;

    .line 239
    .line 240
    if-eqz v20, :cond_1

    .line 241
    .line 242
    const v0, 0x7f0a0d2e

    .line 243
    .line 244
    .line 245
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v21

    .line 249
    check-cast v21, Landroid/widget/ImageView;

    .line 250
    .line 251
    if-eqz v21, :cond_1

    .line 252
    .line 253
    const v0, 0x7f0a0fc6

    .line 254
    .line 255
    .line 256
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v22

    .line 260
    check-cast v22, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 261
    .line 262
    if-eqz v22, :cond_1

    .line 263
    .line 264
    const v0, 0x7f0a0fff

    .line 265
    .line 266
    .line 267
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v23

    .line 271
    check-cast v23, Landroidx/constraintlayout/widget/Barrier;

    .line 272
    .line 273
    if-eqz v23, :cond_1

    .line 274
    .line 275
    new-instance v0, La/ebo;

    .line 276
    .line 277
    move-object v2, v3

    .line 278
    move-object v3, v4

    .line 279
    move-object v4, v5

    .line 280
    move-object v5, v6

    .line 281
    move-object v6, v7

    .line 282
    move-object v7, v8

    .line 283
    move-object v8, v9

    .line 284
    move-object v9, v10

    .line 285
    move-object v10, v11

    .line 286
    move-object v11, v12

    .line 287
    move-object v12, v13

    .line 288
    move-object v13, v14

    .line 289
    move-object v14, v15

    .line 290
    move-object/from16 v15, v16

    .line 291
    .line 292
    move-object/from16 v16, v17

    .line 293
    .line 294
    move-object/from16 v17, v18

    .line 295
    .line 296
    move-object/from16 v18, v19

    .line 297
    .line 298
    move-object/from16 v19, v20

    .line 299
    .line 300
    move-object/from16 v20, v21

    .line 301
    .line 302
    move-object/from16 v21, v22

    .line 303
    .line 304
    invoke-direct/range {v0 .. v21}, La/ebo;-><init>(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Lorg/xplatform/uikit_sport/score/SportScore;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lorg/xplatform/uikit/components/timer/DsTimer;)V

    .line 305
    .line 306
    .line 307
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 308
    .line 309
    const/4 v0, 0x0

    .line 310
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    const-string v1, "Missing required view with ID: "

    .line 323
    .line 324
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    throw v2
.end method

.method private final getDealerCardViews()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 2
    .line 3
    iget-object v0, p0, La/ebo;->e:Landroid/widget/ImageView;

    .line 4
    .line 5
    iget-object v1, p0, La/ebo;->g:Landroid/widget/ImageView;

    .line 6
    .line 7
    iget-object v2, p0, La/ebo;->h:Landroid/widget/ImageView;

    .line 8
    .line 9
    iget-object v3, p0, La/ebo;->f:Landroid/widget/ImageView;

    .line 10
    .line 11
    iget-object p0, p0, La/ebo;->d:Landroid/widget/ImageView;

    .line 12
    .line 13
    filled-new-array {v0, v1, v2, v3, p0}, [Landroid/widget/ImageView;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private final getFirstPlayerCardViews()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 2
    .line 3
    iget-object v0, p0, La/ebo;->j:Landroid/widget/ImageView;

    .line 4
    .line 5
    iget-object v1, p0, La/ebo;->l:Landroid/widget/ImageView;

    .line 6
    .line 7
    iget-object p0, p0, La/ebo;->m:Landroid/widget/ImageView;

    .line 8
    .line 9
    filled-new-array {v0, v1, p0}, [Landroid/widget/ImageView;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private final getSecondPlayerCardViews()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 2
    .line 3
    iget-object v0, p0, La/ebo;->q:Landroid/widget/ImageView;

    .line 4
    .line 5
    iget-object v1, p0, La/ebo;->s:Landroid/widget/ImageView;

    .line 6
    .line 7
    iget-object p0, p0, La/ebo;->t:Landroid/widget/ImageView;

    .line 8
    .line 9
    filled-new-array {v0, v1, p0}, [Landroid/widget/ImageView;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static u(Ljava/util/List;Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_3

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    add-int/lit8 v3, v1, 0x1

    .line 18
    .line 19
    if-ltz v1, :cond_2

    .line 20
    .line 21
    check-cast v2, Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-ge v1, v4, :cond_0

    .line 28
    .line 29
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, La/laa;

    .line 34
    .line 35
    iget v4, v4, La/laa;->a:I

    .line 36
    .line 37
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-ge v1, v4, :cond_1

    .line 45
    .line 46
    move v1, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/16 v1, 0x8

    .line 49
    .line 50
    :goto_1
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    move v1, v3

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    throw p0

    .line 60
    :cond_3
    return-void
.end method

.method public static v(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->getDealerCardViews()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    add-int/lit8 v3, v1, 0x1

    .line 22
    .line 23
    if-ltz v1, :cond_1

    .line 24
    .line 25
    check-cast v2, Landroid/widget/ImageView;

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    add-int/lit8 v4, v4, -0x1

    .line 32
    .line 33
    if-gt v1, v4, :cond_0

    .line 34
    .line 35
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, La/laa;

    .line 40
    .line 41
    iget v1, v1, La/laa;->a:I

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    const v1, 0x7f0806e1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 54
    .line 55
    .line 56
    const/16 v1, 0x8

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    :goto_1
    move v1, v3

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    throw p0

    .line 68
    :cond_2
    return-void
.end method


# virtual methods
.method public final setBottomInfo(I)V
    .locals 1

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setBottomInfo(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setBottomInfo(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 2
    .line 3
    iget-object v0, p0, La/ebo;->b:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 v1, 0x4

    .line 17
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/ebo;->b:Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final setCaption(I)V
    .locals 1

    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setCaption(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setCaption(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 2
    .line 3
    iget-object p0, p0, La/ebo;->c:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/16 v0, 0x8

    .line 17
    .line 18
    :goto_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final setFirstPlayerCards(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "La/laa;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->getFirstPlayerCardViews()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->u(Ljava/util/List;Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setFirstPlayerCombination(I)V
    .locals 1

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setFirstPlayerCombination(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setFirstPlayerCombination(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 2
    .line 3
    iget-object v0, p0, La/ebo;->i:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 v1, 0x4

    .line 17
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/ebo;->i:Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
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
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setFirstPlayerName(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setFirstPlayerName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    iget-object p0, p0, La/ebo;->k:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setHideAfterFinished(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 2
    .line 3
    iget-object p0, p0, La/ebo;->u:Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/timer/DsTimer;->setHideAfterFinished(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setInformation(I)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setInformation(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setInformation(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 2
    .line 3
    iget-object v0, p0, La/ebo;->n:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/16 v1, 0x8

    .line 17
    .line 18
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/ebo;->n:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final setScoreModel(La/p5h0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 5
    .line 6
    iget-object p0, p0, La/ebo;->o:Lorg/xplatform/uikit_sport/score/SportScore;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/score/SportScore;->setScore(La/p5h0;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setSecondPlayerCards(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "La/laa;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->getSecondPlayerCardViews()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->u(Ljava/util/List;Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setSecondPlayerCombination(I)V
    .locals 1

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setSecondPlayerCombination(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setSecondPlayerCombination(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 2
    .line 3
    iget-object v0, p0, La/ebo;->p:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 v1, 0x4

    .line 17
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/ebo;->p:Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
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
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->setSecondPlayerName(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setSecondPlayerName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    iget-object p0, p0, La/ebo;->r:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTime(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 2
    .line 3
    iget-object p0, p0, La/ebo;->u:Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/uikit/components/timer/DsTimer;->setTime(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setTimeDirection(La/l7n;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 5
    .line 6
    iget-object p0, p0, La/ebo;->u:Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/timer/DsTimer;->setTimeDirection(La/l7n;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTimerType(La/unq0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 5
    .line 6
    iget-object p0, p0, La/ebo;->u:Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/timer/DsTimer;->setTimerType(La/unq0;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTimerVisibility(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCyberPoker;->q:La/ebo;

    .line 2
    .line 3
    iget-object p0, p0, La/ebo;->u:Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 p1, 0x8

    .line 10
    .line 11
    :goto_0
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/timer/DsTimer;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
