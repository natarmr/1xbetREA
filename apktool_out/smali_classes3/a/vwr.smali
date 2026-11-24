.class public final La/vwr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b0s;


# instance fields
.field public final a:J

.field public final b:La/dur;

.field public final c:La/qtr;

.field public final d:Ljava/lang/String;

.field public final e:La/p5h0;

.field public final f:La/owr;

.field public final g:La/swr;

.field public final h:La/fus;

.field public final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLa/dur;La/qtr;Ljava/lang/String;La/p5h0;La/owr;La/swr;La/fus;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/vwr;->a:J

    .line 5
    .line 6
    iput-object p3, p0, La/vwr;->b:La/dur;

    .line 7
    .line 8
    iput-object p4, p0, La/vwr;->c:La/qtr;

    .line 9
    .line 10
    iput-object p5, p0, La/vwr;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, La/vwr;->e:La/p5h0;

    .line 13
    .line 14
    iput-object p7, p0, La/vwr;->f:La/owr;

    .line 15
    .line 16
    iput-object p8, p0, La/vwr;->g:La/swr;

    .line 17
    .line 18
    iput-object p9, p0, La/vwr;->h:La/fus;

    .line 19
    .line 20
    iput-object p10, p0, La/vwr;->i:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/vwr;->a:J

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
    instance-of p0, p2, La/vwr;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p3, La/vwr;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    check-cast p2, La/vwr;

    .line 16
    .line 17
    iget-object p0, p2, La/vwr;->d:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v0, La/pwr;

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/pwr;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    check-cast p3, La/vwr;

    .line 25
    .line 26
    iget-object p0, p3, La/vwr;->d:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v1, La/pwr;

    .line 29
    .line 30
    invoke-direct {v1, p0}, La/pwr;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p2, La/vwr;->e:La/p5h0;

    .line 37
    .line 38
    new-instance v0, La/rwr;

    .line 39
    .line 40
    invoke-direct {v0, p0}, La/rwr;-><init>(La/p5h0;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p3, La/vwr;->e:La/p5h0;

    .line 44
    .line 45
    new-instance v1, La/rwr;

    .line 46
    .line 47
    invoke-direct {v1, p0}, La/rwr;-><init>(La/p5h0;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p2, La/vwr;->f:La/owr;

    .line 54
    .line 55
    iget-object v0, p3, La/vwr;->f:La/owr;

    .line 56
    .line 57
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p0, p2, La/vwr;->g:La/swr;

    .line 61
    .line 62
    iget-object v0, p3, La/vwr;->g:La/swr;

    .line 63
    .line 64
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p0, p2, La/vwr;->h:La/fus;

    .line 68
    .line 69
    new-instance v0, La/twr;

    .line 70
    .line 71
    invoke-direct {v0, p0}, La/twr;-><init>(La/fus;)V

    .line 72
    .line 73
    .line 74
    iget-object p0, p3, La/vwr;->h:La/fus;

    .line 75
    .line 76
    new-instance v1, La/twr;

    .line 77
    .line 78
    invoke-direct {v1, p0}, La/twr;-><init>(La/fus;)V

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object p0, p2, La/vwr;->i:Ljava/lang/String;

    .line 85
    .line 86
    new-instance p2, La/qwr;

    .line 87
    .line 88
    invoke-direct {p2, p0}, La/qwr;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object p0, p3, La/vwr;->i:Ljava/lang/String;

    .line 92
    .line 93
    new-instance p3, La/qwr;

    .line 94
    .line 95
    invoke-direct {p3, p0}, La/qwr;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-static {p1, p2, p3}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/vwr;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/vwr;

    .line 11
    .line 12
    iget-wide v0, p0, La/vwr;->a:J

    .line 13
    .line 14
    iget-wide v2, p1, La/vwr;->a:J

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget-object v0, p0, La/vwr;->b:La/dur;

    .line 22
    .line 23
    iget-object v1, p1, La/vwr;->b:La/dur;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, La/dur;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    iget-object v0, p0, La/vwr;->c:La/qtr;

    .line 33
    .line 34
    iget-object v1, p1, La/vwr;->c:La/qtr;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, La/qtr;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iget-object v0, p0, La/vwr;->d:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v1, p1, La/vwr;->d:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_5

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    iget-object v0, p0, La/vwr;->e:La/p5h0;

    .line 55
    .line 56
    iget-object v1, p1, La/vwr;->e:La/p5h0;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget-object v0, p0, La/vwr;->f:La/owr;

    .line 66
    .line 67
    iget-object v1, p1, La/vwr;->f:La/owr;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, La/owr;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_7
    iget-object v0, p0, La/vwr;->g:La/swr;

    .line 77
    .line 78
    iget-object v1, p1, La/vwr;->g:La/swr;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, La/swr;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_8

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_8
    iget-object v0, p0, La/vwr;->h:La/fus;

    .line 88
    .line 89
    iget-object v1, p1, La/vwr;->h:La/fus;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, La/fus;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_9

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_9
    iget-object p0, p0, La/vwr;->i:Ljava/lang/String;

    .line 99
    .line 100
    iget-object p1, p1, La/vwr;->i:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_a

    .line 107
    .line 108
    :goto_0
    const/4 p0, 0x0

    .line 109
    return p0

    .line 110
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 111
    return p0
.end method

.method public final getHeader()La/dur;
    .locals 0

    .line 1
    iget-object p0, p0, La/vwr;->b:La/dur;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, La/vwr;->a:J

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
    iget-object v2, p0, La/vwr;->b:La/dur;

    .line 11
    .line 12
    invoke-virtual {v2}, La/dur;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/vwr;->c:La/qtr;

    .line 19
    .line 20
    invoke-virtual {v0}, La/qtr;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-object v2, p0, La/vwr;->d:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/vwr;->e:La/p5h0;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/2addr v2, v0

    .line 39
    mul-int/2addr v2, v1

    .line 40
    iget-object v0, p0, La/vwr;->f:La/owr;

    .line 41
    .line 42
    invoke-virtual {v0}, La/owr;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    add-int/2addr v0, v2

    .line 47
    mul-int/2addr v0, v1

    .line 48
    iget-object v2, p0, La/vwr;->g:La/swr;

    .line 49
    .line 50
    invoke-virtual {v2}, La/swr;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    add-int/2addr v2, v0

    .line 55
    mul-int/2addr v2, v1

    .line 56
    iget-object v0, p0, La/vwr;->h:La/fus;

    .line 57
    .line 58
    invoke-virtual {v0}, La/fus;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    add-int/2addr v0, v2

    .line 63
    mul-int/2addr v0, v1

    .line 64
    iget-object p0, p0, La/vwr;->i:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    add-int/2addr p0, v0

    .line 71
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
    .locals 8

    .line 1
    const-string v0, "GameLabel(value="

    .line 2
    .line 3
    iget-object v1, p0, La/vwr;->d:Ljava/lang/String;

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
    iget-object v1, p0, La/vwr;->e:La/p5h0;

    .line 12
    .line 13
    const-string v3, "Score(value="

    .line 14
    .line 15
    invoke-static {v3, v1, v2}, La/axq;->j(Ljava/lang/String;La/p5h0;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v3, p0, La/vwr;->h:La/fus;

    .line 20
    .line 21
    const-string v4, "Timer(value="

    .line 22
    .line 23
    invoke-static {v4, v3, v2}, La/axq;->i(Ljava/lang/String;La/fus;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v4, p0, La/vwr;->i:Ljava/lang/String;

    .line 28
    .line 29
    const-string v5, "Information(value="

    .line 30
    .line 31
    invoke-static {v5, v4, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v5, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v6, "GameCardType16UiModel(gameId="

    .line 38
    .line 39
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-wide v6, p0, La/vwr;->a:J

    .line 43
    .line 44
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v6, ", header="

    .line 48
    .line 49
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v6, p0, La/vwr;->b:La/dur;

    .line 53
    .line 54
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v6, ", footer="

    .line 58
    .line 59
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v6, p0, La/vwr;->c:La/qtr;

    .line 63
    .line 64
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v6, ", gameLabel="

    .line 68
    .line 69
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v0, ", score="

    .line 76
    .line 77
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v0, ", firstTeam="

    .line 84
    .line 85
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, La/vwr;->f:La/owr;

    .line 89
    .line 90
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v0, ", secondTeam="

    .line 94
    .line 95
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, La/vwr;->g:La/swr;

    .line 99
    .line 100
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p0, ", timer="

    .line 104
    .line 105
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string p0, ", information="

    .line 112
    .line 113
    invoke-static {v5, p0, v4, v2}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
.end method

.method public final w0()La/qtr;
    .locals 0

    .line 1
    iget-object p0, p0, La/vwr;->c:La/qtr;

    .line 2
    .line 3
    return-object p0
.end method
