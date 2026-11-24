.class public final La/eaz;
.super La/faz;
.source "SourceFile"


# static fields
.field public static final synthetic p:I


# instance fields
.field public final n:La/mqe0;

.field public final o:La/l9z;


# direct methods
.method public constructor <init>(La/f7u;La/mqe0;La/l9z;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, La/baz;-><init>(La/f7u;La/p9z;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, La/eaz;->n:La/mqe0;

    .line 9
    .line 10
    iput-object p3, p0, La/eaz;->o:La/l9z;

    .line 11
    .line 12
    return-void
.end method

.method public static v(La/d0d0;)La/d0d0;
    .locals 2

    .line 1
    invoke-interface {p0}, La/mp9;->l()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, La/mp9;->k()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    check-cast p0, Ljava/lang/Iterable;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 v1, 0xa

    .line 21
    .line 22
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/d0d0;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, La/eaz;->v(La/d0d0;)La/d0d0;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/d0d0;

    .line 69
    .line 70
    return-object p0
.end method


# virtual methods
.method public final d(La/g950;La/ux50;)La/foc;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return-object p0
.end method

.method public final i(La/cek;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/baz;->e:La/cu00;

    .line 5
    .line 6
    invoke-virtual {p1}, La/cu00;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, La/ckj;

    .line 11
    .line 12
    invoke-interface {p1}, La/ckj;->c()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p2, p0, La/eaz;->o:La/l9z;

    .line 23
    .line 24
    invoke-static {p2}, La/pvm0;->r(La/wm40;)La/eaz;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, La/baz;->c()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    :goto_0
    if-nez v0, :cond_1

    .line 37
    .line 38
    sget-object v0, La/xun;->a:La/xun;

    .line 39
    .line 40
    :cond_1
    check-cast v0, Ljava/util/Collection;

    .line 41
    .line 42
    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, La/eaz;->n:La/mqe0;

    .line 46
    .line 47
    iget-object v0, v0, La/mqe0;->a:Ljava/lang/Class;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    sget-object v0, La/j4m0;->c:La/g950;

    .line 56
    .line 57
    sget-object v1, La/j4m0;->a:La/g950;

    .line 58
    .line 59
    filled-new-array {v0, v1}, [La/g950;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object p0, p0, La/baz;->b:La/f7u;

    .line 71
    .line 72
    iget-object v0, p0, La/f7u;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, La/v7i;

    .line 75
    .line 76
    iget-object v0, v0, La/v7i;->o:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, La/e6o0;

    .line 79
    .line 80
    check-cast v0, La/kld;

    .line 81
    .line 82
    invoke-virtual {v0, p2, p0}, La/kld;->g(La/wm40;La/f7u;)Ljava/util/ArrayList;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-interface {p1, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 87
    .line 88
    .line 89
    return-object p1
.end method

.method public final j(La/g950;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/baz;->b:La/f7u;

    .line 2
    .line 3
    iget-object v1, v0, La/f7u;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/v7i;

    .line 6
    .line 7
    iget-object v1, v1, La/v7i;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/e6o0;

    .line 10
    .line 11
    iget-object p0, p0, La/eaz;->o:La/l9z;

    .line 12
    .line 13
    check-cast v1, La/kld;

    .line 14
    .line 15
    invoke-virtual {v1, p0, p1, p2, v0}, La/kld;->d(La/wm40;La/g950;Ljava/util/ArrayList;La/f7u;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final k()La/ckj;
    .locals 2

    .line 1
    new-instance v0, La/ilc;

    .line 2
    .line 3
    iget-object p0, p0, La/eaz;->n:La/mqe0;

    .line 4
    .line 5
    sget-object v1, La/j9x;->w:La/j9x;

    .line 6
    .line 7
    invoke-direct {v0, p0, v1}, La/ilc;-><init>(La/mqe0;Lkotlin/jvm/functions/Function1;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final m(Ljava/util/LinkedHashSet;La/g950;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/eaz;->o:La/l9z;

    .line 2
    .line 3
    invoke-static {v0}, La/pvm0;->r(La/wm40;)La/eaz;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    sget-object v1, La/xun;->a:La/xun;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v2, La/ux50;->e:La/ux50;

    .line 13
    .line 14
    invoke-virtual {v1, p2, v2}, La/baz;->a(La/g950;La/ux50;)Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Iterable;

    .line 19
    .line 20
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    check-cast v1, Ljava/util/Collection;

    .line 25
    .line 26
    iget-object v2, p0, La/baz;->b:La/f7u;

    .line 27
    .line 28
    iget-object v2, v2, La/f7u;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, La/v7i;

    .line 31
    .line 32
    iget-object v2, v2, La/v7i;->m:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, La/km50;

    .line 35
    .line 36
    check-cast v2, La/lm50;

    .line 37
    .line 38
    iget-object v2, v2, La/lm50;->d:La/sf80;

    .line 39
    .line 40
    invoke-static {p2, v1, p1, v0, v2}, La/rcb;->i1(La/g950;Ljava/util/Collection;Ljava/util/AbstractCollection;La/wm40;La/sf80;)Ljava/util/LinkedHashSet;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {p1, v1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/eaz;->n:La/mqe0;

    .line 48
    .line 49
    iget-object p0, p0, La/mqe0;->a:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    sget-object p0, La/j4m0;->c:La/g950;

    .line 58
    .line 59
    invoke-virtual {p2, p0}, La/g950;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_1

    .line 64
    .line 65
    invoke-static {v0}, La/obb;->Q(La/wm40;)La/fyj0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-interface {p1, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    sget-object p0, La/j4m0;->a:La/g950;

    .line 74
    .line 75
    invoke-virtual {p2, p0}, La/g950;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    if-eqz p0, :cond_2

    .line 80
    .line 81
    invoke-static {v0}, La/obb;->R(La/wm40;)La/fyj0;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-interface {p1, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    :cond_2
    return-void
.end method

.method public final n(La/g950;Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/caz;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, p1, v2}, La/caz;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, La/eaz;->o:La/l9z;

    .line 13
    .line 14
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    sget-object v4, La/m2a;->r:La/m2a;

    .line 19
    .line 20
    new-instance v5, La/daz;

    .line 21
    .line 22
    invoke-direct {v5, v2, v0, v1}, La/daz;-><init>(La/wm40;Ljava/util/LinkedHashSet;Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v3, v4, v5}, La/ntb;->H(Ljava/util/Collection;La/syh;La/dtb;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iget-object v3, p0, La/baz;->b:La/f7u;

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    iget-object v1, v3, La/f7u;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, La/v7i;

    .line 39
    .line 40
    iget-object v1, v1, La/v7i;->m:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, La/km50;

    .line 43
    .line 44
    check-cast v1, La/lm50;

    .line 45
    .line 46
    iget-object v1, v1, La/lm50;->d:La/sf80;

    .line 47
    .line 48
    invoke-static {p1, v0, p2, v2, v1}, La/rcb;->i1(La/g950;Ljava/util/Collection;Ljava/util/AbstractCollection;La/wm40;La/sf80;)Ljava/util/LinkedHashSet;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    move-object v5, v4

    .line 76
    check-cast v5, La/d0d0;

    .line 77
    .line 78
    invoke-static {v5}, La/eaz;->v(La/d0d0;)La/d0d0;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v1, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    if-nez v6, :cond_1

    .line 87
    .line 88
    new-instance v6, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :cond_1
    check-cast v6, Ljava/util/List;

    .line 97
    .line 98
    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_3

    .line 120
    .line 121
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, Ljava/util/Map$Entry;

    .line 126
    .line 127
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, Ljava/util/Collection;

    .line 132
    .line 133
    iget-object v5, v3, La/f7u;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v5, La/v7i;

    .line 136
    .line 137
    iget-object v5, v5, La/v7i;->m:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v5, La/km50;

    .line 140
    .line 141
    check-cast v5, La/lm50;

    .line 142
    .line 143
    iget-object v5, v5, La/lm50;->d:La/sf80;

    .line 144
    .line 145
    invoke-static {p1, v4, p2, v2, v5}, La/rcb;->i1(La/g950;Ljava/util/Collection;Ljava/util/AbstractCollection;La/wm40;La/sf80;)Ljava/util/LinkedHashSet;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    invoke-static {v0, v4}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_3
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 154
    .line 155
    .line 156
    :goto_2
    iget-object p0, p0, La/eaz;->n:La/mqe0;

    .line 157
    .line 158
    iget-object p0, p0, La/mqe0;->a:Ljava/lang/Class;

    .line 159
    .line 160
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-eqz p0, :cond_4

    .line 165
    .line 166
    sget-object p0, La/j4m0;->b:La/g950;

    .line 167
    .line 168
    invoke-virtual {p1, p0}, La/g950;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-eqz p0, :cond_4

    .line 173
    .line 174
    invoke-static {v2}, La/obb;->P(La/wm40;)La/f0d0;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    if-eqz p0, :cond_4

    .line 179
    .line 180
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    :cond_4
    return-void
.end method

.method public final o(La/cek;)Ljava/util/Set;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/baz;->e:La/cu00;

    .line 5
    .line 6
    invoke-virtual {p1}, La/cu00;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, La/ckj;

    .line 11
    .line 12
    invoke-interface {p1}, La/ckj;->f()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/lang/Iterable;

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v0, La/j9x;->x:La/j9x;

    .line 23
    .line 24
    iget-object v1, p0, La/eaz;->o:La/l9z;

    .line 25
    .line 26
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, La/m2a;->r:La/m2a;

    .line 31
    .line 32
    new-instance v4, La/daz;

    .line 33
    .line 34
    invoke-direct {v4, v1, p1, v0}, La/daz;-><init>(La/wm40;Ljava/util/LinkedHashSet;Lkotlin/jvm/functions/Function1;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3, v4}, La/ntb;->H(Ljava/util/Collection;La/syh;La/dtb;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, La/eaz;->n:La/mqe0;

    .line 41
    .line 42
    iget-object p0, p0, La/mqe0;->a:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Class;->isEnum()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    sget-object p0, La/j4m0;->b:La/g950;

    .line 51
    .line 52
    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_0
    return-object p1
.end method

.method public final q()La/vjj;
    .locals 0

    .line 1
    iget-object p0, p0, La/eaz;->o:La/l9z;

    .line 2
    .line 3
    return-object p0
.end method
