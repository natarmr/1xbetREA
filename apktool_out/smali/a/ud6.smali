.class public final La/ud6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/wd6;


# direct methods
.method public synthetic constructor <init>(La/wd6;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ud6;->i:B

    iput-object p1, p0, La/ud6;->k:La/wd6;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ud6;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ud6;->k:La/wd6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ud6;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ud6;-><init>(La/wd6;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ud6;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ud6;

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ud6;-><init>(La/wd6;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ud6;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/ud6;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/ud6;-><init>(La/wd6;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/ud6;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/ud6;

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/ud6;-><init>(La/wd6;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/ud6;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/ud6;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/ud6;-><init>(La/wd6;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/ud6;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    new-instance v0, La/ud6;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-direct {v0, p0, p2, v1}, La/ud6;-><init>(La/wd6;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/ud6;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/ud6;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ud6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ud6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ud6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ud6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ud6;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ud6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/ee6;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/ud6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/ud6;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/ud6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/ce6;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/ud6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/ud6;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/ud6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/zd6;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/ud6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/ud6;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/ud6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/de6;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/ud6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/ud6;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/ud6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/ud6;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, La/ud6;->k:La/wd6;

    .line 7
    .line 8
    iget-object p0, p0, La/ud6;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Ljava/lang/String;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v4}, La/wd6;->V0()La/xo8;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p1, p1, La/xo8;->b:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setTrailingText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    check-cast p0, Ljava/lang/String;

    .line 33
    .line 34
    sget-object v0, La/wne;->a:La/wne;

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, v4, La/wd6;->n2:La/pe6;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-boolean v0, p1, La/pe6;->b:Z

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-lez v0, :cond_0

    .line 55
    .line 56
    iput-object p0, p1, La/pe6;->e:Ljava/lang/String;

    .line 57
    .line 58
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_1
    check-cast p0, La/ee6;

    .line 62
    .line 63
    sget-object v0, La/wne;->a:La/wne;

    .line 64
    .line 65
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance p1, La/pe6;

    .line 69
    .line 70
    iget-boolean v0, p0, La/ee6;->a:Z

    .line 71
    .line 72
    new-instance v1, La/rd6;

    .line 73
    .line 74
    invoke-direct {v1, v4, v3}, La/rd6;-><init>(La/wd6;B)V

    .line 75
    .line 76
    .line 77
    new-instance v5, La/yj5;

    .line 78
    .line 79
    sget-object v6, La/wd6;->o2:La/cl5;

    .line 80
    .line 81
    invoke-virtual {v4}, La/wd6;->W0()La/me6;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    const/4 v11, 0x0

    .line 86
    const/16 v12, 0x8

    .line 87
    .line 88
    const/4 v6, 0x1

    .line 89
    const-class v8, La/me6;

    .line 90
    .line 91
    const-string v9, "onTextChange"

    .line 92
    .line 93
    const-string v10, "onTextChange(Ljava/lang/String;)V"

    .line 94
    .line 95
    invoke-direct/range {v5 .. v12}, La/yj5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 96
    .line 97
    .line 98
    invoke-direct {p1, v0, v1, v5}, La/pe6;-><init>(ZLa/rd6;La/yj5;)V

    .line 99
    .line 100
    .line 101
    iput-object p1, v4, La/wd6;->n2:La/pe6;

    .line 102
    .line 103
    iget-object v0, p0, La/ee6;->c:Ljava/lang/String;

    .line 104
    .line 105
    iget-boolean v1, p1, La/pe6;->b:Z

    .line 106
    .line 107
    if-eqz v1, :cond_1

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-lez v1, :cond_1

    .line 114
    .line 115
    iput-object v0, p1, La/pe6;->e:Ljava/lang/String;

    .line 116
    .line 117
    :cond_1
    iget-object p1, v4, La/wd6;->n2:La/pe6;

    .line 118
    .line 119
    if-eqz p1, :cond_2

    .line 120
    .line 121
    iget-boolean p0, p0, La/ee6;->b:Z

    .line 122
    .line 123
    iput-boolean p0, p1, La/pe6;->f:Z

    .line 124
    .line 125
    :cond_2
    invoke-virtual {v4}, La/wd6;->V0()La/xo8;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    iget-object p0, p0, La/xo8;->b:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 130
    .line 131
    new-instance p1, La/tjj;

    .line 132
    .line 133
    const/16 v0, 0xd

    .line 134
    .line 135
    const/4 v1, 0x2

    .line 136
    invoke-direct {p1, v0, v1}, La/tjj;-><init>(II)V

    .line 137
    .line 138
    .line 139
    new-array v0, v3, [Landroid/text/InputFilter;

    .line 140
    .line 141
    aput-object p1, v0, v2

    .line 142
    .line 143
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setFilters([Landroid/text/InputFilter;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 147
    .line 148
    .line 149
    iget-object p0, v4, La/wd6;->n2:La/pe6;

    .line 150
    .line 151
    if-eqz p0, :cond_3

    .line 152
    .line 153
    invoke-virtual {v4}, La/wd6;->V0()La/xo8;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iget-object p1, p1, La/xo8;->b:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 158
    .line 159
    iget-object p1, p1, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 160
    .line 161
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 162
    .line 163
    .line 164
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_2
    check-cast p0, La/ce6;

    .line 168
    .line 169
    sget-object v0, La/wne;->a:La/wne;

    .line 170
    .line 171
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    sget-object p1, La/ae6;->a:La/ae6;

    .line 175
    .line 176
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-nez p1, :cond_8

    .line 181
    .line 182
    instance-of p1, p0, La/be6;

    .line 183
    .line 184
    if-eqz p1, :cond_7

    .line 185
    .line 186
    iget-object p1, v4, La/wd6;->l2:La/dub0;

    .line 187
    .line 188
    if-eqz p1, :cond_6

    .line 189
    .line 190
    move-object v0, p0

    .line 191
    check-cast v0, La/be6;

    .line 192
    .line 193
    iget-boolean v1, v0, La/be6;->c:Z

    .line 194
    .line 195
    iget-boolean v2, v0, La/be6;->b:Z

    .line 196
    .line 197
    iget-object v0, v0, La/be6;->a:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {p1, v0}, La/dub0;->setTitle(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    const/high16 v0, 0x3f000000    # 0.5f

    .line 203
    .line 204
    const/high16 v3, 0x3f800000    # 1.0f

    .line 205
    .line 206
    if-eqz v2, :cond_4

    .line 207
    .line 208
    move v5, v3

    .line 209
    goto :goto_0

    .line 210
    :cond_4
    move v5, v0

    .line 211
    :goto_0
    invoke-virtual {p1, v5}, La/dub0;->setPreviousButtonAlpha(F)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v2}, La/dub0;->setPreviousButtonEnable(Z)V

    .line 215
    .line 216
    .line 217
    if-eqz v1, :cond_5

    .line 218
    .line 219
    move v0, v3

    .line 220
    :cond_5
    invoke-virtual {p1, v0}, La/dub0;->setNextButtonAlpha(F)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, v1}, La/dub0;->setNextButtonEnable(Z)V

    .line 224
    .line 225
    .line 226
    :cond_6
    invoke-virtual {v4}, La/wd6;->V0()La/xo8;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    iget-object p1, p1, La/xo8;->b:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 231
    .line 232
    check-cast p0, La/be6;

    .line 233
    .line 234
    iget-object p0, p0, La/be6;->d:Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setText(Ljava/lang/CharSequence;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setSelection(I)V

    .line 244
    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 248
    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_8
    :goto_1
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    :goto_2
    return-object v1

    .line 254
    :pswitch_3
    check-cast p0, La/zd6;

    .line 255
    .line 256
    sget-object v0, La/wne;->a:La/wne;

    .line 257
    .line 258
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    iget-object p1, p0, La/zd6;->a:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-nez v0, :cond_9

    .line 268
    .line 269
    move-object p1, v1

    .line 270
    :cond_9
    invoke-virtual {v4}, La/wd6;->V0()La/xo8;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    iget-object v0, v0, La/xo8;->b:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 275
    .line 276
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setErrorText(Ljava/lang/CharSequence;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v4}, La/wd6;->V0()La/xo8;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    iget-object p1, p1, La/xo8;->b:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 284
    .line 285
    iget-object v0, p0, La/zd6;->b:Ljava/lang/String;

    .line 286
    .line 287
    invoke-static {v0}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    iget-boolean p0, p0, La/zd6;->c:Z

    .line 295
    .line 296
    new-instance v5, Landroid/text/SpannableStringBuilder;

    .line 297
    .line 298
    invoke-direct {v5}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v5, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    if-eqz p0, :cond_a

    .line 306
    .line 307
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 308
    .line 309
    .line 310
    move-result p0

    .line 311
    if-lez p0, :cond_a

    .line 312
    .line 313
    new-instance p0, Landroid/text/style/ImageSpan;

    .line 314
    .line 315
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    const v4, 0x7f080784

    .line 320
    .line 321
    .line 322
    invoke-direct {p0, v0, v4}, Landroid/text/style/ImageSpan;-><init>(Landroid/content/Context;I)V

    .line 323
    .line 324
    .line 325
    const-string v0, "\u00a0\u00a0"

    .line 326
    .line 327
    invoke-virtual {v5, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    sub-int/2addr v0, v3

    .line 335
    invoke-virtual {v5}, Landroid/text/SpannableStringBuilder;->length()I

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    invoke-virtual {v5, p0, v0, v3, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 340
    .line 341
    .line 342
    :cond_a
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 343
    .line 344
    .line 345
    move-result p0

    .line 346
    if-nez p0, :cond_b

    .line 347
    .line 348
    goto :goto_3

    .line 349
    :cond_b
    move-object v1, v5

    .line 350
    :goto_3
    invoke-virtual {p1, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setHelperText(Landroid/text/Spannable;)V

    .line 351
    .line 352
    .line 353
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 354
    .line 355
    return-object p0

    .line 356
    :pswitch_4
    check-cast p0, La/de6;

    .line 357
    .line 358
    sget-object v0, La/wne;->a:La/wne;

    .line 359
    .line 360
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    iget-object p1, v4, La/wd6;->m2:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetButton;

    .line 364
    .line 365
    if-eqz p1, :cond_c

    .line 366
    .line 367
    iget-boolean v0, p0, La/de6;->b:Z

    .line 368
    .line 369
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetButton;->setLoading(Z)V

    .line 370
    .line 371
    .line 372
    :cond_c
    iget-object p1, v4, La/wd6;->m2:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetButton;

    .line 373
    .line 374
    if-eqz p1, :cond_d

    .line 375
    .line 376
    iget-boolean p0, p0, La/de6;->a:Z

    .line 377
    .line 378
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetButton;->setEnabled(Z)V

    .line 379
    .line 380
    .line 381
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 382
    .line 383
    return-object p0

    .line 384
    nop

    .line 385
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
