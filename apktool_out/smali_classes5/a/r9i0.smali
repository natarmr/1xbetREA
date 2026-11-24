.class public final La/r9i0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/t9i0;


# direct methods
.method public synthetic constructor <init>(La/t9i0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r9i0;->i:B

    iput-object p1, p0, La/r9i0;->k:La/t9i0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r9i0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/r9i0;->k:La/t9i0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/r9i0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/r9i0;-><init>(La/t9i0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/r9i0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/r9i0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/r9i0;-><init>(La/t9i0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/r9i0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/r9i0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/x9i0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/r9i0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/r9i0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/r9i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/aai0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/r9i0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/r9i0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/r9i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/r9i0;->i:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/r9i0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/x9i0;

    .line 11
    .line 12
    sget-object v2, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    instance-of v2, v1, La/v9i0;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    iget-object v6, v0, La/r9i0;->k:La/t9i0;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    check-cast v1, La/v9i0;

    .line 25
    .line 26
    iget-object v9, v1, La/v9i0;->a:Ljava/lang/String;

    .line 27
    .line 28
    sget-object v0, La/t9i0;->Q1:[La/iiy;

    .line 29
    .line 30
    iget-object v0, v6, La/t9i0;->L1:La/ii;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 35
    .line 36
    const v1, 0x7f1307bb

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    const v1, 0x7f130e5d

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    sget-object v16, La/n12;->b:La/n12;

    .line 54
    .line 55
    const/16 v17, 0x0

    .line 56
    .line 57
    const/16 v18, 0x5f8

    .line 58
    .line 59
    const/4 v11, 0x0

    .line 60
    const/4 v12, 0x0

    .line 61
    const/4 v13, 0x0

    .line 62
    const/4 v14, 0x0

    .line 63
    const/4 v15, 0x0

    .line 64
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v7, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    const-string v0, "actionDialogManager"

    .line 79
    .line 80
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v3

    .line 84
    :cond_1
    sget-object v0, La/t9i0;->Q1:[La/iiy;

    .line 85
    .line 86
    iget-object v4, v6, La/t9i0;->M1:La/wdk0;

    .line 87
    .line 88
    if-eqz v4, :cond_2

    .line 89
    .line 90
    new-instance v5, La/xdk0;

    .line 91
    .line 92
    sget-object v8, La/rek0;->b:La/rek0;

    .line 93
    .line 94
    const v0, 0x7f13131f

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    const/4 v13, 0x0

    .line 105
    const/16 v14, 0x7c

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    const/4 v11, 0x0

    .line 109
    const/4 v12, 0x0

    .line 110
    move-object v7, v5

    .line 111
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 112
    .line 113
    .line 114
    const/16 v11, 0x3fc

    .line 115
    .line 116
    const/4 v7, 0x0

    .line 117
    const/4 v8, 0x0

    .line 118
    const/4 v9, 0x0

    .line 119
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 120
    .line 121
    .line 122
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0

    .line 125
    :cond_2
    const-string v0, "snackbarManager"

    .line 126
    .line 127
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v3

    .line 131
    :pswitch_0
    iget-object v1, v0, La/r9i0;->j:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, La/aai0;

    .line 134
    .line 135
    sget-object v2, La/wne;->a:La/wne;

    .line 136
    .line 137
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    instance-of v2, v1, La/y9i0;

    .line 141
    .line 142
    iget-object v0, v0, La/r9i0;->k:La/t9i0;

    .line 143
    .line 144
    if-eqz v2, :cond_7

    .line 145
    .line 146
    check-cast v1, La/y9i0;

    .line 147
    .line 148
    iget-object v1, v1, La/y9i0;->a:La/f9i0;

    .line 149
    .line 150
    iget-short v1, v1, La/f9i0;->a:S

    .line 151
    .line 152
    sget-object v2, La/t9i0;->Q1:[La/iiy;

    .line 153
    .line 154
    invoke-virtual {v0}, La/t9i0;->G0()La/b1r;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    sget-object v3, La/f9i0;->b:[La/f9i0;

    .line 159
    .line 160
    const/16 v3, 0x1e

    .line 161
    .line 162
    if-ne v1, v3, :cond_3

    .line 163
    .line 164
    iget-object v1, v2, La/b1r;->d:La/cxx;

    .line 165
    .line 166
    iget-object v1, v1, La/cxx;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 167
    .line 168
    invoke-virtual {v0, v1}, La/t9i0;->I0(Landroid/widget/RadioButton;)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_3
    const/16 v3, 0x5a

    .line 173
    .line 174
    if-ne v1, v3, :cond_4

    .line 175
    .line 176
    iget-object v1, v2, La/b1r;->h:La/cxx;

    .line 177
    .line 178
    iget-object v1, v1, La/cxx;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, La/t9i0;->I0(Landroid/widget/RadioButton;)V

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_4
    const/16 v3, 0xb4

    .line 185
    .line 186
    if-ne v1, v3, :cond_5

    .line 187
    .line 188
    iget-object v1, v2, La/b1r;->g:La/cxx;

    .line 189
    .line 190
    iget-object v1, v1, La/cxx;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 191
    .line 192
    invoke-virtual {v0, v1}, La/t9i0;->I0(Landroid/widget/RadioButton;)V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_5
    const/16 v3, 0x16d

    .line 197
    .line 198
    if-ne v1, v3, :cond_6

    .line 199
    .line 200
    iget-object v1, v2, La/b1r;->e:La/cxx;

    .line 201
    .line 202
    iget-object v1, v1, La/cxx;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 203
    .line 204
    invoke-virtual {v0, v1}, La/t9i0;->I0(Landroid/widget/RadioButton;)V

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_6
    iget-object v1, v2, La/b1r;->c:La/cxx;

    .line 209
    .line 210
    iget-object v1, v1, La/cxx;->b:Lcom/google/android/material/radiobutton/MaterialRadioButton;

    .line 211
    .line 212
    invoke-virtual {v0, v1}, La/t9i0;->I0(Landroid/widget/RadioButton;)V

    .line 213
    .line 214
    .line 215
    :goto_1
    invoke-virtual {v0}, La/t9i0;->G0()La/b1r;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    iget-object v0, v0, La/b1r;->b:Landroid/widget/Button;

    .line 220
    .line 221
    const/4 v1, 0x1

    .line 222
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_7
    sget-object v1, La/t9i0;->Q1:[La/iiy;

    .line 227
    .line 228
    invoke-virtual {v0}, La/t9i0;->G0()La/b1r;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iget-object v0, v0, La/b1r;->b:Landroid/widget/Button;

    .line 233
    .line 234
    const/4 v1, 0x0

    .line 235
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 236
    .line 237
    .line 238
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object v0

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
