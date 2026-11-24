.class public final La/gp40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/xrz;

.field public final b:La/pcq;

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:I

.field public final g:I

.field public final h:J

.field public final i:Z


# direct methods
.method public constructor <init>(La/xrz;La/pcq;ZLjava/lang/String;ZIIJZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/gp40;->a:La/xrz;

    .line 8
    .line 9
    iput-object p2, p0, La/gp40;->b:La/pcq;

    .line 10
    .line 11
    iput-boolean p3, p0, La/gp40;->c:Z

    .line 12
    .line 13
    iput-object p4, p0, La/gp40;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-boolean p5, p0, La/gp40;->e:Z

    .line 16
    .line 17
    iput p6, p0, La/gp40;->f:I

    .line 18
    .line 19
    iput p7, p0, La/gp40;->g:I

    .line 20
    .line 21
    iput-wide p8, p0, La/gp40;->h:J

    .line 22
    .line 23
    iput-boolean p10, p0, La/gp40;->i:Z

    .line 24
    .line 25
    return-void
.end method

.method public static a(La/gp40;La/pcq;ZLjava/lang/String;IIJZI)La/gp40;
    .locals 11

    .line 1
    move/from16 v0, p9

    .line 2
    .line 3
    iget-object v1, p0, La/gp40;->a:La/xrz;

    .line 4
    .line 5
    and-int/lit8 v2, v0, 0x2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, La/gp40;->b:La/pcq;

    .line 10
    .line 11
    :cond_0
    move-object v2, p1

    .line 12
    and-int/lit8 p1, v0, 0x4

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-boolean p2, p0, La/gp40;->c:Z

    .line 17
    .line 18
    :cond_1
    move v3, p2

    .line 19
    and-int/lit8 p1, v0, 0x8

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget-object p1, p0, La/gp40;->d:Ljava/lang/String;

    .line 24
    .line 25
    move-object v4, p1

    .line 26
    goto :goto_0

    .line 27
    :cond_2
    move-object v4, p3

    .line 28
    :goto_0
    and-int/lit8 p1, v0, 0x10

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    iget-boolean p1, p0, La/gp40;->e:Z

    .line 33
    .line 34
    :goto_1
    move v5, p1

    .line 35
    goto :goto_2

    .line 36
    :cond_3
    const/4 p1, 0x1

    .line 37
    goto :goto_1

    .line 38
    :goto_2
    and-int/lit8 p1, v0, 0x20

    .line 39
    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    iget p1, p0, La/gp40;->f:I

    .line 43
    .line 44
    move v6, p1

    .line 45
    goto :goto_3

    .line 46
    :cond_4
    move v6, p4

    .line 47
    :goto_3
    and-int/lit8 p1, v0, 0x40

    .line 48
    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    iget p1, p0, La/gp40;->g:I

    .line 52
    .line 53
    move v7, p1

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    move/from16 v7, p5

    .line 56
    .line 57
    :goto_4
    and-int/lit16 p1, v0, 0x80

    .line 58
    .line 59
    if-eqz p1, :cond_6

    .line 60
    .line 61
    iget-wide p1, p0, La/gp40;->h:J

    .line 62
    .line 63
    move-wide v8, p1

    .line 64
    goto :goto_5

    .line 65
    :cond_6
    move-wide/from16 v8, p6

    .line 66
    .line 67
    :goto_5
    and-int/lit16 p1, v0, 0x100

    .line 68
    .line 69
    if-eqz p1, :cond_7

    .line 70
    .line 71
    iget-boolean p1, p0, La/gp40;->i:Z

    .line 72
    .line 73
    move v10, p1

    .line 74
    goto :goto_6

    .line 75
    :cond_7
    move/from16 v10, p8

    .line 76
    .line 77
    :goto_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v0, La/gp40;

    .line 87
    .line 88
    invoke-direct/range {v0 .. v10}, La/gp40;-><init>(La/xrz;La/pcq;ZLjava/lang/String;ZIIJZ)V

    .line 89
    .line 90
    .line 91
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
    instance-of v0, p1, La/gp40;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/gp40;

    .line 10
    .line 11
    iget-object v0, p0, La/gp40;->a:La/xrz;

    .line 12
    .line 13
    iget-object v1, p1, La/gp40;->a:La/xrz;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/gp40;->b:La/pcq;

    .line 23
    .line 24
    iget-object v1, p1, La/gp40;->b:La/pcq;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/gp40;->c:Z

    .line 34
    .line 35
    iget-boolean v1, p1, La/gp40;->c:Z

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-object v0, p0, La/gp40;->d:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, p1, La/gp40;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-boolean v0, p0, La/gp40;->e:Z

    .line 52
    .line 53
    iget-boolean v1, p1, La/gp40;->e:Z

    .line 54
    .line 55
    if-eq v0, v1, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget v0, p0, La/gp40;->f:I

    .line 59
    .line 60
    iget v1, p1, La/gp40;->f:I

    .line 61
    .line 62
    if-eq v0, v1, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget v0, p0, La/gp40;->g:I

    .line 66
    .line 67
    iget v1, p1, La/gp40;->g:I

    .line 68
    .line 69
    if-eq v0, v1, :cond_8

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_8
    iget-wide v0, p0, La/gp40;->h:J

    .line 73
    .line 74
    iget-wide v2, p1, La/gp40;->h:J

    .line 75
    .line 76
    cmp-long v0, v0, v2

    .line 77
    .line 78
    if-eqz v0, :cond_9

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_9
    iget-boolean p0, p0, La/gp40;->i:Z

    .line 82
    .line 83
    iget-boolean p1, p1, La/gp40;->i:Z

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
    .locals 4

    .line 1
    iget-object v0, p0, La/gp40;->a:La/xrz;

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
    iget-object v2, p0, La/gp40;->b:La/pcq;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v2}, La/pcq;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    :goto_0
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-boolean v2, p0, La/gp40;->c:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/gp40;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/gp40;->e:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/gp40;->f:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, La/gp40;->g:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-wide v2, p0, La/gp40;->h:J

    .line 53
    .line 54
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean p0, p0, La/gp40;->i:Z

    .line 59
    .line 60
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v0

    .line 65
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MoneyLimitRsState(limitType="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/gp40;->a:La/xrz;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", limitModel="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/gp40;->b:La/pcq;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", isLoading="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", textFieldError="

    .line 29
    .line 30
    const-string v2, ", hasErrorWhileLoadingLimits="

    .line 31
    .line 32
    iget-object v3, p0, La/gp40;->d:Ljava/lang/String;

    .line 33
    .line 34
    iget-boolean v4, p0, La/gp40;->c:Z

    .line 35
    .line 36
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", initialValueIndex="

    .line 40
    .line 41
    const-string v2, ", selectedValueIndex="

    .line 42
    .line 43
    iget v3, p0, La/gp40;->f:I

    .line 44
    .line 45
    iget-boolean v4, p0, La/gp40;->e:Z

    .line 46
    .line 47
    invoke-static {v3, v1, v2, v0, v4}, La/ua80;->q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 48
    .line 49
    .line 50
    iget v1, p0, La/gp40;->g:I

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", inputValue="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-wide v1, p0, La/gp40;->h:J

    .line 61
    .line 62
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", exitAfterErrorDialog="

    .line 66
    .line 67
    const-string v2, ")"

    .line 68
    .line 69
    iget-boolean p0, p0, La/gp40;->i:Z

    .line 70
    .line 71
    invoke-static {v0, v1, p0, v2}, La/f140;->n(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method
