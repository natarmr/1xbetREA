.class public final La/s1w;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/ygt0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/s1w;",
        "La/yx5;",
        "La/ygt0;",
        "<init>",
        "()V",
        "a/bst",
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
.field public static final d2:La/bst;

.field public static final synthetic e2:[La/iiy;

.field public static final f2:Ljava/lang/String;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/qii;

.field public M1:La/ii;

.field public N1:La/wdk0;

.field public O1:La/ynb;

.field public final P1:La/kiu0;

.field public Q1:La/c4m0;

.field public final R1:La/r34;

.field public final S1:La/r34;

.field public final U1:La/yzn0;

.field public final V1:La/yzn0;

.field public final W1:La/phf0;

.field public final X1:La/phf0;

.field public final Y1:La/a8z;

.field public final Z1:La/ywq;

.field public final a2:La/n0o0;

.field public final b2:La/a8z;

.field public final c2:Z


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/s1w;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bethistory/impl/databinding/HistoryFragmentBinding;"

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
    const-string v3, "bundleBetId"

    .line 16
    .line 17
    const-string v5, "getBundleBetId()J"

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
    const-string v6, "bundleType"

    .line 34
    .line 35
    const-string v7, "getBundleType()Lorg/xplatform/bethistory/domain/model/BetHistoryTypeModel;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "typeHistoryScreen"

    .line 43
    .line 44
    const-string v8, "getTypeHistoryScreen()Lorg/xplatform/bethistory/domain/model/TypeHistoryScreen;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/ez40;

    .line 50
    .line 51
    const-string v8, "globalChampId"

    .line 52
    .line 53
    const-string v9, "getGlobalChampId()Ljava/lang/String;"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    new-instance v8, La/ez40;

    .line 59
    .line 60
    const-string v9, "globalChampTitle"

    .line 61
    .line 62
    const-string v10, "getGlobalChampTitle()Ljava/lang/String;"

    .line 63
    .line 64
    invoke-direct {v8, v1, v9, v10, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    const/4 v9, 0x7

    .line 68
    new-array v9, v9, [La/iiy;

    .line 69
    .line 70
    aput-object v0, v9, v4

    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    aput-object v2, v9, v0

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    aput-object v3, v9, v0

    .line 77
    .line 78
    const/4 v0, 0x3

    .line 79
    aput-object v5, v9, v0

    .line 80
    .line 81
    const/4 v0, 0x4

    .line 82
    aput-object v6, v9, v0

    .line 83
    .line 84
    const/4 v0, 0x5

    .line 85
    aput-object v7, v9, v0

    .line 86
    .line 87
    const/4 v0, 0x6

    .line 88
    aput-object v8, v9, v0

    .line 89
    .line 90
    sput-object v9, La/s1w;->e2:[La/iiy;

    .line 91
    .line 92
    new-instance v0, La/bst;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    sput-object v0, La/s1w;->d2:La/bst;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    sput-object v0, La/s1w;->f2:Ljava/lang/String;

    .line 104
    .line 105
    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 1
    const v0, 0x7f0d0332

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/p1w;->a:La/p1w;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/s1w;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/n1w;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, v1}, La/n1w;-><init>(La/s1w;B)V

    .line 19
    .line 20
    .line 21
    new-instance v1, La/t7t;

    .line 22
    .line 23
    const/16 v2, 0x18

    .line 24
    .line 25
    invoke-direct {v1, p0, v2}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    sget-object v3, La/wez;->b:La/wez;

    .line 29
    .line 30
    new-instance v4, La/t7t;

    .line 31
    .line 32
    const/16 v5, 0x19

    .line 33
    .line 34
    invoke-direct {v4, v1, v5}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-class v4, La/naw;

    .line 42
    .line 43
    sget-object v5, La/sre0;->a:La/tre0;

    .line 44
    .line 45
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    new-instance v5, La/qwv;

    .line 50
    .line 51
    const/16 v6, 0x8

    .line 52
    .line 53
    invoke-direct {v5, v1, v6}, La/qwv;-><init>(La/a8z;B)V

    .line 54
    .line 55
    .line 56
    new-instance v7, La/qwv;

    .line 57
    .line 58
    const/16 v8, 0x9

    .line 59
    .line 60
    invoke-direct {v7, v1, v8}, La/qwv;-><init>(La/a8z;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0, v4, v5, v7, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/s1w;->P1:La/kiu0;

    .line 68
    .line 69
    new-instance v0, La/r34;

    .line 70
    .line 71
    const-string v1, "BUNDLE_BET_ID"

    .line 72
    .line 73
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, La/s1w;->R1:La/r34;

    .line 77
    .line 78
    new-instance v0, La/r34;

    .line 79
    .line 80
    const-string v1, "BUNDLE_BALANCE_ID"

    .line 81
    .line 82
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, La/s1w;->S1:La/r34;

    .line 86
    .line 87
    new-instance v0, La/yzn0;

    .line 88
    .line 89
    const-string v1, "BUNDLE_TYPE"

    .line 90
    .line 91
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iput-object v0, p0, La/s1w;->U1:La/yzn0;

    .line 95
    .line 96
    new-instance v0, La/yzn0;

    .line 97
    .line 98
    const-string v1, "TYPE_HISTORY_SCREEN"

    .line 99
    .line 100
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iput-object v0, p0, La/s1w;->V1:La/yzn0;

    .line 104
    .line 105
    new-instance v0, La/phf0;

    .line 106
    .line 107
    const-string v1, "BUNDLE_CHAMP_ID"

    .line 108
    .line 109
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, La/s1w;->W1:La/phf0;

    .line 113
    .line 114
    new-instance v0, La/phf0;

    .line 115
    .line 116
    const-string v1, "BUNDLE_CHAMP_TITLE"

    .line 117
    .line 118
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iput-object v0, p0, La/s1w;->X1:La/phf0;

    .line 122
    .line 123
    new-instance v0, La/ldv;

    .line 124
    .line 125
    invoke-direct {v0, v2}, La/ldv;-><init>(B)V

    .line 126
    .line 127
    .line 128
    invoke-static {v3, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iput-object v0, p0, La/s1w;->Y1:La/a8z;

    .line 133
    .line 134
    new-instance v0, La/xn;

    .line 135
    .line 136
    const/4 v1, 0x7

    .line 137
    invoke-direct {v0, v1}, La/xn;-><init>(B)V

    .line 138
    .line 139
    .line 140
    new-instance v1, La/yl3;

    .line 141
    .line 142
    const/16 v2, 0xa

    .line 143
    .line 144
    invoke-direct {v1, p0, v2}, La/yl3;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iput-object v0, p0, La/s1w;->Z1:La/ywq;

    .line 152
    .line 153
    new-instance v0, La/n1w;

    .line 154
    .line 155
    invoke-direct {v0, p0, v6}, La/n1w;-><init>(La/s1w;B)V

    .line 156
    .line 157
    .line 158
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iput-object v0, p0, La/s1w;->a2:La/n0o0;

    .line 163
    .line 164
    new-instance v0, La/n1w;

    .line 165
    .line 166
    invoke-direct {v0, p0, v8}, La/n1w;-><init>(La/s1w;B)V

    .line 167
    .line 168
    .line 169
    invoke-static {v3, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    iput-object v0, p0, La/s1w;->b2:La/a8z;

    .line 174
    .line 175
    const/4 v0, 0x1

    .line 176
    iput-boolean v0, p0, La/s1w;->c2:Z

    .line 177
    .line 178
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/s1w;->M0()La/naw;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    iget-object v1, v3, La/naw;->X:La/r4v;

    .line 8
    .line 9
    iget-object v1, v1, La/r4v;->a:La/gst0;

    .line 10
    .line 11
    iget-object v1, v1, La/gst0;->a:La/rrt0;

    .line 12
    .line 13
    iget-object v1, v1, La/rrt0;->c:La/p7m0;

    .line 14
    .line 15
    new-instance v2, La/r8w;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v9, 0x3

    .line 19
    invoke-direct {v2, v3, v4, v9}, La/r8w;-><init>(La/naw;La/yje;B)V

    .line 20
    .line 21
    .line 22
    new-instance v10, La/fnq;

    .line 23
    .line 24
    const/4 v11, 0x4

    .line 25
    invoke-direct {v10, v1, v2, v11}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, v3, La/naw;->L:La/mne;

    .line 33
    .line 34
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 35
    .line 36
    invoke-static {v1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 37
    .line 38
    .line 39
    move-result-object v12

    .line 40
    new-instance v1, La/pfl;

    .line 41
    .line 42
    const/4 v7, 0x4

    .line 43
    const/16 v8, 0x18

    .line 44
    .line 45
    const/4 v2, 0x2

    .line 46
    const-class v4, La/naw;

    .line 47
    .line 48
    const-string v5, "handleError"

    .line 49
    .line 50
    const-string v6, "handleError(Ljava/lang/Throwable;)V"

    .line 51
    .line 52
    invoke-direct/range {v1 .. v8}, La/pfl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 53
    .line 54
    .line 55
    invoke-static {v10, v12, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, La/naw;->w()V

    .line 59
    .line 60
    .line 61
    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->h1:Z

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    if-eq v1, v2, :cond_0

    .line 65
    .line 66
    iput-boolean v2, v0, Landroidx/fragment/app/Fragment;->h1:Z

    .line 67
    .line 68
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->O()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_0

    .line 79
    .line 80
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->w:La/jxq;

    .line 81
    .line 82
    iget-object v1, v1, La/jxq;->e:La/kxq;

    .line 83
    .line 84
    invoke-virtual {v1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 85
    .line 86
    .line 87
    :cond_0
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v1, v1, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 92
    .line 93
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const v4, 0x7f040b0b

    .line 101
    .line 102
    .line 103
    invoke-static {v4, v3}, La/m5d;->b(ILandroid/content/Context;)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setBackIconColor(Landroid/content/res/ColorStateList;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-static {v4, v3}, La/m5d;->b(ILandroid/content/Context;)I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtonsColorStateList(Landroid/content/res/ColorStateList;)V

    .line 133
    .line 134
    .line 135
    new-instance v3, La/n1w;

    .line 136
    .line 137
    const/16 v5, 0xb

    .line 138
    .line 139
    invoke-direct {v3, v0, v5}, La/n1w;-><init>(La/s1w;B)V

    .line 140
    .line 141
    .line 142
    invoke-static {v1, v3}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    iget-object v3, v3, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 150
    .line 151
    const/4 v6, 0x0

    .line 152
    invoke-virtual {v3, v6}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitleIconVisible(Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, La/s1w;->L0()La/sys0;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    const/4 v7, 0x2

    .line 164
    if-eqz v3, :cond_2

    .line 165
    .line 166
    if-eq v3, v7, :cond_1

    .line 167
    .line 168
    const-string v3, ""

    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    const v8, 0x7f13132d

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    goto :goto_0

    .line 183
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    const v8, 0x7f130247

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    :goto_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 198
    .line 199
    .line 200
    new-instance v12, La/hc50;

    .line 201
    .line 202
    sget-object v14, La/ybg0;->a:La/ybg0;

    .line 203
    .line 204
    new-instance v3, La/n1w;

    .line 205
    .line 206
    const/16 v8, 0xc

    .line 207
    .line 208
    invoke-direct {v3, v0, v8}, La/n1w;-><init>(La/s1w;B)V

    .line 209
    .line 210
    .line 211
    const/16 v17, 0x7f0

    .line 212
    .line 213
    const-string v13, "MENU_FILTER_BUTTON"

    .line 214
    .line 215
    const v15, 0x7f0807a1

    .line 216
    .line 217
    .line 218
    move-object/from16 v16, v3

    .line 219
    .line 220
    invoke-direct/range {v12 .. v17}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 221
    .line 222
    .line 223
    new-instance v13, La/hc50;

    .line 224
    .line 225
    new-instance v3, La/n1w;

    .line 226
    .line 227
    const/16 v10, 0xd

    .line 228
    .line 229
    invoke-direct {v3, v0, v10}, La/n1w;-><init>(La/s1w;B)V

    .line 230
    .line 231
    .line 232
    const/16 v18, 0x7f0

    .line 233
    .line 234
    move-object v15, v14

    .line 235
    const-string v14, "MENU_COMPACT_BUTTON"

    .line 236
    .line 237
    const v16, 0x7f080a69

    .line 238
    .line 239
    .line 240
    move-object/from16 v17, v3

    .line 241
    .line 242
    invoke-direct/range {v13 .. v18}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 243
    .line 244
    .line 245
    filled-new-array {v12, v13}, [La/hc50;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-static {v3}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    iget-object v1, v1, La/t1w;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 261
    .line 262
    sget-object v3, La/ymx;->h:La/ymx;

    .line 263
    .line 264
    new-instance v10, La/m1w;

    .line 265
    .line 266
    invoke-direct {v10, v0, v7}, La/m1w;-><init>(La/s1w;B)V

    .line 267
    .line 268
    .line 269
    invoke-static {v1, v3, v10}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    iget-object v1, v1, La/t1w;->c:Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;

    .line 277
    .line 278
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;->getAuthorizationButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    sget-object v3, La/ymx;->e:La/ymx;

    .line 283
    .line 284
    new-instance v10, La/m1w;

    .line 285
    .line 286
    invoke-direct {v10, v0, v9}, La/m1w;-><init>(La/s1w;B)V

    .line 287
    .line 288
    .line 289
    invoke-static {v1, v3, v10}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    iget-object v1, v1, La/t1w;->c:Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;

    .line 297
    .line 298
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;->getRegistrationButton()Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    new-instance v10, La/m1w;

    .line 303
    .line 304
    invoke-direct {v10, v0, v11}, La/m1w;-><init>(La/s1w;B)V

    .line 305
    .line 306
    .line 307
    invoke-static {v1, v3, v10}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    iget-object v1, v1, La/t1w;->k:Landroid/widget/LinearLayout;

    .line 315
    .line 316
    new-instance v3, La/m1w;

    .line 317
    .line 318
    const/4 v10, 0x5

    .line 319
    invoke-direct {v3, v0, v10}, La/m1w;-><init>(La/s1w;B)V

    .line 320
    .line 321
    .line 322
    invoke-static {v1, v3}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    iget-object v1, v1, La/t1w;->m:Landroid/widget/LinearLayout;

    .line 330
    .line 331
    new-instance v3, La/m1w;

    .line 332
    .line 333
    const/4 v12, 0x6

    .line 334
    invoke-direct {v3, v0, v12}, La/m1w;-><init>(La/s1w;B)V

    .line 335
    .line 336
    .line 337
    invoke-static {v1, v3}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    iget-object v1, v1, La/t1w;->l:Landroid/widget/LinearLayout;

    .line 345
    .line 346
    sget-object v3, La/ymx;->j:La/ymx;

    .line 347
    .line 348
    new-instance v13, La/m1w;

    .line 349
    .line 350
    const/4 v14, 0x7

    .line 351
    invoke-direct {v13, v0, v14}, La/m1w;-><init>(La/s1w;B)V

    .line 352
    .line 353
    .line 354
    invoke-static {v1, v3, v13}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    iget-object v1, v1, La/t1w;->p:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 362
    .line 363
    sget-object v3, La/j5d;->a:Landroid/util/TypedValue;

    .line 364
    .line 365
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    invoke-static {v3, v4, v6}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    filled-new-array {v3}, [I

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-virtual {v1, v3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeColors([I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    iget-object v1, v1, La/t1w;->p:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 385
    .line 386
    new-instance v3, La/l1w;

    .line 387
    .line 388
    invoke-direct {v3, v0, v2}, La/l1w;-><init>(La/s1w;B)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v1, v3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(La/zon0;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    iget-object v1, v1, La/t1w;->p:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 399
    .line 400
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    const/high16 v4, 0x42800000    # 64.0f

    .line 412
    .line 413
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 414
    .line 415
    mul-float/2addr v4, v3

    .line 416
    float-to-int v3, v4

    .line 417
    neg-int v4, v3

    .line 418
    div-int/2addr v3, v7

    .line 419
    iput v4, v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->w:I

    .line 420
    .line 421
    iput v3, v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->x:I

    .line 422
    .line 423
    iput-boolean v2, v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->j1:Z

    .line 424
    .line 425
    invoke-virtual {v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->l()V

    .line 426
    .line 427
    .line 428
    iput-boolean v6, v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->c:Z

    .line 429
    .line 430
    invoke-virtual {v0}, La/s1w;->J0()La/r5w;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    new-instance v3, La/m1w;

    .line 435
    .line 436
    invoke-direct {v3, v0, v5}, La/m1w;-><init>(La/s1w;B)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v1, v3}, La/gl80;->z(Lkotlin/jvm/functions/Function1;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0}, La/s1w;->I0()La/t1w;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    iget-object v1, v1, La/t1w;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 447
    .line 448
    iget-object v3, v0, La/s1w;->b2:La/a8z;

    .line 449
    .line 450
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    check-cast v3, La/oqd;

    .line 455
    .line 456
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 457
    .line 458
    .line 459
    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 460
    .line 461
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 462
    .line 463
    .line 464
    move-result-object v4

    .line 465
    invoke-direct {v3, v4, v2, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    const v4, 0x7f0706e0

    .line 476
    .line 477
    .line 478
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 479
    .line 480
    .line 481
    move-result v16

    .line 482
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    const v5, 0x7f07072d

    .line 487
    .line 488
    .line 489
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 490
    .line 491
    .line 492
    move-result v18

    .line 493
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 498
    .line 499
    .line 500
    move-result v17

    .line 501
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 506
    .line 507
    .line 508
    move-result v19

    .line 509
    new-instance v15, La/qmk0;

    .line 510
    .line 511
    const/16 v23, 0x0

    .line 512
    .line 513
    const/16 v24, 0x1d0

    .line 514
    .line 515
    const/16 v20, 0x0

    .line 516
    .line 517
    const/16 v21, 0x1

    .line 518
    .line 519
    const/16 v22, 0x0

    .line 520
    .line 521
    invoke-direct/range {v15 .. v24}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v1, v15}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    new-instance v3, La/l1w;

    .line 532
    .line 533
    invoke-direct {v3, v0, v7}, La/l1w;-><init>(La/s1w;B)V

    .line 534
    .line 535
    .line 536
    const-string v4, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY"

    .line 537
    .line 538
    invoke-virtual {v1, v4, v0, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 539
    .line 540
    .line 541
    new-instance v1, La/m1w;

    .line 542
    .line 543
    const/16 v3, 0x9

    .line 544
    .line 545
    invoke-direct {v1, v0, v3}, La/m1w;-><init>(La/s1w;B)V

    .line 546
    .line 547
    .line 548
    const-string v3, "REQUEST_CHANGE_BALANCE_DIALOG_KEY"

    .line 549
    .line 550
    invoke-static {v0, v3, v1}, La/sj3;->r0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 551
    .line 552
    .line 553
    new-instance v1, La/m1w;

    .line 554
    .line 555
    const/16 v3, 0x8

    .line 556
    .line 557
    invoke-direct {v1, v0, v3}, La/m1w;-><init>(La/s1w;B)V

    .line 558
    .line 559
    .line 560
    const-string v3, "REQUEST_HIDE_HISTORY_DIALOG_KEY"

    .line 561
    .line 562
    invoke-static {v0, v3, v1}, La/sj3;->r0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 563
    .line 564
    .line 565
    new-instance v1, La/n1w;

    .line 566
    .line 567
    invoke-direct {v1, v0, v7}, La/n1w;-><init>(La/s1w;B)V

    .line 568
    .line 569
    .line 570
    const-string v3, "REQUEST_SYSTEM_NOTIFICATION_SETTINGS_DIALOG_KEY"

    .line 571
    .line 572
    invoke-static {v0, v3, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 573
    .line 574
    .line 575
    new-instance v1, La/n1w;

    .line 576
    .line 577
    invoke-direct {v1, v0, v12}, La/n1w;-><init>(La/s1w;B)V

    .line 578
    .line 579
    .line 580
    const-string v3, "REQUEST_SETTINGS_PUSH_DIALOG_KEY"

    .line 581
    .line 582
    invoke-static {v0, v3, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 583
    .line 584
    .line 585
    new-instance v1, La/o1w;

    .line 586
    .line 587
    invoke-direct {v1, v0, v2}, La/o1w;-><init>(La/s1w;B)V

    .line 588
    .line 589
    .line 590
    const-string v3, "REQUEST_SELECT_DATE_FILTER_DIALOG_KEY"

    .line 591
    .line 592
    invoke-static {v0, v3, v1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 593
    .line 594
    .line 595
    new-instance v1, La/n1w;

    .line 596
    .line 597
    invoke-direct {v1, v0, v9}, La/n1w;-><init>(La/s1w;B)V

    .line 598
    .line 599
    .line 600
    const-string v3, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY"

    .line 601
    .line 602
    invoke-static {v0, v3, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 603
    .line 604
    .line 605
    new-instance v1, La/o1w;

    .line 606
    .line 607
    invoke-direct {v1, v0, v9}, La/o1w;-><init>(La/s1w;B)V

    .line 608
    .line 609
    .line 610
    const-string v3, "REQUEST_BET_INFO_DIALOG"

    .line 611
    .line 612
    invoke-static {v0, v3, v1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 613
    .line 614
    .line 615
    new-instance v1, La/o1w;

    .line 616
    .line 617
    invoke-direct {v1, v0, v7}, La/o1w;-><init>(La/s1w;B)V

    .line 618
    .line 619
    .line 620
    const-string v3, "REQUEST_EDIT_COUPON_DIALOG"

    .line 621
    .line 622
    invoke-static {v0, v3, v1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 623
    .line 624
    .line 625
    new-instance v1, La/n1w;

    .line 626
    .line 627
    invoke-direct {v1, v0, v2}, La/n1w;-><init>(La/s1w;B)V

    .line 628
    .line 629
    .line 630
    invoke-static {v0, v4, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 631
    .line 632
    .line 633
    new-instance v1, La/n1w;

    .line 634
    .line 635
    invoke-direct {v1, v0, v14}, La/n1w;-><init>(La/s1w;B)V

    .line 636
    .line 637
    .line 638
    const-string v2, "REQUEST_COUPON_DIALOG_KEY"

    .line 639
    .line 640
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 641
    .line 642
    .line 643
    new-instance v1, La/m1w;

    .line 644
    .line 645
    const/16 v2, 0xa

    .line 646
    .line 647
    invoke-direct {v1, v0, v2}, La/m1w;-><init>(La/s1w;B)V

    .line 648
    .line 649
    .line 650
    const-string v2, "REQUEST_DATA_HISTORY_DIALOG_KEY"

    .line 651
    .line 652
    invoke-static {v0, v2, v1}, La/sj3;->r0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 653
    .line 654
    .line 655
    new-instance v1, La/m1w;

    .line 656
    .line 657
    invoke-direct {v1, v0, v8}, La/m1w;-><init>(La/s1w;B)V

    .line 658
    .line 659
    .line 660
    const-string v2, "REQUEST_SEND_MAIL_DIALOG_KEY"

    .line 661
    .line 662
    invoke-static {v0, v2, v1}, La/sj3;->r0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 663
    .line 664
    .line 665
    new-instance v1, La/o1w;

    .line 666
    .line 667
    invoke-direct {v1, v0, v6}, La/o1w;-><init>(La/s1w;B)V

    .line 668
    .line 669
    .line 670
    const-string v2, "REQUEST_CONFIRM_SALE_DIALOG_KEY"

    .line 671
    .line 672
    invoke-static {v0, v2, v1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 673
    .line 674
    .line 675
    new-instance v1, La/n1w;

    .line 676
    .line 677
    invoke-direct {v1, v0, v11}, La/n1w;-><init>(La/s1w;B)V

    .line 678
    .line 679
    .line 680
    const-string v2, "REQUEST_BIND_EMAIL_DIALOG_KEY"

    .line 681
    .line 682
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 683
    .line 684
    .line 685
    new-instance v1, La/n1w;

    .line 686
    .line 687
    invoke-direct {v1, v0, v10}, La/n1w;-><init>(La/s1w;B)V

    .line 688
    .line 689
    .line 690
    invoke-static {v0, v2, v1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    new-instance v2, La/l1w;

    .line 702
    .line 703
    invoke-direct {v2, v0, v6}, La/l1w;-><init>(La/s1w;B)V

    .line 704
    .line 705
    .line 706
    const-string v3, "BET_INFO_FRAGMENT_REQUEST_KEY"

    .line 707
    .line 708
    invoke-virtual {v1, v3, v0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 709
    .line 710
    .line 711
    return-void
.end method

.method public final C0()V
    .locals 67

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
    const-class v2, La/qzv;

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
    instance-of v4, v1, La/qzv;

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
    check-cast v3, La/qzv;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v29

    .line 61
    const/4 v1, 0x1

    .line 62
    sget-object v2, La/s1w;->e2:[La/iiy;

    .line 63
    .line 64
    aget-object v1, v2, v1

    .line 65
    .line 66
    iget-object v4, v0, La/s1w;->R1:La/r34;

    .line 67
    .line 68
    invoke-virtual {v4, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    move-result-object v30

    .line 72
    const/4 v1, 0x2

    .line 73
    aget-object v1, v2, v1

    .line 74
    .line 75
    iget-object v4, v0, La/s1w;->S1:La/r34;

    .line 76
    .line 77
    invoke-virtual {v4, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v31

    .line 81
    const/4 v1, 0x3

    .line 82
    aget-object v1, v2, v1

    .line 83
    .line 84
    iget-object v4, v0, La/s1w;->U1:La/yzn0;

    .line 85
    .line 86
    invoke-virtual {v4, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    move-object/from16 v32, v1

    .line 91
    .line 92
    check-cast v32, La/s77;

    .line 93
    .line 94
    sget-object v1, La/s1w;->f2:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, La/s1w;->L0()La/sys0;

    .line 100
    .line 101
    .line 102
    move-result-object v22

    .line 103
    const/4 v1, 0x5

    .line 104
    aget-object v1, v2, v1

    .line 105
    .line 106
    iget-object v4, v0, La/s1w;->W1:La/phf0;

    .line 107
    .line 108
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v24

    .line 112
    const/4 v1, 0x6

    .line 113
    aget-object v1, v2, v1

    .line 114
    .line 115
    iget-object v2, v0, La/s1w;->X1:La/phf0;

    .line 116
    .line 117
    invoke-virtual {v2, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v25

    .line 121
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object v1, v3, La/qzv;->e0:La/y3v;

    .line 131
    .line 132
    iget-object v5, v3, La/qzv;->a:La/cad;

    .line 133
    .line 134
    iget-object v2, v3, La/qzv;->b:La/duj;

    .line 135
    .line 136
    iget-object v4, v3, La/qzv;->c:La/gii0;

    .line 137
    .line 138
    iget-object v6, v3, La/qzv;->d:La/m1e;

    .line 139
    .line 140
    iget-object v12, v3, La/qzv;->L:La/wsf0;

    .line 141
    .line 142
    iget-object v13, v3, La/qzv;->H:La/onv;

    .line 143
    .line 144
    iget-object v7, v3, La/qzv;->f:La/sa10;

    .line 145
    .line 146
    iget-object v8, v3, La/qzv;->e:La/btt0;

    .line 147
    .line 148
    iget-object v9, v3, La/qzv;->Q:La/ii;

    .line 149
    .line 150
    iget-object v10, v3, La/qzv;->g:La/tgk;

    .line 151
    .line 152
    iget-object v11, v3, La/qzv;->h:La/us3;

    .line 153
    .line 154
    iget-object v14, v3, La/qzv;->i:La/knf0;

    .line 155
    .line 156
    iget-object v15, v3, La/qzv;->j:La/gst0;

    .line 157
    .line 158
    move-object/from16 v21, v1

    .line 159
    .line 160
    iget-object v1, v3, La/qzv;->k:La/fsd;

    .line 161
    .line 162
    move-object/from16 v39, v1

    .line 163
    .line 164
    iget-object v1, v3, La/qzv;->l:La/kt2;

    .line 165
    .line 166
    move-object/from16 v28, v6

    .line 167
    .line 168
    iget-object v6, v3, La/qzv;->m:La/iw20;

    .line 169
    .line 170
    move-object/from16 v40, v1

    .line 171
    .line 172
    iget-object v1, v3, La/qzv;->n:La/v6j0;

    .line 173
    .line 174
    move-object/from16 v41, v1

    .line 175
    .line 176
    iget-object v1, v3, La/qzv;->o:La/v88;

    .line 177
    .line 178
    move-object/from16 v42, v1

    .line 179
    .line 180
    iget-object v1, v3, La/qzv;->p:La/b3c0;

    .line 181
    .line 182
    move-object/from16 v43, v1

    .line 183
    .line 184
    iget-object v1, v3, La/qzv;->q:La/j1q0;

    .line 185
    .line 186
    move-object/from16 v44, v1

    .line 187
    .line 188
    iget-object v1, v3, La/qzv;->r:La/r9u;

    .line 189
    .line 190
    move-object/from16 v45, v1

    .line 191
    .line 192
    iget-object v1, v3, La/qzv;->s:La/q7d0;

    .line 193
    .line 194
    move-object/from16 v46, v1

    .line 195
    .line 196
    iget-object v1, v3, La/qzv;->t:La/qe50;

    .line 197
    .line 198
    move-object/from16 v47, v1

    .line 199
    .line 200
    iget-object v1, v3, La/qzv;->u:La/hr00;

    .line 201
    .line 202
    move-object/from16 v48, v1

    .line 203
    .line 204
    iget-object v1, v3, La/qzv;->v:La/nv20;

    .line 205
    .line 206
    move-object/from16 v49, v1

    .line 207
    .line 208
    iget-object v1, v3, La/qzv;->w:La/zfo;

    .line 209
    .line 210
    move-object/from16 v50, v1

    .line 211
    .line 212
    iget-object v1, v3, La/qzv;->x:La/edo;

    .line 213
    .line 214
    move-object/from16 v51, v1

    .line 215
    .line 216
    iget-object v1, v3, La/qzv;->y:La/tnm0;

    .line 217
    .line 218
    move-object/from16 v52, v1

    .line 219
    .line 220
    iget-object v1, v3, La/qzv;->z:La/odj;

    .line 221
    .line 222
    move-object/from16 v53, v1

    .line 223
    .line 224
    iget-object v1, v3, La/qzv;->A:La/m0w;

    .line 225
    .line 226
    move-object/from16 v33, v7

    .line 227
    .line 228
    iget-object v7, v3, La/qzv;->B:La/fvt0;

    .line 229
    .line 230
    move-object/from16 v54, v1

    .line 231
    .line 232
    iget-object v1, v3, La/qzv;->C:La/s2m0;

    .line 233
    .line 234
    move-object/from16 v37, v14

    .line 235
    .line 236
    iget-object v14, v3, La/qzv;->D:La/peg0;

    .line 237
    .line 238
    move-object/from16 v55, v1

    .line 239
    .line 240
    iget-object v1, v3, La/qzv;->E:La/ctf0;

    .line 241
    .line 242
    move-object/from16 v58, v1

    .line 243
    .line 244
    iget-object v1, v3, La/qzv;->F:La/s64;

    .line 245
    .line 246
    move-object/from16 v56, v1

    .line 247
    .line 248
    iget-object v1, v3, La/qzv;->G:La/cmt;

    .line 249
    .line 250
    move-object/from16 v34, v8

    .line 251
    .line 252
    iget-object v8, v3, La/qzv;->I:La/drm0;

    .line 253
    .line 254
    move-object/from16 v57, v1

    .line 255
    .line 256
    iget-object v1, v3, La/qzv;->J:La/au0;

    .line 257
    .line 258
    move-object/from16 v59, v1

    .line 259
    .line 260
    iget-object v1, v3, La/qzv;->K:La/l7k;

    .line 261
    .line 262
    move-object/from16 v60, v1

    .line 263
    .line 264
    iget-object v1, v3, La/qzv;->X:La/ix0;

    .line 265
    .line 266
    move-object/from16 v62, v1

    .line 267
    .line 268
    iget-object v1, v3, La/qzv;->Y:La/gg5;

    .line 269
    .line 270
    move-object/from16 v23, v9

    .line 271
    .line 272
    iget-object v9, v3, La/qzv;->M:La/wdd0;

    .line 273
    .line 274
    move-object/from16 v35, v10

    .line 275
    .line 276
    iget-object v10, v3, La/qzv;->N:La/sue;

    .line 277
    .line 278
    move-object/from16 v66, v1

    .line 279
    .line 280
    iget-object v1, v3, La/qzv;->O:La/vqc;

    .line 281
    .line 282
    move-object/from16 v16, v1

    .line 283
    .line 284
    iget-object v1, v3, La/qzv;->P:La/iip;

    .line 285
    .line 286
    move-object/from16 v36, v11

    .line 287
    .line 288
    iget-object v11, v3, La/qzv;->R:La/wsf0;

    .line 289
    .line 290
    move-object/from16 v38, v15

    .line 291
    .line 292
    iget-object v15, v3, La/qzv;->S:La/ugf0;

    .line 293
    .line 294
    move-object/from16 v17, v1

    .line 295
    .line 296
    iget-object v1, v3, La/qzv;->T:La/wdk0;

    .line 297
    .line 298
    move-object/from16 v63, v1

    .line 299
    .line 300
    iget-object v1, v3, La/qzv;->U:La/drb0;

    .line 301
    .line 302
    move-object/from16 v18, v1

    .line 303
    .line 304
    iget-object v1, v3, La/qzv;->V:La/wgu;

    .line 305
    .line 306
    move-object/from16 v64, v1

    .line 307
    .line 308
    iget-object v1, v3, La/qzv;->W:La/s64;

    .line 309
    .line 310
    move-object/from16 v61, v1

    .line 311
    .line 312
    iget-object v1, v3, La/qzv;->Z:La/rjo;

    .line 313
    .line 314
    move-object/from16 v65, v1

    .line 315
    .line 316
    iget-object v1, v3, La/qzv;->a0:La/ony;

    .line 317
    .line 318
    move-object/from16 v19, v1

    .line 319
    .line 320
    iget-object v1, v3, La/qzv;->b0:La/fvt0;

    .line 321
    .line 322
    move-object/from16 v20, v1

    .line 323
    .line 324
    iget-object v1, v3, La/qzv;->c0:La/onv;

    .line 325
    .line 326
    iget-object v3, v3, La/qzv;->d0:La/nr00;

    .line 327
    .line 328
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    invoke-virtual/range {v40 .. v40}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-virtual/range {v44 .. v44}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v45 .. v45}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v46 .. v46}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    invoke-virtual/range {v47 .. v47}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    invoke-virtual/range {v48 .. v48}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    invoke-virtual/range {v50 .. v50}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    invoke-virtual/range {v51 .. v51}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    invoke-virtual/range {v52 .. v52}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v53 .. v53}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    invoke-virtual/range {v54 .. v54}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v58 .. v58}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    invoke-virtual/range {v63 .. v63}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-virtual/range {v64 .. v64}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    move-object/from16 v27, v4

    .line 419
    .line 420
    new-instance v4, La/sii;

    .line 421
    .line 422
    move-object/from16 v19, v1

    .line 423
    .line 424
    move-object/from16 v26, v2

    .line 425
    .line 426
    move-object/from16 v18, v20

    .line 427
    .line 428
    move-object/from16 v20, v3

    .line 429
    .line 430
    invoke-direct/range {v4 .. v66}, La/sii;-><init>(La/cad;La/iw20;La/fvt0;La/drm0;La/wdd0;La/sue;La/wsf0;La/wsf0;La/onv;La/peg0;La/ugf0;La/vqc;La/iip;La/fvt0;La/onv;La/nr00;La/y3v;La/sys0;La/ii;Ljava/lang/String;Ljava/lang/String;La/duj;La/gii0;La/m1e;La/i1w0;Ljava/lang/Long;Ljava/lang/Long;La/s77;La/sa10;La/btt0;La/tgk;La/us3;La/knf0;La/gst0;La/fsd;La/kt2;La/v6j0;La/v88;La/b3c0;La/j1q0;La/r9u;La/q7d0;La/qe50;La/hr00;La/nv20;La/zfo;La/edo;La/tnm0;La/odj;La/m0w;La/s2m0;La/s64;La/cmt;La/ctf0;La/au0;La/l7k;La/s64;La/ix0;La/wdk0;La/wgu;La/rjo;La/gg5;)V

    .line 431
    .line 432
    .line 433
    move-object/from16 v1, v23

    .line 434
    .line 435
    move-object/from16 v2, v63

    .line 436
    .line 437
    iget-object v3, v4, La/sii;->i0:La/n5d0;

    .line 438
    .line 439
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v3

    .line 443
    check-cast v3, La/qii;

    .line 444
    .line 445
    iput-object v3, v0, La/s1w;->L1:La/qii;

    .line 446
    .line 447
    iput-object v1, v0, La/s1w;->M1:La/ii;

    .line 448
    .line 449
    iput-object v2, v0, La/s1w;->N1:La/wdk0;

    .line 450
    .line 451
    iget-object v1, v14, La/peg0;->b:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v1, La/yzn0;

    .line 454
    .line 455
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    iput-object v1, v0, La/s1w;->O1:La/ynb;

    .line 463
    .line 464
    return-void

    .line 465
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 466
    .line 467
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    return-void
.end method

.method public final D0()V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/naw;->W0:La/p7m0;

    .line 6
    .line 7
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/q1w;

    .line 12
    .line 13
    const/4 v3, 0x6

    .line 14
    const/4 v8, 0x0

    .line 15
    invoke-direct {v1, p0, v8, v3}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 16
    .line 17
    .line 18
    sget-object v3, La/lkz;->a:La/lkz;

    .line 19
    .line 20
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    new-instance v5, La/r1w;

    .line 33
    .line 34
    invoke-direct {v5, v0, v3, v1, v8}, La/r1w;-><init>(La/xae0;La/clz;La/q1w;La/yje;)V

    .line 35
    .line 36
    .line 37
    const/4 v10, 0x3

    .line 38
    invoke-static {v4, v8, v8, v5, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v1, v0, La/naw;->X0:La/p7m0;

    .line 46
    .line 47
    new-instance v3, La/a1t;

    .line 48
    .line 49
    const/16 v4, 0x16

    .line 50
    .line 51
    invoke-direct {v3, v1, v4}, La/a1t;-><init>(La/gmq;B)V

    .line 52
    .line 53
    .line 54
    new-instance v1, La/sot;

    .line 55
    .line 56
    const/16 v4, 0x14

    .line 57
    .line 58
    invoke-direct {v1, v8, v0, v4}, La/sot;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {v3, v1}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    new-instance v3, La/ewt;

    .line 66
    .line 67
    const/16 v4, 0x12

    .line 68
    .line 69
    invoke-direct {v3, v1, v0, v4}, La/ewt;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    new-instance v1, La/baw;

    .line 73
    .line 74
    const/4 v11, 0x0

    .line 75
    invoke-direct {v1, v0, v8, v11}, La/baw;-><init>(La/naw;La/yje;B)V

    .line 76
    .line 77
    .line 78
    new-instance v4, La/dnq;

    .line 79
    .line 80
    const/4 v12, 0x1

    .line 81
    invoke-direct {v4, v3, v1, v12}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v4, v0}, La/ffb0;->M(La/gmq;La/vne;)La/vae0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    new-instance v1, La/u5u;

    .line 93
    .line 94
    const/16 v3, 0xe

    .line 95
    .line 96
    invoke-direct {v1, p0, v8, v3}, La/u5u;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    new-instance v5, La/hgv;

    .line 112
    .line 113
    invoke-direct {v5, v0, v3, v1, v8}, La/hgv;-><init>(La/vae0;La/clz;La/u5u;La/yje;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v4, v8, v8, v5, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, La/s1w;->J0()La/r5w;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    iget-object v0, v0, La/gl80;->f:La/gmq;

    .line 124
    .line 125
    new-instance v1, La/q1w;

    .line 126
    .line 127
    const/4 v3, 0x2

    .line 128
    invoke-direct {v1, p0, v8, v3}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 129
    .line 130
    .line 131
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    new-instance v5, La/wmq;

    .line 144
    .line 145
    invoke-direct {v5, v0, v3, v1, v8}, La/wmq;-><init>(La/gmq;La/glz;La/q1w;La/yje;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v4, v8, v8, v5, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v0, v0, La/naw;->c1:La/p7m0;

    .line 156
    .line 157
    new-instance v1, La/q1w;

    .line 158
    .line 159
    invoke-direct {v1, p0, v8, v10}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 160
    .line 161
    .line 162
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    new-instance v5, La/hgv;

    .line 175
    .line 176
    invoke-direct {v5, v0, v3, v1, v8}, La/hgv;-><init>(La/gmq;La/clz;La/q1w;La/yje;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v4, v8, v8, v5, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget-object v9, v0, La/naw;->a1:La/ol60;

    .line 187
    .line 188
    new-instance v0, La/pfl;

    .line 189
    .line 190
    const/4 v6, 0x4

    .line 191
    const/16 v7, 0x17

    .line 192
    .line 193
    const/4 v1, 0x2

    .line 194
    const-class v3, La/s1w;

    .line 195
    .line 196
    const-string v4, "handleHistoryAction"

    .line 197
    .line 198
    const-string v5, "handleHistoryAction(Lorg/xplatform/bethistory/history/presentation/HistoryViewModel$Action;)V"

    .line 199
    .line 200
    move-object v2, p0

    .line 201
    invoke-direct/range {v0 .. v7}, La/pfl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 202
    .line 203
    .line 204
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    new-instance v4, La/hgv;

    .line 217
    .line 218
    move-object v5, v9

    .line 219
    const/4 v9, 0x0

    .line 220
    move-object v7, v0

    .line 221
    invoke-direct/range {v4 .. v9}, La/hgv;-><init>(La/gmq;La/clz;La/pfl;La/yje;B)V

    .line 222
    .line 223
    .line 224
    invoke-static {v1, v8, v8, v4, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    iget-object v5, v0, La/naw;->Z0:La/ol60;

    .line 232
    .line 233
    new-instance v7, La/q1w;

    .line 234
    .line 235
    const/4 v0, 0x4

    .line 236
    invoke-direct {v7, p0, v8, v0}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 237
    .line 238
    .line 239
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    new-instance v4, La/hgv;

    .line 252
    .line 253
    invoke-direct/range {v4 .. v9}, La/hgv;-><init>(La/gmq;La/clz;La/q1w;La/yje;B)V

    .line 254
    .line 255
    .line 256
    invoke-static {v1, v8, v8, v4, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    iget-object v1, v1, La/naw;->Y0:La/p7m0;

    .line 264
    .line 265
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    new-instance v7, La/q1w;

    .line 270
    .line 271
    const/4 v1, 0x5

    .line 272
    invoke-direct {v7, p0, v8, v1}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 273
    .line 274
    .line 275
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    new-instance v4, La/hgv;

    .line 288
    .line 289
    invoke-direct/range {v4 .. v9}, La/hgv;-><init>(La/xae0;La/clz;La/q1w;La/yje;B)V

    .line 290
    .line 291
    .line 292
    invoke-static {v1, v8, v8, v4, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    iget-object v1, v1, La/naw;->R:La/z4w;

    .line 300
    .line 301
    iget-object v1, v1, La/z4w;->t:La/p7m0;

    .line 302
    .line 303
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    new-instance v3, La/q1w;

    .line 308
    .line 309
    invoke-direct {v3, p0, v8, v12}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 310
    .line 311
    .line 312
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    invoke-interface {v4}, La/clz;->x()La/glz;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 321
    .line 322
    .line 323
    move-result-object v5

    .line 324
    new-instance v6, La/hgv;

    .line 325
    .line 326
    invoke-direct {v6, v1, v4, v3, v8}, La/hgv;-><init>(La/xae0;La/clz;La/q1w;La/yje;)V

    .line 327
    .line 328
    .line 329
    invoke-static {v5, v8, v8, v6, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    iget-object v3, v1, La/naw;->R:La/z4w;

    .line 337
    .line 338
    iget-object v3, v3, La/z4w;->u:La/ol60;

    .line 339
    .line 340
    new-instance v4, La/caw;

    .line 341
    .line 342
    invoke-direct {v4, v1, v8, v11}, La/caw;-><init>(La/naw;La/yje;B)V

    .line 343
    .line 344
    .line 345
    new-instance v1, La/fnq;

    .line 346
    .line 347
    invoke-direct {v1, v3, v4, v0}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 348
    .line 349
    .line 350
    new-instance v0, La/q1w;

    .line 351
    .line 352
    invoke-direct {v0, p0, v8, v11}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 353
    .line 354
    .line 355
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    new-instance v4, La/hgv;

    .line 368
    .line 369
    invoke-direct {v4, v1, v2, v0, v8}, La/hgv;-><init>(La/fnq;La/clz;La/q1w;La/yje;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v3, v8, v8, v4, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 373
    .line 374
    .line 375
    return-void
.end method

.method public final G0(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/s1w;->I0()La/t1w;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p2}, La/e1i;->setNavigationBarButtonEnable(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final H0()La/ii;
    .locals 0

    .line 1
    iget-object p0, p0, La/s1w;->M1:La/ii;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "actionDialogManager"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final I0()La/t1w;
    .locals 2

    .line 1
    sget-object v0, La/s1w;->e2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/s1w;->K1:La/s0r;

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
    check-cast p0, La/t1w;

    .line 16
    .line 17
    return-object p0
.end method

.method public final J0()La/r5w;
    .locals 0

    .line 1
    iget-object p0, p0, La/s1w;->a2:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/r5w;

    .line 8
    .line 9
    return-object p0
.end method

.method public final K0()La/wdk0;
    .locals 0

    .line 1
    iget-object p0, p0, La/s1w;->N1:La/wdk0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "snackbarManager"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final L0()La/sys0;
    .locals 2

    .line 1
    sget-object v0, La/s1w;->e2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/s1w;->V1:La/yzn0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/sys0;

    .line 13
    .line 14
    return-object p0
.end method

.method public final M0()La/naw;
    .locals 0

    .line 1
    iget-object p0, p0, La/s1w;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/naw;

    .line 8
    .line 9
    return-object p0
.end method

.method public final N0(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/s1w;->I0()La/t1w;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p2}, La/e1i;->setNavigationBarButtonAlpha(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final O0(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, La/s1w;->I0()La/t1w;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->g(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, La/s1w;->I0()La/t1w;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-object p0, p0, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final Y()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object p0, p0, La/s1w;->Z1:La/ywq;

    .line 5
    .line 6
    invoke-virtual {p0}, La/ywq;->b()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final Z()V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, La/law;->a:La/law;

    .line 10
    .line 11
    iget-object v3, v0, La/naw;->L:La/mne;

    .line 12
    .line 13
    iget-object v4, v3, La/mne;->c:La/vs10;

    .line 14
    .line 15
    new-instance v5, La/v9w;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    const/4 v7, 0x0

    .line 19
    invoke-direct {v5, v0, v7, v3}, La/v9w;-><init>(La/naw;La/yje;B)V

    .line 20
    .line 21
    .line 22
    const/16 v6, 0xa

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La/s1w;->Q1:La/c4m0;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v7}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0}, La/s1w;->I0()La/t1w;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v0, v0, La/t1w;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 40
    .line 41
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 42
    .line 43
    .line 44
    invoke-super {p0}, La/yx5;->Z()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, La/naw;->e:La/ort;

    .line 6
    .line 7
    iget-object v0, v0, La/ort;->a:La/gst0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/gst0;->a()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, v0}, La/naw;->G(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final e0()V
    .locals 10

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/s1w;->J0()La/r5w;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, La/gl80;->d()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, La/s1w;->I0()La/t1w;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, La/t1w;->p:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 19
    .line 20
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v3

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 40
    .line 41
    .line 42
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    const/4 v8, 0x0

    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v6, 0x1

    .line 53
    invoke-static/range {v2 .. v9}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 61
    .line 62
    .line 63
    :cond_0
    sget-object v0, La/s1w;->e2:[La/iiy;

    .line 64
    .line 65
    const/4 v1, 0x3

    .line 66
    aget-object v0, v0, v1

    .line 67
    .line 68
    iget-object v1, p0, La/s1w;->U1:La/yzn0;

    .line 69
    .line 70
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    check-cast v0, La/s77;

    .line 75
    .line 76
    sget-object v1, La/s77;->g:La/s77;

    .line 77
    .line 78
    if-eq v0, v1, :cond_1

    .line 79
    .line 80
    invoke-virtual {p0}, La/s1w;->L0()La/sys0;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    sget-object v1, La/sys0;->a:La/sys0;

    .line 85
    .line 86
    if-ne v0, v1, :cond_1

    .line 87
    .line 88
    invoke-virtual {p0}, La/s1w;->I0()La/t1w;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    iget-object p0, p0, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 93
    .line 94
    iget-object p0, p0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 95
    .line 96
    const/16 v0, 0x8

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 99
    .line 100
    .line 101
    :cond_1
    return-void
.end method

.method public final g0()V
    .locals 5

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, La/naw;->b1:La/ax5;

    .line 13
    .line 14
    new-instance v2, La/u5u;

    .line 15
    .line 16
    const/16 v3, 0x10

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v2, p0, v4, v3}, La/u5u;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x2

    .line 23
    invoke-static {v0, v1, v4, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/s1w;->c2:Z

    .line 2
    .line 3
    return p0
.end method
