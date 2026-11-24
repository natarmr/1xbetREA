.class public final La/p4u;
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
    iput-object p1, p0, La/p4u;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ju9;)V
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
    iput-object p1, p0, La/p4u;->a:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(La/qi10;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, La/p4u;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/xs70;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, La/p4u;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 10
    iput-object p1, p0, La/p4u;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()D
    .locals 4

    .line 1
    iget-object p0, p0, La/p4u;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/o470;

    .line 4
    .line 5
    iget-object p0, p0, La/o470;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/fnd0;

    .line 8
    .line 9
    iget-object v0, p0, La/fnd0;->a:La/vwb0;

    .line 10
    .line 11
    const-string v1, "sum_string"

    .line 12
    .line 13
    const-string v2, "-1.0"

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, La/vwb0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, La/wvb;->O(Ljava/lang/String;)D

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    cmpg-double v2, v0, v2

    .line 26
    .line 27
    if-gez v2, :cond_0

    .line 28
    .line 29
    iget-object p0, p0, La/fnd0;->a:La/vwb0;

    .line 30
    .line 31
    const/high16 v0, -0x40800000    # -1.0f

    .line 32
    .line 33
    invoke-virtual {p0}, La/vwb0;->b()Landroid/content/SharedPreferences;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v1, "sum"

    .line 38
    .line 39
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences;->getFloat(Ljava/lang/String;F)F

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p0}, La/wvb;->N(F)D

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    :cond_0
    return-wide v0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-object p0, p0, La/p4u;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/xre;

    .line 4
    .line 5
    iget-object p0, p0, La/xre;->a:La/ave;

    .line 6
    .line 7
    iget-object p0, p0, La/ave;->c:La/ql5;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-wide v0, p0, La/ql5;->a:J

    .line 12
    .line 13
    return-wide v0

    .line 14
    :cond_0
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    return-wide v0
.end method

.method public c(Ljava/util/List;)La/bt9;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object p0, p0, La/p4u;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/ju9;

    .line 15
    .line 16
    iget-object p0, p0, La/ju9;->b:La/knf0;

    .line 17
    .line 18
    invoke-virtual {p0}, La/knf0;->c()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    move-object v3, v2

    .line 37
    check-cast v3, La/bt9;

    .line 38
    .line 39
    iget-object v3, v3, La/bt9;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v3, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move-object v2, v1

    .line 49
    :goto_0
    check-cast v2, La/bt9;

    .line 50
    .line 51
    if-nez v2, :cond_6

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-object v2, v0

    .line 68
    check-cast v2, La/bt9;

    .line 69
    .line 70
    iget-object v2, v2, La/bt9;->c:Ljava/lang/String;

    .line 71
    .line 72
    const-string v3, "en_GB"

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    move-object v1, v0

    .line 81
    :cond_4
    check-cast v1, La/bt9;

    .line 82
    .line 83
    if-nez v1, :cond_5

    .line 84
    .line 85
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, La/bt9;

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_5
    return-object v1

    .line 93
    :cond_6
    return-object v2
.end method

