.class public final La/k4l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:B

.field public final c:La/xnp0;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;

.field public final f:La/lc00;

.field public final g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLa/xnp0;Ljava/util/ArrayList;Ljava/util/ArrayList;La/lc00;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/k4l;->a:Ljava/lang/String;

    .line 5
    .line 6
    long-to-int p1, p2

    .line 7
    iput-byte p1, p0, La/k4l;->b:B

    .line 8
    .line 9
    iput-object p4, p0, La/k4l;->c:La/xnp0;

    .line 10
    .line 11
    iput-object p5, p0, La/k4l;->d:Ljava/util/ArrayList;

    .line 12
    .line 13
    iput-object p6, p0, La/k4l;->e:Ljava/util/ArrayList;

    .line 14
    .line 15
    iput-object p7, p0, La/k4l;->f:La/lc00;

    .line 16
    .line 17
    iput-object p8, p0, La/k4l;->g:Ljava/util/ArrayList;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/k4l;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/k4l;

    .line 10
    .line 11
    iget-object v0, p0, La/k4l;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/k4l;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-byte v0, p0, La/k4l;->b:B

    .line 23
    .line 24
    int-to-long v0, v0

    .line 25
    iget-byte v2, p1, La/k4l;->b:B

    .line 26
    .line 27
    int-to-long v2, v2

    .line 28
    cmp-long v0, v0, v2

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, La/k4l;->c:La/xnp0;

    .line 34
    .line 35
    iget-object v1, p1, La/k4l;->c:La/xnp0;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, La/xnp0;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, La/k4l;->d:Ljava/util/ArrayList;

    .line 45
    .line 46
    iget-object v1, p1, La/k4l;->d:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object v0, p0, La/k4l;->e:Ljava/util/ArrayList;

    .line 56
    .line 57
    iget-object v1, p1, La/k4l;->e:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget-object v0, p0, La/k4l;->f:La/lc00;

    .line 67
    .line 68
    iget-object v1, p1, La/k4l;->f:La/lc00;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, La/lc00;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_7

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget-object p0, p0, La/k4l;->g:Ljava/util/ArrayList;

    .line 78
    .line 79
    iget-object p1, p1, La/k4l;->g:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-nez p0, :cond_8

    .line 86
    .line 87
    :goto_0
    const/4 p0, 0x0

    .line 88
    return p0

    .line 89
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 90
    return p0
.end method

