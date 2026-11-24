.class public final La/jzf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/dzf;

.field public final b:La/ozf;


# direct methods
.method public constructor <init>(La/dzf;La/ozf;B)V
    .locals 0

    .line 1
    packed-switch p3, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/jzf;->a:La/dzf;

    .line 14
    .line 15
    iput-object p2, p0, La/jzf;->b:La/ozf;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/jzf;->a:La/dzf;

    .line 22
    .line 23
    iput-object p2, p0, La/jzf;->b:La/ozf;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/ezf;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/ezf;

    .line 7
    .line 8
    iget v1, v0, La/ezf;->k:I

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
    iput v1, v0, La/ezf;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ezf;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/ezf;-><init>(La/jzf;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/ezf;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ezf;->k:I

    .line 30
    .line 31
    iget-object v3, p0, La/jzf;->a:La/dzf;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, v3, La/dzf;->b:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_5

    .line 59
    .line 60
    iput v4, v0, La/ezf;->k:I

    .line 61
    .line 62
    invoke-virtual {p0, v0}, La/jzf;->c(La/zje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p1, La/vf;

    .line 70
    .line 71
    iget-object p0, p1, La/vf;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object p1, v3, La/dzf;->b:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_4

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    iput-object p0, v3, La/dzf;->b:Ljava/lang/String;

    .line 92
    .line 93
    new-instance p0, La/czf;

    .line 94
    .line 95
    invoke-direct {p0, v3, v4}, La/czf;-><init>(La/dzf;B)V

    .line 96
    .line 97
    .line 98
    iput-object p0, v3, La/dzf;->c:Lkotlin/jvm/functions/Function0;

    .line 99
    .line 100
    :cond_5
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, La/fzf;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/fzf;

    .line 7
    .line 8
    iget v1, v0, La/fzf;->m:I

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
    iput v1, v0, La/fzf;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fzf;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/fzf;-><init>(La/jzf;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/fzf;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fzf;->m:I

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_4

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
    iget-object p2, v0, La/fzf;->j:Ljava/lang/String;

    .line 51
    .line 52
    iget-object p1, v0, La/fzf;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, v0, La/fzf;->i:Ljava/lang/String;

    .line 62
    .line 63
    iput-object p2, v0, La/fzf;->j:Ljava/lang/String;

    .line 64
    .line 65
    iput v5, v0, La/fzf;->m:I

    .line 66
    .line 67
    invoke-virtual {p0, v0}, La/jzf;->a(La/zje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    if-ne p3, v1, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    :goto_1
    new-instance p3, La/tyf;

    .line 75
    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 77
    .line 78
    .line 79
    move-result-wide v5

    .line 80
    const-wide/16 v7, 0x3e8

    .line 81
    .line 82
    div-long/2addr v5, v7

    .line 83
    invoke-direct {p3, p1, p2, v5, v6}, La/tyf;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 84
    .line 85
    .line 86
    iput-object v3, v0, La/fzf;->i:Ljava/lang/String;

    .line 87
    .line 88
    iput-object v3, v0, La/fzf;->j:Ljava/lang/String;

    .line 89
    .line 90
    iput v4, v0, La/fzf;->m:I

    .line 91
    .line 92
    iget-object p0, p0, La/jzf;->a:La/dzf;

    .line 93
    .line 94
    iget-object p1, p0, La/dzf;->c:Lkotlin/jvm/functions/Function0;

    .line 95
    .line 96
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, La/nzf;

    .line 101
    .line 102
    invoke-virtual {p0}, La/dzf;->a()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    new-instance p2, La/lwf;

    .line 107
    .line 108
    const/4 v2, 0x0

    .line 109
    invoke-direct {p2, v2}, La/lwf;-><init>(B)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p1, p0, p3, p2, v0}, La/nzf;->b(Ljava/lang/String;La/tyf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-ne p0, v1, :cond_5

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    :goto_2
    if-ne p0, v1, :cond_6

    .line 122
    .line 123
    :goto_3
    return-object v1

    .line 124
    :cond_6
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0
.end method

.method public c(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/gzf;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/gzf;

    .line 7
    .line 8
    iget v1, v0, La/gzf;->k:I

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
    iput v1, v0, La/gzf;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/gzf;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/gzf;-><init>(La/jzf;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/gzf;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/gzf;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0

    .line 48
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput v4, v0, La/gzf;->k:I

    .line 52
    .line 53
    iget-object p0, p0, La/jzf;->a:La/dzf;

    .line 54
    .line 55
    iget-object p1, p0, La/dzf;->c:Lkotlin/jvm/functions/Function0;

    .line 56
    .line 57
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, La/nzf;

    .line 62
    .line 63
    invoke-virtual {p0}, La/dzf;->a()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance v2, La/lwf;

    .line 68
    .line 69
    invoke-direct {v2, v3}, La/lwf;-><init>(B)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, p0, v2, v0}, La/nzf;->a(Ljava/lang/String;Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v1, :cond_3

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_3
    :goto_1
    check-cast p1, La/yf;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance p0, La/vf;

    .line 85
    .line 86
    iget-object v0, p1, La/yf;->a:Ljava/lang/String;

    .line 87
    .line 88
    const-string v1, ""

    .line 89
    .line 90
    if-nez v0, :cond_4

    .line 91
    .line 92
    move-object v0, v1

    .line 93
    :cond_4
    iget-object v2, p1, La/yf;->b:Ljava/lang/String;

    .line 94
    .line 95
    if-nez v2, :cond_5

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    move-object v1, v2

    .line 99
    :goto_2
    iget-object p1, p1, La/yf;->c:Ljava/lang/Integer;

    .line 100
    .line 101
    if-eqz p1, :cond_6

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    :cond_6
    invoke-direct {p0, v3, v0, v1}, La/vf;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object p0
.end method

.method public d(La/pzf;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, La/hzf;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/hzf;

    .line 7
    .line 8
    iget v1, v0, La/hzf;->l:I

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
    iput v1, v0, La/hzf;->l:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/hzf;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/hzf;-><init>(La/jzf;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v6, La/hzf;->j:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/hzf;->l:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x3

    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    if-eq v1, v5, :cond_3

    .line 40
    .line 41
    if-eq v1, v4, :cond_2

    .line 42
    .line 43
    if-ne v1, v3, :cond_1

    .line 44
    .line 45
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_7

    .line 49
    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_3
    iget-object p1, v6, La/hzf;->i:La/pzf;

    .line 61
    .line 62
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iput-object p1, v6, La/hzf;->i:La/pzf;

    .line 70
    .line 71
    iput v5, v6, La/hzf;->l:I

    .line 72
    .line 73
    invoke-virtual {p0, v6}, La/jzf;->a(La/zje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    if-ne p2, v0, :cond_5

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_5
    :goto_2
    iget-boolean p2, p1, La/pzf;->d:Z

    .line 81
    .line 82
    iget-object v1, p1, La/pzf;->b:Ljava/lang/String;

    .line 83
    .line 84
    iget-wide v7, p1, La/pzf;->a:J

    .line 85
    .line 86
    const/4 v5, 0x0

    .line 87
    iget-object p0, p0, La/jzf;->a:La/dzf;

    .line 88
    .line 89
    if-eqz p2, :cond_8

    .line 90
    .line 91
    move p2, v4

    .line 92
    new-instance v4, La/yyf;

    .line 93
    .line 94
    iget-boolean p1, p1, La/pzf;->c:Z

    .line 95
    .line 96
    invoke-direct {v4, v1, p1}, La/yyf;-><init>(Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    iput-object v2, v6, La/hzf;->i:La/pzf;

    .line 100
    .line 101
    iput p2, v6, La/hzf;->l:I

    .line 102
    .line 103
    iget-object p1, p0, La/dzf;->c:Lkotlin/jvm/functions/Function0;

    .line 104
    .line 105
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    move-object v1, p1

    .line 110
    check-cast v1, La/nzf;

    .line 111
    .line 112
    invoke-virtual {p0}, La/dzf;->a()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    move p1, v5

    .line 121
    new-instance v5, La/lwf;

    .line 122
    .line 123
    invoke-direct {v5, p1}, La/lwf;-><init>(B)V

    .line 124
    .line 125
    .line 126
    invoke-interface/range {v1 .. v6}, La/nzf;->e(Ljava/lang/String;Ljava/lang/String;La/yyf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    if-ne p0, v0, :cond_6

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    :goto_3
    if-ne p0, v0, :cond_7

    .line 136
    .line 137
    goto :goto_6

    .line 138
    :cond_7
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :cond_8
    move p1, v5

    .line 142
    new-instance v4, La/mzf;

    .line 143
    .line 144
    invoke-direct {v4, v1}, La/mzf;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iput-object v2, v6, La/hzf;->i:La/pzf;

    .line 148
    .line 149
    iput v3, v6, La/hzf;->l:I

    .line 150
    .line 151
    iget-object p2, p0, La/dzf;->c:Lkotlin/jvm/functions/Function0;

    .line 152
    .line 153
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    move-object v1, p2

    .line 158
    check-cast v1, La/nzf;

    .line 159
    .line 160
    invoke-virtual {p0}, La/dzf;->a()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    new-instance v5, La/lwf;

    .line 169
    .line 170
    invoke-direct {v5, p1}, La/lwf;-><init>(B)V

    .line 171
    .line 172
    .line 173
    invoke-interface/range {v1 .. v6}, La/nzf;->c(Ljava/lang/String;Ljava/lang/String;La/mzf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    if-ne p0, v0, :cond_9

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    :goto_5
    if-ne p0, v0, :cond_a

    .line 183
    .line 184
    :goto_6
    return-object v0

    .line 185
    :cond_a
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object p0
.end method

.method public e(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, La/izf;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/izf;

    .line 7
    .line 8
    iget v1, v0, La/izf;->m:I

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
    iput v1, v0, La/izf;->m:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/izf;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, La/izf;-><init>(La/jzf;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v6, La/izf;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/izf;->m:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x2

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_5

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v2

    .line 52
    :cond_2
    iget-wide p1, v6, La/izf;->j:J

    .line 53
    .line 54
    iget-object p4, v6, La/izf;->i:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iput-object p4, v6, La/izf;->i:Ljava/lang/String;

    .line 64
    .line 65
    iput-wide p1, v6, La/izf;->j:J

    .line 66
    .line 67
    iput v4, v6, La/izf;->m:I

    .line 68
    .line 69
    invoke-virtual {p0, v6}, La/jzf;->a(La/zje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    if-ne p3, v0, :cond_4

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_4
    :goto_2
    new-instance v4, La/qyf;

    .line 77
    .line 78
    new-instance p3, La/nyf;

    .line 79
    .line 80
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 81
    .line 82
    .line 83
    move-result-wide v7

    .line 84
    const-wide/16 v9, 0x3e8

    .line 85
    .line 86
    div-long/2addr v7, v9

    .line 87
    new-instance v1, Ljava/lang/Long;

    .line 88
    .line 89
    invoke-direct {v1, v7, v8}, Ljava/lang/Long;-><init>(J)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p3, p4, v1}, La/nyf;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 93
    .line 94
    .line 95
    invoke-direct {v4, p3}, La/qyf;-><init>(La/nyf;)V

    .line 96
    .line 97
    .line 98
    iput-object v2, v6, La/izf;->i:Ljava/lang/String;

    .line 99
    .line 100
    iput-wide p1, v6, La/izf;->j:J

    .line 101
    .line 102
    iput v3, v6, La/izf;->m:I

    .line 103
    .line 104
    iget-object p0, p0, La/jzf;->a:La/dzf;

    .line 105
    .line 106
    iget-object p3, p0, La/dzf;->c:Lkotlin/jvm/functions/Function0;

    .line 107
    .line 108
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    move-object v1, p3

    .line 113
    check-cast v1, La/nzf;

    .line 114
    .line 115
    invoke-virtual {p0}, La/dzf;->a()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    new-instance v5, La/lwf;

    .line 124
    .line 125
    const/4 p0, 0x0

    .line 126
    invoke-direct {v5, p0}, La/lwf;-><init>(B)V

    .line 127
    .line 128
    .line 129
    invoke-interface/range {v1 .. v6}, La/nzf;->d(Ljava/lang/String;Ljava/lang/String;La/qyf;Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-ne p0, v0, :cond_5

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    :goto_3
    if-ne p0, v0, :cond_6

    .line 139
    .line 140
    :goto_4
    return-object v0

    .line 141
    :cond_6
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0
.end method
