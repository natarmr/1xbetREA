.class public final La/lmf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:B

.field public final c:La/jmf;

.field public final d:La/orf;

.field public final e:La/orf;

.field public final f:La/orf;

.field public final g:La/orf;

.field public final h:La/orf;

.field public final i:I

.field public final j:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;JLa/jmf;La/orf;La/orf;La/orf;La/orf;La/orf;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lmf;->a:Ljava/lang/String;

    .line 5
    .line 6
    long-to-int p1, p2

    .line 7
    iput-byte p1, p0, La/lmf;->b:B

    .line 8
    .line 9
    iput-object p4, p0, La/lmf;->c:La/jmf;

    .line 10
    .line 11
    iput-object p5, p0, La/lmf;->d:La/orf;

    .line 12
    .line 13
    iput-object p6, p0, La/lmf;->e:La/orf;

    .line 14
    .line 15
    iput-object p7, p0, La/lmf;->f:La/orf;

    .line 16
    .line 17
    iput-object p8, p0, La/lmf;->g:La/orf;

    .line 18
    .line 19
    iput-object p9, p0, La/lmf;->h:La/orf;

    .line 20
    .line 21
    iput p10, p0, La/lmf;->i:I

    .line 22
    .line 23
    iput-boolean p11, p0, La/lmf;->j:Z

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/lmf;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/lmf;

    .line 12
    .line 13
    iget-object v0, p0, La/lmf;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/lmf;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    iget-byte v0, p0, La/lmf;->b:B

    .line 25
    .line 26
    int-to-long v0, v0

    .line 27
    iget-byte v2, p1, La/lmf;->b:B

    .line 28
    .line 29
    int-to-long v2, v2

    .line 30
    cmp-long v0, v0, v2

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    iget-object v0, p0, La/lmf;->c:La/jmf;

    .line 36
    .line 37
    iget-object v1, p1, La/lmf;->c:La/jmf;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, La/jmf;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_4
    iget-object v0, p0, La/lmf;->d:La/orf;

    .line 47
    .line 48
    iget-object v1, p1, La/lmf;->d:La/orf;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, La/orf;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_5
    iget-object v0, p0, La/lmf;->e:La/orf;

    .line 58
    .line 59
    iget-object v1, p1, La/lmf;->e:La/orf;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, La/orf;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_6
    iget-object v0, p0, La/lmf;->f:La/orf;

    .line 69
    .line 70
    iget-object v1, p1, La/lmf;->f:La/orf;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, La/orf;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_7
    iget-object v0, p0, La/lmf;->g:La/orf;

    .line 80
    .line 81
    iget-object v1, p1, La/lmf;->g:La/orf;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, La/orf;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_8

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_8
    iget-object v0, p0, La/lmf;->h:La/orf;

    .line 91
    .line 92
    iget-object v1, p1, La/lmf;->h:La/orf;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, La/orf;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_9

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_9
    iget v0, p0, La/lmf;->i:I

    .line 102
    .line 103
    iget v1, p1, La/lmf;->i:I

    .line 104
    .line 105
    if-ne v0, v1, :cond_a

    .line 106
    .line 107
    iget-boolean p0, p0, La/lmf;->j:Z

    .line 108
    .line 109
    iget-boolean p1, p1, La/lmf;->j:Z

    .line 110
    .line 111
    if-ne p0, p1, :cond_a

    .line 112
    .line 113
    :goto_0
    const/4 p0, 0x1

    .line 114
    return p0

    .line 115
    :cond_a
    :goto_1
    const/4 p0, 0x0

    .line 116
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
    instance-of p0, p1, La/lmf;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/lmf;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    check-cast p1, La/lmf;

    .line 16
    .line 17
    iget-byte p0, p1, La/lmf;->b:B

    .line 18
    .line 19
    int-to-long p0, p0

    .line 20
    check-cast p2, La/lmf;

    .line 21
    .line 22
    iget-byte p2, p2, La/lmf;->b:B

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
    iget-object p0, p0, La/lmf;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/lmf;->a:Ljava/lang/String;

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
    iget-byte v2, p0, La/lmf;->b:B

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
    iget-object v2, p0, La/lmf;->c:La/jmf;

    .line 18
    .line 19
    invoke-virtual {v2}, La/jmf;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    add-int/2addr v2, v0

    .line 24
    mul-int/2addr v2, v1

    .line 25
    iget-object v0, p0, La/lmf;->d:La/orf;

    .line 26
    .line 27
    invoke-virtual {v0}, La/orf;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/2addr v0, v2

    .line 32
    mul-int/2addr v0, v1

    .line 33
    iget-object v2, p0, La/lmf;->e:La/orf;

    .line 34
    .line 35
    invoke-virtual {v2}, La/orf;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int/2addr v2, v0

    .line 40
    mul-int/2addr v2, v1

    .line 41
    iget-object v0, p0, La/lmf;->f:La/orf;

    .line 42
    .line 43
    invoke-virtual {v0}, La/orf;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    add-int/2addr v0, v2

    .line 48
    mul-int/2addr v0, v1

    .line 49
    iget-object v2, p0, La/lmf;->g:La/orf;

    .line 50
    .line 51
    invoke-virtual {v2}, La/orf;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    add-int/2addr v2, v0

    .line 56
    mul-int/2addr v2, v1

    .line 57
    iget-object v0, p0, La/lmf;->h:La/orf;

    .line 58
    .line 59
    invoke-virtual {v0}, La/orf;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    add-int/2addr v0, v2

    .line 64
    mul-int/2addr v0, v1

    .line 65
    iget v2, p0, La/lmf;->i:I

    .line 66
    .line 67
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-boolean p0, p0, La/lmf;->j:Z

    .line 72
    .line 73
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    add-int/2addr p0, v0

    .line 78
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
    instance-of p0, p1, La/lmf;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/lmf;

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
    check-cast p1, La/lmf;

    .line 21
    .line 22
    iget-object v0, p1, La/lmf;->c:La/jmf;

    .line 23
    .line 24
    check-cast p2, La/lmf;

    .line 25
    .line 26
    iget-object v1, p2, La/lmf;->c:La/jmf;

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p1, La/lmf;->d:La/orf;

    .line 32
    .line 33
    new-instance v1, La/emf;

    .line 34
    .line 35
    invoke-direct {v1, v0}, La/emf;-><init>(La/orf;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p2, La/lmf;->d:La/orf;

    .line 39
    .line 40
    new-instance v2, La/emf;

    .line 41
    .line 42
    invoke-direct {v2, v0}, La/emf;-><init>(La/orf;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p1, La/lmf;->e:La/orf;

    .line 49
    .line 50
    new-instance v1, La/imf;

    .line 51
    .line 52
    invoke-direct {v1, v0}, La/imf;-><init>(La/orf;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p2, La/lmf;->e:La/orf;

    .line 56
    .line 57
    new-instance v2, La/imf;

    .line 58
    .line 59
    invoke-direct {v2, v0}, La/imf;-><init>(La/orf;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p1, La/lmf;->f:La/orf;

    .line 66
    .line 67
    new-instance v1, La/kmf;

    .line 68
    .line 69
    invoke-direct {v1, v0}, La/kmf;-><init>(La/orf;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p2, La/lmf;->f:La/orf;

    .line 73
    .line 74
    new-instance v2, La/kmf;

    .line 75
    .line 76
    invoke-direct {v2, v0}, La/kmf;-><init>(La/orf;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p1, La/lmf;->g:La/orf;

    .line 83
    .line 84
    new-instance v1, La/gmf;

    .line 85
    .line 86
    invoke-direct {v1, v0}, La/gmf;-><init>(La/orf;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p2, La/lmf;->g:La/orf;

    .line 90
    .line 91
    new-instance v2, La/gmf;

    .line 92
    .line 93
    invoke-direct {v2, v0}, La/gmf;-><init>(La/orf;)V

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p1, La/lmf;->h:La/orf;

    .line 100
    .line 101
    new-instance v1, La/fmf;

    .line 102
    .line 103
    invoke-direct {v1, v0}, La/fmf;-><init>(La/orf;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, p2, La/lmf;->h:La/orf;

    .line 107
    .line 108
    new-instance v2, La/fmf;

    .line 109
    .line 110
    invoke-direct {v2, v0}, La/fmf;-><init>(La/orf;)V

    .line 111
    .line 112
    .line 113
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-boolean p1, p1, La/lmf;->j:Z

    .line 117
    .line 118
    new-instance v0, La/hmf;

    .line 119
    .line 120
    invoke-direct {v0, p1}, La/hmf;-><init>(Z)V

    .line 121
    .line 122
    .line 123
    iget-boolean p1, p2, La/lmf;->j:Z

    .line 124
    .line 125
    new-instance p2, La/hmf;

    .line 126
    .line 127
    invoke-direct {p2, p1}, La/hmf;-><init>(Z)V

    .line 128
    .line 129
    .line 130
    invoke-static {p0, v0, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-nez p1, :cond_0

    .line 138
    .line 139
    return-object p0

    .line 140
    :cond_0
    const/4 p0, 0x0

    .line 141
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 13

    .line 1
    iget-byte v0, p0, La/lmf;->b:B

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v3, "FirstPlayer(value="

    .line 7
    .line 8
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v3, p0, La/lmf;->d:La/orf;

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
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v5, "SecondPlayer(value="

    .line 28
    .line 29
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v5, p0, La/lmf;->e:La/orf;

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    new-instance v5, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v6, "ThirdPlayer(value="

    .line 47
    .line 48
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v6, p0, La/lmf;->f:La/orf;

    .line 52
    .line 53
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    new-instance v6, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v7, "FourthPlayer(value="

    .line 66
    .line 67
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iget-object v7, p0, La/lmf;->g:La/orf;

    .line 71
    .line 72
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    new-instance v7, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v8, "FivePlayer(value="

    .line 85
    .line 86
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v8, p0, La/lmf;->h:La/orf;

    .line 90
    .line 91
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    iget v8, p0, La/lmf;->i:I

    .line 102
    .line 103
    const-string v9, "RoleBackground(value="

    .line 104
    .line 105
    invoke-static {v8, v9, v3}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    iget-boolean v9, p0, La/lmf;->j:Z

    .line 110
    .line 111
    const-string v10, "NeedExtraMargin(value="

    .line 112
    .line 113
    invoke-static {v10, v3, v9}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    const-string v10, "Cs2GamePlayerStatisticUiModel(key="

    .line 118
    .line 119
    const-string v11, ", id="

    .line 120
    .line 121
    iget-object v12, p0, La/lmf;->a:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v0, v1, v10, v12, v11}, La/f140;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v1, ", team="

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    iget-object p0, p0, La/lmf;->c:La/jmf;

    .line 133
    .line 134
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string p0, ", firstPlayer="

    .line 138
    .line 139
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string p0, ", secondPlayer="

    .line 146
    .line 147
    const-string v1, ", thirdPlayer="

    .line 148
    .line 149
    invoke-static {v0, p0, v4, v1, v5}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const-string p0, ", fourthPlayer="

    .line 153
    .line 154
    const-string v1, ", fivePlayer="

    .line 155
    .line 156
    invoke-static {v0, p0, v6, v1, v7}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const-string p0, ", roleBackground="

    .line 160
    .line 161
    const-string v1, ", needExtraMargin="

    .line 162
    .line 163
    invoke-static {v0, p0, v8, v1, v9}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    return-object p0
.end method
