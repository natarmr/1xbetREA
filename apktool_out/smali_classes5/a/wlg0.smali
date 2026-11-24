.class public final La/wlg0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/wlg0;",
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
.field public static final X1:La/cge0;

.field public static final synthetic Y1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public L1:La/fiu0;

.field public final M1:La/a8z;

.field public N1:La/wdk0;

.field public final O1:La/s0r;

.field public final P1:La/khf0;

.field public final Q1:La/zz2;

.field public final R1:La/cgx0;

.field public final S1:La/cgx0;

.field public final U1:La/cgx0;

.field public final V1:La/cgx0;

.field public final W1:La/cgx0;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/wlg0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/rules/impl/databinding/RulesFragmentBinding;"

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
    const-string v3, "ruleData"

    .line 16
    .line 17
    const-string v5, "getRuleData()Lorg/xplatform/rules/api/presentation/models/RuleData;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "ruleName"

    .line 25
    .line 26
    const-string v6, "getRuleName()I"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "showCustomToolbar"

    .line 34
    .line 35
    const-string v7, "getShowCustomToolbar()Z"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "fromBanners"

    .line 43
    .line 44
    const-string v8, "getFromBanners()Z"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/ez40;

    .line 50
    .line 51
    const-string v8, "showNavBarArg"

    .line 52
    .line 53
    const-string v9, "getShowNavBarArg()Z"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    new-instance v8, La/ez40;

    .line 59
    .line 60
    const-string v9, "fromGames"

    .line 61
    .line 62
    const-string v10, "getFromGames()Z"

    .line 63
    .line 64
    invoke-direct {v8, v1, v9, v10, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    new-instance v9, La/ez40;

    .line 68
    .line 69
    const-string v10, "fromAggregator"

    .line 70
    .line 71
    const-string v11, "getFromAggregator()Z"

    .line 72
    .line 73
    invoke-direct {v9, v1, v10, v11, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    const/16 v1, 0x8

    .line 77
    .line 78
    new-array v1, v1, [La/iiy;

    .line 79
    .line 80
    aput-object v0, v1, v4

    .line 81
    .line 82
    const/4 v0, 0x1

    .line 83
    aput-object v2, v1, v0

    .line 84
    .line 85
    const/4 v0, 0x2

    .line 86
    aput-object v3, v1, v0

    .line 87
    .line 88
    const/4 v0, 0x3

    .line 89
    aput-object v5, v1, v0

    .line 90
    .line 91
    const/4 v0, 0x4

    .line 92
    aput-object v6, v1, v0

    .line 93
    .line 94
    const/4 v0, 0x5

    .line 95
    aput-object v7, v1, v0

    .line 96
    .line 97
    const/4 v0, 0x6

    .line 98
    aput-object v8, v1, v0

    .line 99
    .line 100
    const/4 v0, 0x7

    .line 101
    aput-object v9, v1, v0

    .line 102
    .line 103
    sput-object v1, La/wlg0;->Y1:[La/iiy;

    .line 104
    .line 105
    new-instance v0, La/cge0;

    .line 106
    .line 107
    const/16 v1, 0xb

    .line 108
    .line 109
    invoke-direct {v0, v1}, La/cge0;-><init>(B)V

    .line 110
    .line 111
    .line 112
    sput-object v0, La/wlg0;->X1:La/cge0;

    .line 113
    .line 114
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d054a

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040b5d

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/wlg0;->K1:La/f9o0;

    .line 16
    .line 17
    const-class v0, La/aog0;

    .line 18
    .line 19
    sget-object v1, La/sre0;->a:La/tre0;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, La/ulg0;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v1, p0, v2}, La/ulg0;-><init>(La/wlg0;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, La/wlg0;->M1:La/a8z;

    .line 36
    .line 37
    sget-object v0, La/vlg0;->a:La/vlg0;

    .line 38
    .line 39
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, La/wlg0;->O1:La/s0r;

    .line 44
    .line 45
    new-instance v0, La/khf0;

    .line 46
    .line 47
    const-string v1, "RULE_DATA"

    .line 48
    .line 49
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, La/wlg0;->P1:La/khf0;

    .line 53
    .line 54
    new-instance v0, La/zz2;

    .line 55
    .line 56
    const-string v1, "RULE_NAME"

    .line 57
    .line 58
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, La/wlg0;->Q1:La/zz2;

    .line 62
    .line 63
    new-instance v0, La/cgx0;

    .line 64
    .line 65
    const-string v1, "TOOLBAR_DATA"

    .line 66
    .line 67
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, La/wlg0;->R1:La/cgx0;

    .line 71
    .line 72
    new-instance v0, La/cgx0;

    .line 73
    .line 74
    const-string v1, "FROM_BANNERS"

    .line 75
    .line 76
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, La/wlg0;->S1:La/cgx0;

    .line 80
    .line 81
    new-instance v0, La/cgx0;

    .line 82
    .line 83
    const-string v1, "SHOW_NAV_BAR"

    .line 84
    .line 85
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p0, La/wlg0;->U1:La/cgx0;

    .line 89
    .line 90
    new-instance v0, La/cgx0;

    .line 91
    .line 92
    const-string v1, "FROM_GAMES"

    .line 93
    .line 94
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, La/wlg0;->V1:La/cgx0;

    .line 98
    .line 99
    new-instance v0, La/cgx0;

    .line 100
    .line 101
    const-string v1, "FROM_AGGREGATOR"

    .line 102
    .line 103
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iput-object v0, p0, La/wlg0;->W1:La/cgx0;

    .line 107
    .line 108
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/o7k0;->c:La/n0q;

    .line 2
    .line 3
    sget-object v0, La/wlg0;->Y1:[La/iiy;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    aget-object v0, v0, v1

    .line 7
    .line 8
    iget-object v1, p0, La/wlg0;->O1:La/s0r;

    .line 9
    .line 10
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast v0, La/xlg0;

    .line 18
    .line 19
    iget-object v0, v0, La/xlg0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 20
    .line 21
    new-instance v1, La/owp0;

    .line 22
    .line 23
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, La/j5d0;

    .line 27
    .line 28
    const/16 v3, 0x15

    .line 29
    .line 30
    invoke-direct {v2, p0, p1, v3}, La/j5d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    new-instance p0, La/ugd;

    .line 34
    .line 35
    const p1, 0x4b539dfb    # 1.3868539E7f

    .line 36
    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-direct {p0, p1, v3, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    invoke-static {v0, v1, p1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final C0()V
    .locals 10

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
    const-class v1, La/slg0;

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
    instance-of v3, v0, La/slg0;

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
    check-cast v2, La/slg0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const/4 v0, 0x7

    .line 56
    sget-object v1, La/wlg0;->Y1:[La/iiy;

    .line 57
    .line 58
    aget-object v0, v1, v0

    .line 59
    .line 60
    iget-object v3, p0, La/wlg0;->W1:La/cgx0;

    .line 61
    .line 62
    invoke-virtual {v3, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    new-instance v4, La/gmg0;

    .line 75
    .line 76
    const/4 v5, 0x1

    .line 77
    aget-object v5, v1, v5

    .line 78
    .line 79
    iget-object v6, p0, La/wlg0;->P1:La/khf0;

    .line 80
    .line 81
    invoke-virtual {v6, p0, v5}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 86
    .line 87
    const/4 v6, 0x6

    .line 88
    aget-object v6, v1, v6

    .line 89
    .line 90
    iget-object v7, p0, La/wlg0;->V1:La/cgx0;

    .line 91
    .line 92
    invoke-virtual {v7, p0, v6}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    const/4 v7, 0x2

    .line 101
    aget-object v7, v1, v7

    .line 102
    .line 103
    iget-object v8, p0, La/wlg0;->Q1:La/zz2;

    .line 104
    .line 105
    invoke-virtual {v8, p0, v7}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    const/4 v8, 0x3

    .line 114
    aget-object v1, v1, v8

    .line 115
    .line 116
    iget-object v8, p0, La/wlg0;->R1:La/cgx0;

    .line 117
    .line 118
    invoke-virtual {v8, p0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    const/4 v9, 0x0

    .line 127
    invoke-direct/range {v4 .. v9}, La/gmg0;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;ZIZLjava/lang/Integer;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v0, v3, v4}, La/slg0;->a(ZLa/i1w0;La/gmg0;)La/nsi;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    new-instance v1, La/fiu0;

    .line 135
    .line 136
    const-class v2, La/aog0;

    .line 137
    .line 138
    iget-object v3, v0, La/nsi;->o:La/msi;

    .line 139
    .line 140
    invoke-static {v2, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 145
    .line 146
    .line 147
    iput-object v1, p0, La/wlg0;->L1:La/fiu0;

    .line 148
    .line 149
    iget-object v0, v0, La/nsi;->i:La/wdk0;

    .line 150
    .line 151
    iput-object v0, p0, La/wlg0;->N1:La/wdk0;

    .line 152
    .line 153
    return-void

    .line 154
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 155
    .line 156
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/wlg0;->M1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final x0()Z
    .locals 2

    .line 1
    sget-object v0, La/wlg0;->Y1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/wlg0;->U1:La/cgx0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/wlg0;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
