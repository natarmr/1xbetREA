.class public final La/jdw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/List;

.field public final h:Ljava/util/List;


# direct methods
.method public constructor <init>(JLjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, La/jdw;->a:J

    .line 11
    .line 12
    iput-object p3, p0, La/jdw;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p4, p0, La/jdw;->c:J

    .line 15
    .line 16
    iput-wide p6, p0, La/jdw;->d:J

    .line 17
    .line 18
    iput-object p8, p0, La/jdw;->e:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, La/jdw;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p10, p0, La/jdw;->g:Ljava/util/List;

    .line 23
    .line 24
    iput-object p11, p0, La/jdw;->h:Ljava/util/List;

    .line 25
    .line 26
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
    instance-of v0, p1, La/jdw;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/jdw;

    .line 10
    .line 11
    iget-wide v0, p0, La/jdw;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/jdw;->a:J

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
    iget-object v0, p0, La/jdw;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p1, La/jdw;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-wide v0, p0, La/jdw;->c:J

    .line 32
    .line 33
    iget-wide v2, p1, La/jdw;->c:J

    .line 34
    .line 35
    cmp-long v0, v0, v2

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-wide v0, p0, La/jdw;->d:J

    .line 41
    .line 42
    iget-wide v2, p1, La/jdw;->d:J

    .line 43
    .line 44
    cmp-long v0, v0, v2

    .line 45
    .line 46
    if-eqz v0, :cond_5

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_5
    iget-object v0, p0, La/jdw;->e:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v1, p1, La/jdw;->e:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_6

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_6
    iget-object v0, p0, La/jdw;->f:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v1, p1, La/jdw;->f:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_7

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_7
    iget-object v0, p0, La/jdw;->g:Ljava/util/List;

    .line 72
    .line 73
    iget-object v1, p1, La/jdw;->g:Ljava/util/List;

    .line 74
    .line 75
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_8

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_8
    iget-object p0, p0, La/jdw;->h:Ljava/util/List;

    .line 83
    .line 84
    iget-object p1, p1, La/jdw;->h:Ljava/util/List;

    .line 85
    .line 86
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-nez p0, :cond_9

    .line 91
    .line 92
    :goto_0
    const/4 p0, 0x0

    .line 93
    return p0

    .line 94
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 95
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/jdw;->a:J

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
    iget-object v2, p0, La/jdw;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/jdw;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/jdw;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/jdw;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/jdw;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/jdw;->g:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object p0, p0, La/jdw;->h:Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr p0, v0

    .line 53
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "HltvAwardsNominationModel(id="

    .line 2
    .line 3
    const-string v1, ", title="

    .line 4
    .line 5
    iget-wide v2, p0, La/jdw;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/jdw;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", feedGameId="

    .line 14
    .line 15
    const-string v2, ", marketId="

    .line 16
    .line 17
    iget-wide v3, p0, La/jdw;->c:J

    .line 18
    .line 19
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ", nominationLogo="

    .line 23
    .line 24
    iget-wide v2, p0, La/jdw;->d:J

    .line 25
    .line 26
    iget-object v4, p0, La/jdw;->e:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v1, ", nominationImage="

    .line 32
    .line 33
    const-string v2, ", nominees="

    .line 34
    .line 35
    iget-object v3, p0, La/jdw;->f:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v4, p0, La/jdw;->g:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {v1, v3, v2, v0, v4}, La/ua80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
    const-string v1, ", previousWinners="

    .line 43
    .line 44
    const-string v2, ")"

    .line 45
    .line 46
    iget-object p0, p0, La/jdw;->h:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v0, v1, p0, v2}, La/ohs0;->s(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
