.class public final La/tpp0;
.super La/ohm0;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Z

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:I

.field public final h:I

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(JJZZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, La/tpp0;->a:J

    .line 11
    .line 12
    iput-wide p3, p0, La/tpp0;->b:J

    .line 13
    .line 14
    iput-boolean p5, p0, La/tpp0;->c:Z

    .line 15
    .line 16
    iput-boolean p6, p0, La/tpp0;->d:Z

    .line 17
    .line 18
    iput-object p7, p0, La/tpp0;->e:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p8, p0, La/tpp0;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput p9, p0, La/tpp0;->g:I

    .line 23
    .line 24
    iput p10, p0, La/tpp0;->h:I

    .line 25
    .line 26
    iput-object p11, p0, La/tpp0;->i:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p12, p0, La/tpp0;->j:Ljava/lang/String;

    .line 29
    .line 30
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
    instance-of v0, p1, La/tpp0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/tpp0;

    .line 11
    .line 12
    iget-wide v0, p0, La/tpp0;->a:J

    .line 13
    .line 14
    iget-wide v2, p1, La/tpp0;->a:J

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget-wide v0, p0, La/tpp0;->b:J

    .line 22
    .line 23
    iget-wide v2, p1, La/tpp0;->b:J

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-boolean v0, p0, La/tpp0;->c:Z

    .line 31
    .line 32
    iget-boolean v1, p1, La/tpp0;->c:Z

    .line 33
    .line 34
    if-eq v0, v1, :cond_4

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_4
    iget-boolean v0, p0, La/tpp0;->d:Z

    .line 38
    .line 39
    iget-boolean v1, p1, La/tpp0;->d:Z

    .line 40
    .line 41
    if-eq v0, v1, :cond_5

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_5
    iget-object v0, p0, La/tpp0;->e:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, p1, La/tpp0;->e:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_6

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_6
    iget-object v0, p0, La/tpp0;->f:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v1, p1, La/tpp0;->f:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_7

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_7
    iget v0, p0, La/tpp0;->g:I

    .line 67
    .line 68
    iget v1, p1, La/tpp0;->g:I

    .line 69
    .line 70
    if-eq v0, v1, :cond_8

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_8
    iget v0, p0, La/tpp0;->h:I

    .line 74
    .line 75
    iget v1, p1, La/tpp0;->h:I

    .line 76
    .line 77
    if-eq v0, v1, :cond_9

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_9
    iget-object v0, p0, La/tpp0;->i:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v1, p1, La/tpp0;->i:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_a

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_a
    iget-object p0, p0, La/tpp0;->j:Ljava/lang/String;

    .line 92
    .line 93
    iget-object p1, p1, La/tpp0;->j:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-nez p0, :cond_b

    .line 100
    .line 101
    :goto_0
    const/4 p0, 0x0

    .line 102
    return p0

    .line 103
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 104
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/tpp0;->a:J

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
    iget-wide v2, p0, La/tpp0;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/tpp0;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/tpp0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/tpp0;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/tpp0;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/tpp0;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, La/tpp0;->h:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/tpp0;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object p0, p0, La/tpp0;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v0

    .line 65
    return p0
.end method

.method public final n()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/tpp0;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public final o()I
    .locals 0

    .line 1
    iget p0, p0, La/tpp0;->g:I

    .line 2
    .line 3
    return p0
.end method

.method public final p()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/tpp0;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final q()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/tpp0;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/tpp0;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final s()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/tpp0;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public final t()I
    .locals 0

    .line 1
    iget p0, p0, La/tpp0;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "SingleTeamsUiModel(teamOneFirstPlayerId="

    .line 2
    .line 3
    const-string v1, ", teamTwoFirstPlayerId="

    .line 4
    .line 5
    iget-wide v2, p0, La/tpp0;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ", teamOneFirstPlayerFavorite="

    .line 12
    .line 13
    iget-wide v2, p0, La/tpp0;->b:J

    .line 14
    .line 15
    iget-boolean v4, p0, La/tpp0;->c:Z

    .line 16
    .line 17
    invoke-static {v2, v3, v1, v0, v4}, La/hne;->t(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 18
    .line 19
    .line 20
    const-string v1, ", teamTwoFirstPlayerFavorite="

    .line 21
    .line 22
    const-string v2, ", teamOneFirstPlayerImageUrl="

    .line 23
    .line 24
    iget-object v3, p0, La/tpp0;->e:Ljava/lang/String;

    .line 25
    .line 26
    iget-boolean v4, p0, La/tpp0;->d:Z

    .line 27
    .line 28
    invoke-static {v1, v2, v3, v0, v4}, La/hne;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 29
    .line 30
    .line 31
    const-string v1, ", teamTwoFirstPlayerImageUrl="

    .line 32
    .line 33
    const-string v2, ", teamOneFirstPlayerFavoriteDrawRes="

    .line 34
    .line 35
    iget v3, p0, La/tpp0;->g:I

    .line 36
    .line 37
    iget-object v4, p0, La/tpp0;->f:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v3, v1, v4, v2, v0}, La/axq;->s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 40
    .line 41
    .line 42
    const-string v1, ", teamTwoFirstPlayerFavoriteDrawRes="

    .line 43
    .line 44
    const-string v2, ", teamOneName="

    .line 45
    .line 46
    iget v3, p0, La/tpp0;->h:I

    .line 47
    .line 48
    iget-object v4, p0, La/tpp0;->i:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v3, v1, v2, v4, v0}, La/w6x;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 51
    .line 52
    .line 53
    const-string v1, ", teamTwoName="

    .line 54
    .line 55
    const-string v2, ")"

    .line 56
    .line 57
    iget-object p0, p0, La/tpp0;->j:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v0, v1, p0, v2}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public final u()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/tpp0;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final v()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/tpp0;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final w()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/tpp0;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
