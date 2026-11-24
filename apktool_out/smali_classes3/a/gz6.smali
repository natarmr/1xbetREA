.class public final La/gz6;
.super La/lhe0;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gz6;->a:B

    iput-object p1, p0, La/gz6;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 12

    .line 1
    iget-byte v0, p0, La/gz6;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, La/gz6;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/hz6;

    .line 10
    .line 11
    iget-object v0, p0, La/hz6;->h2:La/zz2;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq p2, v1, :cond_2

    .line 15
    .line 16
    iget-object p2, p0, La/hz6;->e2:La/o900;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p2, p1}, La/o900;->e(Landroidx/recyclerview/widget/b;)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    const/4 v2, -0x1

    .line 37
    const/4 v3, 0x0

    .line 38
    if-eq p1, v2, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object p2, v3

    .line 42
    :goto_0
    if-eqz p2, :cond_2

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    sget-object p2, La/hz6;->q2:[La/iiy;

    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    aget-object v4, p2, v2

    .line 52
    .line 53
    invoke-virtual {v0, p0, v4, p1}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, La/hz6;->U0()La/b07;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    aget-object v4, p2, v2

    .line 61
    .line 62
    invoke-virtual {v0, p0, v4}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    iget v5, p1, La/b07;->u:I

    .line 71
    .line 72
    if-eq v5, v4, :cond_1

    .line 73
    .line 74
    iput v4, p1, La/b07;->u:I

    .line 75
    .line 76
    iget-object v5, p1, La/b07;->v:Ljava/util/List;

    .line 77
    .line 78
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, La/rg5;

    .line 83
    .line 84
    if-eqz v4, :cond_1

    .line 85
    .line 86
    new-instance v5, La/tz6;

    .line 87
    .line 88
    invoke-direct {v5, v1}, La/tz6;-><init>(Z)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v5}, La/b07;->z(La/xz6;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    new-instance v7, La/iz6;

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    invoke-direct {v7, p1, v1}, La/iz6;-><init>(La/b07;B)V

    .line 102
    .line 103
    .line 104
    iget-object v5, p1, La/b07;->e:La/mne;

    .line 105
    .line 106
    iget-object v9, v5, La/mne;->a:La/rwj;

    .line 107
    .line 108
    new-instance v10, La/zz6;

    .line 109
    .line 110
    invoke-direct {v10, p1, v4, v3, v1}, La/zz6;-><init>(La/b07;La/rg5;La/yje;B)V

    .line 111
    .line 112
    .line 113
    const/16 v11, 0xa

    .line 114
    .line 115
    const/4 v8, 0x0

    .line 116
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 117
    .line 118
    .line 119
    :cond_1
    invoke-virtual {p0}, La/hz6;->T0()La/vik;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iget-object p1, p1, La/vik;->d:Lorg/xplatform/bonus_games/impl/core/presentation/views/BetGameShopDotIndicatorView;

    .line 124
    .line 125
    aget-object p2, p2, v2

    .line 126
    .line 127
    invoke-virtual {v0, p0, p2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    invoke-virtual {p1, p0}, Lorg/xplatform/bonus_games/impl/core/presentation/views/BetGameShopDotIndicatorView;->setHighlighted(I)V

    .line 136
    .line 137
    .line 138
    :cond_2
    return-void

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 7

    .line 1
    iget-byte p2, p0, La/gz6;->a:B

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    iget-object p0, p0, La/gz6;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    check-cast p0, La/vju0;

    .line 14
    .line 15
    iget-object p2, p0, La/vju0;->u:La/dc3;

    .line 16
    .line 17
    iget-object p2, p2, La/dc3;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p2, Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;

    .line 20
    .line 21
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p1, p2, p0}, La/vju0;->v(Landroidx/recyclerview/widget/RecyclerView;Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/view/bracket/BracketItemView;I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_1
    check-cast p0, La/z8s0;

    .line 30
    .line 31
    sget-object p2, La/z8s0;->U1:[La/iiy;

    .line 32
    .line 33
    invoke-virtual {p0}, La/z8s0;->G0()La/w6j;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget-object p2, p2, La/w6j;->d:Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {p0}, La/z8s0;->G0()La/w6j;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-object p0, p0, La/w6j;->c:Landroid/view/View;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v1, v2

    .line 53
    :goto_0
    if-eqz v1, :cond_1

    .line 54
    .line 55
    move p1, v2

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move p1, v0

    .line 58
    :goto_1
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 59
    .line 60
    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    move v0, v2

    .line 64
    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_2
    check-cast p0, La/u3s0;

    .line 69
    .line 70
    sget-object p2, La/u3s0;->R1:[La/iiy;

    .line 71
    .line 72
    invoke-virtual {p0}, La/u3s0;->G0()La/q6j;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    iget-object p2, p2, La/q6j;->c:Landroid/view/View;

    .line 77
    .line 78
    invoke-virtual {p0}, La/u3s0;->G0()La/q6j;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget-object p0, p0, La/q6j;->b:Landroid/view/View;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    move v1, v2

    .line 92
    :goto_2
    if-eqz v1, :cond_4

    .line 93
    .line 94
    move p1, v2

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    move p1, v0

    .line 97
    :goto_3
    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    .line 98
    .line 99
    .line 100
    if-nez v1, :cond_5

    .line 101
    .line 102
    move v0, v2

    .line 103
    :cond_5
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_3
    if-gtz p3, :cond_6

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_6
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    instance-of p2, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 115
    .line 116
    if-eqz p2, :cond_7

    .line 117
    .line 118
    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_7
    const/4 p1, 0x0

    .line 122
    :goto_4
    if-nez p1, :cond_8

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_8
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 126
    .line 127
    new-instance p2, La/w7e0;

    .line 128
    .line 129
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->h1()I

    .line 130
    .line 131
    .line 132
    move-result p3

    .line 133
    invoke-virtual {p1}, Landroidx/recyclerview/widget/b;->S()I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    invoke-direct {p2, p3, p1}, La/w7e0;-><init>(II)V

    .line 138
    .line 139
    .line 140
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :goto_5
    return-void

    .line 144
    :pswitch_4
    check-cast p0, La/m0p;

    .line 145
    .line 146
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollOffset()I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    iget p3, p0, La/m0p;->a:I

    .line 155
    .line 156
    iget-object v0, p0, La/m0p;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 157
    .line 158
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollRange()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    iget v3, p0, La/m0p;->r:I

    .line 163
    .line 164
    sub-int v4, v0, v3

    .line 165
    .line 166
    if-lez v4, :cond_9

    .line 167
    .line 168
    if-lt v3, p3, :cond_9

    .line 169
    .line 170
    move v4, v1

    .line 171
    goto :goto_6

    .line 172
    :cond_9
    move v4, v2

    .line 173
    :goto_6
    iput-boolean v4, p0, La/m0p;->t:Z

    .line 174
    .line 175
    iget-object v4, p0, La/m0p;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 176
    .line 177
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollRange()I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    iget v5, p0, La/m0p;->q:I

    .line 182
    .line 183
    sub-int v6, v4, v5

    .line 184
    .line 185
    if-lez v6, :cond_a

    .line 186
    .line 187
    if-lt v5, p3, :cond_a

    .line 188
    .line 189
    move p3, v1

    .line 190
    goto :goto_7

    .line 191
    :cond_a
    move p3, v2

    .line 192
    :goto_7
    iput-boolean p3, p0, La/m0p;->u:Z

    .line 193
    .line 194
    iget-boolean v6, p0, La/m0p;->t:Z

    .line 195
    .line 196
    if-nez v6, :cond_b

    .line 197
    .line 198
    if-nez p3, :cond_b

    .line 199
    .line 200
    iget-byte p1, p0, La/m0p;->v:B

    .line 201
    .line 202
    if-eqz p1, :cond_f

    .line 203
    .line 204
    invoke-virtual {p0, v2}, La/m0p;->l(I)V

    .line 205
    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_b
    const/high16 p3, 0x40000000    # 2.0f

    .line 209
    .line 210
    if-eqz v6, :cond_c

    .line 211
    .line 212
    int-to-float p1, p1

    .line 213
    int-to-float v2, v3

    .line 214
    div-float v6, v2, p3

    .line 215
    .line 216
    add-float/2addr v6, p1

    .line 217
    mul-float/2addr v6, v2

    .line 218
    int-to-float p1, v0

    .line 219
    div-float/2addr v6, p1

    .line 220
    float-to-int p1, v6

    .line 221
    iput p1, p0, La/m0p;->l:I

    .line 222
    .line 223
    mul-int p1, v3, v3

    .line 224
    .line 225
    div-int/2addr p1, v0

    .line 226
    invoke-static {v3, p1}, Ljava/lang/Math;->min(II)I

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    iput p1, p0, La/m0p;->k:I

    .line 231
    .line 232
    :cond_c
    iget-boolean p1, p0, La/m0p;->u:Z

    .line 233
    .line 234
    if-eqz p1, :cond_d

    .line 235
    .line 236
    int-to-float p1, p2

    .line 237
    int-to-float p2, v5

    .line 238
    div-float p3, p2, p3

    .line 239
    .line 240
    add-float/2addr p3, p1

    .line 241
    mul-float/2addr p3, p2

    .line 242
    int-to-float p1, v4

    .line 243
    div-float/2addr p3, p1

    .line 244
    float-to-int p1, p3

    .line 245
    iput p1, p0, La/m0p;->o:I

    .line 246
    .line 247
    mul-int p1, v5, v5

    .line 248
    .line 249
    div-int/2addr p1, v4

    .line 250
    invoke-static {v5, p1}, Ljava/lang/Math;->min(II)I

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    iput p1, p0, La/m0p;->n:I

    .line 255
    .line 256
    :cond_d
    iget-byte p1, p0, La/m0p;->v:B

    .line 257
    .line 258
    if-eqz p1, :cond_e

    .line 259
    .line 260
    if-ne p1, v1, :cond_f

    .line 261
    .line 262
    :cond_e
    invoke-virtual {p0, v1}, La/m0p;->l(I)V

    .line 263
    .line 264
    .line 265
    :cond_f
    :goto_8
    return-void

    .line 266
    :pswitch_5
    check-cast p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;

    .line 267
    .line 268
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    sget p3, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->o:I

    .line 273
    .line 274
    invoke-virtual {p0, p2}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->e(Landroidx/recyclerview/widget/b;)I

    .line 275
    .line 276
    .line 277
    move-result p2

    .line 278
    const/4 p3, -0x1

    .line 279
    if-ne p2, p3, :cond_10

    .line 280
    .line 281
    iget p1, p0, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->l:I

    .line 282
    .line 283
    goto :goto_9

    .line 284
    :cond_10
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    invoke-virtual {p0, p1}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->e(Landroidx/recyclerview/widget/b;)I

    .line 289
    .line 290
    .line 291
    move-result p1

    .line 292
    :goto_9
    invoke-virtual {p0, p1}, Lorg/xplatform/ui_core/circleindicator/CircleIndicator;->b(I)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    nop

    .line 297
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
