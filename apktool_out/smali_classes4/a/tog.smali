.class public final La/tog;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:La/oog;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:I


# direct methods
.method public constructor <init>(La/oog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/tog;->a:La/oog;

    .line 5
    .line 6
    iput-object p2, p0, La/tog;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, La/tog;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, La/tog;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput p5, p0, La/tog;->e:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/tog;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/tog;

    .line 10
    .line 11
    iget-object v0, p0, La/tog;->a:La/oog;

    .line 12
    .line 13
    iget-object v1, p1, La/tog;->a:La/oog;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/oog;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-object v0, p0, La/tog;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/tog;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_3
    iget-object v0, p0, La/tog;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/tog;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_4
    iget-object v0, p0, La/tog;->d:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, p1, La/tog;->d:Ljava/lang/String;

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
    goto :goto_1

    .line 55
    :cond_5
    iget p0, p0, La/tog;->e:I

    .line 56
    .line 57
    iget p1, p1, La/tog;->e:I

    .line 58
    .line 59
    if-ne p0, p1, :cond_6

    .line 60
    .line 61
    :goto_0
    const/4 p0, 0x1

    .line 62
    return p0

    .line 63
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 64
    return p0
.end method

.method public final g(La/p6t0;La/p6t0;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/tog;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/tog;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
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
    .locals 3

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget-object v2, p0, La/tog;->a:La/oog;

    .line 11
    .line 12
    invoke-virtual {v2}, La/oog;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/tog;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/tog;->c:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/tog;->d:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget p0, p0, La/tog;->e:I

    .line 37
    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    add-int/2addr p0, v0

    .line 43
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
    instance-of p0, p1, La/tog;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/tog;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    new-instance p0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    check-cast p1, La/tog;

    .line 21
    .line 22
    iget-object v0, p1, La/tog;->a:La/oog;

    .line 23
    .line 24
    check-cast p2, La/tog;

    .line 25
    .line 26
    iget-object v1, p2, La/tog;->a:La/oog;

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p1, La/tog;->b:Ljava/lang/String;

    .line 32
    .line 33
    new-instance v1, La/rog;

    .line 34
    .line 35
    invoke-direct {v1, v0}, La/rog;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p2, La/tog;->b:Ljava/lang/String;

    .line 39
    .line 40
    new-instance v2, La/rog;

    .line 41
    .line 42
    invoke-direct {v2, v0}, La/rog;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p1, La/tog;->c:Ljava/lang/String;

    .line 49
    .line 50
    new-instance v1, La/pog;

    .line 51
    .line 52
    invoke-direct {v1, v0}, La/pog;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p2, La/tog;->c:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v2, La/pog;

    .line 58
    .line 59
    invoke-direct {v2, v0}, La/pog;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p1, La/tog;->d:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v1, La/qog;

    .line 68
    .line 69
    invoke-direct {v1, v0}, La/qog;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p2, La/tog;->d:Ljava/lang/String;

    .line 73
    .line 74
    new-instance v2, La/qog;

    .line 75
    .line 76
    invoke-direct {v2, v0}, La/qog;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget p1, p1, La/tog;->e:I

    .line 83
    .line 84
    new-instance v0, La/nog;

    .line 85
    .line 86
    invoke-direct {v0, p1}, La/nog;-><init>(I)V

    .line 87
    .line 88
    .line 89
    iget p1, p2, La/tog;->e:I

    .line 90
    .line 91
    new-instance p2, La/nog;

    .line 92
    .line 93
    invoke-direct {p2, p1}, La/nog;-><init>(I)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v0, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-nez p1, :cond_0

    .line 104
    .line 105
    return-object p0

    .line 106
    :cond_0
    const/4 p0, 0x0

    .line 107
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "TournamentTitle(value="

    .line 2
    .line 3
    iget-object v1, p0, La/tog;->b:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, ")"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, La/tog;->c:Ljava/lang/String;

    .line 12
    .line 13
    const-string v3, "TournamentDate(value="

    .line 14
    .line 15
    invoke-static {v3, v1, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v3, p0, La/tog;->d:Ljava/lang/String;

    .line 20
    .line 21
    const-string v4, "TournamentTime(value="

    .line 22
    .line 23
    invoke-static {v4, v3, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget v4, p0, La/tog;->e:I

    .line 28
    .line 29
    const-string v5, "Background(value="

    .line 30
    .line 31
    invoke-static {v4, v5, v2}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v5, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v6, "CyberFutureGameUiModel(id=1, team="

    .line 38
    .line 39
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, La/tog;->a:La/oog;

    .line 43
    .line 44
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, ", tournamentTitle="

    .line 48
    .line 49
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p0, ", tournamentDate="

    .line 56
    .line 57
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p0, ", tournamentTime="

    .line 61
    .line 62
    const-string v0, ", background="

    .line 63
    .line 64
    invoke-static {v5, v1, p0, v3, v0}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v5, v4, v2}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method
