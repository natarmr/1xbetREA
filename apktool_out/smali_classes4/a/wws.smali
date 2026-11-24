.class public final La/wws;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/osr;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/wws;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/pek",
        "impl"
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
.field public static final S1:La/pek;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:Z

.field public L1:La/fiu0;

.field public M1:La/roq0;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;

.field public final P1:La/khf0;

.field public final Q1:La/khf0;

.field public final R1:La/vr3;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/wws;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/game_broadcasting/impl/databinding/FragmentGameVideoLayoutBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "params"

    .line 16
    .line 17
    const-string v5, "getParams()Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "gameVideoUiConfig"

    .line 25
    .line 26
    const-string v6, "getGameVideoUiConfig()Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/wws;->U1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/pek;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/wws;->S1:La/pek;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d023e

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/wws;->K1:Z

    .line 9
    .line 10
    new-instance v1, La/jcs;

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    invoke-direct {v1, p0, v2}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    new-instance v2, La/jfl;

    .line 18
    .line 19
    const/16 v3, 0x17

    .line 20
    .line 21
    invoke-direct {v2, p0, v3}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v3, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v4, La/jfl;

    .line 27
    .line 28
    const/16 v5, 0x18

    .line 29
    .line 30
    invoke-direct {v4, v2, v5}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-class v3, La/yys;

    .line 38
    .line 39
    sget-object v4, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v4, La/r6p;

    .line 46
    .line 47
    const/16 v5, 0xa

    .line 48
    .line 49
    invoke-direct {v4, v2, v5}, La/r6p;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    new-instance v5, La/r6p;

    .line 53
    .line 54
    const/16 v6, 0xb

    .line 55
    .line 56
    invoke-direct {v5, v2, v6}, La/r6p;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v3, v4, v5, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput-object v1, p0, La/wws;->N1:La/kiu0;

    .line 64
    .line 65
    sget-object v1, La/vws;->a:La/vws;

    .line 66
    .line 67
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iput-object v1, p0, La/wws;->O1:La/s0r;

    .line 72
    .line 73
    new-instance v1, La/khf0;

    .line 74
    .line 75
    const-string v2, "VIDEO_PARAMS"

    .line 76
    .line 77
    invoke-direct {v1, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, La/wws;->P1:La/khf0;

    .line 81
    .line 82
    new-instance v1, La/khf0;

    .line 83
    .line 84
    const-string v2, "UI_CONFIG"

    .line 85
    .line 86
    invoke-direct {v1, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iput-object v1, p0, La/wws;->Q1:La/khf0;

    .line 90
    .line 91
    new-instance v1, La/vr3;

    .line 92
    .line 93
    invoke-direct {v1, p0, v0}, La/vr3;-><init>(Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    iput-object v1, p0, La/wws;->R1:La/vr3;

    .line 97
    .line 98
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wws;->U1:[La/iiy;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    iget-object v3, v0, La/wws;->Q1:La/khf0;

    .line 9
    .line 10
    invoke-virtual {v3, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;

    .line 15
    .line 16
    iget v3, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;->d:I

    .line 17
    .line 18
    iget v4, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;->c:I

    .line 19
    .line 20
    iget v5, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;->b:I

    .line 21
    .line 22
    iget-object v6, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;->a:Ljava/lang/String;

    .line 23
    .line 24
    sget-object v7, La/jxs;->a:[La/jxs;

    .line 25
    .line 26
    const-string v7, "16:9"

    .line 27
    .line 28
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    const/4 v8, -0x1

    .line 33
    if-nez v7, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    iget-object v7, v7, La/e0r;->n:Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    if-eqz v9, :cond_0

    .line 46
    .line 47
    check-cast v9, La/a3e;

    .line 48
    .line 49
    iput v8, v9, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 50
    .line 51
    iput-object v6, v9, La/a3e;->G:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const-string v0, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    .line 58
    .line 59
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    :goto_0
    if-eq v5, v8, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    iget-object v6, v6, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-virtual {v7, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    invoke-static {v6, v7}, La/hxm0;->x(Landroid/view/View;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    iget-object v6, v6, La/e0r;->m:Landroid/view/View;

    .line 87
    .line 88
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-virtual {v7, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    invoke-static {v6, v7}, La/hxm0;->x(Landroid/view/View;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    iget-object v6, v6, La/e0r;->f:Landroid/view/View;

    .line 104
    .line 105
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-virtual {v7, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    invoke-static {v6, v5}, La/hxm0;->x(Landroid/view/View;I)V

    .line 114
    .line 115
    .line 116
    :cond_2
    if-eq v4, v8, :cond_4

    .line 117
    .line 118
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    iget-object v5, v5, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 123
    .line 124
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    if-eqz v6, :cond_3

    .line 129
    .line 130
    check-cast v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 131
    .line 132
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-virtual {v7, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    iput v4, v6, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 141
    .line 142
    invoke-virtual {v5, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    const-string v0, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 147
    .line 148
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_4
    :goto_1
    if-eq v3, v8, :cond_5

    .line 153
    .line 154
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    iget-object v5, v3, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 167
    .line 168
    const/4 v9, 0x0

    .line 169
    const/16 v10, 0xa

    .line 170
    .line 171
    const/4 v7, 0x0

    .line 172
    move v8, v6

    .line 173
    invoke-static/range {v5 .. v10}, La/sj3;->L0(Landroid/view/View;IIIII)V

    .line 174
    .line 175
    .line 176
    :cond_5
    iget-object v1, v1, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;->e:Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;

    .line 177
    .line 178
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    invoke-static {v1}, La/axs;->a(Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;)La/zws;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    iget-object v5, v4, La/e0r;->f:Landroid/view/View;

    .line 191
    .line 192
    sget-object v6, La/j5d;->a:Landroid/util/TypedValue;

    .line 193
    .line 194
    iget v6, v1, La/zws;->a:I

    .line 195
    .line 196
    const/4 v7, 0x0

    .line 197
    invoke-static {v3, v6, v7}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 202
    .line 203
    .line 204
    iget-object v5, v4, La/e0r;->j:Landroid/widget/ImageView;

    .line 205
    .line 206
    iget v6, v1, La/zws;->c:I

    .line 207
    .line 208
    invoke-static {v3, v6, v7}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    invoke-static {v6}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 217
    .line 218
    .line 219
    iget-object v5, v4, La/e0r;->c:Landroid/widget/TextView;

    .line 220
    .line 221
    iget v1, v1, La/zws;->b:I

    .line 222
    .line 223
    invoke-static {v3, v1, v7}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 228
    .line 229
    .line 230
    iget-object v4, v4, La/e0r;->l:Landroid/widget/TextView;

    .line 231
    .line 232
    invoke-static {v3, v1, v7}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 237
    .line 238
    .line 239
    new-instance v1, La/jar;

    .line 240
    .line 241
    const/16 v3, 0x12

    .line 242
    .line 243
    invoke-direct {v1, v0, v3}, La/jar;-><init>(Ljava/lang/Object;B)V

    .line 244
    .line 245
    .line 246
    const-string v3, "REQUEST_KEY_UPDATE_GAME_ID"

    .line 247
    .line 248
    invoke-static {v0, v3, v1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    iget-object v1, v1, La/e0r;->d:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 256
    .line 257
    new-instance v3, La/uws;

    .line 258
    .line 259
    invoke-direct {v3, v0, v7}, La/uws;-><init>(La/wws;B)V

    .line 260
    .line 261
    .line 262
    invoke-static {v1, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    iget-object v1, v1, La/e0r;->k:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 270
    .line 271
    new-instance v3, La/uws;

    .line 272
    .line 273
    const/4 v4, 0x1

    .line 274
    invoke-direct {v3, v0, v4}, La/uws;-><init>(La/wws;B)V

    .line 275
    .line 276
    .line 277
    invoke-static {v1, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 285
    .line 286
    invoke-virtual {v0}, La/wws;->H0()La/yys;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    invoke-virtual {v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBroadcastingControlPanelView()Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-virtual {v1, v3}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->u(La/dke;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 302
    .line 303
    new-instance v3, La/wej;

    .line 304
    .line 305
    invoke-virtual {v0}, La/wws;->H0()La/yys;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    const/4 v9, 0x0

    .line 310
    const/16 v10, 0x15

    .line 311
    .line 312
    const/4 v4, 0x0

    .line 313
    const-class v14, La/yys;

    .line 314
    .line 315
    const-string v7, "onMediaFileReddy"

    .line 316
    .line 317
    const-string v8, "onMediaFileReddy()V"

    .line 318
    .line 319
    move-object v6, v14

    .line 320
    invoke-direct/range {v3 .. v10}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1, v3}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setOnMediaFileReddyListener(Lkotlin/jvm/functions/Function0;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 331
    .line 332
    new-instance v11, La/wej;

    .line 333
    .line 334
    invoke-virtual {v0}, La/wws;->H0()La/yys;

    .line 335
    .line 336
    .line 337
    move-result-object v13

    .line 338
    const/16 v17, 0x0

    .line 339
    .line 340
    const/16 v18, 0x16

    .line 341
    .line 342
    const/4 v12, 0x0

    .line 343
    const-string v15, "onMediaFileError"

    .line 344
    .line 345
    const-string v16, "onMediaFileError()V"

    .line 346
    .line 347
    invoke-direct/range {v11 .. v18}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, v11}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setOnMediaFileNeedReloadListener(Lkotlin/jvm/functions/Function0;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 358
    .line 359
    new-instance v11, La/wej;

    .line 360
    .line 361
    invoke-virtual {v0}, La/wws;->H0()La/yys;

    .line 362
    .line 363
    .line 364
    move-result-object v13

    .line 365
    const/16 v18, 0x17

    .line 366
    .line 367
    const-string v15, "onVideoContainerClick"

    .line 368
    .line 369
    const-string v16, "onVideoContainerClick()V"

    .line 370
    .line 371
    invoke-direct/range {v11 .. v18}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v1, v11}, La/ctr;->setOnContainerClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    iget-object v1, v1, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 382
    .line 383
    new-instance v11, La/wej;

    .line 384
    .line 385
    invoke-virtual {v0}, La/wws;->H0()La/yys;

    .line 386
    .line 387
    .line 388
    move-result-object v13

    .line 389
    const/16 v18, 0x18

    .line 390
    .line 391
    const-string v15, "onSoundEnableButtonClick"

    .line 392
    .line 393
    const-string v16, "onSoundEnableButtonClick()V"

    .line 394
    .line 395
    invoke-direct/range {v11 .. v18}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1, v11}, La/ctr;->setSoundEnableButtonClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    iget-object v1, v1, La/e0r;->e:La/qk;

    .line 406
    .line 407
    iget-object v1, v1, La/qk;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 408
    .line 409
    new-instance v3, La/uws;

    .line 410
    .line 411
    invoke-direct {v3, v0, v2}, La/uws;-><init>(La/wws;B)V

    .line 412
    .line 413
    .line 414
    invoke-static {v1, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0}, La/wws;->G0()La/e0r;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    iget-object v1, v1, La/e0r;->b:La/qk;

    .line 422
    .line 423
    iget-object v1, v1, La/qk;->c:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 424
    .line 425
    new-instance v2, La/uws;

    .line 426
    .line 427
    const/4 v3, 0x3

    .line 428
    invoke-direct {v2, v0, v3}, La/uws;-><init>(La/wws;B)V

    .line 429
    .line 430
    .line 431
    invoke-static {v1, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 432
    .line 433
    .line 434
    return-void
.end method

.method public final C0()V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/xws;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/xws;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/xws;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/wws;->U1:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/wws;->P1:La/khf0;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v8, v1

    .line 69
    check-cast v8, Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 70
    .line 71
    iget-object v6, v3, La/xws;->a:La/us00;

    .line 72
    .line 73
    iget-object v7, v3, La/xws;->b:La/oeg0;

    .line 74
    .line 75
    iget-object v9, v3, La/xws;->c:La/m1e;

    .line 76
    .line 77
    iget-object v5, v3, La/xws;->d:La/cad;

    .line 78
    .line 79
    iget-object v10, v3, La/xws;->e:La/btt0;

    .line 80
    .line 81
    iget-object v11, v3, La/xws;->f:La/gii0;

    .line 82
    .line 83
    iget-object v13, v3, La/xws;->h:La/bn6;

    .line 84
    .line 85
    iget-object v14, v3, La/xws;->i:La/azj0;

    .line 86
    .line 87
    iget-object v15, v3, La/xws;->j:La/ctf0;

    .line 88
    .line 89
    iget-object v1, v3, La/xws;->k:La/tgk;

    .line 90
    .line 91
    iget-object v12, v3, La/xws;->g:La/gst0;

    .line 92
    .line 93
    iget-object v2, v3, La/xws;->l:La/nhv0;

    .line 94
    .line 95
    iget-object v4, v3, La/xws;->m:La/ysr;

    .line 96
    .line 97
    move-object/from16 v16, v1

    .line 98
    .line 99
    iget-object v1, v3, La/xws;->p:La/m49;

    .line 100
    .line 101
    move-object/from16 v21, v1

    .line 102
    .line 103
    iget-object v1, v3, La/xws;->q:La/n49;

    .line 104
    .line 105
    move-object/from16 v22, v1

    .line 106
    .line 107
    iget-object v1, v3, La/xws;->s:La/us3;

    .line 108
    .line 109
    move-object/from16 v23, v1

    .line 110
    .line 111
    iget-object v1, v3, La/xws;->u:La/knf0;

    .line 112
    .line 113
    move-object/from16 v24, v1

    .line 114
    .line 115
    iget-object v1, v3, La/xws;->t:La/pru;

    .line 116
    .line 117
    move-object/from16 v25, v1

    .line 118
    .line 119
    iget-object v1, v3, La/xws;->v:La/ik4;

    .line 120
    .line 121
    move-object/from16 v26, v1

    .line 122
    .line 123
    iget-object v1, v3, La/xws;->w:La/vd1;

    .line 124
    .line 125
    move-object/from16 v27, v1

    .line 126
    .line 127
    iget-object v1, v3, La/xws;->n:La/atr;

    .line 128
    .line 129
    move-object/from16 v19, v1

    .line 130
    .line 131
    iget-object v1, v3, La/xws;->o:La/rsr;

    .line 132
    .line 133
    move-object/from16 v20, v1

    .line 134
    .line 135
    iget-object v1, v3, La/xws;->x:La/s64;

    .line 136
    .line 137
    move-object/from16 v28, v1

    .line 138
    .line 139
    iget-object v1, v3, La/xws;->y:La/cmt;

    .line 140
    .line 141
    move-object/from16 v29, v1

    .line 142
    .line 143
    iget-object v1, v3, La/xws;->r:La/meu0;

    .line 144
    .line 145
    move-object/from16 v31, v1

    .line 146
    .line 147
    iget-object v1, v3, La/xws;->z:La/b3c0;

    .line 148
    .line 149
    move-object/from16 v30, v1

    .line 150
    .line 151
    iget-object v1, v3, La/xws;->A:La/mi70;

    .line 152
    .line 153
    move-object/from16 v32, v1

    .line 154
    .line 155
    iget-object v1, v3, La/xws;->B:La/roq0;

    .line 156
    .line 157
    move-object/from16 v33, v1

    .line 158
    .line 159
    iget-object v1, v3, La/xws;->C:La/r9u;

    .line 160
    .line 161
    move-object/from16 v34, v1

    .line 162
    .line 163
    iget-object v1, v3, La/xws;->D:La/c49;

    .line 164
    .line 165
    iget-object v3, v3, La/xws;->E:La/viu;

    .line 166
    .line 167
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-object/from16 v18, v4

    .line 228
    .line 229
    new-instance v4, La/z8i;

    .line 230
    .line 231
    move-object/from16 v35, v1

    .line 232
    .line 233
    move-object/from16 v17, v2

    .line 234
    .line 235
    move-object/from16 v36, v3

    .line 236
    .line 237
    invoke-direct/range {v4 .. v36}, La/z8i;-><init>(La/cad;La/us00;La/oeg0;Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;La/m1e;La/btt0;La/gii0;La/gst0;La/bn6;La/azj0;La/ctf0;La/tgk;La/nhv0;La/ysr;La/atr;La/rsr;La/m49;La/n49;La/us3;La/knf0;La/pru;La/ik4;La/vd1;La/s64;La/cmt;La/b3c0;La/meu0;La/mi70;La/roq0;La/r9u;La/c49;La/viu;)V

    .line 238
    .line 239
    .line 240
    move-object/from16 v1, v33

    .line 241
    .line 242
    new-instance v2, La/fiu0;

    .line 243
    .line 244
    iget-object v3, v4, La/z8i;->E:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v3, La/dci;

    .line 247
    .line 248
    const-class v4, La/yys;

    .line 249
    .line 250
    invoke-static {v4, v3}, La/wcf0;->h(Ljava/lang/Class;Ljava/lang/Object;)La/wcf0;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-direct {v2, v3}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 255
    .line 256
    .line 257
    iput-object v2, v0, La/wws;->L1:La/fiu0;

    .line 258
    .line 259
    iput-object v1, v0, La/wws;->M1:La/roq0;

    .line 260
    .line 261
    return-void

    .line 262
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 263
    .line 264
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return-void
.end method

.method public final D0()V
    .locals 20

    .line 1
    invoke-virtual/range {p0 .. p0}, La/wws;->H0()La/yys;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/yys;->B:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/lys;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, v1, v0, v3}, La/lys;-><init>(La/gmq;La/yys;B)V

    .line 11
    .line 12
    .line 13
    new-instance v4, La/pfl;

    .line 14
    .line 15
    const/4 v10, 0x4

    .line 16
    const/16 v11, 0xd

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    const-class v15, La/wws;

    .line 20
    .line 21
    const-string v8, "handleUiState"

    .line 22
    .line 23
    const-string v9, "handleUiState(Lorg/xplatform/game_broadcasting/impl/presentation/video/part_screen/GameVideoUiState;)V"

    .line 24
    .line 25
    move-object/from16 v6, p0

    .line 26
    .line 27
    move-object v7, v15

    .line 28
    invoke-direct/range {v4 .. v11}, La/pfl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 29
    .line 30
    .line 31
    sget-object v0, La/lkz;->a:La/lkz;

    .line 32
    .line 33
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v3, La/fns;

    .line 46
    .line 47
    const/4 v9, 0x0

    .line 48
    invoke-direct {v3, v2, v0, v4, v9}, La/fns;-><init>(La/lys;La/clz;La/pfl;La/yje;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    invoke-static {v1, v9, v9, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 53
    .line 54
    .line 55
    invoke-virtual/range {p0 .. p0}, La/wws;->H0()La/yys;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v1, v1, La/yys;->C:La/p7m0;

    .line 60
    .line 61
    new-instance v12, La/pfl;

    .line 62
    .line 63
    const/16 v18, 0x4

    .line 64
    .line 65
    const/16 v19, 0xe

    .line 66
    .line 67
    const/4 v13, 0x2

    .line 68
    const-string v16, "handleEvent"

    .line 69
    .line 70
    const-string v17, "handleEvent(Lorg/xplatform/game_broadcasting/impl/presentation/video/part_screen/GameVideoEvent;)V"

    .line 71
    .line 72
    move-object/from16 v14, p0

    .line 73
    .line 74
    invoke-direct/range {v12 .. v19}, La/pfl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 75
    .line 76
    .line 77
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    new-instance v4, La/fns;

    .line 90
    .line 91
    invoke-direct {v4, v1, v2, v12, v9}, La/fns;-><init>(La/gmq;La/clz;La/pfl;La/yje;)V

    .line 92
    .line 93
    .line 94
    invoke-static {v3, v9, v9, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {p0 .. p0}, La/wws;->H0()La/yys;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iget-object v1, v1, La/yys;->o:La/m1e;

    .line 102
    .line 103
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    new-instance v8, La/pfl;

    .line 108
    .line 109
    const/16 v19, 0xf

    .line 110
    .line 111
    const-string v16, "handleNetworkAvailable"

    .line 112
    .line 113
    const-string v17, "handleNetworkAvailable(Z)V"

    .line 114
    .line 115
    move-object v12, v8

    .line 116
    invoke-direct/range {v12 .. v19}, La/pfl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 117
    .line 118
    .line 119
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    new-instance v5, La/fns;

    .line 132
    .line 133
    const/4 v10, 0x0

    .line 134
    invoke-direct/range {v5 .. v10}, La/fns;-><init>(La/gmq;La/clz;La/pfl;La/yje;B)V

    .line 135
    .line 136
    .line 137
    invoke-static {v1, v9, v9, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method public final G0()La/e0r;
    .locals 2

    .line 1
    sget-object v0, La/wws;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/wws;->O1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/e0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/yys;
    .locals 0

    .line 1
    iget-object p0, p0, La/wws;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/yys;

    .line 8
    .line 9
    return-object p0
.end method

.method public final c0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->O()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/wws;->H0()La/yys;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object v0, p0, La/yys;->B:La/p7m0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La/ixs;

    .line 18
    .line 19
    iget-boolean v0, v0, La/ixs;->r:Z

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, La/yys;->w()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final d0()V
    .locals 21

    .line 1
    const/4 v0, 0x1

    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    iput-boolean v0, v1, Landroidx/fragment/app/Fragment;->j1:Z

    .line 5
    .line 6
    invoke-virtual {v1}, La/wws;->H0()La/yys;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, La/yys;->G:La/c4m0;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v1}, La/wws;->H0()La/yys;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, La/yys;->I:La/c4m0;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {v1}, La/wws;->H0()La/yys;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v2, v0, La/yys;->B:La/p7m0;

    .line 34
    .line 35
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, La/ixs;

    .line 40
    .line 41
    iget-boolean v3, v3, La/ixs;->f:Z

    .line 42
    .line 43
    iput-boolean v3, v0, La/yys;->E:Z

    .line 44
    .line 45
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    move-object v4, v3

    .line 50
    check-cast v4, La/ixs;

    .line 51
    .line 52
    const/16 v19, 0x0

    .line 53
    .line 54
    const v20, 0x7ff9f

    .line 55
    .line 56
    .line 57
    const-wide/16 v5, 0x0

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v8, 0x0

    .line 61
    const/4 v9, 0x0

    .line 62
    const/4 v10, 0x0

    .line 63
    const/4 v11, 0x0

    .line 64
    const/4 v12, 0x0

    .line 65
    const/4 v13, 0x0

    .line 66
    const/4 v14, 0x0

    .line 67
    const/4 v15, 0x0

    .line 68
    const/16 v16, 0x0

    .line 69
    .line 70
    const/16 v17, 0x0

    .line 71
    .line 72
    const/16 v18, 0x0

    .line 73
    .line 74
    invoke-static/range {v4 .. v20}, La/ixs;->a(La/ixs;JLjava/lang/String;ZZZZLa/hl90;ZZLjava/lang/Throwable;ZLjava/lang/String;ZZI)La/ixs;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_2

    .line 83
    .line 84
    invoke-virtual {v0}, La/yys;->B()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, La/yys;->A()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, La/wws;->G0()La/e0r;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v0, v0, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 95
    .line 96
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->g()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, La/wws;->G0()La/e0r;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iget-object v0, v0, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 104
    .line 105
    const-string v2, ""

    .line 106
    .line 107
    iput-object v2, v0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->h()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->n()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, La/wws;->G0()La/e0r;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v0, v0, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 120
    .line 121
    invoke-virtual {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->k()V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public final e0()V
    .locals 19

    .line 1
    invoke-super/range {p0 .. p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p0}, La/wws;->H0()La/yys;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-boolean v1, v0, La/yys;->E:Z

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, v0, La/yys;->B:La/p7m0;

    .line 14
    .line 15
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move-object v2, v1

    .line 20
    check-cast v2, La/ixs;

    .line 21
    .line 22
    const/16 v17, 0x1

    .line 23
    .line 24
    const v18, 0x5ff9f

    .line 25
    .line 26
    .line 27
    const-wide/16 v3, 0x0

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v12, 0x0

    .line 37
    const/4 v13, 0x0

    .line 38
    const/4 v14, 0x0

    .line 39
    const/4 v15, 0x0

    .line 40
    const/16 v16, 0x0

    .line 41
    .line 42
    invoke-static/range {v2 .. v18}, La/ixs;->a(La/ixs;JLjava/lang/String;ZZZZLa/hl90;ZZLjava/lang/Throwable;ZLjava/lang/String;ZZI)La/ixs;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    :goto_0
    invoke-virtual/range {p0 .. p0}, La/wws;->H0()La/yys;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v1, v0, La/yys;->G:La/c4m0;

    .line 57
    .line 58
    const/4 v2, 0x4

    .line 59
    const/4 v3, 0x1

    .line 60
    const/4 v4, 0x0

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-virtual {v1}, La/pby;->isActive()Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-ne v1, v3, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget-object v1, v0, La/yys;->o:La/m1e;

    .line 71
    .line 72
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v5, v0, La/yys;->r:La/jqt;

    .line 77
    .line 78
    invoke-virtual {v5}, La/jqt;->a()La/h2c;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    new-instance v6, La/oys;

    .line 83
    .line 84
    const/4 v7, 0x3

    .line 85
    invoke-direct {v6, v7, v4}, La/bnn0;-><init>(ILa/yje;)V

    .line 86
    .line 87
    .line 88
    new-instance v7, La/p6d;

    .line 89
    .line 90
    invoke-direct {v7, v1, v5, v6, v3}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 91
    .line 92
    .line 93
    new-instance v1, La/u88;

    .line 94
    .line 95
    const/16 v5, 0x12

    .line 96
    .line 97
    invoke-direct {v1, v0, v4, v5}, La/u88;-><init>(La/diu0;La/yje;B)V

    .line 98
    .line 99
    .line 100
    new-instance v5, La/fnq;

    .line 101
    .line 102
    invoke-direct {v5, v7, v1, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 103
    .line 104
    .line 105
    sget-object v1, La/pys;->h:La/pys;

    .line 106
    .line 107
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    iget-object v7, v0, La/yys;->p:La/mne;

    .line 112
    .line 113
    iget-object v7, v7, La/mne;->a:La/rwj;

    .line 114
    .line 115
    invoke-static {v6, v7}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-static {v5, v6, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iput-object v1, v0, La/yys;->G:La/c4m0;

    .line 124
    .line 125
    :goto_1
    invoke-virtual/range {p0 .. p0}, La/wws;->H0()La/yys;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    iget-object v1, v0, La/yys;->I:La/c4m0;

    .line 130
    .line 131
    if-eqz v1, :cond_3

    .line 132
    .line 133
    invoke-virtual {v1}, La/pby;->isActive()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-ne v1, v3, :cond_3

    .line 138
    .line 139
    return-void

    .line 140
    :cond_3
    iget-object v1, v0, La/yys;->k:La/yox;

    .line 141
    .line 142
    iget-object v1, v1, La/yox;->a:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, La/neu0;

    .line 145
    .line 146
    iget-object v1, v1, La/neu0;->a:La/meu0;

    .line 147
    .line 148
    iget-object v1, v1, La/meu0;->c:La/p7m0;

    .line 149
    .line 150
    new-instance v5, La/h2c;

    .line 151
    .line 152
    const/16 v6, 0x19

    .line 153
    .line 154
    invoke-direct {v5, v1, v6}, La/h2c;-><init>(La/p7m0;B)V

    .line 155
    .line 156
    .line 157
    invoke-static {v5}, La/i120;->W(La/gmq;)La/gmq;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    new-instance v5, La/lys;

    .line 162
    .line 163
    invoke-direct {v5, v1, v0, v3}, La/lys;-><init>(La/gmq;La/yys;B)V

    .line 164
    .line 165
    .line 166
    new-instance v1, La/sys;

    .line 167
    .line 168
    const/4 v3, 0x0

    .line 169
    invoke-direct {v1, v0, v4, v3}, La/sys;-><init>(La/yys;La/yje;B)V

    .line 170
    .line 171
    .line 172
    new-instance v3, La/fnq;

    .line 173
    .line 174
    invoke-direct {v3, v5, v1, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 175
    .line 176
    .line 177
    sget-object v1, La/tys;->h:La/tys;

    .line 178
    .line 179
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    iget-object v4, v0, La/yys;->p:La/mne;

    .line 184
    .line 185
    iget-object v4, v4, La/mne;->a:La/rwj;

    .line 186
    .line 187
    invoke-static {v2, v4}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-static {v3, v2, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    iput-object v1, v0, La/yys;->I:La/c4m0;

    .line 196
    .line 197
    return-void
.end method

.method public final g0()V
    .locals 3

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 9
    .line 10
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 39
    .line 40
    iget-object v2, p0, La/wws;->M1:La/roq0;

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v1}, La/roq0;->b(Landroidx/fragment/app/Fragment;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->N()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p0}, La/wws;->H0()La/yys;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, La/yys;->z()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const-string p0, "tipsDialogScreenFactory"

    .line 68
    .line 69
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    throw p0

    .line 74
    :cond_3
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object p0, p0, La/wws;->R1:La/vr3;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-virtual {v0, p0, v1}, Landroidx/fragment/app/e;->k0(La/q1r;Z)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final h0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/wws;->R1:La/vr3;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->B0(La/q1r;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/wws;->G0()La/e0r;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, La/e0r;->h:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 15
    .line 16
    const/16 v1, 0x8

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 23
    .line 24
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/wws;->K1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v0, p0, La/yx5;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, La/yx5;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-eqz p0, :cond_2

    .line 12
    .line 13
    invoke-virtual {p0}, La/yx5;->z0()La/j9o0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    return-object p0

    .line 21
    :cond_2
    :goto_1
    sget-object p0, La/i9o0;->a:La/i9o0;

    .line 22
    .line 23
    return-object p0
.end method
