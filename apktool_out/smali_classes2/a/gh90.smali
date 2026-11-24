.class public final La/gh90;
.super La/f4;
.source "SourceFile"

# interfaces
.implements La/sh90;


# instance fields
.field public a:La/dh90;

.field public b:La/xuz;

.field public c:La/nqs0;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(La/dh90;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/gh90;->a:La/dh90;

    .line 5
    .line 6
    new-instance v0, La/xuz;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/gh90;->b:La/xuz;

    .line 12
    .line 13
    iget-object v0, p1, La/dh90;->d:La/nqs0;

    .line 14
    .line 15
    iput-object v0, p0, La/gh90;->c:La/nqs0;

    .line 16
    .line 17
    iget p1, p1, La/dh90;->e:I

    .line 18
    .line 19
    iput p1, p0, La/gh90;->g:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, La/kh90;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, La/kh90;-><init>(La/f4;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, La/lo20;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, La/lo20;-><init>(Ljava/lang/Object;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final bridge synthetic build()La/th90;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/gh90;->e()La/dh90;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final c()I
    .locals 0

    .line 1
    iget p0, p0, La/gh90;->g:I

    .line 2
    .line 3
    return p0
.end method

.method public final clear()V
    .locals 1

    .line 1
    sget-object v0, La/nqs0;->e:La/nqs0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, La/gh90;->f(La/nqs0;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, La/gh90;->g(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object p0, p0, La/gh90;->c:La/nqs0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    invoke-virtual {p0, v1, v0, p1}, La/nqs0;->d(IILjava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final d()Ljava/util/Collection;
    .locals 2

    .line 1
    new-instance v0, La/mo20;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, La/mo20;-><init>(Ljava/lang/Object;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final e()La/dh90;
    .locals 3

    .line 1
    iget-object v0, p0, La/gh90;->a:La/dh90;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/dh90;

    .line 6
    .line 7
    iget-object v1, p0, La/gh90;->c:La/nqs0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/gh90;->c()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {v0, v1, v2}, La/dh90;-><init>(La/nqs0;I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/gh90;->a:La/dh90;

    .line 17
    .line 18
    new-instance v1, La/xuz;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, La/gh90;->b:La/xuz;

    .line 24
    .line 25
    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    iget v0, p0, La/gh90;->g:I

    .line 11
    .line 12
    move-object v1, p1

    .line 13
    check-cast v1, Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eq v0, v2, :cond_2

    .line 20
    .line 21
    :goto_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_2
    instance-of v0, v1, La/dh90;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    iget-object p0, p0, La/gh90;->c:La/nqs0;

    .line 28
    .line 29
    check-cast p1, La/dh90;

    .line 30
    .line 31
    iget-object p1, p1, La/dh90;->d:La/nqs0;

    .line 32
    .line 33
    new-instance v0, La/ch90;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, La/ch90;-><init>(B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, v0}, La/nqs0;->g(La/nqs0;Lkotlin/jvm/functions/Function2;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    return p0

    .line 44
    :cond_3
    instance-of v0, v1, La/gh90;

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    iget-object p0, p0, La/gh90;->c:La/nqs0;

    .line 49
    .line 50
    check-cast p1, La/gh90;

    .line 51
    .line 52
    iget-object p1, p1, La/gh90;->c:La/nqs0;

    .line 53
    .line 54
    new-instance v0, La/ch90;

    .line 55
    .line 56
    const/4 v1, 0x5

    .line 57
    invoke-direct {v0, v1}, La/ch90;-><init>(B)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1, v0}, La/nqs0;->g(La/nqs0;Lkotlin/jvm/functions/Function2;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    return p0

    .line 65
    :cond_4
    instance-of v0, v1, La/uh90;

    .line 66
    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    iget-object p0, p0, La/gh90;->c:La/nqs0;

    .line 70
    .line 71
    check-cast p1, La/uh90;

    .line 72
    .line 73
    iget-object p1, p1, La/uh90;->f:La/dh90;

    .line 74
    .line 75
    iget-object p1, p1, La/dh90;->d:La/nqs0;

    .line 76
    .line 77
    new-instance v0, La/ch90;

    .line 78
    .line 79
    const/4 v1, 0x6

    .line 80
    invoke-direct {v0, v1}, La/ch90;-><init>(B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1, v0}, La/nqs0;->g(La/nqs0;Lkotlin/jvm/functions/Function2;)Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    return p0

    .line 88
    :cond_5
    instance-of v0, v1, La/vh90;

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    iget-object p0, p0, La/gh90;->c:La/nqs0;

    .line 93
    .line 94
    check-cast p1, La/vh90;

    .line 95
    .line 96
    iget-object p1, p1, La/vh90;->d:La/gh90;

    .line 97
    .line 98
    iget-object p1, p1, La/gh90;->c:La/nqs0;

    .line 99
    .line 100
    new-instance v0, La/ch90;

    .line 101
    .line 102
    const/4 v1, 0x7

    .line 103
    invoke-direct {v0, v1}, La/ch90;-><init>(B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p1, v0}, La/nqs0;->g(La/nqs0;Lkotlin/jvm/functions/Function2;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    return p0

    .line 111
    :cond_6
    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    return p0
.end method

.method public final f(La/nqs0;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/gh90;->c:La/nqs0;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, La/gh90;->c:La/nqs0;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, La/gh90;->a:La/dh90;

    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final g(I)V
    .locals 0

    .line 1
    iput p1, p0, La/gh90;->g:I

    .line 2
    .line 3
    iget p1, p0, La/gh90;->e:I

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, La/gh90;->e:I

    .line 8
    .line 9
    iget p1, p0, La/gh90;->f:I

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    iput p1, p0, La/gh90;->f:I

    .line 14
    .line 15
    return-void
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, La/gh90;->c:La/nqs0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    invoke-virtual {p0, v1, v0, p1}, La/nqs0;->h(IILjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La/gh90;->d:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v1, p0, La/gh90;->c:La/nqs0;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    move v2, v0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    goto :goto_0

    .line 16
    :goto_1
    const/4 v5, 0x0

    .line 17
    move-object v6, p0

    .line 18
    move-object v3, p1

    .line 19
    move-object v4, p2

    .line 20
    invoke-virtual/range {v1 .. v6}, La/nqs0;->n(ILjava/lang/Object;Ljava/lang/Object;ILa/gh90;)La/nqs0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v6, p0}, La/gh90;->f(La/nqs0;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, v6, La/gh90;->d:Ljava/lang/Object;

    .line 28
    .line 29
    return-object p0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_3

    .line 11
    :cond_0
    instance-of v0, p1, La/dh90;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/dh90;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v0, v1

    .line 21
    :goto_0
    if-nez v0, :cond_3

    .line 22
    .line 23
    instance-of v0, p1, La/gh90;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    move-object v0, p1

    .line 28
    check-cast v0, La/gh90;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move-object v0, v1

    .line 32
    :goto_1
    if-eqz v0, :cond_4

    .line 33
    .line 34
    invoke-virtual {v0}, La/gh90;->e()La/dh90;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    goto :goto_2

    .line 39
    :cond_3
    move-object v1, v0

    .line 40
    :cond_4
    :goto_2
    if-eqz v1, :cond_6

    .line 41
    .line 42
    new-instance p1, La/r6k;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    iput v0, p1, La/r6k;->a:I

    .line 49
    .line 50
    invoke-virtual {p0}, La/gh90;->c()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    iget-object v3, p0, La/gh90;->c:La/nqs0;

    .line 55
    .line 56
    iget-object v4, v1, La/dh90;->d:La/nqs0;

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v4, v0, p1, p0}, La/nqs0;->o(La/nqs0;ILa/r6k;La/gh90;)La/nqs0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p0, v0}, La/gh90;->f(La/nqs0;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, La/dh90;->c()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    add-int/2addr v0, v2

    .line 73
    iget p1, p1, La/r6k;->a:I

    .line 74
    .line 75
    sub-int/2addr v0, p1

    .line 76
    if-eq v2, v0, :cond_5

    .line 77
    .line 78
    invoke-virtual {p0, v0}, La/gh90;->g(I)V

    .line 79
    .line 80
    .line 81
    :cond_5
    :goto_3
    return-void

    .line 82
    :cond_6
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, La/gh90;->d:Ljava/lang/Object;

    .line 44
    iget-object v0, p0, La/gh90;->c:La/nqs0;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1, p0}, La/nqs0;->p(ILjava/lang/Object;ILa/gh90;)La/nqs0;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, La/nqs0;->e:La/nqs0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    invoke-virtual {p0, p1}, La/gh90;->f(La/nqs0;)V

    .line 45
    iget-object p0, p0, La/gh90;->d:Ljava/lang/Object;

    return-object p0
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, La/gh90;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, La/gh90;->c:La/nqs0;

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v2, v7

    .line 16
    :goto_0
    const/4 v5, 0x0

    .line 17
    move-object v6, p0

    .line 18
    move-object v3, p1

    .line 19
    move-object v4, p2

    .line 20
    invoke-virtual/range {v1 .. v6}, La/nqs0;->q(ILjava/lang/Object;Ljava/lang/Object;ILa/gh90;)La/nqs0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    sget-object p0, La/nqs0;->e:La/nqs0;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {v6, p0}, La/gh90;->f(La/nqs0;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v6}, La/gh90;->c()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eq v0, p0, :cond_2

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    return p0

    .line 42
    :cond_2
    return v7
.end method
