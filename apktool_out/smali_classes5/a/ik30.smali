.class public final La/ik30;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ik30;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/atz",
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
.field public static final W1:La/atz;

.field public static final synthetic X1:[La/iiy;

.field public static final Y1:Ljava/lang/String;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:Z

.field public final M1:La/zz2;

.field public N1:La/kli;

.field public final O1:La/s0r;

.field public final P1:La/bg5;

.field public final Q1:La/kiu0;

.field public R1:Landroidx/recyclerview/widget/LinearLayoutManager;

.field public final S1:La/v62;

.field public final U1:La/bp;

.field public final V1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ik30;

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
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "viewBinding"

    .line 16
    .line 17
    const-string v5, "getViewBinding()Lorg/xplatform/special_event/impl/databinding/FragmentMedalStatisticBinding;"

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
    sput-object v3, La/ik30;->X1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/atz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/ik30;->W1:La/atz;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, La/ik30;->Y1:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d0266

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
    iput-object v0, p0, La/ik30;->K1:La/hnm0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, La/ik30;->L1:Z

    .line 13
    .line 14
    new-instance v1, La/zz2;

    .line 15
    .line 16
    const-string v2, "SPECIAL_EVENT_ID_BUNDLE_KEY"

    .line 17
    .line 18
    invoke-direct {v1, v2}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, La/ik30;->M1:La/zz2;

    .line 22
    .line 23
    sget-object v1, La/hk30;->a:La/hk30;

    .line 24
    .line 25
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, p0, La/ik30;->O1:La/s0r;

    .line 30
    .line 31
    new-instance v1, La/bg5;

    .line 32
    .line 33
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v2, La/ei20;

    .line 37
    .line 38
    const/16 v3, 0x16

    .line 39
    .line 40
    invoke-direct {v2, v3}, La/ei20;-><init>(B)V

    .line 41
    .line 42
    .line 43
    new-instance v3, La/tr20;

    .line 44
    .line 45
    const/16 v4, 0xa

    .line 46
    .line 47
    invoke-direct {v3, v4}, La/tr20;-><init>(B)V

    .line 48
    .line 49
    .line 50
    new-instance v5, La/tvx;

    .line 51
    .line 52
    const/4 v6, 0x3

    .line 53
    const/16 v7, 0x18

    .line 54
    .line 55
    invoke-direct {v5, v6, v7}, La/tvx;-><init>(IB)V

    .line 56
    .line 57
    .line 58
    sget-object v6, La/gvy;->z:La/gvy;

    .line 59
    .line 60
    new-instance v7, La/gbn;

    .line 61
    .line 62
    invoke-direct {v7, v2, v5, v3, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 63
    .line 64
    .line 65
    iget-object v2, v1, La/zz3;->d:La/dp;

    .line 66
    .line 67
    invoke-virtual {v2, v7}, La/dp;->b(La/gbn;)V

    .line 68
    .line 69
    .line 70
    iput-object v1, p0, La/ik30;->P1:La/bg5;

    .line 71
    .line 72
    new-instance v1, La/gk30;

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-direct {v1, p0, v2}, La/gk30;-><init>(La/ik30;B)V

    .line 76
    .line 77
    .line 78
    new-instance v2, La/pv10;

    .line 79
    .line 80
    const/16 v3, 0x13

    .line 81
    .line 82
    invoke-direct {v2, p0, v3}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 83
    .line 84
    .line 85
    sget-object v3, La/wez;->b:La/wez;

    .line 86
    .line 87
    new-instance v5, La/pv10;

    .line 88
    .line 89
    const/16 v6, 0x14

    .line 90
    .line 91
    invoke-direct {v5, v2, v6}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {v3, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    const-class v3, La/zk30;

    .line 99
    .line 100
    sget-object v5, La/sre0;->a:La/tre0;

    .line 101
    .line 102
    invoke-virtual {v5, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    new-instance v5, La/y620;

    .line 107
    .line 108
    invoke-direct {v5, v2, v4}, La/y620;-><init>(La/a8z;B)V

    .line 109
    .line 110
    .line 111
    new-instance v4, La/y620;

    .line 112
    .line 113
    const/16 v6, 0xb

    .line 114
    .line 115
    invoke-direct {v4, v2, v6}, La/y620;-><init>(La/a8z;B)V

    .line 116
    .line 117
    .line 118
    invoke-static {p0, v3, v5, v4, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iput-object v1, p0, La/ik30;->Q1:La/kiu0;

    .line 123
    .line 124
    new-instance v1, La/v62;

    .line 125
    .line 126
    const/16 v2, 0xc

    .line 127
    .line 128
    invoke-direct {v1, p0, v2}, La/v62;-><init>(Ljava/lang/Object;B)V

    .line 129
    .line 130
    .line 131
    iput-object v1, p0, La/ik30;->S1:La/v62;

    .line 132
    .line 133
    new-instance v1, La/bp;

    .line 134
    .line 135
    new-instance v2, La/fk30;

    .line 136
    .line 137
    invoke-direct {v2, p0, v0}, La/fk30;-><init>(La/ik30;B)V

    .line 138
    .line 139
    .line 140
    new-instance v3, La/p0z;

    .line 141
    .line 142
    const/16 v4, 0xe

    .line 143
    .line 144
    invoke-direct {v3, p0, v4}, La/p0z;-><init>(Ljava/lang/Object;B)V

    .line 145
    .line 146
    .line 147
    invoke-direct {v1, v2, v3, v6}, La/bp;-><init>(Lkotlin/jvm/functions/Function2;La/p0z;I)V

    .line 148
    .line 149
    .line 150
    iput-object v1, p0, La/ik30;->U1:La/bp;

    .line 151
    .line 152
    new-instance v1, La/gk30;

    .line 153
    .line 154
    invoke-direct {v1, p0, v0}, La/gk30;-><init>(La/ik30;B)V

    .line 155
    .line 156
    .line 157
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iput-object v0, p0, La/ik30;->V1:La/n0o0;

    .line 162
    .line 163
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, La/gc50;

    .line 9
    .line 10
    sget-object v4, La/ic50;->b:La/ic50;

    .line 11
    .line 12
    new-instance v6, La/gj30;

    .line 13
    .line 14
    const/4 v3, 0x4

    .line 15
    invoke-direct {v6, v3}, La/gj30;-><init>(B)V

    .line 16
    .line 17
    .line 18
    const/16 v7, 0x3f0

    .line 19
    .line 20
    const-string v3, "SEARCH_NAV_ITEM_KEY"

    .line 21
    .line 22
    const v5, 0x7f0809ee

    .line 23
    .line 24
    .line 25
    invoke-direct/range {v2 .. v7}, La/gc50;-><init>(Ljava/lang/String;La/ic50;ILkotlin/jvm/functions/Function0;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    new-instance v3, La/gc50;

    .line 32
    .line 33
    new-instance v5, La/o0t;

    .line 34
    .line 35
    invoke-virtual {v0}, La/ik30;->H0()La/zk30;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    const/4 v11, 0x0

    .line 40
    const/16 v12, 0x1b

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    const-class v16, La/zk30;

    .line 44
    .line 45
    const-string v9, "onDisciplineFilterClick"

    .line 46
    .line 47
    const-string v10, "onDisciplineFilterClick()V"

    .line 48
    .line 49
    move-object/from16 v8, v16

    .line 50
    .line 51
    invoke-direct/range {v5 .. v12}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 52
    .line 53
    .line 54
    const/16 v8, 0x7f0

    .line 55
    .line 56
    move-object v7, v5

    .line 57
    move-object v5, v4

    .line 58
    const-string v4, "FILTER_NAV_ITEM_ID"

    .line 59
    .line 60
    const v6, 0x7f080911

    .line 61
    .line 62
    .line 63
    invoke-direct/range {v3 .. v8}, La/gc50;-><init>(Ljava/lang/String;La/ic50;ILkotlin/jvm/functions/Function0;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, La/ik30;->G0()La/a2r;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iget-object v2, v2, La/a2r;->g:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 74
    .line 75
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const v4, 0x7f1311c2

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setSearchHint(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 93
    .line 94
    .line 95
    new-instance v13, La/o0t;

    .line 96
    .line 97
    invoke-virtual {v0}, La/ik30;->H0()La/zk30;

    .line 98
    .line 99
    .line 100
    move-result-object v15

    .line 101
    const/16 v19, 0x0

    .line 102
    .line 103
    const/16 v20, 0x19

    .line 104
    .line 105
    const/4 v14, 0x0

    .line 106
    const-string v17, "onSearchClick"

    .line 107
    .line 108
    const-string v18, "onSearchClick()V"

    .line 109
    .line 110
    invoke-direct/range {v13 .. v20}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 111
    .line 112
    .line 113
    iget-object v1, v2, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 114
    .line 115
    if-eqz v1, :cond_0

    .line 116
    .line 117
    invoke-interface {v1, v13}, La/s96;->h(Lkotlin/jvm/functions/Function0;)V

    .line 118
    .line 119
    .line 120
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    const v3, 0x7f040b0b

    .line 128
    .line 129
    .line 130
    invoke-static {v3, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->setNavigationBarButtonsColorStateList(Landroid/content/res/ColorStateList;)V

    .line 139
    .line 140
    .line 141
    new-instance v13, La/o0t;

    .line 142
    .line 143
    invoke-virtual {v0}, La/ik30;->H0()La/zk30;

    .line 144
    .line 145
    .line 146
    move-result-object v15

    .line 147
    const/16 v19, 0x0

    .line 148
    .line 149
    const/16 v20, 0x1a

    .line 150
    .line 151
    const/4 v14, 0x0

    .line 152
    const-string v17, "onBackPressed"

    .line 153
    .line 154
    const-string v18, "onBackPressed()V"

    .line 155
    .line 156
    invoke-direct/range {v13 .. v20}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v13}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 160
    .line 161
    .line 162
    iget-object v1, v0, La/ik30;->V1:La/n0o0;

    .line 163
    .line 164
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, Landroid/text/TextWatcher;

    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    iget-object v2, v2, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 174
    .line 175
    if-eqz v2, :cond_1

    .line 176
    .line 177
    invoke-interface {v2, v1}, La/s96;->f(Landroid/text/TextWatcher;)V

    .line 178
    .line 179
    .line 180
    :cond_1
    invoke-virtual {v0}, La/ik30;->G0()La/a2r;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    iget-object v1, v1, La/a2r;->f:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 185
    .line 186
    new-instance v2, La/viq;

    .line 187
    .line 188
    const/16 v3, 0x14

    .line 189
    .line 190
    invoke-direct {v2, v0, v3}, La/viq;-><init>(Ljava/lang/Object;B)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(La/zon0;)V

    .line 194
    .line 195
    .line 196
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 197
    .line 198
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    const/4 v3, 0x1

    .line 203
    const/4 v4, 0x0

    .line 204
    invoke-direct {v1, v2, v3, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 205
    .line 206
    .line 207
    iput-object v1, v0, La/ik30;->R1:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 208
    .line 209
    iget-object v1, v0, La/ik30;->U1:La/bp;

    .line 210
    .line 211
    iget-object v2, v0, La/ik30;->P1:La/bg5;

    .line 212
    .line 213
    invoke-virtual {v2, v1}, La/yge0;->v(La/ahe0;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, La/ik30;->G0()La/a2r;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    iget-object v1, v1, La/a2r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 221
    .line 222
    iget-object v5, v0, La/ik30;->R1:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 223
    .line 224
    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, La/ik30;->G0()La/a2r;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    iget-object v1, v1, La/a2r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 232
    .line 233
    const/4 v5, 0x0

    .line 234
    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, La/ik30;->G0()La/a2r;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    iget-object v1, v1, La/a2r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 242
    .line 243
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, La/ik30;->G0()La/a2r;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    iget-object v1, v1, La/a2r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 251
    .line 252
    invoke-static {v1, v3, v3}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 253
    .line 254
    .line 255
    new-instance v1, La/fk30;

    .line 256
    .line 257
    invoke-direct {v1, v0, v4}, La/fk30;-><init>(La/ik30;B)V

    .line 258
    .line 259
    .line 260
    const-string v2, "KEY_PICKER_SELECTED_DISCIPLINE_REQUEST"

    .line 261
    .line 262
    invoke-static {v0, v2, v1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 263
    .line 264
    .line 265
    return-void
.end method

.method public final C0()V
    .locals 15

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
    const-class v1, La/ek30;

    .line 22
    .line 23
    if-eqz v0, :cond_3

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
    instance-of v3, v0, La/ek30;

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
    check-cast v2, La/ek30;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/ik30;->X1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/ik30;->M1:La/zz2;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    const-class v0, La/ik30;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object v4, v2, La/ek30;->a:La/cad;

    .line 80
    .line 81
    iget-object v9, v2, La/ek30;->b:La/knf0;

    .line 82
    .line 83
    iget-object v10, v2, La/ek30;->c:La/gii0;

    .line 84
    .line 85
    iget-object v0, v2, La/ek30;->d:La/ctf0;

    .line 86
    .line 87
    iget-object v11, v2, La/ek30;->e:La/g2v;

    .line 88
    .line 89
    iget-object v13, v2, La/ek30;->g:La/ygm0;

    .line 90
    .line 91
    iget-object v12, v2, La/ek30;->f:La/m1e;

    .line 92
    .line 93
    iget-object v5, v2, La/ek30;->h:La/d1p;

    .line 94
    .line 95
    iget-object v14, v2, La/ek30;->i:La/yo4;

    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v3, La/daf;

    .line 116
    .line 117
    invoke-direct/range {v3 .. v14}, La/daf;-><init>(La/cad;La/d1p;Ljava/lang/String;La/i1w0;Ljava/lang/Integer;La/knf0;La/gii0;La/g2v;La/m1e;La/ygm0;La/yo4;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, v3, La/daf;->m:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, La/n5d0;

    .line 123
    .line 124
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, La/kli;

    .line 129
    .line 130
    iput-object v0, p0, La/ik30;->N1:La/kli;

    .line 131
    .line 132
    return-void

    .line 133
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 134
    .line 135
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final D0()V
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, La/ik30;->H0()La/zk30;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/zk30;->n:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/wk30;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v0, v2}, La/wk30;-><init>(La/gmq;B)V

    .line 11
    .line 12
    .line 13
    new-instance v3, La/vf20;

    .line 14
    .line 15
    const/4 v9, 0x4

    .line 16
    const/4 v10, 0x2

    .line 17
    const/4 v4, 0x2

    .line 18
    const-class v6, La/ik30;

    .line 19
    .line 20
    const-string v7, "handleUiState"

    .line 21
    .line 22
    const-string v8, "handleUiState(Lorg/xplatform/special_event/impl/medal_statistic/presentation/MedalStatisticUiStateModel;)V"

    .line 23
    .line 24
    move-object/from16 v5, p0

    .line 25
    .line 26
    invoke-direct/range {v3 .. v10}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 27
    .line 28
    .line 29
    sget-object v0, La/lkz;->a:La/lkz;

    .line 30
    .line 31
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v4, La/mw20;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-direct {v4, v1, v0, v3, v5}, La/mw20;-><init>(La/wk30;La/clz;La/vf20;La/yje;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x3

    .line 50
    invoke-static {v2, v5, v5, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 51
    .line 52
    .line 53
    invoke-virtual/range {p0 .. p0}, La/ik30;->H0()La/zk30;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v1, v1, La/zk30;->o:La/p7m0;

    .line 58
    .line 59
    new-instance v11, La/vf20;

    .line 60
    .line 61
    const/16 v17, 0x4

    .line 62
    .line 63
    const/16 v18, 0x3

    .line 64
    .line 65
    const/4 v12, 0x2

    .line 66
    const-string v15, "handleSingleEvents"

    .line 67
    .line 68
    const-string v16, "handleSingleEvents(Lorg/xplatform/special_event/impl/medal_statistic/presentation/SingleEvent;)V"

    .line 69
    .line 70
    move-object/from16 v13, p0

    .line 71
    .line 72
    move-object v14, v6

    .line 73
    invoke-direct/range {v11 .. v18}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 74
    .line 75
    .line 76
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-interface {v2}, La/clz;->x()La/glz;

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
    new-instance v4, La/mw20;

    .line 89
    .line 90
    invoke-direct {v4, v1, v2, v11, v5}, La/mw20;-><init>(La/gmq;La/clz;La/vf20;La/yje;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v3, v5, v5, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final G0()La/a2r;
    .locals 2

    .line 1
    sget-object v0, La/ik30;->X1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ik30;->O1:La/s0r;

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
    check-cast p0, La/a2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/zk30;
    .locals 0

    .line 1
    iget-object p0, p0, La/ik30;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/zk30;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ik30;->G0()La/a2r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/a2r;->c:La/vr9;

    .line 6
    .line 7
    iget-object v0, v0, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/ik30;->G0()La/a2r;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-object p0, p0, La/a2r;->c:La/vr9;

    .line 19
    .line 20
    iget-object p0, p0, La/vr9;->b:Landroid/widget/LinearLayout;

    .line 21
    .line 22
    invoke-static {p0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final J0(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/ik30;->G0()La/a2r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/a2r;->g:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 6
    .line 7
    iget-object v0, v0, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const-string v2, "FILTER_NAV_ITEM_ID"

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0, v2}, La/s96;->b(Ljava/lang/String;)La/ukm;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v1

    .line 20
    :goto_0
    if-eqz v0, :cond_1

    .line 21
    .line 22
    xor-int/lit8 v3, p1, 0x1

    .line 23
    .line 24
    invoke-virtual {v0, v3}, La/ukm;->setNavigationBarButtonAlpha(Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, La/ik30;->G0()La/a2r;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v0, v0, La/a2r;->g:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 32
    .line 33
    iget-object v0, v0, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-interface {v0, v2}, La/s96;->b(Ljava/lang/String;)La/ukm;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move-object v0, v1

    .line 43
    :goto_1
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0, p1}, La/ukm;->setNavigationBarButtonEnable(Z)V

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-virtual {p0}, La/ik30;->G0()La/a2r;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, La/a2r;->g:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 53
    .line 54
    iget-object v0, v0, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 55
    .line 56
    const-string v2, "SEARCH_NAV_ITEM_KEY"

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-interface {v0, v2}, La/s96;->b(Ljava/lang/String;)La/ukm;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    goto :goto_2

    .line 65
    :cond_4
    move-object v0, v1

    .line 66
    :goto_2
    if-eqz v0, :cond_5

    .line 67
    .line 68
    xor-int/lit8 v3, p1, 0x1

    .line 69
    .line 70
    invoke-virtual {v0, v3}, La/ukm;->setNavigationBarButtonAlpha(Z)V

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p0}, La/ik30;->G0()La/a2r;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    iget-object p0, p0, La/a2r;->g:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 78
    .line 79
    iget-object p0, p0, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 80
    .line 81
    if-eqz p0, :cond_6

    .line 82
    .line 83
    invoke-interface {p0, v2}, La/s96;->b(Ljava/lang/String;)La/ukm;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    :cond_6
    if-eqz v1, :cond_7

    .line 88
    .line 89
    invoke-virtual {v1, p1}, La/ukm;->setNavigationBarButtonEnable(Z)V

    .line 90
    .line 91
    .line 92
    :cond_7
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    iget-object v0, p0, La/ik30;->P1:La/bg5;

    .line 2
    .line 3
    iget-object v1, p0, La/ik30;->U1:La/bp;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, La/yge0;->y(La/ahe0;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/ik30;->G0()La/a2r;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, La/a2r;->g:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 13
    .line 14
    iget-object v1, p0, La/ik30;->V1:La/n0o0;

    .line 15
    .line 16
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroid/text/TextWatcher;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b:La/s96;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-interface {v0, v1}, La/s96;->d(Landroid/text/TextWatcher;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-super {p0}, La/yx5;->Z()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object p0, p0, La/ik30;->S1:La/v62;

    .line 5
    .line 6
    invoke-virtual {p0}, La/eg60;->e()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, La/agd;->k()La/jg60;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object p0, p0, La/ik30;->S1:La/v62;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, La/jg60;->b(La/eg60;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ik30;->L1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ik30;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
