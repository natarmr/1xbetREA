.class public final La/qq20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:B

.field public final c:I

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JILjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/qq20;->a:Ljava/lang/String;

    .line 5
    .line 6
    long-to-int p1, p2

    .line 7
    iput-byte p1, p0, La/qq20;->b:B

    .line 8
    .line 9
    iput p4, p0, La/qq20;->c:I

    .line 10
    .line 11
    iput-object p5, p0, La/qq20;->d:Ljava/util/ArrayList;

    .line 12
    .line 13
    iput-object p6, p0, La/qq20;->e:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p7, p0, La/qq20;->f:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/qq20;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/qq20;

    .line 10
    .line 11
    iget-object v0, p0, La/qq20;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/qq20;->a:Ljava/lang/String;

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
    goto :goto_1

    .line 22
    :cond_2
    iget-byte v0, p0, La/qq20;->b:B

    .line 23
    .line 24
    int-to-long v0, v0

    .line 25
    iget-byte v2, p1, La/qq20;->b:B

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
    goto :goto_1

    .line 33
    :cond_3
    iget v0, p0, La/qq20;->c:I

    .line 34
    .line 35
    iget v1, p1, La/qq20;->c:I

    .line 36
    .line 37
    if-ne v0, v1, :cond_7

    .line 38
    .line 39
    iget-object v0, p0, La/qq20;->d:Ljava/util/ArrayList;

    .line 40
    .line 41
    iget-object v1, p1, La/qq20;->d:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    iget-object v0, p0, La/qq20;->e:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p1, La/qq20;->e:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_5
    iget-object p0, p0, La/qq20;->f:Ljava/lang/String;

    .line 62
    .line 63
    iget-object p1, p1, La/qq20;->f:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_6

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_6
    :goto_0
    const/4 p0, 0x1

    .line 73
    return p0

    .line 74
    :cond_7
    :goto_1
    const/4 p0, 0x0

    .line 75
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
    instance-of p0, p1, La/qq20;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/qq20;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    check-cast p1, La/qq20;

    .line 16
    .line 17
    iget-byte p0, p1, La/qq20;->b:B

    .line 18
    .line 19
    int-to-long p0, p0

    .line 20
    check-cast p2, La/qq20;

    .line 21
    .line 22
    iget-byte p2, p2, La/qq20;->b:B

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
    iget-object p0, p0, La/qq20;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/qq20;->a:Ljava/lang/String;

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
    iget-byte v2, p0, La/qq20;->b:B

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
    iget v2, p0, La/qq20;->c:I

    .line 18
    .line 19
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v2, p0, La/qq20;->d:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-static {v2, v0, v1}, La/twn;->g(Ljava/util/ArrayList;II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v2, p0, La/qq20;->e:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object p0, p0, La/qq20;->f:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    add-int/2addr p0, v0

    .line 42
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
    instance-of p0, p1, La/qq20;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/qq20;

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
    check-cast p1, La/qq20;

    .line 21
    .line 22
    iget v0, p1, La/qq20;->c:I

    .line 23
    .line 24
    new-instance v1, La/lq20;

    .line 25
    .line 26
    invoke-direct {v1, v0}, La/lq20;-><init>(I)V

    .line 27
    .line 28
    .line 29
    check-cast p2, La/qq20;

    .line 30
    .line 31
    iget v0, p2, La/qq20;->c:I

    .line 32
    .line 33
    new-instance v2, La/lq20;

    .line 34
    .line 35
    invoke-direct {v2, v0}, La/lq20;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p1, La/qq20;->d:Ljava/util/ArrayList;

    .line 42
    .line 43
    new-instance v1, La/mq20;

    .line 44
    .line 45
    invoke-direct {v1, v0}, La/mq20;-><init>(Ljava/util/ArrayList;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p2, La/qq20;->d:Ljava/util/ArrayList;

    .line 49
    .line 50
    new-instance v2, La/mq20;

    .line 51
    .line 52
    invoke-direct {v2, v0}, La/mq20;-><init>(Ljava/util/ArrayList;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p1, La/qq20;->e:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v1, La/oq20;

    .line 61
    .line 62
    invoke-direct {v1, v0}, La/oq20;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p2, La/qq20;->e:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v2, La/oq20;

    .line 68
    .line 69
    invoke-direct {v2, v0}, La/oq20;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p1, La/qq20;->f:Ljava/lang/String;

    .line 76
    .line 77
    new-instance v0, La/nq20;

    .line 78
    .line 79
    invoke-direct {v0, p1}, La/nq20;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p2, La/qq20;->f:Ljava/lang/String;

    .line 83
    .line 84
    new-instance p2, La/nq20;

    .line 85
    .line 86
    invoke-direct {p2, p1}, La/nq20;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0, v0, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-nez p1, :cond_0

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_0
    const/4 p0, 0x0

    .line 100
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-byte v0, p0, La/qq20;->b:B

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    iget v2, p0, La/qq20;->c:I

    .line 5
    .line 6
    const-string v3, "Background(value="

    .line 7
    .line 8
    const-string v4, ")"

    .line 9
    .line 10
    invoke-static {v2, v3, v4}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v3, p0, La/qq20;->d:Ljava/util/ArrayList;

    .line 15
    .line 16
    const-string v5, "ScoreList(value="

    .line 17
    .line 18
    invoke-static {v5, v4, v3}, La/hne;->o(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-object v5, p0, La/qq20;->e:Ljava/lang/String;

    .line 23
    .line 24
    const-string v6, "TeamName(value="

    .line 25
    .line 26
    invoke-static {v6, v5, v4}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    iget-object v6, p0, La/qq20;->f:Ljava/lang/String;

    .line 31
    .line 32
    const-string v7, "TeamImage(value="

    .line 33
    .line 34
    invoke-static {v7, v6, v4}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    const-string v7, "MarbleGamesItemUiModel(key="

    .line 39
    .line 40
    const-string v8, ", id="

    .line 41
    .line 42
    iget-object p0, p0, La/qq20;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1, v7, p0, v8}, La/f140;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string v0, ", background="

    .line 49
    .line 50
    const-string v1, ", scoreList="

    .line 51
    .line 52
    invoke-static {p0, v0, v2, v1, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string v0, ", teamName="

    .line 56
    .line 57
    const-string v1, ", teamImage="

    .line 58
    .line 59
    invoke-static {p0, v0, v5, v1, v6}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method
