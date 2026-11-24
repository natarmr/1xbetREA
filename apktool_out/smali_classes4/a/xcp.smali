.class public final La/xcp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:La/tnp0;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:J

.field public final f:Ljava/util/List;

.field public final g:I

.field public final h:Z

.field public final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLa/tnp0;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;IZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, La/xcp;->a:J

    .line 11
    .line 12
    iput-object p3, p0, La/xcp;->b:La/tnp0;

    .line 13
    .line 14
    iput-object p4, p0, La/xcp;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p5, p0, La/xcp;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-wide p6, p0, La/xcp;->e:J

    .line 19
    .line 20
    iput-object p8, p0, La/xcp;->f:Ljava/util/List;

    .line 21
    .line 22
    iput p9, p0, La/xcp;->g:I

    .line 23
    .line 24
    iput-boolean p10, p0, La/xcp;->h:Z

    .line 25
    .line 26
    iput-object p11, p0, La/xcp;->i:Ljava/lang/String;

    .line 27
    .line 28
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
    instance-of v0, p1, La/xcp;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/xcp;

    .line 10
    .line 11
    iget-wide v0, p0, La/xcp;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/xcp;->a:J

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
    iget-object v0, p0, La/xcp;->b:La/tnp0;

    .line 21
    .line 22
    iget-object v1, p1, La/xcp;->b:La/tnp0;

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/xcp;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v1, p1, La/xcp;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/xcp;->d:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v1, p1, La/xcp;->d:Ljava/lang/String;

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
    iget-wide v0, p0, La/xcp;->e:J

    .line 54
    .line 55
    iget-wide v2, p1, La/xcp;->e:J

    .line 56
    .line 57
    cmp-long v0, v0, v2

    .line 58
    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-object v0, p0, La/xcp;->f:Ljava/util/List;

    .line 63
    .line 64
    iget-object v1, p1, La/xcp;->f:Ljava/util/List;

    .line 65
    .line 66
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_7

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    iget v0, p0, La/xcp;->g:I

    .line 74
    .line 75
    iget v1, p1, La/xcp;->g:I

    .line 76
    .line 77
    if-eq v0, v1, :cond_8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    iget-boolean v0, p0, La/xcp;->h:Z

    .line 81
    .line 82
    iget-boolean v1, p1, La/xcp;->h:Z

    .line 83
    .line 84
    if-eq v0, v1, :cond_9

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_9
    iget-object p0, p0, La/xcp;->i:Ljava/lang/String;

    .line 88
    .line 89
    iget-object p1, p1, La/xcp;->i:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-nez p0, :cond_a

    .line 96
    .line 97
    :goto_0
    const/4 p0, 0x0

    .line 98
    return p0

    .line 99
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 100
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/xcp;->a:J

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
    iget-object v2, p0, La/xcp;->b:La/tnp0;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/xcp;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/xcp;->d:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-wide v2, p0, La/xcp;->e:J

    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, La/xcp;->f:Ljava/util/List;

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget v2, p0, La/xcp;->g:I

    .line 43
    .line 44
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-boolean v2, p0, La/xcp;->h:Z

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object p0, p0, La/xcp;->i:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    add-int/2addr p0, v0

    .line 61
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FavoriteTeamModel(id="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, La/xcp;->a:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", teamType="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/xcp;->b:La/tnp0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", name="

    .line 24
    .line 25
    const-string v2, ", sportName="

    .line 26
    .line 27
    iget-object v3, p0, La/xcp;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v4, p0, La/xcp;->d:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v1, ", sportId="

    .line 35
    .line 36
    const-string v2, ", images="

    .line 37
    .line 38
    iget-wide v3, p0, La/xcp;->e:J

    .line 39
    .line 40
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v1, ", gamesCount="

    .line 44
    .line 45
    const-string v2, ", hasLiveGame="

    .line 46
    .line 47
    iget v3, p0, La/xcp;->g:I

    .line 48
    .line 49
    iget-object v4, p0, La/xcp;->f:Ljava/util/List;

    .line 50
    .line 51
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    const-string v1, ", statId="

    .line 55
    .line 56
    const-string v2, ")"

    .line 57
    .line 58
    iget-object v3, p0, La/xcp;->i:Ljava/lang/String;

    .line 59
    .line 60
    iget-boolean p0, p0, La/xcp;->h:Z

    .line 61
    .line 62
    invoke-static {v1, v3, v2, v0, p0}, La/twn;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method
