.class public final La/fgd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:La/jge0;

.field public final f:La/jge0;

.field public final g:F

.field public final h:Z


# direct methods
.method public constructor <init>(JJJJLa/jge0;La/jge0;FZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/fgd;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, La/fgd;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, La/fgd;->c:J

    .line 9
    .line 10
    iput-wide p7, p0, La/fgd;->d:J

    .line 11
    .line 12
    iput-object p9, p0, La/fgd;->e:La/jge0;

    .line 13
    .line 14
    iput-object p10, p0, La/fgd;->f:La/jge0;

    .line 15
    .line 16
    iput p11, p0, La/fgd;->g:F

    .line 17
    .line 18
    iput-boolean p12, p0, La/fgd;->h:Z

    .line 19
    .line 20
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
    instance-of v0, p1, La/fgd;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/fgd;

    .line 10
    .line 11
    iget-wide v0, p0, La/fgd;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/fgd;->a:J

    .line 14
    .line 15
    invoke-static {v0, v1, v2, v3}, La/qkx;->a(JJ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-wide v0, p0, La/fgd;->b:J

    .line 23
    .line 24
    iget-wide v2, p1, La/fgd;->b:J

    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, La/ne60;->c(JJ)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-wide v0, p0, La/fgd;->c:J

    .line 34
    .line 35
    iget-wide v2, p1, La/fgd;->c:J

    .line 36
    .line 37
    invoke-static {v0, v1, v2, v3}, La/ne60;->c(JJ)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-wide v0, p0, La/fgd;->d:J

    .line 45
    .line 46
    iget-wide v2, p1, La/fgd;->d:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, La/ne60;->c(JJ)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object v0, p0, La/fgd;->e:La/jge0;

    .line 56
    .line 57
    iget-object v1, p1, La/fgd;->e:La/jge0;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, La/jge0;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget-object v0, p0, La/fgd;->f:La/jge0;

    .line 67
    .line 68
    iget-object v1, p1, La/fgd;->f:La/jge0;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, La/jge0;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_7

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget v0, p0, La/fgd;->g:F

    .line 78
    .line 79
    iget v1, p1, La/fgd;->g:F

    .line 80
    .line 81
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_8

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_8
    iget-boolean p0, p0, La/fgd;->h:Z

    .line 89
    .line 90
    iget-boolean p1, p1, La/fgd;->h:Z

    .line 91
    .line 92
    if-eq p0, p1, :cond_9

    .line 93
    .line 94
    :goto_0
    const/4 p0, 0x0

    .line 95
    return p0

    .line 96
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 97
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/fgd;->a:J

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
    iget-wide v2, p0, La/fgd;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/fgd;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/fgd;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/fgd;->e:La/jge0;

    .line 29
    .line 30
    invoke-virtual {v2}, La/jge0;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-object v0, p0, La/fgd;->f:La/jge0;

    .line 37
    .line 38
    invoke-virtual {v0}, La/jge0;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v2

    .line 43
    mul-int/2addr v0, v1

    .line 44
    iget v2, p0, La/fgd;->g:F

    .line 45
    .line 46
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-boolean p0, p0, La/fgd;->h:Z

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
    .locals 8

    .line 1
    iget-wide v0, p0, La/fgd;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/qkx;->b(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/fgd;->b:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/ne60;->h(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/fgd;->c:J

    .line 14
    .line 15
    invoke-static {v2, v3}, La/ne60;->h(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-wide v3, p0, La/fgd;->d:J

    .line 20
    .line 21
    invoke-static {v3, v4}, La/ne60;->h(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget v4, p0, La/fgd;->g:F

    .line 26
    .line 27
    invoke-static {v4}, La/ycl;->c(F)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const-string v5, ", positionInParent="

    .line 32
    .line 33
    const-string v6, ", positionInRoot="

    .line 34
    .line 35
    const-string v7, "ComponentCoordinatesUiModel(size="

    .line 36
    .line 37
    invoke-static {v7, v0, v5, v1, v6}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, ", positionInWindow="

    .line 42
    .line 43
    const-string v5, ", boundsInRoot="

    .line 44
    .line 45
    invoke-static {v0, v2, v1, v3, v5}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/fgd;->e:La/jge0;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", boundsInWindow="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/fgd;->f:La/jge0;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", radiusDp="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", isAttached="

    .line 69
    .line 70
    const-string v2, ")"

    .line 71
    .line 72
    iget-boolean p0, p0, La/fgd;->h:Z

    .line 73
    .line 74
    invoke-static {v4, v1, v2, v0, p0}, Lc;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method
