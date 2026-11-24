.class public final La/p77;
.super La/v46;
.source "SourceFile"


# static fields
.field public static final synthetic y:I


# instance fields
.field public final synthetic u:B

.field public final v:Ljava/lang/Object;

.field public final w:La/wdr;

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/q77;Landroid/view/View;Ljava/lang/String;La/ur6;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/p77;->u:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    iput-object p1, p0, La/p77;->x:Ljava/lang/Object;

    .line 23
    invoke-direct {p0, p2}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 24
    iput-object p3, p0, La/p77;->v:Ljava/lang/Object;

    .line 25
    iput-object p4, p0, La/p77;->w:La/wdr;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;La/h8a;La/bna;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/p77;->u:B

    .line 3
    .line 4
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/p77;->v:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, La/p77;->w:La/wdr;

    .line 10
    .line 11
    check-cast p1, Landroid/widget/TextView;

    .line 12
    .line 13
    new-instance p2, La/dtx;

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    invoke-direct {p2, p1, p1, p3}, La/dtx;-><init>(Landroid/widget/TextView;Landroid/widget/TextView;B)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, La/p77;->x:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final t(Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget-byte v0, p0, La/p77;->u:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/p77;->v:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p0, La/p77;->x:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, La/xhe0;->a:Landroid/view/View;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Lkotlin/Pair;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v5, v4}, Landroid/view/View;->setClickable(Z)V

    .line 20
    .line 21
    .line 22
    check-cast v3, La/dtx;

    .line 23
    .line 24
    iget-object v0, v3, La/dtx;->c:Landroid/widget/TextView;

    .line 25
    .line 26
    iget-object v3, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Ljava/lang/CharSequence;

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    check-cast v2, La/h8a;

    .line 38
    .line 39
    invoke-virtual {v2}, La/h8a;->invoke()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-ne v3, v2, :cond_0

    .line 50
    .line 51
    const v1, 0x7f140399

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 55
    .line 56
    .line 57
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 58
    .line 59
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const v2, 0x7f0606da

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 74
    .line 75
    .line 76
    const v1, 0x7f080ee5

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    const v2, 0x7f140397

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 87
    .line 88
    .line 89
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 90
    .line 91
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    const v3, 0x7f040b72

    .line 99
    .line 100
    .line 101
    invoke-static {v2, v3, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 106
    .line 107
    .line 108
    const v1, 0x7f080eec

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 112
    .line 113
    .line 114
    :goto_0
    new-instance v0, La/rw40;

    .line 115
    .line 116
    const/16 v1, 0xb

    .line 117
    .line 118
    invoke-direct {v0, p0, p1, v1}, La/rw40;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 119
    .line 120
    .line 121
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance p1, La/cjj;

    .line 127
    .line 128
    new-instance v1, La/olh;

    .line 129
    .line 130
    const/16 v2, 0xf

    .line 131
    .line 132
    invoke-direct {v1, v0, v2}, La/olh;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 133
    .line 134
    .line 135
    invoke-direct {p1, p0, v4, v1}, La/cjj;-><init>(La/ymx;ZLkotlin/jvm/functions/Function1;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :pswitch_0
    check-cast p1, La/m77;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iget-object v0, p1, La/m77;->a:La/s77;

    .line 148
    .line 149
    sget-object v6, La/j5d;->a:Landroid/util/TypedValue;

    .line 150
    .line 151
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    const v7, 0x7f040afc

    .line 159
    .line 160
    .line 161
    invoke-static {v6, v7, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    const v8, 0x7f040b0b

    .line 173
    .line 174
    .line 175
    invoke-static {v7, v8, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    const v8, 0x7f0a07f4

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    check-cast v8, Landroid/widget/TextView;

    .line 187
    .line 188
    const v9, 0x7f0a090f

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    check-cast v9, Landroid/widget/ImageView;

    .line 196
    .line 197
    const v10, 0x7f0a045c

    .line 198
    .line 199
    .line 200
    invoke-virtual {v5, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    check-cast v3, La/q77;

    .line 208
    .line 209
    iget-object v11, v3, La/i26;->f:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v11, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-static {v4, v11}, La/dw9;->l(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    check-cast v4, La/m77;

    .line 218
    .line 219
    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-nez v4, :cond_1

    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_1
    const/16 v1, 0x8

    .line 227
    .line 228
    :goto_1
    invoke-virtual {v10, v1}, Landroid/view/View;->setVisibility(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    iget-boolean v1, p1, La/m77;->b:Z

    .line 235
    .line 236
    check-cast v2, Ljava/lang/String;

    .line 237
    .line 238
    iget-object v3, v3, La/q77;->j:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v3, La/sys0;

    .line 241
    .line 242
    invoke-static {v0, v2, v3}, La/g47;->a(La/s77;Ljava/lang/String;La/sys0;)Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    iget v4, v2, Lorg/xplatform/ui_core/resources/UiText$ByRes;->a:I

    .line 251
    .line 252
    iget-object v2, v2, Lorg/xplatform/ui_core/resources/UiText$ByRes;->b:[Ljava/lang/CharSequence;

    .line 253
    .line 254
    array-length v10, v2

    .line 255
    invoke-static {v2, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-virtual {v3, v4, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 264
    .line 265
    .line 266
    if-eqz v1, :cond_2

    .line 267
    .line 268
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 269
    .line 270
    .line 271
    :cond_2
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    packed-switch v0, :pswitch_data_1

    .line 280
    .line 281
    .line 282
    invoke-static {}, La/t9f;->b()V

    .line 283
    .line 284
    .line 285
    goto :goto_4

    .line 286
    :pswitch_1
    const v0, 0x7f0805cd

    .line 287
    .line 288
    .line 289
    goto :goto_2

    .line 290
    :pswitch_2
    const v0, 0x7f080618

    .line 291
    .line 292
    .line 293
    goto :goto_2

    .line 294
    :pswitch_3
    const v0, 0x7f080b75

    .line 295
    .line 296
    .line 297
    goto :goto_2

    .line 298
    :pswitch_4
    const v0, 0x7f080c9a

    .line 299
    .line 300
    .line 301
    goto :goto_2

    .line 302
    :pswitch_5
    const v0, 0x7f08064e

    .line 303
    .line 304
    .line 305
    goto :goto_2

    .line 306
    :pswitch_6
    const v0, 0x7f080aea

    .line 307
    .line 308
    .line 309
    goto :goto_2

    .line 310
    :pswitch_7
    const v0, 0x7f080ae5

    .line 311
    .line 312
    .line 313
    :goto_2
    invoke-static {v0, v2}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    if-eqz v0, :cond_4

    .line 318
    .line 319
    if-eqz v1, :cond_3

    .line 320
    .line 321
    goto :goto_3

    .line 322
    :cond_3
    move v6, v7

    .line 323
    :goto_3
    invoke-virtual {v0, v6}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 327
    .line 328
    .line 329
    :cond_4
    new-instance v0, La/wg;

    .line 330
    .line 331
    const/4 v1, 0x5

    .line 332
    invoke-direct {v0, p0, p1, v1}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v8, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 336
    .line 337
    .line 338
    :goto_4
    return-void

    .line 339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_6
        :pswitch_1
    .end packed-switch
.end method
