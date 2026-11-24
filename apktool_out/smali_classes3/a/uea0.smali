.class public final La/uea0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hlp0;


# instance fields
.field public final a:Landroid/widget/FrameLayout;

.field public final b:La/s1g;

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

.field public final m:Landroid/text/TextPaint;

.field public final n:Landroid/text/TextPaint;

.field public final o:Landroid/graphics/Rect;

.field public final p:Landroid/graphics/Rect;

.field public final q:Landroid/widget/ImageView;

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/String;

.field public u:Ljava/lang/String;

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/widget/FrameLayout;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uea0;->a:Landroid/widget/FrameLayout;

    .line 5
    .line 6
    new-instance v0, La/s1g;

    .line 7
    .line 8
    const v1, 0x7f0606a8

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const v2, 0x7f0700ad

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, La/s1g;->c(F)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/uea0;->b:La/s1g;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const v1, 0x7f0701a1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iput v0, p0, La/uea0;->c:I

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const v1, 0x7f070199

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iput v0, p0, La/uea0;->d:I

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const v1, 0x7f0700ab

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iput v0, p0, La/uea0;->e:I

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const v1, 0x7f070705

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iput v0, p0, La/uea0;->f:I

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const v1, 0x7f070717

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    iput v0, p0, La/uea0;->g:I

    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const v1, 0x7f070722

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iput v0, p0, La/uea0;->h:I

    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    const v1, 0x7f0706ea

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    iput v0, p0, La/uea0;->i:I

    .line 148
    .line 149
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    const v1, 0x7f07074a

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    iput v0, p0, La/uea0;->j:I

    .line 165
    .line 166
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    const v2, 0x7f07075b

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    iput v1, p0, La/uea0;->k:I

    .line 182
    .line 183
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    const v3, 0x7f07064b

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    iput v2, p0, La/uea0;->l:I

    .line 199
    .line 200
    new-instance v2, Landroid/text/TextPaint;

    .line 201
    .line 202
    invoke-direct {v2}, Landroid/text/TextPaint;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    const v4, 0x7f14045b

    .line 213
    .line 214
    .line 215
    invoke-static {v2, v3, v4}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 216
    .line 217
    .line 218
    const/4 v3, 0x1

    .line 219
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    const v5, 0x7f0606da

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 237
    .line 238
    .line 239
    int-to-float v0, v0

    .line 240
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 241
    .line 242
    .line 243
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 244
    .line 245
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 246
    .line 247
    .line 248
    iput-object v2, p0, La/uea0;->m:Landroid/text/TextPaint;

    .line 249
    .line 250
    new-instance v2, Landroid/text/TextPaint;

    .line 251
    .line 252
    invoke-direct {v2}, Landroid/text/TextPaint;-><init>()V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    const v5, 0x7f14046a

    .line 263
    .line 264
    .line 265
    invoke-static {v2, v4, v5}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    const v4, 0x7f0606e1

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, v4}, Landroid/content/Context;->getColor(I)I

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 286
    .line 287
    .line 288
    int-to-float v1, v1

    .line 289
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 293
    .line 294
    .line 295
    iput-object v2, p0, La/uea0;->n:Landroid/text/TextPaint;

    .line 296
    .line 297
    new-instance v0, Landroid/graphics/Rect;

    .line 298
    .line 299
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 300
    .line 301
    .line 302
    iput-object v0, p0, La/uea0;->o:Landroid/graphics/Rect;

    .line 303
    .line 304
    new-instance v0, Landroid/graphics/Rect;

    .line 305
    .line 306
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 307
    .line 308
    .line 309
    iput-object v0, p0, La/uea0;->p:Landroid/graphics/Rect;

    .line 310
    .line 311
    new-instance v0, Landroid/widget/ImageView;

    .line 312
    .line 313
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 318
    .line 319
    .line 320
    iput-object v0, p0, La/uea0;->q:Landroid/widget/ImageView;

    .line 321
    .line 322
    const-string p1, ""

    .line 323
    .line 324
    iput-object p1, p0, La/uea0;->r:Ljava/lang/String;

    .line 325
    .line 326
    iput-object p1, p0, La/uea0;->s:Ljava/lang/String;

    .line 327
    .line 328
    iput-object p1, p0, La/uea0;->t:Ljava/lang/String;

    .line 329
    .line 330
    iput-object p1, p0, La/uea0;->u:Ljava/lang/String;

    .line 331
    .line 332
    return-void
.end method