.method public final g(La/p6t0;La/p6t0;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/k4l;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/k4l;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    check-cast p1, La/k4l;

    .line 16
    .line 17
    iget-byte p0, p1, La/k4l;->b:B

    .line 18
    .line 19
    int-to-long p0, p0

    .line 20
    check-cast p2, La/k4l;

    .line 21
    .line 22
    iget-byte p2, p2, La/k4l;->b:B

    .line 23
    .line 24
    int-to-long v0, p2

    .line 25
    cmp-long p0, p0, v0

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/k4l;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(La/p6t0;La/p6t0;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2, p1, p2}, La/rw2;->y(La/p6t0;La/p6t0;La/p6t0;La/p6t0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/k4l;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-byte v2, p0, La/k4l;->b:B

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v2, p0, La/k4l;->c:La/xnp0;

    .line 18
    .line 19
    invoke-virtual {v2}, La/xnp0;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    add-int/2addr v2, v0

    .line 24
    mul-int/2addr v2, v1

    .line 25
    iget-object v0, p0, La/k4l;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-static {v0, v2, v1}, La/twn;->g(Ljava/util/ArrayList;II)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v2, p0, La/k4l;->e:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-static {v2, v0, v1}, La/twn;->g(Ljava/util/ArrayList;II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v2, p0, La/k4l;->f:La/lc00;

    .line 38
    .line 39
    invoke-virtual {v2}, La/lc00;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    add-int/2addr v2, v0

    .line 44
    mul-int/2addr v2, v1

    .line 45
    iget-object p0, p0, La/k4l;->g:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    add-int/2addr p0, v2

    .line 52
    return p0
.end method

.method public final o(La/p6t0;La/p6t0;)Ljava/util/Collection;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/k4l;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/k4l;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    check-cast p1, La/k4l;

    .line 21
    .line 22
    iget-object v0, p1, La/k4l;->c:La/xnp0;

    .line 23
    .line 24
    new-instance v1, La/j4l;

    .line 25
    .line 26
    invoke-direct {v1, v0}, La/j4l;-><init>(La/xnp0;)V

    .line 27
    .line 28
    .line 29
    check-cast p2, La/k4l;

    .line 30
    .line 31
    iget-object v0, p2, La/k4l;->c:La/xnp0;

    .line 32
    .line 33
    new-instance v2, La/j4l;

    .line 34
    .line 35
    invoke-direct {v2, v0}, La/j4l;-><init>(La/xnp0;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p1, La/k4l;->d:Ljava/util/ArrayList;

    .line 42
    .line 43
    new-instance v1, La/g4l;

    .line 44
    .line 45
    invoke-direct {v1, v0}, La/g4l;-><init>(Ljava/util/ArrayList;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p2, La/k4l;->d:Ljava/util/ArrayList;

    .line 49
    .line 50
    new-instance v2, La/g4l;

    .line 51
    .line 52
    invoke-direct {v2, v0}, La/g4l;-><init>(Ljava/util/ArrayList;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p1, La/k4l;->e:Ljava/util/ArrayList;

    .line 59
    .line 60
    new-instance v1, La/h4l;

    .line 61
    .line 62
    invoke-direct {v1, v0}, La/h4l;-><init>(Ljava/util/ArrayList;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p2, La/k4l;->e:Ljava/util/ArrayList;

    .line 66
    .line 67
    new-instance v2, La/h4l;

    .line 68
    .line 69
    invoke-direct {v2, v0}, La/h4l;-><init>(Ljava/util/ArrayList;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p1, La/k4l;->f:La/lc00;

    .line 76
    .line 77
    new-instance v1, La/f4l;

    .line 78
    .line 79
    invoke-direct {v1, v0}, La/f4l;-><init>(La/lc00;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p2, La/k4l;->f:La/lc00;

    .line 83
    .line 84
    new-instance v2, La/f4l;

    .line 85
    .line 86
    invoke-direct {v2, v0}, La/f4l;-><init>(La/lc00;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p1, La/k4l;->g:Ljava/util/ArrayList;

    .line 93
    .line 94
    new-instance v0, La/i4l;

    .line 95
    .line 96
    invoke-direct {v0, p1}, La/i4l;-><init>(Ljava/util/ArrayList;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p2, La/k4l;->g:Ljava/util/ArrayList;

    .line 100
    .line 101
    new-instance p2, La/i4l;

    .line 102
    .line 103
    invoke-direct {p2, p1}, La/i4l;-><init>(Ljava/util/ArrayList;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v0, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_0

    .line 114
    .line 115
    return-object p0

    .line 116
    :cond_0
    const/4 p0, 0x0

    .line 117
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1
    iget-byte v0, p0, La/k4l;->b:B

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v3, "Team(value="

    .line 7
    .line 8
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v3, p0, La/k4l;->c:La/xnp0;

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v3, ")"

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v4, p0, La/k4l;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    const-string v5, "Heroes(value="

    .line 28
    .line 29
    invoke-static {v5, v3, v4}, La/hne;->o(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v5, p0, La/k4l;->e:Ljava/util/ArrayList;

    .line 34
    .line 35
    const-string v6, "HeroesItem(value="

    .line 36
    .line 37
    invoke-static {v6, v3, v5}, La/hne;->o(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    new-instance v6, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v7, "AdditionalItems(value="

    .line 44
    .line 45
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v7, p0, La/k4l;->f:La/lc00;

    .line 49
    .line 50
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    iget-object v7, p0, La/k4l;->g:Ljava/util/ArrayList;

    .line 61
    .line 62
    const-string v8, "Items(value="

    .line 63
    .line 64
    invoke-static {v8, v3, v7}, La/hne;->o(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    const-string v8, "DotaHeroItemsUiModel(key="

    .line 69
    .line 70
    const-string v9, ", id="

    .line 71
    .line 72
    iget-object p0, p0, La/k4l;->a:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v0, v1, v8, p0, v9}, La/f140;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const-string v0, ", team="

    .line 79
    .line 80
    const-string v1, ", heroes="

    .line 81
    .line 82
    invoke-static {p0, v0, v2, v1, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string v0, ", heroesItem="

    .line 86
    .line 87
    const-string v1, ", additionalItems="

    .line 88
    .line 89
    invoke-static {p0, v0, v5, v1, v6}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const-string v0, ", items="

    .line 93
    .line 94
    invoke-static {p0, v0, v7, v3}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0
.end method
