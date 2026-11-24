.class public final La/unm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/tnm;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:F

.field public final f:F

.field public final g:I

.field public final h:I

.field public final i:Z


# direct methods
.method public constructor <init>(La/tnm;JJJFFIIZ)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, La/unm;->a:La/tnm;

    .line 44
    iput-wide p2, p0, La/unm;->b:J

    .line 45
    iput-wide p4, p0, La/unm;->c:J

    .line 46
    iput-wide p6, p0, La/unm;->d:J

    .line 47
    iput p8, p0, La/unm;->e:F

    .line 48
    iput p9, p0, La/unm;->f:F

    .line 49
    iput p10, p0, La/unm;->g:I

    .line 50
    iput p11, p0, La/unm;->h:I

    .line 51
    iput-boolean p12, p0, La/unm;->i:Z

    return-void
.end method

.method public synthetic constructor <init>(La/tnm;JJJFFIIZI)V
    .locals 15

    .line 1
    move/from16 v0, p13

    .line 2
    .line 3
    and-int/lit16 v1, v0, 0x80

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x64

    .line 8
    .line 9
    move v13, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move/from16 v13, p11

    .line 12
    .line 13
    :goto_0
    and-int/lit16 v0, v0, 0x100

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    move v14, v0

    .line 19
    :goto_1
    move-object v2, p0

    .line 20
    move-object/from16 v3, p1

    .line 21
    .line 22
    move-wide/from16 v4, p2

    .line 23
    .line 24
    move-wide/from16 v6, p4

    .line 25
    .line 26
    move-wide/from16 v8, p6

    .line 27
    .line 28
    move/from16 v10, p8

    .line 29
    .line 30
    move/from16 v11, p9

    .line 31
    .line 32
    move/from16 v12, p10

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    move/from16 v14, p12

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :goto_2
    invoke-direct/range {v2 .. v14}, La/unm;-><init>(La/tnm;JJJFFIIZ)V

    .line 39
    .line 40
    .line 41
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
    instance-of v1, p1, La/unm;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/unm;

    .line 11
    .line 12
    iget-object v1, p0, La/unm;->a:La/tnm;

    .line 13
    .line 14
    iget-object v2, p1, La/unm;->a:La/tnm;

    .line 15
    .line 16
    if-eq v1, v2, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-wide v1, p1, La/unm;->b:J

    .line 20
    .line 21
    sget v3, La/y3d;->h:I

    .line 22
    .line 23
    iget-wide v3, p0, La/unm;->b:J

    .line 24
    .line 25
    invoke-static {v3, v4, v1, v2}, La/h2t0;->a(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    iget-wide v1, p0, La/unm;->c:J

    .line 33
    .line 34
    iget-wide v3, p1, La/unm;->c:J

    .line 35
    .line 36
    invoke-static {v1, v2, v3, v4}, La/h2t0;->a(JJ)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iget-wide v1, p0, La/unm;->d:J

    .line 44
    .line 45
    iget-wide v3, p1, La/unm;->d:J

    .line 46
    .line 47
    invoke-static {v1, v2, v3, v4}, La/h2t0;->a(JJ)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_5

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    iget v1, p0, La/unm;->e:F

    .line 55
    .line 56
    iget v2, p1, La/unm;->e:F

    .line 57
    .line 58
    invoke-static {v1, v2}, La/ycl;->b(FF)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget v1, p0, La/unm;->f:F

    .line 66
    .line 67
    iget v2, p1, La/unm;->f:F

    .line 68
    .line 69
    invoke-static {v1, v2}, La/ycl;->b(FF)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_7

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_7
    iget v1, p0, La/unm;->g:I

    .line 77
    .line 78
    iget v2, p1, La/unm;->g:I

    .line 79
    .line 80
    if-eq v1, v2, :cond_8

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_8
    iget v1, p0, La/unm;->h:I

    .line 84
    .line 85
    iget v2, p1, La/unm;->h:I

    .line 86
    .line 87
    if-eq v1, v2, :cond_9

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_9
    iget-boolean p0, p0, La/unm;->i:Z

    .line 91
    .line 92
    iget-boolean p1, p1, La/unm;->i:Z

    .line 93
    .line 94
    if-eq p0, p1, :cond_a

    .line 95
    .line 96
    :goto_0
    const/4 p0, 0x0

    .line 97
    return p0

    .line 98
    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/unm;->a:La/tnm;

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
    sget v2, La/y3d;->h:I

    .line 11
    .line 12
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 13
    .line 14
    iget-wide v2, p0, La/unm;->b:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-wide v2, p0, La/unm;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-wide v2, p0, La/unm;->d:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget v2, p0, La/unm;->e:F

    .line 33
    .line 34
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget v2, p0, La/unm;->f:F

    .line 39
    .line 40
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v2, p0, La/unm;->g:I

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget v2, p0, La/unm;->h:I

    .line 51
    .line 52
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean p0, p0, La/unm;->i:Z

    .line 57
    .line 58
    invoke-static {v0, v1, p0}, La/brm0;->e(IIZ)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    add-int/2addr v0, p0

    .line 68
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-wide v0, p0, La/unm;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/unm;->c:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/unm;->d:J

    .line 14
    .line 15
    invoke-static {v2, v3}, La/y3d;->i(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v3, p0, La/unm;->e:F

    .line 20
    .line 21
    invoke-static {v3}, La/ycl;->c(F)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget v4, p0, La/unm;->f:F

    .line 26
    .line 27
    invoke-static {v4}, La/ycl;->c(F)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    new-instance v5, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v6, "DsProgressIndicatorUiModel(style="

    .line 34
    .line 35
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v6, p0, La/unm;->a:La/tnm;

    .line 39
    .line 40
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v6, ", progressColorStart="

    .line 44
    .line 45
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, ", progressColorEnd="

    .line 52
    .line 53
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v0, ", trackColor="

    .line 57
    .line 58
    const-string v6, ", thickness="

    .line 59
    .line 60
    invoke-static {v5, v1, v0, v2, v6}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v0, ", cornerRadius="

    .line 64
    .line 65
    const-string v1, ", progress="

    .line 66
    .line 67
    invoke-static {v5, v3, v0, v4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v0, ", maxProgress="

    .line 71
    .line 72
    const-string v1, ", hasTrackLine="

    .line 73
    .line 74
    iget v2, p0, La/unm;->g:I

    .line 75
    .line 76
    iget v3, p0, La/unm;->h:I

    .line 77
    .line 78
    invoke-static {v2, v3, v0, v1, v5}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 79
    .line 80
    .line 81
    const-string v0, ", animateProgress=false)"

    .line 82
    .line 83
    iget-boolean p0, p0, La/unm;->i:Z

    .line 84
    .line 85
    invoke-static {v5, p0, v0}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method
