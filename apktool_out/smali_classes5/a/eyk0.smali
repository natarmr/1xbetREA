.class public final La/eyk0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/hyk0;


# direct methods
.method public synthetic constructor <init>(La/hyk0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/eyk0;->i:B

    iput-object p1, p0, La/eyk0;->k:La/hyk0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/eyk0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/eyk0;->k:La/hyk0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/eyk0;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/eyk0;-><init>(La/hyk0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/eyk0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/eyk0;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/eyk0;-><init>(La/hyk0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/eyk0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/eyk0;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/eyk0;-><init>(La/hyk0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/eyk0;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/eyk0;

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/eyk0;-><init>(La/hyk0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/eyk0;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/eyk0;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/eyk0;-><init>(La/hyk0;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/eyk0;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    new-instance v0, La/eyk0;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {v0, p0, p2, v1}, La/eyk0;-><init>(La/hyk0;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/eyk0;->j:Ljava/lang/Object;

    .line 60
    .line 61
    return-object v0

    .line 62
    nop

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
    iget-byte v0, p0, La/eyk0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/hlu0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/eyk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/eyk0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/eyk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/pl60;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/eyk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/eyk0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/eyk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/qc7;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/eyk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/eyk0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/eyk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/dcs;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/eyk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/eyk0;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/eyk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/lav0;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/eyk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/eyk0;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/eyk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/dav0;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/eyk0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/eyk0;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/eyk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/eyk0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, v0, La/eyk0;->k:La/hyk0;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, La/eyk0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/hlu0;

    .line 17
    .line 18
    sget-object v1, La/wne;->a:La/wne;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-boolean v1, v0, La/hlu0;->a:Z

    .line 24
    .line 25
    sget-object v3, La/hyk0;->U1:[La/iiy;

    .line 26
    .line 27
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v3, v3, La/x4r;->c:Landroidx/appcompat/widget/AppCompatButton;

    .line 32
    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v2, v4

    .line 37
    :goto_0
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    iget-boolean v0, v0, La/hlu0;->b:Z

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    const v0, 0x7f070590

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const v0, 0x7f07058e

    .line 49
    .line 50
    .line 51
    :goto_1
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget-object v1, v1, La/x4r;->c:Landroidx/appcompat/widget/AppCompatButton;

    .line 64
    .line 65
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v2, v2, La/x4r;->c:Landroidx/appcompat/widget/AppCompatButton;

    .line 70
    .line 71
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 79
    .line 80
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 81
    .line 82
    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 83
    .line 84
    iget v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 85
    .line 86
    invoke-virtual {v2, v3, v4, v5, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_0
    iget-object v1, v0, La/eyk0;->j:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, La/pl60;

    .line 98
    .line 99
    sget-object v2, La/wne;->a:La/wne;

    .line 100
    .line 101
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    if-eqz v1, :cond_5

    .line 105
    .line 106
    sget-object v1, La/hyk0;->U1:[La/iiy;

    .line 107
    .line 108
    iget-object v9, v0, La/eyk0;->k:La/hyk0;

    .line 109
    .line 110
    iget-object v0, v9, La/hyk0;->Q1:La/ndk0;

    .line 111
    .line 112
    if-eqz v0, :cond_2

    .line 113
    .line 114
    invoke-interface {v0}, La/ndk0;->a()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-ne v0, v3, :cond_2

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    iget-object v7, v9, La/hyk0;->M1:La/wdk0;

    .line 122
    .line 123
    if-eqz v7, :cond_4

    .line 124
    .line 125
    new-instance v8, La/xdk0;

    .line 126
    .line 127
    sget-object v11, La/pek0;->a:La/pek0;

    .line 128
    .line 129
    const v0, 0x7f13095e

    .line 130
    .line 131
    .line 132
    invoke-virtual {v9, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    const/16 v16, 0x0

    .line 140
    .line 141
    const/16 v17, 0x7c

    .line 142
    .line 143
    const/4 v13, 0x0

    .line 144
    const/4 v14, 0x0

    .line 145
    const/4 v15, 0x0

    .line 146
    move-object v10, v8

    .line 147
    invoke-direct/range {v10 .. v17}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 148
    .line 149
    .line 150
    const/16 v14, 0x3fc

    .line 151
    .line 152
    const/4 v10, 0x0

    .line 153
    const/4 v11, 0x0

    .line 154
    const/4 v12, 0x0

    .line 155
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iput-object v0, v9, La/hyk0;->Q1:La/ndk0;

    .line 160
    .line 161
    invoke-virtual {v9}, La/hyk0;->H0()La/tyk0;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iget-object v1, v0, La/tyk0;->e:La/ztt;

    .line 166
    .line 167
    invoke-virtual {v1}, La/ztt;->a()La/csr;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    iget-object v2, v2, La/csr;->a:La/bsr;

    .line 172
    .line 173
    iget-object v2, v2, La/bsr;->a:La/esr;

    .line 174
    .line 175
    invoke-virtual {v2}, La/esr;->a()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_3

    .line 180
    .line 181
    new-instance v2, La/ty5;

    .line 182
    .line 183
    invoke-virtual {v1}, La/ztt;->a()La/csr;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-direct {v2, v1}, La/ty5;-><init>(La/csr;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    iget-object v1, v0, La/tyk0;->v:La/mne;

    .line 195
    .line 196
    iget-object v10, v1, La/mne;->a:La/rwj;

    .line 197
    .line 198
    sget-object v8, La/nyk0;->a:La/nyk0;

    .line 199
    .line 200
    new-instance v11, La/kbh0;

    .line 201
    .line 202
    const/16 v1, 0x14

    .line 203
    .line 204
    invoke-direct {v11, v0, v2, v6, v1}, La/kbh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 205
    .line 206
    .line 207
    const/16 v12, 0xa

    .line 208
    .line 209
    const/4 v9, 0x0

    .line 210
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 211
    .line 212
    .line 213
    :cond_3
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_4
    const-string v0, "snackbarManager"

    .line 217
    .line 218
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v6

    .line 222
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 223
    .line 224
    .line 225
    :goto_3
    return-object v6

    .line 226
    :pswitch_1
    iget-object v0, v0, La/eyk0;->j:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, La/qc7;

    .line 229
    .line 230
    sget-object v1, La/wne;->a:La/wne;

    .line 231
    .line 232
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    if-eqz v0, :cond_b

    .line 236
    .line 237
    instance-of v1, v0, La/nc7;

    .line 238
    .line 239
    if-eqz v1, :cond_7

    .line 240
    .line 241
    check-cast v0, La/nc7;

    .line 242
    .line 243
    iget-boolean v1, v0, La/nc7;->a:Z

    .line 244
    .line 245
    iget-wide v2, v0, La/nc7;->b:D

    .line 246
    .line 247
    iget-object v0, v0, La/nc7;->c:Ljava/lang/String;

    .line 248
    .line 249
    sget-object v4, La/hyk0;->U1:[La/iiy;

    .line 250
    .line 251
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    iget-object v4, v4, La/x4r;->h:Landroid/widget/TextView;

    .line 256
    .line 257
    if-eqz v1, :cond_6

    .line 258
    .line 259
    const v0, 0x7f1302b4

    .line 260
    .line 261
    .line 262
    invoke-virtual {v5, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    goto :goto_4

    .line 267
    :cond_6
    sget-object v1, La/pn40;->a:La/pn40;

    .line 268
    .line 269
    sget-object v1, La/p3u0;->c:La/p3u0;

    .line 270
    .line 271
    invoke-static {v2, v3, v0, v1}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    :goto_4
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 276
    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_7
    instance-of v1, v0, La/pc7;

    .line 280
    .line 281
    if-eqz v1, :cond_8

    .line 282
    .line 283
    check-cast v0, La/pc7;

    .line 284
    .line 285
    iget-object v0, v0, La/pc7;->a:Ljava/util/List;

    .line 286
    .line 287
    sget-object v1, La/hyk0;->U1:[La/iiy;

    .line 288
    .line 289
    iget-object v1, v5, La/hyk0;->P1:La/u70;

    .line 290
    .line 291
    if-eqz v1, :cond_a

    .line 292
    .line 293
    invoke-virtual {v1, v0}, La/i26;->G(Ljava/util/List;)V

    .line 294
    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_8
    instance-of v1, v0, La/oc7;

    .line 298
    .line 299
    if-eqz v1, :cond_b

    .line 300
    .line 301
    check-cast v0, La/oc7;

    .line 302
    .line 303
    iget-boolean v0, v0, La/oc7;->a:Z

    .line 304
    .line 305
    sget-object v1, La/hyk0;->U1:[La/iiy;

    .line 306
    .line 307
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    iget-object v1, v1, La/x4r;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 312
    .line 313
    if-eqz v0, :cond_9

    .line 314
    .line 315
    const/high16 v2, 0x3f800000    # 1.0f

    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_9
    const v2, 0x3eb33333    # 0.35f

    .line 319
    .line 320
    .line 321
    :goto_5
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 325
    .line 326
    .line 327
    :cond_a
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 331
    .line 332
    .line 333
    :goto_7
    return-object v6

    .line 334
    :pswitch_2
    iget-object v0, v0, La/eyk0;->j:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v0, La/dcs;

    .line 337
    .line 338
    sget-object v1, La/wne;->a:La/wne;

    .line 339
    .line 340
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    if-eqz v0, :cond_18

    .line 344
    .line 345
    instance-of v1, v0, La/acs;

    .line 346
    .line 347
    if-eqz v1, :cond_e

    .line 348
    .line 349
    check-cast v0, La/acs;

    .line 350
    .line 351
    iget-object v0, v0, La/acs;->a:La/yxk0;

    .line 352
    .line 353
    sget-object v1, La/hyk0;->U1:[La/iiy;

    .line 354
    .line 355
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    iget-object v1, v1, La/x4r;->b:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;

    .line 360
    .line 361
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    sget-object v2, La/yxk0;->g:La/yxk0;

    .line 365
    .line 366
    iget-object v1, v1, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->c:Ljava/util/ArrayList;

    .line 367
    .line 368
    if-ne v0, v2, :cond_c

    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    if-eqz v1, :cond_17

    .line 379
    .line 380
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    check-cast v1, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 385
    .line 386
    invoke-virtual {v1}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->b()V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v1, v4}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->setDefaultState(Z)V

    .line 390
    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    :cond_d
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    if-eqz v2, :cond_17

    .line 402
    .line 403
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    check-cast v2, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 408
    .line 409
    invoke-virtual {v2, v3}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->setDefaultState(Z)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->getType()La/yxk0;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    if-ne v4, v0, :cond_d

    .line 417
    .line 418
    invoke-virtual {v2}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->b()V

    .line 419
    .line 420
    .line 421
    goto :goto_9

    .line 422
    :cond_e
    instance-of v1, v0, La/ccs;

    .line 423
    .line 424
    if-eqz v1, :cond_10

    .line 425
    .line 426
    sget-object v1, La/hyk0;->U1:[La/iiy;

    .line 427
    .line 428
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    iget-object v1, v1, La/x4r;->b:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;

    .line 433
    .line 434
    check-cast v0, La/ccs;

    .line 435
    .line 436
    iget-boolean v0, v0, La/ccs;->a:Z

    .line 437
    .line 438
    if-nez v0, :cond_f

    .line 439
    .line 440
    goto :goto_a

    .line 441
    :cond_f
    move v2, v4

    .line 442
    :goto_a
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 443
    .line 444
    .line 445
    goto/16 :goto_d

    .line 446
    .line 447
    :cond_10
    instance-of v1, v0, La/zbs;

    .line 448
    .line 449
    if-eqz v1, :cond_14

    .line 450
    .line 451
    check-cast v0, La/zbs;

    .line 452
    .line 453
    iget-object v1, v0, La/zbs;->a:La/yxk0;

    .line 454
    .line 455
    iget-object v0, v0, La/zbs;->b:Ljava/lang/Double;

    .line 456
    .line 457
    sget-object v2, La/hyk0;->U1:[La/iiy;

    .line 458
    .line 459
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    iget-object v2, v2, La/x4r;->b:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;

    .line 464
    .line 465
    sget-object v3, La/yxk0;->g:La/yxk0;

    .line 466
    .line 467
    if-ne v1, v3, :cond_11

    .line 468
    .line 469
    goto/16 :goto_d

    .line 470
    .line 471
    :cond_11
    iget-object v2, v2, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->c:Ljava/util/ArrayList;

    .line 472
    .line 473
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    :cond_12
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    if-eqz v3, :cond_17

    .line 482
    .line 483
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v3

    .line 487
    check-cast v3, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 488
    .line 489
    sget v5, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->c:I

    .line 490
    .line 491
    invoke-virtual {v3, v4}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->setDefaultState(Z)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v3}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->getType()La/yxk0;

    .line 495
    .line 496
    .line 497
    move-result-object v5

    .line 498
    if-ne v5, v1, :cond_13

    .line 499
    .line 500
    invoke-virtual {v3}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->c()V

    .line 501
    .line 502
    .line 503
    if-eqz v0, :cond_12

    .line 504
    .line 505
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 506
    .line 507
    .line 508
    move-result-wide v5

    .line 509
    invoke-virtual {v3, v5, v6}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->setSum(D)V

    .line 510
    .line 511
    .line 512
    goto :goto_b

    .line 513
    :cond_13
    invoke-virtual {v3}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->d()V

    .line 514
    .line 515
    .line 516
    goto :goto_b

    .line 517
    :cond_14
    instance-of v1, v0, La/bcs;

    .line 518
    .line 519
    if-eqz v1, :cond_18

    .line 520
    .line 521
    check-cast v0, La/bcs;

    .line 522
    .line 523
    iget-object v0, v0, La/bcs;->a:Ljava/util/List;

    .line 524
    .line 525
    sget-object v1, La/hyk0;->U1:[La/iiy;

    .line 526
    .line 527
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    iget-object v1, v1, La/x4r;->b:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;

    .line 532
    .line 533
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    :cond_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 541
    .line 542
    .line 543
    move-result v2

    .line 544
    if-eqz v2, :cond_17

    .line 545
    .line 546
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    check-cast v2, La/xxk0;

    .line 551
    .line 552
    iget-object v3, v1, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinChoiceView;->c:Ljava/util/ArrayList;

    .line 553
    .line 554
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    :cond_16
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 559
    .line 560
    .line 561
    move-result v4

    .line 562
    if-eqz v4, :cond_15

    .line 563
    .line 564
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v4

    .line 568
    check-cast v4, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;

    .line 569
    .line 570
    invoke-virtual {v4}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->d()V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v4}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->getType()La/yxk0;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    iget-object v6, v2, La/xxk0;->b:La/yxk0;

    .line 578
    .line 579
    if-ne v5, v6, :cond_16

    .line 580
    .line 581
    iget-wide v5, v2, La/xxk0;->a:D

    .line 582
    .line 583
    invoke-virtual {v4, v5, v6}, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinButton;->setSum(D)V

    .line 584
    .line 585
    .line 586
    goto :goto_c

    .line 587
    :cond_17
    :goto_d
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 588
    .line 589
    goto :goto_e

    .line 590
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 591
    .line 592
    .line 593
    :goto_e
    return-object v6

    .line 594
    :pswitch_3
    iget-object v0, v0, La/eyk0;->j:Ljava/lang/Object;

    .line 595
    .line 596
    check-cast v0, La/lav0;

    .line 597
    .line 598
    sget-object v1, La/wne;->a:La/wne;

    .line 599
    .line 600
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    if-eqz v0, :cond_1c

    .line 604
    .line 605
    instance-of v1, v0, La/jav0;

    .line 606
    .line 607
    if-eqz v1, :cond_1a

    .line 608
    .line 609
    sget-object v1, La/hyk0;->U1:[La/iiy;

    .line 610
    .line 611
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    iget-object v1, v1, La/x4r;->i:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinWheelView;

    .line 616
    .line 617
    check-cast v0, La/jav0;

    .line 618
    .line 619
    iget-boolean v0, v0, La/jav0;->a:Z

    .line 620
    .line 621
    if-eqz v0, :cond_19

    .line 622
    .line 623
    goto :goto_f

    .line 624
    :cond_19
    const/16 v4, 0x8

    .line 625
    .line 626
    :goto_f
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 627
    .line 628
    .line 629
    goto/16 :goto_10

    .line 630
    .line 631
    :cond_1a
    instance-of v1, v0, La/kav0;

    .line 632
    .line 633
    if-eqz v1, :cond_1c

    .line 634
    .line 635
    check-cast v0, La/kav0;

    .line 636
    .line 637
    iget-object v1, v0, La/kav0;->b:La/yxk0;

    .line 638
    .line 639
    iget-boolean v0, v0, La/kav0;->a:Z

    .line 640
    .line 641
    const/high16 v2, 0x41900000    # 18.0f

    .line 642
    .line 643
    if-eqz v0, :cond_1b

    .line 644
    .line 645
    sget-object v0, La/hyk0;->U1:[La/iiy;

    .line 646
    .line 647
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    iget-object v0, v0, La/x4r;->i:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinWheelView;

    .line 652
    .line 653
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    invoke-static {v1}, La/tlb;->U(La/yxk0;)Ljava/util/List;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    sget-object v5, La/f1e0;->a:La/e1e0;

    .line 661
    .line 662
    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->s0(Ljava/util/List;La/e1e0;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    check-cast v1, Ljava/lang/Number;

    .line 667
    .line 668
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 669
    .line 670
    .line 671
    move-result v1

    .line 672
    int-to-float v1, v1

    .line 673
    mul-float/2addr v1, v2

    .line 674
    const/high16 v2, 0x45070000    # 2160.0f

    .line 675
    .line 676
    add-float/2addr v1, v2

    .line 677
    iget-object v2, v0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinWheelView;->a:La/bjr;

    .line 678
    .line 679
    iget-object v2, v2, La/bjr;->c:Landroid/widget/ImageView;

    .line 680
    .line 681
    const/4 v5, 0x2

    .line 682
    new-array v5, v5, [F

    .line 683
    .line 684
    const/4 v6, 0x0

    .line 685
    aput v6, v5, v4

    .line 686
    .line 687
    aput v1, v5, v3

    .line 688
    .line 689
    const-string v1, "rotation"

    .line 690
    .line 691
    invoke-static {v2, v1, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    const-wide/16 v2, 0x2328

    .line 696
    .line 697
    invoke-virtual {v1, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 698
    .line 699
    .line 700
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    .line 701
    .line 702
    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 706
    .line 707
    .line 708
    new-instance v2, La/r9g;

    .line 709
    .line 710
    const/16 v3, 0xb

    .line 711
    .line 712
    invoke-direct {v2, v0, v3}, La/r9g;-><init>(Ljava/lang/Object;B)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 716
    .line 717
    .line 718
    iput-object v1, v0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinWheelView;->b:Landroid/animation/ObjectAnimator;

    .line 719
    .line 720
    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->start()V

    .line 721
    .line 722
    .line 723
    goto :goto_10

    .line 724
    :cond_1b
    sget-object v0, La/hyk0;->U1:[La/iiy;

    .line 725
    .line 726
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    iget-object v0, v0, La/x4r;->i:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinWheelView;

    .line 731
    .line 732
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 733
    .line 734
    .line 735
    invoke-static {v1}, La/tlb;->U(La/yxk0;)Ljava/util/List;

    .line 736
    .line 737
    .line 738
    move-result-object v1

    .line 739
    sget-object v3, La/f1e0;->a:La/e1e0;

    .line 740
    .line 741
    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->s0(Ljava/util/List;La/e1e0;)Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    check-cast v1, Ljava/lang/Number;

    .line 746
    .line 747
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 748
    .line 749
    .line 750
    move-result v1

    .line 751
    int-to-float v1, v1

    .line 752
    mul-float/2addr v1, v2

    .line 753
    iget-object v2, v0, Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinWheelView;->a:La/bjr;

    .line 754
    .line 755
    iget-object v2, v2, La/bjr;->c:Landroid/widget/ImageView;

    .line 756
    .line 757
    invoke-virtual {v2, v1}, Landroid/view/View;->setRotation(F)V

    .line 758
    .line 759
    .line 760
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 761
    .line 762
    .line 763
    :goto_10
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 764
    .line 765
    goto :goto_11

    .line 766
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 767
    .line 768
    .line 769
    :goto_11
    return-object v6

    .line 770
    :pswitch_4
    iget-object v0, v0, La/eyk0;->j:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast v0, La/dav0;

    .line 773
    .line 774
    sget-object v1, La/wne;->a:La/wne;

    .line 775
    .line 776
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    if-eqz v0, :cond_1d

    .line 780
    .line 781
    iput-boolean v3, v5, La/hyk0;->R1:Z

    .line 782
    .line 783
    iget v0, v0, La/dav0;->a:I

    .line 784
    .line 785
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 786
    .line 787
    .line 788
    move-result-object v1

    .line 789
    const v2, 0x7f070709

    .line 790
    .line 791
    .line 792
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 793
    .line 794
    .line 795
    move-result v1

    .line 796
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    const v3, 0x7f07070e

    .line 801
    .line 802
    .line 803
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 804
    .line 805
    .line 806
    move-result v2

    .line 807
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    iget-object v3, v3, La/x4r;->i:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinWheelView;

    .line 812
    .line 813
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 814
    .line 815
    .line 816
    move-result-object v3

    .line 817
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 821
    .line 822
    invoke-virtual {v3, v0, v1, v4, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v5}, La/hyk0;->G0()La/x4r;

    .line 826
    .line 827
    .line 828
    move-result-object v0

    .line 829
    iget-object v0, v0, La/x4r;->i:Lorg/xplatform/spin_and_win/presentation/views/SpinAndWinWheelView;

    .line 830
    .line 831
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 832
    .line 833
    .line 834
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 835
    .line 836
    goto :goto_12

    .line 837
    :cond_1d
    invoke-static {}, La/t9f;->b()V

    .line 838
    .line 839
    .line 840
    :goto_12
    return-object v6

    .line 841
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
