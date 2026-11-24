.class public final La/yhr0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/lhr0;

.field public final b:La/lmr0;

.field public final c:Ljava/util/Map;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Z

.field public final g:J

.field public final h:J

.field public final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/lhr0;La/lmr0;Ljava/util/Map;Ljava/lang/String;ZZJJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/yhr0;->a:La/lhr0;

    .line 5
    .line 6
    iput-object p2, p0, La/yhr0;->b:La/lmr0;

    .line 7
    .line 8
    iput-object p3, p0, La/yhr0;->c:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, La/yhr0;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, La/yhr0;->e:Z

    .line 13
    .line 14
    iput-boolean p6, p0, La/yhr0;->f:Z

    .line 15
    .line 16
    iput-wide p7, p0, La/yhr0;->g:J

    .line 17
    .line 18
    iput-wide p9, p0, La/yhr0;->h:J

    .line 19
    .line 20
    iput-object p11, p0, La/yhr0;->i:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method

.method public static a(La/yhr0;La/lhr0;La/lmr0;Ljava/util/Map;ZZJJLjava/lang/String;I)La/yhr0;
    .locals 12

    .line 1
    move/from16 v0, p11

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/yhr0;->a:La/lhr0;

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
    iget-object p2, p0, La/yhr0;->b:La/lmr0;

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
    iget-object p3, p0, La/yhr0;->c:Ljava/util/Map;

    .line 22
    .line 23
    :cond_2
    move-object v3, p3

    .line 24
    iget-object v4, p0, La/yhr0;->d:Ljava/lang/String;

    .line 25
    .line 26
    and-int/lit8 p1, v0, 0x10

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    iget-boolean p1, p0, La/yhr0;->e:Z

    .line 31
    .line 32
    move v5, p1

    .line 33
    goto :goto_0

    .line 34
    :cond_3
    move/from16 v5, p4

    .line 35
    .line 36
    :goto_0
    and-int/lit8 p1, v0, 0x20

    .line 37
    .line 38
    if-eqz p1, :cond_4

    .line 39
    .line 40
    iget-boolean p1, p0, La/yhr0;->f:Z

    .line 41
    .line 42
    move v6, p1

    .line 43
    goto :goto_1

    .line 44
    :cond_4
    move/from16 v6, p5

    .line 45
    .line 46
    :goto_1
    and-int/lit8 p1, v0, 0x40

    .line 47
    .line 48
    if-eqz p1, :cond_5

    .line 49
    .line 50
    iget-wide p1, p0, La/yhr0;->g:J

    .line 51
    .line 52
    move-wide v7, p1

    .line 53
    goto :goto_2

    .line 54
    :cond_5
    move-wide/from16 v7, p6

    .line 55
    .line 56
    :goto_2
    and-int/lit16 p1, v0, 0x80

    .line 57
    .line 58
    if-eqz p1, :cond_6

    .line 59
    .line 60
    iget-wide p1, p0, La/yhr0;->h:J

    .line 61
    .line 62
    move-wide v9, p1

    .line 63
    goto :goto_3

    .line 64
    :cond_6
    move-wide/from16 v9, p8

    .line 65
    .line 66
    :goto_3
    and-int/lit16 p1, v0, 0x100

    .line 67
    .line 68
    if-eqz p1, :cond_7

    .line 69
    .line 70
    iget-object p1, p0, La/yhr0;->i:Ljava/lang/String;

    .line 71
    .line 72
    move-object v11, p1

    .line 73
    goto :goto_4

    .line 74
    :cond_7
    move-object/from16 v11, p10

    .line 75
    .line 76
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance v0, La/yhr0;

    .line 86
    .line 87
    invoke-direct/range {v0 .. v11}, La/yhr0;-><init>(La/lhr0;La/lmr0;Ljava/util/Map;Ljava/lang/String;ZZJJLjava/lang/String;)V

    .line 88
    .line 89
    .line 90
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
    instance-of v0, p1, La/yhr0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/yhr0;

    .line 10
    .line 11
    iget-object v0, p0, La/yhr0;->a:La/lhr0;

    .line 12
    .line 13
    iget-object v1, p1, La/yhr0;->a:La/lhr0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/yhr0;->b:La/lmr0;

    .line 23
    .line 24
    iget-object v1, p1, La/yhr0;->b:La/lmr0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/lmr0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/yhr0;->c:Ljava/util/Map;

    .line 34
    .line 35
    iget-object v1, p1, La/yhr0;->c:Ljava/util/Map;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, La/yhr0;->d:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, p1, La/yhr0;->d:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-boolean v0, p0, La/yhr0;->e:Z

    .line 56
    .line 57
    iget-boolean v1, p1, La/yhr0;->e:Z

    .line 58
    .line 59
    if-eq v0, v1, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-boolean v0, p0, La/yhr0;->f:Z

    .line 63
    .line 64
    iget-boolean v1, p1, La/yhr0;->f:Z

    .line 65
    .line 66
    if-eq v0, v1, :cond_7

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_7
    iget-wide v0, p0, La/yhr0;->g:J

    .line 70
    .line 71
    iget-wide v2, p1, La/yhr0;->g:J

    .line 72
    .line 73
    cmp-long v0, v0, v2

    .line 74
    .line 75
    if-eqz v0, :cond_8

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_8
    iget-wide v0, p0, La/yhr0;->h:J

    .line 79
    .line 80
    iget-wide v2, p1, La/yhr0;->h:J

    .line 81
    .line 82
    cmp-long v0, v0, v2

    .line 83
    .line 84
    if-eqz v0, :cond_9

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_9
    iget-object p0, p0, La/yhr0;->i:Ljava/lang/String;

    .line 88
    .line 89
    iget-object p1, p1, La/yhr0;->i:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-nez p0, :cond_a

    .line 96
    .line 97
    :goto_0
    const/4 p0, 0x0

    .line 98
    return p0

    .line 99
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 100
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/yhr0;->a:La/lhr0;

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
    iget-object v2, p0, La/yhr0;->b:La/lmr0;

    .line 11
    .line 12
    invoke-virtual {v2}, La/lmr0;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/yhr0;->c:Ljava/util/Map;

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, La/ohs0;->f(Ljava/util/Map;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/yhr0;->d:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/yhr0;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-boolean v2, p0, La/yhr0;->f:Z

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-wide v2, p0, La/yhr0;->g:J

    .line 43
    .line 44
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-wide v2, p0, La/yhr0;->h:J

    .line 49
    .line 50
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object p0, p0, La/yhr0;->i:Ljava/lang/String;

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TotoActiveTirageState(activeTirageDataState="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/yhr0;->a:La/lhr0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", totoBetTypeModel="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/yhr0;->b:La/lmr0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", selectedOutcomes="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/yhr0;->c:Ljava/util/Map;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", totoName="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/yhr0;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", showMakeBetLoader="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", isScrollToTopRequested="

    .line 49
    .line 50
    const-string v2, ", lottieRetryCountDownMillis="

    .line 51
    .line 52
    iget-boolean v3, p0, La/yhr0;->e:Z

    .line 53
    .line 54
    iget-boolean v4, p0, La/yhr0;->f:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 57
    .line 58
    .line 59
    iget-wide v1, p0, La/yhr0;->g:J

    .line 60
    .line 61
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", untilEndMillisLeft="

    .line 65
    .line 66
    const-string v2, ", backgroundImageUrl="

    .line 67
    .line 68
    iget-wide v3, p0, La/yhr0;->h:J

    .line 69
    .line 70
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v1, ")"

    .line 74
    .line 75
    iget-object p0, p0, La/yhr0;->i:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method
