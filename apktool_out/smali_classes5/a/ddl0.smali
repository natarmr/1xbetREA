.class public final La/ddl0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ddl0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/cge0",
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
.field public static final V1:La/cge0;

.field public static final synthetic W1:[La/iiy;

.field public static final X1:Ljava/lang/String;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/ii;

.field public M1:La/qui;

.field public final N1:Z

.field public final O1:La/khf0;

.field public final P1:La/s0r;

.field public final Q1:La/kiu0;

.field public final R1:La/a8z;

.field public final S1:La/a8z;

.field public final U1:La/v62;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ddl0;

    .line 4
    .line 5
    const-string v2, "screenParams"

    .line 6
    .line 7
    const-string v3, "getScreenParams()Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;"

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
    const-string v5, "getBinding()Lorg/xplatform/special_event/impl/databinding/FragmentSportGameFilterSelectionBinding;"

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
    sput-object v3, La/ddl0;->W1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/cge0;

    .line 33
    .line 34
    const/16 v2, 0x1b

    .line 35
    .line 36
    invoke-direct {v0, v2}, La/cge0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/ddl0;->V1:La/cge0;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, La/ddl0;->X1:Ljava/lang/String;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d02db

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
    iput-object v0, p0, La/ddl0;->K1:La/hnm0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, La/ddl0;->N1:Z

    .line 13
    .line 14
    new-instance v1, La/khf0;

    .line 15
    .line 16
    const-string v2, "BUNDLE_SCREEN_PARAMS"

    .line 17
    .line 18
    invoke-direct {v1, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, La/ddl0;->O1:La/khf0;

    .line 22
    .line 23
    sget-object v1, La/adl0;->a:La/adl0;

    .line 24
    .line 25
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, p0, La/ddl0;->P1:La/s0r;

    .line 30
    .line 31
    new-instance v1, La/zcl0;

    .line 32
    .line 33
    const/16 v2, 0x9

    .line 34
    .line 35
    invoke-direct {v1, p0, v2}, La/zcl0;-><init>(La/ddl0;B)V

    .line 36
    .line 37
    .line 38
    new-instance v2, La/fyk0;

    .line 39
    .line 40
    const/4 v3, 0x3

    .line 41
    invoke-direct {v2, p0, v3}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    sget-object v3, La/wez;->b:La/wez;

    .line 45
    .line 46
    new-instance v4, La/fyk0;

    .line 47
    .line 48
    const/4 v5, 0x4

    .line 49
    invoke-direct {v4, v2, v5}, La/fyk0;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const-class v4, La/ndl0;

    .line 57
    .line 58
    sget-object v5, La/sre0;->a:La/tre0;

    .line 59
    .line 60
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    new-instance v5, La/cdl0;

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    invoke-direct {v5, v2, v6}, La/cdl0;-><init>(La/a8z;B)V

    .line 68
    .line 69
    .line 70
    new-instance v6, La/cdl0;

    .line 71
    .line 72
    invoke-direct {v6, v2, v0}, La/cdl0;-><init>(La/a8z;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0, v4, v5, v6, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, p0, La/ddl0;->Q1:La/kiu0;

    .line 80
    .line 81
    new-instance v1, La/zcl0;

    .line 82
    .line 83
    const/16 v2, 0xa

    .line 84
    .line 85
    invoke-direct {v1, p0, v2}, La/zcl0;-><init>(La/ddl0;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v3, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iput-object v1, p0, La/ddl0;->R1:La/a8z;

    .line 93
    .line 94
    new-instance v1, La/zcl0;

    .line 95
    .line 96
    invoke-direct {v1, p0, v0}, La/zcl0;-><init>(La/ddl0;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {v3, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iput-object v0, p0, La/ddl0;->S1:La/a8z;

    .line 104
    .line 105
    new-instance v0, La/v62;

    .line 106
    .line 107
    const/16 v1, 0x13

    .line 108
    .line 109
    invoke-direct {v0, p0, v1}, La/v62;-><init>(Ljava/lang/Object;B)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, La/ddl0;->U1:La/v62;

    .line 113
    .line 114
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/ddl0;->G0()La/a5r;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, La/a5r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    new-instance v2, La/qmk0;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const v4, 0x7f07072d

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-direct {v2, v3}, La/qmk0;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, La/ddl0;->G0()La/a5r;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v1, v1, La/a5r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 33
    .line 34
    iget-object v2, v0, La/ddl0;->S1:La/a8z;

    .line 35
    .line 36
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, La/rcl0;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, La/ddl0;->G0()La/a5r;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v1, v1, La/a5r;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 50
    .line 51
    iget-object v2, v0, La/ddl0;->R1:La/a8z;

    .line 52
    .line 53
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Landroid/text/TextWatcher;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v3, v1, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 63
    .line 64
    if-eqz v3, :cond_0

    .line 65
    .line 66
    invoke-interface {v3, v2}, La/s96;->f(Landroid/text/TextWatcher;)V

    .line 67
    .line 68
    .line 69
    :cond_0
    const v2, 0x7f1311bf

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setSearchHint(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    new-instance v2, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    new-instance v3, La/gc50;

    .line 88
    .line 89
    sget-object v5, La/ic50;->c:La/ic50;

    .line 90
    .line 91
    new-instance v7, La/fzk0;

    .line 92
    .line 93
    const/4 v10, 0x7

    .line 94
    invoke-direct {v7, v10}, La/fzk0;-><init>(B)V

    .line 95
    .line 96
    .line 97
    const/16 v8, 0x3f0

    .line 98
    .line 99
    const-string v4, "SEARCH_NAV_ITEM_KEY"

    .line 100
    .line 101
    const v6, 0x7f0809ee

    .line 102
    .line 103
    .line 104
    invoke-direct/range {v3 .. v8}, La/gc50;-><init>(Ljava/lang/String;La/ic50;ILkotlin/jvm/functions/Function0;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    new-instance v4, La/gc50;

    .line 111
    .line 112
    new-instance v8, La/lph0;

    .line 113
    .line 114
    invoke-virtual {v0}, La/ddl0;->J0()La/ndl0;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    const/16 v17, 0x0

    .line 119
    .line 120
    const/16 v18, 0x12

    .line 121
    .line 122
    const/4 v12, 0x0

    .line 123
    const-class v14, La/ndl0;

    .line 124
    .line 125
    const-string v15, "onClearBtnClicked"

    .line 126
    .line 127
    const-string v16, "onClearBtnClicked()V"

    .line 128
    .line 129
    move-object v11, v8

    .line 130
    invoke-direct/range {v11 .. v18}, La/lph0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 131
    .line 132
    .line 133
    const/16 v9, 0x7f0

    .line 134
    .line 135
    move-object v6, v5

    .line 136
    const-string v5, "DISCARD_FILTERS_NAV_ITEM_KEY"

    .line 137
    .line 138
    const v7, 0x7f08083a

    .line 139
    .line 140
    .line 141
    invoke-direct/range {v4 .. v9}, La/gc50;-><init>(Ljava/lang/String;La/ic50;ILkotlin/jvm/functions/Function0;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, La/ddl0;->G0()La/a5r;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    iget-object v3, v3, La/a5r;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 152
    .line 153
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    const v5, 0x7f040afc

    .line 158
    .line 159
    .line 160
    invoke-static {v5, v4}, La/m5d;->b(ILandroid/content/Context;)I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setNavigationBarButtonsColorStateList(Landroid/content/res/ColorStateList;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, La/ddl0;->G0()La/a5r;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    iget-object v3, v3, La/a5r;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 176
    .line 177
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 178
    .line 179
    .line 180
    new-instance v2, La/zcl0;

    .line 181
    .line 182
    const/4 v3, 0x4

    .line 183
    invoke-direct {v2, v0, v3}, La/zcl0;-><init>(La/ddl0;B)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setOnHideSearchBarClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 187
    .line 188
    .line 189
    new-instance v19, La/lph0;

    .line 190
    .line 191
    invoke-virtual {v0}, La/ddl0;->J0()La/ndl0;

    .line 192
    .line 193
    .line 194
    move-result-object v21

    .line 195
    const/16 v25, 0x0

    .line 196
    .line 197
    const/16 v26, 0x13

    .line 198
    .line 199
    const/16 v20, 0x0

    .line 200
    .line 201
    const-string v23, "onBackClick"

    .line 202
    .line 203
    const-string v24, "onBackClick()V"

    .line 204
    .line 205
    move-object/from16 v22, v14

    .line 206
    .line 207
    invoke-direct/range {v19 .. v26}, La/lph0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 208
    .line 209
    .line 210
    move-object/from16 v2, v19

    .line 211
    .line 212
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 213
    .line 214
    .line 215
    new-instance v2, La/zcl0;

    .line 216
    .line 217
    const/4 v3, 0x5

    .line 218
    invoke-direct {v2, v0, v3}, La/zcl0;-><init>(La/ddl0;B)V

    .line 219
    .line 220
    .line 221
    iget-object v1, v1, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 222
    .line 223
    if-eqz v1, :cond_1

    .line 224
    .line 225
    invoke-interface {v1, v2}, La/s96;->h(Lkotlin/jvm/functions/Function0;)V

    .line 226
    .line 227
    .line 228
    :cond_1
    invoke-virtual {v0}, La/ddl0;->G0()La/a5r;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    iget-object v1, v1, La/a5r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 233
    .line 234
    invoke-virtual {v0}, La/ddl0;->G0()La/a5r;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    iget-object v2, v2, La/a5r;->b:Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 239
    .line 240
    new-instance v3, La/b0l0;

    .line 241
    .line 242
    const/4 v4, 0x1

    .line 243
    invoke-direct {v3, v0, v4}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 244
    .line 245
    .line 246
    sget-object v4, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 247
    .line 248
    invoke-static {v2, v3}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 249
    .line 250
    .line 251
    const v2, 0x7f140197

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonStyle(I)V

    .line 255
    .line 256
    .line 257
    const v2, 0x7f13014b

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setSecondButtonText(I)V

    .line 261
    .line 262
    .line 263
    const v2, 0x7f1306e0

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->setFirstButtonText(I)V

    .line 267
    .line 268
    .line 269
    new-instance v2, La/zcl0;

    .line 270
    .line 271
    const/4 v3, 0x6

    .line 272
    invoke-direct {v2, v0, v3}, La/zcl0;-><init>(La/ddl0;B)V

    .line 273
    .line 274
    .line 275
    invoke-static {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 276
    .line 277
    .line 278
    new-instance v2, La/zcl0;

    .line 279
    .line 280
    invoke-direct {v2, v0, v10}, La/zcl0;-><init>(La/ddl0;B)V

    .line 281
    .line 282
    .line 283
    invoke-static {v1, v2}, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->v(Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;Lkotlin/jvm/functions/Function0;)V

    .line 284
    .line 285
    .line 286
    new-instance v1, La/zcl0;

    .line 287
    .line 288
    const/4 v2, 0x0

    .line 289
    invoke-direct {v1, v0, v2}, La/zcl0;-><init>(La/ddl0;B)V

    .line 290
    .line 291
    .line 292
    const-string v2, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY"

    .line 293
    .line 294
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 295
    .line 296
    .line 297
    new-instance v1, La/zcl0;

    .line 298
    .line 299
    const/16 v2, 0x8

    .line 300
    .line 301
    invoke-direct {v1, v0, v2}, La/zcl0;-><init>(La/ddl0;B)V

    .line 302
    .line 303
    .line 304
    const-string v2, "REQUEST_CLEAR_SPORT_GAMES_DIALOG_KEY"

    .line 305
    .line 306
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 307
    .line 308
    .line 309
    new-instance v1, La/zcl0;

    .line 310
    .line 311
    const/4 v2, 0x2

    .line 312
    invoke-direct {v1, v0, v2}, La/zcl0;-><init>(La/ddl0;B)V

    .line 313
    .line 314
    .line 315
    const-string v2, "REQUEST_APPLY_CHANGES_DIALOG_KEY"

    .line 316
    .line 317
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 318
    .line 319
    .line 320
    new-instance v1, La/zcl0;

    .line 321
    .line 322
    const/4 v3, 0x3

    .line 323
    invoke-direct {v1, v0, v3}, La/zcl0;-><init>(La/ddl0;B)V

    .line 324
    .line 325
    .line 326
    invoke-static {v0, v2, v1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-virtual {v1}, La/agd;->k()La/jg60;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    iget-object v0, v0, La/ddl0;->U1:La/v62;

    .line 338
    .line 339
    invoke-virtual {v1, v0}, La/jg60;->b(La/eg60;)V

    .line 340
    .line 341
    .line 342
    return-void
.end method

.method public final C0()V
    .locals 13

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
    const-class v1, La/scl0;

    .line 22
    .line 23
    if-eqz v0, :cond_4

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
    instance-of v3, v0, La/scl0;

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
    check-cast v2, La/scl0;

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0}, La/ddl0;->I0()Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    sget-object v3, La/xnk0;->a:Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-virtual {p0}, La/ddl0;->I0()Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    iget v3, v3, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;->a:I

    .line 70
    .line 71
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    iget-object v4, v4, La/cb50;->a:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v3, v4}, La/xnk0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v4}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {v4, v3}, La/xnk0;->c(Landroid/app/Application;Ljava/lang/String;)La/cui;

    .line 93
    .line 94
    .line 95
    sget-object v3, La/n8l0;->a:Ljava/util/LinkedHashMap;

    .line 96
    .line 97
    invoke-virtual {p0}, La/ddl0;->I0()Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iget v3, v3, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;->a:I

    .line 102
    .line 103
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    iget-object v4, v4, La/cb50;->a:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {p0}, La/ddl0;->I0()Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    iget-object v5, v5, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;->b:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v3, v4, v5}, La/n8l0;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    sget-object v4, La/n8l0;->a:Ljava/util/LinkedHashMap;

    .line 120
    .line 121
    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, La/lui;

    .line 126
    .line 127
    if-eqz v3, :cond_3

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v4, v2, La/scl0;->a:La/j1q0;

    .line 133
    .line 134
    iget-object v5, v2, La/scl0;->f:La/d1p;

    .line 135
    .line 136
    iget-object v6, v2, La/scl0;->b:La/cad;

    .line 137
    .line 138
    iget-object v7, v2, La/scl0;->e:La/duj;

    .line 139
    .line 140
    iget-object v8, v2, La/scl0;->d:La/m1e;

    .line 141
    .line 142
    iget-object v9, v2, La/scl0;->g:La/ii;

    .line 143
    .line 144
    iget-object v10, v2, La/scl0;->c:La/g2v;

    .line 145
    .line 146
    iget-object v11, v2, La/scl0;->h:La/yo4;

    .line 147
    .line 148
    iget-object v12, v2, La/scl0;->i:La/sjl0;

    .line 149
    .line 150
    iget-object v2, v2, La/scl0;->j:La/b4j;

    .line 151
    .line 152
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    new-instance v4, La/ru;

    .line 168
    .line 169
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 170
    .line 171
    .line 172
    iput-object v1, v4, La/ru;->a:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v6, v4, La/ru;->c:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v7, v4, La/ru;->b:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v10, v4, La/ru;->d:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v0, v4, La/ru;->e:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v3, v4, La/ru;->f:Ljava/lang/Object;

    .line 183
    .line 184
    iput-object v11, v4, La/ru;->g:Ljava/lang/Object;

    .line 185
    .line 186
    iput-object v5, v4, La/ru;->h:Ljava/lang/Object;

    .line 187
    .line 188
    iput-object v2, v4, La/ru;->i:Ljava/lang/Object;

    .line 189
    .line 190
    new-instance v0, La/rti;

    .line 191
    .line 192
    const/4 v1, 0x7

    .line 193
    invoke-direct {v0, v4, v1}, La/rti;-><init>(Ljava/lang/Object;B)V

    .line 194
    .line 195
    .line 196
    invoke-static {v0}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    iput-object v0, v4, La/ru;->j:Ljava/lang/Object;

    .line 201
    .line 202
    iput-object v9, p0, La/ddl0;->L1:La/ii;

    .line 203
    .line 204
    iget-object v0, v4, La/ru;->j:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, La/n5d0;

    .line 207
    .line 208
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, La/qui;

    .line 213
    .line 214
    iput-object v0, p0, La/ddl0;->M1:La/qui;

    .line 215
    .line 216
    return-void

    .line 217
    :cond_3
    const-string p0, "Can\'t find feature provider!"

    .line 218
    .line 219
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 224
    .line 225
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    return-void
.end method

.method public final D0()V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, La/ddl0;->J0()La/ndl0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ndl0;->m:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/bdl0;

    .line 8
    .line 9
    const/4 v7, 0x4

    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v2, 0x2

    .line 12
    const-class v4, La/ddl0;

    .line 13
    .line 14
    const-string v5, "onSportGameFilterSelectionEventHandled"

    .line 15
    .line 16
    const-string v6, "onSportGameFilterSelectionEventHandled(Lorg/xplatform/special_event/impl/filter/presentation/model/SportGameFilterSelectionEvent;)V"

    .line 17
    .line 18
    move-object/from16 v3, p0

    .line 19
    .line 20
    invoke-direct/range {v1 .. v8}, La/bdl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/lkz;->a:La/lkz;

    .line 24
    .line 25
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    new-instance v5, La/myj0;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-direct {v5, v0, v2, v1, v6}, La/myj0;-><init>(La/gmq;La/clz;La/bdl0;La/yje;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x3

    .line 44
    invoke-static {v3, v6, v6, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {p0 .. p0}, La/ddl0;->J0()La/ndl0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v1, v1, La/ndl0;->n:La/p7m0;

    .line 52
    .line 53
    new-instance v2, La/qaf0;

    .line 54
    .line 55
    const/16 v3, 0xb

    .line 56
    .line 57
    invoke-direct {v2, v1, v3}, La/qaf0;-><init>(La/gmq;B)V

    .line 58
    .line 59
    .line 60
    new-instance v9, La/bdl0;

    .line 61
    .line 62
    const/4 v15, 0x4

    .line 63
    const/16 v16, 0x1

    .line 64
    .line 65
    const/4 v10, 0x2

    .line 66
    const-string v13, "onSportGameFilterSelectionUiState"

    .line 67
    .line 68
    const-string v14, "onSportGameFilterSelectionUiState(Lorg/xplatform/special_event/impl/filter/presentation/model/SportGameFilterSelectionUiState;)V"

    .line 69
    .line 70
    move-object/from16 v11, p0

    .line 71
    .line 72
    move-object v12, v4

    .line 73
    invoke-direct/range {v9 .. v16}, La/bdl0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 74
    .line 75
    .line 76
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    new-instance v4, La/myj0;

    .line 89
    .line 90
    invoke-direct {v4, v2, v1, v9, v6}, La/myj0;-><init>(La/qaf0;La/clz;La/bdl0;La/yje;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v3, v6, v6, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final G0()La/a5r;
    .locals 2

    .line 1
    sget-object v0, La/ddl0;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ddl0;->P1:La/s0r;

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
    check-cast p0, La/a5r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/ukm;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/ddl0;->G0()La/a5r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/a5r;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 6
    .line 7
    iget-object p0, p0, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const-string v0, "DISCARD_FILTERS_NAV_ITEM_KEY"

    .line 12
    .line 13
    invoke-interface {p0, v0}, La/s96;->b(Ljava/lang/String;)La/ukm;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public final I0()Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;
    .locals 2

    .line 1
    sget-object v0, La/ddl0;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ddl0;->O1:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final J0()La/ndl0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ddl0;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ndl0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 3

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ddl0;->G0()La/a5r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, v0, La/a5r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, La/ddl0;->U1:La/v62;

    .line 15
    .line 16
    invoke-virtual {v1}, La/eg60;->e()V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, La/a5r;->e:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 20
    .line 21
    iget-object p0, p0, La/ddl0;->R1:La/a8z;

    .line 22
    .line 23
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Landroid/text/TextWatcher;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-interface {v0, p0}, La/s96;->d(Landroid/text/TextWatcher;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ddl0;->N1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ddl0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
