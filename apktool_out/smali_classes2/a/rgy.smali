.class public final La/rgy;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:La/rgy;


# instance fields
.field public final a:La/siy;

.field public final b:La/fm40;

.field public final c:Ljava/lang/Boolean;

.field public final d:La/ihy;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/List;

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/rgy;

    .line 2
    .line 3
    sget-object v5, La/iun;->a:La/iun;

    .line 4
    .line 5
    const/4 v9, 0x0

    .line 6
    const/4 v10, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    move-object v6, v5

    .line 14
    invoke-direct/range {v0 .. v10}, La/rgy;-><init>(La/siy;La/fm40;Ljava/lang/Boolean;La/ihy;Ljava/util/List;Ljava/util/List;ZZZZ)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/rgy;->k:La/rgy;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(La/siy;La/fm40;Ljava/lang/Boolean;La/ihy;Ljava/util/List;Ljava/util/List;ZZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/rgy;->a:La/siy;

    .line 11
    .line 12
    iput-object p2, p0, La/rgy;->b:La/fm40;

    .line 13
    .line 14
    iput-object p3, p0, La/rgy;->c:Ljava/lang/Boolean;

    .line 15
    .line 16
    iput-object p4, p0, La/rgy;->d:La/ihy;

    .line 17
    .line 18
    iput-object p5, p0, La/rgy;->e:Ljava/util/List;

    .line 19
    .line 20
    iput-object p6, p0, La/rgy;->f:Ljava/util/List;

    .line 21
    .line 22
    iput-boolean p7, p0, La/rgy;->g:Z

    .line 23
    .line 24
    iput-boolean p8, p0, La/rgy;->h:Z

    .line 25
    .line 26
    iput-boolean p9, p0, La/rgy;->i:Z

    .line 27
    .line 28
    iput-boolean p10, p0, La/rgy;->j:Z

    .line 29
    .line 30
    return-void
.end method

.method public static a(La/rgy;La/siy;La/fm40;Ljava/lang/Boolean;La/ihy;Ljava/util/List;Ljava/util/List;ZZZZI)La/rgy;
    .locals 11

    .line 1
    move/from16 v0, p11

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/rgy;->a:La/siy;

    .line 8
    .line 9
    :cond_0
    move-object v1, p1

    .line 10
    and-int/lit8 p1, v0, 0x2

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p2, p0, La/rgy;->b:La/fm40;

    .line 15
    .line 16
    :cond_1
    move-object v2, p2

    .line 17
    and-int/lit8 p1, v0, 0x4

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object p3, p0, La/rgy;->c:Ljava/lang/Boolean;

    .line 22
    .line 23
    :cond_2
    move-object v3, p3

    .line 24
    and-int/lit8 p1, v0, 0x8

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    iget-object p4, p0, La/rgy;->d:La/ihy;

    .line 29
    .line 30
    :cond_3
    move-object v4, p4

    .line 31
    and-int/lit8 p1, v0, 0x10

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    iget-object p1, p0, La/rgy;->e:Ljava/util/List;

    .line 36
    .line 37
    move-object v5, p1

    .line 38
    goto :goto_0

    .line 39
    :cond_4
    move-object/from16 v5, p5

    .line 40
    .line 41
    :goto_0
    and-int/lit8 p1, v0, 0x20

    .line 42
    .line 43
    if-eqz p1, :cond_5

    .line 44
    .line 45
    iget-object p1, p0, La/rgy;->f:Ljava/util/List;

    .line 46
    .line 47
    move-object v6, p1

    .line 48
    goto :goto_1

    .line 49
    :cond_5
    move-object/from16 v6, p6

    .line 50
    .line 51
    :goto_1
    and-int/lit8 p1, v0, 0x40

    .line 52
    .line 53
    if-eqz p1, :cond_6

    .line 54
    .line 55
    iget-boolean p1, p0, La/rgy;->g:Z

    .line 56
    .line 57
    move v7, p1

    .line 58
    goto :goto_2

    .line 59
    :cond_6
    move/from16 v7, p7

    .line 60
    .line 61
    :goto_2
    and-int/lit16 p1, v0, 0x80

    .line 62
    .line 63
    if-eqz p1, :cond_7

    .line 64
    .line 65
    iget-boolean p1, p0, La/rgy;->h:Z

    .line 66
    .line 67
    move v8, p1

    .line 68
    goto :goto_3

    .line 69
    :cond_7
    move/from16 v8, p8

    .line 70
    .line 71
    :goto_3
    and-int/lit16 p1, v0, 0x100

    .line 72
    .line 73
    if-eqz p1, :cond_8

    .line 74
    .line 75
    iget-boolean p1, p0, La/rgy;->i:Z

    .line 76
    .line 77
    move v9, p1

    .line 78
    goto :goto_4

    .line 79
    :cond_8
    move/from16 v9, p9

    .line 80
    .line 81
    :goto_4
    and-int/lit16 p1, v0, 0x200

    .line 82
    .line 83
    if-eqz p1, :cond_9

    .line 84
    .line 85
    iget-boolean p1, p0, La/rgy;->j:Z

    .line 86
    .line 87
    move v10, p1

    .line 88
    goto :goto_5

    .line 89
    :cond_9
    move/from16 v10, p10

    .line 90
    .line 91
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v0, La/rgy;

    .line 101
    .line 102
    invoke-direct/range {v0 .. v10}, La/rgy;-><init>(La/siy;La/fm40;Ljava/lang/Boolean;La/ihy;Ljava/util/List;Ljava/util/List;ZZZZ)V

    .line 103
    .line 104
    .line 105
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/util/List;)La/siy;
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/rgy;->e:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {v0, p2}, La/two;->g(Ljava/util/List;Ljava/util/List;)La/siy;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object p0, p0, La/rgy;->a:La/siy;

    .line 14
    .line 15
    if-eqz p2, :cond_6

    .line 16
    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    sget-object v0, La/siy;->c:La/siy;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, p0

    .line 23
    :goto_0
    iget-object v1, p2, La/siy;->a:Ljava/util/Map;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-boolean v2, p2, La/siy;->b:Z

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    iget-boolean v2, v0, La/siy;->b:Z

    .line 33
    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/4 v2, 0x0

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    :goto_1
    const/4 v2, 0x1

    .line 40
    :goto_2
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0, v2}, La/siy;->a(Z)La/siy;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    iget-object v0, v0, La/siy;->a:Ljava/util/Map;

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_4

    .line 58
    .line 59
    invoke-virtual {p2, v2}, La/siy;->a(Z)La/siy;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    goto :goto_3

    .line 64
    :cond_4
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Ljava/lang/Iterable;

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Ljava/lang/Iterable;

    .line 75
    .line 76
    invoke-static {p2, v3}, Lkotlin/collections/CollectionsKt;->Z(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-eqz p2, :cond_5

    .line 85
    .line 86
    new-instance p1, La/siy;

    .line 87
    .line 88
    invoke-static {v1, v0}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-direct {p1, p2, v2}, La/siy;-><init>(Ljava/util/Map;Z)V

    .line 93
    .line 94
    .line 95
    :goto_3
    if-eqz p1, :cond_6

    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string p2, "Substitutors must not have intersecting keys: "

    .line 101
    .line 102
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const/4 v8, 0x0

    .line 106
    const/16 v9, 0x3f

    .line 107
    .line 108
    const/4 v5, 0x0

    .line 109
    const/4 v6, 0x0

    .line 110
    const/4 v7, 0x0

    .line 111
    invoke-static/range {v4 .. v9}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    const-string v0, ". Member: "

    .line 116
    .line 117
    invoke-static {p0, p2, v0, p1}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-static {p0}, La/c99;->v(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    const/4 p0, 0x0

    .line 125
    return-object p0

    .line 126
    :cond_6
    if-nez p0, :cond_7

    .line 127
    .line 128
    sget-object p0, La/siy;->c:La/siy;

    .line 129
    .line 130
    :cond_7
    return-object p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/rgy;->d:La/ihy;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final d(La/siy;)La/rgy;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/rgy;->a:La/siy;

    .line 5
    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    iget-object v1, v0, La/siy;->a:Ljava/util/Map;

    .line 9
    .line 10
    iget-object v2, p1, La/siy;->a:Ljava/util/Map;

    .line 11
    .line 12
    iget-boolean v3, v0, La/siy;->b:Z

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :cond_0
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    move-object v0, p1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    iget-boolean v3, p1, La/siy;->b:Z

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0, v3}, La/siy;->a(Z)La/siy;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-static {v4}, La/wp20;->a(I)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-direct {v0, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Ljava/lang/Iterable;

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ljava/util/Map$Entry;

    .line 73
    .line 74
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Lkotlin/reflect/KTypeProjection;

    .line 83
    .line 84
    iget-object v6, v4, Lkotlin/reflect/KTypeProjection;->b:La/kiy;

    .line 85
    .line 86
    iget-object v7, v4, Lkotlin/reflect/KTypeProjection;->a:La/uiy;

    .line 87
    .line 88
    if-eqz v6, :cond_3

    .line 89
    .line 90
    if-eqz v7, :cond_3

    .line 91
    .line 92
    invoke-virtual {p1, v6, v7}, La/siy;->b(La/kiy;La/uiy;)Lkotlin/reflect/KTypeProjection;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    :cond_3
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    new-instance v1, La/siy;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    check-cast v4, Ljava/lang/Iterable;

    .line 107
    .line 108
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    check-cast v5, Ljava/lang/Iterable;

    .line 113
    .line 114
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->Z(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_6

    .line 123
    .line 124
    invoke-static {v0, v2}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-direct {v1, v0, v3}, La/siy;-><init>(Ljava/util/Map;Z)V

    .line 129
    .line 130
    .line 131
    move-object v0, v1

    .line 132
    :goto_1
    if-nez v0, :cond_5

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    move-object v1, v0

    .line 136
    goto :goto_3

    .line 137
    :cond_6
    const-string p0, "Substitutors must not have intersecting keys: "

    .line 138
    .line 139
    invoke-static {v4, p0}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const/4 p0, 0x0

    .line 143
    return-object p0

    .line 144
    :cond_7
    :goto_2
    move-object v1, p1

    .line 145
    :goto_3
    const/4 v10, 0x0

    .line 146
    const/16 v11, 0x3fe

    .line 147
    .line 148
    const/4 v2, 0x0

    .line 149
    const/4 v3, 0x0

    .line 150
    const/4 v4, 0x0

    .line 151
    const/4 v5, 0x0

    .line 152
    const/4 v6, 0x0

    .line 153
    const/4 v7, 0x0

    .line 154
    const/4 v8, 0x0

    .line 155
    const/4 v9, 0x0

    .line 156
    move-object v0, p0

    .line 157
    invoke-static/range {v0 .. v11}, La/rgy;->a(La/rgy;La/siy;La/fm40;Ljava/lang/Boolean;La/ihy;Ljava/util/List;Ljava/util/List;ZZZZI)La/rgy;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/rgy;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/rgy;

    .line 12
    .line 13
    iget-object v1, p0, La/rgy;->a:La/siy;

    .line 14
    .line 15
    iget-object v3, p1, La/rgy;->a:La/siy;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, La/rgy;->b:La/fm40;

    .line 25
    .line 26
    iget-object v3, p1, La/rgy;->b:La/fm40;

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, La/rgy;->c:Ljava/lang/Boolean;

    .line 32
    .line 33
    iget-object v3, p1, La/rgy;->c:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, La/rgy;->d:La/ihy;

    .line 43
    .line 44
    iget-object v3, p1, La/rgy;->d:La/ihy;

    .line 45
    .line 46
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-object v1, p0, La/rgy;->e:Ljava/util/List;

    .line 54
    .line 55
    iget-object v3, p1, La/rgy;->e:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    return v2

    .line 64
    :cond_6
    iget-object v1, p0, La/rgy;->f:Ljava/util/List;

    .line 65
    .line 66
    iget-object v3, p1, La/rgy;->f:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-nez v1, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget-boolean v1, p0, La/rgy;->g:Z

    .line 76
    .line 77
    iget-boolean v3, p1, La/rgy;->g:Z

    .line 78
    .line 79
    if-eq v1, v3, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    iget-boolean v1, p0, La/rgy;->h:Z

    .line 83
    .line 84
    iget-boolean v3, p1, La/rgy;->h:Z

    .line 85
    .line 86
    if-eq v1, v3, :cond_9

    .line 87
    .line 88
    return v2

    .line 89
    :cond_9
    iget-boolean v1, p0, La/rgy;->i:Z

    .line 90
    .line 91
    iget-boolean v3, p1, La/rgy;->i:Z

    .line 92
    .line 93
    if-eq v1, v3, :cond_a

    .line 94
    .line 95
    return v2

    .line 96
    :cond_a
    iget-boolean p0, p0, La/rgy;->j:Z

    .line 97
    .line 98
    iget-boolean p1, p1, La/rgy;->j:Z

    .line 99
    .line 100
    if-eq p0, p1, :cond_b

    .line 101
    .line 102
    return v2

    .line 103
    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/rgy;->a:La/siy;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v1, v2

    .line 15
    iget-object v3, p0, La/rgy;->b:La/fm40;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    move v3, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    :goto_1
    add-int/2addr v1, v3

    .line 26
    mul-int/2addr v1, v2

    .line 27
    iget-object v3, p0, La/rgy;->c:Ljava/lang/Boolean;

    .line 28
    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    move v3, v0

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    :goto_2
    add-int/2addr v1, v3

    .line 38
    mul-int/2addr v1, v2

    .line 39
    iget-object v3, p0, La/rgy;->d:La/ihy;

    .line 40
    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    :goto_3
    add-int/2addr v1, v0

    .line 49
    mul-int/2addr v1, v2

    .line 50
    iget-object v0, p0, La/rgy;->e:Ljava/util/List;

    .line 51
    .line 52
    invoke-static {v1, v2, v0}, La/dw9;->a(IILjava/util/List;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v1, p0, La/rgy;->f:Ljava/util/List;

    .line 57
    .line 58
    invoke-static {v0, v2, v1}, La/dw9;->a(IILjava/util/List;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-boolean v1, p0, La/rgy;->g:Z

    .line 63
    .line 64
    invoke-static {v0, v2, v1}, La/brm0;->e(IIZ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-boolean v1, p0, La/rgy;->h:Z

    .line 69
    .line 70
    invoke-static {v0, v2, v1}, La/brm0;->e(IIZ)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-boolean v1, p0, La/rgy;->i:Z

    .line 75
    .line 76
    invoke-static {v0, v2, v1}, La/brm0;->e(IIZ)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-boolean p0, p0, La/rgy;->j:Z

    .line 81
    .line 82
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    add-int/2addr p0, v0

    .line 87
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "KCallableOverriddenStorage(classTypeParametersSubstitutor="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/rgy;->a:La/siy;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", modality="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/rgy;->b:La/fm40;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", isStatic="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/rgy;->c:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", originalContainerIfFakeOverride="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/rgy;->d:La/ihy;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", originalCallableTypeParameters="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/rgy;->e:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", overridden="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/rgy;->f:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", forceIsExternal="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-boolean v1, p0, La/rgy;->g:Z

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", forceIsOperator="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-boolean v1, p0, La/rgy;->h:Z

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", forceIsInfix="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-boolean v1, p0, La/rgy;->i:Z

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", forceIsInline="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-boolean p0, p0, La/rgy;->j:Z

    .line 99
    .line 100
    const/16 v1, 0x29

    .line 101
    .line 102
    invoke-static {v0, p0, v1}, La/brm0;->o(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0
.end method
