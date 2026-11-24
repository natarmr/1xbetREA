.class public final La/af7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZZJJJJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, La/af7;->a:Z

    .line 8
    .line 9
    iput-boolean p2, p0, La/af7;->b:Z

    .line 10
    .line 11
    iput-wide p3, p0, La/af7;->c:J

    .line 12
    .line 13
    iput-wide p5, p0, La/af7;->d:J

    .line 14
    .line 15
    iput-wide p7, p0, La/af7;->e:J

    .line 16
    .line 17
    iput-wide p9, p0, La/af7;->f:J

    .line 18
    .line 19
    iput-object p11, p0, La/af7;->g:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method

.method public static a(La/af7;JJI)La/af7;
    .locals 12

    .line 1
    iget-boolean v1, p0, La/af7;->a:Z

    .line 2
    .line 3
    iget-boolean v2, p0, La/af7;->b:Z

    .line 4
    .line 5
    and-int/lit8 v0, p5, 0x4

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide p1, p0, La/af7;->c:J

    .line 10
    .line 11
    :cond_0
    move-wide v3, p1

    .line 12
    iget-wide v5, p0, La/af7;->d:J

    .line 13
    .line 14
    iget-wide v7, p0, La/af7;->e:J

    .line 15
    .line 16
    and-int/lit8 p1, p5, 0x20

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-wide p1, p0, La/af7;->f:J

    .line 21
    .line 22
    move-wide v9, p1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-wide v9, p3

    .line 25
    :goto_0
    iget-object v11, p0, La/af7;->g:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v0, La/af7;

    .line 31
    .line 32
    invoke-direct/range {v0 .. v11}, La/af7;-><init>(ZZJJJJLjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/af7;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/af7;

    .line 12
    .line 13
    iget-boolean v1, p0, La/af7;->a:Z

    .line 14
    .line 15
    iget-boolean v3, p1, La/af7;->a:Z

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-boolean v1, p0, La/af7;->b:Z

    .line 21
    .line 22
    iget-boolean v3, p1, La/af7;->b:Z

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-wide v3, p0, La/af7;->c:J

    .line 28
    .line 29
    iget-wide v5, p1, La/af7;->c:J

    .line 30
    .line 31
    cmp-long v1, v3, v5

    .line 32
    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    return v2

    .line 36
    :cond_4
    iget-wide v3, p0, La/af7;->d:J

    .line 37
    .line 38
    iget-wide v5, p1, La/af7;->d:J

    .line 39
    .line 40
    cmp-long v1, v3, v5

    .line 41
    .line 42
    if-eqz v1, :cond_5

    .line 43
    .line 44
    return v2

    .line 45
    :cond_5
    iget-wide v3, p0, La/af7;->e:J

    .line 46
    .line 47
    iget-wide v5, p1, La/af7;->e:J

    .line 48
    .line 49
    cmp-long v1, v3, v5

    .line 50
    .line 51
    if-eqz v1, :cond_6

    .line 52
    .line 53
    return v2

    .line 54
    :cond_6
    iget-wide v3, p0, La/af7;->f:J

    .line 55
    .line 56
    iget-wide v5, p1, La/af7;->f:J

    .line 57
    .line 58
    cmp-long v1, v3, v5

    .line 59
    .line 60
    if-eqz v1, :cond_7

    .line 61
    .line 62
    return v2

    .line 63
    :cond_7
    iget-object p0, p0, La/af7;->g:Ljava/lang/String;

    .line 64
    .line 65
    iget-object p1, p1, La/af7;->g:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-nez p0, :cond_8

    .line 72
    .line 73
    return v2

    .line 74
    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, La/af7;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v2, p0, La/af7;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/af7;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/af7;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, La/af7;->e:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/af7;->f:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object p0, p0, La/af7;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v0

    .line 47
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", isLimitInactive="

    .line 2
    .line 3
    const-string v1, ", betLimitValue="

    .line 4
    .line 5
    const-string v2, "BetLimitIeModel(isFreeValue="

    .line 6
    .line 7
    iget-boolean v3, p0, La/af7;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/af7;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, La/af7;->c:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", currentBetLimitValue="

    .line 21
    .line 22
    const-string v2, ", pendingBetLimitValue="

    .line 23
    .line 24
    iget-wide v3, p0, La/af7;->d:J

    .line 25
    .line 26
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-wide v1, p0, La/af7;->e:J

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, ", betLimitPeriodValue="

    .line 35
    .line 36
    const-string v2, ", currency="

    .line 37
    .line 38
    iget-wide v3, p0, La/af7;->f:J

    .line 39
    .line 40
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v1, ")"

    .line 44
    .line 45
    iget-object p0, p0, La/af7;->g:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method
