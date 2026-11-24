.class public final La/dza;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:La/hds;

.field public final d:D

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z


# direct methods
.method public constructor <init>(JLjava/lang/String;La/hds;DZZZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/dza;->a:J

    .line 5
    .line 6
    iput-object p3, p0, La/dza;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, La/dza;->c:La/hds;

    .line 9
    .line 10
    iput-wide p5, p0, La/dza;->d:D

    .line 11
    .line 12
    iput-boolean p7, p0, La/dza;->e:Z

    .line 13
    .line 14
    iput-boolean p8, p0, La/dza;->f:Z

    .line 15
    .line 16
    iput-boolean p9, p0, La/dza;->g:Z

    .line 17
    .line 18
    iput-boolean p10, p0, La/dza;->h:Z

    .line 19
    .line 20
    iput-boolean p11, p0, La/dza;->i:Z

    .line 21
    .line 22
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
    instance-of v0, p1, La/dza;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/dza;

    .line 10
    .line 11
    iget-wide v0, p0, La/dza;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/dza;->a:J

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
    iget-object v0, p0, La/dza;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p1, La/dza;->b:Ljava/lang/String;

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
    iget-object v0, p0, La/dza;->c:La/hds;

    .line 32
    .line 33
    iget-object v1, p1, La/dza;->c:La/hds;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, La/hds;->equals(Ljava/lang/Object;)Z

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
    iget-wide v0, p0, La/dza;->d:D

    .line 43
    .line 44
    iget-wide v2, p1, La/dza;->d:D

    .line 45
    .line 46
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    iget-boolean v0, p0, La/dza;->e:Z

    .line 54
    .line 55
    iget-boolean v1, p1, La/dza;->e:Z

    .line 56
    .line 57
    if-eq v0, v1, :cond_6

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_6
    iget-boolean v0, p0, La/dza;->f:Z

    .line 61
    .line 62
    iget-boolean v1, p1, La/dza;->f:Z

    .line 63
    .line 64
    if-eq v0, v1, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_7
    iget-boolean v0, p0, La/dza;->g:Z

    .line 68
    .line 69
    iget-boolean v1, p1, La/dza;->g:Z

    .line 70
    .line 71
    if-eq v0, v1, :cond_8

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_8
    iget-boolean v0, p0, La/dza;->h:Z

    .line 75
    .line 76
    iget-boolean v1, p1, La/dza;->h:Z

    .line 77
    .line 78
    if-eq v0, v1, :cond_9

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_9
    iget-boolean p0, p0, La/dza;->i:Z

    .line 82
    .line 83
    iget-boolean p1, p1, La/dza;->i:Z

    .line 84
    .line 85
    if-eq p0, p1, :cond_a

    .line 86
    .line 87
    :goto_0
    const/4 p0, 0x0

    .line 88
    return p0

    .line 89
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 90
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-wide v0, p0, La/dza;->a:J

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
    iget-object v2, p0, La/dza;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/dza;->c:La/hds;

    .line 17
    .line 18
    invoke-virtual {v2}, La/hds;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-wide v3, p0, La/dza;->d:D

    .line 25
    .line 26
    invoke-static {v3, v4, v2, v1}, La/brm0;->d(DII)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/dza;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-boolean v2, p0, La/dza;->f:Z

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-boolean v2, p0, La/dza;->g:Z

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-boolean v2, p0, La/dza;->h:Z

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-boolean p0, p0, La/dza;->i:Z

    .line 55
    .line 56
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    const-string v0, "CashbackGameState(gameId="

    .line 2
    .line 3
    const-string v1, ", gameName="

    .line 4
    .line 5
    iget-wide v2, p0, La/dza;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/dza;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", imageInfo="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/dza;->c:La/hds;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", percent="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", isUpperCashBack="

    .line 29
    .line 30
    iget-wide v2, p0, La/dza;->d:D

    .line 31
    .line 32
    iget-boolean v4, p0, La/dza;->e:Z

    .line 33
    .line 34
    invoke-static {v0, v2, v3, v1, v4}, La/rz4;->x(Ljava/lang/StringBuilder;DLjava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", isSelected="

    .line 38
    .line 39
    const-string v2, ", isAvailable="

    .line 40
    .line 41
    iget-boolean v3, p0, La/dza;->f:Z

    .line 42
    .line 43
    iget-boolean v4, p0, La/dza;->g:Z

    .line 44
    .line 45
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", isWeb="

    .line 49
    .line 50
    const-string v2, ", underMaintenance="

    .line 51
    .line 52
    iget-boolean v3, p0, La/dza;->h:Z

    .line 53
    .line 54
    iget-boolean p0, p0, La/dza;->i:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, p0}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 57
    .line 58
    .line 59
    const-string p0, ")"

    .line 60
    .line 61
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method
