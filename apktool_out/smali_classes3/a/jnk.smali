.class public final La/jnk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ts4;

.field public final b:La/rou;


# direct methods
.method public synthetic constructor <init>(La/ts4;La/rou;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/jnk;->a:La/ts4;

    iput-object p2, p0, La/jnk;->b:La/rou;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/zje;La/ynb0;Ljava/lang/String;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, La/fte0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/fte0;

    .line 7
    .line 8
    iget v1, v0, La/fte0;->n:I

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
    iput v1, v0, La/fte0;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fte0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/fte0;-><init>(La/jnk;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/fte0;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fte0;->n:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v5

    .line 50
    :cond_2
    iget-object p0, v0, La/fte0;->k:La/ts4;

    .line 51
    .line 52
    iget-object p3, v0, La/fte0;->j:Ljava/lang/String;

    .line 53
    .line 54
    iget-object p2, v0, La/fte0;->i:La/ynb0;

    .line 55
    .line 56
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iput-object p2, v0, La/fte0;->i:La/ynb0;

    .line 64
    .line 65
    iput-object p3, v0, La/fte0;->j:Ljava/lang/String;

    .line 66
    .line 67
    iget-object p1, p0, La/jnk;->a:La/ts4;

    .line 68
    .line 69
    iput-object p1, v0, La/fte0;->k:La/ts4;

    .line 70
    .line 71
    iput v4, v0, La/fte0;->n:I

    .line 72
    .line 73
    iget-object p0, p0, La/jnk;->b:La/rou;

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    invoke-virtual {p0, v2, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-ne p0, v1, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    move-object v8, p1

    .line 84
    move-object p1, p0

    .line 85
    move-object p0, v8

    .line 86
    :goto_1
    check-cast p1, La/m2c0;

    .line 87
    .line 88
    iget-wide v6, p1, La/m2c0;->S:J

    .line 89
    .line 90
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object v5, v0, La/fte0;->i:La/ynb0;

    .line 95
    .line 96
    iput-object v5, v0, La/fte0;->j:Ljava/lang/String;

    .line 97
    .line 98
    iput-object v5, v0, La/fte0;->k:La/ts4;

    .line 99
    .line 100
    iput v3, v0, La/fte0;->n:I

    .line 101
    .line 102
    invoke-virtual {p0, p2, p1, p3, v0}, La/ts4;->i(La/ynb0;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-ne p0, v1, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object v1

    .line 109
    :cond_5
    return-object p0
.end method

.method public b(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/ink;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ink;

    .line 7
    .line 8
    iget v1, v0, La/ink;->m:I

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
    iput v1, v0, La/ink;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ink;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ink;-><init>(La/jnk;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ink;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ink;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    iget-object p0, v0, La/ink;->j:La/ts4;

    .line 51
    .line 52
    iget-object p1, v0, La/ink;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, v0, La/ink;->i:Ljava/lang/String;

    .line 62
    .line 63
    iget-object p2, p0, La/jnk;->a:La/ts4;

    .line 64
    .line 65
    iput-object p2, v0, La/ink;->j:La/ts4;

    .line 66
    .line 67
    iput v5, v0, La/ink;->m:I

    .line 68
    .line 69
    iget-object p0, p0, La/jnk;->b:La/rou;

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-virtual {p0, v2, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-ne p0, v1, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move-object v7, p2

    .line 80
    move-object p2, p0

    .line 81
    move-object p0, v7

    .line 82
    :goto_1
    check-cast p2, La/m2c0;

    .line 83
    .line 84
    iget-wide v5, p2, La/m2c0;->S:J

    .line 85
    .line 86
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    iput-object v3, v0, La/ink;->i:Ljava/lang/String;

    .line 91
    .line 92
    iput-object v3, v0, La/ink;->j:La/ts4;

    .line 93
    .line 94
    iput v4, v0, La/ink;->m:I

    .line 95
    .line 96
    invoke-virtual {p0, p2, p1, v0}, La/ts4;->q(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-ne p0, v1, :cond_5

    .line 101
    .line 102
    :goto_2
    return-object v1

    .line 103
    :cond_5
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0
.end method
