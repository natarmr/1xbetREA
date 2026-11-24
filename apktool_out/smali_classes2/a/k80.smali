.class public final La/k80;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/n80;


# direct methods
.method public synthetic constructor <init>(La/n80;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/k80;->i:B

    iput-object p1, p0, La/k80;->k:La/n80;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/k80;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/k80;->k:La/n80;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/k80;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/k80;-><init>(La/n80;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/k80;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/k80;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/k80;-><init>(La/n80;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/k80;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/k80;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/k80;-><init>(La/n80;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/k80;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/k80;

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/k80;-><init>(La/n80;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/k80;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/k80;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/k80;-><init>(La/n80;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/k80;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    new-instance v0, La/k80;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {v0, p0, p2, v1}, La/k80;-><init>(La/n80;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/k80;->j:Ljava/lang/Object;

    .line 60
    .line 61
    return-object v0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/k80;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/i90;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/k80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/k80;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/k80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/m90;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/k80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/k80;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/k80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/c90;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/k80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/k80;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/k80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/h90;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/k80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/k80;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/k80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/l90;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/k80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/k80;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/k80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/n90;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/k80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/k80;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/k80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/k80;->i:B

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    iget-object v5, v0, La/k80;->k:La/n80;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, La/k80;->j:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, La/i90;

    .line 21
    .line 22
    sget-object v2, La/wne;->a:La/wne;

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    sget-object v1, La/n80;->U1:La/jdk0;

    .line 30
    .line 31
    iget-object v10, v0, La/k80;->k:La/n80;

    .line 32
    .line 33
    iget-object v0, v10, La/n80;->Q1:La/ndk0;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-interface {v0}, La/ndk0;->a()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-ne v0, v7, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object v8, v10, La/n80;->M1:La/wdk0;

    .line 45
    .line 46
    if-eqz v8, :cond_1

    .line 47
    .line 48
    new-instance v9, La/xdk0;

    .line 49
    .line 50
    sget-object v12, La/pek0;->a:La/pek0;

    .line 51
    .line 52
    const v0, 0x7f13095f

    .line 53
    .line 54
    .line 55
    invoke-virtual {v10, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v13

    .line 59
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    const/16 v18, 0x7c

    .line 65
    .line 66
    const/4 v14, 0x0

    .line 67
    const/4 v15, 0x0

    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    move-object v11, v9

    .line 71
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 72
    .line 73
    .line 74
    const/16 v15, 0x3fc

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v12, 0x0

    .line 78
    const/4 v13, 0x0

    .line 79
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, v10, La/n80;->Q1:La/ndk0;

    .line 84
    .line 85
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    const-string v0, "snackbarManager"

    .line 89
    .line 90
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v6

    .line 94
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 95
    .line 96
    .line 97
    :goto_1
    return-object v6

    .line 98
    :pswitch_0
    iget-object v0, v0, La/k80;->j:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, La/m90;

    .line 101
    .line 102
    sget-object v1, La/wne;->a:La/wne;

    .line 103
    .line 104
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-boolean v1, v0, La/m90;->a:Z

    .line 108
    .line 109
    sget-object v2, La/n80;->U1:La/jdk0;

    .line 110
    .line 111
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    iget-object v2, v2, La/oxq;->b:Landroidx/appcompat/widget/AppCompatButton;

    .line 116
    .line 117
    if-nez v1, :cond_3

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    move v4, v8

    .line 121
    :goto_2
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 122
    .line 123
    .line 124
    iget-boolean v0, v0, La/m90;->b:Z

    .line 125
    .line 126
    if-eqz v0, :cond_4

    .line 127
    .line 128
    const v0, 0x7f070590

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_4
    const v0, 0x7f07058e

    .line 133
    .line 134
    .line 135
    :goto_3
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iget-object v1, v1, La/oxq;->b:Landroidx/appcompat/widget/AppCompatButton;

    .line 148
    .line 149
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iget-object v2, v2, La/oxq;->b:Landroidx/appcompat/widget/AppCompatButton;

    .line 154
    .line 155
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 163
    .line 164
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 165
    .line 166
    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 167
    .line 168
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 169
    .line 170
    invoke-virtual {v2, v3, v4, v5, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 174
    .line 175
    .line 176
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_1
    iget-object v0, v0, La/k80;->j:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, La/c90;

    .line 182
    .line 183
    sget-object v1, La/wne;->a:La/wne;

    .line 184
    .line 185
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    if-eqz v0, :cond_a

    .line 189
    .line 190
    instance-of v1, v0, La/z80;

    .line 191
    .line 192
    if-eqz v1, :cond_6

    .line 193
    .line 194
    check-cast v0, La/z80;

    .line 195
    .line 196
    iget-boolean v1, v0, La/z80;->a:Z

    .line 197
    .line 198
    iget-wide v2, v0, La/z80;->b:D

    .line 199
    .line 200
    iget-object v0, v0, La/z80;->c:Ljava/lang/String;

    .line 201
    .line 202
    sget-object v4, La/n80;->U1:La/jdk0;

    .line 203
    .line 204
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    iget-object v4, v4, La/oxq;->e:Landroid/widget/TextView;

    .line 209
    .line 210
    if-eqz v1, :cond_5

    .line 211
    .line 212
    const v0, 0x7f1302b4

    .line 213
    .line 214
    .line 215
    invoke-virtual {v5, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    goto :goto_4

    .line 220
    :cond_5
    sget-object v1, La/pn40;->a:La/pn40;

    .line 221
    .line 222
    sget-object v1, La/p3u0;->c:La/p3u0;

    .line 223
    .line 224
    invoke-static {v2, v3, v0, v1}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    :goto_4
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_6
    instance-of v1, v0, La/b90;

    .line 233
    .line 234
    if-eqz v1, :cond_7

    .line 235
    .line 236
    check-cast v0, La/b90;

    .line 237
    .line 238
    iget-object v0, v0, La/b90;->a:Ljava/util/List;

    .line 239
    .line 240
    sget-object v1, La/n80;->U1:La/jdk0;

    .line 241
    .line 242
    iget-object v1, v5, La/n80;->P1:La/u70;

    .line 243
    .line 244
    if-eqz v1, :cond_9

    .line 245
    .line 246
    invoke-virtual {v1, v0}, La/i26;->G(Ljava/util/List;)V

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_7
    instance-of v1, v0, La/a90;

    .line 251
    .line 252
    if-eqz v1, :cond_a

    .line 253
    .line 254
    check-cast v0, La/a90;

    .line 255
    .line 256
    iget-boolean v0, v0, La/a90;->a:Z

    .line 257
    .line 258
    sget-object v1, La/n80;->U1:La/jdk0;

    .line 259
    .line 260
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    iget-object v1, v1, La/oxq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 265
    .line 266
    if-eqz v0, :cond_8

    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_8
    const v3, 0x3eb33333    # 0.35f

    .line 270
    .line 271
    .line 272
    :goto_5
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 276
    .line 277
    .line 278
    :cond_9
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 282
    .line 283
    .line 284
    :goto_7
    return-object v6

    .line 285
    :pswitch_2
    iget-object v0, v0, La/k80;->j:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, La/h90;

    .line 288
    .line 289
    sget-object v1, La/wne;->a:La/wne;

    .line 290
    .line 291
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    if-eqz v0, :cond_12

    .line 295
    .line 296
    instance-of v1, v0, La/g90;

    .line 297
    .line 298
    if-eqz v1, :cond_c

    .line 299
    .line 300
    sget-object v1, La/n80;->U1:La/jdk0;

    .line 301
    .line 302
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    iget-object v1, v1, La/oxq;->c:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;

    .line 307
    .line 308
    check-cast v0, La/g90;

    .line 309
    .line 310
    iget-boolean v0, v0, La/g90;->a:Z

    .line 311
    .line 312
    if-nez v0, :cond_b

    .line 313
    .line 314
    goto :goto_8

    .line 315
    :cond_b
    move v4, v8

    .line 316
    :goto_8
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_c

    .line 320
    .line 321
    :cond_c
    instance-of v1, v0, La/f90;

    .line 322
    .line 323
    if-eqz v1, :cond_e

    .line 324
    .line 325
    sget-object v1, La/n80;->U1:La/jdk0;

    .line 326
    .line 327
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    iget-object v1, v1, La/oxq;->c:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;

    .line 332
    .line 333
    check-cast v0, La/f90;

    .line 334
    .line 335
    iget-object v0, v0, La/f90;->a:Ljava/util/ArrayList;

    .line 336
    .line 337
    iget-object v1, v1, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;->q:Ljava/util/ArrayList;

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    if-eqz v3, :cond_11

    .line 348
    .line 349
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    check-cast v3, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 354
    .line 355
    invoke-virtual {v3}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->getBetType$african_roulette()La/z70;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    iget-object v3, v3, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a:La/vd7;

    .line 364
    .line 365
    if-eqz v4, :cond_d

    .line 366
    .line 367
    iget-object v3, v3, La/vd7;->c:Landroid/view/View;

    .line 368
    .line 369
    check-cast v3, Landroid/widget/ImageView;

    .line 370
    .line 371
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 372
    .line 373
    .line 374
    goto :goto_9

    .line 375
    :cond_d
    iget-object v3, v3, La/vd7;->c:Landroid/view/View;

    .line 376
    .line 377
    check-cast v3, Landroid/widget/ImageView;

    .line 378
    .line 379
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 380
    .line 381
    .line 382
    goto :goto_9

    .line 383
    :cond_e
    instance-of v1, v0, La/e90;

    .line 384
    .line 385
    if-eqz v1, :cond_10

    .line 386
    .line 387
    check-cast v0, La/e90;

    .line 388
    .line 389
    iget-object v0, v0, La/e90;->a:La/z70;

    .line 390
    .line 391
    sget-object v1, La/n80;->U1:La/jdk0;

    .line 392
    .line 393
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    iget-object v1, v1, La/oxq;->c:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;

    .line 398
    .line 399
    iget-object v1, v1, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;->q:Ljava/util/ArrayList;

    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    if-eqz v2, :cond_11

    .line 410
    .line 411
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    check-cast v2, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 416
    .line 417
    invoke-virtual {v2}, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->getBetType$african_roulette()La/z70;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    iget-object v2, v2, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a:La/vd7;

    .line 422
    .line 423
    if-ne v4, v0, :cond_f

    .line 424
    .line 425
    iget-object v2, v2, La/vd7;->b:Landroid/view/ViewGroup;

    .line 426
    .line 427
    check-cast v2, Landroid/widget/FrameLayout;

    .line 428
    .line 429
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 430
    .line 431
    .line 432
    goto :goto_a

    .line 433
    :cond_f
    iget-object v2, v2, La/vd7;->b:Landroid/view/ViewGroup;

    .line 434
    .line 435
    check-cast v2, Landroid/widget/FrameLayout;

    .line 436
    .line 437
    const v4, 0x3e99999a    # 0.3f

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 441
    .line 442
    .line 443
    goto :goto_a

    .line 444
    :cond_10
    instance-of v0, v0, La/d90;

    .line 445
    .line 446
    if-eqz v0, :cond_12

    .line 447
    .line 448
    sget-object v0, La/n80;->U1:La/jdk0;

    .line 449
    .line 450
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    iget-object v0, v0, La/oxq;->c:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;

    .line 455
    .line 456
    iget-object v0, v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteGameField;->q:Ljava/util/ArrayList;

    .line 457
    .line 458
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    if-eqz v1, :cond_11

    .line 467
    .line 468
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    check-cast v1, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;

    .line 473
    .line 474
    iget-object v1, v1, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->a:La/vd7;

    .line 475
    .line 476
    iget-object v1, v1, La/vd7;->b:Landroid/view/ViewGroup;

    .line 477
    .line 478
    check-cast v1, Landroid/widget/FrameLayout;

    .line 479
    .line 480
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 481
    .line 482
    .line 483
    goto :goto_b

    .line 484
    :cond_11
    :goto_c
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 485
    .line 486
    goto :goto_d

    .line 487
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 488
    .line 489
    .line 490
    :goto_d
    return-object v6

    .line 491
    :pswitch_3
    iget-object v0, v0, La/k80;->j:Ljava/lang/Object;

    .line 492
    .line 493
    check-cast v0, La/l90;

    .line 494
    .line 495
    sget-object v1, La/wne;->a:La/wne;

    .line 496
    .line 497
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    if-eqz v0, :cond_1a

    .line 501
    .line 502
    instance-of v1, v0, La/j90;

    .line 503
    .line 504
    if-eqz v1, :cond_14

    .line 505
    .line 506
    sget-object v1, La/n80;->U1:La/jdk0;

    .line 507
    .line 508
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    iget-object v1, v1, La/oxq;->f:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;

    .line 513
    .line 514
    check-cast v0, La/j90;

    .line 515
    .line 516
    iget-boolean v0, v0, La/j90;->a:Z

    .line 517
    .line 518
    if-eqz v0, :cond_13

    .line 519
    .line 520
    move v2, v8

    .line 521
    :cond_13
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 522
    .line 523
    .line 524
    goto/16 :goto_e

    .line 525
    .line 526
    :cond_14
    instance-of v1, v0, La/k90;

    .line 527
    .line 528
    if-eqz v1, :cond_1a

    .line 529
    .line 530
    check-cast v0, La/k90;

    .line 531
    .line 532
    iget v1, v0, La/k90;->c:F

    .line 533
    .line 534
    iget v2, v0, La/k90;->b:F

    .line 535
    .line 536
    iget-boolean v0, v0, La/k90;->a:Z

    .line 537
    .line 538
    const/4 v3, 0x0

    .line 539
    const/high16 v4, 0x41a00000    # 20.0f

    .line 540
    .line 541
    if-eqz v0, :cond_15

    .line 542
    .line 543
    sget-object v0, La/n80;->U1:La/jdk0;

    .line 544
    .line 545
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    iget-object v0, v0, La/oxq;->f:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;

    .line 550
    .line 551
    add-float/2addr v2, v1

    .line 552
    sub-float/2addr v2, v4

    .line 553
    const/high16 v4, 0x45070000    # 2160.0f

    .line 554
    .line 555
    add-float/2addr v2, v4

    .line 556
    iget-object v4, v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->a:La/dc3;

    .line 557
    .line 558
    iget-object v4, v4, La/dc3;->e:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v4, Landroid/widget/ImageView;

    .line 561
    .line 562
    const/4 v5, 0x2

    .line 563
    new-array v6, v5, [F

    .line 564
    .line 565
    aput v3, v6, v8

    .line 566
    .line 567
    aput v2, v6, v7

    .line 568
    .line 569
    const-string v2, "rotation"

    .line 570
    .line 571
    invoke-static {v4, v2, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    const-wide/16 v3, 0x2ee0

    .line 576
    .line 577
    invoke-virtual {v2, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 578
    .line 579
    .line 580
    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    .line 581
    .line 582
    invoke-direct {v3}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2, v3}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 586
    .line 587
    .line 588
    new-instance v3, La/x90;

    .line 589
    .line 590
    invoke-direct {v3, v0, v7}, La/x90;-><init>(Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;B)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 594
    .line 595
    .line 596
    iput-object v2, v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->d:Landroid/animation/ObjectAnimator;

    .line 597
    .line 598
    invoke-virtual {v2}, Landroid/animation/ObjectAnimator;->start()V

    .line 599
    .line 600
    .line 601
    const v2, 0x4019999a    # 2.4f

    .line 602
    .line 603
    .line 604
    iput v2, v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->b:F

    .line 605
    .line 606
    new-array v2, v5, [F

    .line 607
    .line 608
    fill-array-data v2, :array_0

    .line 609
    .line 610
    .line 611
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    const-wide/16 v3, 0x834

    .line 616
    .line 617
    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 618
    .line 619
    .line 620
    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    .line 621
    .line 622
    invoke-direct {v3}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 626
    .line 627
    .line 628
    new-instance v3, La/v90;

    .line 629
    .line 630
    invoke-direct {v3, v0, v8}, La/v90;-><init>(Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;B)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 634
    .line 635
    .line 636
    new-array v3, v5, [F

    .line 637
    .line 638
    fill-array-data v3, :array_1

    .line 639
    .line 640
    .line 641
    invoke-static {v3}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 642
    .line 643
    .line 644
    move-result-object v3

    .line 645
    const-wide/16 v9, 0x320

    .line 646
    .line 647
    invoke-virtual {v3, v9, v10}, Landroid/animation/ValueAnimator;->setStartDelay(J)V

    .line 648
    .line 649
    .line 650
    const-wide/16 v9, 0x514

    .line 651
    .line 652
    invoke-virtual {v3, v9, v10}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 653
    .line 654
    .line 655
    iget v4, v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->b:F

    .line 656
    .line 657
    new-instance v6, La/w90;

    .line 658
    .line 659
    invoke-direct {v6, v0, v4}, La/w90;-><init>(Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;F)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v3, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 663
    .line 664
    .line 665
    new-instance v4, Landroid/animation/AnimatorSet;

    .line 666
    .line 667
    invoke-direct {v4}, Landroid/animation/AnimatorSet;-><init>()V

    .line 668
    .line 669
    .line 670
    new-array v6, v5, [Landroid/animation/Animator;

    .line 671
    .line 672
    aput-object v2, v6, v8

    .line 673
    .line 674
    aput-object v3, v6, v7

    .line 675
    .line 676
    invoke-virtual {v4, v6}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 677
    .line 678
    .line 679
    const/high16 v2, 0x44870000    # 1080.0f

    .line 680
    .line 681
    add-float/2addr v2, v1

    .line 682
    new-array v1, v5, [F

    .line 683
    .line 684
    const/high16 v3, -0x3ced0000    # -147.0f

    .line 685
    .line 686
    aput v3, v1, v8

    .line 687
    .line 688
    aput v2, v1, v7

    .line 689
    .line 690
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    const-wide/16 v2, 0x2710

    .line 695
    .line 696
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 697
    .line 698
    .line 699
    new-instance v2, La/v90;

    .line 700
    .line 701
    invoke-direct {v2, v0, v7}, La/v90;-><init>(Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;B)V

    .line 702
    .line 703
    .line 704
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 705
    .line 706
    .line 707
    new-instance v2, Landroid/animation/AnimatorSet;

    .line 708
    .line 709
    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 710
    .line 711
    .line 712
    iput-object v2, v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->c:Landroid/animation/AnimatorSet;

    .line 713
    .line 714
    new-array v3, v5, [Landroid/animation/Animator;

    .line 715
    .line 716
    aput-object v4, v3, v8

    .line 717
    .line 718
    aput-object v1, v3, v7

    .line 719
    .line 720
    invoke-virtual {v2, v3}, Landroid/animation/AnimatorSet;->playSequentially([Landroid/animation/Animator;)V

    .line 721
    .line 722
    .line 723
    invoke-virtual {v2}, Landroid/animation/Animator;->removeAllListeners()V

    .line 724
    .line 725
    .line 726
    new-instance v1, La/x90;

    .line 727
    .line 728
    invoke-direct {v1, v0, v8}, La/x90;-><init>(Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;B)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v2, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 732
    .line 733
    .line 734
    iget-object v0, v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->c:Landroid/animation/AnimatorSet;

    .line 735
    .line 736
    if-eqz v0, :cond_19

    .line 737
    .line 738
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 739
    .line 740
    .line 741
    goto :goto_e

    .line 742
    :cond_15
    cmpg-float v0, v2, v3

    .line 743
    .line 744
    if-nez v0, :cond_16

    .line 745
    .line 746
    goto :goto_e

    .line 747
    :cond_16
    sget-object v0, La/n80;->U1:La/jdk0;

    .line 748
    .line 749
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    iget-object v0, v0, La/oxq;->f:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;

    .line 754
    .line 755
    iget-object v3, v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->a:La/dc3;

    .line 756
    .line 757
    iget-object v5, v3, La/dc3;->e:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v5, Landroid/widget/ImageView;

    .line 760
    .line 761
    iget-object v3, v3, La/dc3;->d:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast v3, Landroid/widget/ImageView;

    .line 764
    .line 765
    add-float/2addr v2, v1

    .line 766
    sub-float/2addr v2, v4

    .line 767
    invoke-virtual {v5, v2}, Landroid/view/View;->setRotation(F)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    instance-of v4, v2, La/a3e;

    .line 775
    .line 776
    if-eqz v4, :cond_17

    .line 777
    .line 778
    move-object v6, v2

    .line 779
    check-cast v6, La/a3e;

    .line 780
    .line 781
    :cond_17
    if-eqz v6, :cond_18

    .line 782
    .line 783
    iput v1, v6, La/a3e;->r:F

    .line 784
    .line 785
    :cond_18
    invoke-virtual {v3, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 786
    .line 787
    .line 788
    const v1, 0x405ccccd    # 3.45f

    .line 789
    .line 790
    .line 791
    iput v1, v0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;->b:F

    .line 792
    .line 793
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 794
    .line 795
    .line 796
    :cond_19
    :goto_e
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 797
    .line 798
    goto :goto_f

    .line 799
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 800
    .line 801
    .line 802
    :goto_f
    return-object v6

    .line 803
    :pswitch_4
    iget-object v0, v0, La/k80;->j:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast v0, La/n90;

    .line 806
    .line 807
    sget-object v1, La/wne;->a:La/wne;

    .line 808
    .line 809
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 810
    .line 811
    .line 812
    if-eqz v0, :cond_1b

    .line 813
    .line 814
    iput-boolean v7, v5, La/n80;->R1:Z

    .line 815
    .line 816
    iget v0, v0, La/n90;->a:I

    .line 817
    .line 818
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    const v2, 0x7f070709

    .line 823
    .line 824
    .line 825
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 826
    .line 827
    .line 828
    move-result v1

    .line 829
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    const v3, 0x7f07070e

    .line 834
    .line 835
    .line 836
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 837
    .line 838
    .line 839
    move-result v2

    .line 840
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 841
    .line 842
    .line 843
    move-result-object v3

    .line 844
    iget-object v3, v3, La/oxq;->f:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;

    .line 845
    .line 846
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 847
    .line 848
    .line 849
    move-result-object v3

    .line 850
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    .line 852
    .line 853
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 854
    .line 855
    invoke-virtual {v3, v0, v1, v8, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 856
    .line 857
    .line 858
    invoke-virtual {v5}, La/n80;->G0()La/oxq;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    iget-object v0, v0, La/oxq;->f:Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteWheel;

    .line 863
    .line 864
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 865
    .line 866
    .line 867
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 868
    .line 869
    goto :goto_10

    .line 870
    :cond_1b
    invoke-static {}, La/t9f;->b()V

    .line 871
    .line 872
    .line 873
    :goto_10
    return-object v6

    .line 874
    nop

    .line 875
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    :array_0
    .array-data 4
        -0x3e600000    # -20.0f
        -0x3ced0000    # -147.0f
    .end array-data

    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    :array_1
    .array-data 4
        0x0
        0x3f866666    # 1.05f
    .end array-data
.end method
