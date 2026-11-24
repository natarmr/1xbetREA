.class public final La/gw8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/k050;

.field public final b:La/k050;

.field public c:Ljava/util/List;

.field public d:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/k050;

    .line 5
    .line 6
    invoke-direct {v0}, La/k050;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/gw8;->a:La/k050;

    .line 10
    .line 11
    new-instance v0, La/k050;

    .line 12
    .line 13
    invoke-direct {v0}, La/k050;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/gw8;->b:La/k050;

    .line 17
    .line 18
    sget-object v0, La/iun;->a:La/iun;

    .line 19
    .line 20
    iput-object v0, p0, La/gw8;->c:Ljava/util/List;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/aw8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/aw8;

    .line 7
    .line 8
    iget v1, v0, La/aw8;->l:I

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
    iput v1, v0, La/aw8;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/aw8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/aw8;-><init>(La/gw8;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/aw8;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/aw8;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, La/aw8;->i:La/k050;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/gw8;->a:La/k050;

    .line 53
    .line 54
    iput-object p1, v0, La/aw8;->i:La/k050;

    .line 55
    .line 56
    iput v3, v0, La/aw8;->l:I

    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    sget-object p1, La/iun;->a:La/iun;

    .line 67
    .line 68
    iput-object p1, p0, La/gw8;->c:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    throw p0
.end method

.method public final b(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/bw8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/bw8;

    .line 7
    .line 8
    iget v1, v0, La/bw8;->l:I

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
    iput v1, v0, La/bw8;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/bw8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/bw8;-><init>(La/gw8;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/bw8;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/bw8;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, La/bw8;->i:La/k050;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/gw8;->b:La/k050;

    .line 53
    .line 54
    iput-object p1, v0, La/bw8;->i:La/k050;

    .line 55
    .line 56
    iput v3, v0, La/bw8;->l:I

    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    iput-object v4, p0, La/gw8;->d:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :catchall_0
    move-exception p0

    .line 75
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    throw p0
.end method

.method public final c(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/cw8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/cw8;

    .line 7
    .line 8
    iget v1, v0, La/cw8;->l:I

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
    iput v1, v0, La/cw8;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/cw8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/cw8;-><init>(La/gw8;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/cw8;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/cw8;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, La/cw8;->i:La/k050;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/gw8;->a:La/k050;

    .line 53
    .line 54
    iput-object p1, v0, La/cw8;->i:La/k050;

    .line 55
    .line 56
    iput v3, v0, La/cw8;->l:I

    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    iget-object p0, p0, La/gw8;->c:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    throw p0
.end method

.method public final d(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/dw8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/dw8;

    .line 7
    .line 8
    iget v1, v0, La/dw8;->l:I

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
    iput v1, v0, La/dw8;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/dw8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/dw8;-><init>(La/gw8;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/dw8;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/dw8;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, La/dw8;->i:La/k050;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/gw8;->b:La/k050;

    .line 53
    .line 54
    iput-object p1, v0, La/dw8;->i:La/k050;

    .line 55
    .line 56
    iput v3, v0, La/dw8;->l:I

    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    iget-object p0, p0, La/gw8;->d:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :catchall_0
    move-exception p0

    .line 73
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    throw p0
.end method

.method public final e(Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/ew8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ew8;

    .line 7
    .line 8
    iget v1, v0, La/ew8;->m:I

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
    iput v1, v0, La/ew8;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ew8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ew8;-><init>(La/gw8;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ew8;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ew8;->m:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, La/ew8;->j:La/k050;

    .line 38
    .line 39
    iget-object v0, v0, La/ew8;->i:Ljava/util/List;

    .line 40
    .line 41
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object p2, p1

    .line 45
    move-object p1, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, v0, La/ew8;->i:Ljava/util/List;

    .line 57
    .line 58
    iget-object p2, p0, La/gw8;->a:La/k050;

    .line 59
    .line 60
    iput-object p2, v0, La/ew8;->j:La/k050;

    .line 61
    .line 62
    iput v3, v0, La/ew8;->m:I

    .line 63
    .line 64
    invoke-virtual {p2, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-ne v0, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    :try_start_0
    iput-object p1, p0, La/gw8;->c:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    invoke-interface {p2, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    invoke-interface {p2, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    throw p0
.end method

.method public final f(Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/fw8;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/fw8;

    .line 7
    .line 8
    iget v1, v0, La/fw8;->m:I

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
    iput v1, v0, La/fw8;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fw8;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/fw8;-><init>(La/gw8;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/fw8;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fw8;->m:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, La/fw8;->j:La/k050;

    .line 38
    .line 39
    iget-object v0, v0, La/fw8;->i:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    .line 40
    .line 41
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object p2, p1

    .line 45
    move-object p1, v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, v0, La/fw8;->i:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    .line 57
    .line 58
    iget-object p2, p0, La/gw8;->b:La/k050;

    .line 59
    .line 60
    iput-object p2, v0, La/fw8;->j:La/k050;

    .line 61
    .line 62
    iput v3, v0, La/fw8;->m:I

    .line 63
    .line 64
    invoke-virtual {p2, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-ne v0, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    :try_start_0
    iput-object p1, p0, La/gw8;->d:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    invoke-interface {p2, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    invoke-interface {p2, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    throw p0
.end method
