.class public final La/ttm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/d280;

.field public final b:La/d280;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:J

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:La/jwm;

.field public final j:La/jwm;

.field public final k:La/jwm;


# direct methods
.method public constructor <init>(La/d280;La/d280;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLa/jwm;La/jwm;La/jwm;)V
    .locals 0

    .line 1
    invoke-static {p3, p4, p7, p8}, La/cs0;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ttm;->a:La/d280;

    .line 8
    .line 9
    iput-object p2, p0, La/ttm;->b:La/d280;

    .line 10
    .line 11
    iput-object p3, p0, La/ttm;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, La/ttm;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-wide p5, p0, La/ttm;->e:J

    .line 16
    .line 17
    iput-object p7, p0, La/ttm;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p8, p0, La/ttm;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-wide p9, p0, La/ttm;->h:J

    .line 22
    .line 23
    iput-object p11, p0, La/ttm;->i:La/jwm;

    .line 24
    .line 25
    iput-object p12, p0, La/ttm;->j:La/jwm;

    .line 26
    .line 27
    iput-object p13, p0, La/ttm;->k:La/jwm;

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
    instance-of v0, p1, La/ttm;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/ttm;

    .line 12
    .line 13
    iget-object v0, p0, La/ttm;->a:La/d280;

    .line 14
    .line 15
    iget-object v1, p1, La/ttm;->a:La/d280;

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
    iget-object v0, p0, La/ttm;->b:La/d280;

    .line 26
    .line 27
    iget-object v1, p1, La/ttm;->b:La/d280;

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
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-object v0, p0, La/ttm;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, La/ttm;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iget-object v0, p0, La/ttm;->d:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v1, p1, La/ttm;->d:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_5

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_5
    iget-wide v0, p1, La/ttm;->e:J

    .line 60
    .line 61
    sget v2, La/y3d;->h:I

    .line 62
    .line 63
    iget-wide v2, p0, La/ttm;->e:J

    .line 64
    .line 65
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_6

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_6
    iget-object v0, p0, La/ttm;->f:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v1, p1, La/ttm;->f:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_7

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_7
    iget-object v0, p0, La/ttm;->g:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v1, p1, La/ttm;->g:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_8

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_8
    iget-wide v0, p0, La/ttm;->h:J

    .line 95
    .line 96
    iget-wide v2, p1, La/ttm;->h:J

    .line 97
    .line 98
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_9

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_9
    iget-object v0, p0, La/ttm;->i:La/jwm;

    .line 106
    .line 107
    iget-object v1, p1, La/ttm;->i:La/jwm;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, La/jwm;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_a

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_a
    iget-object v0, p0, La/ttm;->j:La/jwm;

    .line 117
    .line 118
    iget-object v1, p1, La/ttm;->j:La/jwm;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, La/jwm;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_b

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_b
    iget-object p0, p0, La/ttm;->k:La/jwm;

    .line 128
    .line 129
    iget-object p1, p1, La/ttm;->k:La/jwm;

    .line 130
    .line 131
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-nez p0, :cond_c

    .line 136
    .line 137
    :goto_0
    const/4 p0, 0x0

    .line 138
    return p0

    .line 139
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 140
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/ttm;->a:La/d280;

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
    iget-object v2, p0, La/ttm;->b:La/d280;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->e(La/d280;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/ttm;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/ttm;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    sget v2, La/y3d;->h:I

    .line 29
    .line 30
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 31
    .line 32
    iget-wide v2, p0, La/ttm;->e:J

    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, La/ttm;->f:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/ttm;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-wide v2, p0, La/ttm;->h:J

    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, La/ttm;->i:La/jwm;

    .line 57
    .line 58
    invoke-static {v2, v0, v1}, La/b1j;->d(La/jwm;II)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v2, p0, La/ttm;->j:La/jwm;

    .line 63
    .line 64
    invoke-static {v2, v0, v1}, La/b1j;->d(La/jwm;II)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object p0, p0, La/ttm;->k:La/jwm;

    .line 69
    .line 70
    if-nez p0, :cond_0

    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    invoke-virtual {p0}, La/jwm;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    :goto_0
    add-int/2addr v0, p0

    .line 79
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-wide v0, p0, La/ttm;->e:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/ttm;->h:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "Default(teamOneLogo="

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, La/ttm;->a:La/d280;

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v3, ", teamTwoLogo="

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v3, p0, La/ttm;->b:La/d280;

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v3, ", teamOneName="

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v3, ", teamOneScore="

    .line 41
    .line 42
    const-string v4, ", teamOneScoreColor="

    .line 43
    .line 44
    iget-object v5, p0, La/ttm;->c:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v6, p0, La/ttm;->d:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v2, v5, v3, v6, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v3, ", teamTwoName="

    .line 52
    .line 53
    const-string v4, ", teamTwoScore="

    .line 54
    .line 55
    iget-object v5, p0, La/ttm;->f:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v2, v0, v3, v5, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string v0, ", teamTwoScoreColor="

    .line 61
    .line 62
    const-string v3, ", infoOne="

    .line 63
    .line 64
    iget-object v4, p0, La/ttm;->g:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v2, v4, v0, v1, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string v0, ", infoTwo="

    .line 70
    .line 71
    const-string v1, ", infoThree="

    .line 72
    .line 73
    iget-object v3, p0, La/ttm;->i:La/jwm;

    .line 74
    .line 75
    iget-object v4, p0, La/ttm;->j:La/jwm;

    .line 76
    .line 77
    invoke-static {v2, v3, v0, v4, v1}, La/b1j;->A(Ljava/lang/StringBuilder;La/jwm;Ljava/lang/String;La/jwm;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, La/ttm;->k:La/jwm;

    .line 81
    .line 82
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p0, ")"

    .line 86
    .line 87
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method
