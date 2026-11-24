.class public final La/n530;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:La/qoj0;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, La/n530;->a:J

    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, La/n530;->b:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    sget-object v0, La/i99;->b:La/i99;

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static {v2, v3, v0, v1}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-wide/16 v1, 0x0

    .line 25
    .line 26
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, La/n530;->c:La/qoj0;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;Ljava/util/Set;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, La/k530;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/k530;

    .line 7
    .line 8
    iget v1, v0, La/k530;->m:I

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
    iput v1, v0, La/k530;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/k530;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/k530;-><init>(La/n530;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/k530;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/k530;->m:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iget-object p0, p0, La/n530;->b:Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget-wide p1, v0, La/k530;->j:J

    .line 40
    .line 41
    iget-object p4, v0, La/k530;->i:Ljava/util/Iterator;

    .line 42
    .line 43
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    check-cast p3, Ljava/lang/Iterable;

    .line 61
    .line 62
    new-instance v2, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    :cond_3
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    move-object v6, v5

    .line 82
    check-cast v6, La/i530;

    .line 83
    .line 84
    iget-wide v7, v6, La/i530;->a:J

    .line 85
    .line 86
    cmp-long v7, v7, p1

    .line 87
    .line 88
    if-nez v7, :cond_3

    .line 89
    .line 90
    iget-wide v6, v6, La/i530;->b:J

    .line 91
    .line 92
    new-instance v8, Ljava/lang/Long;

    .line 93
    .line 94
    invoke-direct {v8, v6, v7}, Ljava/lang/Long;-><init>(J)V

    .line 95
    .line 96
    .line 97
    invoke-interface {p4, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-nez v6, :cond_3

    .line 102
    .line 103
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    move-object p4, p3

    .line 112
    :cond_5
    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result p3

    .line 116
    if-eqz p3, :cond_6

    .line 117
    .line 118
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    check-cast p3, La/i530;

    .line 123
    .line 124
    invoke-virtual {p0, p3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    check-cast p3, La/h530;

    .line 129
    .line 130
    if-eqz p3, :cond_5

    .line 131
    .line 132
    iget-object p3, p3, La/h530;->a:La/p7m0;

    .line 133
    .line 134
    new-instance v2, La/o530;

    .line 135
    .line 136
    const/4 v5, 0x0

    .line 137
    sget-object v6, La/iun;->a:La/iun;

    .line 138
    .line 139
    invoke-direct {v2, v6, v5}, La/o530;-><init>(Ljava/util/List;Z)V

    .line 140
    .line 141
    .line 142
    iput-object p4, v0, La/k530;->i:Ljava/util/Iterator;

    .line 143
    .line 144
    iput-wide p1, v0, La/k530;->j:J

    .line 145
    .line 146
    iput v4, v0, La/k530;->m:I

    .line 147
    .line 148
    invoke-virtual {p3, v3, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    sget-object p3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    if-ne p3, v1, :cond_5

    .line 154
    .line 155
    return-object v1

    .line 156
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p0
.end method

.method public final b(La/i530;)La/p7m0;
    .locals 1

    .line 1
    iget-object p0, p0, La/n530;->b:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/h530;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, La/h530;->a:La/p7m0;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, La/h530;

    .line 15
    .line 16
    invoke-direct {v0}, La/h530;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object p0, v0, La/h530;->a:La/p7m0;

    .line 23
    .line 24
    return-object p0
.end method

.method public final c(JJ)Ljava/util/Map;
    .locals 2

    .line 1
    iget-wide v0, p0, La/n530;->a:J

    .line 2
    .line 3
    cmp-long p1, v0, p1

    .line 4
    .line 5
    if-nez p1, :cond_3

    .line 6
    .line 7
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/n530;->b:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    check-cast p2, Ljava/util/Map$Entry;

    .line 33
    .line 34
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, La/i530;

    .line 39
    .line 40
    iget-wide v0, v0, La/i530;->a:J

    .line 41
    .line 42
    cmp-long v0, v0, p3

    .line 43
    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p1, v0, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    invoke-direct {p0, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    if-eqz p2, :cond_2

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    check-cast p2, Ljava/util/Map$Entry;

    .line 86
    .line 87
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    check-cast p3, La/i530;

    .line 92
    .line 93
    iget-wide p3, p3, La/i530;->b:J

    .line 94
    .line 95
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    check-cast p2, La/h530;

    .line 104
    .line 105
    iget-object p2, p2, La/h530;->a:La/p7m0;

    .line 106
    .line 107
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    new-instance p4, Lkotlin/Pair;

    .line 112
    .line 113
    invoke-direct {p4, p3, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    invoke-static {p0}, La/xp20;->m(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :cond_3
    sget-object p0, La/lun;->a:La/lun;

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    return-object p0
.end method

.method public final d(JJLjava/util/List;JLa/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p8

    .line 4
    .line 5
    instance-of v2, v1, La/l530;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/l530;

    .line 11
    .line 12
    iget v3, v2, La/l530;->l:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/l530;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/l530;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/l530;-><init>(La/n530;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/l530;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/l530;->l:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    if-ne v4, v5, :cond_1

    .line 40
    .line 41
    iget-wide v2, v2, La/l530;->i:J

    .line 42
    .line 43
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_8

    .line 47
    .line 48
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v6

    .line 54
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance v1, La/i530;

    .line 58
    .line 59
    move-wide/from16 v7, p3

    .line 60
    .line 61
    move-wide/from16 v9, p6

    .line 62
    .line 63
    invoke-direct {v1, v9, v10, v7, v8}, La/i530;-><init>(JJ)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, La/n530;->b(La/i530;)La/p7m0;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    new-instance v7, La/o530;

    .line 71
    .line 72
    new-instance v8, Ljava/util/ArrayList;

    .line 73
    .line 74
    const/16 v9, 0xa

    .line 75
    .line 76
    move-object/from16 v10, p5

    .line 77
    .line 78
    invoke-static {v10, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-eqz v10, :cond_7

    .line 94
    .line 95
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    move-object v11, v10

    .line 100
    check-cast v11, La/xt20;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, La/n530;->b(La/i530;)La/p7m0;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    check-cast v10, La/o530;

    .line 111
    .line 112
    iget-object v10, v10, La/o530;->b:Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v12

    .line 122
    if-eqz v12, :cond_4

    .line 123
    .line 124
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    move-object v13, v12

    .line 129
    check-cast v13, La/xt20;

    .line 130
    .line 131
    iget-wide v13, v13, La/xt20;->b:J

    .line 132
    .line 133
    iget-wide v5, v11, La/xt20;->b:J

    .line 134
    .line 135
    cmp-long v5, v13, v5

    .line 136
    .line 137
    if-nez v5, :cond_3

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_3
    const/4 v5, 0x1

    .line 141
    const/4 v6, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_4
    const/4 v12, 0x0

    .line 144
    :goto_3
    check-cast v12, La/xt20;

    .line 145
    .line 146
    if-eqz v12, :cond_5

    .line 147
    .line 148
    iget-wide v5, v12, La/xt20;->e:J

    .line 149
    .line 150
    :goto_4
    move-wide v14, v5

    .line 151
    goto :goto_5

    .line 152
    :cond_5
    const-wide/16 v5, -0x1

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :goto_5
    if-eqz v12, :cond_6

    .line 156
    .line 157
    iget-wide v5, v12, La/xt20;->f:D

    .line 158
    .line 159
    :goto_6
    move-wide/from16 v16, v5

    .line 160
    .line 161
    goto :goto_7

    .line 162
    :cond_6
    const-wide/high16 v5, -0x4010000000000000L    # -1.0

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :goto_7
    const/16 v18, 0xcf

    .line 166
    .line 167
    const/4 v12, 0x0

    .line 168
    const/4 v13, 0x0

    .line 169
    invoke-static/range {v11 .. v18}, La/xt20;->a(La/xt20;Ljava/util/ArrayList;ZJDI)La/xt20;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    const/4 v5, 0x1

    .line 177
    const/4 v6, 0x0

    .line 178
    goto :goto_1

    .line 179
    :cond_7
    const/4 v1, 0x0

    .line 180
    invoke-direct {v7, v8, v1}, La/o530;-><init>(Ljava/util/List;Z)V

    .line 181
    .line 182
    .line 183
    move-wide/from16 v5, p1

    .line 184
    .line 185
    iput-wide v5, v2, La/l530;->i:J

    .line 186
    .line 187
    const/4 v1, 0x1

    .line 188
    iput v1, v2, La/l530;->l:I

    .line 189
    .line 190
    const/4 v1, 0x0

    .line 191
    invoke-virtual {v4, v1, v7}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    if-ne v1, v3, :cond_8

    .line 197
    .line 198
    return-object v3

    .line 199
    :cond_8
    move-wide v2, v5

    .line 200
    :goto_8
    iput-wide v2, v0, La/n530;->a:J

    .line 201
    .line 202
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object v0
.end method