# virtual methods
.method public final a(IIII)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    sub-int v5, v4, v2

    .line 12
    .line 13
    iget v6, v0, La/uea0;->j:I

    .line 14
    .line 15
    iget v7, v0, La/uea0;->k:I

    .line 16
    .line 17
    add-int/2addr v6, v7

    .line 18
    sub-int/2addr v5, v6

    .line 19
    div-int/lit8 v5, v5, 0x2

    .line 20
    .line 21
    iget-object v6, v0, La/uea0;->a:Landroid/widget/FrameLayout;

    .line 22
    .line 23
    invoke-virtual {v6}, Landroid/view/View;->getLayoutDirection()I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    iget v8, v0, La/uea0;->h:I

    .line 28
    .line 29
    iget v9, v0, La/uea0;->c:I

    .line 30
    .line 31
    iget v10, v0, La/uea0;->g:I

    .line 32
    .line 33
    if-nez v7, :cond_0

    .line 34
    .line 35
    add-int v7, v1, v10

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sub-int v7, v3, v8

    .line 39
    .line 40
    sub-int/2addr v7, v9

    .line 41
    :goto_0
    iget-object v11, v0, La/uea0;->b:La/s1g;

    .line 42
    .line 43
    invoke-virtual {v11, v1, v2, v3, v4}, La/s1g;->b(IIII)V

    .line 44
    .line 45
    .line 46
    add-int v11, v2, v10

    .line 47
    .line 48
    add-int v12, v7, v9

    .line 49
    .line 50
    iget v13, v0, La/uea0;->d:I

    .line 51
    .line 52
    add-int/2addr v13, v11

    .line 53
    iget-object v14, v0, La/uea0;->q:Landroid/widget/ImageView;

    .line 54
    .line 55
    invoke-virtual {v14, v7, v11, v12, v13}, Landroid/view/View;->layout(IIII)V

    .line 56
    .line 57
    .line 58
    iget v7, v0, La/uea0;->z:I

    .line 59
    .line 60
    int-to-float v7, v7

    .line 61
    iget-object v11, v0, La/uea0;->r:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v12, v0, La/uea0;->m:Landroid/text/TextPaint;

    .line 64
    .line 65
    invoke-virtual {v12, v11}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 66
    .line 67
    .line 68
    move-result v11

    .line 69
    cmpg-float v7, v7, v11

    .line 70
    .line 71
    iget-object v11, v0, La/uea0;->r:Ljava/lang/String;

    .line 72
    .line 73
    if-gez v7, :cond_1

    .line 74
    .line 75
    iget v7, v0, La/uea0;->z:I

    .line 76
    .line 77
    int-to-float v7, v7

    .line 78
    sget-object v13, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 79
    .line 80
    invoke-static {v11, v12, v7, v13}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    :cond_1
    iput-object v11, v0, La/uea0;->t:Ljava/lang/String;

    .line 89
    .line 90
    iget v7, v0, La/uea0;->z:I

    .line 91
    .line 92
    int-to-float v7, v7

    .line 93
    iget-object v11, v0, La/uea0;->s:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v13, v0, La/uea0;->n:Landroid/text/TextPaint;

    .line 96
    .line 97
    invoke-virtual {v13, v11}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    cmpg-float v7, v7, v11

    .line 102
    .line 103
    iget-object v11, v0, La/uea0;->s:Ljava/lang/String;

    .line 104
    .line 105
    if-gez v7, :cond_2

    .line 106
    .line 107
    iget v7, v0, La/uea0;->z:I

    .line 108
    .line 109
    int-to-float v7, v7

    .line 110
    sget-object v14, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 111
    .line 112
    invoke-static {v11, v13, v7, v14}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v11

    .line 120
    :cond_2
    iput-object v11, v0, La/uea0;->u:Ljava/lang/String;

    .line 121
    .line 122
    iget-object v7, v0, La/uea0;->r:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    const/4 v14, 0x0

    .line 129
    iget-object v15, v0, La/uea0;->o:Landroid/graphics/Rect;

    .line 130
    .line 131
    invoke-virtual {v12, v7, v14, v11, v15}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 132
    .line 133
    .line 134
    iget-object v7, v0, La/uea0;->s:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    iget-object v2, v0, La/uea0;->p:Landroid/graphics/Rect;

    .line 141
    .line 142
    invoke-virtual {v13, v7, v14, v11, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 143
    .line 144
    .line 145
    iget v7, v0, La/uea0;->l:I

    .line 146
    .line 147
    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    sub-int/2addr v7, v11

    .line 152
    div-int/lit8 v7, v7, 0x2

    .line 153
    .line 154
    invoke-virtual {v6}, Landroid/view/View;->getLayoutDirection()I

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    const/4 v13, 0x1

    .line 159
    if-ne v11, v13, :cond_3

    .line 160
    .line 161
    sub-int v11, v3, v10

    .line 162
    .line 163
    sub-int/2addr v11, v9

    .line 164
    iget-object v14, v0, La/uea0;->t:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v12, v14}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 167
    .line 168
    .line 169
    move-result v12

    .line 170
    float-to-int v12, v12

    .line 171
    sub-int/2addr v11, v12

    .line 172
    sub-int/2addr v11, v8

    .line 173
    sub-int/2addr v11, v10

    .line 174
    goto :goto_1

    .line 175
    :cond_3
    invoke-static {v1, v10, v9, v8}, La/hne;->D(IIII)I

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    :goto_1
    iput v11, v0, La/uea0;->v:I

    .line 180
    .line 181
    add-int v5, p2, v5

    .line 182
    .line 183
    add-int/2addr v5, v7

    .line 184
    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    div-int/lit8 v7, v7, 0x2

    .line 189
    .line 190
    add-int/2addr v7, v5

    .line 191
    iget v5, v0, La/uea0;->f:I

    .line 192
    .line 193
    add-int/2addr v7, v5

    .line 194
    iput v7, v0, La/uea0;->w:I

    .line 195
    .line 196
    invoke-virtual {v6}, Landroid/view/View;->getLayoutDirection()I

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-ne v5, v13, :cond_4

    .line 201
    .line 202
    sub-int v1, v3, v10

    .line 203
    .line 204
    sub-int/2addr v1, v9

    .line 205
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    sub-int/2addr v1, v2

    .line 210
    sub-int/2addr v1, v8

    .line 211
    sub-int/2addr v1, v10

    .line 212
    goto :goto_2

    .line 213
    :cond_4
    invoke-static {v1, v10, v9, v8}, La/hne;->D(IIII)I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    :goto_2
    iput v1, v0, La/uea0;->x:I

    .line 218
    .line 219
    sub-int v1, v4, v10

    .line 220
    .line 221
    iput v1, v0, La/uea0;->y:I

    .line 222
    .line 223
    return-void
