.class public final synthetic La/h9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/q9;


# direct methods
.method public synthetic constructor <init>(La/q9;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h9;->a:B

    iput-object p1, p0, La/h9;->b:La/q9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/h9;->a:B

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x7

    .line 5
    const/4 v3, 0x4

    .line 6
    iget-object p0, p0, La/h9;->b:La/q9;

    .line 7
    .line 8
    check-cast p1, La/cp;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 17
    .line 18
    check-cast v0, La/ytx;

    .line 19
    .line 20
    iget-object v0, v0, La/ytx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v1, La/i9;

    .line 26
    .line 27
    const/16 v2, 0x9

    .line 28
    .line 29
    invoke-direct {v1, p0, p1, v2}, La/i9;-><init>(La/q9;La/cp;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 33
    .line 34
    .line 35
    new-instance p0, La/kgh;

    .line 36
    .line 37
    invoke-direct {p0, p1, v3}, La/kgh;-><init>(La/cp;B)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 50
    .line 51
    check-cast v0, La/fsx;

    .line 52
    .line 53
    iget-object v0, v0, La/fsx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v1, La/i9;

    .line 59
    .line 60
    const/16 v2, 0x8

    .line 61
    .line 62
    invoke-direct {v1, p0, p1, v2}, La/i9;-><init>(La/q9;La/cp;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 66
    .line 67
    .line 68
    new-instance p0, La/j9;

    .line 69
    .line 70
    const/16 v0, 0x1c

    .line 71
    .line 72
    invoke-direct {p0, p1, v0}, La/j9;-><init>(La/cp;B)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 85
    .line 86
    check-cast v0, La/lrx;

    .line 87
    .line 88
    iget-object v0, v0, La/lrx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v1, La/i9;

    .line 94
    .line 95
    invoke-direct {v1, p0, p1, v2}, La/i9;-><init>(La/q9;La/cp;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 99
    .line 100
    .line 101
    new-instance p0, La/j9;

    .line 102
    .line 103
    const/16 v0, 0x15

    .line 104
    .line 105
    invoke-direct {p0, p1, v0}, La/j9;-><init>(La/cp;B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 118
    .line 119
    check-cast v0, La/nrx;

    .line 120
    .line 121
    iget-object v0, v0, La/nrx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v3, La/i9;

    .line 127
    .line 128
    invoke-direct {v3, p0, p1, v1}, La/i9;-><init>(La/q9;La/cp;B)V

    .line 129
    .line 130
    .line 131
    invoke-static {v0, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 132
    .line 133
    .line 134
    new-instance p0, La/j9;

    .line 135
    .line 136
    invoke-direct {p0, p1, v2}, La/j9;-><init>(La/cp;B)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 140
    .line 141
    .line 142
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 149
    .line 150
    check-cast v0, La/qrx;

    .line 151
    .line 152
    iget-object v2, v0, La/qrx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    new-instance v3, La/i9;

    .line 158
    .line 159
    const/4 v4, 0x5

    .line 160
    invoke-direct {v3, p0, p1, v4}, La/i9;-><init>(La/q9;La/cp;B)V

    .line 161
    .line 162
    .line 163
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 164
    .line 165
    .line 166
    iget-object p0, v0, La/qrx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 167
    .line 168
    iget-object v2, p1, La/cp;->w:Landroid/content/Context;

    .line 169
    .line 170
    const v3, 0x7f040b5f

    .line 171
    .line 172
    .line 173
    invoke-static {v3, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    invoke-virtual {p0, v3}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCounterColor(I)V

    .line 178
    .line 179
    .line 180
    iget-object p0, v0, La/qrx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;

    .line 181
    .line 182
    const v0, 0x7f040b55

    .line 183
    .line 184
    .line 185
    invoke-static {v0, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightCounter;->setCounterBackgroundColor(Ljava/lang/Integer;)V

    .line 194
    .line 195
    .line 196
    new-instance p0, La/j9;

    .line 197
    .line 198
    invoke-direct {p0, p1, v1}, La/j9;-><init>(La/cp;B)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 202
    .line 203
    .line 204
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object p0

    .line 207
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 211
    .line 212
    check-cast v0, La/nrx;

    .line 213
    .line 214
    iget-object v0, v0, La/nrx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    new-instance v1, La/i9;

    .line 220
    .line 221
    invoke-direct {v1, p0, p1, v3}, La/i9;-><init>(La/q9;La/cp;B)V

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 225
    .line 226
    .line 227
    new-instance p0, La/j9;

    .line 228
    .line 229
    invoke-direct {p0, p1, v3}, La/j9;-><init>(La/cp;B)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 233
    .line 234
    .line 235
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object p0

    .line 238
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 242
    .line 243
    check-cast v0, La/orx;

    .line 244
    .line 245
    iget-object v0, v0, La/orx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    new-instance v1, La/i9;

    .line 251
    .line 252
    const/4 v2, 0x3

    .line 253
    invoke-direct {v1, p0, p1, v2}, La/i9;-><init>(La/q9;La/cp;B)V

    .line 254
    .line 255
    .line 256
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 257
    .line 258
    .line 259
    new-instance p0, La/j9;

    .line 260
    .line 261
    invoke-direct {p0, p1, v2}, La/j9;-><init>(La/cp;B)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 265
    .line 266
    .line 267
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 274
    .line 275
    check-cast v0, La/nrx;

    .line 276
    .line 277
    iget-object v0, v0, La/nrx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    new-instance v1, La/i9;

    .line 283
    .line 284
    const/4 v2, 0x2

    .line 285
    invoke-direct {v1, p0, p1, v2}, La/i9;-><init>(La/q9;La/cp;B)V

    .line 286
    .line 287
    .line 288
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 289
    .line 290
    .line 291
    new-instance p0, La/j9;

    .line 292
    .line 293
    invoke-direct {p0, p1, v2}, La/j9;-><init>(La/cp;B)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 297
    .line 298
    .line 299
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 300
    .line 301
    return-object p0

    .line 302
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 306
    .line 307
    check-cast v0, La/mrx;

    .line 308
    .line 309
    iget-object v0, v0, La/mrx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    new-instance v1, La/i9;

    .line 315
    .line 316
    const/4 v2, 0x1

    .line 317
    invoke-direct {v1, p0, p1, v2}, La/i9;-><init>(La/q9;La/cp;B)V

    .line 318
    .line 319
    .line 320
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 321
    .line 322
    .line 323
    new-instance p0, La/j9;

    .line 324
    .line 325
    invoke-direct {p0, p1, v2}, La/j9;-><init>(La/cp;B)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 329
    .line 330
    .line 331
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    return-object p0

    .line 334
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 338
    .line 339
    check-cast v0, La/nrx;

    .line 340
    .line 341
    iget-object v0, v0, La/nrx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    new-instance v1, La/i9;

    .line 347
    .line 348
    const/4 v2, 0x0

    .line 349
    invoke-direct {v1, p0, p1, v2}, La/i9;-><init>(La/q9;La/cp;B)V

    .line 350
    .line 351
    .line 352
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 353
    .line 354
    .line 355
    new-instance p0, La/j9;

    .line 356
    .line 357
    invoke-direct {p0, p1, v2}, La/j9;-><init>(La/cp;B)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 361
    .line 362
    .line 363
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 364
    .line 365
    return-object p0

    .line 366
    nop

    .line 367
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
