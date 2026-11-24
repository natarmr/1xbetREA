.class public final La/ob6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Z

.field public final d:I

.field public final e:J

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(IIZIJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/ob6;->a:I

    .line 5
    .line 6
    iput p2, p0, La/ob6;->b:I

    .line 7
    .line 8
    iput-boolean p3, p0, La/ob6;->c:Z

    .line 9
    .line 10
    iput p4, p0, La/ob6;->d:I

    .line 11
    .line 12
    iput-wide p5, p0, La/ob6;->e:J

    .line 13
    .line 14
    iput-object p7, p0, La/ob6;->f:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/ob6;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/ob6;

    .line 11
    .line 12
    iget v1, p0, La/ob6;->a:I

    .line 13
    .line 14
    iget v2, p1, La/ob6;->a:I

    .line 15
    .line 16
    if-eq v1, v2, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget v1, p0, La/ob6;->b:I

    .line 20
    .line 21
    iget v2, p1, La/ob6;->b:I

    .line 22
    .line 23
    if-eq v1, v2, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    iget-boolean v1, p0, La/ob6;->c:Z

    .line 27
    .line 28
    iget-boolean v2, p1, La/ob6;->c:Z

    .line 29
    .line 30
    if-eq v1, v2, :cond_4

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_4
    iget v1, p0, La/ob6;->d:I

    .line 34
    .line 35
    iget v2, p1, La/ob6;->d:I

    .line 36
    .line 37
    if-eq v1, v2, :cond_5

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_5
    iget-wide v1, p0, La/ob6;->e:J

    .line 41
    .line 42
    iget-wide v3, p1, La/ob6;->e:J

    .line 43
    .line 44
    cmp-long v1, v1, v3

    .line 45
    .line 46
    if-eqz v1, :cond_6

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_6
    iget-object p0, p0, La/ob6;->f:Ljava/lang/String;

    .line 50
    .line 51
    iget-object p1, p1, La/ob6;->f:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_7

    .line 58
    .line 59
    :goto_0
    const/4 p0, 0x0

    .line 60
    return p0

    .line 61
    :cond_7
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/16 v0, 0xa

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
    iget v2, p0, La/ob6;->a:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/ob6;->b:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/ob6;->c:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/ob6;->d:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-wide v2, p0, La/ob6;->e:J

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-object p0, p0, La/ob6;->f:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0, v1, p0}, La/ua80;->b(IILjava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    const/16 v0, 0x54d

    .line 52
    .line 53
    invoke-static {v0, p0, v1}, La/twn;->a(III)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    const/16 v0, 0x16

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    add-int/2addr v0, p0

    .line 64
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", countryId="

    .line 2
    .line 3
    const-string v1, ", cutCoef="

    .line 4
    .line 5
    const-string v2, "BestGamesParamsModel(count=10, fcountryId="

    .line 6
    .line 7
    iget v3, p0, La/ob6;->a:I

    .line 8
    .line 9
    iget v4, p0, La/ob6;->b:I

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, v4}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", cfViewTypeId="

    .line 16
    .line 17
    const-string v2, ", refId=1, userId="

    .line 18
    .line 19
    iget v3, p0, La/ob6;->d:I

    .line 20
    .line 21
    iget-boolean v4, p0, La/ob6;->c:Z

    .line 22
    .line 23
    invoke-static {v3, v1, v2, v0, v4}, La/ua80;->q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", lang="

    .line 27
    .line 28
    iget-wide v2, p0, La/ob6;->e:J

    .line 29
    .line 30
    iget-object p0, p0, La/ob6;->f:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, v2, v3, v1, p0}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string p0, ", groupId=1357, whence=22)"

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method
