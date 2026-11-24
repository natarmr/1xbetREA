.class public final La/hne0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/jne0;


# direct methods
.method public synthetic constructor <init>(La/jne0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hne0;->i:B

    iput-object p1, p0, La/hne0;->k:La/jne0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/hne0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/hne0;->k:La/jne0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/hne0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/hne0;-><init>(La/jne0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/hne0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/hne0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/hne0;-><init>(La/jne0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/hne0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/hne0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/yme0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/hne0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/hne0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/hne0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/qne0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/hne0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/hne0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/hne0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hne0;->i:B

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    iget-object v3, v0, La/hne0;->k:La/jne0;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object v0, v0, La/hne0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v0, La/yme0;

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v1, v3, La/jne0;->N1:La/ii;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    new-instance v5, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 30
    .line 31
    iget-object v4, v0, La/yme0;->a:Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v4, v6}, Lorg/xplatform/ui_core/resources/UiText;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    iget-object v4, v0, La/yme0;->b:Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 46
    .line 47
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v4, v7}, Lorg/xplatform/ui_core/resources/UiText;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    iget-object v4, v0, La/yme0;->c:Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 60
    .line 61
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v4, v8}, Lorg/xplatform/ui_core/resources/UiText;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    iget-object v4, v0, La/yme0;->d:Lorg/xplatform/ui_core/resources/UiText;

    .line 74
    .line 75
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-virtual {v4, v9}, Lorg/xplatform/ui_core/resources/UiText;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    iget-object v11, v0, La/yme0;->e:Ljava/lang/String;

    .line 88
    .line 89
    sget-object v14, La/n12;->b:La/n12;

    .line 90
    .line 91
    const/4 v15, 0x0

    .line 92
    const/16 v16, 0x5d0

    .line 93
    .line 94
    const/4 v10, 0x0

    .line 95
    const/4 v12, 0x0

    .line 96
    const/4 v13, 0x0

    .line 97
    invoke-direct/range {v5 .. v16}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v5, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, La/jne0;->G0()La/w3r;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    iget-object v0, v0, La/w3r;->d:Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;

    .line 115
    .line 116
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 117
    .line 118
    .line 119
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object v0

    .line 122
    :cond_0
    const-string v0, "actionDialogManager"

    .line 123
    .line 124
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v4

    .line 128
    :pswitch_0
    check-cast v0, La/qne0;

    .line 129
    .line 130
    sget-object v1, La/wne;->a:La/wne;

    .line 131
    .line 132
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    instance-of v1, v0, La/one0;

    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    if-eqz v1, :cond_4

    .line 139
    .line 140
    check-cast v0, La/one0;

    .line 141
    .line 142
    iget-object v1, v0, La/one0;->a:Ljava/lang/String;

    .line 143
    .line 144
    iget-object v0, v0, La/one0;->b:La/une0;

    .line 145
    .line 146
    sget-object v6, La/jne0;->S1:La/gne0;

    .line 147
    .line 148
    invoke-virtual {v3}, La/jne0;->G0()La/w3r;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    iget-object v7, v6, La/w3r;->c:La/zkk;

    .line 153
    .line 154
    iget-object v8, v7, La/zkk;->h:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v8, Landroid/widget/TextView;

    .line 157
    .line 158
    iget-object v9, v0, La/une0;->a:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    .line 162
    .line 163
    iget-object v8, v7, La/zkk;->e:Landroid/view/View;

    .line 164
    .line 165
    check-cast v8, Landroid/widget/TextView;

    .line 166
    .line 167
    iget-object v9, v0, La/une0;->d:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 170
    .line 171
    .line 172
    iget-object v7, v7, La/zkk;->d:Landroid/widget/TextView;

    .line 173
    .line 174
    iget-object v8, v0, La/une0;->c:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 177
    .line 178
    .line 179
    iget-object v6, v6, La/w3r;->b:La/zkk;

    .line 180
    .line 181
    iget-object v7, v6, La/zkk;->d:Landroid/widget/TextView;

    .line 182
    .line 183
    iget-object v8, v6, La/zkk;->e:Landroid/view/View;

    .line 184
    .line 185
    check-cast v8, Landroid/widget/TextView;

    .line 186
    .line 187
    iget-object v6, v6, La/zkk;->c:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v6, Landroid/widget/LinearLayout;

    .line 190
    .line 191
    iget-object v9, v0, La/une0;->e:Ljava/lang/String;

    .line 192
    .line 193
    filled-new-array {v1, v9}, [Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    const v9, 0x7f131101

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3, v9, v1}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    .line 206
    .line 207
    iget-object v0, v0, La/une0;->f:Ljava/util/ArrayList;

    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-nez v1, :cond_3

    .line 214
    .line 215
    iget-object v1, v3, La/jne0;->M1:La/ljf0;

    .line 216
    .line 217
    if-eqz v1, :cond_2

    .line 218
    .line 219
    iget-object v1, v1, La/ljf0;->a:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v1, La/gkz;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    const/4 v7, 0x5

    .line 228
    if-gt v4, v7, :cond_1

    .line 229
    .line 230
    goto :goto_0

    .line 231
    :cond_1
    invoke-static {v0, v7}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    :goto_0
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v8, v5}, Landroid/view/View;->setVisibility(I)V

    .line 242
    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_2
    const-string v0, "shortReferralRecyclerFragmentDelegate"

    .line 246
    .line 247
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    throw v4

    .line 251
    :cond_3
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v8, v2}, Landroid/view/View;->setVisibility(I)V

    .line 255
    .line 256
    .line 257
    :goto_1
    invoke-virtual {v3}, La/jne0;->G0()La/w3r;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    iget-object v0, v0, La/w3r;->d:Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;

    .line 262
    .line 263
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 264
    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_4
    sget-object v1, La/pne0;->a:La/pne0;

    .line 268
    .line 269
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_5

    .line 274
    .line 275
    sget-object v0, La/jne0;->S1:La/gne0;

    .line 276
    .line 277
    invoke-virtual {v3}, La/jne0;->G0()La/w3r;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    iget-object v0, v0, La/w3r;->d:Lorg/xplatform/ui_core/viewcomponents/loader/LoaderView;

    .line 282
    .line 283
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 284
    .line 285
    .line 286
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 290
    .line 291
    .line 292
    :goto_3
    return-object v4

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
