.class public final La/ayf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yjj0;


# instance fields
.field public final a:La/ene;

.field public final b:La/ene;

.field public final c:La/ene;

.field public final d:La/ene;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, La/qmk;->i:La/zcl;

    .line 2
    .line 3
    sget-object v1, La/qmk;->a:La/zcl;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, La/ayf;->a:La/ene;

    .line 9
    .line 10
    iput-object v0, p0, La/ayf;->b:La/ene;

    .line 11
    .line 12
    iput-object v1, p0, La/ayf;->c:La/ene;

    .line 13
    .line 14
    iput-object v1, p0, La/ayf;->d:La/ene;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(JLa/k6z;La/w6k;)La/x1x;
    .locals 11

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, La/k6z;->a:La/k6z;

    .line 8
    .line 9
    iget-object v1, p0, La/ayf;->d:La/ene;

    .line 10
    .line 11
    iget-object v2, p0, La/ayf;->c:La/ene;

    .line 12
    .line 13
    iget-object v3, p0, La/ayf;->b:La/ene;

    .line 14
    .line 15
    iget-object p0, p0, La/ayf;->a:La/ene;

    .line 16
    .line 17
    if-ne p3, v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0, p1, p2, p4}, La/ene;->a(JLa/w6k;)F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {v3, p1, p2, p4}, La/ene;->a(JLa/w6k;)F

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-interface {v2, p1, p2, p4}, La/ene;->a(JLa/w6k;)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v1, p1, p2, p4}, La/ene;->a(JLa/w6k;)F

    .line 44
    .line 45
    .line 46
    move-result p4

    .line 47
    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 48
    .line 49
    .line 50
    move-result-object p4

    .line 51
    filled-new-array {p0, p3, v0, p4}, [Ljava/lang/Float;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-interface {v2, p1, p2, p4}, La/ene;->a(JLa/w6k;)F

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    invoke-interface {v1, p1, p2, p4}, La/ene;->a(JLa/w6k;)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {p0, p1, p2, p4}, La/ene;->a(JLa/w6k;)F

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-interface {v3, p1, p2, p4}, La/ene;->a(JLa/w6k;)F

    .line 85
    .line 86
    .line 87
    move-result p4

    .line 88
    invoke-static {p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    filled-new-array {p3, v0, p0, p4}, [Ljava/lang/Float;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    :goto_0
    const/4 p3, 0x0

    .line 101
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p4

    .line 105
    check-cast p4, Ljava/lang/Number;

    .line 106
    .line 107
    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    .line 108
    .line 109
    .line 110
    move-result p4

    .line 111
    const/4 v0, 0x1

    .line 112
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Ljava/lang/Number;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    const/4 v1, 0x2

    .line 123
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    check-cast v1, Ljava/lang/Number;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    const/4 v2, 0x3

    .line 134
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    check-cast p0, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    invoke-static {}, La/z03;->a()La/w03;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    iget-object v3, v2, La/w03;->a:Landroid/graphics/Path;

    .line 149
    .line 150
    const/4 v4, 0x0

    .line 151
    invoke-virtual {v2, p4, v4}, La/w03;->f(FF)V

    .line 152
    .line 153
    .line 154
    const/16 v5, 0x20

    .line 155
    .line 156
    shr-long v5, p1, v5

    .line 157
    .line 158
    long-to-int v5, v5

    .line 159
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    sub-float/2addr v6, v1

    .line 164
    invoke-virtual {v2, v6, v4}, La/w03;->e(FF)V

    .line 165
    .line 166
    .line 167
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    const/high16 v7, 0x40000000    # 2.0f

    .line 172
    .line 173
    mul-float/2addr v1, v7

    .line 174
    sub-float/2addr v6, v1

    .line 175
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    iget-object v9, v2, La/w03;->b:Landroid/graphics/RectF;

    .line 180
    .line 181
    if-nez v9, :cond_1

    .line 182
    .line 183
    new-instance v9, Landroid/graphics/RectF;

    .line 184
    .line 185
    invoke-direct {v9}, Landroid/graphics/RectF;-><init>()V

    .line 186
    .line 187
    .line 188
    iput-object v9, v2, La/w03;->b:Landroid/graphics/RectF;

    .line 189
    .line 190
    :cond_1
    invoke-virtual {v9, v6, v4, v8, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 191
    .line 192
    .line 193
    iget-object v1, v2, La/w03;->b:Landroid/graphics/RectF;

    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    const/high16 v6, 0x43870000    # 270.0f

    .line 199
    .line 200
    const/high16 v8, 0x42b40000    # 90.0f

    .line 201
    .line 202
    invoke-virtual {v3, v1, v6, v8, p3}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 203
    .line 204
    .line 205
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    const-wide v9, 0xffffffffL

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    and-long/2addr p1, v9

    .line 215
    long-to-int p1, p1

    .line 216
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    sub-float/2addr p2, p0

    .line 221
    invoke-virtual {v2, v1, p2}, La/w03;->e(FF)V

    .line 222
    .line 223
    .line 224
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    mul-float/2addr p0, v7

    .line 229
    sub-float/2addr p2, p0

    .line 230
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    sub-float/2addr v1, p0

    .line 235
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 236
    .line 237
    .line 238
    move-result p0

    .line 239
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    iget-object v6, v2, La/w03;->b:Landroid/graphics/RectF;

    .line 244
    .line 245
    if-nez v6, :cond_2

    .line 246
    .line 247
    new-instance v6, Landroid/graphics/RectF;

    .line 248
    .line 249
    invoke-direct {v6}, Landroid/graphics/RectF;-><init>()V

    .line 250
    .line 251
    .line 252
    iput-object v6, v2, La/w03;->b:Landroid/graphics/RectF;

    .line 253
    .line 254
    :cond_2
    invoke-virtual {v6, p2, v1, p0, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 255
    .line 256
    .line 257
    iget-object p0, v2, La/w03;->b:Landroid/graphics/RectF;

    .line 258
    .line 259
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v3, p0, v4, v8, p3}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 263
    .line 264
    .line 265
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 266
    .line 267
    .line 268
    move-result p0

    .line 269
    invoke-virtual {v2, v0, p0}, La/w03;->e(FF)V

    .line 270
    .line 271
    .line 272
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 273
    .line 274
    .line 275
    move-result p0

    .line 276
    mul-float/2addr v0, v7

    .line 277
    sub-float/2addr p0, v0

    .line 278
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    iget-object p2, v2, La/w03;->b:Landroid/graphics/RectF;

    .line 283
    .line 284
    if-nez p2, :cond_3

    .line 285
    .line 286
    new-instance p2, Landroid/graphics/RectF;

    .line 287
    .line 288
    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    .line 289
    .line 290
    .line 291
    iput-object p2, v2, La/w03;->b:Landroid/graphics/RectF;

    .line 292
    .line 293
    :cond_3
    invoke-virtual {p2, v4, p0, v0, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 294
    .line 295
    .line 296
    iget-object p0, v2, La/w03;->b:Landroid/graphics/RectF;

    .line 297
    .line 298
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v3, p0, v8, v8, p3}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2, v4, p4}, La/w03;->e(FF)V

    .line 305
    .line 306
    .line 307
    mul-float/2addr v7, p4

    .line 308
    iget-object p0, v2, La/w03;->b:Landroid/graphics/RectF;

    .line 309
    .line 310
    if-nez p0, :cond_4

    .line 311
    .line 312
    new-instance p0, Landroid/graphics/RectF;

    .line 313
    .line 314
    invoke-direct {p0}, Landroid/graphics/RectF;-><init>()V

    .line 315
    .line 316
    .line 317
    iput-object p0, v2, La/w03;->b:Landroid/graphics/RectF;

    .line 318
    .line 319
    :cond_4
    invoke-virtual {p0, v4, v4, v7, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 320
    .line 321
    .line 322
    iget-object p0, v2, La/w03;->b:Landroid/graphics/RectF;

    .line 323
    .line 324
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    const/high16 p1, 0x43340000    # 180.0f

    .line 328
    .line 329
    invoke-virtual {v3, p0, p1, v8, p3}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, La/w03;->c()V

    .line 333
    .line 334
    .line 335
    new-instance p0, La/ne80;

    .line 336
    .line 337
    invoke-direct {p0, v2}, La/ne80;-><init>(La/w03;)V

    .line 338
    .line 339
    .line 340
    return-object p0
.end method
