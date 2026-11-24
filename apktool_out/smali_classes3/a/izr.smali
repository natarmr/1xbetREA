.class public final La/izr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b0s;


# instance fields
.field public final a:J

.field public final b:La/dur;

.field public final c:La/qtr;

.field public final d:La/ezr;

.field public final e:La/fzr;

.field public final f:La/czr;

.field public final g:La/fus;

.field public final h:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(JLa/dur;La/qtr;La/ezr;La/fzr;La/czr;La/fus;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/izr;->a:J

    .line 5
    .line 6
    iput-object p3, p0, La/izr;->b:La/dur;

    .line 7
    .line 8
    iput-object p4, p0, La/izr;->c:La/qtr;

    .line 9
    .line 10
    iput-object p5, p0, La/izr;->d:La/ezr;

    .line 11
    .line 12
    iput-object p6, p0, La/izr;->e:La/fzr;

    .line 13
    .line 14
    iput-object p7, p0, La/izr;->f:La/czr;

    .line 15
    .line 16
    iput-object p8, p0, La/izr;->g:La/fus;

    .line 17
    .line 18
    iput-object p9, p0, La/izr;->h:Ljava/lang/CharSequence;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/izr;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d(Ljava/util/ArrayList;La/p6t0;La/p6t0;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p2, La/izr;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p3, La/izr;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    check-cast p2, La/izr;

    .line 16
    .line 17
    iget-object p0, p2, La/izr;->d:La/ezr;

    .line 18
    .line 19
    check-cast p3, La/izr;

    .line 20
    .line 21
    iget-object v0, p3, La/izr;->d:La/ezr;

    .line 22
    .line 23
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p2, La/izr;->e:La/fzr;

    .line 27
    .line 28
    iget-object v0, p3, La/izr;->e:La/fzr;

    .line 29
    .line 30
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p2, La/izr;->f:La/czr;

    .line 34
    .line 35
    iget-object v0, p3, La/izr;->f:La/czr;

    .line 36
    .line 37
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p2, La/izr;->g:La/fus;

    .line 41
    .line 42
    new-instance v0, La/gzr;

    .line 43
    .line 44
    invoke-direct {v0, p0}, La/gzr;-><init>(La/fus;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p3, La/izr;->g:La/fus;

    .line 48
    .line 49
    new-instance v1, La/gzr;

    .line 50
    .line 51
    invoke-direct {v1, p0}, La/gzr;-><init>(La/fus;)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p0, p2, La/izr;->h:Ljava/lang/CharSequence;

    .line 58
    .line 59
    new-instance p2, La/dzr;

    .line 60
    .line 61
    invoke-direct {p2, p0}, La/dzr;-><init>(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    iget-object p0, p3, La/izr;->h:Ljava/lang/CharSequence;

    .line 65
    .line 66
    new-instance p3, La/dzr;

    .line 67
    .line 68
    invoke-direct {p3, p0}, La/dzr;-><init>(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p2, p3}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/izr;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/izr;

    .line 10
    .line 11
    iget-wide v0, p0, La/izr;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/izr;->a:J

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    iget-object v0, p0, La/izr;->b:La/dur;

    .line 21
    .line 22
    iget-object v1, p1, La/izr;->b:La/dur;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/dur;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-object v0, p0, La/izr;->c:La/qtr;

    .line 32
    .line 33
    iget-object v1, p1, La/izr;->c:La/qtr;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, La/qtr;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-object v0, p0, La/izr;->d:La/ezr;

    .line 43
    .line 44
    iget-object v1, p1, La/izr;->d:La/ezr;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, La/ezr;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    iget-object v0, p0, La/izr;->e:La/fzr;

    .line 54
    .line 55
    iget-object v1, p1, La/izr;->e:La/fzr;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, La/fzr;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_6

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    iget-object v0, p0, La/izr;->f:La/czr;

    .line 65
    .line 66
    iget-object v1, p1, La/izr;->f:La/czr;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, La/czr;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_7

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_7
    iget-object v0, p0, La/izr;->g:La/fus;

    .line 76
    .line 77
    iget-object v1, p1, La/izr;->g:La/fus;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, La/fus;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_8

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_8
    iget-object p0, p0, La/izr;->h:Ljava/lang/CharSequence;

    .line 87
    .line 88
    iget-object p1, p1, La/izr;->h:Ljava/lang/CharSequence;

    .line 89
    .line 90
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-nez p0, :cond_9

    .line 95
    .line 96
    :goto_0
    const/4 p0, 0x0

    .line 97
    return p0

    .line 98
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 99
    return p0
.end method

.method public final getHeader()La/dur;
    .locals 0

    .line 1
    iget-object p0, p0, La/izr;->b:La/dur;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, La/izr;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, La/izr;->b:La/dur;

    .line 10
    .line 11
    invoke-virtual {v1}, La/dur;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, La/izr;->c:La/qtr;

    .line 19
    .line 20
    invoke-virtual {v0}, La/qtr;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, La/izr;->d:La/ezr;

    .line 28
    .line 29
    invoke-virtual {v1}, La/ezr;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    mul-int/lit8 v1, v1, 0x1f

    .line 35
    .line 36
    iget-object v0, p0, La/izr;->e:La/fzr;

    .line 37
    .line 38
    invoke-virtual {v0}, La/fzr;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v1

    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget-object v1, p0, La/izr;->f:La/czr;

    .line 46
    .line 47
    invoke-virtual {v1}, La/czr;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v1, v0

    .line 52
    mul-int/lit8 v1, v1, 0x1f

    .line 53
    .line 54
    iget-object v0, p0, La/izr;->g:La/fus;

    .line 55
    .line 56
    invoke-virtual {v0}, La/fus;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    add-int/2addr v0, v1

    .line 61
    mul-int/lit8 v0, v0, 0x1f

    .line 62
    .line 63
    iget-object p0, p0, La/izr;->h:Ljava/lang/CharSequence;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    add-int/2addr p0, v0

    .line 70
    return p0
.end method

.method public final bridge synthetic o(La/p6t0;La/p6t0;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2}, La/b0s;->o(La/p6t0;La/p6t0;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "Timer(value="

    .line 2
    .line 3
    iget-object v1, p0, La/izr;->g:La/fus;

    .line 4
    .line 5
    const-string v2, ")"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, La/axq;->i(Ljava/lang/String;La/fus;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "Score(value="

    .line 14
    .line 15
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, La/izr;->h:Ljava/lang/CharSequence;

    .line 19
    .line 20
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v3, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v4, "GameCardType7UiModel(gameId="

    .line 33
    .line 34
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-wide v4, p0, La/izr;->a:J

    .line 38
    .line 39
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v4, ", header="

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v4, p0, La/izr;->b:La/dur;

    .line 48
    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v4, ", footer="

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v4, p0, La/izr;->c:La/qtr;

    .line 58
    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v4, ", teamFirst="

    .line 63
    .line 64
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v4, p0, La/izr;->d:La/ezr;

    .line 68
    .line 69
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v4, ", teamSecond="

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object v4, p0, La/izr;->e:La/fzr;

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v4, ", description="

    .line 83
    .line 84
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object p0, p0, La/izr;->f:La/czr;

    .line 88
    .line 89
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p0, ", timer="

    .line 93
    .line 94
    const-string v4, ", score="

    .line 95
    .line 96
    invoke-static {v3, p0, v0, v4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0
.end method

.method public final w0()La/qtr;
    .locals 0

    .line 1
    iget-object p0, p0, La/izr;->c:La/qtr;

    .line 2
    .line 3
    return-object p0
.end method
