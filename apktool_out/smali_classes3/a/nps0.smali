.class public final La/nps0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/nps0;",
        "La/yx5;",
        "<init>",
        "()V",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic O1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/fiu0;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/nps0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bonus_games/impl/databinding/FragmentTreasureBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/nps0;->O1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02ff

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/nps0;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/qir0;

    .line 12
    .line 13
    const/16 v1, 0x14

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, La/qir0;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance v2, La/moq0;

    .line 19
    .line 20
    const/16 v3, 0x1a

    .line 21
    .line 22
    invoke-direct {v2, p0, v3}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v3, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v4, La/moq0;

    .line 28
    .line 29
    const/16 v5, 0x1b

    .line 30
    .line 31
    invoke-direct {v4, v2, v5}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const-class v3, La/cqs0;

    .line 39
    .line 40
    sget-object v4, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    new-instance v4, La/p7r0;

    .line 47
    .line 48
    invoke-direct {v4, v2, v1}, La/p7r0;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    new-instance v1, La/p7r0;

    .line 52
    .line 53
    const/16 v5, 0x15

    .line 54
    .line 55
    invoke-direct {v1, v2, v5}, La/p7r0;-><init>(La/a8z;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v3, v4, v1, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, La/nps0;->M1:La/kiu0;

    .line 63
    .line 64
    sget-object v0, La/mps0;->a:La/mps0;

    .line 65
    .line 66
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, La/nps0;->N1:La/s0r;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, La/nps0;->G0()La/i6r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/i6r;->c:Lorg/xplatform/bonus_games/impl/treasure/presentation/views/NineTreasuresView;

    .line 6
    .line 7
    new-instance v0, La/ilp0;

    .line 8
    .line 9
    invoke-direct {v0, p0}, La/ilp0;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lorg/xplatform/bonus_games/impl/treasure/presentation/views/NineTreasuresView;->setOnSelectedListener(La/rh60;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, La/nps0;->M1:La/kiu0;

    .line 16
    .line 17
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, La/cqs0;

    .line 22
    .line 23
    iget-object p1, p1, La/cqs0;->b:La/s470;

    .line 24
    .line 25
    invoke-virtual {p0}, La/nps0;->G0()La/i6r;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v0, v0, La/i6r;->c:Lorg/xplatform/bonus_games/impl/treasure/presentation/views/NineTreasuresView;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v2, 0x3

    .line 39
    const/16 v3, 0x9

    .line 40
    .line 41
    const/16 v4, 0x10

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    sget-object v6, La/aqd0;->d:[I

    .line 45
    .line 46
    const/4 v7, 0x0

    .line 47
    const/4 v8, 0x2

    .line 48
    if-eq v1, v8, :cond_2

    .line 49
    .line 50
    if-ne v1, v2, :cond_1

    .line 51
    .line 52
    new-instance v1, La/nx50;

    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, v9, v7, v5}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    .line 63
    .line 64
    new-instance v10, La/htz;

    .line 65
    .line 66
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v10, v1, La/nx50;->b:La/rh60;

    .line 70
    .line 71
    const/16 v10, 0x8

    .line 72
    .line 73
    iput v10, v1, La/nx50;->c:I

    .line 74
    .line 75
    sget-object v10, La/mx50;->a:La/mx50;

    .line 76
    .line 77
    iput-object v10, v1, La/nx50;->d:La/mx50;

    .line 78
    .line 79
    invoke-virtual {v9}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-virtual {v9, v7, v6, v5, v5}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    :try_start_0
    invoke-virtual {v6, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    iput v4, v1, La/nx50;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 97
    .line 98
    .line 99
    move v4, v5

    .line 100
    :goto_0
    if-ge v4, v3, :cond_0

    .line 101
    .line 102
    new-instance v6, La/z9c;

    .line 103
    .line 104
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-direct {v6, v9}, La/z9c;-><init>(Landroid/content/Context;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 115
    .line 116
    .line 117
    new-instance v9, La/z08;

    .line 118
    .line 119
    const/16 v10, 0xc

    .line 120
    .line 121
    invoke-direct {v9, v1, v4, v10}, La/z08;-><init>(Ljava/lang/Object;IB)V

    .line 122
    .line 123
    .line 124
    invoke-static {v6, v9}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6, v1}, La/z9c;->setListener(La/sps0;)V

    .line 128
    .line 129
    .line 130
    add-int/lit8 v4, v4, 0x1

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :catchall_0
    move-exception p0

    .line 138
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 139
    .line 140
    .line 141
    throw p0

    .line 142
    :cond_1
    invoke-static {}, La/e9d0;->o()V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_2
    new-instance v1, La/ox50;

    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-direct {v1, v9, v7, v5}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 156
    .line 157
    .line 158
    const/16 v10, 0x18

    .line 159
    .line 160
    iput v10, v1, La/ox50;->a:I

    .line 161
    .line 162
    invoke-virtual {v9}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-virtual {v10, v7, v6, v5, v5}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    :try_start_1
    invoke-virtual {v6, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    iput v4, v1, La/ox50;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    .line 179
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 180
    .line 181
    .line 182
    invoke-static {v5, v3}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v3}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    :goto_1
    move-object v4, v3

    .line 191
    check-cast v4, La/kkx;

    .line 192
    .line 193
    iget-boolean v4, v4, La/kkx;->c:Z

    .line 194
    .line 195
    if-eqz v4, :cond_3

    .line 196
    .line 197
    move-object v4, v3

    .line 198
    check-cast v4, La/bkx;

    .line 199
    .line 200
    invoke-virtual {v4}, La/bkx;->nextInt()I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    new-instance v6, La/htg0;

    .line 205
    .line 206
    invoke-direct {v6, v9}, La/htg0;-><init>(Landroid/content/Context;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v6, v1}, La/htg0;->setListener(La/sps0;)V

    .line 210
    .line 211
    .line 212
    new-instance v10, La/nva;

    .line 213
    .line 214
    invoke-direct {v10, v1, v4, v2}, La/nva;-><init>(Ljava/lang/Object;IB)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v6, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 221
    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_3
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->setMotionEventSplittingEnabled(Z)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 228
    .line 229
    .line 230
    :goto_2
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    instance-of v3, v1, La/dqs0;

    .line 235
    .line 236
    if-eqz v3, :cond_4

    .line 237
    .line 238
    move-object v7, v1

    .line 239
    check-cast v7, La/dqs0;

    .line 240
    .line 241
    :cond_4
    iput-object v7, v0, Lorg/xplatform/bonus_games/impl/treasure/presentation/views/NineTreasuresView;->a:La/dqs0;

    .line 242
    .line 243
    iget-object v0, v0, Lorg/xplatform/bonus_games/impl/treasure/presentation/views/NineTreasuresView;->b:La/rh60;

    .line 244
    .line 245
    if-eqz v0, :cond_5

    .line 246
    .line 247
    if-eqz v7, :cond_5

    .line 248
    .line 249
    invoke-interface {v7, v0}, La/dqs0;->setOnSelectedListener(La/rh60;)V

    .line 250
    .line 251
    .line 252
    :cond_5
    invoke-virtual {p0}, La/nps0;->G0()La/i6r;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    iget-object v0, v0, La/i6r;->b:Landroid/widget/ImageView;

    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    if-eq p1, v8, :cond_7

    .line 263
    .line 264
    if-ne p1, v2, :cond_6

    .line 265
    .line 266
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    const p1, 0x7f0806fd

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    goto :goto_3

    .line 278
    :cond_6
    invoke-static {}, La/e9d0;->o()V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    const p1, 0x7f080bb6

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    :goto_3
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :catchall_1
    move-exception p0

    .line 298
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 299
    .line 300
    .line 301
    throw p0
.end method

.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/pps0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/pps0;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, La/pps0;->U1:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/iyi;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v1, La/fiu0;

    .line 24
    .line 25
    const-class v2, La/cqs0;

    .line 26
    .line 27
    iget-object v0, v0, La/iyi;->j:La/psi;

    .line 28
    .line 29
    invoke-static {v2, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {v1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, La/nps0;->L1:La/fiu0;

    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final D0()V
    .locals 8

    .line 1
    iget-object v0, p0, La/nps0;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/cqs0;

    .line 8
    .line 9
    iget-object v3, v1, La/cqs0;->l:La/p7m0;

    .line 10
    .line 11
    new-instance v5, La/rtq0;

    .line 12
    .line 13
    const/16 v1, 0xd

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    invoke-direct {v5, p0, v6, v1}, La/rtq0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/lkz;->a:La/lkz;

    .line 20
    .line 21
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, La/tsr0;

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    invoke-direct/range {v2 .. v7}, La/tsr0;-><init>(La/gmq;La/clz;La/rtq0;La/yje;S)V

    .line 37
    .line 38
    .line 39
    const/4 v3, 0x3

    .line 40
    invoke-static {v1, v6, v6, v2, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/cqs0;

    .line 48
    .line 49
    iget-object v0, v0, La/cqs0;->m:La/p7m0;

    .line 50
    .line 51
    new-instance v1, La/k6s0;

    .line 52
    .line 53
    invoke-direct {v1, p0, v6, v3}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    new-instance v4, La/tsr0;

    .line 69
    .line 70
    invoke-direct {v4, v0, p0, v1, v6}, La/tsr0;-><init>(La/gmq;La/clz;La/k6s0;La/yje;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v2, v6, v6, v4, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final G0()La/i6r;
    .locals 2

    .line 1
    sget-object v0, La/nps0;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/nps0;->N1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/i6r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/nps0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
