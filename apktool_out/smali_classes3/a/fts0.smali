.class public final La/fts0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/bm5;

.field public final b:La/its0;

.field public final c:J

.field public final d:Z

.field public final e:Z

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:I


# direct methods
.method public constructor <init>(La/bm5;La/its0;JZZLjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/fts0;->a:La/bm5;

    .line 5
    .line 6
    iput-object p2, p0, La/fts0;->b:La/its0;

    .line 7
    .line 8
    iput-wide p3, p0, La/fts0;->c:J

    .line 9
    .line 10
    iput-boolean p5, p0, La/fts0;->d:Z

    .line 11
    .line 12
    iput-boolean p6, p0, La/fts0;->e:Z

    .line 13
    .line 14
    iput-object p7, p0, La/fts0;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p8, p0, La/fts0;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput p9, p0, La/fts0;->h:I

    .line 19
    .line 20
    return-void
.end method

.method public static a(La/fts0;La/its0;JZLjava/lang/String;I)La/fts0;
    .locals 10

    .line 1
    iget-object v1, p0, La/fts0;->a:La/bm5;

    .line 2
    .line 3
    and-int/lit8 v0, p6, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/fts0;->b:La/its0;

    .line 8
    .line 9
    :cond_0
    move-object v2, p1

    .line 10
    and-int/lit8 p1, p6, 0x4

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-wide p2, p0, La/fts0;->c:J

    .line 15
    .line 16
    :cond_1
    move-wide v3, p2

    .line 17
    and-int/lit8 p1, p6, 0x8

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-boolean p4, p0, La/fts0;->d:Z

    .line 22
    .line 23
    :cond_2
    move v5, p4

    .line 24
    iget-boolean v6, p0, La/fts0;->e:Z

    .line 25
    .line 26
    and-int/lit8 p1, p6, 0x20

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    iget-object p5, p0, La/fts0;->f:Ljava/lang/String;

    .line 31
    .line 32
    :cond_3
    move-object v7, p5

    .line 33
    iget-object v8, p0, La/fts0;->g:Ljava/lang/String;

    .line 34
    .line 35
    iget v9, p0, La/fts0;->h:I

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v0, La/fts0;

    .line 44
    .line 45
    invoke-direct/range {v0 .. v9}, La/fts0;-><init>(La/bm5;La/its0;JZZLjava/lang/String;Ljava/lang/String;I)V

    .line 46
    .line 47
    .line 48
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
    instance-of v0, p1, La/fts0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/fts0;

    .line 10
    .line 11
    iget-object v0, p0, La/fts0;->a:La/bm5;

    .line 12
    .line 13
    iget-object v1, p1, La/fts0;->a:La/bm5;

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object v0, p0, La/fts0;->b:La/its0;

    .line 19
    .line 20
    iget-object v1, p1, La/fts0;->b:La/its0;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-wide v0, p0, La/fts0;->c:J

    .line 30
    .line 31
    iget-wide v2, p1, La/fts0;->c:J

    .line 32
    .line 33
    cmp-long v0, v0, v2

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    iget-boolean v0, p0, La/fts0;->d:Z

    .line 39
    .line 40
    iget-boolean v1, p1, La/fts0;->d:Z

    .line 41
    .line 42
    if-eq v0, v1, :cond_5

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_5
    iget-boolean v0, p0, La/fts0;->e:Z

    .line 46
    .line 47
    iget-boolean v1, p1, La/fts0;->e:Z

    .line 48
    .line 49
    if-eq v0, v1, :cond_6

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_6
    iget-object v0, p0, La/fts0;->f:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v1, p1, La/fts0;->f:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_7

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_7
    iget-object v0, p0, La/fts0;->g:Ljava/lang/String;

    .line 64
    .line 65
    iget-object v1, p1, La/fts0;->g:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_8

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_8
    iget p0, p0, La/fts0;->h:I

    .line 75
    .line 76
    iget p1, p1, La/fts0;->h:I

    .line 77
    .line 78
    if-eq p0, p1, :cond_9

    .line 79
    .line 80
    :goto_0
    const/4 p0, 0x0

    .line 81
    return p0

    .line 82
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 83
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/fts0;->a:La/bm5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, La/fts0;->b:La/its0;

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
    iget-wide v3, p0, La/fts0;->c:J

    .line 19
    .line 20
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-boolean v2, p0, La/fts0;->d:Z

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/fts0;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, La/fts0;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, La/fts0;->g:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget p0, p0, La/fts0;->h:I

    .line 49
    .line 50
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    add-int/2addr p0, v0

    .line 55
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TvBetJackpotState(balanceScreenType="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/fts0;->a:La/bm5;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", tvBetJackpotState="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/fts0;->b:La/its0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", selectedDate="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", hasBlockingError="

    .line 29
    .line 30
    iget-wide v2, p0, La/fts0;->c:J

    .line 31
    .line 32
    iget-boolean v4, p0, La/fts0;->d:Z

    .line 33
    .line 34
    invoke-static {v2, v3, v1, v0, v4}, La/hne;->t(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", fromAggregator="

    .line 38
    .line 39
    const-string v2, ", currency="

    .line 40
    .line 41
    iget-object v3, p0, La/fts0;->f:Ljava/lang/String;

    .line 42
    .line 43
    iget-boolean v4, p0, La/fts0;->e:Z

    .line 44
    .line 45
    invoke-static {v1, v2, v3, v0, v4}, La/hne;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", bannerTranslateId="

    .line 49
    .line 50
    const-string v2, ", lottieAnimationTypeId="

    .line 51
    .line 52
    iget v3, p0, La/fts0;->h:I

    .line 53
    .line 54
    iget-object p0, p0, La/fts0;->g:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v3, v1, p0, v2, v0}, La/axq;->s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

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
