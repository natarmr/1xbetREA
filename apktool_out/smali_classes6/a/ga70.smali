.class public final La/ga70;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:La/vby;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;La/vby;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iput-object p2, p0, La/ga70;->b:La/vby;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final GPWebAppInit(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/b870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/dgr;->Companion:La/cgr;

    .line 13
    .line 14
    invoke-virtual {v2}, La/cgr;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/dgr;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/b870;-><init>(La/dgr;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final GPWebAppRefreshPage(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/c870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/ggr;->Companion:La/fgr;

    .line 13
    .line 14
    invoke-virtual {v2}, La/fgr;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/ggr;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/c870;-><init>(La/ggr;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final GPWebAppSetDemoStatus(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/d870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/sgr;->Companion:La/rgr;

    .line 13
    .line 14
    invoke-virtual {v2}, La/rgr;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/sgr;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/d870;-><init>(La/sgr;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final GPWebAppSetFreezeAccount(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/e870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/vgr;->Companion:La/ugr;

    .line 13
    .line 14
    invoke-virtual {v2}, La/ugr;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/vgr;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/e870;-><init>(La/vgr;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final GPWebAppSetGameUnderMaintenance(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/f870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/bhr;->Companion:La/ahr;

    .line 13
    .line 14
    invoke-virtual {v2}, La/ahr;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/bhr;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/f870;-><init>(La/bhr;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final GPWebAppSetPageLoaded(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/g870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/ehr;->Companion:La/dhr;

    .line 13
    .line 14
    invoke-virtual {v2}, La/dhr;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/ehr;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/g870;-><init>(La/ehr;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final GPWebAppSetPageTitle(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/h870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/hhr;->Companion:La/ghr;

    .line 13
    .line 14
    invoke-virtual {v2}, La/ghr;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/hhr;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/h870;-><init>(La/hhr;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final GPWebAppSetRoute(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/i870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/khr;->Companion:La/jhr;

    .line 13
    .line 14
    invoke-virtual {v2}, La/jhr;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/khr;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/i870;-><init>(La/khr;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final GPWebAppSetUserAccountBalance(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/j870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/qhr;->Companion:La/phr;

    .line 13
    .line 14
    invoke-virtual {v2}, La/phr;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/qhr;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/j870;-><init>(La/qhr;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final GPWebAppShowAuthenticationFailed(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/k870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/thr;->Companion:La/shr;

    .line 13
    .line 14
    invoke-virtual {v2}, La/shr;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/thr;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/k870;-><init>(La/thr;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final GPWebAppShowAuthenticationRequired(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/l870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/whr;->Companion:La/vhr;

    .line 13
    .line 14
    invoke-virtual {v2}, La/vhr;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/whr;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/l870;-><init>(La/whr;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final GPWebAppShowGameBonus(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/m870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/zhr;->Companion:La/yhr;

    .line 13
    .line 14
    invoke-virtual {v2}, La/yhr;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/zhr;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/m870;-><init>(La/zhr;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final GPWebAppShowGameState(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/n870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/cir;->Companion:La/bir;

    .line 13
    .line 14
    invoke-virtual {v2}, La/bir;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/cir;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/n870;-><init>(La/cir;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final GPWebAppSuggestRefreshPage(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, La/o870;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, La/ga70;->b:La/vby;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/fir;->Companion:La/eir;

    .line 13
    .line 14
    invoke-virtual {v2}, La/eir;->serializer()La/jiy;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/jiy;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, La/fir;

    .line 25
    .line 26
    invoke-direct {v0, p1}, La/o870;-><init>(La/fir;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/ga70;->a:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method
