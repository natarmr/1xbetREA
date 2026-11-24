.class public final La/o79;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:I

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:La/w3w0;

.field public final l:La/w3w0;

.field public final m:Z

.field public final n:Z

.field public final o:Ljava/lang/String;


# direct methods
.method public constructor <init>(JJIJLjava/lang/String;Ljava/lang/String;ZZZZLa/w3w0;La/w3w0;ZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/o79;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, La/o79;->b:J

    .line 7
    .line 8
    iput p5, p0, La/o79;->c:I

    .line 9
    .line 10
    iput-wide p6, p0, La/o79;->d:J

    .line 11
    .line 12
    iput-object p8, p0, La/o79;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p9, p0, La/o79;->f:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p10, p0, La/o79;->g:Z

    .line 17
    .line 18
    iput-boolean p11, p0, La/o79;->h:Z

    .line 19
    .line 20
    iput-boolean p12, p0, La/o79;->i:Z

    .line 21
    .line 22
    iput-boolean p13, p0, La/o79;->j:Z

    .line 23
    .line 24
    iput-object p14, p0, La/o79;->k:La/w3w0;

    .line 25
    .line 26
    iput-object p15, p0, La/o79;->l:La/w3w0;

    .line 27
    .line 28
    move/from16 p1, p16

    .line 29
    .line 30
    iput-boolean p1, p0, La/o79;->m:Z

    .line 31
    .line 32
    move/from16 p1, p17

    .line 33
    .line 34
    iput-boolean p1, p0, La/o79;->n:Z

    .line 35
    .line 36
    move-object/from16 p1, p18

    .line 37
    .line 38
    iput-object p1, p0, La/o79;->o:Ljava/lang/String;

    .line 39
    .line 40
    return-void
.end method

.method public static a(La/o79;ZZZZLa/w3w0;La/w3w0;ZLjava/lang/String;I)La/o79;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p9

    .line 4
    .line 5
    iget-wide v2, v0, La/o79;->a:J

    .line 6
    .line 7
    move-wide v5, v2

    .line 8
    iget-wide v3, v0, La/o79;->b:J

    .line 9
    .line 10
    move-wide v6, v5

    .line 11
    iget v5, v0, La/o79;->c:I

    .line 12
    .line 13
    move-wide v8, v6

    .line 14
    iget-wide v6, v0, La/o79;->d:J

    .line 15
    .line 16
    move-wide v9, v8

    .line 17
    iget-object v8, v0, La/o79;->e:Ljava/lang/String;

    .line 18
    .line 19
    move-wide v10, v9

    .line 20
    iget-object v9, v0, La/o79;->f:Ljava/lang/String;

    .line 21
    .line 22
    and-int/lit8 v2, v1, 0x40

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-boolean v2, v0, La/o79;->g:Z

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move/from16 v2, p1

    .line 30
    .line 31
    :goto_0
    and-int/lit16 v12, v1, 0x80

    .line 32
    .line 33
    if-eqz v12, :cond_1

    .line 34
    .line 35
    iget-boolean v12, v0, La/o79;->h:Z

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move/from16 v12, p2

    .line 39
    .line 40
    :goto_1
    and-int/lit16 v13, v1, 0x100

    .line 41
    .line 42
    if-eqz v13, :cond_2

    .line 43
    .line 44
    iget-boolean v13, v0, La/o79;->i:Z

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move/from16 v13, p3

    .line 48
    .line 49
    :goto_2
    and-int/lit16 v14, v1, 0x200

    .line 50
    .line 51
    if-eqz v14, :cond_3

    .line 52
    .line 53
    iget-boolean v14, v0, La/o79;->j:Z

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_3
    move/from16 v14, p4

    .line 57
    .line 58
    :goto_3
    and-int/lit16 v15, v1, 0x400

    .line 59
    .line 60
    if-eqz v15, :cond_4

    .line 61
    .line 62
    iget-object v15, v0, La/o79;->k:La/w3w0;

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_4
    move-object/from16 v15, p5

    .line 66
    .line 67
    :goto_4
    move/from16 p1, v2

    .line 68
    .line 69
    and-int/lit16 v2, v1, 0x800

    .line 70
    .line 71
    if-eqz v2, :cond_5

    .line 72
    .line 73
    iget-object v2, v0, La/o79;->l:La/w3w0;

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_5
    move-object/from16 v2, p6

    .line 77
    .line 78
    :goto_5
    move-object/from16 p2, v2

    .line 79
    .line 80
    and-int/lit16 v2, v1, 0x1000

    .line 81
    .line 82
    if-eqz v2, :cond_6

    .line 83
    .line 84
    iget-boolean v2, v0, La/o79;->m:Z

    .line 85
    .line 86
    move/from16 v16, v2

    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_6
    move/from16 v16, p7

    .line 90
    .line 91
    :goto_6
    and-int/lit16 v2, v1, 0x2000

    .line 92
    .line 93
    if-eqz v2, :cond_7

    .line 94
    .line 95
    iget-boolean v2, v0, La/o79;->n:Z

    .line 96
    .line 97
    :goto_7
    move/from16 v17, v2

    .line 98
    .line 99
    goto :goto_8

    .line 100
    :cond_7
    const/4 v2, 0x0

    .line 101
    goto :goto_7

    .line 102
    :goto_8
    and-int/lit16 v1, v1, 0x4000

    .line 103
    .line 104
    if-eqz v1, :cond_8

    .line 105
    .line 106
    iget-object v1, v0, La/o79;->o:Ljava/lang/String;

    .line 107
    .line 108
    move-object/from16 v18, v1

    .line 109
    .line 110
    goto :goto_9

    .line 111
    :cond_8
    move-object/from16 v18, p8

    .line 112
    .line 113
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v0, La/o79;

    .line 117
    .line 118
    move-wide v1, v10

    .line 119
    move v11, v12

    .line 120
    move v12, v13

    .line 121
    move v13, v14

    .line 122
    move-object v14, v15

    .line 123
    move/from16 v10, p1

    .line 124
    .line 125
    move-object/from16 v15, p2

    .line 126
    .line 127
    invoke-direct/range {v0 .. v18}, La/o79;-><init>(JJIJLjava/lang/String;Ljava/lang/String;ZZZZLa/w3w0;La/w3w0;ZZLjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-object v0
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
    instance-of v0, p1, La/o79;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/o79;

    .line 12
    .line 13
    iget-wide v0, p0, La/o79;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/o79;->a:J

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
    iget-wide v0, p0, La/o79;->b:J

    .line 24
    .line 25
    iget-wide v2, p1, La/o79;->b:J

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
    iget v0, p0, La/o79;->c:I

    .line 34
    .line 35
    iget v1, p1, La/o79;->c:I

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_4
    iget-wide v0, p0, La/o79;->d:J

    .line 42
    .line 43
    iget-wide v2, p1, La/o79;->d:J

    .line 44
    .line 45
    cmp-long v0, v0, v2

    .line 46
    .line 47
    if-eqz v0, :cond_5

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_5
    iget-object v0, p0, La/o79;->e:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p1, La/o79;->e:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_6

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_6
    iget-object v0, p0, La/o79;->f:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, p1, La/o79;->f:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_7

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_7
    iget-boolean v0, p0, La/o79;->g:Z

    .line 73
    .line 74
    iget-boolean v1, p1, La/o79;->g:Z

    .line 75
    .line 76
    if-eq v0, v1, :cond_8

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_8
    iget-boolean v0, p0, La/o79;->h:Z

    .line 80
    .line 81
    iget-boolean v1, p1, La/o79;->h:Z

    .line 82
    .line 83
    if-eq v0, v1, :cond_9

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_9
    iget-boolean v0, p0, La/o79;->i:Z

    .line 87
    .line 88
    iget-boolean v1, p1, La/o79;->i:Z

    .line 89
    .line 90
    if-eq v0, v1, :cond_a

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_a
    iget-boolean v0, p0, La/o79;->j:Z

    .line 94
    .line 95
    iget-boolean v1, p1, La/o79;->j:Z

    .line 96
    .line 97
    if-eq v0, v1, :cond_b

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_b
    iget-object v0, p0, La/o79;->k:La/w3w0;

    .line 101
    .line 102
    iget-object v1, p1, La/o79;->k:La/w3w0;

    .line 103
    .line 104
    if-eq v0, v1, :cond_c

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_c
    iget-object v0, p0, La/o79;->l:La/w3w0;

    .line 108
    .line 109
    iget-object v1, p1, La/o79;->l:La/w3w0;

    .line 110
    .line 111
    if-eq v0, v1, :cond_d

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_d
    iget-boolean v0, p0, La/o79;->m:Z

    .line 115
    .line 116
    iget-boolean v1, p1, La/o79;->m:Z

    .line 117
    .line 118
    if-eq v0, v1, :cond_e

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_e
    iget-boolean v0, p0, La/o79;->n:Z

    .line 122
    .line 123
    iget-boolean v1, p1, La/o79;->n:Z

    .line 124
    .line 125
    if-eq v0, v1, :cond_f

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_f
    iget-object p0, p0, La/o79;->o:Ljava/lang/String;

    .line 129
    .line 130
    iget-object p1, p1, La/o79;->o:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-nez p0, :cond_10

    .line 137
    .line 138
    :goto_0
    const/4 p0, 0x0

    .line 139
    return p0

    .line 140
    :cond_10
    :goto_1
    const/4 p0, 0x1

    .line 141
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/o79;->a:J

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
    iget-wide v2, p0, La/o79;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/o79;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/o79;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/o79;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/o79;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/o79;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/o79;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/o79;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, La/o79;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/o79;->k:La/w3w0;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    add-int/2addr v2, v0

    .line 71
    mul-int/2addr v2, v1

    .line 72
    iget-object v0, p0, La/o79;->l:La/w3w0;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    add-int/2addr v0, v2

    .line 79
    mul-int/2addr v0, v1

    .line 80
    iget-boolean v2, p0, La/o79;->m:Z

    .line 81
    .line 82
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-boolean v2, p0, La/o79;->n:Z

    .line 87
    .line 88
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget-object p0, p0, La/o79;->o:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    add-int/2addr p0, v0

    .line 99
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "BroadcastingZoneFullScreenState(gameId="

    .line 2
    .line 3
    const-string v1, ", sportId="

    .line 4
    .line 5
    iget-wide v2, p0, La/o79;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ", zoneId="

    .line 12
    .line 13
    iget-wide v2, p0, La/o79;->b:J

    .line 14
    .line 15
    iget v4, p0, La/o79;->c:I

    .line 16
    .line 17
    invoke-static {v0, v2, v3, v1, v4}, La/ua80;->v(Ljava/lang/StringBuilder;JLjava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    const-string v1, ", subSportId="

    .line 21
    .line 22
    const-string v2, ", url="

    .line 23
    .line 24
    iget-wide v3, p0, La/o79;->d:J

    .line 25
    .line 26
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, ", lang="

    .line 30
    .line 31
    const-string v2, ", isBroadcastingRun="

    .line 32
    .line 33
    iget-object v3, p0, La/o79;->e:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v4, p0, La/o79;->f:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v1, ", isUrlApply="

    .line 41
    .line 42
    const-string v2, ", isControlPanelVisible="

    .line 43
    .line 44
    iget-boolean v3, p0, La/o79;->g:Z

    .line 45
    .line 46
    iget-boolean v4, p0, La/o79;->h:Z

    .line 47
    .line 48
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 49
    .line 50
    .line 51
    const-string v1, ", isError="

    .line 52
    .line 53
    const-string v2, ", zoneFormatType="

    .line 54
    .line 55
    iget-boolean v3, p0, La/o79;->i:Z

    .line 56
    .line 57
    iget-boolean v4, p0, La/o79;->j:Z

    .line 58
    .line 59
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, La/o79;->k:La/w3w0;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v1, ", pageZoneFormatType="

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, La/o79;->l:La/w3w0;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", zoneFormatChangeAvailable="

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", shouldEndWatchingSession="

    .line 83
    .line 84
    const-string v2, ", broadcastSessionHost="

    .line 85
    .line 86
    iget-boolean v3, p0, La/o79;->m:Z

    .line 87
    .line 88
    iget-boolean v4, p0, La/o79;->n:Z

    .line 89
    .line 90
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 91
    .line 92
    .line 93
    const-string v1, ")"

    .line 94
    .line 95
    iget-object p0, p0, La/o79;->o:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0
.end method
