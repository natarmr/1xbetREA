.class public final La/zqc0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:La/mdm;

.field public final d:Ljava/util/List;

.field public final e:La/vrc0;

.field public final f:La/src0;

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:Ljava/lang/String;

.field public final l:Z

.field public final m:J

.field public final n:D

.field public final o:La/esr;

.field public final p:Z


# direct methods
.method public constructor <init>(ZZLa/mdm;Ljava/util/List;La/vrc0;La/src0;Ljava/lang/String;IIILjava/lang/String;ZJDLa/esr;Z)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-boolean p1, p0, La/zqc0;->a:Z

    .line 11
    .line 12
    iput-boolean p2, p0, La/zqc0;->b:Z

    .line 13
    .line 14
    iput-object p3, p0, La/zqc0;->c:La/mdm;

    .line 15
    .line 16
    iput-object p4, p0, La/zqc0;->d:Ljava/util/List;

    .line 17
    .line 18
    iput-object p5, p0, La/zqc0;->e:La/vrc0;

    .line 19
    .line 20
    iput-object p6, p0, La/zqc0;->f:La/src0;

    .line 21
    .line 22
    iput-object p7, p0, La/zqc0;->g:Ljava/lang/String;

    .line 23
    .line 24
    iput p8, p0, La/zqc0;->h:I

    .line 25
    .line 26
    iput p9, p0, La/zqc0;->i:I

    .line 27
    .line 28
    iput p10, p0, La/zqc0;->j:I

    .line 29
    .line 30
    iput-object p11, p0, La/zqc0;->k:Ljava/lang/String;

    .line 31
    .line 32
    iput-boolean p12, p0, La/zqc0;->l:Z

    .line 33
    .line 34
    iput-wide p13, p0, La/zqc0;->m:J

    .line 35
    .line 36
    move-wide p1, p15

    .line 37
    iput-wide p1, p0, La/zqc0;->n:D

    .line 38
    .line 39
    move-object/from16 p1, p17

    .line 40
    .line 41
    iput-object p1, p0, La/zqc0;->o:La/esr;

    .line 42
    .line 43
    move/from16 p1, p18

    .line 44
    .line 45
    iput-boolean p1, p0, La/zqc0;->p:Z

    .line 46
    .line 47
    return-void
.end method

