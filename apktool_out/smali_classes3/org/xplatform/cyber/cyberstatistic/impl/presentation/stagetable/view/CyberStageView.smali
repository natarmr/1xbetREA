.class public final Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic l1:I


# instance fields
.field public A:I

.field public B:I

.field public final a:Z

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public f1:I

.field public final g:I

.field public g1:I

.field public final h:I

.field public final h1:Landroid/graphics/Rect;

.field public final i:I

.field public final i1:Landroid/graphics/Rect;

.field public final j:I

.field public final j1:Landroid/text/TextPaint;

.field public final k:Ljava/util/ArrayList;

.field public final k1:Landroid/text/TextPaint;

.field public final l:Ljava/util/ArrayList;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ljava/util/ArrayList;

.field public final o:Ljava/util/LinkedHashMap;

.field public final p:La/s1g;

.field public final q:La/s1g;

.field public final r:Ljava/util/ArrayList;

.field public final s:Ljava/util/ArrayList;

.field public final t:Ljava/util/ArrayList;

.field public final u:Ljava/util/LinkedHashMap;

.field public final v:Ljava/util/ArrayList;

.field public final w:Ljava/util/ArrayList;

.field public final x:Ljava/util/LinkedHashMap;

.field public final y:Ljava/util/ArrayList;

