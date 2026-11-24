.class public final La/vvr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b0s;


# instance fields
.field public final a:J

.field public final b:La/dur;

.field public final c:La/qtr;

.field public final d:Ljava/lang/String;

.field public final e:La/svr;

.field public final f:La/qvr;

.field public final g:La/rvr;

.field public final h:La/tvr;


# direct methods
.method public constructor <init>(JLa/dur;La/qtr;Ljava/lang/String;La/svr;La/qvr;La/rvr;La/tvr;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/vvr;->a:J

    .line 5
    .line 6
    iput-object p3, p0, La/vvr;->b:La/dur;

    .line 7
    .line 8
    iput-object p4, p0, La/vvr;->c:La/qtr;

    .line 9
    .line 10
    iput-object p5, p0, La/vvr;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, La/vvr;->e:La/svr;

    .line 13
    .line 14
    iput-object p7, p0, La/vvr;->f:La/qvr;

    .line 15
    .line 16
    iput-object p8, p0, La/vvr;->g:La/rvr;

    .line 17
    .line 18
    iput-object p9, p0, La/vvr;->h:La/tvr;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/vvr;->a:J

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
    instance-of p0, p2, La/vvr;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p3, La/vvr;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    check-cast p2, La/vvr;

    .line 16
    .line 17
    iget-object p0, p2, La/vvr;->d:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v0, La/pvr;

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/pvr;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    check-cast p3, La/vvr;

    .line 25
    .line 26
    iget-object p0, p3, La/vvr;->d:Ljava/lang/String;

    .line 27
    .line 28
    new-instance v1, La/pvr;

    .line 29
    .line 30
    invoke-direct {v1, p0}, La/pvr;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p2, La/vvr;->e:La/svr;

    .line 37
    .line 38
    iget-object v0, p3, La/vvr;->e:La/svr;

    .line 39
    .line 40
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p2, La/vvr;->f:La/qvr;

    .line 44
    .line 45
    iget-object v0, p3, La/vvr;->f:La/qvr;

    .line 46
    .line 47
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p2, La/vvr;->g:La/rvr;

    .line 51
    .line 52
    iget-object v0, p3, La/vvr;->g:La/rvr;

    .line 53
    .line 54
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p0, p2, La/vvr;->h:La/tvr;

    .line 58
    .line 59
    iget-object p2, p3, La/vvr;->h:La/tvr;

    .line 60
    .line 61
    invoke-static {p1, p0, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
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
    instance-of v0, p1, La/vvr;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/vvr;

    .line 10
    .line 11
    iget-wide v0, p0, La/vvr;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/vvr;->a:J

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
    iget-object v0, p0, La/vvr;->b:La/dur;

    .line 21
    .line 22
    iget-object v1, p1, La/vvr;->b:La/dur;

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
    iget-object v0, p0, La/vvr;->c:La/qtr;

    .line 32
    .line 33
    iget-object v1, p1, La/vvr;->c:La/qtr;

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
    iget-object v0, p0, La/vvr;->d:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v1, p1, La/vvr;->d:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/vvr;->e:La/svr;

    .line 54
    .line 55
    iget-object v1, p1, La/vvr;->e:La/svr;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, La/svr;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/vvr;->f:La/qvr;

    .line 65
    .line 66
    iget-object v1, p1, La/vvr;->f:La/qvr;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, La/qvr;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/vvr;->g:La/rvr;

    .line 76
    .line 77
    iget-object v1, p1, La/vvr;->g:La/rvr;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, La/rvr;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, La/vvr;->h:La/tvr;

    .line 87
    .line 88
    iget-object p1, p1, La/vvr;->h:La/tvr;

    .line 89
    .line 90
    invoke-virtual {p0, p1}, La/tvr;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, La/vvr;->b:La/dur;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, La/vvr;->a:J

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
    iget-object v2, p0, La/vvr;->b:La/dur;

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
    iget-object v0, p0, La/vvr;->c:La/qtr;

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
    iget-object v2, p0, La/vvr;->d:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/vvr;->e:La/svr;

    .line 33
    .line 34
    iget-object v2, v2, La/svr;->a:La/p5h0;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object v0, p0, La/vvr;->f:La/qvr;

    .line 43
    .line 44
    invoke-virtual {v0}, La/qvr;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, v2

    .line 49
    mul-int/2addr v0, v1

    .line 50
    iget-object v2, p0, La/vvr;->g:La/rvr;

    .line 51
    .line 52
    invoke-virtual {v2}, La/rvr;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    add-int/2addr v2, v0

    .line 57
    mul-int/2addr v2, v1

    .line 58
    iget-object p0, p0, La/vvr;->h:La/tvr;

    .line 59
    .line 60
    invoke-virtual {p0}, La/tvr;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v2

    .line 65
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
    .locals 5

    .line 1
    const-string v0, "Information(value="

    .line 2
    .line 3
    iget-object v1, p0, La/vvr;->d:Ljava/lang/String;

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
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v3, "GameCardType13UiModel(gameId="

    .line 14
    .line 15
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-wide v3, p0, La/vvr;->a:J

    .line 19
    .line 20
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v3, ", header="

    .line 24
    .line 25
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, La/vvr;->b:La/dur;

    .line 29
    .line 30
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v3, ", footer="

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v3, p0, La/vvr;->c:La/qtr;

    .line 39
    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v3, ", information="

    .line 44
    .line 45
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, ", score="

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, La/vvr;->e:La/svr;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, ", firstPlayer="

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, La/vvr;->f:La/qvr;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, ", secondPlayer="

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, La/vvr;->g:La/rvr;

    .line 77
    .line 78
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v0, ", subtitle="

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, La/vvr;->h:La/tvr;

    .line 87
    .line 88
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0
.end method

.method public final w0()La/qtr;
    .locals 0

    .line 1
    iget-object p0, p0, La/vvr;->c:La/qtr;

    .line 2
    .line 3
    return-object p0
.end method
