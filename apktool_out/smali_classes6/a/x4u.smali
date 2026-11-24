.class public final La/x4u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/fx7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, La/x4u;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/g2v;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/x4u;->a:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(La/h7q;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/x4u;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/n9s;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, La/x4u;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/xyp0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, La/x4u;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 10
    iput-object p1, p0, La/x4u;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/wbq;)La/ewt;
    .locals 2

    .line 1
    iget-object p0, p0, La/x4u;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/h7q;

    .line 4
    .line 5
    iget-object p0, p0, La/h7q;->c:La/q6q;

    .line 6
    .line 7
    iget-object p0, p0, La/q6q;->d:La/p7m0;

    .line 8
    .line 9
    new-instance v0, La/ewt;

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    invoke-direct {v0, p0, p1, v1}, La/ewt;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public b(Ljava/lang/String;La/zje;)Ljava/io/Serializable;
    .locals 5

    .line 1
    instance-of v0, p2, La/inu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/inu;

    .line 7
    .line 8
    iget v1, v0, La/inu;->k:I

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
    iput v1, v0, La/inu;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/inu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/inu;-><init>(La/x4u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/inu;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/inu;->k:I

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

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
    return-object v3

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/x4u;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/ywu;

    .line 53
    .line 54
    iput v4, v0, La/inu;->k:I

    .line 55
    .line 56
    iget-object p2, p0, La/ywu;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p2, La/mne;

    .line 59
    .line 60
    iget-object p2, p2, La/mne;->b:La/dvj;

    .line 61
    .line 62
    new-instance v2, La/oed;

    .line 63
    .line 64
    const/16 v4, 0xe

    .line 65
    .line 66
    invoke-direct {v2, p0, p1, v3, v4}, La/oed;-><init>(Ljava/lang/Object;Ljava/lang/String;La/yje;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {p2, v2, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-ne p2, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    .line 77
    .line 78
    new-instance p0, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    if-eqz p2, :cond_5

    .line 92
    .line 93
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    move-object v0, p2

    .line 98
    check-cast v0, La/jca0;

    .line 99
    .line 100
    iget-object v0, v0, La/jca0;->d:Ljava/lang/String;

    .line 101
    .line 102
    const-string v1, ""

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_4

    .line 109
    .line 110
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    return-object p0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/x4u;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/dq00;

    .line 7
    .line 8
    iget-object p0, p0, La/dq00;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/nw20;

    .line 11
    .line 12
    iget-object p0, p0, La/nw20;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/q7d0;

    .line 15
    .line 16
    const-string v0, "GlobalSoundPath"

    .line 17
    .line 18
    invoke-static {p0, v0}, La/q7d0;->c(La/q7d0;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0, p1}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public d()Ljava/util/HashMap;
    .locals 0

    .line 1
    iget-object p0, p0, La/x4u;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/so6;

    .line 4
    .line 5
    iget-object p0, p0, La/so6;->b:La/gs6;

    .line 6
    .line 7
    iget-object p0, p0, La/gs6;->e:Ljava/util/HashMap;

    .line 8
    .line 9
    return-object p0
.end method

.method public e(Ljava/util/List;La/q4f;D)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    const/4 v0, 0x6

    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    const/16 v3, 0xa

    .line 15
    .line 16
    if-eq p2, v0, :cond_4

    .line 17
    .line 18
    const/16 v0, 0xb

    .line 19
    .line 20
    if-eq p2, v0, :cond_0

    .line 21
    .line 22
    sget-object p0, La/iun;->a:La/iun;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-static {p1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, La/hf6;

    .line 49
    .line 50
    iget-wide v3, v0, La/hf6;->d:D

    .line 51
    .line 52
    cmpl-double v5, v3, v1

    .line 53
    .line 54
    if-lez v5, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move-wide v3, p3

    .line 58
    :goto_1
    iget-object v5, p0, La/x4u;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v5, La/ni9;

    .line 61
    .line 62
    iget v0, v0, La/hf6;->a:I

    .line 63
    .line 64
    invoke-virtual {v5, v0}, La/ni9;->a(I)La/g0f;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-boolean v0, v0, La/g0f;->t:Z

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 76
    .line 77
    :goto_2
    mul-double/2addr v5, v3

    .line 78
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    return-object p2

    .line 87
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-eqz p2, :cond_6

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    move-object p3, p2

    .line 107
    check-cast p3, La/hf6;

    .line 108
    .line 109
    iget-object p3, p3, La/hf6;->c:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    if-nez p3, :cond_5

    .line 116
    .line 117
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-static {p0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    if-eqz p2, :cond_8

    .line 139
    .line 140
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    check-cast p2, La/hf6;

    .line 145
    .line 146
    iget-wide p2, p2, La/hf6;->d:D

    .line 147
    .line 148
    cmpl-double p4, p2, v1

    .line 149
    .line 150
    if-lez p4, :cond_7

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_7
    const-wide/high16 p2, -0x4010000000000000L    # -1.0

    .line 154
    .line 155
    :goto_5
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_8
    return-object p1
.end method

.method public f()Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;
    .locals 7

    .line 1
    iget-object p0, p0, La/x4u;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/xyp0;

    .line 4
    .line 5
    iget-object p0, p0, La/xyp0;->c:La/typ0;

    .line 6
    .line 7
    iget-object p0, p0, La/typ0;->a:La/mxp0;

    .line 8
    .line 9
    iget-object p0, p0, La/mxp0;->a:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    move-object v1, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v3, v1

    .line 42
    check-cast v3, Ljava/lang/String;

    .line 43
    .line 44
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    move-object v5, v4

    .line 49
    check-cast v5, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v3, v5}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-gez v6, :cond_3

    .line 56
    .line 57
    move-object v1, v4

    .line 58
    move-object v3, v5

    .line 59
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_2

    .line 64
    .line 65
    :goto_0
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Ljava/util/List;

    .line 72
    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_5

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    move-object v4, v3

    .line 90
    check-cast v4, La/uyp0;

    .line 91
    .line 92
    iget-object v4, v4, La/uyp0;->b:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 93
    .line 94
    sget-object v5, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;->c:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 95
    .line 96
    if-ne v4, v5, :cond_4

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    move-object v3, v2

    .line 100
    :goto_1
    check-cast v3, La/uyp0;

    .line 101
    .line 102
    if-eqz v3, :cond_6

    .line 103
    .line 104
    iget-object v2, v3, La/uyp0;->b:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p0, Ljava/util/List;

    .line 112
    .line 113
    if-eqz p0, :cond_7

    .line 114
    .line 115
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, La/uyp0;

    .line 120
    .line 121
    if-eqz p0, :cond_7

    .line 122
    .line 123
    iget-object v2, p0, La/uyp0;->b:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 124
    .line 125
    :cond_7
    :goto_2
    if-eqz v1, :cond_8

    .line 126
    .line 127
    if-eqz v2, :cond_8

    .line 128
    .line 129
    new-instance p0, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 130
    .line 131
    invoke-direct {p0, v1, v2}, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;-><init>(Ljava/lang/String;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;)V

    .line 132
    .line 133
    .line 134
    return-object p0

    .line 135
    :cond_8
    sget-object p0, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->Companion:La/wxp0;

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    sget-object p0, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->d:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 141
    .line 142
    return-object p0
.end method

.method public g(La/kgz;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/ghu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ghu;

    .line 7
    .line 8
    iget v1, v0, La/ghu;->k:I

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
    iput v1, v0, La/ghu;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ghu;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ghu;-><init>(La/x4u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ghu;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ghu;->k:I

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast p2, La/j0g0;

    .line 40
    .line 41
    iget-object p0, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, La/x4u;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/zpu;

    .line 57
    .line 58
    iget-object p1, p1, La/kgz;->a:Ljava/lang/String;

    .line 59
    .line 60
    iput v3, v0, La/ghu;->k:I

    .line 61
    .line 62
    invoke-virtual {p0, p1, v0}, La/zpu;->e(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-ne p0, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    return-object p0
.end method
