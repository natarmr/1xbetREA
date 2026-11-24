.class public final La/ws40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/l4e;

.field public b:La/l4e;

.field public c:La/r3e;

.field public d:La/r3e;

.field public e:I

.field public f:I

.field public final synthetic g:Landroidx/constraintlayout/motion/widget/MotionLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ws40;->g:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 5
    .line 6
    new-instance p1, La/l4e;

    .line 7
    .line 8
    invoke-direct {p1}, La/l4e;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/ws40;->a:La/l4e;

    .line 12
    .line 13
    new-instance p1, La/l4e;

    .line 14
    .line 15
    invoke-direct {p1}, La/l4e;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/ws40;->b:La/l4e;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, La/ws40;->c:La/r3e;

    .line 22
    .line 23
    iput-object p1, p0, La/ws40;->d:La/r3e;

    .line 24
    .line 25
    return-void
.end method

.method public static c(La/l4e;La/l4e;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/l4e;->u0:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v2, p1, La/l4e;->u0:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p0, v1}, La/k4e;->h(La/k4e;Ljava/util/HashMap;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_5

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, La/k4e;

    .line 34
    .line 35
    instance-of v3, v2, La/zu5;

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    new-instance v3, La/zu5;

    .line 40
    .line 41
    invoke-direct {v3}, La/zu5;-><init>()V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    instance-of v3, v2, La/qiv;

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    new-instance v3, La/qiv;

    .line 50
    .line 51
    invoke-direct {v3}, La/qiv;-><init>()V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    instance-of v3, v2, La/hmq;

    .line 56
    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    new-instance v3, La/hmq;

    .line 60
    .line 61
    invoke-direct {v3}, La/hmq;-><init>()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    instance-of v3, v2, La/su90;

    .line 66
    .line 67
    if-eqz v3, :cond_3

    .line 68
    .line 69
    new-instance v3, La/su90;

    .line 70
    .line 71
    invoke-direct {v3}, La/zru0;-><init>()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    instance-of v3, v2, La/jvv;

    .line 76
    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    new-instance v3, La/jvv;

    .line 80
    .line 81
    invoke-direct {v3}, La/jvv;-><init>()V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    new-instance v3, La/k4e;

    .line 86
    .line 87
    invoke-direct {v3}, La/k4e;-><init>()V

    .line 88
    .line 89
    .line 90
    :goto_1
    invoke-virtual {p1, v3}, La/l4e;->W(La/k4e;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_6

    .line 106
    .line 107
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, La/k4e;

    .line 112
    .line 113
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, La/k4e;

    .line 118
    .line 119
    invoke-virtual {v0, p1, v1}, La/k4e;->h(La/k4e;Ljava/util/HashMap;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_6
    return-void
.end method

.method public static d(La/l4e;Landroid/view/View;)La/k4e;
    .locals 4

    .line 1
    iget-object v0, p0, La/k4e;->h0:Ljava/lang/Object;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object p0, p0, La/l4e;->u0:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, La/k4e;

    .line 20
    .line 21
    iget-object v3, v2, La/k4e;->h0:Ljava/lang/Object;

    .line 22
    .line 23
    if-ne v3, p1, :cond_1

    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/ws40;->g:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/util/HashMap;->clear()V

    .line 12
    .line 13
    .line 14
    new-instance v4, Landroid/util/SparseArray;

    .line 15
    .line 16
    invoke-direct {v4}, Landroid/util/SparseArray;-><init>()V

    .line 17
    .line 18
    .line 19
    new-array v5, v2, [I

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    :goto_0
    if-ge v7, v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v8

    .line 28
    new-instance v9, La/ds40;

    .line 29
    .line 30
    invoke-direct {v9, v8}, La/ds40;-><init>(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v8}, Landroid/view/View;->getId()I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    aput v10, v5, v7

    .line 38
    .line 39
    invoke-virtual {v4, v10, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    add-int/lit8 v7, v7, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v7, 0x0

    .line 49
    :goto_1
    if-ge v7, v2, :cond_10

    .line 50
    .line 51
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    check-cast v10, La/ds40;

    .line 60
    .line 61
    if-nez v10, :cond_1

    .line 62
    .line 63
    move/from16 v20, v2

    .line 64
    .line 65
    move-object/from16 v16, v3

    .line 66
    .line 67
    move-object/from16 v19, v4

    .line 68
    .line 69
    move-object/from16 v17, v5

    .line 70
    .line 71
    move/from16 v18, v7

    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    goto/16 :goto_6

    .line 75
    .line 76
    :cond_1
    iget-object v11, v10, La/ds40;->a:Landroid/graphics/Rect;

    .line 77
    .line 78
    iget-object v12, v10, La/ds40;->f:La/pt40;

    .line 79
    .line 80
    iget-object v13, v0, La/ws40;->c:La/r3e;

    .line 81
    .line 82
    const-string v14, ")"

    .line 83
    .line 84
    const-string v15, " ("

    .line 85
    .line 86
    const-string v6, "no widget for  "

    .line 87
    .line 88
    const-string v8, "MotionLayout"

    .line 89
    .line 90
    if-eqz v13, :cond_b

    .line 91
    .line 92
    iget-object v13, v0, La/ws40;->a:La/l4e;

    .line 93
    .line 94
    invoke-static {v13, v9}, La/ws40;->d(La/l4e;Landroid/view/View;)La/k4e;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    if-eqz v13, :cond_a

    .line 99
    .line 100
    invoke-virtual {v1, v13}, Landroidx/constraintlayout/motion/widget/MotionLayout;->E(La/k4e;)Landroid/graphics/Rect;

    .line 101
    .line 102
    .line 103
    move-result-object v13

    .line 104
    move-object/from16 v16, v3

    .line 105
    .line 106
    iget-object v3, v0, La/ws40;->c:La/r3e;

    .line 107
    .line 108
    move-object/from16 v17, v5

    .line 109
    .line 110
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    move/from16 v18, v7

    .line 115
    .line 116
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    move-object/from16 v19, v4

    .line 121
    .line 122
    iget v4, v3, La/r3e;->d:I

    .line 123
    .line 124
    if-eqz v4, :cond_2

    .line 125
    .line 126
    invoke-static {v13, v11, v4, v5, v7}, La/ds40;->f(Landroid/graphics/Rect;Landroid/graphics/Rect;III)V

    .line 127
    .line 128
    .line 129
    :cond_2
    const/4 v5, 0x0

    .line 130
    iput v5, v12, La/pt40;->c:F

    .line 131
    .line 132
    iput v5, v12, La/pt40;->d:F

    .line 133
    .line 134
    invoke-virtual {v10, v12}, La/ds40;->e(La/pt40;)V

    .line 135
    .line 136
    .line 137
    iget v5, v13, Landroid/graphics/Rect;->left:I

    .line 138
    .line 139
    int-to-float v5, v5

    .line 140
    iget v7, v13, Landroid/graphics/Rect;->top:I

    .line 141
    .line 142
    int-to-float v7, v7

    .line 143
    move/from16 v20, v2

    .line 144
    .line 145
    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    int-to-float v2, v2

    .line 150
    move-object/from16 v21, v11

    .line 151
    .line 152
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    .line 153
    .line 154
    .line 155
    move-result v11

    .line 156
    int-to-float v11, v11

    .line 157
    invoke-virtual {v12, v5, v7, v2, v11}, La/pt40;->d(FFFF)V

    .line 158
    .line 159
    .line 160
    iget v2, v10, La/ds40;->c:I

    .line 161
    .line 162
    invoke-virtual {v3, v2}, La/r3e;->h(I)La/m3e;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v12, v2}, La/pt40;->a(La/m3e;)V

    .line 167
    .line 168
    .line 169
    iget-object v5, v2, La/m3e;->d:La/o3e;

    .line 170
    .line 171
    iget v7, v5, La/o3e;->g:F

    .line 172
    .line 173
    iput v7, v10, La/ds40;->l:F

    .line 174
    .line 175
    iget-object v7, v10, La/ds40;->h:La/as40;

    .line 176
    .line 177
    iget v11, v10, La/ds40;->c:I

    .line 178
    .line 179
    invoke-virtual {v7, v13, v3, v4, v11}, La/as40;->c(Landroid/graphics/Rect;La/r3e;II)V

    .line 180
    .line 181
    .line 182
    iget-object v2, v2, La/m3e;->f:La/q3e;

    .line 183
    .line 184
    iget v2, v2, La/q3e;->i:I

    .line 185
    .line 186
    iput v2, v10, La/ds40;->C:I

    .line 187
    .line 188
    iget v2, v5, La/o3e;->j:I

    .line 189
    .line 190
    iput v2, v10, La/ds40;->E:I

    .line 191
    .line 192
    iget v2, v5, La/o3e;->i:F

    .line 193
    .line 194
    iput v2, v10, La/ds40;->F:F

    .line 195
    .line 196
    iget-object v2, v10, La/ds40;->b:Landroid/view/View;

    .line 197
    .line 198
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    iget v3, v5, La/o3e;->l:I

    .line 203
    .line 204
    iget-object v4, v5, La/o3e;->k:Ljava/lang/String;

    .line 205
    .line 206
    iget v5, v5, La/o3e;->m:I

    .line 207
    .line 208
    const/4 v7, -0x2

    .line 209
    if-eq v3, v7, :cond_9

    .line 210
    .line 211
    const/4 v7, -0x1

    .line 212
    if-eq v3, v7, :cond_8

    .line 213
    .line 214
    if-eqz v3, :cond_7

    .line 215
    .line 216
    const/4 v2, 0x1

    .line 217
    if-eq v3, v2, :cond_6

    .line 218
    .line 219
    const/4 v2, 0x2

    .line 220
    if-eq v3, v2, :cond_5

    .line 221
    .line 222
    const/4 v2, 0x4

    .line 223
    if-eq v3, v2, :cond_4

    .line 224
    .line 225
    const/4 v2, 0x5

    .line 226
    if-eq v3, v2, :cond_3

    .line 227
    .line 228
    const/4 v2, 0x0

    .line 229
    :goto_2
    const/4 v4, 0x0

    .line 230
    goto :goto_3

    .line 231
    :cond_3
    new-instance v2, Landroid/view/animation/OvershootInterpolator;

    .line 232
    .line 233
    invoke-direct {v2}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_4
    new-instance v2, Landroid/view/animation/BounceInterpolator;

    .line 238
    .line 239
    invoke-direct {v2}, Landroid/view/animation/BounceInterpolator;-><init>()V

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_5
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    .line 244
    .line 245
    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 246
    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_6
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    .line 250
    .line 251
    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 252
    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_7
    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 256
    .line 257
    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 258
    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_8
    invoke-static {v4}, La/fhn;->f(Ljava/lang/String;)La/fhn;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    new-instance v3, La/cs40;

    .line 266
    .line 267
    const/4 v4, 0x0

    .line 268
    invoke-direct {v3, v2, v4}, La/cs40;-><init>(Ljava/lang/Object;B)V

    .line 269
    .line 270
    .line 271
    move-object v2, v3

    .line 272
    goto :goto_3

    .line 273
    :cond_9
    const/4 v4, 0x0

    .line 274
    invoke-static {v2, v5}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    :goto_3
    iput-object v2, v10, La/ds40;->G:Landroid/view/animation/Interpolator;

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_a
    move/from16 v20, v2

    .line 282
    .line 283
    move-object/from16 v16, v3

    .line 284
    .line 285
    move-object/from16 v19, v4

    .line 286
    .line 287
    move-object/from16 v17, v5

    .line 288
    .line 289
    move/from16 v18, v7

    .line 290
    .line 291
    move-object/from16 v21, v11

    .line 292
    .line 293
    const/4 v4, 0x0

    .line 294
    iget v2, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:I

    .line 295
    .line 296
    if-eqz v2, :cond_c

    .line 297
    .line 298
    new-instance v2, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-static {}, La/ozb;->S()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-static {v9}, La/ozb;->U(Landroid/view/View;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-static {v8, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 339
    .line 340
    .line 341
    goto :goto_4

    .line 342
    :cond_b
    move/from16 v20, v2

    .line 343
    .line 344
    move-object/from16 v16, v3

    .line 345
    .line 346
    move-object/from16 v19, v4

    .line 347
    .line 348
    move-object/from16 v17, v5

    .line 349
    .line 350
    move/from16 v18, v7

    .line 351
    .line 352
    move-object/from16 v21, v11

    .line 353
    .line 354
    const/4 v4, 0x0

    .line 355
    :cond_c
    :goto_4
    iget-object v2, v0, La/ws40;->d:La/r3e;

    .line 356
    .line 357
    if-eqz v2, :cond_f

    .line 358
    .line 359
    iget-object v2, v0, La/ws40;->b:La/l4e;

    .line 360
    .line 361
    invoke-static {v2, v9}, La/ws40;->d(La/l4e;Landroid/view/View;)La/k4e;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    if-eqz v2, :cond_e

    .line 366
    .line 367
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->E(La/k4e;)Landroid/graphics/Rect;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    iget-object v3, v0, La/ws40;->d:La/r3e;

    .line 372
    .line 373
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 378
    .line 379
    .line 380
    move-result v6

    .line 381
    iget-object v7, v10, La/ds40;->g:La/pt40;

    .line 382
    .line 383
    iget v8, v3, La/r3e;->d:I

    .line 384
    .line 385
    if-eqz v8, :cond_d

    .line 386
    .line 387
    move-object/from16 v9, v21

    .line 388
    .line 389
    invoke-static {v2, v9, v8, v5, v6}, La/ds40;->f(Landroid/graphics/Rect;Landroid/graphics/Rect;III)V

    .line 390
    .line 391
    .line 392
    move-object v11, v9

    .line 393
    goto :goto_5

    .line 394
    :cond_d
    move-object v11, v2

    .line 395
    :goto_5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 396
    .line 397
    iput v2, v7, La/pt40;->c:F

    .line 398
    .line 399
    iput v2, v7, La/pt40;->d:F

    .line 400
    .line 401
    invoke-virtual {v10, v7}, La/ds40;->e(La/pt40;)V

    .line 402
    .line 403
    .line 404
    iget v2, v11, Landroid/graphics/Rect;->left:I

    .line 405
    .line 406
    int-to-float v2, v2

    .line 407
    iget v5, v11, Landroid/graphics/Rect;->top:I

    .line 408
    .line 409
    int-to-float v5, v5

    .line 410
    invoke-virtual {v11}, Landroid/graphics/Rect;->width()I

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    int-to-float v6, v6

    .line 415
    invoke-virtual {v11}, Landroid/graphics/Rect;->height()I

    .line 416
    .line 417
    .line 418
    move-result v9

    .line 419
    int-to-float v9, v9

    .line 420
    invoke-virtual {v7, v2, v5, v6, v9}, La/pt40;->d(FFFF)V

    .line 421
    .line 422
    .line 423
    iget v2, v10, La/ds40;->c:I

    .line 424
    .line 425
    invoke-virtual {v3, v2}, La/r3e;->h(I)La/m3e;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-virtual {v7, v2}, La/pt40;->a(La/m3e;)V

    .line 430
    .line 431
    .line 432
    iget-object v2, v10, La/ds40;->i:La/as40;

    .line 433
    .line 434
    iget v5, v10, La/ds40;->c:I

    .line 435
    .line 436
    invoke-virtual {v2, v11, v3, v8, v5}, La/as40;->c(Landroid/graphics/Rect;La/r3e;II)V

    .line 437
    .line 438
    .line 439
    goto :goto_6

    .line 440
    :cond_e
    iget v2, v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->m1:I

    .line 441
    .line 442
    if-eqz v2, :cond_f

    .line 443
    .line 444
    new-instance v2, Ljava/lang/StringBuilder;

    .line 445
    .line 446
    invoke-static {}, La/ozb;->S()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-static {v9}, La/ozb;->U(Landroid/view/View;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    invoke-static {v8, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 485
    .line 486
    .line 487
    :cond_f
    :goto_6
    add-int/lit8 v7, v18, 0x1

    .line 488
    .line 489
    move-object/from16 v3, v16

    .line 490
    .line 491
    move-object/from16 v5, v17

    .line 492
    .line 493
    move-object/from16 v4, v19

    .line 494
    .line 495
    move/from16 v2, v20

    .line 496
    .line 497
    goto/16 :goto_1

    .line 498
    .line 499
    :cond_10
    move-object/from16 v19, v4

    .line 500
    .line 501
    move-object/from16 v17, v5

    .line 502
    .line 503
    const/4 v4, 0x0

    .line 504
    move v0, v2

    .line 505
    move v6, v4

    .line 506
    :goto_7
    if-ge v6, v0, :cond_12

    .line 507
    .line 508
    aget v1, v17, v6

    .line 509
    .line 510
    move-object/from16 v2, v19

    .line 511
    .line 512
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    check-cast v1, La/ds40;

    .line 517
    .line 518
    iget-object v3, v1, La/ds40;->f:La/pt40;

    .line 519
    .line 520
    iget v3, v3, La/pt40;->k:I

    .line 521
    .line 522
    const/4 v7, -0x1

    .line 523
    if-eq v3, v7, :cond_11

    .line 524
    .line 525
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    check-cast v3, La/ds40;

    .line 530
    .line 531
    iget-object v4, v1, La/ds40;->f:La/pt40;

    .line 532
    .line 533
    iget-object v5, v3, La/ds40;->f:La/pt40;

    .line 534
    .line 535
    invoke-virtual {v4, v3, v5}, La/pt40;->f(La/ds40;La/pt40;)V

    .line 536
    .line 537
    .line 538
    iget-object v1, v1, La/ds40;->g:La/pt40;

    .line 539
    .line 540
    iget-object v4, v3, La/ds40;->g:La/pt40;

    .line 541
    .line 542
    invoke-virtual {v1, v3, v4}, La/pt40;->f(La/ds40;La/pt40;)V

    .line 543
    .line 544
    .line 545
    :cond_11
    add-int/lit8 v6, v6, 0x1

    .line 546
    .line 547
    move-object/from16 v19, v2

    .line 548
    .line 549
    goto :goto_7

    .line 550
    :cond_12
    return-void
.end method

.method public final b(II)V
    .locals 5

    .line 1
    iget-object v0, p0, La/ws40;->g:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getOptimizationLevel()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->v:I

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getStartState()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-ne v2, v3, :cond_7

    .line 14
    .line 15
    iget-object v2, p0, La/ws40;->b:La/l4e;

    .line 16
    .line 17
    iget-object v3, p0, La/ws40;->d:La/r3e;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    iget v4, v3, La/r3e;->d:I

    .line 22
    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v4, p2

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    move v4, p1

    .line 29
    :goto_1
    if-eqz v3, :cond_3

    .line 30
    .line 31
    iget v3, v3, La/r3e;->d:I

    .line 32
    .line 33
    if-nez v3, :cond_2

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v3, p1

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    :goto_2
    move v3, p2

    .line 39
    :goto_3
    invoke-virtual {v0, v2, v1, v4, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->s(La/l4e;III)V

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, La/ws40;->c:La/r3e;

    .line 43
    .line 44
    if-eqz v2, :cond_6

    .line 45
    .line 46
    iget-object p0, p0, La/ws40;->a:La/l4e;

    .line 47
    .line 48
    iget v2, v2, La/r3e;->d:I

    .line 49
    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    move v3, p1

    .line 53
    goto :goto_4

    .line 54
    :cond_4
    move v3, p2

    .line 55
    :goto_4
    if-nez v2, :cond_5

    .line 56
    .line 57
    move p1, p2

    .line 58
    :cond_5
    invoke-virtual {v0, p0, v1, v3, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->s(La/l4e;III)V

    .line 59
    .line 60
    .line 61
    :cond_6
    return-void

    .line 62
    :cond_7
    iget-object v2, p0, La/ws40;->c:La/r3e;

    .line 63
    .line 64
    if-eqz v2, :cond_a

    .line 65
    .line 66
    iget-object v3, p0, La/ws40;->a:La/l4e;

    .line 67
    .line 68
    iget v2, v2, La/r3e;->d:I

    .line 69
    .line 70
    if-nez v2, :cond_8

    .line 71
    .line 72
    move v4, p1

    .line 73
    goto :goto_5

    .line 74
    :cond_8
    move v4, p2

    .line 75
    :goto_5
    if-nez v2, :cond_9

    .line 76
    .line 77
    move v2, p2

    .line 78
    goto :goto_6

    .line 79
    :cond_9
    move v2, p1

    .line 80
    :goto_6
    invoke-virtual {v0, v3, v1, v4, v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->s(La/l4e;III)V

    .line 81
    .line 82
    .line 83
    :cond_a
    iget-object v2, p0, La/ws40;->b:La/l4e;

    .line 84
    .line 85
    iget-object p0, p0, La/ws40;->d:La/r3e;

    .line 86
    .line 87
    if-eqz p0, :cond_c

    .line 88
    .line 89
    iget v3, p0, La/r3e;->d:I

    .line 90
    .line 91
    if-nez v3, :cond_b

    .line 92
    .line 93
    goto :goto_7

    .line 94
    :cond_b
    move v3, p2

    .line 95
    goto :goto_8

    .line 96
    :cond_c
    :goto_7
    move v3, p1

    .line 97
    :goto_8
    if-eqz p0, :cond_d

    .line 98
    .line 99
    iget p0, p0, La/r3e;->d:I

    .line 100
    .line 101
    if-nez p0, :cond_e

    .line 102
    .line 103
    :cond_d
    move p1, p2

    .line 104
    :cond_e
    invoke-virtual {v0, v2, v1, v3, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->s(La/l4e;III)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final e(La/r3e;La/r3e;)V
    .locals 6

    .line 1
    iput-object p1, p0, La/ws40;->c:La/r3e;

    .line 2
    .line 3
    iput-object p2, p0, La/ws40;->d:La/r3e;

    .line 4
    .line 5
    new-instance v0, La/l4e;

    .line 6
    .line 7
    invoke-direct {v0}, La/l4e;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/ws40;->a:La/l4e;

    .line 11
    .line 12
    new-instance v0, La/l4e;

    .line 13
    .line 14
    invoke-direct {v0}, La/l4e;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/ws40;->b:La/l4e;

    .line 18
    .line 19
    iget-object v1, p0, La/ws40;->a:La/l4e;

    .line 20
    .line 21
    sget-boolean v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->Y1:Z

    .line 22
    .line 23
    iget-object v2, p0, La/ws40;->g:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 24
    .line 25
    iget-object v3, v2, Landroidx/constraintlayout/widget/ConstraintLayout;->c:La/l4e;

    .line 26
    .line 27
    iget-object v4, v3, La/l4e;->y0:La/r96;

    .line 28
    .line 29
    iput-object v4, v1, La/l4e;->y0:La/r96;

    .line 30
    .line 31
    iget-object v5, v1, La/l4e;->w0:La/h7k;

    .line 32
    .line 33
    iput-object v4, v5, La/h7k;->h:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v4, v3, La/l4e;->y0:La/r96;

    .line 36
    .line 37
    iput-object v4, v0, La/l4e;->y0:La/r96;

    .line 38
    .line 39
    iget-object v0, v0, La/l4e;->w0:La/h7k;

    .line 40
    .line 41
    iput-object v4, v0, La/h7k;->h:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v0, v1, La/l4e;->u0:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, La/ws40;->b:La/l4e;

    .line 49
    .line 50
    iget-object v0, v0, La/l4e;->u0:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, La/ws40;->a:La/l4e;

    .line 56
    .line 57
    invoke-static {v3, v0}, La/ws40;->c(La/l4e;La/l4e;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, La/ws40;->b:La/l4e;

    .line 61
    .line 62
    invoke-static {v3, v0}, La/ws40;->c(La/l4e;La/l4e;)V

    .line 63
    .line 64
    .line 65
    iget v0, v2, Landroidx/constraintlayout/motion/widget/MotionLayout;->h1:F

    .line 66
    .line 67
    float-to-double v0, v0

    .line 68
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    .line 69
    .line 70
    cmpl-double v0, v0, v3

    .line 71
    .line 72
    if-lez v0, :cond_1

    .line 73
    .line 74
    if-eqz p1, :cond_0

    .line 75
    .line 76
    iget-object v0, p0, La/ws40;->a:La/l4e;

    .line 77
    .line 78
    invoke-virtual {p0, v0, p1}, La/ws40;->g(La/l4e;La/r3e;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    iget-object p1, p0, La/ws40;->b:La/l4e;

    .line 82
    .line 83
    invoke-virtual {p0, p1, p2}, La/ws40;->g(La/l4e;La/r3e;)V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    iget-object v0, p0, La/ws40;->b:La/l4e;

    .line 88
    .line 89
    invoke-virtual {p0, v0, p2}, La/ws40;->g(La/l4e;La/r3e;)V

    .line 90
    .line 91
    .line 92
    if-eqz p1, :cond_2

    .line 93
    .line 94
    iget-object p2, p0, La/ws40;->a:La/l4e;

    .line 95
    .line 96
    invoke-virtual {p0, p2, p1}, La/ws40;->g(La/l4e;La/r3e;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_0
    iget-object p1, p0, La/ws40;->a:La/l4e;

    .line 100
    .line 101
    invoke-virtual {v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iput-boolean p2, p1, La/l4e;->z0:Z

    .line 106
    .line 107
    iget-object p1, p0, La/ws40;->a:La/l4e;

    .line 108
    .line 109
    iget-object p2, p1, La/l4e;->v0:La/phf0;

    .line 110
    .line 111
    invoke-virtual {p2, p1}, La/phf0;->z(La/l4e;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, La/ws40;->b:La/l4e;

    .line 115
    .line 116
    invoke-virtual {v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->p()Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    iput-boolean p2, p1, La/l4e;->z0:Z

    .line 121
    .line 122
    iget-object p1, p0, La/ws40;->b:La/l4e;

    .line 123
    .line 124
    iget-object p2, p1, La/l4e;->v0:La/phf0;

    .line 125
    .line 126
    invoke-virtual {p2, p1}, La/phf0;->z(La/l4e;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-eqz p1, :cond_4

    .line 134
    .line 135
    iget p2, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 136
    .line 137
    sget-object v0, La/j4e;->b:La/j4e;

    .line 138
    .line 139
    const/4 v1, -0x2

    .line 140
    if-ne p2, v1, :cond_3

    .line 141
    .line 142
    iget-object p2, p0, La/ws40;->a:La/l4e;

    .line 143
    .line 144
    invoke-virtual {p2, v0}, La/k4e;->P(La/j4e;)V

    .line 145
    .line 146
    .line 147
    iget-object p2, p0, La/ws40;->b:La/l4e;

    .line 148
    .line 149
    invoke-virtual {p2, v0}, La/k4e;->P(La/j4e;)V

    .line 150
    .line 151
    .line 152
    :cond_3
    iget p1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 153
    .line 154
    if-ne p1, v1, :cond_4

    .line 155
    .line 156
    iget-object p1, p0, La/ws40;->a:La/l4e;

    .line 157
    .line 158
    invoke-virtual {p1, v0}, La/k4e;->R(La/j4e;)V

    .line 159
    .line 160
    .line 161
    iget-object p0, p0, La/ws40;->b:La/l4e;

    .line 162
    .line 163
    invoke-virtual {p0, v0}, La/k4e;->R(La/j4e;)V

    .line 164
    .line 165
    .line 166
    :cond_4
    return-void
.end method

.method public final f()V
    .locals 13

    .line 1
    iget-object v0, p0, La/ws40;->g:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 2
    .line 3
    iget v1, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->x:I

    .line 4
    .line 5
    iget v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->y:I

    .line 6
    .line 7
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->I1:I

    .line 16
    .line 17
    iput v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->J1:I

    .line 18
    .line 19
    invoke-virtual {p0, v1, v2}, La/ws40;->b(II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    instance-of v5, v5, Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    const/4 v8, 0x0

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    const/high16 v5, 0x40000000    # 2.0f

    .line 33
    .line 34
    if-ne v3, v5, :cond_0

    .line 35
    .line 36
    if-ne v4, v5, :cond_0

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_0
    invoke-virtual {p0, v1, v2}, La/ws40;->b(II)V

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, La/ws40;->a:La/l4e;

    .line 43
    .line 44
    invoke-virtual {v3}, La/k4e;->s()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->E1:I

    .line 49
    .line 50
    iget-object v3, p0, La/ws40;->a:La/l4e;

    .line 51
    .line 52
    invoke-virtual {v3}, La/k4e;->m()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->F1:I

    .line 57
    .line 58
    iget-object v3, p0, La/ws40;->b:La/l4e;

    .line 59
    .line 60
    invoke-virtual {v3}, La/k4e;->s()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->G1:I

    .line 65
    .line 66
    iget-object v3, p0, La/ws40;->b:La/l4e;

    .line 67
    .line 68
    invoke-virtual {v3}, La/k4e;->m()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    iput v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->H1:I

    .line 73
    .line 74
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->E1:I

    .line 75
    .line 76
    iget v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->G1:I

    .line 77
    .line 78
    if-ne v4, v5, :cond_2

    .line 79
    .line 80
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->F1:I

    .line 81
    .line 82
    if-eq v4, v3, :cond_1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    move v3, v8

    .line 86
    goto :goto_1

    .line 87
    :cond_2
    :goto_0
    move v3, v7

    .line 88
    :goto_1
    iput-boolean v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->D1:Z

    .line 89
    .line 90
    :goto_2
    iget v3, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->E1:I

    .line 91
    .line 92
    iget v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->F1:I

    .line 93
    .line 94
    iget v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->I1:I

    .line 95
    .line 96
    const/high16 v6, -0x80000000

    .line 97
    .line 98
    if-eq v5, v6, :cond_3

    .line 99
    .line 100
    if-nez v5, :cond_4

    .line 101
    .line 102
    :cond_3
    int-to-float v5, v3

    .line 103
    iget v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->K1:F

    .line 104
    .line 105
    iget v10, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->G1:I

    .line 106
    .line 107
    sub-int/2addr v10, v3

    .line 108
    int-to-float v3, v10

    .line 109
    mul-float/2addr v9, v3

    .line 110
    add-float/2addr v9, v5

    .line 111
    float-to-int v3, v9

    .line 112
    :cond_4
    iget v5, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->J1:I

    .line 113
    .line 114
    if-eq v5, v6, :cond_5

    .line 115
    .line 116
    if-nez v5, :cond_6

    .line 117
    .line 118
    :cond_5
    int-to-float v5, v4

    .line 119
    iget v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->K1:F

    .line 120
    .line 121
    iget v9, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->H1:I

    .line 122
    .line 123
    sub-int/2addr v9, v4

    .line 124
    int-to-float v4, v9

    .line 125
    mul-float/2addr v6, v4

    .line 126
    add-float/2addr v6, v5

    .line 127
    float-to-int v4, v6

    .line 128
    :cond_6
    iget-object v5, p0, La/ws40;->a:La/l4e;

    .line 129
    .line 130
    iget-boolean v6, v5, La/l4e;->I0:Z

    .line 131
    .line 132
    if-nez v6, :cond_8

    .line 133
    .line 134
    iget-object v6, p0, La/ws40;->b:La/l4e;

    .line 135
    .line 136
    iget-boolean v6, v6, La/l4e;->I0:Z

    .line 137
    .line 138
    if-eqz v6, :cond_7

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_7
    move-object v6, v5

    .line 142
    move v5, v8

    .line 143
    goto :goto_4

    .line 144
    :cond_8
    :goto_3
    move-object v6, v5

    .line 145
    move v5, v7

    .line 146
    :goto_4
    iget-boolean v6, v6, La/l4e;->J0:Z

    .line 147
    .line 148
    if-nez v6, :cond_a

    .line 149
    .line 150
    iget-object p0, p0, La/ws40;->b:La/l4e;

    .line 151
    .line 152
    iget-boolean p0, p0, La/l4e;->J0:Z

    .line 153
    .line 154
    if-eqz p0, :cond_9

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_9
    move v6, v8

    .line 158
    goto :goto_6

    .line 159
    :cond_a
    :goto_5
    move v6, v7

    .line 160
    :goto_6
    invoke-virtual/range {v0 .. v6}, Landroidx/constraintlayout/widget/ConstraintLayout;->r(IIIIZZ)V

    .line 161
    .line 162
    .line 163
    iget-object p0, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->A:Ljava/util/HashMap;

    .line 164
    .line 165
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->S1:La/ws40;

    .line 170
    .line 171
    invoke-virtual {v2}, La/ws40;->a()V

    .line 172
    .line 173
    .line 174
    iput-boolean v7, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->l1:Z

    .line 175
    .line 176
    new-instance v2, Landroid/util/SparseArray;

    .line 177
    .line 178
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 179
    .line 180
    .line 181
    move v3, v8

    .line 182
    :goto_7
    if-ge v3, v1, :cond_b

    .line 183
    .line 184
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    invoke-virtual {p0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    check-cast v4, La/ds40;

    .line 197
    .line 198
    invoke-virtual {v2, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    add-int/lit8 v3, v3, 0x1

    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    iget-object v4, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 213
    .line 214
    iget-object v4, v4, La/wt40;->c:La/vt40;

    .line 215
    .line 216
    const/4 v5, -0x1

    .line 217
    if-eqz v4, :cond_c

    .line 218
    .line 219
    iget v4, v4, La/vt40;->p:I

    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_c
    move v4, v5

    .line 223
    :goto_8
    if-eq v4, v5, :cond_e

    .line 224
    .line 225
    move v6, v8

    .line 226
    :goto_9
    if-ge v6, v1, :cond_e

    .line 227
    .line 228
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    invoke-virtual {p0, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    check-cast v9, La/ds40;

    .line 237
    .line 238
    if-eqz v9, :cond_d

    .line 239
    .line 240
    iput v4, v9, La/ds40;->B:I

    .line 241
    .line 242
    :cond_d
    add-int/lit8 v6, v6, 0x1

    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_e
    new-instance v4, Landroid/util/SparseBooleanArray;

    .line 246
    .line 247
    invoke-direct {v4}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    new-array v6, v6, [I

    .line 255
    .line 256
    move v9, v8

    .line 257
    move v10, v9

    .line 258
    :goto_a
    if-ge v9, v1, :cond_10

    .line 259
    .line 260
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 261
    .line 262
    .line 263
    move-result-object v11

    .line 264
    invoke-virtual {p0, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    check-cast v11, La/ds40;

    .line 269
    .line 270
    iget-object v12, v11, La/ds40;->f:La/pt40;

    .line 271
    .line 272
    iget v12, v12, La/pt40;->k:I

    .line 273
    .line 274
    if-eq v12, v5, :cond_f

    .line 275
    .line 276
    invoke-virtual {v4, v12, v7}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 277
    .line 278
    .line 279
    add-int/lit8 v12, v10, 0x1

    .line 280
    .line 281
    iget-object v11, v11, La/ds40;->f:La/pt40;

    .line 282
    .line 283
    iget v11, v11, La/pt40;->k:I

    .line 284
    .line 285
    aput v11, v6, v10

    .line 286
    .line 287
    move v10, v12

    .line 288
    :cond_f
    add-int/lit8 v9, v9, 0x1

    .line 289
    .line 290
    goto :goto_a

    .line 291
    :cond_10
    move v5, v8

    .line 292
    :goto_b
    if-ge v5, v10, :cond_12

    .line 293
    .line 294
    aget v9, v6, v5

    .line 295
    .line 296
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 297
    .line 298
    .line 299
    move-result-object v9

    .line 300
    invoke-virtual {p0, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v9

    .line 304
    check-cast v9, La/ds40;

    .line 305
    .line 306
    if-nez v9, :cond_11

    .line 307
    .line 308
    goto :goto_c

    .line 309
    :cond_11
    iget-object v11, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 310
    .line 311
    invoke-virtual {v11, v9}, La/wt40;->e(La/ds40;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 315
    .line 316
    .line 317
    move-result-wide v11

    .line 318
    invoke-virtual {v9, v2, v3, v11, v12}, La/ds40;->g(IIJ)V

    .line 319
    .line 320
    .line 321
    :goto_c
    add-int/lit8 v5, v5, 0x1

    .line 322
    .line 323
    goto :goto_b

    .line 324
    :cond_12
    move v5, v8

    .line 325
    :goto_d
    if-ge v5, v1, :cond_15

    .line 326
    .line 327
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    invoke-virtual {p0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v9

    .line 335
    check-cast v9, La/ds40;

    .line 336
    .line 337
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    invoke-virtual {v4, v6}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 342
    .line 343
    .line 344
    move-result v6

    .line 345
    if-eqz v6, :cond_13

    .line 346
    .line 347
    goto :goto_e

    .line 348
    :cond_13
    if-eqz v9, :cond_14

    .line 349
    .line 350
    iget-object v6, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 351
    .line 352
    invoke-virtual {v6, v9}, La/wt40;->e(La/ds40;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Landroidx/constraintlayout/motion/widget/MotionLayout;->getNanoTime()J

    .line 356
    .line 357
    .line 358
    move-result-wide v10

    .line 359
    invoke-virtual {v9, v2, v3, v10, v11}, La/ds40;->g(IIJ)V

    .line 360
    .line 361
    .line 362
    :cond_14
    :goto_e
    add-int/lit8 v5, v5, 0x1

    .line 363
    .line 364
    goto :goto_d

    .line 365
    :cond_15
    iget-object v2, v0, Landroidx/constraintlayout/motion/widget/MotionLayout;->q:La/wt40;

    .line 366
    .line 367
    iget-object v2, v2, La/wt40;->c:La/vt40;

    .line 368
    .line 369
    const/4 v3, 0x0

    .line 370
    if-eqz v2, :cond_16

    .line 371
    .line 372
    iget v2, v2, La/vt40;->i:F

    .line 373
    .line 374
    goto :goto_f

    .line 375
    :cond_16
    move v2, v3

    .line 376
    :goto_f
    cmpl-float v3, v2, v3

    .line 377
    .line 378
    if-eqz v3, :cond_20

    .line 379
    .line 380
    float-to-double v3, v2

    .line 381
    const-wide/16 v5, 0x0

    .line 382
    .line 383
    cmpg-double v3, v3, v5

    .line 384
    .line 385
    if-gez v3, :cond_17

    .line 386
    .line 387
    goto :goto_10

    .line 388
    :cond_17
    move v7, v8

    .line 389
    :goto_10
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    const v3, -0x800001

    .line 394
    .line 395
    .line 396
    const v4, 0x7f7fffff    # Float.MAX_VALUE

    .line 397
    .line 398
    .line 399
    move v9, v3

    .line 400
    move v6, v4

    .line 401
    move v5, v8

    .line 402
    :goto_11
    const/high16 v10, 0x3f800000    # 1.0f

    .line 403
    .line 404
    if-ge v5, v1, :cond_1e

    .line 405
    .line 406
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 407
    .line 408
    .line 409
    move-result-object v11

    .line 410
    invoke-virtual {p0, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v11

    .line 414
    check-cast v11, La/ds40;

    .line 415
    .line 416
    iget v12, v11, La/ds40;->l:F

    .line 417
    .line 418
    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    .line 419
    .line 420
    .line 421
    move-result v12

    .line 422
    if-nez v12, :cond_1c

    .line 423
    .line 424
    move v5, v8

    .line 425
    :goto_12
    if-ge v5, v1, :cond_19

    .line 426
    .line 427
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    invoke-virtual {p0, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v6

    .line 435
    check-cast v6, La/ds40;

    .line 436
    .line 437
    iget v9, v6, La/ds40;->l:F

    .line 438
    .line 439
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 440
    .line 441
    .line 442
    move-result v9

    .line 443
    if-nez v9, :cond_18

    .line 444
    .line 445
    iget v9, v6, La/ds40;->l:F

    .line 446
    .line 447
    invoke-static {v4, v9}, Ljava/lang/Math;->min(FF)F

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    iget v6, v6, La/ds40;->l:F

    .line 452
    .line 453
    invoke-static {v3, v6}, Ljava/lang/Math;->max(FF)F

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    :cond_18
    add-int/lit8 v5, v5, 0x1

    .line 458
    .line 459
    goto :goto_12

    .line 460
    :cond_19
    :goto_13
    if-ge v8, v1, :cond_20

    .line 461
    .line 462
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    invoke-virtual {p0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v5

    .line 470
    check-cast v5, La/ds40;

    .line 471
    .line 472
    iget v6, v5, La/ds40;->l:F

    .line 473
    .line 474
    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    .line 475
    .line 476
    .line 477
    move-result v6

    .line 478
    if-nez v6, :cond_1b

    .line 479
    .line 480
    sub-float v6, v10, v2

    .line 481
    .line 482
    div-float v6, v10, v6

    .line 483
    .line 484
    iput v6, v5, La/ds40;->n:F

    .line 485
    .line 486
    iget v6, v5, La/ds40;->l:F

    .line 487
    .line 488
    if-eqz v7, :cond_1a

    .line 489
    .line 490
    sub-float v6, v3, v6

    .line 491
    .line 492
    sub-float v9, v3, v4

    .line 493
    .line 494
    div-float/2addr v6, v9

    .line 495
    mul-float/2addr v6, v2

    .line 496
    sub-float v6, v2, v6

    .line 497
    .line 498
    iput v6, v5, La/ds40;->m:F

    .line 499
    .line 500
    goto :goto_14

    .line 501
    :cond_1a
    sub-float/2addr v6, v4

    .line 502
    mul-float/2addr v6, v2

    .line 503
    sub-float v9, v3, v4

    .line 504
    .line 505
    div-float/2addr v6, v9

    .line 506
    sub-float v6, v2, v6

    .line 507
    .line 508
    iput v6, v5, La/ds40;->m:F

    .line 509
    .line 510
    :cond_1b
    :goto_14
    add-int/lit8 v8, v8, 0x1

    .line 511
    .line 512
    goto :goto_13

    .line 513
    :cond_1c
    iget-object v10, v11, La/ds40;->g:La/pt40;

    .line 514
    .line 515
    iget v11, v10, La/pt40;->e:F

    .line 516
    .line 517
    iget v10, v10, La/pt40;->f:F

    .line 518
    .line 519
    if-eqz v7, :cond_1d

    .line 520
    .line 521
    sub-float/2addr v10, v11

    .line 522
    goto :goto_15

    .line 523
    :cond_1d
    add-float/2addr v10, v11

    .line 524
    :goto_15
    invoke-static {v6, v10}, Ljava/lang/Math;->min(FF)F

    .line 525
    .line 526
    .line 527
    move-result v6

    .line 528
    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    .line 529
    .line 530
    .line 531
    move-result v9

    .line 532
    add-int/lit8 v5, v5, 0x1

    .line 533
    .line 534
    goto/16 :goto_11

    .line 535
    .line 536
    :cond_1e
    :goto_16
    if-ge v8, v1, :cond_20

    .line 537
    .line 538
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    invoke-virtual {p0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    check-cast v3, La/ds40;

    .line 547
    .line 548
    iget-object v4, v3, La/ds40;->g:La/pt40;

    .line 549
    .line 550
    iget v5, v4, La/pt40;->e:F

    .line 551
    .line 552
    iget v4, v4, La/pt40;->f:F

    .line 553
    .line 554
    if-eqz v7, :cond_1f

    .line 555
    .line 556
    sub-float/2addr v4, v5

    .line 557
    goto :goto_17

    .line 558
    :cond_1f
    add-float/2addr v4, v5

    .line 559
    :goto_17
    sub-float v5, v10, v2

    .line 560
    .line 561
    div-float v5, v10, v5

    .line 562
    .line 563
    iput v5, v3, La/ds40;->n:F

    .line 564
    .line 565
    sub-float/2addr v4, v6

    .line 566
    mul-float/2addr v4, v2

    .line 567
    sub-float v5, v9, v6

    .line 568
    .line 569
    div-float/2addr v4, v5

    .line 570
    sub-float v4, v2, v4

    .line 571
    .line 572
    iput v4, v3, La/ds40;->m:F

    .line 573
    .line 574
    add-int/lit8 v8, v8, 0x1

    .line 575
    .line 576
    goto :goto_16

    .line 577
    :cond_20
    return-void
.end method

.method public final g(La/l4e;La/r3e;)V
    .locals 11

    .line 1
    new-instance v5, Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v4, La/n4e;

    .line 7
    .line 8
    const/4 v0, -0x2

    .line 9
    invoke-direct {v4, v0, v0}, La/a3e;-><init>(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v5}, Landroid/util/SparseArray;->clear()V

    .line 13
    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    invoke-virtual {v5, v6, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, La/ws40;->g:Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v5, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    iget v1, p2, La/r3e;->d:I

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    iget-object p0, p0, La/ws40;->b:La/l4e;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getOptimizationLevel()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/high16 v3, 0x40000000    # 2.0f

    .line 45
    .line 46
    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    invoke-static {v7, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    sget-boolean v7, Landroidx/constraintlayout/motion/widget/MotionLayout;->Y1:Z

    .line 59
    .line 60
    invoke-virtual {v0, p0, v1, v2, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->s(La/l4e;III)V

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object p0, p1, La/l4e;->u0:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    const/4 v7, 0x1

    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, La/k4e;

    .line 81
    .line 82
    iput-boolean v7, v1, La/k4e;->j0:Z

    .line 83
    .line 84
    iget-object v2, v1, La/k4e;->h0:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Landroid/view/View;

    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-virtual {v5, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    iget-object p0, p1, La/l4e;->u0:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_6

    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    move-object v3, v1

    .line 113
    check-cast v3, La/k4e;

    .line 114
    .line 115
    iget-object v1, v3, La/k4e;->h0:Ljava/lang/Object;

    .line 116
    .line 117
    move-object v2, v1

    .line 118
    check-cast v2, Landroid/view/View;

    .line 119
    .line 120
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    iget-object v8, p2, La/r3e;->g:Ljava/util/HashMap;

    .line 125
    .line 126
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    if-eqz v9, :cond_2

    .line 135
    .line 136
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v8, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    check-cast v1, La/m3e;

    .line 145
    .line 146
    if-eqz v1, :cond_2

    .line 147
    .line 148
    invoke-virtual {v1, v4}, La/m3e;->a(La/a3e;)V

    .line 149
    .line 150
    .line 151
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-virtual {p2, v1}, La/r3e;->h(I)La/m3e;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    iget-object v1, v1, La/m3e;->e:La/n3e;

    .line 160
    .line 161
    iget v1, v1, La/n3e;->c:I

    .line 162
    .line 163
    invoke-virtual {v3, v1}, La/k4e;->T(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-virtual {p2, v1}, La/r3e;->h(I)La/m3e;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    iget-object v1, v1, La/m3e;->e:La/n3e;

    .line 175
    .line 176
    iget v1, v1, La/n3e;->d:I

    .line 177
    .line 178
    invoke-virtual {v3, v1}, La/k4e;->O(I)V

    .line 179
    .line 180
    .line 181
    instance-of v1, v2, Landroidx/constraintlayout/widget/ConstraintHelper;

    .line 182
    .line 183
    if-eqz v1, :cond_4

    .line 184
    .line 185
    move-object v1, v2

    .line 186
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintHelper;

    .line 187
    .line 188
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    iget-object v9, p2, La/r3e;->g:Ljava/util/HashMap;

    .line 193
    .line 194
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    if-eqz v10, :cond_3

    .line 203
    .line 204
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    check-cast v8, La/m3e;

    .line 213
    .line 214
    if-eqz v8, :cond_3

    .line 215
    .line 216
    instance-of v9, v3, La/jvv;

    .line 217
    .line 218
    if-eqz v9, :cond_3

    .line 219
    .line 220
    move-object v9, v3

    .line 221
    check-cast v9, La/jvv;

    .line 222
    .line 223
    invoke-virtual {v1, v8, v9, v4, v5}, Landroidx/constraintlayout/widget/ConstraintHelper;->j(La/m3e;La/jvv;La/n4e;Landroid/util/SparseArray;)V

    .line 224
    .line 225
    .line 226
    :cond_3
    instance-of v1, v2, Landroidx/constraintlayout/widget/Barrier;

    .line 227
    .line 228
    if-eqz v1, :cond_4

    .line 229
    .line 230
    move-object v1, v2

    .line 231
    check-cast v1, Landroidx/constraintlayout/widget/Barrier;

    .line 232
    .line 233
    invoke-virtual {v1}, Landroidx/constraintlayout/widget/ConstraintHelper;->m()V

    .line 234
    .line 235
    .line 236
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    invoke-virtual {v4, v1}, La/a3e;->resolveLayoutDirection(I)V

    .line 241
    .line 242
    .line 243
    sget-boolean v1, Landroidx/constraintlayout/motion/widget/MotionLayout;->Y1:Z

    .line 244
    .line 245
    const/4 v1, 0x0

    .line 246
    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->l(ZLandroid/view/View;La/k4e;La/a3e;Landroid/util/SparseArray;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    invoke-virtual {p2, v1}, La/r3e;->h(I)La/m3e;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    iget-object v1, v1, La/m3e;->c:La/p3e;

    .line 258
    .line 259
    iget v1, v1, La/p3e;->c:I

    .line 260
    .line 261
    if-ne v1, v7, :cond_5

    .line 262
    .line 263
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    iput v1, v3, La/k4e;->i0:I

    .line 268
    .line 269
    goto/16 :goto_1

    .line 270
    .line 271
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    invoke-virtual {p2, v1}, La/r3e;->h(I)La/m3e;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    iget-object v1, v1, La/m3e;->c:La/p3e;

    .line 280
    .line 281
    iget v1, v1, La/p3e;->b:I

    .line 282
    .line 283
    iput v1, v3, La/k4e;->i0:I

    .line 284
    .line 285
    goto/16 :goto_1

    .line 286
    .line 287
    :cond_6
    iget-object p0, p1, La/l4e;->u0:Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    if-eqz p1, :cond_a

    .line 298
    .line 299
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    check-cast p1, La/k4e;

    .line 304
    .line 305
    instance-of p2, p1, La/zru0;

    .line 306
    .line 307
    if-eqz p2, :cond_7

    .line 308
    .line 309
    iget-object p2, p1, La/k4e;->h0:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast p2, Landroidx/constraintlayout/widget/ConstraintHelper;

    .line 312
    .line 313
    check-cast p1, La/jvv;

    .line 314
    .line 315
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    iput v6, p1, La/jvv;->v0:I

    .line 319
    .line 320
    iget-object v0, p1, La/jvv;->u0:[La/k4e;

    .line 321
    .line 322
    const/4 v1, 0x0

    .line 323
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    move v0, v6

    .line 327
    :goto_2
    iget v1, p2, Landroidx/constraintlayout/widget/ConstraintHelper;->b:I

    .line 328
    .line 329
    if-ge v0, v1, :cond_8

    .line 330
    .line 331
    iget-object v1, p2, Landroidx/constraintlayout/widget/ConstraintHelper;->a:[I

    .line 332
    .line 333
    aget v1, v1, v0

    .line 334
    .line 335
    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    check-cast v1, La/k4e;

    .line 340
    .line 341
    invoke-virtual {p1, v1}, La/jvv;->W(La/k4e;)V

    .line 342
    .line 343
    .line 344
    add-int/lit8 v0, v0, 0x1

    .line 345
    .line 346
    goto :goto_2

    .line 347
    :cond_8
    check-cast p1, La/zru0;

    .line 348
    .line 349
    move p2, v6

    .line 350
    :goto_3
    iget v0, p1, La/jvv;->v0:I

    .line 351
    .line 352
    if-ge p2, v0, :cond_7

    .line 353
    .line 354
    iget-object v0, p1, La/jvv;->u0:[La/k4e;

    .line 355
    .line 356
    aget-object v0, v0, p2

    .line 357
    .line 358
    if-eqz v0, :cond_9

    .line 359
    .line 360
    iput-boolean v7, v0, La/k4e;->G:Z

    .line 361
    .line 362
    :cond_9
    add-int/lit8 p2, p2, 0x1

    .line 363
    .line 364
    goto :goto_3

    .line 365
    :cond_a
    return-void
.end method
