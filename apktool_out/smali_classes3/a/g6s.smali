.class public final La/g6s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:I

.field public final b:Z


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/g6s;->a:I

    .line 5
    .line 6
    iput-boolean p2, p0, La/g6s;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
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
    instance-of v1, p1, La/g6s;

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
    check-cast p1, La/g6s;

    .line 12
    .line 13
    iget v1, p0, La/g6s;->a:I

    .line 14
    .line 15
    iget v3, p1, La/g6s;->a:I

    .line 16
    .line 17
    if-ne v1, v3, :cond_2

    .line 18
    .line 19
    iget-boolean p0, p0, La/g6s;->b:Z

    .line 20
    .line 21
    iget-boolean p1, p1, La/g6s;->b:Z

    .line 22
    .line 23
    if-ne p0, p1, :cond_2

    .line 24
    .line 25
    return v0

    .line 26
    :cond_2
    return v2
.end method

.method public final g(La/p6t0;La/p6t0;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/g6s;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    instance-of p0, p2, La/g6s;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    check-cast p1, La/g6s;

    .line 17
    .line 18
    iget p0, p1, La/g6s;->a:I

    .line 19
    .line 20
    check-cast p2, La/g6s;

    .line 21
    .line 22
    iget p1, p2, La/g6s;->a:I

    .line 23
    .line 24
    if-ne p0, p1, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    return v0
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
    .locals 1

    .line 1
    iget v0, p0, La/g6s;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-boolean p0, p0, La/g6s;->b:Z

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final o(La/p6t0;La/p6t0;)Ljava/util/Collection;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/g6s;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    instance-of p0, p2, La/g6s;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    new-instance p0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    check-cast p1, La/g6s;

    .line 22
    .line 23
    iget v1, p1, La/g6s;->a:I

    .line 24
    .line 25
    new-instance v2, La/d6s;

    .line 26
    .line 27
    invoke-direct {v2, v1}, La/d6s;-><init>(I)V

    .line 28
    .line 29
    .line 30
    check-cast p2, La/g6s;

    .line 31
    .line 32
    iget v1, p2, La/g6s;->a:I

    .line 33
    .line 34
    new-instance v3, La/d6s;

    .line 35
    .line 36
    invoke-direct {v3, v1}, La/d6s;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v2, v3}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-boolean p1, p1, La/g6s;->b:Z

    .line 43
    .line 44
    new-instance v1, La/e6s;

    .line 45
    .line 46
    invoke-direct {v1, p1}, La/e6s;-><init>(Z)V

    .line 47
    .line 48
    .line 49
    iget-boolean p1, p2, La/g6s;->b:Z

    .line 50
    .line 51
    new-instance p2, La/e6s;

    .line 52
    .line 53
    invoke-direct {p2, p1}, La/e6s;-><init>(Z)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v1, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-nez p1, :cond_0

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_0
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, La/g6s;->a:I

    .line 2
    .line 3
    const-string v1, "Count(value="

    .line 4
    .line 5
    const-string v2, ")"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-boolean p0, p0, La/g6s;->b:Z

    .line 12
    .line 13
    const-string v1, "Selected(value="

    .line 14
    .line 15
    invoke-static {v1, v2, p0}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v1, "GameCountItemUiModel(count="

    .line 20
    .line 21
    const-string v3, ", selected="

    .line 22
    .line 23
    invoke-static {v1, v0, v3, p0, v2}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
