.class public final La/d4j0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/d4j0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/eke0",
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
.field public static final S1:La/eke0;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/fiu0;

.field public M1:La/ii;

.field public final N1:La/yzn0;

.field public final O1:La/kiu0;

.field public final P1:La/s0r;

.field public final Q1:La/n0o0;

.field public final R1:La/ywq;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/d4j0;

    .line 4
    .line 5
    const-string v2, "bundleBalanceScreenType"

    .line 6
    .line 7
    const-string v3, "getBundleBalanceScreenType()Lorg/xplatform/balance/model/BalanceScreenType;"

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
    const-string v5, "getBinding()Lorg/xplatform/feature/office/make_bet_settings/impl/databinding/FragmentSettingsMakeBetBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/d4j0;->U1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/eke0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/d4j0;->S1:La/eke0;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d02cf

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
    iput-object v0, p0, La/d4j0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/yzn0;

    .line 12
    .line 13
    const-string v1, "BALANCE_TYPE_BUNDLE_KEY"

    .line 14
    .line 15
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/d4j0;->N1:La/yzn0;

    .line 19
    .line 20
    new-instance v0, La/a4j0;

    .line 21
    .line 22
    const/16 v1, 0x9

    .line 23
    .line 24
    invoke-direct {v0, p0, v1}, La/a4j0;-><init>(La/d4j0;B)V

    .line 25
    .line 26
    .line 27
    new-instance v1, La/l9i0;

    .line 28
    .line 29
    const/16 v2, 0xc

    .line 30
    .line 31
    invoke-direct {v1, p0, v2}, La/l9i0;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    sget-object v3, La/wez;->b:La/wez;

    .line 35
    .line 36
    new-instance v4, La/l9i0;

    .line 37
    .line 38
    const/16 v5, 0xd

    .line 39
    .line 40
    invoke-direct {v4, v1, v5}, La/l9i0;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-class v3, La/w5j0;

    .line 48
    .line 49
    sget-object v4, La/sre0;->a:La/tre0;

    .line 50
    .line 51
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    new-instance v4, La/s9i0;

    .line 56
    .line 57
    const/16 v5, 0xa

    .line 58
    .line 59
    invoke-direct {v4, v1, v5}, La/s9i0;-><init>(La/a8z;B)V

    .line 60
    .line 61
    .line 62
    new-instance v6, La/s9i0;

    .line 63
    .line 64
    const/16 v7, 0xb

    .line 65
    .line 66
    invoke-direct {v6, v1, v7}, La/s9i0;-><init>(La/a8z;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v3, v4, v6, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, La/d4j0;->O1:La/kiu0;

    .line 74
    .line 75
    sget-object v0, La/c4j0;->a:La/c4j0;

    .line 76
    .line 77
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, La/d4j0;->P1:La/s0r;

    .line 82
    .line 83
    new-instance v0, La/a4j0;

    .line 84
    .line 85
    invoke-direct {v0, p0, v5}, La/a4j0;-><init>(La/d4j0;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, La/d4j0;->Q1:La/n0o0;

    .line 93
    .line 94
    new-instance v0, La/xn;

    .line 95
    .line 96
    const/4 v1, 0x7

    .line 97
    invoke-direct {v0, v1}, La/xn;-><init>(B)V

    .line 98
    .line 99
    .line 100
    new-instance v1, La/yl3;

    .line 101
    .line 102
    invoke-direct {v1, p0, v2}, La/yl3;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, La/d4j0;->R1:La/ywq;

    .line 110
    .line 111
    return-void
.end method

.method public static synthetic K0(La/d4j0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const p4, 0x7f1304f9

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p4

    .line 12
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    :cond_0
    move-object v4, p4

    .line 16
    const p4, 0x7f13032f

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-object v0, p0

    .line 27
    move-object v1, p1

    .line 28
    move-object v2, p2

    .line 29
    move-object v3, p3

    .line 30
    invoke-virtual/range {v0 .. v5}, La/d4j0;->J0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/d4j0;->G0()La/t4r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/t4r;->d:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v0, La/a4j0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/a4j0;-><init>(La/d4j0;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/d4j0;->G0()La/t4r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/t4r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-direct {v0, v2, v3, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, La/d4j0;->Q1:La/n0o0;

    .line 36
    .line 37
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/y1j0;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x3

    .line 47
    invoke-static {p1, v1, v0}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 48
    .line 49
    .line 50
    new-instance p1, La/a4j0;

    .line 51
    .line 52
    const/4 v2, 0x7

    .line 53
    invoke-direct {p1, p0, v2}, La/a4j0;-><init>(La/d4j0;B)V

    .line 54
    .line 55
    .line 56
    const-string v2, "APP_NOTIFICATION_SETTINGS_REQUEST_KEY"

    .line 57
    .line 58
    invoke-static {p0, v2, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, La/a4j0;

    .line 62
    .line 63
    const/16 v4, 0x8

    .line 64
    .line 65
    invoke-direct {p1, p0, v4}, La/a4j0;-><init>(La/d4j0;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {p0, v2, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 69
    .line 70
    .line 71
    new-instance p1, La/a4j0;

    .line 72
    .line 73
    invoke-direct {p1, p0, v0}, La/a4j0;-><init>(La/d4j0;B)V

    .line 74
    .line 75
    .line 76
    const-string v0, "SYSTEM_NOTIFICATION_SETTINGS_REQUEST_KEY"

    .line 77
    .line 78
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 79
    .line 80
    .line 81
    new-instance p1, La/a4j0;

    .line 82
    .line 83
    const/4 v2, 0x4

    .line 84
    invoke-direct {p1, p0, v2}, La/a4j0;-><init>(La/d4j0;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 88
    .line 89
    .line 90
    new-instance p1, La/a4j0;

    .line 91
    .line 92
    invoke-direct {p1, p0, v3}, La/a4j0;-><init>(La/d4j0;B)V

    .line 93
    .line 94
    .line 95
    const-string v0, "AUTO_MAX_ACTIVATE_DIALOG_REQUEST_KEY"

    .line 96
    .line 97
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 98
    .line 99
    .line 100
    new-instance p1, La/a4j0;

    .line 101
    .line 102
    const/4 v2, 0x2

    .line 103
    invoke-direct {p1, p0, v2}, La/a4j0;-><init>(La/d4j0;B)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 107
    .line 108
    .line 109
    new-instance p1, La/a4j0;

    .line 110
    .line 111
    const/4 v0, 0x5

    .line 112
    invoke-direct {p1, p0, v0}, La/a4j0;-><init>(La/d4j0;B)V

    .line 113
    .line 114
    .line 115
    const-string v0, "VIP_ACTIVATE_DIALOG_REQUEST_KEY"

    .line 116
    .line 117
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 118
    .line 119
    .line 120
    new-instance p1, La/a4j0;

    .line 121
    .line 122
    const/4 v2, 0x6

    .line 123
    invoke-direct {p1, p0, v2}, La/a4j0;-><init>(La/d4j0;B)V

    .line 124
    .line 125
    .line 126
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 127
    .line 128
    .line 129
    new-instance p1, La/b4j0;

    .line 130
    .line 131
    invoke-direct {p1, p0, v3}, La/b4j0;-><init>(La/d4j0;B)V

    .line 132
    .line 133
    .line 134
    const-string v0, "DefaultBetSumBottomSheetKey"

    .line 135
    .line 136
    invoke-static {p0, v0, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 137
    .line 138
    .line 139
    new-instance p1, La/b4j0;

    .line 140
    .line 141
    invoke-direct {p1, p0, v1}, La/b4j0;-><init>(La/d4j0;B)V

    .line 142
    .line 143
    .line 144
    const-string v0, "QuickBetSumBottomSheetKey"

    .line 145
    .line 146
    invoke-static {p0, v0, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public final C0()V
    .locals 4

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
    const-class v1, La/p2j0;

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
    instance-of v3, v0, La/p2j0;

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
    check-cast v2, La/p2j0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0}, La/d4j0;->H0()La/bm5;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v2, v0, v1}, La/p2j0;->a(La/i1w0;La/bm5;)La/i7i;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, La/i7i;->x()La/fiu0;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iput-object v1, p0, La/d4j0;->L1:La/fiu0;

    .line 72
    .line 73
    iget-object v0, v0, La/i7i;->y:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, La/ii;

    .line 76
    .line 77
    iput-object v0, p0, La/d4j0;->M1:La/ii;

    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 81
    .line 82
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final D0()V
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, La/d4j0;->I0()La/w5j0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/w5j0;->A:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/qaf0;

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    invoke-direct {v1, v0, v2}, La/qaf0;-><init>(La/gmq;B)V

    .line 11
    .line 12
    .line 13
    new-instance v3, La/jbh0;

    .line 14
    .line 15
    const/4 v9, 0x4

    .line 16
    const/4 v10, 0x3

    .line 17
    const/4 v4, 0x2

    .line 18
    const-class v6, La/d4j0;

    .line 19
    .line 20
    const-string v7, "updateSettingsMakeBetUiState"

    .line 21
    .line 22
    const-string v8, "updateSettingsMakeBetUiState(Lorg/xplatform/make_bet_settings/impl/presentation/SettingsMakeBetUiState;)V"

    .line 23
    .line 24
    move-object/from16 v5, p0

    .line 25
    .line 26
    invoke-direct/range {v3 .. v10}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

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
    move-result-object v4

    .line 39
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    new-instance v5, La/r7i0;

    .line 44
    .line 45
    const/4 v7, 0x0

    .line 46
    invoke-direct {v5, v1, v0, v3, v7}, La/r7i0;-><init>(La/qaf0;La/clz;La/jbh0;La/yje;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v4, v7, v7, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 50
    .line 51
    .line 52
    invoke-virtual/range {p0 .. p0}, La/d4j0;->I0()La/w5j0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v0, v0, La/w5j0;->B:La/p7m0;

    .line 57
    .line 58
    new-instance v8, La/qaf0;

    .line 59
    .line 60
    const/4 v1, 0x2

    .line 61
    invoke-direct {v8, v0, v1}, La/qaf0;-><init>(La/gmq;B)V

    .line 62
    .line 63
    .line 64
    new-instance v10, La/jbh0;

    .line 65
    .line 66
    const/16 v17, 0x4

    .line 67
    .line 68
    const/16 v18, 0x4

    .line 69
    .line 70
    const/4 v12, 0x2

    .line 71
    const-string v15, "handleSettingsMakeBetUiEvent"

    .line 72
    .line 73
    const-string v16, "handleSettingsMakeBetUiEvent(Lorg/xplatform/make_bet_settings/impl/presentation/SettingsMakeBetUiEvent;)V"

    .line 74
    .line 75
    move-object/from16 v13, p0

    .line 76
    .line 77
    move-object v14, v6

    .line 78
    move-object v11, v10

    .line 79
    invoke-direct/range {v11 .. v18}, La/jbh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 80
    .line 81
    .line 82
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    invoke-interface {v9}, La/clz;->x()La/glz;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    move-object v11, v7

    .line 95
    new-instance v7, La/r7i0;

    .line 96
    .line 97
    const/4 v12, 0x0

    .line 98
    invoke-direct/range {v7 .. v12}, La/r7i0;-><init>(La/qaf0;La/clz;La/jbh0;La/yje;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0, v11, v11, v7, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final G0()La/t4r;
    .locals 2

    .line 1
    sget-object v0, La/d4j0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/d4j0;->P1:La/s0r;

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
    check-cast p0, La/t4r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/bm5;
    .locals 2

    .line 1
    sget-object v0, La/d4j0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/d4j0;->N1:La/yzn0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/bm5;

    .line 13
    .line 14
    return-object p0
.end method

.method public final I0()La/w5j0;
    .locals 0

    .line 1
    iget-object p0, p0, La/d4j0;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/w5j0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final J0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 1
    iget-object v0, p0, La/d4j0;->M1:La/ii;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 6
    .line 7
    sget-object v10, La/n12;->a:La/n12;

    .line 8
    .line 9
    const/4 v11, 0x0

    .line 10
    const/16 v12, 0x5d0

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    move-object v2, p1

    .line 16
    move-object v3, p2

    .line 17
    move-object/from16 v7, p3

    .line 18
    .line 19
    move-object/from16 v4, p4

    .line 20
    .line 21
    move-object/from16 v5, p5

    .line 22
    .line 23
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const-string p0, "actionDialogManager"

    .line 38
    .line 39
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    throw p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/d4j0;->I0()La/w5j0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/v4j0;->a:La/v4j0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, La/w5j0;->z(La/a5j0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/d4j0;->G0()La/t4r;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, La/t4r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, La/d4j0;->R1:La/ywq;

    .line 21
    .line 22
    invoke-virtual {v0}, La/ywq;->b()V

    .line 23
    .line 24
    .line 25
    invoke-super {p0}, La/yx5;->Z()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/d4j0;->I0()La/w5j0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, La/u4j0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/d4j0;->H0()La/bm5;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v1, p0}, La/u4j0;-><init>(La/bm5;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/w5j0;->z(La/a5j0;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/d4j0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
