.class public final La/zug0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/zug0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gne0",
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
.field public static final V1:La/gne0;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:La/yzn0;

.field public final M1:La/cgx0;

.field public final N1:La/r34;

.field public final O1:La/cgx0;

.field public final P1:La/s0r;

.field public Q1:La/fiu0;

.field public R1:La/wdk0;

.field public final S1:La/kiu0;

.field public U1:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/zug0;

    .line 4
    .line 5
    const-string v2, "bundleItem"

    .line 6
    .line 7
    const-string v3, "getBundleItem()Lorg/xplatform/bethistory/domain/model/HistoryItemModel;"

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
    const-string v3, "bundleAutoSale"

    .line 16
    .line 17
    const-string v5, "getBundleAutoSale()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "bundleBalanceId"

    .line 25
    .line 26
    const-string v6, "getBundleBalanceId()J"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "bundleUpdateHistoryOnExit"

    .line 34
    .line 35
    const-string v7, "getBundleUpdateHistoryOnExit()Z"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/j0d0;

    .line 41
    .line 42
    const-string v7, "binding"

    .line 43
    .line 44
    const-string v8, "getBinding()Lorg/xplatform/bethistory/impl/databinding/SaleFragmentBinding;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    new-array v1, v1, [La/iiy;

    .line 51
    .line 52
    aput-object v0, v1, v4

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    aput-object v2, v1, v0

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    aput-object v3, v1, v0

    .line 59
    .line 60
    const/4 v0, 0x3

    .line 61
    aput-object v5, v1, v0

    .line 62
    .line 63
    const/4 v0, 0x4

    .line 64
    aput-object v6, v1, v0

    .line 65
    .line 66
    sput-object v1, La/zug0;->W1:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/gne0;

    .line 69
    .line 70
    const/16 v1, 0xb

    .line 71
    .line 72
    invoke-direct {v0, v1}, La/gne0;-><init>(B)V

    .line 73
    .line 74
    .line 75
    sput-object v0, La/zug0;->V1:La/gne0;

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d054e

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
    iput-object v0, p0, La/zug0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/yzn0;

    .line 12
    .line 13
    const-string v1, "BUNDLE_BET_HISTORY_ITEM"

    .line 14
    .line 15
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/zug0;->L1:La/yzn0;

    .line 19
    .line 20
    new-instance v0, La/cgx0;

    .line 21
    .line 22
    const-string v1, "BUNDLE_AUTO_SALE"

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, La/zug0;->M1:La/cgx0;

    .line 28
    .line 29
    new-instance v0, La/r34;

    .line 30
    .line 31
    const-string v1, "BUNDLE_BALANCE_ID"

    .line 32
    .line 33
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, La/zug0;->N1:La/r34;

    .line 37
    .line 38
    new-instance v0, La/cgx0;

    .line 39
    .line 40
    const-string v1, "BUNDLE_UPDATE_ON_EXIT"

    .line 41
    .line 42
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, La/zug0;->O1:La/cgx0;

    .line 46
    .line 47
    sget-object v0, La/vug0;->a:La/vug0;

    .line 48
    .line 49
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/zug0;->P1:La/s0r;

    .line 54
    .line 55
    new-instance v0, La/sug0;

    .line 56
    .line 57
    const/4 v1, 0x2

    .line 58
    invoke-direct {v0, p0, v1}, La/sug0;-><init>(La/zug0;B)V

    .line 59
    .line 60
    .line 61
    new-instance v1, La/yxf0;

    .line 62
    .line 63
    const/16 v2, 0xb

    .line 64
    .line 65
    invoke-direct {v1, p0, v2}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    sget-object v2, La/wez;->b:La/wez;

    .line 69
    .line 70
    new-instance v3, La/yxf0;

    .line 71
    .line 72
    const/16 v4, 0xc

    .line 73
    .line 74
    invoke-direct {v3, v1, v4}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const-class v2, La/cxg0;

    .line 82
    .line 83
    sget-object v3, La/sre0;->a:La/tre0;

    .line 84
    .line 85
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    new-instance v3, La/fxf0;

    .line 90
    .line 91
    const/16 v4, 0xe

    .line 92
    .line 93
    invoke-direct {v3, v1, v4}, La/fxf0;-><init>(La/a8z;B)V

    .line 94
    .line 95
    .line 96
    new-instance v4, La/fxf0;

    .line 97
    .line 98
    const/16 v5, 0xf

    .line 99
    .line 100
    invoke-direct {v4, v1, v5}, La/fxf0;-><init>(La/a8z;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, p0, La/zug0;->S1:La/kiu0;

    .line 108
    .line 109
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/bvg0;->d:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p1, p1, La/bvg0;->o:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 17
    .line 18
    sget-object v0, La/zug0;->W1:[La/iiy;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    aget-object v0, v0, v1

    .line 22
    .line 23
    iget-object v2, p0, La/zug0;->M1:La/cgx0;

    .line 24
    .line 25
    invoke-virtual {v2, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    const v0, 0x7f1301a6

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const v0, 0x7f1311ac

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object p1, p1, La/bvg0;->o:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 57
    .line 58
    new-instance v0, La/sug0;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-direct {v0, p0, v2}, La/sug0;-><init>(La/zug0;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p1, p1, La/bvg0;->m:Landroid/widget/SeekBar;

    .line 72
    .line 73
    sget-object v0, La/dvh0;->b:La/dvh0;

    .line 74
    .line 75
    new-instance v3, La/xug0;

    .line 76
    .line 77
    invoke-direct {v3, p0, v0}, La/xug0;-><init>(La/zug0;La/dvh0;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iget-object p1, p1, La/bvg0;->l:Landroid/widget/SeekBar;

    .line 88
    .line 89
    sget-object v3, La/dvh0;->a:La/dvh0;

    .line 90
    .line 91
    new-instance v4, La/xug0;

    .line 92
    .line 93
    invoke-direct {v4, p0, v3}, La/xug0;-><init>(La/zug0;La/dvh0;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v4}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iget-object p1, p1, La/bvg0;->n:Landroid/widget/SeekBar;

    .line 104
    .line 105
    sget-object v4, La/dvh0;->c:La/dvh0;

    .line 106
    .line 107
    new-instance v5, La/xug0;

    .line 108
    .line 109
    invoke-direct {v5, p0, v4}, La/xug0;-><init>(La/zug0;La/dvh0;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v5}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iget-object p1, p1, La/bvg0;->c:Lcom/google/android/material/button/MaterialButton;

    .line 120
    .line 121
    new-instance v5, La/eme0;

    .line 122
    .line 123
    const/16 v6, 0x1d

    .line 124
    .line 125
    invoke-direct {v5, p0, v6}, La/eme0;-><init>(Ljava/lang/Object;B)V

    .line 126
    .line 127
    .line 128
    invoke-static {p1, v5}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 129
    .line 130
    .line 131
    new-instance p1, La/uug0;

    .line 132
    .line 133
    invoke-direct {p1, p0, v2}, La/uug0;-><init>(La/zug0;B)V

    .line 134
    .line 135
    .line 136
    const-string v5, "REQUEST_CONFIRM_SALE_DIALOG_KEY"

    .line 137
    .line 138
    invoke-static {p0, v5, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 139
    .line 140
    .line 141
    new-instance p1, La/uug0;

    .line 142
    .line 143
    invoke-direct {p1, p0, v1}, La/uug0;-><init>(La/zug0;B)V

    .line 144
    .line 145
    .line 146
    const-string v5, "REQUEST_SALE_DIALOG_KEY"

    .line 147
    .line 148
    invoke-static {p0, v5, p1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    iget-object p1, p1, La/bvg0;->m:Landroid/widget/SeekBar;

    .line 156
    .line 157
    new-instance v5, Lkotlin/Pair;

    .line 158
    .line 159
    invoke-direct {v5, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    iget-object p1, p1, La/bvg0;->l:Landroid/widget/SeekBar;

    .line 167
    .line 168
    new-instance v0, Lkotlin/Pair;

    .line 169
    .line 170
    invoke-direct {v0, v3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iget-object p1, p1, La/bvg0;->n:Landroid/widget/SeekBar;

    .line 178
    .line 179
    new-instance v3, Lkotlin/Pair;

    .line 180
    .line 181
    invoke-direct {v3, v4, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    filled-new-array {v5, v0, v3}, [Lkotlin/Pair;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {p1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    iput-object p1, p0, La/zug0;->U1:Ljava/util/Map;

    .line 193
    .line 194
    new-instance p1, La/sug0;

    .line 195
    .line 196
    invoke-direct {p1, p0, v1}, La/sug0;-><init>(La/zug0;B)V

    .line 197
    .line 198
    .line 199
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    iget-object p0, p0, La/bvg0;->h:Landroid/widget/FrameLayout;

    .line 207
    .line 208
    invoke-static {p0, v2}, La/knm0;->h(Landroid/view/View;Z)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public final C0()V
    .locals 26

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
    const-class v2, La/gug0;

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
    instance-of v4, v1, La/gug0;

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
    check-cast v3, La/gug0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v14

    .line 61
    const/4 v1, 0x0

    .line 62
    sget-object v2, La/zug0;->W1:[La/iiy;

    .line 63
    .line 64
    aget-object v1, v2, v1

    .line 65
    .line 66
    iget-object v4, v0, La/zug0;->L1:La/yzn0;

    .line 67
    .line 68
    invoke-virtual {v4, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    move-object/from16 v18, v1

    .line 73
    .line 74
    check-cast v18, La/n3w;

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    aget-object v1, v2, v1

    .line 78
    .line 79
    iget-object v4, v0, La/zug0;->M1:La/cgx0;

    .line 80
    .line 81
    invoke-virtual {v4, v0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v19

    .line 85
    const/4 v1, 0x2

    .line 86
    aget-object v1, v2, v1

    .line 87
    .line 88
    iget-object v2, v0, La/zug0;->N1:La/r34;

    .line 89
    .line 90
    invoke-virtual {v2, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object v20

    .line 94
    const-class v1, La/zug0;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v24

    .line 100
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v5, v3, La/gug0;->a:La/cad;

    .line 104
    .line 105
    iget-object v9, v3, La/gug0;->b:La/btt0;

    .line 106
    .line 107
    iget-object v10, v3, La/gug0;->c:La/knf0;

    .line 108
    .line 109
    iget-object v11, v3, La/gug0;->d:La/gst0;

    .line 110
    .line 111
    iget-object v12, v3, La/gug0;->e:La/kt2;

    .line 112
    .line 113
    iget-object v13, v3, La/gug0;->f:La/gii0;

    .line 114
    .line 115
    iget-object v15, v3, La/gug0;->g:La/duj;

    .line 116
    .line 117
    iget-object v1, v3, La/gug0;->h:La/m1e;

    .line 118
    .line 119
    iget-object v2, v3, La/gug0;->i:La/sa10;

    .line 120
    .line 121
    iget-object v7, v3, La/gug0;->m:La/wsf0;

    .line 122
    .line 123
    iget-object v8, v3, La/gug0;->l:La/ctf0;

    .line 124
    .line 125
    iget-object v6, v3, La/gug0;->j:La/iw20;

    .line 126
    .line 127
    iget-object v4, v3, La/gug0;->k:La/tnm0;

    .line 128
    .line 129
    move-object/from16 v16, v1

    .line 130
    .line 131
    iget-object v1, v3, La/gug0;->n:La/m0w;

    .line 132
    .line 133
    move-object/from16 v22, v1

    .line 134
    .line 135
    iget-object v1, v3, La/gug0;->o:La/wdk0;

    .line 136
    .line 137
    move-object/from16 v23, v1

    .line 138
    .line 139
    iget-object v1, v3, La/gug0;->p:La/au0;

    .line 140
    .line 141
    iget-object v3, v3, La/gug0;->q:La/r9u;

    .line 142
    .line 143
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-object/from16 v21, v4

    .line 177
    .line 178
    new-instance v4, La/v5i;

    .line 179
    .line 180
    move-object/from16 v25, v1

    .line 181
    .line 182
    move-object/from16 v17, v2

    .line 183
    .line 184
    invoke-direct/range {v4 .. v25}, La/v5i;-><init>(La/cad;La/iw20;La/wsf0;La/ctf0;La/btt0;La/knf0;La/gst0;La/kt2;La/gii0;La/i1w0;La/duj;La/m1e;La/sa10;La/n3w;Ljava/lang/Boolean;Ljava/lang/Long;La/tnm0;La/m0w;La/wdk0;Ljava/lang/String;La/au0;)V

    .line 185
    .line 186
    .line 187
    move-object/from16 v1, v23

    .line 188
    .line 189
    new-instance v2, La/fiu0;

    .line 190
    .line 191
    iget-object v3, v4, La/v5i;->v:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v3, La/fri;

    .line 194
    .line 195
    const-class v4, La/cxg0;

    .line 196
    .line 197
    invoke-static {v4, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-direct {v2, v3}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 202
    .line 203
    .line 204
    iput-object v2, v0, La/zug0;->Q1:La/fiu0;

    .line 205
    .line 206
    iput-object v1, v0, La/zug0;->R1:La/wdk0;

    .line 207
    .line 208
    return-void

    .line 209
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 210
    .line 211
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/zug0;->I0()La/cxg0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/cxg0;->y:La/p7m0;

    .line 6
    .line 7
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/wug0;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    invoke-direct {v1, p0, v7, v2}, La/wug0;-><init>(La/zug0;La/yje;B)V

    .line 16
    .line 17
    .line 18
    sget-object v2, La/lkz;->a:La/lkz;

    .line 19
    .line 20
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    new-instance v4, La/kmg0;

    .line 33
    .line 34
    invoke-direct {v4, v0, v2, v1, v7}, La/kmg0;-><init>(La/xae0;La/clz;La/wug0;La/yje;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, La/zug0;->I0()La/cxg0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v1, v1, La/cxg0;->A:La/qoj0;

    .line 46
    .line 47
    invoke-static {v1}, La/vtb;->M(La/mz40;)La/vae0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-instance v2, La/wug0;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-direct {v2, p0, v7, v3}, La/wug0;-><init>(La/zug0;La/yje;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    new-instance v5, La/kmg0;

    .line 70
    .line 71
    invoke-direct {v5, v1, v3, v2, v7}, La/kmg0;-><init>(La/vae0;La/clz;La/wug0;La/yje;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v4, v7, v7, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, La/zug0;->I0()La/cxg0;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iget-object v1, v1, La/cxg0;->z:La/p7m0;

    .line 82
    .line 83
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    new-instance v6, La/wug0;

    .line 88
    .line 89
    const/4 v1, 0x2

    .line 90
    invoke-direct {v6, p0, v7, v1}, La/wug0;-><init>(La/zug0;La/yje;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    new-instance v3, La/kmg0;

    .line 106
    .line 107
    const/4 v8, 0x0

    .line 108
    invoke-direct/range {v3 .. v8}, La/kmg0;-><init>(La/xae0;La/clz;La/wug0;La/yje;B)V

    .line 109
    .line 110
    .line 111
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final G0(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/Pair;

    .line 2
    .line 3
    const-string v1, "BUNDLE_BET_ID"

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance p2, Lkotlin/Pair;

    .line 13
    .line 14
    const-string v1, "REQUEST_KEY_HIDE_COUPON"

    .line 15
    .line 16
    invoke-direct {p2, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    filled-new-array {v0, p2}, [Lkotlin/Pair;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string p2, "REQUEST_KEY_SUCCESS_SALE"

    .line 28
    .line 29
    invoke-static {p1, p0, p2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final H0()La/bvg0;
    .locals 2

    .line 1
    sget-object v0, La/zug0;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/zug0;->P1:La/s0r;

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
    check-cast p0, La/bvg0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final I0()La/cxg0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zug0;->S1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cxg0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final J0(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/bvg0;->f:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    move v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v3, v1

    .line 15
    :goto_0
    invoke-virtual {v0, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iget-object p0, p0, La/bvg0;->e:Landroidx/core/widget/NestedScrollView;

    .line 23
    .line 24
    if-nez p1, :cond_1

    .line 25
    .line 26
    move v1, v2

    .line 27
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final K0(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/bvg0;->f:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/zug0;->H0()La/bvg0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object p0, p0, La/bvg0;->g:Landroid/widget/FrameLayout;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final Y()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    sget-object v1, La/zug0;->W1:[La/iiy;

    .line 3
    .line 4
    aget-object v0, v1, v0

    .line 5
    .line 6
    iget-object v2, p0, La/zug0;->O1:La/cgx0;

    .line 7
    .line 8
    invoke-virtual {v2, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, La/zug0;->L1:La/yzn0;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    aget-object v1, v1, v2

    .line 22
    .line 23
    invoke-virtual {v0, p0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/n3w;

    .line 28
    .line 29
    iget-object v0, v0, La/n3w;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, v0, v2}, La/zug0;->G0(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    :cond_0
    const/4 v0, 0x1

    .line 35
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 36
    .line 37
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zug0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
