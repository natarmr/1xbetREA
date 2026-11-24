.class public final La/gs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g45;


# direct methods
.method public synthetic constructor <init>(La/g45;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gs;->a:La/g45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(DLa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/gk9;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/gk9;

    .line 7
    .line 8
    iget v1, v0, La/gk9;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/gk9;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/gk9;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/gk9;-><init>(La/gs;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/gk9;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/gk9;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-wide p1, v0, La/gk9;->i:D

    .line 37
    .line 38
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/gs;->a:La/g45;

    .line 53
    .line 54
    iget-object p0, p0, La/g45;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/lye;

    .line 57
    .line 58
    iget-object p0, p0, La/lye;->n:La/p7m0;

    .line 59
    .line 60
    iput-wide p1, v0, La/gk9;->i:D

    .line 61
    .line 62
    iput v3, v0, La/gk9;->l:I

    .line 63
    .line 64
    invoke-static {p0, v0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    if-ne p3, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    check-cast p3, La/en7;

    .line 72
    .line 73
    iget p0, p3, La/en7;->b:I

    .line 74
    .line 75
    if-nez p0, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    invoke-static {p1, p2, p0}, La/m7x;->p(DI)D

    .line 79
    .line 80
    .line 81
    move-result-wide p1

    .line 82
    :goto_2
    new-instance p0, Ljava/lang/Double;

    .line 83
    .line 84
    invoke-direct {p0, p1, p2}, Ljava/lang/Double;-><init>(D)V

    .line 85
    .line 86
    .line 87
    return-object p0
.end method

.method public b()V
    .locals 5

    .line 1
    iget-object p0, p0, La/gs;->a:La/g45;

    .line 2
    .line 3
    iget-object v0, p0, La/g45;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/ave;

    .line 6
    .line 7
    iget-object v1, v0, La/ave;->a:La/q4f;

    .line 8
    .line 9
    sget-object v2, La/q4f;->m:La/q4f;

    .line 10
    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    if-eq v1, v2, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, La/g45;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/lye;

    .line 18
    .line 19
    iget-object p0, p0, La/lye;->a:La/g0f;

    .line 20
    .line 21
    iget-wide v1, p0, La/g0f;->s:D

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p0, p0, La/g45;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/m0f;

    .line 27
    .line 28
    iget-object p0, p0, La/m0f;->a:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/g0f;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    iget-wide v1, p0, La/g0f;->s:D

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-wide v1, v3

    .line 42
    :goto_0
    cmpg-double p0, v1, v3

    .line 43
    .line 44
    if-nez p0, :cond_2

    .line 45
    .line 46
    iget-wide v1, v0, La/ave;->f:D

    .line 47
    .line 48
    :cond_2
    iput-wide v1, v0, La/ave;->e:D

    .line 49
    .line 50
    return-void
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    invoke-static {p1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, La/na20;

    .line 32
    .line 33
    iget-object v4, v3, La/na20;->a:Ljava/util/List;

    .line 34
    .line 35
    new-instance v5, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {v4, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_0

    .line 53
    .line 54
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 61
    .line 62
    .line 63
    move-result-wide v6

    .line 64
    new-instance v8, La/l820;

    .line 65
    .line 66
    iget-object v9, v3, La/na20;->b:La/i2o;

    .line 67
    .line 68
    iget-object v10, v3, La/na20;->c:Ljava/lang/String;

    .line 69
    .line 70
    invoke-direct {v8, v6, v7, v9, v10}, La/l820;-><init>(JLa/i2o;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_0
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    iget-object p0, p0, La/gs;->a:La/g45;

    .line 90
    .line 91
    iget-object p0, p0, La/g45;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p0, La/ave;

    .line 94
    .line 95
    iget-object p0, p0, La/ave;->n:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 98
    .line 99
    .line 100
    return-void
.end method
