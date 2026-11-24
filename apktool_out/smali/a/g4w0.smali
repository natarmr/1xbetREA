.class public final La/g4w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/f4w0;


# instance fields
.field public final a:La/c1a;

.field public final b:La/n0o0;

.field public final c:La/fck0;

.field public d:Z

.field public e:Z

.field public final f:Z

.field public g:La/ibe0;

.field public h:La/o3x;


# direct methods
.method public constructor <init>(La/l1a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, La/l1a;->b:La/c1a;

    .line 5
    .line 6
    iput-object p1, p0, La/g4w0;->a:La/c1a;

    .line 7
    .line 8
    new-instance p1, La/jmv0;

    .line 9
    .line 10
    const/16 v0, 0x11

    .line 11
    .line 12
    invoke-direct {p1, p0, v0}, La/jmv0;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, La/g4w0;->b:La/n0o0;

    .line 20
    .line 21
    new-instance p1, La/fck0;

    .line 22
    .line 23
    new-instance v0, La/itt0;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v0}, La/fck0;-><init>(La/itt0;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/g4w0;->c:La/fck0;

    .line 32
    .line 33
    const-class p1, Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;

    .line 34
    .line 35
    invoke-static {}, La/mhk;->a()La/kpd0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, p1}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p1, 0x0

    .line 48
    :goto_0
    iput-boolean p1, p0, La/g4w0;->f:Z

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/g4w0;->j()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b(La/tii0;)V
    .locals 10

    .line 1
    iget-object v0, p1, La/sii0;->b:La/ucs0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/g4w0;->j()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, La/g4w0;->d:Z

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iput v2, v0, La/ucs0;->b:I

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-boolean v1, p0, La/g4w0;->f:Z

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iput v2, v0, La/ucs0;->b:I

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    sget-object v1, La/c1a;->a0:La/b1a;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, La/g4w0;->a:La/c1a;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast v1, La/ow9;

    .line 37
    .line 38
    invoke-virtual {v1, v3}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, [I

    .line 43
    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    sget-object v1, La/b1a;->b:[I

    .line 47
    .line 48
    :cond_2
    const/4 v3, 0x4

    .line 49
    invoke-static {v1, v3}, La/tx3;->w([II)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const-string v3, "CXCP"

    .line 54
    .line 55
    if-nez v1, :cond_4

    .line 56
    .line 57
    invoke-static {}, La/l8x;->h0()Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    const-string p0, "ZslControlImpl: Private reprocessing isn\'t supported"

    .line 64
    .line 65
    invoke-static {v3, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    :cond_3
    iput v2, v0, La/ucs0;->b:I

    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    iget-object v1, p0, La/g4w0;->b:La/n0o0;

    .line 72
    .line 73
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    check-cast v2, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 78
    .line 79
    const/16 v4, 0x22

    .line 80
    .line 81
    invoke-virtual {v2, v4}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getInputSizes(I)[Landroid/util/Size;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {v2}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_e

    .line 101
    .line 102
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-nez v6, :cond_5

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_5
    move-object v6, v5

    .line 114
    check-cast v6, Landroid/util/Size;

    .line 115
    .line 116
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    mul-int/2addr v6, v7

    .line 128
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    move-object v8, v7

    .line 133
    check-cast v8, Landroid/util/Size;

    .line 134
    .line 135
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    .line 139
    .line 140
    .line 141
    move-result v9

    .line 142
    invoke-virtual {v8}, Landroid/util/Size;->getHeight()I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    mul-int/2addr v8, v9

    .line 147
    if-ge v6, v8, :cond_7

    .line 148
    .line 149
    move-object v5, v7

    .line 150
    move v6, v8

    .line 151
    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    if-nez v7, :cond_6

    .line 156
    .line 157
    :goto_0
    check-cast v5, Landroid/util/Size;

    .line 158
    .line 159
    if-nez v5, :cond_8

    .line 160
    .line 161
    invoke-static {}, La/l8x;->j0()Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-eqz p0, :cond_a

    .line 166
    .line 167
    const-string p0, "ZslControlImpl: Unable to find a supported size for ZSL"

    .line 168
    .line 169
    invoke-static {v3, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_8
    invoke-static {v3}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_9

    .line 178
    .line 179
    new-instance v2, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-string v6, "ZslControlImpl: Selected ZSL size: "

    .line 182
    .line 183
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 194
    .line 195
    .line 196
    :cond_9
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    check-cast v1, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 201
    .line 202
    invoke-virtual {v1, v4}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getValidOutputFormatsForInput(I)[I

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    const/16 v2, 0x100

    .line 210
    .line 211
    invoke-static {v1, v2}, La/tx3;->w([II)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-nez v1, :cond_b

    .line 216
    .line 217
    invoke-static {}, La/l8x;->j0()Z

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    if-eqz p0, :cond_a

    .line 222
    .line 223
    const-string p0, "ZslControlImpl: JPEG isn\'t valid output for ZSL format"

    .line 224
    .line 225
    invoke-static {v3, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 226
    .line 227
    .line 228
    :cond_a
    return-void

    .line 229
    :cond_b
    new-instance v1, La/ld40;

    .line 230
    .line 231
    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    const/16 v5, 0x9

    .line 240
    .line 241
    invoke-direct {v1, v2, v3, v4, v5}, La/ld40;-><init>(IIII)V

    .line 242
    .line 243
    .line 244
    iget-object v2, v1, La/ld40;->b:La/wx9;

    .line 245
    .line 246
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    new-instance v3, La/ibe0;

    .line 250
    .line 251
    invoke-direct {v3, v1}, La/ibe0;-><init>(La/e1x;)V

    .line 252
    .line 253
    .line 254
    new-instance v5, La/ytt0;

    .line 255
    .line 256
    const/4 v6, 0x6

    .line 257
    invoke-direct {v5, p0, v6}, La/ytt0;-><init>(Ljava/lang/Object;B)V

    .line 258
    .line 259
    .line 260
    invoke-static {}, La/vox;->a()Ljava/util/concurrent/Executor;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    invoke-virtual {v1, v5, v6}, La/ld40;->o(La/d1x;Ljava/util/concurrent/Executor;)V

    .line 265
    .line 266
    .line 267
    new-instance v1, La/o3x;

    .line 268
    .line 269
    invoke-virtual {v3}, La/ibe0;->getSurface()Landroid/view/Surface;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    if-eqz v5, :cond_d

    .line 274
    .line 275
    new-instance v6, Landroid/util/Size;

    .line 276
    .line 277
    invoke-virtual {v3}, La/ibe0;->j()I

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    invoke-virtual {v3}, La/ibe0;->f()I

    .line 282
    .line 283
    .line 284
    move-result v8

    .line 285
    invoke-direct {v6, v7, v8}, Landroid/util/Size;-><init>(II)V

    .line 286
    .line 287
    .line 288
    invoke-direct {v1, v5, v6, v4}, La/o3x;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    .line 289
    .line 290
    .line 291
    iget-object v4, v1, La/hzj;->e:La/wu9;

    .line 292
    .line 293
    invoke-static {v4}, La/ro4;->c0(La/ig00;)La/ig00;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    new-instance v5, La/d8a;

    .line 298
    .line 299
    const/4 v6, 0x3

    .line 300
    invoke-direct {v5, v3, v6}, La/d8a;-><init>(La/ibe0;B)V

    .line 301
    .line 302
    .line 303
    invoke-static {}, La/j120;->T()Ljava/util/concurrent/ScheduledExecutorService;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    invoke-interface {v4, v5, v6}, La/ig00;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 308
    .line 309
    .line 310
    sget-object v4, La/agn;->d:La/agn;

    .line 311
    .line 312
    const/4 v5, -0x1

    .line 313
    invoke-virtual {p1, v1, v4, v5}, La/tii0;->b(La/hzj;La/agn;I)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v0, v2}, La/ucs0;->f(La/vx9;)V

    .line 317
    .line 318
    .line 319
    iget-object v0, p1, La/sii0;->e:Ljava/util/ArrayList;

    .line 320
    .line 321
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    if-nez v4, :cond_c

    .line 326
    .line 327
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    :cond_c
    new-instance v0, Landroid/hardware/camera2/params/InputConfiguration;

    .line 331
    .line 332
    invoke-virtual {v3}, La/ibe0;->j()I

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    invoke-virtual {v3}, La/ibe0;->f()I

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    invoke-virtual {v3}, La/ibe0;->h()I

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    invoke-direct {v0, v2, v4, v5}, Landroid/hardware/camera2/params/InputConfiguration;-><init>(III)V

    .line 345
    .line 346
    .line 347
    iput-object v0, p1, La/sii0;->g:Landroid/hardware/camera2/params/InputConfiguration;

    .line 348
    .line 349
    iput-object v3, p0, La/g4w0;->g:La/ibe0;

    .line 350
    .line 351
    iput-object v1, p0, La/g4w0;->h:La/o3x;

    .line 352
    .line 353
    return-void

    .line 354
    :cond_d
    const-string p0, "Required value was null."

    .line 355
    .line 356
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    return-void

    .line 360
    :cond_e
    invoke-static {}, La/itt0;->a()V

    .line 361
    .line 362
    .line 363
    return-void
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/g4w0;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/g4w0;->e:Z

    .line 2
    .line 3
    return-void
.end method

.method public final e(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/g4w0;->d:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/g4w0;->i()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-boolean p1, p0, La/g4w0;->d:Z

    .line 11
    .line 12
    return-void
.end method

.method public final f()La/b1x;
    .locals 1

    .line 1
    :try_start_0
    iget-object p0, p0, La/g4w0;->c:La/fck0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/fck0;->c()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/b1x;
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :catch_0
    invoke-static {}, La/l8x;->j0()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const-string p0, "ZslControlImpl#dequeueImageFromBuffer: No such element"

    .line 17
    .line 18
    const-string v0, "CXCP"

    .line 19
    .line 20
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public final g(La/hzj;La/xii0;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p2, La/xii0;->i:Landroid/hardware/camera2/params/InputConfiguration;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget p2, p1, La/hzj;->i:I

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/hardware/camera2/params/InputConfiguration;->getFormat()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ne p2, v0, :cond_0

    .line 18
    .line 19
    iget-object p2, p1, La/hzj;->h:Landroid/util/Size;

    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-virtual {p0}, Landroid/hardware/camera2/params/InputConfiguration;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ne p2, v0, :cond_0

    .line 30
    .line 31
    iget-object p1, p1, La/hzj;->h:Landroid/util/Size;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {p0}, Landroid/hardware/camera2/params/InputConfiguration;->getHeight()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-ne p1, p0, :cond_0

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    return p0

    .line 45
    :cond_0
    const/4 p0, 0x0

    .line 46
    return p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/g4w0;->e:Z

    .line 2
    .line 3
    return p0
.end method

.method public final i()V
    .locals 2

    .line 1
    iget-object p0, p0, La/g4w0;->c:La/fck0;

    .line 2
    .line 3
    :goto_0
    iget-object v0, p0, La/fck0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, La/fck0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, La/fck0;->c()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, La/b1x;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p0
.end method

.method public final j()V
    .locals 6

    .line 1
    iget-object v0, p0, La/g4w0;->h:La/o3x;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, La/g4w0;->g:La/ibe0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v3, v0, La/hzj;->e:La/wu9;

    .line 11
    .line 12
    invoke-static {v3}, La/ro4;->c0(La/ig00;)La/ig00;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    new-instance v4, La/d8a;

    .line 17
    .line 18
    const/4 v5, 0x4

    .line 19
    invoke-direct {v4, v1, v5}, La/d8a;-><init>(La/ibe0;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, La/j120;->T()Ljava/util/concurrent/ScheduledExecutorService;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-interface {v3, v4, v5}, La/ig00;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, La/ibe0;->k()V

    .line 30
    .line 31
    .line 32
    iput-object v2, p0, La/g4w0;->g:La/ibe0;

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, La/hzj;->a()V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, La/g4w0;->h:La/o3x;

    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, La/g4w0;->i()V

    .line 40
    .line 41
    .line 42
    return-void
.end method
