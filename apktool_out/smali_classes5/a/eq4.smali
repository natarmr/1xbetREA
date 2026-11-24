.class public final synthetic La/eq4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/e8;


# direct methods
.method public synthetic constructor <init>(La/e8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eq4;->a:B

    iput-object p1, p0, La/eq4;->b:La/e8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/eq4;->a:B

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    iget-object p0, p0, La/eq4;->b:La/e8;

    .line 6
    .line 7
    check-cast p1, La/cp;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 16
    .line 17
    check-cast v0, La/itx;

    .line 18
    .line 19
    iget-object v0, v0, La/itx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 20
    .line 21
    new-instance v2, La/fq4;

    .line 22
    .line 23
    invoke-direct {v2, p0, p1, v1}, La/fq4;-><init>(La/e8;La/cp;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 27
    .line 28
    .line 29
    new-instance p0, La/rn5;

    .line 30
    .line 31
    const/16 v0, 0x14

    .line 32
    .line 33
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 46
    .line 47
    check-cast v0, La/itx;

    .line 48
    .line 49
    iget-object v0, v0, La/itx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 50
    .line 51
    new-instance v1, La/fq4;

    .line 52
    .line 53
    const/16 v2, 0x8

    .line 54
    .line 55
    invoke-direct {v1, p0, p1, v2}, La/fq4;-><init>(La/e8;La/cp;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 59
    .line 60
    .line 61
    new-instance p0, La/rn5;

    .line 62
    .line 63
    const/16 v0, 0x13

    .line 64
    .line 65
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 78
    .line 79
    check-cast v0, La/itx;

    .line 80
    .line 81
    iget-object v0, v0, La/itx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 82
    .line 83
    new-instance v1, La/fq4;

    .line 84
    .line 85
    const/4 v2, 0x7

    .line 86
    invoke-direct {v1, p0, p1, v2}, La/fq4;-><init>(La/e8;La/cp;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 90
    .line 91
    .line 92
    new-instance p0, La/rn5;

    .line 93
    .line 94
    const/16 v0, 0x12

    .line 95
    .line 96
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 109
    .line 110
    check-cast v0, La/htx;

    .line 111
    .line 112
    iget-object v0, v0, La/htx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 113
    .line 114
    new-instance v1, La/fq4;

    .line 115
    .line 116
    const/4 v2, 0x6

    .line 117
    invoke-direct {v1, p0, p1, v2}, La/fq4;-><init>(La/e8;La/cp;B)V

    .line 118
    .line 119
    .line 120
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 121
    .line 122
    .line 123
    new-instance p0, La/rn5;

    .line 124
    .line 125
    const/16 v0, 0x11

    .line 126
    .line 127
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 131
    .line 132
    .line 133
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 140
    .line 141
    check-cast v0, La/htx;

    .line 142
    .line 143
    iget-object v0, v0, La/htx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 144
    .line 145
    new-instance v1, La/fq4;

    .line 146
    .line 147
    const/4 v2, 0x5

    .line 148
    invoke-direct {v1, p0, p1, v2}, La/fq4;-><init>(La/e8;La/cp;B)V

    .line 149
    .line 150
    .line 151
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 152
    .line 153
    .line 154
    new-instance p0, La/rn5;

    .line 155
    .line 156
    const/16 v0, 0x10

    .line 157
    .line 158
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 162
    .line 163
    .line 164
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 171
    .line 172
    check-cast v0, La/itx;

    .line 173
    .line 174
    iget-object v0, v0, La/itx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 175
    .line 176
    new-instance v1, La/fq4;

    .line 177
    .line 178
    const/4 v2, 0x4

    .line 179
    invoke-direct {v1, p0, p1, v2}, La/fq4;-><init>(La/e8;La/cp;B)V

    .line 180
    .line 181
    .line 182
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 183
    .line 184
    .line 185
    new-instance p0, La/rn5;

    .line 186
    .line 187
    const/16 v0, 0xf

    .line 188
    .line 189
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 193
    .line 194
    .line 195
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object p0

    .line 198
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 202
    .line 203
    check-cast v0, La/itx;

    .line 204
    .line 205
    iget-object v0, v0, La/itx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 206
    .line 207
    new-instance v1, La/fq4;

    .line 208
    .line 209
    const/4 v2, 0x3

    .line 210
    invoke-direct {v1, p0, p1, v2}, La/fq4;-><init>(La/e8;La/cp;B)V

    .line 211
    .line 212
    .line 213
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 214
    .line 215
    .line 216
    new-instance p0, La/rn5;

    .line 217
    .line 218
    const/16 v0, 0xe

    .line 219
    .line 220
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 224
    .line 225
    .line 226
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object p0

    .line 229
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 233
    .line 234
    check-cast v0, La/itx;

    .line 235
    .line 236
    iget-object v1, v0, La/itx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 237
    .line 238
    new-instance v2, La/fq4;

    .line 239
    .line 240
    const/4 v3, 0x2

    .line 241
    invoke-direct {v2, p0, p1, v3}, La/fq4;-><init>(La/e8;La/cp;B)V

    .line 242
    .line 243
    .line 244
    invoke-static {v1, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 245
    .line 246
    .line 247
    iget-object p0, v0, La/itx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 248
    .line 249
    iget-object v0, p1, La/cp;->w:Landroid/content/Context;

    .line 250
    .line 251
    const v1, 0x7f040b55

    .line 252
    .line 253
    .line 254
    invoke-static {v1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    iget-object p0, p0, Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;->f1:La/ape;

    .line 259
    .line 260
    iget-object p0, p0, La/ape;->c:Lorg/xplatform/uikit/components/counter/DsCounter;

    .line 261
    .line 262
    if-eqz p0, :cond_0

    .line 263
    .line 264
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/counter/DsCounter;->h(Ljava/lang/Integer;)V

    .line 269
    .line 270
    .line 271
    :cond_0
    new-instance p0, La/rn5;

    .line 272
    .line 273
    const/16 v0, 0xb

    .line 274
    .line 275
    invoke-direct {p0, p1, v0}, La/rn5;-><init>(La/cp;B)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 279
    .line 280
    .line 281
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 288
    .line 289
    check-cast v0, La/itx;

    .line 290
    .line 291
    iget-object v0, v0, La/itx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 292
    .line 293
    new-instance v2, La/fq4;

    .line 294
    .line 295
    const/4 v3, 0x1

    .line 296
    invoke-direct {v2, p0, p1, v3}, La/fq4;-><init>(La/e8;La/cp;B)V

    .line 297
    .line 298
    .line 299
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 300
    .line 301
    .line 302
    new-instance p0, La/rn5;

    .line 303
    .line 304
    invoke-direct {p0, p1, v1}, La/rn5;-><init>(La/cp;B)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 308
    .line 309
    .line 310
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    return-object p0

    .line 313
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 317
    .line 318
    check-cast v0, La/itx;

    .line 319
    .line 320
    iget-object v0, v0, La/itx;->a:Lorg/xplatform/uikit/components/cells/menu/DsMenuCompactCell;

    .line 321
    .line 322
    new-instance v1, La/fq4;

    .line 323
    .line 324
    const/4 v2, 0x0

    .line 325
    invoke-direct {v1, p0, p1, v2}, La/fq4;-><init>(La/e8;La/cp;B)V

    .line 326
    .line 327
    .line 328
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 329
    .line 330
    .line 331
    new-instance p0, La/j9;

    .line 332
    .line 333
    const/16 v0, 0x17

    .line 334
    .line 335
    invoke-direct {p0, p1, v0}, La/j9;-><init>(La/cp;B)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 339
    .line 340
    .line 341
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    return-object p0

    .line 344
    nop

    .line 345
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
