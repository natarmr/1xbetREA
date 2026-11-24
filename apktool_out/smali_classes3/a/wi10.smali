.class public final La/wi10;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:La/vi10;

.field public final e:J

.field public final f:D

.field public final g:La/th10;


# direct methods
.method public constructor <init>(IIJLa/vi10;JDLa/th10;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/wi10;->a:I

    .line 5
    .line 6
    iput p2, p0, La/wi10;->b:I

    .line 7
    .line 8
    iput-wide p3, p0, La/wi10;->c:J

    .line 9
    .line 10
    iput-object p5, p0, La/wi10;->d:La/vi10;

    .line 11
    .line 12
    iput-wide p6, p0, La/wi10;->e:J

    .line 13
    .line 14
    iput-wide p8, p0, La/wi10;->f:D

    .line 15
    .line 16
    iput-object p10, p0, La/wi10;->g:La/th10;

    .line 17
    .line 18
    return-void
.end method

.method public static a(La/wi10;JLa/vi10;JLa/th10;)La/wi10;
    .locals 11

    .line 1
    iget v1, p0, La/wi10;->a:I

    .line 2
    .line 3
    iget v2, p0, La/wi10;->b:I

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, La/wi10;

    .line 9
    .line 10
    const-wide/16 v8, 0x0

    .line 11
    .line 12
    move-wide v3, p1

    .line 13
    move-object v5, p3

    .line 14
    move-wide v6, p4

    .line 15
    move-object/from16 v10, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v10}, La/wi10;-><init>(IIJLa/vi10;JDLa/th10;)V

    .line 18
    .line 19
    .line 20
    return-object v0
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
    instance-of v0, p1, La/wi10;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/wi10;

    .line 10
    .line 11
    iget v0, p0, La/wi10;->a:I

    .line 12
    .line 13
    iget v1, p1, La/wi10;->a:I

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget v0, p0, La/wi10;->b:I

    .line 19
    .line 20
    iget v1, p1, La/wi10;->b:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-wide v0, p0, La/wi10;->c:J

    .line 26
    .line 27
    iget-wide v2, p1, La/wi10;->c:J

    .line 28
    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_4
    iget-object v0, p0, La/wi10;->d:La/vi10;

    .line 35
    .line 36
    iget-object v1, p1, La/wi10;->d:La/vi10;

    .line 37
    .line 38
    if-eq v0, v1, :cond_5

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_5
    iget-wide v0, p0, La/wi10;->e:J

    .line 42
    .line 43
    iget-wide v2, p1, La/wi10;->e:J

    .line 44
    .line 45
    cmp-long v0, v0, v2

    .line 46
    .line 47
    if-eqz v0, :cond_6

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_6
    iget-wide v0, p0, La/wi10;->f:D

    .line 51
    .line 52
    iget-wide v2, p1, La/wi10;->f:D

    .line 53
    .line 54
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    iget-object p0, p0, La/wi10;->g:La/th10;

    .line 62
    .line 63
    iget-object p1, p1, La/wi10;->g:La/th10;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, La/th10;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-nez p0, :cond_8

    .line 70
    .line 71
    :goto_0
    const/4 p0, 0x0

    .line 72
    return p0

    .line 73
    :cond_8
    :goto_1
    const/4 p0, 0x1

    .line 74
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget v0, p0, La/wi10;->a:I

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
    iget v2, p0, La/wi10;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/wi10;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/wi10;->d:La/vi10;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-wide v3, p0, La/wi10;->e:J

    .line 31
    .line 32
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-wide v2, p0, La/wi10;->f:D

    .line 37
    .line 38
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object p0, p0, La/wi10;->g:La/th10;

    .line 43
    .line 44
    invoke-virtual {p0}, La/th10;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    add-int/2addr p0, v0

    .line 49
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", experience="

    .line 2
    .line 3
    const-string v1, ", paymentAvailableFrom="

    .line 4
    .line 5
    const-string v2, "LoyaltyProgramUserInfoModel(level="

    .line 6
    .line 7
    iget v3, p0, La/wi10;->a:I

    .line 8
    .line 9
    iget v4, p0, La/wi10;->b:I

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, v4}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, La/wi10;->c:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", cashbackState="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/wi10;->d:La/vi10;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", updatedTime="

    .line 31
    .line 32
    const-string v2, ", cashbackSum="

    .line 33
    .line 34
    iget-wide v3, p0, La/wi10;->e:J

    .line 35
    .line 36
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iget-wide v1, p0, La/wi10;->f:D

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", userCurrencyModel="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, La/wi10;->g:La/th10;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, ")"

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method
