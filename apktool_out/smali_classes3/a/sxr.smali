.class public final La/sxr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b0s;


# instance fields
.field public final a:J

.field public final b:La/dur;

.field public final c:La/qtr;

.field public final d:La/oxr;

.field public final e:La/pxr;

.field public final f:La/qxr;

.field public final g:La/nxr;

.field public final h:La/lxr;

.field public final i:La/kxr;

.field public final j:La/mxr;


# direct methods
.method public constructor <init>(JLa/dur;La/qtr;La/oxr;La/pxr;La/qxr;La/nxr;La/lxr;La/kxr;La/mxr;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/sxr;->a:J

    .line 5
    .line 6
    iput-object p3, p0, La/sxr;->b:La/dur;

    .line 7
    .line 8
    iput-object p4, p0, La/sxr;->c:La/qtr;

    .line 9
    .line 10
    iput-object p5, p0, La/sxr;->d:La/oxr;

    .line 11
    .line 12
    iput-object p6, p0, La/sxr;->e:La/pxr;

    .line 13
    .line 14
    iput-object p7, p0, La/sxr;->f:La/qxr;

    .line 15
    .line 16
    iput-object p8, p0, La/sxr;->g:La/nxr;

    .line 17
    .line 18
    iput-object p9, p0, La/sxr;->h:La/lxr;

    .line 19
    .line 20
    iput-object p10, p0, La/sxr;->i:La/kxr;

    .line 21
    .line 22
    iput-object p11, p0, La/sxr;->j:La/mxr;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/sxr;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d(Ljava/util/ArrayList;La/p6t0;La/p6t0;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p2, La/sxr;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p3, La/sxr;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    check-cast p2, La/sxr;

    .line 16
    .line 17
    iget-object p0, p2, La/sxr;->d:La/oxr;

    .line 18
    .line 19
    check-cast p3, La/sxr;

    .line 20
    .line 21
    iget-object v0, p3, La/sxr;->d:La/oxr;

    .line 22
    .line 23
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p2, La/sxr;->e:La/pxr;

    .line 27
    .line 28
    iget-object v0, p3, La/sxr;->e:La/pxr;

    .line 29
    .line 30
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p2, La/sxr;->f:La/qxr;

    .line 34
    .line 35
    iget-object v0, p3, La/sxr;->f:La/qxr;

    .line 36
    .line 37
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p2, La/sxr;->g:La/nxr;

    .line 41
    .line 42
    iget-object v0, p3, La/sxr;->g:La/nxr;

    .line 43
    .line 44
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p2, La/sxr;->h:La/lxr;

    .line 48
    .line 49
    iget-object v0, p3, La/sxr;->h:La/lxr;

    .line 50
    .line 51
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p2, La/sxr;->i:La/kxr;

    .line 55
    .line 56
    iget-object v0, p3, La/sxr;->i:La/kxr;

    .line 57
    .line 58
    invoke-static {p1, p0, v0}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p2, La/sxr;->j:La/mxr;

    .line 62
    .line 63
    iget-object p2, p3, La/sxr;->j:La/mxr;

    .line 64
    .line 65
    invoke-static {p1, p0, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    return-void
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
    instance-of v0, p1, La/sxr;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/sxr;

    .line 12
    .line 13
    iget-wide v0, p0, La/sxr;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/sxr;->a:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, La/sxr;->b:La/dur;

    .line 23
    .line 24
    iget-object v1, p1, La/sxr;->b:La/dur;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/dur;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/sxr;->c:La/qtr;

    .line 34
    .line 35
    iget-object v1, p1, La/sxr;->c:La/qtr;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, La/qtr;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/sxr;->d:La/oxr;

    .line 45
    .line 46
    iget-object v1, p1, La/sxr;->d:La/oxr;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, La/oxr;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/sxr;->e:La/pxr;

    .line 56
    .line 57
    iget-object v1, p1, La/sxr;->e:La/pxr;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, La/pxr;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget-object v0, p0, La/sxr;->f:La/qxr;

    .line 67
    .line 68
    iget-object v1, p1, La/sxr;->f:La/qxr;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, La/qxr;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_7

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget-object v0, p0, La/sxr;->g:La/nxr;

    .line 78
    .line 79
    iget-object v1, p1, La/sxr;->g:La/nxr;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, La/nxr;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_8

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_8
    iget-object v0, p0, La/sxr;->h:La/lxr;

    .line 89
    .line 90
    iget-object v1, p1, La/sxr;->h:La/lxr;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, La/lxr;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_9

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_9
    iget-object v0, p0, La/sxr;->i:La/kxr;

    .line 100
    .line 101
    iget-object v1, p1, La/sxr;->i:La/kxr;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, La/kxr;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_a

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_a
    iget-object p0, p0, La/sxr;->j:La/mxr;

    .line 111
    .line 112
    iget-object p1, p1, La/sxr;->j:La/mxr;

    .line 113
    .line 114
    invoke-virtual {p0, p1}, La/mxr;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-nez p0, :cond_b

    .line 119
    .line 120
    :goto_0
    const/4 p0, 0x0

    .line 121
    return p0

    .line 122
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 123
    return p0
.end method

.method public final getHeader()La/dur;
    .locals 0

    .line 1
    iget-object p0, p0, La/sxr;->b:La/dur;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-wide v0, p0, La/sxr;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, La/sxr;->b:La/dur;

    .line 10
    .line 11
    invoke-virtual {v1}, La/dur;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, La/sxr;->c:La/qtr;

    .line 19
    .line 20
    invoke-virtual {v0}, La/qtr;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, La/sxr;->d:La/oxr;

    .line 28
    .line 29
    invoke-virtual {v1}, La/oxr;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    mul-int/lit8 v1, v1, 0x1f

    .line 35
    .line 36
    iget-object v0, p0, La/sxr;->e:La/pxr;

    .line 37
    .line 38
    invoke-virtual {v0}, La/pxr;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v1

    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget-object v1, p0, La/sxr;->f:La/qxr;

    .line 46
    .line 47
    invoke-virtual {v1}, La/qxr;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v1, v0

    .line 52
    mul-int/lit8 v1, v1, 0x1f

    .line 53
    .line 54
    iget-object v0, p0, La/sxr;->g:La/nxr;

    .line 55
    .line 56
    invoke-virtual {v0}, La/nxr;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    add-int/2addr v0, v1

    .line 61
    mul-int/lit8 v0, v0, 0x1f

    .line 62
    .line 63
    iget-object v1, p0, La/sxr;->h:La/lxr;

    .line 64
    .line 65
    invoke-virtual {v1}, La/lxr;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    add-int/2addr v1, v0

    .line 70
    mul-int/lit8 v1, v1, 0x1f

    .line 71
    .line 72
    iget-object v0, p0, La/sxr;->i:La/kxr;

    .line 73
    .line 74
    invoke-virtual {v0}, La/kxr;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    add-int/2addr v0, v1

    .line 79
    mul-int/lit8 v0, v0, 0x1f

    .line 80
    .line 81
    iget-object p0, p0, La/sxr;->j:La/mxr;

    .line 82
    .line 83
    invoke-virtual {p0}, La/mxr;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    add-int/2addr p0, v0

    .line 88
    return p0
.end method

.method public final bridge synthetic o(La/p6t0;La/p6t0;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2}, La/b0s;->o(La/p6t0;La/p6t0;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GameCardType1UiModel(gameId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-wide v1, p0, La/sxr;->a:J

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", header="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/sxr;->b:La/dur;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", footer="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/sxr;->c:La/qtr;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", status="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/sxr;->d:La/oxr;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", teamFirst="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/sxr;->e:La/pxr;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", teamSecond="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/sxr;->f:La/qxr;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", scoreTotal="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/sxr;->g:La/nxr;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", scorePeriod="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, La/sxr;->h:La/lxr;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", scoreGame="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, La/sxr;->i:La/kxr;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", scoreServe="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, La/sxr;->j:La/mxr;

    .line 99
    .line 100
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string p0, ")"

    .line 104
    .line 105
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0
.end method

.method public final w0()La/qtr;
    .locals 0

    .line 1
    iget-object p0, p0, La/sxr;->c:La/qtr;

    .line 2
    .line 3
    return-object p0
.end method
