.class public final La/ji5;
.super La/fhe0;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f0701bb

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iput v0, p0, La/ji5;->a:I

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const v1, 0x7f07015a

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, La/ji5;->b:I

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const v1, 0x7f0704be

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iput v0, p0, La/ji5;->c:I

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const v1, 0x7f0706ea

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iput v0, p0, La/ji5;->d:I

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    const v1, 0x7f07072d

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iput v0, p0, La/ji5;->e:I

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const v0, 0x7f07070c

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    iput p1, p0, La/ji5;->f:I

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1, p2, p3, p4}, La/fhe0;->f(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/the0;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    const/4 p4, -0x1

    .line 18
    if-ne p2, p4, :cond_0

    .line 19
    .line 20
    goto/16 :goto_c

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    check-cast p4, La/oqd;

    .line 30
    .line 31
    iget-object p4, p4, La/oqd;->d:La/xzp;

    .line 32
    .line 33
    iget-object p4, p4, La/xzp;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p4, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {p4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    sget-object p4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, La/nj50;

    .line 70
    .line 71
    iget-object v1, v1, La/nj50;->c:La/yge0;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    move-object p4, v0

    .line 78
    :goto_1
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object p4

    .line 82
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p4

    .line 89
    :cond_3
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const/4 v1, 0x0

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    move-object v2, v0

    .line 101
    check-cast v2, La/yge0;

    .line 102
    .line 103
    instance-of v2, v2, La/fk5;

    .line 104
    .line 105
    if-eqz v2, :cond_3

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    move-object v0, v1

    .line 109
    :goto_2
    instance-of p4, v0, La/fk5;

    .line 110
    .line 111
    if-eqz p4, :cond_5

    .line 112
    .line 113
    check-cast v0, La/fk5;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    move-object v0, v1

    .line 117
    :goto_3
    if-nez v0, :cond_6

    .line 118
    .line 119
    goto/16 :goto_c

    .line 120
    .line 121
    :cond_6
    invoke-virtual {v0}, La/gl80;->d()I

    .line 122
    .line 123
    .line 124
    move-result p4

    .line 125
    if-ne p2, p4, :cond_7

    .line 126
    .line 127
    goto/16 :goto_c

    .line 128
    .line 129
    :cond_7
    if-eqz p2, :cond_8

    .line 130
    .line 131
    invoke-virtual {v0, p2}, La/gl80;->B(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p4

    .line 135
    instance-of p4, p4, La/lfs0;

    .line 136
    .line 137
    if-eqz p4, :cond_9

    .line 138
    .line 139
    :cond_8
    iget p4, p0, La/ji5;->d:I

    .line 140
    .line 141
    iput p4, p1, Landroid/graphics/Rect;->top:I

    .line 142
    .line 143
    :cond_9
    invoke-virtual {v0, p2}, La/gl80;->B(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p4

    .line 147
    instance-of p4, p4, La/aes0;

    .line 148
    .line 149
    const/4 v2, 0x0

    .line 150
    if-eqz p4, :cond_b

    .line 151
    .line 152
    if-lez p2, :cond_a

    .line 153
    .line 154
    add-int/lit8 p4, p2, -0x1

    .line 155
    .line 156
    invoke-virtual {v0, p4}, La/gl80;->B(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p4

    .line 160
    check-cast p4, La/vk5;

    .line 161
    .line 162
    instance-of p4, p4, La/ogs0;

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_a
    move p4, v2

    .line 166
    :goto_4
    if-eqz p4, :cond_b

    .line 167
    .line 168
    iget p4, p0, La/ji5;->e:I

    .line 169
    .line 170
    iput p4, p1, Landroid/graphics/Rect;->top:I

    .line 171
    .line 172
    :cond_b
    invoke-virtual {v0, p2}, La/gl80;->B(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p4

    .line 176
    instance-of p4, p4, La/gxn;

    .line 177
    .line 178
    if-eqz p4, :cond_c

    .line 179
    .line 180
    iget p4, p0, La/ji5;->f:I

    .line 181
    .line 182
    iput p4, p1, Landroid/graphics/Rect;->top:I

    .line 183
    .line 184
    :cond_c
    invoke-virtual {v0, p2}, La/gl80;->B(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p4

    .line 188
    check-cast p4, La/vk5;

    .line 189
    .line 190
    if-nez p4, :cond_d

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_d
    instance-of v3, p4, La/lfs0;

    .line 194
    .line 195
    if-eqz v3, :cond_e

    .line 196
    .line 197
    iget p0, p0, La/ji5;->b:I

    .line 198
    .line 199
    iput p0, p1, Landroid/graphics/Rect;->left:I

    .line 200
    .line 201
    iput p0, p1, Landroid/graphics/Rect;->right:I

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_e
    instance-of p4, p4, La/aes0;

    .line 205
    .line 206
    if-eqz p4, :cond_f

    .line 207
    .line 208
    iget p0, p0, La/ji5;->c:I

    .line 209
    .line 210
    iput p0, p1, Landroid/graphics/Rect;->left:I

    .line 211
    .line 212
    iput p0, p1, Landroid/graphics/Rect;->right:I

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_f
    :goto_5
    iget p0, p0, La/ji5;->a:I

    .line 216
    .line 217
    iput p0, p1, Landroid/graphics/Rect;->left:I

    .line 218
    .line 219
    iput p0, p1, Landroid/graphics/Rect;->right:I

    .line 220
    .line 221
    :goto_6
    const/4 p0, 0x1

    .line 222
    if-lez p2, :cond_11

    .line 223
    .line 224
    invoke-virtual {v0, p2}, La/gl80;->B(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    check-cast p1, La/vk5;

    .line 229
    .line 230
    add-int/lit8 p4, p2, -0x1

    .line 231
    .line 232
    invoke-virtual {v0, p4}, La/gl80;->B(I)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p4

    .line 236
    check-cast p4, La/vk5;

    .line 237
    .line 238
    instance-of v3, p1, La/tjz;

    .line 239
    .line 240
    if-eqz v3, :cond_10

    .line 241
    .line 242
    instance-of p1, p4, La/tjz;

    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_10
    if-eqz p1, :cond_11

    .line 246
    .line 247
    if-eqz p4, :cond_11

    .line 248
    .line 249
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object p4

    .line 253
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    if-ne p4, p1, :cond_11

    .line 258
    .line 259
    move p1, p0

    .line 260
    goto :goto_7

    .line 261
    :cond_11
    move p1, v2

    .line 262
    :goto_7
    if-eqz p1, :cond_13

    .line 263
    .line 264
    if-nez p2, :cond_12

    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_12
    move p1, v2

    .line 268
    goto :goto_9

    .line 269
    :cond_13
    :goto_8
    move p1, p0

    .line 270
    :goto_9
    invoke-virtual {v0}, La/gl80;->d()I

    .line 271
    .line 272
    .line 273
    move-result p4

    .line 274
    sub-int/2addr p4, p0

    .line 275
    if-ge p2, p4, :cond_15

    .line 276
    .line 277
    invoke-virtual {v0, p2}, La/gl80;->B(I)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p4

    .line 281
    check-cast p4, La/vk5;

    .line 282
    .line 283
    add-int/lit8 v3, p2, 0x1

    .line 284
    .line 285
    invoke-virtual {v0, v3}, La/gl80;->B(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    check-cast v3, La/vk5;

    .line 290
    .line 291
    instance-of v4, p4, La/tjz;

    .line 292
    .line 293
    if-eqz v4, :cond_14

    .line 294
    .line 295
    instance-of p4, v3, La/tjz;

    .line 296
    .line 297
    goto :goto_a

    .line 298
    :cond_14
    if-eqz p4, :cond_15

    .line 299
    .line 300
    if-eqz v3, :cond_15

    .line 301
    .line 302
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    move-result-object p4

    .line 310
    if-ne v3, p4, :cond_15

    .line 311
    .line 312
    move p4, p0

    .line 313
    goto :goto_a

    .line 314
    :cond_15
    move p4, v2

    .line 315
    :goto_a
    if-eqz p4, :cond_17

    .line 316
    .line 317
    invoke-virtual {v0}, La/gl80;->d()I

    .line 318
    .line 319
    .line 320
    move-result p4

    .line 321
    sub-int/2addr p4, p0

    .line 322
    if-ne p2, p4, :cond_16

    .line 323
    .line 324
    goto :goto_b

    .line 325
    :cond_16
    move p0, v2

    .line 326
    :cond_17
    :goto_b
    invoke-virtual {v0, p2}, La/gl80;->B(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p4

    .line 330
    instance-of p4, p4, La/tjz;

    .line 331
    .line 332
    if-nez p4, :cond_18

    .line 333
    .line 334
    invoke-virtual {v0, p2}, La/gl80;->B(I)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p4

    .line 338
    instance-of p4, p4, La/ogs0;

    .line 339
    .line 340
    if-eqz p4, :cond_1a

    .line 341
    .line 342
    :cond_18
    invoke-virtual {p3, p2, v2}, Landroidx/recyclerview/widget/RecyclerView;->P(IZ)La/xhe0;

    .line 343
    .line 344
    .line 345
    move-result-object p2

    .line 346
    instance-of p3, p2, La/czx;

    .line 347
    .line 348
    if-eqz p3, :cond_19

    .line 349
    .line 350
    move-object v1, p2

    .line 351
    check-cast v1, La/czx;

    .line 352
    .line 353
    :cond_19
    if-nez v1, :cond_1b

    .line 354
    .line 355
    :cond_1a
    :goto_c
    return-void

    .line 356
    :cond_1b
    invoke-interface {v1, p1, p0}, La/czx;->a(ZZ)V

    .line 357
    .line 358
    .line 359
    return-void
.end method
