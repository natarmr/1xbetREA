.class public final Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements La/cbo;


# static fields
.field public static final synthetic s:I


# instance fields
.field public final q:La/dbo;

.field public final r:La/a8z;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 347
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 346
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    and-int/lit8 v2, p3, 0x2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move-object v2, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object/from16 v2, p2

    .line 13
    .line 14
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const v4, 0x7f040351

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v0, v2, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const v4, 0x7f0d01a6

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v4, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    const v2, 0x7f0a0182

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    const v2, 0x7f0a0185

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Landroid/widget/ImageView;

    .line 52
    .line 53
    if-eqz v5, :cond_1

    .line 54
    .line 55
    const v2, 0x7f0a0186

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    check-cast v6, Landroid/widget/TextView;

    .line 63
    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    const v2, 0x7f0a0189

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    check-cast v7, Landroid/widget/TextView;

    .line 74
    .line 75
    if-eqz v7, :cond_1

    .line 76
    .line 77
    const v2, 0x7f0a018b

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    check-cast v8, Landroid/widget/TextView;

    .line 85
    .line 86
    if-eqz v8, :cond_1

    .line 87
    .line 88
    const v2, 0x7f0a018d

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    check-cast v9, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 96
    .line 97
    if-eqz v9, :cond_1

    .line 98
    .line 99
    const v2, 0x7f0a0190

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    check-cast v10, Landroid/widget/TextView;

    .line 107
    .line 108
    if-eqz v10, :cond_1

    .line 109
    .line 110
    const v2, 0x7f0a0192

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    check-cast v11, Landroid/widget/TextView;

    .line 118
    .line 119
    if-eqz v11, :cond_1

    .line 120
    .line 121
    const v2, 0x7f0a0642

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    check-cast v12, Landroid/widget/TextView;

    .line 129
    .line 130
    if-eqz v12, :cond_1

    .line 131
    .line 132
    const v2, 0x7f0a07c3

    .line 133
    .line 134
    .line 135
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    check-cast v13, Landroidx/constraintlayout/widget/Barrier;

    .line 140
    .line 141
    if-eqz v13, :cond_1

    .line 142
    .line 143
    const v2, 0x7f0a097d

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    check-cast v13, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;

    .line 151
    .line 152
    if-eqz v13, :cond_1

    .line 153
    .line 154
    const v2, 0x7f0a0c28

    .line 155
    .line 156
    .line 157
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a0d8b

    .line 166
    .line 167
    .line 168
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a0f0d

    .line 177
    .line 178
    .line 179
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object v16

    .line 183
    check-cast v16, Landroidx/constraintlayout/widget/Barrier;

    .line 184
    .line 185
    if-eqz v16, :cond_1

    .line 186
    .line 187
    const v2, 0x7f0a1004

    .line 188
    .line 189
    .line 190
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object v16

    .line 194
    check-cast v16, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 195
    .line 196
    if-eqz v16, :cond_1

    .line 197
    .line 198
    const v2, 0x7f0a1007

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v17

    .line 205
    check-cast v17, Landroid/widget/ImageView;

    .line 206
    .line 207
    if-eqz v17, :cond_1

    .line 208
    .line 209
    const v2, 0x7f0a1008

    .line 210
    .line 211
    .line 212
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 213
    .line 214
    .line 215
    move-result-object v18

    .line 216
    check-cast v18, Landroid/widget/TextView;

    .line 217
    .line 218
    if-eqz v18, :cond_1

    .line 219
    .line 220
    const v2, 0x7f0a100f

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a1011

    .line 232
    .line 233
    .line 234
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 235
    .line 236
    .line 237
    move-result-object v20

    .line 238
    check-cast v20, Landroid/widget/TextView;

    .line 239
    .line 240
    if-eqz v20, :cond_1

    .line 241
    .line 242
    const v2, 0x7f0a1013

    .line 243
    .line 244
    .line 245
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v21

    .line 249
    check-cast v21, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 250
    .line 251
    if-eqz v21, :cond_1

    .line 252
    .line 253
    const v2, 0x7f0a1016

    .line 254
    .line 255
    .line 256
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v22

    .line 260
    check-cast v22, Landroid/widget/TextView;

    .line 261
    .line 262
    if-eqz v22, :cond_1

    .line 263
    .line 264
    const v2, 0x7f0a101b

    .line 265
    .line 266
    .line 267
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v23

    .line 271
    check-cast v23, Landroid/widget/TextView;

    .line 272
    .line 273
    if-eqz v23, :cond_1

    .line 274
    .line 275
    new-instance v0, La/dbo;

    .line 276
    .line 277
    move-object v2, v4

    .line 278
    move-object v3, v5

    .line 279
    move-object v4, v6

    .line 280
    move-object v5, v7

    .line 281
    move-object v6, v8

    .line 282
    move-object v7, v9

    .line 283
    move-object v8, v10

    .line 284
    move-object v9, v11

    .line 285
    move-object v10, v12

    .line 286
    move-object v11, v13

    .line 287
    move-object v12, v14

    .line 288
    move-object v13, v15

    .line 289
    move-object/from16 v14, v16

    .line 290
    .line 291
    move-object/from16 v15, v17

    .line 292
    .line 293
    move-object/from16 v16, v18

    .line 294
    .line 295
    move-object/from16 v17, v19

    .line 296
    .line 297
    move-object/from16 v18, v20

    .line 298
    .line 299
    move-object/from16 v19, v21

    .line 300
    .line 301
    move-object/from16 v20, v22

    .line 302
    .line 303
    move-object/from16 v21, v23

    .line 304
    .line 305
    invoke-direct/range {v0 .. v21}, La/dbo;-><init>(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 306
    .line 307
    .line 308
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 309
    .line 310
    sget-object v0, La/wez;->b:La/wez;

    .line 311
    .line 312
    new-instance v2, La/ryl;

    .line 313
    .line 314
    const/16 v3, 0x10

    .line 315
    .line 316
    move-object/from16 v4, p1

    .line 317
    .line 318
    invoke-direct {v2, v4, v3}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 319
    .line 320
    .line 321
    invoke-static {v0, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->r:La/a8z;

    .line 326
    .line 327
    return-void

    .line 328
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    const-string v1, "Missing required view with ID: "

    .line 337
    .line 338
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    throw v3
.end method

.method private final getRotateAnimation()Landroid/view/animation/Animation;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->r:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/animation/Animation;

    .line 8
    .line 9
    return-object p0
.end method

.method public static v(Landroid/widget/TextView;La/f5h0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p1, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    const p1, 0x7f140471

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const p1, 0x7f140460

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const p1, 0x7f14046f

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    const p1, 0x7f140463

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {p1, p0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/CharSequence;La/f5h0;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 5
    .line 6
    iget-object v0, p0, La/dbo;->t:Landroid/widget/TextView;

    .line 7
    .line 8
    iget-object p0, p0, La/dbo;->t:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

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
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->v(Landroid/widget/TextView;La/f5h0;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final getBinding()La/dbo;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 5
    .line 6
    iget-object v0, p0, La/dbo;->o:Landroid/widget/ImageView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/dbo;->c:Landroid/widget/ImageView;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setBotFirstLogo(I)V
    .locals 1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setBotFirstLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setBotFirstLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v0, p0, La/dbo;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/dbo;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setBotFirstLogo(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    iget-object p0, p0, La/dbo;->b:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-static {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public final setBotGameIndicator(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v1, v0, La/dbo;->c:Landroid/widget/ImageView;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 v2, 0x8

    .line 10
    .line 11
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, La/dbo;->c:Landroid/widget/ImageView;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->getRotateAnimation()Landroid/view/animation/Animation;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final setBotScore(I)V
    .locals 1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setBotScore(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setBotScore(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v1, v0, La/dbo;->f:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/16 v2, 0x8

    .line 17
    .line 18
    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, La/dbo;->f:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->w()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final setBotSecondLogo(I)V
    .locals 1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setBotSecondLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setBotSecondLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v0, p0, La/dbo;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/dbo;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setBotSecondLogo(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    iget-object p0, p0, La/dbo;->g:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-static {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public final setBotTeamName(I)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setBotTeamName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setBotTeamName(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v0, p0, La/dbo;->i:Landroid/widget/TextView;

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
    iget-object p0, p0, La/dbo;->i:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final setGameStartTime(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object p0, p0, La/dbo;->k:Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->setGameStartTime(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setGameText(I)V
    .locals 1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setGameText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setGameText(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v1, v0, La/dbo;->j:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/16 v2, 0x8

    .line 17
    .line 18
    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, La/dbo;->j:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->u()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final setInfoText(I)V
    .locals 1

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setInfoText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setInfoText(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v0, p0, La/dbo;->k:Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;

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
    iget-object p0, p0, La/dbo;->k:Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->setSubTitle(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final setResultText(I)V
    .locals 1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setResultText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setResultText(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v1, v0, La/dbo;->l:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/16 v2, 0x8

    .line 17
    .line 18
    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, La/dbo;->l:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->u()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final setSetText(I)V
    .locals 1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setSetText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setSetText(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v1, v0, La/dbo;->m:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/16 v2, 0x8

    .line 17
    .line 18
    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, La/dbo;->m:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->u()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final setTimerVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object p0, p0, La/dbo;->k:Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;->setTimerVisible(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setTopFirstLogo(I)V
    .locals 1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setTopFirstLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setTopFirstLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v0, p0, La/dbo;->n:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/dbo;->n:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setTopFirstLogo(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    iget-object p0, p0, La/dbo;->n:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-static {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public final setTopGameIndicator(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v1, v0, La/dbo;->o:Landroid/widget/ImageView;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/16 v2, 0x8

    .line 10
    .line 11
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, La/dbo;->o:Landroid/widget/ImageView;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->getRotateAnimation()Landroid/view/animation/Animation;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final setTopScore(I)V
    .locals 1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setTopScore(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTopScore(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v1, v0, La/dbo;->r:Landroid/widget/TextView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/16 v2, 0x8

    .line 17
    .line 18
    :goto_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, La/dbo;->r:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->w()V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final setTopSecondLogo(I)V
    .locals 1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setTopSecondLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setTopSecondLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v0, p0, La/dbo;->s:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/dbo;->s:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setTopSecondLogo(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    iget-object p0, p0, La/dbo;->s:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    const/4 v0, 0x0

    const/16 v1, 0xe

    invoke-static {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public final setTopTeamName(I)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->setTopTeamName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTopTeamName(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v0, p0, La/dbo;->u:Landroid/widget/TextView;

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
    iget-object p0, p0, La/dbo;->u:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final u()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object v0, v0, La/dbo;->k:Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v1, La/a3e;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const v2, 0x7f07072d

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-virtual {v1, p0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string p0, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    .line 32
    .line 33
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final w()V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 2
    .line 3
    iget-object p0, p0, La/dbo;->k:Lorg/xplatform/uikit/components/timer/DsTimerWithDescription;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast v0, La/a3e;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string p0, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    .line 22
    .line 23
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final x(Ljava/lang/CharSequence;La/f5h0;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 5
    .line 6
    iget-object v0, p0, La/dbo;->d:Landroid/widget/TextView;

    .line 7
    .line 8
    iget-object p0, p0, La/dbo;->d:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

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
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->v(Landroid/widget/TextView;La/f5h0;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final y(Ljava/lang/CharSequence;La/f5h0;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 5
    .line 6
    iget-object v0, p0, La/dbo;->h:Landroid/widget/TextView;

    .line 7
    .line 8
    iget-object p0, p0, La/dbo;->h:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

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
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->v(Landroid/widget/TextView;La/f5h0;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final z(Ljava/lang/CharSequence;La/f5h0;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->q:La/dbo;

    .line 5
    .line 6
    iget-object v0, p0, La/dbo;->p:Landroid/widget/TextView;

    .line 7
    .line 8
    iget-object p0, p0, La/dbo;->p:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

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
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p2}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleCricket;->v(Landroid/widget/TextView;La/f5h0;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
