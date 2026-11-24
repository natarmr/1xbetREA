.class public final La/eym0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/eym0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/g9m0",
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
.field public static final S1:La/g9m0;

.field public static final synthetic U1:[La/iiy;

.field public static final V1:Ljava/lang/String;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/zui;

.field public M1:La/j6m0;

.field public N1:La/gym0;

.field public final O1:Z

.field public final P1:La/khf0;

.field public final Q1:La/kiu0;

.field public final R1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/eym0;

    .line 4
    .line 5
    const-string v2, "screenParams"

    .line 6
    .line 7
    const-string v3, "getScreenParams()Lorg/xplatform/sportgame/subgames/api/SubGamesParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/sportgame/subgames/impl/databinding/FragmentSubGamesBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v3, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v3, v0

    .line 29
    .line 30
    sput-object v3, La/eym0;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/g9m0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/eym0;->S1:La/g9m0;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, La/eym0;->V1:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02e3

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/eym0;->K1:La/i9o0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, La/eym0;->O1:Z

    .line 13
    .line 14
    new-instance v0, La/khf0;

    .line 15
    .line 16
    const-string v1, "SUB_GAME_SCREEN_PARAMS_KEY"

    .line 17
    .line 18
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/eym0;->P1:La/khf0;

    .line 22
    .line 23
    new-instance v0, La/aym0;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v0, p0, v1}, La/aym0;-><init>(La/eym0;B)V

    .line 27
    .line 28
    .line 29
    new-instance v1, La/fyk0;

    .line 30
    .line 31
    const/16 v2, 0xe

    .line 32
    .line 33
    invoke-direct {v1, p0, v2}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    sget-object v2, La/wez;->b:La/wez;

    .line 37
    .line 38
    new-instance v3, La/fyk0;

    .line 39
    .line 40
    const/16 v4, 0xf

    .line 41
    .line 42
    invoke-direct {v3, v1, v4}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-class v2, La/dzm0;

    .line 50
    .line 51
    sget-object v3, La/sre0;->a:La/tre0;

    .line 52
    .line 53
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    new-instance v3, La/cdl0;

    .line 58
    .line 59
    const/16 v4, 0xc

    .line 60
    .line 61
    invoke-direct {v3, v1, v4}, La/cdl0;-><init>(La/a8z;B)V

    .line 62
    .line 63
    .line 64
    new-instance v4, La/cdl0;

    .line 65
    .line 66
    const/16 v5, 0xd

    .line 67
    .line 68
    invoke-direct {v4, v1, v5}, La/cdl0;-><init>(La/a8z;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/eym0;->Q1:La/kiu0;

    .line 76
    .line 77
    sget-object v0, La/bym0;->a:La/bym0;

    .line 78
    .line 79
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/eym0;->R1:La/s0r;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, La/b0l0;

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    invoke-direct {v2, v0, v3}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    const-string v3, "KEY_SUB_GAME_FILTER_MODEL_REQUEST"

    .line 15
    .line 16
    invoke-virtual {v1, v3, v0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, La/eym0;->N1:La/gym0;

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, La/eym0;->G0()La/l5r;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v3, La/lph0;

    .line 28
    .line 29
    invoke-virtual {v0}, La/eym0;->H0()La/dzm0;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const/4 v9, 0x0

    .line 34
    const/16 v10, 0x1c

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    const-class v14, La/dzm0;

    .line 38
    .line 39
    const-string v7, "filterClicked"

    .line 40
    .line 41
    const-string v8, "filterClicked()V"

    .line 42
    .line 43
    move-object v6, v14

    .line 44
    invoke-direct/range {v3 .. v10}, La/lph0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 45
    .line 46
    .line 47
    new-instance v11, La/lph0;

    .line 48
    .line 49
    invoke-virtual {v0}, La/eym0;->H0()La/dzm0;

    .line 50
    .line 51
    .line 52
    move-result-object v13

    .line 53
    const/16 v17, 0x0

    .line 54
    .line 55
    const/16 v18, 0x1d

    .line 56
    .line 57
    const/4 v12, 0x0

    .line 58
    const-string v15, "onMarketsSettingsClicked"

    .line 59
    .line 60
    const-string v16, "onMarketsSettingsClicked()V"

    .line 61
    .line 62
    invoke-direct/range {v11 .. v18}, La/lph0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 63
    .line 64
    .line 65
    move-object v4, v11

    .line 66
    sget-object v5, La/eym0;->U1:[La/iiy;

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    aget-object v5, v5, v6

    .line 70
    .line 71
    iget-object v7, v0, La/eym0;->P1:La/khf0;

    .line 72
    .line 73
    invoke-virtual {v7, v0, v5}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Lorg/xplatform/sportgame/subgames/api/SubGamesParams;

    .line 78
    .line 79
    iget-object v5, v5, Lorg/xplatform/sportgame/subgames/api/SubGamesParams;->e:La/ms2;

    .line 80
    .line 81
    new-instance v11, La/nfj0;

    .line 82
    .line 83
    invoke-virtual {v0}, La/eym0;->H0()La/dzm0;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    const/16 v18, 0xb

    .line 88
    .line 89
    const/4 v12, 0x2

    .line 90
    const-string v15, "onSubGameSelected"

    .line 91
    .line 92
    const-string v16, "onSubGameSelected(JI)V"

    .line 93
    .line 94
    invoke-direct/range {v11 .. v18}, La/nfj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iput-object v5, v1, La/gym0;->f:La/ms2;

    .line 101
    .line 102
    iget-object v5, v2, La/l5r;->c:La/uk5;

    .line 103
    .line 104
    iget-object v0, v5, La/uk5;->f:Ljava/lang/Object;

    .line 105
    .line 106
    move-object v7, v0

    .line 107
    check-cast v7, Landroidx/viewpager2/widget/ViewPager2;

    .line 108
    .line 109
    const/4 v8, 0x1

    .line 110
    :try_start_0
    const-class v0, Landroidx/viewpager2/widget/ViewPager2;

    .line 111
    .line 112
    const-string v9, "j"

    .line 113
    .line 114
    invoke-virtual {v0, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 129
    .line 130
    const-class v9, Landroidx/recyclerview/widget/RecyclerView;

    .line 131
    .line 132
    const-string v10, "x1"

    .line 133
    .line 134
    invoke-virtual {v9, v10}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-virtual {v9, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v9, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    check-cast v10, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    mul-int/lit8 v10, v10, 0x5

    .line 155
    .line 156
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v10

    .line 160
    invoke-virtual {v9, v0, v10}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :catch_0
    move-exception v0

    .line 165
    goto :goto_0

    .line 166
    :catch_1
    move-exception v0

    .line 167
    goto :goto_1

    .line 168
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 173
    .line 174
    .line 175
    :goto_2
    iget-object v0, v5, La/uk5;->g:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Landroid/widget/ImageView;

    .line 178
    .line 179
    new-instance v9, La/j1l0;

    .line 180
    .line 181
    const/16 v10, 0x12

    .line 182
    .line 183
    invoke-direct {v9, v3, v10}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v9}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 187
    .line 188
    .line 189
    iget-object v0, v5, La/uk5;->d:Landroid/view/View;

    .line 190
    .line 191
    check-cast v0, Landroid/widget/ImageView;

    .line 192
    .line 193
    new-instance v3, La/j1l0;

    .line 194
    .line 195
    const/16 v9, 0x13

    .line 196
    .line 197
    invoke-direct {v3, v4, v9}, La/j1l0;-><init>(Ljava/lang/Object;B)V

    .line 198
    .line 199
    .line 200
    invoke-static {v0, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 201
    .line 202
    .line 203
    iget-object v0, v2, La/l5r;->a:Landroid/widget/FrameLayout;

    .line 204
    .line 205
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    invoke-virtual {v2}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-ne v2, v8, :cond_0

    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_0
    move v8, v6

    .line 228
    :goto_3
    iget-object v2, v5, La/uk5;->c:Landroid/view/View;

    .line 229
    .line 230
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 231
    .line 232
    if-eqz v8, :cond_1

    .line 233
    .line 234
    sget-object v4, Landroid/graphics/drawable/GradientDrawable$Orientation;->RIGHT_LEFT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_1
    sget-object v4, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 238
    .line 239
    :goto_4
    sget-object v5, La/j5d;->a:Landroid/util/TypedValue;

    .line 240
    .line 241
    const v5, 0x7f040ae1

    .line 242
    .line 243
    .line 244
    invoke-static {v0, v5, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    const v8, 0x7f040b5d

    .line 249
    .line 250
    .line 251
    invoke-static {v0, v8, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    filled-new-array {v5, v0}, [I

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-direct {v3, v4, v0}, Landroid/graphics/drawable/GradientDrawable;-><init>(Landroid/graphics/drawable/GradientDrawable$Orientation;[I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 263
    .line 264
    .line 265
    new-instance v0, La/a9g;

    .line 266
    .line 267
    const/4 v2, 0x2

    .line 268
    invoke-direct {v0, v1, v11, v2}, La/a9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 269
    .line 270
    .line 271
    iput-object v0, v1, La/gym0;->g:La/a9g;

    .line 272
    .line 273
    invoke-virtual {v7, v0}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :cond_2
    const-string v0, "subGamesFragmentDelegate"

    .line 278
    .line 279
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    const/4 v0, 0x0

    .line 283
    throw v0
.end method

.method public final C0()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/kvm0;

    .line 22
    .line 23
    if-eqz v0, :cond_5

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/kvm0;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/kvm0;

    .line 52
    .line 53
    if-eqz v2, :cond_5

    .line 54
    .line 55
    sget-object v0, La/eym0;->U1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/eym0;->P1:La/khf0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lorg/xplatform/sportgame/subgames/api/SubGamesParams;

    .line 67
    .line 68
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    move-object v3, p0

    .line 73
    :goto_3
    if-eqz v3, :cond_4

    .line 74
    .line 75
    instance-of v4, v3, La/ocl0;

    .line 76
    .line 77
    if-eqz v4, :cond_3

    .line 78
    .line 79
    check-cast v3, La/ocl0;

    .line 80
    .line 81
    new-instance v4, La/aym0;

    .line 82
    .line 83
    const/4 v5, 0x1

    .line 84
    invoke-direct {v4, p0, v5}, La/aym0;-><init>(La/eym0;B)V

    .line 85
    .line 86
    .line 87
    sget-object v5, La/eym0;->V1:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v5, v2, La/kvm0;->a:La/cad;

    .line 96
    .line 97
    invoke-interface {v3, v4}, La/ocl0;->u(Lkotlin/jvm/functions/Function0;)La/pcl0;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iget-object v4, v2, La/kvm0;->b:La/bn6;

    .line 102
    .line 103
    iget-object v6, v2, La/kvm0;->c:La/j6m0;

    .line 104
    .line 105
    iget-object v7, v2, La/kvm0;->d:La/a530;

    .line 106
    .line 107
    iget-object v8, v2, La/kvm0;->e:La/d1p;

    .line 108
    .line 109
    iget-object v9, v2, La/kvm0;->f:La/ctf0;

    .line 110
    .line 111
    iget-object v10, v2, La/kvm0;->g:La/mj8;

    .line 112
    .line 113
    iget-object v2, v2, La/kvm0;->h:La/evz;

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    new-instance v11, La/g45;

    .line 125
    .line 126
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 127
    .line 128
    .line 129
    iput-object v0, v11, La/g45;->a:Ljava/lang/Object;

    .line 130
    .line 131
    iput-object v1, v11, La/g45;->b:Ljava/lang/Object;

    .line 132
    .line 133
    iput-object v3, v11, La/g45;->c:Ljava/lang/Object;

    .line 134
    .line 135
    iput-object v2, v11, La/g45;->d:Ljava/lang/Object;

    .line 136
    .line 137
    iput-object v5, v11, La/g45;->e:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object v4, v11, La/g45;->f:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v8, v11, La/g45;->g:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object v9, v11, La/g45;->h:Ljava/lang/Object;

    .line 144
    .line 145
    new-instance v0, La/rti;

    .line 146
    .line 147
    const/16 v1, 0x13

    .line 148
    .line 149
    invoke-direct {v0, v11, v1}, La/rti;-><init>(Ljava/lang/Object;B)V

    .line 150
    .line 151
    .line 152
    invoke-static {v0}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    iput-object v0, v11, La/g45;->i:Ljava/lang/Object;

    .line 157
    .line 158
    iget-object v0, v11, La/g45;->i:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, La/n5d0;

    .line 161
    .line 162
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, La/zui;

    .line 167
    .line 168
    iput-object v0, p0, La/eym0;->L1:La/zui;

    .line 169
    .line 170
    iput-object v6, p0, La/eym0;->M1:La/j6m0;

    .line 171
    .line 172
    new-instance v0, La/gym0;

    .line 173
    .line 174
    invoke-direct {v0, v7, v10}, La/gym0;-><init>(La/a530;La/mj8;)V

    .line 175
    .line 176
    .line 177
    iput-object v0, p0, La/eym0;->N1:La/gym0;

    .line 178
    .line 179
    return-void

    .line 180
    :cond_3
    iget-object v3, v3, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_4
    const-string p0, "Can\'t find feature provider!"

    .line 184
    .line 185
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_5
    const-string p0, "Cannot create dependency "

    .line 190
    .line 191
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/eym0;->H0()La/dzm0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/dzm0;->n:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/dym0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/dym0;-><init>(La/eym0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v2, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, La/zol0;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2, v1, v7}, La/zol0;-><init>(La/gmq;La/clz;La/dym0;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/eym0;->H0()La/dzm0;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/dzm0;->m:La/p7m0;

    .line 42
    .line 43
    new-instance v6, La/dym0;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/dym0;-><init>(La/eym0;La/yje;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v3, La/zol0;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/zol0;-><init>(La/gmq;La/clz;La/dym0;La/yje;C)V

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La/eym0;->H0()La/dzm0;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v4, v1, La/dzm0;->o:La/p7m0;

    .line 75
    .line 76
    sget-object v1, La/lkz;->a:La/lkz;

    .line 77
    .line 78
    new-instance v6, La/dym0;

    .line 79
    .line 80
    const/4 v1, 0x2

    .line 81
    invoke-direct {v6, p0, v7, v1}, La/dym0;-><init>(La/eym0;La/yje;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    new-instance v3, La/zol0;

    .line 97
    .line 98
    invoke-direct/range {v3 .. v8}, La/zol0;-><init>(La/gmq;La/clz;La/dym0;La/yje;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final G0()La/l5r;
    .locals 2

    .line 1
    sget-object v0, La/eym0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/eym0;->R1:La/s0r;

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
    check-cast p0, La/l5r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/dzm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/eym0;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/dzm0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 5

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/eym0;->N1:La/gym0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    invoke-virtual {p0}, La/eym0;->G0()La/l5r;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p0, p0, La/l5r;->c:La/uk5;

    .line 14
    .line 15
    iget-object v2, v0, La/gym0;->d:La/hhk;

    .line 16
    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    iget-boolean v3, v2, La/hhk;->a:Z

    .line 20
    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v3, v2, La/hhk;->e:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, La/yge0;

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    iget-object v4, v2, La/hhk;->h:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, La/l5g;

    .line 33
    .line 34
    invoke-virtual {v3, v4}, La/yge0;->y(La/ahe0;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, v2, La/hhk;->h:Ljava/lang/Object;

    .line 38
    .line 39
    :cond_1
    iget-object v3, v2, La/hhk;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Lcom/google/android/material/tabs/TabLayout;

    .line 42
    .line 43
    iget-object v4, v2, La/hhk;->g:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v4, La/wbo0;

    .line 46
    .line 47
    iget-object v3, v3, Lcom/google/android/material/tabs/TabLayout;->o1:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    iget-object v3, v2, La/hhk;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Landroidx/viewpager2/widget/ViewPager2;

    .line 55
    .line 56
    iget-object v4, v2, La/hhk;->f:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, La/zbo0;

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 61
    .line 62
    .line 63
    iput-object v1, v2, La/hhk;->g:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object v1, v2, La/hhk;->f:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v1, v2, La/hhk;->e:Ljava/lang/Object;

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    iput-boolean v3, v2, La/hhk;->a:Z

    .line 71
    .line 72
    :cond_2
    :goto_0
    iget-object v2, v0, La/gym0;->g:La/a9g;

    .line 73
    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    iget-object v3, p0, La/uk5;->f:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v3, Landroidx/viewpager2/widget/ViewPager2;

    .line 79
    .line 80
    invoke-virtual {v3, v2}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    iput-object v1, v0, La/gym0;->d:La/hhk;

    .line 84
    .line 85
    iput-object v1, v0, La/gym0;->c:La/ex7;

    .line 86
    .line 87
    iget-object p0, p0, La/uk5;->e:Landroid/view/View;

    .line 88
    .line 89
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/tabs/TabLayoutChips;

    .line 90
    .line 91
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnScrollChangeListener(Landroid/view/View$OnScrollChangeListener;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_4
    const-string p0, "subGamesFragmentDelegate"

    .line 96
    .line 97
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v1
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/eym0;->O1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/eym0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
