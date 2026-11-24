.class public final La/gkd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ScrollCaptureCallback;


# instance fields
.field public final a:La/tai0;

.field public final b:La/mkx;

.field public final c:La/u9h0;

.field public final d:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final e:La/sje;

.field public final f:La/tlw;


# direct methods
.method public constructor <init>(La/tai0;La/mkx;La/sje;La/u9h0;Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/gkd;->a:La/tai0;

    .line 5
    .line 6
    iput-object p2, p0, La/gkd;->b:La/mkx;

    .line 7
    .line 8
    iput-object p4, p0, La/gkd;->c:La/u9h0;

    .line 9
    .line 10
    iput-object p5, p0, La/gkd;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 11
    .line 12
    sget-object p1, La/gnk;->a:La/gnk;

    .line 13
    .line 14
    invoke-static {p3, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, La/gkd;->e:La/sje;

    .line 19
    .line 20
    new-instance p1, La/tlw;

    .line 21
    .line 22
    invoke-virtual {p2}, La/mkx;->a()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    new-instance p3, La/cx8;

    .line 27
    .line 28
    const/4 p4, 0x0

    .line 29
    invoke-direct {p3, p0, p4}, La/cx8;-><init>(La/gkd;La/yje;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, p2, p3}, La/tlw;-><init>(ILa/cx8;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, La/gkd;->f:La/tlw;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/ScrollCaptureSession;La/mkx;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, La/fkd;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/fkd;

    .line 7
    .line 8
    iget v1, v0, La/fkd;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/fkd;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fkd;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/fkd;-><init>(La/gkd;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/fkd;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fkd;->o:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget-object v4, p0, La/gkd;->f:La/tlw;

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x2

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v6, :cond_1

    .line 41
    .line 42
    iget p1, v0, La/fkd;->l:I

    .line 43
    .line 44
    iget p2, v0, La/fkd;->k:I

    .line 45
    .line 46
    iget-object v1, v0, La/fkd;->j:La/mkx;

    .line 47
    .line 48
    iget-object v0, v0, La/fkd;->i:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {v0}, La/kn4;->m(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v3

    .line 65
    :cond_2
    iget p1, v0, La/fkd;->l:I

    .line 66
    .line 67
    iget p2, v0, La/fkd;->k:I

    .line 68
    .line 69
    iget-object v2, v0, La/fkd;->j:La/mkx;

    .line 70
    .line 71
    iget-object v3, v0, La/fkd;->i:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {v3}, La/kn4;->m(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move p3, p2

    .line 81
    move-object p2, v2

    .line 82
    move v2, p1

    .line 83
    move-object p1, v3

    .line 84
    goto :goto_3

    .line 85
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget p3, p2, La/mkx;->b:I

    .line 89
    .line 90
    iget v2, p2, La/mkx;->d:I

    .line 91
    .line 92
    iput-object p1, v0, La/fkd;->i:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p2, v0, La/fkd;->j:La/mkx;

    .line 95
    .line 96
    iput p3, v0, La/fkd;->k:I

    .line 97
    .line 98
    iput v2, v0, La/fkd;->l:I

    .line 99
    .line 100
    iput v5, v0, La/fkd;->o:I

    .line 101
    .line 102
    if-gt p3, v2, :cond_a

    .line 103
    .line 104
    sub-int v5, v2, p3

    .line 105
    .line 106
    iget v7, v4, La/tlw;->a:I

    .line 107
    .line 108
    if-gt v5, v7, :cond_9

    .line 109
    .line 110
    div-int/2addr v5, v6

    .line 111
    add-int/2addr v5, p3

    .line 112
    div-int/2addr v7, v6

    .line 113
    sub-int/2addr v5, v7

    .line 114
    int-to-float v3, v5

    .line 115
    iget v5, v4, La/tlw;->b:F

    .line 116
    .line 117
    sub-float/2addr v3, v5

    .line 118
    invoke-virtual {v4, v3, v0}, La/tlw;->b(FLa/zje;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    if-ne v3, v1, :cond_4

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    :goto_1
    if-ne v3, v1, :cond_5

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    :goto_2
    if-ne v3, v1, :cond_6

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_6
    :goto_3
    new-instance v3, La/y2d;

    .line 136
    .line 137
    const/16 v5, 0xd

    .line 138
    .line 139
    invoke-direct {v3, v5}, La/y2d;-><init>(B)V

    .line 140
    .line 141
    .line 142
    iput-object p1, v0, La/fkd;->i:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object p2, v0, La/fkd;->j:La/mkx;

    .line 145
    .line 146
    iput p3, v0, La/fkd;->k:I

    .line 147
    .line 148
    iput v2, v0, La/fkd;->l:I

    .line 149
    .line 150
    iput v6, v0, La/fkd;->o:I

    .line 151
    .line 152
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    invoke-static {v5}, La/s0x;->P(Lkotlin/coroutines/CoroutineContext;)La/qq40;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-interface {v5, v3, v0}, La/qq40;->e(Lkotlin/jvm/functions/Function1;La/yje;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-ne v0, v1, :cond_7

    .line 165
    .line 166
    :goto_4
    return-object v1

    .line 167
    :cond_7
    move-object v0, p1

    .line 168
    move-object v1, p2

    .line 169
    move p2, p3

    .line 170
    move p1, v2

    .line 171
    :goto_5
    iget p3, v4, La/tlw;->b:F

    .line 172
    .line 173
    invoke-static {p3}, La/si30;->b(F)I

    .line 174
    .line 175
    .line 176
    move-result p3

    .line 177
    sub-int/2addr p2, p3

    .line 178
    iget p3, v4, La/tlw;->a:I

    .line 179
    .line 180
    const/4 v2, 0x0

    .line 181
    invoke-static {p2, v2, p3}, La/l1e0;->d(III)I

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    iget p3, v4, La/tlw;->b:F

    .line 186
    .line 187
    invoke-static {p3}, La/si30;->b(F)I

    .line 188
    .line 189
    .line 190
    move-result p3

    .line 191
    sub-int/2addr p1, p3

    .line 192
    iget p3, v4, La/tlw;->a:I

    .line 193
    .line 194
    invoke-static {p1, v2, p3}, La/l1e0;->d(III)I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    iget p3, v1, La/mkx;->a:I

    .line 199
    .line 200
    iget v1, v1, La/mkx;->c:I

    .line 201
    .line 202
    if-ne p2, p1, :cond_8

    .line 203
    .line 204
    sget-object p0, La/mkx;->e:La/mkx;

    .line 205
    .line 206
    return-object p0

    .line 207
    :cond_8
    invoke-static {v0}, La/kn4;->n(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v2}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    :try_start_0
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 216
    .line 217
    .line 218
    int-to-float v3, p3

    .line 219
    neg-float v3, v3

    .line 220
    int-to-float v5, p2

    .line 221
    neg-float v5, v5

    .line 222
    invoke-virtual {v2, v3, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 223
    .line 224
    .line 225
    iget-object v3, p0, La/gkd;->b:La/mkx;

    .line 226
    .line 227
    iget v5, v3, La/mkx;->a:I

    .line 228
    .line 229
    int-to-float v5, v5

    .line 230
    neg-float v5, v5

    .line 231
    iget v3, v3, La/mkx;->b:I

    .line 232
    .line 233
    int-to-float v3, v3

    .line 234
    neg-float v3, v3

    .line 235
    invoke-virtual {v2, v5, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 236
    .line 237
    .line 238
    iget-object p0, p0, La/gkd;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 239
    .line 240
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-virtual {p0, v2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    .line 246
    .line 247
    invoke-static {v0}, La/kn4;->B(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-virtual {p0, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 252
    .line 253
    .line 254
    iget p0, v4, La/tlw;->b:F

    .line 255
    .line 256
    invoke-static {p0}, La/si30;->b(F)I

    .line 257
    .line 258
    .line 259
    move-result p0

    .line 260
    new-instance v0, La/mkx;

    .line 261
    .line 262
    add-int/2addr p2, p0

    .line 263
    add-int/2addr p1, p0

    .line 264
    invoke-direct {v0, p3, p2, v1, p1}, La/mkx;-><init>(IIII)V

    .line 265
    .line 266
    .line 267
    return-object v0

    .line 268
    :catchall_0
    move-exception p0

    .line 269
    invoke-static {v0}, La/kn4;->B(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-virtual {p1, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 274
    .line 275
    .line 276
    throw p0

    .line 277
    :cond_9
    const-string p0, "Expected range ("

    .line 278
    .line 279
    const-string p1, ") to be \u2264 viewportSize="

    .line 280
    .line 281
    invoke-static {v5, p0, v7, p1}, La/f140;->j(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    return-object v3

    .line 289
    :cond_a
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    new-instance p0, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    const-string p1, "Expected min="

    .line 295
    .line 296
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    const-string p1, " \u2264 max="

    .line 303
    .line 304
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 315
    .line 316
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    throw p1
.end method

.method public final onScrollCaptureEnd(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    sget-object v0, La/z560;->b:La/z560;

    .line 2
    .line 3
    new-instance v1, La/jtb;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v3, v2}, La/jtb;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    iget-object p0, p0, La/gkd;->e:La/sje;

    .line 13
    .line 14
    invoke-static {p0, v0, v3, v1, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onScrollCaptureImageRequest(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V
    .locals 7

    .line 1
    new-instance v0, La/ic1;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/16 v6, 0xd

    .line 5
    .line 6
    move-object v1, p0

    .line 7
    move-object v2, p1

    .line 8
    move-object v3, p3

    .line 9
    move-object v4, p4

    .line 10
    invoke-direct/range {v0 .. v6}, La/ic1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    const/4 p1, 0x3

    .line 15
    iget-object p3, v1, La/gkd;->e:La/sje;

    .line 16
    .line 17
    invoke-static {p3, p0, p0, v0, p1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance p1, La/ejd;

    .line 22
    .line 23
    const/4 p3, 0x1

    .line 24
    invoke-direct {p1, p2, p3}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 28
    .line 29
    .line 30
    new-instance p1, La/hkd;

    .line 31
    .line 32
    const/4 p3, 0x0

    .line 33
    invoke-direct {p1, p0, p3}, La/hkd;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final onScrollCaptureSearch(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/gkd;->b:La/mkx;

    .line 2
    .line 3
    invoke-static {p0}, La/e9x;->U(La/mkx;)Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p2, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onScrollCaptureStart(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p1, p0, La/gkd;->f:La/tlw;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iput p2, p1, La/tlw;->b:F

    .line 5
    .line 6
    iget-object p0, p0, La/gkd;->c:La/u9h0;

    .line 7
    .line 8
    iget-object p0, p0, La/u9h0;->a:La/pz40;

    .line 9
    .line 10
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    .line 12
    check-cast p0, La/hgk0;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 18
    .line 19
    .line 20
    return-void
.end method
