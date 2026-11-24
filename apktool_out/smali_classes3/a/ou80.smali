.class public final La/ou80;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ou80;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/rl70",
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
.field public static final V1:La/rl70;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:La/s0r;

.field public M1:La/fiu0;

.field public N1:La/ii;

.field public O1:La/wdk0;

.field public P1:La/ynb;

.field public final Q1:La/khf0;

.field public final R1:La/cgx0;

.field public final S1:La/cgx0;

.field public final U1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ou80;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentPartTypeTwoGamesBinding;"

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
    const-string v3, "aggregatorScreenModel"

    .line 16
    .line 17
    const-string v5, "getAggregatorScreenModel()Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "fromSearch"

    .line 25
    .line 26
    const-string v6, "getFromSearch()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "shouldShowNavBar"

    .line 34
    .line 35
    const-string v7, "getShouldShowNavBar()Z"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/ou80;->W1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/rl70;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/ou80;->V1:La/rl70;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d027d

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040b5d

    .line 10
    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    const v3, 0x7f040ae3

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2}, La/e9o0;-><init>(III)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/ou80;->K1:La/e9o0;

    .line 21
    .line 22
    sget-object v0, La/mu80;->a:La/mu80;

    .line 23
    .line 24
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/ou80;->L1:La/s0r;

    .line 29
    .line 30
    new-instance v0, La/khf0;

    .line 31
    .line 32
    const-string v1, "AGGREGATOR_SCREEN_ITEM"

    .line 33
    .line 34
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, La/ou80;->Q1:La/khf0;

    .line 38
    .line 39
    new-instance v0, La/cgx0;

    .line 40
    .line 41
    const-string v1, "FROM_AGGREGATOR_SEARCH_ITEM"

    .line 42
    .line 43
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La/ou80;->R1:La/cgx0;

    .line 47
    .line 48
    new-instance v0, La/cgx0;

    .line 49
    .line 50
    const-string v1, "SHOULD_SHOW_NAV_BAR_ITEM"

    .line 51
    .line 52
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, La/ou80;->S1:La/cgx0;

    .line 56
    .line 57
    const-class v0, La/rv80;

    .line 58
    .line 59
    sget-object v1, La/sre0;->a:La/tre0;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    new-instance v1, La/lu80;

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    invoke-direct {v1, p0, v2}, La/lu80;-><init>(La/ou80;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/ou80;->U1:La/a8z;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, La/ex60;

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    invoke-direct {v0, p0, v1}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    const-string v1, "GAME_CLOSED_KEY"

    .line 16
    .line 17
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, La/lu80;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-direct {p1, p0, v0}, La/lu80;-><init>(La/ou80;B)V

    .line 24
    .line 25
    .line 26
    const-string v1, "REQUEST_BONUS_BALANCE_WARNING_DIALOG_KEY"

    .line 27
    .line 28
    invoke-static {p0, v1, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, La/ou80;->W1:[La/iiy;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    aget-object p1, p1, v1

    .line 35
    .line 36
    iget-object v1, p0, La/ou80;->L1:La/s0r;

    .line 37
    .line 38
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    check-cast p1, La/r2r;

    .line 46
    .line 47
    iget-object p1, p1, La/r2r;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 48
    .line 49
    new-instance v1, La/owp0;

    .line 50
    .line 51
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 52
    .line 53
    .line 54
    new-instance v2, La/ds60;

    .line 55
    .line 56
    const/16 v3, 0x13

    .line 57
    .line 58
    invoke-direct {v2, p0, v3}, La/ds60;-><init>(Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    new-instance p0, La/ugd;

    .line 62
    .line 63
    const v3, 0x2dc0c235

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final C0()V
    .locals 11

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
    const-class v1, La/is0;

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
    instance-of v3, v0, La/is0;

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
    move-object v3, v2

    .line 52
    check-cast v3, La/is0;

    .line 53
    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    sget-object v4, La/ir1;->c:La/ir1;

    .line 57
    .line 58
    const/4 v0, 0x1

    .line 59
    sget-object v1, La/ou80;->W1:[La/iiy;

    .line 60
    .line 61
    aget-object v0, v1, v0

    .line 62
    .line 63
    iget-object v2, p0, La/ou80;->Q1:La/khf0;

    .line 64
    .line 65
    invoke-virtual {v2, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    move-object v5, v0

    .line 70
    check-cast v5, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 71
    .line 72
    const-class v0, La/ou80;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    const/4 v0, 0x3

    .line 79
    aget-object v0, v1, v0

    .line 80
    .line 81
    iget-object v1, p0, La/ou80;->S1:La/cgx0;

    .line 82
    .line 83
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    const/4 v9, 0x0

    .line 92
    const/16 v10, 0x24

    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    invoke-static/range {v3 .. v10}, La/is0;->a(La/is0;La/lr1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/lang/String;Ljava/lang/String;ZLa/mdp;I)La/q7i;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, La/q7i;->c()La/fiu0;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iput-object v1, p0, La/ou80;->M1:La/fiu0;

    .line 104
    .line 105
    iget-object v1, v0, La/q7i;->a0:La/ii;

    .line 106
    .line 107
    iput-object v1, p0, La/ou80;->N1:La/ii;

    .line 108
    .line 109
    iget-object v1, v0, La/q7i;->c0:La/wdk0;

    .line 110
    .line 111
    iput-object v1, p0, La/ou80;->O1:La/wdk0;

    .line 112
    .line 113
    iget-object v0, v0, La/q7i;->b0:La/peg0;

    .line 114
    .line 115
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, La/yzn0;

    .line 118
    .line 119
    invoke-virtual {v0}, La/yzn0;->i()La/ynb;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, La/ou80;->P1:La/ynb;

    .line 127
    .line 128
    return-void

    .line 129
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 130
    .line 131
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ou80;->U1:La/a8z;

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

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ou80;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/qt80;->a:La/qt80;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x0()Z
    .locals 2

    .line 1
    sget-object v0, La/ou80;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ou80;->S1:La/cgx0;

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
    iget-object p0, p0, La/ou80;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
