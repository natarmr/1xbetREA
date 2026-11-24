.class public final La/vjp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pru;


# direct methods
.method public synthetic constructor <init>(La/pru;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/vjp;->a:La/pru;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/pru;La/kys0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, La/vjp;->a:La/pru;

    return-void
.end method


# virtual methods
.method public a(La/j700;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v3, La/xun;->a:La/xun;

    .line 5
    .line 6
    const-wide/16 v4, -0x1

    .line 7
    .line 8
    const-string v6, ""

    .line 9
    .line 10
    sget-object v2, La/y8h0;->a:La/y8h0;

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    move-object v1, p1

    .line 14
    invoke-virtual/range {v0 .. v6}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    move-object v2, p1

    .line 14
    move-object v3, p2

    .line 15
    move-object v4, p3

    .line 16
    move-wide v5, p4

    .line 17
    move-object v7, p6

    .line 18
    invoke-virtual/range {v0 .. v7}, La/vjp;->c(Ljava/lang/String;La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public c(Ljava/lang/String;La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/vjp;->a:La/pru;

    .line 14
    .line 15
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/sff0;->c:La/ech;

    .line 20
    .line 21
    iget-boolean p0, p0, La/ech;->d:Z

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    const-wide/16 v0, 0xbd

    .line 26
    .line 27
    cmp-long p0, p5, v0

    .line 28
    .line 29
    if-nez p0, :cond_0

    .line 30
    .line 31
    invoke-interface {p4}, Ljava/util/Set;->size()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    const/4 p5, 0x1

    .line 36
    if-ne p0, p5, :cond_0

    .line 37
    .line 38
    check-cast p4, Ljava/lang/Iterable;

    .line 39
    .line 40
    invoke-static {p4}, Lkotlin/collections/CollectionsKt;->T(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide p0

    .line 50
    new-instance p2, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;

    .line 51
    .line 52
    invoke-direct {p2, p0, p1, p7}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;-><init>(JLjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object p2

    .line 56
    :cond_0
    new-instance p0, Lorg/xplatform/feed/navigation/FeedScreenFactoryImpl$getFeedChampionshipScreen$1;

    .line 57
    .line 58
    invoke-direct {p0, p2, p3, p1, p4}, Lorg/xplatform/feed/navigation/FeedScreenFactoryImpl$getFeedChampionshipScreen$1;-><init>(La/j700;La/f9h0;Ljava/lang/String;Ljava/util/Set;)V

    .line 59
    .line 60
    .line 61
    return-object p0
.end method

.method public d()La/k77;
    .locals 1

    .line 1
    iget-object p0, p0, La/vjp;->a:La/pru;

    .line 2
    .line 3
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/sff0;->g:La/mum0;

    .line 8
    .line 9
    iget-object p0, p0, La/mum0;->u:La/k77;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_4

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    if-eq p0, v0, :cond_3

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    if-eq p0, v0, :cond_2

    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    if-eq p0, v0, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    if-eq p0, v0, :cond_0

    .line 28
    .line 29
    sget-object p0, La/k77;->g:La/k77;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    sget-object p0, La/k77;->f:La/k77;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    sget-object p0, La/k77;->e:La/k77;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_2
    sget-object p0, La/k77;->d:La/k77;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_3
    sget-object p0, La/k77;->c:La/k77;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_4
    sget-object p0, La/k77;->b:La/k77;

    .line 45
    .line 46
    return-object p0
.end method

.method public e()La/v5l0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vjp;->a:La/pru;

    .line 2
    .line 3
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/sff0;->g:La/mum0;

    .line 8
    .line 9
    iget-object p0, p0, La/mum0;->y:La/v5l0;

    .line 10
    .line 11
    return-object p0
.end method
