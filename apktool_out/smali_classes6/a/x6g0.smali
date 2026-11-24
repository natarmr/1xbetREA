.class public final La/x6g0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/x6g0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/lme0",
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
.field public static final Q1:La/lme0;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/fiu0;

.field public final M1:Z

.field public final N1:La/phf0;

.field public final O1:La/r34;

.field public final P1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/x6g0;

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
    const-string v5, "sportId"

    .line 25
    .line 26
    const-string v6, "getSportId()J"

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
    sput-object v1, La/x6g0;->R1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/lme0;

    .line 45
    .line 46
    const/16 v1, 0x8

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/lme0;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/x6g0;->Q1:La/lme0;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/w6g0;->a:La/w6g0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/x6g0;->K1:La/s0r;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, La/x6g0;->M1:Z

    .line 17
    .line 18
    new-instance v0, La/phf0;

    .line 19
    .line 20
    const-string v1, "GAME_ID_KEY"

    .line 21
    .line 22
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, La/x6g0;->N1:La/phf0;

    .line 26
    .line 27
    new-instance v0, La/r34;

    .line 28
    .line 29
    const-string v1, "SPORT_ID_KEY"

    .line 30
    .line 31
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, La/x6g0;->O1:La/r34;

    .line 35
    .line 36
    const-class v0, La/m8g0;

    .line 37
    .line 38
    sget-object v1, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, La/tie0;

    .line 45
    .line 46
    const/16 v2, 0x1d

    .line 47
    .line 48
    invoke-direct {v1, p0, v2}, La/tie0;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La/x6g0;->P1:La/a8z;

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 9

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
    const-class v1, La/v6g0;

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
    instance-of v3, v0, La/v6g0;

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
    check-cast v3, La/v6g0;

    .line 53
    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    sget-object v1, La/x6g0;->R1:[La/iiy;

    .line 58
    .line 59
    aget-object v0, v1, v0

    .line 60
    .line 61
    iget-object v2, p0, La/x6g0;->N1:La/phf0;

    .line 62
    .line 63
    invoke-virtual {v2, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    const/4 v0, 0x2

    .line 68
    aget-object v0, v1, v0

    .line 69
    .line 70
    iget-object v1, p0, La/x6g0;->O1:La/r34;

    .line 71
    .line 72
    invoke-virtual {v1, p0, v0}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    const-string v8, ""

    .line 85
    .line 86
    invoke-virtual/range {v3 .. v8}, La/v6g0;->a(JLa/i1w0;Ljava/lang/String;Ljava/lang/String;)La/v5i;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, La/v5i;->o()La/fiu0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, La/x6g0;->L1:La/fiu0;

    .line 95
    .line 96
    return-void

    .line 97
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 98
    .line 99
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, La/x6g0;->R1:[La/iiy;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    aget-object p1, p1, p2

    .line 11
    .line 12
    iget-object p2, p0, La/x6g0;->K1:La/s0r;

    .line 13
    .line 14
    invoke-virtual {p2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast p1, La/aid;

    .line 22
    .line 23
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 24
    .line 25
    new-instance p2, La/dke0;

    .line 26
    .line 27
    const/16 v0, 0xd

    .line 28
    .line 29
    invoke-direct {p2, p0, v0}, La/dke0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    new-instance p0, La/ugd;

    .line 33
    .line 34
    const v0, -0x170e72c9

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {p0, v0, v1, p2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const/4 p2, 0x0

    .line 42
    invoke-static {p1, p2, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/x6g0;->M1:Z

    .line 2
    .line 3
    return p0
.end method
