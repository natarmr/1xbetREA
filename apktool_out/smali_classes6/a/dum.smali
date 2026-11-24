.class public final La/dum;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fum;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:La/c280;

.field public final f:La/c280;

.field public final g:Ljava/lang/String;

.field public final h:Z

.field public final i:Ljava/lang/String;

.field public final j:J


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;JLa/c280;La/c280;Ljava/lang/String;ZLjava/lang/String;J)V
    .locals 0

    .line 1
    invoke-static {p1, p3, p8, p10}, La/cs0;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/dum;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p2, p0, La/dum;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, La/dum;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-wide p4, p0, La/dum;->d:J

    .line 14
    .line 15
    iput-object p6, p0, La/dum;->e:La/c280;

    .line 16
    .line 17
    iput-object p7, p0, La/dum;->f:La/c280;

    .line 18
    .line 19
    iput-object p8, p0, La/dum;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-boolean p9, p0, La/dum;->h:Z

    .line 22
    .line 23
    iput-object p10, p0, La/dum;->i:Ljava/lang/String;

    .line 24
    .line 25
    iput-wide p11, p0, La/dum;->j:J

    .line 26
    .line 27
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
    instance-of v0, p1, La/dum;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/dum;

    .line 12
    .line 13
    iget-object v0, p0, La/dum;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/dum;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-boolean v0, p0, La/dum;->b:Z

    .line 25
    .line 26
    iget-boolean v1, p1, La/dum;->b:Z

    .line 27
    .line 28
    if-eq v0, v1, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget-object v0, p0, La/dum;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v1, p1, La/dum;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-wide v0, p1, La/dum;->d:J

    .line 43
    .line 44
    sget v2, La/y3d;->h:I

    .line 45
    .line 46
    iget-wide v2, p0, La/dum;->d:J

    .line 47
    .line 48
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

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
    iget-object v0, p0, La/dum;->e:La/c280;

    .line 56
    .line 57
    iget-object v1, p1, La/dum;->e:La/c280;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, La/c280;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/dum;->f:La/c280;

    .line 67
    .line 68
    iget-object v1, p1, La/dum;->f:La/c280;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, La/c280;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/dum;->g:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v1, p1, La/dum;->g:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/dum;->h:Z

    .line 89
    .line 90
    iget-boolean v1, p1, La/dum;->h:Z

    .line 91
    .line 92
    if-eq v0, v1, :cond_9

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_9
    iget-object v0, p0, La/dum;->i:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v1, p1, La/dum;->i:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_a

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_a
    iget-wide v0, p0, La/dum;->j:J

    .line 107
    .line 108
    iget-wide p0, p1, La/dum;->j:J

    .line 109
    .line 110
    invoke-static {v0, v1, p0, p1}, La/h2t0;->a(JJ)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-nez p0, :cond_b

    .line 115
    .line 116
    :goto_0
    const/4 p0, 0x0

    .line 117
    return p0

    .line 118
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 119
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/dum;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-boolean v2, p0, La/dum;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/dum;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sget v2, La/y3d;->h:I

    .line 23
    .line 24
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 25
    .line 26
    iget-wide v2, p0, La/dum;->d:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/dum;->e:La/c280;

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, La/hne;->g(La/c280;II)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, La/dum;->f:La/c280;

    .line 39
    .line 40
    invoke-static {v2, v0, v1}, La/hne;->g(La/c280;II)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/dum;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-boolean v2, p0, La/dum;->h:Z

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, La/dum;->i:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-wide v1, p0, La/dum;->j:J

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
    .locals 7

    .line 1
    iget-wide v0, p0, La/dum;->d:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/dum;->j:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", teamOneRedIndicator="

    .line 14
    .line 15
    const-string v3, ", teamOneScore="

    .line 16
    .line 17
    const-string v4, "V3(teamOneName="

    .line 18
    .line 19
    iget-object v5, p0, La/dum;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-boolean v6, p0, La/dum;->b:Z

    .line 22
    .line 23
    invoke-static {v4, v5, v2, v6, v3}, La/brm0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, ", teamOneScoreColor="

    .line 28
    .line 29
    const-string v4, ", teamOneLogo="

    .line 30
    .line 31
    iget-object v5, p0, La/dum;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, v5, v3, v0, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, ", teamTwoLogo="

    .line 37
    .line 38
    const-string v3, ", teamTwoName="

    .line 39
    .line 40
    iget-object v4, p0, La/dum;->e:La/c280;

    .line 41
    .line 42
    iget-object v5, p0, La/dum;->f:La/c280;

    .line 43
    .line 44
    invoke-static {v2, v4, v0, v5, v3}, La/f140;->u(Ljava/lang/StringBuilder;La/c280;Ljava/lang/String;La/c280;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v0, ", teamTwoRedIndicator="

    .line 48
    .line 49
    const-string v3, ", teamTwoScore="

    .line 50
    .line 51
    iget-object v4, p0, La/dum;->g:Ljava/lang/String;

    .line 52
    .line 53
    iget-boolean v5, p0, La/dum;->h:Z

    .line 54
    .line 55
    invoke-static {v4, v0, v3, v2, v5}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, ", teamTwoScoreColor="

    .line 59
    .line 60
    const-string v3, ")"

    .line 61
    .line 62
    iget-object p0, p0, La/dum;->i:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v2, p0, v0, v1, v3}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method
