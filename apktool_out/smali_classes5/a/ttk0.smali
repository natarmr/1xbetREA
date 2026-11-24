.class public final La/ttk0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:I

.field public final d:J

.field public final e:J

.field public final f:Ljava/util/List;

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:La/y78;

.field public final n:La/v5l0;

.field public final o:Z

.field public final p:Z

.field public final q:Ljava/lang/String;

.field public final r:La/oho;

.field public final s:Ljava/util/Locale;

.field public final t:I


# direct methods
.method public constructor <init>(IZIJJLjava/util/List;ZZZZZZLa/y78;La/v5l0;ZZLjava/lang/String;La/oho;Ljava/util/Locale;I)V
    .locals 0

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p19 .. p19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p20 .. p20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput p1, p0, La/ttk0;->a:I

    .line 17
    .line 18
    iput-boolean p2, p0, La/ttk0;->b:Z

    .line 19
    .line 20
    iput p3, p0, La/ttk0;->c:I

    .line 21
    .line 22
    iput-wide p4, p0, La/ttk0;->d:J

    .line 23
    .line 24
    iput-wide p6, p0, La/ttk0;->e:J

    .line 25
    .line 26
    iput-object p8, p0, La/ttk0;->f:Ljava/util/List;

    .line 27
    .line 28
    iput-boolean p9, p0, La/ttk0;->g:Z

    .line 29
    .line 30
    iput-boolean p10, p0, La/ttk0;->h:Z

    .line 31
    .line 32
    iput-boolean p11, p0, La/ttk0;->i:Z

    .line 33
    .line 34
    iput-boolean p12, p0, La/ttk0;->j:Z

    .line 35
    .line 36
    iput-boolean p13, p0, La/ttk0;->k:Z

    .line 37
    .line 38
    iput-boolean p14, p0, La/ttk0;->l:Z

    .line 39
    .line 40
    iput-object p15, p0, La/ttk0;->m:La/y78;

    .line 41
    .line 42
    move-object/from16 p1, p16

    .line 43
    .line 44
    iput-object p1, p0, La/ttk0;->n:La/v5l0;

    .line 45
    .line 46
    move/from16 p1, p17

    .line 47
    .line 48
    iput-boolean p1, p0, La/ttk0;->o:Z

    .line 49
    .line 50
    move/from16 p1, p18

    .line 51
    .line 52
    iput-boolean p1, p0, La/ttk0;->p:Z

    .line 53
    .line 54
    move-object/from16 p1, p19

    .line 55
    .line 56
    iput-object p1, p0, La/ttk0;->q:Ljava/lang/String;

    .line 57
    .line 58
    move-object/from16 p1, p20

    .line 59
    .line 60
    iput-object p1, p0, La/ttk0;->r:La/oho;

    .line 61
    .line 62
    move-object/from16 p1, p21

    .line 63
    .line 64
    iput-object p1, p0, La/ttk0;->s:Ljava/util/Locale;

    .line 65
    .line 66
    move/from16 p1, p22

    .line 67
    .line 68
    iput p1, p0, La/ttk0;->t:I

    .line 69
    .line 70
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/ttk0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_1
    check-cast p1, La/ttk0;

    .line 13
    .line 14
    iget v0, p0, La/ttk0;->a:I

    .line 15
    .line 16
    iget v2, p1, La/ttk0;->a:I

    .line 17
    .line 18
    if-eq v0, v2, :cond_2

    .line 19
    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :cond_2
    iget-boolean v0, p0, La/ttk0;->b:Z

    .line 23
    .line 24
    iget-boolean v2, p1, La/ttk0;->b:Z

    .line 25
    .line 26
    if-eq v0, v2, :cond_3

    .line 27
    .line 28
    goto/16 :goto_0

    .line 29
    .line 30
    :cond_3
    iget v0, p0, La/ttk0;->c:I

    .line 31
    .line 32
    iget v2, p1, La/ttk0;->c:I

    .line 33
    .line 34
    if-eq v0, v2, :cond_4

    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :cond_4
    iget-wide v2, p0, La/ttk0;->d:J

    .line 39
    .line 40
    iget-wide v4, p1, La/ttk0;->d:J

    .line 41
    .line 42
    cmp-long v0, v2, v4

    .line 43
    .line 44
    if-eqz v0, :cond_5

    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_5
    iget-wide v2, p0, La/ttk0;->e:J

    .line 49
    .line 50
    iget-wide v4, p1, La/ttk0;->e:J

    .line 51
    .line 52
    cmp-long v0, v2, v4

    .line 53
    .line 54
    if-eqz v0, :cond_6

    .line 55
    .line 56
    goto/16 :goto_0

    .line 57
    .line 58
    :cond_6
    iget-object v0, p0, La/ttk0;->f:Ljava/util/List;

    .line 59
    .line 60
    iget-object v2, p1, La/ttk0;->f:Ljava/util/List;

    .line 61
    .line 62
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_7

    .line 67
    .line 68
    goto/16 :goto_0

    .line 69
    .line 70
    :cond_7
    iget-boolean v0, p0, La/ttk0;->g:Z

    .line 71
    .line 72
    iget-boolean v2, p1, La/ttk0;->g:Z

    .line 73
    .line 74
    if-eq v0, v2, :cond_8

    .line 75
    .line 76
    goto/16 :goto_0

    .line 77
    .line 78
    :cond_8
    iget-boolean v0, p0, La/ttk0;->h:Z

    .line 79
    .line 80
    iget-boolean v2, p1, La/ttk0;->h:Z

    .line 81
    .line 82
    if-eq v0, v2, :cond_9

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_9
    iget-boolean v0, p0, La/ttk0;->i:Z

    .line 86
    .line 87
    iget-boolean v2, p1, La/ttk0;->i:Z

    .line 88
    .line 89
    if-eq v0, v2, :cond_a

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_a
    iget-boolean v0, p0, La/ttk0;->j:Z

    .line 93
    .line 94
    iget-boolean v2, p1, La/ttk0;->j:Z

    .line 95
    .line 96
    if-eq v0, v2, :cond_b

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_b
    iget-boolean v0, p0, La/ttk0;->k:Z

    .line 100
    .line 101
    iget-boolean v2, p1, La/ttk0;->k:Z

    .line 102
    .line 103
    if-eq v0, v2, :cond_c

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_c
    iget-boolean v0, p0, La/ttk0;->l:Z

    .line 107
    .line 108
    iget-boolean v2, p1, La/ttk0;->l:Z

    .line 109
    .line 110
    if-eq v0, v2, :cond_d

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_d
    iget-object v0, p0, La/ttk0;->m:La/y78;

    .line 114
    .line 115
    iget-object v2, p1, La/ttk0;->m:La/y78;

    .line 116
    .line 117
    if-eq v0, v2, :cond_e

    .line 118
    .line 119
    return v1

    .line 120
    :cond_e
    iget-object v0, p0, La/ttk0;->n:La/v5l0;

    .line 121
    .line 122
    iget-object v2, p1, La/ttk0;->n:La/v5l0;

    .line 123
    .line 124
    if-eq v0, v2, :cond_f

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_f
    iget-boolean v0, p0, La/ttk0;->o:Z

    .line 128
    .line 129
    iget-boolean v2, p1, La/ttk0;->o:Z

    .line 130
    .line 131
    if-eq v0, v2, :cond_10

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_10
    iget-boolean v0, p0, La/ttk0;->p:Z

    .line 135
    .line 136
    iget-boolean v2, p1, La/ttk0;->p:Z

    .line 137
    .line 138
    if-eq v0, v2, :cond_11

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_11
    iget-object v0, p0, La/ttk0;->q:Ljava/lang/String;

    .line 142
    .line 143
    iget-object v2, p1, La/ttk0;->q:Ljava/lang/String;

    .line 144
    .line 145
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_12

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_12
    iget-object v0, p0, La/ttk0;->r:La/oho;

    .line 153
    .line 154
    iget-object v2, p1, La/ttk0;->r:La/oho;

    .line 155
    .line 156
    if-eq v0, v2, :cond_13

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_13
    iget-object v0, p0, La/ttk0;->s:Ljava/util/Locale;

    .line 160
    .line 161
    iget-object v2, p1, La/ttk0;->s:Ljava/util/Locale;

    .line 162
    .line 163
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-nez v0, :cond_14

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_14
    iget p0, p0, La/ttk0;->t:I

    .line 171
    .line 172
    iget p1, p1, La/ttk0;->t:I

    .line 173
    .line 174
    if-eq p0, p1, :cond_15

    .line 175
    .line 176
    :goto_0
    return v1

    .line 177
    :cond_15
    :goto_1
    const/4 p0, 0x1

    .line 178
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, La/ttk0;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget-boolean v2, p0, La/ttk0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/ttk0;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/ttk0;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, La/ttk0;->e:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/ttk0;->f:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/ttk0;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/ttk0;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/ttk0;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, La/ttk0;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, La/ttk0;->k:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, La/ttk0;->l:Z

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v2, p0, La/ttk0;->m:La/y78;

    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    add-int/2addr v2, v0

    .line 83
    mul-int/2addr v2, v1

    .line 84
    iget-object v0, p0, La/ttk0;->n:La/v5l0;

    .line 85
    .line 86
    invoke-static {v0, v2, v1}, La/axq;->c(La/v5l0;II)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-boolean v2, p0, La/ttk0;->o:Z

    .line 91
    .line 92
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-boolean v2, p0, La/ttk0;->p:Z

    .line 97
    .line 98
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-object v2, p0, La/ttk0;->q:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iget-object v2, p0, La/ttk0;->r:La/oho;

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    add-int/2addr v2, v0

    .line 115
    mul-int/2addr v2, v1

    .line 116
    iget-object v0, p0, La/ttk0;->s:Ljava/util/Locale;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/util/Locale;->hashCode()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    add-int/2addr v0, v2

    .line 123
    mul-int/2addr v0, v1

    .line 124
    iget p0, p0, La/ttk0;->t:I

    .line 125
    .line 126
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    add-int/2addr p0, v0

    .line 131
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", hasCalendar="

    .line 2
    .line 3
    const-string v1, ", globalChampId="

    .line 4
    .line 5
    iget v2, p0, La/ttk0;->a:I

    .line 6
    .line 7
    const-string v3, "SpecialEventTabScreenSettingsModel(eventId="

    .line 8
    .line 9
    iget-boolean v4, p0, La/ttk0;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, v4}, La/h97;->l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, La/ttk0;->c:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", sportId="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-wide v1, p0, La/ttk0;->d:J

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", subSportId="

    .line 31
    .line 32
    const-string v2, ", tabContentIds="

    .line 33
    .line 34
    iget-wide v3, p0, La/ttk0;->e:J

    .line 35
    .line 36
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", customSportIcon="

    .line 40
    .line 41
    const-string v2, ", topIcon="

    .line 42
    .line 43
    iget-object v3, p0, La/ttk0;->f:Ljava/util/List;

    .line 44
    .line 45
    iget-boolean v4, p0, La/ttk0;->g:Z

    .line 46
    .line 47
    invoke-static {v0, v1, v3, v2, v4}, La/rz4;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    const-string v1, ", hasFinals="

    .line 51
    .line 52
    const-string v2, ", isBettingDisabled="

    .line 53
    .line 54
    iget-boolean v3, p0, La/ttk0;->h:Z

    .line 55
    .line 56
    iget-boolean v4, p0, La/ttk0;->i:Z

    .line 57
    .line 58
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 59
    .line 60
    .line 61
    const-string v1, ", isNewEventParams="

    .line 62
    .line 63
    const-string v2, ", hasStream="

    .line 64
    .line 65
    iget-boolean v3, p0, La/ttk0;->j:Z

    .line 66
    .line 67
    iget-boolean v4, p0, La/ttk0;->k:Z

    .line 68
    .line 69
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 70
    .line 71
    .line 72
    iget-boolean v1, p0, La/ttk0;->l:Z

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", gameUtilsProvider="

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, La/ttk0;->m:La/y78;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v1, ", sportEventCardStyle="

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget-object v1, p0, La/ttk0;->n:La/v5l0;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, ", isTablet="

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    iget-boolean v1, p0, La/ttk0;->o:Z

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v1, ", isNewBanners="

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, ", overrideImagesId="

    .line 113
    .line 114
    const-string v2, ", eventStyle="

    .line 115
    .line 116
    iget-object v3, p0, La/ttk0;->q:Ljava/lang/String;

    .line 117
    .line 118
    iget-boolean v4, p0, La/ttk0;->p:Z

    .line 119
    .line 120
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, La/ttk0;->r:La/oho;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v1, ", currentLocale="

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    iget-object v1, p0, La/ttk0;->s:Ljava/util/Locale;

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v1, ", lottieType="

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ")"

    .line 144
    .line 145
    iget p0, p0, La/ttk0;->t:I

    .line 146
    .line 147
    invoke-static {p0, v1, v0}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0
.end method
