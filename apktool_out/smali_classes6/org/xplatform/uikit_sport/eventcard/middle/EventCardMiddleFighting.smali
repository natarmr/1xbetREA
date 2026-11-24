.class public final Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements La/cbo;


# static fields
.field public static final synthetic w:I


# instance fields
.field public final q:La/hbo;

.field public final r:La/n0o0;

.field public final s:La/n0o0;

.field public final t:La/n0o0;

.field public final u:La/n0o0;

.field public final v:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 425
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 424
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 27

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
    const v4, 0x7f040355

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
    const v4, 0x7f0d01ab

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v4, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    const v2, 0x7f0a0129

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Landroidx/constraintlayout/widget/Barrier;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    const v2, 0x7f0a0180

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a0181

    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a0184

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a0188

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 85
    .line 86
    if-eqz v7, :cond_1

    .line 87
    .line 88
    const v2, 0x7f0a0189

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a018c

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a0192

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a0193

    .line 122
    .line 123
    .line 124
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a054b

    .line 133
    .line 134
    .line 135
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a0571

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    check-cast v13, Landroid/widget/TextView;

    .line 151
    .line 152
    if-eqz v13, :cond_1

    .line 153
    .line 154
    const v2, 0x7f0a060c

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
    const v2, 0x7f0a097d

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
    const v2, 0x7f0a0c29

    .line 177
    .line 178
    .line 179
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a0d05

    .line 188
    .line 189
    .line 190
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a0f98

    .line 199
    .line 200
    .line 201
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a1002

    .line 210
    .line 211
    .line 212
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a1003

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a1006

    .line 232
    .line 233
    .line 234
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a100c

    .line 243
    .line 244
    .line 245
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v22

    .line 249
    check-cast v22, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 250
    .line 251
    if-eqz v22, :cond_1

    .line 252
    .line 253
    const v2, 0x7f0a100f

    .line 254
    .line 255
    .line 256
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

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
    const v2, 0x7f0a1012

    .line 265
    .line 266
    .line 267
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v24

    .line 271
    check-cast v24, Landroid/widget/TextView;

    .line 272
    .line 273
    if-eqz v24, :cond_1

    .line 274
    .line 275
    const v2, 0x7f0a101b

    .line 276
    .line 277
    .line 278
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 279
    .line 280
    .line 281
    move-result-object v25

    .line 282
    check-cast v25, Landroid/widget/TextView;

    .line 283
    .line 284
    if-eqz v25, :cond_1

    .line 285
    .line 286
    const v2, 0x7f0a101c

    .line 287
    .line 288
    .line 289
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 290
    .line 291
    .line 292
    move-result-object v26

    .line 293
    check-cast v26, Landroid/widget/TextView;

    .line 294
    .line 295
    if-eqz v26, :cond_1

    .line 296
    .line 297
    new-instance v0, La/hbo;

    .line 298
    .line 299
    move-object v2, v4

    .line 300
    move-object v3, v5

    .line 301
    move-object v4, v6

    .line 302
    move-object v5, v7

    .line 303
    move-object v6, v8

    .line 304
    move-object v7, v9

    .line 305
    move-object v8, v10

    .line 306
    move-object v9, v11

    .line 307
    move-object v10, v12

    .line 308
    move-object v11, v13

    .line 309
    move-object v12, v14

    .line 310
    move-object v13, v15

    .line 311
    move-object/from16 v14, v16

    .line 312
    .line 313
    move-object/from16 v15, v17

    .line 314
    .line 315
    move-object/from16 v16, v18

    .line 316
    .line 317
    move-object/from16 v17, v19

    .line 318
    .line 319
    move-object/from16 v18, v20

    .line 320
    .line 321
    move-object/from16 v19, v21

    .line 322
    .line 323
    move-object/from16 v20, v22

    .line 324
    .line 325
    move-object/from16 v21, v23

    .line 326
    .line 327
    move-object/from16 v22, v24

    .line 328
    .line 329
    move-object/from16 v23, v25

    .line 330
    .line 331
    move-object/from16 v24, v26

    .line 332
    .line 333
    invoke-direct/range {v0 .. v24}, La/hbo;-><init>(Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 334
    .line 335
    .line 336
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->q:La/hbo;

    .line 337
    .line 338
    new-instance v0, La/ryl;

    .line 339
    .line 340
    const/16 v2, 0x11

    .line 341
    .line 342
    move-object/from16 v3, p1

    .line 343
    .line 344
    invoke-direct {v0, v3, v2}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 345
    .line 346
    .line 347
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->r:La/n0o0;

    .line 352
    .line 353
    new-instance v0, La/ryl;

    .line 354
    .line 355
    const/16 v2, 0x12

    .line 356
    .line 357
    invoke-direct {v0, v3, v2}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 358
    .line 359
    .line 360
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->s:La/n0o0;

    .line 365
    .line 366
    new-instance v0, La/ryl;

    .line 367
    .line 368
    const/16 v2, 0x13

    .line 369
    .line 370
    invoke-direct {v0, v3, v2}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 371
    .line 372
    .line 373
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->t:La/n0o0;

    .line 378
    .line 379
    new-instance v0, La/ryl;

    .line 380
    .line 381
    const/16 v2, 0x14

    .line 382
    .line 383
    invoke-direct {v0, v3, v2}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 384
    .line 385
    .line 386
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->u:La/n0o0;

    .line 391
    .line 392
    new-instance v0, La/ryl;

    .line 393
    .line 394
    const/16 v2, 0x15

    .line 395
    .line 396
    invoke-direct {v0, v3, v2}, La/ryl;-><init>(Landroid/content/Context;B)V

    .line 397
    .line 398
    .line 399
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    iput-object v0, v1, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->v:La/n0o0;

    .line 404
    .line 405
    return-void

    .line 406
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    const-string v1, "Missing required view with ID: "

    .line 415
    .line 416
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    throw v3
.end method

.method private final getBDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->r:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getFDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->s:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getFightResultViews()Lkotlin/sequences/Sequence;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/sequences/Sequence<",
            "La/gbo;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, La/gbo;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->q:La/hbo;

    .line 4
    .line 5
    iget-object v1, p0, La/hbo;->k:Landroid/widget/TextView;

    .line 6
    .line 7
    iget-object v2, p0, La/hbo;->r:Landroid/widget/TextView;

    .line 8
    .line 9
    iget-object v3, p0, La/hbo;->c:Landroid/widget/TextView;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, v3}, La/gbo;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, La/gbo;

    .line 15
    .line 16
    iget-object v2, p0, La/hbo;->o:Landroid/widget/TextView;

    .line 17
    .line 18
    iget-object v3, p0, La/hbo;->v:Landroid/widget/TextView;

    .line 19
    .line 20
    iget-object v4, p0, La/hbo;->g:Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-direct {v1, v2, v3, v4}, La/gbo;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 23
    .line 24
    .line 25
    new-instance v2, La/gbo;

    .line 26
    .line 27
    iget-object v3, p0, La/hbo;->p:Landroid/widget/TextView;

    .line 28
    .line 29
    iget-object v4, p0, La/hbo;->x:Landroid/widget/TextView;

    .line 30
    .line 31
    iget-object v5, p0, La/hbo;->i:Landroid/widget/TextView;

    .line 32
    .line 33
    invoke-direct {v2, v3, v4, v5}, La/gbo;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, La/gbo;

    .line 37
    .line 38
    iget-object v4, p0, La/hbo;->l:Landroid/widget/TextView;

    .line 39
    .line 40
    iget-object v5, p0, La/hbo;->s:Landroid/widget/TextView;

    .line 41
    .line 42
    iget-object v6, p0, La/hbo;->d:Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-direct {v3, v4, v5, v6}, La/gbo;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 45
    .line 46
    .line 47
    new-instance v4, La/gbo;

    .line 48
    .line 49
    iget-object v5, p0, La/hbo;->j:Landroid/widget/TextView;

    .line 50
    .line 51
    iget-object v6, p0, La/hbo;->q:Landroid/widget/TextView;

    .line 52
    .line 53
    iget-object p0, p0, La/hbo;->b:Landroid/widget/TextView;

    .line 54
    .line 55
    invoke-direct {v4, v5, v6, p0}, La/gbo;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 56
    .line 57
    .line 58
    filled-new-array {v0, v1, v2, v3, v4}, [La/gbo;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, La/tx3;->t([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

.method private final getFsDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->t:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getKoDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->u:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getRDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->v:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final setBotLogo(I)V
    .locals 1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->setBotLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setBotLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->q:La/hbo;

    .line 2
    .line 3
    iget-object v0, p0, La/hbo;->e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

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
    iget-object p0, p0, La/hbo;->e:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setBotResultGameScore(La/isp;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->q:La/hbo;

    .line 5
    .line 6
    iget-object v0, v0, La/hbo;->f:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->u(La/isp;)Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {v0, p0}, La/wvb;->a0(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setBotTeamName(I)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->setBotTeamName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setBotTeamName(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->q:La/hbo;

    .line 2
    .line 3
    iget-object v0, p0, La/hbo;->h:Landroid/widget/TextView;

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
    iget-object p0, p0, La/hbo;->h:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final setInfoText(I)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->setInfoText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setInfoText(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->q:La/hbo;

    .line 2
    .line 3
    iget-object v0, p0, La/hbo;->m:Landroid/widget/TextView;

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
    iget-object p0, p0, La/hbo;->m:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final setResultGameTitle(I)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->setResultGameTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setResultGameTitle(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->q:La/hbo;

    .line 2
    .line 3
    iget-object v0, p0, La/hbo;->n:Landroid/widget/TextView;

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
    iget-object p0, p0, La/hbo;->n:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final setResults(Ljava/util/List;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/wsp;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct/range {p0 .. p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->getFightResultViews()Lkotlin/sequences/Sequence;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    move v2, v1

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_8

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    add-int/lit8 v4, v2, 0x1

    .line 25
    .line 26
    if-ltz v2, :cond_7

    .line 27
    .line 28
    check-cast v3, La/gbo;

    .line 29
    .line 30
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    const/16 v6, 0x8

    .line 35
    .line 36
    if-ge v2, v5, :cond_2

    .line 37
    .line 38
    move-object/from16 v5, p1

    .line 39
    .line 40
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    check-cast v7, La/wsp;

    .line 45
    .line 46
    new-instance v8, La/hin;

    .line 47
    .line 48
    const/4 v14, 0x0

    .line 49
    const/16 v15, 0xd

    .line 50
    .line 51
    const/4 v9, 0x1

    .line 52
    const-class v11, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;

    .line 53
    .line 54
    const-string v12, "getTintedDrawable"

    .line 55
    .line 56
    const-string v13, "getTintedDrawable(Lorg/xplatform/uikit/core/eventcard/middle/FightCellDrawable;)Landroid/graphics/drawable/Drawable;"

    .line 57
    .line 58
    move-object/from16 v10, p0

    .line 59
    .line 60
    invoke-direct/range {v8 .. v15}, La/hin;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v9, v3, La/gbo;->a:Landroid/widget/TextView;

    .line 70
    .line 71
    iget-object v10, v7, La/wsp;->a:Ljava/lang/CharSequence;

    .line 72
    .line 73
    if-eqz v10, :cond_1

    .line 74
    .line 75
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    if-nez v11, :cond_0

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_0
    move v11, v1

    .line 83
    goto :goto_2

    .line 84
    :cond_1
    :goto_1
    move v11, v6

    .line 85
    :goto_2
    invoke-virtual {v9, v11}, Landroid/view/View;->setVisibility(I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    iget-object v9, v3, La/gbo;->b:Landroid/widget/TextView;

    .line 92
    .line 93
    iget-object v10, v7, La/wsp;->b:La/hsp;

    .line 94
    .line 95
    invoke-static {v9, v10, v8}, La/gbo;->a(Landroid/widget/TextView;La/hsp;La/hin;)V

    .line 96
    .line 97
    .line 98
    iget-object v9, v3, La/gbo;->c:Landroid/widget/TextView;

    .line 99
    .line 100
    iget-object v7, v7, La/wsp;->c:La/hsp;

    .line 101
    .line 102
    invoke-static {v9, v7, v8}, La/gbo;->a(Landroid/widget/TextView;La/hsp;La/hin;)V

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_2
    move-object/from16 v5, p1

    .line 107
    .line 108
    :goto_3
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-ge v2, v7, :cond_3

    .line 113
    .line 114
    const/4 v2, 0x1

    .line 115
    goto :goto_4

    .line 116
    :cond_3
    move v2, v1

    .line 117
    :goto_4
    iget-object v7, v3, La/gbo;->a:Landroid/widget/TextView;

    .line 118
    .line 119
    if-eqz v2, :cond_4

    .line 120
    .line 121
    move v8, v1

    .line 122
    goto :goto_5

    .line 123
    :cond_4
    move v8, v6

    .line 124
    :goto_5
    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    iget-object v7, v3, La/gbo;->b:Landroid/widget/TextView;

    .line 128
    .line 129
    if-eqz v2, :cond_5

    .line 130
    .line 131
    move v8, v1

    .line 132
    goto :goto_6

    .line 133
    :cond_5
    move v8, v6

    .line 134
    :goto_6
    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    iget-object v3, v3, La/gbo;->c:Landroid/widget/TextView;

    .line 138
    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    move v6, v1

    .line 142
    :cond_6
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 143
    .line 144
    .line 145
    move v2, v4

    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 149
    .line 150
    .line 151
    const/4 v0, 0x0

    .line 152
    throw v0

    .line 153
    :cond_8
    return-void
.end method

.method public final setTopLogo(I)V
    .locals 1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 21
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->setTopLogo(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final setTopLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->q:La/hbo;

    .line 2
    .line 3
    iget-object v0, p0, La/hbo;->t:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

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
    iget-object p0, p0, La/hbo;->t:Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setTopResultGameScore(La/isp;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->q:La/hbo;

    .line 5
    .line 6
    iget-object v0, v0, La/hbo;->u:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->u(La/isp;)Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {v0, p0}, La/wvb;->a0(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setTopTeamName(I)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->setTopTeamName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTopTeamName(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->q:La/hbo;

    .line 2
    .line 3
    iget-object v0, p0, La/hbo;->w:Landroid/widget/TextView;

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
    iget-object p0, p0, La/hbo;->w:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final u(La/isp;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p1, v0, :cond_3

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p1, v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->getRDrawable()Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->getKoDrawable()Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_2
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->getFsDrawable()Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_3
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->getFDrawable()Landroid/graphics/drawable/Drawable;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_4
    invoke-direct {p0}, Lorg/xplatform/uikit_sport/eventcard/middle/EventCardMiddleFighting;->getBDrawable()Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method
