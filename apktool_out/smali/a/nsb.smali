.class public final La/nsb;
.super La/gms0;
.source "SourceFile"


# static fields
.field public static final m1:[Ljava/lang/String;

.field public static final n1:La/uob;

.field public static final o1:La/uob;

.field public static final p1:Z


# instance fields
.field public j1:Z

.field public k1:Z

.field public l1:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "android:changeTransform:transforms"

    .line 2
    .line 3
    const-string v1, "android:changeTransform:parentMatrix"

    .line 4
    .line 5
    const-string v2, "android:changeTransform:matrix"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/nsb;->m1:[Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, La/uob;

    .line 14
    .line 15
    const-string v1, "nonTranslations"

    .line 16
    .line 17
    const/4 v2, 0x6

    .line 18
    const-class v3, [F

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, La/uob;-><init>(Ljava/lang/Class;Ljava/lang/String;B)V

    .line 21
    .line 22
    .line 23
    sput-object v0, La/nsb;->n1:La/uob;

    .line 24
    .line 25
    new-instance v0, La/uob;

    .line 26
    .line 27
    const-string v1, "translations"

    .line 28
    .line 29
    const/4 v2, 0x7

    .line 30
    const-class v3, Landroid/graphics/PointF;

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, La/uob;-><init>(Ljava/lang/Class;Ljava/lang/String;B)V

    .line 33
    .line 34
    .line 35
    sput-object v0, La/nsb;->o1:La/uob;

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    sput-boolean v0, La/nsb;->p1:Z

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final U(La/mns0;)V
    .locals 3

    .line 1
    iget-object v0, p1, La/mns0;->b:Landroid/view/View;

    .line 2
    .line 3
    iget-object p1, p1, La/mns0;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x8

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    const-string v1, "android:changeTransform:parent"

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    new-instance v1, La/msb;

    .line 24
    .line 25
    invoke-direct {v1, v0}, La/msb;-><init>(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    const-string v2, "android:changeTransform:transforms"

    .line 29
    .line 30
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v2, Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-direct {v2, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    const/4 v2, 0x0

    .line 53
    :goto_1
    const-string v1, "android:changeTransform:matrix"

    .line 54
    .line 55
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    iget-boolean p0, p0, La/nsb;->k1:Z

    .line 59
    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    new-instance p0, Landroid/graphics/Matrix;

    .line 63
    .line 64
    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Landroid/view/ViewGroup;

    .line 72
    .line 73
    sget-object v2, La/bmu0;->a:La/hmu0;

    .line 74
    .line 75
    invoke-virtual {v2, v1, p0}, La/hmu0;->K(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    neg-int v2, v2

    .line 83
    int-to-float v2, v2

    .line 84
    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    neg-int v1, v1

    .line 89
    int-to-float v1, v1

    .line 90
    invoke-virtual {p0, v2, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 91
    .line 92
    .line 93
    const-string v1, "android:changeTransform:parentMatrix"

    .line 94
    .line 95
    invoke-virtual {p1, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    const p0, 0x7f0a1037

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-string v1, "android:changeTransform:intermediateMatrix"

    .line 106
    .line 107
    invoke-virtual {p1, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    const p0, 0x7f0a0b11

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    const-string v0, "android:changeTransform:intermediateParentMatrix"

    .line 118
    .line 119
    invoke-virtual {p1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :cond_3
    :goto_2
    return-void
.end method

.method public final f(La/mns0;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/nsb;->U(La/mns0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final i(La/mns0;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/nsb;->U(La/mns0;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, La/mns0;->b:Landroid/view/View;

    .line 5
    .line 6
    sget-boolean p1, La/nsb;->p1:Z

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final o(Landroid/view/ViewGroup;La/mns0;La/mns0;)Landroid/animation/Animator;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v5, v0, La/mns0;->b:Landroid/view/View;

    .line 12
    .line 13
    iget-object v6, v0, La/mns0;->a:Ljava/util/HashMap;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    iget-object v8, v3, La/mns0;->b:Landroid/view/View;

    .line 18
    .line 19
    iget-object v0, v3, La/mns0;->a:Ljava/util/HashMap;

    .line 20
    .line 21
    const-string v3, "android:changeTransform:parent"

    .line 22
    .line 23
    invoke-virtual {v6, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    if-eqz v7, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-nez v7, :cond_1

    .line 34
    .line 35
    :cond_0
    const/16 v16, 0x0

    .line 36
    .line 37
    goto/16 :goto_1c

    .line 38
    .line 39
    :cond_1
    invoke-virtual {v6, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    move-object v14, v7

    .line 44
    check-cast v14, Landroid/view/ViewGroup;

    .line 45
    .line 46
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    check-cast v7, Landroid/view/ViewGroup;

    .line 51
    .line 52
    iget-boolean v9, v1, La/nsb;->k1:Z

    .line 53
    .line 54
    const/4 v10, 0x1

    .line 55
    if-eqz v9, :cond_5

    .line 56
    .line 57
    invoke-virtual {v1, v14}, La/gms0;->D(Landroid/view/View;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_3

    .line 62
    .line 63
    invoke-virtual {v1, v7}, La/gms0;->D(Landroid/view/View;)Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-nez v9, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v1, v14, v10}, La/gms0;->v(Landroid/view/View;Z)La/mns0;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    if-eqz v9, :cond_4

    .line 75
    .line 76
    iget-object v9, v9, La/mns0;->b:Landroid/view/View;

    .line 77
    .line 78
    if-ne v7, v9, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    :goto_0
    if-ne v14, v7, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    move v12, v10

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    :goto_1
    const/4 v12, 0x0

    .line 87
    :goto_2
    const-string v7, "android:changeTransform:intermediateMatrix"

    .line 88
    .line 89
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    check-cast v7, Landroid/graphics/Matrix;

    .line 94
    .line 95
    const-string v9, "android:changeTransform:matrix"

    .line 96
    .line 97
    if-eqz v7, :cond_6

    .line 98
    .line 99
    invoke-virtual {v6, v9, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :cond_6
    const-string v7, "android:changeTransform:intermediateParentMatrix"

    .line 103
    .line 104
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    check-cast v7, Landroid/graphics/Matrix;

    .line 109
    .line 110
    const-string v11, "android:changeTransform:parentMatrix"

    .line 111
    .line 112
    if-eqz v7, :cond_7

    .line 113
    .line 114
    invoke-virtual {v6, v11, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    :cond_7
    if-eqz v12, :cond_9

    .line 118
    .line 119
    invoke-virtual {v0, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    check-cast v7, Landroid/graphics/Matrix;

    .line 124
    .line 125
    const v13, 0x7f0a0b11

    .line 126
    .line 127
    .line 128
    invoke-virtual {v8, v13, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object v13, v1, La/nsb;->l1:Landroid/graphics/Matrix;

    .line 132
    .line 133
    invoke-virtual {v13}, Landroid/graphics/Matrix;->reset()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v7, v13}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    check-cast v7, Landroid/graphics/Matrix;

    .line 144
    .line 145
    if-nez v7, :cond_8

    .line 146
    .line 147
    new-instance v7, Landroid/graphics/Matrix;

    .line 148
    .line 149
    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6, v9, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    :cond_8
    invoke-virtual {v6, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v16

    .line 159
    move-object/from16 v10, v16

    .line 160
    .line 161
    check-cast v10, Landroid/graphics/Matrix;

    .line 162
    .line 163
    invoke-virtual {v7, v10}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 164
    .line 165
    .line 166
    invoke-virtual {v7, v13}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 167
    .line 168
    .line 169
    :cond_9
    invoke-virtual {v6, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    check-cast v7, Landroid/graphics/Matrix;

    .line 174
    .line 175
    invoke-virtual {v0, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    check-cast v9, Landroid/graphics/Matrix;

    .line 180
    .line 181
    if-nez v7, :cond_a

    .line 182
    .line 183
    sget-object v7, La/xi30;->a:La/wi30;

    .line 184
    .line 185
    :cond_a
    if-nez v9, :cond_b

    .line 186
    .line 187
    sget-object v9, La/xi30;->a:La/wi30;

    .line 188
    .line 189
    :cond_b
    invoke-virtual {v7, v9}, Landroid/graphics/Matrix;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    const/high16 v13, 0x3f800000    # 1.0f

    .line 194
    .line 195
    const/4 v4, 0x0

    .line 196
    if-eqz v10, :cond_c

    .line 197
    .line 198
    move-object v15, v11

    .line 199
    const/4 v4, 0x0

    .line 200
    const/16 v19, 0x2

    .line 201
    .line 202
    goto/16 :goto_3

    .line 203
    .line 204
    :cond_c
    const-string v10, "android:changeTransform:transforms"

    .line 205
    .line 206
    invoke-virtual {v0, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v10

    .line 210
    check-cast v10, La/msb;

    .line 211
    .line 212
    invoke-virtual {v8, v4}, Landroid/view/View;->setTranslationX(F)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v8, v4}, Landroid/view/View;->setTranslationY(F)V

    .line 216
    .line 217
    .line 218
    sget-object v17, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 219
    .line 220
    invoke-virtual {v8, v4}, Landroid/view/View;->setTranslationZ(F)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v8, v13}, Landroid/view/View;->setScaleX(F)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v8, v13}, Landroid/view/View;->setScaleY(F)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v8, v4}, Landroid/view/View;->setRotationX(F)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v8, v4}, Landroid/view/View;->setRotationY(F)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v8, v4}, Landroid/view/View;->setRotation(F)V

    .line 236
    .line 237
    .line 238
    const/16 v13, 0x9

    .line 239
    .line 240
    new-array v4, v13, [F

    .line 241
    .line 242
    invoke-virtual {v7, v4}, Landroid/graphics/Matrix;->getValues([F)V

    .line 243
    .line 244
    .line 245
    new-array v7, v13, [F

    .line 246
    .line 247
    invoke-virtual {v9, v7}, Landroid/graphics/Matrix;->getValues([F)V

    .line 248
    .line 249
    .line 250
    move-object/from16 v18, v11

    .line 251
    .line 252
    move-object v11, v9

    .line 253
    move-object v9, v10

    .line 254
    new-instance v10, La/lsb;

    .line 255
    .line 256
    invoke-direct {v10, v8, v4}, La/lsb;-><init>(Landroid/view/View;[F)V

    .line 257
    .line 258
    .line 259
    const/16 v19, 0x2

    .line 260
    .line 261
    new-instance v15, La/zkq;

    .line 262
    .line 263
    new-array v13, v13, [F

    .line 264
    .line 265
    move-object/from16 v20, v8

    .line 266
    .line 267
    const/4 v8, 0x0

    .line 268
    invoke-direct {v15, v8}, La/zkq;-><init>(B)V

    .line 269
    .line 270
    .line 271
    iput-object v13, v15, La/zkq;->b:Ljava/lang/Object;

    .line 272
    .line 273
    filled-new-array {v4, v7}, [[F

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    sget-object v13, La/nsb;->n1:La/uob;

    .line 278
    .line 279
    invoke-static {v13, v15, v8}, Landroid/animation/PropertyValuesHolder;->ofObject(Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    iget-object v13, v1, La/gms0;->B:La/f290;

    .line 284
    .line 285
    aget v15, v4, v19

    .line 286
    .line 287
    const/16 v21, 0x5

    .line 288
    .line 289
    aget v4, v4, v21

    .line 290
    .line 291
    move-object/from16 v22, v7

    .line 292
    .line 293
    aget v7, v22, v19

    .line 294
    .line 295
    move-object/from16 v23, v9

    .line 296
    .line 297
    aget v9, v22, v21

    .line 298
    .line 299
    invoke-virtual {v13, v15, v4, v7, v9}, La/f290;->a(FFFF)Landroid/graphics/Path;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    sget-object v7, La/nsb;->o1:La/uob;

    .line 304
    .line 305
    invoke-static {v7, v4}, La/w0d0;->a(Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    filled-new-array {v8, v4}, [Landroid/animation/PropertyValuesHolder;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    invoke-static {v10, v4}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    new-instance v7, La/ksb;

    .line 318
    .line 319
    iget-boolean v13, v1, La/nsb;->j1:Z

    .line 320
    .line 321
    move-object/from16 v15, v18

    .line 322
    .line 323
    move-object/from16 v8, v20

    .line 324
    .line 325
    move-object/from16 v9, v23

    .line 326
    .line 327
    invoke-direct/range {v7 .. v13}, La/ksb;-><init>(Landroid/view/View;La/msb;La/lsb;Landroid/graphics/Matrix;ZZ)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v4, v7}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v4, v7}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    .line 334
    .line 335
    .line 336
    :goto_3
    sget-boolean v7, La/nsb;->p1:Z

    .line 337
    .line 338
    if-eqz v12, :cond_28

    .line 339
    .line 340
    if-eqz v4, :cond_28

    .line 341
    .line 342
    iget-boolean v9, v1, La/nsb;->j1:Z

    .line 343
    .line 344
    if-eqz v9, :cond_28

    .line 345
    .line 346
    invoke-virtual {v0, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    check-cast v0, Landroid/graphics/Matrix;

    .line 351
    .line 352
    new-instance v9, Landroid/graphics/Matrix;

    .line 353
    .line 354
    invoke-direct {v9, v0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 355
    .line 356
    .line 357
    sget-object v0, La/bmu0;->a:La/hmu0;

    .line 358
    .line 359
    invoke-virtual {v0, v2, v9}, La/hmu0;->L(Landroid/view/ViewGroup;Landroid/graphics/Matrix;)V

    .line 360
    .line 361
    .line 362
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 363
    .line 364
    const/16 v10, 0x1c

    .line 365
    .line 366
    const-class v11, Landroid/view/ViewGroup;

    .line 367
    .line 368
    if-ne v0, v10, :cond_f

    .line 369
    .line 370
    sget-boolean v0, La/ro;->e:Z

    .line 371
    .line 372
    if-nez v0, :cond_d

    .line 373
    .line 374
    :try_start_0
    invoke-static {}, La/ro;->b()V

    .line 375
    .line 376
    .line 377
    sget-object v0, La/ro;->b:Ljava/lang/Class;

    .line 378
    .line 379
    const-string v10, "addGhost"

    .line 380
    .line 381
    const-class v12, Landroid/view/View;

    .line 382
    .line 383
    const-class v13, Landroid/graphics/Matrix;

    .line 384
    .line 385
    filled-new-array {v12, v11, v13}, [Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    move-result-object v11

    .line 389
    invoke-virtual {v0, v10, v11}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    sput-object v0, La/ro;->d:Ljava/lang/reflect/Method;

    .line 394
    .line 395
    const/4 v10, 0x1

    .line 396
    invoke-virtual {v0, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 397
    .line 398
    .line 399
    :goto_4
    const/4 v10, 0x1

    .line 400
    goto :goto_5

    .line 401
    :catch_0
    move-exception v0

    .line 402
    const-string v10, "GhostViewApi21"

    .line 403
    .line 404
    const-string v11, "Failed to retrieve addGhost method"

    .line 405
    .line 406
    invoke-static {v10, v11, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 407
    .line 408
    .line 409
    goto :goto_4

    .line 410
    :goto_5
    sput-boolean v10, La/ro;->e:Z

    .line 411
    .line 412
    :cond_d
    sget-object v0, La/ro;->d:Ljava/lang/reflect/Method;

    .line 413
    .line 414
    if-eqz v0, :cond_e

    .line 415
    .line 416
    :try_start_1
    new-instance v10, La/ro;

    .line 417
    .line 418
    filled-new-array {v8, v2, v9}, [Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    const/4 v9, 0x0

    .line 423
    invoke-virtual {v0, v9, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    check-cast v0, Landroid/view/View;

    .line 428
    .line 429
    invoke-direct {v10, v0}, La/ro;-><init>(Landroid/view/View;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 430
    .line 431
    .line 432
    move-object/from16 v16, v10

    .line 433
    .line 434
    goto :goto_7

    .line 435
    :catch_1
    move-exception v0

    .line 436
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-static {v0}, La/ohq;->p(Ljava/lang/Throwable;)V

    .line 441
    .line 442
    .line 443
    :goto_6
    const/16 v16, 0x0

    .line 444
    .line 445
    return-object v16

    .line 446
    :catch_2
    :cond_e
    const/16 v16, 0x0

    .line 447
    .line 448
    :goto_7
    move-object/from16 v17, v4

    .line 449
    .line 450
    move/from16 v18, v7

    .line 451
    .line 452
    move-object/from16 v12, v16

    .line 453
    .line 454
    goto/16 :goto_19

    .line 455
    .line 456
    :cond_f
    sget v0, La/x6v;->g:I

    .line 457
    .line 458
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    instance-of v0, v0, Landroid/view/ViewGroup;

    .line 463
    .line 464
    if-eqz v0, :cond_27

    .line 465
    .line 466
    sget v0, La/w6v;->c:I

    .line 467
    .line 468
    const v0, 0x7f0a0670

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v10

    .line 475
    check-cast v10, La/w6v;

    .line 476
    .line 477
    const v12, 0x7f0a066f

    .line 478
    .line 479
    .line 480
    invoke-virtual {v8, v12}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v12

    .line 484
    check-cast v12, La/x6v;

    .line 485
    .line 486
    if-eqz v12, :cond_10

    .line 487
    .line 488
    invoke-virtual {v12}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 489
    .line 490
    .line 491
    move-result-object v13

    .line 492
    check-cast v13, La/w6v;

    .line 493
    .line 494
    if-eq v13, v10, :cond_10

    .line 495
    .line 496
    iget v14, v12, La/x6v;->d:I

    .line 497
    .line 498
    invoke-virtual {v13, v12}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 499
    .line 500
    .line 501
    const/4 v12, 0x0

    .line 502
    goto :goto_8

    .line 503
    :cond_10
    const/4 v14, 0x0

    .line 504
    :goto_8
    if-nez v12, :cond_23

    .line 505
    .line 506
    new-instance v12, La/x6v;

    .line 507
    .line 508
    invoke-direct {v12, v8}, La/x6v;-><init>(Landroid/view/View;)V

    .line 509
    .line 510
    .line 511
    iput-object v9, v12, La/x6v;->e:Landroid/graphics/Matrix;

    .line 512
    .line 513
    if-nez v10, :cond_11

    .line 514
    .line 515
    new-instance v10, La/w6v;

    .line 516
    .line 517
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 518
    .line 519
    .line 520
    move-result-object v9

    .line 521
    invoke-direct {v10, v9}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 522
    .line 523
    .line 524
    const/4 v9, 0x0

    .line 525
    invoke-virtual {v10, v9}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 526
    .line 527
    .line 528
    iput-object v2, v10, La/w6v;->a:Landroid/view/ViewGroup;

    .line 529
    .line 530
    invoke-virtual {v2, v0, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    invoke-virtual {v0, v10}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 538
    .line 539
    .line 540
    const/4 v9, 0x1

    .line 541
    iput-boolean v9, v10, La/w6v;->b:Z

    .line 542
    .line 543
    goto :goto_9

    .line 544
    :cond_11
    iget-object v0, v10, La/w6v;->a:Landroid/view/ViewGroup;

    .line 545
    .line 546
    iget-boolean v9, v10, La/w6v;->b:Z

    .line 547
    .line 548
    if-eqz v9, :cond_22

    .line 549
    .line 550
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 551
    .line 552
    .line 553
    move-result-object v9

    .line 554
    invoke-virtual {v9, v10}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-virtual {v0, v10}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    .line 562
    .line 563
    .line 564
    :goto_9
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    invoke-virtual {v10}, Landroid/view/View;->getTop()I

    .line 569
    .line 570
    .line 571
    move-result v9

    .line 572
    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    .line 573
    .line 574
    .line 575
    move-result v13

    .line 576
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 577
    .line 578
    .line 579
    move-result v15

    .line 580
    add-int/2addr v15, v13

    .line 581
    invoke-virtual {v10}, Landroid/view/View;->getTop()I

    .line 582
    .line 583
    .line 584
    move-result v13

    .line 585
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 586
    .line 587
    .line 588
    move-result v16

    .line 589
    add-int v13, v16, v13

    .line 590
    .line 591
    invoke-static {v10, v0, v9, v15, v13}, La/bmu0;->a(Landroid/view/View;IIII)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v12}, Landroid/view/View;->getLeft()I

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    invoke-virtual {v12}, Landroid/view/View;->getTop()I

    .line 599
    .line 600
    .line 601
    move-result v9

    .line 602
    invoke-virtual {v12}, Landroid/view/View;->getLeft()I

    .line 603
    .line 604
    .line 605
    move-result v13

    .line 606
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 607
    .line 608
    .line 609
    move-result v15

    .line 610
    add-int/2addr v15, v13

    .line 611
    invoke-virtual {v12}, Landroid/view/View;->getTop()I

    .line 612
    .line 613
    .line 614
    move-result v13

    .line 615
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 616
    .line 617
    .line 618
    move-result v2

    .line 619
    add-int/2addr v2, v13

    .line 620
    invoke-static {v12, v0, v9, v15, v2}, La/bmu0;->a(Landroid/view/View;IIII)V

    .line 621
    .line 622
    .line 623
    new-instance v0, Ljava/util/ArrayList;

    .line 624
    .line 625
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 626
    .line 627
    .line 628
    iget-object v2, v12, La/x6v;->c:Landroid/view/View;

    .line 629
    .line 630
    invoke-static {v2, v0}, La/w6v;->a(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 631
    .line 632
    .line 633
    new-instance v2, Ljava/util/ArrayList;

    .line 634
    .line 635
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v10}, Landroid/view/ViewGroup;->getChildCount()I

    .line 639
    .line 640
    .line 641
    move-result v9

    .line 642
    const/4 v13, 0x1

    .line 643
    sub-int/2addr v9, v13

    .line 644
    move v13, v9

    .line 645
    const/4 v9, 0x0

    .line 646
    :goto_a
    if-gt v9, v13, :cond_1f

    .line 647
    .line 648
    add-int v15, v9, v13

    .line 649
    .line 650
    div-int/lit8 v15, v15, 0x2

    .line 651
    .line 652
    invoke-virtual {v10, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 653
    .line 654
    .line 655
    move-result-object v16

    .line 656
    move-object/from16 v1, v16

    .line 657
    .line 658
    check-cast v1, La/x6v;

    .line 659
    .line 660
    iget-object v1, v1, La/x6v;->c:Landroid/view/View;

    .line 661
    .line 662
    invoke-static {v1, v2}, La/w6v;->a(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    if-nez v1, :cond_1e

    .line 670
    .line 671
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 672
    .line 673
    .line 674
    move-result v1

    .line 675
    if-nez v1, :cond_1e

    .line 676
    .line 677
    move-object/from16 v17, v4

    .line 678
    .line 679
    const/4 v1, 0x0

    .line 680
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v4

    .line 684
    move/from16 v18, v7

    .line 685
    .line 686
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v7

    .line 690
    if-eq v4, v7, :cond_12

    .line 691
    .line 692
    move-object/from16 p1, v0

    .line 693
    .line 694
    goto :goto_c

    .line 695
    :cond_12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 696
    .line 697
    .line 698
    move-result v1

    .line 699
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 700
    .line 701
    .line 702
    move-result v4

    .line 703
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    const/4 v4, 0x1

    .line 708
    :goto_b
    if-ge v4, v1, :cond_1c

    .line 709
    .line 710
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v7

    .line 714
    check-cast v7, Landroid/view/View;

    .line 715
    .line 716
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v16

    .line 720
    move-object/from16 p1, v0

    .line 721
    .line 722
    move-object/from16 v0, v16

    .line 723
    .line 724
    check-cast v0, Landroid/view/View;

    .line 725
    .line 726
    if-eq v7, v0, :cond_1b

    .line 727
    .line 728
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    check-cast v1, Landroid/view/ViewGroup;

    .line 733
    .line 734
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 735
    .line 736
    .line 737
    move-result v4

    .line 738
    invoke-static {v7}, La/v6v;->a(Landroid/view/View;)F

    .line 739
    .line 740
    .line 741
    move-result v16

    .line 742
    invoke-static {v0}, La/v6v;->a(Landroid/view/View;)F

    .line 743
    .line 744
    .line 745
    move-result v20

    .line 746
    cmpl-float v16, v16, v20

    .line 747
    .line 748
    if-eqz v16, :cond_15

    .line 749
    .line 750
    invoke-static {v7}, La/v6v;->a(Landroid/view/View;)F

    .line 751
    .line 752
    .line 753
    move-result v1

    .line 754
    invoke-static {v0}, La/v6v;->a(Landroid/view/View;)F

    .line 755
    .line 756
    .line 757
    move-result v0

    .line 758
    cmpl-float v0, v1, v0

    .line 759
    .line 760
    if-lez v0, :cond_14

    .line 761
    .line 762
    :goto_c
    move-object/from16 v16, v2

    .line 763
    .line 764
    :cond_13
    :goto_d
    move/from16 v21, v13

    .line 765
    .line 766
    move/from16 v13, v19

    .line 767
    .line 768
    const/16 v23, 0x0

    .line 769
    .line 770
    goto/16 :goto_14

    .line 771
    .line 772
    :cond_14
    move-object/from16 v16, v2

    .line 773
    .line 774
    move/from16 v13, v19

    .line 775
    .line 776
    const/16 v23, 0x0

    .line 777
    .line 778
    goto/16 :goto_13

    .line 779
    .line 780
    :cond_15
    move-object/from16 v16, v2

    .line 781
    .line 782
    const/4 v2, 0x0

    .line 783
    :goto_e
    if-ge v2, v4, :cond_13

    .line 784
    .line 785
    move/from16 v20, v4

    .line 786
    .line 787
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 788
    .line 789
    move/from16 v21, v13

    .line 790
    .line 791
    const/16 v13, 0x1d

    .line 792
    .line 793
    if-lt v4, v13, :cond_16

    .line 794
    .line 795
    invoke-static {v1, v2}, La/khu0;->a(Landroid/view/ViewGroup;I)I

    .line 796
    .line 797
    .line 798
    move-result v4

    .line 799
    move/from16 v22, v2

    .line 800
    .line 801
    move/from16 v13, v19

    .line 802
    .line 803
    const/16 v23, 0x0

    .line 804
    .line 805
    goto :goto_12

    .line 806
    :cond_16
    sget-boolean v4, La/v2n0;->c:Z

    .line 807
    .line 808
    if-nez v4, :cond_17

    .line 809
    .line 810
    :try_start_2
    const-string v4, "getChildDrawingOrder"
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_4

    .line 811
    .line 812
    move/from16 v22, v2

    .line 813
    .line 814
    move/from16 v13, v19

    .line 815
    .line 816
    :try_start_3
    new-array v2, v13, [Ljava/lang/Class;

    .line 817
    .line 818
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 819
    .line 820
    const/16 v23, 0x0

    .line 821
    .line 822
    aput-object v13, v2, v23

    .line 823
    .line 824
    move-object/from16 v23, v13

    .line 825
    .line 826
    const/4 v13, 0x1

    .line 827
    aput-object v23, v2, v13

    .line 828
    .line 829
    invoke-virtual {v11, v4, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    sput-object v2, La/v2n0;->b:Ljava/lang/reflect/Method;

    .line 834
    .line 835
    invoke-virtual {v2, v13}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_3

    .line 836
    .line 837
    .line 838
    :catch_3
    :goto_f
    const/4 v13, 0x1

    .line 839
    goto :goto_10

    .line 840
    :catch_4
    move/from16 v22, v2

    .line 841
    .line 842
    goto :goto_f

    .line 843
    :goto_10
    sput-boolean v13, La/v2n0;->c:Z

    .line 844
    .line 845
    goto :goto_11

    .line 846
    :cond_17
    move/from16 v22, v2

    .line 847
    .line 848
    :goto_11
    sget-object v2, La/v2n0;->b:Ljava/lang/reflect/Method;

    .line 849
    .line 850
    if-eqz v2, :cond_18

    .line 851
    .line 852
    const/4 v13, 0x2

    .line 853
    :try_start_4
    new-array v4, v13, [Ljava/lang/Object;

    .line 854
    .line 855
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 856
    .line 857
    .line 858
    move-result v19

    .line 859
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 860
    .line 861
    .line 862
    move-result-object v19
    :try_end_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_5

    .line 863
    const/16 v23, 0x0

    .line 864
    .line 865
    :try_start_5
    aput-object v19, v4, v23

    .line 866
    .line 867
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 868
    .line 869
    .line 870
    move-result-object v19

    .line 871
    const/16 v24, 0x1

    .line 872
    .line 873
    aput-object v19, v4, v24

    .line 874
    .line 875
    invoke-virtual {v2, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v2

    .line 879
    check-cast v2, Ljava/lang/Integer;

    .line 880
    .line 881
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 882
    .line 883
    .line 884
    move-result v4
    :try_end_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_5 .. :try_end_5} :catch_6

    .line 885
    goto :goto_12

    .line 886
    :cond_18
    const/4 v13, 0x2

    .line 887
    :catch_5
    const/16 v23, 0x0

    .line 888
    .line 889
    :catch_6
    move/from16 v4, v22

    .line 890
    .line 891
    :goto_12
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    if-ne v2, v7, :cond_19

    .line 896
    .line 897
    goto :goto_13

    .line 898
    :cond_19
    if-ne v2, v0, :cond_1a

    .line 899
    .line 900
    goto :goto_14

    .line 901
    :cond_1a
    add-int/lit8 v2, v22, 0x1

    .line 902
    .line 903
    move/from16 v19, v13

    .line 904
    .line 905
    move/from16 v4, v20

    .line 906
    .line 907
    move/from16 v13, v21

    .line 908
    .line 909
    goto :goto_e

    .line 910
    :cond_1b
    move-object/from16 v16, v2

    .line 911
    .line 912
    move/from16 v21, v13

    .line 913
    .line 914
    move/from16 v13, v19

    .line 915
    .line 916
    const/16 v23, 0x0

    .line 917
    .line 918
    add-int/lit8 v4, v4, 0x1

    .line 919
    .line 920
    move-object/from16 v0, p1

    .line 921
    .line 922
    move/from16 v13, v21

    .line 923
    .line 924
    goto/16 :goto_b

    .line 925
    .line 926
    :cond_1c
    move-object/from16 p1, v0

    .line 927
    .line 928
    move-object/from16 v16, v2

    .line 929
    .line 930
    move/from16 v21, v13

    .line 931
    .line 932
    move/from16 v13, v19

    .line 933
    .line 934
    const/16 v23, 0x0

    .line 935
    .line 936
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->size()I

    .line 937
    .line 938
    .line 939
    move-result v0

    .line 940
    if-ne v0, v1, :cond_1d

    .line 941
    .line 942
    goto :goto_14

    .line 943
    :cond_1d
    :goto_13
    add-int/lit8 v15, v15, -0x1

    .line 944
    .line 945
    goto :goto_15

    .line 946
    :cond_1e
    move-object/from16 p1, v0

    .line 947
    .line 948
    move-object/from16 v16, v2

    .line 949
    .line 950
    move-object/from16 v17, v4

    .line 951
    .line 952
    move/from16 v18, v7

    .line 953
    .line 954
    goto/16 :goto_d

    .line 955
    .line 956
    :goto_14
    add-int/lit8 v15, v15, 0x1

    .line 957
    .line 958
    move v9, v15

    .line 959
    move/from16 v15, v21

    .line 960
    .line 961
    :goto_15
    invoke-virtual/range {v16 .. v16}, Ljava/util/ArrayList;->clear()V

    .line 962
    .line 963
    .line 964
    move-object/from16 v1, p0

    .line 965
    .line 966
    move-object/from16 v0, p1

    .line 967
    .line 968
    move/from16 v19, v13

    .line 969
    .line 970
    move v13, v15

    .line 971
    move-object/from16 v2, v16

    .line 972
    .line 973
    move-object/from16 v4, v17

    .line 974
    .line 975
    move/from16 v7, v18

    .line 976
    .line 977
    goto/16 :goto_a

    .line 978
    .line 979
    :cond_1f
    move-object/from16 v17, v4

    .line 980
    .line 981
    move/from16 v18, v7

    .line 982
    .line 983
    if-ltz v9, :cond_21

    .line 984
    .line 985
    invoke-virtual {v10}, Landroid/view/ViewGroup;->getChildCount()I

    .line 986
    .line 987
    .line 988
    move-result v0

    .line 989
    if-lt v9, v0, :cond_20

    .line 990
    .line 991
    goto :goto_16

    .line 992
    :cond_20
    invoke-virtual {v10, v12, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 993
    .line 994
    .line 995
    goto :goto_17

    .line 996
    :cond_21
    :goto_16
    invoke-virtual {v10, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 997
    .line 998
    .line 999
    :goto_17
    iput v14, v12, La/x6v;->d:I

    .line 1000
    .line 1001
    goto :goto_18

    .line 1002
    :cond_22
    const-string v0, "This GhostViewHolder is detached!"

    .line 1003
    .line 1004
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 1005
    .line 1006
    .line 1007
    goto/16 :goto_6

    .line 1008
    .line 1009
    :cond_23
    move-object/from16 v17, v4

    .line 1010
    .line 1011
    move/from16 v18, v7

    .line 1012
    .line 1013
    iput-object v9, v12, La/x6v;->e:Landroid/graphics/Matrix;

    .line 1014
    .line 1015
    :goto_18
    iget v0, v12, La/x6v;->d:I

    .line 1016
    .line 1017
    const/4 v13, 0x1

    .line 1018
    add-int/2addr v0, v13

    .line 1019
    iput v0, v12, La/x6v;->d:I

    .line 1020
    .line 1021
    :goto_19
    if-nez v12, :cond_24

    .line 1022
    .line 1023
    goto :goto_1b

    .line 1024
    :cond_24
    invoke-virtual {v6, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0

    .line 1028
    check-cast v0, Landroid/view/ViewGroup;

    .line 1029
    .line 1030
    invoke-interface {v12, v5, v0}, La/u6v;->a(Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 1031
    .line 1032
    .line 1033
    move-object/from16 v0, p0

    .line 1034
    .line 1035
    :goto_1a
    iget-object v1, v0, La/gms0;->n:La/bns0;

    .line 1036
    .line 1037
    if-eqz v1, :cond_25

    .line 1038
    .line 1039
    move-object v0, v1

    .line 1040
    goto :goto_1a

    .line 1041
    :cond_25
    new-instance v1, La/jsb;

    .line 1042
    .line 1043
    invoke-direct {v1}, La/jsb;-><init>()V

    .line 1044
    .line 1045
    .line 1046
    iput-object v8, v1, La/jsb;->b:Ljava/lang/Object;

    .line 1047
    .line 1048
    iput-object v12, v1, La/jsb;->c:Ljava/lang/Object;

    .line 1049
    .line 1050
    invoke-virtual {v0, v1}, La/gms0;->a(La/dms0;)V

    .line 1051
    .line 1052
    .line 1053
    if-eqz v18, :cond_29

    .line 1054
    .line 1055
    if-eq v5, v8, :cond_26

    .line 1056
    .line 1057
    const/4 v1, 0x0

    .line 1058
    invoke-static {v5, v1}, La/bmu0;->b(Landroid/view/View;F)V

    .line 1059
    .line 1060
    .line 1061
    :cond_26
    const/high16 v1, 0x3f800000    # 1.0f

    .line 1062
    .line 1063
    invoke-static {v8, v1}, La/bmu0;->b(Landroid/view/View;F)V

    .line 1064
    .line 1065
    .line 1066
    goto :goto_1b

    .line 1067
    :cond_27
    const-string v0, "Ghosted views must be parented by a ViewGroup"

    .line 1068
    .line 1069
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 1070
    .line 1071
    .line 1072
    goto/16 :goto_6

    .line 1073
    .line 1074
    :cond_28
    move-object/from16 v17, v4

    .line 1075
    .line 1076
    move/from16 v18, v7

    .line 1077
    .line 1078
    if-nez v18, :cond_29

    .line 1079
    .line 1080
    invoke-virtual {v14, v5}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 1081
    .line 1082
    .line 1083
    :cond_29
    :goto_1b
    return-object v17

    .line 1084
    :goto_1c
    return-object v16
.end method

.method public final z()[Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, La/nsb;->m1:[Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
