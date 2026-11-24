.class public final La/y6l;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:Landroid/widget/ImageView;

.field public final o:Ljava/util/ArrayList;

.field public final p:Landroid/widget/ImageView;

.field public final q:Ljava/util/ArrayList;

.field public final r:Landroid/view/View;

.field public final s:Landroid/view/View;

.field public final t:Ljava/util/ArrayList;

.field public final u:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x7f05000f

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput-boolean v0, p0, La/y6l;->a:Z

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const v2, 0x7f070717

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iput v1, p0, La/y6l;->b:I

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const v2, 0x7f07072d

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iput v1, p0, La/y6l;->c:I

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const v3, 0x7f0706f8

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iput v2, p0, La/y6l;->d:I

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const v3, 0x7f07070c

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iput v2, p0, La/y6l;->e:I

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const v3, 0x7f07067a

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    iput v2, p0, La/y6l;->f:I

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const v3, 0x7f07069b

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    iput v2, p0, La/y6l;->g:I

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    const v3, 0x7f0706b0

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    iput v2, p0, La/y6l;->h:I

    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    const v3, 0x7f0706c1

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    iput v2, p0, La/y6l;->i:I

    .line 121
    .line 122
    invoke-direct {p0}, La/y6l;->getHeroViewWidth()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    iput v2, p0, La/y6l;->j:I

    .line 127
    .line 128
    invoke-direct {p0}, La/y6l;->getHeroViewHeight()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    iput v3, p0, La/y6l;->k:I

    .line 133
    .line 134
    mul-int/lit8 v2, v2, 0x5

    .line 135
    .line 136
    iput v2, p0, La/y6l;->l:I

    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    const v3, 0x7f070199

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    iput v2, p0, La/y6l;->m:I

    .line 150
    .line 151
    invoke-virtual {p0}, La/y6l;->b()Ljava/util/ArrayList;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    iput-object v3, p0, La/y6l;->o:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {p0}, La/y6l;->b()Ljava/util/ArrayList;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    iput-object v4, p0, La/y6l;->q:Ljava/util/ArrayList;

    .line 162
    .line 163
    new-instance v4, Landroid/view/View;

    .line 164
    .line 165
    invoke-direct {v4, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 166
    .line 167
    .line 168
    iput-object v4, p0, La/y6l;->r:Landroid/view/View;

    .line 169
    .line 170
    new-instance v5, Landroid/view/View;

    .line 171
    .line 172
    invoke-direct {v5, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 173
    .line 174
    .line 175
    iput-object v5, p0, La/y6l;->s:Landroid/view/View;

    .line 176
    .line 177
    new-instance p1, Ljava/util/ArrayList;

    .line 178
    .line 179
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 180
    .line 181
    .line 182
    iput-object p1, p0, La/y6l;->t:Ljava/util/ArrayList;

    .line 183
    .line 184
    new-instance p1, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 187
    .line 188
    .line 189
    iput-object p1, p0, La/y6l;->u:Ljava/util/ArrayList;

    .line 190
    .line 191
    if-eqz v0, :cond_0

    .line 192
    .line 193
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 197
    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_0
    const p1, 0x7f0804b0

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 204
    .line 205
    .line 206
    :goto_0
    new-instance p1, Landroid/widget/ImageView;

    .line 207
    .line 208
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-direct {p1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 213
    .line 214
    .line 215
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 216
    .line 217
    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 227
    .line 228
    .line 229
    iput-object p1, p0, La/y6l;->n:Landroid/widget/ImageView;

    .line 230
    .line 231
    const-string v0, "firstTeamLogoView"

    .line 232
    .line 233
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_1

    .line 248
    .line 249
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, La/w6l;

    .line 254
    .line 255
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 256
    .line 257
    .line 258
    goto :goto_1

    .line 259
    :cond_1
    new-instance p1, Landroid/widget/ImageView;

    .line 260
    .line 261
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-direct {p1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 266
    .line 267
    .line 268
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 269
    .line 270
    iget v1, p0, La/y6l;->m:I

    .line 271
    .line 272
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 273
    .line 274
    .line 275
    iget v1, p0, La/y6l;->c:I

    .line 276
    .line 277
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 284
    .line 285
    .line 286
    iput-object p1, p0, La/y6l;->p:Landroid/widget/ImageView;

    .line 287
    .line 288
    const-string v0, "secondTeamLogoView"

    .line 289
    .line 290
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 294
    .line 295
    .line 296
    iget-object p1, p0, La/y6l;->q:Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-eqz v0, :cond_2

    .line 307
    .line 308
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    check-cast v0, La/w6l;

    .line 313
    .line 314
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 315
    .line 316
    .line 317
    goto :goto_2

    .line 318
    :cond_2
    return-void
.end method

.method public static a(La/y4l;Landroid/widget/ImageView;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 8
    .line 9
    iget-object v3, v0, La/y4l;->b:Ljava/lang/String;

    .line 10
    .line 11
    const v4, 0x7f080cf7

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x3

    .line 15
    move-object/from16 v6, p1

    .line 16
    .line 17
    invoke-static {v6, v3, v4, v5}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    iget-object v0, v0, La/y4l;->c:Ljava/util/ArrayList;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x5

    .line 29
    if-ge v3, v6, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_8

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    add-int/lit8 v6, v5, 0x1

    .line 46
    .line 47
    if-ltz v5, :cond_1

    .line 48
    .line 49
    check-cast v3, La/u6l;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, La/w6l;

    .line 59
    .line 60
    iget-object v7, v3, La/u6l;->b:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v5, v7}, La/w6l;->setHeroImage(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-boolean v7, v3, La/u6l;->d:Z

    .line 66
    .line 67
    iget-wide v8, v3, La/u6l;->f:J

    .line 68
    .line 69
    invoke-virtual {v5, v7, v8, v9}, La/w6l;->b(ZJ)V

    .line 70
    .line 71
    .line 72
    iget-boolean v7, v3, La/u6l;->c:Z

    .line 73
    .line 74
    if-eqz v7, :cond_0

    .line 75
    .line 76
    iget-wide v7, v3, La/u6l;->e:J

    .line 77
    .line 78
    invoke-virtual {v5, v7, v8}, La/w6l;->setHeroAegisState(J)V

    .line 79
    .line 80
    .line 81
    :cond_0
    move v5, v6

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 84
    .line 85
    .line 86
    throw v4

    .line 87
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eqz v3, :cond_8

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    add-int/lit8 v6, v5, 0x1

    .line 102
    .line 103
    if-ltz v5, :cond_7

    .line 104
    .line 105
    check-cast v3, La/u6l;

    .line 106
    .line 107
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    check-cast v7, La/u6l;

    .line 112
    .line 113
    iget-object v8, v3, La/u6l;->b:Ljava/lang/String;

    .line 114
    .line 115
    iget-wide v9, v3, La/u6l;->e:J

    .line 116
    .line 117
    iget-wide v11, v3, La/u6l;->f:J

    .line 118
    .line 119
    iget-boolean v13, v3, La/u6l;->c:Z

    .line 120
    .line 121
    iget-boolean v14, v3, La/u6l;->d:Z

    .line 122
    .line 123
    iget-object v15, v7, La/u6l;->b:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v8, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-eqz v8, :cond_4

    .line 130
    .line 131
    iget-boolean v8, v7, La/u6l;->d:Z

    .line 132
    .line 133
    if-ne v14, v8, :cond_4

    .line 134
    .line 135
    iget-boolean v8, v7, La/u6l;->c:Z

    .line 136
    .line 137
    if-ne v13, v8, :cond_4

    .line 138
    .line 139
    move-object/from16 p0, v4

    .line 140
    .line 141
    move/from16 p1, v5

    .line 142
    .line 143
    iget-wide v4, v7, La/u6l;->f:J

    .line 144
    .line 145
    cmp-long v4, v11, v4

    .line 146
    .line 147
    if-nez v4, :cond_3

    .line 148
    .line 149
    iget-wide v4, v7, La/u6l;->e:J

    .line 150
    .line 151
    cmp-long v4, v9, v4

    .line 152
    .line 153
    if-eqz v4, :cond_6

    .line 154
    .line 155
    :cond_3
    move/from16 v5, p1

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_4
    move-object/from16 p0, v4

    .line 159
    .line 160
    :goto_2
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    check-cast v4, La/w6l;

    .line 165
    .line 166
    iget-object v7, v3, La/u6l;->b:Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v4, v7}, La/w6l;->setHeroImage(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4, v14, v11, v12}, La/w6l;->b(ZJ)V

    .line 172
    .line 173
    .line 174
    if-eqz v13, :cond_5

    .line 175
    .line 176
    invoke-virtual {v4, v9, v10}, La/w6l;->setHeroAegisState(J)V

    .line 177
    .line 178
    .line 179
    :cond_5
    invoke-virtual {v2, v5, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    :cond_6
    move-object/from16 v4, p0

    .line 183
    .line 184
    move v5, v6

    .line 185
    goto :goto_1

    .line 186
    :cond_7
    move-object/from16 p0, v4

    .line 187
    .line 188
    invoke-static {}, La/q3d;->p()V

    .line 189
    .line 190
    .line 191
    throw p0

    .line 192
    :cond_8
    return-void
.end method

.method public static c(Landroid/view/View;La/y6l;IIII)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sub-int/2addr v0, p4

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    sub-int/2addr p1, p2

    .line 21
    invoke-virtual {p0, v0, p3, p1, p5}, Landroid/view/View;->layout(IIII)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final getHeightView()I
    .locals 3

    .line 1
    iget v0, p0, La/y6l;->c:I

    .line 2
    .line 3
    iget-boolean v1, p0, La/y6l;->a:Z

    .line 4
    .line 5
    iget v2, p0, La/y6l;->k:I

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    add-int/2addr v0, v2

    .line 12
    return v0

    .line 13
    :cond_0
    mul-int/lit8 v2, v2, 0x2

    .line 14
    .line 15
    mul-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    add-int/2addr v0, v2

    .line 18
    iget p0, p0, La/y6l;->b:I

    .line 19
    .line 20
    mul-int/lit8 p0, p0, 0x2

    .line 21
    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method private final getHeroViewHeight()I
    .locals 1

    .line 1
    iget-boolean v0, p0, La/y6l;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, La/y6l;->f:I

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget p0, p0, La/y6l;->g:I

    .line 9
    .line 10
    return p0
.end method

.method private final getHeroViewWidth()I
    .locals 1

    .line 1
    iget-boolean v0, p0, La/y6l;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget p0, p0, La/y6l;->h:I

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget p0, p0, La/y6l;->i:I

    .line 9
    .line 10
    return p0
.end method


# virtual methods
.method public final b()Ljava/util/ArrayList;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x5

    .line 3
    invoke-static {v0, v1}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    move-object v2, v0

    .line 23
    check-cast v2, La/kkx;

    .line 24
    .line 25
    iget-boolean v2, v2, La/kkx;->c:Z

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    move-object v2, v0

    .line 30
    check-cast v2, La/bkx;

    .line 31
    .line 32
    invoke-virtual {v2}, La/bkx;->nextInt()I

    .line 33
    .line 34
    .line 35
    new-instance v2, La/w6l;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, v3}, La/w6l;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 48
    .line 49
    iget v4, p0, La/y6l;->j:I

    .line 50
    .line 51
    iget v5, p0, La/y6l;->k:I

    .line 52
    .line 53
    invoke-direct {v3, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 57
    .line 58
    .line 59
    const-string v3, ""

    .line 60
    .line 61
    invoke-virtual {v2, v3}, La/w6l;->setHeroImage(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    return-object v1
.end method

.method public final onLayout(ZIIII)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, v1, La/y6l;->a:Z

    .line 7
    .line 8
    iget-object v7, v1, La/y6l;->q:Ljava/util/ArrayList;

    .line 9
    .line 10
    const/4 v8, 0x0

    .line 11
    iget-object v9, v1, La/y6l;->o:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v10, v1, La/y6l;->p:Landroid/widget/ImageView;

    .line 14
    .line 15
    iget-object v11, v1, La/y6l;->n:Landroid/widget/ImageView;

    .line 16
    .line 17
    iget v12, v1, La/y6l;->d:I

    .line 18
    .line 19
    iget v13, v1, La/y6l;->k:I

    .line 20
    .line 21
    iget v2, v1, La/y6l;->l:I

    .line 22
    .line 23
    iget v14, v1, La/y6l;->m:I

    .line 24
    .line 25
    iget v3, v1, La/y6l;->b:I

    .line 26
    .line 27
    iget v4, v1, La/y6l;->e:I

    .line 28
    .line 29
    iget v15, v1, La/y6l;->j:I

    .line 30
    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    div-int/lit8 v0, v0, 0x2

    .line 38
    .line 39
    sub-int/2addr v0, v4

    .line 40
    sub-int/2addr v0, v3

    .line 41
    sub-int/2addr v0, v14

    .line 42
    sub-int/2addr v0, v2

    .line 43
    div-int/lit8 v16, v0, 0x4

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    div-int/lit8 v0, v0, 0x2

    .line 50
    .line 51
    sub-int/2addr v0, v3

    .line 52
    iget v2, v1, La/y6l;->c:I

    .line 53
    .line 54
    sub-int/2addr v0, v2

    .line 55
    sub-int v17, v0, v14

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    div-int/lit8 v0, v0, 0x2

    .line 62
    .line 63
    add-int/2addr v0, v3

    .line 64
    add-int v18, v0, v2

    .line 65
    .line 66
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    div-int/lit8 v0, v0, 0x2

    .line 71
    .line 72
    sub-int v4, v0, v3

    .line 73
    .line 74
    add-int v5, v13, v12

    .line 75
    .line 76
    iget-object v0, v1, La/y6l;->r:Landroid/view/View;

    .line 77
    .line 78
    move v3, v2

    .line 79
    const/4 v2, 0x0

    .line 80
    move v12, v3

    .line 81
    const/4 v3, 0x0

    .line 82
    invoke-static/range {v0 .. v5}, La/y6l;->c(Landroid/view/View;La/y6l;IIII)V

    .line 83
    .line 84
    .line 85
    const v2, 0x7f0804b0

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    div-int/lit8 v0, v0, 0x2

    .line 96
    .line 97
    add-int/2addr v0, v12

    .line 98
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    move/from16 v19, v2

    .line 103
    .line 104
    move v2, v0

    .line 105
    iget-object v0, v1, La/y6l;->s:Landroid/view/View;

    .line 106
    .line 107
    move/from16 v6, v19

    .line 108
    .line 109
    const/16 p1, 0x0

    .line 110
    .line 111
    invoke-static/range {v0 .. v5}, La/y6l;->c(Landroid/view/View;La/y6l;IIII)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackgroundResource(I)V

    .line 115
    .line 116
    .line 117
    add-int v4, v14, v17

    .line 118
    .line 119
    iget v3, v1, La/y6l;->c:I

    .line 120
    .line 121
    add-int v5, v14, v3

    .line 122
    .line 123
    move-object v0, v11

    .line 124
    move/from16 v2, v17

    .line 125
    .line 126
    invoke-static/range {v0 .. v5}, La/y6l;->c(Landroid/view/View;La/y6l;IIII)V

    .line 127
    .line 128
    .line 129
    move v6, v2

    .line 130
    add-int v4, v14, v18

    .line 131
    .line 132
    move-object/from16 v1, p0

    .line 133
    .line 134
    move-object v0, v10

    .line 135
    move/from16 v2, v18

    .line 136
    .line 137
    invoke-static/range {v0 .. v5}, La/y6l;->c(Landroid/view/View;La/y6l;IIII)V

    .line 138
    .line 139
    .line 140
    move v14, v4

    .line 141
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    move v0, v8

    .line 146
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_2

    .line 151
    .line 152
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    add-int/lit8 v10, v0, 0x1

    .line 157
    .line 158
    if-ltz v0, :cond_1

    .line 159
    .line 160
    check-cast v2, La/w6l;

    .line 161
    .line 162
    iget v3, v1, La/y6l;->c:I

    .line 163
    .line 164
    if-lez v0, :cond_0

    .line 165
    .line 166
    sub-int v17, v6, v3

    .line 167
    .line 168
    sub-int v17, v17, v15

    .line 169
    .line 170
    add-int v4, v15, v16

    .line 171
    .line 172
    mul-int/2addr v4, v0

    .line 173
    sub-int v17, v17, v4

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_0
    sub-int v17, v6, v3

    .line 177
    .line 178
    sub-int v17, v17, v15

    .line 179
    .line 180
    :goto_1
    add-int v4, v17, v15

    .line 181
    .line 182
    add-int v5, v3, v13

    .line 183
    .line 184
    move-object v0, v2

    .line 185
    move/from16 v2, v17

    .line 186
    .line 187
    invoke-static/range {v0 .. v5}, La/y6l;->c(Landroid/view/View;La/y6l;IIII)V

    .line 188
    .line 189
    .line 190
    move-object/from16 v1, p0

    .line 191
    .line 192
    move v0, v10

    .line 193
    goto :goto_0

    .line 194
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 195
    .line 196
    .line 197
    throw p1

    .line 198
    :cond_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_b

    .line 207
    .line 208
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    add-int/lit8 v7, v8, 0x1

    .line 213
    .line 214
    if-ltz v8, :cond_4

    .line 215
    .line 216
    check-cast v0, La/w6l;

    .line 217
    .line 218
    if-lez v8, :cond_3

    .line 219
    .line 220
    add-int v4, v14, v12

    .line 221
    .line 222
    add-int v1, v15, v16

    .line 223
    .line 224
    mul-int/2addr v1, v8

    .line 225
    add-int/2addr v1, v4

    .line 226
    :goto_3
    move v2, v1

    .line 227
    goto :goto_4

    .line 228
    :cond_3
    add-int v1, v14, v12

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :goto_4
    add-int v4, v2, v15

    .line 232
    .line 233
    add-int v5, v12, v13

    .line 234
    .line 235
    move-object/from16 v1, p0

    .line 236
    .line 237
    move v3, v12

    .line 238
    invoke-static/range {v0 .. v5}, La/y6l;->c(Landroid/view/View;La/y6l;IIII)V

    .line 239
    .line 240
    .line 241
    move v8, v7

    .line 242
    goto :goto_2

    .line 243
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 244
    .line 245
    .line 246
    throw p1

    .line 247
    :cond_5
    move-object v6, v10

    .line 248
    move-object v0, v11

    .line 249
    const/16 p1, 0x0

    .line 250
    .line 251
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    sub-int/2addr v5, v4

    .line 256
    sub-int/2addr v5, v14

    .line 257
    sub-int/2addr v5, v2

    .line 258
    div-int/lit8 v10, v5, 0x4

    .line 259
    .line 260
    iget v11, v1, La/y6l;->c:I

    .line 261
    .line 262
    add-int/2addr v3, v11

    .line 263
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    add-int/2addr v2, v3

    .line 268
    move v4, v2

    .line 269
    iget v2, v1, La/y6l;->c:I

    .line 270
    .line 271
    add-int v16, v4, v2

    .line 272
    .line 273
    add-int v4, v2, v14

    .line 274
    .line 275
    add-int v5, v3, v14

    .line 276
    .line 277
    invoke-static/range {v0 .. v5}, La/y6l;->c(Landroid/view/View;La/y6l;IIII)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    iget v2, v1, La/y6l;->c:I

    .line 285
    .line 286
    add-int v4, v0, v2

    .line 287
    .line 288
    add-int v5, v16, v16

    .line 289
    .line 290
    move-object v0, v6

    .line 291
    move/from16 v3, v16

    .line 292
    .line 293
    invoke-static/range {v0 .. v5}, La/y6l;->c(Landroid/view/View;La/y6l;IIII)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    move v0, v8

    .line 301
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-eqz v2, :cond_8

    .line 306
    .line 307
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    add-int/lit8 v9, v0, 0x1

    .line 312
    .line 313
    if-ltz v0, :cond_7

    .line 314
    .line 315
    check-cast v2, La/w6l;

    .line 316
    .line 317
    if-lez v0, :cond_6

    .line 318
    .line 319
    add-int v3, v14, v12

    .line 320
    .line 321
    add-int v4, v15, v10

    .line 322
    .line 323
    mul-int/2addr v4, v0

    .line 324
    add-int/2addr v4, v3

    .line 325
    goto :goto_6

    .line 326
    :cond_6
    add-int v4, v14, v12

    .line 327
    .line 328
    :goto_6
    add-int v0, v4, v15

    .line 329
    .line 330
    iget v3, v1, La/y6l;->c:I

    .line 331
    .line 332
    add-int v5, v3, v13

    .line 333
    .line 334
    move/from16 v20, v4

    .line 335
    .line 336
    move v4, v0

    .line 337
    move-object v0, v2

    .line 338
    move/from16 v2, v20

    .line 339
    .line 340
    invoke-static/range {v0 .. v5}, La/y6l;->c(Landroid/view/View;La/y6l;IIII)V

    .line 341
    .line 342
    .line 343
    move-object/from16 v1, p0

    .line 344
    .line 345
    move v0, v9

    .line 346
    goto :goto_5

    .line 347
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 348
    .line 349
    .line 350
    throw p1

    .line 351
    :cond_8
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    if-eqz v0, :cond_b

    .line 360
    .line 361
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    add-int/lit8 v7, v8, 0x1

    .line 366
    .line 367
    if-ltz v8, :cond_a

    .line 368
    .line 369
    check-cast v0, La/w6l;

    .line 370
    .line 371
    if-lez v8, :cond_9

    .line 372
    .line 373
    add-int v1, v14, v12

    .line 374
    .line 375
    add-int v2, v15, v10

    .line 376
    .line 377
    mul-int/2addr v2, v8

    .line 378
    add-int/2addr v2, v1

    .line 379
    goto :goto_8

    .line 380
    :cond_9
    add-int v2, v14, v12

    .line 381
    .line 382
    :goto_8
    add-int v1, v11, v13

    .line 383
    .line 384
    add-int v3, v1, v11

    .line 385
    .line 386
    add-int v4, v2, v15

    .line 387
    .line 388
    add-int v5, v3, v13

    .line 389
    .line 390
    move-object/from16 v1, p0

    .line 391
    .line 392
    invoke-static/range {v0 .. v5}, La/y6l;->c(Landroid/view/View;La/y6l;IIII)V

    .line 393
    .line 394
    .line 395
    move v8, v7

    .line 396
    goto :goto_7

    .line 397
    :cond_a
    invoke-static {}, La/q3d;->p()V

    .line 398
    .line 399
    .line 400
    throw p1

    .line 401
    :cond_b
    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-direct {p0}, La/y6l;->getHeightView()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    add-int/2addr p2, v0

    .line 17
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setFirstTeam(La/y4l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/y6l;->o:Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object v1, p0, La/y6l;->t:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object p0, p0, La/y6l;->n:Landroid/widget/ImageView;

    .line 9
    .line 10
    invoke-static {p1, p0, v0, v1}, La/y6l;->a(La/y4l;Landroid/widget/ImageView;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setSecondTeam(La/y4l;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/y6l;->q:Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object v1, p0, La/y6l;->u:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object p0, p0, La/y6l;->p:Landroid/widget/ImageView;

    .line 9
    .line 10
    invoke-static {p1, p0, v0, v1}, La/y6l;->a(La/y4l;Landroid/widget/ImageView;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
