.class public final La/hgn0;
.super La/stl;
.source "SourceFile"


# annotations
.annotation runtime La/lbk;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/cgn0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/hgn0;",
        "La/stl;",
        "La/cgn0;",
        "<init>",
        "()V",
        "a/m6m0",
        "uikit"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final k2:La/m6m0;

.field public static final synthetic l2:[La/iiy;


# instance fields
.field public final g2:La/ehf0;

.field public final h2:La/ehf0;

.field public final i2:La/ehf0;

.field public final j2:La/nae0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/hgn0;

    .line 4
    .line 5
    const-string v2, "successBetStringModel"

    .line 6
    .line 7
    const-string v3, "getSuccessBetStringModel()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "successBetAlertModel"

    .line 16
    .line 17
    const-string v5, "getSuccessBetAlertModel()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "tmpBetDoneUiModel"

    .line 25
    .line 26
    const-string v6, "getTmpBetDoneUiModel()Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/j0d0;

    .line 32
    .line 33
    const-string v6, "binding"

    .line 34
    .line 35
    const-string v7, "getBinding()Lorg/xplatform/uikit/databinding/SuccessBetAlertBottomSheetBinding;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/hgn0;->l2:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/m6m0;

    .line 57
    .line 58
    const/4 v1, 0x5

    .line 59
    invoke-direct {v0, v1}, La/m6m0;-><init>(B)V

    .line 60
    .line 61
    .line 62
    sput-object v0, La/hgn0;->k2:La/m6m0;

    .line 63
    .line 64
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ehf0;

    .line 5
    .line 6
    const-string v1, "SUCCESS_BET_STRING_MODEL"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/ehf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/hgn0;->g2:La/ehf0;

    .line 12
    .line 13
    new-instance v0, La/ehf0;

    .line 14
    .line 15
    const-string v1, "SUCCESS_BET_ALERT_MODEL_KEY"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/ehf0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/hgn0;->h2:La/ehf0;

    .line 21
    .line 22
    new-instance v0, La/ehf0;

    .line 23
    .line 24
    const-string v1, "BET_DONE_ICON_STYLE_ENUM_KEY"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/ehf0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/hgn0;->i2:La/ehf0;

    .line 30
    .line 31
    sget-object v0, La/ggn0;->a:La/ggn0;

    .line 32
    .line 33
    new-instance v1, La/pmi;

    .line 34
    .line 35
    invoke-direct {v1, p0, v0}, La/pmi;-><init>(La/stl;Lkotlin/jvm/functions/Function1;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, La/hgn0;->j2:La/nae0;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final bridge synthetic Q0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final S0()V
    .locals 9

    .line 1
    sget-object v0, La/hgn0;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    iget-object v3, p0, La/hgn0;->i2:La/ehf0;

    .line 7
    .line 8
    invoke-virtual {v3, p0, v2}, La/ehf0;->j(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;

    .line 13
    .line 14
    iget-object v2, v2, Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;->b:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneIconStyleEnum;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v4, 0x1

    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    if-eq v2, v4, :cond_2

    .line 25
    .line 26
    if-ne v2, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v2, v2, La/cgn0;->e:Landroid/widget/FrameLayout;

    .line 33
    .line 34
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    iget-object v6, v6, La/cgn0;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 39
    .line 40
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, La/hgn0;->X0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v2, v2, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->g:Ljava/lang/Integer;

    .line 48
    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    iget-object v6, v6, La/cgn0;->f:Lcom/airbnb/lottie/LottieAnimationView;

    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v7, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v6, v2}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iget-object v2, v2, La/cgn0;->f:Lcom/airbnb/lottie/LottieAnimationView;

    .line 77
    .line 78
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iget-object v2, v2, La/cgn0;->e:Landroid/widget/FrameLayout;

    .line 91
    .line 92
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    iget-object v6, v6, La/cgn0;->f:Lcom/airbnb/lottie/LottieAnimationView;

    .line 97
    .line 98
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    iget-object v2, v2, La/cgn0;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 106
    .line 107
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    iget-object v2, v2, La/cgn0;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 116
    .line 117
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    iget-object v6, v6, La/cgn0;->e:Landroid/widget/FrameLayout;

    .line 122
    .line 123
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    :goto_0
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    iget-object v2, v2, La/cgn0;->h:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTitle;

    .line 131
    .line 132
    invoke-virtual {p0}, La/hgn0;->Y0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    iget-object v6, v6, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;->a:Ljava/lang/String;

    .line 137
    .line 138
    const-string v7, "!"

    .line 139
    .line 140
    invoke-static {v6, v7, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-eqz v8, :cond_4

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    const/4 v6, 0x0

    .line 148
    :goto_1
    if-nez v6, :cond_5

    .line 149
    .line 150
    invoke-virtual {p0}, La/hgn0;->Y0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    iget-object v6, v6, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;->a:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {v6, v7}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    :cond_5
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, La/hgn0;->V0()Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    if-eqz v2, :cond_6

    .line 168
    .line 169
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    iget-object v2, v2, La/cgn0;->i:Landroid/widget/TextView;

    .line 174
    .line 175
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    const v7, 0x7f07070c

    .line 180
    .line 181
    .line 182
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    invoke-virtual {v2, v5, v5, v5, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 187
    .line 188
    .line 189
    :cond_6
    invoke-virtual {p0}, La/hgn0;->V0()Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-nez v2, :cond_9

    .line 194
    .line 195
    aget-object v0, v0, v1

    .line 196
    .line 197
    invoke-virtual {v3, p0, v0}, La/ehf0;->j(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    check-cast v0, Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;

    .line 202
    .line 203
    iget-object v0, v0, Lorg/xplatform/uikit/components/successbetalert/model/TmpBetDoneUiModel;->a:Lorg/xplatform/uikit/components/successbetalert/model/BetDoneScreenStyleEnum;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_8

    .line 210
    .line 211
    if-eq v0, v4, :cond_7

    .line 212
    .line 213
    if-eq v0, v1, :cond_8

    .line 214
    .line 215
    const/4 v2, 0x3

    .line 216
    if-eq v0, v2, :cond_7

    .line 217
    .line 218
    new-instance v0, La/ahn0;

    .line 219
    .line 220
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-direct {v0, v2}, La/ahn0;-><init>(Landroid/content/Context;)V

    .line 225
    .line 226
    .line 227
    invoke-static {}, La/jmu0;->d()I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0}, La/hgn0;->X0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {p0}, La/hgn0;->Y0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    new-instance v6, La/fgn0;

    .line 243
    .line 244
    invoke-direct {v6, p0, v1}, La/fgn0;-><init>(La/hgn0;B)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v2, v3, v6}, La/ahn0;->a(Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;Lkotlin/jvm/functions/Function0;)V

    .line 248
    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_7
    new-instance v0, La/wgn0;

    .line 252
    .line 253
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-direct {v0, v1}, La/wgn0;-><init>(Landroid/content/Context;)V

    .line 258
    .line 259
    .line 260
    invoke-static {}, La/jmu0;->d()I

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p0}, La/hgn0;->X0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {p0}, La/hgn0;->Y0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    new-instance v3, La/fgn0;

    .line 276
    .line 277
    invoke-direct {v3, p0, v4}, La/fgn0;-><init>(La/hgn0;B)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v1, v2, v3}, La/wgn0;->a(Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;Lkotlin/jvm/functions/Function0;)V

    .line 281
    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_8
    new-instance v0, La/ahn0;

    .line 285
    .line 286
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-direct {v0, v1}, La/ahn0;-><init>(Landroid/content/Context;)V

    .line 291
    .line 292
    .line 293
    invoke-static {}, La/jmu0;->d()I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p0}, La/hgn0;->X0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-virtual {p0}, La/hgn0;->Y0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    new-instance v3, La/fgn0;

    .line 309
    .line 310
    invoke-direct {v3, p0, v5}, La/fgn0;-><init>(La/hgn0;B)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v1, v2, v3}, La/ahn0;->a(Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;Lkotlin/jvm/functions/Function0;)V

    .line 314
    .line 315
    .line 316
    :goto_2
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    iget-object v1, v1, La/cgn0;->g:Landroid/widget/FrameLayout;

    .line 321
    .line 322
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 323
    .line 324
    .line 325
    goto :goto_3

    .line 326
    :cond_9
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    iget-object v0, v0, La/cgn0;->g:Landroid/widget/FrameLayout;

    .line 331
    .line 332
    const/16 v1, 0x8

    .line 333
    .line 334
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 335
    .line 336
    .line 337
    :goto_3
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    iget-object v0, v0, La/cgn0;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 342
    .line 343
    invoke-virtual {p0}, La/hgn0;->Y0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    iget-object v1, v1, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;->c:Ljava/lang/String;

    .line 348
    .line 349
    const-string v2, ""

    .line 350
    .line 351
    if-nez v1, :cond_a

    .line 352
    .line 353
    move-object v1, v2

    .line 354
    :cond_a
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    iget-object v0, v0, La/cgn0;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 362
    .line 363
    invoke-virtual {p0}, La/hgn0;->Y0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    iget-object v1, v1, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;->d:Ljava/lang/String;

    .line 368
    .line 369
    if-nez v1, :cond_b

    .line 370
    .line 371
    goto :goto_4

    .line 372
    :cond_b
    move-object v2, v1

    .line 373
    :goto_4
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {p0}, La/hgn0;->Y0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    iget-object v0, v0, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;->f:Ljava/lang/String;

    .line 381
    .line 382
    if-eqz v0, :cond_e

    .line 383
    .line 384
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-nez v0, :cond_c

    .line 389
    .line 390
    goto :goto_5

    .line 391
    :cond_c
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    iget-object v0, v0, La/cgn0;->i:Landroid/widget/TextView;

    .line 396
    .line 397
    invoke-virtual {p0}, La/hgn0;->Y0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    iget-object v1, v1, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;->f:Ljava/lang/String;

    .line 402
    .line 403
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    iget-object v0, v0, La/cgn0;->i:Landroid/widget/TextView;

    .line 411
    .line 412
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    iget-object v0, v0, La/cgn0;->g:Landroid/widget/FrameLayout;

    .line 420
    .line 421
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    const v2, 0x7f0706f8

    .line 426
    .line 427
    .line 428
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    invoke-virtual {v0, v5, v5, v5, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    iget-object v0, v0, La/cgn0;->h:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTitle;

    .line 440
    .line 441
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    if-eqz v1, :cond_d

    .line 446
    .line 447
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 448
    .line 449
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    const v3, 0x7f070717

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 461
    .line 462
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 463
    .line 464
    .line 465
    goto :goto_5

    .line 466
    :cond_d
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 467
    .line 468
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    return-void

    .line 472
    :cond_e
    :goto_5
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    iget-object v0, v0, La/cgn0;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 477
    .line 478
    new-instance v1, La/dgn0;

    .line 479
    .line 480
    invoke-direct {v1, p0, v5}, La/dgn0;-><init>(La/hgn0;B)V

    .line 481
    .line 482
    .line 483
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 484
    .line 485
    .line 486
    invoke-virtual {p0}, La/hgn0;->W0()La/cgn0;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    iget-object v0, v0, La/cgn0;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 491
    .line 492
    new-instance v1, La/dgn0;

    .line 493
    .line 494
    invoke-direct {v1, p0, v4}, La/dgn0;-><init>(La/hgn0;B)V

    .line 495
    .line 496
    .line 497
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 498
    .line 499
    .line 500
    iget-object v0, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 501
    .line 502
    if-eqz v0, :cond_f

    .line 503
    .line 504
    new-instance v1, La/egn0;

    .line 505
    .line 506
    invoke-direct {v1, p0}, La/egn0;-><init>(La/hgn0;)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 510
    .line 511
    .line 512
    :cond_f
    return-void
.end method

.method public final V0()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, La/hgn0;->X0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, La/hgn0;->X0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v1, v1, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->a:Ljava/lang/String;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    move v1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v1, v3

    .line 30
    :goto_0
    invoke-virtual {p0}, La/hgn0;->X0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget-object p0, p0, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->b:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-nez p0, :cond_1

    .line 43
    .line 44
    move p0, v2

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move p0, v3

    .line 47
    :goto_1
    if-eqz v0, :cond_2

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    return v2

    .line 54
    :cond_2
    return v3
.end method

.method public final W0()La/cgn0;
    .locals 2

    .line 1
    sget-object v0, La/hgn0;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/hgn0;->j2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/cgn0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final X0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;
    .locals 2

    .line 1
    sget-object v0, La/hgn0;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/hgn0;->h2:La/ehf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/ehf0;->j(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 13
    .line 14
    return-object p0
.end method

.method public final Y0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;
    .locals 2

    .line 1
    sget-object v0, La/hgn0;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/hgn0;->g2:La/ehf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/ehf0;->j(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetStringModel;

    .line 13
    .line 14
    return-object p0
.end method

.method public final Z0(La/fhn0;Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/hgn0;->X0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->c:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    new-instance v2, Lkotlin/Pair;

    .line 29
    .line 30
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/hgn0;->X0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v0, v0, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->d:Ljava/lang/Long;

    .line 38
    .line 39
    new-instance v1, Lkotlin/Pair;

    .line 40
    .line 41
    const-string v3, "BALANCE_ID"

    .line 42
    .line 43
    invoke-direct {v1, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, La/hgn0;->X0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v0, v0, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->e:Ljava/lang/String;

    .line 51
    .line 52
    new-instance v3, Lkotlin/Pair;

    .line 53
    .line 54
    const-string v4, "BET_MODE"

    .line 55
    .line 56
    invoke-direct {v3, v4, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    filled-new-array {v2, v1, v3}, [Lkotlin/Pair;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p0}, La/hgn0;->X0()Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v1, v1, Lorg/xplatform/uikit/components/successbetalert/model/SuccessBetAlertModel;->c:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v2, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {v0, p0, p1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    .line 96
    .line 97
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 98
    .line 99
    .line 100
    :cond_2
    return-void
.end method
