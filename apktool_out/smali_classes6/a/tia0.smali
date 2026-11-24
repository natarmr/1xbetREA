.class public final La/tia0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/tia0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/fl70",
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
.field public static final R1:La/fl70;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:La/s0r;

.field public M1:La/foi;

.field public final N1:La/phf0;

.field public final O1:La/cgx0;

.field public final P1:La/a8z;

.field public final Q1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/tia0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    const-string v3, "gameId"

    .line 16
    .line 17
    const-string v5, "getGameId()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "fromPlayersMenu"

    .line 25
    .line 26
    const-string v6, "getFromPlayersMenu()Z"

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
    sput-object v1, La/tia0;->S1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/fl70;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/tia0;->R1:La/fl70;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

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
    sget-object v1, La/bp3;->a:La/bp3;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    const v2, 0x7f040b5d

    .line 14
    .line 15
    .line 16
    const v3, 0x7f040ae3

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/tia0;->K1:La/e9o0;

    .line 23
    .line 24
    sget-object v0, La/sia0;->a:La/sia0;

    .line 25
    .line 26
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, La/tia0;->L1:La/s0r;

    .line 31
    .line 32
    new-instance v0, La/phf0;

    .line 33
    .line 34
    const-string v1, "GAME_ID"

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, La/tia0;->N1:La/phf0;

    .line 40
    .line 41
    new-instance v0, La/cgx0;

    .line 42
    .line 43
    const-string v1, "FROM_PLAYERS_MENU"

    .line 44
    .line 45
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, La/tia0;->O1:La/cgx0;

    .line 49
    .line 50
    const-class v0, La/xja0;

    .line 51
    .line 52
    sget-object v1, La/sre0;->a:La/tre0;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    new-instance v1, La/l3a0;

    .line 59
    .line 60
    const/16 v2, 0x13

    .line 61
    .line 62
    invoke-direct {v1, p0, v2}, La/l3a0;-><init>(Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    const/16 v2, 0xe

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/tia0;->P1:La/a8z;

    .line 73
    .line 74
    const/4 v0, 0x1

    .line 75
    iput-boolean v0, p0, La/tia0;->Q1:Z

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    sget-object p1, La/tia0;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/tia0;->L1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/aid;

    .line 16
    .line 17
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/cz90;

    .line 20
    .line 21
    const/16 v1, 0x13

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, La/cz90;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance p0, La/ugd;

    .line 27
    .line 28
    const v1, -0x3a6c5160

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final C0()V
    .locals 5

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
    const-class v1, La/wba0;

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
    instance-of v3, v0, La/wba0;

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
    check-cast v2, La/wba0;

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
    const/4 v1, 0x1

    .line 60
    sget-object v3, La/tia0;->S1:[La/iiy;

    .line 61
    .line 62
    aget-object v1, v3, v1

    .line 63
    .line 64
    iget-object v4, p0, La/tia0;->N1:La/phf0;

    .line 65
    .line 66
    invoke-virtual {v4, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const/4 v4, 0x2

    .line 71
    aget-object v3, v3, v4

    .line 72
    .line 73
    iget-object v4, p0, La/tia0;->O1:La/cgx0;

    .line 74
    .line 75
    invoke-virtual {v4, p0, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-virtual {v2, v0, v1, v3}, La/wba0;->a(La/i1w0;Ljava/lang/String;Z)La/h6i;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object v0, v0, La/h6i;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, La/n5d0;

    .line 90
    .line 91
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, La/foi;

    .line 96
    .line 97
    iput-object v0, p0, La/tia0;->M1:La/foi;

    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 101
    .line 102
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/tia0;->Q1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/tia0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
