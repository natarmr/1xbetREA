.class public final La/jfu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pru;


# direct methods
.method public synthetic constructor <init>(La/pru;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jfu;->a:La/pru;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(La/sff0;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_7

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La/amb0;

    .line 21
    .line 22
    sget-object v2, La/amb0;->b:La/amb0;

    .line 23
    .line 24
    if-ne v1, v2, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    sget-object v2, La/amb0;->c:La/amb0;

    .line 28
    .line 29
    if-ne v1, v2, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    iget-object v2, p0, La/sff0;->c:La/ech;

    .line 33
    .line 34
    iget-object v2, v2, La/ech;->a:La/hdh;

    .line 35
    .line 36
    iget-boolean v2, v2, La/hdh;->a:Z

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    sget-object v2, La/amb0;->d:La/amb0;

    .line 41
    .line 42
    if-ne v1, v2, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    iget-object v2, p0, La/sff0;->d:La/q1w0;

    .line 46
    .line 47
    iget-object v2, v2, La/q1w0;->a:La/dyv0;

    .line 48
    .line 49
    iget-boolean v2, v2, La/dyv0;->a:Z

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    sget-object v2, La/amb0;->f:La/amb0;

    .line 54
    .line 55
    if-ne v1, v2, :cond_4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_4
    sget-object v2, La/amb0;->e:La/amb0;

    .line 59
    .line 60
    if-ne v1, v2, :cond_5

    .line 61
    .line 62
    iget-object v1, p0, La/sff0;->b:La/hl1;

    .line 63
    .line 64
    iget-boolean v3, v1, La/hl1;->C:Z

    .line 65
    .line 66
    if-nez v3, :cond_6

    .line 67
    .line 68
    iget-object v1, v1, La/hl1;->a:La/f61;

    .line 69
    .line 70
    iget-boolean v1, v1, La/f61;->b:Z

    .line 71
    .line 72
    if-eqz v1, :cond_5

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_5
    const/4 v2, 0x0

    .line 76
    :cond_6
    :goto_1
    if-eqz v2, :cond_0

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_7
    return-object v0
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 5

    .line 1
    iget-object p0, p0, La/jfu;->a:La/pru;

    .line 2
    .line 3
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object v0, p0, La/sff0;->L:La/rib0;

    .line 8
    .line 9
    iget-object v0, v0, La/rib0;->g:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {p0, v0}, La/jfu;->a(La/sff0;Ljava/util/List;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    sget-object v0, La/amb0;->b:La/amb0;

    .line 22
    .line 23
    sget-object v1, La/amb0;->c:La/amb0;

    .line 24
    .line 25
    sget-object v2, La/amb0;->d:La/amb0;

    .line 26
    .line 27
    sget-object v3, La/amb0;->e:La/amb0;

    .line 28
    .line 29
    sget-object v4, La/amb0;->f:La/amb0;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2, v3, v4}, [La/amb0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p0, v0}, La/jfu;->a(La/sff0;Ljava/util/List;)Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_0
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method
