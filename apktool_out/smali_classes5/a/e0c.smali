.class public final La/e0c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/n660;


# direct methods
.method public synthetic constructor <init>(La/n660;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/e0c;->a:La/n660;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/enu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/enu;

    .line 7
    .line 8
    iget v1, v0, La/enu;->k:I

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
    iput v1, v0, La/enu;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/enu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/enu;-><init>(La/e0c;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/enu;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/enu;->k:I

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
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 51
    .line 52
    iget-object p0, p0, La/e0c;->a:La/n660;

    .line 53
    .line 54
    iput v3, v0, La/enu;->k:I

    .line 55
    .line 56
    invoke-virtual {p0, v0}, La/n660;->t(La/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 64
    .line 65
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 70
    .line 71
    new-instance p1, La/g0g0;

    .line 72
    .line 73
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    sget-object p0, La/iun;->a:La/iun;

    .line 77
    .line 78
    instance-of v0, p1, La/g0g0;

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    move-object p1, p0

    .line 83
    :cond_4
    return-object p1
.end method

.method public b(La/zje;La/ynb0;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, La/d0c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/d0c;

    .line 7
    .line 8
    iget v1, v0, La/d0c;->k:I

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
    iput v1, v0, La/d0c;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/d0c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/d0c;-><init>(La/e0c;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/d0c;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/d0c;->k:I

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
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 51
    .line 52
    iget-object p0, p0, La/e0c;->a:La/n660;

    .line 53
    .line 54
    iput v3, v0, La/d0c;->k:I

    .line 55
    .line 56
    invoke-virtual {p0, v0, p2, p3}, La/n660;->g(La/zje;La/ynb0;Ljava/lang/String;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    check-cast p1, La/f0c;

    .line 64
    .line 65
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 70
    .line 71
    new-instance p1, La/g0g0;

    .line 72
    .line 73
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :goto_2
    invoke-static {p1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-nez p0, :cond_4

    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_4
    instance-of p1, p0, La/zhi0;

    .line 84
    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    move-object p1, p0

    .line 88
    check-cast p1, La/zhi0;

    .line 89
    .line 90
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 91
    .line 92
    sget-object p2, La/i2o;->f2:La/i2o;

    .line 93
    .line 94
    if-ne p1, p2, :cond_6

    .line 95
    .line 96
    new-instance p1, La/x4x;

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-nez p0, :cond_5

    .line 103
    .line 104
    const-string p0, ""

    .line 105
    .line 106
    :cond_5
    invoke-direct {p1, p0}, La/zhi0;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_6
    throw p0
.end method
