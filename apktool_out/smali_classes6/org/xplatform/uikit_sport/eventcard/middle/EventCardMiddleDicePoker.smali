.class public final Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements La/cbo;


# instance fields
.field public final q:La/tbc;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 330
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 329
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 21

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
    const v3, 0x7f040353

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
    const v3, 0x7f0d01a9

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    const v0, 0x7f0a0549

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Landroid/widget/ImageView;

    .line 41
    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    const v0, 0x7f0a054a

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Landroid/widget/ImageView;

    .line 52
    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    const v0, 0x7f0a056c

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Landroid/widget/ImageView;

    .line 63
    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    const v0, 0x7f0a056d

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    check-cast v6, Landroid/widget/ImageView;

    .line 74
    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    const v0, 0x7f0a05fa

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Lcom/google/android/flexbox/FlexboxLayout;

    .line 85
    .line 86
    if-eqz v7, :cond_1

    .line 87
    .line 88
    const v0, 0x7f0a05fb

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    check-cast v7, Lcom/google/android/flexbox/FlexboxLayout;

    .line 96
    .line 97
    if-eqz v7, :cond_1

    .line 98
    .line 99
    const v0, 0x7f0a060a

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    check-cast v7, Landroid/widget/ImageView;

    .line 107
    .line 108
    if-eqz v7, :cond_1

    .line 109
    .line 110
    const v0, 0x7f0a060b

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    check-cast v8, Landroid/widget/ImageView;

    .line 118
    .line 119
    if-eqz v8, :cond_1

    .line 120
    .line 121
    const v0, 0x7f0a0b62

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    check-cast v9, Landroid/widget/TextView;

    .line 129
    .line 130
    if-eqz v9, :cond_1

    .line 131
    .line 132
    const v0, 0x7f0a0b63

    .line 133
    .line 134
    .line 135
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    check-cast v10, Landroid/widget/TextView;

    .line 140
    .line 141
    if-eqz v10, :cond_1

    .line 142
    .line 143
    const v0, 0x7f0a0b6c

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    check-cast v11, Landroid/widget/TextView;

    .line 151
    .line 152
    if-eqz v11, :cond_1

    .line 153
    .line 154
    const v0, 0x7f0a0b6d

    .line 155
    .line 156
    .line 157
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v12

    .line 161
    check-cast v12, Landroid/widget/TextView;

    .line 162
    .line 163
    if-eqz v12, :cond_1

    .line 164
    .line 165
    const v0, 0x7f0a0cd3

    .line 166
    .line 167
    .line 168
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    check-cast v13, Lorg/xplatform/uikit_sport/score/SportScore;

    .line 173
    .line 174
    if-eqz v13, :cond_1

    .line 175
    .line 176
    const v0, 0x7f0a0d00

    .line 177
    .line 178
    .line 179
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object v14

    .line 183
    check-cast v14, Landroid/widget/ImageView;

    .line 184
    .line 185
    if-eqz v14, :cond_1

    .line 186
    .line 187
    const v0, 0x7f0a0d01

    .line 188
    .line 189
    .line 190
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object v15

    .line 194
    check-cast v15, Landroid/widget/ImageView;

    .line 195
    .line 196
    if-eqz v15, :cond_1

    .line 197
    .line 198
    const v0, 0x7f0a0f96

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v16

    .line 205
    check-cast v16, Landroid/widget/ImageView;

    .line 206
    .line 207
    if-eqz v16, :cond_1

    .line 208
    .line 209
    const v0, 0x7f0a0f97

    .line 210
    .line 211
    .line 212
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 213
    .line 214
    .line 215
    move-result-object v17

    .line 216
    check-cast v17, Landroid/widget/ImageView;

    .line 217
    .line 218
    if-eqz v17, :cond_1

    .line 219
    .line 220
    const v0, 0x7f0a0fc6

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 224
    .line 225
    .line 226
    move-result-object v18

    .line 227
    check-cast v18, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 228
    .line 229
    if-eqz v18, :cond_1

    .line 230
    .line 231
    const v0, 0x7f0a1146

    .line 232
    .line 233
    .line 234
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 235
    .line 236
    .line 237
    move-result-object v19

    .line 238
    check-cast v19, Landroid/widget/TextView;

    .line 239
    .line 240
    if-eqz v19, :cond_1

    .line 241
    .line 242
    const v0, 0x7f0a1160

    .line 243
    .line 244
    .line 245
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v20

    .line 249
    check-cast v20, Landroid/widget/TextView;

    .line 250
    .line 251
    if-eqz v20, :cond_1

    .line 252
    .line 253
    new-instance v0, La/tbc;

    .line 254
    .line 255
    move-object v2, v3

    .line 256
    move-object v3, v4

    .line 257
    move-object v4, v5

    .line 258
    move-object v5, v6

    .line 259
    move-object v6, v7

    .line 260
    move-object v7, v8

    .line 261
    move-object v8, v9

    .line 262
    move-object v9, v10

    .line 263
    move-object v10, v11

    .line 264
    move-object v11, v12

    .line 265
    move-object v12, v13

    .line 266
    move-object v13, v14

    .line 267
    move-object v14, v15

    .line 268
    move-object/from16 v15, v16

    .line 269
    .line 270
    move-object/from16 v16, v17

    .line 271
    .line 272
    move-object/from16 v17, v18

    .line 273
    .line 274
    move-object/from16 v18, v19

    .line 275
    .line 276
    move-object/from16 v19, v20

    .line 277
    .line 278
    invoke-direct/range {v0 .. v19}, La/tbc;-><init>(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit_sport/score/SportScore;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lorg/xplatform/uikit/components/timer/DsTimer;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 279
    .line 280
    .line 281
    move-object v8, v0

    .line 282
    move-object/from16 v0, v16

    .line 283
    .line 284
    iput-object v8, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->q:La/tbc;

    .line 285
    .line 286
    const/4 v8, 0x0

    .line 287
    invoke-virtual {v1, v8}, Landroid/view/View;->setLayoutDirection(I)V

    .line 288
    .line 289
    .line 290
    filled-new-array {v4, v13, v15, v6, v2}, [Landroid/widget/ImageView;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    iput-object v2, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->r:Ljava/util/List;

    .line 299
    .line 300
    filled-new-array {v5, v14, v0, v7, v3}, [Landroid/widget/ImageView;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->s:Ljava/util/List;

    .line 309
    .line 310
    return-void

    .line 311
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    const-string v1, "Missing required view with ID: "

    .line 320
    .line 321
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw v2
.end method

.method public static u(Ljava/util/List;Ljava/util/List;)V
    .locals 6

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
    if-eqz v1, :cond_3

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
    const/4 v3, 0x0

    .line 19
    if-ltz v0, :cond_2

    .line 20
    .line 21
    check-cast v1, Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/high16 v5, 0x3f800000    # 1.0f

    .line 28
    .line 29
    if-ge v0, v4, :cond_1

    .line 30
    .line 31
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, La/llk;

    .line 36
    .line 37
    iget v3, v3, La/llk;->a:I

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, La/llk;

    .line 47
    .line 48
    iget-boolean v0, v0, La/llk;->b:Z

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    const/high16 v5, 0x3f000000    # 0.5f

    .line 53
    .line 54
    :cond_0
    invoke-virtual {v1, v5}, Landroid/view/View;->setAlpha(F)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v5}, Landroid/view/View;->setAlpha(F)V

    .line 62
    .line 63
    .line 64
    :goto_1
    move v0, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 67
    .line 68
    .line 69
    throw v3

    .line 70
    :cond_3
    return-void
.end method


# virtual methods
.method public final setGameLabel(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->q:La/tbc;

    .line 2
    .line 3
    iget-object v0, p0, La/tbc;->i:Landroid/view/View;

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
    iget-object p0, p0, La/tbc;->i:Landroid/view/View;

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

.method public final setHideAfterFinished(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->q:La/tbc;

    .line 2
    .line 3
    iget-object p0, p0, La/tbc;->h:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/timer/DsTimer;->setHideAfterFinished(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setInformation(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->q:La/tbc;

    .line 2
    .line 3
    iget-object v0, p0, La/tbc;->j:Landroid/view/View;

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
    iget-object p0, p0, La/tbc;->j:Landroid/view/View;

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

.method public final setPlayerOneCombination(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->q:La/tbc;

    .line 5
    .line 6
    iget-object v0, p0, La/tbc;->d:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/tbc;->d:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final setPlayerOneDice(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/llk;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->r:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {p1, p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->u(Ljava/util/List;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setPlayerOneName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->q:La/tbc;

    .line 2
    .line 3
    iget-object p0, p0, La/tbc;->e:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setPlayerTwoCombination(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->q:La/tbc;

    .line 5
    .line 6
    iget-object v0, p0, La/tbc;->c:Landroid/view/View;

    .line 7
    .line 8
    check-cast v0, Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const/16 v1, 0x8

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, La/tbc;->c:Landroid/view/View;

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

.method public final setPlayerTwoDice(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/llk;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->s:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {p1, p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->u(Ljava/util/List;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setPlayerTwoName(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->q:La/tbc;

    .line 2
    .line 3
    iget-object p0, p0, La/tbc;->g:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setScoreModel(La/p5h0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->q:La/tbc;

    .line 5
    .line 6
    iget-object p0, p0, La/tbc;->b:Landroid/view/View;

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

.method public final setTime(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->q:La/tbc;

    .line 2
    .line 3
    iget-object p0, p0, La/tbc;->h:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/uikit/components/timer/DsTimer;->setTime(J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setTimeDirection(La/l7n;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->q:La/tbc;

    .line 5
    .line 6
    iget-object p0, p0, La/tbc;->h:Landroid/view/View;

    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/timer/DsTimer;->setTimeDirection(La/l7n;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setTimerVisibility(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleDicePoker;->q:La/tbc;

    .line 2
    .line 3
    iget-object p0, p0, La/tbc;->h:Landroid/view/View;

    .line 4
    .line 5
    check-cast p0, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/timer/DsTimer;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
