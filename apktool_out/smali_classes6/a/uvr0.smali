.class public final La/uvr0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vvr0;

.field public final b:La/plr0;

.field public final c:Z

.field public final d:I

.field public final e:J

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/vvr0;La/plr0;ZIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uvr0;->a:La/vvr0;

    .line 5
    .line 6
    iput-object p2, p0, La/uvr0;->b:La/plr0;

    .line 7
    .line 8
    iput-boolean p3, p0, La/uvr0;->c:Z

    .line 9
    .line 10
    iput p4, p0, La/uvr0;->d:I

    .line 11
    .line 12
    iput-wide p5, p0, La/uvr0;->e:J

    .line 13
    .line 14
    iput-object p7, p0, La/uvr0;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p8, p0, La/uvr0;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p9, p0, La/uvr0;->h:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method

.method public static a(La/uvr0;La/vvr0;La/plr0;ZIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)La/uvr0;
    .locals 10

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/uvr0;->a:La/vvr0;

    .line 8
    .line 9
    :cond_0
    move-object v1, p1

    .line 10
    and-int/lit8 p1, v0, 0x2

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p2, p0, La/uvr0;->b:La/plr0;

    .line 15
    .line 16
    :cond_1
    move-object v2, p2

    .line 17
    and-int/lit8 p1, v0, 0x4

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-boolean p3, p0, La/uvr0;->c:Z

    .line 22
    .line 23
    :cond_2
    move v3, p3

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 p1, v0, 0x10

    .line 28
    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    iget p4, p0, La/uvr0;->d:I

    .line 32
    .line 33
    :cond_3
    move v4, p4

    .line 34
    and-int/lit8 p1, v0, 0x20

    .line 35
    .line 36
    if-eqz p1, :cond_4

    .line 37
    .line 38
    iget-wide p1, p0, La/uvr0;->e:J

    .line 39
    .line 40
    move-wide v5, p1

    .line 41
    goto :goto_0

    .line 42
    :cond_4
    move-wide v5, p5

    .line 43
    :goto_0
    and-int/lit8 p1, v0, 0x40

    .line 44
    .line 45
    if-eqz p1, :cond_5

    .line 46
    .line 47
    iget-object p1, p0, La/uvr0;->f:Ljava/lang/String;

    .line 48
    .line 49
    move-object v7, p1

    .line 50
    goto :goto_1

    .line 51
    :cond_5
    move-object/from16 v7, p7

    .line 52
    .line 53
    :goto_1
    and-int/lit16 p1, v0, 0x80

    .line 54
    .line 55
    if-eqz p1, :cond_6

    .line 56
    .line 57
    iget-object p1, p0, La/uvr0;->g:Ljava/lang/String;

    .line 58
    .line 59
    move-object v8, p1

    .line 60
    goto :goto_2

    .line 61
    :cond_6
    move-object/from16 v8, p8

    .line 62
    .line 63
    :goto_2
    and-int/lit16 p1, v0, 0x100

    .line 64
    .line 65
    if-eqz p1, :cond_7

    .line 66
    .line 67
    iget-object p1, p0, La/uvr0;->h:Ljava/lang/String;

    .line 68
    .line 69
    move-object v9, p1

    .line 70
    goto :goto_3

    .line 71
    :cond_7
    move-object/from16 v9, p9

    .line 72
    .line 73
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v0, La/uvr0;

    .line 77
    .line 78
    invoke-direct/range {v0 .. v9}, La/uvr0;-><init>(La/vvr0;La/plr0;ZIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
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
    instance-of v0, p1, La/uvr0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/uvr0;

    .line 10
    .line 11
    iget-object v0, p0, La/uvr0;->a:La/vvr0;

    .line 12
    .line 13
    iget-object v1, p1, La/uvr0;->a:La/vvr0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/vvr0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/uvr0;->b:La/plr0;

    .line 23
    .line 24
    iget-object v1, p1, La/uvr0;->b:La/plr0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/uvr0;->c:Z

    .line 34
    .line 35
    iget-boolean v1, p1, La/uvr0;->c:Z

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget v0, p0, La/uvr0;->d:I

    .line 41
    .line 42
    iget v1, p1, La/uvr0;->d:I

    .line 43
    .line 44
    if-eq v0, v1, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-wide v0, p0, La/uvr0;->e:J

    .line 48
    .line 49
    iget-wide v2, p1, La/uvr0;->e:J

    .line 50
    .line 51
    cmp-long v0, v0, v2

    .line 52
    .line 53
    if-eqz v0, :cond_6

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_6
    iget-object v0, p0, La/uvr0;->f:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v1, p1, La/uvr0;->f:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_7
    iget-object v0, p0, La/uvr0;->g:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v1, p1, La/uvr0;->g:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_8

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_8
    iget-object p0, p0, La/uvr0;->h:Ljava/lang/String;

    .line 79
    .line 80
    iget-object p1, p1, La/uvr0;->h:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-nez p0, :cond_9

    .line 87
    .line 88
    :goto_0
    const/4 p0, 0x0

    .line 89
    return p0

    .line 90
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 91
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/uvr0;->a:La/vvr0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/vvr0;->hashCode()I

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
    iget-object v2, p0, La/uvr0;->b:La/plr0;

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
    iget-boolean v0, p0, La/uvr0;->c:Z

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget v2, p0, La/uvr0;->d:I

    .line 30
    .line 31
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-wide v2, p0, La/uvr0;->e:J

    .line 36
    .line 37
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v2, p0, La/uvr0;->f:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v2, p0, La/uvr0;->g:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget-object p0, p0, La/uvr0;->h:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    add-int/2addr p0, v0

    .line 60
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TotoTirageState(topBarState="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/uvr0;->a:La/vvr0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", totoBetTirageListState="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/uvr0;->b:La/plr0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", isScrollToTopRequested="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", currentTotoTypeId=0, initialTotoTypeId="

    .line 29
    .line 30
    const-string v2, ", retryCountDownTimerValue="

    .line 31
    .line 32
    iget v3, p0, La/uvr0;->d:I

    .line 33
    .line 34
    iget-boolean v4, p0, La/uvr0;->c:Z

    .line 35
    .line 36
    invoke-static {v3, v1, v2, v0, v4}, La/ua80;->q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", fileForLoadUrl="

    .line 40
    .line 41
    iget-wide v2, p0, La/uvr0;->e:J

    .line 42
    .line 43
    iget-object v4, p0, La/uvr0;->f:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", fileForLoadName="

    .line 49
    .line 50
    const-string v2, ", fileForLoadSizeText="

    .line 51
    .line 52
    iget-object v3, p0, La/uvr0;->g:Ljava/lang/String;

    .line 53
    .line 54
    iget-object p0, p0, La/uvr0;->h:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0, v1, v3, v2, p0}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

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
