.class public final La/cdq0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:B

.field public final b:J

.field public final c:J

.field public final d:J


# direct methods
.method public constructor <init>(IJJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-byte p1, p0, La/cdq0;->a:B

    .line 5
    .line 6
    iput-wide p2, p0, La/cdq0;->b:J

    .line 7
    .line 8
    iput-wide p4, p0, La/cdq0;->c:J

    .line 9
    .line 10
    iput-wide p6, p0, La/cdq0;->d:J

    .line 11
    .line 12
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
    instance-of v0, p1, La/cdq0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/cdq0;

    .line 10
    .line 11
    iget-byte v0, p0, La/cdq0;->a:B

    .line 12
    .line 13
    iget-byte v1, p1, La/cdq0;->a:B

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-wide v0, p0, La/cdq0;->b:J

    .line 19
    .line 20
    iget-wide v2, p1, La/cdq0;->b:J

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, La/wen;->d(JJ)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-wide v0, p0, La/cdq0;->c:J

    .line 30
    .line 31
    iget-wide v2, p1, La/cdq0;->c:J

    .line 32
    .line 33
    invoke-static {v0, v1, v2, v3}, La/wen;->d(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-wide v0, p0, La/cdq0;->d:J

    .line 41
    .line 42
    iget-wide p0, p1, La/cdq0;->d:J

    .line 43
    .line 44
    invoke-static {v0, v1, p0, p1}, La/wen;->d(JJ)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    :goto_0
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 53
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-byte v0, p0, La/cdq0;->a:B

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    sget-object v2, La/wen;->b:La/uen;

    .line 11
    .line 12
    iget-wide v2, p0, La/cdq0;->b:J

    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-wide v2, p0, La/cdq0;->c:J

    .line 19
    .line 20
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-wide v1, p0, La/cdq0;->d:J

    .line 25
    .line 26
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    add-int/2addr p0, v0

    .line 31
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, La/cdq0;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/wen;->m(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/cdq0;->c:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/wen;->m(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/cdq0;->d:J

    .line 14
    .line 15
    invoke-static {v2, v3}, La/wen;->m(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, ", handThrowPoseHold="

    .line 20
    .line 21
    const-string v4, ", diceRoll="

    .line 22
    .line 23
    iget-byte p0, p0, La/cdq0;->a:B

    .line 24
    .line 25
    const-string v5, "ThrowTimings(shakeCycles="

    .line 26
    .line 27
    invoke-static {p0, v5, v3, v0, v4}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string v0, ", throwResultHold="

    .line 32
    .line 33
    const-string v3, ")"

    .line 34
    .line 35
    invoke-static {p0, v1, v0, v2, v3}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method
