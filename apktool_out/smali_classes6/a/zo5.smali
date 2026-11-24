.class public final La/zo5;
.super La/lls0;
.source "SourceFile"


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/zo5;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    iget-byte p0, p0, La/zo5;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "CenterInsideCoilTransformation"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "CenterCropCoilTransformation"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "BannerChampionshipTransformCoil"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Landroid/graphics/Bitmap;La/f7k0;)Landroid/graphics/Bitmap;
    .locals 6

    .line 1
    iget-byte p0, p0, La/zo5;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p2, La/f7k0;->a:La/umk;

    .line 9
    .line 10
    instance-of v2, p0, La/rmk;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    check-cast p0, La/rmk;

    .line 15
    .line 16
    iget p0, p0, La/rmk;->a:I

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    :goto_0
    iget-object p2, p2, La/f7k0;->b:La/umk;

    .line 24
    .line 25
    instance-of v2, p2, La/rmk;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    check-cast p2, La/rmk;

    .line 30
    .line 31
    iget p2, p2, La/rmk;->a:I

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    :goto_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-gt v2, p0, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-gt v2, p2, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    int-to-float v2, p0

    .line 52
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    int-to-float v3, v3

    .line 57
    div-float/2addr v2, v3

    .line 58
    int-to-float v3, p2

    .line 59
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    int-to-float v4, v4

    .line 64
    div-float/2addr v3, v4

    .line 65
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    int-to-float v3, v3

    .line 74
    mul-float/2addr v3, v2

    .line 75
    float-to-double v3, v3

    .line 76
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 77
    .line 78
    .line 79
    move-result-wide v3

    .line 80
    double-to-float v3, v3

    .line 81
    float-to-int v3, v3

    .line 82
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    int-to-float v4, v4

    .line 87
    mul-float/2addr v4, v2

    .line 88
    float-to-double v4, v4

    .line 89
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    double-to-float v2, v4

    .line 94
    float-to-int v2, v2

    .line 95
    invoke-static {p1, v3, v2, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    sub-int/2addr v3, p0

    .line 103
    div-int/lit8 v3, v3, 0x2

    .line 104
    .line 105
    sub-int/2addr v2, p2

    .line 106
    div-int/lit8 v2, v2, 0x2

    .line 107
    .line 108
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    invoke-static {p1, v1, v0, p0, p2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    :goto_2
    return-object p1

    .line 124
    :pswitch_0
    iget-object p0, p2, La/f7k0;->a:La/umk;

    .line 125
    .line 126
    instance-of v0, p0, La/rmk;

    .line 127
    .line 128
    if-eqz v0, :cond_3

    .line 129
    .line 130
    check-cast p0, La/rmk;

    .line 131
    .line 132
    iget p0, p0, La/rmk;->a:I

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    :goto_3
    iget-object p2, p2, La/f7k0;->b:La/umk;

    .line 140
    .line 141
    instance-of v0, p2, La/rmk;

    .line 142
    .line 143
    if-eqz v0, :cond_4

    .line 144
    .line 145
    check-cast p2, La/rmk;

    .line 146
    .line 147
    iget p2, p2, La/rmk;->a:I

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    :goto_4
    int-to-float v0, p0

    .line 155
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    int-to-float v2, v2

    .line 160
    div-float/2addr v0, v2

    .line 161
    int-to-float v2, p2

    .line 162
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    int-to-float v3, v3

    .line 167
    div-float/2addr v2, v3

    .line 168
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    int-to-float v2, v2

    .line 177
    mul-float/2addr v2, v0

    .line 178
    float-to-double v2, v2

    .line 179
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 180
    .line 181
    .line 182
    move-result-wide v2

    .line 183
    double-to-float v2, v2

    .line 184
    float-to-int v2, v2

    .line 185
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    int-to-float v3, v3

    .line 190
    mul-float/2addr v3, v0

    .line 191
    float-to-double v3, v3

    .line 192
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 193
    .line 194
    .line 195
    move-result-wide v3

    .line 196
    double-to-float v0, v3

    .line 197
    float-to-int v0, v0

    .line 198
    invoke-static {p1, v2, v0, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    sub-int/2addr v2, p0

    .line 206
    div-int/lit8 v2, v2, 0x2

    .line 207
    .line 208
    sub-int/2addr v0, p2

    .line 209
    div-int/lit8 v0, v0, 0x2

    .line 210
    .line 211
    invoke-static {p1, v2, v0, p0, p2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    return-object p0

    .line 219
    :pswitch_1
    iget-object p0, p2, La/f7k0;->a:La/umk;

    .line 220
    .line 221
    instance-of v2, p0, La/rmk;

    .line 222
    .line 223
    if-eqz v2, :cond_5

    .line 224
    .line 225
    check-cast p0, La/rmk;

    .line 226
    .line 227
    iget p0, p0, La/rmk;->a:I

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_5
    move p0, v1

    .line 231
    :goto_5
    iget-object p2, p2, La/f7k0;->b:La/umk;

    .line 232
    .line 233
    instance-of v2, p2, La/rmk;

    .line 234
    .line 235
    if-eqz v2, :cond_6

    .line 236
    .line 237
    check-cast p2, La/rmk;

    .line 238
    .line 239
    iget v1, p2, La/rmk;->a:I

    .line 240
    .line 241
    :cond_6
    int-to-float p2, p0

    .line 242
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    int-to-float v2, v2

    .line 247
    div-float/2addr p2, v2

    .line 248
    int-to-float v2, v1

    .line 249
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    int-to-float v3, v3

    .line 254
    div-float/2addr v2, v3

    .line 255
    invoke-static {p2, v2}, Ljava/lang/Math;->max(FF)F

    .line 256
    .line 257
    .line 258
    move-result p2

    .line 259
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    int-to-float v2, v2

    .line 264
    mul-float/2addr v2, p2

    .line 265
    float-to-double v2, v2

    .line 266
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 267
    .line 268
    .line 269
    move-result-wide v2

    .line 270
    double-to-float v2, v2

    .line 271
    float-to-int v2, v2

    .line 272
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    int-to-float v3, v3

    .line 277
    mul-float/2addr v3, p2

    .line 278
    float-to-double v3, v3

    .line 279
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 280
    .line 281
    .line 282
    move-result-wide v3

    .line 283
    double-to-float p2, v3

    .line 284
    float-to-int p2, p2

    .line 285
    invoke-static {p1, v2, p2, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-le v3, v1, :cond_7

    .line 297
    .line 298
    sub-int/2addr p2, v1

    .line 299
    div-int/lit8 p2, p2, 0x2

    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_7
    sub-int/2addr p2, v1

    .line 303
    :goto_6
    sub-int/2addr v2, p0

    .line 304
    if-gez v2, :cond_8

    .line 305
    .line 306
    move v2, v0

    .line 307
    :cond_8
    if-gez p2, :cond_9

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_9
    move v0, p2

    .line 311
    :goto_7
    invoke-static {p1, v2, v0, p0, v1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    return-object p0

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
