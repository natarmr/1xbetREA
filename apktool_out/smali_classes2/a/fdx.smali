.class public abstract La/fdx;
.super La/nw70;
.source "SourceFile"


# virtual methods
.method public final a(La/htw;Ljava/lang/String;La/j;)V
    .locals 5

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, p3}, La/nw70;->c(La/htw;Ljava/lang/String;La/j;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3}, La/fdx;->d(La/j;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_4

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/j;

    .line 26
    .line 27
    instance-of v2, v1, La/fiz;

    .line 28
    .line 29
    if-eqz v2, :cond_3

    .line 30
    .line 31
    iget-object v2, v1, La/j;->a:La/ar20;

    .line 32
    .line 33
    iget-object v3, p1, La/htw;->a:La/dgu;

    .line 34
    .line 35
    iget-object v4, v3, La/dgu;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, Ljava/util/HashMap;

    .line 38
    .line 39
    iget-object v3, v3, La/dgu;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, La/qjt;

    .line 48
    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    invoke-interface {v4, p1, v3, v1}, La/qjt;->a(La/htw;Ljava/lang/String;La/j;)V

    .line 52
    .line 53
    .line 54
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const/4 v4, 0x0

    .line 58
    :goto_1
    if-nez v4, :cond_0

    .line 59
    .line 60
    sget-object v4, La/cy2;->z:La/ar20;

    .line 61
    .line 62
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    const-string v1, ""

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    sget-object v2, La/tzn;->a:Ljava/util/Map;

    .line 72
    .line 73
    invoke-static {v1, v3}, La/dwi0;->N(La/j;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const/4 v2, 0x1

    .line 78
    invoke-static {v1, v2, v2}, La/tzn;->a(Ljava/lang/CharSequence;ZZ)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    :goto_2
    invoke-virtual {p1, v1}, La/htw;->f0(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    invoke-static {v1, p1}, La/aad;->F(La/j;La/x9x;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    invoke-virtual {p0, p1, p2, p3}, La/nw70;->b(La/htw;Ljava/lang/String;La/j;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public d(La/j;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, La/j;->a()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method
