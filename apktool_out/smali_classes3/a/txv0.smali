.class public final La/txv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pf80;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:La/ob50;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:La/mwv0;

.field public final f:La/nwv0;

.field public final g:Lkotlin/jvm/functions/Function0;

.field public final h:Ljava/util/List;

.field public final i:La/ugd;


# direct methods
.method public constructor <init>(Ljava/lang/Object;La/ob50;Ljava/util/List;Ljava/util/List;La/mwv0;La/nwv0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/txv0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p2, p0, La/txv0;->b:La/ob50;

    .line 19
    .line 20
    iput-object p3, p0, La/txv0;->c:Ljava/util/List;

    .line 21
    .line 22
    iput-object p4, p0, La/txv0;->d:Ljava/util/List;

    .line 23
    .line 24
    iput-object p5, p0, La/txv0;->e:La/mwv0;

    .line 25
    .line 26
    iput-object p6, p0, La/txv0;->f:La/nwv0;

    .line 27
    .line 28
    iput-object p7, p0, La/txv0;->g:Lkotlin/jvm/functions/Function0;

    .line 29
    .line 30
    iput-object p7, p5, La/mwv0;->d:Lkotlin/jvm/functions/Function0;

    .line 31
    .line 32
    invoke-static {p2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, La/txv0;->h:Ljava/util/List;

    .line 37
    .line 38
    new-instance p1, La/sxv0;

    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    invoke-direct {p1, p0, p2}, La/sxv0;-><init>(La/txv0;B)V

    .line 42
    .line 43
    .line 44
    new-instance p2, La/ugd;

    .line 45
    .line 46
    const p3, 0x133dcc76

    .line 47
    .line 48
    .line 49
    const/4 p4, 0x1

    .line 50
    invoke-direct {p2, p3, p4, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p2, p0, La/txv0;->i:La/ugd;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/txv0;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/txv0;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()Lkotlin/Unit;
    .locals 6

    .line 1
    iget-object v0, p0, La/txv0;->e:La/mwv0;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, La/mwv0;->a:La/pz40;

    .line 4
    .line 5
    check-cast v1, La/hgk0;

    .line 6
    .line 7
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, La/ywv0;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v2, v1, La/ywv0;->j:La/ruv0;

    .line 16
    .line 17
    invoke-virtual {v2}, La/ruv0;->c()V

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, La/ywv0;->h:La/buv0;

    .line 21
    .line 22
    iget-object v3, v2, La/buv0;->k:La/cuv0;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x1

    .line 29
    invoke-virtual {v2, v3, v4, v5}, La/buv0;->a(La/cuv0;FZ)V

    .line 30
    .line 31
    .line 32
    iget-object v1, v1, La/ywv0;->d:La/glt0;

    .line 33
    .line 34
    sget-object v2, La/jxv0;->a:La/jxv0;

    .line 35
    .line 36
    iget-object v1, v1, La/glt0;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, La/pz40;

    .line 39
    .line 40
    check-cast v1, La/hgk0;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, La/hgk0;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception p0

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    :goto_0
    iget-object v0, p0, La/txv0;->b:La/ob50;

    .line 49
    .line 50
    iget-object v0, v0, La/ob50;->b:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, La/txv0;->f:La/nwv0;

    .line 56
    .line 57
    iget-object v1, p0, La/nwv0;->a:Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, La/mwv0;

    .line 64
    .line 65
    if-nez v0, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    iget-object p0, p0, La/nwv0;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :goto_2
    iget-object v0, v0, La/mwv0;->b:La/qoj0;

    .line 77
    .line 78
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    throw p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/txv0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/txv0;

    .line 10
    .line 11
    iget-object v0, p1, La/txv0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v1, p0, La/txv0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, La/txv0;->c:Ljava/util/List;

    .line 22
    .line 23
    iget-object v1, p1, La/txv0;->c:Ljava/util/List;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, La/txv0;->d:Ljava/util/List;

    .line 32
    .line 33
    iget-object v1, p1, La/txv0;->d:Ljava/util/List;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object p0, p0, La/txv0;->b:La/ob50;

    .line 42
    .line 43
    iget-object p0, p0, La/ob50;->b:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p1, p1, La/txv0;->b:La/ob50;

    .line 46
    .line 47
    iget-object p1, p1, La/ob50;->b:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    :goto_0
    const/4 p0, 0x1

    .line 56
    return p0

    .line 57
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 58
    return p0
.end method

.method public final getContent()La/ugd;
    .locals 0

    .line 1
    iget-object p0, p0, La/txv0;->i:La/ugd;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getEntries()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/txv0;->h:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/txv0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/txv0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, La/txv0;->c:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/txv0;->d:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object p0, p0, La/txv0;->b:La/ob50;

    .line 23
    .line 24
    iget-object p0, p0, La/ob50;->b:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v0

    .line 31
    return p0
.end method
