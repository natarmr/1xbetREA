.class public final La/gaz;
.super La/w2;
.source "SourceFile"


# instance fields
.field public final l:La/f7u;

.field public final m:La/are0;


# direct methods
.method public constructor <init>(La/f7u;La/are0;ILa/vjj;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/f7u;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/v7i;

    .line 7
    .line 8
    iget-object v0, v0, La/v7i;->i:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v5, v0

    .line 11
    check-cast v5, La/eu00;

    .line 12
    .line 13
    new-instance v3, La/j9z;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {v3, p1, p2, v0}, La/j9z;-><init>(La/f7u;La/m8y;Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p2, La/are0;->a:Ljava/lang/reflect/TypeVariable;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    sget-object v7, La/t3u0;->c:La/t3u0;

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    move-object v1, p0

    .line 33
    move v2, p3

    .line 34
    move-object v4, p4

    .line 35
    invoke-direct/range {v1 .. v8}, La/t5;-><init>(ILa/g93;La/vjj;La/eu00;La/g950;La/t3u0;Z)V

    .line 36
    .line 37
    .line 38
    iput-object p1, v1, La/gaz;->l:La/f7u;

    .line 39
    .line 40
    iput-object p2, v1, La/gaz;->m:La/are0;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final p1(Ljava/util/List;)Ljava/util/List;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v3, p0, La/gaz;->l:La/f7u;

    .line 5
    .line 6
    iget-object v0, v3, La/f7u;->b:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v6, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/16 v0, 0xa

    .line 11
    .line 12
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v7, v0

    .line 34
    check-cast v7, La/wsy;

    .line 35
    .line 36
    sget-object v0, La/b180;->Y:La/b180;

    .line 37
    .line 38
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    invoke-static {v7, v0, v8}, La/e0t0;->c(La/wsy;Lkotlin/jvm/functions/Function1;La/nbk0;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    move-object v1, p0

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    new-instance v0, La/huj0;

    .line 51
    .line 52
    sget-object v4, La/x83;->f:La/x83;

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    move-object v1, p0

    .line 57
    invoke-direct/range {v0 .. v5}, La/huj0;-><init>(La/e83;ZLa/f7u;La/x83;Z)V

    .line 58
    .line 59
    .line 60
    sget-object p0, La/iun;->a:La/iun;

    .line 61
    .line 62
    invoke-virtual {v0, v7, p0, v8, v2}, La/q8a;->L(La/aty;Ljava/util/List;La/pys0;Z)La/g5;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v7}, La/wsy;->j0()La/tft0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0, p0, v2, v5}, La/tqt;->b(La/tft0;La/g5;IZ)La/y78;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, La/wsy;

    .line 77
    .line 78
    if-nez p0, :cond_1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move-object v7, p0

    .line 82
    :goto_1
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-object p0, v1

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    return-object v6
.end method

.method public final q1()Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, La/gaz;->m:La/are0;

    .line 2
    .line 3
    iget-object v0, v0, La/are0;->a:Ljava/lang/reflect/TypeVariable;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    array-length v2, v0

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    array-length v2, v0

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_0

    .line 22
    .line 23
    aget-object v5, v0, v4

    .line 24
    .line 25
    new-instance v6, La/oqe0;

    .line 26
    .line 27
    invoke-direct {v6, v5}, La/oqe0;-><init>(Ljava/lang/reflect/Type;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, La/oqe0;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    iget-object v0, v0, La/oqe0;->a:Ljava/lang/reflect/Type;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v0, 0x0

    .line 48
    :goto_1
    const-class v2, Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    sget-object v1, La/iun;->a:La/iun;

    .line 57
    .line 58
    :cond_2
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v2, p0, La/gaz;->l:La/f7u;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iget-object p0, v2, La/f7u;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, La/v7i;

    .line 69
    .line 70
    iget-object p0, p0, La/v7i;->j:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, La/zm40;

    .line 73
    .line 74
    iget-object p0, p0, La/zm40;->e:La/ary;

    .line 75
    .line 76
    invoke-virtual {p0}, La/ary;->e()La/kzj0;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    iget-object v0, v2, La/f7u;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, La/v7i;

    .line 83
    .line 84
    iget-object v0, v0, La/v7i;->j:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, La/zm40;

    .line 87
    .line 88
    iget-object v0, v0, La/zm40;->e:La/ary;

    .line 89
    .line 90
    invoke-virtual {v0}, La/ary;->p()La/kzj0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {p0, v0}, La/ucx;->W(La/kzj0;La/kzj0;)La/tft0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 104
    .line 105
    const/16 v4, 0xa

    .line 106
    .line 107
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_4

    .line 123
    .line 124
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    check-cast v4, La/oqe0;

    .line 129
    .line 130
    iget-object v5, v2, La/f7u;->e:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v5, La/nvu;

    .line 133
    .line 134
    sget-object v6, La/b0t0;->b:La/b0t0;

    .line 135
    .line 136
    const/4 v7, 0x3

    .line 137
    invoke-static {v6, v3, p0, v7}, La/xvw;->Y(La/b0t0;ZLa/gaz;I)La/fay;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-virtual {v5, v4, v6}, La/nvu;->V(La/zqe0;La/fay;)La/wsy;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    return-object v0
.end method
