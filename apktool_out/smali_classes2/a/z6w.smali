.class public final La/z6w;
.super La/ipm0;
.source "SourceFile"


# instance fields
.field public final a:La/sba0;

.field public final b:La/huo0;

.field public final c:La/suo0;

.field public final d:Ljava/util/Date;

.field public final e:Ljava/lang/String;

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:La/wuo0;

.field public final i:La/tba0;

.field public final j:D


# direct methods
.method public constructor <init>(La/sba0;La/huo0;La/suo0;Ljava/util/Date;Ljava/lang/String;JLjava/lang/String;La/wuo0;La/tba0;D)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z6w;->a:La/sba0;

    .line 5
    .line 6
    iput-object p2, p0, La/z6w;->b:La/huo0;

    .line 7
    .line 8
    iput-object p3, p0, La/z6w;->c:La/suo0;

    .line 9
    .line 10
    iput-object p4, p0, La/z6w;->d:Ljava/util/Date;

    .line 11
    .line 12
    iput-object p5, p0, La/z6w;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p6, p0, La/z6w;->f:J

    .line 15
    .line 16
    iput-object p8, p0, La/z6w;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p9, p0, La/z6w;->h:La/wuo0;

    .line 19
    .line 20
    iput-object p10, p0, La/z6w;->i:La/tba0;

    .line 21
    .line 22
    iput-wide p11, p0, La/z6w;->j:D

    .line 23
    .line 24
    return-void
.end method


# virtual methods
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
    instance-of v0, p1, La/z6w;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/z6w;

    .line 12
    .line 13
    iget-object v0, p0, La/z6w;->a:La/sba0;

    .line 14
    .line 15
    iget-object v1, p1, La/z6w;->a:La/sba0;

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    iget-object v0, p0, La/z6w;->b:La/huo0;

    .line 21
    .line 22
    iget-object v1, p1, La/z6w;->b:La/huo0;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-object v0, p0, La/z6w;->c:La/suo0;

    .line 32
    .line 33
    iget-object v1, p1, La/z6w;->c:La/suo0;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_4

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_4
    iget-object v0, p0, La/z6w;->d:Ljava/util/Date;

    .line 43
    .line 44
    iget-object v1, p1, La/z6w;->d:Ljava/util/Date;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    iget-object v0, p0, La/z6w;->e:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v1, p1, La/z6w;->e:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_6

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    iget-wide v0, p0, La/z6w;->f:J

    .line 65
    .line 66
    iget-wide v2, p1, La/z6w;->f:J

    .line 67
    .line 68
    cmp-long v0, v0, v2

    .line 69
    .line 70
    if-eqz v0, :cond_7

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    iget-object v0, p0, La/z6w;->g:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v1, p1, La/z6w;->g:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_8

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_8
    iget-object v0, p0, La/z6w;->h:La/wuo0;

    .line 85
    .line 86
    iget-object v1, p1, La/z6w;->h:La/wuo0;

    .line 87
    .line 88
    if-eq v0, v1, :cond_9

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_9
    iget-object v0, p0, La/z6w;->i:La/tba0;

    .line 92
    .line 93
    iget-object v1, p1, La/z6w;->i:La/tba0;

    .line 94
    .line 95
    if-eq v0, v1, :cond_a

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_a
    iget-wide v0, p0, La/z6w;->j:D

    .line 99
    .line 100
    iget-wide p0, p1, La/z6w;->j:D

    .line 101
    .line 102
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Double;->compare(DD)I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_b

    .line 107
    .line 108
    :goto_0
    const/4 p0, 0x0

    .line 109
    return p0

    .line 110
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 111
    return p0
.end method

.method public final h()La/huo0;
    .locals 0

    .line 1
    iget-object p0, p0, La/z6w;->b:La/huo0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/z6w;->a:La/sba0;

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
    iget-object v2, p0, La/z6w;->b:La/huo0;

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
    iget-object v0, p0, La/z6w;->c:La/suo0;

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
    iget-object v2, p0, La/z6w;->d:Ljava/util/Date;

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, La/brm0;->i(Ljava/util/Date;II)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/z6w;->e:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-wide v2, p0, La/z6w;->f:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/z6w;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, La/z6w;->h:La/wuo0;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    add-int/2addr v2, v0

    .line 57
    mul-int/2addr v2, v1

    .line 58
    iget-object v0, p0, La/z6w;->i:La/tba0;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    add-int/2addr v0, v2

    .line 65
    mul-int/2addr v0, v1

    .line 66
    iget-wide v1, p0, La/z6w;->j:D

    .line 67
    .line 68
    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    add-int/2addr p0, v0

    .line 73
    return p0
.end method

.method public final j()La/sba0;
    .locals 0

    .line 1
    iget-object p0, p0, La/z6w;->a:La/sba0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()La/suo0;
    .locals 0

    .line 1
    iget-object p0, p0, La/z6w;->c:La/suo0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "HistoryTaskModel(kind="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/z6w;->a:La/sba0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", condition="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/z6w;->b:La/huo0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", prize="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/z6w;->c:La/suo0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", dtPlayerStart="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/z6w;->d:Ljava/util/Date;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", dtPlayerCompleted="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", id="

    .line 49
    .line 50
    iget-wide v2, p0, La/z6w;->f:J

    .line 51
    .line 52
    iget-object v4, p0, La/z6w;->e:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v2, v3, v4, v1}, Lc;->i(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v1, ", name="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, La/z6w;->g:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v1, ", status="

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, La/z6w;->h:La/wuo0;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", type="

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, La/z6w;->i:La/tba0;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, ", percentCompleted="

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ")"

    .line 93
    .line 94
    iget-wide v2, p0, La/z6w;->j:D

    .line 95
    .line 96
    invoke-static {v0, v2, v3, v1}, La/axq;->l(Ljava/lang/StringBuilder;DLjava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0
.end method