.method public d(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/p4u;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/mii0;

    .line 7
    .line 8
    iget-object p0, p0, La/mii0;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/hk3;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, Ljava/io/File;

    .line 16
    .line 17
    new-instance v1, Ljava/io/File;

    .line 18
    .line 19
    iget-object p0, p0, La/hk3;->a:La/us00;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v2, ".CWAC-Update"

    .line 26
    .line 27
    invoke-direct {v1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, La/hk3;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public e(La/zje;)Ljava/io/Serializable;
    .locals 8

    .line 1
    iget-object v0, p0, La/p4u;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/wsf0;

    .line 4
    .line 5
    instance-of v1, p1, La/zdu;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    check-cast v1, La/zdu;

    .line 11
    .line 12
    iget v2, v1, La/zdu;->m:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/zdu;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/zdu;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, La/zdu;-><init>(La/p4u;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p0, v1, La/zdu;->k:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p1, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v1, La/zdu;->m:I

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    const/4 v4, 0x1

    .line 37
    const/4 v5, 0x0

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v5

    .line 54
    :cond_2
    iget-object v0, v1, La/zdu;->j:La/bm5;

    .line 55
    .line 56
    iget-object v2, v1, La/zdu;->i:La/bsu;

    .line 57
    .line 58
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance v2, La/bsu;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    sget-object p0, La/bm5;->d:La/bm5;

    .line 71
    .line 72
    invoke-virtual {v0}, La/wsf0;->g()La/urt;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v2, v1, La/zdu;->i:La/bsu;

    .line 77
    .line 78
    iput-object p0, v1, La/zdu;->j:La/bm5;

    .line 79
    .line 80
    iput v4, v1, La/zdu;->m:I

    .line 81
    .line 82
    invoke-static {v0, v1}, La/urt;->a(La/urt;La/zje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-ne v0, p1, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    move-object v7, v0

    .line 90
    move-object v0, p0

    .line 91
    move-object p0, v7

    .line 92
    :goto_1
    check-cast p0, Ljava/util/List;

    .line 93
    .line 94
    iput-object v5, v1, La/zdu;->i:La/bsu;

    .line 95
    .line 96
    iput-object v5, v1, La/zdu;->j:La/bm5;

    .line 97
    .line 98
    iput v3, v1, La/zdu;->m:I

    .line 99
    .line 100
    invoke-static {v2, v0, p0, v1}, La/bsu;->b(La/bsu;La/bm5;Ljava/util/List;La/zje;)Ljava/util/ArrayList;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-ne p0, p1, :cond_5

    .line 105
    .line 106
    :goto_2
    return-object p1

    .line 107
    :cond_5
    :goto_3
    check-cast p0, Ljava/lang/Iterable;

    .line 108
    .line 109
    new-instance p1, Ljava/util/ArrayList;

    .line 110
    .line 111
    const/16 v0, 0xa

    .line 112
    .line 113
    invoke-static {p0, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_6

    .line 129
    .line 130
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, La/ql5;

    .line 135
    .line 136
    new-instance v2, La/wxs0;

    .line 137
    .line 138
    iget-wide v3, v1, La/ql5;->a:J

    .line 139
    .line 140
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    iget-object v4, v1, La/ql5;->m:Ljava/lang/String;

    .line 145
    .line 146
    iget-wide v5, v1, La/ql5;->b:D

    .line 147
    .line 148
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    iget-object v1, v1, La/ql5;->f:Ljava/lang/String;

    .line 153
    .line 154
    filled-new-array {v4, v5, v1}, [Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    const/4 v4, 0x3

    .line 159
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    const-string v4, "%1$s (%2$.2f %3$s)"

    .line 164
    .line 165
    invoke-static {v3, v4, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    invoke-direct {v2, v0}, La/wxs0;-><init>(B)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_6
    return-object p1
.end method

.method public f(IILa/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, La/aru;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/aru;

    .line 7
    .line 8
    iget v1, v0, La/aru;->l:I

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
    iput v1, v0, La/aru;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/aru;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/aru;-><init>(La/p4u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/aru;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/aru;->l:I

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
    iget p2, v0, La/aru;->i:I

    .line 37
    .line 38
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/p4u;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/uqe;

    .line 55
    .line 56
    iput p2, v0, La/aru;->i:I

    .line 57
    .line 58
    iput v3, v0, La/aru;->l:I

    .line 59
    .line 60
    invoke-virtual {p0, p1, v0}, La/uqe;->e(ILa/zje;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    if-ne p3, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Iterable;

    .line 68
    .line 69
    new-instance p0, Ljava/util/ArrayList;

    .line 70
    .line 71
    const/16 p1, 0xa

    .line 72
    .line 73
    invoke-static {p3, p1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, La/glt;

    .line 95
    .line 96
    sget-object v1, La/uue0;->b:La/uue0;

    .line 97
    .line 98
    invoke-static {v0, v1, p2}, La/x1x;->T(La/glt;La/uue0;I)La/rue0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    new-instance p2, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-static {p0, p1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_6

    .line 124
    .line 125
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, La/rue0;

    .line 130
    .line 131
    iget-boolean p3, p1, La/rue0;->c:Z

    .line 132
    .line 133
    if-eqz p3, :cond_5

    .line 134
    .line 135
    invoke-static {p1}, La/rue0;->a(La/rue0;)La/rue0;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    :cond_5
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_6
    new-instance p0, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {p0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-le p1, v3, :cond_7

    .line 153
    .line 154
    new-instance p1, La/vvt;

    .line 155
    .line 156
    const/16 p2, 0x16

    .line 157
    .line 158
    invoke-direct {p1, p2}, La/vvt;-><init>(B)V

    .line 159
    .line 160
    .line 161
    invoke-static {p1, p0}, La/v3d;->t(Ljava/util/Comparator;Ljava/util/List;)V

    .line 162
    .line 163
    .line 164
    :cond_7
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-le p1, v3, :cond_8

    .line 169
    .line 170
    new-instance p1, La/vvt;

    .line 171
    .line 172
    const/16 p2, 0x17

    .line 173
    .line 174
    invoke-direct {p1, p2}, La/vvt;-><init>(B)V

    .line 175
    .line 176
    .line 177
    invoke-static {p1, p0}, La/v3d;->t(Ljava/util/Comparator;Ljava/util/List;)V

    .line 178
    .line 179
    .line 180
    :cond_8
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_9

    .line 185
    .line 186
    goto/16 :goto_8

    .line 187
    .line 188
    :cond_9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    :cond_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    if-eqz p2, :cond_11

    .line 197
    .line 198
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    check-cast p2, La/rue0;

    .line 203
    .line 204
    iget-boolean p2, p2, La/rue0;->e:Z

    .line 205
    .line 206
    if-eqz p2, :cond_a

    .line 207
    .line 208
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    const/4 p2, 0x0

    .line 213
    move p3, p2

    .line 214
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    const/4 v1, -0x1

    .line 219
    if-eqz v0, :cond_c

    .line 220
    .line 221
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, La/rue0;

    .line 226
    .line 227
    iget-boolean v0, v0, La/rue0;->e:Z

    .line 228
    .line 229
    if-eqz v0, :cond_b

    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_b
    add-int/lit8 p3, p3, 0x1

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_c
    move p3, v1

    .line 236
    :goto_5
    if-eq p3, v1, :cond_d

    .line 237
    .line 238
    new-instance v2, La/rue0;

    .line 239
    .line 240
    const/4 v8, 0x1

    .line 241
    const/16 v9, 0xcf

    .line 242
    .line 243
    const-wide/16 v3, 0x0

    .line 244
    .line 245
    const/4 v5, 0x0

    .line 246
    const/4 v6, 0x0

    .line 247
    const/4 v7, 0x0

    .line 248
    invoke-direct/range {v2 .. v9}, La/rue0;-><init>(JLjava/lang/String;ZLa/uue0;ZI)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, p3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :cond_d
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result p3

    .line 262
    if-eqz p3, :cond_f

    .line 263
    .line 264
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p3

    .line 268
    check-cast p3, La/rue0;

    .line 269
    .line 270
    iget-boolean p3, p3, La/rue0;->e:Z

    .line 271
    .line 272
    if-nez p3, :cond_e

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_e
    add-int/lit8 p2, p2, 0x1

    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_f
    move p2, v1

    .line 279
    :goto_7
    if-eq p2, v1, :cond_10

    .line 280
    .line 281
    new-instance v2, La/rue0;

    .line 282
    .line 283
    const/4 v8, 0x0

    .line 284
    const/16 v9, 0xcf

    .line 285
    .line 286
    const-wide/16 v3, 0x0

    .line 287
    .line 288
    const/4 v5, 0x0

    .line 289
    const/4 v6, 0x0

    .line 290
    const/4 v7, 0x0

    .line 291
    invoke-direct/range {v2 .. v9}, La/rue0;-><init>(JLjava/lang/String;ZLa/uue0;ZI)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p0, p2, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :cond_10
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    :cond_11
    :goto_8
    return-object p0
.end method

.method public g(ILa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/x5u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/x5u;

    .line 7
    .line 8
    iget v1, v0, La/x5u;->k:I

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
    iput v1, v0, La/x5u;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/x5u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/x5u;-><init>(La/p4u;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/x5u;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/x5u;->k:I

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
    iget-object p0, p0, La/p4u;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/z220;

    .line 53
    .line 54
    iput v4, v0, La/x5u;->k:I

    .line 55
    .line 56
    const/4 p2, 0x0

    .line 57
    invoke-virtual {p0, p1, v0, p3, p2}, La/z220;->k(ILa/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    if-ne p2, v1, :cond_3

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    :goto_1
    check-cast p2, La/kgb;

    .line 65
    .line 66
    iget-object p0, p2, La/kgb;->c:La/deb;

    .line 67
    .line 68
    if-eqz p0, :cond_4

    .line 69
    .line 70
    iget-object v3, p0, La/deb;->b:Ljava/util/List;

    .line 71
    .line 72
    :cond_4
    if-nez v3, :cond_5

    .line 73
    .line 74
    sget-object p0, La/iun;->a:La/iun;

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_5
    return-object v3
.end method
