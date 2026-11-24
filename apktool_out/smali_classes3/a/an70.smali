.class public final La/an70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/bn70;


# direct methods
.method public synthetic constructor <init>(La/bn70;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/an70;->i:B

    iput-object p1, p0, La/an70;->k:La/bn70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/an70;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/an70;->k:La/bn70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/an70;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/an70;-><init>(La/bn70;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/an70;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/an70;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/an70;-><init>(La/bn70;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/an70;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/an70;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/an70;-><init>(La/bn70;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/an70;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/an70;

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/an70;-><init>(La/bn70;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/an70;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/an70;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/an70;-><init>(La/bn70;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/an70;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    new-instance v0, La/an70;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {v0, p0, p2, v1}, La/an70;-><init>(La/bn70;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/an70;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/an70;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/jn70;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/an70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/an70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/an70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/qn70;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/an70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/an70;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/an70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/hn70;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/an70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/an70;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/an70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/kn70;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/an70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/an70;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/an70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/io70;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/an70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/an70;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/an70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/in70;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/an70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/an70;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/an70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/an70;->i:B

    .line 4
    .line 5
    const v2, 0x7f130162

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    const v4, 0x7f1307bb

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const v6, 0x7f130e5c

    .line 14
    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v8, 0x1

    .line 18
    iget-object v9, v0, La/an70;->k:La/bn70;

    .line 19
    .line 20
    iget-object v0, v0, La/an70;->j:Ljava/lang/Object;

    .line 21
    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v0, La/jn70;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object v1, La/bn70;->S1:[La/iiy;

    .line 33
    .line 34
    invoke-virtual {v9}, La/bn70;->L0()La/zk70;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v1, v1, La/zk70;->j:Lorg/xplatform/core/presentation/views/tax_message/TaxMessageView;

    .line 39
    .line 40
    new-instance v2, La/pvo0;

    .line 41
    .line 42
    iget-boolean v3, v0, La/jn70;->a:Z

    .line 43
    .line 44
    iget-object v0, v0, La/jn70;->b:Ljava/lang/String;

    .line 45
    .line 46
    invoke-direct {v2, v0, v3}, La/pvo0;-><init>(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Lorg/xplatform/core/presentation/views/tax_message/TaxMessageView;->setUiModel(La/pvo0;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_0
    check-cast v0, La/qn70;

    .line 56
    .line 57
    sget-object v1, La/wne;->a:La/wne;

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object v1, La/bn70;->S1:[La/iiy;

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    instance-of v1, v0, La/ln70;

    .line 67
    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    check-cast v0, La/ln70;

    .line 71
    .line 72
    iget-boolean v1, v0, La/ln70;->a:Z

    .line 73
    .line 74
    iget-boolean v0, v0, La/ln70;->b:Z

    .line 75
    .line 76
    invoke-virtual {v9, v5}, La/bn70;->T0(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v9}, La/bn70;->R0()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v9, v0}, La/bn70;->U0(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v9, v1}, La/bn70;->V0(Z)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    instance-of v1, v0, La/pn70;

    .line 90
    .line 91
    if-eqz v1, :cond_1

    .line 92
    .line 93
    invoke-virtual {v9, v5}, La/bn70;->T0(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v9}, La/bn70;->R0()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v9, v5}, La/bn70;->U0(Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    instance-of v1, v0, La/mn70;

    .line 104
    .line 105
    if-eqz v1, :cond_2

    .line 106
    .line 107
    check-cast v0, La/mn70;

    .line 108
    .line 109
    iget-boolean v0, v0, La/mn70;->a:Z

    .line 110
    .line 111
    xor-int/lit8 v1, v0, 0x1

    .line 112
    .line 113
    invoke-virtual {v9, v1}, La/bn70;->V0(Z)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v9, v5}, La/bn70;->T0(Z)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v9}, La/bn70;->R0()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v9, v0}, La/bn70;->U0(Z)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    instance-of v1, v0, La/nn70;

    .line 127
    .line 128
    if-eqz v1, :cond_3

    .line 129
    .line 130
    check-cast v0, La/nn70;

    .line 131
    .line 132
    iget-boolean v0, v0, La/nn70;->a:Z

    .line 133
    .line 134
    invoke-virtual {v9, v0}, La/bn70;->T0(Z)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_3
    instance-of v1, v0, La/on70;

    .line 139
    .line 140
    if-eqz v1, :cond_4

    .line 141
    .line 142
    check-cast v0, La/on70;

    .line 143
    .line 144
    iget-object v12, v0, La/on70;->a:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v9}, La/bn70;->K0()La/ii;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 151
    .line 152
    invoke-virtual {v9, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    invoke-virtual {v9, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v13

    .line 160
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    sget-object v19, La/n12;->b:La/n12;

    .line 164
    .line 165
    const/16 v20, 0x0

    .line 166
    .line 167
    const/16 v21, 0x5d8

    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const/4 v15, 0x0

    .line 171
    const-string v16, "ONE_X_GAME_HOLDER_ERROR"

    .line 172
    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    const/16 v18, 0x0

    .line 176
    .line 177
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 188
    .line 189
    .line 190
    :goto_0
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 194
    .line 195
    .line 196
    :goto_1
    return-object v7

    .line 197
    :pswitch_1
    check-cast v0, La/hn70;

    .line 198
    .line 199
    sget-object v1, La/wne;->a:La/wne;

    .line 200
    .line 201
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    if-nez v0, :cond_5

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_5
    instance-of v1, v0, La/gn70;

    .line 208
    .line 209
    if-eqz v1, :cond_7

    .line 210
    .line 211
    check-cast v0, La/gn70;

    .line 212
    .line 213
    iget-object v1, v0, La/gn70;->a:Ljava/lang/String;

    .line 214
    .line 215
    iget v0, v0, La/gn70;->b:I

    .line 216
    .line 217
    sget-object v2, La/bn70;->S1:[La/iiy;

    .line 218
    .line 219
    invoke-virtual {v9}, La/bn70;->L0()La/zk70;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    iget-object v2, v2, La/zk70;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 224
    .line 225
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-static {v3}, La/o5k0;->a(Landroid/content/Context;)La/gbe0;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    new-instance v4, La/k1x;

    .line 234
    .line 235
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    invoke-direct {v4, v5}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 240
    .line 241
    .line 242
    iput-object v1, v4, La/k1x;->c:Ljava/lang/Object;

    .line 243
    .line 244
    invoke-static {v4, v2}, La/t1x;->h(La/k1x;Landroid/widget/ImageView;)V

    .line 245
    .line 246
    .line 247
    if-eqz v0, :cond_6

    .line 248
    .line 249
    invoke-static {v4, v0}, La/t1x;->f(La/k1x;I)V

    .line 250
    .line 251
    .line 252
    :cond_6
    invoke-static {v4}, La/q1x;->a(La/k1x;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4}, La/k1x;->a()La/o1x;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-virtual {v3, v0}, La/gbe0;->a(La/o1x;)La/iwk;

    .line 260
    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_7
    instance-of v1, v0, La/fn70;

    .line 264
    .line 265
    if-eqz v1, :cond_8

    .line 266
    .line 267
    sget-object v1, La/bn70;->S1:[La/iiy;

    .line 268
    .line 269
    invoke-virtual {v9}, La/bn70;->L0()La/zk70;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    iget-object v1, v1, La/zk70;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 274
    .line 275
    check-cast v0, La/fn70;

    .line 276
    .line 277
    iget-object v0, v0, La/fn70;->a:La/km60;

    .line 278
    .line 279
    invoke-virtual {v9, v1, v0}, La/bn70;->O0(Landroidx/appcompat/widget/AppCompatImageView;La/km60;)V

    .line 280
    .line 281
    .line 282
    :cond_8
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object v0

    .line 285
    :pswitch_2
    check-cast v0, La/kn70;

    .line 286
    .line 287
    sget-object v1, La/wne;->a:La/wne;

    .line 288
    .line 289
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    iget-boolean v0, v0, La/kn70;->a:Z

    .line 293
    .line 294
    sget-object v1, La/bn70;->S1:[La/iiy;

    .line 295
    .line 296
    invoke-virtual {v9, v0}, La/bn70;->V0(Z)V

    .line 297
    .line 298
    .line 299
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 300
    .line 301
    return-object v0

    .line 302
    :pswitch_3
    check-cast v0, La/io70;

    .line 303
    .line 304
    sget-object v1, La/wne;->a:La/wne;

    .line 305
    .line 306
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    instance-of v1, v0, La/do70;

    .line 310
    .line 311
    if-eqz v1, :cond_a

    .line 312
    .line 313
    check-cast v0, La/do70;

    .line 314
    .line 315
    iget-boolean v0, v0, La/do70;->a:Z

    .line 316
    .line 317
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    if-eqz v1, :cond_20

    .line 322
    .line 323
    const v1, 0x7f13032f

    .line 324
    .line 325
    .line 326
    if-eqz v0, :cond_9

    .line 327
    .line 328
    invoke-virtual {v9}, La/bn70;->K0()La/ii;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 333
    .line 334
    const v2, 0x7f130e2d

    .line 335
    .line 336
    .line 337
    invoke-virtual {v9, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v11

    .line 341
    const v2, 0x7f130a7e

    .line 342
    .line 343
    .line 344
    invoke-virtual {v9, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v12

    .line 348
    const v2, 0x7f13115a

    .line 349
    .line 350
    .line 351
    invoke-virtual {v9, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v13

    .line 355
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v14

    .line 362
    sget-object v19, La/n12;->b:La/n12;

    .line 363
    .line 364
    const/16 v20, 0x0

    .line 365
    .line 366
    const/16 v21, 0x5d0

    .line 367
    .line 368
    const/4 v15, 0x0

    .line 369
    const-string v16, "NOT_ENOUGH_FUNDS"

    .line 370
    .line 371
    const/16 v17, 0x0

    .line 372
    .line 373
    const/16 v18, 0x0

    .line 374
    .line 375
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 386
    .line 387
    .line 388
    goto/16 :goto_a

    .line 389
    .line 390
    :cond_9
    invoke-virtual {v9}, La/bn70;->K0()La/ii;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 395
    .line 396
    invoke-virtual {v9, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v11

    .line 400
    const v2, 0x7f130e2c

    .line 401
    .line 402
    .line 403
    invoke-virtual {v9, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v12

    .line 407
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v13

    .line 411
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    sget-object v19, La/n12;->b:La/n12;

    .line 415
    .line 416
    const/16 v20, 0x0

    .line 417
    .line 418
    const/16 v21, 0x5f8

    .line 419
    .line 420
    const/4 v14, 0x0

    .line 421
    const/4 v15, 0x0

    .line 422
    const/16 v16, 0x0

    .line 423
    .line 424
    const/16 v17, 0x0

    .line 425
    .line 426
    const/16 v18, 0x0

    .line 427
    .line 428
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 439
    .line 440
    .line 441
    goto/16 :goto_a

    .line 442
    .line 443
    :cond_a
    instance-of v1, v0, La/co70;

    .line 444
    .line 445
    const v10, 0x7f1316f5

    .line 446
    .line 447
    .line 448
    if-eqz v1, :cond_b

    .line 449
    .line 450
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 451
    .line 452
    invoke-virtual {v9}, La/bn70;->K0()La/ii;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    sget v1, La/xgs;->f2:I

    .line 457
    .line 458
    invoke-virtual {v9, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v12

    .line 462
    const v1, 0x7f130926

    .line 463
    .line 464
    .line 465
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v13

    .line 469
    const v1, 0x7f130927

    .line 470
    .line 471
    .line 472
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v14

    .line 476
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    const v1, 0x7f130928

    .line 480
    .line 481
    .line 482
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v15

    .line 486
    const v1, 0x7f130929

    .line 487
    .line 488
    .line 489
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v18

    .line 493
    sget-object v20, La/n12;->a:La/n12;

    .line 494
    .line 495
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 496
    .line 497
    const/16 v21, 0x0

    .line 498
    .line 499
    const/16 v22, 0x590

    .line 500
    .line 501
    const/16 v16, 0x0

    .line 502
    .line 503
    const-string v17, "GameIsNotFinishedDialog.REQUEST_KEY"

    .line 504
    .line 505
    const/16 v19, 0x0

    .line 506
    .line 507
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 508
    .line 509
    .line 510
    new-instance v1, La/xgs;

    .line 511
    .line 512
    invoke-direct {v1}, La/xgs;-><init>()V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v1, v11}, La/u0i;->R0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0, v1, v2}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 526
    .line 527
    .line 528
    goto/16 :goto_a

    .line 529
    .line 530
    :cond_b
    instance-of v1, v0, La/ho70;

    .line 531
    .line 532
    if-eqz v1, :cond_c

    .line 533
    .line 534
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 535
    .line 536
    invoke-virtual {v9}, La/bn70;->K0()La/ii;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 541
    .line 542
    invoke-virtual {v9, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v12

    .line 546
    const v1, 0x7f1316f7

    .line 547
    .line 548
    .line 549
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v13

    .line 553
    const v1, 0x7f1316f6

    .line 554
    .line 555
    .line 556
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v14

    .line 560
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    sget-object v20, La/n12;->a:La/n12;

    .line 564
    .line 565
    const/16 v21, 0x0

    .line 566
    .line 567
    const/16 v22, 0x5d8

    .line 568
    .line 569
    const/4 v15, 0x0

    .line 570
    const/16 v16, 0x0

    .line 571
    .line 572
    const-string v17, "UNFINISHED_GAME_DIALOG_RESULT"

    .line 573
    .line 574
    const/16 v18, 0x0

    .line 575
    .line 576
    const/16 v19, 0x0

    .line 577
    .line 578
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 589
    .line 590
    .line 591
    goto/16 :goto_a

    .line 592
    .line 593
    :cond_c
    instance-of v1, v0, La/bo70;

    .line 594
    .line 595
    if-eqz v1, :cond_e

    .line 596
    .line 597
    check-cast v0, La/bo70;

    .line 598
    .line 599
    iget-boolean v0, v0, La/bo70;->a:Z

    .line 600
    .line 601
    sget-object v1, La/bn70;->S1:[La/iiy;

    .line 602
    .line 603
    invoke-virtual {v9}, La/bn70;->K0()La/ii;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 608
    .line 609
    invoke-virtual {v9, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v11

    .line 613
    if-eqz v0, :cond_d

    .line 614
    .line 615
    const v0, 0x7f1302c4

    .line 616
    .line 617
    .line 618
    invoke-virtual {v9, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    :goto_3
    move-object v12, v0

    .line 623
    goto :goto_4

    .line 624
    :cond_d
    const v0, 0x7f1302c6

    .line 625
    .line 626
    .line 627
    invoke-virtual {v9, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    goto :goto_3

    .line 632
    :goto_4
    const v0, 0x7f130e5d

    .line 633
    .line 634
    .line 635
    invoke-virtual {v9, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v13

    .line 639
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    sget-object v19, La/n12;->b:La/n12;

    .line 643
    .line 644
    const/16 v20, 0x0

    .line 645
    .line 646
    const/16 v21, 0x5f8

    .line 647
    .line 648
    const/4 v14, 0x0

    .line 649
    const/4 v15, 0x0

    .line 650
    const/16 v16, 0x0

    .line 651
    .line 652
    const/16 v17, 0x0

    .line 653
    .line 654
    const/16 v18, 0x0

    .line 655
    .line 656
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v1, v10, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 667
    .line 668
    .line 669
    goto/16 :goto_a

    .line 670
    .line 671
    :cond_e
    instance-of v1, v0, La/eo70;

    .line 672
    .line 673
    if-eqz v1, :cond_f

    .line 674
    .line 675
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 676
    .line 677
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    if-eqz v0, :cond_20

    .line 682
    .line 683
    invoke-virtual {v9}, La/bn70;->K0()La/ii;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 688
    .line 689
    invoke-virtual {v9, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v11

    .line 693
    const v1, 0x7f1307f0

    .line 694
    .line 695
    .line 696
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v12

    .line 700
    invoke-virtual {v9, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v13

    .line 704
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    sget-object v19, La/n12;->b:La/n12;

    .line 708
    .line 709
    const/16 v20, 0x0

    .line 710
    .line 711
    const/16 v21, 0x5d8

    .line 712
    .line 713
    const/4 v14, 0x0

    .line 714
    const/4 v15, 0x0

    .line 715
    const-string v16, "INSUFFICIENT_DIALOG_ERROR_KEY"

    .line 716
    .line 717
    const/16 v17, 0x0

    .line 718
    .line 719
    const/16 v18, 0x0

    .line 720
    .line 721
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 732
    .line 733
    .line 734
    goto/16 :goto_a

    .line 735
    .line 736
    :cond_f
    instance-of v1, v0, La/rn70;

    .line 737
    .line 738
    if-eqz v1, :cond_10

    .line 739
    .line 740
    check-cast v0, La/rn70;

    .line 741
    .line 742
    iget-boolean v0, v0, La/rn70;->a:Z

    .line 743
    .line 744
    invoke-virtual {v9, v0}, La/bn70;->G0(Z)V

    .line 745
    .line 746
    .line 747
    goto/16 :goto_a

    .line 748
    .line 749
    :cond_10
    instance-of v1, v0, La/sn70;

    .line 750
    .line 751
    if-eqz v1, :cond_11

    .line 752
    .line 753
    sget-object v0, La/qh70;->O1:La/nh70;

    .line 754
    .line 755
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 756
    .line 757
    .line 758
    new-instance v0, La/qh70;

    .line 759
    .line 760
    invoke-direct {v0}, La/qh70;-><init>()V

    .line 761
    .line 762
    .line 763
    const v1, 0x7f0a0ad9

    .line 764
    .line 765
    .line 766
    invoke-virtual {v9, v1, v0}, La/bn70;->I0(ILandroidx/fragment/app/Fragment;)V

    .line 767
    .line 768
    .line 769
    goto/16 :goto_a

    .line 770
    .line 771
    :cond_11
    instance-of v1, v0, La/tn70;

    .line 772
    .line 773
    if-eqz v1, :cond_12

    .line 774
    .line 775
    check-cast v0, La/tn70;

    .line 776
    .line 777
    iget-object v0, v0, La/tn70;->a:La/s470;

    .line 778
    .line 779
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    sget-object v1, La/lo60;->U1:La/htz;

    .line 783
    .line 784
    iget-object v2, v9, La/bn70;->O1:La/yzn0;

    .line 785
    .line 786
    sget-object v4, La/bn70;->S1:[La/iiy;

    .line 787
    .line 788
    aget-object v4, v4, v5

    .line 789
    .line 790
    invoke-virtual {v2, v9, v4}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    check-cast v2, La/csr;

    .line 795
    .line 796
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 797
    .line 798
    .line 799
    new-instance v1, La/lo60;

    .line 800
    .line 801
    invoke-direct {v1}, La/lo60;-><init>()V

    .line 802
    .line 803
    .line 804
    sget-object v4, La/lo60;->V1:[La/iiy;

    .line 805
    .line 806
    aget-object v5, v4, v8

    .line 807
    .line 808
    iget-object v6, v1, La/lo60;->R1:La/yzn0;

    .line 809
    .line 810
    invoke-virtual {v6, v1, v5, v2}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 811
    .line 812
    .line 813
    iget-object v2, v1, La/lo60;->S1:La/yzn0;

    .line 814
    .line 815
    aget-object v3, v4, v3

    .line 816
    .line 817
    invoke-virtual {v2, v1, v3, v0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 818
    .line 819
    .line 820
    const v0, 0x7f0a064e

    .line 821
    .line 822
    .line 823
    invoke-virtual {v9, v0, v1}, La/bn70;->I0(ILandroidx/fragment/app/Fragment;)V

    .line 824
    .line 825
    .line 826
    goto/16 :goto_a

    .line 827
    .line 828
    :cond_12
    instance-of v1, v0, La/un70;

    .line 829
    .line 830
    if-eqz v1, :cond_13

    .line 831
    .line 832
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 833
    .line 834
    invoke-virtual {v9}, La/bn70;->R0()V

    .line 835
    .line 836
    .line 837
    goto/16 :goto_a

    .line 838
    .line 839
    :cond_13
    instance-of v1, v0, La/ao70;

    .line 840
    .line 841
    if-eqz v1, :cond_19

    .line 842
    .line 843
    sget-object v1, La/bn70;->S1:[La/iiy;

    .line 844
    .line 845
    invoke-virtual {v9}, La/bn70;->L0()La/zk70;

    .line 846
    .line 847
    .line 848
    move-result-object v1

    .line 849
    iget-object v1, v1, La/zk70;->d:Landroid/widget/FrameLayout;

    .line 850
    .line 851
    invoke-virtual {v9}, La/bn70;->L0()La/zk70;

    .line 852
    .line 853
    .line 854
    move-result-object v2

    .line 855
    iget-object v2, v2, La/zk70;->e:Landroid/widget/TextView;

    .line 856
    .line 857
    check-cast v0, La/ao70;

    .line 858
    .line 859
    iget-wide v10, v0, La/ao70;->a:D

    .line 860
    .line 861
    iget-boolean v4, v0, La/ao70;->b:Z

    .line 862
    .line 863
    iget-object v0, v0, La/ao70;->c:Ljava/lang/String;

    .line 864
    .line 865
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 866
    .line 867
    .line 868
    new-instance v6, La/x1h0;

    .line 869
    .line 870
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 871
    .line 872
    .line 873
    iput-object v1, v6, La/x1h0;->a:Landroid/view/ViewGroup;

    .line 874
    .line 875
    const-wide/16 v12, 0x0

    .line 876
    .line 877
    cmpl-double v8, v10, v12

    .line 878
    .line 879
    if-lez v8, :cond_14

    .line 880
    .line 881
    if-eqz v4, :cond_14

    .line 882
    .line 883
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 884
    .line 885
    const v3, 0x7f13073d

    .line 886
    .line 887
    .line 888
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v3

    .line 892
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 893
    .line 894
    .line 895
    new-array v4, v5, [Ljava/lang/Object;

    .line 896
    .line 897
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v4

    .line 901
    invoke-static {v0, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    goto :goto_5

    .line 906
    :cond_14
    if-lez v8, :cond_15

    .line 907
    .line 908
    if-nez v4, :cond_15

    .line 909
    .line 910
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 911
    .line 912
    const v8, 0x7f131813

    .line 913
    .line 914
    .line 915
    invoke-virtual {v9, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v8

    .line 919
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 923
    .line 924
    .line 925
    move-result-object v10

    .line 926
    filled-new-array {v10, v0}, [Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    invoke-static {v4, v8, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    goto :goto_5

    .line 939
    :cond_15
    const v0, 0x7f130bb0

    .line 940
    .line 941
    .line 942
    invoke-virtual {v9, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    :goto_5
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    new-instance v2, La/nms0;

    .line 957
    .line 958
    invoke-direct {v2, v0}, La/nms0;-><init>(Landroid/content/Context;)V

    .line 959
    .line 960
    .line 961
    const/high16 v3, 0x7f160000

    .line 962
    .line 963
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 968
    .line 969
    .line 970
    move-result-object v3

    .line 971
    :try_start_0
    invoke-static {v3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    invoke-virtual {v2, v3, v0, v7}, La/nms0;->b(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;La/gms0;)La/gms0;

    .line 976
    .line 977
    .line 978
    move-result-object v0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 979
    invoke-interface {v3}, Landroid/content/res/XmlResourceParser;->close()V

    .line 980
    .line 981
    .line 982
    sget-object v2, La/tms0;->c:Ljava/util/ArrayList;

    .line 983
    .line 984
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 985
    .line 986
    .line 987
    move-result v3

    .line 988
    if-nez v3, :cond_18

    .line 989
    .line 990
    const v3, 0x7f0a1031

    .line 991
    .line 992
    .line 993
    invoke-virtual {v1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 994
    .line 995
    .line 996
    move-result-object v4

    .line 997
    check-cast v4, La/x1h0;

    .line 998
    .line 999
    if-nez v0, :cond_17

    .line 1000
    .line 1001
    if-eqz v4, :cond_16

    .line 1002
    .line 1003
    iget-object v0, v4, La/x1h0;->a:Landroid/view/ViewGroup;

    .line 1004
    .line 1005
    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    check-cast v0, La/x1h0;

    .line 1010
    .line 1011
    :cond_16
    invoke-virtual {v1, v3, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 1012
    .line 1013
    .line 1014
    goto :goto_6

    .line 1015
    :cond_17
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v0}, La/gms0;->n()La/gms0;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v0

    .line 1022
    invoke-static {v1, v0}, La/tms0;->d(Landroid/view/ViewGroup;La/gms0;)V

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v1, v3, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 1026
    .line 1027
    .line 1028
    invoke-static {v1, v0}, La/tms0;->c(Landroid/view/ViewGroup;La/gms0;)V

    .line 1029
    .line 1030
    .line 1031
    :cond_18
    :goto_6
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1032
    .line 1033
    .line 1034
    goto/16 :goto_a

    .line 1035
    .line 1036
    :catchall_0
    move-exception v0

    .line 1037
    goto :goto_9

    .line 1038
    :catch_0
    move-exception v0

    .line 1039
    goto :goto_7

    .line 1040
    :catch_1
    move-exception v0

    .line 1041
    goto :goto_8

    .line 1042
    :goto_7
    :try_start_1
    new-instance v1, Landroid/view/InflateException;

    .line 1043
    .line 1044
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1045
    .line 1046
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1047
    .line 1048
    .line 1049
    invoke-interface {v3}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v4

    .line 1053
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1054
    .line 1055
    .line 1056
    const-string v4, ": "

    .line 1057
    .line 1058
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v4

    .line 1065
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v2

    .line 1072
    invoke-direct {v1, v2, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1073
    .line 1074
    .line 1075
    throw v1

    .line 1076
    :goto_8
    new-instance v1, Landroid/view/InflateException;

    .line 1077
    .line 1078
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v2

    .line 1082
    invoke-direct {v1, v2, v0}, Landroid/view/InflateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1083
    .line 1084
    .line 1085
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1086
    :goto_9
    invoke-interface {v3}, Landroid/content/res/XmlResourceParser;->close()V

    .line 1087
    .line 1088
    .line 1089
    throw v0

    .line 1090
    :cond_19
    instance-of v1, v0, La/go70;

    .line 1091
    .line 1092
    if-eqz v1, :cond_1a

    .line 1093
    .line 1094
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 1095
    .line 1096
    invoke-virtual {v9}, La/bn70;->K0()La/ii;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v0

    .line 1100
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1101
    .line 1102
    const v1, 0x7f1314d4

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v11

    .line 1109
    const v1, 0x7f13093b

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v12

    .line 1116
    const v1, 0x7f1304f9

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v13

    .line 1123
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1124
    .line 1125
    .line 1126
    sget-object v19, La/n12;->b:La/n12;

    .line 1127
    .line 1128
    const/16 v20, 0x0

    .line 1129
    .line 1130
    const/16 v21, 0x5d8

    .line 1131
    .line 1132
    const/4 v14, 0x0

    .line 1133
    const/4 v15, 0x0

    .line 1134
    const-string v16, "HOLDER_TECHNICAL_WORKS_DIALOG_REQUEST_KEY"

    .line 1135
    .line 1136
    const/16 v17, 0x0

    .line 1137
    .line 1138
    const/16 v18, 0x0

    .line 1139
    .line 1140
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v1

    .line 1147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1151
    .line 1152
    .line 1153
    goto/16 :goto_a

    .line 1154
    .line 1155
    :cond_1a
    instance-of v1, v0, La/vn70;

    .line 1156
    .line 1157
    if-eqz v1, :cond_1b

    .line 1158
    .line 1159
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 1160
    .line 1161
    invoke-virtual {v9}, La/bn70;->Q0()La/to70;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v0

    .line 1165
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v1

    .line 1169
    invoke-virtual {v0, v1}, La/to70;->B(Landroid/content/Context;)V

    .line 1170
    .line 1171
    .line 1172
    goto/16 :goto_a

    .line 1173
    .line 1174
    :cond_1b
    instance-of v1, v0, La/wn70;

    .line 1175
    .line 1176
    if-eqz v1, :cond_1c

    .line 1177
    .line 1178
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 1179
    .line 1180
    new-instance v0, Landroid/content/Intent;

    .line 1181
    .line 1182
    const-string v1, "android.settings.SETTINGS"

    .line 1183
    .line 1184
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1185
    .line 1186
    .line 1187
    invoke-virtual {v9, v0}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 1188
    .line 1189
    .line 1190
    goto/16 :goto_a

    .line 1191
    .line 1192
    :cond_1c
    instance-of v1, v0, La/fo70;

    .line 1193
    .line 1194
    if-eqz v1, :cond_1d

    .line 1195
    .line 1196
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 1197
    .line 1198
    invoke-virtual {v9}, La/bn70;->K0()La/ii;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1203
    .line 1204
    invoke-virtual {v9, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v11

    .line 1208
    const v1, 0x7f13115d

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v12

    .line 1215
    invoke-virtual {v9, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v13

    .line 1219
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1220
    .line 1221
    .line 1222
    sget-object v19, La/n12;->b:La/n12;

    .line 1223
    .line 1224
    const/16 v20, 0x0

    .line 1225
    .line 1226
    const/16 v21, 0x5d8

    .line 1227
    .line 1228
    const/4 v14, 0x0

    .line 1229
    const/4 v15, 0x0

    .line 1230
    const-string v16, "REQUEST_DIALOG_ERROR_KEY"

    .line 1231
    .line 1232
    const/16 v17, 0x0

    .line 1233
    .line 1234
    const/16 v18, 0x0

    .line 1235
    .line 1236
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v1

    .line 1243
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1247
    .line 1248
    .line 1249
    goto :goto_a

    .line 1250
    :cond_1d
    instance-of v1, v0, La/yn70;

    .line 1251
    .line 1252
    const-string v2, ""

    .line 1253
    .line 1254
    if-eqz v1, :cond_1e

    .line 1255
    .line 1256
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v1

    .line 1260
    check-cast v0, La/yn70;

    .line 1261
    .line 1262
    iget-wide v3, v0, La/yn70;->a:J

    .line 1263
    .line 1264
    invoke-static {v1, v3, v4, v2}, La/o2t;->b(Landroidx/fragment/app/e;JLjava/lang/String;)V

    .line 1265
    .line 1266
    .line 1267
    goto :goto_a

    .line 1268
    :cond_1e
    sget-object v1, La/zn70;->a:La/zn70;

    .line 1269
    .line 1270
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1271
    .line 1272
    .line 1273
    move-result v1

    .line 1274
    if-eqz v1, :cond_1f

    .line 1275
    .line 1276
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v0

    .line 1280
    sget-object v1, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;->a:Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$PreviewActionGamesUnderMaintenance;

    .line 1281
    .line 1282
    invoke-static {v0, v1, v2}, La/o2t;->c(Landroidx/fragment/app/e;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V

    .line 1283
    .line 1284
    .line 1285
    goto :goto_a

    .line 1286
    :cond_1f
    instance-of v1, v0, La/xn70;

    .line 1287
    .line 1288
    if-eqz v1, :cond_21

    .line 1289
    .line 1290
    check-cast v0, La/xn70;

    .line 1291
    .line 1292
    iget-object v0, v0, La/xn70;->a:La/csr;

    .line 1293
    .line 1294
    sget-object v1, La/bn70;->S1:[La/iiy;

    .line 1295
    .line 1296
    new-instance v1, Landroid/os/Bundle;

    .line 1297
    .line 1298
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1299
    .line 1300
    .line 1301
    const-string v2, "OneXGames.BONUS_NOT_USED_RESULT_DATA_KEY"

    .line 1302
    .line 1303
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 1304
    .line 1305
    .line 1306
    const-string v0, "OneXGames.BONUS_NOT_USED_RESULT_KEY"

    .line 1307
    .line 1308
    invoke-static {v1, v9, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1309
    .line 1310
    .line 1311
    :cond_20
    :goto_a
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1312
    .line 1313
    goto :goto_b

    .line 1314
    :cond_21
    invoke-static {}, La/t9f;->b()V

    .line 1315
    .line 1316
    .line 1317
    :goto_b
    return-object v7

    .line 1318
    :pswitch_4
    check-cast v0, La/in70;

    .line 1319
    .line 1320
    sget-object v1, La/wne;->a:La/wne;

    .line 1321
    .line 1322
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1323
    .line 1324
    .line 1325
    sget-object v1, La/in70;->a:La/in70;

    .line 1326
    .line 1327
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1328
    .line 1329
    .line 1330
    move-result v1

    .line 1331
    if-eqz v1, :cond_23

    .line 1332
    .line 1333
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 1334
    .line 1335
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v0

    .line 1339
    if-eqz v0, :cond_22

    .line 1340
    .line 1341
    invoke-static {v0}, La/sj3;->J(Landroid/content/Context;)Z

    .line 1342
    .line 1343
    .line 1344
    move-result v0

    .line 1345
    goto :goto_c

    .line 1346
    :cond_22
    move v0, v8

    .line 1347
    :goto_c
    new-instance v1, La/xm70;

    .line 1348
    .line 1349
    invoke-direct {v1, v9, v8}, La/xm70;-><init>(La/bn70;B)V

    .line 1350
    .line 1351
    .line 1352
    new-instance v2, La/xm70;

    .line 1353
    .line 1354
    invoke-direct {v2, v9, v3}, La/xm70;-><init>(La/bn70;B)V

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v9}, La/bn70;->K0()La/ii;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v3

    .line 1361
    invoke-static {v9, v0, v1, v2, v3}, La/kpb;->w0(Landroidx/fragment/app/Fragment;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ii;)V

    .line 1362
    .line 1363
    .line 1364
    goto :goto_d

    .line 1365
    :cond_23
    sget-object v1, La/in70;->b:La/in70;

    .line 1366
    .line 1367
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1368
    .line 1369
    .line 1370
    move-result v0

    .line 1371
    if-eqz v0, :cond_24

    .line 1372
    .line 1373
    sget-object v0, La/bn70;->S1:[La/iiy;

    .line 1374
    .line 1375
    invoke-virtual {v9}, La/bn70;->K0()La/ii;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v0

    .line 1379
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1380
    .line 1381
    invoke-virtual {v9, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v11

    .line 1385
    const v1, 0x7f1316f0

    .line 1386
    .line 1387
    .line 1388
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v12

    .line 1392
    invoke-virtual {v9, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v13

    .line 1396
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1397
    .line 1398
    .line 1399
    sget-object v19, La/n12;->a:La/n12;

    .line 1400
    .line 1401
    const/16 v20, 0x0

    .line 1402
    .line 1403
    const/16 v21, 0x5d8

    .line 1404
    .line 1405
    const/4 v14, 0x0

    .line 1406
    const/4 v15, 0x0

    .line 1407
    const-string v16, "CHANGE_BONUS_BALANCE_TO_PRIMARY_KEY"

    .line 1408
    .line 1409
    const/16 v17, 0x0

    .line 1410
    .line 1411
    const/16 v18, 0x0

    .line 1412
    .line 1413
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v1

    .line 1420
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1424
    .line 1425
    .line 1426
    :goto_d
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1427
    .line 1428
    goto :goto_e

    .line 1429
    :cond_24
    invoke-static {}, La/t9f;->b()V

    .line 1430
    .line 1431
    .line 1432
    :goto_e
    return-object v7

    .line 1433
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
