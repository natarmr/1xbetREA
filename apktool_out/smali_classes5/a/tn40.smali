.class public final La/tn40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;

.field public final b:La/trz;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:La/qrz;

.field public final i:J

.field public final j:J

.field public final k:J

.field public final l:Ljava/lang/String;

.field public final m:Z

.field public final n:Ljava/lang/String;

.field public final o:J

.field public final p:Ljava/util/List;

.field public final q:Z


# direct methods
.method public constructor <init>(Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;La/trz;Ljava/lang/String;Ljava/lang/String;ZZZLa/qrz;JJJLjava/lang/String;ZLjava/lang/String;JLjava/util/List;Z)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p20 .. p20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/tn40;->a:Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;

    .line 14
    .line 15
    iput-object p2, p0, La/tn40;->b:La/trz;

    .line 16
    .line 17
    iput-object p3, p0, La/tn40;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p4, p0, La/tn40;->d:Ljava/lang/String;

    .line 20
    .line 21
    iput-boolean p5, p0, La/tn40;->e:Z

    .line 22
    .line 23
    iput-boolean p6, p0, La/tn40;->f:Z

    .line 24
    .line 25
    iput-boolean p7, p0, La/tn40;->g:Z

    .line 26
    .line 27
    iput-object p8, p0, La/tn40;->h:La/qrz;

    .line 28
    .line 29
    iput-wide p9, p0, La/tn40;->i:J

    .line 30
    .line 31
    iput-wide p11, p0, La/tn40;->j:J

    .line 32
    .line 33
    iput-wide p13, p0, La/tn40;->k:J

    .line 34
    .line 35
    iput-object p15, p0, La/tn40;->l:Ljava/lang/String;

    .line 36
    .line 37
    move/from16 p1, p16

    .line 38
    .line 39
    iput-boolean p1, p0, La/tn40;->m:Z

    .line 40
    .line 41
    move-object/from16 p1, p17

    .line 42
    .line 43
    iput-object p1, p0, La/tn40;->n:Ljava/lang/String;

    .line 44
    .line 45
    move-wide/from16 p1, p18

    .line 46
    .line 47
    iput-wide p1, p0, La/tn40;->o:J

    .line 48
    .line 49
    move-object/from16 p1, p20

    .line 50
    .line 51
    iput-object p1, p0, La/tn40;->p:Ljava/util/List;

    .line 52
    .line 53
    move/from16 p1, p21

    .line 54
    .line 55
    iput-boolean p1, p0, La/tn40;->q:Z

    .line 56
    .line 57
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
    instance-of v0, p1, La/tn40;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/tn40;

    .line 12
    .line 13
    iget-object v0, p0, La/tn40;->a:Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;

    .line 14
    .line 15
    iget-object v1, p1, La/tn40;->a:Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-object v0, p0, La/tn40;->b:La/trz;

    .line 22
    .line 23
    iget-object v1, p1, La/tn40;->b:La/trz;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/tn40;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/tn40;->c:Ljava/lang/String;

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
    iget-object v0, p0, La/tn40;->d:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p1, La/tn40;->d:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget-boolean v0, p0, La/tn40;->e:Z

    .line 58
    .line 59
    iget-boolean v1, p1, La/tn40;->e:Z

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_6
    iget-boolean v0, p0, La/tn40;->f:Z

    .line 66
    .line 67
    iget-boolean v1, p1, La/tn40;->f:Z

    .line 68
    .line 69
    if-eq v0, v1, :cond_7

    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_7
    iget-boolean v0, p0, La/tn40;->g:Z

    .line 74
    .line 75
    iget-boolean v1, p1, La/tn40;->g:Z

    .line 76
    .line 77
    if-eq v0, v1, :cond_8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    iget-object v0, p0, La/tn40;->h:La/qrz;

    .line 81
    .line 82
    iget-object v1, p1, La/tn40;->h:La/qrz;

    .line 83
    .line 84
    if-eq v0, v1, :cond_9

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_9
    iget-wide v0, p0, La/tn40;->i:J

    .line 88
    .line 89
    iget-wide v2, p1, La/tn40;->i:J

    .line 90
    .line 91
    cmp-long v0, v0, v2

    .line 92
    .line 93
    if-eqz v0, :cond_a

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_a
    iget-wide v0, p0, La/tn40;->j:J

    .line 97
    .line 98
    iget-wide v2, p1, La/tn40;->j:J

    .line 99
    .line 100
    cmp-long v0, v0, v2

    .line 101
    .line 102
    if-eqz v0, :cond_b

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_b
    iget-wide v0, p0, La/tn40;->k:J

    .line 106
    .line 107
    iget-wide v2, p1, La/tn40;->k:J

    .line 108
    .line 109
    cmp-long v0, v0, v2

    .line 110
    .line 111
    if-eqz v0, :cond_c

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_c
    iget-object v0, p0, La/tn40;->l:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v1, p1, La/tn40;->l:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_d

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_d
    iget-boolean v0, p0, La/tn40;->m:Z

    .line 126
    .line 127
    iget-boolean v1, p1, La/tn40;->m:Z

    .line 128
    .line 129
    if-eq v0, v1, :cond_e

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_e
    iget-object v0, p0, La/tn40;->n:Ljava/lang/String;

    .line 133
    .line 134
    iget-object v1, p1, La/tn40;->n:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_f

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_f
    iget-wide v0, p0, La/tn40;->o:J

    .line 144
    .line 145
    iget-wide v2, p1, La/tn40;->o:J

    .line 146
    .line 147
    cmp-long v0, v0, v2

    .line 148
    .line 149
    if-eqz v0, :cond_10

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_10
    iget-object v0, p0, La/tn40;->p:Ljava/util/List;

    .line 153
    .line 154
    iget-object v1, p1, La/tn40;->p:Ljava/util/List;

    .line 155
    .line 156
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-nez v0, :cond_11

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_11
    iget-boolean p0, p0, La/tn40;->q:Z

    .line 164
    .line 165
    iget-boolean p1, p1, La/tn40;->q:Z

    .line 166
    .line 167
    if-eq p0, p1, :cond_12

    .line 168
    .line 169
    :goto_0
    const/4 p0, 0x0

    .line 170
    return p0

    .line 171
    :cond_12
    :goto_1
    const/4 p0, 0x1

    .line 172
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/tn40;->a:Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;

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
    iget-object v2, p0, La/tn40;->b:La/trz;

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
    iget-object v0, p0, La/tn40;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/tn40;->d:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/tn40;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-boolean v2, p0, La/tn40;->f:Z

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-boolean v2, p0, La/tn40;->g:Z

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, La/tn40;->h:La/qrz;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    add-int/2addr v2, v0

    .line 55
    mul-int/2addr v2, v1

    .line 56
    iget-wide v3, p0, La/tn40;->i:J

    .line 57
    .line 58
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-wide v2, p0, La/tn40;->j:J

    .line 63
    .line 64
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-wide v2, p0, La/tn40;->k:J

    .line 69
    .line 70
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-object v2, p0, La/tn40;->l:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-boolean v2, p0, La/tn40;->m:Z

    .line 81
    .line 82
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-object v2, p0, La/tn40;->n:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget-wide v2, p0, La/tn40;->o:J

    .line 93
    .line 94
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    iget-object v2, p0, La/tn40;->p:Ljava/util/List;

    .line 99
    .line 100
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iget-boolean p0, p0, La/tn40;->q:Z

    .line 105
    .line 106
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    add-int/2addr p0, v0

    .line 111
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MoneyLimitModel(limitGroup="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/tn40;->a:Lorg/xplatform/limits_africa/api/domain/LimitGroupEnum;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", limitType="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/tn40;->b:La/trz;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", currency="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", limitBalance="

    .line 29
    .line 30
    const-string v2, ", freeValue="

    .line 31
    .line 32
    iget-object v3, p0, La/tn40;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, La/tn40;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", changeAvailable="

    .line 40
    .line 41
    const-string v2, ", deleteAvailable="

    .line 42
    .line 43
    iget-boolean v3, p0, La/tn40;->e:Z

    .line 44
    .line 45
    iget-boolean v4, p0, La/tn40;->f:Z

    .line 46
    .line 47
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 48
    .line 49
    .line 50
    iget-boolean v1, p0, La/tn40;->g:Z

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", limitState="

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, La/tn40;->h:La/qrz;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", startedAt="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-wide v1, p0, La/tn40;->i:J

    .line 71
    .line 72
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", endsAt="

    .line 76
    .line 77
    const-string v2, ", createdAt="

    .line 78
    .line 79
    iget-wide v3, p0, La/tn40;->j:J

    .line 80
    .line 81
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v1, ", limitValue="

    .line 85
    .line 86
    iget-wide v2, p0, La/tn40;->k:J

    .line 87
    .line 88
    iget-object v4, p0, La/tn40;->l:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v1, ", needApprove="

    .line 94
    .line 95
    const-string v2, ", pendingValue="

    .line 96
    .line 97
    iget-object v3, p0, La/tn40;->n:Ljava/lang/String;

    .line 98
    .line 99
    iget-boolean v4, p0, La/tn40;->m:Z

    .line 100
    .line 101
    invoke-static {v1, v2, v3, v0, v4}, La/hne;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 102
    .line 103
    .line 104
    const-string v1, ", pendingEndsAt="

    .line 105
    .line 106
    const-string v2, ", availableValueModels="

    .line 107
    .line 108
    iget-wide v3, p0, La/tn40;->o:J

    .line 109
    .line 110
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object v1, p0, La/tn40;->p:Ljava/util/List;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v1, ", setWithoutValue="

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    iget-boolean p0, p0, La/tn40;->q:Z

    .line 124
    .line 125
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string p0, ")"

    .line 129
    .line 130
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0
.end method
