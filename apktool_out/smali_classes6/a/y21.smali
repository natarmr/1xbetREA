.class public final La/y21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a5w;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:D

.field public final c:J

.field public final d:D

.field public final e:La/i0w;

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;DJDLa/i0w;JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, La/q4f;->a:La/nwd;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/y21;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-wide p2, p0, La/y21;->b:D

    .line 9
    .line 10
    iput-wide p4, p0, La/y21;->c:J

    .line 11
    .line 12
    iput-wide p6, p0, La/y21;->d:D

    .line 13
    .line 14
    iput-object p8, p0, La/y21;->e:La/i0w;

    .line 15
    .line 16
    iput-wide p9, p0, La/y21;->f:J

    .line 17
    .line 18
    iput-object p11, p0, La/y21;->g:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p12, p0, La/y21;->h:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final b()La/jvw;
    .locals 0

    .line 1
    iget-object p0, p0, La/y21;->e:La/i0w;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/q4f;
    .locals 0

    .line 1
    sget-object p0, La/q4f;->b:La/q4f;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/y21;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()D
    .locals 2

    .line 1
    iget-wide v0, p0, La/y21;->d:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/y21;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/y21;

    .line 11
    .line 12
    iget-object v0, p0, La/y21;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p1, La/y21;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    sget-object v0, La/q4f;->a:La/nwd;

    .line 24
    .line 25
    iget-wide v0, p0, La/y21;->b:D

    .line 26
    .line 27
    iget-wide v2, p1, La/y21;->b:D

    .line 28
    .line 29
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    iget-wide v0, p0, La/y21;->c:J

    .line 37
    .line 38
    iget-wide v2, p1, La/y21;->c:J

    .line 39
    .line 40
    cmp-long v0, v0, v2

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    const-wide/16 v0, 0x0

    .line 46
    .line 47
    invoke-static {v0, v1, v0, v1}, Ljava/lang/Double;->compare(DD)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    iget-wide v0, p0, La/y21;->d:D

    .line 55
    .line 56
    iget-wide v2, p1, La/y21;->d:D

    .line 57
    .line 58
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget-object v0, p0, La/y21;->e:La/i0w;

    .line 66
    .line 67
    iget-object v1, p1, La/y21;->e:La/i0w;

    .line 68
    .line 69
    if-eq v0, v1, :cond_7

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_7
    iget-wide v0, p0, La/y21;->f:J

    .line 73
    .line 74
    iget-wide v2, p1, La/y21;->f:J

    .line 75
    .line 76
    cmp-long v0, v0, v2

    .line 77
    .line 78
    if-eqz v0, :cond_8

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_8
    iget-object v0, p0, La/y21;->g:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v1, p1, La/y21;->g:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_9

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_9
    iget-object p0, p0, La/y21;->h:Ljava/lang/String;

    .line 93
    .line 94
    iget-object p1, p1, La/y21;->h:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-nez p0, :cond_a

    .line 101
    .line 102
    :goto_0
    const/4 p0, 0x0

    .line 103
    return p0

    .line 104
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 105
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/y21;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    sget-object v2, La/q4f;->b:La/q4f;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/vqd;->b(La/q4f;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/y21;->b:D

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/y21;->c:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/y21;->d:D

    .line 35
    .line 36
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/y21;->e:La/i0w;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    iget-wide v3, p0, La/y21;->f:J

    .line 49
    .line 50
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v2, p0, La/y21;->g:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object p0, p0, La/y21;->h:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    add-int/2addr p0, v0

    .line 67
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, La/q4f;->b:La/q4f;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "AggregatorHistoryItemModel(betId="

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, La/y21;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, ", couponType="

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, ", winSum="

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v2, p0, La/y21;->b:D

    .line 29
    .line 30
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, ", date="

    .line 34
    .line 35
    const-string v2, ", coefficient=0.0, betSum="

    .line 36
    .line 37
    iget-wide v3, p0, La/y21;->c:J

    .line 38
    .line 39
    invoke-static {v1, v0, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-wide v2, p0, La/y21;->d:D

    .line 43
    .line 44
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, ", status="

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, La/y21;->e:La/i0w;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v0, ", typeGame="

    .line 58
    .line 59
    const-string v2, ", gameName="

    .line 60
    .line 61
    iget-wide v3, p0, La/y21;->f:J

    .line 62
    .line 63
    invoke-static {v1, v0, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v0, ", productName="

    .line 67
    .line 68
    const-string v2, ")"

    .line 69
    .line 70
    iget-object v3, p0, La/y21;->g:Ljava/lang/String;

    .line 71
    .line 72
    iget-object p0, p0, La/y21;->h:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v1, v3, v0, p0, v2}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method
