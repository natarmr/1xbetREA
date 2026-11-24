.class public final La/c4a;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:F

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILa/d4a;FLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/c4a;->i:B

    .line 3
    .line 4
    iput p1, p0, La/c4a;->l:I

    .line 5
    .line 6
    iput-object p2, p0, La/c4a;->m:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, La/c4a;->k:F

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FILa/yje;B)V
    .locals 0

    .line 15
    iput-byte p5, p0, La/c4a;->i:B

    iput-object p1, p0, La/c4a;->m:Ljava/lang/Object;

    iput p2, p0, La/c4a;->k:F

    iput p3, p0, La/c4a;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/c4a;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/c4a;->m:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, La/c4a;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, La/buv0;

    .line 12
    .line 13
    iget v4, p0, La/c4a;->l:I

    .line 14
    .line 15
    const/4 v6, 0x2

    .line 16
    iget v3, p0, La/c4a;->k:F

    .line 17
    .line 18
    move-object v5, p2

    .line 19
    invoke-direct/range {v1 .. v6}, La/c4a;-><init>(Ljava/lang/Object;FILa/yje;B)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :pswitch_0
    move-object v5, p2

    .line 24
    new-instance v2, La/c4a;

    .line 25
    .line 26
    move-object v3, v0

    .line 27
    check-cast v3, La/xk80;

    .line 28
    .line 29
    move-object v6, v5

    .line 30
    iget v5, p0, La/c4a;->l:I

    .line 31
    .line 32
    const/4 v7, 0x1

    .line 33
    iget v4, p0, La/c4a;->k:F

    .line 34
    .line 35
    invoke-direct/range {v2 .. v7}, La/c4a;-><init>(Ljava/lang/Object;FILa/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :pswitch_1
    move-object v5, p2

    .line 40
    new-instance p1, La/c4a;

    .line 41
    .line 42
    check-cast v0, La/d4a;

    .line 43
    .line 44
    iget p2, p0, La/c4a;->k:F

    .line 45
    .line 46
    iget p0, p0, La/c4a;->l:I

    .line 47
    .line 48
    invoke-direct {p1, p0, v0, p2, v5}, La/c4a;-><init>(ILa/d4a;FLa/yje;)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/c4a;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/c4a;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/c4a;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/c4a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/qah0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/c4a;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/c4a;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/c4a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/c4a;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/c4a;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/c4a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/c4a;->i:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget v3, p0, La/c4a;->l:I

    .line 6
    .line 7
    iget v4, p0, La/c4a;->k:F

    .line 8
    .line 9
    iget-object v6, p0, La/c4a;->m:Ljava/lang/Object;

    .line 10
    .line 11
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    const/4 v8, 0x1

    .line 14
    const/4 v9, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v10, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v0, p0, La/c4a;->j:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    if-ne v0, v8, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    check-cast v6, La/buv0;

    .line 38
    .line 39
    iget-object v0, v6, La/buv0;->j:La/t33;

    .line 40
    .line 41
    new-instance v6, Ljava/lang/Float;

    .line 42
    .line 43
    invoke-direct {v6, v4}, Ljava/lang/Float;-><init>(F)V

    .line 44
    .line 45
    .line 46
    sget-object v4, La/ihn;->d:La/z73;

    .line 47
    .line 48
    invoke-static {v3, v2, v4, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-boolean v8, p0, La/c4a;->j:Z

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    const/4 v4, 0x0

    .line 56
    move-object v1, v6

    .line 57
    const/16 v6, 0xc

    .line 58
    .line 59
    move-object v5, p0

    .line 60
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-ne v0, v10, :cond_2

    .line 65
    .line 66
    move-object v9, v10

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    :goto_0
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    :goto_1
    return-object v9

    .line 71
    :pswitch_0
    check-cast v6, La/xk80;

    .line 72
    .line 73
    sget-object v0, La/wne;->a:La/wne;

    .line 74
    .line 75
    iget-boolean v1, p0, La/c4a;->j:Z

    .line 76
    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    if-ne v1, v8, :cond_3

    .line 80
    .line 81
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iput-boolean v8, p0, La/c4a;->j:Z

    .line 93
    .line 94
    invoke-virtual {v6, p0}, La/xk80;->i(La/zje;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    if-ne v1, v0, :cond_5

    .line 99
    .line 100
    move-object v9, v0

    .line 101
    goto :goto_4

    .line 102
    :cond_5
    :goto_2
    float-to-double v0, v4

    .line 103
    const-wide/high16 v9, -0x4020000000000000L    # -0.5

    .line 104
    .line 105
    cmpg-double v2, v9, v0

    .line 106
    .line 107
    if-gtz v2, :cond_6

    .line 108
    .line 109
    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    .line 110
    .line 111
    cmpg-double v0, v0, v9

    .line 112
    .line 113
    if-gtz v0, :cond_6

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v1, "pageOffsetFraction "

    .line 119
    .line 120
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v1, " is not within the range -0.5 to 0.5"

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, La/adx;->a(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :goto_3
    invoke-virtual {v6, v3}, La/xk80;->j(I)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-virtual {v6, v4, v0, v8}, La/xk80;->w(FIZ)V

    .line 143
    .line 144
    .line 145
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    :goto_4
    return-object v9

    .line 148
    :pswitch_1
    check-cast v6, La/d4a;

    .line 149
    .line 150
    iget-object v0, v6, La/d4a;->n:La/p7m0;

    .line 151
    .line 152
    sget-object v6, La/wne;->a:La/wne;

    .line 153
    .line 154
    iget-boolean v10, p0, La/c4a;->j:Z

    .line 155
    .line 156
    if-eqz v10, :cond_8

    .line 157
    .line 158
    if-ne v10, v8, :cond_7

    .line 159
    .line 160
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_8

    .line 164
    .line 165
    :cond_7
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto/16 :goto_9

    .line 169
    .line 170
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    sget-object v7, La/na80;->c:La/fl70;

    .line 174
    .line 175
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    sget-object v7, La/na80;->d:La/na80;

    .line 179
    .line 180
    iget-object v10, v7, La/na80;->b:Lkotlin/ranges/IntRange;

    .line 181
    .line 182
    iget v11, v10, Lkotlin/ranges/a;->a:I

    .line 183
    .line 184
    iget v10, v10, Lkotlin/ranges/a;->b:I

    .line 185
    .line 186
    if-gt v3, v10, :cond_9

    .line 187
    .line 188
    if-gt v11, v3, :cond_9

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_9
    sget-object v7, La/na80;->h:La/na80;

    .line 192
    .line 193
    iget-object v10, v7, La/na80;->b:Lkotlin/ranges/IntRange;

    .line 194
    .line 195
    iget v11, v10, Lkotlin/ranges/a;->a:I

    .line 196
    .line 197
    iget v10, v10, Lkotlin/ranges/a;->b:I

    .line 198
    .line 199
    if-gt v3, v10, :cond_a

    .line 200
    .line 201
    if-gt v11, v3, :cond_a

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_a
    sget-object v7, La/na80;->e:La/na80;

    .line 205
    .line 206
    iget-object v10, v7, La/na80;->b:Lkotlin/ranges/IntRange;

    .line 207
    .line 208
    iget v11, v10, Lkotlin/ranges/a;->a:I

    .line 209
    .line 210
    iget v10, v10, Lkotlin/ranges/a;->b:I

    .line 211
    .line 212
    if-gt v3, v10, :cond_b

    .line 213
    .line 214
    if-gt v11, v3, :cond_b

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_b
    sget-object v7, La/na80;->f:La/na80;

    .line 218
    .line 219
    iget-object v10, v7, La/na80;->b:Lkotlin/ranges/IntRange;

    .line 220
    .line 221
    iget v11, v10, Lkotlin/ranges/a;->a:I

    .line 222
    .line 223
    iget v10, v10, Lkotlin/ranges/a;->b:I

    .line 224
    .line 225
    if-gt v3, v10, :cond_c

    .line 226
    .line 227
    if-gt v11, v3, :cond_c

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_c
    sget-object v7, La/na80;->g:La/na80;

    .line 231
    .line 232
    iget-object v10, v7, La/na80;->b:Lkotlin/ranges/IntRange;

    .line 233
    .line 234
    iget v11, v10, Lkotlin/ranges/a;->a:I

    .line 235
    .line 236
    iget v10, v10, Lkotlin/ranges/a;->b:I

    .line 237
    .line 238
    if-gt v3, v10, :cond_d

    .line 239
    .line 240
    if-gt v11, v3, :cond_d

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_d
    sget-object v7, La/na80;->i:La/na80;

    .line 244
    .line 245
    :goto_5
    iget v3, v7, La/na80;->a:I

    .line 246
    .line 247
    const/4 v10, -0x1

    .line 248
    if-eq v3, v10, :cond_14

    .line 249
    .line 250
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v10

    .line 254
    check-cast v10, La/sa80;

    .line 255
    .line 256
    iget v10, v10, La/sa80;->c:I

    .line 257
    .line 258
    if-eq v3, v10, :cond_14

    .line 259
    .line 260
    const/high16 v10, 0x43b40000    # 360.0f

    .line 261
    .line 262
    rem-float/2addr v4, v10

    .line 263
    const/4 v10, 0x0

    .line 264
    cmpg-float v10, v4, v10

    .line 265
    .line 266
    const/high16 v11, -0x3c4c0000    # -360.0f

    .line 267
    .line 268
    if-nez v10, :cond_e

    .line 269
    .line 270
    move v4, v11

    .line 271
    :cond_e
    int-to-float v10, v3

    .line 272
    sub-float v12, v4, v10

    .line 273
    .line 274
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    .line 275
    .line 276
    .line 277
    move-result v12

    .line 278
    const/high16 v13, 0x43340000    # 180.0f

    .line 279
    .line 280
    cmpl-float v12, v12, v13

    .line 281
    .line 282
    if-lez v12, :cond_f

    .line 283
    .line 284
    add-float/2addr v10, v11

    .line 285
    new-instance v11, Ljava/lang/Float;

    .line 286
    .line 287
    invoke-direct {v11, v10}, Ljava/lang/Float;-><init>(F)V

    .line 288
    .line 289
    .line 290
    goto :goto_6

    .line 291
    :cond_f
    new-instance v11, Ljava/lang/Integer;

    .line 292
    .line 293
    invoke-direct {v11, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 294
    .line 295
    .line 296
    :goto_6
    new-instance v10, La/sa80;

    .line 297
    .line 298
    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    .line 299
    .line 300
    .line 301
    move-result v11

    .line 302
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v12

    .line 306
    check-cast v12, La/sa80;

    .line 307
    .line 308
    iget v12, v12, La/sa80;->d:I

    .line 309
    .line 310
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 311
    .line 312
    .line 313
    move-result v7

    .line 314
    if-eqz v7, :cond_12

    .line 315
    .line 316
    const/4 v13, 0x3

    .line 317
    if-eq v7, v8, :cond_11

    .line 318
    .line 319
    if-eq v7, v1, :cond_13

    .line 320
    .line 321
    if-eq v7, v13, :cond_10

    .line 322
    .line 323
    const/4 v1, 0x4

    .line 324
    if-eq v7, v1, :cond_12

    .line 325
    .line 326
    move v1, v12

    .line 327
    goto :goto_7

    .line 328
    :cond_10
    move v1, v8

    .line 329
    goto :goto_7

    .line 330
    :cond_11
    move v1, v13

    .line 331
    goto :goto_7

    .line 332
    :cond_12
    move v1, v2

    .line 333
    :cond_13
    :goto_7
    invoke-direct {v10, v4, v11, v3, v1}, La/sa80;-><init>(FFII)V

    .line 334
    .line 335
    .line 336
    iput-boolean v8, p0, La/c4a;->j:Z

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v9, v10}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    if-ne v0, v6, :cond_14

    .line 347
    .line 348
    move-object v9, v6

    .line 349
    goto :goto_9

    .line 350
    :cond_14
    :goto_8
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 351
    .line 352
    :goto_9
    return-object v9

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
