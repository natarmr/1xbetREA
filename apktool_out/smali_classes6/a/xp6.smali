.class public final La/xp6;
.super La/nju0;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/xp6;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, La/xp6;->b:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 16
    iput-byte p2, p0, La/xp6;->a:B

    iput-object p1, p0, La/xp6;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/xp6;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/xp6;->b:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :sswitch_0
    check-cast p0, La/i820;

    .line 10
    .line 11
    invoke-static {p0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :sswitch_1
    check-cast p0, La/a720;

    .line 16
    .line 17
    invoke-static {p0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :sswitch_2
    check-cast p0, La/lrd;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-virtual {p0, p1}, La/lrd;->b(Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :sswitch_3
    :try_start_0
    check-cast p0, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, La/nju0;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, La/nju0;->a(I)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception p0

    .line 51
    const-string p1, "Adding and removing callbacks during dispatch to callbacks is not supported"

    .line 52
    .line 53
    invoke-static {p1, p0}, La/hny;->q(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void

    .line 57
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_3
        0x7 -> :sswitch_2
        0x9 -> :sswitch_1
        0xb -> :sswitch_0
    .end sparse-switch
.end method

.method public b(IFI)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/xp6;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/xp6;->b:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :sswitch_0
    check-cast p0, La/sbx0;

    .line 10
    .line 11
    invoke-virtual {p0, p2, p1}, La/sbx0;->i(FI)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :sswitch_1
    const/4 p3, 0x0

    .line 16
    cmpg-float p2, p2, p3

    .line 17
    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    check-cast p0, La/npn0;

    .line 21
    .line 22
    sget-object p2, La/npn0;->j2:La/g9m0;

    .line 23
    .line 24
    invoke-virtual {p0}, La/npn0;->U0()La/tpn0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iget-object p2, p0, La/tpn0;->n:La/p7m0;

    .line 29
    .line 30
    invoke-virtual {p2}, La/p7m0;->d()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, La/rpn0;

    .line 39
    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    iget p2, p2, La/rpn0;->d:I

    .line 43
    .line 44
    if-ne p2, p1, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p0, p1}, La/tpn0;->w(I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void

    .line 51
    :sswitch_2
    :try_start_0
    check-cast p0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, La/nju0;

    .line 68
    .line 69
    invoke-virtual {v0, p1, p2, p3}, La/nju0;->b(IFI)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :catch_0
    move-exception p0

    .line 74
    const-string p1, "Adding and removing callbacks during dispatch to callbacks is not supported"

    .line 75
    .line 76
    invoke-static {p1, p0}, La/hny;->q(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    return-void

    .line 80
    nop

    .line 81
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_2
        0xc -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public c(I)V
    .locals 11

    .line 1
    iget-byte v0, p0, La/xp6;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/xp6;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    :pswitch_0
    return-void

    .line 12
    :pswitch_1
    check-cast p0, La/l6v0;

    .line 13
    .line 14
    add-int/lit8 v0, p1, 0x1

    .line 15
    .line 16
    sget-object v1, La/l6v0;->P1:La/sxs0;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/l6v0;->I0(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, La/l6v0;->G0()La/k2r;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p0, p0, La/k2r;->b:Lorg/xplatform/games_section/feature/weekly_reward/presentation/custom_veiw/DaysProgressView;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lorg/xplatform/games_section/feature/weekly_reward/presentation/custom_veiw/DaysProgressView;->setSelectedDay(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_2
    check-cast p0, La/u2s0;

    .line 32
    .line 33
    sget-object v0, La/u2s0;->X1:La/s2m0;

    .line 34
    .line 35
    invoke-virtual {p0}, La/u2s0;->H0()La/o6j;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p1, v2, :cond_0

    .line 40
    .line 41
    move v1, v2

    .line 42
    :cond_0
    iget-object p0, p0, La/o6j;->j:La/p7m0;

    .line 43
    .line 44
    invoke-static {v1, p0, v3}, La/twn;->A(ZLa/p7m0;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_3
    check-cast p0, La/ikr0;

    .line 49
    .line 50
    invoke-virtual {p0}, La/ikr0;->W0()La/jkr0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v0, v0, La/jkr0;->d:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 55
    .line 56
    invoke-static {v0, v3}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->f(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Lkotlin/jvm/functions/Function1;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->setSelectedPosition(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, La/j120;->X(Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    new-instance p1, La/lcr0;

    .line 66
    .line 67
    const/4 v1, 0x5

    .line 68
    invoke-direct {p1, p0, v1}, La/lcr0;-><init>(Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0, p1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->f(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Lkotlin/jvm/functions/Function1;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_4
    check-cast p0, La/noq0;

    .line 76
    .line 77
    sget-object v0, La/noq0;->m2:La/y2m0;

    .line 78
    .line 79
    iget-object v0, p0, La/noq0;->f2:La/zz2;

    .line 80
    .line 81
    sget-object v1, La/noq0;->n2:[La/iiy;

    .line 82
    .line 83
    aget-object v3, v1, v2

    .line 84
    .line 85
    invoke-virtual {v0, p0, v3, p1}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, La/noq0;->U0()La/qjk;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object v0, p1, La/qjk;->e:Landroid/widget/FrameLayout;

    .line 93
    .line 94
    new-instance v3, La/qaq0;

    .line 95
    .line 96
    const/4 v4, 0x4

    .line 97
    invoke-direct {v3, p1, p0, v4}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, La/noq0;->Y0()La/xoq0;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p0}, La/noq0;->X0()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-virtual {p0}, La/noq0;->V0()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    add-int/2addr v3, v2

    .line 116
    invoke-virtual {p0}, La/noq0;->T0()La/ioq0;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    iget-object v5, v5, La/i26;->f:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v5, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    iget-object v6, p0, La/noq0;->i2:La/phf0;

    .line 129
    .line 130
    aget-object v1, v1, v4

    .line 131
    .line 132
    invoke-virtual {v6, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v1, p1, La/xoq0;->j0:La/fk60;

    .line 140
    .line 141
    if-eqz v1, :cond_1

    .line 142
    .line 143
    iget-byte v1, v1, La/fk60;->a:B

    .line 144
    .line 145
    sget-object v4, La/fk60;->b:La/uuz;

    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    sget-object v4, La/fk60;->c:Ljava/util/Set;

    .line 151
    .line 152
    check-cast v4, Ljava/lang/Iterable;

    .line 153
    .line 154
    invoke-static {v1}, La/uuz;->e(I)La/fk60;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v4, v1}, Lkotlin/collections/CollectionsKt;->L(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-ne v1, v2, :cond_1

    .line 163
    .line 164
    iget-object p1, p1, La/xoq0;->a0:La/zg;

    .line 165
    .line 166
    invoke-virtual {p1, v0, v3, v5, p0}, La/zg;->b(IIILjava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :cond_1
    return-void

    .line 170
    :pswitch_5
    check-cast p0, La/i820;

    .line 171
    .line 172
    sget-object v0, La/i820;->U1:La/atz;

    .line 173
    .line 174
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    iget-object v0, v0, La/ozq;->q:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 179
    .line 180
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->getSegmentsSize()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-le v0, p1, :cond_2

    .line 185
    .line 186
    invoke-virtual {p0}, La/i820;->G0()La/ozq;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    iget-object v0, v0, La/ozq;->q:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 191
    .line 192
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->setSelectedPosition(I)V

    .line 193
    .line 194
    .line 195
    :cond_2
    iput p1, p0, La/i820;->R1:I

    .line 196
    .line 197
    return-void

    .line 198
    :pswitch_6
    check-cast p0, La/c720;

    .line 199
    .line 200
    invoke-virtual {p0}, La/c720;->V0()La/c6q;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    iget-object v0, v0, La/c6q;->b:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 205
    .line 206
    invoke-static {v0, v3}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->f(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Lkotlin/jvm/functions/Function1;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->setSelectedPosition(I)V

    .line 210
    .line 211
    .line 212
    new-instance p1, La/km00;

    .line 213
    .line 214
    const/16 v1, 0x12

    .line 215
    .line 216
    invoke-direct {p1, p0, v1}, La/km00;-><init>(Ljava/lang/Object;B)V

    .line 217
    .line 218
    .line 219
    invoke-static {v0, p1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->f(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Lkotlin/jvm/functions/Function1;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v0}, La/j120;->X(Landroid/view/View;)V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :pswitch_7
    move-object v0, p0

    .line 227
    check-cast v0, La/yr10;

    .line 228
    .line 229
    sget-object p0, La/yr10;->R1:La/wsz;

    .line 230
    .line 231
    iget-object p0, v0, La/yr10;->M1:La/kiu0;

    .line 232
    .line 233
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    check-cast p0, La/ds10;

    .line 238
    .line 239
    iget-object v2, p0, La/ds10;->e:La/p7m0;

    .line 240
    .line 241
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    move-object v1, p0

    .line 246
    check-cast v1, La/ru9;

    .line 247
    .line 248
    const/4 v4, 0x3

    .line 249
    invoke-static {v1, v3, p1, v4}, La/ru9;->a(La/ru9;La/dxh0;II)La/ru9;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {v2, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result p0

    .line 257
    if-eqz p0, :cond_3

    .line 258
    .line 259
    iget-object p0, v0, La/yr10;->Q1:La/zz2;

    .line 260
    .line 261
    sget-object v1, La/yr10;->S1:[La/iiy;

    .line 262
    .line 263
    aget-object v1, v1, v4

    .line 264
    .line 265
    invoke-virtual {p0, v0, v1, p1}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :pswitch_8
    check-cast p0, La/lrd;

    .line 270
    .line 271
    invoke-virtual {p0, v1}, La/lrd;->b(Z)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :pswitch_9
    check-cast p0, La/uii;

    .line 276
    .line 277
    iget-object p0, p0, La/uii;->a:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast p0, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 280
    .line 281
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->setSelectedPosition(I)V

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :pswitch_a
    check-cast p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;

    .line 286
    .line 287
    sget v0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->y2:I

    .line 288
    .line 289
    iget-object v0, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->m2:La/gkz;

    .line 290
    .line 291
    iget v4, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->q2:I

    .line 292
    .line 293
    if-ne v4, p1, :cond_4

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_4
    iget-object v4, v0, La/zz3;->e:La/yz3;

    .line 297
    .line 298
    iget-object v4, v4, La/yz3;->f:Ljava/util/List;

    .line 299
    .line 300
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    new-instance v5, Ljava/util/ArrayList;

    .line 304
    .line 305
    const/16 v6, 0xa

    .line 306
    .line 307
    invoke-static {v4, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 312
    .line 313
    .line 314
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    move v6, v1

    .line 319
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v7

    .line 323
    if-eqz v7, :cond_8

    .line 324
    .line 325
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    add-int/lit8 v8, v6, 0x1

    .line 330
    .line 331
    if-ltz v6, :cond_7

    .line 332
    .line 333
    check-cast v7, La/wi80;

    .line 334
    .line 335
    if-ne p1, v6, :cond_5

    .line 336
    .line 337
    move v6, v2

    .line 338
    goto :goto_1

    .line 339
    :cond_5
    move v6, v1

    .line 340
    :goto_1
    if-eqz v6, :cond_6

    .line 341
    .line 342
    iget v9, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->u2:I

    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_6
    iget v9, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->v2:I

    .line 346
    .line 347
    :goto_2
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    iget v7, v7, La/wi80;->a:I

    .line 351
    .line 352
    new-instance v10, La/wi80;

    .line 353
    .line 354
    invoke-direct {v10, v7, v9, v6}, La/wi80;-><init>(IIZ)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move v6, v8

    .line 361
    goto :goto_0

    .line 362
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 363
    .line 364
    .line 365
    throw v3

    .line 366
    :cond_8
    new-instance v1, La/n23;

    .line 367
    .line 368
    const/4 v2, 0x7

    .line 369
    invoke-direct {v1, p0, p1, v2}, La/n23;-><init>(Ljava/lang/Object;IB)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v0, v5, v1}, La/zz3;->B(Ljava/util/List;Ljava/lang/Runnable;)V

    .line 373
    .line 374
    .line 375
    iput p1, p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->q2:I

    .line 376
    .line 377
    :goto_3
    return-void

    .line 378
    :pswitch_b
    check-cast p0, La/mii0;

    .line 379
    .line 380
    iget-object v0, p0, La/mii0;->b:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v0, Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 383
    .line 384
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/tabs/DsTabs;->k(I)V

    .line 385
    .line 386
    .line 387
    iget-object p0, p0, La/mii0;->d:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 390
    .line 391
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    return-void

    .line 399
    :pswitch_c
    :try_start_0
    check-cast p0, Ljava/util/ArrayList;

    .line 400
    .line 401
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    if-eqz v0, :cond_9

    .line 410
    .line 411
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    check-cast v0, La/nju0;

    .line 416
    .line 417
    invoke-virtual {v0, p1}, La/nju0;->c(I)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 418
    .line 419
    .line 420
    goto :goto_4

    .line 421
    :catch_0
    move-exception v0

    .line 422
    move-object p0, v0

    .line 423
    const-string p1, "Adding and removing callbacks during dispatch to callbacks is not supported"

    .line 424
    .line 425
    invoke-static {p1, p0}, La/hny;->q(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 426
    .line 427
    .line 428
    :cond_9
    return-void

    .line 429
    :pswitch_d
    check-cast p0, La/ywc;

    .line 430
    .line 431
    sget-object v0, La/ywc;->W1:La/kl5;

    .line 432
    .line 433
    invoke-virtual {p0}, La/ywc;->H0()La/qxc;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    iget-object v0, p0, La/qxc;->m:La/p7m0;

    .line 438
    .line 439
    :goto_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object p0

    .line 443
    move-object v1, p0

    .line 444
    check-cast v1, La/yvc;

    .line 445
    .line 446
    const-wide/16 v5, 0x0

    .line 447
    .line 448
    const/16 v7, 0x1b

    .line 449
    .line 450
    const/4 v2, 0x0

    .line 451
    const/4 v4, 0x0

    .line 452
    move v3, p1

    .line 453
    invoke-static/range {v1 .. v7}, La/yvc;->a(La/yvc;Ljava/util/ArrayList;ILa/jkm;JI)La/yvc;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    move v1, v3

    .line 458
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result p0

    .line 462
    if-eqz p0, :cond_a

    .line 463
    .line 464
    return-void

    .line 465
    :cond_a
    move p1, v1

    .line 466
    goto :goto_5

    .line 467
    :pswitch_e
    move v1, p1

    .line 468
    check-cast p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 469
    .line 470
    sget p1, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->o:I

    .line 471
    .line 472
    invoke-virtual {p0, v1}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->b(I)V

    .line 473
    .line 474
    .line 475
    return-void

    .line 476
    :pswitch_f
    move v1, p1

    .line 477
    check-cast p0, La/zp6;

    .line 478
    .line 479
    invoke-virtual {p0}, La/zp6;->V0()La/k620;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    iget-object p1, p1, La/k620;->d:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 484
    .line 485
    invoke-static {p1, v3}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->f(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Lkotlin/jvm/functions/Function1;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->setSelectedPosition(I)V

    .line 489
    .line 490
    .line 491
    new-instance v0, La/os5;

    .line 492
    .line 493
    const/16 v1, 0xb

    .line 494
    .line 495
    invoke-direct {v0, p0, v1}, La/os5;-><init>(Ljava/lang/Object;B)V

    .line 496
    .line 497
    .line 498
    invoke-static {p1, v0}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->f(Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;Lkotlin/jvm/functions/Function1;)V

    .line 499
    .line 500
    .line 501
    return-void

    .line 502
    nop

    .line 503
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
