.class public final La/dh90;
.super La/h3;
.source "SourceFile"

# interfaces
.implements La/th90;


# static fields
.field public static final f:La/dh90;


# instance fields
.field public final d:La/nqs0;

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/dh90;

    .line 2
    .line 3
    sget-object v1, La/nqs0;->e:La/nqs0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, La/dh90;-><init>(La/nqs0;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/dh90;->f:La/dh90;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(La/nqs0;I)V
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
    iput-object p1, p0, La/dh90;->d:La/nqs0;

    .line 8
    .line 9
    iput p2, p0, La/dh90;->e:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, La/oh90;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, La/oh90;-><init>(La/dh90;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, La/oh90;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, La/oh90;-><init>(La/dh90;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final c()I
    .locals 0

    .line 1
    iget p0, p0, La/dh90;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    iget-object p0, p0, La/dh90;->d:La/nqs0;

    .line 11
    .line 12
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
    new-instance v0, La/g3;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, La/g3;-><init>(Ljava/lang/Object;B)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Ljava/util/Map;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    move-object v1, p1

    .line 12
    check-cast v1, Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    iget v4, p0, La/dh90;->e:I

    .line 19
    .line 20
    if-eq v4, v3, :cond_2

    .line 21
    .line 22
    :goto_0
    return v2

    .line 23
    :cond_2
    instance-of v3, v1, La/uh90;

    .line 24
    .line 25
    iget-object v4, p0, La/dh90;->d:La/nqs0;

    .line 26
    .line 27
    if-eqz v3, :cond_3

    .line 28
    .line 29
    check-cast p1, La/uh90;

    .line 30
    .line 31
    iget-object p0, p1, La/uh90;->f:La/dh90;

    .line 32
    .line 33
    iget-object p0, p0, La/dh90;->d:La/nqs0;

    .line 34
    .line 35
    new-instance p1, La/ch90;

    .line 36
    .line 37
    invoke-direct {p1, v2}, La/ch90;-><init>(B)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, p0, p1}, La/nqs0;->g(La/nqs0;Lkotlin/jvm/functions/Function2;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :cond_3
    instance-of v2, v1, La/vh90;

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    check-cast p1, La/vh90;

    .line 50
    .line 51
    iget-object p0, p1, La/vh90;->d:La/gh90;

    .line 52
    .line 53
    iget-object p0, p0, La/gh90;->c:La/nqs0;

    .line 54
    .line 55
    new-instance p1, La/ch90;

    .line 56
    .line 57
    invoke-direct {p1, v0}, La/ch90;-><init>(B)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, p0, p1}, La/nqs0;->g(La/nqs0;Lkotlin/jvm/functions/Function2;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    return p0

    .line 65
    :cond_4
    instance-of v0, v1, La/dh90;

    .line 66
    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    check-cast p1, La/dh90;

    .line 70
    .line 71
    iget-object p0, p1, La/dh90;->d:La/nqs0;

    .line 72
    .line 73
    new-instance p1, La/ch90;

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    invoke-direct {p1, v0}, La/ch90;-><init>(B)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, p0, p1}, La/nqs0;->g(La/nqs0;Lkotlin/jvm/functions/Function2;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    return p0

    .line 84
    :cond_5
    instance-of v0, v1, La/gh90;

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    check-cast p1, La/gh90;

    .line 89
    .line 90
    iget-object p0, p1, La/gh90;->c:La/nqs0;

    .line 91
    .line 92
    new-instance p1, La/ch90;

    .line 93
    .line 94
    const/4 v0, 0x3

    .line 95
    invoke-direct {p1, v0}, La/ch90;-><init>(B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4, p0, p1}, La/nqs0;->g(La/nqs0;Lkotlin/jvm/functions/Function2;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    return p0

    .line 103
    :cond_6
    invoke-super {p0, p1}, La/h3;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    return p0
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;)La/dh90;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    iget-object v2, p0, La/dh90;->d:La/nqs0;

    .line 11
    .line 12
    invoke-virtual {v2, p1, v1, v0, p2}, La/nqs0;->v(Ljava/lang/Object;IILjava/lang/Object;)La/s88;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    new-instance p2, La/dh90;

    .line 20
    .line 21
    iget-object v0, p1, La/s88;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, La/nqs0;

    .line 24
    .line 25
    iget p0, p0, La/dh90;->e:I

    .line 26
    .line 27
    iget-boolean p1, p1, La/s88;->b:Z

    .line 28
    .line 29
    add-int/2addr p0, p1

    .line 30
    invoke-direct {p2, v0, p0}, La/dh90;-><init>(La/nqs0;I)V

    .line 31
    .line 32
    .line 33
    return-object p2
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    iget-object p0, p0, La/dh90;->d:La/nqs0;

    .line 11
    .line 12
    invoke-virtual {p0, v1, v0, p1}, La/nqs0;->h(IILjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)La/th90;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/dh90;->f(Ljava/lang/Object;Ljava/lang/Object;)La/dh90;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final putAll(Ljava/util/Map;)La/th90;
    .locals 1

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
    return-object p0

    .line 11
    :cond_0
    new-instance v0, La/gh90;

    .line 12
    .line 13
    invoke-direct {v0, p0}, La/gh90;-><init>(La/dh90;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, La/gh90;->putAll(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, La/gh90;->e()La/dh90;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
