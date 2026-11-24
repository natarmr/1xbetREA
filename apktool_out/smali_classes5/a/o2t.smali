.class public abstract La/o2t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/fragment/app/e;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "GamesActionsFragmentResultModel.UM_RESULT_KEY"

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final b(Landroidx/fragment/app/e;JLjava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$OneXGamesGameUnderMaintenance;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2}, Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel$OneXGamesGameUnderMaintenance;-><init>(J)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0, p3}, La/o2t;->c(Landroidx/fragment/app/e;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final c(Landroidx/fragment/app/e;Lorg/xplatform/games_section/api/models/GamesActionsFragmentResultModel;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-string v0, "GamesActionsFragmentResultModel.UM_RESULT_KEY"

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    new-instance v0, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "GamesActionsFragmentResultModel.UM_RESULT_BUNDLE_KEY"

    .line 19
    .line 20
    invoke-static {v1, v0, p1}, La/lv00;->S(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, p2}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static final d(Landroidx/fragment/app/e;La/clz;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-string v0, "GamesActionsFragmentResultModel.UM_RESULT_KEY"

    .line 8
    .line 9
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, La/kto;

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    invoke-direct {v1, v2, p2, p3}, La/kto;-><init>(BLjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, p1, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static e(Landroidx/fragment/app/e;La/clz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/bm60;I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p5, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p2, La/vls;

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    invoke-direct {p2, v0}, La/vls;-><init>(B)V

    .line 10
    .line 11
    .line 12
    :cond_0
    and-int/lit8 p5, p5, 0x10

    .line 13
    .line 14
    if-eqz p5, :cond_1

    .line 15
    .line 16
    new-instance p4, La/sqs;

    .line 17
    .line 18
    const/16 p5, 0x17

    .line 19
    .line 20
    invoke-direct {p4, p5}, La/sqs;-><init>(B)V

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance p5, La/f8m;

    .line 30
    .line 31
    const/16 v0, 0x1b

    .line 32
    .line 33
    invoke-direct {p5, v0, p4, p3, p2}, La/f8m;-><init>(BLjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 34
    .line 35
    .line 36
    const-string p2, ""

    .line 37
    .line 38
    invoke-static {p0, p1, p2, p5}, La/o2t;->d(Landroidx/fragment/app/e;La/clz;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method
