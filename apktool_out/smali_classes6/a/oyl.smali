.class public final La/oyl;
.super La/q4;
.source "SourceFile"


# static fields
.field public static final j:La/ek5;


# instance fields
.field public f:La/edl;

.field public g:Lkotlin/jvm/functions/Function2;

.field public h:La/uyl;

.field public i:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ek5;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ek5;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/oyl;->j:La/ek5;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final E(Ljava/util/List;Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    instance-of v1, v0, La/twl;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/4 p2, 0x0

    .line 39
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    add-int/lit8 v1, p2, 0x1

    .line 50
    .line 51
    if-ltz p2, :cond_3

    .line 52
    .line 53
    check-cast v0, La/twl;

    .line 54
    .line 55
    iget-boolean v0, v0, La/twl;->e:Z

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iput p2, p0, La/oyl;->i:I

    .line 60
    .line 61
    :cond_2
    move p2, v1

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    throw p0

    .line 68
    :cond_4
    return-void
.end method

.method public final f(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/q4;->A(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/eyl;

    .line 6
    .line 7
    invoke-interface {p0}, La/eyl;->a()La/uwl;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final n(La/xhe0;I)V
    .locals 5

    .line 1
    instance-of v0, p1, La/myl;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_c

    .line 6
    .line 7
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    check-cast p2, La/twl;

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/myl;

    .line 18
    .line 19
    iget-object v0, v0, La/myl;->u:Lorg/xplatform/uikit/components/chips/DsChip;

    .line 20
    .line 21
    iget-object v3, p2, La/twl;->f:La/wxl;

    .line 22
    .line 23
    invoke-static {v3}, La/sac;->r0(La/wxl;)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/chips/DsChip;->setStyle(I)V

    .line 28
    .line 29
    .line 30
    iget-object v3, p2, La/twl;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/chips/DsChip;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/chips/DsChip;->setEnabled(Z)V

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p2, La/twl;->e:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/chips/DsChip;->setSelected(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/chips/DsChip;->setValueText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/chips/DsChip;->setCount(Ljava/lang/Integer;)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/chips/DsChip;->setUnlimitedLines(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/chips/DsChip;->setTextMaxLines(Ljava/lang/Integer;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/chips/DsChip;->setBadge(La/vf5;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/chips/DsChip;->setTextActiveColor(Ljava/lang/Integer;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/chips/DsChip;->setBackgroundActiveColor(Ljava/lang/Integer;)V

    .line 63
    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/chips/DsChip;->setLeftIconRadius(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/chips/DsChip;->setRightIconRadius(F)V

    .line 70
    .line 71
    .line 72
    iget-object v1, p2, La/twl;->d:La/hwl;

    .line 73
    .line 74
    instance-of v3, v1, La/ewl;

    .line 75
    .line 76
    if-nez v3, :cond_b

    .line 77
    .line 78
    sget-object v3, La/gwl;->a:La/gwl;

    .line 79
    .line 80
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_0

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/chips/DsChip;->setIconTint(Landroid/content/res/ColorStateList;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    sget-object v3, La/fwl;->a:La/fwl;

    .line 91
    .line 92
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_a

    .line 97
    .line 98
    :goto_0
    iget-object v1, p2, La/twl;->b:La/nwl;

    .line 99
    .line 100
    instance-of v3, v1, La/iwl;

    .line 101
    .line 102
    if-nez v3, :cond_9

    .line 103
    .line 104
    instance-of v3, v1, La/kwl;

    .line 105
    .line 106
    if-nez v3, :cond_8

    .line 107
    .line 108
    sget-object v3, La/mwl;->a:La/mwl;

    .line 109
    .line 110
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_3

    .line 115
    .line 116
    instance-of v3, v1, La/jwl;

    .line 117
    .line 118
    if-eqz v3, :cond_1

    .line 119
    .line 120
    const v1, 0x7f080825

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/chips/DsChip;->setLeftIcon(I)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_1
    instance-of v3, v1, La/lwl;

    .line 128
    .line 129
    if-eqz v3, :cond_2

    .line 130
    .line 131
    check-cast v1, La/lwl;

    .line 132
    .line 133
    iget-object v1, v1, La/lwl;->a:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    const v4, 0x7f08080a

    .line 140
    .line 141
    .line 142
    invoke-static {v4, v3}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v0, v1, v3}, Lorg/xplatform/uikit/components/chips/DsChip;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_3
    :goto_1
    iget-object p2, p2, La/twl;->c:La/swl;

    .line 155
    .line 156
    if-eqz p2, :cond_7

    .line 157
    .line 158
    instance-of v1, p2, La/qwl;

    .line 159
    .line 160
    if-nez v1, :cond_6

    .line 161
    .line 162
    instance-of v1, p2, La/owl;

    .line 163
    .line 164
    if-nez v1, :cond_5

    .line 165
    .line 166
    instance-of v1, p2, La/pwl;

    .line 167
    .line 168
    if-nez v1, :cond_4

    .line 169
    .line 170
    instance-of p2, p2, La/rwl;

    .line 171
    .line 172
    if-eqz p2, :cond_7

    .line 173
    .line 174
    iget-object p2, p1, La/xhe0;->a:Landroid/view/View;

    .line 175
    .line 176
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-instance v0, La/dpl;

    .line 180
    .line 181
    const/4 v1, 0x4

    .line 182
    invoke-direct {v0, p0, p1, v1}, La/dpl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 183
    .line 184
    .line 185
    invoke-static {p2, v0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 190
    .line 191
    .line 192
    throw v2

    .line 193
    :cond_5
    throw v2

    .line 194
    :cond_6
    throw v2

    .line 195
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_8
    throw v2

    .line 200
    :cond_9
    throw v2

    .line 201
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_b
    throw v2

    .line 206
    :cond_c
    instance-of v0, p1, La/nyl;

    .line 207
    .line 208
    if-eqz v0, :cond_10

    .line 209
    .line 210
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 211
    .line 212
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    check-cast p0, La/txl;

    .line 220
    .line 221
    iget-object p0, p0, La/txl;->a:La/wyl;

    .line 222
    .line 223
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    if-eqz p0, :cond_e

    .line 228
    .line 229
    if-ne p0, v1, :cond_d

    .line 230
    .line 231
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    const p2, 0x7f040b66

    .line 239
    .line 240
    .line 241
    invoke-static {p2, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 242
    .line 243
    .line 244
    move-result p0

    .line 245
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    goto :goto_2

    .line 250
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_e
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    const p2, 0x7f040b0e

    .line 262
    .line 263
    .line 264
    invoke-static {p2, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    check-cast p1, La/nyl;

    .line 276
    .line 277
    iget-object p1, p1, La/nyl;->u:Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 278
    .line 279
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    instance-of p2, p1, Landroid/graphics/drawable/GradientDrawable;

    .line 284
    .line 285
    if-eqz p2, :cond_f

    .line 286
    .line 287
    move-object v2, p1

    .line 288
    check-cast v2, Landroid/graphics/drawable/GradientDrawable;

    .line 289
    .line 290
    :cond_f
    if-eqz v2, :cond_10

    .line 291
    .line 292
    invoke-virtual {v2, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 293
    .line 294
    .line 295
    :cond_10
    return-void
.end method

.method public final o(La/xhe0;ILjava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_12

    .line 9
    .line 10
    instance-of v0, p1, La/myl;

    .line 11
    .line 12
    if-eqz v0, :cond_12

    .line 13
    .line 14
    new-instance p0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_0

    .line 28
    .line 29
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast p3, Ljava/util/Collection;

    .line 37
    .line 38
    check-cast p3, Ljava/lang/Iterable;

    .line 39
    .line 40
    invoke-static {p0, p3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p1, La/myl;

    .line 49
    .line 50
    iget-object p1, p1, La/myl;->u:Lorg/xplatform/uikit/components/chips/DsChip;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    check-cast p0, Ljava/lang/Iterable;

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-eqz p2, :cond_11

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-nez p2, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    instance-of p3, p2, La/sxl;

    .line 75
    .line 76
    if-eqz p3, :cond_3

    .line 77
    .line 78
    check-cast p2, La/sxl;

    .line 79
    .line 80
    iget-boolean p2, p2, La/sxl;->a:Z

    .line 81
    .line 82
    invoke-virtual {p1, p2}, Lorg/xplatform/uikit/components/chips/DsChip;->setSelected(Z)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    instance-of p3, p2, La/pxl;

    .line 87
    .line 88
    if-eqz p3, :cond_4

    .line 89
    .line 90
    const/4 p2, 0x1

    .line 91
    invoke-virtual {p1, p2}, Lorg/xplatform/uikit/components/chips/DsChip;->setEnabled(Z)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    instance-of p3, p2, La/nxl;

    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    if-eqz p3, :cond_5

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/chips/DsChip;->setBadge(La/vf5;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    instance-of p3, p2, La/oxl;

    .line 105
    .line 106
    if-eqz p3, :cond_6

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/chips/DsChip;->setCount(Ljava/lang/Integer;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_6
    instance-of p3, p2, La/qxl;

    .line 113
    .line 114
    if-eqz p3, :cond_c

    .line 115
    .line 116
    check-cast p2, La/qxl;

    .line 117
    .line 118
    iget-object p2, p2, La/qxl;->a:La/nwl;

    .line 119
    .line 120
    instance-of p3, p2, La/iwl;

    .line 121
    .line 122
    if-nez p3, :cond_b

    .line 123
    .line 124
    instance-of p3, p2, La/kwl;

    .line 125
    .line 126
    if-nez p3, :cond_a

    .line 127
    .line 128
    instance-of p3, p2, La/jwl;

    .line 129
    .line 130
    if-eqz p3, :cond_7

    .line 131
    .line 132
    const p2, 0x7f080825

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, p2}, Lorg/xplatform/uikit/components/chips/DsChip;->setLeftIcon(I)V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_7
    instance-of p3, p2, La/lwl;

    .line 140
    .line 141
    if-eqz p3, :cond_8

    .line 142
    .line 143
    check-cast p2, La/lwl;

    .line 144
    .line 145
    iget-object p2, p2, La/lwl;->a:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    const v0, 0x7f08080a

    .line 152
    .line 153
    .line 154
    invoke-static {v0, p3}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    invoke-virtual {p1, p2, p3}, Lorg/xplatform/uikit/components/chips/DsChip;->e(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_8
    sget-object p3, La/mwl;->a:La/mwl;

    .line 163
    .line 164
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-eqz p2, :cond_9

    .line 169
    .line 170
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/chips/DsChip;->setLeftIcon(Landroid/graphics/drawable/Drawable;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_a
    throw v0

    .line 179
    :cond_b
    throw v0

    .line 180
    :cond_c
    instance-of p3, p2, La/rxl;

    .line 181
    .line 182
    if-eqz p3, :cond_1

    .line 183
    .line 184
    check-cast p2, La/rxl;

    .line 185
    .line 186
    iget-object p2, p2, La/rxl;->a:La/swl;

    .line 187
    .line 188
    instance-of p3, p2, La/qwl;

    .line 189
    .line 190
    if-nez p3, :cond_10

    .line 191
    .line 192
    instance-of p3, p2, La/owl;

    .line 193
    .line 194
    if-nez p3, :cond_f

    .line 195
    .line 196
    sget-object p3, La/rwl;->a:La/rwl;

    .line 197
    .line 198
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result p3

    .line 202
    if-eqz p3, :cond_d

    .line 203
    .line 204
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/chips/DsChip;->setRightIcon(Landroid/graphics/drawable/Drawable;)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :cond_d
    instance-of p0, p2, La/pwl;

    .line 210
    .line 211
    if-nez p0, :cond_e

    .line 212
    .line 213
    invoke-static {}, La/t9f;->b()V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_e
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 218
    .line 219
    .line 220
    throw v0

    .line 221
    :cond_f
    throw v0

    .line 222
    :cond_10
    throw v0

    .line 223
    :cond_11
    return-void

    .line 224
    :cond_12
    invoke-virtual {p0, p1, p2}, La/oyl;->n(La/xhe0;I)V

    .line 225
    .line 226
    .line 227
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 3

    .line 1
    sget-object p0, La/uwl;->d:La/c0o;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, La/c0o;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/uwl;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    const/4 v0, 0x0

    .line 17
    if-ne p0, p2, :cond_0

    .line 18
    .line 19
    new-instance p0, Lorg/xplatform/uikit/components/chips/DsChip;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1, v0}, Lorg/xplatform/uikit/components/chips/DsChip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    const v0, 0x7f0706b7

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    const/4 v0, -0x2

    .line 49
    invoke-direct {p1, v0, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const p2, 0x7f070717

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const v1, 0x7f07072d

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-virtual {p0, p1, v0, p2, v1}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 94
    .line 95
    .line 96
    new-instance p1, La/myl;

    .line 97
    .line 98
    invoke-direct {p1, p0}, La/myl;-><init>(Lorg/xplatform/uikit/components/chips/DsChip;)V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_1
    new-instance p0, La/nyl;

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    const v0, 0x7f0d018d

    .line 117
    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-direct {p0, p1}, La/nyl;-><init>(Landroid/view/View;)V

    .line 128
    .line 129
    .line 130
    return-object p0
.end method
