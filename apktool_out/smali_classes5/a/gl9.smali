.class public final La/gl9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7m0;

.field public final b:La/p7m0;

.field public final c:La/p7m0;

.field public final d:La/a1g;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iput-object v1, p0, La/gl9;->a:La/p7m0;

    .line 10
    .line 11
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iput-object v2, p0, La/gl9;->b:La/p7m0;

    .line 16
    .line 17
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iput-object v3, p0, La/gl9;->c:La/p7m0;

    .line 22
    .line 23
    new-instance v4, La/fl9;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-direct {v4, p0, v0, v5}, La/fl9;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2, v3, v4}, La/dub;->f0(La/gmq;La/gmq;La/gmq;La/ydr;)La/a1g;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, La/gl9;->d:La/a1g;

    .line 34
    .line 35
    return-void
.end method

.method public static a(Ljava/util/Set;)Ljava/util/Set;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p0, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_5

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, La/ofj;

    .line 23
    .line 24
    iget-object v2, v1, La/ofj;->a:Ljava/util/Date;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, La/ofj;

    .line 31
    .line 32
    iget-object v3, v1, La/ofj;->a:Ljava/util/Date;

    .line 33
    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    iget-boolean v4, v2, La/ofj;->b:Z

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    const/4 v6, 0x0

    .line 40
    if-nez v4, :cond_1

    .line 41
    .line 42
    iget-boolean v4, v1, La/ofj;->b:Z

    .line 43
    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    move v4, v6

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    :goto_1
    move v4, v5

    .line 50
    :goto_2
    iget-boolean v7, v2, La/ofj;->c:Z

    .line 51
    .line 52
    if-nez v7, :cond_3

    .line 53
    .line 54
    iget-boolean v1, v1, La/ofj;->c:Z

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_2
    move v5, v6

    .line 60
    :cond_3
    :goto_3
    iget-object v1, v2, La/ofj;->a:Ljava/util/Date;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v2, La/ofj;

    .line 66
    .line 67
    invoke-direct {v2, v1, v4, v5}, La/ofj;-><init>(Ljava/util/Date;ZZ)V

    .line 68
    .line 69
    .line 70
    move-object v1, v2

    .line 71
    :cond_4
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Ljava/lang/Iterable;

    .line 80
    .line 81
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method

.method public static b(Ljava/util/HashMap;Lkotlin/Pair;ZZ)V
    .locals 6

    .line 1
    iget-object v0, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 2
    .line 3
    const-wide/16 v1, -0x141

    .line 4
    .line 5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    :cond_0
    move-object v3, v2

    .line 21
    check-cast v3, Ljava/util/Set;

    .line 22
    .line 23
    new-instance v4, La/ofj;

    .line 24
    .line 25
    move-object v5, v0

    .line 26
    check-cast v5, Ljava/util/Date;

    .line 27
    .line 28
    invoke-direct {v4, v5, p2, p3}, La/ofj;-><init>(Ljava/util/Date;ZZ)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iget-object p1, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    :cond_1
    move-object v2, v1

    .line 51
    check-cast v2, Ljava/util/Set;

    .line 52
    .line 53
    new-instance v3, La/ofj;

    .line 54
    .line 55
    check-cast v0, Ljava/util/Date;

    .line 56
    .line 57
    invoke-direct {v3, v0, p2, p3}, La/ofj;-><init>(Ljava/util/Date;ZZ)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    return-void
.end method
