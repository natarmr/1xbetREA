.class public final La/mdm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:La/pdm;

.field public final c:La/ldm;

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:J

.field public final j:J


# direct methods
.method public constructor <init>(ILa/pdm;La/ldm;IIIIIJJ)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput p1, p0, La/mdm;->a:I

    .line 97
    iput-object p2, p0, La/mdm;->b:La/pdm;

    .line 98
    iput-object p3, p0, La/mdm;->c:La/ldm;

    .line 99
    iput p4, p0, La/mdm;->d:I

    .line 100
    iput p5, p0, La/mdm;->e:I

    .line 101
    iput p6, p0, La/mdm;->f:I

    .line 102
    iput p7, p0, La/mdm;->g:I

    .line 103
    iput p8, p0, La/mdm;->h:I

    .line 104
    iput-wide p9, p0, La/mdm;->i:J

    .line 105
    iput-wide p11, p0, La/mdm;->j:J

    return-void
.end method

.method public synthetic constructor <init>(ILa/pdm;La/ldm;IIIIIJJI)V
    .locals 15

    .line 1
    move/from16 v0, p13

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object v1, La/pdm;->a:La/pdm;

    .line 8
    .line 9
    move-object v4, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object/from16 v4, p2

    .line 12
    .line 13
    :goto_0
    and-int/lit8 v1, v0, 0x4

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    sget-object v1, La/ldm;->a:La/ldm;

    .line 18
    .line 19
    move-object v5, v1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object/from16 v5, p3

    .line 22
    .line 23
    :goto_1
    and-int/lit8 v1, v0, 0x8

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const v1, 0x7f080827

    .line 28
    .line 29
    .line 30
    move v6, v1

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move/from16 v6, p4

    .line 33
    .line 34
    :goto_2
    and-int/lit8 v1, v0, 0x10

    .line 35
    .line 36
    const v2, 0x7f130792

    .line 37
    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    move v7, v2

    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move/from16 v7, p5

    .line 44
    .line 45
    :goto_3
    and-int/lit8 v1, v0, 0x20

    .line 46
    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    move v8, v2

    .line 50
    goto :goto_4

    .line 51
    :cond_4
    move/from16 v8, p6

    .line 52
    .line 53
    :goto_4
    and-int/lit8 v1, v0, 0x40

    .line 54
    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    move v9, v2

    .line 58
    goto :goto_5

    .line 59
    :cond_5
    move/from16 v9, p7

    .line 60
    .line 61
    :goto_5
    and-int/lit16 v1, v0, 0x80

    .line 62
    .line 63
    if-eqz v1, :cond_6

    .line 64
    .line 65
    move v10, v2

    .line 66
    goto :goto_6

    .line 67
    :cond_6
    move/from16 v10, p8

    .line 68
    .line 69
    :goto_6
    and-int/lit16 v1, v0, 0x100

    .line 70
    .line 71
    const-wide/16 v2, 0x0

    .line 72
    .line 73
    if-eqz v1, :cond_7

    .line 74
    .line 75
    move-wide v11, v2

    .line 76
    goto :goto_7

    .line 77
    :cond_7
    move-wide/from16 v11, p9

    .line 78
    .line 79
    :goto_7
    and-int/lit16 v0, v0, 0x200

    .line 80
    .line 81
    if-eqz v0, :cond_8

    .line 82
    .line 83
    move-wide v13, v2

    .line 84
    :goto_8
    move-object v2, p0

    .line 85
    move/from16 v3, p1

    .line 86
    .line 87
    goto :goto_9

    .line 88
    :cond_8
    move-wide/from16 v13, p11

    .line 89
    .line 90
    goto :goto_8

    .line 91
    :goto_9
    invoke-direct/range {v2 .. v14}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJ)V

    .line 92
    .line 93
    .line 94
    return-void
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
    instance-of v1, p1, La/mdm;

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
    check-cast p1, La/mdm;

    .line 12
    .line 13
    iget v1, p0, La/mdm;->a:I

    .line 14
    .line 15
    iget v3, p1, La/mdm;->a:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, La/mdm;->b:La/pdm;

    .line 21
    .line 22
    iget-object v3, p1, La/mdm;->b:La/pdm;

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-object v1, p0, La/mdm;->c:La/ldm;

    .line 28
    .line 29
    iget-object v3, p1, La/mdm;->c:La/ldm;

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget v1, p0, La/mdm;->d:I

    .line 35
    .line 36
    iget v3, p1, La/mdm;->d:I

    .line 37
    .line 38
    if-eq v1, v3, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    iget v1, p0, La/mdm;->e:I

    .line 42
    .line 43
    iget v3, p1, La/mdm;->e:I

    .line 44
    .line 45
    if-eq v1, v3, :cond_6

    .line 46
    .line 47
    return v2

    .line 48
    :cond_6
    iget v1, p0, La/mdm;->f:I

    .line 49
    .line 50
    iget v3, p1, La/mdm;->f:I

    .line 51
    .line 52
    if-eq v1, v3, :cond_7

    .line 53
    .line 54
    return v2

    .line 55
    :cond_7
    iget v1, p0, La/mdm;->g:I

    .line 56
    .line 57
    iget v3, p1, La/mdm;->g:I

    .line 58
    .line 59
    if-eq v1, v3, :cond_8

    .line 60
    .line 61
    return v2

    .line 62
    :cond_8
    iget v1, p0, La/mdm;->h:I

    .line 63
    .line 64
    iget v3, p1, La/mdm;->h:I

    .line 65
    .line 66
    if-eq v1, v3, :cond_9

    .line 67
    .line 68
    return v2

    .line 69
    :cond_9
    iget-wide v3, p0, La/mdm;->i:J

    .line 70
    .line 71
    iget-wide v5, p1, La/mdm;->i:J

    .line 72
    .line 73
    cmp-long v1, v3, v5

    .line 74
    .line 75
    if-eqz v1, :cond_a

    .line 76
    .line 77
    return v2

    .line 78
    :cond_a
    iget-wide v3, p0, La/mdm;->j:J

    .line 79
    .line 80
    iget-wide p0, p1, La/mdm;->j:J

    .line 81
    .line 82
    cmp-long p0, v3, p0

    .line 83
    .line 84
    if-eqz p0, :cond_b

    .line 85
    .line 86
    return v2

    .line 87
    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, La/mdm;->a:I

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
    iget-object v2, p0, La/mdm;->b:La/pdm;

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
    iget-object v0, p0, La/mdm;->c:La/ldm;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget v2, p0, La/mdm;->d:I

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget v2, p0, La/mdm;->e:I

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget v2, p0, La/mdm;->f:I

    .line 39
    .line 40
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v2, p0, La/mdm;->g:I

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget v2, p0, La/mdm;->h:I

    .line 51
    .line 52
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-wide v2, p0, La/mdm;->i:J

    .line 57
    .line 58
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-wide v1, p0, La/mdm;->j:J

    .line 63
    .line 64
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    add-int/2addr p0, v0

    .line 69
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DsEmptyConfigModel(lottie="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, La/mdm;->a:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", styleType="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/mdm;->b:La/pdm;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", colorType="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/mdm;->c:La/ldm;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", iconRes="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v1, p0, La/mdm;->d:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", titleText="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", subtitleText="

    .line 49
    .line 50
    const-string v2, ", captionText="

    .line 51
    .line 52
    iget v3, p0, La/mdm;->e:I

    .line 53
    .line 54
    iget v4, p0, La/mdm;->f:I

    .line 55
    .line 56
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", buttonText="

    .line 60
    .line 61
    const-string v2, ", countDownTimeMillis="

    .line 62
    .line 63
    iget v3, p0, La/mdm;->g:I

    .line 64
    .line 65
    iget v4, p0, La/mdm;->h:I

    .line 66
    .line 67
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 68
    .line 69
    .line 70
    iget-wide v1, p0, La/mdm;->i:J

    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", timerEndDateMillis="

    .line 76
    .line 77
    const-string v2, ")"

    .line 78
    .line 79
    iget-wide v3, p0, La/mdm;->j:J

    .line 80
    .line 81
    invoke-static {v0, v3, v4, v1, v2}, La/rw2;->n(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method
