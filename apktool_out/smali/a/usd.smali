.class public final La/usd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/f;
.implements La/xyk;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, La/a4j;->d:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/a4j;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, La/a4j;->b:Ljava/lang/String;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "aggregator_main"

    .line 15
    .line 16
    return-object p0
.end method

.method public static c(La/v500;La/q500;)F
    .locals 4

    .line 1
    invoke-interface {p1}, La/pwb;->getYChartMax()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p1}, La/pwb;->getYChartMin()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, La/q500;->getLineData()La/u500;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget v2, p0, La/v500;->p:F

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    cmpl-float v2, v2, v3

    .line 17
    .line 18
    if-lez v2, :cond_0

    .line 19
    .line 20
    iget v2, p0, La/v500;->q:F

    .line 21
    .line 22
    cmpg-float v2, v2, v3

    .line 23
    .line 24
    if-gez v2, :cond_0

    .line 25
    .line 26
    return v3

    .line 27
    :cond_0
    iget v2, p1, La/mwb;->a:F

    .line 28
    .line 29
    cmpl-float v2, v2, v3

    .line 30
    .line 31
    if-lez v2, :cond_1

    .line 32
    .line 33
    move v0, v3

    .line 34
    :cond_1
    iget p1, p1, La/mwb;->b:F

    .line 35
    .line 36
    cmpg-float p1, p1, v3

    .line 37
    .line 38
    if-gez p1, :cond_2

    .line 39
    .line 40
    move v1, v3

    .line 41
    :cond_2
    iget p0, p0, La/v500;->q:F

    .line 42
    .line 43
    cmpl-float p0, p0, v3

    .line 44
    .line 45
    if-ltz p0, :cond_3

    .line 46
    .line 47
    return v1

    .line 48
    :cond_3
    return v0
.end method

.method public static d(Landroidx/fragment/app/Fragment;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, La/n6r;->b()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, La/n6r;->c:La/glz;

    .line 12
    .line 13
    new-instance v1, La/tvj;

    .line 14
    .line 15
    new-instance v2, La/yfg;

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-direct {v2, p0, v3}, La/yfg;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    const/16 v3, 0x3b

    .line 23
    .line 24
    invoke-direct {v1, v2, p0, p0, v3}, La/tvj;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, La/glz;->a(La/blz;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static e(Landroidx/fragment/app/e;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/ebj;

    .line 8
    .line 9
    invoke-direct {v0}, La/ebj;-><init>()V

    .line 10
    .line 11
    .line 12
    sget-object v1, La/ebj;->j2:[La/iiy;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    aget-object v1, v1, v2

    .line 16
    .line 17
    iget-object v2, v0, La/ebj;->h2:La/phf0;

    .line 18
    .line 19
    invoke-virtual {v2, v0, v1, p1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string p1, "DataRetrievalErrorDialog"

    .line 23
    .line 24
    invoke-virtual {v0, p0, p1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public b()Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;
    .locals 3

    .line 1
    new-instance v0, La/c99;

    .line 2
    .line 3
    invoke-direct {v0, p0}, La/c99;-><init>(La/usd;)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {p0, v1, v0, v2}, Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;-><init>(Ljava/lang/String;La/xbf;Z)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method
