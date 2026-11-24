.class public final La/y370;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/jhg0;
.implements La/cg60;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "La/y370;",
        "La/yx5;",
        "La/jhg0;",
        "La/cg60;",
        "<init>",
        "()V",
        "a/wsz",
        "games_list"
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
.field public static final Y1:La/wsz;

.field public static final synthetic Z1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/hdo0;

.field public M1:La/oeg0;

.field public N1:La/uf3;

.field public final O1:Z

.field public final P1:La/phf0;

.field public final Q1:La/phf0;

.field public final R1:La/cgx0;

.field public final S1:La/r34;

.field public final U1:La/zz2;

.field public final V1:La/a8z;

.field public final W1:La/a8z;

.field public final X1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/y370;

    .line 4
    .line 5
    const-string v2, "tabTag"

    .line 6
    .line 7
    const-string v3, "getTabTag()Ljava/lang/String;"

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
    const-string v3, "webGameSessionId"

    .line 16
    .line 17
    const-string v5, "getWebGameSessionId()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "restoredFragment"

    .line 25
    .line 26
    const-string v6, "getRestoredFragment()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "gameIdToOpen"

    .line 34
    .line 35
    const-string v7, "getGameIdToOpen()J"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "promoTypeId"

    .line 43
    .line 44
    const-string v8, "getPromoTypeId()I"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/y370;->Z1:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/wsz;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/y370;->Y1:La/wsz;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    const v0, 0x7f0d0504

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/y370;->K1:La/i9o0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, La/y370;->O1:Z

    .line 13
    .line 14
    new-instance v1, La/phf0;

    .line 15
    .line 16
    const-string v2, "ARG_TAB_TAG"

    .line 17
    .line 18
    invoke-direct {v1, v2}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, La/y370;->P1:La/phf0;

    .line 22
    .line 23
    new-instance v1, La/phf0;

    .line 24
    .line 25
    const-string v2, "WEB_GAME_SESSION_ID"

    .line 26
    .line 27
    invoke-direct {v1, v2}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, La/y370;->Q1:La/phf0;

    .line 31
    .line 32
    new-instance v1, La/cgx0;

    .line 33
    .line 34
    const-string v2, "ARG_RESTORED_FRAGMENT"

    .line 35
    .line 36
    invoke-direct {v1, v2}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, La/y370;->R1:La/cgx0;

    .line 40
    .line 41
    new-instance v1, La/r34;

    .line 42
    .line 43
    const-string v2, "ARG_GAME_ID"

    .line 44
    .line 45
    const-wide/16 v3, 0x0

    .line 46
    .line 47
    invoke-direct {v1, v2, v3, v4}, La/r34;-><init>(Ljava/lang/String;J)V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, La/y370;->S1:La/r34;

    .line 51
    .line 52
    new-instance v1, La/zz2;

    .line 53
    .line 54
    const-string v2, "ARG_PROMO_TYPE_ID"

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    invoke-direct {v1, v2, v3}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    iput-object v1, p0, La/y370;->U1:La/zz2;

    .line 61
    .line 62
    new-instance v1, La/x370;

    .line 63
    .line 64
    invoke-direct {v1, p0, v3}, La/x370;-><init>(La/y370;B)V

    .line 65
    .line 66
    .line 67
    sget-object v2, La/wez;->b:La/wez;

    .line 68
    .line 69
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, p0, La/y370;->V1:La/a8z;

    .line 74
    .line 75
    new-instance v1, La/x370;

    .line 76
    .line 77
    invoke-direct {v1, p0, v0}, La/x370;-><init>(La/y370;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, La/y370;->W1:La/a8z;

    .line 85
    .line 86
    new-instance v0, La/x370;

    .line 87
    .line 88
    const/4 v1, 0x2

    .line 89
    invoke-direct {v0, p0, v1}, La/x370;-><init>(La/y370;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, La/y370;->X1:La/n0o0;

    .line 97
    .line 98
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 3

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
    instance-of v1, v0, La/vmv;

    .line 10
    .line 11
    const-string v2, "Can not find dependencies provider for "

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    check-cast v0, La/vmv;

    .line 16
    .line 17
    check-cast v0, Lorg/platform/app/ApplicationLoader;

    .line 18
    .line 19
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-static {p0}, La/a4n0;->e(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v2, La/pmi;

    .line 39
    .line 40
    invoke-direct {v2, v0, v1}, La/pmi;-><init>(La/g8i;La/i1w0;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, v0, La/g8i;->h5:La/n5d0;

    .line 44
    .line 45
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, La/hdo0;

    .line 50
    .line 51
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, La/y370;->L1:La/hdo0;

    .line 55
    .line 56
    iget-object v1, v0, La/g8i;->w3:La/n5d0;

    .line 57
    .line 58
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, La/oeg0;

    .line 63
    .line 64
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object v1, p0, La/y370;->M1:La/oeg0;

    .line 68
    .line 69
    invoke-virtual {v0}, La/g8i;->T()La/uf3;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, p0, La/y370;->N1:La/uf3;

    .line 74
    .line 75
    invoke-virtual {v0}, La/g8i;->h4()La/r9u;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_0
    const-string p0, "null cannot be cast to non-null type org.xplatform.core.di.dependencies.OneXGamesDependencies"

    .line 84
    .line 85
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_1
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    sget-object v1, La/y370;->Z1:[La/iiy;

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    aget-object v1, v1, v2

    .line 10
    .line 11
    iget-object v2, p0, La/y370;->R1:La/cgx0;

    .line 12
    .line 13
    invoke-virtual {v2, p0, v1, v0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, La/ex60;

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    invoke-direct {v0, p0, v1}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    const-string v1, "CHANGE_TAB_REQUEST_KEY"

    .line 30
    .line 31
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    new-instance v0, La/zz;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const/4 v6, 0x1

    .line 48
    const/4 v7, 0x1

    .line 49
    const/4 v1, 0x1

    .line 50
    const-class v3, La/o2t;

    .line 51
    .line 52
    const-string v4, "sendUMResult"

    .line 53
    .line 54
    const-string v5, "sendUMResult(Landroidx/fragment/app/FragmentManager;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V"

    .line 55
    .line 56
    invoke-direct/range {v0 .. v7}, La/zz;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 57
    .line 58
    .line 59
    const-string v1, "OneXGamesTabContainerFragment.UM_RESULT_KEY"

    .line 60
    .line 61
    invoke-static {p1, p0, v1, v0}, La/o2t;->d(Landroidx/fragment/app/e;La/clz;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 62
    .line 63
    .line 64
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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v0, "GamesActionsFragmentResultModel.UM_RESULT_KEYOneXGamesTabContainerFragment.UM_RESULT_KEY"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/y370;->W1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/ejc;

    .line 8
    .line 9
    iget-object v0, v0, La/ejc;->a:La/i1w0;

    .line 10
    .line 11
    iget-object v0, v0, La/i1w0;->a:La/cu;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-object v1, v0, La/cu;->b:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v0, p0, La/y370;->M1:La/oeg0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    sget-object v1, La/ghg0;->a:La/ghg0;

    .line 21
    .line 22
    iget-object v0, v0, La/oeg0;->a:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string p0, "rootRouterHolder"

    .line 32
    .line 33
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1
.end method

.method public final e0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/y370;->M1:La/oeg0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, La/y370;->W1:La/a8z;

    .line 9
    .line 10
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, La/ejc;

    .line 15
    .line 16
    iget-object v2, v2, La/ejc;->a:La/i1w0;

    .line 17
    .line 18
    sget-object v3, La/ghg0;->a:La/ghg0;

    .line 19
    .line 20
    invoke-virtual {v0, v3, v2}, La/oeg0;->a(La/ihg0;La/i1w0;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/ejc;

    .line 28
    .line 29
    iget-object v0, v0, La/ejc;->a:La/i1w0;

    .line 30
    .line 31
    iget-object v0, v0, La/i1w0;->a:La/cu;

    .line 32
    .line 33
    iget-object p0, p0, La/y370;->X1:La/n0o0;

    .line 34
    .line 35
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/rs3;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, La/cu;->q(La/rs3;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    const-string p0, "rootRouterHolder"

    .line 46
    .line 47
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    throw p0
.end method

.method public final getRouter()La/i1w0;
    .locals 0

    .line 1
    iget-object p0, p0, La/y370;->W1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ejc;

    .line 8
    .line 9
    iget-object p0, p0, La/ejc;->a:La/i1w0;

    .line 10
    .line 11
    return-object p0
.end method

.method public final j()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f0a0adb

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v1, v0, La/cg60;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast v0, La/cg60;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    const/4 v1, 0x1

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, La/cg60;->j()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v0, v1

    .line 29
    :goto_1
    const/4 v2, 0x0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    goto :goto_4

    .line 33
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroidx/fragment/app/e;->P()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 42
    .line 43
    if-gt v0, v1, :cond_3

    .line 44
    .line 45
    invoke-static {p0}, La/a4n0;->e(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v1, La/c8d;

    .line 54
    .line 55
    sget-object v4, La/y7d;->a:La/v7d;

    .line 56
    .line 57
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :goto_2
    move-object v1, v0

    .line 65
    check-cast v1, La/paw;

    .line 66
    .line 67
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, La/oe50;

    .line 78
    .line 79
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    iget-object p0, p0, La/y370;->W1:La/a8z;

    .line 84
    .line 85
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, La/ejc;

    .line 90
    .line 91
    iget-object p0, p0, La/ejc;->a:La/i1w0;

    .line 92
    .line 93
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    new-instance v1, La/c8d;

    .line 99
    .line 100
    sget-object v4, La/y7d;->a:La/v7d;

    .line 101
    .line 102
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 103
    .line 104
    .line 105
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :goto_3
    move-object v1, v0

    .line 110
    check-cast v1, La/paw;

    .line 111
    .line 112
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_4

    .line 117
    .line 118
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v1, La/oe50;

    .line 123
    .line 124
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_4
    :goto_4
    return v2
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/y370;->O1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/y370;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
