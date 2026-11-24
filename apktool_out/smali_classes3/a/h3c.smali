.class public final La/h3c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/sjl0;


# direct methods
.method public constructor <init>(La/sjl0;B)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/h3c;->a:La/sjl0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/h3c;->a:La/sjl0;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/h3c;->a:La/sjl0;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, La/h3c;->a:La/sjl0;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(JJLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, La/hwu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/hwu;

    .line 7
    .line 8
    iget v1, v0, La/hwu;->m:I

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
    iput v1, v0, La/hwu;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/hwu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/hwu;-><init>(La/h3c;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/hwu;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/hwu;->m:I

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
    iget-wide p3, v0, La/hwu;->j:J

    .line 38
    .line 39
    iget-wide p1, v0, La/hwu;->i:J

    .line 40
    .line 41
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v4

    .line 51
    :cond_2
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-wide p1, v0, La/hwu;->i:J

    .line 55
    .line 56
    iput-wide p3, v0, La/hwu;->j:J

    .line 57
    .line 58
    iput v3, v0, La/hwu;->m:I

    .line 59
    .line 60
    iget-object p0, p0, La/h3c;->a:La/sjl0;

    .line 61
    .line 62
    invoke-virtual {p0, v0}, La/sjl0;->d(La/zje;)Ljava/io/Serializable;

    .line 63
    .line 64
    .line 65
    move-result-object p5

    .line 66
    if-ne p5, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p5, Ljava/lang/Iterable;

    .line 70
    .line 71
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result p5

    .line 79
    if-eqz p5, :cond_5

    .line 80
    .line 81
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p5

    .line 85
    move-object v0, p5

    .line 86
    check-cast v0, La/ril0;

    .line 87
    .line 88
    iget-wide v0, v0, La/ril0;->a:J

    .line 89
    .line 90
    cmp-long v0, v0, p1

    .line 91
    .line 92
    if-nez v0, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    move-object p5, v4

    .line 96
    :goto_2
    check-cast p5, La/ril0;

    .line 97
    .line 98
    if-eqz p5, :cond_9

    .line 99
    .line 100
    iget-object p0, p5, La/ril0;->f:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_7

    .line 111
    .line 112
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    move-object p2, p1

    .line 117
    check-cast p2, La/f3n0;

    .line 118
    .line 119
    iget-wide v0, p2, La/f3n0;->a:J

    .line 120
    .line 121
    cmp-long p2, v0, p3

    .line 122
    .line 123
    if-nez p2, :cond_6

    .line 124
    .line 125
    move-object v4, p1

    .line 126
    :cond_7
    check-cast v4, La/f3n0;

    .line 127
    .line 128
    if-eqz v4, :cond_8

    .line 129
    .line 130
    iget-object p0, v4, La/f3n0;->b:Ljava/lang/String;

    .line 131
    .line 132
    if-eqz p0, :cond_8

    .line 133
    .line 134
    :goto_3
    move-object v4, p0

    .line 135
    goto :goto_4

    .line 136
    :cond_8
    iget-object p0, p5, La/ril0;->b:Ljava/lang/String;

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_9
    :goto_4
    if-nez v4, :cond_a

    .line 140
    .line 141
    const-string p0, ""

    .line 142
    .line 143
    return-object p0

    .line 144
    :cond_a
    return-object v4
.end method

.method public b(JLa/yje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, La/g3c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/g3c;

    .line 7
    .line 8
    iget v1, v0, La/g3c;->k:I

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
    iput v1, v0, La/g3c;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/g3c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/g3c;-><init>(La/h3c;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/g3c;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/g3c;->k:I

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
    :try_start_0
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v5, 0x28

    .line 53
    .line 54
    cmp-long p3, p1, v5

    .line 55
    .line 56
    if-eqz p3, :cond_7

    .line 57
    .line 58
    :try_start_1
    sget-object p3, La/j0g0;->b:La/e0g0;

    .line 59
    .line 60
    iget-object p0, p0, La/h3c;->a:La/sjl0;

    .line 61
    .line 62
    iput v4, v0, La/g3c;->k:I

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2, v0}, La/sjl0;->c(JLa/zje;)Ljava/lang/Object;

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
    check-cast p3, La/ril0;

    .line 72
    .line 73
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :goto_2
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 77
    .line 78
    new-instance p3, La/g0g0;

    .line 79
    .line 80
    invoke-direct {p3, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :goto_3
    instance-of p0, p3, La/g0g0;

    .line 84
    .line 85
    if-eqz p0, :cond_4

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_4
    move-object v3, p3

    .line 89
    :goto_4
    check-cast v3, La/ril0;

    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    if-eqz v3, :cond_5

    .line 93
    .line 94
    iget-boolean p1, v3, La/ril0;->e:Z

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_5
    move p1, p0

    .line 98
    :goto_5
    if-eqz p1, :cond_6

    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_6
    move v4, p0

    .line 102
    :cond_7
    :goto_6
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0
.end method

.method public c(La/o4g;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/qqt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/qqt;

    .line 7
    .line 8
    iget v1, v0, La/qqt;->l:I

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
    iput v1, v0, La/qqt;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/qqt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/qqt;-><init>(La/h3c;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/qqt;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/qqt;->l:I

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
    iget-object p1, v0, La/qqt;->i:La/o4g;

    .line 37
    .line 38
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, v0, La/qqt;->i:La/o4g;

    .line 53
    .line 54
    iput v3, v0, La/qqt;->l:I

    .line 55
    .line 56
    iget-object p0, p0, La/h3c;->a:La/sjl0;

    .line 57
    .line 58
    const-wide/16 v2, 0x28

    .line 59
    .line 60
    invoke-virtual {p0, v2, v3, v0}, La/sjl0;->c(JLa/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-ne p2, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    check-cast p2, La/ril0;

    .line 68
    .line 69
    iget-object p0, p2, La/ril0;->f:Ljava/util/List;

    .line 70
    .line 71
    new-instance p2, La/mto;

    .line 72
    .line 73
    const/4 v0, 0x2

    .line 74
    invoke-direct {p2, p1, v0}, La/mto;-><init>(Ljava/lang/Object;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {p0, p2}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method
