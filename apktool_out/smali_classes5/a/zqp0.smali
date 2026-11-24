.class public final La/zqp0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/zqp0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/y2m0",
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
.field public static final V1:La/y2m0;

.field public static final synthetic W1:[La/iiy;

.field public static final X1:Ljava/lang/String;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/ii;

.field public M1:La/qwi;

.field public final N1:Z

.field public final O1:La/zz2;

.field public final P1:La/r34;

.field public final Q1:La/s0r;

.field public final R1:La/kiu0;

.field public final S1:La/a8z;

.field public final U1:La/v62;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/zqp0;

    .line 4
    .line 5
    const-string v2, "eventId"

    .line 6
    .line 7
    const-string v3, "getEventId()I"

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
    const-string v3, "sportId"

    .line 16
    .line 17
    const-string v5, "getSportId()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "viewBinding"

    .line 25
    .line 26
    const-string v6, "getViewBinding()Lorg/xplatform/special_event/impl/databinding/FragmentTeamsSelectorBinding;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    new-array v5, v5, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v5, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v5, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v5, v0

    .line 41
    .line 42
    sput-object v5, La/zqp0;->W1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/y2m0;

    .line 45
    .line 46
    const/16 v2, 0x10

    .line 47
    .line 48
    invoke-direct {v0, v2}, La/y2m0;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/zqp0;->V1:La/y2m0;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, La/zqp0;->X1:Ljava/lang/String;

    .line 58
    .line 59
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d02ee

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/zqp0;->K1:La/hnm0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, La/zqp0;->N1:Z

    .line 13
    .line 14
    new-instance v0, La/zz2;

    .line 15
    .line 16
    const-string v1, "BUNDLE_EVENT_ID"

    .line 17
    .line 18
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/zqp0;->O1:La/zz2;

    .line 22
    .line 23
    new-instance v0, La/r34;

    .line 24
    .line 25
    const-string v1, "BUNDLE_SPORT_ID"

    .line 26
    .line 27
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, La/zqp0;->P1:La/r34;

    .line 31
    .line 32
    sget-object v0, La/yqp0;->a:La/yqp0;

    .line 33
    .line 34
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, La/zqp0;->Q1:La/s0r;

    .line 39
    .line 40
    new-instance v0, La/wqp0;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-direct {v0, p0, v1}, La/wqp0;-><init>(La/zqp0;B)V

    .line 44
    .line 45
    .line 46
    new-instance v1, La/mfo0;

    .line 47
    .line 48
    const/16 v2, 0xb

    .line 49
    .line 50
    invoke-direct {v1, p0, v2}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    sget-object v2, La/wez;->b:La/wez;

    .line 54
    .line 55
    new-instance v3, La/mfo0;

    .line 56
    .line 57
    const/16 v4, 0xc

    .line 58
    .line 59
    invoke-direct {v3, v1, v4}, La/mfo0;-><init>(Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-class v3, La/urp0;

    .line 67
    .line 68
    sget-object v4, La/sre0;->a:La/tre0;

    .line 69
    .line 70
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    new-instance v4, La/r5p0;

    .line 75
    .line 76
    const/4 v5, 0x4

    .line 77
    invoke-direct {v4, v1, v5}, La/r5p0;-><init>(La/a8z;B)V

    .line 78
    .line 79
    .line 80
    new-instance v5, La/r5p0;

    .line 81
    .line 82
    const/4 v6, 0x5

    .line 83
    invoke-direct {v5, v1, v6}, La/r5p0;-><init>(La/a8z;B)V

    .line 84
    .line 85
    .line 86
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, p0, La/zqp0;->R1:La/kiu0;

    .line 91
    .line 92
    new-instance v0, La/wqp0;

    .line 93
    .line 94
    const/4 v1, 0x2

    .line 95
    invoke-direct {v0, p0, v1}, La/wqp0;-><init>(La/zqp0;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iput-object v0, p0, La/zqp0;->S1:La/a8z;

    .line 103
    .line 104
    new-instance v0, La/v62;

    .line 105
    .line 106
    const/16 v1, 0x18

    .line 107
    .line 108
    invoke-direct {v0, p0, v1}, La/v62;-><init>(Ljava/lang/Object;B)V

    .line 109
    .line 110
    .line 111
    iput-object v0, p0, La/zqp0;->U1:La/v62;

    .line 112
    .line 113
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/zqp0;->G0()La/t5r;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v1, La/t5r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    iget-object v3, v1, La/t5r;->d:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 10
    .line 11
    iget-object v1, v1, La/t5r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 12
    .line 13
    iget-object v4, v0, La/zqp0;->S1:La/a8z;

    .line 14
    .line 15
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, La/vqp0;

    .line 20
    .line 21
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const v5, 0x7f07072d

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    const v5, 0x7f0706ea

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    const v5, 0x7f07070c

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    const v9, 0x7f05000f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_0

    .line 89
    .line 90
    new-instance v6, La/qmk0;

    .line 91
    .line 92
    const/4 v14, 0x0

    .line 93
    const/16 v15, 0x1c0

    .line 94
    .line 95
    const/4 v12, 0x1

    .line 96
    const/4 v13, 0x0

    .line 97
    move v8, v9

    .line 98
    move v9, v7

    .line 99
    move v10, v4

    .line 100
    move v11, v7

    .line 101
    move/from16 v20, v8

    .line 102
    .line 103
    move v8, v4

    .line 104
    move/from16 v4, v20

    .line 105
    .line 106
    invoke-direct/range {v6 .. v15}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v6}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_0
    move v4, v9

    .line 114
    new-instance v6, La/qmk0;

    .line 115
    .line 116
    const/4 v14, 0x0

    .line 117
    const/16 v15, 0x1c0

    .line 118
    .line 119
    const/4 v12, 0x1

    .line 120
    const/4 v13, 0x0

    .line 121
    move v9, v7

    .line 122
    move v10, v8

    .line 123
    move v11, v7

    .line 124
    invoke-direct/range {v6 .. v15}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v6}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 128
    .line 129
    .line 130
    :goto_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    const/4 v4, 0x0

    .line 143
    if-eqz v2, :cond_1

    .line 144
    .line 145
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    invoke-virtual {v0}, La/zqp0;->G0()La/t5r;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    iget-object v5, v5, La/t5r;->f:La/vr9;

    .line 162
    .line 163
    iget-object v5, v5, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 164
    .line 165
    invoke-virtual {v5, v2, v4, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_1
    invoke-virtual {v0}, La/zqp0;->G0()La/t5r;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    iget-object v2, v2, La/t5r;->f:La/vr9;

    .line 174
    .line 175
    iget-object v2, v2, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 176
    .line 177
    invoke-virtual {v2, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 178
    .line 179
    .line 180
    :goto_1
    const v2, 0x7f130447

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setTitle(Ljava/lang/CharSequence;)V

    .line 188
    .line 189
    .line 190
    const v2, 0x7f140197

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonStyle(I)V

    .line 194
    .line 195
    .line 196
    const v2, 0x7f13014b

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonText(I)V

    .line 200
    .line 201
    .line 202
    const v2, 0x7f1306e0

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonText(I)V

    .line 206
    .line 207
    .line 208
    new-instance v2, La/wqp0;

    .line 209
    .line 210
    const/4 v4, 0x3

    .line 211
    invoke-direct {v2, v0, v4}, La/wqp0;-><init>(La/zqp0;B)V

    .line 212
    .line 213
    .line 214
    invoke-static {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 215
    .line 216
    .line 217
    new-instance v2, La/wqp0;

    .line 218
    .line 219
    const/4 v4, 0x4

    .line 220
    invoke-direct {v2, v0, v4}, La/wqp0;-><init>(La/zqp0;B)V

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->v(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0}, La/zqp0;->G0()La/t5r;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    iget-object v1, v1, La/t5r;->d:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 231
    .line 232
    new-instance v4, La/gc50;

    .line 233
    .line 234
    sget-object v6, La/ic50;->b:La/ic50;

    .line 235
    .line 236
    new-instance v8, La/wqp0;

    .line 237
    .line 238
    const/4 v2, 0x5

    .line 239
    invoke-direct {v8, v0, v2}, La/wqp0;-><init>(La/zqp0;B)V

    .line 240
    .line 241
    .line 242
    const/16 v9, 0x7f0

    .line 243
    .line 244
    const-string v5, "CLEAR_BUTTON"

    .line 245
    .line 246
    const v7, 0x7f08083a

    .line 247
    .line 248
    .line 249
    invoke-direct/range {v4 .. v9}, La/gc50;-><init>(Ljava/lang/String;La/ic50;ILkotlin/jvm/functions/Function0;I)V

    .line 250
    .line 251
    .line 252
    filled-new-array {v4}, [La/gc50;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    invoke-static {v2}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, La/zqp0;->G0()La/t5r;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    iget-object v1, v1, La/t5r;->d:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 268
    .line 269
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    const v4, 0x7f040b0b

    .line 274
    .line 275
    .line 276
    invoke-static {v4, v2}, La/m5d;->b(ILandroid/content/Context;)I

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setNavigationBarButtonsColorStateList(Landroid/content/res/ColorStateList;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v0}, La/zqp0;->G0()La/t5r;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    iget-object v1, v1, La/t5r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 292
    .line 293
    new-instance v2, La/b0l0;

    .line 294
    .line 295
    const/16 v4, 0x10

    .line 296
    .line 297
    invoke-direct {v2, v0, v4}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 298
    .line 299
    .line 300
    sget-object v4, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 301
    .line 302
    invoke-static {v1, v2}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 303
    .line 304
    .line 305
    new-instance v1, La/wqp0;

    .line 306
    .line 307
    const/4 v2, 0x6

    .line 308
    invoke-direct {v1, v0, v2}, La/wqp0;-><init>(La/zqp0;B)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v3, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 312
    .line 313
    .line 314
    new-instance v4, La/cym0;

    .line 315
    .line 316
    invoke-virtual {v0}, La/zqp0;->H0()La/urp0;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    const/4 v10, 0x0

    .line 321
    const/16 v11, 0xb

    .line 322
    .line 323
    const/4 v5, 0x0

    .line 324
    const-class v15, La/urp0;

    .line 325
    .line 326
    const-string v8, "resetSelectedTeams"

    .line 327
    .line 328
    const-string v9, "resetSelectedTeams()V"

    .line 329
    .line 330
    move-object v7, v15

    .line 331
    invoke-direct/range {v4 .. v11}, La/cym0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 332
    .line 333
    .line 334
    const-string v1, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY"

    .line 335
    .line 336
    invoke-static {v0, v1, v4}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 337
    .line 338
    .line 339
    new-instance v2, La/wqp0;

    .line 340
    .line 341
    const/4 v3, 0x1

    .line 342
    invoke-direct {v2, v0, v3}, La/wqp0;-><init>(La/zqp0;B)V

    .line 343
    .line 344
    .line 345
    invoke-static {v0, v1, v2}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 346
    .line 347
    .line 348
    new-instance v12, La/cym0;

    .line 349
    .line 350
    invoke-virtual {v0}, La/zqp0;->H0()La/urp0;

    .line 351
    .line 352
    .line 353
    move-result-object v14

    .line 354
    const/16 v18, 0x0

    .line 355
    .line 356
    const/16 v19, 0xa

    .line 357
    .line 358
    const/4 v13, 0x0

    .line 359
    const-string v16, "onClearTeams"

    .line 360
    .line 361
    const-string v17, "onClearTeams()V"

    .line 362
    .line 363
    invoke-direct/range {v12 .. v19}, La/cym0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 364
    .line 365
    .line 366
    const-string v1, "REQUEST_CLEAR_TEAMS_DIALOG_KEY"

    .line 367
    .line 368
    invoke-static {v0, v1, v12}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 369
    .line 370
    .line 371
    new-instance v2, La/wqp0;

    .line 372
    .line 373
    const/16 v3, 0x9

    .line 374
    .line 375
    invoke-direct {v2, v0, v3}, La/wqp0;-><init>(La/zqp0;B)V

    .line 376
    .line 377
    .line 378
    invoke-static {v0, v1, v2}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 379
    .line 380
    .line 381
    new-instance v1, La/wqp0;

    .line 382
    .line 383
    const/4 v2, 0x7

    .line 384
    invoke-direct {v1, v0, v2}, La/wqp0;-><init>(La/zqp0;B)V

    .line 385
    .line 386
    .line 387
    const-string v2, "REQUEST_APPLY_CHANGES_DIALOG_KEY"

    .line 388
    .line 389
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 390
    .line 391
    .line 392
    new-instance v1, La/wqp0;

    .line 393
    .line 394
    const/16 v3, 0x8

    .line 395
    .line 396
    invoke-direct {v1, v0, v3}, La/wqp0;-><init>(La/zqp0;B)V

    .line 397
    .line 398
    .line 399
    invoke-static {v0, v2, v1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    invoke-virtual {v1}, La/agd;->k()La/jg60;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    iget-object v0, v0, La/zqp0;->U1:La/v62;

    .line 411
    .line 412
    invoke-virtual {v1, v0}, La/jg60;->b(La/eg60;)V

    .line 413
    .line 414
    .line 415
    return-void
.end method

.method public final C0()V
    .locals 19

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
    const-class v2, La/arp0;

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
    instance-of v4, v1, La/arp0;

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
    check-cast v3, La/arp0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v16

    .line 61
    const/4 v1, 0x0

    .line 62
    sget-object v2, La/zqp0;->W1:[La/iiy;

    .line 63
    .line 64
    aget-object v1, v2, v1

    .line 65
    .line 66
    iget-object v4, v0, La/zqp0;->O1:La/zz2;

    .line 67
    .line 68
    invoke-virtual {v4, v0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    const/4 v1, 0x1

    .line 73
    aget-object v1, v2, v1

    .line 74
    .line 75
    iget-object v2, v0, La/zqp0;->P1:La/r34;

    .line 76
    .line 77
    invoke-virtual {v2, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v1, v3, La/arp0;->a:La/j1q0;

    .line 85
    .line 86
    iget-object v2, v3, La/arp0;->f:La/vby;

    .line 87
    .line 88
    iget-object v7, v3, La/arp0;->k:La/ii;

    .line 89
    .line 90
    iget-object v10, v3, La/arp0;->d:La/knf0;

    .line 91
    .line 92
    iget-object v4, v3, La/arp0;->e:La/q7d0;

    .line 93
    .line 94
    iget-object v12, v3, La/arp0;->g:La/gii0;

    .line 95
    .line 96
    iget-object v5, v3, La/arp0;->b:La/cad;

    .line 97
    .line 98
    iget-object v13, v3, La/arp0;->c:La/ctf0;

    .line 99
    .line 100
    iget-object v15, v3, La/arp0;->j:La/duj;

    .line 101
    .line 102
    iget-object v11, v3, La/arp0;->i:La/m1e;

    .line 103
    .line 104
    iget-object v14, v3, La/arp0;->h:La/g2v;

    .line 105
    .line 106
    iget-object v6, v3, La/arp0;->l:La/aqp0;

    .line 107
    .line 108
    move-object/from16 v17, v6

    .line 109
    .line 110
    iget-object v6, v3, La/arp0;->m:La/d1p;

    .line 111
    .line 112
    iget-object v3, v3, La/arp0;->n:La/yo4;

    .line 113
    .line 114
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    new-instance v4, La/v7i;

    .line 145
    .line 146
    move-object/from16 v18, v3

    .line 147
    .line 148
    invoke-direct/range {v4 .. v18}, La/v7i;-><init>(La/cad;La/d1p;La/ii;Ljava/lang/Integer;Ljava/lang/Long;La/knf0;La/m1e;La/gii0;La/ctf0;La/g2v;La/duj;La/i1w0;La/aqp0;La/yo4;)V

    .line 149
    .line 150
    .line 151
    iput-object v7, v0, La/zqp0;->L1:La/ii;

    .line 152
    .line 153
    iget-object v1, v4, La/v7i;->o:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v1, La/n5d0;

    .line 156
    .line 157
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    check-cast v1, La/qwi;

    .line 162
    .line 163
    iput-object v1, v0, La/zqp0;->M1:La/qwi;

    .line 164
    .line 165
    return-void

    .line 166
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 167
    .line 168
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public final D0()V
    .locals 25

    .line 1
    invoke-virtual/range {p0 .. p0}, La/zqp0;->H0()La/urp0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/urp0;->p:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/tmg0;

    .line 8
    .line 9
    const/16 v3, 0x1d

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    invoke-direct {v2, v0, v8, v3}, La/tmg0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    new-instance v3, La/fnq;

    .line 16
    .line 17
    invoke-direct {v3, v1, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/sye0;

    .line 21
    .line 22
    const/16 v2, 0xe

    .line 23
    .line 24
    invoke-direct {v1, v0, v8, v2}, La/sye0;-><init>(La/diu0;La/yje;B)V

    .line 25
    .line 26
    .line 27
    new-instance v0, La/dnq;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v0, v3, v1, v2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 31
    .line 32
    .line 33
    new-instance v9, La/bdl0;

    .line 34
    .line 35
    const/4 v15, 0x4

    .line 36
    const/16 v16, 0x6

    .line 37
    .line 38
    const/4 v10, 0x2

    .line 39
    const-class v20, La/zqp0;

    .line 40
    .line 41
    const-string v13, "onTeamsSelectorUiState"

    .line 42
    .line 43
    const-string v14, "onTeamsSelectorUiState(Lorg/xplatform/special_event/impl/teams/presentation/TeamsSelectorViewModel$TeamsSelectorUiState;)V"

    .line 44
    .line 45
    move-object/from16 v11, p0

    .line 46
    .line 47
    move-object/from16 v12, v20

    .line 48
    .line 49
    invoke-direct/range {v9 .. v16}, La/bdl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 50
    .line 51
    .line 52
    sget-object v1, La/lkz;->a:La/lkz;

    .line 53
    .line 54
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    new-instance v3, La/lto0;

    .line 67
    .line 68
    invoke-direct {v3, v0, v1, v9, v8}, La/lto0;-><init>(La/dnq;La/clz;La/bdl0;La/yje;)V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x3

    .line 72
    invoke-static {v2, v8, v8, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 73
    .line 74
    .line 75
    invoke-virtual/range {p0 .. p0}, La/zqp0;->H0()La/urp0;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget-object v1, v1, La/urp0;->q:La/p7m0;

    .line 80
    .line 81
    new-instance v17, La/bdl0;

    .line 82
    .line 83
    const/16 v23, 0x4

    .line 84
    .line 85
    const/16 v24, 0x7

    .line 86
    .line 87
    const/16 v18, 0x2

    .line 88
    .line 89
    const-string v21, "onSelectedTeamsUiState"

    .line 90
    .line 91
    const-string v22, "onSelectedTeamsUiState(Lorg/xplatform/special_event/impl/teams/presentation/TeamsSelectorViewModel$SelectedTeamsUiState;)V"

    .line 92
    .line 93
    move-object/from16 v19, p0

    .line 94
    .line 95
    invoke-direct/range {v17 .. v24}, La/bdl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 96
    .line 97
    .line 98
    move-object/from16 v2, v17

    .line 99
    .line 100
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    new-instance v5, La/lto0;

    .line 113
    .line 114
    invoke-direct {v5, v1, v3, v2, v8}, La/lto0;-><init>(La/gmq;La/clz;La/bdl0;La/yje;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v4, v8, v8, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {p0 .. p0}, La/zqp0;->H0()La/urp0;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    iget-object v5, v1, La/urp0;->t:La/ol60;

    .line 125
    .line 126
    new-instance v17, La/bdl0;

    .line 127
    .line 128
    const/16 v24, 0x8

    .line 129
    .line 130
    const-string v21, "onSingleEventHandled"

    .line 131
    .line 132
    const-string v22, "onSingleEventHandled(Lorg/xplatform/special_event/impl/teams/presentation/TeamsSelectorViewModel$SingleEvent;)V"

    .line 133
    .line 134
    invoke-direct/range {v17 .. v24}, La/bdl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 135
    .line 136
    .line 137
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    new-instance v4, La/lto0;

    .line 150
    .line 151
    const/4 v9, 0x0

    .line 152
    move-object/from16 v7, v17

    .line 153
    .line 154
    invoke-direct/range {v4 .. v9}, La/lto0;-><init>(La/gmq;La/clz;La/bdl0;La/yje;B)V

    .line 155
    .line 156
    .line 157
    invoke-static {v1, v8, v8, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public final G0()La/t5r;
    .locals 2

    .line 1
    sget-object v0, La/zqp0;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/zqp0;->Q1:La/s0r;

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
    check-cast p0, La/t5r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/urp0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zqp0;->R1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/urp0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/zqp0;->G0()La/t5r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/t5r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/zqp0;->U1:La/v62;

    .line 15
    .line 16
    invoke-virtual {p0}, La/eg60;->e()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/zqp0;->N1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zqp0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