.method public static a(La/zqc0;ZZLjava/util/List;Ljava/lang/String;IIIJDLa/esr;ZI)La/zqc0;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p14

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-boolean v2, v0, La/zqc0;->a:Z

    .line 10
    .line 11
    move v4, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move/from16 v4, p1

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-boolean v2, v0, La/zqc0;->b:Z

    .line 20
    .line 21
    move v5, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move/from16 v5, p2

    .line 24
    .line 25
    :goto_1
    iget-object v6, v0, La/zqc0;->c:La/mdm;

    .line 26
    .line 27
    and-int/lit8 v2, v1, 0x8

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    iget-object v2, v0, La/zqc0;->d:Ljava/util/List;

    .line 32
    .line 33
    move-object v7, v2

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move-object/from16 v7, p3

    .line 36
    .line 37
    :goto_2
    iget-object v8, v0, La/zqc0;->e:La/vrc0;

    .line 38
    .line 39
    iget-object v9, v0, La/zqc0;->f:La/src0;

    .line 40
    .line 41
    and-int/lit8 v2, v1, 0x40

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    iget-object v2, v0, La/zqc0;->g:Ljava/lang/String;

    .line 46
    .line 47
    move-object v10, v2

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move-object/from16 v10, p4

    .line 50
    .line 51
    :goto_3
    and-int/lit16 v2, v1, 0x80

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    iget v2, v0, La/zqc0;->h:I

    .line 56
    .line 57
    move v11, v2

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    move/from16 v11, p5

    .line 60
    .line 61
    :goto_4
    and-int/lit16 v2, v1, 0x100

    .line 62
    .line 63
    if-eqz v2, :cond_5

    .line 64
    .line 65
    iget v2, v0, La/zqc0;->i:I

    .line 66
    .line 67
    move v12, v2

    .line 68
    goto :goto_5

    .line 69
    :cond_5
    move/from16 v12, p6

    .line 70
    .line 71
    :goto_5
    and-int/lit16 v2, v1, 0x200

    .line 72
    .line 73
    if-eqz v2, :cond_6

    .line 74
    .line 75
    iget v2, v0, La/zqc0;->j:I

    .line 76
    .line 77
    move v13, v2

    .line 78
    goto :goto_6

    .line 79
    :cond_6
    move/from16 v13, p7

    .line 80
    .line 81
    :goto_6
    iget-object v14, v0, La/zqc0;->k:Ljava/lang/String;

    .line 82
    .line 83
    iget-boolean v15, v0, La/zqc0;->l:Z

    .line 84
    .line 85
    and-int/lit16 v2, v1, 0x1000

    .line 86
    .line 87
    if-eqz v2, :cond_7

    .line 88
    .line 89
    iget-wide v2, v0, La/zqc0;->m:J

    .line 90
    .line 91
    move-wide/from16 v16, v2

    .line 92
    .line 93
    goto :goto_7

    .line 94
    :cond_7
    move-wide/from16 v16, p8

    .line 95
    .line 96
    :goto_7
    and-int/lit16 v2, v1, 0x2000

    .line 97
    .line 98
    if-eqz v2, :cond_8

    .line 99
    .line 100
    iget-wide v2, v0, La/zqc0;->n:D

    .line 101
    .line 102
    move-wide/from16 v18, v2

    .line 103
    .line 104
    goto :goto_8

    .line 105
    :cond_8
    move-wide/from16 v18, p10

    .line 106
    .line 107
    :goto_8
    and-int/lit16 v2, v1, 0x4000

    .line 108
    .line 109
    if-eqz v2, :cond_9

    .line 110
    .line 111
    iget-object v2, v0, La/zqc0;->o:La/esr;

    .line 112
    .line 113
    move-object/from16 v20, v2

    .line 114
    .line 115
    goto :goto_9

    .line 116
    :cond_9
    move-object/from16 v20, p12

    .line 117
    .line 118
    :goto_9
    const v2, 0x8000

    .line 119
    .line 120
    .line 121
    and-int/2addr v1, v2

    .line 122
    if-eqz v1, :cond_a

    .line 123
    .line 124
    iget-boolean v1, v0, La/zqc0;->p:Z

    .line 125
    .line 126
    move/from16 v21, v1

    .line 127
    .line 128
    goto :goto_a

    .line 129
    :cond_a
    move/from16 v21, p13

    .line 130
    .line 131
    :goto_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    new-instance v3, La/zqc0;

    .line 141
    .line 142
    invoke-direct/range {v3 .. v21}, La/zqc0;-><init>(ZZLa/mdm;Ljava/util/List;La/vrc0;La/src0;Ljava/lang/String;IIILjava/lang/String;ZJDLa/esr;Z)V

    .line 143
    .line 144
    .line 145
    return-object v3
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
    instance-of v0, p1, La/zqc0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/zqc0;

    .line 12
    .line 13
    iget-boolean v0, p0, La/zqc0;->a:Z

    .line 14
    .line 15
    iget-boolean v1, p1, La/zqc0;->a:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-boolean v0, p0, La/zqc0;->b:Z

    .line 22
    .line 23
    iget-boolean v1, p1, La/zqc0;->b:Z

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_3
    iget-object v0, p0, La/zqc0;->c:La/mdm;

    .line 30
    .line 31
    iget-object v1, p1, La/zqc0;->c:La/mdm;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_4
    iget-object v0, p0, La/zqc0;->d:Ljava/util/List;

    .line 42
    .line 43
    iget-object v1, p1, La/zqc0;->d:Ljava/util/List;

    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_5
    iget-object v0, p0, La/zqc0;->e:La/vrc0;

    .line 54
    .line 55
    iget-object v1, p1, La/zqc0;->e:La/vrc0;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_6

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    iget-object v0, p0, La/zqc0;->f:La/src0;

    .line 65
    .line 66
    iget-object v1, p1, La/zqc0;->f:La/src0;

    .line 67
    .line 68
    if-eq v0, v1, :cond_7

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_7
    iget-object v0, p0, La/zqc0;->g:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v1, p1, La/zqc0;->g:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_8

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_8
    iget v0, p0, La/zqc0;->h:I

    .line 83
    .line 84
    iget v1, p1, La/zqc0;->h:I

    .line 85
    .line 86
    if-eq v0, v1, :cond_9

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_9
    iget v0, p0, La/zqc0;->i:I

    .line 90
    .line 91
    iget v1, p1, La/zqc0;->i:I

    .line 92
    .line 93
    if-eq v0, v1, :cond_a

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_a
    iget v0, p0, La/zqc0;->j:I

    .line 97
    .line 98
    iget v1, p1, La/zqc0;->j:I

    .line 99
    .line 100
    if-eq v0, v1, :cond_b

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_b
    iget-object v0, p0, La/zqc0;->k:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v1, p1, La/zqc0;->k:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_c

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_c
    iget-boolean v0, p0, La/zqc0;->l:Z

    .line 115
    .line 116
    iget-boolean v1, p1, La/zqc0;->l:Z

    .line 117
    .line 118
    if-eq v0, v1, :cond_d

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_d
    iget-wide v0, p0, La/zqc0;->m:J

    .line 122
    .line 123
    iget-wide v2, p1, La/zqc0;->m:J

    .line 124
    .line 125
    cmp-long v0, v0, v2

    .line 126
    .line 127
    if-eqz v0, :cond_e

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_e
    iget-wide v0, p0, La/zqc0;->n:D

    .line 131
    .line 132
    iget-wide v2, p1, La/zqc0;->n:D

    .line 133
    .line 134
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_f

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_f
    iget-object v0, p0, La/zqc0;->o:La/esr;

    .line 142
    .line 143
    iget-object v1, p1, La/zqc0;->o:La/esr;

    .line 144
    .line 145
    if-eq v0, v1, :cond_10

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_10
    iget-boolean p0, p0, La/zqc0;->p:Z

    .line 149
    .line 150
    iget-boolean p1, p1, La/zqc0;->p:Z

    .line 151
    .line 152
    if-eq p0, p1, :cond_11

    .line 153
    .line 154
    :goto_0
    const/4 p0, 0x0

    .line 155
    return p0

    .line 156
    :cond_11
    :goto_1
    const/4 p0, 0x1

    .line 157
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, La/zqc0;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v2, p0, La/zqc0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/zqc0;->c:La/mdm;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/zqc0;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/zqc0;->e:La/vrc0;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-object v0, p0, La/zqc0;->f:La/src0;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v2

    .line 43
    mul-int/2addr v0, v1

    .line 44
    iget-object v2, p0, La/zqc0;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget v2, p0, La/zqc0;->h:I

    .line 51
    .line 52
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget v2, p0, La/zqc0;->i:I

    .line 57
    .line 58
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget v2, p0, La/zqc0;->j:I

    .line 63
    .line 64
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v2, p0, La/zqc0;->k:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-boolean v2, p0, La/zqc0;->l:Z

    .line 75
    .line 76
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-wide v2, p0, La/zqc0;->m:J

    .line 81
    .line 82
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-wide v2, p0, La/zqc0;->n:D

    .line 87
    .line 88
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget-object v2, p0, La/zqc0;->o:La/esr;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    add-int/2addr v2, v0

    .line 99
    mul-int/2addr v2, v1

    .line 100
    iget-boolean p0, p0, La/zqc0;->p:Z

    .line 101
    .line 102
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    add-int/2addr p0, v2

    .line 107
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", showError="

    .line 2
    .line 3
    const-string v1, ", errorConfig="

    .line 4
    .line 5
    const-string v2, "PromoShopDetailState(showLoading="

    .line 6
    .line 7
    iget-boolean v3, p0, La/zqc0;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/zqc0;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/zqc0;->c:La/mdm;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", relatedPromoItems="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/zqc0;->d:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", promoItem="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/zqc0;->e:La/vrc0;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", promoCategory="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/zqc0;->f:La/src0;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", categoryName="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", promoPrice="

    .line 56
    .line 57
    const-string v2, ", gamesCount="

    .line 58
    .line 59
    iget v3, p0, La/zqc0;->h:I

    .line 60
    .line 61
    iget-object v4, p0, La/zqc0;->g:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v3, v4, v1, v2, v0}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 64
    .line 65
    .line 66
    const-string v1, ", promoBalance="

    .line 67
    .line 68
    const-string v2, ", analyticsParamName="

    .line 69
    .line 70
    iget v3, p0, La/zqc0;->i:I

    .line 71
    .line 72
    iget v4, p0, La/zqc0;->j:I

    .line 73
    .line 74
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 75
    .line 76
    .line 77
    const-string v1, ", newPromoShopServiceEnabled="

    .line 78
    .line 79
    const-string v2, ", gameId="

    .line 80
    .line 81
    iget-object v3, p0, La/zqc0;->k:Ljava/lang/String;

    .line 82
    .line 83
    iget-boolean v4, p0, La/zqc0;->l:Z

    .line 84
    .line 85
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 86
    .line 87
    .line 88
    iget-wide v1, p0, La/zqc0;->m:J

    .line 89
    .line 90
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", freeBetSumEur="

    .line 94
    .line 95
    const-string v2, ", gameBonusType="

    .line 96
    .line 97
    iget-wide v3, p0, La/zqc0;->n:D

    .line 98
    .line 99
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object v1, p0, La/zqc0;->o:La/esr;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v1, ", forceIFrame="

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget-boolean p0, p0, La/zqc0;->p:Z

    .line 113
    .line 114
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string p0, ")"

    .line 118
    .line 119
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    return-object p0
.end method
