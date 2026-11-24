.class public final La/egd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/rkx;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:La/pge0;

.field public final f:La/pge0;

.field public final g:S

.field public final h:Z


# direct methods
.method public constructor <init>(La/rkx;JJJLa/pge0;La/pge0;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/egd;->a:La/rkx;

    .line 5
    .line 6
    iput-wide p2, p0, La/egd;->b:J

    .line 7
    .line 8
    iput-wide p4, p0, La/egd;->c:J

    .line 9
    .line 10
    iput-wide p6, p0, La/egd;->d:J

    .line 11
    .line 12
    iput-object p8, p0, La/egd;->e:La/pge0;

    .line 13
    .line 14
    iput-object p9, p0, La/egd;->f:La/pge0;

    .line 15
    .line 16
    iput-short p10, p0, La/egd;->g:S

    .line 17
    .line 18
    iput-boolean p11, p0, La/egd;->h:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/egd;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/egd;

    .line 11
    .line 12
    iget-object v0, p0, La/egd;->a:La/rkx;

    .line 13
    .line 14
    iget-object v2, p1, La/egd;->a:La/rkx;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, La/rkx;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-wide v2, p0, La/egd;->b:J

    .line 24
    .line 25
    iget-wide v4, p1, La/egd;->b:J

    .line 26
    .line 27
    cmp-long v0, v2, v4

    .line 28
    .line 29
    if-nez v0, :cond_7

    .line 30
    .line 31
    iget-wide v2, p0, La/egd;->c:J

    .line 32
    .line 33
    iget-wide v4, p1, La/egd;->c:J

    .line 34
    .line 35
    cmp-long v0, v2, v4

    .line 36
    .line 37
    if-nez v0, :cond_7

    .line 38
    .line 39
    iget-wide v2, p0, La/egd;->d:J

    .line 40
    .line 41
    iget-wide v4, p1, La/egd;->d:J

    .line 42
    .line 43
    cmp-long v0, v2, v4

    .line 44
    .line 45
    if-nez v0, :cond_7

    .line 46
    .line 47
    iget-object v0, p0, La/egd;->e:La/pge0;

    .line 48
    .line 49
    iget-object v2, p1, La/egd;->e:La/pge0;

    .line 50
    .line 51
    invoke-virtual {v0, v2}, La/pge0;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    iget-object v0, p0, La/egd;->f:La/pge0;

    .line 59
    .line 60
    iget-object v2, p1, La/egd;->f:La/pge0;

    .line 61
    .line 62
    invoke-virtual {v0, v2}, La/pge0;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    iget-short v0, p0, La/egd;->g:S

    .line 70
    .line 71
    iget-short v2, p1, La/egd;->g:S

    .line 72
    .line 73
    if-eq v0, v2, :cond_5

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_5
    iget-boolean p0, p0, La/egd;->h:Z

    .line 77
    .line 78
    iget-boolean p1, p1, La/egd;->h:Z

    .line 79
    .line 80
    if-eq p0, p1, :cond_6

    .line 81
    .line 82
    :goto_0
    return v1

    .line 83
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 84
    return p0

    .line 85
    :cond_7
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/egd;->a:La/rkx;

    .line 2
    .line 3
    invoke-virtual {v0}, La/rkx;->hashCode()I

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
    iget-wide v2, p0, La/egd;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/egd;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/egd;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/egd;->e:La/pge0;

    .line 29
    .line 30
    invoke-virtual {v2}, La/pge0;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-object v0, p0, La/egd;->f:La/pge0;

    .line 37
    .line 38
    invoke-virtual {v0}, La/pge0;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v2

    .line 43
    mul-int/2addr v0, v1

    .line 44
    iget-short v2, p0, La/egd;->g:S

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-boolean p0, p0, La/egd;->h:Z

    .line 51
    .line 52
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    add-int/2addr p0, v0

    .line 57
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-wide v0, p0, La/egd;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/t9x;->U(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/egd;->c:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/t9x;->U(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/egd;->d:J

    .line 14
    .line 15
    invoke-static {v2, v3}, La/t9x;->U(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v4, "ComponentCoordinatesModel(size="

    .line 22
    .line 23
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v4, p0, La/egd;->a:La/rkx;

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v4, ", positionInParent="

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, ", positionInRoot="

    .line 40
    .line 41
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, ", positionInWindow="

    .line 45
    .line 46
    const-string v4, ", boundsInRoot="

    .line 47
    .line 48
    invoke-static {v3, v1, v0, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, La/egd;->e:La/pge0;

    .line 52
    .line 53
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v0, ", boundsInWindow="

    .line 57
    .line 58
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, La/egd;->f:La/pge0;

    .line 62
    .line 63
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v0, ", radiusDp="

    .line 67
    .line 68
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, ", isAttached="

    .line 72
    .line 73
    const-string v1, ")"

    .line 74
    .line 75
    iget-short v2, p0, La/egd;->g:S

    .line 76
    .line 77
    iget-boolean p0, p0, La/egd;->h:Z

    .line 78
    .line 79
    invoke-static {v2, v0, v1, v3, p0}, La/ohs0;->k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method