.end method

.method public final b(I)V
    .locals 3

    .line 1
    iget v0, p0, La/uea0;->c:I

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v2, p0, La/uea0;->d:I

    .line 10
    .line 11
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, La/uea0;->q:Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-virtual {v2, v0, v1}, Landroid/view/View;->measure(II)V

    .line 18
    .line 19
    .line 20
    iget v0, p0, La/uea0;->g:I

    .line 21
    .line 22
    sub-int/2addr p1, v0

    .line 23
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    sub-int/2addr p1, v1

    .line 28
    iget v1, p0, La/uea0;->i:I

    .line 29
    .line 30
    sub-int/2addr p1, v1

    .line 31
    mul-int/lit8 v0, v0, 0x2

    .line 32
    .line 33
    sub-int/2addr p1, v0

    .line 34
    iput p1, p0, La/uea0;->z:I

    .line 35
    .line 36
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/uea0;->q:Landroid/widget/ImageView;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v8, p0, La/uea0;->a:Landroid/widget/FrameLayout;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 18
    .line 19
    new-instance v1, La/j2x;

    .line 20
    .line 21
    iget v2, p0, La/uea0;->e:I

    .line 22
    .line 23
    invoke-direct {v1, v2}, La/j2x;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const/4 v6, 0x0

    .line 31
    const/16 v7, 0x1ec

    .line 32
    .line 33
    const v2, 0x7f0804b5

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    move-object v1, p1

    .line 39
    invoke-static/range {v0 .. v7}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, La/uea0;->r:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const p2, 0x7f0606da

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iget-object p2, p0, La/uea0;->m:Landroid/text/TextPaint;

    .line 59
    .line 60
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 61
    .line 62
    .line 63
    iget p1, p0, La/uea0;->j:I

    .line 64
    .line 65
    int-to-float p1, p1

    .line 66
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 67
    .line 68
    .line 69
    iput-object p3, p0, La/uea0;->s:Ljava/lang/String;

    .line 70
    .line 71
    return-void
.end method

.method public final k(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/uea0;->b:La/s1g;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/uea0;->t:Ljava/lang/String;

    .line 10
    .line 11
    iget v1, p0, La/uea0;->v:I

    .line 12
    .line 13
    int-to-float v1, v1

    .line 14
    iget v2, p0, La/uea0;->w:I

    .line 15
    .line 16
    int-to-float v2, v2

    .line 17
    iget-object v3, p0, La/uea0;->m:Landroid/text/TextPaint;

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, La/uea0;->u:Ljava/lang/String;

    .line 23
    .line 24
    iget v1, p0, La/uea0;->x:I

    .line 25
    .line 26
    int-to-float v1, v1

    .line 27
    iget v2, p0, La/uea0;->y:I

    .line 28
    .line 29
    int-to-float v2, v2

    .line 30
    iget-object p0, p0, La/uea0;->n:Landroid/text/TextPaint;

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1, v2, p0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
