.class public final La/xls;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yls;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:I

.field public final k:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 0

    .line 1
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/xls;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, La/xls;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p3, p0, La/xls;->c:J

    .line 12
    .line 13
    iput-object p5, p0, La/xls;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p6, p0, La/xls;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-wide p7, p0, La/xls;->f:J

    .line 18
    .line 19
    iput-object p9, p0, La/xls;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p10, p0, La/xls;->h:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p11, p0, La/xls;->i:Ljava/lang/String;

    .line 24
    .line 25
    iput p12, p0, La/xls;->j:I

    .line 26
    .line 27
    iput-boolean p13, p0, La/xls;->k:Z

    .line 28
    .line 29
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
    instance-of v0, p1, La/xls;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/xls;

    .line 12
    .line 13
    iget-object v0, p0, La/xls;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/xls;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/xls;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, La/xls;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    iget-wide v0, p1, La/xls;->c:J

    .line 37
    .line 38
    sget v2, La/y3d;->h:I

    .line 39
    .line 40
    iget-wide v2, p0, La/xls;->c:J

    .line 41
    .line 42
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_4

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    iget-object v0, p0, La/xls;->d:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v1, p1, La/xls;->d:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    iget-object v0, p0, La/xls;->e:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v1, p1, La/xls;->e:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_6

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_6
    iget-wide v0, p0, La/xls;->f:J

    .line 72
    .line 73
    iget-wide v2, p1, La/xls;->f:J

    .line 74
    .line 75
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_7

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_7
    iget-object v0, p0, La/xls;->g:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v1, p1, La/xls;->g:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_8

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_8
    iget-object v0, p0, La/xls;->h:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v1, p1, La/xls;->h:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_9

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_9
    iget-object v0, p0, La/xls;->i:Ljava/lang/String;

    .line 105
    .line 106
    iget-object v1, p1, La/xls;->i:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_a

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_a
    iget v0, p0, La/xls;->j:I

    .line 116
    .line 117
    iget v1, p1, La/xls;->j:I

    .line 118
    .line 119
    if-eq v0, v1, :cond_b

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_b
    iget-boolean p0, p0, La/xls;->k:Z

    .line 123
    .line 124
    iget-boolean p1, p1, La/xls;->k:Z

    .line 125
    .line 126
    if-eq p0, p1, :cond_c

    .line 127
    .line 128
    :goto_0
    const/4 p0, 0x0

    .line 129
    return p0

    .line 130
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 131
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/xls;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/xls;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget v2, La/y3d;->h:I

    .line 17
    .line 18
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 19
    .line 20
    iget-wide v2, p0, La/xls;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, La/xls;->d:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/xls;->e:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-wide v2, p0, La/xls;->f:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/xls;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, La/xls;->h:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, La/xls;->i:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iget v2, p0, La/xls;->j:I

    .line 68
    .line 69
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget-boolean p0, p0, La/xls;->k:Z

    .line 74
    .line 75
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    add-int/2addr p0, v0

    .line 80
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-wide v0, p0, La/xls;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/xls;->f:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", firstTeamWinText="

    .line 14
    .line 15
    const-string v3, ", firstTeamWinColor="

    .line 16
    .line 17
    const-string v4, "PreviousMapUiModel(firstTeamImage="

    .line 18
    .line 19
    iget-object v5, p0, La/xls;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v6, p0, La/xls;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v4, v5, v2, v6, v3}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, ", secondTeamImage="

    .line 28
    .line 29
    const-string v4, ", secondTeamWinText="

    .line 30
    .line 31
    iget-object v5, p0, La/xls;->d:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, v0, v3, v5, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, ", secondTeamWinColor="

    .line 37
    .line 38
    const-string v3, ", backgroundImage="

    .line 39
    .line 40
    iget-object v4, p0, La/xls;->e:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v2, v4, v0, v1, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const-string v0, ", mapName="

    .line 46
    .line 47
    const-string v1, ", score="

    .line 48
    .line 49
    iget-object v3, p0, La/xls;->g:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v4, p0, La/xls;->h:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v2, v3, v0, v4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v0, ", needPaddingItem=false, numberOfMap="

    .line 57
    .line 58
    const-string v1, ", supportRtl="

    .line 59
    .line 60
    iget v3, p0, La/xls;->j:I

    .line 61
    .line 62
    iget-object v4, p0, La/xls;->i:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v3, v4, v0, v1, v2}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 65
    .line 66
    .line 67
    const-string v0, ")"

    .line 68
    .line 69
    iget-boolean p0, p0, La/xls;->k:Z

    .line 70
    .line 71
    invoke-static {v2, p0, v0}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method
