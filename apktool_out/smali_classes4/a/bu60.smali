.class public final synthetic La/bu60;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/bu60;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/bu60;

    .line 2
    .line 3
    const-string v4, "bind(Landroid/view/View;)Lorg/xplatform/games_section/feature/cashback/databinding/CashbackFragmentBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/aza;

    .line 8
    .line 9
    const-string v3, "bind"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/bu60;->a:La/bu60;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v1, 0x7f0a0048

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    move-object v5, v2

    .line 16
    check-cast v5, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    const v1, 0x7f0a00b9

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v6, v2

    .line 28
    check-cast v6, Lcom/google/android/material/appbar/AppBarLayout;

    .line 29
    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    const v1, 0x7f0a0259

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Landroid/widget/ProgressBar;

    .line 40
    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    const v1, 0x7f0a025a

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    move-object v7, v2

    .line 51
    check-cast v7, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;

    .line 52
    .line 53
    if-eqz v7, :cond_0

    .line 54
    .line 55
    const v1, 0x7f0a036e

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    move-object v8, v2

    .line 63
    check-cast v8, Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 64
    .line 65
    if-eqz v8, :cond_0

    .line 66
    .line 67
    const v1, 0x7f0a0490

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    move-object v9, v2

    .line 75
    check-cast v9, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 76
    .line 77
    if-eqz v9, :cond_0

    .line 78
    .line 79
    const v1, 0x7f0a05b3

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    move-object v10, v2

    .line 87
    check-cast v10, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 88
    .line 89
    if-eqz v10, :cond_0

    .line 90
    .line 91
    const v1, 0x7f0a05e6

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    move-object v11, v2

    .line 99
    check-cast v11, Landroid/widget/FrameLayout;

    .line 100
    .line 101
    if-eqz v11, :cond_0

    .line 102
    .line 103
    const v1, 0x7f0a0612

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    check-cast v2, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 111
    .line 112
    if-eqz v2, :cond_0

    .line 113
    .line 114
    const v1, 0x7f0a08fe

    .line 115
    .line 116
    .line 117
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Landroid/widget/ImageView;

    .line 122
    .line 123
    if-eqz v2, :cond_0

    .line 124
    .line 125
    const v1, 0x7f0a0928

    .line 126
    .line 127
    .line 128
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    move-object v12, v2

    .line 133
    check-cast v12, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 134
    .line 135
    if-eqz v12, :cond_0

    .line 136
    .line 137
    const v1, 0x7f0a09db

    .line 138
    .line 139
    .line 140
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    move-object v13, v2

    .line 145
    check-cast v13, Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 146
    .line 147
    if-eqz v13, :cond_0

    .line 148
    .line 149
    const v1, 0x7f0a0ace

    .line 150
    .line 151
    .line 152
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    move-object v14, v2

    .line 157
    check-cast v14, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 158
    .line 159
    if-eqz v14, :cond_0

    .line 160
    .line 161
    const v1, 0x7f0a0acf

    .line 162
    .line 163
    .line 164
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    check-cast v2, Landroid/widget/TextView;

    .line 169
    .line 170
    if-eqz v2, :cond_0

    .line 171
    .line 172
    const v1, 0x7f0a0cde

    .line 173
    .line 174
    .line 175
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 180
    .line 181
    if-eqz v2, :cond_0

    .line 182
    .line 183
    const v1, 0x7f0a0ce0

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    move-object v15, v2

    .line 191
    check-cast v15, Landroidx/core/widget/NestedScrollView;

    .line 192
    .line 193
    if-eqz v15, :cond_0

    .line 194
    .line 195
    const v1, 0x7f0a0d49

    .line 196
    .line 197
    .line 198
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    move-object/from16 v16, v2

    .line 203
    .line 204
    check-cast v16, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 205
    .line 206
    if-eqz v16, :cond_0

    .line 207
    .line 208
    const v1, 0x7f0a0ff0

    .line 209
    .line 210
    .line 211
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    move-object/from16 v17, v2

    .line 216
    .line 217
    check-cast v17, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 218
    .line 219
    if-eqz v17, :cond_0

    .line 220
    .line 221
    const v1, 0x7f0a0ff2

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    check-cast v2, Lcom/google/android/material/appbar/AppBarLayout;

    .line 229
    .line 230
    if-eqz v2, :cond_0

    .line 231
    .line 232
    const v1, 0x7f0a0ffa

    .line 233
    .line 234
    .line 235
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    move-object/from16 v18, v2

    .line 240
    .line 241
    check-cast v18, Landroid/widget/LinearLayout;

    .line 242
    .line 243
    if-eqz v18, :cond_0

    .line 244
    .line 245
    const v1, 0x7f0a1328

    .line 246
    .line 247
    .line 248
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    check-cast v2, Landroid/widget/TextView;

    .line 253
    .line 254
    if-eqz v2, :cond_0

    .line 255
    .line 256
    const v1, 0x7f0a1419

    .line 257
    .line 258
    .line 259
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    move-object/from16 v19, v2

    .line 264
    .line 265
    check-cast v19, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;

    .line 266
    .line 267
    if-eqz v19, :cond_0

    .line 268
    .line 269
    new-instance v3, La/aza;

    .line 270
    .line 271
    move-object v4, v0

    .line 272
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 273
    .line 274
    invoke-direct/range {v3 .. v19}, La/aza;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;Lcom/google/android/material/appbar/AppBarLayout;Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackCardView;Lcom/google/android/material/appbar/CollapsingToolbarLayout;Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;Landroid/widget/FrameLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/uikit/components/lottie/LottieView;Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;Landroidx/core/widget/NestedScrollView;Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;Lcom/google/android/material/appbar/MaterialToolbar;Landroid/widget/LinearLayout;Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackView;)V

    .line 275
    .line 276
    .line 277
    return-object v3

    .line 278
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    const-string v1, "Missing required view with ID: "

    .line 287
    .line 288
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    const/4 v0, 0x0

    .line 296
    return-object v0
.end method
