.class public final La/pdz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    const/high16 v1, 0x3f400000    # 0.75f

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/16 v3, 0x10

    .line 13
    .line 14
    invoke-direct {v0, v3, v1, v2}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, La/kzg0;

    .line 32
    .line 33
    iget-object v2, v1, La/kzg0;->a:Ljava/lang/Object;

    .line 34
    .line 35
    new-instance v3, La/ndz;

    .line 36
    .line 37
    new-instance v4, La/r9h0;

    .line 38
    .line 39
    iget v5, v1, La/kzg0;->b:I

    .line 40
    .line 41
    iget v1, v1, La/kzg0;->c:I

    .line 42
    .line 43
    invoke-direct {v4, v5, v1}, La/r9h0;-><init>(II)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v3, v4}, La/ndz;-><init>(La/r9h0;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iput-object v0, p0, La/pdz;->a:Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 9

    .line 1
    const v0, -0x30508f4f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x6

    .line 8
    .line 9
    const/4 v1, 0x4

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    and-int/lit8 v0, p4, 0x8

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p3, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    move v0, v1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 v0, 0x2

    .line 30
    :goto_1
    or-int/2addr v0, p4

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move v0, p4

    .line 33
    :goto_2
    and-int/lit8 v2, p4, 0x30

    .line 34
    .line 35
    const/16 v3, 0x20

    .line 36
    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    invoke-virtual {p3, p2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    move v2, v3

    .line 46
    goto :goto_3

    .line 47
    :cond_3
    const/16 v2, 0x10

    .line 48
    .line 49
    :goto_3
    or-int/2addr v0, v2

    .line 50
    :cond_4
    and-int/lit16 v2, p4, 0x180

    .line 51
    .line 52
    const/16 v4, 0x100

    .line 53
    .line 54
    if-nez v2, :cond_6

    .line 55
    .line 56
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_5

    .line 61
    .line 62
    move v2, v4

    .line 63
    goto :goto_4

    .line 64
    :cond_5
    const/16 v2, 0x80

    .line 65
    .line 66
    :goto_4
    or-int/2addr v0, v2

    .line 67
    :cond_6
    and-int/lit16 v2, v0, 0x93

    .line 68
    .line 69
    const/16 v5, 0x92

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    const/4 v7, 0x1

    .line 73
    if-eq v2, v5, :cond_7

    .line 74
    .line 75
    move v2, v7

    .line 76
    goto :goto_5

    .line 77
    :cond_7
    move v2, v6

    .line 78
    :goto_5
    and-int/lit8 v5, v0, 0x1

    .line 79
    .line 80
    invoke-virtual {p3, v5, v2}, La/fet;->U(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_e

    .line 85
    .line 86
    and-int/lit8 v2, v0, 0x70

    .line 87
    .line 88
    if-ne v2, v3, :cond_8

    .line 89
    .line 90
    move v2, v7

    .line 91
    goto :goto_6

    .line 92
    :cond_8
    move v2, v6

    .line 93
    :goto_6
    and-int/lit16 v3, v0, 0x380

    .line 94
    .line 95
    if-ne v3, v4, :cond_9

    .line 96
    .line 97
    move v3, v7

    .line 98
    goto :goto_7

    .line 99
    :cond_9
    move v3, v6

    .line 100
    :goto_7
    or-int/2addr v2, v3

    .line 101
    and-int/lit8 v3, v0, 0xe

    .line 102
    .line 103
    if-eq v3, v1, :cond_a

    .line 104
    .line 105
    and-int/lit8 v0, v0, 0x8

    .line 106
    .line 107
    if-eqz v0, :cond_b

    .line 108
    .line 109
    invoke-virtual {p3, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_b

    .line 114
    .line 115
    :cond_a
    move v6, v7

    .line 116
    :cond_b
    or-int v0, v2, v6

    .line 117
    .line 118
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-nez v0, :cond_d

    .line 123
    .line 124
    sget-object v0, La/ukd;->a:La/cl5;

    .line 125
    .line 126
    if-ne v1, v0, :cond_c

    .line 127
    .line 128
    goto :goto_8

    .line 129
    :cond_c
    move-object v4, p0

    .line 130
    move-object v5, p1

    .line 131
    move-object v3, p2

    .line 132
    goto :goto_9

    .line 133
    :cond_d
    :goto_8
    new-instance v2, La/c6y;

    .line 134
    .line 135
    const/4 v6, 0x0

    .line 136
    const/16 v7, 0xe

    .line 137
    .line 138
    move-object v4, p0

    .line 139
    move-object v5, p1

    .line 140
    move-object v3, p2

    .line 141
    invoke-direct/range {v2 .. v7}, La/c6y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    move-object v1, v2

    .line 148
    :goto_9
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 149
    .line 150
    invoke-static {p3, v5, v1}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 151
    .line 152
    .line 153
    goto :goto_a

    .line 154
    :cond_e
    move-object v4, p0

    .line 155
    move-object v5, p1

    .line 156
    move-object v3, p2

    .line 157
    invoke-virtual {p3}, La/fet;->X()V

    .line 158
    .line 159
    .line 160
    :goto_a
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    if-eqz p0, :cond_f

    .line 165
    .line 166
    move-object v6, v3

    .line 167
    new-instance v3, La/r3o;

    .line 168
    .line 169
    const/16 v8, 0x1a

    .line 170
    .line 171
    move v7, p4

    .line 172
    invoke-direct/range {v3 .. v8}, La/r3o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 173
    .line 174
    .line 175
    iput-object v3, p0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 176
    .line 177
    :cond_f
    return-void
.end method

.method public final b(Ljava/lang/String;La/fet;I)La/xcz;
    .locals 4

    .line 1
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    new-instance v0, La/hvy;

    .line 10
    .line 11
    const/16 v2, 0x10

    .line 12
    .line 13
    invoke-direct {v0, v2}, La/hvy;-><init>(B)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, La/pdz;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)La/bch0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, La/xcz;

    .line 26
    .line 27
    invoke-virtual {p2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    if-ne v3, v1, :cond_2

    .line 38
    .line 39
    :cond_1
    new-instance v3, La/a7s;

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    invoke-direct {v3, v0, v1}, La/a7s;-><init>(La/xcz;B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 49
    .line 50
    and-int/lit8 v1, p3, 0xe

    .line 51
    .line 52
    shl-int/lit8 p3, p3, 0x3

    .line 53
    .line 54
    and-int/lit16 p3, p3, 0x380

    .line 55
    .line 56
    or-int/2addr p3, v1

    .line 57
    invoke-virtual {p0, p1, v3, p2, p3}, La/pdz;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public final c(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)La/bch0;
    .locals 3

    .line 1
    iget-object p0, p0, La/pdz;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, La/ndz;

    .line 10
    .line 11
    new-instance v1, La/r9h0;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, v2, v2}, La/r9h0;-><init>(II)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, La/ndz;-><init>(La/r9h0;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_0
    check-cast v0, La/ndz;

    .line 24
    .line 25
    iget-object p1, v0, La/ndz;->a:La/r9h0;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/util/AbstractMap;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/16 v2, 0x40

    .line 32
    .line 33
    if-le v1, v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast v1, Ljava/lang/Iterable;

    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->T(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p0, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object p0, v0, La/ndz;->b:La/bch0;

    .line 52
    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_2
    iget p0, p1, La/r9h0;->a:I

    .line 57
    .line 58
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget p1, p1, La/r9h0;->b:I

    .line 63
    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p2, p0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, La/bch0;

    .line 73
    .line 74
    iput-object p0, v0, La/ndz;->b:La/bch0;

    .line 75
    .line 76
    return-object p0
.end method

.method public final d(Ljava/lang/String;ILa/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, La/odz;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/odz;

    .line 7
    .line 8
    iget v1, v0, La/odz;->l:I

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
    iput v1, v0, La/odz;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/odz;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/odz;-><init>(La/pdz;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/odz;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/odz;->l:I

    .line 30
    .line 31
    const/4 v3, 0x3

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
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

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
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    :cond_2
    :goto_1
    iget-object p0, v0, La/odz;->i:La/ndz;

    .line 51
    .line 52
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, La/pdz;->a:Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/ndz;

    .line 66
    .line 67
    if-nez p0, :cond_4

    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_4
    iget-object p1, p0, La/ndz;->a:La/r9h0;

    .line 73
    .line 74
    iget p3, p1, La/r9h0;->b:I

    .line 75
    .line 76
    iget-object v2, p0, La/ndz;->b:La/bch0;

    .line 77
    .line 78
    if-nez v2, :cond_5

    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_5
    iget-boolean v6, p0, La/ndz;->c:Z

    .line 84
    .line 85
    if-nez v6, :cond_a

    .line 86
    .line 87
    new-instance v6, La/r9h0;

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    invoke-direct {v6, v7, v7}, La/r9h0;-><init>(II)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v6}, La/r9h0;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_6

    .line 98
    .line 99
    iput-boolean v5, p0, La/ndz;->c:Z

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_6
    iget p1, p1, La/r9h0;->a:I

    .line 103
    .line 104
    if-le p2, p1, :cond_a

    .line 105
    .line 106
    instance-of p2, v2, La/xcz;

    .line 107
    .line 108
    if-eqz p2, :cond_7

    .line 109
    .line 110
    check-cast v2, La/xcz;

    .line 111
    .line 112
    iput-object p0, v0, La/odz;->i:La/ndz;

    .line 113
    .line 114
    iput v5, v0, La/odz;->l:I

    .line 115
    .line 116
    invoke-virtual {v2, p1, p3, v0}, La/xcz;->l(IILa/yje;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-ne p1, v1, :cond_9

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_7
    instance-of p2, v2, La/d9z;

    .line 124
    .line 125
    if-eqz p2, :cond_8

    .line 126
    .line 127
    check-cast v2, La/d9z;

    .line 128
    .line 129
    iput-object p0, v0, La/odz;->i:La/ndz;

    .line 130
    .line 131
    iput v4, v0, La/odz;->l:I

    .line 132
    .line 133
    invoke-virtual {v2, p1, p3, v0}, La/d9z;->l(IILa/yje;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-ne p1, v1, :cond_9

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_8
    instance-of p2, v2, La/mez;

    .line 141
    .line 142
    if-eqz p2, :cond_9

    .line 143
    .line 144
    check-cast v2, La/mez;

    .line 145
    .line 146
    iput-object p0, v0, La/odz;->i:La/ndz;

    .line 147
    .line 148
    iput v3, v0, La/odz;->l:I

    .line 149
    .line 150
    invoke-virtual {v2, p1, p3, v0}, La/mez;->k(IILa/yje;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-ne p1, v1, :cond_9

    .line 155
    .line 156
    :goto_2
    return-object v1

    .line 157
    :cond_9
    :goto_3
    iput-boolean v5, p0, La/ndz;->c:Z

    .line 158
    .line 159
    :cond_a
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object p0
.end method
