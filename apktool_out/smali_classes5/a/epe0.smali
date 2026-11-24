.class public final synthetic La/epe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mpe0;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;La/mpe0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/epe0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/epe0;->c:La/cp;

    iput-object p2, p0, La/epe0;->b:La/mpe0;

    return-void
.end method

.method public synthetic constructor <init>(La/mpe0;La/cp;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/epe0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/epe0;->b:La/mpe0;

    iput-object p2, p0, La/epe0;->c:La/cp;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/epe0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/epe0;->c:La/cp;

    .line 4
    .line 5
    iget-object p0, p0, La/epe0;->b:La/mpe0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, La/dpe0;

    .line 20
    .line 21
    iget-object p1, p1, La/dpe0;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object p0, p0, La/mpe0;->a:La/ppe0;

    .line 28
    .line 29
    sget-object v0, La/ppe0;->S1:La/zie0;

    .line 30
    .line 31
    invoke-virtual {p0}, La/ppe0;->H0()La/tpe0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput p1, v0, La/tpe0;->l:I

    .line 36
    .line 37
    iget-object p1, p0, La/ppe0;->L1:La/ii;

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    new-instance v0, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 42
    .line 43
    const v1, 0x7f130162

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const v2, 0x7f13069e

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const v3, 0x7f130e5d

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    const v4, 0x7f13032f

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    sget-object v9, La/n12;->a:La/n12;

    .line 75
    .line 76
    const/4 v10, 0x0

    .line 77
    const/16 v11, 0x5d0

    .line 78
    .line 79
    const/4 v5, 0x0

    .line 80
    const-string v6, "deleteReferral"

    .line 81
    .line 82
    const/4 v7, 0x0

    .line 83
    const/4 v8, 0x0

    .line 84
    invoke-direct/range {v0 .. v11}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :cond_0
    const-string p0, "actionDialogManager"

    .line 101
    .line 102
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const/4 p0, 0x0

    .line 106
    throw p0

    .line 107
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object p1, v1, La/cp;->u:La/yfu0;

    .line 113
    .line 114
    move-object v0, p1

    .line 115
    check-cast v0, La/t7z;

    .line 116
    .line 117
    iget-object v0, v0, La/t7z;->f:Landroid/widget/TextView;

    .line 118
    .line 119
    new-instance v2, Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 120
    .line 121
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, La/dpe0;

    .line 126
    .line 127
    iget-object v3, v3, La/dpe0;->b:Ljava/lang/String;

    .line 128
    .line 129
    const/4 v4, 0x1

    .line 130
    new-array v4, v4, [Ljava/lang/CharSequence;

    .line 131
    .line 132
    const/4 v5, 0x0

    .line 133
    aput-object v3, v4, v5

    .line 134
    .line 135
    const v3, 0x7f13110d

    .line 136
    .line 137
    .line 138
    invoke-direct {v2, v3, v4}, Lorg/xplatform/ui_core/resources/UiText$ByRes;-><init>(I[Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    .line 141
    check-cast p1, La/t7z;

    .line 142
    .line 143
    iget-object v3, p1, La/t7z;->a:Landroid/widget/FrameLayout;

    .line 144
    .line 145
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v3}, Lorg/xplatform/ui_core/resources/UiText;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    iget-object v0, p1, La/t7z;->g:Landroid/widget/TextView;

    .line 160
    .line 161
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    check-cast v2, La/dpe0;

    .line 166
    .line 167
    iget-object v2, v2, La/dpe0;->c:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 170
    .line 171
    .line 172
    iget-object v0, p1, La/t7z;->d:Landroid/widget/TextView;

    .line 173
    .line 174
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, La/dpe0;

    .line 179
    .line 180
    iget-object v2, v2, La/dpe0;->a:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 183
    .line 184
    .line 185
    iget-object v0, p1, La/t7z;->c:Landroid/widget/TextView;

    .line 186
    .line 187
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    check-cast v2, La/dpe0;

    .line 192
    .line 193
    iget-object v2, v2, La/dpe0;->f:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 196
    .line 197
    .line 198
    iget-object v0, p1, La/t7z;->e:Landroid/widget/TextView;

    .line 199
    .line 200
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, La/dpe0;

    .line 205
    .line 206
    iget-object v2, v2, La/dpe0;->d:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    .line 210
    .line 211
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 212
    .line 213
    iget-object v2, p1, La/t7z;->a:Landroid/widget/FrameLayout;

    .line 214
    .line 215
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    check-cast v4, La/dpe0;

    .line 227
    .line 228
    iget v4, v4, La/dpe0;->e:I

    .line 229
    .line 230
    invoke-virtual {v3, v4}, Landroid/content/Context;->getColor(I)I

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 235
    .line 236
    .line 237
    iget-object p1, p1, La/t7z;->b:Landroid/widget/ImageView;

    .line 238
    .line 239
    new-instance v0, La/epe0;

    .line 240
    .line 241
    invoke-direct {v0, p0, v1}, La/epe0;-><init>(La/mpe0;La/cp;)V

    .line 242
    .line 243
    .line 244
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    check-cast p0, La/dpe0;

    .line 252
    .line 253
    iget-boolean p0, p0, La/dpe0;->g:Z

    .line 254
    .line 255
    if-nez p0, :cond_1

    .line 256
    .line 257
    goto :goto_0

    .line 258
    :cond_1
    const/16 v5, 0x8

    .line 259
    .line 260
    :goto_0
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    check-cast p0, La/dpe0;

    .line 268
    .line 269
    iget-boolean p0, p0, La/dpe0;->g:Z

    .line 270
    .line 271
    if-eqz p0, :cond_2

    .line 272
    .line 273
    const/high16 p0, 0x3f000000    # 0.5f

    .line 274
    .line 275
    goto :goto_1

    .line 276
    :cond_2
    const/high16 p0, 0x3f800000    # 1.0f

    .line 277
    .line 278
    :goto_1
    invoke-virtual {v2, p0}, Landroid/view/View;->setAlpha(F)V

    .line 279
    .line 280
    .line 281
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object p0

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