.field public final z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 355
    invoke-direct {p0, p1, v0}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const/4 v0, 0x0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-ne p2, v1, :cond_0

    .line 22
    .line 23
    move p2, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p2, v0

    .line 26
    :goto_0
    iput-boolean p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->a:Z

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const v2, 0x7f070705

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iput p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->b:I

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const v2, 0x7f070717

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    iput p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->c:I

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    const v3, 0x7f070722

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    iput v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->d:I

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const v3, 0x7f07072d

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    iput v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->e:I

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const v3, 0x7f070656

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    iput v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->f:I

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const v3, 0x7f070685

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    iput v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g:I

    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    const v4, 0x7f0706a3

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    iput v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->h:I

    .line 118
    .line 119
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    const v4, 0x7f0706cf

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    iput v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->i:I

    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    const v4, 0x7f0700ad

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    iput v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->j:I

    .line 144
    .line 145
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    const v5, 0x7f070748

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    int-to-float v4, v4

    .line 157
    new-instance v5, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .line 161
    .line 162
    iput-object v5, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->k:Ljava/util/ArrayList;

    .line 163
    .line 164
    new-instance v5, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 167
    .line 168
    .line 169
    iput-object v5, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->l:Ljava/util/ArrayList;

    .line 170
    .line 171
    new-instance v5, Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 174
    .line 175
    .line 176
    iput-object v5, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->m:Ljava/util/ArrayList;

    .line 177
    .line 178
    new-instance v5, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    iput-object v5, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->n:Ljava/util/ArrayList;

    .line 184
    .line 185
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 186
    .line 187
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 188
    .line 189
    .line 190
    iput-object v5, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->o:Ljava/util/LinkedHashMap;

    .line 191
    .line 192
    new-instance v5, La/s1g;

    .line 193
    .line 194
    const v6, 0x7f0606de

    .line 195
    .line 196
    .line 197
    invoke-direct {v5, p0, v6}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 198
    .line 199
    .line 200
    int-to-float v3, v3

    .line 201
    invoke-virtual {v5, v3}, La/s1g;->c(F)V

    .line 202
    .line 203
    .line 204
    iput-object v5, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->p:La/s1g;

    .line 205
    .line 206
    new-instance v5, La/s1g;

    .line 207
    .line 208
    invoke-direct {v5, p0, v6}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v5, v3}, La/s1g;->c(F)V

    .line 212
    .line 213
    .line 214
    iput-object v5, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->q:La/s1g;

    .line 215
    .line 216
    new-instance v3, Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 219
    .line 220
    .line 221
    iput-object v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->r:Ljava/util/ArrayList;

    .line 222
    .line 223
    new-instance v3, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 226
    .line 227
    .line 228
    iput-object v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->s:Ljava/util/ArrayList;

    .line 229
    .line 230
    new-instance v3, Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 233
    .line 234
    .line 235
    iput-object v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->t:Ljava/util/ArrayList;

    .line 236
    .line 237
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 238
    .line 239
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 240
    .line 241
    .line 242
    iput-object v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->u:Ljava/util/LinkedHashMap;

    .line 243
    .line 244
    new-instance v3, Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 247
    .line 248
    .line 249
    iput-object v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->v:Ljava/util/ArrayList;

    .line 250
    .line 251
    new-instance v3, Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 254
    .line 255
    .line 256
    iput-object v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->w:Ljava/util/ArrayList;

    .line 257
    .line 258
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 259
    .line 260
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 261
    .line 262
    .line 263
    iput-object v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->x:Ljava/util/LinkedHashMap;

    .line 264
    .line 265
    new-instance v3, Ljava/util/ArrayList;

    .line 266
    .line 267
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 268
    .line 269
    .line 270
    iput-object v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->y:Ljava/util/ArrayList;

    .line 271
    .line 272
    add-int/2addr v2, p2

    .line 273
    iput v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->z:I

    .line 274
    .line 275
    new-instance p2, Landroid/graphics/Rect;

    .line 276
    .line 277
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 278
    .line 279
    .line 280
    iput-object p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->h1:Landroid/graphics/Rect;

    .line 281
    .line 282
    new-instance p2, Landroid/graphics/Rect;

    .line 283
    .line 284
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 285
    .line 286
    .line 287
    iput-object p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->i1:Landroid/graphics/Rect;

    .line 288
    .line 289
    new-instance p2, Landroid/text/TextPaint;

    .line 290
    .line 291
    invoke-direct {p2}, Landroid/text/TextPaint;-><init>()V

    .line 292
    .line 293
    .line 294
    const v2, 0x7f14045b

    .line 295
    .line 296
    .line 297
    invoke-static {p2, p1, v2}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 301
    .line 302
    .line 303
    sget-object v3, La/j5d;->a:Landroid/util/TypedValue;

    .line 304
    .line 305
    const v3, 0x7f0606da

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1, v3}, Landroid/content/Context;->getColor(I)I

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    invoke-virtual {p2, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p2, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 316
    .line 317
    .line 318
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 319
    .line 320
    invoke-virtual {p2, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 321
    .line 322
    .line 323
    iput-object p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->j1:Landroid/text/TextPaint;

    .line 324
    .line 325
    new-instance p2, Landroid/text/TextPaint;

    .line 326
    .line 327
    invoke-direct {p2}, Landroid/text/TextPaint;-><init>()V

    .line 328
    .line 329
    .line 330
    invoke-static {p2, p1, v2}, La/r7x;->r(Landroid/text/TextPaint;Landroid/content/Context;I)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p1, v3}, Landroid/content/Context;->getColor(I)I

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {p2, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p2, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 347
    .line 348
    .line 349
    iput-object p2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->k1:Landroid/text/TextPaint;

    .line 350
    .line 351
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 352
    .line 353
    .line 354
    return-void
.end method

.method private final getTotalHeight()I
    .locals 3

    .line 1
    iget v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->f1:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g:I

    .line 6
    .line 7
    mul-int/2addr v1, v2

    .line 8
    iget p0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->c:I

    .line 9
    .line 10
    invoke-static {p0, v0, p0, v1}, La/vqd;->a(IIII)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;IFFLandroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->j1:Landroid/text/TextPaint;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    iget-object v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->h1:Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-virtual {v1, p1, v2, v0, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-boolean v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->a:Z

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    int-to-float v2, v0

    .line 22
    sub-float/2addr p3, v2

    .line 23
    sub-int/2addr p2, v0

    .line 24
    div-int/lit8 p2, p2, 0x2

    .line 25
    .line 26
    int-to-float p2, p2

    .line 27
    sub-float/2addr p3, p2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sub-int/2addr p2, v0

    .line 34
    div-int/lit8 p2, p2, 0x2

    .line 35
    .line 36
    int-to-float p2, p2

    .line 37
    add-float/2addr p3, p2

    .line 38
    :goto_0
    iget p0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g:I

    .line 39
    .line 40
    div-int/lit8 p0, p0, 0x2

    .line 41
    .line 42
    int-to-float p0, p0

    .line 43
    add-float/2addr p4, p0

    .line 44
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    div-int/lit8 p0, p0, 0x2

    .line 49
    .line 50
    int-to-float p0, p0

    .line 51
    add-float/2addr p4, p0

    .line 52
    invoke-virtual {p5, p1, p3, p4, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 9
    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object v7

    .line 16
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->p:La/s1g;

    .line 17
    .line 18
    invoke-virtual {v1, v5}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v8, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->a:Z

    .line 22
    .line 23
    if-eqz v8, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v1, v7

    .line 35
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const v3, 0x7f130e4a

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    move-object v1, v2

    .line 54
    iget v2, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g:I

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-virtual/range {v0 .. v5}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->a(Ljava/lang/String;IFFLandroid/graphics/Canvas;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5}, Landroid/graphics/Canvas;->save()I

    .line 61
    .line 62
    .line 63
    iget v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->e:I

    .line 64
    .line 65
    iget v2, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g:I

    .line 66
    .line 67
    iget v3, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->d:I

    .line 68
    .line 69
    if-eqz v8, :cond_1

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    add-int/2addr v2, v3

    .line 76
    add-int/2addr v2, v1

    .line 77
    sub-int/2addr v4, v2

    .line 78
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->h1:Landroid/graphics/Rect;

    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    sub-int/2addr v4, v1

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    add-int/2addr v2, v3

    .line 87
    add-int v4, v2, v1

    .line 88
    .line 89
    :goto_1
    int-to-float v1, v4

    .line 90
    int-to-float v2, v3

    .line 91
    invoke-virtual {v5, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_2

    .line 99
    .line 100
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 101
    .line 102
    :goto_2
    move-object v15, v1

    .line 103
    goto :goto_3

    .line 104
    :cond_2
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const v2, 0x7f13149e

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    sget-object v13, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    const/4 v14, 0x0

    .line 128
    const/16 v16, 0x5f0

    .line 129
    .line 130
    iget-object v10, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->j1:Landroid/text/TextPaint;

    .line 131
    .line 132
    const/4 v12, 0x1

    .line 133
    invoke-static/range {v9 .. v16}, La/xdx;->I(Ljava/lang/CharSequence;Landroid/text/TextPaint;IILandroid/text/TextUtils$TruncateAt;ILandroid/text/Layout$Alignment;I)Landroid/text/StaticLayout;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1, v5}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v5}, Landroid/graphics/Canvas;->restore()V

    .line 141
    .line 142
    .line 143
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->q:La/s1g;

    .line 144
    .line 145
    invoke-virtual {v1, v5}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 146
    .line 147
    .line 148
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->r:Ljava/util/ArrayList;

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_3

    .line 159
    .line 160
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, La/s1g;

    .line 165
    .line 166
    invoke-virtual {v2, v5}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 167
    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_3
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->k:Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    const/4 v10, 0x0

    .line 177
    move v1, v10

    .line 178
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    iget-object v11, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->y:Ljava/util/ArrayList;

    .line 183
    .line 184
    const/4 v12, 0x0

    .line 185
    if-eqz v2, :cond_7

    .line 186
    .line 187
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    add-int/lit8 v13, v1, 0x1

    .line 192
    .line 193
    if-ltz v1, :cond_6

    .line 194
    .line 195
    check-cast v2, Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    check-cast v3, Ljava/lang/Number;

    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    iget-object v4, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->v:Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    check-cast v1, La/qab;

    .line 214
    .line 215
    if-eqz v1, :cond_4

    .line 216
    .line 217
    iget v4, v1, La/qab;->a:F

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_4
    move v4, v6

    .line 221
    :goto_6
    if-eqz v1, :cond_5

    .line 222
    .line 223
    iget v1, v1, La/qab;->b:F

    .line 224
    .line 225
    move/from16 v17, v4

    .line 226
    .line 227
    move v4, v1

    .line 228
    move-object v1, v2

    .line 229
    move v2, v3

    .line 230
    move/from16 v3, v17

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_5
    move-object v1, v2

    .line 234
    move v2, v3

    .line 235
    move v3, v4

    .line 236
    move v4, v6

    .line 237
    :goto_7
    invoke-virtual/range {v0 .. v5}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->a(Ljava/lang/String;IFFLandroid/graphics/Canvas;)V

    .line 238
    .line 239
    .line 240
    move v1, v13

    .line 241
    goto :goto_5

    .line 242
    :cond_6
    invoke-static {}, La/q3d;->p()V

    .line 243
    .line 244
    .line 245
    throw v12

    .line 246
    :cond_7
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->u:Ljava/util/LinkedHashMap;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    check-cast v1, Ljava/lang/Iterable;

    .line 253
    .line 254
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    if-eqz v2, :cond_9

    .line 263
    .line 264
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    check-cast v2, Ljava/util/Map$Entry;

    .line 269
    .line 270
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    check-cast v2, Ljava/util/List;

    .line 275
    .line 276
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-eqz v3, :cond_8

    .line 285
    .line 286
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    check-cast v3, La/s1g;

    .line 291
    .line 292
    invoke-virtual {v3, v5}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 293
    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_9
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->s:Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    if-eqz v2, :cond_a

    .line 307
    .line 308
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    check-cast v2, La/s1g;

    .line 313
    .line 314
    invoke-virtual {v2, v5}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 315
    .line 316
    .line 317
    goto :goto_9

    .line 318
    :cond_a
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->t:Ljava/util/ArrayList;

    .line 319
    .line 320
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    if-eqz v2, :cond_b

    .line 329
    .line 330
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    check-cast v2, La/s1g;

    .line 335
    .line 336
    invoke-virtual {v2, v5}, La/s1g;->a(Landroid/graphics/Canvas;)V

    .line 337
    .line 338
    .line 339
    goto :goto_a

    .line 340
    :cond_b
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->l:Ljava/util/ArrayList;

    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 343
    .line 344
    .line 345
    move-result-object v9

    .line 346
    move v1, v10

    .line 347
    :goto_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    if-eqz v2, :cond_e

    .line 352
    .line 353
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    add-int/lit8 v13, v1, 0x1

    .line 358
    .line 359
    if-ltz v1, :cond_d

    .line 360
    .line 361
    check-cast v2, Ljava/lang/String;

    .line 362
    .line 363
    if-eqz v8, :cond_c

    .line 364
    .line 365
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    goto :goto_c

    .line 374
    :cond_c
    move-object v3, v7

    .line 375
    :goto_c
    iget v4, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->c:I

    .line 376
    .line 377
    move v14, v1

    .line 378
    move-object v1, v2

    .line 379
    iget v2, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g:I

    .line 380
    .line 381
    add-int/2addr v4, v2

    .line 382
    mul-int/2addr v4, v14

    .line 383
    iget v14, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->z:I

    .line 384
    .line 385
    add-int/2addr v4, v14

    .line 386
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    int-to-float v4, v4

    .line 391
    invoke-virtual/range {v0 .. v5}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->a(Ljava/lang/String;IFFLandroid/graphics/Canvas;)V

    .line 392
    .line 393
    .line 394
    move-object/from16 v5, p1

    .line 395
    .line 396
    move v1, v13

    .line 397
    goto :goto_b

    .line 398
    :cond_d
    invoke-static {}, La/q3d;->p()V

    .line 399
    .line 400
    .line 401
    throw v12

    .line 402
    :cond_e
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->o:Ljava/util/LinkedHashMap;

    .line 403
    .line 404
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    check-cast v1, Ljava/lang/Iterable;

    .line 409
    .line 410
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    :goto_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    if-eqz v1, :cond_14

    .line 419
    .line 420
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    check-cast v1, Ljava/util/Map$Entry;

    .line 425
    .line 426
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    check-cast v2, Ljava/lang/Number;

    .line 431
    .line 432
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 433
    .line 434
    .line 435
    move-result v8

    .line 436
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    check-cast v1, Ljava/util/List;

    .line 441
    .line 442
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 443
    .line 444
    .line 445
    move-result-object v9

    .line 446
    move v1, v10

    .line 447
    :goto_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    if-eqz v2, :cond_13

    .line 452
    .line 453
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    add-int/lit8 v13, v1, 0x1

    .line 458
    .line 459
    if-ltz v1, :cond_12

    .line 460
    .line 461
    check-cast v2, Ljava/lang/String;

    .line 462
    .line 463
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    check-cast v3, Ljava/lang/Number;

    .line 468
    .line 469
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 470
    .line 471
    .line 472
    move-result v3

    .line 473
    iget-object v4, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->x:Ljava/util/LinkedHashMap;

    .line 474
    .line 475
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 476
    .line 477
    .line 478
    move-result-object v5

    .line 479
    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v4

    .line 483
    check-cast v4, Ljava/util/List;

    .line 484
    .line 485
    if-eqz v4, :cond_f

    .line 486
    .line 487
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v1

    .line 491
    check-cast v1, La/qab;

    .line 492
    .line 493
    goto :goto_f

    .line 494
    :cond_f
    move-object v1, v12

    .line 495
    :goto_f
    if-eqz v1, :cond_10

    .line 496
    .line 497
    iget v4, v1, La/qab;->a:F

    .line 498
    .line 499
    goto :goto_10

    .line 500
    :cond_10
    move v4, v6

    .line 501
    :goto_10
    if-eqz v1, :cond_11

    .line 502
    .line 503
    iget v1, v1, La/qab;->b:F

    .line 504
    .line 505
    move v5, v4

    .line 506
    move v4, v1

    .line 507
    move-object v1, v2

    .line 508
    move v2, v3

    .line 509
    move v3, v5

    .line 510
    :goto_11
    move-object/from16 v5, p1

    .line 511
    .line 512
    goto :goto_12

    .line 513
    :cond_11
    move-object v1, v2

    .line 514
    move v2, v3

    .line 515
    move v3, v4

    .line 516
    move v4, v6

    .line 517
    goto :goto_11

    .line 518
    :goto_12
    invoke-virtual/range {v0 .. v5}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->a(Ljava/lang/String;IFFLandroid/graphics/Canvas;)V

    .line 519
    .line 520
    .line 521
    move v1, v13

    .line 522
    goto :goto_e

    .line 523
    :cond_12
    invoke-static {}, La/q3d;->p()V

    .line 524
    .line 525
    .line 526
    throw v12

    .line 527
    :cond_13
    move-object/from16 v5, p1

    .line 528
    .line 529
    goto :goto_d

    .line 530
    :cond_14
    move-object/from16 v5, p1

    .line 531
    .line 532
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->n:Ljava/util/ArrayList;

    .line 533
    .line 534
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    if-eqz v2, :cond_18

    .line 543
    .line 544
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    add-int/lit8 v3, v10, 0x1

    .line 549
    .line 550
    if-ltz v10, :cond_17

    .line 551
    .line 552
    check-cast v2, Ljava/lang/String;

    .line 553
    .line 554
    iget v4, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->A:I

    .line 555
    .line 556
    int-to-float v4, v4

    .line 557
    sget-object v7, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 558
    .line 559
    iget-object v8, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->k1:Landroid/text/TextPaint;

    .line 560
    .line 561
    invoke-static {v2, v8, v4, v7}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    iget-object v4, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->w:Ljava/util/ArrayList;

    .line 570
    .line 571
    invoke-static {v10, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    check-cast v4, La/qab;

    .line 576
    .line 577
    if-eqz v4, :cond_15

    .line 578
    .line 579
    iget v7, v4, La/qab;->a:F

    .line 580
    .line 581
    goto :goto_14

    .line 582
    :cond_15
    move v7, v6

    .line 583
    :goto_14
    if-eqz v4, :cond_16

    .line 584
    .line 585
    iget v4, v4, La/qab;->b:F

    .line 586
    .line 587
    goto :goto_15

    .line 588
    :cond_16
    move v4, v6

    .line 589
    :goto_15
    invoke-virtual {v5, v2, v7, v4, v8}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 590
    .line 591
    .line 592
    move v10, v3

    .line 593
    goto :goto_13

    .line 594
    :cond_17
    invoke-static {}, La/q3d;->p()V

    .line 595
    .line 596
    .line 597
    throw v12

    .line 598
    :cond_18
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->B:I

    .line 8
    .line 9
    sub-int v6, v1, v2

    .line 10
    .line 11
    new-instance v5, La/qfh;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    invoke-direct {v5, v0, v7}, La/qfh;-><init>(Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;B)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    iget v3, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g:I

    .line 20
    .line 21
    move v4, v3

    .line 22
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 23
    .line 24
    .line 25
    iget v8, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g:I

    .line 26
    .line 27
    iget v9, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->d:I

    .line 28
    .line 29
    add-int v1, v8, v9

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget v3, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->B:I

    .line 36
    .line 37
    sub-int/2addr v2, v3

    .line 38
    sub-int v3, v2, v9

    .line 39
    .line 40
    new-instance v5, La/qfh;

    .line 41
    .line 42
    const/4 v10, 0x1

    .line 43
    invoke-direct {v5, v0, v10}, La/qfh;-><init>(Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;B)V

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    iget v4, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g:I

    .line 48
    .line 49
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 50
    .line 51
    .line 52
    move v11, v1

    .line 53
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->r:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v12

    .line 59
    move v1, v6

    .line 60
    move v2, v7

    .line 61
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    const/4 v6, 0x0

    .line 66
    iget-boolean v13, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->a:Z

    .line 67
    .line 68
    iget-object v14, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->y:Ljava/util/ArrayList;

    .line 69
    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    add-int/lit8 v15, v2, 0x1

    .line 77
    .line 78
    if-ltz v2, :cond_1

    .line 79
    .line 80
    check-cast v3, La/s1g;

    .line 81
    .line 82
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Ljava/lang/Number;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    add-int v2, v1, v6

    .line 93
    .line 94
    new-instance v4, La/qab;

    .line 95
    .line 96
    if-eqz v13, :cond_0

    .line 97
    .line 98
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    sub-int/2addr v5, v1

    .line 103
    int-to-float v5, v5

    .line 104
    goto :goto_1

    .line 105
    :cond_0
    int-to-float v5, v1

    .line 106
    :goto_1
    const/4 v13, 0x0

    .line 107
    invoke-direct {v4, v5, v13}, La/qab;-><init>(FF)V

    .line 108
    .line 109
    .line 110
    iget-object v5, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->v:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    new-instance v5, La/pfh;

    .line 116
    .line 117
    const/4 v4, 0x2

    .line 118
    invoke-direct {v5, v3, v4}, La/pfh;-><init>(La/s1g;B)V

    .line 119
    .line 120
    .line 121
    move v3, v2

    .line 122
    const/4 v2, 0x0

    .line 123
    iget v4, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g:I

    .line 124
    .line 125
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 126
    .line 127
    .line 128
    add-int/2addr v6, v9

    .line 129
    add-int/2addr v1, v6

    .line 130
    move v2, v15

    .line 131
    goto :goto_0

    .line 132
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 133
    .line 134
    .line 135
    throw v6

    .line 136
    :cond_2
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->t:Ljava/util/ArrayList;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    move v1, v7

    .line 143
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    iget v15, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->c:I

    .line 148
    .line 149
    iget v3, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->z:I

    .line 150
    .line 151
    if-eqz v2, :cond_4

    .line 152
    .line 153
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    add-int/lit8 v16, v1, 0x1

    .line 158
    .line 159
    if-ltz v1, :cond_3

    .line 160
    .line 161
    check-cast v2, La/s1g;

    .line 162
    .line 163
    move v4, v3

    .line 164
    iget v3, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g:I

    .line 165
    .line 166
    add-int/2addr v15, v3

    .line 167
    mul-int/2addr v15, v1

    .line 168
    add-int/2addr v15, v4

    .line 169
    add-int v4, v15, v3

    .line 170
    .line 171
    new-instance v5, La/pfh;

    .line 172
    .line 173
    invoke-direct {v5, v2, v7}, La/pfh;-><init>(La/s1g;B)V

    .line 174
    .line 175
    .line 176
    const/4 v1, 0x0

    .line 177
    move v2, v15

    .line 178
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 179
    .line 180
    .line 181
    move/from16 v1, v16

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 185
    .line 186
    .line 187
    throw v6

    .line 188
    :cond_4
    move v4, v3

    .line 189
    add-int v12, v4, v15

    .line 190
    .line 191
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->m:Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v16

    .line 197
    move v1, v7

    .line 198
    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_6

    .line 203
    .line 204
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    add-int/lit8 v17, v1, 0x1

    .line 209
    .line 210
    if-ltz v1, :cond_5

    .line 211
    .line 212
    check-cast v2, Landroid/widget/ImageView;

    .line 213
    .line 214
    add-int v3, v11, v9

    .line 215
    .line 216
    add-int v5, v8, v15

    .line 217
    .line 218
    mul-int/2addr v5, v1

    .line 219
    add-int v1, v5, v12

    .line 220
    .line 221
    iget v5, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->f:I

    .line 222
    .line 223
    move/from16 v18, v4

    .line 224
    .line 225
    move-object v4, v2

    .line 226
    add-int v2, v3, v5

    .line 227
    .line 228
    add-int/2addr v5, v1

    .line 229
    move/from16 v21, v5

    .line 230
    .line 231
    move-object v5, v0

    .line 232
    move v0, v3

    .line 233
    move/from16 v3, v21

    .line 234
    .line 235
    invoke-static/range {v0 .. v5}, La/cww;->z(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 236
    .line 237
    .line 238
    move-object v0, v5

    .line 239
    move/from16 v1, v17

    .line 240
    .line 241
    move/from16 v4, v18

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 245
    .line 246
    .line 247
    throw v6

    .line 248
    :cond_6
    move/from16 v18, v4

    .line 249
    .line 250
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->s:Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v12

    .line 256
    move v1, v7

    .line 257
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_8

    .line 262
    .line 263
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    add-int/lit8 v16, v1, 0x1

    .line 268
    .line 269
    if-ltz v1, :cond_7

    .line 270
    .line 271
    check-cast v2, La/s1g;

    .line 272
    .line 273
    add-int v3, v8, v15

    .line 274
    .line 275
    mul-int/2addr v3, v1

    .line 276
    add-int v3, v3, v18

    .line 277
    .line 278
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    iget v4, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->B:I

    .line 283
    .line 284
    sub-int/2addr v1, v4

    .line 285
    sub-int/2addr v1, v9

    .line 286
    add-int v4, v3, v8

    .line 287
    .line 288
    new-instance v5, La/pfh;

    .line 289
    .line 290
    invoke-direct {v5, v2, v10}, La/pfh;-><init>(La/s1g;B)V

    .line 291
    .line 292
    .line 293
    move v2, v3

    .line 294
    move v3, v1

    .line 295
    move v1, v11

    .line 296
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 297
    .line 298
    .line 299
    move/from16 v1, v16

    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 303
    .line 304
    .line 305
    throw v6

    .line 306
    :cond_8
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->u:Ljava/util/LinkedHashMap;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 313
    .line 314
    .line 315
    move-result-object v10

    .line 316
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    if-eqz v1, :cond_c

    .line 321
    .line 322
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    check-cast v1, Ljava/util/Map$Entry;

    .line 327
    .line 328
    new-instance v11, Ljava/util/ArrayList;

    .line 329
    .line 330
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    iget v3, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->B:I

    .line 338
    .line 339
    sub-int/2addr v2, v3

    .line 340
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    check-cast v3, Ljava/lang/Number;

    .line 345
    .line 346
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 347
    .line 348
    .line 349
    move-result v12

    .line 350
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    check-cast v1, Ljava/lang/Iterable;

    .line 355
    .line 356
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 357
    .line 358
    .line 359
    move-result-object v16

    .line 360
    move v1, v2

    .line 361
    move v2, v7

    .line 362
    :goto_6
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    if-eqz v3, :cond_b

    .line 367
    .line 368
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    add-int/lit8 v17, v2, 0x1

    .line 373
    .line 374
    if-ltz v2, :cond_a

    .line 375
    .line 376
    check-cast v3, La/s1g;

    .line 377
    .line 378
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    check-cast v2, Ljava/lang/Number;

    .line 383
    .line 384
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 385
    .line 386
    .line 387
    move-result v19

    .line 388
    add-int v2, v1, v19

    .line 389
    .line 390
    add-int v4, v8, v15

    .line 391
    .line 392
    mul-int/2addr v4, v12

    .line 393
    add-int v4, v4, v18

    .line 394
    .line 395
    add-int v5, v4, v8

    .line 396
    .line 397
    move-object/from16 p1, v6

    .line 398
    .line 399
    new-instance v6, La/qab;

    .line 400
    .line 401
    if-eqz v13, :cond_9

    .line 402
    .line 403
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 404
    .line 405
    .line 406
    move-result v20

    .line 407
    sub-int v7, v20, v1

    .line 408
    .line 409
    int-to-float v7, v7

    .line 410
    goto :goto_7

    .line 411
    :cond_9
    int-to-float v7, v1

    .line 412
    :goto_7
    int-to-float v0, v4

    .line 413
    invoke-direct {v6, v7, v0}, La/qab;-><init>(FF)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move v0, v2

    .line 420
    move v2, v4

    .line 421
    move v4, v5

    .line 422
    new-instance v5, La/pfh;

    .line 423
    .line 424
    const/4 v6, 0x3

    .line 425
    invoke-direct {v5, v3, v6}, La/pfh;-><init>(La/s1g;B)V

    .line 426
    .line 427
    .line 428
    move v3, v0

    .line 429
    move-object/from16 v0, p0

    .line 430
    .line 431
    invoke-static/range {v0 .. v5}, La/cww;->B(Landroid/view/ViewGroup;IIIILa/ydr;)V

    .line 432
    .line 433
    .line 434
    add-int v19, v19, v9

    .line 435
    .line 436
    add-int v1, v19, v1

    .line 437
    .line 438
    move-object/from16 v6, p1

    .line 439
    .line 440
    move/from16 v2, v17

    .line 441
    .line 442
    const/4 v7, 0x0

    .line 443
    goto :goto_6

    .line 444
    :cond_a
    move-object/from16 p1, v6

    .line 445
    .line 446
    invoke-static {}, La/q3d;->p()V

    .line 447
    .line 448
    .line 449
    throw p1

    .line 450
    :cond_b
    move-object/from16 p1, v6

    .line 451
    .line 452
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->x:Ljava/util/LinkedHashMap;

    .line 453
    .line 454
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-interface {v1, v2, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    const/4 v7, 0x0

    .line 462
    goto/16 :goto_5

    .line 463
    .line 464
    :cond_c
    return-void
.end method

.method public final onMeasure(II)V
    .locals 13

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0}, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->getTotalHeight()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget-object v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->w:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->n:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget-object v5, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->k1:Landroid/text/TextPaint;

    .line 28
    .line 29
    iget-object v6, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->i1:Landroid/graphics/Rect;

    .line 30
    .line 31
    invoke-virtual {v5, v3, v2, v4, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iget v4, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->i:I

    .line 39
    .line 40
    iget v7, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->B:I

    .line 41
    .line 42
    add-int/2addr v4, v7

    .line 43
    sub-int v4, p1, v4

    .line 44
    .line 45
    iput v4, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->A:I

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move v4, v2

    .line 52
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    if-eqz v7, :cond_2

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    add-int/lit8 v8, v4, 0x1

    .line 63
    .line 64
    if-ltz v4, :cond_1

    .line 65
    .line 66
    check-cast v7, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    invoke-virtual {v5, v7, v2, v9, v6}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    iget v9, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->f:I

    .line 80
    .line 81
    iget v10, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->d:I

    .line 82
    .line 83
    iget-boolean v11, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->a:Z

    .line 84
    .line 85
    iget v12, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g:I

    .line 86
    .line 87
    if-eqz v11, :cond_0

    .line 88
    .line 89
    add-int/2addr v10, v12

    .line 90
    iget v11, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->e:I

    .line 91
    .line 92
    add-int/2addr v10, v11

    .line 93
    add-int/2addr v10, v9

    .line 94
    add-int/2addr v10, v11

    .line 95
    sub-int v9, p1, v10

    .line 96
    .line 97
    sub-int/2addr v9, v7

    .line 98
    goto :goto_1

    .line 99
    :cond_0
    add-int v7, v12, v10

    .line 100
    .line 101
    add-int/2addr v7, v10

    .line 102
    add-int/2addr v7, v9

    .line 103
    add-int v9, v7, v10

    .line 104
    .line 105
    :goto_1
    iget v7, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->c:I

    .line 106
    .line 107
    add-int/2addr v7, v12

    .line 108
    iget v10, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->b:I

    .line 109
    .line 110
    add-int/2addr v10, v12

    .line 111
    mul-int/2addr v7, v4

    .line 112
    add-int/2addr v7, v10

    .line 113
    sub-int/2addr v12, v3

    .line 114
    div-int/lit8 v12, v12, 0x2

    .line 115
    .line 116
    add-int/2addr v12, v7

    .line 117
    add-int/2addr v12, v3

    .line 118
    new-instance v4, La/qab;

    .line 119
    .line 120
    int-to-float v7, v9

    .line 121
    int-to-float v9, v12

    .line 122
    invoke-direct {v4, v7, v9}, La/qab;-><init>(FF)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move v4, v8

    .line 129
    goto :goto_0

    .line 130
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 131
    .line 132
    .line 133
    const/4 p0, 0x0

    .line 134
    throw p0

    .line 135
    :cond_2
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public final setHeaders(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->B:I

    .line 6
    .line 7
    iget-object v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->k:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->r:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iput v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g1:I

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x3

    .line 44
    if-le v4, v5, :cond_1

    .line 45
    .line 46
    iget-boolean v4, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->a:Z

    .line 47
    .line 48
    const-string v6, "..."

    .line 49
    .line 50
    if-eqz v4, :cond_0

    .line 51
    .line 52
    invoke-virtual {v3, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v6, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    goto :goto_1

    .line 61
    :cond_0
    invoke-virtual {v3, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move-object v4, v3

    .line 71
    :goto_1
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    new-instance v4, La/s1g;

    .line 75
    .line 76
    const v6, 0x7f0606de

    .line 77
    .line 78
    .line 79
    invoke-direct {v4, p0, v6}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 80
    .line 81
    .line 82
    iget v6, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->j:I

    .line 83
    .line 84
    int-to-float v6, v6

    .line 85
    invoke-virtual {v4, v6}, La/s1g;->c(F)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-ge v3, v5, :cond_2

    .line 96
    .line 97
    iget v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g:I

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    iget v3, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->h:I

    .line 101
    .line 102
    :goto_2
    iget-object v4, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->y:Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    iget v4, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->B:I

    .line 112
    .line 113
    add-int/2addr v4, v3

    .line 114
    iput v4, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->B:I

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    iget p1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->B:I

    .line 118
    .line 119
    iget v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->g1:I

    .line 120
    .line 121
    add-int/lit8 v0, v0, -0x1

    .line 122
    .line 123
    iget v1, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->d:I

    .line 124
    .line 125
    mul-int/2addr v0, v1

    .line 126
    add-int/2addr v0, p1

    .line 127
    iput v0, p0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->B:I

    .line 128
    .line 129
    return-void
.end method

.method public final setTeams(Ljava/util/List;)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/kfh;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iput v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->f1:I

    .line 11
    .line 12
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->m:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/16 v3, 0xa

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    new-instance v2, Lkotlin/ranges/IntRange;

    .line 25
    .line 26
    iget v6, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->f1:I

    .line 27
    .line 28
    invoke-direct {v2, v5, v6, v4}, Lkotlin/ranges/a;-><init>(III)V

    .line 29
    .line 30
    .line 31
    new-instance v6, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-static {v2, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    :goto_0
    move-object v7, v2

    .line 45
    check-cast v7, La/kkx;

    .line 46
    .line 47
    iget-boolean v7, v7, La/kkx;->c:Z

    .line 48
    .line 49
    if-eqz v7, :cond_0

    .line 50
    .line 51
    move-object v7, v2

    .line 52
    check-cast v7, La/bkx;

    .line 53
    .line 54
    invoke-virtual {v7}, La/bkx;->nextInt()I

    .line 55
    .line 56
    .line 57
    new-instance v7, Landroid/widget/ImageView;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-direct {v7, v8}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-eqz v6, :cond_1

    .line 82
    .line 83
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    check-cast v6, Landroid/widget/ImageView;

    .line 88
    .line 89
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    iget-object v2, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->o:Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V

    .line 96
    .line 97
    .line 98
    iget-object v6, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->u:Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->clear()V

    .line 101
    .line 102
    .line 103
    iget-object v7, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->s:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 106
    .line 107
    .line 108
    iget-object v8, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->t:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 111
    .line 112
    .line 113
    iget-object v9, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->n:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 116
    .line 117
    .line 118
    iget-object v10, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->l:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 121
    .line 122
    .line 123
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    move v12, v5

    .line 128
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v13

    .line 132
    if-eqz v13, :cond_9

    .line 133
    .line 134
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    add-int/lit8 v14, v12, 0x1

    .line 139
    .line 140
    if-ltz v12, :cond_8

    .line 141
    .line 142
    check-cast v13, La/kfh;

    .line 143
    .line 144
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    iget-object v15, v13, La/kfh;->e:Ljava/util/ArrayList;

    .line 149
    .line 150
    new-instance v5, Ljava/util/ArrayList;

    .line 151
    .line 152
    move-object/from16 v16, v11

    .line 153
    .line 154
    invoke-static {v15, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 155
    .line 156
    .line 157
    move-result v11

    .line 158
    invoke-direct {v5, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v15

    .line 169
    iget v3, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->j:I

    .line 170
    .line 171
    if-eqz v15, :cond_2

    .line 172
    .line 173
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v15

    .line 177
    check-cast v15, Ljava/lang/String;

    .line 178
    .line 179
    new-instance v15, La/s1g;

    .line 180
    .line 181
    move-object/from16 v18, v11

    .line 182
    .line 183
    const v11, 0x7f0606a8

    .line 184
    .line 185
    .line 186
    invoke-direct {v15, v0, v11}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 187
    .line 188
    .line 189
    int-to-float v3, v3

    .line 190
    invoke-virtual {v15, v3}, La/s1g;->c(F)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-object/from16 v11, v18

    .line 197
    .line 198
    const/16 v3, 0xa

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_2
    const v11, 0x7f0606a8

    .line 202
    .line 203
    .line 204
    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    new-instance v4, La/s1g;

    .line 208
    .line 209
    invoke-direct {v4, v0, v11}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 210
    .line 211
    .line 212
    int-to-float v3, v3

    .line 213
    invoke-virtual {v4, v3}, La/s1g;->c(F)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    new-instance v4, La/s1g;

    .line 220
    .line 221
    invoke-direct {v4, v0, v11}, La/s1g;-><init>(Landroid/view/View;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, v3}, La/s1g;->c(F)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    sget-object v3, La/u0d;->a:Ljava/util/List;

    .line 231
    .line 232
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    move-object/from16 v17, v3

    .line 237
    .line 238
    check-cast v17, Landroid/widget/ImageView;

    .line 239
    .line 240
    iget-object v3, v13, La/kfh;->c:Ljava/lang/String;

    .line 241
    .line 242
    const/16 v23, 0x0

    .line 243
    .line 244
    const/16 v24, 0x1fc

    .line 245
    .line 246
    const v19, 0x7f080cf7

    .line 247
    .line 248
    .line 249
    const/16 v20, 0x0

    .line 250
    .line 251
    const/16 v21, 0x0

    .line 252
    .line 253
    const/16 v22, 0x0

    .line 254
    .line 255
    move-object/from16 v18, v3

    .line 256
    .line 257
    invoke-static/range {v17 .. v24}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 258
    .line 259
    .line 260
    iget-object v3, v13, La/kfh;->b:Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    iget-object v3, v13, La/kfh;->d:Ljava/lang/String;

    .line 266
    .line 267
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    iget-object v3, v13, La/kfh;->e:Ljava/util/ArrayList;

    .line 271
    .line 272
    new-instance v4, Ljava/util/ArrayList;

    .line 273
    .line 274
    const/16 v5, 0xa

    .line 275
    .line 276
    invoke-static {v3, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 277
    .line 278
    .line 279
    move-result v11

    .line 280
    invoke-direct {v4, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    const/4 v11, 0x0

    .line 288
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 289
    .line 290
    .line 291
    move-result v13

    .line 292
    if-eqz v13, :cond_7

    .line 293
    .line 294
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v13

    .line 298
    add-int/lit8 v15, v11, 0x1

    .line 299
    .line 300
    if-ltz v11, :cond_6

    .line 301
    .line 302
    check-cast v13, Ljava/lang/String;

    .line 303
    .line 304
    iget-object v5, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->j1:Landroid/text/TextPaint;

    .line 305
    .line 306
    invoke-virtual {v5, v13}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 307
    .line 308
    .line 309
    move-object/from16 v17, v1

    .line 310
    .line 311
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    move-object/from16 v18, v3

    .line 316
    .line 317
    const-string v3, "..."

    .line 318
    .line 319
    move-object/from16 v19, v6

    .line 320
    .line 321
    const/4 v6, 0x3

    .line 322
    if-le v1, v6, :cond_4

    .line 323
    .line 324
    iget-boolean v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->a:Z

    .line 325
    .line 326
    if-eqz v1, :cond_3

    .line 327
    .line 328
    const/4 v1, 0x0

    .line 329
    invoke-virtual {v13, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_3
    const/4 v1, 0x0

    .line 338
    invoke-virtual {v13, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    :cond_4
    :goto_5
    iget-object v1, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->y:Ljava/util/ArrayList;

    .line 346
    .line 347
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    check-cast v1, Ljava/lang/Number;

    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    int-to-float v1, v1

    .line 358
    iget v6, v0, Lorg/xplatform/cyber/cyberstatistic/impl/presentation/stagetable/view/CyberStageView;->c:I

    .line 359
    .line 360
    int-to-float v6, v6

    .line 361
    sub-float/2addr v1, v6

    .line 362
    invoke-virtual {v5, v13}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 363
    .line 364
    .line 365
    move-result v6

    .line 366
    cmpg-float v6, v6, v1

    .line 367
    .line 368
    if-gtz v6, :cond_5

    .line 369
    .line 370
    const/4 v5, 0x0

    .line 371
    const/4 v6, 0x1

    .line 372
    const/4 v11, 0x0

    .line 373
    goto :goto_6

    .line 374
    :cond_5
    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    sub-float/2addr v1, v6

    .line 379
    const/4 v6, 0x1

    .line 380
    const/4 v11, 0x0

    .line 381
    invoke-virtual {v5, v13, v6, v1, v11}, Landroid/graphics/Paint;->breakText(Ljava/lang/String;ZF[F)I

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    const/4 v5, 0x0

    .line 386
    invoke-virtual {v13, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v13

    .line 394
    :goto_6
    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move v11, v15

    .line 398
    move-object/from16 v1, v17

    .line 399
    .line 400
    move-object/from16 v3, v18

    .line 401
    .line 402
    move-object/from16 v6, v19

    .line 403
    .line 404
    const/16 v5, 0xa

    .line 405
    .line 406
    goto :goto_4

    .line 407
    :cond_6
    const/4 v11, 0x0

    .line 408
    invoke-static {}, La/q3d;->p()V

    .line 409
    .line 410
    .line 411
    throw v11

    .line 412
    :cond_7
    move-object/from16 v17, v1

    .line 413
    .line 414
    move-object/from16 v19, v6

    .line 415
    .line 416
    const/4 v5, 0x0

    .line 417
    const/4 v6, 0x1

    .line 418
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move v4, v6

    .line 426
    move v12, v14

    .line 427
    move-object/from16 v11, v16

    .line 428
    .line 429
    move-object/from16 v1, v17

    .line 430
    .line 431
    move-object/from16 v6, v19

    .line 432
    .line 433
    const/16 v3, 0xa

    .line 434
    .line 435
    goto/16 :goto_2

    .line 436
    .line 437
    :cond_8
    const/4 v11, 0x0

    .line 438
    invoke-static {}, La/q3d;->p()V

    .line 439
    .line 440
    .line 441
    throw v11

    .line 442
    :cond_9
    return-void
.end method
