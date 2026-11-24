.class public final Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/nq8;

.field public final b:Z

.field public final c:La/bg5;

.field public final d:La/a8z;

.field public final e:La/a8z;

.field public final f:La/a8z;

.field public final g:La/a8z;

.field public final h:La/a8z;

.field public final i:La/a8z;

.field public final j:La/a8z;

.field public final k:La/a8z;

.field public l:I

.field public m:La/wg3;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const v3, 0x7f0d0033

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    const v2, 0x7f0a09bb

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    new-instance v0, La/nq8;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-direct {v0, p0, v3, v2}, La/nq8;-><init>(Landroid/view/View;Landroid/view/View;B)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->a:La/nq8;

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-ne v0, v2, :cond_0

    .line 51
    .line 52
    move v0, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v0, v1

    .line 55
    :goto_0
    iput-boolean v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->b:Z

    .line 56
    .line 57
    new-instance v4, La/bg5;

    .line 58
    .line 59
    invoke-direct {v4}, La/qv5;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance v5, La/gh5;

    .line 63
    .line 64
    const/4 v6, 0x4

    .line 65
    invoke-direct {v5, v6}, La/gh5;-><init>(B)V

    .line 66
    .line 67
    .line 68
    new-instance v6, La/ij4;

    .line 69
    .line 70
    const/16 v7, 0x15

    .line 71
    .line 72
    invoke-direct {v6, v7}, La/ij4;-><init>(B)V

    .line 73
    .line 74
    .line 75
    new-instance v7, La/lq4;

    .line 76
    .line 77
    const/4 v8, 0x5

    .line 78
    const/4 v9, 0x3

    .line 79
    invoke-direct {v7, v9, v8}, La/lq4;-><init>(IB)V

    .line 80
    .line 81
    .line 82
    sget-object v8, La/zx3;->o:La/zx3;

    .line 83
    .line 84
    new-instance v10, La/gbn;

    .line 85
    .line 86
    invoke-direct {v10, v5, v7, v6, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 87
    .line 88
    .line 89
    iget-object v5, v4, La/zz3;->d:La/dp;

    .line 90
    .line 91
    invoke-virtual {v5, v10}, La/dp;->b(La/gbn;)V

    .line 92
    .line 93
    .line 94
    new-instance v6, La/o33;

    .line 95
    .line 96
    const/16 v7, 0x8

    .line 97
    .line 98
    invoke-direct {v6, v7}, La/o33;-><init>(B)V

    .line 99
    .line 100
    .line 101
    new-instance v8, La/or3;

    .line 102
    .line 103
    const/16 v10, 0x9

    .line 104
    .line 105
    invoke-direct {v8, v10}, La/or3;-><init>(B)V

    .line 106
    .line 107
    .line 108
    new-instance v10, La/l9;

    .line 109
    .line 110
    const/16 v11, 0x16

    .line 111
    .line 112
    invoke-direct {v10, v9, v11}, La/l9;-><init>(IB)V

    .line 113
    .line 114
    .line 115
    sget-object v11, La/zx3;->b:La/zx3;

    .line 116
    .line 117
    new-instance v12, La/gbn;

    .line 118
    .line 119
    invoke-direct {v12, v6, v10, v8, v11}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5, v12}, La/dp;->b(La/gbn;)V

    .line 123
    .line 124
    .line 125
    new-instance v6, La/gcl0;

    .line 126
    .line 127
    const/16 v8, 0x10

    .line 128
    .line 129
    invoke-direct {v6, v8}, La/gcl0;-><init>(B)V

    .line 130
    .line 131
    .line 132
    new-instance v8, La/f8l0;

    .line 133
    .line 134
    invoke-direct {v8, v9}, La/f8l0;-><init>(B)V

    .line 135
    .line 136
    .line 137
    new-instance v10, La/asj0;

    .line 138
    .line 139
    invoke-direct {v10, v9, v7}, La/asj0;-><init>(IB)V

    .line 140
    .line 141
    .line 142
    sget-object v11, La/wjj0;->o:La/wjj0;

    .line 143
    .line 144
    new-instance v12, La/gbn;

    .line 145
    .line 146
    invoke-direct {v12, v6, v10, v8, v11}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5, v12}, La/dp;->b(La/gbn;)V

    .line 150
    .line 151
    .line 152
    new-instance v6, La/svj;

    .line 153
    .line 154
    const/16 v8, 0x1c

    .line 155
    .line 156
    invoke-direct {v6, v8}, La/svj;-><init>(B)V

    .line 157
    .line 158
    .line 159
    new-instance v8, La/vbk;

    .line 160
    .line 161
    const/16 v10, 0x1b

    .line 162
    .line 163
    invoke-direct {v8, v10}, La/vbk;-><init>(B)V

    .line 164
    .line 165
    .line 166
    new-instance v10, La/e9k;

    .line 167
    .line 168
    invoke-direct {v10, v9, v7}, La/e9k;-><init>(IB)V

    .line 169
    .line 170
    .line 171
    sget-object v7, La/zdh;->u:La/zdh;

    .line 172
    .line 173
    new-instance v11, La/gbn;

    .line 174
    .line 175
    invoke-direct {v11, v6, v10, v8, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5, v11}, La/dp;->b(La/gbn;)V

    .line 179
    .line 180
    .line 181
    iput-object v4, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->c:La/bg5;

    .line 182
    .line 183
    new-instance v4, La/yg3;

    .line 184
    .line 185
    invoke-direct {v4, p1, v1}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 186
    .line 187
    .line 188
    sget-object v5, La/wez;->b:La/wez;

    .line 189
    .line 190
    invoke-static {v5, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    iput-object v4, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->d:La/a8z;

    .line 195
    .line 196
    new-instance v4, La/yg3;

    .line 197
    .line 198
    invoke-direct {v4, p1, v2}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 199
    .line 200
    .line 201
    invoke-static {v5, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    iput-object v4, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->e:La/a8z;

    .line 206
    .line 207
    new-instance v4, La/yg3;

    .line 208
    .line 209
    const/4 v6, 0x2

    .line 210
    invoke-direct {v4, p1, v6}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 211
    .line 212
    .line 213
    invoke-static {v5, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    iput-object v4, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->f:La/a8z;

    .line 218
    .line 219
    new-instance v4, La/yg3;

    .line 220
    .line 221
    invoke-direct {v4, p1, v9}, La/yg3;-><init>(Landroid/content/Context;B)V

    .line 222
    .line 223
    .line 224
    invoke-static {v5, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    iput-object v4, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->g:La/a8z;

    .line 229
    .line 230
    new-instance v4, La/f33;

    .line 231
    .line 232
    const/16 v7, 0xb

    .line 233
    .line 234
    invoke-direct {v4, v7}, La/f33;-><init>(B)V

    .line 235
    .line 236
    .line 237
    invoke-static {v5, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    iput-object v4, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->h:La/a8z;

    .line 242
    .line 243
    new-instance v4, La/f33;

    .line 244
    .line 245
    const/16 v7, 0xc

    .line 246
    .line 247
    invoke-direct {v4, v7}, La/f33;-><init>(B)V

    .line 248
    .line 249
    .line 250
    invoke-static {v5, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    iput-object v4, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->i:La/a8z;

    .line 255
    .line 256
    new-instance v4, La/f33;

    .line 257
    .line 258
    const/16 v7, 0xd

    .line 259
    .line 260
    invoke-direct {v4, v7}, La/f33;-><init>(B)V

    .line 261
    .line 262
    .line 263
    invoke-static {v5, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    iput-object v4, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->j:La/a8z;

    .line 268
    .line 269
    new-instance v4, La/f33;

    .line 270
    .line 271
    const/16 v7, 0xe

    .line 272
    .line 273
    invoke-direct {v4, v7}, La/f33;-><init>(B)V

    .line 274
    .line 275
    .line 276
    invoke-static {v5, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    iput-object v4, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->k:La/a8z;

    .line 281
    .line 282
    sget-object v4, La/wg3;->b:La/wg3;

    .line 283
    .line 284
    iput-object v4, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->m:La/wg3;

    .line 285
    .line 286
    invoke-virtual {v3, v6}, Landroid/view/View;->setOverScrollMode(I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->setTouchscreenBlocksFocus(Z)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 293
    .line 294
    .line 295
    new-instance p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 296
    .line 297
    invoke-direct {p0, p1, v1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v3, p0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    const-string p1, "Missing required view with ID: "

    .line 316
    .line 317
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    throw v0
.end method

.method private final getArrowArray()[La/xx3;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->k:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [La/xx3;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getArrowSpace()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->f:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getBallSpace()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->e:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getBallsArray()[La/do5;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->i:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [La/do5;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getDotSpace()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->d:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getDotsArray()[La/e1l;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->j:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [La/e1l;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getSportsManSpace()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->g:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getSportsMenArray()[La/rtl0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->h:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, [La/rtl0;

    .line 8
    .line 9
    return-object p0
.end method

.method private final setItemDecoration(La/wg3;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p1, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getSportsManSpace()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    :goto_0
    move v1, p1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getArrowSpace()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getDotSpace()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    goto :goto_0

    .line 36
    :cond_3
    invoke-direct {p0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getBallSpace()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    goto :goto_0

    .line 41
    :goto_1
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->a:La/nq8;

    .line 42
    .line 43
    iget-object p0, p0, La/nq8;->c:Landroid/view/View;

    .line 44
    .line 45
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 46
    .line 47
    new-instance v0, La/qmk0;

    .line 48
    .line 49
    const/4 v8, 0x0

    .line 50
    const/16 v9, 0xde

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    const/4 v3, 0x0

    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    const/4 v7, 0x0

    .line 58
    invoke-direct/range {v0 .. v9}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 62
    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->l:I

    .line 6
    .line 7
    if-ge v1, v2, :cond_0

    .line 8
    .line 9
    goto/16 :goto_a

    .line 10
    .line 11
    :cond_0
    iget-object v2, v0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->m:La/wg3;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x1

    .line 19
    if-eqz v2, :cond_12

    .line 20
    .line 21
    const v5, 0x7f040b63

    .line 22
    .line 23
    .line 24
    const v6, 0x7f040b65

    .line 25
    .line 26
    .line 27
    const v7, 0x7f040b5f

    .line 28
    .line 29
    .line 30
    const/4 v8, 0x2

    .line 31
    if-eq v2, v4, :cond_d

    .line 32
    .line 33
    if-eq v2, v8, :cond_8

    .line 34
    .line 35
    const/4 v9, 0x3

    .line 36
    if-ne v2, v9, :cond_7

    .line 37
    .line 38
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getSportsMenArray()[La/rtl0;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    new-instance v9, Ljava/util/ArrayList;

    .line 43
    .line 44
    array-length v10, v2

    .line 45
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    array-length v10, v2

    .line 49
    move v11, v3

    .line 50
    move v12, v11

    .line 51
    :goto_0
    if-ge v11, v10, :cond_4

    .line 52
    .line 53
    aget-object v13, v2, v11

    .line 54
    .line 55
    add-int/lit8 v13, v12, 0x1

    .line 56
    .line 57
    iget v14, v0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->l:I

    .line 58
    .line 59
    if-gt v14, v12, :cond_1

    .line 60
    .line 61
    if-gt v12, v1, :cond_1

    .line 62
    .line 63
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getSportsMenArray()[La/rtl0;

    .line 64
    .line 65
    .line 66
    move-result-object v14

    .line 67
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getSportsMenArray()[La/rtl0;

    .line 68
    .line 69
    .line 70
    move-result-object v15

    .line 71
    aget-object v15, v15, v12

    .line 72
    .line 73
    move/from16 v16, v8

    .line 74
    .line 75
    const/4 v8, 0x4

    .line 76
    invoke-static {v15, v4, v7, v8}, La/rtl0;->c(La/rtl0;ZII)La/rtl0;

    .line 77
    .line 78
    .line 79
    move-result-object v8

    .line 80
    aput-object v8, v14, v12

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move/from16 v16, v8

    .line 84
    .line 85
    if-lt v12, v1, :cond_2

    .line 86
    .line 87
    if-ge v12, v14, :cond_3

    .line 88
    .line 89
    :cond_2
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getSportsMenArray()[La/rtl0;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getSportsMenArray()[La/rtl0;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    aget-object v14, v14, v12

    .line 98
    .line 99
    const/4 v15, 0x6

    .line 100
    invoke-static {v14, v3, v3, v15}, La/rtl0;->c(La/rtl0;ZII)La/rtl0;

    .line 101
    .line 102
    .line 103
    move-result-object v14

    .line 104
    aput-object v14, v8, v12

    .line 105
    .line 106
    :cond_3
    :goto_1
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    add-int/lit8 v11, v11, 0x1

    .line 112
    .line 113
    move v12, v13

    .line 114
    move/from16 v8, v16

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_4
    move/from16 v16, v8

    .line 118
    .line 119
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getSportsMenArray()[La/rtl0;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    array-length v2, v2

    .line 124
    sub-int/2addr v2, v4

    .line 125
    const/4 v4, 0x5

    .line 126
    if-ge v1, v2, :cond_5

    .line 127
    .line 128
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getSportsMenArray()[La/rtl0;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    add-int/lit8 v7, v1, 0x1

    .line 133
    .line 134
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getSportsMenArray()[La/rtl0;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    aget-object v8, v8, v7

    .line 139
    .line 140
    invoke-static {v8, v3, v6, v4}, La/rtl0;->c(La/rtl0;ZII)La/rtl0;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    aput-object v6, v2, v7

    .line 145
    .line 146
    :cond_5
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getSportsMenArray()[La/rtl0;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    array-length v2, v2

    .line 151
    add-int/lit8 v2, v2, -0x2

    .line 152
    .line 153
    if-ge v1, v2, :cond_6

    .line 154
    .line 155
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getSportsMenArray()[La/rtl0;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    add-int/lit8 v6, v1, 0x2

    .line 160
    .line 161
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getSportsMenArray()[La/rtl0;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    aget-object v7, v7, v6

    .line 166
    .line 167
    invoke-static {v7, v3, v5, v4}, La/rtl0;->c(La/rtl0;ZII)La/rtl0;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    aput-object v3, v2, v6

    .line 172
    .line 173
    :cond_6
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getSportsMenArray()[La/rtl0;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, [La/xg3;

    .line 178
    .line 179
    goto/16 :goto_8

    .line 180
    .line 181
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :cond_8
    move/from16 v16, v8

    .line 186
    .line 187
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getArrowArray()[La/xx3;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    new-instance v8, Ljava/util/ArrayList;

    .line 192
    .line 193
    array-length v9, v2

    .line 194
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 195
    .line 196
    .line 197
    array-length v9, v2

    .line 198
    move v10, v3

    .line 199
    :goto_2
    if-ge v3, v9, :cond_a

    .line 200
    .line 201
    aget-object v11, v2, v3

    .line 202
    .line 203
    add-int/lit8 v11, v10, 0x1

    .line 204
    .line 205
    if-gt v10, v1, :cond_9

    .line 206
    .line 207
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getArrowArray()[La/xx3;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getArrowArray()[La/xx3;

    .line 212
    .line 213
    .line 214
    move-result-object v13

    .line 215
    aget-object v13, v13, v10

    .line 216
    .line 217
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    new-instance v13, La/xx3;

    .line 221
    .line 222
    invoke-direct {v13, v7}, La/xx3;-><init>(I)V

    .line 223
    .line 224
    .line 225
    aput-object v13, v12, v10

    .line 226
    .line 227
    :cond_9
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 228
    .line 229
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    add-int/lit8 v3, v3, 0x1

    .line 233
    .line 234
    move v10, v11

    .line 235
    goto :goto_2

    .line 236
    :cond_a
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getArrowArray()[La/xx3;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    array-length v2, v2

    .line 241
    sub-int/2addr v2, v4

    .line 242
    if-ge v1, v2, :cond_b

    .line 243
    .line 244
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getArrowArray()[La/xx3;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    add-int/lit8 v3, v1, 0x1

    .line 249
    .line 250
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getArrowArray()[La/xx3;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    aget-object v4, v4, v3

    .line 255
    .line 256
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    new-instance v4, La/xx3;

    .line 260
    .line 261
    invoke-direct {v4, v6}, La/xx3;-><init>(I)V

    .line 262
    .line 263
    .line 264
    aput-object v4, v2, v3

    .line 265
    .line 266
    :cond_b
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getArrowArray()[La/xx3;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    array-length v2, v2

    .line 271
    add-int/lit8 v2, v2, -0x2

    .line 272
    .line 273
    if-ge v1, v2, :cond_c

    .line 274
    .line 275
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getArrowArray()[La/xx3;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    add-int/lit8 v3, v1, 0x2

    .line 280
    .line 281
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getArrowArray()[La/xx3;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    aget-object v4, v4, v3

    .line 286
    .line 287
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    new-instance v4, La/xx3;

    .line 291
    .line 292
    invoke-direct {v4, v5}, La/xx3;-><init>(I)V

    .line 293
    .line 294
    .line 295
    aput-object v4, v2, v3

    .line 296
    .line 297
    :cond_c
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getArrowArray()[La/xx3;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    check-cast v2, [La/xg3;

    .line 302
    .line 303
    goto/16 :goto_8

    .line 304
    .line 305
    :cond_d
    move/from16 v16, v8

    .line 306
    .line 307
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getDotsArray()[La/e1l;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    new-instance v4, Ljava/util/ArrayList;

    .line 312
    .line 313
    array-length v8, v2

    .line 314
    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 315
    .line 316
    .line 317
    array-length v8, v2

    .line 318
    move v9, v3

    .line 319
    :goto_3
    if-ge v3, v8, :cond_f

    .line 320
    .line 321
    aget-object v10, v2, v3

    .line 322
    .line 323
    add-int/lit8 v10, v9, 0x1

    .line 324
    .line 325
    if-gt v9, v1, :cond_e

    .line 326
    .line 327
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getDotsArray()[La/e1l;

    .line 328
    .line 329
    .line 330
    move-result-object v11

    .line 331
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getDotsArray()[La/e1l;

    .line 332
    .line 333
    .line 334
    move-result-object v12

    .line 335
    aget-object v12, v12, v9

    .line 336
    .line 337
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    new-instance v12, La/e1l;

    .line 341
    .line 342
    invoke-direct {v12, v7}, La/e1l;-><init>(I)V

    .line 343
    .line 344
    .line 345
    aput-object v12, v11, v9

    .line 346
    .line 347
    :cond_e
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 348
    .line 349
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    add-int/lit8 v3, v3, 0x1

    .line 353
    .line 354
    move v9, v10

    .line 355
    goto :goto_3

    .line 356
    :cond_f
    add-int/lit8 v2, v1, 0x1

    .line 357
    .line 358
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getDotsArray()[La/e1l;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    array-length v3, v3

    .line 363
    if-ge v2, v3, :cond_10

    .line 364
    .line 365
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getDotsArray()[La/e1l;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getDotsArray()[La/e1l;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    aget-object v4, v4, v2

    .line 374
    .line 375
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    new-instance v4, La/e1l;

    .line 379
    .line 380
    invoke-direct {v4, v6}, La/e1l;-><init>(I)V

    .line 381
    .line 382
    .line 383
    aput-object v4, v3, v2

    .line 384
    .line 385
    :cond_10
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getDotsArray()[La/e1l;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    array-length v2, v2

    .line 390
    add-int/lit8 v2, v2, -0x2

    .line 391
    .line 392
    if-ge v1, v2, :cond_11

    .line 393
    .line 394
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getDotsArray()[La/e1l;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    add-int/lit8 v3, v1, 0x2

    .line 399
    .line 400
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getDotsArray()[La/e1l;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    aget-object v4, v4, v3

    .line 405
    .line 406
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    new-instance v4, La/e1l;

    .line 410
    .line 411
    invoke-direct {v4, v5}, La/e1l;-><init>(I)V

    .line 412
    .line 413
    .line 414
    aput-object v4, v2, v3

    .line 415
    .line 416
    :cond_11
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getDotsArray()[La/e1l;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    check-cast v2, [La/xg3;

    .line 421
    .line 422
    goto/16 :goto_8

    .line 423
    .line 424
    :cond_12
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getBallsArray()[La/do5;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    new-instance v5, Ljava/util/ArrayList;

    .line 429
    .line 430
    array-length v6, v2

    .line 431
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 432
    .line 433
    .line 434
    array-length v6, v2

    .line 435
    move v7, v3

    .line 436
    move v8, v7

    .line 437
    :goto_4
    if-ge v7, v6, :cond_15

    .line 438
    .line 439
    aget-object v9, v2, v7

    .line 440
    .line 441
    add-int/lit8 v9, v8, 0x1

    .line 442
    .line 443
    if-gt v8, v1, :cond_14

    .line 444
    .line 445
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getBallsArray()[La/do5;

    .line 446
    .line 447
    .line 448
    move-result-object v10

    .line 449
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getBallsArray()[La/do5;

    .line 450
    .line 451
    .line 452
    move-result-object v11

    .line 453
    aget-object v11, v11, v8

    .line 454
    .line 455
    if-ne v8, v1, :cond_13

    .line 456
    .line 457
    move v12, v4

    .line 458
    goto :goto_5

    .line 459
    :cond_13
    move v12, v3

    .line 460
    :goto_5
    packed-switch v8, :pswitch_data_0

    .line 461
    .line 462
    .line 463
    goto :goto_7

    .line 464
    :pswitch_0
    const v13, 0x7f080661

    .line 465
    .line 466
    .line 467
    goto :goto_6

    .line 468
    :pswitch_1
    const v13, 0x7f080660

    .line 469
    .line 470
    .line 471
    goto :goto_6

    .line 472
    :pswitch_2
    const v13, 0x7f08065f

    .line 473
    .line 474
    .line 475
    goto :goto_6

    .line 476
    :pswitch_3
    const v13, 0x7f08065e

    .line 477
    .line 478
    .line 479
    goto :goto_6

    .line 480
    :pswitch_4
    const v13, 0x7f08065d

    .line 481
    .line 482
    .line 483
    goto :goto_6

    .line 484
    :pswitch_5
    const v13, 0x7f08065c

    .line 485
    .line 486
    .line 487
    goto :goto_6

    .line 488
    :pswitch_6
    const v13, 0x7f08065b

    .line 489
    .line 490
    .line 491
    goto :goto_6

    .line 492
    :pswitch_7
    const v13, 0x7f08065a

    .line 493
    .line 494
    .line 495
    :goto_6
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    new-instance v11, La/do5;

    .line 499
    .line 500
    invoke-direct {v11, v12, v13}, La/do5;-><init>(ZI)V

    .line 501
    .line 502
    .line 503
    aput-object v11, v10, v8

    .line 504
    .line 505
    :cond_14
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 506
    .line 507
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    add-int/lit8 v7, v7, 0x1

    .line 511
    .line 512
    move v8, v9

    .line 513
    goto :goto_4

    .line 514
    :cond_15
    :goto_7
    invoke-direct {v0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->getBallsArray()[La/do5;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    check-cast v2, [La/xg3;

    .line 519
    .line 520
    :goto_8
    iput v1, v0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->l:I

    .line 521
    .line 522
    iget-object v1, v0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->c:La/bg5;

    .line 523
    .line 524
    iget-object v3, v1, La/zz3;->e:La/yz3;

    .line 525
    .line 526
    iget-object v3, v3, La/yz3;->f:Ljava/util/List;

    .line 527
    .line 528
    invoke-static {v2}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 529
    .line 530
    .line 531
    move-result-object v4

    .line 532
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result v3

    .line 536
    if-nez v3, :cond_18

    .line 537
    .line 538
    iget-boolean v0, v0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->b:Z

    .line 539
    .line 540
    if-eqz v0, :cond_17

    .line 541
    .line 542
    array-length v0, v2

    .line 543
    if-nez v0, :cond_16

    .line 544
    .line 545
    sget-object v0, La/iun;->a:La/iun;

    .line 546
    .line 547
    goto :goto_9

    .line 548
    :cond_16
    invoke-static {v2}, La/tx3;->j0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 553
    .line 554
    .line 555
    goto :goto_9

    .line 556
    :cond_17
    invoke-static {v2}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    :goto_9
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 561
    .line 562
    .line 563
    :cond_18
    :goto_a
    return-void

    .line 564
    nop

    .line 565
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->a:La/nq8;

    .line 5
    .line 6
    iget-object v0, v0, La/nq8;->c:Landroid/view/View;

    .line 7
    .line 8
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 9
    .line 10
    iget-object p0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->c:La/bg5;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->a:La/nq8;

    .line 2
    .line 3
    iget-object v0, v0, La/nq8;->c:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/FrozenRecyclerView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lorg/xplatform/app_start/impl/presentation/view/content/loader/AppStartLoaderView$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lorg/xplatform/app_start/impl/presentation/view/content/loader/AppStartLoaderView$SavedState;

    .line 6
    .line 7
    iget-object v0, p1, Lorg/xplatform/app_start/impl/presentation/view/content/loader/AppStartLoaderView$SavedState;->b:La/wg3;

    .line 8
    .line 9
    iput-object v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->m:La/wg3;

    .line 10
    .line 11
    iget v0, p1, Lorg/xplatform/app_start/impl/presentation/view/content/loader/AppStartLoaderView$SavedState;->c:I

    .line 12
    .line 13
    iput v0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->l:I

    .line 14
    .line 15
    iget-object p1, p1, Lorg/xplatform/app_start/impl/presentation/view/content/loader/AppStartLoaderView$SavedState;->a:Landroid/os/Parcelable;

    .line 16
    .line 17
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/AppStartLoaderView$SavedState;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->m:La/wg3;

    .line 8
    .line 9
    iget p0, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->l:I

    .line 10
    .line 11
    invoke-direct {v0, v1, v2, p0}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/AppStartLoaderView$SavedState;-><init>(Landroid/os/Parcelable;La/wg3;I)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final setContainerLayoutParams(La/jj3;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, La/jj3;->a:I

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->setId(I)V

    .line 7
    .line 8
    .line 9
    new-instance v0, La/a3e;

    .line 10
    .line 11
    iget-short v1, p1, La/jj3;->b:S

    .line 12
    .line 13
    iget-short v2, p1, La/jj3;->c:S

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, La/a3e;-><init>(II)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, p1}, La/r7x;->E(La/a3e;La/jj3;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1}, La/mym0;->q(Landroid/view/View;La/jj3;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final setLoaderType(La/wg3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->m:La/wg3;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lorg/xplatform/app_start/impl/presentation/view/content/loader/b;->setItemDecoration(La/wg3;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
