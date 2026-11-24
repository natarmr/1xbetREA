.class public final La/z39;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b49;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:La/v39;

.field public final e:Ljava/lang/String;

.field public final f:J

.field public final g:J

.field public final h:Z

.field public final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(JJJLa/v39;Ljava/lang/String;JJZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, La/z39;->a:J

    .line 8
    .line 9
    iput-wide p3, p0, La/z39;->b:J

    .line 10
    .line 11
    iput-wide p5, p0, La/z39;->c:J

    .line 12
    .line 13
    iput-object p7, p0, La/z39;->d:La/v39;

    .line 14
    .line 15
    iput-object p8, p0, La/z39;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-wide p9, p0, La/z39;->f:J

    .line 18
    .line 19
    iput-wide p11, p0, La/z39;->g:J

    .line 20
    .line 21
    iput-boolean p13, p0, La/z39;->h:Z

    .line 22
    .line 23
    iput-object p14, p0, La/z39;->i:Ljava/lang/String;

    .line 24
    .line 25
    return-void
.end method

.method public static a(La/z39;JJZLjava/lang/String;I)La/z39;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p7

    .line 4
    .line 5
    iget-wide v2, v0, La/z39;->a:J

    .line 6
    .line 7
    move-wide v5, v2

    .line 8
    iget-wide v3, v0, La/z39;->b:J

    .line 9
    .line 10
    move-wide v7, v5

    .line 11
    iget-wide v5, v0, La/z39;->c:J

    .line 12
    .line 13
    move-wide v8, v7

    .line 14
    iget-object v7, v0, La/z39;->d:La/v39;

    .line 15
    .line 16
    move-wide v9, v8

    .line 17
    iget-object v8, v0, La/z39;->e:Ljava/lang/String;

    .line 18
    .line 19
    and-int/lit8 v2, v1, 0x20

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-wide v11, v0, La/z39;->f:J

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-wide/from16 v11, p1

    .line 27
    .line 28
    :goto_0
    and-int/lit8 v2, v1, 0x40

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iget-wide v13, v0, La/z39;->g:J

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-wide/from16 v13, p3

    .line 36
    .line 37
    :goto_1
    and-int/lit16 v2, v1, 0x80

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    iget-boolean v2, v0, La/z39;->h:Z

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move/from16 v2, p5

    .line 45
    .line 46
    :goto_2
    and-int/lit16 v1, v1, 0x100

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    iget-object v0, v0, La/z39;->i:Ljava/lang/String;

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    move-object/from16 v0, p6

    .line 54
    .line 55
    :goto_3
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-wide v15, v13

    .line 59
    move v13, v2

    .line 60
    move-wide v1, v9

    .line 61
    move-wide v9, v11

    .line 62
    move-wide v11, v15

    .line 63
    move-object v14, v0

    .line 64
    new-instance v0, La/z39;

    .line 65
    .line 66
    invoke-direct/range {v0 .. v14}, La/z39;-><init>(JJJLa/v39;Ljava/lang/String;JJZLjava/lang/String;)V

    .line 67
    .line 68
    .line 69
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
    instance-of v0, p1, La/z39;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/z39;

    .line 10
    .line 11
    iget-wide v0, p0, La/z39;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/z39;->a:J

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    iget-wide v0, p0, La/z39;->b:J

    .line 21
    .line 22
    iget-wide v2, p1, La/z39;->b:J

    .line 23
    .line 24
    cmp-long v0, v0, v2

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-wide v0, p0, La/z39;->c:J

    .line 30
    .line 31
    iget-wide v2, p1, La/z39;->c:J

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
    iget-object v0, p0, La/z39;->d:La/v39;

    .line 39
    .line 40
    iget-object v1, p1, La/z39;->d:La/v39;

    .line 41
    .line 42
    if-eq v0, v1, :cond_5

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_5
    iget-object v0, p0, La/z39;->e:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p1, La/z39;->e:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_6

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_6
    iget-wide v0, p0, La/z39;->f:J

    .line 57
    .line 58
    iget-wide v2, p1, La/z39;->f:J

    .line 59
    .line 60
    cmp-long v0, v0, v2

    .line 61
    .line 62
    if-eqz v0, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget-wide v0, p0, La/z39;->g:J

    .line 66
    .line 67
    iget-wide v2, p1, La/z39;->g:J

    .line 68
    .line 69
    cmp-long v0, v0, v2

    .line 70
    .line 71
    if-eqz v0, :cond_8

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_8
    iget-boolean v0, p0, La/z39;->h:Z

    .line 75
    .line 76
    iget-boolean v1, p1, La/z39;->h:Z

    .line 77
    .line 78
    if-eq v0, v1, :cond_9

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_9
    iget-object p0, p0, La/z39;->i:Ljava/lang/String;

    .line 82
    .line 83
    iget-object p1, p1, La/z39;->i:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-nez p0, :cond_a

    .line 90
    .line 91
    :goto_0
    const/4 p0, 0x0

    .line 92
    return p0

    .line 93
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 94
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/z39;->a:J

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
    iget-wide v2, p0, La/z39;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/z39;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/z39;->d:La/v39;

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
    iget-object v0, p0, La/z39;->e:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-wide v2, p0, La/z39;->f:J

    .line 37
    .line 38
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-wide v2, p0, La/z39;->g:J

    .line 43
    .line 44
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-boolean v2, p0, La/z39;->h:Z

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object p0, p0, La/z39;->i:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    add-int/2addr p0, v0

    .line 61
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "Active(gameId="

    .line 2
    .line 3
    const-string v1, ", sportId="

    .line 4
    .line 5
    iget-wide v2, p0, La/z39;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p0, La/z39;->b:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", subSportId="

    .line 17
    .line 18
    const-string v2, ", sourceType="

    .line 19
    .line 20
    iget-wide v3, p0, La/z39;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/z39;->d:La/v39;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", sourceId="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/z39;->e:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", playStartTimestamp="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-wide v1, p0, La/z39;->f:J

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", accumulatedTime="

    .line 51
    .line 52
    const-string v2, ", isPlaying="

    .line 53
    .line 54
    iget-wide v3, p0, La/z39;->g:J

    .line 55
    .line 56
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", broadcastSessionHost="

    .line 60
    .line 61
    const-string v2, ")"

    .line 62
    .line 63
    iget-object v3, p0, La/z39;->i:Ljava/lang/String;

    .line 64
    .line 65
    iget-boolean p0, p0, La/z39;->h:Z

    .line 66
    .line 67
    invoke-static {v1, v3, v2, v0, p0}, La/twn;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method
