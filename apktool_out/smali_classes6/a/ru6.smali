.class public final La/ru6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:D

.field public final d:J

.field public final e:La/uoy;

.field public final f:D

.field public final g:J

.field public final h:J

.field public final i:La/zfa0;

.field public final j:I

.field public final k:Ljava/lang/Double;

.field public final l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;DJLa/uoy;DJJILjava/lang/Double;Ljava/lang/String;I)V
    .locals 19

    .line 1
    move/from16 v0, p18

    .line 2
    .line 3
    sget-object v15, La/yfa0;->INSTANCE:La/yfa0;

    .line 4
    .line 5
    and-int/lit16 v1, v0, 0x400

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object/from16 v17, v2

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v17, p16

    .line 14
    .line 15
    :goto_0
    and-int/lit16 v0, v0, 0x800

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    move-object/from16 v18, v2

    .line 20
    .line 21
    move-object/from16 v0, p0

    .line 22
    .line 23
    move-object/from16 v3, p3

    .line 24
    .line 25
    move-wide/from16 v4, p4

    .line 26
    .line 27
    move-wide/from16 v6, p6

    .line 28
    .line 29
    move-object/from16 v8, p8

    .line 30
    .line 31
    move-wide/from16 v9, p9

    .line 32
    .line 33
    move-wide/from16 v11, p11

    .line 34
    .line 35
    move-wide/from16 v13, p13

    .line 36
    .line 37
    move/from16 v16, p15

    .line 38
    .line 39
    move-wide/from16 v1, p1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object/from16 v18, p17

    .line 43
    .line 44
    move-object/from16 v0, p0

    .line 45
    .line 46
    move-wide/from16 v1, p1

    .line 47
    .line 48
    move-object/from16 v3, p3

    .line 49
    .line 50
    move-wide/from16 v4, p4

    .line 51
    .line 52
    move-wide/from16 v6, p6

    .line 53
    .line 54
    move-object/from16 v8, p8

    .line 55
    .line 56
    move-wide/from16 v9, p9

    .line 57
    .line 58
    move-wide/from16 v11, p11

    .line 59
    .line 60
    move-wide/from16 v13, p13

    .line 61
    .line 62
    move/from16 v16, p15

    .line 63
    .line 64
    :goto_1
    invoke-direct/range {v0 .. v18}, La/ru6;-><init>(JLjava/lang/String;DJLa/uoy;DJJLa/zfa0;ILjava/lang/Double;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>(JLjava/lang/String;DJLa/uoy;DJJLa/zfa0;ILjava/lang/Double;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-wide p1, p0, La/ru6;->a:J

    .line 70
    iput-object p3, p0, La/ru6;->b:Ljava/lang/String;

    .line 71
    iput-wide p4, p0, La/ru6;->c:D

    .line 72
    iput-wide p6, p0, La/ru6;->d:J

    .line 73
    iput-object p8, p0, La/ru6;->e:La/uoy;

    .line 74
    iput-wide p9, p0, La/ru6;->f:D

    .line 75
    iput-wide p11, p0, La/ru6;->g:J

    .line 76
    iput-wide p13, p0, La/ru6;->h:J

    .line 77
    iput-object p15, p0, La/ru6;->i:La/zfa0;

    move/from16 p1, p16

    .line 78
    iput p1, p0, La/ru6;->j:I

    move-object/from16 p1, p17

    .line 79
    iput-object p1, p0, La/ru6;->k:Ljava/lang/Double;

    move-object/from16 p1, p18

    .line 80
    iput-object p1, p0, La/ru6;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/ru6;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/ru6;

    .line 12
    .line 13
    iget-wide v3, p0, La/ru6;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, La/ru6;->a:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-object v1, p0, La/ru6;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, La/ru6;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-wide v3, p0, La/ru6;->c:D

    .line 34
    .line 35
    iget-wide v5, p1, La/ru6;->c:D

    .line 36
    .line 37
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-wide v3, p0, La/ru6;->d:J

    .line 45
    .line 46
    iget-wide v5, p1, La/ru6;->d:J

    .line 47
    .line 48
    cmp-long v1, v3, v5

    .line 49
    .line 50
    if-eqz v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-object v1, p0, La/ru6;->e:La/uoy;

    .line 54
    .line 55
    iget-object v3, p1, La/ru6;->e:La/uoy;

    .line 56
    .line 57
    if-eq v1, v3, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-wide v3, p0, La/ru6;->f:D

    .line 61
    .line 62
    iget-wide v5, p1, La/ru6;->f:D

    .line 63
    .line 64
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-wide v3, p0, La/ru6;->g:J

    .line 72
    .line 73
    iget-wide v5, p1, La/ru6;->g:J

    .line 74
    .line 75
    cmp-long v1, v3, v5

    .line 76
    .line 77
    if-eqz v1, :cond_8

    .line 78
    .line 79
    return v2

    .line 80
    :cond_8
    iget-wide v3, p0, La/ru6;->h:J

    .line 81
    .line 82
    iget-wide v5, p1, La/ru6;->h:J

    .line 83
    .line 84
    cmp-long v1, v3, v5

    .line 85
    .line 86
    if-eqz v1, :cond_9

    .line 87
    .line 88
    return v2

    .line 89
    :cond_9
    iget-object v1, p0, La/ru6;->i:La/zfa0;

    .line 90
    .line 91
    iget-object v3, p1, La/ru6;->i:La/zfa0;

    .line 92
    .line 93
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_a

    .line 98
    .line 99
    return v2

    .line 100
    :cond_a
    iget v1, p0, La/ru6;->j:I

    .line 101
    .line 102
    iget v3, p1, La/ru6;->j:I

    .line 103
    .line 104
    if-eq v1, v3, :cond_b

    .line 105
    .line 106
    return v2

    .line 107
    :cond_b
    iget-object v1, p0, La/ru6;->k:Ljava/lang/Double;

    .line 108
    .line 109
    iget-object v3, p1, La/ru6;->k:Ljava/lang/Double;

    .line 110
    .line 111
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_c

    .line 116
    .line 117
    return v2

    .line 118
    :cond_c
    iget-object p0, p0, La/ru6;->l:Ljava/lang/String;

    .line 119
    .line 120
    iget-object p1, p1, La/ru6;->l:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    if-nez p0, :cond_d

    .line 127
    .line 128
    return v2

    .line 129
    :cond_d
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/ru6;->a:J

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
    iget-object v2, p0, La/ru6;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/ru6;->c:D

    .line 17
    .line 18
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/ru6;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/ru6;->e:La/uoy;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->d(La/uoy;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/ru6;->f:D

    .line 35
    .line 36
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v2, p0, La/ru6;->g:J

    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, La/ru6;->h:J

    .line 47
    .line 48
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/ru6;->i:La/zfa0;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/2addr v2, v0

    .line 59
    mul-int/2addr v2, v1

    .line 60
    iget v0, p0, La/ru6;->j:I

    .line 61
    .line 62
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v2, 0x0

    .line 67
    iget-object v3, p0, La/ru6;->k:Ljava/lang/Double;

    .line 68
    .line 69
    if-nez v3, :cond_0

    .line 70
    .line 71
    move v3, v2

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    :goto_0
    add-int/2addr v0, v3

    .line 78
    mul-int/2addr v0, v1

    .line 79
    iget-object p0, p0, La/ru6;->l:Ljava/lang/String;

    .line 80
    .line 81
    if-nez p0, :cond_1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    :goto_1
    add-int/2addr v0, v2

    .line 89
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "BetEventModel(eventEntityId="

    .line 2
    .line 3
    const-string v1, ", coefficient="

    .line 4
    .line 5
    iget-wide v2, p0, La/ru6;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/ru6;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", coef="

    .line 14
    .line 15
    const-string v2, ", gameId="

    .line 16
    .line 17
    iget-wide v3, p0, La/ru6;->c:D

    .line 18
    .line 19
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-wide v1, p0, La/ru6;->d:J

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", kind="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, La/ru6;->e:La/uoy;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", param="

    .line 38
    .line 39
    const-string v2, ", playerId="

    .line 40
    .line 41
    iget-wide v3, p0, La/ru6;->f:D

    .line 42
    .line 43
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-wide v1, p0, La/ru6;->g:J

    .line 47
    .line 48
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", type="

    .line 52
    .line 53
    const-string v2, ", playersDuel="

    .line 54
    .line 55
    iget-wide v3, p0, La/ru6;->h:J

    .line 56
    .line 57
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, La/ru6;->i:La/zfa0;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, ", uiFeatureId="

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget v1, p0, La/ru6;->j:I

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", optionLowerCf="

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, La/ru6;->k:Ljava/lang/Double;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", optionLowerCfView="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, La/ru6;->l:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p0, ")"

    .line 96
    .line 97
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0
.end method
