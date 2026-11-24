.class public final La/pj9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/qj9;


# direct methods
.method public constructor <init>(La/qj9;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, La/pj9;->a:La/qj9;

    return-void
.end method

.method public constructor <init>(La/qj9;La/uzc;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/pj9;->a:La/qj9;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public a(La/pbs0;)V
    .locals 7

    .line 1
    iget-object p0, p0, La/pj9;->a:La/qj9;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/qj9;->a:La/oj9;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/oj9;->a()La/qz40;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    move-object v1, v0

    .line 16
    check-cast v1, La/p7m0;

    .line 17
    .line 18
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, La/hj9;

    .line 24
    .line 25
    invoke-interface {v3}, La/hj9;->getData()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_3

    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, La/pbs0;

    .line 57
    .line 58
    if-eq v5, p1, :cond_4

    .line 59
    .line 60
    iget-object v5, v5, La/pbs0;->b:La/m97;

    .line 61
    .line 62
    iget-object v6, p1, La/pbs0;->b:La/m97;

    .line 63
    .line 64
    invoke-static {v5, v6}, La/oj9;->b(La/m97;La/m97;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    :goto_0
    new-instance v4, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-object v3, v4

    .line 80
    :cond_4
    :goto_1
    invoke-virtual {p0, v3}, La/oj9;->c(Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    new-instance v4, La/gj9;

    .line 84
    .line 85
    invoke-direct {v4, v3}, La/gj9;-><init>(Ljava/util/List;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_0

    .line 93
    .line 94
    return-void
.end method

.method public b(La/pbs0;)Z
    .locals 2

    .line 1
    iget-object p0, p0, La/pj9;->a:La/qj9;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/qj9;->a:La/oj9;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/oj9;->a()La/qz40;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/p7m0;

    .line 16
    .line 17
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/hj9;

    .line 22
    .line 23
    invoke-interface {p0}, La/hj9;->getData()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, La/pbs0;

    .line 51
    .line 52
    if-eq v0, p1, :cond_2

    .line 53
    .line 54
    iget-object v0, v0, La/pbs0;->b:La/m97;

    .line 55
    .line 56
    iget-object v1, p1, La/pbs0;->b:La/m97;

    .line 57
    .line 58
    invoke-static {v0, v1}, La/oj9;->b(La/m97;La/m97;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    :cond_2
    const/4 p0, 0x1

    .line 65
    return p0

    .line 66
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 67
    return p0
.end method
