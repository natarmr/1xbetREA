.class public final La/hmm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nmm0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:La/c280;

.field public final e:La/c280;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:La/qgm;

.field public final m:La/qgm;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLa/c280;La/c280;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/qgm;La/qgm;)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p7, p8, p11}, La/ohs0;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/hmm0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, La/hmm0;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p3, p0, La/hmm0;->c:J

    .line 12
    .line 13
    iput-object p5, p0, La/hmm0;->d:La/c280;

    .line 14
    .line 15
    iput-object p6, p0, La/hmm0;->e:La/c280;

    .line 16
    .line 17
    iput-object p7, p0, La/hmm0;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p8, p0, La/hmm0;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-wide p9, p0, La/hmm0;->h:J

    .line 22
    .line 23
    iput-object p11, p0, La/hmm0;->i:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p12, p0, La/hmm0;->j:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p13, p0, La/hmm0;->k:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p14, p0, La/hmm0;->l:La/qgm;

    .line 30
    .line 31
    iput-object p15, p0, La/hmm0;->m:La/qgm;

    .line 32
    .line 33
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
    instance-of v0, p1, La/hmm0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/hmm0;

    .line 12
    .line 13
    iget-object v0, p0, La/hmm0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/hmm0;->a:Ljava/lang/String;

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
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/hmm0;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, La/hmm0;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-wide v0, p1, La/hmm0;->c:J

    .line 38
    .line 39
    sget v2, La/y3d;->h:I

    .line 40
    .line 41
    iget-wide v2, p0, La/hmm0;->c:J

    .line 42
    .line 43
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_4
    iget-object v0, p0, La/hmm0;->d:La/c280;

    .line 52
    .line 53
    iget-object v1, p1, La/hmm0;->d:La/c280;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, La/c280;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_5

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_5
    iget-object v0, p0, La/hmm0;->e:La/c280;

    .line 63
    .line 64
    iget-object v1, p1, La/hmm0;->e:La/c280;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, La/c280;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_6

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_6
    iget-object v0, p0, La/hmm0;->f:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v1, p1, La/hmm0;->f:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_7

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_7
    iget-object v0, p0, La/hmm0;->g:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v1, p1, La/hmm0;->g:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_8

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_8
    iget-wide v0, p0, La/hmm0;->h:J

    .line 96
    .line 97
    iget-wide v2, p1, La/hmm0;->h:J

    .line 98
    .line 99
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_9

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_9
    iget-object v0, p0, La/hmm0;->i:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v1, p1, La/hmm0;->i:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_a

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_a
    iget-object v0, p0, La/hmm0;->j:Ljava/lang/String;

    .line 118
    .line 119
    iget-object v1, p1, La/hmm0;->j:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_b

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_b
    iget-object v0, p0, La/hmm0;->k:Ljava/lang/String;

    .line 129
    .line 130
    iget-object v1, p1, La/hmm0;->k:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_c

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_c
    iget-object v0, p0, La/hmm0;->l:La/qgm;

    .line 140
    .line 141
    iget-object v1, p1, La/hmm0;->l:La/qgm;

    .line 142
    .line 143
    invoke-virtual {v0, v1}, La/qgm;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_d

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_d
    iget-object p0, p0, La/hmm0;->m:La/qgm;

    .line 151
    .line 152
    iget-object p1, p1, La/hmm0;->m:La/qgm;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, La/qgm;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    if-nez p0, :cond_e

    .line 159
    .line 160
    :goto_0
    const/4 p0, 0x0

    .line 161
    return p0

    .line 162
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 163
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/hmm0;->a:Ljava/lang/String;

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
    const/4 v2, 0x0

    .line 11
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v3, p0, La/hmm0;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v1, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sget v3, La/y3d;->h:I

    .line 22
    .line 23
    sget-object v3, La/h2t0;->b:La/g2t0;

    .line 24
    .line 25
    iget-wide v3, p0, La/hmm0;->c:J

    .line 26
    .line 27
    invoke-static {v0, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v3, p0, La/hmm0;->d:La/c280;

    .line 32
    .line 33
    invoke-static {v3, v0, v1}, La/hne;->g(La/c280;II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v3, p0, La/hmm0;->e:La/c280;

    .line 38
    .line 39
    invoke-static {v3, v0, v1}, La/hne;->g(La/c280;II)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-object v3, p0, La/hmm0;->f:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v1, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget-object v2, p0, La/hmm0;->g:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-wide v2, p0, La/hmm0;->h:J

    .line 60
    .line 61
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget-object v2, p0, La/hmm0;->i:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object v2, p0, La/hmm0;->j:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-object v2, p0, La/hmm0;->k:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-object v2, p0, La/hmm0;->l:La/qgm;

    .line 84
    .line 85
    iget-object v2, v2, La/qgm;->a:La/zgm;

    .line 86
    .line 87
    invoke-virtual {v2}, La/zgm;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    add-int/2addr v2, v0

    .line 92
    mul-int/2addr v2, v1

    .line 93
    iget-object p0, p0, La/hmm0;->m:La/qgm;

    .line 94
    .line 95
    iget-object p0, p0, La/qgm;->a:La/zgm;

    .line 96
    .line 97
    invoke-virtual {p0}, La/zgm;->hashCode()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    add-int/2addr p0, v2

    .line 102
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-wide v0, p0, La/hmm0;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/hmm0;->h:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", teamOneRedIndicator=false, teamOneScore="

    .line 14
    .line 15
    const-string v3, ", teamOneScoreColor="

    .line 16
    .line 17
    const-string v4, "Cricket(teamOneName="

    .line 18
    .line 19
    iget-object v5, p0, La/hmm0;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v6, p0, La/hmm0;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v4, v5, v2, v6, v3}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ", teamOneLogo="

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, La/hmm0;->d:La/c280;

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, ", teamTwoLogo="

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, La/hmm0;->e:La/c280;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v0, ", teamTwoName="

    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, La/hmm0;->f:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ", teamTwoRedIndicator=false, teamTwoScore="

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v0, ", teamTwoScoreColor="

    .line 66
    .line 67
    const-string v3, ", infoLabel="

    .line 68
    .line 69
    iget-object v4, p0, La/hmm0;->g:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v2, v4, v0, v1, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string v0, ", seedingLeft="

    .line 75
    .line 76
    const-string v1, ", seedingRight="

    .line 77
    .line 78
    iget-object v3, p0, La/hmm0;->i:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v4, p0, La/hmm0;->j:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v2, v3, v0, v4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, La/hmm0;->k:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v0, ", startResultIndicator="

    .line 91
    .line 92
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, La/hmm0;->l:La/qgm;

    .line 96
    .line 97
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v0, ", endResultIndicator="

    .line 101
    .line 102
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, La/hmm0;->m:La/qgm;

    .line 106
    .line 107
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p0, ")"

    .line 111
    .line 112
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0
.end method
