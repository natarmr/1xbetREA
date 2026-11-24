.class public final La/tus;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wus;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:J

.field public final j:Z

.field public final k:Z

.field public final l:J

.field public final m:J

.field public final n:I

.field public final o:J

.field public final p:Ljava/lang/String;


# direct methods
.method public constructor <init>(IJJJJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZ)V
    .locals 0

    .line 1
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p19 .. p19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    iput-wide p2, p0, La/tus;->a:J

    .line 14
    .line 15
    iput-wide p4, p0, La/tus;->b:J

    .line 16
    .line 17
    move-object/from16 p2, p16

    .line 18
    .line 19
    iput-object p2, p0, La/tus;->c:Ljava/lang/String;

    .line 20
    .line 21
    move-object/from16 p2, p19

    .line 22
    .line 23
    iput-object p2, p0, La/tus;->d:Ljava/util/List;

    .line 24
    .line 25
    move-object/from16 p2, p20

    .line 26
    .line 27
    iput-object p2, p0, La/tus;->e:Ljava/util/List;

    .line 28
    .line 29
    move/from16 p2, p21

    .line 30
    .line 31
    iput-boolean p2, p0, La/tus;->f:Z

    .line 32
    .line 33
    move-object/from16 p2, p17

    .line 34
    .line 35
    iput-object p2, p0, La/tus;->g:Ljava/lang/String;

    .line 36
    .line 37
    iput-wide p6, p0, La/tus;->h:J

    .line 38
    .line 39
    iput-wide p8, p0, La/tus;->i:J

    .line 40
    .line 41
    move/from16 p2, p22

    .line 42
    .line 43
    iput-boolean p2, p0, La/tus;->j:Z

    .line 44
    .line 45
    move/from16 p2, p23

    .line 46
    .line 47
    iput-boolean p2, p0, La/tus;->k:Z

    .line 48
    .line 49
    iput-wide p10, p0, La/tus;->l:J

    .line 50
    .line 51
    iput-wide p12, p0, La/tus;->m:J

    .line 52
    .line 53
    iput p1, p0, La/tus;->n:I

    .line 54
    .line 55
    iput-wide p14, p0, La/tus;->o:J

    .line 56
    .line 57
    move-object/from16 p1, p18

    .line 58
    .line 59
    iput-object p1, p0, La/tus;->p:Ljava/lang/String;

    .line 60
    .line 61
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
    instance-of v0, p1, La/tus;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/tus;

    .line 12
    .line 13
    iget-wide v0, p0, La/tus;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/tus;->a:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_2
    iget-wide v0, p0, La/tus;->b:J

    .line 24
    .line 25
    iget-wide v2, p1, La/tus;->b:J

    .line 26
    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/tus;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/tus;->c:Ljava/lang/String;

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
    iget-object v0, p0, La/tus;->d:Ljava/util/List;

    .line 46
    .line 47
    iget-object v1, p1, La/tus;->d:Ljava/util/List;

    .line 48
    .line 49
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/tus;->e:Ljava/util/List;

    .line 58
    .line 59
    iget-object v1, p1, La/tus;->e:Ljava/util/List;

    .line 60
    .line 61
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_6
    iget-boolean v0, p0, La/tus;->f:Z

    .line 70
    .line 71
    iget-boolean v1, p1, La/tus;->f:Z

    .line 72
    .line 73
    if-eq v0, v1, :cond_7

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_7
    iget-object v0, p0, La/tus;->g:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v1, p1, La/tus;->g:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_8

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_8
    iget-wide v0, p0, La/tus;->h:J

    .line 88
    .line 89
    iget-wide v2, p1, La/tus;->h:J

    .line 90
    .line 91
    cmp-long v0, v0, v2

    .line 92
    .line 93
    if-eqz v0, :cond_9

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_9
    iget-wide v0, p0, La/tus;->i:J

    .line 97
    .line 98
    iget-wide v2, p1, La/tus;->i:J

    .line 99
    .line 100
    cmp-long v0, v0, v2

    .line 101
    .line 102
    if-eqz v0, :cond_a

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_a
    iget-boolean v0, p0, La/tus;->j:Z

    .line 106
    .line 107
    iget-boolean v1, p1, La/tus;->j:Z

    .line 108
    .line 109
    if-eq v0, v1, :cond_b

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_b
    iget-boolean v0, p0, La/tus;->k:Z

    .line 113
    .line 114
    iget-boolean v1, p1, La/tus;->k:Z

    .line 115
    .line 116
    if-eq v0, v1, :cond_c

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_c
    iget-wide v0, p0, La/tus;->l:J

    .line 120
    .line 121
    iget-wide v2, p1, La/tus;->l:J

    .line 122
    .line 123
    cmp-long v0, v0, v2

    .line 124
    .line 125
    if-eqz v0, :cond_d

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_d
    iget-wide v0, p0, La/tus;->m:J

    .line 129
    .line 130
    iget-wide v2, p1, La/tus;->m:J

    .line 131
    .line 132
    cmp-long v0, v0, v2

    .line 133
    .line 134
    if-eqz v0, :cond_e

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_e
    iget v0, p0, La/tus;->n:I

    .line 138
    .line 139
    iget v1, p1, La/tus;->n:I

    .line 140
    .line 141
    if-eq v0, v1, :cond_f

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_f
    iget-wide v0, p0, La/tus;->o:J

    .line 145
    .line 146
    iget-wide v2, p1, La/tus;->o:J

    .line 147
    .line 148
    cmp-long v0, v0, v2

    .line 149
    .line 150
    if-eqz v0, :cond_10

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_10
    iget-object p0, p0, La/tus;->p:Ljava/lang/String;

    .line 154
    .line 155
    iget-object p1, p1, La/tus;->p:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-nez p0, :cond_11

    .line 162
    .line 163
    :goto_0
    const/4 p0, 0x0

    .line 164
    return p0

    .line 165
    :cond_11
    :goto_1
    const/4 p0, 0x1

    .line 166
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/tus;->a:J

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
    iget-wide v2, p0, La/tus;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/tus;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/tus;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/tus;->e:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/tus;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/tus;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, La/tus;->h:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-wide v2, p0, La/tus;->i:J

    .line 53
    .line 54
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, La/tus;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, La/tus;->k:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-wide v2, p0, La/tus;->l:J

    .line 71
    .line 72
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-wide v2, p0, La/tus;->m:J

    .line 77
    .line 78
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget v2, p0, La/tus;->n:I

    .line 83
    .line 84
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-wide v2, p0, La/tus;->o:J

    .line 89
    .line 90
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object p0, p0, La/tus;->p:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    add-int/2addr p0, v0

    .line 101
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "ShowMenu(teamOneId="

    .line 2
    .line 3
    const-string v1, ", teamTwoId="

    .line 4
    .line 5
    iget-wide v2, p0, La/tus;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ", sportName="

    .line 12
    .line 13
    iget-wide v2, p0, La/tus;->b:J

    .line 14
    .line 15
    iget-object v4, p0, La/tus;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, ", statisticBlocksAvailableIds="

    .line 21
    .line 22
    const-string v2, ", statisticBlocksDisableIds="

    .line 23
    .line 24
    iget-object v3, p0, La/tus;->d:Ljava/util/List;

    .line 25
    .line 26
    iget-object v4, p0, La/tus;->e:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v1, v2, v0, v3, v4}, La/hne;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    const-string v1, ", statisticBlocksActive="

    .line 32
    .line 33
    const-string v2, ", statId="

    .line 34
    .line 35
    iget-object v3, p0, La/tus;->g:Ljava/lang/String;

    .line 36
    .line 37
    iget-boolean v4, p0, La/tus;->f:Z

    .line 38
    .line 39
    invoke-static {v1, v2, v3, v0, v4}, La/hne;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 40
    .line 41
    .line 42
    const-string v1, ", gameId="

    .line 43
    .line 44
    const-string v2, ", constId="

    .line 45
    .line 46
    iget-wide v3, p0, La/tus;->h:J

    .line 47
    .line 48
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v1, ", live="

    .line 52
    .line 53
    iget-wide v2, p0, La/tus;->i:J

    .line 54
    .line 55
    iget-boolean v4, p0, La/tus;->j:Z

    .line 56
    .line 57
    invoke-static {v2, v3, v1, v0, v4}, La/hne;->t(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 58
    .line 59
    .line 60
    const-string v1, ", autoStreamVisible="

    .line 61
    .line 62
    const-string v2, ", sportId="

    .line 63
    .line 64
    iget-boolean v3, p0, La/tus;->k:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v3, v2}, La/rz4;->A(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-wide v1, p0, La/tus;->l:J

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", subSportId="

    .line 75
    .line 76
    const-string v2, ", globalChampId="

    .line 77
    .line 78
    iget-wide v3, p0, La/tus;->m:J

    .line 79
    .line 80
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget v1, p0, La/tus;->n:I

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, ", champId="

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget-wide v1, p0, La/tus;->o:J

    .line 94
    .line 95
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v1, ", champName="

    .line 99
    .line 100
    const-string v2, ")"

    .line 101
    .line 102
    iget-object p0, p0, La/tus;->p:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v0, v1, p0, v2}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method
