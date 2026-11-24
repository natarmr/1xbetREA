.class public final La/ti80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/el80;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/LinkedHashMap;

.field public e:I

.field public final f:La/q99;

.field public final g:La/q99;

.field public final h:Ljava/util/LinkedHashMap;

.field public final i:La/cyu;


# direct methods
.method public constructor <init>(La/el80;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ti80;->a:La/el80;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/ti80;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    iput-object p1, p0, La/ti80;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/ti80;->d:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    const/4 p1, -0x1

    .line 23
    const/4 v0, 0x0

    .line 24
    const/4 v1, 0x6

    .line 25
    invoke-static {p1, v0, v0, v1}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iput-object v2, p0, La/ti80;->f:La/q99;

    .line 30
    .line 31
    invoke-static {p1, v0, v0, v1}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, La/ti80;->g:La/q99;

    .line 36
    .line 37
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, La/ti80;->h:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    new-instance p1, La/cyu;

    .line 45
    .line 46
    const/16 v0, 0xa

    .line 47
    .line 48
    invoke-direct {p1, v0}, La/cyu;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sget-object v0, La/gp00;->a:La/gp00;

    .line 52
    .line 53
    sget-object v1, La/ap00;->b:La/ap00;

    .line 54
    .line 55
    invoke-virtual {p1, v0, v1}, La/cyu;->N(La/gp00;La/mva;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, La/ti80;->i:La/cyu;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final a(La/tmu0;)La/om80;
    .locals 12

    .line 1
    iget-object v0, p0, La/ti80;->a:La/el80;

    .line 2
    .line 3
    iget-short v1, v0, La/el80;->a:S

    .line 4
    .line 5
    iget-object v2, p0, La/ti80;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const/4 v4, 0x0

    .line 12
    if-eqz p1, :cond_5

    .line 13
    .line 14
    iget v5, p1, La/vmu0;->b:I

    .line 15
    .line 16
    iget v6, p1, La/tmu0;->e:I

    .line 17
    .line 18
    iget v7, p0, La/ti80;->e:I

    .line 19
    .line 20
    neg-int v7, v7

    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    add-int/lit8 v8, v8, -0x1

    .line 26
    .line 27
    iget v9, p0, La/ti80;->e:I

    .line 28
    .line 29
    sub-int/2addr v8, v9

    .line 30
    move v10, v4

    .line 31
    move v9, v7

    .line 32
    :goto_0
    if-ge v9, v6, :cond_1

    .line 33
    .line 34
    if-le v9, v8, :cond_0

    .line 35
    .line 36
    move v11, v1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    iget v11, p0, La/ti80;->e:I

    .line 39
    .line 40
    add-int/2addr v11, v9

    .line 41
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v11

    .line 45
    check-cast v11, La/mm80;

    .line 46
    .line 47
    iget-object v11, v11, La/mm80;->a:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    :goto_1
    add-int/2addr v10, v11

    .line 54
    add-int/lit8 v9, v9, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    if-gez v5, :cond_2

    .line 58
    .line 59
    iget p0, p0, La/ti80;->e:I

    .line 60
    .line 61
    add-int/2addr p0, v6

    .line 62
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, La/mm80;

    .line 67
    .line 68
    iget-object p0, p0, La/mm80;->a:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    add-int/lit8 p0, p0, -0x1

    .line 75
    .line 76
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    add-int/2addr p1, p0

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    iget p0, p1, La/vmu0;->a:I

    .line 83
    .line 84
    if-gez p0, :cond_3

    .line 85
    .line 86
    move p1, p0

    .line 87
    goto :goto_2

    .line 88
    :cond_3
    iget p1, p1, La/tmu0;->f:I

    .line 89
    .line 90
    :goto_2
    add-int/2addr v10, p1

    .line 91
    if-ge v6, v7, :cond_4

    .line 92
    .line 93
    sub-int/2addr v10, v1

    .line 94
    :cond_4
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    goto :goto_3

    .line 99
    :cond_5
    const/4 p0, 0x0

    .line 100
    :goto_3
    new-instance p1, La/om80;

    .line 101
    .line 102
    invoke-direct {p1, v3, p0, v0, v4}, La/om80;-><init>(Ljava/util/List;Ljava/lang/Integer;La/el80;I)V

    .line 103
    .line 104
    .line 105
    return-object p1
.end method

.method public final b()I
    .locals 2

    .line 1
    iget-object p0, p0, La/ti80;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, La/mm80;

    .line 19
    .line 20
    iget-object v1, v1, La/mm80;->a:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    add-int/2addr v0, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return v0
.end method

.method public final c(ILa/gp00;La/mm80;Ljava/lang/Object;)Z
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p3, La/mm80;->d:I

    .line 8
    .line 9
    iget-object v1, p3, La/mm80;->a:Ljava/util/List;

    .line 10
    .line 11
    iget v2, p3, La/mm80;->e:I

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    iget-object v3, p0, La/ti80;->d:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    iget-object v4, p0, La/ti80;->b:Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v5, p0, La/ti80;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    const/4 v6, 0x1

    .line 24
    const/4 v7, 0x0

    .line 25
    if-eqz p2, :cond_8

    .line 26
    .line 27
    iget-object v8, p0, La/ti80;->h:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    const/high16 v9, -0x80000000

    .line 30
    .line 31
    if-eq p2, v6, :cond_4

    .line 32
    .line 33
    const/4 p0, 0x2

    .line 34
    if-ne p2, p0, :cond_3

    .line 35
    .line 36
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-nez p0, :cond_2

    .line 41
    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3}, La/mm80;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {v3, p0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    if-ne v2, v9, :cond_1

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    :cond_1
    sget-object p0, La/gp00;->c:La/gp00;

    .line 65
    .line 66
    invoke-interface {v8, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    return v6

    .line 70
    :cond_2
    const-string p0, "should\'ve received an init before append"

    .line 71
    .line 72
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return v7

    .line 76
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 77
    .line 78
    .line 79
    return v7

    .line 80
    :cond_4
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-nez p2, :cond_7

    .line 85
    .line 86
    if-eqz p1, :cond_5

    .line 87
    .line 88
    :goto_0
    return v7

    .line 89
    :cond_5
    invoke-virtual {v4, v7, p3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p3}, La/mm80;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-interface {v3, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    iget p1, p0, La/ti80;->e:I

    .line 104
    .line 105
    add-int/2addr p1, v6

    .line 106
    iput p1, p0, La/ti80;->e:I

    .line 107
    .line 108
    if-ne v0, v9, :cond_6

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    :cond_6
    sget-object p0, La/gp00;->b:La/gp00;

    .line 114
    .line 115
    invoke-interface {v8, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    return v6

    .line 119
    :cond_7
    const-string p0, "should\'ve received an init before prepend"

    .line 120
    .line 121
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    return v7

    .line 125
    :cond_8
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    if-eqz p2, :cond_a

    .line 130
    .line 131
    if-nez p1, :cond_9

    .line 132
    .line 133
    invoke-virtual {v4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3}, La/mm80;->hashCode()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-interface {v3, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    iput v7, p0, La/ti80;->e:I

    .line 148
    .line 149
    return v6

    .line 150
    :cond_9
    const-string p0, "init loadId must be the initial value, 0"

    .line 151
    .line 152
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return v7

    .line 156
    :cond_a
    const-string p0, "cannot receive multiple init calls"

    .line 157
    .line 158
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return v7
.end method

.method public final d(La/mm80;La/gp00;)La/rh80;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x2

    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eq v0, v4, :cond_1

    .line 15
    .line 16
    if-ne v0, v3, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, La/ti80;->c:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, La/ti80;->e:I

    .line 25
    .line 26
    sub-int/2addr v0, v2

    .line 27
    add-int/lit8 v2, v0, -0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :cond_1
    iget v0, p0, La/ti80;->e:I

    .line 35
    .line 36
    sub-int/2addr v2, v0

    .line 37
    :cond_2
    :goto_0
    new-instance v0, La/kls0;

    .line 38
    .line 39
    iget-object p1, p1, La/mm80;->a:Ljava/util/List;

    .line 40
    .line 41
    invoke-direct {v0, v2, p1}, La/kls0;-><init>(ILjava/util/List;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iget-object p0, p0, La/ti80;->i:La/cyu;

    .line 53
    .line 54
    if-eqz p1, :cond_5

    .line 55
    .line 56
    if-eq p1, v4, :cond_4

    .line 57
    .line 58
    if-ne p1, v3, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0}, La/cyu;->P()La/dp00;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v5, La/rh80;

    .line 68
    .line 69
    sget-object v6, La/gp00;->c:La/gp00;

    .line 70
    .line 71
    const/4 v8, -0x1

    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v11, 0x0

    .line 74
    invoke-direct/range {v5 .. v11}, La/rh80;-><init>(La/gp00;Ljava/util/List;IILa/dp00;La/dp00;)V

    .line 75
    .line 76
    .line 77
    return-object v5

    .line 78
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 79
    .line 80
    .line 81
    return-object v1

    .line 82
    :cond_4
    invoke-virtual {p0}, La/cyu;->P()La/dp00;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance v5, La/rh80;

    .line 90
    .line 91
    sget-object v6, La/gp00;->b:La/gp00;

    .line 92
    .line 93
    const/4 v9, -0x1

    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v11, 0x0

    .line 96
    invoke-direct/range {v5 .. v11}, La/rh80;-><init>(La/gp00;Ljava/util/List;IILa/dp00;La/dp00;)V

    .line 97
    .line 98
    .line 99
    return-object v5

    .line 100
    :cond_5
    invoke-virtual {p0}, La/cyu;->P()La/dp00;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    new-instance v5, La/rh80;

    .line 108
    .line 109
    sget-object v6, La/gp00;->a:La/gp00;

    .line 110
    .line 111
    const/4 v8, 0x0

    .line 112
    const/4 v9, 0x0

    .line 113
    const/4 v11, 0x0

    .line 114
    invoke-direct/range {v5 .. v11}, La/rh80;-><init>(La/gp00;Ljava/util/List;IILa/dp00;La/dp00;)V

    .line 115
    .line 116
    .line 117
    return-object v5
.end method
