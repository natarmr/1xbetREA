.class public final La/wkm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/clm0;


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

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;JLa/c280;La/c280;Ljava/lang/String;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p3, p8, p10, p13}, La/ohs0;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/wkm0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p2, p0, La/wkm0;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, La/wkm0;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-wide p4, p0, La/wkm0;->d:J

    .line 14
    .line 15
    iput-object p6, p0, La/wkm0;->e:La/c280;

    .line 16
    .line 17
    iput-object p7, p0, La/wkm0;->f:La/c280;

    .line 18
    .line 19
    iput-object p8, p0, La/wkm0;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-boolean p9, p0, La/wkm0;->h:Z

    .line 22
    .line 23
    iput-object p10, p0, La/wkm0;->i:Ljava/lang/String;

    .line 24
    .line 25
    iput-wide p11, p0, La/wkm0;->j:J

    .line 26
    .line 27
    iput-object p13, p0, La/wkm0;->k:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p14, p0, La/wkm0;->l:Ljava/lang/String;

    .line 30
    .line 31
    move-object p1, p15

    .line 32
    iput-object p1, p0, La/wkm0;->m:Ljava/lang/String;

    .line 33
    .line 34
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
    instance-of v0, p1, La/wkm0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/wkm0;

    .line 12
    .line 13
    iget-object v0, p0, La/wkm0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/wkm0;->a:Ljava/lang/String;

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
    iget-boolean v0, p0, La/wkm0;->b:Z

    .line 26
    .line 27
    iget-boolean v1, p1, La/wkm0;->b:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/wkm0;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/wkm0;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget-wide v0, p1, La/wkm0;->d:J

    .line 46
    .line 47
    sget v2, La/y3d;->h:I

    .line 48
    .line 49
    iget-wide v2, p0, La/wkm0;->d:J

    .line 50
    .line 51
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    iget-object v0, p0, La/wkm0;->e:La/c280;

    .line 59
    .line 60
    iget-object v1, p1, La/wkm0;->e:La/c280;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, La/c280;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_6
    iget-object v0, p0, La/wkm0;->f:La/c280;

    .line 70
    .line 71
    iget-object v1, p1, La/wkm0;->f:La/c280;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, La/c280;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_7

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_7
    iget-object v0, p0, La/wkm0;->g:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v1, p1, La/wkm0;->g:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_8

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_8
    iget-boolean v0, p0, La/wkm0;->h:Z

    .line 92
    .line 93
    iget-boolean v1, p1, La/wkm0;->h:Z

    .line 94
    .line 95
    if-eq v0, v1, :cond_9

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_9
    iget-object v0, p0, La/wkm0;->i:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v1, p1, La/wkm0;->i:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_a

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_a
    iget-wide v0, p0, La/wkm0;->j:J

    .line 110
    .line 111
    iget-wide v2, p1, La/wkm0;->j:J

    .line 112
    .line 113
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_b

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_b
    iget-object v0, p0, La/wkm0;->k:Ljava/lang/String;

    .line 121
    .line 122
    iget-object v1, p1, La/wkm0;->k:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_c

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_c
    iget-object v0, p0, La/wkm0;->l:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v1, p1, La/wkm0;->l:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-nez v0, :cond_d

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_d
    iget-object p0, p0, La/wkm0;->m:Ljava/lang/String;

    .line 143
    .line 144
    iget-object p1, p1, La/wkm0;->m:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-nez p0, :cond_e

    .line 151
    .line 152
    :goto_0
    const/4 p0, 0x0

    .line 153
    return p0

    .line 154
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 155
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/wkm0;->a:Ljava/lang/String;

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
    iget-boolean v2, p0, La/wkm0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/wkm0;->c:Ljava/lang/String;

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
    iget-wide v2, p0, La/wkm0;->d:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/wkm0;->e:La/c280;

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, La/hne;->g(La/c280;II)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, La/wkm0;->f:La/c280;

    .line 39
    .line 40
    invoke-static {v2, v0, v1}, La/hne;->g(La/c280;II)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/wkm0;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-boolean v2, p0, La/wkm0;->h:Z

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, La/wkm0;->i:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-wide v2, p0, La/wkm0;->j:J

    .line 63
    .line 64
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v2, p0, La/wkm0;->k:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-object v2, p0, La/wkm0;->l:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object p0, p0, La/wkm0;->m:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    add-int/2addr p0, v0

    .line 87
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-wide v0, p0, La/wkm0;->d:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/wkm0;->j:J

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
    const-string v4, "Cricket(teamOneName="

    .line 18
    .line 19
    iget-object v5, p0, La/wkm0;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-boolean v6, p0, La/wkm0;->b:Z

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
    iget-object v5, p0, La/wkm0;->c:Ljava/lang/String;

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
    iget-object v4, p0, La/wkm0;->e:La/c280;

    .line 41
    .line 42
    iget-object v5, p0, La/wkm0;->f:La/c280;

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
    iget-object v4, p0, La/wkm0;->g:Ljava/lang/String;

    .line 52
    .line 53
    iget-boolean v5, p0, La/wkm0;->h:Z

    .line 54
    .line 55
    invoke-static {v4, v0, v3, v2, v5}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, ", teamTwoScoreColor="

    .line 59
    .line 60
    const-string v3, ", infoLabel="

    .line 61
    .line 62
    iget-object v4, p0, La/wkm0;->i:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v2, v4, v0, v1, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v0, ", seedingLeft="

    .line 68
    .line 69
    const-string v1, ", seedingRight="

    .line 70
    .line 71
    iget-object v3, p0, La/wkm0;->k:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v4, p0, La/wkm0;->l:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v2, v3, v0, v4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v0, ")"

    .line 79
    .line 80
    iget-object p0, p0, La/wkm0;->m:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v2, p0, v0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method
