.class public final La/eoa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hoa0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:I

.field public final l:La/a4x;

.field public final m:Ljava/lang/String;

.field public final n:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;ZZZZILa/a4x;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-static {p14, p1, p2}, La/w6x;->x(La/a4x;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/eoa0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, La/eoa0;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p3, p0, La/eoa0;->c:J

    .line 12
    .line 13
    iput-wide p5, p0, La/eoa0;->d:J

    .line 14
    .line 15
    iput-object p7, p0, La/eoa0;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p8, p0, La/eoa0;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput-boolean p9, p0, La/eoa0;->g:Z

    .line 20
    .line 21
    iput-boolean p10, p0, La/eoa0;->h:Z

    .line 22
    .line 23
    iput-boolean p11, p0, La/eoa0;->i:Z

    .line 24
    .line 25
    iput-boolean p12, p0, La/eoa0;->j:Z

    .line 26
    .line 27
    iput p13, p0, La/eoa0;->k:I

    .line 28
    .line 29
    iput-object p14, p0, La/eoa0;->l:La/a4x;

    .line 30
    .line 31
    move-object p1, p15

    .line 32
    iput-object p1, p0, La/eoa0;->m:Ljava/lang/String;

    .line 33
    .line 34
    move-wide/from16 p1, p16

    .line 35
    .line 36
    iput-wide p1, p0, La/eoa0;->n:J

    .line 37
    .line 38
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
    instance-of v0, p1, La/eoa0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/eoa0;

    .line 12
    .line 13
    iget-object v0, p0, La/eoa0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/eoa0;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/eoa0;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, La/eoa0;->b:Ljava/lang/String;

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
    iget-wide v0, p1, La/eoa0;->c:J

    .line 38
    .line 39
    sget v2, La/y3d;->h:I

    .line 40
    .line 41
    iget-wide v2, p0, La/eoa0;->c:J

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
    iget-wide v0, p0, La/eoa0;->d:J

    .line 52
    .line 53
    iget-wide v2, p1, La/eoa0;->d:J

    .line 54
    .line 55
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

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
    iget-object v0, p0, La/eoa0;->e:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v1, p1, La/eoa0;->e:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/eoa0;->f:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v1, p1, La/eoa0;->f:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/eoa0;->g:Z

    .line 85
    .line 86
    iget-boolean v1, p1, La/eoa0;->g:Z

    .line 87
    .line 88
    if-eq v0, v1, :cond_8

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_8
    iget-boolean v0, p0, La/eoa0;->h:Z

    .line 92
    .line 93
    iget-boolean v1, p1, La/eoa0;->h:Z

    .line 94
    .line 95
    if-eq v0, v1, :cond_9

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_9
    iget-boolean v0, p0, La/eoa0;->i:Z

    .line 99
    .line 100
    iget-boolean v1, p1, La/eoa0;->i:Z

    .line 101
    .line 102
    if-eq v0, v1, :cond_a

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_a
    iget-boolean v0, p0, La/eoa0;->j:Z

    .line 106
    .line 107
    iget-boolean v1, p1, La/eoa0;->j:Z

    .line 108
    .line 109
    if-eq v0, v1, :cond_b

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_b
    iget v0, p0, La/eoa0;->k:I

    .line 113
    .line 114
    iget v1, p1, La/eoa0;->k:I

    .line 115
    .line 116
    if-eq v0, v1, :cond_c

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_c
    iget-object v0, p0, La/eoa0;->l:La/a4x;

    .line 120
    .line 121
    iget-object v1, p1, La/eoa0;->l:La/a4x;

    .line 122
    .line 123
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_d

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_d
    iget-object v0, p0, La/eoa0;->m:Ljava/lang/String;

    .line 131
    .line 132
    iget-object v1, p1, La/eoa0;->m:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-nez v0, :cond_e

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_e
    iget-wide v0, p0, La/eoa0;->n:J

    .line 142
    .line 143
    iget-wide p0, p1, La/eoa0;->n:J

    .line 144
    .line 145
    invoke-static {v0, v1, p0, p1}, La/h2t0;->a(JJ)Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-nez p0, :cond_f

    .line 150
    .line 151
    :goto_0
    const/4 p0, 0x0

    .line 152
    return p0

    .line 153
    :cond_f
    :goto_1
    const/4 p0, 0x1

    .line 154
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/eoa0;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/eoa0;->b:Ljava/lang/String;

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
    iget-wide v2, p0, La/eoa0;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-wide v2, p0, La/eoa0;->d:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/eoa0;->e:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, La/eoa0;->f:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-boolean v2, p0, La/eoa0;->g:Z

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-boolean v2, p0, La/eoa0;->h:Z

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean v2, p0, La/eoa0;->i:Z

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-boolean v2, p0, La/eoa0;->j:Z

    .line 63
    .line 64
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget v2, p0, La/eoa0;->k:I

    .line 69
    .line 70
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-object v2, p0, La/eoa0;->l:La/a4x;

    .line 75
    .line 76
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object v2, p0, La/eoa0;->m:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-wide v1, p0, La/eoa0;->n:J

    .line 87
    .line 88
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    add-int/2addr p0, v0

    .line 93
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-wide v0, p0, La/eoa0;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/eoa0;->d:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/eoa0;->n:J

    .line 14
    .line 15
    invoke-static {v2, v3}, La/y3d;->i(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, ", scoreTwo="

    .line 20
    .line 21
    const-string v4, ", scoreOneTextColor="

    .line 22
    .line 23
    const-string v5, "PointByPointsCommonUiModel(scoreOne="

    .line 24
    .line 25
    iget-object v6, p0, La/eoa0;->a:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v7, p0, La/eoa0;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v5, v6, v3, v7, v4}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const-string v4, ", scoreTwoTextColor="

    .line 34
    .line 35
    const-string v5, ", subScoreOne="

    .line 36
    .line 37
    invoke-static {v3, v0, v4, v1, v5}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v0, ", subScoreTwo="

    .line 41
    .line 42
    const-string v1, ", teamOneServing="

    .line 43
    .line 44
    iget-object v4, p0, La/eoa0;->e:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v5, p0, La/eoa0;->f:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v3, v4, v0, v5, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, ", teamTwoServing="

    .line 52
    .line 53
    const-string v1, ", teamOneLoseServing="

    .line 54
    .line 55
    iget-boolean v4, p0, La/eoa0;->g:Z

    .line 56
    .line 57
    iget-boolean v5, p0, La/eoa0;->h:Z

    .line 58
    .line 59
    invoke-static {v0, v1, v3, v4, v5}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 60
    .line 61
    .line 62
    const-string v0, ", teamTwoLoseServing="

    .line 63
    .line 64
    const-string v1, ", loseServingTextResId="

    .line 65
    .line 66
    iget-boolean v4, p0, La/eoa0;->i:Z

    .line 67
    .line 68
    iget-boolean v5, p0, La/eoa0;->j:Z

    .line 69
    .line 70
    invoke-static {v0, v1, v3, v4, v5}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 71
    .line 72
    .line 73
    iget v0, p0, La/eoa0;->k:I

    .line 74
    .line 75
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v0, ", points="

    .line 79
    .line 80
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, La/eoa0;->l:La/a4x;

    .line 84
    .line 85
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v0, ", sportImageUrl="

    .line 89
    .line 90
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v0, ", sportImageColor="

    .line 94
    .line 95
    const-string v1, ")"

    .line 96
    .line 97
    iget-object p0, p0, La/eoa0;->m:Ljava/lang/String;

    .line 98
    .line 99
    invoke-static {v3, p0, v0, v2, v1}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method
