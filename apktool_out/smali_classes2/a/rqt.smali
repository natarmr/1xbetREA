.class public final La/rqt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b(La/rqt;)Lorg/xplatform/info/impl/navigation/InfoScreenFactoryImpl$getInfoScreen$1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lorg/xplatform/info/impl/navigation/InfoScreenFactoryImpl$getInfoScreen$1;

    .line 5
    .line 6
    const-string v0, ""

    .line 7
    .line 8
    invoke-direct {p0, v0}, Lorg/xplatform/info/impl/navigation/InfoScreenFactoryImpl$getInfoScreen$1;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public static c(Ljava/lang/String;)La/lrz;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/lrz;->b:La/lrz;

    .line 5
    .line 6
    const-string v1, "ACTIVE"

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    sget-object v0, La/lrz;->c:La/lrz;

    .line 16
    .line 17
    const-string v1, "PENDING"

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    sget-object v0, La/lrz;->d:La/lrz;

    .line 27
    .line 28
    const-string v1, "INACTIVE"

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public static d(Ljava/util/List;)J
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v3, v0

    .line 21
    check-cast v3, La/qu6;

    .line 22
    .line 23
    iget-wide v4, v3, La/qu6;->x:J

    .line 24
    .line 25
    const-wide/16 v6, 0x2c3

    .line 26
    .line 27
    cmp-long v4, v4, v6

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    iget-wide v3, v3, La/qu6;->r:J

    .line 32
    .line 33
    cmp-long v3, v3, v1

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    :goto_0
    check-cast v0, La/qu6;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-wide v0, v0, La/qu6;->r:J

    .line 44
    .line 45
    return-wide v0

    .line 46
    :cond_2
    return-wide v1
.end method

.method public static e(La/xuf;)La/tg20;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/tg20;

    .line 5
    .line 6
    iget-wide v1, p0, La/xuf;->m:D

    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmpg-double v5, v1, v3

    .line 11
    .line 12
    if-nez v5, :cond_0

    .line 13
    .line 14
    iget-wide v1, p0, La/xuf;->i:D

    .line 15
    .line 16
    :cond_0
    iget-wide v6, p0, La/xuf;->n:D

    .line 17
    .line 18
    cmpg-double p0, v6, v3

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    move p0, v4

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move p0, v3

    .line 27
    :goto_0
    xor-int/2addr p0, v4

    .line 28
    if-nez v5, :cond_2

    .line 29
    .line 30
    move v3, v4

    .line 31
    :cond_2
    xor-int/2addr v3, v4

    .line 32
    move-wide v8, v6

    .line 33
    move v6, v3

    .line 34
    move-wide v3, v8

    .line 35
    move v5, p0

    .line 36
    invoke-direct/range {v0 .. v6}, La/tg20;-><init>(DDZZ)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public static f(La/f3c0;)Ljava/lang/Integer;
    .locals 3

    .line 1
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, p0, La/f3c0;->p:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/16 v1, 0xd

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-boolean v1, p0, La/f3c0;->q:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x1f

    .line 23
    .line 24
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-boolean v1, p0, La/f3c0;->m:Z

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/4 v1, 0x7

    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    iget-boolean v1, p0, La/f3c0;->o:Z

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    const/16 v1, 0x13

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_3
    iget-boolean v1, p0, La/f3c0;->k:Z

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    const/4 v1, 0x5

    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :cond_4
    iget-boolean v1, p0, La/f3c0;->l:Z

    .line 69
    .line 70
    if-eqz v1, :cond_5

    .line 71
    .line 72
    const/16 v1, 0x9

    .line 73
    .line 74
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    :cond_5
    iget-boolean v1, p0, La/f3c0;->n:Z

    .line 82
    .line 83
    if-eqz v1, :cond_6

    .line 84
    .line 85
    const/16 v1, 0x11

    .line 86
    .line 87
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    :cond_6
    iget-boolean v1, p0, La/f3c0;->i:Z

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    if-eqz v1, :cond_7

    .line 98
    .line 99
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v0, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :cond_7
    iget-boolean p0, p0, La/f3c0;->j:Z

    .line 107
    .line 108
    if-eqz p0, :cond_8

    .line 109
    .line 110
    const/16 p0, 0xb

    .line 111
    .line 112
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {v0, p0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    :cond_8
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p0}, La/e4;->b()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-le v0, v2, :cond_9

    .line 128
    .line 129
    const/4 p0, 0x0

    .line 130
    return-object p0

    .line 131
    :cond_9
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, Ljava/lang/Integer;

    .line 136
    .line 137
    return-object p0
.end method

.method public static g(Ljava/util/List;)Ljava/util/LinkedHashMap;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/xqr0;

    .line 30
    .line 31
    iget-object v1, v1, La/xqr0;->f:Ljava/util/List;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-static {v0}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v2, v1

    .line 61
    check-cast v2, La/crr0;

    .line 62
    .line 63
    iget-wide v2, v2, La/crr0;->d:J

    .line 64
    .line 65
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    if-nez v3, :cond_1

    .line 74
    .line 75
    new-instance v3, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    :cond_1
    check-cast v3, Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    return-object v0
.end method

.method public static h(ZZZ)La/t3z;
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    sget-object p0, La/t3z;->e:La/t3z;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    sget-object p0, La/t3z;->d:La/t3z;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_1
    if-eqz p0, :cond_2

    .line 12
    .line 13
    sget-object p0, La/t3z;->c:La/t3z;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_2
    sget-object p0, La/t3z;->b:La/t3z;

    .line 17
    .line 18
    return-object p0
.end method


# virtual methods
.method public a(La/dgq;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, La/six;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/six;

    .line 7
    .line 8
    iget v1, v0, La/six;->l:I

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
    iput v1, v0, La/six;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/six;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/six;-><init>(La/rqt;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/six;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p2, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/six;->l:I

    .line 30
    .line 31
    const-string v2, "FirebaseSessions"

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const-string v5, ""

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v4, :cond_2

    .line 40
    .line 41
    if-ne v1, v3, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, La/six;->i:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Ljava/lang/String;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    goto :goto_5

    .line 51
    :catch_0
    move-exception p0

    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :cond_2
    iget-object p1, v0, La/six;->i:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, La/dgq;

    .line 64
    .line 65
    :try_start_1
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :catch_1
    move-exception p0

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :try_start_2
    move-object p0, p1

    .line 75
    check-cast p0, La/cgq;

    .line 76
    .line 77
    invoke-virtual {p0}, La/cgq;->d()Lcom/google/android/gms/tasks/Task;

    .line 78
    .line 79
    .line 80
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 81
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iput-object p0, v0, La/six;->i:Ljava/lang/Object;

    .line 85
    .line 86
    iput v4, v0, La/six;->l:I

    .line 87
    .line 88
    invoke-static {p1, v0}, La/msm0;->h(Lcom/google/android/gms/tasks/Task;La/zje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 92
    if-ne p1, p2, :cond_4

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_4
    move-object v6, p1

    .line 96
    move-object p1, p0

    .line 97
    move-object p0, v6

    .line 98
    :goto_1
    :try_start_4
    check-cast p0, La/d45;

    .line 99
    .line 100
    iget-object p0, p0, La/d45;->a:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 103
    .line 104
    .line 105
    move-object v6, p1

    .line 106
    move-object p1, p0

    .line 107
    move-object p0, v6

    .line 108
    goto :goto_3

    .line 109
    :catch_2
    move-exception p1

    .line 110
    move-object v6, p1

    .line 111
    move-object p1, p0

    .line 112
    move-object p0, v6

    .line 113
    :goto_2
    const-string v1, "Error getting authentication token."

    .line 114
    .line 115
    invoke-static {v2, v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 116
    .line 117
    .line 118
    move-object p0, p1

    .line 119
    move-object p1, v5

    .line 120
    :goto_3
    :try_start_5
    check-cast p0, La/cgq;

    .line 121
    .line 122
    invoke-virtual {p0}, La/cgq;->c()Lcom/google/android/gms/tasks/Task;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iput-object p1, v0, La/six;->i:Ljava/lang/Object;

    .line 130
    .line 131
    iput v3, v0, La/six;->l:I

    .line 132
    .line 133
    invoke-static {p0, v0}, La/msm0;->h(Lcom/google/android/gms/tasks/Task;La/zje;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    if-ne p0, p2, :cond_5

    .line 138
    .line 139
    :goto_4
    return-object p2

    .line 140
    :cond_5
    :goto_5
    check-cast p0, Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 141
    .line 142
    if-nez p0, :cond_6

    .line 143
    .line 144
    goto :goto_7

    .line 145
    :cond_6
    move-object v5, p0

    .line 146
    goto :goto_7

    .line 147
    :goto_6
    const-string p2, "Error getting Firebase installation id ."

    .line 148
    .line 149
    invoke-static {v2, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 150
    .line 151
    .line 152
    :goto_7
    new-instance p0, La/tix;

    .line 153
    .line 154
    invoke-direct {p0, v5, p1}, La/tix;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-object p0
.end method
